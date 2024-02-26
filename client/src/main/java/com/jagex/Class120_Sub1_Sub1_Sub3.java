package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ajl")
public final class Class120_Sub1_Sub1_Sub3 extends Class120_Sub1_Sub1 implements Interface60 {

	@OriginalMember(owner = "client!ajl", name = "w", descriptor = "Lclient!uc;")
	Class589 aClass589_5;

	@OriginalMember(owner = "client!ajl", name = "s", descriptor = "Lclient!aod;")
	Class41_Sub3 aClass41_Sub3_4;

	@OriginalMember(owner = "client!ajl", name = "r", descriptor = "I")
	final int anInt1456;

	@OriginalMember(owner = "client!ajl", name = "d", descriptor = "Z")
	final boolean aBoolean324;

	@OriginalMember(owner = "client!ajl", name = "q", descriptor = "B")
	final byte aByte45;

	@OriginalMember(owner = "client!ajl", name = "h", descriptor = "B")
	final byte aByte44;

	@OriginalMember(owner = "client!ajl", name = "z", descriptor = "Z")
	boolean aBoolean322;

	@OriginalMember(owner = "client!ajl", name = "p", descriptor = "Z")
	boolean aBoolean325;

	@OriginalMember(owner = "client!ajl", name = "v", descriptor = "Z")
	boolean aBoolean323;

	@OriginalMember(owner = "client!ajl", name = "y", descriptor = "Z")
	final boolean aBoolean326;

	@OriginalMember(owner = "client!ajl", name = "n", descriptor = "I")
	int anInt1457;

	@OriginalMember(owner = "client!ajl", name = "k", descriptor = "Lclient!dn;")
	Class105 aClass105_2;

	@OriginalMember(owner = "client!ajl", name = "x", descriptor = "Lclient!arx;")
	Class80_Sub1_Sub10 aClass80_Sub1_Sub10_2;

