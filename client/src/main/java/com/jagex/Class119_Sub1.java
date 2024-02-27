package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.awt.*;

@OriginalClass("client!aha")
public final class Class119_Sub1 extends Class119 {

	@OriginalMember(owner = "client!aha", name = "ap", descriptor = "I")
	static final int anInt1038 = 12;

	@OriginalMember(owner = "client!aha", name = "b", descriptor = "I")
	static final int anInt1039 = 1;

	@OriginalMember(owner = "client!aha", name = "az", descriptor = "I")
	static final int anInt1040 = 19;

	@OriginalMember(owner = "client!aha", name = "ay", descriptor = "I")
	static final int anInt1041 = 3;

	@OriginalMember(owner = "client!aha", name = "ax", descriptor = "I")
	static final int anInt1042 = 2;

	@OriginalMember(owner = "client!aha", name = "ao", descriptor = "I")
	static final int anInt1043 = 6;

	@OriginalMember(owner = "client!aha", name = "aa", descriptor = "I")
	static final int anInt1044 = 2;

	@OriginalMember(owner = "client!aha", name = "aj", descriptor = "I")
	static final int anInt1045 = 7;

	@OriginalMember(owner = "client!aha", name = "ac", descriptor = "I")
	static final int anInt1046 = 8;

	@OriginalMember(owner = "client!aha", name = "ag", descriptor = "I")
	static final int anInt1047 = 9;

	@OriginalMember(owner = "client!aha", name = "ab", descriptor = "I")
	static final int anInt1048 = 10;

	@OriginalMember(owner = "client!aha", name = "al", descriptor = "I")
	static final int anInt1049 = 11;

	@OriginalMember(owner = "client!aha", name = "ah", descriptor = "I")
	static final int anInt1050 = 12;

	@OriginalMember(owner = "client!aha", name = "af", descriptor = "I")
	static final int anInt1051 = 13;

	@OriginalMember(owner = "client!aha", name = "am", descriptor = "I")
	static final int anInt1052 = 14;

	@OriginalMember(owner = "client!aha", name = "ak", descriptor = "I")
	static final int anInt1053 = 15;

	@OriginalMember(owner = "client!aha", name = "av", descriptor = "I")
	static final int anInt1054 = 0;

	@OriginalMember(owner = "client!aha", name = "an", descriptor = "I")
	static final int anInt1055 = 1;

	@OriginalMember(owner = "client!aha", name = "c", descriptor = "I")
	static final int anInt1056 = 0;

	@OriginalMember(owner = "client!aha", name = "ae", descriptor = "I")
	static final int anInt1057 = 7;

	@OriginalMember(owner = "client!aha", name = "ad", descriptor = "I")
	static final int anInt1058 = 17;

	@OriginalMember(owner = "client!aha", name = "ar", descriptor = "I")
	static final int anInt1059 = 17;

	@OriginalMember(owner = "client!aha", name = "au", descriptor = "I")
	static final int anInt1060 = 18;

	@OriginalMember(owner = "client!aha", name = "aq", descriptor = "I")
	static final int anInt1061 = 5;

	@OriginalMember(owner = "client!aha", name = "ai", descriptor = "I")
	static final int anInt1062 = 4;

	@OriginalMember(owner = "client!aha", name = "at", descriptor = "I")
	static final int anInt1063 = 16;

	@OriginalMember(owner = "client!aha", name = "bl", descriptor = "[I")
	int[] anIntArray97;

	@OriginalMember(owner = "client!aha", name = "n", descriptor = "Lclient!hb;")
	Class113 aClass113_1;

	@OriginalMember(owner = "client!aha", name = "as", descriptor = "Lclient!pm;")
	final Class487 aClass487_34 = new Class487();

	@OriginalMember(owner = "client!aha", name = "aw", descriptor = "[Lclient!ht;")
	final Class114[] aClass114Array4 = new Class114[19];

	@OriginalMember(owner = "client!aha", name = "bg", descriptor = "[[I")
	final int[][] anIntArrayArray17 = new int[19][17];

