//> using scala "3"

// run this code with this command:
//     $ scala-cli CollsMoreSequenceMethods.sc


val a = List(10, 20, 30, 40, 10)

println(a.filter(_ < 25))
println(a.filter(_ > 100))
println(a.filterNot(_ < 25))

println(a.drop(2))
println(a.dropRight(2))
println(a.dropWhile(_ < 25))

println(a.take(3))
println(a.takeRight(2))
println(a.takeWhile(_ < 30))

println(a.distinct)
println(a.intersect(List(19,20,21)))
println(a.slice(2, 4))


