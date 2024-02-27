package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!apa")
public abstract class Class112_Sub2_Sub1 extends Class112_Sub2 {

	@OriginalMember(owner = "client!apa", name = "e", descriptor = "Lclient!afc;")
	Class104_Sub2 aClass104_Sub2_34;

	@OriginalMember(owner = "client!apa", name = "<init>", descriptor = "(Lclient!afc;)V")
	Class112_Sub2_Sub1(@OriginalArg(0) Class104_Sub2 arg0) {
		this.aClass104_Sub2_34 = arg0;
	}

	@OriginalMember(owner = "client!apa", name = "o", descriptor = "()Z")
	@Override
	boolean method23754() {
		this.aClass104_Sub2_34.method20929();
		return true;
	}

	@OriginalMember(owner = "client!apa", name = "k", descriptor = "()Z")
	@Override
	boolean method23751() {
		this.aClass104_Sub2_34.method20929();
		return true;
	}

	@OriginalMember(owner = "client!apa", name = "i", descriptor = "(II)V")
	@Override
	void method23769(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass104_Sub2_34.method20446((byte) -68) == this) {
			this.aClass104_Sub2_34.method20922();
		}
	}

	@OriginalMember(owner = "client!apa", name = "v", descriptor = "()Z")
	@Override
	boolean method23760() {
		this.aClass104_Sub2_34.method20929();
		return true;
	}

	@OriginalMember(owner = "client!apa", name = "j", descriptor = "(II)V")
	@Override
	void method23768(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass104_Sub2_34.method20446((byte) -72) == this) {
			this.aClass104_Sub2_34.method20922();
		}
	}

	@OriginalMember(owner = "client!apa", name = "t", descriptor = "(II)V")
	@Override
	void method23770(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass104_Sub2_34.method20446((byte) -53) == this) {
			this.aClass104_Sub2_34.method20922();
		}
	}
}
