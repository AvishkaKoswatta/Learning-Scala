import scala.collection.mutable.WrappedArray
object ArrayMain {
  def main(args: Array[String]): Unit = {
    //create an array
    val fruits = Array("Apple", "Banana", "Orange")
    println(fruits(0))  
    
    //change an element
    val numbers=Array(1,3,2,7,9)
    numbers(0)=4
    println(numbers.mkString(", "))
    
    //length of an array
    println(numbers.length)

    //loop through an array


    //concatenation
    val arr1=Array(1,2,3)
    val arr2=Array(4,5,6)
    println((arr1 ++ arr2).mkString(", "))

    //sort
    println(numbers.sorted.mkString(", "))

    //filter
    val evenNumbers=numbers.filter(_ %2==0)
    println("Even:"+evenNumbers.mkString(", "))

    //map
    val double=numbers.map(_ * 2)
    println("Double:"+double.mkString(", "))

    //empty array
    val emptyArray=Array.empty[Int]
    val sizedArray = new Array[String](3)

    //Scala wraped array
    val wrapped = WrappedArray.make(numbers)

  }

    
}
