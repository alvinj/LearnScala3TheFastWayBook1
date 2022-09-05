//> using scala "3"

// run this code with this command:
//     $ scala-cli FunctionsOptions.sc


"1".toInt         // works
// "one".toInt    // throws an exception


// A “String to Int” method
{
def makeInt(s: String): Int = 
    try
        s.toInt
    catch
        case e: NumberFormatException => 0

makeInt("0")
makeInt("")
makeInt("zero")
}


// The correct solution
{
def makeInt(s: String): Option[Int] = 
    try
        Some(s.toInt)
    catch
        case e: NumberFormatException => None

makeInt("1")      // Some(1)
makeInt("one")    // None

// change this string to see the different results:
val aString = ""
makeInt(aString) match
    case Some(i) => println(s"Conversion worked. i = $i")
    case None => println("The conversion failed.")
}




