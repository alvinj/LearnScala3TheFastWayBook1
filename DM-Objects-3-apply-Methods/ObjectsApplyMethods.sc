//> using scala "3"

// run this code with this command:
//     $ scala-cli ObjectsApplyMethods.sc

{
class Person private(val name: String):
    override def toString = name

object Person:
    // the “constructor”
    def apply(name: String): Person = new Person(name)

val bert = Person("Bert")
val a = List(Person("Bert"), Person("Ernie"))

println(bert)
println(a)

val p1 = Person("Fred Flintstone")
val p2 = Person.apply("Fred Flintstone")

println(p1)
println(p2)
}



// DISCUSSION

{
class Person private(var name: String, var age: Int):
    override def toString = s"$name is $age years old"

object Person:
    // three ways to build a Person
    def apply(): Person = new Person("", 0)
    def apply(name: String): Person = new Person(name, 0)
    def apply(name: String, age: Int): Person = new Person(name, age)

println(Person())              //  is 0 years old
println(Person("Bert"))        // Bert is 0 years old
println(Person("Ernie", 22))   // Ernie is 22 years old
}


{
class Person private(var name: String, var age: Int):
    override def toString = s"$name is $age years old"

object Person:
    def apply(t: (String, Int)): Person = new Person(t(0), t(1))
    def apply(ts: (String, Int)*): Seq[Person] =
        for t <- ts yield new Person(t(0), t(1))

// create a person from a tuple
val john = Person(("John", 30))

// create multiple people using a variable number of tuples
val peeps = Person(
    ("Kenny", 33),
    ("Julia", 31)
)
}



