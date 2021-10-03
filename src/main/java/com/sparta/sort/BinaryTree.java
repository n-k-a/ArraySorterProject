package com.sparta.sort;

import com.sun.source.tree.Tree;

public class BinaryTree extends Sort {
    private int[] array;
    private int index = 0;
    @Override
    public int[] sortList(int[] arr) {
        super.startMethodTime= System.nanoTime();

        array = new int[arr.length];
        int[] arrSorted = new int[arr.length];
        BinaryTree tree = new BinaryTree();
        for(int i=0;i<arr.length; i++){
            tree.add(arr[i]);
        }
        super.endMethodTime= System.nanoTime();
        storeInOrder(root);
        arr = array;
        setStringArr(toStringPostOrder(root));
        return array;

    }

    private class TreeNode {
        private int value;
        private int count;
        private TreeNode leftNode;
        private TreeNode rightNode;

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public TreeNode getLeftNode() {
            return leftNode;
        }

        public void setLeftNode(TreeNode leftNode) {
            this.leftNode = leftNode;
        }

        public TreeNode getRightNode() {
            return rightNode;
        }

        public void setRightNode(TreeNode rightNode) {
            this.rightNode = rightNode;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public TreeNode(int value, TreeNode leftNode, TreeNode rightNode) {
            this.value = value;
            this.leftNode = leftNode;
            this.rightNode = rightNode;
            this.count = 1;
        }
        public TreeNode(int value)
        {
            this.value = value;

        }
        public TreeNode(int value, int count)
        {
            this.value = value;
            this.count = count;
        }
        public TreeNode(){}

        @Override
        public String toString() {
            return "TreeNode{" +
                    "value=" + value +
                    ", leftNode=" + leftNode +
                    ", rightNode=" + rightNode +
                    '}';
        }
    }



    private TreeNode root;
    public void add(int nextValue){
        if(root==null){
            root= new TreeNode(nextValue,1);
            return;
        }
        if (root.getValue() == nextValue){
            root.setLeftNode(new TreeNode(nextValue,(root.getCount())+1));
            return;

        }
        if (nextValue>root.getValue()){
            root.setRightNode(new TreeNode(nextValue,1));
            return;

        }
        if (nextValue<root.getValue()){
            root.setLeftNode(new TreeNode(nextValue,1));
            return;
        }


    }
    public void storeInOrder(TreeNode n) {
        if (n == null)
            return;
        storeInOrder(n.leftNode);
        array[index++] = root.value;
        storeInOrder(n.rightNode);
    }

    public void inOrder(TreeNode n){
        if (n != null){
            inOrder(n.leftNode);
            System.out.println(n.value+ " ");
            inOrder(n.rightNode);
        }


    }
    public String toStringPostOrder(TreeNode root) {
        String result = "";
        if (root == null) {
            return "";
        }

        result += toStringPostOrder(root.leftNode);
        result += toStringPostOrder(root.rightNode);
        result += root.toString();
        return result;
    }
    public void inOrder() {
        inOrder(root);
    }
    public void inOrderDesc(TreeNode node){
        if(node != null){
            inOrderDesc(node.rightNode);
            System.out.print(node.value + " ");
            inOrderDesc(node.leftNode);
        }
    }
}

