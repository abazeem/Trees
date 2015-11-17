public class genBST {
	public static void main(String args[])
	{
		Node root = new Node(4);
		genBST1(root,2);
		genBST1(root,1);
		genBST1(root,3);
		genBST1(root,5);

	}
	public static void genBST1(Node x, int a)
	{
		if(a<=x.val)
		{
			if(x.left!=null)
				genBST1(x.left,a);
			else
				x.left = new Node(a);
		}
		else
		{
			if(x.right!=null)
				genBST1(x.right,a);
			else
				x.right = new Node(a);
		}
		
	}
}
