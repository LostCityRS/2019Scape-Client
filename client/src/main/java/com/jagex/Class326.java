package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hw")
public final class Class326 {

	@OriginalMember(owner = "client!hw", name = "u", descriptor = "I")
	int anInt4072;

	@OriginalMember(owner = "client!hw", name = "e", descriptor = "Z")
	boolean aBoolean798;

	@OriginalMember(owner = "client!hw", name = "t", descriptor = "[F")
	float[] aFloatArray104;

	@OriginalMember(owner = "client!hw", name = "f", descriptor = "I")
	int anInt4073;

	// $FF: synthetic field
	@OriginalMember(owner = "client!hw", name = "this$0", descriptor = "Lclient!ha;")
	final Class307 aClass307_4;

	@OriginalMember(owner = "client!hw", name = "<init>", descriptor = "(Lclient!ha;)V")
	Class326(@OriginalArg(0) Class307 arg0) {
		this.aClass307_4 = arg0;
	}
}
