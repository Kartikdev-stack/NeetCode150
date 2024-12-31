package easy;

import Trees.TreeNode;
//import com.sun.source.tree.Tree;


public class subTree {
    public static void main(String[] args) {

        // declaring the Tree
        TreeNode root=new TreeNode(1);
        TreeNode first=new TreeNode(2);
        TreeNode second=new TreeNode(3);
        TreeNode third=new TreeNode(4);
        TreeNode fourth=new TreeNode(5);

        root.left=first;
        root.right=second;
        first.left=third;
        first.right=fourth;


        // declaring the Sub Tree
        TreeNode subRoot=new TreeNode(2);
        TreeNode firstSubRoot=new TreeNode(4);
        TreeNode secondSubRoot=new TreeNode(5);

        subRoot.left=firstSubRoot;
        subRoot.right=secondSubRoot;


        System.out.println(isSubTree(root,subRoot));


    }

    public static boolean isSubTree(TreeNode root, TreeNode subRoot){
        if (subRoot==null){
            return true; // empty tree is always a subTree
        }

        if(root==null){
            return false; // subroot is not empty and tree is empty i.e. it is not a sub tree
        }

        if(root.val==subRoot.val && isSame(root,subRoot)){
            return true;
        }

        return isSubTree(root.left,subRoot) || isSubTree(root.right,subRoot);

    }


    public static boolean isSame(TreeNode root,TreeNode subRoot){

        if(root==null && subRoot==null){
            return true;
        }

        if(root==null || subRoot==null){
            return false;
        }

        if(root.val!=subRoot.val){
            return false;
        }


        return isSame(root.left,subRoot.left) && isSame(root.right,subRoot.right);
    }

}
