object IntExtensions{
    def main(args: Array[String]): Unit = {
    implicit class RIchInt(value: Int){
        def isEven(): Boolean =
            value%2==0
    }

    println(3.isEven())
    // like in built methods for int, string etc wecan add our own methods to them using implicit classes


    //case class
    case class Person(name:String, age:Int)

    val p1=Person("alice", 20) //No need to use new when creating an object here
    println(p1.name)

    val p2=Person("bob",30)
    println(p1==p2) //here compare values instead of object references. Other classes it compare objects in memory. 
    //If two different objects have same memory and age, they give false beacuse two objects. 
    //But in scala will give true as it compare values.

    val p3=p1.copy(age=21) //creates a new object with some modified values
    println(p3)

}
}


