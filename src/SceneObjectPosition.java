/* SceneObjectPosition - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class SceneObjectPosition {
	public float x;
	static int anInt2452;
	static int anInt2453;
	public float z;
	public float y;
	static SceneObjectPosition[] aSceneObjectPositionArray2456;

	static {
		new SceneObjectPosition(0.0F, 0.0F, 0.0F);
		aSceneObjectPositionArray2456 = new SceneObjectPosition[0];
	}

	public static SceneObjectPosition method2004(float f, float f_0_, float f_1_) {
		synchronized (aSceneObjectPositionArray2456) {
			if (anInt2453 == 0) {
				SceneObjectPosition sceneObjectPosition = new SceneObjectPosition(f, f_0_, f_1_);
				return sceneObjectPosition;
			}
			aSceneObjectPositionArray2456[--anInt2453].method2007(f, f_0_, f_1_);
			SceneObjectPosition sceneObjectPosition = aSceneObjectPositionArray2456[anInt2453];
			return sceneObjectPosition;
		}
	}

	public static SceneObjectPosition method2005(SceneObjectPosition sceneObjectPosition) {
		synchronized (aSceneObjectPositionArray2456) {
			if (anInt2453 == 0) {
				SceneObjectPosition sceneObjectPosition_2_ = new SceneObjectPosition(sceneObjectPosition);
				return sceneObjectPosition_2_;
			}
			aSceneObjectPositionArray2456[--anInt2453].method2013(sceneObjectPosition);
			SceneObjectPosition sceneObjectPosition_3_ = aSceneObjectPositionArray2456[anInt2453];
			return sceneObjectPosition_3_;
		}
	}

	public void method2006() {
		synchronized (aSceneObjectPositionArray2456) {
			if (anInt2453 < anInt2452 - 1)
				aSceneObjectPositionArray2456[anInt2453++] = this;
		}
	}

	public SceneObjectPosition(float f, float f_4_, float f_5_) {
		x = f;
		y = f_4_;
		z = f_5_;
	}

	public void method2007(float f, float f_6_, float f_7_) {
		x = f;
		y = f_6_;
		z = f_7_;
	}

	final void method2008() {
		x = -x;
		y = -y;
		z = -z;
	}

	final void method2009(SceneObjectPosition sceneObjectPosition_8_) {
		x += sceneObjectPosition_8_.x;
		y += sceneObjectPosition_8_.y;
		z += sceneObjectPosition_8_.z;
	}

	public final void method2010(float f, float f_9_, float f_10_) {
		x -= f;
		y -= f_9_;
		z -= f_10_;
	}

	public static final SceneObjectPosition method2011(SceneObjectPosition sceneObjectPosition, SceneObjectPosition sceneObjectPosition_11_) {
		SceneObjectPosition sceneObjectPosition_12_ = method2005(sceneObjectPosition);
		sceneObjectPosition_12_.method2015(sceneObjectPosition_11_);
		return sceneObjectPosition_12_;
	}

	public final float method2012() {
		return (float) Math.sqrt((double) (x * x + y * y + z * z));
	}

	public SceneObjectPosition() {
		/* empty */
	}

	SceneObjectPosition(SceneObjectPosition sceneObjectPosition_13_) {
		x = sceneObjectPosition_13_.x;
		y = sceneObjectPosition_13_.y;
		z = sceneObjectPosition_13_.z;
	}

	public void method2013(SceneObjectPosition sceneObjectPosition_14_) {
		method2007(sceneObjectPosition_14_.x, sceneObjectPosition_14_.y, sceneObjectPosition_14_.z);
	}

	public String toString() {
		return new StringBuilder().append(x).append(", ").append(y).append(", ").append(z).toString();
	}

	final void method2014(Class218 class218) {
		Class218 class218_15_ = Class218.method2020(x, y, z, 0.0F);
		Class218 class218_16_ = Class218.method2025(class218);
		Class218 class218_17_ = Class218.method2028(class218_16_, class218_15_);
		class218_17_.method2026(class218);
		method2007(((Class218) class218_17_).aFloat2461, ((Class218) class218_17_).aFloat2458, ((Class218) class218_17_).aFloat2462);
		class218_15_.method2029();
		class218_16_.method2029();
		class218_17_.method2029();
	}

	final void method2015(SceneObjectPosition sceneObjectPosition_18_) {
		x -= sceneObjectPosition_18_.x;
		y -= sceneObjectPosition_18_.y;
		z -= sceneObjectPosition_18_.z;
	}

	public final void method2016(Matrix43f class222) {
		float f = x;
		float f_19_ = y;
		x = (((Matrix43f) class222).aFloat2494 * f + ((Matrix43f) class222).aFloat2496 * f_19_ + ((Matrix43f) class222).aFloat2499 * z + ((Matrix43f) class222).aFloat2492);
		y = (((Matrix43f) class222).aFloat2502 * f + ((Matrix43f) class222).aFloat2497 * f_19_ + ((Matrix43f) class222).aFloat2500 * z + ((Matrix43f) class222).aFloat2503);
		z = (((Matrix43f) class222).aFloat2495 * f + ((Matrix43f) class222).aFloat2498 * f_19_ + ((Matrix43f) class222).aFloat2501 * z + ((Matrix43f) class222).aFloat2493);
	}

	public static void resetCachedPositionsToIndex(int i) {
		anInt2452 = i;
		aSceneObjectPositionArray2456 = new SceneObjectPosition[i];
		anInt2453 = 0;
	}

	public final void method2018(Matrix43f class222) {
		float f = x;
		float f_20_ = y;
		x = (((Matrix43f) class222).aFloat2494 * f + ((Matrix43f) class222).aFloat2496 * f_20_ + ((Matrix43f) class222).aFloat2499 * z);
		y = (((Matrix43f) class222).aFloat2502 * f + ((Matrix43f) class222).aFloat2497 * f_20_ + ((Matrix43f) class222).aFloat2500 * z);
		z = (((Matrix43f) class222).aFloat2495 * f + ((Matrix43f) class222).aFloat2498 * f_20_ + ((Matrix43f) class222).aFloat2501 * z);
	}
}
