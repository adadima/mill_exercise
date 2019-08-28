import org.scalatest.FunSuite

class RandomTestClass2 extends FunSuite {

  ignore("test1") {
    assert(1 != 1)
  }

  test("test2") {
    assert("aaab" != "aaaab", "strings are equal")
  }

  test("test3") {
    assert ("aaaab" == "aaaab", "wrong string")
  }

  test("test4") {
    assert("abc" > "bcd", "wrong string order")
  }

  ignore ("test5") {
    assert(false, "wrong")
  }
}

class RandomTest2Class extends FunSuite {
  val a = 2
  val b = 1
  val randomList = List.empty[String]
  test("test1") {
    assert(a > b, "wrong")
  }

  ignore ("test2") {
    assert (a < b, "wrong")
  }

  test("test3") {
    assert(true, "this is supposed tobe a dummy true assertion")
  }

  test("test4") {
    assert(randomList.isEmpty, "list does not appear empty")
  }

  test("test5") {
    assert(false, "this should be a dummy failing test")
  }
}