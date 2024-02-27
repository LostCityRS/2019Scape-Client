package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hm")
public final class Class318 {

	@OriginalMember(owner = "client!hm", name = "t", descriptor = "[B")
	byte[] aByteArray80;

	@OriginalMember(owner = "client!hm", name = "f", descriptor = "I")
	int anInt4025;

	@OriginalMember(owner = "client!hm", name = "v", descriptor = "(Lclient!yp;I)V")
	static void method27522(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = arg0.anIntArray526[arg0.anInt5780 * -1336568839];
	}

	@OriginalMember(owner = "client!hm", name = "ce", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;B)V")
	static void method27523(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) byte arg3) {
		arg0.aBoolean801 = arg2.anIntArray525[(arg2.anInt5778 -= 2036747717) * 1896589581] == 1;
	}

	@OriginalMember(owner = "client!hm", name = "agl", descriptor = "(Lclient!yp;I)V")
	static void method27524(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = ((Class43) Class25.aClass41_Sub9_1.method18054(local12, -313014306)).anInt144 * -1475410443;
	}

	@OriginalMember(owner = "client!hm", name = "apq", descriptor = "(Lclient!yp;I)V")
	static void method27525(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		if (BufferedSocket.aClass121_Sub1_2.method9702(1167114577) != Class347.aClass347_7) {
			throw new RuntimeException();
		}
		((Class20_Sub3) BufferedSocket.aClass121_Sub1_2.method9693(2134851426)).method16634(arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581], (byte) -74);
	}

	@OriginalMember(owner = "client!hm", name = "arn", descriptor = "(Lclient!yp;I)V")
	static void method27526(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub4_1, arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581] == 1 ? 1 : 0, (byte) 26);
		Class522.method30640(-849479946);
		client.aClass539_1.method30904((byte) -30).method33382(205935640);
		Class719.method37291(-692032957);
		client.aBoolean714 = false;
	}

	@OriginalMember(owner = "client!hm", name = "bdm", descriptor = "(Lclient!yp;B)V")
	static void method27527(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = client.aClass274_1.method26792(local13, 326461728).method26716(local23, 812643644);
	}

	@OriginalMember(owner = "client!hm", name = "<init>", descriptor = "([B)V")
	Class318(@OriginalArg(0) byte[] arg0) {
		this.aByteArray80 = arg0;
		this.anInt4025 = 0;
	}

	@OriginalMember(owner = "client!hm", name = "e", descriptor = "()I")
	int method27517() {
		@Pc(1) short local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 2; local3++) {
			local1 = (short) (local1 | (this.aByteArray80[(this.anInt4025 += -1528277971) * -1568334939 - 1] & 0xFF) << local3 * 8);
		}
		return local1;
	}

	@OriginalMember(owner = "client!hm", name = "u", descriptor = "()Ljava/lang/String;")
	String method27518() {
		@Pc(3) int local3 = this.method27520(-2087818789);
		if (local3 == -1) {
			return null;
		} else if (local3 > 256) {
			throw new RuntimeException_Sub2();
		} else {
			@Pc(26) String local26 = new String(this.aByteArray80, this.anInt4025 * -1568334939, local3);
			this.anInt4025 += local3 * -1528277971;
			return local26;
		}
	}

	@OriginalMember(owner = "client!hm", name = "f", descriptor = "(B)Ljava/lang/String;")
	String method27519(@OriginalArg(0) byte arg0) {
		@Pc(3) int local3 = this.method27520(-2082089897);
		if (local3 == -1) {
			return null;
		} else if (local3 > 256) {
			throw new RuntimeException_Sub2();
		} else {
			@Pc(26) String local26 = new String(this.aByteArray80, this.anInt4025 * -1568334939, local3);
			this.anInt4025 += local3 * -1528277971;
			return local26;
		}
	}

	@OriginalMember(owner = "client!hm", name = "t", descriptor = "(I)I")
	int method27520(@OriginalArg(0) int arg0) {
		@Pc(1) short local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 2; local3++) {
			local1 = (short) (local1 | (this.aByteArray80[(this.anInt4025 += -1528277971) * -1568334939 - 1] & 0xFF) << local3 * 8);
		}
		return local1;
	}

	@OriginalMember(owner = "client!hm", name = "l", descriptor = "()Ljava/lang/String;")
	String method27521() {
		@Pc(3) int local3 = this.method27520(-1820549771);
		if (local3 == -1) {
			return null;
		} else if (local3 > 256) {
			throw new RuntimeException_Sub2();
		} else {
			@Pc(26) String local26 = new String(this.aByteArray80, this.anInt4025 * -1568334939, local3);
			this.anInt4025 += local3 * -1528277971;
			return local26;
		}
	}
}
