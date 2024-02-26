package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.awt.*;

@OriginalClass("client!sg")
public final class Class549 {

	@OriginalMember(owner = "client!sg", name = "h", descriptor = "Lclient!dx;")
	static Class235 aClass235_7;

	@OriginalMember(owner = "client!sg", name = "t", descriptor = "I")
	static final int anInt5145 = 512;

	@OriginalMember(owner = "client!sg", name = "e", descriptor = "I")
	int anInt5138;

	@OriginalMember(owner = "client!sg", name = "i", descriptor = "I")
	int anInt5139;

	@OriginalMember(owner = "client!sg", name = "n", descriptor = "Lclient!sg;")
	Class549 aClass549_1;

	@OriginalMember(owner = "client!sg", name = "y", descriptor = "Z")
	boolean aBoolean910;

	@OriginalMember(owner = "client!sg", name = "x", descriptor = "I")
	int anInt5140;

	@OriginalMember(owner = "client!sg", name = "p", descriptor = "Lclient!dn;")
	Class105 aClass105_7;

	@OriginalMember(owner = "client!sg", name = "w", descriptor = "I")
	int anInt5143;

	@OriginalMember(owner = "client!sg", name = "v", descriptor = "[B")
	byte[] aByteArray98;

	@OriginalMember(owner = "client!sg", name = "s", descriptor = "Lclient!cm;")
	Class99 aClass99_34;

