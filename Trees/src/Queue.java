public class Queue
{
	int cap;
	int front;
	int last;
	Node[] a;
	public Queue(int c)
	{
		cap = c;
		front =-1;
		last = 0;
		a = new Node[c];
	}
	public void enqueue(Node x)
	{
		if(x== null)
			return;
		if(front <cap)
			a[++front] = x;
		else
			System.out.println("Queue OverFlow");
	}
	public Node dequeue()
	{
		if(last<=front)
			return(a[last++]);
		else
			//System.out.println("Queue Underflow");
			return null;
	}
}