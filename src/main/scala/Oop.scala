object OopMain {
  def main(args: Array[String]): Unit = {
    //classes & objects
    class Person(name:String, year:Int){
        val Name:String=name
        val Year:Int=year

        def celebrateBirthday(): Unit=
            val age:Int=2025-Year
            println(s"Happy $age birthday $name !")
        
    }
    val person=Person("Alice", 2000)
    person.celebrateBirthday()

    //Inheritance
    class Employee(name:String, year:Int, role:String) extends Person(name:String, year:Int){
      override def celebrateBirthday(): Unit = 
        val age:Int=2025-Year
        println(s"Happy $age birthday $name !. You are a great $role")
    }
    
    val employee =new Employee("Bob",1995, "SE")
    employee.celebrateBirthday()

  }
}