package structures;
import exceptions.ExceptionIsEmpty;
import exceptions.ItemNoFound;

public interface InterfazCola<C>
{
	void enQueue(C x);
	void deQueue(C x) throws ExceptionIsEmpty,ItemNoFound;
	Node<C> front() throws ExceptionIsEmpty;
	Node<C> back() throws ExceptionIsEmpty;
	boolean search(C x) throws ItemNoFound;
	void deleteQueue();
	boolean isEmpty();
}
