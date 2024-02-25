package com.vproject.stablediffusion.model

import com.vproject.stablediffusion.SharedRes
import dev.icerock.moko.resources.ImageResource

data class ImageToImageSample(
    val id: Int,
    val prompt: String,
    val stylePreset: StylePreset,
    val canvasPreset: CanvasPreset,
    val originalImageResource: ImageResource,
    val generatedImageResource: ImageResource
)

val imageToImageSampleList = listOf(
    ImageToImageSample(
        0,
        "masterpiece, details, autumn, leaf, pink trees, beautiful",
        StylePreset.ANIME,
        CanvasPreset.THREE_FOUR,
        SharedRes.images.img_iti_sample1_before,
        SharedRes.images.img_iti_sample1_after,
    ),
    ImageToImageSample(
        1,
        "masterpiece, details, beautiful, vampire, zombie",
        StylePreset.NEON_PUNK,
        CanvasPreset.THREE_FOUR,
        SharedRes.images.img_iti_sample2_before,
        SharedRes.images.img_iti_sample2_after,
    ),
    ImageToImageSample(
        5,
        "beautiful, masterpiece, old ancient, vietnamese",
        StylePreset.FANTASY_ART,
        CanvasPreset.THREE_FOUR,
        SharedRes.images.img_iti_sample6_before,
        SharedRes.images.img_iti_sample6_after,
    ),
    ImageToImageSample(
        2,
        "masterpiece, details, beautiful",
        StylePreset.FANTASY_ART,
        CanvasPreset.THREE_FOUR,
        SharedRes.images.img_iti_sample3_before,
        SharedRes.images.img_iti_sample3_after,
    ),
    ImageToImageSample(
        3,
        "masterpiece, details, beautiful",
        StylePreset.COMIC_BOOK,
        CanvasPreset.THREE_FOUR,
        SharedRes.images.img_iti_sample4_before,
        SharedRes.images.img_iti_sample4_after,
    ),
    ImageToImageSample(
        4,
        "neon hair, beautiful, masterpiece, details, necklace",
        StylePreset.ANIME,
        CanvasPreset.THREE_FOUR,
        SharedRes.images.img_iti_sample5_before,
        SharedRes.images.img_iti_sample5_after,
    ),
    ImageToImageSample(
        6,
        "colorize, masterpiece, detail, outstanding, 1guy",
        StylePreset.ANIME,
        CanvasPreset.THREE_FOUR,
        SharedRes.images.img_iti_sample7_before,
        SharedRes.images.img_iti_sample7_after,
    ),
    ImageToImageSample(
        7,
        "colorize, masterpiece, detail, outstanding, 1girl",
        StylePreset.ANIME,
        CanvasPreset.THREE_FOUR,
        SharedRes.images.img_iti_sample8_before,
        SharedRes.images.img_iti_sample8_after,
    ),
    ImageToImageSample(
        8,
        "colorize, masterpiece, detail, outstanding, 1dog, super angry, barking",
        StylePreset.PIXEL_ART,
        CanvasPreset.THREE_FOUR,
        SharedRes.images.img_iti_sample9_before,
        SharedRes.images.img_iti_sample9_after,
    ),
)