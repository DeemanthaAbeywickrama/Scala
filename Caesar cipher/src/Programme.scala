

object Programme extends App {
  def caesar () {
    val al = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    
    val pass = (number.toInt + al.size) % al.size
    
    val result = message.map((c:Char) => {
      val x = al.indexOf(c.toUpper)
      if(x == -1) c
      else al((x + pass) % al.size)
    })
    print("Secret message:"+result)

  }
  print("Message:")
  val message = scala.io.StdIn.readLine()
  print("Key:")
  val number = scala.io.StdIn.readInt()
  caesar()
}