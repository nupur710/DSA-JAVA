package tree;
/**
 * In case of an expression tree, leaf nodes store operands
 * while internal nodes store operators. So internal nodes could store a small code identifying the
 * operator such as a single byte for the operator’s character symbol.
 * Leaf store variable names or numbers, which is considerably larger in order to handle the wider
 * range of possible values. Plus, leaf nodes need not store child pointers.
 */
public class VarInternalNode implements VarBinNode{
    private VarBinNode left;
    private VarBinNode right;
    private Character operator;
    public VarInternalNode(VarBinNode left, VarBinNode right, Character operator) {this.left= left; this.right= right; this.operator= operator;}
    public VarBinNode getLeftChild() {
        return this.left;
    }
    public VarBinNode getRightChild() {
        return this.right;
    }
    public Character getOperator() {
        return this.operator;
    }
    @Override
    public boolean isLeaf() {
        return false;
    }

    //preorder traversal
    public void preOrderTraversal(VarBinNode root) {
        if(root == null) return;
        System.out.println(root);
        if(!root.isLeaf()) { //if internal node
            VarInternalNode internalNode= (VarInternalNode) root;
            preOrderTraversal(internalNode.getLeftChild());
            preOrderTraversal(internalNode.getRightChild());
        }
    }
}
