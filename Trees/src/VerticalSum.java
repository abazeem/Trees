import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;


public class VerticalSum {

	public static void main(String args[])
	{
		Node root = new Node(1);
		root.left = new Node(10);
		root.right = new Node(100);
		root.left.left = new Node(105);
		root.right.left = new Node(20);
		root.right.right = new Node(200);
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		calc(root,0,map);
		Set<Integer> set = map.keySet();
		Iterator<Integer> it = set.iterator();
		while(it.hasNext())
		{
			Object x = it.next();
			System.out.println(x + " " + map.get(x));
		}
		
	}
	
	public static void calc(Node x , int level, HashMap<Integer,Integer> map)
	{
		if(x==null)
			return;
		calc(x.left,level-1, map);
		int sum;
		if(map.get(level) == null)
			sum = x.val;
		else
			sum = x.val + map.get(level);
		map.put(level, sum);
		calc(x.right,level+1, map);
	}
}
