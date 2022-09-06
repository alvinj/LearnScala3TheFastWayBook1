//> using scala "3"

// run this code with this command:
//     $ scala-cli TraitsAddingBehaviors.sc

trait HasTail:
    def startTail() = println("Tail is started")
    def stopTail() = println("Tail is stopped")

trait CanSpeak:
    def speak(): Unit

class Dog extends HasTail, CanSpeak:
    def speak() = println("Woof")

class Cat extends HasTail, CanSpeak:
    override def startTail() = println("Yeah, I’m not doing that")
    override def stopTail() = println("Never started")
    def speak() = println("Meow")

val d = Dog()
d.startTail()    // Tail is started
d.stopTail()     // Tail is stopped
d.speak()        // Woof

val c = Cat()
c.startTail()    // Yeah, I’m not doing that
c.stopTail()     // Never started
c.speak()        // Meow



