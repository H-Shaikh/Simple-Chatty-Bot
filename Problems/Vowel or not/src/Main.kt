import java.util.Scanner



 fun isVowel (a: Char): Boolean {
       val vowel =  a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u' ||
               a == 'A' || a == 'I' || a == 'O' || a == 'U' || a == 'E'
                    return vowel
     }
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val letter = scanner.next()[0]

    println(isVowel(letter))
}