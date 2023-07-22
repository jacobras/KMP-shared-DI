import com.example.SharedPrinter

internal class DesktopPrinter(
    private val sharedPrinter: SharedPrinter
) {
    fun print(): String {
        return "Desktop printer. ${sharedPrinter.print()}"
    }
}