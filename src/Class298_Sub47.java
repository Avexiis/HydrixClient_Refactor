/* Class298_Sub47 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Class298_Sub47 extends Node {
	int[] anIntArray7535;
	int[] anIntArray7536;
	int[] anIntArray7537;
	int anInt7538;
	Field[] aFieldArray7539;
	byte[][][] aByteArrayArrayArray7540;
	Method[] aMethodArray7541;
	int anInt7542;

	Class298_Sub47() {
		/* empty */
	}

	static void method3535(Player class365_sub1_sub1_sub2_sub2, boolean bool, int i) {
		try {
			if (-278777595 * ContextMenu.actionCount < 410) {
				if (class365_sub1_sub1_sub2_sub2 == Class287.myPlayer) {
					if (GameClient.aBoolean8835 && (Node.anInt3192 * -112110875 & 0x10) != 0)
						Class234.method2174(GameClient.aString8838, new StringBuilder().append(GameClient.aString8754).append(" ").append(Class26.aString351).append(" ").append(Class285.method2709(16777215, -1880818524)).append(LocalizedString.LABEL_SELF.getText(Class321.ACTIVE_LANGUAGE, -875414210)).toString(), MapDecoder.anInt2704 * 697885143, 16, -1, 0L, 0, 0, true, false, (long) (1888274983 * (class365_sub1_sub1_sub2_sub2.entityIndex)), false, -1698066743);
				} else {
					String string;
					if (class365_sub1_sub1_sub2_sub2.currentHitpoints * 242930343 == 0) {
						boolean bool_0_ = true;
						if (-1 != (Class287.myPlayer.animationDelay) * 1792775047 && -1 != 1792775047 * (class365_sub1_sub1_sub2_sub2.animationDelay)) {
							int i_1_ = (((1792775047 * (Class287.myPlayer.animationDelay)) < (class365_sub1_sub1_sub2_sub2.animationDelay * 1792775047)) ? (1792775047 * (Class287.myPlayer.animationDelay)) : (class365_sub1_sub1_sub2_sub2.animationDelay * 1792775047));
							int i_2_ = ((696798311 * (Class287.myPlayer.maxHitpoints)) - 696798311 * (class365_sub1_sub1_sub2_sub2.maxHitpoints));
							if (i_2_ < 0)
								i_2_ = -i_2_;
							if (i_2_ > i_1_)
								bool_0_ = false;
						}
						String string_3_ = (GameClient.aGameContext_8944 == GameContext.stellar_dawn ? (LocalizedString.LABEL_RATING_PREFIX.getText(Class321.ACTIVE_LANGUAGE, -875414210)) : (LocalizedString.LABEL_LEVEL_PREFIX.getText(Class321.ACTIVE_LANGUAGE, -875414210)));
						if (class365_sub1_sub1_sub2_sub2.maxHitpoints * 696798311 >= (class365_sub1_sub1_sub2_sub2.turnAnimation * 1868645317))
							string = new StringBuilder().append(class365_sub1_sub1_sub2_sub2.getFullName(true, -1760788524)).append(bool_0_ ? (Class18.method358((class365_sub1_sub1_sub2_sub2.maxHitpoints) * 696798311, (696798311 * (Class287.myPlayer.maxHitpoints)), (byte) 4)) : Class285.method2709(16777215, -1771684039)).append(Class26.aString349).append(string_3_).append(class365_sub1_sub1_sub2_sub2.maxHitpoints * 696798311).append(Class26.aString352).toString();
						else
							string = new StringBuilder().append(class365_sub1_sub1_sub2_sub2.getFullName(true, -2010483537)).append(bool_0_ ? (Class18.method358((class365_sub1_sub1_sub2_sub2.maxHitpoints) * 696798311, (696798311 * (Class287.myPlayer.maxHitpoints)), (byte) 4)) : Class285.method2709(16777215, -1929125845)).append(Class26.aString349).append(string_3_).append(696798311 * (class365_sub1_sub1_sub2_sub2.maxHitpoints)).append("+").append((1868645317 * (class365_sub1_sub1_sub2_sub2.turnAnimation)) - (class365_sub1_sub1_sub2_sub2.maxHitpoints) * 696798311).append(Class26.aString352).toString();
					} else if (-1 == (class365_sub1_sub1_sub2_sub2.currentHitpoints * 242930343))
						string = class365_sub1_sub1_sub2_sub2.getFullName(true, -1641888806);
					else
						string = new StringBuilder().append(class365_sub1_sub1_sub2_sub2.getFullName(true, -2028633086)).append(Class26.aString349).append(LocalizedString.LABEL_SKILL_PREFIX.getText(Class321.ACTIVE_LANGUAGE, -875414210)).append(242930343 * (class365_sub1_sub1_sub2_sub2.currentHitpoints)).append(Class26.aString352).toString();
					if (GameClient.aBoolean8835 && !bool && (-112110875 * Node.anInt3192 & 0x8) != 0)
						Class234.method2174(GameClient.aString8838, new StringBuilder().append(GameClient.aString8754).append(" ").append(Class26.aString351).append(" ").append(Class285.method2709(16777215, -1806308451)).append(string).toString(), 697885143 * MapDecoder.anInt2704, 15, -1, (long) (1888274983 * (class365_sub1_sub1_sub2_sub2.entityIndex)), 0, 0, true, false, (long) (1888274983 * (class365_sub1_sub1_sub2_sub2.entityIndex)), false, -2028889244);
					if (!bool) {
						for (int i_4_ = 7; i_4_ >= 0; i_4_--) {
							if (GameClient.aStringArray8820[i_4_] != null) {
								short i_5_ = 0;
								if ((GameClient.aGameContext_8944 == GameContext.aGameContext_5320) && (GameClient.aStringArray8820[i_4_].equalsIgnoreCase(LocalizedString.BUTTON_ATTACK.getText(Class321.ACTIVE_LANGUAGE, -875414210)))) {
									if (GameClient.aBoolean8815 && ((class365_sub1_sub1_sub2_sub2.maxHitpoints) * 696798311 > (Class287.myPlayer.maxHitpoints) * 696798311))
										i_5_ = (short) 2000;
									if ((0 != (Class287.myPlayer.teamId) * -1473655357) && (-1473655357 * (class365_sub1_sub1_sub2_sub2.teamId)) != 0) {
										if ((class365_sub1_sub1_sub2_sub2.teamId) * -1473655357 == (Class287.myPlayer.teamId) * -1473655357)
											i_5_ = (short) 2000;
										else
											i_5_ = (short) 0;
									} else if (class365_sub1_sub1_sub2_sub2.isInCombat)
										i_5_ = (short) 2000;
								} else if (GameClient.aBooleanArray8821[i_4_])
									i_5_ = (short) 2000;
								short i_6_ = (short) (i_5_ + GameClient.aShortArray8818[i_4_]);
								int i_7_ = (-1 != GameClient.anIntArray8904[i_4_] ? GameClient.anIntArray8904[i_4_] : GameClient.anInt8690 * 1395924385);
								Class234.method2174(GameClient.aStringArray8820[i_4_], new StringBuilder().append(Class285.method2709(16777215, -1822012281)).append(string).toString(), i_7_, i_6_, -1, (long) (1888274983 * (class365_sub1_sub1_sub2_sub2.entityIndex)), 0, 0, true, false, (long) ((class365_sub1_sub1_sub2_sub2.entityIndex) * 1888274983), false, -1451194858);
							}
						}
					} else
						Class234.method2174(new StringBuilder().append(Class285.method2709(13421772, -1997294576)).append(string).toString(), "", -1, -1, 0, 0L, 0, 0, false, true, (long) (class365_sub1_sub1_sub2_sub2.entityIndex * 1888274983), false, -1271989822);
					if (!bool) {
						for (Class298_Sub37_Sub15 class298_sub37_sub15 = ((Class298_Sub37_Sub15) ContextMenu.aLinkedNodeList_5480.method5939(1766612795)); class298_sub37_sub15 != null; class298_sub37_sub15 = ((Class298_Sub37_Sub15) ContextMenu.aLinkedNodeList_5480.method5944(49146))) {
							if (23 == 946432351 * (((Class298_Sub37_Sub15) class298_sub37_sub15).anInt9662)) {
								((Class298_Sub37_Sub15) class298_sub37_sub15).aString9669 = new StringBuilder().append(Class285.method2709(16777215, -1702215598)).append(string).toString();
								break;
							}
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("acj.bk(").append(')').toString());
		}
	}
}
