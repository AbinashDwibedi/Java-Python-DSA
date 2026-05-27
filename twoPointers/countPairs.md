### Count Pairs whose sum is less than target
 
``` java
// User function Template for Java
import java.util.Arrays;
class Solution {
    int countPairs(int arr[], int target) {
        int n = arr.length;
        int left = 0;
        int right = n-1;
        int count = 0;
        Arrays.sort(arr);
        while(left < right){
            int sum = arr[left] + arr[right];
            if(sum < target){
                count += right -left;
                left ++;
            }
            else{
                right --;
            }
        }
        return count;
    }
}
```
