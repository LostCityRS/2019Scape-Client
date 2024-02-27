package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ajy")
public final class Class132_Sub1_Sub1_Sub3 extends Class132_Sub1_Sub1 implements Interface61 {

	@OriginalMember(owner = "client!ajy", name = "v", descriptor = "Lclient!uq;")
	Class600 aClass600_7;

	@OriginalMember(owner = "client!ajy", name = "o", descriptor = "Z")
	boolean aBoolean326 = true;

	@OriginalMember(owner = "client!ajy", name = "c", descriptor = "Lclient!sp;")
	public Class558 aClass558_4;

	@OriginalMember(owner = "client!ajy", name = "r", descriptor = "Z")
	boolean aBoolean327;

	@OriginalMember(owner = "client!ajy", name = "s", descriptor = "Z")
	final boolean aBoolean328;

	@OriginalMember(owner = "client!ajy", name = "bg", descriptor = "(II)B")
	static byte method13297(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Class615.aClass615_6.anInt5789 * 948246811 == arg0) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ajy", name = "ba", descriptor = "(II)B")
	static byte method13298(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Class615.aClass615_6.anInt5789 * 948246811 == arg0) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ajy", name = "bp", descriptor = "(II)B")
	static byte method13299(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Class615.aClass615_6.anInt5789 * 948246811 == arg0) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ajy", name = "n", descriptor = "(IB)Lclient!iw;")
	public static Class351 method13301(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(2) Class351[] local2 = Class32_Sub21.method17599((byte) -95);
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class351 local12 = local2[local4];
			if (arg0 == local12.anInt4244 * 1429919719) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ajy", name = "<init>", descriptor = "(Lclient!tx;Lclient!dh;Lclient!aop;Lclient!vd;IIIIIZIIIIIIIIZLclient!oe;)V")
	public Class132_Sub1_Sub1_Sub3(@OriginalArg(0) Class585 arg0, @OriginalArg(1) Class104 arg1, @OriginalArg(2) Class32_Sub14 arg2, @OriginalArg(3) Class610 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) boolean arg18, @OriginalArg(19) Class458 arg19) {
		super(arg0, arg4, arg5, arg6, arg7, arg8, arg10, arg11, arg12, arg13, arg3.anInt5771 * -927091685 == 1, Class478.method29890(arg14, arg15, -489903359), arg19);
		this.aClass558_4 = new Class558(arg1, arg2, arg3, arg14, arg15, arg5, this, arg9, arg16, arg17);
		this.aBoolean327 = arg3.anInt5753 * 1067969079 != 0 && !arg9;
		this.aBoolean328 = arg18;
		this.method24288(1, -811196094);
	}

	@OriginalMember(owner = "client!ajy", name = "br", descriptor = "(Lclient!vp;B)V")
	public void method13295(@OriginalArg(0) Class620 arg0, @OriginalArg(1) byte arg1) {
		this.aClass558_4.method31280(arg0, -337720521);
	}

	@OriginalMember(owner = "client!ajy", name = "bu", descriptor = "(B)Z")
	@Override
	boolean method24274(@OriginalArg(0) byte arg0) {
		return false;
	}

	@OriginalMember(owner = "client!ajy", name = "bw", descriptor = "(S)Z")
	@Override
	boolean method24275(@OriginalArg(0) short arg0) {
		return this.aBoolean326;
	}

	@OriginalMember(owner = "client!ajy", name = "fy", descriptor = "(Lclient!dh;)V")
	@Override
	void method24306(@OriginalArg(0) Class104 arg0) {
		@Pc(8) Class109 local8 = this.aClass558_4.method31253(arg0, 262144, true, true, -189354657);
		if (local8 != null) {
			this.aClass558_4.method31254(arg0, local8, this.method24238(), this.aShort129, this.aShort130, this.aShort128, this.aShort127, false, (byte) 120);
		}
	}

