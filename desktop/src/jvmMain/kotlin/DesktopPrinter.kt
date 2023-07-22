import com.example.SharedPrinter

class DesktopPrinter(
    private val sharedPrinter: SharedPrinter
) {
    fun print(): String {
        return "Desktop printer. ${sharedPrinter.print()}"
    }
}