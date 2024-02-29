package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ajy")
public class Class132_Sub1_Sub1_Sub3 extends Class132_Sub1_Sub1 implements Interface61 {

	@OriginalMember(owner = "client!ajy", name = "v", descriptor = "Lclient!uq;")
	Class600 aClass600_7;

	@OriginalMember(owner = "client!ajy", name = "o", descriptor = "Z")
	boolean aBoolean325 = true;

	@OriginalMember(owner = "client!ajy", name = "c", descriptor = "Lclient!sp;")
	public Class558 aClass558_4;

	@OriginalMember(owner = "client!ajy", name = "r", descriptor = "Z")
	boolean aBoolean326;

	@OriginalMember(owner = "client!ajy", name = "s", descriptor = "Z")
	final boolean aBoolean327;

	@OriginalMember(owner = "client!ajy", name = "n", descriptor = "(IB)Lclient!iw;", line = 22)
	public static Class351 method13295(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(2) Class351[] local2 = Class32_Sub21.method17587((byte) -95);
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class351 local12 = local2[local4];
			if (arg0 == local12.anInt4203 * 1429919719) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ajy", name = "<init>", descriptor = "(Lclient!tx;Lclient!dh;Lclient!aop;Lclient!vd;IIIIIZIIIIIIIIZLclient!oe;)V", line = 27)
	public Class132_Sub1_Sub1_Sub3(@OriginalArg(0) Class585 arg0, @OriginalArg(1) Class104 arg1, @OriginalArg(2) Class32_Sub14 arg2, @OriginalArg(3) Class610 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) boolean arg18, @OriginalArg(19) Class458 arg19) {
		super(arg0, arg4, arg5, arg6, arg7, arg8, arg10, arg11, arg12, arg13, arg3.anInt5610 * -927091685 == 1, Class478.method29708(arg14, arg15, -489903359), arg19);
		this.aClass558_4 = new Class558(arg1, arg2, arg3, arg14, arg15, arg5, this, arg9, arg16, arg17);
		this.aBoolean326 = arg3.anInt5592 * 1067969079 != 0 && !arg9;
		this.aBoolean327 = arg18;
		this.method24274(1, -811196094);
	}

	@OriginalMember(owner = "client!ajy", name = "bu", descriptor = "(B)Z", line = 35)
	@Override
	boolean method24285(@OriginalArg(0) byte arg0) {
		return false;
	}

	@OriginalMember(owner = "client!ajy", name = "cf", descriptor = "()Z", line = 35)
	@Override
	boolean method24312() {
		return false;
	}

	@OriginalMember(owner = "client!ajy", name = "co", descriptor = "()Z", line = 35)
	@Override
	boolean method24296() {
		return false;
	}

	@OriginalMember(owner = "client!ajy", name = "bw", descriptor = "(S)Z", line = 39)
	@Override
	boolean method24286(@OriginalArg(0) short arg0) {
		return this.aBoolean325;
	}

	@OriginalMember(owner = "client!ajy", name = "cq", descriptor = "()Z", line = 39)
	@Override
	boolean method24299() {
		return this.aBoolean325;
	}

	@OriginalMember(owner = "client!ajy", name = "cr", descriptor = "()Z", line = 39)
	@Override
	boolean method24297() {
		return this.aBoolean325;
	}

	@OriginalMember(owner = "client!ajy", name = "cm", descriptor = "()Z", line = 39)
	@Override
	boolean method24298() {
		return this.aBoolean325;
	}

	@OriginalMember(owner = "client!ajy", name = "bg", descriptor = "(II)B", line = 43)
	static byte method13296(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Class615.aClass615_6.anInt5628 * 948246811 == arg0) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ajy", name = "ba", descriptor = "(II)B", line = 43)
	static byte method13297(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Class615.aClass615_6.anInt5628 * 948246811 == arg0) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ajy", name = "bp", descriptor = "(II)B", line = 43)
	static byte method13298(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Class615.aClass615_6.anInt5628 * 948246811 == arg0) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ajy", name = "ch", descriptor = "()I", line = 49)
	@Override
	public int method24300() {
		return this.aClass558_4.method31070(1806705736);
	}

