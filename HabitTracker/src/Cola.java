
public class Cola implements InterfazCola
{
	private Node primero;
	private Node ultimo;
	
	public Cola(Node primero, Node ultimo)
	{
		super();
		this.primero = primero;
		this.ultimo = ultimo;
	}

	public Cola()
	{
		this.primero = null;
		this.ultimo = null;
	}

	//Insertar aplicaciones en la cola
	public void enQueue(String x)
	{
		Node nuevo = new Node(x);
		
		if(this.isEmpty())
		{
			this.primero = nuevo;
			this.primero.setNext(null);
			this.ultimo = nuevo;
		}
		else
		{
			this.ultimo.setNext(nuevo);
			nuevo.setNext(null);
			this.ultimo = nuevo;
		}
	}

	//Eliminar aplicaciones en la cola
	public String deQueue() throws ExceptionIsEmpty
	{
		return null;
	}

	//Retorna elemento final de la cola
	public String front() throws ExceptionIsEmpty
	{
		return null;
	}

	//Retorna elemento inicial de la cola
	public String back() throws ExceptionIsEmpty
	{
		return null;
	}

	//Validar si la cola está vacía
	public boolean isEmpty() 
	{
		return this.primero == null;
	}

	//Buscar aplicacion en la cola
	public String search() throws ExceptionIsEmpty
	{
		return null;
	}
	
	public String toString()
	{
		String str = "";
		Node aux = this.primero;
		
		if(primero != null)
		{
			while(aux != null)
			{
				str += aux.getData() + "\n";
				aux = aux.getNext();				
			}	
			return str;
		}
		else
			return null;
	}

	//Eliminar todos las aplicaciones de la cola
	public void deleteQueue()
	{
		while(this.primero != null)
			this.primero = this.primero.getNext();
	}
}
