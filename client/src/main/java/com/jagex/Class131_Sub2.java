package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ahv")
public final class Class131_Sub2 extends Class131 {

	@OriginalMember(owner = "client!ahv", name = "at", descriptor = "I")
	static final int anInt1142 = 10;

	@OriginalMember(owner = "client!ahv", name = "t", descriptor = "I")
	static final int anInt1143 = 1;

	@OriginalMember(owner = "client!ahv", name = "ae", descriptor = "I")
	static final int anInt1144 = 2;

	@OriginalMember(owner = "client!ahv", name = "ag", descriptor = "I")
	static final int anInt1145 = 3;

	@OriginalMember(owner = "client!ahv", name = "ah", descriptor = "I")
	static final int anInt1146 = 4;

	@OriginalMember(owner = "client!ahv", name = "al", descriptor = "I")
	static final int anInt1147 = 5;

	@OriginalMember(owner = "client!ahv", name = "ai", descriptor = "I")
	static final int anInt1148 = 7;

	@OriginalMember(owner = "client!ahv", name = "aw", descriptor = "I")
	static final int anInt1149 = 8;

	@OriginalMember(owner = "client!ahv", name = "as", descriptor = "I")
	static final int anInt1150 = 9;

	@OriginalMember(owner = "client!ahv", name = "j", descriptor = "I")
	static final int anInt1151 = 0;

	@OriginalMember(owner = "client!ahv", name = "aq", descriptor = "I")
	static final int anInt1152 = 16;

	@OriginalMember(owner = "client!ahv", name = "ap", descriptor = "I")
	static final int anInt1153 = 15;

	@OriginalMember(owner = "client!ahv", name = "au", descriptor = "I")
	static final int anInt1154 = 13;

	@OriginalMember(owner = "client!ahv", name = "ar", descriptor = "I")
	static final int anInt1155 = 14;

	@OriginalMember(owner = "client!ahv", name = "ad", descriptor = "I")
	static final int anInt1156 = 11;

	@OriginalMember(owner = "client!ahv", name = "ac", descriptor = "I")
	static final int anInt1157 = 6;

	@OriginalMember(owner = "client!ahv", name = "ax", descriptor = "I")
	static final int anInt1158 = 17;

	@OriginalMember(owner = "client!ahv", name = "av", descriptor = "I")
	static final int anInt1159 = 0;

	@OriginalMember(owner = "client!ahv", name = "am", descriptor = "I")
	static final int anInt1160 = 12;

	@OriginalMember(owner = "client!ahv", name = "aj", descriptor = "I")
	static final int anInt1161 = 2;

	@OriginalMember(owner = "client!ahv", name = "ay", descriptor = "I")
	static final int anInt1162 = 7;

	@OriginalMember(owner = "client!ahv", name = "ab", descriptor = "I")
	static final int anInt1163 = 12;

	@OriginalMember(owner = "client!ahv", name = "az", descriptor = "I")
	static final int anInt1164 = 17;

	@OriginalMember(owner = "client!ahv", name = "aa", descriptor = "I")
	static final int anInt1165 = 18;

	@OriginalMember(owner = "client!ahv", name = "af", descriptor = "I")
	static final int anInt1166 = 19;

	@OriginalMember(owner = "client!ahv", name = "ao", descriptor = "I")
	static final int anInt1167 = 1;

	@OriginalMember(owner = "client!ahv", name = "i", descriptor = "Lclient!ho;")
	Class115 aClass115_4;

	@OriginalMember(owner = "client!ahv", name = "bl", descriptor = "[I")
	int[] anIntArray98;

	@OriginalMember(owner = "client!ahv", name = "ak", descriptor = "Lclient!pq;")
	final Class489 aClass489_47 = new Class489();

	@OriginalMember(owner = "client!ahv", name = "an", descriptor = "[Lclient!hi;")
	final Class116[] aClass116Array4 = new Class116[19];

	@OriginalMember(owner = "client!ahv", name = "bf", descriptor = "[[I")
	final int[][] anIntArrayArray17 = new int[19][17];

	@OriginalMember(owner = "client!ahv", name = "<init>", descriptor = "(Lclient!afc;)V")
	public Class131_Sub2(@OriginalArg(0) Class104_Sub2 arg0) throws Exception_Sub2 {
		super(arg0);
		this.method10120(529900231);
	}

	@OriginalMember(owner = "client!ahv", name = "s", descriptor = "(I)V")
	@Override
	public void method10115(@OriginalArg(0) int arg0) {
		this.aClass115_4.method8203(this.aClass116Array4[arg0 + 12]);
		this.anIntArray98 = this.anIntArrayArray17[this.aClass115_4.method8253(-1539042633)];
		this.aClass115_4.method8285();
		this.aClass115_4.method8222(this.anIntArray98[15], this.aClass489_45, -98393697);
		this.aClass115_4.method8218(this.anIntArray98[6], this.aClass472_39.aFloat325, this.aClass472_39.aFloat326, this.aClass472_39.aFloat327, -2052057497);
		this.aClass115_4.method8256(this.anIntArray98[3], 1, this.anInterface44_3, (byte) 0);
		this.method10121(arg0, (byte) 42);
	}

