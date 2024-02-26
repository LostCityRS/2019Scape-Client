package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aqq")
public final class Class131_Sub1_Sub2 extends Class131_Sub1 {

	@OriginalMember(owner = "client!aqq", name = "ae", descriptor = "I")
	public int anInt2877;

	@OriginalMember(owner = "client!aqq", name = "ac", descriptor = "Lclient!aqv;")
	Class80_Sub13_Sub1 aClass80_Sub13_Sub1_84;

	@OriginalMember(owner = "client!aqq", name = "ab", descriptor = "Lclient!ht;")
	Class114 aClass114_12;

	@OriginalMember(owner = "client!aqq", name = "al", descriptor = "Lclient!ht;")
	Class114 aClass114_13;

	@OriginalMember(owner = "client!aqq", name = "ah", descriptor = "Lclient!aqv;")
	Class80_Sub13_Sub1 aClass80_Sub13_Sub1_85;

	@OriginalMember(owner = "client!aqq", name = "am", descriptor = "Lclient!aqv;")
	Class80_Sub13_Sub1 aClass80_Sub13_Sub1_86;

	@OriginalMember(owner = "client!aqq", name = "aa", descriptor = "F")
	float aFloat197;

	@OriginalMember(owner = "client!aqq", name = "ag", descriptor = "Lclient!aqv;")
	Class80_Sub13_Sub1 aClass80_Sub13_Sub1_87;

	@OriginalMember(owner = "client!aqq", name = "av", descriptor = "Lclient!aqv;")
	Class80_Sub13_Sub1 aClass80_Sub13_Sub1_88;

	@OriginalMember(owner = "client!aqq", name = "at", descriptor = "Lclient!aqv;")
	Class80_Sub13_Sub1 aClass80_Sub13_Sub1_89;

	@OriginalMember(owner = "client!aqq", name = "ap", descriptor = "I")
	public int anInt2878;

	@OriginalMember(owner = "client!aqq", name = "ar", descriptor = "I")
	public int anInt2879;

	@OriginalMember(owner = "client!aqq", name = "au", descriptor = "I")
	public int anInt2880;

	@OriginalMember(owner = "client!aqq", name = "af", descriptor = "Lclient!pm;")
	public final Class487 aClass487_73 = new Class487();

	@OriginalMember(owner = "client!aqq", name = "ak", descriptor = "Lclient!pm;")
	public final Class487 aClass487_72 = new Class487();

	@OriginalMember(owner = "client!aqq", name = "ad", descriptor = "[F")
	final float[] aFloatArray60 = new float[4];

	@OriginalMember(owner = "client!aqq", name = "an", descriptor = "[F")
	final float[] aFloatArray61 = new float[4];

	@OriginalMember(owner = "client!aqq", name = "aj", descriptor = "Lclient!lj;")
	final Class398 aClass398_4;

	@OriginalMember(owner = "client!aqq", name = "<init>", descriptor = "(Lclient!afa;Lclient!lj;)V")
	public Class131_Sub1_Sub2(@OriginalArg(0) Class102_Sub1 arg0, @OriginalArg(1) Class398 arg1) throws Exception_Sub5 {
		super(arg0);
		this.aClass398_4 = arg1;
		if (this.aClass398_4.method28718() && arg0.method21287()) {
			this.method20456("Waterfall");
		}
	}

	@OriginalMember(owner = "client!aqq", name = "al", descriptor = "()Z")
	@Override
	boolean method20475() throws Exception_Sub5 {
		this.aClass80_Sub13_Sub1_86 = this.aClass113_10.method8302("WorldMatrix", 1955432926);
		this.aClass80_Sub13_Sub1_85 = this.aClass113_10.method8302("WVPMatrix", 2143357312);
		this.aClass80_Sub13_Sub1_89 = this.aClass113_10.method8302("UGenerationPlane", 1944865545);
		this.aClass80_Sub13_Sub1_88 = this.aClass113_10.method8302("VGenerationPlane", 1990795617);
		this.aClass80_Sub13_Sub1_84 = this.aClass113_10.method8302("Time", 2069051458);
		this.aClass80_Sub13_Sub1_87 = this.aClass113_10.method8302("billowSampler3D", 2017638818);
		if (this.aClass398_4.aBoolean853) {
			this.aClass114_12 = this.aClass113_10.method8377("Waterfall3D", (byte) -63);
			this.aClass113_10.method8295(this.aClass114_12);
		} else {
			this.aClass114_13 = this.aClass113_10.method8377("Waterfall2D", (byte) 34);
			this.aClass113_10.method8295(this.aClass114_13);
		}
		return true;
	}

