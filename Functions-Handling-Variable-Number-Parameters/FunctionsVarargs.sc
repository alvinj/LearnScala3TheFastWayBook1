//> using scala "3"

// run this code with this command:
//     $ scala-cli FunctionsVarargs.sc


// one parameter
def printOne(i: Int) = println(i)


// a varargs parameter
def printZeroOrMore(ints: Int*) = ints.foreach(println)
printZeroOrMore()
printZeroOrMore(1)
printZeroOrMore(1, 2)
printZeroOrMore(1, 2, 3)


// varargs rules
def printStuff(string: String, ints: Int*) =
    println(s"s = $string")
    ints.foreach(println)

printStuff("yo")
printStuff("yo", 1)
printStuff("yo", 1, 2)
printStuff("yo", 1, 2, 3)   // as many ints as desired


// these functions won’t compile
// def badFunction1(i: Int*, j: Int) = ???
// def badFunction2(i: Int*, j: Int*) = ???


