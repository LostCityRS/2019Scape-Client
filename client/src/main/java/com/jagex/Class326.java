package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hw")
public class Class326 {

	@OriginalMember(owner = "client!hw", name = "e", descriptor = "[B")
	byte[] aByteArray81;

	@OriginalMember(owner = "client!hw", name = "n", descriptor = "I")
	int anInt4139;

	@OriginalMember(owner = "client!hw", name = "<init>", descriptor = "([B)V", line = 124)
	Class326(@OriginalArg(0) byte[] arg0) {
		this.aByteArray81 = arg0;
		this.anInt4139 = 0;
	}

	@OriginalMember(owner = "client!hw", name = "e", descriptor = "(I)I", line = 130)
	int method27305(@OriginalArg(0) int arg0) {
		@Pc(1) short local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 2; local3++) {
			local1 = (short) (local1 | (this.aByteArray81[(this.anInt4139 += -803490133) * 104240131 - 1] & 0xFF) << local3 * 8);
		}
		return local1;
	}

	@OriginalMember(owner = "client!hw", name = "k", descriptor = "()I", line = 130)
	int method27306() {
		@Pc(1) short local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 2; local3++) {
			local1 = (short) (local1 | (this.aByteArray81[(this.anInt4139 += -803490133) * 104240131 - 1] & 0xFF) << local3 * 8);
		}
		return local1;
	}

	@OriginalMember(owner = "client!hw", name = "m", descriptor = "()I", line = 130)
	int method27307() {
		@Pc(1) short local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 2; local3++) {
			local1 = (short) (local1 | (this.aByteArray81[(this.anInt4139 += -803490133) * 104240131 - 1] & 0xFF) << local3 * 8);
		}
		return local1;
	}

	@OriginalMember(owner = "client!hw", name = "w", descriptor = "()Ljava/lang/String;", line = 136)
	String method27308() {
		@Pc(3) int local3 = this.method27305(739479950);
		if (local3 == -1) {
			return null;
		} else if (local3 > 256) {
			throw new RuntimeException_Sub4();
		} else {
			@Pc(26) String local26 = new String(this.aByteArray81, this.anInt4139 * 104240131, local3);
			this.anInt4139 += local3 * -803490133;
			return local26;
		}
	}

	@OriginalMember(owner = "client!hw", name = "n", descriptor = "(I)Ljava/lang/String;", line = 136)
	String method27309(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = this.method27305(2052350110);
		if (local3 == -1) {
			return null;
		} else if (local3 > 256) {
			throw new RuntimeException_Sub4();
		} else {
			@Pc(26) String local26 = new String(this.aByteArray81, this.anInt4139 * 104240131, local3);
			this.anInt4139 += local3 * -803490133;
			return local26;
		}
	}

	@OriginalMember(owner = "client!hw", name = "f", descriptor = "()Ljava/lang/String;", line = 136)
	String method27310() {
		@Pc(3) int local3 = this.method27305(1436308632);
		if (local3 == -1) {
			return null;
		} else if (local3 > 256) {
			throw new RuntimeException_Sub4();
		} else {
			@Pc(26) String local26 = new String(this.aByteArray81, this.anInt4139 * 104240131, local3);
			this.anInt4139 += local3 * -803490133;
			return local26;
		}
	}

	@OriginalMember(owner = "client!hw", name = "ar", descriptor = "(Lclient!yf;B)V", line = 4955)
	static final void method27311(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anObjectArray44[arg0.anIntArray520[arg0.anInt5889 * -709694321]] = arg0.anObjectArray45[(arg0.anInt5888 -= 957530791) * 587908375];
	}

	@OriginalMember(owner = "client!hw", name = "mj", descriptor = "(Lclient!yf;B)V", line = 7309)
	static final void method27312(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class123_Sub1.method9094(local11, local14, arg0, (byte) 0);
	}

	@OriginalMember(owner = "client!hw", name = "po", descriptor = "(Lclient!yf;B)V", line = 7797)
	static final void method27313(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class332.method27393(local11, local14, arg0, (byte) -12);
	}
}