	@OriginalMember(owner = "client!ajl", name = "bq", descriptor = "(II)B")
	static byte method13298(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Class607.aClass607_20.anInt5396 * 1323580581 == arg0) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ajl", name = "bd", descriptor = "(II)B")
	static byte method13299(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Class607.aClass607_20.anInt5396 * 1323580581 == arg0) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ajl", name = "<init>", descriptor = "(Lclient!te;Lclient!di;Lclient!aod;Lclient!vv;IIIIIZIIIIIIZZLclient!oc;)V")
	public Class120_Sub1_Sub1_Sub3(@OriginalArg(0) Class570 arg0, @OriginalArg(1) Class102 arg1, @OriginalArg(2) Class41_Sub3 arg2, @OriginalArg(3) Class625 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) boolean arg16, @OriginalArg(17) boolean arg17, @OriginalArg(18) Class457 arg18) {
		super(arg0, arg4, arg5, arg6, arg7, arg8, arg10, arg11, arg12, arg13, arg3.anInt5526 * -1859673749 == 1, Class143_Sub4.method11767(arg14, arg15, 337970687), arg18);
		this.aClass41_Sub3_4 = arg2;
		this.anInt1456 = arg3.anInt5499 * 2041033043;
		this.aByte100 = (byte) arg5;
		this.aBoolean324 = arg9;
		this.aByte45 = (byte) arg14;
		this.aByte44 = (byte) arg15;
		this.aBoolean322 = arg3.anInt5506 * 350558937 != 0 && !arg9;
		this.aBoolean325 = arg16;
		this.aBoolean323 = arg1.method20667() && arg3.aBoolean951 && !this.aBoolean324 && Class703.aClass80_Sub37_49.aClass165_Sub22_1.method16266(655558036) != 0;
		this.aBoolean326 = arg17;
		this.anInt1457 = arg7 * -821518041;
		@Pc(94) int local94 = 2048;
		if (this.aBoolean325) {
			local94 |= 0x10000;
		}
		if (arg3.aBoolean953) {
			local94 |= 0x80000;
		}
		@Pc(116) Class44 local116 = this.method13297(arg1, local94, this.aBoolean323, -1916377007);
		if (local116 != null) {
			this.aClass105_2 = (Class105) local116.anObject1;
			this.aClass80_Sub1_Sub10_2 = (Class80_Sub1_Sub10) local116.anObject2;
			if (this.aBoolean325 || arg3.aBoolean953) {
				this.aClass105_2 = this.aClass105_2.method7324((byte) 0, local94, false);
				if (arg3.aBoolean953) {
					@Pc(150) Class535 local150 = client.aClass539_1.method30897(-1984917905);
					this.aClass105_2.method7380(local150.anInt5078 * -228215283, local150.anInt5080 * -1186866959, local150.anInt5079 * -1890181955, local150.anInt5077 * 140891643);
				}
			}
		}
		this.method24581(1, (byte) 14);
	}

	@OriginalMember(owner = "client!ajl", name = "v", descriptor = "(Lclient!di;)V")
	@Override
	public void method13827(@OriginalArg(0) Class102 arg0) {
		@Pc(1) Class80_Sub1_Sub10 local1 = null;
		if (this.aClass80_Sub1_Sub10_2 == null && this.aBoolean323) {
			@Pc(15) Class44 local15 = this.method13297(arg0, 262144, true, -1769934490);
			local1 = (Class80_Sub1_Sub10) (local15 == null ? null : local15.anObject2);
		} else {
			local1 = this.aClass80_Sub1_Sub10_2;
			this.aClass80_Sub1_Sub10_2 = null;
		}
		@Pc(35) Class463 local35 = this.method24552().aClass463_61;
		if (local1 != null) {
			this.aClass570_23.method31588(local1, this.aByte100, (int) local35.aFloat297, (int) local35.aFloat296, null, 1793725433);
		}
	}

	@OriginalMember(owner = "client!ajl", name = "bo", descriptor = "(I)Z")
	@Override
	boolean method24567(@OriginalArg(0) int arg0) {
		if (this.aClass105_2 == null) {
			return true;
		} else {
			return !this.aClass105_2.method7383();
		}
	}

	@OriginalMember(owner = "client!ajl", name = "fw", descriptor = "(Lclient!di;III)Z")
	@Override
	boolean method24583(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) Class472 local10 = ((Class625) this.aClass41_Sub3_4.method18054(this.anInt1456 * 1973584373, 1519591)).aClass472_2;
		if (local10 != null) {
			return arg0.method20733(arg1, arg2, this.method24526(), local10, 92868112);
		}
		@Pc(28) Class105 local28 = this.method13296(arg0, 131072, (byte) -52);
		if (local28 == null) {
			return false;
		} else {
			@Pc(34) Class471 local34 = this.method24526();
			return local28.method7360(arg1, arg2, local34, false, 0);
		}
	}

	@OriginalMember(owner = "client!ajl", name = "fz", descriptor = "(Lclient!di;I)Lclient!uc;")
	@Override
	public Class589 method24573(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class463 local3 = this.method24552().aClass463_61;
		if (this.aClass589_5 == null) {
			this.aClass589_5 = Class67.method1243((int) local3.aFloat297, (int) local3.aFloat295, (int) local3.aFloat296, this.method13296(arg0, 0, (byte) -29), (byte) -14);
		}
		return this.aClass589_5;
	}

	@OriginalMember(owner = "client!ajl", name = "cd", descriptor = "(Lclient!di;I)Lclient!dn;")
	Class105 method13293(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass105_2 != null && arg0.method21083(this.aClass105_2.method7326(), arg1) == 0) {
			return this.aClass105_2;
		} else {
			@Pc(19) Class44 local19 = this.method13297(arg0, arg1, false, -1378644367);
			return local19 == null ? null : (Class105) local19.anObject1;
		}
	}

	@OriginalMember(owner = "client!ajl", name = "cv", descriptor = "(Lclient!di;I)Lclient!dn;")
	Class105 method13294(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass105_2 != null && arg0.method21083(this.aClass105_2.method7326(), arg1) == 0) {
			return this.aClass105_2;
		} else {
			@Pc(19) Class44 local19 = this.method13297(arg0, arg1, false, -1487617249);
			return local19 == null ? null : (Class105) local19.anObject1;
		}
	}

	@OriginalMember(owner = "client!ajl", name = "u", descriptor = "(I)V")
	@Override
	public void method13821(@OriginalArg(0) int arg0) {
		if (this.aClass105_2 != null) {
			this.aClass105_2.method7404();
		}
	}

	@OriginalMember(owner = "client!ajl", name = "fn", descriptor = "(Lclient!di;I)Lclient!tj;")
	@Override
	Class573 method24571(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass105_2 == null) {
			return null;
		}
		@Pc(8) Class471 local8 = this.method24526();
		@Pc(13) Class573 local13 = Class454.method29307(this.aBoolean322, 262305058);
		@Pc(24) Class472 local24 = ((Class625) this.aClass41_Sub3_4.method18054(this.anInt1456 * 1973584373, 1330928305)).aClass472_2;
		if (local24 == null) {
			this.aClass105_2.method7359(local8, this.aClass246Array21[0], 0);
		} else {
			this.aClass105_2.method7359(local8, null, 0);
			arg0.method20735(local8, this.aClass246Array21[0], local24);
		}
		return local13;
	}

	@OriginalMember(owner = "client!ajl", name = "fh", descriptor = "(Lclient!di;B)V")
	@Override
	void method24572(@OriginalArg(0) Class102 arg0, @OriginalArg(1) byte arg1) {
	}

	@OriginalMember(owner = "client!ajl", name = "d", descriptor = "()Z")
	@Override
	public boolean method13836() {
		return this.aBoolean326;
	}

	@OriginalMember(owner = "client!ajl", name = "fo", descriptor = "(B)Z")
	@Override
	boolean method24566(@OriginalArg(0) byte arg0) {
		return this.aBoolean325;
	}

	@OriginalMember(owner = "client!ajl", name = "gp", descriptor = "(Lclient!di;)V")
	@Override
	void method24608(@OriginalArg(0) Class102 arg0) {
	}

	@OriginalMember(owner = "client!ajl", name = "fg", descriptor = "(Lclient!di;)Lclient!tj;")
	@Override
	Class573 method24594(@OriginalArg(0) Class102 arg0) {
		if (this.aClass105_2 == null) {
			return null;
		}
		@Pc(8) Class471 local8 = this.method24526();
		@Pc(13) Class573 local13 = Class454.method29307(this.aBoolean322, 744015854);
		@Pc(24) Class472 local24 = ((Class625) this.aClass41_Sub3_4.method18054(this.anInt1456 * 1973584373, -1002970505)).aClass472_2;
		if (local24 == null) {
			this.aClass105_2.method7359(local8, this.aClass246Array21[0], 0);
		} else {
			this.aClass105_2.method7359(local8, null, 0);
			arg0.method20735(local8, this.aClass246Array21[0], local24);
		}
		return local13;
	}

	@OriginalMember(owner = "client!ajl", name = "ck", descriptor = "()Z")
	@Override
	boolean method24595() {
		if (this.aClass105_2 == null) {
			return true;
		} else {
			return !this.aClass105_2.method7383();
		}
	}

	@OriginalMember(owner = "client!ajl", name = "f", descriptor = "(I)I")
	@Override
	public int method13819(@OriginalArg(0) int arg0) {
		return this.aByte45;
	}

	@OriginalMember(owner = "client!ajl", name = "bb", descriptor = "(I)I")
	@Override
	public int method24578(@OriginalArg(0) int arg0) {
		return this.aClass105_2 == null ? 0 : this.aClass105_2.method7366();
	}

	@OriginalMember(owner = "client!ajl", name = "fb", descriptor = "(I)V")
	@Override
	void method24570(@OriginalArg(0) int arg0) {
		this.aBoolean325 = false;
		if (this.aClass105_2 != null) {
			this.aClass105_2.method7422(this.aClass105_2.method7326() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!ajl", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method13823(@OriginalArg(0) int arg0) {
		return this.aBoolean326;
	}

	@OriginalMember(owner = "client!ajl", name = "fy", descriptor = "(Lclient!di;Lclient!alf;IIIZI)V")
	@Override
	void method24569(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6) {
		if (arg1 instanceof Class120_Sub1_Sub2_Sub1) {
			@Pc(5) Class120_Sub1_Sub2_Sub1 local5 = (Class120_Sub1_Sub2_Sub1) arg1;
			if (this.aClass105_2 != null && local5.aClass105_1 != null) {
				this.aClass105_2.method7353(local5.aClass105_1, arg2, arg3, arg4, arg5);
			}
		} else if (arg1 instanceof Class120_Sub1_Sub1_Sub3) {
			@Pc(29) Class120_Sub1_Sub1_Sub3 local29 = (Class120_Sub1_Sub1_Sub3) arg1;
			if (this.aClass105_2 != null && local29.aClass105_2 != null) {
				this.aClass105_2.method7353(local29.aClass105_2, arg2, arg3, arg4, arg5);
			}
		}
	}

	@OriginalMember(owner = "client!ajl", name = "i", descriptor = "(Lclient!di;I)V")
	@Override
	public void method13831(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) Class80_Sub1_Sub10 local1 = null;
		if (this.aClass80_Sub1_Sub10_2 == null && this.aBoolean323) {
			@Pc(15) Class44 local15 = this.method13297(arg0, 262144, true, -1055729585);
			local1 = (Class80_Sub1_Sub10) (local15 == null ? null : local15.anObject2);
		} else {
			local1 = this.aClass80_Sub1_Sub10_2;
			this.aClass80_Sub1_Sub10_2 = null;
		}
		@Pc(35) Class463 local35 = this.method24552().aClass463_61;
		if (local1 != null) {
			this.aClass570_23.method31587(local1, this.aByte100, (int) local35.aFloat297, (int) local35.aFloat296, null, 1149146309);
		}
	}

	@OriginalMember(owner = "client!ajl", name = "m", descriptor = "(Lclient!di;I)V")
	@Override
	public void method13825(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) Class80_Sub1_Sub10 local1 = null;
		if (this.aClass80_Sub1_Sub10_2 == null && this.aBoolean323) {
			@Pc(15) Class44 local15 = this.method13297(arg0, 262144, true, -871858225);
			local1 = (Class80_Sub1_Sub10) (local15 == null ? null : local15.anObject2);
		} else {
			local1 = this.aClass80_Sub1_Sub10_2;
			this.aClass80_Sub1_Sub10_2 = null;
		}
		@Pc(35) Class463 local35 = this.method24552().aClass463_61;
		if (local1 != null) {
			this.aClass570_23.method31588(local1, this.aByte100, (int) local35.aFloat297, (int) local35.aFloat296, null, -249896378);
		}
	}

	@OriginalMember(owner = "client!ajl", name = "bm", descriptor = "(I)I")
	public int method13295(@OriginalArg(0) int arg0) {
		return this.aClass105_2 == null ? 15 : this.aClass105_2.method7362() / 4;
	}

	@OriginalMember(owner = "client!ajl", name = "j", descriptor = "()I")
	@Override
	public int method13842() {
		return this.anInt1456 * 1973584373;
	}

	@OriginalMember(owner = "client!ajl", name = "a", descriptor = "()I")
	@Override
	public int method13828() {
		return this.anInt1456 * 1973584373;
	}

	@OriginalMember(owner = "client!ajl", name = "s", descriptor = "()I")
	@Override
	public int method13829() {
		return this.anInt1456 * 1973584373;
	}

	@OriginalMember(owner = "client!ajl", name = "k", descriptor = "()I")
	@Override
	public int method13818() {
		return this.aByte45;
	}

	@OriginalMember(owner = "client!ajl", name = "x", descriptor = "()V")
	@Override
	public void method13832() {
		if (this.aClass105_2 != null) {
			this.aClass105_2.method7404();
		}
	}

	@OriginalMember(owner = "client!ajl", name = "w", descriptor = "()V")
	@Override
	public void method13830() {
		if (this.aClass105_2 != null) {
			this.aClass105_2.method7404();
		}
	}

	@OriginalMember(owner = "client!ajl", name = "r", descriptor = "()Z")
	@Override
	public boolean method13833() {
		return this.aBoolean323;
	}

	@OriginalMember(owner = "client!ajl", name = "gi", descriptor = "(Lclient!di;)V")
	@Override
	void method24607(@OriginalArg(0) Class102 arg0) {
	}

	@OriginalMember(owner = "client!ajl", name = "ca", descriptor = "()Z")
	@Override
	boolean method24616() {
		return this.aClass105_2 == null ? false : this.aClass105_2.method7395();
	}

	@OriginalMember(owner = "client!ajl", name = "ci", descriptor = "()I")
	@Override
	public int method24585() {
		return this.aClass105_2 == null ? 0 : this.aClass105_2.method7366();
	}

	@OriginalMember(owner = "client!ajl", name = "t", descriptor = "(B)I")
	@Override
	public int method13834(@OriginalArg(0) byte arg0) {
		return this.anInt1456 * 1973584373;
	}

	@OriginalMember(owner = "client!ajl", name = "p", descriptor = "(Lclient!di;)V")
	@Override
	public void method13838(@OriginalArg(0) Class102 arg0) {
		@Pc(1) Class80_Sub1_Sub10 local1 = null;
		if (this.aClass80_Sub1_Sub10_2 == null && this.aBoolean323) {
			@Pc(15) Class44 local15 = this.method13297(arg0, 262144, true, -669621416);
			local1 = (Class80_Sub1_Sub10) (local15 == null ? null : local15.anObject2);
		} else {
			local1 = this.aClass80_Sub1_Sub10_2;
			this.aClass80_Sub1_Sub10_2 = null;
		}
		@Pc(35) Class463 local35 = this.method24552().aClass463_61;
		if (local1 != null) {
			this.aClass570_23.method31588(local1, this.aByte100, (int) local35.aFloat297, (int) local35.aFloat296, null, 1450469180);
		}
	}

	@OriginalMember(owner = "client!ajl", name = "l", descriptor = "(I)Z")
	@Override
	public boolean method13822(@OriginalArg(0) int arg0) {
		return this.aBoolean323;
	}

	@OriginalMember(owner = "client!ajl", name = "y", descriptor = "(Lclient!di;)V")
	@Override
	public void method13840(@OriginalArg(0) Class102 arg0) {
		@Pc(1) Class80_Sub1_Sub10 local1 = null;
		if (this.aClass80_Sub1_Sub10_2 == null && this.aBoolean323) {
			@Pc(15) Class44 local15 = this.method13297(arg0, 262144, true, -628504405);
			local1 = (Class80_Sub1_Sub10) (local15 == null ? null : local15.anObject2);
		} else {
			local1 = this.aClass80_Sub1_Sub10_2;
			this.aClass80_Sub1_Sub10_2 = null;
		}
		@Pc(35) Class463 local35 = this.method24552().aClass463_61;
		if (local1 != null) {
			this.aClass570_23.method31588(local1, this.aByte100, (int) local35.aFloat297, (int) local35.aFloat296, null, -1006250465);
		}
	}

	@OriginalMember(owner = "client!ajl", name = "n", descriptor = "(Lclient!di;)V")
	@Override
	public void method13841(@OriginalArg(0) Class102 arg0) {
		@Pc(1) Class80_Sub1_Sub10 local1 = null;
		if (this.aClass80_Sub1_Sub10_2 == null && this.aBoolean323) {
			@Pc(15) Class44 local15 = this.method13297(arg0, 262144, true, -357712071);
			local1 = (Class80_Sub1_Sub10) (local15 == null ? null : local15.anObject2);
		} else {
			local1 = this.aClass80_Sub1_Sub10_2;
			this.aClass80_Sub1_Sub10_2 = null;
		}
		@Pc(35) Class463 local35 = this.method24552().aClass463_61;
		if (local1 != null) {
			this.aClass570_23.method31588(local1, this.aByte100, (int) local35.aFloat297, (int) local35.aFloat296, null, -1056960451);
		}
	}

	@OriginalMember(owner = "client!ajl", name = "bi", descriptor = "(Lclient!di;IB)Lclient!dn;")
	Class105 method13296(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		if (this.aClass105_2 != null && arg0.method21083(this.aClass105_2.method7326(), arg1) == 0) {
			return this.aClass105_2;
		} else {
			@Pc(19) Class44 local19 = this.method13297(arg0, arg1, false, -1708089671);
			return local19 == null ? null : (Class105) local19.anObject1;
		}
	}

	@OriginalMember(owner = "client!ajl", name = "bu", descriptor = "(Lclient!di;IZI)Lclient!abt;")
	Class44 method13297(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		@Pc(9) Class625 local9 = (Class625) this.aClass41_Sub3_4.method18054(this.anInt1456 * 1973584373, 954034094);
		@Pc(19) Class100 local19;
		@Pc(25) Class100 local25;
		if (this.aBoolean324) {
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
		return local9.method32460(arg0, arg1, Class607.aClass607_22.anInt5396 * 1323580581 == this.aByte45 ? Class607.aClass607_21.anInt5396 * 1323580581 : this.aByte45, Class607.aClass607_22.anInt5396 * 1323580581 == this.aByte45 ? this.aByte44 + 4 : this.aByte44, local19, local25, (int) local53.aFloat297, this.anInt1457 * 134397591, (int) local53.aFloat296, arg2, null, (byte) 13);
	}

	@OriginalMember(owner = "client!ajl", name = "gk", descriptor = "(Lclient!di;Lclient!alf;IIIZ)V")
	@Override
	void method24602(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (arg1 instanceof Class120_Sub1_Sub2_Sub1) {
			@Pc(5) Class120_Sub1_Sub2_Sub1 local5 = (Class120_Sub1_Sub2_Sub1) arg1;
			if (this.aClass105_2 != null && local5.aClass105_1 != null) {
				this.aClass105_2.method7353(local5.aClass105_1, arg2, arg3, arg4, arg5);
			}
		} else if (arg1 instanceof Class120_Sub1_Sub1_Sub3) {
			@Pc(29) Class120_Sub1_Sub1_Sub3 local29 = (Class120_Sub1_Sub1_Sub3) arg1;
			if (this.aClass105_2 != null && local29.aClass105_2 != null) {
				this.aClass105_2.method7353(local29.aClass105_2, arg2, arg3, arg4, arg5);
			}
		}
	}

	@OriginalMember(owner = "client!ajl", name = "gg", descriptor = "()V")
	@Override
	void method24603() {
		this.aBoolean325 = false;
		if (this.aClass105_2 != null) {
			this.aClass105_2.method7422(this.aClass105_2.method7326() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!ajl", name = "fs", descriptor = "()Z")
	@Override
	boolean method24596() {
		return this.aBoolean325;
	}

	@OriginalMember(owner = "client!ajl", name = "cp", descriptor = "()I")
	@Override
	public int method24587() {
		return this.aClass105_2 == null ? 0 : this.aClass105_2.method7366();
	}

	@OriginalMember(owner = "client!ajl", name = "cg", descriptor = "()I")
	@Override
	public int method24588() {
		return this.aClass105_2 == null ? 0 : this.aClass105_2.method7366();
	}

	@OriginalMember(owner = "client!ajl", name = "fd", descriptor = "(Lclient!di;)Lclient!uc;")
	@Override
	public Class589 method24589(@OriginalArg(0) Class102 arg0) {
		@Pc(3) Class463 local3 = this.method24552().aClass463_61;
		if (this.aClass589_5 == null) {
			this.aClass589_5 = Class67.method1243((int) local3.aFloat297, (int) local3.aFloat295, (int) local3.aFloat296, this.method13296(arg0, 0, (byte) -25), (byte) -11);
		}
		return this.aClass589_5;
	}

	@OriginalMember(owner = "client!ajl", name = "fc", descriptor = "(Lclient!di;)Lclient!tj;")
	@Override
	Class573 method24592(@OriginalArg(0) Class102 arg0) {
		if (this.aClass105_2 == null) {
			return null;
		}
		@Pc(8) Class471 local8 = this.method24526();
		@Pc(13) Class573 local13 = Class454.method29307(this.aBoolean322, -1412031217);
		@Pc(24) Class472 local24 = ((Class625) this.aClass41_Sub3_4.method18054(this.anInt1456 * 1973584373, -1318853050)).aClass472_2;
		if (local24 == null) {
			this.aClass105_2.method7359(local8, this.aClass246Array21[0], 0);
		} else {
			this.aClass105_2.method7359(local8, null, 0);
			arg0.method20735(local8, this.aClass246Array21[0], local24);
		}
		return local13;
	}

	@OriginalMember(owner = "client!ajl", name = "fl", descriptor = "(Lclient!di;)Lclient!tj;")
	@Override
	Class573 method24597(@OriginalArg(0) Class102 arg0) {
		if (this.aClass105_2 == null) {
			return null;
		}
		@Pc(8) Class471 local8 = this.method24526();
		@Pc(13) Class573 local13 = Class454.method29307(this.aBoolean322, -1249077386);
		@Pc(24) Class472 local24 = ((Class625) this.aClass41_Sub3_4.method18054(this.anInt1456 * 1973584373, -1011392323)).aClass472_2;
		if (local24 == null) {
			this.aClass105_2.method7359(local8, this.aClass246Array21[0], 0);
		} else {
			this.aClass105_2.method7359(local8, null, 0);
			arg0.method20735(local8, this.aClass246Array21[0], local24);
		}
		return local13;
	}

	@OriginalMember(owner = "client!ajl", name = "bc", descriptor = "(I)Z")
	@Override
	boolean method24565(@OriginalArg(0) int arg0) {
		return this.aClass105_2 == null ? false : this.aClass105_2.method7395();
	}

	@OriginalMember(owner = "client!ajl", name = "ft", descriptor = "(Lclient!di;II)Z")
	@Override
	boolean method24563(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(10) Class472 local10 = ((Class625) this.aClass41_Sub3_4.method18054(this.anInt1456 * 1973584373, -80983087)).aClass472_2;
		if (local10 != null) {
			return arg0.method20733(arg1, arg2, this.method24526(), local10, 92868112);
		}
		@Pc(28) Class105 local28 = this.method13296(arg0, 131072, (byte) -77);
		if (local28 == null) {
			return false;
		} else {
			@Pc(34) Class471 local34 = this.method24526();
			return local28.method7360(arg1, arg2, local34, false, 0);
		}
	}

	@OriginalMember(owner = "client!ajl", name = "q", descriptor = "()Z")
	@Override
	public boolean method13839() {
		return this.aBoolean323;
	}

	@OriginalMember(owner = "client!ajl", name = "fu", descriptor = "()Z")
	@Override
	boolean method24606() {
		return this.aBoolean325;
	}

	@OriginalMember(owner = "client!ajl", name = "ff", descriptor = "(Lclient!di;Lclient!alf;IIIZ)V")
	@Override
	void method24598(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (arg1 instanceof Class120_Sub1_Sub2_Sub1) {
			@Pc(5) Class120_Sub1_Sub2_Sub1 local5 = (Class120_Sub1_Sub2_Sub1) arg1;
			if (this.aClass105_2 != null && local5.aClass105_1 != null) {
				this.aClass105_2.method7353(local5.aClass105_1, arg2, arg3, arg4, arg5);
			}
		} else if (arg1 instanceof Class120_Sub1_Sub1_Sub3) {
			@Pc(29) Class120_Sub1_Sub1_Sub3 local29 = (Class120_Sub1_Sub1_Sub3) arg1;
			if (this.aClass105_2 != null && local29.aClass105_2 != null) {
				this.aClass105_2.method7353(local29.aClass105_2, arg2, arg3, arg4, arg5);
			}
		}
	}

	@OriginalMember(owner = "client!ajl", name = "fr", descriptor = "(Lclient!di;Lclient!alf;IIIZ)V")
	@Override
	void method24562(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (arg1 instanceof Class120_Sub1_Sub2_Sub1) {
			@Pc(5) Class120_Sub1_Sub2_Sub1 local5 = (Class120_Sub1_Sub2_Sub1) arg1;
			if (this.aClass105_2 != null && local5.aClass105_1 != null) {
				this.aClass105_2.method7353(local5.aClass105_1, arg2, arg3, arg4, arg5);
			}
		} else if (arg1 instanceof Class120_Sub1_Sub1_Sub3) {
			@Pc(29) Class120_Sub1_Sub1_Sub3 local29 = (Class120_Sub1_Sub1_Sub3) arg1;
			if (this.aClass105_2 != null && local29.aClass105_2 != null) {
				this.aClass105_2.method7353(local29.aClass105_2, arg2, arg3, arg4, arg5);
			}
		}
	}

	@OriginalMember(owner = "client!ajl", name = "fi", descriptor = "(Lclient!di;Lclient!alf;IIIZ)V")
	@Override
	void method24599(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (arg1 instanceof Class120_Sub1_Sub2_Sub1) {
			@Pc(5) Class120_Sub1_Sub2_Sub1 local5 = (Class120_Sub1_Sub2_Sub1) arg1;
			if (this.aClass105_2 != null && local5.aClass105_1 != null) {
				this.aClass105_2.method7353(local5.aClass105_1, arg2, arg3, arg4, arg5);
			}
		} else if (arg1 instanceof Class120_Sub1_Sub1_Sub3) {
			@Pc(29) Class120_Sub1_Sub1_Sub3 local29 = (Class120_Sub1_Sub1_Sub3) arg1;
			if (this.aClass105_2 != null && local29.aClass105_2 != null) {
				this.aClass105_2.method7353(local29.aClass105_2, arg2, arg3, arg4, arg5);
			}
		}
	}

	@OriginalMember(owner = "client!ajl", name = "gh", descriptor = "(Lclient!di;Lclient!alf;IIIZ)V")
	@Override
	void method24600(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (arg1 instanceof Class120_Sub1_Sub2_Sub1) {
			@Pc(5) Class120_Sub1_Sub2_Sub1 local5 = (Class120_Sub1_Sub2_Sub1) arg1;
			if (this.aClass105_2 != null && local5.aClass105_1 != null) {
				this.aClass105_2.method7353(local5.aClass105_1, arg2, arg3, arg4, arg5);
			}
		} else if (arg1 instanceof Class120_Sub1_Sub1_Sub3) {
			@Pc(29) Class120_Sub1_Sub1_Sub3 local29 = (Class120_Sub1_Sub1_Sub3) arg1;
			if (this.aClass105_2 != null && local29.aClass105_2 != null) {
				this.aClass105_2.method7353(local29.aClass105_2, arg2, arg3, arg4, arg5);
			}
		}
	}

	@OriginalMember(owner = "client!ajl", name = "gz", descriptor = "(Lclient!di;Lclient!alf;IIIZ)V")
	@Override
	void method24580(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (arg1 instanceof Class120_Sub1_Sub2_Sub1) {
			@Pc(5) Class120_Sub1_Sub2_Sub1 local5 = (Class120_Sub1_Sub2_Sub1) arg1;
			if (this.aClass105_2 != null && local5.aClass105_1 != null) {
				this.aClass105_2.method7353(local5.aClass105_1, arg2, arg3, arg4, arg5);
			}
		} else if (arg1 instanceof Class120_Sub1_Sub1_Sub3) {
			@Pc(29) Class120_Sub1_Sub1_Sub3 local29 = (Class120_Sub1_Sub1_Sub3) arg1;
			if (this.aClass105_2 != null && local29.aClass105_2 != null) {
				this.aClass105_2.method7353(local29.aClass105_2, arg2, arg3, arg4, arg5);
			}
		}
	}

	@OriginalMember(owner = "client!ajl", name = "o", descriptor = "()I")
	@Override
	public int method13824() {
		return this.anInt1456 * 1973584373;
	}

	@OriginalMember(owner = "client!ajl", name = "h", descriptor = "()Z")
	@Override
	public boolean method13835() {
		return this.aBoolean326;
	}

	@OriginalMember(owner = "client!ajl", name = "ge", descriptor = "()V")
	@Override
	void method24590() {
		this.aBoolean325 = false;
		if (this.aClass105_2 != null) {
			this.aClass105_2.method7422(this.aClass105_2.method7326() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!ajl", name = "z", descriptor = "(Lclient!di;)V")
	@Override
	public void method13837(@OriginalArg(0) Class102 arg0) {
		@Pc(1) Class80_Sub1_Sub10 local1 = null;
		if (this.aClass80_Sub1_Sub10_2 == null && this.aBoolean323) {
			@Pc(15) Class44 local15 = this.method13297(arg0, 262144, true, -1055448246);
			local1 = (Class80_Sub1_Sub10) (local15 == null ? null : local15.anObject2);
		} else {
			local1 = this.aClass80_Sub1_Sub10_2;
			this.aClass80_Sub1_Sub10_2 = null;
		}
		@Pc(35) Class463 local35 = this.method24552().aClass463_61;
		if (local1 != null) {
			this.aClass570_23.method31588(local1, this.aByte100, (int) local35.aFloat297, (int) local35.aFloat296, null, -440158376);
		}
	}

	@OriginalMember(owner = "client!ajl", name = "b", descriptor = "()I")
	@Override
	public int method13843() {
		return this.aByte44;
	}

	@OriginalMember(owner = "client!ajl", name = "ax", descriptor = "(Lclient!di;)V")
	@Override
	public void method13844(@OriginalArg(0) Class102 arg0) {
		@Pc(1) Class80_Sub1_Sub10 local1 = null;
		if (this.aClass80_Sub1_Sub10_2 == null && this.aBoolean323) {
			@Pc(15) Class44 local15 = this.method13297(arg0, 262144, true, -1712100491);
			local1 = (Class80_Sub1_Sub10) (local15 == null ? null : local15.anObject2);
		} else {
			local1 = this.aClass80_Sub1_Sub10_2;
			this.aClass80_Sub1_Sub10_2 = null;
		}
		@Pc(35) Class463 local35 = this.method24552().aClass463_61;
		if (local1 != null) {
			this.aClass570_23.method31587(local1, this.aByte100, (int) local35.aFloat297, (int) local35.aFloat296, null, 1331626677);
		}
	}

	@OriginalMember(owner = "client!ajl", name = "gb", descriptor = "(Lclient!di;)V")
	@Override
	void method24605(@OriginalArg(0) Class102 arg0) {
	}

	@OriginalMember(owner = "client!ajl", name = "gw", descriptor = "(Lclient!di;)V")
	@Override
	void method24593(@OriginalArg(0) Class102 arg0) {
	}

	@OriginalMember(owner = "client!ajl", name = "e", descriptor = "(I)I")
	@Override
	public int method13820(@OriginalArg(0) int arg0) {
		return this.aByte44;
	}

	@OriginalMember(owner = "client!ajl", name = "cm", descriptor = "()I")
	@Override
	public int method24622() {
		return this.aClass105_2 == null ? 0 : this.aClass105_2.method7366();
	}

	@OriginalMember(owner = "client!ajl", name = "c", descriptor = "()I")
	@Override
	public int method13826() {
		return this.aByte44;
	}

	@OriginalMember(owner = "client!ajl", name = "cr", descriptor = "()Z")
	@Override
	boolean method24584() {
		return this.aClass105_2 == null ? false : this.aClass105_2.method7395();
	}

	@OriginalMember(owner = "client!ajl", name = "ct", descriptor = "(Lclient!di;IZ)Lclient!abt;")
	Class44 method13300(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(9) Class625 local9 = (Class625) this.aClass41_Sub3_4.method18054(this.anInt1456 * 1973584373, 1421217730);
		@Pc(19) Class100 local19;
		@Pc(25) Class100 local25;
		if (this.aBoolean324) {
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
		return local9.method32460(arg0, arg1, Class607.aClass607_22.anInt5396 * 1323580581 == this.aByte45 ? Class607.aClass607_21.anInt5396 * 1323580581 : this.aByte45, Class607.aClass607_22.anInt5396 * 1323580581 == this.aByte45 ? this.aByte44 + 4 : this.aByte44, local19, local25, (int) local53.aFloat297, this.anInt1457 * 134397591, (int) local53.aFloat296, arg2, null, (byte) 55);
	}
}
