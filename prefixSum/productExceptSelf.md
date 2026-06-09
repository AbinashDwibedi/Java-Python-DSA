### 
```java
class Solution {
    public static int[] productExceptSelf(int arr[]) {
        int n = arr.length;
        int[] leftP = new int[n];
        int[] rightP = new int[n];
        int[] res = new int[n];
        int p1 = 1;
        int p2 = 1;
        for(int i = 0 ;i<n;i++){
            int idx = (n-1) -i;
            p1 *= arr[i];
            p2 *= arr[idx];
            leftP[i] = p1;
            rightP[idx] = p2;
        }
        for(int i = 0;i<n;i++){
            int num1 = i == 0? 1: leftP[i-1];
            int num2 = i == n-1? 1: rightP[i+1];
            res[i] = num1*num2;
        }
        return res;
    }
}

```
