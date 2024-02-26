package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!arg")
public final class Class80_Sub28_Sub3 extends Class80_Sub28 {

	@OriginalMember(owner = "client!arg", name = "l", descriptor = "J")
	long aLong199;

	@OriginalMember(owner = "client!arg", name = "u", descriptor = "I")
	int anInt3030;

	// $FF: synthetic field
	@OriginalMember(owner = "client!arg", name = "this$0", descriptor = "Lclient!kt;")
	final Class387 aClass387_3;

	@OriginalMember(owner = "client!arg", name = "h", descriptor = "(Lclient!he;Lclient!hx;B)V")
	static void method21844(@OriginalArg(0) Class310 arg0, @OriginalArg(1) Class327 arg1, @OriginalArg(2) byte arg2) {
		if (arg1 == null) {
			return;
		}
		@Pc(76) int local76;
		if (arg1.anInt4094 * 2071556223 == -1) {
			@Pc(111) Class327[] local111 = arg0.method27454(-2119774762);
			for (local76 = 0; local76 < local111.length && arg1 != local111[local76]; local76++) {
			}
			if (local76 >= local111.length) {
				return;
			}
			Class718.method37247(local111, 0, local111, 1, local76);
			local111[0] = arg1;
			return;
		}
		@Pc(17) Class327 local17 = arg0.aClass327Array2[arg1.anInt4082 * 254495303 & 0xFFFF];
		if (local17 == null) {
			return;
		}
		if (local17.aClass327Array3 == local17.aClass327Array4) {
			local17.aClass327Array4 = new Class327[local17.aClass327Array3.length];
			local17.aClass327Array4[0] = arg1;
			Class718.method37247(local17.aClass327Array3, 0, local17.aClass327Array4, 1, arg1.anInt4094 * 2071556223);
			Class718.method37247(local17.aClass327Array3, arg1.anInt4094 * 2071556223 + 1, local17.aClass327Array4, arg1.anInt4094 * 2071556223 + 1, local17.aClass327Array3.length - arg1.anInt4094 * 2071556223 - 1);
			return;
		}
		local76 = 0;
		@Pc(79) Class327[] local79 = local17.aClass327Array4;
		while (local76 < local79.length && local79[local76] != arg1) {
			local76++;
		}
		if (local76 >= local79.length) {
			return;
		}
		Class718.method37247(local79, 0, local79, 1, local76);
		local79[0] = arg1;
	}

	@OriginalMember(owner = "client!arg", name = "<init>", descriptor = "(Lclient!kt;)V")
	Class80_Sub28_Sub3(@OriginalArg(0) Class387 arg0) {
		this.aClass387_3 = arg0;
	}

	@OriginalMember(owner = "client!arg", name = "g", descriptor = "(Lclient!kf;)V")
	@Override
	void method22227(@OriginalArg(0) Class378 arg0) {
		arg0.method28506(this.anInt3030 * -1166122947, this.aLong199 * 4166105500428824433L);
	}

	@OriginalMember(owner = "client!arg", name = "f", descriptor = "(Lclient!kf;I)V")
	@Override
	void method22222(@OriginalArg(0) Class378 arg0, @OriginalArg(1) int arg1) {
		arg0.method28506(this.anInt3030 * -1166122947, this.aLong199 * 4166105500428824433L);
	}

	@OriginalMember(owner = "client!arg", name = "e", descriptor = "(Lclient!ald;)V")
	@Override
	void method22225(@OriginalArg(0) Packet arg0) {
		this.anInt3030 = arg0.g4() * 857290517;
		this.aLong199 = arg0.g8() * 2776253536914403729L;
	}

	@OriginalMember(owner = "client!arg", name = "u", descriptor = "(Lclient!ald;)V")
	@Override
	void method22226(@OriginalArg(0) Packet arg0) {
		this.anInt3030 = arg0.g4() * 857290517;
		this.aLong199 = arg0.g8() * 2776253536914403729L;
	}

	@OriginalMember(owner = "client!arg", name = "l", descriptor = "(Lclient!ald;)V")
	@Override
	void method22224(@OriginalArg(0) Packet arg0) {
		this.anInt3030 = arg0.g4() * 857290517;
		this.aLong199 = arg0.g8() * 2776253536914403729L;
	}

	@OriginalMember(owner = "client!arg", name = "t", descriptor = "(Lclient!ald;B)V")
	@Override
	void method22223(@OriginalArg(0) Packet arg0, @OriginalArg(1) byte arg1) {
		this.anInt3030 = arg0.g4() * 857290517;
		this.aLong199 = arg0.g8() * 2776253536914403729L;
	}
}
