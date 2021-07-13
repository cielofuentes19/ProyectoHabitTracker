package structures;

public class Node<E>
{
	protected E data;
	protected Node<E> next;
	
	public Node(E data)
	{ 
		this (data, null); 
	}
	
	public Node(E data, Node<E> next)
	{
		this.data = data;
		this.next = next;
	}
	
	//Get y Set de Data
	public E getData() {return this.data;}	
	public void setData(E data) {this.data = data;}
	
	//Get y Set de Next
	public Node<E> getNext() {return this.next;}
	public void setNext(Node<E> next) {this.next = next;}
	
	//ToString
	public String toString()
	{
		return this.data.toString();
	}
}