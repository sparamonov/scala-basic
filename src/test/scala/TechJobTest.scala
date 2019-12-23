package main

import org.scalatest.FunSuite

class TechJobTest extends FunSuite {
    
    test("FirstCase.groupingChars asdasdaaaweqbbbbasdasd should be aaaaaaassssddddbbbbewq") {
        assert(MyChars.groupingChars("asdasdaaaweqbbbbasdasd") === "aaaaaaassssddddbbbbewq")
    }

    test("TreeNode.isSameTree simple equals test") {
        val first = TreeNode(1, None, None)
        val second = TreeNode(1, None, None)
        assert(TreeNode.isSameTree(Some(first), Some(second)))
    }

    test("TreeNode.isSameTree simple not equals test") {
        val first = TreeNode(1, Some(TreeNode(2, None, None)), None)
        val second = TreeNode(1, None, Some(TreeNode(2, None, None)))
        assert(!TreeNode.isSameTree(Some(first), Some(second)))
    }

    test("TreeNode.isSameTree another equals test") {
        val first = TreeNode(1, Some(TreeNode(2, None, None)), None)
        val second = TreeNode(1, Some(TreeNode(2, None, None)), None) 
        assert(TreeNode.isSameTree(Some(first), Some(second)))
    }

    test("Check Email is null") {
        intercept[IllegalArgumentException] {
            Email(null)
        }
    }

    test("Check Email is empty") {
        intercept[IllegalArgumentException] {
            Email(" ")
        }
    }

    test("Check Email is invalid") {
        intercept[IllegalArgumentException] {
            Email("invalid@invalid")
        }
    }

    test("Check Email is correct") {
        assert(Email("correct@gmail.com").toString() == "correct@gmail.com")
    }
}