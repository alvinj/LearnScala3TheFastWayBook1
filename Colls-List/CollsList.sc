//> using scala "3"

// run this code with this command:
//     $ scala-cli CollsList.sc


// something new! putting code inside curly braces
// creates a new “block” of code. code inside the
// braces is in its own scope, so even though i use
// the same variable names in this block as i do in
// the next block, the code compiles because the
// variables are within different scopes. you won’t
// normally write code like this, but it’s great for
// creating examples like these, because then i can
// use the same variable names that are in the book.

{
// this block of code is in one scope
val ints = List(1, 2, 3)
val doubles = List(1.1, 2.2, 3.3)
val names = List("Aleka", "Christina", "Alvin")
}


{
// this block of code is in a different scope
val ints: List[Int]       = List(1, 2, 3)
val doubles: List[Double] = List(1.1, 2.2, 3.3)
val names: List[String]   = List("Aleka", "Christina", "Alvin")
}


val list = List("a", "b", "c")
println(list(0))    // prints a
println(list(1))    // prints b
println(list(2))    // prints c

// these would be errors:
// list += 4       // error
// list(0) = 10    // error


var xs = List(1, 2, 3)
xs = xs ++ List(4, 5)
println(xs)

// you can also print the individual list
// elements like this:
xs.foreach(println)
for x <- xs do println(x)



