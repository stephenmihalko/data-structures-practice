public class LinkedList<T>
{
	Node<T> first;
	int size;
	
	public LinkedList()
	{
		size = 0;
	}
	
	public void addToBeginning(T data)
	{
		first = new Node(data, first);
		size++;
	}
	
	public void addToEnd(T data)
	{
		
	}
	
	public int size() { return size; }
	
	public T getBeginning()
	{
		
	}
	
	public T getEnd()
	{
		
	}
	
	public T removeBeginning()
	{
		
	}
	
	public T removeEnd()
	{
		
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
		
		public Node(T d, Node nx)
		{
			data = d;
			next = nx;
		}
	}
}
