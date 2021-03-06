package Week1

object SquareRoot {
  //1+2
  def abs(x: Double): Double = if (x<0) -x else x //> abs: (x: Double)Double
  
  def sqrt(x:Double): Double = {
  
  def sqrtIter(guess: Double): Double = {
  	if(isGoodEnough(guess)) guess
  	else sqrtIter(improve(guess))
  }
  
  def isGoodEnough(guess: Double): Boolean =
  	abs(guess*guess - x) < 0.000001
  	
  def improve(y: Double):Double =
  	(y + x/y)/2;
  
  sqrtIter(1.0)
  
  }                                               //> sqrt: (x: Double)Double
  
  sqrt(7)                                         //> res0: Double = 2.6457513111113693
  sqrt(9)                                         //> res1: Double = 3.000000001396984
  sqrt(0.53)                                      //> res2: Double = 0.7280115374663544
  
}