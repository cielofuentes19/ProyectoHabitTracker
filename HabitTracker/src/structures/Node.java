package structures;

public class Node
{
	private String data;
	private Node next;

	public Node(String data)
	{
		this(data, null);
	}
	
	public Node(String data, Node next)
	{
		this.data= data;
		this.next= next;	
	}

	//Get y Set de Data
	public String getData() {return this.data;}
	public void setData(String data) {this.data =data;}
	
	//Get y Set de Next
	public Node getNext() {return this.next;}
	public void setNext(Node next) {this.next=next;}
	
	//ToString
	public String toString()
	{
		return this.data.toString();
	}
}