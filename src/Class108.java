public class Class108
{
  public String aString1316;
  public String aString1317;
  public String aString1318;
  public TimeUtils[] aTimeUtilsArray1319;
  public TimeUtils[] aTimeUtilsArray1320;
  public static int anInt1321;
  
  void method1145(Class101 class101, byte i)
  {
    try
    {
      this.aString1317 = class101.method1079(1509343502);
      this.aString1316 = class101.method1079(1509343502);
      this.aString1318 = class101.method1079(1509343502);
      int i_0_ = class101.method1080(823123769);
      int i_1_ = class101.method1080(-1396708449);
      this.aTimeUtilsArray1319 = (i_0_ == 0 ? null : new TimeUtils[i_0_]);
      this.aTimeUtilsArray1320 = (i_1_ == 0 ? null : new TimeUtils[i_1_]);
      for (int i_2_ = 0; i_2_ < i_0_; i_2_++)
      {
        this.aTimeUtilsArray1319[i_2_] = new TimeUtils();
        this.aTimeUtilsArray1319[i_2_].method1317(class101, 1424483545);
      }
      for (int i_3_ = 0; i_3_ < i_1_; i_3_++)
      {
        this.aTimeUtilsArray1320[i_3_] = new TimeUtils();
        this.aTimeUtilsArray1320[i_3_].method1317(class101, 1424483545);
      }
    }
    catch (RuntimeException runtimeexception)
    {
      throw ErrorContext.info(runtimeexception, "ek.a(" + ')');
    }
  }
  
  public static void method1146(Js5 class243, int i)
  {
    try
    {
      Class287.aClass243_3100 = class243;
    }
    catch (RuntimeException runtimeexception)
    {
      throw ErrorContext.info(runtimeexception, "ek.a(" + ')');
    }
  }
  
  static final void method1147(ClientScript2 class403, int i)
  {
    try
    {
      class403.anIntArray5244[((class403.anInt5239 += -391880689) * 681479919 - 1)] = (GameClient.aBoolean8640 ? 1 : 0);
    }
    catch (RuntimeException runtimeexception)
    {
      throw ErrorContext.info(runtimeexception, "ek.abd(" + ')');
    }
  }
  
  static final void method1148(ClientScript2 class403, int i)
  {
    try
    {
      int i_4_ = class403.anIntArray5244[((class403.anInt5239 -= -391880689) * 681479919)];
      IComponentDefinition class105 = Class50.getIComponentDefinitions(i_4_, (byte)70);
      RSInterface RSInterface = SpotAnimTypeList.aRSInterfaceArray4165[(i_4_ >> 16)];
      Class21.method365(class105, RSInterface, false, 1, class403, 233594133);
    }
    catch (RuntimeException runtimeexception)
    {
      throw ErrorContext.info(runtimeexception, "ek.he(" + ')');
    }
  }
  
  static String method1149(int i, Language language, int i_5_)
  {
    try
    {
      if (i < 100000) {
        return "<col=ffff00>" + i + "</col>";
      }
      if (i < 10000000) {
        return "<col=ffffff>" + i / 1000 + LocalizedString.LABEL_SHORT_K_ALT.getText(language, -875414210) + "</col>";
      }
      return "<col=00ff80>" + i / 1000000 + LocalizedString.LABEL_SHORT_M_ALT.getText(language, -875414210) + "</col>";
    }
    catch (RuntimeException runtimeexception)
    {
      throw ErrorContext.info(runtimeexception, "ek.n(" + ')');
    }
  }
  
  public static final void method1150(boolean bool, byte i)
  {
    try
    {
      Class298_Sub36 class298_sub36 = Class18.method359(OutgoingPacket.CLOSE_INTERFACE_PACKET, GameClient.gameConnection.aClass449_330, (byte)111);
      GameClient.gameConnection.writeOutboundPacket(class298_sub36, (byte)-21);
      for (Interface class298_sub51 = (Interface) GameClient.aClass437_8841.method5816(1892786919); class298_sub51 != null; class298_sub51 = (Interface) GameClient.aClass437_8841.method5815((byte)-93))
      {
        if (!class298_sub51.method2840(-629325116))
        {
          class298_sub51 = (Interface) GameClient.aClass437_8841.method5816(1676096674);
          if (class298_sub51 == null) {
            break;
          }
        }
        if (class298_sub51.clipped * 27137839 == 0) {
          Class173.method1821(class298_sub51, true, bool, -113822480);
        }
      }
      if (GameClient.aClass105_8652 != null)
      {
        LocalizedString.markComponentForRedraw(GameClient.aClass105_8652, -1209330591);
        GameClient.aClass105_8652 = null;
      }
    }
    catch (RuntimeException runtimeexception)
    {
      throw ErrorContext.info(runtimeexception, "ek.lr(" + ')');
    }
  }
  
  static final void method1151(ClientScript2 class403, int i)
  {
    try
    {
      if ((MagnetConfig.aShortArray678 == null) || (Class242.anInt2709 * -316347407 >= Class344.anInt3688 * 367592105)) {
        class403.anIntArray5244[((class403.anInt5239 += -391880689) * 681479919 - 1)] = -1;
      } else {
        class403.anIntArray5244[((class403.anInt5239 += -391880689) * 681479919 - 1)] = (MagnetConfig.aShortArray678[((Class242.anInt2709 = Class242.anInt2709 + 1578804497) * -316347407 - 1)] & 0xFFFF);
      }
    }
    catch (RuntimeException runtimeexception)
    {
      throw ErrorContext.info(runtimeexception, "ek.abw(" + ')');
    }
  }
  
  static void method1152(int i, int i_6_, int i_7_)
  {
    try
    {
      Class298_Sub37_Sub12 class298_sub37_sub12 = Class410.method4985(14, i);
      class298_sub37_sub12.method3449((byte)25);
      class298_sub37_sub12.anInt9610 = (1274450087 * i_6_);
    }
    catch (RuntimeException runtimeexception)
    {
      throw ErrorContext.info(runtimeexception, "ek.ag(" + ')');
    }
  }
  
  static void method1153(int i, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_)
  {
    try
    {
      int i_13_ = 0;
      int i_14_ = i_10_;
      int i_15_ = i_9_ * i_9_;
      int i_16_ = i_10_ * i_10_;
      int i_17_ = i_16_ << 1;
      int i_18_ = i_15_ << 1;
      int i_19_ = i_10_ << 1;
      int i_20_ = i_17_ + (1 - i_19_) * i_15_;
      int i_21_ = i_16_ - (i_19_ - 1) * i_18_;
      int i_22_ = i_15_ << 2;
      int i_23_ = i_16_ << 2;
      int i_24_ = i_17_ * (3 + (i_13_ << 1));
      int i_25_ = ((i_14_ << 1) - 3) * i_18_;
      int i_26_ = (1 + i_13_) * i_23_;
      int i_27_ = i_22_ * (i_14_ - 1);
      Class82_Sub22.method940(Class372_Sub1_Sub1.anIntArrayArray4047[i_8_], i - i_9_, i_9_ + i, i_11_, -2115360638);
      while (i_14_ > 0)
      {
        if (i_20_ < 0) {
          while (i_20_ < 0)
          {
            i_20_ += i_24_;
            i_21_ += i_26_;
            i_24_ += i_23_;
            i_26_ += i_23_;
            i_13_++;
          }
        }
        if (i_21_ < 0)
        {
          i_20_ += i_24_;
          i_21_ += i_26_;
          i_24_ += i_23_;
          i_26_ += i_23_;
          i_13_++;
        }
        i_20_ += -i_27_;
        i_21_ += -i_25_;
        i_25_ -= i_22_;
        i_27_ -= i_22_;
        i_14_--;
        int i_28_ = i_8_ - i_14_;
        int i_29_ = i_8_ + i_14_;
        int i_30_ = i_13_ + i;
        int i_31_ = i - i_13_;
        Class82_Sub22.method940(Class372_Sub1_Sub1.anIntArrayArray4047[i_28_], i_31_, i_30_, i_11_, 756505397);
        Class82_Sub22.method940(Class372_Sub1_Sub1.anIntArrayArray4047[i_29_], i_31_, i_30_, i_11_, 931363895);
      }
    }
    catch (RuntimeException runtimeexception)
    {
      throw ErrorContext.info(runtimeexception, "ek.at(" + ')');
    }
  }
}
