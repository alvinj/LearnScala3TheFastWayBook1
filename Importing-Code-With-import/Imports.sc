//> using scala "3"

// run this code with this command:
//     $ scala-cli Imports.sc


import scala.io.Source

// read and print the lines in the /etc/passwd file:
for
    line <- Source.fromFile("/etc/passwd").getLines
do
    println(line)


// you can use 'import' statements anywhere, they
// aren’t limited to being at the top of a file:
import java.io.*

// after the 'import' you can use the java.io classes,
// like File, IOException and FileNotFoundException.


