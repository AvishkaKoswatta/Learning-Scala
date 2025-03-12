import scala.io.StdIn 
@main def hello(): Unit = //entry point to the program
  println("Hello world!")
  println(msg)
  println("Enter name: ")
  val name = StdIn.readLine()
  println(s"Hello, $name") //s is used to interpolate variables in a string

def msg = "I was compiled by Scala 3. :)"

var X:Int=10
val Y:String="Hello"