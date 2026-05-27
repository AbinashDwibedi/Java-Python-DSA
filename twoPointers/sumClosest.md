### Sum Pair closest to target
 

```java
import java.util.*;
class Solution {
    public ArrayList<Integer> sumClosest(int[] arr, int target) {
        int n = arr.length;
        int left = 0;
        int right = n-1;
        Arrays.sort(arr);
        ArrayList<Integer> list = new ArrayList<>();
        int diffSF = Integer.MAX_VALUE;
        while(left<right){
            int sum = arr[left] + arr[right];
            int diff = Math.abs(sum - target);
            if(diffSF > diff){
                list.clear();
                list.add(arr[left]);
                list.add(arr[right]);
                diffSF = diff;
            }
            if(sum < target){
                left++;
            }
            else{
                right --;
            }
        }
        return list;
        
    }
}

```
