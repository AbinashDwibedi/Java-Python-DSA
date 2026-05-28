### Indexes of Subarray Sum 
```java 
import java.util.*;

class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        int sum = 0;
        int n = arr.length;
        int left = 0;
        for(int right = 0; right < n;right++){
            sum += arr[right];

            while(sum > target){
                sum -= arr[left];
                left++;
            }
                        if(sum == target){
                return new ArrayList<>(List.of(left+1,right+1));
            }
        }
        return new ArrayList<>(List.of(-1));
    }
}

```
