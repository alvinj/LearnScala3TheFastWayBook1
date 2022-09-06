//> using scala "3"

// run this code with this command:
//     $ scala-cli Classes3AddingSetters.sc


/**
 * The complete class.
 * Employee is a class that takes two constructor parameters,
 * and both parameters are mutable.
 */
class Employee(var firstName: String, var lastName: String):

    // This is a private, mutable field that has the Double type.
    // Note that the field is named _salary, but it could be named
    // theSalary, or any other meaningful name. Also, because the
    // field is private, it can’t be accessed outside the class.
    private var _salary = 0d

    // This is a “getter” method for the _salary field. Users
    // will call this method to get the current salary value.
    def salary: Double = _salary

    // This is the “setter” method for the _salary field. Users
    // will call this method to update the salary. Note that it
    // can be declared on one line, but I use two lines here to
    // make it more clear.
    def salary_=(newSalary: Double): Unit =
        _salary = newSalary

    // This method returns the full name of the Employee as a
    // String.
    def fullName: String = s"$firstName $lastName"
end Employee


val e = Employee("John", "Doe")

// update the salary field
e.salary = 1_000_000.01d

println(s"firstName = ${e.firstName}, lastName = ${e.lastName}")
println(s"Salary = ${e.salary}")



// As a bonus, this code shows how to format the salary
// using a Locale, such as "US" for the United States.
// I show a few more examples of how to work with this
// in the Scala Cookbook (https://amzn.to/3du1pMR):
import java.text.NumberFormat
import java.util.Locale
val formatter = NumberFormat.getInstance(Locale.US)
val formattedSalary = formatter.format(e.salary)
println(s"Salary = $$${formattedSalary}")

// the $$$ in that code is necessary because $$ prints
// one $ when used with the 's' interpolator, and then
// the third $ belongs to the '${formattedSalary}' code.
// try removing one or two of the $ characters and see
// what happens.