	@OriginalMember(owner = "client!aqq", name = "v", descriptor = "()Z")
	@Override
	boolean method20455() throws Exception_Sub5 {
		this.aClass80_Sub13_Sub1_86 = this.aClass113_10.method8302("WorldMatrix", 1981425645);
		this.aClass80_Sub13_Sub1_85 = this.aClass113_10.method8302("WVPMatrix", 2116183666);
		this.aClass80_Sub13_Sub1_89 = this.aClass113_10.method8302("UGenerationPlane", 1947225843);
		this.aClass80_Sub13_Sub1_88 = this.aClass113_10.method8302("VGenerationPlane", 1997666804);
		this.aClass80_Sub13_Sub1_84 = this.aClass113_10.method8302("Time", 2124444311);
		this.aClass80_Sub13_Sub1_87 = this.aClass113_10.method8302("billowSampler3D", 2100847365);
		if (this.aClass398_4.aBoolean853) {
			this.aClass114_12 = this.aClass113_10.method8377("Waterfall3D", (byte) -85);
			this.aClass113_10.method8295(this.aClass114_12);
		} else {
			this.aClass114_13 = this.aClass113_10.method8377("Waterfall2D", (byte) -17);
			this.aClass113_10.method8295(this.aClass114_13);
		}
		return true;
	}

	@OriginalMember(owner = "client!aqq", name = "bt", descriptor = "(I)V")
	public void method20491(@OriginalArg(0) int arg0) {
		if (this.aClass398_4.aBoolean853) {
			this.aClass113_10.method8295(this.aClass114_12);
		} else {
			this.aClass113_10.method8295(this.aClass114_13);
		}
		this.aClass113_10.method8256();
		if (this.aClass398_4.aBoolean853) {
			this.aClass113_10.method8280(this.aClass80_Sub13_Sub1_87, 0, this.aClass398_4.anInterface36_3, (short) 12622);
		}
		this.aClass113_10.method8268(this.aClass80_Sub13_Sub1_86, this.aClass487_72, -871388298);
		this.aClass113_10.method8268(this.aClass80_Sub13_Sub1_85, this.aClass487_73, -871388298);
		this.aClass113_10.method8275(this.aClass80_Sub13_Sub1_89, new Class456(this.aFloatArray60[0], this.aFloatArray60[1], this.aFloatArray60[2], this.aFloatArray60[3]), (short) 30591);
		this.aClass113_10.method8275(this.aClass80_Sub13_Sub1_88, new Class456(this.aFloatArray61[0], this.aFloatArray61[1], this.aFloatArray61[2], this.aFloatArray61[3]), (short) 19259);
		this.aClass113_10.method8275(this.aClass80_Sub13_Sub1_84, new Class456(this.aFloat197, 0.0F, 0.0F, 0.0F), (short) 22672);
		this.aClass102_Sub1_31.method21373(Class415.aClass415_6, this.anInt2877 * 953714619, this.anInt2878 * -315836729, this.anInt2879 * -715849331, this.anInt2880 * -1701196895);
	}

	@OriginalMember(owner = "client!aqq", name = "bj", descriptor = "()V")
	public void method20492() {
		if (this.aClass398_4.aBoolean853) {
			this.aClass113_10.method8295(this.aClass114_12);
		} else {
			this.aClass113_10.method8295(this.aClass114_13);
		}
		this.aClass113_10.method8256();
		if (this.aClass398_4.aBoolean853) {
			this.aClass113_10.method8280(this.aClass80_Sub13_Sub1_87, 0, this.aClass398_4.anInterface36_3, (short) 14081);
		}
		this.aClass113_10.method8268(this.aClass80_Sub13_Sub1_86, this.aClass487_72, -871388298);
		this.aClass113_10.method8268(this.aClass80_Sub13_Sub1_85, this.aClass487_73, -871388298);
		this.aClass113_10.method8275(this.aClass80_Sub13_Sub1_89, new Class456(this.aFloatArray60[0], this.aFloatArray60[1], this.aFloatArray60[2], this.aFloatArray60[3]), (short) 23090);
		this.aClass113_10.method8275(this.aClass80_Sub13_Sub1_88, new Class456(this.aFloatArray61[0], this.aFloatArray61[1], this.aFloatArray61[2], this.aFloatArray61[3]), (short) 19523);
		this.aClass113_10.method8275(this.aClass80_Sub13_Sub1_84, new Class456(this.aFloat197, 0.0F, 0.0F, 0.0F), (short) 13765);
		this.aClass102_Sub1_31.method21373(Class415.aClass415_6, this.anInt2877 * 953714619, this.anInt2878 * -315836729, this.anInt2879 * -715849331, this.anInt2880 * -1701196895);
	}

