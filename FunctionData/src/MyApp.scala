

object MyApp extends App{
 val x = new Rational(3,4)
 val y = new Rational(5,8)
 val z = new Rational(2,7)
 val result = x.sub(y).sub(z)
 println(result)
  
}

class Rational(x:Int,y:Int){
  def numer = x
  def denom = y
  
  def add(r:Rational) = new Rational(numer*r.denom+
      r.numer*denom,denom*r.denom)
  
  def neg:Rational = new Rational(-numer,denom)
  
  def sub(r:Rational) = add(r.neg)
  
  override def toString = numer + "/" + denom
}