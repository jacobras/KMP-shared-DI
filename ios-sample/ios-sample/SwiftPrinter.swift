//
//  WrappingPrinter.swift
//  ios-sample
//
//  Created by Jacob on 21.07.2023.
//

import Foundation
import shared

class SwiftPrinter {
    private let sharedPrinter: SharedPrinter

    init(printer: SharedPrinter) {
        sharedPrinter = printer
    }

    func print() -> String {
        return "Swift printer. " + sharedPrinter.print()
    }
}
