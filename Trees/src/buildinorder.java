
public class buildinorder {

	public static void main(String args[])
	{
		int[] inorder = {5, 10, 40, 30, 28};
		Node root = build(inorder,0,inorder.length-1);
		disp(root);
	}
	
	public static void disp(Node x)
	{
		if(x==null)
			return;
		disp(x.left);
		System.out.print(x.val + " ");
		disp(x.right);
	}
	public static Node build(int[] arr, int start, int end)
	{
		if(start > end)
			return null;
		int i = max(arr,start,end);
		Node temp = new Node(arr[i]);
		if(start == end)
			return temp;
		temp.left = build(arr,start,i-1);
		temp.right = build(arr,i+1,end);
		return temp;
	}
	
	public static int max(int[] a , int l ,int r)
	{
		int max = a[l];
		int index = l;
		for(int i = l;i<=r;i++)
		{
			if(max<a[i])
				{
				max = a[i];
				index = i;
				}
				
		}
		return index; 
	}
}
