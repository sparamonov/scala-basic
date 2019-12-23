package main

import scala.io.StdIn.readLine
import io.AnsiColor._

object TechJob extends App {
    
    val testStr = "asdasdaaaweqbbbbasdasd"
    println("GroupingChars - " + MyChars.groupingChars(testStr))

    val first = TreeNode(1, None, None)
    val second = TreeNode(1, None, None)
    println("ComparingTrees - " + TreeNode.isSameTree(Some(first), Some(second)))

    print("Enter your email address: ")
    try {
        Email(readLine())
        println(s"${BLUE}Correct email address")
    } catch {
        case ex: IllegalArgumentException => println(s"${RED}Invalid email address")
    }
}