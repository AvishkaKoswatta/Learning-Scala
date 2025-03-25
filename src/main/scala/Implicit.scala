object IntExtensions{
    def main(args: Array[String]): Unit = {
    implicit class RIchInt(value: Int){
        def isEven(): Boolean =
            value%2==0
    }

    println(3.isEven())
    // like in built methods for int, string etc wecan add our own methods to them using implicit classes

}
}


