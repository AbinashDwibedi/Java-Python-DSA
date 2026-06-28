class TreeNode{
    int data;
    TreeNode left ;
    TreeNode right;

    public TreeNode(int data) {
        this.data = data;
    }
    
}

class BST{
    TreeNode root ;
    private TreeNode insertHelper(TreeNode node, int value){
        if(node == null){
            TreeNode newNode = new TreeNode(value);
            return newNode;
        }
        if (node.data < value){
            node.right = insertHelper(node.right, value);
        }
        else{
            node.left = insertHelper(node.left, value);
        }
        return node;
    }
    public void insert(int value){
        this.root = insertHelper(root, value);
    }
    private TreeNode deleteHelper(TreeNode node, int value){
        if(node == null) return null;
        if(node.data < value) {
            node.right = deleteHelper(node.right, value);
        }
        else if(node.data > value){
            node.left = deleteHelper(node.left, value);
        }
        else{
            if(node.left == null){
                return node.right;    
            }
            if(node.right == null){
                return node.left;
            }
            TreeNode successor = findMin(node.right);
            node.data = successor.data;
            node.right = deleteHelper(node.right, successor.data);
        }
        return node;
    }
    public void delete(int value){
        this.root = deleteHelper(root,value);
    }
    private TreeNode findMin(TreeNode node){
        while(node.left!=null){
            node = node.left;
        }
        return node;
    }
    private void inorderHelper(TreeNode node){
        if(node == null) return;
        inorderHelper(node.left);
        System.out.print(node.data + " -> ");
        inorderHelper(node.right);
    }
    public void inorder(){
        inorderHelper(root);
        System.out.println();
    }
    public static void main(String[] args) {
        BST bst = new BST();
        bst.insert(234);
        bst.insert(23434);
        bst.insert(544);
        bst.insert(6445);

        bst.inorder();

        bst.delete(6445);
        bst.inorder();
    }
}