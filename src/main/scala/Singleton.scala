object SingletonObject {
    def logMessage(message:String): Unit={
        println(s"Log: $message")
    }
}

object Main extends App {
    SingletonObject.logMessage("Hello")
}