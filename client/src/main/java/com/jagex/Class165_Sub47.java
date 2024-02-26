package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!anz")
public final class Class165_Sub47 extends Class165 {

	@OriginalMember(owner = "client!anz", name = "g", descriptor = "I")
	static final int anInt2399 = 3;

	@OriginalMember(owner = "client!anz", name = "i", descriptor = "I")
	public static final int anInt2400 = 1;

	@OriginalMember(owner = "client!anz", name = "m", descriptor = "I")
	public static final int anInt2401 = 0;

	@OriginalMember(owner = "client!anz", name = "lr", descriptor = "(Lclient!yp;B)V")
	static void method16974(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		Class165_Sub40.method16785(local11, arg0, -961273646);
	}

	@OriginalMember(owner = "client!anz", name = "<init>", descriptor = "(ILclient!ale;)V")
	public Class165_Sub47(@OriginalArg(0) int arg0, @OriginalArg(1) Class80_Sub37 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!anz", name = "<init>", descriptor = "(Lclient!ale;)V")
	public Class165_Sub47(@OriginalArg(0) Class80_Sub37 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!anz", name = "s", descriptor = "(I)Z")
	public boolean method16961(@OriginalArg(0) int arg0) {
		return Class73_Sub2.method18060(this.aClass80_Sub37_48.aClass165_Sub1_2.method15834(1358964321), 913643797);
	}

	@OriginalMember(owner = "client!anz", name = "r", descriptor = "()Z")
	public boolean method16962() {
		return Class73_Sub2.method18060(this.aClass80_Sub37_48.aClass165_Sub1_2.method15834(1056937188), 913643797);
	}

	@OriginalMember(owner = "client!anz", name = "a", descriptor = "(I)V")
	public void method16963(@OriginalArg(0) int arg0) {
		if (this.aClass80_Sub37_48.aClass165_Sub1_2.method15843(-1408928472) && !Class73_Sub2.method18060(this.aClass80_Sub37_48.aClass165_Sub1_2.method15834(693864128), 913643797)) {
			this.anInt2398 = 0;
		}
		if (this.aClass80_Sub37_48.method14947(1458964168).method449(-1015329066)) {
			if (this.anInt2398 * -229615671 < 0 || this.anInt2398 * -229615671 > 3) {
				this.anInt2398 = this.method16949((byte) -70) * 251097721;
			}
		} else if (this.anInt2398 * -229615671 < 0 || this.anInt2398 * -229615671 > 1) {
			this.anInt2398 = this.method16949((byte) -25) * 251097721;
		}
	}

	@OriginalMember(owner = "client!anz", name = "t", descriptor = "(B)I")
	@Override
	int method16949(@OriginalArg(0) byte arg0) {
		return 0;
	}

	@OriginalMember(owner = "client!anz", name = "y", descriptor = "()I")
	public int method16964() {
		return this.anInt2398 * -229615671;
	}

	@OriginalMember(owner = "client!anz", name = "f", descriptor = "(IB)I")
	@Override
	public int method16950(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return Class73_Sub2.method18060(this.aClass80_Sub37_48.aClass165_Sub1_2.method15834(-1451915005), 913643797) ? 1 : 3;
	}

	@OriginalMember(owner = "client!anz", name = "u", descriptor = "(II)V")
	@Override
	void method16952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2398 = arg0 * 251097721;
	}

	@OriginalMember(owner = "client!anz", name = "k", descriptor = "(S)I")
	public int method16965(@OriginalArg(0) short arg0) {
		return this.anInt2398 * -229615671;
	}

	@OriginalMember(owner = "client!anz", name = "g", descriptor = "()I")
	@Override
	int method16948() {
		return 0;
	}

	@OriginalMember(owner = "client!anz", name = "i", descriptor = "(I)I")
	@Override
	public int method16954(@OriginalArg(0) int arg0) {
		return Class73_Sub2.method18060(this.aClass80_Sub37_48.aClass165_Sub1_2.method15834(-195591163), 913643797) ? 1 : 3;
	}

	@OriginalMember(owner = "client!anz", name = "m", descriptor = "(I)V")
	@Override
	void method16955(@OriginalArg(0) int arg0) {
		this.anInt2398 = arg0 * 251097721;
	}

	@OriginalMember(owner = "client!anz", name = "x", descriptor = "()V")
	public void method16966() {
		if (this.aClass80_Sub37_48.aClass165_Sub1_2.method15843(-1764674268) && !Class73_Sub2.method18060(this.aClass80_Sub37_48.aClass165_Sub1_2.method15834(-1648091612), 913643797)) {
			this.anInt2398 = 0;
		}
		if (this.aClass80_Sub37_48.method14947(380793941).method449(-1512373316)) {
			if (this.anInt2398 * -229615671 < 0 || this.anInt2398 * -229615671 > 3) {
				this.anInt2398 = this.method16949((byte) -2) * 251097721;
			}
		} else if (this.anInt2398 * -229615671 < 0 || this.anInt2398 * -229615671 > 1) {
			this.anInt2398 = this.method16949((byte) -65) * 251097721;
		}
	}

	@OriginalMember(owner = "client!anz", name = "w", descriptor = "()V")
	public void method16967() {
		if (this.aClass80_Sub37_48.aClass165_Sub1_2.method15843(863524767) && !Class73_Sub2.method18060(this.aClass80_Sub37_48.aClass165_Sub1_2.method15834(-87871415), 913643797)) {
			this.anInt2398 = 0;
		}
		if (this.aClass80_Sub37_48.method14947(-1007882530).method449(769704305)) {
			if (this.anInt2398 * -229615671 < 0 || this.anInt2398 * -229615671 > 3) {
				this.anInt2398 = this.method16949((byte) 52) * 251097721;
			}
		} else if (this.anInt2398 * -229615671 < 0 || this.anInt2398 * -229615671 > 1) {
			this.anInt2398 = this.method16949((byte) -43) * 251097721;
		}
	}

	@OriginalMember(owner = "client!anz", name = "z", descriptor = "()I")
	public int method16968() {
		return this.anInt2398 * -229615671;
	}

	@OriginalMember(owner = "client!anz", name = "q", descriptor = "()Z")
	public boolean method16969() {
		return Class73_Sub2.method18060(this.aClass80_Sub37_48.aClass165_Sub1_2.method15834(335868767), 913643797);
	}

	@OriginalMember(owner = "client!anz", name = "h", descriptor = "()Z")
	public boolean method16970() {
		return Class73_Sub2.method18060(this.aClass80_Sub37_48.aClass165_Sub1_2.method15834(2071658089), 913643797);
	}

	@OriginalMember(owner = "client!anz", name = "d", descriptor = "()I")
	public int method16971() {
		return this.anInt2398 * -229615671;
	}

	@OriginalMember(owner = "client!anz", name = "v", descriptor = "()I")
	public int method16972() {
		return this.anInt2398 * -229615671;
	}

	@OriginalMember(owner = "client!anz", name = "p", descriptor = "()I")
	public int method16973() {
		return this.anInt2398 * -229615671;
	}

	@OriginalMember(owner = "client!anz", name = "l", descriptor = "()I")
	@Override
	int method16953() {
		return 0;
	}
}
