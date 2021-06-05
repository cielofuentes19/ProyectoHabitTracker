package structures;
import exceptions.ExceptionIsEmpty;
import exceptions.ItemNoFound;

public interface InterfazCola
{
	void enQueue(String x);
	void deQueue(String x) throws ExceptionIsEmpty,ItemNoFound;
	Node front() throws ExceptionIsEmpty;
	Node back() throws ExceptionIsEmpty;
	boolean search(String x) throws ItemNoFound;
	void deleteQueue();
	boolean isEmpty();
}
