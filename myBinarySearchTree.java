
public class myBinarySearchTree extends BinarySearchTree{


	@Override
	//add method to insert a new data node into
	// the binary tree
	public boolean add(int data) {
		root = addHelper(data, root);
		return true;
	}
	//helper method used, using null as a basecase
	private node addHelper(int data, node Temproot) {
		if (Temproot == null) {
			Temproot = new node(data);             
			size++;
			return Temproot;
		}
		if(Temproot.data > data) {
			Temproot.left = addHelper(data, Temproot.left);
		}
		else if(Temproot.data <= data) {
			Temproot = addHelper(data, Temproot.right);
		} 

		return Temproot;
	}

}
