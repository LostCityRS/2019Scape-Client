package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aho")
public class Class122_Sub2 extends Class122 {

	@OriginalMember(owner = "client!aho", name = "l", descriptor = "Lclient!cm;")
	Class100 aClass100_16;

	@OriginalMember(owner = "client!aho", name = "<init>", descriptor = "(Lclient!py;Lclient!py;Lclient!ahe;)V", line = 14)
	Class122_Sub2(@OriginalArg(0) Class497 arg0, @OriginalArg(1) Class497 arg1, @OriginalArg(2) Class125_Sub1 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!aho", name = "w", descriptor = "()V", line = 18)
	@Override
	public void method28283() {
		super.method28280(851032478);
		this.aClass100_16 = Class219.method25510(this.aClass497_90, ((Class125_Sub1) this.aClass125_5).anInt1033 * 1725814239, (byte) 65);
	}

	@OriginalMember(owner = "client!aho", name = "l", descriptor = "()V", line = 18)
	@Override
	public void method28284() {
		super.method28280(851032478);
		this.aClass100_16 = Class219.method25510(this.aClass497_90, ((Class125_Sub1) this.aClass125_5).anInt1033 * 1725814239, (byte) 22);
	}

	@OriginalMember(owner = "client!aho", name = "e", descriptor = "(I)V", line = 18)
	@Override
	public void method28280(@OriginalArg(0) int arg0) {
		super.method28280(851032478);
		this.aClass100_16 = Class219.method25510(this.aClass497_90, ((Class125_Sub1) this.aClass125_5).anInt1033 * 1725814239, (byte) 18);
	}

	@OriginalMember(owner = "client!aho", name = "p", descriptor = "(ZIII)V", line = 23)
	@Override
	void method20217(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11 = this.method20211((byte) 3) * 1135283731 * this.aClass125_5.anInt2983 / 10000;
		@Pc(14) int[] local14 = new int[4];
		Class694.aClass104_14.method20571(local14);
		Class694.aClass104_14.method20569(arg1, arg2 + 2, local11 + arg1, arg2 + this.aClass125_5.anInt2980 * -1017655207);
		this.aClass100_16.method18168(arg1, arg2 + 2, this.aClass125_5.anInt2983 * 1135283731, this.aClass125_5.anInt2980 * -1017655207);
		Class694.aClass104_14.method20569(local14[0], local14[1], local14[2], local14[3]);
	}

	@OriginalMember(owner = "client!aho", name = "o", descriptor = "(ZII)V", line = 23)
	@Override
	void method20220(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(11) int local11 = this.method20211((byte) 36) * 1135283731 * this.aClass125_5.anInt2983 / 10000;
		@Pc(14) int[] local14 = new int[4];
		Class694.aClass104_14.method20571(local14);
		Class694.aClass104_14.method20569(arg1, arg2 + 2, local11 + arg1, arg2 + this.aClass125_5.anInt2980 * -1017655207);
		this.aClass100_16.method18168(arg1, arg2 + 2, this.aClass125_5.anInt2983 * 1135283731, this.aClass125_5.anInt2980 * -1017655207);
		Class694.aClass104_14.method20569(local14[0], local14[1], local14[2], local14[3]);
	}

	@OriginalMember(owner = "client!aho", name = "v", descriptor = "(ZII)V", line = 23)
	@Override
	void method20219(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(11) int local11 = this.method20211((byte) 9) * 1135283731 * this.aClass125_5.anInt2983 / 10000;
		@Pc(14) int[] local14 = new int[4];
		Class694.aClass104_14.method20571(local14);
		Class694.aClass104_14.method20569(arg1, arg2 + 2, local11 + arg1, arg2 + this.aClass125_5.anInt2980 * -1017655207);
		this.aClass100_16.method18168(arg1, arg2 + 2, this.aClass125_5.anInt2983 * 1135283731, this.aClass125_5.anInt2980 * -1017655207);
		Class694.aClass104_14.method20569(local14[0], local14[1], local14[2], local14[3]);
	}

	@OriginalMember(owner = "client!aho", name = "z", descriptor = "(ZIIS)V", line = 32)
	@Override
	void method20216(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) short arg3) {
		Class694.aClass104_14.method20573(arg1 - 2, arg2, this.aClass125_5.anInt2983 * 1135283731 + 4, this.aClass125_5.anInt2980 * -1017655207 + 2, ((Class125_Sub1) this.aClass125_5).anInt1032 * -590022513, 0);
		Class694.aClass104_14.method20573(arg1 - 1, arg2 + 1, this.aClass125_5.anInt2983 * 1135283731 + 2, this.aClass125_5.anInt2980 * -1017655207, 0, 0);
	}

	@OriginalMember(owner = "client!aho", name = "c", descriptor = "(ZII)V", line = 32)
	@Override
	void method20218(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Class694.aClass104_14.method20573(arg1 - 2, arg2, this.aClass125_5.anInt2983 * 1135283731 + 4, this.aClass125_5.anInt2980 * -1017655207 + 2, ((Class125_Sub1) this.aClass125_5).anInt1032 * -590022513, 0);
		Class694.aClass104_14.method20573(arg1 - 1, arg2 + 1, this.aClass125_5.anInt2983 * 1135283731 + 2, this.aClass125_5.anInt2980 * -1017655207, 0, 0);
	}

	@OriginalMember(owner = "client!aho", name = "m", descriptor = "(I)Z", line = 37)
	@Override
	public boolean method28279(@OriginalArg(0) int arg0) {
		return super.method28279(-893534603) ? this.aClass497_90.method30071(((Class125_Sub1) this.aClass125_5).anInt1033 * 1725814239, -512225963) : false;
	}

	@OriginalMember(owner = "client!aho", name = "u", descriptor = "()Z", line = 37)
	@Override
	public boolean method28278() {
		return super.method28279(-398560781) ? this.aClass497_90.method30071(((Class125_Sub1) this.aClass125_5).anInt1033 * 1725814239, -512225963) : false;
	}
}
