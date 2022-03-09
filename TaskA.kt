fun main() {
    var cnt = readln()

    for (i in 0 until cnt.toInt()) {
        var str = readln()
        var result = str.replace("${str[0]}", "")
        var first = false

        if (result.length == 2) {
            result = result.replace("${result[0]}", "")
            first = true
        }

        if (result.isEmpty() && first)
            println("Yes")
        else
            println("No")

    }
}