package structures;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
import java.util.StringTokenizer;
import java.lang.Math.*;

public class HashC<E extends Comparable<E>>
{
	protected class Element
	{
		int mark;
		Register<E> reg;
		
		public Element(int mark, Register<E> reg)
		{
			this.mark = mark;
			this.reg = reg;
		}
	}
	
	TDAList <E> pos0 = new ListLinked<E>();
	TDAList <E> pos1 = new ListLinked<E>();
	TDAList <E> pos2 = new ListLinked<E>();
	TDAList <E> pos3 = new ListLinked<E>();
	TDAList <E> pos4 = new ListLinked<E>();
	
	protected ArrayList<Element> table;
	protected int m;
	
	public HashC(int n)
	{
		this.m = n;     //Calcula el primero cercano a n y lo asigna a m
		this.table = new ArrayList<Element>(m);
		
		for(int i=0 ; i<m ; i++)
			this.table.add(new Element(0,null));
	}

	private int functionHash(int key)
	{
		return key % m;
	}

	private int linearProbing(int dressHash, int key)
	{
		int posInit = dressHash;
		
		do
		{
			if(table.get(dressHash).mark == 0)
				return -3;    //Se encuentra posicion vacia
			
			if(table.get(dressHash).mark == 1 && table.get(dressHash).reg.getKey() == key)
				return -2;
			
			dressHash = (dressHash + 1) % m;
		}
		while (dressHash != posInit);
		
		return -1;
	}
	
	public void insertListLinked(int key, E reg)
	{		
		int dressHash = functionHash(key);
		dressHash = linearProbing(dressHash, key);
		
		if(dressHash == -1)
		{
			System.err.println("Key table hash is full... ");
			return;
		}
		
		else
		{
			dressHash = functionHash(key);
			Element aux = new Element(1, new Register<E>(key, reg));
			table.set(dressHash, aux);
			
			E elem = (E) aux.reg.toString();
			
			switch(dressHash)
			{
				case 0:
				{
					pos0.insertLast(elem);
					break;
				}
					
				case 1:
				{
					pos1.insertLast(elem);
					break;
				}
					
				case 2:
				{
					pos2.insertLast(elem);
					break;
				}
					
				case 3:
				{
					pos3.insertLast(elem);
					break;
				}
					
				case 4:
				{
					pos4.insertLast(elem);
					break;
				}
			}
		}
	}
	
	public E searchListLinked(int key, E reg)
	{
		int dressHash = functionHash(key);
		
		Element aux = new Element(1, new Register<E>(key, reg));
		E elem = (E) aux.reg.toString();

		int busqueda = 0;
		
		switch(dressHash)
		{
			case 0:
			{
				busqueda = pos0.search(elem);
				break;
			}
				
			case 1:
			{
				busqueda = pos1.search(elem);
				break;
			}
				
			case 2:
			{
				busqueda = pos2.search(elem);
				break;
			}
				
			case 3:
			{
				busqueda = pos3.search(elem);
				break;
			}
				
			case 4:
			{
				busqueda = pos4.search(elem);
				break;
			}
		}
		
		if(busqueda != -1)
		{
			System.out.println("Key has been found... ");
			return elem;
		}
		else
		{
			System.err.println("Key has not been found... ");
		}
		
		return null;
	}
	
	public E removeListLinked(int key, E reg)
	{
		int dressHash = functionHash(key);
		
		Element aux = new Element(1, new Register<E>(key, reg));
		E elem = (E) aux.reg.toString();
        
        switch(dressHash)
		{
			case 0:
			{
				pos0.remove(elem);
				return elem;
			}
				
			case 1:
			{
				pos1.remove(elem);
				return elem;
			}
				
			case 2:
			{
				pos2.remove(elem);
				return elem;
			}
				
			case 3:
			{
				pos3.remove(elem);
				return elem;
			}
				
			case 4:
			{
				pos4.remove(elem);
				return elem;
			}
		}
        
        return null;
    }
	
	public String toString()
	{
		String s = "D.Real\tD.Hash\tRegister\n";
		
		int i = 0;
		for (Element item : table)
		{
			s += (i) + " -->\t";
			
			if(item.mark == 1)
			{				
				switch(i)
				{
					case 0:
					{
						s += functionHash(item.reg.getKey()) + "\t" + pos0 + "\n";
						break;
					}
						
					case 1:
					{
						s += functionHash(item.reg.getKey()) + "\t" + pos1 + "\n";
						break;
					}
						
					case 2:
					{
						s += functionHash(item.reg.getKey()) + "\t" + pos2 + "\n";
						break;
					}
						
					case 3:
					{
						s += functionHash(item.reg.getKey()) + "\t" + pos3 + "\n";
						break;
					}
						
					case 4:
					{
						s += functionHash(item.reg.getKey()) + "\t" + pos4 + "\n";
						break;
					}
				}
				i++;
			}
			
			else
				s += "empty\n";
		}
		
		return s;
	}
}
