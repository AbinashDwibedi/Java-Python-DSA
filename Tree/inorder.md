### inorder traversal
```java
/*
class Node {
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    public ArrayList<Integer> inOrder(Node root) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        this.inorder(root,res);
        return res;
    }
    private void inorder(Node root,ArrayList<Integer> res){
        if(root == null ){
            return ;
        }
        inorder(root.left, res);
        res.add(root.data);
        inorder(root.right, res);
    }
}
```
