import scala.io.StdIn.readLine

object BonusCalcul extends App {
  val employee = readLine ("What is your name?")
  println(s"Nice to talk to you, $employee")
  val workExperience = readLine ("How many years have you worked for?").toFloat
  val monthlyWage = readLine ("What is your monthly wage in EUR?").toFloat
  val christmasBonus = ((workExperience-2) * (monthlyWage*0.15)).toFloat
  if (workExperience >=2){
    println(s"Congrats $employee! Your Christmas Bonus is EUR $christmasBonus!")
  } else{
    println(s"I'm sorry $employee. You don't have Christmas Bonus this year")
  }

}