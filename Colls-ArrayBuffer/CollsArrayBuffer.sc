//> using scala "3"

// run this code with this command:
//     $ scala-cli CollsArrayBuffer.sc


import scala.collection.mutable.ArrayBuffer

val strings = ArrayBuffer[String]()
val ints = ArrayBuffer[Int]()


val ints1 = new ArrayBuffer[Int](100_000_000)


val names = ArrayBuffer("Bert", "Ernie", "Grover")
names.foreach(println)
