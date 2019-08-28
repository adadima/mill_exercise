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


object RandomClass {

  def main(args: Array[String]): Unit = {
    if (os.exists(os.pwd / "random.txt")) {
      os.remove(os.pwd / "random.txt")
    }
    if ( args.length == 0 ) {
      os.write(os.pwd / "random.txt", "\n")
    } else if ( args.length == 1 ) {
      throw new RuntimeException("random runtime exception")
    } else {
      os.write(os.pwd / "random.txt", args.mkString("\n"))
    }
  }
}
