/* WorldMapTile - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class WorldMapTile {
	int[] models;
	byte[] rotations;
	int underlay;
	byte overlay;
	byte x;
	byte y;
	byte overlayShape;

	WorldMapTile(int x, int y, int underlay, int overlay, int overlayShape, int[] models, byte[] rotations) {
		((WorldMapTile) this).x = (byte) x;
		((WorldMapTile) this).y = (byte) y;
		((WorldMapTile) this).underlay = underlay;
		((WorldMapTile) this).overlay = (byte) overlay;
		((WorldMapTile) this).overlayShape = (byte) overlayShape;
		((WorldMapTile) this).models = models;
		((WorldMapTile) this).rotations = rotations;
	}
}
