###  Longest Subarray with Sum K

#### Java Solution   
```java
// User function Template for Java
import java.util.HashMap;
class Solution {
    public int longestSubarray(int[] arr, int k) {
        HashMap<Integer,Integer> ps = new HashMap<>();
        ps.put(0,-1);
        int prefix = 0;
        int maxLength = 0;
        int n = arr.length;
        for(int i =0;i<n;i++){
            prefix += arr[i];
            if(ps.containsKey(prefix-k)){
                maxLength = Math.max(maxLength,i - ps.get(prefix-k));
                
            }
            if(!ps.containsKey(prefix)){
                ps.put(prefix,i);
            }
        }
        return maxLength;
    }
}

```
#### Python Solution  
```python
class Solution:
    def longestSubarray(self, arr, k):  
        # code here
        prefix = 0
        n = len(arr)
        ps = {0:-1}
        maxLen = 0
        for i in range(n):
            prefix += arr[i]
            if prefix -k in ps:
                maxLen = max(maxLen,i-ps[prefix-k])
            if prefix not in ps:
                ps[prefix] = i
        return maxLen

```
