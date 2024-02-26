package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ajy")
public final class Class120_Sub1_Sub3_Sub2 extends Class120_Sub1_Sub3 implements Interface60 {

	@OriginalMember(owner = "client!ajy", name = "n", descriptor = "I")
	static int anInt1518;

	@OriginalMember(owner = "client!ajy", name = "w", descriptor = "Lclient!uc;")
	Class589 aClass589_8;

	@OriginalMember(owner = "client!ajy", name = "s", descriptor = "Lclient!aod;")
	Class41_Sub3 aClass41_Sub3_6;

	@OriginalMember(owner = "client!ajy", name = "r", descriptor = "I")
	final int anInt1516;

	@OriginalMember(owner = "client!ajy", name = "d", descriptor = "Z")
	final boolean aBoolean352;

	@OriginalMember(owner = "client!ajy", name = "h", descriptor = "B")
	final byte aByte54;

	@OriginalMember(owner = "client!ajy", name = "q", descriptor = "B")
	final byte aByte53;

	@OriginalMember(owner = "client!ajy", name = "z", descriptor = "Z")
	boolean aBoolean353;

	@OriginalMember(owner = "client!ajy", name = "p", descriptor = "Z")
	boolean aBoolean354;

	@OriginalMember(owner = "client!ajy", name = "v", descriptor = "I")
	int anInt1517;

	@OriginalMember(owner = "client!ajy", name = "k", descriptor = "Lclient!dn;")
	Class105 aClass105_4;

	@OriginalMember(owner = "client!ajy", name = "x", descriptor = "Lclient!arx;")
	Class80_Sub1_Sub10 aClass80_Sub1_Sub10_4;

