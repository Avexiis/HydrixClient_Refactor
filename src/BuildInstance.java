
public class BuildInstance {
	public static Build BUILD;

	public BuildInstance(String string) {
		if ("LIVE".equals(string)) {
			BUILD = Build.LIVE;
		} else if ("BETA".equals(string)) {
			BUILD = Build.BETA;
		} else if ("LOCAL".equals(string)) {
			BUILD = Build.LOCAL;
		} else {
			BUILD = Build.LIVE;
		}
	}

	public Build getBuild() {
		return BUILD;
	}
}
