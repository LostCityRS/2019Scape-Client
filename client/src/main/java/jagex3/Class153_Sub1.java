package jagex3;

import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!alb")
public final class Class153_Sub1 extends Class153 implements MouseListener, MouseMotionListener, MouseWheelListener {

	@OriginalMember(owner = "client!alb", name = "n", descriptor = "I")
	static final int anInt1630 = 2;

	@OriginalMember(owner = "client!alb", name = "m", descriptor = "I")
	static final int anInt1631 = 4;

	@OriginalMember(owner = "client!alb", name = "e", descriptor = "I")
	static final int anInt1634 = 1;

	@OriginalMember(owner = "client!alb", name = "k", descriptor = "I")
	int anInt1632;

	@OriginalMember(owner = "client!alb", name = "f", descriptor = "I")
	int anInt1633;

	@OriginalMember(owner = "client!alb", name = "w", descriptor = "I")
	int anInt1635;

	@OriginalMember(owner = "client!alb", name = "u", descriptor = "I")
	int anInt1636;

	@OriginalMember(owner = "client!alb", name = "z", descriptor = "I")
	int anInt1637;

	@OriginalMember(owner = "client!alb", name = "c", descriptor = "Ljava/awt/Component;")
	Component aComponent1;

	@OriginalMember(owner = "client!alb", name = "p", descriptor = "I")
	int anInt1638;

	@OriginalMember(owner = "client!alb", name = "l", descriptor = "Lclient!aat;")
	Class22 aClass22_23 = new Class22();

	@OriginalMember(owner = "client!alb", name = "d", descriptor = "Lclient!aat;")
	Class22 aClass22_24 = new Class22();

	@OriginalMember(owner = "client!alb", name = "r", descriptor = "Z")
	boolean aBoolean342;

	@OriginalMember(owner = "client!alb", name = "d", descriptor = "(I)I")
	public static int method14114(@OriginalArg(0) int arg0) {
		@Pc(2) Class240 local2 = Class658.aClass240_91;
		synchronized (Class658.aClass240_91) {
			return Class658.aClass240_91.method25929((byte) -33);
		}
	}

	@OriginalMember(owner = "client!alb", name = "f", descriptor = "(Ljava/lang/String;I)V")
	public static void method14115(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (client.anInt3435 * -849002901 != 0) {
			return;
		}
		@Pc(11) Class93_Sub22 local11 = Class102.method2592(Class446.aClass446_13, client.aClass175_1.aClass24_2, (byte) 32);
		local11.aClass93_Sub41_Sub2_1.method22522(0, (byte) -57);
		@Pc(22) int local22 = local11.aClass93_Sub41_Sub2_1.anInt3070 * 212851357;
		local11.aClass93_Sub41_Sub2_1.method22414(arg0, 1388325526);
		local11.aClass93_Sub41_Sub2_1.anInt3070 += -1529454093;
		local11.aClass93_Sub41_Sub2_1.method22453(Class676.anIntArray518, local22, local11.aClass93_Sub41_Sub2_1.anInt3070 * 212851357, (byte) -53);
		local11.aClass93_Sub41_Sub2_1.method22549(local11.aClass93_Sub41_Sub2_1.anInt3070 * 212851357 - local22, (byte) 78);
		client.aClass175_1.method24363(local11, -1787674322);
		Class325.aClass715_1 = Class715.aClass715_3;
	}

