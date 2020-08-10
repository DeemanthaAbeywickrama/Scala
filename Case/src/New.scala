import scala.math.pow

object New extends App {
  
  val p1 = Point(5,3)
  val p2 = Point(10,6)
  
  println(p1+p2)
  println(p1.move(4,5))
  println(p1.dist(p2))
  println(p1.invert())
}

case class Point(x:Int,y:Int){
  
  def +(p:Point) = Point(this.x+p.x,this.y+p.y)
  def move(i:Int,j:Int) = Point(this.x+i,this.y+j)
  def dist(p:Point) = {
    val i = scala.math.pow(p.x-this.x,2.0)
    val j= scala.math.pow(p.y-this.y,2.0)
    
    scala.math.pow(i+j,0.5)
  }
  def invert() = Point(this.y,this.x)
}