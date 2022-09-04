//> using scala "3"

// run this code with this command:
//     $ scala-cli ConstructsForExpressions.sc


val xs = List(1, 2, 3)
val ys = for x <- xs yield x * 2
println(ys)


val names = Seq("luke", "leia")

val capNames = 
    for
        name <- names
    yield
        // put as many lines of code as are necessary
        // for your algorithm
        name.capitalize
println(capNames)


{
val xs = List("a", "bb", "ccc")
val ys = for x <- xs yield x.length
println(ys)
}

