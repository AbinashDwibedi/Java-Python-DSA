### Implement Atoi. 
```java
class Solution {
    public int myAtoi(String s) {
        // code here

        long number = 0;
        boolean neg = false;
        s = s.trim();
        if(s.length() == 0) return 0;
        int i = 0;
        if(s.charAt(0) == '-' || s.charAt(0) == '+'){
            neg = s.charAt(0) == '-';
            i++;
        }

        while(i < s.length() && s.charAt(i) == '0'){
            i++;
        }
        while(i!= s.length() && s.charAt(i) >= '0' && s.charAt(i)<='9'){
            int num = s.charAt(i) - '0';
            number = number*10 + num;
            i++;
        }
        if(number==0) return 0;
        if(neg) number = -number;
        if(number > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        else if(number < Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }
        return (int) number;
    }
}
```
