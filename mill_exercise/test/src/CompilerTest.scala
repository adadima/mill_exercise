import org.scalatest.FunSuite

class CompilerTest extends FunSuite {
  test("testing mill test command evaluation result") {
    assert(2 == 1, "Wrong")
  }
}