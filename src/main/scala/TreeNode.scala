package main

case class TreeNode(value: Int, left: Option[TreeNode], right: Option[TreeNode])

object TreeNode {
    
    def isSameTree(first: Option[TreeNode], second: Option[TreeNode]): Boolean = {
        
        (first, second) match {
            case (None, None) => true
            case (Some(tr1), Some(tr2)) if (tr1.value == tr2.value) => 
                isSameTree(tr1.left, tr2.left) && isSameTree(tr1.right, tr2.right)
            case _ => false
        }
    }
}