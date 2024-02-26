package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public interface Interface70 {

	@OriginalMember(owner = "client!wp", name = "e", descriptor = "(Lclient!wc;IIZ)V")
	void method26674(@OriginalArg(0) Interface68 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!wp", name = "f", descriptor = "(Lclient!wc;I)V")
	void method26675(@OriginalArg(0) Interface68 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!wp", name = "t", descriptor = "(Lclient!wc;IIZB)V")
	void method26676(@OriginalArg(0) Interface68 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte arg4);

	@OriginalMember(owner = "client!wp", name = "l", descriptor = "(Lclient!wc;)V")
	void method26677(@OriginalArg(0) Interface68 arg0);

	@OriginalMember(owner = "client!wp", name = "u", descriptor = "(Lclient!wc;IIZ)V")
	void method26678(@OriginalArg(0) Interface68 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!wp", name = "g", descriptor = "(Lclient!wc;)V")
	void method26679(@OriginalArg(0) Interface68 arg0);
}
