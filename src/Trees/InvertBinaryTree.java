package Trees;
//You are given the root of a binary tree root. Invert the binary tree and return its root.


public class InvertBinaryTree {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val){
            this.val=val;
        }
        public TreeNode(int val, TreeNode left, TreeNode right){
            this.val=val;
            this.left=left;
            this.right=right;
        }
        public TreeNode(){}
    }

    public static TreeNode invertTree(TreeNode root){
        if(root==null){
            return root;
        }
        TreeNode left=invertTree(root.left);
        TreeNode right=invertTree(root.right);

        // left and right entries are logged and now we swap them

        root.left=right;
        root.right=left;

        return root;

    }

    // printing the tree

    public static void printTree(TreeNode root){
        if(root==null){
            return;
        }

        System.out.print(root.val);
        printTree(root.left);
        printTree(root.right);
    }


    public static void main(String[] args) {
         TreeNode root=new TreeNode(1);
         TreeNode first=new TreeNode(2);
         TreeNode second=new TreeNode(3);
         TreeNode third=new TreeNode(4);
         TreeNode fourth=new TreeNode(5);
         TreeNode fifth=new TreeNode(6);
         TreeNode sixth=new TreeNode(7);

         root.left=first;
         root.right=second;
         first.left=third;
         first.right=fourth;
         second.left=fifth;
         second.right=sixth;

        printTree(root);

        System.out.println();
        printTree(invertTree(root));
    }

}
