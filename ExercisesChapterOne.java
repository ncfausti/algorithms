public class ExercisesChapterOne
{
  public static void main(String[] args)
  {
  // OneThreeSix();
   Stack<String> s = new Stack<String>();
   s.push("a");
   s.push("b");
   s.push("c");

   Stack<String> s1 = deepCopy(s);
   Stack<String> s2 = copy(s);

   print(s.peek());
   print(s1.peek());
   print(s2.peek());

  }

  // Reverses the order of items on a queue
  // Runtime: O(n)
  // Space: O(n)

  private static void OneThreeSix()
  {
    Queue<String> q = new Queue<String>();
    q.enqueue("alpha");
    q.enqueue("beta");
    q.enqueue("charlie");
    q.enqueue("delta");
    q.enqueue("edward");
    q.enqueue("felix");
    for (String item : q)
      print(item);
    Stack<String> stack = new Stack<String>();
    while(!q.isEmpty())
      stack.push(q.dequeue());
    while(!stack.isEmpty())
      q.enqueue(stack.pop());

    for (String item : q)
        print(item);
  }

  private static Stack<String> deepCopy(Stack<String> stack)
  {

    Stack<String> newStack = new Stack<String>();
    Queue<String> queue = new Queue<String>();

    for(String s : stack)
      newStack.push(s);
    return newStack;
  }

  private static Stack<String> copy(Stack<String> stack)
  {
    return stack;
  }

  private static void print(String s){ System.out.println(s); }

}
