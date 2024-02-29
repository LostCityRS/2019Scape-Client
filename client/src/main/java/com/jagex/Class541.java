package com.jagex;

import java.util.LinkedList;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ry")
public class Class541 implements Runnable {

	@OriginalMember(owner = "client!ry", name = "e", descriptor = "Z")
	volatile boolean aBoolean803 = false;

	@OriginalMember(owner = "client!ry", name = "n", descriptor = "Ljava/util/LinkedList;")
	LinkedList aLinkedList3 = new LinkedList();

	@OriginalMember(owner = "client!ry", name = "m", descriptor = "Lclient!rl;")
	Class532 aClass532_2 = new Class532(true);

	@OriginalMember(owner = "client!ry", name = "e", descriptor = "(Lclient!aop;I)V", line = 13)
	public void method30902(@OriginalArg(0) Class32_Sub14 arg0, @OriginalArg(1) int arg1) {
		this.aClass532_2.method30513(arg0, 2087680265);
	}

	@OriginalMember(owner = "client!ry", name = "u", descriptor = "(Lclient!aop;)V", line = 13)
	public void method30903(@OriginalArg(0) Class32_Sub14 arg0) {
		this.aClass532_2.method30513(arg0, 2087680265);
	}

	@OriginalMember(owner = "client!ry", name = "z", descriptor = "(Lclient!aop;)V", line = 13)
	public void method30904(@OriginalArg(0) Class32_Sub14 arg0) {
		this.aClass532_2.method30513(arg0, 2087680265);
	}

	@OriginalMember(owner = "client!ry", name = "d", descriptor = "(Lclient!rt;)V", line = 17)
	public void method30905(@OriginalArg(0) Class537 arg0) {
		@Pc(3) LinkedList local3 = this.aLinkedList3;
		synchronized (this.aLinkedList3) {
			this.aLinkedList3.add(arg0);
			this.aLinkedList3.notify();
		}
	}

