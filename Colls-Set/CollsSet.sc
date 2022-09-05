//> using scala "3"

// run this code with this command:
//     $ scala-cli CollsSet.sc


val set = Set(1, 1, 1, 2, 2, 3)
println(set)


// The Iterable type, and Set methods
set.foreach(println)         // prints "1 2 3" on separate lines
for s <- set do println(s)   // same result as 'foreach'

// add one element while creating a new set:
val a = set + 4              // Set(1, 2, 3, 4)

// add multiple elements from another sequence:
val b = set ++ List(4, 5)    // Set(1, 2, 3, 4, 5)


