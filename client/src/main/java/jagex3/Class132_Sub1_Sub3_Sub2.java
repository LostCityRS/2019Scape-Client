package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ajk")
public final class Class132_Sub1_Sub3_Sub2 extends Class132_Sub1_Sub3 implements Interface61 {

	@OriginalMember(owner = "client!ajk", name = "o", descriptor = "Lclient!uq;")
	Class600 aClass600_4;

	@OriginalMember(owner = "client!ajk", name = "c", descriptor = "Lclient!aop;")
	Class32_Sub14 aClass32_Sub14_3;

	@OriginalMember(owner = "client!ajk", name = "s", descriptor = "I")
	final int anInt1443;

	@OriginalMember(owner = "client!ajk", name = "x", descriptor = "Z")
	final boolean aBoolean295;

	@OriginalMember(owner = "client!ajk", name = "q", descriptor = "B")
	final byte aByte39;

	@OriginalMember(owner = "client!ajk", name = "y", descriptor = "B")
	final byte aByte38;

	@OriginalMember(owner = "client!ajk", name = "b", descriptor = "Z")
	boolean aBoolean296;

	@OriginalMember(owner = "client!ajk", name = "h", descriptor = "Z")
	boolean aBoolean297;

	@OriginalMember(owner = "client!ajk", name = "a", descriptor = "I")
	int anInt1442;

	@OriginalMember(owner = "client!ajk", name = "r", descriptor = "Lclient!do;")
	Class109 aClass109_2;

	@OriginalMember(owner = "client!ajk", name = "v", descriptor = "Lclient!ara;")
	Class93_Sub1_Sub4 aClass93_Sub1_Sub4_2;

