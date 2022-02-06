package com.spartaglobal.model;

import java.util.ArrayList;
import java.util.Arrays;

public class BinarySearchTree implements Sort{
    //Node class for elements in tree
    class Node
    {
        int key;
        Node left, right;

        public Node(int item)
        {
            key = item;
            left = right = null;
        }
    }

    Node root; //Root of the bst

    @Override
    public int[] sort(int[] inputArray) {

        if(inputArray.length == 0) return null;

        ArrayList<Integer> result = new ArrayList<>(); //Stores the sorted Array

        root = new Node(inputArray[0]); //Initialises the BST with first element in array

        //Insert every other element of Array into the Tree
        for(int i=1; i< inputArray.length;i++){
            insertIntoTree(root, inputArray[i]);
        }
        inOrderTraversal(root, result); //Traverse BST to get Sorted Array

        int[] resultArray = new int[result.size()];

        for(int i=0; i< result.size();i++){
            resultArray[i] = result.get(i);
        }

        return resultArray;
    }


    //Insert new node into the tree
    public Node insertIntoTree(Node root, int value ){
        if(root== null) return new Node(value);

        if(value <= root.key){
            root.left = insertIntoTree(root.left, value);
        } else if(value > root.key){
            root.right = insertIntoTree(root.right,value);
        } else {
            return root;
        }
        return root;
    }

    //Traverse the BST to get the Sorted Array
    public void inOrderTraversal(Node node, ArrayList<Integer> result){
        if(node != null){
            inOrderTraversal(node.left, result);
            result.add(node.key);
            inOrderTraversal(node.right,result);
        }
    }


}
