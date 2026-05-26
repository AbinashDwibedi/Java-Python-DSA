### Non Repeating Character

#### Using LinkedHashMap
``` java
import java.util.LinkedHashMap;
import java.util.Map;
class Solution {
    public char nonRepeatingChar(String s) {
        LinkedHashMap<Character, Integer> chars = new LinkedHashMap<>();
        for(int i= 0;i<s.length();i++){
            Character ch = s.charAt(i);
            if(!chars.containsKey(ch)){
                chars.put(ch,1);
            }
            else{
                chars.put(ch,chars.get(ch)+1);
            }
        }
        
        for(Map.Entry<Character, Integer> entry : chars.entrySet()){
            if(entry.getValue() == 1) return entry.getKey();
        }
        return '$';
    }
}
```
#### Using Array
```java
import java.util.LinkedHashMap;
import java.util.Map;
class Solution {
    public char nonRepeatingChar(String s) {
        char[] arr = new char[26];
        for(int i =0 ;i< s.length() ; i++){
            arr[s.charAt(i) - 'a']++;
        }
        
        for(int i =0;i<s.length(); i++){
            if(arr[s.charAt(i)-'a'] == 1) return s.charAt(i);
        }
        return '$';
    }
}

```
