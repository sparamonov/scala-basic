package main

object TechJob extends App {
    
    val testStr = "asdasdaaaweqbbbbasdasd"
    println("GroupingChars - " + MyChars.groupingChars(testStr))

    val first = TreeNode(1, None, None)
    val second = TreeNode(1, None, None)
    println("ComparingTrees - " + TreeNode.isSameTree(Some(first), Some(second)))
}