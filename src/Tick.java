



/**
 * Used for registering any game ticks.
 *
 * @author K-Shan
 *
 */
public abstract class Tick implements Runnable {

	public String tickName;

	/**
	 * How many seconds the event should wait between each cycle.
	 *
	 * @delay
	 */
	public double delay;

	/**
	 * if the task has been stopped
	 *
	 * @param stop
	 */
	public boolean isStopped;

	/**
	 * Create an event with the specified tick time.
	 *
	 * @param tick
	 */
	public Tick(double delay) {
		this.delay = delay;
	}

	public Tick(String string, double d) {
		this.tickName = string;
		this.delay = d;
	}

	/**
	 * Schedules task.
	 *
	 * @param task
	 * @param run
	 */
	public void executeTask() {
		if (isStopped())
			return;
		try {
			run();
		} catch (Throwable t) {
			t.printStackTrace();
			stop();
		}
	}

	/**
	 * Gets the current delay.
	 *
	 * @param delay
	 * @return
	 */
	public double getDelay() {
		return delay;
	}

	/**
	 * The name of the game tick
	 * 
	 * @return
	 */
	public String getName() {
		return tickName;
	}

	/**
	 * Checks if the task has stopped
	 *
	 * @param stop
	 * @return
	 */
	public boolean isStopped() {
		return isStopped;
	}

	/**
	 * Abstract void run.
	 *
	 * @param run
	 */
	@Override
	public abstract void run();

	/**
	 * Sets the Task delay
	 *
	 * @param d
	 */
	public void setDelay(double d) {
		this.delay = d;
	}

	/**
	 * Stops current Task.
	 */
	public void stop() {
		whenStopped();
		isStopped = true;
		// System.out.println("THE CURRENT GAME TICK HAS BEEN STOPPED.");
	}

	/**
	 * What to do after the game tick gets stopped.
	 * 
	 * @return
	 */
	public void whenStopped() {

	}
}