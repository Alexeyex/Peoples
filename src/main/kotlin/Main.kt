import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val likes: String = sc.nextLine()
    val l = likes.split("")

    if ((l[l.size-2] == "1" && l[l.size-3] == "1")) {
        println("Понравилось $likes людям")
    } else if (l[l.size-2] == "1")  {
        println("Понравилось $likes человеку")
    } else println("Понравилось $likes людям")
}