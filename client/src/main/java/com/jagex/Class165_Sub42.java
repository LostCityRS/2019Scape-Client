package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ant")
public final class Class165_Sub42 extends Class165 {

	@OriginalMember(owner = "client!ant", name = "g", descriptor = "I")
	public static final int anInt2363 = 1;

	@OriginalMember(owner = "client!ant", name = "i", descriptor = "I")
	static final int anInt2364 = 0;

	@OriginalMember(owner = "client!ant", name = "<init>", descriptor = "(Lclient!ale;)V")
	public Class165_Sub42(@OriginalArg(0) Class80_Sub37 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ant", name = "<init>", descriptor = "(ILclient!ale;)V")
	public Class165_Sub42(@OriginalArg(0) int arg0, @OriginalArg(1) Class80_Sub37 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ant", name = "u", descriptor = "(II)V")
	@Override
	void method16952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2398 = arg0 * 251097721;
	}

	@OriginalMember(owner = "client!ant", name = "t", descriptor = "(B)I")
	@Override
	int method16949(@OriginalArg(0) byte arg0) {
		@Pc(5) int local5 = this.aClass80_Sub37_48.aClass165_Sub1_1.method15834(265175582);
		return local5 == 3 || local5 == 5 ? 0 : 0;
	}

	@OriginalMember(owner = "client!ant", name = "f", descriptor = "(IB)I")
	@Override
	int method16950(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		if (arg0 == 0) {
			return 1;
		} else if (this.aClass80_Sub37_48.method14947(-15823080).method442(1256569244) < 2) {
			return 3;
		} else {
			@Pc(20) int local20 = this.aClass80_Sub37_48.aClass165_Sub1_1.method15834(-460029979);
			return local20 == 3 || local20 == 5 ? 1 : 3;
		}
	}

	@OriginalMember(owner = "client!ant", name = "w", descriptor = "()I")
	public int method16827() {
		return this.anInt2398 * -229615671;
	}

	@OriginalMember(owner = "client!ant", name = "a", descriptor = "(B)V")
	public void method16828(@OriginalArg(0) byte arg0) {
		@Pc(5) int local5 = this.aClass80_Sub37_48.aClass165_Sub1_1.method15834(-1690491366);
		if (local5 != 3 && local5 != 5) {
			this.anInt2398 = 0;
		}
		if (this.aClass80_Sub37_48.method14947(-1633499776).method442(1256569244) < 2) {
			this.anInt2398 = 0;
		}
		if (this.anInt2398 * -229615671 != 0 && this.anInt2398 * -229615671 != 1) {
			this.anInt2398 = this.method16949((byte) 57) * 251097721;
		}
	}

	@OriginalMember(owner = "client!ant", name = "g", descriptor = "()I")
	@Override
	int method16948() {
		@Pc(5) int local5 = this.aClass80_Sub37_48.aClass165_Sub1_1.method15834(78660034);
		return local5 == 3 || local5 == 5 ? 0 : 0;
	}

	@OriginalMember(owner = "client!ant", name = "l", descriptor = "()I")
	@Override
	int method16953() {
		@Pc(5) int local5 = this.aClass80_Sub37_48.aClass165_Sub1_1.method15834(591562342);
		return local5 == 3 || local5 == 5 ? 0 : 0;
	}

	@OriginalMember(owner = "client!ant", name = "i", descriptor = "(I)I")
	@Override
	int method16954(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return 1;
		} else if (this.aClass80_Sub37_48.method14947(1584508144).method442(1256569244) < 2) {
			return 3;
		} else {
			@Pc(20) int local20 = this.aClass80_Sub37_48.aClass165_Sub1_1.method15834(-1493660634);
			return local20 == 3 || local20 == 5 ? 1 : 3;
		}
	}

	@OriginalMember(owner = "client!ant", name = "m", descriptor = "(I)V")
	@Override
	void method16955(@OriginalArg(0) int arg0) {
		this.anInt2398 = arg0 * 251097721;
	}

	@OriginalMember(owner = "client!ant", name = "k", descriptor = "()V")
	public void method16829() {
		@Pc(5) int local5 = this.aClass80_Sub37_48.aClass165_Sub1_1.method15834(1353479516);
		if (local5 != 3 && local5 != 5) {
			this.anInt2398 = 0;
		}
		if (this.aClass80_Sub37_48.method14947(-1996329901).method442(1256569244) < 2) {
			this.anInt2398 = 0;
		}
		if (this.anInt2398 * -229615671 != 0 && this.anInt2398 * -229615671 != 1) {
			this.anInt2398 = this.method16949((byte) 76) * 251097721;
		}
	}

	@OriginalMember(owner = "client!ant", name = "x", descriptor = "()V")
	public void method16830() {
		@Pc(5) int local5 = this.aClass80_Sub37_48.aClass165_Sub1_1.method15834(932643730);
		if (local5 != 3 && local5 != 5) {
			this.anInt2398 = 0;
		}
		if (this.aClass80_Sub37_48.method14947(-1373555719).method442(1256569244) < 2) {
			this.anInt2398 = 0;
		}
		if (this.anInt2398 * -229615671 != 0 && this.anInt2398 * -229615671 != 1) {
			this.anInt2398 = this.method16949((byte) -84) * 251097721;
		}
	}

	@OriginalMember(owner = "client!ant", name = "d", descriptor = "()I")
	public int method16831() {
		return this.anInt2398 * -229615671;
	}

	@OriginalMember(owner = "client!ant", name = "r", descriptor = "()I")
	public int method16832() {
		return this.anInt2398 * -229615671;
	}

	@OriginalMember(owner = "client!ant", name = "q", descriptor = "()I")
	public int method16833() {
		return this.anInt2398 * -229615671;
	}

	@OriginalMember(owner = "client!ant", name = "h", descriptor = "()I")
	public int method16834() {
		return this.anInt2398 * -229615671;
	}

	@OriginalMember(owner = "client!ant", name = "s", descriptor = "(I)I")
	public int method16835(@OriginalArg(0) int arg0) {
		return this.anInt2398 * -229615671;
	}
}
