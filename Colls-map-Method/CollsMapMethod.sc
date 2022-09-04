//> using scala "3"

// run this code with this command:
//     $ scala-cli CollsMapMethod.sc


val strings: List[String] = List("a", "bb", "ccc")
strings.foreach(s => println(s.length))
for s <- strings do println(s.length)


val lengths1 = for s <- strings yield s.length


val lengths2 = strings.map(_.length)


val ucStrings = strings.map(_.toUpperCase)


val lengths3 = strings.map(s => s.length)

