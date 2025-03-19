import scala.compiletime.ops.double
object LoopMain {
  def main(args: Array[String]): Unit = {

    //while
    var x=0
    while (x<5) { 
        x=x+1
        println(x)
    }

    //simple for loop
    var i=0
    for (i <- 1 to 5){
        println(i)
    }
    for (i <- 1 until 6){
        println(i)
    }

    //multipe range
    var j=0
    for (i <- 1 to 3; j <- 1 to 5){
        println(i*j)
    }

    //iterate through collections
    val list1=List(1,2,3,4,5,6,7,8,9,10)
    val m=0
    for (m <- list1){
      println(m)
    }

    //with conditions
    for(m <- list1
    if m!=2; if m < 7){
        println(m)
    }

    //Yield 
    val numList=List(1,2,3,4,5)
    val retVal = for {x <- numList if x < 4; if x!=3}yield x
    for (x <- retVal){
      println(x)
    }


  }
}