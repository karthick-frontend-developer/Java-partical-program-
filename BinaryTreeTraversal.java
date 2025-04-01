class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val) { this.val = val; }
}
public class BinaryTreeTraversal {
    static void preorder(TreeNode root) {
         if (root != null) { 
            System.out.print(root.val + " "); 
            preorder(root.left); 
            preorder(root.right); } }
    static void inorder(TreeNode root) { 
        if (root != null) {
             inorder(root.left); 
             System.out.print(root.val + " "); 
             inorder(root.right); } }
    static void postorder(TreeNode root) { 
        if (root != null) {
             postorder(root.left);
             postorder(root.right);
             System.out.print(root.val + " "); } }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.left = new TreeNode(5);
        root.right.right = new TreeNode(6);
        System.out.print("Preorder: "); preorder(root);
        System.out.print("\nInorder: "); inorder(root);
        System.out.print("\nPostorder: "); postorder(root);
    }
}
