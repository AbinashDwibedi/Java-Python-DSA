### Count all triplets with given sum in sorted array
 
```java

import java.util.*;
class Solution {
    public int countTriplets(int[] arr, int target) {
        Arrays.sort(arr);
        int n = arr.length;
        int count = 0;
        for(int i =0;i<n-2;i++){
            int left = i+1;
            int right = n-1;
            while(left < right){
                int sum = arr[left]+arr[right]+arr[i];
                if(sum == target){
                    if(arr[left] == arr[right]){
                        int nl = right - left +1;
                        count += (nl*(nl-1))/2;
                        break;
                    }
                    int cnt1 = 1;
                    int cnt2 = 1;
                    while(left +1< right && arr[right] == arr[right-1]){
                        cnt1++;
                        right--;
                    } 
                    while(left < right-1 && arr[left] == arr[left+1]){
                        cnt2++;
                        left++;
                    } 
                    
                    count += cnt1*cnt2;
                    left++;
                    right--;
                }
                else if(sum < target){
                    left++;
                }
                else{
                    right--;
                }
                
            }
        }
        return count;
    }
}
```
