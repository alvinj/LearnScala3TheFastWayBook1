//> using scala "3"

// run this code with this command:
//     $ scala-cli UnionTypes.sc


// Perl version of what’s “true”
def isTrue(a: Int | String | Boolean): Boolean = a match
    case 0 | "0" | "" | false  => false
    case _ => true

println(isTrue(0))
println(isTrue("0"))
println(isTrue(""))
println(isTrue(false))



// OTHER USES

def aFunction(): Int | String =
    // create a random integer
    val i = scala.util.Random.nextInt(100)
    // return it as an Int or a String
    if (i < 50) then i else s"string: $i"

val x = aFunction()
val y: Int | String = aFunction()

println(x)
println(y)

// these show the data types of each object
println(x.getClass)
println(y.getClass)


var a : Int | String = 1   // 'a' can be an Int or String; right now it’s Int

a = "hello"                // now it’s String!
println(a.getClass)

a = 2                      // wait, it’s Int again
println(a.getClass)

a = "world"                // it’s a String again
// a = 2.2                    // COMPILER ERROR: Type Mismatch Error






