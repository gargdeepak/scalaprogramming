package product

/**
 * Created by deepak on 1/12/14.
 */
class Product {

  def prod(acc: Int, start: Int, end: Int): Int = {
    if (start > end) acc
    else prod(acc*start, start + 1, end)
  }

  def factorial(n: Int): Int = {
    prod(1, 1, n)
  }

  def sum(acc: Int, start: Int, end: Int): Int = {
    if( start > end ) acc
    else sum(acc + start, start+1, end)
  }

  def gen(f: (Int, Int) => Int, acc: Int, start: Int, end: Int): Int = {
    if( start > end ) acc
    else gen(f, f(acc, start), start+1, end)
  }
  
}
