package tree;
//Binary Search Tree implementation
public class BST {
    private BSTNode root; //Root of BST
    private int nodeCount; //no of nodes in BST
    BST() {
        root= null; nodeCount= 0;
    }
    //re-initialize tree
    public void clear() {root= null; nodeCount= 0;}
    //insert a record into the tree. Records must be comparable
//    public void insert(Comparable e) {
//        root = inserthelp(root, e);
//        nodeCount++;
//    }
    //remove a record from tree; key: The key value of record to remove
    //returns the record removed, null if there is none.
//    public Comparable remove(Comparable e) {
//        Comparable temp = findhelp(root, key); // First find it
//        if (temp != null) {
//            root = removehelp(root, key); // Now remove it
//            nodeCount--;
//        }
//        return temp;
//    }
    // Return the record with key value k, null if none exists
    // key: The key value to find
//    public Comparable find(Comparable key) { return findhelp(root, key); }

    // Return the number of records in the dictionary
//    public int size() { return nodecount; }

//    private Comparable findhelp(BSTNode rt, Comparable key) {
//        if(rt== null) return null;
//        if(rt.value().compareTo(key)>0)
//            return findhelp(rt.left(), key);
//        else if(rt.value().compareTo(key)==0)
//            return rt.value();
//        else return findhelp(rt.right(), key);
//    }
}
