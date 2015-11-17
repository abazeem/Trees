public class prepost {

	public static void main(String args[])
	{
	    int pre[] = {1,2,4,5,3,6,7};
	    int post[] = {4,5,2,6,7,3,1};
	    Node root = gen(pre,post,new Node(0),0,pre.length -1);
	    disp(root);
	}
	
	public static void disp(Node x)
	{
		if(x == null)
			return ;
		disp(x.left);
		System.out.print(x.val + " ");
		disp(x.right);
	}
	
	public static Node gen(int[] pre , int[]  post, Node pi, int l, int r)
	{
		if( l>r || pi.val > pre.length)
			return null;
		Node temp = new Node(pre[pi.val]);
			if(pi.val + 1== pre.length)
				return temp;
		int index = find(post,pre[pi.val + 1]);
		if(index == -1)
		{
			System.out.println("Error");
			return null;
		}
		pi.val++;
		if( l == r)
			return temp;
		if( index <= pre.length)
		{
			temp.left = gen(pre,post,pi,l,index);
			temp.right = gen(pre,post,pi,index+1,r - 1);
		}
		return temp;
	}

	public static int find(int[] a, int k)
	{
		for(int i = 0;i<a.length;i++)
		{
			if(a[i] == k)
				return i;
		}
		return -1;
	}
}
