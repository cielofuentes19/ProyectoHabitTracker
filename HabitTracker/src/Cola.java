
public class Cola implements InterfazCola
{
	private Node aplicaciones;
	private int primero;
	private int ultimo;
	private int numElem;
	
	public Cola(int primero, int ultimo, int numElem)
	{
		super();
		this.primero = primero;
		this.ultimo = ultimo;
		this.numElem = numElem;
	}
	
	public Cola()
	{
		this.aplicaciones = null;
	}

	//Insertar aplicaciones en la cola
	public void enQueue(String x)
	{
		
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
		return false;
	}

	//Buscar aplicacion en la cola
	public String search() throws ExceptionIsEmpty
	{
		return null;
	}
}
