###  Add Binary Strings
``` java
// User function Template for Java
import java.util.*;
class Solution {
    public String addBinary(String s1, String s2) {
        StringBuilder sb = new StringBuilder();
        int i = s1.length()-1;
        int j = s2.length() -1;
        int carry = 0 ;
        while(i>=0 || j>=0 || carry > 0){
            int a = (i>=0) ? s1.charAt(i--) - '0' : 0;
            int b = (j>=0) ? s2.charAt(j--) - '0' : 0;
            int sum = a+b+carry;
            sb.append(sum%2);
            carry = sum / 2;
        }
        String newString = sb.reverse().toString();
        int k =0;
        while(k < newString.length() && sb.charAt(k) == '0'){
            k++;
        }
        return newString.substring(k);
    }
}
```
