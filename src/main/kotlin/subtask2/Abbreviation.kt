package subtask2

class Abbreviation {

    // TODO: Complete the following function
    fun abbreviationFromA(a: String, b: String): String {
        var index = 0
        for (char in a.indices) {
            if (a[char].equals(b[index], true)) {
                index++
                if (index == b.length ) return "YES"
            }
        }
        return "NO"
    }
}
