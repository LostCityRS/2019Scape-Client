package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ir")
public final class Class346 {

	@OriginalMember(owner = "client!ir", name = "w", descriptor = "I")
	public static int anInt4250;

	@OriginalMember(owner = "client!ir", name = "ra", descriptor = "I")
	static int anInt4251;

	@OriginalMember(owner = "client!ir", name = "t", descriptor = "Lclient!aax;")
	Class24 aClass24_31;

	@OriginalMember(owner = "client!ir", name = "f", descriptor = "[Lclient!akc;")
	Class80_Sub13[] aClass80_Sub13Array1;

	@OriginalMember(owner = "client!ir", name = "e", descriptor = "Lclient!ip;")
	final Interface28 anInterface28_4;

	@OriginalMember(owner = "client!ir", name = "ac", descriptor = "(I)V")
	public static void method27971(@OriginalArg(0) int arg0) {
		Class407.anImage4 = null;
		Class540.aFont2 = null;
	}

	@OriginalMember(owner = "client!ir", name = "ahc", descriptor = "(Lclient!yp;I)V")
	static void method27972(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(18) Class43 local18 = (Class43) Class25.aClass41_Sub9_1.method18054(local12, -131056301);
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local18.aBoolean25 ? 1 : 0;
	}

	@OriginalMember(owner = "client!ir", name = "o", descriptor = "(IIIIIII)J")
	public static long method27973(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		Class62.aCalendar2.clear();
		Class62.aCalendar2.set(arg5, arg4, arg3, arg2, arg1, arg0);
		return Class62.aCalendar2.getTime().getTime();
	}

