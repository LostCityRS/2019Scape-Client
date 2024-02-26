package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ans")
public final class Class165_Sub41 extends Class165 {

	@OriginalMember(owner = "client!ans", name = "g", descriptor = "I")
	public static final int anInt2357 = 1;

	@OriginalMember(owner = "client!ans", name = "i", descriptor = "I")
	public static final int anInt2358 = 0;

	@OriginalMember(owner = "client!ans", name = "u", descriptor = "(B)V")
	public static void method16812(@OriginalArg(0) byte arg0) {
		Class251.aShort164 = client.aShort154;
		Class253.aShort165 = client.aShort153;
		Class427.aShort172 = client.aShort160;
		Class113.aShort23 = client.aShort155;
		Class251.aBoolean774 = true;
		Class251.anInt3879 = Class490.aClass263_13.method26606(1773608983) * 1407837447;
		if (Class251.anInt3878 * -235016787 != 0 && Class251.anInt3877 * -1558544691 != 0) {
			client.aShort160 = 334;
			client.aShort155 = 334;
			client.aShort153 = client.aShort154 = (short) (Class251.anInt3878 * -69510656 / (Class251.anInt3877 * -1558544691));
		}
	}

	@OriginalMember(owner = "client!ans", name = "hv", descriptor = "(Lclient!yp;B)V")
	static void method16813(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2061942424);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class630.method32716(local16, local22, true, 0, arg0, -1102022993);
	}

	@OriginalMember(owner = "client!ans", name = "<init>", descriptor = "(ILclient!ale;)V")
	public Class165_Sub41(@OriginalArg(0) int arg0, @OriginalArg(1) Class80_Sub37 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ans", name = "<init>", descriptor = "(Lclient!ale;)V")
	public Class165_Sub41(@OriginalArg(0) Class80_Sub37 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ans", name = "g", descriptor = "()I")
	@Override
	int method16948() {
		return 1;
	}

	@OriginalMember(owner = "client!ans", name = "a", descriptor = "(I)V")
	public void method16800(@OriginalArg(0) int arg0) {
		if (this.aClass80_Sub37_48.method14956((short) 16383) != Class722.aClass722_10) {
			this.anInt2398 = 251097721;
		}
		if (this.anInt2398 * -229615671 != 0 && this.anInt2398 * -229615671 != 1) {
			this.anInt2398 = this.method16949((byte) -45) * 251097721;
		}
	}

	@OriginalMember(owner = "client!ans", name = "t", descriptor = "(B)I")
	@Override
	int method16949(@OriginalArg(0) byte arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!ans", name = "i", descriptor = "(I)I")
	@Override
	public int method16954(@OriginalArg(0) int arg0) {
		if (this.aClass80_Sub37_48.method14956((short) 16383) != Class722.aClass722_10) {
			return 3;
		}
		if (arg0 == 0) {
			if (this.aClass80_Sub37_48.aClass165_Sub9_1.method15996((byte) -51) == 1) {
				return 2;
			}
			if (this.aClass80_Sub37_48.aClass165_Sub2_1.method15861(1423795933) == 1) {
				return 2;
			}
			if (this.aClass80_Sub37_48.aClass165_Sub13_1.method16080(1250360010) > 0) {
				return 2;
			}
		}
		return 1;
	}

	@OriginalMember(owner = "client!ans", name = "f", descriptor = "(IB)I")
	@Override
	public int method16950(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		if (this.aClass80_Sub37_48.method14956((short) 16383) != Class722.aClass722_10) {
			return 3;
		}
		if (arg0 == 0) {
			if (this.aClass80_Sub37_48.aClass165_Sub9_1.method15996((byte) -28) == 1) {
				return 2;
			}
			if (this.aClass80_Sub37_48.aClass165_Sub2_1.method15861(1423795933) == 1) {
				return 2;
			}
			if (this.aClass80_Sub37_48.aClass165_Sub13_1.method16080(-893353035) > 0) {
				return 2;
			}
		}
		return 1;
	}

	@OriginalMember(owner = "client!ans", name = "d", descriptor = "()Z")
	public boolean method16801() {
		return this.aClass80_Sub37_48.method14956((short) 16383) == Class722.aClass722_10;
	}

	@OriginalMember(owner = "client!ans", name = "k", descriptor = "(B)I")
	public int method16802(@OriginalArg(0) byte arg0) {
		return this.anInt2398 * -229615671;
	}

	@OriginalMember(owner = "client!ans", name = "l", descriptor = "()I")
	@Override
	int method16953() {
		return 1;
	}

	@OriginalMember(owner = "client!ans", name = "u", descriptor = "(II)V")
	@Override
	void method16952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2398 = arg0 * 251097721;
	}

	@OriginalMember(owner = "client!ans", name = "w", descriptor = "()Z")
	public boolean method16803() {
		return this.aClass80_Sub37_48.method14956((short) 16383) == Class722.aClass722_10;
	}

	@OriginalMember(owner = "client!ans", name = "x", descriptor = "()Z")
	public boolean method16804() {
		return this.aClass80_Sub37_48.method14956((short) 16383) == Class722.aClass722_10;
	}

	@OriginalMember(owner = "client!ans", name = "m", descriptor = "(I)V")
	@Override
	void method16955(@OriginalArg(0) int arg0) {
		this.anInt2398 = arg0 * 251097721;
	}

	@OriginalMember(owner = "client!ans", name = "r", descriptor = "()Z")
	public boolean method16805() {
		return this.aClass80_Sub37_48.method14956((short) 16383) == Class722.aClass722_10;
	}

	@OriginalMember(owner = "client!ans", name = "q", descriptor = "()Z")
	public boolean method16806() {
		return this.aClass80_Sub37_48.method14956((short) 16383) == Class722.aClass722_10;
	}

	@OriginalMember(owner = "client!ans", name = "h", descriptor = "()Z")
	public boolean method16807() {
		return this.aClass80_Sub37_48.method14956((short) 16383) == Class722.aClass722_10;
	}

	@OriginalMember(owner = "client!ans", name = "s", descriptor = "(B)Z")
	public boolean method16808(@OriginalArg(0) byte arg0) {
		return this.aClass80_Sub37_48.method14956((short) 16383) == Class722.aClass722_10;
	}

	@OriginalMember(owner = "client!ans", name = "z", descriptor = "()Z")
	public boolean method16809() {
		return this.aClass80_Sub37_48.method14956((short) 16383) == Class722.aClass722_10;
	}

	@OriginalMember(owner = "client!ans", name = "p", descriptor = "()I")
	public int method16810() {
		return this.anInt2398 * -229615671;
	}

	@OriginalMember(owner = "client!ans", name = "v", descriptor = "()I")
	public int method16811() {
		return this.anInt2398 * -229615671;
	}
}
