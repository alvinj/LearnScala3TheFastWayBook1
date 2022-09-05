//> using scala "3"

// run this code with this command:
//     $ scala-cli CollsCreatingFromRanges.sc


val r = 1 to 5    // result: Range 1 to 5

r.toList                        // List(1, 2, 3, 4, 5)
r.toVector                      // Vector(1, 2, 3, 4, 5)

r.filter(_ > 3)                 // Vector(4, 5)
r.filter(_ > 3).toList          // List(4, 5)
r.filter(_ > 3).map(_ * 2.0)    // Vector(8.0, 10.0)

// creates a Map
r.filter(_ > 3)
 .map(i => (i, i * 2.0))
 .toMap


// Char ranges
val letters1 = ('a' to 'c').toList         // List(a, b, c)
val letters2 = ('a' to 'f').by(2).toList   // List(a, c, e)


// Populating sequences with the ‘range’ method

Vector.range(1, 3)        // Vector(1, 2)
List.range(1, 6, 2)       // List(1, 3, 5)

import collection.mutable.ArrayBuffer
ArrayBuffer.range(1, 3)   // ArrayBuffer(1, 2)

List.range(1, 10)         // List(1, 2, 3, 4, 5, 6, 7, 8, 9)
List.range(1, 10, 2)      // List(1, 3, 5, 7, 9)
List.range(1, 10, 3)      // List(1, 4, 7)
List.range(1, 10, 4)      // List(1, 5, 9)

