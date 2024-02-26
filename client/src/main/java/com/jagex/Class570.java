package com.jagex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!te")
public final class Class570 {

	@OriginalMember(owner = "client!te", name = "bl", descriptor = "I")
	static final int anInt5247 = 4;

	@OriginalMember(owner = "client!te", name = "t", descriptor = "Z")
	public static boolean aBoolean917 = true;

	@OriginalMember(owner = "client!te", name = "bh", descriptor = "[[Z")
	boolean[][] aBooleanArrayArray19;

	@OriginalMember(owner = "client!te", name = "af", descriptor = "I")
	int anInt5241;

	@OriginalMember(owner = "client!te", name = "x", descriptor = "[[[Lclient!tb;")
	public Class568[][][] aClass568ArrayArrayArray1;

	@OriginalMember(owner = "client!te", name = "w", descriptor = "[Lclient!cb;")
	public Class100[] aClass100Array1;

	@OriginalMember(owner = "client!te", name = "ap", descriptor = "I")
	int anInt5249;

	@OriginalMember(owner = "client!te", name = "am", descriptor = "I")
	int anInt5253;

	@OriginalMember(owner = "client!te", name = "ak", descriptor = "I")
	int anInt5254;

	@OriginalMember(owner = "client!te", name = "at", descriptor = "I")
	int anInt5255;

	@OriginalMember(owner = "client!te", name = "ad", descriptor = "I")
	int anInt5256;

	@OriginalMember(owner = "client!te", name = "av", descriptor = "I")
	int anInt5257;

	@OriginalMember(owner = "client!te", name = "aa", descriptor = "I")
	int anInt5259;

	@OriginalMember(owner = "client!te", name = "ae", descriptor = "I")
	int anInt5260;

	@OriginalMember(owner = "client!te", name = "ar", descriptor = "I")
	int anInt5261;

	@OriginalMember(owner = "client!te", name = "au", descriptor = "I")
	int anInt5262;

	@OriginalMember(owner = "client!te", name = "o", descriptor = "Z")
	boolean aBoolean918;

	@OriginalMember(owner = "client!te", name = "az", descriptor = "I")
	int anInt5266;

	@OriginalMember(owner = "client!te", name = "l", descriptor = "I")
	final int anInt5240 = 16;

	@OriginalMember(owner = "client!te", name = "b", descriptor = "I")
	int anInt5248 = 0;

	@OriginalMember(owner = "client!te", name = "ax", descriptor = "I")
	final int anInt5243 = 10038;

	@OriginalMember(owner = "client!te", name = "ay", descriptor = "I")
	final int anInt5265 = 5035;

	@OriginalMember(owner = "client!te", name = "ai", descriptor = "I")
	final int anInt5250 = 5082;

	@OriginalMember(owner = "client!te", name = "as", descriptor = "[F")
	final float[] aFloatArray117 = new float[3];

	@OriginalMember(owner = "client!te", name = "aw", descriptor = "[Lclient!akb;")
	final Class80_Sub12[] aClass80_Sub12Array23 = new Class80_Sub12[8];

	@OriginalMember(owner = "client!te", name = "bg", descriptor = "I")
	final int anInt5263 = 65334;

	@OriginalMember(owner = "client!te", name = "bs", descriptor = "Ljava/util/HashMap;")
	HashMap aHashMap11 = new HashMap();

	@OriginalMember(owner = "client!te", name = "bj", descriptor = "Ljava/util/HashMap;")
	HashMap aHashMap12 = new HashMap();

	@OriginalMember(owner = "client!te", name = "g", descriptor = "Lclient!di;")
	final Class102 aClass102_12;

	@OriginalMember(owner = "client!te", name = "m", descriptor = "Z")
	final boolean aBoolean916;

	@OriginalMember(owner = "client!te", name = "f", descriptor = "I")
	public final int anInt5258;

	@OriginalMember(owner = "client!te", name = "e", descriptor = "I")
	final int anInt5238;

	@OriginalMember(owner = "client!te", name = "u", descriptor = "I")
	final int anInt5239;

	@OriginalMember(owner = "client!te", name = "a", descriptor = "I")
	public int anInt5242;

	@OriginalMember(owner = "client!te", name = "s", descriptor = "I")
	public final int anInt5245;

	@OriginalMember(owner = "client!te", name = "k", descriptor = "I")
	public final int anInt5246;

	@OriginalMember(owner = "client!te", name = "an", descriptor = "I")
	int anInt5244;

	@OriginalMember(owner = "client!te", name = "i", descriptor = "Lclient!acj;")
	Class59 aClass59_1;

	@OriginalMember(owner = "client!te", name = "j", descriptor = "Lclient!us;")
	public final Class600 aClass600_1;

	@OriginalMember(owner = "client!te", name = "r", descriptor = "[[[Lclient!tb;")
	public Class568[][][] aClass568ArrayArrayArray3;

	@OriginalMember(owner = "client!te", name = "q", descriptor = "[Lclient!cb;")
	public Class100[] aClass100Array3;

	@OriginalMember(owner = "client!te", name = "z", descriptor = "[[I")
	int[][] anIntArrayArray62;

	@OriginalMember(owner = "client!te", name = "v", descriptor = "[[B")
	byte[][] aByteArrayArray25;

	@OriginalMember(owner = "client!te", name = "p", descriptor = "[[S")
	short[][] aShortArrayArray4;

	@OriginalMember(owner = "client!te", name = "y", descriptor = "[[B")
	byte[][] aByteArrayArray23;

	@OriginalMember(owner = "client!te", name = "n", descriptor = "[[B")
	byte[][] aByteArrayArray22;

	@OriginalMember(owner = "client!te", name = "c", descriptor = "[[B")
	byte[][] aByteArrayArray24;

	@OriginalMember(owner = "client!te", name = "h", descriptor = "[[[Lclient!tb;")
	public Class568[][][] aClass568ArrayArrayArray2;

	@OriginalMember(owner = "client!te", name = "d", descriptor = "[Lclient!cb;")
	public Class100[] aClass100Array2;

	@OriginalMember(owner = "client!te", name = "bn", descriptor = "[[[J")
	long[][][] aLongArrayArrayArray1;

	@OriginalMember(owner = "client!te", name = "ba", descriptor = "[Lclient!uk;")
	Class595[] aClass595Array1;

	@OriginalMember(owner = "client!te", name = "bt", descriptor = "[Z")
	boolean[] aBooleanArray32;

	@OriginalMember(owner = "client!te", name = "br", descriptor = "I")
	int anInt5264;

	@OriginalMember(owner = "client!te", name = "aq", descriptor = "[Lclient!alf;")
	final Class120_Sub1[] aClass120_Sub1Array2;

	@OriginalMember(owner = "client!te", name = "ao", descriptor = "[Lclient!alf;")
	final Class120_Sub1[] aClass120_Sub1Array1;

	@OriginalMember(owner = "client!te", name = "aj", descriptor = "[Lclient!alf;")
	final Class120_Sub1[] aClass120_Sub1Array3;

	@OriginalMember(owner = "client!te", name = "al", descriptor = "[Lclient!alf;")
	final Class120_Sub1[] aClass120_Sub1Array4;

	@OriginalMember(owner = "client!te", name = "ac", descriptor = "I")
	int anInt5251;

	@OriginalMember(owner = "client!te", name = "ab", descriptor = "[Lclient!alf;")
	final Class120_Sub1[] aClass120_Sub1Array5;

	@OriginalMember(owner = "client!te", name = "ag", descriptor = "I")
	int anInt5252;

	@OriginalMember(owner = "client!te", name = "ah", descriptor = "[Lclient!ase;")
	final Class120_Sub1_Sub1[] aClass120_Sub1_Sub1Array1;

	@OriginalMember(owner = "client!te", name = "be", descriptor = "[[Z")
	boolean[][] aBooleanArrayArray20;

	@OriginalMember(owner = "client!te", name = "bk", descriptor = "[[Z")
	boolean[][] aBooleanArrayArray21;

	@OriginalMember(owner = "client!te", name = "bz", descriptor = "[I")
	final int[] anIntArray475;

	@OriginalMember(owner = "client!te", name = "by", descriptor = "Lclient!tt;")
	public Class582 aClass582_1;

	@OriginalMember(owner = "client!te", name = "e", descriptor = "(Lclient!yp;B)V")
	static void method31720(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray525[arg0.anInt5778 * 1896589581 - 1] = ((Class352) Class106.aClass73_Sub1_6.method18054(arg0.anIntArray525[arg0.anInt5778 * 1896589581 - 1], -549369694)).anInt4257 * 1035015913;
	}

	@OriginalMember(owner = "client!te", name = "yt", descriptor = "(Lclient!yp;B)V")
	static void method31721(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.anInt2709 * -2012525865;
	}

