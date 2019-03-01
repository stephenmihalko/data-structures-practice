/**
 * 
 * @author SMihalko
 *
 * @param <T>
 */
public class Stack<T>
{
	/**
	 * 
	 */
	LinkedList<T> list;
	
	/**
	 * 
	 */
	public Stack()
	{
		list = new LinkedList<T>();
	}
	
	/**
	 * 
	 * @param item
	 */
	public void push(T item)
	{
		list.addToBeginning(item);
	}
	
	/**
	 * 
	 * @return
	 */
	public T pop()
	{
		return list.removeBeginning();
	}
	
	/**
	 * 
	 * @return
	 */
	public boolean empty()
	{
		return list.size() == 0;
	}
	
	/**
	 * 
	 * @return
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

}