	@OriginalMember(owner = "client!aqq", name = "ah", descriptor = "()Z")
	@Override
	boolean method20474() throws Exception_Sub5 {
		this.aClass80_Sub13_Sub1_86 = this.aClass113_10.method8302("WorldMatrix", 2071610282);
		this.aClass80_Sub13_Sub1_85 = this.aClass113_10.method8302("WVPMatrix", 1982985927);
		this.aClass80_Sub13_Sub1_89 = this.aClass113_10.method8302("UGenerationPlane", 2085822976);
		this.aClass80_Sub13_Sub1_88 = this.aClass113_10.method8302("VGenerationPlane", 1996035197);
		this.aClass80_Sub13_Sub1_84 = this.aClass113_10.method8302("Time", 1984442534);
		this.aClass80_Sub13_Sub1_87 = this.aClass113_10.method8302("billowSampler3D", 2058813113);
		if (this.aClass398_4.aBoolean853) {
			this.aClass114_12 = this.aClass113_10.method8377("Waterfall3D", (byte) -84);
			this.aClass113_10.method8295(this.aClass114_12);
		} else {
			this.aClass114_13 = this.aClass113_10.method8377("Waterfall2D", (byte) 78);
			this.aClass113_10.method8295(this.aClass114_13);
		}
		return true;
	}

