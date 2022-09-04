//> using scala "3"

// run this code with this command:
//     $ scala-cli StringsMultiline.sc


val address1 = """
    Alvin Alexander
    123 Main Street
    Talkeetna, AK 99676
"""
println(address1)


// i added a 'trim' method call to the end of the string
// here so you can experiment with that
val address2 = """
    |Alvin Alexander
    |123 Main Street
    |Talkeetna, AK 99676
""".stripMargin.trim
println(address2)


val address3 = """
    #Alvin Alexander
    #123 Main Street
    #Talkeetna, AK 99676
""".stripMargin('#')
println(address3)

val name = "Alvin Alexander"
val street = "123 Main Street"
val city = "Talkeetna"
val state = "AK"
val zip = "99676"
val address4 = s"""
    |$name
    |$street
    |$city, $state $zip
""".stripMargin
println(address4)








