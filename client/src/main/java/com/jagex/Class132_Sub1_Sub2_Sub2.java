package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ajj")
public final class Class132_Sub1_Sub2_Sub2 extends Class132_Sub1_Sub2 implements Interface61 {

	@OriginalMember(owner = "client!ajj", name = "o", descriptor = "[I")
	static final int[] anIntArray171 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!ajj", name = "s", descriptor = "[I")
	static final int[] anIntArray172 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!ajj", name = "v", descriptor = "Lclient!uq;")
	Class600 aClass600_3;

	@OriginalMember(owner = "client!ajj", name = "y", descriptor = "Z")
	boolean aBoolean290 = true;

	@OriginalMember(owner = "client!ajj", name = "c", descriptor = "Lclient!sp;")
	public Class558 aClass558_2;

	@OriginalMember(owner = "client!ajj", name = "r", descriptor = "Z")
	boolean aBoolean289;

	@OriginalMember(owner = "client!ajj", name = "br", descriptor = "(II)I")
	static int method12449(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Class615.aClass615_10.anInt5789 * 948246811 == arg0 || Class615.aClass615_5.anInt5789 * 948246811 == arg0 ? anIntArray172[arg1 & 0x3] : anIntArray171[arg1 & 0x3];
	}

	@OriginalMember(owner = "client!ajj", name = "bbj", descriptor = "(Lclient!yf;I)V")
	static void method12451(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class553.anInt3408 * -1378711501;
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class553.anInt3416 * 2091353777;
	}

	@OriginalMember(owner = "client!ajj", name = "<init>", descriptor = "(Lclient!tx;Lclient!dh;Lclient!aop;Lclient!vd;IIIIIZIIIILclient!oe;)V")
	public Class132_Sub1_Sub2_Sub2(@OriginalArg(0) Class585 arg0, @OriginalArg(1) Class104 arg1, @OriginalArg(2) Class32_Sub14 arg2, @OriginalArg(3) Class610 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) Class458 arg14) {
		super(arg0, arg6, arg7, arg8, arg4, arg5, Class664.method33065(arg10, arg11, -1256918501), arg14);
		this.aClass558_2 = new Class558(arg1, arg2, arg3, arg10, arg11, arg5, this, arg9, arg12, arg13);
		this.aBoolean289 = arg3.anInt5753 * 1067969079 != 0 && !arg9;
		this.method24288(1, 429790086);
	}

	@OriginalMember(owner = "client!ajj", name = "fk", descriptor = "(Lclient!dh;II)Z")
	@Override
	boolean method24302(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class610 local4 = this.aClass558_2.method31252((short) 16754);
		if (local4.aClass463_2 == null) {
			@Pc(26) Class109 local26 = this.aClass558_2.method31253(arg0, 131072, false, false, -986145784);
			return local26 == null ? false : local26.method6859(arg1, arg2, this.method24238(), false, 0);
		} else {
			return arg0.method20502(arg1, arg2, this.method24238(), local4.aClass463_2, -1294804070);
		}
	}

	@OriginalMember(owner = "client!ajj", name = "h", descriptor = "(Lclient!dh;)V")
	@Override
	public void method13402(@OriginalArg(0) Class104 arg0) {
		this.aClass558_2.method31257(arg0, (byte) -54);
	}

	@OriginalMember(owner = "client!ajj", name = "go", descriptor = "()V")
	@Override
	void method24269() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ajj", name = "fv", descriptor = "(Lclient!dh;B)Lclient!uq;")
	@Override
	public Class600 method24310(@OriginalArg(0) Class104 arg0, @OriginalArg(1) byte arg1) {
		return this.aClass600_3;
	}

	@OriginalMember(owner = "client!ajj", name = "by", descriptor = "(B)I")
	@Override
	public int method24301(@OriginalArg(0) byte arg0) {
		return this.aClass558_2.method31277(2039495108);
	}

	@OriginalMember(owner = "client!ajj", name = "bo", descriptor = "(I)I")
	@Override
	public int method24287(@OriginalArg(0) int arg0) {
		return this.aClass558_2.method31251(117492280);
	}

