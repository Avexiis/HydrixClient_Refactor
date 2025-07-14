import jaclib.memory.*;

public class RsFloatBuffer extends Packet
{
    void method3658(final float f) {
        final int i = Stream.floatToRawIntBits(f);
        final byte[] buffer = this.payload;
        final int index = this.pos + 116413311;
        this.pos = index;
        buffer[index * 385051775 - 1] = (byte)(i >> 24);
        final byte[] buffer2 = this.payload;
        final int index2 = this.pos + 116413311;
        this.pos = index2;
        buffer2[index2 * 385051775 - 1] = (byte)(i >> 16);
        final byte[] buffer3 = this.payload;
        final int index3 = this.pos + 116413311;
        this.pos = index3;
        buffer3[index3 * 385051775 - 1] = (byte)(i >> 8);
        final byte[] buffer4 = this.payload;
        final int index4 = this.pos + 116413311;
        this.pos = index4;
        buffer4[index4 * 385051775 - 1] = (byte)i;
    }
    
    RsFloatBuffer(final int i) {
        super(i);
    }
    
    void method3659(final float f) {
        final int i = Stream.floatToRawIntBits(f);
        final byte[] buffer = this.payload;
        final int index = this.pos + 116413311;
        this.pos = index;
        buffer[index * 385051775 - 1] = (byte)i;
        final byte[] buffer2 = this.payload;
        final int index2 = this.pos + 116413311;
        this.pos = index2;
        buffer2[index2 * 385051775 - 1] = (byte)(i >> 8);
        final byte[] buffer3 = this.payload;
        final int index3 = this.pos + 116413311;
        this.pos = index3;
        buffer3[index3 * 385051775 - 1] = (byte)(i >> 16);
        final byte[] buffer4 = this.payload;
        final int index4 = this.pos + 116413311;
        this.pos = index4;
        buffer4[index4 * 385051775 - 1] = (byte)(i >> 24);
    }
}
