### Check for BST 
```java
/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public boolean isBST(Node root) {
        return helper(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    private boolean helper(Node root,int minVal,int maxVal){
        if(root == null ) return true;
        
        if(root.data <= minVal || root.data >= maxVal){
            return false;
        }
        
        return helper(root.left, minVal, root.data) && helper(root.right,root.data,maxVal);
        
    }
}
```
