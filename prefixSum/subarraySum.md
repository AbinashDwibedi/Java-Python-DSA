### Indexes of subarray sum 
```java
import java.util.*;

class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        int n = arr.length;
        HashMap<Integer,Integer> lc = new HashMap<>();
        lc.put(0,-1);
        int prefix = 0;
        for(int i = 0;i<n;i++){
            prefix += arr[i];
            
            if(lc.containsKey(prefix -target)){
                return new ArrayList<>(List.of(lc.get(prefix-target)+1,i+1));
            }
            if(!lc.containsKey(prefix)){
                lc.put(prefix,i+1);
            }
        }
        return new ArrayList<>(List.of(-1));
    }
}

```
