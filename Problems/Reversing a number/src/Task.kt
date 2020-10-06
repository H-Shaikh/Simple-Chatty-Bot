import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()

    val num1 = n / 100
    val num2 = n % 100 / 10
    val num3 = n % 10

    val reverse = num3 * 100 + num2 * 10 + num1

    println(reverse)
}