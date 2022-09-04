#!/usr/bin/env -S scala-cli shebang

//> using scala "3"

// run this code with this command:
//     $ scala-cli Println.sc
//     $ scala-cli Println.sc -- foo bar

println("Hello, world")
System.err.println("An error message")

// print any command-line arguments that are given to this script.
// 'args' is a special, implicit variable created for you by
// Scala CLI.
args.foreach(println)

