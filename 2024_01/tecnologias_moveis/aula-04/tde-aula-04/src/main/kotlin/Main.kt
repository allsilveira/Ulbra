fun main(args: Array<String>) {
    println("Hello World!")

    // Exercicio 1
    val charGenerator = CharGenerator('a', 'f')
    val newChar: Char = charGenerator.generate();
    println("newChar -> ${newChar}")

    // Exercicio 2
    val alessandra = Person("Alessandra", 21)
    alessandra.walk()
    alessandra.speak()

    // Exercicio 3
    val result = Success()
    when(result) {
        is Success -> println("Result is Success")
    }

    // Exercicio 4
    val person = DataClassPerson("Alessandra", 21, "04435480050", "Gamer")
    val ygor = person.copy("Ygor", 27, "03919344065", "Futuro Dev C#")
    


}