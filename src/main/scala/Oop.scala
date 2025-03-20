object OopMain {
  def main(args: Array[String]): Unit = {

    class Person(name:String, year:Int){
        val Name:String=name
        val Year:Int=year

        def celebrateBirthday(): Unit=
            var age:Int=2025-Year
            var wish=println(s"Happy $age birthday $name !")
        
    }
    val person=Person("Alice", 2000)
    person.celebrateBirthday()

  }
}