	@OriginalMember(owner = "client!ajy", name = "by", descriptor = "(B)I", line = 49)
	@Override
	public int method24303(@OriginalArg(0) byte arg0) {
		return this.aClass558_4.method31070(1752358791);
	}

	@OriginalMember(owner = "client!ajy", name = "fv", descriptor = "(Lclient!dh;B)Lclient!uq;", line = 53)
	@Override
	public Class600 method24311(@OriginalArg(0) Class104 arg0, @OriginalArg(1) byte arg1) {
		return this.aClass600_7;
	}

	@OriginalMember(owner = "client!ajy", name = "fl", descriptor = "(Lclient!dh;)Lclient!uq;", line = 53)
	@Override
	public Class600 method24301(@OriginalArg(0) Class104 arg0) {
		return this.aClass600_7;
	}

	@OriginalMember(owner = "client!ajy", name = "fb", descriptor = "(Lclient!dh;)Lclient!uq;", line = 53)
	@Override
	public Class600 method24302(@OriginalArg(0) Class104 arg0) {
		return this.aClass600_7;
	}

	@OriginalMember(owner = "client!ajy", name = "bo", descriptor = "(I)I", line = 57)
	@Override
	public int method24270(@OriginalArg(0) int arg0) {
		return this.aClass558_4.method31078(830618807);
	}

	@OriginalMember(owner = "client!ajy", name = "cs", descriptor = "()I", line = 57)
	@Override
	public int method24272() {
		return this.aClass558_4.method31078(63544613);
	}

	@OriginalMember(owner = "client!ajy", name = "cy", descriptor = "()I", line = 57)
	@Override
	public int method24273() {
		return this.aClass558_4.method31078(-180206367);
	}

	@OriginalMember(owner = "client!ajy", name = "cb", descriptor = "()I", line = 57)
	@Override
	public int method24271() {
		return this.aClass558_4.method31078(541538715);
	}

	@OriginalMember(owner = "client!ajy", name = "fc", descriptor = "(Lclient!dh;I)Lclient!tl;", line = 61)
	@Override
	Class573 method24293(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class109 local8 = this.aClass558_4.method31081(arg0, 2048, false, true, -403965217);
		if (local8 == null) {
			return null;
		}
		@Pc(16) Class470 local16 = this.method24227();
		@Pc(21) Class573 local21 = Class125_Sub1.method9212(this.aBoolean326, 373147274);
		this.aClass558_4.method31085(arg0, local8, local16, this.aShort129, this.aShort130, this.aShort128, this.aShort127, true, (byte) 115);
		@Pc(42) Class610 local42 = this.aClass558_4.method31079((short) 10828);
		if (local42.aClass463_2 == null) {
			local8.method6976(local16, this.aClass241Array21[0], 0);
		} else {
			local8.method6976(local16, null, 0);
			arg0.method20583(local16, this.aClass241Array21[0], local42.aClass463_2);
		}
		if (this.aClass558_4.aClass674_7 != null) {
			@Pc(78) Class229 local78 = this.aClass558_4.aClass674_7.method33132();
			arg0.method20588(local78);
		}
		this.aBoolean325 = local8.method6903() || this.aClass558_4.aClass674_7 != null;
		@Pc(97) Class458 local97 = this.method24220();
		if (this.aClass600_7 == null) {
			this.aClass600_7 = Class62.method1143((int) local97.aClass472_61.aFloat317, (int) local97.aClass472_61.aFloat318, (int) local97.aClass472_61.aFloat319, local8, 2133240110);
		} else {
			Class554.method31050(this.aClass600_7, (int) local97.aClass472_61.aFloat317, (int) local97.aClass472_61.aFloat318, (int) local97.aClass472_61.aFloat319, local8, -1273982891);
		}
		return local21;
	}

