//> using scala "3"

// run this code with this command:
//     $ scala-cli NumericDataTypes.sc

val x = 42
val y = 42.0


val a: Byte = 1
val b: Long = 1
val c: Short = 1
val d: Float = 1.0

// you can also declare Int and Double this way,
// though it isn’t necessary:
val e: Int = 1
val f: Double = 1.0


val g = 1_000        // Int
val h = 1_000_000    // Int
val i = 1_000_000L   // Long (created with the 'L' after the number)
val j = 1_234.56     // Double


val k = BigInt(1_234_567_890_123_456L)
val l = BigDecimal(123_456_789.012)



