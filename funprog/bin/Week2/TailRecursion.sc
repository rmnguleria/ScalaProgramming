package Week2

object TailRecursion {
	
	def fact1(x: Int): Int =
		if(x==0) 1 else x*fact1(x-1)      //> fact1: (x: Int)Int
	
	def fact2(x:Int): Int = {
		def loop(acc:Int,x: Int):Int = {
			if(x == 0) acc else loop(acc*x , x-1)
		}
		loop(1,x)
	}                                         //> fact2: (x: Int)Int
	
	fact1(4)                                  //> res0: Int = 24
	fact2(4)                                  //> res1: Int = 24
}