package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ajv")
public final class Class132_Sub1_Sub1_Sub2 extends Class132_Sub1_Sub1 implements Interface61 {

	@OriginalMember(owner = "client!ajv", name = "o", descriptor = "Lclient!uq;")
	Class600 aClass600_6;

	@OriginalMember(owner = "client!ajv", name = "c", descriptor = "Lclient!aop;")
	Class32_Sub14 aClass32_Sub14_4;

	@OriginalMember(owner = "client!ajv", name = "s", descriptor = "I")
	final int anInt1480;

	@OriginalMember(owner = "client!ajv", name = "x", descriptor = "Z")
	final boolean aBoolean317;

	@OriginalMember(owner = "client!ajv", name = "y", descriptor = "B")
	final byte aByte47;

	@OriginalMember(owner = "client!ajv", name = "q", descriptor = "B")
	final byte aByte48;

	@OriginalMember(owner = "client!ajv", name = "b", descriptor = "Z")
	boolean aBoolean318;

	@OriginalMember(owner = "client!ajv", name = "h", descriptor = "Z")
	boolean aBoolean315;

	@OriginalMember(owner = "client!ajv", name = "a", descriptor = "Z")
	boolean aBoolean316;

	@OriginalMember(owner = "client!ajv", name = "g", descriptor = "Z")
	final boolean aBoolean319;

	@OriginalMember(owner = "client!ajv", name = "i", descriptor = "I")
	int anInt1479;

	@OriginalMember(owner = "client!ajv", name = "r", descriptor = "Lclient!do;")
	Class109 aClass109_3;

	@OriginalMember(owner = "client!ajv", name = "v", descriptor = "Lclient!ara;")
	Class93_Sub1_Sub4 aClass93_Sub1_Sub4_3;

