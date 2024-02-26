package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ajm")
public final class Class120_Sub1_Sub4_Sub2 extends Class120_Sub1_Sub4 implements Interface60 {

	@OriginalMember(owner = "client!ajm", name = "w", descriptor = "Lclient!uc;")
	Class589 aClass589_6;

	@OriginalMember(owner = "client!ajm", name = "s", descriptor = "Lclient!aod;")
	Class41_Sub3 aClass41_Sub3_5;

	@OriginalMember(owner = "client!ajm", name = "r", descriptor = "I")
	final int anInt1460;

	@OriginalMember(owner = "client!ajm", name = "h", descriptor = "Z")
	final boolean aBoolean332;

	@OriginalMember(owner = "client!ajm", name = "q", descriptor = "B")
	final byte aByte48;

	@OriginalMember(owner = "client!ajm", name = "d", descriptor = "Z")
	boolean aBoolean331;

	@OriginalMember(owner = "client!ajm", name = "z", descriptor = "Z")
	boolean aBoolean333;

	@OriginalMember(owner = "client!ajm", name = "p", descriptor = "Z")
	boolean aBoolean334;

	@OriginalMember(owner = "client!ajm", name = "v", descriptor = "I")
	int anInt1459;

	@OriginalMember(owner = "client!ajm", name = "k", descriptor = "Lclient!dn;")
	Class105 aClass105_3;

	@OriginalMember(owner = "client!ajm", name = "x", descriptor = "Lclient!arx;")
	Class80_Sub1_Sub10 aClass80_Sub1_Sub10_3;

