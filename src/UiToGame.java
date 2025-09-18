import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * Small bridge to safely run tasks on the game thread.
 * Call UiToGame.drain() from the game loop once per tick at a safe point.
 */
public final class UiToGame {
    private static final ConcurrentLinkedQueue<Runnable> QUEUE = new ConcurrentLinkedQueue<>();

    private UiToGame() {}

    /** Post a task to be executed on the game thread. */
    public static void post(Runnable task) {
        if (task != null) {
            QUEUE.add(task);
        }
    }

    /** Run all queued tasks; MUST be called from the game thread. */
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
