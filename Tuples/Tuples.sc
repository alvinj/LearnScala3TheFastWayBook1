//> using scala "3"

// run this code with this command:
//     $ scala-cli Tuples.sc

val a = (1, "yo")
println(a)

val b = (1, "1", '1', 1.1)
println(b)


val t = (42, "fish")
println(t(0))
println(t(1))
println(t.size)
