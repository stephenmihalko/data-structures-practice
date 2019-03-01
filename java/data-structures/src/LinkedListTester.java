
public class LinkedListTester
{

	public static void main(String[] args)
	{
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		System.out.println("====== Empty list ======");
		System.out.println("List: " + list);
		System.out.println("Size: " + list.size());
		System.out.println("Get first element: " + list.getBeginning());
		System.out.println("Remove first element: " + list.removeBeginning());
		System.out.println("New size: " + list.size());
		System.out.println();
		
		System.out.println("====== Testing add to beginning ======");
		for (int i = 1; i < 37; i+=10)
			list.addToBeginning(i);
		System.out.println(list);
		System.out.println("Size: " + list.size());
		System.out.println();
		
		System.out.println("====== Testing add to end ======");
		for (int i = 14; i < 19; i+=2)
			list.addToEnd(i);
		System.out.println(list);
		System.out.println("Size: " + list.size());
		System.out.println();
		
		System.out.println("====== Testing get beginning ======");
		System.out.println("First element: " + list.getBeginning());
		System.out.println("List after getting: " + list);
		System.out.println();
		
		System.out.println("====== Testing remove beginning ======");
		for (int i = 0; i < 20; i++)
		{
			System.out.println(list.removeBeginning() + " size: " + list.size());
		}
	}
	

}
