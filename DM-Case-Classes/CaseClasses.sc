//> using scala "3"

// run this code with this command:
//     $ scala-cli CaseClasses.sc


case class Person(name: String, relation: String)
val christina = Person("Christina", "niece")

println(christina.name)

// error: reassignment to val field:
// christina.name = "Joe"

val hannah = Person("Hannah", "niece")
println(christina == hannah)

// demonstrates toString (prints "Person(Christina,niece)"):
println(christina)


case class BaseballTeam(name: String, lastWorldSeriesWin: Int)
val cubs1908 = BaseballTeam("Chicago Cubs", 1908)
val cubs2016 = cubs1908.copy(lastWorldSeriesWin = 2016)
println(cubs1908)
println(cubs2016)


