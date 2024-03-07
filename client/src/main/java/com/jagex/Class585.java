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

@OriginalClass("client!tx")
public class Class585 {

	@OriginalMember(owner = "client!tx", name = "bl", descriptor = "I")
	static final int anInt5463 = 4;

	@OriginalMember(owner = "client!tx", name = "e", descriptor = "Z")
	public static boolean aBoolean818 = true;

	@OriginalMember(owner = "client!tx", name = "au", descriptor = "I")
	int anInt5440;

	@OriginalMember(owner = "client!tx", name = "o", descriptor = "[Lclient!cb;")
	public Class99[] aClass99Array1;

	@OriginalMember(owner = "client!tx", name = "aa", descriptor = "I")
	int anInt5446;

	@OriginalMember(owner = "client!tx", name = "bb", descriptor = "[[Z")
	boolean[][] aBooleanArrayArray12;

	@OriginalMember(owner = "client!tx", name = "v", descriptor = "[[[Lclient!tk;")
	public Class572[][][] aClass572ArrayArrayArray3;

	@OriginalMember(owner = "client!tx", name = "ap", descriptor = "I")
	int anInt5451;

	@OriginalMember(owner = "client!tx", name = "aq", descriptor = "I")
	int anInt5452;

	@OriginalMember(owner = "client!tx", name = "ax", descriptor = "I")
	int anInt5453;

	@OriginalMember(owner = "client!tx", name = "av", descriptor = "I")
	int anInt5454;

	@OriginalMember(owner = "client!tx", name = "aj", descriptor = "I")
	int anInt5456;

	@OriginalMember(owner = "client!tx", name = "ay", descriptor = "I")
	int anInt5457;

	@OriginalMember(owner = "client!tx", name = "az", descriptor = "I")
	int anInt5458;

	@OriginalMember(owner = "client!tx", name = "ar", descriptor = "I")
	int anInt5459;

	@OriginalMember(owner = "client!tx", name = "af", descriptor = "I")
	int anInt5460;

	@OriginalMember(owner = "client!tx", name = "ab", descriptor = "I")
	int anInt5461;

	@OriginalMember(owner = "client!tx", name = "z", descriptor = "Z")
	boolean aBoolean819;

	@OriginalMember(owner = "client!tx", name = "f", descriptor = "I")
	final int anInt5441 = 16;

	@OriginalMember(owner = "client!tx", name = "t", descriptor = "I")
	int anInt5465 = 0;

	@OriginalMember(owner = "client!tx", name = "ae", descriptor = "I")
	final int anInt5448 = 10078;

	@OriginalMember(owner = "client!tx", name = "ag", descriptor = "I")
	final int anInt5437 = 5096;

	@OriginalMember(owner = "client!tx", name = "ah", descriptor = "I")
	final int anInt5450 = 5005;

	@OriginalMember(owner = "client!tx", name = "ak", descriptor = "[F")
	final float[] aFloatArray118 = new float[3];

	@OriginalMember(owner = "client!tx", name = "an", descriptor = "[Lclient!akf;")
	final Class93_Sub16[] aClass93_Sub16Array23 = new Class93_Sub16[8];

	@OriginalMember(owner = "client!tx", name = "bf", descriptor = "I")
	final int anInt5462 = 65253;

	@OriginalMember(owner = "client!tx", name = "bc", descriptor = "Ljava/util/HashMap;")
	HashMap aHashMap11 = new HashMap();

	@OriginalMember(owner = "client!tx", name = "bi", descriptor = "Ljava/util/HashMap;")
	HashMap aHashMap12 = new HashMap();

	@OriginalMember(owner = "client!tx", name = "w", descriptor = "Lclient!dh;")
	final Class104 aClass104_11;

	@OriginalMember(owner = "client!tx", name = "u", descriptor = "Z")
	final boolean aBoolean817;

	@OriginalMember(owner = "client!tx", name = "n", descriptor = "I")
	public final int anInt5438;

	@OriginalMember(owner = "client!tx", name = "m", descriptor = "I")
	final int anInt5439;

	@OriginalMember(owner = "client!tx", name = "k", descriptor = "I")
	final int anInt5447;

	@OriginalMember(owner = "client!tx", name = "d", descriptor = "I")
	public int anInt5442;

	@OriginalMember(owner = "client!tx", name = "c", descriptor = "I")
	public final int anInt5443;

	@OriginalMember(owner = "client!tx", name = "r", descriptor = "I")
	public final int anInt5444;

	@OriginalMember(owner = "client!tx", name = "ao", descriptor = "I")
	int anInt5455;

	@OriginalMember(owner = "client!tx", name = "l", descriptor = "Lclient!aci;")
	Class59 aClass59_1;

	@OriginalMember(owner = "client!tx", name = "p", descriptor = "Lclient!um;")
	public final Class598 aClass598_2;

	@OriginalMember(owner = "client!tx", name = "s", descriptor = "[[[Lclient!tk;")
	public Class572[][][] aClass572ArrayArrayArray1;

	@OriginalMember(owner = "client!tx", name = "y", descriptor = "[Lclient!cb;")
	public Class99[] aClass99Array2;

	@OriginalMember(owner = "client!tx", name = "b", descriptor = "[[I")
	int[][] anIntArrayArray62;

	@OriginalMember(owner = "client!tx", name = "a", descriptor = "[[B")
	byte[][] aByteArrayArray24;

	@OriginalMember(owner = "client!tx", name = "h", descriptor = "[[S")
	short[][] aShortArrayArray5;

	@OriginalMember(owner = "client!tx", name = "g", descriptor = "[[B")
	byte[][] aByteArrayArray23;

	@OriginalMember(owner = "client!tx", name = "i", descriptor = "[[B")
	byte[][] aByteArrayArray25;

	@OriginalMember(owner = "client!tx", name = "j", descriptor = "[[B")
	byte[][] aByteArrayArray22;

	@OriginalMember(owner = "client!tx", name = "q", descriptor = "[[[Lclient!tk;")
	public Class572[][][] aClass572ArrayArrayArray2;

	@OriginalMember(owner = "client!tx", name = "x", descriptor = "[Lclient!cb;")
	public Class99[] aClass99Array3;

	@OriginalMember(owner = "client!tx", name = "bh", descriptor = "[[[J")
	long[][][] aLongArrayArrayArray1;

	@OriginalMember(owner = "client!tx", name = "bx", descriptor = "[Lclient!ul;")
	Class597[] aClass597Array1;

	@OriginalMember(owner = "client!tx", name = "bd", descriptor = "[Z")
	boolean[] aBooleanArray32;

	@OriginalMember(owner = "client!tx", name = "bk", descriptor = "I")
	int anInt5464;

	@OriginalMember(owner = "client!tx", name = "al", descriptor = "[Lclient!alh;")
	final Class132_Sub1[] aClass132_Sub1Array1;

	@OriginalMember(owner = "client!tx", name = "ac", descriptor = "[Lclient!alh;")
	final Class132_Sub1[] aClass132_Sub1Array2;

	@OriginalMember(owner = "client!tx", name = "ai", descriptor = "[Lclient!alh;")
	final Class132_Sub1[] aClass132_Sub1Array5;

	@OriginalMember(owner = "client!tx", name = "ad", descriptor = "[Lclient!alh;")
	final Class132_Sub1[] aClass132_Sub1Array4;

	@OriginalMember(owner = "client!tx", name = "aw", descriptor = "I")
	int anInt5449;

	@OriginalMember(owner = "client!tx", name = "at", descriptor = "[Lclient!alh;")
	final Class132_Sub1[] aClass132_Sub1Array3;

	@OriginalMember(owner = "client!tx", name = "as", descriptor = "I")
	int anInt5445;

	@OriginalMember(owner = "client!tx", name = "am", descriptor = "[Lclient!ash;")
	final Class132_Sub1_Sub1[] aClass132_Sub1_Sub1Array1;

	@OriginalMember(owner = "client!tx", name = "bm", descriptor = "[[Z")
	boolean[][] aBooleanArrayArray14;

	@OriginalMember(owner = "client!tx", name = "bt", descriptor = "[[Z")
	boolean[][] aBooleanArrayArray13;

	@OriginalMember(owner = "client!tx", name = "bq", descriptor = "[I")
	final int[] anIntArray474;

	@OriginalMember(owner = "client!tx", name = "bn", descriptor = "Lclient!tg;")
	public Class569 aClass569_2;

	@OriginalMember(owner = "client!tx", name = "<init>", descriptor = "(Lclient!dh;IIIIIZZ)V", line = 87)
	public Class585(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7) {
		this.aClass104_11 = arg0;
		this.aBoolean817 = this.aClass104_11.method20527() > 0;
		this.anInt5438 = arg1 * 242119399;
		this.anInt5439 = (0x1 << this.anInt5438 * -358186793) * 1712305857;
		this.anInt5447 = (this.anInt5439 * -77997759 >> 1) * -1329300301;
		this.anInt5442 = arg2 * 1454838311;
		this.anInt5443 = arg3 * -1515812689;
		this.anInt5444 = arg4 * 193689033;
		this.anInt5455 = arg5 * -255589973;
		this.aClass59_1 = new Class59();
		this.aClass598_2 = new Class598(this);
		this.aClass572ArrayArrayArray1 = new Class572[arg2][this.anInt5443 * -200159665][this.anInt5444 * -1943751559];
		this.aClass99Array2 = new Class99[arg2];
		if (arg6) {
			this.anIntArrayArray62 = new int[this.anInt5443 * -200159665][this.anInt5444 * -1943751559];
			this.aByteArrayArray24 = new byte[this.anInt5443 * -200159665][this.anInt5444 * -1943751559];
			this.aShortArrayArray5 = new short[this.anInt5443 * -200159665][this.anInt5444 * -1943751559];
			this.aByteArrayArray23 = new byte[this.anInt5443 * -200159665][this.anInt5444 * -1943751559];
			this.aByteArrayArray25 = new byte[this.anInt5443 * -200159665][this.anInt5444 * -1943751559];
			this.aByteArrayArray22 = new byte[this.anInt5443 * -200159665][this.anInt5444 * -1943751559];
			this.aClass572ArrayArrayArray2 = new Class572[1][this.anInt5443 * -200159665][this.anInt5444 * -1943751559];
			this.aClass99Array3 = new Class99[1];
		}
		if (arg7) {
			this.aLongArrayArrayArray1 = new long[arg2][arg3][arg4];
			this.aClass597Array1 = new Class597[65253];
			this.aBooleanArray32 = new boolean[65253];
			this.anInt5464 = 0;
		}
		this.method31438(false, 870300168);
		this.aClass132_Sub1Array1 = new Class132_Sub1[2];
		this.aClass132_Sub1Array2 = new Class132_Sub1[2];
		this.aClass132_Sub1Array5 = new Class132_Sub1[2];
		this.aClass132_Sub1Array4 = new Class132_Sub1[10078];
		this.anInt5449 = 0;
		this.aClass132_Sub1Array3 = new Class132_Sub1[5096];
		this.anInt5445 = 0;
		this.aClass132_Sub1_Sub1Array1 = new Class132_Sub1_Sub1[5005];
		this.anInt5465 = 0;
		this.aBooleanArrayArray14 = new boolean[this.anInt5455 * -93916925 + this.anInt5455 * -93916925 + 1][this.anInt5455 * -93916925 + 1 + this.anInt5455 * -93916925];
		this.aBooleanArrayArray13 = new boolean[this.anInt5455 * -93916925 + this.anInt5455 * -93916925 + 2][this.anInt5455 * -93916925 + this.anInt5455 * -93916925 + 2];
		this.anIntArray474 = new int[this.anInt5455 * -93916925 + this.anInt5455 * -93916925 + 2];
		this.aClass569_2 = new Class569(false);
	}

