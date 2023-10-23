
public abstract class BinarySearchTree {
	protected node root;

	public class node {
		int size;
		int data;
		node left;
		node right; 

		public node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}

	}

	public abstract boolean add(int data);

	public int getSize(int size) {
		return size;
	}
}