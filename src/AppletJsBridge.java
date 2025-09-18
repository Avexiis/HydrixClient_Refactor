/* AppletJsBridge - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.applet.Applet;
import netscape.javascript.JSObject;

public class AppletJsBridge {
    public static void evalJs(Applet applet, String string, int i) throws Throwable {
        try {
            JSObject.getWindow(applet).eval(string);
        } catch (RuntimeException runtimeexception) {
            throw ErrorContext.info(runtimeexception, "tf.a(" + ')');
        }
    }

    @SuppressWarnings("varargs")
    public static Object callJsFunction(Applet applet, String string, short i) throws Throwable {
        try {
            return JSObject.getWindow(applet).call(string, (Object[])null);
        } catch (RuntimeException runtimeexception) {
            throw ErrorContext.info(runtimeexception, "tf.f(" + ')');
        }
    }

    public static Object callJsFunction(Applet applet, String string, Object[] objects, byte i) throws Throwable {
        try {
            return JSObject.getWindow(applet).call(string, objects);
        } catch (RuntimeException runtimeexception) {
            throw ErrorContext.info(runtimeexception, "tf.b(" + ')');
        }
    }

    AppletJsBridge() throws Throwable {
        throw new Error();
    }
}
