
public class Levelorder2 {

	public static void main(String args[])
	{
		Node root = new Node(1);
		root.left = new Node(10);
		root.right = new Node(100);
		root.left.left = new Node(105);
		root.right.left = new Node(20);
		root.right.right = new Node(200);
		disp1(root);
		disp2(root);
	}
	
	public static void disp1(Node x)
	{
		if(x==null)
			return;
		Stack stk1 = new Stack(100);
		Stack stk2 = new Stack(100);
		stk1.push(x);
		while(!stk1.isEmpty() || !stk2.isEmpty())
		{
			while(!stk1.isEmpty())
			{
				Node temp = stk1.pop();
				System.out.print(temp.val + " ");
				if(temp.right!=null)
					stk2.push(temp.right);
				if(temp.left!=null)
					stk2.push(temp.left);
			}
			System.out.println();
			while(!stk2.isEmpty())
			{
				Node temp2 = stk2.pop();
				System.out.print(temp2.val + " ");
				if(temp2.left!=null)
					stk1.push(temp2.left);
				if(temp2.right!=null)
					stk1.push(temp2.right);
			}
			System.out.println();
		}
	}
	
	public static void disp2(Node x)
	{
		if(x==null)
			return;
		Queue que = new Queue(100);
		que.enqueue(x);
		Node temp = que.dequeue();
		while(temp!=null)
		{
			System.out.print(temp.val + " ");
			if(temp.left!=null)
				que.enqueue(temp.left);
			if(temp.right!=null)
				que.enqueue(temp.right);
			temp = que.dequeue();
		}
	}
	
}
