//Question-2

object Ticket extends App{
  def audience(c:Int) = (15-c)*20/5+120
  
  def income(c:Int) = c*audience(c)
  
  def expense(c:Int) = audience(c)*3+500
  
  def profit(c:Int) = income(c)-expense(c)
  
  
  print("Enter normal ticket price:")
  var p1 = scala.io.StdIn.readInt()
  print("Enter increase ticket price:")
  var p2 = scala.io.StdIn.readInt()
  print("Enter decrease ticket price:")
  var p3 = scala.io.StdIn.readInt()
  
  println("Normal ticket price profit:"+profit(p1))
  println("Increase ticket price  profit:"+profit(p2))
  println("Decrease ticket price profit:"+profit(p3))
  
  
}