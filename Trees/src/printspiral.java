public class printspiral {
	
	public static void main(String args[])
	{
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(7);
		root.left.right = new Node(6);
		root.right.left = new Node(5);
		root.right.right = new Node(4);
		disp(root);
	}
	
	public static void disp(Node x)
	{
		Stack stk1 = new Stack(200);
		Stack stk2 = new Stack(200);
		stk1.push(x);
		while(!stk1.isEmpty()||!stk2.isEmpty())
		{
			while(!stk1.isEmpty())
			{
				Node temp = stk1.peek();
				stk1.pop();
				System.out.println(temp.val +" ");
				if(temp.right!=null)
				stk2.push(temp.right);
				if(temp.left!=null)
				stk2.push(temp.left);
			}
			while(!stk2.isEmpty())
			{
				Node temp = stk2.peek();
				stk2.pop();
				System.out.println(temp.val +" ");
				if(temp.left!=null)
				stk1.push(temp.left);
				if(temp.right!=null)
				stk1.push(temp.right);				
			}
		}
	}
}
