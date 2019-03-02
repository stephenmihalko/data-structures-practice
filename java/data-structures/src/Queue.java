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
	 * Determines the location of the element in this queue as a distance
	 * from the front of this queue. The first element is defined to be
	 * 1 element from the front. Returns -1 if the element does not exist
	 * in this queue.
	 * @param item the element to be searched in this queue
	 * @return the 1-based index of the element from the front of the queue
	 */
	public int search(T item)
	{
		return list.search(item);
	}
	
	/**
	 * Prints this queue with the front at the left and pipes between elements.
	 * Uses arrows "<--" to show directionality of printing.
	 * Uses the toString() method of the data stored in this list.
	 */
	 @Override
	public String toString()
	{
		String listStr = list.toString();
		return "<-- " + listStr.substring(2, listStr.length()-1) + " <--";
	}
}
	
