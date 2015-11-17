public class checkBST {
	public static void main(String args[])
	{
		Node root = new Node(10);
		root.left = new Node(5);
		root.right = new Node(100);
		root.left.left = new Node(4);
		root.left.right = new Node(15);
		root.right.left = new Node(20);
		root.right.right = new Node(200);
		if(isBST1(root, -100,500))
			System.out.println("Yes");
		else
			System.out.println("No");
	}

	public static boolean isBST(Node x)
	{
		if(x.left == null && x.right == null)
			return true;
		else
		{
			if(x.val >x.left.val && x.val <x.right.val)
				return(isBST(x.left)&&isBST(x.right));
			else
				return false;
		}
	}
	
	public static boolean isBST1(Node x, int min , int max)
	{
		if(x==null)
			return true;
		if(x.val > min && x.val< max && isBST1(x.left,min,x.val) && isBST1(x.right,x.val,max))
			return true;
		else 
			return false;
	}

	
	public static boolean iscompBST(Node x)
	{
		
		if(x==null)
			return false;
		if(x.left == null && x.right == null)  //Leaf node
			return true;
		if(x.left==null &&x.right!=null)
		{
			if(x.val<x.right.val)
				return(iscompBST(x.right));
		}
		if(x.left!=null &&x.right==null)
		{
			if(x.val>x.left.val)
				return(iscompBST(x.left));
		}
		if(x.val >x.left.val && x.val <x.right.val)
			return(iscompBST(x.left)&&iscompBST(x.right));
		else
			return false;
		}
	}

