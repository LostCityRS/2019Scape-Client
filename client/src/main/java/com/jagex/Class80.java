package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tn")
public class Class80 {

	@OriginalMember(owner = "client!tn", name = "jx", descriptor = "J")
	static long aLong339;

	@OriginalMember(owner = "client!tn", name = "px", descriptor = "Z")
	public static boolean aBoolean664;

	@OriginalMember(owner = "client!tn", name = "t", descriptor = "J")
	public long aLong338;

	@OriginalMember(owner = "client!tn", name = "f", descriptor = "Lclient!tn;")
	public Class80 aClass80_227;

	@OriginalMember(owner = "client!tn", name = "e", descriptor = "Lclient!tn;")
	public Class80 aClass80_228;

	@OriginalMember(owner = "client!tn", name = "e", descriptor = "(Lclient!act;B)V")
	public static void method24400(@OriginalArg(0) Class68 arg0, @OriginalArg(1) byte arg1) {
		Class130_Sub1.method10205(new Class603(arg0), (byte) -102);
	}

	@OriginalMember(owner = "client!tn", name = "uh", descriptor = "(Lclient!yp;B)V")
	static void method24401(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 1996613514);
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local16.anInt4110 * -1652867993;
	}

	@OriginalMember(owner = "client!tn", name = "acm", descriptor = "(Lclient!yp;S)V")
	static void method24402(@OriginalArg(0) Class690 arg0, @OriginalArg(1) short arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = arg0.aClass378_3.anIntArray438[local12];
	}

	@OriginalMember(owner = "client!tn", name = "atw", descriptor = "(Lclient!yp;I)V")
	static void method24403(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= 2036747717;
	}

	@OriginalMember(owner = "client!tn", name = "mf", descriptor = "(IZI)V")
	public static void method24404(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (Class477.aClass80_Sub32_3 == null || (arg0 < 0 || arg0 >= Class477.aClass80_Sub32_3.anInt1650 * 753247591)) {
			return;
		}
		@Pc(17) Class382 local17 = Class477.aClass80_Sub32_3.aClass382Array1[arg0];
		@Pc(20) Class75 local20 = Class52.method1074(16777215);
		@Pc(26) Class80_Sub31 local26 = Class623.method32440(Class443.aClass443_54, local20.aClass22_1, -191270971);
		local26.aClass80_Sub36_Sub1_2.method23154(Class350.method28013(local17.aString204, (short) 16383) + 3, 1275868335);
		local26.aClass80_Sub36_Sub1_2.method23155(arg0, (byte) -48);
		local26.aClass80_Sub36_Sub1_2.method23154(arg1 ? 1 : 0, 1275868335);
		local26.aClass80_Sub36_Sub1_2.method23165(local17.aString204, 2073292404);
		local20.method1325(local26, (byte) -111);
	}

	@OriginalMember(owner = "client!tn", name = "q", descriptor = "()V")
	public final void method24394() {
		if (this.aClass80_228 != null) {
			this.aClass80_228.aClass80_227 = this.aClass80_227;
			this.aClass80_227.aClass80_228 = this.aClass80_228;
			this.aClass80_227 = null;
			this.aClass80_228 = null;
		}
	}

	@OriginalMember(owner = "client!tn", name = "k", descriptor = "(B)V")
	public final void method24395(@OriginalArg(0) byte arg0) {
		if (this.aClass80_228 != null) {
			this.aClass80_228.aClass80_227 = this.aClass80_227;
			this.aClass80_227.aClass80_228 = this.aClass80_228;
			this.aClass80_227 = null;
			this.aClass80_228 = null;
		}
	}

	@OriginalMember(owner = "client!tn", name = "d", descriptor = "()Z")
	public final boolean method24396() {
		return this.aClass80_228 != null;
	}

	@OriginalMember(owner = "client!tn", name = "r", descriptor = "()V")
	public final void method24397() {
		if (this.aClass80_228 != null) {
			this.aClass80_228.aClass80_227 = this.aClass80_227;
			this.aClass80_227.aClass80_228 = this.aClass80_228;
			this.aClass80_227 = null;
			this.aClass80_228 = null;
		}
	}

	@OriginalMember(owner = "client!tn", name = "h", descriptor = "()V")
	public final void method24398() {
		if (this.aClass80_228 != null) {
			this.aClass80_228.aClass80_227 = this.aClass80_227;
			this.aClass80_227.aClass80_228 = this.aClass80_228;
			this.aClass80_227 = null;
			this.aClass80_228 = null;
		}
	}

	@OriginalMember(owner = "client!tn", name = "w", descriptor = "(I)Z")
	public final boolean method24399(@OriginalArg(0) int arg0) {
		return this.aClass80_228 != null;
	}
}
