
public class Inorder {

	public static void main(String args[])
	{
		NodeT root = new NodeT(100);
		root.left = new NodeT(10);
		root.right = new NodeT(500);
		root.left.left = new NodeT(1);
		root.left.right = new NodeT(50);
		root.right.left = new NodeT(20);
		root.right.right = new NodeT(30);
		root.left.left.rightT=root.left;
		root.left.right.rightT = root;
		root.right.left.rightT=root.right;
		dispinorder(root);
	}
	public static NodeT leftmost(NodeT x)
	{
		if(x==null)
			return null;
		else
		{
			while(x.left!=null)
				x=x.left;
			return x;
		}
	}
	
	public static void dispinorder(NodeT x)
	{
		x= leftmost(x);
		while(x!= null)
		{
			System.out.print(x.val + " ");
			if(x.rightT != null)
				x=x.rightT;
			else
			{
				x=leftmost(x.right);
			}
		}
	}
}
