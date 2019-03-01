
public class LinkedListTester
{

	public static void main(String[] args)
	{
		LinkedList<Integer> begin = new LinkedList<Integer>();
		LinkedList<Integer> end = new LinkedList<Integer>();
		
		System.out.println("====== Testing print empty list ======");
		System.out.println(begin);
		
		System.out.println("====== Testing add to beginning ======");
		for (int i = 0; i < 10; i++)
			begin.addToBeginning(i);
		System.out.println(begin);
		
		System.out.println("====== Testing add to end ======");
		for (int i = 0; i < 10; i++)
			end.addToEnd(i);
		System.out.println(end);
		
	}

}
