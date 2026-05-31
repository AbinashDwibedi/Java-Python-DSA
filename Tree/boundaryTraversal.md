### Tree boundary traversal  
```java
/*
Definition for Node
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/
import java.util.*;
class Solution {
    ArrayList<Integer> res = new ArrayList<>();
    ArrayList<Integer> boundaryTraversal(Node root) {
        res.add(root.data);
        if(root.left == null && root.right == null) return res;
        leftTra(root.left);
        leafNode(root);
        rightTra(root.right);
        return res;
    }
    private void leftTra(Node root){
        while(root!=null){
            if(!(root.left ==null && root.right == null)){
                res.add(root.data);
            }
            if(root.left != null){
                root = root.left;
            }
            else{
                root = root.right;
            }
        }
    }
    private void rightTra(Node root){
        Stack<Integer> st = new Stack<>();
        while(root!=null){
            if(!(root.left == null && root.right == null)){
                st.push(root.data);
            }
            if(root.right != null){
                root = root.right;
            }
            else{
                root = root.left;
            }
        }
        while(!st.isEmpty()){
            res.add(st.pop());
        }
    }
    private void leafNode(Node root){
        if(root == null) return;
        if(root.left == null && root.right == null){
            res.add(root.data);
            return;
        }
        leafNode(root.left);
        leafNode(root.right);
    }
}
```
