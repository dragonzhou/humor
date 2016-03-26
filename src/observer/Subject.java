package observer;

/**
 * @author BA03020674
 * @version 1.0
 * @created 26-Ê®¶şÔÂ-2014 17:48:41
 */
public interface Subject {

	/**
	 * 
	 * @param observer
	 */
	public void attach(Observer observer);

	/**
	 * 
	 * @param observer
	 */
	public void dettach(Observer observer);

	public void notifys();

}