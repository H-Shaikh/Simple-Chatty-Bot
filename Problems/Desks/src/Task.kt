import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val s1 = scanner.nextInt()
    val s2 = scanner.nextInt()
    val s3 = scanner.nextInt()
    val even1 = if (s1 % 2 == 0) { s1 / 2 } else { (s1 + 1) / 2 }
    val even2 = if (s2 % 2 == 0) { s2 / 2 } else { (s2 + 1) / 2 }
    val even3 = if (s3 % 2 == 0) { s3 / 2 } else { (s3 + 1) / 2 }
    println(even1 + even2 + even3)

}