object Funtional extends App{
  
  def temperature(z:Double):Double = z * 1.8 + 32;
  println("Temperature:" + temperature(35));
  
  
  def volume(r:Double):Double = 4.0/3.0 * 22.0/7.0 * (r*r*r);
  println("Volume:" + volume(5));
  
  
  def count(x:Double):Double={
    if(x>=50){
      (24.95*x)-(24.95*x*0.4)+(3*50)+(0.75*(x-50));
    }else{
      (24.95*x)-(24.95*x*0.4)+(3*x);
    }
      
  } 
  
  println("Total price of books:" + count(60));
 
}
