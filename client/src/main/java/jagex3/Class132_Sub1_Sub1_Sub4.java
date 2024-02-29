package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aue")
public final class Class132_Sub1_Sub1_Sub4 extends Class132_Sub1_Sub1 {

	@OriginalMember(owner = "client!aue", name = "ab", descriptor = "Lclient!xy;")
	Class674 aClass674_4;

	@OriginalMember(owner = "client!aue", name = "ap", descriptor = "D")
	double aDouble4;

	@OriginalMember(owner = "client!aue", name = "ar", descriptor = "D")
	double aDouble5;

	@OriginalMember(owner = "client!aue", name = "aq", descriptor = "D")
	double aDouble6;

	@OriginalMember(owner = "client!aue", name = "ax", descriptor = "D")
	double aDouble7;

	@OriginalMember(owner = "client!aue", name = "av", descriptor = "D")
	double aDouble8;

	@OriginalMember(owner = "client!aue", name = "au", descriptor = "Z")
	boolean aBoolean543 = false;

	@OriginalMember(owner = "client!aue", name = "aj", descriptor = "I")
	int anInt3257 = 0;

	@OriginalMember(owner = "client!aue", name = "ay", descriptor = "Z")
	boolean aBoolean544 = false;

	@OriginalMember(owner = "client!aue", name = "az", descriptor = "I")
	int anInt3268 = 0;

	@OriginalMember(owner = "client!aue", name = "ae", descriptor = "I")
	final int anInt3266;

	@OriginalMember(owner = "client!aue", name = "al", descriptor = "I")
	public final int anInt3259;

	@OriginalMember(owner = "client!aue", name = "ac", descriptor = "I")
	public final int anInt3260;

	@OriginalMember(owner = "client!aue", name = "ai", descriptor = "I")
	final int anInt3261;

	@OriginalMember(owner = "client!aue", name = "aw", descriptor = "I")
	final int anInt3262;

	@OriginalMember(owner = "client!aue", name = "as", descriptor = "I")
	final int anInt3267;

	@OriginalMember(owner = "client!aue", name = "at", descriptor = "I")
	public final int anInt3263;

	@OriginalMember(owner = "client!aue", name = "ag", descriptor = "I")
	final int anInt3265;

	@OriginalMember(owner = "client!aue", name = "ah", descriptor = "I")
	public final int anInt3258;

	@OriginalMember(owner = "client!aue", name = "am", descriptor = "Z")
	final boolean aBoolean542;

	@OriginalMember(owner = "client!aue", name = "ad", descriptor = "I")
	final int anInt3264;

	@OriginalMember(owner = "client!aue", name = "ao", descriptor = "Lclient!aaq;")
	final Class19 aClass19_4;

	@OriginalMember(owner = "client!aue", name = "<init>", descriptor = "(Lclient!tx;IIIIIIIIIIIIIZII)V")
	public Class132_Sub1_Sub1_Sub4(@OriginalArg(0) Class585 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16) {
		super(arg0, arg2, arg3, arg4, Class305.method26894(arg4, arg5, arg2, (byte) -103) - arg6, arg5, arg4 >> 9, arg4 >> 9, arg5 >> 9, arg5 >> 9, false, (byte) 0);
		this.anInt3266 = arg1 * -557743993;
		this.anInt3259 = arg7 * -752975913;
		this.anInt3260 = arg8 * -1641411727;
		this.anInt3261 = arg9 * 186384315;
		this.anInt3262 = arg10 * 785708643;
		this.anInt3267 = arg11 * -1559101817;
		this.anInt3263 = arg12 * -1202833679;
		this.anInt3265 = arg6 * 2107593309;
		this.anInt3258 = arg13 * -577714095;
		this.aBoolean542 = arg14;
		this.aBoolean543 = false;
		this.anInt3264 = arg15 * 1383937513;
		this.anInt3268 = arg16 * -1740027791;
		@Pc(112) int local112 = ((Class697) Class501.aClass32_Sub18_1.method18273(this.anInt3266 * 2083472695, -1724063811)).anInt6110 * 1477426425;
		this.aClass19_4 = new Class19_Sub1(this, false);
		this.aClass19_4.method23580(local112, 1540652555);
		this.method24288(1, -1922530479);
	}

