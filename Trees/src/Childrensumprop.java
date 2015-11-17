
public class Childrensumprop {

	public static void main(String args[])
	{
		Node root = new Node(10);
		root.left = new Node(8);
		root.right = new Node(2);
		root.left.left = new Node(3);
		root.left.right = new Node(5);
		root.right.left = new Node(2);
		if(check(root))
			System.out.print("Has children sum property");
		else
			System.out.print("No children sum property");
		
	}
	
	public static boolean check(Node x)
	{
		if(x==null || (x.left == null && x.right == null))
			return true;
		int l = 0;
		int r = 0;
		if(x.left!=null)
			l = x.left.val;
		if(x.right!=null)
			r = x.right.val;
		if(x.val == l + r && check(x.left) && check(x.right))
			return true;
		else return false;
	}
}
