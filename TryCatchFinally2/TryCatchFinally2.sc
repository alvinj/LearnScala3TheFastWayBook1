//> using scala "3"

// run this code with this command:
//     $ scala-cli TryCatchFinally2.sc


import scala.util.{Try, Success, Failure}
import scala.io.{BufferedSource, Source}

def readTextFile(filename: String): Try[String] = 
    var source: BufferedSource = null
    try
        source = Source.fromFile(filename)
        val lines = for line <- source yield line
        Success(lines.mkString)
    catch
        case t: Throwable => Failure(t)
    finally
        if source != null then source.close

val maybeContents = readTextFile("/etc/passwd")
maybeContents match
    case Success(contents)  => println(contents)
    case Failure(exception) => System.err.println(exception.getMessage)
