package org.scalainsandouts.oops

class Person(name: String, val age: Int) {
  val fieldVal = 5

  // Things to note here is even if name is not a field here it can be accessed inside class
  def greet(name:String): Unit = println(s"${this.name} says: Hi, $name")

  // Multiple Constructors

  // Auxiliary Constructors.
  // In Auxiliary constructor the body is again the constructor call with default parameter.
  // So it will be useless if we pass default parameters into class constructor.
  def this(name: String) = this(name,0)
}
object OOBasics extends App{
  val person = new Person("John",26)

  // This will cause error because in Scala age is a Class parameter and not a class member.
  // So class parameters are not fields. If we want to convert this to fields then declare them as var/val
  println(person.fieldVal)
  println(person.age)
  person.greet("Bibhuti")
}
