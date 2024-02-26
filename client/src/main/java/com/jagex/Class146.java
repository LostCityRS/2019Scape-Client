package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sr")
public abstract class Class146 {

	@OriginalMember(owner = "client!sr", name = "q", descriptor = "()Lclient!sr;")
	public static Class146 method13868() {
		try {
			return new Class146_Sub2();
		} catch (@Pc(4) Throwable local4) {
			return new Class146_Sub1();
		}
	}

	@OriginalMember(owner = "client!sr", name = "ic", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;I)V")
	static void method13873(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) int arg3) {
		arg0.anInt4158 = arg2.anIntArray525[(arg2.anInt5778 -= 2036747717) * 1896589581] * -1634403891;
	}

	@OriginalMember(owner = "client!sr", name = "dz", descriptor = "(I)Lclient!asb;")
	public static Class80_Sub1_Sub12 method13874(@OriginalArg(0) int arg0) {
		return Class159_Sub1.aClass80_Sub1_Sub12_3;
	}

	@OriginalMember(owner = "client!sr", name = "v", descriptor = "(II)V")
	public static void method13875(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class80_Sub1_Sub9 local4 = Class22.method545(12, (long) arg0);
		local4.method22078(-370438913);
	}

	@OriginalMember(owner = "client!sr", name = "<init>", descriptor = "()V")
	Class146() {
	}

	@OriginalMember(owner = "client!sr", name = "r", descriptor = "()J")
	abstract long method13853();

	@OriginalMember(owner = "client!sr", name = "f", descriptor = "(J)I")
	final int method13854(@OriginalArg(0) long arg0) {
		@Pc(3) long local3 = this.method13857((byte) -54);
		if (local3 > 0L) {
			Class217.method25866(local3);
		}
		return this.method13859(arg0);
	}

	@OriginalMember(owner = "client!sr", name = "e", descriptor = "(B)V")
	abstract void method13855(@OriginalArg(0) byte arg0);

	@OriginalMember(owner = "client!sr", name = "j", descriptor = "()J")
	abstract long method13856();

	@OriginalMember(owner = "client!sr", name = "u", descriptor = "(B)J")
	abstract long method13857(@OriginalArg(0) byte arg0);

	@OriginalMember(owner = "client!sr", name = "g", descriptor = "(B)J")
	abstract long method13858(@OriginalArg(0) byte arg0);

	@OriginalMember(owner = "client!sr", name = "l", descriptor = "(J)I")
	abstract int method13859(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!sr", name = "m", descriptor = "()V")
	abstract void method13860();

	@OriginalMember(owner = "client!sr", name = "o", descriptor = "()J")
	abstract long method13861();

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "()J")
	abstract long method13862();

	@OriginalMember(owner = "client!sr", name = "s", descriptor = "()J")
	abstract long method13863();

	@OriginalMember(owner = "client!sr", name = "k", descriptor = "(J)I")
	abstract int method13864(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!sr", name = "x", descriptor = "(J)I")
	abstract int method13865(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!sr", name = "w", descriptor = "()J")
	abstract long method13866();

	@OriginalMember(owner = "client!sr", name = "d", descriptor = "(J)I")
	final int method13867(@OriginalArg(0) long arg0) {
		@Pc(3) long local3 = this.method13857((byte) 4);
		if (local3 > 0L) {
			Class217.method25866(local3);
		}
		return this.method13859(arg0);
	}

	@OriginalMember(owner = "client!sr", name = "h", descriptor = "(J)I")
	final int method13869(@OriginalArg(0) long arg0) {
		@Pc(3) long local3 = this.method13857((byte) 41);
		if (local3 > 0L) {
			Class217.method25866(local3);
		}
		return this.method13859(arg0);
	}

	@OriginalMember(owner = "client!sr", name = "i", descriptor = "()V")
	abstract void method13870();

	@OriginalMember(owner = "client!sr", name = "z", descriptor = "(J)I")
	final int method13871(@OriginalArg(0) long arg0) {
		@Pc(3) long local3 = this.method13857((byte) -29);
		if (local3 > 0L) {
			Class217.method25866(local3);
		}
		return this.method13859(arg0);
	}

	@OriginalMember(owner = "client!sr", name = "p", descriptor = "(J)I")
	final int method13872(@OriginalArg(0) long arg0) {
		@Pc(3) long local3 = this.method13857((byte) 7);
		if (local3 > 0L) {
			Class217.method25866(local3);
		}
		return this.method13859(arg0);
	}
}
