public class Mirrortree {
	public static void main(String args[])
	{
		Node root = new Node(1);
		root.left = new Node(10);
		root.right = new Node(100);
		root.left.left = new Node(105);
		root.right.left = new Node(20);
		root.right.right = new Node(200);
		mirror(root);
		disp(root);
	}
	public static void mirror(Node x)
	{
		if(x!= null)
		{
			mirror(x.left);
			mirror(x.right);
			Node temp = x.left;
			x.left = x.right;
			x.right = temp;
		}
	}
	public static void disp(Node x)
	{
		if(x==null)
			return;
		else
		{
			disp(x.left);
			System.out.print(x.val + " ");
			disp(x.right);
		}
	}
}