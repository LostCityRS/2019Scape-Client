package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ajh")
public final class Class132_Sub1_Sub3_Sub1 extends Class132_Sub1_Sub3 implements Interface61 {

	@OriginalMember(owner = "client!ajh", name = "v", descriptor = "Lclient!uq;")
	Class600 aClass600_2;

	@OriginalMember(owner = "client!ajh", name = "o", descriptor = "Z")
	boolean aBoolean284 = true;

	@OriginalMember(owner = "client!ajh", name = "c", descriptor = "Lclient!sp;")
	public Class558 aClass558_1;

	@OriginalMember(owner = "client!ajh", name = "r", descriptor = "Z")
	boolean aBoolean283;

	@OriginalMember(owner = "client!ajh", name = "f", descriptor = "(Lclient!yh;S)V")
	public static void method12302(@OriginalArg(0) Interface73 arg0, @OriginalArg(1) short arg1) {
		if (IcmpService_Sub1.anIcmpService_Sub1_1 == null) {
			throw new IllegalStateException("");
		}
		IcmpService_Sub1.anIcmpService_Sub1_1.aList2.add(arg0);
	}

	@OriginalMember(owner = "client!ajh", name = "ass", descriptor = "(Lclient!yf;B)V")
	static void method12303(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		if (local12 != Class51.aClass93_Sub36_1.aClass166_Sub29_1.method16070(-1628934257)) {
			Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub29_1, local12, (byte) 81);
			Class106_Sub1.method5148(-996214817);
			client.aBoolean603 = false;
		}
	}

	@OriginalMember(owner = "client!ajh", name = "a", descriptor = "(I)V")
	static void method12304(@OriginalArg(0) int arg0) {
		client.aClass175_1.method24367((byte) 88);
		if (Class676.anInt6044 * -1667786339 < 2) {
			Class50.aClass28_2.method593((short) -28233);
			Class676.anInt6046 = 0;
			Class676.anInt6044 += -643386187;
			Class588.aClass588_3 = Class588.aClass588_1;
		} else {
			Class588.aClass588_3 = null;
			Class676.aClass709_1 = Class709.aClass709_6;
			Class481.method29937(4, 1823202236);
		}
	}

	@OriginalMember(owner = "client!ajh", name = "<init>", descriptor = "(Lclient!tx;Lclient!dh;Lclient!aop;Lclient!vd;IIIIIZIIIIIILclient!oe;)V")
	public Class132_Sub1_Sub3_Sub1(@OriginalArg(0) Class585 arg0, @OriginalArg(1) Class104 arg1, @OriginalArg(2) Class32_Sub14 arg2, @OriginalArg(3) Class610 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) Class458 arg16) {
		super(arg0, arg6, arg7, arg8, arg4, arg5, arg10, arg11, arg16);
		this.aClass558_1 = new Class558(arg1, arg2, arg3, arg12, arg13, arg5, this, arg9, arg14, arg15);
		this.aBoolean283 = arg3.anInt5753 * 1067969079 != 0 && !arg9;
		this.method24288(1, -764737189);
	}

	@OriginalMember(owner = "client!ajh", name = "fw", descriptor = "(Lclient!dh;I)V")
	@Override
	void method24279(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class109 local8 = this.aClass558_1.method31253(arg0, 262144, false, true, -1036757470);
		if (local8 == null) {
			return;
		}
		@Pc(13) Class470 local13 = this.method24238();
		@Pc(16) Class458 local16 = this.method24241();
		@Pc(23) int local23 = (int) local16.aClass472_61.aFloat325 >> 9;
		@Pc(30) int local30 = (int) local16.aClass472_61.aFloat327 >> 9;
		this.aClass558_1.method31254(arg0, local8, local13, local23, local23, local30, local30, false, (byte) 81);
	}

	@OriginalMember(owner = "client!ajh", name = "bu", descriptor = "(B)Z")
	@Override
	boolean method24274(@OriginalArg(0) byte arg0) {
		return false;
	}

	@OriginalMember(owner = "client!ajh", name = "fv", descriptor = "(Lclient!dh;B)Lclient!uq;")
	@Override
	public Class600 method24310(@OriginalArg(0) Class104 arg0, @OriginalArg(1) byte arg1) {
		return this.aClass600_2;
	}

	@OriginalMember(owner = "client!ajh", name = "a", descriptor = "(Lclient!dh;)V")
	@Override
	public void method13422(@OriginalArg(0) Class104 arg0) {
		this.aClass558_1.method31257(arg0, (byte) -80);
	}

	@OriginalMember(owner = "client!ajh", name = "bo", descriptor = "(I)I")
	@Override
	public int method24287(@OriginalArg(0) int arg0) {
		return this.aClass558_1.method31251(1309512124);
	}

	@OriginalMember(owner = "client!ajh", name = "bz", descriptor = "(Lclient!vp;B)V")
	public void method12301(@OriginalArg(0) Class620 arg0, @OriginalArg(1) byte arg1) {
		this.aClass558_1.method31280(arg0, 616654666);
	}

	@OriginalMember(owner = "client!ajh", name = "fc", descriptor = "(Lclient!dh;I)Lclient!tl;")
	@Override
	Class573 method24283(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class109 local8 = this.aClass558_1.method31253(arg0, 2048, false, true, -221046994);
		if (local8 == null) {
			return null;
		}
		@Pc(15) Class470 local15 = arg0.method20520();
		local15.method29545(this.method24238());
		local15.method29568((float) this.aShort86, 0.0F, (float) this.aShort85);
		@Pc(31) Class458 local31 = this.method24241();
		@Pc(36) Class573 local36 = Class125_Sub1.method9214(this.aBoolean283, 373147274);
		@Pc(43) int local43 = (int) local31.aClass472_61.aFloat325 >> 9;
		@Pc(50) int local50 = (int) local31.aClass472_61.aFloat327 >> 9;
		this.aClass558_1.method31254(arg0, local8, local15, local43, local43, local50, local50, true, (byte) 5);
		@Pc(67) Class610 local67 = this.aClass558_1.method31252((short) -5943);
		if (local67.aClass463_2 == null) {
			local8.method6947(local15, this.aClass241Array21[0], 0);
		} else {
			local8.method6947(local15, null, 0);
			arg0.method20504(local15, this.aClass241Array21[0], local67.aClass463_2);
		}
		if (this.aClass558_1.aClass674_7 != null) {
			@Pc(102) Class229 local102 = this.aClass558_1.aClass674_7.method33308();
			arg0.method20509(local102);
		}
		this.aBoolean284 = local8.method6865() || this.aClass558_1.aClass674_7 != null;
		if (this.aClass600_2 == null) {
			this.aClass600_2 = Class62.method1154((int) local31.aClass472_61.aFloat325, (int) local31.aClass472_61.aFloat326, (int) local31.aClass472_61.aFloat327, local8, 2056637905);
		} else {
			Class554.method31231(this.aClass600_2, (int) local31.aClass472_61.aFloat325, (int) local31.aClass472_61.aFloat326, (int) local31.aClass472_61.aFloat327, local8, -1594393736);
		}
		return local36;
	}

	@OriginalMember(owner = "client!ajh", name = "by", descriptor = "(B)I")
	@Override
	public int method24301(@OriginalArg(0) byte arg0) {
		return this.aClass558_1.method31277(1389166298);
	}

	@OriginalMember(owner = "client!ajh", name = "cr", descriptor = "()Z")
	@Override
	boolean method24291() {
		return this.aBoolean284;
	}

	@OriginalMember(owner = "client!ajh", name = "e", descriptor = "(I)I")
	@Override
	public int method13423(@OriginalArg(0) int arg0) {
		return this.aClass558_1.anInt5485 * 1228794785;
	}

	@OriginalMember(owner = "client!ajh", name = "cq", descriptor = "()Z")
	@Override
	boolean method24293() {
		return this.aBoolean284;
	}

	@OriginalMember(owner = "client!ajh", name = "m", descriptor = "(I)I")
	@Override
	public int method13404(@OriginalArg(0) int arg0) {
		return this.aClass558_1.anInt5487 * -922764575;
	}

	@OriginalMember(owner = "client!ajh", name = "k", descriptor = "(I)V")
	@Override
	public void method13405(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ajh", name = "w", descriptor = "(B)Z")
	@Override
	public boolean method13407(@OriginalArg(0) byte arg0) {
		return true;
	}

	@OriginalMember(owner = "client!ajh", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method13406(@OriginalArg(0) int arg0) {
		return this.aClass558_1.method31255((byte) -29);
	}

	@OriginalMember(owner = "client!ajh", name = "l", descriptor = "(Lclient!dh;B)V")
	@Override
	public void method13417(@OriginalArg(0) Class104 arg0, @OriginalArg(1) byte arg1) {
		this.aClass558_1.method31256(arg0, -1497248091);
	}

	@OriginalMember(owner = "client!ajh", name = "c", descriptor = "()I")
	@Override
	public int method13413() {
		return this.aClass558_1.anInt5487 * -922764575;
	}

	@OriginalMember(owner = "client!ajh", name = "z", descriptor = "()I")
	@Override
	public int method13410() {
		return this.aClass558_1.anInt5485 * 1228794785;
	}

	@OriginalMember(owner = "client!ajh", name = "p", descriptor = "()I")
	@Override
	public int method13411() {
		return this.aClass558_1.anInt5485 * 1228794785;
	}

	@OriginalMember(owner = "client!ajh", name = "d", descriptor = "()I")
	@Override
	public int method13403() {
		return this.aClass558_1.anInt5486 * -989891395;
	}

	@OriginalMember(owner = "client!ajh", name = "s", descriptor = "()Z")
	@Override
	public boolean method13415() {
		return this.aClass558_1.method31255((byte) 8);
	}

	@OriginalMember(owner = "client!ajh", name = "fy", descriptor = "(Lclient!dh;)V")
	@Override
	void method24306(@OriginalArg(0) Class104 arg0) {
		@Pc(8) Class109 local8 = this.aClass558_1.method31253(arg0, 262144, false, true, -718946782);
		if (local8 == null) {
			return;
		}
		@Pc(13) Class470 local13 = this.method24238();
		@Pc(16) Class458 local16 = this.method24241();
		@Pc(23) int local23 = (int) local16.aClass472_61.aFloat325 >> 9;
		@Pc(30) int local30 = (int) local16.aClass472_61.aFloat327 >> 9;
		this.aClass558_1.method31254(arg0, local8, local13, local23, local23, local30, local30, false, (byte) 22);
	}

	@OriginalMember(owner = "client!ajh", name = "v", descriptor = "()I")
	@Override
	public int method13412() {
		return this.aClass558_1.anInt5487 * -922764575;
	}

	@OriginalMember(owner = "client!ajh", name = "o", descriptor = "()I")
	@Override
	public int method13414() {
		return this.aClass558_1.anInt5487 * -922764575;
	}

	@OriginalMember(owner = "client!ajh", name = "g", descriptor = "(Lclient!dh;)V")
	@Override
	public void method13424(@OriginalArg(0) Class104 arg0) {
		this.aClass558_1.method31257(arg0, (byte) 33);
	}

	@OriginalMember(owner = "client!ajh", name = "y", descriptor = "(Lclient!dh;)V")
	@Override
	public void method13418(@OriginalArg(0) Class104 arg0) {
		this.aClass558_1.method31256(arg0, -1497248091);
	}

	@OriginalMember(owner = "client!ajh", name = "ch", descriptor = "()I")
	@Override
	public int method24294() {
		return this.aClass558_1.method31277(2098554571);
	}

	@OriginalMember(owner = "client!ajh", name = "x", descriptor = "(Lclient!dh;)V")
	@Override
	public void method13408(@OriginalArg(0) Class104 arg0) {
		this.aClass558_1.method31256(arg0, -1497248091);
	}

	@OriginalMember(owner = "client!ajh", name = "b", descriptor = "(Lclient!dh;)V")
	@Override
	public void method13421(@OriginalArg(0) Class104 arg0) {
		this.aClass558_1.method31256(arg0, -1497248091);
	}

	@OriginalMember(owner = "client!ajh", name = "h", descriptor = "(Lclient!dh;)V")
	@Override
	public void method13402(@OriginalArg(0) Class104 arg0) {
		this.aClass558_1.method31257(arg0, (byte) 8);
	}

	@OriginalMember(owner = "client!ajh", name = "i", descriptor = "()V")
	@Override
	public void method13425() {
	}

	@OriginalMember(owner = "client!ajh", name = "q", descriptor = "(Lclient!dh;)V")
	@Override
	public void method13419(@OriginalArg(0) Class104 arg0) {
		this.aClass558_1.method31256(arg0, -1497248091);
	}

	@OriginalMember(owner = "client!ajh", name = "cf", descriptor = "()Z")
	@Override
	boolean method24311() {
		return false;
	}

	@OriginalMember(owner = "client!ajh", name = "co", descriptor = "()Z")
	@Override
	boolean method24290() {
		return false;
	}

	@OriginalMember(owner = "client!ajh", name = "u", descriptor = "(Lclient!dh;B)V")
	@Override
	public void method13409(@OriginalArg(0) Class104 arg0, @OriginalArg(1) byte arg1) {
		this.aClass558_1.method31257(arg0, (byte) -18);
	}

	@OriginalMember(owner = "client!ajh", name = "cm", descriptor = "()Z")
	@Override
	boolean method24292() {
		return this.aBoolean284;
	}

	@OriginalMember(owner = "client!ajh", name = "bw", descriptor = "(S)Z")
	@Override
	boolean method24275(@OriginalArg(0) short arg0) {
		return this.aBoolean284;
	}

	@OriginalMember(owner = "client!ajh", name = "n", descriptor = "(I)I")
	@Override
	public int method13420(@OriginalArg(0) int arg0) {
		return this.aClass558_1.anInt5486 * -989891395;
	}

	@OriginalMember(owner = "client!ajh", name = "fl", descriptor = "(Lclient!dh;)Lclient!uq;")
	@Override
	public Class600 method24295(@OriginalArg(0) Class104 arg0) {
		return this.aClass600_2;
	}

	@OriginalMember(owner = "client!ajh", name = "fb", descriptor = "(Lclient!dh;)Lclient!uq;")
	@Override
	public Class600 method24296(@OriginalArg(0) Class104 arg0) {
		return this.aClass600_2;
	}

	@OriginalMember(owner = "client!ajh", name = "cb", descriptor = "()I")
	@Override
	public int method24297() {
		return this.aClass558_1.method31251(1764314274);
	}

	@OriginalMember(owner = "client!ajh", name = "cs", descriptor = "()I")
	@Override
	public int method24298() {
		return this.aClass558_1.method31251(771867064);
	}

	@OriginalMember(owner = "client!ajh", name = "cy", descriptor = "()I")
	@Override
	public int method24299() {
		return this.aClass558_1.method31251(227781960);
	}

	@OriginalMember(owner = "client!ajh", name = "fo", descriptor = "(Lclient!dh;)Lclient!tl;")
	@Override
	Class573 method24278(@OriginalArg(0) Class104 arg0) {
		@Pc(8) Class109 local8 = this.aClass558_1.method31253(arg0, 2048, false, true, -1955074107);
		if (local8 == null) {
			return null;
		}
		@Pc(15) Class470 local15 = arg0.method20520();
		local15.method29545(this.method24238());
		local15.method29568((float) this.aShort86, 0.0F, (float) this.aShort85);
		@Pc(31) Class458 local31 = this.method24241();
		@Pc(36) Class573 local36 = Class125_Sub1.method9214(this.aBoolean283, 373147274);
		@Pc(43) int local43 = (int) local31.aClass472_61.aFloat325 >> 9;
		@Pc(50) int local50 = (int) local31.aClass472_61.aFloat327 >> 9;
		this.aClass558_1.method31254(arg0, local8, local15, local43, local43, local50, local50, true, (byte) 13);
		@Pc(67) Class610 local67 = this.aClass558_1.method31252((short) 6711);
		if (local67.aClass463_2 == null) {
			local8.method6947(local15, this.aClass241Array21[0], 0);
		} else {
			local8.method6947(local15, null, 0);
			arg0.method20504(local15, this.aClass241Array21[0], local67.aClass463_2);
		}
		if (this.aClass558_1.aClass674_7 != null) {
			@Pc(102) Class229 local102 = this.aClass558_1.aClass674_7.method33308();
			arg0.method20509(local102);
		}
		this.aBoolean284 = local8.method6865() || this.aClass558_1.aClass674_7 != null;
		if (this.aClass600_2 == null) {
			this.aClass600_2 = Class62.method1154((int) local31.aClass472_61.aFloat325, (int) local31.aClass472_61.aFloat326, (int) local31.aClass472_61.aFloat327, local8, 1999024503);
		} else {
			Class554.method31231(this.aClass600_2, (int) local31.aClass472_61.aFloat325, (int) local31.aClass472_61.aFloat326, (int) local31.aClass472_61.aFloat327, local8, -1635959455);
		}
		return local36;
	}

	@OriginalMember(owner = "client!ajh", name = "r", descriptor = "()I")
	@Override
	public int method13416() {
		return this.aClass558_1.anInt5487 * -922764575;
	}

	@OriginalMember(owner = "client!ajh", name = "fe", descriptor = "(Lclient!dh;)V")
	@Override
	void method24315(@OriginalArg(0) Class104 arg0) {
		@Pc(8) Class109 local8 = this.aClass558_1.method31253(arg0, 262144, false, true, -776420988);
		if (local8 == null) {
			return;
		}
		@Pc(13) Class470 local13 = this.method24238();
		@Pc(16) Class458 local16 = this.method24241();
		@Pc(23) int local23 = (int) local16.aClass472_61.aFloat325 >> 9;
		@Pc(30) int local30 = (int) local16.aClass472_61.aFloat327 >> 9;
		this.aClass558_1.method31254(arg0, local8, local13, local23, local23, local30, local30, false, (byte) 121);
	}

	@OriginalMember(owner = "client!ajh", name = "fa", descriptor = "(Lclient!dh;IIB)Z")
	@Override
	boolean method24271(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		@Pc(4) Class610 local4 = this.aClass558_1.method31252((short) -22159);
		if (local4.aClass463_2 == null) {
			@Pc(26) Class109 local26 = this.aClass558_1.method31253(arg0, 131072, false, false, -68906315);
			return local26 == null ? false : local26.method6859(arg1, arg2, this.method24238(), false, 0);
		} else {
			return arg0.method20502(arg1, arg2, this.method24238(), local4.aClass463_2, -297959820);
		}
	}

	@OriginalMember(owner = "client!ajh", name = "fk", descriptor = "(Lclient!dh;II)Z")
	@Override
	boolean method24302(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class610 local4 = this.aClass558_1.method31252((short) 26);
		if (local4.aClass463_2 == null) {
			@Pc(26) Class109 local26 = this.aClass558_1.method31253(arg0, 131072, false, false, -1130772563);
			return local26 == null ? false : local26.method6859(arg1, arg2, this.method24238(), false, 0);
		} else {
			return arg0.method20502(arg1, arg2, this.method24238(), local4.aClass463_2, -1303425230);
		}
	}

	@OriginalMember(owner = "client!ajh", name = "j", descriptor = "()V")
	@Override
	public void method13426() {
	}

	@OriginalMember(owner = "client!ajh", name = "t", descriptor = "()Z")
	@Override
	public boolean method13427() {
		return true;
	}
}
