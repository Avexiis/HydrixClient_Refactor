/**
 * Custom type to identify GameClient build across the project.
 * @author Kryeus
 */
public enum Build {

	/* Revision, Subrevision, Port, Lobby IP, Game IP */
	Live(718, 934834238, 43595, "123.45.67.890", "123.45.67.890"),
	Beta(718, 934834238, 43595, "127.0.0.1", "127.0.0.1"),
	Local(718, 934834238, 43595, "127.0.0.1", "127.0.0.1");
	
	
	public int Revision;
	public int SubRevision;
	public int Port;
	public String LobbyIP;
	public String GameIP;
	
	
	Build(int rev, int subrev, int port, String lobbyip, String gameip)
	{
		Revision = rev;
		SubRevision = subrev;
		Port = port;
		LobbyIP = lobbyip;
		GameIP = gameip;
	}
	
}
