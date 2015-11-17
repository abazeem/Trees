public class Stack {
	
	int top;
	Node[] a;
	int size;
	public Stack(int x)
	{
		size = x;
		a = new Node[x];
		top = -1;		
	}
	public Node peek()
	{
		return(a[top]);
	}
	
	public Node pop()
	{
		return(a[top--]);
	}
	public void push(Node x)
	{
		if(x==null)
			return;
		a[++top] = x;
	}
	public boolean isEmpty()
	{
		return (top == -1);
	}
}