	@OriginalMember(owner = "client!ahv", name = "a", descriptor = "(I)Z")
	boolean method10120(@OriginalArg(0) int arg0) throws Exception_Sub2 {
		this.aClass115_4 = this.aClass104_Sub2_18.method20904("Model");
		@Pc(11) Class93_Sub33_Sub1 local11 = this.aClass115_4.method8198("DiffuseSampler", (byte) 0);
		@Pc(17) Class93_Sub33_Sub1 local17 = this.aClass115_4.method8198("EnvironmentSampler", (byte) 0);
		@Pc(23) Class93_Sub33_Sub1 local23 = this.aClass115_4.method8198("PointLightsPosAndRadiusInv", (byte) 0);
		@Pc(29) Class93_Sub33_Sub1 local29 = this.aClass115_4.method8198("PointLightsDiffuseColour", (byte) 0);
		@Pc(35) Class93_Sub33_Sub1 local35 = this.aClass115_4.method8198("WVPMatrix", (byte) 0);
		@Pc(41) Class93_Sub33_Sub1 local41 = this.aClass115_4.method8198("TexCoordMatrix", (byte) 0);
		@Pc(47) Class93_Sub33_Sub1 local47 = this.aClass115_4.method8198("HeightFogPlane", (byte) 0);
		@Pc(53) Class93_Sub33_Sub1 local53 = this.aClass115_4.method8198("HeightFogColour", (byte) 0);
		@Pc(59) Class93_Sub33_Sub1 local59 = this.aClass115_4.method8198("DistanceFogPlane", (byte) 0);
		@Pc(65) Class93_Sub33_Sub1 local65 = this.aClass115_4.method8198("DistanceFogColour", (byte) 0);
		@Pc(71) Class93_Sub33_Sub1 local71 = this.aClass115_4.method8198("SunDir", (byte) 0);
		@Pc(77) Class93_Sub33_Sub1 local77 = this.aClass115_4.method8198("SunColour", (byte) 0);
		@Pc(83) Class93_Sub33_Sub1 local83 = this.aClass115_4.method8198("AntiSunColour", (byte) 0);
		@Pc(89) Class93_Sub33_Sub1 local89 = this.aClass115_4.method8198("AmbientColour", (byte) 0);
		@Pc(95) Class93_Sub33_Sub1 local95 = this.aClass115_4.method8198("EyePos", (byte) 0);
		@Pc(101) Class93_Sub33_Sub1 local101 = this.aClass115_4.method8198("SpecularExponent", (byte) 0);
		@Pc(107) Class93_Sub33_Sub1 local107 = this.aClass115_4.method8198("WorldMatrix", (byte) 0);
		this.aClass116Array4[0] = this.aClass115_4.method8268("Unlit", 1249273355);
		this.aClass116Array4[1] = this.aClass115_4.method8268("Unlit_IgnoreAlpha", 1249273355);
		this.aClass116Array4[17] = this.aClass115_4.method8268("UnderwaterGround", 1249273355);
		this.aClass116Array4[18] = this.aClass115_4.method8268("UnderwaterGroundSpecular", 1249273355);
		@Pc(145) int local145;
		for (local145 = 0; local145 <= 4; local145++) {
			this.aClass116Array4[local145 + 2] = this.aClass115_4.method8268("Standard_" + local145 + "PointLights", 1249273355);
			this.aClass116Array4[local145 + 7] = this.aClass115_4.method8268("Specular_" + local145 + "PointLights", 1249273355);
			this.aClass116Array4[local145 + 12] = this.aClass115_4.method8268("EnvironmentalMapping_" + local145 + "PointLights", 1249273355);
		}
		for (local145 = 0; local145 < 19; local145++) {
			@Pc(224) int local224 = this.aClass115_4.method8241(this.aClass116Array4[local145], 1285237246);
			this.anIntArrayArray17[local145][2] = local11.method23668(local224);
			this.anIntArrayArray17[local145][3] = local17.method23668(local224);
			this.anIntArrayArray17[local145][1] = local23.method23668(local224);
			this.anIntArrayArray17[local145][0] = local29.method23668(local224);
			this.anIntArrayArray17[local145][4] = local35.method23668(local224);
			this.anIntArrayArray17[local145][5] = local41.method23668(local224);
			this.anIntArrayArray17[local145][7] = local47.method23668(local224);
			this.anIntArrayArray17[local145][8] = local53.method23668(local224);
			this.anIntArrayArray17[local145][9] = local59.method23668(local224);
			this.anIntArrayArray17[local145][10] = local65.method23668(local224);
			this.anIntArrayArray17[local145][11] = local71.method23668(local224);
			this.anIntArrayArray17[local145][12] = local77.method23668(local224);
			this.anIntArrayArray17[local145][13] = local83.method23668(local224);
			this.anIntArrayArray17[local145][14] = local89.method23668(local224);
			this.anIntArrayArray17[local145][6] = local95.method23668(local224);
			this.anIntArrayArray17[local145][15] = local107.method23668(local224);
			this.anIntArrayArray17[local145][16] = local101.method23668(local224);
		}
		this.aClass115_4.method8203(this.aClass116Array4[2]);
		return true;
	}

	@OriginalMember(owner = "client!ahv", name = "n", descriptor = "(Lclient!pq;)V")
	@Override
	public void method10101(@OriginalArg(0) Class489 arg0) {
		this.aClass489_47.method30018(arg0);
		this.aClass489_47.method30134(this.aClass104_Sub2_18.aClass489_84);
	}

