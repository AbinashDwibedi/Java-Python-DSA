### Anagram
``` java
class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        if(m!=n) return false;
        
        HashMap<Character, Integer> hs1 = new HashMap<>();
        HashMap<Character, Integer> hs2 = new HashMap<>();
        
        for(int i=0;i<m;i++){
            Character ch1 = s1.charAt(i);
            if(!hs1.containsKey(ch1)){
                hs1.put(ch1,1);
            }
            else{
                hs1.put(ch1,hs1.get(ch1)+1);
            }
            Character ch2 = s2.charAt(i);
            if(!hs2.containsKey(ch2)){
                hs2.put(ch2,1);
            }
            else{
                hs2.put(ch2,hs2.get(ch2)+1);
            }
        }
        
        for(Map.Entry<Character, Integer> entry: hs1.entrySet()){
            var value = hs2.getOrDefault(entry.getKey(),null);
            if(value == null || !value.equals(entry.getValue())){
                return false;
            }
        }
        return true;
    }
}
```