	@OriginalMember(owner = "client!ajy", name = "fv", descriptor = "(Lclient!dh;B)Lclient!uq;")
	@Override
	public Class600 method24310(@OriginalArg(0) Class104 arg0, @OriginalArg(1) byte arg1) {
		return this.aClass600_7;
	}

	@OriginalMember(owner = "client!ajy", name = "bo", descriptor = "(I)I")
	@Override
	public int method24287(@OriginalArg(0) int arg0) {
		return this.aClass558_4.method31251(830618807);
	}

	@OriginalMember(owner = "client!ajy", name = "fc", descriptor = "(Lclient!dh;I)Lclient!tl;")
	@Override
	Class573 method24283(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class109 local8 = this.aClass558_4.method31253(arg0, 2048, false, true, -403965217);
		if (local8 == null) {
			return null;
		}
		@Pc(16) Class470 local16 = this.method24238();
		@Pc(21) Class573 local21 = Class125_Sub1.method9214(this.aBoolean327, 373147274);
		this.aClass558_4.method31254(arg0, local8, local16, this.aShort129, this.aShort130, this.aShort128, this.aShort127, true, (byte) 115);
		@Pc(42) Class610 local42 = this.aClass558_4.method31252((short) 10828);
		if (local42.aClass463_2 == null) {
			local8.method6947(local16, this.aClass241Array21[0], 0);
		} else {
			local8.method6947(local16, null, 0);
			arg0.method20504(local16, this.aClass241Array21[0], local42.aClass463_2);
		}
		if (this.aClass558_4.aClass674_7 != null) {
			@Pc(78) Class229 local78 = this.aClass558_4.aClass674_7.method33308();
			arg0.method20509(local78);
		}
		this.aBoolean326 = local8.method6865() || this.aClass558_4.aClass674_7 != null;
		@Pc(97) Class458 local97 = this.method24241();
		if (this.aClass600_7 == null) {
			this.aClass600_7 = Class62.method1154((int) local97.aClass472_61.aFloat325, (int) local97.aClass472_61.aFloat326, (int) local97.aClass472_61.aFloat327, local8, 2133240110);
		} else {
			Class554.method31231(this.aClass600_7, (int) local97.aClass472_61.aFloat325, (int) local97.aClass472_61.aFloat326, (int) local97.aClass472_61.aFloat327, local8, -1273982891);
		}
		return local21;
	}

	@OriginalMember(owner = "client!ajy", name = "fw", descriptor = "(Lclient!dh;I)V")
	@Override
	void method24279(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class109 local8 = this.aClass558_4.method31253(arg0, 262144, true, true, -549070200);
		if (local8 != null) {
			this.aClass558_4.method31254(arg0, local8, this.method24238(), this.aShort129, this.aShort130, this.aShort128, this.aShort127, false, (byte) 49);
		}
	}

	@OriginalMember(owner = "client!ajy", name = "fk", descriptor = "(Lclient!dh;II)Z")
	@Override
	boolean method24302(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class610 local4 = this.aClass558_4.method31252((short) 270);
		if (local4.aClass463_2 == null) {
			@Pc(26) Class109 local26 = this.aClass558_4.method31253(arg0, 131072, false, false, 43437991);
			return local26 == null ? false : local26.method6859(arg1, arg2, this.method24238(), false, 0);
		} else {
			return arg0.method20502(arg1, arg2, this.method24238(), local4.aClass463_2, -1943005932);
		}
	}

	@OriginalMember(owner = "client!ajy", name = "fa", descriptor = "(Lclient!dh;IIB)Z")
	@Override
	boolean method24271(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		@Pc(4) Class610 local4 = this.aClass558_4.method31252((short) -11695);
		if (local4.aClass463_2 == null) {
			@Pc(26) Class109 local26 = this.aClass558_4.method31253(arg0, 131072, false, false, 238939136);
			return local26 == null ? false : local26.method6859(arg1, arg2, this.method24238(), false, 0);
		} else {
			return arg0.method20502(arg1, arg2, this.method24238(), local4.aClass463_2, -85813219);
		}
	}

