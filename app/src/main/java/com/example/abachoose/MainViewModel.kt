package com.example.abachoose

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.example.abachoose.domain.Test
import com.example.abachoose.domain.makeAbTest
import com.example.abachoose.domain.makeColorTest
import com.example.abachoose.domain.makeLetterAssociationTest
import com.example.abachoose.domain.makeWordAssociationTest


class MainViewModel {
    // tests
    var abTest = makeAbTest()
    var colorTest = makeColorTest()
    var letterAssociationTest = makeLetterAssociationTest()
    var wordAssociationTest = makeWordAssociationTest()

    val allTests: List<Test> = listOf(abTest, colorTest, letterAssociationTest, wordAssociationTest)
    val history: MutableList<Test> = mutableListOf()

    var currentTest: Test by mutableStateOf(Test("foo", "foo", listOf(), 0))

    // track clicked img
    var imgAClicked by mutableStateOf(false)
    var imgBClicked by mutableStateOf(false)

    // used to check user answer
    var selectedA by mutableStateOf("")
    var selectedB by mutableStateOf("")

    // random img position
    private var randomRoll = (1..10).random() <= 5
    var imgAPos = if (randomRoll) { 0 } else { 1 }
    var imgBPos = if (randomRoll) { 1 } else { 0 }

    var currentQuestionIndex by mutableIntStateOf(0)
        private set

    fun decreaseCurrentQuestionIndex() {
        if (currentQuestionIndex == 0) {
            currentQuestionIndex = 0
        } else {
            currentQuestionIndex -= 1
        }
    }

    fun increaseCurrentQuestionIndex() {
        if ((currentQuestionIndex + 1) == currentTest.questions.size) {
            currentQuestionIndex = currentTest.questions.size - 1
        } else {
            currentQuestionIndex += 1
        }
    }

    fun getQuestionStatus(i: Int = currentQuestionIndex): Boolean {
        if (currentTest.questions.isEmpty()) {
            return false
        }
        return selectedA == currentTest.questions[i].answer || selectedB == currentTest.questions[i].answer
    }

    var isAnimatedDialogDisplayed: Boolean by mutableStateOf(false)
        private set

    fun setIsAnimatedDialogDisplayed(bool: Boolean) {
        isAnimatedDialogDisplayed = bool
    }

    fun clear() {
        imgAClicked = false
        imgBClicked = false
        selectedA = ""
        selectedB = ""

        // if final quesiton answered
        if (currentTest.questions.last().answered) {
            // make new dummy test, reset index
            currentTest = Test("foo", "foo", listOf(), 0)
            isAnimatedDialogDisplayed = false
            currentQuestionIndex = 0
        }

        // ask cris about this
        randomRoll = (1..10).random() <= 5
        imgAPos = if (randomRoll) { 0 } else { 1 }
        imgBPos = if (randomRoll) { 1 } else { 0 }
    }
}
