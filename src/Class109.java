import java.io.File;

public class Class109
{
  static int anInt1322 = 4;
  Class114[] aClass114Array1323;
  static int anInt1324 = 256;
  String aString1325;
  Class114[] aClass114Array1326;
  Class108[] aClass108Array1327;
  static int anInt1328 = 2;
  
  void method1154(byte[] is, int i)
    throws Exception_Sub3
  {
    try
    {
      Class101 class101 = new Class101(is);
      int i_0_ = class101.method1080(1157029171);
      if (i_0_ != 4) {
        throw new Exception_Sub3(this, i_0_, 4);
      }
      this.aString1325 = class101.method1079(1509343502);
      this.aClass114Array1323 = new Class114[class101.method1080(725581167)];
      this.aClass114Array1326 = new Class114[class101.method1080(1366230292)];
      this.aClass108Array1327 = new Class108[class101.method1080(594275655)];
      for (int i_1_ = 0; i_1_ < this.aClass114Array1323.length; i_1_++)
      {
        this.aClass114Array1323[i_1_] = new Class114();
        this.aClass114Array1323[i_1_].method1256(class101, (byte)107);
      }
      for (int i_2_ = 0; i_2_ < this.aClass114Array1326.length; i_2_++)
      {
        this.aClass114Array1326[i_2_] = new Class114();
        this.aClass114Array1326[i_2_].method1256(class101, (byte)107);
      }
      for (int i_3_ = 0; i_3_ < this.aClass108Array1327.length; i_3_++)
      {
        this.aClass108Array1327[i_3_] = new Class108();
        this.aClass108Array1327[i_3_].method1145(class101, (byte)-15);
      }
    }
    catch (RuntimeException runtimeexception)
    {
      throw ErrorContext.info(runtimeexception, "el.a(" + ')');
    }
  }
  
  public Class109(byte[] is)
    throws Exception_Sub3
  {
    method1154(is, 1575472907);
  }
  
  static final void method1155(ClientScript2 class403, int i)
  {
    try
    {
      String string = (String)class403.anObjectArray5240[((class403.anInt5241 -= 969361751) * -203050393)];
      boolean bool = Atmosphere.gameClientInstance.method2754(new File(string), -714101418);
      class403.anIntArray5244[((class403.anInt5239 += -391880689) * 681479919 - 1)] = (bool ? 1 : 0);
    }
    catch (RuntimeException runtimeexception)
    {
      throw ErrorContext.info(runtimeexception, "el.agp(" + ')');
    }
  }
  
  static final void method1156(ClientScript2 class403, byte i)
  {
    try
    {
      class403.anIntArray5244[((class403.anInt5239 += -391880689) * 681479919 - 1)] = GraphicsAutoSetup.clientPreferences.aClass422_Sub19_7567.getValue(-1741518508);
    }
    catch (RuntimeException runtimeexception)
    {
      throw ErrorContext.info(runtimeexception, "el.aks(" + ')');
    }
  }
  
  static final void method1157(ClientScript2 class403, int i)
  {
    try
    {
      int i_4_ = Class287.myPlayer.plane;
      SceneObjectPosition sceneObjectPosition = Class287.myPlayer.method4337().aSceneObjectPosition_2599;
      WorldTile worldTile = GameClient.map.getRegionStart(681479919);
      int i_5_ = ((int) sceneObjectPosition.x >> 9) + -1760580017 * worldTile.x;
      int i_6_ = ((int) sceneObjectPosition.z >> 9) + 283514611 * worldTile.y;
      class403.anIntArray5244[((class403.anInt5239 += -391880689) * 681479919 - 1)] = ((i_5_ << 14) + (i_4_ << 28) + i_6_);
    }
    catch (RuntimeException runtimeexception)
    {
      throw ErrorContext.info(runtimeexception, "el.tt(" + ')');
    }
  }
}
