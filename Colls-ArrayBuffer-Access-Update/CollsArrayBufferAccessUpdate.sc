//> using scala "3"

// run this code with this command:
//     $ scala-cli CollsArrayBufferAccessUpdate.sc


import scala.collection.mutable.ArrayBuffer


val names = ArrayBuffer("Bert", "Ernie", "Grover")
println(names(0))    // prints "Bert"
println(names(1))    // prints "Ernie"
println(names(2))    // prints "Grover"

for name <- names do println(name)
names.foreach(println)


// update the elements
names(0) = "BERT"
names(1) = "ERNIE"
names(2) = "GROVER"
names.foreach(println)

