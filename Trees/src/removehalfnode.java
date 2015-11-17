public class removehalfnode {

	public static void main(String args[])
	{
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.left.left = new Node(5);
		root.right.right = new Node(6);
		calc(root);
		disp(root);
	}
	
	public static void disp(Node x)
	{
		if(x==null)
			return;
		disp(x.left);
		System.out.print(x.val + " ");
		disp(x.right);
				
	}
	
	public static Node calc(Node x)
	{
		if(x == null)
			return null;
		x.left = calc(x.left);
		x.right = calc(x.right);
		
		if(x.left==null && x.right == null)
			return x;
		if(x.left == null)
		{
			Node temp = x.right;
			x.right = null;
			return temp;
		}
		if(x.right == null)
		{
			Node temp2 = x.left;
			x.left = null;
			return temp2;
		}
		return x;
		
	}
	

}
