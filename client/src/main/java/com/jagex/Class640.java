package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wm")
public class Class640 {

	@OriginalMember(owner = "client!wm", name = "aj", descriptor = "I")
	static int anInt5755;

	@OriginalMember(owner = "client!wm", name = "e", descriptor = "I")
	final int anInt5752;

	@OriginalMember(owner = "client!wm", name = "n", descriptor = "I")
	final int anInt5751;

	@OriginalMember(owner = "client!wm", name = "m", descriptor = "Z")
	boolean aBoolean855;

	@OriginalMember(owner = "client!wm", name = "w", descriptor = "Lclient!wd;")
	final Class634 aClass634_2;

	@OriginalMember(owner = "client!wm", name = "l", descriptor = "I")
	final int anInt5754;

	@OriginalMember(owner = "client!wm", name = "f", descriptor = "I")
	final int anInt5750;

	@OriginalMember(owner = "client!wm", name = "k", descriptor = "I")
	final int anInt5753;

	@OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(IIZZILclient!wd;I)V", line = 12)
	Class640(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class634 arg5, @OriginalArg(6) int arg6) {
		this.anInt5752 = arg0 * -1375140561;
		this.anInt5751 = arg1 * -1117524205;
		this.aBoolean855 = arg2;
		this.aClass634_2 = arg5;
		this.anInt5754 = arg6 * 1772540923;
		if (arg2) {
			this.anInt5750 = arg4 * 1248182811;
			this.anInt5753 = this.method32493(arg4, 1139625193) * -2085766573;
		} else {
			this.anInt5750 = -1248182811;
			this.anInt5753 = 2085766573;
		}
	}

	@OriginalMember(owner = "client!wm", name = "p", descriptor = "()I", line = 29)
	int method32468() {
		return this.anInt5752 * -1398644273;
	}

	@OriginalMember(owner = "client!wm", name = "r", descriptor = "()I", line = 29)
	int method32469() {
		return this.anInt5752 * -1398644273;
	}

	@OriginalMember(owner = "client!wm", name = "e", descriptor = "(I)I", line = 29)
	int method32470(@OriginalArg(0) int arg0) {
		return this.anInt5752 * -1398644273;
	}

	@OriginalMember(owner = "client!wm", name = "d", descriptor = "()I", line = 29)
	int method32471() {
		return this.anInt5752 * -1398644273;
	}

	@OriginalMember(owner = "client!wm", name = "c", descriptor = "()I", line = 29)
	int method32472() {
		return this.anInt5752 * -1398644273;
	}

	@OriginalMember(owner = "client!wm", name = "n", descriptor = "(B)Z", line = 33)
	public boolean method32473(@OriginalArg(0) byte arg0) {
		return this.aBoolean855;
	}

	@OriginalMember(owner = "client!wm", name = "m", descriptor = "(I)I", line = 37)
	public int method32474(@OriginalArg(0) int arg0) {
		return this.anInt5753 * 1025677787;
	}

	@OriginalMember(owner = "client!wm", name = "o", descriptor = "()I", line = 37)
	public int method32475() {
		return this.anInt5753 * 1025677787;
	}

	@OriginalMember(owner = "client!wm", name = "v", descriptor = "()I", line = 37)
	public int method32476() {
		return this.anInt5753 * 1025677787;
	}

	@OriginalMember(owner = "client!wm", name = "y", descriptor = "()I", line = 41)
	public int method32477() {
		return this.anInt5750 * -381597677;
	}

	@OriginalMember(owner = "client!wm", name = "k", descriptor = "(I)I", line = 41)
	public int method32478(@OriginalArg(0) int arg0) {
		return this.anInt5750 * -381597677;
	}

	@OriginalMember(owner = "client!wm", name = "q", descriptor = "()I", line = 41)
	public int method32479() {
		return this.anInt5750 * -381597677;
	}

	@OriginalMember(owner = "client!wm", name = "b", descriptor = "()I", line = 41)
	public int method32480() {
		return this.anInt5750 * -381597677;
	}

	@OriginalMember(owner = "client!wm", name = "s", descriptor = "()I", line = 41)
	public int method32481() {
		return this.anInt5750 * -381597677;
	}

