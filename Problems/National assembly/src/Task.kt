import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val num = scanner.nextInt()
    val res1 : Double = Math.cbrt(num.toDouble())
    val res2 : Int = res1.toInt()
    println(res2)
}