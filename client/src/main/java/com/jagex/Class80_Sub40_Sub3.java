package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ast")
public final class Class80_Sub40_Sub3 extends Class80_Sub40 {

	@OriginalMember(owner = "client!ast", name = "g", descriptor = "Lclient!yz;")
	final Class698 aClass698_1;

	@OriginalMember(owner = "client!ast", name = "<init>", descriptor = "(IILclient!yz;)V")
	public Class80_Sub40_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class698 arg2) {
		super(arg0, arg1);
		this.aClass698_1 = arg2;
	}

	@OriginalMember(owner = "client!ast", name = "t", descriptor = "(S)Z")
	@Override
	public boolean method23437(@OriginalArg(0) short arg0) {
		@Pc(4) Class120_Sub1_Sub5_Sub1 local4 = this.aClass698_1.method37060((byte) -32);
		if (local4 == null) {
			return false;
		} else {
			Class512.method30559(Class158.aClass158_64, this.anInt3156 * -151091669, -1, this.aClass698_1, local4, (byte) -106);
			return true;
		}
	}

	@OriginalMember(owner = "client!ast", name = "f", descriptor = "()Z")
	@Override
	public boolean method23436() {
		@Pc(4) Class120_Sub1_Sub5_Sub1 local4 = this.aClass698_1.method37060((byte) 48);
		if (local4 == null) {
			return false;
		} else {
			Class512.method30559(Class158.aClass158_64, this.anInt3156 * -151091669, -1, this.aClass698_1, local4, (byte) -49);
			return true;
		}
	}

	@OriginalMember(owner = "client!ast", name = "e", descriptor = "()Z")
	@Override
	public boolean method23438() {
		@Pc(4) Class120_Sub1_Sub5_Sub1 local4 = this.aClass698_1.method37060((byte) -101);
		if (local4 == null) {
			return false;
		} else {
			Class512.method30559(Class158.aClass158_64, this.anInt3156 * -151091669, -1, this.aClass698_1, local4, (byte) -101);
			return true;
		}
	}
}