	@OriginalMember(owner = "client!ry", name = "n", descriptor = "(Lclient!rt;B)V", line = 17)
	public void method30906(@OriginalArg(0) Class537 arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) LinkedList local3 = this.aLinkedList3;
		synchronized (this.aLinkedList3) {
			this.aLinkedList3.add(arg0);
			this.aLinkedList3.notify();
		}
	}

	@OriginalMember(owner = "client!ry", name = "p", descriptor = "(Lclient!rt;)V", line = 17)
	public void method30907(@OriginalArg(0) Class537 arg0) {
		@Pc(3) LinkedList local3 = this.aLinkedList3;
		synchronized (this.aLinkedList3) {
			this.aLinkedList3.add(arg0);
			this.aLinkedList3.notify();
		}
	}

	@OriginalMember(owner = "client!ry", name = "s", descriptor = "(Lclient!rt;)V", line = 17)
	public void method30908(@OriginalArg(0) Class537 arg0) {
		@Pc(3) LinkedList local3 = this.aLinkedList3;
		synchronized (this.aLinkedList3) {
			this.aLinkedList3.add(arg0);
			this.aLinkedList3.notify();
		}
	}

	@OriginalMember(owner = "client!ry", name = "y", descriptor = "(Lclient!rt;)V", line = 17)
	public void method30909(@OriginalArg(0) Class537 arg0) {
		@Pc(3) LinkedList local3 = this.aLinkedList3;
		synchronized (this.aLinkedList3) {
			this.aLinkedList3.add(arg0);
			this.aLinkedList3.notify();
		}
	}

	@OriginalMember(owner = "client!ry", name = "m", descriptor = "(I)Z", line = 24)
	public boolean method30910(@OriginalArg(0) int arg0) {
		return this.aBoolean803;
	}

	@OriginalMember(owner = "client!ry", name = "q", descriptor = "()Z", line = 24)
	public boolean method30911() {
		return this.aBoolean803;
	}

	@OriginalMember(owner = "client!ry", name = "x", descriptor = "()Z", line = 24)
	public boolean method30912() {
		return this.aBoolean803;
	}

	@OriginalMember(owner = "client!ry", name = "b", descriptor = "()Z", line = 24)
	public boolean method30913() {
		return this.aBoolean803;
	}

	@OriginalMember(owner = "client!ry", name = "k", descriptor = "(I)Lclient!rl;", line = 28)
	public Class532 method30914(@OriginalArg(0) int arg0) {
		return this.aClass532_2;
	}

	@OriginalMember(owner = "client!ry", name = "a", descriptor = "()Lclient!rl;", line = 28)
	public Class532 method30915() {
		return this.aClass532_2;
	}

	@OriginalMember(owner = "client!ry", name = "h", descriptor = "()Lclient!rl;", line = 28)
	public Class532 method30916() {
		return this.aClass532_2;
	}

	@OriginalMember(owner = "client!ry", name = "f", descriptor = "(Lclient!rl;I)V", line = 32)
	void method30917(@OriginalArg(0) Class532 arg0, @OriginalArg(1) int arg1) {
		this.aClass532_2 = arg0;
	}

	@OriginalMember(owner = "client!ry", name = "g", descriptor = "(Lclient!rl;)V", line = 32)
	void method30918(@OriginalArg(0) Class532 arg0) {
		this.aClass532_2 = arg0;
	}

	@OriginalMember(owner = "client!ry", name = "run", descriptor = "()V", line = 37)
	@Override
	public void run() {
		while (true) {
			this.method30923(65535);
		}
	}

	@OriginalMember(owner = "client!ry", name = "c", descriptor = "()V", line = 37)
	public void method30919() {
		while (true) {
			this.method30923(65535);
		}
	}

	@OriginalMember(owner = "client!ry", name = "v", descriptor = "()V", line = 37)
	public void method30920() {
		while (true) {
			this.method30923(65535);
		}
	}

	@OriginalMember(owner = "client!ry", name = "o", descriptor = "()V", line = 37)
	public void method30921() {
		while (true) {
			this.method30923(65535);
		}
	}

	@OriginalMember(owner = "client!ry", name = "r", descriptor = "()V", line = 37)
	public void method30922() {
		while (true) {
			this.method30923(65535);
		}
	}

	@OriginalMember(owner = "client!ry", name = "w", descriptor = "(I)V", line = 42)
	void method30923(@OriginalArg(0) int arg0) {
		@Pc(1) Class537 local1 = null;
		@Pc(5) LinkedList local5 = this.aLinkedList3;
		synchronized (this.aLinkedList3) {
			try {
				this.aLinkedList3.wait();
			} catch (@Pc(11) InterruptedException local11) {
			}
			local1 = (Class537) this.aLinkedList3.pollFirst();
		}
		try {
			if (local1 != null) {
				this.aBoolean803 = true;
				this.method30926(local1, -246378460);
			}
		} catch (@Pc(39) Exception local39) {
		} finally {
			this.aBoolean803 = false;
		}
	}

	@OriginalMember(owner = "client!ry", name = "i", descriptor = "()V", line = 42)
	void method30924() {
		@Pc(1) Class537 local1 = null;
		@Pc(5) LinkedList local5 = this.aLinkedList3;
		synchronized (this.aLinkedList3) {
			try {
				this.aLinkedList3.wait();
			} catch (@Pc(11) InterruptedException local11) {
			}
			local1 = (Class537) this.aLinkedList3.pollFirst();
		}
		try {
			if (local1 != null) {
				this.aBoolean803 = true;
				this.method30926(local1, -246378460);
			}
		} catch (@Pc(39) Exception local39) {
		} finally {
			this.aBoolean803 = false;
		}
	}

	@OriginalMember(owner = "client!ry", name = "ae", descriptor = "(Lclient!rt;)V", line = 63)
	void method30925(@OriginalArg(0) Class537 arg0) {
		if (arg0.aClass526_11 == Class526.aClass526_7) {
			this.aClass532_2.method30533((byte) 0);
		} else {
			this.aClass532_2.method30540(arg0, 439366062);
		}
		for (@Pc(18) boolean local18 = this.aClass532_2.method30577((byte) 57); !local18; local18 = this.aClass532_2.method30577((byte) 119)) {
		}
		this.aClass532_2.method30520(1213218812);
		client.aClass532_1.method30520(1213218812);
	}

	@OriginalMember(owner = "client!ry", name = "l", descriptor = "(Lclient!rt;I)V", line = 63)
	void method30926(@OriginalArg(0) Class537 arg0, @OriginalArg(1) int arg1) {
		if (arg0.aClass526_11 == Class526.aClass526_7) {
			this.aClass532_2.method30533((byte) 0);
		} else {
			this.aClass532_2.method30540(arg0, -1635529773);
		}
		for (@Pc(18) boolean local18 = this.aClass532_2.method30577((byte) 58); !local18; local18 = this.aClass532_2.method30577((byte) 71)) {
		}
		this.aClass532_2.method30520(1213218812);
		client.aClass532_1.method30520(1213218812);
	}

	@OriginalMember(owner = "client!ry", name = "j", descriptor = "(Lclient!rt;)V", line = 63)
	void method30927(@OriginalArg(0) Class537 arg0) {
		if (arg0.aClass526_11 == Class526.aClass526_7) {
			this.aClass532_2.method30533((byte) 0);
		} else {
			this.aClass532_2.method30540(arg0, 938984196);
		}
		for (@Pc(18) boolean local18 = this.aClass532_2.method30577((byte) 86); !local18; local18 = this.aClass532_2.method30577((byte) 86)) {
		}
		this.aClass532_2.method30520(1213218812);
		client.aClass532_1.method30520(1213218812);
	}

	@OriginalMember(owner = "client!ry", name = "t", descriptor = "(Lclient!rt;)V", line = 63)
	void method30928(@OriginalArg(0) Class537 arg0) {
		if (arg0.aClass526_11 == Class526.aClass526_7) {
			this.aClass532_2.method30533((byte) 0);
		} else {
			this.aClass532_2.method30540(arg0, 1001637900);
		}
		for (@Pc(18) boolean local18 = this.aClass532_2.method30577((byte) 27); !local18; local18 = this.aClass532_2.method30577((byte) 106)) {
		}
		this.aClass532_2.method30520(1213218812);
		client.aClass532_1.method30520(1213218812);
	}

	@OriginalMember(owner = "client!ry", name = "fn", descriptor = "(Lclient!yf;I)V", line = 5905)
	static final void method30929(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class583.method31421(local11, local14, arg0, 1860815549);
	}

	@OriginalMember(owner = "client!ry", name = "acc", descriptor = "(Lclient!yf;B)V", line = 9994)
	static final void method30930(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = arg0.aClass386_3.aByte151;
	}
}
