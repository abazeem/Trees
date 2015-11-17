
public class LCA {

	public static void main(String args[])
	{
		Node x = new Node(1);
		x.left = new Node(2);
		x.right = new Node(3);
		x.left.left = new Node(4);
		x.left.right = new Node(5);
		x.right.right = new Node(7);
		x.right.left = new Node(6);
		Node Lca = find2(x, 2,7);
		System.out.print(Lca.val);
		
		/*int[] a = new int[7];
		find(x, a, 4,0 );
		int[] b = new int[7];
		find(x, b, 7,0);
		int i;
		for( i = 0; i<a.length; i++)
		{
			if(a[i] != b[i])
				break;
				
		}
		System.out.print(a[i-1]);
		*/
	}
	
	public static boolean find(Node x, int[] a, int i, int path)
	{
		if( x == null)
			return false;
		a[path] = x.val;
		path++;
		if( x.val == i)
		{
			return true;
		}
		if((x.left!= null &&find(x.left,a,i,path))||(x.right != null && find(x.right,a,i,path)))	
				return true;
		a[path - 1] = 0;
		return false;
	}
	
	public static Node find2(Node x, int n1, int n2)
	{
		if( x == null)
			return null;
		if( x.val == n1 || x.val == n2)
			return x;
		Node left = find2(x.left, n1,n2);
		Node right = find2(x.right, n1,n2);
		if( left != null && right != null)
			return x;
		if( left == null)
			return right;
		else
			return left;
	}
}
