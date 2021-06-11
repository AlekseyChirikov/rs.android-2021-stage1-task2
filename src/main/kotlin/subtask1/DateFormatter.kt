package subtask1


import java.text.DateFormat
import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

class DateFormatter {

    // TODO: Complete the following function
    fun toTextDay(day: String, month: String, year: String): String {
        Locale.setDefault(Locale("Ru"))
        try {
            val date = LocalDate.of(year.toInt(), month.toInt(), day.toInt())
            val formatter = DateTimeFormatter.ofPattern("dd MMMM, EEEE")
            return date.format(formatter)
        } catch (e: Exception) {
            return "Такого дня не существует"
        }
    }

}

