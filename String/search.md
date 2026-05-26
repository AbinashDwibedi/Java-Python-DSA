### Search Pattern
```java
class Solution {
    ArrayList<Integer> search(String pat, String txt) {
        int m = pat.length();
        int n = txt.length();
        int[] larr = this.lps(pat);
        int i = 0;
        int j = 0;
        ArrayList<Integer> res = new ArrayList<>();
        while(i<n){
            if(txt.charAt(i) == pat.charAt(j)){
                i++;
                j++;
            }
            
            if(j == m){
                res.add(i-j);
                j = larr[j-1];
            }
            else if(i<n && txt.charAt(i) != pat.charAt(j)){
                if(j!=0){
                    j = larr[j-1];
                }
                else{
                    
                    i++;
                }
            }
            
        }
        return res;
    }
    private int[] lps(String pat){
        int m = pat.length();
        int[] larr = new int[m];
        int i = 1;
        int len = 0;
        while(i<m){
            if(pat.charAt(i) == pat.charAt(len)){
                len++;
                larr[i] = len;
                i++;
            }
            else{
                if(len != 0){
                    len = larr[len-1];
                }
                else{
                    larr[i] = 0;
                    i++;
                }
            }
        }
        return larr;
    }
}
```
