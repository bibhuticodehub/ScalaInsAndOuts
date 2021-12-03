package org.scalainsandouts.basics

object StringOperations extends App {
  val str = "Hello. I am learning scala"
  println(str.charAt(2))
  println(str.substring(7,12))

  val aNumberStr = "45"
  val aNumber = aNumberStr.toInt
  println('a' +: aNumberStr :+ 'Z')

  // Raw interpolator
  println(raw"This is a \n newline") // It will print literally like `This is a \n newline`

  val esaped = "This is a \n newline"
  println(raw"$esaped")
}
