public class StackClient
{
	public static void main(String[] args)
	{
		Stack<String> stack = new Stack<String>();
		stack.push("hi");
		stack.push("there");
		
		for(String s : stack)
			StdOut.println(s);
	}
}