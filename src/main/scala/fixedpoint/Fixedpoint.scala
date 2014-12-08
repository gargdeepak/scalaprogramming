package fixedpoint

/**
 * Created by deepak on 1/12/14.
 */
class Fixedpoint {

  val tol: Double = 0.0001

  def fpoint(fx: Double => Double): Double = {
    def fpoint(fx: Double => Double, est: Double): Double = {
      println("guess: " + est)
      val y: Double = fx(est)
      if(Math.abs(y-est) < tol) est
      else fpoint(fx, y)
    }
    fpoint(fx, 1)
  }
}
