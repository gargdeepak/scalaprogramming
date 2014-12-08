package squareroot

/**
 * Created by deepak on 30/11/14.
 */
class SquareRoot {

  val tolerance = 0.0001

  def sqrt(x: Double):Double =
    sqrt(1, x)

  def abs(value: Double) =
    if(value>=0) value
    else -value

  def square(d: Double) = d*d

  def sqrt(est: Double, x: Double): Double =
    if( abs(square(est) - x )/x < tolerance ) est
    else sqrt( (est + x/est)/2, x)
}
