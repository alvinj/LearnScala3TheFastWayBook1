//> using scala "3"

// run this code with this command:
//     $ scala-cli CollsMapCommonMethods.sc


val map = collection.mutable.Map(
    1 -> "one",
    2 -> "two",
    3 -> "three"
)
map.filterInPlace((k,v) => k > 1)
println(map)


// mapValuesInPlace
{
val map = collection.mutable.Map(
    1 -> "one",
    2 -> "two",
    3 -> "three"
)

map.mapValuesInPlace((k,v) => v.toUpperCase)
}


// Other methods
{
val map = collection.mutable.Map(
    1 -> "one",
    2 -> "two",
    3 -> "three"
)

map.contains(1)               // true (tests your value against the keys)
map.count((k,v) => k > 1)     // 2
map.exists((k,v) => k == 1)   // true
map.isEmpty                   // false
map.keys                      // Set(1, 2, 3)
map.size                      // 3
map.getOrElse(50, "fifty")
}

// clear
{
val map = collection.mutable.Map(
    1 -> "one",
    2 -> "two",
    3 -> "three"
)

// will be empty, with the type Map[Int, String]:
map.clear
println(map)
}


