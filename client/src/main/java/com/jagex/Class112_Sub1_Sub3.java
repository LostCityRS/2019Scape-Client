package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!apz")
public abstract class Class112_Sub1_Sub3 extends Class112_Sub1 {

	@OriginalMember(owner = "client!apz", name = "n", descriptor = "Lclient!afc;")
	Class104_Sub2 aClass104_Sub2_33;

	@OriginalMember(owner = "client!apz", name = "<init>", descriptor = "(Lclient!afc;)V", line = 9)
	Class112_Sub1_Sub3(@OriginalArg(0) Class104_Sub2 arg0) {
		this.aClass104_Sub2_33 = arg0;
	}

	@OriginalMember(owner = "client!apz", name = "o", descriptor = "()Z", line = 14)
	@Override
	boolean method23743() {
		this.aClass104_Sub2_33.method20943();
		return true;
	}

	@OriginalMember(owner = "client!apz", name = "k", descriptor = "()Z", line = 14)
	@Override
	boolean method23740() {
		this.aClass104_Sub2_33.method20943();
		return true;
	}

	@OriginalMember(owner = "client!apz", name = "v", descriptor = "()Z", line = 14)
	@Override
	boolean method23749() {
		this.aClass104_Sub2_33.method20943();
		return true;
	}

	@OriginalMember(owner = "client!apz", name = "ai", descriptor = "()V", line = 19)
	void method23445() {
		if (this.aClass104_Sub2_33.method20435((byte) -68) == this) {
			this.aClass104_Sub2_33.method20946();
		}
	}

	@OriginalMember(owner = "client!apz", name = "ac", descriptor = "()V", line = 19)
	void method23446() {
		if (this.aClass104_Sub2_33.method20435((byte) -96) == this) {
			this.aClass104_Sub2_33.method20946();
		}
	}

	@OriginalMember(owner = "client!apz", name = "aw", descriptor = "()V", line = 19)
	void method23447() {
		if (this.aClass104_Sub2_33.method20435((byte) -44) == this) {
			this.aClass104_Sub2_33.method20946();
		}
	}
}
