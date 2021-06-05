package structures;
import exceptions.ExceptionIsEmpty;
import exceptions.ItemNoFound;

public class Cola implements InterfazCola
{
	private Node primero;
	private Node ultimo;
	private int tama�o;
	
	public Cola(Node primero, Node ultimo, int tama�o)
	{
		super();
		this.primero = primero;
		this.ultimo = ultimo;
		this.tama�o = tama�o;
	}

	public Cola()
	{
		this.primero = null;
		this.ultimo = null;
		this.tama�o = 0;
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
		this.tama�o++;
	}
	
	//Tama�o de la cola de aplicaciones
	public int length() 
    {
        return tama�o;
    }

	//Eliminar aplicaciones en la cola
	public void deQueue(String x) throws ExceptionIsEmpty, ItemNoFound
    {
        Node actual = new Node(x);
        actual = this.primero;
        Node anterior = null;
        
        if (actual==null) 
        {
            throw new ExceptionIsEmpty("No hay elementos en la cola...");
        }
        
        boolean busqueda = this.search(x);
        if(busqueda == false) 
        {
            throw new ItemNoFound("El nodo " + x + "no se encuentra");
        }
        
        else 
        {
        	 if(actual == this.primero) 
             {
                 this.primero = this.primero.getNext();
                 System.out.println("Primero en la cola eliminado");
             }
             else if(actual == this.ultimo) 
             {
                 anterior = this.ultimo;
                 this.ultimo = this.ultimo.getNext();
                 anterior.setNext(null);
                 this.ultimo = anterior;
                 anterior = null;
                 System.out.println("Nodo eliminado");
             }
             else 
             {
                 anterior = actual.getNext();
                 actual.setNext(anterior.getNext());
                 anterior = null;
                 System.out.println("Nodo eliminado");
             }   
             this.tama�o--;
        }
        anterior = actual;
        actual = actual.getNext();
    }
		
	//Retorna elemento inicial de la cola
	public Node front() throws ExceptionIsEmpty
	{
		if(!this.isEmpty())
		{
			return this.primero;
		}
		else
		{
			throw new ExceptionIsEmpty ("La cola esta vacia. ");
		}
	}

	//Retorna elemento final de la cola
	public Node back() throws ExceptionIsEmpty
	{
		if(!this.isEmpty())
		{
			return this.ultimo;
		}
		else
		{
			throw new ExceptionIsEmpty ("La cola esta vacia. ");
		}
	}

	//Validar si la cola est� vac�a
	public boolean isEmpty() 
	{
		if(this.primero==null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	//Buscar aplicacion en la cola
	public boolean search(String x) throws ItemNoFound
	{
		if (this.isEmpty())
			throw new ItemNoFound("No hay elementos en la cola...");
		else 
		{
			Node aux = this.primero;
			for (int i = 0; aux != null; aux = aux.getNext(), i++) 
				if (aux.getData().equals(x))
					return true;
			return false;
		}
	}
	
	//Eliminar todos las aplicaciones de la cola
	public void deleteQueue()
	{
		while(this.primero != null)
		{
			this.primero = this.primero.getNext();
			this.tama�o--;
		}
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
}
