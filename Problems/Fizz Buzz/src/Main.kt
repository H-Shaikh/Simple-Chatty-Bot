import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n1 = scanner.nextInt()
    val n2 = scanner.nextInt()

    for (i in n1..n2) {
        if(i % 15 == 0 )
        {
             println("FizzBuzz") 
             }
       else if(i % 5 == 0)
        {
             println ("Buzz") 
             }
        else if(i % 3 == 0)
        {
              println ("Fizz") 
              }
        else  if( i % 3 != 0 && i % 5 != 0)
        {
             println(i) 
             }

    }
}
