@file:JvmName("Main")

import com.example.SharedPrinter
import com.example.sharedModule
import org.koin.core.context.startKoin
import org.koin.java.KoinJavaComponent.get

fun main(args: Array<String>) {
    startKoin {
        modules(sharedModule)
    }

    val sharedPrinter = get<SharedPrinter>(SharedPrinter::class.java)
    print("Test: ${sharedPrinter.print()}")
}