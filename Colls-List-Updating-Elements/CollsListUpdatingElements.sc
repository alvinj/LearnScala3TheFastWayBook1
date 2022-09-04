//> using scala "3"

// run this code with this command:
//     $ scala-cli CollsListUpdatingElements.sc


// note that i create blocks of code inside the
// curly braces so i can reuse the variable names,
// and then this code is the same as the book.
{
val a = List(1, 2, 3)
val b = a :+ 4             // add one element
val c = b ++ List(5, 6)    // add multiple elements
println(c)
}


{
val a = List(2, 3)    // List(2, 3)
val b = 1 :: a        // List(1, 2, 3)
val c = 0 :: b        // List(0, 1, 2, 3)
println(c)
}


{
val a = List(1, 2, 3, 4, 5)
val b = a.filter(_ > 3)        // b: List(4, 5)
println(b)
}


{
val a = List(1, 2, 3)
val b = a.updated(0, 100)    // b: List(100, 2, 3)
val c = b.updated(1, 200)    // c: List(100, 200, 3)
println(c)
}


