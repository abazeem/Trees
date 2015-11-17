public class Maxsumleaf {

	public static void main(String args[])
	{
		Node x = new Node(10);
		x.left = new Node(20);
		x.right = new Node(50);
		x.left.left = new Node(10);
		Node a = target(x,new Node(0),null,0);
		target1(x,new Node(0),null,0);
		disp(x,a);
	}
	
	public static boolean disp(Node x, Node target)
	{
		if(x==null)
			return false ;
		if(x==target || disp(x.left,target)||disp(x.right,target))
		{
			System.out.print(x.val + " ");
			return true;
		}
		else
			return false;
	}
	
	public static Node target(Node x, Node maxsum, Node target, int sum)
	{
		if(x==null)
			return null;
		sum += x.val;
		if(x.left==null && x.right ==null)
		{
			if(sum>maxsum.val)
				{
					maxsum.val = sum;
					target = x;
				}
			return target;
		}
		else
		{
			Node l = target(x.left,maxsum,target,sum);
			Node r = target(x.right,maxsum,target,sum);
			if(l == null)
				l = new Node(0);
			if(r == null)
				r = new Node(0);
			if(l.val > r.val)
				return l;
			else
				return r;
		}
	}
		
		public static void target1(Node x, Node maxsum, Node target, int sum)
		{
			if(x==null)
				return ;
			sum += x.val;
			if(x.left==null && x.right ==null)
			{
				if(sum>maxsum.val)
					{
						maxsum.val = sum;
						target = x;
					}
			}
			else
			{
				target(x.left,maxsum,target,sum);
				target(x.right,maxsum,target,sum);
			}
	}
}