	@OriginalMember(owner = "client!ajj", name = "bv", descriptor = "(Lclient!vp;I)V")
	public void method12446(@OriginalArg(0) Class620 arg0, @OriginalArg(1) int arg1) {
		this.aClass558_2.method31280(arg0, -1302764671);
	}

	@OriginalMember(owner = "client!ajj", name = "fc", descriptor = "(Lclient!dh;I)Lclient!tl;")
	@Override
	Class573 method24283(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class109 local8 = this.aClass558_2.method31253(arg0, 2048, false, true, -645408041);
		if (local8 == null) {
			return null;
		}
		@Pc(15) Class470 local15 = this.method24238();
		@Pc(18) Class458 local18 = this.method24241();
		@Pc(23) Class573 local23 = Class125_Sub1.method9214(this.aBoolean289, 373147274);
		@Pc(30) int local30 = (int) local18.aClass472_61.aFloat325 >> 9;
		@Pc(37) int local37 = (int) local18.aClass472_61.aFloat327 >> 9;
		this.aClass558_2.method31254(arg0, local8, local15, local30, local30, local37, local37, true, (byte) 67);
		@Pc(54) Class610 local54 = this.aClass558_2.method31252((short) 8505);
		if (local54.aClass463_2 == null) {
			local8.method6947(local15, this.aClass241Array21[0], 0);
		} else {
			local8.method6947(local15, null, 0);
			arg0.method20504(local15, this.aClass241Array21[0], local54.aClass463_2);
		}
		if (this.aClass558_2.aClass674_7 != null) {
			@Pc(90) Class229 local90 = this.aClass558_2.aClass674_7.method33308();
			arg0.method20509(local90);
		}
		this.aBoolean290 = local8.method6865() || this.aClass558_2.aClass674_7 != null;
		if (this.aClass600_3 == null) {
			this.aClass600_3 = Class62.method1154((int) local18.aClass472_61.aFloat325, (int) local18.aClass472_61.aFloat326, (int) local18.aClass472_61.aFloat327, local8, 1727024172);
		} else {
			Class554.method31231(this.aClass600_3, (int) local18.aClass472_61.aFloat325, (int) local18.aClass472_61.aFloat326, (int) local18.aClass472_61.aFloat327, local8, -1841219057);
		}
		return local23;
	}

	@OriginalMember(owner = "client!ajj", name = "fw", descriptor = "(Lclient!dh;I)V")
	@Override
	void method24279(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class109 local8 = this.aClass558_2.method31253(arg0, 262144, true, true, -1045119152);
		if (local8 == null) {
			return;
		}
		@Pc(13) Class470 local13 = this.method24238();
		@Pc(16) Class458 local16 = this.method24241();
		@Pc(23) int local23 = (int) local16.aClass472_61.aFloat325 >> 9;
		@Pc(30) int local30 = (int) local16.aClass472_61.aFloat327 >> 9;
		this.aClass558_2.method31254(arg0, local8, local13, local23, local23, local30, local30, false, (byte) 53);
	}

	@OriginalMember(owner = "client!ajj", name = "fh", descriptor = "()Z")
	@Override
	boolean method24284() {
		return false;
	}

	@OriginalMember(owner = "client!ajj", name = "cm", descriptor = "()Z")
	@Override
	boolean method24292() {
		return this.aBoolean290;
	}

