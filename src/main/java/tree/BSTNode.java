package tree;
//implementation of BinNode interface
public class BSTNode implements BinNode {
    private Comparable element;
    private BSTNode left;
    private BSTNode right;

    //Constructors
    BSTNode() {left= right= null;}
    BSTNode(Comparable val) {left= right= null; element= val;}
    BSTNode(Comparable val, BSTNode left, BSTNode right) {element= val; this.left= left; this.right= right;}

    @Override
    public Object value() {
        return element;
    }

    public void setValue(Comparable v) {
        element= v;
    }

    @Override
    public void setValue(Object v) {
        if (!(v instanceof Comparable))
            throw new ClassCastException("A Comparable object is required.");
        element = (Comparable)v;
    }

    @Override
    public BinNode left() {
        return left;
    }

    @Override
    public BinNode right() {
        return right;
    }

    @Override
    public boolean isLeaf() {
        boolean isLeaf = (left == null || right == null) ? true : false;
        return isLeaf;
    }
}
