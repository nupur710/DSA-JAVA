package tree;

/**
 * In case of an expression tree, leaf nodes store operands
 * while internal nodes store operators. So internal nodes could store a small code identifying the
 * operator such as a single byte for the operator’s character symbol.
 * Leaf store variable names or numbers, which is considerably larger in order to handle the wider
 * range of possible values. Plus, leaf nodes need not store child pointers.
 */
public class VarLeafNode implements VarBinNode {
    private String operand;

    public VarLeafNode(String operand) {
        this.operand= operand;
    }

    public String getValue() {
        return this.operand;
    }

    @Override
    public boolean isLeaf() {
        return true;
    }

}
