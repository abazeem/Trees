public class Inorder2 {

	public static void main(String args[])
	{
		Node root = new Node(1);
		root.left = new Node(4);
		root.right = new Node(6);
		root.left.left = new Node(8);
		root.left.right = new Node(9);
		root.right.left = new Node(2);
		root.right.right = new Node(7);
		dispinorder(root);
	}
	
	public static void dispinorder(Node x)
	{
		Node curr = x;
		Stack stk = new Stack(100);
		while(curr!=null || !stk.isEmpty())
		{
			if(curr!=null)
			{
				stk.push(curr);
				curr = curr.left;
			}
			else
			{
				if(!stk.isEmpty())
				{
					Node temp = stk.pop();
					System.out.print(temp.val+ " ");
					curr = temp.right;
				}
			}	
			
		}
			
	}
}
