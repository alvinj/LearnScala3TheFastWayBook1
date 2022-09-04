//> using scala "3"

// run this code with this command:
//     $ scala-cli CollsArrayBufferInitiallyPopulate.sc

import scala.collection.mutable.ArrayBuffer


ArrayBuffer.range(1, 3)             // ArrayBuffer(1, 2)
ArrayBuffer.range('a', 'c')         // ArrayBuffer(a, b)

ArrayBuffer.range(1, 6, 2)          // ArrayBuffer(1, 3, 5)

List.range(1, 3)                    // List(1, 2)
Vector.range(1, 3)                  // Vector(1, 2)


// Using 'to' and 'until'

(1 to 3).toBuffer                   // ArrayBuffer(1, 2, 3)
(1 until 3).toBuffer                // ArrayBuffer(1, 2)

('a' to 'c').toBuffer               // ArrayBuffer('a', 'b', 'c')
('a' until 'c').toBuffer            // ArrayBuffer('a', 'b')


(1 to 5 by 2).toBuffer              // ArrayBuffer(1, 3, 5)
(1 until 5 by 2).toBuffer           // ArrayBuffer(1, 3)

(1 to 5).by(2).toBuffer             // ArrayBuffer(1, 3, 5)
(1 until 5).by(2).toBuffer          // ArrayBuffer(1, 3)


('a' to 'f').by(2).toBuffer         // ArrayBuffer('a', 'c', 'e')


// 'to' and 'until' are just methods

(1 to 5).toBuffer
(1 to 5 by 2).toBuffer

1.to(5).toBuffer
1.to(5).by(2).toBuffer





