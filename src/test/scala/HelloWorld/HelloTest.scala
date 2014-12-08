package HelloWorld

import org.scalatest.FunSuite

/**
 * Created by deepak on 30/11/14.
 */
class HelloTest extends FunSuite {

  test("say hlloe creation"){
    val hello = new Hello
    hello.main(null)
  }
}
