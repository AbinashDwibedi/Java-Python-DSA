### Count the number of possible triangles 
```java
import java.util.*;

class Solution {
    public int countTriangles(int arr[]) {
        Arrays.sort(arr);
        int n = arr.length;
        int count = 0;
        for(int i = n-1;i>= 2;i--){
            int left = 0;
            int right = i-1;
            while(left < right){
                int sum = arr[left] + arr[right];
                if(sum > arr[i]){
                    
                    count += right - left;
                    right--;
                }
                else{
                    left++;
                }
            }
        }
        return count;
    }
}
```
