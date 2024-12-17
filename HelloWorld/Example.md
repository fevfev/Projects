```kotlin
package com.knyazev.helloworld

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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.knyazev.helloworld.ui.theme.HelloWorldTheme

// MainActivity - основной класс активности, который наследуется от ComponentActivity
class MainActivity : ComponentActivity() {

    // Метод onCreate вызывается при создании активности
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge() // Включает режим отображения на весь экран
        setContent {
            // Устанавливает содержимое экрана с использованием Jetpack Compose
            HelloWorldTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    // Внутри Scaffold размещаем наш Composable-функцию HelloWorld
                    HelloWorld(
                        fio = "Иванов Иван",
                        subject = "Android",
                        group = "ИИ11",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

// Composable-функция HelloWorld, которая отображает текст
@Composable
fun HelloWorld(fio: String, subject: String, group: String, modifier: Modifier = Modifier) {
    Text(
        text = "Привет, я изучаю $subject \n меня зовут $fio \n группа $group",
        modifier = modifier
    )
}

// Функция Preview для предварительного просмотра Composable-функции в Android Studio
@Preview(showBackground = true)
@Composable
fun HelloWorldPreview() {
    HelloWorldTheme {
        HelloWorld(
            fio = "Иванов Иван",
            subject = "Android",
            group = "ИИ11",
            modifier = Modifier.padding(16.dp)
        )
    }
}
```