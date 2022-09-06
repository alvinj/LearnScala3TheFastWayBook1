//> using scala "3"

// run this code with this command:
//     $ scala-cli ConstructsMatchExpressionsMoreDetails.sc



// MATCHING MULTIPLE PATTERNS PER LINE

val i = 1
i match
    case 1 | 3 | 5 | 7 | 9 => println("odd")
    case 2 | 4 | 6 | 8 | 10 => println("even")
    case _ => println("something else")

val cmd = "start"
cmd match
    case "start" | "go" => 
        println("starting")
    case "stop" | "quit" | "exit" => 
        println("stopping")
    case _ => 
        println("doing nothing")



// ADDING ‘IF’ STATEMENTS TO CASES

{
val i = 10

i match
    case a if 0 to 9 contains a => 
        println("0-9 range: " + a)
    case b if 10 to 19 contains b =>
        println("10-19 range: " + b)
    case c if 20 to 29 contains c =>
        println("20-29 range: " + c)
    case _ =>
        println("Hmmm...")
}




