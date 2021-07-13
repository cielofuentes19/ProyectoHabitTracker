
public class Node<T>
{
	private T data;
	private Node<T> next;

	public Node(T data)
	{
		this(data, null);
	}
	
	public Node(T data, Node<T> next)
	{
		this.data= data;
		this.next= next;	
	}

	//Get y Set de Data
	public T getData() {
		return this.data;
		}
	
	public void setData(T data) {
		this.data =data;
		}
	
	//Get y Set de Next
	public Node<T> getNext() {
		return this.next;
		}
	
	public void setNext(Node<T> next) {
		this.next = next;
		}
	
	//ToString
	public String toString()
	{
		return this.data.toString();
	}
}