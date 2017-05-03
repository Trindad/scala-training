object array_test
{
    def main(args: Array[String]) = 
    {
        val greetStrings: Array[String] = new Array[String](3)
        greetStrings(0) = "Hello"
        greetStrings(1) = " "
        greetStrings(2) = "World!\n"

        greetStrings.update(0, "Hi")
        greetStrings.update(1,",")
        greetStrings.update(2,"Scala\n")
        // greetStrings.foreach( println )

    //     for( i <- 0 to 2) {
    //         print(greetStrings(i))
    //     }
    // }

        for( i <- 0.to(2) ) 
            print(greetStrings.apply(i))

        val n1 = Array.apply("a", "c", "d")
        val n2 = List(1,2,3)
        val n3 = List(3,4,5)
        val n4 = n2 ::: n3

        println(n4) 

    }
}