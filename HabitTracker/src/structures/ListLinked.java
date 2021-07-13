package structures;
public class ListLinked <E> implements TDAList <E>
{
	private Node<E> first;
	private int count;
	
	public ListLinked()
	{
		this.first=null;
		this.count = 0;
	}
	
	public Node<E> getFirst() {return first;}
	public void setFirst(Node<E> first) {this.first = first;}

	public int getCount() {return count;}
	public void setCount(int count) {this.count = count;}
	
	public boolean isEmptyList()
	{
		return this.first == null;
		
	}
	
	public int length()
	{
		return this.count;
	}
	
	public void destroyList()
	{
		while(this.first != null)
			this.first = this.first.getNext();
	}
	
	public int search(E x)
	{
		Node <E> aux= this.first;
		for(int i=0 ;aux!=null; aux=aux.getNext(), i++)
			if (aux.getData().equals(x))
				return i;
		
		return -1;
	}
	
	public void insertLast(E x)
	{
		if(this.isEmptyList())
			this.insertFirst(x);
		
		else
		{
			Node<E> lastNode=getLastNode();
			lastNode.setNext(new Node<E>(x));
			this.count++;
		}
	}
	
	private Node<E> getLastNode()
	{
		Node<E> aux = this.first;
		
		while(aux.getNext()!= null)
			aux = aux.getNext();
		
		return aux;
	}
	
	public void insertFirst(E x)
	{
		this.first = new Node<E>(x,this.first);
		this.count++;
	}
	
	
	public void remove(E x)
	{
		if(this.isEmptyList())
			return;
		else
		{
		    int pos = this.search(x);
		    
			if(pos != -1)
			{
				Node<E> aux = this.first;
				Node<E> temp = null;
				
				if(this.first.getData().equals(x))
				{
					temp = this.first;
					this.first = this.first.getNext();
					temp = null;
				}
				else
				{
					while(aux.getNext().getData().equals(x) == false)
						aux = aux.getNext();
					
					temp = aux.getNext();
					aux.setNext(temp.getNext());
					temp = null;
				}
				this.count--;
			}
			else
				System.err.println("Item  '" + x + "'  not found...\n");	
		}
	}
	
	public String toString()
	{
		String str="";
		Node<E> aux = this.first;
		
		for (int i = 0; aux != null; aux = aux.getNext(), i++)
			str += aux.getData() + "\t--->\t";
		
		return str;
	}	
}