	@OriginalMember(owner = "client!wm", name = "x", descriptor = "()I", line = 41)
	public int method32482() {
		return this.anInt5750 * -381597677;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "()Z", line = 45)
	public boolean method32483() {
		return this.anInt5753 * 1025677787 != -1;
	}

	@OriginalMember(owner = "client!wm", name = "f", descriptor = "(I)Z", line = 45)
	public boolean method32484(@OriginalArg(0) int arg0) {
		return this.anInt5753 * 1025677787 != -1;
	}

	@OriginalMember(owner = "client!wm", name = "h", descriptor = "()Z", line = 45)
	public boolean method32485() {
		return this.anInt5753 * 1025677787 != -1;
	}

	@OriginalMember(owner = "client!wm", name = "w", descriptor = "(IB)I", line = 49)
	public int method32486(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(10) int local10 = this.aClass634_2.method32312(arg0, 1801264511) + this.anInt5754 * 1685798707;
		return local10 > this.anInt5751 * -1804127461 ? this.anInt5751 * -1804127461 : local10;
	}

	@OriginalMember(owner = "client!wm", name = "g", descriptor = "(I)I", line = 49)
	public int method32487(@OriginalArg(0) int arg0) {
		@Pc(10) int local10 = this.aClass634_2.method32312(arg0, 287768075) + this.anInt5754 * 1685798707;
		return local10 > this.anInt5751 * -1804127461 ? this.anInt5751 * -1804127461 : local10;
	}

	@OriginalMember(owner = "client!wm", name = "i", descriptor = "(I)I", line = 49)
	public int method32488(@OriginalArg(0) int arg0) {
		@Pc(10) int local10 = this.aClass634_2.method32312(arg0, -1596212169) + this.anInt5754 * 1685798707;
		return local10 > this.anInt5751 * -1804127461 ? this.anInt5751 * -1804127461 : local10;
	}

	@OriginalMember(owner = "client!wm", name = "l", descriptor = "(IB)I", line = 55)
	public int method32489(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) int local3 = arg0 / 10;
		return this.method32486(local3, (byte) 112);
	}

	@OriginalMember(owner = "client!wm", name = "t", descriptor = "(I)I", line = 55)
	public int method32490(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 / 10;
		return this.method32486(local3, (byte) 102);
	}

	@OriginalMember(owner = "client!wm", name = "j", descriptor = "(I)I", line = 55)
	public int method32491(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 / 10;
		return this.method32486(local3, (byte) 22);
	}

	@OriginalMember(owner = "client!wm", name = "u", descriptor = "(IB)I", line = 60)
	int method32492(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		if (arg0 > this.anInt5751 * -1804127461) {
			arg0 = this.anInt5751 * -1804127461;
		}
		return this.aClass634_2.method32316(arg0 - this.anInt5754 * 1685798707, 540048644);
	}

	@OriginalMember(owner = "client!wm", name = "z", descriptor = "(II)I", line = 65)
	int method32493(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method32492(arg0, (byte) 8) * 10;
	}

	@OriginalMember(owner = "client!wm", name = "ae", descriptor = "(I)I", line = 65)
	int method32494(@OriginalArg(0) int arg0) {
		return this.method32492(arg0, (byte) 8) * 10;
	}

	@OriginalMember(owner = "client!wm", name = "ag", descriptor = "(I)I", line = 65)
	int method32495(@OriginalArg(0) int arg0) {
		return this.method32492(arg0, (byte) 8) * 10;
	}

	@OriginalMember(owner = "client!wm", name = "bz", descriptor = "(Lclient!yf;I)V", line = 5216)
	static final void method32496(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		if (Class520.selfPlayer.aClass658_1 != null) {
			Class520.selfPlayer.aClass658_1.method32763(local13, local23, -130712985);
		}
	}

	@OriginalMember(owner = "client!wm", name = "aaf", descriptor = "(Lclient!yf;I)V", line = 9689)
	static final void method32497(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		if (client.aString146 == null) {
			arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = "";
		} else {
			arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = Class93_Sub1_Sub2.method1787(client.aString146, (byte) 0);
		}
	}

	@OriginalMember(owner = "client!wm", name = "agt", descriptor = "(Lclient!yf;I)V", line = 10762)
	static final void method32498(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = ((Class47) Class277.aClass32_Sub12_1.method18261(local12, -909308048)).aBoolean21 ? 1 : 0;
	}
}
