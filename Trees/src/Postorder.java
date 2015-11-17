
public class Postorder {

	public static void main(String args[])
	{
		int[] in = {4, 2, 5, 1, 3, 6};
		int[] pre = {1, 2, 4, 5, 3, 6};
		print(in,pre,0, in.length-1, new Node(0));
	}
	
	public static void print(int[] inorder, int [] pre, int left, int right, Node x)
	{
		int root = search(inorder, pre[x.val]);
		int curr = x.val;
		x.val++;
		if( root != left)
			print(inorder, pre, left, root -1,x);
		if( root != right)
			print(inorder, pre, root+1, right,x);
		System.out.print(pre[curr] + " ");
	}
	
	public static int search(int[] a , int v)
	{
		int i = 0;
		for( ; i< a.length; i++)
		{
			if( a[i] == v)
				return i;
		}
		return -1;
	}
}
