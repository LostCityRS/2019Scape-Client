package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ww")
public final class Class650 {

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "Lclient!ald;")
	static Packet aPacket_17;

	@OriginalMember(owner = "client!ww", name = "j", descriptor = "I")
	static int anInt5656;

	@OriginalMember(owner = "client!ww", name = "t", descriptor = "Lclient!ve;")
	public Interface67 anInterface67_5;

	@OriginalMember(owner = "client!ww", name = "pt", descriptor = "(Lclient!yp;B)V")
	static void method33121(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2054251324);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class608.method32187(local16, local22, arg0, 766364935);
	}

	@OriginalMember(owner = "client!ww", name = "afe", descriptor = "(Lclient!yp;I)V")
	static void method33122(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray46[(arg0.anInt5776 -= -825189621) * -2070619997];
		@Pc(26) int local26 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		if (local26 == -1) {
			throw new RuntimeException("");
		}
		arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = local13 + (char) local26;
	}

	@OriginalMember(owner = "client!ww", name = "beb", descriptor = "(Lclient!yp;I)V")
	static void method33123(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= 2036747717;
	}

	@OriginalMember(owner = "client!ww", name = "w", descriptor = "(CI)Z")
	public static boolean method33124(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
		return arg0 >= '0' && arg0 <= '9';
	}

	@OriginalMember(owner = "client!ww", name = "<init>", descriptor = "(Lclient!pf;)V")
	public Class650(@OriginalArg(0) Class480 arg0) {
		@Pc(9) byte[] local9 = arg0.method29926(Class639.aClass639_1.anInt5637 * 1101033235, 1472047355);
		if (local9 != null) {
			this.method33118(new Packet(local9), (short) -11012);
		}
	}

	@OriginalMember(owner = "client!ww", name = "t", descriptor = "(Lclient!ald;S)V")
	void method33118(@OriginalArg(0) Packet arg0, @OriginalArg(1) short arg1) {
		while (true) {
			@Pc(3) int local3 = arg0.g1();
			if (local3 == 0) {
				return;
			}
			if (local3 == 1) {
				this.anInterface67_5 = Class567.method31521(arg0, (byte) -8);
			}
		}
	}

	@OriginalMember(owner = "client!ww", name = "e", descriptor = "(Lclient!ald;)V")
	void method33119(@OriginalArg(0) Packet arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.g1();
			if (local3 == 0) {
				return;
			}
			if (local3 == 1) {
				this.anInterface67_5 = Class567.method31521(arg0, (byte) -66);
			}
		}
	}

	@OriginalMember(owner = "client!ww", name = "f", descriptor = "(Lclient!ald;)V")
	void method33120(@OriginalArg(0) Packet arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.g1();
			if (local3 == 0) {
				return;
			}
			if (local3 == 1) {
				this.anInterface67_5 = Class567.method31521(arg0, (byte) -107);
			}
		}
	}
}
