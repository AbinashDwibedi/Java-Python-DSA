### Count Distinct
```java
import java.util.*;
class Solution {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        int n = arr.length;
        int i = 0;
        ArrayList<Integer> res = new ArrayList<>();
        HashMap<Integer,Integer> keep = new HashMap<>();
        int count = 0;
        for(;i<k;i++){
            if(!keep.containsKey(arr[i])){
                keep.put(arr[i],1);
                count++;
            }
            else{
                keep.put(arr[i], keep.get(arr[i])+1);
            }
        }
        res.add(count);
        for(;i<n;i++){
            int val = keep.get(arr[i-k]);
            if(val == 1){
                count --;
                keep.remove(arr[i-k]);
            }
            else{
                keep.put(arr[i-k],val-1);
            }
            if(!keep.containsKey(arr[i])){
                count++;
                keep.put(arr[i],1);
            }
            else{
                keep.put(arr[i],keep.get(arr[i])+1);
            }
            res.add(count);
        }
        return res;
    }
}
```
