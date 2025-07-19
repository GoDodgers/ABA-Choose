package com.example.abachoose.domain

import androidx.window.core.layout.WindowHeightSizeClass
import androidx.window.core.layout.WindowSizeClass
import androidx.window.core.layout.WindowWidthSizeClass

data class Test(
    var name: String,
    var displayName: String,
    var questions: List<Question>,
    var totalScore: Int
)


data class Question(
    val name: String,
    val question: String,
    val option1Name: String,
    val option1ImgSrc: Int,
    val option2Name: String,
    val option2ImgSrc: Int,
    val answer: String,
    var score: Int,
    var answered: Boolean,
    var answeredCorrectly: Boolean?
)

enum class ScreenConfig {
    MOBILE_PORTRAIT,
    MOBILE_LANDSCAPE,
    DESKTOP_TABLET;

    companion object {
        fun configureScreenSize(wsc: WindowSizeClass): ScreenConfig {
            val windowWidth = wsc.windowWidthSizeClass
            val windowHeight = wsc.windowHeightSizeClass

            return when {

                windowWidth == WindowWidthSizeClass.COMPACT && windowHeight == WindowHeightSizeClass.MEDIUM -> {
                    MOBILE_PORTRAIT
                }

                windowWidth == WindowWidthSizeClass.COMPACT && windowHeight == WindowHeightSizeClass.EXPANDED -> {
                    MOBILE_PORTRAIT
                }

                windowWidth == WindowWidthSizeClass.EXPANDED && windowHeight == WindowHeightSizeClass.COMPACT -> {
                    MOBILE_LANDSCAPE
                }

                else -> DESKTOP_TABLET
            }
        }
    }
}
