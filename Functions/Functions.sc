//> using scala "3"

// run this code with this command:
//     $ scala-cli Functions.sc


def double(i: Int): Int = 2 * i
val x = double(2)     // x is an Int with the value 4
println(x)
println(double(3))    // prints the number 6


// Multiple input parameters
def add(i: Int, j: Int): Int = i + j
def add(i: Int, j: Int, k: Int): Int = i + j + k

def printIntWithMessage(msg: String, int: Int): Unit =
    println(s"$msg $int")


// Multiline functions
def removeTrailingS(s: String): String = 
    if s.length == 0 then
        s
    else if s.last == 's' then 
        s.dropRight(1)
    else
        s

removeTrailingS("")          // ""
removeTrailingS("Big")       // "Big"
removeTrailingS("Belly")     // "Belly"
removeTrailingS("Burgers")   // "Burger"  (the 's' is removed)


// An “Advanced Scala” note
{
def add(i: Int)(j: Int): Int = i + j
val a = add(1)(2)    // 'a' will be 3
}




