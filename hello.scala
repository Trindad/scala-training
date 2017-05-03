object hello{
    def main(args: Array[String]) = {
        // println("Welcome to Scala")

        args.foreach( (arg: String) => println(arg))
        args.foreach(println)
    }
}