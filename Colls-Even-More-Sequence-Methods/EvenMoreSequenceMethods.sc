//> using scala "3"

// run this code with this command:
//     $ scala-cli EvenMoreSequenceMethods.sc


val firstTen = (1 to 10).toList

println(firstTen.contains(2))
println(firstTen.containsSlice(List(3,4,5)))
println(firstTen.count(_ % 2 == 0))
println(firstTen.endsWith(List(9,10)))
println(firstTen.exists(_ > 10))
println(firstTen.forall(_ < 20))
println(firstTen.indexWhere(_ == 3))

println(firstTen.max)
println(firstTen.min)
println(firstTen.sum)
println(firstTen.product)

println(firstTen.startsWith(List(1,2)))


println(firstTen.count(_ % 2 == 0))
println(firstTen.count(i => i % 2 == 0))


