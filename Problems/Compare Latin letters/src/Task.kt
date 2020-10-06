
import java.util.*

fun main() {
    val scanner     = Scanner(System.`in`)
    val ch    = scanner.next().first()

    if (ch.isUpperCase()) { ch.toString()} else {ch.toUpperCase().toString()}

  println( ch == ch)

}
