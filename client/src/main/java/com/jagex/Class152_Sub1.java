package com.jagex;

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
public final class Class152_Sub1 extends Class152 implements MouseListener, MouseMotionListener, MouseWheelListener {

	@OriginalMember(owner = "client!alb", name = "e", descriptor = "I")
	static final int anInt1659 = 4;

	@OriginalMember(owner = "client!alb", name = "f", descriptor = "I")
	static final int anInt1660 = 2;

	@OriginalMember(owner = "client!alb", name = "t", descriptor = "I")
	static final int anInt1667 = 1;

	@OriginalMember(owner = "client!alb", name = "l", descriptor = "I")
	int anInt1661;

	@OriginalMember(owner = "client!alb", name = "g", descriptor = "I")
	int anInt1662;

	@OriginalMember(owner = "client!alb", name = "m", descriptor = "I")
	int anInt1663;

	@OriginalMember(owner = "client!alb", name = "o", descriptor = "I")
	int anInt1664;

	@OriginalMember(owner = "client!alb", name = "j", descriptor = "I")
	int anInt1665;

	@OriginalMember(owner = "client!alb", name = "u", descriptor = "I")
	int anInt1666;

	@OriginalMember(owner = "client!alb", name = "s", descriptor = "Ljava/awt/Component;")
	Component aComponent1;

	@OriginalMember(owner = "client!alb", name = "i", descriptor = "Lclient!aag;")
	Class8 aClass8_24 = new Class8();

	@OriginalMember(owner = "client!alb", name = "a", descriptor = "Lclient!aag;")
	Class8 aClass8_23 = new Class8();

	@OriginalMember(owner = "client!alb", name = "k", descriptor = "Z")
	boolean aBoolean387;

	@OriginalMember(owner = "client!alb", name = "apb", descriptor = "(Lclient!yp;B)V")
	static void method14637(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class238.anInt3847 * 633627325;
	}

