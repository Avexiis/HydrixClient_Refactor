import java.util.Iterator;

public final class HashTable
  implements Iterable
{
  Node[] aNodeArray5512;
  Node aNode_5513;
  long aLong5514;
  int maxSize;
  Node aNode_5516;
  int anInt5517 = 0;
  static int anInt5518;
  public static Class377 aClass377_5519;
  public static Class371 aClass371_5520;
  
  public void method5811(byte i)
  {
    try
    {
      for (int i_0_ = 0; i_0_ < 577108745 * this.maxSize; i_0_++)
      {
        Node node = this.aNodeArray5512[i_0_];
        for (;;)
        {
          Node node_1_ = node.aNode_3187;
          if (node == node_1_) {
            break;
          }
          node_1_.unlink(-1460969981);
        }
      }
      this.aNode_5513 = null;
      this.aNode_5516 = null;
    }
    catch (RuntimeException runtimeexception)
    {
      throw ErrorContext.info(runtimeexception, "sa.i(" + ')');
    }
  }
  
  public Node get(long l)
  {
    try
    {
      this.aLong5514 = (l * -1039549200087996967L);
      Node node = this.aNodeArray5512[((int)(l & 577108745 * this.maxSize - 1))];
      for (this.aNode_5513 = node.aNode_3187; this.aNode_5513 != node; this.aNode_5513 = this.aNode_5513.aNode_3187) {
        if (this.aNode_5513.aLong3188 * 7051297995265073167L == l)
        {
          Node node_2_ = this.aNode_5513;
          this.aNode_5513 = this.aNode_5513.aNode_3187;
          return node_2_;
        }
      }
      this.aNode_5513 = null;
      return null;
    }
    catch (RuntimeException runtimeexception)
    {
      throw ErrorContext.info(runtimeexception, "sa.a(" + ')');
    }
  }
  
  public Node method5813(int i)
  {
    try
    {
      if (this.aNode_5513 == null) {
        return null;
      }
      for (Node node = this.aNodeArray5512[((int)(this.aLong5514 * -6131383980927776151L & this.maxSize * 577108745 - 1))]; this.aNode_5513 != node; this.aNode_5513 = this.aNode_5513.aNode_3187) {
        if (this.aLong5514 * -6131383980927776151L == this.aNode_5513.aLong3188 * 7051297995265073167L)
        {
          Node node_3_ = this.aNode_5513;
          this.aNode_5513 = this.aNode_5513.aNode_3187;
          return node_3_;
        }
      }
      this.aNode_5513 = null;
      return null;
    }
    catch (RuntimeException runtimeexception)
    {
      throw ErrorContext.info(runtimeexception, "sa.f(" + ')');
    }
  }
  
  public int method5814(int i)
  {
    try
    {
      int i_4_ = 0;
      for (int i_5_ = 0; i_5_ < this.maxSize * 577108745; i_5_++)
      {
        Node node = this.aNodeArray5512[i_5_];
        for (Node node_6_ = node.aNode_3187; node != node_6_; node_6_ = node_6_.aNode_3187) {
          i_4_++;
        }
      }
      return i_4_;
    }
    catch (RuntimeException runtimeexception)
    {
      throw ErrorContext.info(runtimeexception, "sa.b(" + ')');
    }
  }
  
  public Node method5815(byte i)
  {
    try
    {
      if ((-1375920843 * this.anInt5517 > 0) && (this.aNode_5516 != this.aNodeArray5512[(this.anInt5517 * -1375920843 - 1)]))
      {
        Node node = this.aNode_5516;
        this.aNode_5516 = node.aNode_3187;
        return node;
      }
      while (this.anInt5517 * -1375920843 < 577108745 * this.maxSize)
      {
        Node node = this.aNodeArray5512[((this.anInt5517 += -1552413411) * -1375920843 - 1)].aNode_3187;
        if (node != this.aNodeArray5512[(-1375920843 * this.anInt5517 - 1)])
        {
          this.aNode_5516 = node.aNode_3187;
          return node;
        }
      }
      return null;
    }
    catch (RuntimeException runtimeexception)
    {
      throw ErrorContext.info(runtimeexception, "sa.d(" + ')');
    }
  }
  
  public Iterator iterator()
  {
    try
    {
      return new LoginPacket(this);
    }
    catch (RuntimeException runtimeexception)
    {
      throw ErrorContext.info(runtimeexception, "sa.iterator(" + ')');
    }
  }
  
  public Node method5816(int i)
  {
    try
    {
      this.anInt5517 = 0;
      return method5815((byte)67);
    }
    catch (RuntimeException runtimeexception)
    {
      throw ErrorContext.info(runtimeexception, "sa.k(" + ')');
    }
  }
  
  public void method5817(Node node, long l)
  {
    try
    {
      if (node.aNode_3189 != null) {
        node.unlink(-1460969981);
      }
      Node node_7_ = this.aNodeArray5512[((int)(l & this.maxSize * 577108745 - 1))];
      node.aNode_3189 = node_7_.aNode_3189;
      node.aNode_3187 = node_7_;
      node.aNode_3189.aNode_3187 = node;
      node.aNode_3187.aNode_3189 = node;
      node.aLong3188 = (4191220306876042991L * l);
    }
    catch (RuntimeException runtimeexception)
    {
      throw ErrorContext.info(runtimeexception, "sa.p(" + ')');
    }
  }
  
  public HashTable(int i)
  {
    this.maxSize = (1594491705 * i);
    this.aNodeArray5512 = new Node[i];
    for (int i_8_ = 0; i_8_ < i; i_8_++)
    {
      Node node = this.aNodeArray5512[i_8_] = new Node();
      node.aNode_3187 = node;
      node.aNode_3189 = node;
    }
  }
  
  static void method5818(int i, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_, int i_17_, int i_18_, int i_19_, int i_20_, int i_21_, boolean bool, int i_22_)
  {
    try
    {
      if ((i_9_ != 0) && (-1 != i_11_))
      {
        Entity class365_sub1_sub1_sub2 = null;
        if (i_9_ < 0)
        {
          int i_23_ = -i_9_ - 1;
          if (i_23_ == -442628795 * GameClient.playerIndex) {
            class365_sub1_sub1_sub2 = Class287.myPlayer;
          } else {
            class365_sub1_sub1_sub2 = GameClient.players[i_23_];
          }
        }
        else
        {
          int i_24_ = i_9_ - 1;
          LinkableObject linkableObject = (LinkableObject) GameClient.npcs.get(i_24_);
          if (linkableObject != null) {
            class365_sub1_sub1_sub2 = (Entity) linkableObject.anObject7366;
          }
        }
        if (class365_sub1_sub1_sub2 != null)
        {
          BASType class350 = class365_sub1_sub1_sub2.getDefinition(95049522);
          if ((class350.anIntArrayArray3710 != null) && (class350.anIntArrayArray3710[i_11_] != null)) {
            i_12_ -= class350.anIntArrayArray3710[i_11_][1];
          }
          if ((class350.anIntArrayArray3753 != null) && (class350.anIntArrayArray3753[i_11_] != null)) {
            i_12_ -= class350.anIntArrayArray3753[i_11_][1];
          }
        }
      }
      Class365_Sub1_Sub1_Sub1 class365_sub1_sub1_sub1 = new Class365_Sub1_Sub1_Sub1(GameClient.map.method2675(-1611682495), i, FloTypeList.basePlane * -191892109, FloTypeList.basePlane * -191892109, i_14_, i_15_, i_12_, GameClient.anInt8884 * 443738891 + i_18_, GameClient.anInt8884 * 443738891 + i_19_, i_20_, i_21_, i_9_, i_10_, i_13_, bool, i_11_);
      class365_sub1_sub1_sub1.method4405(i_16_, i_17_, Class356.method4271(i_16_, i_17_, FloTypeList.basePlane * -191892109, -968708982) - i_13_, 443738891 * GameClient.anInt8884 + i_18_, 1068285759);
      GameClient.projectiles.addlast(new Class298_Sub37_Sub2(class365_sub1_sub1_sub1), 520361177);
    }
    catch (RuntimeException runtimeexception)
    {
      throw ErrorContext.info(runtimeexception, "sa.nu(" + ')');
    }
  }
}
