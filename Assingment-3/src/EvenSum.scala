//Question-5

object EvenSum extends App {
  
  def determine(y:Int):Int = y match{
    case y if(y==0) => sumeven(y)
    case y if(y==1) => sumeven(y-1)
    case y if(y<0) => determine(-y)
    case _ => determine(y-2)
  }
  
  def sumeven(n:Int):Int = n match{
    case n if(n==2) => 0
    case _ => n+sumeven(n-2)
    
    
  }
  
  print("Enter number:")
  var m = scala.io.StdIn.readInt()
  print("Addition of even numbers:"+determine(m))
}
