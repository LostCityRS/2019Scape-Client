package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ajs")
public class Class132_Sub1_Sub4_Sub1 extends Class132_Sub1_Sub4 implements Interface61 {

	@OriginalMember(owner = "client!ajs", name = "v", descriptor = "Lclient!uq;")
	Class600 aClass600_5;

	@OriginalMember(owner = "client!ajs", name = "o", descriptor = "Z")
	boolean aBoolean307 = true;

	@OriginalMember(owner = "client!ajs", name = "c", descriptor = "Lclient!sp;")
	public Class558 aClass558_3;

	@OriginalMember(owner = "client!ajs", name = "r", descriptor = "Z")
	boolean aBoolean306;

	@OriginalMember(owner = "client!ajs", name = "<init>", descriptor = "(Lclient!tx;Lclient!dh;Lclient!aop;Lclient!vd;IIIIIZIIILclient!oe;)V", line = 28)
	public Class132_Sub1_Sub4_Sub1(@OriginalArg(0) Class585 arg0, @OriginalArg(1) Class104 arg1, @OriginalArg(2) Class32_Sub14 arg2, @OriginalArg(3) Class610 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) Class458 arg13) {
		super(arg0, arg6, arg7, arg8, arg4, arg5, arg3.anInt5585 * -2089585703, arg13);
		this.aClass558_3 = new Class558(arg1, arg2, arg3, Class615.aClass615_24.anInt5628 * 948246811, arg10, arg5, this, arg9, arg11, arg12);
		this.aBoolean306 = arg3.anInt5592 * 1067969079 != 0 && !arg9;
		this.method24274(1, 2131488537);
	}

	@OriginalMember(owner = "client!ajs", name = "co", descriptor = "()Z", line = 35)
	@Override
	boolean method24296() {
		return false;
	}

	@OriginalMember(owner = "client!ajs", name = "cf", descriptor = "()Z", line = 35)
	@Override
	boolean method24312() {
		return false;
	}

	@OriginalMember(owner = "client!ajs", name = "bu", descriptor = "(B)Z", line = 35)
	@Override
	boolean method24285(@OriginalArg(0) byte arg0) {
		return false;
	}

	@OriginalMember(owner = "client!ajs", name = "bw", descriptor = "(S)Z", line = 39)
	@Override
	boolean method24286(@OriginalArg(0) short arg0) {
		return this.aBoolean307;
	}

	@OriginalMember(owner = "client!ajs", name = "cm", descriptor = "()Z", line = 39)
	@Override
	boolean method24298() {
		return this.aBoolean307;
	}

	@OriginalMember(owner = "client!ajs", name = "cr", descriptor = "()Z", line = 39)
	@Override
	boolean method24297() {
		return this.aBoolean307;
	}

	@OriginalMember(owner = "client!ajs", name = "cq", descriptor = "()Z", line = 39)
	@Override
	boolean method24299() {
		return this.aBoolean307;
	}

	@OriginalMember(owner = "client!ajs", name = "fv", descriptor = "(Lclient!dh;B)Lclient!uq;", line = 43)
	@Override
	public Class600 method24311(@OriginalArg(0) Class104 arg0, @OriginalArg(1) byte arg1) {
		return this.aClass600_5;
	}

	@OriginalMember(owner = "client!ajs", name = "fl", descriptor = "(Lclient!dh;)Lclient!uq;", line = 43)
	@Override
	public Class600 method24301(@OriginalArg(0) Class104 arg0) {
		return this.aClass600_5;
	}

	@OriginalMember(owner = "client!ajs", name = "fb", descriptor = "(Lclient!dh;)Lclient!uq;", line = 43)
	@Override
	public Class600 method24302(@OriginalArg(0) Class104 arg0) {
		return this.aClass600_5;
	}

	@OriginalMember(owner = "client!ajs", name = "ch", descriptor = "()I", line = 47)
	@Override
	public int method24300() {
		return this.aClass558_3.method31070(1349082800);
	}

	@OriginalMember(owner = "client!ajs", name = "by", descriptor = "(B)I", line = 47)
	@Override
	public int method24303(@OriginalArg(0) byte arg0) {
		return this.aClass558_3.method31070(1982749337);
	}

	@OriginalMember(owner = "client!ajs", name = "cs", descriptor = "()I", line = 51)
	@Override
	public int method24272() {
		return this.aClass558_3.method31078(1113745150);
	}

	@OriginalMember(owner = "client!ajs", name = "cy", descriptor = "()I", line = 51)
	@Override
	public int method24273() {
		return this.aClass558_3.method31078(2000584298);
	}

	@OriginalMember(owner = "client!ajs", name = "bo", descriptor = "(I)I", line = 51)
	@Override
	public int method24270(@OriginalArg(0) int arg0) {
		return this.aClass558_3.method31078(1168327071);
	}

	@OriginalMember(owner = "client!ajs", name = "cb", descriptor = "()I", line = 51)
	@Override
	public int method24271() {
		return this.aClass558_3.method31078(-306056706);
	}

	@OriginalMember(owner = "client!ajs", name = "fc", descriptor = "(Lclient!dh;I)Lclient!tl;", line = 55)
	@Override
	Class573 method24293(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class109 local8 = this.aClass558_3.method31081(arg0, 2048, false, true, -1951434659);
		if (local8 == null) {
			return null;
		}
		@Pc(15) Class470 local15 = this.method24227();
		@Pc(18) Class458 local18 = this.method24220();
		@Pc(23) Class573 local23 = Class125_Sub1.method9212(this.aBoolean306, 373147274);
		@Pc(30) int local30 = (int) local18.aClass472_61.aFloat317 >> 9;
		@Pc(37) int local37 = (int) local18.aClass472_61.aFloat319 >> 9;
		this.aClass558_3.method31085(arg0, local8, local15, local30, local30, local37, local37, true, (byte) 66);
		@Pc(54) Class610 local54 = this.aClass558_3.method31079((short) 91);
		if (local54.aClass463_2 == null) {
			local8.method6976(local15, this.aClass241Array21[0], 0);
		} else {
			local8.method6976(local15, null, 0);
			arg0.method20583(local15, this.aClass241Array21[0], local54.aClass463_2);
		}
		if (this.aClass558_3.aClass674_7 != null) {
			@Pc(89) Class229 local89 = this.aClass558_3.aClass674_7.method33132();
			arg0.method20588(local89);
		}
		this.aBoolean307 = local8.method6903() || this.aClass558_3.aClass674_7 != null;
		if (this.aClass600_5 == null) {
			this.aClass600_5 = Class62.method1143((int) local18.aClass472_61.aFloat317, (int) local18.aClass472_61.aFloat318, (int) local18.aClass472_61.aFloat319, local8, 2131966572);
		} else {
			Class554.method31050(this.aClass600_5, (int) local18.aClass472_61.aFloat317, (int) local18.aClass472_61.aFloat318, (int) local18.aClass472_61.aFloat319, local8, -1347102482);
		}
		return local23;
	}

	@OriginalMember(owner = "client!ajs", name = "fo", descriptor = "(Lclient!dh;)Lclient!tl;", line = 55)
	@Override
	Class573 method24289(@OriginalArg(0) Class104 arg0) {
		@Pc(8) Class109 local8 = this.aClass558_3.method31081(arg0, 2048, false, true, -1543190719);
		if (local8 == null) {
			return null;
		}
		@Pc(15) Class470 local15 = this.method24227();
		@Pc(18) Class458 local18 = this.method24220();
		@Pc(23) Class573 local23 = Class125_Sub1.method9212(this.aBoolean306, 373147274);
		@Pc(30) int local30 = (int) local18.aClass472_61.aFloat317 >> 9;
		@Pc(37) int local37 = (int) local18.aClass472_61.aFloat319 >> 9;
		this.aClass558_3.method31085(arg0, local8, local15, local30, local30, local37, local37, true, (byte) 116);
		@Pc(54) Class610 local54 = this.aClass558_3.method31079((short) 12320);
		if (local54.aClass463_2 == null) {
			local8.method6976(local15, this.aClass241Array21[0], 0);
		} else {
			local8.method6976(local15, null, 0);
			arg0.method20583(local15, this.aClass241Array21[0], local54.aClass463_2);
		}
		if (this.aClass558_3.aClass674_7 != null) {
			@Pc(89) Class229 local89 = this.aClass558_3.aClass674_7.method33132();
			arg0.method20588(local89);
		}
		this.aBoolean307 = local8.method6903() || this.aClass558_3.aClass674_7 != null;
		if (this.aClass600_5 == null) {
			this.aClass600_5 = Class62.method1143((int) local18.aClass472_61.aFloat317, (int) local18.aClass472_61.aFloat318, (int) local18.aClass472_61.aFloat319, local8, 1754284810);
		} else {
			Class554.method31050(this.aClass600_5, (int) local18.aClass472_61.aFloat317, (int) local18.aClass472_61.aFloat318, (int) local18.aClass472_61.aFloat319, local8, -1127619480);
		}
		return local23;
	}

	@OriginalMember(owner = "client!ajs", name = "fe", descriptor = "(Lclient!dh;)V", line = 80)
	@Override
	void method24314(@OriginalArg(0) Class104 arg0) {
		@Pc(8) Class109 local8 = this.aClass558_3.method31081(arg0, 262144, true, true, -2001466560);
		if (local8 != null) {
			@Pc(14) Class472 local14 = this.method24220().aClass472_61;
			@Pc(20) int local20 = (int) local14.aFloat317 >> 9;
			@Pc(26) int local26 = (int) local14.aFloat319 >> 9;
			this.aClass558_3.method31085(arg0, local8, this.method24227(), local20, local20, local26, local26, false, (byte) 85);
		}
	}

	@OriginalMember(owner = "client!ajs", name = "fy", descriptor = "(Lclient!dh;)V", line = 80)
	@Override
	void method24307(@OriginalArg(0) Class104 arg0) {
		@Pc(8) Class109 local8 = this.aClass558_3.method31081(arg0, 262144, true, true, -1444145702);
		if (local8 != null) {
			@Pc(14) Class472 local14 = this.method24220().aClass472_61;
			@Pc(20) int local20 = (int) local14.aFloat317 >> 9;
			@Pc(26) int local26 = (int) local14.aFloat319 >> 9;
			this.aClass558_3.method31085(arg0, local8, this.method24227(), local20, local20, local26, local26, false, (byte) 97);
		}
	}

	@OriginalMember(owner = "client!ajs", name = "fw", descriptor = "(Lclient!dh;I)V", line = 80)
	@Override
	void method24290(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class109 local8 = this.aClass558_3.method31081(arg0, 262144, true, true, -1104209393);
		if (local8 != null) {
			@Pc(14) Class472 local14 = this.method24220().aClass472_61;
			@Pc(20) int local20 = (int) local14.aFloat317 >> 9;
			@Pc(26) int local26 = (int) local14.aFloat319 >> 9;
			this.aClass558_3.method31085(arg0, local8, this.method24227(), local20, local20, local26, local26, false, (byte) 68);
		}
	}

	@OriginalMember(owner = "client!ajs", name = "fa", descriptor = "(Lclient!dh;IIB)Z", line = 90)
	@Override
	boolean method24283(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		@Pc(4) Class610 local4 = this.aClass558_3.method31079((short) -7598);
		if (local4.aClass463_2 == null) {
			@Pc(27) Class109 local27 = this.aClass558_3.method31081(arg0, 131072, false, false, -1306946242);
			return local27 == null ? false : local27.method6897(arg1, arg2, this.method24227(), false, 0);
		} else {
			return arg0.method20482(arg1, arg2, this.method24227(), local4.aClass463_2, -1196618528);
		}
	}

	@OriginalMember(owner = "client!ajs", name = "fk", descriptor = "(Lclient!dh;II)Z", line = 90)
	@Override
	boolean method24304(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class610 local4 = this.aClass558_3.method31079((short) 16678);
		if (local4.aClass463_2 == null) {
			@Pc(27) Class109 local27 = this.aClass558_3.method31081(arg0, 131072, false, false, 38817342);
			return local27 == null ? false : local27.method6897(arg1, arg2, this.method24227(), false, 0);
		} else {
			return arg0.method20482(arg1, arg2, this.method24227(), local4.aClass463_2, 2065111732);
		}
	}

	@OriginalMember(owner = "client!ajs", name = "fh", descriptor = "()Z", line = 98)
	@Override
	final boolean method24294() {
		return false;
	}

	@OriginalMember(owner = "client!ajs", name = "fp", descriptor = "(I)Z", line = 98)
	@Override
	final boolean method24284(@OriginalArg(0) int arg0) {
		return false;
	}

	@OriginalMember(owner = "client!ajs", name = "fr", descriptor = "()Z", line = 98)
	@Override
	final boolean method24305() {
		return false;
	}

	@OriginalMember(owner = "client!ajs", name = "fq", descriptor = "(Lclient!dh;Lclient!alh;IIIZB)V", line = 102)
	@Override
	final void method24291(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class132_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ajs", name = "gu", descriptor = "(Lclient!dh;Lclient!alh;IIIZ)V", line = 102)
	@Override
	final void method24306(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class132_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ajs", name = "gq", descriptor = "(Lclient!dh;Lclient!alh;IIIZ)V", line = 102)
	@Override
	final void method24309(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class132_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ajs", name = "gl", descriptor = "(Lclient!dh;Lclient!alh;IIIZ)V", line = 102)
	@Override
	final void method24308(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class132_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ajs", name = "ff", descriptor = "(B)V", line = 106)
	@Override
	final void method24288(@OriginalArg(0) byte arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ajs", name = "go", descriptor = "()V", line = 106)
	@Override
	final void method24281() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ajs", name = "gk", descriptor = "()V", line = 106)
	@Override
	final void method24310() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ajs", name = "e", descriptor = "(I)I", line = 110)
	@Override
	public int method13423(@OriginalArg(0) int arg0) {
		return this.aClass558_3.anInt5324 * 1228794785;
	}

	@OriginalMember(owner = "client!ajs", name = "z", descriptor = "()I", line = 110)
	@Override
	public int method13410() {
		return this.aClass558_3.anInt5324 * 1228794785;
	}

	@OriginalMember(owner = "client!ajs", name = "p", descriptor = "()I", line = 110)
	@Override
	public int method13411() {
		return this.aClass558_3.anInt5324 * 1228794785;
	}

	@OriginalMember(owner = "client!ajs", name = "n", descriptor = "(I)I", line = 114)
	@Override
	public int method13420(@OriginalArg(0) int arg0) {
		return this.aClass558_3.anInt5325 * -989891395;
	}

	@OriginalMember(owner = "client!ajs", name = "d", descriptor = "()I", line = 114)
	@Override
	public int method13403() {
		return this.aClass558_3.anInt5325 * -989891395;
	}

	@OriginalMember(owner = "client!ajs", name = "r", descriptor = "()I", line = 118)
	@Override
	public int method13416() {
		return this.aClass558_3.anInt5326 * -922764575;
	}

	@OriginalMember(owner = "client!ajs", name = "m", descriptor = "(I)I", line = 118)
	@Override
	public int method13404(@OriginalArg(0) int arg0) {
		return this.aClass558_3.anInt5326 * -922764575;
	}

	@OriginalMember(owner = "client!ajs", name = "c", descriptor = "()I", line = 118)
	@Override
	public int method13413() {
		return this.aClass558_3.anInt5326 * -922764575;
	}

	@OriginalMember(owner = "client!ajs", name = "v", descriptor = "()I", line = 118)
	@Override
	public int method13412() {
		return this.aClass558_3.anInt5326 * -922764575;
	}

	@OriginalMember(owner = "client!ajs", name = "o", descriptor = "()I", line = 118)
	@Override
	public int method13414() {
		return this.aClass558_3.anInt5326 * -922764575;
	}

	@OriginalMember(owner = "client!ajs", name = "bz", descriptor = "(Lclient!vp;I)V", line = 122)
	public void method12961(@OriginalArg(0) Class620 arg0, @OriginalArg(1) int arg1) {
		this.aClass558_3.method31075(arg0, 1741540188);
	}

	@OriginalMember(owner = "client!ajs", name = "bv", descriptor = "(Lclient!vp;)V", line = 122)
	public void method12962(@OriginalArg(0) Class620 arg0) {
		this.aClass558_3.method31075(arg0, -1946385325);
	}

	@OriginalMember(owner = "client!ajs", name = "k", descriptor = "(I)V", line = 125)
	@Override
	public void method13405(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ajs", name = "i", descriptor = "()V", line = 125)
	@Override
	public void method13425() {
	}

	@OriginalMember(owner = "client!ajs", name = "j", descriptor = "()V", line = 125)
	@Override
	public void method13426() {
	}

	@OriginalMember(owner = "client!ajs", name = "w", descriptor = "(B)Z", line = 128)
	@Override
	public boolean method13407(@OriginalArg(0) byte arg0) {
		return true;
	}

	@OriginalMember(owner = "client!ajs", name = "t", descriptor = "()Z", line = 128)
	@Override
	public boolean method13427() {
		return true;
	}

	@OriginalMember(owner = "client!ajs", name = "f", descriptor = "(I)Z", line = 132)
	@Override
	public boolean method13406(@OriginalArg(0) int arg0) {
		return this.aClass558_3.method31088((byte) 18);
	}

	@OriginalMember(owner = "client!ajs", name = "s", descriptor = "()Z", line = 132)
	@Override
	public boolean method13415() {
		return this.aClass558_3.method31088((byte) -77);
	}

	@OriginalMember(owner = "client!ajs", name = "y", descriptor = "(Lclient!dh;)V", line = 136)
	@Override
	public void method13418(@OriginalArg(0) Class104 arg0) {
		this.aClass558_3.method31093(arg0, -1497248091);
	}

	@OriginalMember(owner = "client!ajs", name = "l", descriptor = "(Lclient!dh;B)V", line = 136)
	@Override
	public void method13417(@OriginalArg(0) Class104 arg0, @OriginalArg(1) byte arg1) {
		this.aClass558_3.method31093(arg0, -1497248091);
	}

	@OriginalMember(owner = "client!ajs", name = "x", descriptor = "(Lclient!dh;)V", line = 136)
	@Override
	public void method13408(@OriginalArg(0) Class104 arg0) {
		this.aClass558_3.method31093(arg0, -1497248091);
	}

	@OriginalMember(owner = "client!ajs", name = "q", descriptor = "(Lclient!dh;)V", line = 136)
	@Override
	public void method13419(@OriginalArg(0) Class104 arg0) {
		this.aClass558_3.method31093(arg0, -1497248091);
	}

	@OriginalMember(owner = "client!ajs", name = "b", descriptor = "(Lclient!dh;)V", line = 136)
	@Override
	public void method13421(@OriginalArg(0) Class104 arg0) {
		this.aClass558_3.method31093(arg0, -1497248091);
	}

	@OriginalMember(owner = "client!ajs", name = "u", descriptor = "(Lclient!dh;B)V", line = 140)
	@Override
	public void method13409(@OriginalArg(0) Class104 arg0, @OriginalArg(1) byte arg1) {
		this.aClass558_3.method31097(arg0, (byte) 100);
	}

	@OriginalMember(owner = "client!ajs", name = "h", descriptor = "(Lclient!dh;)V", line = 140)
	@Override
	public void method13402(@OriginalArg(0) Class104 arg0) {
		this.aClass558_3.method31097(arg0, (byte) 12);
	}

	@OriginalMember(owner = "client!ajs", name = "a", descriptor = "(Lclient!dh;)V", line = 140)
	@Override
	public void method13422(@OriginalArg(0) Class104 arg0) {
		this.aClass558_3.method31097(arg0, (byte) 31);
	}

	@OriginalMember(owner = "client!ajs", name = "g", descriptor = "(Lclient!dh;)V", line = 140)
	@Override
	public void method13424(@OriginalArg(0) Class104 arg0) {
		this.aClass558_3.method31097(arg0, (byte) -36);
	}

	@OriginalMember(owner = "client!ajs", name = "aju", descriptor = "(Lclient!yf;I)V", line = 11446)
	static final void method12963(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
	}
}
