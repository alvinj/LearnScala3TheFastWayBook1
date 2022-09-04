//> using scala "3"

// run this code with this command:
//     $ scala-cli CollsArrayBufferOtherMethods.sc


import scala.collection.mutable.ArrayBuffer


// map
{
val a = ArrayBuffer(1, 2, 3)
val b = a.map(_ * 2)    // b: ArrayBuffer(2, 4, 6)
}

{
var a = ArrayBuffer(1, 2, 3)
a = a.map(_ * 2)        // a: ArrayBuffer(2, 4, 6)
}


// mapInPlace
{
val a = ArrayBuffer(1, 2, 3)
a.mapInPlace(_ * 2)    // ArrayBuffer(2, 4, 6)
}


// filter and filterInPlace
{
// filter
val a = ArrayBuffer(1, 2, 3, 4, 5)
val b = a.filter(_ > 2)   // ArrayBuffer(3, 4, 5)
}

{
// filterInPlace
val a = ArrayBuffer(1, 2, 3, 4, 5)
a.filterInPlace(_ > 2)    // ArrayBuffer(3, 4, 5)
}


// Other functional methods
{
val a = ArrayBuffer.range(0, 5)       // ArrayBuffer(0, 1, 2, 3, 4)
val b = a.drop(2)                     // b: ArrayBuffer(2, 3, 4)
val c = a.dropWhile(_ < 3)            // c: ArrayBuffer(3, 4)
val d = a.take(2)                     // d: ArrayBuffer(0, 1)
val e = a.takeWhile(_ < 3)            // e: ArrayBuffer(0, 1, 2)
}

{
val a = ArrayBuffer.range(0, 4)       // ArrayBuffer(0, 1, 2, 3)
val f = a.toList                      // f: List(0, 1, 2, 3)
val g = a.toVector                    // g: Vector(0, 1, 2, 3)
}


// trimStart, trimEnd, reduceToSize
{
val a = ArrayBuffer.range('a', 'h')   // ArrayBuffer(a, b, c, d, e, f, g)
a.trimStart(2)                        // ArrayBuffer(c, d, e, f, g)
a.trimEnd(2)                          // ArrayBuffer(c, d, e)
}



