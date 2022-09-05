//> using scala "3"

// run this code with this command:
//     $ scala-cli CollsMapUpdatingElements.sc


// start with this Map
val a = scala.collection.mutable.Map(1 -> "a")
a += (2 -> "b")                  // add using a tuple
a ++= Map(3 -> "c", 4 -> "d")    // add with another Map
a ++= List(5 -> "e", 6 -> "f")   // you can even add new pairs with a sequence

println(a(1))

a(1) = "AA"
println(a(1))

a(2) = "BB"
println(a)

