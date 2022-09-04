//> using scala "3"

// run this code with this command:
//     $ scala-cli ForExpressionsMultipleGenerators.sc


for i <- 1 to 3 do println(i)


{
val ints = List(1, 2, 3)
for i <- ints do println(i)
}


// multiple generators
val ints = List(1, 2)
val chars = List('a', 'b')

for
    i <- ints
    c <- chars
do
    println(s"i = $i, c = $c")



