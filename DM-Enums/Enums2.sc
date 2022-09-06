//> using scala "3"

// run this code with this command:
//     $ scala-cli Enums2.sc


enum CrustSize:
   case Small, Medium, Large

enum CrustType:
   case Thin, Thick, Regular

enum Topping:
   case Cheese, Pepperoni, Mushrooms, GreenPeppers, Olives


import CrustSize.*
import CrustType.*
import Topping.*

val currentCrustSize = Large


if
    currentCrustSize == Small
then
    println("Small!")
else
    println("Something else")


currentCrustSize match
    case Small => println("small")
    case Medium => println("medium")
    case Large => println("large")


import scala.collection.mutable.ArrayBuffer
class Pizza(
    var crustSize: CrustSize,
    var crustType: CrustType,
    val toppings: ArrayBuffer[Topping]
)





