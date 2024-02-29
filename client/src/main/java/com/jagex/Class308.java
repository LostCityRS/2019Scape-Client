package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class Class308 {

	@OriginalMember(owner = "client!hb", name = "n", descriptor = "I")
	int anInt3947;

	@OriginalMember(owner = "client!hb", name = "e", descriptor = "[F")
	float[] aFloatArray103;

	@OriginalMember(owner = "client!hb", name = "k", descriptor = "I")
	int anInt3948;

	@OriginalMember(owner = "client!hb", name = "m", descriptor = "Z")
	boolean aBoolean679;

	// $FF: synthetic field
	@OriginalMember(owner = "client!hb", name = "this$0", descriptor = "Lclient!hk;")
	final Class315 this$0;

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(Lclient!hk;)V", line = 1346)
	Class308(@OriginalArg(0) Class315 arg0) {
		this.this$0 = arg0;
	}
}