	@OriginalMember(owner = "client!ajy", name = "fh", descriptor = "()Z")
	@Override
	boolean method24284() {
		return false;
	}

	@OriginalMember(owner = "client!ajy", name = "fq", descriptor = "(Lclient!dh;Lclient!alh;IIIZB)V")
	@Override
	void method24281(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class132_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ajy", name = "ff", descriptor = "(B)V")
	@Override
	void method24277(@OriginalArg(0) byte arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ajy", name = "e", descriptor = "(I)I")
	@Override
	public int method13423(@OriginalArg(0) int arg0) {
		return this.aClass558_4.anInt5485 * 1228794785;
	}

	@OriginalMember(owner = "client!ajy", name = "fp", descriptor = "(I)Z")
	@Override
	boolean method24273(@OriginalArg(0) int arg0) {
		return false;
	}

	@OriginalMember(owner = "client!ajy", name = "m", descriptor = "(I)I")
	@Override
	public int method13404(@OriginalArg(0) int arg0) {
		return this.aClass558_4.anInt5487 * -922764575;
	}

	@OriginalMember(owner = "client!ajy", name = "n", descriptor = "(I)I")
	@Override
	public int method13420(@OriginalArg(0) int arg0) {
		return this.aClass558_4.anInt5486 * -989891395;
	}

	@OriginalMember(owner = "client!ajy", name = "w", descriptor = "(B)Z")
	@Override
	public boolean method13407(@OriginalArg(0) byte arg0) {
		return this.aBoolean328;
	}

	@OriginalMember(owner = "client!ajy", name = "cs", descriptor = "()I")
	@Override
	public int method24298() {
		return this.aClass558_4.method31251(63544613);
	}

	@OriginalMember(owner = "client!ajy", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method13406(@OriginalArg(0) int arg0) {
		return this.aClass558_4.method31255((byte) -62);
	}

	@OriginalMember(owner = "client!ajy", name = "ch", descriptor = "()I")
	@Override
	public int method24294() {
		return this.aClass558_4.method31277(1806705736);
	}

	@OriginalMember(owner = "client!ajy", name = "k", descriptor = "(I)V")
	@Override
	public void method13405(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ajy", name = "p", descriptor = "()I")
	@Override
	public int method13411() {
		return this.aClass558_4.anInt5485 * 1228794785;
	}

	@OriginalMember(owner = "client!ajy", name = "d", descriptor = "()I")
	@Override
	public int method13403() {
		return this.aClass558_4.anInt5486 * -989891395;
	}

	@OriginalMember(owner = "client!ajy", name = "bj", descriptor = "(Lclient!vp;)V")
	public void method13296(@OriginalArg(0) Class620 arg0) {
		this.aClass558_4.method31280(arg0, -773107845);
	}

	@OriginalMember(owner = "client!ajy", name = "r", descriptor = "()I")
	@Override
	public int method13416() {
		return this.aClass558_4.anInt5487 * -922764575;
	}

	@OriginalMember(owner = "client!ajy", name = "v", descriptor = "()I")
	@Override
	public int method13412() {
		return this.aClass558_4.anInt5487 * -922764575;
	}

	@OriginalMember(owner = "client!ajy", name = "cq", descriptor = "()Z")
	@Override
	boolean method24293() {
		return this.aBoolean326;
	}

	@OriginalMember(owner = "client!ajy", name = "gk", descriptor = "()V")
	@Override
	void method24309() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ajy", name = "y", descriptor = "(Lclient!dh;)V")
	@Override
	public void method13418(@OriginalArg(0) Class104 arg0) {
		this.aClass558_4.method31256(arg0, -1497248091);
	}

	@OriginalMember(owner = "client!ajy", name = "q", descriptor = "(Lclient!dh;)V")
	@Override
	public void method13419(@OriginalArg(0) Class104 arg0) {
		this.aClass558_4.method31256(arg0, -1497248091);
	}

	@OriginalMember(owner = "client!ajy", name = "x", descriptor = "(Lclient!dh;)V")
	@Override
	public void method13408(@OriginalArg(0) Class104 arg0) {
		this.aClass558_4.method31256(arg0, -1497248091);
	}

	@OriginalMember(owner = "client!ajy", name = "b", descriptor = "(Lclient!dh;)V")
	@Override
	public void method13421(@OriginalArg(0) Class104 arg0) {
		this.aClass558_4.method31256(arg0, -1497248091);
	}

	@OriginalMember(owner = "client!ajy", name = "h", descriptor = "(Lclient!dh;)V")
	@Override
	public void method13402(@OriginalArg(0) Class104 arg0) {
		this.aClass558_4.method31257(arg0, (byte) 12);
	}

	@OriginalMember(owner = "client!ajy", name = "a", descriptor = "(Lclient!dh;)V")
	@Override
	public void method13422(@OriginalArg(0) Class104 arg0) {
		this.aClass558_4.method31257(arg0, (byte) 68);
	}

	@OriginalMember(owner = "client!ajy", name = "go", descriptor = "()V")
	@Override
	void method24269() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ajy", name = "cf", descriptor = "()Z")
	@Override
	boolean method24311() {
		return false;
	}

	@OriginalMember(owner = "client!ajy", name = "co", descriptor = "()Z")
	@Override
	boolean method24290() {
		return false;
	}

	@OriginalMember(owner = "client!ajy", name = "cr", descriptor = "()Z")
	@Override
	boolean method24291() {
		return this.aBoolean326;
	}

	@OriginalMember(owner = "client!ajy", name = "cm", descriptor = "()Z")
	@Override
	boolean method24292() {
		return this.aBoolean326;
	}

	@OriginalMember(owner = "client!ajy", name = "o", descriptor = "()I")
	@Override
	public int method13414() {
		return this.aClass558_4.anInt5487 * -922764575;
	}

	@OriginalMember(owner = "client!ajy", name = "s", descriptor = "()Z")
	@Override
	public boolean method13415() {
		return this.aClass558_4.method31255((byte) 58);
	}

	@OriginalMember(owner = "client!ajy", name = "l", descriptor = "(Lclient!dh;B)V")
	@Override
	public void method13417(@OriginalArg(0) Class104 arg0, @OriginalArg(1) byte arg1) {
		this.aClass558_4.method31256(arg0, -1497248091);
	}

	@OriginalMember(owner = "client!ajy", name = "fl", descriptor = "(Lclient!dh;)Lclient!uq;")
	@Override
	public Class600 method24295(@OriginalArg(0) Class104 arg0) {
		return this.aClass600_7;
	}

	@OriginalMember(owner = "client!ajy", name = "fb", descriptor = "(Lclient!dh;)Lclient!uq;")
	@Override
	public Class600 method24296(@OriginalArg(0) Class104 arg0) {
		return this.aClass600_7;
	}

	@OriginalMember(owner = "client!ajy", name = "i", descriptor = "()V")
	@Override
	public void method13425() {
	}

	@OriginalMember(owner = "client!ajy", name = "cy", descriptor = "()I")
	@Override
	public int method24299() {
		return this.aClass558_4.method31251(-180206367);
	}

	@OriginalMember(owner = "client!ajy", name = "fo", descriptor = "(Lclient!dh;)Lclient!tl;")
	@Override
	Class573 method24278(@OriginalArg(0) Class104 arg0) {
		@Pc(8) Class109 local8 = this.aClass558_4.method31253(arg0, 2048, false, true, -591724499);
		if (local8 == null) {
			return null;
		}
		@Pc(16) Class470 local16 = this.method24238();
		@Pc(21) Class573 local21 = Class125_Sub1.method9214(this.aBoolean327, 373147274);
		this.aClass558_4.method31254(arg0, local8, local16, this.aShort129, this.aShort130, this.aShort128, this.aShort127, true, (byte) 70);
		@Pc(42) Class610 local42 = this.aClass558_4.method31252((short) 11633);
		if (local42.aClass463_2 == null) {
			local8.method6947(local16, this.aClass241Array21[0], 0);
		} else {
			local8.method6947(local16, null, 0);
			arg0.method20504(local16, this.aClass241Array21[0], local42.aClass463_2);
		}
		if (this.aClass558_4.aClass674_7 != null) {
			@Pc(78) Class229 local78 = this.aClass558_4.aClass674_7.method33308();
			arg0.method20509(local78);
		}
		this.aBoolean326 = local8.method6865() || this.aClass558_4.aClass674_7 != null;
		@Pc(97) Class458 local97 = this.method24241();
		if (this.aClass600_7 == null) {
			this.aClass600_7 = Class62.method1154((int) local97.aClass472_61.aFloat325, (int) local97.aClass472_61.aFloat326, (int) local97.aClass472_61.aFloat327, local8, 1818459585);
		} else {
			Class554.method31231(this.aClass600_7, (int) local97.aClass472_61.aFloat325, (int) local97.aClass472_61.aFloat326, (int) local97.aClass472_61.aFloat327, local8, -1415031596);
		}
		return local21;
	}

	@OriginalMember(owner = "client!ajy", name = "fe", descriptor = "(Lclient!dh;)V")
	@Override
	void method24315(@OriginalArg(0) Class104 arg0) {
		@Pc(8) Class109 local8 = this.aClass558_4.method31253(arg0, 262144, true, true, 422578610);
		if (local8 != null) {
			this.aClass558_4.method31254(arg0, local8, this.method24238(), this.aShort129, this.aShort130, this.aShort128, this.aShort127, false, (byte) 2);
		}
	}

	@OriginalMember(owner = "client!ajy", name = "u", descriptor = "(Lclient!dh;B)V")
	@Override
	public void method13409(@OriginalArg(0) Class104 arg0, @OriginalArg(1) byte arg1) {
		this.aClass558_4.method31257(arg0, (byte) 10);
	}

	@OriginalMember(owner = "client!ajy", name = "g", descriptor = "(Lclient!dh;)V")
	@Override
	public void method13424(@OriginalArg(0) Class104 arg0) {
		this.aClass558_4.method31257(arg0, (byte) 70);
	}

	@OriginalMember(owner = "client!ajy", name = "cb", descriptor = "()I")
	@Override
	public int method24297() {
		return this.aClass558_4.method31251(541538715);
	}

	@OriginalMember(owner = "client!ajy", name = "by", descriptor = "(B)I")
	@Override
	public int method24301(@OriginalArg(0) byte arg0) {
		return this.aClass558_4.method31277(1752358791);
	}

	@OriginalMember(owner = "client!ajy", name = "c", descriptor = "()I")
	@Override
	public int method13413() {
		return this.aClass558_4.anInt5487 * -922764575;
	}

	@OriginalMember(owner = "client!ajy", name = "fr", descriptor = "()Z")
	@Override
	boolean method24304() {
		return false;
	}

	@OriginalMember(owner = "client!ajy", name = "gu", descriptor = "(Lclient!dh;Lclient!alh;IIIZ)V")
	@Override
	void method24305(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class132_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ajy", name = "gq", descriptor = "(Lclient!dh;Lclient!alh;IIIZ)V")
	@Override
	void method24308(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class132_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ajy", name = "gl", descriptor = "(Lclient!dh;Lclient!alh;IIIZ)V")
	@Override
	void method24307(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class132_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ajy", name = "j", descriptor = "()V")
	@Override
	public void method13426() {
	}

	@OriginalMember(owner = "client!ajy", name = "z", descriptor = "()I")
	@Override
	public int method13410() {
		return this.aClass558_4.anInt5485 * 1228794785;
	}

	@OriginalMember(owner = "client!ajy", name = "bs", descriptor = "(Lclient!vp;)V")
	public void method13300(@OriginalArg(0) Class620 arg0) {
		this.aClass558_4.method31280(arg0, 1185193025);
	}

	@OriginalMember(owner = "client!ajy", name = "t", descriptor = "()Z")
	@Override
	public boolean method13427() {
		return this.aBoolean328;
	}
}
