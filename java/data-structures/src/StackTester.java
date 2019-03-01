
public class StackTester
{
	public static void main(String[] args)
	{
		Stack<Integer> stk = new Stack<Integer>();
		System.out.println("Creating stack...");
		System.out.println("Is stack empty? " + stk.empty());
		System.out.println("\nAdding elements to stack...");
		for (int i = 12; i < 17; i++)
			stk.push(i);
		System.out.println(stk);
		System.out.println("Is stack empty? " + stk.empty());
		
		System.out.println("\nSearching stack...");
		for (int i = 12; i < 18; i++)
			System.out.println("The element " + i + " is " + stk.search(i) + " space(s) from the top.");
		
		System.out.println("\nThe element on top of the stack is " + stk.peek() + ".");
		
		System.out.println("\nRemoving elements from stack...");
		for (int i = 0; i < 5; i++)
			System.out.println("Removed " + stk.pop() + " from stack.");
		System.out.println("Is stack empty? " + stk.empty());
		

	}
}
