package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hw")
public final class Class326 {

	@OriginalMember(owner = "client!hw", name = "e", descriptor = "[B")
	byte[] aByteArray81;

	@OriginalMember(owner = "client!hw", name = "n", descriptor = "I")
	int anInt4180;

	@OriginalMember(owner = "client!hw", name = "ar", descriptor = "(Lclient!yf;B)V")
	static void method27404(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anObjectArray44[arg0.anIntArray522[arg0.anInt6050 * -709694321]] = arg0.anObjectArray45[(arg0.anInt6049 -= 957530791) * 587908375];
	}

	@OriginalMember(owner = "client!hw", name = "mj", descriptor = "(Lclient!yf;B)V")
	static void method27405(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class123_Sub1.method9094(local11, local14, arg0, (byte) 0);
	}

	@OriginalMember(owner = "client!hw", name = "po", descriptor = "(Lclient!yf;B)V")
	static void method27406(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class332.method27486(local11, local14, arg0, (byte) -12);
	}

	@OriginalMember(owner = "client!hw", name = "<init>", descriptor = "([B)V")
	Class326(@OriginalArg(0) byte[] arg0) {
		this.aByteArray81 = arg0;
		this.anInt4180 = 0;
	}

	@OriginalMember(owner = "client!hw", name = "w", descriptor = "()Ljava/lang/String;")
	String method27398() {
		@Pc(3) int local3 = this.method27399(739479950);
		if (local3 == -1) {
			return null;
		} else if (local3 > 256) {
			throw new RuntimeException_Sub4();
		} else {
			@Pc(26) String local26 = new String(this.aByteArray81, this.anInt4180 * 104240131, local3);
			this.anInt4180 += local3 * -803490133;
			return local26;
		}
	}

	@OriginalMember(owner = "client!hw", name = "e", descriptor = "(I)I")
	int method27399(@OriginalArg(0) int arg0) {
		@Pc(1) short local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 2; local3++) {
			local1 = (short) (local1 | (this.aByteArray81[(this.anInt4180 += -803490133) * 104240131 - 1] & 0xFF) << local3 * 8);
		}
		return local1;
	}

	@OriginalMember(owner = "client!hw", name = "n", descriptor = "(I)Ljava/lang/String;")
	String method27400(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = this.method27399(2052350110);
		if (local3 == -1) {
			return null;
		} else if (local3 > 256) {
			throw new RuntimeException_Sub4();
		} else {
			@Pc(26) String local26 = new String(this.aByteArray81, this.anInt4180 * 104240131, local3);
			this.anInt4180 += local3 * -803490133;
			return local26;
		}
	}

	@OriginalMember(owner = "client!hw", name = "k", descriptor = "()I")
	int method27401() {
		@Pc(1) short local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 2; local3++) {
			local1 = (short) (local1 | (this.aByteArray81[(this.anInt4180 += -803490133) * 104240131 - 1] & 0xFF) << local3 * 8);
		}
		return local1;
	}

	@OriginalMember(owner = "client!hw", name = "f", descriptor = "()Ljava/lang/String;")
	String method27402() {
		@Pc(3) int local3 = this.method27399(1436308632);
		if (local3 == -1) {
			return null;
		} else if (local3 > 256) {
			throw new RuntimeException_Sub4();
		} else {
			@Pc(26) String local26 = new String(this.aByteArray81, this.anInt4180 * 104240131, local3);
			this.anInt4180 += local3 * -803490133;
			return local26;
		}
	}

	@OriginalMember(owner = "client!hw", name = "m", descriptor = "()I")
	int method27403() {
		@Pc(1) short local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 2; local3++) {
			local1 = (short) (local1 | (this.aByteArray81[(this.anInt4180 += -803490133) * 104240131 - 1] & 0xFF) << local3 * 8);
		}
		return local1;
	}
}
