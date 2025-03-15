object ConditionalMain {
  def main(args: Array[String]): Unit = {
    //if-else
    val age=20
    if age>=18 then
        println("Adult")
    else if age>=13 then
        println("Teenager")
    else 
        println("Child")

    //match
    val day="Monday"
    val today=day match{
        case "Monday" => "Today"
        case "Tuesday" => "Tomorrow"
        case _ => "Some other day"
    }    
    println(today)

  }
}