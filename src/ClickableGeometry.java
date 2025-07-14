/* Class351 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ClickableGeometry {
	int anInt3760;
	boolean aBoolean3761;
	Class302_Sub3_Sub1_Sub1[] aClass302_Sub3_Sub1_Sub1Array3762;
	int anInt3763;
	long aLong3764;
	Class69 aClass69_3765;
	List aList3766;
	int anInt3767;
	List aList3768;
	int anInt3769;
	boolean aBoolean3770;
	boolean aBoolean3771;
	public boolean aBoolean3772 = false;
	long aLong3773;
	static boolean[] aBooleanArray3774 = new boolean[32];
	static boolean[] aBooleanArray3775 = new boolean[8];

	ClickableGeometry(int i, boolean bool) {
		((ClickableGeometry) this).aBoolean3761 = false;
		((ClickableGeometry) this).anInt3763 = 0;
		((ClickableGeometry) this).aList3766 = new LinkedList();
		((ClickableGeometry) this).anInt3760 = 0;
		((ClickableGeometry) this).aList3768 = new LinkedList();
		((ClickableGeometry) this).anInt3769 = 0;
		((ClickableGeometry) this).aBoolean3770 = false;
		((ClickableGeometry) this).aBoolean3771 = false;
		((ClickableGeometry) this).aClass69_3765 = new Class69();
		((ClickableGeometry) this).aClass302_Sub3_Sub1_Sub1Array3762 = new Class302_Sub3_Sub1_Sub1[8192];
		method4219(i, bool);
	}

	void method4219(int i, boolean bool) {
		Class344.aList3683.add(this);
		((ClickableGeometry) this).aLong3773 = (long) i;
		((ClickableGeometry) this).aLong3764 = (long) i;
		((ClickableGeometry) this).aBoolean3770 = true;
		((ClickableGeometry) this).aBoolean3771 = bool;
	}

	public void method4220() {
		((ClickableGeometry) this).aBoolean3770 = true;
	}

	public void method4221() {
		((ClickableGeometry) this).aBoolean3761 = true;
	}

	boolean method4222(GraphicsToolkit class_ra, long l) {
		if (((ClickableGeometry) this).aLong3773 != ((ClickableGeometry) this).aLong3764)
			method4221();
		else
			method4230();
		if (l - ((ClickableGeometry) this).aLong3773 > 750L) {
			method4223();
			return false;
		}
		int i = (int) (l - ((ClickableGeometry) this).aLong3764);
		if (((ClickableGeometry) this).aBoolean3770) {
			Iterator iterator = ((ClickableGeometry) this).aList3766.iterator();
			while (iterator.hasNext()) {
				Class342 class342 = (Class342) iterator.next();
				for (int i_0_ = 0; i_0_ < (((Class342) class342).aClass182_3656.anInt1852 * 1095253617); i_0_++)
					class342.method4147(class_ra, l, 1, !((ClickableGeometry) this).aBoolean3761, (byte) 63);
			}
			((ClickableGeometry) this).aBoolean3770 = false;
		}
		Iterator iterator = ((ClickableGeometry) this).aList3766.iterator();
		while (iterator.hasNext()) {
			Class342 class342 = (Class342) iterator.next();
			class342.method4147(class_ra, l, i, !((ClickableGeometry) this).aBoolean3761, (byte) 45);
		}
		((ClickableGeometry) this).aLong3764 = l;
		return true;
	}

	void method4223() {
		aBoolean3772 = true;
		Iterator iterator = ((ClickableGeometry) this).aList3768.iterator();
		while (iterator.hasNext()) {
			Class298_Sub45 class298_sub45 = (Class298_Sub45) iterator.next();
			if ((((Class298_Sub45) class298_sub45).aMagnetDefinitions_7514.anInt1940 * -1955592777) == 1)
				class298_sub45.unlink(-1460969981);
		}
		for (int i = 0; i < ((ClickableGeometry) this).aClass302_Sub3_Sub1_Sub1Array3762.length; i++) {
			if (((ClickableGeometry) this).aClass302_Sub3_Sub1_Sub1Array3762[i] != null) {
				((ClickableGeometry) this).aClass302_Sub3_Sub1_Sub1Array3762[i].method3726();
				((ClickableGeometry) this).aClass302_Sub3_Sub1_Sub1Array3762[i] = null;
			}
		}
		((ClickableGeometry) this).anInt3763 = 0;
		((ClickableGeometry) this).aList3766 = new LinkedList();
		((ClickableGeometry) this).anInt3760 = 0;
		((ClickableGeometry) this).aList3768 = new LinkedList();
		((ClickableGeometry) this).anInt3769 = 0;
	}

	void method4224(GraphicsToolkit class_ra, Class85[] class85s, boolean bool) {
		for (int i = 0; i < 32; i++)
			aBooleanArray3774[i] = false;
		Iterator iterator = ((ClickableGeometry) this).aList3766.iterator();
		while_84_: while (iterator.hasNext()) {
			Class342 class342 = (Class342) iterator.next();
			if (class85s != null) {
				for (int i = 0; i < class85s.length; i++) {
					if (((Class342) class342).aClass85_3662 == class85s[i] || (((Class342) class342).aClass85_3662 == class85s[i].aClass85_776)) {
						aBooleanArray3774[i] = true;
						class342.method4146((byte) -40);
						((Class342) class342).aBoolean3664 = false;
						continue while_84_;
					}
				}
			}
			if (!bool) {
				if (((Class342) class342).anInt3652 * -917784967 == 0) {
					iterator.remove();
					((ClickableGeometry) this).anInt3760--;
				} else
					((Class342) class342).aBoolean3664 = true;
			}
		}
		if (class85s != null) {
			for (int i = 0; (i < class85s.length && i != 32 && ((ClickableGeometry) this).anInt3760 != 32); i++) {
				if (!aBooleanArray3774[i]) {
					Class342 class342 = new Class342(class_ra, class85s[i], this, ((ClickableGeometry) this).aLong3773);
					((ClickableGeometry) this).aList3766.add(class342);
					((ClickableGeometry) this).anInt3760++;
					aBooleanArray3774[i] = true;
				}
			}
		}
	}

	void method4225(MagnetConfig[] magnetConfigs, boolean bool) {
		for (int i = 0; i < 8; i++)
			aBooleanArray3775[i] = false;
		Iterator iterator = ((ClickableGeometry) this).aList3768.iterator();
		while_85_: while (iterator.hasNext()) {
			Class298_Sub45 class298_sub45 = (Class298_Sub45) iterator.next();
			if (magnetConfigs != null) {
				for (int i = 0; i < magnetConfigs.length; i++) {
					if ((((Class298_Sub45) class298_sub45).aMagnetConfig_7518 == magnetConfigs[i]) || (((Class298_Sub45) class298_sub45).aMagnetConfig_7518 == magnetConfigs[i].aMagnetConfig_672)) {
						aBooleanArray3775[i] = true;
						class298_sub45.method3532(-219401060);
						continue while_85_;
					}
				}
			}
			if (!bool) {
				class298_sub45.unlink(-1460969981);
				((ClickableGeometry) this).anInt3769--;
				if (class298_sub45.method2840(-629325116)) {
					class298_sub45.unlink(-1460969981);
					Class344.anInt3685 -= 817588661;
				}
			}
		}
		if (magnetConfigs != null) {
			for (int i = 0; (i < magnetConfigs.length && i != 8 && ((ClickableGeometry) this).anInt3769 != 8); i++) {
				if (!aBooleanArray3775[i]) {
					Class298_Sub45 class298_sub45 = null;
					if ((magnetConfigs[i].method775((byte) 3).anInt1940 * -1955592777) == 1 && Class344.anInt3685 * -1237648227 < 32) {
						class298_sub45 = new Class298_Sub45(magnetConfigs[i], this);
						Class344.aClass437_3684.method5817(class298_sub45, (long) (magnetConfigs[i].anInt673 * 617796067));
						Class344.anInt3685 += 817588661;
					}
					if (class298_sub45 == null)
						class298_sub45 = new Class298_Sub45(magnetConfigs[i], this);
					((ClickableGeometry) this).aList3768.add(class298_sub45);
					((ClickableGeometry) this).anInt3769++;
					aBooleanArray3775[i] = true;
				}
			}
		}
	}

	public Class69 method4226() {
		((ClickableGeometry) this).aClass69_3765.aClass448_680.method5907(198538836);
		for (int i = 0; i < ((ClickableGeometry) this).aClass302_Sub3_Sub1_Sub1Array3762.length; i++) {
			if (((ClickableGeometry) this).aClass302_Sub3_Sub1_Sub1Array3762[i] != null && (((Class302_Sub3_Sub1_Sub1) ((ClickableGeometry) this).aClass302_Sub3_Sub1_Sub1Array3762[i]).aClass342_10037) != null)
				((ClickableGeometry) this).aClass69_3765.aClass448_680.method5908(((ClickableGeometry) this).aClass302_Sub3_Sub1_Sub1Array3762[i], (byte) -89);
		}
		return ((ClickableGeometry) this).aClass69_3765;
	}

	public void method4227(int i, int i_1_, int i_2_, int i_3_, int i_4_) {
		((ClickableGeometry) this).anInt3767 = i;
	}

	void method4228(SceneGraph sceneGraph, GraphicsToolkit class_ra) {
		((ClickableGeometry) this).aClass69_3765.aClass448_680.method5907(-1313547025);
		Iterator iterator = ((ClickableGeometry) this).aList3766.iterator();
		while (iterator.hasNext()) {
			Class342 class342 = (Class342) iterator.next();
			class342.method4148(sceneGraph, class_ra, ((ClickableGeometry) this).aLong3764);
		}
	}

	public Class69 method4229() {
		return ((ClickableGeometry) this).aClass69_3765;
	}

	void method4230() {
		((ClickableGeometry) this).aBoolean3761 = false;
	}

	public void method4231(GraphicsToolkit class_ra, long l, Class85[] class85s, MagnetConfig[] magnetConfigs, boolean bool) {
		if (!aBoolean3772) {
			method4224(class_ra, class85s, bool);
			method4225(magnetConfigs, bool);
			((ClickableGeometry) this).aLong3773 = l;
		}
	}

	public static ClickableGeometry method4232(int i, boolean bool) {
		if (Class344.anInt3681 * -1264407527 != Class344.anInt3680 * 274948937) {
			ClickableGeometry clickableGeometry = Class344.aClickableGeometryArray3679[Class344.anInt3680 * 274948937];
			Class344.anInt3680 = ((Class344.anInt3680 * 274948937 + 1 & Class65.anIntArray658[Class344.anInt3675 * 1197525581]) * 172162809);
			clickableGeometry.method4219(i, bool);
			return clickableGeometry;
		}
		return new ClickableGeometry(i, bool);
	}

	public void method4233(long l) {
		((ClickableGeometry) this).aLong3773 = l;
	}
}
