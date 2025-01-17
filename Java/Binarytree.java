//Java Program to implement InOrder traversal of a Binary tree
// input:
//             40
//            / \ 
//          20   50  
//          / \   \ 
//        10  30   60 
//       /   /  \ 
//       5  67  78

//output: 5 10 20 30 40 50 60 67 78


//Java Program to traverse a binary tree * using inorder traversal without recursion.


import java.util.Stack;
public class Main { public static void main(String[] args)
  throws Exception { 
  // construct the binary tree given in question 
  BinaryTree bt = BinaryTree.create(); 
  // traversing binary tree using InOrder traversal using recursion 
  System.out .println("printing nodes of binary tree on InOrder using recursion");
  bt.inOrder();
  }
} 
class BinaryTree { 
  static class TreeNode {
    String data;
    TreeNode left, right;
    TreeNode(String value) { 
      this.data = value;
      left = right = null;
    } 
  } 
  public void inOrder() {
inOrder(root);
  }
  private void inOrder(TreeNode node) {
    if (node == null) { 
      return;
    } 
    inOrder(node.left);
    System.out.printf("%s ", node.data);
    inOrder(node.right); 
  }
  public static BinaryTree create() {
    BinaryTree tree = new BinaryTree();
    TreeNode root = new TreeNode("40"); 
    tree.root = root;
    tree.root.left = new TreeNode("20");
    tree.root.left.left = new TreeNode("10");
    tree.root.left.left.left = new TreeNode("5");
    
    tree.root.left.right = new TreeNode("30");
    tree.root.right = new TreeNode("50");
    tree.root.right.right = new TreeNode("60");
    tree.root.left.right.left = new TreeNode("67");
    tree.root.left.right.right = new TreeNode("78");
    
    return tree;
  }

}

// Output printing nodes of binary tree on InOrder using recursion
// 5 10 20 30 67 78 40 50 60


