/*
2 - Crie uma classe pessoa que tenha um construtor primário que recebe nome e idade como parâmetro, além disso,
é necessário ter um método caminhar e falar. Obs: Os métodos caminhar e falar devem apenas printar
"caminhando" e "falando"
 */

class Person (private val name: String, private val age: Int) {
    fun walk() {
        println("${this.name} está caminhando")
    }

    fun speak() {
        println("${this.name} está falando")
    }
}