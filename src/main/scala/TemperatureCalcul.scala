import scala.io.StdIn.readLine

object TemperatureCalcul extends App {
  val temperature = readLine ("How high is your temperature?").toInt
  if (temperature >= 37){
    println("Oh no, you have a fever!", temperature)
  } else if (temperature <= 35){
    println("Oh no, you must have a cold", temperature)
  } else {
    println("Everything is great!", temperature)
  }
}
