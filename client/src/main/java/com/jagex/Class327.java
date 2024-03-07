package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hx")
public class Class327 {

	@OriginalMember(owner = "client!hx", name = "gq", descriptor = "Lclient!py;")
	public static Class497 aClass497_102;

	@OriginalMember(owner = "client!hx", name = "e", descriptor = "I")
	public final int anInt4140;

	@OriginalMember(owner = "client!hx", name = "n", descriptor = "I")
	public final int anInt4141;

	@OriginalMember(owner = "client!hx", name = "m", descriptor = "[I")
	public final int[] anIntArray407;

	@OriginalMember(owner = "client!hx", name = "k", descriptor = "[I")
	public final int[] anIntArray406;

	@OriginalMember(owner = "client!hx", name = "f", descriptor = "Lclient!ch;")
	public final Class96 aClass96_1;

	@OriginalMember(owner = "client!hx", name = "w", descriptor = "I")
	final int anInt4142;

	@OriginalMember(owner = "client!hx", name = "<init>", descriptor = "(II[I[ILclient!ch;I)V", line = 926)
	Class327(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) Class96 arg4, @OriginalArg(5) int arg5) {
		this.anInt4140 = arg0 * -1438346399;
		this.anInt4141 = arg1 * -1311771989;
		this.anIntArray407 = arg2;
		this.anIntArray406 = arg3;
		this.aClass96_1 = arg4;
		this.anInt4142 = arg5 * -1913132541;
	}

	@OriginalMember(owner = "client!hx", name = "e", descriptor = "(IIB)Z", line = 936)
	public boolean method27314(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		if (arg1 >= 0 && arg1 < this.anIntArray406.length) {
			@Pc(11) int local11 = this.anIntArray406[arg1];
			if (arg0 >= local11 && arg0 <= local11 + this.anIntArray407[arg1]) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!hx", name = "n", descriptor = "(II)Z", line = 936)
	public boolean method27315(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 >= 0 && arg1 < this.anIntArray406.length) {
			@Pc(11) int local11 = this.anIntArray406[arg1];
			if (arg0 >= local11 && arg0 <= local11 + this.anIntArray407[arg1]) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!hx", name = "m", descriptor = "(II)Z", line = 936)
	public boolean method27316(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 >= 0 && arg1 < this.anIntArray406.length) {
			@Pc(11) int local11 = this.anIntArray406[arg1];
			if (arg0 >= local11 && arg0 <= local11 + this.anIntArray407[arg1]) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!hx", name = "k", descriptor = "(II)Z", line = 936)
	public boolean method27317(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 >= 0 && arg1 < this.anIntArray406.length) {
			@Pc(11) int local11 = this.anIntArray406[arg1];
			if (arg0 >= local11 && arg0 <= local11 + this.anIntArray407[arg1]) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!hx", name = "cy", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;B)V", line = 5440)
	static final void method27318(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) byte arg3) {
		arg0.anInt3994 = arg2.anIntArray519[(arg2.anInt5891 -= 1189701933) * -1497248091] * 1952867347;
		Class354.method27694(arg0, -1174743804);
	}

	@OriginalMember(owner = "client!hx", name = "wv", descriptor = "(Lclient!yf;S)V", line = 9009)
	static final void method27319(@OriginalArg(0) Class681 arg0, @OriginalArg(1) short arg1) {
		arg0.anInt5891 -= 1189701933;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		Class274.aClass258_1.method26054(local13, -1334453224);
	}

	@OriginalMember(owner = "client!hx", name = "afm", descriptor = "(Lclient!yf;B)V", line = 10502)
	static final void method27320(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = Class14.method192(Class41.method815(arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091], 424376929), Class106.lang.getId(), -2123126678);
	}

	@OriginalMember(owner = "client!hx", name = "agf", descriptor = "(Lclient!yf;S)V", line = 10685)
	static final void method27321(@OriginalArg(0) Class681 arg0, @OriginalArg(1) short arg1) {
		arg0.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		@Pc(29) Class47 local29 = (Class47) Class277.aClass32_Sub12_1.get(local13, 1072665738);
		if (local23 < 1 || local23 > 5 || local29.aStringArray4[local23 - 1] == null) {
			arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = "";
		} else {
			arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = local29.aStringArray4[local23 - 1];
		}
	}
}
