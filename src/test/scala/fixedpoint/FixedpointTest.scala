package fixedpoint

import org.scalatest.FunSuite

/**
 * Created by deepak on 1/12/14.
 */

class FixedpointTest extends FunSuite {
  test("testing 1 + x/2") {
    val fp = new Fixedpoint
//    println(fp.fpoint(x => 1 + (x/2)))
    def sqrt(x: Double) = fp.fpoint(y => (y + x/y)/2)
    println(sqrt(2))
  }
}
