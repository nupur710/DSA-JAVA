package tree;

public class MultipleBinaryTrees extends Node{

    MultipleBinaryTrees(int k) {
        super(k);
    }

    //mirroring binary trees/same binary trees
    public boolean isMirrorImage(Node root1, Node root2) {
        if(root1 == null && root2 == null) return true;
        if(root1 == null || root2 == null) return false;
        return (root1.key == root2.key) && isMirrorImage(root1.leftChild, root2.leftChild)
                && isMirrorImage(root1.rightChild, root2.rightChild);
    }
    //Given two binary trees, return true if and only if they are
    // structurally identical (they have the same shape, but their nodes can have different values).
    public boolean sameStructure(Node root1, Node root2) {
        if(root1 == null && root2 == null) return true;
        if(root1 == null || root2 == null) return false;
        return sameStructure(root1.leftChild, root2.leftChild) && sameStructure(root1.rightChild, root2.rightChild);
    }

    //is BST??
    static boolean checkBST(BSTNode rt, Comparable low, Comparable high) {
        if (rt == null) return true; // Empty subtree
        Comparable rootval = (Comparable) rt.value();
        if ((rootval.compareTo(low) <= 0) || (rootval.compareTo(high) > 0))
            return false; // Out of range
        if (!checkBST(rt.left(), low, rootval))
            return false; // Left side failed
        return checkBST(rt.right(), rootval, high);
    }
}
