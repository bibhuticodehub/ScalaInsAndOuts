package org.scalainsandouts.basics

object CallByNameAndValue extends App {

  def callByValueFunc(x: Long) = {
    println("By value: " + x)
    println("By value: " + x)
  }

  def callByNameFunc(x: => Long) = {
    println("By value: " + x)
    println("By value: " + x)
  }
  callByValueFunc(System.nanoTime())
  callByNameFunc(System.nanoTime())

  // Call By Name basically used as lazy evaluation.
  // It works well when we deal with larger streams. Until it is not used it will not evaluated.

  def infinity(): Int = 1 + infinity()
  def printFirst(x:Int, y: => Int) :Unit = println(x)

  // It will result error because the first parameter is call by value
  // and infinity() will evaluated first which results in StackOverflowError.
  printFirst(infinity(),34)

  // Here it will not cause any issue as parameter y is never used so it will executed fine.
  printFirst(34,infinity())
}
