package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ajc")
public final class Class120_Sub1_Sub2_Sub1 extends Class120_Sub1_Sub2 implements Interface60 {

	@OriginalMember(owner = "client!ajc", name = "s", descriptor = "[I")
	static final int[] anIntArray176 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!ajc", name = "k", descriptor = "[I")
	static final int[] anIntArray177 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!ajc", name = "q", descriptor = "Lclient!uc;")
	Class589 aClass589_2;

	@OriginalMember(owner = "client!ajc", name = "x", descriptor = "Lclient!aod;")
	Class41_Sub3 aClass41_Sub3_3;

	@OriginalMember(owner = "client!ajc", name = "h", descriptor = "I")
	final int anInt1433;

	@OriginalMember(owner = "client!ajc", name = "p", descriptor = "Z")
	final boolean aBoolean291;

	@OriginalMember(owner = "client!ajc", name = "z", descriptor = "B")
	final byte aByte32;

	@OriginalMember(owner = "client!ajc", name = "d", descriptor = "B")
	final byte aByte31;

	@OriginalMember(owner = "client!ajc", name = "v", descriptor = "Z")
	boolean aBoolean292;

	@OriginalMember(owner = "client!ajc", name = "y", descriptor = "Z")
	boolean aBoolean289;

	@OriginalMember(owner = "client!ajc", name = "n", descriptor = "Z")
	boolean aBoolean290;

	@OriginalMember(owner = "client!ajc", name = "c", descriptor = "I")
	int anInt1434;

	@OriginalMember(owner = "client!ajc", name = "w", descriptor = "Lclient!dn;")
	Class105 aClass105_1;

	@OriginalMember(owner = "client!ajc", name = "r", descriptor = "Lclient!arx;")
	Class80_Sub1_Sub10 aClass80_Sub1_Sub10_1;

	@OriginalMember(owner = "client!ajc", name = "bu", descriptor = "(II)I")
	static int method12498(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == Class607.aClass607_3.anInt5396 * 1323580581 || Class607.aClass607_5.anInt5396 * 1323580581 == arg0 ? anIntArray177[arg1 & 0x3] : anIntArray176[arg1 & 0x3];
	}

	@OriginalMember(owner = "client!ajc", name = "bm", descriptor = "(II)I")
	static int method12499(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == Class607.aClass607_3.anInt5396 * 1323580581 || Class607.aClass607_5.anInt5396 * 1323580581 == arg0 ? anIntArray177[arg1 & 0x3] : anIntArray176[arg1 & 0x3];
	}

	@OriginalMember(owner = "client!ajc", name = "g", descriptor = "(I)V")
	public static void method12503(@OriginalArg(0) int arg0) {
		if (IcmpService_Sub1.anIcmpService_Sub1_1 == null) {
			return;
		}
		try {
			IcmpService_Sub1.anIcmpService_Sub1_1.quit();
		} catch (@Pc(7) Throwable local7) {
		}
		IcmpService_Sub1.anIcmpService_Sub1_1 = null;
	}

	@OriginalMember(owner = "client!ajc", name = "<init>", descriptor = "(Lclient!te;Lclient!di;Lclient!aod;Lclient!vv;IIIIIZIIZLclient!oc;)V")
	public Class120_Sub1_Sub2_Sub1(@OriginalArg(0) Class570 arg0, @OriginalArg(1) Class102 arg1, @OriginalArg(2) Class41_Sub3 arg2, @OriginalArg(3) Class625 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) Class457 arg13) {
		super(arg0, arg6, arg7, arg8, arg4, arg5, Class103_Sub21.method8569(arg10, arg11, 1162663537), arg13);
		this.aClass41_Sub3_3 = arg2;
		this.anInt1433 = arg3.anInt5499 * 1182821437;
		this.aBoolean291 = arg9;
		this.aByte32 = (byte) arg10;
		this.aByte31 = (byte) arg11;
		this.aBoolean292 = arg3.anInt5506 * 350558937 != 0 && !arg9;
		this.aBoolean289 = arg12;
		this.aBoolean290 = arg1.method20667() && arg3.aBoolean951 && !this.aBoolean291 && Class703.aClass80_Sub37_49.aClass165_Sub22_1.method16266(1482776068) != 0;
		this.anInt1434 = arg7 * 800723715;
		@Pc(73) int local73 = 2048;
		if (this.aBoolean289) {
			local73 |= 0x10000;
		}
		if (arg3.aBoolean953) {
			local73 |= 0x80000;
		}
		@Pc(95) Class44 local95 = this.method12494(arg1, local73, this.aBoolean290, (byte) 50);
		if (local95 != null) {
			this.aClass105_1 = (Class105) local95.anObject1;
			this.aClass80_Sub1_Sub10_1 = (Class80_Sub1_Sub10) local95.anObject2;
			if (this.aBoolean289 || arg3.aBoolean953) {
				this.aClass105_1 = this.aClass105_1.method7324((byte) 0, local73, false);
				if (arg3.aBoolean953) {
					@Pc(128) Class535 local128 = client.aClass539_1.method30897(-2077430807);
					this.aClass105_1.method7380(local128.anInt5078 * -228215283, local128.anInt5080 * -1186866959, local128.anInt5079 * -1890181955, local128.anInt5077 * 140891643);
				}
			}
		}
		this.method24581(1, (byte) 14);
	}

