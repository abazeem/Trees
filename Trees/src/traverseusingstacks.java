public class traverseusingstacks {
	public static void main(String args[])
	{
		Node root = new Node(1);
		root.left = new Node(10);
		root.right = new Node(100);
		root.left.left = new Node(105);
		root.right.left = new Node(20);
		root.right.right = new Node(200);
		disp(root);
	}
	public static void disp(Node x)
	{
		Stack stk = new Stack(100);
		Node current = x;
		boolean done = false;
		while(!done)
		{
			if(current != null)
			{
				stk.push(current);
				current = current.left;
			}
			else
			{
				if(!stk.isEmpty())
				{
					Node a = stk.pop();
					System.out.print(a.val +" ");
					current = a.right;
				}
				else
					done = true;
			}
		}
	}
}
