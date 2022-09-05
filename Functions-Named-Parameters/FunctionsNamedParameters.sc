//> using scala "3"

// run this code with this command:
//     $ scala-cli FunctionsNamedParameters.sc


def truncate(string: String, length: Int): String = 
    string.take(length)

val a = truncate(
    string = "freedom",
    length = 4
)

