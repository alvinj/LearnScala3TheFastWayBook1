//> using scala "3"

// run this code with this command:
//     $ scala-cli CollsMapMethod.sc


val strings = List("a", "bb", "ccc")
strings.foreach(s => println(s.length))
for s <- strings do println(s.length)


val lengths1 = for s <- strings yield s.length
println(lengths1)


val lengths2 = strings.map(_.length)
println(lengths2)


val ucStrings = strings.map(_.toUpperCase)
println(ucStrings)


val lengths3 = strings.map(s => s.length)
println(lengths3)

