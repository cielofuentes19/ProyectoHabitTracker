
public class Arbol<A extends Comparable<A>>
{
	class Node
	{
		protected A data;
		protected Node left, right;
		
		public Node(A data)
		{
			this (data,null,null);
		}
		
		public Node(A data, Node left, Node right)
		{
			this.data = data;
			this.left = left;
			this.right = right;
		}
	}
	
	private Node root;
	
	public Arbol()
	{
		this.root = null;
	}
	
	public boolean isEmpty()
	{
		return this.root == null;
	}
	
	public void insert(A x) throws ItemDuplicated
	{
		this.root = insertRec(x, this.root);
	}
	
	private Node insertRec(A x, Node actual) throws ItemDuplicated
	{
		Node res = actual;
		
		if(actual == null)
			res = new Node(x);
		
		else
		{
			int resC = actual.data.compareTo(x);
			
			if(resC == 0)
				throw new ItemDuplicated("El contador de tiempo: "+ x + " ya fue insertado antes...");
			
			if(resC < 0)
				res.right = insertRec(x, actual.right);
			
			else
				res.left = insertRec(x, actual.left);
		}
	
		return res;
	}
	
	public A search(A x) throws ItemNoFound
	{
		Node resp = searchRec(x, this.root);
		
		if(resp == null)
			throw new ItemNoFound("El tiempo: "+ x + " no se encuentra...");
		
		return resp.data;
	}
	
	private Node searchRec(A x, Node actual) throws ItemNoFound
	{
		if(actual == null)
			return null;
		
		else
		{
			int resC = actual.data.compareTo(x);
			
			if(resC < 0)
				return searchRec(x, actual.right);
			
			else if (resC > 0)
				return searchRec(x, actual.left);
			
			else
				return actual;
		}
	}
	
	public void remove(A x) throws ItemNoFound
	{
		this.root = removeRec(x, this.root);
	}
	
	private Node removeRec(A x, Node actual) throws ItemNoFound
	{
		Node res = actual;
		
		if(actual == null)
			throw new ItemNoFound("El tiempo: "+ x + " no se encuentra...");
		
		else
		{
			int resC = actual.data.compareTo(x);
			
			if(resC < 0)
				res.right = removeRec(x, actual.right);
			
			else if (resC > 0)
				res.left = removeRec(x, actual.left);
			
			else
			{
				if (actual.left != null && actual.right != null) 
                {
                    res.data = minRecover(actual.right).data;
                    res.right = minRemove(actual.right);
                }

				else
					res = (actual.left != null) ?  actual.left : actual.right;	
			}	
		}
		return res;
	}
	
	protected Node minRemove(Node actual) 
    {
        if (actual.left != null) 
            actual.left = minRemove(actual.left);
        else
            actual = actual.right;
        return actual;
    }

    protected Node minRecover(Node actual) 
    {
        if (actual.left != null)
            actual = actual.left;
        return actual;
    }

	public int nroHojas(Node actual)
	{ 
		int conta = 0;
		if(actual.left==null && actual.right==null) 
			conta = 1;
		else 
		{
			if(actual.left!=null) 
				conta += nroHojas(actual.left); 
			if(actual.right!=null)
				conta += nroHojas(actual.right); 
		}
		return conta;
	}
	
	public int nroHojas() 
	{
		return nroHojas(root);
	}
	
	public int nroNodos(Node actual) 
	{ 
		int conta = 0;
		if(actual.data==null) 
			conta = 0;
		else 
			conta = 1;

		if(actual.left!=null) 
            conta += nroNodos(actual.left); 
 
        if(actual.right!=null) 
            conta += nroNodos(actual.right); 
        return conta;
	}
	
	public int nroNodos() 
	{
		return nroNodos(root);
	}
	
	public int nodosNoHojas() 
	{ 
		return nroNodos(root) - nroHojas(root);
	}
	
	public int altura(Node actual) 
	{ 
		int alturaLeft = 0;
		int alturaRight = 0;
		int altura = 0;
		if(actual==null)
			return 0;
		if(actual.left==null && actual.right==null) 
			return 1;
		else 
		{
			if(actual.left!=null)  
				alturaLeft = altura(actual.left); 
			
			if(actual.right!=null) 
				alturaRight = altura(actual.right);
			
		}
		altura = Math.max(alturaRight, alturaLeft);
		return altura+1;
	}
	
	public int altura() {
		return altura(root);
	}

	public int area() {
		return nroHojas() * altura();
	}
	
	public int retornarAlturaNodo(A x) throws ItemNoFound
    {
        if (this.isEmpty())
            System.out.println("\nArbol esta vacio...");

        else if (search(x) == null)
            throw new ItemNoFound("\nEl tiempo "+ x + " no se encuentra...");

        else
            return retornarAlturaNodo(this.root, x, 1); 

        return 0;
    }

    private int retornarAlturaNodo(Node actual, A x, int altu)
    {
        if(actual == null)
            return 0;

        if(actual == x)
            return altu;

        int nivel = retornarAlturaNodo(actual.left,x,altu++);
        if(nivel!=0)
            return nivel;

        nivel = retornarAlturaNodo(actual.right,x,altu++);
        if(nivel!=0)
            return nivel;

        return 1;
    }
    
	public String toString()
	{
		inOrden(this.root);
		return "";
	}
	
	public void inOrden()
	{
		if (this.isEmpty())
			System.out.println("Arbol esta vacio...");
		
		else
			inOrden(this.root);
		
		System.out.println("");
	}

	protected void inOrden(Node actual)
	{
		if (actual.left != null)
			inOrden(actual.left);
		
		System.out.print(actual.data.toString()+", ");	
		
		if(actual.right != null)
			inOrden(actual.right);
	}
}