//> using scala "3"

// run this code with this command:
//     $ scala-cli CollsArrayBufferRemoveElements.sc

import scala.collection.mutable.ArrayBuffer


{
val a = ArrayBuffer.range('a', 'g')    // ArrayBuffer(a, b, c, d, e, f)
a -= 'a'                               // ArrayBuffer(b, c, d, e, f)

a --= List('b', 'c')                   // ArrayBuffer(d, e, f)
a --= Vector('e', 'f')                 // ArrayBuffer(d)
}


// Other methods

{
val a = ArrayBuffer.range('a', 'h')   // ArrayBuffer(a, b, c, d, e, f, g)
a.clear                               // ArrayBuffer[Char] = ArrayBuffer()
}

val a = ArrayBuffer.range('a', 'h')   // ArrayBuffer(a, b, c, d, e, f, g)
a.remove(0)                           // ArrayBuffer(b, c, d, e, f, g)
a.remove(2, 3)                        // ArrayBuffer(b, c, g)

// remove can throw exceptions
a.clear              // clears 'a' so it contain no elements
a.remove(0)          // ERROR: java.lang.IndexOutOfBoundsException
a.remove(100, 10)    // ERROR: java.lang.IndexOutOfBoundsException


