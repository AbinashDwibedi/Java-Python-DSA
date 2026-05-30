### Equilibrium Point
```java
class Solution {
    public static int findEquilibrium(int arr[]) {
        int n = arr.length;
        int[] ps1 = new int[n];
        int[] ps2 = new int[n];
        int sum1 = 0;
        int sum2 = 0;
        for(int i=0;i<n;i++){
            sum1 += arr[i];
            ps1[i] = sum1;
        }
        for(int i=n-1;i>=0;i--){
            sum2 += arr[i];
            ps2[i] = sum2;
        }
        
        for(int i=0;i<n;i++){
            int leftSide = i==0? 0 : ps1[i-1];
            int rightSide = i==n-1? 0 : ps2[i+1] ;
            if(leftSide == rightSide){
                return i;
            }
        }
        return -1;
    }
}

```
