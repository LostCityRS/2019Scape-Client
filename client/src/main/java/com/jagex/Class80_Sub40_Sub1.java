package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!asg")
public final class Class80_Sub40_Sub1 extends Class80_Sub40 {

	@OriginalMember(owner = "client!asg", name = "g", descriptor = "I")
	final int anInt3105;

	@OriginalMember(owner = "client!asg", name = "<init>", descriptor = "(III)V")
	public Class80_Sub40_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg1);
		this.anInt3105 = arg2 * 925242579;
	}

	@OriginalMember(owner = "client!asg", name = "t", descriptor = "(S)Z")
	@Override
	public boolean method23437(@OriginalArg(0) short arg0) {
		@Pc(6) Class120_Sub1_Sub1_Sub1_Sub2 local6 = client.aClass120_Sub1_Sub1_Sub1_Sub2Array1[this.anInt3105 * -1991023781];
		if (local6 == null) {
			return false;
		} else {
			Class117.method8818(Class158.aClass158_57, this.anInt3156 * -151091669, -1, local6, this.anInt3105 * -1991023781, -1269291290);
			return true;
		}
	}

	@OriginalMember(owner = "client!asg", name = "f", descriptor = "()Z")
	@Override
	public boolean method23436() {
		@Pc(6) Class120_Sub1_Sub1_Sub1_Sub2 local6 = client.aClass120_Sub1_Sub1_Sub1_Sub2Array1[this.anInt3105 * -1991023781];
		if (local6 == null) {
			return false;
		} else {
			Class117.method8818(Class158.aClass158_57, this.anInt3156 * -151091669, -1, local6, this.anInt3105 * -1991023781, -379907872);
			return true;
		}
	}

	@OriginalMember(owner = "client!asg", name = "e", descriptor = "()Z")
	@Override
	public boolean method23438() {
		@Pc(6) Class120_Sub1_Sub1_Sub1_Sub2 local6 = client.aClass120_Sub1_Sub1_Sub1_Sub2Array1[this.anInt3105 * -1991023781];
		if (local6 == null) {
			return false;
		} else {
			Class117.method8818(Class158.aClass158_57, this.anInt3156 * -151091669, -1, local6, this.anInt3105 * -1991023781, 1878219754);
			return true;
		}
	}
}