	@OriginalMember(owner = "client!ajy", name = "f", descriptor = "(Lclient!ald;Ljava/lang/String;S)I")
	public static int method13850(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) short arg2) {
		@Pc(4) int local4 = arg0.anInt3152 * -1380987821;
		@Pc(8) byte[] local8 = Class623.method32438(arg1, -2113522262);
		arg0.method23173(local8.length, (short) -5741);
		arg0.anInt3152 += Class338.aClass336_1.method27862(local8, 0, local8.length, arg0.aByteArray61, arg0.anInt3152 * -1380987821, 1583928625) * 1034180571;
		return arg0.anInt3152 * -1380987821 - local4;
	}

	@OriginalMember(owner = "client!ajy", name = "aka", descriptor = "(Lclient!yp;I)V")
	static void method13851(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class159_Sub1.aBoolean406 ? 1 : 0;
	}

	@OriginalMember(owner = "client!ajy", name = "ayw", descriptor = "(Lclient!yp;B)V")
	static void method13852(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class80.aBoolean664 ? 1 : 0;
	}

	@OriginalMember(owner = "client!ajy", name = "<init>", descriptor = "(Lclient!te;Lclient!di;Lclient!aod;Lclient!vv;IIIIIZIIIILclient!oc;)V")
	public Class120_Sub1_Sub3_Sub2(@OriginalArg(0) Class570 arg0, @OriginalArg(1) Class102 arg1, @OriginalArg(2) Class41_Sub3 arg2, @OriginalArg(3) Class625 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) Class457 arg14) {
		super(arg0, arg6, arg7, arg8, arg4, arg5, arg10, arg11, arg14);
		this.aClass41_Sub3_6 = arg2;
		this.anInt1516 = arg3.anInt5499 * -611613991;
		this.aBoolean352 = arg9;
		this.aByte54 = (byte) arg13;
		this.aByte53 = (byte) arg12;
		this.aBoolean353 = arg3.anInt5506 * 350558937 != 0 && !arg9;
		this.aBoolean354 = arg1.method20667() && arg3.aBoolean951 && !this.aBoolean352 && Class703.aClass80_Sub37_49.aClass165_Sub22_1.method16266(409899909) != 0;
		this.anInt1517 = arg7 * 2079674997;
		@Pc(69) int local69 = 2048;
		if (arg3.aBoolean953) {
			local69 |= 0x80000;
		}
		@Pc(84) Class44 local84 = this.method13845(arg1, local69, this.aBoolean354, (byte) 0);
		if (local84 != null) {
			this.aClass105_4 = (Class105) local84.anObject1;
			this.aClass80_Sub1_Sub10_4 = (Class80_Sub1_Sub10) local84.anObject2;
			if (arg3.aBoolean953) {
				this.aClass105_4 = this.aClass105_4.method7324((byte) 0, local69, false);
				if (arg3.aBoolean953) {
					@Pc(115) Class535 local115 = client.aClass539_1.method30897(-1819509180);
					this.aClass105_4.method7380(local115.anInt5078 * -228215283, local115.anInt5080 * -1186866959, local115.anInt5079 * -1890181955, local115.anInt5077 * 140891643);
				}
			}
		}
		this.method24581(1, (byte) 14);
	}

	@OriginalMember(owner = "client!ajy", name = "ci", descriptor = "()I")
	@Override
	public int method24585() {
		return this.aClass105_4 == null ? 0 : this.aClass105_4.method7366();
	}

	@OriginalMember(owner = "client!ajy", name = "bo", descriptor = "(I)Z")
	@Override
	boolean method24567(@OriginalArg(0) int arg0) {
		if (this.aClass105_4 == null) {
			return true;
		} else {
			return !this.aClass105_4.method7383();
		}
	}

	@OriginalMember(owner = "client!ajy", name = "bc", descriptor = "(I)Z")
	@Override
	boolean method24565(@OriginalArg(0) int arg0) {
		return this.aClass105_4 == null ? false : this.aClass105_4.method7395();
	}

	@OriginalMember(owner = "client!ajy", name = "bb", descriptor = "(I)I")
	@Override
	public int method24578(@OriginalArg(0) int arg0) {
		return this.aClass105_4 == null ? 0 : this.aClass105_4.method7366();
	}

	@OriginalMember(owner = "client!ajy", name = "bx", descriptor = "(Lclient!di;IZB)Lclient!abt;")
	Class44 method13845(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) byte arg3) {
		@Pc(9) Class625 local9 = (Class625) this.aClass41_Sub3_6.method18054(this.anInt1516 * 554000263, 1604104766);
		@Pc(19) Class100 local19;
		@Pc(25) Class100 local25;
		if (this.aBoolean352) {
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
		return local9.method32460(arg0, arg1, this.aByte53, this.aByte54, local19, local25, (int) local53.aFloat297, this.anInt1517 * 1227648477, (int) local53.aFloat296, arg2, null, (byte) -20);
	}

	@OriginalMember(owner = "client!ajy", name = "r", descriptor = "()Z")
	@Override
	public boolean method13833() {
		return this.aBoolean354;
	}

	@OriginalMember(owner = "client!ajy", name = "fz", descriptor = "(Lclient!di;I)Lclient!uc;")
	@Override
	public Class589 method24573(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class463 local3 = this.method24552().aClass463_61;
		if (this.aClass589_8 == null) {
			this.aClass589_8 = Class67.method1243((int) local3.aFloat297, (int) local3.aFloat295, (int) local3.aFloat296, this.method13847(arg0, 0, (short) -27906), (byte) 14);
		}
		return this.aClass589_8;
	}

	@OriginalMember(owner = "client!ajy", name = "fw", descriptor = "(Lclient!di;III)Z")
	@Override
	boolean method24583(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) Class472 local10 = ((Class625) this.aClass41_Sub3_6.method18054(this.anInt1516 * 554000263, -526867676)).aClass472_2;
		if (local10 != null) {
			return arg0.method20733(arg1, arg2, this.method24526(), local10, 92868112);
		}
		@Pc(27) Class105 local27 = this.method13847(arg0, 131072, (short) -21498);
		if (local27 == null) {
			return false;
		} else {
			@Pc(33) Class471 local33 = this.method24526();
			return local27.method7360(arg1, arg2, local33, false, 0);
		}
	}

	@OriginalMember(owner = "client!ajy", name = "gp", descriptor = "(Lclient!di;)V")
	@Override
	void method24608(@OriginalArg(0) Class102 arg0) {
	}

	@OriginalMember(owner = "client!ajy", name = "ca", descriptor = "()Z")
	@Override
	boolean method24616() {
		return this.aClass105_4 == null ? false : this.aClass105_4.method7395();
	}

	@OriginalMember(owner = "client!ajy", name = "t", descriptor = "(B)I")
	@Override
	public int method13834(@OriginalArg(0) byte arg0) {
		return this.anInt1516 * 554000263;
	}

	@OriginalMember(owner = "client!ajy", name = "f", descriptor = "(I)I")
	@Override
	public int method13819(@OriginalArg(0) int arg0) {
		return this.aByte53;
	}

	@OriginalMember(owner = "client!ajy", name = "e", descriptor = "(I)I")
	@Override
	public int method13820(@OriginalArg(0) int arg0) {
		return this.aByte54;
	}

	@OriginalMember(owner = "client!ajy", name = "gb", descriptor = "(Lclient!di;)V")
	@Override
	void method24605(@OriginalArg(0) Class102 arg0) {
	}

	@OriginalMember(owner = "client!ajy", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method13823(@OriginalArg(0) int arg0) {
		return true;
	}

	@OriginalMember(owner = "client!ajy", name = "l", descriptor = "(I)Z")
	@Override
	public boolean method13822(@OriginalArg(0) int arg0) {
		return this.aBoolean354;
	}

	@OriginalMember(owner = "client!ajy", name = "i", descriptor = "(Lclient!di;I)V")
	@Override
	public void method13831(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) Class80_Sub1_Sub10 local1 = null;
		if (this.aClass80_Sub1_Sub10_4 == null && this.aBoolean354) {
			@Pc(15) Class44 local15 = this.method13845(arg0, 262144, true, (byte) 0);
			local1 = (Class80_Sub1_Sub10) (local15 == null ? null : local15.anObject2);
		} else {
			local1 = this.aClass80_Sub1_Sub10_4;
			this.aClass80_Sub1_Sub10_4 = null;
		}
		@Pc(34) Class463 local34 = this.method24552().aClass463_61;
		if (local1 != null) {
			this.aClass570_23.method31587(local1, this.aByte100, (int) local34.aFloat297, (int) local34.aFloat296, null, 1620981718);
		}
	}

	@OriginalMember(owner = "client!ajy", name = "m", descriptor = "(Lclient!di;I)V")
	@Override
	public void method13825(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) Class80_Sub1_Sub10 local1 = null;
		if (this.aClass80_Sub1_Sub10_4 == null && this.aBoolean354) {
			@Pc(15) Class44 local15 = this.method13845(arg0, 262144, true, (byte) 0);
			local1 = (Class80_Sub1_Sub10) (local15 == null ? null : local15.anObject2);
		} else {
			local1 = this.aClass80_Sub1_Sub10_4;
			this.aClass80_Sub1_Sub10_4 = null;
		}
		@Pc(34) Class463 local34 = this.method24552().aClass463_61;
		if (local1 != null) {
			this.aClass570_23.method31588(local1, this.aByte100, (int) local34.aFloat297, (int) local34.aFloat296, null, 1386771738);
		}
	}

	@OriginalMember(owner = "client!ajy", name = "a", descriptor = "()I")
	@Override
	public int method13828() {
		return this.anInt1516 * 554000263;
	}

	@OriginalMember(owner = "client!ajy", name = "j", descriptor = "()I")
	@Override
	public int method13842() {
		return this.anInt1516 * 554000263;
	}

	@OriginalMember(owner = "client!ajy", name = "cm", descriptor = "()I")
	@Override
	public int method24622() {
		return this.aClass105_4 == null ? 0 : this.aClass105_4.method7366();
	}

	@OriginalMember(owner = "client!ajy", name = "y", descriptor = "(Lclient!di;)V")
	@Override
	public void method13840(@OriginalArg(0) Class102 arg0) {
		@Pc(1) Class80_Sub1_Sub10 local1 = null;
		if (this.aClass80_Sub1_Sub10_4 == null && this.aBoolean354) {
			@Pc(15) Class44 local15 = this.method13845(arg0, 262144, true, (byte) 0);
			local1 = (Class80_Sub1_Sub10) (local15 == null ? null : local15.anObject2);
		} else {
			local1 = this.aClass80_Sub1_Sub10_4;
			this.aClass80_Sub1_Sub10_4 = null;
		}
		@Pc(34) Class463 local34 = this.method24552().aClass463_61;
		if (local1 != null) {
			this.aClass570_23.method31588(local1, this.aByte100, (int) local34.aFloat297, (int) local34.aFloat296, null, -215895453);
		}
	}

	@OriginalMember(owner = "client!ajy", name = "k", descriptor = "()I")
	@Override
	public int method13818() {
		return this.aByte53;
	}

	@OriginalMember(owner = "client!ajy", name = "x", descriptor = "()V")
	@Override
	public void method13832() {
		if (this.aClass105_4 != null) {
			this.aClass105_4.method7404();
		}
	}

	@OriginalMember(owner = "client!ajy", name = "w", descriptor = "()V")
	@Override
	public void method13830() {
		if (this.aClass105_4 != null) {
			this.aClass105_4.method7404();
		}
	}

	@OriginalMember(owner = "client!ajy", name = "n", descriptor = "(Lclient!di;)V")
	@Override
	public void method13841(@OriginalArg(0) Class102 arg0) {
		@Pc(1) Class80_Sub1_Sub10 local1 = null;
		if (this.aClass80_Sub1_Sub10_4 == null && this.aBoolean354) {
			@Pc(15) Class44 local15 = this.method13845(arg0, 262144, true, (byte) 0);
			local1 = (Class80_Sub1_Sub10) (local15 == null ? null : local15.anObject2);
		} else {
			local1 = this.aClass80_Sub1_Sub10_4;
			this.aClass80_Sub1_Sub10_4 = null;
		}
		@Pc(34) Class463 local34 = this.method24552().aClass463_61;
		if (local1 != null) {
			this.aClass570_23.method31588(local1, this.aByte100, (int) local34.aFloat297, (int) local34.aFloat296, null, 973345319);
		}
	}

	@OriginalMember(owner = "client!ajy", name = "q", descriptor = "()Z")
	@Override
	public boolean method13839() {
		return this.aBoolean354;
	}

	@OriginalMember(owner = "client!ajy", name = "h", descriptor = "()Z")
	@Override
	public boolean method13835() {
		return true;
	}

	@OriginalMember(owner = "client!ajy", name = "d", descriptor = "()Z")
	@Override
	public boolean method13836() {
		return true;
	}

	@OriginalMember(owner = "client!ajy", name = "z", descriptor = "(Lclient!di;)V")
	@Override
	public void method13837(@OriginalArg(0) Class102 arg0) {
		@Pc(1) Class80_Sub1_Sub10 local1 = null;
		if (this.aClass80_Sub1_Sub10_4 == null && this.aBoolean354) {
			@Pc(15) Class44 local15 = this.method13845(arg0, 262144, true, (byte) 0);
			local1 = (Class80_Sub1_Sub10) (local15 == null ? null : local15.anObject2);
		} else {
			local1 = this.aClass80_Sub1_Sub10_4;
			this.aClass80_Sub1_Sub10_4 = null;
		}
		@Pc(34) Class463 local34 = this.method24552().aClass463_61;
		if (local1 != null) {
			this.aClass570_23.method31588(local1, this.aByte100, (int) local34.aFloat297, (int) local34.aFloat296, null, 1784088677);
		}
	}

	@OriginalMember(owner = "client!ajy", name = "p", descriptor = "(Lclient!di;)V")
	@Override
	public void method13838(@OriginalArg(0) Class102 arg0) {
		@Pc(1) Class80_Sub1_Sub10 local1 = null;
		if (this.aClass80_Sub1_Sub10_4 == null && this.aBoolean354) {
			@Pc(15) Class44 local15 = this.method13845(arg0, 262144, true, (byte) 0);
			local1 = (Class80_Sub1_Sub10) (local15 == null ? null : local15.anObject2);
		} else {
			local1 = this.aClass80_Sub1_Sub10_4;
			this.aClass80_Sub1_Sub10_4 = null;
		}
		@Pc(34) Class463 local34 = this.method24552().aClass463_61;
		if (local1 != null) {
			this.aClass570_23.method31588(local1, this.aByte100, (int) local34.aFloat297, (int) local34.aFloat296, null, 1673247310);
		}
	}

	@OriginalMember(owner = "client!ajy", name = "v", descriptor = "(Lclient!di;)V")
	@Override
	public void method13827(@OriginalArg(0) Class102 arg0) {
		@Pc(1) Class80_Sub1_Sub10 local1 = null;
		if (this.aClass80_Sub1_Sub10_4 == null && this.aBoolean354) {
			@Pc(15) Class44 local15 = this.method13845(arg0, 262144, true, (byte) 0);
			local1 = (Class80_Sub1_Sub10) (local15 == null ? null : local15.anObject2);
		} else {
			local1 = this.aClass80_Sub1_Sub10_4;
			this.aClass80_Sub1_Sub10_4 = null;
		}
		@Pc(34) Class463 local34 = this.method24552().aClass463_61;
		if (local1 != null) {
			this.aClass570_23.method31588(local1, this.aByte100, (int) local34.aFloat297, (int) local34.aFloat296, null, -141967401);
		}
	}

	@OriginalMember(owner = "client!ajy", name = "fg", descriptor = "(Lclient!di;)Lclient!tj;")
	@Override
	Class573 method24594(@OriginalArg(0) Class102 arg0) {
		if (this.aClass105_4 == null) {
			return null;
		}
		@Pc(7) Class471 local7 = arg0.method20813();
		local7.method29760(this.method24526());
		local7.method29783((float) this.aShort52, 0.0F, (float) this.aShort51);
		@Pc(25) Class573 local25 = Class454.method29307(this.aBoolean353, -860578220);
		@Pc(36) Class472 local36 = ((Class625) this.aClass41_Sub3_6.method18054(this.anInt1516 * 554000263, 1162277333)).aClass472_2;
		if (local36 == null) {
			this.aClass105_4.method7359(local7, this.aClass246Array21[0], 0);
		} else {
			this.aClass105_4.method7359(local7, null, 0);
			arg0.method20735(local7, this.aClass246Array21[0], local36);
		}
		return local25;
	}

	@OriginalMember(owner = "client!ajy", name = "fc", descriptor = "(Lclient!di;)Lclient!tj;")
	@Override
	Class573 method24592(@OriginalArg(0) Class102 arg0) {
		if (this.aClass105_4 == null) {
			return null;
		}
		@Pc(7) Class471 local7 = arg0.method20813();
		local7.method29760(this.method24526());
		local7.method29783((float) this.aShort52, 0.0F, (float) this.aShort51);
		@Pc(25) Class573 local25 = Class454.method29307(this.aBoolean353, 857293662);
		@Pc(36) Class472 local36 = ((Class625) this.aClass41_Sub3_6.method18054(this.anInt1516 * 554000263, 1365714371)).aClass472_2;
		if (local36 == null) {
			this.aClass105_4.method7359(local7, this.aClass246Array21[0], 0);
		} else {
			this.aClass105_4.method7359(local7, null, 0);
			arg0.method20735(local7, this.aClass246Array21[0], local36);
		}
		return local25;
	}

	@OriginalMember(owner = "client!ajy", name = "ck", descriptor = "()Z")
	@Override
	boolean method24595() {
		if (this.aClass105_4 == null) {
			return true;
		} else {
			return !this.aClass105_4.method7383();
		}
	}

	@OriginalMember(owner = "client!ajy", name = "s", descriptor = "()I")
	@Override
	public int method13829() {
		return this.anInt1516 * 554000263;
	}

	@OriginalMember(owner = "client!ajy", name = "cr", descriptor = "()Z")
	@Override
	boolean method24584() {
		return this.aClass105_4 == null ? false : this.aClass105_4.method7395();
	}

	@OriginalMember(owner = "client!ajy", name = "fn", descriptor = "(Lclient!di;I)Lclient!tj;")
	@Override
	Class573 method24571(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass105_4 == null) {
			return null;
		}
		@Pc(7) Class471 local7 = arg0.method20813();
		local7.method29760(this.method24526());
		local7.method29783((float) this.aShort52, 0.0F, (float) this.aShort51);
		@Pc(25) Class573 local25 = Class454.method29307(this.aBoolean353, 866888334);
		@Pc(36) Class472 local36 = ((Class625) this.aClass41_Sub3_6.method18054(this.anInt1516 * 554000263, 975479106)).aClass472_2;
		if (local36 == null) {
			this.aClass105_4.method7359(local7, this.aClass246Array21[0], 0);
		} else {
			this.aClass105_4.method7359(local7, null, 0);
			arg0.method20735(local7, this.aClass246Array21[0], local36);
		}
		return local25;
	}

	@OriginalMember(owner = "client!ajy", name = "bm", descriptor = "(Lclient!di;IZ)Lclient!abt;")
	Class44 method13846(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(9) Class625 local9 = (Class625) this.aClass41_Sub3_6.method18054(this.anInt1516 * 554000263, 1700666070);
		@Pc(19) Class100 local19;
		@Pc(25) Class100 local25;
		if (this.aBoolean352) {
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
		return local9.method32460(arg0, arg1, this.aByte53, this.aByte54, local19, local25, (int) local53.aFloat297, this.anInt1517 * 1227648477, (int) local53.aFloat296, arg2, null, (byte) 44);
	}

	@OriginalMember(owner = "client!ajy", name = "cp", descriptor = "()I")
	@Override
	public int method24587() {
		return this.aClass105_4 == null ? 0 : this.aClass105_4.method7366();
	}

	@OriginalMember(owner = "client!ajy", name = "cg", descriptor = "()I")
	@Override
	public int method24588() {
		return this.aClass105_4 == null ? 0 : this.aClass105_4.method7366();
	}

	@OriginalMember(owner = "client!ajy", name = "fd", descriptor = "(Lclient!di;)Lclient!uc;")
	@Override
	public Class589 method24589(@OriginalArg(0) Class102 arg0) {
		@Pc(3) Class463 local3 = this.method24552().aClass463_61;
		if (this.aClass589_8 == null) {
			this.aClass589_8 = Class67.method1243((int) local3.aFloat297, (int) local3.aFloat295, (int) local3.aFloat296, this.method13847(arg0, 0, (short) -12992), (byte) 56);
		}
		return this.aClass589_8;
	}

	@OriginalMember(owner = "client!ajy", name = "bw", descriptor = "(Lclient!di;IS)Lclient!dn;")
	Class105 method13847(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) short arg2) {
		if (this.aClass105_4 != null && arg0.method21083(this.aClass105_4.method7326(), arg1) == 0) {
			return this.aClass105_4;
		} else {
			@Pc(20) Class44 local20 = this.method13845(arg0, arg1, false, (byte) 0);
			return local20 == null ? null : (Class105) local20.anObject1;
		}
	}

	@OriginalMember(owner = "client!ajy", name = "fl", descriptor = "(Lclient!di;)Lclient!tj;")
	@Override
	Class573 method24597(@OriginalArg(0) Class102 arg0) {
		if (this.aClass105_4 == null) {
			return null;
		}
		@Pc(7) Class471 local7 = arg0.method20813();
		local7.method29760(this.method24526());
		local7.method29783((float) this.aShort52, 0.0F, (float) this.aShort51);
		@Pc(25) Class573 local25 = Class454.method29307(this.aBoolean353, 283725134);
		@Pc(36) Class472 local36 = ((Class625) this.aClass41_Sub3_6.method18054(this.anInt1516 * 554000263, -1221610688)).aClass472_2;
		if (local36 == null) {
			this.aClass105_4.method7359(local7, this.aClass246Array21[0], 0);
		} else {
			this.aClass105_4.method7359(local7, null, 0);
			arg0.method20735(local7, this.aClass246Array21[0], local36);
		}
		return local25;
	}

	@OriginalMember(owner = "client!ajy", name = "o", descriptor = "()I")
	@Override
	public int method13824() {
		return this.anInt1516 * 554000263;
	}

	@OriginalMember(owner = "client!ajy", name = "ft", descriptor = "(Lclient!di;II)Z")
	@Override
	boolean method24563(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(10) Class472 local10 = ((Class625) this.aClass41_Sub3_6.method18054(this.anInt1516 * 554000263, 1707679095)).aClass472_2;
		if (local10 != null) {
			return arg0.method20733(arg1, arg2, this.method24526(), local10, 92868112);
		}
		@Pc(27) Class105 local27 = this.method13847(arg0, 131072, (short) 6953);
		if (local27 == null) {
			return false;
		} else {
			@Pc(33) Class471 local33 = this.method24526();
			return local27.method7360(arg1, arg2, local33, false, 0);
		}
	}

	@OriginalMember(owner = "client!ajy", name = "c", descriptor = "()I")
	@Override
	public int method13826() {
		return this.aByte54;
	}

	@OriginalMember(owner = "client!ajy", name = "b", descriptor = "()I")
	@Override
	public int method13843() {
		return this.aByte54;
	}

	@OriginalMember(owner = "client!ajy", name = "ax", descriptor = "(Lclient!di;)V")
	@Override
	public void method13844(@OriginalArg(0) Class102 arg0) {
		@Pc(1) Class80_Sub1_Sub10 local1 = null;
		if (this.aClass80_Sub1_Sub10_4 == null && this.aBoolean354) {
			@Pc(15) Class44 local15 = this.method13845(arg0, 262144, true, (byte) 0);
			local1 = (Class80_Sub1_Sub10) (local15 == null ? null : local15.anObject2);
		} else {
			local1 = this.aClass80_Sub1_Sub10_4;
			this.aClass80_Sub1_Sub10_4 = null;
		}
		@Pc(34) Class463 local34 = this.method24552().aClass463_61;
		if (local1 != null) {
			this.aClass570_23.method31587(local1, this.aByte100, (int) local34.aFloat297, (int) local34.aFloat296, null, 1269969495);
		}
	}

	@OriginalMember(owner = "client!ajy", name = "u", descriptor = "(I)V")
	@Override
	public void method13821(@OriginalArg(0) int arg0) {
		if (this.aClass105_4 != null) {
			this.aClass105_4.method7404();
		}
	}

	@OriginalMember(owner = "client!ajy", name = "gw", descriptor = "(Lclient!di;)V")
	@Override
	void method24593(@OriginalArg(0) Class102 arg0) {
	}

	@OriginalMember(owner = "client!ajy", name = "gi", descriptor = "(Lclient!di;)V")
	@Override
	void method24607(@OriginalArg(0) Class102 arg0) {
	}

	@OriginalMember(owner = "client!ajy", name = "bi", descriptor = "(Lclient!di;I)Lclient!dn;")
	Class105 method13848(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass105_4 != null && arg0.method21083(this.aClass105_4.method7326(), arg1) == 0) {
			return this.aClass105_4;
		} else {
			@Pc(20) Class44 local20 = this.method13845(arg0, arg1, false, (byte) 0);
			return local20 == null ? null : (Class105) local20.anObject1;
		}
	}

	@OriginalMember(owner = "client!ajy", name = "bu", descriptor = "(Lclient!di;I)Lclient!dn;")
	Class105 method13849(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass105_4 != null && arg0.method21083(this.aClass105_4.method7326(), arg1) == 0) {
			return this.aClass105_4;
		} else {
			@Pc(20) Class44 local20 = this.method13845(arg0, arg1, false, (byte) 0);
			return local20 == null ? null : (Class105) local20.anObject1;
		}
	}

	@OriginalMember(owner = "client!ajy", name = "fh", descriptor = "(Lclient!di;B)V")
	@Override
	void method24572(@OriginalArg(0) Class102 arg0, @OriginalArg(1) byte arg1) {
	}
}
