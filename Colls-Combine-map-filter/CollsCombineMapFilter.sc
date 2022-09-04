//> using scala "3"

// run this code with this command:
//     $ scala-cli CollsCombineMapFilter.sc


val colors = List("red", "blue", "yellow", "green", "purple")

// 1st example
val result = colors.filter(_.length < 5)
                   .map(_.toUpperCase)
println(result)


// 2nd example
val result1 = colors.filter(_.length < 5)
val result2 = result1.map(_.toUpperCase)
println(result2)


// 3rd example
{
val colors: List[String] = List(
    "red", "blue", "yellow", "green", "purple"
)

// short solution
val result: List[String] = colors.filter(_.length < 5)
                                 .map(_.toUpperCase)

// longer solution
val result1: List[String] = colors.filter(_.length < 5)
val result2: List[String] = result1.map(_.toUpperCase)
}


// 4th example
{
val colors: List[String] = List(
    "red", "blue", "yellow", "green", "purple"
)

val result = colors.filter(_.length < 5)
                   .filter(_.startsWith("r"))
                   .map(_.toUpperCase)

println(result)
}



