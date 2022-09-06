//> using scala "3"

// run this code with this command:
//     $ scala-cli ConstructsMatchExpressions.sc


// EXAMPLE 1

{
enum Suit:
    case Clubs, Diamonds, Hearts, Spades

import Suit.*

val suit = Hearts

suit match
    case Clubs    => println("clubs")
    case Diamonds => println("diamonds")
    case Hearts   => println("hearts")
    case Spades   => println("spades")
}



// EXAMPLE 2

// assume that 'number' is an Int that’s set earlier in the code:
val number = 1

// and then some time later in the code:
number match
    case 1 => println("One")
    case 2 => println("Two")
    case _ => println("Some other value")



// EXAMPLE 3

{
enum Suit:
    case Clubs, Diamonds, Hearts, Spades

import Suit.*

def suitToString(suit: Suit): String = suit match
    case Clubs    => "clubs"
    case Diamonds => "diamonds"
    case Hearts   => "hearts"
    case Spades   => "spades"

println(suitToString(Clubs))
println(suitToString(Diamonds))
println(suitToString(Hearts))
println(suitToString(Spades))
}





