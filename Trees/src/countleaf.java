
public class countleaf {

	public static void main (String args[])
	{
		Node root = new Node(1);
		root.left = new Node(10);
		root.right = new Node(100);
		root.left.left = new Node(105);
		root.right.left = new Node(20);
		root.right.right = new Node(200);
		int leaves = leaf(root);
		System.out.print("Number of leaves " + leaves);
		
	}
	public static int leaf(Node x)
	{
		if(x==null)
			return 0;
		if(x.left==null && x.right ==null)
			return 1;
		else
		{
			return(leaf(x.left)+leaf(x.right));
		}
	}
}
