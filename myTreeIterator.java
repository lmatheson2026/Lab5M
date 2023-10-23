public class myTreeIterator implements ITreeIterator {
    /***
     * 
     * @author dean casbay
     * 
     * Subtask 2: Create class myTreeIterator implementing the interface ITreeIterator. 
     * There is only one method for this class, that takes in a BinarySearchTree, and similar to Sequence 
     * Array Tree Iterator approach, fills out the array of integers and returns it.
     * 
     */
    private int[] sequenceArray;
    private int nextIndex;

    public myTreeIterator() {
        sequenceArray = null;
        nextIndex = 0;
    }

    @Override
    public int[] SequenceArray(BinarySearchTree bst) {
        if (bst.root == null) {
            return new int[0]; // return empty array if given empty tree
        }

        int treeSize = getSize(bst.root);
        sequenceArray = new int[treeSize];
        nextIndex = 0;

        inOrderTraversal(bst.root);

        return sequenceArray;
    }

    // calculate size of tree to create appropriately sized array
    private int getSize(BinarySearchTree.node node) {
        if (node == null) {
            return 0;
        } 
        else {
            return 1 + getSize(node.left) + getSize(node.right);
        }
    }

    // populate array with nodes using in-order traversal
    private void inOrderTraversal(BinarySearchTree.node node) {
        if (node != null) {
            inOrderTraversal(node.left);
            sequenceArray[nextIndex++] = node.data;
            inOrderTraversal(node.right);
        }
    }
}