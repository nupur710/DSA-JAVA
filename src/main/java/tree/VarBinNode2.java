package tree;

/**
 * separate implementation of leaf and internal nodes based on composite design pattern.
 * In procedural approach, the node classes themselves implement the functionality of traverse.
 * Here, the interface declares traverse methods that node classes will need to implement.
 * The whole traversal process is called by invoking traverse on the root node,
 * which in turn invokes traverse on its children.
 */
public interface VarBinNode2 {
    public boolean isLeaf();
    public void traverse();
}
