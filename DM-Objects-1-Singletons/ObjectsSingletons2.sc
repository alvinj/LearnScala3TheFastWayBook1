//> using scala "3"

// run this code with this command:
//     $ scala-cli ObjectsSingletons2.sc


object CashRegister:

    // two private counters that cannot be accessed directly
    private var numOpens = 0
    private var numCloses = 0

    // two methods related to physically opening and closing
    // the register drawer
    def open() =
        // in the real world, here you would do whatever
        // is needed to open the register drawer
        numOpens += 1
    def close() =
        // assume that you got a signal here that the register
        // drawer was closed
        numCloses += 1

    // "getter" methods for the private variables
    def getNumberOfOpens = numOpens
    def getNumberOfCloses = numCloses

end CashRegister

CashRegister.open()
CashRegister.close()
println(CashRegister.getNumberOfOpens)
println(CashRegister.getNumberOfCloses)



// UTILITY CLASSES

object StringUtils:

    // return true if the string is null or empty
    def isNullOrEmpty(s: String): Boolean = 
        if s==null || s.trim.equals("") then true else false

    // convert "big belly burger" to "Big Belly Burger"
    def capitalizeAllWords(s: String): String = 
        s.split(" ")
         .map(_.capitalize)
         .mkString(" ")

end StringUtils


println(StringUtils.isNullOrEmpty(""))
println(StringUtils.capitalizeAllWords("big belly burger"))

import StringUtils.*

println(isNullOrEmpty(""))
println(capitalizeAllWords("big belly burger"))











