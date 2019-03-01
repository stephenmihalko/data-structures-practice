import java.util.NoSuchElementException;
/**
 * 
 * @author SMihalko
 *
 * @param <T>
 */
public class LinkedList<T>
{
	/**
	 * 
	 */
	private Node<T> first;
	/**
	 * 
	 */
	private int size;
	
	/**
	 * 
	 */
	public LinkedList()
	{
		size = 0;
	}
	
	/**
	 * 
	 * @param data
	 */
	public void addToBeginning(T data)
	{
		// Create new node and add the pointer to the old "first" as its next
		first = new Node<T>(data, first);
		size++;
	}
	
	/**
	 * 
	 * @param data
	 */
	public void addToEnd(T data)
	{
		if (first == null)
			this.addToBeginning(data);
		else
		{
			// Get to the last node in the list
			Node<T> n = first;
			while (n.next != null)
				n = n.next;
			
			// Create new node and set the next of the previous "last" to the new node
			n.next = new Node<T>(data);
			size++;
		}
	}
	
	/**
	 * 
	 * @return
	 */
	public int size() { return size; }
	
	/**
	 * 
	 * @return
	 */
	public T getBeginning()
	{
		if (first == null)
			throw new NoSuchElementException("Cannot get node from empty list.");
		else
			return first.data;
	}
	
	/**
	 * 
	 * @return
	 */
	public T getEnd()
	{
		if (first == null)
			throw new NoSuchElementException("Cannot get node from empty list.");
		else
		{
			// Get to the last node in the list
			Node<T> n = first;
			while (n.next != null)
				n = n.next;
			
			return n.data;
		}
	}
	
	/**
	 * 
	 * @return
	 */
	public T removeBeginning()
	{
		if (first == null)
			throw new NoSuchElementException("Cannot remove node from empty list.");
		
		T ret = this.getBeginning();
		first = first.next;
		size--;
		return ret;
	}
	
	/**
	 * 
	 * @return
	 */
	public T removeEnd()
	{
		// If it's an empty list.
		if (first == null)
			throw new NoSuchElementException("Cannot remove node from empty list.");
		// If there's only one element.
		else if (first.next == null)
		{
			T ret = first.data;
			first = null;
			size--;
			return ret;
		}
		// If there are 2+ elements
		else
		{
			Node<T> curr = first, prev = first;
			while (curr.next != null)
			{
				prev = curr;
				curr = curr.next;
			}
			prev.next = null;
			size--;
			return curr.data;
		}
	}
	
	/**
	 * 
	 * @param item
	 * @return
	 */
	public boolean contains(T item)
	{		
		Node<T> n = first;
		while (n != null)
		{
			if (n.data.equals(item))
				return true;
		}
		
		return false;
	}
	
	/**
	 * 
	 */
	public String toString()
	{
		String ret = "| ";
		Node<T> n = first;
		if (first == null)
			return null;
		else
		{
			while (n != null)
			{
				ret += n.data.toString() + " | ";
				n = n.next;
			}
			// Chop off the last space.
			return ret.substring(0, ret.length()-1);
		}
	}
	
	/**
	 * 
	 * @author SMihalko
	 *
	 * @param <T>
	 */
	private class Node<T>
	{
		T data;
		Node<T> next;
		
		public Node(T d)
		{
			data = d;
			// Keep next as null
		}
		
		public Node(T d, Node<T> nx)
		{
			data = d;
			next = nx;
		}
	}
}
