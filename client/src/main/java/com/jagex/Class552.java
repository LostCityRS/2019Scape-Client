package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sj")
public class Class552 {

	@OriginalMember(owner = "client!sj", name = "al", descriptor = "[Lclient!cm;")
	static Class100[] aClass100Array8;

	@OriginalMember(owner = "client!sj", name = "pt", descriptor = "I")
	public static int anInt5318;

	@OriginalMember(owner = "client!sj", name = "k", descriptor = "I")
	int anInt5315;

	@OriginalMember(owner = "client!sj", name = "n", descriptor = "I")
	int anInt5316;

	@OriginalMember(owner = "client!sj", name = "m", descriptor = "I")
	int anInt5317;

	@OriginalMember(owner = "client!sj", name = "e", descriptor = "[Lclient!sa;")
	Class544[] aClass544Array1;

	// $FF: synthetic field
	@OriginalMember(owner = "client!sj", name = "this$0", descriptor = "Lclient!sz;")
	final Class565 this$0;

	@OriginalMember(owner = "client!sj", name = "n", descriptor = "(Lclient!ase;II)V", line = 91)
	static final void method31036(@OriginalArg(0) Class93_Sub41_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Class174.anInt3292 = 0;
		Class127.method9259(arg0, 1545630625);
		Class1.method11(arg0, (byte) -24);
		if (arg0.anInt3070 * 212851357 != arg1) {
			throw new RuntimeException(arg0.anInt3070 * 212851357 + " " + arg1);
		}
	}

	@OriginalMember(owner = "client!sj", name = "g", descriptor = "(Lclient!yf;B)V", line = 183)
	static void method31037(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5891 -= -1915563430;
		arg0.anIntArray519[arg0.anInt5891 * -1497248091] = Class353.method27686(arg0.anIntArray519[arg0.anInt5891 * -1497248091], arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1], 2032532775);
		arg0.anInt5891 += 1189701933;
	}

	@OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(Lclient!sz;)V", line = 207)
	Class552(@OriginalArg(0) Class565 arg0) {
		this.this$0 = arg0;
	}

	@OriginalMember(owner = "client!sj", name = "e", descriptor = "(III)V", line = 210)
	void method31038(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass544Array1 != null && arg1 == this.anInt5316 * 1013448115 && this.anInt5317 * 2017352243 == arg0) {
			return;
		}
		this.anInt5317 = arg0 * -1573113605;
		this.anInt5315 = ((0x1 << arg0) - 1) * 1105343415;
		this.anInt5316 = arg1 * 329447803;
		@Pc(47) int local47 = 0x1 << this.anInt5317 * 2017352243 + this.anInt5316 * 1013448115;
		this.aClass544Array1 = new Class544[local47];
		for (@Pc(53) int local53 = 0; local53 < local47; local53++) {
			this.aClass544Array1[local53] = new Class544(this);
		}
	}

	@OriginalMember(owner = "client!sj", name = "k", descriptor = "(II)V", line = 210)
	void method31039(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass544Array1 != null && arg1 == this.anInt5316 * 1013448115 && this.anInt5317 * 2017352243 == arg0) {
			return;
		}
		this.anInt5317 = arg0 * -1573113605;
		this.anInt5315 = ((0x1 << arg0) - 1) * 1105343415;
		this.anInt5316 = arg1 * 329447803;
		@Pc(47) int local47 = 0x1 << this.anInt5317 * 2017352243 + this.anInt5316 * 1013448115;
		this.aClass544Array1 = new Class544[local47];
		for (@Pc(53) int local53 = 0; local53 < local47; local53++) {
			this.aClass544Array1[local53] = new Class544(this);
		}
	}

	@OriginalMember(owner = "client!sj", name = "w", descriptor = "()V", line = 220)
	void method31040() {
		@Pc(11) int local11 = 0x1 << this.anInt5316 * 1013448115 + this.anInt5317 * 2017352243;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			this.aClass544Array1[local13].method30950(-1389306394);
		}
	}

	@OriginalMember(owner = "client!sj", name = "f", descriptor = "()V", line = 220)
	void method31041() {
		@Pc(11) int local11 = 0x1 << this.anInt5316 * 1013448115 + this.anInt5317 * 2017352243;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			this.aClass544Array1[local13].method30950(-1298740145);
		}
	}

	@OriginalMember(owner = "client!sj", name = "l", descriptor = "()V", line = 220)
	void method31042() {
		@Pc(11) int local11 = 0x1 << this.anInt5316 * 1013448115 + this.anInt5317 * 2017352243;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			this.aClass544Array1[local13].method30950(338837355);
		}
	}

	@OriginalMember(owner = "client!sj", name = "n", descriptor = "(I)V", line = 220)
	void method31043(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = 0x1 << this.anInt5316 * 1013448115 + this.anInt5317 * 2017352243;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			this.aClass544Array1[local13].method30950(944517978);
		}
	}

	@OriginalMember(owner = "client!sj", name = "z", descriptor = "(IB)Lclient!sa;", line = 225)
	Class544 method31044(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return this.aClass544Array1[((arg1 & 0xFF) >>> 8 - this.anInt5316 * 1013448115) + ((arg0 & this.anInt5315 * 854596103) << this.anInt5316 * 1013448115)];
	}

	@OriginalMember(owner = "client!sj", name = "m", descriptor = "(IBI)Lclient!sa;", line = 225)
	Class544 method31045(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2) {
		return this.aClass544Array1[((arg1 & 0xFF) >>> 8 - this.anInt5316 * 1013448115) + ((arg0 & this.anInt5315 * 854596103) << this.anInt5316 * 1013448115)];
	}

	@OriginalMember(owner = "client!sj", name = "u", descriptor = "(IB)Lclient!sa;", line = 225)
	Class544 method31046(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return this.aClass544Array1[((arg1 & 0xFF) >>> 8 - this.anInt5316 * 1013448115) + ((arg0 & this.anInt5315 * 854596103) << this.anInt5316 * 1013448115)];
	}

	@OriginalMember(owner = "client!sj", name = "hm", descriptor = "(Lclient!ahm;IB)V", line = 4175)
	static void method31047(@OriginalArg(0) Class132_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		if (arg0.anIntArray236 == null) {
			return;
		}
		@Pc(9) Class707 local9 = (Class707) Class107.method18116(Class707.method36744(1800155645), arg1, -1915563430);
		@Pc(16) int local16 = arg0.anIntArray236[local9.method36749((byte) -92)];
		if (local16 != arg0.aClass19_3.method23564((byte) 124)) {
			arg0.aClass19_3.method23567(local16, arg0.aClass19_3.method23582((short) -20791), -849002901);
			arg0.anInt2760 = arg0.anInt2763 * 609116505;
		}
	}

	@OriginalMember(owner = "client!sj", name = "en", descriptor = "(Lclient!yf;I)V", line = 5838)
	static final void method31048(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32808(local12, 1240682464);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class644.method32602(local16, local22, arg0, (byte) -32);
	}
}
