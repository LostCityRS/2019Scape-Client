package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!anw")
public final class Class165_Sub45 extends Class165 {

	@OriginalMember(owner = "client!anw", name = "i", descriptor = "I")
	static final int anInt2385 = 400;

	@OriginalMember(owner = "client!anw", name = "g", descriptor = "I")
	static final int anInt2386 = 100;

	@OriginalMember(owner = "client!anw", name = "m", descriptor = "I")
	static final int anInt2387 = 33;

	@OriginalMember(owner = "client!anw", name = "ov", descriptor = "I")
	public static int anInt2388;

	@OriginalMember(owner = "client!anw", name = "ka", descriptor = "(Lclient!he;Lclient!hx;I)Lclient!hx;")
	public static Class327 method16896(@OriginalArg(0) Class310 arg0, @OriginalArg(1) Class327 arg1, @OriginalArg(2) int arg2) {
		if (arg1.anInt4082 * 254495303 != -1) {
			return arg0.method27456(arg1.anInt4082 * 254495303, 2036747717);
		}
		if (!arg0.aBoolean794) {
			@Pc(23) int local23 = arg1.anInt4087 * -2053489901 >>> 16;
			@Pc(28) Class17 local28 = new Class17(client.aClass24_20);
			for (@Pc(33) Class80_Sub40 local33 = (Class80_Sub40) local28.method427(1192344541); local33 != null; local33 = (Class80_Sub40) local28.next()) {
				if (local33.anInt3156 * -151091669 == local23) {
					return Class301.method27041((int) (local33.aLong338 * 3209506792906532031L), 2036190932);
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!anw", name = "<init>", descriptor = "(ILclient!ale;)V")
	public Class165_Sub45(@OriginalArg(0) int arg0, @OriginalArg(1) Class80_Sub37 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!anw", name = "<init>", descriptor = "(Lclient!ale;)V")
	public Class165_Sub45(@OriginalArg(0) Class80_Sub37 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!anw", name = "s", descriptor = "(I)I")
	public int method16892(@OriginalArg(0) int arg0) {
		return this.anInt2398 * -229615671;
	}

	@OriginalMember(owner = "client!anw", name = "u", descriptor = "(II)V")
	@Override
	void method16952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2398 = arg0 * 251097721;
	}

	@OriginalMember(owner = "client!anw", name = "a", descriptor = "(I)V")
	public void method16893(@OriginalArg(0) int arg0) {
		if (this.anInt2398 * -229615671 < 33 || this.anInt2398 * -229615671 > 400) {
			this.anInt2398 = this.method16949((byte) 109) * 251097721;
		}
	}

	@OriginalMember(owner = "client!anw", name = "f", descriptor = "(IB)I")
	@Override
	int method16950(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return 3;
	}

	@OriginalMember(owner = "client!anw", name = "g", descriptor = "()I")
	@Override
	int method16948() {
		return 100;
	}

	@OriginalMember(owner = "client!anw", name = "l", descriptor = "()I")
	@Override
	int method16953() {
		return 100;
	}

	@OriginalMember(owner = "client!anw", name = "m", descriptor = "(I)V")
	@Override
	void method16955(@OriginalArg(0) int arg0) {
		this.anInt2398 = arg0 * 251097721;
	}

	@OriginalMember(owner = "client!anw", name = "i", descriptor = "(I)I")
	@Override
	int method16954(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!anw", name = "t", descriptor = "(B)I")
	@Override
	int method16949(@OriginalArg(0) byte arg0) {
		return 100;
	}

	@OriginalMember(owner = "client!anw", name = "k", descriptor = "()V")
	public void method16894() {
		if (this.anInt2398 * -229615671 < 33 || this.anInt2398 * -229615671 > 400) {
			this.anInt2398 = this.method16949((byte) 55) * 251097721;
		}
	}

	@OriginalMember(owner = "client!anw", name = "x", descriptor = "()V")
	public void method16895() {
		if (this.anInt2398 * -229615671 < 33 || this.anInt2398 * -229615671 > 400) {
			this.anInt2398 = this.method16949((byte) 108) * 251097721;
		}
	}
}
