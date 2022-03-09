import java.lang.Math.*
import kotlin.system.exitProcess

fun main() {
    var perimeter = readln().toInt()
    var vNum = readln().toInt()

    var dist = IntArray(vNum) {
        var v = readln().toInt()
        if (perimeter < v) {
            println("cant be more than Perimeter: ${perimeter}")
            exitProcess(1)
        }
        v
    }

    var diff = IntArray(vNum)
    diff[0] = dist[0] + perimeter - dist[vNum-1]

    for (i in 1 until vNum)
        diff[i] = abs(dist[i] - dist[i - 1])

    var result = perimeter - (diff.maxOrNull() ?: 0)
    println(result)
}