### Level order traversal
``` java
/* A binary tree Node
class Node {
    public int data;
    public Node left;
    public Node right;

    // Constructor
    public Node(int val) {
        data = val;
        left = null;
        right = null;
    }
};
*/
import java.util.*;
class Solution {
    public ArrayList<Integer> levelOrder(Node root) {
        ArrayList<Integer> res = new ArrayList<>();
        Deque<Node> bfsQ = new ArrayDeque<>();
        
        bfsQ.addLast(root);
        while (!bfsQ.isEmpty()){
            Node elem = bfsQ.pollFirst();
            res.add(elem.data);
            if(elem.left != null) bfsQ.addLast(elem.left);
            if(elem.right != null) bfsQ.addLast(elem.right);
        }
        
        return res;
    }
}
```
