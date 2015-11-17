public class ancestors {

	public static void main(String args[])
	{
		Node root = new Node(1);
		root.left = new Node(4);
		root.right = new Node(6);
		root.left.left = new Node(8);
		root.left.right = new Node(9);
		root.left.left.left = new Node(7);
		//calc(root, new int[10],6,0);
		easy(root,7);
	}
	
	public static void calc(Node x, int[] a, int k, int i)
	{
		if(x==null)
			return ;
		if(x.val == k)
		{
			for(int j = 0;j<i;j++)
				System.out.print(a[j] + " ");
		}
		a[i] = x.val;
		i++;
		calc(x.left,a,k,i);
		calc(x.right,a,k,i);
	}
	
	public static boolean easy(Node x, int k)
	{
		if(x == null)
			return false;
		if(x.val == k)
			return true;
		if(easy(x.left,k)||(easy(x.right,k)))
		{
			System.out.print(x.val + " ");
			return true;
		}
		else 
			return false;
	}
}
