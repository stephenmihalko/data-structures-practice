
public class LinkedListTester
{

	public static void main(String[] args)
	{
		LinkedList<Integer> begin = new LinkedList<Integer>();
		LinkedList<Integer> end = new LinkedList<Integer>();
		
		System.out.println("====== Empty list ======");
		System.out.println("List: " + begin);
		System.out.println("Size: " + begin.size());
		System.out.println("Get first element: " + begin.getBeginning());
		System.out.println("Remove first element: " + begin.removeBeginning());
		System.out.println("New size: " + begin.size());
		
//		System.out.println("====== Testing add to beginning ======");
//		for (int i = 0; i < 37; i++)
//			begin.addToBeginning(i);
//		System.out.println(begin);
//		System.out.println("Size = " + begin.size());
//		
//		System.out.println("====== Testing add to end ======");
//		for (int i = 0; i < 10; i++)
//			end.addToEnd(i);
//		System.out.println(end);
//		System.out.println("Size = " + end.size());
		
	}
	

}