	@OriginalMember(owner = "client!ajc", name = "a", descriptor = "()I")
	@Override
	public int method13828() {
		return this.anInt1433 * -134520549;
	}

	@OriginalMember(owner = "client!ajc", name = "bo", descriptor = "(I)Z")
	@Override
	boolean method24567(@OriginalArg(0) int arg0) {
		if (this.aClass105_1 == null) {
			return true;
		} else {
			return !this.aClass105_1.method7383();
		}
	}

	@OriginalMember(owner = "client!ajc", name = "bc", descriptor = "(I)Z")
	@Override
	boolean method24565(@OriginalArg(0) int arg0) {
		return this.aClass105_1 == null ? false : this.aClass105_1.method7395();
	}

	@OriginalMember(owner = "client!ajc", name = "bb", descriptor = "(I)I")
	@Override
	public int method24578(@OriginalArg(0) int arg0) {
		return this.aClass105_1 == null ? 0 : this.aClass105_1.method7366();
	}

	@OriginalMember(owner = "client!ajc", name = "fw", descriptor = "(Lclient!di;III)Z")
	@Override
	boolean method24583(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) Class472 local10 = ((Class625) this.aClass41_Sub3_3.method18054(this.anInt1433 * -134520549, -1037447949)).aClass472_2;
		if (local10 != null) {
			return arg0.method20733(arg1, arg2, this.method24526(), local10, 92868112);
		}
		@Pc(27) Class105 local27 = this.method12497(arg0, 131072, -1738146010);
		if (local27 == null) {
			return false;
		} else {
			@Pc(32) Class471 local32 = this.method24526();
			return local27.method7360(arg1, arg2, local32, false, 0);
		}
	}

	@OriginalMember(owner = "client!ajc", name = "bi", descriptor = "(Lclient!di;IZB)Lclient!abt;")
	Class44 method12494(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) byte arg3) {
		@Pc(9) Class625 local9 = (Class625) this.aClass41_Sub3_3.method18054(this.anInt1433 * -134520549, 1918065766);
		@Pc(19) Class100 local19;
		@Pc(25) Class100 local25;
		if (this.aBoolean291) {
			local19 = this.aClass570_23.aClass100Array2[this.aByte100];
			local25 = this.aClass570_23.aClass100Array3[0];
		} else {
			local19 = this.aClass570_23.aClass100Array3[this.aByte100];
			if (this.aByte100 < 3) {
				local25 = this.aClass570_23.aClass100Array3[this.aByte100 + 1];
			} else {
				local25 = null;
			}
		}
		@Pc(53) Class463 local53 = this.method24552().aClass463_61;
		return local9.method32460(arg0, arg1, this.aByte32, this.aByte31, local19, local25, (int) local53.aFloat297, this.anInt1434 * -1199738965, (int) local53.aFloat296, arg2, null, (byte) -21);
	}

	@OriginalMember(owner = "client!ajc", name = "fz", descriptor = "(Lclient!di;I)Lclient!uc;")
	@Override
	public Class589 method24573(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class463 local3 = this.method24552().aClass463_61;
		if (this.aClass589_2 == null) {
			this.aClass589_2 = Class67.method1243((int) local3.aFloat297, (int) local3.aFloat295, (int) local3.aFloat296, this.method12497(arg0, 0, -1688091848), (byte) 15);
		}
		return this.aClass589_2;
	}

	@OriginalMember(owner = "client!ajc", name = "fn", descriptor = "(Lclient!di;I)Lclient!tj;")
	@Override
	Class573 method24571(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass105_1 == null) {
			return null;
		}
		@Pc(8) Class471 local8 = this.method24526();
		@Pc(13) Class573 local13 = Class454.method29307(this.aBoolean292, 1003241284);
		@Pc(24) Class472 local24 = ((Class625) this.aClass41_Sub3_3.method18054(this.anInt1433 * -134520549, -1247997178)).aClass472_2;
		if (local24 == null) {
			this.aClass105_1.method7359(local8, this.aClass246Array21[0], 0);
		} else {
			this.aClass105_1.method7359(local8, null, 0);
			arg0.method20735(local8, this.aClass246Array21[0], local24);
		}
		return local13;
	}

	@OriginalMember(owner = "client!ajc", name = "bq", descriptor = "(Lclient!di;I)Lclient!dn;")
	Class105 method12495(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass105_1 != null && arg0.method21083(this.aClass105_1.method7326(), arg1) == 0) {
			return this.aClass105_1;
		} else {
			@Pc(19) Class44 local19 = this.method12494(arg0, arg1, false, (byte) 71);
			return local19 == null ? null : (Class105) local19.anObject1;
		}
	}

	@OriginalMember(owner = "client!ajc", name = "fo", descriptor = "(B)Z")
	@Override
	boolean method24566(@OriginalArg(0) byte arg0) {
		return this.aBoolean289;
	}

	@OriginalMember(owner = "client!ajc", name = "fy", descriptor = "(Lclient!di;Lclient!alf;IIIZI)V")
	@Override
	void method24569(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6) {
		if (arg1 instanceof Class120_Sub1_Sub2_Sub1) {
			@Pc(5) Class120_Sub1_Sub2_Sub1 local5 = (Class120_Sub1_Sub2_Sub1) arg1;
			if (this.aClass105_1 != null && local5.aClass105_1 != null) {
				this.aClass105_1.method7353(local5.aClass105_1, arg2, arg3, arg4, arg5);
			}
		} else if (arg1 instanceof Class120_Sub1_Sub1_Sub3) {
			@Pc(28) Class120_Sub1_Sub1_Sub3 local28 = (Class120_Sub1_Sub1_Sub3) arg1;
			if (this.aClass105_1 != null && local28.aClass105_2 != null) {
				this.aClass105_1.method7353(local28.aClass105_2, arg2, arg3, arg4, arg5);
			}
		}
	}

	@OriginalMember(owner = "client!ajc", name = "fb", descriptor = "(I)V")
	@Override
	void method24570(@OriginalArg(0) int arg0) {
		this.aBoolean289 = false;
		if (this.aClass105_1 != null) {
			this.aClass105_1.method7422(this.aClass105_1.method7326() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!ajc", name = "t", descriptor = "(B)I")
	@Override
	public int method13834(@OriginalArg(0) byte arg0) {
		return this.anInt1433 * -134520549;
	}

	@OriginalMember(owner = "client!ajc", name = "r", descriptor = "()Z")
	@Override
	public boolean method13833() {
		return this.aBoolean290;
	}

	@OriginalMember(owner = "client!ajc", name = "i", descriptor = "(Lclient!di;I)V")
	@Override
	public void method13831(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) Class80_Sub1_Sub10 local1 = null;
		if (this.aClass80_Sub1_Sub10_1 == null && this.aBoolean290) {
			@Pc(15) Class44 local15 = this.method12494(arg0, 262144, true, (byte) 34);
			local1 = (Class80_Sub1_Sub10) (local15 == null ? null : local15.anObject2);
		} else {
			local1 = this.aClass80_Sub1_Sub10_1;
			this.aClass80_Sub1_Sub10_1 = null;
		}
		@Pc(34) Class463 local34 = this.method24552().aClass463_61;
		if (local1 != null) {
			this.aClass570_23.method31587(local1, this.aByte100, (int) local34.aFloat297, (int) local34.aFloat296, null, 1299447874);
		}
	}

	@OriginalMember(owner = "client!ajc", name = "u", descriptor = "(I)V")
	@Override
	public void method13821(@OriginalArg(0) int arg0) {
		if (this.aClass105_1 != null) {
			this.aClass105_1.method7404();
		}
	}

	@OriginalMember(owner = "client!ajc", name = "m", descriptor = "(Lclient!di;I)V")
	@Override
	public void method13825(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) Class80_Sub1_Sub10 local1 = null;
		if (this.aClass80_Sub1_Sub10_1 == null && this.aBoolean290) {
			@Pc(14) Class44 local14 = this.method12494(arg0, 262144, true, (byte) 89);
			local1 = (Class80_Sub1_Sub10) (local14 == null ? null : local14.anObject2);
		} else {
			local1 = this.aClass80_Sub1_Sub10_1;
			this.aClass80_Sub1_Sub10_1 = null;
		}
		@Pc(33) Class463 local33 = this.method24552().aClass463_61;
		if (local1 != null) {
			this.aClass570_23.method31588(local1, this.aByte100, (int) local33.aFloat297, (int) local33.aFloat296, null, 1137786912);
		}
	}

	@OriginalMember(owner = "client!ajc", name = "l", descriptor = "(I)Z")
	@Override
	public boolean method13822(@OriginalArg(0) int arg0) {
		return this.aBoolean290;
	}

	@OriginalMember(owner = "client!ajc", name = "ca", descriptor = "()Z")
	@Override
	boolean method24616() {
		return this.aClass105_1 == null ? false : this.aClass105_1.method7395();
	}

	@OriginalMember(owner = "client!ajc", name = "gh", descriptor = "(Lclient!di;Lclient!alf;IIIZ)V")
	@Override
	void method24600(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (arg1 instanceof Class120_Sub1_Sub2_Sub1) {
			@Pc(5) Class120_Sub1_Sub2_Sub1 local5 = (Class120_Sub1_Sub2_Sub1) arg1;
			if (this.aClass105_1 != null && local5.aClass105_1 != null) {
				this.aClass105_1.method7353(local5.aClass105_1, arg2, arg3, arg4, arg5);
			}
		} else if (arg1 instanceof Class120_Sub1_Sub1_Sub3) {
			@Pc(28) Class120_Sub1_Sub1_Sub3 local28 = (Class120_Sub1_Sub1_Sub3) arg1;
			if (this.aClass105_1 != null && local28.aClass105_2 != null) {
				this.aClass105_1.method7353(local28.aClass105_2, arg2, arg3, arg4, arg5);
			}
		}
	}

	@OriginalMember(owner = "client!ajc", name = "b", descriptor = "()I")
	@Override
	public int method13843() {
		return this.aByte31;
	}

	@OriginalMember(owner = "client!ajc", name = "o", descriptor = "()I")
	@Override
	public int method13824() {
		return this.anInt1433 * -134520549;
	}

	@OriginalMember(owner = "client!ajc", name = "j", descriptor = "()I")
	@Override
	public int method13842() {
		return this.anInt1433 * -134520549;
	}

	@OriginalMember(owner = "client!ajc", name = "cv", descriptor = "(Lclient!di;IZ)Lclient!abt;")
	Class44 method12496(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(9) Class625 local9 = (Class625) this.aClass41_Sub3_3.method18054(this.anInt1433 * -134520549, 79281514);
		@Pc(19) Class100 local19;
		@Pc(25) Class100 local25;
		if (this.aBoolean291) {
			local19 = this.aClass570_23.aClass100Array2[this.aByte100];
			local25 = this.aClass570_23.aClass100Array3[0];
		} else {
			local19 = this.aClass570_23.aClass100Array3[this.aByte100];
			if (this.aByte100 < 3) {
				local25 = this.aClass570_23.aClass100Array3[this.aByte100 + 1];
			} else {
				local25 = null;
			}
		}
		@Pc(53) Class463 local53 = this.method24552().aClass463_61;
		return local9.method32460(arg0, arg1, this.aByte32, this.aByte31, local19, local25, (int) local53.aFloat297, this.anInt1434 * -1199738965, (int) local53.aFloat296, arg2, null, (byte) 12);
	}

	@OriginalMember(owner = "client!ajc", name = "k", descriptor = "()I")
	@Override
	public int method13818() {
		return this.aByte32;
	}

	@OriginalMember(owner = "client!ajc", name = "bx", descriptor = "(Lclient!di;II)Lclient!dn;")
	Class105 method12497(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass105_1 != null && arg0.method21083(this.aClass105_1.method7326(), arg1) == 0) {
			return this.aClass105_1;
		} else {
			@Pc(19) Class44 local19 = this.method12494(arg0, arg1, false, (byte) 42);
			return local19 == null ? null : (Class105) local19.anObject1;
		}
	}

	@OriginalMember(owner = "client!ajc", name = "w", descriptor = "()V")
	@Override
	public void method13830() {
		if (this.aClass105_1 != null) {
			this.aClass105_1.method7404();
		}
	}

	@OriginalMember(owner = "client!ajc", name = "fl", descriptor = "(Lclient!di;)Lclient!tj;")
	@Override
	Class573 method24597(@OriginalArg(0) Class102 arg0) {
		if (this.aClass105_1 == null) {
			return null;
		}
		@Pc(8) Class471 local8 = this.method24526();
		@Pc(13) Class573 local13 = Class454.method29307(this.aBoolean292, -9100748);
		@Pc(24) Class472 local24 = ((Class625) this.aClass41_Sub3_3.method18054(this.anInt1433 * -134520549, -865605154)).aClass472_2;
		if (local24 == null) {
			this.aClass105_1.method7359(local8, this.aClass246Array21[0], 0);
		} else {
			this.aClass105_1.method7359(local8, null, 0);
			arg0.method20735(local8, this.aClass246Array21[0], local24);
		}
		return local13;
	}

	@OriginalMember(owner = "client!ajc", name = "q", descriptor = "()Z")
	@Override
	public boolean method13839() {
		return this.aBoolean290;
	}

	@OriginalMember(owner = "client!ajc", name = "f", descriptor = "(I)I")
	@Override
	public int method13819(@OriginalArg(0) int arg0) {
		return this.aByte32;
	}

	@OriginalMember(owner = "client!ajc", name = "d", descriptor = "()Z")
	@Override
	public boolean method13836() {
		return true;
	}

	@OriginalMember(owner = "client!ajc", name = "z", descriptor = "(Lclient!di;)V")
	@Override
	public void method13837(@OriginalArg(0) Class102 arg0) {
		@Pc(1) Class80_Sub1_Sub10 local1 = null;
		if (this.aClass80_Sub1_Sub10_1 == null && this.aBoolean290) {
			@Pc(14) Class44 local14 = this.method12494(arg0, 262144, true, (byte) 56);
			local1 = (Class80_Sub1_Sub10) (local14 == null ? null : local14.anObject2);
		} else {
			local1 = this.aClass80_Sub1_Sub10_1;
			this.aClass80_Sub1_Sub10_1 = null;
		}
		@Pc(33) Class463 local33 = this.method24552().aClass463_61;
		if (local1 != null) {
			this.aClass570_23.method31588(local1, this.aByte100, (int) local33.aFloat297, (int) local33.aFloat296, null, -663050964);
		}
	}

	@OriginalMember(owner = "client!ajc", name = "p", descriptor = "(Lclient!di;)V")
	@Override
	public void method13838(@OriginalArg(0) Class102 arg0) {
		@Pc(1) Class80_Sub1_Sub10 local1 = null;
		if (this.aClass80_Sub1_Sub10_1 == null && this.aBoolean290) {
			@Pc(14) Class44 local14 = this.method12494(arg0, 262144, true, (byte) 88);
			local1 = (Class80_Sub1_Sub10) (local14 == null ? null : local14.anObject2);
		} else {
			local1 = this.aClass80_Sub1_Sub10_1;
			this.aClass80_Sub1_Sub10_1 = null;
		}
		@Pc(33) Class463 local33 = this.method24552().aClass463_61;
		if (local1 != null) {
			this.aClass570_23.method31588(local1, this.aByte100, (int) local33.aFloat297, (int) local33.aFloat296, null, 2011350255);
		}
	}

	@OriginalMember(owner = "client!ajc", name = "v", descriptor = "(Lclient!di;)V")
	@Override
	public void method13827(@OriginalArg(0) Class102 arg0) {
		@Pc(1) Class80_Sub1_Sub10 local1 = null;
		if (this.aClass80_Sub1_Sub10_1 == null && this.aBoolean290) {
			@Pc(14) Class44 local14 = this.method12494(arg0, 262144, true, (byte) 29);
			local1 = (Class80_Sub1_Sub10) (local14 == null ? null : local14.anObject2);
		} else {
			local1 = this.aClass80_Sub1_Sub10_1;
			this.aClass80_Sub1_Sub10_1 = null;
		}
		@Pc(33) Class463 local33 = this.method24552().aClass463_61;
		if (local1 != null) {
			this.aClass570_23.method31588(local1, this.aByte100, (int) local33.aFloat297, (int) local33.aFloat296, null, -1598968819);
		}
	}

	@OriginalMember(owner = "client!ajc", name = "y", descriptor = "(Lclient!di;)V")
	@Override
	public void method13840(@OriginalArg(0) Class102 arg0) {
		@Pc(1) Class80_Sub1_Sub10 local1 = null;
		if (this.aClass80_Sub1_Sub10_1 == null && this.aBoolean290) {
			@Pc(14) Class44 local14 = this.method12494(arg0, 262144, true, (byte) 15);
			local1 = (Class80_Sub1_Sub10) (local14 == null ? null : local14.anObject2);
		} else {
			local1 = this.aClass80_Sub1_Sub10_1;
			this.aClass80_Sub1_Sub10_1 = null;
		}
		@Pc(33) Class463 local33 = this.method24552().aClass463_61;
		if (local1 != null) {
			this.aClass570_23.method31588(local1, this.aByte100, (int) local33.aFloat297, (int) local33.aFloat296, null, 1152696951);
		}
	}

	@OriginalMember(owner = "client!ajc", name = "ck", descriptor = "()Z")
	@Override
	boolean method24595() {
		if (this.aClass105_1 == null) {
			return true;
		} else {
			return !this.aClass105_1.method7383();
		}
	}

	@OriginalMember(owner = "client!ajc", name = "n", descriptor = "(Lclient!di;)V")
	@Override
	public void method13841(@OriginalArg(0) Class102 arg0) {
		@Pc(1) Class80_Sub1_Sub10 local1 = null;
		if (this.aClass80_Sub1_Sub10_1 == null && this.aBoolean290) {
			@Pc(14) Class44 local14 = this.method12494(arg0, 262144, true, (byte) 10);
			local1 = (Class80_Sub1_Sub10) (local14 == null ? null : local14.anObject2);
		} else {
			local1 = this.aClass80_Sub1_Sub10_1;
			this.aClass80_Sub1_Sub10_1 = null;
		}
		@Pc(33) Class463 local33 = this.method24552().aClass463_61;
		if (local1 != null) {
			this.aClass570_23.method31588(local1, this.aByte100, (int) local33.aFloat297, (int) local33.aFloat296, null, -1361917103);
		}
	}

	@OriginalMember(owner = "client!ajc", name = "x", descriptor = "()V")
	@Override
	public void method13832() {
		if (this.aClass105_1 != null) {
			this.aClass105_1.method7404();
		}
	}

	@OriginalMember(owner = "client!ajc", name = "cr", descriptor = "()Z")
	@Override
	boolean method24584() {
		return this.aClass105_1 == null ? false : this.aClass105_1.method7395();
	}

	@OriginalMember(owner = "client!ajc", name = "ci", descriptor = "()I")
	@Override
	public int method24585() {
		return this.aClass105_1 == null ? 0 : this.aClass105_1.method7366();
	}

	@OriginalMember(owner = "client!ajc", name = "cm", descriptor = "()I")
	@Override
	public int method24622() {
		return this.aClass105_1 == null ? 0 : this.aClass105_1.method7366();
	}

	@OriginalMember(owner = "client!ajc", name = "cp", descriptor = "()I")
	@Override
	public int method24587() {
		return this.aClass105_1 == null ? 0 : this.aClass105_1.method7366();
	}

	@OriginalMember(owner = "client!ajc", name = "cg", descriptor = "()I")
	@Override
	public int method24588() {
		return this.aClass105_1 == null ? 0 : this.aClass105_1.method7366();
	}

	@OriginalMember(owner = "client!ajc", name = "fd", descriptor = "(Lclient!di;)Lclient!uc;")
	@Override
	public Class589 method24589(@OriginalArg(0) Class102 arg0) {
		@Pc(3) Class463 local3 = this.method24552().aClass463_61;
		if (this.aClass589_2 == null) {
			this.aClass589_2 = Class67.method1243((int) local3.aFloat297, (int) local3.aFloat295, (int) local3.aFloat296, this.method12497(arg0, 0, -1906035088), (byte) 93);
		}
		return this.aClass589_2;
	}

	@OriginalMember(owner = "client!ajc", name = "fc", descriptor = "(Lclient!di;)Lclient!tj;")
	@Override
	Class573 method24592(@OriginalArg(0) Class102 arg0) {
		if (this.aClass105_1 == null) {
			return null;
		}
		@Pc(8) Class471 local8 = this.method24526();
		@Pc(13) Class573 local13 = Class454.method29307(this.aBoolean292, -1142888681);
		@Pc(24) Class472 local24 = ((Class625) this.aClass41_Sub3_3.method18054(this.anInt1433 * -134520549, -841746794)).aClass472_2;
		if (local24 == null) {
			this.aClass105_1.method7359(local8, this.aClass246Array21[0], 0);
		} else {
			this.aClass105_1.method7359(local8, null, 0);
			arg0.method20735(local8, this.aClass246Array21[0], local24);
		}
		return local13;
	}

	@OriginalMember(owner = "client!ajc", name = "h", descriptor = "()Z")
	@Override
	public boolean method13835() {
		return true;
	}

	@OriginalMember(owner = "client!ajc", name = "fg", descriptor = "(Lclient!di;)Lclient!tj;")
	@Override
	Class573 method24594(@OriginalArg(0) Class102 arg0) {
		if (this.aClass105_1 == null) {
			return null;
		}
		@Pc(8) Class471 local8 = this.method24526();
		@Pc(13) Class573 local13 = Class454.method29307(this.aBoolean292, -1431818415);
		@Pc(24) Class472 local24 = ((Class625) this.aClass41_Sub3_3.method18054(this.anInt1433 * -134520549, 1412012473)).aClass472_2;
		if (local24 == null) {
			this.aClass105_1.method7359(local8, this.aClass246Array21[0], 0);
		} else {
			this.aClass105_1.method7359(local8, null, 0);
			arg0.method20735(local8, this.aClass246Array21[0], local24);
		}
		return local13;
	}

	@OriginalMember(owner = "client!ajc", name = "ft", descriptor = "(Lclient!di;II)Z")
	@Override
	boolean method24563(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(10) Class472 local10 = ((Class625) this.aClass41_Sub3_3.method18054(this.anInt1433 * -134520549, 21672016)).aClass472_2;
		if (local10 != null) {
			return arg0.method20733(arg1, arg2, this.method24526(), local10, 92868112);
		}
		@Pc(27) Class105 local27 = this.method12497(arg0, 131072, -1674930734);
		if (local27 == null) {
			return false;
		} else {
			@Pc(32) Class471 local32 = this.method24526();
			return local27.method7360(arg1, arg2, local32, false, 0);
		}
	}

	@OriginalMember(owner = "client!ajc", name = "fs", descriptor = "()Z")
	@Override
	boolean method24596() {
		return this.aBoolean289;
	}

	@OriginalMember(owner = "client!ajc", name = "fu", descriptor = "()Z")
	@Override
	boolean method24606() {
		return this.aBoolean289;
	}

	@OriginalMember(owner = "client!ajc", name = "ff", descriptor = "(Lclient!di;Lclient!alf;IIIZ)V")
	@Override
	void method24598(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (arg1 instanceof Class120_Sub1_Sub2_Sub1) {
			@Pc(5) Class120_Sub1_Sub2_Sub1 local5 = (Class120_Sub1_Sub2_Sub1) arg1;
			if (this.aClass105_1 != null && local5.aClass105_1 != null) {
				this.aClass105_1.method7353(local5.aClass105_1, arg2, arg3, arg4, arg5);
			}
		} else if (arg1 instanceof Class120_Sub1_Sub1_Sub3) {
			@Pc(28) Class120_Sub1_Sub1_Sub3 local28 = (Class120_Sub1_Sub1_Sub3) arg1;
			if (this.aClass105_1 != null && local28.aClass105_2 != null) {
				this.aClass105_1.method7353(local28.aClass105_2, arg2, arg3, arg4, arg5);
			}
		}
	}

	@OriginalMember(owner = "client!ajc", name = "gb", descriptor = "(Lclient!di;)V")
	@Override
	void method24605(@OriginalArg(0) Class102 arg0) {
	}

	@OriginalMember(owner = "client!ajc", name = "ax", descriptor = "(Lclient!di;)V")
	@Override
	public void method13844(@OriginalArg(0) Class102 arg0) {
		@Pc(1) Class80_Sub1_Sub10 local1 = null;
		if (this.aClass80_Sub1_Sub10_1 == null && this.aBoolean290) {
			@Pc(15) Class44 local15 = this.method12494(arg0, 262144, true, (byte) 37);
			local1 = (Class80_Sub1_Sub10) (local15 == null ? null : local15.anObject2);
		} else {
			local1 = this.aClass80_Sub1_Sub10_1;
			this.aClass80_Sub1_Sub10_1 = null;
		}
		@Pc(34) Class463 local34 = this.method24552().aClass463_61;
		if (local1 != null) {
			this.aClass570_23.method31587(local1, this.aByte100, (int) local34.aFloat297, (int) local34.aFloat296, null, 1138189790);
		}
	}

	@OriginalMember(owner = "client!ajc", name = "fr", descriptor = "(Lclient!di;Lclient!alf;IIIZ)V")
	@Override
	void method24562(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (arg1 instanceof Class120_Sub1_Sub2_Sub1) {
			@Pc(5) Class120_Sub1_Sub2_Sub1 local5 = (Class120_Sub1_Sub2_Sub1) arg1;
			if (this.aClass105_1 != null && local5.aClass105_1 != null) {
				this.aClass105_1.method7353(local5.aClass105_1, arg2, arg3, arg4, arg5);
			}
		} else if (arg1 instanceof Class120_Sub1_Sub1_Sub3) {
			@Pc(28) Class120_Sub1_Sub1_Sub3 local28 = (Class120_Sub1_Sub1_Sub3) arg1;
			if (this.aClass105_1 != null && local28.aClass105_2 != null) {
				this.aClass105_1.method7353(local28.aClass105_2, arg2, arg3, arg4, arg5);
			}
		}
	}

	@OriginalMember(owner = "client!ajc", name = "gz", descriptor = "(Lclient!di;Lclient!alf;IIIZ)V")
	@Override
	void method24580(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (arg1 instanceof Class120_Sub1_Sub2_Sub1) {
			@Pc(5) Class120_Sub1_Sub2_Sub1 local5 = (Class120_Sub1_Sub2_Sub1) arg1;
			if (this.aClass105_1 != null && local5.aClass105_1 != null) {
				this.aClass105_1.method7353(local5.aClass105_1, arg2, arg3, arg4, arg5);
			}
		} else if (arg1 instanceof Class120_Sub1_Sub1_Sub3) {
			@Pc(28) Class120_Sub1_Sub1_Sub3 local28 = (Class120_Sub1_Sub1_Sub3) arg1;
			if (this.aClass105_1 != null && local28.aClass105_2 != null) {
				this.aClass105_1.method7353(local28.aClass105_2, arg2, arg3, arg4, arg5);
			}
		}
	}

	@OriginalMember(owner = "client!ajc", name = "gk", descriptor = "(Lclient!di;Lclient!alf;IIIZ)V")
	@Override
	void method24602(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (arg1 instanceof Class120_Sub1_Sub2_Sub1) {
			@Pc(5) Class120_Sub1_Sub2_Sub1 local5 = (Class120_Sub1_Sub2_Sub1) arg1;
			if (this.aClass105_1 != null && local5.aClass105_1 != null) {
				this.aClass105_1.method7353(local5.aClass105_1, arg2, arg3, arg4, arg5);
			}
		} else if (arg1 instanceof Class120_Sub1_Sub1_Sub3) {
			@Pc(28) Class120_Sub1_Sub1_Sub3 local28 = (Class120_Sub1_Sub1_Sub3) arg1;
			if (this.aClass105_1 != null && local28.aClass105_2 != null) {
				this.aClass105_1.method7353(local28.aClass105_2, arg2, arg3, arg4, arg5);
			}
		}
	}

	@OriginalMember(owner = "client!ajc", name = "ge", descriptor = "()V")
	@Override
	void method24590() {
		this.aBoolean289 = false;
		if (this.aClass105_1 != null) {
			this.aClass105_1.method7422(this.aClass105_1.method7326() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!ajc", name = "c", descriptor = "()I")
	@Override
	public int method13826() {
		return this.aByte31;
	}

	@OriginalMember(owner = "client!ajc", name = "s", descriptor = "()I")
	@Override
	public int method13829() {
		return this.anInt1433 * -134520549;
	}

	@OriginalMember(owner = "client!ajc", name = "gg", descriptor = "()V")
	@Override
	void method24603() {
		this.aBoolean289 = false;
		if (this.aClass105_1 != null) {
			this.aClass105_1.method7422(this.aClass105_1.method7326() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!ajc", name = "e", descriptor = "(I)I")
	@Override
	public int method13820(@OriginalArg(0) int arg0) {
		return this.aByte31;
	}

	@OriginalMember(owner = "client!ajc", name = "gw", descriptor = "(Lclient!di;)V")
	@Override
	void method24593(@OriginalArg(0) Class102 arg0) {
	}

	@OriginalMember(owner = "client!ajc", name = "gi", descriptor = "(Lclient!di;)V")
	@Override
	void method24607(@OriginalArg(0) Class102 arg0) {
	}

	@OriginalMember(owner = "client!ajc", name = "gp", descriptor = "(Lclient!di;)V")
	@Override
	void method24608(@OriginalArg(0) Class102 arg0) {
	}

	@OriginalMember(owner = "client!ajc", name = "fi", descriptor = "(Lclient!di;Lclient!alf;IIIZ)V")
	@Override
	void method24599(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (arg1 instanceof Class120_Sub1_Sub2_Sub1) {
			@Pc(5) Class120_Sub1_Sub2_Sub1 local5 = (Class120_Sub1_Sub2_Sub1) arg1;
			if (this.aClass105_1 != null && local5.aClass105_1 != null) {
				this.aClass105_1.method7353(local5.aClass105_1, arg2, arg3, arg4, arg5);
			}
		} else if (arg1 instanceof Class120_Sub1_Sub1_Sub3) {
			@Pc(28) Class120_Sub1_Sub1_Sub3 local28 = (Class120_Sub1_Sub1_Sub3) arg1;
			if (this.aClass105_1 != null && local28.aClass105_2 != null) {
				this.aClass105_1.method7353(local28.aClass105_2, arg2, arg3, arg4, arg5);
			}
		}
	}

	@OriginalMember(owner = "client!ajc", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method13823(@OriginalArg(0) int arg0) {
		return true;
	}

	@OriginalMember(owner = "client!ajc", name = "bd", descriptor = "(Lclient!di;I)Lclient!dn;")
	Class105 method12500(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass105_1 != null && arg0.method21083(this.aClass105_1.method7326(), arg1) == 0) {
			return this.aClass105_1;
		} else {
			@Pc(19) Class44 local19 = this.method12494(arg0, arg1, false, (byte) 66);
			return local19 == null ? null : (Class105) local19.anObject1;
		}
	}

	@OriginalMember(owner = "client!ajc", name = "cd", descriptor = "(Lclient!di;IZ)Lclient!abt;")
	Class44 method12501(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(9) Class625 local9 = (Class625) this.aClass41_Sub3_3.method18054(this.anInt1433 * -134520549, 670787505);
		@Pc(19) Class100 local19;
		@Pc(25) Class100 local25;
		if (this.aBoolean291) {
			local19 = this.aClass570_23.aClass100Array2[this.aByte100];
			local25 = this.aClass570_23.aClass100Array3[0];
		} else {
			local19 = this.aClass570_23.aClass100Array3[this.aByte100];
			if (this.aByte100 < 3) {
				local25 = this.aClass570_23.aClass100Array3[this.aByte100 + 1];
			} else {
				local25 = null;
			}
		}
		@Pc(53) Class463 local53 = this.method24552().aClass463_61;
		return local9.method32460(arg0, arg1, this.aByte32, this.aByte31, local19, local25, (int) local53.aFloat297, this.anInt1434 * -1199738965, (int) local53.aFloat296, arg2, null, (byte) 3);
	}

	@OriginalMember(owner = "client!ajc", name = "fh", descriptor = "(Lclient!di;B)V")
	@Override
	void method24572(@OriginalArg(0) Class102 arg0, @OriginalArg(1) byte arg1) {
	}

	@OriginalMember(owner = "client!ajc", name = "ct", descriptor = "(Lclient!di;IZ)Lclient!abt;")
	Class44 method12502(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(9) Class625 local9 = (Class625) this.aClass41_Sub3_3.method18054(this.anInt1433 * -134520549, 356655842);
		@Pc(19) Class100 local19;
		@Pc(25) Class100 local25;
		if (this.aBoolean291) {
			local19 = this.aClass570_23.aClass100Array2[this.aByte100];
			local25 = this.aClass570_23.aClass100Array3[0];
		} else {
			local19 = this.aClass570_23.aClass100Array3[this.aByte100];
			if (this.aByte100 < 3) {
				local25 = this.aClass570_23.aClass100Array3[this.aByte100 + 1];
			} else {
				local25 = null;
			}
		}
		@Pc(53) Class463 local53 = this.method24552().aClass463_61;
		return local9.method32460(arg0, arg1, this.aByte32, this.aByte31, local19, local25, (int) local53.aFloat297, this.anInt1434 * -1199738965, (int) local53.aFloat296, arg2, null, (byte) -10);
	}
}
