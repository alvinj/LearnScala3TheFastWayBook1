//> using scala "3"

// run this code with this command:
//     $ scala-cli CollsFilterMethod.sc


val ints = Vector(1, 2, 3, 4, 5)

{
val smallInts = ints.filter(_ < 3)
println(smallInts)
}


{
val smallInts = ints.filter(i => i < 3)
println(smallInts)
}


{
val smallInts =
    for
        i <- ints 
        if i < 3
    yield
        i
println(smallInts)
}