	@OriginalMember(owner = "client!aqq", name = "bs", descriptor = "(II)V")
	public void method20493(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) float local8 = -5.0E-4F * (float) ((arg0 & 0x3) + 1);
		@Pc(19) float local19 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(28) float local28 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(37) boolean local37 = (arg0 & 0x80) != 0;
		if (local37) {
			this.aFloatArray60[0] = local28;
			this.aFloatArray60[1] = 0.0F;
			this.aFloatArray60[2] = 0.0F;
			this.aFloatArray60[3] = 0.0F;
		} else {
			this.aFloatArray60[0] = 0.0F;
			this.aFloatArray60[1] = 0.0F;
			this.aFloatArray60[2] = local28;
			this.aFloatArray60[3] = 0.0F;
		}
		this.aFloatArray61[0] = 0.0F;
		this.aFloatArray61[1] = local28;
		this.aFloatArray61[2] = 0.0F;
		this.aFloatArray61[3] = (float) this.aClass102_Sub1_31.anInt3000 * local8 % 1.0F;
		if (this.aClass398_4.aBoolean853) {
			this.aFloat197 = (float) ((double) this.aClass102_Sub1_31.anInt3000 * (double) local19 % 1.0D);
		} else {
			@Pc(121) int local121 = (int) (local19 * 16.0F * (float) this.aClass102_Sub1_31.anInt3000);
			this.aClass102_Sub1_31.method21429(this.aClass398_4.anInterface34Array2[local121 % 16]);
		}
	}

	@OriginalMember(owner = "client!aqq", name = "ba", descriptor = "(IIS)V")
	public void method20494(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) short arg2) {
		@Pc(8) float local8 = -5.0E-4F * (float) ((arg0 & 0x3) + 1);
		@Pc(19) float local19 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(28) float local28 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(37) boolean local37 = (arg0 & 0x80) != 0;
		if (local37) {
			this.aFloatArray60[0] = local28;
			this.aFloatArray60[1] = 0.0F;
			this.aFloatArray60[2] = 0.0F;
			this.aFloatArray60[3] = 0.0F;
		} else {
			this.aFloatArray60[0] = 0.0F;
			this.aFloatArray60[1] = 0.0F;
			this.aFloatArray60[2] = local28;
			this.aFloatArray60[3] = 0.0F;
		}
		this.aFloatArray61[0] = 0.0F;
		this.aFloatArray61[1] = local28;
		this.aFloatArray61[2] = 0.0F;
		this.aFloatArray61[3] = (float) this.aClass102_Sub1_31.anInt3000 * local8 % 1.0F;
		if (this.aClass398_4.aBoolean853) {
			this.aFloat197 = (float) ((double) this.aClass102_Sub1_31.anInt3000 * (double) local19 % 1.0D);
		} else {
			@Pc(121) int local121 = (int) (local19 * 16.0F * (float) this.aClass102_Sub1_31.anInt3000);
			this.aClass102_Sub1_31.method21429(this.aClass398_4.anInterface34Array2[local121 % 16]);
		}
	}

	@OriginalMember(owner = "client!aqq", name = "by", descriptor = "()V")
	public void method20495() {
		if (this.aClass398_4.aBoolean853) {
			this.aClass113_10.method8295(this.aClass114_12);
		} else {
			this.aClass113_10.method8295(this.aClass114_13);
		}
		this.aClass113_10.method8256();
		if (this.aClass398_4.aBoolean853) {
			this.aClass113_10.method8280(this.aClass80_Sub13_Sub1_87, 0, this.aClass398_4.anInterface36_3, (short) 12554);
		}
		this.aClass113_10.method8268(this.aClass80_Sub13_Sub1_86, this.aClass487_72, -871388298);
		this.aClass113_10.method8268(this.aClass80_Sub13_Sub1_85, this.aClass487_73, -871388298);
		this.aClass113_10.method8275(this.aClass80_Sub13_Sub1_89, new Class456(this.aFloatArray60[0], this.aFloatArray60[1], this.aFloatArray60[2], this.aFloatArray60[3]), (short) 18182);
		this.aClass113_10.method8275(this.aClass80_Sub13_Sub1_88, new Class456(this.aFloatArray61[0], this.aFloatArray61[1], this.aFloatArray61[2], this.aFloatArray61[3]), (short) 23784);
		this.aClass113_10.method8275(this.aClass80_Sub13_Sub1_84, new Class456(this.aFloat197, 0.0F, 0.0F, 0.0F), (short) 5169);
		this.aClass102_Sub1_31.method21373(Class415.aClass415_6, this.anInt2877 * 953714619, this.anInt2878 * -315836729, this.anInt2879 * -715849331, this.anInt2880 * -1701196895);
	}

	@OriginalMember(owner = "client!aqq", name = "bk", descriptor = "()V")
	public void method20496() {
		if (this.aClass398_4.aBoolean853) {
			this.aClass113_10.method8295(this.aClass114_12);
		} else {
			this.aClass113_10.method8295(this.aClass114_13);
		}
		this.aClass113_10.method8256();
		if (this.aClass398_4.aBoolean853) {
			this.aClass113_10.method8280(this.aClass80_Sub13_Sub1_87, 0, this.aClass398_4.anInterface36_3, (short) 10429);
		}
		this.aClass113_10.method8268(this.aClass80_Sub13_Sub1_86, this.aClass487_72, -871388298);
		this.aClass113_10.method8268(this.aClass80_Sub13_Sub1_85, this.aClass487_73, -871388298);
		this.aClass113_10.method8275(this.aClass80_Sub13_Sub1_89, new Class456(this.aFloatArray60[0], this.aFloatArray60[1], this.aFloatArray60[2], this.aFloatArray60[3]), (short) 15447);
		this.aClass113_10.method8275(this.aClass80_Sub13_Sub1_88, new Class456(this.aFloatArray61[0], this.aFloatArray61[1], this.aFloatArray61[2], this.aFloatArray61[3]), (short) 17471);
		this.aClass113_10.method8275(this.aClass80_Sub13_Sub1_84, new Class456(this.aFloat197, 0.0F, 0.0F, 0.0F), (short) 20887);
		this.aClass102_Sub1_31.method21373(Class415.aClass415_6, this.anInt2877 * 953714619, this.anInt2878 * -315836729, this.anInt2879 * -715849331, this.anInt2880 * -1701196895);
	}

	@OriginalMember(owner = "client!aqq", name = "bz", descriptor = "()V")
	public void method20497() {
		if (this.aClass398_4.aBoolean853) {
			this.aClass113_10.method8295(this.aClass114_12);
		} else {
			this.aClass113_10.method8295(this.aClass114_13);
		}
		this.aClass113_10.method8256();
		if (this.aClass398_4.aBoolean853) {
			this.aClass113_10.method8280(this.aClass80_Sub13_Sub1_87, 0, this.aClass398_4.anInterface36_3, (short) 11520);
		}
		this.aClass113_10.method8268(this.aClass80_Sub13_Sub1_86, this.aClass487_72, -871388298);
		this.aClass113_10.method8268(this.aClass80_Sub13_Sub1_85, this.aClass487_73, -871388298);
		this.aClass113_10.method8275(this.aClass80_Sub13_Sub1_89, new Class456(this.aFloatArray60[0], this.aFloatArray60[1], this.aFloatArray60[2], this.aFloatArray60[3]), (short) 30008);
		this.aClass113_10.method8275(this.aClass80_Sub13_Sub1_88, new Class456(this.aFloatArray61[0], this.aFloatArray61[1], this.aFloatArray61[2], this.aFloatArray61[3]), (short) 18509);
		this.aClass113_10.method8275(this.aClass80_Sub13_Sub1_84, new Class456(this.aFloat197, 0.0F, 0.0F, 0.0F), (short) 16877);
		this.aClass102_Sub1_31.method21373(Class415.aClass415_6, this.anInt2877 * 953714619, this.anInt2878 * -315836729, this.anInt2879 * -715849331, this.anInt2880 * -1701196895);
	}
}
