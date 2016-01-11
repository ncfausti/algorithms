import java.util.Iterator;
public class Stack<Item> implements Iterable<Item>
{
	private Node first; // top of stack, most recently added node
	private int N;

	private class Node
	{
		Item item;
		Node next;
	}

	public boolean isEmpty() { return N == 0; }
	public int size() { return N; }

	public void push(Item item)
	{	// add item to top of stack
		Node oldfirst = first;
		first = new Node();
		first.item = item;
		first.next = oldfirst;
		N++;
	}

	public Item pop()
	{   // remove the item from top of stack
		if (isEmpty()) throw new NullPointerException();
		Item item = first.item;
		first = first.next;
		N--;
		return item;
	}

	public Iterator<Item> iterator()
	{ return new ListIterator(); }
	
	private class ListIterator implements Iterator<Item>
	{
		private Node current = first;

		public boolean hasNext()
		{ return current != null; }

		public void remove(){ }
		public Item next()
		{
			Item item = current.item;
			current = current.next;
			return item;
		}
	}

	public static void main(String[] args)
	{
		Stack<String> stack = new Stack<String>();
		
		while(!StdIn.isEmpty())
		{
			String item = StdIn.readString();
			if (!item.equals("-"))
				stack.push(item);
			else if (!stack.isEmpty()) StdOut.print(stack.pop() + " ");
		}

		StdOut.println("(" + stack.size() + " left on stack)");
	}
}