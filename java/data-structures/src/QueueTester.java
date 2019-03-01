
public class QueueTester
{
	public static void main(String[] args)
	{
		Queue<Integer> q = new Queue<Integer>();
		System.out.println("Creating queue...");
		System.out.println("Is queue empty? " + q.empty());
		System.out.println("\nAdding elements to queue...");
		for (int i = 12; i < 17; i++)
			q.enqueue(i);
		System.out.println(q);
		System.out.println("Is queue empty? " + q.empty());
		
		System.out.println("\nSearching queue...");
		for (int i = 12; i < 18; i++)
			System.out.println("The element " + i + " is " + q.search(i) + " space(s) from the front.");
		
		System.out.println("\nThe element at the front of the queue is " + q.peek() + ".");
		
		System.out.println("\nRemoving elements from queue...");
		for (int i = 0; i < 5; i++)
			System.out.println("Removed " + q.dequeue() + " from queue.");
		System.out.println("Is queue empty? " + q.empty());
		
	}
}
