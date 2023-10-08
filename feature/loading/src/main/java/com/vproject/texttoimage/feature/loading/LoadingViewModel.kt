package com.vproject.texttoimage.feature.loading

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.vproject.texttoimage.core.domain.GenerateImageUseCase
import com.vproject.texttoimage.feature.loading.navigation.LoadingArgs
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import javax.inject.Inject

@HiltViewModel
class LoadingViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle,
    generateImageUseCase: GenerateImageUseCase,
) : ViewModel() {
    private val loadingArgs = LoadingArgs(savedStateHandle)

    val loadingUiState: StateFlow<LoadingUiState> =
        generateImageUseCase(loadingArgs.prompt, loadingArgs.styleId).map { imageUrl ->
            LoadingUiState.Generated(imageUrl, loadingArgs.prompt, loadingArgs.styleId)
        }.stateIn(
                scope = viewModelScope,
                started = SharingStarted.WhileSubscribed(5_000),
                initialValue = LoadingUiState.Generating
            )
}