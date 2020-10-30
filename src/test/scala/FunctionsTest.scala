class FunctionsTest extends org.scalatest.funsuite.AnyFunSuite {
  test("split") {
    assert(Functions.split(List(-3,-6,8,-9,13)) === (List(-3,-6,-9), List(-3,-9)))
    assert(Functions.split(List(-2, -4, -6, -8)) === (List(-2, -4, -6, -8), List()))
    assert(Functions.split(List(-3, -9, -13, -19)) === (List(-3, -9, -13, -19), List(-3, -9, -13, -19)))
    assert(Functions.split(List(1, 2, 3, 4, 5)) === (List(), List()))
    assert(Functions.split(List()) === (List(), List()))
    assert(Functions.split(null) === (List(), List()))
  }

  test("length") {
    assert(Functions.length(List.range(0, 1000)) === 1000)
    assert(Functions.length(List(5,4,3,2)) === 4)
    assert(Functions.length(List()) === 0)
    assert(Functions.length(null) === 0)
  }

  test("merge") {
    assert(Functions.merge(List(5,4,3,2), List(1,2,3,4,5,6)) === List(5,1,4,2,3,3,2,4,5,6))
    assert(Functions.merge(Nil, List(1, 2, 3)) === List(1, 2, 3))
    assert(Functions.merge(List(1, 2, 3), Nil) === List(1, 2, 3))
    assert(Functions.merge(Nil, Nil) === List())
  }

}
