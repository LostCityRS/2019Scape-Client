package com.jagex;

import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!je")
public abstract class Class123 {

	@OriginalMember(owner = "client!je", name = "v", descriptor = "F")
	public static final float aFloat100 = Float.POSITIVE_INFINITY;

	@OriginalMember(owner = "client!je", name = "ah", descriptor = "I")
	static final int anInt1012 = 50;

	@OriginalMember(owner = "client!je", name = "al", descriptor = "I")
	static final int anInt1013 = 10000;

	@OriginalMember(owner = "client!je", name = "ht", descriptor = "Lclient!aom;")
	public static Class32_Sub11 aClass32_Sub11_2;

	@OriginalMember(owner = "client!je", name = "z", descriptor = "Lclient!ic;")
	Class333 aClass333_2;

	@OriginalMember(owner = "client!je", name = "t", descriptor = "F")
	float aFloat98;

	@OriginalMember(owner = "client!je", name = "m", descriptor = "Lclient!jf;")
	Class359 aClass359_2;

	@OriginalMember(owner = "client!je", name = "k", descriptor = "Lclient!ii;")
	Class338 aClass338_2;

	@OriginalMember(owner = "client!je", name = "f", descriptor = "Lclient!aax;")
	Class25 aClass25_2;

	@OriginalMember(owner = "client!je", name = "w", descriptor = "Lclient!im;")
	Class342 aClass342_2;

	@OriginalMember(owner = "client!je", name = "p", descriptor = "I")
	int anInt1011;

	@OriginalMember(owner = "client!je", name = "d", descriptor = "F")
	float aFloat101;

	@OriginalMember(owner = "client!je", name = "ae", descriptor = "F")
	float aFloat102;

	@OriginalMember(owner = "client!je", name = "n", descriptor = "Lclient!jd;")
	Class358 aClass358_2;

	@OriginalMember(owner = "client!je", name = "ag", descriptor = "F")
	float aFloat104;

	@OriginalMember(owner = "client!je", name = "aw", descriptor = "Z")
	boolean aBoolean181;

	@OriginalMember(owner = "client!je", name = "l", descriptor = "Lclient!kl;")
	Class124 aClass124_2;

	@OriginalMember(owner = "client!je", name = "j", descriptor = "F")
	float aFloat107;

	@OriginalMember(owner = "client!je", name = "ai", descriptor = "F")
	float aFloat108;

	@OriginalMember(owner = "client!je", name = "ac", descriptor = "F")
	float aFloat110;

	@OriginalMember(owner = "client!je", name = "as", descriptor = "Z")
	boolean aBoolean182;

	@OriginalMember(owner = "client!je", name = "c", descriptor = "Lclient!ox;")
	final Class472 aClass472_8 = new Class472();

	@OriginalMember(owner = "client!je", name = "r", descriptor = "Lclient!ox;")
	final Class472 aClass472_9 = new Class472();

	@OriginalMember(owner = "client!je", name = "o", descriptor = "Lclient!ox;")
	final Class472 aClass472_10 = new Class472();

	@OriginalMember(owner = "client!je", name = "s", descriptor = "Lclient!ox;")
	final Class472 aClass472_13 = new Class472();

	@OriginalMember(owner = "client!je", name = "y", descriptor = "F")
	final float aFloat103 = 5120.0F;

	@OriginalMember(owner = "client!je", name = "q", descriptor = "F")
	final float aFloat111 = 10.0F;

	@OriginalMember(owner = "client!je", name = "x", descriptor = "F")
	final float aFloat105 = 1.0F;

	@OriginalMember(owner = "client!je", name = "b", descriptor = "F")
	float aFloat106 = 5120.0F;

	@OriginalMember(owner = "client!je", name = "h", descriptor = "F")
	float aFloat109 = 10.0F;

	@OriginalMember(owner = "client!je", name = "a", descriptor = "F")
	float aFloat99 = 1.0F;

	@OriginalMember(owner = "client!je", name = "g", descriptor = "Lclient!ox;")
	final Class472 aClass472_11 = new Class472();

	@OriginalMember(owner = "client!je", name = "i", descriptor = "Lclient!ox;")
	final Class472 aClass472_12 = new Class472();

	@OriginalMember(owner = "client!je", name = "at", descriptor = "I")
	int anInt1014 = 0;

	@OriginalMember(owner = "client!je", name = "ad", descriptor = "F")
	float aFloat112 = 1.0F;

	@OriginalMember(owner = "client!je", name = "am", descriptor = "Lclient!aan;")
	Class16 aClass16_7 = new Class16(8);

	@OriginalMember(owner = "client!je", name = "e", descriptor = "Lclient!ik;")
	final Class340 aClass340_2;

	@OriginalMember(owner = "client!je", name = "u", descriptor = "Lclient!jy;")
	final Interface31 anInterface31_2;

	@OriginalMember(owner = "client!je", name = "<init>", descriptor = "(Lclient!ik;Lclient!jy;)V", line = 68)
	Class123(@OriginalArg(0) Class340 arg0, @OriginalArg(1) Interface31 arg1) {
		this.aClass340_2 = arg0;
		this.anInterface31_2 = arg1;
		this.method8922(true, (byte) 50);
	}

