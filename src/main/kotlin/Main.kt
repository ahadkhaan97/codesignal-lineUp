fun main() {
    print(solution("LLARL"))
}

fun solution(commands: String): Int {
    var res = 0
    var a = 0
    var b = 0
    for (c in commands) {
        when (c) {
            'A' -> {
                a += 2
                b += 2
            }
            'L' -> {
                a += 1
                b -= 1
                b += 4
            }
            else -> {
                a -= 1
                b += 1
                a += 4
            }
        }
        a %= 4
        b %= 4
        if (a == b) {
            ++res
        }
    }
    return res
}
