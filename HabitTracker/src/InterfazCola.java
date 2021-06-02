
public interface InterfazCola
{
	void enQueue(String x);
	String deQueue() throws ExceptionIsEmpty;
	Node front() throws ExceptionIsEmpty;
	Node back() throws ExceptionIsEmpty;
	boolean search(String x) throws ItemNoFound;
	void deleteQueue();
	boolean isEmpty();
}
