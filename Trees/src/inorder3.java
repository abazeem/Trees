
public class inorder3 {

	public static void main(String args[])
	{
		Nodea x = new Nodea(10);
		x.left = new Nodea(20);
		x.right = new Nodea(30);
		x.left.right = new Nodea(40);
		x.right.right = new Nodea(50);
		connect(x, new Point(null));
		disp2(x);
	}
	
	public static void disp(Node x)
	{
		Stack stk = new Stack(10);
		while(!stk.isEmpty() || x!=null)
		{
			while(x!=null)
			{
				stk.push(x);
				x = x.left;
			}
			while(!stk.isEmpty())
			{
				Node temp = stk.pop();
				System.out.print(temp.val + " ");
				if(temp.right!= null)
					stk.push(temp.right);
			}
		}
	}
	
	public static void connect(Nodea x , Point next)
	{
		if(x!= null)
		{
			connect(x.right,next);
			x.next = next.node;
			next.node = x;
			connect(x.left, next);
		}
	}
	
	public  static void disp2(Nodea x)
	{
		System.out.print("Done");
	}
}
