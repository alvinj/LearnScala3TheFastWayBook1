//> using scala "3"

// run this code with this command:
//     $ scala-cli CollsRange.sc


for i <- 1 to 3 do println(i)

for i <- 1 until 3 do println(i)

1 to 3
1.to(3)


// Creating a range with ‘to’
1 to 5         // will contain Range(1, 2, 3, 4, 5)
1 to 10 by 2   // will contain Range(1, 3, 5, 7, 9)
1 to 10 by 3   // will contain Range(1, 4, 7, 10)


// But ranges are lazy
1 to 10 by 2
(1 to 10 by 2).toList


// Laziness
val r = 1 to 10
r.by(2)            // Range 1 to 10 by 2
r.drop(5)          // Range 6 to 10
r.distinct         // Range 1 to 10
r.tail             // Range 2 to 10

r.filter(_ > 5)    // Vector(6, 7, 8, 9, 10)
r.min              // 1
r.max              // 10
r.size             // 10
r.toList           // List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

val a = 1 to Int.MaxValue

// this one will consume a lot of memory and probably fail
// val a = (1 to Int.MaxValue).toList


// Creating a range with ‘until’
(1 to 3).toVector          // Vector(1, 2, 3)
(1 until 3).toVector       // Vector(1, 2)

(1 to 10 by 3).toList      // List(1, 4, 7, 10)
(1 until 10 by 3).toList   // List(1, 4, 7)


// Char ranges
'a' to 'e'                  // NumericRange a to e
'a' until 'e'               // NumericRange a until e

// 'to' is inclusive, 'until' is not
('a' to 'e').toList         // List(a, b, c, d, e)
('a' until 'e').toList      // List(a, b, c, d)

// you can also use a step with Char
('a' to 'e' by 2).toList    // List(a, c, e)
('a' to 'e').by(2).toList   // List(a, c, e)



