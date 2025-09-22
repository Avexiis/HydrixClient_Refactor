/* MouseEvent - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class MouseEvent extends Class319 implements MouseListener, MouseMotionListener, MouseWheelListener {
	LinkedNodeList aLinkedNodeList_7691;
	static int anInt7692 = 2;
	int anInt7693;
	int anInt7694;
	static int anInt7695 = 4;
	int anInt7696;
	LinkedNodeList aLinkedNodeList_7697 = new LinkedNodeList();
	int anInt7698;
	int anInt7699;
	int anInt7700;
	static int anInt7701 = 1;
	Component mouseComponent;
	boolean aBoolean7703;

	public boolean method3878(int i) {
		try {
			return 0 != (-31480187 * ((MouseEvent) this).anInt7696 & 0x1);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "MouseEvent.p()");
		}
	}

	void addMouseListener(Component component, int i) {
		try {
			removeMouseListener(1230262531);
			this.mouseComponent = component;
			this.mouseComponent.addMouseListener(this);
			this.mouseComponent.addMouseMotionListener(this);
			this.mouseComponent.addMouseWheelListener(this);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "MouseEvent.addMouseListener()");
		}
	}

	void removeMouseListener(int i) {
		try {
			if (null != this.mouseComponent) {
				this.mouseComponent.removeMouseWheelListener(this);
				this.mouseComponent.removeMouseMotionListener(this);
				this.mouseComponent.removeMouseListener(this);
				this.mouseComponent = null;
				this.anInt7696 = 0;
				this.anInt7700 = 0;
				this.anInt7694 = 0;
				this.anInt7693 = 0;
				this.anInt7699 = 0;
				this.anInt7698 = 0;
				this.aLinkedNodeList_7697 = null;
				this.aLinkedNodeList_7691 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "MouseEvent.removeMouseListener()");
		}
	}

	public boolean method3890() {
		return 0 != (-31480187 * ((MouseEvent) this).anInt7696 & 0x1);
	}

	void method3907(int i, int i_0_, int i_1_) {
		try {
			((MouseEvent) this).anInt7698 = i * -213131387;
			((MouseEvent) this).anInt7699 = i_0_ * -968658837;
			if (((MouseEvent) this).aBoolean7703)
				method3908(-1, i, i_0_, 0, 1553525097);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "MouseEvent.al()");
		}
	}

	public boolean method3887(int i) {
		try {
			return (-31480187 * ((MouseEvent) this).anInt7696 & 0x2) != 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "MouseEvent.i()");
		}
	}

	MouseEvent(Component component, boolean bool) {
		((MouseEvent) this).aLinkedNodeList_7691 = new LinkedNodeList();
		addMouseListener(component, -1437014279);
		((MouseEvent) this).aBoolean7703 = bool;
	}

	void method3908(int i, int i_2_, int i_3_, int i_4_, int i_5_) {
		try {
			Class298_Sub50_Sub1 class298_sub50_sub1 = Class523.method6333(i, i_2_, i_3_, TimeUtils.getTime((byte) 1), i_4_, -1798824718);
			((MouseEvent) this).aLinkedNodeList_7691.addlast(class298_sub50_sub1, 534328737);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "MouseEvent.ai()");
		}
	}

	public boolean method3880(byte i) {
		try {
			return (((MouseEvent) this).anInt7696 * -31480187 & 0x4) != 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "MouseEvent.k()");
		}
	}

	public int method3899() {
		return ((MouseEvent) this).anInt7700 * 28748355;
	}

	public int getMouseY(byte i) {
		try {
			return ((MouseEvent) this).anInt7700 * 28748355;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "MouseEvent.getMouseY()");
		}
	}

	public void method3882(byte i) {
		try {
			removeMouseListener(868673993);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "MouseEvent.q()");
		}
	}

	public synchronized void mouseClicked(java.awt.event.MouseEvent mouseevent) {
		try {
			if (mouseevent.isPopupTrigger())
				mouseevent.consume();
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "MouseEvent.mouseClicked()");
		}
	}

	public synchronized void mouseEntered(java.awt.event.MouseEvent mouseevent) {
		try {
			method3907(mouseevent.getX(), mouseevent.getY(), 459711214);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "MouseEvent.mouseEntered()");
		}
	}

	public synchronized void mouseExited(java.awt.event.MouseEvent mouseevent) {
		try {
			method3907(mouseevent.getX(), mouseevent.getY(), 1366931071);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "MouseEvent.mouseExited()");
		}
	}

	int method3909(java.awt.event.MouseEvent mouseevent, int i) {
		try {
			if (mouseevent.getButton() == 1) {
				if (mouseevent.isMetaDown())
					return 4;
				return 1;
			}
			if (mouseevent.getButton() == 2)
				return 2;
			if (mouseevent.getButton() == 3)
				return 4;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "MouseEvent.az()");
		}
	}

	public synchronized void mousePressed(java.awt.event.MouseEvent mouseevent) {
		try {
			int i = method3909(mouseevent, 1930435178);
			if (1 == i)
				method3908(0, mouseevent.getX(), mouseevent.getY(), mouseevent.getClickCount(), 1989072538);
			else if (i == 4)
				method3908(2, mouseevent.getX(), mouseevent.getY(), mouseevent.getClickCount(), 1922972976);
			else if (2 == i)
				method3908(1, mouseevent.getX(), mouseevent.getY(), mouseevent.getClickCount(), 2016030026);
			((MouseEvent) this).anInt7693 = ((2114498315 * ((MouseEvent) this).anInt7693 | i) * 1282483363);
			if (mouseevent.isPopupTrigger())
				mouseevent.consume();
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "MouseEvent.mousePressed()");
		}
	}

	public synchronized void mouseReleased(java.awt.event.MouseEvent mouseevent) {
		try {
			int i = method3909(mouseevent, 1755922620);
			if ((2114498315 * ((MouseEvent) this).anInt7693 & i) == 0)
				i = ((MouseEvent) this).anInt7693 * 2114498315;
			if ((i & 0x1) != 0)
				method3908(3, mouseevent.getX(), mouseevent.getY(), mouseevent.getClickCount(), 1931509920);
			if ((i & 0x4) != 0)
				method3908(5, mouseevent.getX(), mouseevent.getY(), mouseevent.getClickCount(), 1062616351);
			if ((i & 0x2) != 0)
				method3908(4, mouseevent.getX(), mouseevent.getY(), mouseevent.getClickCount(), 1204760399);
			((MouseEvent) this).anInt7693 = (((MouseEvent) this).anInt7693 * 2114498315 & (i ^ 0xffffffff)) * 1282483363;
			if (mouseevent.isPopupTrigger())
				mouseevent.consume();
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "MouseEvent.mouseReleased()");
		}
	}

	public synchronized void mouseDragged(java.awt.event.MouseEvent mouseevent) {
		try {
			method3907(mouseevent.getX(), mouseevent.getY(), -2027156244);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "MouseEvent.mouseDragged()");
		}
	}

	public synchronized void mouseMoved(java.awt.event.MouseEvent mouseevent) {
		try {
			method3907(mouseevent.getX(), mouseevent.getY(), -1257091860);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "MouseEvent.mouseMoved()");
		}
	}

	public synchronized void mouseWheelMoved(MouseWheelEvent mousewheelevent) {
		try {
			int i = mousewheelevent.getX();
			int i_6_ = mousewheelevent.getY();
			int i_7_ = mousewheelevent.getWheelRotation();
			method3908(6, i, i_6_, i_7_, 1166829560);
			mousewheelevent.consume();
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "MouseEvent.mouseWheelMoved()");
		}
		if (mousewheelevent.isShiftDown()) {
			if (mousewheelevent.getWheelRotation() == +1) {// Out
				if (GameClient.zoom >= 150) {
					GameClient.zoom -= 15;
					JagexLibraryManager.method3752(184, GameClient.zoom, 644551429);
				} else {
//			    DevConsole.method2435("You can not zoom any farther outwards!", 93254474);
					return;
				}
			}
			if (mousewheelevent.getWheelRotation() == -1) {// In
				if (GameClient.zoom < 550) {
					GameClient.zoom += 15;
					JagexLibraryManager.method3752(184, GameClient.zoom, 644551429);
				} else {
//			    DevConsole.method2435("You can not zoom any farther inwards!", 93254474);
					return;
				}
			}
		}

	}

	public synchronized void method3877() {
		((MouseEvent) this).anInt7694 = ((MouseEvent) this).anInt7698 * -867321853;
		((MouseEvent) this).anInt7700 = ((MouseEvent) this).anInt7699 * -1698396671;
		((MouseEvent) this).anInt7696 = ((MouseEvent) this).anInt7693 * 866311247;
		LinkedNodeList linkedNodeList = ((MouseEvent) this).aLinkedNodeList_7697;
		((MouseEvent) this).aLinkedNodeList_7697 = ((MouseEvent) this).aLinkedNodeList_7691;
		((MouseEvent) this).aLinkedNodeList_7691 = linkedNodeList;
		((MouseEvent) this).aLinkedNodeList_7691.method5943((byte) 1);
	}

	public synchronized void method3884() {
		((MouseEvent) this).anInt7694 = ((MouseEvent) this).anInt7698 * -867321853;
		((MouseEvent) this).anInt7700 = ((MouseEvent) this).anInt7699 * -1698396671;
		((MouseEvent) this).anInt7696 = ((MouseEvent) this).anInt7693 * 866311247;
		LinkedNodeList linkedNodeList = ((MouseEvent) this).aLinkedNodeList_7697;
		((MouseEvent) this).aLinkedNodeList_7697 = ((MouseEvent) this).aLinkedNodeList_7691;
		((MouseEvent) this).aLinkedNodeList_7691 = linkedNodeList;
		((MouseEvent) this).aLinkedNodeList_7691.method5943((byte) 1);
	}

	public boolean method3889() {
		return (-31480187 * ((MouseEvent) this).anInt7696 & 0x2) != 0;
	}

	public void method3898() {
		removeMouseListener(-1710561997);
	}

	public boolean method3888() {
		return 0 != (-31480187 * ((MouseEvent) this).anInt7696 & 0x1);
	}

	public boolean method3892() {
		return (-31480187 * ((MouseEvent) this).anInt7696 & 0x2) != 0;
	}

	public synchronized void method3886(int i) {
		try {
			((MouseEvent) this).anInt7694 = ((MouseEvent) this).anInt7698 * -867321853;
			((MouseEvent) this).anInt7700 = ((MouseEvent) this).anInt7699 * -1698396671;
			((MouseEvent) this).anInt7696 = ((MouseEvent) this).anInt7693 * 866311247;
			LinkedNodeList linkedNodeList = ((MouseEvent) this).aLinkedNodeList_7697;
			((MouseEvent) this).aLinkedNodeList_7697 = ((MouseEvent) this).aLinkedNodeList_7691;
			((MouseEvent) this).aLinkedNodeList_7691 = linkedNodeList;
			((MouseEvent) this).aLinkedNodeList_7691.method5943((byte) 1);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "MouseEvent.b()");
		}
	}

	public boolean method3893() {
		return (((MouseEvent) this).anInt7696 * -31480187 & 0x4) != 0;
	}

	public int method3895() {
		return ((MouseEvent) this).anInt7694 * 1215441007;
	}

	public Class298_Sub50 method3896() {
		return ((Class298_Sub50) ((MouseEvent) this).aLinkedNodeList_7697.method5936(2123266868));
	}

	public Class298_Sub50 method3885() {
		return ((Class298_Sub50) ((MouseEvent) this).aLinkedNodeList_7697.method5936(2127727655));
	}

	public int getMouseX(byte i) {
		try {
			return ((MouseEvent) this).anInt7694 * 1215441007;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "MouseEvent.getMouseX()");
		}
	}

	public Class298_Sub50 method3879(int i) {
		try {
			return (Class298_Sub50) ((MouseEvent) this).aLinkedNodeList_7697.method5936(2114584348);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "MouseEvent.r()");
		}
	}

	public void method3897() {
		removeMouseListener(-1322459721);
	}

	public boolean method3891() {
		return 0 != (-31480187 * ((MouseEvent) this).anInt7696 & 0x1);
	}
}
