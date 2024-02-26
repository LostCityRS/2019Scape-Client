package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

@OriginalClass("client!rw")
public final class Class539 {

	@OriginalMember(owner = "client!rw", name = "ab", descriptor = "[[B")
	byte[][] aByteArrayArray17;

	@OriginalMember(owner = "client!rw", name = "f", descriptor = "Lclient!rr;")
	Class536 aClass536_9;

	@OriginalMember(owner = "client!rw", name = "u", descriptor = "Lclient!iq;")
	Class345 aClass345_7;

	@OriginalMember(owner = "client!rw", name = "c", descriptor = "[[[B")
	byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!rw", name = "q", descriptor = "I")
	int anInt5087;

	@OriginalMember(owner = "client!rw", name = "g", descriptor = "Lclient!aiz;")
	Class144_Sub1 aClass144_Sub1_1;

	@OriginalMember(owner = "client!rw", name = "o", descriptor = "I")
	int anInt5088;

	@OriginalMember(owner = "client!rw", name = "l", descriptor = "Lclient!aiz;")
	Class144_Sub1 aClass144_Sub1_2;

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "I")
	int anInt5089;

	@OriginalMember(owner = "client!rw", name = "y", descriptor = "[[I")
	int[][] anIntArrayArray60;

	@OriginalMember(owner = "client!rw", name = "x", descriptor = "Lclient!xm;")
	Class665 aClass665_2;

	@OriginalMember(owner = "client!rw", name = "w", descriptor = "Lclient!qc;")
	Class502 aClass502_3;

	@OriginalMember(owner = "client!rw", name = "r", descriptor = "I")
	int anInt5091;

	@OriginalMember(owner = "client!rw", name = "al", descriptor = "[[B")
	byte[][] aByteArrayArray18;

	@OriginalMember(owner = "client!rw", name = "h", descriptor = "Lclient!asb;")
	Class80_Sub1_Sub12 aClass80_Sub1_Sub12_4;

	@OriginalMember(owner = "client!rw", name = "d", descriptor = "Lclient!ty;")
	Class587 aClass587_3;

	@OriginalMember(owner = "client!rw", name = "p", descriptor = "F")
	float aFloat327;

	@OriginalMember(owner = "client!rw", name = "v", descriptor = "Lclient!aod;")
	Class41_Sub3 aClass41_Sub3_9;

	@OriginalMember(owner = "client!rw", name = "ag", descriptor = "[I")
	int[] anIntArray468;

	@OriginalMember(owner = "client!rw", name = "s", descriptor = "I")
	int anInt5092;

	@OriginalMember(owner = "client!rw", name = "n", descriptor = "[[I")
	int[][] anIntArrayArray61;

	@OriginalMember(owner = "client!rw", name = "b", descriptor = "Lclient!ri;")
	Class530 aClass530_5;

	@OriginalMember(owner = "client!rw", name = "j", descriptor = "I")
	int anInt5095;

	@OriginalMember(owner = "client!rw", name = "ao", descriptor = "I")
	int anInt5097;

	@OriginalMember(owner = "client!rw", name = "ac", descriptor = "[I")
	int[] anIntArray469;

	@OriginalMember(owner = "client!rw", name = "k", descriptor = "Lclient!te;")
	Class570 aClass570_24;

	@OriginalMember(owner = "client!rw", name = "e", descriptor = "Lclient!rr;")
	Class536 aClass536_10;

	@OriginalMember(owner = "client!rw", name = "ah", descriptor = "[[B")
	byte[][] aByteArrayArray19;

	@OriginalMember(owner = "client!rw", name = "af", descriptor = "[[B")
	byte[][] aByteArrayArray20;

	@OriginalMember(owner = "client!rw", name = "am", descriptor = "[[B")
	byte[][] aByteArrayArray21;

	@OriginalMember(owner = "client!rw", name = "ak", descriptor = "[[[I")
	int[][][] anIntArrayArrayArray16;

	@OriginalMember(owner = "client!rw", name = "ad", descriptor = "J")
	public long aLong392;

	@OriginalMember(owner = "client!rw", name = "aa", descriptor = "I")
	public int anInt5099;

	@OriginalMember(owner = "client!rw", name = "i", descriptor = "Lclient!vw;")
	Class626 aClass626_2 = new Class626();

	@OriginalMember(owner = "client!rw", name = "m", descriptor = "Lclient!vw;")
	Class626 aClass626_1 = new Class626();

	@OriginalMember(owner = "client!rw", name = "z", descriptor = "Lclient!rp;")
	Class535 aClass535_1 = new Class535(0, 0, 0, 0);

	@OriginalMember(owner = "client!rw", name = "ax", descriptor = "I")
	int anInt5093 = 0;

	@OriginalMember(owner = "client!rw", name = "ay", descriptor = "I")
	int anInt5094 = 1923645329;

	@OriginalMember(owner = "client!rw", name = "ai", descriptor = "I")
	int anInt5098 = 0;

	@OriginalMember(owner = "client!rw", name = "aq", descriptor = "I")
	int anInt5096 = 282985749;

	@OriginalMember(owner = "client!rw", name = "aj", descriptor = "I")
	int anInt5090 = 0;

	@OriginalMember(owner = "client!rw", name = "at", descriptor = "Z")
	public boolean aBoolean894 = false;

	@OriginalMember(owner = "client!rw", name = "av", descriptor = "J")
	public long aLong393 = -1390528405935974947L;

	@OriginalMember(owner = "client!rw", name = "an", descriptor = "Ljava/util/HashMap;")
	HashMap aHashMap10 = new HashMap();

	@OriginalMember(owner = "client!rw", name = "t", descriptor = "Z")
	boolean aBoolean893;

	@OriginalMember(owner = "client!rw", name = "hs", descriptor = "(Lclient!yp;I)V")
	static void method31035(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class519.method30606(local11, local14, arg0, Class322.aClass322_1, 1609021967);
	}

	@OriginalMember(owner = "client!rw", name = "de", descriptor = "(Lclient!yp;I)V")
	static void method31036(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class103_Sub8.method7863(local11, local14, arg0, 1683103832);
	}

	@OriginalMember(owner = "client!rw", name = "hl", descriptor = "(Lclient!ahb;ZB)V")
	static void method31037(@OriginalArg(0) Class120_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte arg2) {
		@Pc(2) int local2 = Class712.aClass712_4.aByte165;
		@Pc(4) int local4 = 0;
		if (arg0.anInt2688 * -1881785185 > client.anInt3436) {
			Class63.method1219(arg0, (byte) 3);
		} else if (arg0.anInt2689 * 1790159189 >= client.anInt3436) {
			Class475.method29885(arg0, 715719102);
		} else {
			Class250.method26357(arg0, arg1, -1950121435);
			local2 = Class90.anInt323 * 635489291;
			local4 = Class143_Sub1.anInt1297 * 661912489;
		}
		@Pc(40) Class463 local40 = arg0.method24552().aClass463_61;
		@Pc(79) int local79;
		if ((int) local40.aFloat297 < 512 || (int) local40.aFloat296 < 512 || (int) local40.aFloat297 >= (client.aClass539_1.method30921(1922862993) - 1) * 512 || (int) local40.aFloat296 >= (client.aClass539_1.method31011(154459731) - 1) * 512) {
			arg0.aClass6_3.method23587(-1, -2060415981);
			for (local79 = 0; local79 < arg0.aClass561Array3.length; local79++) {
				arg0.aClass561Array3[local79].anInt5188 = -1389203317;
				arg0.aClass561Array3[local79].aClass6_9.method23587(-1, -2060415981);
			}
			arg0.anIntArray240 = null;
			arg0.anInt2688 = 0;
			arg0.anInt2689 = 0;
			local2 = Class712.aClass712_4.aByte165;
			local4 = 0;
			arg0.method24531((float) (arg0.anIntArray234[0] * 512 + arg0.method18966((byte) -51) * 256), local40.aFloat295, (float) (arg0.anIntArray242[0] * 512 + arg0.method18966((byte) -46) * 256));
			arg0.method18961((byte) 13);
		}
		if (Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3 == arg0 && ((int) local40.aFloat297 < 6144 || (int) local40.aFloat296 < 6144 || (int) local40.aFloat297 >= (client.aClass539_1.method30921(1877423326) - 12) * 512 || (int) local40.aFloat296 >= (client.aClass539_1.method31011(836747745) - 12) * 512)) {
			arg0.aClass6_3.method23587(-1, -2060415981);
			for (local79 = 0; local79 < arg0.aClass561Array3.length; local79++) {
				arg0.aClass561Array3[local79].anInt5188 = -1389203317;
				arg0.aClass561Array3[local79].aClass6_9.method23587(-1, -2060415981);
			}
			arg0.anIntArray240 = null;
			arg0.anInt2688 = 0;
			arg0.anInt2689 = 0;
			local2 = Class712.aClass712_4.aByte165;
			local4 = 0;
			arg0.method24531((float) (arg0.anIntArray234[0] * 512 + arg0.method18966((byte) -69) * 256), local40.aFloat295, (float) (arg0.anIntArray242[0] * 512 + arg0.method18966((byte) -29) * 256));
			arg0.method18961((byte) 13);
		}
		local79 = Class194.method24853(arg0, -1744039514);
		Class81.method1552(arg0, (short) -1898);
		Class562.method31444(arg0, local2, local4, local79, -1742559063);
		Class161.method15650(arg0, local2, (byte) 29);
		Class25.method594(arg0, 205456625);
		@Pc(279) Class466 local279 = Class466.method29640();
		local279.method29650(Class467.method29716(arg0.aClass372_8.method28394((byte) 3)), Class467.method29716(arg0.aClass372_7.method28394((byte) 3)), Class467.method29716(arg0.aClass372_9.method28394((byte) 3)));
		arg0.method24528(local279);
		local279.method29643();
	}

	@OriginalMember(owner = "client!rw", name = "<init>", descriptor = "(Z)V")
	public Class539(@OriginalArg(0) boolean arg0) {
		this.aBoolean893 = arg0;
	}

	@OriginalMember(owner = "client!rw", name = "bp", descriptor = "()Lclient!rp;")
	public Class535 method30888() {
		return this.aClass535_1;
	}

	@OriginalMember(owner = "client!rw", name = "u", descriptor = "(I)I")
	public int method30889(@OriginalArg(0) int arg0) {
		return 100 - this.anInt5098 * -298935620 / (this.anInt5096 * 2008818237);
	}

	@OriginalMember(owner = "client!rw", name = "f", descriptor = "(I)Lclient!ri;")
	public Class530 method30890(@OriginalArg(0) int arg0) {
		return this.aClass530_5;
	}

	@OriginalMember(owner = "client!rw", name = "e", descriptor = "(I)I")
	public int method30891(@OriginalArg(0) int arg0) {
		return 100 - this.anInt5093 * -2011303044 / (this.anInt5094 * 2102272369);
	}

	@OriginalMember(owner = "client!rw", name = "ac", descriptor = "(I)V")
	void method30892(@OriginalArg(0) int arg0) {
		this.method30926(Class540.method31060(Class703.aClass80_Sub37_49.aClass165_Sub11_1.method16040((byte) 8), (byte) -21), -574181629);
		@Pc(14) int local14 = this.aClass626_2.anInt5540 * -390642507;
		@Pc(20) int local20 = this.aClass626_2.anInt5537 * -894305615;
		@Pc(30) int local30 = (local14 >> 3) + (Class89.anInt319 * 1749751025 >> 12);
		@Pc(40) int local40 = (Class102_Sub2.anInt653 * 1132703631 >> 12) + (local20 >> 3);
		Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aByte99 = 0;
		Class507.anInt5045 = 0;
		Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.method19063(8, 8, (byte) 3);
		@Pc(52) byte local52 = 18;
		this.anIntArray469 = new int[local52];
		this.anIntArray468 = new int[local52];
		this.aByteArrayArray17 = new byte[local52][];
		this.aByteArrayArray18 = new byte[local52][];
		this.aByteArrayArray19 = new byte[local52][];
		this.aByteArrayArray20 = new byte[local52][];
		this.aByteArrayArray21 = new byte[local52][];
		@Pc(82) int local82 = 0;
		for (@Pc(93) int local93 = (local30 - (this.anInt5089 * 1562861633 >> 4)) / 8; local93 <= ((this.anInt5089 * 1562861633 >> 4) + local30) / 8; local93++) {
			for (@Pc(116) int local116 = (local40 - (this.anInt5092 * -332702719 >> 4)) / 8; local116 <= ((this.anInt5092 * -332702719 >> 4) + local40) / 8; local116++) {
				@Pc(134) int local134 = (local93 << 8) + local116;
				if (Class325.aClass480_94.method29915(this.method30925(local93, local116, (byte) 4), Class514.aClass514_5.anInt5050 * 707246789, (byte) -3)) {
					this.anIntArray469[local82] = local134;
					this.anIntArray468[local82] = this.method30925(local93, local116, (byte) 4);
					local82++;
				}
			}
		}
		this.anInt5090 = local82 * -1781867357;
		@Pc(178) byte local178;
		if (client.anInt3433 * 1994758437 == 4) {
			local178 = 10;
		} else if (client.anInt3433 * 1994758437 == 15) {
			local178 = 16;
		} else if (client.anInt3433 * 1994758437 == 13) {
			local178 = 6;
		} else if (client.anInt3433 * 1994758437 == 0) {
			local178 = 8;
		} else {
			throw new RuntimeException("" + client.anInt3433 * 1994758437);
		}
		this.method30928(local30, local40, local178, false, (byte) 63);
	}

	@OriginalMember(owner = "client!rw", name = "l", descriptor = "(B)Lclient!vw;")
	public Class626 method30893(@OriginalArg(0) byte arg0) {
		return this.aClass626_2;
	}

	@OriginalMember(owner = "client!rw", name = "dh", descriptor = "(Lclient!rw;)V")
	void method30894(@OriginalArg(0) Class539 arg0) {
		@Pc(2) boolean local2 = arg0.aBoolean893;
		arg0.aBoolean893 = this.aBoolean893;
		this.aBoolean893 = local2;
		@Pc(12) Class536 local12 = arg0.aClass536_10;
		arg0.aClass536_10 = this.aClass536_10;
		this.aClass536_10 = local12;
		arg0.aClass626_1 = this.aClass626_2;
		this.aClass626_1 = arg0.aClass626_2;
		this.aClass665_2.method33371(arg0.method30904((byte) -15), -2053353865);
	}

	@OriginalMember(owner = "client!rw", name = "dg", descriptor = "(Lclient!rw;)V")
	void method30895(@OriginalArg(0) Class539 arg0) {
		@Pc(2) boolean local2 = arg0.aBoolean893;
		arg0.aBoolean893 = this.aBoolean893;
		this.aBoolean893 = local2;
		@Pc(12) Class536 local12 = arg0.aClass536_10;
		arg0.aClass536_10 = this.aClass536_10;
		this.aClass536_10 = local12;
		arg0.aClass626_1 = this.aClass626_2;
		this.aClass626_1 = arg0.aClass626_2;
		this.aClass665_2.method33371(arg0.method30904((byte) 8), -1388176514);
	}

	@OriginalMember(owner = "client!rw", name = "m", descriptor = "(I)Lclient!ty;")
	public Class587 method30896(@OriginalArg(0) int arg0) {
		return this.aClass587_3;
	}

	@OriginalMember(owner = "client!rw", name = "o", descriptor = "(I)Lclient!rp;")
	public Class535 method30897(@OriginalArg(0) int arg0) {
		return this.aClass535_1;
	}

	@OriginalMember(owner = "client!rw", name = "t", descriptor = "(B)Lclient!rr;")
	public Class536 method30898(@OriginalArg(0) byte arg0) {
		return this.aClass536_9;
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(S)I")
	public int method30899(@OriginalArg(0) short arg0) {
		return this.anInt5091 * -94333811;
	}

	@OriginalMember(owner = "client!rw", name = "s", descriptor = "(I)I")
	public int method30900(@OriginalArg(0) int arg0) {
		return this.anInt5087 * -1309555077;
	}

	@OriginalMember(owner = "client!rw", name = "bb", descriptor = "()F")
	public float method30901() {
		return this.aFloat327;
	}

	@OriginalMember(owner = "client!rw", name = "x", descriptor = "(II)[[B")
	public byte[][] method30902(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aClass144_Sub1_1 == null || this.aClass144_Sub1_1.aByteArrayArrayArray8 == null || this.aClass144_Sub1_1.aByteArrayArrayArray8[arg0] == null ? (byte[][]) null : this.aClass144_Sub1_1.aByteArrayArrayArray8[arg0];
	}

	@OriginalMember(owner = "client!rw", name = "w", descriptor = "(I)Lclient!qc;")
	public Class502 method30903(@OriginalArg(0) int arg0) {
		return this.aClass502_3;
	}

	@OriginalMember(owner = "client!rw", name = "r", descriptor = "(B)Lclient!xm;")
	public Class665 method30904(@OriginalArg(0) byte arg0) {
		return this.aClass665_2;
	}

	@OriginalMember(owner = "client!rw", name = "q", descriptor = "(I)Lclient!aod;")
	public Class41_Sub3 method30905(@OriginalArg(0) int arg0) {
		return this.aClass41_Sub3_9;
	}

	@OriginalMember(owner = "client!rw", name = "h", descriptor = "(I)[[I")
	public int[][] method30906(@OriginalArg(0) int arg0) {
		return this.anIntArrayArray60;
	}

	@OriginalMember(owner = "client!rw", name = "d", descriptor = "(I)[[I")
	public int[][] method30907(@OriginalArg(0) int arg0) {
		return this.anIntArrayArray61;
	}

	@OriginalMember(owner = "client!rw", name = "cs", descriptor = "()[[[B")
	public byte[][][] method30908() {
		return this.aByteArrayArrayArray13;
	}

	@OriginalMember(owner = "client!rw", name = "p", descriptor = "([[[BI)V")
	public void method30909(@OriginalArg(0) byte[][][] arg0, @OriginalArg(1) int arg1) {
		this.aByteArrayArrayArray13 = arg0;
	}

	@OriginalMember(owner = "client!rw", name = "v", descriptor = "(B)Lclient!aiz;")
	public Class144_Sub1 method30910(@OriginalArg(0) byte arg0) {
		return this.aClass144_Sub1_1;
	}

	@OriginalMember(owner = "client!rw", name = "y", descriptor = "(Lclient!aod;I)V")
	public void method30911(@OriginalArg(0) Class41_Sub3 arg0, @OriginalArg(1) int arg1) {
		this.aClass41_Sub3_9 = arg0;
	}

	@OriginalMember(owner = "client!rw", name = "n", descriptor = "(I)V")
	public void method30912(@OriginalArg(0) int arg0) {
		this.aClass626_2 = new Class626();
		this.anInt5095 = 0;
		this.anInt5088 = 0;
	}

	@OriginalMember(owner = "client!rw", name = "c", descriptor = "(I)V")
	public void method30913(@OriginalArg(0) int arg0) {
		if (this.aClass570_24 != null) {
			Class376.method28457(1609323686);
			this.aHashMap10 = this.aClass570_24.method31595(-1720134746);
			this.aClass570_24.aClass582_1.method31824(520057215);
			this.aClass570_24 = null;
		}
	}

	@OriginalMember(owner = "client!rw", name = "b", descriptor = "(B)V")
	public void method30914(@OriginalArg(0) byte arg0) {
		this.aClass530_5 = Class530.aClass530_1;
		this.anInt5093 = 0;
		this.anInt5094 = 1923645329;
		this.anInt5098 = 0;
		this.anInt5096 = 282985749;
		this.anInt5097 = 0;
	}

	@OriginalMember(owner = "client!rw", name = "ax", descriptor = "(ZI)V")
	public void method30915(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(1) Class683 local1 = null;
		if (this.aClass665_2 != null && arg0) {
			local1 = this.aClass665_2.method33369(1556299883);
		}
		this.aClass665_2 = new Class665(Class279.aClass102_9, Class708.aClass480_136, this.anInt5089 * 1562861633 >> 3, this.anInt5092 * -332702719 >> 3);
		if (local1 != null) {
			this.aClass665_2.method33380(this, local1, 0, -839749509);
		}
	}

	@OriginalMember(owner = "client!rw", name = "ay", descriptor = "(I)V")
	public void method30916(@OriginalArg(0) int arg0) {
		this.aClass665_2.method33380(this, null, 0, -1489796656);
	}

	@OriginalMember(owner = "client!rw", name = "cq", descriptor = "(Lclient!rw;)V")
	void method30917(@OriginalArg(0) Class539 arg0) {
		@Pc(2) boolean local2 = arg0.aBoolean893;
		arg0.aBoolean893 = this.aBoolean893;
		this.aBoolean893 = local2;
		@Pc(12) Class536 local12 = arg0.aClass536_10;
		arg0.aClass536_10 = this.aClass536_10;
		this.aClass536_10 = local12;
		arg0.aClass626_1 = this.aClass626_2;
		this.aClass626_1 = arg0.aClass626_2;
		this.aClass665_2.method33371(arg0.method30904((byte) -73), -1595779588);
	}

	@OriginalMember(owner = "client!rw", name = "aq", descriptor = "(Lclient!rw;I)V")
	void method30918(@OriginalArg(0) Class539 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) boolean local2 = arg0.aBoolean893;
		arg0.aBoolean893 = this.aBoolean893;
		this.aBoolean893 = local2;
		@Pc(12) Class536 local12 = arg0.aClass536_10;
		arg0.aClass536_10 = this.aClass536_10;
		this.aClass536_10 = local12;
		arg0.aClass626_1 = this.aClass626_2;
		this.aClass626_1 = arg0.aClass626_2;
		this.aClass665_2.method33371(arg0.method30904((byte) -107), -1377466333);
	}

	@OriginalMember(owner = "client!rw", name = "cj", descriptor = "()[[[B")
	public byte[][][] method30919() {
		return this.aByteArrayArrayArray13;
	}

	@OriginalMember(owner = "client!rw", name = "aj", descriptor = "(Lclient!rz;B)V")
	public void method30920(@OriginalArg(0) Class542 arg0, @OriginalArg(1) byte arg1) {
		this.aClass536_9 = arg0.aClass536_11;
		if (Class536.aClass536_8 == this.aClass536_9) {
			this.method30892(-1264218723);
		} else if (Class536.aClass536_7 == this.aClass536_9) {
			this.method30922(arg0.aPacketBit_3, (byte) 84);
		} else if (this.aClass536_9 == Class536.aClass536_2) {
			this.method30924(596645317);
		} else if (this.aClass536_9.method30871((byte) -1)) {
			this.method30923(arg0.aPacketBit_3, (byte) -39);
		}
	}

	@OriginalMember(owner = "client!rw", name = "g", descriptor = "(I)I")
	public int method30921(@OriginalArg(0) int arg0) {
		return this.anInt5089 * 1562861633;
	}

	@OriginalMember(owner = "client!rw", name = "ag", descriptor = "(Lclient!asa;B)V")
	void method30922(@OriginalArg(0) PacketBit arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) int local3 = arg0.g1_alt1();
		@Pc(7) int local7 = arg0.g1();
		@Pc(11) int local11 = arg0.g2_alt2();
		@Pc(20) boolean local20 = arg0.g1_alt1() == 1;
		@Pc(24) int local24 = arg0.g2();
		this.anInt5099 = arg0.g1_alt1() * 577448291;
		if (!this.aBoolean893) {
			this.method30927(-1943336137);
		}
		this.method30926(Class540.method31060(local7, (byte) -11), -574181629);
		this.anIntArray469 = new int[local3];
		this.anIntArray468 = new int[local3];
		this.aByteArrayArray17 = new byte[local3][];
		this.aByteArrayArray18 = new byte[local3][];
		this.aByteArrayArray19 = null;
		this.aByteArrayArray20 = new byte[local3][];
		this.aByteArrayArray21 = new byte[local3][];
		local3 = 0;
		for (@Pc(84) int local84 = (local24 - (this.anInt5089 * 1562861633 >> 4)) / 8; local84 <= ((this.anInt5089 * 1562861633 >> 4) + local24) / 8; local84++) {
			for (@Pc(107) int local107 = (local11 - (this.anInt5092 * -332702719 >> 4)) / 8; local107 <= ((this.anInt5092 * -332702719 >> 4) + local11) / 8; local107++) {
				if (Class325.aClass480_94.method29915(this.method30925(local84, local107, (byte) 4), Class514.aClass514_5.anInt5050 * 707246789, (byte) -3)) {
					this.anIntArray469[local3] = local107 + (local84 << 8);
					this.anIntArray468[local3] = this.method30925(local84, local107, (byte) 4);
					local3++;
				}
			}
		}
		this.anInt5090 = local3 * -1781867357;
		this.method30928(local24, local11, 3, local20, (byte) 100);
	}

	@OriginalMember(owner = "client!rw", name = "ab", descriptor = "(Lclient!asa;B)V")
	void method30923(@OriginalArg(0) PacketBit arg0, @OriginalArg(1) byte arg1) {
		this.anInt5099 = arg0.g1_alt3() * 577448291;
		@Pc(10) int local10 = arg0.g2();
		@Pc(14) int local14 = arg0.g1_alt2();
		@Pc(23) boolean local23 = (local14 & 0x1) != 0;
		@Pc(27) int local27 = arg0.g1_alt2();
		if (local27 == 1) {
			this.aClass536_9 = Class536.aClass536_3;
		} else if (local27 == 2) {
			this.aClass536_9 = Class536.aClass536_4;
		} else if (local27 == 3) {
			this.aClass536_9 = Class536.aClass536_5;
		} else if (local27 == 4) {
			this.aClass536_9 = Class536.aClass536_1;
		}
		@Pc(58) int local58 = arg0.g2_alt2();
		@Pc(62) int local62 = arg0.g1_alt1();
		if (!this.aBoolean893) {
			this.method30927(-1077746209);
		}
		this.method30926(Class540.method31060(local62, (byte) -58), -574181629);
		arg0.method22560(1668075746);
		@Pc(81) HashSet local81 = new HashSet();
		@Pc(83) int local83;
		@Pc(88) int local88;
		@Pc(98) int local98;
		@Pc(111) int local111;
		@Pc(119) int local119;
		@Pc(134) int local134;
		@Pc(140) int local140;
		@Pc(150) int local150;
		for (local83 = 0; local83 < 4; local83++) {
			for (local88 = 0; local88 < this.anInt5089 * 1562861633 >> 3; local88++) {
				for (local98 = 0; local98 < this.anInt5092 * -332702719 >> 3; local98++) {
					local111 = arg0.method22559(1, -325783685);
					if (local111 == 1) {
						local119 = arg0.method22559(26, -325783685);
						this.anIntArrayArrayArray16[local83][local88][local98] = local119;
						local134 = local119 >> 14 & 0x3FF;
						local140 = local119 >> 3 & 0x7FF;
						local150 = local134 >> 3 << 8 | local140 >> 3;
						local81.add(local150);
					} else {
						this.anIntArrayArrayArray16[local83][local88][local98] = -1;
					}
				}
			}
		}
		arg0.method22568(1927963182);
		local83 = local81.size();
		this.anIntArray469 = new int[local83];
		this.anIntArray468 = new int[local83];
		this.aByteArrayArray17 = new byte[local83][];
		this.aByteArrayArray18 = new byte[local83][];
		this.aByteArrayArray19 = null;
		this.aByteArrayArray20 = new byte[local83][];
		this.aByteArrayArray21 = new byte[local83][];
		local83 = 0;
		for (local88 = 0; local88 < 4; local88++) {
			for (local98 = 0; local98 < this.anInt5089 * 1562861633 >> 3; local98++) {
				for (local111 = 0; local111 < this.anInt5092 * -332702719 >> 3; local111++) {
					local119 = this.anIntArrayArrayArray16[local88][local98][local111];
					if (local119 != -1) {
						local134 = local119 >> 14 & 0x3FF;
						local140 = local119 >> 3 & 0x7FF;
						local150 = local140 / 8 + (local134 / 8 << 8);
						@Pc(268) int local268;
						for (local268 = 0; local268 < local83; local268++) {
							if (this.anIntArray469[local268] == local150) {
								local150 = -1;
								break;
							}
						}
						if (local150 != -1) {
							local268 = local150 >> 8 & 0xFF;
							@Pc(295) int local295 = local150 & 0xFF;
							if (Class325.aClass480_94.method29915(this.method30925(local268, local295, (byte) 4), Class514.aClass514_5.anInt5050 * 707246789, (byte) -97)) {
								this.anIntArray469[local83] = local150;
								this.anIntArray468[local83] = this.method30925(local268, local295, (byte) 4);
								local83++;
							}
						}
					}
				}
			}
		}
		this.anInt5090 = local83 * -1781867357;
		this.method30928(local58, local10, 3, local23, (byte) 3);
	}

	@OriginalMember(owner = "client!rw", name = "al", descriptor = "(I)V")
	void method30924(@OriginalArg(0) int arg0) {
		this.aClass536_10 = this.aClass536_9;
		this.method30926(Class345.aClass345_2, -574181629);
		@Pc(9) int local9;
		@Pc(14) int local14;
		@Pc(24) int local24;
		for (local9 = 0; local9 < 4; local9++) {
			for (local14 = 0; local14 < this.anInt5089 * 1562861633 >> 3; local14++) {
				for (local24 = 0; local24 < this.anInt5092 * -332702719 >> 3; local24++) {
					this.anIntArrayArrayArray16[local9][local14][local24] = -1;
				}
			}
		}
		@Pc(75) int local75;
		@Pc(82) int local82;
		@Pc(87) int local87;
		@Pc(92) int local92;
		@Pc(97) int local97;
		@Pc(102) int local102;
		@Pc(107) int local107;
		for (@Pc(52) Class80_Sub30 local52 = (Class80_Sub30) Class251.aClass8_50.method247(129206984); local52 != null; local52 = (Class80_Sub30) Class251.aClass8_50.method237(-1838343786)) {
			local14 = local52.anInt1646 * -668837889;
			@Pc(68) boolean local68 = (local14 & 0x1) == 1;
			local75 = local52.anInt1641 * -853222811 >> 3;
			local82 = local52.anInt1639 * 180993801 >> 3;
			local87 = local52.anInt1642 * -818425587;
			local92 = local52.anInt1643 * 1841476701;
			local97 = local52.anInt1640 * -646640937;
			local102 = local52.anInt1638 * 1712418253;
			local107 = local52.anInt1644 * 319517489;
			@Pc(112) int local112 = local52.anInt1645 * -195158105;
			@Pc(114) int local114 = 0;
			@Pc(116) int local116 = 0;
			@Pc(118) byte local118 = 1;
			@Pc(120) byte local120 = 1;
			if (local14 == 1) {
				local116 = local107 - 1;
				local118 = -1;
			} else if (local14 == 2) {
				local116 = local107 - 1;
				local114 = local112 - 1;
				local118 = -1;
				local120 = -1;
			} else if (local14 == 3) {
				local114 = local112 - 1;
				local118 = 1;
				local120 = -1;
			}
			@Pc(159) int local159 = local82;
			while (local159 < local112 + local82) {
				@Pc(166) int local166 = local116;
				@Pc(168) int local168 = local75;
				while (local168 < local107 + local75) {
					if (local68) {
						this.anIntArrayArrayArray16[local102][local114 + local87][local92 + local166] = (local14 << 1) + (local168 << 14) + (local97 << 24) + (local159 << 3);
					} else {
						this.anIntArrayArrayArray16[local102][local87 + local166][local114 + local92] = (local97 << 24) + (local168 << 14) + (local159 << 3) + (local14 << 1);
					}
					local168++;
					local166 += local118;
				}
				local159++;
				local114 += local120;
			}
		}
		local9 = client.anInt3495 * 246068329;
		this.anIntArray469 = new int[local9];
		this.anIntArray468 = new int[local9];
		this.aByteArrayArray17 = new byte[local9][];
		this.aByteArrayArray18 = new byte[local9][];
		this.aByteArrayArray19 = null;
		this.aByteArrayArray20 = new byte[local9][];
		this.aByteArrayArray21 = new byte[local9][];
		local9 = 0;
		for (@Pc(287) Class80_Sub30 local287 = (Class80_Sub30) Class251.aClass8_50.method247(129206984); local287 != null; local287 = (Class80_Sub30) Class251.aClass8_50.method237(-1736014862)) {
			local24 = local287.anInt1641 * -853222811 >>> 3;
			local75 = local287.anInt1639 * 180993801 >>> 3;
			local82 = local24 + local287.anInt1644 * 319517489;
			if ((local82 & 0x7) == 0) {
				local82--;
			}
			local82 >>>= 0x3;
			local87 = local75 + local287.anInt1645 * -195158105;
			if ((local87 & 0x7) == 0) {
				local87--;
			}
			local87 >>>= 0x3;
			for (local92 = local24 >>> 3; local92 <= local82; local92++) {
				label84: for (local97 = local75 >>> 3; local97 <= local87; local97++) {
					local102 = local92 << 8 | local97;
					for (local107 = 0; local107 < local9; local107++) {
						if (this.anIntArray469[local107] == local102) {
							continue label84;
						}
					}
					if (Class325.aClass480_94.method29915(this.method30925(local92, local97, (byte) 4), Class514.aClass514_5.anInt5050 * 707246789, (byte) -98)) {
						this.anIntArray469[local9] = local102;
						this.anIntArray468[local9] = this.method30925(local92, local97, (byte) 4);
						local9++;
					}
				}
			}
		}
		this.anInt5090 = local9 * -1781867357;
		this.method30928(this.anInt5089 * 1562861633 >> 4, this.anInt5092 * -332702719 >> 4, 3, false, (byte) 3);
	}

	@OriginalMember(owner = "client!rw", name = "ah", descriptor = "(IIB)I")
	int method30925(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		return arg0 | arg1 << 7;
	}

	@OriginalMember(owner = "client!rw", name = "af", descriptor = "(Lclient!iq;I)V")
	void method30926(@OriginalArg(0) Class345 arg0, @OriginalArg(1) int arg1) {
		if (arg0 == this.aClass345_7) {
			return;
		}
		this.anInt5089 = (this.anInt5092 = arg0.anInt4248 * 623650969) * 437849025;
		this.anIntArrayArrayArray16 = new int[4][this.anInt5089 * 1562861633 >> 3][this.anInt5092 * -332702719 >> 3];
		this.anIntArrayArray60 = new int[this.anInt5089 * 1562861633][this.anInt5092 * -332702719];
		this.anIntArrayArray61 = new int[this.anInt5089 * 1562861633][this.anInt5092 * -332702719];
		this.aByteArrayArrayArray13 = new byte[4][this.anInt5089 * 1562861633][this.anInt5092 * -332702719];
		this.aClass502_3 = new Class502(4, this.anInt5089 * 1562861633, this.anInt5092 * -332702719);
		this.method30915(false, -946822638);
		Class60.method1184(2070514422);
		this.aClass345_7 = arg0;
	}

	@OriginalMember(owner = "client!rw", name = "am", descriptor = "(I)V")
	void method30927(@OriginalArg(0) int arg0) {
		if (Class536.aClass536_2 == this.aClass536_9 || Class536.aClass536_2 == this.aClass536_10) {
			return;
		}
		if (this.aClass536_9 == Class536.aClass536_3 || Class536.aClass536_5 == this.aClass536_9 || this.aClass536_10 != this.aClass536_9 && (Class536.aClass536_7 == this.aClass536_9 || this.aClass536_10 == Class536.aClass536_7)) {
			@Pc(32) Iterator local32 = client.aClass24_18.iterator();
			while (local32.hasNext()) {
				@Pc(39) Class80_Sub19 local39 = (Class80_Sub19) local32.next();
				Class599.method32051((Class120_Sub1_Sub1_Sub1_Sub1) local39.anObject5, (short) 22141);
			}
			client.anInt3453 = 0;
			client.anInt3452 = 0;
			client.aClass24_18.method564(-253003832);
		}
		this.aClass536_10 = this.aClass536_9;
	}

	@OriginalMember(owner = "client!rw", name = "ak", descriptor = "(IIIZB)V")
	void method30928(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte arg4) {
		if (client.anInt3541 * -1330995431 == 4) {
			if (this.aBoolean893) {
				throw new IllegalStateException();
			}
			client.anInt3541 = -119085189;
			client.anInt3461 = 2001457723;
		}
		if (!arg3 && arg0 == this.anInt5088 * 1050370503 && arg1 == this.anInt5095 * 1595983967) {
			return;
		}
		this.anInt5088 = arg0 * 936775671;
		this.anInt5095 = arg1 * 881562527;
		if (!this.aBoolean893) {
			Class604.method32148(arg2, 230754556);
			Class92.method1878(Class60.aClass60_99.method1180(Class512.aClass719_3, -1864667802), true, Class279.aClass102_9, Class709.aClass104_26, Class689.aClass15_13, 745103119);
		}
		if (this.aClass626_2 == null) {
			this.aClass626_1 = new Class626(0, 0, 0);
		} else {
			this.aClass626_1 = this.aClass626_2;
		}
		this.aClass626_2 = new Class626(0, (this.anInt5088 * 1050370503 - (this.anInt5089 * 1562861633 >> 4)) * 8, (this.anInt5095 * 1595983967 - (this.anInt5092 * -332702719 >> 4)) * 8);
		this.aClass80_Sub1_Sub12_4 = Class159.method15338(this.aClass626_2.anInt5540 * -390642507 + this.anInt5089 * 1562861633 / 2, this.anInt5089 * 1562861633 / 2 + this.aClass626_2.anInt5537 * -894305615);
		this.aClass587_3 = null;
		this.aLong393 = -1390528405935974947L;
		if (!this.aBoolean893) {
			this.method30955(arg2, 1882279378);
		}
	}

	@OriginalMember(owner = "client!rw", name = "ct", descriptor = "()Lclient!aod;")
	public Class41_Sub3 method30929() {
		return this.aClass41_Sub3_9;
	}

	@OriginalMember(owner = "client!rw", name = "ad", descriptor = "(I)V")
	void method30930(@OriginalArg(0) int arg0) {
		this.aClass144_Sub1_2 = null;
		this.aClass144_Sub1_1 = null;
		if (this.aClass502_3 != null) {
			this.aClass502_3.method30427(975938240);
		}
		if (this.aClass665_2 != null) {
			this.aClass665_2.method33377(1791529358);
		}
		if (this.aClass570_24 != null) {
			this.aClass570_24.aClass582_1.method31824(-902982349);
			this.aClass570_24 = null;
		}
	}

	@OriginalMember(owner = "client!rw", name = "dx", descriptor = "(Lclient!asa;)V")
	void method30931(@OriginalArg(0) PacketBit arg0) {
		@Pc(3) int local3 = arg0.g1_alt1();
		@Pc(7) int local7 = arg0.g1();
		@Pc(11) int local11 = arg0.g2_alt2();
		@Pc(20) boolean local20 = arg0.g1_alt1() == 1;
		@Pc(24) int local24 = arg0.g2();
		this.anInt5099 = arg0.g1_alt1() * 577448291;
		if (!this.aBoolean893) {
			this.method30927(-1801912163);
		}
		this.method30926(Class540.method31060(local7, (byte) -92), -574181629);
		this.anIntArray469 = new int[local3];
		this.anIntArray468 = new int[local3];
		this.aByteArrayArray17 = new byte[local3][];
		this.aByteArrayArray18 = new byte[local3][];
		this.aByteArrayArray19 = null;
		this.aByteArrayArray20 = new byte[local3][];
		this.aByteArrayArray21 = new byte[local3][];
		local3 = 0;
		for (@Pc(84) int local84 = (local24 - (this.anInt5089 * 1562861633 >> 4)) / 8; local84 <= ((this.anInt5089 * 1562861633 >> 4) + local24) / 8; local84++) {
			for (@Pc(107) int local107 = (local11 - (this.anInt5092 * -332702719 >> 4)) / 8; local107 <= ((this.anInt5092 * -332702719 >> 4) + local11) / 8; local107++) {
				if (Class325.aClass480_94.method29915(this.method30925(local84, local107, (byte) 4), Class514.aClass514_5.anInt5050 * 707246789, (byte) -12)) {
					this.anIntArray469[local3] = local107 + (local84 << 8);
					this.anIntArray468[local3] = this.method30925(local84, local107, (byte) 4);
					local3++;
				}
			}
		}
		this.anInt5090 = local3 * -1781867357;
		this.method30928(local24, local11, 3, local20, (byte) 13);
	}

	@OriginalMember(owner = "client!rw", name = "k", descriptor = "(I)Lclient!te;")
	public Class570 method30932(@OriginalArg(0) int arg0) {
		return this.aClass570_24;
	}

	@OriginalMember(owner = "client!rw", name = "aa", descriptor = "(Lclient!aiz;[[BI)V")
	void method30933(@OriginalArg(0) Class144_Sub1 arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) int arg2) {
		@Pc(2) int local2 = arg1.length;
		@Pc(4) int local4;
		for (local4 = 0; local4 < local2; local4++) {
			@Pc(11) byte[] local11 = arg1[local4];
			if (local11 != null) {
				@Pc(19) Packet local19 = new Packet(local11);
				@Pc(26) int local26 = this.anIntArray469[local4] >> 8;
				@Pc(33) int local33 = this.anIntArray469[local4] & 0xFF;
				@Pc(43) int local43 = local26 * 64 - this.aClass626_2.anInt5540 * -390642507;
				@Pc(53) int local53 = local33 * 64 - this.aClass626_2.anInt5537 * -894305615;
				if (!this.aBoolean893 && Class490.aClass263_13 != null) {
					Class490.aClass263_13.method26519(1187835404);
				}
				arg0.method11926(local19, local43, local53, this.aClass626_2.anInt5540 * -390642507, this.aClass626_2.anInt5537 * -894305615, 1861611398);
				arg0.method11998(Class279.aClass102_9, local19, local43, local53, -1137256781);
			}
		}
		for (local4 = 0; local4 < local2; local4++) {
			@Pc(106) int local106 = (this.anIntArray469[local4] >> 8) * 64 - this.aClass626_2.anInt5540 * -390642507;
			@Pc(121) int local121 = (this.anIntArray469[local4] & 0xFF) * 64 - this.aClass626_2.anInt5537 * -894305615;
			@Pc(125) byte[] local125 = arg1[local4];
			if (local125 == null && this.anInt5095 * 1595983967 < 800) {
				if (!this.aBoolean893 && Class490.aClass263_13 != null) {
					Class490.aClass263_13.method26519(596091637);
				}
				arg0.method11982(local106, local121, 64, 64, -650526949);
			}
		}
	}

	@OriginalMember(owner = "client!rw", name = "ae", descriptor = "(Lclient!aiz;[[BI)V")
	void method30934(@OriginalArg(0) Class144_Sub1 arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) int arg2) {
		@Pc(1) int local1;
		@Pc(15) int local15;
		@Pc(25) int local25;
		@Pc(42) int local42;
		for (local1 = 0; local1 < arg0.anInt1383 * -2108820349; local1++) {
			if (!this.aBoolean893) {
				Class490.aClass263_13.method26519(601460833);
			}
			for (local15 = 0; local15 < this.anInt5089 * 1562861633 >> 3; local15++) {
				for (local25 = 0; local25 < this.anInt5092 * -332702719 >> 3; local25++) {
					local42 = this.anIntArrayArrayArray16[local1][local15][local25];
					if (local42 != -1) {
						@Pc(51) int local51 = local42 >> 24 & 0x3;
						if (!arg0.aBoolean260 || local51 == 0) {
							@Pc(62) int local62 = local42 >> 1 & 0x3;
							@Pc(68) int local68 = local42 >> 14 & 0x3FF;
							@Pc(74) int local74 = local42 >> 3 & 0x7FF;
							@Pc(84) int local84 = (local68 / 8 << 8) + local74 / 8;
							for (@Pc(86) int local86 = 0; local86 < this.anIntArray469.length; local86++) {
								if (this.anIntArray469[local86] == local84 && arg1[local86] != null) {
									@Pc(108) Packet local108 = new Packet(arg1[local86]);
									arg0.method11950(local108, local1, local15 * 8, local25 * 8, local51, local68, local74, local62, (byte) -53);
									arg0.method11999(Class279.aClass102_9, local108, local1, local15 * 8, local25 * 8, local51, local68, local74, local62, 513500097);
									break;
								}
							}
						}
					}
				}
			}
		}
		for (local1 = 0; local1 < arg0.anInt1383 * -2108820349; local1++) {
			if (!this.aBoolean893) {
				Class490.aClass263_13.method26519(1839403704);
			}
			for (local15 = 0; local15 < this.anInt5089 * 1562861633 >> 3; local15++) {
				for (local25 = 0; local25 < this.anInt5092 * -332702719 >> 3; local25++) {
					local42 = this.anIntArrayArrayArray16[local1][local15][local25];
					if (local42 == -1) {
						arg0.method11932(local1, local15 * 8, local25 * 8, 8, 8, -2144666097);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rw", name = "ap", descriptor = "(Lclient!aiz;[[BB)V")
	void method30935(@OriginalArg(0) Class144_Sub1 arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) byte arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5090 * -97470709; local1++) {
			@Pc(11) byte[] local11 = arg1[local1];
			if (local11 != null) {
				@Pc(28) int local28 = (this.anIntArray469[local1] >> 8) * 64 - this.aClass626_2.anInt5540 * -390642507;
				@Pc(43) int local43 = (this.anIntArray469[local1] & 0xFF) * 64 - this.aClass626_2.anInt5537 * -894305615;
				if (!this.aBoolean893) {
					Class490.aClass263_13.method26519(716295766);
				}
				arg0.method12028(Class279.aClass102_9, local11, local28, local43, (short) 5126);
				if (this.aBoolean893) {
					this.method31013(10, 2102161787);
				}
			}
		}
	}

	@OriginalMember(owner = "client!rw", name = "ce", descriptor = "()[[I")
	public int[][] method30936() {
		return this.anIntArrayArray61;
	}

	@OriginalMember(owner = "client!rw", name = "au", descriptor = "(B)V")
	void method30937(@OriginalArg(0) byte arg0) {
		@Pc(3) int local3 = this.aByteArrayArray19.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.aByteArrayArray19[local5] != null) {
				@Pc(17) int local17 = -1;
				for (@Pc(19) int local19 = 0; local19 < client.anInt3528 * -540236429; local19++) {
					if (client.anIntArray328[local19] == this.anIntArray469[local5]) {
						local17 = local19;
						break;
					}
				}
				if (local17 == -1) {
					client.anIntArray328[client.anInt3528 * -540236429] = this.anIntArray469[local5];
					local17 = (client.anInt3528 += 131008443) * -540236429 - 1;
				}
				@Pc(67) Packet local67 = new Packet(this.aByteArrayArray19[local5]);
				@Pc(69) int local69 = 0;
				while (local67.pos * -1380987821 < this.aByteArrayArray19[local5].length && local69 < 511 && client.anInt3453 * -1702559601 < 1023) {
					@Pc(95) int local95 = local17 | local69++ << 6;
					@Pc(99) int local99 = local67.g2();
					@Pc(103) int local103 = local99 >> 14;
					@Pc(109) int local109 = local99 >> 7 & 0x3F;
					@Pc(113) int local113 = local99 & 0x3F;
					@Pc(130) int local130 = (this.anIntArray469[local5] >> 8) * 64 - this.aClass626_2.anInt5540 * -390642507 + local109;
					@Pc(147) int local147 = (this.anIntArray469[local5] & 0xFF) * 64 - this.aClass626_2.anInt5537 * -894305615 + local113;
					@Pc(155) Class335 local155 = (Class335) Class460.aClass41_Sub2_1.method18054(local67.g2(), -292007688);
					@Pc(161) Class80_Sub19 local161 = (Class80_Sub19) client.aClass24_18.method560((long) local95);
					if (local161 == null && (local155.aByte135 & 0x1) > 0 && local130 >= 0 && local130 + local155.anInt4212 * 1573297955 < this.anInt5089 * 1562861633 && local147 >= 0 && local155.anInt4212 * 1573297955 + local147 < this.anInt5092 * -332702719) {
						@Pc(200) Class120_Sub1_Sub1_Sub1_Sub1 local200 = new Class120_Sub1_Sub1_Sub1_Sub1(this.aClass570_24);
						local200.anInt2671 = local95 * -486069653;
						@Pc(210) Class80_Sub19 local210 = new Class80_Sub19(local200);
						client.aClass24_18.method563(local210, (long) local95);
						client.aClass80_Sub19Array1[(client.anInt3452 += -382054833) * -340916049 - 1] = local210;
						client.anIntArray304[(client.anInt3453 += 192683631) * -1702559601 - 1] = local95;
						local200.anInt2694 = client.anInt3436 * -265248265;
						local200.method18794(local155, -313911151);
						local200.method18984(local200.aClass335_1.anInt4212 * 1573297955, (byte) 76);
						local200.anInt2697 = (local200.aClass335_1.anInt4209 * -2090808675 << 3) * 77355267;
						local200.method18986(local200.aClass335_1.aClass716_1.method37222(1817877952).method37268() << 11 & 0x3FFF, true, (byte) -10);
						local200.method18792(local103, local130, local147, true, local200.method18966((byte) -106), 1675811585);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rw", name = "ao", descriptor = "(I)V")
	public void method30938(@OriginalArg(0) int arg0) {
		if (this.aBoolean893) {
			this.method30914((byte) 111);
			this.aLong393 = -1390528405935974947L;
			@Pc(10) Class539 local10 = client.aClass539_1;
			this.anInt5090 = local10.anInt5090;
			this.anIntArray469 = local10.anIntArray469;
			this.anIntArray468 = local10.anIntArray468;
			this.aByteArrayArray17 = local10.aByteArrayArray17;
			this.aByteArrayArray18 = local10.aByteArrayArray18;
			this.aByteArrayArray19 = local10.aByteArrayArray19;
			this.aByteArrayArray20 = local10.aByteArrayArray20;
			this.aByteArrayArray21 = local10.aByteArrayArray21;
			this.aClass502_3 = local10.aClass502_3;
			this.aClass665_2 = local10.aClass665_2;
			this.anIntArrayArrayArray16 = local10.anIntArrayArrayArray16;
			this.anInt5091 = local10.anInt5091;
			this.anInt5087 = local10.anInt5087;
			this.aClass80_Sub1_Sub12_4 = local10.aClass80_Sub1_Sub12_4;
			this.aClass587_3 = local10.aClass587_3;
			this.anIntArrayArray60 = local10.anIntArrayArray60;
			this.anIntArrayArray61 = local10.anIntArrayArray61;
			this.aByteArrayArrayArray13 = local10.aByteArrayArrayArray13;
			this.aClass536_9 = local10.aClass536_9;
			this.aClass345_7 = local10.aClass345_7;
			this.aClass626_2 = local10.aClass626_2;
			this.aClass626_1 = local10.aClass626_1;
			this.anInt5088 = local10.anInt5088;
			this.anInt5095 = local10.anInt5095;
			this.anInt5089 = local10.anInt5089;
			this.anInt5092 = local10.anInt5092;
		} else if (client.anInt3433 * 1994758437 == 4) {
			Class604.method32148(10, 2078415418);
		} else if (client.anInt3433 * 1994758437 == 13) {
			Class604.method32148(6, 215888331);
		} else if (client.anInt3433 * 1994758437 == 15) {
			Class604.method32148(16, -1149053762);
		} else if (client.anInt3433 * 1994758437 == 18) {
			Class604.method32148(3, 1554551419);
		} else if (client.anInt3433 * 1994758437 == 0) {
			Class604.method32148(8, -1335493762);
		}
	}

	@OriginalMember(owner = "client!rw", name = "ai", descriptor = "(I)V")
	public void method30939(@OriginalArg(0) int arg0) {
		this.anInt5091 = -1119541784;
		if (this.anInt5089 * 1562861633 == 0) {
			this.anInt5087 = -84255574;
		} else {
			this.anInt5087 = (int) ((double) (this.anInt5089 * 1562861633) * 34.46D) * -1558370125;
		}
		this.anInt5087 = (-1309555077 * this.anInt5087 << 2) * -1558370125;
		if (Class279.aClass102_9.method20678()) {
			this.anInt5087 += 978413056;
		}
	}

	@OriginalMember(owner = "client!rw", name = "aw", descriptor = "()I")
	public int method30940() {
		return 100 - this.anInt5093 * -2011303044 / (this.anInt5094 * 2102272369);
	}

	@OriginalMember(owner = "client!rw", name = "av", descriptor = "(I)Z")
	public boolean method30941(@OriginalArg(0) int arg0) {
		if (!this.aBoolean893) {
			Class249.method26348(false, -195610425);
		}
		if (-8057110165237688949L * this.aLong393 == -1L) {
			this.aLong393 = Class303.method27111((byte) 61) * 1390528405935974947L;
		}
		this.anInt5093 = 0;
		@Pc(23) int local23;
		for (local23 = 0; local23 < this.anInt5090 * -97470709; local23++) {
			if (!Class325.aClass480_94.method29975(this.anIntArray468[local23], -1403081456)) {
				this.anInt5093 += 1133586951;
			}
		}
		if (this.aClass587_3 == null) {
			if (this.aClass80_Sub1_Sub12_4 == null || !Class310.aClass480_93.method29972(this.aClass80_Sub1_Sub12_4.aString108, -2044757504)) {
				this.aClass587_3 = new Class587(0);
			} else if (Class310.aClass480_93.method29987(this.aClass80_Sub1_Sub12_4.aString108, 32541824)) {
				this.aClass587_3 = Class498.method30359(Class310.aClass480_93, this.aClass80_Sub1_Sub12_4.aString108, client.aBoolean732, (byte) -65);
			} else {
				this.anInt5093 += 1133586951;
			}
		}
		if (this.anInt5093 * 581182391 > 0) {
			if (this.anInt5094 * 2102272369 < this.anInt5093 * 581182391) {
				this.anInt5094 = this.anInt5093 * -87555161;
			}
			this.aClass530_5 = Class530.aClass530_4;
			return false;
		}
		for (local23 = 0; local23 < this.anInt5090 * -97470709; local23++) {
			if (this.aByteArrayArray17[local23] == null) {
				this.aByteArrayArray17[local23] = Class325.aClass480_94.method29918(this.anIntArray468[local23], Class514.aClass514_5.anInt5050 * 707246789, 1896589581);
			}
			if (this.aByteArrayArray18[local23] == null) {
				this.aByteArrayArray18[local23] = Class325.aClass480_94.method29918(this.anIntArray468[local23], Class514.aClass514_9.anInt5050 * 707246789, 1896589581);
			}
			if (this.aByteArrayArray20[local23] == null) {
				this.aByteArrayArray20[local23] = Class325.aClass480_94.method29918(this.anIntArray468[local23], Class514.aClass514_2.anInt5050 * 707246789, 1896589581);
			}
			if (this.aByteArrayArray21[local23] == null) {
				this.aByteArrayArray21[local23] = Class325.aClass480_94.method29918(this.anIntArray468[local23], Class514.aClass514_1.anInt5050 * 707246789, 1896589581);
			}
			if (this.aByteArrayArray19 != null && this.aByteArrayArray19[local23] == null) {
				this.aByteArrayArray19[local23] = Class325.aClass480_94.method29918(this.anIntArray468[local23], Class514.aClass514_3.anInt5050 * 707246789, 1896589581);
			}
		}
		local23 = this.anInt5098 * 856004103;
		@Pc(240) Class669 local240 = new Class669(-1);
		@Pc(245) Class669 local245 = new Class669(-1);
		this.anInt5098 = 0;
		@Pc(250) int local250;
		@Pc(293) int local293;
		@Pc(320) int local320;
		for (local250 = 0; local250 < this.anInt5090 * -97470709; local250++) {
			@Pc(261) byte[] local261 = this.aByteArrayArray18[local250];
			@Pc(278) int local278;
			if (local261 != null) {
				local278 = (this.anIntArray469[local250] >> 8) * 64 - this.aClass626_2.anInt5540 * -390642507;
				local293 = (this.anIntArray469[local250] & 0xFF) * 64 - this.aClass626_2.anInt5537 * -894305615;
				if (this.aClass536_9.method30871((byte) 40)) {
					local278 = 10;
					local293 = 10;
				}
				local320 = Class368.method28295(this.aClass41_Sub3_9, local261, local278, local293, this.anInt5089 * 1562861633, this.anInt5092 * -332702719, local245, local240, -1943061718);
				if (local320 > 0) {
					this.anInt5098 += local320 * -361236553;
				}
			}
			local261 = this.aByteArrayArray21[local250];
			if (local261 != null) {
				local278 = (this.anIntArray469[local250] >> 8) * 64 - this.aClass626_2.anInt5540 * -390642507;
				local293 = (this.anIntArray469[local250] & 0xFF) * 64 - this.aClass626_2.anInt5537 * -894305615;
				if (this.aClass536_9.method30871((byte) -14)) {
					local278 = 10;
					local293 = 10;
				}
				local320 = Class368.method28295(this.aClass41_Sub3_9, local261, local278, local293, this.anInt5089 * 1562861633, this.anInt5092 * -332702719, local245, local240, -884205103);
				if (local320 > 0) {
					this.anInt5098 += local320 * -361236553;
				}
			}
		}
		if (this.anInt5098 * 856004103 > 0) {
			if (this.anInt5098 * 856004103 != local23) {
				this.anInt5097 = client.anInt3436 * -1358506661;
			} else if (this.anInt5097 * 2059752147 != 0 && client.anInt3436 - this.anInt5097 * 2059752147 == 1000) {
				Class33.method739(local245.anInt5711 * 1757747911, local240.anInt5711 * 1757747911, this.anInt5098 * 856004103, 1078021321);
				Class245.method26321(-315417534);
			}
			if (this.anInt5096 * 2008818237 < this.anInt5098 * 856004103) {
				this.anInt5096 = this.anInt5098 * -713723501;
			}
			this.aClass530_5 = Class530.aClass530_3;
			return false;
		}
		if (!this.aBoolean893 && Class530.aClass530_1 != this.aClass530_5) {
			Class92.method1878(Class60.aClass60_99.method1180(Class512.aClass719_3, -1968954489) + Class256.aString161 + "(100%)", true, Class279.aClass102_9, Class709.aClass104_26, Class689.aClass15_13, 1084817028);
		}
		this.aClass530_5 = Class530.aClass530_2;
		if (!this.aBoolean893 && Class490.aClass263_13 != null) {
			Class490.aClass263_13.method26519(1660632150);
		}
		if (!this.aBoolean893) {
			for (local250 = 0; local250 < 2048; local250++) {
				@Pc(523) Class120_Sub1_Sub1_Sub1_Sub2 local523 = client.aClass120_Sub1_Sub1_Sub1_Sub2Array1[local250];
				if (local523 != null) {
					local523.aClass570_23 = null;
				}
			}
			for (local250 = 0; local250 < client.aClass80_Sub19Array1.length; local250++) {
				@Pc(541) Class80_Sub19 local541 = client.aClass80_Sub19Array1[local250];
				if (local541 != null) {
					((Class120_Sub1) local541.anObject5).aClass570_23 = null;
				}
			}
		}
		if (!this.aBoolean893) {
			Class92.method1877(true, -1354560587);
		}
		@Pc(558) boolean local558 = false;
		@Pc(566) int local566;
		if (Class703.aClass80_Sub37_49.aClass165_Sub13_1.method16080(-703300005) == 2) {
			for (local566 = 0; local566 < this.anInt5090 * -97470709; local566++) {
				if (this.aByteArrayArray21[local566] != null || this.aByteArrayArray20[local566] != null) {
					local558 = true;
					break;
				}
			}
		}
		local566 = Class15.method424(Class703.aClass80_Sub37_49.aClass165_Sub39_1.method16764(590193804), 2023572396).anInt4194 * 2134757080;
		if (Class279.aClass102_9.method20678()) {
			local566++;
		}
		this.method30939(1984662039);
		this.method30930(1509972824);
		this.aClass570_24 = new Class570(Class279.aClass102_9, 9, 4, this.anInt5089 * 1562861633, this.anInt5092 * -332702719, local566, local558, Class279.aClass102_9.method20768() > 0);
		this.aClass570_24.method31540(false, 567884320);
		this.aClass570_24.method31538(client.anInt3448 * -1937637867, (byte) 12);
		this.aClass570_24.method31662(this.aHashMap10, (short) 3155);
		if (client.anInt3448 * -1937637867 == 0) {
			this.aClass570_24.method31539(null, 1846543539);
		} else {
			this.aClass570_24.method31539(Class108.aClass104_22, 1373963785);
		}
		this.aClass535_1 = new Class535();
		this.aFloat327 = -0.05F + (float) (Math.random() / 10.0D);
		this.aClass144_Sub1_1 = new Class144_Sub1(this.aClass570_24, this.aClass41_Sub3_9, 4, this.anInt5089 * 1562861633, this.anInt5092 * -332702719, false, this.aClass502_3, this.aClass665_2);
		this.aClass144_Sub1_1.method11922((byte) 21);
		this.aClass144_Sub1_1.anInt1386 = Class703.aClass80_Sub37_49.aClass165_Sub22_1.method16266(858735115) * 1350530535;
		this.aClass144_Sub1_1.aBoolean265 = Class703.aClass80_Sub37_49.aClass165_Sub13_1.method16080(-1661395891) == 2;
		this.aClass144_Sub1_1.aBoolean259 = Class703.aClass80_Sub37_49.aClass165_Sub4_1.method15896(1580764488) == 1;
		this.aClass144_Sub1_1.aBoolean262 = Class703.aClass80_Sub37_49.aClass165_Sub41_1.method16802((byte) -97) == 1;
		this.aClass144_Sub1_1.aBoolean261 = Class703.aClass80_Sub37_49.aClass165_Sub2_1.method15861(1423795933) == 1;
		if (this.aClass536_9.method30871((byte) -1)) {
			this.method30934(this.aClass144_Sub1_1, this.aByteArrayArray17, 1839491171);
		} else {
			this.method30933(this.aClass144_Sub1_1, this.aByteArrayArray17, 1470572612);
		}
		if (this.aBoolean893) {
			this.method31013(50, 2020880848);
		}
		this.aClass665_2.method33442(this.anInt5089 * 1562861633 >> 4, this.anInt5092 * -332702719 >> 4, (byte) -14);
		this.aClass665_2.method33366(this, (byte) -38);
		if (local558) {
			this.aClass570_24.method31540(true, 567884320);
			this.aClass144_Sub1_2 = new Class144_Sub1(this.aClass570_24, this.aClass41_Sub3_9, 1, this.anInt5089 * 1562861633, this.anInt5092 * -332702719, true, this.aClass502_3, this.aClass665_2);
			this.aClass144_Sub1_2.method11922((byte) -9);
			this.aClass144_Sub1_2.anInt1386 = Class703.aClass80_Sub37_49.aClass165_Sub22_1.method16266(608867968) * 1350530535;
			this.aClass144_Sub1_2.aBoolean265 = Class703.aClass80_Sub37_49.aClass165_Sub13_1.method16080(-43521905) == 2;
			this.aClass144_Sub1_2.aBoolean259 = Class703.aClass80_Sub37_49.aClass165_Sub4_1.method15896(1830317530) == 1;
			this.aClass144_Sub1_2.aBoolean262 = Class703.aClass80_Sub37_49.aClass165_Sub41_1.method16802((byte) 33) == 1;
			this.aClass144_Sub1_2.aBoolean261 = Class703.aClass80_Sub37_49.aClass165_Sub2_1.method15861(1423795933) == 1;
			if (this.aClass536_9.method30871((byte) -16)) {
				this.method30934(this.aClass144_Sub1_2, this.aByteArrayArray20, -1200882957);
				if (!this.aBoolean893) {
					Class249.method26348(true, 1883110513);
				}
			} else {
				this.method30933(this.aClass144_Sub1_2, this.aByteArrayArray20, 1470572612);
				if (!this.aBoolean893) {
					Class249.method26348(true, -1769984467);
				}
			}
			this.aClass144_Sub1_2.method11984(0, this.aClass144_Sub1_1.anIntArrayArrayArray14[0], (byte) 0);
			this.aClass144_Sub1_2.method11944(Class279.aClass102_9, null, 2055763211);
			this.aClass570_24.method31540(false, 567884320);
			if (this.aBoolean893) {
				this.method31013(50, 2061279334);
			}
		}
		this.aClass144_Sub1_1.method11944(Class279.aClass102_9, local558 ? this.aClass144_Sub1_2.anIntArrayArrayArray14 : (int[][][]) null, 2041914198);
		if (this.aClass536_9.method30871((byte) 71)) {
			if (!this.aBoolean893) {
				Class249.method26348(true, 1208224882);
			}
			this.method30958(this.aClass144_Sub1_1, this.aByteArrayArray18, 45165675);
		} else {
			if (!this.aBoolean893) {
				Class249.method26348(true, 56787064);
			}
			this.method30935(this.aClass144_Sub1_1, this.aByteArrayArray18, (byte) 124);
			if (this.aByteArrayArray19 != null) {
				this.method30937((byte) -60);
			}
		}
		if (!this.aBoolean893) {
			Class249.method26348(true, -837290042);
		}
		this.aClass144_Sub1_1.method11931(Class279.aClass102_9, local558 ? this.aClass570_24.aClass100Array2[0] : null, null, (short) -9390);
		if (this.aBoolean893) {
			this.method31013(75, 2084176475);
		}
		this.aClass144_Sub1_1.method12024(Class279.aClass102_9, false, 2090885565);
		if (this.aBoolean893) {
			this.method31013(75, 1998395010);
		}
		if (!this.aBoolean893) {
			Class249.method26348(true, 1768345403);
		}
		if (local558) {
			this.aClass570_24.method31540(true, 567884320);
			if (!this.aBoolean893) {
				Class249.method26348(true, 101050641);
			}
			if (this.aClass536_9.method30871((byte) 69)) {
				this.method30958(this.aClass144_Sub1_2, this.aByteArrayArray21, -974901289);
			} else {
				this.method30935(this.aClass144_Sub1_2, this.aByteArrayArray21, (byte) 40);
			}
			if (!this.aBoolean893) {
				Class249.method26348(true, 384686483);
			}
			this.aClass144_Sub1_2.method11931(Class279.aClass102_9, null, this.aClass570_24.aClass100Array3[0], (short) 7327);
			this.aClass144_Sub1_2.method12024(Class279.aClass102_9, true, 697722060);
			if (!this.aBoolean893) {
				Class249.method26348(true, 1554916818);
			}
			this.aClass570_24.method31540(false, 567884320);
			if (this.aBoolean893) {
				this.method31013(50, 2081447186);
			}
		}
		this.aClass144_Sub1_1.method11923((byte) -116);
		if (this.aClass144_Sub1_2 != null) {
			this.aClass144_Sub1_2.method11923((byte) -18);
		}
		this.aClass570_24.method31541(1728700029);
		if (this.aBoolean893) {
			Class303.method27111((byte) 23);
			while (!Class279.aClass102_9.method20757(263832171)) {
				this.method31013(1, 2084420170);
			}
		}
		@Pc(1166) boolean local1166 = false;
		if (this.aBoolean893) {
			@Pc(1171) Class539 local1171 = client.aClass539_1;
			this.method30918(local1171, 201895104);
			Class39.aClass540_1.method31043(local1171, -126079334);
			local1166 = true;
			Class303.method27111((byte) 106);
			@Pc(1187) Object local1187 = client.anObject14;
			synchronized (client.anObject14) {
				client.aBoolean721 = true;
				try {
					client.anObject14.wait();
				} catch (@Pc(1194) InterruptedException local1194) {
				}
			}
			client.aClass539_1 = this;
			local1171.method30930(-598154335);
			this.method30955(3, 1882279378);
			this.method30927(-475056245);
		} else {
			Class490.aClass263_13.method26519(1215046568);
			this.aClass665_2.method33401(2041454890);
			Class554.method25310(1986877070);
		}
		@Pc(1239) int local1239;
		for (local293 = 0; local293 < 4; local293++) {
			for (local320 = 0; local320 < this.anInt5089 * 1562861633; local320++) {
				for (local1239 = 0; local1239 < this.anInt5092 * -332702719; local1239++) {
					Class103_Sub23.method8700(local293, local320, local1239, (short) -29812);
				}
			}
		}
		for (local293 = 0; local293 < client.aClass574Array1.length; local293++) {
			if (client.aClass574Array1[local293] != null) {
				client.aClass574Array1[local293].method31748((byte) 2);
			}
		}
		Class643.method33027(-661834581);
		Class251.method26372(-1457552290);
		if (Class651.method33131(-1715690234) == Class544.aClass544_3 && client.aClass75_1.method1321((byte) 2) != null && client.anInt3433 * 1994758437 == 3) {
			@Pc(1296) Class80_Sub31 local1296 = Class623.method32440(Class443.aClass443_43, client.aClass75_1.aClass22_1, -191270971);
			local1296.aPacketBit_2.p4(1057001181);
			client.aClass75_1.method1325(local1296, (byte) -82);
		}
		if (!this.aClass536_9.method30871((byte) 87)) {
			local293 = (this.anInt5088 * 1050370503 - (this.anInt5089 * 1562861633 >> 4)) / 8;
			local320 = ((this.anInt5089 * 1562861633 >> 4) + this.anInt5088 * 1050370503) / 8;
			local1239 = (this.anInt5095 * 1595983967 - (this.anInt5092 * -332702719 >> 4)) / 8;
			@Pc(1366) int local1366 = (this.anInt5095 * 1595983967 + (this.anInt5092 * -332702719 >> 4)) / 8;
			for (@Pc(1370) int local1370 = local293 - 1; local1370 <= local320 + 1; local1370++) {
				for (@Pc(1379) int local1379 = local1239 - 1; local1379 <= local1366 + 1; local1379++) {
					if (local1370 < local293 || local1370 > local320 || local1379 < local1239 || local1379 > local1366) {
						Class325.aClass480_94.method29917(this.method30925(local1370, local1379, (byte) 4), (byte) -109);
					}
				}
			}
		}
		@Pc(1417) long local1417 = Class303.method27111((byte) 125) - this.aLong393 * -8057110165237688949L;
		if (client.anInt3433 * 1994758437 == 10) {
			Class604.method32148(4, 946775093);
		} else if (client.anInt3433 * 1994758437 == 6) {
			Class604.method32148(13, -1122312891);
		} else if (client.anInt3433 * 1994758437 == 16) {
			Class604.method32148(15, -400885285);
		} else if (client.anInt3433 * 1994758437 == 8) {
			Class604.method32148(0, 91833775);
		} else {
			Class604.method32148(18, 635549483);
			if (client.aClass75_1.method1321((byte) 2) != null) {
				@Pc(1466) Class80_Sub31 local1466 = Class623.method32440(Class443.aClass443_81, client.aClass75_1.aClass22_1, -191270971);
				local1466.aPacketBit_2.p4((int) local1417);
				client.aClass75_1.method1325(local1466, (byte) -62);
			}
		}
		if (this.aBoolean894) {
			Class294.method26961(Long.toString(Class303.method27111((byte) 106) - this.aLong392 * 7999054236944666629L), 1455295997);
			this.aBoolean894 = false;
		}
		if (local1166) {
			@Pc(1497) Object local1497 = client.anObject13;
			synchronized (client.anObject13) {
				client.anObject13.notify();
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!rw", name = "br", descriptor = "()I")
	public int method30942() {
		return 100 - this.anInt5098 * -298935620 / (this.anInt5096 * 2008818237);
	}

	@OriginalMember(owner = "client!rw", name = "bn", descriptor = "()I")
	public int method30943() {
		return 100 - this.anInt5098 * -298935620 / (this.anInt5096 * 2008818237);
	}

	@OriginalMember(owner = "client!rw", name = "ba", descriptor = "()I")
	public int method30944() {
		return 100 - this.anInt5098 * -298935620 / (this.anInt5096 * 2008818237);
	}

	@OriginalMember(owner = "client!rw", name = "bt", descriptor = "()Lclient!vw;")
	public Class626 method30945() {
		return this.aClass626_2;
	}

	@OriginalMember(owner = "client!rw", name = "bs", descriptor = "()Lclient!vw;")
	public Class626 method30946() {
		return this.aClass626_2;
	}

	@OriginalMember(owner = "client!rw", name = "bj", descriptor = "()I")
	public int method30947() {
		return this.anInt5089 * 1562861633;
	}

	@OriginalMember(owner = "client!rw", name = "by", descriptor = "()I")
	public int method30948() {
		return this.anInt5089 * 1562861633;
	}

	@OriginalMember(owner = "client!rw", name = "bi", descriptor = "()Lclient!te;")
	public Class570 method30949() {
		return this.aClass570_24;
	}

	@OriginalMember(owner = "client!rw", name = "bz", descriptor = "()Lclient!ty;")
	public Class587 method30950() {
		return this.aClass587_3;
	}

	@OriginalMember(owner = "client!rw", name = "be", descriptor = "()Lclient!ty;")
	public Class587 method30951() {
		return this.aClass587_3;
	}

	@OriginalMember(owner = "client!rw", name = "bh", descriptor = "()Lclient!rp;")
	public Class535 method30952() {
		return this.aClass535_1;
	}

	@OriginalMember(owner = "client!rw", name = "bv", descriptor = "()Lclient!rp;")
	public Class535 method30953() {
		return this.aClass535_1;
	}

	@OriginalMember(owner = "client!rw", name = "dp", descriptor = "(IIIZ)V")
	void method30954(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		if (client.anInt3541 * -1330995431 == 4) {
			if (this.aBoolean893) {
				throw new IllegalStateException();
			}
			client.anInt3541 = -119085189;
			client.anInt3461 = 2001457723;
		}
		if (!arg3 && arg0 == this.anInt5088 * 1050370503 && arg1 == this.anInt5095 * 1595983967) {
			return;
		}
		this.anInt5088 = arg0 * 936775671;
		this.anInt5095 = arg1 * 881562527;
		if (!this.aBoolean893) {
			Class604.method32148(arg2, 1429127681);
			Class92.method1878(Class60.aClass60_99.method1180(Class512.aClass719_3, 770129258), true, Class279.aClass102_9, Class709.aClass104_26, Class689.aClass15_13, 1965254900);
		}
		if (this.aClass626_2 == null) {
			this.aClass626_1 = new Class626(0, 0, 0);
		} else {
			this.aClass626_1 = this.aClass626_2;
		}
		this.aClass626_2 = new Class626(0, (this.anInt5088 * 1050370503 - (this.anInt5089 * 1562861633 >> 4)) * 8, (this.anInt5095 * 1595983967 - (this.anInt5092 * -332702719 >> 4)) * 8);
		this.aClass80_Sub1_Sub12_4 = Class159.method15338(this.aClass626_2.anInt5540 * -390642507 + this.anInt5089 * 1562861633 / 2, this.anInt5089 * 1562861633 / 2 + this.aClass626_2.anInt5537 * -894305615);
		this.aClass587_3 = null;
		this.aLong393 = -1390528405935974947L;
		if (!this.aBoolean893) {
			this.method30955(arg2, 1882279378);
		}
	}

	@OriginalMember(owner = "client!rw", name = "at", descriptor = "(II)V")
	void method30955(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) int local11 = this.aClass626_2.anInt5540 * -390642507 - this.aClass626_1.anInt5540 * -390642507;
		@Pc(23) int local23 = this.aClass626_2.anInt5537 * -894305615 - this.aClass626_1.anInt5537 * -894305615;
		@Pc(28) int local28;
		@Pc(46) int local46;
		@Pc(111) int local111;
		@Pc(118) int local118;
		if (arg0 == 3) {
			for (local28 = 0; local28 < client.anInt3452 * -340916049; local28++) {
				@Pc(37) Class80_Sub19 local37 = client.aClass80_Sub19Array1[local28];
				if (local37 != null) {
					@Pc(44) Class120_Sub1_Sub1_Sub1_Sub1 local44 = (Class120_Sub1_Sub1_Sub1_Sub1) local37.anObject5;
					for (local46 = 0; local46 < local44.anIntArray234.length; local46++) {
						local44.anIntArray234[local46] -= local11;
						local44.anIntArray242[local46] -= local23;
					}
					@Pc(74) Class463 local74 = Class463.method29472(local44.method24552().aClass463_61);
					local74.aFloat297 -= local11 * 512;
					local74.aFloat296 -= local23 * 512;
					local44.method24542(local74);
					local74.method29557();
				}
			}
		} else {
			@Pc(102) boolean local102 = false;
			client.anInt3453 = 0;
			local111 = this.anInt5089 * 1321239040 - 512;
			local118 = this.anInt5092 * 1454899712 - 512;
			for (local46 = 0; local46 < client.anInt3452 * -340916049; local46++) {
				@Pc(129) Class80_Sub19 local129 = client.aClass80_Sub19Array1[local46];
				if (local129 != null) {
					@Pc(135) Class120_Sub1_Sub1_Sub1_Sub1 local135 = (Class120_Sub1_Sub1_Sub1_Sub1) local129.anObject5;
					@Pc(140) Class463 local140 = Class463.method29472(local135.method24552().aClass463_61);
					local140.aFloat297 -= local11 * 512;
					local140.aFloat296 -= local23 * 512;
					local135.method24542(local140);
					if ((int) local140.aFloat297 >= 0 && (int) local140.aFloat297 <= local111 && (int) local140.aFloat296 >= 0 && (int) local140.aFloat296 <= local118) {
						@Pc(191) boolean local191 = true;
						for (@Pc(193) int local193 = 0; local193 < local135.anIntArray234.length; local193++) {
							local135.anIntArray234[local193] -= local11;
							local135.anIntArray242[local193] -= local23;
							if (local135.anIntArray234[local193] < 0 || local135.anIntArray234[local193] >= this.anInt5089 * 1562861633 || local135.anIntArray242[local193] < 0 || local135.anIntArray242[local193] >= this.anInt5092 * -332702719) {
								local191 = false;
							}
						}
						if (local191) {
							client.anIntArray304[(client.anInt3453 += 192683631) * -1702559601 - 1] = local135.anInt2671 * 1078276675;
						} else {
							local135.method18794(null, -1859555411);
							local129.method24395((byte) 81);
							local102 = true;
						}
					} else {
						local135.method18794(null, -1598025488);
						local129.method24395((byte) 46);
						local102 = true;
					}
					local140.method29557();
				}
			}
			if (local102) {
				client.anInt3452 = client.aClass24_18.method572(1607525571) * -382054833;
				local46 = 0;
				@Pc(290) Iterator local290 = client.aClass24_18.iterator();
				while (local290.hasNext()) {
					@Pc(297) Class80_Sub19 local297 = (Class80_Sub19) local290.next();
					client.aClass80_Sub19Array1[local46++] = local297;
				}
			}
		}
		for (local28 = 0; local28 < 2048; local28++) {
			@Pc(312) Class120_Sub1_Sub1_Sub1_Sub2 local312 = client.aClass120_Sub1_Sub1_Sub1_Sub2Array1[local28];
			if (local312 != null) {
				for (local118 = 0; local118 < local312.anIntArray234.length; local118++) {
					local312.anIntArray234[local118] -= local11;
					local312.anIntArray242[local118] -= local23;
				}
				@Pc(344) Class463 local344 = Class463.method29472(local312.method24552().aClass463_61);
				local344.aFloat297 -= local11 * 512;
				local344.aFloat296 -= local23 * 512;
				local312.method24542(local344);
				local344.method29557();
			}
		}
		@Pc(371) Class101[] local371 = client.aClass101Array1;
		for (local111 = 0; local111 < local371.length; local111++) {
			@Pc(381) Class101 local381 = local371[local111];
			if (local381 != null) {
				local381.anInt466 -= local11 * -1393234432;
				local381.anInt465 -= local23 * -102395392;
			}
		}
		@Pc(407) Class80_Sub8 local407;
		@Pc(436) Class625 local436;
		for (local407 = (Class80_Sub8) Class80_Sub8.aClass8_19.method247(129206984); local407 != null; local407 = (Class80_Sub8) Class80_Sub8.aClass8_19.method237(738485172)) {
			local407.anInt1476 -= local11 * 1808563737;
			local407.anInt1473 -= local23 * -1918091225;
			local436 = (Class625) this.aClass41_Sub3_9.method18054(local407.anInt1477 * -1290874527, 2003063322);
			if ((local407.anInt1480 * -1606480543 & 0x1) == 0) {
				local118 = local436.anInt5503 * 1462300569;
				local46 = local436.anInt5504 * -1951356049;
			} else {
				local118 = local436.anInt5504 * -1951356049;
				local46 = local436.anInt5503 * 1462300569;
			}
			if (this.aClass536_9 != Class536.aClass536_1 && (local407.anInt1476 * 781975081 + local118 <= 0 || local46 + local407.anInt1473 * -1479987305 <= 0 || local407.anInt1476 * 781975081 >= this.anInt5089 * 1562861633 || local407.anInt1473 * -1479987305 >= this.anInt5092 * -332702719)) {
				local407.method24395((byte) 9);
			}
		}
		for (local407 = (Class80_Sub8) Class80_Sub8.aClass8_20.method247(129206984); local407 != null; local407 = (Class80_Sub8) Class80_Sub8.aClass8_20.method237(-893706091)) {
			local407.anInt1476 -= local11 * 1808563737;
			local407.anInt1473 -= local23 * -1918091225;
			local436 = (Class625) this.aClass41_Sub3_9.method18054(local407.anInt1477 * -1290874527, -50092454);
			if ((local407.anInt1480 * -1606480543 & 0x1) == 0) {
				local118 = local436.anInt5503 * 1462300569;
				local46 = local436.anInt5504 * -1951356049;
			} else {
				local118 = local436.anInt5504 * -1951356049;
				local46 = local436.anInt5503 * 1462300569;
			}
			if (this.aClass536_9 != Class536.aClass536_1 && (local118 + local407.anInt1476 * 781975081 <= 0 || local46 + local407.anInt1473 * -1479987305 <= 0 || local407.anInt1476 * 781975081 >= this.anInt5089 * 1562861633 || local407.anInt1473 * -1479987305 >= this.anInt5092 * -332702719)) {
				local407.method24395((byte) 51);
			}
		}
		for (@Pc(622) Class80_Sub4 local622 = (Class80_Sub4) client.aClass24_22.method580((byte) -99); local622 != null; local622 = (Class80_Sub4) client.aClass24_22.method566((byte) 7)) {
			local118 = (int) (local622.aLong338 * 3209506792906532031L >> 28 & 0x3L);
			local46 = (int) (local622.aLong338 * 3209506792906532031L & 0x3FFFL);
			@Pc(651) int local651 = local46 - this.aClass626_2.anInt5540 * -390642507;
			@Pc(661) int local661 = (int) (local622.aLong338 * 3209506792906532031L >> 14 & 0x3FFFL);
			@Pc(669) int local669 = local661 - this.aClass626_2.anInt5537 * -894305615;
			if (this.aClass570_24 != null) {
				if (local651 >= 0 && local669 >= 0 && local651 < this.anInt5089 * 1562861633 && local669 < this.anInt5092 * -332702719 && local651 < this.aClass570_24.anInt5245 * 1487025827 && local669 < this.aClass570_24.anInt5246 * -1561777241) {
					if (this.aClass570_24.aClass568ArrayArrayArray1 != null) {
						this.aClass570_24.method31566(local118, local651, local669, (byte) 43);
					}
				} else if (this.aClass536_9 != Class536.aClass536_1) {
					local622.method24395((byte) 27);
				}
			}
		}
		if (Class27.anInt85 * 764713663 != 0) {
			Class27.anInt85 -= local11 * -1198271169;
			Class27.anInt88 -= local23 * -2069609469;
		}
		Class236.method26135(false, (short) 778);
		if (arg0 == 3) {
			client.anInt3479 -= local11 * 1231008256;
			client.anInt3480 -= local23 * -217284096;
			Class268.anInt3917 -= local11 * 1242622464;
			Class315.anInt4021 -= local23 * -696195584;
			if (Class368.anInt4502 * -1583611537 != 4 && Class368.anInt4502 * -1583611537 != 3) {
				Class151.method14543(Class676.method33586(1337081521), (byte) -42);
			}
		} else {
			Class28.anInt92 -= local11 * 590007769;
			Class244.anInt3863 -= local23 * -1410331595;
			Class606.anInt5395 -= local11 * -856571401;
			Class62.anInt214 -= local23 * -1939246685;
			Class89.anInt319 -= local11 * -1699208704;
			Class102_Sub2.anInt653 -= local23 * -1793139200;
			if (Math.abs(local11) > this.anInt5089 * 1562861633 || Math.abs(local23) > this.anInt5092 * -332702719) {
				this.aClass665_2.method33382(1268571358);
			}
		}
		Class474.method29881(-786006295);
		Class494.method30297(-500726862);
		client.aClass24_19.method564(-685650583);
		client.aClass8_49.method260(1694666467);
		client.aClass5_8.method89(1573178117);
		Class618.method32293((byte) 0);
	}

	@OriginalMember(owner = "client!rw", name = "bo", descriptor = "()I")
	public int method30956() {
		return this.anInt5091 * -94333811;
	}

	@OriginalMember(owner = "client!rw", name = "dt", descriptor = "()V")
	void method30957() {
		this.method30926(Class540.method31060(Class703.aClass80_Sub37_49.aClass165_Sub11_1.method16040((byte) 8), (byte) -88), -574181629);
		@Pc(14) int local14 = this.aClass626_2.anInt5540 * -390642507;
		@Pc(20) int local20 = this.aClass626_2.anInt5537 * -894305615;
		@Pc(30) int local30 = (local14 >> 3) + (Class89.anInt319 * 1749751025 >> 12);
		@Pc(40) int local40 = (Class102_Sub2.anInt653 * 1132703631 >> 12) + (local20 >> 3);
		Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aByte99 = 0;
		Class507.anInt5045 = 0;
		Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.method19063(8, 8, (byte) 3);
		@Pc(52) byte local52 = 18;
		this.anIntArray469 = new int[local52];
		this.anIntArray468 = new int[local52];
		this.aByteArrayArray17 = new byte[local52][];
		this.aByteArrayArray18 = new byte[local52][];
		this.aByteArrayArray19 = new byte[local52][];
		this.aByteArrayArray20 = new byte[local52][];
		this.aByteArrayArray21 = new byte[local52][];
		@Pc(82) int local82 = 0;
		for (@Pc(93) int local93 = (local30 - (this.anInt5089 * 1562861633 >> 4)) / 8; local93 <= ((this.anInt5089 * 1562861633 >> 4) + local30) / 8; local93++) {
			for (@Pc(116) int local116 = (local40 - (this.anInt5092 * -332702719 >> 4)) / 8; local116 <= ((this.anInt5092 * -332702719 >> 4) + local40) / 8; local116++) {
				@Pc(134) int local134 = (local93 << 8) + local116;
				if (Class325.aClass480_94.method29915(this.method30925(local93, local116, (byte) 4), Class514.aClass514_5.anInt5050 * 707246789, (byte) -81)) {
					this.anIntArray469[local82] = local134;
					this.anIntArray468[local82] = this.method30925(local93, local116, (byte) 4);
					local82++;
				}
			}
		}
		this.anInt5090 = local82 * -1781867357;
		@Pc(178) byte local178;
		if (client.anInt3433 * 1994758437 == 4) {
			local178 = 10;
		} else if (client.anInt3433 * 1994758437 == 15) {
			local178 = 16;
		} else if (client.anInt3433 * 1994758437 == 13) {
			local178 = 6;
		} else if (client.anInt3433 * 1994758437 == 0) {
			local178 = 8;
		} else {
			throw new RuntimeException("" + client.anInt3433 * 1994758437);
		}
		this.method30928(local30, local40, local178, false, (byte) -72);
	}

	@OriginalMember(owner = "client!rw", name = "ar", descriptor = "(Lclient!aiz;[[BI)V")
	void method30958(@OriginalArg(0) Class144_Sub1 arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < arg0.anInt1383 * -2108820349; local1++) {
			if (!this.aBoolean893) {
				Class490.aClass263_13.method26519(1987440600);
			}
			for (@Pc(15) int local15 = 0; local15 < this.anInt5089 * 1562861633 >> 3; local15++) {
				for (@Pc(25) int local25 = 0; local25 < this.anInt5092 * -332702719 >> 3; local25++) {
					@Pc(42) int local42 = this.anIntArrayArrayArray16[local1][local15][local25];
					if (local42 != -1) {
						@Pc(51) int local51 = local42 >> 24 & 0x3;
						if (!arg0.aBoolean260 || local51 == 0) {
							@Pc(62) int local62 = local42 >> 1 & 0x3;
							@Pc(68) int local68 = local42 >> 14 & 0x3FF;
							@Pc(74) int local74 = local42 >> 3 & 0x7FF;
							@Pc(84) int local84 = (local68 / 8 << 8) + local74 / 8;
							for (@Pc(86) int local86 = 0; local86 < this.anIntArray469.length; local86++) {
								if (local84 == this.anIntArray469[local86] && arg1[local86] != null) {
									arg0.method12023(Class279.aClass102_9, arg1[local86], local1, local15 * 8, local25 * 8, local51, (local68 & 0x7) * 8, (local74 & 0x7) * 8, local62, 749254486);
									break;
								}
							}
						}
					}
					if (this.aBoolean893) {
						this.method31013(5, 1988488417);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rw", name = "dc", descriptor = "()V")
	public void method30959() {
		if (this.aBoolean893) {
			this.method30914((byte) 27);
			this.aLong393 = -1390528405935974947L;
			@Pc(10) Class539 local10 = client.aClass539_1;
			this.anInt5090 = local10.anInt5090;
			this.anIntArray469 = local10.anIntArray469;
			this.anIntArray468 = local10.anIntArray468;
			this.aByteArrayArray17 = local10.aByteArrayArray17;
			this.aByteArrayArray18 = local10.aByteArrayArray18;
			this.aByteArrayArray19 = local10.aByteArrayArray19;
			this.aByteArrayArray20 = local10.aByteArrayArray20;
			this.aByteArrayArray21 = local10.aByteArrayArray21;
			this.aClass502_3 = local10.aClass502_3;
			this.aClass665_2 = local10.aClass665_2;
			this.anIntArrayArrayArray16 = local10.anIntArrayArrayArray16;
			this.anInt5091 = local10.anInt5091;
			this.anInt5087 = local10.anInt5087;
			this.aClass80_Sub1_Sub12_4 = local10.aClass80_Sub1_Sub12_4;
			this.aClass587_3 = local10.aClass587_3;
			this.anIntArrayArray60 = local10.anIntArrayArray60;
			this.anIntArrayArray61 = local10.anIntArrayArray61;
			this.aByteArrayArrayArray13 = local10.aByteArrayArrayArray13;
			this.aClass536_9 = local10.aClass536_9;
			this.aClass345_7 = local10.aClass345_7;
			this.aClass626_2 = local10.aClass626_2;
			this.aClass626_1 = local10.aClass626_1;
			this.anInt5088 = local10.anInt5088;
			this.anInt5095 = local10.anInt5095;
			this.anInt5089 = local10.anInt5089;
			this.anInt5092 = local10.anInt5092;
		} else if (client.anInt3433 * 1994758437 == 4) {
			Class604.method32148(10, -1785705470);
		} else if (client.anInt3433 * 1994758437 == 13) {
			Class604.method32148(6, -1398621632);
		} else if (client.anInt3433 * 1994758437 == 15) {
			Class604.method32148(16, -1410010231);
		} else if (client.anInt3433 * 1994758437 == 18) {
			Class604.method32148(3, 1218658584);
		} else if (client.anInt3433 * 1994758437 == 0) {
			Class604.method32148(8, 1794093088);
		}
	}

	@OriginalMember(owner = "client!rw", name = "z", descriptor = "(I)[[[B")
	public byte[][][] method30960(@OriginalArg(0) int arg0) {
		return this.aByteArrayArrayArray13;
	}

	@OriginalMember(owner = "client!rw", name = "ch", descriptor = "()[[I")
	public int[][] method30961() {
		return this.anIntArrayArray60;
	}

	@OriginalMember(owner = "client!rw", name = "cp", descriptor = "()V")
	public void method30962() {
		this.aClass626_2 = new Class626();
		this.anInt5095 = 0;
		this.anInt5088 = 0;
	}

	@OriginalMember(owner = "client!rw", name = "ck", descriptor = "([[[B)V")
	public void method30963(@OriginalArg(0) byte[][][] arg0) {
		this.aByteArrayArrayArray13 = arg0;
	}

	@OriginalMember(owner = "client!rw", name = "cy", descriptor = "()[[I")
	public int[][] method30964() {
		return this.anIntArrayArray60;
	}

	@OriginalMember(owner = "client!rw", name = "bd", descriptor = "()Lclient!xm;")
	public Class665 method30965() {
		return this.aClass665_2;
	}

	@OriginalMember(owner = "client!rw", name = "cd", descriptor = "()Lclient!xm;")
	public Class665 method30966() {
		return this.aClass665_2;
	}

	@OriginalMember(owner = "client!rw", name = "cv", descriptor = "()Lclient!aod;")
	public Class41_Sub3 method30967() {
		return this.aClass41_Sub3_9;
	}

	@OriginalMember(owner = "client!rw", name = "bc", descriptor = "()I")
	public int method30968() {
		return this.anInt5087 * -1309555077;
	}

	@OriginalMember(owner = "client!rw", name = "do", descriptor = "()V")
	void method30969() {
		if (Class536.aClass536_2 == this.aClass536_9 || Class536.aClass536_2 == this.aClass536_10) {
			return;
		}
		if (this.aClass536_9 == Class536.aClass536_3 || Class536.aClass536_5 == this.aClass536_9 || this.aClass536_10 != this.aClass536_9 && (Class536.aClass536_7 == this.aClass536_9 || this.aClass536_10 == Class536.aClass536_7)) {
			@Pc(32) Iterator local32 = client.aClass24_18.iterator();
			while (local32.hasNext()) {
				@Pc(39) Class80_Sub19 local39 = (Class80_Sub19) local32.next();
				Class599.method32051((Class120_Sub1_Sub1_Sub1_Sub1) local39.anObject5, (short) 14350);
			}
			client.anInt3453 = 0;
			client.anInt3452 = 0;
			client.aClass24_18.method564(-401845037);
		}
		this.aClass536_10 = this.aClass536_9;
	}

	@OriginalMember(owner = "client!rw", name = "cu", descriptor = "()[[I")
	public int[][] method30970() {
		return this.anIntArrayArray61;
	}

	@OriginalMember(owner = "client!rw", name = "bx", descriptor = "()I")
	public int method30971() {
		return this.anInt5087 * -1309555077;
	}

	@OriginalMember(owner = "client!rw", name = "cc", descriptor = "()[[I")
	public int[][] method30972() {
		return this.anIntArrayArray61;
	}

	@OriginalMember(owner = "client!rw", name = "bf", descriptor = "()I")
	public int method30973() {
		return this.anInt5087 * -1309555077;
	}

	@OriginalMember(owner = "client!rw", name = "di", descriptor = "(IIIZ)V")
	void method30974(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		if (client.anInt3541 * -1330995431 == 4) {
			if (this.aBoolean893) {
				throw new IllegalStateException();
			}
			client.anInt3541 = -119085189;
			client.anInt3461 = 2001457723;
		}
		if (!arg3 && arg0 == this.anInt5088 * 1050370503 && arg1 == this.anInt5095 * 1595983967) {
			return;
		}
		this.anInt5088 = arg0 * 936775671;
		this.anInt5095 = arg1 * 881562527;
		if (!this.aBoolean893) {
			Class604.method32148(arg2, 1658668547);
			Class92.method1878(Class60.aClass60_99.method1180(Class512.aClass719_3, -584218161), true, Class279.aClass102_9, Class709.aClass104_26, Class689.aClass15_13, 519013799);
		}
		if (this.aClass626_2 == null) {
			this.aClass626_1 = new Class626(0, 0, 0);
		} else {
			this.aClass626_1 = this.aClass626_2;
		}
		this.aClass626_2 = new Class626(0, (this.anInt5088 * 1050370503 - (this.anInt5089 * 1562861633 >> 4)) * 8, (this.anInt5095 * 1595983967 - (this.anInt5092 * -332702719 >> 4)) * 8);
		this.aClass80_Sub1_Sub12_4 = Class159.method15338(this.aClass626_2.anInt5540 * -390642507 + this.anInt5089 * 1562861633 / 2, this.anInt5089 * 1562861633 / 2 + this.aClass626_2.anInt5537 * -894305615);
		this.aClass587_3 = null;
		this.aLong393 = -1390528405935974947L;
		if (!this.aBoolean893) {
			this.method30955(arg2, 1882279378);
		}
	}

	@OriginalMember(owner = "client!rw", name = "bw", descriptor = "()I")
	public int method30975() {
		return this.anInt5087 * -1309555077;
	}

	@OriginalMember(owner = "client!rw", name = "bu", descriptor = "()Lclient!qc;")
	public Class502 method30976() {
		return this.aClass502_3;
	}

	@OriginalMember(owner = "client!rw", name = "cz", descriptor = "()V")
	public void method30977() {
		this.aClass665_2.method33380(this, null, 0, -778012101);
	}

	@OriginalMember(owner = "client!rw", name = "ca", descriptor = "()Lclient!aiz;")
	public Class144_Sub1 method30978() {
		return this.aClass144_Sub1_1;
	}

	@OriginalMember(owner = "client!rw", name = "de", descriptor = "(Lclient!asa;)V")
	void method30979(@OriginalArg(0) PacketBit arg0) {
		this.anInt5099 = arg0.g1_alt3() * 577448291;
		@Pc(10) int local10 = arg0.g2();
		@Pc(14) int local14 = arg0.g1_alt2();
		@Pc(23) boolean local23 = (local14 & 0x1) != 0;
		@Pc(27) int local27 = arg0.g1_alt2();
		if (local27 == 1) {
			this.aClass536_9 = Class536.aClass536_3;
		} else if (local27 == 2) {
			this.aClass536_9 = Class536.aClass536_4;
		} else if (local27 == 3) {
			this.aClass536_9 = Class536.aClass536_5;
		} else if (local27 == 4) {
			this.aClass536_9 = Class536.aClass536_1;
		}
		@Pc(58) int local58 = arg0.g2_alt2();
		@Pc(62) int local62 = arg0.g1_alt1();
		if (!this.aBoolean893) {
			this.method30927(-1590817918);
		}
		this.method30926(Class540.method31060(local62, (byte) -76), -574181629);
		arg0.method22560(1668075746);
		@Pc(81) HashSet local81 = new HashSet();
		@Pc(83) int local83;
		@Pc(88) int local88;
		@Pc(98) int local98;
		@Pc(111) int local111;
		@Pc(119) int local119;
		@Pc(134) int local134;
		@Pc(140) int local140;
		@Pc(150) int local150;
		for (local83 = 0; local83 < 4; local83++) {
			for (local88 = 0; local88 < this.anInt5089 * 1562861633 >> 3; local88++) {
				for (local98 = 0; local98 < this.anInt5092 * -332702719 >> 3; local98++) {
					local111 = arg0.method22559(1, -325783685);
					if (local111 == 1) {
						local119 = arg0.method22559(26, -325783685);
						this.anIntArrayArrayArray16[local83][local88][local98] = local119;
						local134 = local119 >> 14 & 0x3FF;
						local140 = local119 >> 3 & 0x7FF;
						local150 = local134 >> 3 << 8 | local140 >> 3;
						local81.add(local150);
					} else {
						this.anIntArrayArrayArray16[local83][local88][local98] = -1;
					}
				}
			}
		}
		arg0.method22568(957852371);
		local83 = local81.size();
		this.anIntArray469 = new int[local83];
		this.anIntArray468 = new int[local83];
		this.aByteArrayArray17 = new byte[local83][];
		this.aByteArrayArray18 = new byte[local83][];
		this.aByteArrayArray19 = null;
		this.aByteArrayArray20 = new byte[local83][];
		this.aByteArrayArray21 = new byte[local83][];
		local83 = 0;
		for (local88 = 0; local88 < 4; local88++) {
			for (local98 = 0; local98 < this.anInt5089 * 1562861633 >> 3; local98++) {
				for (local111 = 0; local111 < this.anInt5092 * -332702719 >> 3; local111++) {
					local119 = this.anIntArrayArrayArray16[local88][local98][local111];
					if (local119 != -1) {
						local134 = local119 >> 14 & 0x3FF;
						local140 = local119 >> 3 & 0x7FF;
						local150 = local140 / 8 + (local134 / 8 << 8);
						@Pc(268) int local268;
						for (local268 = 0; local268 < local83; local268++) {
							if (this.anIntArray469[local268] == local150) {
								local150 = -1;
								break;
							}
						}
						if (local150 != -1) {
							local268 = local150 >> 8 & 0xFF;
							@Pc(295) int local295 = local150 & 0xFF;
							if (Class325.aClass480_94.method29915(this.method30925(local268, local295, (byte) 4), Class514.aClass514_5.anInt5050 * 707246789, (byte) -117)) {
								this.anIntArray469[local83] = local150;
								this.anIntArray468[local83] = this.method30925(local268, local295, (byte) 4);
								local83++;
							}
						}
					}
				}
			}
		}
		this.anInt5090 = local83 * -1781867357;
		this.method30928(local58, local10, 3, local23, (byte) 66);
	}

	@OriginalMember(owner = "client!rw", name = "ci", descriptor = "(Lclient!aod;)V")
	public void method30980(@OriginalArg(0) Class41_Sub3 arg0) {
		this.aClass41_Sub3_9 = arg0;
	}

	@OriginalMember(owner = "client!rw", name = "cm", descriptor = "()V")
	public void method30981() {
		this.aClass626_2 = new Class626();
		this.anInt5095 = 0;
		this.anInt5088 = 0;
	}

	@OriginalMember(owner = "client!rw", name = "bm", descriptor = "()Lclient!qc;")
	public Class502 method30982() {
		return this.aClass502_3;
	}

	@OriginalMember(owner = "client!rw", name = "cg", descriptor = "()V")
	public void method30983() {
		this.aClass626_2 = new Class626();
		this.anInt5095 = 0;
		this.anInt5088 = 0;
	}

	@OriginalMember(owner = "client!rw", name = "cb", descriptor = "()V")
	public void method30984() {
		this.aClass626_2 = new Class626();
		this.anInt5095 = 0;
		this.anInt5088 = 0;
	}

	@OriginalMember(owner = "client!rw", name = "cw", descriptor = "()V")
	public void method30985() {
		if (this.aClass570_24 != null) {
			Class376.method28457(374230041);
			this.aHashMap10 = this.aClass570_24.method31595(-1740914384);
			this.aClass570_24.aClass582_1.method31824(-1058092021);
			this.aClass570_24 = null;
		}
	}

	@OriginalMember(owner = "client!rw", name = "cl", descriptor = "()V")
	public void method30986() {
		if (this.aClass570_24 != null) {
			Class376.method28457(-980415105);
			this.aHashMap10 = this.aClass570_24.method31595(-1386184858);
			this.aClass570_24.aClass582_1.method31824(-696206239);
			this.aClass570_24 = null;
		}
	}

	@OriginalMember(owner = "client!rw", name = "cx", descriptor = "(Z)V")
	public void method30987(@OriginalArg(0) boolean arg0) {
		@Pc(1) Class683 local1 = null;
		if (this.aClass665_2 != null && arg0) {
			local1 = this.aClass665_2.method33369(1901870538);
		}
		this.aClass665_2 = new Class665(Class279.aClass102_9, Class708.aClass480_136, this.anInt5089 * 1562861633 >> 3, this.anInt5092 * -332702719 >> 3);
		if (local1 != null) {
			this.aClass665_2.method33380(this, local1, 0, 958559484);
		}
	}

	@OriginalMember(owner = "client!rw", name = "cf", descriptor = "()V")
	public void method30988() {
		this.aClass665_2.method33380(this, null, 0, 1469729038);
	}

	@OriginalMember(owner = "client!rw", name = "co", descriptor = "()V")
	public void method30989() {
		this.aClass665_2.method33380(this, null, 0, 1590425626);
	}

	@OriginalMember(owner = "client!rw", name = "bl", descriptor = "()I")
	public int method30990() {
		return 100 - this.anInt5098 * -298935620 / (this.anInt5096 * 2008818237);
	}

	@OriginalMember(owner = "client!rw", name = "j", descriptor = "(I)F")
	public float method30991(@OriginalArg(0) int arg0) {
		return this.aFloat327;
	}

	@OriginalMember(owner = "client!rw", name = "eo", descriptor = "(I)V")
	void method30992(@OriginalArg(0) int arg0) {
		try {
			Thread.sleep((long) arg0);
		} catch (@Pc(4) InterruptedException local4) {
		}
	}

	@OriginalMember(owner = "client!rw", name = "bq", descriptor = "()Lclient!qc;")
	public Class502 method30993() {
		return this.aClass502_3;
	}

	@OriginalMember(owner = "client!rw", name = "dd", descriptor = "(Lclient!rw;)V")
	void method30994(@OriginalArg(0) Class539 arg0) {
		@Pc(2) boolean local2 = arg0.aBoolean893;
		arg0.aBoolean893 = this.aBoolean893;
		this.aBoolean893 = local2;
		@Pc(12) Class536 local12 = arg0.aClass536_10;
		arg0.aClass536_10 = this.aClass536_10;
		this.aClass536_10 = local12;
		arg0.aClass626_1 = this.aClass626_2;
		this.aClass626_1 = arg0.aClass626_2;
		this.aClass665_2.method33371(arg0.method30904((byte) -115), -648789505);
	}

	@OriginalMember(owner = "client!rw", name = "dy", descriptor = "(I)V")
	void method30995(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = this.aClass626_2.anInt5540 * -390642507 - this.aClass626_1.anInt5540 * -390642507;
		@Pc(23) int local23 = this.aClass626_2.anInt5537 * -894305615 - this.aClass626_1.anInt5537 * -894305615;
		@Pc(28) int local28;
		@Pc(46) int local46;
		@Pc(111) int local111;
		@Pc(118) int local118;
		if (arg0 == 3) {
			for (local28 = 0; local28 < client.anInt3452 * -340916049; local28++) {
				@Pc(37) Class80_Sub19 local37 = client.aClass80_Sub19Array1[local28];
				if (local37 != null) {
					@Pc(44) Class120_Sub1_Sub1_Sub1_Sub1 local44 = (Class120_Sub1_Sub1_Sub1_Sub1) local37.anObject5;
					for (local46 = 0; local46 < local44.anIntArray234.length; local46++) {
						local44.anIntArray234[local46] -= local11;
						local44.anIntArray242[local46] -= local23;
					}
					@Pc(74) Class463 local74 = Class463.method29472(local44.method24552().aClass463_61);
					local74.aFloat297 -= local11 * 512;
					local74.aFloat296 -= local23 * 512;
					local44.method24542(local74);
					local74.method29557();
				}
			}
		} else {
			@Pc(102) boolean local102 = false;
			client.anInt3453 = 0;
			local111 = this.anInt5089 * 1321239040 - 512;
			local118 = this.anInt5092 * 1454899712 - 512;
			for (local46 = 0; local46 < client.anInt3452 * -340916049; local46++) {
				@Pc(129) Class80_Sub19 local129 = client.aClass80_Sub19Array1[local46];
				if (local129 != null) {
					@Pc(135) Class120_Sub1_Sub1_Sub1_Sub1 local135 = (Class120_Sub1_Sub1_Sub1_Sub1) local129.anObject5;
					@Pc(140) Class463 local140 = Class463.method29472(local135.method24552().aClass463_61);
					local140.aFloat297 -= local11 * 512;
					local140.aFloat296 -= local23 * 512;
					local135.method24542(local140);
					if ((int) local140.aFloat297 >= 0 && (int) local140.aFloat297 <= local111 && (int) local140.aFloat296 >= 0 && (int) local140.aFloat296 <= local118) {
						@Pc(191) boolean local191 = true;
						for (@Pc(193) int local193 = 0; local193 < local135.anIntArray234.length; local193++) {
							local135.anIntArray234[local193] -= local11;
							local135.anIntArray242[local193] -= local23;
							if (local135.anIntArray234[local193] < 0 || local135.anIntArray234[local193] >= this.anInt5089 * 1562861633 || local135.anIntArray242[local193] < 0 || local135.anIntArray242[local193] >= this.anInt5092 * -332702719) {
								local191 = false;
							}
						}
						if (local191) {
							client.anIntArray304[(client.anInt3453 += 192683631) * -1702559601 - 1] = local135.anInt2671 * 1078276675;
						} else {
							local135.method18794(null, 265732938);
							local129.method24395((byte) 104);
							local102 = true;
						}
					} else {
						local135.method18794(null, -2063081202);
						local129.method24395((byte) 110);
						local102 = true;
					}
					local140.method29557();
				}
			}
			if (local102) {
				client.anInt3452 = client.aClass24_18.method572(-1166400704) * -382054833;
				local46 = 0;
				@Pc(290) Iterator local290 = client.aClass24_18.iterator();
				while (local290.hasNext()) {
					@Pc(297) Class80_Sub19 local297 = (Class80_Sub19) local290.next();
					client.aClass80_Sub19Array1[local46++] = local297;
				}
			}
		}
		for (local28 = 0; local28 < 2048; local28++) {
			@Pc(312) Class120_Sub1_Sub1_Sub1_Sub2 local312 = client.aClass120_Sub1_Sub1_Sub1_Sub2Array1[local28];
			if (local312 != null) {
				for (local118 = 0; local118 < local312.anIntArray234.length; local118++) {
					local312.anIntArray234[local118] -= local11;
					local312.anIntArray242[local118] -= local23;
				}
				@Pc(344) Class463 local344 = Class463.method29472(local312.method24552().aClass463_61);
				local344.aFloat297 -= local11 * 512;
				local344.aFloat296 -= local23 * 512;
				local312.method24542(local344);
				local344.method29557();
			}
		}
		@Pc(371) Class101[] local371 = client.aClass101Array1;
		for (local111 = 0; local111 < local371.length; local111++) {
			@Pc(381) Class101 local381 = local371[local111];
			if (local381 != null) {
				local381.anInt466 -= local11 * -1393234432;
				local381.anInt465 -= local23 * -102395392;
			}
		}
		@Pc(407) Class80_Sub8 local407;
		@Pc(436) Class625 local436;
		for (local407 = (Class80_Sub8) Class80_Sub8.aClass8_19.method247(129206984); local407 != null; local407 = (Class80_Sub8) Class80_Sub8.aClass8_19.method237(-1208294095)) {
			local407.anInt1476 -= local11 * 1808563737;
			local407.anInt1473 -= local23 * -1918091225;
			local436 = (Class625) this.aClass41_Sub3_9.method18054(local407.anInt1477 * -1290874527, 1991373518);
			if ((local407.anInt1480 * -1606480543 & 0x1) == 0) {
				local118 = local436.anInt5503 * 1462300569;
				local46 = local436.anInt5504 * -1951356049;
			} else {
				local118 = local436.anInt5504 * -1951356049;
				local46 = local436.anInt5503 * 1462300569;
			}
			if (this.aClass536_9 != Class536.aClass536_1 && (local407.anInt1476 * 781975081 + local118 <= 0 || local46 + local407.anInt1473 * -1479987305 <= 0 || local407.anInt1476 * 781975081 >= this.anInt5089 * 1562861633 || local407.anInt1473 * -1479987305 >= this.anInt5092 * -332702719)) {
				local407.method24395((byte) 18);
			}
		}
		for (local407 = (Class80_Sub8) Class80_Sub8.aClass8_20.method247(129206984); local407 != null; local407 = (Class80_Sub8) Class80_Sub8.aClass8_20.method237(660855229)) {
			local407.anInt1476 -= local11 * 1808563737;
			local407.anInt1473 -= local23 * -1918091225;
			local436 = (Class625) this.aClass41_Sub3_9.method18054(local407.anInt1477 * -1290874527, 1509522951);
			if ((local407.anInt1480 * -1606480543 & 0x1) == 0) {
				local118 = local436.anInt5503 * 1462300569;
				local46 = local436.anInt5504 * -1951356049;
			} else {
				local118 = local436.anInt5504 * -1951356049;
				local46 = local436.anInt5503 * 1462300569;
			}
			if (this.aClass536_9 != Class536.aClass536_1 && (local118 + local407.anInt1476 * 781975081 <= 0 || local46 + local407.anInt1473 * -1479987305 <= 0 || local407.anInt1476 * 781975081 >= this.anInt5089 * 1562861633 || local407.anInt1473 * -1479987305 >= this.anInt5092 * -332702719)) {
				local407.method24395((byte) 119);
			}
		}
		for (@Pc(622) Class80_Sub4 local622 = (Class80_Sub4) client.aClass24_22.method580((byte) -16); local622 != null; local622 = (Class80_Sub4) client.aClass24_22.method566((byte) 7)) {
			local118 = (int) (local622.aLong338 * 3209506792906532031L >> 28 & 0x3L);
			local46 = (int) (local622.aLong338 * 3209506792906532031L & 0x3FFFL);
			@Pc(651) int local651 = local46 - this.aClass626_2.anInt5540 * -390642507;
			@Pc(661) int local661 = (int) (local622.aLong338 * 3209506792906532031L >> 14 & 0x3FFFL);
			@Pc(669) int local669 = local661 - this.aClass626_2.anInt5537 * -894305615;
			if (this.aClass570_24 != null) {
				if (local651 >= 0 && local669 >= 0 && local651 < this.anInt5089 * 1562861633 && local669 < this.anInt5092 * -332702719 && local651 < this.aClass570_24.anInt5245 * 1487025827 && local669 < this.aClass570_24.anInt5246 * -1561777241) {
					if (this.aClass570_24.aClass568ArrayArrayArray1 != null) {
						this.aClass570_24.method31566(local118, local651, local669, (byte) 84);
					}
				} else if (this.aClass536_9 != Class536.aClass536_1) {
					local622.method24395((byte) 7);
				}
			}
		}
		if (Class27.anInt85 * 764713663 != 0) {
			Class27.anInt85 -= local11 * -1198271169;
			Class27.anInt88 -= local23 * -2069609469;
		}
		Class236.method26135(false, (short) 778);
		if (arg0 == 3) {
			client.anInt3479 -= local11 * 1231008256;
			client.anInt3480 -= local23 * -217284096;
			Class268.anInt3917 -= local11 * 1242622464;
			Class315.anInt4021 -= local23 * -696195584;
			if (Class368.anInt4502 * -1583611537 != 4 && Class368.anInt4502 * -1583611537 != 3) {
				Class151.method14543(Class676.method33586(803797237), (byte) -98);
			}
		} else {
			Class28.anInt92 -= local11 * 590007769;
			Class244.anInt3863 -= local23 * -1410331595;
			Class606.anInt5395 -= local11 * -856571401;
			Class62.anInt214 -= local23 * -1939246685;
			Class89.anInt319 -= local11 * -1699208704;
			Class102_Sub2.anInt653 -= local23 * -1793139200;
			if (Math.abs(local11) > this.anInt5089 * 1562861633 || Math.abs(local23) > this.anInt5092 * -332702719) {
				this.aClass665_2.method33382(1165007615);
			}
		}
		Class474.method29881(831414802);
		Class494.method30297(-500726862);
		client.aClass24_19.method564(32210993);
		client.aClass8_49.method260(524751090);
		client.aClass5_8.method89(965330038);
		Class618.method32293((byte) 0);
	}

	@OriginalMember(owner = "client!rw", name = "dn", descriptor = "()V")
	public void method30996() {
		if (this.aBoolean893) {
			this.method30914((byte) 25);
			this.aLong393 = -1390528405935974947L;
			@Pc(10) Class539 local10 = client.aClass539_1;
			this.anInt5090 = local10.anInt5090;
			this.anIntArray469 = local10.anIntArray469;
			this.anIntArray468 = local10.anIntArray468;
			this.aByteArrayArray17 = local10.aByteArrayArray17;
			this.aByteArrayArray18 = local10.aByteArrayArray18;
			this.aByteArrayArray19 = local10.aByteArrayArray19;
			this.aByteArrayArray20 = local10.aByteArrayArray20;
			this.aByteArrayArray21 = local10.aByteArrayArray21;
			this.aClass502_3 = local10.aClass502_3;
			this.aClass665_2 = local10.aClass665_2;
			this.anIntArrayArrayArray16 = local10.anIntArrayArrayArray16;
			this.anInt5091 = local10.anInt5091;
			this.anInt5087 = local10.anInt5087;
			this.aClass80_Sub1_Sub12_4 = local10.aClass80_Sub1_Sub12_4;
			this.aClass587_3 = local10.aClass587_3;
			this.anIntArrayArray60 = local10.anIntArrayArray60;
			this.anIntArrayArray61 = local10.anIntArrayArray61;
			this.aByteArrayArrayArray13 = local10.aByteArrayArrayArray13;
			this.aClass536_9 = local10.aClass536_9;
			this.aClass345_7 = local10.aClass345_7;
			this.aClass626_2 = local10.aClass626_2;
			this.aClass626_1 = local10.aClass626_1;
			this.anInt5088 = local10.anInt5088;
			this.anInt5095 = local10.anInt5095;
			this.anInt5089 = local10.anInt5089;
			this.anInt5092 = local10.anInt5092;
		} else if (client.anInt3433 * 1994758437 == 4) {
			Class604.method32148(10, 1468489519);
		} else if (client.anInt3433 * 1994758437 == 13) {
			Class604.method32148(6, 1785019969);
		} else if (client.anInt3433 * 1994758437 == 15) {
			Class604.method32148(16, -12370938);
		} else if (client.anInt3433 * 1994758437 == 18) {
			Class604.method32148(3, 1664805914);
		} else if (client.anInt3433 * 1994758437 == 0) {
			Class604.method32148(8, 186100409);
		}
	}

	@OriginalMember(owner = "client!rw", name = "cn", descriptor = "()Lclient!aod;")
	public Class41_Sub3 method30997() {
		return this.aClass41_Sub3_9;
	}

	@OriginalMember(owner = "client!rw", name = "dl", descriptor = "()V")
	public void method30998() {
		if (this.aBoolean893) {
			this.method30914((byte) 93);
			this.aLong393 = -1390528405935974947L;
			@Pc(10) Class539 local10 = client.aClass539_1;
			this.anInt5090 = local10.anInt5090;
			this.anIntArray469 = local10.anIntArray469;
			this.anIntArray468 = local10.anIntArray468;
			this.aByteArrayArray17 = local10.aByteArrayArray17;
			this.aByteArrayArray18 = local10.aByteArrayArray18;
			this.aByteArrayArray19 = local10.aByteArrayArray19;
			this.aByteArrayArray20 = local10.aByteArrayArray20;
			this.aByteArrayArray21 = local10.aByteArrayArray21;
			this.aClass502_3 = local10.aClass502_3;
			this.aClass665_2 = local10.aClass665_2;
			this.anIntArrayArrayArray16 = local10.anIntArrayArrayArray16;
			this.anInt5091 = local10.anInt5091;
			this.anInt5087 = local10.anInt5087;
			this.aClass80_Sub1_Sub12_4 = local10.aClass80_Sub1_Sub12_4;
			this.aClass587_3 = local10.aClass587_3;
			this.anIntArrayArray60 = local10.anIntArrayArray60;
			this.anIntArrayArray61 = local10.anIntArrayArray61;
			this.aByteArrayArrayArray13 = local10.aByteArrayArrayArray13;
			this.aClass536_9 = local10.aClass536_9;
			this.aClass345_7 = local10.aClass345_7;
			this.aClass626_2 = local10.aClass626_2;
			this.aClass626_1 = local10.aClass626_1;
			this.anInt5088 = local10.anInt5088;
			this.anInt5095 = local10.anInt5095;
			this.anInt5089 = local10.anInt5089;
			this.anInt5092 = local10.anInt5092;
		} else if (client.anInt3433 * 1994758437 == 4) {
			Class604.method32148(10, -583394862);
		} else if (client.anInt3433 * 1994758437 == 13) {
			Class604.method32148(6, 460748517);
		} else if (client.anInt3433 * 1994758437 == 15) {
			Class604.method32148(16, -420616276);
		} else if (client.anInt3433 * 1994758437 == 18) {
			Class604.method32148(3, -153158770);
		} else if (client.anInt3433 * 1994758437 == 0) {
			Class604.method32148(8, 383935378);
		}
	}

	@OriginalMember(owner = "client!rw", name = "as", descriptor = "()I")
	public int method30999() {
		return 100 - this.anInt5093 * -2011303044 / (this.anInt5094 * 2102272369);
	}

	@OriginalMember(owner = "client!rw", name = "bg", descriptor = "()I")
	public int method31000() {
		return 100 - this.anInt5093 * -2011303044 / (this.anInt5094 * 2102272369);
	}

	@OriginalMember(owner = "client!rw", name = "du", descriptor = "()V")
	void method31001() {
		this.method30926(Class540.method31060(Class703.aClass80_Sub37_49.aClass165_Sub11_1.method16040((byte) 8), (byte) -49), -574181629);
		@Pc(14) int local14 = this.aClass626_2.anInt5540 * -390642507;
		@Pc(20) int local20 = this.aClass626_2.anInt5537 * -894305615;
		@Pc(30) int local30 = (local14 >> 3) + (Class89.anInt319 * 1749751025 >> 12);
		@Pc(40) int local40 = (Class102_Sub2.anInt653 * 1132703631 >> 12) + (local20 >> 3);
		Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aByte99 = 0;
		Class507.anInt5045 = 0;
		Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.method19063(8, 8, (byte) 3);
		@Pc(52) byte local52 = 18;
		this.anIntArray469 = new int[local52];
		this.anIntArray468 = new int[local52];
		this.aByteArrayArray17 = new byte[local52][];
		this.aByteArrayArray18 = new byte[local52][];
		this.aByteArrayArray19 = new byte[local52][];
		this.aByteArrayArray20 = new byte[local52][];
		this.aByteArrayArray21 = new byte[local52][];
		@Pc(82) int local82 = 0;
		for (@Pc(93) int local93 = (local30 - (this.anInt5089 * 1562861633 >> 4)) / 8; local93 <= ((this.anInt5089 * 1562861633 >> 4) + local30) / 8; local93++) {
			for (@Pc(116) int local116 = (local40 - (this.anInt5092 * -332702719 >> 4)) / 8; local116 <= ((this.anInt5092 * -332702719 >> 4) + local40) / 8; local116++) {
				@Pc(134) int local134 = (local93 << 8) + local116;
				if (Class325.aClass480_94.method29915(this.method30925(local93, local116, (byte) 4), Class514.aClass514_5.anInt5050 * 707246789, (byte) -109)) {
					this.anIntArray469[local82] = local134;
					this.anIntArray468[local82] = this.method30925(local93, local116, (byte) 4);
					local82++;
				}
			}
		}
		this.anInt5090 = local82 * -1781867357;
		@Pc(178) byte local178;
		if (client.anInt3433 * 1994758437 == 4) {
			local178 = 10;
		} else if (client.anInt3433 * 1994758437 == 15) {
			local178 = 16;
		} else if (client.anInt3433 * 1994758437 == 13) {
			local178 = 6;
		} else if (client.anInt3433 * 1994758437 == 0) {
			local178 = 8;
		} else {
			throw new RuntimeException("" + client.anInt3433 * 1994758437);
		}
		this.method30928(local30, local40, local178, false, (byte) -19);
	}

	@OriginalMember(owner = "client!rw", name = "ds", descriptor = "()V")
	void method31002() {
		this.method30926(Class540.method31060(Class703.aClass80_Sub37_49.aClass165_Sub11_1.method16040((byte) 8), (byte) -62), -574181629);
		@Pc(14) int local14 = this.aClass626_2.anInt5540 * -390642507;
		@Pc(20) int local20 = this.aClass626_2.anInt5537 * -894305615;
		@Pc(30) int local30 = (local14 >> 3) + (Class89.anInt319 * 1749751025 >> 12);
		@Pc(40) int local40 = (Class102_Sub2.anInt653 * 1132703631 >> 12) + (local20 >> 3);
		Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aByte99 = 0;
		Class507.anInt5045 = 0;
		Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.method19063(8, 8, (byte) 3);
		@Pc(52) byte local52 = 18;
		this.anIntArray469 = new int[local52];
		this.anIntArray468 = new int[local52];
		this.aByteArrayArray17 = new byte[local52][];
		this.aByteArrayArray18 = new byte[local52][];
		this.aByteArrayArray19 = new byte[local52][];
		this.aByteArrayArray20 = new byte[local52][];
		this.aByteArrayArray21 = new byte[local52][];
		@Pc(82) int local82 = 0;
		for (@Pc(93) int local93 = (local30 - (this.anInt5089 * 1562861633 >> 4)) / 8; local93 <= ((this.anInt5089 * 1562861633 >> 4) + local30) / 8; local93++) {
			for (@Pc(116) int local116 = (local40 - (this.anInt5092 * -332702719 >> 4)) / 8; local116 <= ((this.anInt5092 * -332702719 >> 4) + local40) / 8; local116++) {
				@Pc(134) int local134 = (local93 << 8) + local116;
				if (Class325.aClass480_94.method29915(this.method30925(local93, local116, (byte) 4), Class514.aClass514_5.anInt5050 * 707246789, (byte) -27)) {
					this.anIntArray469[local82] = local134;
					this.anIntArray468[local82] = this.method30925(local93, local116, (byte) 4);
					local82++;
				}
			}
		}
		this.anInt5090 = local82 * -1781867357;
		@Pc(178) byte local178;
		if (client.anInt3433 * 1994758437 == 4) {
			local178 = 10;
		} else if (client.anInt3433 * 1994758437 == 15) {
			local178 = 16;
		} else if (client.anInt3433 * 1994758437 == 13) {
			local178 = 6;
		} else if (client.anInt3433 * 1994758437 == 0) {
			local178 = 8;
		} else {
			throw new RuntimeException("" + client.anInt3433 * 1994758437);
		}
		this.method30928(local30, local40, local178, false, (byte) -45);
	}

	@OriginalMember(owner = "client!rw", name = "dw", descriptor = "()V")
	void method31003() {
		this.method30926(Class540.method31060(Class703.aClass80_Sub37_49.aClass165_Sub11_1.method16040((byte) 8), (byte) -105), -574181629);
		@Pc(14) int local14 = this.aClass626_2.anInt5540 * -390642507;
		@Pc(20) int local20 = this.aClass626_2.anInt5537 * -894305615;
		@Pc(30) int local30 = (local14 >> 3) + (Class89.anInt319 * 1749751025 >> 12);
		@Pc(40) int local40 = (Class102_Sub2.anInt653 * 1132703631 >> 12) + (local20 >> 3);
		Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aByte99 = 0;
		Class507.anInt5045 = 0;
		Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.method19063(8, 8, (byte) 3);
		@Pc(52) byte local52 = 18;
		this.anIntArray469 = new int[local52];
		this.anIntArray468 = new int[local52];
		this.aByteArrayArray17 = new byte[local52][];
		this.aByteArrayArray18 = new byte[local52][];
		this.aByteArrayArray19 = new byte[local52][];
		this.aByteArrayArray20 = new byte[local52][];
		this.aByteArrayArray21 = new byte[local52][];
		@Pc(82) int local82 = 0;
		for (@Pc(93) int local93 = (local30 - (this.anInt5089 * 1562861633 >> 4)) / 8; local93 <= ((this.anInt5089 * 1562861633 >> 4) + local30) / 8; local93++) {
			for (@Pc(116) int local116 = (local40 - (this.anInt5092 * -332702719 >> 4)) / 8; local116 <= ((this.anInt5092 * -332702719 >> 4) + local40) / 8; local116++) {
				@Pc(134) int local134 = (local93 << 8) + local116;
				if (Class325.aClass480_94.method29915(this.method30925(local93, local116, (byte) 4), Class514.aClass514_5.anInt5050 * 707246789, (byte) -113)) {
					this.anIntArray469[local82] = local134;
					this.anIntArray468[local82] = this.method30925(local93, local116, (byte) 4);
					local82++;
				}
			}
		}
		this.anInt5090 = local82 * -1781867357;
		@Pc(178) byte local178;
		if (client.anInt3433 * 1994758437 == 4) {
			local178 = 10;
		} else if (client.anInt3433 * 1994758437 == 15) {
			local178 = 16;
		} else if (client.anInt3433 * 1994758437 == 13) {
			local178 = 6;
		} else if (client.anInt3433 * 1994758437 == 0) {
			local178 = 8;
		} else {
			throw new RuntimeException("" + client.anInt3433 * 1994758437);
		}
		this.method30928(local30, local40, local178, false, (byte) -1);
	}

	@OriginalMember(owner = "client!rw", name = "dr", descriptor = "(Lclient!asa;)V")
	void method31004(@OriginalArg(0) PacketBit arg0) {
		@Pc(3) int local3 = arg0.g1_alt1();
		@Pc(7) int local7 = arg0.g1();
		@Pc(11) int local11 = arg0.g2_alt2();
		@Pc(20) boolean local20 = arg0.g1_alt1() == 1;
		@Pc(24) int local24 = arg0.g2();
		this.anInt5099 = arg0.g1_alt1() * 577448291;
		if (!this.aBoolean893) {
			this.method30927(-1806104671);
		}
		this.method30926(Class540.method31060(local7, (byte) -63), -574181629);
		this.anIntArray469 = new int[local3];
		this.anIntArray468 = new int[local3];
		this.aByteArrayArray17 = new byte[local3][];
		this.aByteArrayArray18 = new byte[local3][];
		this.aByteArrayArray19 = null;
		this.aByteArrayArray20 = new byte[local3][];
		this.aByteArrayArray21 = new byte[local3][];
		local3 = 0;
		for (@Pc(84) int local84 = (local24 - (this.anInt5089 * 1562861633 >> 4)) / 8; local84 <= ((this.anInt5089 * 1562861633 >> 4) + local24) / 8; local84++) {
			for (@Pc(107) int local107 = (local11 - (this.anInt5092 * -332702719 >> 4)) / 8; local107 <= ((this.anInt5092 * -332702719 >> 4) + local11) / 8; local107++) {
				if (Class325.aClass480_94.method29915(this.method30925(local84, local107, (byte) 4), Class514.aClass514_5.anInt5050 * 707246789, (byte) -108)) {
					this.anIntArray469[local3] = local107 + (local84 << 8);
					this.anIntArray468[local3] = this.method30925(local84, local107, (byte) 4);
					local3++;
				}
			}
		}
		this.anInt5090 = local3 * -1781867357;
		this.method30928(local24, local11, 3, local20, (byte) -117);
	}

	@OriginalMember(owner = "client!rw", name = "df", descriptor = "()V")
	public void method31005() {
		if (this.aBoolean893) {
			this.method30914((byte) 96);
			this.aLong393 = -1390528405935974947L;
			@Pc(10) Class539 local10 = client.aClass539_1;
			this.anInt5090 = local10.anInt5090;
			this.anIntArray469 = local10.anIntArray469;
			this.anIntArray468 = local10.anIntArray468;
			this.aByteArrayArray17 = local10.aByteArrayArray17;
			this.aByteArrayArray18 = local10.aByteArrayArray18;
			this.aByteArrayArray19 = local10.aByteArrayArray19;
			this.aByteArrayArray20 = local10.aByteArrayArray20;
			this.aByteArrayArray21 = local10.aByteArrayArray21;
			this.aClass502_3 = local10.aClass502_3;
			this.aClass665_2 = local10.aClass665_2;
			this.anIntArrayArrayArray16 = local10.anIntArrayArrayArray16;
			this.anInt5091 = local10.anInt5091;
			this.anInt5087 = local10.anInt5087;
			this.aClass80_Sub1_Sub12_4 = local10.aClass80_Sub1_Sub12_4;
			this.aClass587_3 = local10.aClass587_3;
			this.anIntArrayArray60 = local10.anIntArrayArray60;
			this.anIntArrayArray61 = local10.anIntArrayArray61;
			this.aByteArrayArrayArray13 = local10.aByteArrayArrayArray13;
			this.aClass536_9 = local10.aClass536_9;
			this.aClass345_7 = local10.aClass345_7;
			this.aClass626_2 = local10.aClass626_2;
			this.aClass626_1 = local10.aClass626_1;
			this.anInt5088 = local10.anInt5088;
			this.anInt5095 = local10.anInt5095;
			this.anInt5089 = local10.anInt5089;
			this.anInt5092 = local10.anInt5092;
		} else if (client.anInt3433 * 1994758437 == 4) {
			Class604.method32148(10, -958635111);
		} else if (client.anInt3433 * 1994758437 == 13) {
			Class604.method32148(6, 1364634252);
		} else if (client.anInt3433 * 1994758437 == 15) {
			Class604.method32148(16, -1613101699);
		} else if (client.anInt3433 * 1994758437 == 18) {
			Class604.method32148(3, 1776640125);
		} else if (client.anInt3433 * 1994758437 == 0) {
			Class604.method32148(8, 1459086694);
		}
	}

	@OriginalMember(owner = "client!rw", name = "bk", descriptor = "()I")
	public int method31006() {
		return this.anInt5092 * -332702719;
	}

	@OriginalMember(owner = "client!rw", name = "dv", descriptor = "(Lclient!iq;)V")
	void method31007(@OriginalArg(0) Class345 arg0) {
		if (arg0 == this.aClass345_7) {
			return;
		}
		this.anInt5089 = (this.anInt5092 = arg0.anInt4248 * 623650969) * 437849025;
		this.anIntArrayArrayArray16 = new int[4][this.anInt5089 * 1562861633 >> 3][this.anInt5092 * -332702719 >> 3];
		this.anIntArrayArray60 = new int[this.anInt5089 * 1562861633][this.anInt5092 * -332702719];
		this.anIntArrayArray61 = new int[this.anInt5089 * 1562861633][this.anInt5092 * -332702719];
		this.aByteArrayArrayArray13 = new byte[4][this.anInt5089 * 1562861633][this.anInt5092 * -332702719];
		this.aClass502_3 = new Class502(4, this.anInt5089 * 1562861633, this.anInt5092 * -332702719);
		this.method30915(false, -1111226388);
		Class60.method1184(2134673857);
		this.aClass345_7 = arg0;
	}

	@OriginalMember(owner = "client!rw", name = "dm", descriptor = "(Lclient!iq;)V")
	void method31008(@OriginalArg(0) Class345 arg0) {
		if (arg0 == this.aClass345_7) {
			return;
		}
		this.anInt5089 = (this.anInt5092 = arg0.anInt4248 * 623650969) * 437849025;
		this.anIntArrayArrayArray16 = new int[4][this.anInt5089 * 1562861633 >> 3][this.anInt5092 * -332702719 >> 3];
		this.anIntArrayArray60 = new int[this.anInt5089 * 1562861633][this.anInt5092 * -332702719];
		this.anIntArrayArray61 = new int[this.anInt5089 * 1562861633][this.anInt5092 * -332702719];
		this.aByteArrayArrayArray13 = new byte[4][this.anInt5089 * 1562861633][this.anInt5092 * -332702719];
		this.aClass502_3 = new Class502(4, this.anInt5089 * 1562861633, this.anInt5092 * -332702719);
		this.method30915(false, -1291228505);
		Class60.method1184(2021582500);
		this.aClass345_7 = arg0;
	}

	@OriginalMember(owner = "client!rw", name = "dq", descriptor = "()V")
	void method31009() {
		if (Class536.aClass536_2 == this.aClass536_9 || Class536.aClass536_2 == this.aClass536_10) {
			return;
		}
		if (this.aClass536_9 == Class536.aClass536_3 || Class536.aClass536_5 == this.aClass536_9 || this.aClass536_10 != this.aClass536_9 && (Class536.aClass536_7 == this.aClass536_9 || this.aClass536_10 == Class536.aClass536_7)) {
			@Pc(32) Iterator local32 = client.aClass24_18.iterator();
			while (local32.hasNext()) {
				@Pc(39) Class80_Sub19 local39 = (Class80_Sub19) local32.next();
				Class599.method32051((Class120_Sub1_Sub1_Sub1_Sub1) local39.anObject5, (short) 6934);
			}
			client.anInt3453 = 0;
			client.anInt3452 = 0;
			client.aClass24_18.method564(695659755);
		}
		this.aClass536_10 = this.aClass536_9;
	}

	@OriginalMember(owner = "client!rw", name = "cr", descriptor = "()Lclient!aiz;")
	public Class144_Sub1 method31010() {
		return this.aClass144_Sub1_1;
	}

	@OriginalMember(owner = "client!rw", name = "i", descriptor = "(I)I")
	public int method31011(@OriginalArg(0) int arg0) {
		return this.anInt5092 * -332702719;
	}

	@OriginalMember(owner = "client!rw", name = "dj", descriptor = "(IIIZ)V")
	void method31012(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		if (client.anInt3541 * -1330995431 == 4) {
			if (this.aBoolean893) {
				throw new IllegalStateException();
			}
			client.anInt3541 = -119085189;
			client.anInt3461 = 2001457723;
		}
		if (!arg3 && arg0 == this.anInt5088 * 1050370503 && arg1 == this.anInt5095 * 1595983967) {
			return;
		}
		this.anInt5088 = arg0 * 936775671;
		this.anInt5095 = arg1 * 881562527;
		if (!this.aBoolean893) {
			Class604.method32148(arg2, -1049285370);
			Class92.method1878(Class60.aClass60_99.method1180(Class512.aClass719_3, -1860972200), true, Class279.aClass102_9, Class709.aClass104_26, Class689.aClass15_13, 1662802007);
		}
		if (this.aClass626_2 == null) {
			this.aClass626_1 = new Class626(0, 0, 0);
		} else {
			this.aClass626_1 = this.aClass626_2;
		}
		this.aClass626_2 = new Class626(0, (this.anInt5088 * 1050370503 - (this.anInt5089 * 1562861633 >> 4)) * 8, (this.anInt5095 * 1595983967 - (this.anInt5092 * -332702719 >> 4)) * 8);
		this.aClass80_Sub1_Sub12_4 = Class159.method15338(this.aClass626_2.anInt5540 * -390642507 + this.anInt5089 * 1562861633 / 2, this.anInt5089 * 1562861633 / 2 + this.aClass626_2.anInt5537 * -894305615);
		this.aClass587_3 = null;
		this.aLong393 = -1390528405935974947L;
		if (!this.aBoolean893) {
			this.method30955(arg2, 1882279378);
		}
	}

	@OriginalMember(owner = "client!rw", name = "an", descriptor = "(II)V")
	void method31013(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			Thread.sleep((long) arg0);
		} catch (@Pc(4) InterruptedException local4) {
		}
	}

	@OriginalMember(owner = "client!rw", name = "dz", descriptor = "(I)V")
	void method31014(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = this.aClass626_2.anInt5540 * -390642507 - this.aClass626_1.anInt5540 * -390642507;
		@Pc(23) int local23 = this.aClass626_2.anInt5537 * -894305615 - this.aClass626_1.anInt5537 * -894305615;
		@Pc(28) int local28;
		@Pc(46) int local46;
		@Pc(111) int local111;
		@Pc(118) int local118;
		if (arg0 == 3) {
			for (local28 = 0; local28 < client.anInt3452 * -340916049; local28++) {
				@Pc(37) Class80_Sub19 local37 = client.aClass80_Sub19Array1[local28];
				if (local37 != null) {
					@Pc(44) Class120_Sub1_Sub1_Sub1_Sub1 local44 = (Class120_Sub1_Sub1_Sub1_Sub1) local37.anObject5;
					for (local46 = 0; local46 < local44.anIntArray234.length; local46++) {
						local44.anIntArray234[local46] -= local11;
						local44.anIntArray242[local46] -= local23;
					}
					@Pc(74) Class463 local74 = Class463.method29472(local44.method24552().aClass463_61);
					local74.aFloat297 -= local11 * 512;
					local74.aFloat296 -= local23 * 512;
					local44.method24542(local74);
					local74.method29557();
				}
			}
		} else {
			@Pc(102) boolean local102 = false;
			client.anInt3453 = 0;
			local111 = this.anInt5089 * 1321239040 - 512;
			local118 = this.anInt5092 * 1454899712 - 512;
			for (local46 = 0; local46 < client.anInt3452 * -340916049; local46++) {
				@Pc(129) Class80_Sub19 local129 = client.aClass80_Sub19Array1[local46];
				if (local129 != null) {
					@Pc(135) Class120_Sub1_Sub1_Sub1_Sub1 local135 = (Class120_Sub1_Sub1_Sub1_Sub1) local129.anObject5;
					@Pc(140) Class463 local140 = Class463.method29472(local135.method24552().aClass463_61);
					local140.aFloat297 -= local11 * 512;
					local140.aFloat296 -= local23 * 512;
					local135.method24542(local140);
					if ((int) local140.aFloat297 >= 0 && (int) local140.aFloat297 <= local111 && (int) local140.aFloat296 >= 0 && (int) local140.aFloat296 <= local118) {
						@Pc(191) boolean local191 = true;
						for (@Pc(193) int local193 = 0; local193 < local135.anIntArray234.length; local193++) {
							local135.anIntArray234[local193] -= local11;
							local135.anIntArray242[local193] -= local23;
							if (local135.anIntArray234[local193] < 0 || local135.anIntArray234[local193] >= this.anInt5089 * 1562861633 || local135.anIntArray242[local193] < 0 || local135.anIntArray242[local193] >= this.anInt5092 * -332702719) {
								local191 = false;
							}
						}
						if (local191) {
							client.anIntArray304[(client.anInt3453 += 192683631) * -1702559601 - 1] = local135.anInt2671 * 1078276675;
						} else {
							local135.method18794(null, 828635016);
							local129.method24395((byte) 74);
							local102 = true;
						}
					} else {
						local135.method18794(null, 1359807566);
						local129.method24395((byte) 65);
						local102 = true;
					}
					local140.method29557();
				}
			}
			if (local102) {
				client.anInt3452 = client.aClass24_18.method572(1021944429) * -382054833;
				local46 = 0;
				@Pc(290) Iterator local290 = client.aClass24_18.iterator();
				while (local290.hasNext()) {
					@Pc(297) Class80_Sub19 local297 = (Class80_Sub19) local290.next();
					client.aClass80_Sub19Array1[local46++] = local297;
				}
			}
		}
		for (local28 = 0; local28 < 2048; local28++) {
			@Pc(312) Class120_Sub1_Sub1_Sub1_Sub2 local312 = client.aClass120_Sub1_Sub1_Sub1_Sub2Array1[local28];
			if (local312 != null) {
				for (local118 = 0; local118 < local312.anIntArray234.length; local118++) {
					local312.anIntArray234[local118] -= local11;
					local312.anIntArray242[local118] -= local23;
				}
				@Pc(344) Class463 local344 = Class463.method29472(local312.method24552().aClass463_61);
				local344.aFloat297 -= local11 * 512;
				local344.aFloat296 -= local23 * 512;
				local312.method24542(local344);
				local344.method29557();
			}
		}
		@Pc(371) Class101[] local371 = client.aClass101Array1;
		for (local111 = 0; local111 < local371.length; local111++) {
			@Pc(381) Class101 local381 = local371[local111];
			if (local381 != null) {
				local381.anInt466 -= local11 * -1393234432;
				local381.anInt465 -= local23 * -102395392;
			}
		}
		@Pc(407) Class80_Sub8 local407;
		@Pc(436) Class625 local436;
		for (local407 = (Class80_Sub8) Class80_Sub8.aClass8_19.method247(129206984); local407 != null; local407 = (Class80_Sub8) Class80_Sub8.aClass8_19.method237(647261001)) {
			local407.anInt1476 -= local11 * 1808563737;
			local407.anInt1473 -= local23 * -1918091225;
			local436 = (Class625) this.aClass41_Sub3_9.method18054(local407.anInt1477 * -1290874527, -858759661);
			if ((local407.anInt1480 * -1606480543 & 0x1) == 0) {
				local118 = local436.anInt5503 * 1462300569;
				local46 = local436.anInt5504 * -1951356049;
			} else {
				local118 = local436.anInt5504 * -1951356049;
				local46 = local436.anInt5503 * 1462300569;
			}
			if (this.aClass536_9 != Class536.aClass536_1 && (local407.anInt1476 * 781975081 + local118 <= 0 || local46 + local407.anInt1473 * -1479987305 <= 0 || local407.anInt1476 * 781975081 >= this.anInt5089 * 1562861633 || local407.anInt1473 * -1479987305 >= this.anInt5092 * -332702719)) {
				local407.method24395((byte) 75);
			}
		}
		for (local407 = (Class80_Sub8) Class80_Sub8.aClass8_20.method247(129206984); local407 != null; local407 = (Class80_Sub8) Class80_Sub8.aClass8_20.method237(-1582532540)) {
			local407.anInt1476 -= local11 * 1808563737;
			local407.anInt1473 -= local23 * -1918091225;
			local436 = (Class625) this.aClass41_Sub3_9.method18054(local407.anInt1477 * -1290874527, -413934584);
			if ((local407.anInt1480 * -1606480543 & 0x1) == 0) {
				local118 = local436.anInt5503 * 1462300569;
				local46 = local436.anInt5504 * -1951356049;
			} else {
				local118 = local436.anInt5504 * -1951356049;
				local46 = local436.anInt5503 * 1462300569;
			}
			if (this.aClass536_9 != Class536.aClass536_1 && (local118 + local407.anInt1476 * 781975081 <= 0 || local46 + local407.anInt1473 * -1479987305 <= 0 || local407.anInt1476 * 781975081 >= this.anInt5089 * 1562861633 || local407.anInt1473 * -1479987305 >= this.anInt5092 * -332702719)) {
				local407.method24395((byte) 110);
			}
		}
		for (@Pc(622) Class80_Sub4 local622 = (Class80_Sub4) client.aClass24_22.method580((byte) -47); local622 != null; local622 = (Class80_Sub4) client.aClass24_22.method566((byte) 7)) {
			local118 = (int) (local622.aLong338 * 3209506792906532031L >> 28 & 0x3L);
			local46 = (int) (local622.aLong338 * 3209506792906532031L & 0x3FFFL);
			@Pc(651) int local651 = local46 - this.aClass626_2.anInt5540 * -390642507;
			@Pc(661) int local661 = (int) (local622.aLong338 * 3209506792906532031L >> 14 & 0x3FFFL);
			@Pc(669) int local669 = local661 - this.aClass626_2.anInt5537 * -894305615;
			if (this.aClass570_24 != null) {
				if (local651 >= 0 && local669 >= 0 && local651 < this.anInt5089 * 1562861633 && local669 < this.anInt5092 * -332702719 && local651 < this.aClass570_24.anInt5245 * 1487025827 && local669 < this.aClass570_24.anInt5246 * -1561777241) {
					if (this.aClass570_24.aClass568ArrayArrayArray1 != null) {
						this.aClass570_24.method31566(local118, local651, local669, (byte) 87);
					}
				} else if (this.aClass536_9 != Class536.aClass536_1) {
					local622.method24395((byte) 30);
				}
			}
		}
		if (Class27.anInt85 * 764713663 != 0) {
			Class27.anInt85 -= local11 * -1198271169;
			Class27.anInt88 -= local23 * -2069609469;
		}
		Class236.method26135(false, (short) 778);
		if (arg0 == 3) {
			client.anInt3479 -= local11 * 1231008256;
			client.anInt3480 -= local23 * -217284096;
			Class268.anInt3917 -= local11 * 1242622464;
			Class315.anInt4021 -= local23 * -696195584;
			if (Class368.anInt4502 * -1583611537 != 4 && Class368.anInt4502 * -1583611537 != 3) {
				Class151.method14543(Class676.method33586(-1187396525), (byte) -106);
			}
		} else {
			Class28.anInt92 -= local11 * 590007769;
			Class244.anInt3863 -= local23 * -1410331595;
			Class606.anInt5395 -= local11 * -856571401;
			Class62.anInt214 -= local23 * -1939246685;
			Class89.anInt319 -= local11 * -1699208704;
			Class102_Sub2.anInt653 -= local23 * -1793139200;
			if (Math.abs(local11) > this.anInt5089 * 1562861633 || Math.abs(local23) > this.anInt5092 * -332702719) {
				this.aClass665_2.method33382(-618159313);
			}
		}
		Class474.method29881(-1375149623);
		Class494.method30297(-500726862);
		client.aClass24_19.method564(-2046714229);
		client.aClass8_49.method260(-725217341);
		client.aClass5_8.method89(1169399801);
		Class618.method32293((byte) 0);
	}

	@OriginalMember(owner = "client!rw", name = "db", descriptor = "(Lclient!rz;)V")
	public void method31015(@OriginalArg(0) Class542 arg0) {
		this.aClass536_9 = arg0.aClass536_11;
		if (Class536.aClass536_8 == this.aClass536_9) {
			this.method30892(1515617348);
		} else if (Class536.aClass536_7 == this.aClass536_9) {
			this.method30922(arg0.aPacketBit_3, (byte) 79);
		} else if (this.aClass536_9 == Class536.aClass536_2) {
			this.method30924(433253594);
		} else if (this.aClass536_9.method30871((byte) -12)) {
			this.method30923(arg0.aPacketBit_3, (byte) -127);
		}
	}

	@OriginalMember(owner = "client!rw", name = "da", descriptor = "(I)V")
	void method31016(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = this.aClass626_2.anInt5540 * -390642507 - this.aClass626_1.anInt5540 * -390642507;
		@Pc(23) int local23 = this.aClass626_2.anInt5537 * -894305615 - this.aClass626_1.anInt5537 * -894305615;
		@Pc(28) int local28;
		@Pc(46) int local46;
		@Pc(111) int local111;
		@Pc(118) int local118;
		if (arg0 == 3) {
			for (local28 = 0; local28 < client.anInt3452 * -340916049; local28++) {
				@Pc(37) Class80_Sub19 local37 = client.aClass80_Sub19Array1[local28];
				if (local37 != null) {
					@Pc(44) Class120_Sub1_Sub1_Sub1_Sub1 local44 = (Class120_Sub1_Sub1_Sub1_Sub1) local37.anObject5;
					for (local46 = 0; local46 < local44.anIntArray234.length; local46++) {
						local44.anIntArray234[local46] -= local11;
						local44.anIntArray242[local46] -= local23;
					}
					@Pc(74) Class463 local74 = Class463.method29472(local44.method24552().aClass463_61);
					local74.aFloat297 -= local11 * 512;
					local74.aFloat296 -= local23 * 512;
					local44.method24542(local74);
					local74.method29557();
				}
			}
		} else {
			@Pc(102) boolean local102 = false;
			client.anInt3453 = 0;
			local111 = this.anInt5089 * 1321239040 - 512;
			local118 = this.anInt5092 * 1454899712 - 512;
			for (local46 = 0; local46 < client.anInt3452 * -340916049; local46++) {
				@Pc(129) Class80_Sub19 local129 = client.aClass80_Sub19Array1[local46];
				if (local129 != null) {
					@Pc(135) Class120_Sub1_Sub1_Sub1_Sub1 local135 = (Class120_Sub1_Sub1_Sub1_Sub1) local129.anObject5;
					@Pc(140) Class463 local140 = Class463.method29472(local135.method24552().aClass463_61);
					local140.aFloat297 -= local11 * 512;
					local140.aFloat296 -= local23 * 512;
					local135.method24542(local140);
					if ((int) local140.aFloat297 >= 0 && (int) local140.aFloat297 <= local111 && (int) local140.aFloat296 >= 0 && (int) local140.aFloat296 <= local118) {
						@Pc(191) boolean local191 = true;
						for (@Pc(193) int local193 = 0; local193 < local135.anIntArray234.length; local193++) {
							local135.anIntArray234[local193] -= local11;
							local135.anIntArray242[local193] -= local23;
							if (local135.anIntArray234[local193] < 0 || local135.anIntArray234[local193] >= this.anInt5089 * 1562861633 || local135.anIntArray242[local193] < 0 || local135.anIntArray242[local193] >= this.anInt5092 * -332702719) {
								local191 = false;
							}
						}
						if (local191) {
							client.anIntArray304[(client.anInt3453 += 192683631) * -1702559601 - 1] = local135.anInt2671 * 1078276675;
						} else {
							local135.method18794(null, 813071213);
							local129.method24395((byte) 2);
							local102 = true;
						}
					} else {
						local135.method18794(null, -1671697589);
						local129.method24395((byte) 45);
						local102 = true;
					}
					local140.method29557();
				}
			}
			if (local102) {
				client.anInt3452 = client.aClass24_18.method572(-1118350591) * -382054833;
				local46 = 0;
				@Pc(290) Iterator local290 = client.aClass24_18.iterator();
				while (local290.hasNext()) {
					@Pc(297) Class80_Sub19 local297 = (Class80_Sub19) local290.next();
					client.aClass80_Sub19Array1[local46++] = local297;
				}
			}
		}
		for (local28 = 0; local28 < 2048; local28++) {
			@Pc(312) Class120_Sub1_Sub1_Sub1_Sub2 local312 = client.aClass120_Sub1_Sub1_Sub1_Sub2Array1[local28];
			if (local312 != null) {
				for (local118 = 0; local118 < local312.anIntArray234.length; local118++) {
					local312.anIntArray234[local118] -= local11;
					local312.anIntArray242[local118] -= local23;
				}
				@Pc(344) Class463 local344 = Class463.method29472(local312.method24552().aClass463_61);
				local344.aFloat297 -= local11 * 512;
				local344.aFloat296 -= local23 * 512;
				local312.method24542(local344);
				local344.method29557();
			}
		}
		@Pc(371) Class101[] local371 = client.aClass101Array1;
		for (local111 = 0; local111 < local371.length; local111++) {
			@Pc(381) Class101 local381 = local371[local111];
			if (local381 != null) {
				local381.anInt466 -= local11 * -1393234432;
				local381.anInt465 -= local23 * -102395392;
			}
		}
		@Pc(407) Class80_Sub8 local407;
		@Pc(436) Class625 local436;
		for (local407 = (Class80_Sub8) Class80_Sub8.aClass8_19.method247(129206984); local407 != null; local407 = (Class80_Sub8) Class80_Sub8.aClass8_19.method237(-845075261)) {
			local407.anInt1476 -= local11 * 1808563737;
			local407.anInt1473 -= local23 * -1918091225;
			local436 = (Class625) this.aClass41_Sub3_9.method18054(local407.anInt1477 * -1290874527, -163273651);
			if ((local407.anInt1480 * -1606480543 & 0x1) == 0) {
				local118 = local436.anInt5503 * 1462300569;
				local46 = local436.anInt5504 * -1951356049;
			} else {
				local118 = local436.anInt5504 * -1951356049;
				local46 = local436.anInt5503 * 1462300569;
			}
			if (this.aClass536_9 != Class536.aClass536_1 && (local407.anInt1476 * 781975081 + local118 <= 0 || local46 + local407.anInt1473 * -1479987305 <= 0 || local407.anInt1476 * 781975081 >= this.anInt5089 * 1562861633 || local407.anInt1473 * -1479987305 >= this.anInt5092 * -332702719)) {
				local407.method24395((byte) 95);
			}
		}
		for (local407 = (Class80_Sub8) Class80_Sub8.aClass8_20.method247(129206984); local407 != null; local407 = (Class80_Sub8) Class80_Sub8.aClass8_20.method237(-315150047)) {
			local407.anInt1476 -= local11 * 1808563737;
			local407.anInt1473 -= local23 * -1918091225;
			local436 = (Class625) this.aClass41_Sub3_9.method18054(local407.anInt1477 * -1290874527, 1246951267);
			if ((local407.anInt1480 * -1606480543 & 0x1) == 0) {
				local118 = local436.anInt5503 * 1462300569;
				local46 = local436.anInt5504 * -1951356049;
			} else {
				local118 = local436.anInt5504 * -1951356049;
				local46 = local436.anInt5503 * 1462300569;
			}
			if (this.aClass536_9 != Class536.aClass536_1 && (local118 + local407.anInt1476 * 781975081 <= 0 || local46 + local407.anInt1473 * -1479987305 <= 0 || local407.anInt1476 * 781975081 >= this.anInt5089 * 1562861633 || local407.anInt1473 * -1479987305 >= this.anInt5092 * -332702719)) {
				local407.method24395((byte) 46);
			}
		}
		for (@Pc(622) Class80_Sub4 local622 = (Class80_Sub4) client.aClass24_22.method580((byte) -54); local622 != null; local622 = (Class80_Sub4) client.aClass24_22.method566((byte) 7)) {
			local118 = (int) (local622.aLong338 * 3209506792906532031L >> 28 & 0x3L);
			local46 = (int) (local622.aLong338 * 3209506792906532031L & 0x3FFFL);
			@Pc(651) int local651 = local46 - this.aClass626_2.anInt5540 * -390642507;
			@Pc(661) int local661 = (int) (local622.aLong338 * 3209506792906532031L >> 14 & 0x3FFFL);
			@Pc(669) int local669 = local661 - this.aClass626_2.anInt5537 * -894305615;
			if (this.aClass570_24 != null) {
				if (local651 >= 0 && local669 >= 0 && local651 < this.anInt5089 * 1562861633 && local669 < this.anInt5092 * -332702719 && local651 < this.aClass570_24.anInt5245 * 1487025827 && local669 < this.aClass570_24.anInt5246 * -1561777241) {
					if (this.aClass570_24.aClass568ArrayArrayArray1 != null) {
						this.aClass570_24.method31566(local118, local651, local669, (byte) 47);
					}
				} else if (this.aClass536_9 != Class536.aClass536_1) {
					local622.method24395((byte) 17);
				}
			}
		}
		if (Class27.anInt85 * 764713663 != 0) {
			Class27.anInt85 -= local11 * -1198271169;
			Class27.anInt88 -= local23 * -2069609469;
		}
		Class236.method26135(false, (short) 778);
		if (arg0 == 3) {
			client.anInt3479 -= local11 * 1231008256;
			client.anInt3480 -= local23 * -217284096;
			Class268.anInt3917 -= local11 * 1242622464;
			Class315.anInt4021 -= local23 * -696195584;
			if (Class368.anInt4502 * -1583611537 != 4 && Class368.anInt4502 * -1583611537 != 3) {
				Class151.method14543(Class676.method33586(-425442089), (byte) -3);
			}
		} else {
			Class28.anInt92 -= local11 * 590007769;
			Class244.anInt3863 -= local23 * -1410331595;
			Class606.anInt5395 -= local11 * -856571401;
			Class62.anInt214 -= local23 * -1939246685;
			Class89.anInt319 -= local11 * -1699208704;
			Class102_Sub2.anInt653 -= local23 * -1793139200;
			if (Math.abs(local11) > this.anInt5089 * 1562861633 || Math.abs(local23) > this.anInt5092 * -332702719) {
				this.aClass665_2.method33382(-739398448);
			}
		}
		Class474.method29881(1055115507);
		Class494.method30297(-500726862);
		client.aClass24_19.method564(-2003270691);
		client.aClass8_49.method260(-438639527);
		client.aClass5_8.method89(1131753576);
		Class618.method32293((byte) 0);
	}

	@OriginalMember(owner = "client!rw", name = "dk", descriptor = "()V")
	void method31017() {
		this.aClass144_Sub1_2 = null;
		this.aClass144_Sub1_1 = null;
		if (this.aClass502_3 != null) {
			this.aClass502_3.method30427(7150873);
		}
		if (this.aClass665_2 != null) {
			this.aClass665_2.method33377(-1296276070);
		}
		if (this.aClass570_24 != null) {
			this.aClass570_24.aClass582_1.method31824(-709041511);
			this.aClass570_24 = null;
		}
	}

	@OriginalMember(owner = "client!rw", name = "ec", descriptor = "()V")
	void method31018() {
		this.aClass144_Sub1_2 = null;
		this.aClass144_Sub1_1 = null;
		if (this.aClass502_3 != null) {
			this.aClass502_3.method30427(584075921);
		}
		if (this.aClass665_2 != null) {
			this.aClass665_2.method33377(1290465227);
		}
		if (this.aClass570_24 != null) {
			this.aClass570_24.aClass582_1.method31824(219279783);
			this.aClass570_24 = null;
		}
	}

	@OriginalMember(owner = "client!rw", name = "ev", descriptor = "()V")
	void method31019() {
		this.aClass144_Sub1_2 = null;
		this.aClass144_Sub1_1 = null;
		if (this.aClass502_3 != null) {
			this.aClass502_3.method30427(1433526484);
		}
		if (this.aClass665_2 != null) {
			this.aClass665_2.method33377(1373307195);
		}
		if (this.aClass570_24 != null) {
			this.aClass570_24.aClass582_1.method31824(-784230810);
			this.aClass570_24 = null;
		}
	}

	@OriginalMember(owner = "client!rw", name = "ed", descriptor = "()Z")
	public boolean method31020() {
		if (!this.aBoolean893) {
			Class249.method26348(false, -1844651223);
		}
		if (-8057110165237688949L * this.aLong393 == -1L) {
			this.aLong393 = Class303.method27111((byte) 98) * 1390528405935974947L;
		}
		this.anInt5093 = 0;
		@Pc(23) int local23;
		for (local23 = 0; local23 < this.anInt5090 * -97470709; local23++) {
			if (!Class325.aClass480_94.method29975(this.anIntArray468[local23], -1403081456)) {
				this.anInt5093 += 1133586951;
			}
		}
		if (this.aClass587_3 == null) {
			if (this.aClass80_Sub1_Sub12_4 == null || !Class310.aClass480_93.method29972(this.aClass80_Sub1_Sub12_4.aString108, 246546972)) {
				this.aClass587_3 = new Class587(0);
			} else if (Class310.aClass480_93.method29987(this.aClass80_Sub1_Sub12_4.aString108, 1779540233)) {
				this.aClass587_3 = Class498.method30359(Class310.aClass480_93, this.aClass80_Sub1_Sub12_4.aString108, client.aBoolean732, (byte) -1);
			} else {
				this.anInt5093 += 1133586951;
			}
		}
		if (this.anInt5093 * 581182391 > 0) {
			if (this.anInt5094 * 2102272369 < this.anInt5093 * 581182391) {
				this.anInt5094 = this.anInt5093 * -87555161;
			}
			this.aClass530_5 = Class530.aClass530_4;
			return false;
		}
		for (local23 = 0; local23 < this.anInt5090 * -97470709; local23++) {
			if (this.aByteArrayArray17[local23] == null) {
				this.aByteArrayArray17[local23] = Class325.aClass480_94.method29918(this.anIntArray468[local23], Class514.aClass514_5.anInt5050 * 707246789, 1896589581);
			}
			if (this.aByteArrayArray18[local23] == null) {
				this.aByteArrayArray18[local23] = Class325.aClass480_94.method29918(this.anIntArray468[local23], Class514.aClass514_9.anInt5050 * 707246789, 1896589581);
			}
			if (this.aByteArrayArray20[local23] == null) {
				this.aByteArrayArray20[local23] = Class325.aClass480_94.method29918(this.anIntArray468[local23], Class514.aClass514_2.anInt5050 * 707246789, 1896589581);
			}
			if (this.aByteArrayArray21[local23] == null) {
				this.aByteArrayArray21[local23] = Class325.aClass480_94.method29918(this.anIntArray468[local23], Class514.aClass514_1.anInt5050 * 707246789, 1896589581);
			}
			if (this.aByteArrayArray19 != null && this.aByteArrayArray19[local23] == null) {
				this.aByteArrayArray19[local23] = Class325.aClass480_94.method29918(this.anIntArray468[local23], Class514.aClass514_3.anInt5050 * 707246789, 1896589581);
			}
		}
		local23 = this.anInt5098 * 856004103;
		@Pc(240) Class669 local240 = new Class669(-1);
		@Pc(245) Class669 local245 = new Class669(-1);
		this.anInt5098 = 0;
		@Pc(250) int local250;
		@Pc(293) int local293;
		@Pc(320) int local320;
		for (local250 = 0; local250 < this.anInt5090 * -97470709; local250++) {
			@Pc(261) byte[] local261 = this.aByteArrayArray18[local250];
			@Pc(278) int local278;
			if (local261 != null) {
				local278 = (this.anIntArray469[local250] >> 8) * 64 - this.aClass626_2.anInt5540 * -390642507;
				local293 = (this.anIntArray469[local250] & 0xFF) * 64 - this.aClass626_2.anInt5537 * -894305615;
				if (this.aClass536_9.method30871((byte) -3)) {
					local278 = 10;
					local293 = 10;
				}
				local320 = Class368.method28295(this.aClass41_Sub3_9, local261, local278, local293, this.anInt5089 * 1562861633, this.anInt5092 * -332702719, local245, local240, -1369353315);
				if (local320 > 0) {
					this.anInt5098 += local320 * -361236553;
				}
			}
			local261 = this.aByteArrayArray21[local250];
			if (local261 != null) {
				local278 = (this.anIntArray469[local250] >> 8) * 64 - this.aClass626_2.anInt5540 * -390642507;
				local293 = (this.anIntArray469[local250] & 0xFF) * 64 - this.aClass626_2.anInt5537 * -894305615;
				if (this.aClass536_9.method30871((byte) -66)) {
					local278 = 10;
					local293 = 10;
				}
				local320 = Class368.method28295(this.aClass41_Sub3_9, local261, local278, local293, this.anInt5089 * 1562861633, this.anInt5092 * -332702719, local245, local240, 1748500382);
				if (local320 > 0) {
					this.anInt5098 += local320 * -361236553;
				}
			}
		}
		if (this.anInt5098 * 856004103 > 0) {
			if (this.anInt5098 * 856004103 != local23) {
				this.anInt5097 = client.anInt3436 * -1358506661;
			} else if (this.anInt5097 * 2059752147 != 0 && client.anInt3436 - this.anInt5097 * 2059752147 == 1000) {
				Class33.method739(local245.anInt5711 * 1757747911, local240.anInt5711 * 1757747911, this.anInt5098 * 856004103, -369572300);
				Class245.method26321(-1109893460);
			}
			if (this.anInt5096 * 2008818237 < this.anInt5098 * 856004103) {
				this.anInt5096 = this.anInt5098 * -713723501;
			}
			this.aClass530_5 = Class530.aClass530_3;
			return false;
		}
		if (!this.aBoolean893 && Class530.aClass530_1 != this.aClass530_5) {
			Class92.method1878(Class60.aClass60_99.method1180(Class512.aClass719_3, -471785689) + Class256.aString161 + "(100%)", true, Class279.aClass102_9, Class709.aClass104_26, Class689.aClass15_13, 863536242);
		}
		this.aClass530_5 = Class530.aClass530_2;
		if (!this.aBoolean893 && Class490.aClass263_13 != null) {
			Class490.aClass263_13.method26519(906729096);
		}
		if (!this.aBoolean893) {
			for (local250 = 0; local250 < 2048; local250++) {
				@Pc(523) Class120_Sub1_Sub1_Sub1_Sub2 local523 = client.aClass120_Sub1_Sub1_Sub1_Sub2Array1[local250];
				if (local523 != null) {
					local523.aClass570_23 = null;
				}
			}
			for (local250 = 0; local250 < client.aClass80_Sub19Array1.length; local250++) {
				@Pc(541) Class80_Sub19 local541 = client.aClass80_Sub19Array1[local250];
				if (local541 != null) {
					((Class120_Sub1) local541.anObject5).aClass570_23 = null;
				}
			}
		}
		if (!this.aBoolean893) {
			Class92.method1877(true, -1420286146);
		}
		@Pc(558) boolean local558 = false;
		@Pc(566) int local566;
		if (Class703.aClass80_Sub37_49.aClass165_Sub13_1.method16080(-1297729639) == 2) {
			for (local566 = 0; local566 < this.anInt5090 * -97470709; local566++) {
				if (this.aByteArrayArray21[local566] != null || this.aByteArrayArray20[local566] != null) {
					local558 = true;
					break;
				}
			}
		}
		local566 = Class15.method424(Class703.aClass80_Sub37_49.aClass165_Sub39_1.method16764(1628215267), 2014628216).anInt4194 * 2134757080;
		if (Class279.aClass102_9.method20678()) {
			local566++;
		}
		this.method30939(1984662039);
		this.method30930(1366420624);
		this.aClass570_24 = new Class570(Class279.aClass102_9, 9, 4, this.anInt5089 * 1562861633, this.anInt5092 * -332702719, local566, local558, Class279.aClass102_9.method20768() > 0);
		this.aClass570_24.method31540(false, 567884320);
		this.aClass570_24.method31538(client.anInt3448 * -1937637867, (byte) -22);
		this.aClass570_24.method31662(this.aHashMap10, (short) 11334);
		if (client.anInt3448 * -1937637867 == 0) {
			this.aClass570_24.method31539(null, 1486870397);
		} else {
			this.aClass570_24.method31539(Class108.aClass104_22, 1687731116);
		}
		this.aClass535_1 = new Class535();
		this.aFloat327 = -0.05F + (float) (Math.random() / 10.0D);
		this.aClass144_Sub1_1 = new Class144_Sub1(this.aClass570_24, this.aClass41_Sub3_9, 4, this.anInt5089 * 1562861633, this.anInt5092 * -332702719, false, this.aClass502_3, this.aClass665_2);
		this.aClass144_Sub1_1.method11922((byte) -4);
		this.aClass144_Sub1_1.anInt1386 = Class703.aClass80_Sub37_49.aClass165_Sub22_1.method16266(-713915162) * 1350530535;
		this.aClass144_Sub1_1.aBoolean265 = Class703.aClass80_Sub37_49.aClass165_Sub13_1.method16080(750520887) == 2;
		this.aClass144_Sub1_1.aBoolean259 = Class703.aClass80_Sub37_49.aClass165_Sub4_1.method15896(1454813637) == 1;
		this.aClass144_Sub1_1.aBoolean262 = Class703.aClass80_Sub37_49.aClass165_Sub41_1.method16802((byte) 88) == 1;
		this.aClass144_Sub1_1.aBoolean261 = Class703.aClass80_Sub37_49.aClass165_Sub2_1.method15861(1423795933) == 1;
		if (this.aClass536_9.method30871((byte) -47)) {
			this.method30934(this.aClass144_Sub1_1, this.aByteArrayArray17, -144660333);
		} else {
			this.method30933(this.aClass144_Sub1_1, this.aByteArrayArray17, 1470572612);
		}
		if (this.aBoolean893) {
			this.method31013(50, 2131222974);
		}
		this.aClass665_2.method33442(this.anInt5089 * 1562861633 >> 4, this.anInt5092 * -332702719 >> 4, (byte) -67);
		this.aClass665_2.method33366(this, (byte) -18);
		if (local558) {
			this.aClass570_24.method31540(true, 567884320);
			this.aClass144_Sub1_2 = new Class144_Sub1(this.aClass570_24, this.aClass41_Sub3_9, 1, this.anInt5089 * 1562861633, this.anInt5092 * -332702719, true, this.aClass502_3, this.aClass665_2);
			this.aClass144_Sub1_2.method11922((byte) 101);
			this.aClass144_Sub1_2.anInt1386 = Class703.aClass80_Sub37_49.aClass165_Sub22_1.method16266(906632803) * 1350530535;
			this.aClass144_Sub1_2.aBoolean265 = Class703.aClass80_Sub37_49.aClass165_Sub13_1.method16080(646676984) == 2;
			this.aClass144_Sub1_2.aBoolean259 = Class703.aClass80_Sub37_49.aClass165_Sub4_1.method15896(1872183855) == 1;
			this.aClass144_Sub1_2.aBoolean262 = Class703.aClass80_Sub37_49.aClass165_Sub41_1.method16802((byte) -5) == 1;
			this.aClass144_Sub1_2.aBoolean261 = Class703.aClass80_Sub37_49.aClass165_Sub2_1.method15861(1423795933) == 1;
			if (this.aClass536_9.method30871((byte) 44)) {
				this.method30934(this.aClass144_Sub1_2, this.aByteArrayArray20, -32931505);
				if (!this.aBoolean893) {
					Class249.method26348(true, -1762802648);
				}
			} else {
				this.method30933(this.aClass144_Sub1_2, this.aByteArrayArray20, 1470572612);
				if (!this.aBoolean893) {
					Class249.method26348(true, 920036118);
				}
			}
			this.aClass144_Sub1_2.method11984(0, this.aClass144_Sub1_1.anIntArrayArrayArray14[0], (byte) 0);
			this.aClass144_Sub1_2.method11944(Class279.aClass102_9, null, 1993090820);
			this.aClass570_24.method31540(false, 567884320);
			if (this.aBoolean893) {
				this.method31013(50, 1998385895);
			}
		}
		this.aClass144_Sub1_1.method11944(Class279.aClass102_9, local558 ? this.aClass144_Sub1_2.anIntArrayArrayArray14 : (int[][][]) null, 1969490442);
		if (this.aClass536_9.method30871((byte) -66)) {
			if (!this.aBoolean893) {
				Class249.method26348(true, -41045054);
			}
			this.method30958(this.aClass144_Sub1_1, this.aByteArrayArray18, 539308775);
		} else {
			if (!this.aBoolean893) {
				Class249.method26348(true, -1377140344);
			}
			this.method30935(this.aClass144_Sub1_1, this.aByteArrayArray18, (byte) 31);
			if (this.aByteArrayArray19 != null) {
				this.method30937((byte) -5);
			}
		}
		if (!this.aBoolean893) {
			Class249.method26348(true, 2083096195);
		}
		this.aClass144_Sub1_1.method11931(Class279.aClass102_9, local558 ? this.aClass570_24.aClass100Array2[0] : null, null, (short) -32225);
		if (this.aBoolean893) {
			this.method31013(75, 2091170440);
		}
		this.aClass144_Sub1_1.method12024(Class279.aClass102_9, false, 1381086991);
		if (this.aBoolean893) {
			this.method31013(75, 1990119481);
		}
		if (!this.aBoolean893) {
			Class249.method26348(true, 435175364);
		}
		if (local558) {
			this.aClass570_24.method31540(true, 567884320);
			if (!this.aBoolean893) {
				Class249.method26348(true, -2005133783);
			}
			if (this.aClass536_9.method30871((byte) -30)) {
				this.method30958(this.aClass144_Sub1_2, this.aByteArrayArray21, -245766825);
			} else {
				this.method30935(this.aClass144_Sub1_2, this.aByteArrayArray21, (byte) 32);
			}
			if (!this.aBoolean893) {
				Class249.method26348(true, 1674945825);
			}
			this.aClass144_Sub1_2.method11931(Class279.aClass102_9, null, this.aClass570_24.aClass100Array3[0], (short) -6661);
			this.aClass144_Sub1_2.method12024(Class279.aClass102_9, true, 1878985615);
			if (!this.aBoolean893) {
				Class249.method26348(true, 1142079078);
			}
			this.aClass570_24.method31540(false, 567884320);
			if (this.aBoolean893) {
				this.method31013(50, 2054201344);
			}
		}
		this.aClass144_Sub1_1.method11923((byte) -3);
		if (this.aClass144_Sub1_2 != null) {
			this.aClass144_Sub1_2.method11923((byte) -58);
		}
		this.aClass570_24.method31541(1221749237);
		if (this.aBoolean893) {
			Class303.method27111((byte) 8);
			while (!Class279.aClass102_9.method20757(319993543)) {
				this.method31013(1, 2126622399);
			}
		}
		@Pc(1166) boolean local1166 = false;
		if (this.aBoolean893) {
			@Pc(1171) Class539 local1171 = client.aClass539_1;
			this.method30918(local1171, 950763370);
			Class39.aClass540_1.method31043(local1171, -126079334);
			local1166 = true;
			Class303.method27111((byte) 66);
			@Pc(1187) Object local1187 = client.anObject14;
			synchronized (client.anObject14) {
				client.aBoolean721 = true;
				try {
					client.anObject14.wait();
				} catch (@Pc(1194) InterruptedException local1194) {
				}
			}
			client.aClass539_1 = this;
			local1171.method30930(-217727870);
			this.method30955(3, 1882279378);
			this.method30927(-2034225023);
		} else {
			Class490.aClass263_13.method26519(1743216675);
			this.aClass665_2.method33401(-2016519259);
			Class554.method25310(1986877070);
		}
		@Pc(1239) int local1239;
		for (local293 = 0; local293 < 4; local293++) {
			for (local320 = 0; local320 < this.anInt5089 * 1562861633; local320++) {
				for (local1239 = 0; local1239 < this.anInt5092 * -332702719; local1239++) {
					Class103_Sub23.method8700(local293, local320, local1239, (short) -27518);
				}
			}
		}
		for (local293 = 0; local293 < client.aClass574Array1.length; local293++) {
			if (client.aClass574Array1[local293] != null) {
				client.aClass574Array1[local293].method31748((byte) 2);
			}
		}
		Class643.method33027(-2131901426);
		Class251.method26372(-1505773572);
		if (Class651.method33131(-71090104) == Class544.aClass544_3 && client.aClass75_1.method1321((byte) 2) != null && client.anInt3433 * 1994758437 == 3) {
			@Pc(1296) Class80_Sub31 local1296 = Class623.method32440(Class443.aClass443_43, client.aClass75_1.aClass22_1, -191270971);
			local1296.aPacketBit_2.p4(1057001181);
			client.aClass75_1.method1325(local1296, (byte) -87);
		}
		if (!this.aClass536_9.method30871((byte) -50)) {
			local293 = (this.anInt5088 * 1050370503 - (this.anInt5089 * 1562861633 >> 4)) / 8;
			local320 = ((this.anInt5089 * 1562861633 >> 4) + this.anInt5088 * 1050370503) / 8;
			local1239 = (this.anInt5095 * 1595983967 - (this.anInt5092 * -332702719 >> 4)) / 8;
			@Pc(1366) int local1366 = (this.anInt5095 * 1595983967 + (this.anInt5092 * -332702719 >> 4)) / 8;
			for (@Pc(1370) int local1370 = local293 - 1; local1370 <= local320 + 1; local1370++) {
				for (@Pc(1379) int local1379 = local1239 - 1; local1379 <= local1366 + 1; local1379++) {
					if (local1370 < local293 || local1370 > local320 || local1379 < local1239 || local1379 > local1366) {
						Class325.aClass480_94.method29917(this.method30925(local1370, local1379, (byte) 4), (byte) -89);
					}
				}
			}
		}
		@Pc(1417) long local1417 = Class303.method27111((byte) 57) - this.aLong393 * -8057110165237688949L;
		if (client.anInt3433 * 1994758437 == 10) {
			Class604.method32148(4, 323203092);
		} else if (client.anInt3433 * 1994758437 == 6) {
			Class604.method32148(13, -2081799799);
		} else if (client.anInt3433 * 1994758437 == 16) {
			Class604.method32148(15, 412796125);
		} else if (client.anInt3433 * 1994758437 == 8) {
			Class604.method32148(0, -756957492);
		} else {
			Class604.method32148(18, 81180721);
			if (client.aClass75_1.method1321((byte) 2) != null) {
				@Pc(1466) Class80_Sub31 local1466 = Class623.method32440(Class443.aClass443_81, client.aClass75_1.aClass22_1, -191270971);
				local1466.aPacketBit_2.p4((int) local1417);
				client.aClass75_1.method1325(local1466, (byte) -91);
			}
		}
		if (this.aBoolean894) {
			Class294.method26961(Long.toString(Class303.method27111((byte) 112) - this.aLong392 * 7999054236944666629L), 1455295997);
			this.aBoolean894 = false;
		}
		if (local1166) {
			@Pc(1497) Object local1497 = client.anObject13;
			synchronized (client.anObject13) {
				client.anObject13.notify();
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!rw", name = "az", descriptor = "()Lclient!rr;")
	public Class536 method31021() {
		return this.aClass536_9;
	}

	@OriginalMember(owner = "client!rw", name = "ep", descriptor = "(I)V")
	void method31022(@OriginalArg(0) int arg0) {
		try {
			Thread.sleep((long) arg0);
		} catch (@Pc(4) InterruptedException local4) {
		}
	}

	@OriginalMember(owner = "client!rw", name = "ew", descriptor = "(Lclient!aiz;[[B)V")
	void method31023(@OriginalArg(0) Class144_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		@Pc(2) int local2 = arg1.length;
		@Pc(4) int local4;
		for (local4 = 0; local4 < local2; local4++) {
			@Pc(11) byte[] local11 = arg1[local4];
			if (local11 != null) {
				@Pc(19) Packet local19 = new Packet(local11);
				@Pc(26) int local26 = this.anIntArray469[local4] >> 8;
				@Pc(33) int local33 = this.anIntArray469[local4] & 0xFF;
				@Pc(43) int local43 = local26 * 64 - this.aClass626_2.anInt5540 * -390642507;
				@Pc(53) int local53 = local33 * 64 - this.aClass626_2.anInt5537 * -894305615;
				if (!this.aBoolean893 && Class490.aClass263_13 != null) {
					Class490.aClass263_13.method26519(1109050374);
				}
				arg0.method11926(local19, local43, local53, this.aClass626_2.anInt5540 * -390642507, this.aClass626_2.anInt5537 * -894305615, 1861611398);
				arg0.method11998(Class279.aClass102_9, local19, local43, local53, -1137256781);
			}
		}
		for (local4 = 0; local4 < local2; local4++) {
			@Pc(106) int local106 = (this.anIntArray469[local4] >> 8) * 64 - this.aClass626_2.anInt5540 * -390642507;
			@Pc(121) int local121 = (this.anIntArray469[local4] & 0xFF) * 64 - this.aClass626_2.anInt5537 * -894305615;
			@Pc(125) byte[] local125 = arg1[local4];
			if (local125 == null && this.anInt5095 * 1595983967 < 800) {
				if (!this.aBoolean893 && Class490.aClass263_13 != null) {
					Class490.aClass263_13.method26519(1346433180);
				}
				arg0.method11982(local106, local121, 64, 64, -922459632);
			}
		}
	}

	@OriginalMember(owner = "client!rw", name = "ee", descriptor = "(Lclient!aiz;[[B)V")
	void method31024(@OriginalArg(0) Class144_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		@Pc(2) int local2 = arg1.length;
		@Pc(4) int local4;
		for (local4 = 0; local4 < local2; local4++) {
			@Pc(11) byte[] local11 = arg1[local4];
			if (local11 != null) {
				@Pc(19) Packet local19 = new Packet(local11);
				@Pc(26) int local26 = this.anIntArray469[local4] >> 8;
				@Pc(33) int local33 = this.anIntArray469[local4] & 0xFF;
				@Pc(43) int local43 = local26 * 64 - this.aClass626_2.anInt5540 * -390642507;
				@Pc(53) int local53 = local33 * 64 - this.aClass626_2.anInt5537 * -894305615;
				if (!this.aBoolean893 && Class490.aClass263_13 != null) {
					Class490.aClass263_13.method26519(1426071420);
				}
				arg0.method11926(local19, local43, local53, this.aClass626_2.anInt5540 * -390642507, this.aClass626_2.anInt5537 * -894305615, 1861611398);
				arg0.method11998(Class279.aClass102_9, local19, local43, local53, -1137256781);
			}
		}
		for (local4 = 0; local4 < local2; local4++) {
			@Pc(106) int local106 = (this.anIntArray469[local4] >> 8) * 64 - this.aClass626_2.anInt5540 * -390642507;
			@Pc(121) int local121 = (this.anIntArray469[local4] & 0xFF) * 64 - this.aClass626_2.anInt5537 * -894305615;
			@Pc(125) byte[] local125 = arg1[local4];
			if (local125 == null && this.anInt5095 * 1595983967 < 800) {
				if (!this.aBoolean893 && Class490.aClass263_13 != null) {
					Class490.aClass263_13.method26519(1086826021);
				}
				arg0.method11982(local106, local121, 64, 64, -2091320194);
			}
		}
	}

	@OriginalMember(owner = "client!rw", name = "ef", descriptor = "(Lclient!aiz;[[B)V")
	void method31025(@OriginalArg(0) Class144_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		@Pc(2) int local2 = arg1.length;
		@Pc(4) int local4;
		for (local4 = 0; local4 < local2; local4++) {
			@Pc(11) byte[] local11 = arg1[local4];
			if (local11 != null) {
				@Pc(19) Packet local19 = new Packet(local11);
				@Pc(26) int local26 = this.anIntArray469[local4] >> 8;
				@Pc(33) int local33 = this.anIntArray469[local4] & 0xFF;
				@Pc(43) int local43 = local26 * 64 - this.aClass626_2.anInt5540 * -390642507;
				@Pc(53) int local53 = local33 * 64 - this.aClass626_2.anInt5537 * -894305615;
				if (!this.aBoolean893 && Class490.aClass263_13 != null) {
					Class490.aClass263_13.method26519(1266269174);
				}
				arg0.method11926(local19, local43, local53, this.aClass626_2.anInt5540 * -390642507, this.aClass626_2.anInt5537 * -894305615, 1861611398);
				arg0.method11998(Class279.aClass102_9, local19, local43, local53, -1137256781);
			}
		}
		for (local4 = 0; local4 < local2; local4++) {
			@Pc(106) int local106 = (this.anIntArray469[local4] >> 8) * 64 - this.aClass626_2.anInt5540 * -390642507;
			@Pc(121) int local121 = (this.anIntArray469[local4] & 0xFF) * 64 - this.aClass626_2.anInt5537 * -894305615;
			@Pc(125) byte[] local125 = arg1[local4];
			if (local125 == null && this.anInt5095 * 1595983967 < 800) {
				if (!this.aBoolean893 && Class490.aClass263_13 != null) {
					Class490.aClass263_13.method26519(1234133458);
				}
				arg0.method11982(local106, local121, 64, 64, -1182285397);
			}
		}
	}

	@OriginalMember(owner = "client!rw", name = "ez", descriptor = "(Lclient!aiz;[[B)V")
	void method31026(@OriginalArg(0) Class144_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		@Pc(1) int local1;
		@Pc(15) int local15;
		@Pc(25) int local25;
		@Pc(42) int local42;
		for (local1 = 0; local1 < arg0.anInt1383 * -2108820349; local1++) {
			if (!this.aBoolean893) {
				Class490.aClass263_13.method26519(1921457233);
			}
			for (local15 = 0; local15 < this.anInt5089 * 1562861633 >> 3; local15++) {
				for (local25 = 0; local25 < this.anInt5092 * -332702719 >> 3; local25++) {
					local42 = this.anIntArrayArrayArray16[local1][local15][local25];
					if (local42 != -1) {
						@Pc(51) int local51 = local42 >> 24 & 0x3;
						if (!arg0.aBoolean260 || local51 == 0) {
							@Pc(62) int local62 = local42 >> 1 & 0x3;
							@Pc(68) int local68 = local42 >> 14 & 0x3FF;
							@Pc(74) int local74 = local42 >> 3 & 0x7FF;
							@Pc(84) int local84 = (local68 / 8 << 8) + local74 / 8;
							for (@Pc(86) int local86 = 0; local86 < this.anIntArray469.length; local86++) {
								if (this.anIntArray469[local86] == local84 && arg1[local86] != null) {
									@Pc(108) Packet local108 = new Packet(arg1[local86]);
									arg0.method11950(local108, local1, local15 * 8, local25 * 8, local51, local68, local74, local62, (byte) 64);
									arg0.method11999(Class279.aClass102_9, local108, local1, local15 * 8, local25 * 8, local51, local68, local74, local62, 513500097);
									break;
								}
							}
						}
					}
				}
			}
		}
		for (local1 = 0; local1 < arg0.anInt1383 * -2108820349; local1++) {
			if (!this.aBoolean893) {
				Class490.aClass263_13.method26519(909960112);
			}
			for (local15 = 0; local15 < this.anInt5089 * 1562861633 >> 3; local15++) {
				for (local25 = 0; local25 < this.anInt5092 * -332702719 >> 3; local25++) {
					local42 = this.anIntArrayArrayArray16[local1][local15][local25];
					if (local42 == -1) {
						arg0.method11932(local1, local15 * 8, local25 * 8, 8, 8, -2145580136);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rw", name = "ey", descriptor = "(Lclient!aiz;[[B)V")
	void method31027(@OriginalArg(0) Class144_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5090 * -97470709; local1++) {
			@Pc(11) byte[] local11 = arg1[local1];
			if (local11 != null) {
				@Pc(28) int local28 = (this.anIntArray469[local1] >> 8) * 64 - this.aClass626_2.anInt5540 * -390642507;
				@Pc(43) int local43 = (this.anIntArray469[local1] & 0xFF) * 64 - this.aClass626_2.anInt5537 * -894305615;
				if (!this.aBoolean893) {
					Class490.aClass263_13.method26519(551987215);
				}
				arg0.method12028(Class279.aClass102_9, local11, local28, local43, (short) 5126);
				if (this.aBoolean893) {
					this.method31013(10, 2046154948);
				}
			}
		}
	}

	@OriginalMember(owner = "client!rw", name = "ek", descriptor = "(Lclient!aiz;[[B)V")
	void method31028(@OriginalArg(0) Class144_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5090 * -97470709; local1++) {
			@Pc(11) byte[] local11 = arg1[local1];
			if (local11 != null) {
				@Pc(28) int local28 = (this.anIntArray469[local1] >> 8) * 64 - this.aClass626_2.anInt5540 * -390642507;
				@Pc(43) int local43 = (this.anIntArray469[local1] & 0xFF) * 64 - this.aClass626_2.anInt5537 * -894305615;
				if (!this.aBoolean893) {
					Class490.aClass263_13.method26519(1607636479);
				}
				arg0.method12028(Class279.aClass102_9, local11, local28, local43, (short) 5126);
				if (this.aBoolean893) {
					this.method31013(10, 2134120229);
				}
			}
		}
	}

	@OriginalMember(owner = "client!rw", name = "ea", descriptor = "(Lclient!aiz;[[B)V")
	void method31029(@OriginalArg(0) Class144_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg0.anInt1383 * -2108820349; local1++) {
			if (!this.aBoolean893) {
				Class490.aClass263_13.method26519(1231735204);
			}
			for (@Pc(15) int local15 = 0; local15 < this.anInt5089 * 1562861633 >> 3; local15++) {
				for (@Pc(25) int local25 = 0; local25 < this.anInt5092 * -332702719 >> 3; local25++) {
					@Pc(42) int local42 = this.anIntArrayArrayArray16[local1][local15][local25];
					if (local42 != -1) {
						@Pc(51) int local51 = local42 >> 24 & 0x3;
						if (!arg0.aBoolean260 || local51 == 0) {
							@Pc(62) int local62 = local42 >> 1 & 0x3;
							@Pc(68) int local68 = local42 >> 14 & 0x3FF;
							@Pc(74) int local74 = local42 >> 3 & 0x7FF;
							@Pc(84) int local84 = (local68 / 8 << 8) + local74 / 8;
							for (@Pc(86) int local86 = 0; local86 < this.anIntArray469.length; local86++) {
								if (local84 == this.anIntArray469[local86] && arg1[local86] != null) {
									arg0.method12023(Class279.aClass102_9, arg1[local86], local1, local15 * 8, local25 * 8, local51, (local68 & 0x7) * 8, (local74 & 0x7) * 8, local62, 1230514898);
									break;
								}
							}
						}
					}
					if (this.aBoolean893) {
						this.method31013(5, 2116343128);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rw", name = "eh", descriptor = "(Lclient!aiz;[[B)V")
	void method31030(@OriginalArg(0) Class144_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg0.anInt1383 * -2108820349; local1++) {
			if (!this.aBoolean893) {
				Class490.aClass263_13.method26519(2092797211);
			}
			for (@Pc(15) int local15 = 0; local15 < this.anInt5089 * 1562861633 >> 3; local15++) {
				for (@Pc(25) int local25 = 0; local25 < this.anInt5092 * -332702719 >> 3; local25++) {
					@Pc(42) int local42 = this.anIntArrayArrayArray16[local1][local15][local25];
					if (local42 != -1) {
						@Pc(51) int local51 = local42 >> 24 & 0x3;
						if (!arg0.aBoolean260 || local51 == 0) {
							@Pc(62) int local62 = local42 >> 1 & 0x3;
							@Pc(68) int local68 = local42 >> 14 & 0x3FF;
							@Pc(74) int local74 = local42 >> 3 & 0x7FF;
							@Pc(84) int local84 = (local68 / 8 << 8) + local74 / 8;
							for (@Pc(86) int local86 = 0; local86 < this.anIntArray469.length; local86++) {
								if (local84 == this.anIntArray469[local86] && arg1[local86] != null) {
									arg0.method12023(Class279.aClass102_9, arg1[local86], local1, local15 * 8, local25 * 8, local51, (local68 & 0x7) * 8, (local74 & 0x7) * 8, local62, 109366705);
									break;
								}
							}
						}
					}
					if (this.aBoolean893) {
						this.method31013(5, 2016758642);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rw", name = "el", descriptor = "(Lclient!aiz;[[B)V")
	void method31031(@OriginalArg(0) Class144_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg0.anInt1383 * -2108820349; local1++) {
			if (!this.aBoolean893) {
				Class490.aClass263_13.method26519(961287365);
			}
			for (@Pc(15) int local15 = 0; local15 < this.anInt5089 * 1562861633 >> 3; local15++) {
				for (@Pc(25) int local25 = 0; local25 < this.anInt5092 * -332702719 >> 3; local25++) {
					@Pc(42) int local42 = this.anIntArrayArrayArray16[local1][local15][local25];
					if (local42 != -1) {
						@Pc(51) int local51 = local42 >> 24 & 0x3;
						if (!arg0.aBoolean260 || local51 == 0) {
							@Pc(62) int local62 = local42 >> 1 & 0x3;
							@Pc(68) int local68 = local42 >> 14 & 0x3FF;
							@Pc(74) int local74 = local42 >> 3 & 0x7FF;
							@Pc(84) int local84 = (local68 / 8 << 8) + local74 / 8;
							for (@Pc(86) int local86 = 0; local86 < this.anIntArray469.length; local86++) {
								if (local84 == this.anIntArray469[local86] && arg1[local86] != null) {
									arg0.method12023(Class279.aClass102_9, arg1[local86], local1, local15 * 8, local25 * 8, local51, (local68 & 0x7) * 8, (local74 & 0x7) * 8, local62, 2061630145);
									break;
								}
							}
						}
					}
					if (this.aBoolean893) {
						this.method31013(5, 2069706916);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rw", name = "em", descriptor = "(Lclient!aiz;[[B)V")
	void method31032(@OriginalArg(0) Class144_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg0.anInt1383 * -2108820349; local1++) {
			if (!this.aBoolean893) {
				Class490.aClass263_13.method26519(1923454515);
			}
			for (@Pc(15) int local15 = 0; local15 < this.anInt5089 * 1562861633 >> 3; local15++) {
				for (@Pc(25) int local25 = 0; local25 < this.anInt5092 * -332702719 >> 3; local25++) {
					@Pc(42) int local42 = this.anIntArrayArrayArray16[local1][local15][local25];
					if (local42 != -1) {
						@Pc(51) int local51 = local42 >> 24 & 0x3;
						if (!arg0.aBoolean260 || local51 == 0) {
							@Pc(62) int local62 = local42 >> 1 & 0x3;
							@Pc(68) int local68 = local42 >> 14 & 0x3FF;
							@Pc(74) int local74 = local42 >> 3 & 0x7FF;
							@Pc(84) int local84 = (local68 / 8 << 8) + local74 / 8;
							for (@Pc(86) int local86 = 0; local86 < this.anIntArray469.length; local86++) {
								if (local84 == this.anIntArray469[local86] && arg1[local86] != null) {
									arg0.method12023(Class279.aClass102_9, arg1[local86], local1, local15 * 8, local25 * 8, local51, (local68 & 0x7) * 8, (local74 & 0x7) * 8, local62, -973070498);
									break;
								}
							}
						}
					}
					if (this.aBoolean893) {
						this.method31013(5, 2138876079);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rw", name = "et", descriptor = "()V")
	void method31033() {
		@Pc(3) int local3 = this.aByteArrayArray19.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.aByteArrayArray19[local5] != null) {
				@Pc(17) int local17 = -1;
				for (@Pc(19) int local19 = 0; local19 < client.anInt3528 * -540236429; local19++) {
					if (client.anIntArray328[local19] == this.anIntArray469[local5]) {
						local17 = local19;
						break;
					}
				}
				if (local17 == -1) {
					client.anIntArray328[client.anInt3528 * -540236429] = this.anIntArray469[local5];
					local17 = (client.anInt3528 += 131008443) * -540236429 - 1;
				}
				@Pc(67) Packet local67 = new Packet(this.aByteArrayArray19[local5]);
				@Pc(69) int local69 = 0;
				while (local67.pos * -1380987821 < this.aByteArrayArray19[local5].length && local69 < 511 && client.anInt3453 * -1702559601 < 1023) {
					@Pc(95) int local95 = local17 | local69++ << 6;
					@Pc(99) int local99 = local67.g2();
					@Pc(103) int local103 = local99 >> 14;
					@Pc(109) int local109 = local99 >> 7 & 0x3F;
					@Pc(113) int local113 = local99 & 0x3F;
					@Pc(130) int local130 = (this.anIntArray469[local5] >> 8) * 64 - this.aClass626_2.anInt5540 * -390642507 + local109;
					@Pc(147) int local147 = (this.anIntArray469[local5] & 0xFF) * 64 - this.aClass626_2.anInt5537 * -894305615 + local113;
					@Pc(155) Class335 local155 = (Class335) Class460.aClass41_Sub2_1.method18054(local67.g2(), -1829592596);
					@Pc(161) Class80_Sub19 local161 = (Class80_Sub19) client.aClass24_18.method560((long) local95);
					if (local161 == null && (local155.aByte135 & 0x1) > 0 && local130 >= 0 && local130 + local155.anInt4212 * 1573297955 < this.anInt5089 * 1562861633 && local147 >= 0 && local155.anInt4212 * 1573297955 + local147 < this.anInt5092 * -332702719) {
						@Pc(200) Class120_Sub1_Sub1_Sub1_Sub1 local200 = new Class120_Sub1_Sub1_Sub1_Sub1(this.aClass570_24);
						local200.anInt2671 = local95 * -486069653;
						@Pc(210) Class80_Sub19 local210 = new Class80_Sub19(local200);
						client.aClass24_18.method563(local210, (long) local95);
						client.aClass80_Sub19Array1[(client.anInt3452 += -382054833) * -340916049 - 1] = local210;
						client.anIntArray304[(client.anInt3453 += 192683631) * -1702559601 - 1] = local95;
						local200.anInt2694 = client.anInt3436 * -265248265;
						local200.method18794(local155, -1135283639);
						local200.method18984(local200.aClass335_1.anInt4212 * 1573297955, (byte) 31);
						local200.anInt2697 = (local200.aClass335_1.anInt4209 * -2090808675 << 3) * 77355267;
						local200.method18986(local200.aClass335_1.aClass716_1.method37222(1897117730).method37268() << 11 & 0x3FFF, true, (byte) -23);
						local200.method18792(local103, local130, local147, true, local200.method18966((byte) -52), 5224428);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rw", name = "eu", descriptor = "()V")
	void method31034() {
		@Pc(3) int local3 = this.aByteArrayArray19.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.aByteArrayArray19[local5] != null) {
				@Pc(17) int local17 = -1;
				for (@Pc(19) int local19 = 0; local19 < client.anInt3528 * -540236429; local19++) {
					if (client.anIntArray328[local19] == this.anIntArray469[local5]) {
						local17 = local19;
						break;
					}
				}
				if (local17 == -1) {
					client.anIntArray328[client.anInt3528 * -540236429] = this.anIntArray469[local5];
					local17 = (client.anInt3528 += 131008443) * -540236429 - 1;
				}
				@Pc(67) Packet local67 = new Packet(this.aByteArrayArray19[local5]);
				@Pc(69) int local69 = 0;
				while (local67.pos * -1380987821 < this.aByteArrayArray19[local5].length && local69 < 511 && client.anInt3453 * -1702559601 < 1023) {
					@Pc(95) int local95 = local17 | local69++ << 6;
					@Pc(99) int local99 = local67.g2();
					@Pc(103) int local103 = local99 >> 14;
					@Pc(109) int local109 = local99 >> 7 & 0x3F;
					@Pc(113) int local113 = local99 & 0x3F;
					@Pc(130) int local130 = (this.anIntArray469[local5] >> 8) * 64 - this.aClass626_2.anInt5540 * -390642507 + local109;
					@Pc(147) int local147 = (this.anIntArray469[local5] & 0xFF) * 64 - this.aClass626_2.anInt5537 * -894305615 + local113;
					@Pc(155) Class335 local155 = (Class335) Class460.aClass41_Sub2_1.method18054(local67.g2(), 1281181768);
					@Pc(161) Class80_Sub19 local161 = (Class80_Sub19) client.aClass24_18.method560((long) local95);
					if (local161 == null && (local155.aByte135 & 0x1) > 0 && local130 >= 0 && local130 + local155.anInt4212 * 1573297955 < this.anInt5089 * 1562861633 && local147 >= 0 && local155.anInt4212 * 1573297955 + local147 < this.anInt5092 * -332702719) {
						@Pc(200) Class120_Sub1_Sub1_Sub1_Sub1 local200 = new Class120_Sub1_Sub1_Sub1_Sub1(this.aClass570_24);
						local200.anInt2671 = local95 * -486069653;
						@Pc(210) Class80_Sub19 local210 = new Class80_Sub19(local200);
						client.aClass24_18.method563(local210, (long) local95);
						client.aClass80_Sub19Array1[(client.anInt3452 += -382054833) * -340916049 - 1] = local210;
						client.anIntArray304[(client.anInt3453 += 192683631) * -1702559601 - 1] = local95;
						local200.anInt2694 = client.anInt3436 * -265248265;
						local200.method18794(local155, -1573244012);
						local200.method18984(local200.aClass335_1.anInt4212 * 1573297955, (byte) 73);
						local200.anInt2697 = (local200.aClass335_1.anInt4209 * -2090808675 << 3) * 77355267;
						local200.method18986(local200.aClass335_1.aClass716_1.method37222(1985099968).method37268() << 11 & 0x3FFF, true, (byte) -67);
						local200.method18792(local103, local130, local147, true, local200.method18966((byte) -89), 963188324);
					}
				}
			}
		}
	}
}
