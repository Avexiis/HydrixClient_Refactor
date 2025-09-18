/* Region - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Region {
	public int regionBaseX;
	public int regionBaseY;
	int regionX;
	int regionY;
	public int[][] masks;

	public void reset(int i) {
		try {
			for (int x = 0; x < regionX * 843157589; x++) {
				for (int y = 0; y < -16196483 * regionY; y++) {
					if (x == 0 || y == 0 || x >= regionX * 843157589 - 5 || y >= -16196483 * regionY - 5)
						masks[x][y] = -1;
					else
						masks[x][y] = 2097152;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "Region.reset()");
		}
	}

	public void addWall(int x, int y, int type, int rotation, boolean solid, boolean unknown) {
		try {
			x -= 1487776559 * regionBaseX;
			y -= regionBaseY * 1415525851;
			if (type == 0) {
				if (rotation == 0) {
					addMask(x, y, 128);
					addMask(x - 1, y, 8);
				} if (1 == rotation) {
					addMask(x, y, 2);
					addMask(x, y + 1, 32);
				} if (2 == rotation) {
					addMask(x, y, 8);
					addMask(x + 1, y, 128);
				} if (rotation == 3) {
					addMask(x, y, 32);
					addMask(x, y - 1, 2);
				}
			} if (type == 1 || 3 == type) {
				if (0 == rotation) {
					addMask(x, y, 1);
					addMask(x - 1, 1 + y, 16);
				} if (rotation == 1) {
					addMask(x, y, 4);
					addMask(1 + x, 1 + y, 64);
				} if (rotation == 2) {
					addMask(x, y, 16);
					addMask(1 + x, y - 1, 1);
				} if (rotation == 3) {
					addMask(x, y, 64);
					addMask(x - 1, y - 1, 4);
				}
			} if (2 == type) {
				if (0 == rotation) {
					addMask(x, y, 130);
					addMask(x - 1, y, 8);
					addMask(x, y + 1, 32);
				} if (1 == rotation) {
					addMask(x, y, 10);
					addMask(x, y + 1, 32);
					addMask(1 + x, y, 128);
				} if (2 == rotation) {
					addMask(x, y, 40);
					addMask(x + 1, y, 128);
					addMask(x, y - 1, 2);
				} if (rotation == 3) {
					addMask(x, y, 160);
					addMask(x, y - 1, 2);
					addMask(x - 1, y, 8);
				}
			} if (solid) {
				if (type == 0) {
					if (rotation == 0) {
						addMask(x, y, 65536);
						addMask(x - 1, y, 4096);
					} if (1 == rotation) {
						addMask(x, y, 1024);
						addMask(x, y + 1, 16384);
					} if (2 == rotation) {
						addMask(x, y, 4096);
						addMask(x + 1, y, 65536);
					} if (rotation == 3) {
						addMask(x, y, 16384);
						addMask(x, y - 1, 1024);
					}
				} if (type == 1 || type == 3) {
					if (0 == rotation) {
						addMask(x, y, 512);
						addMask(x - 1, 1 + y, 8192);
					} if (1 == rotation) {
						addMask(x, y, 2048);
						addMask(x + 1, y + 1, 32768);
					} if (2 == rotation) {
						addMask(x, y, 8192);
						addMask(x + 1, y - 1, 512);
					} if (3 == rotation) {
						addMask(x, y, 32768);
						addMask(x - 1, y - 1, 2048);
					}
				} if (type == 2) {
					if (0 == rotation) {
						addMask(x, y, 66560);
						addMask(x - 1, y, 4096);
						addMask(x, 1 + y, 16384);
					} if (rotation == 1) {
						addMask(x, y, 5120);
						addMask(x, y + 1, 16384);
						addMask(x + 1, y, 65536);
					} if (rotation == 2) {
						addMask(x, y, 20480);
						addMask(1 + x, y, 65536);
						addMask(x, y - 1, 1024);
					} if (rotation == 3) {
						addMask(x, y, 81920);
						addMask(x, y - 1, 1024);
						addMask(x - 1, y, 4096);
					}
				}
			} if (unknown) {
				if (0 == type) {
					if (rotation == 0) {
						addMask(x, y, 536870912);
						addMask(x - 1, y, 33554432);
					} if (rotation == 1) {
						addMask(x, y, 8388608);
						addMask(x, y + 1, 134217728);
					} if (2 == rotation) {
						addMask(x, y, 33554432);
						addMask(1 + x, y, 536870912);
					} if (3 == rotation) {
						addMask(x, y, 134217728);
						addMask(x, y - 1, 8388608);
					}
				} if (type == 1 || type == 3) {
					if (rotation == 0) {
						addMask(x, y, 4194304);
						addMask(x - 1, y + 1, 67108864);
					} if (rotation == 1) {
						addMask(x, y, 16777216);
						addMask(1 + x, y + 1, 268435456);
					} if (2 == rotation) {
						addMask(x, y, 67108864);
						addMask(x + 1, y - 1, 4194304);
					} if (3 == rotation) {
						addMask(x, y, 268435456);
						addMask(x - 1, y - 1, 16777216);
					}
				} if (2 == type) {
					if (rotation == 0) {
						addMask(x, y, 545259520);
						addMask(x - 1, y, 33554432);
						addMask(x, 1 + y, 134217728);
					} if (rotation == 1) {
						addMask(x, y, 41943040);
						addMask(x, 1 + y, 134217728);
						addMask(1 + x, y, 536870912);
					} if (rotation == 2) {
						addMask(x, y, 167772160);
						addMask(x + 1, y, 536870912);
						addMask(x, y - 1, 8388608);
					} if (rotation == 3) {
						addMask(x, y, 671088640);
						addMask(x, y - 1, 8388608);
						addMask(x - 1, y, 33554432);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "Region.addWall()");
		}
	}

	public void addClip(int x, int y) {
		try {
			x -= 1487776559 * regionBaseX;
			y -= 1415525851 * regionBaseY;
			masks[x][y] |= 0x200000;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "Region.addClip()");
		}
	}

	public void addFloor(int x, int y) {
		try {
			x -= regionBaseX * 1487776559;
			y -= regionBaseY * 1415525851;
			masks[x][y] |= 0x40000;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "Region.addFloor()");
		}
	}

	void addMask(int x, int y, int mask) {
		try {
			masks[x][y] |= mask;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "Region.addMask()");
		}
	}

	public void removeObject(int x, int y, int sizeX, int sizeY, int rotation, boolean projectileClipped, boolean solid) {
		try {
			int mask = 256;
			if (projectileClipped)
				mask |= 0x20000;
			if (solid)
				mask |= 0x40000000;
			x -= regionBaseX * 1487776559;
			y -= regionBaseY * 1415525851;
			if (1 == rotation || 3 == rotation) {
				int rotatedSize = sizeX;
				sizeX = sizeY;
				sizeY = rotatedSize;
			}
			for (int tileX = x; tileX < x + sizeX; tileX++) {
				if (tileX >= 0 && tileX < 843157589 * regionX) {
					for (int tileY = y; tileY < y + sizeY; tileY++) {
						if (tileY >= 0 && tileY < regionY * -16196483)
							removeMask(tileX, tileY, mask);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "Region.removeObject()");
		}
	}

	void removeMask(int x, int y, int mask) {
		try {
			masks[x][y] &= mask ^ 0xffffffff;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "Region.removeMask()");
		}
	}

	public void removeFloor(int x, int y) {
		try {
			x -= regionBaseX * 1487776559;
			y -= 1415525851 * regionBaseY;
			masks[x][y] &= ~0x40000;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "Region.removeFloor()");
		}
	}

	public boolean canReachArea(int sourceX, int sourceY, int sourceSize, int destX, int destY, int destW, int destH, int destApproachMask) {
		try {
			if (sourceSize > 1) {
				if (Class287.method2720(sourceX, sourceY, sourceSize, sourceSize, destX, destY, destW, destH, -173263894))
					return true;
				return canReachNextArea(sourceX, sourceY, sourceSize, sourceSize, destX, destY, destW, destH, destApproachMask);
			}
			int destMaxX = destW + destX - 1;
			int destMaxY = destH + destY - 1;
			if (sourceX >= destX
					&& sourceX <= destMaxX
					&& sourceY >= destY
					&& sourceY <= destMaxY
			)
				return true;
			if (sourceX == destX - 1
					&& sourceY >= destY
					&& sourceY <= destMaxY
					&& 0 == ((masks[sourceX - 1487776559 * regionBaseX][sourceY - 1415525851 * regionBaseY]) & 0x8)
					&& (destApproachMask & 0x8) == 0
			)
				return true;
			if (1 + destMaxX == sourceX
					&& sourceY >= destY
					&& sourceY <= destMaxY
					&& ((masks[sourceX - regionBaseX * 1487776559][sourceY - regionBaseY * 1415525851]) & 0x80) == 0
					&& (destApproachMask & 0x2) == 0
			)
				return true;
			if (destY - 1 == sourceY
					&& sourceX >= destX
					&& sourceX <= destMaxX
					&& ((masks[sourceX - regionBaseX * 1487776559][sourceY - 1415525851 * regionBaseY]) & 0x2) == 0
					&& 0 == (destApproachMask & 0x4)
			)
				return true;
			if (sourceY == destMaxY + 1
					&& sourceX >= destX
					&& sourceX <= destMaxX
					&& 0 == ((masks[sourceX - regionBaseX * 1487776559][sourceY - 1415525851 * regionBaseY]) & 0x20)
					&& (destApproachMask & 0x1) == 0
			)
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "Region.canReachArea()");
		}
	}

	public boolean canReachNextArea(int sourceX, int sourceY, int sourceW, int sourceH, int destX, int destY, int destW, int destH, int destApproachMask) {
		try {
			int sourceMaxX = sourceX + sourceW;
			int sourceMaxY = sourceH + sourceY;
			int destMaxX = destX + destW;
			int destMaxY = destY + destH;
			if (destMaxX == sourceX && 0 == (destApproachMask & 0x2)) {
				int overlapYStart = sourceY > destY ? sourceY : destY;
				for (int overlapYEnd = sourceMaxY < destMaxY ? sourceMaxY : destMaxY; overlapYStart < overlapYEnd; overlapYStart++) {
					if (((masks[destMaxX - 1 - 1487776559 * regionBaseX][overlapYStart - regionBaseY * 1415525851]) & 0x8) == 0)
						return true;
				}
			} else if (destX == sourceMaxX && 0 == (destApproachMask & 0x8)) {
				int overlapYStart = sourceY > destY ? sourceY : destY;
				for (int overlapYEnd = sourceMaxY < destMaxY ? sourceMaxY : destMaxY; overlapYStart < overlapYEnd; overlapYStart++) {
					if (0 == ((masks[destX - 1487776559 * regionBaseX][overlapYStart - regionBaseY * 1415525851]) & 0x80))
						return true;
				}
			} else if (destMaxY == sourceY && (destApproachMask & 0x1) == 0) {
				int overlapXStart = sourceX > destX ? sourceX : destX;
				for (int overlapXEnd = sourceMaxX < destMaxX ? sourceMaxX : destMaxX; overlapXStart < overlapXEnd; overlapXStart++) {
					if (((masks[overlapXStart - 1487776559 * regionBaseX][destMaxY - 1 - 1415525851 * regionBaseY]) & 0x2) == 0)
						return true;
				}
			} else if (destY == sourceMaxY && (destApproachMask & 0x4) == 0) {
				int overlapXStart = sourceX > destX ? sourceX : destX;
				for (int overlapXEnd = sourceMaxX < destMaxX ? sourceMaxX : destMaxX; overlapXStart < overlapXEnd; overlapXStart++) {
					if (((masks[overlapXStart - 1487776559 * regionBaseX][destY - regionBaseY * 1415525851]) & 0x20) == 0)
						return true;
				}
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "Region.canReachNextArea()");
		}
	}

	public void addObject(int x, int y, int sizeX, int sizeY, boolean solid, boolean unknown) {
		try {
			int mask = 256;
			if (solid)
				mask |= 0x20000;
			if (unknown)
				mask |= 0x40000000;
			x -= regionBaseX * 1487776559;
			y -= 1415525851 * regionBaseY;
			for (int tileX = x; tileX < sizeX + x; tileX++) {
				if (tileX >= 0 && tileX < 843157589 * regionX) {
					for (int tileY = y; tileY < sizeY + y; tileY++) {
						if (tileY >= 0 && tileY < -16196483 * regionY)
							addMask(tileX, tileY, mask);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "Region.addObject()");
		}
	}

	public boolean canReachLoc(int sourceX, int sourceY, int sourceSize, int locX, int locY, int locType, int locOrient) {
		try {
			if (1 == sourceSize) {
				if (locX == sourceX && locY == sourceY)
					return true;
			} else if (locX >= sourceX && locX <= sourceSize + sourceX - 1 && locY >= locY && locY <= locY + sourceSize - 1)
				return true;
			sourceX -= 1487776559 * regionBaseX;
			sourceY -= regionBaseY * 1415525851;
			locX -= regionBaseX * 1487776559;
			locY -= regionBaseY * 1415525851;
			if (1 == sourceSize) {
				if (locType == 0) {
					if (0 == locOrient) {
						if (sourceX == locX - 1 && locY == sourceY) return true;
						if (sourceX == locX && 1 + locY == sourceY && (masks[sourceX][sourceY] & 0x2c0120) == 0) return true;
						if (sourceX == locX && sourceY == locY - 1 && (masks[sourceX][sourceY] & 0x2c0102) == 0) return true;
					} else if (1 == locOrient) {
						if (locX == sourceX && sourceY == 1 + locY) return true;
						if (locX - 1 == sourceX && sourceY == locY && 0 == (masks[sourceX][sourceY] & 0x2c0108)) return true;
						if (1 + locX == sourceX && locY == sourceY && (masks[sourceX][sourceY] & 0x2c0180) == 0) return true;
					} else if (2 == locOrient) {
						if (1 + locX == sourceX && locY == sourceY) return true;
						if (sourceX == locX && sourceY == 1 + locY && 0 == (masks[sourceX][sourceY] & 0x2c0120)) return true;
						if (sourceX == locX && sourceY == locY - 1 && (masks[sourceX][sourceY] & 0x2c0102) == 0) return true;
					} else if (locOrient == 3) {
						if (sourceX == locX && locY - 1 == sourceY) return true;
						if (locX - 1 == sourceX && sourceY == locY && 0 == (masks[sourceX][sourceY] & 0x2c0108)) return true;
						if (sourceX == 1 + locX && locY == sourceY && 0 == (masks[sourceX][sourceY] & 0x2c0180)) return true;
					}
				}
				if (locType == 2) {
					if (0 == locOrient) {
						if (locX - 1 == sourceX && sourceY == locY) return true;
						if (sourceX == locX && 1 + locY == sourceY) return true;
						if (sourceX == locX + 1 && locY == sourceY && 0 == (masks[sourceX][sourceY] & 0x2c0180)) return true;
						if (sourceX == locX && locY - 1 == sourceY && (masks[sourceX][sourceY] & 0x2c0102) == 0) return true;
					} else if (locOrient == 1) {
						if (locX - 1 == sourceX && locY == sourceY && (masks[sourceX][sourceY] & 0x2c0108) == 0) return true;
						if (sourceX == locX && 1 + locY == sourceY) return true;
						if (sourceX == 1 + locX && sourceY == locY) return true;
						if (sourceX == locX && locY - 1 == sourceY && (masks[sourceX][sourceY] & 0x2c0102) == 0) return true;
					} else if (2 == locOrient) {
						if (locX - 1 == sourceX && sourceY == locY && 0 == (masks[sourceX][sourceY] & 0x2c0108)) return true;
						if (sourceX == locX && sourceY == 1 + locY && (masks[sourceX][sourceY] & 0x2c0120) == 0) return true;
						if (sourceX == locX + 1 && locY == sourceY) return true;
						if (sourceX == locX && sourceY == locY - 1) return true;
					} else if (3 == locOrient) {
						if (locX - 1 == sourceX && sourceY == locY) return true;
						if (sourceX == locX && locY + 1 == sourceY && (masks[sourceX][sourceY] & 0x2c0120) == 0) return true;
						if (1 + locX == sourceX && locY == sourceY && 0 == (masks[sourceX][sourceY] & 0x2c0180)) return true;
						if (sourceX == locX && locY - 1 == sourceY) return true;
					}
				}
				if (9 == locType) {
					if (locX == sourceX && 1 + locY == sourceY && 0 == (masks[sourceX][sourceY] & 0x20)) return true;
					if (sourceX == locX && sourceY == locY - 1 && (masks[sourceX][sourceY] & 0x2) == 0) return true;
					if (locX - 1 == sourceX && locY == sourceY && (masks[sourceX][sourceY] & 0x8) == 0) return true;
					return sourceX == 1 + locX && locY == sourceY && (masks[sourceX][sourceY] & 0x80) == 0;
				}
			} else {
				int sourceMaxX = sourceSize + sourceX - 1;
				int sourceMaxY = sourceSize + sourceY - 1;
				if (0 == locType) {
					if (locOrient == 0) {
						if (locX - sourceSize == sourceX && locY >= sourceY && locY <= sourceMaxY) return true;
						if (locX >= sourceX && locX <= sourceMaxX && sourceY == locY + 1 && 0 == (masks[locX][sourceY] & 0x2c0120)) return true;
						if (locX >= sourceX && locX <= sourceMaxX && sourceY == locY - sourceSize && 0 == (masks[locX][sourceMaxY] & 0x2c0102)) return true;
					} else if (locOrient == 1) {
						if (locX >= sourceX && locX <= sourceMaxX && sourceY == 1 + locY) return true;
						if (locX - sourceSize == sourceX && locY >= sourceY && locY <= sourceMaxY && ((masks[sourceMaxX][locY] & 0x2c0108) == 0)) return true;
						if (locX + 1 == sourceX && locY >= sourceY && locY <= sourceMaxY && (masks[sourceX][locY] & 0x2c0180) == 0) return true;
					} else if (locOrient == 2) {
						if (sourceX == 1 + locX && locY >= sourceY && locY <= sourceMaxY) return true;
						if (locX >= sourceX && locX <= sourceMaxX && locY + 1 == sourceY && ((masks[locX][sourceY] & 0x2c0120) == 0)) return true;
						if (locX >= sourceX && locX <= sourceMaxX && locY - sourceSize == sourceY && 0 == (masks[locX][sourceMaxY] & 0x2c0102)) return true;
					} else if (3 == locOrient) {
						if (locX >= sourceX && locX <= sourceMaxX && locY - sourceSize == sourceY) return true;
						if (locX - sourceSize == sourceX && locY >= sourceY && locY <= sourceMaxY && ((masks[sourceMaxX][locY] & 0x2c0108) == 0)) return true;
						if (sourceX == locX + 1 && locY >= sourceY && locY <= sourceMaxY && 0 == (masks[sourceX][locY] & 0x2c0180)) return true;
					}
				}
				if (2 == locType) {
					if (0 == locOrient) {
						if (sourceX == locX - sourceSize && locY >= sourceY && locY <= sourceMaxY) return true;
						if (locX >= sourceX && locX <= sourceMaxX && sourceY == 1 + locY) return true;
						if (locX + 1 == sourceX && locY >= sourceY && locY <= sourceMaxY && 0 == (masks[sourceX][locY] & 0x2c0180)) return true;
						if (locX >= sourceX && locX <= sourceMaxX && sourceY == locY - sourceSize && 0 == (masks[locX][sourceMaxY] & 0x2c0102)) return true;
					} else if (locOrient == 1) {
						if (sourceX == locX - sourceSize && locY >= sourceY && locY <= sourceMaxY && 0 == (masks[sourceMaxX][locY] & 0x2c0108)) return true;
						if (locX >= sourceX && locX <= sourceMaxX && 1 + locY == sourceY) return true;
						if (sourceX == 1 + locX && locY >= sourceY && locY <= sourceMaxY) return true;
						if (locX >= sourceX && locX <= sourceMaxX && sourceY == locY - sourceSize && ((masks[locX][sourceMaxY] & 0x2c0102) == 0)) return true;
					} else if (locOrient == 2) {
						if (locX - sourceSize == sourceX && locY >= sourceY && locY <= sourceMaxY && 0 == (masks[sourceMaxX][locY] & 0x2c0108)) return true;
						if (locX >= sourceX && locX <= sourceMaxX && locY + 1 == sourceY && ((masks[locX][sourceY] & 0x2c0120) == 0)) return true;
						if (sourceX == locX + 1 && locY >= sourceY && locY <= sourceMaxY) return true;
						if (locX >= sourceX && locX <= sourceMaxX && locY - sourceSize == sourceY) return true;
					} else if (3 == locOrient) {
						if (sourceX == locX - sourceSize && locY >= sourceY && locY <= sourceMaxY) return true;
						if (locX >= sourceX && locX <= sourceMaxX && locY + 1 == sourceY && 0 == (masks[locX][sourceY] & 0x2c0120)) return true;
						if (1 + locX == sourceX && locY >= sourceY && locY <= sourceMaxY && (masks[sourceX][locY] & 0x2c0180) == 0) return true;
						if (locX >= sourceX && locX <= sourceMaxX && locY - sourceSize == sourceY) return true;
					}
				}
				if (9 == locType) {
					if (locX >= sourceX && locX <= sourceMaxX && locY + 1 == sourceY && 0 == (masks[locX][sourceY] & 0x2c0120)) return true;
					if (locX >= sourceX && locX <= sourceMaxX && sourceY == locY - sourceSize && 0 == (masks[locX][sourceMaxY] & 0x2c0102)) return true;
					if (locX - sourceSize == sourceX && locY >= sourceY && locY <= sourceMaxY && 0 == (masks[sourceMaxX][locY] & 0x2c0108)) return true;
					return 1 + locX == sourceX && locY >= sourceY && locY <= sourceMaxY && (masks[sourceX][locY] & 0x2c0180) == 0;
				}
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "Region.canReachLoc()");
		}
	}

	public void removeWall(int x, int y, int type, int rotation, boolean projectileClipped, boolean isSolid) {
		try {
			x -= 1487776559 * regionBaseX;
			y -= regionBaseY * 1415525851;
			if (0 == type) {
				if (rotation == 0) {
					removeMask(x, y, 128);
					removeMask(x - 1, y, 8);
				}
				if (rotation == 1) {
					removeMask(x, y, 2);
					removeMask(x, y + 1, 32);
				}
				if (rotation == 2) {
					removeMask(x, y, 8);
					removeMask(x + 1, y, 128);
				}
				if (rotation == 3) {
					removeMask(x, y, 32);
					removeMask(x, y - 1, 2);
				}
			}
			if (type == 1 || 3 == type) {
				if (rotation == 0) {
					removeMask(x, y, 1);
					removeMask(x - 1, y + 1, 16);
				}
				if (rotation == 1) {
					removeMask(x, y, 4);
					removeMask(1 + x, y + 1, 64);
				}
				if (rotation == 2) {
					removeMask(x, y, 16);
					removeMask(1 + x, y - 1, 1);
				}
				if (rotation == 3) {
					removeMask(x, y, 64);
					removeMask(x - 1, y - 1, 4);
				}
			}
			if (type == 2) {
				if (0 == rotation) {
					removeMask(x, y, 130);
					removeMask(x - 1, y, 8);
					removeMask(x, y + 1, 32);
				}
				if (rotation == 1) {
					removeMask(x, y, 10);
					removeMask(x, y + 1, 32);
					removeMask(x + 1, y, 128);
				}
				if (rotation == 2) {
					removeMask(x, y, 40);
					removeMask(x + 1, y, 128);
					removeMask(x, y - 1, 2);
				}
				if (rotation == 3) {
					removeMask(x, y, 160);
					removeMask(x, y - 1, 2);
					removeMask(x - 1, y, 8);
				}
			}
			if (projectileClipped) {
				if (0 == type) {
					if (0 == rotation) {
						removeMask(x, y, 65536);
						removeMask(x - 1, y, 4096);
					}
					if (1 == rotation) {
						removeMask(x, y, 1024);
						removeMask(x, 1 + y, 16384);
					}
					if (2 == rotation) {
						removeMask(x, y, 4096);
						removeMask(x + 1, y, 65536);
					}
					if (rotation == 3) {
						removeMask(x, y, 16384);
						removeMask(x, y - 1, 1024);
					}
				}
				if (1 == type || 3 == type) {
					if (rotation == 0) {
						removeMask(x, y, 512);
						removeMask(x - 1, y + 1, 8192);
					}
					if (1 == rotation) {
						removeMask(x, y, 2048);
						removeMask(x + 1, y + 1, 32768);
					}
					if (rotation == 2) {
						removeMask(x, y, 8192);
						removeMask(x + 1, y - 1, 512);
					}
					if (rotation == 3) {
						removeMask(x, y, 32768);
						removeMask(x - 1, y - 1, 2048);
					}
				}
				if (2 == type) {
					if (0 == rotation) {
						removeMask(x, y, 66560);
						removeMask(x - 1, y, 4096);
						removeMask(x, y + 1, 16384);
					}
					if (1 == rotation) {
						removeMask(x, y, 5120);
						removeMask(x, 1 + y, 16384);
						removeMask(x + 1, y, 65536);
					}
					if (rotation == 2) {
						removeMask(x, y, 20480);
						removeMask(x + 1, y, 65536);
						removeMask(x, y - 1, 1024);
					}
					if (rotation == 3) {
						removeMask(x, y, 81920);
						removeMask(x, y - 1, 1024);
						removeMask(x - 1, y, 4096);
					}
				}
			}
			if (isSolid) {
				if (0 == type) {
					if (0 == rotation) {
						removeMask(x, y, 536870912);
						removeMask(x - 1, y, 33554432);
					}
					if (1 == rotation) {
						removeMask(x, y, 8388608);
						removeMask(x, y + 1, 134217728);
					}
					if (rotation == 2) {
						removeMask(x, y, 33554432);
						removeMask(x + 1, y, 536870912);
					}
					if (rotation == 3) {
						removeMask(x, y, 134217728);
						removeMask(x, y - 1, 8388608);
					}
				}
				if (type == 1 || 3 == type) {
					if (rotation == 0) {
						removeMask(x, y, 4194304);
						removeMask(x - 1, 1 + y, 67108864);
					}
					if (rotation == 1) {
						removeMask(x, y, 16777216);
						removeMask(1 + x, y + 1, 268435456);
					}
					if (2 == rotation) {
						removeMask(x, y, 67108864);
						removeMask(x + 1, y - 1, 4194304);
					}
					if (3 == rotation) {
						removeMask(x, y, 268435456);
						removeMask(x - 1, y - 1, 16777216);
					}
				}
				if (type == 2) {
					if (0 == rotation) {
						removeMask(x, y, 545259520);
						removeMask(x - 1, y, 33554432);
						removeMask(x, 1 + y, 134217728);
					}
					if (1 == rotation) {
						removeMask(x, y, 41943040);
						removeMask(x, 1 + y, 134217728);
						removeMask(1 + x, y, 536870912);
					}
					if (rotation == 2) {
						removeMask(x, y, 167772160);
						removeMask(1 + x, y, 536870912);
						removeMask(x, y - 1, 8388608);
					}
					if (3 == rotation) {
						removeMask(x, y, 671088640);
						removeMask(x, y - 1, 8388608);
						removeMask(x - 1, y, 33554432);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "Region.removeWall()");
		}
	}

	public void removeClip(int x, int y) {
		try {
			x -= 1487776559 * regionBaseX;
			y -= 1415525851 * regionBaseY;
			masks[x][y] &= ~0x200000;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "Region.removeClip()");
		}
	}

	Region() {}

	static final void method2745(ClientScript2 class403, int i) { //my clean file is tainted by these stupid cs2 methods. sigh.
		try {
			((ClientScript2) class403).anInt5245 -= -1365138610;
			if ((((ClientScript2) class403).aLongArray5251[1685767703
					* ((ClientScript2) class403).anInt5245])
					< (((ClientScript2) class403).aLongArray5251[1685767703
					* ((ClientScript2) class403).anInt5245 + 1]))
				((ClientScript2) class403).integerPos
						+= ((((ClientScript2) class403).integerstack[1883543357
						* ((ClientScript2) class403).integerPos]) * 286750741);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "Region.CS2_Method2745()");
		}
	}

	static final void method2746(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anInt5239 -= -783761378;
			int i_84_ = (((ClientScript2) class403).anIntArray5244[681479919 * ((ClientScript2) class403).anInt5239]);
			int i_85_ = (((ClientScript2) class403).anIntArray5244[1 + ((ClientScript2) class403).anInt5239 * 681479919]);
			EnumType class483 = Class51.aClass475_506.getClientScriptMap(i_84_, 1528209569);
			if ('s' == class483.aChar6037) {
			}
			((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393 - 1)] = class483.method6122(i_85_, (byte) -30);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "Region.CS2_Method2746()");
		}
	}
}
