import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val ch1 = scanner.next().first()
    val ch2 = scanner.next().first()
    val ch3 = scanner.next().first()
    val ch4 = scanner.next().first()
    val dig1 = ch1.isDigit()
    val dig2 = ch2.isDigit()
    val dig3 = ch3.isDigit()
    val dig4 = ch4.isDigit()
    print(dig1)
    print('\\')
    print(dig2)
    print('\\')
    print(dig3)
    print('\\')
    print(dig4)
}