	@OriginalMember(owner = "client!te", name = "mn", descriptor = "(ZII)V")
	public static void method31722(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class80_Sub32 local5 = arg0 ? Class477.aClass80_Sub32_3 : Class144.aClass80_Sub32_2;
		if (local5 == null || arg1 < 0 || arg1 >= local5.anInt1650 * 753247591) {
			return;
		}
		@Pc(21) Class382 local21 = local5.aClass382Array1[arg1];
		if (local21.aByte146 != -1) {
			return;
		}
		@Pc(29) String local29 = local21.aString204;
		@Pc(32) Class75 local32 = Class52.method1074(16777215);
		@Pc(38) Class80_Sub31 local38 = Class623.method32440(Class443.aClass443_95, local32.aClass22_1, -191270971);
		local38.aPacketBit_2.p1(Class350.method28013(local29, (short) 16383) + 3);
		local38.aPacketBit_2.p1(arg0 ? 1 : 0);
		local38.aPacketBit_2.p2(arg1);
		local38.aPacketBit_2.pjstr(local29);
		local32.method1325(local38, (byte) -61);
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(I)V")
	static void method31723(@OriginalArg(0) int arg0) {
		if (Class599.method32050(client.anInt3433 * 1994758437, 634085869)) {
			if (client.aClass75_2.method1321((byte) 2) == null) {
				Class604.method32148(17, -844299320);
			} else {
				Class604.method32148(13, -1485030676);
			}
		} else if (client.anInt3433 * 1994758437 == 17 || client.anInt3433 * 1994758437 == 7) {
			Class604.method32148(4, 1724963937);
		} else if (client.anInt3433 * 1994758437 == 9) {
			Class604.method32148(4, -141303696);
		}
	}

	@OriginalMember(owner = "client!te", name = "ag", descriptor = "(B)I")
	static int method31724(@OriginalArg(0) byte arg0) {
		if (client.aClass327_8 == null) {
			if (Class630.aBoolean955) {
				@Pc(26) Class15 local26 = Class445.method29244(2004948996);
				@Pc(30) int local30 = Class363.aClass152_1.method14615(-1847786376);
				@Pc(34) int local34 = Class363.aClass152_1.method14598(1320717117);
				@Pc(52) int local52;
				@Pc(54) int local54;
				@Pc(86) int local86;
				@Pc(162) Class80_Sub1_Sub11 local162;
				if (Class630.aBoolean956) {
					@Pc(289) Class12 local289;
					if (local30 > Class594.anInt5325 * 2014486095 && local30 < Class594.anInt5325 * 2014486095 + Class427.anInt4636 * 663066865) {
						local52 = -1;
						for (local54 = 0; local54 < Class630.anInt5554 * 876474189; local54++) {
							if (Class630.aBoolean957) {
								local86 = local54 * 1378633515 * Class630.anInt5547 + local26.anInt45 * 1190692343 + Class103_Sub15.anInt970 * -1540302901 + 20 + 1;
								if (local34 > local86 - local26.anInt45 * 1190692343 - 1 && local34 < local26.anInt46 * -191270971 + local86) {
									local52 = local54;
								}
							} else {
								local86 = local54 * Class630.anInt5547 * 1378633515 + 31 + Class103_Sub15.anInt970 * -1540302901;
								if (local34 > local86 - local26.anInt45 * 1190692343 - 1 && local34 < local86 + local26.anInt46 * -191270971) {
									local52 = local54;
								}
							}
						}
						if (local52 != -1) {
							local54 = 0;
							local289 = new Class12(Class630.aClass3_17);
							for (@Pc(294) Class80_Sub1_Sub4 local294 = (Class80_Sub1_Sub4) local289.method338(-1997919557); local294 != null; local294 = (Class80_Sub1_Sub4) local289.next()) {
								if (local54++ == local52) {
									return ((Class80_Sub1_Sub11) local294.aClass3_10.aClass80_Sub1_2.aClass80_Sub1_68).anInt3075 * -1687136903;
								}
							}
						}
					} else if (Class630.aClass80_Sub1_Sub4_1 != null && local30 > Class41_Sub12.anInt2441 * 1627981811 && local30 < Class41_Sub12.anInt2441 * 1627981811 + Class40.anInt116 * -477951091) {
						local52 = -1;
						for (local54 = 0; local54 < Class630.aClass80_Sub1_Sub4_1.anInt3022 * 855388281; local54++) {
							if (Class630.aBoolean957) {
								local86 = Class630.anInt5557 * -1965654097 + 20 + local26.anInt45 * 1190692343 + 1 + Class630.anInt5547 * 1378633515 * local54;
								if (local34 > local86 - local26.anInt45 * 1190692343 - 1 && local34 < local26.anInt46 * -191270971 + local86) {
									local52 = local54;
								}
							} else {
								local86 = Class630.anInt5557 * -1965654097 + 31 + local54 * Class630.anInt5547 * 1378633515;
								if (local34 > local86 - local26.anInt45 * 1190692343 - 1 && local34 < local26.anInt46 * -191270971 + local86) {
									local52 = local54;
								}
							}
						}
						if (local52 != -1) {
							local54 = 0;
							local289 = new Class12(Class630.aClass80_Sub1_Sub4_1.aClass3_10);
							for (local162 = (Class80_Sub1_Sub11) local289.method338(1302598120); local162 != null; local162 = (Class80_Sub1_Sub11) local289.next()) {
								if (local54++ == local52) {
									return local162.anInt3075 * -1687136903;
								}
							}
						}
					}
				} else if (local30 > Class594.anInt5325 * 2014486095 && local30 < Class594.anInt5325 * 2014486095 + Class427.anInt4636 * 663066865) {
					local52 = -1;
					for (local54 = 0; local54 < Class630.anInt5553 * 721317679; local54++) {
						if (Class630.aBoolean957) {
							local86 = (Class630.anInt5553 * 721317679 - 1 - local54) * 1378633515 * Class630.anInt5547 + local26.anInt45 * 1190692343 + 20 + Class103_Sub15.anInt970 * -1540302901 + 1;
							if (local34 > local86 - local26.anInt45 * 1190692343 - 1 && local34 < local26.anInt46 * -191270971 + local86) {
								local52 = local54;
							}
						} else {
							local86 = Class103_Sub15.anInt970 * -1540302901 + 31 + Class630.anInt5547 * 1378633515 * (Class630.anInt5553 * 721317679 - 1 - local54);
							if (local34 > local86 - local26.anInt45 * 1190692343 - 1 && local34 < local86 + local26.anInt46 * -191270971) {
								local52 = local54;
							}
						}
					}
					if (local52 != -1) {
						local54 = 0;
						@Pc(157) Class7 local157 = new Class7(Class630.aClass8_55);
						for (local162 = (Class80_Sub1_Sub11) local157.method220(564675447); local162 != null; local162 = (Class80_Sub1_Sub11) local157.next()) {
							if (local54++ == local52) {
								return local162.anInt3075 * -1687136903;
							}
						}
					}
				}
			} else if (Class630.aClass641_1.aBoolean965) {
				if (Class686.aClass80_Sub1_Sub11_5 != null) {
					return Class686.aClass80_Sub1_Sub11_5.anInt3075 * -1687136903;
				}
			} else if (Class630.aClass80_Sub1_Sub11_4 != null) {
				return Class630.aClass80_Sub1_Sub11_4.anInt3075 * -1687136903;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Lclient!di;IIIIIZZ)V")
	public Class570(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7) {
		this.aClass102_12 = arg0;
		this.aBoolean916 = this.aClass102_12.method20768() > 0;
		this.anInt5258 = arg1 * 1582409735;
		this.anInt5238 = (0x1 << this.anInt5258 * 1479624119) * -1530993449;
		this.anInt5239 = (this.anInt5238 * 1533693671 >> 1) * 1534353293;
		this.anInt5242 = arg2 * -749711961;
		this.anInt5245 = arg3 * -1666241269;
		this.anInt5246 = arg4 * -132330473;
		this.anInt5244 = arg5 * 1069682691;
		this.aClass59_1 = new Class59();
		this.aClass600_1 = new Class600(this);
		this.aClass568ArrayArrayArray3 = new Class568[arg2][this.anInt5245 * 1487025827][this.anInt5246 * -1561777241];
		this.aClass100Array3 = new Class100[arg2];
		if (arg6) {
			this.anIntArrayArray62 = new int[this.anInt5245 * 1487025827][this.anInt5246 * -1561777241];
			this.aByteArrayArray25 = new byte[this.anInt5245 * 1487025827][this.anInt5246 * -1561777241];
			this.aShortArrayArray4 = new short[this.anInt5245 * 1487025827][this.anInt5246 * -1561777241];
			this.aByteArrayArray23 = new byte[this.anInt5245 * 1487025827][this.anInt5246 * -1561777241];
			this.aByteArrayArray22 = new byte[this.anInt5245 * 1487025827][this.anInt5246 * -1561777241];
			this.aByteArrayArray24 = new byte[this.anInt5245 * 1487025827][this.anInt5246 * -1561777241];
			this.aClass568ArrayArrayArray2 = new Class568[1][this.anInt5245 * 1487025827][this.anInt5246 * -1561777241];
			this.aClass100Array2 = new Class100[1];
		}
		if (arg7) {
			this.aLongArrayArrayArray1 = new long[arg2][arg3][arg4];
			this.aClass595Array1 = new Class595[65334];
			this.aBooleanArray32 = new boolean[65334];
			this.anInt5264 = 0;
		}
		this.method31540(false, 567884320);
		this.aClass120_Sub1Array2 = new Class120_Sub1[2];
		this.aClass120_Sub1Array1 = new Class120_Sub1[2];
		this.aClass120_Sub1Array3 = new Class120_Sub1[2];
		this.aClass120_Sub1Array4 = new Class120_Sub1[10038];
		this.anInt5251 = 0;
		this.aClass120_Sub1Array5 = new Class120_Sub1[5035];
		this.anInt5252 = 0;
		this.aClass120_Sub1_Sub1Array1 = new Class120_Sub1_Sub1[5082];
		this.anInt5248 = 0;
		this.aBooleanArrayArray20 = new boolean[this.anInt5244 * 1989483179 + this.anInt5244 * 1989483179 + 1][this.anInt5244 * 1989483179 + 1 + this.anInt5244 * 1989483179];
		this.aBooleanArrayArray21 = new boolean[this.anInt5244 * 1989483179 + this.anInt5244 * 1989483179 + 2][this.anInt5244 * 1989483179 + this.anInt5244 * 1989483179 + 2];
		this.anIntArray475 = new int[this.anInt5244 * 1989483179 + 2 + this.anInt5244 * 1989483179];
		this.aClass582_1 = new Class582(false);
	}

	@OriginalMember(owner = "client!te", name = "ct", descriptor = "(II)I")
	public int method31537(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray62 == null ? 0 : this.anIntArrayArray62[arg0][arg1] & 0xFFFFFF;
	}

	@OriginalMember(owner = "client!te", name = "t", descriptor = "(IB)V")
	public void method31538(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
	}

	@OriginalMember(owner = "client!te", name = "f", descriptor = "(Lclient!ed;I)V")
	public void method31539(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!te", name = "e", descriptor = "(ZI)V")
	public void method31540(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		if (arg0) {
			this.aClass568ArrayArrayArray1 = this.aClass568ArrayArrayArray2;
			this.aClass100Array1 = this.aClass100Array2;
		} else {
			this.aClass568ArrayArrayArray1 = this.aClass568ArrayArrayArray3;
			this.aClass100Array1 = this.aClass100Array3;
		}
		this.anInt5242 = this.aClass568ArrayArrayArray1.length * -749711961;
	}

	@OriginalMember(owner = "client!te", name = "u", descriptor = "(I)V")
	public void method31541(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5245 * 1487025827; local1++) {
			for (@Pc(9) int local9 = 0; local9 < this.anInt5246 * -1561777241; local9++) {
				if (this.aClass568ArrayArrayArray1[0][local1][local9] == null) {
					this.aClass568ArrayArrayArray1[0][local1][local9] = new Class568(0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "aw", descriptor = "(IIB)V")
	void method31542(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		@Pc(1) Class80_Sub1_Sub10 local1 = null;
		for (@Pc(3) int local3 = arg0; local3 < arg1; local3++) {
			@Pc(11) Class100 local11 = this.aClass100Array3[local3];
			if (local11 != null) {
				for (@Pc(15) int local15 = 0; local15 < this.anInt5246 * -1561777241; local15++) {
					for (@Pc(23) int local23 = 0; local23 < this.anInt5245 * 1487025827; local23++) {
						local1 = local11.method2946(local23, local15, local1);
						if (local1 != null) {
							@Pc(45) int local45 = local23 << this.anInt5258 * 1479624119;
							@Pc(52) int local52 = local15 << this.anInt5258 * 1479624119;
							for (@Pc(56) int local56 = local3 - 1; local56 >= 0; local56--) {
								@Pc(63) Class100 local63 = this.aClass100Array3[local56];
								if (local63 != null) {
									@Pc(78) int local78 = local11.method2917(local23, local15, -1668235191) - local63.method2917(local23, local15, -1238766666);
									@Pc(94) int local94 = local11.method2917(local23 + 1, local15, -1343958494) - local63.method2917(local23 + 1, local15, -1014367798);
									@Pc(114) int local114 = local11.method2917(local23 + 1, local15 + 1, -841337805) - local63.method2917(local23 + 1, local15 + 1, -1339509805);
									@Pc(130) int local130 = local11.method2917(local23, local15 + 1, -1396779460) - local63.method2917(local23, local15 + 1, -1939338423);
									local63.method2920(local1, local45, (local78 + local94 + local114 + local130) / 4, local52, 0, false);
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "aq", descriptor = "(IIILclient!tc;I)Lclient!ase;")
	public Class120_Sub1_Sub1 method31543(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Interface62 arg3, @OriginalArg(4) int arg4) {
		@Pc(8) Class568 local8 = this.aClass568ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return null;
		}
		for (@Pc(15) Class594 local15 = local8.aClass594_2; local15 != null; local15 = local15.aClass594_3) {
			@Pc(20) Class120_Sub1_Sub1 local20 = local15.aClass120_Sub1_Sub1_1;
			if ((arg3 == null || arg3.method31790(local20, 1430385381)) && local20.aShort129 == arg1 && arg2 == local20.aShort127) {
				this.method31568(local20, false, (short) 16802);
				return local20;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!te", name = "i", descriptor = "(IIIB)Lclient!tb;")
	Class568 method31544(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		return this.method31693(arg0, Math.min(this.anInt5245 * 1487025827 - 1, Math.max(0, arg1)), Math.min(this.anInt5246 * -1561777241 - 1, Math.max(0, arg2)), -1450439773);
	}

	@OriginalMember(owner = "client!te", name = "be", descriptor = "(Z)V")
	public void method31545(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.aClass568ArrayArrayArray1 = this.aClass568ArrayArrayArray2;
			this.aClass100Array1 = this.aClass100Array2;
		} else {
			this.aClass568ArrayArrayArray1 = this.aClass568ArrayArrayArray3;
			this.aClass100Array1 = this.aClass100Array3;
		}
		this.anInt5242 = this.aClass568ArrayArrayArray1.length * -749711961;
	}

	@OriginalMember(owner = "client!te", name = "ee", descriptor = "(III)Lclient!asq;")
	public Class120_Sub1_Sub3 method31546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class568 local8 = this.aClass568ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass120_Sub1_Sub3_1;
	}

	@OriginalMember(owner = "client!te", name = "j", descriptor = "(IIB)I")
	public int method31547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		return this.aShortArrayArray4 == null ? 0 : this.aShortArrayArray4[arg0][arg1] & 0xFFFF;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IIS)I")
	public int method31548(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) short arg2) {
		return this.anIntArrayArray62 == null ? 0 : this.anIntArrayArray62[arg0][arg1] & 0xFFFFFF;
	}

	@OriginalMember(owner = "client!te", name = "bf", descriptor = "(II)V")
	public void method31549(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class568 local8 = this.aClass568ArrayArrayArray1[0][arg0][arg1];
		for (@Pc(10) int local10 = 0; local10 < 3; local10++) {
			@Pc(33) Class568 local33 = this.aClass568ArrayArrayArray1[local10][arg0][arg1] = this.aClass568ArrayArrayArray1[local10 + 1][arg0][arg1];
			if (local33 != null) {
				for (@Pc(39) Class594 local39 = local33.aClass594_2; local39 != null; local39 = local39.aClass594_3) {
					@Pc(45) Class120_Sub1_Sub1 local45 = local39.aClass120_Sub1_Sub1_1;
					if (local45.aShort129 == arg0 && local45.aShort127 == arg1) {
						local45.aByte99--;
					}
				}
				if (local33.aClass120_Sub1_Sub4_1 != null) {
					local33.aClass120_Sub1_Sub4_1.aByte99--;
				}
				if (local33.aClass120_Sub1_Sub2_1 != null) {
					local33.aClass120_Sub1_Sub2_1.aByte99--;
				}
				if (local33.aClass120_Sub1_Sub2_2 != null) {
					local33.aClass120_Sub1_Sub2_2.aByte99--;
				}
				if (local33.aClass120_Sub1_Sub3_1 != null) {
					local33.aClass120_Sub1_Sub3_1.aByte99--;
				}
				if (local33.aClass120_Sub1_Sub3_2 != null) {
					local33.aClass120_Sub1_Sub3_2.aByte99--;
				}
			}
		}
		if (this.aClass568ArrayArrayArray1[0][arg0][arg1] == null) {
			this.aClass568ArrayArrayArray1[0][arg0][arg1] = new Class568(0);
			this.aClass568ArrayArrayArray1[0][arg0][arg1].aByte150 = 1;
		}
		this.aClass568ArrayArrayArray1[0][arg0][arg1].aClass568_1 = local8;
		this.aClass568ArrayArrayArray1[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!te", name = "k", descriptor = "(III)I")
	public int method31550(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return this.aByteArrayArray23 == null ? 0 : this.aByteArrayArray23[arg0][arg1] & 0xFF;
	}

	@OriginalMember(owner = "client!te", name = "dh", descriptor = "(IIILclient!asq;Lclient!asq;)V")
	public void method31551(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class120_Sub1_Sub3 arg3, @OriginalArg(4) Class120_Sub1_Sub3 arg4) {
		@Pc(6) Class568 local6 = this.method31693(arg0, arg1, arg2, -1392990323);
		if (local6 == null) {
			return;
		}
		local6.aClass120_Sub1_Sub3_1 = arg3;
		local6.aClass120_Sub1_Sub3_2 = arg4;
		@Pc(23) int local23 = this.aClass100Array1 == this.aClass100Array2 ? 1 : 0;
		if (!arg3.method24567(-32648954)) {
			arg3.aClass120_Sub1_23 = this.aClass120_Sub1Array3[local23];
			this.aClass120_Sub1Array3[local23] = arg3;
		} else if (arg3.method24565(-65263341)) {
			arg3.aClass120_Sub1_23 = this.aClass120_Sub1Array1[local23];
			this.aClass120_Sub1Array1[local23] = arg3;
		} else {
			arg3.aClass120_Sub1_23 = this.aClass120_Sub1Array2[local23];
			this.aClass120_Sub1Array2[local23] = arg3;
		}
		if (arg4 == null) {
			return;
		}
		if (!arg4.method24567(-32648954)) {
			arg4.aClass120_Sub1_23 = this.aClass120_Sub1Array3[local23];
			this.aClass120_Sub1Array3[local23] = arg4;
		} else if (arg4.method24565(-65263341)) {
			arg4.aClass120_Sub1_23 = this.aClass120_Sub1Array1[local23];
			this.aClass120_Sub1Array1[local23] = arg4;
		} else {
			arg4.aClass120_Sub1_23 = this.aClass120_Sub1Array2[local23];
			this.aClass120_Sub1Array2[local23] = arg4;
		}
	}

	@OriginalMember(owner = "client!te", name = "w", descriptor = "(III)I")
	public int method31552(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return this.aByteArrayArray24 == null ? 0 : this.aByteArrayArray24[arg0][arg1] & 0xFF;
	}

	@OriginalMember(owner = "client!te", name = "l", descriptor = "(IIS)V")
	public void method31553(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) short arg2) {
		@Pc(8) Class568 local8 = this.aClass568ArrayArrayArray1[0][arg0][arg1];
		for (@Pc(10) int local10 = 0; local10 < 3; local10++) {
			@Pc(33) Class568 local33 = this.aClass568ArrayArrayArray1[local10][arg0][arg1] = this.aClass568ArrayArrayArray1[local10 + 1][arg0][arg1];
			if (local33 != null) {
				for (@Pc(39) Class594 local39 = local33.aClass594_2; local39 != null; local39 = local39.aClass594_3) {
					@Pc(45) Class120_Sub1_Sub1 local45 = local39.aClass120_Sub1_Sub1_1;
					if (local45.aShort129 == arg0 && local45.aShort127 == arg1) {
						local45.aByte99--;
					}
				}
				if (local33.aClass120_Sub1_Sub4_1 != null) {
					local33.aClass120_Sub1_Sub4_1.aByte99--;
				}
				if (local33.aClass120_Sub1_Sub2_1 != null) {
					local33.aClass120_Sub1_Sub2_1.aByte99--;
				}
				if (local33.aClass120_Sub1_Sub2_2 != null) {
					local33.aClass120_Sub1_Sub2_2.aByte99--;
				}
				if (local33.aClass120_Sub1_Sub3_1 != null) {
					local33.aClass120_Sub1_Sub3_1.aByte99--;
				}
				if (local33.aClass120_Sub1_Sub3_2 != null) {
					local33.aClass120_Sub1_Sub3_2.aByte99--;
				}
			}
		}
		if (this.aClass568ArrayArrayArray1[0][arg0][arg1] == null) {
			this.aClass568ArrayArrayArray1[0][arg0][arg1] = new Class568(0);
			this.aClass568ArrayArrayArray1[0][arg0][arg1].aByte150 = 1;
		}
		this.aClass568ArrayArrayArray1[0][arg0][arg1].aClass568_1 = local8;
		this.aClass568ArrayArrayArray1[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!te", name = "m", descriptor = "(IIII)V")
	public void method31554(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(23) boolean local23 = this.aClass568ArrayArrayArray1[0][arg1][arg2] != null && this.aClass568ArrayArrayArray1[0][arg1][arg2].aClass568_1 != null;
		for (@Pc(25) int local25 = arg0; local25 >= 0; local25--) {
			if (this.aClass568ArrayArrayArray1[local25][arg1][arg2] == null) {
				@Pc(50) Class568 local50 = this.aClass568ArrayArrayArray1[local25][arg1][arg2] = new Class568(local25);
				if (local23) {
					local50.aByte150++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "x", descriptor = "(IIB)I")
	public int method31555(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		return this.aByteArrayArray22 == null ? 0 : this.aByteArrayArray22[arg0][arg1] & 0xFF;
	}

	@OriginalMember(owner = "client!te", name = "d", descriptor = "(IIILclient!asi;Lclient!asi;B)V")
	public void method31556(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class120_Sub1_Sub2 arg3, @OriginalArg(4) Class120_Sub1_Sub2 arg4, @OriginalArg(5) byte arg5) {
		@Pc(6) Class568 local6 = this.method31693(arg0, arg1, arg2, 695294769);
		if (local6 == null) {
			return;
		}
		local6.aClass120_Sub1_Sub2_1 = arg3;
		local6.aClass120_Sub1_Sub2_2 = arg4;
		@Pc(23) int local23 = this.aClass100Array1 == this.aClass100Array2 ? 1 : 0;
		if (!arg3.method24567(-32648954)) {
			arg3.aClass120_Sub1_23 = this.aClass120_Sub1Array3[local23];
			this.aClass120_Sub1Array3[local23] = arg3;
		} else if (arg3.method24565(-65263341)) {
			arg3.aClass120_Sub1_23 = this.aClass120_Sub1Array1[local23];
			this.aClass120_Sub1Array1[local23] = arg3;
		} else {
			arg3.aClass120_Sub1_23 = this.aClass120_Sub1Array2[local23];
			this.aClass120_Sub1Array2[local23] = arg3;
		}
		if (arg4 == null) {
			return;
		}
		if (!arg4.method24567(-32648954)) {
			arg4.aClass120_Sub1_23 = this.aClass120_Sub1Array3[local23];
			this.aClass120_Sub1Array3[local23] = arg4;
		} else if (arg4.method24565(-65263341)) {
			arg4.aClass120_Sub1_23 = this.aClass120_Sub1Array1[local23];
			this.aClass120_Sub1Array1[local23] = arg4;
		} else {
			arg4.aClass120_Sub1_23 = this.aClass120_Sub1Array2[local23];
			this.aClass120_Sub1Array2[local23] = arg4;
		}
	}

	@OriginalMember(owner = "client!te", name = "du", descriptor = "(III)Lclient!asi;")
	public Class120_Sub1_Sub2 method31557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class568 local8 = this.aClass568ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			this.method31569(local8.aClass120_Sub1_Sub2_1, (short) 21512);
			if (local8.aClass120_Sub1_Sub2_1 != null) {
				@Pc(21) Class120_Sub1_Sub2 local21 = local8.aClass120_Sub1_Sub2_1;
				local8.aClass120_Sub1_Sub2_1 = null;
				return local21;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!te", name = "am", descriptor = "(IIII)Lclient!ash;")
	public Class120_Sub1_Sub4 method31558(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class568 local8 = this.aClass568ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass120_Sub1_Sub4_1 == null ? null : local8.aClass120_Sub1_Sub4_1;
	}

	@OriginalMember(owner = "client!te", name = "v", descriptor = "(IIIII)V")
	public void method31559(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(8) Class568 local8 = this.aClass568ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return;
		}
		@Pc(15) Class120_Sub1_Sub3 local15 = local8.aClass120_Sub1_Sub3_1;
		@Pc(18) Class120_Sub1_Sub3 local18 = local8.aClass120_Sub1_Sub3_2;
		if (local15 != null) {
			local15.aShort52 = (short) (arg3 * local15.aShort52 / (0x10 << this.anInt5258 * 1479624119 - 7));
			local15.aShort51 = (short) (local15.aShort51 * arg3 / (0x10 << this.anInt5258 * 1479624119 - 7));
		}
		if (local18 != null) {
			local18.aShort52 = (short) (arg3 * local18.aShort52 / (0x10 << this.anInt5258 * 1479624119 - 7));
			local18.aShort51 = (short) (local18.aShort51 * arg3 / (0x10 << this.anInt5258 * 1479624119 - 7));
		}
	}

	@OriginalMember(owner = "client!te", name = "da", descriptor = "(III)Lclient!asi;")
	public Class120_Sub1_Sub2 method31560(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class568 local8 = this.aClass568ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass120_Sub1_Sub2_1;
	}

	@OriginalMember(owner = "client!te", name = "bv", descriptor = "()V")
	public void method31561() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5245 * 1487025827; local1++) {
			for (@Pc(9) int local9 = 0; local9 < this.anInt5246 * -1561777241; local9++) {
				if (this.aClass568ArrayArrayArray1[0][local1][local9] == null) {
					this.aClass568ArrayArrayArray1[0][local1][local9] = new Class568(0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "c", descriptor = "(IIII)Lclient!asi;")
	public Class120_Sub1_Sub2 method31562(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class568 local8 = this.aClass568ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			this.method31569(local8.aClass120_Sub1_Sub2_2, (short) -4752);
			if (local8.aClass120_Sub1_Sub2_2 != null) {
				@Pc(23) Class120_Sub1_Sub2 local23 = local8.aClass120_Sub1_Sub2_2;
				local8.aClass120_Sub1_Sub2_2 = null;
				return local23;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!te", name = "fu", descriptor = "()Ljava/util/HashMap;")
	public HashMap method31563() {
		this.aHashMap12.clear();
		@Pc(7) Iterator local7 = this.aHashMap11.entrySet().iterator();
		while (local7.hasNext()) {
			@Pc(14) Entry local14 = (Entry) local7.next();
			this.aHashMap12.put(local14.getKey(), ((Class595) ((List) local14.getValue()).get(0)).aClass80_Sub12_3);
		}
		return this.aHashMap12;
	}

	@OriginalMember(owner = "client!te", name = "ax", descriptor = "(IIIB)Lclient!asq;")
	public Class120_Sub1_Sub3 method31564(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		@Pc(8) Class568 local8 = this.aClass568ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			this.method31569(local8.aClass120_Sub1_Sub3_2, (short) -4012);
			if (local8.aClass120_Sub1_Sub3_2 != null) {
				@Pc(22) Class120_Sub1_Sub3 local22 = local8.aClass120_Sub1_Sub3_2;
				local8.aClass120_Sub1_Sub3_2 = null;
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!te", name = "ay", descriptor = "(IIII)Lclient!ash;")
	public Class120_Sub1_Sub4 method31565(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class568 local8 = this.aClass568ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return null;
		}
		this.method31569(local8.aClass120_Sub1_Sub4_1, (short) -18880);
		if (local8.aClass120_Sub1_Sub4_1 == null) {
			return null;
		} else {
			@Pc(24) Class120_Sub1_Sub4 local24 = local8.aClass120_Sub1_Sub4_1;
			local8.aClass120_Sub1_Sub4_1 = null;
			return local24;
		}
	}

	@OriginalMember(owner = "client!te", name = "ai", descriptor = "(IIIB)Lclient!asc;")
	public Class120_Sub1_Sub5 method31566(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		@Pc(8) Class568 local8 = this.aClass568ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return null;
		} else {
			@Pc(16) Class120_Sub1_Sub5 local16 = local8.aClass120_Sub1_Sub5_1;
			local8.aClass120_Sub1_Sub5_1 = null;
			this.method31569(local16, (short) -5076);
			return local16;
		}
	}

	@OriginalMember(owner = "client!te", name = "di", descriptor = "(IIILclient!tc;)Lclient!ase;")
	public Class120_Sub1_Sub1 method31567(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Interface62 arg3) {
		@Pc(8) Class568 local8 = this.aClass568ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return null;
		}
		for (@Pc(15) Class594 local15 = local8.aClass594_2; local15 != null; local15 = local15.aClass594_3) {
			@Pc(20) Class120_Sub1_Sub1 local20 = local15.aClass120_Sub1_Sub1_1;
			if ((arg3 == null || arg3.method31790(local20, 1430385381)) && local20.aShort129 == arg1 && arg2 == local20.aShort127) {
				this.method31568(local20, false, (short) -7749);
				return local20;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!te", name = "ao", descriptor = "(Lclient!ase;ZS)V")
	void method31568(@OriginalArg(0) Class120_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) short arg2) {
		@Pc(11) int local11 = Math.min(this.anInt5245 * 1487025827 - 1, Math.max(0, arg0.aShort129));
		@Pc(23) int local23 = Math.min(this.anInt5245 * 1487025827 - 1, Math.max(0, arg0.aShort126));
		@Pc(35) int local35 = Math.min(this.anInt5246 * -1561777241 - 1, Math.max(0, arg0.aShort127));
		@Pc(47) int local47 = Math.min(this.anInt5246 * -1561777241 - 1, Math.max(0, arg0.aShort128));
		for (@Pc(49) int local49 = local11; local49 <= local23; local49++) {
			for (@Pc(54) int local54 = local35; local54 <= local47; local54++) {
				@Pc(67) Class568 local67 = this.aClass568ArrayArrayArray1[arg0.aByte99][local49][local54];
				if (local67 != null) {
					@Pc(72) Class594 local72 = local67.aClass594_2;
					@Pc(74) Class594 local74 = null;
					while (local72 != null) {
						if (arg0 == local72.aClass120_Sub1_Sub1_1) {
							if (local74 == null) {
								local67.aClass594_2 = local72.aClass594_3;
							} else {
								local74.aClass594_3 = local72.aClass594_3;
							}
							local72.method31949(-443432817);
							break;
						}
						local74 = local72;
						local72 = local72.aClass594_3;
					}
				}
			}
		}
		if (!arg1) {
			this.method31569(arg0, (short) -10112);
		}
	}

	@OriginalMember(owner = "client!te", name = "aj", descriptor = "(Lclient!alf;S)V")
	void method31569(@OriginalArg(0) Class120_Sub1 arg0, @OriginalArg(1) short arg1) {
		if (arg0 == null) {
			return;
		}
		arg0.method24535();
		for (@Pc(6) int local6 = 0; local6 < 2; local6++) {
			@Pc(11) Class120_Sub1 local11 = null;
			@Pc(16) Class120_Sub1 local16;
			for (local16 = this.aClass120_Sub1Array2[local6]; local16 != null; local16 = local16.aClass120_Sub1_23) {
				if (arg0 == local16) {
					if (local11 == null) {
						this.aClass120_Sub1Array2[local6] = local16.aClass120_Sub1_23;
					} else {
						local11.aClass120_Sub1_23 = local16.aClass120_Sub1_23;
					}
					return;
				}
				local11 = local16;
			}
			local11 = null;
			for (local16 = this.aClass120_Sub1Array1[local6]; local16 != null; local16 = local16.aClass120_Sub1_23) {
				if (local16 == arg0) {
					if (local11 == null) {
						this.aClass120_Sub1Array1[local6] = local16.aClass120_Sub1_23;
					} else {
						local11.aClass120_Sub1_23 = local16.aClass120_Sub1_23;
					}
					return;
				}
				local11 = local16;
			}
			local11 = null;
			for (local16 = this.aClass120_Sub1Array3[local6]; local16 != null; local16 = local16.aClass120_Sub1_23) {
				if (arg0 == local16) {
					if (local11 == null) {
						this.aClass120_Sub1Array3[local6] = local16.aClass120_Sub1_23;
					} else {
						local11.aClass120_Sub1_23 = local16.aClass120_Sub1_23;
					}
					return;
				}
				local11 = local16;
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "ac", descriptor = "(IIIB)Lclient!asi;")
	public Class120_Sub1_Sub2 method31570(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		@Pc(8) Class568 local8 = this.aClass568ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass120_Sub1_Sub2_1;
	}

	@OriginalMember(owner = "client!te", name = "et", descriptor = "()V")
	public void method31571() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5242 * 1984662039; local1++) {
			for (@Pc(9) int local9 = 0; local9 < this.anInt5245 * 1487025827; local9++) {
				for (@Pc(17) int local17 = 0; local17 < this.anInt5246 * -1561777241; local17++) {
					@Pc(32) Class568 local32 = this.aClass568ArrayArrayArray1[local1][local9][local17];
					if (local32 != null) {
						@Pc(38) Class120_Sub1_Sub2 local38 = local32.aClass120_Sub1_Sub2_1;
						@Pc(41) Class120_Sub1_Sub2 local41 = local32.aClass120_Sub1_Sub2_2;
						if (local38 != null && local38.method24566((byte) -38)) {
							this.method31579(local38, local1, local9, local17, 1, 1);
							if (local41 != null && local41.method24566((byte) 44)) {
								this.method31579(local41, local1, local9, local17, 1, 1);
								local41.method24569(this.aClass102_12, local38, 0, 0, 0, false, -1296402340);
								local41.method24570(65280);
							}
							local38.method24570(65280);
						}
						for (@Pc(90) Class594 local90 = local32.aClass594_2; local90 != null; local90 = local90.aClass594_3) {
							@Pc(96) Class120_Sub1_Sub1 local96 = local90.aClass120_Sub1_Sub1_1;
							if (local96 != null && local96.method24566((byte) 55)) {
								this.method31579(local96, local1, local9, local17, local96.aShort126 - local96.aShort129 + 1, local96.aShort128 - local96.aShort127 + 1);
								local96.method24570(65280);
							}
						}
						@Pc(133) Class120_Sub1_Sub4 local133 = local32.aClass120_Sub1_Sub4_1;
						if (local133 != null && local133.method24566((byte) -90)) {
							this.method31578(local133, local1, local9, local17, 1888663078);
							local133.method24570(65280);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "ab", descriptor = "(IIIB)Lclient!asq;")
	public Class120_Sub1_Sub3 method31572(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		@Pc(8) Class568 local8 = this.aClass568ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass120_Sub1_Sub3_1;
	}

	@OriginalMember(owner = "client!te", name = "dr", descriptor = "(III)Lclient!asi;")
	public Class120_Sub1_Sub2 method31573(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class568 local8 = this.aClass568ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			this.method31569(local8.aClass120_Sub1_Sub2_2, (short) 6560);
			if (local8.aClass120_Sub1_Sub2_2 != null) {
				@Pc(23) Class120_Sub1_Sub2 local23 = local8.aClass120_Sub1_Sub2_2;
				local8.aClass120_Sub1_Sub2_2 = null;
				return local23;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!te", name = "ah", descriptor = "(IIILclient!tc;B)Lclient!ase;")
	public Class120_Sub1_Sub1 method31574(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Interface62 arg3, @OriginalArg(4) byte arg4) {
		@Pc(8) Class568 local8 = this.aClass568ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return null;
		}
		for (@Pc(15) Class594 local15 = local8.aClass594_2; local15 != null; local15 = local15.aClass594_3) {
			@Pc(21) Class120_Sub1_Sub1 local21 = local15.aClass120_Sub1_Sub1_1;
			if ((arg3 == null || arg3.method31790(local21, 1430385381)) && arg1 == local21.aShort129 && arg2 == local21.aShort127) {
				return local21;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!te", name = "af", descriptor = "(IIII)Lclient!uj;")
	public Class594 method31575(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class568 local8 = this.aClass568ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass594_2;
	}

	@OriginalMember(owner = "client!te", name = "cc", descriptor = "(II)I")
	public int method31576(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aByteArrayArray23 == null ? 0 : this.aByteArrayArray23[arg0][arg1] & 0xFF;
	}

	@OriginalMember(owner = "client!te", name = "ak", descriptor = "()V")
	public void method31577() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5242 * 1984662039; local1++) {
			for (@Pc(9) int local9 = 0; local9 < this.anInt5245 * 1487025827; local9++) {
				for (@Pc(17) int local17 = 0; local17 < this.anInt5246 * -1561777241; local17++) {
					@Pc(32) Class568 local32 = this.aClass568ArrayArrayArray1[local1][local9][local17];
					if (local32 != null) {
						@Pc(38) Class120_Sub1_Sub2 local38 = local32.aClass120_Sub1_Sub2_1;
						@Pc(41) Class120_Sub1_Sub2 local41 = local32.aClass120_Sub1_Sub2_2;
						if (local38 != null && local38.method24566((byte) 34)) {
							this.method31579(local38, local1, local9, local17, 1, 1);
							if (local41 != null && local41.method24566((byte) 16)) {
								this.method31579(local41, local1, local9, local17, 1, 1);
								local41.method24569(this.aClass102_12, local38, 0, 0, 0, false, -1296402340);
								local41.method24570(65280);
							}
							local38.method24570(65280);
						}
						for (@Pc(90) Class594 local90 = local32.aClass594_2; local90 != null; local90 = local90.aClass594_3) {
							@Pc(96) Class120_Sub1_Sub1 local96 = local90.aClass120_Sub1_Sub1_1;
							if (local96 != null && local96.method24566((byte) 78)) {
								this.method31579(local96, local1, local9, local17, local96.aShort126 - local96.aShort129 + 1, local96.aShort128 - local96.aShort127 + 1);
								local96.method24570(65280);
							}
						}
						@Pc(133) Class120_Sub1_Sub4 local133 = local32.aClass120_Sub1_Sub4_1;
						if (local133 != null && local133.method24566((byte) -51)) {
							this.method31578(local133, local1, local9, local17, 1888663078);
							local133.method24570(65280);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "at", descriptor = "(Lclient!alf;IIII)V")
	void method31578(@OriginalArg(0) Class120_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(16) Class568 local16;
		@Pc(128) int local128;
		if (arg2 < this.anInt5245 * 1487025827) {
			local16 = this.aClass568ArrayArrayArray1[arg1][arg2 + 1][arg3];
			if (local16 != null && local16.aClass120_Sub1_Sub4_1 != null && local16.aClass120_Sub1_Sub4_1.method24566((byte) -111)) {
				local128 = (this.aClass100Array1[arg1].method2917(arg2 + 1, arg3, -1987536343) + this.aClass100Array1[arg1].method2917(arg2 + 1 + 1, arg3, -548279024) + this.aClass100Array1[arg1].method2917(arg2 + 1, arg3 + 1, -838477827) + this.aClass100Array1[arg1].method2917(arg2 + 1 + 1, arg3 + 1, -1612640268)) / 4 - (this.aClass100Array1[arg1].method2917(arg2, arg3, -836363512) + this.aClass100Array1[arg1].method2917(arg2 + 1, arg3, -334994233) + this.aClass100Array1[arg1].method2917(arg2, arg3 + 1, -1925436173) + this.aClass100Array1[arg1].method2917(arg2 + 1, arg3 + 1, -1932678174)) / 4;
				arg0.method24569(this.aClass102_12, local16.aClass120_Sub1_Sub4_1, this.anInt5238 * 1533693671, local128, 0, true, -1296402340);
			}
		}
		if (arg3 < this.anInt5245 * 1487025827) {
			local16 = this.aClass568ArrayArrayArray1[arg1][arg2][arg3 + 1];
			if (local16 != null && local16.aClass120_Sub1_Sub4_1 != null && local16.aClass120_Sub1_Sub4_1.method24566((byte) 16)) {
				local128 = (this.aClass100Array1[arg1].method2917(arg2, arg3, -726340363) + this.aClass100Array1[arg1].method2917(arg2 + 1, arg3 + 1, -1529449315) + this.aClass100Array1[arg1].method2917(arg2, arg3 + 1 + 1, -1008795905) + this.aClass100Array1[arg1].method2917(arg2 + 1, arg3 + 1 + 1, -915907516)) / 4 - (this.aClass100Array1[arg1].method2917(arg2, arg3, -218321332) + this.aClass100Array1[arg1].method2917(arg2 + 1, arg3, -1692308706) + this.aClass100Array1[arg1].method2917(arg2, arg3 + 1, -1855886882) + this.aClass100Array1[arg1].method2917(arg2 + 1, arg3 + 1, -1579582179)) / 4;
				arg0.method24569(this.aClass102_12, local16.aClass120_Sub1_Sub4_1, 0, local128, this.anInt5238 * 1533693671, true, -1296402340);
			}
		}
		if (arg2 < this.anInt5245 * 1487025827 && arg3 < this.anInt5246 * -1561777241) {
			local16 = this.aClass568ArrayArrayArray1[arg1][arg2 + 1][arg3 + 1];
			if (local16 != null && local16.aClass120_Sub1_Sub4_1 != null && local16.aClass120_Sub1_Sub4_1.method24566((byte) -105)) {
				local128 = (this.aClass100Array1[arg1].method2917(arg2 + 1, arg3 + 1, -490908853) + this.aClass100Array1[arg1].method2917(arg2 + 1 + 1, arg3 + 1, -544596756) + this.aClass100Array1[arg1].method2917(arg2 + 1, 1 + 1 + arg3, -1478598586) + this.aClass100Array1[arg1].method2917(arg2 + 1 + 1, arg3 + 1 + 1, -575481725)) / 4 - (this.aClass100Array1[arg1].method2917(arg2, arg3, -622389829) + this.aClass100Array1[arg1].method2917(arg2 + 1, arg3, -2003209461) + this.aClass100Array1[arg1].method2917(arg2, arg3 + 1, -1716661908) + this.aClass100Array1[arg1].method2917(arg2 + 1, arg3 + 1, -1697373176)) / 4;
				arg0.method24569(this.aClass102_12, local16.aClass120_Sub1_Sub4_1, this.anInt5238 * 1533693671, local128, this.anInt5238 * 1533693671, true, -1296402340);
			}
		}
		if (arg2 >= this.anInt5245 * 1487025827 || arg3 <= 0) {
			return;
		}
		local16 = this.aClass568ArrayArrayArray1[arg1][arg2 + 1][arg3 - 1];
		if (local16 != null && local16.aClass120_Sub1_Sub4_1 != null && local16.aClass120_Sub1_Sub4_1.method24566((byte) 89)) {
			local128 = (this.aClass100Array1[arg1].method2917(arg2 + 1, arg3 - 1, -386921650) + this.aClass100Array1[arg1].method2917(1 + 1 + arg2, arg3 - 1, -1638856888) + this.aClass100Array1[arg1].method2917(arg2 + 1, arg3 + 1 - 1, -1784963154) + this.aClass100Array1[arg1].method2917(arg2 + 1 + 1, arg3 + 1 - 1, -950858728)) / 4 - (this.aClass100Array1[arg1].method2917(arg2, arg3, -339801104) + this.aClass100Array1[arg1].method2917(arg2 + 1, arg3, -629590440) + this.aClass100Array1[arg1].method2917(arg2, arg3 + 1, -1034485611) + this.aClass100Array1[arg1].method2917(arg2 + 1, arg3 + 1, -345352500)) / 4;
			arg0.method24569(this.aClass102_12, local16.aClass120_Sub1_Sub4_1, this.anInt5238 * 1533693671, local128, -(this.anInt5238 * 1533693671), true, -1296402340);
		}
	}

	@OriginalMember(owner = "client!te", name = "ad", descriptor = "(Lclient!alf;IIIII)V")
	void method31579(@OriginalArg(0) Class120_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != this.anInt5242 * 1984662039) {
				for (@Pc(31) int local31 = local3; local31 <= local7; local31++) {
					if (local31 >= 0 && local31 < this.anInt5245 * 1487025827) {
						for (@Pc(45) int local45 = local11; local45 <= local15; local45++) {
							if (local45 >= 0 && local45 < this.anInt5246 * -1561777241 && (!local1 || local31 >= local7 || local45 >= local15 || local45 < arg3 && arg2 != local31)) {
								@Pc(81) Class568 local81 = this.aClass568ArrayArrayArray1[local17][local31][local45];
								if (local81 != null) {
									@Pc(177) int local177 = (this.aClass100Array1[local17].method2917(local31, local45, -1856330050) + this.aClass100Array1[local17].method2917(local31 + 1, local45, -536208951) + this.aClass100Array1[local17].method2917(local31, local45 + 1, -559065335) + this.aClass100Array1[local17].method2917(local31 + 1, local45 + 1, -1568374435)) / 4 - (this.aClass100Array1[arg1].method2917(arg2, arg3, -1916362950) + this.aClass100Array1[arg1].method2917(arg2 + 1, arg3, -685349674) + this.aClass100Array1[arg1].method2917(arg2, arg3 + 1, -888026902) + this.aClass100Array1[arg1].method2917(arg2 + 1, arg3 + 1, -1581140624)) / 4;
									@Pc(180) Class120_Sub1_Sub2 local180 = local81.aClass120_Sub1_Sub2_1;
									@Pc(183) Class120_Sub1_Sub2 local183 = local81.aClass120_Sub1_Sub2_2;
									if (local180 != null && local180.method24566((byte) 57)) {
										arg0.method24569(this.aClass102_12, local180, this.anInt5238 * 1533693671 * (local31 - arg2) + (1 - arg4) * 2105539397 * this.anInt5239, local177, (1 - arg5) * this.anInt5239 * 2105539397 + this.anInt5238 * 1533693671 * (local45 - arg3), local1, -1296402340);
									}
									if (local183 != null && local183.method24566((byte) 40)) {
										arg0.method24569(this.aClass102_12, local183, this.anInt5238 * 1533693671 * (local31 - arg2) + this.anInt5239 * 2105539397 * (1 - arg4), local177, (local45 - arg3) * this.anInt5238 * 1533693671 + (1 - arg5) * 2105539397 * this.anInt5239, local1, -1296402340);
									}
									for (@Pc(283) Class594 local283 = local81.aClass594_2; local283 != null; local283 = local283.aClass594_3) {
										@Pc(288) Class120_Sub1_Sub1 local288 = local283.aClass120_Sub1_Sub1_1;
										if (local288 != null && local288.method24566((byte) -83) && (local31 == local288.aShort129 || local31 == local3) && (local45 == local288.aShort127 || local11 == local45)) {
											@Pc(317) int local317 = local288.aShort126 - local288.aShort129 + 1;
											@Pc(325) int local325 = local288.aShort128 - local288.aShort127 + 1;
											arg0.method24569(this.aClass102_12, local288, (local288.aShort129 - arg2) * 1533693671 * this.anInt5238 + (local317 - arg4) * this.anInt5239 * 2105539397, local177, (local325 - arg5) * this.anInt5239 * 2105539397 + (local288.aShort127 - arg3) * this.anInt5238 * 1533693671, local1, -1296402340);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "av", descriptor = "(IIII[[[B[I[I[I[I[IIBIIZZIZ)V")
	public void method31580(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[][][] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) byte arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14, @OriginalArg(15) boolean arg15, @OriginalArg(16) int arg16, @OriginalArg(17) boolean arg17) {
		this.aClass600_1.aBoolean927 = true;
		this.aBoolean918 = arg15;
		this.anInt5241 = (arg1 >> this.anInt5258 * 1479624119) * 898097741;
		this.anInt5253 = (arg3 >> this.anInt5258 * 1479624119) * 1850140445;
		this.anInt5254 = arg1 * -709052753;
		this.anInt5255 = arg3 * -1061261773;
		this.anInt5256 = arg2 * 1245061399;
		this.anInt5249 = this.anInt5241 * 504493359 - this.anInt5244 * 1553884257;
		if (this.anInt5249 * -1587881333 < 0) {
			this.anInt5259 = -(this.anInt5249 * -764206337);
			this.anInt5249 = 0;
		} else {
			this.anInt5259 = 0;
		}
		this.anInt5262 = this.anInt5253 * -179227047 - this.anInt5244 * -1110332153;
		if (this.anInt5262 * -393076675 < 0) {
			this.anInt5260 = -(this.anInt5262 * 929057875);
			this.anInt5262 = 0;
		} else {
			this.anInt5260 = 0;
		}
		this.anInt5261 = this.anInt5244 * 1463630995 + this.anInt5241 * -1700868323;
		if (this.anInt5261 * 1265602697 > this.anInt5245 * 1487025827) {
			this.anInt5261 = this.anInt5245 * 629885643;
		}
		this.anInt5266 = this.anInt5253 * -130967243 + this.anInt5244 * 1059640491;
		if (this.anInt5266 * -85405183 > this.anInt5246 * -1561777241) {
			this.anInt5266 = this.anInt5246 * 1813917095;
		}
		@Pc(156) boolean[][] local156 = this.aBooleanArrayArray20;
		@Pc(159) boolean[][] local159 = this.aBooleanArrayArray21;
		@Pc(164) int local164;
		@Pc(179) int local179;
		if (this.aBoolean918) {
			for (local164 = 0; local164 < this.anInt5244 * 1989483179 + this.anInt5244 * 1989483179 + 2; local164++) {
				local179 = 0;
				@Pc(181) int local181 = 0;
				for (@Pc(183) int local183 = 0; local183 < this.anInt5244 * 1989483179 + 2 + this.anInt5244 * 1989483179; local183++) {
					if (local183 > 1) {
						this.anIntArray475[local183 - 2] = local179;
					}
					local179 = local181;
					@Pc(220) int local220 = local164 + (this.anInt5241 * 1611671173 - this.anInt5244 * 1989483179);
					@Pc(232) int local232 = this.anInt5253 * 1105662773 - this.anInt5244 * 1989483179 + local183;
					@Pc(255) int local255;
					if (local220 >= 0 && local232 >= 0 && local220 < this.anInt5245 * 1487025827 && local232 < this.anInt5246 * -1561777241) {
						local255 = local220 << this.anInt5258 * 1479624119;
						@Pc(262) int local262 = local232 << this.anInt5258 * 1479624119;
						@Pc(284) int local284 = this.aClass100Array3[this.aClass100Array3.length - 1].method2917(local220, local232, -2021939210) - (0x3E8 << this.anInt5258 * 1479624119 - 7);
						@Pc(324) int local324 = (this.aClass100Array2 == null ? this.aClass100Array3[0].method2917(local220, local232, -1551037130) + this.anInt5238 * 1533693671 : this.aClass100Array2[0].method2917(local220, local232, -1091908648) + this.anInt5238 * 1533693671) + (0x3E8 << this.anInt5258 * 1479624119 - 7);
						local181 = this.aClass102_12.method20872(local255, local284, local262, local255, local324, local262);
						this.aBooleanArrayArray21[local164][local183] = local181 == 0;
					} else {
						local181 = -1;
						this.aBooleanArrayArray21[local164][local183] = false;
					}
					if (local164 > 0 && local183 > 0) {
						local255 = this.anIntArray475[local183 - 1] & this.anIntArray475[local183] & local179 & local181;
						this.aBooleanArrayArray20[local164 - 1][local183 - 1] = local255 == 0;
					}
				}
				this.anIntArray475[this.anInt5244 * 1989483179 + this.anInt5244 * 1989483179] = local179;
				this.anIntArray475[this.anInt5244 * 1989483179 + 1 + this.anInt5244 * 1989483179] = local181;
			}
			if (arg17) {
				this.aClass600_1.anIntArray491 = arg5;
				this.aClass600_1.anIntArray489 = arg6;
				this.aClass600_1.anIntArray488 = arg7;
				this.aClass600_1.anIntArray486 = arg8;
				this.aClass600_1.anIntArray490 = arg9;
				this.aClass600_1.method32094(this.aClass102_12, arg10);
			} else {
				this.aClass600_1.aBoolean927 = false;
			}
		} else {
			if (this.aBooleanArrayArray19 == null) {
				this.aBooleanArrayArray19 = new boolean[this.anInt5244 * 1989483179 + this.anInt5244 * 1989483179 + 2][this.anInt5244 * 1989483179 + this.anInt5244 * 1989483179 + 2];
			}
			for (local164 = 0; local164 < this.aBooleanArrayArray19.length; local164++) {
				for (local179 = 0; local179 < this.aBooleanArrayArray19[0].length; local179++) {
					this.aBooleanArrayArray19[local164][local179] = true;
				}
			}
			this.aBooleanArrayArray21 = this.aBooleanArrayArray19;
			this.aBooleanArrayArray20 = this.aBooleanArrayArray19;
			this.anInt5249 = 0;
			this.anInt5262 = 0;
			this.anInt5261 = this.anInt5245 * 629885643;
			this.anInt5266 = this.anInt5246 * 1813917095;
			this.aClass600_1.aBoolean927 = false;
		}
		Class445.method29237(this, this.aClass102_12, -1334357361);
		if (!this.aClass582_1.aBoolean922) {
			@Pc(557) Iterator local557 = this.aClass582_1.aList24.iterator();
			while (local557.hasNext()) {
				@Pc(564) Class573 local564 = (Class573) local557.next();
				local557.remove();
				Class558.method31398(local564, (byte) 0);
			}
		}
		if (this.aBoolean916) {
			for (local164 = 0; local164 < this.anInt5264 * 2006038777; local164++) {
				this.aClass595Array1[local164].method31958(arg0, arg14, (byte) 82);
			}
		}
		if (this.aClass568ArrayArrayArray2 != null) {
			this.method31540(true, 567884320);
			this.aClass102_12.method20787(-1, new Class229(1583160, 40, 127, 63, 0, 0, 0));
			this.method31700(true, arg4, arg10, arg11, arg16);
			this.aClass102_12.method20699();
			this.method31540(false, 567884320);
		}
		this.method31700(false, arg4, arg10, arg11, arg16);
		if (!this.aBoolean918) {
			this.aBooleanArrayArray20 = local156;
			this.aBooleanArrayArray21 = local159;
		}
	}

	@OriginalMember(owner = "client!te", name = "fl", descriptor = "()V")
	public void method31581() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5264 * 2006038777; local1++) {
			if (!this.aBooleanArray32[local1]) {
				@Pc(17) Class595 local17 = this.aClass595Array1[local1];
				@Pc(20) Class80_Sub12 local20 = local17.aClass80_Sub12_3;
				@Pc(25) int local25 = local17.anInt5347 * -1434233081;
				@Pc(34) int local34 = local20.method13952(-432544427) - this.anInt5239 * 2105539397;
				@Pc(45) int local45 = (local34 * 2 >> this.anInt5258 * 1479624119) + 1;
				@Pc(47) int local47 = 0;
				@Pc(52) int[] local52 = new int[local45 * local45];
				@Pc(63) int local63 = local20.method13949((byte) 0) - local34 >> this.anInt5258 * 1479624119;
				@Pc(74) int local74 = local20.method13970(591259797) - local34 >> this.anInt5258 * 1479624119;
				@Pc(85) int local85 = local20.method13970(4137377) + local34 >> this.anInt5258 * 1479624119;
				if (local74 < 0) {
					local47 -= local74;
					local74 = 0;
				}
				if (local85 >= this.anInt5246 * -1561777241) {
					local85 = this.anInt5246 * -1561777241 - 1;
				}
				for (@Pc(108) int local108 = local74; local108 <= local85; local108++) {
					@Pc(116) short local116 = local17.aShortArray142[local47];
					@Pc(120) int local120 = local116 >>> 8;
					@Pc(126) int local126 = local120 + local45 * local47;
					@Pc(132) int local132 = local63 + (local116 >>> 8);
					@Pc(140) int local140 = local132 + (local116 & 0xFF) - 1;
					if (local132 < 0) {
						local126 -= local132;
						local132 = 0;
					}
					if (local140 >= this.anInt5245 * 1487025827) {
						local140 = this.anInt5245 * 1487025827 - 1;
					}
					for (@Pc(163) int local163 = local132; local163 <= local140; local163++) {
						@Pc(168) byte local168 = 1;
						@Pc(176) Class120_Sub1_Sub1 local176 = this.method31574(local25, local163, local108, null, (byte) -102);
						if (local176 != null && local176.aByte98 != 0) {
							@Pc(195) boolean local195;
							@Pc(204) boolean local204;
							@Pc(218) short local218;
							@Pc(224) int local224;
							@Pc(230) int local230;
							if (local176.aByte98 == 1) {
								local195 = local163 - 1 >= local132;
								local204 = local163 + 1 <= local140;
								if (!local195 && local108 + 1 <= local85) {
									local218 = local17.aShortArray142[local47 + 1];
									local224 = (local218 >>> 8) + local63;
									local230 = (local218 & 0xFF) + local224;
									local195 = local163 > local224 && local163 < local230;
								}
								if (!local204 && local108 - 1 >= local74) {
									local218 = local17.aShortArray142[local47 - 1];
									local224 = local63 + (local218 >>> 8);
									local230 = (local218 & 0xFF) + local224;
									local204 = local163 > local224 && local163 < local230;
								}
								if (local195 && !local204) {
									local168 = 4;
								} else if (local204 && !local195) {
									local168 = 2;
								}
							} else {
								local195 = local163 - 1 >= local132;
								local204 = local163 + 1 <= local140;
								if (!local195 && local108 - 1 >= local74) {
									local218 = local17.aShortArray142[local47 - 1];
									local224 = local63 + (local218 >>> 8);
									local230 = (local218 & 0xFF) + local224;
									local195 = local163 > local224 && local163 < local230;
								}
								if (!local204 && local108 + 1 <= local85) {
									local218 = local17.aShortArray142[local47 + 1];
									local224 = (local218 >>> 8) + local63;
									local230 = local224 + (local218 & 0xFF);
									local204 = local163 > local224 && local163 < local230;
								}
								if (local195 && !local204) {
									local168 = 3;
								} else if (local204 && !local195) {
									local168 = 5;
								}
							}
						}
						local52[local126++] = local168;
					}
					local47++;
				}
				this.aBooleanArray32[local1] = true;
				if (aBoolean917) {
					this.aClass100Array1[local25].method2923(local20, local52);
				}
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "aa", descriptor = "(Lclient!alf;I)V")
	void method31582(@OriginalArg(0) Class120_Sub1 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class463 local3 = arg0.method24552().aClass463_61;
		this.aClass102_12.method21114((float) local3.aFloat297, (float) ((int) local3.aFloat295 + (arg0.method24578(986228218) >> 1)), (float) local3.aFloat296, this.aFloatArray117);
		arg0.anInt3297 = (int) this.aFloatArray117[2] * -1192900247;
	}

	@OriginalMember(owner = "client!te", name = "ae", descriptor = "([Lclient!alf;II)V")
	void method31583(@OriginalArg(0) Class120_Sub1[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(8) int local8 = (arg1 + arg2) / 2;
		@Pc(10) int local10 = arg1;
		@Pc(14) Class120_Sub1 local14 = arg0[local8];
		arg0[local8] = arg0[arg2];
		arg0[arg2] = local14;
		@Pc(29) int local29 = local14.anInt3297 * -1640540455;
		for (@Pc(31) int local31 = arg1; local31 < arg2; local31++) {
			if (arg0[local31].anInt3297 * -1640540455 > local29 + (local31 & 0x1)) {
				@Pc(50) Class120_Sub1 local50 = arg0[local31];
				arg0[local31] = arg0[local10];
				arg0[local10++] = local50;
			}
		}
		arg0[arg2] = arg0[local10];
		arg0[local10] = local14;
		this.method31583(arg0, arg1, local10 - 1);
		this.method31583(arg0, local10 + 1, arg2);
	}

	@OriginalMember(owner = "client!te", name = "ap", descriptor = "([Lclient!alf;II)V")
	void method31584(@OriginalArg(0) Class120_Sub1[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(8) int local8 = (arg1 + arg2) / 2;
		@Pc(10) int local10 = arg1;
		@Pc(14) Class120_Sub1 local14 = arg0[local8];
		arg0[local8] = arg0[arg2];
		arg0[arg2] = local14;
		@Pc(29) int local29 = local14.anInt3297 * -1640540455;
		for (@Pc(31) int local31 = arg1; local31 < arg2; local31++) {
			if (arg0[local31].anInt3297 * -1640540455 < local29 + (local31 & 0x1)) {
				@Pc(50) Class120_Sub1 local50 = arg0[local31];
				arg0[local31] = arg0[local10];
				arg0[local10++] = local50;
			}
		}
		arg0[arg2] = arg0[local10];
		arg0[local10] = local14;
		this.method31584(arg0, arg1, local10 - 1);
		this.method31584(arg0, local10 + 1, arg2);
	}

	@OriginalMember(owner = "client!te", name = "ar", descriptor = "(Lclient!alf;Z[[[BIB)Z")
	boolean method31585(@OriginalArg(0) Class120_Sub1 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte[][][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		if (!this.aBoolean918) {
			return false;
		} else if (arg0 instanceof Class120_Sub1_Sub1) {
			@Pc(11) short local11 = ((Class120_Sub1_Sub1) arg0).aShort126;
			@Pc(15) short local15 = ((Class120_Sub1_Sub1) arg0).aShort128;
			@Pc(19) short local19 = ((Class120_Sub1_Sub1) arg0).aShort129;
			@Pc(23) short local23 = ((Class120_Sub1_Sub1) arg0).aShort127;
			for (@Pc(25) int local25 = local19; local25 <= local11; local25++) {
				for (@Pc(30) int local30 = local23; local30 <= local15; local30++) {
					if (arg0.aByte100 < this.anInt5242 * 1984662039 && local25 >= this.anInt5249 * -1587881333 && local25 < this.anInt5261 * 1265602697 && local30 >= this.anInt5262 * -393076675 && local30 < this.anInt5266 * -85405183) {
						if ((arg2 == null || arg0.aByte99 < arg3 || arg2[arg0.aByte99][local25][local30] != arg4) && arg0.method24576((short) -26760) && !arg0.method24575(this.aClass102_12, -1380987821)) {
							return false;
						}
						if (!arg1 && local25 >= this.anInt5241 * 1611671173 - 16 && local25 <= this.anInt5241 * 1611671173 + 16 && local30 >= this.anInt5253 * 1105662773 - 16 && local30 <= this.anInt5253 * 1105662773 + 16) {
							arg0.method24572(this.aClass102_12, (byte) -117);
						}
						return true;
					}
				}
			}
			return true;
		} else {
			@Pc(144) Class463 local144 = arg0.method24552().aClass463_61;
			@Pc(153) int local153 = (int) local144.aFloat297 >> this.anInt5258 * 1479624119;
			@Pc(162) int local162 = (int) local144.aFloat296 >> this.anInt5258 * 1479624119;
			if (arg0.aByte100 >= this.anInt5242 * 1984662039 || local153 < this.anInt5249 * -1587881333 || local153 >= this.anInt5261 * 1265602697 || local162 < this.anInt5262 * -393076675 || local162 >= this.anInt5266 * -85405183) {
				return true;
			} else if ((arg2 == null || arg0.aByte99 < arg3 || arg2[arg0.aByte99][local153][local162] != arg4) && arg0.method24576((short) 8509) && !arg0.method24575(this.aClass102_12, -1380987821)) {
				return false;
			} else {
				if (!arg1 && local153 >= this.anInt5241 * 1611671173 - 16 && local153 <= this.anInt5241 * 1611671173 + 16 && local162 >= this.anInt5253 * 1105662773 - 16 && local162 <= this.anInt5253 * 1105662773 + 16) {
					arg0.method24572(this.aClass102_12, (byte) -3);
				}
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "au", descriptor = "(Lclient!alf;[Lclient!akb;)V")
	void method31586(@OriginalArg(0) Class120_Sub1 arg0, @OriginalArg(1) Class80_Sub12[] arg1) {
		@Pc(7) int local7;
		if (this.aBoolean916) {
			local7 = arg0.method24574(arg1, 78329285);
			this.aClass102_12.method20770(local7, arg1);
		}
		if (this.aClass100Array1 == this.aClass100Array2) {
			@Pc(19) boolean local19 = false;
			@Pc(21) boolean local21 = false;
			@Pc(25) Class463 local25 = arg0.method24552().aClass463_61;
			@Pc(36) int local36;
			if (arg0 instanceof Class120_Sub1_Sub1) {
				local7 = ((Class120_Sub1_Sub1) arg0).aShort129;
				local36 = ((Class120_Sub1_Sub1) arg0).aShort127;
			} else {
				local7 = (int) local25.aFloat297 >> this.anInt5258 * 1479624119;
				local36 = (int) local25.aFloat296 >> this.anInt5258 * 1479624119;
			}
			local7 = Math.min(this.anInt5245 * 1487025827 - 1, Math.max(0, local7));
			local36 = Math.min(this.anInt5246 * -1561777241 - 1, Math.max(0, local36));
			@Pc(81) Class229 local81 = new Class229();
			local81.anInt3687 = this.method31548(local7, local36, (short) 10243) * 899347469;
			local81.anInt3685 = this.method31547(local7, local36, (byte) -47) * -491759939;
			local81.anInt3686 = this.method31716(local7, local36, (byte) 61) * 1857469271;
			local81.anInt3684 = this.method31550(local7, local36, -2132972937) * 60460553;
			local81.anInt3689 = this.method31555(local7, local36, (byte) -9) * 771615817;
			local81.anInt3690 = this.method31552(local7, local36, 1797895484) * 1711455315;
			this.aClass102_12.method20868(this.aClass100Array3[0].method2915((int) local25.aFloat297, (int) local25.aFloat296, (byte) -22), local81);
		}
		@Pc(157) Class573 local157 = arg0.method24571(this.aClass102_12, -1368546350);
		if (local157 == null) {
			return;
		}
		if (local157.aBoolean919) {
			local157.aClass120_Sub1_25 = arg0;
			this.aClass582_1.method31829(local157, -1612485906);
		} else {
			Class558.method31398(local157, (byte) 0);
		}
	}

	@OriginalMember(owner = "client!te", name = "az", descriptor = "(Lclient!arx;III[ZI)Z")
	public boolean method31587(@OriginalArg(0) Class80_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = false;
		if (this.aClass100Array1 != this.aClass100Array2) {
			@Pc(15) int local15 = this.aClass100Array3[arg1].method2915(arg2, arg3, (byte) -3);
			for (@Pc(17) int local17 = 0; local17 <= arg1; local17++) {
				@Pc(25) Class100 local25 = this.aClass100Array3[local17];
				if (local25 != null) {
					@Pc(37) int local37 = local15 - local25.method2915(arg2, arg3, (byte) -60);
					if (arg4 != null) {
						arg4[local17] = local25.method2922(arg0, arg2, local37, arg3, 0, false);
						if (!arg4[local17]) {
							continue;
						}
					}
					local25.method2920(arg0, arg2, local37, arg3, 0, false);
					local1 = true;
				}
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!te", name = "as", descriptor = "(Lclient!arx;III[ZI)V")
	public void method31588(@OriginalArg(0) Class80_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4, @OriginalArg(5) int arg5) {
		if (this.aClass100Array2 == this.aClass100Array1) {
			return;
		}
		@Pc(13) int local13 = this.aClass100Array3[arg1].method2915(arg2, arg3, (byte) -76);
		for (@Pc(15) int local15 = 0; local15 <= arg1; local15++) {
			if (arg4 == null || arg4[local15]) {
				@Pc(29) Class100 local29 = this.aClass100Array3[local15];
				if (local29 != null) {
					local29.method2921(arg0, arg2, local13 - local29.method2915(arg2, arg3, (byte) -127), arg3, 0, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "dd", descriptor = "(Lclient!ase;Z)Z")
	public boolean method31589(@OriginalArg(0) Class120_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(8) boolean local8 = this.aClass100Array2 == this.aClass100Array1;
		@Pc(10) int local10 = 0;
		@Pc(12) short local12 = 0;
		@Pc(14) byte local14 = 0;
		arg0.method24518(369296665);
		@Pc(19) short local19 = 0;
		@Pc(31) int local31 = Math.min(this.anInt5245 * 1487025827 - 1, Math.max(0, arg0.aShort129));
		@Pc(43) int local43 = Math.min(this.anInt5245 * 1487025827 - 1, Math.max(0, arg0.aShort126));
		@Pc(55) int local55 = Math.min(this.anInt5246 * -1561777241 - 1, Math.max(0, arg0.aShort127));
		@Pc(67) int local67 = Math.min(this.anInt5246 * -1561777241 - 1, Math.max(0, arg0.aShort128));
		@Pc(69) int local69;
		@Pc(74) int local74;
		for (local69 = local31; local69 <= local43; local69++) {
			for (local74 = local55; local74 <= local67; local74++) {
				@Pc(85) Class568 local85 = this.method31544(arg0.aByte99, local69, local74, (byte) 9);
				if (local85 != null) {
					@Pc(92) Class594 local92 = Class148_Sub1.method13461(arg0, -1188239002);
					@Pc(95) Class594 local95 = local85.aClass594_2;
					if (local95 == null) {
						local85.aClass594_2 = local92;
					} else {
						while (local95.aClass594_3 != null) {
							local95 = local95.aClass594_3;
						}
						local95.aClass594_3 = local92;
					}
					if (local8 && (this.anIntArrayArray62[local69][local74] & 0xFF000000) != 0) {
						local10 = this.anIntArrayArray62[local69][local74];
						local12 = this.aShortArrayArray4[local69][local74];
						local14 = this.aByteArrayArray25[local69][local74];
					}
					if (!arg1 && local85.aClass120_Sub1_Sub4_1 != null && local85.aClass120_Sub1_Sub4_1.aShort48 > local19) {
						local19 = local85.aClass120_Sub1_Sub4_1.aShort48;
					}
				}
			}
		}
		if (local8 && (local10 & 0xFF000000) != 0) {
			for (local69 = local31; local69 <= local43; local69++) {
				for (local74 = local55; local74 <= local67; local74++) {
					if ((this.anIntArrayArray62[local69][local74] & 0xFF000000) == 0) {
						this.anIntArrayArray62[local69][local74] = local10;
						this.aShortArrayArray4[local69][local74] = local12;
						this.aByteArrayArray25[local69][local74] = local14;
					}
				}
			}
		}
		if (arg1) {
			this.aClass120_Sub1_Sub1Array1[(this.anInt5248 += -1098035621) * 1760244179 - 1] = arg0;
			arg0.aClass570_23 = this;
		} else {
			local69 = this.aClass100Array1 == this.aClass100Array2 ? 1 : 0;
			if (!arg0.method24567(-32648954)) {
				arg0.aClass120_Sub1_23 = this.aClass120_Sub1Array3[local69];
				this.aClass120_Sub1Array3[local69] = arg0;
			} else if (arg0.method24565(-65263341)) {
				arg0.aClass120_Sub1_23 = this.aClass120_Sub1Array1[local69];
				this.aClass120_Sub1Array1[local69] = arg0;
			} else {
				arg0.aClass120_Sub1_23 = this.aClass120_Sub1Array2[local69];
				this.aClass120_Sub1Array2[local69] = arg0;
			}
		}
		if (arg1) {
			@Pc(293) Class463 local293 = Class463.method29472(arg0.method24552().aClass463_61);
			local293.aFloat295 -= local19;
			arg0.method24542(local293);
			local293.method29557();
		}
		return true;
	}

	@OriginalMember(owner = "client!te", name = "bg", descriptor = "(I)V")
	public void method31590(@OriginalArg(0) int arg0) {
		this.method31542(1, this.anInt5242 * 1984662039, (byte) 43);
	}

	@OriginalMember(owner = "client!te", name = "bl", descriptor = "(Lclient!uk;B)V")
	public void method31591(@OriginalArg(0) Class595 arg0, @OriginalArg(1) byte arg1) {
		if (this.anInt5264 * 2006038777 >= 65334) {
			return;
		}
		@Pc(9) Class80_Sub12 local9 = arg0.aClass80_Sub12_3;
		this.aClass595Array1[this.anInt5264 * 2006038777] = arg0;
		this.aBooleanArray32[this.anInt5264 * 2006038777] = false;
		this.anInt5264 += -1050834615;
		@Pc(36) int local36 = arg0.anInt5347 * -1434233081;
		if (arg0.aBoolean923) {
			local36 = 0;
		}
		@Pc(46) int local46 = arg0.anInt5347 * -1434233081;
		if (arg0.aBoolean924) {
			local46 = this.anInt5242 * 1984662039 - 1;
		}
		for (@Pc(58) int local58 = local36; local58 <= local46; local58++) {
			@Pc(63) int local63 = 0;
			@Pc(81) int local81 = local9.method13970(-285264803) - local9.method13952(-432544427) + this.anInt5239 * 2105539397 >> this.anInt5258 * 1479624119;
			if (local81 < 0) {
				local63 -= local81;
				local81 = 0;
			}
			@Pc(107) int local107 = local9.method13970(-1796116226) + local9.method13952(-432544427) - this.anInt5239 * 2105539397 >> this.anInt5258 * 1479624119;
			if (local107 >= this.anInt5246 * -1561777241) {
				local107 = this.anInt5246 * -1561777241 - 1;
			}
			for (@Pc(122) int local122 = local81; local122 <= local107; local122++) {
				@Pc(131) short local131 = arg0.aShortArray142[local63++];
				@Pc(153) int local153 = (local9.method13949((byte) 0) - local9.method13952(-432544427) + this.anInt5239 * 2105539397 >> this.anInt5258 * 1479624119) + (local131 >>> 8);
				@Pc(161) int local161 = (local131 & 0xFF) + local153 - 1;
				if (local153 < 0) {
					local153 = 0;
				}
				if (local161 >= this.anInt5245 * 1487025827) {
					local161 = this.anInt5245 * 1487025827 - 1;
				}
				for (@Pc(180) int local180 = local153; local180 <= local161; local180++) {
					@Pc(192) long local192 = this.aLongArrayArrayArray1[local58][local180][local122];
					if ((local192 & 0xFFFFL) == 0L) {
						this.aLongArrayArrayArray1[local58][local180][local122] = local192 | (long) (this.anInt5264 * 2006038777);
					} else if ((local192 & 0xFFFF0000L) == 0L) {
						this.aLongArrayArrayArray1[local58][local180][local122] = local192 | (long) (this.anInt5264 * 2006038777) << 16;
					} else if ((local192 & 0xFFFF00000000L) == 0L) {
						this.aLongArrayArrayArray1[local58][local180][local122] = local192 | (long) (this.anInt5264 * 2006038777) << 32;
					} else if ((local192 & 0xFFFF000000000000L) == 0L) {
						this.aLongArrayArrayArray1[local58][local180][local122] = local192 | (long) (this.anInt5264 * 2006038777) << 48;
					}
				}
			}
		}
		if (arg0.anInt5355 * 1791547589 == -1) {
			return;
		}
		@Pc(307) List local307 = (List) this.aHashMap11.get(arg0.anInt5355 * 1791547589);
		if (local307 == null) {
			local307 = new ArrayList();
			this.aHashMap11.put(arg0.anInt5355 * 1791547589, local307);
		}
		local307.add(arg0);
		@Pc(338) Class80_Sub12 local338 = (Class80_Sub12) this.aHashMap12.get(arg0.anInt5355 * 1791547589);
		if (local338 != null) {
			arg0.aClass80_Sub12_3.method13962(local338.method13953((byte) 110), (byte) 31);
			arg0.aClass80_Sub12_3.method13964(local338.method13968((byte) -102), local338.method13959((byte) 90), 34166);
			arg0.aClass80_Sub12_3.method13963(local338.method13955((byte) -1), (byte) -2);
			arg0.aClass80_Sub12_3.method13965(local338.method13974(305000519), local338.method13960((byte) 8), 737792169);
		}
	}

	@OriginalMember(owner = "client!te", name = "co", descriptor = "(IIILclient!asi;Lclient!asi;)V")
	public void method31592(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class120_Sub1_Sub2 arg3, @OriginalArg(4) Class120_Sub1_Sub2 arg4) {
		@Pc(6) Class568 local6 = this.method31693(arg0, arg1, arg2, -1202467149);
		if (local6 == null) {
			return;
		}
		local6.aClass120_Sub1_Sub2_1 = arg3;
		local6.aClass120_Sub1_Sub2_2 = arg4;
		@Pc(23) int local23 = this.aClass100Array1 == this.aClass100Array2 ? 1 : 0;
		if (!arg3.method24567(-32648954)) {
			arg3.aClass120_Sub1_23 = this.aClass120_Sub1Array3[local23];
			this.aClass120_Sub1Array3[local23] = arg3;
		} else if (arg3.method24565(-65263341)) {
			arg3.aClass120_Sub1_23 = this.aClass120_Sub1Array1[local23];
			this.aClass120_Sub1Array1[local23] = arg3;
		} else {
			arg3.aClass120_Sub1_23 = this.aClass120_Sub1Array2[local23];
			this.aClass120_Sub1Array2[local23] = arg3;
		}
		if (arg4 == null) {
			return;
		}
		if (!arg4.method24567(-32648954)) {
			arg4.aClass120_Sub1_23 = this.aClass120_Sub1Array3[local23];
			this.aClass120_Sub1Array3[local23] = arg4;
		} else if (arg4.method24565(-65263341)) {
			arg4.aClass120_Sub1_23 = this.aClass120_Sub1Array1[local23];
			this.aClass120_Sub1Array1[local23] = arg4;
		} else {
			arg4.aClass120_Sub1_23 = this.aClass120_Sub1Array2[local23];
			this.aClass120_Sub1Array2[local23] = arg4;
		}
	}

	@OriginalMember(owner = "client!te", name = "bn", descriptor = "(IIIB)V")
	public void method31593(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		@Pc(6) List local6 = (List) this.aHashMap11.get(arg0);
		if (local6 == null) {
			return;
		}
		@Pc(12) Iterator local12 = local6.iterator();
		while (local12.hasNext()) {
			@Pc(19) Class595 local19 = (Class595) local12.next();
			local19.aClass80_Sub12_3.method13964(arg1, arg2, 34166);
		}
	}

	@OriginalMember(owner = "client!te", name = "cr", descriptor = "(IIIIIIII)V")
	public void method31594(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.anIntArrayArray62 != null) {
			this.anIntArrayArray62[arg0][arg1] = arg2 | 0xFF000000;
		}
		if (this.aShortArrayArray4 != null) {
			this.aShortArrayArray4[arg0][arg1] = (short) arg3;
		}
		if (this.aByteArrayArray25 != null) {
			this.aByteArrayArray25[arg0][arg1] = (byte) arg4;
		}
		if (this.aByteArrayArray23 != null) {
			this.aByteArrayArray23[arg0][arg1] = (byte) arg5;
		}
		if (this.aByteArrayArray22 != null) {
			this.aByteArrayArray22[arg0][arg1] = (byte) arg6;
		}
		if (this.aByteArrayArray24 != null) {
			this.aByteArrayArray24[arg0][arg1] = (byte) arg7;
		}
	}

	@OriginalMember(owner = "client!te", name = "bt", descriptor = "(I)Ljava/util/HashMap;")
	public HashMap method31595(@OriginalArg(0) int arg0) {
		this.aHashMap12.clear();
		@Pc(7) Iterator local7 = this.aHashMap11.entrySet().iterator();
		while (local7.hasNext()) {
			@Pc(14) Entry local14 = (Entry) local7.next();
			this.aHashMap12.put(local14.getKey(), ((Class595) ((List) local14.getValue()).get(0)).aClass80_Sub12_3);
		}
		return this.aHashMap12;
	}

	@OriginalMember(owner = "client!te", name = "ei", descriptor = "(Z[[[BIBI)V")
	void method31596(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4) {
		@Pc(5) int local5 = arg0 ? 1 : 0;
		this.anInt5251 = 0;
		this.anInt5252 = 0;
		this.anInt5257 += -956241975;
		@Pc(27) Class120_Sub1 local27;
		if ((arg4 & 0x2) == 0) {
			for (local27 = this.aClass120_Sub1Array2[local5]; local27 != null; local27 = local27.aClass120_Sub1_23) {
				this.method31582(local27, 2036747717);
				if (local27.anInt3297 * -1640540455 != -1 && !this.method31585(local27, arg0, arg1, arg2, arg3)) {
					this.aClass120_Sub1Array4[(this.anInt5251 += -1088753761) * -136942497 - 1] = local27;
				}
			}
		}
		@Pc(184) int local184;
		if ((arg4 & 0x1) == 0) {
			for (local27 = this.aClass120_Sub1Array1[local5]; local27 != null; local27 = local27.aClass120_Sub1_23) {
				this.method31582(local27, 2036747717);
				if (-1640540455 * local27.anInt3297 != -1 && !this.method31585(local27, arg0, arg1, arg2, arg3)) {
					this.aClass120_Sub1Array5[(this.anInt5252 += -377106319) * -100929391 - 1] = local27;
				}
			}
			for (local27 = this.aClass120_Sub1Array3[local5]; local27 != null; local27 = local27.aClass120_Sub1_23) {
				this.method31582(local27, 2036747717);
				if (-1640540455 * local27.anInt3297 != -1 && !this.method31585(local27, arg0, arg1, arg2, arg3)) {
					if (local27.method24565(-65263341)) {
						this.aClass120_Sub1Array5[(this.anInt5252 += -377106319) * -100929391 - 1] = local27;
					} else {
						this.aClass120_Sub1Array4[(this.anInt5251 += -1088753761) * -136942497 - 1] = local27;
					}
				}
			}
			if (!arg0) {
				for (local184 = 0; local184 < this.anInt5248 * 1760244179; local184++) {
					this.method31582(this.aClass120_Sub1_Sub1Array1[local184], 2036747717);
					if (this.aClass120_Sub1_Sub1Array1[local184].anInt3297 * -1640540455 != -1 && !this.method31585(this.aClass120_Sub1_Sub1Array1[local184], arg0, arg1, arg2, arg3)) {
						if (this.aClass120_Sub1_Sub1Array1[local184].method24565(-65263341)) {
							this.aClass120_Sub1Array5[(this.anInt5252 += -377106319) * -100929391 - 1] = this.aClass120_Sub1_Sub1Array1[local184];
						} else {
							this.aClass120_Sub1Array4[(this.anInt5251 += -1088753761) * -136942497 - 1] = this.aClass120_Sub1_Sub1Array1[local184];
						}
					}
				}
			}
		}
		if (this.anInt5251 * -136942497 > 0) {
			this.method31584(this.aClass120_Sub1Array4, 0, this.anInt5251 * -136942497 - 1);
			for (local184 = 0; local184 < this.anInt5251 * -136942497; local184++) {
				this.method31586(this.aClass120_Sub1Array4[local184], this.aClass80_Sub12Array23);
			}
		}
		if (this.aBoolean916) {
			this.aClass102_12.method20770(0, null);
		}
		if ((arg4 & 0x2) == 0) {
			for (local184 = 0; local184 < this.anInt5242 * 1984662039; local184++) {
				@Pc(326) int local326;
				@Pc(361) int local361;
				@Pc(397) boolean[][] local397;
				@Pc(405) int local405;
				@Pc(420) int local420;
				@Pc(425) int local425;
				if (local184 < arg2 || arg1 == null) {
					local326 = this.aBooleanArrayArray20.length;
					if (this.anInt5249 * -1587881333 + this.aBooleanArrayArray20.length > this.anInt5245 * 1487025827) {
						local326 -= this.anInt5249 * -1587881333 + this.aBooleanArrayArray20.length - this.anInt5245 * 1487025827;
					}
					local361 = this.aBooleanArrayArray20[0].length;
					if (this.aBooleanArrayArray20[0].length + this.anInt5262 * -393076675 > this.anInt5246 * -1561777241) {
						local361 -= this.aBooleanArrayArray20[0].length + this.anInt5262 * -393076675 - this.anInt5246 * -1561777241;
					}
					local397 = this.aBooleanArrayArray21;
					if (this.aBoolean918) {
						for (local405 = this.anInt5259 * 1311777909; local405 < local326; local405++) {
							local420 = local405 + this.anInt5249 * -1587881333 - this.anInt5259 * 1311777909;
							for (local425 = this.anInt5260 * -1853894865; local425 < local361; local425++) {
								if (this.aBooleanArrayArray20[local405][local425] && !this.aClass600_1.method32064(local184, local420, this.anInt5262 * -393076675 + local425 - this.anInt5260 * -1853894865)) {
									local397[local405][local425] = true;
								} else {
									local397[local405][local425] = false;
								}
							}
						}
					}
					this.aClass100Array1[local184].method2913(this.anInt5241 * 1611671173, this.anInt5253 * 1105662773, this.anInt5244 * 1989483179, this.aBooleanArrayArray21, true, arg4);
				} else {
					local326 = this.aBooleanArrayArray20.length;
					if (this.aBooleanArrayArray20.length + this.anInt5249 * -1587881333 > this.anInt5245 * 1487025827) {
						local326 -= this.anInt5249 * -1587881333 + this.aBooleanArrayArray20.length - this.anInt5245 * 1487025827;
					}
					local361 = this.aBooleanArrayArray20[0].length;
					if (this.anInt5262 * -393076675 + this.aBooleanArrayArray20[0].length > this.anInt5246 * -1561777241) {
						local361 -= this.aBooleanArrayArray20[0].length + this.anInt5262 * -393076675 - this.anInt5246 * -1561777241;
					}
					local397 = this.aBooleanArrayArray21;
					if (this.aBoolean918) {
						for (local405 = this.anInt5259 * 1311777909; local405 < local326; local405++) {
							local420 = this.anInt5249 * -1587881333 + local405 - this.anInt5259 * 1311777909;
							for (local425 = this.anInt5260 * -1853894865; local425 < local361; local425++) {
								local397[local405][local425] = false;
								if (this.aBooleanArrayArray20[local405][local425]) {
									@Pc(453) int local453 = this.anInt5262 * -393076675 + local425 - this.anInt5260 * -1853894865;
									for (@Pc(455) int local455 = local184; local455 >= 0; local455--) {
										if (this.aClass568ArrayArrayArray1[local455][local420][local453] != null && this.aClass568ArrayArrayArray1[local455][local420][local453].aByte150 == local184) {
											if ((local455 < arg2 || arg1[local455][local420][local453] != arg3) && !this.aClass600_1.method32064(local184, local420, local453)) {
												local397[local405][local425] = true;
												break;
											}
											local397[local405][local425] = false;
											break;
										}
									}
								}
							}
						}
					}
					this.aClass100Array1[local184].method2913(this.anInt5241 * 1611671173, this.anInt5253 * 1105662773, this.anInt5244 * 1989483179, this.aBooleanArrayArray21, false, arg4);
				}
			}
		}
		if (this.anInt5252 * -100929391 > 0) {
			this.method31583(this.aClass120_Sub1Array5, 0, this.anInt5252 * -100929391 - 1);
			for (local184 = 0; local184 < this.anInt5252 * -100929391; local184++) {
				this.method31586(this.aClass120_Sub1Array5[local184], this.aClass80_Sub12Array23);
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "h", descriptor = "(IIIILclient!asc;I)V")
	public void method31597(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class120_Sub1_Sub5 arg4, @OriginalArg(5) int arg5) {
		@Pc(6) Class568 local6 = this.method31693(arg0, arg1, arg2, 1115815528);
		if (local6 == null) {
			return;
		}
		arg4.method24542(new Class463((float) (this.anInt5239 * 2105539397 + (arg1 << this.anInt5258 * 1479624119)), (float) arg3, (float) (this.anInt5239 * 2105539397 + (arg2 << this.anInt5258 * 1479624119))));
		local6.aClass120_Sub1_Sub5_1 = arg4;
		@Pc(52) int local52 = this.aClass100Array2 == this.aClass100Array1 ? 1 : 0;
		if (!arg4.method24567(-32648954)) {
			arg4.aClass120_Sub1_23 = this.aClass120_Sub1Array3[local52];
			this.aClass120_Sub1Array3[local52] = arg4;
		} else if (arg4.method24565(-65263341)) {
			arg4.aClass120_Sub1_23 = this.aClass120_Sub1Array1[local52];
			this.aClass120_Sub1Array1[local52] = arg4;
		} else {
			arg4.aClass120_Sub1_23 = this.aClass120_Sub1Array2[local52];
			this.aClass120_Sub1Array2[local52] = arg4;
		}
	}

	@OriginalMember(owner = "client!te", name = "by", descriptor = "(I)V")
	public void method31598(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!te", name = "bk", descriptor = "(Z)V")
	public void method31599(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.aClass568ArrayArrayArray1 = this.aClass568ArrayArrayArray2;
			this.aClass100Array1 = this.aClass100Array2;
		} else {
			this.aClass568ArrayArrayArray1 = this.aClass568ArrayArrayArray3;
			this.aClass100Array1 = this.aClass100Array3;
		}
		this.anInt5242 = this.aClass568ArrayArrayArray1.length * -749711961;
	}

	@OriginalMember(owner = "client!te", name = "bz", descriptor = "(Z)V")
	public void method31600(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.aClass568ArrayArrayArray1 = this.aClass568ArrayArrayArray2;
			this.aClass100Array1 = this.aClass100Array2;
		} else {
			this.aClass568ArrayArrayArray1 = this.aClass568ArrayArrayArray3;
			this.aClass100Array1 = this.aClass100Array3;
		}
		this.anInt5242 = this.aClass568ArrayArrayArray1.length * -749711961;
	}

	@OriginalMember(owner = "client!te", name = "cs", descriptor = "(II)I")
	public int method31601(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aByteArrayArray22 == null ? 0 : this.aByteArrayArray22[arg0][arg1] & 0xFF;
	}

	@OriginalMember(owner = "client!te", name = "bh", descriptor = "(Z)V")
	public void method31602(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.aClass568ArrayArrayArray1 = this.aClass568ArrayArrayArray2;
			this.aClass100Array1 = this.aClass100Array2;
		} else {
			this.aClass568ArrayArrayArray1 = this.aClass568ArrayArrayArray3;
			this.aClass100Array1 = this.aClass100Array3;
		}
		this.anInt5242 = this.aClass568ArrayArrayArray1.length * -749711961;
	}

	@OriginalMember(owner = "client!te", name = "fg", descriptor = "()V")
	public void method31603() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5264 * 2006038777; local1++) {
			if (!this.aBooleanArray32[local1]) {
				@Pc(17) Class595 local17 = this.aClass595Array1[local1];
				@Pc(20) Class80_Sub12 local20 = local17.aClass80_Sub12_3;
				@Pc(25) int local25 = local17.anInt5347 * -1434233081;
				@Pc(34) int local34 = local20.method13952(-432544427) - this.anInt5239 * 2105539397;
				@Pc(45) int local45 = (local34 * 2 >> this.anInt5258 * 1479624119) + 1;
				@Pc(47) int local47 = 0;
				@Pc(52) int[] local52 = new int[local45 * local45];
				@Pc(63) int local63 = local20.method13949((byte) 0) - local34 >> this.anInt5258 * 1479624119;
				@Pc(74) int local74 = local20.method13970(377124420) - local34 >> this.anInt5258 * 1479624119;
				@Pc(85) int local85 = local20.method13970(1668632909) + local34 >> this.anInt5258 * 1479624119;
				if (local74 < 0) {
					local47 -= local74;
					local74 = 0;
				}
				if (local85 >= this.anInt5246 * -1561777241) {
					local85 = this.anInt5246 * -1561777241 - 1;
				}
				for (@Pc(108) int local108 = local74; local108 <= local85; local108++) {
					@Pc(116) short local116 = local17.aShortArray142[local47];
					@Pc(120) int local120 = local116 >>> 8;
					@Pc(126) int local126 = local120 + local45 * local47;
					@Pc(132) int local132 = local63 + (local116 >>> 8);
					@Pc(140) int local140 = local132 + (local116 & 0xFF) - 1;
					if (local132 < 0) {
						local126 -= local132;
						local132 = 0;
					}
					if (local140 >= this.anInt5245 * 1487025827) {
						local140 = this.anInt5245 * 1487025827 - 1;
					}
					for (@Pc(163) int local163 = local132; local163 <= local140; local163++) {
						@Pc(168) byte local168 = 1;
						@Pc(176) Class120_Sub1_Sub1 local176 = this.method31574(local25, local163, local108, null, (byte) -34);
						if (local176 != null && local176.aByte98 != 0) {
							@Pc(195) boolean local195;
							@Pc(204) boolean local204;
							@Pc(218) short local218;
							@Pc(224) int local224;
							@Pc(230) int local230;
							if (local176.aByte98 == 1) {
								local195 = local163 - 1 >= local132;
								local204 = local163 + 1 <= local140;
								if (!local195 && local108 + 1 <= local85) {
									local218 = local17.aShortArray142[local47 + 1];
									local224 = (local218 >>> 8) + local63;
									local230 = (local218 & 0xFF) + local224;
									local195 = local163 > local224 && local163 < local230;
								}
								if (!local204 && local108 - 1 >= local74) {
									local218 = local17.aShortArray142[local47 - 1];
									local224 = local63 + (local218 >>> 8);
									local230 = (local218 & 0xFF) + local224;
									local204 = local163 > local224 && local163 < local230;
								}
								if (local195 && !local204) {
									local168 = 4;
								} else if (local204 && !local195) {
									local168 = 2;
								}
							} else {
								local195 = local163 - 1 >= local132;
								local204 = local163 + 1 <= local140;
								if (!local195 && local108 - 1 >= local74) {
									local218 = local17.aShortArray142[local47 - 1];
									local224 = local63 + (local218 >>> 8);
									local230 = (local218 & 0xFF) + local224;
									local195 = local163 > local224 && local163 < local230;
								}
								if (!local204 && local108 + 1 <= local85) {
									local218 = local17.aShortArray142[local47 + 1];
									local224 = (local218 >>> 8) + local63;
									local230 = local224 + (local218 & 0xFF);
									local204 = local163 > local224 && local163 < local230;
								}
								if (local195 && !local204) {
									local168 = 3;
								} else if (local204 && !local195) {
									local168 = 5;
								}
							}
						}
						local52[local126++] = local168;
					}
					local47++;
				}
				this.aBooleanArray32[local1] = true;
				if (aBoolean917) {
					this.aClass100Array1[local25].method2923(local20, local52);
				}
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "bp", descriptor = "()V")
	public void method31604() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5245 * 1487025827; local1++) {
			for (@Pc(9) int local9 = 0; local9 < this.anInt5246 * -1561777241; local9++) {
				if (this.aClass568ArrayArrayArray1[0][local1][local9] == null) {
					this.aClass568ArrayArrayArray1[0][local1][local9] = new Class568(0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "bb", descriptor = "()V")
	public void method31605() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5245 * 1487025827; local1++) {
			for (@Pc(9) int local9 = 0; local9 < this.anInt5246 * -1561777241; local9++) {
				if (this.aClass568ArrayArrayArray1[0][local1][local9] == null) {
					this.aClass568ArrayArrayArray1[0][local1][local9] = new Class568(0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "bo", descriptor = "(II)V")
	public void method31606(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class568 local8 = this.aClass568ArrayArrayArray1[0][arg0][arg1];
		for (@Pc(10) int local10 = 0; local10 < 3; local10++) {
			@Pc(33) Class568 local33 = this.aClass568ArrayArrayArray1[local10][arg0][arg1] = this.aClass568ArrayArrayArray1[local10 + 1][arg0][arg1];
			if (local33 != null) {
				for (@Pc(39) Class594 local39 = local33.aClass594_2; local39 != null; local39 = local39.aClass594_3) {
					@Pc(45) Class120_Sub1_Sub1 local45 = local39.aClass120_Sub1_Sub1_1;
					if (local45.aShort129 == arg0 && local45.aShort127 == arg1) {
						local45.aByte99--;
					}
				}
				if (local33.aClass120_Sub1_Sub4_1 != null) {
					local33.aClass120_Sub1_Sub4_1.aByte99--;
				}
				if (local33.aClass120_Sub1_Sub2_1 != null) {
					local33.aClass120_Sub1_Sub2_1.aByte99--;
				}
				if (local33.aClass120_Sub1_Sub2_2 != null) {
					local33.aClass120_Sub1_Sub2_2.aByte99--;
				}
				if (local33.aClass120_Sub1_Sub3_1 != null) {
					local33.aClass120_Sub1_Sub3_1.aByte99--;
				}
				if (local33.aClass120_Sub1_Sub3_2 != null) {
					local33.aClass120_Sub1_Sub3_2.aByte99--;
				}
			}
		}
		if (this.aClass568ArrayArrayArray1[0][arg0][arg1] == null) {
			this.aClass568ArrayArrayArray1[0][arg0][arg1] = new Class568(0);
			this.aClass568ArrayArrayArray1[0][arg0][arg1].aByte150 = 1;
		}
		this.aClass568ArrayArrayArray1[0][arg0][arg1].aClass568_1 = local8;
		this.aClass568ArrayArrayArray1[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!te", name = "fo", descriptor = "(Lclient!arx;III[Z)V")
	public void method31607(@OriginalArg(0) Class80_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (this.aClass100Array2 == this.aClass100Array1) {
			return;
		}
		@Pc(13) int local13 = this.aClass100Array3[arg1].method2915(arg2, arg3, (byte) -94);
		for (@Pc(15) int local15 = 0; local15 <= arg1; local15++) {
			if (arg4 == null || arg4[local15]) {
				@Pc(29) Class100 local29 = this.aClass100Array3[local15];
				if (local29 != null) {
					local29.method2921(arg0, arg2, local13 - local29.method2915(arg2, arg3, (byte) -31), arg3, 0, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "n", descriptor = "(IIII)Lclient!asi;")
	public Class120_Sub1_Sub2 method31608(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class568 local8 = this.aClass568ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			this.method31569(local8.aClass120_Sub1_Sub2_1, (short) -13602);
			if (local8.aClass120_Sub1_Sub2_1 != null) {
				@Pc(21) Class120_Sub1_Sub2 local21 = local8.aClass120_Sub1_Sub2_1;
				local8.aClass120_Sub1_Sub2_1 = null;
				return local21;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!te", name = "bw", descriptor = "(II)V")
	public void method31609(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class568 local8 = this.aClass568ArrayArrayArray1[0][arg0][arg1];
		for (@Pc(10) int local10 = 0; local10 < 3; local10++) {
			@Pc(33) Class568 local33 = this.aClass568ArrayArrayArray1[local10][arg0][arg1] = this.aClass568ArrayArrayArray1[local10 + 1][arg0][arg1];
			if (local33 != null) {
				for (@Pc(39) Class594 local39 = local33.aClass594_2; local39 != null; local39 = local39.aClass594_3) {
					@Pc(45) Class120_Sub1_Sub1 local45 = local39.aClass120_Sub1_Sub1_1;
					if (local45.aShort129 == arg0 && local45.aShort127 == arg1) {
						local45.aByte99--;
					}
				}
				if (local33.aClass120_Sub1_Sub4_1 != null) {
					local33.aClass120_Sub1_Sub4_1.aByte99--;
				}
				if (local33.aClass120_Sub1_Sub2_1 != null) {
					local33.aClass120_Sub1_Sub2_1.aByte99--;
				}
				if (local33.aClass120_Sub1_Sub2_2 != null) {
					local33.aClass120_Sub1_Sub2_2.aByte99--;
				}
				if (local33.aClass120_Sub1_Sub3_1 != null) {
					local33.aClass120_Sub1_Sub3_1.aByte99--;
				}
				if (local33.aClass120_Sub1_Sub3_2 != null) {
					local33.aClass120_Sub1_Sub3_2.aByte99--;
				}
			}
		}
		if (this.aClass568ArrayArrayArray1[0][arg0][arg1] == null) {
			this.aClass568ArrayArrayArray1[0][arg0][arg1] = new Class568(0);
			this.aClass568ArrayArrayArray1[0][arg0][arg1].aByte150 = 1;
		}
		this.aClass568ArrayArrayArray1[0][arg0][arg1].aClass568_1 = local8;
		this.aClass568ArrayArrayArray1[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!te", name = "cq", descriptor = "(IIILclient!asq;Lclient!asq;)V")
	public void method31610(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class120_Sub1_Sub3 arg3, @OriginalArg(4) Class120_Sub1_Sub3 arg4) {
		@Pc(6) Class568 local6 = this.method31693(arg0, arg1, arg2, -945069263);
		if (local6 == null) {
			return;
		}
		local6.aClass120_Sub1_Sub3_1 = arg3;
		local6.aClass120_Sub1_Sub3_2 = arg4;
		@Pc(23) int local23 = this.aClass100Array1 == this.aClass100Array2 ? 1 : 0;
		if (!arg3.method24567(-32648954)) {
			arg3.aClass120_Sub1_23 = this.aClass120_Sub1Array3[local23];
			this.aClass120_Sub1Array3[local23] = arg3;
		} else if (arg3.method24565(-65263341)) {
			arg3.aClass120_Sub1_23 = this.aClass120_Sub1Array1[local23];
			this.aClass120_Sub1Array1[local23] = arg3;
		} else {
			arg3.aClass120_Sub1_23 = this.aClass120_Sub1Array2[local23];
			this.aClass120_Sub1Array2[local23] = arg3;
		}
		if (arg4 == null) {
			return;
		}
		if (!arg4.method24567(-32648954)) {
			arg4.aClass120_Sub1_23 = this.aClass120_Sub1Array3[local23];
			this.aClass120_Sub1Array3[local23] = arg4;
		} else if (arg4.method24565(-65263341)) {
			arg4.aClass120_Sub1_23 = this.aClass120_Sub1Array1[local23];
			this.aClass120_Sub1Array1[local23] = arg4;
		} else {
			arg4.aClass120_Sub1_23 = this.aClass120_Sub1Array2[local23];
			this.aClass120_Sub1Array2[local23] = arg4;
		}
	}

	@OriginalMember(owner = "client!te", name = "gh", descriptor = "(Ljava/util/HashMap;)V")
	public void method31611(@OriginalArg(0) HashMap arg0) {
		this.aHashMap12 = arg0;
	}

	@OriginalMember(owner = "client!te", name = "bu", descriptor = "(III)V")
	public void method31612(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(23) boolean local23 = this.aClass568ArrayArrayArray1[0][arg1][arg2] != null && this.aClass568ArrayArrayArray1[0][arg1][arg2].aClass568_1 != null;
		for (@Pc(25) int local25 = arg0; local25 >= 0; local25--) {
			if (this.aClass568ArrayArrayArray1[local25][arg1][arg2] == null) {
				@Pc(50) Class568 local50 = this.aClass568ArrayArrayArray1[local25][arg1][arg2] = new Class568(local25);
				if (local23) {
					local50.aByte150++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "bm", descriptor = "(III)V")
	public void method31613(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(23) boolean local23 = this.aClass568ArrayArrayArray1[0][arg1][arg2] != null && this.aClass568ArrayArrayArray1[0][arg1][arg2].aClass568_1 != null;
		for (@Pc(25) int local25 = arg0; local25 >= 0; local25--) {
			if (this.aClass568ArrayArrayArray1[local25][arg1][arg2] == null) {
				@Pc(50) Class568 local50 = this.aClass568ArrayArrayArray1[local25][arg1][arg2] = new Class568(local25);
				if (local23) {
					local50.aByte150++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "bq", descriptor = "(ILclient!cb;)V")
	public void method31614(@OriginalArg(0) int arg0, @OriginalArg(1) Class100 arg1) {
		this.aClass100Array1[arg0] = arg1;
	}

	@OriginalMember(owner = "client!te", name = "bd", descriptor = "(II)I")
	public int method31615(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aShortArrayArray4 == null ? 0 : this.aShortArrayArray4[arg0][arg1] & 0xFFFF;
	}

	@OriginalMember(owner = "client!te", name = "cv", descriptor = "(II)I")
	public int method31616(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray62 == null ? 0 : this.anIntArrayArray62[arg0][arg1] & 0xFFFFFF;
	}

	@OriginalMember(owner = "client!te", name = "ff", descriptor = "()Ljava/util/HashMap;")
	public HashMap method31617() {
		this.aHashMap12.clear();
		@Pc(7) Iterator local7 = this.aHashMap11.entrySet().iterator();
		while (local7.hasNext()) {
			@Pc(14) Entry local14 = (Entry) local7.next();
			this.aHashMap12.put(local14.getKey(), ((Class595) ((List) local14.getValue()).get(0)).aClass80_Sub12_3);
		}
		return this.aHashMap12;
	}

	@OriginalMember(owner = "client!te", name = "cn", descriptor = "(II)I")
	public int method31618(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aByteArrayArray25 == null ? 0 : this.aByteArrayArray25[arg0][arg1] & 0xFF;
	}

	@OriginalMember(owner = "client!te", name = "q", descriptor = "(IIILclient!ash;I)V")
	public void method31619(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class120_Sub1_Sub4 arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class568 local6 = this.method31693(arg0, arg1, arg2, -988722177);
		if (local6 == null) {
			return;
		}
		local6.aClass120_Sub1_Sub4_1 = arg3;
		@Pc(21) int local21 = this.aClass100Array1 == this.aClass100Array2 ? 1 : 0;
		if (!arg3.method24567(-32648954)) {
			arg3.aClass120_Sub1_23 = this.aClass120_Sub1Array3[local21];
			this.aClass120_Sub1Array3[local21] = arg3;
		} else if (arg3.method24565(-65263341)) {
			arg3.aClass120_Sub1_23 = this.aClass120_Sub1Array1[local21];
			this.aClass120_Sub1Array1[local21] = arg3;
		} else {
			arg3.aClass120_Sub1_23 = this.aClass120_Sub1Array2[local21];
			this.aClass120_Sub1Array2[local21] = arg3;
		}
	}

	@OriginalMember(owner = "client!te", name = "ch", descriptor = "(II)I")
	public int method31620(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aByteArrayArray23 == null ? 0 : this.aByteArrayArray23[arg0][arg1] & 0xFF;
	}

	@OriginalMember(owner = "client!te", name = "en", descriptor = "(Lclient!alf;III)V")
	void method31621(@OriginalArg(0) Class120_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) Class568 local16;
		@Pc(128) int local128;
		if (arg2 < this.anInt5245 * 1487025827) {
			local16 = this.aClass568ArrayArrayArray1[arg1][arg2 + 1][arg3];
			if (local16 != null && local16.aClass120_Sub1_Sub4_1 != null && local16.aClass120_Sub1_Sub4_1.method24566((byte) 73)) {
				local128 = (this.aClass100Array1[arg1].method2917(arg2 + 1, arg3, -911990610) + this.aClass100Array1[arg1].method2917(arg2 + 1 + 1, arg3, -2106387360) + this.aClass100Array1[arg1].method2917(arg2 + 1, arg3 + 1, -1432144370) + this.aClass100Array1[arg1].method2917(arg2 + 1 + 1, arg3 + 1, -1335864190)) / 4 - (this.aClass100Array1[arg1].method2917(arg2, arg3, -1005240151) + this.aClass100Array1[arg1].method2917(arg2 + 1, arg3, -985609775) + this.aClass100Array1[arg1].method2917(arg2, arg3 + 1, -1646802614) + this.aClass100Array1[arg1].method2917(arg2 + 1, arg3 + 1, -1013791164)) / 4;
				arg0.method24569(this.aClass102_12, local16.aClass120_Sub1_Sub4_1, this.anInt5238 * 1533693671, local128, 0, true, -1296402340);
			}
		}
		if (arg3 < this.anInt5245 * 1487025827) {
			local16 = this.aClass568ArrayArrayArray1[arg1][arg2][arg3 + 1];
			if (local16 != null && local16.aClass120_Sub1_Sub4_1 != null && local16.aClass120_Sub1_Sub4_1.method24566((byte) -10)) {
				local128 = (this.aClass100Array1[arg1].method2917(arg2, arg3, -439080581) + this.aClass100Array1[arg1].method2917(arg2 + 1, arg3 + 1, -287794563) + this.aClass100Array1[arg1].method2917(arg2, arg3 + 1 + 1, -201486517) + this.aClass100Array1[arg1].method2917(arg2 + 1, arg3 + 1 + 1, -545135387)) / 4 - (this.aClass100Array1[arg1].method2917(arg2, arg3, -1797624588) + this.aClass100Array1[arg1].method2917(arg2 + 1, arg3, -753340283) + this.aClass100Array1[arg1].method2917(arg2, arg3 + 1, -753723269) + this.aClass100Array1[arg1].method2917(arg2 + 1, arg3 + 1, -1272414505)) / 4;
				arg0.method24569(this.aClass102_12, local16.aClass120_Sub1_Sub4_1, 0, local128, this.anInt5238 * 1533693671, true, -1296402340);
			}
		}
		if (arg2 < this.anInt5245 * 1487025827 && arg3 < this.anInt5246 * -1561777241) {
			local16 = this.aClass568ArrayArrayArray1[arg1][arg2 + 1][arg3 + 1];
			if (local16 != null && local16.aClass120_Sub1_Sub4_1 != null && local16.aClass120_Sub1_Sub4_1.method24566((byte) -10)) {
				local128 = (this.aClass100Array1[arg1].method2917(arg2 + 1, arg3 + 1, -1790807329) + this.aClass100Array1[arg1].method2917(arg2 + 1 + 1, arg3 + 1, -1761541152) + this.aClass100Array1[arg1].method2917(arg2 + 1, 1 + 1 + arg3, -314083837) + this.aClass100Array1[arg1].method2917(arg2 + 1 + 1, arg3 + 1 + 1, -1758219542)) / 4 - (this.aClass100Array1[arg1].method2917(arg2, arg3, -776352828) + this.aClass100Array1[arg1].method2917(arg2 + 1, arg3, -1149817443) + this.aClass100Array1[arg1].method2917(arg2, arg3 + 1, -1966239330) + this.aClass100Array1[arg1].method2917(arg2 + 1, arg3 + 1, -1766094624)) / 4;
				arg0.method24569(this.aClass102_12, local16.aClass120_Sub1_Sub4_1, this.anInt5238 * 1533693671, local128, this.anInt5238 * 1533693671, true, -1296402340);
			}
		}
		if (arg2 >= this.anInt5245 * 1487025827 || arg3 <= 0) {
			return;
		}
		local16 = this.aClass568ArrayArrayArray1[arg1][arg2 + 1][arg3 - 1];
		if (local16 != null && local16.aClass120_Sub1_Sub4_1 != null && local16.aClass120_Sub1_Sub4_1.method24566((byte) 8)) {
			local128 = (this.aClass100Array1[arg1].method2917(arg2 + 1, arg3 - 1, -951828897) + this.aClass100Array1[arg1].method2917(1 + 1 + arg2, arg3 - 1, -1857648138) + this.aClass100Array1[arg1].method2917(arg2 + 1, arg3 + 1 - 1, -952627460) + this.aClass100Array1[arg1].method2917(arg2 + 1 + 1, arg3 + 1 - 1, -696473722)) / 4 - (this.aClass100Array1[arg1].method2917(arg2, arg3, -1513197667) + this.aClass100Array1[arg1].method2917(arg2 + 1, arg3, -1560310269) + this.aClass100Array1[arg1].method2917(arg2, arg3 + 1, -283371598) + this.aClass100Array1[arg1].method2917(arg2 + 1, arg3 + 1, -1774132009)) / 4;
			arg0.method24569(this.aClass102_12, local16.aClass120_Sub1_Sub4_1, this.anInt5238 * 1533693671, local128, -(this.anInt5238 * 1533693671), true, -1296402340);
		}
	}

	@OriginalMember(owner = "client!te", name = "cu", descriptor = "(II)I")
	public int method31622(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aByteArrayArray23 == null ? 0 : this.aByteArrayArray23[arg0][arg1] & 0xFF;
	}

	@OriginalMember(owner = "client!te", name = "ce", descriptor = "(II)I")
	public int method31623(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aByteArrayArray22 == null ? 0 : this.aByteArrayArray22[arg0][arg1] & 0xFF;
	}

	@OriginalMember(owner = "client!te", name = "fe", descriptor = "(Lclient!alf;)V")
	void method31624(@OriginalArg(0) Class120_Sub1 arg0) {
		@Pc(3) Class463 local3 = arg0.method24552().aClass463_61;
		this.aClass102_12.method21114((float) local3.aFloat297, (float) ((int) local3.aFloat295 + (arg0.method24578(1367317006) >> 1)), (float) local3.aFloat296, this.aFloatArray117);
		arg0.anInt3297 = (int) this.aFloatArray117[2] * -1192900247;
	}

	@OriginalMember(owner = "client!te", name = "cj", descriptor = "(II)I")
	public int method31625(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aByteArrayArray22 == null ? 0 : this.aByteArrayArray22[arg0][arg1] & 0xFF;
	}

	@OriginalMember(owner = "client!te", name = "ck", descriptor = "(II)I")
	public int method31626(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aByteArrayArray24 == null ? 0 : this.aByteArrayArray24[arg0][arg1] & 0xFF;
	}

	@OriginalMember(owner = "client!te", name = "br", descriptor = "(I)V")
	public void method31627(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5264 * 2006038777; local1++) {
			if (!this.aBooleanArray32[local1]) {
				@Pc(17) Class595 local17 = this.aClass595Array1[local1];
				@Pc(20) Class80_Sub12 local20 = local17.aClass80_Sub12_3;
				@Pc(25) int local25 = local17.anInt5347 * -1434233081;
				@Pc(34) int local34 = local20.method13952(-432544427) - this.anInt5239 * 2105539397;
				@Pc(45) int local45 = (local34 * 2 >> this.anInt5258 * 1479624119) + 1;
				@Pc(47) int local47 = 0;
				@Pc(52) int[] local52 = new int[local45 * local45];
				@Pc(63) int local63 = local20.method13949((byte) 0) - local34 >> this.anInt5258 * 1479624119;
				@Pc(74) int local74 = local20.method13970(63161550) - local34 >> this.anInt5258 * 1479624119;
				@Pc(85) int local85 = local20.method13970(2099592185) + local34 >> this.anInt5258 * 1479624119;
				if (local74 < 0) {
					local47 -= local74;
					local74 = 0;
				}
				if (local85 >= this.anInt5246 * -1561777241) {
					local85 = this.anInt5246 * -1561777241 - 1;
				}
				for (@Pc(108) int local108 = local74; local108 <= local85; local108++) {
					@Pc(116) short local116 = local17.aShortArray142[local47];
					@Pc(120) int local120 = local116 >>> 8;
					@Pc(126) int local126 = local120 + local45 * local47;
					@Pc(132) int local132 = local63 + (local116 >>> 8);
					@Pc(140) int local140 = local132 + (local116 & 0xFF) - 1;
					if (local132 < 0) {
						local126 -= local132;
						local132 = 0;
					}
					if (local140 >= this.anInt5245 * 1487025827) {
						local140 = this.anInt5245 * 1487025827 - 1;
					}
					for (@Pc(163) int local163 = local132; local163 <= local140; local163++) {
						@Pc(168) byte local168 = 1;
						@Pc(176) Class120_Sub1_Sub1 local176 = this.method31574(local25, local163, local108, null, (byte) -93);
						if (local176 != null && local176.aByte98 != 0) {
							@Pc(195) boolean local195;
							@Pc(204) boolean local204;
							@Pc(218) short local218;
							@Pc(224) int local224;
							@Pc(230) int local230;
							if (local176.aByte98 == 1) {
								local195 = local163 - 1 >= local132;
								local204 = local163 + 1 <= local140;
								if (!local195 && local108 + 1 <= local85) {
									local218 = local17.aShortArray142[local47 + 1];
									local224 = (local218 >>> 8) + local63;
									local230 = (local218 & 0xFF) + local224;
									local195 = local163 > local224 && local163 < local230;
								}
								if (!local204 && local108 - 1 >= local74) {
									local218 = local17.aShortArray142[local47 - 1];
									local224 = local63 + (local218 >>> 8);
									local230 = (local218 & 0xFF) + local224;
									local204 = local163 > local224 && local163 < local230;
								}
								if (local195 && !local204) {
									local168 = 4;
								} else if (local204 && !local195) {
									local168 = 2;
								}
							} else {
								local195 = local163 - 1 >= local132;
								local204 = local163 + 1 <= local140;
								if (!local195 && local108 - 1 >= local74) {
									local218 = local17.aShortArray142[local47 - 1];
									local224 = local63 + (local218 >>> 8);
									local230 = (local218 & 0xFF) + local224;
									local195 = local163 > local224 && local163 < local230;
								}
								if (!local204 && local108 + 1 <= local85) {
									local218 = local17.aShortArray142[local47 + 1];
									local224 = (local218 >>> 8) + local63;
									local230 = local224 + (local218 & 0xFF);
									local204 = local163 > local224 && local163 < local230;
								}
								if (local195 && !local204) {
									local168 = 3;
								} else if (local204 && !local195) {
									local168 = 5;
								}
							}
						}
						local52[local126++] = local168;
					}
					local47++;
				}
				this.aBooleanArray32[local1] = true;
				if (aBoolean917) {
					this.aClass100Array1[local25].method2923(local20, local52);
				}
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "fb", descriptor = "()V")
	public void method31628() {
		this.method31542(1, this.anInt5242 * 1984662039, (byte) 2);
	}

	@OriginalMember(owner = "client!te", name = "ci", descriptor = "(IIIIIIII)V")
	public void method31629(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.anIntArrayArray62 != null) {
			this.anIntArrayArray62[arg0][arg1] = arg2 | 0xFF000000;
		}
		if (this.aShortArrayArray4 != null) {
			this.aShortArrayArray4[arg0][arg1] = (short) arg3;
		}
		if (this.aByteArrayArray25 != null) {
			this.aByteArrayArray25[arg0][arg1] = (byte) arg4;
		}
		if (this.aByteArrayArray23 != null) {
			this.aByteArrayArray23[arg0][arg1] = (byte) arg5;
		}
		if (this.aByteArrayArray22 != null) {
			this.aByteArrayArray22[arg0][arg1] = (byte) arg6;
		}
		if (this.aByteArrayArray24 != null) {
			this.aByteArrayArray24[arg0][arg1] = (byte) arg7;
		}
	}

	@OriginalMember(owner = "client!te", name = "cm", descriptor = "(IIILclient!ash;)V")
	public void method31630(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class120_Sub1_Sub4 arg3) {
		@Pc(6) Class568 local6 = this.method31693(arg0, arg1, arg2, 402425669);
		if (local6 == null) {
			return;
		}
		local6.aClass120_Sub1_Sub4_1 = arg3;
		@Pc(21) int local21 = this.aClass100Array1 == this.aClass100Array2 ? 1 : 0;
		if (!arg3.method24567(-32648954)) {
			arg3.aClass120_Sub1_23 = this.aClass120_Sub1Array3[local21];
			this.aClass120_Sub1Array3[local21] = arg3;
		} else if (arg3.method24565(-65263341)) {
			arg3.aClass120_Sub1_23 = this.aClass120_Sub1Array1[local21];
			this.aClass120_Sub1Array1[local21] = arg3;
		} else {
			arg3.aClass120_Sub1_23 = this.aClass120_Sub1Array2[local21];
			this.aClass120_Sub1Array2[local21] = arg3;
		}
	}

	@OriginalMember(owner = "client!te", name = "cp", descriptor = "(IIILclient!ash;)V")
	public void method31631(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class120_Sub1_Sub4 arg3) {
		@Pc(6) Class568 local6 = this.method31693(arg0, arg1, arg2, 1684790079);
		if (local6 == null) {
			return;
		}
		local6.aClass120_Sub1_Sub4_1 = arg3;
		@Pc(21) int local21 = this.aClass100Array1 == this.aClass100Array2 ? 1 : 0;
		if (!arg3.method24567(-32648954)) {
			arg3.aClass120_Sub1_23 = this.aClass120_Sub1Array3[local21];
			this.aClass120_Sub1Array3[local21] = arg3;
		} else if (arg3.method24565(-65263341)) {
			arg3.aClass120_Sub1_23 = this.aClass120_Sub1Array1[local21];
			this.aClass120_Sub1Array1[local21] = arg3;
		} else {
			arg3.aClass120_Sub1_23 = this.aClass120_Sub1Array2[local21];
			this.aClass120_Sub1Array2[local21] = arg3;
		}
	}

	@OriginalMember(owner = "client!te", name = "cg", descriptor = "(IIILclient!ash;)V")
	public void method31632(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class120_Sub1_Sub4 arg3) {
		@Pc(6) Class568 local6 = this.method31693(arg0, arg1, arg2, -231866068);
		if (local6 == null) {
			return;
		}
		local6.aClass120_Sub1_Sub4_1 = arg3;
		@Pc(21) int local21 = this.aClass100Array1 == this.aClass100Array2 ? 1 : 0;
		if (!arg3.method24567(-32648954)) {
			arg3.aClass120_Sub1_23 = this.aClass120_Sub1Array3[local21];
			this.aClass120_Sub1Array3[local21] = arg3;
		} else if (arg3.method24565(-65263341)) {
			arg3.aClass120_Sub1_23 = this.aClass120_Sub1Array1[local21];
			this.aClass120_Sub1Array1[local21] = arg3;
		} else {
			arg3.aClass120_Sub1_23 = this.aClass120_Sub1Array2[local21];
			this.aClass120_Sub1Array2[local21] = arg3;
		}
	}

	@OriginalMember(owner = "client!te", name = "cb", descriptor = "(IIILclient!ash;)V")
	public void method31633(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class120_Sub1_Sub4 arg3) {
		@Pc(6) Class568 local6 = this.method31693(arg0, arg1, arg2, 894623318);
		if (local6 == null) {
			return;
		}
		local6.aClass120_Sub1_Sub4_1 = arg3;
		@Pc(21) int local21 = this.aClass100Array1 == this.aClass100Array2 ? 1 : 0;
		if (!arg3.method24567(-32648954)) {
			arg3.aClass120_Sub1_23 = this.aClass120_Sub1Array3[local21];
			this.aClass120_Sub1Array3[local21] = arg3;
		} else if (arg3.method24565(-65263341)) {
			arg3.aClass120_Sub1_23 = this.aClass120_Sub1Array1[local21];
			this.aClass120_Sub1Array1[local21] = arg3;
		} else {
			arg3.aClass120_Sub1_23 = this.aClass120_Sub1Array2[local21];
			this.aClass120_Sub1Array2[local21] = arg3;
		}
	}

	@OriginalMember(owner = "client!te", name = "cw", descriptor = "(IIIILclient!asc;)V")
	public void method31634(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class120_Sub1_Sub5 arg4) {
		@Pc(6) Class568 local6 = this.method31693(arg0, arg1, arg2, 1420168785);
		if (local6 == null) {
			return;
		}
		arg4.method24542(new Class463((float) (this.anInt5239 * 2105539397 + (arg1 << this.anInt5258 * 1479624119)), (float) arg3, (float) (this.anInt5239 * 2105539397 + (arg2 << this.anInt5258 * 1479624119))));
		local6.aClass120_Sub1_Sub5_1 = arg4;
		@Pc(52) int local52 = this.aClass100Array2 == this.aClass100Array1 ? 1 : 0;
		if (!arg4.method24567(-32648954)) {
			arg4.aClass120_Sub1_23 = this.aClass120_Sub1Array3[local52];
			this.aClass120_Sub1Array3[local52] = arg4;
		} else if (arg4.method24565(-65263341)) {
			arg4.aClass120_Sub1_23 = this.aClass120_Sub1Array1[local52];
			this.aClass120_Sub1Array1[local52] = arg4;
		} else {
			arg4.aClass120_Sub1_23 = this.aClass120_Sub1Array2[local52];
			this.aClass120_Sub1Array2[local52] = arg4;
		}
	}

	@OriginalMember(owner = "client!te", name = "cl", descriptor = "(IIIILclient!asc;)V")
	public void method31635(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class120_Sub1_Sub5 arg4) {
		@Pc(6) Class568 local6 = this.method31693(arg0, arg1, arg2, -1245313906);
		if (local6 == null) {
			return;
		}
		arg4.method24542(new Class463((float) (this.anInt5239 * 2105539397 + (arg1 << this.anInt5258 * 1479624119)), (float) arg3, (float) (this.anInt5239 * 2105539397 + (arg2 << this.anInt5258 * 1479624119))));
		local6.aClass120_Sub1_Sub5_1 = arg4;
		@Pc(52) int local52 = this.aClass100Array2 == this.aClass100Array1 ? 1 : 0;
		if (!arg4.method24567(-32648954)) {
			arg4.aClass120_Sub1_23 = this.aClass120_Sub1Array3[local52];
			this.aClass120_Sub1Array3[local52] = arg4;
		} else if (arg4.method24565(-65263341)) {
			arg4.aClass120_Sub1_23 = this.aClass120_Sub1Array1[local52];
			this.aClass120_Sub1Array1[local52] = arg4;
		} else {
			arg4.aClass120_Sub1_23 = this.aClass120_Sub1Array2[local52];
			this.aClass120_Sub1Array2[local52] = arg4;
		}
	}

	@OriginalMember(owner = "client!te", name = "fp", descriptor = "([Lclient!alf;II)V")
	void method31636(@OriginalArg(0) Class120_Sub1[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(8) int local8 = (arg1 + arg2) / 2;
		@Pc(10) int local10 = arg1;
		@Pc(14) Class120_Sub1 local14 = arg0[local8];
		arg0[local8] = arg0[arg2];
		arg0[arg2] = local14;
		@Pc(29) int local29 = local14.anInt3297 * -1640540455;
		for (@Pc(31) int local31 = arg1; local31 < arg2; local31++) {
			if (arg0[local31].anInt3297 * -1640540455 > local29 + (local31 & 0x1)) {
				@Pc(50) Class120_Sub1 local50 = arg0[local31];
				arg0[local31] = arg0[local10];
				arg0[local10++] = local50;
			}
		}
		arg0[arg2] = arg0[local10];
		arg0[local10] = local14;
		this.method31583(arg0, arg1, local10 - 1);
		this.method31583(arg0, local10 + 1, arg2);
	}

	@OriginalMember(owner = "client!te", name = "al", descriptor = "(IIII)Lclient!asc;")
	public Class120_Sub1_Sub5 method31637(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class568 local8 = this.aClass568ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass120_Sub1_Sub5_1;
	}

	@OriginalMember(owner = "client!te", name = "ew", descriptor = "(III)Lclient!asq;")
	public Class120_Sub1_Sub3 method31638(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class568 local8 = this.aClass568ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass120_Sub1_Sub3_1;
	}

	@OriginalMember(owner = "client!te", name = "cz", descriptor = "(IIILclient!asq;Lclient!asq;)V")
	public void method31639(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class120_Sub1_Sub3 arg3, @OriginalArg(4) Class120_Sub1_Sub3 arg4) {
		@Pc(6) Class568 local6 = this.method31693(arg0, arg1, arg2, -1011445861);
		if (local6 == null) {
			return;
		}
		local6.aClass120_Sub1_Sub3_1 = arg3;
		local6.aClass120_Sub1_Sub3_2 = arg4;
		@Pc(23) int local23 = this.aClass100Array1 == this.aClass100Array2 ? 1 : 0;
		if (!arg3.method24567(-32648954)) {
			arg3.aClass120_Sub1_23 = this.aClass120_Sub1Array3[local23];
			this.aClass120_Sub1Array3[local23] = arg3;
		} else if (arg3.method24565(-65263341)) {
			arg3.aClass120_Sub1_23 = this.aClass120_Sub1Array1[local23];
			this.aClass120_Sub1Array1[local23] = arg3;
		} else {
			arg3.aClass120_Sub1_23 = this.aClass120_Sub1Array2[local23];
			this.aClass120_Sub1Array2[local23] = arg3;
		}
		if (arg4 == null) {
			return;
		}
		if (!arg4.method24567(-32648954)) {
			arg4.aClass120_Sub1_23 = this.aClass120_Sub1Array3[local23];
			this.aClass120_Sub1Array3[local23] = arg4;
		} else if (arg4.method24565(-65263341)) {
			arg4.aClass120_Sub1_23 = this.aClass120_Sub1Array1[local23];
			this.aClass120_Sub1Array1[local23] = arg4;
		} else {
			arg4.aClass120_Sub1_23 = this.aClass120_Sub1Array2[local23];
			this.aClass120_Sub1Array2[local23] = arg4;
		}
	}

	@OriginalMember(owner = "client!te", name = "bc", descriptor = "(II)V")
	public void method31640(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class568 local8 = this.aClass568ArrayArrayArray1[0][arg0][arg1];
		for (@Pc(10) int local10 = 0; local10 < 3; local10++) {
			@Pc(33) Class568 local33 = this.aClass568ArrayArrayArray1[local10][arg0][arg1] = this.aClass568ArrayArrayArray1[local10 + 1][arg0][arg1];
			if (local33 != null) {
				for (@Pc(39) Class594 local39 = local33.aClass594_2; local39 != null; local39 = local39.aClass594_3) {
					@Pc(45) Class120_Sub1_Sub1 local45 = local39.aClass120_Sub1_Sub1_1;
					if (local45.aShort129 == arg0 && local45.aShort127 == arg1) {
						local45.aByte99--;
					}
				}
				if (local33.aClass120_Sub1_Sub4_1 != null) {
					local33.aClass120_Sub1_Sub4_1.aByte99--;
				}
				if (local33.aClass120_Sub1_Sub2_1 != null) {
					local33.aClass120_Sub1_Sub2_1.aByte99--;
				}
				if (local33.aClass120_Sub1_Sub2_2 != null) {
					local33.aClass120_Sub1_Sub2_2.aByte99--;
				}
				if (local33.aClass120_Sub1_Sub3_1 != null) {
					local33.aClass120_Sub1_Sub3_1.aByte99--;
				}
				if (local33.aClass120_Sub1_Sub3_2 != null) {
					local33.aClass120_Sub1_Sub3_2.aByte99--;
				}
			}
		}
		if (this.aClass568ArrayArrayArray1[0][arg0][arg1] == null) {
			this.aClass568ArrayArrayArray1[0][arg0][arg1] = new Class568(0);
			this.aClass568ArrayArrayArray1[0][arg0][arg1].aByte150 = 1;
		}
		this.aClass568ArrayArrayArray1[0][arg0][arg1].aClass568_1 = local8;
		this.aClass568ArrayArrayArray1[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!te", name = "dg", descriptor = "(IIILclient!asq;Lclient!asq;)V")
	public void method31641(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class120_Sub1_Sub3 arg3, @OriginalArg(4) Class120_Sub1_Sub3 arg4) {
		@Pc(6) Class568 local6 = this.method31693(arg0, arg1, arg2, -26093318);
		if (local6 == null) {
			return;
		}
		local6.aClass120_Sub1_Sub3_1 = arg3;
		local6.aClass120_Sub1_Sub3_2 = arg4;
		@Pc(23) int local23 = this.aClass100Array1 == this.aClass100Array2 ? 1 : 0;
		if (!arg3.method24567(-32648954)) {
			arg3.aClass120_Sub1_23 = this.aClass120_Sub1Array3[local23];
			this.aClass120_Sub1Array3[local23] = arg3;
		} else if (arg3.method24565(-65263341)) {
			arg3.aClass120_Sub1_23 = this.aClass120_Sub1Array1[local23];
			this.aClass120_Sub1Array1[local23] = arg3;
		} else {
			arg3.aClass120_Sub1_23 = this.aClass120_Sub1Array2[local23];
			this.aClass120_Sub1Array2[local23] = arg3;
		}
		if (arg4 == null) {
			return;
		}
		if (!arg4.method24567(-32648954)) {
			arg4.aClass120_Sub1_23 = this.aClass120_Sub1Array3[local23];
			this.aClass120_Sub1Array3[local23] = arg4;
		} else if (arg4.method24565(-65263341)) {
			arg4.aClass120_Sub1_23 = this.aClass120_Sub1Array1[local23];
			this.aClass120_Sub1Array1[local23] = arg4;
		} else {
			arg4.aClass120_Sub1_23 = this.aClass120_Sub1Array2[local23];
			this.aClass120_Sub1Array2[local23] = arg4;
		}
	}

	@OriginalMember(owner = "client!te", name = "dq", descriptor = "(III)Lclient!asq;")
	public Class120_Sub1_Sub3 method31642(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class568 local8 = this.aClass568ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			this.method31569(local8.aClass120_Sub1_Sub3_2, (short) -24285);
			if (local8.aClass120_Sub1_Sub3_2 != null) {
				@Pc(22) Class120_Sub1_Sub3 local22 = local8.aClass120_Sub1_Sub3_2;
				local8.aClass120_Sub1_Sub3_2 = null;
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!te", name = "bj", descriptor = "(I)V")
	public void method31643(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!te", name = "dc", descriptor = "(Lclient!ase;Z)Z")
	public boolean method31644(@OriginalArg(0) Class120_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(8) boolean local8 = this.aClass100Array2 == this.aClass100Array1;
		@Pc(10) int local10 = 0;
		@Pc(12) short local12 = 0;
		@Pc(14) byte local14 = 0;
		arg0.method24518(1399276081);
		@Pc(19) short local19 = 0;
		@Pc(31) int local31 = Math.min(this.anInt5245 * 1487025827 - 1, Math.max(0, arg0.aShort129));
		@Pc(43) int local43 = Math.min(this.anInt5245 * 1487025827 - 1, Math.max(0, arg0.aShort126));
		@Pc(55) int local55 = Math.min(this.anInt5246 * -1561777241 - 1, Math.max(0, arg0.aShort127));
		@Pc(67) int local67 = Math.min(this.anInt5246 * -1561777241 - 1, Math.max(0, arg0.aShort128));
		@Pc(69) int local69;
		@Pc(74) int local74;
		for (local69 = local31; local69 <= local43; local69++) {
			for (local74 = local55; local74 <= local67; local74++) {
				@Pc(85) Class568 local85 = this.method31544(arg0.aByte99, local69, local74, (byte) -40);
				if (local85 != null) {
					@Pc(92) Class594 local92 = Class148_Sub1.method13461(arg0, -1188239002);
					@Pc(95) Class594 local95 = local85.aClass594_2;
					if (local95 == null) {
						local85.aClass594_2 = local92;
					} else {
						while (local95.aClass594_3 != null) {
							local95 = local95.aClass594_3;
						}
						local95.aClass594_3 = local92;
					}
					if (local8 && (this.anIntArrayArray62[local69][local74] & 0xFF000000) != 0) {
						local10 = this.anIntArrayArray62[local69][local74];
						local12 = this.aShortArrayArray4[local69][local74];
						local14 = this.aByteArrayArray25[local69][local74];
					}
					if (!arg1 && local85.aClass120_Sub1_Sub4_1 != null && local85.aClass120_Sub1_Sub4_1.aShort48 > local19) {
						local19 = local85.aClass120_Sub1_Sub4_1.aShort48;
					}
				}
			}
		}
		if (local8 && (local10 & 0xFF000000) != 0) {
			for (local69 = local31; local69 <= local43; local69++) {
				for (local74 = local55; local74 <= local67; local74++) {
					if ((this.anIntArrayArray62[local69][local74] & 0xFF000000) == 0) {
						this.anIntArrayArray62[local69][local74] = local10;
						this.aShortArrayArray4[local69][local74] = local12;
						this.aByteArrayArray25[local69][local74] = local14;
					}
				}
			}
		}
		if (arg1) {
			this.aClass120_Sub1_Sub1Array1[(this.anInt5248 += -1098035621) * 1760244179 - 1] = arg0;
			arg0.aClass570_23 = this;
		} else {
			local69 = this.aClass100Array1 == this.aClass100Array2 ? 1 : 0;
			if (!arg0.method24567(-32648954)) {
				arg0.aClass120_Sub1_23 = this.aClass120_Sub1Array3[local69];
				this.aClass120_Sub1Array3[local69] = arg0;
			} else if (arg0.method24565(-65263341)) {
				arg0.aClass120_Sub1_23 = this.aClass120_Sub1Array1[local69];
				this.aClass120_Sub1Array1[local69] = arg0;
			} else {
				arg0.aClass120_Sub1_23 = this.aClass120_Sub1Array2[local69];
				this.aClass120_Sub1Array2[local69] = arg0;
			}
		}
		if (arg1) {
			@Pc(293) Class463 local293 = Class463.method29472(arg0.method24552().aClass463_61);
			local293.aFloat295 -= local19;
			arg0.method24542(local293);
			local293.method29557();
		}
		return true;
	}

	@OriginalMember(owner = "client!te", name = "dn", descriptor = "(Lclient!ase;Z)Z")
	public boolean method31645(@OriginalArg(0) Class120_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(8) boolean local8 = this.aClass100Array2 == this.aClass100Array1;
		@Pc(10) int local10 = 0;
		@Pc(12) short local12 = 0;
		@Pc(14) byte local14 = 0;
		arg0.method24518(-2080200820);
		@Pc(19) short local19 = 0;
		@Pc(31) int local31 = Math.min(this.anInt5245 * 1487025827 - 1, Math.max(0, arg0.aShort129));
		@Pc(43) int local43 = Math.min(this.anInt5245 * 1487025827 - 1, Math.max(0, arg0.aShort126));
		@Pc(55) int local55 = Math.min(this.anInt5246 * -1561777241 - 1, Math.max(0, arg0.aShort127));
		@Pc(67) int local67 = Math.min(this.anInt5246 * -1561777241 - 1, Math.max(0, arg0.aShort128));
		@Pc(69) int local69;
		@Pc(74) int local74;
		for (local69 = local31; local69 <= local43; local69++) {
			for (local74 = local55; local74 <= local67; local74++) {
				@Pc(85) Class568 local85 = this.method31544(arg0.aByte99, local69, local74, (byte) -45);
				if (local85 != null) {
					@Pc(92) Class594 local92 = Class148_Sub1.method13461(arg0, -1188239002);
					@Pc(95) Class594 local95 = local85.aClass594_2;
					if (local95 == null) {
						local85.aClass594_2 = local92;
					} else {
						while (local95.aClass594_3 != null) {
							local95 = local95.aClass594_3;
						}
						local95.aClass594_3 = local92;
					}
					if (local8 && (this.anIntArrayArray62[local69][local74] & 0xFF000000) != 0) {
						local10 = this.anIntArrayArray62[local69][local74];
						local12 = this.aShortArrayArray4[local69][local74];
						local14 = this.aByteArrayArray25[local69][local74];
					}
					if (!arg1 && local85.aClass120_Sub1_Sub4_1 != null && local85.aClass120_Sub1_Sub4_1.aShort48 > local19) {
						local19 = local85.aClass120_Sub1_Sub4_1.aShort48;
					}
				}
			}
		}
		if (local8 && (local10 & 0xFF000000) != 0) {
			for (local69 = local31; local69 <= local43; local69++) {
				for (local74 = local55; local74 <= local67; local74++) {
					if ((this.anIntArrayArray62[local69][local74] & 0xFF000000) == 0) {
						this.anIntArrayArray62[local69][local74] = local10;
						this.aShortArrayArray4[local69][local74] = local12;
						this.aByteArrayArray25[local69][local74] = local14;
					}
				}
			}
		}
		if (arg1) {
			this.aClass120_Sub1_Sub1Array1[(this.anInt5248 += -1098035621) * 1760244179 - 1] = arg0;
			arg0.aClass570_23 = this;
		} else {
			local69 = this.aClass100Array1 == this.aClass100Array2 ? 1 : 0;
			if (!arg0.method24567(-32648954)) {
				arg0.aClass120_Sub1_23 = this.aClass120_Sub1Array3[local69];
				this.aClass120_Sub1Array3[local69] = arg0;
			} else if (arg0.method24565(-65263341)) {
				arg0.aClass120_Sub1_23 = this.aClass120_Sub1Array1[local69];
				this.aClass120_Sub1Array1[local69] = arg0;
			} else {
				arg0.aClass120_Sub1_23 = this.aClass120_Sub1Array2[local69];
				this.aClass120_Sub1Array2[local69] = arg0;
			}
		}
		if (arg1) {
			@Pc(293) Class463 local293 = Class463.method29472(arg0.method24552().aClass463_61);
			local293.aFloat295 -= local19;
			arg0.method24542(local293);
			local293.method29557();
		}
		return true;
	}

	@OriginalMember(owner = "client!te", name = "df", descriptor = "(IIII)V")
	public void method31646(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class568 local8 = this.aClass568ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return;
		}
		@Pc(15) Class120_Sub1_Sub3 local15 = local8.aClass120_Sub1_Sub3_1;
		@Pc(18) Class120_Sub1_Sub3 local18 = local8.aClass120_Sub1_Sub3_2;
		if (local15 != null) {
			local15.aShort52 = (short) (arg3 * local15.aShort52 / (0x10 << this.anInt5258 * 1479624119 - 7));
			local15.aShort51 = (short) (local15.aShort51 * arg3 / (0x10 << this.anInt5258 * 1479624119 - 7));
		}
		if (local18 != null) {
			local18.aShort52 = (short) (arg3 * local18.aShort52 / (0x10 << this.anInt5258 * 1479624119 - 7));
			local18.aShort51 = (short) (local18.aShort51 * arg3 / (0x10 << this.anInt5258 * 1479624119 - 7));
		}
	}

	@OriginalMember(owner = "client!te", name = "dl", descriptor = "(IIII)V")
	public void method31647(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class568 local8 = this.aClass568ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return;
		}
		@Pc(15) Class120_Sub1_Sub3 local15 = local8.aClass120_Sub1_Sub3_1;
		@Pc(18) Class120_Sub1_Sub3 local18 = local8.aClass120_Sub1_Sub3_2;
		if (local15 != null) {
			local15.aShort52 = (short) (arg3 * local15.aShort52 / (0x10 << this.anInt5258 * 1479624119 - 7));
			local15.aShort51 = (short) (local15.aShort51 * arg3 / (0x10 << this.anInt5258 * 1479624119 - 7));
		}
		if (local18 != null) {
			local18.aShort52 = (short) (arg3 * local18.aShort52 / (0x10 << this.anInt5258 * 1479624119 - 7));
			local18.aShort51 = (short) (local18.aShort51 * arg3 / (0x10 << this.anInt5258 * 1479624119 - 7));
		}
	}

	@OriginalMember(owner = "client!te", name = "db", descriptor = "()V")
	public void method31648() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5248 * 1760244179; local1++) {
			@Pc(12) Class120_Sub1_Sub1 local12 = this.aClass120_Sub1_Sub1Array1[local1];
			this.method31568(local12, true, (short) -8038);
			this.aClass120_Sub1_Sub1Array1[local1] = null;
		}
		this.anInt5248 = 0;
	}

	@OriginalMember(owner = "client!te", name = "dt", descriptor = "(III)Lclient!asi;")
	public Class120_Sub1_Sub2 method31649(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class568 local8 = this.aClass568ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			this.method31569(local8.aClass120_Sub1_Sub2_1, (short) 4487);
			if (local8.aClass120_Sub1_Sub2_1 != null) {
				@Pc(21) Class120_Sub1_Sub2 local21 = local8.aClass120_Sub1_Sub2_1;
				local8.aClass120_Sub1_Sub2_1 = null;
				return local21;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!te", name = "ex", descriptor = "(Lclient!alf;III)V")
	void method31650(@OriginalArg(0) Class120_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) Class568 local16;
		@Pc(128) int local128;
		if (arg2 < this.anInt5245 * 1487025827) {
			local16 = this.aClass568ArrayArrayArray1[arg1][arg2 + 1][arg3];
			if (local16 != null && local16.aClass120_Sub1_Sub4_1 != null && local16.aClass120_Sub1_Sub4_1.method24566((byte) -19)) {
				local128 = (this.aClass100Array1[arg1].method2917(arg2 + 1, arg3, -1261449362) + this.aClass100Array1[arg1].method2917(arg2 + 1 + 1, arg3, -368848254) + this.aClass100Array1[arg1].method2917(arg2 + 1, arg3 + 1, -1806345996) + this.aClass100Array1[arg1].method2917(arg2 + 1 + 1, arg3 + 1, -244062292)) / 4 - (this.aClass100Array1[arg1].method2917(arg2, arg3, -1054851505) + this.aClass100Array1[arg1].method2917(arg2 + 1, arg3, -1248115487) + this.aClass100Array1[arg1].method2917(arg2, arg3 + 1, -2092427937) + this.aClass100Array1[arg1].method2917(arg2 + 1, arg3 + 1, -1276797893)) / 4;
				arg0.method24569(this.aClass102_12, local16.aClass120_Sub1_Sub4_1, this.anInt5238 * 1533693671, local128, 0, true, -1296402340);
			}
		}
		if (arg3 < this.anInt5245 * 1487025827) {
			local16 = this.aClass568ArrayArrayArray1[arg1][arg2][arg3 + 1];
			if (local16 != null && local16.aClass120_Sub1_Sub4_1 != null && local16.aClass120_Sub1_Sub4_1.method24566((byte) -15)) {
				local128 = (this.aClass100Array1[arg1].method2917(arg2, arg3, -1552047534) + this.aClass100Array1[arg1].method2917(arg2 + 1, arg3 + 1, -1106267898) + this.aClass100Array1[arg1].method2917(arg2, arg3 + 1 + 1, -1849164823) + this.aClass100Array1[arg1].method2917(arg2 + 1, arg3 + 1 + 1, -1262404886)) / 4 - (this.aClass100Array1[arg1].method2917(arg2, arg3, -2070366110) + this.aClass100Array1[arg1].method2917(arg2 + 1, arg3, -649178778) + this.aClass100Array1[arg1].method2917(arg2, arg3 + 1, -1594724485) + this.aClass100Array1[arg1].method2917(arg2 + 1, arg3 + 1, -523440320)) / 4;
				arg0.method24569(this.aClass102_12, local16.aClass120_Sub1_Sub4_1, 0, local128, this.anInt5238 * 1533693671, true, -1296402340);
			}
		}
		if (arg2 < this.anInt5245 * 1487025827 && arg3 < this.anInt5246 * -1561777241) {
			local16 = this.aClass568ArrayArrayArray1[arg1][arg2 + 1][arg3 + 1];
			if (local16 != null && local16.aClass120_Sub1_Sub4_1 != null && local16.aClass120_Sub1_Sub4_1.method24566((byte) 8)) {
				local128 = (this.aClass100Array1[arg1].method2917(arg2 + 1, arg3 + 1, -436544327) + this.aClass100Array1[arg1].method2917(arg2 + 1 + 1, arg3 + 1, -1469579228) + this.aClass100Array1[arg1].method2917(arg2 + 1, 1 + 1 + arg3, -1604407264) + this.aClass100Array1[arg1].method2917(arg2 + 1 + 1, arg3 + 1 + 1, -1360679278)) / 4 - (this.aClass100Array1[arg1].method2917(arg2, arg3, -1005765670) + this.aClass100Array1[arg1].method2917(arg2 + 1, arg3, -686456524) + this.aClass100Array1[arg1].method2917(arg2, arg3 + 1, -852015188) + this.aClass100Array1[arg1].method2917(arg2 + 1, arg3 + 1, -714238235)) / 4;
				arg0.method24569(this.aClass102_12, local16.aClass120_Sub1_Sub4_1, this.anInt5238 * 1533693671, local128, this.anInt5238 * 1533693671, true, -1296402340);
			}
		}
		if (arg2 >= this.anInt5245 * 1487025827 || arg3 <= 0) {
			return;
		}
		local16 = this.aClass568ArrayArrayArray1[arg1][arg2 + 1][arg3 - 1];
		if (local16 != null && local16.aClass120_Sub1_Sub4_1 != null && local16.aClass120_Sub1_Sub4_1.method24566((byte) -89)) {
			local128 = (this.aClass100Array1[arg1].method2917(arg2 + 1, arg3 - 1, -1396662467) + this.aClass100Array1[arg1].method2917(1 + 1 + arg2, arg3 - 1, -733538192) + this.aClass100Array1[arg1].method2917(arg2 + 1, arg3 + 1 - 1, -324739611) + this.aClass100Array1[arg1].method2917(arg2 + 1 + 1, arg3 + 1 - 1, -628940754)) / 4 - (this.aClass100Array1[arg1].method2917(arg2, arg3, -1709853047) + this.aClass100Array1[arg1].method2917(arg2 + 1, arg3, -958836966) + this.aClass100Array1[arg1].method2917(arg2, arg3 + 1, -1548668242) + this.aClass100Array1[arg1].method2917(arg2 + 1, arg3 + 1, -612778345)) / 4;
			arg0.method24569(this.aClass102_12, local16.aClass120_Sub1_Sub4_1, this.anInt5238 * 1533693671, local128, -(this.anInt5238 * 1533693671), true, -1296402340);
		}
	}

	@OriginalMember(owner = "client!te", name = "ds", descriptor = "(III)Lclient!asi;")
	public Class120_Sub1_Sub2 method31651(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class568 local8 = this.aClass568ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			this.method31569(local8.aClass120_Sub1_Sub2_1, (short) 3451);
			if (local8.aClass120_Sub1_Sub2_1 != null) {
				@Pc(21) Class120_Sub1_Sub2 local21 = local8.aClass120_Sub1_Sub2_1;
				local8.aClass120_Sub1_Sub2_1 = null;
				return local21;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!te", name = "dw", descriptor = "(III)Lclient!asi;")
	public Class120_Sub1_Sub2 method31652(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class568 local8 = this.aClass568ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			this.method31569(local8.aClass120_Sub1_Sub2_1, (short) -6034);
			if (local8.aClass120_Sub1_Sub2_1 != null) {
				@Pc(21) Class120_Sub1_Sub2 local21 = local8.aClass120_Sub1_Sub2_1;
				local8.aClass120_Sub1_Sub2_1 = null;
				return local21;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!te", name = "bi", descriptor = "(III)Lclient!tb;")
	Class568 method31653(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass568ArrayArrayArray1[arg0][arg1][arg2] == null) {
			@Pc(33) boolean local33 = this.aClass568ArrayArrayArray1[0][arg1][arg2] != null && this.aClass568ArrayArrayArray1[0][arg1][arg2].aClass568_1 != null;
			if (local33 && arg0 >= this.anInt5242 * 1984662039 - 1) {
				return null;
			}
			this.method31554(arg0, arg1, arg2, -1842700914);
		}
		return this.aClass568ArrayArrayArray1[arg0][arg1][arg2];
	}

	@OriginalMember(owner = "client!te", name = "dx", descriptor = "(III)Lclient!asi;")
	public Class120_Sub1_Sub2 method31654(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class568 local8 = this.aClass568ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			this.method31569(local8.aClass120_Sub1_Sub2_2, (short) 15047);
			if (local8.aClass120_Sub1_Sub2_2 != null) {
				@Pc(23) Class120_Sub1_Sub2 local23 = local8.aClass120_Sub1_Sub2_2;
				local8.aClass120_Sub1_Sub2_2 = null;
				return local23;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!te", name = "de", descriptor = "(III)Lclient!asq;")
	public Class120_Sub1_Sub3 method31655(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class568 local8 = this.aClass568ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			this.method31569(local8.aClass120_Sub1_Sub3_1, (short) 16943);
			if (local8.aClass120_Sub1_Sub3_1 != null) {
				@Pc(21) Class120_Sub1_Sub3 local21 = local8.aClass120_Sub1_Sub3_1;
				local8.aClass120_Sub1_Sub3_1 = null;
				return local21;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!te", name = "dv", descriptor = "(III)Lclient!asq;")
	public Class120_Sub1_Sub3 method31656(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class568 local8 = this.aClass568ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			this.method31569(local8.aClass120_Sub1_Sub3_1, (short) 6672);
			if (local8.aClass120_Sub1_Sub3_1 != null) {
				@Pc(21) Class120_Sub1_Sub3 local21 = local8.aClass120_Sub1_Sub3_1;
				local8.aClass120_Sub1_Sub3_1 = null;
				return local21;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!te", name = "dm", descriptor = "(III)Lclient!asq;")
	public Class120_Sub1_Sub3 method31657(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class568 local8 = this.aClass568ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			this.method31569(local8.aClass120_Sub1_Sub3_2, (short) 18143);
			if (local8.aClass120_Sub1_Sub3_2 != null) {
				@Pc(22) Class120_Sub1_Sub3 local22 = local8.aClass120_Sub1_Sub3_2;
				local8.aClass120_Sub1_Sub3_2 = null;
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!te", name = "o", descriptor = "(ILclient!cb;I)V")
	public void method31658(@OriginalArg(0) int arg0, @OriginalArg(1) Class100 arg1, @OriginalArg(2) int arg2) {
		this.aClass100Array1[arg0] = arg1;
	}

	@OriginalMember(owner = "client!te", name = "do", descriptor = "(III)Lclient!ash;")
	public Class120_Sub1_Sub4 method31659(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class568 local8 = this.aClass568ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return null;
		}
		this.method31569(local8.aClass120_Sub1_Sub4_1, (short) -18051);
		if (local8.aClass120_Sub1_Sub4_1 == null) {
			return null;
		} else {
			@Pc(24) Class120_Sub1_Sub4 local24 = local8.aClass120_Sub1_Sub4_1;
			local8.aClass120_Sub1_Sub4_1 = null;
			return local24;
		}
	}

	@OriginalMember(owner = "client!te", name = "dp", descriptor = "(III)Lclient!ash;")
	public Class120_Sub1_Sub4 method31660(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class568 local8 = this.aClass568ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return null;
		}
		this.method31569(local8.aClass120_Sub1_Sub4_1, (short) -3377);
		if (local8.aClass120_Sub1_Sub4_1 == null) {
			return null;
		} else {
			@Pc(24) Class120_Sub1_Sub4 local24 = local8.aClass120_Sub1_Sub4_1;
			local8.aClass120_Sub1_Sub4_1 = null;
			return local24;
		}
	}

	@OriginalMember(owner = "client!te", name = "dj", descriptor = "(III)Lclient!asc;")
	public Class120_Sub1_Sub5 method31661(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class568 local8 = this.aClass568ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return null;
		} else {
			@Pc(16) Class120_Sub1_Sub5 local16 = local8.aClass120_Sub1_Sub5_1;
			local8.aClass120_Sub1_Sub5_1 = null;
			this.method31569(local16, (short) 21933);
			return local16;
		}
	}

	@OriginalMember(owner = "client!te", name = "bs", descriptor = "(Ljava/util/HashMap;S)V")
	public void method31662(@OriginalArg(0) HashMap arg0, @OriginalArg(1) short arg1) {
		this.aHashMap12 = arg0;
	}

	@OriginalMember(owner = "client!te", name = "dz", descriptor = "(Lclient!ase;Z)V")
	void method31663(@OriginalArg(0) Class120_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(11) int local11 = Math.min(this.anInt5245 * 1487025827 - 1, Math.max(0, arg0.aShort129));
		@Pc(23) int local23 = Math.min(this.anInt5245 * 1487025827 - 1, Math.max(0, arg0.aShort126));
		@Pc(35) int local35 = Math.min(this.anInt5246 * -1561777241 - 1, Math.max(0, arg0.aShort127));
		@Pc(47) int local47 = Math.min(this.anInt5246 * -1561777241 - 1, Math.max(0, arg0.aShort128));
		for (@Pc(49) int local49 = local11; local49 <= local23; local49++) {
			for (@Pc(54) int local54 = local35; local54 <= local47; local54++) {
				@Pc(67) Class568 local67 = this.aClass568ArrayArrayArray1[arg0.aByte99][local49][local54];
				if (local67 != null) {
					@Pc(72) Class594 local72 = local67.aClass594_2;
					@Pc(74) Class594 local74 = null;
					while (local72 != null) {
						if (arg0 == local72.aClass120_Sub1_Sub1_1) {
							if (local74 == null) {
								local67.aClass594_2 = local72.aClass594_3;
							} else {
								local74.aClass594_3 = local72.aClass594_3;
							}
							local72.method31949(-1571360735);
							break;
						}
						local74 = local72;
						local72 = local72.aClass594_3;
					}
				}
			}
		}
		if (!arg1) {
			this.method31569(arg0, (short) -17011);
		}
	}

	@OriginalMember(owner = "client!te", name = "dy", descriptor = "(Lclient!alf;)V")
	void method31664(@OriginalArg(0) Class120_Sub1 arg0) {
		if (arg0 == null) {
			return;
		}
		arg0.method24535();
		for (@Pc(6) int local6 = 0; local6 < 2; local6++) {
			@Pc(11) Class120_Sub1 local11 = null;
			@Pc(16) Class120_Sub1 local16;
			for (local16 = this.aClass120_Sub1Array2[local6]; local16 != null; local16 = local16.aClass120_Sub1_23) {
				if (arg0 == local16) {
					if (local11 == null) {
						this.aClass120_Sub1Array2[local6] = local16.aClass120_Sub1_23;
					} else {
						local11.aClass120_Sub1_23 = local16.aClass120_Sub1_23;
					}
					return;
				}
				local11 = local16;
			}
			local11 = null;
			for (local16 = this.aClass120_Sub1Array1[local6]; local16 != null; local16 = local16.aClass120_Sub1_23) {
				if (local16 == arg0) {
					if (local11 == null) {
						this.aClass120_Sub1Array1[local6] = local16.aClass120_Sub1_23;
					} else {
						local11.aClass120_Sub1_23 = local16.aClass120_Sub1_23;
					}
					return;
				}
				local11 = local16;
			}
			local11 = null;
			for (local16 = this.aClass120_Sub1Array3[local6]; local16 != null; local16 = local16.aClass120_Sub1_23) {
				if (arg0 == local16) {
					if (local11 == null) {
						this.aClass120_Sub1Array3[local6] = local16.aClass120_Sub1_23;
					} else {
						local11.aClass120_Sub1_23 = local16.aClass120_Sub1_23;
					}
					return;
				}
				local11 = local16;
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "fz", descriptor = "(Lclient!alf;[Lclient!akb;)V")
	void method31665(@OriginalArg(0) Class120_Sub1 arg0, @OriginalArg(1) Class80_Sub12[] arg1) {
		@Pc(7) int local7;
		if (this.aBoolean916) {
			local7 = arg0.method24574(arg1, 89530275);
			this.aClass102_12.method20770(local7, arg1);
		}
		if (this.aClass100Array1 == this.aClass100Array2) {
			@Pc(19) boolean local19 = false;
			@Pc(21) boolean local21 = false;
			@Pc(25) Class463 local25 = arg0.method24552().aClass463_61;
			@Pc(36) int local36;
			if (arg0 instanceof Class120_Sub1_Sub1) {
				local7 = ((Class120_Sub1_Sub1) arg0).aShort129;
				local36 = ((Class120_Sub1_Sub1) arg0).aShort127;
			} else {
				local7 = (int) local25.aFloat297 >> this.anInt5258 * 1479624119;
				local36 = (int) local25.aFloat296 >> this.anInt5258 * 1479624119;
			}
			local7 = Math.min(this.anInt5245 * 1487025827 - 1, Math.max(0, local7));
			local36 = Math.min(this.anInt5246 * -1561777241 - 1, Math.max(0, local36));
			@Pc(81) Class229 local81 = new Class229();
			local81.anInt3687 = this.method31548(local7, local36, (short) 10243) * 899347469;
			local81.anInt3685 = this.method31547(local7, local36, (byte) -77) * -491759939;
			local81.anInt3686 = this.method31716(local7, local36, (byte) 66) * 1857469271;
			local81.anInt3684 = this.method31550(local7, local36, -690132681) * 60460553;
			local81.anInt3689 = this.method31555(local7, local36, (byte) -107) * 771615817;
			local81.anInt3690 = this.method31552(local7, local36, -2000541349) * 1711455315;
			this.aClass102_12.method20868(this.aClass100Array3[0].method2915((int) local25.aFloat297, (int) local25.aFloat296, (byte) -7), local81);
		}
		@Pc(157) Class573 local157 = arg0.method24571(this.aClass102_12, -1368546350);
		if (local157 == null) {
			return;
		}
		if (local157.aBoolean919) {
			local157.aClass120_Sub1_25 = arg0;
			this.aClass582_1.method31829(local157, 1032421558);
		} else {
			Class558.method31398(local157, (byte) 0);
		}
	}

	@OriginalMember(owner = "client!te", name = "dk", descriptor = "(III)Lclient!asi;")
	public Class120_Sub1_Sub2 method31666(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class568 local8 = this.aClass568ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass120_Sub1_Sub2_1;
	}

	@OriginalMember(owner = "client!te", name = "ec", descriptor = "(III)Lclient!asi;")
	public Class120_Sub1_Sub2 method31667(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class568 local8 = this.aClass568ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass120_Sub1_Sub2_1;
	}

	@OriginalMember(owner = "client!te", name = "ev", descriptor = "(III)Lclient!asi;")
	public Class120_Sub1_Sub2 method31668(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class568 local8 = this.aClass568ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass120_Sub1_Sub2_2;
	}

	@OriginalMember(owner = "client!te", name = "ed", descriptor = "(III)Lclient!asq;")
	public Class120_Sub1_Sub3 method31669(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class568 local8 = this.aClass568ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass120_Sub1_Sub3_1;
	}

	@OriginalMember(owner = "client!te", name = "eo", descriptor = "(III)Lclient!asq;")
	public Class120_Sub1_Sub3 method31670(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class568 local8 = this.aClass568ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass120_Sub1_Sub3_1;
	}

	@OriginalMember(owner = "client!te", name = "ep", descriptor = "(III)Lclient!asq;")
	public Class120_Sub1_Sub3 method31671(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class568 local8 = this.aClass568ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass120_Sub1_Sub3_1;
	}

	@OriginalMember(owner = "client!te", name = "y", descriptor = "(I)V")
	public void method31672(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5248 * 1760244179; local1++) {
			@Pc(12) Class120_Sub1_Sub1 local12 = this.aClass120_Sub1_Sub1Array1[local1];
			this.method31568(local12, true, (short) 20050);
			this.aClass120_Sub1_Sub1Array1[local1] = null;
		}
		this.anInt5248 = 0;
	}

	@OriginalMember(owner = "client!te", name = "fk", descriptor = "(Lclient!alf;Z[[[BIB)Z")
	boolean method31673(@OriginalArg(0) Class120_Sub1 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte[][][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		if (!this.aBoolean918) {
			return false;
		} else if (arg0 instanceof Class120_Sub1_Sub1) {
			@Pc(11) short local11 = ((Class120_Sub1_Sub1) arg0).aShort126;
			@Pc(15) short local15 = ((Class120_Sub1_Sub1) arg0).aShort128;
			@Pc(19) short local19 = ((Class120_Sub1_Sub1) arg0).aShort129;
			@Pc(23) short local23 = ((Class120_Sub1_Sub1) arg0).aShort127;
			for (@Pc(25) int local25 = local19; local25 <= local11; local25++) {
				for (@Pc(30) int local30 = local23; local30 <= local15; local30++) {
					if (arg0.aByte100 < this.anInt5242 * 1984662039 && local25 >= this.anInt5249 * -1587881333 && local25 < this.anInt5261 * 1265602697 && local30 >= this.anInt5262 * -393076675 && local30 < this.anInt5266 * -85405183) {
						if ((arg2 == null || arg0.aByte99 < arg3 || arg2[arg0.aByte99][local25][local30] != arg4) && arg0.method24576((short) 7761) && !arg0.method24575(this.aClass102_12, -1380987821)) {
							return false;
						}
						if (!arg1 && local25 >= this.anInt5241 * 1611671173 - 16 && local25 <= this.anInt5241 * 1611671173 + 16 && local30 >= this.anInt5253 * 1105662773 - 16 && local30 <= this.anInt5253 * 1105662773 + 16) {
							arg0.method24572(this.aClass102_12, (byte) -68);
						}
						return true;
					}
				}
			}
			return true;
		} else {
			@Pc(144) Class463 local144 = arg0.method24552().aClass463_61;
			@Pc(153) int local153 = (int) local144.aFloat297 >> this.anInt5258 * 1479624119;
			@Pc(162) int local162 = (int) local144.aFloat296 >> this.anInt5258 * 1479624119;
			if (arg0.aByte100 >= this.anInt5242 * 1984662039 || local153 < this.anInt5249 * -1587881333 || local153 >= this.anInt5261 * 1265602697 || local162 < this.anInt5262 * -393076675 || local162 >= this.anInt5266 * -85405183) {
				return true;
			} else if ((arg2 == null || arg0.aByte99 < arg3 || arg2[arg0.aByte99][local153][local162] != arg4) && arg0.method24576((short) -12306) && !arg0.method24575(this.aClass102_12, -1380987821)) {
				return false;
			} else {
				if (!arg1 && local153 >= this.anInt5241 * 1611671173 - 16 && local153 <= this.anInt5241 * 1611671173 + 16 && local162 >= this.anInt5253 * 1105662773 - 16 && local162 <= this.anInt5253 * 1105662773 + 16) {
					arg0.method24572(this.aClass102_12, (byte) -21);
				}
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "ef", descriptor = "(III)Lclient!asc;")
	public Class120_Sub1_Sub5 method31674(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class568 local8 = this.aClass568ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass120_Sub1_Sub5_1;
	}

	@OriginalMember(owner = "client!te", name = "eu", descriptor = "(Lclient!alf;III)V")
	void method31675(@OriginalArg(0) Class120_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) Class568 local16;
		@Pc(128) int local128;
		if (arg2 < this.anInt5245 * 1487025827) {
			local16 = this.aClass568ArrayArrayArray1[arg1][arg2 + 1][arg3];
			if (local16 != null && local16.aClass120_Sub1_Sub4_1 != null && local16.aClass120_Sub1_Sub4_1.method24566((byte) -77)) {
				local128 = (this.aClass100Array1[arg1].method2917(arg2 + 1, arg3, -1883486175) + this.aClass100Array1[arg1].method2917(arg2 + 1 + 1, arg3, -535508390) + this.aClass100Array1[arg1].method2917(arg2 + 1, arg3 + 1, -548140979) + this.aClass100Array1[arg1].method2917(arg2 + 1 + 1, arg3 + 1, -1560064255)) / 4 - (this.aClass100Array1[arg1].method2917(arg2, arg3, -806779711) + this.aClass100Array1[arg1].method2917(arg2 + 1, arg3, -290143231) + this.aClass100Array1[arg1].method2917(arg2, arg3 + 1, -1338510455) + this.aClass100Array1[arg1].method2917(arg2 + 1, arg3 + 1, -621415951)) / 4;
				arg0.method24569(this.aClass102_12, local16.aClass120_Sub1_Sub4_1, this.anInt5238 * 1533693671, local128, 0, true, -1296402340);
			}
		}
		if (arg3 < this.anInt5245 * 1487025827) {
			local16 = this.aClass568ArrayArrayArray1[arg1][arg2][arg3 + 1];
			if (local16 != null && local16.aClass120_Sub1_Sub4_1 != null && local16.aClass120_Sub1_Sub4_1.method24566((byte) 69)) {
				local128 = (this.aClass100Array1[arg1].method2917(arg2, arg3, -574311672) + this.aClass100Array1[arg1].method2917(arg2 + 1, arg3 + 1, -2035470626) + this.aClass100Array1[arg1].method2917(arg2, arg3 + 1 + 1, -536102012) + this.aClass100Array1[arg1].method2917(arg2 + 1, arg3 + 1 + 1, -1583194391)) / 4 - (this.aClass100Array1[arg1].method2917(arg2, arg3, -1742451296) + this.aClass100Array1[arg1].method2917(arg2 + 1, arg3, -753839301) + this.aClass100Array1[arg1].method2917(arg2, arg3 + 1, -2101731304) + this.aClass100Array1[arg1].method2917(arg2 + 1, arg3 + 1, -602329329)) / 4;
				arg0.method24569(this.aClass102_12, local16.aClass120_Sub1_Sub4_1, 0, local128, this.anInt5238 * 1533693671, true, -1296402340);
			}
		}
		if (arg2 < this.anInt5245 * 1487025827 && arg3 < this.anInt5246 * -1561777241) {
			local16 = this.aClass568ArrayArrayArray1[arg1][arg2 + 1][arg3 + 1];
			if (local16 != null && local16.aClass120_Sub1_Sub4_1 != null && local16.aClass120_Sub1_Sub4_1.method24566((byte) 109)) {
				local128 = (this.aClass100Array1[arg1].method2917(arg2 + 1, arg3 + 1, -1505902187) + this.aClass100Array1[arg1].method2917(arg2 + 1 + 1, arg3 + 1, -1621570950) + this.aClass100Array1[arg1].method2917(arg2 + 1, 1 + 1 + arg3, -219970774) + this.aClass100Array1[arg1].method2917(arg2 + 1 + 1, arg3 + 1 + 1, -1691727770)) / 4 - (this.aClass100Array1[arg1].method2917(arg2, arg3, -497142070) + this.aClass100Array1[arg1].method2917(arg2 + 1, arg3, -1583059258) + this.aClass100Array1[arg1].method2917(arg2, arg3 + 1, -1110854215) + this.aClass100Array1[arg1].method2917(arg2 + 1, arg3 + 1, -791386648)) / 4;
				arg0.method24569(this.aClass102_12, local16.aClass120_Sub1_Sub4_1, this.anInt5238 * 1533693671, local128, this.anInt5238 * 1533693671, true, -1296402340);
			}
		}
		if (arg2 >= this.anInt5245 * 1487025827 || arg3 <= 0) {
			return;
		}
		local16 = this.aClass568ArrayArrayArray1[arg1][arg2 + 1][arg3 - 1];
		if (local16 != null && local16.aClass120_Sub1_Sub4_1 != null && local16.aClass120_Sub1_Sub4_1.method24566((byte) 27)) {
			local128 = (this.aClass100Array1[arg1].method2917(arg2 + 1, arg3 - 1, -1749834123) + this.aClass100Array1[arg1].method2917(1 + 1 + arg2, arg3 - 1, -1324013632) + this.aClass100Array1[arg1].method2917(arg2 + 1, arg3 + 1 - 1, -1331724684) + this.aClass100Array1[arg1].method2917(arg2 + 1 + 1, arg3 + 1 - 1, -1938873097)) / 4 - (this.aClass100Array1[arg1].method2917(arg2, arg3, -311443247) + this.aClass100Array1[arg1].method2917(arg2 + 1, arg3, -1059969194) + this.aClass100Array1[arg1].method2917(arg2, arg3 + 1, -1198610911) + this.aClass100Array1[arg1].method2917(arg2 + 1, arg3 + 1, -1596103192)) / 4;
			arg0.method24569(this.aClass102_12, local16.aClass120_Sub1_Sub4_1, this.anInt5238 * 1533693671, local128, -(this.anInt5238 * 1533693671), true, -1296402340);
		}
	}

	@OriginalMember(owner = "client!te", name = "ey", descriptor = "(IIILclient!tc;)Lclient!ase;")
	public Class120_Sub1_Sub1 method31676(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Interface62 arg3) {
		@Pc(8) Class568 local8 = this.aClass568ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return null;
		}
		for (@Pc(15) Class594 local15 = local8.aClass594_2; local15 != null; local15 = local15.aClass594_3) {
			@Pc(21) Class120_Sub1_Sub1 local21 = local15.aClass120_Sub1_Sub1_1;
			if ((arg3 == null || arg3.method31790(local21, 1430385381)) && arg1 == local21.aShort129 && arg2 == local21.aShort127) {
				return local21;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!te", name = "ek", descriptor = "(IIILclient!tc;)Lclient!ase;")
	public Class120_Sub1_Sub1 method31677(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Interface62 arg3) {
		@Pc(8) Class568 local8 = this.aClass568ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return null;
		}
		for (@Pc(15) Class594 local15 = local8.aClass594_2; local15 != null; local15 = local15.aClass594_3) {
			@Pc(21) Class120_Sub1_Sub1 local21 = local15.aClass120_Sub1_Sub1_1;
			if ((arg3 == null || arg3.method31790(local21, 1430385381)) && arg1 == local21.aShort129 && arg2 == local21.aShort127) {
				return local21;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!te", name = "ea", descriptor = "(III)Lclient!uj;")
	public Class594 method31678(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class568 local8 = this.aClass568ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass594_2;
	}

	@OriginalMember(owner = "client!te", name = "eh", descriptor = "(III)Lclient!ash;")
	public Class120_Sub1_Sub4 method31679(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class568 local8 = this.aClass568ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass120_Sub1_Sub4_1 == null ? null : local8.aClass120_Sub1_Sub4_1;
	}

	@OriginalMember(owner = "client!te", name = "bx", descriptor = "(III)Lclient!tb;")
	Class568 method31680(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass568ArrayArrayArray1[arg0][arg1][arg2] == null) {
			@Pc(33) boolean local33 = this.aClass568ArrayArrayArray1[0][arg1][arg2] != null && this.aClass568ArrayArrayArray1[0][arg1][arg2].aClass568_1 != null;
			if (local33 && arg0 >= this.anInt5242 * 1984662039 - 1) {
				return null;
			}
			this.method31554(arg0, arg1, arg2, 704215653);
		}
		return this.aClass568ArrayArrayArray1[arg0][arg1][arg2];
	}

	@OriginalMember(owner = "client!te", name = "em", descriptor = "()V")
	public void method31681() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5242 * 1984662039; local1++) {
			for (@Pc(9) int local9 = 0; local9 < this.anInt5245 * 1487025827; local9++) {
				for (@Pc(17) int local17 = 0; local17 < this.anInt5246 * -1561777241; local17++) {
					@Pc(32) Class568 local32 = this.aClass568ArrayArrayArray1[local1][local9][local17];
					if (local32 != null) {
						@Pc(38) Class120_Sub1_Sub2 local38 = local32.aClass120_Sub1_Sub2_1;
						@Pc(41) Class120_Sub1_Sub2 local41 = local32.aClass120_Sub1_Sub2_2;
						if (local38 != null && local38.method24566((byte) -10)) {
							this.method31579(local38, local1, local9, local17, 1, 1);
							if (local41 != null && local41.method24566((byte) 6)) {
								this.method31579(local41, local1, local9, local17, 1, 1);
								local41.method24569(this.aClass102_12, local38, 0, 0, 0, false, -1296402340);
								local41.method24570(65280);
							}
							local38.method24570(65280);
						}
						for (@Pc(90) Class594 local90 = local32.aClass594_2; local90 != null; local90 = local90.aClass594_3) {
							@Pc(96) Class120_Sub1_Sub1 local96 = local90.aClass120_Sub1_Sub1_1;
							if (local96 != null && local96.method24566((byte) 113)) {
								this.method31579(local96, local1, local9, local17, local96.aShort126 - local96.aShort129 + 1, local96.aShort128 - local96.aShort127 + 1);
								local96.method24570(65280);
							}
						}
						@Pc(133) Class120_Sub1_Sub4 local133 = local32.aClass120_Sub1_Sub4_1;
						if (local133 != null && local133.method24566((byte) 2)) {
							this.method31578(local133, local1, local9, local17, 1888663078);
							local133.method24570(65280);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "fm", descriptor = "([Lclient!alf;II)V")
	void method31682(@OriginalArg(0) Class120_Sub1[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(8) int local8 = (arg1 + arg2) / 2;
		@Pc(10) int local10 = arg1;
		@Pc(14) Class120_Sub1 local14 = arg0[local8];
		arg0[local8] = arg0[arg2];
		arg0[arg2] = local14;
		@Pc(29) int local29 = local14.anInt3297 * -1640540455;
		for (@Pc(31) int local31 = arg1; local31 < arg2; local31++) {
			if (arg0[local31].anInt3297 * -1640540455 > local29 + (local31 & 0x1)) {
				@Pc(50) Class120_Sub1 local50 = arg0[local31];
				arg0[local31] = arg0[local10];
				arg0[local10++] = local50;
			}
		}
		arg0[arg2] = arg0[local10];
		arg0[local10] = local14;
		this.method31583(arg0, arg1, local10 - 1);
		this.method31583(arg0, local10 + 1, arg2);
	}

	@OriginalMember(owner = "client!te", name = "cx", descriptor = "(IIILclient!asi;Lclient!asi;)V")
	public void method31683(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class120_Sub1_Sub2 arg3, @OriginalArg(4) Class120_Sub1_Sub2 arg4) {
		@Pc(6) Class568 local6 = this.method31693(arg0, arg1, arg2, 1340094245);
		if (local6 == null) {
			return;
		}
		local6.aClass120_Sub1_Sub2_1 = arg3;
		local6.aClass120_Sub1_Sub2_2 = arg4;
		@Pc(23) int local23 = this.aClass100Array1 == this.aClass100Array2 ? 1 : 0;
		if (!arg3.method24567(-32648954)) {
			arg3.aClass120_Sub1_23 = this.aClass120_Sub1Array3[local23];
			this.aClass120_Sub1Array3[local23] = arg3;
		} else if (arg3.method24565(-65263341)) {
			arg3.aClass120_Sub1_23 = this.aClass120_Sub1Array1[local23];
			this.aClass120_Sub1Array1[local23] = arg3;
		} else {
			arg3.aClass120_Sub1_23 = this.aClass120_Sub1Array2[local23];
			this.aClass120_Sub1Array2[local23] = arg3;
		}
		if (arg4 == null) {
			return;
		}
		if (!arg4.method24567(-32648954)) {
			arg4.aClass120_Sub1_23 = this.aClass120_Sub1Array3[local23];
			this.aClass120_Sub1Array3[local23] = arg4;
		} else if (arg4.method24565(-65263341)) {
			arg4.aClass120_Sub1_23 = this.aClass120_Sub1Array1[local23];
			this.aClass120_Sub1Array1[local23] = arg4;
		} else {
			arg4.aClass120_Sub1_23 = this.aClass120_Sub1Array2[local23];
			this.aClass120_Sub1Array2[local23] = arg4;
		}
	}

	@OriginalMember(owner = "client!te", name = "es", descriptor = "(Lclient!alf;III)V")
	void method31684(@OriginalArg(0) Class120_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) Class568 local16;
		@Pc(128) int local128;
		if (arg2 < this.anInt5245 * 1487025827) {
			local16 = this.aClass568ArrayArrayArray1[arg1][arg2 + 1][arg3];
			if (local16 != null && local16.aClass120_Sub1_Sub4_1 != null && local16.aClass120_Sub1_Sub4_1.method24566((byte) -2)) {
				local128 = (this.aClass100Array1[arg1].method2917(arg2 + 1, arg3, -1140645180) + this.aClass100Array1[arg1].method2917(arg2 + 1 + 1, arg3, -1832012564) + this.aClass100Array1[arg1].method2917(arg2 + 1, arg3 + 1, -1529144035) + this.aClass100Array1[arg1].method2917(arg2 + 1 + 1, arg3 + 1, -1375000069)) / 4 - (this.aClass100Array1[arg1].method2917(arg2, arg3, -1546205008) + this.aClass100Array1[arg1].method2917(arg2 + 1, arg3, -684887313) + this.aClass100Array1[arg1].method2917(arg2, arg3 + 1, -1031971743) + this.aClass100Array1[arg1].method2917(arg2 + 1, arg3 + 1, -894505864)) / 4;
				arg0.method24569(this.aClass102_12, local16.aClass120_Sub1_Sub4_1, this.anInt5238 * 1533693671, local128, 0, true, -1296402340);
			}
		}
		if (arg3 < this.anInt5245 * 1487025827) {
			local16 = this.aClass568ArrayArrayArray1[arg1][arg2][arg3 + 1];
			if (local16 != null && local16.aClass120_Sub1_Sub4_1 != null && local16.aClass120_Sub1_Sub4_1.method24566((byte) -77)) {
				local128 = (this.aClass100Array1[arg1].method2917(arg2, arg3, -1181813243) + this.aClass100Array1[arg1].method2917(arg2 + 1, arg3 + 1, -768687808) + this.aClass100Array1[arg1].method2917(arg2, arg3 + 1 + 1, -391324600) + this.aClass100Array1[arg1].method2917(arg2 + 1, arg3 + 1 + 1, -1219909805)) / 4 - (this.aClass100Array1[arg1].method2917(arg2, arg3, -2094978588) + this.aClass100Array1[arg1].method2917(arg2 + 1, arg3, -307636322) + this.aClass100Array1[arg1].method2917(arg2, arg3 + 1, -364444459) + this.aClass100Array1[arg1].method2917(arg2 + 1, arg3 + 1, -1817882399)) / 4;
				arg0.method24569(this.aClass102_12, local16.aClass120_Sub1_Sub4_1, 0, local128, this.anInt5238 * 1533693671, true, -1296402340);
			}
		}
		if (arg2 < this.anInt5245 * 1487025827 && arg3 < this.anInt5246 * -1561777241) {
			local16 = this.aClass568ArrayArrayArray1[arg1][arg2 + 1][arg3 + 1];
			if (local16 != null && local16.aClass120_Sub1_Sub4_1 != null && local16.aClass120_Sub1_Sub4_1.method24566((byte) 60)) {
				local128 = (this.aClass100Array1[arg1].method2917(arg2 + 1, arg3 + 1, -231994321) + this.aClass100Array1[arg1].method2917(arg2 + 1 + 1, arg3 + 1, -294734843) + this.aClass100Array1[arg1].method2917(arg2 + 1, 1 + 1 + arg3, -367938706) + this.aClass100Array1[arg1].method2917(arg2 + 1 + 1, arg3 + 1 + 1, -1297504778)) / 4 - (this.aClass100Array1[arg1].method2917(arg2, arg3, -264533143) + this.aClass100Array1[arg1].method2917(arg2 + 1, arg3, -1721297957) + this.aClass100Array1[arg1].method2917(arg2, arg3 + 1, -1932507507) + this.aClass100Array1[arg1].method2917(arg2 + 1, arg3 + 1, -2024832959)) / 4;
				arg0.method24569(this.aClass102_12, local16.aClass120_Sub1_Sub4_1, this.anInt5238 * 1533693671, local128, this.anInt5238 * 1533693671, true, -1296402340);
			}
		}
		if (arg2 >= this.anInt5245 * 1487025827 || arg3 <= 0) {
			return;
		}
		local16 = this.aClass568ArrayArrayArray1[arg1][arg2 + 1][arg3 - 1];
		if (local16 != null && local16.aClass120_Sub1_Sub4_1 != null && local16.aClass120_Sub1_Sub4_1.method24566((byte) -16)) {
			local128 = (this.aClass100Array1[arg1].method2917(arg2 + 1, arg3 - 1, -1166885977) + this.aClass100Array1[arg1].method2917(1 + 1 + arg2, arg3 - 1, -1484409817) + this.aClass100Array1[arg1].method2917(arg2 + 1, arg3 + 1 - 1, -1996849221) + this.aClass100Array1[arg1].method2917(arg2 + 1 + 1, arg3 + 1 - 1, -568274502)) / 4 - (this.aClass100Array1[arg1].method2917(arg2, arg3, -300572601) + this.aClass100Array1[arg1].method2917(arg2 + 1, arg3, -1858429109) + this.aClass100Array1[arg1].method2917(arg2, arg3 + 1, -1178445081) + this.aClass100Array1[arg1].method2917(arg2 + 1, arg3 + 1, -684791979)) / 4;
			arg0.method24569(this.aClass102_12, local16.aClass120_Sub1_Sub4_1, this.anInt5238 * 1533693671, local128, -(this.anInt5238 * 1533693671), true, -1296402340);
		}
	}

	@OriginalMember(owner = "client!te", name = "er", descriptor = "(Lclient!alf;III)V")
	void method31685(@OriginalArg(0) Class120_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) Class568 local16;
		@Pc(128) int local128;
		if (arg2 < this.anInt5245 * 1487025827) {
			local16 = this.aClass568ArrayArrayArray1[arg1][arg2 + 1][arg3];
			if (local16 != null && local16.aClass120_Sub1_Sub4_1 != null && local16.aClass120_Sub1_Sub4_1.method24566((byte) -29)) {
				local128 = (this.aClass100Array1[arg1].method2917(arg2 + 1, arg3, -1875268511) + this.aClass100Array1[arg1].method2917(arg2 + 1 + 1, arg3, -1854023329) + this.aClass100Array1[arg1].method2917(arg2 + 1, arg3 + 1, -2069190579) + this.aClass100Array1[arg1].method2917(arg2 + 1 + 1, arg3 + 1, -273288426)) / 4 - (this.aClass100Array1[arg1].method2917(arg2, arg3, -528149595) + this.aClass100Array1[arg1].method2917(arg2 + 1, arg3, -1580877440) + this.aClass100Array1[arg1].method2917(arg2, arg3 + 1, -1804401072) + this.aClass100Array1[arg1].method2917(arg2 + 1, arg3 + 1, -1723518939)) / 4;
				arg0.method24569(this.aClass102_12, local16.aClass120_Sub1_Sub4_1, this.anInt5238 * 1533693671, local128, 0, true, -1296402340);
			}
		}
		if (arg3 < this.anInt5245 * 1487025827) {
			local16 = this.aClass568ArrayArrayArray1[arg1][arg2][arg3 + 1];
			if (local16 != null && local16.aClass120_Sub1_Sub4_1 != null && local16.aClass120_Sub1_Sub4_1.method24566((byte) 29)) {
				local128 = (this.aClass100Array1[arg1].method2917(arg2, arg3, -1542134632) + this.aClass100Array1[arg1].method2917(arg2 + 1, arg3 + 1, -2072886083) + this.aClass100Array1[arg1].method2917(arg2, arg3 + 1 + 1, -956686520) + this.aClass100Array1[arg1].method2917(arg2 + 1, arg3 + 1 + 1, -1796092312)) / 4 - (this.aClass100Array1[arg1].method2917(arg2, arg3, -756204308) + this.aClass100Array1[arg1].method2917(arg2 + 1, arg3, -360139939) + this.aClass100Array1[arg1].method2917(arg2, arg3 + 1, -2010235809) + this.aClass100Array1[arg1].method2917(arg2 + 1, arg3 + 1, -1247567825)) / 4;
				arg0.method24569(this.aClass102_12, local16.aClass120_Sub1_Sub4_1, 0, local128, this.anInt5238 * 1533693671, true, -1296402340);
			}
		}
		if (arg2 < this.anInt5245 * 1487025827 && arg3 < this.anInt5246 * -1561777241) {
			local16 = this.aClass568ArrayArrayArray1[arg1][arg2 + 1][arg3 + 1];
			if (local16 != null && local16.aClass120_Sub1_Sub4_1 != null && local16.aClass120_Sub1_Sub4_1.method24566((byte) 15)) {
				local128 = (this.aClass100Array1[arg1].method2917(arg2 + 1, arg3 + 1, -1949101889) + this.aClass100Array1[arg1].method2917(arg2 + 1 + 1, arg3 + 1, -1764595442) + this.aClass100Array1[arg1].method2917(arg2 + 1, 1 + 1 + arg3, -1165394878) + this.aClass100Array1[arg1].method2917(arg2 + 1 + 1, arg3 + 1 + 1, -713413188)) / 4 - (this.aClass100Array1[arg1].method2917(arg2, arg3, -2015560935) + this.aClass100Array1[arg1].method2917(arg2 + 1, arg3, -1853662964) + this.aClass100Array1[arg1].method2917(arg2, arg3 + 1, -263120133) + this.aClass100Array1[arg1].method2917(arg2 + 1, arg3 + 1, -1773199267)) / 4;
				arg0.method24569(this.aClass102_12, local16.aClass120_Sub1_Sub4_1, this.anInt5238 * 1533693671, local128, this.anInt5238 * 1533693671, true, -1296402340);
			}
		}
		if (arg2 >= this.anInt5245 * 1487025827 || arg3 <= 0) {
			return;
		}
		local16 = this.aClass568ArrayArrayArray1[arg1][arg2 + 1][arg3 - 1];
		if (local16 != null && local16.aClass120_Sub1_Sub4_1 != null && local16.aClass120_Sub1_Sub4_1.method24566((byte) -39)) {
			local128 = (this.aClass100Array1[arg1].method2917(arg2 + 1, arg3 - 1, -272715065) + this.aClass100Array1[arg1].method2917(1 + 1 + arg2, arg3 - 1, -1271723240) + this.aClass100Array1[arg1].method2917(arg2 + 1, arg3 + 1 - 1, -373435100) + this.aClass100Array1[arg1].method2917(arg2 + 1 + 1, arg3 + 1 - 1, -1670420750)) / 4 - (this.aClass100Array1[arg1].method2917(arg2, arg3, -778980814) + this.aClass100Array1[arg1].method2917(arg2 + 1, arg3, -1659766305) + this.aClass100Array1[arg1].method2917(arg2, arg3 + 1, -1923754492) + this.aClass100Array1[arg1].method2917(arg2 + 1, arg3 + 1, -761489626)) / 4;
			arg0.method24569(this.aClass102_12, local16.aClass120_Sub1_Sub4_1, this.anInt5238 * 1533693671, local128, -(this.anInt5238 * 1533693671), true, -1296402340);
		}
	}

	@OriginalMember(owner = "client!te", name = "ft", descriptor = "(III)V")
	public void method31686(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) List local6 = (List) this.aHashMap11.get(arg0);
		if (local6 == null) {
			return;
		}
		@Pc(12) Iterator local12 = local6.iterator();
		while (local12.hasNext()) {
			@Pc(19) Class595 local19 = (Class595) local12.next();
			local19.aClass80_Sub12_3.method13964(arg1, arg2, 34166);
		}
	}

	@OriginalMember(owner = "client!te", name = "ca", descriptor = "(II)I")
	public int method31687(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aByteArrayArray24 == null ? 0 : this.aByteArrayArray24[arg0][arg1] & 0xFF;
	}

	@OriginalMember(owner = "client!te", name = "eg", descriptor = "(Lclient!alf;IIIII)V")
	void method31688(@OriginalArg(0) Class120_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != this.anInt5242 * 1984662039) {
				for (@Pc(31) int local31 = local3; local31 <= local7; local31++) {
					if (local31 >= 0 && local31 < this.anInt5245 * 1487025827) {
						for (@Pc(45) int local45 = local11; local45 <= local15; local45++) {
							if (local45 >= 0 && local45 < this.anInt5246 * -1561777241 && (!local1 || local31 >= local7 || local45 >= local15 || local45 < arg3 && arg2 != local31)) {
								@Pc(81) Class568 local81 = this.aClass568ArrayArrayArray1[local17][local31][local45];
								if (local81 != null) {
									@Pc(177) int local177 = (this.aClass100Array1[local17].method2917(local31, local45, -859385370) + this.aClass100Array1[local17].method2917(local31 + 1, local45, -2030107668) + this.aClass100Array1[local17].method2917(local31, local45 + 1, -709424971) + this.aClass100Array1[local17].method2917(local31 + 1, local45 + 1, -1018695071)) / 4 - (this.aClass100Array1[arg1].method2917(arg2, arg3, -985617773) + this.aClass100Array1[arg1].method2917(arg2 + 1, arg3, -1109523611) + this.aClass100Array1[arg1].method2917(arg2, arg3 + 1, -559979906) + this.aClass100Array1[arg1].method2917(arg2 + 1, arg3 + 1, -1157043243)) / 4;
									@Pc(180) Class120_Sub1_Sub2 local180 = local81.aClass120_Sub1_Sub2_1;
									@Pc(183) Class120_Sub1_Sub2 local183 = local81.aClass120_Sub1_Sub2_2;
									if (local180 != null && local180.method24566((byte) -28)) {
										arg0.method24569(this.aClass102_12, local180, this.anInt5238 * 1533693671 * (local31 - arg2) + (1 - arg4) * 2105539397 * this.anInt5239, local177, (1 - arg5) * this.anInt5239 * 2105539397 + this.anInt5238 * 1533693671 * (local45 - arg3), local1, -1296402340);
									}
									if (local183 != null && local183.method24566((byte) -1)) {
										arg0.method24569(this.aClass102_12, local183, this.anInt5238 * 1533693671 * (local31 - arg2) + this.anInt5239 * 2105539397 * (1 - arg4), local177, (local45 - arg3) * this.anInt5238 * 1533693671 + (1 - arg5) * 2105539397 * this.anInt5239, local1, -1296402340);
									}
									for (@Pc(283) Class594 local283 = local81.aClass594_2; local283 != null; local283 = local283.aClass594_3) {
										@Pc(288) Class120_Sub1_Sub1 local288 = local283.aClass120_Sub1_Sub1_1;
										if (local288 != null && local288.method24566((byte) -105) && (local31 == local288.aShort129 || local31 == local3) && (local45 == local288.aShort127 || local11 == local45)) {
											@Pc(317) int local317 = local288.aShort126 - local288.aShort129 + 1;
											@Pc(325) int local325 = local288.aShort128 - local288.aShort127 + 1;
											arg0.method24569(this.aClass102_12, local288, (local288.aShort129 - arg2) * 1533693671 * this.anInt5238 + (local317 - arg4) * this.anInt5239 * 2105539397, local177, (local325 - arg5) * this.anInt5239 * 2105539397 + (local288.aShort127 - arg3) * this.anInt5238 * 1533693671, local1, -1296402340);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "eb", descriptor = "(IIII[[[B[I[I[I[I[IIBIIZZIZ)V")
	public void method31689(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[][][] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) byte arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14, @OriginalArg(15) boolean arg15, @OriginalArg(16) int arg16, @OriginalArg(17) boolean arg17) {
		this.aClass600_1.aBoolean927 = true;
		this.aBoolean918 = arg15;
		this.anInt5241 = (arg1 >> this.anInt5258 * 1479624119) * 898097741;
		this.anInt5253 = (arg3 >> this.anInt5258 * 1479624119) * 1850140445;
		this.anInt5254 = arg1 * -709052753;
		this.anInt5255 = arg3 * -1061261773;
		this.anInt5256 = arg2 * 1245061399;
		this.anInt5249 = this.anInt5241 * 504493359 - this.anInt5244 * 1553884257;
		if (this.anInt5249 * -1587881333 < 0) {
			this.anInt5259 = -(this.anInt5249 * -764206337);
			this.anInt5249 = 0;
		} else {
			this.anInt5259 = 0;
		}
		this.anInt5262 = this.anInt5253 * -179227047 - this.anInt5244 * -1110332153;
		if (this.anInt5262 * -393076675 < 0) {
			this.anInt5260 = -(this.anInt5262 * 929057875);
			this.anInt5262 = 0;
		} else {
			this.anInt5260 = 0;
		}
		this.anInt5261 = this.anInt5244 * 1463630995 + this.anInt5241 * -1700868323;
		if (this.anInt5261 * 1265602697 > this.anInt5245 * 1487025827) {
			this.anInt5261 = this.anInt5245 * 629885643;
		}
		this.anInt5266 = this.anInt5253 * -130967243 + this.anInt5244 * 1059640491;
		if (this.anInt5266 * -85405183 > this.anInt5246 * -1561777241) {
			this.anInt5266 = this.anInt5246 * 1813917095;
		}
		@Pc(156) boolean[][] local156 = this.aBooleanArrayArray20;
		@Pc(159) boolean[][] local159 = this.aBooleanArrayArray21;
		@Pc(164) int local164;
		@Pc(179) int local179;
		if (this.aBoolean918) {
			for (local164 = 0; local164 < this.anInt5244 * 1989483179 + this.anInt5244 * 1989483179 + 2; local164++) {
				local179 = 0;
				@Pc(181) int local181 = 0;
				for (@Pc(183) int local183 = 0; local183 < this.anInt5244 * 1989483179 + 2 + this.anInt5244 * 1989483179; local183++) {
					if (local183 > 1) {
						this.anIntArray475[local183 - 2] = local179;
					}
					local179 = local181;
					@Pc(220) int local220 = local164 + (this.anInt5241 * 1611671173 - this.anInt5244 * 1989483179);
					@Pc(232) int local232 = this.anInt5253 * 1105662773 - this.anInt5244 * 1989483179 + local183;
					@Pc(255) int local255;
					if (local220 >= 0 && local232 >= 0 && local220 < this.anInt5245 * 1487025827 && local232 < this.anInt5246 * -1561777241) {
						local255 = local220 << this.anInt5258 * 1479624119;
						@Pc(262) int local262 = local232 << this.anInt5258 * 1479624119;
						@Pc(284) int local284 = this.aClass100Array3[this.aClass100Array3.length - 1].method2917(local220, local232, -2071905445) - (0x3E8 << this.anInt5258 * 1479624119 - 7);
						@Pc(324) int local324 = (this.aClass100Array2 == null ? this.aClass100Array3[0].method2917(local220, local232, -1744470397) + this.anInt5238 * 1533693671 : this.aClass100Array2[0].method2917(local220, local232, -255778430) + this.anInt5238 * 1533693671) + (0x3E8 << this.anInt5258 * 1479624119 - 7);
						local181 = this.aClass102_12.method20872(local255, local284, local262, local255, local324, local262);
						this.aBooleanArrayArray21[local164][local183] = local181 == 0;
					} else {
						local181 = -1;
						this.aBooleanArrayArray21[local164][local183] = false;
					}
					if (local164 > 0 && local183 > 0) {
						local255 = this.anIntArray475[local183 - 1] & this.anIntArray475[local183] & local179 & local181;
						this.aBooleanArrayArray20[local164 - 1][local183 - 1] = local255 == 0;
					}
				}
				this.anIntArray475[this.anInt5244 * 1989483179 + this.anInt5244 * 1989483179] = local179;
				this.anIntArray475[this.anInt5244 * 1989483179 + 1 + this.anInt5244 * 1989483179] = local181;
			}
			if (arg17) {
				this.aClass600_1.anIntArray491 = arg5;
				this.aClass600_1.anIntArray489 = arg6;
				this.aClass600_1.anIntArray488 = arg7;
				this.aClass600_1.anIntArray486 = arg8;
				this.aClass600_1.anIntArray490 = arg9;
				this.aClass600_1.method32094(this.aClass102_12, arg10);
			} else {
				this.aClass600_1.aBoolean927 = false;
			}
		} else {
			if (this.aBooleanArrayArray19 == null) {
				this.aBooleanArrayArray19 = new boolean[this.anInt5244 * 1989483179 + this.anInt5244 * 1989483179 + 2][this.anInt5244 * 1989483179 + this.anInt5244 * 1989483179 + 2];
			}
			for (local164 = 0; local164 < this.aBooleanArrayArray19.length; local164++) {
				for (local179 = 0; local179 < this.aBooleanArrayArray19[0].length; local179++) {
					this.aBooleanArrayArray19[local164][local179] = true;
				}
			}
			this.aBooleanArrayArray21 = this.aBooleanArrayArray19;
			this.aBooleanArrayArray20 = this.aBooleanArrayArray19;
			this.anInt5249 = 0;
			this.anInt5262 = 0;
			this.anInt5261 = this.anInt5245 * 629885643;
			this.anInt5266 = this.anInt5246 * 1813917095;
			this.aClass600_1.aBoolean927 = false;
		}
		Class445.method29237(this, this.aClass102_12, -500802989);
		if (!this.aClass582_1.aBoolean922) {
			@Pc(557) Iterator local557 = this.aClass582_1.aList24.iterator();
			while (local557.hasNext()) {
				@Pc(564) Class573 local564 = (Class573) local557.next();
				local557.remove();
				Class558.method31398(local564, (byte) 0);
			}
		}
		if (this.aBoolean916) {
			for (local164 = 0; local164 < this.anInt5264 * 2006038777; local164++) {
				this.aClass595Array1[local164].method31958(arg0, arg14, (byte) -26);
			}
		}
		if (this.aClass568ArrayArrayArray2 != null) {
			this.method31540(true, 567884320);
			this.aClass102_12.method20787(-1, new Class229(1583160, 40, 127, 63, 0, 0, 0));
			this.method31700(true, arg4, arg10, arg11, arg16);
			this.aClass102_12.method20699();
			this.method31540(false, 567884320);
		}
		this.method31700(false, arg4, arg10, arg11, arg16);
		if (!this.aBoolean918) {
			this.aBooleanArrayArray20 = local156;
			this.aBooleanArrayArray21 = local159;
		}
	}

	@OriginalMember(owner = "client!te", name = "fc", descriptor = "(Lclient!uk;)V")
	public void method31690(@OriginalArg(0) Class595 arg0) {
		if (this.anInt5264 * 2006038777 >= 65334) {
			return;
		}
		@Pc(9) Class80_Sub12 local9 = arg0.aClass80_Sub12_3;
		this.aClass595Array1[this.anInt5264 * 2006038777] = arg0;
		this.aBooleanArray32[this.anInt5264 * 2006038777] = false;
		this.anInt5264 += -1050834615;
		@Pc(36) int local36 = arg0.anInt5347 * -1434233081;
		if (arg0.aBoolean923) {
			local36 = 0;
		}
		@Pc(46) int local46 = arg0.anInt5347 * -1434233081;
		if (arg0.aBoolean924) {
			local46 = this.anInt5242 * 1984662039 - 1;
		}
		for (@Pc(58) int local58 = local36; local58 <= local46; local58++) {
			@Pc(63) int local63 = 0;
			@Pc(81) int local81 = local9.method13970(-2014618814) - local9.method13952(-432544427) + this.anInt5239 * 2105539397 >> this.anInt5258 * 1479624119;
			if (local81 < 0) {
				local63 -= local81;
				local81 = 0;
			}
			@Pc(107) int local107 = local9.method13970(-129039354) + local9.method13952(-432544427) - this.anInt5239 * 2105539397 >> this.anInt5258 * 1479624119;
			if (local107 >= this.anInt5246 * -1561777241) {
				local107 = this.anInt5246 * -1561777241 - 1;
			}
			for (@Pc(122) int local122 = local81; local122 <= local107; local122++) {
				@Pc(131) short local131 = arg0.aShortArray142[local63++];
				@Pc(153) int local153 = (local9.method13949((byte) 0) - local9.method13952(-432544427) + this.anInt5239 * 2105539397 >> this.anInt5258 * 1479624119) + (local131 >>> 8);
				@Pc(161) int local161 = (local131 & 0xFF) + local153 - 1;
				if (local153 < 0) {
					local153 = 0;
				}
				if (local161 >= this.anInt5245 * 1487025827) {
					local161 = this.anInt5245 * 1487025827 - 1;
				}
				for (@Pc(180) int local180 = local153; local180 <= local161; local180++) {
					@Pc(192) long local192 = this.aLongArrayArrayArray1[local58][local180][local122];
					if ((local192 & 0xFFFFL) == 0L) {
						this.aLongArrayArrayArray1[local58][local180][local122] = local192 | (long) (this.anInt5264 * 2006038777);
					} else if ((local192 & 0xFFFF0000L) == 0L) {
						this.aLongArrayArrayArray1[local58][local180][local122] = local192 | (long) (this.anInt5264 * 2006038777) << 16;
					} else if ((local192 & 0xFFFF00000000L) == 0L) {
						this.aLongArrayArrayArray1[local58][local180][local122] = local192 | (long) (this.anInt5264 * 2006038777) << 32;
					} else if ((local192 & 0xFFFF000000000000L) == 0L) {
						this.aLongArrayArrayArray1[local58][local180][local122] = local192 | (long) (this.anInt5264 * 2006038777) << 48;
					}
				}
			}
		}
		if (arg0.anInt5355 * 1791547589 == -1) {
			return;
		}
		@Pc(307) List local307 = (List) this.aHashMap11.get(arg0.anInt5355 * 1791547589);
		if (local307 == null) {
			local307 = new ArrayList();
			this.aHashMap11.put(arg0.anInt5355 * 1791547589, local307);
		}
		local307.add(arg0);
		@Pc(338) Class80_Sub12 local338 = (Class80_Sub12) this.aHashMap12.get(arg0.anInt5355 * 1791547589);
		if (local338 != null) {
			arg0.aClass80_Sub12_3.method13962(local338.method13953((byte) 125), (byte) 97);
			arg0.aClass80_Sub12_3.method13964(local338.method13968((byte) -31), local338.method13959((byte) 116), 34166);
			arg0.aClass80_Sub12_3.method13963(local338.method13955((byte) -1), (byte) -47);
			arg0.aClass80_Sub12_3.method13965(local338.method13974(1837439280), local338.method13960((byte) 8), 1434601239);
		}
	}

	@OriginalMember(owner = "client!te", name = "ej", descriptor = "(Z[[[BIBI)V")
	void method31691(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4) {
		@Pc(5) int local5 = arg0 ? 1 : 0;
		this.anInt5251 = 0;
		this.anInt5252 = 0;
		this.anInt5257 += -956241975;
		@Pc(27) Class120_Sub1 local27;
		if ((arg4 & 0x2) == 0) {
			for (local27 = this.aClass120_Sub1Array2[local5]; local27 != null; local27 = local27.aClass120_Sub1_23) {
				this.method31582(local27, 2036747717);
				if (local27.anInt3297 * -1640540455 != -1 && !this.method31585(local27, arg0, arg1, arg2, arg3)) {
					this.aClass120_Sub1Array4[(this.anInt5251 += -1088753761) * -136942497 - 1] = local27;
				}
			}
		}
		@Pc(184) int local184;
		if ((arg4 & 0x1) == 0) {
			for (local27 = this.aClass120_Sub1Array1[local5]; local27 != null; local27 = local27.aClass120_Sub1_23) {
				this.method31582(local27, 2036747717);
				if (-1640540455 * local27.anInt3297 != -1 && !this.method31585(local27, arg0, arg1, arg2, arg3)) {
					this.aClass120_Sub1Array5[(this.anInt5252 += -377106319) * -100929391 - 1] = local27;
				}
			}
			for (local27 = this.aClass120_Sub1Array3[local5]; local27 != null; local27 = local27.aClass120_Sub1_23) {
				this.method31582(local27, 2036747717);
				if (-1640540455 * local27.anInt3297 != -1 && !this.method31585(local27, arg0, arg1, arg2, arg3)) {
					if (local27.method24565(-65263341)) {
						this.aClass120_Sub1Array5[(this.anInt5252 += -377106319) * -100929391 - 1] = local27;
					} else {
						this.aClass120_Sub1Array4[(this.anInt5251 += -1088753761) * -136942497 - 1] = local27;
					}
				}
			}
			if (!arg0) {
				for (local184 = 0; local184 < this.anInt5248 * 1760244179; local184++) {
					this.method31582(this.aClass120_Sub1_Sub1Array1[local184], 2036747717);
					if (this.aClass120_Sub1_Sub1Array1[local184].anInt3297 * -1640540455 != -1 && !this.method31585(this.aClass120_Sub1_Sub1Array1[local184], arg0, arg1, arg2, arg3)) {
						if (this.aClass120_Sub1_Sub1Array1[local184].method24565(-65263341)) {
							this.aClass120_Sub1Array5[(this.anInt5252 += -377106319) * -100929391 - 1] = this.aClass120_Sub1_Sub1Array1[local184];
						} else {
							this.aClass120_Sub1Array4[(this.anInt5251 += -1088753761) * -136942497 - 1] = this.aClass120_Sub1_Sub1Array1[local184];
						}
					}
				}
			}
		}
		if (this.anInt5251 * -136942497 > 0) {
			this.method31584(this.aClass120_Sub1Array4, 0, this.anInt5251 * -136942497 - 1);
			for (local184 = 0; local184 < this.anInt5251 * -136942497; local184++) {
				this.method31586(this.aClass120_Sub1Array4[local184], this.aClass80_Sub12Array23);
			}
		}
		if (this.aBoolean916) {
			this.aClass102_12.method20770(0, null);
		}
		if ((arg4 & 0x2) == 0) {
			for (local184 = 0; local184 < this.anInt5242 * 1984662039; local184++) {
				@Pc(326) int local326;
				@Pc(361) int local361;
				@Pc(397) boolean[][] local397;
				@Pc(405) int local405;
				@Pc(420) int local420;
				@Pc(425) int local425;
				if (local184 < arg2 || arg1 == null) {
					local326 = this.aBooleanArrayArray20.length;
					if (this.anInt5249 * -1587881333 + this.aBooleanArrayArray20.length > this.anInt5245 * 1487025827) {
						local326 -= this.anInt5249 * -1587881333 + this.aBooleanArrayArray20.length - this.anInt5245 * 1487025827;
					}
					local361 = this.aBooleanArrayArray20[0].length;
					if (this.aBooleanArrayArray20[0].length + this.anInt5262 * -393076675 > this.anInt5246 * -1561777241) {
						local361 -= this.aBooleanArrayArray20[0].length + this.anInt5262 * -393076675 - this.anInt5246 * -1561777241;
					}
					local397 = this.aBooleanArrayArray21;
					if (this.aBoolean918) {
						for (local405 = this.anInt5259 * 1311777909; local405 < local326; local405++) {
							local420 = local405 + this.anInt5249 * -1587881333 - this.anInt5259 * 1311777909;
							for (local425 = this.anInt5260 * -1853894865; local425 < local361; local425++) {
								if (this.aBooleanArrayArray20[local405][local425] && !this.aClass600_1.method32064(local184, local420, this.anInt5262 * -393076675 + local425 - this.anInt5260 * -1853894865)) {
									local397[local405][local425] = true;
								} else {
									local397[local405][local425] = false;
								}
							}
						}
					}
					this.aClass100Array1[local184].method2913(this.anInt5241 * 1611671173, this.anInt5253 * 1105662773, this.anInt5244 * 1989483179, this.aBooleanArrayArray21, true, arg4);
				} else {
					local326 = this.aBooleanArrayArray20.length;
					if (this.aBooleanArrayArray20.length + this.anInt5249 * -1587881333 > this.anInt5245 * 1487025827) {
						local326 -= this.anInt5249 * -1587881333 + this.aBooleanArrayArray20.length - this.anInt5245 * 1487025827;
					}
					local361 = this.aBooleanArrayArray20[0].length;
					if (this.anInt5262 * -393076675 + this.aBooleanArrayArray20[0].length > this.anInt5246 * -1561777241) {
						local361 -= this.aBooleanArrayArray20[0].length + this.anInt5262 * -393076675 - this.anInt5246 * -1561777241;
					}
					local397 = this.aBooleanArrayArray21;
					if (this.aBoolean918) {
						for (local405 = this.anInt5259 * 1311777909; local405 < local326; local405++) {
							local420 = this.anInt5249 * -1587881333 + local405 - this.anInt5259 * 1311777909;
							for (local425 = this.anInt5260 * -1853894865; local425 < local361; local425++) {
								local397[local405][local425] = false;
								if (this.aBooleanArrayArray20[local405][local425]) {
									@Pc(453) int local453 = this.anInt5262 * -393076675 + local425 - this.anInt5260 * -1853894865;
									for (@Pc(455) int local455 = local184; local455 >= 0; local455--) {
										if (this.aClass568ArrayArrayArray1[local455][local420][local453] != null && this.aClass568ArrayArrayArray1[local455][local420][local453].aByte150 == local184) {
											if ((local455 < arg2 || arg1[local455][local420][local453] != arg3) && !this.aClass600_1.method32064(local184, local420, local453)) {
												local397[local405][local425] = true;
												break;
											}
											local397[local405][local425] = false;
											break;
										}
									}
								}
							}
						}
					}
					this.aClass100Array1[local184].method2913(this.anInt5241 * 1611671173, this.anInt5253 * 1105662773, this.anInt5244 * 1989483179, this.aBooleanArrayArray21, false, arg4);
				}
			}
		}
		if (this.anInt5252 * -100929391 > 0) {
			this.method31583(this.aClass120_Sub1Array5, 0, this.anInt5252 * -100929391 - 1);
			for (local184 = 0; local184 < this.anInt5252 * -100929391; local184++) {
				this.method31586(this.aClass120_Sub1Array5[local184], this.aClass80_Sub12Array23);
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "eq", descriptor = "(Lclient!alf;)V")
	void method31692(@OriginalArg(0) Class120_Sub1 arg0) {
		@Pc(3) Class463 local3 = arg0.method24552().aClass463_61;
		this.aClass102_12.method21114((float) local3.aFloat297, (float) ((int) local3.aFloat295 + (arg0.method24578(1585114493) >> 1)), (float) local3.aFloat296, this.aFloatArray117);
		arg0.anInt3297 = (int) this.aFloatArray117[2] * -1192900247;
	}

	@OriginalMember(owner = "client!te", name = "g", descriptor = "(IIII)Lclient!tb;")
	Class568 method31693(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass568ArrayArrayArray1[arg0][arg1][arg2] == null) {
			@Pc(33) boolean local33 = this.aClass568ArrayArrayArray1[0][arg1][arg2] != null && this.aClass568ArrayArrayArray1[0][arg1][arg2].aClass568_1 != null;
			if (local33 && arg0 >= this.anInt5242 * 1984662039 - 1) {
				return null;
			}
			this.method31554(arg0, arg1, arg2, 465277788);
		}
		return this.aClass568ArrayArrayArray1[arg0][arg1][arg2];
	}

	@OriginalMember(owner = "client!te", name = "fv", descriptor = "(Lclient!alf;)V")
	void method31694(@OriginalArg(0) Class120_Sub1 arg0) {
		@Pc(3) Class463 local3 = arg0.method24552().aClass463_61;
		this.aClass102_12.method21114((float) local3.aFloat297, (float) ((int) local3.aFloat295 + (arg0.method24578(850685617) >> 1)), (float) local3.aFloat296, this.aFloatArray117);
		arg0.anInt3297 = (int) this.aFloatArray117[2] * -1192900247;
	}

	@OriginalMember(owner = "client!te", name = "cf", descriptor = "(IIILclient!asi;Lclient!asi;)V")
	public void method31695(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class120_Sub1_Sub2 arg3, @OriginalArg(4) Class120_Sub1_Sub2 arg4) {
		@Pc(6) Class568 local6 = this.method31693(arg0, arg1, arg2, 872070789);
		if (local6 == null) {
			return;
		}
		local6.aClass120_Sub1_Sub2_1 = arg3;
		local6.aClass120_Sub1_Sub2_2 = arg4;
		@Pc(23) int local23 = this.aClass100Array1 == this.aClass100Array2 ? 1 : 0;
		if (!arg3.method24567(-32648954)) {
			arg3.aClass120_Sub1_23 = this.aClass120_Sub1Array3[local23];
			this.aClass120_Sub1Array3[local23] = arg3;
		} else if (arg3.method24565(-65263341)) {
			arg3.aClass120_Sub1_23 = this.aClass120_Sub1Array1[local23];
			this.aClass120_Sub1Array1[local23] = arg3;
		} else {
			arg3.aClass120_Sub1_23 = this.aClass120_Sub1Array2[local23];
			this.aClass120_Sub1Array2[local23] = arg3;
		}
		if (arg4 == null) {
			return;
		}
		if (!arg4.method24567(-32648954)) {
			arg4.aClass120_Sub1_23 = this.aClass120_Sub1Array3[local23];
			this.aClass120_Sub1Array3[local23] = arg4;
		} else if (arg4.method24565(-65263341)) {
			arg4.aClass120_Sub1_23 = this.aClass120_Sub1Array1[local23];
			this.aClass120_Sub1Array1[local23] = arg4;
		} else {
			arg4.aClass120_Sub1_23 = this.aClass120_Sub1Array2[local23];
			this.aClass120_Sub1Array2[local23] = arg4;
		}
	}

	@OriginalMember(owner = "client!te", name = "p", descriptor = "(Lclient!ase;ZI)Z")
	public boolean method31696(@OriginalArg(0) Class120_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(8) boolean local8 = this.aClass100Array2 == this.aClass100Array1;
		@Pc(10) int local10 = 0;
		@Pc(12) short local12 = 0;
		@Pc(14) byte local14 = 0;
		arg0.method24518(921682820);
		@Pc(19) short local19 = 0;
		@Pc(31) int local31 = Math.min(this.anInt5245 * 1487025827 - 1, Math.max(0, arg0.aShort129));
		@Pc(43) int local43 = Math.min(this.anInt5245 * 1487025827 - 1, Math.max(0, arg0.aShort126));
		@Pc(55) int local55 = Math.min(this.anInt5246 * -1561777241 - 1, Math.max(0, arg0.aShort127));
		@Pc(67) int local67 = Math.min(this.anInt5246 * -1561777241 - 1, Math.max(0, arg0.aShort128));
		@Pc(69) int local69;
		@Pc(74) int local74;
		for (local69 = local31; local69 <= local43; local69++) {
			for (local74 = local55; local74 <= local67; local74++) {
				@Pc(85) Class568 local85 = this.method31544(arg0.aByte99, local69, local74, (byte) -74);
				if (local85 != null) {
					@Pc(92) Class594 local92 = Class148_Sub1.method13461(arg0, -1188239002);
					@Pc(95) Class594 local95 = local85.aClass594_2;
					if (local95 == null) {
						local85.aClass594_2 = local92;
					} else {
						while (local95.aClass594_3 != null) {
							local95 = local95.aClass594_3;
						}
						local95.aClass594_3 = local92;
					}
					if (local8 && (this.anIntArrayArray62[local69][local74] & 0xFF000000) != 0) {
						local10 = this.anIntArrayArray62[local69][local74];
						local12 = this.aShortArrayArray4[local69][local74];
						local14 = this.aByteArrayArray25[local69][local74];
					}
					if (!arg1 && local85.aClass120_Sub1_Sub4_1 != null && local85.aClass120_Sub1_Sub4_1.aShort48 > local19) {
						local19 = local85.aClass120_Sub1_Sub4_1.aShort48;
					}
				}
			}
		}
		if (local8 && (local10 & 0xFF000000) != 0) {
			for (local69 = local31; local69 <= local43; local69++) {
				for (local74 = local55; local74 <= local67; local74++) {
					if ((this.anIntArrayArray62[local69][local74] & 0xFF000000) == 0) {
						this.anIntArrayArray62[local69][local74] = local10;
						this.aShortArrayArray4[local69][local74] = local12;
						this.aByteArrayArray25[local69][local74] = local14;
					}
				}
			}
		}
		if (arg1) {
			this.aClass120_Sub1_Sub1Array1[(this.anInt5248 += -1098035621) * 1760244179 - 1] = arg0;
			arg0.aClass570_23 = this;
		} else {
			local69 = this.aClass100Array1 == this.aClass100Array2 ? 1 : 0;
			if (!arg0.method24567(-32648954)) {
				arg0.aClass120_Sub1_23 = this.aClass120_Sub1Array3[local69];
				this.aClass120_Sub1Array3[local69] = arg0;
			} else if (arg0.method24565(-65263341)) {
				arg0.aClass120_Sub1_23 = this.aClass120_Sub1Array1[local69];
				this.aClass120_Sub1Array1[local69] = arg0;
			} else {
				arg0.aClass120_Sub1_23 = this.aClass120_Sub1Array2[local69];
				this.aClass120_Sub1Array2[local69] = arg0;
			}
		}
		if (arg1) {
			@Pc(293) Class463 local293 = Class463.method29472(arg0.method24552().aClass463_61);
			local293.aFloat295 -= local19;
			arg0.method24542(local293);
			local293.method29557();
		}
		return true;
	}

	@OriginalMember(owner = "client!te", name = "fx", descriptor = "([Lclient!alf;II)V")
	void method31697(@OriginalArg(0) Class120_Sub1[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(8) int local8 = (arg1 + arg2) / 2;
		@Pc(10) int local10 = arg1;
		@Pc(14) Class120_Sub1 local14 = arg0[local8];
		arg0[local8] = arg0[arg2];
		arg0[arg2] = local14;
		@Pc(29) int local29 = local14.anInt3297 * -1640540455;
		for (@Pc(31) int local31 = arg1; local31 < arg2; local31++) {
			if (arg0[local31].anInt3297 * -1640540455 < local29 + (local31 & 0x1)) {
				@Pc(50) Class120_Sub1 local50 = arg0[local31];
				arg0[local31] = arg0[local10];
				arg0[local10++] = local50;
			}
		}
		arg0[arg2] = arg0[local10];
		arg0[local10] = local14;
		this.method31584(arg0, arg1, local10 - 1);
		this.method31584(arg0, local10 + 1, arg2);
	}

	@OriginalMember(owner = "client!te", name = "fj", descriptor = "([Lclient!alf;II)V")
	void method31698(@OriginalArg(0) Class120_Sub1[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(8) int local8 = (arg1 + arg2) / 2;
		@Pc(10) int local10 = arg1;
		@Pc(14) Class120_Sub1 local14 = arg0[local8];
		arg0[local8] = arg0[arg2];
		arg0[arg2] = local14;
		@Pc(29) int local29 = local14.anInt3297 * -1640540455;
		for (@Pc(31) int local31 = arg1; local31 < arg2; local31++) {
			if (arg0[local31].anInt3297 * -1640540455 < local29 + (local31 & 0x1)) {
				@Pc(50) Class120_Sub1 local50 = arg0[local31];
				arg0[local31] = arg0[local10];
				arg0[local10++] = local50;
			}
		}
		arg0[arg2] = arg0[local10];
		arg0[local10] = local14;
		this.method31584(arg0, arg1, local10 - 1);
		this.method31584(arg0, local10 + 1, arg2);
	}

	@OriginalMember(owner = "client!te", name = "fn", descriptor = "(Lclient!arx;III[Z)Z")
	public boolean method31699(@OriginalArg(0) Class80_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (this.aClass100Array1 != this.aClass100Array2) {
			@Pc(15) int local15 = this.aClass100Array3[arg1].method2915(arg2, arg3, (byte) -76);
			for (@Pc(17) int local17 = 0; local17 <= arg1; local17++) {
				@Pc(25) Class100 local25 = this.aClass100Array3[local17];
				if (local25 != null) {
					@Pc(37) int local37 = local15 - local25.method2915(arg2, arg3, (byte) -86);
					if (arg4 != null) {
						arg4[local17] = local25.method2922(arg0, arg2, local37, arg3, 0, false);
						if (!arg4[local17]) {
							continue;
						}
					}
					local25.method2920(arg0, arg2, local37, arg3, 0, false);
					local1 = true;
				}
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!te", name = "an", descriptor = "(Z[[[BIBI)V")
	void method31700(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4) {
		@Pc(5) int local5 = arg0 ? 1 : 0;
		this.anInt5251 = 0;
		this.anInt5252 = 0;
		this.anInt5257 += -956241975;
		@Pc(27) Class120_Sub1 local27;
		if ((arg4 & 0x2) == 0) {
			for (local27 = this.aClass120_Sub1Array2[local5]; local27 != null; local27 = local27.aClass120_Sub1_23) {
				this.method31582(local27, 2036747717);
				if (local27.anInt3297 * -1640540455 != -1 && !this.method31585(local27, arg0, arg1, arg2, arg3)) {
					this.aClass120_Sub1Array4[(this.anInt5251 += -1088753761) * -136942497 - 1] = local27;
				}
			}
		}
		@Pc(184) int local184;
		if ((arg4 & 0x1) == 0) {
			for (local27 = this.aClass120_Sub1Array1[local5]; local27 != null; local27 = local27.aClass120_Sub1_23) {
				this.method31582(local27, 2036747717);
				if (-1640540455 * local27.anInt3297 != -1 && !this.method31585(local27, arg0, arg1, arg2, arg3)) {
					this.aClass120_Sub1Array5[(this.anInt5252 += -377106319) * -100929391 - 1] = local27;
				}
			}
			for (local27 = this.aClass120_Sub1Array3[local5]; local27 != null; local27 = local27.aClass120_Sub1_23) {
				this.method31582(local27, 2036747717);
				if (-1640540455 * local27.anInt3297 != -1 && !this.method31585(local27, arg0, arg1, arg2, arg3)) {
					if (local27.method24565(-65263341)) {
						this.aClass120_Sub1Array5[(this.anInt5252 += -377106319) * -100929391 - 1] = local27;
					} else {
						this.aClass120_Sub1Array4[(this.anInt5251 += -1088753761) * -136942497 - 1] = local27;
					}
				}
			}
			if (!arg0) {
				for (local184 = 0; local184 < this.anInt5248 * 1760244179; local184++) {
					this.method31582(this.aClass120_Sub1_Sub1Array1[local184], 2036747717);
					if (this.aClass120_Sub1_Sub1Array1[local184].anInt3297 * -1640540455 != -1 && !this.method31585(this.aClass120_Sub1_Sub1Array1[local184], arg0, arg1, arg2, arg3)) {
						if (this.aClass120_Sub1_Sub1Array1[local184].method24565(-65263341)) {
							this.aClass120_Sub1Array5[(this.anInt5252 += -377106319) * -100929391 - 1] = this.aClass120_Sub1_Sub1Array1[local184];
						} else {
							this.aClass120_Sub1Array4[(this.anInt5251 += -1088753761) * -136942497 - 1] = this.aClass120_Sub1_Sub1Array1[local184];
						}
					}
				}
			}
		}
		if (this.anInt5251 * -136942497 > 0) {
			this.method31584(this.aClass120_Sub1Array4, 0, this.anInt5251 * -136942497 - 1);
			for (local184 = 0; local184 < this.anInt5251 * -136942497; local184++) {
				this.method31586(this.aClass120_Sub1Array4[local184], this.aClass80_Sub12Array23);
			}
		}
		if (this.aBoolean916) {
			this.aClass102_12.method20770(0, null);
		}
		if ((arg4 & 0x2) == 0) {
			for (local184 = 0; local184 < this.anInt5242 * 1984662039; local184++) {
				@Pc(326) int local326;
				@Pc(361) int local361;
				@Pc(397) boolean[][] local397;
				@Pc(405) int local405;
				@Pc(420) int local420;
				@Pc(425) int local425;
				if (local184 < arg2 || arg1 == null) {
					local326 = this.aBooleanArrayArray20.length;
					if (this.anInt5249 * -1587881333 + this.aBooleanArrayArray20.length > this.anInt5245 * 1487025827) {
						local326 -= this.anInt5249 * -1587881333 + this.aBooleanArrayArray20.length - this.anInt5245 * 1487025827;
					}
					local361 = this.aBooleanArrayArray20[0].length;
					if (this.aBooleanArrayArray20[0].length + this.anInt5262 * -393076675 > this.anInt5246 * -1561777241) {
						local361 -= this.aBooleanArrayArray20[0].length + this.anInt5262 * -393076675 - this.anInt5246 * -1561777241;
					}
					local397 = this.aBooleanArrayArray21;
					if (this.aBoolean918) {
						for (local405 = this.anInt5259 * 1311777909; local405 < local326; local405++) {
							local420 = local405 + this.anInt5249 * -1587881333 - this.anInt5259 * 1311777909;
							for (local425 = this.anInt5260 * -1853894865; local425 < local361; local425++) {
								if (this.aBooleanArrayArray20[local405][local425] && !this.aClass600_1.method32064(local184, local420, this.anInt5262 * -393076675 + local425 - this.anInt5260 * -1853894865)) {
									local397[local405][local425] = true;
								} else {
									local397[local405][local425] = false;
								}
							}
						}
					}
					this.aClass100Array1[local184].method2913(this.anInt5241 * 1611671173, this.anInt5253 * 1105662773, this.anInt5244 * 1989483179, this.aBooleanArrayArray21, true, arg4);
				} else {
					local326 = this.aBooleanArrayArray20.length;
					if (this.aBooleanArrayArray20.length + this.anInt5249 * -1587881333 > this.anInt5245 * 1487025827) {
						local326 -= this.anInt5249 * -1587881333 + this.aBooleanArrayArray20.length - this.anInt5245 * 1487025827;
					}
					local361 = this.aBooleanArrayArray20[0].length;
					if (this.anInt5262 * -393076675 + this.aBooleanArrayArray20[0].length > this.anInt5246 * -1561777241) {
						local361 -= this.aBooleanArrayArray20[0].length + this.anInt5262 * -393076675 - this.anInt5246 * -1561777241;
					}
					local397 = this.aBooleanArrayArray21;
					if (this.aBoolean918) {
						for (local405 = this.anInt5259 * 1311777909; local405 < local326; local405++) {
							local420 = this.anInt5249 * -1587881333 + local405 - this.anInt5259 * 1311777909;
							for (local425 = this.anInt5260 * -1853894865; local425 < local361; local425++) {
								local397[local405][local425] = false;
								if (this.aBooleanArrayArray20[local405][local425]) {
									@Pc(453) int local453 = this.anInt5262 * -393076675 + local425 - this.anInt5260 * -1853894865;
									for (@Pc(455) int local455 = local184; local455 >= 0; local455--) {
										if (this.aClass568ArrayArrayArray1[local455][local420][local453] != null && this.aClass568ArrayArrayArray1[local455][local420][local453].aByte150 == local184) {
											if ((local455 < arg2 || arg1[local455][local420][local453] != arg3) && !this.aClass600_1.method32064(local184, local420, local453)) {
												local397[local405][local425] = true;
												break;
											}
											local397[local405][local425] = false;
											break;
										}
									}
								}
							}
						}
					}
					this.aClass100Array1[local184].method2913(this.anInt5241 * 1611671173, this.anInt5253 * 1105662773, this.anInt5244 * 1989483179, this.aBooleanArrayArray21, false, arg4);
				}
			}
		}
		if (this.anInt5252 * -100929391 > 0) {
			this.method31583(this.aClass120_Sub1Array5, 0, this.anInt5252 * -100929391 - 1);
			for (local184 = 0; local184 < this.anInt5252 * -100929391; local184++) {
				this.method31586(this.aClass120_Sub1Array5[local184], this.aClass80_Sub12Array23);
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "fa", descriptor = "(Lclient!alf;[Lclient!akb;)V")
	void method31701(@OriginalArg(0) Class120_Sub1 arg0, @OriginalArg(1) Class80_Sub12[] arg1) {
		@Pc(7) int local7;
		if (this.aBoolean916) {
			local7 = arg0.method24574(arg1, 999434924);
			this.aClass102_12.method20770(local7, arg1);
		}
		if (this.aClass100Array1 == this.aClass100Array2) {
			@Pc(19) boolean local19 = false;
			@Pc(21) boolean local21 = false;
			@Pc(25) Class463 local25 = arg0.method24552().aClass463_61;
			@Pc(36) int local36;
			if (arg0 instanceof Class120_Sub1_Sub1) {
				local7 = ((Class120_Sub1_Sub1) arg0).aShort129;
				local36 = ((Class120_Sub1_Sub1) arg0).aShort127;
			} else {
				local7 = (int) local25.aFloat297 >> this.anInt5258 * 1479624119;
				local36 = (int) local25.aFloat296 >> this.anInt5258 * 1479624119;
			}
			local7 = Math.min(this.anInt5245 * 1487025827 - 1, Math.max(0, local7));
			local36 = Math.min(this.anInt5246 * -1561777241 - 1, Math.max(0, local36));
			@Pc(81) Class229 local81 = new Class229();
			local81.anInt3687 = this.method31548(local7, local36, (short) 10243) * 899347469;
			local81.anInt3685 = this.method31547(local7, local36, (byte) -40) * -491759939;
			local81.anInt3686 = this.method31716(local7, local36, (byte) -62) * 1857469271;
			local81.anInt3684 = this.method31550(local7, local36, -195388027) * 60460553;
			local81.anInt3689 = this.method31555(local7, local36, (byte) -47) * 771615817;
			local81.anInt3690 = this.method31552(local7, local36, 515172469) * 1711455315;
			this.aClass102_12.method20868(this.aClass100Array3[0].method2915((int) local25.aFloat297, (int) local25.aFloat296, (byte) -43), local81);
		}
		@Pc(157) Class573 local157 = arg0.method24571(this.aClass102_12, -1368546350);
		if (local157 == null) {
			return;
		}
		if (local157.aBoolean919) {
			local157.aClass120_Sub1_25 = arg0;
			this.aClass582_1.method31829(local157, -2019229919);
		} else {
			Class558.method31398(local157, (byte) 0);
		}
	}

	@OriginalMember(owner = "client!te", name = "el", descriptor = "(III)Lclient!ash;")
	public Class120_Sub1_Sub4 method31702(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class568 local8 = this.aClass568ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass120_Sub1_Sub4_1 == null ? null : local8.aClass120_Sub1_Sub4_1;
	}

	@OriginalMember(owner = "client!te", name = "fw", descriptor = "(Lclient!arx;III[Z)V")
	public void method31703(@OriginalArg(0) Class80_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (this.aClass100Array2 == this.aClass100Array1) {
			return;
		}
		@Pc(13) int local13 = this.aClass100Array3[arg1].method2915(arg2, arg3, (byte) -113);
		for (@Pc(15) int local15 = 0; local15 <= arg1; local15++) {
			if (arg4 == null || arg4[local15]) {
				@Pc(29) Class100 local29 = this.aClass100Array3[local15];
				if (local29 != null) {
					local29.method2921(arg0, arg2, local13 - local29.method2915(arg2, arg3, (byte) -40), arg3, 0, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "fh", descriptor = "(Lclient!arx;III[Z)Z")
	public boolean method31704(@OriginalArg(0) Class80_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (this.aClass100Array1 != this.aClass100Array2) {
			@Pc(15) int local15 = this.aClass100Array3[arg1].method2915(arg2, arg3, (byte) -59);
			for (@Pc(17) int local17 = 0; local17 <= arg1; local17++) {
				@Pc(25) Class100 local25 = this.aClass100Array3[local17];
				if (local25 != null) {
					@Pc(37) int local37 = local15 - local25.method2915(arg2, arg3, (byte) -20);
					if (arg4 != null) {
						arg4[local17] = local25.method2922(arg0, arg2, local37, arg3, 0, false);
						if (!arg4[local17]) {
							continue;
						}
					}
					local25.method2920(arg0, arg2, local37, arg3, 0, false);
					local1 = true;
				}
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!te", name = "r", descriptor = "(IIIIIIIII)V")
	public void method31705(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.anIntArrayArray62 != null) {
			this.anIntArrayArray62[arg0][arg1] = arg2 | 0xFF000000;
		}
		if (this.aShortArrayArray4 != null) {
			this.aShortArrayArray4[arg0][arg1] = (short) arg3;
		}
		if (this.aByteArrayArray25 != null) {
			this.aByteArrayArray25[arg0][arg1] = (byte) arg4;
		}
		if (this.aByteArrayArray23 != null) {
			this.aByteArrayArray23[arg0][arg1] = (byte) arg5;
		}
		if (this.aByteArrayArray22 != null) {
			this.aByteArrayArray22[arg0][arg1] = (byte) arg6;
		}
		if (this.aByteArrayArray24 != null) {
			this.aByteArrayArray24[arg0][arg1] = (byte) arg7;
		}
	}

	@OriginalMember(owner = "client!te", name = "fq", descriptor = "(Lclient!alf;Z[[[BIB)Z")
	boolean method31706(@OriginalArg(0) Class120_Sub1 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte[][][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		if (!this.aBoolean918) {
			return false;
		} else if (arg0 instanceof Class120_Sub1_Sub1) {
			@Pc(11) short local11 = ((Class120_Sub1_Sub1) arg0).aShort126;
			@Pc(15) short local15 = ((Class120_Sub1_Sub1) arg0).aShort128;
			@Pc(19) short local19 = ((Class120_Sub1_Sub1) arg0).aShort129;
			@Pc(23) short local23 = ((Class120_Sub1_Sub1) arg0).aShort127;
			for (@Pc(25) int local25 = local19; local25 <= local11; local25++) {
				for (@Pc(30) int local30 = local23; local30 <= local15; local30++) {
					if (arg0.aByte100 < this.anInt5242 * 1984662039 && local25 >= this.anInt5249 * -1587881333 && local25 < this.anInt5261 * 1265602697 && local30 >= this.anInt5262 * -393076675 && local30 < this.anInt5266 * -85405183) {
						if ((arg2 == null || arg0.aByte99 < arg3 || arg2[arg0.aByte99][local25][local30] != arg4) && arg0.method24576((short) -5551) && !arg0.method24575(this.aClass102_12, -1380987821)) {
							return false;
						}
						if (!arg1 && local25 >= this.anInt5241 * 1611671173 - 16 && local25 <= this.anInt5241 * 1611671173 + 16 && local30 >= this.anInt5253 * 1105662773 - 16 && local30 <= this.anInt5253 * 1105662773 + 16) {
							arg0.method24572(this.aClass102_12, (byte) -7);
						}
						return true;
					}
				}
			}
			return true;
		} else {
			@Pc(144) Class463 local144 = arg0.method24552().aClass463_61;
			@Pc(153) int local153 = (int) local144.aFloat297 >> this.anInt5258 * 1479624119;
			@Pc(162) int local162 = (int) local144.aFloat296 >> this.anInt5258 * 1479624119;
			if (arg0.aByte100 >= this.anInt5242 * 1984662039 || local153 < this.anInt5249 * -1587881333 || local153 >= this.anInt5261 * 1265602697 || local162 < this.anInt5262 * -393076675 || local162 >= this.anInt5266 * -85405183) {
				return true;
			} else if ((arg2 == null || arg0.aByte99 < arg3 || arg2[arg0.aByte99][local153][local162] != arg4) && arg0.method24576((short) -6352) && !arg0.method24575(this.aClass102_12, -1380987821)) {
				return false;
			} else {
				if (!arg1 && local153 >= this.anInt5241 * 1611671173 - 16 && local153 <= this.anInt5241 * 1611671173 + 16 && local162 >= this.anInt5253 * 1105662773 - 16 && local162 <= this.anInt5253 * 1105662773 + 16) {
					arg0.method24572(this.aClass102_12, (byte) -62);
				}
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "fy", descriptor = "(Lclient!arx;III[Z)V")
	public void method31707(@OriginalArg(0) Class80_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (this.aClass100Array2 == this.aClass100Array1) {
			return;
		}
		@Pc(13) int local13 = this.aClass100Array3[arg1].method2915(arg2, arg3, (byte) -18);
		for (@Pc(15) int local15 = 0; local15 <= arg1; local15++) {
			if (arg4 == null || arg4[local15]) {
				@Pc(29) Class100 local29 = this.aClass100Array3[local15];
				if (local29 != null) {
					local29.method2921(arg0, arg2, local13 - local29.method2915(arg2, arg3, (byte) -13), arg3, 0, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "z", descriptor = "(IIILclient!asq;Lclient!asq;I)V")
	public void method31708(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class120_Sub1_Sub3 arg3, @OriginalArg(4) Class120_Sub1_Sub3 arg4, @OriginalArg(5) int arg5) {
		@Pc(6) Class568 local6 = this.method31693(arg0, arg1, arg2, -2117573794);
		if (local6 == null) {
			return;
		}
		local6.aClass120_Sub1_Sub3_1 = arg3;
		local6.aClass120_Sub1_Sub3_2 = arg4;
		@Pc(23) int local23 = this.aClass100Array1 == this.aClass100Array2 ? 1 : 0;
		if (!arg3.method24567(-32648954)) {
			arg3.aClass120_Sub1_23 = this.aClass120_Sub1Array3[local23];
			this.aClass120_Sub1Array3[local23] = arg3;
		} else if (arg3.method24565(-65263341)) {
			arg3.aClass120_Sub1_23 = this.aClass120_Sub1Array1[local23];
			this.aClass120_Sub1Array1[local23] = arg3;
		} else {
			arg3.aClass120_Sub1_23 = this.aClass120_Sub1Array2[local23];
			this.aClass120_Sub1Array2[local23] = arg3;
		}
		if (arg4 == null) {
			return;
		}
		if (!arg4.method24567(-32648954)) {
			arg4.aClass120_Sub1_23 = this.aClass120_Sub1Array3[local23];
			this.aClass120_Sub1Array3[local23] = arg4;
		} else if (arg4.method24565(-65263341)) {
			arg4.aClass120_Sub1_23 = this.aClass120_Sub1Array1[local23];
			this.aClass120_Sub1Array1[local23] = arg4;
		} else {
			arg4.aClass120_Sub1_23 = this.aClass120_Sub1Array2[local23];
			this.aClass120_Sub1Array2[local23] = arg4;
		}
	}

	@OriginalMember(owner = "client!te", name = "fd", descriptor = "()V")
	public void method31709() {
		this.method31542(1, this.anInt5242 * 1984662039, (byte) 29);
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(IIII)Lclient!asq;")
	public Class120_Sub1_Sub3 method31710(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class568 local8 = this.aClass568ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			this.method31569(local8.aClass120_Sub1_Sub3_1, (short) 4281);
			if (local8.aClass120_Sub1_Sub3_1 != null) {
				@Pc(21) Class120_Sub1_Sub3 local21 = local8.aClass120_Sub1_Sub3_1;
				local8.aClass120_Sub1_Sub3_1 = null;
				return local21;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!te", name = "fr", descriptor = "()Ljava/util/HashMap;")
	public HashMap method31711() {
		this.aHashMap12.clear();
		@Pc(7) Iterator local7 = this.aHashMap11.entrySet().iterator();
		while (local7.hasNext()) {
			@Pc(14) Entry local14 = (Entry) local7.next();
			this.aHashMap12.put(local14.getKey(), ((Class595) ((List) local14.getValue()).get(0)).aClass80_Sub12_3);
		}
		return this.aHashMap12;
	}

	@OriginalMember(owner = "client!te", name = "cy", descriptor = "(II)I")
	public int method31712(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aByteArrayArray25 == null ? 0 : this.aByteArrayArray25[arg0][arg1] & 0xFF;
	}

	@OriginalMember(owner = "client!te", name = "ag", descriptor = "(IIII)Lclient!asi;")
	public Class120_Sub1_Sub2 method31713(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class568 local8 = this.aClass568ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass120_Sub1_Sub2_2;
	}

	@OriginalMember(owner = "client!te", name = "fs", descriptor = "()Ljava/util/HashMap;")
	public HashMap method31714() {
		this.aHashMap12.clear();
		@Pc(7) Iterator local7 = this.aHashMap11.entrySet().iterator();
		while (local7.hasNext()) {
			@Pc(14) Entry local14 = (Entry) local7.next();
			this.aHashMap12.put(local14.getKey(), ((Class595) ((List) local14.getValue()).get(0)).aClass80_Sub12_3);
		}
		return this.aHashMap12;
	}

	@OriginalMember(owner = "client!te", name = "ba", descriptor = "(IIIB)V")
	public void method31715(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		@Pc(6) List local6 = (List) this.aHashMap11.get(arg0);
		if (local6 == null) {
			return;
		}
		@Pc(19) float local19 = arg1 < 0 ? -1.0F : (float) arg1 / 100.0F;
		@Pc(22) Iterator local22 = local6.iterator();
		while (local22.hasNext()) {
			@Pc(29) Class595 local29 = (Class595) local22.next();
			local29.aClass80_Sub12_3.method13965(local19, arg2, 1379086248);
		}
	}

	@OriginalMember(owner = "client!te", name = "s", descriptor = "(IIB)I")
	public int method31716(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		return this.aByteArrayArray25 == null ? 0 : this.aByteArrayArray25[arg0][arg1] & 0xFF;
	}

	@OriginalMember(owner = "client!te", name = "ez", descriptor = "(III)Lclient!asc;")
	public Class120_Sub1_Sub5 method31717(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class568 local8 = this.aClass568ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass120_Sub1_Sub5_1;
	}

	@OriginalMember(owner = "client!te", name = "fi", descriptor = "(Ljava/util/HashMap;)V")
	public void method31718(@OriginalArg(0) HashMap arg0) {
		this.aHashMap12 = arg0;
	}

	@OriginalMember(owner = "client!te", name = "cd", descriptor = "(II)I")
	public int method31719(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aShortArrayArray4 == null ? 0 : this.aShortArrayArray4[arg0][arg1] & 0xFFFF;
	}
}
