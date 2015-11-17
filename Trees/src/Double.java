
public class Double {
		public static void main(String args[])
		{
			Node root = new Node(1);
			root.left = new Node(2);
			root.right = new Node(3);
			convert(root);
			disp(root);
		}
		
		public static void convert(Node x)
		{
			if(x == null)
				return;
			else
			{
				convert(x.left);
				convert(x.right);
				Node add = new Node(x.val);
				Node temp = x.left;
				x.left = add;
				add.left = temp;
			}
		}
		public static void disp(Node x)
		{
			if(x==null)
				return;
			else
			{
				disp(x.left);
				System.out.print(x.val + " ");
				disp(x.right);
			}
		}
}