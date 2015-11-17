public class printpath {
	public static void main(String args[])
	{
		Node root = new Node(1);
		root.left = new Node(10);
		root.right = new Node(100);
		root.left.left = new Node(105);
		root.right.left = new Node(20);
		root.right.right = new Node(200);
		int[] a= new int[1000];
		int p =0;
		printp(root,a,p);
	}
	public static void printp(Node x,int[] a, int p)
	{
		if(x==null)
			return;
		a[p]=x.val;
		p++;
		if(x.left==null & x.right == null)
			print(a,p);
		else
		{
			printp(x.left,a,p);
			printp(x.right,a,p);
		}
	}
	public static void print(int[] a, int p)
	{
		for(int i = 0;i<p;i++)
			System.out.print(a[i] + " ");
		System.out.println("");
	}
}
