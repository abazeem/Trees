public class TreetoList {
	public static void main(String args[])
	{
		Node root = new Node(4);
		root.left = new Node(2);
		root.right = new Node(5);
		root.left.left = new Node(1);
		root.left.right = new Node(3);
		Node a =Treetolist(root);
		System.out.print(a.val);
	}
	public static void join(Node a, Node b)
	{
		a.right = b;
		b.left = a;
	}
	public static Node append(Node a , Node b)
	{
		if(a==null)
			return b;
		if(b==null)
			return a;
		Node alast = a.left;
		Node blast = b.left;
		join(alast,b);
		join(blast,a);
		return a;
	}
	public static Node Treetolist(Node a)
	{
		if(a==null)
			return null;
		Node x = Treetolist(a.left);
		Node y = Treetolist(a.right);
		a.left = a;
		a.right = a;
		x = append(x,a);
		x = append(x,y);
		return x;
	}
}
