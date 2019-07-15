import ch.epfl.scala.bsp4j._

trait A {
  def methodA: Unit
}

trait B extends A {
  def methodB: Unit
}

class C extends B {
  def methodB: Unit = {

  }

  def methodA: Unit = {

  }
}


class RandomClass {
  val a = new A {
    override def methodA: Unit = ???
  }
  val b = a match {
    case value: B => None
  }
}
