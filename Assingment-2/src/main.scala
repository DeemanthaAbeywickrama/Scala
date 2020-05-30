// Question-1

object Main extends App{
  
  def normal(t:Double) = t*150
  
  def ot(t:Double) = t*70
  
  def amount(x:Double,y:Double) = normal(x)+ot(y)
  
  def tax(x:Double,y:Double) = amount(x, y)*0.1
  
  def finalamount(x:Double,y:Double) = amount(x, y)-tax(x, y)
  
  
  print("Enter normal work hours:")
  var a = scala.io.StdIn.readInt()
  
  print("Enter OT hours:")
  var b = scala.io.StdIn.readInt()
  
  
  
  println("Final salary:"+finalamount(a,b))
  
}