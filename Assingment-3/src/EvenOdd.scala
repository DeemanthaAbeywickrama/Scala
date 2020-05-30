//Question-4

object EvenOdd extends App {
  
  def determine(y:Int):Boolean = y match{
    case y if(y==0) => true
    case y if(y==1) => false
    case y if(y<0) => determine(-y)
    case _ => determine(y-2)
  }
  
  def display(x:Int):String = x match{
    case x if(determine(x)) => "Even number!"
    case _ => "Odd number!"
  }
  
  print("Enter number:")
  var n = scala.io.StdIn.readInt()
  
  print(display(n))
}