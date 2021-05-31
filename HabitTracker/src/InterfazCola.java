
public interface InterfazCola
{
	void enQueue(String x);
	String deQueue() throws ExceptionIsEmpty;
	Node front() throws ExceptionIsEmpty;
	Node back() throws ExceptionIsEmpty;
	String search() throws ExceptionIsEmpty;
	void deleteQueue();
	boolean isEmpty();
}
