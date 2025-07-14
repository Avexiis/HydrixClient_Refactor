
public class BuildInstance {

	public static Build build;

	public BuildInstance(String string) {
		if ("LIVE".equals(string)) {
			build = Build.Live;
		} else if ("BETA".equals(string)) {
			build = Build.Beta;
		} else if ("LOCAL".equals(string)) {
			build = Build.Local;
		} else {
			build = Build.Live;
		}
	}

	public Build getBuild() {
		return build;

	}

}
