//> using scala "3"

// run this code with this command:
//     $ scala-cli TryCatchFinally.sc


// this example is not in the book.
// it shows how to catch a NumberFormatException
// when you’re trying to convert a String to an
// Int:

val a = "one"

try
    val i = a.toInt
    println(s"i = $i")
catch
    case e: NumberFormatException =>
        println(e)
finally
    println("Came to the 'finally' clause")


