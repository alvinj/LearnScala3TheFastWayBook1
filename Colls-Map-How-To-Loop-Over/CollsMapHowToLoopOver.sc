//> using scala "3"

// run this code with this command:
//     $ scala-cli CollsMapHowToLoopOver.sc


val shipmates = scala.collection.mutable.Map(
    "Captain" -> "Kirk",
    "1st Officer" -> "Spock",
    "Doctor" -> "McCoy"
)

for (k, v) <- shipmates do println(s"key: $k, value: $v")


// Updating a mutable Map in a loop
{
val shipmates = scala.collection.mutable.Map(
    "Captain" -> "Kirk",
    "1st Officer" -> "Spock",
    "Doctor" -> "McCoy"
)

for
    (k, v) <- shipmates
do
    shipmates(k) = v.toUpperCase

for (k, v) <- shipmates do println(s"key: $k, value: $v")
}


