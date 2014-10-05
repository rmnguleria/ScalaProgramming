package Week1

object SquareRoot {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(92); 
  //1+2
  def abs(x: Double): Double = if (x<0) -x else x;System.out.println("""abs: (x: Double)Double""");$skip(314); 
  
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
  
  };System.out.println("""sqrt: (x: Double)Double""");$skip(13); val res$0 = 
  
  sqrt(7);System.out.println("""res0: Double = """ + $show(res$0));$skip(10); val res$1 = 
  sqrt(9);System.out.println("""res1: Double = """ + $show(res$1));$skip(13); val res$2 = 
  sqrt(0.53);System.out.println("""res2: Double = """ + $show(res$2))}
  
}
