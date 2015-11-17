
public class Childrensum2 {

	public static void main(String args[])
	{
		Node root = new Node(50);
		root.left = new Node(7);
		root.right = new Node(2);
		root.left.left = new Node(3);
		root.left.right = new Node(5);
		root.right.left = new Node(1);
		root.right.right = new Node(30);
		calc(root);
		dispinorder(root);
	}
	
	public static void dispinorder(Node x)
	{
		if(x == null)
			return;
		dispinorder(x.left);
		System.out.print(x.val + " ");
		dispinorder(x.right);
	}
	public static void calc(Node x)
	{
		if(x == null ||(x.left == null && x.right == null))
			return;
		calc(x.left);
		calc(x.right);
		int l = 0;
		int r = 0;
		if(x.left!= null)
			l = x.left.val;
		if(x.right!= null)
			r = x.right.val;
		int diff = l + r -x.val;
		if(diff>0)
			x.val = x.val + diff;
		else
		{
			if(diff<0)
			{
				if(x.left != null)
					increment(x.left,-diff);
				else
					increment(x.right, - diff);
			}
		}
	}
	
	public static void increment(Node x, int d)
	{
		if(x.left == null && x.right==  null)
			x.val = x.val + d;
		else
		{
			x.val = x.val + d;
			calc(x);
		}
	}
	
}
