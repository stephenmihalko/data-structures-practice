/**
 * A basic queue implementation with a Linked List backend.
 * @author SMihalko
 *
 * @param <T> the class of data to be stored in this queue
 */
public class Queue<T>
{
	private LinkedList<T> list;
	
	/**
	 * Constructs an empty queue.
	 */
	public Queue()
	{
		list = new LinkedList<T>();
	}
	
	/**
	 * Adds the specified element to the back of this queue.
	 * @param item the element to be added to this queue
	 */
	public void enqueue(T item)
	{
		list.addToEnd(item);
	}
	
	/**
	 * Removes and returns the element at the front of this queue.
	 * @return the element at the front of this queue
	 * @throws NoSuchElementException is this queue is empty
	 */
	public T dequeue()
	{
		return list.removeBeginning();
	}
	
	/**
	 * Returns the element at the front of this queue.
	 * @return the element at the front of this queue
	 * @throws NoSuchElementException is this queue is empty
	 */
	public T peek()
	{
		return list.getBeginning();
	}
	
	/**
	 * Returns true if this queue is empty.
	 * @return true if this queue is empty, false otherwise
	 */
	public boolean empty()
	{
		return list.size() == 0;
	}
	
	/**
	 * 
	 * @param item
	 * @return
	 */
	public int search(T item)
	{
		return list.search(item);
	}
	
	/**
	 * 
	 */
	public String toString()
	{
		String listStr = list.toString();
		return "<-- " + listStr.substring(2, listStr.length()-1) + " <--";
	}
}
