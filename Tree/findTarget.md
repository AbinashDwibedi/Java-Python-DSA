### pair sum in bst 
```java
/*
class Node {
    int data;
    Node left, right;

    public Node(int d) {
        data = d;
        left = right = null;
    }
}
*/
import java.util.*;
class Solution {
    HashSet<Integer> st = new HashSet<>();
    boolean findTarget(Node root, int target) {
        if(root == null) return false;
        if(st.contains(target - root.data )){
            return true;
        }
        st.add(root.data);
        return findTarget(root.left,target) || findTarget(root.right,target);
    }
}
```
