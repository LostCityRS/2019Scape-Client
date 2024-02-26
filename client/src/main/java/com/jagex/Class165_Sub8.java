package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!amh")
public final class Class165_Sub8 extends Class165 {

	@OriginalMember(owner = "client!amh", name = "m", descriptor = "I")
	public static final int anInt2139 = 2;

	@OriginalMember(owner = "client!amh", name = "g", descriptor = "I")
	public static final int anInt2140 = 0;

	@OriginalMember(owner = "client!amh", name = "i", descriptor = "I")
	public static final int anInt2141 = 1;

	@OriginalMember(owner = "client!amh", name = "q", descriptor = "(Ljava/lang/String;CLjava/lang/String;B)Ljava/lang/String;")
	public static String method15979(@OriginalArg(0) String arg0, @OriginalArg(1) char arg1, @OriginalArg(2) String arg2, @OriginalArg(3) byte arg3) {
		@Pc(2) int local2 = arg0.length();
		@Pc(5) int local5 = arg2.length();
		@Pc(7) int local7 = local2;
		@Pc(11) int local11 = local5 - 1;
		if (local11 != 0) {
			@Pc(15) int local15 = 0;
			while (true) {
				local15 = arg0.indexOf(arg1, local15);
				if (local15 < 0) {
					break;
				}
				local15++;
				local7 += local11;
			}
		}
		@Pc(34) StringBuilder local34 = new StringBuilder(local7);
		@Pc(36) int local36 = 0;
		while (true) {
			@Pc(41) int local41 = arg0.indexOf(arg1, local36);
			if (local41 < 0) {
				local34.append(arg0.substring(local36));
				return local34.toString();
			}
			local34.append(arg0.substring(local36, local41));
			local34.append(arg2);
			local36 = local41 + 1;
		}
	}

	@OriginalMember(owner = "client!amh", name = "<init>", descriptor = "(ILclient!ale;)V")
	public Class165_Sub8(@OriginalArg(0) int arg0, @OriginalArg(1) Class80_Sub37 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!amh", name = "<init>", descriptor = "(Lclient!ale;)V")
	public Class165_Sub8(@OriginalArg(0) Class80_Sub37 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!amh", name = "h", descriptor = "()Z")
	public boolean method15971() {
		return true;
	}

	@OriginalMember(owner = "client!amh", name = "a", descriptor = "(I)V")
	public void method15972(@OriginalArg(0) int arg0) {
		if (this.anInt2398 * -229615671 < 0 || this.anInt2398 * -229615671 > 2) {
			this.anInt2398 = this.method16949((byte) -104) * 251097721;
		}
	}

	@OriginalMember(owner = "client!amh", name = "s", descriptor = "(I)Z")
	public boolean method15973(@OriginalArg(0) int arg0) {
		return true;
	}

	@OriginalMember(owner = "client!amh", name = "g", descriptor = "()I")
	@Override
	int method16948() {
		return this.aClass80_Sub37_48.aClass165_Sub1_2.method15843(-1756455147) && Class549.method31316(this.aClass80_Sub37_48.aClass165_Sub1_2.method15834(1997050123), -1510064473) ? 1 : 0;
	}

	@OriginalMember(owner = "client!amh", name = "i", descriptor = "(I)I")
	@Override
	public int method16954(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!amh", name = "u", descriptor = "(II)V")
	@Override
	void method16952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2398 = arg0 * 251097721;
	}

	@OriginalMember(owner = "client!amh", name = "k", descriptor = "(I)I")
	public int method15974(@OriginalArg(0) int arg0) {
		return this.anInt2398 * -229615671;
	}

	@OriginalMember(owner = "client!amh", name = "w", descriptor = "()V")
	public void method15975() {
		if (this.anInt2398 * -229615671 < 0 || this.anInt2398 * -229615671 > 2) {
			this.anInt2398 = this.method16949((byte) -12) * 251097721;
		}
	}

	@OriginalMember(owner = "client!amh", name = "t", descriptor = "(B)I")
	@Override
	int method16949(@OriginalArg(0) byte arg0) {
		return this.aClass80_Sub37_48.aClass165_Sub1_2.method15843(-1122608640) && Class549.method31316(this.aClass80_Sub37_48.aClass165_Sub1_2.method15834(-1534679990), -63515298) ? 1 : 0;
	}

	@OriginalMember(owner = "client!amh", name = "m", descriptor = "(I)V")
	@Override
	void method16955(@OriginalArg(0) int arg0) {
		this.anInt2398 = arg0 * 251097721;
	}

	@OriginalMember(owner = "client!amh", name = "x", descriptor = "()V")
	public void method15976() {
		if (this.anInt2398 * -229615671 < 0 || this.anInt2398 * -229615671 > 2) {
			this.anInt2398 = this.method16949((byte) 17) * 251097721;
		}
	}

	@OriginalMember(owner = "client!amh", name = "f", descriptor = "(IB)I")
	@Override
	public int method16950(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return 1;
	}

	@OriginalMember(owner = "client!amh", name = "r", descriptor = "()Z")
	public boolean method15977() {
		return true;
	}

	@OriginalMember(owner = "client!amh", name = "q", descriptor = "()Z")
	public boolean method15978() {
		return true;
	}

	@OriginalMember(owner = "client!amh", name = "l", descriptor = "()I")
	@Override
	int method16953() {
		return this.aClass80_Sub37_48.aClass165_Sub1_2.method15843(1266145730) && Class549.method31316(this.aClass80_Sub37_48.aClass165_Sub1_2.method15834(-1062136322), -1680570536) ? 1 : 0;
	}
}
