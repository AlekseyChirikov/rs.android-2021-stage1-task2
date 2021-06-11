package subtask3

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import kotlin.reflect.KClass

class Blocks {

    // TODO: Complete the following function
    fun getData(blockA: Array<*>, blockB: KClass<*>): Any {
        when (blockB) {
            Int::class -> return sum(blockA)
            String::class -> return concatString(blockA)
            LocalDate::class -> return getLastDate(blockA)
            else -> return ""
        }
    }

    fun sum(blockA: Array<*>): Int {
        var sum = 0
        for (elem in blockA) {
            if (elem is Int) {
                sum += elem
            }
        }
        return sum
    }

    fun concatString (blockA: Array<*>): String {
        var str = ""
        for (elem in blockA) {
            if (elem is String) {
                str += elem
            }
        }
        return str
    }

    fun getLastDate (blockA: Array<*>): String {
        var date = LocalDate.MIN
        for (elem in blockA) {
            if (elem is LocalDate) {
                if (date.isBefore(elem)) {
                    date = elem
                }
            }
        }
        return date.format(DateTimeFormatter.ofPattern("dd.MM.uuuu"))
    }
}
