import java.util.NoSuchElementException;
/**
 * A class that implements a LinkedList. Note: this class does not implement any interface
 * that the official LinkedList does, so it does not have the required methods.
 *
 * @param <T> the class of objects to be stored in the Linked List
 */
public class LinkedList<T>
{
	private Node<T> first;
	private int size;
	
	/**
	 * Constructs an empty list.
	 */
	public LinkedList()
	{
		size = 0;
	}
	
	/**
	 * Constructs a list containing the specified element.
	 * @param data the element to be stored in this list
	 */
	public LinkedList(T data)
	{
		size = 1;
		this.addToEnd(data);
	}
	
	/**
	 * Inserts the specified element at the beginning of this list.
	 * @param data the element to add
	 */
	public void addToBeginning(T data)
	{
		// Create new node and add the pointer to the old "first" as its next
		first = new Node<T>(data, first);
		size++;
	}
	
	/**
	 * Inserts the specified element at the end of this list.
	 * @param data the element to add
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
	 * Returns the number of elements in this list.
	 * @return the number of elements in this list
	 */
	public int size() { return size; }
	
	/**
	 * Returns the first element in this list.
	 * @return the first element in this list
	 * @throws NoSuchElementException if this list is empty
	 */
	public T getBeginning()
	{
		if (first == null)
			throw new NoSuchElementException("Cannot get element from empty list.");
		else
			return first.data;
	}
	
	/**
	 * Returns the last element in this list.
	 * @return the last element in this list
	 * @throws NoSuchElementException if this list is empty
	 */
	public T getEnd()
	{
		if (first == null)
			throw new NoSuchElementException("Cannot get element from empty list.");
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
	 * Removes and returns the first element in this list.
	 * @return the first element in this list
	 * @throws NoSuchElementException if this list is empty
	 */
	public T removeBeginning()
	{
		if (first == null)
			throw new NoSuchElementException("Cannot remove element from empty list.");
		
		T ret = this.getBeginning();
		first = first.next;
		size--;
		return ret;
	}
	
	/**
	 * Removes and returns the last element in this list.
	 * @return the last element in this list
	 * @throws NoSuchElementException if this list is empty
	 */
	public T removeEnd()
	{
		// If it's an empty list.
		if (first == null)
			throw new NoSuchElementException("Cannot remove element from empty list.");
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
	 * Returns true if this list contains the specified element.
	 * @param item the element whose presence is to be tested
	 * @return true if the element exists in this list
	 */
	public boolean contains(T item)
	{		
		return this.search(item) != -1;
	}
	
	/**
	 * Determines the location of the element in this list as a distance
	 * from the beginning of this list. The first element is defined to be
	 * 1 element from the beginning. Returns -1 if the element does not exist
	 * in this list.
	 * @param item the element to be searched in this list
	 * @return the 1-based index of the element from the front of the list
	 */
	public int search(T item)
	{
		Node<T> n = first;
		int i = 1;
		while (n != null && i <= size)
		{
			if (n.data.equals(item))
				return i;
			i++;
			n = n.next;
		}
		return -1;
	}
	
	/**
	 * Prints this list with the beginning at the left and pipes between elements.
	 * Uses the toString() method of the data stored in this list.
	 */
	 @Override
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
	
	
	private class Node<T>
	{
		private T data;
		private Node<T> next;
		
		private Node(T d)
		{
			data = d;
			// Keep next as null
		}
		
		private Node(T d, Node<T> nx)
		{
			data = d;
			next = nx;
		}
	}
}
