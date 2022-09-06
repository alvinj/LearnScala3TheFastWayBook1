#!/usr/bin/env -S scala-cli shebang
//> using scala "3"

// my assumptions:
//   * this code is in a file named 'timer.sc'
//   * the file is made executable with a command like 'chmod +x timer.sc'
//   * you have 'scala-cli' installed
//
// usage:
//     timer.sc minutes-before-alarm <gain-control>
//     timer.sc 10
//     timer.sc 20 -10
//     ('gain-control' should be something like -10 or -20)


// import what we need from the Java Sound library
// ------------------------------------------------------------
import javax.sound.sampled.*


// if you don’t get the right number of command-line args, quit
// ------------------------------------------------------------
if args.length < 1 then showUsageAndExit()


// initialize the values from the user input.
// note that these can fail because i don’t verify that they
// are Int values.
// ------------------------------------------------------------
val minutesToWait = args(0).toInt
val gainControl = if args.length == 2 then args(1).toInt else -30


// and the action begins ...
// ------------------------------------------------------------
println(s"Timer started. Wait time is $minutesToWait minutes.\n")


// wait the desired time, sleeping one minute in between checks
// ------------------------------------------------------------
for i <- 1 to minutesToWait do
    Thread.sleep(60_000)
    println(s"time remaining: ${minutesToWait-i} ...")


// the 'for' loop ended, so play the sound twice. my sound lasts
// about 7 seconds, so i sleep that long in between plays.
// -------------------------------------------------------------
for i <- 1 to 2 do
    playSoundfile("./gong.wav")
    Thread.sleep(7_000)


// my two functions are shown below here
// ------------------------------------------------------------

def showUsageAndExit() =
    Console.err.println("Usage: timer.sc minutes-before-alarm <gain-control>")
    Console.err.println("Ex:    timer.sc 10")
    Console.err.println("Ex:    timer.sc 10 -20")
    Console.err.println("       'gain-control' should be something like -10 or -20")
    System.exit(1)

/**
 * This is some “Java Audio” specific code. Note that I don’t do any 
 * error-checking, so if the sound file doesn’t exist, this code will blow up.
 */
@throws(classOf[java.io.FileNotFoundException])
def playSoundfile(f: String): Unit =
    val audioInputStream = AudioSystem.getAudioInputStream(java.io.File(f))
    val clip = AudioSystem.getClip
    clip.open(audioInputStream)
    val floatGainControl = clip.getControl(FloatControl.Type.MASTER_GAIN).asInstanceOf[FloatControl]
    floatGainControl.setValue(gainControl)  //reduce volume by x decibels (like -10f or -20f)
    clip.start







