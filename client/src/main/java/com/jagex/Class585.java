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
public final class Class585 {

	@OriginalMember(owner = "client!tx", name = "bl", descriptor = "I")
	static final int anInt5624 = 4;

	@OriginalMember(owner = "client!tx", name = "e", descriptor = "Z")
	public static boolean aBoolean827 = true;

	@OriginalMember(owner = "client!tx", name = "au", descriptor = "I")
	int anInt5601;

	@OriginalMember(owner = "client!tx", name = "o", descriptor = "[Lclient!cb;")
	public Class99[] aClass99Array1;

	@OriginalMember(owner = "client!tx", name = "aa", descriptor = "I")
	int anInt5607;

	@OriginalMember(owner = "client!tx", name = "bb", descriptor = "[[Z")
	boolean[][] aBooleanArrayArray12;

	@OriginalMember(owner = "client!tx", name = "v", descriptor = "[[[Lclient!tk;")
	public Class572[][][] aClass572ArrayArrayArray3;

	@OriginalMember(owner = "client!tx", name = "ap", descriptor = "I")
	int anInt5612;

	@OriginalMember(owner = "client!tx", name = "aq", descriptor = "I")
	int anInt5613;

	@OriginalMember(owner = "client!tx", name = "ax", descriptor = "I")
	int anInt5614;

	@OriginalMember(owner = "client!tx", name = "av", descriptor = "I")
	int anInt5615;

	@OriginalMember(owner = "client!tx", name = "aj", descriptor = "I")
	int anInt5617;

	@OriginalMember(owner = "client!tx", name = "ay", descriptor = "I")
	int anInt5618;

	@OriginalMember(owner = "client!tx", name = "az", descriptor = "I")
	int anInt5619;

	@OriginalMember(owner = "client!tx", name = "ar", descriptor = "I")
	int anInt5620;

	@OriginalMember(owner = "client!tx", name = "af", descriptor = "I")
	int anInt5621;

	@OriginalMember(owner = "client!tx", name = "ab", descriptor = "I")
	int anInt5622;

	@OriginalMember(owner = "client!tx", name = "z", descriptor = "Z")
	boolean aBoolean828;

	@OriginalMember(owner = "client!tx", name = "f", descriptor = "I")
	final int anInt5602 = 16;

	@OriginalMember(owner = "client!tx", name = "t", descriptor = "I")
	int anInt5626 = 0;

	@OriginalMember(owner = "client!tx", name = "ae", descriptor = "I")
	final int anInt5609 = 10078;

	@OriginalMember(owner = "client!tx", name = "ag", descriptor = "I")
	final int anInt5598 = 5096;

	@OriginalMember(owner = "client!tx", name = "ah", descriptor = "I")
	final int anInt5611 = 5005;

	@OriginalMember(owner = "client!tx", name = "ak", descriptor = "[F")
	final float[] aFloatArray118 = new float[3];

	@OriginalMember(owner = "client!tx", name = "an", descriptor = "[Lclient!akf;")
	final Class93_Sub16[] aClass93_Sub16Array23 = new Class93_Sub16[8];

	@OriginalMember(owner = "client!tx", name = "bf", descriptor = "I")
	final int anInt5623 = 65253;

	@OriginalMember(owner = "client!tx", name = "bc", descriptor = "Ljava/util/HashMap;")
	HashMap aHashMap11 = new HashMap();

	@OriginalMember(owner = "client!tx", name = "bi", descriptor = "Ljava/util/HashMap;")
	HashMap aHashMap12 = new HashMap();

	@OriginalMember(owner = "client!tx", name = "w", descriptor = "Lclient!dh;")
	final Class104 aClass104_11;

	@OriginalMember(owner = "client!tx", name = "u", descriptor = "Z")
	final boolean aBoolean826;

	@OriginalMember(owner = "client!tx", name = "n", descriptor = "I")
	public final int anInt5599;

	@OriginalMember(owner = "client!tx", name = "m", descriptor = "I")
	final int anInt5600;

	@OriginalMember(owner = "client!tx", name = "k", descriptor = "I")
	final int anInt5608;

	@OriginalMember(owner = "client!tx", name = "d", descriptor = "I")
	public int anInt5603;

	@OriginalMember(owner = "client!tx", name = "c", descriptor = "I")
	public final int anInt5604;

	@OriginalMember(owner = "client!tx", name = "r", descriptor = "I")
	public final int anInt5605;

	@OriginalMember(owner = "client!tx", name = "ao", descriptor = "I")
	int anInt5616;

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
	int anInt5625;

	@OriginalMember(owner = "client!tx", name = "al", descriptor = "[Lclient!alh;")
	final Class132_Sub1[] aClass132_Sub1Array1;

	@OriginalMember(owner = "client!tx", name = "ac", descriptor = "[Lclient!alh;")
	final Class132_Sub1[] aClass132_Sub1Array2;

	@OriginalMember(owner = "client!tx", name = "ai", descriptor = "[Lclient!alh;")
	final Class132_Sub1[] aClass132_Sub1Array5;

	@OriginalMember(owner = "client!tx", name = "ad", descriptor = "[Lclient!alh;")
	final Class132_Sub1[] aClass132_Sub1Array4;

	@OriginalMember(owner = "client!tx", name = "aw", descriptor = "I")
	int anInt5610;

	@OriginalMember(owner = "client!tx", name = "at", descriptor = "[Lclient!alh;")
	final Class132_Sub1[] aClass132_Sub1Array3;

	@OriginalMember(owner = "client!tx", name = "as", descriptor = "I")
	int anInt5606;

	@OriginalMember(owner = "client!tx", name = "am", descriptor = "[Lclient!ash;")
	final Class132_Sub1_Sub1[] aClass132_Sub1_Sub1Array1;

	@OriginalMember(owner = "client!tx", name = "bm", descriptor = "[[Z")
	boolean[][] aBooleanArrayArray14;

	@OriginalMember(owner = "client!tx", name = "bt", descriptor = "[[Z")
	boolean[][] aBooleanArrayArray13;

	@OriginalMember(owner = "client!tx", name = "bq", descriptor = "[I")
	final int[] anIntArray476;

	@OriginalMember(owner = "client!tx", name = "bn", descriptor = "Lclient!tg;")
	public Class569 aClass569_2;

	@OriginalMember(owner = "client!tx", name = "w", descriptor = "(ZI)V")
	public static void method31792(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!tx", name = "i", descriptor = "(Lclient!yf;B)V")
	static void method31793(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray521[arg0.anInt6052 * -1497248091 - 1] = ((Class347) Class288.aClass55_Sub2_1.method18273(arg0.anIntArray521[arg0.anInt6052 * -1497248091 - 1], 321826192)).method27677(Class624.aClass120_1, 1317834618) ? 1 : 0;
	}

	@OriginalMember(owner = "client!tx", name = "hh", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;I)V")
	static void method31794(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) int arg3) {
		arg0.anInt4042 = -686010398;
		arg0.aClass331_2 = null;
		arg0.anInt4078 = arg2.anIntArray521[(arg2.anInt6052 -= 1189701933) * -1497248091] * 971360853;
		if (arg0.anInt4011 * 532402067 == -1 && !arg1.aBoolean712) {
			Class124_Sub3_Sub1.method19778(arg0.anInt3994 * -1549590237, 256284111);
		}
	}

	@OriginalMember(owner = "client!tx", name = "<init>", descriptor = "(Lclient!dh;IIIIIZZ)V")
	public Class585(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7) {
		this.aClass104_11 = arg0;
		this.aBoolean826 = this.aClass104_11.method20425() > 0;
		this.anInt5599 = arg1 * 242119399;
		this.anInt5600 = (0x1 << this.anInt5599 * -358186793) * 1712305857;
		this.anInt5608 = (this.anInt5600 * -77997759 >> 1) * -1329300301;
		this.anInt5603 = arg2 * 1454838311;
		this.anInt5604 = arg3 * -1515812689;
		this.anInt5605 = arg4 * 193689033;
		this.anInt5616 = arg5 * -255589973;
		this.aClass59_1 = new Class59();
		this.aClass598_2 = new Class598(this);
		this.aClass572ArrayArrayArray1 = new Class572[arg2][this.anInt5604 * -200159665][this.anInt5605 * -1943751559];
		this.aClass99Array2 = new Class99[arg2];
		if (arg6) {
			this.anIntArrayArray62 = new int[this.anInt5604 * -200159665][this.anInt5605 * -1943751559];
			this.aByteArrayArray24 = new byte[this.anInt5604 * -200159665][this.anInt5605 * -1943751559];
			this.aShortArrayArray5 = new short[this.anInt5604 * -200159665][this.anInt5605 * -1943751559];
			this.aByteArrayArray23 = new byte[this.anInt5604 * -200159665][this.anInt5605 * -1943751559];
			this.aByteArrayArray25 = new byte[this.anInt5604 * -200159665][this.anInt5605 * -1943751559];
			this.aByteArrayArray22 = new byte[this.anInt5604 * -200159665][this.anInt5605 * -1943751559];
			this.aClass572ArrayArrayArray2 = new Class572[1][this.anInt5604 * -200159665][this.anInt5605 * -1943751559];
			this.aClass99Array3 = new Class99[1];
		}
		if (arg7) {
			this.aLongArrayArrayArray1 = new long[arg2][arg3][arg4];
			this.aClass597Array1 = new Class597[65253];
			this.aBooleanArray32 = new boolean[65253];
			this.anInt5625 = 0;
		}
		this.method31613(false, 870300168);
		this.aClass132_Sub1Array1 = new Class132_Sub1[2];
		this.aClass132_Sub1Array2 = new Class132_Sub1[2];
		this.aClass132_Sub1Array5 = new Class132_Sub1[2];
		this.aClass132_Sub1Array4 = new Class132_Sub1[10078];
		this.anInt5610 = 0;
		this.aClass132_Sub1Array3 = new Class132_Sub1[5096];
		this.anInt5606 = 0;
		this.aClass132_Sub1_Sub1Array1 = new Class132_Sub1_Sub1[5005];
		this.anInt5626 = 0;
		this.aBooleanArrayArray14 = new boolean[this.anInt5616 * -93916925 + this.anInt5616 * -93916925 + 1][this.anInt5616 * -93916925 + 1 + this.anInt5616 * -93916925];
		this.aBooleanArrayArray13 = new boolean[this.anInt5616 * -93916925 + this.anInt5616 * -93916925 + 2][this.anInt5616 * -93916925 + this.anInt5616 * -93916925 + 2];
		this.anIntArray476 = new int[this.anInt5616 * -93916925 + this.anInt5616 * -93916925 + 2];
		this.aClass569_2 = new Class569(false);
	}

