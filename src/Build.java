/**
 * Custom type to identify GameClient build across the project.
 * @author Kryeus
 */
public enum Build {
	/* Revision, Subrevision, Port, Lobby IP, Game IP */
	LIVE(718, 934834238, 2052, "your.site.com", "IP.works.too"),
	BETA(718, 934834238, 43595, "127.0.0.1", "127.0.0.1"),
	LOCAL(718, 934834238, 43595, "127.0.0.1", "127.0.0.1");
	
	public int Revision;
	public int SubRevision;
	public int Port;
	public String LobbyURL;
	public String GameURL;
	
	Build(int revision, int subrevision, int port, String lobbyURL, String gameURL) {
		Revision = revision;
		SubRevision = subrevision;
		Port = port;
		LobbyURL = lobbyURL;
		GameURL = gameURL;
	}
	
}
