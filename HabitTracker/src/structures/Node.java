package structures;

public class Node<C>
{
	private C data;
	private Node<C> next;

	public Node(C data)
	{
		this(data, null);
	}
	
	public Node(C data, Node next)
	{
		this.data= data;
		this.next= next;	
	}

	//Get y Set de Data
	public C getData() {return this.data;}
	public void setData(C data) {this.data =data;}
	
	//Get y Set de Next
	public Node<C> getNext() {return this.next;}
	public void setNext(Node<C> next) {this.next=next;}
	
	//ToString
	public String toString()
	{
		return this.data.toString();
	}
}