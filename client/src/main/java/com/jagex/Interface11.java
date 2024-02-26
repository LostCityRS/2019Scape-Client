package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public interface Interface11 {

	@OriginalMember(owner = "client!ae", name = "t", descriptor = "(Lclient!ald;I)V")
	void method37006(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ae", name = "f", descriptor = "(B)V")
	void method37007(@OriginalArg(0) byte arg0);

	@OriginalMember(owner = "client!ae", name = "e", descriptor = "()V")
	void method37008();

	@OriginalMember(owner = "client!ae", name = "u", descriptor = "(Lclient!ald;)V")
	void method37009(@OriginalArg(0) Class80_Sub36 arg0);
}
