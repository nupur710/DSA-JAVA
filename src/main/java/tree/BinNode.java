package tree;

import static tree.BinNode.preorder;

//generic implementation
public interface BinNode<E> {
    //get and set element value
    public E value();
    public void setValue(E v);

    //return the children
    public BinNode<E> left();
    public BinNode<E> right();

    //return true if leaf node, false otherwise
    public boolean isLeaf();

    static <E> void visit(BinNode <E> root) {
        System.out.println(root);
    }

    static <E> void preorder(BinNode<E> rt) {
        if (rt == null) { return; } // Empty subtree - do nothing
        visit(rt);              // Process root node
        preorder(rt.left());    // Process all nodes in left
        preorder(rt.right());   // Process all nodes in right
    }

    static <E> void postorder(BinNode<E> rt) {
        if(rt == null) { return; }
        postorder(rt.left());
        postorder(rt.right());
        visit(rt);
    }

    static <E> void inorder(BinNode<E> rt) {
        if(rt == null) { return; }
        inorder(rt.left());
        visit(rt);
        inorder(rt.right());
    }

    static void ineff_BTinc(BinNode root) {
        if (root != null) {
            root.setValue((int)(root.value()) + 1);
            if (root.left() != null) {
                root.left().setValue((int)(root.left().value()) + 1);
                ineff_BTinc(root.left().left());
            }
            if (root.right() != null) {
                root.right().setValue((int)(root.right().value()) + 1);
                ineff_BTinc(root.right().right());
            }
        }
    }

//    static BinNode increment(BinNode root) {
//        if(root == null) return null;
//        root.setValue((int)(root.value())+1);
//        root.left()= increment(root.left());
//        root.right()= increment(root.right());
//    }
}
