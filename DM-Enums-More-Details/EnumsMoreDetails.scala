//> using scala "3"
//> using lib "org.scalameta::munit::0.7.27"

/**
 * To make this a little more interesting (and challenging),
 * this code uses a testing framework along with Scala CLI.
 * The testing framework is named MUnit (https://scalameta.org/munit).
 * Notice that it is included in the second line in this file.
 *
 * For more information on running tests with Scala CLI,
 * see: https://scala-cli.virtuslab.org/docs/commands/test
 */

/**
 * Run this code with either of these commands. The second
 * command recompiles and re-tests your code any time
 * there is a change:
 *     $ scala-cli test EnumsMoreDetails.scala
 *     $ scala-cli test EnumsMoreDetails.scala --watch
 */

enum HttpResponse(val code: Int):
    case Ok extends HttpResponse(200)
    case MovedPermanently extends HttpResponse(301)
    case InternalServerError extends HttpResponse(500)

import HttpResponse.*

class EnumTests extends munit.FunSuite {
    test("code tests") {
        assert(Ok.code == 200)
        assert(MovedPermanently.code == 301)
        assert(InternalServerError.code == 500)
    }
}


// See the complete 'Planet' example here:
// https://https://dotty.epfl.ch/docs/reference/enums/enums.html



