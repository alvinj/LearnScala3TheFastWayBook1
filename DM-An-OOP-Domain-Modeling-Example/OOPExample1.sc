//> using scala "3"

// run this code with this command:
//     $ scala-cli OOPExample1.sc


enum Topping:
    case Cheese, Pepperoni, Sausage, Mushrooms, Onions

enum CrustSize:
    case Small, Medium, Large

enum CrustType:
    case Regular, Thin, Thick


import collection.mutable.ArrayBuffer

import Topping.*
import CrustSize.*
import CrustType.*

class Pizza(
    var crustSize: CrustSize = Medium,
    var crustType: CrustType = Regular,
    val toppings: ArrayBuffer[Topping]
):
    def addTopping(t: Topping): Unit = 
        toppings += t

    def addToppings(ts: Topping*): Unit =
        toppings.appendAll(ts)

    def removeAllToppings(): Unit =
        toppings.clear()

    override def toString = s"""
        |A $crustSize pizza with a $crustType crust.
        |Toppings: ${p.toppings.mkString(", ")}""".stripMargin

end Pizza


val p = Pizza(Medium, Regular, ArrayBuffer(Cheese))

p.crustSize = Large
p.crustType = Thin
println(p.toppings)

// but these methods DO NOT exist yet
p.addTopping(Pepperoni)
p.addToppings(Pepperoni, Mushrooms)
p.removeAllToppings()
println(p.toppings)





