
public class Diameter {

	public static void main(String args[])
	{
		Node root = new Node(50);
		root.left = new Node(7);
		root.right = new Node(2);
		root.left.left = new Node(3);

		
		
		System.out.print(diameter(root));
	}
	
		// The diameter of a tree T is the largest of the following quantities:

		//* the diameter of T’s left subtree
		//* the diameter of T’s right subtree
		//* the longest path between leaves that goes through the root of T (this can be computed from the heights of the subtrees of T)
	
	public static int diameter(Node x)
	{
		if(x == null)
			return 0;
		int l = height(x.left);
		int r = height(x.right);
		int dl = diameter(x.left);
		int dr = diameter(x.right);
		return Math.max(Math.max(dl,dr),l+r+1);
	}
	
	public static int diameter2(Node x, Node height)
	{
		if(x==null)
			return 0;
		if(x.left == null && x.right == null)
		{
			height.val = 0;
			return 0;
		}
		Node lh = new Node(0);
		Node rh = new Node(0);
		int ldiam = diameter2(x.left,lh);
		int rdiam = diameter2(x.right,rh);
		height.val = Math.max(lh.val,rh.val) + 1;
		return Math.max(lh.val+rh.val + 1,Math.max(ldiam,rdiam));
	}
	
	
	public static int height(Node x)
	{
		if(x == null)
			return 0;
		int l = height(x.left);
		int r = height(x.right);
		return (Math.max(l,r)+1);
	}
}
