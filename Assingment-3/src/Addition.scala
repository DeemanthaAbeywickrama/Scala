//Question-3

object Addition extends App {
  
  def add(x:Int):Int = x match{
    case x if(x==0) => 0
    case _ => x+add(x-1)
  }
  
  print("Enter number:")
  var n = scala.io.StdIn.readInt()
  
  print("Addition:"+add(n))
}