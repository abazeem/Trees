
public class Inordernext {

	public static void main(String args[])
	{
		NodeI root = new NodeI(1);
		root.left = new NodeI(10);
		root.right = new NodeI(100);
		root.left.left = new NodeI(105);
		root.right.left = new NodeI(20);
		root.right.right = new NodeI(200);
		//calc(root);
		inorder2(root,null);
		disp(root);
	}
	
	public static void disp(NodeI x)
	{
		if(x==null)
			return;
		disp(x.left);
		if(x.next == null)
			x.next = new NodeI(-1);
		System.out.println(x.val + " Inorder next " + x.next.val);
		disp(x.right);
	}
	public static void calc(NodeI x)
	{
		NodeI next = null;
		inorderN(x,next);
	}
	
	public static NodeI inorderN(NodeI x, NodeI next)
	{
		if(x!=null)
		{
			NodeI temp  = inorderN(x.right,next);
			if(temp != null)
				next = temp;
			x.next = next;
			next = x;
			temp = inorderN(x.left,next);
			if(temp != null)
				next = temp;
			return next;
		}
		return null;
	}
	
	public static NodeI inorder2(NodeI p, NodeI prev)
	{
		
		if(p == null)
			return null;
		NodeI temp = inorder2(p.left,prev);
		if(temp!=null)
			prev = temp;
		if(prev == null)
			prev = p;
		else
		{
			prev.next = p;
			prev = p;
		}
		temp = inorder2(p.right,prev);
		if(temp!=null)
			prev = temp;	
		return prev;
	}
}
