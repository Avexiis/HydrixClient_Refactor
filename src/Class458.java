public class Class458
{
  public Node aNode_5668 = new Node();
  Node aNode_5669;
  
  public Node method5964(int i)
  {
    try
    {
      Node node = this.aNode_5668.aNode_3189;
      if (node == this.aNode_5668)
      {
        this.aNode_5669 = null;
        return null;
      }
      this.aNode_5669 = node.aNode_3189;
      return node;
    }
    catch (RuntimeException runtimeexception)
    {
      throw ErrorContext.info(runtimeexception, "sw.d(" + ')');
    }
  }
  
  public void method5965(Node node, int i)
  {
    try
    {
      if (node.aNode_3189 != null) {
        node.unlink(-1460969981);
      }
      node.aNode_3189 = this.aNode_5668;
      node.aNode_3187 = this.aNode_5668.aNode_3187;
      node.aNode_3189.aNode_3187 = node;
      node.aNode_3187.aNode_3189 = node;
    }
    catch (RuntimeException runtimeexception)
    {
      throw ErrorContext.info(runtimeexception, "sw.b(" + ')');
    }
  }
  
  public Node method5966(byte i)
  {
    try
    {
      Node node = this.aNode_5669;
      if (this.aNode_5668 == node)
      {
        this.aNode_5669 = null;
        return null;
      }
      this.aNode_5669 = node.aNode_3189;
      return node;
    }
    catch (RuntimeException runtimeexception)
    {
      throw ErrorContext.info(runtimeexception, "sw.x(" + ')');
    }
  }
  
  public Node method5967(int i)
  {
    try
    {
      Node node = this.aNode_5668.aNode_3187;
      if (node == this.aNode_5668)
      {
        this.aNode_5669 = null;
        return null;
      }
      this.aNode_5669 = node.aNode_3187;
      return node;
    }
    catch (RuntimeException runtimeexception)
    {
      throw ErrorContext.info(runtimeexception, "sw.k(" + ')');
    }
  }
  
  public void method5968(Node node, int i)
  {
    try
    {
      if (node.aNode_3189 != null) {
        node.unlink(-1460969981);
      }
      node.aNode_3189 = this.aNode_5668.aNode_3189;
      node.aNode_3187 = this.aNode_5668;
      node.aNode_3189.aNode_3187 = node;
      node.aNode_3187.aNode_3189 = node;
    }
    catch (RuntimeException runtimeexception)
    {
      throw ErrorContext.info(runtimeexception, "sw.f(" + ')');
    }
  }
  
  public Node method5969(byte i)
  {
    try
    {
      Node node = this.aNode_5669;
      if (node == this.aNode_5668)
      {
        this.aNode_5669 = null;
        return null;
      }
      this.aNode_5669 = node.aNode_3187;
      return node;
    }
    catch (RuntimeException runtimeexception)
    {
      throw ErrorContext.info(runtimeexception, "sw.u(" + ')');
    }
  }
  
  public boolean method5970(byte i)
  {
    try
    {
      return this.aNode_5668.aNode_3187 == this.aNode_5668;
    }
    catch (RuntimeException runtimeexception)
    {
      throw ErrorContext.info(runtimeexception, "sw.r(" + ')');
    }
  }
  
  public Node method5971(int i)
  {
    try
    {
      Node node = this.aNode_5668.aNode_3187;
      if (this.aNode_5668 == node) {
        return null;
      }
      node.unlink(-1460969981);
      return node;
    }
    catch (RuntimeException runtimeexception)
    {
      throw ErrorContext.info(runtimeexception, "sw.i(" + ')');
    }
  }
  
  public void method5972(int i)
  {
    try
    {
      for (;;)
      {
        Node node = this.aNode_5668.aNode_3187;
        if (this.aNode_5668 == node)
        {
          if (i < -824427525) {
            break;
          }
          return;
        }
        node.unlink(-1460969981);
      }
      this.aNode_5669 = null;
    }
    catch (RuntimeException runtimeexception)
    {
      throw ErrorContext.info(runtimeexception, "sw.a(" + ')');
    }
  }
  
  public Class458()
  {
    this.aNode_5668.aNode_3187 = this.aNode_5668;
    this.aNode_5668.aNode_3189 = this.aNode_5668;
  }
  
  public static void method5973(Class298_Sub37 class298_sub37, Class298_Sub37 class298_sub37_0_, int i)
  {
    try
    {
      if (class298_sub37.aClass298_Sub37_7404 != null) {
        class298_sub37.method3402(-881477192);
      }
      class298_sub37.aClass298_Sub37_7404 = class298_sub37_0_;
      class298_sub37.aClass298_Sub37_7405 = class298_sub37_0_.aClass298_Sub37_7405;
      class298_sub37.aClass298_Sub37_7404.aClass298_Sub37_7405 = class298_sub37;
      class298_sub37.aClass298_Sub37_7405.aClass298_Sub37_7404 = class298_sub37;
    }
    catch (RuntimeException runtimeexception)
    {
      throw ErrorContext.info(runtimeexception, "sw.p(" + ')');
    }
  }
  
  static final void method5974(ClientScript2 class403, byte i)
  {
    try
    {
      if (FloTypeList.aClass298_Sub25_4084 != null)
      {
        class403.anIntArray5244[((class403.anInt5239 += -391880689) * 681479919 - 1)] = 1;
        class403.aClass298_Sub25_5237 = FloTypeList.aClass298_Sub25_4084;
      }
      else
      {
        class403.anIntArray5244[((class403.anInt5239 += -391880689) * 681479919 - 1)] = 0;
      }
    }
    catch (RuntimeException runtimeexception)
    {
      throw ErrorContext.info(runtimeexception, "sw.xx(" + ')');
    }
  }
  
  static final void method5975(ClientScript2 class403, byte i)
  {
    try
    {
      boolean bool = true;
      if (GameClient.aBoolean8638) {
        try
        {
          Object object = Class212.aClass212_2429.method1954(-1654113322);
          if (object != null) {
            bool = ((Boolean)object).booleanValue();
          }
        }
        catch (Throwable localThrowable) {}
      }
      class403.anIntArray5244[((class403.anInt5239 += -391880689) * 681479919 - 1)] = (bool ? 1 : 0);
    }
    catch (RuntimeException runtimeexception)
    {
      throw ErrorContext.info(runtimeexception, "sw.ank(" + ')');
    }
  }
  
  static final void method5976(ClientScript2 class403, byte i)
  {
    try
    {
      String string = (String)class403.anObjectArray5240[((class403.anInt5241 -= 969361751) * -203050393)];
      Class298_Sub36 class298_sub36 = Class18.method359(OutgoingPacket.aClass198_2041, GameClient.gameConnection.aClass449_330, (byte)19);
      class298_sub36.buffer.writeByte(string.length() + 1);
      class298_sub36.buffer.writeString(string, 2140741369);
      GameClient.gameConnection.writeOutboundPacket(class298_sub36, (byte)-70);
    }
    catch (RuntimeException runtimeexception)
    {
      throw ErrorContext.info(runtimeexception, "sw.sf(" + ')');
    }
  }
}
