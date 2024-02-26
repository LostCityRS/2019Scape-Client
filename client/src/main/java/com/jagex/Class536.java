package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rr")
public final class Class536 {

	@OriginalMember(owner = "client!rr", name = "t", descriptor = "Lclient!rr;")
	public static final Class536 aClass536_8 = new Class536(false, false);

	@OriginalMember(owner = "client!rr", name = "f", descriptor = "Lclient!rr;")
	public static final Class536 aClass536_2 = new Class536(true, false);

	@OriginalMember(owner = "client!rr", name = "e", descriptor = "Lclient!rr;")
	public static final Class536 aClass536_7 = new Class536(false, false);

	@OriginalMember(owner = "client!rr", name = "u", descriptor = "Lclient!rr;")
	public static final Class536 aClass536_3 = new Class536(true, false);

	@OriginalMember(owner = "client!rr", name = "l", descriptor = "Lclient!rr;")
	static final Class536 aClass536_4 = new Class536(true, false);

	@OriginalMember(owner = "client!rr", name = "g", descriptor = "Lclient!rr;")
	static final Class536 aClass536_5 = new Class536(true, true);

	@OriginalMember(owner = "client!rr", name = "i", descriptor = "Lclient!rr;")
	static final Class536 aClass536_1 = new Class536(true, true);

	@OriginalMember(owner = "client!rr", name = "m", descriptor = "Lclient!rr;")
	public static final Class536 aClass536_6 = new Class536(false, false);

	@OriginalMember(owner = "client!rr", name = "o", descriptor = "Z")
	boolean aBoolean892;

	@OriginalMember(owner = "client!rr", name = "j", descriptor = "Z")
	boolean aBoolean891;

	@OriginalMember(owner = "client!rr", name = "u", descriptor = "(I)V")
	static void method30873(@OriginalArg(0) int arg0) {
		Class238.aLong356 = 959485551111415569L;
		Class238.aLong358 = 0L;
		Class238.anInt3815 = 304387549;
	}

	@OriginalMember(owner = "client!rr", name = "wz", descriptor = "(Lclient!yp;I)V")
	static void method30874(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		Class490.aClass263_13.method26594(local13, local23, -1583611537);
	}

	@OriginalMember(owner = "client!rr", name = "j", descriptor = "(Ljava/lang/CharSequence;I)I")
	public static int method30875(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) int arg1) {
		@Pc(2) int local2 = arg0.length();
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < local2; local6++) {
			local4 = (local4 << 5) - local4 + Class308.method27442(arg0.charAt(local6), (byte) -28);
		}
		return local4;
	}

	@OriginalMember(owner = "client!rr", name = "att", descriptor = "(Lclient!yp;I)V")
	static void method30876(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= 2036747717;
	}

	@OriginalMember(owner = "client!rr", name = "aco", descriptor = "(Lclient!yp;I)V")
	static void method30877(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		if (Class453.aClass378_2 == null) {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
		} else {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 1;
			arg0.aClass378_3 = Class453.aClass378_2;
			arg0.aMap23.put(Class143.aClass143_63, Class699.method37067(arg0.aClass378_3, 1586106686));
		}
	}

	@OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(ZZ)V")
	Class536(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean892 = arg0;
		this.aBoolean891 = arg1;
	}

	@OriginalMember(owner = "client!rr", name = "l", descriptor = "()Z")
	public boolean method30867() {
		return this.aBoolean891;
	}

	@OriginalMember(owner = "client!rr", name = "e", descriptor = "()Z")
	boolean method30868() {
		return this.aBoolean892;
	}

	@OriginalMember(owner = "client!rr", name = "f", descriptor = "(I)Z")
	public boolean method30869(@OriginalArg(0) int arg0) {
		return this.aBoolean891;
	}

	@OriginalMember(owner = "client!rr", name = "u", descriptor = "()Z")
	public boolean method30870() {
		return this.aBoolean891;
	}

	@OriginalMember(owner = "client!rr", name = "t", descriptor = "(B)Z")
	boolean method30871(@OriginalArg(0) byte arg0) {
		return this.aBoolean892;
	}

	@OriginalMember(owner = "client!rr", name = "g", descriptor = "()Z")
	public boolean method30872() {
		return this.aBoolean891;
	}
}
