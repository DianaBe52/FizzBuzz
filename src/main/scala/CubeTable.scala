

import scala.collection.mutable
import scala.io.StdIn.readLine

object CubeTable extends App {

  val begVal = readLine("What is the starting value?")
  println(s"Will print cubes starting with cube for $begVal.")
  val endVal = readLine("What is the end value?")
  println(s"Will print cubes ending with cube for $endVal.")
  val begCube = begVal.toInt * begVal.toInt * begVal.toInt
  val endCube = endVal.toInt * endVal.toInt * endVal.toInt
  val seqOfCube = mutable.Seq(begCube, endCube)
  println(seqOfCube)
}

//(mySeq.map(el => el+10))