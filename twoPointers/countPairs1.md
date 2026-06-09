### Pair with given sum in a sorted array
 
```java
// User function Template for Java
import java.util.Arrays;
class Solution {

    int countPairs(int arr[], int target) {
        Arrays.sort(arr);
        int count = 0;
        int n= arr.length;
        int left = 0;
        int right = n-1;
        while (left <right){
            int sum = arr[left] + arr[right];
            if(sum == target){
                if(arr[left] == arr[right]){
                    int tmp = right - left +1;
                    count += ((tmp-1)*tmp)/2;
                    break;
                }
                int cnt1 = 1;
                int cnt2 = 1;
                
                while(left<right-1 && arr[right] == arr[right-1]){
                    cnt1 ++;
                    right--;
                }
                while(left+1<right && arr[left] == arr[left+1]){
                    cnt2 ++;
                    left++;
                }
                count+= cnt1*cnt2;
                right --;
                left ++;
            }
            else if(sum > target){
                right --;
            }
            else{
                left ++;
            }
        }
        return count;
    }
}

```
