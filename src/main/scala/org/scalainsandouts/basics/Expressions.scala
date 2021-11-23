package org.scalainsandouts.basics

object Expressions extends App {
  var aValidValriable = 5

  // In Scala IF is an EXPRESSION rather than INSTRUCTION like in case of Imperative languages such as Java.
  // It always returns a value.
  // Below expression return type will be Any.
  val aAnyValValue = if (true) 5 else "Hello"
  println(aAnyValValue)

  // Below example of expression returns a Unit. Unit is same as VOID in imperative languages.
  val aWeirdValue = aValidValriable = 3
  println(aWeirdValue)

  // A code block is also an expression. Example of a code block.
  // The value of the block is the value of it's last expression. In this case the value is a String type.
  val aCodeBlock = {
    val y = 2
    val z = y + 1
    if (z > 2) "hello" else "good bye"
  }
}
