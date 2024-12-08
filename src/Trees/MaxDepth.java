package Trees;

public class MaxDepth {
    public static void main(String[] args) {


        TreeNode root=new TreeNode(1);
        TreeNode first=new TreeNode(2);
        TreeNode second=new TreeNode(3);
        TreeNode third=new TreeNode(4);



        root.left=first;
        root.right=second;
        second.left=third;

        System.out.println(maxDepth(root));

    }

    public static int maxDepth(TreeNode root){
       if(root==null){
           return 0;
       }

       int left_length=maxDepth(root.left);
       int right_length=maxDepth(root.right);

       return 1+Math.max(left_length,right_length);

    }

}
