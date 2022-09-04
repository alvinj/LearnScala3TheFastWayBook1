//> using scala "3"

// run this code with this command:
//     $ scala-cli StringMethods.sc

val a = "hello, world"
println(a.length)             // 12
println(a.capitalize)         // "Hello, world"
println(a.toUpperCase)        // "HELLO, WORLD"
println(a.indexOf("e"))       // 1
println(a.substring(0, 2))    // "he"
println(a.substring(0, 3))    // "hel"
println(a.substring(1, 3))    // "el"


val b = a.capitalize     // b: "Hello, world"
val c = a.toUpperCase    // c: "HELLO, WORLD"

println(b)
println(c)


val s = "hello"
println(s(0))

for c <- s do println(c)



