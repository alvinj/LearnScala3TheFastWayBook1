//> using scala "3"

// run this code with this command:
//     $ scala-cli StringInterpolators.sc

val firstName = "Alvin"
val lastName = "Alexander"
println(s"$firstName $lastName")


println(s"Two plus two equals ${2 + 2}")
println(s"Two times two equals ${2 * 2}")


val x = s"Two plus two equals ${2 + 2}"
println(x)


val time = "04:52:51:541"
val logLevel = "INFO"
val classname = "Bar"
val msg = "this is an info message from class Bar"
println(f"$time | $logLevel%-5s | $classname | $msg")

