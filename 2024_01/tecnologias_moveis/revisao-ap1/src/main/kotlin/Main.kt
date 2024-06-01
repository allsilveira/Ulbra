fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    var name = "Alessandra"


    var number = 1;
    val number2 = number ?: 0




    fun String.myExtensionFunction(): String {
        return "my function $this"
    }

    fun String.addZero(): String {
        if (this.toInt() >= 0 && this.toInt() < 10) return "0$this"
        return this
    }
    val stringNumber1 = "9"
    val stringNumber2 = "10"
    println(stringNumber1.addZero())
    println(stringNumber2.addZero())


    val pessoa = Person("Alessandra", 21)
    val pessoa2 = Person("Ygor", "Evaldt")
    println(pessoa.name)
    println(pessoa.age)
    println(pessoa2.name)
    println(pessoa2.age)
    println(pessoa2.lastName)

    val alice = Dog("Alice", "Bigou")
    alice.speak()

}

fun bakeChocolateCake() {
    println("baking chocolate cake")
}

fun inlineBakeChocolateCake() = println("baking chocolate cake")

fun inlineBakeChocolateCakeWithReturn(): String = ""

fun showName(name: String) = println(name)

class Person (val name: String, val age: Int?) {
    var lastName: String? = null

    constructor(name: String, lastName: String) : this(name, null) {
        this.lastName = lastName;
    }
}

open class Animal (name: String)

interface ICallerAnimal {
    fun speak(): Unit
}

class Dog (name: String, type: String) : Animal(name), ICallerAnimal {
    init {
        if (type !== "labrador") println("Raça errada")
    }

    override fun speak() {
        println("Au au")
    }

}

fun operate( a: Int, b: Int, operation: (Int, Int) -> Int ): Int {
    return operation(a, b)
}




