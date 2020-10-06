import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n: Int = scanner.nextInt()
    val num = arrayListOf<Int>()
    val smallestElement = num.min()
    repeat(n) {
        num.add(scanner.nextInt())
    }

    println(smallestElement)

}