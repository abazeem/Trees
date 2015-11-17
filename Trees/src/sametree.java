
public class sametree {
	public static void main(String args[])
	{
		Node root = new Node(1);
		root.left = new Node(10);
		root.right = new Node(100);
		root.left.left = new Node(105);
		root.right.left = new Node(20);
		root.right.right = new Node(200);
		Node root1 = new Node(1);
		root1.left = new Node(10);
		root1.right = new Node(100);
		root1.left.left = new Node(105);
		root1.right.left = new Node(20);
		root1.right.right = new Node(200);
		if(identical(root, root1))
			System.out.println("Identical");
		else
			System.out.println("Not Identical");
	}
	public static boolean identical(Node x, Node y)
	{
		if(x==null && y ==null)
			return true;
		else
		{
			if(x.val == y.val)
				return(identical(x.left,y.left)&&identical(x.right,y.right));
			else
				return false;
		}
	}
	
}
