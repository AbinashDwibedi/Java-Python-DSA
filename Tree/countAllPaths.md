### k sum paths 
```java
/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/
import java.util.*;
class Solution {
    HashMap<Integer, Integer> mp = new HashMap<>();
    
    int count = 0;
    public int countAllPaths(Node root, int k) {
        mp.put(0,1);
        dps(root,0,k);
        return count;
    }
    private void dps(Node root,int pSum, int k){
        if(root == null) return;
        pSum += root.data;
        if(mp.containsKey(pSum - k)){
            count += mp.get(pSum-k);
        }
        mp.put(pSum, mp.getOrDefault(pSum,0) +1);
        
        dps(root.left,pSum,k);
        dps(root.right,pSum,k);
        
        mp.put(pSum, mp.get(pSum) -1);
    }
}

```
