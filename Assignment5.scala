

object Assignment4567 extends App {
  /*Write a Scala program to get the largest element of an array using reduceLeft*/
  
  println(Array(20, 12, 6, 35, 2, 90,23).reduceLeft(_ max _))
  
    /*Implement the factorial function using to and reduceLeft, without a loop or recursion*/

val factorial = (x: Int) => if (x==0) 1 else (x to 1 by -1).reduceLeft(_ * _)
  
println(factorial(10))

/*
 * Write a Scala code which reverses the lines of a file (makes the first line as the last one, and so on)
 * 
 *  */

val source = io.Source.fromFile("C:/Aparna/Hadoop/Assignment-Module2/src/Test.txt")
val lines = source.getLines.toArray
println(lines.reverse.mkString)
 
/*
 * Write a Scala code which reads a file and prints all words with more than 10 characters.
 * */
val longWords = for(a <- io.Source.fromFile("C:/Aparna/Hadoop/Assignment-Module2/src/Test.txt").mkString.split(' ') if a.length >= 10) yield a

println(longWords.foreach(println))

}