	@OriginalMember(owner = "client!aue", name = "h", descriptor = "()V")
	public void method23923() {
		if (this.aClass674_4 != null) {
			this.aClass674_4.method33275();
		}
	}

	@OriginalMember(owner = "client!aue", name = "bu", descriptor = "(B)Z")
	@Override
	boolean method24274(@OriginalArg(0) byte arg0) {
		return false;
	}

	@OriginalMember(owner = "client!aue", name = "dy", descriptor = "()V")
	@Override
	void method24332() {
		@Pc(3) Class472 local3 = this.method24241().aClass472_61;
		this.aShort129 = this.aShort130 = (short) (local3.aFloat325 / 512.0F);
		this.aShort128 = this.aShort127 = (short) (local3.aFloat327 / 512.0F);
	}

	@OriginalMember(owner = "client!aue", name = "gq", descriptor = "(Lclient!dh;Lclient!alh;IIIZ)V")
	@Override
	void method24308(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class132_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aue", name = "e", descriptor = "(I)I")
	public int method23924(@OriginalArg(0) int arg0) {
		return this.anInt3268 * 697923729;
	}

	@OriginalMember(owner = "client!aue", name = "fk", descriptor = "(Lclient!dh;II)Z")
	@Override
	boolean method24302(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!aue", name = "n", descriptor = "(IIIII)V")
	public void method23925(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(4) Class472 local4 = Class472.method29711(this.method24241().aClass472_61);
		if (!this.aBoolean543) {
			@Pc(13) float local13 = (float) arg0 - local4.aFloat325;
			@Pc(19) float local19 = (float) arg1 - local4.aFloat327;
			@Pc(30) float local30 = (float) Math.sqrt((double) (local13 * local13 + local19 * local19));
			if (local30 != 0.0F) {
				local4.aFloat325 += (float) (this.anInt3262 * -2066662581) * local13 / local30;
				local4.aFloat327 += (float) (this.anInt3262 * -2066662581) * local19 / local30;
			}
			if (this.aBoolean542) {
				local4.aFloat326 = Class305.method26894((int) local4.aFloat325, (int) local4.aFloat327, this.aByte100, (byte) -29) - this.anInt3265 * -714731019;
			}
			this.method24236(local4);
		}
		@Pc(96) double local96 = (double) (this.anInt3260 * -887925359 + 1 - arg3);
		this.aDouble5 = (double) ((float) arg0 - local4.aFloat325) / local96;
		this.aDouble4 = (double) ((float) arg1 - local4.aFloat327) / local96;
		this.aDouble6 = Math.sqrt(this.aDouble5 * this.aDouble5 + this.aDouble4 * this.aDouble4);
		if (this.anInt3261 * 1799679347 == -1) {
			this.aDouble7 = (double) ((float) arg2 - local4.aFloat326) / local96;
		} else {
			if (!this.aBoolean543) {
				this.aDouble7 = -this.aDouble6 * Math.tan((double) (this.anInt3261 * 1799679347) * 0.02454369D);
			}
			this.aDouble8 = ((double) ((float) arg2 - local4.aFloat326) - local96 * this.aDouble7) * 2.0D / (local96 * local96);
		}
		local4.method29713();
	}

	@OriginalMember(owner = "client!aue", name = "p", descriptor = "()I")
	public int method23926() {
		return this.anInt3268 * 697923729;
	}

	@OriginalMember(owner = "client!aue", name = "cf", descriptor = "()Z")
	@Override
	boolean method24311() {
		return false;
	}

	@OriginalMember(owner = "client!aue", name = "f", descriptor = "(Lclient!dh;II)Lclient!do;")
	Class109 method23927(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class697 local8 = (Class697) Class501.aClass32_Sub18_1.method18273(this.anInt3266 * 2083472695, 1679098612);
		return local8.method36860(arg0, arg1, this.aClass19_4, (byte) 2, -1747901038);
	}

	@OriginalMember(owner = "client!aue", name = "fc", descriptor = "(Lclient!dh;I)Lclient!tl;")
	@Override
	Class573 method24283(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) Class109 local5 = this.method23927(arg0, 2048, 719834327);
		if (local5 == null) {
			return null;
		}
		@Pc(12) Class470 local12 = this.method24238();
		this.method23943(arg0, local5, local12, (byte) -81);
		@Pc(22) Class573 local22 = Class125_Sub1.method9214(false, 373147274);
		local5.method6947(local12, this.aClass241Array21[0], 0);
		if (this.aClass674_4 != null) {
			@Pc(38) Class229 local38 = this.aClass674_4.method33308();
			arg0.method20509(local38);
		}
		this.aBoolean544 = local5.method6865();
		local5.method6862();
		this.anInt3257 = local5.method6882() * 1922710473;
		return local22;
	}

	@OriginalMember(owner = "client!aue", name = "fw", descriptor = "(Lclient!dh;I)V")
	@Override
	void method24279(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) Class109 local5 = this.method23927(arg0, 0, 719834327);
		if (local5 != null) {
			@Pc(11) Class470 local11 = this.method24238();
			this.anInt3257 = local5.method6882() * 1922710473;
			local5.method6862();
			this.method23943(arg0, local5, local11, (byte) 2);
		}
	}

