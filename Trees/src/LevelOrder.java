
public class LevelOrder {
	public static void main(String args[])
	{
		Node root = new Node(1);
		root.left = new Node(10);
		root.right = new Node(100);
		root.left.left = new Node(105);
		root.right.left = new Node(20);
		root.right.right = new Node(200);
		iterlevel(root);
//		iterlevelrev(root);
//		dispQueue(root);
		dispspiral(root);
		
	}
	
	public static int height(Node x)
	{
		if(x == null)
			return 0;
		else
		{
			int a = height(x.left);
			int b = height(x.right);
			return(Math.max(a,b)+1);
		}
	}

	public static void iterlevel(Node x)
	{
		int h = height(x);
		int i =1;
		for(i=1;i<=h;i++)
		{		
			printlevel(x,i);
			System.out.println();
		}
	}		
		
	public static void iterlevelrev(Node x)
	{
		int h = height(x);
		for(int i =h; i>=1;i--)
		{
			printlevel(x,i);
			System.out.println();
		}
	}
	
	
	public static void printlevel(Node x, int level)
	{
		if(x==null)
			return;
		if(level==1)
			System.out.print(x.val + " ");
		else
		{
			printlevel(x.left,level-1);
			printlevel(x.right,level-1);
		}
	}
	
	public static void dispQueue(Node x)
	{
		Queue que = new Queue(500);
		Node temp = x;
		while(temp!=null)
		{
			System.out.println(temp.val);
			if(x.left !=null)
				que.enqueue(temp.left);
			if(x.right !=null)
				que.enqueue(temp.right);
				temp = que.dequeue();
		}
	}

	public static void dispspiral(Node x)
	{
		int h = height(x);
		boolean ltr = false;
		for ( int i = 1; i<=h;i++)
		{
			printspiral(x,i,ltr);
			ltr = !ltr;
			System.out.println("");
		}
	}

	public static void printspiral(Node x, int level , boolean ltr)
	{
		if(x==null)
			return;
		if(level==1)
			System.out.print(x.val + " ");
		else
		{
			if(ltr)
			{	printspiral(x.left,level-1,ltr);
				printspiral(x.right,level-1,ltr);
			}
			else
			{
				printspiral(x.right,level-1,ltr);
				printspiral(x.left,level-1,ltr);
			}
		}
		
	}
}