	@OriginalMember(owner = "client!aha", name = "apv", descriptor = "(Lclient!yp;B)V")
	static void method8898(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		if (BufferedSocket.aClass121_Sub1_2.method9702(1533777672) != Class347.aClass347_7) {
			throw new RuntimeException();
		}
		((Class20_Sub3) BufferedSocket.aClass121_Sub1_2.method9693(1317479146)).method16662(arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581], -1581197789);
	}

	@OriginalMember(owner = "client!aha", name = "fo", descriptor = "(ZB)V")
	static void method8899(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte arg1) {
		if (arg0) {
			if (client.anInt3460 * 1849344509 != -1) {
				Class123.method20527(client.anInt3460 * 1849344509, (byte) 4);
			}
			for (@Pc(16) Class80_Sub40 local16 = (Class80_Sub40) client.aClass24_20.method580((byte) -118); local16 != null; local16 = (Class80_Sub40) client.aClass24_20.method566((byte) 7)) {
				if (!local16.method24399(1358591496)) {
					local16 = (Class80_Sub40) client.aClass24_20.method580((byte) -112);
					if (local16 == null) {
						break;
					}
				}
				Class80_Sub42.method15605(local16, true, false, (byte) -65);
			}
			client.anInt3460 = -458761045;
			client.aClass24_20 = new Class24(8);
			Class305.method27204(369756894);
			client.anInt3460 = Class698.aClass638_1.anInt5635 * 1887492313;
			if (client.anInt3460 * 1849344509 != -1) {
				Class144_Sub1.method12033(false, 134436465);
				Class138_Sub1.method10718((byte) 111);
				Class367.method28283(client.anInt3460 * 1849344509, null, -452465770);
			}
		}
		Class238.aBoolean771 = true;
	}

	@OriginalMember(owner = "client!aha", name = "f", descriptor = "(Lclient!di;B)V")
	static void method8900(@OriginalArg(0) Class102 arg0, @OriginalArg(1) byte arg1) {
		if (Class175.aClass8_43.method239((byte) -17) == 0) {
			return;
		}
		@Pc(14) Class80_Sub10 local14;
		if (Class703.aClass80_Sub37_49.aClass165_Sub1_2.method15834(1710259289) == 0) {
			for (local14 = (Class80_Sub10) Class175.aClass8_43.method247(129206984); local14 != null; local14 = (Class80_Sub10) Class175.aClass8_43.method237(-520728814)) {
				Class25.aClass41_Sub9_1.method17329(arg0, arg0, local14.anInt1514 * 280006311, local14.anInt1511 * -2139920331, local14.anInt1510 * 1316303167, local14.anInt1513 * 1945413367, false, false, local14.anInt1512 * -876731593, Class108.aClass104_22, local14.aBoolean347 ? Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aClass672_1 : null, Class698.aClass638_1, -1969187530);
				local14.method24395((byte) 16);
			}
			Class138_Sub1.method10718((byte) 42);
			return;
		}
		if (Class175.aClass102_8 == null) {
			@Pc(72) Canvas local72 = new Canvas();
			local72.setSize(36, 32);
			Class175.aClass102_8 = Class620.method32309(0, local72, Class626.aClass235_8, Class39.anInterface23_1, Class475.aClass445_1, Class447.aClass450_1, Class380.aClass444_1, Class80_Sub15.aClass480_35, 0, (byte) -121);
			Class255.aClass104_23 = Class175.aClass102_8.method20749(Class427.method29056(Class569.aClass480_124, Class495.anInt5032 * -1666529807, 0, (byte) 113), Class212.method25822(Class708.aClass480_136, Class495.anInt5032 * -1666529807, 0), true);
		}
		for (local14 = (Class80_Sub10) Class175.aClass8_43.method247(129206984); local14 != null; local14 = (Class80_Sub10) Class175.aClass8_43.method237(-25027359)) {
			Class25.aClass41_Sub9_1.method17329(Class175.aClass102_8, arg0, local14.anInt1514 * 280006311, local14.anInt1511 * -2139920331, local14.anInt1510 * 1316303167, local14.anInt1513 * 1945413367, false, false, local14.anInt1512 * -876731593, Class255.aClass104_23, local14.aBoolean347 ? Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aClass672_1 : null, Class698.aClass638_1, -1795750282);
			local14.method24395((byte) 86);
		}
	}

	@OriginalMember(owner = "client!aha", name = "aht", descriptor = "(Lclient!yp;I)V")
	static void method8901(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(18) Class43 local18 = (Class43) Class25.aClass41_Sub9_1.method18054(local12, -373175258);
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local18.anInt151 * -331223913 == 2 ? 1 : 0;
	}

	@OriginalMember(owner = "client!aha", name = "ahj", descriptor = "(Lclient!yp;I)V")
	static void method8902(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		@Pc(29) Class79 local29 = (Class79) Class370.aClass41_Sub10_1.method18054(local23, -1635195500);
		if (local29.method1428(1876279823)) {
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = ((Class335) Class460.aClass41_Sub2_1.method18054(local13, 460451719)).method27832(local23, local29.aString11, (byte) 59);
		} else {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = ((Class335) Class460.aClass41_Sub2_1.method18054(local13, 517147734)).method27849(local23, local29.anInt253 * 680817871, -1848681478);
		}
	}

	@OriginalMember(owner = "client!aha", name = "<init>", descriptor = "(Lclient!afa;)V")
	public Class119_Sub1(@OriginalArg(0) Class102_Sub1 arg0) throws Exception_Sub5 {
		super(arg0);
		this.method8890(-1996271436);
	}

	@OriginalMember(owner = "client!aha", name = "ah", descriptor = "(I)V")
	void method8889(@OriginalArg(0) int arg0) {
		this.aClass113_1.method8300(this.anIntArray97[2], 0, this.anInterface34_8, 1402791203);
		this.aClass113_1.method8287(this.anIntArray97[4], this.aClass487_34, 1712159989);
		this.aClass113_1.method8286(this.anIntArray97[5], this.aClass487_35, 704545068);
		this.aClass113_1.method8282(this.anIntArray97[7], this.aClass456_5.aFloat294, this.aClass456_5.aFloat292, this.aClass456_5.aFloat291, this.aClass456_5.aFloat293, -1583611537);
		this.aClass113_1.method8281(this.anIntArray97[8], this.aClass463_20.aFloat297, this.aClass463_20.aFloat295, this.aClass463_20.aFloat296, -738892563);
		this.aClass113_1.method8282(this.anIntArray97[9], this.aClass456_6.aFloat294, this.aClass456_6.aFloat292, this.aClass456_6.aFloat291, this.aClass456_6.aFloat293, -1583611537);
		this.aClass113_1.method8281(this.anIntArray97[10], this.aClass463_19.aFloat297, this.aClass463_19.aFloat295, this.aClass463_19.aFloat296, -738892563);
		this.aClass113_1.method8283(this.anIntArray97[11], this.aClass463_17, -409095347);
		this.aClass113_1.method8283(this.anIntArray97[12], this.aClass463_22, 1463456261);
		this.aClass113_1.method8283(this.anIntArray97[13], this.aClass463_16, 942799628);
		this.aClass113_1.method8283(this.anIntArray97[14], this.aClass463_21, 543197162);
		if (arg0 > 0) {
			this.aClass113_1.method8284(this.anIntArray97[1], this.aFloatArray38, arg0 * 4, (short) 200);
			this.aClass113_1.method8284(this.anIntArray97[0], this.aFloatArray37, arg0 * 4, (short) 200);
		}
		this.aClass102_Sub1_8.method21373(Class415.aClass415_6, this.anInt1107, this.anInt1108, this.anInt1105, this.anInt1109);
	}

	@OriginalMember(owner = "client!aha", name = "ao", descriptor = "(I)Z")
	boolean method8890(@OriginalArg(0) int arg0) throws Exception_Sub5 {
		this.aClass113_1 = this.aClass102_Sub1_8.method21142("Model");
		@Pc(11) Class80_Sub13_Sub1 local11 = this.aClass113_1.method8302("DiffuseSampler", 2066950941);
		@Pc(17) Class80_Sub13_Sub1 local17 = this.aClass113_1.method8302("EnvironmentSampler", 1963339282);
		@Pc(23) Class80_Sub13_Sub1 local23 = this.aClass113_1.method8302("PointLightsPosAndRadiusInv", 2027898835);
		@Pc(29) Class80_Sub13_Sub1 local29 = this.aClass113_1.method8302("PointLightsDiffuseColour", 1966508119);
		@Pc(35) Class80_Sub13_Sub1 local35 = this.aClass113_1.method8302("WVPMatrix", 2055946306);
		@Pc(41) Class80_Sub13_Sub1 local41 = this.aClass113_1.method8302("TexCoordMatrix", 1999544707);
		@Pc(47) Class80_Sub13_Sub1 local47 = this.aClass113_1.method8302("HeightFogPlane", 2003240172);
		@Pc(53) Class80_Sub13_Sub1 local53 = this.aClass113_1.method8302("HeightFogColour", 2076474815);
		@Pc(59) Class80_Sub13_Sub1 local59 = this.aClass113_1.method8302("DistanceFogPlane", 2141635050);
		@Pc(65) Class80_Sub13_Sub1 local65 = this.aClass113_1.method8302("DistanceFogColour", 2081324445);
		@Pc(71) Class80_Sub13_Sub1 local71 = this.aClass113_1.method8302("SunDir", 2026675901);
		@Pc(77) Class80_Sub13_Sub1 local77 = this.aClass113_1.method8302("SunColour", 1939314945);
		@Pc(83) Class80_Sub13_Sub1 local83 = this.aClass113_1.method8302("AntiSunColour", 2030830496);
		@Pc(89) Class80_Sub13_Sub1 local89 = this.aClass113_1.method8302("AmbientColour", 2142220278);
		@Pc(95) Class80_Sub13_Sub1 local95 = this.aClass113_1.method8302("EyePos", 1975857096);
		@Pc(101) Class80_Sub13_Sub1 local101 = this.aClass113_1.method8302("SpecularExponent", 1961604377);
		@Pc(107) Class80_Sub13_Sub1 local107 = this.aClass113_1.method8302("WorldMatrix", 2008919607);
		this.aClass114Array4[0] = this.aClass113_1.method8377("Unlit", (byte) -20);
		this.aClass114Array4[1] = this.aClass113_1.method8377("Unlit_IgnoreAlpha", (byte) -70);
		this.aClass114Array4[17] = this.aClass113_1.method8377("UnderwaterGround", (byte) -34);
		this.aClass114Array4[18] = this.aClass113_1.method8377("UnderwaterGroundSpecular", (byte) 28);
		@Pc(145) int local145;
		for (local145 = 0; local145 <= 4; local145++) {
			this.aClass114Array4[local145 + 2] = this.aClass113_1.method8377("Standard_" + local145 + "PointLights", (byte) -11);
			this.aClass114Array4[local145 + 7] = this.aClass113_1.method8377("Specular_" + local145 + "PointLights", (byte) -51);
			this.aClass114Array4[local145 + 12] = this.aClass113_1.method8377("EnvironmentalMapping_" + local145 + "PointLights", (byte) 27);
		}
		for (local145 = 0; local145 < 19; local145++) {
			@Pc(224) int local224 = this.aClass113_1.method8264(this.aClass114Array4[local145], 2111075279);
			this.anIntArrayArray17[local145][2] = local11.method23997(local224);
			this.anIntArrayArray17[local145][3] = local17.method23997(local224);
			this.anIntArrayArray17[local145][1] = local23.method23997(local224);
			this.anIntArrayArray17[local145][0] = local29.method23997(local224);
			this.anIntArrayArray17[local145][4] = local35.method23997(local224);
			this.anIntArrayArray17[local145][5] = local41.method23997(local224);
			this.anIntArrayArray17[local145][7] = local47.method23997(local224);
			this.anIntArrayArray17[local145][8] = local53.method23997(local224);
			this.anIntArrayArray17[local145][9] = local59.method23997(local224);
			this.anIntArrayArray17[local145][10] = local65.method23997(local224);
			this.anIntArrayArray17[local145][11] = local71.method23997(local224);
			this.anIntArrayArray17[local145][12] = local77.method23997(local224);
			this.anIntArrayArray17[local145][13] = local83.method23997(local224);
			this.anIntArrayArray17[local145][14] = local89.method23997(local224);
			this.anIntArrayArray17[local145][6] = local95.method23997(local224);
			this.anIntArrayArray17[local145][15] = local107.method23997(local224);
			this.anIntArrayArray17[local145][16] = local101.method23997(local224);
		}
		this.aClass113_1.method8295(this.aClass114Array4[2]);
		return true;
	}

	@OriginalMember(owner = "client!aha", name = "ac", descriptor = "()Z")
	boolean method8891() throws Exception_Sub5 {
		this.aClass113_1 = this.aClass102_Sub1_8.method21142("Model");
		@Pc(11) Class80_Sub13_Sub1 local11 = this.aClass113_1.method8302("DiffuseSampler", 2006112776);
		@Pc(17) Class80_Sub13_Sub1 local17 = this.aClass113_1.method8302("EnvironmentSampler", 1958211036);
		@Pc(23) Class80_Sub13_Sub1 local23 = this.aClass113_1.method8302("PointLightsPosAndRadiusInv", 1979959481);
		@Pc(29) Class80_Sub13_Sub1 local29 = this.aClass113_1.method8302("PointLightsDiffuseColour", 2043068159);
		@Pc(35) Class80_Sub13_Sub1 local35 = this.aClass113_1.method8302("WVPMatrix", 2017456113);
		@Pc(41) Class80_Sub13_Sub1 local41 = this.aClass113_1.method8302("TexCoordMatrix", 1938527670);
		@Pc(47) Class80_Sub13_Sub1 local47 = this.aClass113_1.method8302("HeightFogPlane", 2124538723);
		@Pc(53) Class80_Sub13_Sub1 local53 = this.aClass113_1.method8302("HeightFogColour", 1998408705);
		@Pc(59) Class80_Sub13_Sub1 local59 = this.aClass113_1.method8302("DistanceFogPlane", 2003290363);
		@Pc(65) Class80_Sub13_Sub1 local65 = this.aClass113_1.method8302("DistanceFogColour", 2132733199);
		@Pc(71) Class80_Sub13_Sub1 local71 = this.aClass113_1.method8302("SunDir", 2114438439);
		@Pc(77) Class80_Sub13_Sub1 local77 = this.aClass113_1.method8302("SunColour", 2112705865);
		@Pc(83) Class80_Sub13_Sub1 local83 = this.aClass113_1.method8302("AntiSunColour", 2078672192);
		@Pc(89) Class80_Sub13_Sub1 local89 = this.aClass113_1.method8302("AmbientColour", 2094235811);
		@Pc(95) Class80_Sub13_Sub1 local95 = this.aClass113_1.method8302("EyePos", 1968428795);
		@Pc(101) Class80_Sub13_Sub1 local101 = this.aClass113_1.method8302("SpecularExponent", 2036526883);
		@Pc(107) Class80_Sub13_Sub1 local107 = this.aClass113_1.method8302("WorldMatrix", 2020391816);
		this.aClass114Array4[0] = this.aClass113_1.method8377("Unlit", (byte) 1);
		this.aClass114Array4[1] = this.aClass113_1.method8377("Unlit_IgnoreAlpha", (byte) 68);
		this.aClass114Array4[17] = this.aClass113_1.method8377("UnderwaterGround", (byte) -31);
		this.aClass114Array4[18] = this.aClass113_1.method8377("UnderwaterGroundSpecular", (byte) -21);
		@Pc(145) int local145;
		for (local145 = 0; local145 <= 4; local145++) {
			this.aClass114Array4[local145 + 2] = this.aClass113_1.method8377("Standard_" + local145 + "PointLights", (byte) 90);
			this.aClass114Array4[local145 + 7] = this.aClass113_1.method8377("Specular_" + local145 + "PointLights", (byte) -68);
			this.aClass114Array4[local145 + 12] = this.aClass113_1.method8377("EnvironmentalMapping_" + local145 + "PointLights", (byte) -15);
		}
		for (local145 = 0; local145 < 19; local145++) {
			@Pc(224) int local224 = this.aClass113_1.method8264(this.aClass114Array4[local145], 1747974392);
			this.anIntArrayArray17[local145][2] = local11.method23997(local224);
			this.anIntArrayArray17[local145][3] = local17.method23997(local224);
			this.anIntArrayArray17[local145][1] = local23.method23997(local224);
			this.anIntArrayArray17[local145][0] = local29.method23997(local224);
			this.anIntArrayArray17[local145][4] = local35.method23997(local224);
			this.anIntArrayArray17[local145][5] = local41.method23997(local224);
			this.anIntArrayArray17[local145][7] = local47.method23997(local224);
			this.anIntArrayArray17[local145][8] = local53.method23997(local224);
			this.anIntArrayArray17[local145][9] = local59.method23997(local224);
			this.anIntArrayArray17[local145][10] = local65.method23997(local224);
			this.anIntArrayArray17[local145][11] = local71.method23997(local224);
			this.anIntArrayArray17[local145][12] = local77.method23997(local224);
			this.anIntArrayArray17[local145][13] = local83.method23997(local224);
			this.anIntArrayArray17[local145][14] = local89.method23997(local224);
			this.anIntArrayArray17[local145][6] = local95.method23997(local224);
			this.anIntArrayArray17[local145][15] = local107.method23997(local224);
			this.anIntArrayArray17[local145][16] = local101.method23997(local224);
		}
		this.aClass113_1.method8295(this.aClass114Array4[2]);
		return true;
	}

	@OriginalMember(owner = "client!aha", name = "e", descriptor = "(Z)V")
	@Override
	public void method9410(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.aClass113_1.method8295(this.aClass114Array4[1]);
		} else {
			this.aClass113_1.method8295(this.aClass114Array4[0]);
		}
		this.anIntArray97 = this.anIntArrayArray17[this.aClass113_1.method8355((byte) 48)];
		this.aClass113_1.method8256();
		this.aClass113_1.method8300(this.anIntArray97[2], 0, this.anInterface34_8, 1402791203);
		this.aClass113_1.method8287(this.anIntArray97[4], this.aClass487_34, 225334539);
		this.aClass113_1.method8286(this.anIntArray97[5], this.aClass487_35, 704545068);
		this.aClass113_1.method8282(this.anIntArray97[7], this.aClass456_5.aFloat294, this.aClass456_5.aFloat292, this.aClass456_5.aFloat291, this.aClass456_5.aFloat293, -1583611537);
		this.aClass113_1.method8281(this.anIntArray97[8], this.aClass463_20.aFloat297, this.aClass463_20.aFloat295, this.aClass463_20.aFloat296, -738892563);
		this.aClass113_1.method8282(this.anIntArray97[9], this.aClass456_6.aFloat294, this.aClass456_6.aFloat292, this.aClass456_6.aFloat291, this.aClass456_6.aFloat293, -1583611537);
		this.aClass113_1.method8281(this.anIntArray97[10], this.aClass463_19.aFloat297, this.aClass463_19.aFloat295, this.aClass463_19.aFloat296, -738892563);
		this.aClass102_Sub1_8.method21373(Class415.aClass415_6, this.anInt1107, this.anInt1108, this.anInt1105, this.anInt1109);
	}

	@OriginalMember(owner = "client!aha", name = "i", descriptor = "()V")
	@Override
	public void method9394() {
		this.aClass113_1.method8295(this.aClass114Array4[17]);
		this.anIntArray97 = this.anIntArrayArray17[this.aClass113_1.method8355((byte) 2)];
		this.aClass113_1.method8256();
		this.method8892(0, (byte) -39);
	}

	@OriginalMember(owner = "client!aha", name = "f", descriptor = "(Lclient!pm;)V")
	@Override
	public void method9392(@OriginalArg(0) Class487 arg0) {
		this.aClass487_34.method30075(arg0);
		this.aClass487_34.method30078(this.aClass102_Sub1_8.aClass487_78);
	}

	@OriginalMember(owner = "client!aha", name = "aj", descriptor = "(IB)V")
	void method8892(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aClass113_1.method8300(this.anIntArray97[2], 0, this.anInterface34_8, 1402791203);
		this.aClass113_1.method8287(this.anIntArray97[4], this.aClass487_34, -939893022);
		this.aClass113_1.method8286(this.anIntArray97[5], this.aClass487_35, 704545068);
		this.aClass113_1.method8282(this.anIntArray97[7], this.aClass456_5.aFloat294, this.aClass456_5.aFloat292, this.aClass456_5.aFloat291, this.aClass456_5.aFloat293, -1583611537);
		this.aClass113_1.method8281(this.anIntArray97[8], this.aClass463_20.aFloat297, this.aClass463_20.aFloat295, this.aClass463_20.aFloat296, -738892563);
		this.aClass113_1.method8282(this.anIntArray97[9], this.aClass456_6.aFloat294, this.aClass456_6.aFloat292, this.aClass456_6.aFloat291, this.aClass456_6.aFloat293, -1583611537);
		this.aClass113_1.method8281(this.anIntArray97[10], this.aClass463_19.aFloat297, this.aClass463_19.aFloat295, this.aClass463_19.aFloat296, -738892563);
		this.aClass113_1.method8283(this.anIntArray97[11], this.aClass463_17, -1290192051);
		this.aClass113_1.method8283(this.anIntArray97[12], this.aClass463_22, -787745935);
		this.aClass113_1.method8283(this.anIntArray97[13], this.aClass463_16, 956930100);
		this.aClass113_1.method8283(this.anIntArray97[14], this.aClass463_21, -416596907);
		if (arg0 > 0) {
			this.aClass113_1.method8284(this.anIntArray97[1], this.aFloatArray38, arg0 * 4, (short) 200);
			this.aClass113_1.method8284(this.anIntArray97[0], this.aFloatArray37, arg0 * 4, (short) 200);
		}
		this.aClass102_Sub1_8.method21373(Class415.aClass415_6, this.anInt1107, this.anInt1108, this.anInt1105, this.anInt1109);
	}

	@OriginalMember(owner = "client!aha", name = "u", descriptor = "(I)V")
	@Override
	public void method9396(@OriginalArg(0) int arg0) {
		this.aClass113_1.method8295(this.aClass114Array4[arg0 + 2]);
		this.anIntArray97 = this.anIntArrayArray17[this.aClass113_1.method8355((byte) -2)];
		this.aClass113_1.method8256();
		this.method8892(arg0, (byte) -111);
	}

	@OriginalMember(owner = "client!aha", name = "l", descriptor = "(I)V")
	@Override
	public void method9404(@OriginalArg(0) int arg0) {
		this.aClass113_1.method8295(this.aClass114Array4[arg0 + 7]);
		this.anIntArray97 = this.anIntArrayArray17[this.aClass113_1.method8355((byte) 96)];
		this.aClass113_1.method8256();
		this.aClass113_1.method8281(this.anIntArray97[6], this.aClass463_18.aFloat297, this.aClass463_18.aFloat295, this.aClass463_18.aFloat296, -738892563);
		this.aClass113_1.method8282(this.anIntArray97[16], this.aFloat85, this.aFloat84, 0.0F, 0.0F, -1583611537);
		this.method8892(arg0, (byte) -17);
	}

	@OriginalMember(owner = "client!aha", name = "g", descriptor = "(I)V")
	@Override
	public void method9409(@OriginalArg(0) int arg0) {
		this.aClass113_1.method8295(this.aClass114Array4[arg0 + 12]);
		this.anIntArray97 = this.anIntArrayArray17[this.aClass113_1.method8355((byte) -11)];
		this.aClass113_1.method8256();
		this.aClass113_1.method8285(this.anIntArray97[15], this.aClass487_36, -1597991917);
		this.aClass113_1.method8281(this.anIntArray97[6], this.aClass463_18.aFloat297, this.aClass463_18.aFloat295, this.aClass463_18.aFloat296, -738892563);
		this.aClass113_1.method8300(this.anIntArray97[3], 1, this.anInterface42_3, 1402791203);
		this.method8892(arg0, (byte) -94);
	}

	@OriginalMember(owner = "client!aha", name = "b", descriptor = "(Lclient!pm;)V")
	@Override
	public void method9417(@OriginalArg(0) Class487 arg0) {
		this.aClass487_34.method30075(arg0);
		this.aClass487_34.method30078(this.aClass102_Sub1_8.aClass487_78);
	}

	@OriginalMember(owner = "client!aha", name = "m", descriptor = "()V")
	@Override
	public void method9399() {
		this.aClass113_1.method8295(this.aClass114Array4[18]);
		this.anIntArray97 = this.anIntArrayArray17[this.aClass113_1.method8355((byte) -3)];
		this.aClass113_1.method8256();
		this.aClass113_1.method8281(this.anIntArray97[6], this.aClass463_18.aFloat297, this.aClass463_18.aFloat295, this.aClass463_18.aFloat296, -738892563);
		this.aClass113_1.method8282(this.anIntArray97[16], this.aFloat85, this.aFloat84, 0.0F, 0.0F, -1583611537);
		this.method8892(0, (byte) -126);
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(I)V")
	@Override
	public void method9402(@OriginalArg(0) int arg0) {
		this.aClass113_1.method8295(this.aClass114Array4[arg0 + 2]);
		this.anIntArray97 = this.anIntArrayArray17[this.aClass113_1.method8355((byte) -35)];
		this.aClass113_1.method8256();
		this.method8892(arg0, (byte) -72);
	}

	@OriginalMember(owner = "client!aha", name = "j", descriptor = "(I)V")
	@Override
	public void method9401(@OriginalArg(0) int arg0) {
		this.aClass113_1.method8295(this.aClass114Array4[arg0 + 2]);
		this.anIntArray97 = this.anIntArrayArray17[this.aClass113_1.method8355((byte) -2)];
		this.aClass113_1.method8256();
		this.method8892(arg0, (byte) -65);
	}

	@OriginalMember(owner = "client!aha", name = "k", descriptor = "(I)V")
	@Override
	public void method9406(@OriginalArg(0) int arg0) {
		this.aClass113_1.method8295(this.aClass114Array4[arg0 + 7]);
		this.anIntArray97 = this.anIntArrayArray17[this.aClass113_1.method8355((byte) -96)];
		this.aClass113_1.method8256();
		this.aClass113_1.method8281(this.anIntArray97[6], this.aClass463_18.aFloat297, this.aClass463_18.aFloat295, this.aClass463_18.aFloat296, -738892563);
		this.aClass113_1.method8282(this.anIntArray97[16], this.aFloat85, this.aFloat84, 0.0F, 0.0F, -1583611537);
		this.method8892(arg0, (byte) -123);
	}

	@OriginalMember(owner = "client!aha", name = "aq", descriptor = "(Lclient!pm;)V")
	@Override
	public void method9405(@OriginalArg(0) Class487 arg0) {
		this.aClass487_34.method30075(arg0);
		this.aClass487_34.method30078(this.aClass102_Sub1_8.aClass487_78);
	}

	@OriginalMember(owner = "client!aha", name = "w", descriptor = "(I)V")
	@Override
	public void method9421(@OriginalArg(0) int arg0) {
		this.aClass113_1.method8295(this.aClass114Array4[arg0 + 7]);
		this.anIntArray97 = this.anIntArrayArray17[this.aClass113_1.method8355((byte) 10)];
		this.aClass113_1.method8256();
		this.aClass113_1.method8281(this.anIntArray97[6], this.aClass463_18.aFloat297, this.aClass463_18.aFloat295, this.aClass463_18.aFloat296, -738892563);
		this.aClass113_1.method8282(this.anIntArray97[16], this.aFloat85, this.aFloat84, 0.0F, 0.0F, -1583611537);
		this.method8892(arg0, (byte) -11);
	}

	@OriginalMember(owner = "client!aha", name = "r", descriptor = "(I)V")
	@Override
	public void method9407(@OriginalArg(0) int arg0) {
		this.aClass113_1.method8295(this.aClass114Array4[arg0 + 12]);
		this.anIntArray97 = this.anIntArrayArray17[this.aClass113_1.method8355((byte) -12)];
		this.aClass113_1.method8256();
		this.aClass113_1.method8285(this.anIntArray97[15], this.aClass487_36, -1747678722);
		this.aClass113_1.method8281(this.anIntArray97[6], this.aClass463_18.aFloat297, this.aClass463_18.aFloat295, this.aClass463_18.aFloat296, -738892563);
		this.aClass113_1.method8300(this.anIntArray97[3], 1, this.anInterface42_3, 1402791203);
		this.method8892(arg0, (byte) -114);
	}

	@OriginalMember(owner = "client!aha", name = "q", descriptor = "(I)V")
	@Override
	public void method9408(@OriginalArg(0) int arg0) {
		this.aClass113_1.method8295(this.aClass114Array4[arg0 + 12]);
		this.anIntArray97 = this.anIntArrayArray17[this.aClass113_1.method8355((byte) -15)];
		this.aClass113_1.method8256();
		this.aClass113_1.method8285(this.anIntArray97[15], this.aClass487_36, -1598069227);
		this.aClass113_1.method8281(this.anIntArray97[6], this.aClass463_18.aFloat297, this.aClass463_18.aFloat295, this.aClass463_18.aFloat296, -738892563);
		this.aClass113_1.method8300(this.anIntArray97[3], 1, this.anInterface42_3, 1402791203);
		this.method8892(arg0, (byte) -122);
	}

	@OriginalMember(owner = "client!aha", name = "h", descriptor = "(I)V")
	@Override
	public void method9397(@OriginalArg(0) int arg0) {
		this.aClass113_1.method8295(this.aClass114Array4[arg0 + 12]);
		this.anIntArray97 = this.anIntArrayArray17[this.aClass113_1.method8355((byte) -38)];
		this.aClass113_1.method8256();
		this.aClass113_1.method8285(this.anIntArray97[15], this.aClass487_36, -1126067213);
		this.aClass113_1.method8281(this.anIntArray97[6], this.aClass463_18.aFloat297, this.aClass463_18.aFloat295, this.aClass463_18.aFloat296, -738892563);
		this.aClass113_1.method8300(this.anIntArray97[3], 1, this.anInterface42_3, 1402791203);
		this.method8892(arg0, (byte) -14);
	}

	@OriginalMember(owner = "client!aha", name = "d", descriptor = "()V")
	@Override
	public void method9415() {
		this.aClass113_1.method8295(this.aClass114Array4[17]);
		this.anIntArray97 = this.anIntArrayArray17[this.aClass113_1.method8355((byte) -35)];
		this.aClass113_1.method8256();
		this.method8892(0, (byte) -22);
	}

	@OriginalMember(owner = "client!aha", name = "z", descriptor = "()V")
	@Override
	public void method9411() {
		this.aClass113_1.method8295(this.aClass114Array4[17]);
		this.anIntArray97 = this.anIntArrayArray17[this.aClass113_1.method8355((byte) -126)];
		this.aClass113_1.method8256();
		this.method8892(0, (byte) -60);
	}

	@OriginalMember(owner = "client!aha", name = "p", descriptor = "()V")
	@Override
	public void method9412() {
		this.aClass113_1.method8295(this.aClass114Array4[18]);
		this.anIntArray97 = this.anIntArrayArray17[this.aClass113_1.method8355((byte) -97)];
		this.aClass113_1.method8256();
		this.aClass113_1.method8281(this.anIntArray97[6], this.aClass463_18.aFloat297, this.aClass463_18.aFloat295, this.aClass463_18.aFloat296, -738892563);
		this.aClass113_1.method8282(this.anIntArray97[16], this.aFloat85, this.aFloat84, 0.0F, 0.0F, -1583611537);
		this.method8892(0, (byte) -34);
	}

	@OriginalMember(owner = "client!aha", name = "v", descriptor = "()V")
	@Override
	public void method9413() {
		this.aClass113_1.method8295(this.aClass114Array4[18]);
		this.anIntArray97 = this.anIntArrayArray17[this.aClass113_1.method8355((byte) -73)];
		this.aClass113_1.method8256();
		this.aClass113_1.method8281(this.anIntArray97[6], this.aClass463_18.aFloat297, this.aClass463_18.aFloat295, this.aClass463_18.aFloat296, -738892563);
		this.aClass113_1.method8282(this.anIntArray97[16], this.aFloat85, this.aFloat84, 0.0F, 0.0F, -1583611537);
		this.method8892(0, (byte) -46);
	}

	@OriginalMember(owner = "client!aha", name = "y", descriptor = "()V")
	@Override
	public void method9414() {
		this.aClass113_1.method8295(this.aClass114Array4[18]);
		this.anIntArray97 = this.anIntArrayArray17[this.aClass113_1.method8355((byte) 21)];
		this.aClass113_1.method8256();
		this.aClass113_1.method8281(this.anIntArray97[6], this.aClass463_18.aFloat297, this.aClass463_18.aFloat295, this.aClass463_18.aFloat296, -738892563);
		this.aClass113_1.method8282(this.anIntArray97[16], this.aFloat85, this.aFloat84, 0.0F, 0.0F, -1583611537);
		this.method8892(0, (byte) -85);
	}

	@OriginalMember(owner = "client!aha", name = "s", descriptor = "(I)V")
	@Override
	public void method9403(@OriginalArg(0) int arg0) {
		this.aClass113_1.method8295(this.aClass114Array4[arg0 + 2]);
		this.anIntArray97 = this.anIntArrayArray17[this.aClass113_1.method8355((byte) -66)];
		this.aClass113_1.method8256();
		this.method8892(arg0, (byte) -76);
	}

	@OriginalMember(owner = "client!aha", name = "ax", descriptor = "(Lclient!pm;)V")
	@Override
	public void method9418(@OriginalArg(0) Class487 arg0) {
		this.aClass487_34.method30075(arg0);
		this.aClass487_34.method30078(this.aClass102_Sub1_8.aClass487_78);
	}

	@OriginalMember(owner = "client!aha", name = "am", descriptor = "(I)V")
	void method8893(@OriginalArg(0) int arg0) {
		this.aClass113_1.method8300(this.anIntArray97[2], 0, this.anInterface34_8, 1402791203);
		this.aClass113_1.method8287(this.anIntArray97[4], this.aClass487_34, -833427020);
		this.aClass113_1.method8286(this.anIntArray97[5], this.aClass487_35, 704545068);
		this.aClass113_1.method8282(this.anIntArray97[7], this.aClass456_5.aFloat294, this.aClass456_5.aFloat292, this.aClass456_5.aFloat291, this.aClass456_5.aFloat293, -1583611537);
		this.aClass113_1.method8281(this.anIntArray97[8], this.aClass463_20.aFloat297, this.aClass463_20.aFloat295, this.aClass463_20.aFloat296, -738892563);
		this.aClass113_1.method8282(this.anIntArray97[9], this.aClass456_6.aFloat294, this.aClass456_6.aFloat292, this.aClass456_6.aFloat291, this.aClass456_6.aFloat293, -1583611537);
		this.aClass113_1.method8281(this.anIntArray97[10], this.aClass463_19.aFloat297, this.aClass463_19.aFloat295, this.aClass463_19.aFloat296, -738892563);
		this.aClass113_1.method8283(this.anIntArray97[11], this.aClass463_17, -2066451676);
		this.aClass113_1.method8283(this.anIntArray97[12], this.aClass463_22, -1464628868);
		this.aClass113_1.method8283(this.anIntArray97[13], this.aClass463_16, 1076998466);
		this.aClass113_1.method8283(this.anIntArray97[14], this.aClass463_21, -688156772);
		if (arg0 > 0) {
			this.aClass113_1.method8284(this.anIntArray97[1], this.aFloatArray38, arg0 * 4, (short) 200);
			this.aClass113_1.method8284(this.anIntArray97[0], this.aFloatArray37, arg0 * 4, (short) 200);
		}
		this.aClass102_Sub1_8.method21373(Class415.aClass415_6, this.anInt1107, this.anInt1108, this.anInt1105, this.anInt1109);
	}

	@OriginalMember(owner = "client!aha", name = "n", descriptor = "()V")
	@Override
	public void method9395() {
		this.aClass113_1.method8295(this.aClass114Array4[18]);
		this.anIntArray97 = this.anIntArrayArray17[this.aClass113_1.method8355((byte) -50)];
		this.aClass113_1.method8256();
		this.aClass113_1.method8281(this.anIntArray97[6], this.aClass463_18.aFloat297, this.aClass463_18.aFloat295, this.aClass463_18.aFloat296, -738892563);
		this.aClass113_1.method8282(this.anIntArray97[16], this.aFloat85, this.aFloat84, 0.0F, 0.0F, -1583611537);
		this.method8892(0, (byte) -33);
	}

	@OriginalMember(owner = "client!aha", name = "ai", descriptor = "(Lclient!pm;)V")
	@Override
	public void method9420(@OriginalArg(0) Class487 arg0) {
		this.aClass487_34.method30075(arg0);
		this.aClass487_34.method30078(this.aClass102_Sub1_8.aClass487_78);
	}

	@OriginalMember(owner = "client!aha", name = "ay", descriptor = "(Lclient!pm;)V")
	@Override
	public void method9419(@OriginalArg(0) Class487 arg0) {
		this.aClass487_34.method30075(arg0);
		this.aClass487_34.method30078(this.aClass102_Sub1_8.aClass487_78);
	}

	@OriginalMember(owner = "client!aha", name = "ag", descriptor = "()Z")
	boolean method8894() throws Exception_Sub5 {
		this.aClass113_1 = this.aClass102_Sub1_8.method21142("Model");
		@Pc(11) Class80_Sub13_Sub1 local11 = this.aClass113_1.method8302("DiffuseSampler", 1976470136);
		@Pc(17) Class80_Sub13_Sub1 local17 = this.aClass113_1.method8302("EnvironmentSampler", 1995143858);
		@Pc(23) Class80_Sub13_Sub1 local23 = this.aClass113_1.method8302("PointLightsPosAndRadiusInv", 1989509881);
		@Pc(29) Class80_Sub13_Sub1 local29 = this.aClass113_1.method8302("PointLightsDiffuseColour", 2044147996);
		@Pc(35) Class80_Sub13_Sub1 local35 = this.aClass113_1.method8302("WVPMatrix", 1970150160);
		@Pc(41) Class80_Sub13_Sub1 local41 = this.aClass113_1.method8302("TexCoordMatrix", 2104624513);
		@Pc(47) Class80_Sub13_Sub1 local47 = this.aClass113_1.method8302("HeightFogPlane", 2101507345);
		@Pc(53) Class80_Sub13_Sub1 local53 = this.aClass113_1.method8302("HeightFogColour", 2103383432);
		@Pc(59) Class80_Sub13_Sub1 local59 = this.aClass113_1.method8302("DistanceFogPlane", 2012487459);
		@Pc(65) Class80_Sub13_Sub1 local65 = this.aClass113_1.method8302("DistanceFogColour", 2139203776);
		@Pc(71) Class80_Sub13_Sub1 local71 = this.aClass113_1.method8302("SunDir", 2003771715);
		@Pc(77) Class80_Sub13_Sub1 local77 = this.aClass113_1.method8302("SunColour", 2106217177);
		@Pc(83) Class80_Sub13_Sub1 local83 = this.aClass113_1.method8302("AntiSunColour", 1993681861);
		@Pc(89) Class80_Sub13_Sub1 local89 = this.aClass113_1.method8302("AmbientColour", 2041054890);
		@Pc(95) Class80_Sub13_Sub1 local95 = this.aClass113_1.method8302("EyePos", 2134617494);
		@Pc(101) Class80_Sub13_Sub1 local101 = this.aClass113_1.method8302("SpecularExponent", 2067660470);
		@Pc(107) Class80_Sub13_Sub1 local107 = this.aClass113_1.method8302("WorldMatrix", 2141390420);
		this.aClass114Array4[0] = this.aClass113_1.method8377("Unlit", (byte) 43);
		this.aClass114Array4[1] = this.aClass113_1.method8377("Unlit_IgnoreAlpha", (byte) -48);
		this.aClass114Array4[17] = this.aClass113_1.method8377("UnderwaterGround", (byte) -86);
		this.aClass114Array4[18] = this.aClass113_1.method8377("UnderwaterGroundSpecular", (byte) 30);
		@Pc(145) int local145;
		for (local145 = 0; local145 <= 4; local145++) {
			this.aClass114Array4[local145 + 2] = this.aClass113_1.method8377("Standard_" + local145 + "PointLights", (byte) -94);
			this.aClass114Array4[local145 + 7] = this.aClass113_1.method8377("Specular_" + local145 + "PointLights", (byte) 16);
			this.aClass114Array4[local145 + 12] = this.aClass113_1.method8377("EnvironmentalMapping_" + local145 + "PointLights", (byte) -33);
		}
		for (local145 = 0; local145 < 19; local145++) {
			@Pc(224) int local224 = this.aClass113_1.method8264(this.aClass114Array4[local145], 2001055112);
			this.anIntArrayArray17[local145][2] = local11.method23997(local224);
			this.anIntArrayArray17[local145][3] = local17.method23997(local224);
			this.anIntArrayArray17[local145][1] = local23.method23997(local224);
			this.anIntArrayArray17[local145][0] = local29.method23997(local224);
			this.anIntArrayArray17[local145][4] = local35.method23997(local224);
			this.anIntArrayArray17[local145][5] = local41.method23997(local224);
			this.anIntArrayArray17[local145][7] = local47.method23997(local224);
			this.anIntArrayArray17[local145][8] = local53.method23997(local224);
			this.anIntArrayArray17[local145][9] = local59.method23997(local224);
			this.anIntArrayArray17[local145][10] = local65.method23997(local224);
			this.anIntArrayArray17[local145][11] = local71.method23997(local224);
			this.anIntArrayArray17[local145][12] = local77.method23997(local224);
			this.anIntArrayArray17[local145][13] = local83.method23997(local224);
			this.anIntArrayArray17[local145][14] = local89.method23997(local224);
			this.anIntArrayArray17[local145][6] = local95.method23997(local224);
			this.anIntArrayArray17[local145][15] = local107.method23997(local224);
			this.anIntArrayArray17[local145][16] = local101.method23997(local224);
		}
		this.aClass113_1.method8295(this.aClass114Array4[2]);
		return true;
	}

	@OriginalMember(owner = "client!aha", name = "ab", descriptor = "()Z")
	boolean method8895() throws Exception_Sub5 {
		this.aClass113_1 = this.aClass102_Sub1_8.method21142("Model");
		@Pc(11) Class80_Sub13_Sub1 local11 = this.aClass113_1.method8302("DiffuseSampler", 2131701468);
		@Pc(17) Class80_Sub13_Sub1 local17 = this.aClass113_1.method8302("EnvironmentSampler", 2082735200);
		@Pc(23) Class80_Sub13_Sub1 local23 = this.aClass113_1.method8302("PointLightsPosAndRadiusInv", 2068040155);
		@Pc(29) Class80_Sub13_Sub1 local29 = this.aClass113_1.method8302("PointLightsDiffuseColour", 2144755548);
		@Pc(35) Class80_Sub13_Sub1 local35 = this.aClass113_1.method8302("WVPMatrix", 1967923477);
		@Pc(41) Class80_Sub13_Sub1 local41 = this.aClass113_1.method8302("TexCoordMatrix", 2009386382);
		@Pc(47) Class80_Sub13_Sub1 local47 = this.aClass113_1.method8302("HeightFogPlane", 2114937906);
		@Pc(53) Class80_Sub13_Sub1 local53 = this.aClass113_1.method8302("HeightFogColour", 2014181482);
		@Pc(59) Class80_Sub13_Sub1 local59 = this.aClass113_1.method8302("DistanceFogPlane", 2147383062);
		@Pc(65) Class80_Sub13_Sub1 local65 = this.aClass113_1.method8302("DistanceFogColour", 2096655507);
		@Pc(71) Class80_Sub13_Sub1 local71 = this.aClass113_1.method8302("SunDir", 2027622032);
		@Pc(77) Class80_Sub13_Sub1 local77 = this.aClass113_1.method8302("SunColour", 2023766953);
		@Pc(83) Class80_Sub13_Sub1 local83 = this.aClass113_1.method8302("AntiSunColour", 2130270735);
		@Pc(89) Class80_Sub13_Sub1 local89 = this.aClass113_1.method8302("AmbientColour", 2002109068);
		@Pc(95) Class80_Sub13_Sub1 local95 = this.aClass113_1.method8302("EyePos", 2125178357);
		@Pc(101) Class80_Sub13_Sub1 local101 = this.aClass113_1.method8302("SpecularExponent", 1946223646);
		@Pc(107) Class80_Sub13_Sub1 local107 = this.aClass113_1.method8302("WorldMatrix", 1940777783);
		this.aClass114Array4[0] = this.aClass113_1.method8377("Unlit", (byte) -11);
		this.aClass114Array4[1] = this.aClass113_1.method8377("Unlit_IgnoreAlpha", (byte) 70);
		this.aClass114Array4[17] = this.aClass113_1.method8377("UnderwaterGround", (byte) 30);
		this.aClass114Array4[18] = this.aClass113_1.method8377("UnderwaterGroundSpecular", (byte) -75);
		@Pc(145) int local145;
		for (local145 = 0; local145 <= 4; local145++) {
			this.aClass114Array4[local145 + 2] = this.aClass113_1.method8377("Standard_" + local145 + "PointLights", (byte) -32);
			this.aClass114Array4[local145 + 7] = this.aClass113_1.method8377("Specular_" + local145 + "PointLights", (byte) -69);
			this.aClass114Array4[local145 + 12] = this.aClass113_1.method8377("EnvironmentalMapping_" + local145 + "PointLights", (byte) -67);
		}
		for (local145 = 0; local145 < 19; local145++) {
			@Pc(224) int local224 = this.aClass113_1.method8264(this.aClass114Array4[local145], 1807296213);
			this.anIntArrayArray17[local145][2] = local11.method23997(local224);
			this.anIntArrayArray17[local145][3] = local17.method23997(local224);
			this.anIntArrayArray17[local145][1] = local23.method23997(local224);
			this.anIntArrayArray17[local145][0] = local29.method23997(local224);
			this.anIntArrayArray17[local145][4] = local35.method23997(local224);
			this.anIntArrayArray17[local145][5] = local41.method23997(local224);
			this.anIntArrayArray17[local145][7] = local47.method23997(local224);
			this.anIntArrayArray17[local145][8] = local53.method23997(local224);
			this.anIntArrayArray17[local145][9] = local59.method23997(local224);
			this.anIntArrayArray17[local145][10] = local65.method23997(local224);
			this.anIntArrayArray17[local145][11] = local71.method23997(local224);
			this.anIntArrayArray17[local145][12] = local77.method23997(local224);
			this.anIntArrayArray17[local145][13] = local83.method23997(local224);
			this.anIntArrayArray17[local145][14] = local89.method23997(local224);
			this.anIntArrayArray17[local145][6] = local95.method23997(local224);
			this.anIntArrayArray17[local145][15] = local107.method23997(local224);
			this.anIntArrayArray17[local145][16] = local101.method23997(local224);
		}
		this.aClass113_1.method8295(this.aClass114Array4[2]);
		return true;
	}

	@OriginalMember(owner = "client!aha", name = "al", descriptor = "(I)V")
	void method8896(@OriginalArg(0) int arg0) {
		this.aClass113_1.method8300(this.anIntArray97[2], 0, this.anInterface34_8, 1402791203);
		this.aClass113_1.method8287(this.anIntArray97[4], this.aClass487_34, -1373098966);
		this.aClass113_1.method8286(this.anIntArray97[5], this.aClass487_35, 704545068);
		this.aClass113_1.method8282(this.anIntArray97[7], this.aClass456_5.aFloat294, this.aClass456_5.aFloat292, this.aClass456_5.aFloat291, this.aClass456_5.aFloat293, -1583611537);
		this.aClass113_1.method8281(this.anIntArray97[8], this.aClass463_20.aFloat297, this.aClass463_20.aFloat295, this.aClass463_20.aFloat296, -738892563);
		this.aClass113_1.method8282(this.anIntArray97[9], this.aClass456_6.aFloat294, this.aClass456_6.aFloat292, this.aClass456_6.aFloat291, this.aClass456_6.aFloat293, -1583611537);
		this.aClass113_1.method8281(this.anIntArray97[10], this.aClass463_19.aFloat297, this.aClass463_19.aFloat295, this.aClass463_19.aFloat296, -738892563);
		this.aClass113_1.method8283(this.anIntArray97[11], this.aClass463_17, -1822461213);
		this.aClass113_1.method8283(this.anIntArray97[12], this.aClass463_22, -1163307252);
		this.aClass113_1.method8283(this.anIntArray97[13], this.aClass463_16, -1279828888);
		this.aClass113_1.method8283(this.anIntArray97[14], this.aClass463_21, 486752959);
		if (arg0 > 0) {
			this.aClass113_1.method8284(this.anIntArray97[1], this.aFloatArray38, arg0 * 4, (short) 200);
			this.aClass113_1.method8284(this.anIntArray97[0], this.aFloatArray37, arg0 * 4, (short) 200);
		}
		this.aClass102_Sub1_8.method21373(Class415.aClass415_6, this.anInt1107, this.anInt1108, this.anInt1105, this.anInt1109);
	}

	@OriginalMember(owner = "client!aha", name = "o", descriptor = "(Z)V")
	@Override
	public void method9400(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.aClass113_1.method8295(this.aClass114Array4[1]);
		} else {
			this.aClass113_1.method8295(this.aClass114Array4[0]);
		}
		this.anIntArray97 = this.anIntArrayArray17[this.aClass113_1.method8355((byte) 111)];
		this.aClass113_1.method8256();
		this.aClass113_1.method8300(this.anIntArray97[2], 0, this.anInterface34_8, 1402791203);
		this.aClass113_1.method8287(this.anIntArray97[4], this.aClass487_34, -668964530);
		this.aClass113_1.method8286(this.anIntArray97[5], this.aClass487_35, 704545068);
		this.aClass113_1.method8282(this.anIntArray97[7], this.aClass456_5.aFloat294, this.aClass456_5.aFloat292, this.aClass456_5.aFloat291, this.aClass456_5.aFloat293, -1583611537);
		this.aClass113_1.method8281(this.anIntArray97[8], this.aClass463_20.aFloat297, this.aClass463_20.aFloat295, this.aClass463_20.aFloat296, -738892563);
		this.aClass113_1.method8282(this.anIntArray97[9], this.aClass456_6.aFloat294, this.aClass456_6.aFloat292, this.aClass456_6.aFloat291, this.aClass456_6.aFloat293, -1583611537);
		this.aClass113_1.method8281(this.anIntArray97[10], this.aClass463_19.aFloat297, this.aClass463_19.aFloat295, this.aClass463_19.aFloat296, -738892563);
		this.aClass102_Sub1_8.method21373(Class415.aClass415_6, this.anInt1107, this.anInt1108, this.anInt1105, this.anInt1109);
	}

	@OriginalMember(owner = "client!aha", name = "af", descriptor = "(I)V")
	void method8897(@OriginalArg(0) int arg0) {
		this.aClass113_1.method8300(this.anIntArray97[2], 0, this.anInterface34_8, 1402791203);
		this.aClass113_1.method8287(this.anIntArray97[4], this.aClass487_34, -42826183);
		this.aClass113_1.method8286(this.anIntArray97[5], this.aClass487_35, 704545068);
		this.aClass113_1.method8282(this.anIntArray97[7], this.aClass456_5.aFloat294, this.aClass456_5.aFloat292, this.aClass456_5.aFloat291, this.aClass456_5.aFloat293, -1583611537);
		this.aClass113_1.method8281(this.anIntArray97[8], this.aClass463_20.aFloat297, this.aClass463_20.aFloat295, this.aClass463_20.aFloat296, -738892563);
		this.aClass113_1.method8282(this.anIntArray97[9], this.aClass456_6.aFloat294, this.aClass456_6.aFloat292, this.aClass456_6.aFloat291, this.aClass456_6.aFloat293, -1583611537);
		this.aClass113_1.method8281(this.anIntArray97[10], this.aClass463_19.aFloat297, this.aClass463_19.aFloat295, this.aClass463_19.aFloat296, -738892563);
		this.aClass113_1.method8283(this.anIntArray97[11], this.aClass463_17, -1716467358);
		this.aClass113_1.method8283(this.anIntArray97[12], this.aClass463_22, 408908075);
		this.aClass113_1.method8283(this.anIntArray97[13], this.aClass463_16, 711146927);
		this.aClass113_1.method8283(this.anIntArray97[14], this.aClass463_21, -180145675);
		if (arg0 > 0) {
			this.aClass113_1.method8284(this.anIntArray97[1], this.aFloatArray38, arg0 * 4, (short) 200);
			this.aClass113_1.method8284(this.anIntArray97[0], this.aFloatArray37, arg0 * 4, (short) 200);
		}
		this.aClass102_Sub1_8.method21373(Class415.aClass415_6, this.anInt1107, this.anInt1108, this.anInt1105, this.anInt1109);
	}

	@OriginalMember(owner = "client!aha", name = "x", descriptor = "(I)V")
	@Override
	public void method9398(@OriginalArg(0) int arg0) {
		this.aClass113_1.method8295(this.aClass114Array4[arg0 + 7]);
		this.anIntArray97 = this.anIntArrayArray17[this.aClass113_1.method8355((byte) -80)];
		this.aClass113_1.method8256();
		this.aClass113_1.method8281(this.anIntArray97[6], this.aClass463_18.aFloat297, this.aClass463_18.aFloat295, this.aClass463_18.aFloat296, -738892563);
		this.aClass113_1.method8282(this.anIntArray97[16], this.aFloat85, this.aFloat84, 0.0F, 0.0F, -1583611537);
		this.method8892(arg0, (byte) -107);
	}
}
