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
        Node ptr1 = head;
        Node ptr2 = head;
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        while(ptr2.next != null){
            ptr2 = ptr2.next;
        }
        while(ptr1 != null && ptr2 != null && ptr1 != ptr2 && ptr2.next != ptr1){
            int sum = ptr1.data + ptr2.data;
            if(sum == target){
                res.add(new ArrayList<>(List.of(ptr1.data,ptr2.data)));
                ptr1 = ptr1.next;
                ptr2 = ptr2.prev;
            }
            else if(sum < target){
                ptr1 = ptr1.next;
            }
            else{
                ptr2 = ptr2.prev;
            }
        }
        return res;
    }
}








```