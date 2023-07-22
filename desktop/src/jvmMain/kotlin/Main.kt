@file:JvmName("Main")

import com.example.sharedModule
import org.koin.core.context.startKoin
import org.koin.java.KoinJavaComponent.get

fun main(args: Array<String>) {
    startKoin {
        modules(sharedModule, desktopModule)
    }

    val desktopPrinter = get<DesktopPrinter>(DesktopPrinter::class.java)
    print("Test: ${desktopPrinter.print()}")
}