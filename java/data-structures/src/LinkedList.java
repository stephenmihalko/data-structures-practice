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
		// Create new node and add the pointer to the old "first" as its next
		first = new Node(data, first);
		size++;
	}
	
	public void addToEnd(T data)
	{
		if (first == null)
			this.addToBeginning(data)
		else
		{
			// Get to the last node in the list
			Node n = first;
			while (n.next != null)
				n = n.next;
			
			// Create new node and set the next of the previous "last" to the new node
			n.next = new Node(data)
			
			size++;
		}
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
	
	public String toString()
	{
		
		String ret = "| ";
		Node n = first;
		if (first == null)
			return null;
		else
		{
			while (n != null)
			{
				ret += n.data.toString() + " | "
				n = n.next
			}
			// Chop off the last space.
			return ret.substring(0, ret.length()-1);
		}
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
