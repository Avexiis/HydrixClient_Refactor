import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * Small bridge to safely run tasks on the game thread.
 */
public final class UiToGame {
    private static final ConcurrentLinkedQueue<Runnable> QUEUE = new ConcurrentLinkedQueue<>();
    private UiToGame() {}

    public static void post(Runnable task) {
        if (task != null) {
            QUEUE.add(task);
        }
    }

    public static void drain() {
        Runnable r;
        while ((r = QUEUE.poll()) != null) {
            try {
                r.run();
            } catch (Throwable t) {
                t.printStackTrace();
            }
        }
    }
}
