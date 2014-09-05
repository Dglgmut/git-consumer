package awe.somo.githubconsumer
import scalaj.http.{Http, Token, HttpOptions}

object GitConsumer {
  def main(args: Array[String]) {
    println("Insert your API token")
    val consumer = readLine()
    val request: Http.Request = Http("https://api.github.com/user").
                                  auth(consumer, "").
                                  option(HttpOptions.connTimeout(1000)).
                                  option(HttpOptions.readTimeout(5000))

    val resultOne = request.asString
    println(resultOne)
  }
}

