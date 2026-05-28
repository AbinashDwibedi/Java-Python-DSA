### Longest substring with distinct characters
 
```java
class Solution {
    public int longestUniqueSubstr(String s) {
        int n = s.length();
        int[] charArr = new int[26];
        int left = 0;
        int maxLen = Integer.MIN_VALUE;
        for(int right = 0;right<n;right++){
            int ch = s.charAt(right) - 'a';
            while(charArr[ch] == 1){
                int nch = s.charAt(left) - 'a';
                charArr[nch] =0;
                left++;
            }
            charArr[ch] = 1;
            maxLen = Math.max(maxLen, right-left+1);
        }
        return maxLen;
    }
}
```
