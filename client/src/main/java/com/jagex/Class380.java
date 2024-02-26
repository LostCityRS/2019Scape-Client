package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kh")
public final class Class380 implements Interface32 {

	@OriginalMember(owner = "client!kh", name = "dn", descriptor = "Lclient!no;")
	public static Class444 aClass444_1;

	@OriginalMember(owner = "client!kh", name = "fa", descriptor = "Lclient!pf;")
	public static Class480 aClass480_105;

	@OriginalMember(owner = "client!kh", name = "t", descriptor = "Lclient!ka;")
	final Class373 aClass373_1;

	@OriginalMember(owner = "client!kh", name = "ay", descriptor = "(B)Z")
	public static boolean method28557(@OriginalArg(0) byte arg0) {
		return Class669.aTwitchTV1 != null && Class669.aTwitchTV1.IsStreaming();
	}

	@OriginalMember(owner = "client!kh", name = "asx", descriptor = "(Lclient!yp;B)V")
	static void method28558(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		if (local12 < 0 || local12 > 1) {
			local12 = 0;
		}
		Class411.method28966(local12 == 1, 933616822);
	}

	@OriginalMember(owner = "client!kh", name = "pz", descriptor = "(Lclient!yp;B)V")
	static void method28559(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2054792003);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class264.method26644(local16, local22, arg0, 388818002);
	}

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(Lclient!ka;)V")
	Class380(@OriginalArg(0) Class373 arg0) {
		this.aClass373_1 = arg0;
	}

	@OriginalMember(owner = "client!kh", name = "j", descriptor = "()Z")
	@Override
	public boolean method28665() {
		return true;
	}

	@OriginalMember(owner = "client!kh", name = "f", descriptor = "(ZB)V")
	@Override
	public void method28662(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte arg1) {
		if (arg0) {
			Class279.aClass102_9.method20722(0, 0, Class80_Sub1_Sub1.anInt254 * -255202897, Class80_Sub25.anInt1627 * 167687103, this.aClass373_1.anInt4507 * -299109567, 0);
		}
	}

	@OriginalMember(owner = "client!kh", name = "t", descriptor = "(I)V")
	@Override
	public void method28658(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!kh", name = "u", descriptor = "(Z)V")
	@Override
	public void method28656(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Class279.aClass102_9.method20722(0, 0, Class80_Sub1_Sub1.anInt254 * -255202897, Class80_Sub25.anInt1627 * 167687103, this.aClass373_1.anInt4507 * -299109567, 0);
		}
	}

	@OriginalMember(owner = "client!kh", name = "l", descriptor = "(Z)V")
	@Override
	public void method28660(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Class279.aClass102_9.method20722(0, 0, Class80_Sub1_Sub1.anInt254 * -255202897, Class80_Sub25.anInt1627 * 167687103, this.aClass373_1.anInt4507 * -299109567, 0);
		}
	}

	@OriginalMember(owner = "client!kh", name = "g", descriptor = "(Z)V")
	@Override
	public void method28659(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Class279.aClass102_9.method20722(0, 0, Class80_Sub1_Sub1.anInt254 * -255202897, Class80_Sub25.anInt1627 * 167687103, this.aClass373_1.anInt4507 * -299109567, 0);
		}
	}

	@OriginalMember(owner = "client!kh", name = "i", descriptor = "()V")
	@Override
	public void method28661() {
	}

	@OriginalMember(owner = "client!kh", name = "m", descriptor = "()V")
	@Override
	public void method28663() {
	}

	@OriginalMember(owner = "client!kh", name = "o", descriptor = "()Z")
	@Override
	public boolean method28664() {
		return true;
	}

	@OriginalMember(owner = "client!kh", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method28657(@OriginalArg(0) int arg0) {
		return true;
	}
}
