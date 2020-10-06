import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val cups = scanner.nextInt()
    val day = scanner.nextBoolean()
    day == cups >= 15 && cups <= 25
    val successful = (cups >= 10 && cups <= 15 )
    print (successful)



}