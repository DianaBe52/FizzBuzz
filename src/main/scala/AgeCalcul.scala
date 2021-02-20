import scala.io.StdIn.readLine

object AgeCalcul extends App {
  val myName = readLine ("What is your name?")
  val age = readLine (s"Hello $myName What is your age?").toInt
  println(s"I am $age too")
  val thisYear = 2021
  val ageTo100 = {100 - age}
  val yearOf100 = thisYear + ageTo100
  println (s"You will be 100 after $ageTo100 in the year of $yearOf100")

}