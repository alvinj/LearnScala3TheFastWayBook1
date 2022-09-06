
// notice in this code that i don’t set the Scala
// version, so scala-cli should use its default.

import scala.io.StdIn.readLine
print("What’s your name? ")
val name = readLine()
println(s"You said your name is $name")