	@OriginalMember(owner = "client!ir", name = "acu", descriptor = "(Lclient!yp;I)V")
	static void method27974(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= 1815275855;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		@Pc(33) int local33 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 2];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = arg0.aClass378_3.method28481(local13, local23, local33, 1068989470);
	}

	@OriginalMember(owner = "client!ir", name = "<init>", descriptor = "(ILclient!ip;)V")
	public Class346(@OriginalArg(0) int arg0, @OriginalArg(1) Interface28 arg1) {
		@Pc(3) int local3;
		for (local3 = 1; local3 < arg0; local3 += local3) {
		}
		this.aClass24_31 = new Class24(local3);
		this.aClass80_Sub13Array1 = new Class80_Sub13[local3];
		this.anInterface28_4 = arg1;
	}

	@OriginalMember(owner = "client!ir", name = "i", descriptor = "(I)Lclient!akc;")
	public Class80_Sub13 method27961(@OriginalArg(0) int arg0) {
		return arg0 >= this.aClass80_Sub13Array1.length ? null : this.aClass80_Sub13Array1[arg0];
	}

	@OriginalMember(owner = "client!ir", name = "t", descriptor = "(II)Lclient!akc;")
	public Class80_Sub13 method27962(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 >= this.aClass80_Sub13Array1.length ? null : this.aClass80_Sub13Array1[arg0];
	}

	@OriginalMember(owner = "client!ir", name = "e", descriptor = "(II)V")
	void method27963(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class80_Sub13 local4 = this.method27962(arg0, 1352971689);
		if (local4 != null) {
			local4.method24395((byte) 119);
			this.aClass80_Sub13Array1[local4.anInt3258 * -1058520599] = null;
		}
	}

	@OriginalMember(owner = "client!ir", name = "u", descriptor = "(ILjava/lang/String;Lclient!akc;I)V")
	public void method27964(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class80_Sub13 arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class80_Sub13 local4 = this.method27965(arg1, 1216441218);
		if (local4 != null && local4.anInt3258 * -1058520599 != arg0) {
			throw new IllegalArgumentException(arg1);
		}
		this.method27963(arg0, 1173177337);
		if (arg0 >= this.aClass80_Sub13Array1.length) {
			@Pc(30) int local30;
			for (local30 = this.aClass80_Sub13Array1.length; local30 <= arg0; local30 += local30) {
			}
			this.aClass24_31 = new Class24(local30);
			for (@Pc(46) int local46 = 0; local46 < this.aClass80_Sub13Array1.length; local46++) {
				@Pc(56) Class80_Sub13 local56 = this.aClass80_Sub13Array1[local46];
				if (local56 != null) {
					this.aClass24_31.method563(local56, local56.aLong338 * 3209506792906532031L);
				}
			}
			@Pc(72) Class80_Sub13[] local72 = new Class80_Sub13[local30];
			for (@Pc(74) int local74 = 0; local74 < this.aClass80_Sub13Array1.length; local74++) {
				local72[local74] = this.aClass80_Sub13Array1[local74];
			}
			this.aClass80_Sub13Array1 = local72;
		}
		arg2.anInt3258 = arg0 * -102455719;
		arg2.aString120 = arg1;
		this.aClass24_31.method563(arg2, this.anInterface28_4.method27718(arg1, -910993270));
		this.aClass80_Sub13Array1[arg0] = arg2;
	}

	@OriginalMember(owner = "client!ir", name = "f", descriptor = "(Ljava/lang/String;I)Lclient!akc;")
	public Class80_Sub13 method27965(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(5) long local5 = this.anInterface28_4.method27718(arg0, -910993270);
		for (@Pc(11) Class80_Sub13 local11 = (Class80_Sub13) this.aClass24_31.method560(local5); local11 != null; local11 = (Class80_Sub13) this.aClass24_31.method558((byte) 0)) {
			if (local11.aString120.equals(arg0)) {
				return local11;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ir", name = "g", descriptor = "(I)Lclient!akc;")
	public Class80_Sub13 method27966(@OriginalArg(0) int arg0) {
		return arg0 >= this.aClass80_Sub13Array1.length ? null : this.aClass80_Sub13Array1[arg0];
	}

	@OriginalMember(owner = "client!ir", name = "l", descriptor = "(I)Lclient!akc;")
	public Class80_Sub13 method27967(@OriginalArg(0) int arg0) {
		return arg0 >= this.aClass80_Sub13Array1.length ? null : this.aClass80_Sub13Array1[arg0];
	}

	@OriginalMember(owner = "client!ir", name = "m", descriptor = "(I)V")
	void method27968(@OriginalArg(0) int arg0) {
		@Pc(4) Class80_Sub13 local4 = this.method27962(arg0, 1352971689);
		if (local4 != null) {
			local4.method24395((byte) 107);
			this.aClass80_Sub13Array1[local4.anInt3258 * -1058520599] = null;
		}
	}

	@OriginalMember(owner = "client!ir", name = "o", descriptor = "(I)V")
	void method27969(@OriginalArg(0) int arg0) {
		@Pc(4) Class80_Sub13 local4 = this.method27962(arg0, 1352971689);
		if (local4 != null) {
			local4.method24395((byte) 115);
			this.aClass80_Sub13Array1[local4.anInt3258 * -1058520599] = null;
		}
	}

	@OriginalMember(owner = "client!ir", name = "j", descriptor = "(ILjava/lang/String;Lclient!akc;)V")
	public void method27970(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class80_Sub13 arg2) {
		@Pc(4) Class80_Sub13 local4 = this.method27965(arg1, 1216441218);
		if (local4 != null && local4.anInt3258 * -1058520599 != arg0) {
			throw new IllegalArgumentException(arg1);
		}
		this.method27963(arg0, 1756221173);
		if (arg0 >= this.aClass80_Sub13Array1.length) {
			@Pc(30) int local30;
			for (local30 = this.aClass80_Sub13Array1.length; local30 <= arg0; local30 += local30) {
			}
			this.aClass24_31 = new Class24(local30);
			for (@Pc(46) int local46 = 0; local46 < this.aClass80_Sub13Array1.length; local46++) {
				@Pc(56) Class80_Sub13 local56 = this.aClass80_Sub13Array1[local46];
				if (local56 != null) {
					this.aClass24_31.method563(local56, local56.aLong338 * 3209506792906532031L);
				}
			}
			@Pc(72) Class80_Sub13[] local72 = new Class80_Sub13[local30];
			for (@Pc(74) int local74 = 0; local74 < this.aClass80_Sub13Array1.length; local74++) {
				local72[local74] = this.aClass80_Sub13Array1[local74];
			}
			this.aClass80_Sub13Array1 = local72;
		}
		arg2.anInt3258 = arg0 * -102455719;
		arg2.aString120 = arg1;
		this.aClass24_31.method563(arg2, this.anInterface28_4.method27718(arg1, -910993270));
		this.aClass80_Sub13Array1[arg0] = arg2;
	}
}
