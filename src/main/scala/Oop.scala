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



    //Abstract
    abstract class Animal{
      def sound():String //Abstract method (no implementation)
      def action():String= //Concrete method (has implementation)
        "sleeping.."
    } 
    class Dog extends Animal{
      def sound():String=
        "Woof"
    }
    class Cat extends Animal{
      def sound():String=
        "Meow"
    }
    val dog=new Dog()
    val cat=new Cat()

    println(dog.sound())
    println(cat.sound())
    println(dog.action())


    


  }
}