//> using scala "3"

// run this code with this command:
//     $ scala-cli FunctionalErrorHandling.sc


// Try/Success/Failure
// you must first import these types:
import scala.util.{Try, Success, Failure}

{
def makeInt(s: String): Try[Int] = Try(s.toInt)

makeInt("1")     // Success(1)
makeInt("one")   // Failure(java.lang.NumberFormatException...)

val aString = "100"
makeInt(aString) match
    case Success(i) => println(s"Success: i = $i")
    case Failure(s) => println(s"Failed: msg = $s")
}


// EITHER/LEFT/RIGHT

{
def makeInt(s: String): Either[String, Int] = 
    try
        Right(s.toInt)
    catch
        // for this example i convert the exception to a string
        case e: NumberFormatException => Left(e.getMessage)
}

{
def makeInt(s: String): Either[Exception, Int] = 
    try
        Right(s.toInt)
    catch
        // return the exception
        case e: NumberFormatException => Left(e)

val aString = "100"
makeInt(aString) match
    case Right(i) => println(s"Success: i = $i")
    case Left(e) => println(s"Failed, exception = $e")
}


// SHORTER VERSIONS OF THOSE FUNCTIONS

import scala.util.{Try,Success,Failure}
import scala.util.control.Exception.*

{
def makeInt(s: String): Option[Int] =
    allCatch.opt(s.toInt)
}

{
def makeInt(s: String): Either[Throwable, Int] = 
    allCatch.either(s.toInt)
}

{
def makeInt(s: String): Try[Int] = 
    allCatch.toTry(Try(s.toInt))
}






