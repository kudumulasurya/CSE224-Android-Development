fun main() {
    val numbers = arrayOf(1, 2, 3, 4, 5)
    val words: Array<String> = arrayOf("Kotlin", "Java", "Python")
    //lambda expression,array of squares of numbers
    val squares = Array(5) { i -> i * i }
    var firstNumber = numbers[0]
    var secondWord = words[1]
    var thirdSquare = squares[3]
    numbers[2] = 30
    println(numbers)
    println(words)
    println(squares)
    println(firstNumber)
    println(secondWord)
    println(thirdSquare)
    println(numbers[2])

    //printing the array using for loop
    for (i in numbers) {
        print(i)
    }

    // printing the array using forEach loop
    println()

    words.forEach {
        word -> println(word)
    }

    words.forEach {
        println(it)
    }

    //size
    val size = numbers.size
    println(size)

    //isEmpty
    if (numbers.isEmpty()) {
        println("Array is empty")
    } else {
        println("Array is not empty")
    }

    //first and last element
    println(numbers.first())
    println(numbers.last())
}

