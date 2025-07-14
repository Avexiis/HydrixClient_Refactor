import java.util.Arrays;

/* Model - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Model {
	public MagnetConfig[] aMagnetConfigArray613;
	public int numVertices;
	public short[] submeshes_lookup;
	public int[] verticesX;
	public short[] facesMaterial;
	public int[] verticesZ;
	public int[] verticesSkin;
	public short[] vertexDuplicates;
	public int numFaces;
	public byte[] texturesMappingType;
	public short[] texturesMappingP;
	public short[] facesC;
	public byte[] facesType;
	public int highestFaceIndex;
	public byte[] facesAlpha;
	public byte[] textureDirection;
	public short[] facesColour;
	public int version = 12;
	public int[] facesSkin;
	public byte priority;
	public byte[] facesPriority;
	public int numTextures;
	public byte[] facesTexture;
	public short[] texturesMappingM;
	public int[] textureSpeed;
	public short[] texturesMappingN;
	public int[] textureScaleX;
	public int[] textureScaleY;
	public int[] textureScaleZ;
	public int[] verticesY;
	public int[] textureTransU;
	public short[] facesA;
	public byte[] textureRotation;
	public short[] facesB;
	public Class85[] aClass85Array647;
	public int[] textureTransV;
	public VertexNormal[] aVertexNormalArray649;

	Model(byte[] data) {
		numVertices = 0;
		highestFaceIndex = 0;
		numFaces = 0;
		priority = (byte) 0;
		numTextures = 0;
		if (data[0] == 'O' && data[1] == 'S' && data[2] == 'R' && data[3] == 'S') {
			data = Arrays.copyOfRange(data, 4, data.length);
			if (data[data.length - 1] == -1 && data[data.length - 2] == -1) {
				decodeOS(data);
			} else {
				decodeOSLegacy(data);
			}
		} else {
			if (data[data.length - 1] == -1 && data[data.length - 2] == -1) {
				decodeNew(data);
			} else {
				decodeOld(data);
			}
		}
	}

	public void decodeOS(byte[] data) {
		Packet first = new Packet(data);
		Packet second = new Packet(data);
		Packet third = new Packet(data);
		Packet fourth = new Packet(data);
		Packet fifth = new Packet(data);
		Packet sixth = new Packet(data);
		Packet seventh = new Packet(data);
		first.pos = (data.length - 23) * 116413311;
		int numVertices = first.readUnsignedShort();
		int numFaces = first.readUnsignedShort();
		int numTextures = first.readUnsignedByte();
		int hasFaceTypes = first.readUnsignedByte();
		int modelPriority = first.readUnsignedByte();
		int hasFaceAlphas = first.readUnsignedByte();
		int hasFaceSkins = first.readUnsignedByte();
		int hasFaceMaterials = first.readUnsignedByte();
		int hasVertexSkins = first.readUnsignedByte();
		int vxSize = first.readUnsignedShort();
		int vySize = first.readUnsignedShort();
		int vzSize = first.readUnsignedShort();
		int fiSize = first.readUnsignedShort();
		int tiSize = first.readUnsignedShort();
		int simpleTextureFaceCount = 0;
		int complexTextureFaceCount = 0;
		int cubeTextureFaceCount = 0;
		if (numTextures > 0) {
			texturesMappingType = new byte[numTextures];
			first.pos = 0;
			for (int texture = 0; texture < numTextures; ++texture) {
				byte type = texturesMappingType[texture] = first.readByte();
				if (type == 0) {
					simpleTextureFaceCount++;
				}
				if (type >= 1 && type <= 3) {
					complexTextureFaceCount++;
				}
				if (type == 2) {
					cubeTextureFaceCount++;
				}
			}
		}

		int offset = numTextures + numVertices;
		int faceTypesOffset = offset;
		if (hasFaceTypes == 1) {
			offset += numFaces;
		}
		int faceCompressionOffset = offset;
		offset += numFaces;
		int facePrioritiesOffset = offset;
		if (modelPriority == 255) {
			offset += numFaces;
		}
		int faceSkinsOffset = offset;
		if (hasFaceSkins == 1) {
			offset += numFaces;
		}
		int vericesSkinsOffset = offset;
		if (hasVertexSkins == 1) {
			offset += numVertices;
		}
		int faceAlphasOffset = offset;
		if (hasFaceAlphas == 1) {
			offset += numFaces;
		}
		int faceIndicesOffset = offset;
		offset += fiSize;
		int faceMaterialsOffset = offset;
		if (hasFaceMaterials == 1) {
			offset += numFaces * 2;
		}
		int facePaletteTexturesOffset = offset;
		offset += tiSize;
		int faceColorsOffset = offset;
		offset += numFaces * 2;
		int verticesXOffset = offset;
		offset += vxSize;
		int verticesYOffset = offset;
		offset += vySize;
		int verticesZOffset = offset;
		offset += vzSize;
		int simpleTexturesOffset = offset;
		offset += simpleTextureFaceCount * 6;
		int complexTexturesOffset = offset;
		offset += complexTextureFaceCount * 6;
		int texturesScaleOffset = offset;
		offset += complexTextureFaceCount * 6;
		int texturesRotationOffset = offset;
		offset += complexTextureFaceCount * 2;
		int texturesDirectionOffset = offset;
		offset += complexTextureFaceCount;
		int texturesTranslationOffset = offset;
		offset += complexTextureFaceCount * 2 + cubeTextureFaceCount * 2;
		this.numVertices = numVertices;
		this.numFaces = numFaces;
		this.numTextures = numTextures;
		verticesX = new int[numVertices];
		verticesY = new int[numVertices];
		verticesZ = new int[numVertices];
		facesA = new short[numFaces];
		facesB = new short[numFaces];
		facesC = new short[numFaces];
		if (hasVertexSkins == 1) {
			verticesSkin = new int[numVertices];
		}
		if (hasFaceTypes == 1) {
			facesType = new byte[numFaces];
		}
		if (modelPriority == 255) {
			facesPriority = new byte[numFaces];
		} else {
			priority = (byte) modelPriority;
		}
		if (hasFaceAlphas == 1) {
			facesAlpha = new byte[numFaces];
		}
		if (hasFaceSkins == 1) {
			facesSkin = new int[numFaces];
		}
		if (hasFaceMaterials == 1) {
			facesMaterial = new short[numFaces];
		}
		if (hasFaceMaterials == 1 && numTextures > 0) {
			facesTexture = new byte[numFaces];
		}
		facesColour = new short[numFaces];
		if (numTextures > 0) {
			texturesMappingP = new short[numTextures];
			texturesMappingM = new short[numTextures];
			texturesMappingN = new short[numTextures];
			if (complexTextureFaceCount > 0) {
				textureScaleX = new int[complexTextureFaceCount];
				textureScaleY = new int[complexTextureFaceCount];
				textureScaleZ = new int[complexTextureFaceCount];
				textureRotation = new byte[complexTextureFaceCount];
				textureDirection = new byte[complexTextureFaceCount];
				textureSpeed = new int[complexTextureFaceCount];
			}
			if (cubeTextureFaceCount > 0) {
				textureTransU = new int[cubeTextureFaceCount];
				textureTransV = new int[cubeTextureFaceCount];
			}
		}
		first.pos = numTextures * 116413311;
		second.pos = verticesXOffset * 116413311;
		third.pos = verticesYOffset * 116413311;
		fourth.pos = verticesZOffset * 116413311;
		fifth.pos = vericesSkinsOffset * 116413311;
		int baseX = 0;
		int baseY = 0;
		int baseZ = 0;
		for (int vertex = 0; vertex < numVertices; ++vertex) {
			int flag = first.readUnsignedByte();
			int xOffset = 0;
			if ((flag & 1) != 0) {
				xOffset = second.gSmart1or2s();
			}
			int yOffset = 0;
			if ((flag & 2) != 0) {
				yOffset = third.gSmart1or2s();
			}
			int zOffset = 0;
			if ((flag & 4) != 0) {
				zOffset = fourth.gSmart1or2s();
			}
			verticesX[vertex] = baseX + xOffset;
			verticesY[vertex] = baseY + yOffset;
			verticesZ[vertex] = baseZ + zOffset;
			baseX = verticesX[vertex];
			baseY = verticesY[vertex];
			baseZ = verticesZ[vertex];
			if (hasVertexSkins == 1) {
				verticesSkin[vertex] = fifth.readUnsignedByte();
			}
		}
		first.pos = faceColorsOffset * 116413311;
		second.pos = faceTypesOffset * 116413311;
		third.pos = facePrioritiesOffset * 116413311;
		fourth.pos = faceAlphasOffset * 116413311;
		fifth.pos = faceSkinsOffset * 116413311;
		sixth.pos = faceMaterialsOffset * 116413311;
		seventh.pos = facePaletteTexturesOffset * 116413311;
		for (int face = 0; face < numFaces; ++face) {
			facesColour[face] = (short) first.readUnsignedShort();
			if (hasFaceTypes == 1) {
				facesType[face] = second.readByte();
			}
			if (modelPriority == 255) {
				facesPriority[face] = third.readByte();
			}
			if (hasFaceAlphas == 1) {
				facesAlpha[face] = fourth.readByte();
			}
			if (hasFaceSkins == 1) {
				facesSkin[face] = fifth.readUnsignedByte();
			}
			if (hasFaceMaterials == 1) {
				facesMaterial[face] = (short) (sixth.readUnsignedShort() - 1);
			}
			if (facesTexture != null && facesMaterial[face] != -1) {
				facesTexture[face] = (byte) (seventh.readUnsignedByte() - 1);
			}
		}
		first.pos = faceIndicesOffset * 116413311;
		second.pos = faceCompressionOffset * 116413311;
		highestFaceIndex = -1;
		short a = 0, b = 0, c = 0;
		int acc = 0;
		for (int face = 0; face < numFaces; face++) {
			int type = second.readUnsignedByte();
			if (type == 1) {
				a = (short) (first.gSmart1or2s() + acc);
				acc = a;
				b = (short) (first.gSmart1or2s() + acc);
				acc = b;
				c = (short) (first.gSmart1or2s() + acc);
				acc = c;
			} else if (type == 2) {
				b = c;
				c = (short) (first.gSmart1or2s() + acc);
				acc = c;
			} else if (type == 3) {
				a = c;
				c = (short) (first.gSmart1or2s() + acc);
				acc = c;
			} else if (type == 4) {
				short temp = a;
				a = b;
				b = temp;
				c = (short) (first.gSmart1or2s() + acc);
				acc = c;
			}
			facesA[face] = a;
			facesB[face] = b;
			facesC[face] = c;
			if (a > highestFaceIndex) highestFaceIndex = a;
			if (b > highestFaceIndex) highestFaceIndex = b;
			if (c > highestFaceIndex) highestFaceIndex = c;
		}
		highestFaceIndex++;
		first.pos = simpleTexturesOffset * 116413311;
		second.pos = complexTexturesOffset * 116413311;
		third.pos = texturesScaleOffset * 116413311;
		fourth.pos = texturesRotationOffset * 116413311;
		fifth.pos = texturesDirectionOffset * 116413311;
		sixth.pos = texturesTranslationOffset * 116413311;
		for (int texture = 0; texture < numTextures; ++texture) {
			int type = texturesMappingType[texture] & 0xff;
			if (type == 0) {
				texturesMappingP[texture] = (short) first.readUnsignedShort();
				texturesMappingM[texture] = (short) first.readUnsignedShort();
				texturesMappingN[texture] = (short) first.readUnsignedShort();
			} else if (type == 1) {
				texturesMappingP[texture] = (short) second.readUnsignedShort();
				texturesMappingM[texture] = (short) second.readUnsignedShort();
				texturesMappingN[texture] = (short) second.readUnsignedShort();
				textureScaleX[texture] = (short) third.readUnsignedShort();
				textureScaleY[texture] = (short) third.readUnsignedShort();
				textureScaleZ[texture] = (short) third.readUnsignedShort();
				textureRotation[texture] = (byte) fourth.readUnsignedShort();// this was cast short.
				textureDirection[texture] = fifth.readByte();
				textureSpeed[texture] = (short) sixth.readUnsignedShort();
			} else if (type == 2) {
				texturesMappingP[texture] = (short) second.readUnsignedShort();
				texturesMappingM[texture] = (short) second.readUnsignedShort();
				texturesMappingN[texture] = (short) second.readUnsignedShort();
				textureScaleX[texture] = (short) third.readUnsignedShort();
				textureScaleY[texture] = (short) third.readUnsignedShort();
				textureScaleZ[texture] = (short) third.readUnsignedShort();
				textureRotation[texture] = (byte) fourth.readUnsignedShort();// this was cast short.
				textureDirection[texture] = fifth.readByte();
				textureSpeed[texture] = (short) sixth.readUnsignedShort();
				textureTransU[texture] = (short) sixth.readUnsignedShort();
			} else if (type == 3) {
				texturesMappingP[texture] = (short) second.readUnsignedShort();
				texturesMappingM[texture] = (short) second.readUnsignedShort();
				texturesMappingN[texture] = (short) second.readUnsignedShort();
				textureScaleX[texture] = (short) third.readUnsignedShort();
				textureScaleY[texture] = (short) third.readUnsignedShort();
				textureScaleZ[texture] = (short) third.readUnsignedShort();
				textureRotation[texture] = (byte) fourth.readUnsignedShort();// this was cast short.
				textureDirection[texture] = fifth.readByte();
				textureSpeed[texture] = (short) sixth.readUnsignedShort();
			}
		}

		first.pos = offset * 116413311;
		int var55 = first.readUnsignedByte();
		if (var55 != 0) {
			first.readUnsignedShort();
			first.readUnsignedShort();
			first.readUnsignedShort();
			first.readUnsignedInt();
		}
	}

	public void decodeOSLegacy(byte[] dara) {
		boolean usesFaceTypes = false;
		boolean usesMaterials = false;
		Packet first = new Packet(dara);
		Packet second = new Packet(dara);
		Packet third = new Packet(dara);
		Packet fourth = new Packet(dara);
		Packet fifth = new Packet(dara);
		first.pos = (dara.length - 18) * 116413311;
		int numVertices = first.readUnsignedShort();
		int numFaces = first.readUnsignedShort();
		int numTextures = first.readUnsignedByte();
		int hasFaceTypes = first.readUnsignedByte();
		int modelPriority = first.readUnsignedByte();
		int hasFaceAlphas = first.readUnsignedByte();
		int hasFaceSkins = first.readUnsignedByte();
		int hasVertexSkins = first.readUnsignedByte();
		int xvSize = first.readUnsignedShort();
		int yvSize = first.readUnsignedShort();
		int zvSize = first.readUnsignedShort();
		int fiSize = first.readUnsignedShort();
		int verticesFlagOffset = 0;
		int verticesZOffset = verticesFlagOffset + numVertices;
		int var23 = verticesZOffset;
		verticesZOffset += numFaces;
		int facePrioritiesOffset = verticesZOffset;
		if (modelPriority == 255) {
			verticesZOffset += numFaces;
		}
		int faceSkinsOffset = verticesZOffset;
		if (hasFaceSkins == 1) {
			verticesZOffset += numFaces;
		}
		int faceTypesOffset = verticesZOffset;
		if (hasFaceTypes == 1) {
			verticesZOffset += numFaces;
		}
		int vertexSkinsOffset = verticesZOffset;
		if (hasVertexSkins == 1) {
			verticesZOffset += numVertices;
		}
		int faceAlphasOffset = verticesZOffset;
		if (hasFaceAlphas == 1) {
			verticesZOffset += numFaces;
		}
		int faceIndicesOffset = verticesZOffset;
		verticesZOffset += fiSize;
		int faceColorsOffset = verticesZOffset;
		verticesZOffset += numFaces * 2;
		int faceMappingsOffset = verticesZOffset;
		verticesZOffset += numTextures * 6;
		int verticesXOffset = verticesZOffset;
		verticesZOffset += xvSize;
		int vericesYOffset = verticesZOffset;
		verticesZOffset += yvSize;
		this.numVertices = numVertices;
		this.numFaces = numFaces;
		this.numTextures = numTextures;
		verticesX = new int[numVertices];
		verticesY = new int[numVertices];
		verticesZ = new int[numVertices];
		facesA = new short[numFaces];
		facesB = new short[numFaces];
		facesC = new short[numFaces];
		if (numTextures > 0) {
			texturesMappingType = new byte[numTextures];
			texturesMappingP = new short[numTextures];
			texturesMappingM = new short[numTextures];
			texturesMappingN = new short[numTextures];
		}
		if (hasVertexSkins == 1) {
			verticesSkin = new int[numVertices];
		}
		if (hasFaceTypes == 1) {
			facesType = new byte[numFaces];
			facesTexture = new byte[numFaces];
			facesMaterial = new short[numFaces];
		}
		if (modelPriority == 255) {
			facesPriority = new byte[numFaces];
		} else {
			priority = (byte) modelPriority;
		}
		if (hasFaceAlphas == 1) {
			facesAlpha = new byte[numFaces];
		}
		if (hasFaceSkins == 1) {
			facesSkin = new int[numFaces];
		}
		facesColour = new short[numFaces];
		first.pos = verticesFlagOffset * 116413311;
		second.pos = verticesXOffset * 116413311;
		third.pos = vericesYOffset * 116413311;
		fourth.pos = verticesZOffset * 116413311;
		fifth.pos = vertexSkinsOffset * 116413311;
		int baseX = 0;
		int baseY = 0;
		int baseZ = 0;
		for (int vertex = 0; vertex < numVertices; ++vertex) {
			int pflag = first.readUnsignedByte();
			int xOffset = 0;
			if ((pflag & 0x1) != 0) {
				xOffset = second.gSmart1or2s();
			}
			int yOffset = 0;
			if ((pflag & 0x2) != 0) {
				yOffset = third.gSmart1or2s();
			}
			int zOffset = 0;
			if ((pflag & 0x4) != 0) {
				zOffset = fourth.gSmart1or2s();
			}
			verticesX[vertex] = baseX + xOffset;
			verticesY[vertex] = baseY + yOffset;
			verticesZ[vertex] = baseZ + zOffset;
			baseX = verticesX[vertex];
			baseY = verticesY[vertex];
			baseZ = verticesZ[vertex];
			if (hasVertexSkins == 1) {
				verticesSkin[vertex] = fifth.readUnsignedByte();
			}
		}
		first.pos = faceColorsOffset * 116413311;
		second.pos = faceTypesOffset * 116413311;
		third.pos = facePrioritiesOffset * 116413311;
		fourth.pos = faceAlphasOffset * 116413311;
		fifth.pos = faceSkinsOffset * 116413311;
		for (int face = 0; face < numFaces; ++face) {
			facesColour[face] = (short) first.readUnsignedShort();
			if (hasFaceTypes == 1) {
				int flag = second.readUnsignedByte();
				if ((flag & 0x1) == 1) {
					facesType[face] = 1;
					usesFaceTypes = true;
				} else {
					facesType[face] = 0;
				}

				if ((flag & 0x2) == 2) {
					facesTexture[face] = (byte) (flag >> 2);
					facesMaterial[face] = facesColour[face];
					facesColour[face] = 127;
					if (facesMaterial[face] != -1) {
						usesMaterials = true;
					}
				} else {
					facesTexture[face] = -1;
					facesMaterial[face] = -1;
				}
			}
			if (modelPriority == 255) {
				facesPriority[face] = third.readByte();
			}
			if (hasFaceAlphas == 1) {
				facesAlpha[face] = fourth.readByte();
			}
			if (hasFaceSkins == 1) {
				facesSkin[face] = fifth.readUnsignedByte();
			}
		}

		first.pos = faceIndicesOffset * 116413311;
		second.pos = var23 * 116413311;
		highestFaceIndex = -1;
		short a = 0;
		short b = 0;
		short c = 0;
		int acc = 0;
		for (int face = 0; face < numFaces; ++face) {
			int type = second.readUnsignedByte();
			if (type == 1) {
				a = (short) (first.gSmart1or2s() + acc);
				acc = a;
				b = (short) (first.gSmart1or2s() + acc);
				acc = b;
				c = (short) (first.gSmart1or2s() + acc);
				acc = c;
				facesA[face] = a;
				if (a > highestFaceIndex) {
					highestFaceIndex = a;
				}
				facesB[face] = b;
				if (b > highestFaceIndex) {
					highestFaceIndex = b;
				}
				facesC[face] = c;
				if (c > highestFaceIndex) {
					highestFaceIndex = c;
				}
			} else if (type == 2) {
				b = c;
				c = (short) (first.gSmart1or2s() + acc);
				acc = c;
				facesA[face] = a;
				facesB[face] = b;
				facesC[face] = c;
				if (c > highestFaceIndex) {
					highestFaceIndex = c;
				}
			} else if (type == 3) {
				a = c;
				c = (short) (first.gSmart1or2s() + acc);
				acc = c;
				facesA[face] = a;
				facesB[face] = b;
				facesC[face] = c;
				if (c > highestFaceIndex) {
					highestFaceIndex = c;
				}
			} else if (type == 4) {
				short bka = a;
				a = b;
				b = bka;
				c = (short) (first.gSmart1or2s() + acc);
				acc = c;
				facesA[face] = a;
				facesB[face] = bka;
				facesC[face] = c;
				if (c > highestFaceIndex) {
					highestFaceIndex = c;
				}
			}
		}
		highestFaceIndex++;
		first.pos = faceMappingsOffset * 116413311;
		for (int texture = 0; texture < numTextures; ++texture) {
			texturesMappingType[texture] = 0;
			texturesMappingP[texture] = (short) first.readUnsignedShort();
			texturesMappingM[texture] = (short) first.readUnsignedShort();
			texturesMappingN[texture] = (short) first.readUnsignedShort();
		}
		if (facesTexture != null) {
			boolean usesMapping = false;
			for (int face = 0; face < numFaces; ++face) {
				int texture = facesTexture[face] & 0xff;
				if (texture != 255) {
					if ((texturesMappingP[texture] & 0xffff) == facesA[face]
							&& (texturesMappingM[texture] & 0xffff) == facesB[face]
							&& (texturesMappingN[texture] & 0xffff) == facesC[face]) {
						facesTexture[face] = -1;
					} else {
						usesMapping = true;
					}
				}
			}

			if (!usesMapping) {
				facesTexture = null;
			}
		}

		if (!usesMaterials) {
			facesMaterial = null;
		}

		if (!usesFaceTypes) {
			facesType = null;
		}

	}

	public Model(int i, int i_0_, int i_1_) {
		numVertices = 0;
		highestFaceIndex = 0;
		numFaces = 0;
		priority = (byte) 0;
		numTextures = 0;
		verticesX = new int[i];
		verticesY = new int[i];
		verticesZ = new int[i];
		verticesSkin = new int[i];
		facesA = new short[i_0_];
		facesB = new short[i_0_];
		facesC = new short[i_0_];
		facesType = new byte[i_0_];
		facesPriority = new byte[i_0_];
		facesAlpha = new byte[i_0_];
		facesTexture = new byte[i_0_];
		facesColour = new short[i_0_];
		facesMaterial = new short[i_0_];
		facesSkin = new int[i_0_];
		if (i_1_ > 0) {
			texturesMappingType = new byte[i_1_];
			texturesMappingP = new short[i_1_];
			texturesMappingM = new short[i_1_];
			texturesMappingN = new short[i_1_];
			textureScaleX = new int[i_1_];
			textureScaleY = new int[i_1_];
			textureScaleZ = new int[i_1_];
			textureRotation = new byte[i_1_];
			textureDirection = new byte[i_1_];
			textureSpeed = new int[i_1_];
			textureTransU = new int[i_1_];
			textureTransV = new int[i_1_];
		}
	}

	public Model(Model[] class64s, int i) {
		numVertices = 0;
		highestFaceIndex = 0;
		numFaces = 0;
		priority = (byte) 0;
		numTextures = 0;
		numVertices = 0;
		numFaces = 0;
		numTextures = 0;
		int i_2_ = 0;
		int i_3_ = 0;
		int i_4_ = 0;
		boolean bool = false;
		boolean bool_5_ = false;
		boolean bool_6_ = false;
		boolean bool_7_ = false;
		boolean bool_8_ = false;
		boolean bool_9_ = false;
		priority = (byte) -1;
		for (int i_10_ = 0; i_10_ < i; i_10_++) {
			Model class64_11_ = class64s[i_10_];
			if (class64_11_ != null) {
				numVertices += class64_11_.numVertices;
				numFaces += class64_11_.numFaces;
				numTextures += class64_11_.numTextures;
				if (class64_11_.aClass85Array647 != null) {
					i_2_ += class64_11_.aClass85Array647.length;
				}
				if (class64_11_.aMagnetConfigArray613 != null) {
					i_3_ += class64_11_.aMagnetConfigArray613.length;
				}
				if (class64_11_.aVertexNormalArray649 != null) {
					i_4_ += class64_11_.aVertexNormalArray649.length;
				}
				bool = bool | class64_11_.facesType != null;
				if (class64_11_.facesPriority != null) {
					bool_5_ = true;
				} else {
					if (priority == -1) {
						priority = class64_11_.priority;
					}
					if (priority != class64_11_.priority) {
						bool_5_ = true;
					}
				}
				bool_6_ = bool_6_ | class64_11_.facesAlpha != null;
				bool_7_ = bool_7_ | class64_11_.facesTexture != null;
				bool_8_ = bool_8_ | class64_11_.facesMaterial != null;
				bool_9_ = bool_9_ | class64_11_.facesSkin != null;
			}
		}
		verticesX = new int[numVertices];
		verticesY = new int[numVertices];
		verticesZ = new int[numVertices];
		verticesSkin = new int[numVertices];
		vertexDuplicates = new short[numVertices];
		facesA = new short[numFaces];
		facesB = new short[numFaces];
		facesC = new short[numFaces];
		if (bool) {
			facesType = new byte[numFaces];
		}
		if (bool_5_) {
			facesPriority = new byte[numFaces];
		}
		if (bool_6_) {
			facesAlpha = new byte[numFaces];
		}
		if (bool_7_) {
			facesTexture = new byte[numFaces];
		}
		facesColour = new short[numFaces];
		if (bool_8_) {
			facesMaterial = new short[numFaces];
		}
		if (bool_9_) {
			facesSkin = new int[numFaces];
		}
		submeshes_lookup = new short[numFaces];
		if (numTextures > 0) {
			texturesMappingType = new byte[numTextures];
			texturesMappingP = new short[numTextures];
			texturesMappingM = new short[numTextures];
			texturesMappingN = new short[numTextures];
			textureScaleX = new int[numTextures];
			textureScaleY = new int[numTextures];
			textureScaleZ = new int[numTextures];
			textureRotation = new byte[numTextures];
			textureDirection = new byte[numTextures];
			textureSpeed = new int[numTextures];
			textureTransU = new int[numTextures];
			textureTransV = new int[numTextures];
		}
		if (i_4_ > 0) {
			aVertexNormalArray649 = new VertexNormal[i_4_];
		}
		if (i_2_ > 0) {
			aClass85Array647 = new Class85[i_2_];
		}
		if (i_3_ > 0) {
			aMagnetConfigArray613 = new MagnetConfig[i_3_];
		}
		numVertices = 0;
		numFaces = 0;
		numTextures = 0;
		i_2_ = 0;
		i_3_ = 0;
		i_4_ = 0;
		for (int i_12_ = 0; i_12_ < i; i_12_++) {
			short i_13_ = (short) (1 << i_12_);
			Model class64_14_ = class64s[i_12_];
			if (class64_14_ != null) {
				if (class64_14_.aVertexNormalArray649 != null) {
					for (int i_15_ = 0; i_15_ < class64_14_.aVertexNormalArray649.length; i_15_++) {
						VertexNormal vertexNormal = class64_14_.aVertexNormalArray649[i_15_];
						aVertexNormalArray649[i_4_++] = vertexNormal.method945(vertexNormal.face * 1512514121 + numFaces,
								214949543);
					}
				}
				for (int i_16_ = 0; i_16_ < class64_14_.numFaces; i_16_++) {
					if (bool && class64_14_.facesType != null) {
						facesType[numFaces] = class64_14_.facesType[i_16_];
					}
					if (bool_5_) {
						if (class64_14_.facesPriority != null) {
							facesPriority[numFaces] = class64_14_.facesPriority[i_16_];
						} else {
							facesPriority[numFaces] = class64_14_.priority;
						}
					}
					if (bool_6_ && class64_14_.facesAlpha != null) {
						facesAlpha[numFaces] = class64_14_.facesAlpha[i_16_];
					}
					if (bool_8_) {
						if (class64_14_.facesMaterial != null) {
							facesMaterial[numFaces] = class64_14_.facesMaterial[i_16_];
						} else {
							facesMaterial[numFaces] = (short) -1;
						}
					}
					if (bool_9_) {
						if (class64_14_.facesSkin != null) {
							facesSkin[numFaces] = class64_14_.facesSkin[i_16_];
						} else {
							facesSkin[numFaces] = -1;
						}
					}
					facesA[numFaces] = (short) method743(class64_14_, class64_14_.facesA[i_16_], i_13_);
					facesB[numFaces] = (short) method743(class64_14_, class64_14_.facesB[i_16_], i_13_);
					facesC[numFaces] = (short) method743(class64_14_, class64_14_.facesC[i_16_], i_13_);
					submeshes_lookup[numFaces] = i_13_;
					facesColour[numFaces] = class64_14_.facesColour[i_16_];
					numFaces++;
				}
				if (class64_14_.aClass85Array647 != null) {
					for (int i_17_ = 0; i_17_ < class64_14_.aClass85Array647.length; i_17_++) {
						int i_18_ = method743(class64_14_, class64_14_.aClass85Array647[i_17_].anInt773 * -710317103,
								i_13_);
						int i_19_ = method743(class64_14_, class64_14_.aClass85Array647[i_17_].anInt774 * 1705862021,
								i_13_);
						int i_20_ = method743(class64_14_, class64_14_.aClass85Array647[i_17_].anInt775 * 1636170731,
								i_13_);
						aClass85Array647[i_2_] = class64_14_.aClass85Array647[i_17_].method954(i_18_, i_19_, i_20_,
								-1991744488);
						i_2_++;
					}
				}
				if (class64_14_.aMagnetConfigArray613 != null) {
					for (int i_21_ = 0; i_21_ < class64_14_.aMagnetConfigArray613.length; i_21_++) {
						int i_22_ = method743(class64_14_, class64_14_.aMagnetConfigArray613[i_21_].anInt674 * -180596249,
								i_13_);
						aMagnetConfigArray613[i_3_] = class64_14_.aMagnetConfigArray613[i_21_].method776(i_22_, (byte) 0);
						i_3_++;
					}
				}
			}
		}
		int i_23_ = 0;
		highestFaceIndex = numVertices;
		for (int i_24_ = 0; i_24_ < i; i_24_++) {
			short i_25_ = (short) (1 << i_24_);
			Model class64_26_ = class64s[i_24_];
			if (class64_26_ != null) {
				for (int i_27_ = 0; i_27_ < class64_26_.numFaces; i_27_++) {
					if (bool_7_) {
						facesTexture[i_23_++] = (byte) (class64_26_.facesTexture != null
								&& class64_26_.facesTexture[i_27_] != -1 ? class64_26_.facesTexture[i_27_] + numTextures
										: -1);
					}
				}
				for (int i_28_ = 0; i_28_ < class64_26_.numTextures; i_28_++) {
					byte i_29_ = texturesMappingType[numTextures] = class64_26_.texturesMappingType[i_28_];
					if (i_29_ == 0) {
						texturesMappingP[numTextures] = (short) method743(class64_26_,
								class64_26_.texturesMappingP[i_28_], i_25_);
						texturesMappingM[numTextures] = (short) method743(class64_26_,
								class64_26_.texturesMappingM[i_28_], i_25_);
						texturesMappingN[numTextures] = (short) method743(class64_26_,
								class64_26_.texturesMappingN[i_28_], i_25_);
					}
					if (i_29_ >= 1 && i_29_ <= 3) {
						texturesMappingP[numTextures] = class64_26_.texturesMappingP[i_28_];
						texturesMappingM[numTextures] = class64_26_.texturesMappingM[i_28_];
						texturesMappingN[numTextures] = class64_26_.texturesMappingN[i_28_];
						textureScaleX[numTextures] = class64_26_.textureScaleX[i_28_];
						textureScaleY[numTextures] = class64_26_.textureScaleY[i_28_];
						textureScaleZ[numTextures] = class64_26_.textureScaleZ[i_28_];
						textureRotation[numTextures] = class64_26_.textureRotation[i_28_];
						textureDirection[numTextures] = class64_26_.textureDirection[i_28_];
						textureSpeed[numTextures] = class64_26_.textureSpeed[i_28_];
					}
					if (i_29_ == 2) {
						textureTransU[numTextures] = class64_26_.textureTransU[i_28_];
						textureTransV[numTextures] = class64_26_.textureTransV[i_28_];
					}
					numTextures++;
				}
			}
		}
	}

	final int method743(Model class64_30_, int i, short i_31_) {
		int i_32_ = class64_30_.verticesX[i];
		int i_33_ = class64_30_.verticesY[i];
		int i_34_ = class64_30_.verticesZ[i];
		for (int i_35_ = 0; i_35_ < numVertices; i_35_++) {
			if (i_32_ == verticesX[i_35_] && i_33_ == verticesY[i_35_] && i_34_ == verticesZ[i_35_]) {
				vertexDuplicates[i_35_] |= i_31_;
				return i_35_;
			}
		}
		verticesX[numVertices] = i_32_;
		verticesY[numVertices] = i_33_;
		verticesZ[numVertices] = i_34_;
		vertexDuplicates[numVertices] = i_31_;
		verticesSkin[numVertices] = class64_30_.verticesSkin != null ? class64_30_.verticesSkin[i] : -1;
		return numVertices++;
	}

	void method744(Packet class298_sub53, Packet class298_sub53_36_) {
		short i = 0;
		short i_37_ = 0;
		short i_38_ = 0;
		int i_39_ = 0;
		for (int i_40_ = 0; i_40_ < numFaces; i_40_++) {
			int i_41_ = class298_sub53_36_.readUnsignedByte();
			if (i_41_ == 1) {
				i = (short) (class298_sub53.gSmart1or2s() + i_39_);
				i_39_ = i;
				i_37_ = (short) (class298_sub53.gSmart1or2s() + i_39_);
				i_39_ = i_37_;
				i_38_ = (short) (class298_sub53.gSmart1or2s() + i_39_);
				i_39_ = i_38_;
				facesA[i_40_] = i;
				facesB[i_40_] = i_37_;
				facesC[i_40_] = i_38_;
				if (i > highestFaceIndex) {
					highestFaceIndex = i;
				}
				if (i_37_ > highestFaceIndex) {
					highestFaceIndex = i_37_;
				}
				if (i_38_ > highestFaceIndex) {
					highestFaceIndex = i_38_;
				}
			}
			if (i_41_ == 2) {
				i_37_ = i_38_;
				i_38_ = (short) (class298_sub53.gSmart1or2s() + i_39_);
				i_39_ = i_38_;
				facesA[i_40_] = i;
				facesB[i_40_] = i_37_;
				facesC[i_40_] = i_38_;
				if (i_38_ > highestFaceIndex) {
					highestFaceIndex = i_38_;
				}
			}
			if (i_41_ == 3) {
				i = i_38_;
				i_38_ = (short) (class298_sub53.gSmart1or2s() + i_39_);
				i_39_ = i_38_;
				facesA[i_40_] = i;
				facesB[i_40_] = i_37_;
				facesC[i_40_] = i_38_;
				if (i_38_ > highestFaceIndex) {
					highestFaceIndex = i_38_;
				}
			}
			if (i_41_ == 4) {
				short i_42_ = i;
				i = i_37_;
				i_37_ = i_42_;
				i_38_ = (short) (class298_sub53.gSmart1or2s() + i_39_);
				i_39_ = i_38_;
				facesA[i_40_] = i;
				facesB[i_40_] = i_37_;
				facesC[i_40_] = i_38_;
				if (i_38_ > highestFaceIndex) {
					highestFaceIndex = i_38_;
				}
			}
		}
		highestFaceIndex++;
	}

	void method745(Packet class298_sub53, Packet class298_sub53_43_, Packet class298_sub53_44_,
			Packet class298_sub53_45_, Packet class298_sub53_46_, Packet class298_sub53_47_) {
		for (int i = 0; i < numTextures; i++) {
			int i_48_ = texturesMappingType[i] & 0xff;
			if (i_48_ == 0) {
				texturesMappingP[i] = (short) class298_sub53.readUnsignedShort();
				texturesMappingM[i] = (short) class298_sub53.readUnsignedShort();
				texturesMappingN[i] = (short) class298_sub53.readUnsignedShort();
			}
			if (i_48_ == 1) {
				texturesMappingP[i] = (short) class298_sub53_43_.readUnsignedShort();
				texturesMappingM[i] = (short) class298_sub53_43_.readUnsignedShort();
				texturesMappingN[i] = (short) class298_sub53_43_.readUnsignedShort();
				if (version < 15) {
					textureScaleX[i] = class298_sub53_44_.readUnsignedShort();
					if (version < 14) {
						textureScaleY[i] = class298_sub53_44_.readUnsignedShort();
					} else {
						textureScaleY[i] = class298_sub53_44_.g3();
					}
					textureScaleZ[i] = class298_sub53_44_.readUnsignedShort();
				} else {
					textureScaleX[i] = class298_sub53_44_.g3();
					textureScaleY[i] = class298_sub53_44_.g3();
					textureScaleZ[i] = class298_sub53_44_.g3();
				}
				textureRotation[i] = class298_sub53_45_.readByte();
				textureDirection[i] = class298_sub53_46_.readByte();
				textureSpeed[i] = class298_sub53_47_.readByte();
			}
			if (i_48_ == 2) {
				texturesMappingP[i] = (short) class298_sub53_43_.readUnsignedShort();
				texturesMappingM[i] = (short) class298_sub53_43_.readUnsignedShort();
				texturesMappingN[i] = (short) class298_sub53_43_.readUnsignedShort();
				if (version < 15) {
					textureScaleX[i] = class298_sub53_44_.readUnsignedShort();
					if (version < 14) {
						textureScaleY[i] = class298_sub53_44_.readUnsignedShort();
					} else {
						textureScaleY[i] = class298_sub53_44_.g3();
					}
					textureScaleZ[i] = class298_sub53_44_.readUnsignedShort();
				} else {
					textureScaleX[i] = class298_sub53_44_.g3();
					textureScaleY[i] = class298_sub53_44_.g3();
					textureScaleZ[i] = class298_sub53_44_.g3();
				}
				textureRotation[i] = class298_sub53_45_.readByte();
				textureDirection[i] = class298_sub53_46_.readByte();
				textureSpeed[i] = class298_sub53_47_.readByte();
				textureTransU[i] = class298_sub53_47_.readByte();
				textureTransV[i] = class298_sub53_47_.readByte();
			}
			if (i_48_ == 3) {
				texturesMappingP[i] = (short) class298_sub53_43_.readUnsignedShort();
				texturesMappingM[i] = (short) class298_sub53_43_.readUnsignedShort();
				texturesMappingN[i] = (short) class298_sub53_43_.readUnsignedShort();
				if (version < 15) {
					textureScaleX[i] = class298_sub53_44_.readUnsignedShort();
					if (version < 14) {
						textureScaleY[i] = class298_sub53_44_.readUnsignedShort();
					} else {
						textureScaleY[i] = class298_sub53_44_.g3();
					}
					textureScaleZ[i] = class298_sub53_44_.readUnsignedShort();
				} else {
					textureScaleX[i] = class298_sub53_44_.g3();
					textureScaleY[i] = class298_sub53_44_.g3();
					textureScaleZ[i] = class298_sub53_44_.g3();
				}
				textureRotation[i] = class298_sub53_45_.readByte();
				textureDirection[i] = class298_sub53_46_.readByte();
				textureSpeed[i] = class298_sub53_47_.readByte();
			}
		}
	}

	void decodeOld(byte[] is) {
		boolean bool = false;
		boolean bool_49_ = false;
		Packet class298_sub53 = new Packet(is);
		Packet class298_sub53_50_ = new Packet(is);
		Packet class298_sub53_51_ = new Packet(is);
		Packet class298_sub53_52_ = new Packet(is);
		Packet class298_sub53_53_ = new Packet(is);
		class298_sub53.pos = (is.length - 18) * 116413311;
		numVertices = class298_sub53.readUnsignedShort();
		numFaces = class298_sub53.readUnsignedShort();
		numTextures = class298_sub53.readUnsignedByte();
		int i = class298_sub53.readUnsignedByte();
		int i_54_ = class298_sub53.readUnsignedByte();
		int i_55_ = class298_sub53.readUnsignedByte();
		int i_56_ = class298_sub53.readUnsignedByte();
		int i_57_ = class298_sub53.readUnsignedByte();
		int i_58_ = class298_sub53.readUnsignedShort();
		int i_59_ = class298_sub53.readUnsignedShort();
		int i_60_ = class298_sub53.readUnsignedShort();
		int i_61_ = class298_sub53.readUnsignedShort();
		int i_62_ = 0;
		int i_63_ = i_62_;
		i_62_ += numVertices;
		int i_64_ = i_62_;
		i_62_ += numFaces;
		int i_65_ = i_62_;
		if (i_54_ == 255) {
			i_62_ += numFaces;
		}
		int i_66_ = i_62_;
		if (i_56_ == 1) {
			i_62_ += numFaces;
		}
		int i_67_ = i_62_;
		if (i == 1) {
			i_62_ += numFaces;
		}
		int i_68_ = i_62_;
		if (i_57_ == 1) {
			i_62_ += numVertices;
		}
		int i_69_ = i_62_;
		if (i_55_ == 1) {
			i_62_ += numFaces;
		}
		int i_70_ = i_62_;
		i_62_ += i_61_;
		int i_71_ = i_62_;
		i_62_ += numFaces * 2;
		int i_72_ = i_62_;
		i_62_ += numTextures * 6;
		int i_73_ = i_62_;
		i_62_ += i_58_;
		int i_74_ = i_62_;
		i_62_ += i_59_;
		int i_75_ = i_62_;
		i_62_ += i_60_;
		verticesX = new int[numVertices];
		verticesY = new int[numVertices];
		verticesZ = new int[numVertices];
		facesA = new short[numFaces];
		facesB = new short[numFaces];
		facesC = new short[numFaces];
		if (numTextures > 0) {
			texturesMappingType = new byte[numTextures];
			texturesMappingP = new short[numTextures];
			texturesMappingM = new short[numTextures];
			texturesMappingN = new short[numTextures];
		}
		if (i_57_ == 1) {
			verticesSkin = new int[numVertices];
		}
		if (i == 1) {
			facesType = new byte[numFaces];
			facesTexture = new byte[numFaces];
			facesMaterial = new short[numFaces];
		}
		if (i_54_ == 255) {
			facesPriority = new byte[numFaces];
		} else {
			priority = (byte) i_54_;
		}
		if (i_55_ == 1) {
			facesAlpha = new byte[numFaces];
		}
		if (i_56_ == 1) {
			facesSkin = new int[numFaces];
		}
		facesColour = new short[numFaces];
		class298_sub53.pos = i_63_ * 116413311;
		class298_sub53_50_.pos = i_73_ * 116413311;
		class298_sub53_51_.pos = i_74_ * 116413311;
		class298_sub53_52_.pos = i_75_ * 116413311;
		class298_sub53_53_.pos = i_68_ * 116413311;
		int i_76_ = 0;
		int i_77_ = 0;
		int i_78_ = 0;
		for (int i_79_ = 0; i_79_ < numVertices; i_79_++) {
			int i_80_ = class298_sub53.readUnsignedByte();
			int i_81_ = 0;
			if ((i_80_ & 0x1) != 0) {
				i_81_ = class298_sub53_50_.gSmart1or2s();
			}
			int i_82_ = 0;
			if ((i_80_ & 0x2) != 0) {
				i_82_ = class298_sub53_51_.gSmart1or2s();
			}
			int i_83_ = 0;
			if ((i_80_ & 0x4) != 0) {
				i_83_ = class298_sub53_52_.gSmart1or2s();
			}
			verticesX[i_79_] = i_76_ + i_81_;
			verticesY[i_79_] = i_77_ + i_82_;
			verticesZ[i_79_] = i_78_ + i_83_;
			i_76_ = verticesX[i_79_];
			i_77_ = verticesY[i_79_];
			i_78_ = verticesZ[i_79_];
			if (i_57_ == 1) {
				verticesSkin[i_79_] = class298_sub53_53_.readUnsignedByte();
			}
		}
		class298_sub53.pos = i_71_ * 116413311;
		class298_sub53_50_.pos = i_67_ * 116413311;
		class298_sub53_51_.pos = i_65_ * 116413311;
		class298_sub53_52_.pos = i_69_ * 116413311;
		class298_sub53_53_.pos = i_66_ * 116413311;
		for (int i_84_ = 0; i_84_ < numFaces; i_84_++) {
			facesColour[i_84_] = (short) class298_sub53.readUnsignedShort();
			if (i == 1) {
				int i_85_ = class298_sub53_50_.readUnsignedByte();
				if ((i_85_ & 0x1) == 1) {
					facesType[i_84_] = (byte) 1;
					bool = true;
				} else {
					facesType[i_84_] = (byte) 0;
				}
				if ((i_85_ & 0x2) == 2) {
					facesTexture[i_84_] = (byte) (i_85_ >> 2);
					facesMaterial[i_84_] = facesColour[i_84_];
					facesColour[i_84_] = (short) 127;
					if (facesMaterial[i_84_] != -1) {
						bool_49_ = true;
					}
				} else {
					facesTexture[i_84_] = (byte) -1;
					facesMaterial[i_84_] = (short) -1;
				}
			}
			if (i_54_ == 255) {
				facesPriority[i_84_] = class298_sub53_51_.readByte();
			}
			if (i_55_ == 1) {
				facesAlpha[i_84_] = class298_sub53_52_.readByte();
			}
			if (i_56_ == 1) {
				facesSkin[i_84_] = class298_sub53_53_.readUnsignedByte();
			}
		}
		highestFaceIndex = -1;
		class298_sub53.pos = i_70_ * 116413311;
		class298_sub53_50_.pos = i_64_ * 116413311;
		short i_86_ = 0;
		short i_87_ = 0;
		short i_88_ = 0;
		int i_89_ = 0;
		for (int i_90_ = 0; i_90_ < numFaces; i_90_++) {
			int i_91_ = class298_sub53_50_.readUnsignedByte();
			if (i_91_ == 1) {
				i_86_ = (short) (class298_sub53.gSmart1or2s() + i_89_);
				i_89_ = i_86_;
				i_87_ = (short) (class298_sub53.gSmart1or2s() + i_89_);
				i_89_ = i_87_;
				i_88_ = (short) (class298_sub53.gSmart1or2s() + i_89_);
				i_89_ = i_88_;
				facesA[i_90_] = i_86_;
				facesB[i_90_] = i_87_;
				facesC[i_90_] = i_88_;
				if (i_86_ > highestFaceIndex) {
					highestFaceIndex = i_86_;
				}
				if (i_87_ > highestFaceIndex) {
					highestFaceIndex = i_87_;
				}
				if (i_88_ > highestFaceIndex) {
					highestFaceIndex = i_88_;
				}
			}
			if (i_91_ == 2) {
				i_87_ = i_88_;
				i_88_ = (short) (class298_sub53.gSmart1or2s() + i_89_);
				i_89_ = i_88_;
				facesA[i_90_] = i_86_;
				facesB[i_90_] = i_87_;
				facesC[i_90_] = i_88_;
				if (i_88_ > highestFaceIndex) {
					highestFaceIndex = i_88_;
				}
			}
			if (i_91_ == 3) {
				i_86_ = i_88_;
				i_88_ = (short) (class298_sub53.gSmart1or2s() + i_89_);
				i_89_ = i_88_;
				facesA[i_90_] = i_86_;
				facesB[i_90_] = i_87_;
				facesC[i_90_] = i_88_;
				if (i_88_ > highestFaceIndex) {
					highestFaceIndex = i_88_;
				}
			}
			if (i_91_ == 4) {
				short i_92_ = i_86_;
				i_86_ = i_87_;
				i_87_ = i_92_;
				i_88_ = (short) (class298_sub53.gSmart1or2s() + i_89_);
				i_89_ = i_88_;
				facesA[i_90_] = i_86_;
				facesB[i_90_] = i_87_;
				facesC[i_90_] = i_88_;
				if (i_88_ > highestFaceIndex) {
					highestFaceIndex = i_88_;
				}
			}
		}
		highestFaceIndex++;
		class298_sub53.pos = i_72_ * 116413311;
		for (int i_93_ = 0; i_93_ < numTextures; i_93_++) {
			texturesMappingType[i_93_] = (byte) 0;
			texturesMappingP[i_93_] = (short) class298_sub53.readUnsignedShort();
			texturesMappingM[i_93_] = (short) class298_sub53.readUnsignedShort();
			texturesMappingN[i_93_] = (short) class298_sub53.readUnsignedShort();
		}
		if (facesTexture != null) {
			boolean bool_94_ = false;
			for (int i_95_ = 0; i_95_ < numFaces; i_95_++) {
				int i_96_ = facesTexture[i_95_] & 0xff;
				if (i_96_ != 255) {
					if ((texturesMappingP[i_96_] & 0xffff) == facesA[i_95_]
							&& (texturesMappingM[i_96_] & 0xffff) == facesB[i_95_]
							&& (texturesMappingN[i_96_] & 0xffff) == facesC[i_95_]) {
						facesTexture[i_95_] = (byte) -1;
					} else {
						bool_94_ = true;
					}
				}
			}
			if (!bool_94_) {
				facesTexture = null;
			}
		}
		if (!bool_49_) {
			facesMaterial = null;
		}
		if (!bool) {
			facesType = null;
		}
	}

	public int method747(int i, int i_97_, int i_98_) {
		for (int i_99_ = 0; i_99_ < numVertices; i_99_++) {
			if (verticesX[i_99_] == i && verticesY[i_99_] == i_97_ && verticesZ[i_99_] == i_98_) {
				return i_99_;
			}
		}
		verticesX[numVertices] = i;
		verticesY[numVertices] = i_97_;
		verticesZ[numVertices] = i_98_;
		highestFaceIndex = numVertices + 1;
		return numVertices++;
	}

	public int method748(int i, int i_100_, int i_101_, byte i_102_, byte i_103_, short i_104_, byte i_105_,
			short i_106_) {
		facesA[numFaces] = (short) i;
		facesB[numFaces] = (short) i_100_;
		facesC[numFaces] = (short) i_101_;
		facesType[numFaces] = i_102_;
		facesTexture[numFaces] = i_103_;
		facesColour[numFaces] = i_104_;
		facesAlpha[numFaces] = i_105_;
		facesMaterial[numFaces] = i_106_;
		return numFaces++;
	}

	public int[][] method749(boolean bool) {
		int[] is = new int[256];
		int i = 0;
		int i_107_ = bool ? numVertices : highestFaceIndex;
		for (int i_108_ = 0; i_108_ < i_107_; i_108_++) {
			int i_109_ = verticesSkin[i_108_];
			if (i_109_ >= 0) {
				is[i_109_]++;
				if (i_109_ > i) {
					i = i_109_;
				}
			}
		}
		int[][] is_110_ = new int[i + 1][];
		for (int i_111_ = 0; i_111_ <= i; i_111_++) {
			is_110_[i_111_] = new int[is[i_111_]];
			is[i_111_] = 0;
		}
		for (int i_112_ = 0; i_112_ < i_107_; i_112_++) {
			int i_113_ = verticesSkin[i_112_];
			if (i_113_ >= 0) {
				is_110_[i_113_][is[i_113_]++] = i_112_;
			}
		}
		return is_110_;
	}

	public int[][] method750() {
		int[] is = new int[256];
		int i = 0;
		for (int i_114_ = 0; i_114_ < numFaces; i_114_++) {
			int i_115_ = facesSkin[i_114_];
			if (i_115_ >= 0) {
				is[i_115_]++;
				if (i_115_ > i) {
					i = i_115_;
				}
			}
		}
		int[][] is_116_ = new int[i + 1][];
		for (int i_117_ = 0; i_117_ <= i; i_117_++) {
			is_116_[i_117_] = new int[is[i_117_]];
			is[i_117_] = 0;
		}
		for (int i_118_ = 0; i_118_ < numFaces; i_118_++) {
			int i_119_ = facesSkin[i_118_];
			if (i_119_ >= 0) {
				is_116_[i_119_][is[i_119_]++] = i_118_;
			}
		}
		return is_116_;
	}

	public static Model method751(Js5 class243, int i, int i_120_) {
		byte[] is = class243.getFileFromArchive(i, i_120_, (byte) -97);
		if (is == null) {
			return null;
		}
		return new Model(is);
	}

	public void method752(short i, short i_121_) {
		if (facesMaterial != null) {
			for (int i_122_ = 0; i_122_ < numFaces; i_122_++) {
				if (facesMaterial[i_122_] == i) {
					facesMaterial[i_122_] = i_121_;
				}
			}
		}
	}

	public void method753(int i, int i_123_, int i_124_) {
		for (int i_125_ = 0; i_125_ < numVertices; i_125_++) {
			verticesX[i_125_] += i;
			verticesY[i_125_] += i_123_;
			verticesZ[i_125_] += i_124_;
		}
	}

	public void method754(int i, int i_126_, int i_127_) {
		if (i_127_ != 0) {
			int i_128_ = Class220.SINE[i_127_];
			int i_129_ = Class220.COSINE[i_127_];
			for (int i_130_ = 0; i_130_ < numVertices; i_130_++) {
				int i_131_ = verticesY[i_130_] * i_128_ + verticesX[i_130_] * i_129_ >> 14;
				verticesY[i_130_] = verticesY[i_130_] * i_129_ - verticesX[i_130_] * i_128_ >> 14;
				verticesX[i_130_] = i_131_;
			}
		}
		if (i != 0) {
			int i_132_ = Class220.SINE[i];
			int i_133_ = Class220.COSINE[i];
			for (int i_134_ = 0; i_134_ < numVertices; i_134_++) {
				int i_135_ = verticesY[i_134_] * i_133_ - verticesZ[i_134_] * i_132_ >> 14;
				verticesZ[i_134_] = verticesY[i_134_] * i_132_ + verticesZ[i_134_] * i_133_ >> 14;
				verticesY[i_134_] = i_135_;
			}
		}
		if (i_126_ != 0) {
			int i_136_ = Class220.SINE[i_126_];
			int i_137_ = Class220.COSINE[i_126_];
			for (int i_138_ = 0; i_138_ < numVertices; i_138_++) {
				int i_139_ = verticesZ[i_138_] * i_136_ + verticesX[i_138_] * i_137_ >> 14;
				verticesZ[i_138_] = verticesZ[i_138_] * i_137_ - verticesX[i_138_] * i_136_ >> 14;
				verticesX[i_138_] = i_139_;
			}
		}
	}

	public void method755(int i) {
		for (int i_140_ = 0; i_140_ < numVertices; i_140_++) {
			verticesX[i_140_] <<= i;
			verticesY[i_140_] <<= i;
			verticesZ[i_140_] <<= i;
		}
		if (numTextures > 0 && textureScaleX != null) {
			for (int i_141_ = 0; i_141_ < textureScaleX.length; i_141_++) {
				textureScaleX[i_141_] <<= i;
				textureScaleY[i_141_] <<= i;
				if (texturesMappingType[i_141_] != 1) {
					textureScaleZ[i_141_] <<= i;
				}
			}
		}
	}

	public void method756(short i, short i_142_) {
		for (int i_143_ = 0; i_143_ < numFaces; i_143_++) {
			if (facesColour[i_143_] == i) {
				facesColour[i_143_] = i_142_;
			}
		}
	}

	public byte method757(short i, short i_144_, short i_145_, short i_146_, short i_147_, short i_148_, byte i_149_,
			byte i_150_, byte i_151_) {
		if (numTextures >= 255) {
			throw new IllegalStateException();
		}
		texturesMappingType[numTextures] = (byte) 3;
		texturesMappingP[numTextures] = i;
		texturesMappingM[numTextures] = i_144_;
		texturesMappingN[numTextures] = i_145_;
		textureScaleX[numTextures] = i_146_;
		textureScaleY[numTextures] = i_147_;
		textureScaleZ[numTextures] = i_148_;
		textureRotation[numTextures] = i_149_;
		textureDirection[numTextures] = i_150_;
		textureSpeed[numTextures] = i_151_;
		return (byte) numTextures++;
	}

	void decodeNew(byte[] is) {
		Packet class298_sub53 = new Packet(is);
		Packet class298_sub53_152_ = new Packet(is);
		Packet class298_sub53_153_ = new Packet(is);
		Packet class298_sub53_154_ = new Packet(is);
		Packet class298_sub53_155_ = new Packet(is);
		Packet class298_sub53_156_ = new Packet(is);
		Packet class298_sub53_157_ = new Packet(is);
		class298_sub53.pos = (is.length - 23) * 116413311;
		numVertices = class298_sub53.readUnsignedShort();
		numFaces = class298_sub53.readUnsignedShort();
		numTextures = class298_sub53.readUnsignedByte();
		int i = class298_sub53.readUnsignedByte();
		boolean bool = (i & 0x1) == 1;
		boolean bool_158_ = (i & 0x2) == 2;
		boolean bool_159_ = (i & 0x4) == 4;
		boolean bool_160_ = (i & 0x8) == 8;
		if (bool_160_) {
			class298_sub53.pos -= 814893177;
			version = class298_sub53.readUnsignedByte();
			class298_sub53.pos += 698479866;
		}
		int i_161_ = class298_sub53.readUnsignedByte();
		int i_162_ = class298_sub53.readUnsignedByte();
		int i_163_ = class298_sub53.readUnsignedByte();
		int i_164_ = class298_sub53.readUnsignedByte();
		int i_165_ = class298_sub53.readUnsignedByte();
		int i_166_ = class298_sub53.readUnsignedShort();
		int i_167_ = class298_sub53.readUnsignedShort();
		int i_168_ = class298_sub53.readUnsignedShort();
		int i_169_ = class298_sub53.readUnsignedShort();
		int i_170_ = class298_sub53.readUnsignedShort();
		int i_171_ = 0;
		int i_172_ = 0;
		int i_173_ = 0;
		if (numTextures > 0) {
			texturesMappingType = new byte[numTextures];
			class298_sub53.pos = 0;
			for (int i_174_ = 0; i_174_ < numTextures; i_174_++) {
				byte i_175_ = texturesMappingType[i_174_] = class298_sub53.readByte();
				if (i_175_ == 0) {
					i_171_++;
				}
				if (i_175_ >= 1 && i_175_ <= 3) {
					i_172_++;
				}
				if (i_175_ == 2) {
					i_173_++;
				}
			}
		}
		//System.out.println(.texture);
		int i_176_ = numTextures;
		int i_177_ = i_176_;
		i_176_ += numVertices;
		int i_178_ = i_176_;
		if (bool) {
			i_176_ += numFaces;
		}
		int i_179_ = i_176_;
		i_176_ += numFaces;
		int i_180_ = i_176_;
		if (i_161_ == 255) {
			i_176_ += numFaces;
		}
		int i_181_ = i_176_;
		if (i_163_ == 1) {
			i_176_ += numFaces;
		}
		int i_182_ = i_176_;
		if (i_165_ == 1) {
			i_176_ += numVertices;
		}
		int i_183_ = i_176_;
		if (i_162_ == 1) {
			i_176_ += numFaces;
		}
		int i_184_ = i_176_;
		i_176_ += i_169_;
		int i_185_ = i_176_;
		if (i_164_ == 1) {
			i_176_ += numFaces * 2;
		}
		int i_186_ = i_176_;
		i_176_ += i_170_;
		int i_187_ = i_176_;
		i_176_ += numFaces * 2;
		int i_188_ = i_176_;
		i_176_ += i_166_;
		int i_189_ = i_176_;
		i_176_ += i_167_;
		int i_190_ = i_176_;
		i_176_ += i_168_;
		int i_191_ = i_176_;
		i_176_ += i_171_ * 6;
		int i_192_ = i_176_;
		i_176_ += i_172_ * 6;
		int i_193_ = 6;
		if (version == 14) {
			i_193_ = 7;
		} else if (version >= 15) {
			i_193_ = 9;
		}
		int i_194_ = i_176_;
		i_176_ += i_172_ * i_193_;
		int i_195_ = i_176_;
		i_176_ += i_172_;
		int i_196_ = i_176_;
		i_176_ += i_172_;
		int i_197_ = i_176_;
		i_176_ += i_172_ + i_173_ * 2;
		int i_198_ = i_176_;
		verticesX = new int[numVertices];
		verticesY = new int[numVertices];
		verticesZ = new int[numVertices];
		facesA = new short[numFaces];
		facesB = new short[numFaces];
		facesC = new short[numFaces];
		if (i_165_ == 1) {
			verticesSkin = new int[numVertices];
		}
		if (bool) {
			facesType = new byte[numFaces];
		}
		if (i_161_ == 255) {
			facesPriority = new byte[numFaces];
		} else {
			priority = (byte) i_161_;
		}
		if (i_162_ == 1) {
			facesAlpha = new byte[numFaces];
		}
		if (i_163_ == 1) {
			facesSkin = new int[numFaces];
		}
		if (i_164_ == 1) {
			facesMaterial = new short[numFaces];
		}
		if (i_164_ == 1 && numTextures > 0) {
			facesTexture = new byte[numFaces];
		}
		facesColour = new short[numFaces];
		if (numTextures > 0) {
			texturesMappingP = new short[numTextures];
			texturesMappingM = new short[numTextures];
			texturesMappingN = new short[numTextures];
			if (i_172_ > 0) {
				textureScaleX = new int[i_172_];
				textureScaleY = new int[i_172_];
				textureScaleZ = new int[i_172_];
				textureRotation = new byte[i_172_];
				textureDirection = new byte[i_172_];
				textureSpeed = new int[i_172_];
			}
			if (i_173_ > 0) {
				textureTransU = new int[i_173_];
				textureTransV = new int[i_173_];
			}
		}
		class298_sub53.pos = i_177_ * 116413311;
		class298_sub53_152_.pos = i_188_ * 116413311;
		class298_sub53_153_.pos = i_189_ * 116413311;
		class298_sub53_154_.pos = i_190_ * 116413311;
		class298_sub53_155_.pos = i_182_ * 116413311;
		int i_199_ = 0;
		int i_200_ = 0;
		int i_201_ = 0;
		for (int i_202_ = 0; i_202_ < numVertices; i_202_++) {
			int i_203_ = class298_sub53.readUnsignedByte();
			int i_204_ = 0;
			if ((i_203_ & 0x1) != 0) {
				i_204_ = class298_sub53_152_.gSmart1or2s();
			}
			int i_205_ = 0;
			if ((i_203_ & 0x2) != 0) {
				i_205_ = class298_sub53_153_.gSmart1or2s();
			}
			int i_206_ = 0;
			if ((i_203_ & 0x4) != 0) {
				i_206_ = class298_sub53_154_.gSmart1or2s();
			}
			verticesX[i_202_] = i_199_ + i_204_;
			verticesY[i_202_] = i_200_ + i_205_;
			verticesZ[i_202_] = i_201_ + i_206_;
			i_199_ = verticesX[i_202_];
			i_200_ = verticesY[i_202_];
			i_201_ = verticesZ[i_202_];
			if (i_165_ == 1) {
				verticesSkin[i_202_] = class298_sub53_155_.readUnsignedByte();
			}
		}
		class298_sub53.pos = i_187_ * 116413311;
		class298_sub53_152_.pos = i_178_ * 116413311;
		class298_sub53_153_.pos = i_180_ * 116413311;
		class298_sub53_154_.pos = i_183_ * 116413311;
		class298_sub53_155_.pos = i_181_ * 116413311;
		class298_sub53_156_.pos = i_185_ * 116413311;
		class298_sub53_157_.pos = i_186_ * 116413311;
		for (int i_207_ = 0; i_207_ < numFaces; i_207_++) {
			facesColour[i_207_] = (short) class298_sub53.readUnsignedShort();
			if (bool) {
				facesType[i_207_] = class298_sub53_152_.readByte();
			}
			if (i_161_ == 255) {
				facesPriority[i_207_] = class298_sub53_153_.readByte();
			}
			if (i_162_ == 1) {
				facesAlpha[i_207_] = class298_sub53_154_.readByte();
			}
			if (i_163_ == 1) {
				facesSkin[i_207_] = class298_sub53_155_.readUnsignedByte();
			}
			if (i_164_ == 1) {
				facesMaterial[i_207_] = (short) (class298_sub53_156_.readUnsignedShort() - 1);
			}
			if (facesTexture != null) {
				if (facesMaterial[i_207_] != -1) {
					facesTexture[i_207_] = (byte) (class298_sub53_157_.readUnsignedByte() - 1);
				} else {
					facesTexture[i_207_] = (byte) -1;
				}
			}
		}
		highestFaceIndex = -1;
		class298_sub53.pos = i_184_ * 116413311;
		class298_sub53_152_.pos = i_179_ * 116413311;
		method744(class298_sub53, class298_sub53_152_);
		class298_sub53.pos = i_191_ * 116413311;
		class298_sub53_152_.pos = i_192_ * 116413311;
		class298_sub53_153_.pos = i_194_ * 116413311;
		class298_sub53_154_.pos = i_195_ * 116413311;
		class298_sub53_155_.pos = i_196_ * 116413311;
		class298_sub53_156_.pos = i_197_ * 116413311;
		method745(class298_sub53, class298_sub53_152_, class298_sub53_153_, class298_sub53_154_, class298_sub53_155_,
				class298_sub53_156_);
		class298_sub53.pos = i_198_ * 116413311;
		if (bool_158_) {
			int i_208_ = class298_sub53.readUnsignedByte();
			if (i_208_ > 0) {
				aClass85Array647 = new Class85[i_208_];
				for (int i_209_ = 0; i_209_ < i_208_; i_209_++) {
					int i_210_ = class298_sub53.readUnsignedShort();
					int i_211_ = class298_sub53.readUnsignedShort();
					byte i_212_;
					if (i_161_ == 255) {
						i_212_ = facesPriority[i_211_];
					} else {
						i_212_ = (byte) i_161_;
					}
					aClass85Array647[i_209_] = new Class85(i_210_, facesA[i_211_], facesB[i_211_], facesC[i_211_],
							i_212_);
				}
			}
			int i_213_ = class298_sub53.readUnsignedByte();
			if (i_213_ > 0) {
				aMagnetConfigArray613 = new MagnetConfig[i_213_];
				for (int i_214_ = 0; i_214_ < i_213_; i_214_++) {
					int i_215_ = class298_sub53.readUnsignedShort();
					int i_216_ = class298_sub53.readUnsignedShort();
					aMagnetConfigArray613[i_214_] = new MagnetConfig(i_215_, i_216_);
				}
			}
		}
		if (bool_159_) {
			int i_217_ = class298_sub53.readUnsignedByte();
			if (i_217_ > 0) {
				aVertexNormalArray649 = new VertexNormal[i_217_];
				for (int i_218_ = 0; i_218_ < i_217_; i_218_++) {
					int i_219_ = class298_sub53.readUnsignedShort();
					int i_220_ = class298_sub53.readUnsignedShort();
					int i_221_ = class298_sub53.readUnsignedByte();
					byte i_222_ = class298_sub53.readByte();
					aVertexNormalArray649[i_218_] = new VertexNormal(i_219_, i_220_, i_221_, i_222_);
				}
			}
		}
	}

	public int[][] method759() {
		int[] is = new int[256];
		int i = 0;
		for (VertexNormal element : aVertexNormalArray649) {
			int i_224_ = element.priority * -1606786303;
			if (i_224_ >= 0) {
				is[i_224_]++;
				if (i_224_ > i) {
					i = i_224_;
				}
			}
		}
		int[][] is_225_ = new int[i + 1][];
		for (int i_226_ = 0; i_226_ <= i; i_226_++) {
			is_225_[i_226_] = new int[is[i_226_]];
			is[i_226_] = 0;
		}
		for (int i_227_ = 0; i_227_ < aVertexNormalArray649.length; i_227_++) {
			int i_228_ = aVertexNormalArray649[i_227_].priority * -1606786303;
			if (i_228_ >= 0) {
				is_225_[i_228_][is[i_228_]++] = i_227_;
			}
		}
		return is_225_;
	}
}
