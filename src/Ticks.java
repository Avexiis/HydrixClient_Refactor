



import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Karimshan Nawaz
 *
 */
public class Ticks {

	/**
	 * @param task
	 */
	private static ScheduledExecutorService tasks;

	/**
	 * Registers an event.
	 *
	 * @param event
	 */
	public static void add(final Tick task) {
		submit(task, task.getDelay());
	}

	/**
	 * Loads the ticks
	 */
	public static void load() {
		if (tasks != null)
			tasks.shutdownNow();
		tasks = Executors.newScheduledThreadPool(1);
	}

	/**
	 *
	 * @param runnable
	 * @param delay
	 * @param unit
	 */
	public static void scheduleTask(final Runnable runnable, long delay, TimeUnit unit) {
		tasks.schedule(new Runnable() {
			@Override
			public void run() {
				try {
					runnable.run();
				} catch (Exception e) {
				} catch (Throwable t) {
				}
			}
		}, delay, unit);
	}

	/**
	 *
	 * @param task
	 */
	public static void submit(final Runnable task) {
		tasks.submit(new Runnable() {
			@Override
			public void run() {
				try {
					task.run();
				} catch (Exception e) {
				} catch (Throwable t) {
				}
			}
		});
	}

	/**
	 * Registers an event.
	 *
	 * @param event
	 */
	public static void submit(final Tick tick, final double delay) {
		scheduleTask(new Runnable() {
			@Override
			public void run() {
				if (!tick.isStopped())
					tick.executeTask();
				else
					return;
				if (!tick.isStopped())
					submit(tick, tick.getDelay());
			}
		}, (long) (delay * 1000), TimeUnit.MILLISECONDS);
	}

}
