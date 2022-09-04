//> using scala "3"
//> using lib "com.softwaremill.sttp.client3::core::3.7.2"

// run me with 'scala-cli HttpGet.scala'

import sttp.client3.*

@main def doGet = 
    val backend = HttpURLConnectionBackend()
    val response = basicRequest
                      .get(uri"http://httpbin.org/get")
                      .send(backend)
    println(response)

