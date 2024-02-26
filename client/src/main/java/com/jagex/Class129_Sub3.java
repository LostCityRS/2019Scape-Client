package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ahw")
public final class Class129_Sub3 extends Class129 {

	@OriginalMember(owner = "client!ahw", name = "i", descriptor = "Lclient!cm;")
	Class99 aClass99_13;

	@OriginalMember(owner = "client!ahw", name = "bcy", descriptor = "(Lclient!yp;I)V")
	static void method10353(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
	}

	@OriginalMember(owner = "client!ahw", name = "<init>", descriptor = "(Lclient!pf;Lclient!pf;Lclient!ahh;)V")
	Class129_Sub3(@OriginalArg(0) Class480 arg0, @OriginalArg(1) Class480 arg1, @OriginalArg(2) Class125_Sub1 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ahw", name = "t", descriptor = "(I)V")
	@Override
	public void method28658(@OriginalArg(0) int arg0) {
		super.method28658(2058093458);
		this.aClass99_13 = Class568.method31530(this.aClass480_78, ((Class125_Sub1) this.aClass125_5).anInt1137 * 1720978655, 447609930);
	}

	@OriginalMember(owner = "client!ahw", name = "a", descriptor = "(ZIIB)V")
	@Override
	void method20274(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		Class279.aClass102_9.method20818(arg1 - 2, arg2, this.aClass125_5.anInt2900 * 199320851 + 4, this.aClass125_5.anInt2903 * 1087492339 + 2, ((Class125_Sub1) this.aClass125_5).anInt1136 * 1983231707, 0);
		Class279.aClass102_9.method20818(arg1 - 1, arg2 + 1, this.aClass125_5.anInt2900 * 199320851 + 2, this.aClass125_5.anInt2903 * 1087492339, 0, 0);
	}

	@OriginalMember(owner = "client!ahw", name = "s", descriptor = "(ZIII)V")
	@Override
	void method20273(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11 = this.method20280(-635703822) * 199320851 * this.aClass125_5.anInt2900 / 10000;
		@Pc(14) int[] local14 = new int[4];
		Class279.aClass102_9.method20713(local14);
		Class279.aClass102_9.method20986(arg1, arg2 + 2, arg1 + local11, this.aClass125_5.anInt2903 * 1087492339 + arg2);
		this.aClass99_13.method18244(arg1, arg2 + 2, this.aClass125_5.anInt2900 * 199320851, this.aClass125_5.anInt2903 * 1087492339);
		Class279.aClass102_9.method20986(local14[0], local14[1], local14[2], local14[3]);
	}

	@OriginalMember(owner = "client!ahw", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method28657(@OriginalArg(0) int arg0) {
		return super.method28657(-1989171466) ? this.aClass480_78.method29945(((Class125_Sub1) this.aClass125_5).anInt1137 * 1720978655, (byte) 1) : false;
	}

	@OriginalMember(owner = "client!ahw", name = "i", descriptor = "()V")
	@Override
	public void method28661() {
		super.method28658(-1602680627);
		this.aClass99_13 = Class568.method31530(this.aClass480_78, ((Class125_Sub1) this.aClass125_5).anInt1137 * 1720978655, -1664520483);
	}

	@OriginalMember(owner = "client!ahw", name = "m", descriptor = "()V")
	@Override
	public void method28663() {
		super.method28658(252685846);
		this.aClass99_13 = Class568.method31530(this.aClass480_78, ((Class125_Sub1) this.aClass125_5).anInt1137 * 1720978655, 1475889398);
	}

	@OriginalMember(owner = "client!ahw", name = "o", descriptor = "()Z")
	@Override
	public boolean method28664() {
		return super.method28657(1201065000) ? this.aClass480_78.method29945(((Class125_Sub1) this.aClass125_5).anInt1137 * 1720978655, (byte) 1) : false;
	}

	@OriginalMember(owner = "client!ahw", name = "j", descriptor = "()Z")
	@Override
	public boolean method28665() {
		return super.method28657(-2046589531) ? this.aClass480_78.method29945(((Class125_Sub1) this.aClass125_5).anInt1137 * 1720978655, (byte) 1) : false;
	}

	@OriginalMember(owner = "client!ahw", name = "x", descriptor = "(ZII)V")
	@Override
	void method20272(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(11) int local11 = this.method20280(850178314) * 199320851 * this.aClass125_5.anInt2900 / 10000;
		@Pc(14) int[] local14 = new int[4];
		Class279.aClass102_9.method20713(local14);
		Class279.aClass102_9.method20986(arg1, arg2 + 2, arg1 + local11, this.aClass125_5.anInt2903 * 1087492339 + arg2);
		this.aClass99_13.method18244(arg1, arg2 + 2, this.aClass125_5.anInt2900 * 199320851, this.aClass125_5.anInt2903 * 1087492339);
		Class279.aClass102_9.method20986(local14[0], local14[1], local14[2], local14[3]);
	}

	@OriginalMember(owner = "client!ahw", name = "w", descriptor = "(ZII)V")
	@Override
	void method20275(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Class279.aClass102_9.method20818(arg1 - 2, arg2, this.aClass125_5.anInt2900 * 199320851 + 4, this.aClass125_5.anInt2903 * 1087492339 + 2, ((Class125_Sub1) this.aClass125_5).anInt1136 * 1983231707, 0);
		Class279.aClass102_9.method20818(arg1 - 1, arg2 + 1, this.aClass125_5.anInt2900 * 199320851 + 2, this.aClass125_5.anInt2903 * 1087492339, 0, 0);
	}

	@OriginalMember(owner = "client!ahw", name = "r", descriptor = "(ZII)V")
	@Override
	void method20276(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Class279.aClass102_9.method20818(arg1 - 2, arg2, this.aClass125_5.anInt2900 * 199320851 + 4, this.aClass125_5.anInt2903 * 1087492339 + 2, ((Class125_Sub1) this.aClass125_5).anInt1136 * 1983231707, 0);
		Class279.aClass102_9.method20818(arg1 - 1, arg2 + 1, this.aClass125_5.anInt2900 * 199320851 + 2, this.aClass125_5.anInt2903 * 1087492339, 0, 0);
	}

	@OriginalMember(owner = "client!ahw", name = "q", descriptor = "(ZII)V")
	@Override
	void method20277(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Class279.aClass102_9.method20818(arg1 - 2, arg2, this.aClass125_5.anInt2900 * 199320851 + 4, this.aClass125_5.anInt2903 * 1087492339 + 2, ((Class125_Sub1) this.aClass125_5).anInt1136 * 1983231707, 0);
		Class279.aClass102_9.method20818(arg1 - 1, arg2 + 1, this.aClass125_5.anInt2900 * 199320851 + 2, this.aClass125_5.anInt2903 * 1087492339, 0, 0);
	}

	@OriginalMember(owner = "client!ahw", name = "h", descriptor = "(ZII)V")
	@Override
	void method20278(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Class279.aClass102_9.method20818(arg1 - 2, arg2, this.aClass125_5.anInt2900 * 199320851 + 4, this.aClass125_5.anInt2903 * 1087492339 + 2, ((Class125_Sub1) this.aClass125_5).anInt1136 * 1983231707, 0);
		Class279.aClass102_9.method20818(arg1 - 1, arg2 + 1, this.aClass125_5.anInt2900 * 199320851 + 2, this.aClass125_5.anInt2903 * 1087492339, 0, 0);
	}
}
