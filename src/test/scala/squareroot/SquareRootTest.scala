package squareroot

import org.scalatest.FunSuite

/**
 * Created by deepak on 30/11/14.
 */
class SquareRootTest extends FunSuite {
  test("sqrt 9") {
    val s = new SquareRoot
    println(s.sqrt(9))
    println(s.sqrt(1e-6))
//    println(s.sqrt(9))
    println(s.sqrt(1e60))  //doesn't return

  }
}
