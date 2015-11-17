import java.util.Arrays;
public class interpretations {

	public static void main(String args[])
	{
		int[] a = {1,2,2,1,9};
		NodeS x = gentree(0,"",a);
		disp(x);
	}
	
	public static NodeS gentree(int data, String txt, int[] a)
	{
		if( data > 26)
			return null;
		String t = txt +getalphabet(data);
		NodeS x = new NodeS(t);
		if(a.length>=1)
		{
			data = a[0];
			int[] newarray = Arrays.copyOfRange(a, 1, a.length);
			x.left = gentree(data,t,newarray);
		}
		if(a.length >=2)
		{
			data = 10* a[0] + a[1];
			int[] newarray = Arrays.copyOfRange(a, 2, a.length);
			x.right = gentree(data,t,newarray);
		}
		return x;
	}
	
	public static void disp(NodeS x)
	{
		if( x == null)
			return;
		if( x.left == null && x.right == null)
			System.out.print(x.val + " ");
		disp(x.left);
		disp(x.right);
	}
	
	public static String getalphabet(int i)
	{
		if (i == 0)
			return  "";
		else
			return (Character.toString((char)(i+96)));
	}
	
}