
public class Queueint {

	int capacity;
	int front;
	int last;
	Node[] a;
	int[] lev; 	
	public Queueint(int c)
	{
		front = -1;
		last = 0;
		a = new Node[c];
		capacity = c;
		lev = new int[c];
	}
	
	public boolean isEmpty()
	{
		return(front < last);
	}
	public void enqueue(Node x , int l)
	{
		if(front < capacity)
		{
			a[++front] = x;
			lev[front] = l;
		}
		else
			System.out.print("Queue Full");
	}
	
	public Node dequeue()
	{
		if(front>=last)
			return (a[last++]);
		else
			return null;
	}
}