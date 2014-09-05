package awe.somo.githubconsumer
import scalaj.http.{Http, Token, HttpOptions}

object GitConsumer {
  def getData(consumer: String, repository: String) : Http.Request = {
    Http(s"https://api.github.com/repos/$repository/pulls").
      auth(consumer, "").
      param("state","open").
      option(HttpOptions.connTimeout(1000)).
      option(HttpOptions.readTimeout(5000))
  }

  def main(args: Array[String]) {
    println("Insert your API token")
    val consumer = readLine()
    println("Insert the repository name")
    val repository = readLine()
    val request = getData(consumer, repository)

    val resultOne = request.asString
    println(resultOne)
  }
}

