
public interface InterfazCola
{
	void enQueue(String x);
	String deQueue() throws ExceptionIsEmpty;
	String front() throws ExceptionIsEmpty;
	String back() throws ExceptionIsEmpty;
	String search() throws ExceptionIsEmpty;
	void deleteQueue();
	boolean isEmpty();
}
