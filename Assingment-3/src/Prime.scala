//Question-1

object Prime extends App { 
  def max(m:Int,n:Int):Int=n match{
    case 0 => m
    case n if n>m => max(n,m)
    case _ => max(n,m%n)
  
  }
  
  def prime(a:Int,b:Int=2):Boolean= b match {
    case x if(x==a) => true
    case x if max(a,x)>1 => false
    case x => prime(a,x+1)
    
  }
  
  print("Enter number:")
  var n = scala.io.StdIn.readInt()
  printf("Prime number is:"+prime(n))

}