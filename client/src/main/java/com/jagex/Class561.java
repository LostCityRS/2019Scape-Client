package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!su")
public class Class561 {

	@OriginalMember(owner = "client!su", name = "e", descriptor = "Ljava/lang/String;")
	String aString227;

	@OriginalMember(owner = "client!su", name = "f", descriptor = "I")
	int anInt5334;

	@OriginalMember(owner = "client!su", name = "m", descriptor = "I")
	int anInt5335;

	@OriginalMember(owner = "client!su", name = "k", descriptor = "I")
	int anInt5336;

	@OriginalMember(owner = "client!su", name = "n", descriptor = "I")
	int anInt5337;

	@OriginalMember(owner = "client!su", name = "<init>", descriptor = "()V", line = 705)
	Class561() {
	}

	@OriginalMember(owner = "client!su", name = "e", descriptor = "(I)Ljava/lang/String;", line = 708)
	public String method31137(@OriginalArg(0) int arg0) {
		return this.aString227;
	}

	@OriginalMember(owner = "client!su", name = "w", descriptor = "()Ljava/lang/String;", line = 708)
	public String method31138() {
		return this.aString227;
	}

	@OriginalMember(owner = "client!su", name = "l", descriptor = "()Ljava/lang/String;", line = 708)
	public String method31139() {
		return this.aString227;
	}

	@OriginalMember(owner = "client!su", name = "n", descriptor = "(B)I", line = 712)
	public int method31140(@OriginalArg(0) byte arg0) {
		return this.anInt5337 * 1333148365;
	}

	@OriginalMember(owner = "client!su", name = "u", descriptor = "()I", line = 712)
	public int method31141() {
		return this.anInt5337 * 1333148365;
	}

	@OriginalMember(owner = "client!su", name = "z", descriptor = "()I", line = 712)
	public int method31142() {
		return this.anInt5337 * 1333148365;
	}

	@OriginalMember(owner = "client!su", name = "m", descriptor = "(B)I", line = 716)
	public int method31143(@OriginalArg(0) byte arg0) {
		return this.anInt5335 * 1277858807;
	}

	@OriginalMember(owner = "client!su", name = "p", descriptor = "()I", line = 716)
	public int method31144() {
		return this.anInt5335 * 1277858807;
	}

	@OriginalMember(owner = "client!su", name = "d", descriptor = "()I", line = 716)
	public int method31145() {
		return this.anInt5335 * 1277858807;
	}

	@OriginalMember(owner = "client!su", name = "k", descriptor = "(B)I", line = 720)
	public int method31146(@OriginalArg(0) byte arg0) {
		return this.anInt5336 * 257860031;
	}

	@OriginalMember(owner = "client!su", name = "c", descriptor = "()I", line = 720)
	public int method31147() {
		return this.anInt5336 * 257860031;
	}

	@OriginalMember(owner = "client!su", name = "r", descriptor = "()I", line = 720)
	public int method31148() {
		return this.anInt5336 * 257860031;
	}

	@OriginalMember(owner = "client!su", name = "f", descriptor = "(I)I", line = 724)
	public int method31149(@OriginalArg(0) int arg0) {
		return this.anInt5334 * -1747829505;
	}

	@OriginalMember(owner = "client!su", name = "kd", descriptor = "(Lclient!hf;IILclient!yf;I)V", line = 6838)
	static final void method31150(@OriginalArg(0) Class312 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class681 arg3, @OriginalArg(4) int arg4) {
		if (arg0.anIntArray377 == null) {
			if (arg2 <= 0) {
				return;
			}
			arg0.aByteArrayArray14 = new byte[11][];
			arg0.aByteArrayArray15 = new byte[11][];
			arg0.anIntArray373 = new int[11];
			arg0.anIntArray375 = new int[11];
			arg0.anIntArray377 = new int[11];
		}
		arg0.anIntArray377[arg1] = arg2;
		if (arg2 > 0) {
			arg0.aBoolean698 = true;
			return;
		}
		arg0.aBoolean698 = false;
		for (@Pc(43) int local43 = 0; local43 < arg0.aByteArrayArray14.length; local43++) {
			if (arg0.aByteArrayArray14[local43] != null || arg0.anIntArray377[local43] > 0) {
				arg0.aBoolean698 = true;
				break;
			}
		}
	}

	@OriginalMember(owner = "client!su", name = "qk", descriptor = "(Lclient!yf;I)V", line = 8032)
	static final void method31151(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class57.method1089(local11, local14, arg0, 65534);
	}

	@OriginalMember(owner = "client!su", name = "wd", descriptor = "(Lclient!yf;I)V", line = 9071)
	static final void method31152(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= -1915563430;
		@Pc(17) Class93_Sub1_Sub2 local17 = (Class93_Sub1_Sub2) Class638.aClass32_Sub22_1.get(arg0.anIntArray519[arg0.anInt5891 * -1497248091], -1949164151);
		@Pc(27) int local27 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		@Pc(29) int local29 = -1;
		for (@Pc(31) int local31 = 0; local31 < local17.anInt317 * 795395889; local31++) {
			if (local17.anIntArray25[local31] == local27) {
				local29 = local17.anIntArray24[local31];
				break;
			}
		}
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local29;
	}
}
