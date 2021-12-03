package org.scalainsandouts.oops

class Friend(val name: String, favoriteGenre: String, val age: Int) {
  def likes(genre: String) = favoriteGenre == genre
  def learns(language: String) = s"${this.name} learns ${language}"
  def learnScala = learns("Scala")

  def +>(friend: Friend) = s"${this.name} loves to hangout with ${friend.name}"

  def +(nickName: String) = s"${this.name} (${nickName})"

  def unary_~ : String = s"${this.name} what the heck"

  def unary_+ : String = s"${this.name} with the age ${age+1}"

  def isEmployed: Boolean = true

  def apply(): String = s"Hi, my name is ${this.name} and I like ${favoriteGenre} genre."
  def apply(times: Int): String = s"Hi, my name is ${this.name} and I can wathch ${favoriteGenre} genre may be ${times} times a day."
}

object MethodNotations extends App {
  val soumya = new Friend("Soumya", "Suspense", 35)
  val plaban = new Friend("Plaban", "Romcom", 34)
  println(soumya.likes("Suspense"))
  println(plaban.likes("Suspense"))
  // Above method calls can be called in below way also.
  // The below notation is called infix Notation/operator Notation.
  // Flip side of this is it will work only on methods with single parameter.
  println(soumya likes "Suspense")
  println(plaban likes "Romcom")

  // So below is the cooler way to define a function.
  println(soumya +> plaban)

  // In fact in Scala every operator is a method.
  // To illustrate this we can call it in either way by operator notation as well as method notation
  println(1 + 2)
  println(1.+(2))

  // Prefix notations. Here - operator is equivalent to unary_- method.
  // Unary operator only works with +, -, ~, !
  val x = -1
  val y = 1.unary_-
  println(x)
  println(y)
  println(~(soumya))

  // Postfix notation
  println(soumya.isEmployed)

  // Apply method illustration. In both the ways apply method can be called.
  // So take way of this is whenever compiler find the object being called like a method then it calls it's apply method.
  println(soumya.apply())
  println(plaban())

  /*
  * 1) Overload the + operator which which receives String and return new Person with Nick name.
  * 2) Add an age to the Friend class. Add a unary + operator which increments the age with +1.
  * 3) Add a learns method to the Friend's class. Receives String parameter and return Friend learns Scala.
  *    Add a learnScala method and calls learns from that method. Use it as postfix notation.
  * 4) Overload the apply method to receives a number and return "Friend watched Suspense Genrer n times"
  * */
  println(plaban + "Mituni")
  println(+soumya)
  println(soumya.learnScala)
  println(soumya(5))
}
