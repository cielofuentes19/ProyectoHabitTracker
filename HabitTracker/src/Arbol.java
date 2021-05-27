
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
			throw new ItemNoFound("El contador de tiempo: "+ x + " no se encuentra...");
		
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
			throw new ItemNoFound("El contador de tiempo: "+ x + " no se encuentra...");
		
		else
		{
			int resC = actual.data.compareTo(x);
			
			if(resC < 0)
				res.right = removeRec(x, actual.right);
			
			else if (resC > 0)
				res.left = removeRec(x, actual.left);
			
			//Encontramos el nodo a eliminar
			else
			{
				//Caso 3
				if (actual.left != null && actual.right != null)
					System.out.println("Caso 3");
				
				//Caso 1 y Caso 2
				else
				{
					res = (actual.left != null) ?  actual.left : actual.right;	
				}
			}	
		}
		return res;
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