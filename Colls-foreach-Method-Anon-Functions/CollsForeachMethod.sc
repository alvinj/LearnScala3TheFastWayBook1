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
}


val strings = List("a", "bb", "ccc")
strings.foreach(s => println(s.length))


for s <- strings do println(s.length)



