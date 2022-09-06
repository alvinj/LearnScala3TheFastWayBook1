//> using scala "3"

// run with:
// scala-cli TryCatchFinally.scala

import scala.util.{Try, Success, Failure}
import scala.io.{BufferedSource, Source}

def readTextFile(filename: String): Try[String] = 
    var source: BufferedSource = null
    try
        source = Source.fromFile(filename)
        val lines = for line <- source yield line
        Success(lines.mkString)   // this converts 'lines' to a String
    catch
        case t: Throwable => Failure(t)
    finally
        if source != null then source.close()

@main
def tryExample =
    // [1] attempt to read the file
    val maybeContents = readTextFile("/etc/passwd")
    // [2] handle the result you got
    maybeContents match
        case Success(content) =>   println(content)
        case Failure(exception) => System.err.println(exception.getMessage)
