/* Class299 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;
import java.util.LinkedList;

public class Class299 {
	int anInt3193;
	int[] anIntArray3194;
	int anInt3195;
	int[] anIntArray3196;
	static int anInt3197 = 0;
	LinkedList aLinkedList3198;
	public static ClanSettings aClanSettings_3199;

	public Class299(GraphicsToolkit class_ra, Packet class298_sub53, int i) {
		((Class299) this).anInt3195 = -1657032745 * i;
		((Class299) this).anInt3193 = class298_sub53.gSmart1or2s() * -1823687737;
		((Class299) this).anIntArray3194 = new int[-755722761 * ((Class299) this).anInt3193];
		((Class299) this).anIntArray3196 = new int[((Class299) this).anInt3193 * -755722761];
		int i_0_ = class298_sub53.readUnsignedShort();
		int i_1_ = class298_sub53.readUnsignedShort();
		for (int i_2_ = 0; i_2_ < ((Class299) this).anInt3193 * -755722761; i_2_++) {
			((Class299) this).anIntArray3194[i_2_] = i_0_ + class298_sub53.readByte();
			((Class299) this).anIntArray3196[i_2_] = i_1_ + class298_sub53.readByte();
		}
		method3679(class_ra, 1723870683);
	}

	public void method3676(SceneGraph sceneGraph, int i) {
		try {
			if (null != sceneGraph && ((Class299) this).anInt3193 * -755722761 > 0) {
				method3678(sceneGraph, 1331512364);
				Iterator iterator = ((Class299) this).aLinkedList3198.iterator();
				while (iterator.hasNext()) {
					Class365_Sub1_Sub1_Sub4 class365_sub1_sub1_sub4 = (Class365_Sub1_Sub1_Sub4) iterator.next();
					sceneGraph.method4022(class365_sub1_sub1_sub4, false, (byte) 0);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ml.f(").append(')').toString());
		}
	}

	public void method3677(SceneGraph sceneGraph, int i) {
		try {
			if (null != sceneGraph && null != ((Class299) this).aLinkedList3198) {
				Iterator iterator = ((Class299) this).aLinkedList3198.iterator();
				while (iterator.hasNext()) {
					Class365_Sub1_Sub1_Sub4 class365_sub1_sub1_sub4 = (Class365_Sub1_Sub1_Sub4) iterator.next();
					sceneGraph.method4028(class365_sub1_sub1_sub4.plane, class365_sub1_sub1_sub4.aShort9798, class365_sub1_sub1_sub4.aShort9795, new Class310(class365_sub1_sub1_sub4), (short) -25645);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ml.b(").append(')').toString());
		}
	}

	void method3678(SceneGraph sceneGraph, int i) {
		try {
			((Class299) this).aLinkedList3198 = new LinkedList();
			TileFlags tileFlags = GameClient.map.method2654(1102233653);
			WorldTile worldTile = GameClient.map.getRegionStart(681479919);
			WorldTile worldTile_3_ = new WorldTile(1855729883 * Class99.anInt952, ((Class299) this).anIntArray3194[0], ((Class299) this).anIntArray3196[0]);
			for (int i_4_ = 1; i_4_ < ((Class299) this).anInt3193 * -755722761; i_4_++) {
				WorldTile worldTile_5_ = new WorldTile(1855729883 * Class99.anInt952, ((Class299) this).anIntArray3194[i_4_], ((Class299) this).anIntArray3196[i_4_]);
				while ((worldTile_3_.x * -1760580017 != worldTile_5_.x * -1760580017) || (worldTile_5_.y * 283514611 != 283514611 * worldTile_3_.y)) {
					if (-1760580017 * worldTile_3_.x < worldTile_5_.x * -1760580017)
						worldTile_3_.x += 2061281455;
					else if (-1760580017 * worldTile_3_.x > worldTile_5_.x * -1760580017)
						worldTile_3_.x -= 2061281455;
					if (worldTile_3_.y * 283514611 < worldTile_5_.y * 283514611)
						worldTile_3_.y += 1901982267;
					else if (283514611 * worldTile_3_.y > worldTile_5_.y * 283514611)
						worldTile_3_.y -= 1901982267;
					int i_6_ = 1855729883 * Class99.anInt952;
					int i_7_ = (worldTile_3_.x * -1760580017 - -1760580017 * worldTile.x);
					int i_8_ = (worldTile_3_.y * 283514611 - worldTile.y * 283514611);
					if (i_7_ >= 0 && i_7_ < sceneGraph.anInt3514 * 1988988347 && i_8_ >= 0 && i_8_ < sceneGraph.anInt3549 * 1340714547) {
						int i_9_ = 256 + (i_7_ << 9);
						int i_10_ = (i_8_ << 9) + 256;
						if (tileFlags.method2320(i_7_, i_8_, 1621681169))
							i_6_++;
						((Class299) this).aLinkedList3198.add(new Class365_Sub1_Sub1_Sub4(sceneGraph, this, Class99.anInt952 * 1855729883, i_6_, i_9_, Class356.method4271(i_9_, i_10_, (1855729883 * Class99.anInt952), -969266952), i_10_));
					}
				}
				worldTile_3_ = worldTile_5_;
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ml.p(").append(')').toString());
		}
	}

	ModelPart method3679(GraphicsToolkit class_ra, int i) {
		try {
			Model class64 = Model.method751(WorldTile.js5_models, -1002982425 * ((Class299) this).anInt3195, 0);
			if (class64 == null)
				return null;
			if (class64.version < 13)
				class64.method755(2);
			return class_ra.method5037(class64, 2048, anInt3197 * 598483091, 64, 768);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ml.a(").append(')').toString());
		}
	}

	public static Class274[] method3680(int i) {
		try {
			return (new Class274[] { Class274.aClass274_6534, Class274.aClass274_6531, Class274.aClass274_6537, Class274.aClass274_6530, Class274.aClass274_6529, Class274.aClass274_6536, Class274.aClass274_6535, Class274.aClass274_6532 });
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ml.a(").append(')').toString());
		}
	}

	static final void method3681(ClientScript2 class403, int i) {
		try {
			int i_11_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_11_, (byte) 16);
			RSInterface RSInterface = SpotAnimTypeList.aRSInterfaceArray4165[i_11_ >> 16];
			MapDecoder.method2230(class105, RSInterface, class403, -1468199503);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ml.jt(").append(')').toString());
		}
	}

	public static boolean method3682(int i, int i_12_) {
		try {
			return 14 == i || 15 == i || i == 18 || i == 16;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ml.fv(").append(')').toString());
		}
	}
}
