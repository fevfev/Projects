package com.androidlesson.calculator

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performTextInput
import androidx.compose.ui.test.performClick
import com.androidlesson.calculator.ui.theme.CalculatorTheme
import org.junit.Rule
import org.junit.Test

class CalculatorTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun additionOfTwoPositiveNumbers() {
        composeTestRule.setContent {
            CalculatorTheme {
                Calculator()
            }
        }

        composeTestRule.onNodeWithText("Число 1").performTextInput("5")
        composeTestRule.onNodeWithText("Число 2").performTextInput("3")
        composeTestRule.onNodeWithText("выполнить").performClick()
        composeTestRule.onNodeWithText("Результат выражения: 8").assertExists()
    }

    @Test
    fun additionOfPositiveAndNegativeNumber() {
        composeTestRule.setContent {
            CalculatorTheme {
                Calculator()
            }
        }

        composeTestRule.onNodeWithText("Число 1").performTextInput("5")
        composeTestRule.onNodeWithText("Число 2").performTextInput("-3")
        composeTestRule.onNodeWithText("выполнить").performClick()
        composeTestRule.onNodeWithText("Результат выражения: 2").assertExists()
    }

    @Test
    fun additionOfTwoNegativeNumbers() {
        composeTestRule.setContent {
            CalculatorTheme {
                Calculator()
            }
        }

        composeTestRule.onNodeWithText("Число 1").performTextInput("-5")
        composeTestRule.onNodeWithText("Число 2").performTextInput("-3")
        composeTestRule.onNodeWithText("выполнить").performClick()
        composeTestRule.onNodeWithText("Результат выражения: -8").assertExists()
    }

    @Test
    fun additionWithEmptyInput() {
        composeTestRule.setContent {
            CalculatorTheme {
                Calculator()
            }
        }

        composeTestRule.onNodeWithText("Число 1").performTextInput("")
        composeTestRule.onNodeWithText("Число 2").performTextInput("3")
        composeTestRule.onNodeWithText("выполнить").performClick()
        composeTestRule.onNodeWithText("Результат выражения: 3").assertExists()
    }

    @Test
    fun additionWithNonNumericInput() {
        composeTestRule.setContent {
            CalculatorTheme {
                Calculator()
            }
        }

        composeTestRule.onNodeWithText("Число 1").performTextInput("abc")
        composeTestRule.onNodeWithText("Число 2").performTextInput("3")
        composeTestRule.onNodeWithText("выполнить").performClick()
        composeTestRule.onNodeWithText("Результат выражения: 3").assertExists()
    }
}