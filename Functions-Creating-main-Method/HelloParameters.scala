//> using scala "3"

// run this code with this command:
//     $ scala-cli HelloParameters.scala -- YourName

// i won’t use these functions, but i want to show that
// you can define as many as you need here:
def add(i: Int, j: Int): Int = i + j
def double(i: Int): Int = i * 2

// in Scala 3 you can also create “top level” variables like this:
val x = double(2)

@main
def hello(name: String) =
    println(s"Hello, $name")
    println(s"2 * 2 = $x")

