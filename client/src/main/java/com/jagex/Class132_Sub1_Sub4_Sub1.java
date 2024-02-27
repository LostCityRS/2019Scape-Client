package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ajs")
public final class Class132_Sub1_Sub4_Sub1 extends Class132_Sub1_Sub4 implements Interface61 {

	@OriginalMember(owner = "client!ajs", name = "v", descriptor = "Lclient!uq;")
	Class600 aClass600_5;

	@OriginalMember(owner = "client!ajs", name = "o", descriptor = "Z")
	boolean aBoolean308 = true;

	@OriginalMember(owner = "client!ajs", name = "c", descriptor = "Lclient!sp;")
	public Class558 aClass558_3;

	@OriginalMember(owner = "client!ajs", name = "r", descriptor = "Z")
	boolean aBoolean307;

	@OriginalMember(owner = "client!ajs", name = "aju", descriptor = "(Lclient!yf;I)V")
	static void method12963(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ajs", name = "<init>", descriptor = "(Lclient!tx;Lclient!dh;Lclient!aop;Lclient!vd;IIIIIZIIILclient!oe;)V")
	public Class132_Sub1_Sub4_Sub1(@OriginalArg(0) Class585 arg0, @OriginalArg(1) Class104 arg1, @OriginalArg(2) Class32_Sub14 arg2, @OriginalArg(3) Class610 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) Class458 arg13) {
		super(arg0, arg6, arg7, arg8, arg4, arg5, arg3.anInt5746 * -2089585703, arg13);
		this.aClass558_3 = new Class558(arg1, arg2, arg3, Class615.aClass615_24.anInt5789 * 948246811, arg10, arg5, this, arg9, arg11, arg12);
		this.aBoolean307 = arg3.anInt5753 * 1067969079 != 0 && !arg9;
		this.method24288(1, 2131488537);
	}

	@OriginalMember(owner = "client!ajs", name = "fe", descriptor = "(Lclient!dh;)V")
	@Override
	void method24315(@OriginalArg(0) Class104 arg0) {
		@Pc(8) Class109 local8 = this.aClass558_3.method31253(arg0, 262144, true, true, -2001466560);
		if (local8 != null) {
			@Pc(14) Class472 local14 = this.method24241().aClass472_61;
			@Pc(20) int local20 = (int) local14.aFloat325 >> 9;
			@Pc(26) int local26 = (int) local14.aFloat327 >> 9;
			this.aClass558_3.method31254(arg0, local8, this.method24238(), local20, local20, local26, local26, false, (byte) 85);
		}
	}

	@OriginalMember(owner = "client!ajs", name = "r", descriptor = "()I")
	@Override
	public int method13416() {
		return this.aClass558_3.anInt5487 * -922764575;
	}

	@OriginalMember(owner = "client!ajs", name = "fh", descriptor = "()Z")
	@Override
	boolean method24284() {
		return false;
	}

	@OriginalMember(owner = "client!ajs", name = "fv", descriptor = "(Lclient!dh;B)Lclient!uq;")
	@Override
	public Class600 method24310(@OriginalArg(0) Class104 arg0, @OriginalArg(1) byte arg1) {
		return this.aClass600_5;
	}

