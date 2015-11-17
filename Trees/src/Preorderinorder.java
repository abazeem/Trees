public class Preorderinorder {
	static int preorder = 0;
	public static void main(String args[])
	{
		 char in[] = {'D', 'B', 'E', 'A', 'F', 'C'};
		 char pre[] = {'A', 'B', 'D', 'E', 'C', 'F'};
		 Nodec root = gentree(0,in.length-1,in,pre);
		 printinorder(root);
	}

	public static int search(char[] a, char val, int start , int end)
	{
		for( int i =start;i<=end;i++)
		{
			if(a[i]==val)
				return i;
		}
		return -1;
	}

	public static Nodec gentree(int start, int end, char[] i ,char[] p)
	{
		if(preorder>5)
			return null;
		Nodec tree = new Nodec(p[preorder++]);
		if(start>end)
			return null;
		if(start==end)
			return tree;
		int x = search(i,tree.val,start,end);
		tree.left = gentree(start,x-1,i,p);
		tree.right = gentree(x+1,end,i,p);
		return tree;
	}

	public static void printinorder(Nodec root)
	{
		if(root == null)
			return;
		else
		{
			printinorder(root.left);
			System.out.println(root.val + " ");
			printinorder(root.right);
		}
	}
}