	@OriginalMember(owner = "client!ajj", name = "fq", descriptor = "(Lclient!dh;Lclient!alh;IIIZB)V")
	@Override
	void method24281(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class132_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ajj", name = "ff", descriptor = "(B)V")
	@Override
	void method24277(@OriginalArg(0) byte arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ajj", name = "e", descriptor = "(I)I")
	@Override
	public int method13423(@OriginalArg(0) int arg0) {
		return this.aClass558_2.anInt5485 * 1228794785;
	}

	@OriginalMember(owner = "client!ajj", name = "n", descriptor = "(I)I")
	@Override
	public int method13420(@OriginalArg(0) int arg0) {
		return this.aClass558_2.anInt5486 * -989891395;
	}

	@OriginalMember(owner = "client!ajj", name = "m", descriptor = "(I)I")
	@Override
	public int method13404(@OriginalArg(0) int arg0) {
		return this.aClass558_2.anInt5487 * -922764575;
	}

	@OriginalMember(owner = "client!ajj", name = "k", descriptor = "(I)V")
	@Override
	public void method13405(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ajj", name = "co", descriptor = "()Z")
	@Override
	boolean method24290() {
		return false;
	}

	@OriginalMember(owner = "client!ajj", name = "p", descriptor = "()I")
	@Override
	public int method13411() {
		return this.aClass558_2.anInt5485 * 1228794785;
	}

	@OriginalMember(owner = "client!ajj", name = "l", descriptor = "(Lclient!dh;B)V")
	@Override
	public void method13417(@OriginalArg(0) Class104 arg0, @OriginalArg(1) byte arg1) {
		this.aClass558_2.method31256(arg0, -1497248091);
	}

	@OriginalMember(owner = "client!ajj", name = "u", descriptor = "(Lclient!dh;B)V")
	@Override
	public void method13409(@OriginalArg(0) Class104 arg0, @OriginalArg(1) byte arg1) {
		this.aClass558_2.method31257(arg0, (byte) -32);
	}

	@OriginalMember(owner = "client!ajj", name = "s", descriptor = "()Z")
	@Override
	public boolean method13415() {
		return this.aClass558_2.method31255((byte) 66);
	}

	@OriginalMember(owner = "client!ajj", name = "fp", descriptor = "(I)Z")
	@Override
	boolean method24273(@OriginalArg(0) int arg0) {
		return false;
	}

	@OriginalMember(owner = "client!ajj", name = "d", descriptor = "()I")
	@Override
	public int method13403() {
		return this.aClass558_2.anInt5486 * -989891395;
	}

	@OriginalMember(owner = "client!ajj", name = "c", descriptor = "()I")
	@Override
	public int method13413() {
		return this.aClass558_2.anInt5487 * -922764575;
	}

	@OriginalMember(owner = "client!ajj", name = "bu", descriptor = "(B)Z")
	@Override
	boolean method24274(@OriginalArg(0) byte arg0) {
		return false;
	}

	@OriginalMember(owner = "client!ajj", name = "v", descriptor = "()I")
	@Override
	public int method13412() {
		return this.aClass558_2.anInt5487 * -922764575;
	}

	@OriginalMember(owner = "client!ajj", name = "w", descriptor = "(B)Z")
	@Override
	public boolean method13407(@OriginalArg(0) byte arg0) {
		return true;
	}

	@OriginalMember(owner = "client!ajj", name = "a", descriptor = "(Lclient!dh;)V")
	@Override
	public void method13422(@OriginalArg(0) Class104 arg0) {
		this.aClass558_2.method31257(arg0, (byte) 16);
	}

	@OriginalMember(owner = "client!ajj", name = "fo", descriptor = "(Lclient!dh;)Lclient!tl;")
	@Override
	Class573 method24278(@OriginalArg(0) Class104 arg0) {
		@Pc(8) Class109 local8 = this.aClass558_2.method31253(arg0, 2048, false, true, -1890050058);
		if (local8 == null) {
			return null;
		}
		@Pc(15) Class470 local15 = this.method24238();
		@Pc(18) Class458 local18 = this.method24241();
		@Pc(23) Class573 local23 = Class125_Sub1.method9214(this.aBoolean289, 373147274);
		@Pc(30) int local30 = (int) local18.aClass472_61.aFloat325 >> 9;
		@Pc(37) int local37 = (int) local18.aClass472_61.aFloat327 >> 9;
		this.aClass558_2.method31254(arg0, local8, local15, local30, local30, local37, local37, true, (byte) 14);
		@Pc(54) Class610 local54 = this.aClass558_2.method31252((short) -12929);
		if (local54.aClass463_2 == null) {
			local8.method6947(local15, this.aClass241Array21[0], 0);
		} else {
			local8.method6947(local15, null, 0);
			arg0.method20504(local15, this.aClass241Array21[0], local54.aClass463_2);
		}
		if (this.aClass558_2.aClass674_7 != null) {
			@Pc(90) Class229 local90 = this.aClass558_2.aClass674_7.method33308();
			arg0.method20509(local90);
		}
		this.aBoolean290 = local8.method6865() || this.aClass558_2.aClass674_7 != null;
		if (this.aClass600_3 == null) {
			this.aClass600_3 = Class62.method1154((int) local18.aClass472_61.aFloat325, (int) local18.aClass472_61.aFloat326, (int) local18.aClass472_61.aFloat327, local8, 2137785510);
		} else {
			Class554.method31231(this.aClass600_3, (int) local18.aClass472_61.aFloat325, (int) local18.aClass472_61.aFloat326, (int) local18.aClass472_61.aFloat327, local8, -1308477767);
		}
		return local23;
	}

	@OriginalMember(owner = "client!ajj", name = "q", descriptor = "(Lclient!dh;)V")
	@Override
	public void method13419(@OriginalArg(0) Class104 arg0) {
		this.aClass558_2.method31256(arg0, -1497248091);
	}

	@OriginalMember(owner = "client!ajj", name = "x", descriptor = "(Lclient!dh;)V")
	@Override
	public void method13408(@OriginalArg(0) Class104 arg0) {
		this.aClass558_2.method31256(arg0, -1497248091);
	}

	@OriginalMember(owner = "client!ajj", name = "b", descriptor = "(Lclient!dh;)V")
	@Override
	public void method13421(@OriginalArg(0) Class104 arg0) {
		this.aClass558_2.method31256(arg0, -1497248091);
	}

	@OriginalMember(owner = "client!ajj", name = "fa", descriptor = "(Lclient!dh;IIB)Z")
	@Override
	boolean method24271(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		@Pc(4) Class610 local4 = this.aClass558_2.method31252((short) 10039);
		if (local4.aClass463_2 == null) {
			@Pc(26) Class109 local26 = this.aClass558_2.method31253(arg0, 131072, false, false, -1230304468);
			return local26 == null ? false : local26.method6859(arg1, arg2, this.method24238(), false, 0);
		} else {
			return arg0.method20502(arg1, arg2, this.method24238(), local4.aClass463_2, -1648189737);
		}
	}

	@OriginalMember(owner = "client!ajj", name = "bp", descriptor = "(Lclient!vp;)V")
	public void method12447(@OriginalArg(0) Class620 arg0) {
		this.aClass558_2.method31280(arg0, -760821712);
	}

	@OriginalMember(owner = "client!ajj", name = "g", descriptor = "(Lclient!dh;)V")
	@Override
	public void method13424(@OriginalArg(0) Class104 arg0) {
		this.aClass558_2.method31257(arg0, (byte) 89);
	}

	@OriginalMember(owner = "client!ajj", name = "cf", descriptor = "()Z")
	@Override
	boolean method24311() {
		return false;
	}

	@OriginalMember(owner = "client!ajj", name = "cr", descriptor = "()Z")
	@Override
	boolean method24291() {
		return this.aBoolean290;
	}

	@OriginalMember(owner = "client!ajj", name = "bw", descriptor = "(S)Z")
	@Override
	boolean method24275(@OriginalArg(0) short arg0) {
		return this.aBoolean290;
	}

	@OriginalMember(owner = "client!ajj", name = "gk", descriptor = "()V")
	@Override
	void method24309() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ajj", name = "ch", descriptor = "()I")
	@Override
	public int method24294() {
		return this.aClass558_2.method31277(1662302312);
	}

	@OriginalMember(owner = "client!ajj", name = "fl", descriptor = "(Lclient!dh;)Lclient!uq;")
	@Override
	public Class600 method24295(@OriginalArg(0) Class104 arg0) {
		return this.aClass600_3;
	}

	@OriginalMember(owner = "client!ajj", name = "fb", descriptor = "(Lclient!dh;)Lclient!uq;")
	@Override
	public Class600 method24296(@OriginalArg(0) Class104 arg0) {
		return this.aClass600_3;
	}

	@OriginalMember(owner = "client!ajj", name = "cb", descriptor = "()I")
	@Override
	public int method24297() {
		return this.aClass558_2.method31251(2125702879);
	}

	@OriginalMember(owner = "client!ajj", name = "cs", descriptor = "()I")
	@Override
	public int method24298() {
		return this.aClass558_2.method31251(1713085070);
	}

	@OriginalMember(owner = "client!ajj", name = "cy", descriptor = "()I")
	@Override
	public int method24299() {
		return this.aClass558_2.method31251(1723189652);
	}

	@OriginalMember(owner = "client!ajj", name = "gq", descriptor = "(Lclient!dh;Lclient!alh;IIIZ)V")
	@Override
	void method24308(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class132_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ajj", name = "fy", descriptor = "(Lclient!dh;)V")
	@Override
	void method24306(@OriginalArg(0) Class104 arg0) {
		@Pc(8) Class109 local8 = this.aClass558_2.method31253(arg0, 262144, true, true, -98480076);
		if (local8 == null) {
			return;
		}
		@Pc(13) Class470 local13 = this.method24238();
		@Pc(16) Class458 local16 = this.method24241();
		@Pc(23) int local23 = (int) local16.aClass472_61.aFloat325 >> 9;
		@Pc(30) int local30 = (int) local16.aClass472_61.aFloat327 >> 9;
		this.aClass558_2.method31254(arg0, local8, local13, local23, local23, local30, local30, false, (byte) 66);
	}

	@OriginalMember(owner = "client!ajj", name = "fe", descriptor = "(Lclient!dh;)V")
	@Override
	void method24315(@OriginalArg(0) Class104 arg0) {
		@Pc(8) Class109 local8 = this.aClass558_2.method31253(arg0, 262144, true, true, -1272450186);
		if (local8 == null) {
			return;
		}
		@Pc(13) Class470 local13 = this.method24238();
		@Pc(16) Class458 local16 = this.method24241();
		@Pc(23) int local23 = (int) local16.aClass472_61.aFloat325 >> 9;
		@Pc(30) int local30 = (int) local16.aClass472_61.aFloat327 >> 9;
		this.aClass558_2.method31254(arg0, local8, local13, local23, local23, local30, local30, false, (byte) 81);
	}

	@OriginalMember(owner = "client!ajj", name = "t", descriptor = "()Z")
	@Override
	public boolean method13427() {
		return true;
	}

	@OriginalMember(owner = "client!ajj", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method13406(@OriginalArg(0) int arg0) {
		return this.aClass558_2.method31255((byte) 116);
	}

	@OriginalMember(owner = "client!ajj", name = "r", descriptor = "()I")
	@Override
	public int method13416() {
		return this.aClass558_2.anInt5487 * -922764575;
	}

	@OriginalMember(owner = "client!ajj", name = "gu", descriptor = "(Lclient!dh;Lclient!alh;IIIZ)V")
	@Override
	void method24305(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class132_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ajj", name = "z", descriptor = "()I")
	@Override
	public int method13410() {
		return this.aClass558_2.anInt5485 * 1228794785;
	}

	@OriginalMember(owner = "client!ajj", name = "gl", descriptor = "(Lclient!dh;Lclient!alh;IIIZ)V")
	@Override
	void method24307(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class132_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ajj", name = "o", descriptor = "()I")
	@Override
	public int method13414() {
		return this.aClass558_2.anInt5487 * -922764575;
	}

	@OriginalMember(owner = "client!ajj", name = "y", descriptor = "(Lclient!dh;)V")
	@Override
	public void method13418(@OriginalArg(0) Class104 arg0) {
		this.aClass558_2.method31256(arg0, -1497248091);
	}

	@OriginalMember(owner = "client!ajj", name = "ba", descriptor = "(Lclient!vp;)V")
	public void method12448(@OriginalArg(0) Class620 arg0) {
		this.aClass558_2.method31280(arg0, -2083512954);
	}

	@OriginalMember(owner = "client!ajj", name = "j", descriptor = "()V")
	@Override
	public void method13426() {
	}

	@OriginalMember(owner = "client!ajj", name = "fr", descriptor = "()Z")
	@Override
	boolean method24304() {
		return false;
	}

	@OriginalMember(owner = "client!ajj", name = "bg", descriptor = "(Lclient!vp;)V")
	public void method12450(@OriginalArg(0) Class620 arg0) {
		this.aClass558_2.method31280(arg0, 1664798441);
	}

	@OriginalMember(owner = "client!ajj", name = "i", descriptor = "()V")
	@Override
	public void method13425() {
	}

	@OriginalMember(owner = "client!ajj", name = "cq", descriptor = "()Z")
	@Override
	boolean method24293() {
		return this.aBoolean290;
	}
}
