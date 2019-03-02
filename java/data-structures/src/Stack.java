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
		return list.toString().substring(2);
	}

}
