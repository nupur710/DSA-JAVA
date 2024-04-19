package tree;

/**base class for both internal and leaf nodes.
 * has a flag to indicate whether the implementing
 * class is a internal node or leaf node.
 * Only internal nodes have non-empty children, if same
 * implementation is provided for leaf and internal nodes,
 * then leaf nodes must also store pointer to children which
 * will be a waste of space.
 */
public interface VarBinNode {
    public boolean isLeaf();
}
