import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

internal val desktopModule = module {
    singleOf(::DesktopPrinter)
}