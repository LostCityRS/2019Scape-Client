package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wv")
public final class Class649 {

	@OriginalMember(owner = "client!wv", name = "t", descriptor = "I")
	final int anInt5652;

	@OriginalMember(owner = "client!wv", name = "f", descriptor = "I")
	final int anInt5653;

	@OriginalMember(owner = "client!wv", name = "e", descriptor = "Z")
	boolean aBoolean968;

	@OriginalMember(owner = "client!wv", name = "g", descriptor = "Lclient!wy;")
	final Class652 aClass652_1;

	@OriginalMember(owner = "client!wv", name = "i", descriptor = "I")
	final int anInt5655;

	@OriginalMember(owner = "client!wv", name = "l", descriptor = "I")
	final int anInt5654;

	@OriginalMember(owner = "client!wv", name = "u", descriptor = "I")
	final int anInt5651;

	@OriginalMember(owner = "client!wv", name = "ha", descriptor = "(Lclient!yp;I)V")
	static void method33111(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2135508492);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class630.method32716(local16, local22, false, 0, arg0, -1102022993);
	}

	@OriginalMember(owner = "client!wv", name = "mm", descriptor = "(Lclient!yp;I)V")
	static void method33112(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2116118890);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class449.method29263(local16, local22, arg0, (byte) 65);
	}

	@OriginalMember(owner = "client!wv", name = "abz", descriptor = "(Lclient!yp;S)V")
	static void method33113(@OriginalArg(0) Class690 arg0, @OriginalArg(1) short arg1) {
		arg0.anInt5778 -= 1815275855;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		@Pc(38) boolean local38 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 2] == 1;
		@Pc(46) Class661 local46 = Class134.aClass305_1.method27140(local13, -199781606).method27087(local23, (byte) 8);
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local38 ? local46.method33296(735825645) : local46.method33293(-1049508377);
	}

	@OriginalMember(owner = "client!wv", name = "alq", descriptor = "(Lclient!yp;B)V")
	static void method33114(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		if (local12 >= 1 && local12 <= 2) {
			Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub18_1, local12, (byte) 123);
			Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub18_2, local12, (byte) 113);
			Class719.method37291(319328315);
		}
	}

	@OriginalMember(owner = "client!wv", name = "ave", descriptor = "(Lclient!yp;I)V")
	static void method33115(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = client.aShort158;
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = client.aShort159;
	}

	@OriginalMember(owner = "client!wv", name = "t", descriptor = "(S)[Lclient!zo;")
	public static Class713[] method33116(@OriginalArg(0) short arg0) {
		return new Class713[] { Class713.aClass713_2, Class713.aClass713_3, Class713.aClass713_6, Class713.aClass713_7, Class713.aClass713_5, Class713.aClass713_10, Class713.aClass713_9, Class713.aClass713_8, Class713.aClass713_4 };
	}

	@OriginalMember(owner = "client!wv", name = "rg", descriptor = "(Lclient!yp;I)V")
	static void method33117(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local11.anInt4160 * 104389345;
	}

	@OriginalMember(owner = "client!wv", name = "<init>", descriptor = "(IIZZILclient!wy;I)V")
	Class649(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class652 arg5, @OriginalArg(6) int arg6) {
		this.anInt5652 = arg0 * 673117467;
		this.anInt5653 = arg1 * 508086843;
		this.aBoolean968 = arg2;
		this.aClass652_1 = arg5;
		this.anInt5655 = arg6 * 1774621287;
		if (arg2) {
			this.anInt5654 = arg4 * -2019808323;
			this.anInt5651 = this.method33095(arg4, (byte) -112) * -1041466865;
		} else {
			this.anInt5654 = 2019808323;
			this.anInt5651 = 1041466865;
		}
	}

	@OriginalMember(owner = "client!wv", name = "e", descriptor = "(I)I")
	public int method33080(@OriginalArg(0) int arg0) {
		return this.anInt5651 * 1486959855;
	}

	@OriginalMember(owner = "client!wv", name = "t", descriptor = "(I)I")
	int method33081(@OriginalArg(0) int arg0) {
		return this.anInt5652 * 596335891;
	}

	@OriginalMember(owner = "client!wv", name = "f", descriptor = "(B)Z")
	public boolean method33082(@OriginalArg(0) byte arg0) {
		return this.aBoolean968;
	}

	@OriginalMember(owner = "client!wv", name = "j", descriptor = "()I")
	int method33083() {
		return this.anInt5652 * 596335891;
	}

	@OriginalMember(owner = "client!wv", name = "u", descriptor = "(I)I")
	public int method33084(@OriginalArg(0) int arg0) {
		return this.anInt5654 * -1847597163;
	}

	@OriginalMember(owner = "client!wv", name = "l", descriptor = "(I)Z")
	public boolean method33085(@OriginalArg(0) int arg0) {
		return this.anInt5651 * 1486959855 != -1;
	}

	@OriginalMember(owner = "client!wv", name = "g", descriptor = "(II)I")
	public int method33086(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.aClass652_1.method33134(arg0, 221776965) + this.anInt5655 * 231237975;
		return local10 > this.anInt5653 * -1825734925 ? this.anInt5653 * -1825734925 : local10;
	}

	@OriginalMember(owner = "client!wv", name = "ax", descriptor = "(I)I")
	int method33087(@OriginalArg(0) int arg0) {
		if (arg0 > this.anInt5653 * -1825734925) {
			arg0 = this.anInt5653 * -1825734925;
		}
		return this.aClass652_1.method33132(arg0 - this.anInt5655 * 231237975, 2058327980);
	}

	@OriginalMember(owner = "client!wv", name = "m", descriptor = "(II)I")
	int method33088(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 > this.anInt5653 * -1825734925) {
			arg0 = this.anInt5653 * -1825734925;
		}
		return this.aClass652_1.method33132(arg0 - this.anInt5655 * 231237975, 2141545895);
	}

	@OriginalMember(owner = "client!wv", name = "v", descriptor = "()I")
	public int method33089() {
		return this.anInt5654 * -1847597163;
	}

	@OriginalMember(owner = "client!wv", name = "n", descriptor = "(I)I")
	public int method33090(@OriginalArg(0) int arg0) {
		@Pc(10) int local10 = this.aClass652_1.method33134(arg0, -1712384990) + this.anInt5655 * 231237975;
		return local10 > this.anInt5653 * -1825734925 ? this.anInt5653 * -1825734925 : local10;
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "()I")
	int method33091() {
		return this.anInt5652 * 596335891;
	}

	@OriginalMember(owner = "client!wv", name = "i", descriptor = "(IB)I")
	public int method33092(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) int local3 = arg0 / 10;
		return this.method33086(local3, 1904711300);
	}

	@OriginalMember(owner = "client!wv", name = "k", descriptor = "()Z")
	public boolean method33093() {
		return this.aBoolean968;
	}

	@OriginalMember(owner = "client!wv", name = "x", descriptor = "()Z")
	public boolean method33094() {
		return this.aBoolean968;
	}

	@OriginalMember(owner = "client!wv", name = "o", descriptor = "(IB)I")
	int method33095(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return this.method33088(arg0, 1916144881) * 10;
	}

	@OriginalMember(owner = "client!wv", name = "s", descriptor = "()I")
	int method33096() {
		return this.anInt5652 * 596335891;
	}

	@OriginalMember(owner = "client!wv", name = "q", descriptor = "()Z")
	public boolean method33097() {
		return this.aBoolean968;
	}

	@OriginalMember(owner = "client!wv", name = "h", descriptor = "()I")
	public int method33098() {
		return this.anInt5651 * 1486959855;
	}

	@OriginalMember(owner = "client!wv", name = "d", descriptor = "()I")
	public int method33099() {
		return this.anInt5651 * 1486959855;
	}

	@OriginalMember(owner = "client!wv", name = "z", descriptor = "()I")
	public int method33100() {
		return this.anInt5654 * -1847597163;
	}

	@OriginalMember(owner = "client!wv", name = "p", descriptor = "()I")
	public int method33101() {
		return this.anInt5654 * -1847597163;
	}

	@OriginalMember(owner = "client!wv", name = "w", descriptor = "()Z")
	public boolean method33102() {
		return this.aBoolean968;
	}

	@OriginalMember(owner = "client!wv", name = "r", descriptor = "()Z")
	public boolean method33103() {
		return this.aBoolean968;
	}

	@OriginalMember(owner = "client!wv", name = "c", descriptor = "(I)I")
	public int method33104(@OriginalArg(0) int arg0) {
		@Pc(10) int local10 = this.aClass652_1.method33134(arg0, -1925551721) + this.anInt5655 * 231237975;
		return local10 > this.anInt5653 * -1825734925 ? this.anInt5653 * -1825734925 : local10;
	}

	@OriginalMember(owner = "client!wv", name = "b", descriptor = "(I)I")
	public int method33105(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 / 10;
		return this.method33086(local3, 1751315508);
	}

	@OriginalMember(owner = "client!wv", name = "y", descriptor = "()Z")
	public boolean method33106() {
		return this.anInt5651 * 1486959855 != -1;
	}

	@OriginalMember(owner = "client!wv", name = "ay", descriptor = "(I)I")
	int method33107(@OriginalArg(0) int arg0) {
		if (arg0 > this.anInt5653 * -1825734925) {
			arg0 = this.anInt5653 * -1825734925;
		}
		return this.aClass652_1.method33132(arg0 - this.anInt5655 * 231237975, 2056630237);
	}

	@OriginalMember(owner = "client!wv", name = "ai", descriptor = "(I)I")
	int method33108(@OriginalArg(0) int arg0) {
		return this.method33088(arg0, 1151931853) * 10;
	}

	@OriginalMember(owner = "client!wv", name = "aq", descriptor = "(I)I")
	int method33109(@OriginalArg(0) int arg0) {
		return this.method33088(arg0, 1638260124) * 10;
	}

	@OriginalMember(owner = "client!wv", name = "ao", descriptor = "(I)I")
	int method33110(@OriginalArg(0) int arg0) {
		return this.method33088(arg0, -1575408121) * 10;
	}
}
