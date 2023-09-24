package com.vproject.brushai.core.data.repository.style

import com.vproject.brushai.core.model.data.Style
import kotlinx.coroutines.flow.Flow

interface StyleRepository {
    /**
     * Gets the available styles as a stream
     */
    fun getStyles(): Flow<List<Style>>

    /**
     * Gets data for a specific style
     */
    fun getStyle(id: String): Flow<Style>
}