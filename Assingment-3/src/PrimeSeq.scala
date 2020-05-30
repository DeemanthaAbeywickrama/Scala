//Question-2

object PrimeSeq extends App {
  def max(m:Int,n:Int):Int=n match{
    case 0 => m
    case n if n>m => max(n,m)
    case _ => max(n,m%n)
  
  }
  
  def prime(a:Int,b:Int=2):Any= b match {
    case x if(x==a) => x
    case x if max(a,x)>1 => ""
    case x => prime(a,x+1)
    
  }
  
  print("Enter number:")
  var a = scala.io.StdIn.readInt()
  
  print("Prime numbers are:")
  for(i <- 2 to a){
     print(prime(i))
     print(" ")
  }
}