	@OriginalMember(owner = "client!alb", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	Class153_Sub1(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method14105(arg0, -706752347);
		this.aBoolean342 = arg1;
	}

	@OriginalMember(owner = "client!alb", name = "a", descriptor = "()Z")
	@Override
	public boolean method14098() {
		return (this.anInt1635 * -159411809 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!alb", name = "bl", descriptor = "(II)V")
	void method14102(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1636 = arg0 * -180288159;
		this.anInt1637 = arg1 * -1857652815;
		if (this.aBoolean342) {
			this.method14113(-1, arg0, arg1, 0, (byte) 2);
		}
	}

	@OriginalMember(owner = "client!alb", name = "g", descriptor = "()Z")
	@Override
	public boolean method14082() {
		return (this.anInt1635 * -159411809 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!alb", name = "p", descriptor = "(I)Lclient!akm;")
	@Override
	public Class93_Sub23 method14065(@OriginalArg(0) int arg0) {
		return (Class93_Sub23) this.aClass22_23.method408(742291621);
	}

	@OriginalMember(owner = "client!alb", name = "ab", descriptor = "(III)V")
	void method14103(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt1636 = arg0 * -180288159;
		this.anInt1637 = arg1 * -1857652815;
		if (this.aBoolean342) {
			this.method14113(-1, arg0, arg1, 0, (byte) 6);
		}
	}

	@OriginalMember(owner = "client!alb", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method14104(arg0, (byte) 11);
		if ((this.anInt1638 * -2099788627 & local4) == 0) {
			local4 = this.anInt1638 * -2099788627;
		}
		if ((local4 & 0x1) != 0) {
			this.method14113(3, arg0.getX(), arg0.getY(), arg0.getClickCount(), (byte) 44);
		}
		if ((local4 & 0x4) != 0) {
			this.method14113(5, arg0.getX(), arg0.getY(), arg0.getClickCount(), (byte) 46);
		}
		if ((local4 & 0x2) != 0) {
			this.method14113(4, arg0.getX(), arg0.getY(), arg0.getClickCount(), (byte) 98);
		}
		this.anInt1638 = (-2099788627 * this.anInt1638 & ~local4) * -1236123867;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!alb", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method14103(arg0.getX(), arg0.getY(), -77997759);
	}

	@OriginalMember(owner = "client!alb", name = "k", descriptor = "(B)Z")
	@Override
	public boolean method14073(@OriginalArg(0) byte arg0) {
		return (this.anInt1635 * -159411809 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!alb", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method14093(@OriginalArg(0) int arg0) {
		return (this.anInt1635 * -159411809 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!alb", name = "w", descriptor = "(I)Z")
	@Override
	public boolean method14097(@OriginalArg(0) int arg0) {
		return (this.anInt1635 * -159411809 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!alb", name = "u", descriptor = "(I)I")
	@Override
	public int method14058(@OriginalArg(0) int arg0) {
		return this.anInt1632 * -2009910369;
	}

	@OriginalMember(owner = "client!alb", name = "z", descriptor = "(I)I")
	@Override
	public int method14064(@OriginalArg(0) int arg0) {
		return this.anInt1633 * 1902180517;
	}

	@OriginalMember(owner = "client!alb", name = "d", descriptor = "(I)V")
	@Override
	public void method14092(@OriginalArg(0) int arg0) {
		this.method14107((byte) 65);
	}

	@OriginalMember(owner = "client!alb", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!alb", name = "x", descriptor = "()V")
	@Override
	public synchronized void method14081() {
		this.anInt1632 = this.anInt1636 * -1717877313;
		this.anInt1633 = this.anInt1637 * -1952789955;
		this.anInt1635 = this.anInt1638 * -103875021;
		@Pc(20) Class22 local20 = this.aClass22_23;
		this.aClass22_23 = this.aClass22_24;
		this.aClass22_24 = local20;
		this.aClass22_24.method406(-2037259486);
	}

	@OriginalMember(owner = "client!alb", name = "av", descriptor = "()I")
	@Override
	public int method14078() {
		return this.anInt1632 * -2009910369;
	}

	@OriginalMember(owner = "client!alb", name = "az", descriptor = "(Ljava/awt/event/MouseEvent;B)I")
	int method14104(@OriginalArg(0) MouseEvent arg0, @OriginalArg(1) byte arg1) {
		if (arg0.getButton() == 1) {
			return arg0.isMetaDown() ? 4 : 1;
		} else if (arg0.getButton() == 2) {
			return 2;
		} else if (arg0.getButton() == 3) {
			return 4;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!alb", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method14103(arg0.getX(), arg0.getY(), -77997759);
	}

	@OriginalMember(owner = "client!alb", name = "am", descriptor = "()V")
	@Override
	public void method14063() {
		this.method14107((byte) -12);
	}

	@OriginalMember(owner = "client!alb", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method14103(arg0.getX(), arg0.getY(), -77997759);
	}

	@OriginalMember(owner = "client!alb", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		@Pc(8) int local8 = arg0.getWheelRotation();
		this.method14113(6, local2, local5, local8, (byte) 34);
		arg0.consume();
	}

	@OriginalMember(owner = "client!alb", name = "m", descriptor = "(I)V")
	@Override
	public synchronized void method14059(@OriginalArg(0) int arg0) {
		this.anInt1632 = this.anInt1636 * -1717877313;
		this.anInt1633 = this.anInt1637 * -1952789955;
		this.anInt1635 = this.anInt1638 * -103875021;
		@Pc(20) Class22 local20 = this.aClass22_23;
		this.aClass22_23 = this.aClass22_24;
		this.aClass22_24 = local20;
		this.aClass22_24.method406(-2037259486);
	}

	@OriginalMember(owner = "client!alb", name = "ao", descriptor = "(Ljava/awt/Component;I)V")
	void method14105(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1) {
		this.method14107((byte) -19);
		this.aComponent1 = arg0;
		this.aComponent1.addMouseListener(this);
		this.aComponent1.addMouseMotionListener(this);
		this.aComponent1.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!alb", name = "b", descriptor = "()V")
	@Override
	public synchronized void method14075() {
		this.anInt1632 = this.anInt1636 * -1717877313;
		this.anInt1633 = this.anInt1637 * -1952789955;
		this.anInt1635 = this.anInt1638 * -103875021;
		@Pc(20) Class22 local20 = this.aClass22_23;
		this.aClass22_23 = this.aClass22_24;
		this.aClass22_24 = local20;
		this.aClass22_24.method406(-2037259486);
	}

	@OriginalMember(owner = "client!alb", name = "an", descriptor = "()V")
	void method14106() {
		if (this.aComponent1 == null) {
			return;
		}
		this.aComponent1.removeMouseWheelListener(this);
		this.aComponent1.removeMouseMotionListener(this);
		this.aComponent1.removeMouseListener(this);
		this.aComponent1 = null;
		this.anInt1635 = 0;
		this.anInt1633 = 0;
		this.anInt1632 = 0;
		this.anInt1638 = 0;
		this.anInt1637 = 0;
		this.anInt1636 = 0;
		this.aClass22_23 = null;
		this.aClass22_24 = null;
	}

	@OriginalMember(owner = "client!alb", name = "aj", descriptor = "(B)V")
	void method14107(@OriginalArg(0) byte arg0) {
		if (this.aComponent1 == null) {
			return;
		}
		this.aComponent1.removeMouseWheelListener(this);
		this.aComponent1.removeMouseMotionListener(this);
		this.aComponent1.removeMouseListener(this);
		this.aComponent1 = null;
		this.anInt1635 = 0;
		this.anInt1633 = 0;
		this.anInt1632 = 0;
		this.anInt1638 = 0;
		this.anInt1637 = 0;
		this.anInt1636 = 0;
		this.aClass22_23 = null;
		this.aClass22_24 = null;
	}

	@OriginalMember(owner = "client!alb", name = "af", descriptor = "(Ljava/awt/Component;)V")
	void method14108(@OriginalArg(0) Component arg0) {
		this.method14107((byte) -43);
		this.aComponent1 = arg0;
		this.aComponent1.addMouseListener(this);
		this.aComponent1.addMouseMotionListener(this);
		this.aComponent1.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!alb", name = "i", descriptor = "()Z")
	@Override
	public boolean method14079() {
		return (this.anInt1635 * -159411809 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!alb", name = "j", descriptor = "()Z")
	@Override
	public boolean method14080() {
		return (this.anInt1635 * -159411809 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!alb", name = "t", descriptor = "()Z")
	@Override
	public boolean method14077() {
		return (this.anInt1635 * -159411809 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!alb", name = "ah", descriptor = "()I")
	@Override
	public int method14084() {
		return this.anInt1633 * 1902180517;
	}

	@OriginalMember(owner = "client!alb", name = "al", descriptor = "()I")
	@Override
	public int method14085() {
		return this.anInt1633 * 1902180517;
	}

	@OriginalMember(owner = "client!alb", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method14104(arg0, (byte) -2);
		if (local4 == 1) {
			this.method14113(0, arg0.getX(), arg0.getY(), arg0.getClickCount(), (byte) 68);
		} else if (local4 == 4) {
			this.method14113(2, arg0.getX(), arg0.getY(), arg0.getClickCount(), (byte) 39);
		} else if (local4 == 2) {
			this.method14113(1, arg0.getX(), arg0.getY(), arg0.getClickCount(), (byte) 99);
		}
		this.anInt1638 = (-2099788627 * this.anInt1638 | local4) * -1236123867;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!alb", name = "ai", descriptor = "()Lclient!akm;")
	@Override
	public Class93_Sub23 method14074() {
		return (Class93_Sub23) this.aClass22_23.method408(742291621);
	}

	@OriginalMember(owner = "client!alb", name = "aw", descriptor = "()Lclient!akm;")
	@Override
	public Class93_Sub23 method14060() {
		return (Class93_Sub23) this.aClass22_23.method408(742291621);
	}

	@OriginalMember(owner = "client!alb", name = "as", descriptor = "()V")
	@Override
	public void method14089() {
		this.method14107((byte) -86);
	}

	@OriginalMember(owner = "client!alb", name = "at", descriptor = "()V")
	@Override
	public void method14090() {
		this.method14107((byte) 63);
	}

	@OriginalMember(owner = "client!alb", name = "ad", descriptor = "()V")
	@Override
	public void method14091() {
		this.method14107((byte) 91);
	}

	@OriginalMember(owner = "client!alb", name = "h", descriptor = "()Z")
	@Override
	public boolean method14076() {
		return (this.anInt1635 * -159411809 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!alb", name = "aa", descriptor = "(Ljava/awt/Component;)V")
	void method14109(@OriginalArg(0) Component arg0) {
		this.method14107((byte) 18);
		this.aComponent1 = arg0;
		this.aComponent1.addMouseListener(this);
		this.aComponent1.addMouseMotionListener(this);
		this.aComponent1.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!alb", name = "q", descriptor = "()V")
	@Override
	public synchronized void method14087() {
		this.anInt1632 = this.anInt1636 * -1717877313;
		this.anInt1633 = this.anInt1637 * -1952789955;
		this.anInt1635 = this.anInt1638 * -103875021;
		@Pc(20) Class22 local20 = this.aClass22_23;
		this.aClass22_23 = this.aClass22_24;
		this.aClass22_24 = local20;
		this.aClass22_24.method406(-2037259486);
	}

	@OriginalMember(owner = "client!alb", name = "ak", descriptor = "(Ljava/awt/Component;)V")
	void method14110(@OriginalArg(0) Component arg0) {
		this.method14107((byte) -10);
		this.aComponent1 = arg0;
		this.aComponent1.addMouseListener(this);
		this.aComponent1.addMouseMotionListener(this);
		this.aComponent1.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!alb", name = "bk", descriptor = "(Ljava/awt/event/MouseEvent;)I")
	int method14111(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.getButton() == 1) {
			return arg0.isMetaDown() ? 4 : 1;
		} else if (arg0.getButton() == 2) {
			return 2;
		} else if (arg0.getButton() == 3) {
			return 4;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!alb", name = "bf", descriptor = "()V")
	void method14112() {
		if (this.aComponent1 == null) {
			return;
		}
		this.aComponent1.removeMouseWheelListener(this);
		this.aComponent1.removeMouseMotionListener(this);
		this.aComponent1.removeMouseListener(this);
		this.aComponent1 = null;
		this.anInt1635 = 0;
		this.anInt1633 = 0;
		this.anInt1632 = 0;
		this.anInt1638 = 0;
		this.anInt1637 = 0;
		this.anInt1636 = 0;
		this.aClass22_23 = null;
		this.aClass22_24 = null;
	}

	@OriginalMember(owner = "client!alb", name = "ac", descriptor = "()Lclient!akm;")
	@Override
	public Class93_Sub23 method14094() {
		return (Class93_Sub23) this.aClass22_23.method408(742291621);
	}

	@OriginalMember(owner = "client!alb", name = "ar", descriptor = "()Z")
	@Override
	public boolean method14061() {
		return (this.anInt1635 * -159411809 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!alb", name = "ay", descriptor = "(IIIIB)V")
	void method14113(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		@Pc(8) Class93_Sub23_Sub1 local8 = Class149.method23783(arg0, arg1, arg2, Class305.method26889(155117899), arg3, 2142901097);
		this.aClass22_24.method407(local8, 196697462);
	}

	@OriginalMember(owner = "client!alb", name = "ap", descriptor = "()Z")
	@Override
	public boolean method14095() {
		return (this.anInt1635 * -159411809 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!alb", name = "aq", descriptor = "()I")
	@Override
	public int method14096() {
		return this.anInt1632 * -2009910369;
	}

	@OriginalMember(owner = "client!alb", name = "ax", descriptor = "()I")
	@Override
	public int method14066() {
		return this.anInt1632 * -2009910369;
	}

	@OriginalMember(owner = "client!alb", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method14103(arg0.getX(), arg0.getY(), -77997759);
	}

	@OriginalMember(owner = "client!alb", name = "au", descriptor = "()Z")
	@Override
	public boolean method14086() {
		return (this.anInt1635 * -159411809 & 0x4) != 0;
	}
}
