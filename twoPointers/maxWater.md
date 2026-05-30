### Container with most water 
#### brute force 
```java
class Solution {
    public int maxWater(int arr[]) {
        //brute force 
        int n = arr.length;
        if(n==1){
            return 0;
        }
        int res = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++){
            for(int j =i+1;j<n;j++){
                int area = (Math.min(arr[i],arr[j]))*(j-i);
                res = Math.max(res,area);
            }
        }
        return res;
    }
}
```
#### optimized solution 
```java
class Solution {
    public int maxWater(int arr[]) {
        //optimized solution
        int n = arr.length;
        if(n==1) return 0;
        int left = 0;
        int right = n-1;
        int maxHeight = Integer.MIN_VALUE;
        while(left < right){
            int area = (Math.min(arr[left],arr[right]))*(right-left);
            maxHeight = Math.max(maxHeight, area);
            if(arr[left] >= arr[right]){
                right--;
            }
            else{
                left++;
            }
        }
        return maxHeight;
 
    }
}
```
