import scala.io.StdIn 
@main def hello(): Unit = //entry point to the program
  println("Hello world!")
  
  println("Enter name: ")
  // val name = StdIn.readLine()
  // println(s"Hello, $name")  

  //string builder
    val builder=new StringBuilder
    builder.append("Hi, ")
    builder.append("there !")
    builder.insert(10, "Alice")
    builder.delete(4, 9) // Start index (inclusive), end index (exclusive)
    builder.replace(4, 9, "Bob")
    builder.clear()
    println(builder.toString())

  // Type casting
  val m:Int=5
  val n:Long=m //Implicit Casting
  println(n)

var X:Int=10
val Y:String="Hello"

  