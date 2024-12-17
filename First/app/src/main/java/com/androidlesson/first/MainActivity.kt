package com.androidlesson.first

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.androidlesson.first.ui.theme.FirstTheme

// Главная активность приложения
class MainActivity : ComponentActivity() {
    // Метод, вызываемый при создании активности
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Включение режима Edge-to-Edge
        enableEdgeToEdge()
        // Установка содержимого активности
        setContent {
            // Применение темы
            FirstTheme {
                // Использование Scaffold для создания базовой структуры экрана
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    // Вызов функции Greeting с передачей имени и отступов
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

// Компонент Compose, отображающий приветственное сообщение
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    // Текстовый элемент, отображающий приветствие
    Text(
        text = "Hello $name!",
        color = Color(0xFF5712FF),
        modifier = Modifier.padding(32.dp)
    )
}

// Предпросмотр компонента Greeting в Android Studio
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    // Применение темы
    FirstTheme {
        // Вызов функции Greeting с передачей имени
        Greeting("Android")
    }
}