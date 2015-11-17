public class buildpreorder {

	public static void main(String args[])
	{
		  int pre[] = {10, 30, 15, 5, 25};
		  char preLN[] = {'N', 'N', 'L', 'L', 'L'};
		  Node root = build(pre,preLN,new Node(0),pre.length -1);
		  disp(root);
	}
	
	public static void disp(Node x)
	{
		if(x == null)
			return ;
		System.out.print(x.val + " ");
		disp(x.left);
		disp(x.right);
	}
	public static Node build(int[] arr, char[] LN, Node l, int r)
	{
		if(l.val>r)
			return null;
		Node temp = new Node(arr[l.val]);
		if(l.val==r)
			return temp;
		if(LN[l.val] == 'N')
		{
			l.val++;			
			temp.left = build(arr,LN,l,r);
			l.val++;
			temp.right = build(arr,LN,l,r);
		}
		return temp;
	}
}
