//> using scala "3"

// run this code with this command:
//     $ scala-cli TraitsAsInterfaces.sc


trait HasTail:
    def startTail(): Unit
    def stopTail(): Unit

trait CanSpeak:
    def speak(): Unit

class Dog extends HasTail, CanSpeak:
    def startTail() = println("Tail is wagging")
    def stopTail() = println("Tail is stopped")
    def speak() = println("Woof")

val d = Dog()
d.speak()        // Woof
d.startTail()    // Tail is wagging
d.stopTail()     // Tail is stopped



// THE BENEFIT OF USING TRAITS AS INTERFACES

def saySomething(speaker: CanSpeak) = speaker.speak()

class Cat extends CanSpeak:
    def speak() = println("Meow")

saySomething(Dog())    // Woof
saySomething(Cat())    // Meow

def getSpeaker(s: String): CanSpeak = ???

