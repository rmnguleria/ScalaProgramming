package Week2

object TailRecursion {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(96); 
	
	def fact1(x: Int): Int =
		if(x==0) 1 else x*fact1(x-1);System.out.println("""fact1: (x: Int)Int""");$skip(124); 
	
	def fact2(x:Int): Int = {
		def loop(acc:Int,x: Int):Int = {
			if(x == 0) acc else loop(acc*x , x-1)
		}
		loop(1,x)
	};System.out.println("""fact2: (x: Int)Int""");$skip(12); val res$0 = 
	
	fact1(4);System.out.println("""res0: Int = """ + $show(res$0));$skip(10); val res$1 = 
	fact2(4);System.out.println("""res1: Int = """ + $show(res$1))}
}
