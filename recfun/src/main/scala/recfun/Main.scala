package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
    if (balance("(just an)(( example".toList)) println("Yippy !") else println("Boo!")
    
    println(countChange(4, List(1,2)))
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    if(c==0 || (r == c)) 1 else pascal(c,r-1) + pascal(c-1,r-1)
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    def check(chars: List[Char],count:Int): Boolean = {
      if(chars.isEmpty) (count == 0) else {
        if(chars.head == '(') check(chars.tail,count+1)
        else if(chars.head == ')') {
          if(count==0) false else check(chars.tail,count-1)
        }
        else check(chars.tail,count)
      }
    }
    check(chars,0)
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    def loop(moneyLeft: Int,coins: List[Int]): Int = {
        if(moneyLeft == 0) 1 else if(moneyLeft < 0 || coins.isEmpty) 0 else loop(moneyLeft - coins.head , coins) + loop(moneyLeft , coins.tail)
    }
    loop(money , coins)
  }
}
