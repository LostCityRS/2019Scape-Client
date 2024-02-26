package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public interface Interface26 {

	@OriginalMember(owner = "client!gf", name = "f", descriptor = "(Lclient!gz;)V")
	void method27028(@OriginalArg(0) Class305 arg0);

	@OriginalMember(owner = "client!gf", name = "t", descriptor = "(Lclient!gz;I)V")
	void method27029(@OriginalArg(0) Class305 arg0, @OriginalArg(1) int arg1);
}