	@OriginalMember(owner = "client!ajy", name = "fo", descriptor = "(Lclient!dh;)Lclient!tl;", line = 61)
	@Override
	Class573 method24289(@OriginalArg(0) Class104 arg0) {
		@Pc(8) Class109 local8 = this.aClass558_4.method31081(arg0, 2048, false, true, -591724499);
		if (local8 == null) {
			return null;
		}
		@Pc(16) Class470 local16 = this.method24227();
		@Pc(21) Class573 local21 = Class125_Sub1.method9212(this.aBoolean326, 373147274);
		this.aClass558_4.method31085(arg0, local8, local16, this.aShort129, this.aShort130, this.aShort128, this.aShort127, true, (byte) 70);
		@Pc(42) Class610 local42 = this.aClass558_4.method31079((short) 11633);
		if (local42.aClass463_2 == null) {
			local8.method6976(local16, this.aClass241Array21[0], 0);
		} else {
			local8.method6976(local16, null, 0);
			arg0.method20583(local16, this.aClass241Array21[0], local42.aClass463_2);
		}
		if (this.aClass558_4.aClass674_7 != null) {
			@Pc(78) Class229 local78 = this.aClass558_4.aClass674_7.method33132();
			arg0.method20588(local78);
		}
		this.aBoolean325 = local8.method6903() || this.aClass558_4.aClass674_7 != null;
		@Pc(97) Class458 local97 = this.method24220();
		if (this.aClass600_7 == null) {
			this.aClass600_7 = Class62.method1143((int) local97.aClass472_61.aFloat317, (int) local97.aClass472_61.aFloat318, (int) local97.aClass472_61.aFloat319, local8, 1818459585);
		} else {
			Class554.method31050(this.aClass600_7, (int) local97.aClass472_61.aFloat317, (int) local97.aClass472_61.aFloat318, (int) local97.aClass472_61.aFloat319, local8, -1415031596);
		}
		return local21;
	}

	@OriginalMember(owner = "client!ajy", name = "fy", descriptor = "(Lclient!dh;)V", line = 84)
	@Override
	void method24307(@OriginalArg(0) Class104 arg0) {
		@Pc(8) Class109 local8 = this.aClass558_4.method31081(arg0, 262144, true, true, -189354657);
		if (local8 != null) {
			this.aClass558_4.method31085(arg0, local8, this.method24227(), this.aShort129, this.aShort130, this.aShort128, this.aShort127, false, (byte) 120);
		}
	}

	@OriginalMember(owner = "client!ajy", name = "fw", descriptor = "(Lclient!dh;I)V", line = 84)
	@Override
	void method24290(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class109 local8 = this.aClass558_4.method31081(arg0, 262144, true, true, -549070200);
		if (local8 != null) {
			this.aClass558_4.method31085(arg0, local8, this.method24227(), this.aShort129, this.aShort130, this.aShort128, this.aShort127, false, (byte) 49);
		}
	}

	@OriginalMember(owner = "client!ajy", name = "fe", descriptor = "(Lclient!dh;)V", line = 84)
	@Override
	void method24314(@OriginalArg(0) Class104 arg0) {
		@Pc(8) Class109 local8 = this.aClass558_4.method31081(arg0, 262144, true, true, 422578610);
		if (local8 != null) {
			this.aClass558_4.method31085(arg0, local8, this.method24227(), this.aShort129, this.aShort130, this.aShort128, this.aShort127, false, (byte) 2);
		}
	}

	@OriginalMember(owner = "client!ajy", name = "br", descriptor = "(Lclient!vp;B)V", line = 91)
	public void method13299(@OriginalArg(0) Class620 arg0, @OriginalArg(1) byte arg1) {
		this.aClass558_4.method31075(arg0, -337720521);
	}

	@OriginalMember(owner = "client!ajy", name = "bj", descriptor = "(Lclient!vp;)V", line = 91)
	public void method13300(@OriginalArg(0) Class620 arg0) {
		this.aClass558_4.method31075(arg0, -773107845);
	}

	@OriginalMember(owner = "client!ajy", name = "bs", descriptor = "(Lclient!vp;)V", line = 91)
	public void method13301(@OriginalArg(0) Class620 arg0) {
		this.aClass558_4.method31075(arg0, 1185193025);
	}

	@OriginalMember(owner = "client!ajy", name = "fk", descriptor = "(Lclient!dh;II)Z", line = 95)
	@Override
	boolean method24304(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class610 local4 = this.aClass558_4.method31079((short) 270);
		if (local4.aClass463_2 == null) {
			@Pc(26) Class109 local26 = this.aClass558_4.method31081(arg0, 131072, false, false, 43437991);
			return local26 == null ? false : local26.method6897(arg1, arg2, this.method24227(), false, 0);
		} else {
			return arg0.method20482(arg1, arg2, this.method24227(), local4.aClass463_2, -1943005932);
		}
	}

