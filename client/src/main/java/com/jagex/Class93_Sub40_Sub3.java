package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!asu")
public final class Class93_Sub40_Sub3 extends Class93_Sub40 {

	@OriginalMember(owner = "client!asu", name = "w", descriptor = "I")
	final int anInt3160;

	@OriginalMember(owner = "client!asu", name = "<init>", descriptor = "(III)V")
	public Class93_Sub40_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg1);
		this.anInt3160 = arg2 * 1703004405;
	}

	@OriginalMember(owner = "client!asu", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method23205(@OriginalArg(0) byte arg0) {
		@Pc(6) Class132_Sub1_Sub1_Sub1_Sub2 local6 = client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[this.anInt3160 * -779181219];
		if (local6 == null) {
			return false;
		} else {
			Class305.method26895(Class155.aClass155_64, this.anInt3172 * 1220811495, -1, local6, this.anInt3160 * -779181219, 936458645);
			return true;
		}
	}

	@OriginalMember(owner = "client!asu", name = "n", descriptor = "()Z")
	@Override
	public boolean method23204() {
		@Pc(6) Class132_Sub1_Sub1_Sub1_Sub2 local6 = client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[this.anInt3160 * -779181219];
		if (local6 == null) {
			return false;
		} else {
			Class305.method26895(Class155.aClass155_64, this.anInt3172 * 1220811495, -1, local6, this.anInt3160 * -779181219, 359177384);
			return true;
		}
	}

	@OriginalMember(owner = "client!asu", name = "m", descriptor = "()Z")
	@Override
	public boolean method23206() {
		@Pc(6) Class132_Sub1_Sub1_Sub1_Sub2 local6 = client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[this.anInt3160 * -779181219];
		if (local6 == null) {
			return false;
		} else {
			Class305.method26895(Class155.aClass155_64, this.anInt3172 * 1220811495, -1, local6, this.anInt3160 * -779181219, 1771021005);
			return true;
		}
	}

	@OriginalMember(owner = "client!asu", name = "k", descriptor = "()Z")
	@Override
	public boolean method23207() {
		@Pc(6) Class132_Sub1_Sub1_Sub1_Sub2 local6 = client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[this.anInt3160 * -779181219];
		if (local6 == null) {
			return false;
		} else {
			Class305.method26895(Class155.aClass155_64, this.anInt3172 * 1220811495, -1, local6, this.anInt3160 * -779181219, 1253440145);
			return true;
		}
	}
}