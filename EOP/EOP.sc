//> using scala "3"

// run this code with this command:
//     $ scala-cli EOP.sc

val a = 1
val b = 2
val c = if a < b then a else b
println(c)


def min(a: Int, b: Int): Int =
    if a < b then a else b
println(min(1, 2))
println(min(2, 1))

val x = min(1, 1_000)
println(x)