	@OriginalMember(owner = "client!tx", name = "w", descriptor = "(ZI)V", line = 91)
	public static void method31429(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!tx", name = "i", descriptor = "(Lclient!yf;B)V", line = 118)
	static void method31430(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray519[arg0.anInt5891 * -1497248091 - 1] = ((Class347) Class288.aClass55_Sub2_1.get(arg0.anIntArray519[arg0.anInt5891 * -1497248091 - 1], 321826192)).method27592(Class624.playerVariableManager, 1317834618) ? 1 : 0;
	}

	@OriginalMember(owner = "client!tx", name = "e", descriptor = "(IB)V", line = 133)
	public void method31431(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
	}

	@OriginalMember(owner = "client!tx", name = "bi", descriptor = "(I)V", line = 133)
	public void method31432(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!tx", name = "bn", descriptor = "(I)V", line = 133)
	public void method31433(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!tx", name = "n", descriptor = "(Lclient!eu;B)V", line = 134)
	public void method31434(@OriginalArg(0) Class106 arg0, @OriginalArg(1) byte arg1) {
	}

	@OriginalMember(owner = "client!tx", name = "bt", descriptor = "(Lclient!eu;)V", line = 134)
	public void method31435(@OriginalArg(0) Class106 arg0) {
	}

	@OriginalMember(owner = "client!tx", name = "bq", descriptor = "(Lclient!eu;)V", line = 134)
	public void method31436(@OriginalArg(0) Class106 arg0) {
	}

	@OriginalMember(owner = "client!tx", name = "bb", descriptor = "(Z)V", line = 137)
	public void method31437(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.aClass572ArrayArrayArray3 = this.aClass572ArrayArrayArray2;
			this.aClass99Array1 = this.aClass99Array3;
		} else {
			this.aClass572ArrayArrayArray3 = this.aClass572ArrayArrayArray1;
			this.aClass99Array1 = this.aClass99Array2;
		}
		this.anInt5442 = this.aClass572ArrayArrayArray3.length * 1454838311;
	}

	@OriginalMember(owner = "client!tx", name = "m", descriptor = "(ZI)V", line = 137)
	public void method31438(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		if (arg0) {
			this.aClass572ArrayArrayArray3 = this.aClass572ArrayArrayArray2;
			this.aClass99Array1 = this.aClass99Array3;
		} else {
			this.aClass572ArrayArrayArray3 = this.aClass572ArrayArrayArray1;
			this.aClass99Array1 = this.aClass99Array2;
		}
		this.anInt5442 = this.aClass572ArrayArrayArray3.length * 1454838311;
	}

	@OriginalMember(owner = "client!tx", name = "bm", descriptor = "(Z)V", line = 137)
	public void method31439(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.aClass572ArrayArrayArray3 = this.aClass572ArrayArrayArray2;
			this.aClass99Array1 = this.aClass99Array3;
		} else {
			this.aClass572ArrayArrayArray3 = this.aClass572ArrayArrayArray1;
			this.aClass99Array1 = this.aClass99Array2;
		}
		this.anInt5442 = this.aClass572ArrayArrayArray3.length * 1454838311;
	}

	@OriginalMember(owner = "client!tx", name = "be", descriptor = "()V", line = 149)
	public void method31440() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5443 * -200159665; local1++) {
			for (@Pc(9) int local9 = 0; local9 < this.anInt5444 * -1943751559; local9++) {
				if (this.aClass572ArrayArrayArray3[0][local1][local9] == null) {
					this.aClass572ArrayArrayArray3[0][local1][local9] = new Class572(0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!tx", name = "by", descriptor = "()V", line = 149)
	public void method31441() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5443 * -200159665; local1++) {
			for (@Pc(9) int local9 = 0; local9 < this.anInt5444 * -1943751559; local9++) {
				if (this.aClass572ArrayArrayArray3[0][local1][local9] == null) {
					this.aClass572ArrayArrayArray3[0][local1][local9] = new Class572(0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!tx", name = "k", descriptor = "(I)V", line = 149)
	public void method31442(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5443 * -200159665; local1++) {
			for (@Pc(9) int local9 = 0; local9 < this.anInt5444 * -1943751559; local9++) {
				if (this.aClass572ArrayArrayArray3[0][local1][local9] == null) {
					this.aClass572ArrayArrayArray3[0][local1][local9] = new Class572(0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!tx", name = "f", descriptor = "(III)V", line = 157)
	public void method31443(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[0][arg0][arg1];
		for (@Pc(10) int local10 = 0; local10 < 3; local10++) {
			@Pc(33) Class572 local33 = this.aClass572ArrayArrayArray3[local10][arg0][arg1] = this.aClass572ArrayArrayArray3[local10 + 1][arg0][arg1];
			if (local33 != null) {
				for (@Pc(39) Class590 local39 = local33.aClass590_1; local39 != null; local39 = local39.aClass590_2) {
					@Pc(45) Class132_Sub1_Sub1 local45 = local39.aClass132_Sub1_Sub1_1;
					if (arg0 == local45.aShort129 && local45.aShort128 == arg1) {
						local45.aByte100--;
					}
				}
				if (local33.aClass132_Sub1_Sub4_1 != null) {
					local33.aClass132_Sub1_Sub4_1.aByte100--;
				}
				if (local33.aClass132_Sub1_Sub2_1 != null) {
					local33.aClass132_Sub1_Sub2_1.aByte100--;
				}
				if (local33.aClass132_Sub1_Sub2_2 != null) {
					local33.aClass132_Sub1_Sub2_2.aByte100--;
				}
				if (local33.aClass132_Sub1_Sub3_1 != null) {
					local33.aClass132_Sub1_Sub3_1.aByte100--;
				}
				if (local33.aClass132_Sub1_Sub3_2 != null) {
					local33.aClass132_Sub1_Sub3_2.aByte100--;
				}
			}
		}
		if (this.aClass572ArrayArrayArray3[0][arg0][arg1] == null) {
			this.aClass572ArrayArrayArray3[0][arg0][arg1] = new Class572(0);
			this.aClass572ArrayArrayArray3[0][arg0][arg1].aByte163 = 1;
		}
		this.aClass572ArrayArrayArray3[0][arg0][arg1].aClass572_1 = local8;
		this.aClass572ArrayArrayArray3[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!tx", name = "bw", descriptor = "(II)V", line = 157)
	public void method31444(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[0][arg0][arg1];
		for (@Pc(10) int local10 = 0; local10 < 3; local10++) {
			@Pc(33) Class572 local33 = this.aClass572ArrayArrayArray3[local10][arg0][arg1] = this.aClass572ArrayArrayArray3[local10 + 1][arg0][arg1];
			if (local33 != null) {
				for (@Pc(39) Class590 local39 = local33.aClass590_1; local39 != null; local39 = local39.aClass590_2) {
					@Pc(45) Class132_Sub1_Sub1 local45 = local39.aClass132_Sub1_Sub1_1;
					if (arg0 == local45.aShort129 && local45.aShort128 == arg1) {
						local45.aByte100--;
					}
				}
				if (local33.aClass132_Sub1_Sub4_1 != null) {
					local33.aClass132_Sub1_Sub4_1.aByte100--;
				}
				if (local33.aClass132_Sub1_Sub2_1 != null) {
					local33.aClass132_Sub1_Sub2_1.aByte100--;
				}
				if (local33.aClass132_Sub1_Sub2_2 != null) {
					local33.aClass132_Sub1_Sub2_2.aByte100--;
				}
				if (local33.aClass132_Sub1_Sub3_1 != null) {
					local33.aClass132_Sub1_Sub3_1.aByte100--;
				}
				if (local33.aClass132_Sub1_Sub3_2 != null) {
					local33.aClass132_Sub1_Sub3_2.aByte100--;
				}
			}
		}
		if (this.aClass572ArrayArrayArray3[0][arg0][arg1] == null) {
			this.aClass572ArrayArrayArray3[0][arg0][arg1] = new Class572(0);
			this.aClass572ArrayArrayArray3[0][arg0][arg1].aByte163 = 1;
		}
		this.aClass572ArrayArrayArray3[0][arg0][arg1].aClass572_1 = local8;
		this.aClass572ArrayArrayArray3[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!tx", name = "bo", descriptor = "(II)V", line = 157)
	public void method31445(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[0][arg0][arg1];
		for (@Pc(10) int local10 = 0; local10 < 3; local10++) {
			@Pc(33) Class572 local33 = this.aClass572ArrayArrayArray3[local10][arg0][arg1] = this.aClass572ArrayArrayArray3[local10 + 1][arg0][arg1];
			if (local33 != null) {
				for (@Pc(39) Class590 local39 = local33.aClass590_1; local39 != null; local39 = local39.aClass590_2) {
					@Pc(45) Class132_Sub1_Sub1 local45 = local39.aClass132_Sub1_Sub1_1;
					if (arg0 == local45.aShort129 && local45.aShort128 == arg1) {
						local45.aByte100--;
					}
				}
				if (local33.aClass132_Sub1_Sub4_1 != null) {
					local33.aClass132_Sub1_Sub4_1.aByte100--;
				}
				if (local33.aClass132_Sub1_Sub2_1 != null) {
					local33.aClass132_Sub1_Sub2_1.aByte100--;
				}
				if (local33.aClass132_Sub1_Sub2_2 != null) {
					local33.aClass132_Sub1_Sub2_2.aByte100--;
				}
				if (local33.aClass132_Sub1_Sub3_1 != null) {
					local33.aClass132_Sub1_Sub3_1.aByte100--;
				}
				if (local33.aClass132_Sub1_Sub3_2 != null) {
					local33.aClass132_Sub1_Sub3_2.aByte100--;
				}
			}
		}
		if (this.aClass572ArrayArrayArray3[0][arg0][arg1] == null) {
			this.aClass572ArrayArrayArray3[0][arg0][arg1] = new Class572(0);
			this.aClass572ArrayArrayArray3[0][arg0][arg1].aByte163 = 1;
		}
		this.aClass572ArrayArrayArray3[0][arg0][arg1].aClass572_1 = local8;
		this.aClass572ArrayArrayArray3[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!tx", name = "bu", descriptor = "(II)V", line = 157)
	public void method31446(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[0][arg0][arg1];
		for (@Pc(10) int local10 = 0; local10 < 3; local10++) {
			@Pc(33) Class572 local33 = this.aClass572ArrayArrayArray3[local10][arg0][arg1] = this.aClass572ArrayArrayArray3[local10 + 1][arg0][arg1];
			if (local33 != null) {
				for (@Pc(39) Class590 local39 = local33.aClass590_1; local39 != null; local39 = local39.aClass590_2) {
					@Pc(45) Class132_Sub1_Sub1 local45 = local39.aClass132_Sub1_Sub1_1;
					if (arg0 == local45.aShort129 && local45.aShort128 == arg1) {
						local45.aByte100--;
					}
				}
				if (local33.aClass132_Sub1_Sub4_1 != null) {
					local33.aClass132_Sub1_Sub4_1.aByte100--;
				}
				if (local33.aClass132_Sub1_Sub2_1 != null) {
					local33.aClass132_Sub1_Sub2_1.aByte100--;
				}
				if (local33.aClass132_Sub1_Sub2_2 != null) {
					local33.aClass132_Sub1_Sub2_2.aByte100--;
				}
				if (local33.aClass132_Sub1_Sub3_1 != null) {
					local33.aClass132_Sub1_Sub3_1.aByte100--;
				}
				if (local33.aClass132_Sub1_Sub3_2 != null) {
					local33.aClass132_Sub1_Sub3_2.aByte100--;
				}
			}
		}
		if (this.aClass572ArrayArrayArray3[0][arg0][arg1] == null) {
			this.aClass572ArrayArrayArray3[0][arg0][arg1] = new Class572(0);
			this.aClass572ArrayArrayArray3[0][arg0][arg1].aByte163 = 1;
		}
		this.aClass572ArrayArrayArray3[0][arg0][arg1].aClass572_1 = local8;
		this.aClass572ArrayArrayArray3[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!tx", name = "w", descriptor = "(IIIB)Lclient!tk;", line = 181)
	Class572 method31447(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		if (this.aClass572ArrayArrayArray3[arg0][arg1][arg2] == null) {
			@Pc(32) boolean local32 = this.aClass572ArrayArrayArray3[0][arg1][arg2] != null && this.aClass572ArrayArrayArray3[0][arg1][arg2].aClass572_1 != null;
			if (local32 && arg0 >= this.anInt5442 * -882426473 - 1) {
				return null;
			}
			this.method31453(arg0, arg1, arg2, -1879511558);
		}
		return this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
	}

	@OriginalMember(owner = "client!tx", name = "bz", descriptor = "(III)Lclient!tk;", line = 181)
	Class572 method31448(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass572ArrayArrayArray3[arg0][arg1][arg2] == null) {
			@Pc(32) boolean local32 = this.aClass572ArrayArrayArray3[0][arg1][arg2] != null && this.aClass572ArrayArrayArray3[0][arg1][arg2].aClass572_1 != null;
			if (local32 && arg0 >= this.anInt5442 * -882426473 - 1) {
				return null;
			}
			this.method31453(arg0, arg1, arg2, -506367580);
		}
		return this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
	}

	@OriginalMember(owner = "client!tx", name = "l", descriptor = "(IIIB)Lclient!tk;", line = 190)
	Class572 method31449(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		return this.method31447(arg0, Math.min(this.anInt5443 * -200159665 - 1, Math.max(0, arg1)), Math.min(this.anInt5444 * -1943751559 - 1, Math.max(0, arg2)), (byte) -99);
	}

	@OriginalMember(owner = "client!tx", name = "bv", descriptor = "(III)Lclient!tk;", line = 190)
	Class572 method31450(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return this.method31447(arg0, Math.min(this.anInt5443 * -200159665 - 1, Math.max(0, arg1)), Math.min(this.anInt5444 * -1943751559 - 1, Math.max(0, arg2)), (byte) -5);
	}

	@OriginalMember(owner = "client!tx", name = "br", descriptor = "(III)V", line = 194)
	public void method31451(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(24) boolean local24 = this.aClass572ArrayArrayArray3[0][arg1][arg2] != null && this.aClass572ArrayArrayArray3[0][arg1][arg2].aClass572_1 != null;
		for (@Pc(26) int local26 = arg0; local26 >= 0; local26--) {
			if (this.aClass572ArrayArrayArray3[local26][arg1][arg2] == null) {
				@Pc(52) Class572 local52 = this.aClass572ArrayArrayArray3[local26][arg1][arg2] = new Class572(local26);
				if (local24) {
					local52.aByte163++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!tx", name = "bg", descriptor = "(III)V", line = 194)
	public void method31452(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(24) boolean local24 = this.aClass572ArrayArrayArray3[0][arg1][arg2] != null && this.aClass572ArrayArrayArray3[0][arg1][arg2].aClass572_1 != null;
		for (@Pc(26) int local26 = arg0; local26 >= 0; local26--) {
			if (this.aClass572ArrayArrayArray3[local26][arg1][arg2] == null) {
				@Pc(52) Class572 local52 = this.aClass572ArrayArrayArray3[local26][arg1][arg2] = new Class572(local26);
				if (local24) {
					local52.aByte163++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!tx", name = "u", descriptor = "(IIII)V", line = 194)
	public void method31453(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(24) boolean local24 = this.aClass572ArrayArrayArray3[0][arg1][arg2] != null && this.aClass572ArrayArrayArray3[0][arg1][arg2].aClass572_1 != null;
		for (@Pc(26) int local26 = arg0; local26 >= 0; local26--) {
			if (this.aClass572ArrayArrayArray3[local26][arg1][arg2] == null) {
				@Pc(52) Class572 local52 = this.aClass572ArrayArrayArray3[local26][arg1][arg2] = new Class572(local26);
				if (local24) {
					local52.aByte163++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!tx", name = "z", descriptor = "(ILclient!cb;I)V", line = 204)
	public void method31454(@OriginalArg(0) int arg0, @OriginalArg(1) Class99 arg1, @OriginalArg(2) int arg2) {
		this.aClass99Array1[arg0] = arg1;
	}

	@OriginalMember(owner = "client!tx", name = "ba", descriptor = "(ILclient!cb;)V", line = 204)
	public void method31455(@OriginalArg(0) int arg0, @OriginalArg(1) Class99 arg1) {
		this.aClass99Array1[arg0] = arg1;
	}

	@OriginalMember(owner = "client!tx", name = "bp", descriptor = "(ILclient!cb;)V", line = 204)
	public void method31456(@OriginalArg(0) int arg0, @OriginalArg(1) Class99 arg1) {
		this.aClass99Array1[arg0] = arg1;
	}

	@OriginalMember(owner = "client!tx", name = "bj", descriptor = "(ILclient!cb;)V", line = 204)
	public void method31457(@OriginalArg(0) int arg0, @OriginalArg(1) Class99 arg1) {
		this.aClass99Array1[arg0] = arg1;
	}

	@OriginalMember(owner = "client!tx", name = "p", descriptor = "(III)I", line = 208)
	public int method31458(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return this.aShortArrayArray5 == null ? 0 : this.aShortArrayArray5[arg0][arg1] & 0xFFFF;
	}

	@OriginalMember(owner = "client!tx", name = "bs", descriptor = "(II)I", line = 208)
	public int method31459(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aShortArrayArray5 == null ? 0 : this.aShortArrayArray5[arg0][arg1] & 0xFFFF;
	}

	@OriginalMember(owner = "client!tx", name = "cl", descriptor = "(II)I", line = 208)
	public int method31460(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aShortArrayArray5 == null ? 0 : this.aShortArrayArray5[arg0][arg1] & 0xFFFF;
	}

	@OriginalMember(owner = "client!tx", name = "d", descriptor = "(IIB)I", line = 212)
	public int method31461(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		return this.anIntArrayArray62 == null ? 0 : this.anIntArrayArray62[arg0][arg1] & 0xFFFFFF;
	}

	@OriginalMember(owner = "client!tx", name = "ce", descriptor = "(II)I", line = 212)
	public int method31462(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray62 == null ? 0 : this.anIntArrayArray62[arg0][arg1] & 0xFFFFFF;
	}

	@OriginalMember(owner = "client!tx", name = "cu", descriptor = "(II)I", line = 212)
	public int method31463(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray62 == null ? 0 : this.anIntArrayArray62[arg0][arg1] & 0xFFFFFF;
	}

	@OriginalMember(owner = "client!tx", name = "ci", descriptor = "(II)I", line = 212)
	public int method31464(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray62 == null ? 0 : this.anIntArrayArray62[arg0][arg1] & 0xFFFFFF;
	}

	@OriginalMember(owner = "client!tx", name = "cg", descriptor = "(II)I", line = 212)
	public int method31465(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray62 == null ? 0 : this.anIntArrayArray62[arg0][arg1] & 0xFFFFFF;
	}

	@OriginalMember(owner = "client!tx", name = "cp", descriptor = "(II)I", line = 216)
	public int method31466(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aByteArrayArray24 == null ? 0 : this.aByteArrayArray24[arg0][arg1] & 0xFF;
	}

	@OriginalMember(owner = "client!tx", name = "cn", descriptor = "(II)I", line = 216)
	public int method31467(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aByteArrayArray24 == null ? 0 : this.aByteArrayArray24[arg0][arg1] & 0xFF;
	}

	@OriginalMember(owner = "client!tx", name = "cv", descriptor = "(II)I", line = 216)
	public int method31468(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aByteArrayArray24 == null ? 0 : this.aByteArrayArray24[arg0][arg1] & 0xFF;
	}

	@OriginalMember(owner = "client!tx", name = "c", descriptor = "(III)I", line = 216)
	public int method31469(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return this.aByteArrayArray24 == null ? 0 : this.aByteArrayArray24[arg0][arg1] & 0xFF;
	}

	@OriginalMember(owner = "client!tx", name = "r", descriptor = "(IIS)I", line = 220)
	public int method31470(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) short arg2) {
		return this.aByteArrayArray23 == null ? 0 : this.aByteArrayArray23[arg0][arg1] & 0xFF;
	}

	@OriginalMember(owner = "client!tx", name = "ca", descriptor = "(II)I", line = 220)
	public int method31471(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aByteArrayArray23 == null ? 0 : this.aByteArrayArray23[arg0][arg1] & 0xFF;
	}

	@OriginalMember(owner = "client!tx", name = "v", descriptor = "(IIB)I", line = 224)
	public int method31472(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		return this.aByteArrayArray25 == null ? 0 : this.aByteArrayArray25[arg0][arg1] & 0xFF;
	}

	@OriginalMember(owner = "client!tx", name = "cx", descriptor = "(II)I", line = 224)
	public int method31473(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aByteArrayArray25 == null ? 0 : this.aByteArrayArray25[arg0][arg1] & 0xFF;
	}

	@OriginalMember(owner = "client!tx", name = "o", descriptor = "(IIB)I", line = 228)
	public int method31474(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		return this.aByteArrayArray22 == null ? 0 : this.aByteArrayArray22[arg0][arg1] & 0xFF;
	}

	@OriginalMember(owner = "client!tx", name = "cw", descriptor = "(II)I", line = 228)
	public int method31475(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aByteArrayArray22 == null ? 0 : this.aByteArrayArray22[arg0][arg1] & 0xFF;
	}

	@OriginalMember(owner = "client!tx", name = "ct", descriptor = "(II)I", line = 228)
	public int method31476(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aByteArrayArray22 == null ? 0 : this.aByteArrayArray22[arg0][arg1] & 0xFF;
	}

	@OriginalMember(owner = "client!tx", name = "s", descriptor = "(IIIIIIIII)V", line = 232)
	public void method31477(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.anIntArrayArray62 != null) {
			this.anIntArrayArray62[arg0][arg1] = arg2 | 0xFF000000;
		}
		if (this.aShortArrayArray5 != null) {
			this.aShortArrayArray5[arg0][arg1] = (short) arg3;
		}
		if (this.aByteArrayArray24 != null) {
			this.aByteArrayArray24[arg0][arg1] = (byte) arg4;
		}
		if (this.aByteArrayArray23 != null) {
			this.aByteArrayArray23[arg0][arg1] = (byte) arg5;
		}
		if (this.aByteArrayArray25 != null) {
			this.aByteArrayArray25[arg0][arg1] = (byte) arg6;
		}
		if (this.aByteArrayArray22 != null) {
			this.aByteArrayArray22[arg0][arg1] = (byte) arg7;
		}
	}

	@OriginalMember(owner = "client!tx", name = "cf", descriptor = "(IIIIIIII)V", line = 232)
	public void method31478(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.anIntArrayArray62 != null) {
			this.anIntArrayArray62[arg0][arg1] = arg2 | 0xFF000000;
		}
		if (this.aShortArrayArray5 != null) {
			this.aShortArrayArray5[arg0][arg1] = (short) arg3;
		}
		if (this.aByteArrayArray24 != null) {
			this.aByteArrayArray24[arg0][arg1] = (byte) arg4;
		}
		if (this.aByteArrayArray23 != null) {
			this.aByteArrayArray23[arg0][arg1] = (byte) arg5;
		}
		if (this.aByteArrayArray25 != null) {
			this.aByteArrayArray25[arg0][arg1] = (byte) arg6;
		}
		if (this.aByteArrayArray22 != null) {
			this.aByteArrayArray22[arg0][arg1] = (byte) arg7;
		}
	}

	@OriginalMember(owner = "client!tx", name = "y", descriptor = "(IIILclient!asv;B)V", line = 241)
	public void method31479(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class132_Sub1_Sub4 arg3, @OriginalArg(4) byte arg4) {
		@Pc(6) Class572 local6 = this.method31447(arg0, arg1, arg2, (byte) -20);
		if (local6 == null) {
			return;
		}
		local6.aClass132_Sub1_Sub4_1 = arg3;
		@Pc(20) int local20 = this.aClass99Array3 == this.aClass99Array1 ? 1 : 0;
		if (!arg3.method24285((byte) 6)) {
			arg3.aClass132_Sub1_23 = this.aClass132_Sub1Array5[local20];
			this.aClass132_Sub1Array5[local20] = arg3;
		} else if (arg3.method24286((short) -896)) {
			arg3.aClass132_Sub1_23 = this.aClass132_Sub1Array2[local20];
			this.aClass132_Sub1Array2[local20] = arg3;
		} else {
			arg3.aClass132_Sub1_23 = this.aClass132_Sub1Array1[local20];
			this.aClass132_Sub1Array1[local20] = arg3;
		}
	}

	@OriginalMember(owner = "client!tx", name = "co", descriptor = "(IIILclient!asv;)V", line = 241)
	public void method31480(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class132_Sub1_Sub4 arg3) {
		@Pc(6) Class572 local6 = this.method31447(arg0, arg1, arg2, (byte) -82);
		if (local6 == null) {
			return;
		}
		local6.aClass132_Sub1_Sub4_1 = arg3;
		@Pc(20) int local20 = this.aClass99Array3 == this.aClass99Array1 ? 1 : 0;
		if (!arg3.method24285((byte) 6)) {
			arg3.aClass132_Sub1_23 = this.aClass132_Sub1Array5[local20];
			this.aClass132_Sub1Array5[local20] = arg3;
		} else if (arg3.method24286((short) -18134)) {
			arg3.aClass132_Sub1_23 = this.aClass132_Sub1Array2[local20];
			this.aClass132_Sub1Array2[local20] = arg3;
		} else {
			arg3.aClass132_Sub1_23 = this.aClass132_Sub1Array1[local20];
			this.aClass132_Sub1Array1[local20] = arg3;
		}
	}

	@OriginalMember(owner = "client!tx", name = "cr", descriptor = "(IIILclient!asv;)V", line = 241)
	public void method31481(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class132_Sub1_Sub4 arg3) {
		@Pc(6) Class572 local6 = this.method31447(arg0, arg1, arg2, (byte) -13);
		if (local6 == null) {
			return;
		}
		local6.aClass132_Sub1_Sub4_1 = arg3;
		@Pc(20) int local20 = this.aClass99Array3 == this.aClass99Array1 ? 1 : 0;
		if (!arg3.method24285((byte) 6)) {
			arg3.aClass132_Sub1_23 = this.aClass132_Sub1Array5[local20];
			this.aClass132_Sub1Array5[local20] = arg3;
		} else if (arg3.method24286((short) -25818)) {
			arg3.aClass132_Sub1_23 = this.aClass132_Sub1Array2[local20];
			this.aClass132_Sub1Array2[local20] = arg3;
		} else {
			arg3.aClass132_Sub1_23 = this.aClass132_Sub1Array1[local20];
			this.aClass132_Sub1Array1[local20] = arg3;
		}
	}

	@OriginalMember(owner = "client!tx", name = "cm", descriptor = "(IIILclient!asv;)V", line = 241)
	public void method31482(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class132_Sub1_Sub4 arg3) {
		@Pc(6) Class572 local6 = this.method31447(arg0, arg1, arg2, (byte) 35);
		if (local6 == null) {
			return;
		}
		local6.aClass132_Sub1_Sub4_1 = arg3;
		@Pc(20) int local20 = this.aClass99Array3 == this.aClass99Array1 ? 1 : 0;
		if (!arg3.method24285((byte) 6)) {
			arg3.aClass132_Sub1_23 = this.aClass132_Sub1Array5[local20];
			this.aClass132_Sub1Array5[local20] = arg3;
		} else if (arg3.method24286((short) -3475)) {
			arg3.aClass132_Sub1_23 = this.aClass132_Sub1Array2[local20];
			this.aClass132_Sub1Array2[local20] = arg3;
		} else {
			arg3.aClass132_Sub1_23 = this.aClass132_Sub1Array1[local20];
			this.aClass132_Sub1Array1[local20] = arg3;
		}
	}

	@OriginalMember(owner = "client!tx", name = "cq", descriptor = "(IIILclient!asv;)V", line = 241)
	public void method31483(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class132_Sub1_Sub4 arg3) {
		@Pc(6) Class572 local6 = this.method31447(arg0, arg1, arg2, (byte) 57);
		if (local6 == null) {
			return;
		}
		local6.aClass132_Sub1_Sub4_1 = arg3;
		@Pc(20) int local20 = this.aClass99Array3 == this.aClass99Array1 ? 1 : 0;
		if (!arg3.method24285((byte) 6)) {
			arg3.aClass132_Sub1_23 = this.aClass132_Sub1Array5[local20];
			this.aClass132_Sub1Array5[local20] = arg3;
		} else if (arg3.method24286((short) -1425)) {
			arg3.aClass132_Sub1_23 = this.aClass132_Sub1Array2[local20];
			this.aClass132_Sub1Array2[local20] = arg3;
		} else {
			arg3.aClass132_Sub1_23 = this.aClass132_Sub1Array1[local20];
			this.aClass132_Sub1Array1[local20] = arg3;
		}
	}

	@OriginalMember(owner = "client!tx", name = "q", descriptor = "(IIIILclient!ast;S)V", line = 263)
	public void method31484(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class132_Sub1_Sub5 arg4, @OriginalArg(5) short arg5) {
		@Pc(6) Class572 local6 = this.method31447(arg0, arg1, arg2, (byte) -57);
		if (local6 == null) {
			return;
		}
		arg4.method24239(new Class472((float) (this.anInt5447 * -996240773 + (arg1 << this.anInt5438 * -358186793)), (float) arg3, (float) ((arg2 << this.anInt5438 * -358186793) + this.anInt5447 * -996240773)));
		local6.aClass132_Sub1_Sub5_1 = arg4;
		@Pc(51) int local51 = this.aClass99Array3 == this.aClass99Array1 ? 1 : 0;
		if (!arg4.method24285((byte) 6)) {
			arg4.aClass132_Sub1_23 = this.aClass132_Sub1Array5[local51];
			this.aClass132_Sub1Array5[local51] = arg4;
		} else if (arg4.method24286((short) -9741)) {
			arg4.aClass132_Sub1_23 = this.aClass132_Sub1Array2[local51];
			this.aClass132_Sub1Array2[local51] = arg4;
		} else {
			arg4.aClass132_Sub1_23 = this.aClass132_Sub1Array1[local51];
			this.aClass132_Sub1Array1[local51] = arg4;
		}
	}

	@OriginalMember(owner = "client!tx", name = "ch", descriptor = "(IIIILclient!ast;)V", line = 263)
	public void method31485(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class132_Sub1_Sub5 arg4) {
		@Pc(6) Class572 local6 = this.method31447(arg0, arg1, arg2, (byte) -80);
		if (local6 == null) {
			return;
		}
		arg4.method24239(new Class472((float) (this.anInt5447 * -996240773 + (arg1 << this.anInt5438 * -358186793)), (float) arg3, (float) ((arg2 << this.anInt5438 * -358186793) + this.anInt5447 * -996240773)));
		local6.aClass132_Sub1_Sub5_1 = arg4;
		@Pc(51) int local51 = this.aClass99Array3 == this.aClass99Array1 ? 1 : 0;
		if (!arg4.method24285((byte) 6)) {
			arg4.aClass132_Sub1_23 = this.aClass132_Sub1Array5[local51];
			this.aClass132_Sub1Array5[local51] = arg4;
		} else if (arg4.method24286((short) -28075)) {
			arg4.aClass132_Sub1_23 = this.aClass132_Sub1Array2[local51];
			this.aClass132_Sub1Array2[local51] = arg4;
		} else {
			arg4.aClass132_Sub1_23 = this.aClass132_Sub1Array1[local51];
			this.aClass132_Sub1Array1[local51] = arg4;
		}
	}

	@OriginalMember(owner = "client!tx", name = "cb", descriptor = "(IIIILclient!ast;)V", line = 263)
	public void method31486(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class132_Sub1_Sub5 arg4) {
		@Pc(6) Class572 local6 = this.method31447(arg0, arg1, arg2, (byte) -23);
		if (local6 == null) {
			return;
		}
		arg4.method24239(new Class472((float) (this.anInt5447 * -996240773 + (arg1 << this.anInt5438 * -358186793)), (float) arg3, (float) ((arg2 << this.anInt5438 * -358186793) + this.anInt5447 * -996240773)));
		local6.aClass132_Sub1_Sub5_1 = arg4;
		@Pc(51) int local51 = this.aClass99Array3 == this.aClass99Array1 ? 1 : 0;
		if (!arg4.method24285((byte) 6)) {
			arg4.aClass132_Sub1_23 = this.aClass132_Sub1Array5[local51];
			this.aClass132_Sub1Array5[local51] = arg4;
		} else if (arg4.method24286((short) -5660)) {
			arg4.aClass132_Sub1_23 = this.aClass132_Sub1Array2[local51];
			this.aClass132_Sub1Array2[local51] = arg4;
		} else {
			arg4.aClass132_Sub1_23 = this.aClass132_Sub1Array1[local51];
			this.aClass132_Sub1Array1[local51] = arg4;
		}
	}

	@OriginalMember(owner = "client!tx", name = "cs", descriptor = "(IIIILclient!ast;)V", line = 263)
	public void method31487(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class132_Sub1_Sub5 arg4) {
		@Pc(6) Class572 local6 = this.method31447(arg0, arg1, arg2, (byte) 33);
		if (local6 == null) {
			return;
		}
		arg4.method24239(new Class472((float) (this.anInt5447 * -996240773 + (arg1 << this.anInt5438 * -358186793)), (float) arg3, (float) ((arg2 << this.anInt5438 * -358186793) + this.anInt5447 * -996240773)));
		local6.aClass132_Sub1_Sub5_1 = arg4;
		@Pc(51) int local51 = this.aClass99Array3 == this.aClass99Array1 ? 1 : 0;
		if (!arg4.method24285((byte) 6)) {
			arg4.aClass132_Sub1_23 = this.aClass132_Sub1Array5[local51];
			this.aClass132_Sub1Array5[local51] = arg4;
		} else if (arg4.method24286((short) -27545)) {
			arg4.aClass132_Sub1_23 = this.aClass132_Sub1Array2[local51];
			this.aClass132_Sub1Array2[local51] = arg4;
		} else {
			arg4.aClass132_Sub1_23 = this.aClass132_Sub1Array1[local51];
			this.aClass132_Sub1Array1[local51] = arg4;
		}
	}

	@OriginalMember(owner = "client!tx", name = "x", descriptor = "(IIILclient!asw;Lclient!asw;I)V", line = 286)
	public void method31488(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class132_Sub1_Sub2 arg3, @OriginalArg(4) Class132_Sub1_Sub2 arg4, @OriginalArg(5) int arg5) {
		@Pc(6) Class572 local6 = this.method31447(arg0, arg1, arg2, (byte) 88);
		if (local6 == null) {
			return;
		}
		local6.aClass132_Sub1_Sub2_1 = arg3;
		local6.aClass132_Sub1_Sub2_2 = arg4;
		@Pc(23) int local23 = this.aClass99Array1 == this.aClass99Array3 ? 1 : 0;
		if (!arg3.method24285((byte) 6)) {
			arg3.aClass132_Sub1_23 = this.aClass132_Sub1Array5[local23];
			this.aClass132_Sub1Array5[local23] = arg3;
		} else if (arg3.method24286((short) -10472)) {
			arg3.aClass132_Sub1_23 = this.aClass132_Sub1Array2[local23];
			this.aClass132_Sub1Array2[local23] = arg3;
		} else {
			arg3.aClass132_Sub1_23 = this.aClass132_Sub1Array1[local23];
			this.aClass132_Sub1Array1[local23] = arg3;
		}
		if (arg4 == null) {
			return;
		}
		if (!arg4.method24285((byte) 6)) {
			arg4.aClass132_Sub1_23 = this.aClass132_Sub1Array5[local23];
			this.aClass132_Sub1Array5[local23] = arg4;
		} else if (arg4.method24286((short) -16121)) {
			arg4.aClass132_Sub1_23 = this.aClass132_Sub1Array2[local23];
			this.aClass132_Sub1Array2[local23] = arg4;
		} else {
			arg4.aClass132_Sub1_23 = this.aClass132_Sub1Array1[local23];
			this.aClass132_Sub1Array1[local23] = arg4;
		}
	}

	@OriginalMember(owner = "client!tx", name = "cc", descriptor = "(IIILclient!asw;Lclient!asw;)V", line = 286)
	public void method31489(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class132_Sub1_Sub2 arg3, @OriginalArg(4) Class132_Sub1_Sub2 arg4) {
		@Pc(6) Class572 local6 = this.method31447(arg0, arg1, arg2, (byte) 32);
		if (local6 == null) {
			return;
		}
		local6.aClass132_Sub1_Sub2_1 = arg3;
		local6.aClass132_Sub1_Sub2_2 = arg4;
		@Pc(23) int local23 = this.aClass99Array1 == this.aClass99Array3 ? 1 : 0;
		if (!arg3.method24285((byte) 6)) {
			arg3.aClass132_Sub1_23 = this.aClass132_Sub1Array5[local23];
			this.aClass132_Sub1Array5[local23] = arg3;
		} else if (arg3.method24286((short) -5365)) {
			arg3.aClass132_Sub1_23 = this.aClass132_Sub1Array2[local23];
			this.aClass132_Sub1Array2[local23] = arg3;
		} else {
			arg3.aClass132_Sub1_23 = this.aClass132_Sub1Array1[local23];
			this.aClass132_Sub1Array1[local23] = arg3;
		}
		if (arg4 == null) {
			return;
		}
		if (!arg4.method24285((byte) 6)) {
			arg4.aClass132_Sub1_23 = this.aClass132_Sub1Array5[local23];
			this.aClass132_Sub1Array5[local23] = arg4;
		} else if (arg4.method24286((short) -28924)) {
			arg4.aClass132_Sub1_23 = this.aClass132_Sub1Array2[local23];
			this.aClass132_Sub1Array2[local23] = arg4;
		} else {
			arg4.aClass132_Sub1_23 = this.aClass132_Sub1Array1[local23];
			this.aClass132_Sub1Array1[local23] = arg4;
		}
	}

	@OriginalMember(owner = "client!tx", name = "cy", descriptor = "(IIILclient!asw;Lclient!asw;)V", line = 286)
	public void method31490(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class132_Sub1_Sub2 arg3, @OriginalArg(4) Class132_Sub1_Sub2 arg4) {
		@Pc(6) Class572 local6 = this.method31447(arg0, arg1, arg2, (byte) 4);
		if (local6 == null) {
			return;
		}
		local6.aClass132_Sub1_Sub2_1 = arg3;
		local6.aClass132_Sub1_Sub2_2 = arg4;
		@Pc(23) int local23 = this.aClass99Array1 == this.aClass99Array3 ? 1 : 0;
		if (!arg3.method24285((byte) 6)) {
			arg3.aClass132_Sub1_23 = this.aClass132_Sub1Array5[local23];
			this.aClass132_Sub1Array5[local23] = arg3;
		} else if (arg3.method24286((short) -4138)) {
			arg3.aClass132_Sub1_23 = this.aClass132_Sub1Array2[local23];
			this.aClass132_Sub1Array2[local23] = arg3;
		} else {
			arg3.aClass132_Sub1_23 = this.aClass132_Sub1Array1[local23];
			this.aClass132_Sub1Array1[local23] = arg3;
		}
		if (arg4 == null) {
			return;
		}
		if (!arg4.method24285((byte) 6)) {
			arg4.aClass132_Sub1_23 = this.aClass132_Sub1Array5[local23];
			this.aClass132_Sub1Array5[local23] = arg4;
		} else if (arg4.method24286((short) -3628)) {
			arg4.aClass132_Sub1_23 = this.aClass132_Sub1Array2[local23];
			this.aClass132_Sub1Array2[local23] = arg4;
		} else {
			arg4.aClass132_Sub1_23 = this.aClass132_Sub1Array1[local23];
			this.aClass132_Sub1Array1[local23] = arg4;
		}
	}

	@OriginalMember(owner = "client!tx", name = "cz", descriptor = "(IIILclient!asw;Lclient!asw;)V", line = 286)
	public void method31491(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class132_Sub1_Sub2 arg3, @OriginalArg(4) Class132_Sub1_Sub2 arg4) {
		@Pc(6) Class572 local6 = this.method31447(arg0, arg1, arg2, (byte) -34);
		if (local6 == null) {
			return;
		}
		local6.aClass132_Sub1_Sub2_1 = arg3;
		local6.aClass132_Sub1_Sub2_2 = arg4;
		@Pc(23) int local23 = this.aClass99Array1 == this.aClass99Array3 ? 1 : 0;
		if (!arg3.method24285((byte) 6)) {
			arg3.aClass132_Sub1_23 = this.aClass132_Sub1Array5[local23];
			this.aClass132_Sub1Array5[local23] = arg3;
		} else if (arg3.method24286((short) -12846)) {
			arg3.aClass132_Sub1_23 = this.aClass132_Sub1Array2[local23];
			this.aClass132_Sub1Array2[local23] = arg3;
		} else {
			arg3.aClass132_Sub1_23 = this.aClass132_Sub1Array1[local23];
			this.aClass132_Sub1Array1[local23] = arg3;
		}
		if (arg4 == null) {
			return;
		}
		if (!arg4.method24285((byte) 6)) {
			arg4.aClass132_Sub1_23 = this.aClass132_Sub1Array5[local23];
			this.aClass132_Sub1Array5[local23] = arg4;
		} else if (arg4.method24286((short) -19171)) {
			arg4.aClass132_Sub1_23 = this.aClass132_Sub1Array2[local23];
			this.aClass132_Sub1Array2[local23] = arg4;
		} else {
			arg4.aClass132_Sub1_23 = this.aClass132_Sub1Array1[local23];
			this.aClass132_Sub1Array1[local23] = arg4;
		}
	}

	@OriginalMember(owner = "client!tx", name = "b", descriptor = "(IIILclient!asm;Lclient!asm;B)V", line = 325)
	public void method31492(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class132_Sub1_Sub3 arg3, @OriginalArg(4) Class132_Sub1_Sub3 arg4, @OriginalArg(5) byte arg5) {
		@Pc(6) Class572 local6 = this.method31447(arg0, arg1, arg2, (byte) -13);
		if (local6 == null) {
			return;
		}
		local6.aClass132_Sub1_Sub3_1 = arg3;
		local6.aClass132_Sub1_Sub3_2 = arg4;
		@Pc(24) int local24 = this.aClass99Array3 == this.aClass99Array1 ? 1 : 0;
		if (!arg3.method24285((byte) 6)) {
			arg3.aClass132_Sub1_23 = this.aClass132_Sub1Array5[local24];
			this.aClass132_Sub1Array5[local24] = arg3;
		} else if (arg3.method24286((short) -11433)) {
			arg3.aClass132_Sub1_23 = this.aClass132_Sub1Array2[local24];
			this.aClass132_Sub1Array2[local24] = arg3;
		} else {
			arg3.aClass132_Sub1_23 = this.aClass132_Sub1Array1[local24];
			this.aClass132_Sub1Array1[local24] = arg3;
		}
		if (arg4 == null) {
			return;
		}
		if (!arg4.method24285((byte) 6)) {
			arg4.aClass132_Sub1_23 = this.aClass132_Sub1Array5[local24];
			this.aClass132_Sub1Array5[local24] = arg4;
		} else if (arg4.method24286((short) -20912)) {
			arg4.aClass132_Sub1_23 = this.aClass132_Sub1Array2[local24];
			this.aClass132_Sub1Array2[local24] = arg4;
		} else {
			arg4.aClass132_Sub1_23 = this.aClass132_Sub1Array1[local24];
			this.aClass132_Sub1Array1[local24] = arg4;
		}
	}

	@OriginalMember(owner = "client!tx", name = "ck", descriptor = "(IIILclient!asm;Lclient!asm;)V", line = 325)
	public void method31493(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class132_Sub1_Sub3 arg3, @OriginalArg(4) Class132_Sub1_Sub3 arg4) {
		@Pc(6) Class572 local6 = this.method31447(arg0, arg1, arg2, (byte) -71);
		if (local6 == null) {
			return;
		}
		local6.aClass132_Sub1_Sub3_1 = arg3;
		local6.aClass132_Sub1_Sub3_2 = arg4;
		@Pc(24) int local24 = this.aClass99Array3 == this.aClass99Array1 ? 1 : 0;
		if (!arg3.method24285((byte) 6)) {
			arg3.aClass132_Sub1_23 = this.aClass132_Sub1Array5[local24];
			this.aClass132_Sub1Array5[local24] = arg3;
		} else if (arg3.method24286((short) -7722)) {
			arg3.aClass132_Sub1_23 = this.aClass132_Sub1Array2[local24];
			this.aClass132_Sub1Array2[local24] = arg3;
		} else {
			arg3.aClass132_Sub1_23 = this.aClass132_Sub1Array1[local24];
			this.aClass132_Sub1Array1[local24] = arg3;
		}
		if (arg4 == null) {
			return;
		}
		if (!arg4.method24285((byte) 6)) {
			arg4.aClass132_Sub1_23 = this.aClass132_Sub1Array5[local24];
			this.aClass132_Sub1Array5[local24] = arg4;
		} else if (arg4.method24286((short) -126)) {
			arg4.aClass132_Sub1_23 = this.aClass132_Sub1Array2[local24];
			this.aClass132_Sub1Array2[local24] = arg4;
		} else {
			arg4.aClass132_Sub1_23 = this.aClass132_Sub1Array1[local24];
			this.aClass132_Sub1Array1[local24] = arg4;
		}
	}

	@OriginalMember(owner = "client!tx", name = "cj", descriptor = "(IIILclient!asm;Lclient!asm;)V", line = 325)
	public void method31494(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class132_Sub1_Sub3 arg3, @OriginalArg(4) Class132_Sub1_Sub3 arg4) {
		@Pc(6) Class572 local6 = this.method31447(arg0, arg1, arg2, (byte) 37);
		if (local6 == null) {
			return;
		}
		local6.aClass132_Sub1_Sub3_1 = arg3;
		local6.aClass132_Sub1_Sub3_2 = arg4;
		@Pc(24) int local24 = this.aClass99Array3 == this.aClass99Array1 ? 1 : 0;
		if (!arg3.method24285((byte) 6)) {
			arg3.aClass132_Sub1_23 = this.aClass132_Sub1Array5[local24];
			this.aClass132_Sub1Array5[local24] = arg3;
		} else if (arg3.method24286((short) -27012)) {
			arg3.aClass132_Sub1_23 = this.aClass132_Sub1Array2[local24];
			this.aClass132_Sub1Array2[local24] = arg3;
		} else {
			arg3.aClass132_Sub1_23 = this.aClass132_Sub1Array1[local24];
			this.aClass132_Sub1Array1[local24] = arg3;
		}
		if (arg4 == null) {
			return;
		}
		if (!arg4.method24285((byte) 6)) {
			arg4.aClass132_Sub1_23 = this.aClass132_Sub1Array5[local24];
			this.aClass132_Sub1Array5[local24] = arg4;
		} else if (arg4.method24286((short) -241)) {
			arg4.aClass132_Sub1_23 = this.aClass132_Sub1Array2[local24];
			this.aClass132_Sub1Array2[local24] = arg4;
		} else {
			arg4.aClass132_Sub1_23 = this.aClass132_Sub1Array1[local24];
			this.aClass132_Sub1Array1[local24] = arg4;
		}
	}

	@OriginalMember(owner = "client!tx", name = "h", descriptor = "(Lclient!ash;ZI)Z", line = 364)
	public boolean method31495(@OriginalArg(0) Class132_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(8) boolean local8 = this.aClass99Array3 == this.aClass99Array1;
		@Pc(10) int local10 = 0;
		@Pc(12) short local12 = 0;
		@Pc(14) byte local14 = 0;
		arg0.method24322(-105815840);
		@Pc(19) short local19 = 0;
		@Pc(31) int local31 = Math.min(this.anInt5443 * -200159665 - 1, Math.max(0, arg0.aShort129));
		@Pc(43) int local43 = Math.min(this.anInt5443 * -200159665 - 1, Math.max(0, arg0.aShort130));
		@Pc(55) int local55 = Math.min(this.anInt5444 * -1943751559 - 1, Math.max(0, arg0.aShort128));
		@Pc(67) int local67 = Math.min(this.anInt5444 * -1943751559 - 1, Math.max(0, arg0.aShort127));
		@Pc(69) int local69;
		@Pc(74) int local74;
		for (local69 = local31; local69 <= local43; local69++) {
			for (local74 = local55; local74 <= local67; local74++) {
				@Pc(85) Class572 local85 = this.method31449(arg0.aByte100, local69, local74, (byte) -17);
				if (local85 != null) {
					@Pc(91) Class590 local91 = Class355.method27697(arg0, 2081552050);
					@Pc(94) Class590 local94 = local85.aClass590_1;
					if (local94 == null) {
						local85.aClass590_1 = local91;
					} else {
						while (local94.aClass590_2 != null) {
							local94 = local94.aClass590_2;
						}
						local94.aClass590_2 = local91;
					}
					if (local8 && (this.anIntArrayArray62[local69][local74] & 0xFF000000) != 0) {
						local10 = this.anIntArrayArray62[local69][local74];
						local12 = this.aShortArrayArray5[local69][local74];
						local14 = this.aByteArrayArray24[local69][local74];
					}
					if (!arg1 && local85.aClass132_Sub1_Sub4_1 != null && local85.aClass132_Sub1_Sub4_1.aShort97 > local19) {
						local19 = local85.aClass132_Sub1_Sub4_1.aShort97;
					}
				}
			}
		}
		if (local8 && (local10 & 0xFF000000) != 0) {
			for (local69 = local31; local69 <= local43; local69++) {
				for (local74 = local55; local74 <= local67; local74++) {
					if ((this.anIntArrayArray62[local69][local74] & 0xFF000000) == 0) {
						this.anIntArrayArray62[local69][local74] = local10;
						this.aShortArrayArray5[local69][local74] = local12;
						this.aByteArrayArray24[local69][local74] = local14;
					}
				}
			}
		}
		if (arg1) {
			this.aClass132_Sub1_Sub1Array1[(this.anInt5465 += -1353434845) * -1409302901 - 1] = arg0;
			arg0.aClass585_23 = this;
		} else {
			local69 = this.aClass99Array1 == this.aClass99Array3 ? 1 : 0;
			if (!arg0.method24285((byte) 6)) {
				arg0.aClass132_Sub1_23 = this.aClass132_Sub1Array5[local69];
				this.aClass132_Sub1Array5[local69] = arg0;
			} else if (arg0.method24286((short) -23073)) {
				arg0.aClass132_Sub1_23 = this.aClass132_Sub1Array2[local69];
				this.aClass132_Sub1Array2[local69] = arg0;
			} else {
				arg0.aClass132_Sub1_23 = this.aClass132_Sub1Array1[local69];
				this.aClass132_Sub1Array1[local69] = arg0;
			}
		}
		if (arg1) {
			@Pc(294) Class472 local294 = Class472.method29537(arg0.method24220().aClass472_61);
			local294.aFloat318 -= local19;
			arg0.method24239(local294);
			local294.method29544();
		}
		return true;
	}

	@OriginalMember(owner = "client!tx", name = "cd", descriptor = "(Lclient!ash;Z)Z", line = 364)
	public boolean method31496(@OriginalArg(0) Class132_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(8) boolean local8 = this.aClass99Array3 == this.aClass99Array1;
		@Pc(10) int local10 = 0;
		@Pc(12) short local12 = 0;
		@Pc(14) byte local14 = 0;
		arg0.method24322(-506578951);
		@Pc(19) short local19 = 0;
		@Pc(31) int local31 = Math.min(this.anInt5443 * -200159665 - 1, Math.max(0, arg0.aShort129));
		@Pc(43) int local43 = Math.min(this.anInt5443 * -200159665 - 1, Math.max(0, arg0.aShort130));
		@Pc(55) int local55 = Math.min(this.anInt5444 * -1943751559 - 1, Math.max(0, arg0.aShort128));
		@Pc(67) int local67 = Math.min(this.anInt5444 * -1943751559 - 1, Math.max(0, arg0.aShort127));
		@Pc(69) int local69;
		@Pc(74) int local74;
		for (local69 = local31; local69 <= local43; local69++) {
			for (local74 = local55; local74 <= local67; local74++) {
				@Pc(85) Class572 local85 = this.method31449(arg0.aByte100, local69, local74, (byte) -62);
				if (local85 != null) {
					@Pc(91) Class590 local91 = Class355.method27697(arg0, 2081552050);
					@Pc(94) Class590 local94 = local85.aClass590_1;
					if (local94 == null) {
						local85.aClass590_1 = local91;
					} else {
						while (local94.aClass590_2 != null) {
							local94 = local94.aClass590_2;
						}
						local94.aClass590_2 = local91;
					}
					if (local8 && (this.anIntArrayArray62[local69][local74] & 0xFF000000) != 0) {
						local10 = this.anIntArrayArray62[local69][local74];
						local12 = this.aShortArrayArray5[local69][local74];
						local14 = this.aByteArrayArray24[local69][local74];
					}
					if (!arg1 && local85.aClass132_Sub1_Sub4_1 != null && local85.aClass132_Sub1_Sub4_1.aShort97 > local19) {
						local19 = local85.aClass132_Sub1_Sub4_1.aShort97;
					}
				}
			}
		}
		if (local8 && (local10 & 0xFF000000) != 0) {
			for (local69 = local31; local69 <= local43; local69++) {
				for (local74 = local55; local74 <= local67; local74++) {
					if ((this.anIntArrayArray62[local69][local74] & 0xFF000000) == 0) {
						this.anIntArrayArray62[local69][local74] = local10;
						this.aShortArrayArray5[local69][local74] = local12;
						this.aByteArrayArray24[local69][local74] = local14;
					}
				}
			}
		}
		if (arg1) {
			this.aClass132_Sub1_Sub1Array1[(this.anInt5465 += -1353434845) * -1409302901 - 1] = arg0;
			arg0.aClass585_23 = this;
		} else {
			local69 = this.aClass99Array1 == this.aClass99Array3 ? 1 : 0;
			if (!arg0.method24285((byte) 6)) {
				arg0.aClass132_Sub1_23 = this.aClass132_Sub1Array5[local69];
				this.aClass132_Sub1Array5[local69] = arg0;
			} else if (arg0.method24286((short) -11188)) {
				arg0.aClass132_Sub1_23 = this.aClass132_Sub1Array2[local69];
				this.aClass132_Sub1Array2[local69] = arg0;
			} else {
				arg0.aClass132_Sub1_23 = this.aClass132_Sub1Array1[local69];
				this.aClass132_Sub1Array1[local69] = arg0;
			}
		}
		if (arg1) {
			@Pc(294) Class472 local294 = Class472.method29537(arg0.method24220().aClass472_61);
			local294.aFloat318 -= local19;
			arg0.method24239(local294);
			local294.method29544();
		}
		return true;
	}

	@OriginalMember(owner = "client!tx", name = "a", descriptor = "(IIIII)V", line = 438)
	public void method31497(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		if (local8 == null) {
			return;
		}
		@Pc(14) Class132_Sub1_Sub3 local14 = local8.aClass132_Sub1_Sub3_1;
		@Pc(17) Class132_Sub1_Sub3 local17 = local8.aClass132_Sub1_Sub3_2;
		if (local14 != null) {
			local14.aShort86 = (short) (arg3 * local14.aShort86 / (0x10 << this.anInt5438 * -358186793 - 7));
			local14.aShort85 = (short) (arg3 * local14.aShort85 / (0x10 << this.anInt5438 * -358186793 - 7));
		}
		if (local17 != null) {
			local17.aShort86 = (short) (local17.aShort86 * arg3 / (0x10 << this.anInt5438 * -358186793 - 7));
			local17.aShort85 = (short) (arg3 * local17.aShort85 / (0x10 << this.anInt5438 * -358186793 - 7));
		}
	}

	@OriginalMember(owner = "client!tx", name = "g", descriptor = "(I)V", line = 453)
	public void method31498(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5465 * -1409302901; local1++) {
			@Pc(12) Class132_Sub1_Sub1 local12 = this.aClass132_Sub1_Sub1Array1[local1];
			this.method31528(local12, true, 964029282);
			this.aClass132_Sub1_Sub1Array1[local1] = null;
		}
		this.anInt5465 = 0;
	}

	@OriginalMember(owner = "client!tx", name = "dd", descriptor = "()V", line = 453)
	public void method31499() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5465 * -1409302901; local1++) {
			@Pc(12) Class132_Sub1_Sub1 local12 = this.aClass132_Sub1_Sub1Array1[local1];
			this.method31528(local12, true, 964029282);
			this.aClass132_Sub1_Sub1Array1[local1] = null;
		}
		this.anInt5465 = 0;
	}

	@OriginalMember(owner = "client!tx", name = "i", descriptor = "(IIIB)Lclient!asw;", line = 462)
	public Class132_Sub1_Sub2 method31500(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		if (local8 != null) {
			this.method31530(local8.aClass132_Sub1_Sub2_1, (byte) 47);
			if (local8.aClass132_Sub1_Sub2_1 != null) {
				@Pc(22) Class132_Sub1_Sub2 local22 = local8.aClass132_Sub1_Sub2_1;
				local8.aClass132_Sub1_Sub2_1 = null;
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!tx", name = "dr", descriptor = "(III)Lclient!asw;", line = 462)
	public Class132_Sub1_Sub2 method31501(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		if (local8 != null) {
			this.method31530(local8.aClass132_Sub1_Sub2_1, (byte) 117);
			if (local8.aClass132_Sub1_Sub2_1 != null) {
				@Pc(22) Class132_Sub1_Sub2 local22 = local8.aClass132_Sub1_Sub2_1;
				local8.aClass132_Sub1_Sub2_1 = null;
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!tx", name = "da", descriptor = "(III)Lclient!asw;", line = 462)
	public Class132_Sub1_Sub2 method31502(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		if (local8 != null) {
			this.method31530(local8.aClass132_Sub1_Sub2_1, (byte) 21);
			if (local8.aClass132_Sub1_Sub2_1 != null) {
				@Pc(22) Class132_Sub1_Sub2 local22 = local8.aClass132_Sub1_Sub2_1;
				local8.aClass132_Sub1_Sub2_1 = null;
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!tx", name = "dt", descriptor = "(III)Lclient!asw;", line = 462)
	public Class132_Sub1_Sub2 method31503(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		if (local8 != null) {
			this.method31530(local8.aClass132_Sub1_Sub2_1, (byte) 90);
			if (local8.aClass132_Sub1_Sub2_1 != null) {
				@Pc(22) Class132_Sub1_Sub2 local22 = local8.aClass132_Sub1_Sub2_1;
				local8.aClass132_Sub1_Sub2_1 = null;
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!tx", name = "do", descriptor = "(III)Lclient!asw;", line = 462)
	public Class132_Sub1_Sub2 method31504(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		if (local8 != null) {
			this.method31530(local8.aClass132_Sub1_Sub2_1, (byte) 11);
			if (local8.aClass132_Sub1_Sub2_1 != null) {
				@Pc(22) Class132_Sub1_Sub2 local22 = local8.aClass132_Sub1_Sub2_1;
				local8.aClass132_Sub1_Sub2_1 = null;
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!tx", name = "dz", descriptor = "(III)Lclient!asw;", line = 462)
	public Class132_Sub1_Sub2 method31505(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		if (local8 != null) {
			this.method31530(local8.aClass132_Sub1_Sub2_1, (byte) 115);
			if (local8.aClass132_Sub1_Sub2_1 != null) {
				@Pc(22) Class132_Sub1_Sub2 local22 = local8.aClass132_Sub1_Sub2_1;
				local8.aClass132_Sub1_Sub2_1 = null;
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!tx", name = "dm", descriptor = "(III)Lclient!asw;", line = 475)
	public Class132_Sub1_Sub2 method31506(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		if (local8 != null) {
			this.method31530(local8.aClass132_Sub1_Sub2_2, (byte) 94);
			if (local8.aClass132_Sub1_Sub2_2 != null) {
				@Pc(22) Class132_Sub1_Sub2 local22 = local8.aClass132_Sub1_Sub2_2;
				local8.aClass132_Sub1_Sub2_2 = null;
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!tx", name = "dv", descriptor = "(III)Lclient!asw;", line = 475)
	public Class132_Sub1_Sub2 method31507(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		if (local8 != null) {
			this.method31530(local8.aClass132_Sub1_Sub2_2, (byte) 21);
			if (local8.aClass132_Sub1_Sub2_2 != null) {
				@Pc(22) Class132_Sub1_Sub2 local22 = local8.aClass132_Sub1_Sub2_2;
				local8.aClass132_Sub1_Sub2_2 = null;
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!tx", name = "dc", descriptor = "(III)Lclient!asw;", line = 475)
	public Class132_Sub1_Sub2 method31508(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		if (local8 != null) {
			this.method31530(local8.aClass132_Sub1_Sub2_2, (byte) 43);
			if (local8.aClass132_Sub1_Sub2_2 != null) {
				@Pc(22) Class132_Sub1_Sub2 local22 = local8.aClass132_Sub1_Sub2_2;
				local8.aClass132_Sub1_Sub2_2 = null;
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!tx", name = "dq", descriptor = "(III)Lclient!asw;", line = 475)
	public Class132_Sub1_Sub2 method31509(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		if (local8 != null) {
			this.method31530(local8.aClass132_Sub1_Sub2_2, (byte) 56);
			if (local8.aClass132_Sub1_Sub2_2 != null) {
				@Pc(22) Class132_Sub1_Sub2 local22 = local8.aClass132_Sub1_Sub2_2;
				local8.aClass132_Sub1_Sub2_2 = null;
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!tx", name = "j", descriptor = "(IIIB)Lclient!asw;", line = 475)
	public Class132_Sub1_Sub2 method31510(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		if (local8 != null) {
			this.method31530(local8.aClass132_Sub1_Sub2_2, (byte) 107);
			if (local8.aClass132_Sub1_Sub2_2 != null) {
				@Pc(22) Class132_Sub1_Sub2 local22 = local8.aClass132_Sub1_Sub2_2;
				local8.aClass132_Sub1_Sub2_2 = null;
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!tx", name = "t", descriptor = "(IIII)Lclient!asm;", line = 488)
	public Class132_Sub1_Sub3 method31511(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		if (local8 != null) {
			this.method31530(local8.aClass132_Sub1_Sub3_1, (byte) 113);
			if (local8.aClass132_Sub1_Sub3_1 != null) {
				@Pc(22) Class132_Sub1_Sub3 local22 = local8.aClass132_Sub1_Sub3_1;
				local8.aClass132_Sub1_Sub3_1 = null;
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!tx", name = "di", descriptor = "(III)Lclient!asm;", line = 488)
	public Class132_Sub1_Sub3 method31512(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		if (local8 != null) {
			this.method31530(local8.aClass132_Sub1_Sub3_1, (byte) 49);
			if (local8.aClass132_Sub1_Sub3_1 != null) {
				@Pc(22) Class132_Sub1_Sub3 local22 = local8.aClass132_Sub1_Sub3_1;
				local8.aClass132_Sub1_Sub3_1 = null;
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!tx", name = "dk", descriptor = "(III)Lclient!asm;", line = 488)
	public Class132_Sub1_Sub3 method31513(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		if (local8 != null) {
			this.method31530(local8.aClass132_Sub1_Sub3_1, (byte) 118);
			if (local8.aClass132_Sub1_Sub3_1 != null) {
				@Pc(22) Class132_Sub1_Sub3 local22 = local8.aClass132_Sub1_Sub3_1;
				local8.aClass132_Sub1_Sub3_1 = null;
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!tx", name = "ae", descriptor = "(IIII)Lclient!asm;", line = 501)
	public Class132_Sub1_Sub3 method31514(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		if (local8 != null) {
			this.method31530(local8.aClass132_Sub1_Sub3_2, (byte) 118);
			if (local8.aClass132_Sub1_Sub3_2 != null) {
				@Pc(22) Class132_Sub1_Sub3 local22 = local8.aClass132_Sub1_Sub3_2;
				local8.aClass132_Sub1_Sub3_2 = null;
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!tx", name = "dw", descriptor = "(III)Lclient!asm;", line = 501)
	public Class132_Sub1_Sub3 method31515(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		if (local8 != null) {
			this.method31530(local8.aClass132_Sub1_Sub3_2, (byte) 100);
			if (local8.aClass132_Sub1_Sub3_2 != null) {
				@Pc(22) Class132_Sub1_Sub3 local22 = local8.aClass132_Sub1_Sub3_2;
				local8.aClass132_Sub1_Sub3_2 = null;
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!tx", name = "df", descriptor = "(III)Lclient!asm;", line = 501)
	public Class132_Sub1_Sub3 method31516(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		if (local8 != null) {
			this.method31530(local8.aClass132_Sub1_Sub3_2, (byte) 84);
			if (local8.aClass132_Sub1_Sub3_2 != null) {
				@Pc(22) Class132_Sub1_Sub3 local22 = local8.aClass132_Sub1_Sub3_2;
				local8.aClass132_Sub1_Sub3_2 = null;
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!tx", name = "dn", descriptor = "(III)Lclient!asm;", line = 501)
	public Class132_Sub1_Sub3 method31517(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		if (local8 != null) {
			this.method31530(local8.aClass132_Sub1_Sub3_2, (byte) 116);
			if (local8.aClass132_Sub1_Sub3_2 != null) {
				@Pc(22) Class132_Sub1_Sub3 local22 = local8.aClass132_Sub1_Sub3_2;
				local8.aClass132_Sub1_Sub3_2 = null;
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!tx", name = "ag", descriptor = "(IIIB)Lclient!asv;", line = 514)
	public Class132_Sub1_Sub4 method31518(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		if (local8 == null) {
			return null;
		}
		this.method31530(local8.aClass132_Sub1_Sub4_1, (byte) 86);
		if (local8.aClass132_Sub1_Sub4_1 == null) {
			return null;
		} else {
			@Pc(24) Class132_Sub1_Sub4 local24 = local8.aClass132_Sub1_Sub4_1;
			local8.aClass132_Sub1_Sub4_1 = null;
			return local24;
		}
	}

	@OriginalMember(owner = "client!tx", name = "ds", descriptor = "(III)Lclient!asv;", line = 514)
	public Class132_Sub1_Sub4 method31519(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		if (local8 == null) {
			return null;
		}
		this.method31530(local8.aClass132_Sub1_Sub4_1, (byte) 53);
		if (local8.aClass132_Sub1_Sub4_1 == null) {
			return null;
		} else {
			@Pc(24) Class132_Sub1_Sub4 local24 = local8.aClass132_Sub1_Sub4_1;
			local8.aClass132_Sub1_Sub4_1 = null;
			return local24;
		}
	}

	@OriginalMember(owner = "client!tx", name = "dl", descriptor = "(III)Lclient!asv;", line = 514)
	public Class132_Sub1_Sub4 method31520(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		if (local8 == null) {
			return null;
		}
		this.method31530(local8.aClass132_Sub1_Sub4_1, (byte) 125);
		if (local8.aClass132_Sub1_Sub4_1 == null) {
			return null;
		} else {
			@Pc(24) Class132_Sub1_Sub4 local24 = local8.aClass132_Sub1_Sub4_1;
			local8.aClass132_Sub1_Sub4_1 = null;
			return local24;
		}
	}

	@OriginalMember(owner = "client!tx", name = "du", descriptor = "(III)Lclient!asv;", line = 514)
	public Class132_Sub1_Sub4 method31521(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		if (local8 == null) {
			return null;
		}
		this.method31530(local8.aClass132_Sub1_Sub4_1, (byte) 123);
		if (local8.aClass132_Sub1_Sub4_1 == null) {
			return null;
		} else {
			@Pc(24) Class132_Sub1_Sub4 local24 = local8.aClass132_Sub1_Sub4_1;
			local8.aClass132_Sub1_Sub4_1 = null;
			return local24;
		}
	}

	@OriginalMember(owner = "client!tx", name = "ah", descriptor = "(IIIB)Lclient!ast;", line = 526)
	public Class132_Sub1_Sub5 method31522(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		if (local8 == null) {
			return null;
		} else {
			@Pc(16) Class132_Sub1_Sub5 local16 = local8.aClass132_Sub1_Sub5_1;
			local8.aClass132_Sub1_Sub5_1 = null;
			this.method31530(local16, (byte) 69);
			return local16;
		}
	}

	@OriginalMember(owner = "client!tx", name = "dp", descriptor = "(III)Lclient!ast;", line = 526)
	public Class132_Sub1_Sub5 method31523(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		if (local8 == null) {
			return null;
		} else {
			@Pc(16) Class132_Sub1_Sub5 local16 = local8.aClass132_Sub1_Sub5_1;
			local8.aClass132_Sub1_Sub5_1 = null;
			this.method31530(local16, (byte) 70);
			return local16;
		}
	}

	@OriginalMember(owner = "client!tx", name = "dy", descriptor = "(III)Lclient!ast;", line = 526)
	public Class132_Sub1_Sub5 method31524(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		if (local8 == null) {
			return null;
		} else {
			@Pc(16) Class132_Sub1_Sub5 local16 = local8.aClass132_Sub1_Sub5_1;
			local8.aClass132_Sub1_Sub5_1 = null;
			this.method31530(local16, (byte) 72);
			return local16;
		}
	}

	@OriginalMember(owner = "client!tx", name = "al", descriptor = "(IIILclient!td;I)Lclient!ash;", line = 535)
	public Class132_Sub1_Sub1 method31525(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Interface62 arg3, @OriginalArg(4) int arg4) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		if (local8 == null) {
			return null;
		}
		for (@Pc(16) Class590 local16 = local8.aClass590_1; local16 != null; local16 = local16.aClass590_2) {
			@Pc(22) Class132_Sub1_Sub1 local22 = local16.aClass132_Sub1_Sub1_1;
			if ((arg3 == null || arg3.method31367(local22, 921666270)) && local22.aShort129 == arg1 && arg2 == local22.aShort128) {
				this.method31528(local22, false, 964029282);
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!tx", name = "db", descriptor = "(IIILclient!td;)Lclient!ash;", line = 535)
	public Class132_Sub1_Sub1 method31526(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Interface62 arg3) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		if (local8 == null) {
			return null;
		}
		for (@Pc(16) Class590 local16 = local8.aClass590_1; local16 != null; local16 = local16.aClass590_2) {
			@Pc(22) Class132_Sub1_Sub1 local22 = local16.aClass132_Sub1_Sub1_1;
			if ((arg3 == null || arg3.method31367(local22, 964368435)) && local22.aShort129 == arg1 && arg2 == local22.aShort128) {
				this.method31528(local22, false, 964029282);
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!tx", name = "dh", descriptor = "(IIILclient!td;)Lclient!ash;", line = 535)
	public Class132_Sub1_Sub1 method31527(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Interface62 arg3) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		if (local8 == null) {
			return null;
		}
		for (@Pc(16) Class590 local16 = local8.aClass590_1; local16 != null; local16 = local16.aClass590_2) {
			@Pc(22) Class132_Sub1_Sub1 local22 = local16.aClass132_Sub1_Sub1_1;
			if ((arg3 == null || arg3.method31367(local22, 1623773575)) && local22.aShort129 == arg1 && arg2 == local22.aShort128) {
				this.method31528(local22, false, 964029282);
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!tx", name = "ac", descriptor = "(Lclient!ash;ZI)V", line = 550)
	void method31528(@OriginalArg(0) Class132_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(11) int local11 = Math.min(this.anInt5443 * -200159665 - 1, Math.max(0, arg0.aShort129));
		@Pc(23) int local23 = Math.min(this.anInt5443 * -200159665 - 1, Math.max(0, arg0.aShort130));
		@Pc(35) int local35 = Math.min(this.anInt5444 * -1943751559 - 1, Math.max(0, arg0.aShort128));
		@Pc(47) int local47 = Math.min(this.anInt5444 * -1943751559 - 1, Math.max(0, arg0.aShort127));
		for (@Pc(49) int local49 = local11; local49 <= local23; local49++) {
			for (@Pc(54) int local54 = local35; local54 <= local47; local54++) {
				@Pc(67) Class572 local67 = this.aClass572ArrayArrayArray3[arg0.aByte100][local49][local54];
				if (local67 != null) {
					@Pc(72) Class590 local72 = local67.aClass590_1;
					@Pc(74) Class590 local74 = null;
					while (local72 != null) {
						if (arg0 == local72.aClass132_Sub1_Sub1_1) {
							if (local74 == null) {
								local67.aClass590_1 = local72.aClass590_2;
							} else {
								local74.aClass590_2 = local72.aClass590_2;
							}
							local72.method31689((byte) -80);
							break;
						}
						local74 = local72;
						local72 = local72.aClass590_2;
					}
				}
			}
		}
		if (!arg1) {
			this.method31530(arg0, (byte) 43);
		}
	}

	@OriginalMember(owner = "client!tx", name = "dx", descriptor = "(Lclient!ash;Z)V", line = 550)
	void method31529(@OriginalArg(0) Class132_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(11) int local11 = Math.min(this.anInt5443 * -200159665 - 1, Math.max(0, arg0.aShort129));
		@Pc(23) int local23 = Math.min(this.anInt5443 * -200159665 - 1, Math.max(0, arg0.aShort130));
		@Pc(35) int local35 = Math.min(this.anInt5444 * -1943751559 - 1, Math.max(0, arg0.aShort128));
		@Pc(47) int local47 = Math.min(this.anInt5444 * -1943751559 - 1, Math.max(0, arg0.aShort127));
		for (@Pc(49) int local49 = local11; local49 <= local23; local49++) {
			for (@Pc(54) int local54 = local35; local54 <= local47; local54++) {
				@Pc(67) Class572 local67 = this.aClass572ArrayArrayArray3[arg0.aByte100][local49][local54];
				if (local67 != null) {
					@Pc(72) Class590 local72 = local67.aClass590_1;
					@Pc(74) Class590 local74 = null;
					while (local72 != null) {
						if (arg0 == local72.aClass132_Sub1_Sub1_1) {
							if (local74 == null) {
								local67.aClass590_1 = local72.aClass590_2;
							} else {
								local74.aClass590_2 = local72.aClass590_2;
							}
							local72.method31689((byte) -73);
							break;
						}
						local74 = local72;
						local72 = local72.aClass590_2;
					}
				}
			}
		}
		if (!arg1) {
			this.method31530(arg0, (byte) 67);
		}
	}

	@OriginalMember(owner = "client!tx", name = "ai", descriptor = "(Lclient!alh;B)V", line = 573)
	void method31530(@OriginalArg(0) Class132_Sub1 arg0, @OriginalArg(1) byte arg1) {
		if (arg0 == null) {
			return;
		}
		arg0.method24254();
		for (@Pc(6) int local6 = 0; local6 < 2; local6++) {
			@Pc(11) Class132_Sub1 local11 = null;
			@Pc(16) Class132_Sub1 local16;
			for (local16 = this.aClass132_Sub1Array1[local6]; local16 != null; local16 = local16.aClass132_Sub1_23) {
				if (arg0 == local16) {
					if (local11 == null) {
						this.aClass132_Sub1Array1[local6] = local16.aClass132_Sub1_23;
					} else {
						local11.aClass132_Sub1_23 = local16.aClass132_Sub1_23;
					}
					return;
				}
				local11 = local16;
			}
			local11 = null;
			for (local16 = this.aClass132_Sub1Array2[local6]; local16 != null; local16 = local16.aClass132_Sub1_23) {
				if (arg0 == local16) {
					if (local11 == null) {
						this.aClass132_Sub1Array2[local6] = local16.aClass132_Sub1_23;
					} else {
						local11.aClass132_Sub1_23 = local16.aClass132_Sub1_23;
					}
					return;
				}
				local11 = local16;
			}
			local11 = null;
			for (local16 = this.aClass132_Sub1Array5[local6]; local16 != null; local16 = local16.aClass132_Sub1_23) {
				if (local16 == arg0) {
					if (local11 == null) {
						this.aClass132_Sub1Array5[local6] = local16.aClass132_Sub1_23;
					} else {
						local11.aClass132_Sub1_23 = local16.aClass132_Sub1_23;
					}
					return;
				}
				local11 = local16;
			}
		}
	}

	@OriginalMember(owner = "client!tx", name = "dg", descriptor = "(Lclient!alh;)V", line = 573)
	void method31531(@OriginalArg(0) Class132_Sub1 arg0) {
		if (arg0 == null) {
			return;
		}
		arg0.method24254();
		for (@Pc(6) int local6 = 0; local6 < 2; local6++) {
			@Pc(11) Class132_Sub1 local11 = null;
			@Pc(16) Class132_Sub1 local16;
			for (local16 = this.aClass132_Sub1Array1[local6]; local16 != null; local16 = local16.aClass132_Sub1_23) {
				if (arg0 == local16) {
					if (local11 == null) {
						this.aClass132_Sub1Array1[local6] = local16.aClass132_Sub1_23;
					} else {
						local11.aClass132_Sub1_23 = local16.aClass132_Sub1_23;
					}
					return;
				}
				local11 = local16;
			}
			local11 = null;
			for (local16 = this.aClass132_Sub1Array2[local6]; local16 != null; local16 = local16.aClass132_Sub1_23) {
				if (arg0 == local16) {
					if (local11 == null) {
						this.aClass132_Sub1Array2[local6] = local16.aClass132_Sub1_23;
					} else {
						local11.aClass132_Sub1_23 = local16.aClass132_Sub1_23;
					}
					return;
				}
				local11 = local16;
			}
			local11 = null;
			for (local16 = this.aClass132_Sub1Array5[local6]; local16 != null; local16 = local16.aClass132_Sub1_23) {
				if (local16 == arg0) {
					if (local11 == null) {
						this.aClass132_Sub1Array5[local6] = local16.aClass132_Sub1_23;
					} else {
						local11.aClass132_Sub1_23 = local16.aClass132_Sub1_23;
					}
					return;
				}
				local11 = local16;
			}
		}
	}

	@OriginalMember(owner = "client!tx", name = "de", descriptor = "(Lclient!alh;)V", line = 573)
	void method31532(@OriginalArg(0) Class132_Sub1 arg0) {
		if (arg0 == null) {
			return;
		}
		arg0.method24254();
		for (@Pc(6) int local6 = 0; local6 < 2; local6++) {
			@Pc(11) Class132_Sub1 local11 = null;
			@Pc(16) Class132_Sub1 local16;
			for (local16 = this.aClass132_Sub1Array1[local6]; local16 != null; local16 = local16.aClass132_Sub1_23) {
				if (arg0 == local16) {
					if (local11 == null) {
						this.aClass132_Sub1Array1[local6] = local16.aClass132_Sub1_23;
					} else {
						local11.aClass132_Sub1_23 = local16.aClass132_Sub1_23;
					}
					return;
				}
				local11 = local16;
			}
			local11 = null;
			for (local16 = this.aClass132_Sub1Array2[local6]; local16 != null; local16 = local16.aClass132_Sub1_23) {
				if (arg0 == local16) {
					if (local11 == null) {
						this.aClass132_Sub1Array2[local6] = local16.aClass132_Sub1_23;
					} else {
						local11.aClass132_Sub1_23 = local16.aClass132_Sub1_23;
					}
					return;
				}
				local11 = local16;
			}
			local11 = null;
			for (local16 = this.aClass132_Sub1Array5[local6]; local16 != null; local16 = local16.aClass132_Sub1_23) {
				if (local16 == arg0) {
					if (local11 == null) {
						this.aClass132_Sub1Array5[local6] = local16.aClass132_Sub1_23;
					} else {
						local11.aClass132_Sub1_23 = local16.aClass132_Sub1_23;
					}
					return;
				}
				local11 = local16;
			}
		}
	}

	@OriginalMember(owner = "client!tx", name = "dj", descriptor = "(Lclient!alh;)V", line = 573)
	void method31533(@OriginalArg(0) Class132_Sub1 arg0) {
		if (arg0 == null) {
			return;
		}
		arg0.method24254();
		for (@Pc(6) int local6 = 0; local6 < 2; local6++) {
			@Pc(11) Class132_Sub1 local11 = null;
			@Pc(16) Class132_Sub1 local16;
			for (local16 = this.aClass132_Sub1Array1[local6]; local16 != null; local16 = local16.aClass132_Sub1_23) {
				if (arg0 == local16) {
					if (local11 == null) {
						this.aClass132_Sub1Array1[local6] = local16.aClass132_Sub1_23;
					} else {
						local11.aClass132_Sub1_23 = local16.aClass132_Sub1_23;
					}
					return;
				}
				local11 = local16;
			}
			local11 = null;
			for (local16 = this.aClass132_Sub1Array2[local6]; local16 != null; local16 = local16.aClass132_Sub1_23) {
				if (arg0 == local16) {
					if (local11 == null) {
						this.aClass132_Sub1Array2[local6] = local16.aClass132_Sub1_23;
					} else {
						local11.aClass132_Sub1_23 = local16.aClass132_Sub1_23;
					}
					return;
				}
				local11 = local16;
			}
			local11 = null;
			for (local16 = this.aClass132_Sub1Array5[local6]; local16 != null; local16 = local16.aClass132_Sub1_23) {
				if (local16 == arg0) {
					if (local11 == null) {
						this.aClass132_Sub1Array5[local6] = local16.aClass132_Sub1_23;
					} else {
						local11.aClass132_Sub1_23 = local16.aClass132_Sub1_23;
					}
					return;
				}
				local11 = local16;
			}
		}
	}

	@OriginalMember(owner = "client!tx", name = "aw", descriptor = "(IIII)Lclient!asw;", line = 607)
	public Class132_Sub1_Sub2 method31534(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass132_Sub1_Sub2_1;
	}

	@OriginalMember(owner = "client!tx", name = "ed", descriptor = "(III)Lclient!asw;", line = 607)
	public Class132_Sub1_Sub2 method31535(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass132_Sub1_Sub2_1;
	}

	@OriginalMember(owner = "client!tx", name = "eo", descriptor = "(III)Lclient!asw;", line = 607)
	public Class132_Sub1_Sub2 method31536(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass132_Sub1_Sub2_1;
	}

	@OriginalMember(owner = "client!tx", name = "ey", descriptor = "(III)Lclient!asw;", line = 607)
	public Class132_Sub1_Sub2 method31537(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass132_Sub1_Sub2_1;
	}

	@OriginalMember(owner = "client!tx", name = "eu", descriptor = "(III)Lclient!asw;", line = 607)
	public Class132_Sub1_Sub2 method31538(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass132_Sub1_Sub2_1;
	}

	@OriginalMember(owner = "client!tx", name = "es", descriptor = "(III)Lclient!asw;", line = 613)
	public Class132_Sub1_Sub2 method31539(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass132_Sub1_Sub2_2;
	}

	@OriginalMember(owner = "client!tx", name = "ee", descriptor = "(III)Lclient!asw;", line = 613)
	public Class132_Sub1_Sub2 method31540(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass132_Sub1_Sub2_2;
	}

	@OriginalMember(owner = "client!tx", name = "ei", descriptor = "(III)Lclient!asw;", line = 613)
	public Class132_Sub1_Sub2 method31541(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass132_Sub1_Sub2_2;
	}

	@OriginalMember(owner = "client!tx", name = "el", descriptor = "(III)Lclient!asw;", line = 613)
	public Class132_Sub1_Sub2 method31542(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass132_Sub1_Sub2_2;
	}

	@OriginalMember(owner = "client!tx", name = "as", descriptor = "(IIII)Lclient!asw;", line = 613)
	public Class132_Sub1_Sub2 method31543(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass132_Sub1_Sub2_2;
	}

	@OriginalMember(owner = "client!tx", name = "at", descriptor = "(IIII)Lclient!asm;", line = 619)
	public Class132_Sub1_Sub3 method31544(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass132_Sub1_Sub3_1;
	}

	@OriginalMember(owner = "client!tx", name = "ej", descriptor = "(III)Lclient!asm;", line = 619)
	public Class132_Sub1_Sub3 method31545(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass132_Sub1_Sub3_1;
	}

	@OriginalMember(owner = "client!tx", name = "ad", descriptor = "(IIIB)Lclient!ast;", line = 625)
	public Class132_Sub1_Sub5 method31546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass132_Sub1_Sub5_1;
	}

	@OriginalMember(owner = "client!tx", name = "ep", descriptor = "(III)Lclient!ast;", line = 625)
	public Class132_Sub1_Sub5 method31547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass132_Sub1_Sub5_1;
	}

	@OriginalMember(owner = "client!tx", name = "ev", descriptor = "(III)Lclient!ast;", line = 625)
	public Class132_Sub1_Sub5 method31548(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass132_Sub1_Sub5_1;
	}

	@OriginalMember(owner = "client!tx", name = "ec", descriptor = "(IIILclient!td;)Lclient!ash;", line = 631)
	public Class132_Sub1_Sub1 method31549(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Interface62 arg3) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		if (local8 == null) {
			return null;
		}
		for (@Pc(16) Class590 local16 = local8.aClass590_1; local16 != null; local16 = local16.aClass590_2) {
			@Pc(21) Class132_Sub1_Sub1 local21 = local16.aClass132_Sub1_Sub1_1;
			if ((arg3 == null || arg3.method31367(local21, 619712680)) && arg1 == local21.aShort129 && local21.aShort128 == arg2) {
				return local21;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!tx", name = "ek", descriptor = "(IIILclient!td;)Lclient!ash;", line = 631)
	public Class132_Sub1_Sub1 method31550(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Interface62 arg3) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		if (local8 == null) {
			return null;
		}
		for (@Pc(16) Class590 local16 = local8.aClass590_1; local16 != null; local16 = local16.aClass590_2) {
			@Pc(21) Class132_Sub1_Sub1 local21 = local16.aClass132_Sub1_Sub1_1;
			if ((arg3 == null || arg3.method31367(local21, 568807889)) && arg1 == local21.aShort129 && local21.aShort128 == arg2) {
				return local21;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!tx", name = "am", descriptor = "(IIILclient!td;B)Lclient!ash;", line = 631)
	public Class132_Sub1_Sub1 method31551(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Interface62 arg3, @OriginalArg(4) byte arg4) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		if (local8 == null) {
			return null;
		}
		for (@Pc(16) Class590 local16 = local8.aClass590_1; local16 != null; local16 = local16.aClass590_2) {
			@Pc(21) Class132_Sub1_Sub1 local21 = local16.aClass132_Sub1_Sub1_1;
			if ((arg3 == null || arg3.method31367(local21, 1494303109)) && arg1 == local21.aShort129 && local21.aShort128 == arg2) {
				return local21;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!tx", name = "eh", descriptor = "(III)Lclient!uc;", line = 643)
	public Class590 method31552(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass590_1;
	}

	@OriginalMember(owner = "client!tx", name = "au", descriptor = "(IIIB)Lclient!uc;", line = 643)
	public Class590 method31553(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass590_1;
	}

	@OriginalMember(owner = "client!tx", name = "em", descriptor = "(III)Lclient!uc;", line = 643)
	public Class590 method31554(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass590_1;
	}

	@OriginalMember(owner = "client!tx", name = "eq", descriptor = "(III)Lclient!uc;", line = 643)
	public Class590 method31555(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass590_1;
	}

	@OriginalMember(owner = "client!tx", name = "ar", descriptor = "(IIII)Lclient!asv;", line = 649)
	public Class132_Sub1_Sub4 method31556(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		return local8 == null || local8.aClass132_Sub1_Sub4_1 == null ? null : local8.aClass132_Sub1_Sub4_1;
	}

	@OriginalMember(owner = "client!tx", name = "eg", descriptor = "(III)Lclient!asv;", line = 649)
	public Class132_Sub1_Sub4 method31557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		return local8 == null || local8.aClass132_Sub1_Sub4_1 == null ? null : local8.aClass132_Sub1_Sub4_1;
	}

	@OriginalMember(owner = "client!tx", name = "ez", descriptor = "(III)Lclient!asv;", line = 649)
	public Class132_Sub1_Sub4 method31558(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		return local8 == null || local8.aClass132_Sub1_Sub4_1 == null ? null : local8.aClass132_Sub1_Sub4_1;
	}

	@OriginalMember(owner = "client!tx", name = "ef", descriptor = "(III)Lclient!asv;", line = 649)
	public Class132_Sub1_Sub4 method31559(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		return local8 == null || local8.aClass132_Sub1_Sub4_1 == null ? null : local8.aClass132_Sub1_Sub4_1;
	}

	@OriginalMember(owner = "client!tx", name = "et", descriptor = "(III)Lclient!asv;", line = 649)
	public Class132_Sub1_Sub4 method31560(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		return local8 == null || local8.aClass132_Sub1_Sub4_1 == null ? null : local8.aClass132_Sub1_Sub4_1;
	}

	@OriginalMember(owner = "client!tx", name = "ap", descriptor = "()V", line = 656)
	public void method31561() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5442 * -882426473; local1++) {
			for (@Pc(9) int local9 = 0; local9 < this.anInt5443 * -200159665; local9++) {
				for (@Pc(17) int local17 = 0; local17 < this.anInt5444 * -1943751559; local17++) {
					@Pc(32) Class572 local32 = this.aClass572ArrayArrayArray3[local1][local9][local17];
					if (local32 != null) {
						@Pc(37) Class132_Sub1_Sub2 local37 = local32.aClass132_Sub1_Sub2_1;
						@Pc(40) Class132_Sub1_Sub2 local40 = local32.aClass132_Sub1_Sub2_2;
						if (local37 != null && local37.method24284(733652426)) {
							this.method31567(local37, local1, local9, local17, 1, 1);
							if (local40 != null && local40.method24284(-68491823)) {
								this.method31567(local40, local1, local9, local17, 1, 1);
								local40.method24291(this.aClass104_11, local37, 0, 0, 0, false, (byte) -4);
								local40.method24288((byte) 124);
							}
							local37.method24288((byte) 126);
						}
						for (@Pc(89) Class590 local89 = local32.aClass590_1; local89 != null; local89 = local89.aClass590_2) {
							@Pc(94) Class132_Sub1_Sub1 local94 = local89.aClass132_Sub1_Sub1_1;
							if (local94 != null && local94.method24284(-1205648727)) {
								this.method31567(local94, local1, local9, local17, local94.aShort130 - local94.aShort129 + 1, local94.aShort127 - local94.aShort128 + 1);
								local94.method24288((byte) 126);
							}
						}
						@Pc(130) Class132_Sub1_Sub4 local130 = local32.aClass132_Sub1_Sub4_1;
						if (local130 != null && local130.method24284(-402742180)) {
							this.method31563(local130, local1, local9, local17, (short) -3480);
							local130.method24288((byte) 126);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tx", name = "ea", descriptor = "()V", line = 656)
	public void method31562() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5442 * -882426473; local1++) {
			for (@Pc(9) int local9 = 0; local9 < this.anInt5443 * -200159665; local9++) {
				for (@Pc(17) int local17 = 0; local17 < this.anInt5444 * -1943751559; local17++) {
					@Pc(32) Class572 local32 = this.aClass572ArrayArrayArray3[local1][local9][local17];
					if (local32 != null) {
						@Pc(37) Class132_Sub1_Sub2 local37 = local32.aClass132_Sub1_Sub2_1;
						@Pc(40) Class132_Sub1_Sub2 local40 = local32.aClass132_Sub1_Sub2_2;
						if (local37 != null && local37.method24284(1518134097)) {
							this.method31567(local37, local1, local9, local17, 1, 1);
							if (local40 != null && local40.method24284(-779559004)) {
								this.method31567(local40, local1, local9, local17, 1, 1);
								local40.method24291(this.aClass104_11, local37, 0, 0, 0, false, (byte) -45);
								local40.method24288((byte) 123);
							}
							local37.method24288((byte) 123);
						}
						for (@Pc(89) Class590 local89 = local32.aClass590_1; local89 != null; local89 = local89.aClass590_2) {
							@Pc(94) Class132_Sub1_Sub1 local94 = local89.aClass132_Sub1_Sub1_1;
							if (local94 != null && local94.method24284(-2041814595)) {
								this.method31567(local94, local1, local9, local17, local94.aShort130 - local94.aShort129 + 1, local94.aShort127 - local94.aShort128 + 1);
								local94.method24288((byte) 124);
							}
						}
						@Pc(130) Class132_Sub1_Sub4 local130 = local32.aClass132_Sub1_Sub4_1;
						if (local130 != null && local130.method24284(1732553085)) {
							this.method31563(local130, local1, local9, local17, (short) 4426);
							local130.method24288((byte) 127);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tx", name = "aq", descriptor = "(Lclient!alh;IIIS)V", line = 693)
	void method31563(@OriginalArg(0) Class132_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) short arg4) {
		@Pc(16) Class572 local16;
		@Pc(126) int local126;
		if (arg2 < this.anInt5443 * -200159665) {
			local16 = this.aClass572ArrayArrayArray3[arg1][arg2 + 1][arg3];
			if (local16 != null && local16.aClass132_Sub1_Sub4_1 != null && local16.aClass132_Sub1_Sub4_1.method24284(-673496481)) {
				local126 = (this.aClass99Array1[arg1].method2480(arg2 + 1, arg3, -433289712) + this.aClass99Array1[arg1].method2480(arg2 + 1 + 1, arg3, -1031523386) + this.aClass99Array1[arg1].method2480(arg2 + 1, arg3 + 1, -302804641) + this.aClass99Array1[arg1].method2480(1 + 1 + arg2, arg3 + 1, -174405952)) / 4 - (this.aClass99Array1[arg1].method2480(arg2, arg3, -1610623102) + this.aClass99Array1[arg1].method2480(arg2 + 1, arg3, -243948407) + this.aClass99Array1[arg1].method2480(arg2, arg3 + 1, -1603754183) + this.aClass99Array1[arg1].method2480(arg2 + 1, arg3 + 1, -993299112)) / 4;
				arg0.method24291(this.aClass104_11, local16.aClass132_Sub1_Sub4_1, this.anInt5439 * -77997759, local126, 0, true, (byte) -90);
			}
		}
		if (arg3 < this.anInt5443 * -200159665) {
			local16 = this.aClass572ArrayArrayArray3[arg1][arg2][arg3 + 1];
			if (local16 != null && local16.aClass132_Sub1_Sub4_1 != null && local16.aClass132_Sub1_Sub4_1.method24284(683356753)) {
				local126 = (this.aClass99Array1[arg1].method2480(arg2, arg3, -803300321) + this.aClass99Array1[arg1].method2480(arg2 + 1, arg3 + 1, -1459230266) + this.aClass99Array1[arg1].method2480(arg2, arg3 + 1 + 1, -1677159206) + this.aClass99Array1[arg1].method2480(arg2 + 1, 1 + 1 + arg3, -788616936)) / 4 - (this.aClass99Array1[arg1].method2480(arg2, arg3, -1388186093) + this.aClass99Array1[arg1].method2480(arg2 + 1, arg3, -1652122244) + this.aClass99Array1[arg1].method2480(arg2, arg3 + 1, -1840235055) + this.aClass99Array1[arg1].method2480(arg2 + 1, arg3 + 1, -2005679960)) / 4;
				arg0.method24291(this.aClass104_11, local16.aClass132_Sub1_Sub4_1, 0, local126, this.anInt5439 * -77997759, true, (byte) -57);
			}
		}
		if (arg2 < this.anInt5443 * -200159665 && arg3 < this.anInt5444 * -1943751559) {
			local16 = this.aClass572ArrayArrayArray3[arg1][arg2 + 1][arg3 + 1];
			if (local16 != null && local16.aClass132_Sub1_Sub4_1 != null && local16.aClass132_Sub1_Sub4_1.method24284(-1448980402)) {
				local126 = (this.aClass99Array1[arg1].method2480(arg2 + 1, arg3 + 1, -1279805316) + this.aClass99Array1[arg1].method2480(arg2 + 1 + 1, arg3 + 1, -1004642146) + this.aClass99Array1[arg1].method2480(arg2 + 1, arg3 + 1 + 1, -1312548956) + this.aClass99Array1[arg1].method2480(1 + 1 + arg2, 1 + 1 + arg3, -173667804)) / 4 - (this.aClass99Array1[arg1].method2480(arg2, arg3, -702570542) + this.aClass99Array1[arg1].method2480(arg2 + 1, arg3, -1865057904) + this.aClass99Array1[arg1].method2480(arg2, arg3 + 1, -822565069) + this.aClass99Array1[arg1].method2480(arg2 + 1, arg3 + 1, -382371541)) / 4;
				arg0.method24291(this.aClass104_11, local16.aClass132_Sub1_Sub4_1, this.anInt5439 * -77997759, local126, this.anInt5439 * -77997759, true, (byte) -32);
			}
		}
		if (arg2 >= this.anInt5443 * -200159665 || arg3 <= 0) {
			return;
		}
		local16 = this.aClass572ArrayArrayArray3[arg1][arg2 + 1][arg3 - 1];
		if (local16 != null && local16.aClass132_Sub1_Sub4_1 != null && local16.aClass132_Sub1_Sub4_1.method24284(-497177362)) {
			local126 = (this.aClass99Array1[arg1].method2480(arg2 + 1, arg3 - 1, -1667326005) + this.aClass99Array1[arg1].method2480(arg2 + 1 + 1, arg3 - 1, -1269196547) + this.aClass99Array1[arg1].method2480(arg2 + 1, arg3 + 1 - 1, -1425174889) + this.aClass99Array1[arg1].method2480(1 + 1 + arg2, arg3 + 1 - 1, -1153449083)) / 4 - (this.aClass99Array1[arg1].method2480(arg2, arg3, -2007613716) + this.aClass99Array1[arg1].method2480(arg2 + 1, arg3, -467165210) + this.aClass99Array1[arg1].method2480(arg2, arg3 + 1, -1380787746) + this.aClass99Array1[arg1].method2480(arg2 + 1, arg3 + 1, -1793264789)) / 4;
			arg0.method24291(this.aClass104_11, local16.aClass132_Sub1_Sub4_1, this.anInt5439 * -77997759, local126, -(this.anInt5439 * -77997759), true, (byte) -120);
		}
	}

	@OriginalMember(owner = "client!tx", name = "ew", descriptor = "(Lclient!alh;III)V", line = 693)
	void method31564(@OriginalArg(0) Class132_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) Class572 local16;
		@Pc(126) int local126;
		if (arg2 < this.anInt5443 * -200159665) {
			local16 = this.aClass572ArrayArrayArray3[arg1][arg2 + 1][arg3];
			if (local16 != null && local16.aClass132_Sub1_Sub4_1 != null && local16.aClass132_Sub1_Sub4_1.method24284(136219067)) {
				local126 = (this.aClass99Array1[arg1].method2480(arg2 + 1, arg3, -1143174479) + this.aClass99Array1[arg1].method2480(arg2 + 1 + 1, arg3, -1309261572) + this.aClass99Array1[arg1].method2480(arg2 + 1, arg3 + 1, -1556580459) + this.aClass99Array1[arg1].method2480(1 + 1 + arg2, arg3 + 1, -1663888697)) / 4 - (this.aClass99Array1[arg1].method2480(arg2, arg3, -1295693148) + this.aClass99Array1[arg1].method2480(arg2 + 1, arg3, -2084833427) + this.aClass99Array1[arg1].method2480(arg2, arg3 + 1, -1562543570) + this.aClass99Array1[arg1].method2480(arg2 + 1, arg3 + 1, -862834152)) / 4;
				arg0.method24291(this.aClass104_11, local16.aClass132_Sub1_Sub4_1, this.anInt5439 * -77997759, local126, 0, true, (byte) -72);
			}
		}
		if (arg3 < this.anInt5443 * -200159665) {
			local16 = this.aClass572ArrayArrayArray3[arg1][arg2][arg3 + 1];
			if (local16 != null && local16.aClass132_Sub1_Sub4_1 != null && local16.aClass132_Sub1_Sub4_1.method24284(-934962119)) {
				local126 = (this.aClass99Array1[arg1].method2480(arg2, arg3, -472267919) + this.aClass99Array1[arg1].method2480(arg2 + 1, arg3 + 1, -623622738) + this.aClass99Array1[arg1].method2480(arg2, arg3 + 1 + 1, -1618230091) + this.aClass99Array1[arg1].method2480(arg2 + 1, 1 + 1 + arg3, -1018674019)) / 4 - (this.aClass99Array1[arg1].method2480(arg2, arg3, -1106626314) + this.aClass99Array1[arg1].method2480(arg2 + 1, arg3, -2090495734) + this.aClass99Array1[arg1].method2480(arg2, arg3 + 1, -708533007) + this.aClass99Array1[arg1].method2480(arg2 + 1, arg3 + 1, -764178695)) / 4;
				arg0.method24291(this.aClass104_11, local16.aClass132_Sub1_Sub4_1, 0, local126, this.anInt5439 * -77997759, true, (byte) -120);
			}
		}
		if (arg2 < this.anInt5443 * -200159665 && arg3 < this.anInt5444 * -1943751559) {
			local16 = this.aClass572ArrayArrayArray3[arg1][arg2 + 1][arg3 + 1];
			if (local16 != null && local16.aClass132_Sub1_Sub4_1 != null && local16.aClass132_Sub1_Sub4_1.method24284(1926776724)) {
				local126 = (this.aClass99Array1[arg1].method2480(arg2 + 1, arg3 + 1, -620098996) + this.aClass99Array1[arg1].method2480(arg2 + 1 + 1, arg3 + 1, -437272037) + this.aClass99Array1[arg1].method2480(arg2 + 1, arg3 + 1 + 1, -1831718294) + this.aClass99Array1[arg1].method2480(1 + 1 + arg2, 1 + 1 + arg3, -2074225691)) / 4 - (this.aClass99Array1[arg1].method2480(arg2, arg3, -438141562) + this.aClass99Array1[arg1].method2480(arg2 + 1, arg3, -1030511941) + this.aClass99Array1[arg1].method2480(arg2, arg3 + 1, -1486731738) + this.aClass99Array1[arg1].method2480(arg2 + 1, arg3 + 1, -522310599)) / 4;
				arg0.method24291(this.aClass104_11, local16.aClass132_Sub1_Sub4_1, this.anInt5439 * -77997759, local126, this.anInt5439 * -77997759, true, (byte) -31);
			}
		}
		if (arg2 >= this.anInt5443 * -200159665 || arg3 <= 0) {
			return;
		}
		local16 = this.aClass572ArrayArrayArray3[arg1][arg2 + 1][arg3 - 1];
		if (local16 != null && local16.aClass132_Sub1_Sub4_1 != null && local16.aClass132_Sub1_Sub4_1.method24284(-458659269)) {
			local126 = (this.aClass99Array1[arg1].method2480(arg2 + 1, arg3 - 1, -687803360) + this.aClass99Array1[arg1].method2480(arg2 + 1 + 1, arg3 - 1, -2109563541) + this.aClass99Array1[arg1].method2480(arg2 + 1, arg3 + 1 - 1, -1684297853) + this.aClass99Array1[arg1].method2480(1 + 1 + arg2, arg3 + 1 - 1, -464752433)) / 4 - (this.aClass99Array1[arg1].method2480(arg2, arg3, -1787816564) + this.aClass99Array1[arg1].method2480(arg2 + 1, arg3, -1989002179) + this.aClass99Array1[arg1].method2480(arg2, arg3 + 1, -537895849) + this.aClass99Array1[arg1].method2480(arg2 + 1, arg3 + 1, -1548070989)) / 4;
			arg0.method24291(this.aClass104_11, local16.aClass132_Sub1_Sub4_1, this.anInt5439 * -77997759, local126, -(this.anInt5439 * -77997759), true, (byte) -17);
		}
	}

	@OriginalMember(owner = "client!tx", name = "er", descriptor = "(Lclient!alh;IIIII)V", line = 725)
	void method31565(@OriginalArg(0) Class132_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg5 + arg3;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (this.anInt5442 * -882426473 != local17) {
				for (@Pc(31) int local31 = local3; local31 <= local7; local31++) {
					if (local31 >= 0 && local31 < this.anInt5443 * -200159665) {
						for (@Pc(45) int local45 = local11; local45 <= local15; local45++) {
							if (local45 >= 0 && local45 < this.anInt5444 * -1943751559 && (!local1 || local31 >= local7 || local45 >= local15 || local45 < arg3 && arg2 != local31)) {
								@Pc(81) Class572 local81 = this.aClass572ArrayArrayArray3[local17][local31][local45];
								if (local81 != null) {
									@Pc(176) int local176 = (this.aClass99Array1[local17].method2480(local31, local45, -610865234) + this.aClass99Array1[local17].method2480(local31 + 1, local45, -1048500557) + this.aClass99Array1[local17].method2480(local31, local45 + 1, -1070683541) + this.aClass99Array1[local17].method2480(local31 + 1, local45 + 1, -1096027084)) / 4 - (this.aClass99Array1[arg1].method2480(arg2, arg3, -864141772) + this.aClass99Array1[arg1].method2480(arg2 + 1, arg3, -1978233238) + this.aClass99Array1[arg1].method2480(arg2, arg3 + 1, -336380388) + this.aClass99Array1[arg1].method2480(arg2 + 1, arg3 + 1, -1397730771)) / 4;
									@Pc(179) Class132_Sub1_Sub2 local179 = local81.aClass132_Sub1_Sub2_1;
									@Pc(182) Class132_Sub1_Sub2 local182 = local81.aClass132_Sub1_Sub2_2;
									if (local179 != null && local179.method24284(-1379040590)) {
										arg0.method24291(this.aClass104_11, local179, this.anInt5439 * -77997759 * (local31 - arg2) + (1 - arg4) * -996240773 * this.anInt5447, local176, this.anInt5439 * -77997759 * (local45 - arg3) + this.anInt5447 * -996240773 * (1 - arg5), local1, (byte) -75);
									}
									if (local182 != null && local182.method24284(-708691442)) {
										arg0.method24291(this.aClass104_11, local182, (local31 - arg2) * this.anInt5439 * -77997759 + (1 - arg4) * this.anInt5447 * -996240773, local176, this.anInt5447 * -996240773 * (1 - arg5) + (local45 - arg3) * this.anInt5439 * -77997759, local1, (byte) -116);
									}
									for (@Pc(283) Class590 local283 = local81.aClass590_1; local283 != null; local283 = local283.aClass590_2) {
										@Pc(288) Class132_Sub1_Sub1 local288 = local283.aClass132_Sub1_Sub1_1;
										if (local288 != null && local288.method24284(-935359752) && (local288.aShort129 == local31 || local3 == local31) && (local45 == local288.aShort128 || local11 == local45)) {
											@Pc(318) int local318 = local288.aShort130 - local288.aShort129 + 1;
											@Pc(326) int local326 = local288.aShort127 - local288.aShort128 + 1;
											arg0.method24291(this.aClass104_11, local288, (local288.aShort129 - arg2) * -77997759 * this.anInt5439 + (local318 - arg4) * this.anInt5447 * -996240773, local176, (local288.aShort128 - arg3) * this.anInt5439 * -77997759 + (local326 - arg5) * -996240773 * this.anInt5447, local1, (byte) -50);
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

	@OriginalMember(owner = "client!tx", name = "en", descriptor = "(Lclient!alh;IIIII)V", line = 725)
	void method31566(@OriginalArg(0) Class132_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg5 + arg3;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (this.anInt5442 * -882426473 != local17) {
				for (@Pc(31) int local31 = local3; local31 <= local7; local31++) {
					if (local31 >= 0 && local31 < this.anInt5443 * -200159665) {
						for (@Pc(45) int local45 = local11; local45 <= local15; local45++) {
							if (local45 >= 0 && local45 < this.anInt5444 * -1943751559 && (!local1 || local31 >= local7 || local45 >= local15 || local45 < arg3 && arg2 != local31)) {
								@Pc(81) Class572 local81 = this.aClass572ArrayArrayArray3[local17][local31][local45];
								if (local81 != null) {
									@Pc(176) int local176 = (this.aClass99Array1[local17].method2480(local31, local45, -423059117) + this.aClass99Array1[local17].method2480(local31 + 1, local45, -342479010) + this.aClass99Array1[local17].method2480(local31, local45 + 1, -944833804) + this.aClass99Array1[local17].method2480(local31 + 1, local45 + 1, -1584741185)) / 4 - (this.aClass99Array1[arg1].method2480(arg2, arg3, -170260862) + this.aClass99Array1[arg1].method2480(arg2 + 1, arg3, -1226579555) + this.aClass99Array1[arg1].method2480(arg2, arg3 + 1, -1999290923) + this.aClass99Array1[arg1].method2480(arg2 + 1, arg3 + 1, -549129682)) / 4;
									@Pc(179) Class132_Sub1_Sub2 local179 = local81.aClass132_Sub1_Sub2_1;
									@Pc(182) Class132_Sub1_Sub2 local182 = local81.aClass132_Sub1_Sub2_2;
									if (local179 != null && local179.method24284(-885613508)) {
										arg0.method24291(this.aClass104_11, local179, this.anInt5439 * -77997759 * (local31 - arg2) + (1 - arg4) * -996240773 * this.anInt5447, local176, this.anInt5439 * -77997759 * (local45 - arg3) + this.anInt5447 * -996240773 * (1 - arg5), local1, (byte) -122);
									}
									if (local182 != null && local182.method24284(-384627955)) {
										arg0.method24291(this.aClass104_11, local182, (local31 - arg2) * this.anInt5439 * -77997759 + (1 - arg4) * this.anInt5447 * -996240773, local176, this.anInt5447 * -996240773 * (1 - arg5) + (local45 - arg3) * this.anInt5439 * -77997759, local1, (byte) -77);
									}
									for (@Pc(283) Class590 local283 = local81.aClass590_1; local283 != null; local283 = local283.aClass590_2) {
										@Pc(288) Class132_Sub1_Sub1 local288 = local283.aClass132_Sub1_Sub1_1;
										if (local288 != null && local288.method24284(-1776742884) && (local288.aShort129 == local31 || local3 == local31) && (local45 == local288.aShort128 || local11 == local45)) {
											@Pc(318) int local318 = local288.aShort130 - local288.aShort129 + 1;
											@Pc(326) int local326 = local288.aShort127 - local288.aShort128 + 1;
											arg0.method24291(this.aClass104_11, local288, (local288.aShort129 - arg2) * -77997759 * this.anInt5439 + (local318 - arg4) * this.anInt5447 * -996240773, local176, (local288.aShort128 - arg3) * this.anInt5439 * -77997759 + (local326 - arg5) * -996240773 * this.anInt5447, local1, (byte) -78);
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

	@OriginalMember(owner = "client!tx", name = "ax", descriptor = "(Lclient!alh;IIIII)V", line = 725)
	void method31567(@OriginalArg(0) Class132_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg5 + arg3;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (this.anInt5442 * -882426473 != local17) {
				for (@Pc(31) int local31 = local3; local31 <= local7; local31++) {
					if (local31 >= 0 && local31 < this.anInt5443 * -200159665) {
						for (@Pc(45) int local45 = local11; local45 <= local15; local45++) {
							if (local45 >= 0 && local45 < this.anInt5444 * -1943751559 && (!local1 || local31 >= local7 || local45 >= local15 || local45 < arg3 && arg2 != local31)) {
								@Pc(81) Class572 local81 = this.aClass572ArrayArrayArray3[local17][local31][local45];
								if (local81 != null) {
									@Pc(176) int local176 = (this.aClass99Array1[local17].method2480(local31, local45, -1835381158) + this.aClass99Array1[local17].method2480(local31 + 1, local45, -492241305) + this.aClass99Array1[local17].method2480(local31, local45 + 1, -2116493834) + this.aClass99Array1[local17].method2480(local31 + 1, local45 + 1, -2096882814)) / 4 - (this.aClass99Array1[arg1].method2480(arg2, arg3, -1532911341) + this.aClass99Array1[arg1].method2480(arg2 + 1, arg3, -515941363) + this.aClass99Array1[arg1].method2480(arg2, arg3 + 1, -1577205806) + this.aClass99Array1[arg1].method2480(arg2 + 1, arg3 + 1, -929487747)) / 4;
									@Pc(179) Class132_Sub1_Sub2 local179 = local81.aClass132_Sub1_Sub2_1;
									@Pc(182) Class132_Sub1_Sub2 local182 = local81.aClass132_Sub1_Sub2_2;
									if (local179 != null && local179.method24284(894163493)) {
										arg0.method24291(this.aClass104_11, local179, this.anInt5439 * -77997759 * (local31 - arg2) + (1 - arg4) * -996240773 * this.anInt5447, local176, this.anInt5439 * -77997759 * (local45 - arg3) + this.anInt5447 * -996240773 * (1 - arg5), local1, (byte) -43);
									}
									if (local182 != null && local182.method24284(-1732975354)) {
										arg0.method24291(this.aClass104_11, local182, (local31 - arg2) * this.anInt5439 * -77997759 + (1 - arg4) * this.anInt5447 * -996240773, local176, this.anInt5447 * -996240773 * (1 - arg5) + (local45 - arg3) * this.anInt5439 * -77997759, local1, (byte) -118);
									}
									for (@Pc(283) Class590 local283 = local81.aClass590_1; local283 != null; local283 = local283.aClass590_2) {
										@Pc(288) Class132_Sub1_Sub1 local288 = local283.aClass132_Sub1_Sub1_1;
										if (local288 != null && local288.method24284(-2108569681) && (local288.aShort129 == local31 || local3 == local31) && (local45 == local288.aShort128 || local11 == local45)) {
											@Pc(318) int local318 = local288.aShort130 - local288.aShort129 + 1;
											@Pc(326) int local326 = local288.aShort127 - local288.aShort128 + 1;
											arg0.method24291(this.aClass104_11, local288, (local288.aShort129 - arg2) * -77997759 * this.anInt5439 + (local318 - arg4) * this.anInt5447 * -996240773, local176, (local288.aShort128 - arg3) * this.anInt5439 * -77997759 + (local326 - arg5) * -996240773 * this.anInt5447, local1, (byte) -92);
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

	@OriginalMember(owner = "client!tx", name = "eb", descriptor = "(Lclient!alh;IIIII)V", line = 725)
	void method31568(@OriginalArg(0) Class132_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg5 + arg3;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (this.anInt5442 * -882426473 != local17) {
				for (@Pc(31) int local31 = local3; local31 <= local7; local31++) {
					if (local31 >= 0 && local31 < this.anInt5443 * -200159665) {
						for (@Pc(45) int local45 = local11; local45 <= local15; local45++) {
							if (local45 >= 0 && local45 < this.anInt5444 * -1943751559 && (!local1 || local31 >= local7 || local45 >= local15 || local45 < arg3 && arg2 != local31)) {
								@Pc(81) Class572 local81 = this.aClass572ArrayArrayArray3[local17][local31][local45];
								if (local81 != null) {
									@Pc(176) int local176 = (this.aClass99Array1[local17].method2480(local31, local45, -580893929) + this.aClass99Array1[local17].method2480(local31 + 1, local45, -603514853) + this.aClass99Array1[local17].method2480(local31, local45 + 1, -878650886) + this.aClass99Array1[local17].method2480(local31 + 1, local45 + 1, -1673094059)) / 4 - (this.aClass99Array1[arg1].method2480(arg2, arg3, -837330753) + this.aClass99Array1[arg1].method2480(arg2 + 1, arg3, -224503589) + this.aClass99Array1[arg1].method2480(arg2, arg3 + 1, -2064998036) + this.aClass99Array1[arg1].method2480(arg2 + 1, arg3 + 1, -869078566)) / 4;
									@Pc(179) Class132_Sub1_Sub2 local179 = local81.aClass132_Sub1_Sub2_1;
									@Pc(182) Class132_Sub1_Sub2 local182 = local81.aClass132_Sub1_Sub2_2;
									if (local179 != null && local179.method24284(-1802448982)) {
										arg0.method24291(this.aClass104_11, local179, this.anInt5439 * -77997759 * (local31 - arg2) + (1 - arg4) * -996240773 * this.anInt5447, local176, this.anInt5439 * -77997759 * (local45 - arg3) + this.anInt5447 * -996240773 * (1 - arg5), local1, (byte) -83);
									}
									if (local182 != null && local182.method24284(-893199965)) {
										arg0.method24291(this.aClass104_11, local182, (local31 - arg2) * this.anInt5439 * -77997759 + (1 - arg4) * this.anInt5447 * -996240773, local176, this.anInt5447 * -996240773 * (1 - arg5) + (local45 - arg3) * this.anInt5439 * -77997759, local1, (byte) -123);
									}
									for (@Pc(283) Class590 local283 = local81.aClass590_1; local283 != null; local283 = local283.aClass590_2) {
										@Pc(288) Class132_Sub1_Sub1 local288 = local283.aClass132_Sub1_Sub1_1;
										if (local288 != null && local288.method24284(1240052722) && (local288.aShort129 == local31 || local3 == local31) && (local45 == local288.aShort128 || local11 == local45)) {
											@Pc(318) int local318 = local288.aShort130 - local288.aShort129 + 1;
											@Pc(326) int local326 = local288.aShort127 - local288.aShort128 + 1;
											arg0.method24291(this.aClass104_11, local288, (local288.aShort129 - arg2) * -77997759 * this.anInt5439 + (local318 - arg4) * this.anInt5447 * -996240773, local176, (local288.aShort128 - arg3) * this.anInt5439 * -77997759 + (local326 - arg5) * -996240773 * this.anInt5447, local1, (byte) -60);
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

	@OriginalMember(owner = "client!tx", name = "fu", descriptor = "(IIII[[[B[I[I[I[I[IIBIIZZIZ)V", line = 762)
	public void method31569(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[][][] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) byte arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14, @OriginalArg(15) boolean arg15, @OriginalArg(16) int arg16, @OriginalArg(17) boolean arg17) {
		this.aClass598_2.aBoolean823 = true;
		this.aBoolean819 = arg15;
		this.anInt5440 = (arg1 >> this.anInt5438 * -358186793) * 807663979;
		this.anInt5459 = (arg3 >> -358186793 * this.anInt5438) * -893882053;
		this.anInt5451 = arg1 * -541960217;
		this.anInt5452 = arg3 * 2053796035;
		this.anInt5453 = arg2 * 1575019517;
		this.anInt5461 = this.anInt5440 * 1466454929 - this.anInt5455 * -921973039;
		if (this.anInt5461 * 890109843 < 0) {
			this.anInt5456 = -(this.anInt5461 * -699365257);
			this.anInt5461 = 0;
		} else {
			this.anInt5456 = 0;
		}
		this.anInt5446 = this.anInt5459 * -1701337247 - this.anInt5455 * 845404177;
		if (this.anInt5446 * 1220619219 < 0) {
			this.anInt5457 = -(this.anInt5446 * -1954680553);
			this.anInt5446 = 0;
		} else {
			this.anInt5457 = 0;
		}
		this.anInt5458 = this.anInt5455 * -1677097567 + this.anInt5440 * 1251714657;
		if (this.anInt5458 * -891147229 > this.anInt5443 * -200159665) {
			this.anInt5458 = this.anInt5443 * -1912204827;
		}
		this.anInt5460 = this.anInt5455 * 1178488421 + this.anInt5459 * -189865995;
		if (this.anInt5460 * 150058823 > this.anInt5444 * -1943751559) {
			this.anInt5460 = this.anInt5444 * 2064881215;
		}
		@Pc(156) boolean[][] local156 = this.aBooleanArrayArray14;
		@Pc(159) boolean[][] local159 = this.aBooleanArrayArray13;
		@Pc(164) int local164;
		@Pc(179) int local179;
		if (this.aBoolean819) {
			for (local164 = 0; local164 < this.anInt5455 * -93916925 + 2 + this.anInt5455 * -93916925; local164++) {
				local179 = 0;
				@Pc(181) int local181 = 0;
				for (@Pc(183) int local183 = 0; local183 < this.anInt5455 * -93916925 + 2 + this.anInt5455 * -93916925; local183++) {
					if (local183 > 1) {
						this.anIntArray474[local183 - 2] = local179;
					}
					local179 = local181;
					@Pc(220) int local220 = local164 + (this.anInt5440 * 1602382659 - this.anInt5455 * -93916925);
					@Pc(232) int local232 = local183 + (this.anInt5459 * 1547517939 - this.anInt5455 * -93916925);
					@Pc(255) int local255;
					if (local220 >= 0 && local232 >= 0 && local220 < this.anInt5443 * -200159665 && local232 < this.anInt5444 * -1943751559) {
						local255 = local220 << this.anInt5438 * -358186793;
						@Pc(262) int local262 = local232 << this.anInt5438 * -358186793;
						@Pc(284) int local284 = this.aClass99Array2[this.aClass99Array2.length - 1].method2480(local220, local232, -1351670589) - (0x3E8 << this.anInt5438 * -358186793 - 7);
						@Pc(325) int local325 = (this.aClass99Array3 == null ? this.aClass99Array2[0].method2480(local220, local232, -1346636010) + this.anInt5439 * -77997759 : this.aClass99Array3[0].method2480(local220, local232, -225671609) + this.anInt5439 * -77997759) + (0x3E8 << this.anInt5438 * -358186793 - 7);
						local181 = this.aClass104_11.method20715(local255, local284, local262, local255, local325, local262);
						this.aBooleanArrayArray13[local164][local183] = local181 == 0;
					} else {
						local181 = -1;
						this.aBooleanArrayArray13[local164][local183] = false;
					}
					if (local164 > 0 && local183 > 0) {
						local255 = this.anIntArray474[local183 - 1] & this.anIntArray474[local183] & local179 & local181;
						this.aBooleanArrayArray14[local164 - 1][local183 - 1] = local255 == 0;
					}
				}
				this.anIntArray474[this.anInt5455 * -93916925 + this.anInt5455 * -93916925] = local179;
				this.anIntArray474[this.anInt5455 * -93916925 + this.anInt5455 * -93916925 + 1] = local181;
			}
			if (arg17) {
				this.aClass598_2.anIntArray481 = arg5;
				this.aClass598_2.anIntArray482 = arg6;
				this.aClass598_2.anIntArray479 = arg7;
				this.aClass598_2.anIntArray484 = arg8;
				this.aClass598_2.anIntArray483 = arg9;
				this.aClass598_2.method31797(this.aClass104_11, arg10);
			} else {
				this.aClass598_2.aBoolean823 = false;
			}
		} else {
			if (this.aBooleanArrayArray12 == null) {
				this.aBooleanArrayArray12 = new boolean[this.anInt5455 * -93916925 + 2 + this.anInt5455 * -93916925][this.anInt5455 * -93916925 + 2 + this.anInt5455 * -93916925];
			}
			for (local164 = 0; local164 < this.aBooleanArrayArray12.length; local164++) {
				for (local179 = 0; local179 < this.aBooleanArrayArray12[0].length; local179++) {
					this.aBooleanArrayArray12[local164][local179] = true;
				}
			}
			this.aBooleanArrayArray13 = this.aBooleanArrayArray12;
			this.aBooleanArrayArray14 = this.aBooleanArrayArray12;
			this.anInt5461 = 0;
			this.anInt5446 = 0;
			this.anInt5458 = this.anInt5443 * -1912204827;
			this.anInt5460 = this.anInt5444 * 2064881215;
			this.aClass598_2.aBoolean823 = false;
		}
		Class574.method31346(this, this.aClass104_11, (byte) -31);
		if (!this.aClass569_2.aBoolean814) {
			@Pc(556) Iterator local556 = this.aClass569_2.aList22.iterator();
			while (local556.hasNext()) {
				@Pc(563) Class573 local563 = (Class573) local556.next();
				local556.remove();
				Class305.method26799(local563, (byte) 0);
			}
		}
		if (this.aBoolean817) {
			for (local164 = 0; local164 < this.anInt5464 * 809266399; local164++) {
				this.aClass597Array1[local164].method31773(arg0, arg14, 709380673);
			}
		}
		if (this.aClass572ArrayArrayArray2 != null) {
			this.method31438(true, 870300168);
			this.aClass104_11.method20624(-1, new Class237(1583160, 40, 127, 63, 0, 0, 0));
			this.method31574(true, arg4, arg10, arg11, arg16);
			this.aClass104_11.method20626();
			this.method31438(false, 870300168);
		}
		this.method31574(false, arg4, arg10, arg11, arg16);
		if (!this.aBoolean819) {
			this.aBooleanArrayArray14 = local156;
			this.aBooleanArrayArray13 = local159;
		}
	}

	@OriginalMember(owner = "client!tx", name = "ex", descriptor = "(IIII[[[B[I[I[I[I[IIBIIZZIZ)V", line = 762)
	public void method31570(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[][][] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) byte arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14, @OriginalArg(15) boolean arg15, @OriginalArg(16) int arg16, @OriginalArg(17) boolean arg17) {
		this.aClass598_2.aBoolean823 = true;
		this.aBoolean819 = arg15;
		this.anInt5440 = (arg1 >> this.anInt5438 * -358186793) * 807663979;
		this.anInt5459 = (arg3 >> -358186793 * this.anInt5438) * -893882053;
		this.anInt5451 = arg1 * -541960217;
		this.anInt5452 = arg3 * 2053796035;
		this.anInt5453 = arg2 * 1575019517;
		this.anInt5461 = this.anInt5440 * 1466454929 - this.anInt5455 * -921973039;
		if (this.anInt5461 * 890109843 < 0) {
			this.anInt5456 = -(this.anInt5461 * -699365257);
			this.anInt5461 = 0;
		} else {
			this.anInt5456 = 0;
		}
		this.anInt5446 = this.anInt5459 * -1701337247 - this.anInt5455 * 845404177;
		if (this.anInt5446 * 1220619219 < 0) {
			this.anInt5457 = -(this.anInt5446 * -1954680553);
			this.anInt5446 = 0;
		} else {
			this.anInt5457 = 0;
		}
		this.anInt5458 = this.anInt5455 * -1677097567 + this.anInt5440 * 1251714657;
		if (this.anInt5458 * -891147229 > this.anInt5443 * -200159665) {
			this.anInt5458 = this.anInt5443 * -1912204827;
		}
		this.anInt5460 = this.anInt5455 * 1178488421 + this.anInt5459 * -189865995;
		if (this.anInt5460 * 150058823 > this.anInt5444 * -1943751559) {
			this.anInt5460 = this.anInt5444 * 2064881215;
		}
		@Pc(156) boolean[][] local156 = this.aBooleanArrayArray14;
		@Pc(159) boolean[][] local159 = this.aBooleanArrayArray13;
		@Pc(164) int local164;
		@Pc(179) int local179;
		if (this.aBoolean819) {
			for (local164 = 0; local164 < this.anInt5455 * -93916925 + 2 + this.anInt5455 * -93916925; local164++) {
				local179 = 0;
				@Pc(181) int local181 = 0;
				for (@Pc(183) int local183 = 0; local183 < this.anInt5455 * -93916925 + 2 + this.anInt5455 * -93916925; local183++) {
					if (local183 > 1) {
						this.anIntArray474[local183 - 2] = local179;
					}
					local179 = local181;
					@Pc(220) int local220 = local164 + (this.anInt5440 * 1602382659 - this.anInt5455 * -93916925);
					@Pc(232) int local232 = local183 + (this.anInt5459 * 1547517939 - this.anInt5455 * -93916925);
					@Pc(255) int local255;
					if (local220 >= 0 && local232 >= 0 && local220 < this.anInt5443 * -200159665 && local232 < this.anInt5444 * -1943751559) {
						local255 = local220 << this.anInt5438 * -358186793;
						@Pc(262) int local262 = local232 << this.anInt5438 * -358186793;
						@Pc(284) int local284 = this.aClass99Array2[this.aClass99Array2.length - 1].method2480(local220, local232, -650372815) - (0x3E8 << this.anInt5438 * -358186793 - 7);
						@Pc(325) int local325 = (this.aClass99Array3 == null ? this.aClass99Array2[0].method2480(local220, local232, -1096438030) + this.anInt5439 * -77997759 : this.aClass99Array3[0].method2480(local220, local232, -1361235100) + this.anInt5439 * -77997759) + (0x3E8 << this.anInt5438 * -358186793 - 7);
						local181 = this.aClass104_11.method20715(local255, local284, local262, local255, local325, local262);
						this.aBooleanArrayArray13[local164][local183] = local181 == 0;
					} else {
						local181 = -1;
						this.aBooleanArrayArray13[local164][local183] = false;
					}
					if (local164 > 0 && local183 > 0) {
						local255 = this.anIntArray474[local183 - 1] & this.anIntArray474[local183] & local179 & local181;
						this.aBooleanArrayArray14[local164 - 1][local183 - 1] = local255 == 0;
					}
				}
				this.anIntArray474[this.anInt5455 * -93916925 + this.anInt5455 * -93916925] = local179;
				this.anIntArray474[this.anInt5455 * -93916925 + this.anInt5455 * -93916925 + 1] = local181;
			}
			if (arg17) {
				this.aClass598_2.anIntArray481 = arg5;
				this.aClass598_2.anIntArray482 = arg6;
				this.aClass598_2.anIntArray479 = arg7;
				this.aClass598_2.anIntArray484 = arg8;
				this.aClass598_2.anIntArray483 = arg9;
				this.aClass598_2.method31797(this.aClass104_11, arg10);
			} else {
				this.aClass598_2.aBoolean823 = false;
			}
		} else {
			if (this.aBooleanArrayArray12 == null) {
				this.aBooleanArrayArray12 = new boolean[this.anInt5455 * -93916925 + 2 + this.anInt5455 * -93916925][this.anInt5455 * -93916925 + 2 + this.anInt5455 * -93916925];
			}
			for (local164 = 0; local164 < this.aBooleanArrayArray12.length; local164++) {
				for (local179 = 0; local179 < this.aBooleanArrayArray12[0].length; local179++) {
					this.aBooleanArrayArray12[local164][local179] = true;
				}
			}
			this.aBooleanArrayArray13 = this.aBooleanArrayArray12;
			this.aBooleanArrayArray14 = this.aBooleanArrayArray12;
			this.anInt5461 = 0;
			this.anInt5446 = 0;
			this.anInt5458 = this.anInt5443 * -1912204827;
			this.anInt5460 = this.anInt5444 * 2064881215;
			this.aClass598_2.aBoolean823 = false;
		}
		Class574.method31346(this, this.aClass104_11, (byte) -4);
		if (!this.aClass569_2.aBoolean814) {
			@Pc(556) Iterator local556 = this.aClass569_2.aList22.iterator();
			while (local556.hasNext()) {
				@Pc(563) Class573 local563 = (Class573) local556.next();
				local556.remove();
				Class305.method26799(local563, (byte) 0);
			}
		}
		if (this.aBoolean817) {
			for (local164 = 0; local164 < this.anInt5464 * 809266399; local164++) {
				this.aClass597Array1[local164].method31773(arg0, arg14, -715634078);
			}
		}
		if (this.aClass572ArrayArrayArray2 != null) {
			this.method31438(true, 870300168);
			this.aClass104_11.method20624(-1, new Class237(1583160, 40, 127, 63, 0, 0, 0));
			this.method31574(true, arg4, arg10, arg11, arg16);
			this.aClass104_11.method20626();
			this.method31438(false, 870300168);
		}
		this.method31574(false, arg4, arg10, arg11, arg16);
		if (!this.aBoolean819) {
			this.aBooleanArrayArray14 = local156;
			this.aBooleanArrayArray13 = local159;
		}
	}

	@OriginalMember(owner = "client!tx", name = "fm", descriptor = "(IIII[[[B[I[I[I[I[IIBIIZZIZ)V", line = 762)
	public void method31571(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[][][] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) byte arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14, @OriginalArg(15) boolean arg15, @OriginalArg(16) int arg16, @OriginalArg(17) boolean arg17) {
		this.aClass598_2.aBoolean823 = true;
		this.aBoolean819 = arg15;
		this.anInt5440 = (arg1 >> this.anInt5438 * -358186793) * 807663979;
		this.anInt5459 = (arg3 >> -358186793 * this.anInt5438) * -893882053;
		this.anInt5451 = arg1 * -541960217;
		this.anInt5452 = arg3 * 2053796035;
		this.anInt5453 = arg2 * 1575019517;
		this.anInt5461 = this.anInt5440 * 1466454929 - this.anInt5455 * -921973039;
		if (this.anInt5461 * 890109843 < 0) {
			this.anInt5456 = -(this.anInt5461 * -699365257);
			this.anInt5461 = 0;
		} else {
			this.anInt5456 = 0;
		}
		this.anInt5446 = this.anInt5459 * -1701337247 - this.anInt5455 * 845404177;
		if (this.anInt5446 * 1220619219 < 0) {
			this.anInt5457 = -(this.anInt5446 * -1954680553);
			this.anInt5446 = 0;
		} else {
			this.anInt5457 = 0;
		}
		this.anInt5458 = this.anInt5455 * -1677097567 + this.anInt5440 * 1251714657;
		if (this.anInt5458 * -891147229 > this.anInt5443 * -200159665) {
			this.anInt5458 = this.anInt5443 * -1912204827;
		}
		this.anInt5460 = this.anInt5455 * 1178488421 + this.anInt5459 * -189865995;
		if (this.anInt5460 * 150058823 > this.anInt5444 * -1943751559) {
			this.anInt5460 = this.anInt5444 * 2064881215;
		}
		@Pc(156) boolean[][] local156 = this.aBooleanArrayArray14;
		@Pc(159) boolean[][] local159 = this.aBooleanArrayArray13;
		@Pc(164) int local164;
		@Pc(179) int local179;
		if (this.aBoolean819) {
			for (local164 = 0; local164 < this.anInt5455 * -93916925 + 2 + this.anInt5455 * -93916925; local164++) {
				local179 = 0;
				@Pc(181) int local181 = 0;
				for (@Pc(183) int local183 = 0; local183 < this.anInt5455 * -93916925 + 2 + this.anInt5455 * -93916925; local183++) {
					if (local183 > 1) {
						this.anIntArray474[local183 - 2] = local179;
					}
					local179 = local181;
					@Pc(220) int local220 = local164 + (this.anInt5440 * 1602382659 - this.anInt5455 * -93916925);
					@Pc(232) int local232 = local183 + (this.anInt5459 * 1547517939 - this.anInt5455 * -93916925);
					@Pc(255) int local255;
					if (local220 >= 0 && local232 >= 0 && local220 < this.anInt5443 * -200159665 && local232 < this.anInt5444 * -1943751559) {
						local255 = local220 << this.anInt5438 * -358186793;
						@Pc(262) int local262 = local232 << this.anInt5438 * -358186793;
						@Pc(284) int local284 = this.aClass99Array2[this.aClass99Array2.length - 1].method2480(local220, local232, -1552046628) - (0x3E8 << this.anInt5438 * -358186793 - 7);
						@Pc(325) int local325 = (this.aClass99Array3 == null ? this.aClass99Array2[0].method2480(local220, local232, -1079827788) + this.anInt5439 * -77997759 : this.aClass99Array3[0].method2480(local220, local232, -1547226284) + this.anInt5439 * -77997759) + (0x3E8 << this.anInt5438 * -358186793 - 7);
						local181 = this.aClass104_11.method20715(local255, local284, local262, local255, local325, local262);
						this.aBooleanArrayArray13[local164][local183] = local181 == 0;
					} else {
						local181 = -1;
						this.aBooleanArrayArray13[local164][local183] = false;
					}
					if (local164 > 0 && local183 > 0) {
						local255 = this.anIntArray474[local183 - 1] & this.anIntArray474[local183] & local179 & local181;
						this.aBooleanArrayArray14[local164 - 1][local183 - 1] = local255 == 0;
					}
				}
				this.anIntArray474[this.anInt5455 * -93916925 + this.anInt5455 * -93916925] = local179;
				this.anIntArray474[this.anInt5455 * -93916925 + this.anInt5455 * -93916925 + 1] = local181;
			}
			if (arg17) {
				this.aClass598_2.anIntArray481 = arg5;
				this.aClass598_2.anIntArray482 = arg6;
				this.aClass598_2.anIntArray479 = arg7;
				this.aClass598_2.anIntArray484 = arg8;
				this.aClass598_2.anIntArray483 = arg9;
				this.aClass598_2.method31797(this.aClass104_11, arg10);
			} else {
				this.aClass598_2.aBoolean823 = false;
			}
		} else {
			if (this.aBooleanArrayArray12 == null) {
				this.aBooleanArrayArray12 = new boolean[this.anInt5455 * -93916925 + 2 + this.anInt5455 * -93916925][this.anInt5455 * -93916925 + 2 + this.anInt5455 * -93916925];
			}
			for (local164 = 0; local164 < this.aBooleanArrayArray12.length; local164++) {
				for (local179 = 0; local179 < this.aBooleanArrayArray12[0].length; local179++) {
					this.aBooleanArrayArray12[local164][local179] = true;
				}
			}
			this.aBooleanArrayArray13 = this.aBooleanArrayArray12;
			this.aBooleanArrayArray14 = this.aBooleanArrayArray12;
			this.anInt5461 = 0;
			this.anInt5446 = 0;
			this.anInt5458 = this.anInt5443 * -1912204827;
			this.anInt5460 = this.anInt5444 * 2064881215;
			this.aClass598_2.aBoolean823 = false;
		}
		Class574.method31346(this, this.aClass104_11, (byte) -5);
		if (!this.aClass569_2.aBoolean814) {
			@Pc(556) Iterator local556 = this.aClass569_2.aList22.iterator();
			while (local556.hasNext()) {
				@Pc(563) Class573 local563 = (Class573) local556.next();
				local556.remove();
				Class305.method26799(local563, (byte) 0);
			}
		}
		if (this.aBoolean817) {
			for (local164 = 0; local164 < this.anInt5464 * 809266399; local164++) {
				this.aClass597Array1[local164].method31773(arg0, arg14, -169722013);
			}
		}
		if (this.aClass572ArrayArrayArray2 != null) {
			this.method31438(true, 870300168);
			this.aClass104_11.method20624(-1, new Class237(1583160, 40, 127, 63, 0, 0, 0));
			this.method31574(true, arg4, arg10, arg11, arg16);
			this.aClass104_11.method20626();
			this.method31438(false, 870300168);
		}
		this.method31574(false, arg4, arg10, arg11, arg16);
		if (!this.aBoolean819) {
			this.aBooleanArrayArray14 = local156;
			this.aBooleanArrayArray13 = local159;
		}
	}

	@OriginalMember(owner = "client!tx", name = "av", descriptor = "(IIII[[[B[I[I[I[I[IIBIIZZIZ)V", line = 762)
	public void method31572(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[][][] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) byte arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14, @OriginalArg(15) boolean arg15, @OriginalArg(16) int arg16, @OriginalArg(17) boolean arg17) {
		this.aClass598_2.aBoolean823 = true;
		this.aBoolean819 = arg15;
		this.anInt5440 = (arg1 >> this.anInt5438 * -358186793) * 807663979;
		this.anInt5459 = (arg3 >> -358186793 * this.anInt5438) * -893882053;
		this.anInt5451 = arg1 * -541960217;
		this.anInt5452 = arg3 * 2053796035;
		this.anInt5453 = arg2 * 1575019517;
		this.anInt5461 = this.anInt5440 * 1466454929 - this.anInt5455 * -921973039;
		if (this.anInt5461 * 890109843 < 0) {
			this.anInt5456 = -(this.anInt5461 * -699365257);
			this.anInt5461 = 0;
		} else {
			this.anInt5456 = 0;
		}
		this.anInt5446 = this.anInt5459 * -1701337247 - this.anInt5455 * 845404177;
		if (this.anInt5446 * 1220619219 < 0) {
			this.anInt5457 = -(this.anInt5446 * -1954680553);
			this.anInt5446 = 0;
		} else {
			this.anInt5457 = 0;
		}
		this.anInt5458 = this.anInt5455 * -1677097567 + this.anInt5440 * 1251714657;
		if (this.anInt5458 * -891147229 > this.anInt5443 * -200159665) {
			this.anInt5458 = this.anInt5443 * -1912204827;
		}
		this.anInt5460 = this.anInt5455 * 1178488421 + this.anInt5459 * -189865995;
		if (this.anInt5460 * 150058823 > this.anInt5444 * -1943751559) {
			this.anInt5460 = this.anInt5444 * 2064881215;
		}
		@Pc(156) boolean[][] local156 = this.aBooleanArrayArray14;
		@Pc(159) boolean[][] local159 = this.aBooleanArrayArray13;
		@Pc(164) int local164;
		@Pc(179) int local179;
		if (this.aBoolean819) {
			for (local164 = 0; local164 < this.anInt5455 * -93916925 + 2 + this.anInt5455 * -93916925; local164++) {
				local179 = 0;
				@Pc(181) int local181 = 0;
				for (@Pc(183) int local183 = 0; local183 < this.anInt5455 * -93916925 + 2 + this.anInt5455 * -93916925; local183++) {
					if (local183 > 1) {
						this.anIntArray474[local183 - 2] = local179;
					}
					local179 = local181;
					@Pc(220) int local220 = local164 + (this.anInt5440 * 1602382659 - this.anInt5455 * -93916925);
					@Pc(232) int local232 = local183 + (this.anInt5459 * 1547517939 - this.anInt5455 * -93916925);
					@Pc(255) int local255;
					if (local220 >= 0 && local232 >= 0 && local220 < this.anInt5443 * -200159665 && local232 < this.anInt5444 * -1943751559) {
						local255 = local220 << this.anInt5438 * -358186793;
						@Pc(262) int local262 = local232 << this.anInt5438 * -358186793;
						@Pc(284) int local284 = this.aClass99Array2[this.aClass99Array2.length - 1].method2480(local220, local232, -617054532) - (0x3E8 << this.anInt5438 * -358186793 - 7);
						@Pc(325) int local325 = (this.aClass99Array3 == null ? this.aClass99Array2[0].method2480(local220, local232, -409829741) + this.anInt5439 * -77997759 : this.aClass99Array3[0].method2480(local220, local232, -1281749412) + this.anInt5439 * -77997759) + (0x3E8 << this.anInt5438 * -358186793 - 7);
						local181 = this.aClass104_11.method20715(local255, local284, local262, local255, local325, local262);
						this.aBooleanArrayArray13[local164][local183] = local181 == 0;
					} else {
						local181 = -1;
						this.aBooleanArrayArray13[local164][local183] = false;
					}
					if (local164 > 0 && local183 > 0) {
						local255 = this.anIntArray474[local183 - 1] & this.anIntArray474[local183] & local179 & local181;
						this.aBooleanArrayArray14[local164 - 1][local183 - 1] = local255 == 0;
					}
				}
				this.anIntArray474[this.anInt5455 * -93916925 + this.anInt5455 * -93916925] = local179;
				this.anIntArray474[this.anInt5455 * -93916925 + this.anInt5455 * -93916925 + 1] = local181;
			}
			if (arg17) {
				this.aClass598_2.anIntArray481 = arg5;
				this.aClass598_2.anIntArray482 = arg6;
				this.aClass598_2.anIntArray479 = arg7;
				this.aClass598_2.anIntArray484 = arg8;
				this.aClass598_2.anIntArray483 = arg9;
				this.aClass598_2.method31797(this.aClass104_11, arg10);
			} else {
				this.aClass598_2.aBoolean823 = false;
			}
		} else {
			if (this.aBooleanArrayArray12 == null) {
				this.aBooleanArrayArray12 = new boolean[this.anInt5455 * -93916925 + 2 + this.anInt5455 * -93916925][this.anInt5455 * -93916925 + 2 + this.anInt5455 * -93916925];
			}
			for (local164 = 0; local164 < this.aBooleanArrayArray12.length; local164++) {
				for (local179 = 0; local179 < this.aBooleanArrayArray12[0].length; local179++) {
					this.aBooleanArrayArray12[local164][local179] = true;
				}
			}
			this.aBooleanArrayArray13 = this.aBooleanArrayArray12;
			this.aBooleanArrayArray14 = this.aBooleanArrayArray12;
			this.anInt5461 = 0;
			this.anInt5446 = 0;
			this.anInt5458 = this.anInt5443 * -1912204827;
			this.anInt5460 = this.anInt5444 * 2064881215;
			this.aClass598_2.aBoolean823 = false;
		}
		Class574.method31346(this, this.aClass104_11, (byte) -34);
		if (!this.aClass569_2.aBoolean814) {
			@Pc(556) Iterator local556 = this.aClass569_2.aList22.iterator();
			while (local556.hasNext()) {
				@Pc(563) Class573 local563 = (Class573) local556.next();
				local556.remove();
				Class305.method26799(local563, (byte) 0);
			}
		}
		if (this.aBoolean817) {
			for (local164 = 0; local164 < this.anInt5464 * 809266399; local164++) {
				this.aClass597Array1[local164].method31773(arg0, arg14, -1652572986);
			}
		}
		if (this.aClass572ArrayArrayArray2 != null) {
			this.method31438(true, 870300168);
			this.aClass104_11.method20624(-1, new Class237(1583160, 40, 127, 63, 0, 0, 0));
			this.method31574(true, arg4, arg10, arg11, arg16);
			this.aClass104_11.method20626();
			this.method31438(false, 870300168);
		}
		this.method31574(false, arg4, arg10, arg11, arg16);
		if (!this.aBoolean819) {
			this.aBooleanArrayArray14 = local156;
			this.aBooleanArrayArray13 = local159;
		}
	}

	@OriginalMember(owner = "client!tx", name = "fg", descriptor = "(IIII[[[B[I[I[I[I[IIBIIZZIZ)V", line = 762)
	public void method31573(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[][][] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) byte arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14, @OriginalArg(15) boolean arg15, @OriginalArg(16) int arg16, @OriginalArg(17) boolean arg17) {
		this.aClass598_2.aBoolean823 = true;
		this.aBoolean819 = arg15;
		this.anInt5440 = (arg1 >> this.anInt5438 * -358186793) * 807663979;
		this.anInt5459 = (arg3 >> -358186793 * this.anInt5438) * -893882053;
		this.anInt5451 = arg1 * -541960217;
		this.anInt5452 = arg3 * 2053796035;
		this.anInt5453 = arg2 * 1575019517;
		this.anInt5461 = this.anInt5440 * 1466454929 - this.anInt5455 * -921973039;
		if (this.anInt5461 * 890109843 < 0) {
			this.anInt5456 = -(this.anInt5461 * -699365257);
			this.anInt5461 = 0;
		} else {
			this.anInt5456 = 0;
		}
		this.anInt5446 = this.anInt5459 * -1701337247 - this.anInt5455 * 845404177;
		if (this.anInt5446 * 1220619219 < 0) {
			this.anInt5457 = -(this.anInt5446 * -1954680553);
			this.anInt5446 = 0;
		} else {
			this.anInt5457 = 0;
		}
		this.anInt5458 = this.anInt5455 * -1677097567 + this.anInt5440 * 1251714657;
		if (this.anInt5458 * -891147229 > this.anInt5443 * -200159665) {
			this.anInt5458 = this.anInt5443 * -1912204827;
		}
		this.anInt5460 = this.anInt5455 * 1178488421 + this.anInt5459 * -189865995;
		if (this.anInt5460 * 150058823 > this.anInt5444 * -1943751559) {
			this.anInt5460 = this.anInt5444 * 2064881215;
		}
		@Pc(156) boolean[][] local156 = this.aBooleanArrayArray14;
		@Pc(159) boolean[][] local159 = this.aBooleanArrayArray13;
		@Pc(164) int local164;
		@Pc(179) int local179;
		if (this.aBoolean819) {
			for (local164 = 0; local164 < this.anInt5455 * -93916925 + 2 + this.anInt5455 * -93916925; local164++) {
				local179 = 0;
				@Pc(181) int local181 = 0;
				for (@Pc(183) int local183 = 0; local183 < this.anInt5455 * -93916925 + 2 + this.anInt5455 * -93916925; local183++) {
					if (local183 > 1) {
						this.anIntArray474[local183 - 2] = local179;
					}
					local179 = local181;
					@Pc(220) int local220 = local164 + (this.anInt5440 * 1602382659 - this.anInt5455 * -93916925);
					@Pc(232) int local232 = local183 + (this.anInt5459 * 1547517939 - this.anInt5455 * -93916925);
					@Pc(255) int local255;
					if (local220 >= 0 && local232 >= 0 && local220 < this.anInt5443 * -200159665 && local232 < this.anInt5444 * -1943751559) {
						local255 = local220 << this.anInt5438 * -358186793;
						@Pc(262) int local262 = local232 << this.anInt5438 * -358186793;
						@Pc(284) int local284 = this.aClass99Array2[this.aClass99Array2.length - 1].method2480(local220, local232, -2088734739) - (0x3E8 << this.anInt5438 * -358186793 - 7);
						@Pc(325) int local325 = (this.aClass99Array3 == null ? this.aClass99Array2[0].method2480(local220, local232, -818178233) + this.anInt5439 * -77997759 : this.aClass99Array3[0].method2480(local220, local232, -439287978) + this.anInt5439 * -77997759) + (0x3E8 << this.anInt5438 * -358186793 - 7);
						local181 = this.aClass104_11.method20715(local255, local284, local262, local255, local325, local262);
						this.aBooleanArrayArray13[local164][local183] = local181 == 0;
					} else {
						local181 = -1;
						this.aBooleanArrayArray13[local164][local183] = false;
					}
					if (local164 > 0 && local183 > 0) {
						local255 = this.anIntArray474[local183 - 1] & this.anIntArray474[local183] & local179 & local181;
						this.aBooleanArrayArray14[local164 - 1][local183 - 1] = local255 == 0;
					}
				}
				this.anIntArray474[this.anInt5455 * -93916925 + this.anInt5455 * -93916925] = local179;
				this.anIntArray474[this.anInt5455 * -93916925 + this.anInt5455 * -93916925 + 1] = local181;
			}
			if (arg17) {
				this.aClass598_2.anIntArray481 = arg5;
				this.aClass598_2.anIntArray482 = arg6;
				this.aClass598_2.anIntArray479 = arg7;
				this.aClass598_2.anIntArray484 = arg8;
				this.aClass598_2.anIntArray483 = arg9;
				this.aClass598_2.method31797(this.aClass104_11, arg10);
			} else {
				this.aClass598_2.aBoolean823 = false;
			}
		} else {
			if (this.aBooleanArrayArray12 == null) {
				this.aBooleanArrayArray12 = new boolean[this.anInt5455 * -93916925 + 2 + this.anInt5455 * -93916925][this.anInt5455 * -93916925 + 2 + this.anInt5455 * -93916925];
			}
			for (local164 = 0; local164 < this.aBooleanArrayArray12.length; local164++) {
				for (local179 = 0; local179 < this.aBooleanArrayArray12[0].length; local179++) {
					this.aBooleanArrayArray12[local164][local179] = true;
				}
			}
			this.aBooleanArrayArray13 = this.aBooleanArrayArray12;
			this.aBooleanArrayArray14 = this.aBooleanArrayArray12;
			this.anInt5461 = 0;
			this.anInt5446 = 0;
			this.anInt5458 = this.anInt5443 * -1912204827;
			this.anInt5460 = this.anInt5444 * 2064881215;
			this.aClass598_2.aBoolean823 = false;
		}
		Class574.method31346(this, this.aClass104_11, (byte) -7);
		if (!this.aClass569_2.aBoolean814) {
			@Pc(556) Iterator local556 = this.aClass569_2.aList22.iterator();
			while (local556.hasNext()) {
				@Pc(563) Class573 local563 = (Class573) local556.next();
				local556.remove();
				Class305.method26799(local563, (byte) 0);
			}
		}
		if (this.aBoolean817) {
			for (local164 = 0; local164 < this.anInt5464 * 809266399; local164++) {
				this.aClass597Array1[local164].method31773(arg0, arg14, 1270568763);
			}
		}
		if (this.aClass572ArrayArrayArray2 != null) {
			this.method31438(true, 870300168);
			this.aClass104_11.method20624(-1, new Class237(1583160, 40, 127, 63, 0, 0, 0));
			this.method31574(true, arg4, arg10, arg11, arg16);
			this.aClass104_11.method20626();
			this.method31438(false, 870300168);
		}
		this.method31574(false, arg4, arg10, arg11, arg16);
		if (!this.aBoolean819) {
			this.aBooleanArrayArray14 = local156;
			this.aBooleanArrayArray13 = local159;
		}
	}

	@OriginalMember(owner = "client!tx", name = "ao", descriptor = "(Z[[[BIBI)V", line = 871)
	void method31574(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4) {
		@Pc(5) int local5 = arg0 ? 1 : 0;
		this.anInt5449 = 0;
		this.anInt5445 = 0;
		this.anInt5454 += 1774593837;
		@Pc(27) Class132_Sub1 local27;
		if ((arg4 & 0x2) == 0) {
			for (local27 = this.aClass132_Sub1Array1[local5]; local27 != null; local27 = local27.aClass132_Sub1_23) {
				this.method31577(local27, 2090126575);
				if (local27.anInt3290 * 1998180051 != -1 && !this.method31584(local27, arg0, arg1, arg2, arg3)) {
					this.aClass132_Sub1Array4[(this.anInt5449 += -2107072139) * -889690403 - 1] = local27;
				}
			}
		}
		@Pc(184) int local184;
		if ((arg4 & 0x1) == 0) {
			for (local27 = this.aClass132_Sub1Array2[local5]; local27 != null; local27 = local27.aClass132_Sub1_23) {
				this.method31577(local27, 1751925639);
				if (local27.anInt3290 * 1998180051 != -1 && !this.method31584(local27, arg0, arg1, arg2, arg3)) {
					this.aClass132_Sub1Array3[(this.anInt5445 += 1048894253) * 1298082981 - 1] = local27;
				}
			}
			for (local27 = this.aClass132_Sub1Array5[local5]; local27 != null; local27 = local27.aClass132_Sub1_23) {
				this.method31577(local27, 1501726065);
				if (local27.anInt3290 * 1998180051 != -1 && !this.method31584(local27, arg0, arg1, arg2, arg3)) {
					if (local27.method24286((short) -27038)) {
						this.aClass132_Sub1Array3[(this.anInt5445 += 1048894253) * 1298082981 - 1] = local27;
					} else {
						this.aClass132_Sub1Array4[(this.anInt5449 += -2107072139) * -889690403 - 1] = local27;
					}
				}
			}
			if (!arg0) {
				for (local184 = 0; local184 < this.anInt5465 * -1409302901; local184++) {
					this.method31577(this.aClass132_Sub1_Sub1Array1[local184], 1222568690);
					if (this.aClass132_Sub1_Sub1Array1[local184].anInt3290 * 1998180051 != -1 && !this.method31584(this.aClass132_Sub1_Sub1Array1[local184], arg0, arg1, arg2, arg3)) {
						if (this.aClass132_Sub1_Sub1Array1[local184].method24286((short) -24229)) {
							this.aClass132_Sub1Array3[(this.anInt5445 += 1048894253) * 1298082981 - 1] = this.aClass132_Sub1_Sub1Array1[local184];
						} else {
							this.aClass132_Sub1Array4[(this.anInt5449 += -2107072139) * -889690403 - 1] = this.aClass132_Sub1_Sub1Array1[local184];
						}
					}
				}
			}
		}
		if (this.anInt5449 * -889690403 > 0) {
			this.method31581(this.aClass132_Sub1Array4, 0, this.anInt5449 * -889690403 - 1);
			for (local184 = 0; local184 < this.anInt5449 * -889690403; local184++) {
				this.method31588(this.aClass132_Sub1Array4[local184], this.aClass93_Sub16Array23);
			}
		}
		if (this.aBoolean817) {
			this.aClass104_11.method20844(0, null);
		}
		if ((arg4 & 0x2) == 0) {
			for (local184 = 0; local184 < this.anInt5442 * -882426473; local184++) {
				@Pc(326) int local326;
				@Pc(361) int local361;
				@Pc(397) boolean[][] local397;
				@Pc(405) int local405;
				@Pc(420) int local420;
				@Pc(425) int local425;
				if (local184 < arg2 || arg1 == null) {
					local326 = this.aBooleanArrayArray14.length;
					if (this.aBooleanArrayArray14.length + this.anInt5461 * 890109843 > this.anInt5443 * -200159665) {
						local326 -= this.aBooleanArrayArray14.length + this.anInt5461 * 890109843 - this.anInt5443 * -200159665;
					}
					local361 = this.aBooleanArrayArray14[0].length;
					if (this.aBooleanArrayArray14[0].length + this.anInt5446 * 1220619219 > this.anInt5444 * -1943751559) {
						local361 -= this.aBooleanArrayArray14[0].length + this.anInt5446 * 1220619219 - this.anInt5444 * -1943751559;
					}
					local397 = this.aBooleanArrayArray13;
					if (this.aBoolean819) {
						for (local405 = this.anInt5456 * 1250813125; local405 < local326; local405++) {
							local420 = this.anInt5461 * 890109843 + local405 - this.anInt5456 * 1250813125;
							for (local425 = this.anInt5457 * 742291621; local425 < local361; local425++) {
								if (this.aBooleanArrayArray14[local405][local425] && !this.aClass598_2.method31806(local184, local420, local425 + this.anInt5446 * 1220619219 - this.anInt5457 * 742291621)) {
									local397[local405][local425] = true;
								} else {
									local397[local405][local425] = false;
								}
							}
						}
					}
					this.aClass99Array1[local184].method2507(this.anInt5440 * 1602382659, this.anInt5459 * 1547517939, this.anInt5455 * -93916925, this.aBooleanArrayArray13, true, arg4);
				} else {
					local326 = this.aBooleanArrayArray14.length;
					if (this.anInt5461 * 890109843 + this.aBooleanArrayArray14.length > this.anInt5443 * -200159665) {
						local326 -= this.aBooleanArrayArray14.length + this.anInt5461 * 890109843 - this.anInt5443 * -200159665;
					}
					local361 = this.aBooleanArrayArray14[0].length;
					if (this.aBooleanArrayArray14[0].length + this.anInt5446 * 1220619219 > this.anInt5444 * -1943751559) {
						local361 -= this.aBooleanArrayArray14[0].length + this.anInt5446 * 1220619219 - this.anInt5444 * -1943751559;
					}
					local397 = this.aBooleanArrayArray13;
					if (this.aBoolean819) {
						for (local405 = this.anInt5456 * 1250813125; local405 < local326; local405++) {
							local420 = this.anInt5461 * 890109843 + local405 - this.anInt5456 * 1250813125;
							for (local425 = this.anInt5457 * 742291621; local425 < local361; local425++) {
								local397[local405][local425] = false;
								if (this.aBooleanArrayArray14[local405][local425]) {
									@Pc(453) int local453 = local425 + this.anInt5446 * 1220619219 - this.anInt5457 * 742291621;
									for (@Pc(455) int local455 = local184; local455 >= 0; local455--) {
										if (this.aClass572ArrayArrayArray3[local455][local420][local453] != null && this.aClass572ArrayArrayArray3[local455][local420][local453].aByte163 == local184) {
											if ((local455 < arg2 || arg3 != arg1[local455][local420][local453]) && !this.aClass598_2.method31806(local184, local420, local453)) {
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
					this.aClass99Array1[local184].method2507(this.anInt5440 * 1602382659, this.anInt5459 * 1547517939, this.anInt5455 * -93916925, this.aBooleanArrayArray13, false, arg4);
				}
			}
		}
		if (this.anInt5445 * 1298082981 > 0) {
			this.method31579(this.aClass132_Sub1Array3, 0, this.anInt5445 * 1298082981 - 1);
			for (local184 = 0; local184 < this.anInt5445 * 1298082981; local184++) {
				this.method31588(this.aClass132_Sub1Array3[local184], this.aClass93_Sub16Array23);
			}
		}
	}

	@OriginalMember(owner = "client!tx", name = "fs", descriptor = "(Z[[[BIBI)V", line = 871)
	void method31575(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4) {
		@Pc(5) int local5 = arg0 ? 1 : 0;
		this.anInt5449 = 0;
		this.anInt5445 = 0;
		this.anInt5454 += 1774593837;
		@Pc(27) Class132_Sub1 local27;
		if ((arg4 & 0x2) == 0) {
			for (local27 = this.aClass132_Sub1Array1[local5]; local27 != null; local27 = local27.aClass132_Sub1_23) {
				this.method31577(local27, 1895915554);
				if (local27.anInt3290 * 1998180051 != -1 && !this.method31584(local27, arg0, arg1, arg2, arg3)) {
					this.aClass132_Sub1Array4[(this.anInt5449 += -2107072139) * -889690403 - 1] = local27;
				}
			}
		}
		@Pc(184) int local184;
		if ((arg4 & 0x1) == 0) {
			for (local27 = this.aClass132_Sub1Array2[local5]; local27 != null; local27 = local27.aClass132_Sub1_23) {
				this.method31577(local27, 1662926279);
				if (local27.anInt3290 * 1998180051 != -1 && !this.method31584(local27, arg0, arg1, arg2, arg3)) {
					this.aClass132_Sub1Array3[(this.anInt5445 += 1048894253) * 1298082981 - 1] = local27;
				}
			}
			for (local27 = this.aClass132_Sub1Array5[local5]; local27 != null; local27 = local27.aClass132_Sub1_23) {
				this.method31577(local27, 2019077427);
				if (local27.anInt3290 * 1998180051 != -1 && !this.method31584(local27, arg0, arg1, arg2, arg3)) {
					if (local27.method24286((short) -552)) {
						this.aClass132_Sub1Array3[(this.anInt5445 += 1048894253) * 1298082981 - 1] = local27;
					} else {
						this.aClass132_Sub1Array4[(this.anInt5449 += -2107072139) * -889690403 - 1] = local27;
					}
				}
			}
			if (!arg0) {
				for (local184 = 0; local184 < this.anInt5465 * -1409302901; local184++) {
					this.method31577(this.aClass132_Sub1_Sub1Array1[local184], 1639341193);
					if (this.aClass132_Sub1_Sub1Array1[local184].anInt3290 * 1998180051 != -1 && !this.method31584(this.aClass132_Sub1_Sub1Array1[local184], arg0, arg1, arg2, arg3)) {
						if (this.aClass132_Sub1_Sub1Array1[local184].method24286((short) -28833)) {
							this.aClass132_Sub1Array3[(this.anInt5445 += 1048894253) * 1298082981 - 1] = this.aClass132_Sub1_Sub1Array1[local184];
						} else {
							this.aClass132_Sub1Array4[(this.anInt5449 += -2107072139) * -889690403 - 1] = this.aClass132_Sub1_Sub1Array1[local184];
						}
					}
				}
			}
		}
		if (this.anInt5449 * -889690403 > 0) {
			this.method31581(this.aClass132_Sub1Array4, 0, this.anInt5449 * -889690403 - 1);
			for (local184 = 0; local184 < this.anInt5449 * -889690403; local184++) {
				this.method31588(this.aClass132_Sub1Array4[local184], this.aClass93_Sub16Array23);
			}
		}
		if (this.aBoolean817) {
			this.aClass104_11.method20844(0, null);
		}
		if ((arg4 & 0x2) == 0) {
			for (local184 = 0; local184 < this.anInt5442 * -882426473; local184++) {
				@Pc(326) int local326;
				@Pc(361) int local361;
				@Pc(397) boolean[][] local397;
				@Pc(405) int local405;
				@Pc(420) int local420;
				@Pc(425) int local425;
				if (local184 < arg2 || arg1 == null) {
					local326 = this.aBooleanArrayArray14.length;
					if (this.aBooleanArrayArray14.length + this.anInt5461 * 890109843 > this.anInt5443 * -200159665) {
						local326 -= this.aBooleanArrayArray14.length + this.anInt5461 * 890109843 - this.anInt5443 * -200159665;
					}
					local361 = this.aBooleanArrayArray14[0].length;
					if (this.aBooleanArrayArray14[0].length + this.anInt5446 * 1220619219 > this.anInt5444 * -1943751559) {
						local361 -= this.aBooleanArrayArray14[0].length + this.anInt5446 * 1220619219 - this.anInt5444 * -1943751559;
					}
					local397 = this.aBooleanArrayArray13;
					if (this.aBoolean819) {
						for (local405 = this.anInt5456 * 1250813125; local405 < local326; local405++) {
							local420 = this.anInt5461 * 890109843 + local405 - this.anInt5456 * 1250813125;
							for (local425 = this.anInt5457 * 742291621; local425 < local361; local425++) {
								if (this.aBooleanArrayArray14[local405][local425] && !this.aClass598_2.method31806(local184, local420, local425 + this.anInt5446 * 1220619219 - this.anInt5457 * 742291621)) {
									local397[local405][local425] = true;
								} else {
									local397[local405][local425] = false;
								}
							}
						}
					}
					this.aClass99Array1[local184].method2507(this.anInt5440 * 1602382659, this.anInt5459 * 1547517939, this.anInt5455 * -93916925, this.aBooleanArrayArray13, true, arg4);
				} else {
					local326 = this.aBooleanArrayArray14.length;
					if (this.anInt5461 * 890109843 + this.aBooleanArrayArray14.length > this.anInt5443 * -200159665) {
						local326 -= this.aBooleanArrayArray14.length + this.anInt5461 * 890109843 - this.anInt5443 * -200159665;
					}
					local361 = this.aBooleanArrayArray14[0].length;
					if (this.aBooleanArrayArray14[0].length + this.anInt5446 * 1220619219 > this.anInt5444 * -1943751559) {
						local361 -= this.aBooleanArrayArray14[0].length + this.anInt5446 * 1220619219 - this.anInt5444 * -1943751559;
					}
					local397 = this.aBooleanArrayArray13;
					if (this.aBoolean819) {
						for (local405 = this.anInt5456 * 1250813125; local405 < local326; local405++) {
							local420 = this.anInt5461 * 890109843 + local405 - this.anInt5456 * 1250813125;
							for (local425 = this.anInt5457 * 742291621; local425 < local361; local425++) {
								local397[local405][local425] = false;
								if (this.aBooleanArrayArray14[local405][local425]) {
									@Pc(453) int local453 = local425 + this.anInt5446 * 1220619219 - this.anInt5457 * 742291621;
									for (@Pc(455) int local455 = local184; local455 >= 0; local455--) {
										if (this.aClass572ArrayArrayArray3[local455][local420][local453] != null && this.aClass572ArrayArrayArray3[local455][local420][local453].aByte163 == local184) {
											if ((local455 < arg2 || arg3 != arg1[local455][local420][local453]) && !this.aClass598_2.method31806(local184, local420, local453)) {
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
					this.aClass99Array1[local184].method2507(this.anInt5440 * 1602382659, this.anInt5459 * 1547517939, this.anInt5455 * -93916925, this.aBooleanArrayArray13, false, arg4);
				}
			}
		}
		if (this.anInt5445 * 1298082981 > 0) {
			this.method31579(this.aClass132_Sub1Array3, 0, this.anInt5445 * 1298082981 - 1);
			for (local184 = 0; local184 < this.anInt5445 * 1298082981; local184++) {
				this.method31588(this.aClass132_Sub1Array3[local184], this.aClass93_Sub16Array23);
			}
		}
	}

	@OriginalMember(owner = "client!tx", name = "fz", descriptor = "(Z[[[BIBI)V", line = 871)
	void method31576(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4) {
		@Pc(5) int local5 = arg0 ? 1 : 0;
		this.anInt5449 = 0;
		this.anInt5445 = 0;
		this.anInt5454 += 1774593837;
		@Pc(27) Class132_Sub1 local27;
		if ((arg4 & 0x2) == 0) {
			for (local27 = this.aClass132_Sub1Array1[local5]; local27 != null; local27 = local27.aClass132_Sub1_23) {
				this.method31577(local27, 1697449883);
				if (local27.anInt3290 * 1998180051 != -1 && !this.method31584(local27, arg0, arg1, arg2, arg3)) {
					this.aClass132_Sub1Array4[(this.anInt5449 += -2107072139) * -889690403 - 1] = local27;
				}
			}
		}
		@Pc(184) int local184;
		if ((arg4 & 0x1) == 0) {
			for (local27 = this.aClass132_Sub1Array2[local5]; local27 != null; local27 = local27.aClass132_Sub1_23) {
				this.method31577(local27, 1660675176);
				if (local27.anInt3290 * 1998180051 != -1 && !this.method31584(local27, arg0, arg1, arg2, arg3)) {
					this.aClass132_Sub1Array3[(this.anInt5445 += 1048894253) * 1298082981 - 1] = local27;
				}
			}
			for (local27 = this.aClass132_Sub1Array5[local5]; local27 != null; local27 = local27.aClass132_Sub1_23) {
				this.method31577(local27, 1728780498);
				if (local27.anInt3290 * 1998180051 != -1 && !this.method31584(local27, arg0, arg1, arg2, arg3)) {
					if (local27.method24286((short) -3598)) {
						this.aClass132_Sub1Array3[(this.anInt5445 += 1048894253) * 1298082981 - 1] = local27;
					} else {
						this.aClass132_Sub1Array4[(this.anInt5449 += -2107072139) * -889690403 - 1] = local27;
					}
				}
			}
			if (!arg0) {
				for (local184 = 0; local184 < this.anInt5465 * -1409302901; local184++) {
					this.method31577(this.aClass132_Sub1_Sub1Array1[local184], 1375408367);
					if (this.aClass132_Sub1_Sub1Array1[local184].anInt3290 * 1998180051 != -1 && !this.method31584(this.aClass132_Sub1_Sub1Array1[local184], arg0, arg1, arg2, arg3)) {
						if (this.aClass132_Sub1_Sub1Array1[local184].method24286((short) -5648)) {
							this.aClass132_Sub1Array3[(this.anInt5445 += 1048894253) * 1298082981 - 1] = this.aClass132_Sub1_Sub1Array1[local184];
						} else {
							this.aClass132_Sub1Array4[(this.anInt5449 += -2107072139) * -889690403 - 1] = this.aClass132_Sub1_Sub1Array1[local184];
						}
					}
				}
			}
		}
		if (this.anInt5449 * -889690403 > 0) {
			this.method31581(this.aClass132_Sub1Array4, 0, this.anInt5449 * -889690403 - 1);
			for (local184 = 0; local184 < this.anInt5449 * -889690403; local184++) {
				this.method31588(this.aClass132_Sub1Array4[local184], this.aClass93_Sub16Array23);
			}
		}
		if (this.aBoolean817) {
			this.aClass104_11.method20844(0, null);
		}
		if ((arg4 & 0x2) == 0) {
			for (local184 = 0; local184 < this.anInt5442 * -882426473; local184++) {
				@Pc(326) int local326;
				@Pc(361) int local361;
				@Pc(397) boolean[][] local397;
				@Pc(405) int local405;
				@Pc(420) int local420;
				@Pc(425) int local425;
				if (local184 < arg2 || arg1 == null) {
					local326 = this.aBooleanArrayArray14.length;
					if (this.aBooleanArrayArray14.length + this.anInt5461 * 890109843 > this.anInt5443 * -200159665) {
						local326 -= this.aBooleanArrayArray14.length + this.anInt5461 * 890109843 - this.anInt5443 * -200159665;
					}
					local361 = this.aBooleanArrayArray14[0].length;
					if (this.aBooleanArrayArray14[0].length + this.anInt5446 * 1220619219 > this.anInt5444 * -1943751559) {
						local361 -= this.aBooleanArrayArray14[0].length + this.anInt5446 * 1220619219 - this.anInt5444 * -1943751559;
					}
					local397 = this.aBooleanArrayArray13;
					if (this.aBoolean819) {
						for (local405 = this.anInt5456 * 1250813125; local405 < local326; local405++) {
							local420 = this.anInt5461 * 890109843 + local405 - this.anInt5456 * 1250813125;
							for (local425 = this.anInt5457 * 742291621; local425 < local361; local425++) {
								if (this.aBooleanArrayArray14[local405][local425] && !this.aClass598_2.method31806(local184, local420, local425 + this.anInt5446 * 1220619219 - this.anInt5457 * 742291621)) {
									local397[local405][local425] = true;
								} else {
									local397[local405][local425] = false;
								}
							}
						}
					}
					this.aClass99Array1[local184].method2507(this.anInt5440 * 1602382659, this.anInt5459 * 1547517939, this.anInt5455 * -93916925, this.aBooleanArrayArray13, true, arg4);
				} else {
					local326 = this.aBooleanArrayArray14.length;
					if (this.anInt5461 * 890109843 + this.aBooleanArrayArray14.length > this.anInt5443 * -200159665) {
						local326 -= this.aBooleanArrayArray14.length + this.anInt5461 * 890109843 - this.anInt5443 * -200159665;
					}
					local361 = this.aBooleanArrayArray14[0].length;
					if (this.aBooleanArrayArray14[0].length + this.anInt5446 * 1220619219 > this.anInt5444 * -1943751559) {
						local361 -= this.aBooleanArrayArray14[0].length + this.anInt5446 * 1220619219 - this.anInt5444 * -1943751559;
					}
					local397 = this.aBooleanArrayArray13;
					if (this.aBoolean819) {
						for (local405 = this.anInt5456 * 1250813125; local405 < local326; local405++) {
							local420 = this.anInt5461 * 890109843 + local405 - this.anInt5456 * 1250813125;
							for (local425 = this.anInt5457 * 742291621; local425 < local361; local425++) {
								local397[local405][local425] = false;
								if (this.aBooleanArrayArray14[local405][local425]) {
									@Pc(453) int local453 = local425 + this.anInt5446 * 1220619219 - this.anInt5457 * 742291621;
									for (@Pc(455) int local455 = local184; local455 >= 0; local455--) {
										if (this.aClass572ArrayArrayArray3[local455][local420][local453] != null && this.aClass572ArrayArrayArray3[local455][local420][local453].aByte163 == local184) {
											if ((local455 < arg2 || arg3 != arg1[local455][local420][local453]) && !this.aClass598_2.method31806(local184, local420, local453)) {
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
					this.aClass99Array1[local184].method2507(this.anInt5440 * 1602382659, this.anInt5459 * 1547517939, this.anInt5455 * -93916925, this.aBooleanArrayArray13, false, arg4);
				}
			}
		}
		if (this.anInt5445 * 1298082981 > 0) {
			this.method31579(this.aClass132_Sub1Array3, 0, this.anInt5445 * 1298082981 - 1);
			for (local184 = 0; local184 < this.anInt5445 * 1298082981; local184++) {
				this.method31588(this.aClass132_Sub1Array3[local184], this.aClass93_Sub16Array23);
			}
		}
	}

	@OriginalMember(owner = "client!tx", name = "aj", descriptor = "(Lclient!alh;I)V", line = 970)
	void method31577(@OriginalArg(0) Class132_Sub1 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class472 local3 = arg0.method24220().aClass472_61;
		this.aClass104_11.method20863((float) local3.aFloat317, (float) ((int) local3.aFloat318 + (arg0.method24303((byte) 8) >> 1)), (float) local3.aFloat319, this.aFloatArray118);
		arg0.anInt3290 = (int) this.aFloatArray118[2] * 1729083739;
	}

	@OriginalMember(owner = "client!tx", name = "fj", descriptor = "(Lclient!alh;)V", line = 970)
	void method31578(@OriginalArg(0) Class132_Sub1 arg0) {
		@Pc(3) Class472 local3 = arg0.method24220().aClass472_61;
		this.aClass104_11.method20863((float) local3.aFloat317, (float) ((int) local3.aFloat318 + (arg0.method24303((byte) -20) >> 1)), (float) local3.aFloat319, this.aFloatArray118);
		arg0.anInt3290 = (int) this.aFloatArray118[2] * 1729083739;
	}

	@OriginalMember(owner = "client!tx", name = "ay", descriptor = "([Lclient!alh;II)V", line = 977)
	void method31579(@OriginalArg(0) Class132_Sub1[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(8) int local8 = (arg2 + arg1) / 2;
		@Pc(10) int local10 = arg1;
		@Pc(14) Class132_Sub1 local14 = arg0[local8];
		arg0[local8] = arg0[arg2];
		arg0[arg2] = local14;
		@Pc(29) int local29 = local14.anInt3290 * 1998180051;
		for (@Pc(31) int local31 = arg1; local31 < arg2; local31++) {
			if (arg0[local31].anInt3290 * 1998180051 > local29 + (local31 & 0x1)) {
				@Pc(50) Class132_Sub1 local50 = arg0[local31];
				arg0[local31] = arg0[local10];
				arg0[local10++] = local50;
			}
		}
		arg0[arg2] = arg0[local10];
		arg0[local10] = local14;
		this.method31579(arg0, arg1, local10 - 1);
		this.method31579(arg0, local10 + 1, arg2);
	}

	@OriginalMember(owner = "client!tx", name = "fd", descriptor = "([Lclient!alh;II)V", line = 977)
	void method31580(@OriginalArg(0) Class132_Sub1[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(8) int local8 = (arg2 + arg1) / 2;
		@Pc(10) int local10 = arg1;
		@Pc(14) Class132_Sub1 local14 = arg0[local8];
		arg0[local8] = arg0[arg2];
		arg0[arg2] = local14;
		@Pc(29) int local29 = local14.anInt3290 * 1998180051;
		for (@Pc(31) int local31 = arg1; local31 < arg2; local31++) {
			if (arg0[local31].anInt3290 * 1998180051 > local29 + (local31 & 0x1)) {
				@Pc(50) Class132_Sub1 local50 = arg0[local31];
				arg0[local31] = arg0[local10];
				arg0[local10++] = local50;
			}
		}
		arg0[arg2] = arg0[local10];
		arg0[local10] = local14;
		this.method31579(arg0, arg1, local10 - 1);
		this.method31579(arg0, local10 + 1, arg2);
	}

	@OriginalMember(owner = "client!tx", name = "ab", descriptor = "([Lclient!alh;II)V", line = 1001)
	void method31581(@OriginalArg(0) Class132_Sub1[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(8) int local8 = (arg2 + arg1) / 2;
		@Pc(10) int local10 = arg1;
		@Pc(14) Class132_Sub1 local14 = arg0[local8];
		arg0[local8] = arg0[arg2];
		arg0[arg2] = local14;
		@Pc(29) int local29 = local14.anInt3290 * 1998180051;
		for (@Pc(31) int local31 = arg1; local31 < arg2; local31++) {
			if (arg0[local31].anInt3290 * 1998180051 < (local31 & 0x1) + local29) {
				@Pc(50) Class132_Sub1 local50 = arg0[local31];
				arg0[local31] = arg0[local10];
				arg0[local10++] = local50;
			}
		}
		arg0[arg2] = arg0[local10];
		arg0[local10] = local14;
		this.method31581(arg0, arg1, local10 - 1);
		this.method31581(arg0, local10 + 1, arg2);
	}

	@OriginalMember(owner = "client!tx", name = "fn", descriptor = "([Lclient!alh;II)V", line = 1001)
	void method31582(@OriginalArg(0) Class132_Sub1[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(8) int local8 = (arg2 + arg1) / 2;
		@Pc(10) int local10 = arg1;
		@Pc(14) Class132_Sub1 local14 = arg0[local8];
		arg0[local8] = arg0[arg2];
		arg0[arg2] = local14;
		@Pc(29) int local29 = local14.anInt3290 * 1998180051;
		for (@Pc(31) int local31 = arg1; local31 < arg2; local31++) {
			if (arg0[local31].anInt3290 * 1998180051 < (local31 & 0x1) + local29) {
				@Pc(50) Class132_Sub1 local50 = arg0[local31];
				arg0[local31] = arg0[local10];
				arg0[local10++] = local50;
			}
		}
		arg0[arg2] = arg0[local10];
		arg0[local10] = local14;
		this.method31581(arg0, arg1, local10 - 1);
		this.method31581(arg0, local10 + 1, arg2);
	}

	@OriginalMember(owner = "client!tx", name = "fi", descriptor = "([Lclient!alh;II)V", line = 1001)
	void method31583(@OriginalArg(0) Class132_Sub1[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(8) int local8 = (arg2 + arg1) / 2;
		@Pc(10) int local10 = arg1;
		@Pc(14) Class132_Sub1 local14 = arg0[local8];
		arg0[local8] = arg0[arg2];
		arg0[arg2] = local14;
		@Pc(29) int local29 = local14.anInt3290 * 1998180051;
		for (@Pc(31) int local31 = arg1; local31 < arg2; local31++) {
			if (arg0[local31].anInt3290 * 1998180051 < (local31 & 0x1) + local29) {
				@Pc(50) Class132_Sub1 local50 = arg0[local31];
				arg0[local31] = arg0[local10];
				arg0[local10++] = local50;
			}
		}
		arg0[arg2] = arg0[local10];
		arg0[local10] = local14;
		this.method31581(arg0, arg1, local10 - 1);
		this.method31581(arg0, local10 + 1, arg2);
	}

	@OriginalMember(owner = "client!tx", name = "az", descriptor = "(Lclient!alh;Z[[[BIB)Z", line = 1025)
	boolean method31584(@OriginalArg(0) Class132_Sub1 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte[][][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		if (!this.aBoolean819) {
			return false;
		} else if (arg0 instanceof Class132_Sub1_Sub1) {
			@Pc(11) short local11 = ((Class132_Sub1_Sub1) arg0).aShort130;
			@Pc(15) short local15 = ((Class132_Sub1_Sub1) arg0).aShort127;
			@Pc(19) short local19 = ((Class132_Sub1_Sub1) arg0).aShort129;
			@Pc(23) short local23 = ((Class132_Sub1_Sub1) arg0).aShort128;
			for (@Pc(25) int local25 = local19; local25 <= local11; local25++) {
				for (@Pc(30) int local30 = local23; local30 <= local15; local30++) {
					if (arg0.aByte99 < this.anInt5442 * -882426473 && local25 >= this.anInt5461 * 890109843 && local25 < this.anInt5458 * -891147229 && local30 >= this.anInt5446 * 1220619219 && local30 < this.anInt5460 * 150058823) {
						if ((arg2 == null || arg0.aByte100 < arg3 || arg2[arg0.aByte100][local25][local30] != arg4) && arg0.method24295(1236877151) && !arg0.method24292(this.aClass104_11, (short) 13085)) {
							return false;
						}
						if (!arg1 && local25 >= this.anInt5440 * 1602382659 - 16 && local25 <= this.anInt5440 * 1602382659 + 16 && local30 >= this.anInt5459 * 1547517939 - 16 && local30 <= this.anInt5459 * 1547517939 + 16) {
							arg0.method24290(this.aClass104_11, -676125642);
						}
						return true;
					}
				}
			}
			return true;
		} else {
			@Pc(144) Class472 local144 = arg0.method24220().aClass472_61;
			@Pc(153) int local153 = (int) local144.aFloat317 >> this.anInt5438 * -358186793;
			@Pc(162) int local162 = (int) local144.aFloat319 >> this.anInt5438 * -358186793;
			if (arg0.aByte99 >= this.anInt5442 * -882426473 || local153 < this.anInt5461 * 890109843 || local153 >= this.anInt5458 * -891147229 || local162 < this.anInt5446 * 1220619219 || local162 >= this.anInt5460 * 150058823) {
				return true;
			} else if ((arg2 == null || arg0.aByte100 < arg3 || arg2[arg0.aByte100][local153][local162] != arg4) && arg0.method24295(1236877151) && !arg0.method24292(this.aClass104_11, (short) 4366)) {
				return false;
			} else {
				if (!arg1 && local153 >= this.anInt5440 * 1602382659 - 16 && local153 <= this.anInt5440 * 1602382659 + 16 && local162 >= this.anInt5459 * 1547517939 - 16 && local162 <= this.anInt5459 * 1547517939 + 16) {
					arg0.method24290(this.aClass104_11, -1055550641);
				}
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!tx", name = "fx", descriptor = "(Lclient!alh;Z[[[BIB)Z", line = 1025)
	boolean method31585(@OriginalArg(0) Class132_Sub1 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte[][][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		if (!this.aBoolean819) {
			return false;
		} else if (arg0 instanceof Class132_Sub1_Sub1) {
			@Pc(11) short local11 = ((Class132_Sub1_Sub1) arg0).aShort130;
			@Pc(15) short local15 = ((Class132_Sub1_Sub1) arg0).aShort127;
			@Pc(19) short local19 = ((Class132_Sub1_Sub1) arg0).aShort129;
			@Pc(23) short local23 = ((Class132_Sub1_Sub1) arg0).aShort128;
			for (@Pc(25) int local25 = local19; local25 <= local11; local25++) {
				for (@Pc(30) int local30 = local23; local30 <= local15; local30++) {
					if (arg0.aByte99 < this.anInt5442 * -882426473 && local25 >= this.anInt5461 * 890109843 && local25 < this.anInt5458 * -891147229 && local30 >= this.anInt5446 * 1220619219 && local30 < this.anInt5460 * 150058823) {
						if ((arg2 == null || arg0.aByte100 < arg3 || arg2[arg0.aByte100][local25][local30] != arg4) && arg0.method24295(1236877151) && !arg0.method24292(this.aClass104_11, (short) 13066)) {
							return false;
						}
						if (!arg1 && local25 >= this.anInt5440 * 1602382659 - 16 && local25 <= this.anInt5440 * 1602382659 + 16 && local30 >= this.anInt5459 * 1547517939 - 16 && local30 <= this.anInt5459 * 1547517939 + 16) {
							arg0.method24290(this.aClass104_11, -1263462301);
						}
						return true;
					}
				}
			}
			return true;
		} else {
			@Pc(144) Class472 local144 = arg0.method24220().aClass472_61;
			@Pc(153) int local153 = (int) local144.aFloat317 >> this.anInt5438 * -358186793;
			@Pc(162) int local162 = (int) local144.aFloat319 >> this.anInt5438 * -358186793;
			if (arg0.aByte99 >= this.anInt5442 * -882426473 || local153 < this.anInt5461 * 890109843 || local153 >= this.anInt5458 * -891147229 || local162 < this.anInt5446 * 1220619219 || local162 >= this.anInt5460 * 150058823) {
				return true;
			} else if ((arg2 == null || arg0.aByte100 < arg3 || arg2[arg0.aByte100][local153][local162] != arg4) && arg0.method24295(1236877151) && !arg0.method24292(this.aClass104_11, (short) 26310)) {
				return false;
			} else {
				if (!arg1 && local153 >= this.anInt5440 * 1602382659 - 16 && local153 <= this.anInt5440 * 1602382659 + 16 && local162 >= this.anInt5459 * 1547517939 - 16 && local162 <= this.anInt5459 * 1547517939 + 16) {
					arg0.method24290(this.aClass104_11, -1405666664);
				}
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!tx", name = "ft", descriptor = "(Lclient!alh;Z[[[BIB)Z", line = 1025)
	boolean method31586(@OriginalArg(0) Class132_Sub1 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte[][][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		if (!this.aBoolean819) {
			return false;
		} else if (arg0 instanceof Class132_Sub1_Sub1) {
			@Pc(11) short local11 = ((Class132_Sub1_Sub1) arg0).aShort130;
			@Pc(15) short local15 = ((Class132_Sub1_Sub1) arg0).aShort127;
			@Pc(19) short local19 = ((Class132_Sub1_Sub1) arg0).aShort129;
			@Pc(23) short local23 = ((Class132_Sub1_Sub1) arg0).aShort128;
			for (@Pc(25) int local25 = local19; local25 <= local11; local25++) {
				for (@Pc(30) int local30 = local23; local30 <= local15; local30++) {
					if (arg0.aByte99 < this.anInt5442 * -882426473 && local25 >= this.anInt5461 * 890109843 && local25 < this.anInt5458 * -891147229 && local30 >= this.anInt5446 * 1220619219 && local30 < this.anInt5460 * 150058823) {
						if ((arg2 == null || arg0.aByte100 < arg3 || arg2[arg0.aByte100][local25][local30] != arg4) && arg0.method24295(1236877151) && !arg0.method24292(this.aClass104_11, (short) 26462)) {
							return false;
						}
						if (!arg1 && local25 >= this.anInt5440 * 1602382659 - 16 && local25 <= this.anInt5440 * 1602382659 + 16 && local30 >= this.anInt5459 * 1547517939 - 16 && local30 <= this.anInt5459 * 1547517939 + 16) {
							arg0.method24290(this.aClass104_11, -782107998);
						}
						return true;
					}
				}
			}
			return true;
		} else {
			@Pc(144) Class472 local144 = arg0.method24220().aClass472_61;
			@Pc(153) int local153 = (int) local144.aFloat317 >> this.anInt5438 * -358186793;
			@Pc(162) int local162 = (int) local144.aFloat319 >> this.anInt5438 * -358186793;
			if (arg0.aByte99 >= this.anInt5442 * -882426473 || local153 < this.anInt5461 * 890109843 || local153 >= this.anInt5458 * -891147229 || local162 < this.anInt5446 * 1220619219 || local162 >= this.anInt5460 * 150058823) {
				return true;
			} else if ((arg2 == null || arg0.aByte100 < arg3 || arg2[arg0.aByte100][local153][local162] != arg4) && arg0.method24295(1236877151) && !arg0.method24292(this.aClass104_11, (short) 23729)) {
				return false;
			} else {
				if (!arg1 && local153 >= this.anInt5440 * 1602382659 - 16 && local153 <= this.anInt5440 * 1602382659 + 16 && local162 >= this.anInt5459 * 1547517939 - 16 && local162 <= this.anInt5459 * 1547517939 + 16) {
					arg0.method24290(this.aClass104_11, -274394269);
				}
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!tx", name = "fw", descriptor = "(Lclient!alh;[Lclient!akf;)V", line = 1066)
	void method31587(@OriginalArg(0) Class132_Sub1 arg0, @OriginalArg(1) Class93_Sub16[] arg1) {
		@Pc(7) int local7;
		if (this.aBoolean817) {
			local7 = arg0.method24316(arg1, (short) 32650);
			this.aClass104_11.method20844(local7, arg1);
		}
		if (this.aClass99Array3 == this.aClass99Array1) {
			@Pc(19) boolean local19 = false;
			@Pc(21) boolean local21 = false;
			@Pc(25) Class472 local25 = arg0.method24220().aClass472_61;
			@Pc(36) int local36;
			if (arg0 instanceof Class132_Sub1_Sub1) {
				local7 = ((Class132_Sub1_Sub1) arg0).aShort129;
				local36 = ((Class132_Sub1_Sub1) arg0).aShort128;
			} else {
				local7 = (int) local25.aFloat317 >> this.anInt5438 * -358186793;
				local36 = (int) local25.aFloat319 >> this.anInt5438 * -358186793;
			}
			local7 = Math.min(this.anInt5443 * -200159665 - 1, Math.max(0, local7));
			local36 = Math.min(this.anInt5444 * -1943751559 - 1, Math.max(0, local36));
			@Pc(81) Class237 local81 = new Class237();
			local81.anInt3817 = this.method31461(local7, local36, (byte) -62) * -938620053;
			local81.anInt3815 = this.method31458(local7, local36, 1980799416) * -192371369;
			local81.anInt3819 = this.method31469(local7, local36, -1270598323) * -316775901;
			local81.anInt3818 = this.method31470(local7, local36, (short) 30492) * -699093173;
			local81.anInt3820 = this.method31472(local7, local36, (byte) -26) * -913672293;
			local81.anInt3821 = this.method31474(local7, local36, (byte) 85) * 152514549;
			this.aClass104_11.method20625(this.aClass99Array2[0].method2473((int) local25.aFloat317, (int) local25.aFloat319, 640070529), local81);
		}
		@Pc(157) Class573 local157 = arg0.method24293(this.aClass104_11, -1823913839);
		if (local157 == null) {
			return;
		}
		if (local157.aBoolean815) {
			local157.aClass132_Sub1_25 = arg0;
			this.aClass569_2.method31303(local157, (byte) 0);
		} else {
			Class305.method26799(local157, (byte) 0);
		}
	}

	@OriginalMember(owner = "client!tx", name = "aa", descriptor = "(Lclient!alh;[Lclient!akf;)V", line = 1066)
	void method31588(@OriginalArg(0) Class132_Sub1 arg0, @OriginalArg(1) Class93_Sub16[] arg1) {
		@Pc(7) int local7;
		if (this.aBoolean817) {
			local7 = arg0.method24316(arg1, (short) 7000);
			this.aClass104_11.method20844(local7, arg1);
		}
		if (this.aClass99Array3 == this.aClass99Array1) {
			@Pc(19) boolean local19 = false;
			@Pc(21) boolean local21 = false;
			@Pc(25) Class472 local25 = arg0.method24220().aClass472_61;
			@Pc(36) int local36;
			if (arg0 instanceof Class132_Sub1_Sub1) {
				local7 = ((Class132_Sub1_Sub1) arg0).aShort129;
				local36 = ((Class132_Sub1_Sub1) arg0).aShort128;
			} else {
				local7 = (int) local25.aFloat317 >> this.anInt5438 * -358186793;
				local36 = (int) local25.aFloat319 >> this.anInt5438 * -358186793;
			}
			local7 = Math.min(this.anInt5443 * -200159665 - 1, Math.max(0, local7));
			local36 = Math.min(this.anInt5444 * -1943751559 - 1, Math.max(0, local36));
			@Pc(81) Class237 local81 = new Class237();
			local81.anInt3817 = this.method31461(local7, local36, (byte) -61) * -938620053;
			local81.anInt3815 = this.method31458(local7, local36, 1009737703) * -192371369;
			local81.anInt3819 = this.method31469(local7, local36, -1131757035) * -316775901;
			local81.anInt3818 = this.method31470(local7, local36, (short) 27621) * -699093173;
			local81.anInt3820 = this.method31472(local7, local36, (byte) -89) * -913672293;
			local81.anInt3821 = this.method31474(local7, local36, (byte) 41) * 152514549;
			this.aClass104_11.method20625(this.aClass99Array2[0].method2473((int) local25.aFloat317, (int) local25.aFloat319, 935518292), local81);
		}
		@Pc(157) Class573 local157 = arg0.method24293(this.aClass104_11, 845407043);
		if (local157 == null) {
			return;
		}
		if (local157.aBoolean815) {
			local157.aClass132_Sub1_25 = arg0;
			this.aClass569_2.method31303(local157, (byte) 0);
		} else {
			Class305.method26799(local157, (byte) 0);
		}
	}

	@OriginalMember(owner = "client!tx", name = "fv", descriptor = "(Lclient!alh;[Lclient!akf;)V", line = 1066)
	void method31589(@OriginalArg(0) Class132_Sub1 arg0, @OriginalArg(1) Class93_Sub16[] arg1) {
		@Pc(7) int local7;
		if (this.aBoolean817) {
			local7 = arg0.method24316(arg1, (short) 8461);
			this.aClass104_11.method20844(local7, arg1);
		}
		if (this.aClass99Array3 == this.aClass99Array1) {
			@Pc(19) boolean local19 = false;
			@Pc(21) boolean local21 = false;
			@Pc(25) Class472 local25 = arg0.method24220().aClass472_61;
			@Pc(36) int local36;
			if (arg0 instanceof Class132_Sub1_Sub1) {
				local7 = ((Class132_Sub1_Sub1) arg0).aShort129;
				local36 = ((Class132_Sub1_Sub1) arg0).aShort128;
			} else {
				local7 = (int) local25.aFloat317 >> this.anInt5438 * -358186793;
				local36 = (int) local25.aFloat319 >> this.anInt5438 * -358186793;
			}
			local7 = Math.min(this.anInt5443 * -200159665 - 1, Math.max(0, local7));
			local36 = Math.min(this.anInt5444 * -1943751559 - 1, Math.max(0, local36));
			@Pc(81) Class237 local81 = new Class237();
			local81.anInt3817 = this.method31461(local7, local36, (byte) -100) * -938620053;
			local81.anInt3815 = this.method31458(local7, local36, 1019599243) * -192371369;
			local81.anInt3819 = this.method31469(local7, local36, -762517434) * -316775901;
			local81.anInt3818 = this.method31470(local7, local36, (short) 1698) * -699093173;
			local81.anInt3820 = this.method31472(local7, local36, (byte) -26) * -913672293;
			local81.anInt3821 = this.method31474(local7, local36, (byte) 126) * 152514549;
			this.aClass104_11.method20625(this.aClass99Array2[0].method2473((int) local25.aFloat317, (int) local25.aFloat319, 601707136), local81);
		}
		@Pc(157) Class573 local157 = arg0.method24293(this.aClass104_11, -874295415);
		if (local157 == null) {
			return;
		}
		if (local157.aBoolean815) {
			local157.aClass132_Sub1_25 = arg0;
			this.aClass569_2.method31303(local157, (byte) 0);
		} else {
			Class305.method26799(local157, (byte) 0);
		}
	}

	@OriginalMember(owner = "client!tx", name = "fc", descriptor = "(Lclient!alh;[Lclient!akf;)V", line = 1066)
	void method31590(@OriginalArg(0) Class132_Sub1 arg0, @OriginalArg(1) Class93_Sub16[] arg1) {
		@Pc(7) int local7;
		if (this.aBoolean817) {
			local7 = arg0.method24316(arg1, (short) 11012);
			this.aClass104_11.method20844(local7, arg1);
		}
		if (this.aClass99Array3 == this.aClass99Array1) {
			@Pc(19) boolean local19 = false;
			@Pc(21) boolean local21 = false;
			@Pc(25) Class472 local25 = arg0.method24220().aClass472_61;
			@Pc(36) int local36;
			if (arg0 instanceof Class132_Sub1_Sub1) {
				local7 = ((Class132_Sub1_Sub1) arg0).aShort129;
				local36 = ((Class132_Sub1_Sub1) arg0).aShort128;
			} else {
				local7 = (int) local25.aFloat317 >> this.anInt5438 * -358186793;
				local36 = (int) local25.aFloat319 >> this.anInt5438 * -358186793;
			}
			local7 = Math.min(this.anInt5443 * -200159665 - 1, Math.max(0, local7));
			local36 = Math.min(this.anInt5444 * -1943751559 - 1, Math.max(0, local36));
			@Pc(81) Class237 local81 = new Class237();
			local81.anInt3817 = this.method31461(local7, local36, (byte) -35) * -938620053;
			local81.anInt3815 = this.method31458(local7, local36, 2099683589) * -192371369;
			local81.anInt3819 = this.method31469(local7, local36, -1461727435) * -316775901;
			local81.anInt3818 = this.method31470(local7, local36, (short) 17701) * -699093173;
			local81.anInt3820 = this.method31472(local7, local36, (byte) -36) * -913672293;
			local81.anInt3821 = this.method31474(local7, local36, (byte) 100) * 152514549;
			this.aClass104_11.method20625(this.aClass99Array2[0].method2473((int) local25.aFloat317, (int) local25.aFloat319, 1397841387), local81);
		}
		@Pc(157) Class573 local157 = arg0.method24293(this.aClass104_11, -1678897995);
		if (local157 == null) {
			return;
		}
		if (local157.aBoolean815) {
			local157.aClass132_Sub1_25 = arg0;
			this.aClass569_2.method31303(local157, (byte) 0);
		} else {
			Class305.method26799(local157, (byte) 0);
		}
	}

	@OriginalMember(owner = "client!tx", name = "af", descriptor = "(Lclient!ara;III[ZI)Z", line = 1104)
	public boolean method31591(@OriginalArg(0) Class93_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = false;
		if (this.aClass99Array3 != this.aClass99Array1) {
			@Pc(15) int local15 = this.aClass99Array2[arg1].method2473(arg2, arg3, 1716810943);
			for (@Pc(17) int local17 = 0; local17 <= arg1; local17++) {
				@Pc(25) Class99 local25 = this.aClass99Array2[local17];
				if (local25 != null) {
					@Pc(37) int local37 = local15 - local25.method2473(arg2, arg3, 983979917);
					if (arg4 != null) {
						arg4[local17] = local25.method2496(arg0, arg2, local37, arg3, 0, false);
						if (!arg4[local17]) {
							continue;
						}
					}
					local25.method2493(arg0, arg2, local37, arg3, 0, false);
					local1 = true;
				}
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!tx", name = "fq", descriptor = "(Lclient!ara;III[Z)Z", line = 1104)
	public boolean method31592(@OriginalArg(0) Class93_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (this.aClass99Array3 != this.aClass99Array1) {
			@Pc(15) int local15 = this.aClass99Array2[arg1].method2473(arg2, arg3, 2105614979);
			for (@Pc(17) int local17 = 0; local17 <= arg1; local17++) {
				@Pc(25) Class99 local25 = this.aClass99Array2[local17];
				if (local25 != null) {
					@Pc(37) int local37 = local15 - local25.method2473(arg2, arg3, 1522566495);
					if (arg4 != null) {
						arg4[local17] = local25.method2496(arg0, arg2, local37, arg3, 0, false);
						if (!arg4[local17]) {
							continue;
						}
					}
					local25.method2493(arg0, arg2, local37, arg3, 0, false);
					local1 = true;
				}
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!tx", name = "fa", descriptor = "(Lclient!ara;III[Z)Z", line = 1104)
	public boolean method31593(@OriginalArg(0) Class93_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (this.aClass99Array3 != this.aClass99Array1) {
			@Pc(15) int local15 = this.aClass99Array2[arg1].method2473(arg2, arg3, 947871754);
			for (@Pc(17) int local17 = 0; local17 <= arg1; local17++) {
				@Pc(25) Class99 local25 = this.aClass99Array2[local17];
				if (local25 != null) {
					@Pc(37) int local37 = local15 - local25.method2473(arg2, arg3, 855703812);
					if (arg4 != null) {
						arg4[local17] = local25.method2496(arg0, arg2, local37, arg3, 0, false);
						if (!arg4[local17]) {
							continue;
						}
					}
					local25.method2493(arg0, arg2, local37, arg3, 0, false);
					local1 = true;
				}
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!tx", name = "fp", descriptor = "(Lclient!ara;III[Z)Z", line = 1104)
	public boolean method31594(@OriginalArg(0) Class93_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (this.aClass99Array3 != this.aClass99Array1) {
			@Pc(15) int local15 = this.aClass99Array2[arg1].method2473(arg2, arg3, 271524711);
			for (@Pc(17) int local17 = 0; local17 <= arg1; local17++) {
				@Pc(25) Class99 local25 = this.aClass99Array2[local17];
				if (local25 != null) {
					@Pc(37) int local37 = local15 - local25.method2473(arg2, arg3, 1558831859);
					if (arg4 != null) {
						arg4[local17] = local25.method2496(arg0, arg2, local37, arg3, 0, false);
						if (!arg4[local17]) {
							continue;
						}
					}
					local25.method2493(arg0, arg2, local37, arg3, 0, false);
					local1 = true;
				}
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!tx", name = "ak", descriptor = "(Lclient!ara;III[ZI)V", line = 1123)
	public void method31595(@OriginalArg(0) Class93_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4, @OriginalArg(5) int arg5) {
		if (this.aClass99Array1 == this.aClass99Array3) {
			return;
		}
		@Pc(13) int local13 = this.aClass99Array2[arg1].method2473(arg2, arg3, 1401141310);
		for (@Pc(15) int local15 = 0; local15 <= arg1; local15++) {
			if (arg4 == null || arg4[local15]) {
				@Pc(30) Class99 local30 = this.aClass99Array2[local15];
				if (local30 != null) {
					local30.method2503(arg0, arg2, local13 - local30.method2473(arg2, arg3, 590593653), arg3, 0, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!tx", name = "an", descriptor = "(III)V", line = 1136)
	void method31596(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(1) Class93_Sub1_Sub4 local1 = null;
		for (@Pc(3) int local3 = arg0; local3 < arg1; local3++) {
			@Pc(11) Class99 local11 = this.aClass99Array2[local3];
			if (local11 != null) {
				for (@Pc(16) int local16 = 0; local16 < this.anInt5444 * -1943751559; local16++) {
					for (@Pc(24) int local24 = 0; local24 < this.anInt5443 * -200159665; local24++) {
						local1 = local11.method2492(local24, local16, local1);
						if (local1 != null) {
							@Pc(46) int local46 = local24 << this.anInt5438 * -358186793;
							@Pc(53) int local53 = local16 << this.anInt5438 * -358186793;
							for (@Pc(57) int local57 = local3 - 1; local57 >= 0; local57--) {
								@Pc(64) Class99 local64 = this.aClass99Array2[local57];
								if (local64 != null) {
									@Pc(79) int local79 = local11.method2480(local24, local16, -449240951) - local64.method2480(local24, local16, -1096556570);
									@Pc(95) int local95 = local11.method2480(local24 + 1, local16, -654408952) - local64.method2480(local24 + 1, local16, -1217303923);
									@Pc(115) int local115 = local11.method2480(local24 + 1, local16 + 1, -1387825793) - local64.method2480(local24 + 1, local16 + 1, -1043636689);
									@Pc(131) int local131 = local11.method2480(local24, local16 + 1, -1741694237) - local64.method2480(local24, local16 + 1, -1906586274);
									local64.method2493(local1, local46, (local79 + local95 + local115 + local131) / 4, local53, 0, false);
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tx", name = "ff", descriptor = "(II)V", line = 1136)
	void method31597(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(1) Class93_Sub1_Sub4 local1 = null;
		for (@Pc(3) int local3 = arg0; local3 < arg1; local3++) {
			@Pc(11) Class99 local11 = this.aClass99Array2[local3];
			if (local11 != null) {
				for (@Pc(16) int local16 = 0; local16 < this.anInt5444 * -1943751559; local16++) {
					for (@Pc(24) int local24 = 0; local24 < this.anInt5443 * -200159665; local24++) {
						local1 = local11.method2492(local24, local16, local1);
						if (local1 != null) {
							@Pc(46) int local46 = local24 << this.anInt5438 * -358186793;
							@Pc(53) int local53 = local16 << this.anInt5438 * -358186793;
							for (@Pc(57) int local57 = local3 - 1; local57 >= 0; local57--) {
								@Pc(64) Class99 local64 = this.aClass99Array2[local57];
								if (local64 != null) {
									@Pc(79) int local79 = local11.method2480(local24, local16, -275788059) - local64.method2480(local24, local16, -1416167975);
									@Pc(95) int local95 = local11.method2480(local24 + 1, local16, -1468546760) - local64.method2480(local24 + 1, local16, -1735165048);
									@Pc(115) int local115 = local11.method2480(local24 + 1, local16 + 1, -412679306) - local64.method2480(local24 + 1, local16 + 1, -383574492);
									@Pc(131) int local131 = local11.method2480(local24, local16 + 1, -1280889116) - local64.method2480(local24, local16 + 1, -473870306);
									local64.method2493(local1, local46, (local79 + local95 + local115 + local131) / 4, local53, 0, false);
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tx", name = "bf", descriptor = "(I)V", line = 1163)
	public void method31598(@OriginalArg(0) int arg0) {
		this.method31596(1, this.anInt5442 * -882426473, -16777216);
	}

	@OriginalMember(owner = "client!tx", name = "fl", descriptor = "()V", line = 1163)
	public void method31599() {
		this.method31596(1, this.anInt5442 * -882426473, -16777216);
	}

	@OriginalMember(owner = "client!tx", name = "bl", descriptor = "(Lclient!ul;B)V", line = 1167)
	public void method31600(@OriginalArg(0) Class597 arg0, @OriginalArg(1) byte arg1) {
		if (this.anInt5464 * 809266399 >= 65253) {
			return;
		}
		@Pc(9) Class93_Sub16 local9 = arg0.aClass93_Sub16_3;
		this.aClass597Array1[this.anInt5464 * 809266399] = arg0;
		this.aBooleanArray32[this.anInt5464 * 809266399] = false;
		this.anInt5464 += -1448456417;
		@Pc(36) int local36 = arg0.anInt5520 * -1484967795;
		if (arg0.aBoolean822) {
			local36 = 0;
		}
		@Pc(46) int local46 = arg0.anInt5520 * -1484967795;
		if (arg0.aBoolean821) {
			local46 = this.anInt5442 * -882426473 - 1;
		}
		for (@Pc(58) int local58 = local36; local58 <= local46; local58++) {
			@Pc(63) int local63 = 0;
			@Pc(81) int local81 = local9.method13524(-57371383) - local9.method13528((byte) -75) + this.anInt5447 * -996240773 >> this.anInt5438 * -358186793;
			if (local81 < 0) {
				local63 -= local81;
				local81 = 0;
			}
			@Pc(107) int local107 = local9.method13524(379255281) + local9.method13528((byte) -128) - this.anInt5447 * -996240773 >> this.anInt5438 * -358186793;
			if (local107 >= this.anInt5444 * -1943751559) {
				local107 = this.anInt5444 * -1943751559 - 1;
			}
			for (@Pc(122) int local122 = local81; local122 <= local107; local122++) {
				@Pc(131) short local131 = arg0.aShortArray142[local63++];
				@Pc(153) int local153 = (local9.method13520(-291099673) - local9.method13528((byte) -63) + this.anInt5447 * -996240773 >> this.anInt5438 * -358186793) + (local131 >>> 8);
				@Pc(161) int local161 = local153 + (local131 & 0xFF) - 1;
				if (local153 < 0) {
					local153 = 0;
				}
				if (local161 >= this.anInt5443 * -200159665) {
					local161 = this.anInt5443 * -200159665 - 1;
				}
				for (@Pc(180) int local180 = local153; local180 <= local161; local180++) {
					@Pc(192) long local192 = this.aLongArrayArrayArray1[local58][local180][local122];
					if ((local192 & 0xFFFFL) == 0L) {
						this.aLongArrayArrayArray1[local58][local180][local122] = local192 | (long) (this.anInt5464 * 809266399);
					} else if ((local192 & 0xFFFF0000L) == 0L) {
						this.aLongArrayArrayArray1[local58][local180][local122] = local192 | (long) (this.anInt5464 * 809266399) << 16;
					} else if ((local192 & 0xFFFF00000000L) == 0L) {
						this.aLongArrayArrayArray1[local58][local180][local122] = local192 | (long) (this.anInt5464 * 809266399) << 32;
					} else if ((local192 & 0xFFFF000000000000L) == 0L) {
						this.aLongArrayArrayArray1[local58][local180][local122] = local192 | (long) (this.anInt5464 * 809266399) << 48;
					}
				}
			}
		}
		if (-281517371 * arg0.anInt5507 == -1) {
			return;
		}
		@Pc(307) List local307 = (List) this.aHashMap11.get(arg0.anInt5507 * -281517371);
		if (local307 == null) {
			local307 = new ArrayList();
			this.aHashMap11.put(arg0.anInt5507 * -281517371, local307);
		}
		local307.add(arg0);
		@Pc(337) Class93_Sub16 local337 = (Class93_Sub16) this.aHashMap12.get(arg0.anInt5507 * -281517371);
		if (local337 != null) {
			arg0.aClass93_Sub16_3.method13556(local337.method13532((byte) -18), -172971053);
			arg0.aClass93_Sub16_3.method13565(local337.method13548(-341058230), local337.method13549(-1569506416), -1642269565);
			arg0.aClass93_Sub16_3.method13560(local337.method13540((byte) 56), (short) 22558);
			arg0.aClass93_Sub16_3.method13568(local337.method13552(331716133), local337.method13554(-1791319997), (byte) -66);
		}
	}

	@OriginalMember(owner = "client!tx", name = "fb", descriptor = "(Lclient!ul;)V", line = 1167)
	public void method31601(@OriginalArg(0) Class597 arg0) {
		if (this.anInt5464 * 809266399 >= 65253) {
			return;
		}
		@Pc(9) Class93_Sub16 local9 = arg0.aClass93_Sub16_3;
		this.aClass597Array1[this.anInt5464 * 809266399] = arg0;
		this.aBooleanArray32[this.anInt5464 * 809266399] = false;
		this.anInt5464 += -1448456417;
		@Pc(36) int local36 = arg0.anInt5520 * -1484967795;
		if (arg0.aBoolean822) {
			local36 = 0;
		}
		@Pc(46) int local46 = arg0.anInt5520 * -1484967795;
		if (arg0.aBoolean821) {
			local46 = this.anInt5442 * -882426473 - 1;
		}
		for (@Pc(58) int local58 = local36; local58 <= local46; local58++) {
			@Pc(63) int local63 = 0;
			@Pc(81) int local81 = local9.method13524(2068768701) - local9.method13528((byte) -61) + this.anInt5447 * -996240773 >> this.anInt5438 * -358186793;
			if (local81 < 0) {
				local63 -= local81;
				local81 = 0;
			}
			@Pc(107) int local107 = local9.method13524(-55308205) + local9.method13528((byte) -104) - this.anInt5447 * -996240773 >> this.anInt5438 * -358186793;
			if (local107 >= this.anInt5444 * -1943751559) {
				local107 = this.anInt5444 * -1943751559 - 1;
			}
			for (@Pc(122) int local122 = local81; local122 <= local107; local122++) {
				@Pc(131) short local131 = arg0.aShortArray142[local63++];
				@Pc(153) int local153 = (local9.method13520(585272670) - local9.method13528((byte) -9) + this.anInt5447 * -996240773 >> this.anInt5438 * -358186793) + (local131 >>> 8);
				@Pc(161) int local161 = local153 + (local131 & 0xFF) - 1;
				if (local153 < 0) {
					local153 = 0;
				}
				if (local161 >= this.anInt5443 * -200159665) {
					local161 = this.anInt5443 * -200159665 - 1;
				}
				for (@Pc(180) int local180 = local153; local180 <= local161; local180++) {
					@Pc(192) long local192 = this.aLongArrayArrayArray1[local58][local180][local122];
					if ((local192 & 0xFFFFL) == 0L) {
						this.aLongArrayArrayArray1[local58][local180][local122] = local192 | (long) (this.anInt5464 * 809266399);
					} else if ((local192 & 0xFFFF0000L) == 0L) {
						this.aLongArrayArrayArray1[local58][local180][local122] = local192 | (long) (this.anInt5464 * 809266399) << 16;
					} else if ((local192 & 0xFFFF00000000L) == 0L) {
						this.aLongArrayArrayArray1[local58][local180][local122] = local192 | (long) (this.anInt5464 * 809266399) << 32;
					} else if ((local192 & 0xFFFF000000000000L) == 0L) {
						this.aLongArrayArrayArray1[local58][local180][local122] = local192 | (long) (this.anInt5464 * 809266399) << 48;
					}
				}
			}
		}
		if (-281517371 * arg0.anInt5507 == -1) {
			return;
		}
		@Pc(307) List local307 = (List) this.aHashMap11.get(arg0.anInt5507 * -281517371);
		if (local307 == null) {
			local307 = new ArrayList();
			this.aHashMap11.put(arg0.anInt5507 * -281517371, local307);
		}
		local307.add(arg0);
		@Pc(337) Class93_Sub16 local337 = (Class93_Sub16) this.aHashMap12.get(arg0.anInt5507 * -281517371);
		if (local337 != null) {
			arg0.aClass93_Sub16_3.method13556(local337.method13532((byte) -5), -1637571889);
			arg0.aClass93_Sub16_3.method13565(local337.method13548(1454345107), local337.method13549(-1569506416), -1552989502);
			arg0.aClass93_Sub16_3.method13560(local337.method13540((byte) 35), (short) 15172);
			arg0.aClass93_Sub16_3.method13568(local337.method13552(-1864677143), local337.method13554(-340374874), (byte) -33);
		}
	}

	@OriginalMember(owner = "client!tx", name = "bk", descriptor = "(I)V", line = 1220)
	public void method31602(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5464 * 809266399; local1++) {
			if (!this.aBooleanArray32[local1]) {
				@Pc(17) Class597 local17 = this.aClass597Array1[local1];
				@Pc(20) Class93_Sub16 local20 = local17.aClass93_Sub16_3;
				@Pc(25) int local25 = local17.anInt5520 * -1484967795;
				@Pc(34) int local34 = local20.method13528((byte) -23) - this.anInt5447 * -996240773;
				@Pc(45) int local45 = (local34 * 2 >> this.anInt5438 * -358186793) + 1;
				@Pc(47) int local47 = 0;
				@Pc(52) int[] local52 = new int[local45 * local45];
				@Pc(63) int local63 = local20.method13520(1682707676) - local34 >> this.anInt5438 * -358186793;
				@Pc(74) int local74 = local20.method13524(676169646) - local34 >> this.anInt5438 * -358186793;
				@Pc(85) int local85 = local20.method13524(36215176) + local34 >> this.anInt5438 * -358186793;
				if (local74 < 0) {
					local47 -= local74;
					local74 = 0;
				}
				if (local85 >= this.anInt5444 * -1943751559) {
					local85 = this.anInt5444 * -1943751559 - 1;
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
					if (local140 >= this.anInt5443 * -200159665) {
						local140 = this.anInt5443 * -200159665 - 1;
					}
					for (@Pc(163) int local163 = local132; local163 <= local140; local163++) {
						@Pc(168) byte local168 = 1;
						@Pc(176) Class132_Sub1_Sub1 local176 = this.method31551(local25, local163, local108, null, (byte) 3);
						if (local176 != null && local176.aByte101 != 0) {
							@Pc(196) boolean local196;
							@Pc(205) boolean local205;
							@Pc(219) short local219;
							@Pc(225) int local225;
							@Pc(231) int local231;
							if (local176.aByte101 == 1) {
								local196 = local163 - 1 >= local132;
								local205 = local163 + 1 <= local140;
								if (!local196 && local108 + 1 <= local85) {
									local219 = local17.aShortArray142[local47 + 1];
									local225 = local63 + (local219 >>> 8);
									local231 = (local219 & 0xFF) + local225;
									local196 = local163 > local225 && local163 < local231;
								}
								if (!local205 && local108 - 1 >= local74) {
									local219 = local17.aShortArray142[local47 - 1];
									local225 = (local219 >>> 8) + local63;
									local231 = local225 + (local219 & 0xFF);
									local205 = local163 > local225 && local163 < local231;
								}
								if (local196 && !local205) {
									local168 = 4;
								} else if (local205 && !local196) {
									local168 = 2;
								}
							} else {
								local196 = local163 - 1 >= local132;
								local205 = local163 + 1 <= local140;
								if (!local196 && local108 - 1 >= local74) {
									local219 = local17.aShortArray142[local47 - 1];
									local225 = (local219 >>> 8) + local63;
									local231 = local225 + (local219 & 0xFF);
									local196 = local163 > local225 && local163 < local231;
								}
								if (!local205 && local108 + 1 <= local85) {
									local219 = local17.aShortArray142[local47 + 1];
									local225 = (local219 >>> 8) + local63;
									local231 = local225 + (local219 & 0xFF);
									local205 = local163 > local225 && local163 < local231;
								}
								if (local196 && !local205) {
									local168 = 3;
								} else if (local205 && !local196) {
									local168 = 5;
								}
							}
						}
						local52[local126++] = local168;
					}
					local47++;
				}
				this.aBooleanArray32[local1] = true;
				if (aBoolean818) {
					this.aClass99Array1[local25].method2508(local20, local52);
				}
			}
		}
	}

	@OriginalMember(owner = "client!tx", name = "fo", descriptor = "()V", line = 1220)
	public void method31603() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5464 * 809266399; local1++) {
			if (!this.aBooleanArray32[local1]) {
				@Pc(17) Class597 local17 = this.aClass597Array1[local1];
				@Pc(20) Class93_Sub16 local20 = local17.aClass93_Sub16_3;
				@Pc(25) int local25 = local17.anInt5520 * -1484967795;
				@Pc(34) int local34 = local20.method13528((byte) -89) - this.anInt5447 * -996240773;
				@Pc(45) int local45 = (local34 * 2 >> this.anInt5438 * -358186793) + 1;
				@Pc(47) int local47 = 0;
				@Pc(52) int[] local52 = new int[local45 * local45];
				@Pc(63) int local63 = local20.method13520(-1298198508) - local34 >> this.anInt5438 * -358186793;
				@Pc(74) int local74 = local20.method13524(1909174350) - local34 >> this.anInt5438 * -358186793;
				@Pc(85) int local85 = local20.method13524(1328824238) + local34 >> this.anInt5438 * -358186793;
				if (local74 < 0) {
					local47 -= local74;
					local74 = 0;
				}
				if (local85 >= this.anInt5444 * -1943751559) {
					local85 = this.anInt5444 * -1943751559 - 1;
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
					if (local140 >= this.anInt5443 * -200159665) {
						local140 = this.anInt5443 * -200159665 - 1;
					}
					for (@Pc(163) int local163 = local132; local163 <= local140; local163++) {
						@Pc(168) byte local168 = 1;
						@Pc(176) Class132_Sub1_Sub1 local176 = this.method31551(local25, local163, local108, null, (byte) 3);
						if (local176 != null && local176.aByte101 != 0) {
							@Pc(196) boolean local196;
							@Pc(205) boolean local205;
							@Pc(219) short local219;
							@Pc(225) int local225;
							@Pc(231) int local231;
							if (local176.aByte101 == 1) {
								local196 = local163 - 1 >= local132;
								local205 = local163 + 1 <= local140;
								if (!local196 && local108 + 1 <= local85) {
									local219 = local17.aShortArray142[local47 + 1];
									local225 = local63 + (local219 >>> 8);
									local231 = (local219 & 0xFF) + local225;
									local196 = local163 > local225 && local163 < local231;
								}
								if (!local205 && local108 - 1 >= local74) {
									local219 = local17.aShortArray142[local47 - 1];
									local225 = (local219 >>> 8) + local63;
									local231 = local225 + (local219 & 0xFF);
									local205 = local163 > local225 && local163 < local231;
								}
								if (local196 && !local205) {
									local168 = 4;
								} else if (local205 && !local196) {
									local168 = 2;
								}
							} else {
								local196 = local163 - 1 >= local132;
								local205 = local163 + 1 <= local140;
								if (!local196 && local108 - 1 >= local74) {
									local219 = local17.aShortArray142[local47 - 1];
									local225 = (local219 >>> 8) + local63;
									local231 = local225 + (local219 & 0xFF);
									local196 = local163 > local225 && local163 < local231;
								}
								if (!local205 && local108 + 1 <= local85) {
									local219 = local17.aShortArray142[local47 + 1];
									local225 = (local219 >>> 8) + local63;
									local231 = local225 + (local219 & 0xFF);
									local205 = local163 > local225 && local163 < local231;
								}
								if (local196 && !local205) {
									local168 = 3;
								} else if (local205 && !local196) {
									local168 = 5;
								}
							}
						}
						local52[local126++] = local168;
					}
					local47++;
				}
				this.aBooleanArray32[local1] = true;
				if (aBoolean818) {
					this.aClass99Array1[local25].method2508(local20, local52);
				}
			}
		}
	}

	@OriginalMember(owner = "client!tx", name = "bh", descriptor = "(IIII)V", line = 1310)
	public void method31604(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) List local6 = (List) this.aHashMap11.get(arg0);
		if (local6 == null) {
			return;
		}
		@Pc(12) Iterator local12 = local6.iterator();
		while (local12.hasNext()) {
			@Pc(19) Class597 local19 = (Class597) local12.next();
			local19.aClass93_Sub16_3.method13565(arg1, arg2, -2058309471);
		}
	}

	@OriginalMember(owner = "client!tx", name = "bx", descriptor = "(IIIB)V", line = 1323)
	public void method31605(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		@Pc(6) List local6 = (List) this.aHashMap11.get(arg0);
		if (local6 == null) {
			return;
		}
		@Pc(18) float local18 = arg1 < 0 ? -1.0F : (float) arg1 / 100.0F;
		@Pc(21) Iterator local21 = local6.iterator();
		while (local21.hasNext()) {
			@Pc(28) Class597 local28 = (Class597) local21.next();
			local28.aClass93_Sub16_3.method13568(local18, arg2, (byte) -67);
		}
	}

	@OriginalMember(owner = "client!tx", name = "bd", descriptor = "(I)Ljava/util/HashMap;", line = 1337)
	public HashMap method31606(@OriginalArg(0) int arg0) {
		this.aHashMap12.clear();
		@Pc(7) Iterator local7 = this.aHashMap11.entrySet().iterator();
		while (local7.hasNext()) {
			@Pc(14) Entry local14 = (Entry) local7.next();
			this.aHashMap12.put(local14.getKey(), ((Class597) ((List) local14.getValue()).get(0)).aClass93_Sub16_3);
		}
		return this.aHashMap12;
	}

	@OriginalMember(owner = "client!tx", name = "fy", descriptor = "()Ljava/util/HashMap;", line = 1337)
	public HashMap method31607() {
		this.aHashMap12.clear();
		@Pc(7) Iterator local7 = this.aHashMap11.entrySet().iterator();
		while (local7.hasNext()) {
			@Pc(14) Entry local14 = (Entry) local7.next();
			this.aHashMap12.put(local14.getKey(), ((Class597) ((List) local14.getValue()).get(0)).aClass93_Sub16_3);
		}
		return this.aHashMap12;
	}

	@OriginalMember(owner = "client!tx", name = "fe", descriptor = "()Ljava/util/HashMap;", line = 1337)
	public HashMap method31608() {
		this.aHashMap12.clear();
		@Pc(7) Iterator local7 = this.aHashMap11.entrySet().iterator();
		while (local7.hasNext()) {
			@Pc(14) Entry local14 = (Entry) local7.next();
			this.aHashMap12.put(local14.getKey(), ((Class597) ((List) local14.getValue()).get(0)).aClass93_Sub16_3);
		}
		return this.aHashMap12;
	}

	@OriginalMember(owner = "client!tx", name = "bc", descriptor = "(Ljava/util/HashMap;B)V", line = 1348)
	public void method31609(@OriginalArg(0) HashMap arg0, @OriginalArg(1) byte arg1) {
		this.aHashMap12 = arg0;
	}

	@OriginalMember(owner = "client!tx", name = "fh", descriptor = "(Ljava/util/HashMap;)V", line = 1348)
	public void method31610(@OriginalArg(0) HashMap arg0) {
		this.aHashMap12 = arg0;
	}

	@OriginalMember(owner = "client!tx", name = "fr", descriptor = "(Ljava/util/HashMap;)V", line = 1348)
	public void method31611(@OriginalArg(0) HashMap arg0) {
		this.aHashMap12 = arg0;
	}

	@OriginalMember(owner = "client!tx", name = "fk", descriptor = "(Ljava/util/HashMap;)V", line = 1348)
	public void method31612(@OriginalArg(0) HashMap arg0) {
		this.aHashMap12 = arg0;
	}

	@OriginalMember(owner = "client!tx", name = "hh", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;I)V", line = 6332)
	static final void method31613(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) int arg3) {
		arg0.anInt4001 = -686010398;
		arg0.aClass331_2 = null;
		arg0.anInt4037 = arg2.anIntArray519[(arg2.anInt5891 -= 1189701933) * -1497248091] * 971360853;
		if (arg0.anInt3970 * 532402067 == -1 && !arg1.aBoolean708) {
			Class124_Sub3_Sub1.method19766(arg0.anInt3953 * -1549590237, 256284111);
		}
	}
}
