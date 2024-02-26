package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!apj")
public abstract class Class108_Sub2_Sub1 extends Class108_Sub2 {

	@OriginalMember(owner = "client!apj", name = "t", descriptor = "Lclient!afa;")
	Class102_Sub1 aClass102_Sub1_34;

	@OriginalMember(owner = "client!apj", name = "<init>", descriptor = "(Lclient!afa;)V")
	Class108_Sub2_Sub1(@OriginalArg(0) Class102_Sub1 arg0) {
		this.aClass102_Sub1_34 = arg0;
	}

	@OriginalMember(owner = "client!apj", name = "u", descriptor = "()Z")
	@Override
	boolean method24039() {
		this.aClass102_Sub1_34.method21159();
		return true;
	}

	@OriginalMember(owner = "client!apj", name = "z", descriptor = "(II)V")
	@Override
	void method24055(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass102_Sub1_34.method20677(1393013083) == this) {
			this.aClass102_Sub1_34.method21461();
		}
	}

	@OriginalMember(owner = "client!apj", name = "j", descriptor = "()Z")
	@Override
	boolean method24045() {
		this.aClass102_Sub1_34.method21159();
		return true;
	}

	@OriginalMember(owner = "client!apj", name = "a", descriptor = "()Z")
	@Override
	boolean method24040() {
		this.aClass102_Sub1_34.method21159();
		return true;
	}

	@OriginalMember(owner = "client!apj", name = "d", descriptor = "(II)V")
	@Override
	void method24052(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass102_Sub1_34.method20677(2121246821) == this) {
			this.aClass102_Sub1_34.method21461();
		}
	}
}
