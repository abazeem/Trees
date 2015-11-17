public class Deletetree {
	public static void main(String args[])
	{
		Node root = new Node(1);
		root.left = new Node(10);
		root.right = new Node(100);
		root.left.left = new Node(105);
		root.right.left = new Node(20);
		root.right.right = new Node(200);
		del(root);
		System.out.println(root.val);
	}
	
	public static void del(Node x)
	{
		if(x==null)
			return;
		else
		{
			del(x.left);
			del(x.right);
			System.out.println("Deleting node "+x.val);
			x.val = 0;
			x.left = null;
			x.right = null;
		}
					
	}
}
