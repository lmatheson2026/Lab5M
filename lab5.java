
public class lab5 {

	public static void main(String[] args) {
	myBinarySearchTree Y = new myBinarySearchTree();
	myTreeIterator X = new myTreeIterator();
	TreeIteratorTesting Z = new TreeIteratorTesting(Y,X);

System.out.println("The average of all values is " + Z.average);
System.out.println("The sum of all values is: " + Z.max);
	}

}
