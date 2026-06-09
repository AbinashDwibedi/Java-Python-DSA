### Largest subarray of 0's and 1's
 
```java
import java.util.*;

class Solution {
    public int maxLen(int[] arr) {
        int prefix = 0;
        int n = arr.length;
        HashMap<Integer, Integer> ps = new HashMap<>();
        ps.put(0,-1);
        int maxLength = 0;
        for(int i=0;i<n;i++){
            prefix += arr[i] == 1 ? 1 : -1;
            if(ps.containsKey(prefix)){
                maxLength = Math.max(maxLength, i - ps.get(prefix));
            }
            
            if(!ps.containsKey(prefix)){
                ps.put(prefix,i);
            }
        }
        return maxLength;
    }
}
```