	@OriginalMember(owner = "client!je", name = "e", descriptor = "(ZB)V", line = 75)
	public void method8922(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte arg1) {
		this.aClass359_2 = Class359.aClass359_3;
		this.aClass338_2 = null;
		this.aClass25_2 = null;
		this.aClass342_2 = null;
		this.aClass124_2 = null;
		if (Class340.aClass340_3 != this.aClass340_2 && arg0) {
			this.aClass358_2 = Class358.aClass358_3;
		} else {
			this.aClass358_2 = Class358.aClass358_4;
		}
		this.aClass333_2 = Class333.aClass333_5;
		this.aClass472_8.method29549(100.0F, 100.0F, 100.0F);
		this.aClass472_9.method29549(100.0F, 100.0F, 100.0F);
		this.aFloat101 = 0.05F;
		this.aClass472_10.method29549(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
		this.aClass472_13.method29549(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
		this.aClass472_11.method29549(1.0F, 1.0F, 1.0F);
		this.aClass472_12.method29549(1.0F, 1.0F, 1.0F);
		this.aFloat107 = 1.1F;
		this.aFloat98 = 1.1F;
		this.aFloat102 = 50.0F;
		this.aFloat104 = 10000.0F;
		this.aFloat108 = 1.5707964F;
		this.aFloat110 = 1.5707964F;
		this.anInt1011 = 262458347;
		this.aBoolean181 = true;
		this.aBoolean182 = true;
		this.anInt1014 = 0;
		this.aFloat112 = 1.0F;
		this.aClass16_7.method225((byte) 118);
	}

	@OriginalMember(owner = "client!je", name = "bl", descriptor = "(Z)V", line = 75)
	public void method8923(@OriginalArg(0) boolean arg0) {
		this.aClass359_2 = Class359.aClass359_3;
		this.aClass338_2 = null;
		this.aClass25_2 = null;
		this.aClass342_2 = null;
		this.aClass124_2 = null;
		if (Class340.aClass340_3 != this.aClass340_2 && arg0) {
			this.aClass358_2 = Class358.aClass358_3;
		} else {
			this.aClass358_2 = Class358.aClass358_4;
		}
		this.aClass333_2 = Class333.aClass333_5;
		this.aClass472_8.method29549(100.0F, 100.0F, 100.0F);
		this.aClass472_9.method29549(100.0F, 100.0F, 100.0F);
		this.aFloat101 = 0.05F;
		this.aClass472_10.method29549(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
		this.aClass472_13.method29549(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
		this.aClass472_11.method29549(1.0F, 1.0F, 1.0F);
		this.aClass472_12.method29549(1.0F, 1.0F, 1.0F);
		this.aFloat107 = 1.1F;
		this.aFloat98 = 1.1F;
		this.aFloat102 = 50.0F;
		this.aFloat104 = 10000.0F;
		this.aFloat108 = 1.5707964F;
		this.aFloat110 = 1.5707964F;
		this.anInt1011 = 262458347;
		this.aBoolean181 = true;
		this.aBoolean182 = true;
		this.anInt1014 = 0;
		this.aFloat112 = 1.0F;
		this.aClass16_7.method225((byte) 79);
	}

	@OriginalMember(owner = "client!je", name = "bk", descriptor = "(Z)V", line = 75)
	public void method8924(@OriginalArg(0) boolean arg0) {
		this.aClass359_2 = Class359.aClass359_3;
		this.aClass338_2 = null;
		this.aClass25_2 = null;
		this.aClass342_2 = null;
		this.aClass124_2 = null;
		if (Class340.aClass340_3 != this.aClass340_2 && arg0) {
			this.aClass358_2 = Class358.aClass358_3;
		} else {
			this.aClass358_2 = Class358.aClass358_4;
		}
		this.aClass333_2 = Class333.aClass333_5;
		this.aClass472_8.method29549(100.0F, 100.0F, 100.0F);
		this.aClass472_9.method29549(100.0F, 100.0F, 100.0F);
		this.aFloat101 = 0.05F;
		this.aClass472_10.method29549(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
		this.aClass472_13.method29549(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
		this.aClass472_11.method29549(1.0F, 1.0F, 1.0F);
		this.aClass472_12.method29549(1.0F, 1.0F, 1.0F);
		this.aFloat107 = 1.1F;
		this.aFloat98 = 1.1F;
		this.aFloat102 = 50.0F;
		this.aFloat104 = 10000.0F;
		this.aFloat108 = 1.5707964F;
		this.aFloat110 = 1.5707964F;
		this.anInt1011 = 262458347;
		this.aBoolean181 = true;
		this.aBoolean182 = true;
		this.anInt1014 = 0;
		this.aFloat112 = 1.0F;
		this.aClass16_7.method225((byte) 125);
	}

	@OriginalMember(owner = "client!je", name = "n", descriptor = "(F[[[ILclient!qx;III)V", line = 105)
	public void method8925(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class520 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (this.aClass25_2 != null) {
			this.aClass25_2.method23122(arg0, (byte) -50);
		}
		if (this.aClass124_2 != null) {
			this.aClass124_2.method21427(arg0, arg1, arg2, arg3, arg4, (byte) -76);
		}
		@Pc(25) Iterator local25 = this.aClass16_7.iterator();
		while (local25.hasNext()) {
			@Pc(32) Class93_Sub1_Sub17 local32 = (Class93_Sub1_Sub17) local25.next();
			local32.method23493(arg0, 78796785);
		}
	}

	@OriginalMember(owner = "client!je", name = "bh", descriptor = "(F[[[ILclient!qx;II)V", line = 105)
	public void method8926(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class520 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.aClass25_2 != null) {
			this.aClass25_2.method23122(arg0, (byte) -41);
		}
		if (this.aClass124_2 != null) {
			this.aClass124_2.method21427(arg0, arg1, arg2, arg3, arg4, (byte) 20);
		}
		@Pc(25) Iterator local25 = this.aClass16_7.iterator();
		while (local25.hasNext()) {
			@Pc(32) Class93_Sub1_Sub17 local32 = (Class93_Sub1_Sub17) local25.next();
			local32.method23493(arg0, -857297418);
		}
	}

	@OriginalMember(owner = "client!je", name = "bx", descriptor = "(F[[[ILclient!qx;II)V", line = 105)
	public void method8927(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class520 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.aClass25_2 != null) {
			this.aClass25_2.method23122(arg0, (byte) 65);
		}
		if (this.aClass124_2 != null) {
			this.aClass124_2.method21427(arg0, arg1, arg2, arg3, arg4, (byte) 20);
		}
		@Pc(25) Iterator local25 = this.aClass16_7.iterator();
		while (local25.hasNext()) {
			@Pc(32) Class93_Sub1_Sub17 local32 = (Class93_Sub1_Sub17) local25.next();
			local32.method23493(arg0, 244085384);
		}
	}

	@OriginalMember(owner = "client!je", name = "bd", descriptor = "(F[[[ILclient!qx;II)V", line = 105)
	public void method8928(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class520 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.aClass25_2 != null) {
			this.aClass25_2.method23122(arg0, (byte) -70);
		}
		if (this.aClass124_2 != null) {
			this.aClass124_2.method21427(arg0, arg1, arg2, arg3, arg4, (byte) -18);
		}
		@Pc(25) Iterator local25 = this.aClass16_7.iterator();
		while (local25.hasNext()) {
			@Pc(32) Class93_Sub1_Sub17 local32 = (Class93_Sub1_Sub17) local25.next();
			local32.method23493(arg0, -927980460);
		}
	}

	@OriginalMember(owner = "client!je", name = "bc", descriptor = "(ZFLclient!ox;Lclient!ov;Lclient!ox;Lclient!ox;)V", line = 114)
	public void method8929(@OriginalArg(0) boolean arg0, @OriginalArg(1) float arg1, @OriginalArg(2) Class472 arg2, @OriginalArg(3) Class471 arg3, @OriginalArg(4) Class472 arg4, @OriginalArg(5) Class472 arg5) {
		if (this.aClass333_2 == Class333.aClass333_4) {
			Class379.method28080(arg1, arg2, arg4, arg5, arg0 ? this.aClass472_13 : this.aClass472_10, arg0 ? this.aClass472_9 : this.aClass472_8, (float) (this.anInt1014 * 1217154761), this.aFloat112, this.aFloat106, this.aFloat109, -1266364073);
		} else if (this.aClass333_2 == Class333.aClass333_5) {
			Class553.method24841(arg1, arg2, arg3, arg4, arg5, arg0 ? this.aClass472_13 : this.aClass472_10, arg0 ? this.aClass472_9 : this.aClass472_8, (float) (this.anInt1014 * 1217154761), this.aFloat112, this.aFloat106, this.aFloat109, (byte) 19);
		} else if (this.aClass333_2 == Class333.aClass333_3) {
			Class52.method1018(arg1, arg2, arg3, arg4, arg5, arg0 ? this.aClass472_12 : this.aClass472_11, arg0 ? this.aFloat98 : this.aFloat107, this.aFloat106, this.aFloat99, -489027290);
		}
	}

	@OriginalMember(owner = "client!je", name = "bi", descriptor = "(ZFLclient!ox;Lclient!ov;Lclient!ox;Lclient!ox;)V", line = 114)
	public void method8930(@OriginalArg(0) boolean arg0, @OriginalArg(1) float arg1, @OriginalArg(2) Class472 arg2, @OriginalArg(3) Class471 arg3, @OriginalArg(4) Class472 arg4, @OriginalArg(5) Class472 arg5) {
		if (this.aClass333_2 == Class333.aClass333_4) {
			Class379.method28080(arg1, arg2, arg4, arg5, arg0 ? this.aClass472_13 : this.aClass472_10, arg0 ? this.aClass472_9 : this.aClass472_8, (float) (this.anInt1014 * 1217154761), this.aFloat112, this.aFloat106, this.aFloat109, -1266364073);
		} else if (this.aClass333_2 == Class333.aClass333_5) {
			Class553.method24841(arg1, arg2, arg3, arg4, arg5, arg0 ? this.aClass472_13 : this.aClass472_10, arg0 ? this.aClass472_9 : this.aClass472_8, (float) (this.anInt1014 * 1217154761), this.aFloat112, this.aFloat106, this.aFloat109, (byte) 37);
		} else if (this.aClass333_2 == Class333.aClass333_3) {
			Class52.method1018(arg1, arg2, arg3, arg4, arg5, arg0 ? this.aClass472_12 : this.aClass472_11, arg0 ? this.aFloat98 : this.aFloat107, this.aFloat106, this.aFloat99, -489027290);
		}
	}

	@OriginalMember(owner = "client!je", name = "m", descriptor = "(ZFLclient!ox;Lclient!ov;Lclient!ox;Lclient!ox;B)V", line = 114)
	public void method8931(@OriginalArg(0) boolean arg0, @OriginalArg(1) float arg1, @OriginalArg(2) Class472 arg2, @OriginalArg(3) Class471 arg3, @OriginalArg(4) Class472 arg4, @OriginalArg(5) Class472 arg5, @OriginalArg(6) byte arg6) {
		if (this.aClass333_2 == Class333.aClass333_4) {
			Class379.method28080(arg1, arg2, arg4, arg5, arg0 ? this.aClass472_13 : this.aClass472_10, arg0 ? this.aClass472_9 : this.aClass472_8, (float) (this.anInt1014 * 1217154761), this.aFloat112, this.aFloat106, this.aFloat109, -1266364073);
		} else if (this.aClass333_2 == Class333.aClass333_5) {
			Class553.method24841(arg1, arg2, arg3, arg4, arg5, arg0 ? this.aClass472_13 : this.aClass472_10, arg0 ? this.aClass472_9 : this.aClass472_8, (float) (this.anInt1014 * 1217154761), this.aFloat112, this.aFloat106, this.aFloat109, (byte) 0);
		} else if (this.aClass333_2 == Class333.aClass333_3) {
			Class52.method1018(arg1, arg2, arg3, arg4, arg5, arg0 ? this.aClass472_12 : this.aClass472_11, arg0 ? this.aFloat98 : this.aFloat107, this.aFloat106, this.aFloat99, -489027290);
		}
	}

	@OriginalMember(owner = "client!je", name = "k", descriptor = "(Lclient!jd;B)V", line = 126)
	public void method8932(@OriginalArg(0) Class358 arg0, @OriginalArg(1) byte arg1) {
		this.aClass358_2 = arg0;
	}

	@OriginalMember(owner = "client!je", name = "bn", descriptor = "(Lclient!jd;)V", line = 126)
	public void method8933(@OriginalArg(0) Class358 arg0) {
		this.aClass358_2 = arg0;
	}

	@OriginalMember(owner = "client!je", name = "bt", descriptor = "(Lclient!jd;)V", line = 126)
	public void method8934(@OriginalArg(0) Class358 arg0) {
		this.aClass358_2 = arg0;
	}

	@OriginalMember(owner = "client!je", name = "f", descriptor = "(Lclient!ii;ZI)Lclient!aax;", line = 130)
	public Class25 method8935(@OriginalArg(0) Class338 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) throws Exception_Sub3 {
		if (this.aClass358_2 == Class358.aClass358_4 && !arg1) {
			throw new Exception_Sub3();
		}
		this.aClass338_2 = arg0;
		if (arg0 == Class338.aClass338_4) {
			this.aClass25_2 = new Class25_Sub5(this);
		} else if (arg0 == Class338.aClass338_7) {
			this.aClass25_2 = new Class25_Sub1(this);
		} else if (arg0 == Class338.aClass338_6) {
			this.aClass25_2 = new Class25_Sub2(this);
		} else if (arg0 == Class338.aClass338_5) {
			this.aClass25_2 = new Class25_Sub4_Sub1(this);
		} else if (Class338.aClass338_9 == arg0) {
			this.aClass25_2 = new Class25_Sub4_Sub3(this);
		} else if (Class338.aClass338_8 == arg0) {
			this.aClass25_2 = new Class25_Sub3(this);
		} else if (arg0 == Class338.aClass338_3) {
			this.aClass25_2 = new Class25_Sub4_Sub2(this);
		}
		return this.aClass25_2;
	}

	@OriginalMember(owner = "client!je", name = "bq", descriptor = "(Lclient!ii;Z)Lclient!aax;", line = 130)
	public Class25 method8936(@OriginalArg(0) Class338 arg0, @OriginalArg(1) boolean arg1) throws Exception_Sub3 {
		if (this.aClass358_2 == Class358.aClass358_4 && !arg1) {
			throw new Exception_Sub3();
		}
		this.aClass338_2 = arg0;
		if (arg0 == Class338.aClass338_4) {
			this.aClass25_2 = new Class25_Sub5(this);
		} else if (arg0 == Class338.aClass338_7) {
			this.aClass25_2 = new Class25_Sub1(this);
		} else if (arg0 == Class338.aClass338_6) {
			this.aClass25_2 = new Class25_Sub2(this);
		} else if (arg0 == Class338.aClass338_5) {
			this.aClass25_2 = new Class25_Sub4_Sub1(this);
		} else if (Class338.aClass338_9 == arg0) {
			this.aClass25_2 = new Class25_Sub4_Sub3(this);
		} else if (Class338.aClass338_8 == arg0) {
			this.aClass25_2 = new Class25_Sub3(this);
		} else if (arg0 == Class338.aClass338_3) {
			this.aClass25_2 = new Class25_Sub4_Sub2(this);
		}
		return this.aClass25_2;
	}

	@OriginalMember(owner = "client!je", name = "w", descriptor = "(Lclient!im;ZI)Lclient!kl;", line = 143)
	public Class124 method8937(@OriginalArg(0) Class342 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) throws Exception_Sub3 {
		if (this.aClass358_2 == Class358.aClass358_4 && !arg1) {
			throw new Exception_Sub3();
		}
		this.aClass342_2 = arg0;
		if (Class342.aClass342_3 == arg0) {
			this.aClass124_2 = new Class124_Sub1(this);
		} else if (Class342.aClass342_4 == arg0) {
			this.aClass124_2 = new Class124_Sub2(this);
		} else if (arg0 == Class342.aClass342_7) {
			this.aClass124_2 = new Class124_Sub3_Sub3(this);
		} else if (Class342.aClass342_5 == arg0) {
			this.aClass124_2 = new Class124_Sub3_Sub1(this);
		} else if (arg0 == Class342.aClass342_6) {
			this.aClass124_2 = new Class124_Sub3_Sub2(this);
		}
		return this.aClass124_2;
	}

	@OriginalMember(owner = "client!je", name = "bm", descriptor = "(Lclient!im;Z)Lclient!kl;", line = 143)
	public Class124 method8938(@OriginalArg(0) Class342 arg0, @OriginalArg(1) boolean arg1) throws Exception_Sub3 {
		if (this.aClass358_2 == Class358.aClass358_4 && !arg1) {
			throw new Exception_Sub3();
		}
		this.aClass342_2 = arg0;
		if (Class342.aClass342_3 == arg0) {
			this.aClass124_2 = new Class124_Sub1(this);
		} else if (Class342.aClass342_4 == arg0) {
			this.aClass124_2 = new Class124_Sub2(this);
		} else if (arg0 == Class342.aClass342_7) {
			this.aClass124_2 = new Class124_Sub3_Sub3(this);
		} else if (Class342.aClass342_5 == arg0) {
			this.aClass124_2 = new Class124_Sub3_Sub1(this);
		} else if (arg0 == Class342.aClass342_6) {
			this.aClass124_2 = new Class124_Sub3_Sub2(this);
		}
		return this.aClass124_2;
	}

	@OriginalMember(owner = "client!je", name = "bb", descriptor = "(Lclient!im;Z)Lclient!kl;", line = 143)
	public Class124 method8939(@OriginalArg(0) Class342 arg0, @OriginalArg(1) boolean arg1) throws Exception_Sub3 {
		if (this.aClass358_2 == Class358.aClass358_4 && !arg1) {
			throw new Exception_Sub3();
		}
		this.aClass342_2 = arg0;
		if (Class342.aClass342_3 == arg0) {
			this.aClass124_2 = new Class124_Sub1(this);
		} else if (Class342.aClass342_4 == arg0) {
			this.aClass124_2 = new Class124_Sub2(this);
		} else if (arg0 == Class342.aClass342_7) {
			this.aClass124_2 = new Class124_Sub3_Sub3(this);
		} else if (Class342.aClass342_5 == arg0) {
			this.aClass124_2 = new Class124_Sub3_Sub1(this);
		} else if (arg0 == Class342.aClass342_6) {
			this.aClass124_2 = new Class124_Sub3_Sub2(this);
		}
		return this.aClass124_2;
	}

	@OriginalMember(owner = "client!je", name = "l", descriptor = "(I)Z", line = 154)
	boolean method8940(@OriginalArg(0) int arg0) {
		if (Class340.aClass340_3 == this.aClass340_2 && Class358.aClass358_4 == this.aClass358_2) {
			return true;
		} else {
			return this.aClass340_2 == Class340.aClass340_4 && this.aClass358_2 == Class358.aClass358_3;
		}
	}

	@OriginalMember(owner = "client!je", name = "bw", descriptor = "()Z", line = 154)
	boolean method8941() {
		if (Class340.aClass340_3 == this.aClass340_2 && Class358.aClass358_4 == this.aClass358_2) {
			return true;
		} else {
			return this.aClass340_2 == Class340.aClass340_4 && this.aClass358_2 == Class358.aClass358_3;
		}
	}

	@OriginalMember(owner = "client!je", name = "by", descriptor = "()Z", line = 154)
	boolean method8942() {
		if (Class340.aClass340_3 == this.aClass340_2 && Class358.aClass358_4 == this.aClass358_2) {
			return true;
		} else {
			return this.aClass340_2 == Class340.aClass340_4 && this.aClass358_2 == Class358.aClass358_3;
		}
	}

	@OriginalMember(owner = "client!je", name = "bu", descriptor = "()Z", line = 154)
	boolean method8943() {
		if (Class340.aClass340_3 == this.aClass340_2 && Class358.aClass358_4 == this.aClass358_2) {
			return true;
		} else {
			return this.aClass340_2 == Class340.aClass340_4 && this.aClass358_2 == Class358.aClass358_3;
		}
	}

	@OriginalMember(owner = "client!je", name = "be", descriptor = "()Z", line = 154)
	boolean method8944() {
		if (Class340.aClass340_3 == this.aClass340_2 && Class358.aClass358_4 == this.aClass358_2) {
			return true;
		} else {
			return this.aClass340_2 == Class340.aClass340_4 && this.aClass358_2 == Class358.aClass358_3;
		}
	}

	@OriginalMember(owner = "client!je", name = "u", descriptor = "(FB)V", line = 160)
	public void method8945(@OriginalArg(0) float arg0, @OriginalArg(1) byte arg1) throws Exception_Sub3 {
		if (!this.method8940(-837378739)) {
			throw new Exception_Sub3();
		}
	}

	@OriginalMember(owner = "client!je", name = "bo", descriptor = "(F)V", line = 160)
	public void method8946(@OriginalArg(0) float arg0) throws Exception_Sub3 {
		if (!this.method8940(-837378739)) {
			throw new Exception_Sub3();
		}
	}

	@OriginalMember(owner = "client!je", name = "bz", descriptor = "(F)V", line = 160)
	public void method8947(@OriginalArg(0) float arg0) throws Exception_Sub3 {
		if (!this.method8940(-837378739)) {
			throw new Exception_Sub3();
		}
	}

	@OriginalMember(owner = "client!je", name = "bv", descriptor = "(F)V", line = 164)
	public void method8948(@OriginalArg(0) float arg0) throws Exception_Sub3 {
		if (!this.method8940(-837378739)) {
			throw new Exception_Sub3();
		}
		this.aFloat101 = arg0;
	}

	@OriginalMember(owner = "client!je", name = "br", descriptor = "(F)V", line = 164)
	public void method8949(@OriginalArg(0) float arg0) throws Exception_Sub3 {
		if (!this.method8940(-837378739)) {
			throw new Exception_Sub3();
		}
		this.aFloat101 = arg0;
	}

	@OriginalMember(owner = "client!je", name = "bg", descriptor = "(F)V", line = 164)
	public void method8950(@OriginalArg(0) float arg0) throws Exception_Sub3 {
		if (!this.method8940(-837378739)) {
			throw new Exception_Sub3();
		}
		this.aFloat101 = arg0;
	}

	@OriginalMember(owner = "client!je", name = "z", descriptor = "(FI)V", line = 164)
	public void method8951(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1) throws Exception_Sub3 {
		if (!this.method8940(-837378739)) {
			throw new Exception_Sub3();
		}
		this.aFloat101 = arg0;
	}

	@OriginalMember(owner = "client!je", name = "p", descriptor = "(Lclient!ic;I)V", line = 169)
	public void method8952(@OriginalArg(0) Class333 arg0, @OriginalArg(1) int arg1) throws Exception_Sub3 {
		if (!this.method8940(-837378739)) {
			throw new Exception_Sub3();
		}
		this.aClass333_2 = arg0;
	}

	@OriginalMember(owner = "client!je", name = "d", descriptor = "(Lclient!ox;I)V", line = 174)
	public void method8953(@OriginalArg(0) Class472 arg0, @OriginalArg(1) int arg1) throws Exception_Sub3 {
		if (!this.method8940(-837378739) || !this.aClass333_2.aBoolean712) {
			throw new Exception_Sub3();
		}
		this.aClass472_10.method29550(arg0);
	}

	@OriginalMember(owner = "client!je", name = "ba", descriptor = "(Lclient!ox;)V", line = 174)
	public void method8954(@OriginalArg(0) Class472 arg0) throws Exception_Sub3 {
		if (!this.method8940(-837378739) || !this.aClass333_2.aBoolean712) {
			throw new Exception_Sub3();
		}
		this.aClass472_10.method29550(arg0);
	}

	@OriginalMember(owner = "client!je", name = "bp", descriptor = "(Lclient!ox;)V", line = 174)
	public void method8955(@OriginalArg(0) Class472 arg0) throws Exception_Sub3 {
		if (!this.method8940(-837378739) || !this.aClass333_2.aBoolean712) {
			throw new Exception_Sub3();
		}
		this.aClass472_10.method29550(arg0);
	}

	@OriginalMember(owner = "client!je", name = "bj", descriptor = "(Lclient!ox;)V", line = 174)
	public void method8956(@OriginalArg(0) Class472 arg0) throws Exception_Sub3 {
		if (!this.method8940(-837378739) || !this.aClass333_2.aBoolean712) {
			throw new Exception_Sub3();
		}
		this.aClass472_10.method29550(arg0);
	}

	@OriginalMember(owner = "client!je", name = "bs", descriptor = "(Lclient!ox;)V", line = 174)
	public void method8957(@OriginalArg(0) Class472 arg0) throws Exception_Sub3 {
		if (!this.method8940(-837378739) || !this.aClass333_2.aBoolean712) {
			throw new Exception_Sub3();
		}
		this.aClass472_10.method29550(arg0);
	}

	@OriginalMember(owner = "client!je", name = "cl", descriptor = "(Lclient!ox;)V", line = 179)
	public void method8958(@OriginalArg(0) Class472 arg0) throws Exception_Sub3 {
		if (!this.method8940(-837378739) || !this.aClass333_2.aBoolean712) {
			throw new Exception_Sub3();
		}
		this.aClass472_13.method29550(arg0);
	}

	@OriginalMember(owner = "client!je", name = "c", descriptor = "(Lclient!ox;I)V", line = 179)
	public void method8959(@OriginalArg(0) Class472 arg0, @OriginalArg(1) int arg1) throws Exception_Sub3 {
		if (!this.method8940(-837378739) || !this.aClass333_2.aBoolean712) {
			throw new Exception_Sub3();
		}
		this.aClass472_13.method29550(arg0);
	}

	@OriginalMember(owner = "client!je", name = "cg", descriptor = "(FFF)V", line = 184)
	public void method8960(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) throws Exception_Sub3 {
		if (!this.method8940(-837378739)) {
			throw new Exception_Sub3();
		}
		this.aFloat106 = arg0;
		this.aFloat109 = arg1;
		this.aFloat99 = arg2;
	}

	@OriginalMember(owner = "client!je", name = "ce", descriptor = "(FFF)V", line = 184)
	public void method8961(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) throws Exception_Sub3 {
		if (!this.method8940(-837378739)) {
			throw new Exception_Sub3();
		}
		this.aFloat106 = arg0;
		this.aFloat109 = arg1;
		this.aFloat99 = arg2;
	}

	@OriginalMember(owner = "client!je", name = "r", descriptor = "(FFFB)V", line = 184)
	public void method8962(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) byte arg3) throws Exception_Sub3 {
		if (!this.method8940(-837378739)) {
			throw new Exception_Sub3();
		}
		this.aFloat106 = arg0;
		this.aFloat109 = arg1;
		this.aFloat99 = arg2;
	}

	@OriginalMember(owner = "client!je", name = "v", descriptor = "(I)V", line = 191)
	public void method8963(@OriginalArg(0) int arg0) throws Exception_Sub3 {
		if (!this.method8940(-837378739)) {
			throw new Exception_Sub3();
		}
		this.aFloat106 = 5120.0F;
		this.aFloat109 = 10.0F;
		this.aFloat99 = 1.0F;
	}

	@OriginalMember(owner = "client!je", name = "ci", descriptor = "()V", line = 191)
	public void method8964() throws Exception_Sub3 {
		if (!this.method8940(-837378739)) {
			throw new Exception_Sub3();
		}
		this.aFloat106 = 5120.0F;
		this.aFloat109 = 10.0F;
		this.aFloat99 = 1.0F;
	}

	@OriginalMember(owner = "client!je", name = "cn", descriptor = "()V", line = 191)
	public void method8965() throws Exception_Sub3 {
		if (!this.method8940(-837378739)) {
			throw new Exception_Sub3();
		}
		this.aFloat106 = 5120.0F;
		this.aFloat109 = 10.0F;
		this.aFloat99 = 1.0F;
	}

	@OriginalMember(owner = "client!je", name = "cv", descriptor = "()V", line = 191)
	public void method8966() throws Exception_Sub3 {
		if (!this.method8940(-837378739)) {
			throw new Exception_Sub3();
		}
		this.aFloat106 = 5120.0F;
		this.aFloat109 = 10.0F;
		this.aFloat99 = 1.0F;
	}

	@OriginalMember(owner = "client!je", name = "cu", descriptor = "()V", line = 191)
	public void method8967() throws Exception_Sub3 {
		if (!this.method8940(-837378739)) {
			throw new Exception_Sub3();
		}
		this.aFloat106 = 5120.0F;
		this.aFloat109 = 10.0F;
		this.aFloat99 = 1.0F;
	}

	@OriginalMember(owner = "client!je", name = "cp", descriptor = "(Lclient!ox;)V", line = 198)
	public void method8968(@OriginalArg(0) Class472 arg0) throws Exception_Sub3 {
		if (!this.method8940(-837378739) || !this.aClass333_2.aBoolean712) {
			throw new Exception_Sub3();
		}
		this.aClass472_8.method29550(arg0);
	}

	@OriginalMember(owner = "client!je", name = "ca", descriptor = "(Lclient!ox;)V", line = 198)
	public void method8969(@OriginalArg(0) Class472 arg0) throws Exception_Sub3 {
		if (!this.method8940(-837378739) || !this.aClass333_2.aBoolean712) {
			throw new Exception_Sub3();
		}
		this.aClass472_8.method29550(arg0);
	}

	@OriginalMember(owner = "client!je", name = "o", descriptor = "(Lclient!ox;I)V", line = 198)
	public void method8970(@OriginalArg(0) Class472 arg0, @OriginalArg(1) int arg1) throws Exception_Sub3 {
		if (!this.method8940(-837378739) || !this.aClass333_2.aBoolean712) {
			throw new Exception_Sub3();
		}
		this.aClass472_8.method29550(arg0);
	}

	@OriginalMember(owner = "client!je", name = "s", descriptor = "(Lclient!ox;I)V", line = 203)
	public void method8971(@OriginalArg(0) Class472 arg0, @OriginalArg(1) int arg1) throws Exception_Sub3 {
		if (!this.method8940(-837378739) || !this.aClass333_2.aBoolean712) {
			throw new Exception_Sub3();
		}
		this.aClass472_9.method29550(arg0);
	}

	@OriginalMember(owner = "client!je", name = "cx", descriptor = "(Lclient!ox;)V", line = 203)
	public void method8972(@OriginalArg(0) Class472 arg0) throws Exception_Sub3 {
		if (!this.method8940(-837378739) || !this.aClass333_2.aBoolean712) {
			throw new Exception_Sub3();
		}
		this.aClass472_9.method29550(arg0);
	}

	@OriginalMember(owner = "client!je", name = "y", descriptor = "(Lclient!ox;FI)V", line = 208)
	public void method8973(@OriginalArg(0) Class472 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2) throws Exception_Sub3 {
		if (!this.method8940(-837378739) || this.aClass333_2.aBoolean712) {
			throw new Exception_Sub3();
		}
		this.aClass472_11.method29550(arg0);
		this.aClass472_12.method29550(arg0);
		this.aFloat107 = arg1;
		this.aFloat98 = arg1;
	}

	@OriginalMember(owner = "client!je", name = "ct", descriptor = "(Lclient!ox;F)V", line = 208)
	public void method8974(@OriginalArg(0) Class472 arg0, @OriginalArg(1) float arg1) throws Exception_Sub3 {
		if (!this.method8940(-837378739) || this.aClass333_2.aBoolean712) {
			throw new Exception_Sub3();
		}
		this.aClass472_11.method29550(arg0);
		this.aClass472_12.method29550(arg0);
		this.aFloat107 = arg1;
		this.aFloat98 = arg1;
	}

	@OriginalMember(owner = "client!je", name = "cw", descriptor = "(Lclient!ox;F)V", line = 208)
	public void method8975(@OriginalArg(0) Class472 arg0, @OriginalArg(1) float arg1) throws Exception_Sub3 {
		if (!this.method8940(-837378739) || this.aClass333_2.aBoolean712) {
			throw new Exception_Sub3();
		}
		this.aClass472_11.method29550(arg0);
		this.aClass472_12.method29550(arg0);
		this.aFloat107 = arg1;
		this.aFloat98 = arg1;
	}

	@OriginalMember(owner = "client!je", name = "co", descriptor = "(Lclient!ox;F)V", line = 208)
	public void method8976(@OriginalArg(0) Class472 arg0, @OriginalArg(1) float arg1) throws Exception_Sub3 {
		if (!this.method8940(-837378739) || this.aClass333_2.aBoolean712) {
			throw new Exception_Sub3();
		}
		this.aClass472_11.method29550(arg0);
		this.aClass472_12.method29550(arg0);
		this.aFloat107 = arg1;
		this.aFloat98 = arg1;
	}

	@OriginalMember(owner = "client!je", name = "cr", descriptor = "(Lclient!ox;F)V", line = 208)
	public void method8977(@OriginalArg(0) Class472 arg0, @OriginalArg(1) float arg1) throws Exception_Sub3 {
		if (!this.method8940(-837378739) || this.aClass333_2.aBoolean712) {
			throw new Exception_Sub3();
		}
		this.aClass472_11.method29550(arg0);
		this.aClass472_12.method29550(arg0);
		this.aFloat107 = arg1;
		this.aFloat98 = arg1;
	}

	@OriginalMember(owner = "client!je", name = "cf", descriptor = "(Lclient!ox;F)V", line = 208)
	public void method8978(@OriginalArg(0) Class472 arg0, @OriginalArg(1) float arg1) throws Exception_Sub3 {
		if (!this.method8940(-837378739) || this.aClass333_2.aBoolean712) {
			throw new Exception_Sub3();
		}
		this.aClass472_11.method29550(arg0);
		this.aClass472_12.method29550(arg0);
		this.aFloat107 = arg1;
		this.aFloat98 = arg1;
	}

	@OriginalMember(owner = "client!je", name = "q", descriptor = "(Lclient!ox;FI)V", line = 216)
	public void method8979(@OriginalArg(0) Class472 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2) throws Exception_Sub3 {
		if (!this.method8940(-837378739) || this.aClass333_2.aBoolean712) {
			throw new Exception_Sub3();
		}
		this.aClass472_11.method29550(arg0);
		this.aFloat107 = arg1;
	}

	@OriginalMember(owner = "client!je", name = "cm", descriptor = "(Lclient!ox;F)V", line = 216)
	public void method8980(@OriginalArg(0) Class472 arg0, @OriginalArg(1) float arg1) throws Exception_Sub3 {
		if (!this.method8940(-837378739) || this.aClass333_2.aBoolean712) {
			throw new Exception_Sub3();
		}
		this.aClass472_11.method29550(arg0);
		this.aFloat107 = arg1;
	}

	@OriginalMember(owner = "client!je", name = "x", descriptor = "(Lclient!ox;FB)V", line = 222)
	public void method8981(@OriginalArg(0) Class472 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) byte arg2) throws Exception_Sub3 {
		if (!this.method8940(-837378739) || this.aClass333_2.aBoolean712) {
			throw new Exception_Sub3();
		}
		this.aClass472_12.method29550(arg0);
		this.aFloat98 = arg1;
	}

	@OriginalMember(owner = "client!je", name = "cq", descriptor = "(Lclient!ox;F)V", line = 222)
	public void method8982(@OriginalArg(0) Class472 arg0, @OriginalArg(1) float arg1) throws Exception_Sub3 {
		if (!this.method8940(-837378739) || this.aClass333_2.aBoolean712) {
			throw new Exception_Sub3();
		}
		this.aClass472_12.method29550(arg0);
		this.aFloat98 = arg1;
	}

	@OriginalMember(owner = "client!je", name = "ch", descriptor = "(Lclient!ox;F)V", line = 222)
	public void method8983(@OriginalArg(0) Class472 arg0, @OriginalArg(1) float arg1) throws Exception_Sub3 {
		if (!this.method8940(-837378739) || this.aClass333_2.aBoolean712) {
			throw new Exception_Sub3();
		}
		this.aClass472_12.method29550(arg0);
		this.aFloat98 = arg1;
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(FFB)V", line = 228)
	public void method8984(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) byte arg2) throws Exception_Sub3 {
		if (!this.method8940(-837378739)) {
			throw new Exception_Sub3();
		}
		if (arg0 < 1.0F) {
			arg0 = 50.0F;
		}
		if (arg1 < 1.0F) {
			arg1 = 10000.0F;
		}
		if (arg0 >= arg1) {
			throw new Exception_Sub3();
		}
		this.aFloat102 = arg0;
		this.aFloat104 = arg1;
	}

	@OriginalMember(owner = "client!je", name = "cb", descriptor = "(FF)V", line = 228)
	public void method8985(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) throws Exception_Sub3 {
		if (!this.method8940(-837378739)) {
			throw new Exception_Sub3();
		}
		if (arg0 < 1.0F) {
			arg0 = 50.0F;
		}
		if (arg1 < 1.0F) {
			arg1 = 10000.0F;
		}
		if (arg0 >= arg1) {
			throw new Exception_Sub3();
		}
		this.aFloat102 = arg0;
		this.aFloat104 = arg1;
	}

	@OriginalMember(owner = "client!je", name = "cs", descriptor = "(FF)V", line = 237)
	public void method8986(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) throws Exception_Sub3 {
		if (!this.method8940(-837378739)) {
			throw new Exception_Sub3();
		}
		this.aFloat110 = arg0;
		this.aFloat108 = arg1;
	}

	@OriginalMember(owner = "client!je", name = "h", descriptor = "(FFI)V", line = 237)
	public void method8987(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2) throws Exception_Sub3 {
		if (!this.method8940(-837378739)) {
			throw new Exception_Sub3();
		}
		this.aFloat110 = arg0;
		this.aFloat108 = arg1;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(ZZI)V", line = 243)
	public void method8988(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) throws Exception_Sub3 {
		if (!this.method8940(-837378739)) {
			throw new Exception_Sub3();
		}
		this.aBoolean181 = arg0;
		this.aBoolean182 = arg1;
	}

	@OriginalMember(owner = "client!je", name = "cc", descriptor = "(ZZ)V", line = 243)
	public void method8989(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) throws Exception_Sub3 {
		if (!this.method8940(-837378739)) {
			throw new Exception_Sub3();
		}
		this.aBoolean181 = arg0;
		this.aBoolean182 = arg1;
	}

	@OriginalMember(owner = "client!je", name = "cy", descriptor = "(ZZ)V", line = 243)
	public void method8990(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) throws Exception_Sub3 {
		if (!this.method8940(-837378739)) {
			throw new Exception_Sub3();
		}
		this.aBoolean181 = arg0;
		this.aBoolean182 = arg1;
	}

	@OriginalMember(owner = "client!je", name = "ck", descriptor = "(IF)V", line = 249)
	public void method8991(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) throws Exception_Sub3 {
		if (!this.method8940(-837378739) || !this.aClass333_2.aBoolean712) {
			throw new Exception_Sub3();
		}
		this.anInt1014 = arg0 * -1956959367;
		this.aFloat112 = arg1;
	}

	@OriginalMember(owner = "client!je", name = "g", descriptor = "(IFI)V", line = 249)
	public void method8992(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2) throws Exception_Sub3 {
		if (!this.method8940(-837378739) || !this.aClass333_2.aBoolean712) {
			throw new Exception_Sub3();
		}
		this.anInt1014 = arg0 * -1956959367;
		this.aFloat112 = arg1;
	}

	@OriginalMember(owner = "client!je", name = "cz", descriptor = "(IF)V", line = 249)
	public void method8993(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) throws Exception_Sub3 {
		if (!this.method8940(-837378739) || !this.aClass333_2.aBoolean712) {
			throw new Exception_Sub3();
		}
		this.anInt1014 = arg0 * -1956959367;
		this.aFloat112 = arg1;
	}

	@OriginalMember(owner = "client!je", name = "i", descriptor = "(Lclient!aso;I)V", line = 255)
	public void method8994(@OriginalArg(0) Class93_Sub1_Sub17 arg0, @OriginalArg(1) int arg1) {
		this.aClass16_7.method220(arg0, (long) (arg0.anInt3208 * 1923037877));
	}

	@OriginalMember(owner = "client!je", name = "j", descriptor = "(II)V", line = 259)
	public void method8995(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) Class93_Sub1_Sub17 local6 = (Class93_Sub1_Sub17) this.aClass16_7.method214((long) arg0);
		if (local6 != null) {
			local6.method23969(402684636);
		}
	}

	@OriginalMember(owner = "client!je", name = "cj", descriptor = "(I)V", line = 259)
	public void method8996(@OriginalArg(0) int arg0) {
		@Pc(6) Class93_Sub1_Sub17 local6 = (Class93_Sub1_Sub17) this.aClass16_7.method214((long) arg0);
		if (local6 != null) {
			local6.method23969(1259796759);
		}
	}

	@OriginalMember(owner = "client!je", name = "t", descriptor = "(II)Lclient!aso;", line = 264)
	public Class93_Sub1_Sub17 method8997(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (Class93_Sub1_Sub17) this.aClass16_7.method214((long) arg0);
	}

	@OriginalMember(owner = "client!je", name = "cd", descriptor = "(I)Lclient!aso;", line = 264)
	public Class93_Sub1_Sub17 method8998(@OriginalArg(0) int arg0) {
		return (Class93_Sub1_Sub17) this.aClass16_7.method214((long) arg0);
	}

	@OriginalMember(owner = "client!je", name = "dd", descriptor = "(I)Lclient!aso;", line = 264)
	public Class93_Sub1_Sub17 method8999(@OriginalArg(0) int arg0) {
		return (Class93_Sub1_Sub17) this.aClass16_7.method214((long) arg0);
	}

	@OriginalMember(owner = "client!je", name = "ae", descriptor = "(B)V", line = 268)
	public void method9000(@OriginalArg(0) byte arg0) {
		this.aClass16_7.method225((byte) 94);
	}

	@OriginalMember(owner = "client!je", name = "da", descriptor = "()V", line = 268)
	public void method9001() {
		this.aClass16_7.method225((byte) 118);
	}

	@OriginalMember(owner = "client!je", name = "dr", descriptor = "()V", line = 268)
	public void method9002() {
		this.aClass16_7.method225((byte) 67);
	}

	@OriginalMember(owner = "client!je", name = "ag", descriptor = "(B)Z", line = 272)
	public boolean method9003(@OriginalArg(0) byte arg0) {
		if (this.aClass25_2 == null || this.aClass124_2 == null) {
			return false;
		} else if (this.aClass25_2.method23136(-1212435864)) {
			return this.aClass124_2.method21407(1383693999);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!je", name = "dt", descriptor = "()Z", line = 272)
	public boolean method9004() {
		if (this.aClass25_2 == null || this.aClass124_2 == null) {
			return false;
		} else if (this.aClass25_2.method23136(503239513)) {
			return this.aClass124_2.method21407(-399085542);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!je", name = "do", descriptor = "()Z", line = 272)
	public boolean method9005() {
		if (this.aClass25_2 == null || this.aClass124_2 == null) {
			return false;
		} else if (this.aClass25_2.method23136(-914345882)) {
			return this.aClass124_2.method21407(2002740113);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!je", name = "ah", descriptor = "(Lclient!ju;Lclient!ou;Lclient!pq;IIB)V", line = 279)
	public void method9006(@OriginalArg(0) Class368 arg0, @OriginalArg(1) Class470 arg1, @OriginalArg(2) Class489 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte arg5) {
		if (!this.method9003((byte) 51)) {
			return;
		}
		this.aClass25_2.method23127(arg0, arg1, arg3, arg4, this.aClass124_2.method21411(-878457679), (byte) -1);
		this.aClass124_2.method21412(arg0, arg3, arg4, (byte) 19);
		if (Class359.aClass359_3 == this.aClass359_2) {
			arg2.method29897(this.aFloat102, this.aFloat104, this.aFloat110, this.aFloat108);
		} else {
			arg2.method29900(this.aFloat102, this.aFloat104, (float) (this.anInt1011 * -402188337));
		}
		@Pc(52) Iterator local52 = this.aClass16_7.iterator();
		while (local52.hasNext()) {
			@Pc(59) Class93_Sub1_Sub17 local59 = (Class93_Sub1_Sub17) local52.next();
			local59.method23501(arg0, arg1, arg2, 450211105);
		}
	}

	@OriginalMember(owner = "client!je", name = "dz", descriptor = "(Lclient!ju;Lclient!ou;Lclient!pq;II)V", line = 279)
	public void method9007(@OriginalArg(0) Class368 arg0, @OriginalArg(1) Class470 arg1, @OriginalArg(2) Class489 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (!this.method9003((byte) -77)) {
			return;
		}
		this.aClass25_2.method23127(arg0, arg1, arg3, arg4, this.aClass124_2.method21411(966484716), (byte) -33);
		this.aClass124_2.method21412(arg0, arg3, arg4, (byte) 10);
		if (Class359.aClass359_3 == this.aClass359_2) {
			arg2.method29897(this.aFloat102, this.aFloat104, this.aFloat110, this.aFloat108);
		} else {
			arg2.method29900(this.aFloat102, this.aFloat104, (float) (this.anInt1011 * -402188337));
		}
		@Pc(52) Iterator local52 = this.aClass16_7.iterator();
		while (local52.hasNext()) {
			@Pc(59) Class93_Sub1_Sub17 local59 = (Class93_Sub1_Sub17) local52.next();
			local59.method23501(arg0, arg1, arg2, 450211105);
		}
	}

	@OriginalMember(owner = "client!je", name = "al", descriptor = "(I)Lclient!jd;", line = 292)
	public Class358 method9008(@OriginalArg(0) int arg0) {
		return this.aClass358_2;
	}

	@OriginalMember(owner = "client!je", name = "dv", descriptor = "()Lclient!jd;", line = 292)
	public Class358 method9009() {
		return this.aClass358_2;
	}

	@OriginalMember(owner = "client!je", name = "dm", descriptor = "()Lclient!jd;", line = 292)
	public Class358 method9010() {
		return this.aClass358_2;
	}

	@OriginalMember(owner = "client!je", name = "ac", descriptor = "(B)Lclient!kl;", line = 296)
	public Class124 method9011(@OriginalArg(0) byte arg0) {
		return this.aClass124_2;
	}

	@OriginalMember(owner = "client!je", name = "dk", descriptor = "()Lclient!aax;", line = 300)
	public Class25 method9012() {
		return this.aClass25_2;
	}

	@OriginalMember(owner = "client!je", name = "dc", descriptor = "()Lclient!aax;", line = 300)
	public Class25 method9013() {
		return this.aClass25_2;
	}

	@OriginalMember(owner = "client!je", name = "dq", descriptor = "()Lclient!aax;", line = 300)
	public Class25 method9014() {
		return this.aClass25_2;
	}

	@OriginalMember(owner = "client!je", name = "di", descriptor = "()Lclient!aax;", line = 300)
	public Class25 method9015() {
		return this.aClass25_2;
	}

	@OriginalMember(owner = "client!je", name = "dn", descriptor = "()Lclient!aax;", line = 300)
	public Class25 method9016() {
		return this.aClass25_2;
	}

	@OriginalMember(owner = "client!je", name = "ai", descriptor = "(I)Lclient!aax;", line = 300)
	public Class25 method9017(@OriginalArg(0) int arg0) {
		return this.aClass25_2;
	}

	@OriginalMember(owner = "client!je", name = "aw", descriptor = "(I)Lclient!jy;", line = 304)
	public Interface31 method9018(@OriginalArg(0) int arg0) {
		return this.anInterface31_2;
	}

	@OriginalMember(owner = "client!je", name = "df", descriptor = "()Lclient!jy;", line = 304)
	public Interface31 method9019() {
		return this.anInterface31_2;
	}

	@OriginalMember(owner = "client!je", name = "as", descriptor = "(B)Lclient!ii;", line = 308)
	public Class338 method9020(@OriginalArg(0) byte arg0) {
		return this.aClass338_2;
	}

	@OriginalMember(owner = "client!je", name = "ds", descriptor = "()Lclient!ii;", line = 308)
	public Class338 method9021() {
		return this.aClass338_2;
	}

	@OriginalMember(owner = "client!je", name = "dw", descriptor = "()Lclient!ii;", line = 308)
	public Class338 method9022() {
		return this.aClass338_2;
	}

	@OriginalMember(owner = "client!je", name = "du", descriptor = "()Lclient!im;", line = 312)
	public Class342 method9023() {
		return this.aClass342_2;
	}

	@OriginalMember(owner = "client!je", name = "at", descriptor = "(I)Lclient!im;", line = 312)
	public Class342 method9024(@OriginalArg(0) int arg0) {
		return this.aClass342_2;
	}

	@OriginalMember(owner = "client!je", name = "ad", descriptor = "(I)Lclient!ox;", line = 316)
	public Class472 method9025(@OriginalArg(0) int arg0) {
		return this.aClass124_2 != null && this.aClass124_2.method21407(1123059328) ? this.aClass124_2.method21408((byte) 14) : null;
	}

	@OriginalMember(owner = "client!je", name = "dp", descriptor = "()Lclient!ox;", line = 316)
	public Class472 method9026() {
		return this.aClass124_2 != null && this.aClass124_2.method21407(1222758387) ? this.aClass124_2.method21408((byte) 94) : null;
	}

	@OriginalMember(owner = "client!je", name = "dl", descriptor = "()Lclient!ox;", line = 316)
	public Class472 method9027() {
		return this.aClass124_2 != null && this.aClass124_2.method21407(-1719719479) ? this.aClass124_2.method21408((byte) 16) : null;
	}

	@OriginalMember(owner = "client!je", name = "dy", descriptor = "()Lclient!ox;", line = 316)
	public Class472 method9028() {
		return this.aClass124_2 != null && this.aClass124_2.method21407(-837530720) ? this.aClass124_2.method21408((byte) 14) : null;
	}

	@OriginalMember(owner = "client!je", name = "am", descriptor = "(I)[D", line = 321)
	public double[] method9029(@OriginalArg(0) int arg0) {
		return this.aClass124_2 != null && this.aClass124_2.method21407(1434211288) ? this.aClass124_2.method21419(1821258911) : null;
	}

	@OriginalMember(owner = "client!je", name = "de", descriptor = "()[D", line = 321)
	public double[] method9030() {
		return this.aClass124_2 != null && this.aClass124_2.method21407(-86571603) ? this.aClass124_2.method21419(1583186510) : null;
	}

	@OriginalMember(owner = "client!je", name = "db", descriptor = "()[D", line = 321)
	public double[] method9031() {
		return this.aClass124_2 != null && this.aClass124_2.method21407(1216140919) ? this.aClass124_2.method21419(1371923758) : null;
	}

	@OriginalMember(owner = "client!je", name = "dh", descriptor = "()[D", line = 321)
	public double[] method9032() {
		return this.aClass124_2 != null && this.aClass124_2.method21407(-1143121466) ? this.aClass124_2.method21419(1256697295) : null;
	}

	@OriginalMember(owner = "client!je", name = "dx", descriptor = "()[D", line = 321)
	public double[] method9033() {
		return this.aClass124_2 != null && this.aClass124_2.method21407(200623765) ? this.aClass124_2.method21419(1620351582) : null;
	}

	@OriginalMember(owner = "client!je", name = "dg", descriptor = "()[D", line = 321)
	public double[] method9034() {
		return this.aClass124_2 != null && this.aClass124_2.method21407(1589909477) ? this.aClass124_2.method21419(1622216386) : null;
	}

	@OriginalMember(owner = "client!je", name = "au", descriptor = "(I)Lclient!ox;", line = 326)
	public Class472 method9035(@OriginalArg(0) int arg0) {
		return this.aClass25_2 != null && this.aClass25_2.method23136(251396220) ? this.aClass25_2.method23124(884222877) : null;
	}

	@OriginalMember(owner = "client!je", name = "dj", descriptor = "()Lclient!ox;", line = 326)
	public Class472 method9036() {
		return this.aClass25_2 != null && this.aClass25_2.method23136(-1728019616) ? this.aClass25_2.method23124(2057785572) : null;
	}

	@OriginalMember(owner = "client!je", name = "eo", descriptor = "()Lclient!ox;", line = 326)
	public Class472 method9037() {
		return this.aClass25_2 != null && this.aClass25_2.method23136(1014336498) ? this.aClass25_2.method23124(-260872003) : null;
	}

	@OriginalMember(owner = "client!je", name = "ey", descriptor = "()Lclient!akt;", line = 331)
	public Class93_Sub30 method9038() {
		return this.aClass124_2 != null && this.aClass124_2.method21407(-1886035910) ? this.aClass124_2.method21410((byte) 119) : null;
	}

	@OriginalMember(owner = "client!je", name = "ar", descriptor = "(I)Lclient!akt;", line = 331)
	public Class93_Sub30 method9039(@OriginalArg(0) int arg0) {
		return this.aClass124_2 != null && this.aClass124_2.method21407(-1477690575) ? this.aClass124_2.method21410((byte) 78) : null;
	}

	@OriginalMember(owner = "client!je", name = "ap", descriptor = "(B)F", line = 336)
	public float method9040(@OriginalArg(0) byte arg0) {
		@Pc(3) Class472 local3 = this.method9025(137014543);
		@Pc(7) Class472 local7 = this.method9035(1208611233);
		@Pc(9) float local9 = 0.0F;
		if (local3 != null && local7 != null) {
			@Pc(18) Class472 local18 = Class472.method29579(local7, local3);
			@Pc(33) float local33 = (float) Math.sqrt((double) (local18.aFloat317 * local18.aFloat317 + local18.aFloat319 * local18.aFloat319));
			local9 = (float) Math.atan2((double) -local18.aFloat318, (double) local33);
			local3.method29544();
			local7.method29544();
		}
		return local9;
	}

	@OriginalMember(owner = "client!je", name = "ee", descriptor = "()F", line = 350)
	public float method9041() {
		@Pc(3) Class472 local3 = this.method9025(1361479182);
		@Pc(7) Class472 local7 = this.method9035(1208611233);
		@Pc(9) float local9 = 0.0F;
		if (local3 != null && local7 != null) {
			@Pc(19) Class472 local19 = Class472.method29579(local3, local7);
			local19.aFloat318 = 0.0F;
			local9 = (float) Math.atan2((double) local19.aFloat317, (double) local19.aFloat319);
			local3.method29544();
			local7.method29544();
		}
		return (float) (3.141592653589793D - (double) local9);
	}

	@OriginalMember(owner = "client!je", name = "aq", descriptor = "(B)F", line = 350)
	public float method9042(@OriginalArg(0) byte arg0) {
		@Pc(3) Class472 local3 = this.method9025(-545588235);
		@Pc(7) Class472 local7 = this.method9035(1208611233);
		@Pc(9) float local9 = 0.0F;
		if (local3 != null && local7 != null) {
			@Pc(19) Class472 local19 = Class472.method29579(local3, local7);
			local19.aFloat318 = 0.0F;
			local9 = (float) Math.atan2((double) local19.aFloat317, (double) local19.aFloat319);
			local3.method29544();
			local7.method29544();
		}
		return (float) (3.141592653589793D - (double) local9);
	}

	@OriginalMember(owner = "client!je", name = "eu", descriptor = "()F", line = 350)
	public float method9043() {
		@Pc(3) Class472 local3 = this.method9025(139086689);
		@Pc(7) Class472 local7 = this.method9035(1208611233);
		@Pc(9) float local9 = 0.0F;
		if (local3 != null && local7 != null) {
			@Pc(19) Class472 local19 = Class472.method29579(local3, local7);
			local19.aFloat318 = 0.0F;
			local9 = (float) Math.atan2((double) local19.aFloat317, (double) local19.aFloat319);
			local3.method29544();
			local7.method29544();
		}
		return (float) (3.141592653589793D - (double) local9);
	}

	@OriginalMember(owner = "client!je", name = "ed", descriptor = "()F", line = 350)
	public float method9044() {
		@Pc(3) Class472 local3 = this.method9025(-577947458);
		@Pc(7) Class472 local7 = this.method9035(1208611233);
		@Pc(9) float local9 = 0.0F;
		if (local3 != null && local7 != null) {
			@Pc(19) Class472 local19 = Class472.method29579(local3, local7);
			local19.aFloat318 = 0.0F;
			local9 = (float) Math.atan2((double) local19.aFloat317, (double) local19.aFloat319);
			local3.method29544();
			local7.method29544();
		}
		return (float) (3.141592653589793D - (double) local9);
	}

	@OriginalMember(owner = "client!je", name = "ax", descriptor = "(I)F", line = 364)
	float method9045(@OriginalArg(0) int arg0) {
		return 0.0F;
	}

	@OriginalMember(owner = "client!je", name = "es", descriptor = "()F", line = 364)
	float method9046() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!je", name = "ei", descriptor = "()F", line = 364)
	float method9047() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!je", name = "el", descriptor = "()F", line = 364)
	float method9048() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!je", name = "av", descriptor = "(I)Lclient!ov;", line = 368)
	public Class471 method9049(@OriginalArg(0) int arg0) {
		@Pc(1) Class471 local1 = Class471.method29459();
		local1.method29485(this.method9042((byte) -116), this.method9040((byte) 117), this.method9045(-2093381989));
		return local1;
	}

	@OriginalMember(owner = "client!je", name = "ej", descriptor = "()Lclient!ov;", line = 368)
	public Class471 method9050() {
		@Pc(1) Class471 local1 = Class471.method29459();
		local1.method29485(this.method9042((byte) -111), this.method9040((byte) 21), this.method9045(-1039523067));
		return local1;
	}

	@OriginalMember(owner = "client!je", name = "ep", descriptor = "()Lclient!ov;", line = 368)
	public Class471 method9051() {
		@Pc(1) Class471 local1 = Class471.method29459();
		local1.method29485(this.method9042((byte) -74), this.method9040((byte) 62), this.method9045(-585694116));
		return local1;
	}

	@OriginalMember(owner = "client!je", name = "ev", descriptor = "()Lclient!ov;", line = 368)
	public Class471 method9052() {
		@Pc(1) Class471 local1 = Class471.method29459();
		local1.method29485(this.method9042((byte) -69), this.method9040((byte) 36), this.method9045(-687831480));
		return local1;
	}

	@OriginalMember(owner = "client!je", name = "ek", descriptor = "()Lclient!ox;", line = 374)
	public Class472 method9053() {
		return this.aClass472_10;
	}

	@OriginalMember(owner = "client!je", name = "ao", descriptor = "(B)Lclient!ox;", line = 374)
	public Class472 method9054(@OriginalArg(0) byte arg0) {
		return this.aClass472_10;
	}

	@OriginalMember(owner = "client!je", name = "ec", descriptor = "()Lclient!ox;", line = 374)
	public Class472 method9055() {
		return this.aClass472_10;
	}

	@OriginalMember(owner = "client!je", name = "eh", descriptor = "()Lclient!ox;", line = 378)
	public Class472 method9056() {
		return this.aClass472_13;
	}

	@OriginalMember(owner = "client!je", name = "aj", descriptor = "(I)Lclient!ox;", line = 378)
	public Class472 method9057(@OriginalArg(0) int arg0) {
		return this.aClass472_13;
	}

	@OriginalMember(owner = "client!je", name = "em", descriptor = "()Lclient!ox;", line = 378)
	public Class472 method9058() {
		return this.aClass472_13;
	}

	@OriginalMember(owner = "client!je", name = "ef", descriptor = "()F", line = 382)
	public float method9059() {
		return this.aFloat101;
	}

	@OriginalMember(owner = "client!je", name = "ay", descriptor = "(S)F", line = 382)
	public float method9060(@OriginalArg(0) short arg0) {
		return this.aFloat101;
	}

	@OriginalMember(owner = "client!je", name = "eq", descriptor = "()F", line = 382)
	public float method9061() {
		return this.aFloat101;
	}

	@OriginalMember(owner = "client!je", name = "eg", descriptor = "()F", line = 382)
	public float method9062() {
		return this.aFloat101;
	}

	@OriginalMember(owner = "client!je", name = "ez", descriptor = "()F", line = 382)
	public float method9063() {
		return this.aFloat101;
	}

	@OriginalMember(owner = "client!je", name = "ab", descriptor = "(B)Lclient!ox;", line = 386)
	public Class472 method9064(@OriginalArg(0) byte arg0) {
		return this.aClass472_8;
	}

	@OriginalMember(owner = "client!je", name = "et", descriptor = "()Lclient!ox;", line = 386)
	public Class472 method9065() {
		return this.aClass472_8;
	}

	@OriginalMember(owner = "client!je", name = "er", descriptor = "()Lclient!ox;", line = 386)
	public Class472 method9066() {
		return this.aClass472_8;
	}

	@OriginalMember(owner = "client!je", name = "ea", descriptor = "()Lclient!ox;", line = 386)
	public Class472 method9067() {
		return this.aClass472_8;
	}

	@OriginalMember(owner = "client!je", name = "ew", descriptor = "()Lclient!ox;", line = 386)
	public Class472 method9068() {
		return this.aClass472_8;
	}

	@OriginalMember(owner = "client!je", name = "az", descriptor = "(B)Lclient!ox;", line = 390)
	public Class472 method9069(@OriginalArg(0) byte arg0) {
		return this.aClass472_9;
	}

	@OriginalMember(owner = "client!je", name = "en", descriptor = "()Lclient!ox;", line = 390)
	public Class472 method9070() {
		return this.aClass472_9;
	}

	@OriginalMember(owner = "client!je", name = "eb", descriptor = "()Lclient!ox;", line = 390)
	public Class472 method9071() {
		return this.aClass472_9;
	}

	@OriginalMember(owner = "client!je", name = "ex", descriptor = "()Lclient!ox;", line = 390)
	public Class472 method9072() {
		return this.aClass472_9;
	}

	@OriginalMember(owner = "client!je", name = "aa", descriptor = "(I)F", line = 394)
	public float method9073(@OriginalArg(0) int arg0) {
		return this.aFloat102;
	}

	@OriginalMember(owner = "client!je", name = "fg", descriptor = "()F", line = 394)
	public float method9074() {
		return this.aFloat102;
	}

	@OriginalMember(owner = "client!je", name = "fm", descriptor = "()F", line = 398)
	public float method9075() {
		return this.aFloat104;
	}

	@OriginalMember(owner = "client!je", name = "af", descriptor = "(I)F", line = 398)
	public float method9076(@OriginalArg(0) int arg0) {
		return this.aFloat104;
	}

	@OriginalMember(owner = "client!je", name = "ak", descriptor = "(I)F", line = 402)
	public float method9077(@OriginalArg(0) int arg0) {
		return this.aFloat110;
	}

	@OriginalMember(owner = "client!je", name = "fu", descriptor = "()F", line = 402)
	public float method9078() {
		return this.aFloat110;
	}

	@OriginalMember(owner = "client!je", name = "an", descriptor = "(I)Z", line = 406)
	public boolean method9079(@OriginalArg(0) int arg0) {
		return this.aBoolean181;
	}

	@OriginalMember(owner = "client!je", name = "bf", descriptor = "(I)Z", line = 410)
	public boolean method9080(@OriginalArg(0) int arg0) {
		return this.aBoolean182;
	}

	@OriginalMember(owner = "client!je", name = "o", descriptor = "(Lclient!dh;IILclient!hf;Lclient!ch;IIB)V", line = 519)
	static void method9081(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class312 arg3, @OriginalArg(4) Class96 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte arg7) {
		for (@Pc(1) int local1 = 0; local1 < client.anInt3540 * 568731113; local1++) {
			@Pc(14) Class93_Sub15 local14 = (Class93_Sub15) client.aClass16_18.method214((long) client.anIntArray323[local1]);
			if (local14 != null) {
				@Pc(21) Class132_Sub1_Sub1_Sub1_Sub1 local21 = (Class132_Sub1_Sub1_Sub1_Sub1) local14.anObject5;
				if (local21.method18607(33985) && local21.aByte100 == Class520.selfPlayer.aByte100) {
					@Pc(33) Class336 local33 = local21.aClass336_1;
					if (local33 != null && local33.anIntArray412 != null) {
						local33 = local33.method27435(Class624.aClass120_1, Class624.aClass120_1, (short) 9686);
					}
					if (local33 != null && local33.aBoolean715 && local33.aBoolean718) {
						@Pc(58) Class472 local58 = local21.method24220().aClass472_61;
						@Pc(68) int local68 = (int) local58.aFloat317 / 128 - arg1 / 128;
						@Pc(78) int local78 = (int) local58.aFloat319 / 128 - arg2 / 128;
						if (local33.anInt4181 * 1155077859 == -1) {
							Class151.method13981(arg3, arg4, arg5, arg6, local68, local78, Class393.aClass100Array6[1], -1827332117);
						} else {
							Class56.method18035(arg0, arg4, arg3, arg5, arg6, local68, local78, local33.anInt4181 * 1155077859, (byte) -8);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!je", name = "gx", descriptor = "(IIII)V", line = 3656)
	public static void method9082(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3 = arg0 << 3;
		@Pc(7) int local7 = arg1 << 3;
		@Pc(11) int local11 = arg2 << 3;
		if (Class429.anInt4781 * -1453926679 != 3) {
			client.aFloat256 = local3;
			client.aFloat253 = local7;
			if (Class429.anInt4781 * -1453926679 == 5) {
				Class620.anInt5644 = local3 * -1151839067;
				IsaacRandom.anInt82 = local7 * 1056124373;
				Class348.anInt4199 = local11 * -2045030213;
			}
			Class49.method16604((byte) 20);
		} else if (Class65.aClass123_Sub1_2.method9024(-1662199153) == Class342.aClass342_3) {
			@Pc(26) Class124_Sub1 local26 = (Class124_Sub1) Class65.aClass123_Sub1_2.method9011((byte) -10);
			@Pc(30) Class471 local30 = new Class471();
			@Pc(34) Class471 local34 = new Class471();
			local30.method29482(0.0F, 1.0F, 0.0F, 3.1415927F - (float) (2.0D * 3.141592653589793D * (double) local7 / 16384.0D));
			@Pc(57) Class472 local57 = new Class472(1.0F, 0.0F, 0.0F);
			local57.method29623(local30);
			local57.method29561();
			local34.method29478(local57, (float) (2.0D * 3.141592653589793D * (double) local3) / 16384.0F);
			local30.method29510(local34);
			local26.aClass471_1.method29477(local30);
		}
		client.aBoolean619 = true;
	}

	@OriginalMember(owner = "client!je", name = "gh", descriptor = "(Lclient!yf;I)V", line = 6162)
	static final void method9083(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32808(local12, 1909050943);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class365.method27918(local16, local22, arg0, 1842635091);
	}

	@OriginalMember(owner = "client!je", name = "hq", descriptor = "(Lclient!yf;I)V", line = 6304)
	static final void method9084(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32808(local12, -660517867);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class12.method187(local16, local22, false, 1, arg0, 1691862116);
	}

	@OriginalMember(owner = "client!je", name = "ajo", descriptor = "(Lclient!yf;I)V", line = 11465)
	static final void method9085(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= -1915563430;
	}

	@OriginalMember(owner = "client!je", name = "ajl", descriptor = "(Lclient!yf;I)V", line = 11499)
	static final void method9086(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class93_Sub1_Sub20 local13 = Class159.method14520(arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091]);
		if (local13 == null || local13.aString114 == null) {
			arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = "";
		} else {
			arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = local13.aString114;
		}
	}

	@OriginalMember(owner = "client!je", name = "bdj", descriptor = "(Lclient!yf;I)V", line = 14793)
	static final void method9087(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = client.aClass270_1.method26280(local12, -746607569).anInt3891 * 1676750823;
	}
}
