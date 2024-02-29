package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!apa")
public abstract class Class112_Sub2_Sub1 extends Class112_Sub2 {

	@OriginalMember(owner = "client!apa", name = "e", descriptor = "Lclient!afc;")
	Class104_Sub2 aClass104_Sub2_34;

	@OriginalMember(owner = "client!apa", name = "<init>", descriptor = "(Lclient!afc;)V", line = 9)
	Class112_Sub2_Sub1(@OriginalArg(0) Class104_Sub2 arg0) {
		this.aClass104_Sub2_34 = arg0;
	}

	@OriginalMember(owner = "client!apa", name = "o", descriptor = "()Z", line = 14)
	@Override
	boolean method23743() {
		this.aClass104_Sub2_34.method20943();
		return true;
	}

	@OriginalMember(owner = "client!apa", name = "k", descriptor = "()Z", line = 14)
	@Override
	boolean method23740() {
		this.aClass104_Sub2_34.method20943();
		return true;
	}

	@OriginalMember(owner = "client!apa", name = "v", descriptor = "()Z", line = 14)
	@Override
	boolean method23749() {
		this.aClass104_Sub2_34.method20943();
		return true;
	}

	@OriginalMember(owner = "client!apa", name = "i", descriptor = "(II)V", line = 19)
	@Override
	void method23758(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass104_Sub2_34.method20435((byte) -68) == this) {
			this.aClass104_Sub2_34.method20946();
		}
	}

	@OriginalMember(owner = "client!apa", name = "j", descriptor = "(II)V", line = 19)
	@Override
	void method23757(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass104_Sub2_34.method20435((byte) -72) == this) {
			this.aClass104_Sub2_34.method20946();
		}
	}

	@OriginalMember(owner = "client!apa", name = "t", descriptor = "(II)V", line = 19)
	@Override
	void method23759(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass104_Sub2_34.method20435((byte) -53) == this) {
			this.aClass104_Sub2_34.method20946();
		}
	}
}