	@OriginalMember(owner = "client!tx", name = "bb", descriptor = "(Z)V")
	public void method31610(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.aClass572ArrayArrayArray3 = this.aClass572ArrayArrayArray2;
			this.aClass99Array1 = this.aClass99Array3;
		} else {
			this.aClass572ArrayArrayArray3 = this.aClass572ArrayArrayArray1;
			this.aClass99Array1 = this.aClass99Array2;
		}
		this.anInt5603 = this.aClass572ArrayArrayArray3.length * 1454838311;
	}

	@OriginalMember(owner = "client!tx", name = "e", descriptor = "(IB)V")
	public void method31611(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
	}

	@OriginalMember(owner = "client!tx", name = "eh", descriptor = "(III)Lclient!uc;")
	public Class590 method31612(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass590_1;
	}

	@OriginalMember(owner = "client!tx", name = "m", descriptor = "(ZI)V")
	public void method31613(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		if (arg0) {
			this.aClass572ArrayArrayArray3 = this.aClass572ArrayArrayArray2;
			this.aClass99Array1 = this.aClass99Array3;
		} else {
			this.aClass572ArrayArrayArray3 = this.aClass572ArrayArrayArray1;
			this.aClass99Array1 = this.aClass99Array2;
		}
		this.anInt5603 = this.aClass572ArrayArrayArray3.length * 1454838311;
	}

	@OriginalMember(owner = "client!tx", name = "dm", descriptor = "(III)Lclient!asw;")
	public Class132_Sub1_Sub2 method31614(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		if (local8 != null) {
			this.method31642(local8.aClass132_Sub1_Sub2_2, (byte) 94);
			if (local8.aClass132_Sub1_Sub2_2 != null) {
				@Pc(22) Class132_Sub1_Sub2 local22 = local8.aClass132_Sub1_Sub2_2;
				local8.aClass132_Sub1_Sub2_2 = null;
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!tx", name = "f", descriptor = "(III)V")
	public void method31615(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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

	@OriginalMember(owner = "client!tx", name = "w", descriptor = "(IIIB)Lclient!tk;")
	Class572 method31616(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		if (this.aClass572ArrayArrayArray3[arg0][arg1][arg2] == null) {
			@Pc(32) boolean local32 = this.aClass572ArrayArrayArray3[0][arg1][arg2] != null && this.aClass572ArrayArrayArray3[0][arg1][arg2].aClass572_1 != null;
			if (local32 && arg0 >= this.anInt5603 * -882426473 - 1) {
				return null;
			}
			this.method31761(arg0, arg1, arg2, -1879511558);
		}
		return this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
	}

	@OriginalMember(owner = "client!tx", name = "l", descriptor = "(IIIB)Lclient!tk;")
	Class572 method31617(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		return this.method31616(arg0, Math.min(this.anInt5604 * -200159665 - 1, Math.max(0, arg1)), Math.min(this.anInt5605 * -1943751559 - 1, Math.max(0, arg2)), (byte) -99);
	}

	@OriginalMember(owner = "client!tx", name = "ac", descriptor = "(Lclient!ash;ZI)V")
	void method31618(@OriginalArg(0) Class132_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(11) int local11 = Math.min(this.anInt5604 * -200159665 - 1, Math.max(0, arg0.aShort129));
		@Pc(23) int local23 = Math.min(this.anInt5604 * -200159665 - 1, Math.max(0, arg0.aShort130));
		@Pc(35) int local35 = Math.min(this.anInt5605 * -1943751559 - 1, Math.max(0, arg0.aShort128));
		@Pc(47) int local47 = Math.min(this.anInt5605 * -1943751559 - 1, Math.max(0, arg0.aShort127));
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
							local72.method31869((byte) -80);
							break;
						}
						local74 = local72;
						local72 = local72.aClass590_2;
					}
				}
			}
		}
		if (!arg1) {
			this.method31642(arg0, (byte) 43);
		}
	}

	@OriginalMember(owner = "client!tx", name = "z", descriptor = "(ILclient!cb;I)V")
	public void method31619(@OriginalArg(0) int arg0, @OriginalArg(1) Class99 arg1, @OriginalArg(2) int arg2) {
		this.aClass99Array1[arg0] = arg1;
	}

	@OriginalMember(owner = "client!tx", name = "p", descriptor = "(III)I")
	public int method31620(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return this.aShortArrayArray5 == null ? 0 : this.aShortArrayArray5[arg0][arg1] & 0xFFFF;
	}

	@OriginalMember(owner = "client!tx", name = "aw", descriptor = "(IIII)Lclient!asw;")
	public Class132_Sub1_Sub2 method31621(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass132_Sub1_Sub2_1;
	}

	@OriginalMember(owner = "client!tx", name = "al", descriptor = "(IIILclient!td;I)Lclient!ash;")
	public Class132_Sub1_Sub1 method31622(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Interface62 arg3, @OriginalArg(4) int arg4) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		if (local8 == null) {
			return null;
		}
		for (@Pc(16) Class590 local16 = local8.aClass590_1; local16 != null; local16 = local16.aClass590_2) {
			@Pc(22) Class132_Sub1_Sub1 local22 = local16.aClass132_Sub1_Sub1_1;
			if ((arg3 == null || arg3.method31548(local22, 921666270)) && local22.aShort129 == arg1 && arg2 == local22.aShort128) {
				this.method31618(local22, false, 964029282);
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!tx", name = "r", descriptor = "(IIS)I")
	public int method31623(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) short arg2) {
		return this.aByteArrayArray23 == null ? 0 : this.aByteArrayArray23[arg0][arg1] & 0xFF;
	}

	@OriginalMember(owner = "client!tx", name = "bm", descriptor = "(Z)V")
	public void method31624(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.aClass572ArrayArrayArray3 = this.aClass572ArrayArrayArray2;
			this.aClass99Array1 = this.aClass99Array3;
		} else {
			this.aClass572ArrayArrayArray3 = this.aClass572ArrayArrayArray1;
			this.aClass99Array1 = this.aClass99Array2;
		}
		this.anInt5603 = this.aClass572ArrayArrayArray3.length * 1454838311;
	}

	@OriginalMember(owner = "client!tx", name = "o", descriptor = "(IIB)I")
	public int method31625(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		return this.aByteArrayArray22 == null ? 0 : this.aByteArrayArray22[arg0][arg1] & 0xFF;
	}

	@OriginalMember(owner = "client!tx", name = "s", descriptor = "(IIIIIIIII)V")
	public void method31626(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!tx", name = "y", descriptor = "(IIILclient!asv;B)V")
	public void method31627(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class132_Sub1_Sub4 arg3, @OriginalArg(4) byte arg4) {
		@Pc(6) Class572 local6 = this.method31616(arg0, arg1, arg2, (byte) -20);
		if (local6 == null) {
			return;
		}
		local6.aClass132_Sub1_Sub4_1 = arg3;
		@Pc(20) int local20 = this.aClass99Array3 == this.aClass99Array1 ? 1 : 0;
		if (!arg3.method24274((byte) 6)) {
			arg3.aClass132_Sub1_23 = this.aClass132_Sub1Array5[local20];
			this.aClass132_Sub1Array5[local20] = arg3;
		} else if (arg3.method24275((short) -896)) {
			arg3.aClass132_Sub1_23 = this.aClass132_Sub1Array2[local20];
			this.aClass132_Sub1Array2[local20] = arg3;
		} else {
			arg3.aClass132_Sub1_23 = this.aClass132_Sub1Array1[local20];
			this.aClass132_Sub1Array1[local20] = arg3;
		}
	}

	@OriginalMember(owner = "client!tx", name = "q", descriptor = "(IIIILclient!ast;S)V")
	public void method31628(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class132_Sub1_Sub5 arg4, @OriginalArg(5) short arg5) {
		@Pc(6) Class572 local6 = this.method31616(arg0, arg1, arg2, (byte) -57);
		if (local6 == null) {
			return;
		}
		arg4.method24236(new Class472((float) (this.anInt5608 * -996240773 + (arg1 << this.anInt5599 * -358186793)), (float) arg3, (float) ((arg2 << this.anInt5599 * -358186793) + this.anInt5608 * -996240773)));
		local6.aClass132_Sub1_Sub5_1 = arg4;
		@Pc(51) int local51 = this.aClass99Array3 == this.aClass99Array1 ? 1 : 0;
		if (!arg4.method24274((byte) 6)) {
			arg4.aClass132_Sub1_23 = this.aClass132_Sub1Array5[local51];
			this.aClass132_Sub1Array5[local51] = arg4;
		} else if (arg4.method24275((short) -9741)) {
			arg4.aClass132_Sub1_23 = this.aClass132_Sub1Array2[local51];
			this.aClass132_Sub1Array2[local51] = arg4;
		} else {
			arg4.aClass132_Sub1_23 = this.aClass132_Sub1Array1[local51];
			this.aClass132_Sub1Array1[local51] = arg4;
		}
	}

	@OriginalMember(owner = "client!tx", name = "x", descriptor = "(IIILclient!asw;Lclient!asw;I)V")
	public void method31629(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class132_Sub1_Sub2 arg3, @OriginalArg(4) Class132_Sub1_Sub2 arg4, @OriginalArg(5) int arg5) {
		@Pc(6) Class572 local6 = this.method31616(arg0, arg1, arg2, (byte) 88);
		if (local6 == null) {
			return;
		}
		local6.aClass132_Sub1_Sub2_1 = arg3;
		local6.aClass132_Sub1_Sub2_2 = arg4;
		@Pc(23) int local23 = this.aClass99Array1 == this.aClass99Array3 ? 1 : 0;
		if (!arg3.method24274((byte) 6)) {
			arg3.aClass132_Sub1_23 = this.aClass132_Sub1Array5[local23];
			this.aClass132_Sub1Array5[local23] = arg3;
		} else if (arg3.method24275((short) -10472)) {
			arg3.aClass132_Sub1_23 = this.aClass132_Sub1Array2[local23];
			this.aClass132_Sub1Array2[local23] = arg3;
		} else {
			arg3.aClass132_Sub1_23 = this.aClass132_Sub1Array1[local23];
			this.aClass132_Sub1Array1[local23] = arg3;
		}
		if (arg4 == null) {
			return;
		}
		if (!arg4.method24274((byte) 6)) {
			arg4.aClass132_Sub1_23 = this.aClass132_Sub1Array5[local23];
			this.aClass132_Sub1Array5[local23] = arg4;
		} else if (arg4.method24275((short) -16121)) {
			arg4.aClass132_Sub1_23 = this.aClass132_Sub1Array2[local23];
			this.aClass132_Sub1Array2[local23] = arg4;
		} else {
			arg4.aClass132_Sub1_23 = this.aClass132_Sub1Array1[local23];
			this.aClass132_Sub1Array1[local23] = arg4;
		}
	}

	@OriginalMember(owner = "client!tx", name = "db", descriptor = "(IIILclient!td;)Lclient!ash;")
	public Class132_Sub1_Sub1 method31630(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Interface62 arg3) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		if (local8 == null) {
			return null;
		}
		for (@Pc(16) Class590 local16 = local8.aClass590_1; local16 != null; local16 = local16.aClass590_2) {
			@Pc(22) Class132_Sub1_Sub1 local22 = local16.aClass132_Sub1_Sub1_1;
			if ((arg3 == null || arg3.method31548(local22, 964368435)) && local22.aShort129 == arg1 && arg2 == local22.aShort128) {
				this.method31618(local22, false, 964029282);
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!tx", name = "bv", descriptor = "(III)Lclient!tk;")
	Class572 method31631(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return this.method31616(arg0, Math.min(this.anInt5604 * -200159665 - 1, Math.max(0, arg1)), Math.min(this.anInt5605 * -1943751559 - 1, Math.max(0, arg2)), (byte) -5);
	}

	@OriginalMember(owner = "client!tx", name = "es", descriptor = "(III)Lclient!asw;")
	public Class132_Sub1_Sub2 method31632(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass132_Sub1_Sub2_2;
	}

	@OriginalMember(owner = "client!tx", name = "g", descriptor = "(I)V")
	public void method31633(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5626 * -1409302901; local1++) {
			@Pc(12) Class132_Sub1_Sub1 local12 = this.aClass132_Sub1_Sub1Array1[local1];
			this.method31618(local12, true, 964029282);
			this.aClass132_Sub1_Sub1Array1[local1] = null;
		}
		this.anInt5626 = 0;
	}

	@OriginalMember(owner = "client!tx", name = "i", descriptor = "(IIIB)Lclient!asw;")
	public Class132_Sub1_Sub2 method31634(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		if (local8 != null) {
			this.method31642(local8.aClass132_Sub1_Sub2_1, (byte) 47);
			if (local8.aClass132_Sub1_Sub2_1 != null) {
				@Pc(22) Class132_Sub1_Sub2 local22 = local8.aClass132_Sub1_Sub2_1;
				local8.aClass132_Sub1_Sub2_1 = null;
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!tx", name = "ed", descriptor = "(III)Lclient!asw;")
	public Class132_Sub1_Sub2 method31635(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass132_Sub1_Sub2_1;
	}

	@OriginalMember(owner = "client!tx", name = "t", descriptor = "(IIII)Lclient!asm;")
	public Class132_Sub1_Sub3 method31636(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		if (local8 != null) {
			this.method31642(local8.aClass132_Sub1_Sub3_1, (byte) 113);
			if (local8.aClass132_Sub1_Sub3_1 != null) {
				@Pc(22) Class132_Sub1_Sub3 local22 = local8.aClass132_Sub1_Sub3_1;
				local8.aClass132_Sub1_Sub3_1 = null;
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!tx", name = "ae", descriptor = "(IIII)Lclient!asm;")
	public Class132_Sub1_Sub3 method31637(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		if (local8 != null) {
			this.method31642(local8.aClass132_Sub1_Sub3_2, (byte) 118);
			if (local8.aClass132_Sub1_Sub3_2 != null) {
				@Pc(22) Class132_Sub1_Sub3 local22 = local8.aClass132_Sub1_Sub3_2;
				local8.aClass132_Sub1_Sub3_2 = null;
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!tx", name = "ag", descriptor = "(IIIB)Lclient!asv;")
	public Class132_Sub1_Sub4 method31638(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		if (local8 == null) {
			return null;
		}
		this.method31642(local8.aClass132_Sub1_Sub4_1, (byte) 86);
		if (local8.aClass132_Sub1_Sub4_1 == null) {
			return null;
		} else {
			@Pc(24) Class132_Sub1_Sub4 local24 = local8.aClass132_Sub1_Sub4_1;
			local8.aClass132_Sub1_Sub4_1 = null;
			return local24;
		}
	}

	@OriginalMember(owner = "client!tx", name = "d", descriptor = "(IIB)I")
	public int method31639(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		return this.anIntArrayArray62 == null ? 0 : this.anIntArrayArray62[arg0][arg1] & 0xFFFFFF;
	}

	@OriginalMember(owner = "client!tx", name = "dr", descriptor = "(III)Lclient!asw;")
	public Class132_Sub1_Sub2 method31640(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		if (local8 != null) {
			this.method31642(local8.aClass132_Sub1_Sub2_1, (byte) 117);
			if (local8.aClass132_Sub1_Sub2_1 != null) {
				@Pc(22) Class132_Sub1_Sub2 local22 = local8.aClass132_Sub1_Sub2_1;
				local8.aClass132_Sub1_Sub2_1 = null;
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!tx", name = "fw", descriptor = "(Lclient!alh;[Lclient!akf;)V")
	void method31641(@OriginalArg(0) Class132_Sub1 arg0, @OriginalArg(1) Class93_Sub16[] arg1) {
		@Pc(7) int local7;
		if (this.aBoolean826) {
			local7 = arg0.method24321(arg1, (short) 32650);
			this.aClass104_11.method20802(local7, arg1);
		}
		if (this.aClass99Array3 == this.aClass99Array1) {
			@Pc(19) boolean local19 = false;
			@Pc(21) boolean local21 = false;
			@Pc(25) Class472 local25 = arg0.method24241().aClass472_61;
			@Pc(36) int local36;
			if (arg0 instanceof Class132_Sub1_Sub1) {
				local7 = ((Class132_Sub1_Sub1) arg0).aShort129;
				local36 = ((Class132_Sub1_Sub1) arg0).aShort128;
			} else {
				local7 = (int) local25.aFloat325 >> this.anInt5599 * -358186793;
				local36 = (int) local25.aFloat327 >> this.anInt5599 * -358186793;
			}
			local7 = Math.min(this.anInt5604 * -200159665 - 1, Math.max(0, local7));
			local36 = Math.min(this.anInt5605 * -1943751559 - 1, Math.max(0, local36));
			@Pc(81) Class237 local81 = new Class237();
			local81.anInt3858 = this.method31639(local7, local36, (byte) -62) * -938620053;
			local81.anInt3856 = this.method31620(local7, local36, 1980799416) * -192371369;
			local81.anInt3860 = this.method31700(local7, local36, -1270598323) * -316775901;
			local81.anInt3859 = this.method31623(local7, local36, (short) 30492) * -699093173;
			local81.anInt3861 = this.method31670(local7, local36, (byte) -26) * -913672293;
			local81.anInt3862 = this.method31625(local7, local36, (byte) 85) * 152514549;
			this.aClass104_11.method20557(this.aClass99Array2[0].method2480((int) local25.aFloat325, (int) local25.aFloat327, 640070529), local81);
		}
		@Pc(157) Class573 local157 = arg0.method24283(this.aClass104_11, -1823913839);
		if (local157 == null) {
			return;
		}
		if (local157.aBoolean824) {
			local157.aClass132_Sub1_25 = arg0;
			this.aClass569_2.method31484(local157, (byte) 0);
		} else {
			Class305.method26891(local157, (byte) 0);
		}
	}

	@OriginalMember(owner = "client!tx", name = "ai", descriptor = "(Lclient!alh;B)V")
	void method31642(@OriginalArg(0) Class132_Sub1 arg0, @OriginalArg(1) byte arg1) {
		if (arg0 == null) {
			return;
		}
		arg0.method24242();
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

	@OriginalMember(owner = "client!tx", name = "bd", descriptor = "(I)Ljava/util/HashMap;")
	public HashMap method31643(@OriginalArg(0) int arg0) {
		this.aHashMap12.clear();
		@Pc(7) Iterator local7 = this.aHashMap11.entrySet().iterator();
		while (local7.hasNext()) {
			@Pc(14) Entry local14 = (Entry) local7.next();
			this.aHashMap12.put(local14.getKey(), ((Class597) ((List) local14.getValue()).get(0)).aClass93_Sub16_3);
		}
		return this.aHashMap12;
	}

	@OriginalMember(owner = "client!tx", name = "cf", descriptor = "(IIIIIIII)V")
	public void method31644(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!tx", name = "at", descriptor = "(IIII)Lclient!asm;")
	public Class132_Sub1_Sub3 method31645(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass132_Sub1_Sub3_1;
	}

	@OriginalMember(owner = "client!tx", name = "ad", descriptor = "(IIIB)Lclient!ast;")
	public Class132_Sub1_Sub5 method31646(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass132_Sub1_Sub5_1;
	}

	@OriginalMember(owner = "client!tx", name = "n", descriptor = "(Lclient!eu;B)V")
	public void method31647(@OriginalArg(0) Class106 arg0, @OriginalArg(1) byte arg1) {
	}

	@OriginalMember(owner = "client!tx", name = "au", descriptor = "(IIIB)Lclient!uc;")
	public Class590 method31648(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass590_1;
	}

	@OriginalMember(owner = "client!tx", name = "bi", descriptor = "(I)V")
	public void method31649(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!tx", name = "ap", descriptor = "()V")
	public void method31650() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5603 * -882426473; local1++) {
			for (@Pc(9) int local9 = 0; local9 < this.anInt5604 * -200159665; local9++) {
				for (@Pc(17) int local17 = 0; local17 < this.anInt5605 * -1943751559; local17++) {
					@Pc(32) Class572 local32 = this.aClass572ArrayArrayArray3[local1][local9][local17];
					if (local32 != null) {
						@Pc(37) Class132_Sub1_Sub2 local37 = local32.aClass132_Sub1_Sub2_1;
						@Pc(40) Class132_Sub1_Sub2 local40 = local32.aClass132_Sub1_Sub2_2;
						if (local37 != null && local37.method24273(733652426)) {
							this.method31752(local37, local1, local9, local17, 1, 1);
							if (local40 != null && local40.method24273(-68491823)) {
								this.method31752(local40, local1, local9, local17, 1, 1);
								local40.method24281(this.aClass104_11, local37, 0, 0, 0, false, (byte) -4);
								local40.method24277((byte) 124);
							}
							local37.method24277((byte) 126);
						}
						for (@Pc(89) Class590 local89 = local32.aClass590_1; local89 != null; local89 = local89.aClass590_2) {
							@Pc(94) Class132_Sub1_Sub1 local94 = local89.aClass132_Sub1_Sub1_1;
							if (local94 != null && local94.method24273(-1205648727)) {
								this.method31752(local94, local1, local9, local17, local94.aShort130 - local94.aShort129 + 1, local94.aShort127 - local94.aShort128 + 1);
								local94.method24277((byte) 126);
							}
						}
						@Pc(130) Class132_Sub1_Sub4 local130 = local32.aClass132_Sub1_Sub4_1;
						if (local130 != null && local130.method24273(-402742180)) {
							this.method31651(local130, local1, local9, local17, (short) -3480);
							local130.method24277((byte) 126);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tx", name = "aq", descriptor = "(Lclient!alh;IIIS)V")
	void method31651(@OriginalArg(0) Class132_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) short arg4) {
		@Pc(16) Class572 local16;
		@Pc(126) int local126;
		if (arg2 < this.anInt5604 * -200159665) {
			local16 = this.aClass572ArrayArrayArray3[arg1][arg2 + 1][arg3];
			if (local16 != null && local16.aClass132_Sub1_Sub4_1 != null && local16.aClass132_Sub1_Sub4_1.method24273(-673496481)) {
				local126 = (this.aClass99Array1[arg1].method2482(arg2 + 1, arg3, -433289712) + this.aClass99Array1[arg1].method2482(arg2 + 1 + 1, arg3, -1031523386) + this.aClass99Array1[arg1].method2482(arg2 + 1, arg3 + 1, -302804641) + this.aClass99Array1[arg1].method2482(1 + 1 + arg2, arg3 + 1, -174405952)) / 4 - (this.aClass99Array1[arg1].method2482(arg2, arg3, -1610623102) + this.aClass99Array1[arg1].method2482(arg2 + 1, arg3, -243948407) + this.aClass99Array1[arg1].method2482(arg2, arg3 + 1, -1603754183) + this.aClass99Array1[arg1].method2482(arg2 + 1, arg3 + 1, -993299112)) / 4;
				arg0.method24281(this.aClass104_11, local16.aClass132_Sub1_Sub4_1, this.anInt5600 * -77997759, local126, 0, true, (byte) -90);
			}
		}
		if (arg3 < this.anInt5604 * -200159665) {
			local16 = this.aClass572ArrayArrayArray3[arg1][arg2][arg3 + 1];
			if (local16 != null && local16.aClass132_Sub1_Sub4_1 != null && local16.aClass132_Sub1_Sub4_1.method24273(683356753)) {
				local126 = (this.aClass99Array1[arg1].method2482(arg2, arg3, -803300321) + this.aClass99Array1[arg1].method2482(arg2 + 1, arg3 + 1, -1459230266) + this.aClass99Array1[arg1].method2482(arg2, arg3 + 1 + 1, -1677159206) + this.aClass99Array1[arg1].method2482(arg2 + 1, 1 + 1 + arg3, -788616936)) / 4 - (this.aClass99Array1[arg1].method2482(arg2, arg3, -1388186093) + this.aClass99Array1[arg1].method2482(arg2 + 1, arg3, -1652122244) + this.aClass99Array1[arg1].method2482(arg2, arg3 + 1, -1840235055) + this.aClass99Array1[arg1].method2482(arg2 + 1, arg3 + 1, -2005679960)) / 4;
				arg0.method24281(this.aClass104_11, local16.aClass132_Sub1_Sub4_1, 0, local126, this.anInt5600 * -77997759, true, (byte) -57);
			}
		}
		if (arg2 < this.anInt5604 * -200159665 && arg3 < this.anInt5605 * -1943751559) {
			local16 = this.aClass572ArrayArrayArray3[arg1][arg2 + 1][arg3 + 1];
			if (local16 != null && local16.aClass132_Sub1_Sub4_1 != null && local16.aClass132_Sub1_Sub4_1.method24273(-1448980402)) {
				local126 = (this.aClass99Array1[arg1].method2482(arg2 + 1, arg3 + 1, -1279805316) + this.aClass99Array1[arg1].method2482(arg2 + 1 + 1, arg3 + 1, -1004642146) + this.aClass99Array1[arg1].method2482(arg2 + 1, arg3 + 1 + 1, -1312548956) + this.aClass99Array1[arg1].method2482(1 + 1 + arg2, 1 + 1 + arg3, -173667804)) / 4 - (this.aClass99Array1[arg1].method2482(arg2, arg3, -702570542) + this.aClass99Array1[arg1].method2482(arg2 + 1, arg3, -1865057904) + this.aClass99Array1[arg1].method2482(arg2, arg3 + 1, -822565069) + this.aClass99Array1[arg1].method2482(arg2 + 1, arg3 + 1, -382371541)) / 4;
				arg0.method24281(this.aClass104_11, local16.aClass132_Sub1_Sub4_1, this.anInt5600 * -77997759, local126, this.anInt5600 * -77997759, true, (byte) -32);
			}
		}
		if (arg2 >= this.anInt5604 * -200159665 || arg3 <= 0) {
			return;
		}
		local16 = this.aClass572ArrayArrayArray3[arg1][arg2 + 1][arg3 - 1];
		if (local16 != null && local16.aClass132_Sub1_Sub4_1 != null && local16.aClass132_Sub1_Sub4_1.method24273(-497177362)) {
			local126 = (this.aClass99Array1[arg1].method2482(arg2 + 1, arg3 - 1, -1667326005) + this.aClass99Array1[arg1].method2482(arg2 + 1 + 1, arg3 - 1, -1269196547) + this.aClass99Array1[arg1].method2482(arg2 + 1, arg3 + 1 - 1, -1425174889) + this.aClass99Array1[arg1].method2482(1 + 1 + arg2, arg3 + 1 - 1, -1153449083)) / 4 - (this.aClass99Array1[arg1].method2482(arg2, arg3, -2007613716) + this.aClass99Array1[arg1].method2482(arg2 + 1, arg3, -467165210) + this.aClass99Array1[arg1].method2482(arg2, arg3 + 1, -1380787746) + this.aClass99Array1[arg1].method2482(arg2 + 1, arg3 + 1, -1793264789)) / 4;
			arg0.method24281(this.aClass104_11, local16.aClass132_Sub1_Sub4_1, this.anInt5600 * -77997759, local126, -(this.anInt5600 * -77997759), true, (byte) -120);
		}
	}

	@OriginalMember(owner = "client!tx", name = "ah", descriptor = "(IIIB)Lclient!ast;")
	public Class132_Sub1_Sub5 method31652(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		if (local8 == null) {
			return null;
		} else {
			@Pc(16) Class132_Sub1_Sub5 local16 = local8.aClass132_Sub1_Sub5_1;
			local8.aClass132_Sub1_Sub5_1 = null;
			this.method31642(local16, (byte) 69);
			return local16;
		}
	}

	@OriginalMember(owner = "client!tx", name = "ds", descriptor = "(III)Lclient!asv;")
	public Class132_Sub1_Sub4 method31653(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		if (local8 == null) {
			return null;
		}
		this.method31642(local8.aClass132_Sub1_Sub4_1, (byte) 53);
		if (local8.aClass132_Sub1_Sub4_1 == null) {
			return null;
		} else {
			@Pc(24) Class132_Sub1_Sub4 local24 = local8.aClass132_Sub1_Sub4_1;
			local8.aClass132_Sub1_Sub4_1 = null;
			return local24;
		}
	}

	@OriginalMember(owner = "client!tx", name = "ao", descriptor = "(Z[[[BIBI)V")
	void method31654(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4) {
		@Pc(5) int local5 = arg0 ? 1 : 0;
		this.anInt5610 = 0;
		this.anInt5606 = 0;
		this.anInt5615 += 1774593837;
		@Pc(27) Class132_Sub1 local27;
		if ((arg4 & 0x2) == 0) {
			for (local27 = this.aClass132_Sub1Array1[local5]; local27 != null; local27 = local27.aClass132_Sub1_23) {
				this.method31655(local27, 2090126575);
				if (local27.anInt3290 * 1998180051 != -1 && !this.method31658(local27, arg0, arg1, arg2, arg3)) {
					this.aClass132_Sub1Array4[(this.anInt5610 += -2107072139) * -889690403 - 1] = local27;
				}
			}
		}
		@Pc(184) int local184;
		if ((arg4 & 0x1) == 0) {
			for (local27 = this.aClass132_Sub1Array2[local5]; local27 != null; local27 = local27.aClass132_Sub1_23) {
				this.method31655(local27, 1751925639);
				if (local27.anInt3290 * 1998180051 != -1 && !this.method31658(local27, arg0, arg1, arg2, arg3)) {
					this.aClass132_Sub1Array3[(this.anInt5606 += 1048894253) * 1298082981 - 1] = local27;
				}
			}
			for (local27 = this.aClass132_Sub1Array5[local5]; local27 != null; local27 = local27.aClass132_Sub1_23) {
				this.method31655(local27, 1501726065);
				if (local27.anInt3290 * 1998180051 != -1 && !this.method31658(local27, arg0, arg1, arg2, arg3)) {
					if (local27.method24275((short) -27038)) {
						this.aClass132_Sub1Array3[(this.anInt5606 += 1048894253) * 1298082981 - 1] = local27;
					} else {
						this.aClass132_Sub1Array4[(this.anInt5610 += -2107072139) * -889690403 - 1] = local27;
					}
				}
			}
			if (!arg0) {
				for (local184 = 0; local184 < this.anInt5626 * -1409302901; local184++) {
					this.method31655(this.aClass132_Sub1_Sub1Array1[local184], 1222568690);
					if (this.aClass132_Sub1_Sub1Array1[local184].anInt3290 * 1998180051 != -1 && !this.method31658(this.aClass132_Sub1_Sub1Array1[local184], arg0, arg1, arg2, arg3)) {
						if (this.aClass132_Sub1_Sub1Array1[local184].method24275((short) -24229)) {
							this.aClass132_Sub1Array3[(this.anInt5606 += 1048894253) * 1298082981 - 1] = this.aClass132_Sub1_Sub1Array1[local184];
						} else {
							this.aClass132_Sub1Array4[(this.anInt5610 += -2107072139) * -889690403 - 1] = this.aClass132_Sub1_Sub1Array1[local184];
						}
					}
				}
			}
		}
		if (this.anInt5610 * -889690403 > 0) {
			this.method31657(this.aClass132_Sub1Array4, 0, this.anInt5610 * -889690403 - 1);
			for (local184 = 0; local184 < this.anInt5610 * -889690403; local184++) {
				this.method31659(this.aClass132_Sub1Array4[local184], this.aClass93_Sub16Array23);
			}
		}
		if (this.aBoolean826) {
			this.aClass104_11.method20802(0, null);
		}
		if ((arg4 & 0x2) == 0) {
			for (local184 = 0; local184 < this.anInt5603 * -882426473; local184++) {
				@Pc(326) int local326;
				@Pc(361) int local361;
				@Pc(397) boolean[][] local397;
				@Pc(405) int local405;
				@Pc(420) int local420;
				@Pc(425) int local425;
				if (local184 < arg2 || arg1 == null) {
					local326 = this.aBooleanArrayArray14.length;
					if (this.aBooleanArrayArray14.length + this.anInt5622 * 890109843 > this.anInt5604 * -200159665) {
						local326 -= this.aBooleanArrayArray14.length + this.anInt5622 * 890109843 - this.anInt5604 * -200159665;
					}
					local361 = this.aBooleanArrayArray14[0].length;
					if (this.aBooleanArrayArray14[0].length + this.anInt5607 * 1220619219 > this.anInt5605 * -1943751559) {
						local361 -= this.aBooleanArrayArray14[0].length + this.anInt5607 * 1220619219 - this.anInt5605 * -1943751559;
					}
					local397 = this.aBooleanArrayArray13;
					if (this.aBoolean828) {
						for (local405 = this.anInt5617 * 1250813125; local405 < local326; local405++) {
							local420 = this.anInt5622 * 890109843 + local405 - this.anInt5617 * 1250813125;
							for (local425 = this.anInt5618 * 742291621; local425 < local361; local425++) {
								if (this.aBooleanArrayArray14[local405][local425] && !this.aClass598_2.method31976(local184, local420, local425 + this.anInt5607 * 1220619219 - this.anInt5618 * 742291621)) {
									local397[local405][local425] = true;
								} else {
									local397[local405][local425] = false;
								}
							}
						}
					}
					this.aClass99Array1[local184].method2501(this.anInt5601 * 1602382659, this.anInt5620 * 1547517939, this.anInt5616 * -93916925, this.aBooleanArrayArray13, true, arg4);
				} else {
					local326 = this.aBooleanArrayArray14.length;
					if (this.anInt5622 * 890109843 + this.aBooleanArrayArray14.length > this.anInt5604 * -200159665) {
						local326 -= this.aBooleanArrayArray14.length + this.anInt5622 * 890109843 - this.anInt5604 * -200159665;
					}
					local361 = this.aBooleanArrayArray14[0].length;
					if (this.aBooleanArrayArray14[0].length + this.anInt5607 * 1220619219 > this.anInt5605 * -1943751559) {
						local361 -= this.aBooleanArrayArray14[0].length + this.anInt5607 * 1220619219 - this.anInt5605 * -1943751559;
					}
					local397 = this.aBooleanArrayArray13;
					if (this.aBoolean828) {
						for (local405 = this.anInt5617 * 1250813125; local405 < local326; local405++) {
							local420 = this.anInt5622 * 890109843 + local405 - this.anInt5617 * 1250813125;
							for (local425 = this.anInt5618 * 742291621; local425 < local361; local425++) {
								local397[local405][local425] = false;
								if (this.aBooleanArrayArray14[local405][local425]) {
									@Pc(453) int local453 = local425 + this.anInt5607 * 1220619219 - this.anInt5618 * 742291621;
									for (@Pc(455) int local455 = local184; local455 >= 0; local455--) {
										if (this.aClass572ArrayArrayArray3[local455][local420][local453] != null && this.aClass572ArrayArrayArray3[local455][local420][local453].aByte163 == local184) {
											if ((local455 < arg2 || arg3 != arg1[local455][local420][local453]) && !this.aClass598_2.method31976(local184, local420, local453)) {
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
					this.aClass99Array1[local184].method2501(this.anInt5601 * 1602382659, this.anInt5620 * 1547517939, this.anInt5616 * -93916925, this.aBooleanArrayArray13, false, arg4);
				}
			}
		}
		if (this.anInt5606 * 1298082981 > 0) {
			this.method31661(this.aClass132_Sub1Array3, 0, this.anInt5606 * 1298082981 - 1);
			for (local184 = 0; local184 < this.anInt5606 * 1298082981; local184++) {
				this.method31659(this.aClass132_Sub1Array3[local184], this.aClass93_Sub16Array23);
			}
		}
	}

	@OriginalMember(owner = "client!tx", name = "aj", descriptor = "(Lclient!alh;I)V")
	void method31655(@OriginalArg(0) Class132_Sub1 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class472 local3 = arg0.method24241().aClass472_61;
		this.aClass104_11.method20836((float) local3.aFloat325, (float) ((int) local3.aFloat326 + (arg0.method24301((byte) 8) >> 1)), (float) local3.aFloat327, this.aFloatArray118);
		arg0.anInt3290 = (int) this.aFloatArray118[2] * 1729083739;
	}

	@OriginalMember(owner = "client!tx", name = "ce", descriptor = "(II)I")
	public int method31656(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray62 == null ? 0 : this.anIntArrayArray62[arg0][arg1] & 0xFFFFFF;
	}

	@OriginalMember(owner = "client!tx", name = "ab", descriptor = "([Lclient!alh;II)V")
	void method31657(@OriginalArg(0) Class132_Sub1[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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
		this.method31657(arg0, arg1, local10 - 1);
		this.method31657(arg0, local10 + 1, arg2);
	}

	@OriginalMember(owner = "client!tx", name = "az", descriptor = "(Lclient!alh;Z[[[BIB)Z")
	boolean method31658(@OriginalArg(0) Class132_Sub1 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte[][][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		if (!this.aBoolean828) {
			return false;
		} else if (arg0 instanceof Class132_Sub1_Sub1) {
			@Pc(11) short local11 = ((Class132_Sub1_Sub1) arg0).aShort130;
			@Pc(15) short local15 = ((Class132_Sub1_Sub1) arg0).aShort127;
			@Pc(19) short local19 = ((Class132_Sub1_Sub1) arg0).aShort129;
			@Pc(23) short local23 = ((Class132_Sub1_Sub1) arg0).aShort128;
			for (@Pc(25) int local25 = local19; local25 <= local11; local25++) {
				for (@Pc(30) int local30 = local23; local30 <= local15; local30++) {
					if (arg0.aByte99 < this.anInt5603 * -882426473 && local25 >= this.anInt5622 * 890109843 && local25 < this.anInt5619 * -891147229 && local30 >= this.anInt5607 * 1220619219 && local30 < this.anInt5621 * 150058823) {
						if ((arg2 == null || arg0.aByte100 < arg3 || arg2[arg0.aByte100][local25][local30] != arg4) && arg0.method24285(1236877151) && !arg0.method24282(this.aClass104_11, (short) 13085)) {
							return false;
						}
						if (!arg1 && local25 >= this.anInt5601 * 1602382659 - 16 && local25 <= this.anInt5601 * 1602382659 + 16 && local30 >= this.anInt5620 * 1547517939 - 16 && local30 <= this.anInt5620 * 1547517939 + 16) {
							arg0.method24279(this.aClass104_11, -676125642);
						}
						return true;
					}
				}
			}
			return true;
		} else {
			@Pc(144) Class472 local144 = arg0.method24241().aClass472_61;
			@Pc(153) int local153 = (int) local144.aFloat325 >> this.anInt5599 * -358186793;
			@Pc(162) int local162 = (int) local144.aFloat327 >> this.anInt5599 * -358186793;
			if (arg0.aByte99 >= this.anInt5603 * -882426473 || local153 < this.anInt5622 * 890109843 || local153 >= this.anInt5619 * -891147229 || local162 < this.anInt5607 * 1220619219 || local162 >= this.anInt5621 * 150058823) {
				return true;
			} else if ((arg2 == null || arg0.aByte100 < arg3 || arg2[arg0.aByte100][local153][local162] != arg4) && arg0.method24285(1236877151) && !arg0.method24282(this.aClass104_11, (short) 4366)) {
				return false;
			} else {
				if (!arg1 && local153 >= this.anInt5601 * 1602382659 - 16 && local153 <= this.anInt5601 * 1602382659 + 16 && local162 >= this.anInt5620 * 1547517939 - 16 && local162 <= this.anInt5620 * 1547517939 + 16) {
					arg0.method24279(this.aClass104_11, -1055550641);
				}
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!tx", name = "aa", descriptor = "(Lclient!alh;[Lclient!akf;)V")
	void method31659(@OriginalArg(0) Class132_Sub1 arg0, @OriginalArg(1) Class93_Sub16[] arg1) {
		@Pc(7) int local7;
		if (this.aBoolean826) {
			local7 = arg0.method24321(arg1, (short) 7000);
			this.aClass104_11.method20802(local7, arg1);
		}
		if (this.aClass99Array3 == this.aClass99Array1) {
			@Pc(19) boolean local19 = false;
			@Pc(21) boolean local21 = false;
			@Pc(25) Class472 local25 = arg0.method24241().aClass472_61;
			@Pc(36) int local36;
			if (arg0 instanceof Class132_Sub1_Sub1) {
				local7 = ((Class132_Sub1_Sub1) arg0).aShort129;
				local36 = ((Class132_Sub1_Sub1) arg0).aShort128;
			} else {
				local7 = (int) local25.aFloat325 >> this.anInt5599 * -358186793;
				local36 = (int) local25.aFloat327 >> this.anInt5599 * -358186793;
			}
			local7 = Math.min(this.anInt5604 * -200159665 - 1, Math.max(0, local7));
			local36 = Math.min(this.anInt5605 * -1943751559 - 1, Math.max(0, local36));
			@Pc(81) Class237 local81 = new Class237();
			local81.anInt3858 = this.method31639(local7, local36, (byte) -61) * -938620053;
			local81.anInt3856 = this.method31620(local7, local36, 1009737703) * -192371369;
			local81.anInt3860 = this.method31700(local7, local36, -1131757035) * -316775901;
			local81.anInt3859 = this.method31623(local7, local36, (short) 27621) * -699093173;
			local81.anInt3861 = this.method31670(local7, local36, (byte) -89) * -913672293;
			local81.anInt3862 = this.method31625(local7, local36, (byte) 41) * 152514549;
			this.aClass104_11.method20557(this.aClass99Array2[0].method2480((int) local25.aFloat325, (int) local25.aFloat327, 935518292), local81);
		}
		@Pc(157) Class573 local157 = arg0.method24283(this.aClass104_11, 845407043);
		if (local157 == null) {
			return;
		}
		if (local157.aBoolean824) {
			local157.aClass132_Sub1_25 = arg0;
			this.aClass569_2.method31484(local157, (byte) 0);
		} else {
			Class305.method26891(local157, (byte) 0);
		}
	}

	@OriginalMember(owner = "client!tx", name = "af", descriptor = "(Lclient!ara;III[ZI)Z")
	public boolean method31660(@OriginalArg(0) Class93_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = false;
		if (this.aClass99Array3 != this.aClass99Array1) {
			@Pc(15) int local15 = this.aClass99Array2[arg1].method2480(arg2, arg3, 1716810943);
			for (@Pc(17) int local17 = 0; local17 <= arg1; local17++) {
				@Pc(25) Class99 local25 = this.aClass99Array2[local17];
				if (local25 != null) {
					@Pc(37) int local37 = local15 - local25.method2480(arg2, arg3, 983979917);
					if (arg4 != null) {
						arg4[local17] = local25.method2488(arg0, arg2, local37, arg3, 0, false);
						if (!arg4[local17]) {
							continue;
						}
					}
					local25.method2485(arg0, arg2, local37, arg3, 0, false);
					local1 = true;
				}
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!tx", name = "ay", descriptor = "([Lclient!alh;II)V")
	void method31661(@OriginalArg(0) Class132_Sub1[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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
		this.method31661(arg0, arg1, local10 - 1);
		this.method31661(arg0, local10 + 1, arg2);
	}

	@OriginalMember(owner = "client!tx", name = "b", descriptor = "(IIILclient!asm;Lclient!asm;B)V")
	public void method31662(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class132_Sub1_Sub3 arg3, @OriginalArg(4) Class132_Sub1_Sub3 arg4, @OriginalArg(5) byte arg5) {
		@Pc(6) Class572 local6 = this.method31616(arg0, arg1, arg2, (byte) -13);
		if (local6 == null) {
			return;
		}
		local6.aClass132_Sub1_Sub3_1 = arg3;
		local6.aClass132_Sub1_Sub3_2 = arg4;
		@Pc(24) int local24 = this.aClass99Array3 == this.aClass99Array1 ? 1 : 0;
		if (!arg3.method24274((byte) 6)) {
			arg3.aClass132_Sub1_23 = this.aClass132_Sub1Array5[local24];
			this.aClass132_Sub1Array5[local24] = arg3;
		} else if (arg3.method24275((short) -11433)) {
			arg3.aClass132_Sub1_23 = this.aClass132_Sub1Array2[local24];
			this.aClass132_Sub1Array2[local24] = arg3;
		} else {
			arg3.aClass132_Sub1_23 = this.aClass132_Sub1Array1[local24];
			this.aClass132_Sub1Array1[local24] = arg3;
		}
		if (arg4 == null) {
			return;
		}
		if (!arg4.method24274((byte) 6)) {
			arg4.aClass132_Sub1_23 = this.aClass132_Sub1Array5[local24];
			this.aClass132_Sub1Array5[local24] = arg4;
		} else if (arg4.method24275((short) -20912)) {
			arg4.aClass132_Sub1_23 = this.aClass132_Sub1Array2[local24];
			this.aClass132_Sub1Array2[local24] = arg4;
		} else {
			arg4.aClass132_Sub1_23 = this.aClass132_Sub1Array1[local24];
			this.aClass132_Sub1Array1[local24] = arg4;
		}
	}

	@OriginalMember(owner = "client!tx", name = "bf", descriptor = "(I)V")
	public void method31663(@OriginalArg(0) int arg0) {
		this.method31780(1, this.anInt5603 * -882426473, -16777216);
	}

	@OriginalMember(owner = "client!tx", name = "bl", descriptor = "(Lclient!ul;B)V")
	public void method31664(@OriginalArg(0) Class597 arg0, @OriginalArg(1) byte arg1) {
		if (this.anInt5625 * 809266399 >= 65253) {
			return;
		}
		@Pc(9) Class93_Sub16 local9 = arg0.aClass93_Sub16_3;
		this.aClass597Array1[this.anInt5625 * 809266399] = arg0;
		this.aBooleanArray32[this.anInt5625 * 809266399] = false;
		this.anInt5625 += -1448456417;
		@Pc(36) int local36 = arg0.anInt5681 * -1484967795;
		if (arg0.aBoolean831) {
			local36 = 0;
		}
		@Pc(46) int local46 = arg0.anInt5681 * -1484967795;
		if (arg0.aBoolean830) {
			local46 = this.anInt5603 * -882426473 - 1;
		}
		for (@Pc(58) int local58 = local36; local58 <= local46; local58++) {
			@Pc(63) int local63 = 0;
			@Pc(81) int local81 = local9.method13522(-57371383) - local9.method13523((byte) -75) + this.anInt5608 * -996240773 >> this.anInt5599 * -358186793;
			if (local81 < 0) {
				local63 -= local81;
				local81 = 0;
			}
			@Pc(107) int local107 = local9.method13522(379255281) + local9.method13523((byte) -128) - this.anInt5608 * -996240773 >> this.anInt5599 * -358186793;
			if (local107 >= this.anInt5605 * -1943751559) {
				local107 = this.anInt5605 * -1943751559 - 1;
			}
			for (@Pc(122) int local122 = local81; local122 <= local107; local122++) {
				@Pc(131) short local131 = arg0.aShortArray142[local63++];
				@Pc(153) int local153 = (local9.method13520(-291099673) - local9.method13523((byte) -63) + this.anInt5608 * -996240773 >> this.anInt5599 * -358186793) + (local131 >>> 8);
				@Pc(161) int local161 = local153 + (local131 & 0xFF) - 1;
				if (local153 < 0) {
					local153 = 0;
				}
				if (local161 >= this.anInt5604 * -200159665) {
					local161 = this.anInt5604 * -200159665 - 1;
				}
				for (@Pc(180) int local180 = local153; local180 <= local161; local180++) {
					@Pc(192) long local192 = this.aLongArrayArrayArray1[local58][local180][local122];
					if ((local192 & 0xFFFFL) == 0L) {
						this.aLongArrayArrayArray1[local58][local180][local122] = local192 | (long) (this.anInt5625 * 809266399);
					} else if ((local192 & 0xFFFF0000L) == 0L) {
						this.aLongArrayArrayArray1[local58][local180][local122] = local192 | (long) (this.anInt5625 * 809266399) << 16;
					} else if ((local192 & 0xFFFF00000000L) == 0L) {
						this.aLongArrayArrayArray1[local58][local180][local122] = local192 | (long) (this.anInt5625 * 809266399) << 32;
					} else if ((local192 & 0xFFFF000000000000L) == 0L) {
						this.aLongArrayArrayArray1[local58][local180][local122] = local192 | (long) (this.anInt5625 * 809266399) << 48;
					}
				}
			}
		}
		if (-281517371 * arg0.anInt5668 == -1) {
			return;
		}
		@Pc(307) List local307 = (List) this.aHashMap11.get(arg0.anInt5668 * -281517371);
		if (local307 == null) {
			local307 = new ArrayList();
			this.aHashMap11.put(arg0.anInt5668 * -281517371, local307);
		}
		local307.add(arg0);
		@Pc(337) Class93_Sub16 local337 = (Class93_Sub16) this.aHashMap12.get(arg0.anInt5668 * -281517371);
		if (local337 != null) {
			arg0.aClass93_Sub16_3.method13533(local337.method13539((byte) -18), -172971053);
			arg0.aClass93_Sub16_3.method13535(local337.method13571(-341058230), local337.method13530(-1569506416), -1642269565);
			arg0.aClass93_Sub16_3.method13551(local337.method13567((byte) 56), (short) 22558);
			arg0.aClass93_Sub16_3.method13536(local337.method13544(331716133), local337.method13532(-1791319997), (byte) -66);
		}
	}

	@OriginalMember(owner = "client!tx", name = "bk", descriptor = "(I)V")
	public void method31665(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5625 * 809266399; local1++) {
			if (!this.aBooleanArray32[local1]) {
				@Pc(17) Class597 local17 = this.aClass597Array1[local1];
				@Pc(20) Class93_Sub16 local20 = local17.aClass93_Sub16_3;
				@Pc(25) int local25 = local17.anInt5681 * -1484967795;
				@Pc(34) int local34 = local20.method13523((byte) -23) - this.anInt5608 * -996240773;
				@Pc(45) int local45 = (local34 * 2 >> this.anInt5599 * -358186793) + 1;
				@Pc(47) int local47 = 0;
				@Pc(52) int[] local52 = new int[local45 * local45];
				@Pc(63) int local63 = local20.method13520(1682707676) - local34 >> this.anInt5599 * -358186793;
				@Pc(74) int local74 = local20.method13522(676169646) - local34 >> this.anInt5599 * -358186793;
				@Pc(85) int local85 = local20.method13522(36215176) + local34 >> this.anInt5599 * -358186793;
				if (local74 < 0) {
					local47 -= local74;
					local74 = 0;
				}
				if (local85 >= this.anInt5605 * -1943751559) {
					local85 = this.anInt5605 * -1943751559 - 1;
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
					if (local140 >= this.anInt5604 * -200159665) {
						local140 = this.anInt5604 * -200159665 - 1;
					}
					for (@Pc(163) int local163 = local132; local163 <= local140; local163++) {
						@Pc(168) byte local168 = 1;
						@Pc(176) Class132_Sub1_Sub1 local176 = this.method31766(local25, local163, local108, null, (byte) 3);
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
				if (aBoolean827) {
					this.aClass99Array1[local25].method2502(local20, local52);
				}
			}
		}
	}

	@OriginalMember(owner = "client!tx", name = "bh", descriptor = "(IIII)V")
	public void method31666(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) List local6 = (List) this.aHashMap11.get(arg0);
		if (local6 == null) {
			return;
		}
		@Pc(12) Iterator local12 = local6.iterator();
		while (local12.hasNext()) {
			@Pc(19) Class597 local19 = (Class597) local12.next();
			local19.aClass93_Sub16_3.method13535(arg1, arg2, -2058309471);
		}
	}

	@OriginalMember(owner = "client!tx", name = "bx", descriptor = "(IIIB)V")
	public void method31667(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		@Pc(6) List local6 = (List) this.aHashMap11.get(arg0);
		if (local6 == null) {
			return;
		}
		@Pc(18) float local18 = arg1 < 0 ? -1.0F : (float) arg1 / 100.0F;
		@Pc(21) Iterator local21 = local6.iterator();
		while (local21.hasNext()) {
			@Pc(28) Class597 local28 = (Class597) local21.next();
			local28.aClass93_Sub16_3.method13536(local18, arg2, (byte) -67);
		}
	}

	@OriginalMember(owner = "client!tx", name = "cp", descriptor = "(II)I")
	public int method31668(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aByteArrayArray24 == null ? 0 : this.aByteArrayArray24[arg0][arg1] & 0xFF;
	}

	@OriginalMember(owner = "client!tx", name = "bc", descriptor = "(Ljava/util/HashMap;B)V")
	public void method31669(@OriginalArg(0) HashMap arg0, @OriginalArg(1) byte arg1) {
		this.aHashMap12 = arg0;
	}

	@OriginalMember(owner = "client!tx", name = "v", descriptor = "(IIB)I")
	public int method31670(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		return this.aByteArrayArray25 == null ? 0 : this.aByteArrayArray25[arg0][arg1] & 0xFF;
	}

	@OriginalMember(owner = "client!tx", name = "ec", descriptor = "(IIILclient!td;)Lclient!ash;")
	public Class132_Sub1_Sub1 method31671(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Interface62 arg3) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		if (local8 == null) {
			return null;
		}
		for (@Pc(16) Class590 local16 = local8.aClass590_1; local16 != null; local16 = local16.aClass590_2) {
			@Pc(21) Class132_Sub1_Sub1 local21 = local16.aClass132_Sub1_Sub1_1;
			if ((arg3 == null || arg3.method31548(local21, 619712680)) && arg1 == local21.aShort129 && local21.aShort128 == arg2) {
				return local21;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!tx", name = "bn", descriptor = "(I)V")
	public void method31672(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!tx", name = "bt", descriptor = "(Lclient!eu;)V")
	public void method31673(@OriginalArg(0) Class106 arg0) {
	}

	@OriginalMember(owner = "client!tx", name = "bq", descriptor = "(Lclient!eu;)V")
	public void method31674(@OriginalArg(0) Class106 arg0) {
	}

	@OriginalMember(owner = "client!tx", name = "a", descriptor = "(IIIII)V")
	public void method31675(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		if (local8 == null) {
			return;
		}
		@Pc(14) Class132_Sub1_Sub3 local14 = local8.aClass132_Sub1_Sub3_1;
		@Pc(17) Class132_Sub1_Sub3 local17 = local8.aClass132_Sub1_Sub3_2;
		if (local14 != null) {
			local14.aShort86 = (short) (arg3 * local14.aShort86 / (0x10 << this.anInt5599 * -358186793 - 7));
			local14.aShort85 = (short) (arg3 * local14.aShort85 / (0x10 << this.anInt5599 * -358186793 - 7));
		}
		if (local17 != null) {
			local17.aShort86 = (short) (local17.aShort86 * arg3 / (0x10 << this.anInt5599 * -358186793 - 7));
			local17.aShort85 = (short) (arg3 * local17.aShort85 / (0x10 << this.anInt5599 * -358186793 - 7));
		}
	}

	@OriginalMember(owner = "client!tx", name = "fy", descriptor = "()Ljava/util/HashMap;")
	public HashMap method31676() {
		this.aHashMap12.clear();
		@Pc(7) Iterator local7 = this.aHashMap11.entrySet().iterator();
		while (local7.hasNext()) {
			@Pc(14) Entry local14 = (Entry) local7.next();
			this.aHashMap12.put(local14.getKey(), ((Class597) ((List) local14.getValue()).get(0)).aClass93_Sub16_3);
		}
		return this.aHashMap12;
	}

	@OriginalMember(owner = "client!tx", name = "ar", descriptor = "(IIII)Lclient!asv;")
	public Class132_Sub1_Sub4 method31677(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		return local8 == null || local8.aClass132_Sub1_Sub4_1 == null ? null : local8.aClass132_Sub1_Sub4_1;
	}

	@OriginalMember(owner = "client!tx", name = "h", descriptor = "(Lclient!ash;ZI)Z")
	public boolean method31678(@OriginalArg(0) Class132_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(8) boolean local8 = this.aClass99Array3 == this.aClass99Array1;
		@Pc(10) int local10 = 0;
		@Pc(12) short local12 = 0;
		@Pc(14) byte local14 = 0;
		arg0.method24334(-105815840);
		@Pc(19) short local19 = 0;
		@Pc(31) int local31 = Math.min(this.anInt5604 * -200159665 - 1, Math.max(0, arg0.aShort129));
		@Pc(43) int local43 = Math.min(this.anInt5604 * -200159665 - 1, Math.max(0, arg0.aShort130));
		@Pc(55) int local55 = Math.min(this.anInt5605 * -1943751559 - 1, Math.max(0, arg0.aShort128));
		@Pc(67) int local67 = Math.min(this.anInt5605 * -1943751559 - 1, Math.max(0, arg0.aShort127));
		@Pc(69) int local69;
		@Pc(74) int local74;
		for (local69 = local31; local69 <= local43; local69++) {
			for (local74 = local55; local74 <= local67; local74++) {
				@Pc(85) Class572 local85 = this.method31617(arg0.aByte100, local69, local74, (byte) -17);
				if (local85 != null) {
					@Pc(91) Class590 local91 = Class355.method27792(arg0, 2081552050);
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
			this.aClass132_Sub1_Sub1Array1[(this.anInt5626 += -1353434845) * -1409302901 - 1] = arg0;
			arg0.aClass585_23 = this;
		} else {
			local69 = this.aClass99Array1 == this.aClass99Array3 ? 1 : 0;
			if (!arg0.method24274((byte) 6)) {
				arg0.aClass132_Sub1_23 = this.aClass132_Sub1Array5[local69];
				this.aClass132_Sub1Array5[local69] = arg0;
			} else if (arg0.method24275((short) -23073)) {
				arg0.aClass132_Sub1_23 = this.aClass132_Sub1Array2[local69];
				this.aClass132_Sub1Array2[local69] = arg0;
			} else {
				arg0.aClass132_Sub1_23 = this.aClass132_Sub1Array1[local69];
				this.aClass132_Sub1Array1[local69] = arg0;
			}
		}
		if (arg1) {
			@Pc(294) Class472 local294 = Class472.method29711(arg0.method24241().aClass472_61);
			local294.aFloat326 -= local19;
			arg0.method24236(local294);
			local294.method29713();
		}
		return true;
	}

	@OriginalMember(owner = "client!tx", name = "er", descriptor = "(Lclient!alh;IIIII)V")
	void method31679(@OriginalArg(0) Class132_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg5 + arg3;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (this.anInt5603 * -882426473 != local17) {
				for (@Pc(31) int local31 = local3; local31 <= local7; local31++) {
					if (local31 >= 0 && local31 < this.anInt5604 * -200159665) {
						for (@Pc(45) int local45 = local11; local45 <= local15; local45++) {
							if (local45 >= 0 && local45 < this.anInt5605 * -1943751559 && (!local1 || local31 >= local7 || local45 >= local15 || local45 < arg3 && arg2 != local31)) {
								@Pc(81) Class572 local81 = this.aClass572ArrayArrayArray3[local17][local31][local45];
								if (local81 != null) {
									@Pc(176) int local176 = (this.aClass99Array1[local17].method2482(local31, local45, -610865234) + this.aClass99Array1[local17].method2482(local31 + 1, local45, -1048500557) + this.aClass99Array1[local17].method2482(local31, local45 + 1, -1070683541) + this.aClass99Array1[local17].method2482(local31 + 1, local45 + 1, -1096027084)) / 4 - (this.aClass99Array1[arg1].method2482(arg2, arg3, -864141772) + this.aClass99Array1[arg1].method2482(arg2 + 1, arg3, -1978233238) + this.aClass99Array1[arg1].method2482(arg2, arg3 + 1, -336380388) + this.aClass99Array1[arg1].method2482(arg2 + 1, arg3 + 1, -1397730771)) / 4;
									@Pc(179) Class132_Sub1_Sub2 local179 = local81.aClass132_Sub1_Sub2_1;
									@Pc(182) Class132_Sub1_Sub2 local182 = local81.aClass132_Sub1_Sub2_2;
									if (local179 != null && local179.method24273(-1379040590)) {
										arg0.method24281(this.aClass104_11, local179, this.anInt5600 * -77997759 * (local31 - arg2) + (1 - arg4) * -996240773 * this.anInt5608, local176, this.anInt5600 * -77997759 * (local45 - arg3) + this.anInt5608 * -996240773 * (1 - arg5), local1, (byte) -75);
									}
									if (local182 != null && local182.method24273(-708691442)) {
										arg0.method24281(this.aClass104_11, local182, (local31 - arg2) * this.anInt5600 * -77997759 + (1 - arg4) * this.anInt5608 * -996240773, local176, this.anInt5608 * -996240773 * (1 - arg5) + (local45 - arg3) * this.anInt5600 * -77997759, local1, (byte) -116);
									}
									for (@Pc(283) Class590 local283 = local81.aClass590_1; local283 != null; local283 = local283.aClass590_2) {
										@Pc(288) Class132_Sub1_Sub1 local288 = local283.aClass132_Sub1_Sub1_1;
										if (local288 != null && local288.method24273(-935359752) && (local288.aShort129 == local31 || local3 == local31) && (local45 == local288.aShort128 || local11 == local45)) {
											@Pc(318) int local318 = local288.aShort130 - local288.aShort129 + 1;
											@Pc(326) int local326 = local288.aShort127 - local288.aShort128 + 1;
											arg0.method24281(this.aClass104_11, local288, (local288.aShort129 - arg2) * -77997759 * this.anInt5600 + (local318 - arg4) * this.anInt5608 * -996240773, local176, (local288.aShort128 - arg3) * this.anInt5600 * -77997759 + (local326 - arg5) * -996240773 * this.anInt5608, local1, (byte) -50);
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

	@OriginalMember(owner = "client!tx", name = "bw", descriptor = "(II)V")
	public void method31680(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!tx", name = "bo", descriptor = "(II)V")
	public void method31681(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!tx", name = "bz", descriptor = "(III)Lclient!tk;")
	Class572 method31682(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass572ArrayArrayArray3[arg0][arg1][arg2] == null) {
			@Pc(32) boolean local32 = this.aClass572ArrayArrayArray3[0][arg1][arg2] != null && this.aClass572ArrayArrayArray3[0][arg1][arg2].aClass572_1 != null;
			if (local32 && arg0 >= this.anInt5603 * -882426473 - 1) {
				return null;
			}
			this.method31761(arg0, arg1, arg2, -506367580);
		}
		return this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
	}

	@OriginalMember(owner = "client!tx", name = "em", descriptor = "(III)Lclient!uc;")
	public Class590 method31683(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass590_1;
	}

	@OriginalMember(owner = "client!tx", name = "br", descriptor = "(III)V")
	public void method31684(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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

	@OriginalMember(owner = "client!tx", name = "bg", descriptor = "(III)V")
	public void method31685(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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

	@OriginalMember(owner = "client!tx", name = "ba", descriptor = "(ILclient!cb;)V")
	public void method31686(@OriginalArg(0) int arg0, @OriginalArg(1) Class99 arg1) {
		this.aClass99Array1[arg0] = arg1;
	}

	@OriginalMember(owner = "client!tx", name = "bp", descriptor = "(ILclient!cb;)V")
	public void method31687(@OriginalArg(0) int arg0, @OriginalArg(1) Class99 arg1) {
		this.aClass99Array1[arg0] = arg1;
	}

	@OriginalMember(owner = "client!tx", name = "bj", descriptor = "(ILclient!cb;)V")
	public void method31688(@OriginalArg(0) int arg0, @OriginalArg(1) Class99 arg1) {
		this.aClass99Array1[arg0] = arg1;
	}

	@OriginalMember(owner = "client!tx", name = "bs", descriptor = "(II)I")
	public int method31689(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aShortArrayArray5 == null ? 0 : this.aShortArrayArray5[arg0][arg1] & 0xFFFF;
	}

	@OriginalMember(owner = "client!tx", name = "fb", descriptor = "(Lclient!ul;)V")
	public void method31690(@OriginalArg(0) Class597 arg0) {
		if (this.anInt5625 * 809266399 >= 65253) {
			return;
		}
		@Pc(9) Class93_Sub16 local9 = arg0.aClass93_Sub16_3;
		this.aClass597Array1[this.anInt5625 * 809266399] = arg0;
		this.aBooleanArray32[this.anInt5625 * 809266399] = false;
		this.anInt5625 += -1448456417;
		@Pc(36) int local36 = arg0.anInt5681 * -1484967795;
		if (arg0.aBoolean831) {
			local36 = 0;
		}
		@Pc(46) int local46 = arg0.anInt5681 * -1484967795;
		if (arg0.aBoolean830) {
			local46 = this.anInt5603 * -882426473 - 1;
		}
		for (@Pc(58) int local58 = local36; local58 <= local46; local58++) {
			@Pc(63) int local63 = 0;
			@Pc(81) int local81 = local9.method13522(2068768701) - local9.method13523((byte) -61) + this.anInt5608 * -996240773 >> this.anInt5599 * -358186793;
			if (local81 < 0) {
				local63 -= local81;
				local81 = 0;
			}
			@Pc(107) int local107 = local9.method13522(-55308205) + local9.method13523((byte) -104) - this.anInt5608 * -996240773 >> this.anInt5599 * -358186793;
			if (local107 >= this.anInt5605 * -1943751559) {
				local107 = this.anInt5605 * -1943751559 - 1;
			}
			for (@Pc(122) int local122 = local81; local122 <= local107; local122++) {
				@Pc(131) short local131 = arg0.aShortArray142[local63++];
				@Pc(153) int local153 = (local9.method13520(585272670) - local9.method13523((byte) -9) + this.anInt5608 * -996240773 >> this.anInt5599 * -358186793) + (local131 >>> 8);
				@Pc(161) int local161 = local153 + (local131 & 0xFF) - 1;
				if (local153 < 0) {
					local153 = 0;
				}
				if (local161 >= this.anInt5604 * -200159665) {
					local161 = this.anInt5604 * -200159665 - 1;
				}
				for (@Pc(180) int local180 = local153; local180 <= local161; local180++) {
					@Pc(192) long local192 = this.aLongArrayArrayArray1[local58][local180][local122];
					if ((local192 & 0xFFFFL) == 0L) {
						this.aLongArrayArrayArray1[local58][local180][local122] = local192 | (long) (this.anInt5625 * 809266399);
					} else if ((local192 & 0xFFFF0000L) == 0L) {
						this.aLongArrayArrayArray1[local58][local180][local122] = local192 | (long) (this.anInt5625 * 809266399) << 16;
					} else if ((local192 & 0xFFFF00000000L) == 0L) {
						this.aLongArrayArrayArray1[local58][local180][local122] = local192 | (long) (this.anInt5625 * 809266399) << 32;
					} else if ((local192 & 0xFFFF000000000000L) == 0L) {
						this.aLongArrayArrayArray1[local58][local180][local122] = local192 | (long) (this.anInt5625 * 809266399) << 48;
					}
				}
			}
		}
		if (-281517371 * arg0.anInt5668 == -1) {
			return;
		}
		@Pc(307) List local307 = (List) this.aHashMap11.get(arg0.anInt5668 * -281517371);
		if (local307 == null) {
			local307 = new ArrayList();
			this.aHashMap11.put(arg0.anInt5668 * -281517371, local307);
		}
		local307.add(arg0);
		@Pc(337) Class93_Sub16 local337 = (Class93_Sub16) this.aHashMap12.get(arg0.anInt5668 * -281517371);
		if (local337 != null) {
			arg0.aClass93_Sub16_3.method13533(local337.method13539((byte) -5), -1637571889);
			arg0.aClass93_Sub16_3.method13535(local337.method13571(1454345107), local337.method13530(-1569506416), -1552989502);
			arg0.aClass93_Sub16_3.method13551(local337.method13567((byte) 35), (short) 15172);
			arg0.aClass93_Sub16_3.method13536(local337.method13544(-1864677143), local337.method13532(-340374874), (byte) -33);
		}
	}

	@OriginalMember(owner = "client!tx", name = "fu", descriptor = "(IIII[[[B[I[I[I[I[IIBIIZZIZ)V")
	public void method31691(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[][][] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) byte arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14, @OriginalArg(15) boolean arg15, @OriginalArg(16) int arg16, @OriginalArg(17) boolean arg17) {
		this.aClass598_2.aBoolean832 = true;
		this.aBoolean828 = arg15;
		this.anInt5601 = (arg1 >> this.anInt5599 * -358186793) * 807663979;
		this.anInt5620 = (arg3 >> -358186793 * this.anInt5599) * -893882053;
		this.anInt5612 = arg1 * -541960217;
		this.anInt5613 = arg3 * 2053796035;
		this.anInt5614 = arg2 * 1575019517;
		this.anInt5622 = this.anInt5601 * 1466454929 - this.anInt5616 * -921973039;
		if (this.anInt5622 * 890109843 < 0) {
			this.anInt5617 = -(this.anInt5622 * -699365257);
			this.anInt5622 = 0;
		} else {
			this.anInt5617 = 0;
		}
		this.anInt5607 = this.anInt5620 * -1701337247 - this.anInt5616 * 845404177;
		if (this.anInt5607 * 1220619219 < 0) {
			this.anInt5618 = -(this.anInt5607 * -1954680553);
			this.anInt5607 = 0;
		} else {
			this.anInt5618 = 0;
		}
		this.anInt5619 = this.anInt5616 * -1677097567 + this.anInt5601 * 1251714657;
		if (this.anInt5619 * -891147229 > this.anInt5604 * -200159665) {
			this.anInt5619 = this.anInt5604 * -1912204827;
		}
		this.anInt5621 = this.anInt5616 * 1178488421 + this.anInt5620 * -189865995;
		if (this.anInt5621 * 150058823 > this.anInt5605 * -1943751559) {
			this.anInt5621 = this.anInt5605 * 2064881215;
		}
		@Pc(156) boolean[][] local156 = this.aBooleanArrayArray14;
		@Pc(159) boolean[][] local159 = this.aBooleanArrayArray13;
		@Pc(164) int local164;
		@Pc(179) int local179;
		if (this.aBoolean828) {
			for (local164 = 0; local164 < this.anInt5616 * -93916925 + 2 + this.anInt5616 * -93916925; local164++) {
				local179 = 0;
				@Pc(181) int local181 = 0;
				for (@Pc(183) int local183 = 0; local183 < this.anInt5616 * -93916925 + 2 + this.anInt5616 * -93916925; local183++) {
					if (local183 > 1) {
						this.anIntArray476[local183 - 2] = local179;
					}
					local179 = local181;
					@Pc(220) int local220 = local164 + (this.anInt5601 * 1602382659 - this.anInt5616 * -93916925);
					@Pc(232) int local232 = local183 + (this.anInt5620 * 1547517939 - this.anInt5616 * -93916925);
					@Pc(255) int local255;
					if (local220 >= 0 && local232 >= 0 && local220 < this.anInt5604 * -200159665 && local232 < this.anInt5605 * -1943751559) {
						local255 = local220 << this.anInt5599 * -358186793;
						@Pc(262) int local262 = local232 << this.anInt5599 * -358186793;
						@Pc(284) int local284 = this.aClass99Array2[this.aClass99Array2.length - 1].method2482(local220, local232, -1351670589) - (0x3E8 << this.anInt5599 * -358186793 - 7);
						@Pc(325) int local325 = (this.aClass99Array3 == null ? this.aClass99Array2[0].method2482(local220, local232, -1346636010) + this.anInt5600 * -77997759 : this.aClass99Array3[0].method2482(local220, local232, -225671609) + this.anInt5600 * -77997759) + (0x3E8 << this.anInt5599 * -358186793 - 7);
						local181 = this.aClass104_11.method20659(local255, local284, local262, local255, local325, local262);
						this.aBooleanArrayArray13[local164][local183] = local181 == 0;
					} else {
						local181 = -1;
						this.aBooleanArrayArray13[local164][local183] = false;
					}
					if (local164 > 0 && local183 > 0) {
						local255 = this.anIntArray476[local183 - 1] & this.anIntArray476[local183] & local179 & local181;
						this.aBooleanArrayArray14[local164 - 1][local183 - 1] = local255 == 0;
					}
				}
				this.anIntArray476[this.anInt5616 * -93916925 + this.anInt5616 * -93916925] = local179;
				this.anIntArray476[this.anInt5616 * -93916925 + this.anInt5616 * -93916925 + 1] = local181;
			}
			if (arg17) {
				this.aClass598_2.anIntArray483 = arg5;
				this.aClass598_2.anIntArray484 = arg6;
				this.aClass598_2.anIntArray481 = arg7;
				this.aClass598_2.anIntArray486 = arg8;
				this.aClass598_2.anIntArray485 = arg9;
				this.aClass598_2.method31972(this.aClass104_11, arg10);
			} else {
				this.aClass598_2.aBoolean832 = false;
			}
		} else {
			if (this.aBooleanArrayArray12 == null) {
				this.aBooleanArrayArray12 = new boolean[this.anInt5616 * -93916925 + 2 + this.anInt5616 * -93916925][this.anInt5616 * -93916925 + 2 + this.anInt5616 * -93916925];
			}
			for (local164 = 0; local164 < this.aBooleanArrayArray12.length; local164++) {
				for (local179 = 0; local179 < this.aBooleanArrayArray12[0].length; local179++) {
					this.aBooleanArrayArray12[local164][local179] = true;
				}
			}
			this.aBooleanArrayArray13 = this.aBooleanArrayArray12;
			this.aBooleanArrayArray14 = this.aBooleanArrayArray12;
			this.anInt5622 = 0;
			this.anInt5607 = 0;
			this.anInt5619 = this.anInt5604 * -1912204827;
			this.anInt5621 = this.anInt5605 * 2064881215;
			this.aClass598_2.aBoolean832 = false;
		}
		Class574.method31527(this, this.aClass104_11, (byte) -31);
		if (!this.aClass569_2.aBoolean823) {
			@Pc(556) Iterator local556 = this.aClass569_2.aList22.iterator();
			while (local556.hasNext()) {
				@Pc(563) Class573 local563 = (Class573) local556.next();
				local556.remove();
				Class305.method26891(local563, (byte) 0);
			}
		}
		if (this.aBoolean826) {
			for (local164 = 0; local164 < this.anInt5625 * 809266399; local164++) {
				this.aClass597Array1[local164].method31947(arg0, arg14, 709380673);
			}
		}
		if (this.aClass572ArrayArrayArray2 != null) {
			this.method31613(true, 870300168);
			this.aClass104_11.method20556(-1, new Class237(1583160, 40, 127, 63, 0, 0, 0));
			this.method31654(true, arg4, arg10, arg11, arg16);
			this.aClass104_11.method20558();
			this.method31613(false, 870300168);
		}
		this.method31654(false, arg4, arg10, arg11, arg16);
		if (!this.aBoolean828) {
			this.aBooleanArrayArray14 = local156;
			this.aBooleanArrayArray13 = local159;
		}
	}

	@OriginalMember(owner = "client!tx", name = "fx", descriptor = "(Lclient!alh;Z[[[BIB)Z")
	boolean method31692(@OriginalArg(0) Class132_Sub1 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte[][][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		if (!this.aBoolean828) {
			return false;
		} else if (arg0 instanceof Class132_Sub1_Sub1) {
			@Pc(11) short local11 = ((Class132_Sub1_Sub1) arg0).aShort130;
			@Pc(15) short local15 = ((Class132_Sub1_Sub1) arg0).aShort127;
			@Pc(19) short local19 = ((Class132_Sub1_Sub1) arg0).aShort129;
			@Pc(23) short local23 = ((Class132_Sub1_Sub1) arg0).aShort128;
			for (@Pc(25) int local25 = local19; local25 <= local11; local25++) {
				for (@Pc(30) int local30 = local23; local30 <= local15; local30++) {
					if (arg0.aByte99 < this.anInt5603 * -882426473 && local25 >= this.anInt5622 * 890109843 && local25 < this.anInt5619 * -891147229 && local30 >= this.anInt5607 * 1220619219 && local30 < this.anInt5621 * 150058823) {
						if ((arg2 == null || arg0.aByte100 < arg3 || arg2[arg0.aByte100][local25][local30] != arg4) && arg0.method24285(1236877151) && !arg0.method24282(this.aClass104_11, (short) 13066)) {
							return false;
						}
						if (!arg1 && local25 >= this.anInt5601 * 1602382659 - 16 && local25 <= this.anInt5601 * 1602382659 + 16 && local30 >= this.anInt5620 * 1547517939 - 16 && local30 <= this.anInt5620 * 1547517939 + 16) {
							arg0.method24279(this.aClass104_11, -1263462301);
						}
						return true;
					}
				}
			}
			return true;
		} else {
			@Pc(144) Class472 local144 = arg0.method24241().aClass472_61;
			@Pc(153) int local153 = (int) local144.aFloat325 >> this.anInt5599 * -358186793;
			@Pc(162) int local162 = (int) local144.aFloat327 >> this.anInt5599 * -358186793;
			if (arg0.aByte99 >= this.anInt5603 * -882426473 || local153 < this.anInt5622 * 890109843 || local153 >= this.anInt5619 * -891147229 || local162 < this.anInt5607 * 1220619219 || local162 >= this.anInt5621 * 150058823) {
				return true;
			} else if ((arg2 == null || arg0.aByte100 < arg3 || arg2[arg0.aByte100][local153][local162] != arg4) && arg0.method24285(1236877151) && !arg0.method24282(this.aClass104_11, (short) 26310)) {
				return false;
			} else {
				if (!arg1 && local153 >= this.anInt5601 * 1602382659 - 16 && local153 <= this.anInt5601 * 1602382659 + 16 && local162 >= this.anInt5620 * 1547517939 - 16 && local162 <= this.anInt5620 * 1547517939 + 16) {
					arg0.method24279(this.aClass104_11, -1405666664);
				}
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!tx", name = "cu", descriptor = "(II)I")
	public int method31693(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray62 == null ? 0 : this.anIntArrayArray62[arg0][arg1] & 0xFFFFFF;
	}

	@OriginalMember(owner = "client!tx", name = "ci", descriptor = "(II)I")
	public int method31694(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray62 == null ? 0 : this.anIntArrayArray62[arg0][arg1] & 0xFFFFFF;
	}

	@OriginalMember(owner = "client!tx", name = "cn", descriptor = "(II)I")
	public int method31695(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aByteArrayArray24 == null ? 0 : this.aByteArrayArray24[arg0][arg1] & 0xFF;
	}

	@OriginalMember(owner = "client!tx", name = "cv", descriptor = "(II)I")
	public int method31696(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aByteArrayArray24 == null ? 0 : this.aByteArrayArray24[arg0][arg1] & 0xFF;
	}

	@OriginalMember(owner = "client!tx", name = "dw", descriptor = "(III)Lclient!asm;")
	public Class132_Sub1_Sub3 method31697(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		if (local8 != null) {
			this.method31642(local8.aClass132_Sub1_Sub3_2, (byte) 100);
			if (local8.aClass132_Sub1_Sub3_2 != null) {
				@Pc(22) Class132_Sub1_Sub3 local22 = local8.aClass132_Sub1_Sub3_2;
				local8.aClass132_Sub1_Sub3_2 = null;
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!tx", name = "ca", descriptor = "(II)I")
	public int method31698(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aByteArrayArray23 == null ? 0 : this.aByteArrayArray23[arg0][arg1] & 0xFF;
	}

	@OriginalMember(owner = "client!tx", name = "cx", descriptor = "(II)I")
	public int method31699(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aByteArrayArray25 == null ? 0 : this.aByteArrayArray25[arg0][arg1] & 0xFF;
	}

	@OriginalMember(owner = "client!tx", name = "c", descriptor = "(III)I")
	public int method31700(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return this.aByteArrayArray24 == null ? 0 : this.aByteArrayArray24[arg0][arg1] & 0xFF;
	}

	@OriginalMember(owner = "client!tx", name = "fq", descriptor = "(Lclient!ara;III[Z)Z")
	public boolean method31701(@OriginalArg(0) Class93_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (this.aClass99Array3 != this.aClass99Array1) {
			@Pc(15) int local15 = this.aClass99Array2[arg1].method2480(arg2, arg3, 2105614979);
			for (@Pc(17) int local17 = 0; local17 <= arg1; local17++) {
				@Pc(25) Class99 local25 = this.aClass99Array2[local17];
				if (local25 != null) {
					@Pc(37) int local37 = local15 - local25.method2480(arg2, arg3, 1522566495);
					if (arg4 != null) {
						arg4[local17] = local25.method2488(arg0, arg2, local37, arg3, 0, false);
						if (!arg4[local17]) {
							continue;
						}
					}
					local25.method2485(arg0, arg2, local37, arg3, 0, false);
					local1 = true;
				}
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!tx", name = "cc", descriptor = "(IIILclient!asw;Lclient!asw;)V")
	public void method31702(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class132_Sub1_Sub2 arg3, @OriginalArg(4) Class132_Sub1_Sub2 arg4) {
		@Pc(6) Class572 local6 = this.method31616(arg0, arg1, arg2, (byte) 32);
		if (local6 == null) {
			return;
		}
		local6.aClass132_Sub1_Sub2_1 = arg3;
		local6.aClass132_Sub1_Sub2_2 = arg4;
		@Pc(23) int local23 = this.aClass99Array1 == this.aClass99Array3 ? 1 : 0;
		if (!arg3.method24274((byte) 6)) {
			arg3.aClass132_Sub1_23 = this.aClass132_Sub1Array5[local23];
			this.aClass132_Sub1Array5[local23] = arg3;
		} else if (arg3.method24275((short) -5365)) {
			arg3.aClass132_Sub1_23 = this.aClass132_Sub1Array2[local23];
			this.aClass132_Sub1Array2[local23] = arg3;
		} else {
			arg3.aClass132_Sub1_23 = this.aClass132_Sub1Array1[local23];
			this.aClass132_Sub1Array1[local23] = arg3;
		}
		if (arg4 == null) {
			return;
		}
		if (!arg4.method24274((byte) 6)) {
			arg4.aClass132_Sub1_23 = this.aClass132_Sub1Array5[local23];
			this.aClass132_Sub1Array5[local23] = arg4;
		} else if (arg4.method24275((short) -28924)) {
			arg4.aClass132_Sub1_23 = this.aClass132_Sub1Array2[local23];
			this.aClass132_Sub1Array2[local23] = arg4;
		} else {
			arg4.aClass132_Sub1_23 = this.aClass132_Sub1Array1[local23];
			this.aClass132_Sub1Array1[local23] = arg4;
		}
	}

	@OriginalMember(owner = "client!tx", name = "co", descriptor = "(IIILclient!asv;)V")
	public void method31703(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class132_Sub1_Sub4 arg3) {
		@Pc(6) Class572 local6 = this.method31616(arg0, arg1, arg2, (byte) -82);
		if (local6 == null) {
			return;
		}
		local6.aClass132_Sub1_Sub4_1 = arg3;
		@Pc(20) int local20 = this.aClass99Array3 == this.aClass99Array1 ? 1 : 0;
		if (!arg3.method24274((byte) 6)) {
			arg3.aClass132_Sub1_23 = this.aClass132_Sub1Array5[local20];
			this.aClass132_Sub1Array5[local20] = arg3;
		} else if (arg3.method24275((short) -18134)) {
			arg3.aClass132_Sub1_23 = this.aClass132_Sub1Array2[local20];
			this.aClass132_Sub1Array2[local20] = arg3;
		} else {
			arg3.aClass132_Sub1_23 = this.aClass132_Sub1Array1[local20];
			this.aClass132_Sub1Array1[local20] = arg3;
		}
	}

	@OriginalMember(owner = "client!tx", name = "cr", descriptor = "(IIILclient!asv;)V")
	public void method31704(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class132_Sub1_Sub4 arg3) {
		@Pc(6) Class572 local6 = this.method31616(arg0, arg1, arg2, (byte) -13);
		if (local6 == null) {
			return;
		}
		local6.aClass132_Sub1_Sub4_1 = arg3;
		@Pc(20) int local20 = this.aClass99Array3 == this.aClass99Array1 ? 1 : 0;
		if (!arg3.method24274((byte) 6)) {
			arg3.aClass132_Sub1_23 = this.aClass132_Sub1Array5[local20];
			this.aClass132_Sub1Array5[local20] = arg3;
		} else if (arg3.method24275((short) -25818)) {
			arg3.aClass132_Sub1_23 = this.aClass132_Sub1Array2[local20];
			this.aClass132_Sub1Array2[local20] = arg3;
		} else {
			arg3.aClass132_Sub1_23 = this.aClass132_Sub1Array1[local20];
			this.aClass132_Sub1Array1[local20] = arg3;
		}
	}

	@OriginalMember(owner = "client!tx", name = "cm", descriptor = "(IIILclient!asv;)V")
	public void method31705(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class132_Sub1_Sub4 arg3) {
		@Pc(6) Class572 local6 = this.method31616(arg0, arg1, arg2, (byte) 35);
		if (local6 == null) {
			return;
		}
		local6.aClass132_Sub1_Sub4_1 = arg3;
		@Pc(20) int local20 = this.aClass99Array3 == this.aClass99Array1 ? 1 : 0;
		if (!arg3.method24274((byte) 6)) {
			arg3.aClass132_Sub1_23 = this.aClass132_Sub1Array5[local20];
			this.aClass132_Sub1Array5[local20] = arg3;
		} else if (arg3.method24275((short) -3475)) {
			arg3.aClass132_Sub1_23 = this.aClass132_Sub1Array2[local20];
			this.aClass132_Sub1Array2[local20] = arg3;
		} else {
			arg3.aClass132_Sub1_23 = this.aClass132_Sub1Array1[local20];
			this.aClass132_Sub1Array1[local20] = arg3;
		}
	}

	@OriginalMember(owner = "client!tx", name = "cq", descriptor = "(IIILclient!asv;)V")
	public void method31706(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class132_Sub1_Sub4 arg3) {
		@Pc(6) Class572 local6 = this.method31616(arg0, arg1, arg2, (byte) 57);
		if (local6 == null) {
			return;
		}
		local6.aClass132_Sub1_Sub4_1 = arg3;
		@Pc(20) int local20 = this.aClass99Array3 == this.aClass99Array1 ? 1 : 0;
		if (!arg3.method24274((byte) 6)) {
			arg3.aClass132_Sub1_23 = this.aClass132_Sub1Array5[local20];
			this.aClass132_Sub1Array5[local20] = arg3;
		} else if (arg3.method24275((short) -1425)) {
			arg3.aClass132_Sub1_23 = this.aClass132_Sub1Array2[local20];
			this.aClass132_Sub1Array2[local20] = arg3;
		} else {
			arg3.aClass132_Sub1_23 = this.aClass132_Sub1Array1[local20];
			this.aClass132_Sub1Array1[local20] = arg3;
		}
	}

	@OriginalMember(owner = "client!tx", name = "ch", descriptor = "(IIIILclient!ast;)V")
	public void method31707(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class132_Sub1_Sub5 arg4) {
		@Pc(6) Class572 local6 = this.method31616(arg0, arg1, arg2, (byte) -80);
		if (local6 == null) {
			return;
		}
		arg4.method24236(new Class472((float) (this.anInt5608 * -996240773 + (arg1 << this.anInt5599 * -358186793)), (float) arg3, (float) ((arg2 << this.anInt5599 * -358186793) + this.anInt5608 * -996240773)));
		local6.aClass132_Sub1_Sub5_1 = arg4;
		@Pc(51) int local51 = this.aClass99Array3 == this.aClass99Array1 ? 1 : 0;
		if (!arg4.method24274((byte) 6)) {
			arg4.aClass132_Sub1_23 = this.aClass132_Sub1Array5[local51];
			this.aClass132_Sub1Array5[local51] = arg4;
		} else if (arg4.method24275((short) -28075)) {
			arg4.aClass132_Sub1_23 = this.aClass132_Sub1Array2[local51];
			this.aClass132_Sub1Array2[local51] = arg4;
		} else {
			arg4.aClass132_Sub1_23 = this.aClass132_Sub1Array1[local51];
			this.aClass132_Sub1Array1[local51] = arg4;
		}
	}

	@OriginalMember(owner = "client!tx", name = "cb", descriptor = "(IIIILclient!ast;)V")
	public void method31708(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class132_Sub1_Sub5 arg4) {
		@Pc(6) Class572 local6 = this.method31616(arg0, arg1, arg2, (byte) -23);
		if (local6 == null) {
			return;
		}
		arg4.method24236(new Class472((float) (this.anInt5608 * -996240773 + (arg1 << this.anInt5599 * -358186793)), (float) arg3, (float) ((arg2 << this.anInt5599 * -358186793) + this.anInt5608 * -996240773)));
		local6.aClass132_Sub1_Sub5_1 = arg4;
		@Pc(51) int local51 = this.aClass99Array3 == this.aClass99Array1 ? 1 : 0;
		if (!arg4.method24274((byte) 6)) {
			arg4.aClass132_Sub1_23 = this.aClass132_Sub1Array5[local51];
			this.aClass132_Sub1Array5[local51] = arg4;
		} else if (arg4.method24275((short) -5660)) {
			arg4.aClass132_Sub1_23 = this.aClass132_Sub1Array2[local51];
			this.aClass132_Sub1Array2[local51] = arg4;
		} else {
			arg4.aClass132_Sub1_23 = this.aClass132_Sub1Array1[local51];
			this.aClass132_Sub1Array1[local51] = arg4;
		}
	}

	@OriginalMember(owner = "client!tx", name = "cs", descriptor = "(IIIILclient!ast;)V")
	public void method31709(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class132_Sub1_Sub5 arg4) {
		@Pc(6) Class572 local6 = this.method31616(arg0, arg1, arg2, (byte) 33);
		if (local6 == null) {
			return;
		}
		arg4.method24236(new Class472((float) (this.anInt5608 * -996240773 + (arg1 << this.anInt5599 * -358186793)), (float) arg3, (float) ((arg2 << this.anInt5599 * -358186793) + this.anInt5608 * -996240773)));
		local6.aClass132_Sub1_Sub5_1 = arg4;
		@Pc(51) int local51 = this.aClass99Array3 == this.aClass99Array1 ? 1 : 0;
		if (!arg4.method24274((byte) 6)) {
			arg4.aClass132_Sub1_23 = this.aClass132_Sub1Array5[local51];
			this.aClass132_Sub1Array5[local51] = arg4;
		} else if (arg4.method24275((short) -27545)) {
			arg4.aClass132_Sub1_23 = this.aClass132_Sub1Array2[local51];
			this.aClass132_Sub1Array2[local51] = arg4;
		} else {
			arg4.aClass132_Sub1_23 = this.aClass132_Sub1Array1[local51];
			this.aClass132_Sub1Array1[local51] = arg4;
		}
	}

	@OriginalMember(owner = "client!tx", name = "cy", descriptor = "(IIILclient!asw;Lclient!asw;)V")
	public void method31710(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class132_Sub1_Sub2 arg3, @OriginalArg(4) Class132_Sub1_Sub2 arg4) {
		@Pc(6) Class572 local6 = this.method31616(arg0, arg1, arg2, (byte) 4);
		if (local6 == null) {
			return;
		}
		local6.aClass132_Sub1_Sub2_1 = arg3;
		local6.aClass132_Sub1_Sub2_2 = arg4;
		@Pc(23) int local23 = this.aClass99Array1 == this.aClass99Array3 ? 1 : 0;
		if (!arg3.method24274((byte) 6)) {
			arg3.aClass132_Sub1_23 = this.aClass132_Sub1Array5[local23];
			this.aClass132_Sub1Array5[local23] = arg3;
		} else if (arg3.method24275((short) -4138)) {
			arg3.aClass132_Sub1_23 = this.aClass132_Sub1Array2[local23];
			this.aClass132_Sub1Array2[local23] = arg3;
		} else {
			arg3.aClass132_Sub1_23 = this.aClass132_Sub1Array1[local23];
			this.aClass132_Sub1Array1[local23] = arg3;
		}
		if (arg4 == null) {
			return;
		}
		if (!arg4.method24274((byte) 6)) {
			arg4.aClass132_Sub1_23 = this.aClass132_Sub1Array5[local23];
			this.aClass132_Sub1Array5[local23] = arg4;
		} else if (arg4.method24275((short) -3628)) {
			arg4.aClass132_Sub1_23 = this.aClass132_Sub1Array2[local23];
			this.aClass132_Sub1Array2[local23] = arg4;
		} else {
			arg4.aClass132_Sub1_23 = this.aClass132_Sub1Array1[local23];
			this.aClass132_Sub1Array1[local23] = arg4;
		}
	}

	@OriginalMember(owner = "client!tx", name = "fh", descriptor = "(Ljava/util/HashMap;)V")
	public void method31711(@OriginalArg(0) HashMap arg0) {
		this.aHashMap12 = arg0;
	}

	@OriginalMember(owner = "client!tx", name = "cz", descriptor = "(IIILclient!asw;Lclient!asw;)V")
	public void method31712(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class132_Sub1_Sub2 arg3, @OriginalArg(4) Class132_Sub1_Sub2 arg4) {
		@Pc(6) Class572 local6 = this.method31616(arg0, arg1, arg2, (byte) -34);
		if (local6 == null) {
			return;
		}
		local6.aClass132_Sub1_Sub2_1 = arg3;
		local6.aClass132_Sub1_Sub2_2 = arg4;
		@Pc(23) int local23 = this.aClass99Array1 == this.aClass99Array3 ? 1 : 0;
		if (!arg3.method24274((byte) 6)) {
			arg3.aClass132_Sub1_23 = this.aClass132_Sub1Array5[local23];
			this.aClass132_Sub1Array5[local23] = arg3;
		} else if (arg3.method24275((short) -12846)) {
			arg3.aClass132_Sub1_23 = this.aClass132_Sub1Array2[local23];
			this.aClass132_Sub1Array2[local23] = arg3;
		} else {
			arg3.aClass132_Sub1_23 = this.aClass132_Sub1Array1[local23];
			this.aClass132_Sub1Array1[local23] = arg3;
		}
		if (arg4 == null) {
			return;
		}
		if (!arg4.method24274((byte) 6)) {
			arg4.aClass132_Sub1_23 = this.aClass132_Sub1Array5[local23];
			this.aClass132_Sub1Array5[local23] = arg4;
		} else if (arg4.method24275((short) -19171)) {
			arg4.aClass132_Sub1_23 = this.aClass132_Sub1Array2[local23];
			this.aClass132_Sub1Array2[local23] = arg4;
		} else {
			arg4.aClass132_Sub1_23 = this.aClass132_Sub1Array1[local23];
			this.aClass132_Sub1Array1[local23] = arg4;
		}
	}

	@OriginalMember(owner = "client!tx", name = "ck", descriptor = "(IIILclient!asm;Lclient!asm;)V")
	public void method31713(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class132_Sub1_Sub3 arg3, @OriginalArg(4) Class132_Sub1_Sub3 arg4) {
		@Pc(6) Class572 local6 = this.method31616(arg0, arg1, arg2, (byte) -71);
		if (local6 == null) {
			return;
		}
		local6.aClass132_Sub1_Sub3_1 = arg3;
		local6.aClass132_Sub1_Sub3_2 = arg4;
		@Pc(24) int local24 = this.aClass99Array3 == this.aClass99Array1 ? 1 : 0;
		if (!arg3.method24274((byte) 6)) {
			arg3.aClass132_Sub1_23 = this.aClass132_Sub1Array5[local24];
			this.aClass132_Sub1Array5[local24] = arg3;
		} else if (arg3.method24275((short) -7722)) {
			arg3.aClass132_Sub1_23 = this.aClass132_Sub1Array2[local24];
			this.aClass132_Sub1Array2[local24] = arg3;
		} else {
			arg3.aClass132_Sub1_23 = this.aClass132_Sub1Array1[local24];
			this.aClass132_Sub1Array1[local24] = arg3;
		}
		if (arg4 == null) {
			return;
		}
		if (!arg4.method24274((byte) 6)) {
			arg4.aClass132_Sub1_23 = this.aClass132_Sub1Array5[local24];
			this.aClass132_Sub1Array5[local24] = arg4;
		} else if (arg4.method24275((short) -126)) {
			arg4.aClass132_Sub1_23 = this.aClass132_Sub1Array2[local24];
			this.aClass132_Sub1Array2[local24] = arg4;
		} else {
			arg4.aClass132_Sub1_23 = this.aClass132_Sub1Array1[local24];
			this.aClass132_Sub1Array1[local24] = arg4;
		}
	}

	@OriginalMember(owner = "client!tx", name = "cj", descriptor = "(IIILclient!asm;Lclient!asm;)V")
	public void method31714(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class132_Sub1_Sub3 arg3, @OriginalArg(4) Class132_Sub1_Sub3 arg4) {
		@Pc(6) Class572 local6 = this.method31616(arg0, arg1, arg2, (byte) 37);
		if (local6 == null) {
			return;
		}
		local6.aClass132_Sub1_Sub3_1 = arg3;
		local6.aClass132_Sub1_Sub3_2 = arg4;
		@Pc(24) int local24 = this.aClass99Array3 == this.aClass99Array1 ? 1 : 0;
		if (!arg3.method24274((byte) 6)) {
			arg3.aClass132_Sub1_23 = this.aClass132_Sub1Array5[local24];
			this.aClass132_Sub1Array5[local24] = arg3;
		} else if (arg3.method24275((short) -27012)) {
			arg3.aClass132_Sub1_23 = this.aClass132_Sub1Array2[local24];
			this.aClass132_Sub1Array2[local24] = arg3;
		} else {
			arg3.aClass132_Sub1_23 = this.aClass132_Sub1Array1[local24];
			this.aClass132_Sub1Array1[local24] = arg3;
		}
		if (arg4 == null) {
			return;
		}
		if (!arg4.method24274((byte) 6)) {
			arg4.aClass132_Sub1_23 = this.aClass132_Sub1Array5[local24];
			this.aClass132_Sub1Array5[local24] = arg4;
		} else if (arg4.method24275((short) -241)) {
			arg4.aClass132_Sub1_23 = this.aClass132_Sub1Array2[local24];
			this.aClass132_Sub1Array2[local24] = arg4;
		} else {
			arg4.aClass132_Sub1_23 = this.aClass132_Sub1Array1[local24];
			this.aClass132_Sub1Array1[local24] = arg4;
		}
	}

	@OriginalMember(owner = "client!tx", name = "ex", descriptor = "(IIII[[[B[I[I[I[I[IIBIIZZIZ)V")
	public void method31715(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[][][] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) byte arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14, @OriginalArg(15) boolean arg15, @OriginalArg(16) int arg16, @OriginalArg(17) boolean arg17) {
		this.aClass598_2.aBoolean832 = true;
		this.aBoolean828 = arg15;
		this.anInt5601 = (arg1 >> this.anInt5599 * -358186793) * 807663979;
		this.anInt5620 = (arg3 >> -358186793 * this.anInt5599) * -893882053;
		this.anInt5612 = arg1 * -541960217;
		this.anInt5613 = arg3 * 2053796035;
		this.anInt5614 = arg2 * 1575019517;
		this.anInt5622 = this.anInt5601 * 1466454929 - this.anInt5616 * -921973039;
		if (this.anInt5622 * 890109843 < 0) {
			this.anInt5617 = -(this.anInt5622 * -699365257);
			this.anInt5622 = 0;
		} else {
			this.anInt5617 = 0;
		}
		this.anInt5607 = this.anInt5620 * -1701337247 - this.anInt5616 * 845404177;
		if (this.anInt5607 * 1220619219 < 0) {
			this.anInt5618 = -(this.anInt5607 * -1954680553);
			this.anInt5607 = 0;
		} else {
			this.anInt5618 = 0;
		}
		this.anInt5619 = this.anInt5616 * -1677097567 + this.anInt5601 * 1251714657;
		if (this.anInt5619 * -891147229 > this.anInt5604 * -200159665) {
			this.anInt5619 = this.anInt5604 * -1912204827;
		}
		this.anInt5621 = this.anInt5616 * 1178488421 + this.anInt5620 * -189865995;
		if (this.anInt5621 * 150058823 > this.anInt5605 * -1943751559) {
			this.anInt5621 = this.anInt5605 * 2064881215;
		}
		@Pc(156) boolean[][] local156 = this.aBooleanArrayArray14;
		@Pc(159) boolean[][] local159 = this.aBooleanArrayArray13;
		@Pc(164) int local164;
		@Pc(179) int local179;
		if (this.aBoolean828) {
			for (local164 = 0; local164 < this.anInt5616 * -93916925 + 2 + this.anInt5616 * -93916925; local164++) {
				local179 = 0;
				@Pc(181) int local181 = 0;
				for (@Pc(183) int local183 = 0; local183 < this.anInt5616 * -93916925 + 2 + this.anInt5616 * -93916925; local183++) {
					if (local183 > 1) {
						this.anIntArray476[local183 - 2] = local179;
					}
					local179 = local181;
					@Pc(220) int local220 = local164 + (this.anInt5601 * 1602382659 - this.anInt5616 * -93916925);
					@Pc(232) int local232 = local183 + (this.anInt5620 * 1547517939 - this.anInt5616 * -93916925);
					@Pc(255) int local255;
					if (local220 >= 0 && local232 >= 0 && local220 < this.anInt5604 * -200159665 && local232 < this.anInt5605 * -1943751559) {
						local255 = local220 << this.anInt5599 * -358186793;
						@Pc(262) int local262 = local232 << this.anInt5599 * -358186793;
						@Pc(284) int local284 = this.aClass99Array2[this.aClass99Array2.length - 1].method2482(local220, local232, -650372815) - (0x3E8 << this.anInt5599 * -358186793 - 7);
						@Pc(325) int local325 = (this.aClass99Array3 == null ? this.aClass99Array2[0].method2482(local220, local232, -1096438030) + this.anInt5600 * -77997759 : this.aClass99Array3[0].method2482(local220, local232, -1361235100) + this.anInt5600 * -77997759) + (0x3E8 << this.anInt5599 * -358186793 - 7);
						local181 = this.aClass104_11.method20659(local255, local284, local262, local255, local325, local262);
						this.aBooleanArrayArray13[local164][local183] = local181 == 0;
					} else {
						local181 = -1;
						this.aBooleanArrayArray13[local164][local183] = false;
					}
					if (local164 > 0 && local183 > 0) {
						local255 = this.anIntArray476[local183 - 1] & this.anIntArray476[local183] & local179 & local181;
						this.aBooleanArrayArray14[local164 - 1][local183 - 1] = local255 == 0;
					}
				}
				this.anIntArray476[this.anInt5616 * -93916925 + this.anInt5616 * -93916925] = local179;
				this.anIntArray476[this.anInt5616 * -93916925 + this.anInt5616 * -93916925 + 1] = local181;
			}
			if (arg17) {
				this.aClass598_2.anIntArray483 = arg5;
				this.aClass598_2.anIntArray484 = arg6;
				this.aClass598_2.anIntArray481 = arg7;
				this.aClass598_2.anIntArray486 = arg8;
				this.aClass598_2.anIntArray485 = arg9;
				this.aClass598_2.method31972(this.aClass104_11, arg10);
			} else {
				this.aClass598_2.aBoolean832 = false;
			}
		} else {
			if (this.aBooleanArrayArray12 == null) {
				this.aBooleanArrayArray12 = new boolean[this.anInt5616 * -93916925 + 2 + this.anInt5616 * -93916925][this.anInt5616 * -93916925 + 2 + this.anInt5616 * -93916925];
			}
			for (local164 = 0; local164 < this.aBooleanArrayArray12.length; local164++) {
				for (local179 = 0; local179 < this.aBooleanArrayArray12[0].length; local179++) {
					this.aBooleanArrayArray12[local164][local179] = true;
				}
			}
			this.aBooleanArrayArray13 = this.aBooleanArrayArray12;
			this.aBooleanArrayArray14 = this.aBooleanArrayArray12;
			this.anInt5622 = 0;
			this.anInt5607 = 0;
			this.anInt5619 = this.anInt5604 * -1912204827;
			this.anInt5621 = this.anInt5605 * 2064881215;
			this.aClass598_2.aBoolean832 = false;
		}
		Class574.method31527(this, this.aClass104_11, (byte) -4);
		if (!this.aClass569_2.aBoolean823) {
			@Pc(556) Iterator local556 = this.aClass569_2.aList22.iterator();
			while (local556.hasNext()) {
				@Pc(563) Class573 local563 = (Class573) local556.next();
				local556.remove();
				Class305.method26891(local563, (byte) 0);
			}
		}
		if (this.aBoolean826) {
			for (local164 = 0; local164 < this.anInt5625 * 809266399; local164++) {
				this.aClass597Array1[local164].method31947(arg0, arg14, -715634078);
			}
		}
		if (this.aClass572ArrayArrayArray2 != null) {
			this.method31613(true, 870300168);
			this.aClass104_11.method20556(-1, new Class237(1583160, 40, 127, 63, 0, 0, 0));
			this.method31654(true, arg4, arg10, arg11, arg16);
			this.aClass104_11.method20558();
			this.method31613(false, 870300168);
		}
		this.method31654(false, arg4, arg10, arg11, arg16);
		if (!this.aBoolean828) {
			this.aBooleanArrayArray14 = local156;
			this.aBooleanArrayArray13 = local159;
		}
	}

	@OriginalMember(owner = "client!tx", name = "dd", descriptor = "()V")
	public void method31716() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5626 * -1409302901; local1++) {
			@Pc(12) Class132_Sub1_Sub1 local12 = this.aClass132_Sub1_Sub1Array1[local1];
			this.method31618(local12, true, 964029282);
			this.aClass132_Sub1_Sub1Array1[local1] = null;
		}
		this.anInt5626 = 0;
	}

	@OriginalMember(owner = "client!tx", name = "bu", descriptor = "(II)V")
	public void method31717(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!tx", name = "da", descriptor = "(III)Lclient!asw;")
	public Class132_Sub1_Sub2 method31718(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		if (local8 != null) {
			this.method31642(local8.aClass132_Sub1_Sub2_1, (byte) 21);
			if (local8.aClass132_Sub1_Sub2_1 != null) {
				@Pc(22) Class132_Sub1_Sub2 local22 = local8.aClass132_Sub1_Sub2_1;
				local8.aClass132_Sub1_Sub2_1 = null;
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!tx", name = "dt", descriptor = "(III)Lclient!asw;")
	public Class132_Sub1_Sub2 method31719(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		if (local8 != null) {
			this.method31642(local8.aClass132_Sub1_Sub2_1, (byte) 90);
			if (local8.aClass132_Sub1_Sub2_1 != null) {
				@Pc(22) Class132_Sub1_Sub2 local22 = local8.aClass132_Sub1_Sub2_1;
				local8.aClass132_Sub1_Sub2_1 = null;
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!tx", name = "do", descriptor = "(III)Lclient!asw;")
	public Class132_Sub1_Sub2 method31720(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		if (local8 != null) {
			this.method31642(local8.aClass132_Sub1_Sub2_1, (byte) 11);
			if (local8.aClass132_Sub1_Sub2_1 != null) {
				@Pc(22) Class132_Sub1_Sub2 local22 = local8.aClass132_Sub1_Sub2_1;
				local8.aClass132_Sub1_Sub2_1 = null;
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!tx", name = "dz", descriptor = "(III)Lclient!asw;")
	public Class132_Sub1_Sub2 method31721(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		if (local8 != null) {
			this.method31642(local8.aClass132_Sub1_Sub2_1, (byte) 115);
			if (local8.aClass132_Sub1_Sub2_1 != null) {
				@Pc(22) Class132_Sub1_Sub2 local22 = local8.aClass132_Sub1_Sub2_1;
				local8.aClass132_Sub1_Sub2_1 = null;
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!tx", name = "dv", descriptor = "(III)Lclient!asw;")
	public Class132_Sub1_Sub2 method31722(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		if (local8 != null) {
			this.method31642(local8.aClass132_Sub1_Sub2_2, (byte) 21);
			if (local8.aClass132_Sub1_Sub2_2 != null) {
				@Pc(22) Class132_Sub1_Sub2 local22 = local8.aClass132_Sub1_Sub2_2;
				local8.aClass132_Sub1_Sub2_2 = null;
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!tx", name = "df", descriptor = "(III)Lclient!asm;")
	public Class132_Sub1_Sub3 method31723(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		if (local8 != null) {
			this.method31642(local8.aClass132_Sub1_Sub3_2, (byte) 84);
			if (local8.aClass132_Sub1_Sub3_2 != null) {
				@Pc(22) Class132_Sub1_Sub3 local22 = local8.aClass132_Sub1_Sub3_2;
				local8.aClass132_Sub1_Sub3_2 = null;
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!tx", name = "ak", descriptor = "(Lclient!ara;III[ZI)V")
	public void method31724(@OriginalArg(0) Class93_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4, @OriginalArg(5) int arg5) {
		if (this.aClass99Array1 == this.aClass99Array3) {
			return;
		}
		@Pc(13) int local13 = this.aClass99Array2[arg1].method2480(arg2, arg3, 1401141310);
		for (@Pc(15) int local15 = 0; local15 <= arg1; local15++) {
			if (arg4 == null || arg4[local15]) {
				@Pc(30) Class99 local30 = this.aClass99Array2[local15];
				if (local30 != null) {
					local30.method2496(arg0, arg2, local13 - local30.method2480(arg2, arg3, 590593653), arg3, 0, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!tx", name = "dc", descriptor = "(III)Lclient!asw;")
	public Class132_Sub1_Sub2 method31725(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		if (local8 != null) {
			this.method31642(local8.aClass132_Sub1_Sub2_2, (byte) 43);
			if (local8.aClass132_Sub1_Sub2_2 != null) {
				@Pc(22) Class132_Sub1_Sub2 local22 = local8.aClass132_Sub1_Sub2_2;
				local8.aClass132_Sub1_Sub2_2 = null;
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!tx", name = "di", descriptor = "(III)Lclient!asm;")
	public Class132_Sub1_Sub3 method31726(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		if (local8 != null) {
			this.method31642(local8.aClass132_Sub1_Sub3_1, (byte) 49);
			if (local8.aClass132_Sub1_Sub3_1 != null) {
				@Pc(22) Class132_Sub1_Sub3 local22 = local8.aClass132_Sub1_Sub3_1;
				local8.aClass132_Sub1_Sub3_1 = null;
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!tx", name = "dk", descriptor = "(III)Lclient!asm;")
	public Class132_Sub1_Sub3 method31727(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		if (local8 != null) {
			this.method31642(local8.aClass132_Sub1_Sub3_1, (byte) 118);
			if (local8.aClass132_Sub1_Sub3_1 != null) {
				@Pc(22) Class132_Sub1_Sub3 local22 = local8.aClass132_Sub1_Sub3_1;
				local8.aClass132_Sub1_Sub3_1 = null;
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!tx", name = "dn", descriptor = "(III)Lclient!asm;")
	public Class132_Sub1_Sub3 method31728(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		if (local8 != null) {
			this.method31642(local8.aClass132_Sub1_Sub3_2, (byte) 116);
			if (local8.aClass132_Sub1_Sub3_2 != null) {
				@Pc(22) Class132_Sub1_Sub3 local22 = local8.aClass132_Sub1_Sub3_2;
				local8.aClass132_Sub1_Sub3_2 = null;
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!tx", name = "cw", descriptor = "(II)I")
	public int method31729(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aByteArrayArray22 == null ? 0 : this.aByteArrayArray22[arg0][arg1] & 0xFF;
	}

	@OriginalMember(owner = "client!tx", name = "fa", descriptor = "(Lclient!ara;III[Z)Z")
	public boolean method31730(@OriginalArg(0) Class93_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (this.aClass99Array3 != this.aClass99Array1) {
			@Pc(15) int local15 = this.aClass99Array2[arg1].method2480(arg2, arg3, 947871754);
			for (@Pc(17) int local17 = 0; local17 <= arg1; local17++) {
				@Pc(25) Class99 local25 = this.aClass99Array2[local17];
				if (local25 != null) {
					@Pc(37) int local37 = local15 - local25.method2480(arg2, arg3, 855703812);
					if (arg4 != null) {
						arg4[local17] = local25.method2488(arg0, arg2, local37, arg3, 0, false);
						if (!arg4[local17]) {
							continue;
						}
					}
					local25.method2485(arg0, arg2, local37, arg3, 0, false);
					local1 = true;
				}
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!tx", name = "fr", descriptor = "(Ljava/util/HashMap;)V")
	public void method31731(@OriginalArg(0) HashMap arg0) {
		this.aHashMap12 = arg0;
	}

	@OriginalMember(owner = "client!tx", name = "ft", descriptor = "(Lclient!alh;Z[[[BIB)Z")
	boolean method31732(@OriginalArg(0) Class132_Sub1 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte[][][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		if (!this.aBoolean828) {
			return false;
		} else if (arg0 instanceof Class132_Sub1_Sub1) {
			@Pc(11) short local11 = ((Class132_Sub1_Sub1) arg0).aShort130;
			@Pc(15) short local15 = ((Class132_Sub1_Sub1) arg0).aShort127;
			@Pc(19) short local19 = ((Class132_Sub1_Sub1) arg0).aShort129;
			@Pc(23) short local23 = ((Class132_Sub1_Sub1) arg0).aShort128;
			for (@Pc(25) int local25 = local19; local25 <= local11; local25++) {
				for (@Pc(30) int local30 = local23; local30 <= local15; local30++) {
					if (arg0.aByte99 < this.anInt5603 * -882426473 && local25 >= this.anInt5622 * 890109843 && local25 < this.anInt5619 * -891147229 && local30 >= this.anInt5607 * 1220619219 && local30 < this.anInt5621 * 150058823) {
						if ((arg2 == null || arg0.aByte100 < arg3 || arg2[arg0.aByte100][local25][local30] != arg4) && arg0.method24285(1236877151) && !arg0.method24282(this.aClass104_11, (short) 26462)) {
							return false;
						}
						if (!arg1 && local25 >= this.anInt5601 * 1602382659 - 16 && local25 <= this.anInt5601 * 1602382659 + 16 && local30 >= this.anInt5620 * 1547517939 - 16 && local30 <= this.anInt5620 * 1547517939 + 16) {
							arg0.method24279(this.aClass104_11, -782107998);
						}
						return true;
					}
				}
			}
			return true;
		} else {
			@Pc(144) Class472 local144 = arg0.method24241().aClass472_61;
			@Pc(153) int local153 = (int) local144.aFloat325 >> this.anInt5599 * -358186793;
			@Pc(162) int local162 = (int) local144.aFloat327 >> this.anInt5599 * -358186793;
			if (arg0.aByte99 >= this.anInt5603 * -882426473 || local153 < this.anInt5622 * 890109843 || local153 >= this.anInt5619 * -891147229 || local162 < this.anInt5607 * 1220619219 || local162 >= this.anInt5621 * 150058823) {
				return true;
			} else if ((arg2 == null || arg0.aByte100 < arg3 || arg2[arg0.aByte100][local153][local162] != arg4) && arg0.method24285(1236877151) && !arg0.method24282(this.aClass104_11, (short) 23729)) {
				return false;
			} else {
				if (!arg1 && local153 >= this.anInt5601 * 1602382659 - 16 && local153 <= this.anInt5601 * 1602382659 + 16 && local162 >= this.anInt5620 * 1547517939 - 16 && local162 <= this.anInt5620 * 1547517939 + 16) {
					arg0.method24279(this.aClass104_11, -274394269);
				}
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!tx", name = "dl", descriptor = "(III)Lclient!asv;")
	public Class132_Sub1_Sub4 method31733(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		if (local8 == null) {
			return null;
		}
		this.method31642(local8.aClass132_Sub1_Sub4_1, (byte) 125);
		if (local8.aClass132_Sub1_Sub4_1 == null) {
			return null;
		} else {
			@Pc(24) Class132_Sub1_Sub4 local24 = local8.aClass132_Sub1_Sub4_1;
			local8.aClass132_Sub1_Sub4_1 = null;
			return local24;
		}
	}

	@OriginalMember(owner = "client!tx", name = "dp", descriptor = "(III)Lclient!ast;")
	public Class132_Sub1_Sub5 method31734(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		if (local8 == null) {
			return null;
		} else {
			@Pc(16) Class132_Sub1_Sub5 local16 = local8.aClass132_Sub1_Sub5_1;
			local8.aClass132_Sub1_Sub5_1 = null;
			this.method31642(local16, (byte) 70);
			return local16;
		}
	}

	@OriginalMember(owner = "client!tx", name = "dy", descriptor = "(III)Lclient!ast;")
	public Class132_Sub1_Sub5 method31735(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		if (local8 == null) {
			return null;
		} else {
			@Pc(16) Class132_Sub1_Sub5 local16 = local8.aClass132_Sub1_Sub5_1;
			local8.aClass132_Sub1_Sub5_1 = null;
			this.method31642(local16, (byte) 72);
			return local16;
		}
	}

	@OriginalMember(owner = "client!tx", name = "cl", descriptor = "(II)I")
	public int method31736(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aShortArrayArray5 == null ? 0 : this.aShortArrayArray5[arg0][arg1] & 0xFFFF;
	}

	@OriginalMember(owner = "client!tx", name = "dh", descriptor = "(IIILclient!td;)Lclient!ash;")
	public Class132_Sub1_Sub1 method31737(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Interface62 arg3) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		if (local8 == null) {
			return null;
		}
		for (@Pc(16) Class590 local16 = local8.aClass590_1; local16 != null; local16 = local16.aClass590_2) {
			@Pc(22) Class132_Sub1_Sub1 local22 = local16.aClass132_Sub1_Sub1_1;
			if ((arg3 == null || arg3.method31548(local22, 1623773575)) && local22.aShort129 == arg1 && arg2 == local22.aShort128) {
				this.method31618(local22, false, 964029282);
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!tx", name = "dx", descriptor = "(Lclient!ash;Z)V")
	void method31738(@OriginalArg(0) Class132_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(11) int local11 = Math.min(this.anInt5604 * -200159665 - 1, Math.max(0, arg0.aShort129));
		@Pc(23) int local23 = Math.min(this.anInt5604 * -200159665 - 1, Math.max(0, arg0.aShort130));
		@Pc(35) int local35 = Math.min(this.anInt5605 * -1943751559 - 1, Math.max(0, arg0.aShort128));
		@Pc(47) int local47 = Math.min(this.anInt5605 * -1943751559 - 1, Math.max(0, arg0.aShort127));
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
							local72.method31869((byte) -73);
							break;
						}
						local74 = local72;
						local72 = local72.aClass590_2;
					}
				}
			}
		}
		if (!arg1) {
			this.method31642(arg0, (byte) 67);
		}
	}

	@OriginalMember(owner = "client!tx", name = "dg", descriptor = "(Lclient!alh;)V")
	void method31739(@OriginalArg(0) Class132_Sub1 arg0) {
		if (arg0 == null) {
			return;
		}
		arg0.method24242();
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

	@OriginalMember(owner = "client!tx", name = "de", descriptor = "(Lclient!alh;)V")
	void method31740(@OriginalArg(0) Class132_Sub1 arg0) {
		if (arg0 == null) {
			return;
		}
		arg0.method24242();
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

	@OriginalMember(owner = "client!tx", name = "dj", descriptor = "(Lclient!alh;)V")
	void method31741(@OriginalArg(0) Class132_Sub1 arg0) {
		if (arg0 == null) {
			return;
		}
		arg0.method24242();
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

	@OriginalMember(owner = "client!tx", name = "eo", descriptor = "(III)Lclient!asw;")
	public Class132_Sub1_Sub2 method31742(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass132_Sub1_Sub2_1;
	}

	@OriginalMember(owner = "client!tx", name = "ey", descriptor = "(III)Lclient!asw;")
	public Class132_Sub1_Sub2 method31743(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass132_Sub1_Sub2_1;
	}

	@OriginalMember(owner = "client!tx", name = "eu", descriptor = "(III)Lclient!asw;")
	public Class132_Sub1_Sub2 method31744(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass132_Sub1_Sub2_1;
	}

	@OriginalMember(owner = "client!tx", name = "ee", descriptor = "(III)Lclient!asw;")
	public Class132_Sub1_Sub2 method31745(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass132_Sub1_Sub2_2;
	}

	@OriginalMember(owner = "client!tx", name = "en", descriptor = "(Lclient!alh;IIIII)V")
	void method31746(@OriginalArg(0) Class132_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg5 + arg3;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (this.anInt5603 * -882426473 != local17) {
				for (@Pc(31) int local31 = local3; local31 <= local7; local31++) {
					if (local31 >= 0 && local31 < this.anInt5604 * -200159665) {
						for (@Pc(45) int local45 = local11; local45 <= local15; local45++) {
							if (local45 >= 0 && local45 < this.anInt5605 * -1943751559 && (!local1 || local31 >= local7 || local45 >= local15 || local45 < arg3 && arg2 != local31)) {
								@Pc(81) Class572 local81 = this.aClass572ArrayArrayArray3[local17][local31][local45];
								if (local81 != null) {
									@Pc(176) int local176 = (this.aClass99Array1[local17].method2482(local31, local45, -423059117) + this.aClass99Array1[local17].method2482(local31 + 1, local45, -342479010) + this.aClass99Array1[local17].method2482(local31, local45 + 1, -944833804) + this.aClass99Array1[local17].method2482(local31 + 1, local45 + 1, -1584741185)) / 4 - (this.aClass99Array1[arg1].method2482(arg2, arg3, -170260862) + this.aClass99Array1[arg1].method2482(arg2 + 1, arg3, -1226579555) + this.aClass99Array1[arg1].method2482(arg2, arg3 + 1, -1999290923) + this.aClass99Array1[arg1].method2482(arg2 + 1, arg3 + 1, -549129682)) / 4;
									@Pc(179) Class132_Sub1_Sub2 local179 = local81.aClass132_Sub1_Sub2_1;
									@Pc(182) Class132_Sub1_Sub2 local182 = local81.aClass132_Sub1_Sub2_2;
									if (local179 != null && local179.method24273(-885613508)) {
										arg0.method24281(this.aClass104_11, local179, this.anInt5600 * -77997759 * (local31 - arg2) + (1 - arg4) * -996240773 * this.anInt5608, local176, this.anInt5600 * -77997759 * (local45 - arg3) + this.anInt5608 * -996240773 * (1 - arg5), local1, (byte) -122);
									}
									if (local182 != null && local182.method24273(-384627955)) {
										arg0.method24281(this.aClass104_11, local182, (local31 - arg2) * this.anInt5600 * -77997759 + (1 - arg4) * this.anInt5608 * -996240773, local176, this.anInt5608 * -996240773 * (1 - arg5) + (local45 - arg3) * this.anInt5600 * -77997759, local1, (byte) -77);
									}
									for (@Pc(283) Class590 local283 = local81.aClass590_1; local283 != null; local283 = local283.aClass590_2) {
										@Pc(288) Class132_Sub1_Sub1 local288 = local283.aClass132_Sub1_Sub1_1;
										if (local288 != null && local288.method24273(-1776742884) && (local288.aShort129 == local31 || local3 == local31) && (local45 == local288.aShort128 || local11 == local45)) {
											@Pc(318) int local318 = local288.aShort130 - local288.aShort129 + 1;
											@Pc(326) int local326 = local288.aShort127 - local288.aShort128 + 1;
											arg0.method24281(this.aClass104_11, local288, (local288.aShort129 - arg2) * -77997759 * this.anInt5600 + (local318 - arg4) * this.anInt5608 * -996240773, local176, (local288.aShort128 - arg3) * this.anInt5600 * -77997759 + (local326 - arg5) * -996240773 * this.anInt5608, local1, (byte) -78);
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

	@OriginalMember(owner = "client!tx", name = "ei", descriptor = "(III)Lclient!asw;")
	public Class132_Sub1_Sub2 method31747(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass132_Sub1_Sub2_2;
	}

	@OriginalMember(owner = "client!tx", name = "el", descriptor = "(III)Lclient!asw;")
	public Class132_Sub1_Sub2 method31748(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass132_Sub1_Sub2_2;
	}

	@OriginalMember(owner = "client!tx", name = "ej", descriptor = "(III)Lclient!asm;")
	public Class132_Sub1_Sub3 method31749(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass132_Sub1_Sub3_1;
	}

	@OriginalMember(owner = "client!tx", name = "ep", descriptor = "(III)Lclient!ast;")
	public Class132_Sub1_Sub5 method31750(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass132_Sub1_Sub5_1;
	}

	@OriginalMember(owner = "client!tx", name = "ev", descriptor = "(III)Lclient!ast;")
	public Class132_Sub1_Sub5 method31751(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass132_Sub1_Sub5_1;
	}

	@OriginalMember(owner = "client!tx", name = "ax", descriptor = "(Lclient!alh;IIIII)V")
	void method31752(@OriginalArg(0) Class132_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg5 + arg3;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (this.anInt5603 * -882426473 != local17) {
				for (@Pc(31) int local31 = local3; local31 <= local7; local31++) {
					if (local31 >= 0 && local31 < this.anInt5604 * -200159665) {
						for (@Pc(45) int local45 = local11; local45 <= local15; local45++) {
							if (local45 >= 0 && local45 < this.anInt5605 * -1943751559 && (!local1 || local31 >= local7 || local45 >= local15 || local45 < arg3 && arg2 != local31)) {
								@Pc(81) Class572 local81 = this.aClass572ArrayArrayArray3[local17][local31][local45];
								if (local81 != null) {
									@Pc(176) int local176 = (this.aClass99Array1[local17].method2482(local31, local45, -1835381158) + this.aClass99Array1[local17].method2482(local31 + 1, local45, -492241305) + this.aClass99Array1[local17].method2482(local31, local45 + 1, -2116493834) + this.aClass99Array1[local17].method2482(local31 + 1, local45 + 1, -2096882814)) / 4 - (this.aClass99Array1[arg1].method2482(arg2, arg3, -1532911341) + this.aClass99Array1[arg1].method2482(arg2 + 1, arg3, -515941363) + this.aClass99Array1[arg1].method2482(arg2, arg3 + 1, -1577205806) + this.aClass99Array1[arg1].method2482(arg2 + 1, arg3 + 1, -929487747)) / 4;
									@Pc(179) Class132_Sub1_Sub2 local179 = local81.aClass132_Sub1_Sub2_1;
									@Pc(182) Class132_Sub1_Sub2 local182 = local81.aClass132_Sub1_Sub2_2;
									if (local179 != null && local179.method24273(894163493)) {
										arg0.method24281(this.aClass104_11, local179, this.anInt5600 * -77997759 * (local31 - arg2) + (1 - arg4) * -996240773 * this.anInt5608, local176, this.anInt5600 * -77997759 * (local45 - arg3) + this.anInt5608 * -996240773 * (1 - arg5), local1, (byte) -43);
									}
									if (local182 != null && local182.method24273(-1732975354)) {
										arg0.method24281(this.aClass104_11, local182, (local31 - arg2) * this.anInt5600 * -77997759 + (1 - arg4) * this.anInt5608 * -996240773, local176, this.anInt5608 * -996240773 * (1 - arg5) + (local45 - arg3) * this.anInt5600 * -77997759, local1, (byte) -118);
									}
									for (@Pc(283) Class590 local283 = local81.aClass590_1; local283 != null; local283 = local283.aClass590_2) {
										@Pc(288) Class132_Sub1_Sub1 local288 = local283.aClass132_Sub1_Sub1_1;
										if (local288 != null && local288.method24273(-2108569681) && (local288.aShort129 == local31 || local3 == local31) && (local45 == local288.aShort128 || local11 == local45)) {
											@Pc(318) int local318 = local288.aShort130 - local288.aShort129 + 1;
											@Pc(326) int local326 = local288.aShort127 - local288.aShort128 + 1;
											arg0.method24281(this.aClass104_11, local288, (local288.aShort129 - arg2) * -77997759 * this.anInt5600 + (local318 - arg4) * this.anInt5608 * -996240773, local176, (local288.aShort128 - arg3) * this.anInt5600 * -77997759 + (local326 - arg5) * -996240773 * this.anInt5608, local1, (byte) -92);
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

	@OriginalMember(owner = "client!tx", name = "ek", descriptor = "(IIILclient!td;)Lclient!ash;")
	public Class132_Sub1_Sub1 method31753(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Interface62 arg3) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		if (local8 == null) {
			return null;
		}
		for (@Pc(16) Class590 local16 = local8.aClass590_1; local16 != null; local16 = local16.aClass590_2) {
			@Pc(21) Class132_Sub1_Sub1 local21 = local16.aClass132_Sub1_Sub1_1;
			if ((arg3 == null || arg3.method31548(local21, 568807889)) && arg1 == local21.aShort129 && local21.aShort128 == arg2) {
				return local21;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!tx", name = "fm", descriptor = "(IIII[[[B[I[I[I[I[IIBIIZZIZ)V")
	public void method31754(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[][][] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) byte arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14, @OriginalArg(15) boolean arg15, @OriginalArg(16) int arg16, @OriginalArg(17) boolean arg17) {
		this.aClass598_2.aBoolean832 = true;
		this.aBoolean828 = arg15;
		this.anInt5601 = (arg1 >> this.anInt5599 * -358186793) * 807663979;
		this.anInt5620 = (arg3 >> -358186793 * this.anInt5599) * -893882053;
		this.anInt5612 = arg1 * -541960217;
		this.anInt5613 = arg3 * 2053796035;
		this.anInt5614 = arg2 * 1575019517;
		this.anInt5622 = this.anInt5601 * 1466454929 - this.anInt5616 * -921973039;
		if (this.anInt5622 * 890109843 < 0) {
			this.anInt5617 = -(this.anInt5622 * -699365257);
			this.anInt5622 = 0;
		} else {
			this.anInt5617 = 0;
		}
		this.anInt5607 = this.anInt5620 * -1701337247 - this.anInt5616 * 845404177;
		if (this.anInt5607 * 1220619219 < 0) {
			this.anInt5618 = -(this.anInt5607 * -1954680553);
			this.anInt5607 = 0;
		} else {
			this.anInt5618 = 0;
		}
		this.anInt5619 = this.anInt5616 * -1677097567 + this.anInt5601 * 1251714657;
		if (this.anInt5619 * -891147229 > this.anInt5604 * -200159665) {
			this.anInt5619 = this.anInt5604 * -1912204827;
		}
		this.anInt5621 = this.anInt5616 * 1178488421 + this.anInt5620 * -189865995;
		if (this.anInt5621 * 150058823 > this.anInt5605 * -1943751559) {
			this.anInt5621 = this.anInt5605 * 2064881215;
		}
		@Pc(156) boolean[][] local156 = this.aBooleanArrayArray14;
		@Pc(159) boolean[][] local159 = this.aBooleanArrayArray13;
		@Pc(164) int local164;
		@Pc(179) int local179;
		if (this.aBoolean828) {
			for (local164 = 0; local164 < this.anInt5616 * -93916925 + 2 + this.anInt5616 * -93916925; local164++) {
				local179 = 0;
				@Pc(181) int local181 = 0;
				for (@Pc(183) int local183 = 0; local183 < this.anInt5616 * -93916925 + 2 + this.anInt5616 * -93916925; local183++) {
					if (local183 > 1) {
						this.anIntArray476[local183 - 2] = local179;
					}
					local179 = local181;
					@Pc(220) int local220 = local164 + (this.anInt5601 * 1602382659 - this.anInt5616 * -93916925);
					@Pc(232) int local232 = local183 + (this.anInt5620 * 1547517939 - this.anInt5616 * -93916925);
					@Pc(255) int local255;
					if (local220 >= 0 && local232 >= 0 && local220 < this.anInt5604 * -200159665 && local232 < this.anInt5605 * -1943751559) {
						local255 = local220 << this.anInt5599 * -358186793;
						@Pc(262) int local262 = local232 << this.anInt5599 * -358186793;
						@Pc(284) int local284 = this.aClass99Array2[this.aClass99Array2.length - 1].method2482(local220, local232, -1552046628) - (0x3E8 << this.anInt5599 * -358186793 - 7);
						@Pc(325) int local325 = (this.aClass99Array3 == null ? this.aClass99Array2[0].method2482(local220, local232, -1079827788) + this.anInt5600 * -77997759 : this.aClass99Array3[0].method2482(local220, local232, -1547226284) + this.anInt5600 * -77997759) + (0x3E8 << this.anInt5599 * -358186793 - 7);
						local181 = this.aClass104_11.method20659(local255, local284, local262, local255, local325, local262);
						this.aBooleanArrayArray13[local164][local183] = local181 == 0;
					} else {
						local181 = -1;
						this.aBooleanArrayArray13[local164][local183] = false;
					}
					if (local164 > 0 && local183 > 0) {
						local255 = this.anIntArray476[local183 - 1] & this.anIntArray476[local183] & local179 & local181;
						this.aBooleanArrayArray14[local164 - 1][local183 - 1] = local255 == 0;
					}
				}
				this.anIntArray476[this.anInt5616 * -93916925 + this.anInt5616 * -93916925] = local179;
				this.anIntArray476[this.anInt5616 * -93916925 + this.anInt5616 * -93916925 + 1] = local181;
			}
			if (arg17) {
				this.aClass598_2.anIntArray483 = arg5;
				this.aClass598_2.anIntArray484 = arg6;
				this.aClass598_2.anIntArray481 = arg7;
				this.aClass598_2.anIntArray486 = arg8;
				this.aClass598_2.anIntArray485 = arg9;
				this.aClass598_2.method31972(this.aClass104_11, arg10);
			} else {
				this.aClass598_2.aBoolean832 = false;
			}
		} else {
			if (this.aBooleanArrayArray12 == null) {
				this.aBooleanArrayArray12 = new boolean[this.anInt5616 * -93916925 + 2 + this.anInt5616 * -93916925][this.anInt5616 * -93916925 + 2 + this.anInt5616 * -93916925];
			}
			for (local164 = 0; local164 < this.aBooleanArrayArray12.length; local164++) {
				for (local179 = 0; local179 < this.aBooleanArrayArray12[0].length; local179++) {
					this.aBooleanArrayArray12[local164][local179] = true;
				}
			}
			this.aBooleanArrayArray13 = this.aBooleanArrayArray12;
			this.aBooleanArrayArray14 = this.aBooleanArrayArray12;
			this.anInt5622 = 0;
			this.anInt5607 = 0;
			this.anInt5619 = this.anInt5604 * -1912204827;
			this.anInt5621 = this.anInt5605 * 2064881215;
			this.aClass598_2.aBoolean832 = false;
		}
		Class574.method31527(this, this.aClass104_11, (byte) -5);
		if (!this.aClass569_2.aBoolean823) {
			@Pc(556) Iterator local556 = this.aClass569_2.aList22.iterator();
			while (local556.hasNext()) {
				@Pc(563) Class573 local563 = (Class573) local556.next();
				local556.remove();
				Class305.method26891(local563, (byte) 0);
			}
		}
		if (this.aBoolean826) {
			for (local164 = 0; local164 < this.anInt5625 * 809266399; local164++) {
				this.aClass597Array1[local164].method31947(arg0, arg14, -169722013);
			}
		}
		if (this.aClass572ArrayArrayArray2 != null) {
			this.method31613(true, 870300168);
			this.aClass104_11.method20556(-1, new Class237(1583160, 40, 127, 63, 0, 0, 0));
			this.method31654(true, arg4, arg10, arg11, arg16);
			this.aClass104_11.method20558();
			this.method31613(false, 870300168);
		}
		this.method31654(false, arg4, arg10, arg11, arg16);
		if (!this.aBoolean828) {
			this.aBooleanArrayArray14 = local156;
			this.aBooleanArrayArray13 = local159;
		}
	}

	@OriginalMember(owner = "client!tx", name = "av", descriptor = "(IIII[[[B[I[I[I[I[IIBIIZZIZ)V")
	public void method31755(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[][][] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) byte arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14, @OriginalArg(15) boolean arg15, @OriginalArg(16) int arg16, @OriginalArg(17) boolean arg17) {
		this.aClass598_2.aBoolean832 = true;
		this.aBoolean828 = arg15;
		this.anInt5601 = (arg1 >> this.anInt5599 * -358186793) * 807663979;
		this.anInt5620 = (arg3 >> -358186793 * this.anInt5599) * -893882053;
		this.anInt5612 = arg1 * -541960217;
		this.anInt5613 = arg3 * 2053796035;
		this.anInt5614 = arg2 * 1575019517;
		this.anInt5622 = this.anInt5601 * 1466454929 - this.anInt5616 * -921973039;
		if (this.anInt5622 * 890109843 < 0) {
			this.anInt5617 = -(this.anInt5622 * -699365257);
			this.anInt5622 = 0;
		} else {
			this.anInt5617 = 0;
		}
		this.anInt5607 = this.anInt5620 * -1701337247 - this.anInt5616 * 845404177;
		if (this.anInt5607 * 1220619219 < 0) {
			this.anInt5618 = -(this.anInt5607 * -1954680553);
			this.anInt5607 = 0;
		} else {
			this.anInt5618 = 0;
		}
		this.anInt5619 = this.anInt5616 * -1677097567 + this.anInt5601 * 1251714657;
		if (this.anInt5619 * -891147229 > this.anInt5604 * -200159665) {
			this.anInt5619 = this.anInt5604 * -1912204827;
		}
		this.anInt5621 = this.anInt5616 * 1178488421 + this.anInt5620 * -189865995;
		if (this.anInt5621 * 150058823 > this.anInt5605 * -1943751559) {
			this.anInt5621 = this.anInt5605 * 2064881215;
		}
		@Pc(156) boolean[][] local156 = this.aBooleanArrayArray14;
		@Pc(159) boolean[][] local159 = this.aBooleanArrayArray13;
		@Pc(164) int local164;
		@Pc(179) int local179;
		if (this.aBoolean828) {
			for (local164 = 0; local164 < this.anInt5616 * -93916925 + 2 + this.anInt5616 * -93916925; local164++) {
				local179 = 0;
				@Pc(181) int local181 = 0;
				for (@Pc(183) int local183 = 0; local183 < this.anInt5616 * -93916925 + 2 + this.anInt5616 * -93916925; local183++) {
					if (local183 > 1) {
						this.anIntArray476[local183 - 2] = local179;
					}
					local179 = local181;
					@Pc(220) int local220 = local164 + (this.anInt5601 * 1602382659 - this.anInt5616 * -93916925);
					@Pc(232) int local232 = local183 + (this.anInt5620 * 1547517939 - this.anInt5616 * -93916925);
					@Pc(255) int local255;
					if (local220 >= 0 && local232 >= 0 && local220 < this.anInt5604 * -200159665 && local232 < this.anInt5605 * -1943751559) {
						local255 = local220 << this.anInt5599 * -358186793;
						@Pc(262) int local262 = local232 << this.anInt5599 * -358186793;
						@Pc(284) int local284 = this.aClass99Array2[this.aClass99Array2.length - 1].method2482(local220, local232, -617054532) - (0x3E8 << this.anInt5599 * -358186793 - 7);
						@Pc(325) int local325 = (this.aClass99Array3 == null ? this.aClass99Array2[0].method2482(local220, local232, -409829741) + this.anInt5600 * -77997759 : this.aClass99Array3[0].method2482(local220, local232, -1281749412) + this.anInt5600 * -77997759) + (0x3E8 << this.anInt5599 * -358186793 - 7);
						local181 = this.aClass104_11.method20659(local255, local284, local262, local255, local325, local262);
						this.aBooleanArrayArray13[local164][local183] = local181 == 0;
					} else {
						local181 = -1;
						this.aBooleanArrayArray13[local164][local183] = false;
					}
					if (local164 > 0 && local183 > 0) {
						local255 = this.anIntArray476[local183 - 1] & this.anIntArray476[local183] & local179 & local181;
						this.aBooleanArrayArray14[local164 - 1][local183 - 1] = local255 == 0;
					}
				}
				this.anIntArray476[this.anInt5616 * -93916925 + this.anInt5616 * -93916925] = local179;
				this.anIntArray476[this.anInt5616 * -93916925 + this.anInt5616 * -93916925 + 1] = local181;
			}
			if (arg17) {
				this.aClass598_2.anIntArray483 = arg5;
				this.aClass598_2.anIntArray484 = arg6;
				this.aClass598_2.anIntArray481 = arg7;
				this.aClass598_2.anIntArray486 = arg8;
				this.aClass598_2.anIntArray485 = arg9;
				this.aClass598_2.method31972(this.aClass104_11, arg10);
			} else {
				this.aClass598_2.aBoolean832 = false;
			}
		} else {
			if (this.aBooleanArrayArray12 == null) {
				this.aBooleanArrayArray12 = new boolean[this.anInt5616 * -93916925 + 2 + this.anInt5616 * -93916925][this.anInt5616 * -93916925 + 2 + this.anInt5616 * -93916925];
			}
			for (local164 = 0; local164 < this.aBooleanArrayArray12.length; local164++) {
				for (local179 = 0; local179 < this.aBooleanArrayArray12[0].length; local179++) {
					this.aBooleanArrayArray12[local164][local179] = true;
				}
			}
			this.aBooleanArrayArray13 = this.aBooleanArrayArray12;
			this.aBooleanArrayArray14 = this.aBooleanArrayArray12;
			this.anInt5622 = 0;
			this.anInt5607 = 0;
			this.anInt5619 = this.anInt5604 * -1912204827;
			this.anInt5621 = this.anInt5605 * 2064881215;
			this.aClass598_2.aBoolean832 = false;
		}
		Class574.method31527(this, this.aClass104_11, (byte) -34);
		if (!this.aClass569_2.aBoolean823) {
			@Pc(556) Iterator local556 = this.aClass569_2.aList22.iterator();
			while (local556.hasNext()) {
				@Pc(563) Class573 local563 = (Class573) local556.next();
				local556.remove();
				Class305.method26891(local563, (byte) 0);
			}
		}
		if (this.aBoolean826) {
			for (local164 = 0; local164 < this.anInt5625 * 809266399; local164++) {
				this.aClass597Array1[local164].method31947(arg0, arg14, -1652572986);
			}
		}
		if (this.aClass572ArrayArrayArray2 != null) {
			this.method31613(true, 870300168);
			this.aClass104_11.method20556(-1, new Class237(1583160, 40, 127, 63, 0, 0, 0));
			this.method31654(true, arg4, arg10, arg11, arg16);
			this.aClass104_11.method20558();
			this.method31613(false, 870300168);
		}
		this.method31654(false, arg4, arg10, arg11, arg16);
		if (!this.aBoolean828) {
			this.aBooleanArrayArray14 = local156;
			this.aBooleanArrayArray13 = local159;
		}
	}

	@OriginalMember(owner = "client!tx", name = "eq", descriptor = "(III)Lclient!uc;")
	public Class590 method31756(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass590_1;
	}

	@OriginalMember(owner = "client!tx", name = "eg", descriptor = "(III)Lclient!asv;")
	public Class132_Sub1_Sub4 method31757(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		return local8 == null || local8.aClass132_Sub1_Sub4_1 == null ? null : local8.aClass132_Sub1_Sub4_1;
	}

	@OriginalMember(owner = "client!tx", name = "ez", descriptor = "(III)Lclient!asv;")
	public Class132_Sub1_Sub4 method31758(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		return local8 == null || local8.aClass132_Sub1_Sub4_1 == null ? null : local8.aClass132_Sub1_Sub4_1;
	}

	@OriginalMember(owner = "client!tx", name = "ef", descriptor = "(III)Lclient!asv;")
	public Class132_Sub1_Sub4 method31759(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		return local8 == null || local8.aClass132_Sub1_Sub4_1 == null ? null : local8.aClass132_Sub1_Sub4_1;
	}

	@OriginalMember(owner = "client!tx", name = "cg", descriptor = "(II)I")
	public int method31760(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray62 == null ? 0 : this.anIntArrayArray62[arg0][arg1] & 0xFFFFFF;
	}

	@OriginalMember(owner = "client!tx", name = "u", descriptor = "(IIII)V")
	public void method31761(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
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

	@OriginalMember(owner = "client!tx", name = "ew", descriptor = "(Lclient!alh;III)V")
	void method31762(@OriginalArg(0) Class132_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) Class572 local16;
		@Pc(126) int local126;
		if (arg2 < this.anInt5604 * -200159665) {
			local16 = this.aClass572ArrayArrayArray3[arg1][arg2 + 1][arg3];
			if (local16 != null && local16.aClass132_Sub1_Sub4_1 != null && local16.aClass132_Sub1_Sub4_1.method24273(136219067)) {
				local126 = (this.aClass99Array1[arg1].method2482(arg2 + 1, arg3, -1143174479) + this.aClass99Array1[arg1].method2482(arg2 + 1 + 1, arg3, -1309261572) + this.aClass99Array1[arg1].method2482(arg2 + 1, arg3 + 1, -1556580459) + this.aClass99Array1[arg1].method2482(1 + 1 + arg2, arg3 + 1, -1663888697)) / 4 - (this.aClass99Array1[arg1].method2482(arg2, arg3, -1295693148) + this.aClass99Array1[arg1].method2482(arg2 + 1, arg3, -2084833427) + this.aClass99Array1[arg1].method2482(arg2, arg3 + 1, -1562543570) + this.aClass99Array1[arg1].method2482(arg2 + 1, arg3 + 1, -862834152)) / 4;
				arg0.method24281(this.aClass104_11, local16.aClass132_Sub1_Sub4_1, this.anInt5600 * -77997759, local126, 0, true, (byte) -72);
			}
		}
		if (arg3 < this.anInt5604 * -200159665) {
			local16 = this.aClass572ArrayArrayArray3[arg1][arg2][arg3 + 1];
			if (local16 != null && local16.aClass132_Sub1_Sub4_1 != null && local16.aClass132_Sub1_Sub4_1.method24273(-934962119)) {
				local126 = (this.aClass99Array1[arg1].method2482(arg2, arg3, -472267919) + this.aClass99Array1[arg1].method2482(arg2 + 1, arg3 + 1, -623622738) + this.aClass99Array1[arg1].method2482(arg2, arg3 + 1 + 1, -1618230091) + this.aClass99Array1[arg1].method2482(arg2 + 1, 1 + 1 + arg3, -1018674019)) / 4 - (this.aClass99Array1[arg1].method2482(arg2, arg3, -1106626314) + this.aClass99Array1[arg1].method2482(arg2 + 1, arg3, -2090495734) + this.aClass99Array1[arg1].method2482(arg2, arg3 + 1, -708533007) + this.aClass99Array1[arg1].method2482(arg2 + 1, arg3 + 1, -764178695)) / 4;
				arg0.method24281(this.aClass104_11, local16.aClass132_Sub1_Sub4_1, 0, local126, this.anInt5600 * -77997759, true, (byte) -120);
			}
		}
		if (arg2 < this.anInt5604 * -200159665 && arg3 < this.anInt5605 * -1943751559) {
			local16 = this.aClass572ArrayArrayArray3[arg1][arg2 + 1][arg3 + 1];
			if (local16 != null && local16.aClass132_Sub1_Sub4_1 != null && local16.aClass132_Sub1_Sub4_1.method24273(1926776724)) {
				local126 = (this.aClass99Array1[arg1].method2482(arg2 + 1, arg3 + 1, -620098996) + this.aClass99Array1[arg1].method2482(arg2 + 1 + 1, arg3 + 1, -437272037) + this.aClass99Array1[arg1].method2482(arg2 + 1, arg3 + 1 + 1, -1831718294) + this.aClass99Array1[arg1].method2482(1 + 1 + arg2, 1 + 1 + arg3, -2074225691)) / 4 - (this.aClass99Array1[arg1].method2482(arg2, arg3, -438141562) + this.aClass99Array1[arg1].method2482(arg2 + 1, arg3, -1030511941) + this.aClass99Array1[arg1].method2482(arg2, arg3 + 1, -1486731738) + this.aClass99Array1[arg1].method2482(arg2 + 1, arg3 + 1, -522310599)) / 4;
				arg0.method24281(this.aClass104_11, local16.aClass132_Sub1_Sub4_1, this.anInt5600 * -77997759, local126, this.anInt5600 * -77997759, true, (byte) -31);
			}
		}
		if (arg2 >= this.anInt5604 * -200159665 || arg3 <= 0) {
			return;
		}
		local16 = this.aClass572ArrayArrayArray3[arg1][arg2 + 1][arg3 - 1];
		if (local16 != null && local16.aClass132_Sub1_Sub4_1 != null && local16.aClass132_Sub1_Sub4_1.method24273(-458659269)) {
			local126 = (this.aClass99Array1[arg1].method2482(arg2 + 1, arg3 - 1, -687803360) + this.aClass99Array1[arg1].method2482(arg2 + 1 + 1, arg3 - 1, -2109563541) + this.aClass99Array1[arg1].method2482(arg2 + 1, arg3 + 1 - 1, -1684297853) + this.aClass99Array1[arg1].method2482(1 + 1 + arg2, arg3 + 1 - 1, -464752433)) / 4 - (this.aClass99Array1[arg1].method2482(arg2, arg3, -1787816564) + this.aClass99Array1[arg1].method2482(arg2 + 1, arg3, -1989002179) + this.aClass99Array1[arg1].method2482(arg2, arg3 + 1, -537895849) + this.aClass99Array1[arg1].method2482(arg2 + 1, arg3 + 1, -1548070989)) / 4;
			arg0.method24281(this.aClass104_11, local16.aClass132_Sub1_Sub4_1, this.anInt5600 * -77997759, local126, -(this.anInt5600 * -77997759), true, (byte) -17);
		}
	}

	@OriginalMember(owner = "client!tx", name = "et", descriptor = "(III)Lclient!asv;")
	public Class132_Sub1_Sub4 method31763(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		return local8 == null || local8.aClass132_Sub1_Sub4_1 == null ? null : local8.aClass132_Sub1_Sub4_1;
	}

	@OriginalMember(owner = "client!tx", name = "cd", descriptor = "(Lclient!ash;Z)Z")
	public boolean method31764(@OriginalArg(0) Class132_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(8) boolean local8 = this.aClass99Array3 == this.aClass99Array1;
		@Pc(10) int local10 = 0;
		@Pc(12) short local12 = 0;
		@Pc(14) byte local14 = 0;
		arg0.method24334(-506578951);
		@Pc(19) short local19 = 0;
		@Pc(31) int local31 = Math.min(this.anInt5604 * -200159665 - 1, Math.max(0, arg0.aShort129));
		@Pc(43) int local43 = Math.min(this.anInt5604 * -200159665 - 1, Math.max(0, arg0.aShort130));
		@Pc(55) int local55 = Math.min(this.anInt5605 * -1943751559 - 1, Math.max(0, arg0.aShort128));
		@Pc(67) int local67 = Math.min(this.anInt5605 * -1943751559 - 1, Math.max(0, arg0.aShort127));
		@Pc(69) int local69;
		@Pc(74) int local74;
		for (local69 = local31; local69 <= local43; local69++) {
			for (local74 = local55; local74 <= local67; local74++) {
				@Pc(85) Class572 local85 = this.method31617(arg0.aByte100, local69, local74, (byte) -62);
				if (local85 != null) {
					@Pc(91) Class590 local91 = Class355.method27792(arg0, 2081552050);
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
			this.aClass132_Sub1_Sub1Array1[(this.anInt5626 += -1353434845) * -1409302901 - 1] = arg0;
			arg0.aClass585_23 = this;
		} else {
			local69 = this.aClass99Array1 == this.aClass99Array3 ? 1 : 0;
			if (!arg0.method24274((byte) 6)) {
				arg0.aClass132_Sub1_23 = this.aClass132_Sub1Array5[local69];
				this.aClass132_Sub1Array5[local69] = arg0;
			} else if (arg0.method24275((short) -11188)) {
				arg0.aClass132_Sub1_23 = this.aClass132_Sub1Array2[local69];
				this.aClass132_Sub1Array2[local69] = arg0;
			} else {
				arg0.aClass132_Sub1_23 = this.aClass132_Sub1Array1[local69];
				this.aClass132_Sub1Array1[local69] = arg0;
			}
		}
		if (arg1) {
			@Pc(294) Class472 local294 = Class472.method29711(arg0.method24241().aClass472_61);
			local294.aFloat326 -= local19;
			arg0.method24236(local294);
			local294.method29713();
		}
		return true;
	}

	@OriginalMember(owner = "client!tx", name = "eb", descriptor = "(Lclient!alh;IIIII)V")
	void method31765(@OriginalArg(0) Class132_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg5 + arg3;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (this.anInt5603 * -882426473 != local17) {
				for (@Pc(31) int local31 = local3; local31 <= local7; local31++) {
					if (local31 >= 0 && local31 < this.anInt5604 * -200159665) {
						for (@Pc(45) int local45 = local11; local45 <= local15; local45++) {
							if (local45 >= 0 && local45 < this.anInt5605 * -1943751559 && (!local1 || local31 >= local7 || local45 >= local15 || local45 < arg3 && arg2 != local31)) {
								@Pc(81) Class572 local81 = this.aClass572ArrayArrayArray3[local17][local31][local45];
								if (local81 != null) {
									@Pc(176) int local176 = (this.aClass99Array1[local17].method2482(local31, local45, -580893929) + this.aClass99Array1[local17].method2482(local31 + 1, local45, -603514853) + this.aClass99Array1[local17].method2482(local31, local45 + 1, -878650886) + this.aClass99Array1[local17].method2482(local31 + 1, local45 + 1, -1673094059)) / 4 - (this.aClass99Array1[arg1].method2482(arg2, arg3, -837330753) + this.aClass99Array1[arg1].method2482(arg2 + 1, arg3, -224503589) + this.aClass99Array1[arg1].method2482(arg2, arg3 + 1, -2064998036) + this.aClass99Array1[arg1].method2482(arg2 + 1, arg3 + 1, -869078566)) / 4;
									@Pc(179) Class132_Sub1_Sub2 local179 = local81.aClass132_Sub1_Sub2_1;
									@Pc(182) Class132_Sub1_Sub2 local182 = local81.aClass132_Sub1_Sub2_2;
									if (local179 != null && local179.method24273(-1802448982)) {
										arg0.method24281(this.aClass104_11, local179, this.anInt5600 * -77997759 * (local31 - arg2) + (1 - arg4) * -996240773 * this.anInt5608, local176, this.anInt5600 * -77997759 * (local45 - arg3) + this.anInt5608 * -996240773 * (1 - arg5), local1, (byte) -83);
									}
									if (local182 != null && local182.method24273(-893199965)) {
										arg0.method24281(this.aClass104_11, local182, (local31 - arg2) * this.anInt5600 * -77997759 + (1 - arg4) * this.anInt5608 * -996240773, local176, this.anInt5608 * -996240773 * (1 - arg5) + (local45 - arg3) * this.anInt5600 * -77997759, local1, (byte) -123);
									}
									for (@Pc(283) Class590 local283 = local81.aClass590_1; local283 != null; local283 = local283.aClass590_2) {
										@Pc(288) Class132_Sub1_Sub1 local288 = local283.aClass132_Sub1_Sub1_1;
										if (local288 != null && local288.method24273(1240052722) && (local288.aShort129 == local31 || local3 == local31) && (local45 == local288.aShort128 || local11 == local45)) {
											@Pc(318) int local318 = local288.aShort130 - local288.aShort129 + 1;
											@Pc(326) int local326 = local288.aShort127 - local288.aShort128 + 1;
											arg0.method24281(this.aClass104_11, local288, (local288.aShort129 - arg2) * -77997759 * this.anInt5600 + (local318 - arg4) * this.anInt5608 * -996240773, local176, (local288.aShort128 - arg3) * this.anInt5600 * -77997759 + (local326 - arg5) * -996240773 * this.anInt5608, local1, (byte) -60);
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

	@OriginalMember(owner = "client!tx", name = "am", descriptor = "(IIILclient!td;B)Lclient!ash;")
	public Class132_Sub1_Sub1 method31766(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Interface62 arg3, @OriginalArg(4) byte arg4) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		if (local8 == null) {
			return null;
		}
		for (@Pc(16) Class590 local16 = local8.aClass590_1; local16 != null; local16 = local16.aClass590_2) {
			@Pc(21) Class132_Sub1_Sub1 local21 = local16.aClass132_Sub1_Sub1_1;
			if ((arg3 == null || arg3.method31548(local21, 1494303109)) && arg1 == local21.aShort129 && local21.aShort128 == arg2) {
				return local21;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!tx", name = "fg", descriptor = "(IIII[[[B[I[I[I[I[IIBIIZZIZ)V")
	public void method31767(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[][][] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) byte arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14, @OriginalArg(15) boolean arg15, @OriginalArg(16) int arg16, @OriginalArg(17) boolean arg17) {
		this.aClass598_2.aBoolean832 = true;
		this.aBoolean828 = arg15;
		this.anInt5601 = (arg1 >> this.anInt5599 * -358186793) * 807663979;
		this.anInt5620 = (arg3 >> -358186793 * this.anInt5599) * -893882053;
		this.anInt5612 = arg1 * -541960217;
		this.anInt5613 = arg3 * 2053796035;
		this.anInt5614 = arg2 * 1575019517;
		this.anInt5622 = this.anInt5601 * 1466454929 - this.anInt5616 * -921973039;
		if (this.anInt5622 * 890109843 < 0) {
			this.anInt5617 = -(this.anInt5622 * -699365257);
			this.anInt5622 = 0;
		} else {
			this.anInt5617 = 0;
		}
		this.anInt5607 = this.anInt5620 * -1701337247 - this.anInt5616 * 845404177;
		if (this.anInt5607 * 1220619219 < 0) {
			this.anInt5618 = -(this.anInt5607 * -1954680553);
			this.anInt5607 = 0;
		} else {
			this.anInt5618 = 0;
		}
		this.anInt5619 = this.anInt5616 * -1677097567 + this.anInt5601 * 1251714657;
		if (this.anInt5619 * -891147229 > this.anInt5604 * -200159665) {
			this.anInt5619 = this.anInt5604 * -1912204827;
		}
		this.anInt5621 = this.anInt5616 * 1178488421 + this.anInt5620 * -189865995;
		if (this.anInt5621 * 150058823 > this.anInt5605 * -1943751559) {
			this.anInt5621 = this.anInt5605 * 2064881215;
		}
		@Pc(156) boolean[][] local156 = this.aBooleanArrayArray14;
		@Pc(159) boolean[][] local159 = this.aBooleanArrayArray13;
		@Pc(164) int local164;
		@Pc(179) int local179;
		if (this.aBoolean828) {
			for (local164 = 0; local164 < this.anInt5616 * -93916925 + 2 + this.anInt5616 * -93916925; local164++) {
				local179 = 0;
				@Pc(181) int local181 = 0;
				for (@Pc(183) int local183 = 0; local183 < this.anInt5616 * -93916925 + 2 + this.anInt5616 * -93916925; local183++) {
					if (local183 > 1) {
						this.anIntArray476[local183 - 2] = local179;
					}
					local179 = local181;
					@Pc(220) int local220 = local164 + (this.anInt5601 * 1602382659 - this.anInt5616 * -93916925);
					@Pc(232) int local232 = local183 + (this.anInt5620 * 1547517939 - this.anInt5616 * -93916925);
					@Pc(255) int local255;
					if (local220 >= 0 && local232 >= 0 && local220 < this.anInt5604 * -200159665 && local232 < this.anInt5605 * -1943751559) {
						local255 = local220 << this.anInt5599 * -358186793;
						@Pc(262) int local262 = local232 << this.anInt5599 * -358186793;
						@Pc(284) int local284 = this.aClass99Array2[this.aClass99Array2.length - 1].method2482(local220, local232, -2088734739) - (0x3E8 << this.anInt5599 * -358186793 - 7);
						@Pc(325) int local325 = (this.aClass99Array3 == null ? this.aClass99Array2[0].method2482(local220, local232, -818178233) + this.anInt5600 * -77997759 : this.aClass99Array3[0].method2482(local220, local232, -439287978) + this.anInt5600 * -77997759) + (0x3E8 << this.anInt5599 * -358186793 - 7);
						local181 = this.aClass104_11.method20659(local255, local284, local262, local255, local325, local262);
						this.aBooleanArrayArray13[local164][local183] = local181 == 0;
					} else {
						local181 = -1;
						this.aBooleanArrayArray13[local164][local183] = false;
					}
					if (local164 > 0 && local183 > 0) {
						local255 = this.anIntArray476[local183 - 1] & this.anIntArray476[local183] & local179 & local181;
						this.aBooleanArrayArray14[local164 - 1][local183 - 1] = local255 == 0;
					}
				}
				this.anIntArray476[this.anInt5616 * -93916925 + this.anInt5616 * -93916925] = local179;
				this.anIntArray476[this.anInt5616 * -93916925 + this.anInt5616 * -93916925 + 1] = local181;
			}
			if (arg17) {
				this.aClass598_2.anIntArray483 = arg5;
				this.aClass598_2.anIntArray484 = arg6;
				this.aClass598_2.anIntArray481 = arg7;
				this.aClass598_2.anIntArray486 = arg8;
				this.aClass598_2.anIntArray485 = arg9;
				this.aClass598_2.method31972(this.aClass104_11, arg10);
			} else {
				this.aClass598_2.aBoolean832 = false;
			}
		} else {
			if (this.aBooleanArrayArray12 == null) {
				this.aBooleanArrayArray12 = new boolean[this.anInt5616 * -93916925 + 2 + this.anInt5616 * -93916925][this.anInt5616 * -93916925 + 2 + this.anInt5616 * -93916925];
			}
			for (local164 = 0; local164 < this.aBooleanArrayArray12.length; local164++) {
				for (local179 = 0; local179 < this.aBooleanArrayArray12[0].length; local179++) {
					this.aBooleanArrayArray12[local164][local179] = true;
				}
			}
			this.aBooleanArrayArray13 = this.aBooleanArrayArray12;
			this.aBooleanArrayArray14 = this.aBooleanArrayArray12;
			this.anInt5622 = 0;
			this.anInt5607 = 0;
			this.anInt5619 = this.anInt5604 * -1912204827;
			this.anInt5621 = this.anInt5605 * 2064881215;
			this.aClass598_2.aBoolean832 = false;
		}
		Class574.method31527(this, this.aClass104_11, (byte) -7);
		if (!this.aClass569_2.aBoolean823) {
			@Pc(556) Iterator local556 = this.aClass569_2.aList22.iterator();
			while (local556.hasNext()) {
				@Pc(563) Class573 local563 = (Class573) local556.next();
				local556.remove();
				Class305.method26891(local563, (byte) 0);
			}
		}
		if (this.aBoolean826) {
			for (local164 = 0; local164 < this.anInt5625 * 809266399; local164++) {
				this.aClass597Array1[local164].method31947(arg0, arg14, 1270568763);
			}
		}
		if (this.aClass572ArrayArrayArray2 != null) {
			this.method31613(true, 870300168);
			this.aClass104_11.method20556(-1, new Class237(1583160, 40, 127, 63, 0, 0, 0));
			this.method31654(true, arg4, arg10, arg11, arg16);
			this.aClass104_11.method20558();
			this.method31613(false, 870300168);
		}
		this.method31654(false, arg4, arg10, arg11, arg16);
		if (!this.aBoolean828) {
			this.aBooleanArrayArray14 = local156;
			this.aBooleanArrayArray13 = local159;
		}
	}

	@OriginalMember(owner = "client!tx", name = "ea", descriptor = "()V")
	public void method31768() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5603 * -882426473; local1++) {
			for (@Pc(9) int local9 = 0; local9 < this.anInt5604 * -200159665; local9++) {
				for (@Pc(17) int local17 = 0; local17 < this.anInt5605 * -1943751559; local17++) {
					@Pc(32) Class572 local32 = this.aClass572ArrayArrayArray3[local1][local9][local17];
					if (local32 != null) {
						@Pc(37) Class132_Sub1_Sub2 local37 = local32.aClass132_Sub1_Sub2_1;
						@Pc(40) Class132_Sub1_Sub2 local40 = local32.aClass132_Sub1_Sub2_2;
						if (local37 != null && local37.method24273(1518134097)) {
							this.method31752(local37, local1, local9, local17, 1, 1);
							if (local40 != null && local40.method24273(-779559004)) {
								this.method31752(local40, local1, local9, local17, 1, 1);
								local40.method24281(this.aClass104_11, local37, 0, 0, 0, false, (byte) -45);
								local40.method24277((byte) 123);
							}
							local37.method24277((byte) 123);
						}
						for (@Pc(89) Class590 local89 = local32.aClass590_1; local89 != null; local89 = local89.aClass590_2) {
							@Pc(94) Class132_Sub1_Sub1 local94 = local89.aClass132_Sub1_Sub1_1;
							if (local94 != null && local94.method24273(-2041814595)) {
								this.method31752(local94, local1, local9, local17, local94.aShort130 - local94.aShort129 + 1, local94.aShort127 - local94.aShort128 + 1);
								local94.method24277((byte) 124);
							}
						}
						@Pc(130) Class132_Sub1_Sub4 local130 = local32.aClass132_Sub1_Sub4_1;
						if (local130 != null && local130.method24273(1732553085)) {
							this.method31651(local130, local1, local9, local17, (short) 4426);
							local130.method24277((byte) 127);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tx", name = "fs", descriptor = "(Z[[[BIBI)V")
	void method31769(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4) {
		@Pc(5) int local5 = arg0 ? 1 : 0;
		this.anInt5610 = 0;
		this.anInt5606 = 0;
		this.anInt5615 += 1774593837;
		@Pc(27) Class132_Sub1 local27;
		if ((arg4 & 0x2) == 0) {
			for (local27 = this.aClass132_Sub1Array1[local5]; local27 != null; local27 = local27.aClass132_Sub1_23) {
				this.method31655(local27, 1895915554);
				if (local27.anInt3290 * 1998180051 != -1 && !this.method31658(local27, arg0, arg1, arg2, arg3)) {
					this.aClass132_Sub1Array4[(this.anInt5610 += -2107072139) * -889690403 - 1] = local27;
				}
			}
		}
		@Pc(184) int local184;
		if ((arg4 & 0x1) == 0) {
			for (local27 = this.aClass132_Sub1Array2[local5]; local27 != null; local27 = local27.aClass132_Sub1_23) {
				this.method31655(local27, 1662926279);
				if (local27.anInt3290 * 1998180051 != -1 && !this.method31658(local27, arg0, arg1, arg2, arg3)) {
					this.aClass132_Sub1Array3[(this.anInt5606 += 1048894253) * 1298082981 - 1] = local27;
				}
			}
			for (local27 = this.aClass132_Sub1Array5[local5]; local27 != null; local27 = local27.aClass132_Sub1_23) {
				this.method31655(local27, 2019077427);
				if (local27.anInt3290 * 1998180051 != -1 && !this.method31658(local27, arg0, arg1, arg2, arg3)) {
					if (local27.method24275((short) -552)) {
						this.aClass132_Sub1Array3[(this.anInt5606 += 1048894253) * 1298082981 - 1] = local27;
					} else {
						this.aClass132_Sub1Array4[(this.anInt5610 += -2107072139) * -889690403 - 1] = local27;
					}
				}
			}
			if (!arg0) {
				for (local184 = 0; local184 < this.anInt5626 * -1409302901; local184++) {
					this.method31655(this.aClass132_Sub1_Sub1Array1[local184], 1639341193);
					if (this.aClass132_Sub1_Sub1Array1[local184].anInt3290 * 1998180051 != -1 && !this.method31658(this.aClass132_Sub1_Sub1Array1[local184], arg0, arg1, arg2, arg3)) {
						if (this.aClass132_Sub1_Sub1Array1[local184].method24275((short) -28833)) {
							this.aClass132_Sub1Array3[(this.anInt5606 += 1048894253) * 1298082981 - 1] = this.aClass132_Sub1_Sub1Array1[local184];
						} else {
							this.aClass132_Sub1Array4[(this.anInt5610 += -2107072139) * -889690403 - 1] = this.aClass132_Sub1_Sub1Array1[local184];
						}
					}
				}
			}
		}
		if (this.anInt5610 * -889690403 > 0) {
			this.method31657(this.aClass132_Sub1Array4, 0, this.anInt5610 * -889690403 - 1);
			for (local184 = 0; local184 < this.anInt5610 * -889690403; local184++) {
				this.method31659(this.aClass132_Sub1Array4[local184], this.aClass93_Sub16Array23);
			}
		}
		if (this.aBoolean826) {
			this.aClass104_11.method20802(0, null);
		}
		if ((arg4 & 0x2) == 0) {
			for (local184 = 0; local184 < this.anInt5603 * -882426473; local184++) {
				@Pc(326) int local326;
				@Pc(361) int local361;
				@Pc(397) boolean[][] local397;
				@Pc(405) int local405;
				@Pc(420) int local420;
				@Pc(425) int local425;
				if (local184 < arg2 || arg1 == null) {
					local326 = this.aBooleanArrayArray14.length;
					if (this.aBooleanArrayArray14.length + this.anInt5622 * 890109843 > this.anInt5604 * -200159665) {
						local326 -= this.aBooleanArrayArray14.length + this.anInt5622 * 890109843 - this.anInt5604 * -200159665;
					}
					local361 = this.aBooleanArrayArray14[0].length;
					if (this.aBooleanArrayArray14[0].length + this.anInt5607 * 1220619219 > this.anInt5605 * -1943751559) {
						local361 -= this.aBooleanArrayArray14[0].length + this.anInt5607 * 1220619219 - this.anInt5605 * -1943751559;
					}
					local397 = this.aBooleanArrayArray13;
					if (this.aBoolean828) {
						for (local405 = this.anInt5617 * 1250813125; local405 < local326; local405++) {
							local420 = this.anInt5622 * 890109843 + local405 - this.anInt5617 * 1250813125;
							for (local425 = this.anInt5618 * 742291621; local425 < local361; local425++) {
								if (this.aBooleanArrayArray14[local405][local425] && !this.aClass598_2.method31976(local184, local420, local425 + this.anInt5607 * 1220619219 - this.anInt5618 * 742291621)) {
									local397[local405][local425] = true;
								} else {
									local397[local405][local425] = false;
								}
							}
						}
					}
					this.aClass99Array1[local184].method2501(this.anInt5601 * 1602382659, this.anInt5620 * 1547517939, this.anInt5616 * -93916925, this.aBooleanArrayArray13, true, arg4);
				} else {
					local326 = this.aBooleanArrayArray14.length;
					if (this.anInt5622 * 890109843 + this.aBooleanArrayArray14.length > this.anInt5604 * -200159665) {
						local326 -= this.aBooleanArrayArray14.length + this.anInt5622 * 890109843 - this.anInt5604 * -200159665;
					}
					local361 = this.aBooleanArrayArray14[0].length;
					if (this.aBooleanArrayArray14[0].length + this.anInt5607 * 1220619219 > this.anInt5605 * -1943751559) {
						local361 -= this.aBooleanArrayArray14[0].length + this.anInt5607 * 1220619219 - this.anInt5605 * -1943751559;
					}
					local397 = this.aBooleanArrayArray13;
					if (this.aBoolean828) {
						for (local405 = this.anInt5617 * 1250813125; local405 < local326; local405++) {
							local420 = this.anInt5622 * 890109843 + local405 - this.anInt5617 * 1250813125;
							for (local425 = this.anInt5618 * 742291621; local425 < local361; local425++) {
								local397[local405][local425] = false;
								if (this.aBooleanArrayArray14[local405][local425]) {
									@Pc(453) int local453 = local425 + this.anInt5607 * 1220619219 - this.anInt5618 * 742291621;
									for (@Pc(455) int local455 = local184; local455 >= 0; local455--) {
										if (this.aClass572ArrayArrayArray3[local455][local420][local453] != null && this.aClass572ArrayArrayArray3[local455][local420][local453].aByte163 == local184) {
											if ((local455 < arg2 || arg3 != arg1[local455][local420][local453]) && !this.aClass598_2.method31976(local184, local420, local453)) {
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
					this.aClass99Array1[local184].method2501(this.anInt5601 * 1602382659, this.anInt5620 * 1547517939, this.anInt5616 * -93916925, this.aBooleanArrayArray13, false, arg4);
				}
			}
		}
		if (this.anInt5606 * 1298082981 > 0) {
			this.method31661(this.aClass132_Sub1Array3, 0, this.anInt5606 * 1298082981 - 1);
			for (local184 = 0; local184 < this.anInt5606 * 1298082981; local184++) {
				this.method31659(this.aClass132_Sub1Array3[local184], this.aClass93_Sub16Array23);
			}
		}
	}

	@OriginalMember(owner = "client!tx", name = "fz", descriptor = "(Z[[[BIBI)V")
	void method31770(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4) {
		@Pc(5) int local5 = arg0 ? 1 : 0;
		this.anInt5610 = 0;
		this.anInt5606 = 0;
		this.anInt5615 += 1774593837;
		@Pc(27) Class132_Sub1 local27;
		if ((arg4 & 0x2) == 0) {
			for (local27 = this.aClass132_Sub1Array1[local5]; local27 != null; local27 = local27.aClass132_Sub1_23) {
				this.method31655(local27, 1697449883);
				if (local27.anInt3290 * 1998180051 != -1 && !this.method31658(local27, arg0, arg1, arg2, arg3)) {
					this.aClass132_Sub1Array4[(this.anInt5610 += -2107072139) * -889690403 - 1] = local27;
				}
			}
		}
		@Pc(184) int local184;
		if ((arg4 & 0x1) == 0) {
			for (local27 = this.aClass132_Sub1Array2[local5]; local27 != null; local27 = local27.aClass132_Sub1_23) {
				this.method31655(local27, 1660675176);
				if (local27.anInt3290 * 1998180051 != -1 && !this.method31658(local27, arg0, arg1, arg2, arg3)) {
					this.aClass132_Sub1Array3[(this.anInt5606 += 1048894253) * 1298082981 - 1] = local27;
				}
			}
			for (local27 = this.aClass132_Sub1Array5[local5]; local27 != null; local27 = local27.aClass132_Sub1_23) {
				this.method31655(local27, 1728780498);
				if (local27.anInt3290 * 1998180051 != -1 && !this.method31658(local27, arg0, arg1, arg2, arg3)) {
					if (local27.method24275((short) -3598)) {
						this.aClass132_Sub1Array3[(this.anInt5606 += 1048894253) * 1298082981 - 1] = local27;
					} else {
						this.aClass132_Sub1Array4[(this.anInt5610 += -2107072139) * -889690403 - 1] = local27;
					}
				}
			}
			if (!arg0) {
				for (local184 = 0; local184 < this.anInt5626 * -1409302901; local184++) {
					this.method31655(this.aClass132_Sub1_Sub1Array1[local184], 1375408367);
					if (this.aClass132_Sub1_Sub1Array1[local184].anInt3290 * 1998180051 != -1 && !this.method31658(this.aClass132_Sub1_Sub1Array1[local184], arg0, arg1, arg2, arg3)) {
						if (this.aClass132_Sub1_Sub1Array1[local184].method24275((short) -5648)) {
							this.aClass132_Sub1Array3[(this.anInt5606 += 1048894253) * 1298082981 - 1] = this.aClass132_Sub1_Sub1Array1[local184];
						} else {
							this.aClass132_Sub1Array4[(this.anInt5610 += -2107072139) * -889690403 - 1] = this.aClass132_Sub1_Sub1Array1[local184];
						}
					}
				}
			}
		}
		if (this.anInt5610 * -889690403 > 0) {
			this.method31657(this.aClass132_Sub1Array4, 0, this.anInt5610 * -889690403 - 1);
			for (local184 = 0; local184 < this.anInt5610 * -889690403; local184++) {
				this.method31659(this.aClass132_Sub1Array4[local184], this.aClass93_Sub16Array23);
			}
		}
		if (this.aBoolean826) {
			this.aClass104_11.method20802(0, null);
		}
		if ((arg4 & 0x2) == 0) {
			for (local184 = 0; local184 < this.anInt5603 * -882426473; local184++) {
				@Pc(326) int local326;
				@Pc(361) int local361;
				@Pc(397) boolean[][] local397;
				@Pc(405) int local405;
				@Pc(420) int local420;
				@Pc(425) int local425;
				if (local184 < arg2 || arg1 == null) {
					local326 = this.aBooleanArrayArray14.length;
					if (this.aBooleanArrayArray14.length + this.anInt5622 * 890109843 > this.anInt5604 * -200159665) {
						local326 -= this.aBooleanArrayArray14.length + this.anInt5622 * 890109843 - this.anInt5604 * -200159665;
					}
					local361 = this.aBooleanArrayArray14[0].length;
					if (this.aBooleanArrayArray14[0].length + this.anInt5607 * 1220619219 > this.anInt5605 * -1943751559) {
						local361 -= this.aBooleanArrayArray14[0].length + this.anInt5607 * 1220619219 - this.anInt5605 * -1943751559;
					}
					local397 = this.aBooleanArrayArray13;
					if (this.aBoolean828) {
						for (local405 = this.anInt5617 * 1250813125; local405 < local326; local405++) {
							local420 = this.anInt5622 * 890109843 + local405 - this.anInt5617 * 1250813125;
							for (local425 = this.anInt5618 * 742291621; local425 < local361; local425++) {
								if (this.aBooleanArrayArray14[local405][local425] && !this.aClass598_2.method31976(local184, local420, local425 + this.anInt5607 * 1220619219 - this.anInt5618 * 742291621)) {
									local397[local405][local425] = true;
								} else {
									local397[local405][local425] = false;
								}
							}
						}
					}
					this.aClass99Array1[local184].method2501(this.anInt5601 * 1602382659, this.anInt5620 * 1547517939, this.anInt5616 * -93916925, this.aBooleanArrayArray13, true, arg4);
				} else {
					local326 = this.aBooleanArrayArray14.length;
					if (this.anInt5622 * 890109843 + this.aBooleanArrayArray14.length > this.anInt5604 * -200159665) {
						local326 -= this.aBooleanArrayArray14.length + this.anInt5622 * 890109843 - this.anInt5604 * -200159665;
					}
					local361 = this.aBooleanArrayArray14[0].length;
					if (this.aBooleanArrayArray14[0].length + this.anInt5607 * 1220619219 > this.anInt5605 * -1943751559) {
						local361 -= this.aBooleanArrayArray14[0].length + this.anInt5607 * 1220619219 - this.anInt5605 * -1943751559;
					}
					local397 = this.aBooleanArrayArray13;
					if (this.aBoolean828) {
						for (local405 = this.anInt5617 * 1250813125; local405 < local326; local405++) {
							local420 = this.anInt5622 * 890109843 + local405 - this.anInt5617 * 1250813125;
							for (local425 = this.anInt5618 * 742291621; local425 < local361; local425++) {
								local397[local405][local425] = false;
								if (this.aBooleanArrayArray14[local405][local425]) {
									@Pc(453) int local453 = local425 + this.anInt5607 * 1220619219 - this.anInt5618 * 742291621;
									for (@Pc(455) int local455 = local184; local455 >= 0; local455--) {
										if (this.aClass572ArrayArrayArray3[local455][local420][local453] != null && this.aClass572ArrayArrayArray3[local455][local420][local453].aByte163 == local184) {
											if ((local455 < arg2 || arg3 != arg1[local455][local420][local453]) && !this.aClass598_2.method31976(local184, local420, local453)) {
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
					this.aClass99Array1[local184].method2501(this.anInt5601 * 1602382659, this.anInt5620 * 1547517939, this.anInt5616 * -93916925, this.aBooleanArrayArray13, false, arg4);
				}
			}
		}
		if (this.anInt5606 * 1298082981 > 0) {
			this.method31661(this.aClass132_Sub1Array3, 0, this.anInt5606 * 1298082981 - 1);
			for (local184 = 0; local184 < this.anInt5606 * 1298082981; local184++) {
				this.method31659(this.aClass132_Sub1Array3[local184], this.aClass93_Sub16Array23);
			}
		}
	}

	@OriginalMember(owner = "client!tx", name = "fj", descriptor = "(Lclient!alh;)V")
	void method31771(@OriginalArg(0) Class132_Sub1 arg0) {
		@Pc(3) Class472 local3 = arg0.method24241().aClass472_61;
		this.aClass104_11.method20836((float) local3.aFloat325, (float) ((int) local3.aFloat326 + (arg0.method24301((byte) -20) >> 1)), (float) local3.aFloat327, this.aFloatArray118);
		arg0.anInt3290 = (int) this.aFloatArray118[2] * 1729083739;
	}

	@OriginalMember(owner = "client!tx", name = "fd", descriptor = "([Lclient!alh;II)V")
	void method31772(@OriginalArg(0) Class132_Sub1[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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
		this.method31661(arg0, arg1, local10 - 1);
		this.method31661(arg0, local10 + 1, arg2);
	}

	@OriginalMember(owner = "client!tx", name = "fn", descriptor = "([Lclient!alh;II)V")
	void method31773(@OriginalArg(0) Class132_Sub1[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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
		this.method31657(arg0, arg1, local10 - 1);
		this.method31657(arg0, local10 + 1, arg2);
	}

	@OriginalMember(owner = "client!tx", name = "fi", descriptor = "([Lclient!alh;II)V")
	void method31774(@OriginalArg(0) Class132_Sub1[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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
		this.method31657(arg0, arg1, local10 - 1);
		this.method31657(arg0, local10 + 1, arg2);
	}

	@OriginalMember(owner = "client!tx", name = "be", descriptor = "()V")
	public void method31775() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5604 * -200159665; local1++) {
			for (@Pc(9) int local9 = 0; local9 < this.anInt5605 * -1943751559; local9++) {
				if (this.aClass572ArrayArrayArray3[0][local1][local9] == null) {
					this.aClass572ArrayArrayArray3[0][local1][local9] = new Class572(0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!tx", name = "du", descriptor = "(III)Lclient!asv;")
	public Class132_Sub1_Sub4 method31776(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		if (local8 == null) {
			return null;
		}
		this.method31642(local8.aClass132_Sub1_Sub4_1, (byte) 123);
		if (local8.aClass132_Sub1_Sub4_1 == null) {
			return null;
		} else {
			@Pc(24) Class132_Sub1_Sub4 local24 = local8.aClass132_Sub1_Sub4_1;
			local8.aClass132_Sub1_Sub4_1 = null;
			return local24;
		}
	}

	@OriginalMember(owner = "client!tx", name = "fv", descriptor = "(Lclient!alh;[Lclient!akf;)V")
	void method31777(@OriginalArg(0) Class132_Sub1 arg0, @OriginalArg(1) Class93_Sub16[] arg1) {
		@Pc(7) int local7;
		if (this.aBoolean826) {
			local7 = arg0.method24321(arg1, (short) 8461);
			this.aClass104_11.method20802(local7, arg1);
		}
		if (this.aClass99Array3 == this.aClass99Array1) {
			@Pc(19) boolean local19 = false;
			@Pc(21) boolean local21 = false;
			@Pc(25) Class472 local25 = arg0.method24241().aClass472_61;
			@Pc(36) int local36;
			if (arg0 instanceof Class132_Sub1_Sub1) {
				local7 = ((Class132_Sub1_Sub1) arg0).aShort129;
				local36 = ((Class132_Sub1_Sub1) arg0).aShort128;
			} else {
				local7 = (int) local25.aFloat325 >> this.anInt5599 * -358186793;
				local36 = (int) local25.aFloat327 >> this.anInt5599 * -358186793;
			}
			local7 = Math.min(this.anInt5604 * -200159665 - 1, Math.max(0, local7));
			local36 = Math.min(this.anInt5605 * -1943751559 - 1, Math.max(0, local36));
			@Pc(81) Class237 local81 = new Class237();
			local81.anInt3858 = this.method31639(local7, local36, (byte) -100) * -938620053;
			local81.anInt3856 = this.method31620(local7, local36, 1019599243) * -192371369;
			local81.anInt3860 = this.method31700(local7, local36, -762517434) * -316775901;
			local81.anInt3859 = this.method31623(local7, local36, (short) 1698) * -699093173;
			local81.anInt3861 = this.method31670(local7, local36, (byte) -26) * -913672293;
			local81.anInt3862 = this.method31625(local7, local36, (byte) 126) * 152514549;
			this.aClass104_11.method20557(this.aClass99Array2[0].method2480((int) local25.aFloat325, (int) local25.aFloat327, 601707136), local81);
		}
		@Pc(157) Class573 local157 = arg0.method24283(this.aClass104_11, -874295415);
		if (local157 == null) {
			return;
		}
		if (local157.aBoolean824) {
			local157.aClass132_Sub1_25 = arg0;
			this.aClass569_2.method31484(local157, (byte) 0);
		} else {
			Class305.method26891(local157, (byte) 0);
		}
	}

	@OriginalMember(owner = "client!tx", name = "fc", descriptor = "(Lclient!alh;[Lclient!akf;)V")
	void method31778(@OriginalArg(0) Class132_Sub1 arg0, @OriginalArg(1) Class93_Sub16[] arg1) {
		@Pc(7) int local7;
		if (this.aBoolean826) {
			local7 = arg0.method24321(arg1, (short) 11012);
			this.aClass104_11.method20802(local7, arg1);
		}
		if (this.aClass99Array3 == this.aClass99Array1) {
			@Pc(19) boolean local19 = false;
			@Pc(21) boolean local21 = false;
			@Pc(25) Class472 local25 = arg0.method24241().aClass472_61;
			@Pc(36) int local36;
			if (arg0 instanceof Class132_Sub1_Sub1) {
				local7 = ((Class132_Sub1_Sub1) arg0).aShort129;
				local36 = ((Class132_Sub1_Sub1) arg0).aShort128;
			} else {
				local7 = (int) local25.aFloat325 >> this.anInt5599 * -358186793;
				local36 = (int) local25.aFloat327 >> this.anInt5599 * -358186793;
			}
			local7 = Math.min(this.anInt5604 * -200159665 - 1, Math.max(0, local7));
			local36 = Math.min(this.anInt5605 * -1943751559 - 1, Math.max(0, local36));
			@Pc(81) Class237 local81 = new Class237();
			local81.anInt3858 = this.method31639(local7, local36, (byte) -35) * -938620053;
			local81.anInt3856 = this.method31620(local7, local36, 2099683589) * -192371369;
			local81.anInt3860 = this.method31700(local7, local36, -1461727435) * -316775901;
			local81.anInt3859 = this.method31623(local7, local36, (short) 17701) * -699093173;
			local81.anInt3861 = this.method31670(local7, local36, (byte) -36) * -913672293;
			local81.anInt3862 = this.method31625(local7, local36, (byte) 100) * 152514549;
			this.aClass104_11.method20557(this.aClass99Array2[0].method2480((int) local25.aFloat325, (int) local25.aFloat327, 1397841387), local81);
		}
		@Pc(157) Class573 local157 = arg0.method24283(this.aClass104_11, -1678897995);
		if (local157 == null) {
			return;
		}
		if (local157.aBoolean824) {
			local157.aClass132_Sub1_25 = arg0;
			this.aClass569_2.method31484(local157, (byte) 0);
		} else {
			Class305.method26891(local157, (byte) 0);
		}
	}

	@OriginalMember(owner = "client!tx", name = "by", descriptor = "()V")
	public void method31779() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5604 * -200159665; local1++) {
			for (@Pc(9) int local9 = 0; local9 < this.anInt5605 * -1943751559; local9++) {
				if (this.aClass572ArrayArrayArray3[0][local1][local9] == null) {
					this.aClass572ArrayArrayArray3[0][local1][local9] = new Class572(0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!tx", name = "an", descriptor = "(III)V")
	void method31780(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(1) Class93_Sub1_Sub4 local1 = null;
		for (@Pc(3) int local3 = arg0; local3 < arg1; local3++) {
			@Pc(11) Class99 local11 = this.aClass99Array2[local3];
			if (local11 != null) {
				for (@Pc(16) int local16 = 0; local16 < this.anInt5605 * -1943751559; local16++) {
					for (@Pc(24) int local24 = 0; local24 < this.anInt5604 * -200159665; local24++) {
						local1 = local11.method2484(local24, local16, local1);
						if (local1 != null) {
							@Pc(46) int local46 = local24 << this.anInt5599 * -358186793;
							@Pc(53) int local53 = local16 << this.anInt5599 * -358186793;
							for (@Pc(57) int local57 = local3 - 1; local57 >= 0; local57--) {
								@Pc(64) Class99 local64 = this.aClass99Array2[local57];
								if (local64 != null) {
									@Pc(79) int local79 = local11.method2482(local24, local16, -449240951) - local64.method2482(local24, local16, -1096556570);
									@Pc(95) int local95 = local11.method2482(local24 + 1, local16, -654408952) - local64.method2482(local24 + 1, local16, -1217303923);
									@Pc(115) int local115 = local11.method2482(local24 + 1, local16 + 1, -1387825793) - local64.method2482(local24 + 1, local16 + 1, -1043636689);
									@Pc(131) int local131 = local11.method2482(local24, local16 + 1, -1741694237) - local64.method2482(local24, local16 + 1, -1906586274);
									local64.method2485(local1, local46, (local79 + local95 + local115 + local131) / 4, local53, 0, false);
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tx", name = "fp", descriptor = "(Lclient!ara;III[Z)Z")
	public boolean method31781(@OriginalArg(0) Class93_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (this.aClass99Array3 != this.aClass99Array1) {
			@Pc(15) int local15 = this.aClass99Array2[arg1].method2480(arg2, arg3, 271524711);
			for (@Pc(17) int local17 = 0; local17 <= arg1; local17++) {
				@Pc(25) Class99 local25 = this.aClass99Array2[local17];
				if (local25 != null) {
					@Pc(37) int local37 = local15 - local25.method2480(arg2, arg3, 1558831859);
					if (arg4 != null) {
						arg4[local17] = local25.method2488(arg0, arg2, local37, arg3, 0, false);
						if (!arg4[local17]) {
							continue;
						}
					}
					local25.method2485(arg0, arg2, local37, arg3, 0, false);
					local1 = true;
				}
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!tx", name = "dq", descriptor = "(III)Lclient!asw;")
	public Class132_Sub1_Sub2 method31782(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		if (local8 != null) {
			this.method31642(local8.aClass132_Sub1_Sub2_2, (byte) 56);
			if (local8.aClass132_Sub1_Sub2_2 != null) {
				@Pc(22) Class132_Sub1_Sub2 local22 = local8.aClass132_Sub1_Sub2_2;
				local8.aClass132_Sub1_Sub2_2 = null;
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!tx", name = "ff", descriptor = "(II)V")
	void method31783(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(1) Class93_Sub1_Sub4 local1 = null;
		for (@Pc(3) int local3 = arg0; local3 < arg1; local3++) {
			@Pc(11) Class99 local11 = this.aClass99Array2[local3];
			if (local11 != null) {
				for (@Pc(16) int local16 = 0; local16 < this.anInt5605 * -1943751559; local16++) {
					for (@Pc(24) int local24 = 0; local24 < this.anInt5604 * -200159665; local24++) {
						local1 = local11.method2484(local24, local16, local1);
						if (local1 != null) {
							@Pc(46) int local46 = local24 << this.anInt5599 * -358186793;
							@Pc(53) int local53 = local16 << this.anInt5599 * -358186793;
							for (@Pc(57) int local57 = local3 - 1; local57 >= 0; local57--) {
								@Pc(64) Class99 local64 = this.aClass99Array2[local57];
								if (local64 != null) {
									@Pc(79) int local79 = local11.method2482(local24, local16, -275788059) - local64.method2482(local24, local16, -1416167975);
									@Pc(95) int local95 = local11.method2482(local24 + 1, local16, -1468546760) - local64.method2482(local24 + 1, local16, -1735165048);
									@Pc(115) int local115 = local11.method2482(local24 + 1, local16 + 1, -412679306) - local64.method2482(local24 + 1, local16 + 1, -383574492);
									@Pc(131) int local131 = local11.method2482(local24, local16 + 1, -1280889116) - local64.method2482(local24, local16 + 1, -473870306);
									local64.method2485(local1, local46, (local79 + local95 + local115 + local131) / 4, local53, 0, false);
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tx", name = "fl", descriptor = "()V")
	public void method31784() {
		this.method31780(1, this.anInt5603 * -882426473, -16777216);
	}

	@OriginalMember(owner = "client!tx", name = "k", descriptor = "(I)V")
	public void method31785(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5604 * -200159665; local1++) {
			for (@Pc(9) int local9 = 0; local9 < this.anInt5605 * -1943751559; local9++) {
				if (this.aClass572ArrayArrayArray3[0][local1][local9] == null) {
					this.aClass572ArrayArrayArray3[0][local1][local9] = new Class572(0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!tx", name = "fo", descriptor = "()V")
	public void method31786() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5625 * 809266399; local1++) {
			if (!this.aBooleanArray32[local1]) {
				@Pc(17) Class597 local17 = this.aClass597Array1[local1];
				@Pc(20) Class93_Sub16 local20 = local17.aClass93_Sub16_3;
				@Pc(25) int local25 = local17.anInt5681 * -1484967795;
				@Pc(34) int local34 = local20.method13523((byte) -89) - this.anInt5608 * -996240773;
				@Pc(45) int local45 = (local34 * 2 >> this.anInt5599 * -358186793) + 1;
				@Pc(47) int local47 = 0;
				@Pc(52) int[] local52 = new int[local45 * local45];
				@Pc(63) int local63 = local20.method13520(-1298198508) - local34 >> this.anInt5599 * -358186793;
				@Pc(74) int local74 = local20.method13522(1909174350) - local34 >> this.anInt5599 * -358186793;
				@Pc(85) int local85 = local20.method13522(1328824238) + local34 >> this.anInt5599 * -358186793;
				if (local74 < 0) {
					local47 -= local74;
					local74 = 0;
				}
				if (local85 >= this.anInt5605 * -1943751559) {
					local85 = this.anInt5605 * -1943751559 - 1;
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
					if (local140 >= this.anInt5604 * -200159665) {
						local140 = this.anInt5604 * -200159665 - 1;
					}
					for (@Pc(163) int local163 = local132; local163 <= local140; local163++) {
						@Pc(168) byte local168 = 1;
						@Pc(176) Class132_Sub1_Sub1 local176 = this.method31766(local25, local163, local108, null, (byte) 3);
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
				if (aBoolean827) {
					this.aClass99Array1[local25].method2502(local20, local52);
				}
			}
		}
	}

	@OriginalMember(owner = "client!tx", name = "ct", descriptor = "(II)I")
	public int method31787(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aByteArrayArray22 == null ? 0 : this.aByteArrayArray22[arg0][arg1] & 0xFF;
	}

	@OriginalMember(owner = "client!tx", name = "fe", descriptor = "()Ljava/util/HashMap;")
	public HashMap method31788() {
		this.aHashMap12.clear();
		@Pc(7) Iterator local7 = this.aHashMap11.entrySet().iterator();
		while (local7.hasNext()) {
			@Pc(14) Entry local14 = (Entry) local7.next();
			this.aHashMap12.put(local14.getKey(), ((Class597) ((List) local14.getValue()).get(0)).aClass93_Sub16_3);
		}
		return this.aHashMap12;
	}

	@OriginalMember(owner = "client!tx", name = "fk", descriptor = "(Ljava/util/HashMap;)V")
	public void method31789(@OriginalArg(0) HashMap arg0) {
		this.aHashMap12 = arg0;
	}

	@OriginalMember(owner = "client!tx", name = "as", descriptor = "(IIII)Lclient!asw;")
	public Class132_Sub1_Sub2 method31790(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass132_Sub1_Sub2_2;
	}

	@OriginalMember(owner = "client!tx", name = "j", descriptor = "(IIIB)Lclient!asw;")
	public Class132_Sub1_Sub2 method31791(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		@Pc(8) Class572 local8 = this.aClass572ArrayArrayArray3[arg0][arg1][arg2];
		if (local8 != null) {
			this.method31642(local8.aClass132_Sub1_Sub2_2, (byte) 107);
			if (local8.aClass132_Sub1_Sub2_2 != null) {
				@Pc(22) Class132_Sub1_Sub2 local22 = local8.aClass132_Sub1_Sub2_2;
				local8.aClass132_Sub1_Sub2_2 = null;
				return local22;
			}
		}
		return null;
	}
}
