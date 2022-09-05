//> using scala "3"

// run this code with this command:
//     $ scala-cli Classes2AddingMembersGetter.sc


{
class Employee(var firstName: String, var lastName: String):
    def fullName: String = s"$firstName $lastName"
end Employee

val e = Employee("Reginald", "Dwight")

println(e.firstName)   // prints "Reginald"
println(e.lastName)    // prints "Dwight"

e.firstName = "Elton"
e.lastName = "John"

println(e.fullName)   // prints "Elton John"
}


// A PRIVATE FIELD AND GETTER METHOD
{
class Employee(var firstName: String, var lastName: String):
    private var _salary = 0d
    def salary: Double = _salary
    def fullName: String = s"$firstName $lastName"
end Employee

val e = Employee("John", "Doe")

// print the constructor parameter fields
println(s"firstName = ${e.firstName}, lastName = ${e.lastName}")

// print the salary field
println(s"Salary = ${e.salary}")
}


// NOTE: DON’T USE DOUBLE FOR CURRENCY
println(0.10 + 0.20)




