import scala.io.StdIn.readLine

print("What’s your name? ")
val name = readLine()

print("What’s your age (in years)? ")
val ageString = readLine()
val age = ageString.toInt

println(s"Your name is $name and your age is $age")

