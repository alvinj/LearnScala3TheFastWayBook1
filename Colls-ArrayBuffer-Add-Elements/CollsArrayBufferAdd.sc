//> using scala "3"

// run this code with this command:
//     $ scala-cli CollsArrayBufferAdd.sc

import scala.collection.mutable.ArrayBuffer

val ints = ArrayBuffer(1, 2, 3)   // ArrayBuffer(1, 2, 3)
ints += 4                         // ArrayBuffer(1, 2, 3, 4)
ints ++= List(5, 6)               // ArrayBuffer(1, 2, 3, 4, 5, 6)
ints ++= Vector(7, 8)             // ArrayBuffer(1, 2, 3, 4, 5, 6, 7, 8)


// More methods you can use

val a = ArrayBuffer(1, 2, 3)      // ArrayBuffer(1, 2, 3)
a.append(4)                       // ArrayBuffer(1, 2, 3, 4)
a.appendAll(List(5, 6))           // ArrayBuffer(1, 2, 3, 4, 5, 6)

a.clear                           // ArrayBuffer()
a += 9                            // ArrayBuffer(9)
a.append(10)                      // ArrayBuffer(9, 10)
a.prepend(7)                      // ArrayBuffer(7, 9, 10)

a.insert(0, 6)                    // ArrayBuffer(6, 7, 9, 10)
a.insert(2, 8)                    // ArrayBuffer(6, 7, 8, 9, 10)
a.insertAll(0, Vector(4, 5))      // ArrayBuffer(4, 5, 6, 7, 8, 9, 10)
a.prependAll(List(2, 3))          // ArrayBuffer(2, 3, 4, 5, 6, 7, 8, 9, 10)


// A note about 'for' loops

{
val ints = ArrayBuffer[Int]()
for i <- 1 to 5 do ints += i
}


