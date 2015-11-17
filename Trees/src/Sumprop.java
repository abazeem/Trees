
public class Sumprop {
	public static void main (String args[])
	{
		Node root = new Node(10);
		root.left = new Node(8);
		root.right = new Node(2);
		root.left.left = new Node(8);
		root.right.left = new Node(1);
		root.right.right = new Node(1);
		if(check(root))
			System.out.println("Child Sum Property");
			else
			System.out.println("No child sum property");
		
	}

	public static boolean check(Node x)
	{
		int left = 0;
		int right = 0;
		if(x== null || (x.left == null && x.right == null))
				return true;
		else
		{
			if(x.left!=null)
				left = x.left.val;
			if(x.right!=null)
				right = x.right.val;
			
			if((x.val == left+right)&&check(x.left)&&check(x.right))
				return true;
			else
				return false;
		}
	}

}

