//> using scala "3"

// run this code with this command:
//     $ scala-cli Hello.scala

// create as many functions as you need
def double(i: Int): Int = i * 2

@main
def hello() =
    println("Hello, world")
    val x = double(2)
    println(s"2 * 2 = $x")
