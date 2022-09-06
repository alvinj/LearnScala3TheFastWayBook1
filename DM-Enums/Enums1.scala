//> using scala "3"

// run this code with this command:
//     $ scala-cli Enums1.scala


enum Suit:
    case Clubs, Diamonds, Hearts, Spades

@main def enumTest =

    // import the enum cases
    import Suit.*

    // use those cases in your code like any other data type
    def printEnum(suit: Suit): Unit = suit match
        case Clubs    => println("clubs")
        case Diamonds => println("diamonds")
        case Hearts   => println("hearts")
        case Spades   => println("spades")

    // print the values
    printEnum(Clubs)       // clubs
    printEnum(Diamonds)    // diamonds
    printEnum(Hearts)      // hearts
    printEnum(Spades)      // spades



