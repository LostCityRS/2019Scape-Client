package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aho")
public final class Class122_Sub2 extends Class122 {

	@OriginalMember(owner = "client!aho", name = "l", descriptor = "Lclient!cm;")
	Class100 aClass100_16;

	@OriginalMember(owner = "client!aho", name = "<init>", descriptor = "(Lclient!py;Lclient!py;Lclient!ahe;)V")
	Class122_Sub2(@OriginalArg(0) Class497 arg0, @OriginalArg(1) Class497 arg1, @OriginalArg(2) Class125_Sub1 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!aho", name = "m", descriptor = "(I)Z")
	@Override
	public boolean method28460(@OriginalArg(0) int arg0) {
		return super.method28460(-893534603) ? this.aClass497_90.method30235(((Class125_Sub1) this.aClass125_5).anInt1033 * 1725814239, -512225963) : false;
	}

	@OriginalMember(owner = "client!aho", name = "u", descriptor = "()Z")
	@Override
	public boolean method28459() {
		return super.method28460(-398560781) ? this.aClass497_90.method30235(((Class125_Sub1) this.aClass125_5).anInt1033 * 1725814239, -512225963) : false;
	}

	@OriginalMember(owner = "client!aho", name = "p", descriptor = "(ZIII)V")
	@Override
	void method20224(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11 = this.method20225((byte) 3) * 1135283731 * this.aClass125_5.anInt2983 / 10000;
		@Pc(14) int[] local14 = new int[4];
		Class694.aClass104_14.method20482(local14);
		Class694.aClass104_14.method20479(arg1, arg2 + 2, local11 + arg1, arg2 + this.aClass125_5.anInt2980 * -1017655207);
		this.aClass100_16.method18190(arg1, arg2 + 2, this.aClass125_5.anInt2983 * 1135283731, this.aClass125_5.anInt2980 * -1017655207);
		Class694.aClass104_14.method20479(local14[0], local14[1], local14[2], local14[3]);
	}

	@OriginalMember(owner = "client!aho", name = "z", descriptor = "(ZIIS)V")
	@Override
	void method20223(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) short arg3) {
		Class694.aClass104_14.method20490(arg1 - 2, arg2, this.aClass125_5.anInt2983 * 1135283731 + 4, this.aClass125_5.anInt2980 * -1017655207 + 2, ((Class125_Sub1) this.aClass125_5).anInt1032 * -590022513, 0);
		Class694.aClass104_14.method20490(arg1 - 1, arg2 + 1, this.aClass125_5.anInt2983 * 1135283731 + 2, this.aClass125_5.anInt2980 * -1017655207, 0, 0);
	}

	@OriginalMember(owner = "client!aho", name = "w", descriptor = "()V")
	@Override
	public void method28464() {
		super.method28461(851032478);
		this.aClass100_16 = Class219.method25602(this.aClass497_90, ((Class125_Sub1) this.aClass125_5).anInt1033 * 1725814239, (byte) 65);
	}

	@OriginalMember(owner = "client!aho", name = "l", descriptor = "()V")
	@Override
	public void method28465() {
		super.method28461(851032478);
		this.aClass100_16 = Class219.method25602(this.aClass497_90, ((Class125_Sub1) this.aClass125_5).anInt1033 * 1725814239, (byte) 22);
	}

	@OriginalMember(owner = "client!aho", name = "o", descriptor = "(ZII)V")
	@Override
	void method20229(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(11) int local11 = this.method20225((byte) 36) * 1135283731 * this.aClass125_5.anInt2983 / 10000;
		@Pc(14) int[] local14 = new int[4];
		Class694.aClass104_14.method20482(local14);
		Class694.aClass104_14.method20479(arg1, arg2 + 2, local11 + arg1, arg2 + this.aClass125_5.anInt2980 * -1017655207);
		this.aClass100_16.method18190(arg1, arg2 + 2, this.aClass125_5.anInt2983 * 1135283731, this.aClass125_5.anInt2980 * -1017655207);
		Class694.aClass104_14.method20479(local14[0], local14[1], local14[2], local14[3]);
	}

	@OriginalMember(owner = "client!aho", name = "c", descriptor = "(ZII)V")
	@Override
	void method20226(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Class694.aClass104_14.method20490(arg1 - 2, arg2, this.aClass125_5.anInt2983 * 1135283731 + 4, this.aClass125_5.anInt2980 * -1017655207 + 2, ((Class125_Sub1) this.aClass125_5).anInt1032 * -590022513, 0);
		Class694.aClass104_14.method20490(arg1 - 1, arg2 + 1, this.aClass125_5.anInt2983 * 1135283731 + 2, this.aClass125_5.anInt2980 * -1017655207, 0, 0);
	}

	@OriginalMember(owner = "client!aho", name = "v", descriptor = "(ZII)V")
	@Override
	void method20228(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(11) int local11 = this.method20225((byte) 9) * 1135283731 * this.aClass125_5.anInt2983 / 10000;
		@Pc(14) int[] local14 = new int[4];
		Class694.aClass104_14.method20482(local14);
		Class694.aClass104_14.method20479(arg1, arg2 + 2, local11 + arg1, arg2 + this.aClass125_5.anInt2980 * -1017655207);
		this.aClass100_16.method18190(arg1, arg2 + 2, this.aClass125_5.anInt2983 * 1135283731, this.aClass125_5.anInt2980 * -1017655207);
		Class694.aClass104_14.method20479(local14[0], local14[1], local14[2], local14[3]);
	}

	@OriginalMember(owner = "client!aho", name = "e", descriptor = "(I)V")
	@Override
	public void method28461(@OriginalArg(0) int arg0) {
		super.method28461(851032478);
		this.aClass100_16 = Class219.method25602(this.aClass497_90, ((Class125_Sub1) this.aClass125_5).anInt1033 * 1725814239, (byte) 18);
	}
}
