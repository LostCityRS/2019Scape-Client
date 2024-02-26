package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public interface Interface43 {

	@OriginalMember(owner = "client!ms", name = "f", descriptor = "()F")
	float method26840();

	@OriginalMember(owner = "client!ms", name = "t", descriptor = "(I)F")
	float method26841(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ms", name = "e", descriptor = "()F")
	float method26842();

	@OriginalMember(owner = "client!ms", name = "u", descriptor = "()F")
	float method26843();

	@OriginalMember(owner = "client!ms", name = "l", descriptor = "()F")
	float method26844();
}
