package com.example.abachoose.domain

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter

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
