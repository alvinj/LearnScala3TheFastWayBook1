//> using scala "3"

// run this code with this command:
//     $ scala-cli FunctionsDefaultsForFunctionParameters.sc


def printHello(name: String = "Alvin"): Unit =
    println(s"Hello, $name")

printHello()         // Hello, Alvin
printHello("Joe")    // Hello, Joe


// A more useful example
def getUrlData(
    url: String,
    connectionTimeout: Int = 5_000, 
    readTimeout: Int = 5_000
): String =
    println(s"cTimeout = $connectionTimeout, rTimeout = $readTimeout")
    // your real code would be here
    "Here’s the data!"

getUrlData("https...")                   // cTimeout = 5000, rTimeout = 5000
getUrlData("https...", 2_500)            // cTimeout = 2500, rTimeout = 5000
getUrlData("https...", 10_000, 10_000)   // cTimeout = 10000, rTimeout = 10000


