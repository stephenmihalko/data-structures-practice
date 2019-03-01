/**
 * 
 * @author SMihalko
 *
 * @param <T>
 */
public class Queue<T>
{
	/**
	 * 
	 */
	private LinkedList<T> list;
	
	/**
	 * 
	 */
	public Queue()
	{
		list = new LinkedList<T>();
	}
	
	/**
	 * 
	 * @param item
	 */
	public void enqueue(T item)
	{
		list.addToEnd(item);
	}
	
	/**
	 * 
	 * @return
	 */
	public T dequeue()
	{
		return list.removeBeginning();
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
	 * @return
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
