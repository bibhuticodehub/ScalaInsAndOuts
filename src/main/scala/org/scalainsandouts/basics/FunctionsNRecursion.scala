package org.scalainsandouts.basics

import scala.annotation.tailrec

object FunctionsNRecursion extends App {
  /*
  * WHEN YOU NEED LOOPS. USE RECURSION.
  * */
  // Print a String N number of times.
  def getRepeatedString(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + "-" + getRepeatedString(aString, n - 1)
  }
//  println(getRepeatedString("Hi", 5))

  // Factorial Using Recursion
  val n = 10
  def factorial(n: Int): Int = {
    if (n == 1) 1
    else {
//      println(s"Computing factorial of ${n}. Before that I need factorial of ${n - 1}")
      val result = n * factorial(n - 1)
//      println(s"Computed factorial of ${n}")
      result
    }
  }
//  println(s"Finally Factorial of ${n} is " + factorial(n))

  // Tail Recursive Way
  def tailRecursiveFactorial(n: Int): Int = {
    def tailRecursiveHelper(n: Int, accumulator: Int) : Int = {
      if(n==1) accumulator
      else tailRecursiveHelper(n-1,n*accumulator)
    }
    tailRecursiveHelper(n,1)
  }
//  println(s"Finally Factorial of ${n} is " + tailRecursiveFactorial(n))

  /* Concatenate a string n times using tail recursion */
  @tailrec
  def tailRecConcateString(myString:String,accumulatedString: String, counter: Int): String = {
    if(counter == 0) accumulatedString
    else
      tailRecConcateString(myString,accumulatedString+myString,counter-1)
  }
  println(tailRecConcateString("Hi","",5))

  /* IsPrime function in a tail recursive way */
  @tailrec
  def isPrimeRecursiveWay(n: Int, modulo: Int,t:Int): Boolean = {
    if(n<=1) true
    else modulo !=0 && isPrimeRecursiveWay(n,n%t,t-1)
  }
  val number = 3
  println(isPrimeRecursiveWay(number,0,number/2))
  /* Fibonacci function in a tail recursive way */

}
