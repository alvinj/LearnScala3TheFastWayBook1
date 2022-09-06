//> using scala "3"

// run this code with this command:
//     $ scala-cli ObjectsSingletons1.scala

object CashRegister:
    def open() = println("opened")
    def close() = println("closed")

@main def objectTest = 
    CashRegister.open()
    CashRegister.close()


