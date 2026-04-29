package common;

import java.util.ArrayList;
import java.util.List;

/**
 * Generic TreeNode class for representing nodes in a game tree structure.
 * Can hold any type of data and maintain a list of child nodes.
 *
 * @param <T> The type of data stored in this node
 */
public class TreeNode<T> {
    private T data;
    private List<TreeNode<T>> children;

    /**
     * Constructs a TreeNode with the given data.
     *
     * @param data The data to store in this node
     */
    public TreeNode(T data) {
        this.data = data;
        this.children = new ArrayList<>();
    }

    /**
     * Gets the data stored in this node.
     *
     * @return The data stored in this node
     */
    public T getData() {
        return data;
    }

    /**
     * Sets the data stored in this node.
     *
     * @param data The data to store
     */
    public void setData(T data) {
        this.data = data;
    }

    /**
     * Gets the list of child nodes.
     *
     * @return The list of child nodes
     */
    public List<TreeNode<T>> getChildren() {
        return children;
    }

    /**
     * Adds a child node to this node.
     *
     * @param child The child node to add
     */
    public void addChild(TreeNode<T> child) {
        children.add(child);
    }

    /**
     * Gets the number of children.
     *
     * @return The number of children
     */
    public int getChildCount() {
        return children.size();
    }

    /**
     * Checks if this node is a leaf node (has no children).
     *
     * @return true if this node has no children, false otherwise
     */
    public boolean isLeaf() {
        return children.isEmpty();
    }
}

