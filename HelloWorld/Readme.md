
![HelloWorld](image/HelloWorld.jpg)

## Hello World 

<details>
  <summary>Пример стартового приложения</summary>

```kotlin

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
import com.knyazev.helloworld.ui.theme.HelloWorldTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HelloWorldTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    HelloWorldTheme {
        Greeting("Android")
    }
}
```
</details>

## **Теория**

**MainActivity**: Основной класс активности, который наследуется от ComponentActivity. В методе onCreate устанавливается содержимое экрана с использованием Jetpack Compose.  

  
**enableEdgeToEdge**(): Включает режим отображения на весь экран, убирая системные панели.  

  
**setContent**: Устанавливает содержимое экрана с использованием Jetpack Compose.  

  
**HelloWorldTheme**: Тема приложения, которая оборачивает содержимое для применения стилей.  

  
**Scaffold**: Контейнер для базовой структуры экрана, который может содержать такие элементы, как AppBar, BottomBar и т.д.  

  
`**Greeting**`: Composable-функция, которая принимает параметры `$name` и отображает текст дополненные значениями.  Может просто выводить текст, дез модификаций.


**Text**: Composable-функция, которая отображает текст на экране.

**Preview**: Аннотация для функции, которая позволяет предварительно просмотреть Composable-функцию на экране Preview в Android Studio.  

  
**Modifier**: Используется для изменения или добавления стилей к Composable-функциям, таких как padding и fillMaxSize.



## **Задание**

![alt text](<image/Example.png>)

**HW1**: Модифицировать программу HelloWorld добавив функцию вызывающую вывод текста

**Out:** “Привет, я изучаю Android меня зовут Иванов Иван группа ИИ11” <details>
    <summary>Пример в эмуляторе</summary>
![alt text](<image/Emulator.png>)
</details>

<details>
 <summary>Пример реализации</summary>
**Пример вызова функции:**


```kotlin
// MainActivity - основной класс активности, который наследуется от ComponentActivity
class MainActivity : ComponentActivity() {

    // Метод onCreate вызывается при создании активности
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge() // Включает режим отображения на весь экран
        setContent {
            // Устанавливает содержимое экрана с использованием Jetpack Compose
            HelloWorldTheme { //оборачивам элементы в тему, для применения оформления
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
 

@Preview(showBackground = true)
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


**Пример функции:**

```kotlin
// Composable-функция HelloWorld, которая отображает измененный текст
 с вывод фио $subject  $fio  $group, прописываем в вызове функции

@Composable
fun HelloWorld(fio: String, subject: String, group: String, modifier: Modifier = Modifier) {
    Text(
        text = "Привет, я изучаю $subject \n меня зовут $fio \n группа $group", // "\n" для вывода с новой строки 
        modifier = modifier
    )
}
```
</details>

## Папка Image в корневом каталоге содержит изображение готового вариианта и дополнительные изображения для иконки и экрана загрузки. Так же там распооложен HelloWorld.apk c готовым примером приложения.

![Image](image/Image.png)

