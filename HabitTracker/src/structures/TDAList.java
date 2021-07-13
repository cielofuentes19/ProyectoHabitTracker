package structures;

public interface TDAList<E>
{
	boolean isEmptyList();
	int length();
	void destroyList();
	int search(E x);
	void insertFirst(E x);
	void insertLast(E x);
	void remove(E x);	
}