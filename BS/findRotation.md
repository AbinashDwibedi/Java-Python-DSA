# Find kth rotation
```java 
class Solution {
    public int findKRotation(int arr[]) {
        int count = 0;
        int left = 0;
        int right = arr.length-1;
        while(left <= right){
            if(arr[left] < arr[right]) return left;
            int mid = left + (right - left) / 2;
            if(arr[mid] < arr[right]){
                right = mid;
            }
            else{
                left = mid+1;
            }
        }
        return right;
    }
}
```