	@OriginalMember(owner = "client!aue", name = "bv", descriptor = "(I)V")
	@Override
	void method24334(@OriginalArg(0) int arg0) {
		@Pc(3) Class472 local3 = this.method24241().aClass472_61;
		this.aShort129 = this.aShort130 = (short) (local3.aFloat325 / 512.0F);
		this.aShort128 = this.aShort127 = (short) (local3.aFloat327 / 512.0F);
	}

	@OriginalMember(owner = "client!aue", name = "ch", descriptor = "()I")
	@Override
	public int method24294() {
		return this.anInt3257 * -737227143;
	}

	@OriginalMember(owner = "client!aue", name = "l", descriptor = "(I)V")
	public void method23928(@OriginalArg(0) int arg0) {
		if (this.aClass674_4 != null) {
			this.aClass674_4.method33275();
		}
	}

	@OriginalMember(owner = "client!aue", name = "fa", descriptor = "(Lclient!dh;IIB)Z")
	@Override
	boolean method24271(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		return false;
	}

	@OriginalMember(owner = "client!aue", name = "fp", descriptor = "(I)Z")
	@Override
	boolean method24273(@OriginalArg(0) int arg0) {
		return false;
	}

	@OriginalMember(owner = "client!aue", name = "fq", descriptor = "(Lclient!dh;Lclient!alh;IIIZB)V")
	@Override
	void method24281(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class132_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aue", name = "ff", descriptor = "(B)V")
	@Override
	void method24277(@OriginalArg(0) byte arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aue", name = "fy", descriptor = "(Lclient!dh;)V")
	@Override
	void method24306(@OriginalArg(0) Class104 arg0) {
		@Pc(5) Class109 local5 = this.method23927(arg0, 0, 719834327);
		if (local5 != null) {
			@Pc(11) Class470 local11 = this.method24238();
			this.anInt3257 = local5.method6882() * 1922710473;
			local5.method6862();
			this.method23943(arg0, local5, local11, (byte) -50);
		}
	}

	@OriginalMember(owner = "client!aue", name = "co", descriptor = "()Z")
	@Override
	boolean method24290() {
		return false;
	}

	@OriginalMember(owner = "client!aue", name = "cr", descriptor = "()Z")
	@Override
	boolean method24291() {
		return this.aBoolean544;
	}

	@OriginalMember(owner = "client!aue", name = "cm", descriptor = "()Z")
	@Override
	boolean method24292() {
		return this.aBoolean544;
	}

	@OriginalMember(owner = "client!aue", name = "m", descriptor = "(I)V")
	public void method23929(@OriginalArg(0) int arg0) {
		if (this.aBoolean543 || this.anInt3267 * -1124702409 == 0) {
			return;
		}
		@Pc(11) Class132_Sub1_Sub1_Sub1 local11 = null;
		if (client.anInt3463 * 1819062465 == 0) {
			local11 = Class249.aClass239Array1[this.anInt3267 * -1124702409 - 1].method25900(-342108063);
		} else {
			@Pc(40) int local40;
			if (this.anInt3267 * -1124702409 < 0) {
				local40 = -(this.anInt3267 * -1124702409) - 1;
				if (local40 == client.anInt3513 * -859840571) {
					local11 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3;
				} else {
					local11 = client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[local40];
				}
			} else {
				local40 = this.anInt3267 * -1124702409 - 1;
				@Pc(66) Class93_Sub15 local66 = (Class93_Sub15) client.aClass16_18.method215((long) local40);
				if (local66 != null) {
					local11 = (Class132_Sub1_Sub1_Sub1) local66.anObject5;
				}
			}
		}
		if (local11 == null) {
			return;
		}
		@Pc(80) Class472 local80 = local11.method24241().aClass472_61;
		this.method24243(local80.aFloat325, (float) (Class305.method26894((int) local80.aFloat325, (int) local80.aFloat327, this.aByte100, (byte) -107) - this.anInt3265 * -714731019), local80.aFloat327);
		if (this.anInt3264 * 1043526233 < 0) {
			return;
		}
		@Pc(111) Class622 local111 = local11.method19978(364014678);
		@Pc(113) int local113 = 0;
		@Pc(115) int local115 = 0;
		if (local111.anIntArrayArray65 != null && local111.anIntArrayArray65[this.anInt3264 * 1043526233] != null) {
			local113 += local111.anIntArrayArray65[this.anInt3264 * 1043526233][0];
			local115 += local111.anIntArrayArray65[this.anInt3264 * 1043526233][2];
		}
		if (local111.anIntArrayArray64 != null && local111.anIntArrayArray64[this.anInt3264 * 1043526233] != null) {
			local113 += local111.anIntArrayArray64[this.anInt3264 * 1043526233][0];
			local115 += local111.anIntArrayArray64[this.anInt3264 * 1043526233][2];
		}
		if (local113 == 0 && local115 == 0) {
			return;
		}
		@Pc(195) int local195 = local11.aClass523_7.method30544(-1237274292);
		@Pc(197) int local197 = local195;
		if (local11.anIntArray237 != null && local11.anIntArray237[this.anInt3264 * 1043526233] != -1) {
			local197 = local11.anIntArray237[this.anInt3264 * 1043526233];
		}
		@Pc(224) int local224 = local197 - local195 & 0x3FFF;
		@Pc(228) int local228 = Class464.anIntArray453[local224];
		@Pc(232) int local232 = Class464.anIntArray454[local224];
		@Pc(242) int local242 = local113 * local232 + local115 * local228 >> 14;
		local115 = local232 * local115 - local113 * local228 >> 14;
		@Pc(259) Class472 local259 = Class472.method29711(this.method24241().aClass472_61);
		local259.aFloat325 += local242;
		local259.aFloat327 += local115;
		this.method24236(local259);
		local259.method29713();
	}

	@OriginalMember(owner = "client!aue", name = "y", descriptor = "(Lclient!dh;I)Lclient!do;")
	Class109 method23930(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class697 local8 = (Class697) Class501.aClass32_Sub18_1.method18273(this.anInt3266 * 2083472695, 1489625715);
		return local8.method36860(arg0, arg1, this.aClass19_4, (byte) 2, -959318598);
	}

	@OriginalMember(owner = "client!aue", name = "fl", descriptor = "(Lclient!dh;)Lclient!uq;")
	@Override
	public Class600 method24295(@OriginalArg(0) Class104 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!aue", name = "by", descriptor = "(B)I")
	@Override
	public int method24301(@OriginalArg(0) byte arg0) {
		return this.anInt3257 * -737227143;
	}

	@OriginalMember(owner = "client!aue", name = "db", descriptor = "()V")
	@Override
	void method24333() {
		@Pc(3) Class472 local3 = this.method24241().aClass472_61;
		this.aShort129 = this.aShort130 = (short) (local3.aFloat325 / 512.0F);
		this.aShort128 = this.aShort127 = (short) (local3.aFloat327 / 512.0F);
	}

	@OriginalMember(owner = "client!aue", name = "fe", descriptor = "(Lclient!dh;)V")
	@Override
	void method24315(@OriginalArg(0) Class104 arg0) {
		@Pc(5) Class109 local5 = this.method23927(arg0, 0, 719834327);
		if (local5 != null) {
			@Pc(11) Class470 local11 = this.method24238();
			this.anInt3257 = local5.method6882() * 1922710473;
			local5.method6862();
			this.method23943(arg0, local5, local11, (byte) 33);
		}
	}

	@OriginalMember(owner = "client!aue", name = "gu", descriptor = "(Lclient!dh;Lclient!alh;IIIZ)V")
	@Override
	void method24305(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class132_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aue", name = "fh", descriptor = "()Z")
	@Override
	boolean method24284() {
		return false;
	}

	@OriginalMember(owner = "client!aue", name = "fb", descriptor = "(Lclient!dh;)Lclient!uq;")
	@Override
	public Class600 method24296(@OriginalArg(0) Class104 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!aue", name = "bw", descriptor = "(S)Z")
	@Override
	boolean method24275(@OriginalArg(0) short arg0) {
		return this.aBoolean544;
	}

	@OriginalMember(owner = "client!aue", name = "cq", descriptor = "()Z")
	@Override
	boolean method24293() {
		return this.aBoolean544;
	}

	@OriginalMember(owner = "client!aue", name = "gl", descriptor = "(Lclient!dh;Lclient!alh;IIIZ)V")
	@Override
	void method24307(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class132_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aue", name = "go", descriptor = "()V")
	@Override
	void method24269() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aue", name = "gk", descriptor = "()V")
	@Override
	void method24309() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aue", name = "dp", descriptor = "()V")
	@Override
	void method24331() {
		@Pc(3) Class472 local3 = this.method24241().aClass472_61;
		this.aShort129 = this.aShort130 = (short) (local3.aFloat325 / 512.0F);
		this.aShort128 = this.aShort127 = (short) (local3.aFloat327 / 512.0F);
	}

	@OriginalMember(owner = "client!aue", name = "z", descriptor = "()I")
	public int method23931() {
		return this.anInt3268 * 697923729;
	}

	@OriginalMember(owner = "client!aue", name = "k", descriptor = "(II)V")
	public void method23932(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aBoolean543 = true;
		@Pc(8) Class458 local8 = new Class458(this.method24241());
		local8.aClass472_61.aFloat325 = (float) ((double) local8.aClass472_61.aFloat325 + this.aDouble5 * (double) arg0);
		local8.aClass472_61.aFloat327 = (float) ((double) local8.aClass472_61.aFloat327 + (double) arg0 * this.aDouble4);
		if (this.aBoolean542) {
			local8.aClass472_61.aFloat326 = Class305.method26894((int) local8.aClass472_61.aFloat325, (int) local8.aClass472_61.aFloat327, this.aByte100, (byte) -48) - this.anInt3265 * -714731019;
		} else if (this.anInt3261 * 1799679347 == -1) {
			local8.aClass472_61.aFloat326 = (float) ((double) local8.aClass472_61.aFloat326 + this.aDouble7 * (double) arg0);
		} else {
			local8.aClass472_61.aFloat326 = (float) ((double) local8.aClass472_61.aFloat326 + (double) arg0 * (double) arg0 * this.aDouble8 * 0.5D + (double) arg0 * this.aDouble7);
			this.aDouble7 += this.aDouble8 * (double) arg0;
		}
		local8.aClass471_5.method29647(1.0F, 0.0F, 0.0F, (float) Math.atan2(this.aDouble7, this.aDouble6));
		@Pc(127) Class471 local127 = Class471.method29702();
		local127.method29647(0.0F, 1.0F, 0.0F, (float) Math.atan2(this.aDouble5, this.aDouble4) - 3.1415927F);
		local8.aClass471_5.method29657(local127);
		local127.method29640();
		this.method24239(local8);
		if (this.aClass19_4.method23585(1, -866366964) && this.aClass19_4.method23593(-1228609165)) {
			this.aClass19_4.method23582(1443992216);
		}
	}

	@OriginalMember(owner = "client!aue", name = "dh", descriptor = "()V")
	@Override
	void method24329() {
		@Pc(3) Class472 local3 = this.method24241().aClass472_61;
		this.aShort129 = this.aShort130 = (short) (local3.aFloat325 / 512.0F);
		this.aShort128 = this.aShort127 = (short) (local3.aFloat327 / 512.0F);
	}

	@OriginalMember(owner = "client!aue", name = "dx", descriptor = "()V")
	@Override
	void method24330() {
		@Pc(3) Class472 local3 = this.method24241().aClass472_61;
		this.aShort129 = this.aShort130 = (short) (local3.aFloat325 / 512.0F);
		this.aShort128 = this.aShort127 = (short) (local3.aFloat327 / 512.0F);
	}

	@OriginalMember(owner = "client!aue", name = "fv", descriptor = "(Lclient!dh;B)Lclient!uq;")
	@Override
	public Class600 method24310(@OriginalArg(0) Class104 arg0, @OriginalArg(1) byte arg1) {
		return null;
	}

	@OriginalMember(owner = "client!aue", name = "fo", descriptor = "(Lclient!dh;)Lclient!tl;")
	@Override
	Class573 method24278(@OriginalArg(0) Class104 arg0) {
		@Pc(5) Class109 local5 = this.method23927(arg0, 2048, 719834327);
		if (local5 == null) {
			return null;
		}
		@Pc(12) Class470 local12 = this.method24238();
		this.method23943(arg0, local5, local12, (byte) 13);
		@Pc(22) Class573 local22 = Class125_Sub1.method9214(false, 373147274);
		local5.method6947(local12, this.aClass241Array21[0], 0);
		if (this.aClass674_4 != null) {
			@Pc(38) Class229 local38 = this.aClass674_4.method33308();
			arg0.method20509(local38);
		}
		this.aBoolean544 = local5.method6865();
		local5.method6862();
		this.anInt3257 = local5.method6882() * 1922710473;
		return local22;
	}

	@OriginalMember(owner = "client!aue", name = "fr", descriptor = "()Z")
	@Override
	boolean method24304() {
		return false;
	}

	@OriginalMember(owner = "client!aue", name = "d", descriptor = "(IIII)V")
	public void method23933(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class472 local4 = Class472.method29711(this.method24241().aClass472_61);
		if (!this.aBoolean543) {
			@Pc(13) float local13 = (float) arg0 - local4.aFloat325;
			@Pc(19) float local19 = (float) arg1 - local4.aFloat327;
			@Pc(30) float local30 = (float) Math.sqrt((double) (local13 * local13 + local19 * local19));
			if (local30 != 0.0F) {
				local4.aFloat325 += (float) (this.anInt3262 * -2066662581) * local13 / local30;
				local4.aFloat327 += (float) (this.anInt3262 * -2066662581) * local19 / local30;
			}
			if (this.aBoolean542) {
				local4.aFloat326 = Class305.method26894((int) local4.aFloat325, (int) local4.aFloat327, this.aByte100, (byte) -120) - this.anInt3265 * -714731019;
			}
			this.method24236(local4);
		}
		@Pc(96) double local96 = (double) (this.anInt3260 * -887925359 + 1 - arg3);
		this.aDouble5 = (double) ((float) arg0 - local4.aFloat325) / local96;
		this.aDouble4 = (double) ((float) arg1 - local4.aFloat327) / local96;
		this.aDouble6 = Math.sqrt(this.aDouble5 * this.aDouble5 + this.aDouble4 * this.aDouble4);
		if (this.anInt3261 * 1799679347 == -1) {
			this.aDouble7 = (double) ((float) arg2 - local4.aFloat326) / local96;
		} else {
			if (!this.aBoolean543) {
				this.aDouble7 = -this.aDouble6 * Math.tan((double) (this.anInt3261 * 1799679347) * 0.02454369D);
			}
			this.aDouble8 = ((double) ((float) arg2 - local4.aFloat326) - local96 * this.aDouble7) * 2.0D / (local96 * local96);
		}
		local4.method29713();
	}

	@OriginalMember(owner = "client!aue", name = "c", descriptor = "()V")
	public void method23934() {
		if (this.aBoolean543 || this.anInt3267 * -1124702409 == 0) {
			return;
		}
		@Pc(11) Class132_Sub1_Sub1_Sub1 local11 = null;
		if (client.anInt3463 * 1819062465 == 0) {
			local11 = Class249.aClass239Array1[this.anInt3267 * -1124702409 - 1].method25900(1323290254);
		} else {
			@Pc(40) int local40;
			if (this.anInt3267 * -1124702409 < 0) {
				local40 = -(this.anInt3267 * -1124702409) - 1;
				if (local40 == client.anInt3513 * -859840571) {
					local11 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3;
				} else {
					local11 = client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[local40];
				}
			} else {
				local40 = this.anInt3267 * -1124702409 - 1;
				@Pc(66) Class93_Sub15 local66 = (Class93_Sub15) client.aClass16_18.method215((long) local40);
				if (local66 != null) {
					local11 = (Class132_Sub1_Sub1_Sub1) local66.anObject5;
				}
			}
		}
		if (local11 == null) {
			return;
		}
		@Pc(80) Class472 local80 = local11.method24241().aClass472_61;
		this.method24243(local80.aFloat325, (float) (Class305.method26894((int) local80.aFloat325, (int) local80.aFloat327, this.aByte100, (byte) -73) - this.anInt3265 * -714731019), local80.aFloat327);
		if (this.anInt3264 * 1043526233 < 0) {
			return;
		}
		@Pc(111) Class622 local111 = local11.method19978(-282088631);
		@Pc(113) int local113 = 0;
		@Pc(115) int local115 = 0;
		if (local111.anIntArrayArray65 != null && local111.anIntArrayArray65[this.anInt3264 * 1043526233] != null) {
			local113 += local111.anIntArrayArray65[this.anInt3264 * 1043526233][0];
			local115 += local111.anIntArrayArray65[this.anInt3264 * 1043526233][2];
		}
		if (local111.anIntArrayArray64 != null && local111.anIntArrayArray64[this.anInt3264 * 1043526233] != null) {
			local113 += local111.anIntArrayArray64[this.anInt3264 * 1043526233][0];
			local115 += local111.anIntArrayArray64[this.anInt3264 * 1043526233][2];
		}
		if (local113 == 0 && local115 == 0) {
			return;
		}
		@Pc(195) int local195 = local11.aClass523_7.method30544(1105727409);
		@Pc(197) int local197 = local195;
		if (local11.anIntArray237 != null && local11.anIntArray237[this.anInt3264 * 1043526233] != -1) {
			local197 = local11.anIntArray237[this.anInt3264 * 1043526233];
		}
		@Pc(224) int local224 = local197 - local195 & 0x3FFF;
		@Pc(228) int local228 = Class464.anIntArray453[local224];
		@Pc(232) int local232 = Class464.anIntArray454[local224];
		@Pc(242) int local242 = local113 * local232 + local115 * local228 >> 14;
		local115 = local232 * local115 - local113 * local228 >> 14;
		@Pc(259) Class472 local259 = Class472.method29711(this.method24241().aClass472_61);
		local259.aFloat325 += local242;
		local259.aFloat327 += local115;
		this.method24236(local259);
		local259.method29713();
	}

	@OriginalMember(owner = "client!aue", name = "r", descriptor = "(I)V")
	public void method23935(@OriginalArg(0) int arg0) {
		this.aBoolean543 = true;
		@Pc(8) Class458 local8 = new Class458(this.method24241());
		local8.aClass472_61.aFloat325 = (float) ((double) local8.aClass472_61.aFloat325 + this.aDouble5 * (double) arg0);
		local8.aClass472_61.aFloat327 = (float) ((double) local8.aClass472_61.aFloat327 + (double) arg0 * this.aDouble4);
		if (this.aBoolean542) {
			local8.aClass472_61.aFloat326 = Class305.method26894((int) local8.aClass472_61.aFloat325, (int) local8.aClass472_61.aFloat327, this.aByte100, (byte) -107) - this.anInt3265 * -714731019;
		} else if (this.anInt3261 * 1799679347 == -1) {
			local8.aClass472_61.aFloat326 = (float) ((double) local8.aClass472_61.aFloat326 + this.aDouble7 * (double) arg0);
		} else {
			local8.aClass472_61.aFloat326 = (float) ((double) local8.aClass472_61.aFloat326 + (double) arg0 * (double) arg0 * this.aDouble8 * 0.5D + (double) arg0 * this.aDouble7);
			this.aDouble7 += this.aDouble8 * (double) arg0;
		}
		local8.aClass471_5.method29647(1.0F, 0.0F, 0.0F, (float) Math.atan2(this.aDouble7, this.aDouble6));
		@Pc(127) Class471 local127 = Class471.method29702();
		local127.method29647(0.0F, 1.0F, 0.0F, (float) Math.atan2(this.aDouble5, this.aDouble4) - 3.1415927F);
		local8.aClass471_5.method29657(local127);
		local127.method29640();
		this.method24239(local8);
		if (this.aClass19_4.method23585(1, 393686359) && this.aClass19_4.method23593(-1228609165)) {
			this.aClass19_4.method23582(1267030944);
		}
	}

	@OriginalMember(owner = "client!aue", name = "v", descriptor = "(Lclient!dh;I)Lclient!do;")
	Class109 method23936(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class697 local8 = (Class697) Class501.aClass32_Sub18_1.method18273(this.anInt3266 * 2083472695, -652108441);
		return local8.method36860(arg0, arg1, this.aClass19_4, (byte) 2, -1492119822);
	}

	@OriginalMember(owner = "client!aue", name = "o", descriptor = "(Lclient!dh;I)Lclient!do;")
	Class109 method23937(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class697 local8 = (Class697) Class501.aClass32_Sub18_1.method18273(this.anInt3266 * 2083472695, -255784588);
		return local8.method36860(arg0, arg1, this.aClass19_4, (byte) 2, -1731992424);
	}

	@OriginalMember(owner = "client!aue", name = "s", descriptor = "(Lclient!dh;I)Lclient!do;")
	Class109 method23938(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class697 local8 = (Class697) Class501.aClass32_Sub18_1.method18273(this.anInt3266 * 2083472695, -899430241);
		return local8.method36860(arg0, arg1, this.aClass19_4, (byte) 2, -1000468434);
	}

	@OriginalMember(owner = "client!aue", name = "u", descriptor = "()I")
	public int method23939() {
		return this.anInt3268 * 697923729;
	}

	@OriginalMember(owner = "client!aue", name = "q", descriptor = "(Lclient!dh;Lclient!do;Lclient!ou;)V")
	void method23940(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class109 arg1, @OriginalArg(2) Class470 arg2) {
		arg1.method6823(arg2);
		@Pc(5) Class234[] local5 = arg1.method6884();
		@Pc(8) Class210[] local8 = arg1.method6899();
		if ((this.aClass674_4 == null || this.aClass674_4.aBoolean879) && (local5 != null || local8 != null)) {
			this.aClass674_4 = Class674.method33305(client.anInt3485, true);
		}
		if (this.aClass674_4 != null) {
			this.aClass674_4.method33279(arg0, (long) client.anInt3485, local5, local8, false);
			this.aClass674_4.method33306(this.aByte100, this.aShort129, this.aShort130, this.aShort128, this.aShort127);
		}
	}

	@OriginalMember(owner = "client!aue", name = "x", descriptor = "()V")
	public void method23941() {
		if (this.aClass674_4 != null) {
			this.aClass674_4.method33275();
		}
	}

	@OriginalMember(owner = "client!aue", name = "b", descriptor = "()V")
	public void method23942() {
		if (this.aClass674_4 != null) {
			this.aClass674_4.method33275();
		}
	}

	@OriginalMember(owner = "client!aue", name = "w", descriptor = "(Lclient!dh;Lclient!do;Lclient!ou;B)V")
	void method23943(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class109 arg1, @OriginalArg(2) Class470 arg2, @OriginalArg(3) byte arg3) {
		arg1.method6823(arg2);
		@Pc(5) Class234[] local5 = arg1.method6884();
		@Pc(8) Class210[] local8 = arg1.method6899();
		if ((this.aClass674_4 == null || this.aClass674_4.aBoolean879) && (local5 != null || local8 != null)) {
			this.aClass674_4 = Class674.method33305(client.anInt3485, true);
		}
		if (this.aClass674_4 != null) {
			this.aClass674_4.method33279(arg0, (long) client.anInt3485, local5, local8, false);
			this.aClass674_4.method33306(this.aByte100, this.aShort129, this.aShort130, this.aShort128, this.aShort127);
		}
	}
}
