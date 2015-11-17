import java.util.HashMap;
import java.util.Map;

public class connectlevelnode {

	public static void main(String args[])
	{
		Nodel root = new Nodel(1);
		root.left = new Nodel(10);
		root.right = new Nodel(100);
		root.left.left = new Nodel(105);
		root.left.right = new Nodel(10);
		root.right.right = new Nodel(22);
//		root.right.left = new Nodel(55);
		connect2(root);
		disp(root);
	}
	
	public static void disp(Nodel x)
	{
		if(x == null)
			return ;
		disp(x.left);
		if(x.rightl == null)
			x.rightl = new Nodel(-1);
		System.out.println(x.val + " Next Right " + x.rightl.val);
		disp(x.right);
	}
	
/*	public static void calc(Node x)
	{
		if(x == null)
			return ;
		Map<Node,Integer> map = new HashMap<Node,Integer>();
		Queueint que = new Queueint(100);
		que.enqueue(x, 1);
		int level = que.lev[que.front];
		Node temp = que.dequeue();
		while(temp!=null)
		{
			map.put(temp,level);
			level++;
			if(temp.left!=null)
				que.enqueue(temp.left, level);
			if(temp.right!=null)
				que.enqueue(temp.right, level);
			if(!que.isEmpty())
			{
				level = que.lev[que.front];
				temp = que.dequeue();
			}
			else
				break;
		}
		System.out.println("");
	}
	*/
	
	public static void connect(Nodel x)
	{
		x.rightl = null;
		connectrec(x);
	}
	
	public static void connectrec(Nodel x)
	{
		if(x==null)
			return ;
		if(x.left!=null)
			x.left.rightl = x.right;
		if(x.right!=null)
		{
			if(x.rightl == null)
				x.right.rightl= null;
			else
				x.right.rightl = x.rightl.left;
		} 
		connectrec(x.left);
		connectrec(x.right);
	}
	
	
	public static void connect2(Nodel x)
	{
		x.rightl = null;
		connectrec2(x);
	}
	
	public static void connectrec2(Nodel x)
	{
		if(x == null)
			return;
		if(x.rightl !=null)
			connectrec2(x.rightl);
		if(x.left != null)
		{
			if(x.right != null)
			{
				x.left.rightl = x.right;
				x.right.rightl = getnextright(x);
			}
			else
				x.left.rightl = getnextright(x);
			connectrec2(x.left);
		}
		else
		{
			if(x.right!=null)
			{
				x.right.rightl = getnextright(x);
				connectrec2(x.right);
			}
			else
				connectrec2(getnextright(x));
		}
	}
	
	public static Nodel getnextright(Nodel x)
	{
		Nodel temp = x.rightl;
		while(temp!=null)
		{
			if(temp.left!=null)
				return temp.left;
			if(temp.right!=null)
				return temp.right;
			temp = temp.rightl;
		}
		return null;
	}
}