	@OriginalMember(owner = "client!ajv", name = "bp", descriptor = "(II)B")
	static byte method13135(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Class615.aClass615_6.anInt5789 * 948246811 == arg0) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ajv", name = "<init>", descriptor = "(Lclient!tx;Lclient!dh;Lclient!aop;Lclient!vd;IIIIIZIIIIIIZZLclient!oe;)V")
	public Class132_Sub1_Sub1_Sub2(@OriginalArg(0) Class585 arg0, @OriginalArg(1) Class104 arg1, @OriginalArg(2) Class32_Sub14 arg2, @OriginalArg(3) Class610 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) boolean arg16, @OriginalArg(17) boolean arg17, @OriginalArg(18) Class458 arg18) {
		super(arg0, arg4, arg5, arg6, arg7, arg8, arg10, arg11, arg12, arg13, arg3.anInt5771 * -927091685 == 1, Class704.method36915(arg14, arg15, -1906940209), arg18);
		this.aClass32_Sub14_4 = arg2;
		this.anInt1480 = arg3.anInt5748 * -919856917;
		this.aByte99 = (byte) arg5;
		this.aBoolean317 = arg9;
		this.aByte47 = (byte) arg14;
		this.aByte48 = (byte) arg15;
		this.aBoolean318 = arg3.anInt5753 * 1067969079 != 0 && !arg9;
		this.aBoolean315 = arg16;
		this.aBoolean316 = arg1.method20436() && arg3.aBoolean837 && !this.aBoolean317 && Class51.aClass93_Sub36_1.aClass166_Sub8_1.method15540((short) 13931) != 0;
		this.aBoolean319 = arg17;
		this.anInt1479 = arg7 * -1006984057;
		@Pc(93) int local93 = 2048;
		if (this.aBoolean315) {
			local93 |= 0x10000;
		}
		if (arg3.aBoolean851) {
			local93 |= 0x80000;
		}
		@Pc(115) Class34 local115 = this.method13132(arg1, local93, this.aBoolean316, -2010556489);
		if (local115 != null) {
			this.aClass109_3 = (Class109) local115.anObject1;
			this.aClass93_Sub1_Sub4_3 = (Class93_Sub1_Sub4) local115.anObject2;
			if (this.aBoolean315 || arg3.aBoolean851) {
				this.aClass109_3 = this.aClass109_3.method6907((byte) 0, local93, false);
				if (arg3.aBoolean851) {
					@Pc(148) Class528 local148 = client.aClass532_1.method30619((byte) -26);
					this.aClass109_3.method6879(local148.anInt5390 * 1660167749, local148.anInt5388 * -831110151, local148.anInt5389 * 1060946059, local148.anInt5387 * -1883995863);
				}
			}
		}
		this.method24288(1, -2119364131);
	}

	@OriginalMember(owner = "client!ajv", name = "s", descriptor = "()Z")
	@Override
	public boolean method13415() {
		return this.aBoolean316;
	}

	@OriginalMember(owner = "client!ajv", name = "bu", descriptor = "(B)Z")
	@Override
	boolean method24274(@OriginalArg(0) byte arg0) {
		if (this.aClass109_3 == null) {
			return true;
		} else {
			return !this.aClass109_3.method6946();
		}
	}

	@OriginalMember(owner = "client!ajv", name = "bw", descriptor = "(S)Z")
	@Override
	boolean method24275(@OriginalArg(0) short arg0) {
		return this.aClass109_3 == null ? false : this.aClass109_3.method6865();
	}

	@OriginalMember(owner = "client!ajv", name = "fq", descriptor = "(Lclient!dh;Lclient!alh;IIIZB)V")
	@Override
	void method24281(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class132_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6) {
		if (arg1 instanceof Class132_Sub1_Sub2_Sub1) {
			@Pc(5) Class132_Sub1_Sub2_Sub1 local5 = (Class132_Sub1_Sub2_Sub1) arg1;
			if (this.aClass109_3 != null && local5.aClass109_1 != null) {
				this.aClass109_3.method6820(local5.aClass109_1, arg2, arg3, arg4, arg5);
			}
		} else if (arg1 instanceof Class132_Sub1_Sub1_Sub2) {
			@Pc(29) Class132_Sub1_Sub1_Sub2 local29 = (Class132_Sub1_Sub1_Sub2) arg1;
			if (this.aClass109_3 != null && local29.aClass109_3 != null) {
				this.aClass109_3.method6820(local29.aClass109_3, arg2, arg3, arg4, arg5);
			}
		}
	}

	@OriginalMember(owner = "client!ajv", name = "br", descriptor = "(Lclient!dh;II)Lclient!do;")
	Class109 method13131(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass109_3 != null && arg0.method20705(this.aClass109_3.method6825(), arg1) == 0) {
			return this.aClass109_3;
		} else {
			@Pc(20) Class34 local20 = this.method13132(arg0, arg1, false, -1093684311);
			return local20 == null ? null : (Class109) local20.anObject1;
		}
	}

	@OriginalMember(owner = "client!ajv", name = "by", descriptor = "(B)I")
	@Override
	public int method24301(@OriginalArg(0) byte arg0) {
		return this.aClass109_3 == null ? 0 : this.aClass109_3.method6882();
	}

	@OriginalMember(owner = "client!ajv", name = "fv", descriptor = "(Lclient!dh;B)Lclient!uq;")
	@Override
	public Class600 method24310(@OriginalArg(0) Class104 arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) Class472 local3 = this.method24241().aClass472_61;
		if (this.aClass600_6 == null) {
			this.aClass600_6 = Class62.method1154((int) local3.aFloat325, (int) local3.aFloat326, (int) local3.aFloat327, this.method13131(arg0, 0, 1873703954), 1766312306);
		}
		return this.aClass600_6;
	}

	@OriginalMember(owner = "client!ajv", name = "fc", descriptor = "(Lclient!dh;I)Lclient!tl;")
	@Override
	Class573 method24283(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass109_3 == null) {
			return null;
		}
		@Pc(7) Class470 local7 = this.method24238();
		@Pc(12) Class573 local12 = Class125_Sub1.method9214(this.aBoolean318, 373147274);
		@Pc(23) Class463 local23 = ((Class610) this.aClass32_Sub14_4.method18273(this.anInt1480 * 1637738595, -1480583559)).aClass463_2;
		if (local23 == null) {
			this.aClass109_3.method6947(local7, this.aClass241Array21[0], 0);
		} else {
			this.aClass109_3.method6947(local7, null, 0);
			arg0.method20504(local7, this.aClass241Array21[0], local23);
		}
		return local12;
	}

	@OriginalMember(owner = "client!ajv", name = "fw", descriptor = "(Lclient!dh;I)V")
	@Override
	void method24279(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ajv", name = "fb", descriptor = "(Lclient!dh;)Lclient!uq;")
	@Override
	public Class600 method24296(@OriginalArg(0) Class104 arg0) {
		@Pc(3) Class472 local3 = this.method24241().aClass472_61;
		if (this.aClass600_6 == null) {
			this.aClass600_6 = Class62.method1154((int) local3.aFloat325, (int) local3.aFloat326, (int) local3.aFloat327, this.method13131(arg0, 0, 1597852080), 1852501232);
		}
		return this.aClass600_6;
	}

	@OriginalMember(owner = "client!ajv", name = "fk", descriptor = "(Lclient!dh;II)Z")
	@Override
	boolean method24302(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(10) Class463 local10 = ((Class610) this.aClass32_Sub14_4.method18273(this.anInt1480 * 1637738595, 400508177)).aClass463_2;
		if (local10 != null) {
			return arg0.method20502(arg1, arg2, this.method24238(), local10, -222976533);
		}
		@Pc(28) Class109 local28 = this.method13131(arg0, 131072, 1636326667);
		if (local28 == null) {
			return false;
		} else {
			@Pc(34) Class470 local34 = this.method24238();
			return local28.method6859(arg1, arg2, local34, false, 0);
		}
	}

	@OriginalMember(owner = "client!ajv", name = "co", descriptor = "()Z")
	@Override
	boolean method24290() {
		if (this.aClass109_3 == null) {
			return true;
		} else {
			return !this.aClass109_3.method6946();
		}
	}

	@OriginalMember(owner = "client!ajv", name = "ff", descriptor = "(B)V")
	@Override
	void method24277(@OriginalArg(0) byte arg0) {
		this.aBoolean315 = false;
		if (this.aClass109_3 != null) {
			this.aClass109_3.method6824(this.aClass109_3.method6825() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!ajv", name = "e", descriptor = "(I)I")
	@Override
	public int method13423(@OriginalArg(0) int arg0) {
		return this.anInt1480 * 1637738595;
	}

	@OriginalMember(owner = "client!ajv", name = "n", descriptor = "(I)I")
	@Override
	public int method13420(@OriginalArg(0) int arg0) {
		return this.aByte47;
	}

	@OriginalMember(owner = "client!ajv", name = "m", descriptor = "(I)I")
	@Override
	public int method13404(@OriginalArg(0) int arg0) {
		return this.aByte48;
	}

	@OriginalMember(owner = "client!ajv", name = "bg", descriptor = "(Lclient!dh;IZI)Lclient!abg;")
	Class34 method13132(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		@Pc(9) Class610 local9 = (Class610) this.aClass32_Sub14_4.method18273(this.anInt1480 * 1637738595, 1467081729);
		@Pc(19) Class99 local19;
		@Pc(25) Class99 local25;
		if (this.aBoolean317) {
			local19 = this.aClass585_23.aClass99Array3[this.aByte99];
			local25 = this.aClass585_23.aClass99Array2[0];
		} else {
			local19 = this.aClass585_23.aClass99Array2[this.aByte99];
			if (this.aByte99 < 3) {
				local25 = this.aClass585_23.aClass99Array2[this.aByte99 + 1];
			} else {
				local25 = null;
			}
		}
		@Pc(53) Class472 local53 = this.method24241().aClass472_61;
		return local9.method32161(arg0, arg1, Class615.aClass615_22.anInt5789 * 948246811 == this.aByte47 ? Class615.aClass615_21.anInt5789 * 948246811 : this.aByte47, this.aByte47 == Class615.aClass615_22.anInt5789 * 948246811 ? this.aByte48 + 4 : this.aByte48, local19, local25, (int) local53.aFloat325, this.anInt1479 * 1075110199, (int) local53.aFloat327, arg2, null, (byte) 24);
	}

	@OriginalMember(owner = "client!ajv", name = "w", descriptor = "(B)Z")
	@Override
	public boolean method13407(@OriginalArg(0) byte arg0) {
		return this.aBoolean319;
	}

	@OriginalMember(owner = "client!ajv", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method13406(@OriginalArg(0) int arg0) {
		return this.aBoolean316;
	}

	@OriginalMember(owner = "client!ajv", name = "l", descriptor = "(Lclient!dh;B)V")
	@Override
	public void method13417(@OriginalArg(0) Class104 arg0, @OriginalArg(1) byte arg1) {
		@Pc(1) Class93_Sub1_Sub4 local1 = null;
		if (this.aClass93_Sub1_Sub4_3 == null && this.aBoolean316) {
			@Pc(14) Class34 local14 = this.method13132(arg0, 262144, true, -1548677684);
			local1 = (Class93_Sub1_Sub4) (local14 == null ? null : local14.anObject2);
		} else {
			local1 = this.aClass93_Sub1_Sub4_3;
			this.aClass93_Sub1_Sub4_3 = null;
		}
		@Pc(34) Class472 local34 = this.method24241().aClass472_61;
		if (local1 != null) {
			this.aClass585_23.method31660(local1, this.aByte99, (int) local34.aFloat325, (int) local34.aFloat327, null, 761447917);
		}
	}

	@OriginalMember(owner = "client!ajv", name = "u", descriptor = "(Lclient!dh;B)V")
	@Override
	public void method13409(@OriginalArg(0) Class104 arg0, @OriginalArg(1) byte arg1) {
		@Pc(1) Class93_Sub1_Sub4 local1 = null;
		if (this.aClass93_Sub1_Sub4_3 == null && this.aBoolean316) {
			@Pc(15) Class34 local15 = this.method13132(arg0, 262144, true, -877246320);
			local1 = (Class93_Sub1_Sub4) (local15 == null ? null : local15.anObject2);
		} else {
			local1 = this.aClass93_Sub1_Sub4_3;
			this.aClass93_Sub1_Sub4_3 = null;
		}
		@Pc(34) Class472 local34 = this.method24241().aClass472_61;
		if (local1 != null) {
			this.aClass585_23.method31724(local1, this.aByte99, (int) local34.aFloat325, (int) local34.aFloat327, null, 1468760263);
		}
	}

	@OriginalMember(owner = "client!ajv", name = "ba", descriptor = "(I)I")
	public int method13133(@OriginalArg(0) int arg0) {
		return this.aClass109_3 == null ? 15 : this.aClass109_3.method6861() / 4;
	}

	@OriginalMember(owner = "client!ajv", name = "r", descriptor = "()I")
	@Override
	public int method13416() {
		return this.aByte48;
	}

	@OriginalMember(owner = "client!ajv", name = "y", descriptor = "(Lclient!dh;)V")
	@Override
	public void method13418(@OriginalArg(0) Class104 arg0) {
		@Pc(1) Class93_Sub1_Sub4 local1 = null;
		if (this.aClass93_Sub1_Sub4_3 == null && this.aBoolean316) {
			@Pc(14) Class34 local14 = this.method13132(arg0, 262144, true, -1172976127);
			local1 = (Class93_Sub1_Sub4) (local14 == null ? null : local14.anObject2);
		} else {
			local1 = this.aClass93_Sub1_Sub4_3;
			this.aClass93_Sub1_Sub4_3 = null;
		}
		@Pc(34) Class472 local34 = this.method24241().aClass472_61;
		if (local1 != null) {
			this.aClass585_23.method31660(local1, this.aByte99, (int) local34.aFloat325, (int) local34.aFloat327, null, 1440714232);
		}
	}

	@OriginalMember(owner = "client!ajv", name = "d", descriptor = "()I")
	@Override
	public int method13403() {
		return this.aByte47;
	}

	@OriginalMember(owner = "client!ajv", name = "g", descriptor = "(Lclient!dh;)V")
	@Override
	public void method13424(@OriginalArg(0) Class104 arg0) {
		@Pc(1) Class93_Sub1_Sub4 local1 = null;
		if (this.aClass93_Sub1_Sub4_3 == null && this.aBoolean316) {
			@Pc(15) Class34 local15 = this.method13132(arg0, 262144, true, -2051432374);
			local1 = (Class93_Sub1_Sub4) (local15 == null ? null : local15.anObject2);
		} else {
			local1 = this.aClass93_Sub1_Sub4_3;
			this.aClass93_Sub1_Sub4_3 = null;
		}
		@Pc(34) Class472 local34 = this.method24241().aClass472_61;
		if (local1 != null) {
			this.aClass585_23.method31724(local1, this.aByte99, (int) local34.aFloat325, (int) local34.aFloat327, null, 1303568077);
		}
	}

	@OriginalMember(owner = "client!ajv", name = "bj", descriptor = "(Lclient!dh;I)Lclient!do;")
	Class109 method13134(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass109_3 != null && arg0.method20705(this.aClass109_3.method6825(), arg1) == 0) {
			return this.aClass109_3;
		} else {
			@Pc(20) Class34 local20 = this.method13132(arg0, arg1, false, -632847923);
			return local20 == null ? null : (Class109) local20.anObject1;
		}
	}

	@OriginalMember(owner = "client!ajv", name = "v", descriptor = "()I")
	@Override
	public int method13412() {
		return this.aByte48;
	}

	@OriginalMember(owner = "client!ajv", name = "o", descriptor = "()I")
	@Override
	public int method13414() {
		return this.aByte48;
	}

	@OriginalMember(owner = "client!ajv", name = "z", descriptor = "()I")
	@Override
	public int method13410() {
		return this.anInt1480 * 1637738595;
	}

	@OriginalMember(owner = "client!ajv", name = "c", descriptor = "()I")
	@Override
	public int method13413() {
		return this.aByte48;
	}

	@OriginalMember(owner = "client!ajv", name = "fe", descriptor = "(Lclient!dh;)V")
	@Override
	void method24315(@OriginalArg(0) Class104 arg0) {
	}

	@OriginalMember(owner = "client!ajv", name = "x", descriptor = "(Lclient!dh;)V")
	@Override
	public void method13408(@OriginalArg(0) Class104 arg0) {
		@Pc(1) Class93_Sub1_Sub4 local1 = null;
		if (this.aClass93_Sub1_Sub4_3 == null && this.aBoolean316) {
			@Pc(14) Class34 local14 = this.method13132(arg0, 262144, true, -1203683769);
			local1 = (Class93_Sub1_Sub4) (local14 == null ? null : local14.anObject2);
		} else {
			local1 = this.aClass93_Sub1_Sub4_3;
			this.aClass93_Sub1_Sub4_3 = null;
		}
		@Pc(34) Class472 local34 = this.method24241().aClass472_61;
		if (local1 != null) {
			this.aClass585_23.method31660(local1, this.aByte99, (int) local34.aFloat325, (int) local34.aFloat327, null, 77524879);
		}
	}

	@OriginalMember(owner = "client!ajv", name = "b", descriptor = "(Lclient!dh;)V")
	@Override
	public void method13421(@OriginalArg(0) Class104 arg0) {
		@Pc(1) Class93_Sub1_Sub4 local1 = null;
		if (this.aClass93_Sub1_Sub4_3 == null && this.aBoolean316) {
			@Pc(14) Class34 local14 = this.method13132(arg0, 262144, true, -1718435988);
			local1 = (Class93_Sub1_Sub4) (local14 == null ? null : local14.anObject2);
		} else {
			local1 = this.aClass93_Sub1_Sub4_3;
			this.aClass93_Sub1_Sub4_3 = null;
		}
		@Pc(34) Class472 local34 = this.method24241().aClass472_61;
		if (local1 != null) {
			this.aClass585_23.method31660(local1, this.aByte99, (int) local34.aFloat325, (int) local34.aFloat327, null, 438797404);
		}
	}

	@OriginalMember(owner = "client!ajv", name = "h", descriptor = "(Lclient!dh;)V")
	@Override
	public void method13402(@OriginalArg(0) Class104 arg0) {
		@Pc(1) Class93_Sub1_Sub4 local1 = null;
		if (this.aClass93_Sub1_Sub4_3 == null && this.aBoolean316) {
			@Pc(15) Class34 local15 = this.method13132(arg0, 262144, true, -662202408);
			local1 = (Class93_Sub1_Sub4) (local15 == null ? null : local15.anObject2);
		} else {
			local1 = this.aClass93_Sub1_Sub4_3;
			this.aClass93_Sub1_Sub4_3 = null;
		}
		@Pc(34) Class472 local34 = this.method24241().aClass472_61;
		if (local1 != null) {
			this.aClass585_23.method31724(local1, this.aByte99, (int) local34.aFloat325, (int) local34.aFloat327, null, -724880366);
		}
	}

	@OriginalMember(owner = "client!ajv", name = "a", descriptor = "(Lclient!dh;)V")
	@Override
	public void method13422(@OriginalArg(0) Class104 arg0) {
		@Pc(1) Class93_Sub1_Sub4 local1 = null;
		if (this.aClass93_Sub1_Sub4_3 == null && this.aBoolean316) {
			@Pc(15) Class34 local15 = this.method13132(arg0, 262144, true, -2128065052);
			local1 = (Class93_Sub1_Sub4) (local15 == null ? null : local15.anObject2);
		} else {
			local1 = this.aClass93_Sub1_Sub4_3;
			this.aClass93_Sub1_Sub4_3 = null;
		}
		@Pc(34) Class472 local34 = this.method24241().aClass472_61;
		if (local1 != null) {
			this.aClass585_23.method31724(local1, this.aByte99, (int) local34.aFloat325, (int) local34.aFloat327, null, -1185763283);
		}
	}

	@OriginalMember(owner = "client!ajv", name = "p", descriptor = "()I")
	@Override
	public int method13411() {
		return this.anInt1480 * 1637738595;
	}

	@OriginalMember(owner = "client!ajv", name = "fl", descriptor = "(Lclient!dh;)Lclient!uq;")
	@Override
	public Class600 method24295(@OriginalArg(0) Class104 arg0) {
		@Pc(3) Class472 local3 = this.method24241().aClass472_61;
		if (this.aClass600_6 == null) {
			this.aClass600_6 = Class62.method1154((int) local3.aFloat325, (int) local3.aFloat326, (int) local3.aFloat327, this.method13131(arg0, 0, 1869515223), 1827518825);
		}
		return this.aClass600_6;
	}

	@OriginalMember(owner = "client!ajv", name = "q", descriptor = "(Lclient!dh;)V")
	@Override
	public void method13419(@OriginalArg(0) Class104 arg0) {
		@Pc(1) Class93_Sub1_Sub4 local1 = null;
		if (this.aClass93_Sub1_Sub4_3 == null && this.aBoolean316) {
			@Pc(14) Class34 local14 = this.method13132(arg0, 262144, true, -948802552);
			local1 = (Class93_Sub1_Sub4) (local14 == null ? null : local14.anObject2);
		} else {
			local1 = this.aClass93_Sub1_Sub4_3;
			this.aClass93_Sub1_Sub4_3 = null;
		}
		@Pc(34) Class472 local34 = this.method24241().aClass472_61;
		if (local1 != null) {
			this.aClass585_23.method31660(local1, this.aByte99, (int) local34.aFloat325, (int) local34.aFloat327, null, 249428481);
		}
	}

	@OriginalMember(owner = "client!ajv", name = "cr", descriptor = "()Z")
	@Override
	boolean method24291() {
		return this.aClass109_3 == null ? false : this.aClass109_3.method6865();
	}

	@OriginalMember(owner = "client!ajv", name = "cm", descriptor = "()Z")
	@Override
	boolean method24292() {
		return this.aClass109_3 == null ? false : this.aClass109_3.method6865();
	}

	@OriginalMember(owner = "client!ajv", name = "k", descriptor = "(I)V")
	@Override
	public void method13405(@OriginalArg(0) int arg0) {
		if (this.aClass109_3 != null) {
			this.aClass109_3.method6950();
		}
	}

	@OriginalMember(owner = "client!ajv", name = "ch", descriptor = "()I")
	@Override
	public int method24294() {
		return this.aClass109_3 == null ? 0 : this.aClass109_3.method6882();
	}

	@OriginalMember(owner = "client!ajv", name = "gk", descriptor = "()V")
	@Override
	void method24309() {
		this.aBoolean315 = false;
		if (this.aClass109_3 != null) {
			this.aClass109_3.method6824(this.aClass109_3.method6825() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!ajv", name = "fp", descriptor = "(I)Z")
	@Override
	boolean method24273(@OriginalArg(0) int arg0) {
		return this.aBoolean315;
	}

	@OriginalMember(owner = "client!ajv", name = "fo", descriptor = "(Lclient!dh;)Lclient!tl;")
	@Override
	Class573 method24278(@OriginalArg(0) Class104 arg0) {
		if (this.aClass109_3 == null) {
			return null;
		}
		@Pc(7) Class470 local7 = this.method24238();
		@Pc(12) Class573 local12 = Class125_Sub1.method9214(this.aBoolean318, 373147274);
		@Pc(23) Class463 local23 = ((Class610) this.aClass32_Sub14_4.method18273(this.anInt1480 * 1637738595, 2076646799)).aClass463_2;
		if (local23 == null) {
			this.aClass109_3.method6947(local7, this.aClass241Array21[0], 0);
		} else {
			this.aClass109_3.method6947(local7, null, 0);
			arg0.method20504(local7, this.aClass241Array21[0], local23);
		}
		return local12;
	}

	@OriginalMember(owner = "client!ajv", name = "cf", descriptor = "()Z")
	@Override
	boolean method24311() {
		if (this.aClass109_3 == null) {
			return true;
		} else {
			return !this.aClass109_3.method6946();
		}
	}

	@OriginalMember(owner = "client!ajv", name = "gq", descriptor = "(Lclient!dh;Lclient!alh;IIIZ)V")
	@Override
	void method24308(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class132_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (arg1 instanceof Class132_Sub1_Sub2_Sub1) {
			@Pc(5) Class132_Sub1_Sub2_Sub1 local5 = (Class132_Sub1_Sub2_Sub1) arg1;
			if (this.aClass109_3 != null && local5.aClass109_1 != null) {
				this.aClass109_3.method6820(local5.aClass109_1, arg2, arg3, arg4, arg5);
			}
		} else if (arg1 instanceof Class132_Sub1_Sub1_Sub2) {
			@Pc(29) Class132_Sub1_Sub1_Sub2 local29 = (Class132_Sub1_Sub1_Sub2) arg1;
			if (this.aClass109_3 != null && local29.aClass109_3 != null) {
				this.aClass109_3.method6820(local29.aClass109_3, arg2, arg3, arg4, arg5);
			}
		}
	}

	@OriginalMember(owner = "client!ajv", name = "fa", descriptor = "(Lclient!dh;IIB)Z")
	@Override
	boolean method24271(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		@Pc(10) Class463 local10 = ((Class610) this.aClass32_Sub14_4.method18273(this.anInt1480 * 1637738595, -1637810176)).aClass463_2;
		if (local10 != null) {
			return arg0.method20502(arg1, arg2, this.method24238(), local10, 11440144);
		}
		@Pc(28) Class109 local28 = this.method13131(arg0, 131072, 1670156729);
		if (local28 == null) {
			return false;
		} else {
			@Pc(34) Class470 local34 = this.method24238();
			return local28.method6859(arg1, arg2, local34, false, 0);
		}
	}

	@OriginalMember(owner = "client!ajv", name = "fh", descriptor = "()Z")
	@Override
	boolean method24284() {
		return this.aBoolean315;
	}

	@OriginalMember(owner = "client!ajv", name = "fr", descriptor = "()Z")
	@Override
	boolean method24304() {
		return this.aBoolean315;
	}

	@OriginalMember(owner = "client!ajv", name = "cq", descriptor = "()Z")
	@Override
	boolean method24293() {
		return this.aClass109_3 == null ? false : this.aClass109_3.method6865();
	}

	@OriginalMember(owner = "client!ajv", name = "gl", descriptor = "(Lclient!dh;Lclient!alh;IIIZ)V")
	@Override
	void method24307(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class132_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (arg1 instanceof Class132_Sub1_Sub2_Sub1) {
			@Pc(5) Class132_Sub1_Sub2_Sub1 local5 = (Class132_Sub1_Sub2_Sub1) arg1;
			if (this.aClass109_3 != null && local5.aClass109_1 != null) {
				this.aClass109_3.method6820(local5.aClass109_1, arg2, arg3, arg4, arg5);
			}
		} else if (arg1 instanceof Class132_Sub1_Sub1_Sub2) {
			@Pc(29) Class132_Sub1_Sub1_Sub2 local29 = (Class132_Sub1_Sub1_Sub2) arg1;
			if (this.aClass109_3 != null && local29.aClass109_3 != null) {
				this.aClass109_3.method6820(local29.aClass109_3, arg2, arg3, arg4, arg5);
			}
		}
	}

	@OriginalMember(owner = "client!ajv", name = "go", descriptor = "()V")
	@Override
	void method24269() {
		this.aBoolean315 = false;
		if (this.aClass109_3 != null) {
			this.aClass109_3.method6824(this.aClass109_3.method6825() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!ajv", name = "fy", descriptor = "(Lclient!dh;)V")
	@Override
	void method24306(@OriginalArg(0) Class104 arg0) {
	}

	@OriginalMember(owner = "client!ajv", name = "i", descriptor = "()V")
	@Override
	public void method13425() {
		if (this.aClass109_3 != null) {
			this.aClass109_3.method6950();
		}
	}

	@OriginalMember(owner = "client!ajv", name = "j", descriptor = "()V")
	@Override
	public void method13426() {
		if (this.aClass109_3 != null) {
			this.aClass109_3.method6950();
		}
	}

	@OriginalMember(owner = "client!ajv", name = "t", descriptor = "()Z")
	@Override
	public boolean method13427() {
		return this.aBoolean319;
	}

	@OriginalMember(owner = "client!ajv", name = "gu", descriptor = "(Lclient!dh;Lclient!alh;IIIZ)V")
	@Override
	void method24305(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class132_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (arg1 instanceof Class132_Sub1_Sub2_Sub1) {
			@Pc(5) Class132_Sub1_Sub2_Sub1 local5 = (Class132_Sub1_Sub2_Sub1) arg1;
			if (this.aClass109_3 != null && local5.aClass109_1 != null) {
				this.aClass109_3.method6820(local5.aClass109_1, arg2, arg3, arg4, arg5);
			}
		} else if (arg1 instanceof Class132_Sub1_Sub1_Sub2) {
			@Pc(29) Class132_Sub1_Sub1_Sub2 local29 = (Class132_Sub1_Sub1_Sub2) arg1;
			if (this.aClass109_3 != null && local29.aClass109_3 != null) {
				this.aClass109_3.method6820(local29.aClass109_3, arg2, arg3, arg4, arg5);
			}
		}
	}

	@OriginalMember(owner = "client!ajv", name = "bs", descriptor = "(Lclient!dh;I)Lclient!do;")
	Class109 method13136(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass109_3 != null && arg0.method20705(this.aClass109_3.method6825(), arg1) == 0) {
			return this.aClass109_3;
		} else {
			@Pc(20) Class34 local20 = this.method13132(arg0, arg1, false, -1898095447);
			return local20 == null ? null : (Class109) local20.anObject1;
		}
	}

	@OriginalMember(owner = "client!ajv", name = "cl", descriptor = "(Lclient!dh;I)Lclient!do;")
	Class109 method13137(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass109_3 != null && arg0.method20705(this.aClass109_3.method6825(), arg1) == 0) {
			return this.aClass109_3;
		} else {
			@Pc(20) Class34 local20 = this.method13132(arg0, arg1, false, -1976308918);
			return local20 == null ? null : (Class109) local20.anObject1;
		}
	}

	@OriginalMember(owner = "client!ajv", name = "cg", descriptor = "(Lclient!dh;I)Lclient!do;")
	Class109 method13138(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass109_3 != null && arg0.method20705(this.aClass109_3.method6825(), arg1) == 0) {
			return this.aClass109_3;
		} else {
			@Pc(20) Class34 local20 = this.method13132(arg0, arg1, false, -1531922596);
			return local20 == null ? null : (Class109) local20.anObject1;
		}
	}

	@OriginalMember(owner = "client!ajv", name = "ce", descriptor = "(Lclient!dh;IZ)Lclient!abg;")
	Class34 method13139(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(9) Class610 local9 = (Class610) this.aClass32_Sub14_4.method18273(this.anInt1480 * 1637738595, -1785459331);
		@Pc(19) Class99 local19;
		@Pc(25) Class99 local25;
		if (this.aBoolean317) {
			local19 = this.aClass585_23.aClass99Array3[this.aByte99];
			local25 = this.aClass585_23.aClass99Array2[0];
		} else {
			local19 = this.aClass585_23.aClass99Array2[this.aByte99];
			if (this.aByte99 < 3) {
				local25 = this.aClass585_23.aClass99Array2[this.aByte99 + 1];
			} else {
				local25 = null;
			}
		}
		@Pc(53) Class472 local53 = this.method24241().aClass472_61;
		return local9.method32161(arg0, arg1, Class615.aClass615_22.anInt5789 * 948246811 == this.aByte47 ? Class615.aClass615_21.anInt5789 * 948246811 : this.aByte47, this.aByte47 == Class615.aClass615_22.anInt5789 * 948246811 ? this.aByte48 + 4 : this.aByte48, local19, local25, (int) local53.aFloat325, this.anInt1479 * 1075110199, (int) local53.aFloat327, arg2, null, (byte) 24);
	}

	@OriginalMember(owner = "client!ajv", name = "cu", descriptor = "(Lclient!dh;IZ)Lclient!abg;")
	Class34 method13140(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(9) Class610 local9 = (Class610) this.aClass32_Sub14_4.method18273(this.anInt1480 * 1637738595, 1958010372);
		@Pc(19) Class99 local19;
		@Pc(25) Class99 local25;
		if (this.aBoolean317) {
			local19 = this.aClass585_23.aClass99Array3[this.aByte99];
			local25 = this.aClass585_23.aClass99Array2[0];
		} else {
			local19 = this.aClass585_23.aClass99Array2[this.aByte99];
			if (this.aByte99 < 3) {
				local25 = this.aClass585_23.aClass99Array2[this.aByte99 + 1];
			} else {
				local25 = null;
			}
		}
		@Pc(53) Class472 local53 = this.method24241().aClass472_61;
		return local9.method32161(arg0, arg1, Class615.aClass615_22.anInt5789 * 948246811 == this.aByte47 ? Class615.aClass615_21.anInt5789 * 948246811 : this.aByte47, this.aByte47 == Class615.aClass615_22.anInt5789 * 948246811 ? this.aByte48 + 4 : this.aByte48, local19, local25, (int) local53.aFloat325, this.anInt1479 * 1075110199, (int) local53.aFloat327, arg2, null, (byte) 24);
	}

	@OriginalMember(owner = "client!ajv", name = "ci", descriptor = "()I")
	public int method13141() {
		return this.aClass109_3 == null ? 15 : this.aClass109_3.method6861() / 4;
	}

	@OriginalMember(owner = "client!ajv", name = "cn", descriptor = "()I")
	public int method13142() {
		return this.aClass109_3 == null ? 15 : this.aClass109_3.method6861() / 4;
	}
}
