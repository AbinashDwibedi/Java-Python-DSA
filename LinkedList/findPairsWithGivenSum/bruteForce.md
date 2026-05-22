### 
``` java
/*

Definition for singly Link List Node
class Node
{
    int data;
    Node next,prev;

    Node(int x){
        data = x;
        next = null;
        prev = null;
    }
}

You can also use the following for printing the link list.
Node.printList(Node node);
*/

class Solution {

    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target,
                                                                      Node head) {
        // code here
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        List<Integer> nums = new ArrayList<>();
        Node temp = head;
        while(temp!=null) {
            nums.add(temp.data);
            temp = temp.next;
        }
        for(int i = 0;i<nums.size();i++){
            for(int j = i+1;j<nums.size();j++){
                if(i!=j){
                    if(nums.get(i) + nums.get(j) == target){
                        res.add(new ArrayList<>(List.of(nums.get(i),nums.get(j))));
                    }
                }
            }
        }
        return res;
    }
}

```