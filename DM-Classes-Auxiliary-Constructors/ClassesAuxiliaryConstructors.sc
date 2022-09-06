//> using scala "3"

// run this code with this command:
//     $ scala-cli ClassesAuxiliaryConstructors.sc


// [0] this is the primary constructor
class Person(var firstName: String, var lastName: String):

    // [1] a one-arg auxiliary constructor
    def this(firstName: String) =
        this(firstName, "<unknown>")

    // [2] a zero-arg auxiliary constructor
    def this() =
        this("<unknown>", "<unknown>")

    override def toString = s"$firstName $lastName"

end Person


println(Person("Alvin", "Alexander"))
println(Person("Alvin"))
println(Person())

