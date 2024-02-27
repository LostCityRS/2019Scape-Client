package com.jagex;

import java.util.LinkedList;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ry")
public final class Class541 implements Runnable {

	@OriginalMember(owner = "client!ry", name = "e", descriptor = "Z")
	volatile boolean aBoolean812 = false;

	@OriginalMember(owner = "client!ry", name = "n", descriptor = "Ljava/util/LinkedList;")
	LinkedList aLinkedList4 = new LinkedList();

	@OriginalMember(owner = "client!ry", name = "m", descriptor = "Lclient!rl;")
	Class532 aClass532_2 = new Class532(true);

	@OriginalMember(owner = "client!ry", name = "fn", descriptor = "(Lclient!yf;I)V")
	static void method31110(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class583.method31605(local11, local14, arg0, 1860815549);
	}

	@OriginalMember(owner = "client!ry", name = "acc", descriptor = "(Lclient!yf;B)V")
	static void method31111(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = arg0.aClass386_3.aByte151;
	}

	@OriginalMember(owner = "client!ry", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			this.method31097(65535);
		}
	}

	@OriginalMember(owner = "client!ry", name = "e", descriptor = "(Lclient!aop;I)V")
	public void method31083(@OriginalArg(0) Class32_Sub14 arg0, @OriginalArg(1) int arg1) {
		this.aClass532_2.method30630(arg0, 2087680265);
	}

	@OriginalMember(owner = "client!ry", name = "d", descriptor = "(Lclient!rt;)V")
	public void method31084(@OriginalArg(0) Class537 arg0) {
		@Pc(3) LinkedList local3 = this.aLinkedList4;
		synchronized (this.aLinkedList4) {
			this.aLinkedList4.add(arg0);
			this.aLinkedList4.notify();
		}
	}

	@OriginalMember(owner = "client!ry", name = "m", descriptor = "(I)Z")
	public boolean method31085(@OriginalArg(0) int arg0) {
		return this.aBoolean812;
	}

	@OriginalMember(owner = "client!ry", name = "k", descriptor = "(I)Lclient!rl;")
	public Class532 method31086(@OriginalArg(0) int arg0) {
		return this.aClass532_2;
	}

	@OriginalMember(owner = "client!ry", name = "f", descriptor = "(Lclient!rl;I)V")
	void method31087(@OriginalArg(0) Class532 arg0, @OriginalArg(1) int arg1) {
		this.aClass532_2 = arg0;
	}

	@OriginalMember(owner = "client!ry", name = "ae", descriptor = "(Lclient!rt;)V")
	void method31088(@OriginalArg(0) Class537 arg0) {
		if (arg0.aClass526_11 == Class526.aClass526_7) {
			this.aClass532_2.method30650((byte) 0);
		} else {
			this.aClass532_2.method30646(arg0, 439366062);
		}
		for (@Pc(18) boolean local18 = this.aClass532_2.method30620((byte) 57); !local18; local18 = this.aClass532_2.method30620((byte) 119)) {
		}
		this.aClass532_2.method30626(1213218812);
		client.aClass532_1.method30626(1213218812);
	}

	@OriginalMember(owner = "client!ry", name = "n", descriptor = "(Lclient!rt;B)V")
	public void method31089(@OriginalArg(0) Class537 arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) LinkedList local3 = this.aLinkedList4;
		synchronized (this.aLinkedList4) {
			this.aLinkedList4.add(arg0);
			this.aLinkedList4.notify();
		}
	}

	@OriginalMember(owner = "client!ry", name = "p", descriptor = "(Lclient!rt;)V")
	public void method31090(@OriginalArg(0) Class537 arg0) {
		@Pc(3) LinkedList local3 = this.aLinkedList4;
		synchronized (this.aLinkedList4) {
			this.aLinkedList4.add(arg0);
			this.aLinkedList4.notify();
		}
	}

	@OriginalMember(owner = "client!ry", name = "c", descriptor = "()V")
	public void method31091() {
		while (true) {
			this.method31097(65535);
		}
	}

	@OriginalMember(owner = "client!ry", name = "v", descriptor = "()V")
	public void method31092() {
		while (true) {
			this.method31097(65535);
		}
	}

	@OriginalMember(owner = "client!ry", name = "a", descriptor = "()Lclient!rl;")
	public Class532 method31093() {
		return this.aClass532_2;
	}

	@OriginalMember(owner = "client!ry", name = "o", descriptor = "()V")
	public void method31094() {
		while (true) {
			this.method31097(65535);
		}
	}

	@OriginalMember(owner = "client!ry", name = "u", descriptor = "(Lclient!aop;)V")
	public void method31095(@OriginalArg(0) Class32_Sub14 arg0) {
		this.aClass532_2.method30630(arg0, 2087680265);
	}

	@OriginalMember(owner = "client!ry", name = "z", descriptor = "(Lclient!aop;)V")
	public void method31096(@OriginalArg(0) Class32_Sub14 arg0) {
		this.aClass532_2.method30630(arg0, 2087680265);
	}

	@OriginalMember(owner = "client!ry", name = "w", descriptor = "(I)V")
	void method31097(@OriginalArg(0) int arg0) {
		@Pc(1) Class537 local1 = null;
		@Pc(5) LinkedList local5 = this.aLinkedList4;
		synchronized (this.aLinkedList4) {
			try {
				this.aLinkedList4.wait();
			} catch (@Pc(11) InterruptedException local11) {
			}
			local1 = (Class537) this.aLinkedList4.pollFirst();
		}
		try {
			if (local1 != null) {
				this.aBoolean812 = true;
				this.method31098(local1, -246378460);
			}
		} catch (@Pc(39) Exception local39) {
		} finally {
			this.aBoolean812 = false;
		}
	}

	@OriginalMember(owner = "client!ry", name = "l", descriptor = "(Lclient!rt;I)V")
	void method31098(@OriginalArg(0) Class537 arg0, @OriginalArg(1) int arg1) {
		if (arg0.aClass526_11 == Class526.aClass526_7) {
			this.aClass532_2.method30650((byte) 0);
		} else {
			this.aClass532_2.method30646(arg0, -1635529773);
		}
		for (@Pc(18) boolean local18 = this.aClass532_2.method30620((byte) 58); !local18; local18 = this.aClass532_2.method30620((byte) 71)) {
		}
		this.aClass532_2.method30626(1213218812);
		client.aClass532_1.method30626(1213218812);
	}

	@OriginalMember(owner = "client!ry", name = "s", descriptor = "(Lclient!rt;)V")
	public void method31099(@OriginalArg(0) Class537 arg0) {
		@Pc(3) LinkedList local3 = this.aLinkedList4;
		synchronized (this.aLinkedList4) {
			this.aLinkedList4.add(arg0);
			this.aLinkedList4.notify();
		}
	}

	@OriginalMember(owner = "client!ry", name = "y", descriptor = "(Lclient!rt;)V")
	public void method31100(@OriginalArg(0) Class537 arg0) {
		@Pc(3) LinkedList local3 = this.aLinkedList4;
		synchronized (this.aLinkedList4) {
			this.aLinkedList4.add(arg0);
			this.aLinkedList4.notify();
		}
	}

	@OriginalMember(owner = "client!ry", name = "q", descriptor = "()Z")
	public boolean method31101() {
		return this.aBoolean812;
	}

	@OriginalMember(owner = "client!ry", name = "x", descriptor = "()Z")
	public boolean method31102() {
		return this.aBoolean812;
	}

	@OriginalMember(owner = "client!ry", name = "b", descriptor = "()Z")
	public boolean method31103() {
		return this.aBoolean812;
	}

	@OriginalMember(owner = "client!ry", name = "h", descriptor = "()Lclient!rl;")
	public Class532 method31104() {
		return this.aClass532_2;
	}

	@OriginalMember(owner = "client!ry", name = "g", descriptor = "(Lclient!rl;)V")
	void method31105(@OriginalArg(0) Class532 arg0) {
		this.aClass532_2 = arg0;
	}

	@OriginalMember(owner = "client!ry", name = "i", descriptor = "()V")
	void method31106() {
		@Pc(1) Class537 local1 = null;
		@Pc(5) LinkedList local5 = this.aLinkedList4;
		synchronized (this.aLinkedList4) {
			try {
				this.aLinkedList4.wait();
			} catch (@Pc(11) InterruptedException local11) {
			}
			local1 = (Class537) this.aLinkedList4.pollFirst();
		}
		try {
			if (local1 != null) {
				this.aBoolean812 = true;
				this.method31098(local1, -246378460);
			}
		} catch (@Pc(39) Exception local39) {
		} finally {
			this.aBoolean812 = false;
		}
	}

	@OriginalMember(owner = "client!ry", name = "j", descriptor = "(Lclient!rt;)V")
	void method31107(@OriginalArg(0) Class537 arg0) {
		if (arg0.aClass526_11 == Class526.aClass526_7) {
			this.aClass532_2.method30650((byte) 0);
		} else {
			this.aClass532_2.method30646(arg0, 938984196);
		}
		for (@Pc(18) boolean local18 = this.aClass532_2.method30620((byte) 86); !local18; local18 = this.aClass532_2.method30620((byte) 86)) {
		}
		this.aClass532_2.method30626(1213218812);
		client.aClass532_1.method30626(1213218812);
	}

	@OriginalMember(owner = "client!ry", name = "t", descriptor = "(Lclient!rt;)V")
	void method31108(@OriginalArg(0) Class537 arg0) {
		if (arg0.aClass526_11 == Class526.aClass526_7) {
			this.aClass532_2.method30650((byte) 0);
		} else {
			this.aClass532_2.method30646(arg0, 1001637900);
		}
		for (@Pc(18) boolean local18 = this.aClass532_2.method30620((byte) 27); !local18; local18 = this.aClass532_2.method30620((byte) 106)) {
		}
		this.aClass532_2.method30626(1213218812);
		client.aClass532_1.method30626(1213218812);
	}

	@OriginalMember(owner = "client!ry", name = "r", descriptor = "()V")
	public void method31109() {
		while (true) {
			this.method31097(65535);
		}
	}
}