	@OriginalMember(owner = "client!ajm", name = "<init>", descriptor = "(Lclient!te;Lclient!di;Lclient!aod;Lclient!vv;IIIIIZIZLclient!oc;)V")
	public Class120_Sub1_Sub4_Sub2(@OriginalArg(0) Class570 arg0, @OriginalArg(1) Class102 arg1, @OriginalArg(2) Class41_Sub3 arg2, @OriginalArg(3) Class625 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) Class457 arg12) {
		super(arg0, arg6, arg7, arg8, arg4, arg5, arg3.anInt5527 * 494278413, arg12);
		this.aClass41_Sub3_5 = arg2;
		this.anInt1460 = arg3.anInt5499 * -1713916057;
		this.aBoolean332 = arg9;
		this.aByte48 = (byte) arg10;
		this.aBoolean331 = arg3.anInt5506 * 350558937 != 0 && !arg9;
		this.aBoolean333 = arg11;
		this.aBoolean334 = arg1.method20667() && arg3.aBoolean951 && !this.aBoolean332 && Class703.aClass80_Sub37_49.aClass165_Sub22_1.method16266(262692452) != 0;
		this.anInt1459 = arg7 * 425832141;
		@Pc(69) int local69 = 2048;
		if (this.aBoolean333) {
			local69 |= 0x10000;
		}
		if (arg3.aBoolean953) {
			local69 |= 0x80000;
		}
		@Pc(91) Class44 local91 = this.method13436(arg1, local69, this.aBoolean334, 2073854325);
		if (local91 != null) {
			this.aClass105_3 = (Class105) local91.anObject1;
			this.aClass80_Sub1_Sub10_3 = (Class80_Sub1_Sub10) local91.anObject2;
			if (this.aBoolean333 || arg3.aBoolean953) {
				this.aClass105_3 = this.aClass105_3.method7324((byte) 0, local69, false);
				if (arg3.aBoolean953) {
					@Pc(125) Class535 local125 = client.aClass539_1.method30897(-2093858378);
					this.aClass105_3.method7380(local125.anInt5078 * -228215283, local125.anInt5080 * -1186866959, local125.anInt5079 * -1890181955, local125.anInt5077 * 140891643);
				}
			}
		}
		this.method24581(1, (byte) 14);
	}

	@OriginalMember(owner = "client!ajm", name = "bq", descriptor = "(Lclient!di;IZ)Lclient!abt;")
	Class44 method13433(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(9) Class625 local9 = (Class625) this.aClass41_Sub3_5.method18054(this.anInt1460 * -1500687687, 832326485);
		@Pc(19) Class100 local19;
		@Pc(25) Class100 local25;
		if (this.aBoolean332) {
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
		return local9.method32460(arg0, arg1, Class607.aClass607_10.anInt5396 * 1323580581, this.aByte48, local19, local25, (int) local53.aFloat297, this.anInt1459 * -118886907, (int) local53.aFloat296, arg2, null, (byte) 12);
	}

	@OriginalMember(owner = "client!ajm", name = "bo", descriptor = "(I)Z")
	@Override
	boolean method24567(@OriginalArg(0) int arg0) {
		if (this.aClass105_3 == null) {
			return true;
		} else {
			return !this.aClass105_3.method7383();
		}
	}

	@OriginalMember(owner = "client!ajm", name = "bc", descriptor = "(I)Z")
	@Override
	boolean method24565(@OriginalArg(0) int arg0) {
		return this.aClass105_3 == null ? false : this.aClass105_3.method7395();
	}

	@OriginalMember(owner = "client!ajm", name = "x", descriptor = "()V")
	@Override
	public void method13832() {
		if (this.aClass105_3 != null) {
			this.aClass105_3.method7404();
		}
	}

	@OriginalMember(owner = "client!ajm", name = "bw", descriptor = "(Lclient!di;II)Lclient!dn;")
	Class105 method13434(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass105_3 != null && arg0.method21083(this.aClass105_3.method7326(), arg1) == 0) {
			return this.aClass105_3;
		} else {
			@Pc(19) Class44 local19 = this.method13436(arg0, arg1, false, 2052282935);
			return local19 == null ? null : (Class105) local19.anObject1;
		}
	}

	@OriginalMember(owner = "client!ajm", name = "cp", descriptor = "()I")
	@Override
	public int method24587() {
		return this.aClass105_3 == null ? 0 : this.aClass105_3.method7366();
	}

	@OriginalMember(owner = "client!ajm", name = "fz", descriptor = "(Lclient!di;I)Lclient!uc;")
	@Override
	public Class589 method24573(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class463 local3 = this.method24552().aClass463_61;
		if (this.aClass589_6 == null) {
			this.aClass589_6 = Class67.method1243((int) local3.aFloat297, (int) local3.aFloat295, (int) local3.aFloat296, this.method13434(arg0, 0, 267875955), (byte) -56);
		}
		return this.aClass589_6;
	}

	@OriginalMember(owner = "client!ajm", name = "fn", descriptor = "(Lclient!di;I)Lclient!tj;")
	@Override
	Class573 method24571(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass105_3 == null) {
			return null;
		}
		@Pc(8) Class471 local8 = this.method24526();
		@Pc(13) Class573 local13 = Class454.method29307(this.aBoolean331, -1604530167);
		@Pc(24) Class472 local24 = ((Class625) this.aClass41_Sub3_5.method18054(this.anInt1460 * -1500687687, -1807182367)).aClass472_2;
		if (local24 == null) {
			this.aClass105_3.method7359(local8, this.aClass246Array21[0], 0);
		} else {
			this.aClass105_3.method7359(local8, null, 0);
			arg0.method20735(local8, this.aClass246Array21[0], local24);
		}
		return local13;
	}

	@OriginalMember(owner = "client!ajm", name = "fh", descriptor = "(Lclient!di;B)V")
	@Override
	void method24572(@OriginalArg(0) Class102 arg0, @OriginalArg(1) byte arg1) {
	}

	@OriginalMember(owner = "client!ajm", name = "fw", descriptor = "(Lclient!di;III)Z")
	@Override
	boolean method24583(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) Class472 local10 = ((Class625) this.aClass41_Sub3_5.method18054(this.anInt1460 * -1500687687, 1697284186)).aClass472_2;
		if (local10 != null) {
			return arg0.method20733(arg1, arg2, this.method24526(), local10, 92868112);
		}
		@Pc(27) Class105 local27 = this.method13434(arg0, 131072, 28105054);
		if (local27 == null) {
			return false;
		} else {
			@Pc(33) Class471 local33 = this.method24526();
			return local27.method7360(arg1, arg2, local33, false, 0);
		}
	}

	@OriginalMember(owner = "client!ajm", name = "fo", descriptor = "(B)Z")
	@Override
	boolean method24566(@OriginalArg(0) byte arg0) {
		return this.aBoolean333;
	}

	@OriginalMember(owner = "client!ajm", name = "fy", descriptor = "(Lclient!di;Lclient!alf;IIIZI)V")
	@Override
	void method24569(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6) {
		if (arg1 instanceof Class120_Sub1_Sub4_Sub2) {
			@Pc(5) Class120_Sub1_Sub4_Sub2 local5 = (Class120_Sub1_Sub4_Sub2) arg1;
			if (this.aClass105_3 != null && local5.aClass105_3 != null) {
				this.aClass105_3.method7353(local5.aClass105_3, arg2, arg3, arg4, arg5);
			}
		}
	}

	@OriginalMember(owner = "client!ajm", name = "fb", descriptor = "(I)V")
	@Override
	void method24570(@OriginalArg(0) int arg0) {
		this.aBoolean333 = false;
		if (this.aClass105_3 != null) {
			this.aClass105_3.method7422(this.aClass105_3.method7326() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!ajm", name = "t", descriptor = "(B)I")
	@Override
	public int method13834(@OriginalArg(0) byte arg0) {
		return this.anInt1460 * -1500687687;
	}

	@OriginalMember(owner = "client!ajm", name = "f", descriptor = "(I)I")
	@Override
	public int method13819(@OriginalArg(0) int arg0) {
		return Class607.aClass607_10.anInt5396 * 1323580581;
	}

	@OriginalMember(owner = "client!ajm", name = "gb", descriptor = "(Lclient!di;)V")
	@Override
	void method24605(@OriginalArg(0) Class102 arg0) {
	}

	@OriginalMember(owner = "client!ajm", name = "u", descriptor = "(I)V")
	@Override
	public void method13821(@OriginalArg(0) int arg0) {
		if (this.aClass105_3 != null) {
			this.aClass105_3.method7404();
		}
	}

	@OriginalMember(owner = "client!ajm", name = "s", descriptor = "()I")
	@Override
	public int method13829() {
		return this.anInt1460 * -1500687687;
	}

	@OriginalMember(owner = "client!ajm", name = "j", descriptor = "()I")
	@Override
	public int method13842() {
		return this.anInt1460 * -1500687687;
	}

	@OriginalMember(owner = "client!ajm", name = "fr", descriptor = "(Lclient!di;Lclient!alf;IIIZ)V")
	@Override
	void method24562(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (arg1 instanceof Class120_Sub1_Sub4_Sub2) {
			@Pc(5) Class120_Sub1_Sub4_Sub2 local5 = (Class120_Sub1_Sub4_Sub2) arg1;
			if (this.aClass105_3 != null && local5.aClass105_3 != null) {
				this.aClass105_3.method7353(local5.aClass105_3, arg2, arg3, arg4, arg5);
			}
		}
	}

	@OriginalMember(owner = "client!ajm", name = "m", descriptor = "(Lclient!di;I)V")
	@Override
	public void method13825(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) Class80_Sub1_Sub10 local1 = null;
		if (this.aClass80_Sub1_Sub10_3 == null && this.aBoolean334) {
			@Pc(15) Class44 local15 = this.method13436(arg0, 262144, true, 2061842172);
			local1 = (Class80_Sub1_Sub10) (local15 == null ? null : local15.anObject2);
		} else {
			local1 = this.aClass80_Sub1_Sub10_3;
			this.aClass80_Sub1_Sub10_3 = null;
		}
		@Pc(34) Class463 local34 = this.method24552().aClass463_61;
		if (local1 != null) {
			this.aClass570_23.method31588(local1, this.aByte100, (int) local34.aFloat297, (int) local34.aFloat296, null, 906954022);
		}
	}

	@OriginalMember(owner = "client!ajm", name = "o", descriptor = "()I")
	@Override
	public int method13824() {
		return this.anInt1460 * -1500687687;
	}

	@OriginalMember(owner = "client!ajm", name = "gp", descriptor = "(Lclient!di;)V")
	@Override
	void method24608(@OriginalArg(0) Class102 arg0) {
	}

	@OriginalMember(owner = "client!ajm", name = "bi", descriptor = "(Lclient!di;I)Lclient!dn;")
	Class105 method13435(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass105_3 != null && arg0.method21083(this.aClass105_3.method7326(), arg1) == 0) {
			return this.aClass105_3;
		} else {
			@Pc(19) Class44 local19 = this.method13436(arg0, arg1, false, 2101926464);
			return local19 == null ? null : (Class105) local19.anObject1;
		}
	}

	@OriginalMember(owner = "client!ajm", name = "a", descriptor = "()I")
	@Override
	public int method13828() {
		return this.anInt1460 * -1500687687;
	}

	@OriginalMember(owner = "client!ajm", name = "ca", descriptor = "()Z")
	@Override
	boolean method24616() {
		return this.aClass105_3 == null ? false : this.aClass105_3.method7395();
	}

	@OriginalMember(owner = "client!ajm", name = "bx", descriptor = "(Lclient!di;IZI)Lclient!abt;")
	Class44 method13436(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		@Pc(9) Class625 local9 = (Class625) this.aClass41_Sub3_5.method18054(this.anInt1460 * -1500687687, 2015016151);
		@Pc(19) Class100 local19;
		@Pc(25) Class100 local25;
		if (this.aBoolean332) {
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
		return local9.method32460(arg0, arg1, Class607.aClass607_10.anInt5396 * 1323580581, this.aByte48, local19, local25, (int) local53.aFloat297, this.anInt1459 * -118886907, (int) local53.aFloat296, arg2, null, (byte) 9);
	}

	@OriginalMember(owner = "client!ajm", name = "w", descriptor = "()V")
	@Override
	public void method13830() {
		if (this.aClass105_3 != null) {
			this.aClass105_3.method7404();
		}
	}

	@OriginalMember(owner = "client!ajm", name = "r", descriptor = "()Z")
	@Override
	public boolean method13833() {
		return this.aBoolean334;
	}

	@OriginalMember(owner = "client!ajm", name = "q", descriptor = "()Z")
	@Override
	public boolean method13839() {
		return this.aBoolean334;
	}

	@OriginalMember(owner = "client!ajm", name = "h", descriptor = "()Z")
	@Override
	public boolean method13835() {
		return true;
	}

	@OriginalMember(owner = "client!ajm", name = "d", descriptor = "()Z")
	@Override
	public boolean method13836() {
		return true;
	}

	@OriginalMember(owner = "client!ajm", name = "v", descriptor = "(Lclient!di;)V")
	@Override
	public void method13827(@OriginalArg(0) Class102 arg0) {
		@Pc(1) Class80_Sub1_Sub10 local1 = null;
		if (this.aClass80_Sub1_Sub10_3 == null && this.aBoolean334) {
			@Pc(15) Class44 local15 = this.method13436(arg0, 262144, true, 2124283097);
			local1 = (Class80_Sub1_Sub10) (local15 == null ? null : local15.anObject2);
		} else {
			local1 = this.aClass80_Sub1_Sub10_3;
			this.aClass80_Sub1_Sub10_3 = null;
		}
		@Pc(34) Class463 local34 = this.method24552().aClass463_61;
		if (local1 != null) {
			this.aClass570_23.method31588(local1, this.aByte100, (int) local34.aFloat297, (int) local34.aFloat296, null, -2115249302);
		}
	}

	@OriginalMember(owner = "client!ajm", name = "p", descriptor = "(Lclient!di;)V")
	@Override
	public void method13838(@OriginalArg(0) Class102 arg0) {
		@Pc(1) Class80_Sub1_Sub10 local1 = null;
		if (this.aClass80_Sub1_Sub10_3 == null && this.aBoolean334) {
			@Pc(15) Class44 local15 = this.method13436(arg0, 262144, true, 2061337950);
			local1 = (Class80_Sub1_Sub10) (local15 == null ? null : local15.anObject2);
		} else {
			local1 = this.aClass80_Sub1_Sub10_3;
			this.aClass80_Sub1_Sub10_3 = null;
		}
		@Pc(34) Class463 local34 = this.method24552().aClass463_61;
		if (local1 != null) {
			this.aClass570_23.method31588(local1, this.aByte100, (int) local34.aFloat297, (int) local34.aFloat296, null, 1896081347);
		}
	}

	@OriginalMember(owner = "client!ajm", name = "e", descriptor = "(I)I")
	@Override
	public int method13820(@OriginalArg(0) int arg0) {
		return this.aByte48;
	}

	@OriginalMember(owner = "client!ajm", name = "y", descriptor = "(Lclient!di;)V")
	@Override
	public void method13840(@OriginalArg(0) Class102 arg0) {
		@Pc(1) Class80_Sub1_Sub10 local1 = null;
		if (this.aClass80_Sub1_Sub10_3 == null && this.aBoolean334) {
			@Pc(15) Class44 local15 = this.method13436(arg0, 262144, true, 2037923112);
			local1 = (Class80_Sub1_Sub10) (local15 == null ? null : local15.anObject2);
		} else {
			local1 = this.aClass80_Sub1_Sub10_3;
			this.aClass80_Sub1_Sub10_3 = null;
		}
		@Pc(34) Class463 local34 = this.method24552().aClass463_61;
		if (local1 != null) {
			this.aClass570_23.method31588(local1, this.aByte100, (int) local34.aFloat297, (int) local34.aFloat296, null, -910671872);
		}
	}

	@OriginalMember(owner = "client!ajm", name = "n", descriptor = "(Lclient!di;)V")
	@Override
	public void method13841(@OriginalArg(0) Class102 arg0) {
		@Pc(1) Class80_Sub1_Sub10 local1 = null;
		if (this.aClass80_Sub1_Sub10_3 == null && this.aBoolean334) {
			@Pc(15) Class44 local15 = this.method13436(arg0, 262144, true, 2048540226);
			local1 = (Class80_Sub1_Sub10) (local15 == null ? null : local15.anObject2);
		} else {
			local1 = this.aClass80_Sub1_Sub10_3;
			this.aClass80_Sub1_Sub10_3 = null;
		}
		@Pc(34) Class463 local34 = this.method24552().aClass463_61;
		if (local1 != null) {
			this.aClass570_23.method31588(local1, this.aByte100, (int) local34.aFloat297, (int) local34.aFloat296, null, 1240948419);
		}
	}

	@OriginalMember(owner = "client!ajm", name = "ck", descriptor = "()Z")
	@Override
	boolean method24595() {
		if (this.aClass105_3 == null) {
			return true;
		} else {
			return !this.aClass105_3.method7383();
		}
	}

	@OriginalMember(owner = "client!ajm", name = "ax", descriptor = "(Lclient!di;)V")
	@Override
	public void method13844(@OriginalArg(0) Class102 arg0) {
		@Pc(1) Class80_Sub1_Sub10 local1 = null;
		if (this.aClass80_Sub1_Sub10_3 == null && this.aBoolean334) {
			@Pc(15) Class44 local15 = this.method13436(arg0, 262144, true, 2066043687);
			local1 = (Class80_Sub1_Sub10) (local15 == null ? null : local15.anObject2);
		} else {
			local1 = this.aClass80_Sub1_Sub10_3;
			this.aClass80_Sub1_Sub10_3 = null;
		}
		@Pc(35) Class463 local35 = this.method24552().aClass463_61;
		if (local1 != null) {
			this.aClass570_23.method31587(local1, this.aByte100, (int) local35.aFloat297, (int) local35.aFloat296, null, 1703210775);
		}
	}

	@OriginalMember(owner = "client!ajm", name = "fl", descriptor = "(Lclient!di;)Lclient!tj;")
	@Override
	Class573 method24597(@OriginalArg(0) Class102 arg0) {
		if (this.aClass105_3 == null) {
			return null;
		}
		@Pc(8) Class471 local8 = this.method24526();
		@Pc(13) Class573 local13 = Class454.method29307(this.aBoolean331, 609901412);
		@Pc(24) Class472 local24 = ((Class625) this.aClass41_Sub3_5.method18054(this.anInt1460 * -1500687687, -775882655)).aClass472_2;
		if (local24 == null) {
			this.aClass105_3.method7359(local8, this.aClass246Array21[0], 0);
		} else {
			this.aClass105_3.method7359(local8, null, 0);
			arg0.method20735(local8, this.aClass246Array21[0], local24);
		}
		return local13;
	}

	@OriginalMember(owner = "client!ajm", name = "ci", descriptor = "()I")
	@Override
	public int method24585() {
		return this.aClass105_3 == null ? 0 : this.aClass105_3.method7366();
	}

	@OriginalMember(owner = "client!ajm", name = "cm", descriptor = "()I")
	@Override
	public int method24622() {
		return this.aClass105_3 == null ? 0 : this.aClass105_3.method7366();
	}

	@OriginalMember(owner = "client!ajm", name = "z", descriptor = "(Lclient!di;)V")
	@Override
	public void method13837(@OriginalArg(0) Class102 arg0) {
		@Pc(1) Class80_Sub1_Sub10 local1 = null;
		if (this.aClass80_Sub1_Sub10_3 == null && this.aBoolean334) {
			@Pc(15) Class44 local15 = this.method13436(arg0, 262144, true, 2054586621);
			local1 = (Class80_Sub1_Sub10) (local15 == null ? null : local15.anObject2);
		} else {
			local1 = this.aClass80_Sub1_Sub10_3;
			this.aClass80_Sub1_Sub10_3 = null;
		}
		@Pc(34) Class463 local34 = this.method24552().aClass463_61;
		if (local1 != null) {
			this.aClass570_23.method31588(local1, this.aByte100, (int) local34.aFloat297, (int) local34.aFloat296, null, -1937560078);
		}
	}

	@OriginalMember(owner = "client!ajm", name = "cg", descriptor = "()I")
	@Override
	public int method24588() {
		return this.aClass105_3 == null ? 0 : this.aClass105_3.method7366();
	}

	@OriginalMember(owner = "client!ajm", name = "fd", descriptor = "(Lclient!di;)Lclient!uc;")
	@Override
	public Class589 method24589(@OriginalArg(0) Class102 arg0) {
		@Pc(3) Class463 local3 = this.method24552().aClass463_61;
		if (this.aClass589_6 == null) {
			this.aClass589_6 = Class67.method1243((int) local3.aFloat297, (int) local3.aFloat295, (int) local3.aFloat296, this.method13434(arg0, 0, 1239060585), (byte) -17);
		}
		return this.aClass589_6;
	}

	@OriginalMember(owner = "client!ajm", name = "fc", descriptor = "(Lclient!di;)Lclient!tj;")
	@Override
	Class573 method24592(@OriginalArg(0) Class102 arg0) {
		if (this.aClass105_3 == null) {
			return null;
		}
		@Pc(8) Class471 local8 = this.method24526();
		@Pc(13) Class573 local13 = Class454.method29307(this.aBoolean331, 1086822580);
		@Pc(24) Class472 local24 = ((Class625) this.aClass41_Sub3_5.method18054(this.anInt1460 * -1500687687, 792872325)).aClass472_2;
		if (local24 == null) {
			this.aClass105_3.method7359(local8, this.aClass246Array21[0], 0);
		} else {
			this.aClass105_3.method7359(local8, null, 0);
			arg0.method20735(local8, this.aClass246Array21[0], local24);
		}
		return local13;
	}

	@OriginalMember(owner = "client!ajm", name = "cr", descriptor = "()Z")
	@Override
	boolean method24584() {
		return this.aClass105_3 == null ? false : this.aClass105_3.method7395();
	}

	@OriginalMember(owner = "client!ajm", name = "fg", descriptor = "(Lclient!di;)Lclient!tj;")
	@Override
	Class573 method24594(@OriginalArg(0) Class102 arg0) {
		if (this.aClass105_3 == null) {
			return null;
		}
		@Pc(8) Class471 local8 = this.method24526();
		@Pc(13) Class573 local13 = Class454.method29307(this.aBoolean331, -101553776);
		@Pc(24) Class472 local24 = ((Class625) this.aClass41_Sub3_5.method18054(this.anInt1460 * -1500687687, 941700084)).aClass472_2;
		if (local24 == null) {
			this.aClass105_3.method7359(local8, this.aClass246Array21[0], 0);
		} else {
			this.aClass105_3.method7359(local8, null, 0);
			arg0.method20735(local8, this.aClass246Array21[0], local24);
		}
		return local13;
	}

	@OriginalMember(owner = "client!ajm", name = "c", descriptor = "()I")
	@Override
	public int method13826() {
		return this.aByte48;
	}

	@OriginalMember(owner = "client!ajm", name = "fs", descriptor = "()Z")
	@Override
	boolean method24596() {
		return this.aBoolean333;
	}

	@OriginalMember(owner = "client!ajm", name = "fu", descriptor = "()Z")
	@Override
	boolean method24606() {
		return this.aBoolean333;
	}

	@OriginalMember(owner = "client!ajm", name = "ff", descriptor = "(Lclient!di;Lclient!alf;IIIZ)V")
	@Override
	void method24598(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (arg1 instanceof Class120_Sub1_Sub4_Sub2) {
			@Pc(5) Class120_Sub1_Sub4_Sub2 local5 = (Class120_Sub1_Sub4_Sub2) arg1;
			if (this.aClass105_3 != null && local5.aClass105_3 != null) {
				this.aClass105_3.method7353(local5.aClass105_3, arg2, arg3, arg4, arg5);
			}
		}
	}

	@OriginalMember(owner = "client!ajm", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method13823(@OriginalArg(0) int arg0) {
		return true;
	}

	@OriginalMember(owner = "client!ajm", name = "fi", descriptor = "(Lclient!di;Lclient!alf;IIIZ)V")
	@Override
	void method24599(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (arg1 instanceof Class120_Sub1_Sub4_Sub2) {
			@Pc(5) Class120_Sub1_Sub4_Sub2 local5 = (Class120_Sub1_Sub4_Sub2) arg1;
			if (this.aClass105_3 != null && local5.aClass105_3 != null) {
				this.aClass105_3.method7353(local5.aClass105_3, arg2, arg3, arg4, arg5);
			}
		}
	}

	@OriginalMember(owner = "client!ajm", name = "gh", descriptor = "(Lclient!di;Lclient!alf;IIIZ)V")
	@Override
	void method24600(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (arg1 instanceof Class120_Sub1_Sub4_Sub2) {
			@Pc(5) Class120_Sub1_Sub4_Sub2 local5 = (Class120_Sub1_Sub4_Sub2) arg1;
			if (this.aClass105_3 != null && local5.aClass105_3 != null) {
				this.aClass105_3.method7353(local5.aClass105_3, arg2, arg3, arg4, arg5);
			}
		}
	}

	@OriginalMember(owner = "client!ajm", name = "gz", descriptor = "(Lclient!di;Lclient!alf;IIIZ)V")
	@Override
	void method24580(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (arg1 instanceof Class120_Sub1_Sub4_Sub2) {
			@Pc(5) Class120_Sub1_Sub4_Sub2 local5 = (Class120_Sub1_Sub4_Sub2) arg1;
			if (this.aClass105_3 != null && local5.aClass105_3 != null) {
				this.aClass105_3.method7353(local5.aClass105_3, arg2, arg3, arg4, arg5);
			}
		}
	}

	@OriginalMember(owner = "client!ajm", name = "l", descriptor = "(I)Z")
	@Override
	public boolean method13822(@OriginalArg(0) int arg0) {
		return this.aBoolean334;
	}

	@OriginalMember(owner = "client!ajm", name = "gg", descriptor = "()V")
	@Override
	void method24603() {
		this.aBoolean333 = false;
		if (this.aClass105_3 != null) {
			this.aClass105_3.method7422(this.aClass105_3.method7326() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!ajm", name = "ge", descriptor = "()V")
	@Override
	void method24590() {
		this.aBoolean333 = false;
		if (this.aClass105_3 != null) {
			this.aClass105_3.method7422(this.aClass105_3.method7326() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!ajm", name = "b", descriptor = "()I")
	@Override
	public int method13843() {
		return this.aByte48;
	}

	@OriginalMember(owner = "client!ajm", name = "gk", descriptor = "(Lclient!di;Lclient!alf;IIIZ)V")
	@Override
	void method24602(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (arg1 instanceof Class120_Sub1_Sub4_Sub2) {
			@Pc(5) Class120_Sub1_Sub4_Sub2 local5 = (Class120_Sub1_Sub4_Sub2) arg1;
			if (this.aClass105_3 != null && local5.aClass105_3 != null) {
				this.aClass105_3.method7353(local5.aClass105_3, arg2, arg3, arg4, arg5);
			}
		}
	}

	@OriginalMember(owner = "client!ajm", name = "k", descriptor = "()I")
	@Override
	public int method13818() {
		return Class607.aClass607_10.anInt5396 * 1323580581;
	}

	@OriginalMember(owner = "client!ajm", name = "i", descriptor = "(Lclient!di;I)V")
	@Override
	public void method13831(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) Class80_Sub1_Sub10 local1 = null;
		if (this.aClass80_Sub1_Sub10_3 == null && this.aBoolean334) {
			@Pc(15) Class44 local15 = this.method13436(arg0, 262144, true, 2052368283);
			local1 = (Class80_Sub1_Sub10) (local15 == null ? null : local15.anObject2);
		} else {
			local1 = this.aClass80_Sub1_Sub10_3;
			this.aClass80_Sub1_Sub10_3 = null;
		}
		@Pc(35) Class463 local35 = this.method24552().aClass463_61;
		if (local1 != null) {
			this.aClass570_23.method31587(local1, this.aByte100, (int) local35.aFloat297, (int) local35.aFloat296, null, 1338777252);
		}
	}

	@OriginalMember(owner = "client!ajm", name = "gi", descriptor = "(Lclient!di;)V")
	@Override
	void method24607(@OriginalArg(0) Class102 arg0) {
	}

	@OriginalMember(owner = "client!ajm", name = "bu", descriptor = "(Lclient!di;I)Lclient!dn;")
	Class105 method13437(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass105_3 != null && arg0.method21083(this.aClass105_3.method7326(), arg1) == 0) {
			return this.aClass105_3;
		} else {
			@Pc(19) Class44 local19 = this.method13436(arg0, arg1, false, 2048638532);
			return local19 == null ? null : (Class105) local19.anObject1;
		}
	}

	@OriginalMember(owner = "client!ajm", name = "ft", descriptor = "(Lclient!di;II)Z")
	@Override
	boolean method24563(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(10) Class472 local10 = ((Class625) this.aClass41_Sub3_5.method18054(this.anInt1460 * -1500687687, 337413520)).aClass472_2;
		if (local10 != null) {
			return arg0.method20733(arg1, arg2, this.method24526(), local10, 92868112);
		}
		@Pc(27) Class105 local27 = this.method13434(arg0, 131072, -1537648661);
		if (local27 == null) {
			return false;
		} else {
			@Pc(33) Class471 local33 = this.method24526();
			return local27.method7360(arg1, arg2, local33, false, 0);
		}
	}

	@OriginalMember(owner = "client!ajm", name = "gw", descriptor = "(Lclient!di;)V")
	@Override
	void method24593(@OriginalArg(0) Class102 arg0) {
	}

	@OriginalMember(owner = "client!ajm", name = "bm", descriptor = "(Lclient!di;IZ)Lclient!abt;")
	Class44 method13438(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(9) Class625 local9 = (Class625) this.aClass41_Sub3_5.method18054(this.anInt1460 * -1500687687, 636142776);
		@Pc(19) Class100 local19;
		@Pc(25) Class100 local25;
		if (this.aBoolean332) {
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
		return local9.method32460(arg0, arg1, Class607.aClass607_10.anInt5396 * 1323580581, this.aByte48, local19, local25, (int) local53.aFloat297, this.anInt1459 * -118886907, (int) local53.aFloat296, arg2, null, (byte) -85);
	}

	@OriginalMember(owner = "client!ajm", name = "bb", descriptor = "(I)I")
	@Override
	public int method24578(@OriginalArg(0) int arg0) {
		return this.aClass105_3 == null ? 0 : this.aClass105_3.method7366();
	}
}
