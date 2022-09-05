//> using scala "3"

// run this code with this command:
//     $ scala-cli Classes1Constructors.sc


class Person(
    var firstName: String,
    var lastName: String
)

val john = Person("John", "Doe")
val mary = Person("Mary", "Doe")



// ACCESSING THE CONSTRUCTOR PARAMETERS
val p = Person("Reginald", "Dwight")

println(p.firstName)   // prints "Reginald"
println(p.lastName)    // prints "Dwight"

p.firstName = "Elton"
p.lastName = "John"

println(p.firstName)   // prints "Elton"
println(p.lastName)    // prints "John"



// VAR VS VAL
{
class Person(
    val firstName: String,
    val lastName: String
)

// create a new Person
val p = Person("Reginald", "Dwight")

// print the fields
println(p.firstName)    // prints "Reginald"
println(p.lastName)     // prints "Dwight"

// intentional errors
// p.firstName = "Elton"   // ERROR: Reassignment to val firstName
// p.lastName = "John"     // ERROR: Reassignment to val lastName
}




