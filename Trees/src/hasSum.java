public class hasSum {

	public static void main(String args[])
	{
		Node root = new Node(1);
		root.left = new Node(10);
		root.right = new Node(100);
		root.left.left = new Node(105);
		root.right.left = new Node(20);
		root.right.right = new Node(200);
		int sum = 116;
		if(calc(root,sum))
			System.out.println("Sum found");
		else
			System.out.println("Sum not found");
	}
	public static boolean calc(Node x, int sum)
	{
		if(x == null)
			return false;
		else
		{
			if(x.left == null && x.right == null)
				return(sum-x.val==0);
			else
			{
			sum = sum-x.val;
			return(calc(x.left,sum)||calc(x.right,sum));
			}
		}
	}
}
