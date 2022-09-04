//> using scala "3"

// run this code with this command:
//     $ scala-cli CollsMap.sc


// you get an immutable Map by default
val peeps = Map(
    "first_name" -> "Alvin",
    "last_name" -> "Alexander"
)


// Creating a mutable Map
import scala.collection.mutable.Map

val states = scala.collection.mutable.Map(
    "AL" -> "Alabama",
    "AK" -> "Alaska"
)


// Accessing elements
println(states("AL"))   // prints "Alabama"
println(states("AK"))   // prints "Alaska"


// Creating an empty Map
val a = scala.collection.mutable.Map[Int, String]()


// If Maps are difficult ...
{
val letters = List("a", "b", "c")
letters(0)    // "a"
letters(1)    // "b"
letters(2)    // "c"
}

{
val letters = scala.collection.mutable.Map(
    0 -> "a",
    1 -> "b",
    2 -> "c",
)
letters(0)    // "a"
letters(1)    // "b"
letters(2)    // "c"
}

{
val letters = scala.collection.mutable.Map(
    0.0 -> "a",
    1.1 -> "b",
    2.2 -> "c",
)
}






