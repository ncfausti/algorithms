// Parentheses.java
//
// Problem 1.3.4 - Algorithms, 4th Ed.
//
// Checks whether a given string has properly balanced parentheses,
// brackets, and square brackets
// 
// Written by Nick Fausti - Monday January 11th, 2016
public class Parentheses
{
	public static void main(String[] args)
	{
		Stack<String> open = new Stack<String>();
		Stack<String> close = new Stack<String>();
		String s;
		
		while(!StdIn.isEmpty())
		{
			s = StdIn.readString();
		}

		for (char c : s.toCharArray())
		{
			StdOut.println(c);
		}
	}
}