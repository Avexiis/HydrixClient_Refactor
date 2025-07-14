import java.util.TimerTask;

/**
 * Just runs the goddamn garbage collector
 * @author John J. Woloszyk
 * @date 5.31.2018
 */
public class MemoryOptimizer extends TimerTask {

	@Override
	public void run() {
		System.gc();

	}

}
