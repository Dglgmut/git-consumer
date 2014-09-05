package awe.somo.githubconsumer
import scalaj.http.Http

object GitConsumer {
  def main(args: Array[String]) {
    val request: Http.Request = Http("http://date.jsontest.com/")

    val resultOne = request.asString
    println(resultOne)
  }
}

