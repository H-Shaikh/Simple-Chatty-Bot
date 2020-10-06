
import java.util.Scanner
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    val x = n / 100
    val y = n / 10 % 10
    val z = n % 10
        println(x + y + z)
    }
