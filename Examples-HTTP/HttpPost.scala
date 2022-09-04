//> using scala "3"
//> using lib "com.softwaremill.sttp.client3::core::3.7.2"

// run me with 'scala-cli HttpPost.scala'

import sttp.client3.*

@main
def doPost() = 
    val backend = HttpURLConnectionBackend()
    val response = basicRequest
        .body("Hello, world!")
        .post(uri"https://httpbin.org/post?hello=world")
        .send(backend)
    println(response)


