package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public interface Interface26 {

	@OriginalMember(owner = "client!gg", name = "m", descriptor = "(Lclient!gq;)V")
	void method26713(@OriginalArg(0) Class297 arg0);

	@OriginalMember(owner = "client!gg", name = "n", descriptor = "(Lclient!gq;)V")
	void method26714(@OriginalArg(0) Class297 arg0);

	@OriginalMember(owner = "client!gg", name = "e", descriptor = "(Lclient!gq;B)V")
	void method26715(@OriginalArg(0) Class297 arg0, @OriginalArg(1) byte arg1);
}
