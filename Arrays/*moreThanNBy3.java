import java.util.*;
class Solution {
    public ArrayList<Integer> findMajority(int[] arr) {
        // Code here
        Map<Integer, Integer> numMap = new HashMap<>();
        int n = arr.length;
        for(int num:arr){
            if(numMap.containsKey(num)){ /// there is nothing called contains its contains key
                numMap.put(num,numMap.get(num)+1);
            }
            else{
                numMap.put(num,1);
            }
        }
        int rl = (int) Math.floor(n/3);
        ArrayList<Integer> res = new ArrayList<>();
        for(Map.Entry<Integer,Integer> ent:numMap.entrySet()){// there is nothing called entries() in java.
            if(ent.getValue() > rl){
                res.add(ent.getKey()); // ent.getKey() and ent.getValue() to get the values 
            }
        }
        res.sort((a,b)-> a-b);
        return res;
    }
}