	@OriginalMember(owner = "client!ajk", name = "qy", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;B)V")
	static void method12585(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) byte arg3) {
		@Pc(13) String local13 = (String) arg2.anObjectArray45[(arg2.anInt6049 -= 957530791) * 587908375];
		if (Class532.method30778(local13, arg2, 1518522314) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray7 = Class499.method30329(local13, arg2, 1271185333);
		arg0.aBoolean684 = true;
	}

	@OriginalMember(owner = "client!ajk", name = "<init>", descriptor = "(Lclient!tx;Lclient!dh;Lclient!aop;Lclient!vd;IIIIIZIIIILclient!oe;)V")
	public Class132_Sub1_Sub3_Sub2(@OriginalArg(0) Class585 arg0, @OriginalArg(1) Class104 arg1, @OriginalArg(2) Class32_Sub14 arg2, @OriginalArg(3) Class610 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) Class458 arg14) {
		super(arg0, arg6, arg7, arg8, arg4, arg5, arg10, arg11, arg14);
		this.aClass32_Sub14_3 = arg2;
		this.anInt1443 = arg3.anInt5748 * 895037135;
		this.aBoolean295 = arg9;
		this.aByte39 = (byte) arg13;
		this.aByte38 = (byte) arg12;
		this.aBoolean296 = arg3.anInt5753 * 1067969079 != 0 && !arg9;
		this.aBoolean297 = arg1.method20436() && arg3.aBoolean837 && !this.aBoolean295 && Class51.aClass93_Sub36_1.aClass166_Sub8_1.method15540((short) 13903) != 0;
		this.anInt1442 = arg7 * 1100065999;
		@Pc(69) int local69 = 2048;
		if (arg3.aBoolean851) {
			local69 |= 0x80000;
		}
		@Pc(84) Class34 local84 = this.method12581(arg1, local69, this.aBoolean297, 1096209486);
		if (local84 != null) {
			this.aClass109_2 = (Class109) local84.anObject1;
			this.aClass93_Sub1_Sub4_2 = (Class93_Sub1_Sub4) local84.anObject2;
			if (arg3.aBoolean851) {
				this.aClass109_2 = this.aClass109_2.method6907((byte) 0, local69, false);
				if (arg3.aBoolean851) {
					@Pc(115) Class528 local115 = client.aClass532_1.method30619((byte) -116);
					this.aClass109_2.method6879(local115.anInt5390 * 1660167749, local115.anInt5388 * -831110151, local115.anInt5389 * 1060946059, local115.anInt5387 * -1883995863);
				}
			}
		}
		this.method24288(1, 489707077);
	}

	@OriginalMember(owner = "client!ajk", name = "a", descriptor = "(Lclient!dh;)V")
	@Override
	public void method13422(@OriginalArg(0) Class104 arg0) {
		@Pc(1) Class93_Sub1_Sub4 local1 = null;
		if (this.aClass93_Sub1_Sub4_2 == null && this.aBoolean297) {
			@Pc(15) Class34 local15 = this.method12581(arg0, 262144, true, 1096209486);
			local1 = (Class93_Sub1_Sub4) (local15 == null ? null : local15.anObject2);
		} else {
			local1 = this.aClass93_Sub1_Sub4_2;
			this.aClass93_Sub1_Sub4_2 = null;
		}
		@Pc(35) Class472 local35 = this.method24241().aClass472_61;
		if (local1 != null) {
			this.aClass585_23.method31724(local1, this.aByte99, (int) local35.aFloat325, (int) local35.aFloat327, null, 713763261);
		}
	}

	@OriginalMember(owner = "client!ajk", name = "bu", descriptor = "(B)Z")
	@Override
	boolean method24274(@OriginalArg(0) byte arg0) {
		if (this.aClass109_2 == null) {
			return true;
		} else {
			return !this.aClass109_2.method6946();
		}
	}

	@OriginalMember(owner = "client!ajk", name = "bw", descriptor = "(S)Z")
	@Override
	boolean method24275(@OriginalArg(0) short arg0) {
		return this.aClass109_2 == null ? false : this.aClass109_2.method6865();
	}

	@OriginalMember(owner = "client!ajk", name = "by", descriptor = "(B)I")
	@Override
	public int method24301(@OriginalArg(0) byte arg0) {
		return this.aClass109_2 == null ? 0 : this.aClass109_2.method6882();
	}

	@OriginalMember(owner = "client!ajk", name = "bz", descriptor = "(Lclient!dh;IB)Lclient!do;")
	Class109 method12578(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		if (this.aClass109_2 != null && arg0.method20705(this.aClass109_2.method6825(), arg1) == 0) {
			return this.aClass109_2;
		} else {
			@Pc(20) Class34 local20 = this.method12581(arg0, arg1, false, 1096209486);
			return local20 == null ? null : (Class109) local20.anObject1;
		}
	}

	@OriginalMember(owner = "client!ajk", name = "bp", descriptor = "(Lclient!dh;IZ)Lclient!abg;")
	Class34 method12579(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(9) Class610 local9 = (Class610) this.aClass32_Sub14_3.method18273(this.anInt1443 * 182683471, 266746314);
		@Pc(19) Class99 local19;
		@Pc(25) Class99 local25;
		if (this.aBoolean295) {
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
		return local9.method32161(arg0, arg1, this.aByte38, this.aByte39, local19, local25, (int) local53.aFloat325, this.anInt1442 * 362273327, (int) local53.aFloat327, arg2, null, (byte) 24);
	}

	@OriginalMember(owner = "client!ajk", name = "cf", descriptor = "()Z")
	@Override
	boolean method24311() {
		if (this.aClass109_2 == null) {
			return true;
		} else {
			return !this.aClass109_2.method6946();
		}
	}

	@OriginalMember(owner = "client!ajk", name = "fc", descriptor = "(Lclient!dh;I)Lclient!tl;")
	@Override
	Class573 method24283(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass109_2 == null) {
			return null;
		}
		@Pc(8) Class470 local8 = arg0.method20520();
		local8.method29545(this.method24238());
		local8.method29568((float) this.aShort86, 0.0F, (float) this.aShort85);
		@Pc(26) Class573 local26 = Class125_Sub1.method9214(this.aBoolean296, 373147274);
		@Pc(37) Class463 local37 = ((Class610) this.aClass32_Sub14_3.method18273(this.anInt1443 * 182683471, -1341839562)).aClass463_2;
		if (local37 == null) {
			this.aClass109_2.method6947(local8, this.aClass241Array21[0], 0);
		} else {
			this.aClass109_2.method6947(local8, null, 0);
			arg0.method20504(local8, this.aClass241Array21[0], local37);
		}
		return local26;
	}

	@OriginalMember(owner = "client!ajk", name = "fw", descriptor = "(Lclient!dh;I)V")
	@Override
	void method24279(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ajk", name = "e", descriptor = "(I)I")
	@Override
	public int method13423(@OriginalArg(0) int arg0) {
		return this.anInt1443 * 182683471;
	}

	@OriginalMember(owner = "client!ajk", name = "n", descriptor = "(I)I")
	@Override
	public int method13420(@OriginalArg(0) int arg0) {
		return this.aByte38;
	}

	@OriginalMember(owner = "client!ajk", name = "m", descriptor = "(I)I")
	@Override
	public int method13404(@OriginalArg(0) int arg0) {
		return this.aByte39;
	}

	@OriginalMember(owner = "client!ajk", name = "k", descriptor = "(I)V")
	@Override
	public void method13405(@OriginalArg(0) int arg0) {
		if (this.aClass109_2 != null) {
			this.aClass109_2.method6950();
		}
	}

	@OriginalMember(owner = "client!ajk", name = "w", descriptor = "(B)Z")
	@Override
	public boolean method13407(@OriginalArg(0) byte arg0) {
		return true;
	}

	@OriginalMember(owner = "client!ajk", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method13406(@OriginalArg(0) int arg0) {
		return this.aBoolean297;
	}

	@OriginalMember(owner = "client!ajk", name = "fe", descriptor = "(Lclient!dh;)V")
	@Override
	void method24315(@OriginalArg(0) Class104 arg0) {
	}

	@OriginalMember(owner = "client!ajk", name = "u", descriptor = "(Lclient!dh;B)V")
	@Override
	public void method13409(@OriginalArg(0) Class104 arg0, @OriginalArg(1) byte arg1) {
		@Pc(1) Class93_Sub1_Sub4 local1 = null;
		if (this.aClass93_Sub1_Sub4_2 == null && this.aBoolean297) {
			@Pc(15) Class34 local15 = this.method12581(arg0, 262144, true, 1096209486);
			local1 = (Class93_Sub1_Sub4) (local15 == null ? null : local15.anObject2);
		} else {
			local1 = this.aClass93_Sub1_Sub4_2;
			this.aClass93_Sub1_Sub4_2 = null;
		}
		@Pc(35) Class472 local35 = this.method24241().aClass472_61;
		if (local1 != null) {
			this.aClass585_23.method31724(local1, this.aByte99, (int) local35.aFloat325, (int) local35.aFloat327, null, -656709452);
		}
	}

	@OriginalMember(owner = "client!ajk", name = "r", descriptor = "()I")
	@Override
	public int method13416() {
		return this.aByte39;
	}

	@OriginalMember(owner = "client!ajk", name = "p", descriptor = "()I")
	@Override
	public int method13411() {
		return this.anInt1443 * 182683471;
	}

	@OriginalMember(owner = "client!ajk", name = "d", descriptor = "()I")
	@Override
	public int method13403() {
		return this.aByte38;
	}

	@OriginalMember(owner = "client!ajk", name = "c", descriptor = "()I")
	@Override
	public int method13413() {
		return this.aByte39;
	}

	@OriginalMember(owner = "client!ajk", name = "b", descriptor = "(Lclient!dh;)V")
	@Override
	public void method13421(@OriginalArg(0) Class104 arg0) {
		@Pc(1) Class93_Sub1_Sub4 local1 = null;
		if (this.aClass93_Sub1_Sub4_2 == null && this.aBoolean297) {
			@Pc(14) Class34 local14 = this.method12581(arg0, 262144, true, 1096209486);
			local1 = (Class93_Sub1_Sub4) (local14 == null ? null : local14.anObject2);
		} else {
			local1 = this.aClass93_Sub1_Sub4_2;
			this.aClass93_Sub1_Sub4_2 = null;
		}
		@Pc(34) Class472 local34 = this.method24241().aClass472_61;
		if (local1 != null) {
			this.aClass585_23.method31660(local1, this.aByte99, (int) local34.aFloat325, (int) local34.aFloat327, null, 82846641);
		}
	}

	@OriginalMember(owner = "client!ajk", name = "cm", descriptor = "()Z")
	@Override
	boolean method24292() {
		return this.aClass109_2 == null ? false : this.aClass109_2.method6865();
	}

	@OriginalMember(owner = "client!ajk", name = "o", descriptor = "()I")
	@Override
	public int method13414() {
		return this.aByte39;
	}

	@OriginalMember(owner = "client!ajk", name = "v", descriptor = "()I")
	@Override
	public int method13412() {
		return this.aByte39;
	}

	@OriginalMember(owner = "client!ajk", name = "y", descriptor = "(Lclient!dh;)V")
	@Override
	public void method13418(@OriginalArg(0) Class104 arg0) {
		@Pc(1) Class93_Sub1_Sub4 local1 = null;
		if (this.aClass93_Sub1_Sub4_2 == null && this.aBoolean297) {
			@Pc(14) Class34 local14 = this.method12581(arg0, 262144, true, 1096209486);
			local1 = (Class93_Sub1_Sub4) (local14 == null ? null : local14.anObject2);
		} else {
			local1 = this.aClass93_Sub1_Sub4_2;
			this.aClass93_Sub1_Sub4_2 = null;
		}
		@Pc(34) Class472 local34 = this.method24241().aClass472_61;
		if (local1 != null) {
			this.aClass585_23.method31660(local1, this.aByte99, (int) local34.aFloat325, (int) local34.aFloat327, null, 1895651702);
		}
	}

	@OriginalMember(owner = "client!ajk", name = "q", descriptor = "(Lclient!dh;)V")
	@Override
	public void method13419(@OriginalArg(0) Class104 arg0) {
		@Pc(1) Class93_Sub1_Sub4 local1 = null;
		if (this.aClass93_Sub1_Sub4_2 == null && this.aBoolean297) {
			@Pc(14) Class34 local14 = this.method12581(arg0, 262144, true, 1096209486);
			local1 = (Class93_Sub1_Sub4) (local14 == null ? null : local14.anObject2);
		} else {
			local1 = this.aClass93_Sub1_Sub4_2;
			this.aClass93_Sub1_Sub4_2 = null;
		}
		@Pc(34) Class472 local34 = this.method24241().aClass472_61;
		if (local1 != null) {
			this.aClass585_23.method31660(local1, this.aByte99, (int) local34.aFloat325, (int) local34.aFloat327, null, 1537548659);
		}
	}

	@OriginalMember(owner = "client!ajk", name = "ba", descriptor = "(Lclient!dh;I)Lclient!do;")
	Class109 method12580(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass109_2 != null && arg0.method20705(this.aClass109_2.method6825(), arg1) == 0) {
			return this.aClass109_2;
		} else {
			@Pc(20) Class34 local20 = this.method12581(arg0, arg1, false, 1096209486);
			return local20 == null ? null : (Class109) local20.anObject1;
		}
	}

	@OriginalMember(owner = "client!ajk", name = "bv", descriptor = "(Lclient!dh;IZI)Lclient!abg;")
	Class34 method12581(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		@Pc(9) Class610 local9 = (Class610) this.aClass32_Sub14_3.method18273(this.anInt1443 * 182683471, -1329420841);
		@Pc(19) Class99 local19;
		@Pc(25) Class99 local25;
		if (this.aBoolean295) {
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
		return local9.method32161(arg0, arg1, this.aByte38, this.aByte39, local19, local25, (int) local53.aFloat325, this.anInt1442 * 362273327, (int) local53.aFloat327, arg2, null, (byte) 24);
	}

	@OriginalMember(owner = "client!ajk", name = "h", descriptor = "(Lclient!dh;)V")
	@Override
	public void method13402(@OriginalArg(0) Class104 arg0) {
		@Pc(1) Class93_Sub1_Sub4 local1 = null;
		if (this.aClass93_Sub1_Sub4_2 == null && this.aBoolean297) {
			@Pc(15) Class34 local15 = this.method12581(arg0, 262144, true, 1096209486);
			local1 = (Class93_Sub1_Sub4) (local15 == null ? null : local15.anObject2);
		} else {
			local1 = this.aClass93_Sub1_Sub4_2;
			this.aClass93_Sub1_Sub4_2 = null;
		}
		@Pc(35) Class472 local35 = this.method24241().aClass472_61;
		if (local1 != null) {
			this.aClass585_23.method31724(local1, this.aByte99, (int) local35.aFloat325, (int) local35.aFloat327, null, 336391439);
		}
	}

	@OriginalMember(owner = "client!ajk", name = "fv", descriptor = "(Lclient!dh;B)Lclient!uq;")
	@Override
	public Class600 method24310(@OriginalArg(0) Class104 arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) Class472 local3 = this.method24241().aClass472_61;
		if (this.aClass600_4 == null) {
			this.aClass600_4 = Class62.method1154((int) local3.aFloat325, (int) local3.aFloat326, (int) local3.aFloat327, this.method12578(arg0, 0, (byte) -41), 1599206035);
		}
		return this.aClass600_4;
	}

	@OriginalMember(owner = "client!ajk", name = "g", descriptor = "(Lclient!dh;)V")
	@Override
	public void method13424(@OriginalArg(0) Class104 arg0) {
		@Pc(1) Class93_Sub1_Sub4 local1 = null;
		if (this.aClass93_Sub1_Sub4_2 == null && this.aBoolean297) {
			@Pc(15) Class34 local15 = this.method12581(arg0, 262144, true, 1096209486);
			local1 = (Class93_Sub1_Sub4) (local15 == null ? null : local15.anObject2);
		} else {
			local1 = this.aClass93_Sub1_Sub4_2;
			this.aClass93_Sub1_Sub4_2 = null;
		}
		@Pc(35) Class472 local35 = this.method24241().aClass472_61;
		if (local1 != null) {
			this.aClass585_23.method31724(local1, this.aByte99, (int) local35.aFloat325, (int) local35.aFloat327, null, 1978826677);
		}
	}

	@OriginalMember(owner = "client!ajk", name = "x", descriptor = "(Lclient!dh;)V")
	@Override
	public void method13408(@OriginalArg(0) Class104 arg0) {
		@Pc(1) Class93_Sub1_Sub4 local1 = null;
		if (this.aClass93_Sub1_Sub4_2 == null && this.aBoolean297) {
			@Pc(14) Class34 local14 = this.method12581(arg0, 262144, true, 1096209486);
			local1 = (Class93_Sub1_Sub4) (local14 == null ? null : local14.anObject2);
		} else {
			local1 = this.aClass93_Sub1_Sub4_2;
			this.aClass93_Sub1_Sub4_2 = null;
		}
		@Pc(34) Class472 local34 = this.method24241().aClass472_61;
		if (local1 != null) {
			this.aClass585_23.method31660(local1, this.aByte99, (int) local34.aFloat325, (int) local34.aFloat327, null, 1892386201);
		}
	}

	@OriginalMember(owner = "client!ajk", name = "co", descriptor = "()Z")
	@Override
	boolean method24290() {
		if (this.aClass109_2 == null) {
			return true;
		} else {
			return !this.aClass109_2.method6946();
		}
	}

	@OriginalMember(owner = "client!ajk", name = "cr", descriptor = "()Z")
	@Override
	boolean method24291() {
		return this.aClass109_2 == null ? false : this.aClass109_2.method6865();
	}

	@OriginalMember(owner = "client!ajk", name = "ch", descriptor = "()I")
	@Override
	public int method24294() {
		return this.aClass109_2 == null ? 0 : this.aClass109_2.method6882();
	}

	@OriginalMember(owner = "client!ajk", name = "cq", descriptor = "()Z")
	@Override
	boolean method24293() {
		return this.aClass109_2 == null ? false : this.aClass109_2.method6865();
	}

	@OriginalMember(owner = "client!ajk", name = "l", descriptor = "(Lclient!dh;B)V")
	@Override
	public void method13417(@OriginalArg(0) Class104 arg0, @OriginalArg(1) byte arg1) {
		@Pc(1) Class93_Sub1_Sub4 local1 = null;
		if (this.aClass93_Sub1_Sub4_2 == null && this.aBoolean297) {
			@Pc(14) Class34 local14 = this.method12581(arg0, 262144, true, 1096209486);
			local1 = (Class93_Sub1_Sub4) (local14 == null ? null : local14.anObject2);
		} else {
			local1 = this.aClass93_Sub1_Sub4_2;
			this.aClass93_Sub1_Sub4_2 = null;
		}
		@Pc(34) Class472 local34 = this.method24241().aClass472_61;
		if (local1 != null) {
			this.aClass585_23.method31660(local1, this.aByte99, (int) local34.aFloat325, (int) local34.aFloat327, null, 887640794);
		}
	}

	@OriginalMember(owner = "client!ajk", name = "fl", descriptor = "(Lclient!dh;)Lclient!uq;")
	@Override
	public Class600 method24295(@OriginalArg(0) Class104 arg0) {
		@Pc(3) Class472 local3 = this.method24241().aClass472_61;
		if (this.aClass600_4 == null) {
			this.aClass600_4 = Class62.method1154((int) local3.aFloat325, (int) local3.aFloat326, (int) local3.aFloat327, this.method12578(arg0, 0, (byte) -51), 2130571378);
		}
		return this.aClass600_4;
	}

	@OriginalMember(owner = "client!ajk", name = "fb", descriptor = "(Lclient!dh;)Lclient!uq;")
	@Override
	public Class600 method24296(@OriginalArg(0) Class104 arg0) {
		@Pc(3) Class472 local3 = this.method24241().aClass472_61;
		if (this.aClass600_4 == null) {
			this.aClass600_4 = Class62.method1154((int) local3.aFloat325, (int) local3.aFloat326, (int) local3.aFloat327, this.method12578(arg0, 0, (byte) -10), 2095473546);
		}
		return this.aClass600_4;
	}

	@OriginalMember(owner = "client!ajk", name = "fo", descriptor = "(Lclient!dh;)Lclient!tl;")
	@Override
	Class573 method24278(@OriginalArg(0) Class104 arg0) {
		if (this.aClass109_2 == null) {
			return null;
		}
		@Pc(8) Class470 local8 = arg0.method20520();
		local8.method29545(this.method24238());
		local8.method29568((float) this.aShort86, 0.0F, (float) this.aShort85);
		@Pc(26) Class573 local26 = Class125_Sub1.method9214(this.aBoolean296, 373147274);
		@Pc(37) Class463 local37 = ((Class610) this.aClass32_Sub14_3.method18273(this.anInt1443 * 182683471, -1091592679)).aClass463_2;
		if (local37 == null) {
			this.aClass109_2.method6947(local8, this.aClass241Array21[0], 0);
		} else {
			this.aClass109_2.method6947(local8, null, 0);
			arg0.method20504(local8, this.aClass241Array21[0], local37);
		}
		return local26;
	}

	@OriginalMember(owner = "client!ajk", name = "fy", descriptor = "(Lclient!dh;)V")
	@Override
	void method24306(@OriginalArg(0) Class104 arg0) {
	}

	@OriginalMember(owner = "client!ajk", name = "s", descriptor = "()Z")
	@Override
	public boolean method13415() {
		return this.aBoolean297;
	}

	@OriginalMember(owner = "client!ajk", name = "fk", descriptor = "(Lclient!dh;II)Z")
	@Override
	boolean method24302(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(10) Class463 local10 = ((Class610) this.aClass32_Sub14_3.method18273(this.anInt1443 * 182683471, 329451558)).aClass463_2;
		if (local10 != null) {
			return arg0.method20502(arg1, arg2, this.method24238(), local10, 764672595);
		}
		@Pc(27) Class109 local27 = this.method12578(arg0, 131072, (byte) -78);
		if (local27 == null) {
			return false;
		} else {
			@Pc(33) Class470 local33 = this.method24238();
			return local27.method6859(arg1, arg2, local33, false, 0);
		}
	}

	@OriginalMember(owner = "client!ajk", name = "i", descriptor = "()V")
	@Override
	public void method13425() {
		if (this.aClass109_2 != null) {
			this.aClass109_2.method6950();
		}
	}

	@OriginalMember(owner = "client!ajk", name = "j", descriptor = "()V")
	@Override
	public void method13426() {
		if (this.aClass109_2 != null) {
			this.aClass109_2.method6950();
		}
	}

	@OriginalMember(owner = "client!ajk", name = "t", descriptor = "()Z")
	@Override
	public boolean method13427() {
		return true;
	}

	@OriginalMember(owner = "client!ajk", name = "br", descriptor = "(Lclient!dh;I)Lclient!do;")
	Class109 method12582(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass109_2 != null && arg0.method20705(this.aClass109_2.method6825(), arg1) == 0) {
			return this.aClass109_2;
		} else {
			@Pc(20) Class34 local20 = this.method12581(arg0, arg1, false, 1096209486);
			return local20 == null ? null : (Class109) local20.anObject1;
		}
	}

	@OriginalMember(owner = "client!ajk", name = "bg", descriptor = "(Lclient!dh;I)Lclient!do;")
	Class109 method12583(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass109_2 != null && arg0.method20705(this.aClass109_2.method6825(), arg1) == 0) {
			return this.aClass109_2;
		} else {
			@Pc(20) Class34 local20 = this.method12581(arg0, arg1, false, 1096209486);
			return local20 == null ? null : (Class109) local20.anObject1;
		}
	}

	@OriginalMember(owner = "client!ajk", name = "fa", descriptor = "(Lclient!dh;IIB)Z")
	@Override
	boolean method24271(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		@Pc(10) Class463 local10 = ((Class610) this.aClass32_Sub14_3.method18273(this.anInt1443 * 182683471, 2141540706)).aClass463_2;
		if (local10 != null) {
			return arg0.method20502(arg1, arg2, this.method24238(), local10, 334964351);
		}
		@Pc(27) Class109 local27 = this.method12578(arg0, 131072, (byte) -38);
		if (local27 == null) {
			return false;
		} else {
			@Pc(33) Class470 local33 = this.method24238();
			return local27.method6859(arg1, arg2, local33, false, 0);
		}
	}

	@OriginalMember(owner = "client!ajk", name = "z", descriptor = "()I")
	@Override
	public int method13410() {
		return this.anInt1443 * 182683471;
	}

	@OriginalMember(owner = "client!ajk", name = "bj", descriptor = "(Lclient!dh;IZ)Lclient!abg;")
	Class34 method12584(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(9) Class610 local9 = (Class610) this.aClass32_Sub14_3.method18273(this.anInt1443 * 182683471, -317242761);
		@Pc(19) Class99 local19;
		@Pc(25) Class99 local25;
		if (this.aBoolean295) {
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
		return local9.method32161(arg0, arg1, this.aByte38, this.aByte39, local19, local25, (int) local53.aFloat325, this.anInt1442 * 362273327, (int) local53.aFloat327, arg2, null, (byte) 24);
	}
}
