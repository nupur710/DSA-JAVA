package tree;

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
        System.out.println("Inorder traversal: ");
        inOrderTraversal(root);
        System.out.println();
        System.out.println("Preorder traversal: ");
        preOrderTraversal(root);
        System.out.println();
        System.out.println("Postorder traversal: ");
        postorderTraversal(root);
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
}
