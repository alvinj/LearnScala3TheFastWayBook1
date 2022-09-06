//> using scala "3"

// run this code with this command:
//     $ scala-cli ClassesDefaultConstructorParameters.sc


class Person(
    var firstName: String = "<unknown>",
    var lastName: String = "<unknown>"
):
    override def toString = s"$firstName $lastName"


println(Person("Alvin", "Alexander"))
println(Person("Alvin"))
println(Person())

