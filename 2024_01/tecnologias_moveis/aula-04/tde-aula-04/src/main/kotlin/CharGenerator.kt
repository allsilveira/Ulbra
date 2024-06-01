/*
 1 - Crie uma classe "CharGenerator" que receba no seu construtor primário (primary constructor),
 um valor min e um max e tenha um método onde gere um novo caracter.
*/

import kotlin.random.Random

class CharGenerator (private val min: Char, private val max: Char) {
    fun generate(): Char
    {
        return (Random.nextInt(this.min.code, this.max.code +1).toChar())
    }


}