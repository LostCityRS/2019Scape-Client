package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kc")
public final class Class374 {

	@OriginalMember(owner = "client!kc", name = "l", descriptor = "I")
	static final int anInt4759 = 4;

	@OriginalMember(owner = "client!kc", name = "k", descriptor = "I")
	static final int anInt4760 = 1;

	@OriginalMember(owner = "client!kc", name = "u", descriptor = "I")
	static final int anInt4761 = 5;

	@OriginalMember(owner = "client!kc", name = "w", descriptor = "I")
	static final int anInt4762 = 3;

	@OriginalMember(owner = "client!kc", name = "f", descriptor = "I")
	static final int anInt4763 = 2;

	@OriginalMember(owner = "client!kc", name = "e", descriptor = "J")
	long aLong266;

	@OriginalMember(owner = "client!kc", name = "n", descriptor = "J")
	long aLong267 = 1909394539023591297L;

	@OriginalMember(owner = "client!kc", name = "m", descriptor = "Lclient!aat;")
	Class22 aClass22_52 = new Class22();

	@OriginalMember(owner = "client!kc", name = "hf", descriptor = "(Lclient!yf;I)V")
	static void method28210(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class12.method188(local11, local14, false, 1, arg0, 1691862116);
	}

	@OriginalMember(owner = "client!kc", name = "aev", descriptor = "(Lclient!yf;I)V")
	static void method28211(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6052 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		if (local13 == 0) {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 0;
		} else {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = (int) Math.pow((double) local13, (double) local23);
		}
	}

	@OriginalMember(owner = "client!kc", name = "aey", descriptor = "(Lclient!yf;I)V")
	static void method28212(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6052 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		if (local13 == 0 || local23 == 0) {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 0;
			return;
		}
		switch(local23) {
			case 1:
				arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local13;
				return;
			case 2:
				arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = (int) Math.sqrt((double) local13);
				return;
			case 3:
				arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = (int) Math.cbrt((double) local13);
				return;
			case 4:
				arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = (int) Math.sqrt(Math.sqrt((double) local13));
				return;
			default:
				arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = (int) Math.pow((double) local13, 1.0D / (double) local23);
		}
	}

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(Lclient!alw;)V")
	public Class374(@OriginalArg(0) Class93_Sub41 arg0) {
		this.method28207(arg0, 1141002213);
	}

	@OriginalMember(owner = "client!kc", name = "n", descriptor = "(Lclient!akr;B)V")
	public void method28206(@OriginalArg(0) Class93_Sub28 arg0, @OriginalArg(1) byte arg1) {
		if (this.aLong266 * -8966225610675334557L != arg0.aLong232 * -3750704643647536275L || arg0.aLong89 * 2544502113182261825L != this.aLong267 * -2525066851661502593L) {
			throw new RuntimeException("");
		}
		for (@Pc(30) Class93_Sub31 local30 = (Class93_Sub31) this.aClass22_52.method445((byte) 34); local30 != null; local30 = (Class93_Sub31) this.aClass22_52.method415(-27001554)) {
			local30.method22019(arg0, (short) -9399);
		}
		arg0.aLong89 += -8713487650679722559L;
	}

	@OriginalMember(owner = "client!kc", name = "e", descriptor = "(Lclient!alw;I)V")
	void method28207(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		this.aLong266 = arg0.method22435(-1793289088) * -5428801191899480245L;
		this.aLong267 = arg0.method22435(-1841165438) * -1909394539023591297L;
		for (@Pc(17) int local17 = arg0.method22425((short) 16384); local17 != 0; local17 = arg0.method22425((short) 16384)) {
			@Pc(28) Class93_Sub31 local28;
			if (local17 == 1) {
				local28 = new Class93_Sub31_Sub5(this);
			} else if (local17 == 4) {
				local28 = new Class93_Sub31_Sub1(this);
			} else if (local17 == 3) {
				local28 = new Class93_Sub31_Sub3(this);
			} else if (local17 == 2) {
				local28 = new Class93_Sub31_Sub2(this);
			} else if (local17 == 5) {
				local28 = new Class93_Sub31_Sub4(this);
			} else {
				throw new RuntimeException("");
			}
			local28.method22023(arg0, -53454962);
			this.aClass22_52.method407(local28, -1735309444);
		}
	}

	@OriginalMember(owner = "client!kc", name = "m", descriptor = "(Lclient!alw;)V")
	void method28208(@OriginalArg(0) Class93_Sub41 arg0) {
		this.aLong266 = arg0.method22435(-1267017634) * -5428801191899480245L;
		this.aLong267 = arg0.method22435(1173150065) * -1909394539023591297L;
		for (@Pc(17) int local17 = arg0.method22425((short) 16384); local17 != 0; local17 = arg0.method22425((short) 16384)) {
			@Pc(28) Class93_Sub31 local28;
			if (local17 == 1) {
				local28 = new Class93_Sub31_Sub5(this);
			} else if (local17 == 4) {
				local28 = new Class93_Sub31_Sub1(this);
			} else if (local17 == 3) {
				local28 = new Class93_Sub31_Sub3(this);
			} else if (local17 == 2) {
				local28 = new Class93_Sub31_Sub2(this);
			} else if (local17 == 5) {
				local28 = new Class93_Sub31_Sub4(this);
			} else {
				throw new RuntimeException("");
			}
			local28.method22023(arg0, 389315429);
			this.aClass22_52.method407(local28, -1448892006);
		}
	}

	@OriginalMember(owner = "client!kc", name = "k", descriptor = "(Lclient!akr;)V")
	public void method28209(@OriginalArg(0) Class93_Sub28 arg0) {
		if (this.aLong266 * -8966225610675334557L != arg0.aLong232 * -3750704643647536275L || arg0.aLong89 * 2544502113182261825L != this.aLong267 * -2525066851661502593L) {
			throw new RuntimeException("");
		}
		for (@Pc(30) Class93_Sub31 local30 = (Class93_Sub31) this.aClass22_52.method445((byte) 108); local30 != null; local30 = (Class93_Sub31) this.aClass22_52.method415(1647105761)) {
			local30.method22019(arg0, (short) -20793);
		}
		arg0.aLong89 += -8713487650679722559L;
	}
}
