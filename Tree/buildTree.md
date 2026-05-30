### Construct Tree from Inorder & Preorder
 
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
    private static int index = 0;
    private static Map<Integer, Integer> pm = new HashMap<>();
    public static Node buildTree(int inorder[], int preorder[]) {
        pm.clear();
        index = 0;
        for(int i=0;i<inorder.length;i++){
            pm.put(inorder[i],i);
        }
        return helper(preorder, 0, preorder.length-1);
    }
    private static Node helper(int preorder[], int left, int right){
        if (left > right) return null;
        int val = preorder[index++];
        Node root = new Node(val);
        
        int mid = pm.get(val);
        root.left = helper(preorder,left,mid-1);
        root.right =helper(preorder,mid+1,right);
        
        return root;
    }
}
```
