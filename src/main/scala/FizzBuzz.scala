object FizzBuzz extends App {
  
  for (i <- 1 to 100) {
    if ( i % 5 == 0 && i% 7 == 0)
      println(i +" = FizzBuzz")
    else if (i % 5 == 0)
      println(i +" = Fizz")
    else if (i % 7 == 0)
      println(i +" = Buzz")
    else
      println(i)
  }
}
