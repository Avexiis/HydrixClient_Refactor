
public class Zoom {

	private static final int MIN_ZOOM = 45;
	private static final int MAX_ZOOM = 738;

	public static void zoom(int amount) {
		//System.out.println("Zoom: " + amount);
		int zoom = GameClient.aShort8929;
		int step = 5;
		if (zoom >= 400) {
			step += zoom / 50;
		}
		zoom -= amount * step;
		if (zoom < MIN_ZOOM) {
			zoom = MIN_ZOOM;
		} else if (zoom > MAX_ZOOM) {
			zoom = MAX_ZOOM;
		}
		GameClient.aShort8929 = (short) zoom;
	}
}
