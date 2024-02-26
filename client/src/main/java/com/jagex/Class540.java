package com.jagex;

import java.awt.Font;
import java.util.LinkedList;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rx")
public final class Class540 implements Runnable {

	@OriginalMember(owner = "client!rx", name = "d", descriptor = "Ljava/awt/Font;")
	static Font aFont2;

	@OriginalMember(owner = "client!rx", name = "t", descriptor = "Z")
	volatile boolean aBoolean895 = false;

	@OriginalMember(owner = "client!rx", name = "f", descriptor = "Ljava/util/LinkedList;")
	LinkedList aLinkedList3 = new LinkedList();

	@OriginalMember(owner = "client!rx", name = "e", descriptor = "Lclient!rw;")
	Class539 aClass539_2 = new Class539(true);

	@OriginalMember(owner = "client!rx", name = "ajx", descriptor = "(Lclient!yp;I)V")
	static void method31058(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class358.method28127(-1895806741);
	}

	@OriginalMember(owner = "client!rx", name = "bdj", descriptor = "(Lclient!yp;I)V")
	static void method31059(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(18) Class712 local18 = (Class712) Class80_Sub39.method15030(Class712.method37173(361447076), arg0.anIntArray525[arg0.anInt5778 * 1896589581], -1476635773);
		@Pc(31) Class626 local31 = new Class626(arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1]);
		if (local31.anInt5538 * -990975809 == -1) {
			throw new RuntimeException("");
		} else if (local18 != Class712.aClass712_1 && local18 != Class712.aClass712_2 && local18 != Class712.aClass712_5) {
			throw new RuntimeException("");
		} else if (client.aClass75_1 != null) {
			@Pc(65) Class80_Sub31 local65 = Class623.method32440(Class443.aClass443_90, client.aClass75_1.aClass22_1, -191270971);
			local65.aPacketBit_2.p2(local31.anInt5537 * -894305615);
			local65.aPacketBit_2.p2(local31.anInt5540 * -390642507);
			local65.aPacketBit_2.p1_alt2(local18.method37268());
			client.aClass75_1.method1325(local65, (byte) -34);
		}
	}

	@OriginalMember(owner = "client!rx", name = "f", descriptor = "(IB)Lclient!iq;")
	public static Class345 method31060(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(2) Class345[] local2 = Class595.method31974(-1152427209);
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class345 local12 = local2[local4];
			if (local12.anInt4247 * 659011863 == arg0) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!rx", name = "rr", descriptor = "(Lclient!yp;B)V")
	static void method31061(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		@Pc(19) Class327 local19 = Class165_Sub45.method16896(local14, local11, -514653960);
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local19 == null ? -1 : -2053489901 * local19.anInt4087;
	}

	@OriginalMember(owner = "client!rx", name = "s", descriptor = "(Lclient!rz;)V")
	public void method31038(@OriginalArg(0) Class542 arg0) {
		@Pc(3) LinkedList local3 = this.aLinkedList3;
		synchronized (this.aLinkedList3) {
			this.aLinkedList3.add(arg0);
			this.aLinkedList3.notify();
		}
	}

	@OriginalMember(owner = "client!rx", name = "f", descriptor = "(Lclient!rz;I)V")
	public void method31039(@OriginalArg(0) Class542 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) LinkedList local3 = this.aLinkedList3;
		synchronized (this.aLinkedList3) {
			this.aLinkedList3.add(arg0);
			this.aLinkedList3.notify();
		}
	}

	@OriginalMember(owner = "client!rx", name = "m", descriptor = "(Lclient!aod;)V")
	public void method31040(@OriginalArg(0) Class41_Sub3 arg0) {
		this.aClass539_2.method30911(arg0, -533218849);
	}

	@OriginalMember(owner = "client!rx", name = "e", descriptor = "(I)Z")
	public boolean method31041(@OriginalArg(0) int arg0) {
		return this.aBoolean895;
	}

	@OriginalMember(owner = "client!rx", name = "g", descriptor = "(B)V")
	void method31042(@OriginalArg(0) byte arg0) {
		@Pc(1) Class542 local1 = null;
		@Pc(5) LinkedList local5 = this.aLinkedList3;
		synchronized (this.aLinkedList3) {
			try {
				this.aLinkedList3.wait();
			} catch (@Pc(11) InterruptedException local11) {
			}
			local1 = (Class542) this.aLinkedList3.pollFirst();
		}
		try {
			if (local1 != null) {
				this.aBoolean895 = true;
				this.method31046(local1, (byte) 0);
			}
		} catch (@Pc(39) Exception local39) {
		} finally {
			this.aBoolean895 = false;
		}
	}

	@OriginalMember(owner = "client!rx", name = "l", descriptor = "(Lclient!rw;I)V")
	void method31043(@OriginalArg(0) Class539 arg0, @OriginalArg(1) int arg1) {
		this.aClass539_2 = arg0;
	}

	@OriginalMember(owner = "client!rx", name = "t", descriptor = "(Lclient!aod;I)V")
	public void method31044(@OriginalArg(0) Class41_Sub3 arg0, @OriginalArg(1) int arg1) {
		this.aClass539_2.method30911(arg0, -1097210157);
	}

	@OriginalMember(owner = "client!rx", name = "a", descriptor = "(Lclient!rz;)V")
	public void method31045(@OriginalArg(0) Class542 arg0) {
		@Pc(3) LinkedList local3 = this.aLinkedList3;
		synchronized (this.aLinkedList3) {
			this.aLinkedList3.add(arg0);
			this.aLinkedList3.notify();
		}
	}

	@OriginalMember(owner = "client!rx", name = "i", descriptor = "(Lclient!rz;B)V")
	void method31046(@OriginalArg(0) Class542 arg0, @OriginalArg(1) byte arg1) {
		if (arg0.aClass536_11 == Class536.aClass536_6) {
			this.aClass539_2.method30938(152831895);
		} else {
			this.aClass539_2.method30920(arg0, (byte) 9);
		}
		for (@Pc(18) boolean local18 = this.aClass539_2.method30941(636167455); !local18; local18 = this.aClass539_2.method30941(535023520)) {
		}
		this.aClass539_2.method30914((byte) 54);
		client.aClass539_1.method30914((byte) 18);
	}

	@OriginalMember(owner = "client!rx", name = "q", descriptor = "()V")
	public void method31047() {
		while (true) {
			this.method31042((byte) -5);
		}
	}

	@OriginalMember(owner = "client!rx", name = "h", descriptor = "()V")
	public void method31048() {
		while (true) {
			this.method31042((byte) -22);
		}
	}

	@OriginalMember(owner = "client!rx", name = "o", descriptor = "(Lclient!aod;)V")
	public void method31049(@OriginalArg(0) Class41_Sub3 arg0) {
		this.aClass539_2.method30911(arg0, -1847990040);
	}

	@OriginalMember(owner = "client!rx", name = "j", descriptor = "(Lclient!rz;)V")
	public void method31050(@OriginalArg(0) Class542 arg0) {
		@Pc(3) LinkedList local3 = this.aLinkedList3;
		synchronized (this.aLinkedList3) {
			this.aLinkedList3.add(arg0);
			this.aLinkedList3.notify();
		}
	}

	@OriginalMember(owner = "client!rx", name = "d", descriptor = "(Lclient!rw;)V")
	void method31051(@OriginalArg(0) Class539 arg0) {
		this.aClass539_2 = arg0;
	}

	@OriginalMember(owner = "client!rx", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			this.method31042((byte) -75);
		}
	}

	@OriginalMember(owner = "client!rx", name = "k", descriptor = "()Z")
	public boolean method31052() {
		return this.aBoolean895;
	}

	@OriginalMember(owner = "client!rx", name = "x", descriptor = "()Z")
	public boolean method31053() {
		return this.aBoolean895;
	}

	@OriginalMember(owner = "client!rx", name = "w", descriptor = "()Lclient!rw;")
	public Class539 method31054() {
		return this.aClass539_2;
	}

	@OriginalMember(owner = "client!rx", name = "r", descriptor = "()Lclient!rw;")
	public Class539 method31055() {
		return this.aClass539_2;
	}

	@OriginalMember(owner = "client!rx", name = "u", descriptor = "(I)Lclient!rw;")
	public Class539 method31056(@OriginalArg(0) int arg0) {
		return this.aClass539_2;
	}

	@OriginalMember(owner = "client!rx", name = "z", descriptor = "(Lclient!rw;)V")
	void method31057(@OriginalArg(0) Class539 arg0) {
		this.aClass539_2 = arg0;
	}
}
