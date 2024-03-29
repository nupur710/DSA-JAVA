package tree;

import java.util.LinkedList;
import java.util.Queue;

public class Node {

    int key;
    Node leftChild;
    Node rightChild;

    Node(int k) {
        this.key= k;
    }

    public static void main(String[] args) {
        Node root= new Node(10);
        root.leftChild= new Node(20);
        root.rightChild= new Node(30);
        root.leftChild.leftChild= new Node(80);
        root.leftChild.leftChild.leftChild= new Node(40);
        System.out.println("Inorder traversal: ");
        inOrderTraversal(root);
        System.out.println();
        System.out.println("Preorder traversal: ");
        preOrderTraversal(root);
        System.out.println();
        System.out.println("Postorder traversal: ");
        postorderTraversal(root);
        System.out.println();
        System.out.println("Height of tree is: " + height(root));
        System.out.print("Node at distance k is ");
        nodesAtDistanceK(root, 3);
        System.out.println();
        System.out.println("Level order traversal: ");
        levelOrderTraversal(root);
    }

    //inorder traversal--> left-root-right
    public static void inOrderTraversal(Node root) {
        if(root!=null) {
            inOrderTraversal(root.leftChild);
            System.out.print(root.key + " ");
            inOrderTraversal(root.rightChild);
        }
    }
    //preorder traversal --> root-left-right
    public static void preOrderTraversal(Node root) {
        if(root!= null) {
            System.out.print(root.key + " ");
            preOrderTraversal(root.leftChild);
            preOrderTraversal(root.rightChild);
        }
    }
    //postorder traversal -->left-right-root
    public static void postorderTraversal(Node root) {
        if(root!= null) {
            postorderTraversal(root.leftChild);
            postorderTraversal(root.rightChild);
            System.out.print(root.key+ " ");
        }
    }
    //height of tree
    public static int height(Node root) {
        if(root==null) return 0;
        else {
            return Math.max(height(root.leftChild),height(root.rightChild))+1;
        }
    }
    public static void nodesAtDistanceK(Node root, int k) {
        if(root == null) return;
        if(k == 0) System.out.print(root.key + " ");
        else {
            nodesAtDistanceK(root.leftChild, k-1);
            nodesAtDistanceK(root.rightChild, k-1);
        }
    }
    //breadth-first traversal
    public static void levelOrderTraversal(Node root) {
        Queue<Node> q= new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()) {
            Node curr= q.poll();
            System.out.print(curr.key + " ");
            if(curr.leftChild != null) q.add(curr.leftChild);
            if(curr.rightChild != null) q.add(curr.rightChild);
        }
    }
}
