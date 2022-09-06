//> using scala "3"

// run this code with this command:
//     $ scala-cli CompanionObjects.scala


class Person(var name: String)
object Person


// companion class
class Pizza (var crustType: String):
    override def toString = s"Crust type is $crustType"

// companion object
object Pizza:
    // two fields
    val CRUST_TYPE_THIN = "THIN"
    val CRUST_TYPE_THICK = "THICK"
    
    // one method
    def calculatePrice(p: Pizza): Double = 
        // put a fancy pizza-pricing algorithm here
        0.0

@main def pizzaTest =
    val p = Pizza(Pizza.CRUST_TYPE_THICK)
    println(p)
    println(Pizza.calculatePrice(p))




