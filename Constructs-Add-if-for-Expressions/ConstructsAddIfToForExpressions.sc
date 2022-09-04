//> using scala "3"

// run this code with this command:
//     $ scala-cli ConstructsAddIfToForExpressions.sc


val fruits = List("apple", "banana", "cherry", "date")

for
    f <- fruits
    if f.length > 5
do
    println(f)



val capFruits =
    for
        f <- fruits
        // add as many guards as you need
        if f.length > 5
        if f.length < 10
        if f.startsWith("c")
    yield
        // add as much business logic as
        // you need here
        f.capitalize

capFruits.foreach(println)



