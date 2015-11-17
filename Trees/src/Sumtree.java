public class Sumtree {

	public static void main(String args[])
	{
		Node root = new Node(10);
		root.left = new Node(30);
		root.right = new Node(50);
		root.left.left = new Node(20);
		root.left.right = new Node(10);
	//	root.left.left = new Node(5);
		//root.left.right = new Node(5);
		//root.right.right = new Node(20);
		tosum(root);
		disp(root);
	//	if(issum(root))
		//	System.out.print("  Yes  ");
		//else
			//System.out.print("   No   ");
	}
	
	public static void disp(Node x)
	{
		if(x==null)
			return ;
		disp(x.left);
		System.out.println(x.val + " ");
		disp(x.right);
	}
	
	public static boolean issum(Node x)
	{
		if(x == null)
			return true;
		if(isleaf(x))
			return true;
		int ls , rs = 0;
		if(issum(x.left) && issum(x.right))
		{
			if(x.left == null)
				ls = 0;
			else
			{
				if(isleaf(x.left))
					ls = x.left.val;
				else
					ls = 2*x.left.val;
			}
			if(x.right == null)
				rs = 0;
			else
			{
				if(isleaf(x.right))
					rs = x.right.val;
				else
					rs = 2*x.right.val;
			}
			if(x.val == ls + rs)
				return true;
			else
				return false;
		}
		else
			return false;
	}
	
	public static boolean isleaf(Node x)
	{
		if(x.left== null && x.right == null)
			return true;
		else
			return false;
	}
	
	public static int tosum(Node x)
	{
		if(x== null)
			return 0;
		int old = x.val;
		x.val = tosum(x.left) + tosum(x.right);
		return x.val + old;
	}
}
