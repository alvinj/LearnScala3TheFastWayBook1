//> using scala "3"

// run this code with this command:
//     $ scala-cli ConstructsForLoops.sc


val ints = List(1, 2, 3)
for i <- ints do println(i)


for
    i <- ints
do
    // this doesn’t really require multiple lines,
    // but imagine that it does
    val j = i * 10
    println(j)


val names = List("adam", "alex", "bob")

// again imagine that this requires multiple lines:
for name <- names do
    val capName = name.capitalize
    println(capName)

for name <- names do println(name.capitalize)




