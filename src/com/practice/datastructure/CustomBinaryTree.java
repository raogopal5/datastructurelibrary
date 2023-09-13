package com.practice.datastructure;

public class CustomBinaryTree {

    private TreeNode root;

    public int size(TreeNode rootNode){

        if(rootNode ==null){
            return 0;
        }

        int countLeft = size( rootNode.left);
        int countRight = size( rootNode.right);

        return  countLeft + countRight +1;
    }

    public int totalLength(TreeNode rootNode){

        if(rootNode ==null){
            return 0;
        }

        int countLeft = size( rootNode.left);
        int countRight = size( rootNode.right);

        return  countLeft + countRight + rootNode.data;
    }

    public int findMax(TreeNode treeNode){

        if(treeNode ==null){
            return 0;
        }

        int res = treeNode.data;
        int lres = findMax(treeNode.left);
        int rres = findMax(treeNode.right);

        if (lres > res)
            res = lres;
        if (rres > res)
            res = rres;
        return res;
    }


    public TreeNode insert(TreeNode treeNode,int k){

        if(treeNode == null){

             treeNode = new TreeNode(k);
        }

        if(k<treeNode.data){
            treeNode = insert(treeNode.left,k);
        }

        if(k>treeNode.data){
            treeNode = insert(treeNode.right,k);
        }

        return treeNode;
    }

    public int findMin(TreeNode treeNode){

        if(treeNode ==null){
            return 0;
        }

        int res = treeNode.data;
        int lres = findMin(treeNode.left);
        int rres = findMin(treeNode.right);

        if (lres < res)
            res = lres;
        if (rres < res)
            res = rres;
        return res;
    }

    public static void main(String[] args) {

            CustomBinaryTree tree = new CustomBinaryTree();
            tree.root = new TreeNode(2);
            tree.root.left = new TreeNode(7);
            tree.root.right = new TreeNode(5);
            tree.root.left.right = new TreeNode(6);
            tree.root.left.right.left = new TreeNode(1);
            tree.root.left.right.right = new TreeNode(11);
            tree.root.right.right = new TreeNode(9);
            tree.root.right.right.left = new TreeNode(4);
        System.out.println(tree);

           /* // Function call
            System.out.println("Maximum element is "
                    + tree.findMax(tree.root));*/
    }
}
