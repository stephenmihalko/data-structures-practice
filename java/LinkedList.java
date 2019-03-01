public class LinkedList<T>
{
	int size;
	
	public LinkedList()
	{
		size = 0;
	}
	
	public class Node<T>
	{
		T data;
		Node next;
		
		public Node(T d)
		{
			data = d;
			// Keep next as null
		}
	}
}