	@OriginalMember(owner = "client!alb", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	Class152_Sub1(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method14629(arg0, 336146168);
		this.aBoolean387 = arg1;
	}

	@OriginalMember(owner = "client!alb", name = "at", descriptor = "(III)V")
	void method14628(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt1663 = arg0 * 1210020893;
		this.anInt1664 = arg1 * 964652253;
		if (this.aBoolean387) {
			this.method14632(-1, arg0, arg1, 0, 712409113);
		}
	}

	@OriginalMember(owner = "client!alb", name = "af", descriptor = "(Ljava/awt/Component;I)V")
	void method14629(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1) {
		this.method14630(-1494749066);
		this.aComponent1 = arg0;
		this.aComponent1.addMouseListener(this);
		this.aComponent1.addMouseMotionListener(this);
		this.aComponent1.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!alb", name = "am", descriptor = "(I)V")
	void method14630(@OriginalArg(0) int arg0) {
		if (this.aComponent1 == null) {
			return;
		}
		this.aComponent1.removeMouseWheelListener(this);
		this.aComponent1.removeMouseMotionListener(this);
		this.aComponent1.removeMouseListener(this);
		this.aComponent1 = null;
		this.anInt1662 = 0;
		this.anInt1661 = 0;
		this.anInt1666 = 0;
		this.anInt1665 = 0;
		this.anInt1664 = 0;
		this.anInt1663 = 0;
		this.aClass8_24 = null;
		this.aClass8_23 = null;
	}

	@OriginalMember(owner = "client!alb", name = "o", descriptor = "(I)I")
	@Override
	public int method14598(@OriginalArg(0) int arg0) {
		return this.anInt1661 * 14506473;
	}

	@OriginalMember(owner = "client!alb", name = "ac", descriptor = "()V")
	@Override
	public void method14624() {
		this.method14630(-1494749066);
	}

	@OriginalMember(owner = "client!alb", name = "d", descriptor = "()Z")
	@Override
	public boolean method14621() {
		return (this.anInt1662 * -1853208131 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!alb", name = "e", descriptor = "(I)V")
	@Override
	public synchronized void method14608(@OriginalArg(0) int arg0) {
		this.anInt1666 = this.anInt1663 * -581398681;
		this.anInt1661 = this.anInt1664 * -1083956819;
		this.anInt1662 = this.anInt1665 * -783716909;
		@Pc(20) Class8 local20 = this.aClass8_24;
		this.aClass8_24 = this.aClass8_23;
		this.aClass8_23 = local20;
		this.aClass8_23.method260(1203747003);
	}

	@OriginalMember(owner = "client!alb", name = "u", descriptor = "(S)Z")
	@Override
	public boolean method14591(@OriginalArg(0) short arg0) {
		return (this.anInt1662 * -1853208131 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!alb", name = "z", descriptor = "()Z")
	@Override
	public boolean method14620() {
		return (this.anInt1662 * -1853208131 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!alb", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method14597(@OriginalArg(0) int arg0) {
		return (this.anInt1662 * -1853208131 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!alb", name = "m", descriptor = "(I)I")
	@Override
	public int method14615(@OriginalArg(0) int arg0) {
		return this.anInt1666 * 1520746499;
	}

	@OriginalMember(owner = "client!alb", name = "l", descriptor = "(I)Z")
	@Override
	public boolean method14594(@OriginalArg(0) int arg0) {
		return (this.anInt1662 * -1853208131 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!alb", name = "h", descriptor = "()Z")
	@Override
	public boolean method14607() {
		return (this.anInt1662 * -1853208131 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!alb", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!alb", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method14628(arg0.getX(), arg0.getY(), -705371805);
	}

	@OriginalMember(owner = "client!alb", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method14628(arg0.getX(), arg0.getY(), -705371805);
	}

	@OriginalMember(owner = "client!alb", name = "ad", descriptor = "(Ljava/awt/event/MouseEvent;I)I")
	int method14631(@OriginalArg(0) MouseEvent arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!alb", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method14631(arg0, 465785093);
		if (local4 == 1) {
			this.method14632(0, arg0.getX(), arg0.getY(), arg0.getClickCount(), 712409113);
		} else if (local4 == 4) {
			this.method14632(2, arg0.getX(), arg0.getY(), arg0.getClickCount(), 712409113);
		} else if (local4 == 2) {
			this.method14632(1, arg0.getX(), arg0.getY(), arg0.getClickCount(), 712409113);
		}
		this.anInt1665 = (this.anInt1665 * 709181383 | local4) * 2096288247;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!alb", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method14631(arg0, -611607442);
		if ((this.anInt1665 * 709181383 & local4) == 0) {
			local4 = this.anInt1665 * 709181383;
		}
		if ((local4 & 0x1) != 0) {
			this.method14632(3, arg0.getX(), arg0.getY(), arg0.getClickCount(), 712409113);
		}
		if ((local4 & 0x4) != 0) {
			this.method14632(5, arg0.getX(), arg0.getY(), arg0.getClickCount(), 712409113);
		}
		if ((local4 & 0x2) != 0) {
			this.method14632(4, arg0.getX(), arg0.getY(), arg0.getClickCount(), 712409113);
		}
		this.anInt1665 = (this.anInt1665 * 709181383 & ~local4) * 2096288247;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!alb", name = "v", descriptor = "()Z")
	@Override
	public boolean method14611() {
		return (this.anInt1662 * -1853208131 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!alb", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method14628(arg0.getX(), arg0.getY(), -705371805);
	}

	@OriginalMember(owner = "client!alb", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		@Pc(8) int local8 = arg0.getWheelRotation();
		this.method14632(6, local2, local5, local8, 712409113);
		arg0.consume();
	}

	@OriginalMember(owner = "client!alb", name = "k", descriptor = "()V")
	@Override
	public synchronized void method14602() {
		this.anInt1666 = this.anInt1663 * -581398681;
		this.anInt1661 = this.anInt1664 * -1083956819;
		this.anInt1662 = this.anInt1665 * -783716909;
		@Pc(20) Class8 local20 = this.aClass8_24;
		this.aClass8_24 = this.aClass8_23;
		this.aClass8_23 = local20;
		this.aClass8_23.method260(1248145310);
	}

	@OriginalMember(owner = "client!alb", name = "ak", descriptor = "(IIIII)V")
	void method14632(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(8) Class80_Sub17_Sub1 local8 = Class120_Sub1_Sub1_Sub1.method19051(arg0, arg1, arg2, Class303.method27111((byte) 50), arg3, 1823781748);
		this.aClass8_23.method232(local8, 1267320724);
	}

	@OriginalMember(owner = "client!alb", name = "w", descriptor = "()Z")
	@Override
	public boolean method14604() {
		return (this.anInt1662 * -1853208131 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!alb", name = "r", descriptor = "()Z")
	@Override
	public boolean method14605() {
		return (this.anInt1662 * -1853208131 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!alb", name = "q", descriptor = "()Z")
	@Override
	public boolean method14606() {
		return (this.anInt1662 * -1853208131 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!alb", name = "p", descriptor = "()Z")
	@Override
	public boolean method14610() {
		return (this.anInt1662 * -1853208131 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!alb", name = "aq", descriptor = "()I")
	@Override
	public int method14618() {
		return this.anInt1661 * 14506473;
	}

	@OriginalMember(owner = "client!alb", name = "y", descriptor = "()Z")
	@Override
	public boolean method14612() {
		return (this.anInt1662 * -1853208131 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!alb", name = "x", descriptor = "()Z")
	@Override
	public boolean method14603() {
		return (this.anInt1662 * -1853208131 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!alb", name = "aj", descriptor = "()Lclient!akg;")
	@Override
	public Class80_Sub17 method14625() {
		return (Class80_Sub17) this.aClass8_24.method233(1532281469);
	}

	@OriginalMember(owner = "client!alb", name = "j", descriptor = "(B)Lclient!akg;")
	@Override
	public Class80_Sub17 method14599(@OriginalArg(0) byte arg0) {
		return (Class80_Sub17) this.aClass8_24.method233(1626458609);
	}

	@OriginalMember(owner = "client!alb", name = "b", descriptor = "()I")
	@Override
	public int method14614() {
		return this.anInt1666 * 1520746499;
	}

	@OriginalMember(owner = "client!alb", name = "ax", descriptor = "()I")
	@Override
	public int method14619() {
		return this.anInt1666 * 1520746499;
	}

	@OriginalMember(owner = "client!alb", name = "ay", descriptor = "()I")
	@Override
	public int method14592() {
		return this.anInt1666 * 1520746499;
	}

	@OriginalMember(owner = "client!alb", name = "ai", descriptor = "()I")
	@Override
	public int method14617() {
		return this.anInt1661 * 14506473;
	}

	@OriginalMember(owner = "client!alb", name = "ae", descriptor = "(IIII)V")
	void method14633(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class80_Sub17_Sub1 local8 = Class120_Sub1_Sub1_Sub1.method19051(arg0, arg1, arg2, Class303.method27111((byte) 123), arg3, 1573444081);
		this.aClass8_23.method232(local8, 2139178797);
	}

	@OriginalMember(owner = "client!alb", name = "ao", descriptor = "()Lclient!akg;")
	@Override
	public Class80_Sub17 method14593() {
		return (Class80_Sub17) this.aClass8_24.method233(367493181);
	}

	@OriginalMember(owner = "client!alb", name = "a", descriptor = "(I)V")
	@Override
	public void method14600(@OriginalArg(0) int arg0) {
		this.method14630(-1494749066);
	}

	@OriginalMember(owner = "client!alb", name = "ag", descriptor = "()V")
	@Override
	public void method14622() {
		this.method14630(-1494749066);
	}

	@OriginalMember(owner = "client!alb", name = "ab", descriptor = "()V")
	@Override
	public void method14595() {
		this.method14630(-1494749066);
	}

	@OriginalMember(owner = "client!alb", name = "al", descriptor = "()V")
	@Override
	public void method14623() {
		this.method14630(-1494749066);
	}

	@OriginalMember(owner = "client!alb", name = "ah", descriptor = "()V")
	@Override
	public void method14596() {
		this.method14630(-1494749066);
	}

	@OriginalMember(owner = "client!alb", name = "av", descriptor = "(Ljava/awt/Component;)V")
	void method14634(@OriginalArg(0) Component arg0) {
		this.method14630(-1494749066);
		this.aComponent1 = arg0;
		this.aComponent1.addMouseListener(this);
		this.aComponent1.addMouseMotionListener(this);
		this.aComponent1.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!alb", name = "an", descriptor = "()V")
	void method14635() {
		if (this.aComponent1 == null) {
			return;
		}
		this.aComponent1.removeMouseWheelListener(this);
		this.aComponent1.removeMouseMotionListener(this);
		this.aComponent1.removeMouseListener(this);
		this.aComponent1 = null;
		this.anInt1662 = 0;
		this.anInt1661 = 0;
		this.anInt1666 = 0;
		this.anInt1665 = 0;
		this.anInt1664 = 0;
		this.anInt1663 = 0;
		this.aClass8_24 = null;
		this.aClass8_23 = null;
	}

	@OriginalMember(owner = "client!alb", name = "aa", descriptor = "()V")
	void method14636() {
		if (this.aComponent1 == null) {
			return;
		}
		this.aComponent1.removeMouseWheelListener(this);
		this.aComponent1.removeMouseMotionListener(this);
		this.aComponent1.removeMouseListener(this);
		this.aComponent1 = null;
		this.anInt1662 = 0;
		this.anInt1661 = 0;
		this.anInt1666 = 0;
		this.anInt1665 = 0;
		this.anInt1664 = 0;
		this.anInt1663 = 0;
		this.aClass8_24 = null;
		this.aClass8_23 = null;
	}

	@OriginalMember(owner = "client!alb", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method14628(arg0.getX(), arg0.getY(), -705371805);
	}
}