	@OriginalMember(owner = "client!ajs", name = "k", descriptor = "(I)V")
	@Override
	public void method13405(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ajs", name = "y", descriptor = "(Lclient!dh;)V")
	@Override
	public void method13418(@OriginalArg(0) Class104 arg0) {
		this.aClass558_3.method31256(arg0, -1497248091);
	}

	@OriginalMember(owner = "client!ajs", name = "cs", descriptor = "()I")
	@Override
	public int method24298() {
		return this.aClass558_3.method31251(1113745150);
	}

	@OriginalMember(owner = "client!ajs", name = "cy", descriptor = "()I")
	@Override
	public int method24299() {
		return this.aClass558_3.method31251(2000584298);
	}

	@OriginalMember(owner = "client!ajs", name = "fa", descriptor = "(Lclient!dh;IIB)Z")
	@Override
	boolean method24271(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		@Pc(4) Class610 local4 = this.aClass558_3.method31252((short) -7598);
		if (local4.aClass463_2 == null) {
			@Pc(27) Class109 local27 = this.aClass558_3.method31253(arg0, 131072, false, false, -1306946242);
			return local27 == null ? false : local27.method6859(arg1, arg2, this.method24238(), false, 0);
		} else {
			return arg0.method20502(arg1, arg2, this.method24238(), local4.aClass463_2, -1196618528);
		}
	}

	@OriginalMember(owner = "client!ajs", name = "fp", descriptor = "(I)Z")
	@Override
	boolean method24273(@OriginalArg(0) int arg0) {
		return false;
	}

	@OriginalMember(owner = "client!ajs", name = "fq", descriptor = "(Lclient!dh;Lclient!alh;IIIZB)V")
	@Override
	void method24281(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class132_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ajs", name = "ff", descriptor = "(B)V")
	@Override
	void method24277(@OriginalArg(0) byte arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ajs", name = "e", descriptor = "(I)I")
	@Override
	public int method13423(@OriginalArg(0) int arg0) {
		return this.aClass558_3.anInt5485 * 1228794785;
	}

	@OriginalMember(owner = "client!ajs", name = "n", descriptor = "(I)I")
	@Override
	public int method13420(@OriginalArg(0) int arg0) {
		return this.aClass558_3.anInt5486 * -989891395;
	}

	@OriginalMember(owner = "client!ajs", name = "m", descriptor = "(I)I")
	@Override
	public int method13404(@OriginalArg(0) int arg0) {
		return this.aClass558_3.anInt5487 * -922764575;
	}

	@OriginalMember(owner = "client!ajs", name = "bz", descriptor = "(Lclient!vp;I)V")
	public void method12961(@OriginalArg(0) Class620 arg0, @OriginalArg(1) int arg1) {
		this.aClass558_3.method31280(arg0, 1741540188);
	}

	@OriginalMember(owner = "client!ajs", name = "z", descriptor = "()I")
	@Override
	public int method13410() {
		return this.aClass558_3.anInt5485 * 1228794785;
	}

	@OriginalMember(owner = "client!ajs", name = "w", descriptor = "(B)Z")
	@Override
	public boolean method13407(@OriginalArg(0) byte arg0) {
		return true;
	}

	@OriginalMember(owner = "client!ajs", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method13406(@OriginalArg(0) int arg0) {
		return this.aClass558_3.method31255((byte) 18);
	}

	@OriginalMember(owner = "client!ajs", name = "l", descriptor = "(Lclient!dh;B)V")
	@Override
	public void method13417(@OriginalArg(0) Class104 arg0, @OriginalArg(1) byte arg1) {
		this.aClass558_3.method31256(arg0, -1497248091);
	}

	@OriginalMember(owner = "client!ajs", name = "u", descriptor = "(Lclient!dh;B)V")
	@Override
	public void method13409(@OriginalArg(0) Class104 arg0, @OriginalArg(1) byte arg1) {
		this.aClass558_3.method31257(arg0, (byte) 100);
	}

	@OriginalMember(owner = "client!ajs", name = "bw", descriptor = "(S)Z")
	@Override
	boolean method24275(@OriginalArg(0) short arg0) {
		return this.aBoolean308;
	}

	@OriginalMember(owner = "client!ajs", name = "s", descriptor = "()Z")
	@Override
	public boolean method13415() {
		return this.aClass558_3.method31255((byte) -77);
	}

	@OriginalMember(owner = "client!ajs", name = "d", descriptor = "()I")
	@Override
	public int method13403() {
		return this.aClass558_3.anInt5486 * -989891395;
	}

	@OriginalMember(owner = "client!ajs", name = "c", descriptor = "()I")
	@Override
	public int method13413() {
		return this.aClass558_3.anInt5487 * -922764575;
	}

	@OriginalMember(owner = "client!ajs", name = "v", descriptor = "()I")
	@Override
	public int method13412() {
		return this.aClass558_3.anInt5487 * -922764575;
	}

	@OriginalMember(owner = "client!ajs", name = "o", descriptor = "()I")
	@Override
	public int method13414() {
		return this.aClass558_3.anInt5487 * -922764575;
	}

	@OriginalMember(owner = "client!ajs", name = "fy", descriptor = "(Lclient!dh;)V")
	@Override
	void method24306(@OriginalArg(0) Class104 arg0) {
		@Pc(8) Class109 local8 = this.aClass558_3.method31253(arg0, 262144, true, true, -1444145702);
		if (local8 != null) {
			@Pc(14) Class472 local14 = this.method24241().aClass472_61;
			@Pc(20) int local20 = (int) local14.aFloat325 >> 9;
			@Pc(26) int local26 = (int) local14.aFloat327 >> 9;
			this.aClass558_3.method31254(arg0, local8, this.method24238(), local20, local20, local26, local26, false, (byte) 97);
		}
	}

	@OriginalMember(owner = "client!ajs", name = "cm", descriptor = "()Z")
	@Override
	boolean method24292() {
		return this.aBoolean308;
	}

	@OriginalMember(owner = "client!ajs", name = "co", descriptor = "()Z")
	@Override
	boolean method24290() {
		return false;
	}

	@OriginalMember(owner = "client!ajs", name = "x", descriptor = "(Lclient!dh;)V")
	@Override
	public void method13408(@OriginalArg(0) Class104 arg0) {
		this.aClass558_3.method31256(arg0, -1497248091);
	}

	@OriginalMember(owner = "client!ajs", name = "i", descriptor = "()V")
	@Override
	public void method13425() {
	}

	@OriginalMember(owner = "client!ajs", name = "h", descriptor = "(Lclient!dh;)V")
	@Override
	public void method13402(@OriginalArg(0) Class104 arg0) {
		this.aClass558_3.method31257(arg0, (byte) 12);
	}

	@OriginalMember(owner = "client!ajs", name = "a", descriptor = "(Lclient!dh;)V")
	@Override
	public void method13422(@OriginalArg(0) Class104 arg0) {
		this.aClass558_3.method31257(arg0, (byte) 31);
	}

	@OriginalMember(owner = "client!ajs", name = "bo", descriptor = "(I)I")
	@Override
	public int method24287(@OriginalArg(0) int arg0) {
		return this.aClass558_3.method31251(1168327071);
	}

	@OriginalMember(owner = "client!ajs", name = "cf", descriptor = "()Z")
	@Override
	boolean method24311() {
		return false;
	}

	@OriginalMember(owner = "client!ajs", name = "fw", descriptor = "(Lclient!dh;I)V")
	@Override
	void method24279(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class109 local8 = this.aClass558_3.method31253(arg0, 262144, true, true, -1104209393);
		if (local8 != null) {
			@Pc(14) Class472 local14 = this.method24241().aClass472_61;
			@Pc(20) int local20 = (int) local14.aFloat325 >> 9;
			@Pc(26) int local26 = (int) local14.aFloat327 >> 9;
			this.aClass558_3.method31254(arg0, local8, this.method24238(), local20, local20, local26, local26, false, (byte) 68);
		}
	}

	@OriginalMember(owner = "client!ajs", name = "cr", descriptor = "()Z")
	@Override
	boolean method24291() {
		return this.aBoolean308;
	}

	@OriginalMember(owner = "client!ajs", name = "bu", descriptor = "(B)Z")
	@Override
	boolean method24274(@OriginalArg(0) byte arg0) {
		return false;
	}

	@OriginalMember(owner = "client!ajs", name = "cq", descriptor = "()Z")
	@Override
	boolean method24293() {
		return this.aBoolean308;
	}

	@OriginalMember(owner = "client!ajs", name = "ch", descriptor = "()I")
	@Override
	public int method24294() {
		return this.aClass558_3.method31277(1349082800);
	}

	@OriginalMember(owner = "client!ajs", name = "fl", descriptor = "(Lclient!dh;)Lclient!uq;")
	@Override
	public Class600 method24295(@OriginalArg(0) Class104 arg0) {
		return this.aClass600_5;
	}

	@OriginalMember(owner = "client!ajs", name = "fb", descriptor = "(Lclient!dh;)Lclient!uq;")
	@Override
	public Class600 method24296(@OriginalArg(0) Class104 arg0) {
		return this.aClass600_5;
	}

	@OriginalMember(owner = "client!ajs", name = "cb", descriptor = "()I")
	@Override
	public int method24297() {
		return this.aClass558_3.method31251(-306056706);
	}

	@OriginalMember(owner = "client!ajs", name = "go", descriptor = "()V")
	@Override
	void method24269() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ajs", name = "fc", descriptor = "(Lclient!dh;I)Lclient!tl;")
	@Override
	Class573 method24283(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class109 local8 = this.aClass558_3.method31253(arg0, 2048, false, true, -1951434659);
		if (local8 == null) {
			return null;
		}
		@Pc(15) Class470 local15 = this.method24238();
		@Pc(18) Class458 local18 = this.method24241();
		@Pc(23) Class573 local23 = Class125_Sub1.method9214(this.aBoolean307, 373147274);
		@Pc(30) int local30 = (int) local18.aClass472_61.aFloat325 >> 9;
		@Pc(37) int local37 = (int) local18.aClass472_61.aFloat327 >> 9;
		this.aClass558_3.method31254(arg0, local8, local15, local30, local30, local37, local37, true, (byte) 66);
		@Pc(54) Class610 local54 = this.aClass558_3.method31252((short) 91);
		if (local54.aClass463_2 == null) {
			local8.method6947(local15, this.aClass241Array21[0], 0);
		} else {
			local8.method6947(local15, null, 0);
			arg0.method20504(local15, this.aClass241Array21[0], local54.aClass463_2);
		}
		if (this.aClass558_3.aClass674_7 != null) {
			@Pc(89) Class229 local89 = this.aClass558_3.aClass674_7.method33308();
			arg0.method20509(local89);
		}
		this.aBoolean308 = local8.method6865() || this.aClass558_3.aClass674_7 != null;
		if (this.aClass600_5 == null) {
			this.aClass600_5 = Class62.method1154((int) local18.aClass472_61.aFloat325, (int) local18.aClass472_61.aFloat326, (int) local18.aClass472_61.aFloat327, local8, 2131966572);
		} else {
			Class554.method31231(this.aClass600_5, (int) local18.aClass472_61.aFloat325, (int) local18.aClass472_61.aFloat326, (int) local18.aClass472_61.aFloat327, local8, -1347102482);
		}
		return local23;
	}

	@OriginalMember(owner = "client!ajs", name = "fo", descriptor = "(Lclient!dh;)Lclient!tl;")
	@Override
	Class573 method24278(@OriginalArg(0) Class104 arg0) {
		@Pc(8) Class109 local8 = this.aClass558_3.method31253(arg0, 2048, false, true, -1543190719);
		if (local8 == null) {
			return null;
		}
		@Pc(15) Class470 local15 = this.method24238();
		@Pc(18) Class458 local18 = this.method24241();
		@Pc(23) Class573 local23 = Class125_Sub1.method9214(this.aBoolean307, 373147274);
		@Pc(30) int local30 = (int) local18.aClass472_61.aFloat325 >> 9;
		@Pc(37) int local37 = (int) local18.aClass472_61.aFloat327 >> 9;
		this.aClass558_3.method31254(arg0, local8, local15, local30, local30, local37, local37, true, (byte) 116);
		@Pc(54) Class610 local54 = this.aClass558_3.method31252((short) 12320);
		if (local54.aClass463_2 == null) {
			local8.method6947(local15, this.aClass241Array21[0], 0);
		} else {
			local8.method6947(local15, null, 0);
			arg0.method20504(local15, this.aClass241Array21[0], local54.aClass463_2);
		}
		if (this.aClass558_3.aClass674_7 != null) {
			@Pc(89) Class229 local89 = this.aClass558_3.aClass674_7.method33308();
			arg0.method20509(local89);
		}
		this.aBoolean308 = local8.method6865() || this.aClass558_3.aClass674_7 != null;
		if (this.aClass600_5 == null) {
			this.aClass600_5 = Class62.method1154((int) local18.aClass472_61.aFloat325, (int) local18.aClass472_61.aFloat326, (int) local18.aClass472_61.aFloat327, local8, 1754284810);
		} else {
			Class554.method31231(this.aClass600_5, (int) local18.aClass472_61.aFloat325, (int) local18.aClass472_61.aFloat326, (int) local18.aClass472_61.aFloat327, local8, -1127619480);
		}
		return local23;
	}

	@OriginalMember(owner = "client!ajs", name = "q", descriptor = "(Lclient!dh;)V")
	@Override
	public void method13419(@OriginalArg(0) Class104 arg0) {
		this.aClass558_3.method31256(arg0, -1497248091);
	}

	@OriginalMember(owner = "client!ajs", name = "by", descriptor = "(B)I")
	@Override
	public int method24301(@OriginalArg(0) byte arg0) {
		return this.aClass558_3.method31277(1982749337);
	}

	@OriginalMember(owner = "client!ajs", name = "fk", descriptor = "(Lclient!dh;II)Z")
	@Override
	boolean method24302(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class610 local4 = this.aClass558_3.method31252((short) 16678);
		if (local4.aClass463_2 == null) {
			@Pc(27) Class109 local27 = this.aClass558_3.method31253(arg0, 131072, false, false, 38817342);
			return local27 == null ? false : local27.method6859(arg1, arg2, this.method24238(), false, 0);
		} else {
			return arg0.method20502(arg1, arg2, this.method24238(), local4.aClass463_2, 2065111732);
		}
	}

	@OriginalMember(owner = "client!ajs", name = "j", descriptor = "()V")
	@Override
	public void method13426() {
	}

	@OriginalMember(owner = "client!ajs", name = "fr", descriptor = "()Z")
	@Override
	boolean method24304() {
		return false;
	}

	@OriginalMember(owner = "client!ajs", name = "gu", descriptor = "(Lclient!dh;Lclient!alh;IIIZ)V")
	@Override
	void method24305(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class132_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ajs", name = "gq", descriptor = "(Lclient!dh;Lclient!alh;IIIZ)V")
	@Override
	void method24308(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class132_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ajs", name = "gl", descriptor = "(Lclient!dh;Lclient!alh;IIIZ)V")
	@Override
	void method24307(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class132_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ajs", name = "gk", descriptor = "()V")
	@Override
	void method24309() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ajs", name = "b", descriptor = "(Lclient!dh;)V")
	@Override
	public void method13421(@OriginalArg(0) Class104 arg0) {
		this.aClass558_3.method31256(arg0, -1497248091);
	}

	@OriginalMember(owner = "client!ajs", name = "p", descriptor = "()I")
	@Override
	public int method13411() {
		return this.aClass558_3.anInt5485 * 1228794785;
	}

	@OriginalMember(owner = "client!ajs", name = "g", descriptor = "(Lclient!dh;)V")
	@Override
	public void method13424(@OriginalArg(0) Class104 arg0) {
		this.aClass558_3.method31257(arg0, (byte) -36);
	}

	@OriginalMember(owner = "client!ajs", name = "t", descriptor = "()Z")
	@Override
	public boolean method13427() {
		return true;
	}

	@OriginalMember(owner = "client!ajs", name = "bv", descriptor = "(Lclient!vp;)V")
	public void method12962(@OriginalArg(0) Class620 arg0) {
		this.aClass558_3.method31280(arg0, -1946385325);
	}
}
