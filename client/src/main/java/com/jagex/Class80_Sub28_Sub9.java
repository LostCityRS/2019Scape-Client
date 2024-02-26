package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aro")
public final class Class80_Sub28_Sub9 extends Class80_Sub28 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!aro", name = "this$0", descriptor = "Lclient!kt;")
	final Class387 aClass387_9;

	@OriginalMember(owner = "client!aro", name = "u", descriptor = "I")
	int anInt3040;

	@OriginalMember(owner = "client!aro", name = "aum", descriptor = "(Lclient!yp;B)V")
	static void method21997(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class703.aClass80_Sub37_49.aClass165_Sub47_1.method16965((short) 14759) == 1 ? 1 : 0;
	}

	@OriginalMember(owner = "client!aro", name = "<init>", descriptor = "(Lclient!kt;)V")
	Class80_Sub28_Sub9(@OriginalArg(0) Class387 arg0) {
		this.aClass387_9 = arg0;
		this.anInt3040 = 2142529843;
	}

	@OriginalMember(owner = "client!aro", name = "t", descriptor = "(Lclient!ald;B)V")
	@Override
	void method22223(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) byte arg1) {
		this.anInt3040 = arg0.method23178((byte) -68) * -2142529843;
	}

	@OriginalMember(owner = "client!aro", name = "f", descriptor = "(Lclient!kf;I)V")
	@Override
	void method22222(@OriginalArg(0) Class378 arg0, @OriginalArg(1) int arg1) {
		arg0.method28490(this.anInt3040 * 1550992901, -104244849);
	}

	@OriginalMember(owner = "client!aro", name = "e", descriptor = "(Lclient!ald;)V")
	@Override
	void method22225(@OriginalArg(0) Class80_Sub36 arg0) {
		this.anInt3040 = arg0.method23178((byte) -99) * -2142529843;
	}

	@OriginalMember(owner = "client!aro", name = "u", descriptor = "(Lclient!ald;)V")
	@Override
	void method22226(@OriginalArg(0) Class80_Sub36 arg0) {
		this.anInt3040 = arg0.method23178((byte) -73) * -2142529843;
	}

	@OriginalMember(owner = "client!aro", name = "l", descriptor = "(Lclient!ald;)V")
	@Override
	void method22224(@OriginalArg(0) Class80_Sub36 arg0) {
		this.anInt3040 = arg0.method23178((byte) -123) * -2142529843;
	}

	@OriginalMember(owner = "client!aro", name = "g", descriptor = "(Lclient!kf;)V")
	@Override
	void method22227(@OriginalArg(0) Class378 arg0) {
		arg0.method28490(this.anInt3040 * 1550992901, -104244849);
	}
}
