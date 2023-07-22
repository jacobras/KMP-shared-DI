//
//  AssemblyTest.swift
//  ios-sample
//
//  Created by Jacob on 21.07.2023.
//

import Foundation
import Swinject
import shared

final class SharedAssembly : Assembly {
    private let sharedDi = SharedDi()
    
    func assemble(container: Swinject.Container) {
        container.register(SharedPrinter.self) { _ in  self.sharedDi.sharedPrinter()}
    }
}