	@OriginalMember(owner = "client!ajy", name = "fa", descriptor = "(Lclient!dh;IIB)Z", line = 95)
	@Override
	boolean method24283(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		@Pc(4) Class610 local4 = this.aClass558_4.method31079((short) -11695);
		if (local4.aClass463_2 == null) {
			@Pc(26) Class109 local26 = this.aClass558_4.method31081(arg0, 131072, false, false, 238939136);
			return local26 == null ? false : local26.method6897(arg1, arg2, this.method24227(), false, 0);
		} else {
			return arg0.method20482(arg1, arg2, this.method24227(), local4.aClass463_2, -85813219);
		}
	}

	@OriginalMember(owner = "client!ajy", name = "fh", descriptor = "()Z", line = 103)
	@Override
	final boolean method24294() {
		return false;
	}

	@OriginalMember(owner = "client!ajy", name = "fp", descriptor = "(I)Z", line = 103)
	@Override
	final boolean method24284(@OriginalArg(0) int arg0) {
		return false;
	}

	@OriginalMember(owner = "client!ajy", name = "fr", descriptor = "()Z", line = 103)
	@Override
	final boolean method24305() {
		return false;
	}

	@OriginalMember(owner = "client!ajy", name = "fq", descriptor = "(Lclient!dh;Lclient!alh;IIIZB)V", line = 107)
	@Override
	final void method24291(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class132_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ajy", name = "gu", descriptor = "(Lclient!dh;Lclient!alh;IIIZ)V", line = 107)
	@Override
	final void method24306(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class132_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ajy", name = "gq", descriptor = "(Lclient!dh;Lclient!alh;IIIZ)V", line = 107)
	@Override
	final void method24309(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class132_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ajy", name = "gl", descriptor = "(Lclient!dh;Lclient!alh;IIIZ)V", line = 107)
	@Override
	final void method24308(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class132_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ajy", name = "ff", descriptor = "(B)V", line = 111)
	@Override
	final void method24288(@OriginalArg(0) byte arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ajy", name = "gk", descriptor = "()V", line = 111)
	@Override
	final void method24310() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ajy", name = "go", descriptor = "()V", line = 111)
	@Override
	final void method24281() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ajy", name = "e", descriptor = "(I)I", line = 115)
	@Override
	public int method13423(@OriginalArg(0) int arg0) {
		return this.aClass558_4.anInt5324 * 1228794785;
	}

	@OriginalMember(owner = "client!ajy", name = "p", descriptor = "()I", line = 115)
	@Override
	public int method13411() {
		return this.aClass558_4.anInt5324 * 1228794785;
	}

	@OriginalMember(owner = "client!ajy", name = "z", descriptor = "()I", line = 115)
	@Override
	public int method13410() {
		return this.aClass558_4.anInt5324 * 1228794785;
	}

	@OriginalMember(owner = "client!ajy", name = "n", descriptor = "(I)I", line = 119)
	@Override
	public int method13420(@OriginalArg(0) int arg0) {
		return this.aClass558_4.anInt5325 * -989891395;
	}

	@OriginalMember(owner = "client!ajy", name = "d", descriptor = "()I", line = 119)
	@Override
	public int method13403() {
		return this.aClass558_4.anInt5325 * -989891395;
	}

	@OriginalMember(owner = "client!ajy", name = "m", descriptor = "(I)I", line = 123)
	@Override
	public int method13404(@OriginalArg(0) int arg0) {
		return this.aClass558_4.anInt5326 * -922764575;
	}

	@OriginalMember(owner = "client!ajy", name = "r", descriptor = "()I", line = 123)
	@Override
	public int method13416() {
		return this.aClass558_4.anInt5326 * -922764575;
	}

	@OriginalMember(owner = "client!ajy", name = "v", descriptor = "()I", line = 123)
	@Override
	public int method13412() {
		return this.aClass558_4.anInt5326 * -922764575;
	}

	@OriginalMember(owner = "client!ajy", name = "o", descriptor = "()I", line = 123)
	@Override
	public int method13414() {
		return this.aClass558_4.anInt5326 * -922764575;
	}

	@OriginalMember(owner = "client!ajy", name = "c", descriptor = "()I", line = 123)
	@Override
	public int method13413() {
		return this.aClass558_4.anInt5326 * -922764575;
	}

	@OriginalMember(owner = "client!ajy", name = "k", descriptor = "(I)V", line = 126)
	@Override
	public void method13405(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ajy", name = "i", descriptor = "()V", line = 126)
	@Override
	public void method13425() {
	}

	@OriginalMember(owner = "client!ajy", name = "j", descriptor = "()V", line = 126)
	@Override
	public void method13426() {
	}

	@OriginalMember(owner = "client!ajy", name = "w", descriptor = "(B)Z", line = 129)
	@Override
	public boolean method13407(@OriginalArg(0) byte arg0) {
		return this.aBoolean327;
	}

	@OriginalMember(owner = "client!ajy", name = "t", descriptor = "()Z", line = 129)
	@Override
	public boolean method13427() {
		return this.aBoolean327;
	}

	@OriginalMember(owner = "client!ajy", name = "f", descriptor = "(I)Z", line = 133)
	@Override
	public boolean method13406(@OriginalArg(0) int arg0) {
		return this.aClass558_4.method31088((byte) -62);
	}

	@OriginalMember(owner = "client!ajy", name = "s", descriptor = "()Z", line = 133)
	@Override
	public boolean method13415() {
		return this.aClass558_4.method31088((byte) 58);
	}

	@OriginalMember(owner = "client!ajy", name = "y", descriptor = "(Lclient!dh;)V", line = 137)
	@Override
	public void method13418(@OriginalArg(0) Class104 arg0) {
		this.aClass558_4.method31093(arg0, -1497248091);
	}

	@OriginalMember(owner = "client!ajy", name = "q", descriptor = "(Lclient!dh;)V", line = 137)
	@Override
	public void method13419(@OriginalArg(0) Class104 arg0) {
		this.aClass558_4.method31093(arg0, -1497248091);
	}

	@OriginalMember(owner = "client!ajy", name = "x", descriptor = "(Lclient!dh;)V", line = 137)
	@Override
	public void method13408(@OriginalArg(0) Class104 arg0) {
		this.aClass558_4.method31093(arg0, -1497248091);
	}

	@OriginalMember(owner = "client!ajy", name = "b", descriptor = "(Lclient!dh;)V", line = 137)
	@Override
	public void method13421(@OriginalArg(0) Class104 arg0) {
		this.aClass558_4.method31093(arg0, -1497248091);
	}

	@OriginalMember(owner = "client!ajy", name = "l", descriptor = "(Lclient!dh;B)V", line = 137)
	@Override
	public void method13417(@OriginalArg(0) Class104 arg0, @OriginalArg(1) byte arg1) {
		this.aClass558_4.method31093(arg0, -1497248091);
	}

	@OriginalMember(owner = "client!ajy", name = "h", descriptor = "(Lclient!dh;)V", line = 141)
	@Override
	public void method13402(@OriginalArg(0) Class104 arg0) {
		this.aClass558_4.method31097(arg0, (byte) 12);
	}

	@OriginalMember(owner = "client!ajy", name = "a", descriptor = "(Lclient!dh;)V", line = 141)
	@Override
	public void method13422(@OriginalArg(0) Class104 arg0) {
		this.aClass558_4.method31097(arg0, (byte) 68);
	}

	@OriginalMember(owner = "client!ajy", name = "u", descriptor = "(Lclient!dh;B)V", line = 141)
	@Override
	public void method13409(@OriginalArg(0) Class104 arg0, @OriginalArg(1) byte arg1) {
		this.aClass558_4.method31097(arg0, (byte) 10);
	}

	@OriginalMember(owner = "client!ajy", name = "g", descriptor = "(Lclient!dh;)V", line = 141)
	@Override
	public void method13424(@OriginalArg(0) Class104 arg0) {
		this.aClass558_4.method31097(arg0, (byte) 70);
	}
}