	@OriginalMember(owner = "client!sg", name = "c", descriptor = "I")
	int anInt5147;

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "I")
	int anInt5148;

	@OriginalMember(owner = "client!sg", name = "ax", descriptor = "I")
	int anInt5149;

	@OriginalMember(owner = "client!sg", name = "m", descriptor = "I")
	int anInt5142 = 769769745;

	@OriginalMember(owner = "client!sg", name = "r", descriptor = "Z")
	boolean aBoolean911 = true;

	@OriginalMember(owner = "client!sg", name = "o", descriptor = "I")
	final int anInt5136;

	@OriginalMember(owner = "client!sg", name = "j", descriptor = "I")
	final int anInt5146;

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "I")
	final int anInt5141;

	@OriginalMember(owner = "client!sg", name = "f", descriptor = "I")
	final int anInt5137;

	@OriginalMember(owner = "client!sg", name = "l", descriptor = "[Lclient!sj;")
	Class551[] aClass551Array2;

	@OriginalMember(owner = "client!sg", name = "k", descriptor = "Lclient!ud;")
	Class590 aClass590_1;

	@OriginalMember(owner = "client!sg", name = "g", descriptor = "[Lclient!sj;")
	Class551[] aClass551Array1;

	@OriginalMember(owner = "client!sg", name = "u", descriptor = "Lclient!sj;")
	Class551 aClass551_1;

	@OriginalMember(owner = "client!sg", name = "z", descriptor = "I")
	int anInt5144;

	@OriginalMember(owner = "client!sg", name = "x", descriptor = "(Lclient!pf;Lclient!dx;Lclient!ew;)V")
	public static void method31286(@OriginalArg(0) Class480 arg0, @OriginalArg(1) Class235 arg1, @OriginalArg(2) Interface23 arg2) {
		Class391.aClass480_111 = arg0;
		aClass235_7 = arg1;
		Class628.anInterface23_10 = arg2;
	}

	@OriginalMember(owner = "client!sg", name = "w", descriptor = "()V")
	public static void method31287() {
		Class551.method31321();
	}

	@OriginalMember(owner = "client!sg", name = "r", descriptor = "()V")
	public static void method31288() {
		Class551.method31321();
	}

	@OriginalMember(owner = "client!sg", name = "q", descriptor = "()V")
	public static void method31289() {
		Class551.method31321();
	}

	@OriginalMember(owner = "client!sg", name = "h", descriptor = "()V")
	public static void method31290() {
		Class551.method31321();
	}

	@OriginalMember(owner = "client!sg", name = "i", descriptor = "(I)Lclient!aly;")
	public static Class163_Sub1 method31315(@OriginalArg(0) int arg0) {
		return Class47.anInt180 * -1516568149 < Class47.aClass163_Sub1Array1.length ? Class47.aClass163_Sub1Array1[(Class47.anInt180 += 886567171) * -1516568149 - 1] : null;
	}

	@OriginalMember(owner = "client!sg", name = "u", descriptor = "(II)Z")
	public static boolean method31316(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 0 || arg0 == 2;
	}

	@OriginalMember(owner = "client!sg", name = "f", descriptor = "(Lclient!aam;IIIII)Ljava/awt/Frame;")
	public static Frame method31317(@OriginalArg(0) Class14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg3 == 0) {
			@Pc(6) Class26[] local6 = Class152.method14626(arg0, -1332478000);
			if (local6 == null) {
				return null;
			}
			@Pc(13) boolean local13 = false;
			for (@Pc(15) int local15 = 0; local15 < local6.length; local15++) {
				if (local6[local15].anInt81 * -1249901293 == arg1 && local6[local15].anInt80 * -2004120797 == arg2 && (arg4 == 0 || local6[local15].anInt82 * -2017780673 == arg4) && (!local13 || local6[local15].anInt79 * 1710030443 > arg3)) {
					arg3 = local6[local15].anInt79 * 1710030443;
					local13 = true;
				}
			}
			if (!local13) {
				return null;
			}
		}
		@Pc(75) Frame local75 = new Frame("Jagex Full Screen");
		local75.setResizable(false);
		arg0.method356(local75, arg1, arg2, arg3, arg4, 873758524);
		return local75;
	}

	@OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(I[Lclient!sj;IIIILclient!ud;I)V")
	public Class549(@OriginalArg(0) int arg0, @OriginalArg(1) Class551[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class590 arg6, @OriginalArg(7) int arg7) {
		this.anInt5136 = arg3 * -1619507551;
		this.anInt5146 = arg4 * -2065752395;
		this.anInt5141 = arg5 * -117900749;
		this.anInt5137 = arg0 * 1865169599;
		this.aClass551Array2 = arg1;
		this.aClass590_1 = arg6;
		if (arg1 == null) {
			this.aClass551Array1 = null;
			this.aClass551_1 = null;
		} else {
			this.aClass551Array1 = new Class551[arg1.length];
			this.aClass551_1 = arg2 >= 0 ? arg1[arg2] : null;
		}
		this.anInt5144 = arg7 * 269396189;
	}

	@OriginalMember(owner = "client!sg", name = "l", descriptor = "(B)V")
	public void method31274(@OriginalArg(0) byte arg0) {
		this.aBoolean910 = false;
		this.aClass549_1 = null;
		this.anInt5147 = 0;
	}

	@OriginalMember(owner = "client!sg", name = "ax", descriptor = "()V")
	public void method31275() {
		this.aBoolean910 = false;
		this.aClass549_1 = null;
		this.anInt5147 = 0;
	}

	@OriginalMember(owner = "client!sg", name = "aj", descriptor = "()Lclient!sg;")
	public Class549 method31276() {
		return this.aClass549_1;
	}

	@OriginalMember(owner = "client!sg", name = "e", descriptor = "(III)V")
	public void method31277(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!this.aBoolean910) {
		}
		this.anInt5147 = ((arg1 - this.anInt5149 * 1851926389) * arg0 / 255 + this.anInt5149 * 1851926389) * 2049817155;
	}

	@OriginalMember(owner = "client!sg", name = "g", descriptor = "(B)Z")
	public boolean method31278(@OriginalArg(0) byte arg0) {
		return this.aBoolean910;
	}

	@OriginalMember(owner = "client!sg", name = "i", descriptor = "(B)Lclient!sg;")
	public Class549 method31279(@OriginalArg(0) byte arg0) {
		return this.aClass549_1;
	}

	@OriginalMember(owner = "client!sg", name = "m", descriptor = "(Lclient!di;III)Z")
	public boolean method31280(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt5142 * -1972719601 != arg1) {
			this.anInt5142 = arg1 * -769769745;
			@Pc(14) int local14 = Class548.method31273(arg1, -1997663226);
			if (local14 > 512) {
				local14 = 512;
			}
			if (local14 <= 0) {
				local14 = 1;
			}
			if (local14 != this.anInt5138 * -597540131) {
				this.anInt5138 = local14 * -192174731;
				this.aClass99_34 = null;
			}
			if (this.aClass551Array2 != null) {
				this.anInt5139 = 0;
				@Pc(48) int[] local48 = new int[this.aClass551Array2.length];
				for (@Pc(50) int local50 = 0; local50 < this.aClass551Array2.length; local50++) {
					@Pc(60) Class551 local60 = this.aClass551Array2[local50];
					if (local60.method31322(this.anInt5136 * -1790108319, this.anInt5146 * 835805085, this.anInt5141 * 1380094203, this.anInt5142 * -1972719601)) {
						local48[this.anInt5139 * -1070538567] = local60.anInt5163;
						this.aClass551Array1[(this.anInt5139 += -540727927) * -1070538567 - 1] = local60;
					}
				}
				Class607.method32176(local48, this.aClass551Array1, 0, this.anInt5139 * -1070538567 - 1, -1683933315);
			}
			this.aBoolean911 = true;
		}
		@Pc(121) boolean local121 = false;
		if (this.aBoolean911) {
			this.aBoolean911 = false;
			for (@Pc(134) int local134 = this.anInt5139 * -1070538567 - 1; local134 >= 0; local134--) {
				@Pc(145) boolean local145 = this.aClass551Array1[local134].method31332(arg0, this.aClass551_1);
				this.aBoolean911 |= !local145;
				local121 |= local145;
			}
		}
		if (arg2 == 0 || !arg0.method20669()) {
			this.aClass105_7 = null;
		} else if (this.aClass105_7 == null && this.anInt5144 * -895914123 >= 0) {
			this.method31281(arg0, 855051344);
		}
		if (this.aClass549_1 != null && this.aClass549_1 != this) {
			this.aClass549_1.method31274((byte) 20);
			local121 |= this.aClass549_1.method31280(arg0, arg1, arg2, -1946038873);
		}
		return local121;
	}

	@OriginalMember(owner = "client!sg", name = "o", descriptor = "(Lclient!di;I)V")
	void method31281(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(7) boolean local7 = Class391.aClass480_111.method29975(this.anInt5144 * -895914123, -1403081456);
			if (local7) {
				arg0.method20765(16777215, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
				@Pc(25) Class232 local25 = Class232.method26043(Class391.aClass480_111, this.anInt5144 * -895914123, 0);
				this.aClass105_7 = arg0.method20753(local25, 1099776, 0, 255, 1);
				@Pc(38) byte[] local38 = this.aClass105_7.method7376();
				if (local38 == null) {
					this.aByteArray98 = null;
				} else {
					this.aByteArray98 = new byte[local38.length];
					System.arraycopy(local38, 0, this.aByteArray98, 0, local38.length);
				}
			}
		} catch (@Pc(59) Exception local59) {
		}
	}

	@OriginalMember(owner = "client!sg", name = "ai", descriptor = "()Z")
	public boolean method31282() {
		return this.aBoolean910;
	}

	@OriginalMember(owner = "client!sg", name = "ao", descriptor = "()Lclient!sg;")
	public Class549 method31283() {
		return this.aClass549_1;
	}

	@OriginalMember(owner = "client!sg", name = "v", descriptor = "(Lclient!sg;)V")
	public void method31284(@OriginalArg(0) Class549 arg0) {
		if (this.aBoolean910) {
			this.anInt5149 = this.anInt5147 * -1750759841;
		} else if (arg0 != null && arg0.aBoolean910) {
			this.anInt5149 = -846549981 - arg0.anInt5147 * -1750759841;
		} else {
			this.anInt5149 = 0;
		}
		this.aBoolean910 = true;
		this.aClass549_1 = arg0;
		this.anInt5147 = 0;
	}

	@OriginalMember(owner = "client!sg", name = "u", descriptor = "(Lclient!sg;I)V")
	public void method31285(@OriginalArg(0) Class549 arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean910) {
			this.anInt5149 = this.anInt5147 * -1750759841;
		} else if (arg0 != null && arg0.aBoolean910) {
			this.anInt5149 = -846549981 - arg0.anInt5147 * -1750759841;
		} else {
			this.anInt5149 = 0;
		}
		this.aBoolean910 = true;
		this.aClass549_1 = arg0;
		this.anInt5147 = 0;
	}

	@OriginalMember(owner = "client!sg", name = "d", descriptor = "(II)V")
	public void method31291(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean910) {
		}
		this.anInt5147 = ((arg1 - this.anInt5149 * 1851926389) * arg0 / 255 + this.anInt5149 * 1851926389) * 2049817155;
	}

	@OriginalMember(owner = "client!sg", name = "z", descriptor = "(II)V")
	public void method31292(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean910) {
		}
		this.anInt5147 = ((arg1 - this.anInt5149 * 1851926389) * arg0 / 255 + this.anInt5149 * 1851926389) * 2049817155;
	}

	@OriginalMember(owner = "client!sg", name = "p", descriptor = "(II)V")
	public void method31293(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean910) {
		}
		this.anInt5147 = ((arg1 - this.anInt5149 * 1851926389) * arg0 / 255 + this.anInt5149 * 1851926389) * 2049817155;
	}

	@OriginalMember(owner = "client!sg", name = "j", descriptor = "(Lclient!di;IIIIIIIIII)V")
	public void method31294(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.method31296(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, 0, arg9, true, false, -767356145);
	}

	@OriginalMember(owner = "client!sg", name = "y", descriptor = "(Lclient!sg;)V")
	public void method31295(@OriginalArg(0) Class549 arg0) {
		if (this.aBoolean910) {
			this.anInt5149 = this.anInt5147 * -1750759841;
		} else if (arg0 != null && arg0.aBoolean910) {
			this.anInt5149 = -846549981 - arg0.anInt5147 * -1750759841;
		} else {
			this.anInt5149 = 0;
		}
		this.aBoolean910 = true;
		this.aClass549_1 = arg0;
		this.anInt5147 = 0;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lclient!di;IIIIIIIIIZZI)V")
	public void method31296(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) int arg12) {
		@Pc(1) int local1 = 0;
		if (this.aBoolean910) {
			local1 = this.anInt5147 * -931339669;
		}
		if (this.aClass549_1 == null) {
			if (this.anInt5137 * 84686143 == -1) {
				arg0.method20722(arg2, arg3, arg4, arg5, arg9 | 0xFF000000, 0);
			}
			this.method31311(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, local1, 1362897005);
			return;
		}
		@Pc(14) Class549 local14 = this;
		@Pc(17) Class549 local17 = this.aClass549_1;
		if (this.hashCode() > local17.hashCode()) {
			local14 = this.aClass549_1;
			local17 = this;
			local1 = 255 - local1;
		}
		local14.method31311(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, local1, -311048801);
		local17.method31311(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, false, arg11, 255 - local1, 1373257576);
	}

	@OriginalMember(owner = "client!sg", name = "k", descriptor = "(Lclient!di;IIIIB)V")
	void method31297(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte arg5) {
		@Pc(2) Class471 local2 = arg0.method20897();
		@Pc(6) Class471 local6 = new Class471();
		local6.method29775(0.0F, 0.0F, 0.0F);
		local6.method29774(0.0F, -1.0F, 0.0F, Class467.method29716(-arg2 & 0x3FFF));
		local6.method29774(-1.0F, 0.0F, 0.0F, Class467.method29716(-arg1 & 0x3FFF));
		local6.method29774(0.0F, 0.0F, -1.0F, Class467.method29716(-arg3 & 0x3FFF));
		arg0.method20759(local6);
		@Pc(48) Class471 local48 = new Class471();
		if (this.anInt5148 * -951328813 != arg4) {
			this.aClass105_7.method7348((byte) arg4, this.aByteArray98);
			this.anInt5148 = arg4 * 94687323;
		}
		this.aClass105_7.method7359(local48, null, 0);
		arg0.method20759(local2);
	}

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "()V")
	public void method31298() {
		this.aBoolean910 = false;
		this.aClass549_1 = null;
		this.anInt5147 = 0;
	}

	@OriginalMember(owner = "client!sg", name = "n", descriptor = "(Lclient!sg;)V")
	public void method31299(@OriginalArg(0) Class549 arg0) {
		if (this.aBoolean910) {
			this.anInt5149 = this.anInt5147 * -1750759841;
		} else if (arg0 != null && arg0.aBoolean910) {
			this.anInt5149 = -846549981 - arg0.anInt5147 * -1750759841;
		} else {
			this.anInt5149 = 0;
		}
		this.aBoolean910 = true;
		this.aClass549_1 = arg0;
		this.anInt5147 = 0;
	}

	@OriginalMember(owner = "client!sg", name = "ay", descriptor = "()Z")
	public boolean method31300() {
		return this.aBoolean910;
	}

	@OriginalMember(owner = "client!sg", name = "al", descriptor = "(Lclient!di;)V")
	void method31301(@OriginalArg(0) Class102 arg0) {
		try {
			@Pc(7) boolean local7 = Class391.aClass480_111.method29975(this.anInt5144 * -895914123, -1403081456);
			if (local7) {
				arg0.method20765(16777215, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
				@Pc(25) Class232 local25 = Class232.method26043(Class391.aClass480_111, this.anInt5144 * -895914123, 0);
				this.aClass105_7 = arg0.method20753(local25, 1099776, 0, 255, 1);
				@Pc(38) byte[] local38 = this.aClass105_7.method7376();
				if (local38 == null) {
					this.aByteArray98 = null;
				} else {
					this.aByteArray98 = new byte[local38.length];
					System.arraycopy(local38, 0, this.aByteArray98, 0, local38.length);
				}
			}
		} catch (@Pc(59) Exception local59) {
		}
	}

	@OriginalMember(owner = "client!sg", name = "aq", descriptor = "()Z")
	public boolean method31302() {
		return this.aBoolean910;
	}

	@OriginalMember(owner = "client!sg", name = "af", descriptor = "(Lclient!di;IIIIIIIII)V")
	public void method31303(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.method31296(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, 0, arg9, true, false, -767356145);
	}

	@OriginalMember(owner = "client!sg", name = "ak", descriptor = "(Lclient!di;IIIIIIIII)V")
	public void method31304(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.method31296(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, 0, arg9, true, false, -767356145);
	}

	@OriginalMember(owner = "client!sg", name = "ac", descriptor = "()Lclient!sg;")
	public Class549 method31305() {
		return this.aClass549_1;
	}

	@OriginalMember(owner = "client!sg", name = "ag", descriptor = "(Lclient!di;II)Z")
	public boolean method31306(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt5142 * -1972719601 != arg1) {
			this.anInt5142 = arg1 * -769769745;
			@Pc(14) int local14 = Class548.method31273(arg1, -37293324);
			if (local14 > 512) {
				local14 = 512;
			}
			if (local14 <= 0) {
				local14 = 1;
			}
			if (local14 != this.anInt5138 * -597540131) {
				this.anInt5138 = local14 * -192174731;
				this.aClass99_34 = null;
			}
			if (this.aClass551Array2 != null) {
				this.anInt5139 = 0;
				@Pc(48) int[] local48 = new int[this.aClass551Array2.length];
				for (@Pc(50) int local50 = 0; local50 < this.aClass551Array2.length; local50++) {
					@Pc(60) Class551 local60 = this.aClass551Array2[local50];
					if (local60.method31322(this.anInt5136 * -1790108319, this.anInt5146 * 835805085, this.anInt5141 * 1380094203, this.anInt5142 * -1972719601)) {
						local48[this.anInt5139 * -1070538567] = local60.anInt5163;
						this.aClass551Array1[(this.anInt5139 += -540727927) * -1070538567 - 1] = local60;
					}
				}
				Class607.method32176(local48, this.aClass551Array1, 0, this.anInt5139 * -1070538567 - 1, 873555441);
			}
			this.aBoolean911 = true;
		}
		@Pc(121) boolean local121 = false;
		if (this.aBoolean911) {
			this.aBoolean911 = false;
			for (@Pc(134) int local134 = this.anInt5139 * -1070538567 - 1; local134 >= 0; local134--) {
				@Pc(145) boolean local145 = this.aClass551Array1[local134].method31332(arg0, this.aClass551_1);
				this.aBoolean911 |= !local145;
				local121 |= local145;
			}
		}
		if (arg2 == 0 || !arg0.method20669()) {
			this.aClass105_7 = null;
		} else if (this.aClass105_7 == null && this.anInt5144 * -895914123 >= 0) {
			this.method31281(arg0, 1887115142);
		}
		if (this.aClass549_1 != null && this.aClass549_1 != this) {
			this.aClass549_1.method31274((byte) 92);
			local121 |= this.aClass549_1.method31280(arg0, arg1, arg2, -2100925853);
		}
		return local121;
	}

	@OriginalMember(owner = "client!sg", name = "ab", descriptor = "(Lclient!di;II)Z")
	public boolean method31307(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt5142 * -1972719601 != arg1) {
			this.anInt5142 = arg1 * -769769745;
			@Pc(14) int local14 = Class548.method31273(arg1, -135615429);
			if (local14 > 512) {
				local14 = 512;
			}
			if (local14 <= 0) {
				local14 = 1;
			}
			if (local14 != this.anInt5138 * -597540131) {
				this.anInt5138 = local14 * -192174731;
				this.aClass99_34 = null;
			}
			if (this.aClass551Array2 != null) {
				this.anInt5139 = 0;
				@Pc(48) int[] local48 = new int[this.aClass551Array2.length];
				for (@Pc(50) int local50 = 0; local50 < this.aClass551Array2.length; local50++) {
					@Pc(60) Class551 local60 = this.aClass551Array2[local50];
					if (local60.method31322(this.anInt5136 * -1790108319, this.anInt5146 * 835805085, this.anInt5141 * 1380094203, this.anInt5142 * -1972719601)) {
						local48[this.anInt5139 * -1070538567] = local60.anInt5163;
						this.aClass551Array1[(this.anInt5139 += -540727927) * -1070538567 - 1] = local60;
					}
				}
				Class607.method32176(local48, this.aClass551Array1, 0, this.anInt5139 * -1070538567 - 1, 1134531823);
			}
			this.aBoolean911 = true;
		}
		@Pc(121) boolean local121 = false;
		if (this.aBoolean911) {
			this.aBoolean911 = false;
			for (@Pc(134) int local134 = this.anInt5139 * -1070538567 - 1; local134 >= 0; local134--) {
				@Pc(145) boolean local145 = this.aClass551Array1[local134].method31332(arg0, this.aClass551_1);
				this.aBoolean911 |= !local145;
				local121 |= local145;
			}
		}
		if (arg2 == 0 || !arg0.method20669()) {
			this.aClass105_7 = null;
		} else if (this.aClass105_7 == null && this.anInt5144 * -895914123 >= 0) {
			this.method31281(arg0, 761449309);
		}
		if (this.aClass549_1 != null && this.aClass549_1 != this) {
			this.aClass549_1.method31274((byte) 5);
			local121 |= this.aClass549_1.method31280(arg0, arg1, arg2, -884366123);
		}
		return local121;
	}

	@OriginalMember(owner = "client!sg", name = "ah", descriptor = "(Lclient!di;)V")
	void method31308(@OriginalArg(0) Class102 arg0) {
		try {
			@Pc(7) boolean local7 = Class391.aClass480_111.method29975(this.anInt5144 * -895914123, -1403081456);
			if (local7) {
				arg0.method20765(16777215, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
				@Pc(25) Class232 local25 = Class232.method26043(Class391.aClass480_111, this.anInt5144 * -895914123, 0);
				this.aClass105_7 = arg0.method20753(local25, 1099776, 0, 255, 1);
				@Pc(38) byte[] local38 = this.aClass105_7.method7376();
				if (local38 == null) {
					this.aByteArray98 = null;
				} else {
					this.aByteArray98 = new byte[local38.length];
					System.arraycopy(local38, 0, this.aByteArray98, 0, local38.length);
				}
			}
		} catch (@Pc(59) Exception local59) {
		}
	}

	@OriginalMember(owner = "client!sg", name = "c", descriptor = "(Lclient!sg;)V")
	public void method31309(@OriginalArg(0) Class549 arg0) {
		if (this.aBoolean910) {
			this.anInt5149 = this.anInt5147 * -1750759841;
		} else if (arg0 != null && arg0.aBoolean910) {
			this.anInt5149 = -846549981 - arg0.anInt5147 * -1750759841;
		} else {
			this.anInt5149 = 0;
		}
		this.aBoolean910 = true;
		this.aClass549_1 = arg0;
		this.anInt5147 = 0;
	}

	@OriginalMember(owner = "client!sg", name = "am", descriptor = "(Lclient!di;IIIIIIIII)V")
	public void method31310(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.method31296(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, 0, arg9, true, false, -767356145);
	}

	@OriginalMember(owner = "client!sg", name = "s", descriptor = "(Lclient!di;IIIIIIIIIZZII)V")
	void method31311(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		@Pc(3) int local3 = 255 - arg12;
		arg0.method20744();
		arg0.method20782();
		if (this.aClass105_7 == null) {
			arg0.method20714(2, 0);
			arg7 = arg7 + arg1 & 0x3FFF;
			if (this.anInt5137 * 84686143 == -1 || this.anInt5138 * -597540131 == 0) {
				arg0.method20722(arg2, arg3, arg4, arg5, local3 << 24 | arg9, arg10 ? 0 : 1);
			} else {
				@Pc(40) Class227 local40 = aClass235_7.method26120(this.anInt5137 * 84686143, 73831368);
				if (this.aClass99_34 == null && Class628.anInterface23_10.method7763(Class616.aClass616_2, local40.anInt3652 * 343031549, -1, Class608.aClass608_4 == local40.aClass608_2 ? Class617.aClass617_2 : Class617.aClass617_3, 0.7F, this.anInt5138 * -597540131, this.anInt5138 * -597540131, false, (byte) -65)) {
					@Pc(112) int[] local112 = Class608.aClass608_4 == local40.aClass608_2 ? Class628.anInterface23_10.method7756(Class616.aClass616_2, local40.anInt3652 * 343031549, 0.7F, this.anInt5138 * -597540131, this.anInt5138 * -597540131, false, 1707164364) : Class628.anInterface23_10.method7755(Class616.aClass616_2, local40.anInt3652 * 343031549, 0.7F, this.anInt5138 * -597540131, this.anInt5138 * -597540131, false, (byte) 68);
					this.anInt5140 = local112[0] * 1961907725;
					this.anInt5143 = local112[local112.length - 1] * -1720677973;
					this.aClass99_34 = arg0.method20741(local112, 0, local40.anInt3654 * 1615444793, local40.anInt3654 * 1615444793, local40.anInt3654 * 1615444793, -1657536790);
				}
				@Pc(161) int local161 = local3 == 255 ? (Class608.aClass608_4 == local40.aClass608_2 ? 1 : 0) : 1;
				if (local161 == 1 && arg10) {
					arg0.method20722(arg2, arg3, arg4, arg5, arg9, 0);
				}
				if (this.aClass99_34 != null) {
					@Pc(184) int local184 = arg5 * arg6 / -4096;
					@Pc(196) int local196;
					for (local196 = (arg4 - arg5) / 2 + arg7 * arg5 / 4096; local196 > arg5; local196 -= arg5) {
					}
					while (local196 < 0) {
						local196 += arg5;
					}
					@Pc(219) int local219;
					if (Class590.aClass590_3 == this.aClass590_1) {
						for (local219 = local196 - arg5; local219 < arg4; local219 += arg5) {
							this.aClass99_34.method18229(local219 + arg2, local184 + arg3, arg5, arg5, 0, local3 << 24 | 0xFFFFFF, local161);
						}
						if ((this.anInt5140 * 651880645 & 0xFF000000) != 0) {
							arg0.method20716(0, 0, arg4, arg3 + 1 + local184, this.anInt5140 * 651880645, (byte) 34);
						}
						if ((this.anInt5143 * 2061904131 & 0xFF000000) != 0) {
							arg0.method20716(0, local184 + arg3 + arg5, arg4, arg5 - (arg3 + local184 + arg5), this.anInt5143 * 2061904131, (byte) 63);
						}
					} else {
						while (local184 > arg5) {
							local184 -= arg5;
						}
						while (local184 < 0) {
							local184 += arg5;
						}
						for (local219 = local196 - arg5; local219 < arg4; local219 += arg5) {
							for (@Pc(323) int local323 = local184 - arg5; local323 < arg5; local323 += arg5) {
								this.aClass99_34.method18229(local219 + arg2, local323 + arg3, arg5, arg5, 0, local3 << 24 | 0xFFFFFF, local161);
							}
						}
					}
				}
			}
		} else if (arg11) {
			@Pc(377) Class487 local377 = arg0.method20763();
			@Pc(380) Class487 local380 = arg0.method20763();
			local377.aFloatArray114[2] = local377.aFloatArray114[3];
			local377.aFloatArray114[6] = local377.aFloatArray114[7];
			local377.aFloatArray114[10] = local377.aFloatArray114[11];
			local377.aFloatArray114[14] = local377.aFloatArray114[15];
			arg0.method20933(local377);
			this.method31297(arg0, arg6, arg7, arg8, arg12, (byte) 60);
			arg0.method20933(local380);
		} else {
			if (arg10) {
				arg0.method20714(3, arg9);
			}
			this.method31297(arg0, arg6, arg7, arg8, arg12, (byte) 49);
		}
		for (@Pc(448) int local448 = this.anInt5139 * -1070538567 - 1; local448 >= 0; local448--) {
			this.aClass551Array1[local448].method31324(arg0, arg2, arg3, arg4, arg5, arg6, arg7, this.anInt5136 * -1790108319, this.anInt5146 * 835805085, this.anInt5141 * 1380094203, local3);
		}
		arg0.method20714(2, 0);
		arg0.method20746();
	}

	@OriginalMember(owner = "client!sg", name = "at", descriptor = "(Lclient!di;IIIIIIIIIZZ)V")
	public void method31312(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) boolean arg11) {
		@Pc(1) int local1 = 0;
		if (this.aBoolean910) {
			local1 = this.anInt5147 * -931339669;
		}
		if (this.aClass549_1 == null) {
			if (this.anInt5137 * 84686143 == -1) {
				arg0.method20722(arg2, arg3, arg4, arg5, arg9 | 0xFF000000, 0);
			}
			this.method31311(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, local1, -2100859288);
			return;
		}
		@Pc(14) Class549 local14 = this;
		@Pc(17) Class549 local17 = this.aClass549_1;
		if (this.hashCode() > local17.hashCode()) {
			local14 = this.aClass549_1;
			local17 = this;
			local1 = 255 - local1;
		}
		local14.method31311(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, local1, -342418231);
		local17.method31311(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, false, arg11, 255 - local1, -2101474745);
	}

	@OriginalMember(owner = "client!sg", name = "ad", descriptor = "(Lclient!di;IIII)V")
	void method31313(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) Class471 local2 = arg0.method20897();
		@Pc(6) Class471 local6 = new Class471();
		local6.method29775(0.0F, 0.0F, 0.0F);
		local6.method29774(0.0F, -1.0F, 0.0F, Class467.method29716(-arg2 & 0x3FFF));
		local6.method29774(-1.0F, 0.0F, 0.0F, Class467.method29716(-arg1 & 0x3FFF));
		local6.method29774(0.0F, 0.0F, -1.0F, Class467.method29716(-arg3 & 0x3FFF));
		arg0.method20759(local6);
		@Pc(48) Class471 local48 = new Class471();
		if (this.anInt5148 * -951328813 != arg4) {
			this.aClass105_7.method7348((byte) arg4, this.aByteArray98);
			this.anInt5148 = arg4 * 94687323;
		}
		this.aClass105_7.method7359(local48, null, 0);
		arg0.method20759(local2);
	}

	@OriginalMember(owner = "client!sg", name = "av", descriptor = "(Lclient!di;IIII)V")
	void method31314(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) Class471 local2 = arg0.method20897();
		@Pc(6) Class471 local6 = new Class471();
		local6.method29775(0.0F, 0.0F, 0.0F);
		local6.method29774(0.0F, -1.0F, 0.0F, Class467.method29716(-arg2 & 0x3FFF));
		local6.method29774(-1.0F, 0.0F, 0.0F, Class467.method29716(-arg1 & 0x3FFF));
		local6.method29774(0.0F, 0.0F, -1.0F, Class467.method29716(-arg3 & 0x3FFF));
		arg0.method20759(local6);
		@Pc(48) Class471 local48 = new Class471();
		if (this.anInt5148 * -951328813 != arg4) {
			this.aClass105_7.method7348((byte) arg4, this.aByteArray98);
			this.anInt5148 = arg4 * 94687323;
		}
		this.aClass105_7.method7359(local48, null, 0);
		arg0.method20759(local2);
	}
}
