
public interface OSRSData {
	int SEQUENCES_OFFSET = 30000;
	int FRAMES_OFFSET = 8000;
	int BASES_OFFSET = 8000;
	int MODELS_OFFSET = 200000;
	int NPCS_OFFSET = 31000;
	int BAS_OFFSET = 4000;
	int UNDERLAYS_OFFSET = 256;
	int OVERLAYS_OFFSET = 256;
	int LOCS_OFFSET = 200000;
	int MAGIC_CODE = 'O' << 24 | 'S' << 16 | 'R' << 8 | 'S' << 0;
	boolean HD_FLOORS = true;
	// currently there could be unfitting overlays and underlays.

}

