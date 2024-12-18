![alt text](image-41.png)

Урок 1: Введение в Kotlin для Android разработки
 

# Основы Kotlin:

**1\. Переменные:**

  
 

*   **Var и Val:**
    *   var - переменная, значение которой можно менять.
    *   val - константа, значение которой нельзя изменить после объявления.

  
 

kotlin

```kotlin
var mutableNumber: Int = 10 

val constantNumber: Int = 20

val PI: Double = 3.14159
```

  
 

*   **Типы данных:**
    * Int 
    * Double
    * Float
    * Boolean
    * String
    * Char
    * List
    * Map
    * Set
    * и другие

kotlin

```kotlin
val integerValue: Int = 42 

val doubleValue: Double = 3.14159 

val stringValue: String = "Hello, Kotlin!"

val name: String = "Alice" 

val isActive: Boolean = true 

val numbers: List<Int> = listOf(1, 2, 3)
```
  
 **Операторы**

*   **Арифметические:**
    *   +, -, \*, /, %

  kotlin

```kotlin
val sum = number1 + 5 

val quotient = sum / 2

```
*   **Логические:**

    *   &&, ||, !

  
 

kotlin

```kotlin
val isEven = number1 % 2 == 0 

val condition = isActive && isEven

```


  *   **Операторы сравнения:**

    *   \==, !=, >, \<, >=, \<=

  
 

kotlin

```kotlin
if (number1 > number2) {
    // Код для выполнения }
```

**Управляющие конструкции**

*   **If-Else:**

  
 

kotlin

```kotlin
val max = if (a > b) a else b
```

  
 

*   **When (аналог switch в других языках):**

  
 

kotlin

```kotlin
when (x) {
    1 -> println("x == 1")
    2 -> println("x == 2")
    else -> println("x is neither 1 nor 2")
}
```

  
  *   **Циклы:**

  
 

kotlin

```kotlin
for (i in 1..5) {
    println(i)
}

var i = 1 while (i <= 5) {
    println(i)
    i++
}
```
**Control Flow**

*   **Контрольные конструкции:**
    *   **When:** Больше возможностей, чем в switch/case других языков.

  
 

kotlin

```plaintext
val result = when (x) {
    0 -> "zero"     in 1..10 -> "small number"     !in 10..100 -> "big number"     else -> "unknown" }
```

  
 

*   **For:** Используется для перебора коллекций:

  
 

kotlin

```plaintext
val fruits = listOf("apple", "banana", "kiwi")
for (fruit in fruits) {
    println(fruit)
}
```

  
 

*   **While и Do-While:**

  
 

kotlin

```plaintext
var i = 0 while (i < 5) {
    println(i++)
}

do {
    println("Executed at least once")
} while (i < 0)
```


   
 Массивы

*   **Создание массивов:**

  
 

kotlin

```kotlin
val intArray = intArrayOf(1, 2, 3)
val stringArray = arrayOf("a", "b", "c")
```

  
 

*   **Обращение к элементам:**

  
 

kotlin

```kotlin
println(intArray[0]) // 1
```

  
 

*   **Изменение массивов:**

  
 

kotlin

```kotlin
intArray[0] = 10
```

  
 

Хранение данных

*   **Data Classes:** Специальный тип классов для хранения данных.

  
 

kotlin

```kotlin
data class Person(val name: String, val age: Int)
val person = Person("John", 30)
println(person) // Вывод: Person(name=John, age=30)
```
Коллекции

*   **List:** Упорядоченная коллекция элементов, может содержать дубликаты.

  
 

kotlin

```plaintext
val numbers = listOf(1, 2, 3, 3)
val mutableNumbers = mutableListOf(1, 2, 3)
mutableNumbers.add(4)
```

  
 

*   **Set:** Коллекция уникальных элементов:

  
 

kotlin

```plaintext
val uniqueNumbers = setOf(1, 2, 3, 3) // Set(1, 2, 3) val mutableSet = mutableSetOf(1, 2, 3)
mutableSet.add(4)
```

  
 

*   **Map:** Коллекция пар ключ-значение:

  
 

kotlin

```plaintext
val map = mapOf("key1" to "value1", "key2" to "value2")
val mutableMap = mutableMapOf("key1" to "value1")
mutableMap["key2"] = "value2"
```

**Функции:**

  
 

**Определение функции:**

  
 

kotlin

```kotlin
fun convertUSDToEUR(usd: Double): Double {
    return usd * 0.85 // Пример изменения курса валют}

// С использованием выражения fun convertEURToUSD(eur: Double) = eur / 0.85
```


**Функции с параметрами по умолчанию:**

  
 

kotlin

```kotlin
fun calculateArea(width: Double = 1.0, height: Double = 1.0): Double {
    return width * height
}
```

 **Функции высшего порядка:** 

Функции, которые могут принимать другие функции как параметры или возвращать функции.

  
 

kotlin

```kotlin
fun operation(x: Int, y: Int, op: (Int, Int) -> Int): Int {
    return op(x, y)
}

val result = operation(2, 3) { a, b -> a + b }
```

*   **Функции, генерируемые автоматически:**
    *   equals()
    *   hashCode()
    *   toString()
    *   copy()
    *   componentN() для деструктуризации

  
 

kotlin

```kotlin
val (name, age) = person // Деструктуризация println("Name: $name, Age: $age")
```

**Лямбда-выражения:**

  
 

kotlin

```kotlin
val sum = { x: Int, y: Int -> x + y }
println(sum(1, 2)) // Output: 3
```

**Инлайн функции:** Используются для оптимизации, так как компилятор встраивает тело функции в точку вызова:

  
 

kotlin

```kotlin
inline fun inlineExample(block: () -> Unit) {
    block()
}
```


**Классы и Объекты**

*   **Определение класса:**

  
 

kotlin

```kotlin
class Calculator {
    fun add(a: Int, b: Int) = a + b
    fun subtract(a: Int, b: Int) = a - b
}
```

  
 

*   **Создание объекта:**

  
 

kotlin

```kotlin
val calculator = Calculator()
val result = calculator.add(5, 3)
```

  
 

*   **Конструкторы и свойства:**

  
 

kotlin

```kotlin
class Person(val name: String, var age: Int) {
    fun introduce() {
        println("My name is $name and I'm $age years old.")
    }
}

val person = Person("Bob", 30)
person.introduce()
```

  
 
**Взаимодействие классов**

*   **Наследование:**

  
 

kotlin

```plaintext
open class Animal(val name: String)
class Dog(name: String) : Animal(name) {
    fun bark() = println("Woof")
}
val dog = Dog("Rex")
dog.bark() // Woof
```

  
 *   **Интерфейсы:**

  
 

kotlin

```plaintext
interface Flyable {
    fun fly() }

class Bird(val name: String) : Flyable {
    override fun fly() = println("$name is flying")
}
```

  