//> using scala "3"

// run this code with this command:
//     $ scala-cli CollsForeachMethod.sc


{
val ints = List(1, 2, 3)
ints.foreach(println)
}


{
val ints = List(1, 2, 3)
ints.foreach(i => println(i))
ints.foreach(println(_))
ints.foreach(println)
}


val strings = List("a", "bb", "ccc")
for s <- strings do println(s.length)
strings.foreach(s => println(s.length))


