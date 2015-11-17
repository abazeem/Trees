
public class foldable {

	public static void main(String args[])
	{
		Node root = new Node(1);
		root.left = new Node(10);
		root.right = new Node(100);
		root.left.left = new Node(105);
		root.left.right = new Node(10);
		root.right.right = new Node(22);
		if(isfoldable(root))
			System.out.print("Foldable");
		else
			System.out.print("Not Foldable");
	}
	
	public static boolean isfoldable(Node x)
	{
		if(x==null)
			return true;
		return samestructure(x.left,x.right);
	}
	
	public static boolean samestructure(Node a, Node b)
	{
		if(a == null && b == null)
			return true;
		if((a != null && b != null) && (samestructure(a.left,b.right) && (samestructure(a.right,b.left))))
				return true;
		else 
				return false;
	}
}