	@OriginalMember(owner = "client!ahv", name = "m", descriptor = "(Z)V")
	@Override
	public void method10102(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.aClass115_4.method8203(this.aClass116Array4[1]);
		} else {
			this.aClass115_4.method8203(this.aClass116Array4[0]);
		}
		this.anIntArray98 = this.anIntArrayArray17[this.aClass115_4.method8253(-1233011730)];
		this.aClass115_4.method8285();
		this.aClass115_4.method8256(this.anIntArray98[2], 0, this.anInterface38_18, (byte) 0);
		this.aClass115_4.method8224(this.anIntArray98[4], this.aClass489_47, -510509002);
		this.aClass115_4.method8223(this.anIntArray98[5], this.aClass489_46, 1047815710);
		this.aClass115_4.method8219(this.anIntArray98[7], this.aClass460_8.aFloat301, this.aClass460_8.aFloat300, this.aClass460_8.aFloat299, this.aClass460_8.aFloat302, 1741825539);
		this.aClass115_4.method8218(this.anIntArray98[8], this.aClass472_40.aFloat325, this.aClass472_40.aFloat326, this.aClass472_40.aFloat327, -2052057497);
		this.aClass115_4.method8219(this.anIntArray98[9], this.aClass460_9.aFloat301, this.aClass460_9.aFloat300, this.aClass460_9.aFloat299, this.aClass460_9.aFloat302, 1741825539);
		this.aClass115_4.method8218(this.anIntArray98[10], this.aClass472_41.aFloat325, this.aClass472_41.aFloat326, this.aClass472_41.aFloat327, -2052057497);
		this.aClass104_Sub2_18.method21019(Class424.aClass424_3, this.anInt1140, this.anInt1141, this.anInt1138, this.anInt1137);
	}

	@OriginalMember(owner = "client!ahv", name = "x", descriptor = "()V")
	@Override
	public void method10111() {
		this.aClass115_4.method8203(this.aClass116Array4[18]);
		this.anIntArray98 = this.anIntArrayArray17[this.aClass115_4.method8253(-963830867)];
		this.aClass115_4.method8285();
		this.aClass115_4.method8218(this.anIntArray98[6], this.aClass472_39.aFloat325, this.aClass472_39.aFloat326, this.aClass472_39.aFloat327, -2052057497);
		this.aClass115_4.method8219(this.anIntArray98[16], this.aFloat122, this.aFloat123, 0.0F, 0.0F, 1741825539);
		this.method10121(0, (byte) 43);
	}

	@OriginalMember(owner = "client!ahv", name = "u", descriptor = "()V")
	@Override
	public void method10107() {
		this.aClass115_4.method8203(this.aClass116Array4[18]);
		this.anIntArray98 = this.anIntArrayArray17[this.aClass115_4.method8253(-2135289901)];
		this.aClass115_4.method8285();
		this.aClass115_4.method8218(this.anIntArray98[6], this.aClass472_39.aFloat325, this.aClass472_39.aFloat326, this.aClass472_39.aFloat327, -2052057497);
		this.aClass115_4.method8219(this.anIntArray98[16], this.aFloat122, this.aFloat123, 0.0F, 0.0F, 1741825539);
		this.method10121(0, (byte) 123);
	}

	@OriginalMember(owner = "client!ahv", name = "g", descriptor = "(IB)V")
	void method10121(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aClass115_4.method8256(this.anIntArray98[2], 0, this.anInterface38_18, (byte) 0);
		this.aClass115_4.method8224(this.anIntArray98[4], this.aClass489_47, 1695926074);
		this.aClass115_4.method8223(this.anIntArray98[5], this.aClass489_46, 1047815710);
		this.aClass115_4.method8219(this.anIntArray98[7], this.aClass460_8.aFloat301, this.aClass460_8.aFloat300, this.aClass460_8.aFloat299, this.aClass460_8.aFloat302, 1741825539);
		this.aClass115_4.method8218(this.anIntArray98[8], this.aClass472_40.aFloat325, this.aClass472_40.aFloat326, this.aClass472_40.aFloat327, -2052057497);
		this.aClass115_4.method8219(this.anIntArray98[9], this.aClass460_9.aFloat301, this.aClass460_9.aFloat300, this.aClass460_9.aFloat299, this.aClass460_9.aFloat302, 1741825539);
		this.aClass115_4.method8218(this.anIntArray98[10], this.aClass472_41.aFloat325, this.aClass472_41.aFloat326, this.aClass472_41.aFloat327, -2052057497);
		this.aClass115_4.method8220(this.anIntArray98[11], this.aClass472_42, (byte) 19);
		this.aClass115_4.method8220(this.anIntArray98[12], this.aClass472_43, (byte) 90);
		this.aClass115_4.method8220(this.anIntArray98[13], this.aClass472_44, (byte) 102);
		this.aClass115_4.method8220(this.anIntArray98[14], this.aClass472_38, (byte) 48);
		if (arg0 > 0) {
			this.aClass115_4.method8221(this.anIntArray98[1], this.aFloatArray40, arg0 * 4, 1913460803);
			this.aClass115_4.method8221(this.anIntArray98[0], this.aFloatArray39, arg0 * 4, 2103378184);
		}
		this.aClass104_Sub2_18.method21019(Class424.aClass424_3, this.anInt1140, this.anInt1141, this.anInt1138, this.anInt1137);
	}

	@OriginalMember(owner = "client!ahv", name = "k", descriptor = "(I)V")
	@Override
	public void method10103(@OriginalArg(0) int arg0) {
		this.aClass115_4.method8203(this.aClass116Array4[arg0 + 2]);
		this.anIntArray98 = this.anIntArrayArray17[this.aClass115_4.method8253(-408187396)];
		this.aClass115_4.method8285();
		this.method10121(arg0, (byte) 69);
	}

	@OriginalMember(owner = "client!ahv", name = "f", descriptor = "(I)V")
	@Override
	public void method10114(@OriginalArg(0) int arg0) {
		this.aClass115_4.method8203(this.aClass116Array4[arg0 + 7]);
		this.anIntArray98 = this.anIntArrayArray17[this.aClass115_4.method8253(-962794430)];
		this.aClass115_4.method8285();
		this.aClass115_4.method8218(this.anIntArray98[6], this.aClass472_39.aFloat325, this.aClass472_39.aFloat326, this.aClass472_39.aFloat327, -2052057497);
		this.aClass115_4.method8219(this.anIntArray98[16], this.aFloat122, this.aFloat123, 0.0F, 0.0F, 1741825539);
		this.method10121(arg0, (byte) 18);
	}

	@OriginalMember(owner = "client!ahv", name = "ag", descriptor = "(I)V")
	void method10122(@OriginalArg(0) int arg0) {
		this.aClass115_4.method8256(this.anIntArray98[2], 0, this.anInterface38_18, (byte) 0);
		this.aClass115_4.method8224(this.anIntArray98[4], this.aClass489_47, -1662920611);
		this.aClass115_4.method8223(this.anIntArray98[5], this.aClass489_46, 1047815710);
		this.aClass115_4.method8219(this.anIntArray98[7], this.aClass460_8.aFloat301, this.aClass460_8.aFloat300, this.aClass460_8.aFloat299, this.aClass460_8.aFloat302, 1741825539);
		this.aClass115_4.method8218(this.anIntArray98[8], this.aClass472_40.aFloat325, this.aClass472_40.aFloat326, this.aClass472_40.aFloat327, -2052057497);
		this.aClass115_4.method8219(this.anIntArray98[9], this.aClass460_9.aFloat301, this.aClass460_9.aFloat300, this.aClass460_9.aFloat299, this.aClass460_9.aFloat302, 1741825539);
		this.aClass115_4.method8218(this.anIntArray98[10], this.aClass472_41.aFloat325, this.aClass472_41.aFloat326, this.aClass472_41.aFloat327, -2052057497);
		this.aClass115_4.method8220(this.anIntArray98[11], this.aClass472_42, (byte) 101);
		this.aClass115_4.method8220(this.anIntArray98[12], this.aClass472_43, (byte) 93);
		this.aClass115_4.method8220(this.anIntArray98[13], this.aClass472_44, (byte) 41);
		this.aClass115_4.method8220(this.anIntArray98[14], this.aClass472_38, (byte) 49);
		if (arg0 > 0) {
			this.aClass115_4.method8221(this.anIntArray98[1], this.aFloatArray40, arg0 * 4, 1657325440);
			this.aClass115_4.method8221(this.anIntArray98[0], this.aFloatArray39, arg0 * 4, 2045421419);
		}
		this.aClass104_Sub2_18.method21019(Class424.aClass424_3, this.anInt1140, this.anInt1141, this.anInt1138, this.anInt1137);
	}

	@OriginalMember(owner = "client!ahv", name = "p", descriptor = "(Z)V")
	@Override
	public void method10108(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.aClass115_4.method8203(this.aClass116Array4[1]);
		} else {
			this.aClass115_4.method8203(this.aClass116Array4[0]);
		}
		this.anIntArray98 = this.anIntArrayArray17[this.aClass115_4.method8253(-2145355490)];
		this.aClass115_4.method8285();
		this.aClass115_4.method8256(this.anIntArray98[2], 0, this.anInterface38_18, (byte) 0);
		this.aClass115_4.method8224(this.anIntArray98[4], this.aClass489_47, 735439681);
		this.aClass115_4.method8223(this.anIntArray98[5], this.aClass489_46, 1047815710);
		this.aClass115_4.method8219(this.anIntArray98[7], this.aClass460_8.aFloat301, this.aClass460_8.aFloat300, this.aClass460_8.aFloat299, this.aClass460_8.aFloat302, 1741825539);
		this.aClass115_4.method8218(this.anIntArray98[8], this.aClass472_40.aFloat325, this.aClass472_40.aFloat326, this.aClass472_40.aFloat327, -2052057497);
		this.aClass115_4.method8219(this.anIntArray98[9], this.aClass460_9.aFloat301, this.aClass460_9.aFloat300, this.aClass460_9.aFloat299, this.aClass460_9.aFloat302, 1741825539);
		this.aClass115_4.method8218(this.anIntArray98[10], this.aClass472_41.aFloat325, this.aClass472_41.aFloat326, this.aClass472_41.aFloat327, -2052057497);
		this.aClass104_Sub2_18.method21019(Class424.aClass424_3, this.anInt1140, this.anInt1141, this.anInt1138, this.anInt1137);
	}

	@OriginalMember(owner = "client!ahv", name = "z", descriptor = "(Lclient!pq;)V")
	@Override
	public void method10104(@OriginalArg(0) Class489 arg0) {
		this.aClass489_47.method30018(arg0);
		this.aClass489_47.method30134(this.aClass104_Sub2_18.aClass489_84);
	}

	@OriginalMember(owner = "client!ahv", name = "c", descriptor = "(Z)V")
	@Override
	public void method10110(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.aClass115_4.method8203(this.aClass116Array4[1]);
		} else {
			this.aClass115_4.method8203(this.aClass116Array4[0]);
		}
		this.anIntArray98 = this.anIntArrayArray17[this.aClass115_4.method8253(-829294915)];
		this.aClass115_4.method8285();
		this.aClass115_4.method8256(this.anIntArray98[2], 0, this.anInterface38_18, (byte) 0);
		this.aClass115_4.method8224(this.anIntArray98[4], this.aClass489_47, -1428439727);
		this.aClass115_4.method8223(this.anIntArray98[5], this.aClass489_46, 1047815710);
		this.aClass115_4.method8219(this.anIntArray98[7], this.aClass460_8.aFloat301, this.aClass460_8.aFloat300, this.aClass460_8.aFloat299, this.aClass460_8.aFloat302, 1741825539);
		this.aClass115_4.method8218(this.anIntArray98[8], this.aClass472_40.aFloat325, this.aClass472_40.aFloat326, this.aClass472_40.aFloat327, -2052057497);
		this.aClass115_4.method8219(this.anIntArray98[9], this.aClass460_9.aFloat301, this.aClass460_9.aFloat300, this.aClass460_9.aFloat299, this.aClass460_9.aFloat302, 1741825539);
		this.aClass115_4.method8218(this.anIntArray98[10], this.aClass472_41.aFloat325, this.aClass472_41.aFloat326, this.aClass472_41.aFloat327, -2052057497);
		this.aClass104_Sub2_18.method21019(Class424.aClass424_3, this.anInt1140, this.anInt1141, this.anInt1138, this.anInt1137);
	}

	@OriginalMember(owner = "client!ahv", name = "r", descriptor = "(Z)V")
	@Override
	public void method10105(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.aClass115_4.method8203(this.aClass116Array4[1]);
		} else {
			this.aClass115_4.method8203(this.aClass116Array4[0]);
		}
		this.anIntArray98 = this.anIntArrayArray17[this.aClass115_4.method8253(-1210968606)];
		this.aClass115_4.method8285();
		this.aClass115_4.method8256(this.anIntArray98[2], 0, this.anInterface38_18, (byte) 0);
		this.aClass115_4.method8224(this.anIntArray98[4], this.aClass489_47, -208366480);
		this.aClass115_4.method8223(this.anIntArray98[5], this.aClass489_46, 1047815710);
		this.aClass115_4.method8219(this.anIntArray98[7], this.aClass460_8.aFloat301, this.aClass460_8.aFloat300, this.aClass460_8.aFloat299, this.aClass460_8.aFloat302, 1741825539);
		this.aClass115_4.method8218(this.anIntArray98[8], this.aClass472_40.aFloat325, this.aClass472_40.aFloat326, this.aClass472_40.aFloat327, -2052057497);
		this.aClass115_4.method8219(this.anIntArray98[9], this.aClass460_9.aFloat301, this.aClass460_9.aFloat300, this.aClass460_9.aFloat299, this.aClass460_9.aFloat302, 1741825539);
		this.aClass115_4.method8218(this.anIntArray98[10], this.aClass472_41.aFloat325, this.aClass472_41.aFloat326, this.aClass472_41.aFloat327, -2052057497);
		this.aClass104_Sub2_18.method21019(Class424.aClass424_3, this.anInt1140, this.anInt1141, this.anInt1138, this.anInt1137);
	}

	@OriginalMember(owner = "client!ahv", name = "i", descriptor = "()Z")
	boolean method10123() throws Exception_Sub2 {
		this.aClass115_4 = this.aClass104_Sub2_18.method20904("Model");
		@Pc(11) Class93_Sub33_Sub1 local11 = this.aClass115_4.method8198("DiffuseSampler", (byte) 0);
		@Pc(17) Class93_Sub33_Sub1 local17 = this.aClass115_4.method8198("EnvironmentSampler", (byte) 0);
		@Pc(23) Class93_Sub33_Sub1 local23 = this.aClass115_4.method8198("PointLightsPosAndRadiusInv", (byte) 0);
		@Pc(29) Class93_Sub33_Sub1 local29 = this.aClass115_4.method8198("PointLightsDiffuseColour", (byte) 0);
		@Pc(35) Class93_Sub33_Sub1 local35 = this.aClass115_4.method8198("WVPMatrix", (byte) 0);
		@Pc(41) Class93_Sub33_Sub1 local41 = this.aClass115_4.method8198("TexCoordMatrix", (byte) 0);
		@Pc(47) Class93_Sub33_Sub1 local47 = this.aClass115_4.method8198("HeightFogPlane", (byte) 0);
		@Pc(53) Class93_Sub33_Sub1 local53 = this.aClass115_4.method8198("HeightFogColour", (byte) 0);
		@Pc(59) Class93_Sub33_Sub1 local59 = this.aClass115_4.method8198("DistanceFogPlane", (byte) 0);
		@Pc(65) Class93_Sub33_Sub1 local65 = this.aClass115_4.method8198("DistanceFogColour", (byte) 0);
		@Pc(71) Class93_Sub33_Sub1 local71 = this.aClass115_4.method8198("SunDir", (byte) 0);
		@Pc(77) Class93_Sub33_Sub1 local77 = this.aClass115_4.method8198("SunColour", (byte) 0);
		@Pc(83) Class93_Sub33_Sub1 local83 = this.aClass115_4.method8198("AntiSunColour", (byte) 0);
		@Pc(89) Class93_Sub33_Sub1 local89 = this.aClass115_4.method8198("AmbientColour", (byte) 0);
		@Pc(95) Class93_Sub33_Sub1 local95 = this.aClass115_4.method8198("EyePos", (byte) 0);
		@Pc(101) Class93_Sub33_Sub1 local101 = this.aClass115_4.method8198("SpecularExponent", (byte) 0);
		@Pc(107) Class93_Sub33_Sub1 local107 = this.aClass115_4.method8198("WorldMatrix", (byte) 0);
		this.aClass116Array4[0] = this.aClass115_4.method8268("Unlit", 1249273355);
		this.aClass116Array4[1] = this.aClass115_4.method8268("Unlit_IgnoreAlpha", 1249273355);
		this.aClass116Array4[17] = this.aClass115_4.method8268("UnderwaterGround", 1249273355);
		this.aClass116Array4[18] = this.aClass115_4.method8268("UnderwaterGroundSpecular", 1249273355);
		@Pc(145) int local145;
		for (local145 = 0; local145 <= 4; local145++) {
			this.aClass116Array4[local145 + 2] = this.aClass115_4.method8268("Standard_" + local145 + "PointLights", 1249273355);
			this.aClass116Array4[local145 + 7] = this.aClass115_4.method8268("Specular_" + local145 + "PointLights", 1249273355);
			this.aClass116Array4[local145 + 12] = this.aClass115_4.method8268("EnvironmentalMapping_" + local145 + "PointLights", 1249273355);
		}
		for (local145 = 0; local145 < 19; local145++) {
			@Pc(224) int local224 = this.aClass115_4.method8241(this.aClass116Array4[local145], 1127052821);
			this.anIntArrayArray17[local145][2] = local11.method23668(local224);
			this.anIntArrayArray17[local145][3] = local17.method23668(local224);
			this.anIntArrayArray17[local145][1] = local23.method23668(local224);
			this.anIntArrayArray17[local145][0] = local29.method23668(local224);
			this.anIntArrayArray17[local145][4] = local35.method23668(local224);
			this.anIntArrayArray17[local145][5] = local41.method23668(local224);
			this.anIntArrayArray17[local145][7] = local47.method23668(local224);
			this.anIntArrayArray17[local145][8] = local53.method23668(local224);
			this.anIntArrayArray17[local145][9] = local59.method23668(local224);
			this.anIntArrayArray17[local145][10] = local65.method23668(local224);
			this.anIntArrayArray17[local145][11] = local71.method23668(local224);
			this.anIntArrayArray17[local145][12] = local77.method23668(local224);
			this.anIntArrayArray17[local145][13] = local83.method23668(local224);
			this.anIntArrayArray17[local145][14] = local89.method23668(local224);
			this.anIntArrayArray17[local145][6] = local95.method23668(local224);
			this.anIntArrayArray17[local145][15] = local107.method23668(local224);
			this.anIntArrayArray17[local145][16] = local101.method23668(local224);
		}
		this.aClass115_4.method8203(this.aClass116Array4[2]);
		return true;
	}

	@OriginalMember(owner = "client!ahv", name = "o", descriptor = "(I)V")
	@Override
	public void method10113(@OriginalArg(0) int arg0) {
		this.aClass115_4.method8203(this.aClass116Array4[arg0 + 7]);
		this.anIntArray98 = this.anIntArrayArray17[this.aClass115_4.method8253(-906274292)];
		this.aClass115_4.method8285();
		this.aClass115_4.method8218(this.anIntArray98[6], this.aClass472_39.aFloat325, this.aClass472_39.aFloat326, this.aClass472_39.aFloat327, -2052057497);
		this.aClass115_4.method8219(this.anIntArray98[16], this.aFloat122, this.aFloat123, 0.0F, 0.0F, 1741825539);
		this.method10121(arg0, (byte) 99);
	}

	@OriginalMember(owner = "client!ahv", name = "w", descriptor = "(I)V")
	@Override
	public void method10109(@OriginalArg(0) int arg0) {
		this.aClass115_4.method8203(this.aClass116Array4[arg0 + 12]);
		this.anIntArray98 = this.anIntArrayArray17[this.aClass115_4.method8253(-1184131893)];
		this.aClass115_4.method8285();
		this.aClass115_4.method8222(this.anIntArray98[15], this.aClass489_45, -339211371);
		this.aClass115_4.method8218(this.anIntArray98[6], this.aClass472_39.aFloat325, this.aClass472_39.aFloat326, this.aClass472_39.aFloat327, -2052057497);
		this.aClass115_4.method8256(this.anIntArray98[3], 1, this.anInterface44_3, (byte) 0);
		this.method10121(arg0, (byte) 101);
	}

	@OriginalMember(owner = "client!ahv", name = "y", descriptor = "()V")
	@Override
	public void method10118() {
		this.aClass115_4.method8203(this.aClass116Array4[17]);
		this.anIntArray98 = this.anIntArrayArray17[this.aClass115_4.method8253(-846676181)];
		this.aClass115_4.method8285();
		this.method10121(0, (byte) 39);
	}

	@OriginalMember(owner = "client!ahv", name = "q", descriptor = "()V")
	@Override
	public void method10116() {
		this.aClass115_4.method8203(this.aClass116Array4[18]);
		this.anIntArray98 = this.anIntArrayArray17[this.aClass115_4.method8253(-1691035137)];
		this.aClass115_4.method8285();
		this.aClass115_4.method8218(this.anIntArray98[6], this.aClass472_39.aFloat325, this.aClass472_39.aFloat326, this.aClass472_39.aFloat327, -2052057497);
		this.aClass115_4.method8219(this.anIntArray98[16], this.aFloat122, this.aFloat123, 0.0F, 0.0F, 1741825539);
		this.method10121(0, (byte) 43);
	}

	@OriginalMember(owner = "client!ahv", name = "ae", descriptor = "(I)V")
	void method10124(@OriginalArg(0) int arg0) {
		this.aClass115_4.method8256(this.anIntArray98[2], 0, this.anInterface38_18, (byte) 0);
		this.aClass115_4.method8224(this.anIntArray98[4], this.aClass489_47, 14829429);
		this.aClass115_4.method8223(this.anIntArray98[5], this.aClass489_46, 1047815710);
		this.aClass115_4.method8219(this.anIntArray98[7], this.aClass460_8.aFloat301, this.aClass460_8.aFloat300, this.aClass460_8.aFloat299, this.aClass460_8.aFloat302, 1741825539);
		this.aClass115_4.method8218(this.anIntArray98[8], this.aClass472_40.aFloat325, this.aClass472_40.aFloat326, this.aClass472_40.aFloat327, -2052057497);
		this.aClass115_4.method8219(this.anIntArray98[9], this.aClass460_9.aFloat301, this.aClass460_9.aFloat300, this.aClass460_9.aFloat299, this.aClass460_9.aFloat302, 1741825539);
		this.aClass115_4.method8218(this.anIntArray98[10], this.aClass472_41.aFloat325, this.aClass472_41.aFloat326, this.aClass472_41.aFloat327, -2052057497);
		this.aClass115_4.method8220(this.anIntArray98[11], this.aClass472_42, (byte) 39);
		this.aClass115_4.method8220(this.anIntArray98[12], this.aClass472_43, (byte) 53);
		this.aClass115_4.method8220(this.anIntArray98[13], this.aClass472_44, (byte) 14);
		this.aClass115_4.method8220(this.anIntArray98[14], this.aClass472_38, (byte) 56);
		if (arg0 > 0) {
			this.aClass115_4.method8221(this.anIntArray98[1], this.aFloatArray40, arg0 * 4, 1967691700);
			this.aClass115_4.method8221(this.anIntArray98[0], this.aFloatArray39, arg0 * 4, 2092695729);
		}
		this.aClass104_Sub2_18.method21019(Class424.aClass424_3, this.anInt1140, this.anInt1141, this.anInt1138, this.anInt1137);
	}

	@OriginalMember(owner = "client!ahv", name = "d", descriptor = "(Z)V")
	@Override
	public void method10117(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.aClass115_4.method8203(this.aClass116Array4[1]);
		} else {
			this.aClass115_4.method8203(this.aClass116Array4[0]);
		}
		this.anIntArray98 = this.anIntArrayArray17[this.aClass115_4.method8253(-1699089359)];
		this.aClass115_4.method8285();
		this.aClass115_4.method8256(this.anIntArray98[2], 0, this.anInterface38_18, (byte) 0);
		this.aClass115_4.method8224(this.anIntArray98[4], this.aClass489_47, 1469049464);
		this.aClass115_4.method8223(this.anIntArray98[5], this.aClass489_46, 1047815710);
		this.aClass115_4.method8219(this.anIntArray98[7], this.aClass460_8.aFloat301, this.aClass460_8.aFloat300, this.aClass460_8.aFloat299, this.aClass460_8.aFloat302, 1741825539);
		this.aClass115_4.method8218(this.anIntArray98[8], this.aClass472_40.aFloat325, this.aClass472_40.aFloat326, this.aClass472_40.aFloat327, -2052057497);
		this.aClass115_4.method8219(this.anIntArray98[9], this.aClass460_9.aFloat301, this.aClass460_9.aFloat300, this.aClass460_9.aFloat299, this.aClass460_9.aFloat302, 1741825539);
		this.aClass115_4.method8218(this.anIntArray98[10], this.aClass472_41.aFloat325, this.aClass472_41.aFloat326, this.aClass472_41.aFloat327, -2052057497);
		this.aClass104_Sub2_18.method21019(Class424.aClass424_3, this.anInt1140, this.anInt1141, this.anInt1138, this.anInt1137);
	}

	@OriginalMember(owner = "client!ahv", name = "j", descriptor = "()Z")
	boolean method10125() throws Exception_Sub2 {
		this.aClass115_4 = this.aClass104_Sub2_18.method20904("Model");
		@Pc(11) Class93_Sub33_Sub1 local11 = this.aClass115_4.method8198("DiffuseSampler", (byte) 0);
		@Pc(17) Class93_Sub33_Sub1 local17 = this.aClass115_4.method8198("EnvironmentSampler", (byte) 0);
		@Pc(23) Class93_Sub33_Sub1 local23 = this.aClass115_4.method8198("PointLightsPosAndRadiusInv", (byte) 0);
		@Pc(29) Class93_Sub33_Sub1 local29 = this.aClass115_4.method8198("PointLightsDiffuseColour", (byte) 0);
		@Pc(35) Class93_Sub33_Sub1 local35 = this.aClass115_4.method8198("WVPMatrix", (byte) 0);
		@Pc(41) Class93_Sub33_Sub1 local41 = this.aClass115_4.method8198("TexCoordMatrix", (byte) 0);
		@Pc(47) Class93_Sub33_Sub1 local47 = this.aClass115_4.method8198("HeightFogPlane", (byte) 0);
		@Pc(53) Class93_Sub33_Sub1 local53 = this.aClass115_4.method8198("HeightFogColour", (byte) 0);
		@Pc(59) Class93_Sub33_Sub1 local59 = this.aClass115_4.method8198("DistanceFogPlane", (byte) 0);
		@Pc(65) Class93_Sub33_Sub1 local65 = this.aClass115_4.method8198("DistanceFogColour", (byte) 0);
		@Pc(71) Class93_Sub33_Sub1 local71 = this.aClass115_4.method8198("SunDir", (byte) 0);
		@Pc(77) Class93_Sub33_Sub1 local77 = this.aClass115_4.method8198("SunColour", (byte) 0);
		@Pc(83) Class93_Sub33_Sub1 local83 = this.aClass115_4.method8198("AntiSunColour", (byte) 0);
		@Pc(89) Class93_Sub33_Sub1 local89 = this.aClass115_4.method8198("AmbientColour", (byte) 0);
		@Pc(95) Class93_Sub33_Sub1 local95 = this.aClass115_4.method8198("EyePos", (byte) 0);
		@Pc(101) Class93_Sub33_Sub1 local101 = this.aClass115_4.method8198("SpecularExponent", (byte) 0);
		@Pc(107) Class93_Sub33_Sub1 local107 = this.aClass115_4.method8198("WorldMatrix", (byte) 0);
		this.aClass116Array4[0] = this.aClass115_4.method8268("Unlit", 1249273355);
		this.aClass116Array4[1] = this.aClass115_4.method8268("Unlit_IgnoreAlpha", 1249273355);
		this.aClass116Array4[17] = this.aClass115_4.method8268("UnderwaterGround", 1249273355);
		this.aClass116Array4[18] = this.aClass115_4.method8268("UnderwaterGroundSpecular", 1249273355);
		@Pc(145) int local145;
		for (local145 = 0; local145 <= 4; local145++) {
			this.aClass116Array4[local145 + 2] = this.aClass115_4.method8268("Standard_" + local145 + "PointLights", 1249273355);
			this.aClass116Array4[local145 + 7] = this.aClass115_4.method8268("Specular_" + local145 + "PointLights", 1249273355);
			this.aClass116Array4[local145 + 12] = this.aClass115_4.method8268("EnvironmentalMapping_" + local145 + "PointLights", 1249273355);
		}
		for (local145 = 0; local145 < 19; local145++) {
			@Pc(224) int local224 = this.aClass115_4.method8241(this.aClass116Array4[local145], 1743842414);
			this.anIntArrayArray17[local145][2] = local11.method23668(local224);
			this.anIntArrayArray17[local145][3] = local17.method23668(local224);
			this.anIntArrayArray17[local145][1] = local23.method23668(local224);
			this.anIntArrayArray17[local145][0] = local29.method23668(local224);
			this.anIntArrayArray17[local145][4] = local35.method23668(local224);
			this.anIntArrayArray17[local145][5] = local41.method23668(local224);
			this.anIntArrayArray17[local145][7] = local47.method23668(local224);
			this.anIntArrayArray17[local145][8] = local53.method23668(local224);
			this.anIntArrayArray17[local145][9] = local59.method23668(local224);
			this.anIntArrayArray17[local145][10] = local65.method23668(local224);
			this.anIntArrayArray17[local145][11] = local71.method23668(local224);
			this.anIntArrayArray17[local145][12] = local77.method23668(local224);
			this.anIntArrayArray17[local145][13] = local83.method23668(local224);
			this.anIntArrayArray17[local145][14] = local89.method23668(local224);
			this.anIntArrayArray17[local145][6] = local95.method23668(local224);
			this.anIntArrayArray17[local145][15] = local107.method23668(local224);
			this.anIntArrayArray17[local145][16] = local101.method23668(local224);
		}
		this.aClass115_4.method8203(this.aClass116Array4[2]);
		return true;
	}

	@OriginalMember(owner = "client!ahv", name = "t", descriptor = "(I)V")
	void method10126(@OriginalArg(0) int arg0) {
		this.aClass115_4.method8256(this.anIntArray98[2], 0, this.anInterface38_18, (byte) 0);
		this.aClass115_4.method8224(this.anIntArray98[4], this.aClass489_47, 219118896);
		this.aClass115_4.method8223(this.anIntArray98[5], this.aClass489_46, 1047815710);
		this.aClass115_4.method8219(this.anIntArray98[7], this.aClass460_8.aFloat301, this.aClass460_8.aFloat300, this.aClass460_8.aFloat299, this.aClass460_8.aFloat302, 1741825539);
		this.aClass115_4.method8218(this.anIntArray98[8], this.aClass472_40.aFloat325, this.aClass472_40.aFloat326, this.aClass472_40.aFloat327, -2052057497);
		this.aClass115_4.method8219(this.anIntArray98[9], this.aClass460_9.aFloat301, this.aClass460_9.aFloat300, this.aClass460_9.aFloat299, this.aClass460_9.aFloat302, 1741825539);
		this.aClass115_4.method8218(this.anIntArray98[10], this.aClass472_41.aFloat325, this.aClass472_41.aFloat326, this.aClass472_41.aFloat327, -2052057497);
		this.aClass115_4.method8220(this.anIntArray98[11], this.aClass472_42, (byte) 78);
		this.aClass115_4.method8220(this.anIntArray98[12], this.aClass472_43, (byte) 113);
		this.aClass115_4.method8220(this.anIntArray98[13], this.aClass472_44, (byte) 13);
		this.aClass115_4.method8220(this.anIntArray98[14], this.aClass472_38, (byte) 30);
		if (arg0 > 0) {
			this.aClass115_4.method8221(this.anIntArray98[1], this.aFloatArray40, arg0 * 4, 1937007992);
			this.aClass115_4.method8221(this.anIntArray98[0], this.aFloatArray39, arg0 * 4, 2076410329);
		}
		this.aClass104_Sub2_18.method21019(Class424.aClass424_3, this.anInt1140, this.anInt1141, this.anInt1138, this.anInt1137);
	}

	@OriginalMember(owner = "client!ahv", name = "l", descriptor = "()V")
	@Override
	public void method10106() {
		this.aClass115_4.method8203(this.aClass116Array4[17]);
		this.anIntArray98 = this.anIntArrayArray17[this.aClass115_4.method8253(-551811768)];
		this.aClass115_4.method8285();
		this.method10121(0, (byte) 127);
	}

	@OriginalMember(owner = "client!ahv", name = "v", descriptor = "(I)V")
	@Override
	public void method10112(@OriginalArg(0) int arg0) {
		this.aClass115_4.method8203(this.aClass116Array4[arg0 + 2]);
		this.anIntArray98 = this.anIntArrayArray17[this.aClass115_4.method8253(-2016206905)];
		this.aClass115_4.method8285();
		this.method10121(arg0, (byte) 103);
	}
}
