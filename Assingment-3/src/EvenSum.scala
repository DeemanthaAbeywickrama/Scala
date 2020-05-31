

object EvenSum extends App{
  def isEven(n: Int): Boolean = {
    if (n == 0)  true
    else if (n == 1)  false
    else isEven(n - 2)
  }

  def EvenSum(n:Int):Int={
    if (n==2) {
      0
    }
    else{
      if (isEven(n-1)) n-1 +EvenSum(n-1)
      else EvenSum(n-1)
    }

  }
  
  print("Enter number:")
  var c = scala.io.StdIn.readInt()
  println("Sum of even numbers:"+EvenSum(c))
}