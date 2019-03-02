/**
 * A basic stack implementation with linked list backend.
 * @author SMihalko
 *
 * @param <T> the class of data to be stored in this stack
 */
public class Stack<T>
{
	private LinkedList<T> list;
	
	/**
	 * Constructs an empty stack.
	 */
	public Stack()
	{
		list = new LinkedList<T>();
	}
	
	/**
	 * Pushes the element onto the top of this stack.
	 * @param item the element to be added to the stack.
	 */
	public void push(T item)
	{
		list.addToBeginning(item);
	}
	
	/**
	 * Pops the top element of this stack.
	 * @return the top element of this stack
	 * @throws NoSuchElementException if this stack is empty
	 */
	public T pop()
	{
		return list.removeBeginning();
	}
	
	/**
	 * Returns true if this stack is empty.
	 * @return true if this stack is empty, false otherwise.
	 */
	public boolean empty()
	{
		return list.size() == 0;
	}
	
	/**
	 * Returns the element at the top of this stack.
	 * @return the element at the top of this stack
	 * @throws NoSuchElementException if this stack is empty
	 */
	public T peek()
	{
		return list.getBeginning();
	}
	
	/**
	 * Determines the location of the element in this stack as a distance
	 * from the top of this stack. The first element is defined to be 1
	 * element from the top. Returns -1 if the element does not exist
	 * in this stack.
	 * @param item the element to be searched in this list
	 * @return the 1-based index of the element from the front of the list
	 */
	public int search(T item)
	{
		return list.search(item);
	}
	
	/**
	 * Prints this stack with the top at the left and pipes between elements.
	 * Uses the toString() method of the data stored in this stack.
	 */
	public String toString()
	{
		return list.toString().substring(2);
	}

}
