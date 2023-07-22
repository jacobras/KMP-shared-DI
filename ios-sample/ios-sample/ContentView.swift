//
//  ContentView.swift
//  ios-sample
//
//  Created by Jacob on 18.07.2023.
//

import SwiftUI
import shared
import Swinject

struct ContentView: View {
    let container = Container()
    let assembler: Assembler
    
    init() {
        // Include the shared Kotlin dependencies into the Swinject container
        assembler = Assembler([
            SharedAssembly()
        ], container: container)
        
        // Include our Swift printer, which uses a dependency from the shared Kotlin module
        container.register(SwiftPrinter.self) { resolver in SwiftPrinter(
            printer: resolver.resolve(SharedPrinter.self)!
        )}
    }
    
    var body: some View {
        // Fetch the Swift printer from the container
        let printer = container.resolve(SwiftPrinter.self)!
        
        VStack {
            Image(systemName: "globe")
                .imageScale(.large)
                .foregroundColor(.accentColor)
            Text(printer.print())
        }
        .padding()
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
