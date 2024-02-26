package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ace")
public interface Interface6 {

	@OriginalMember(owner = "client!ace", name = "i", descriptor = "()Lclient!acr;")
	Class67 method30346();

	@OriginalMember(owner = "client!ace", name = "f", descriptor = "(I)Lclient!acr;")
	Class67 method30347(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ace", name = "e", descriptor = "()I")
	int method30348();

	@OriginalMember(owner = "client!ace", name = "t", descriptor = "(B)I")
	int method30349(@OriginalArg(0) byte arg0);

	@OriginalMember(owner = "client!ace", name = "u", descriptor = "()I")
	int method30350();

	@OriginalMember(owner = "client!ace", name = "m", descriptor = "()Lclient!acr;")
	Class67 method30351();

	@OriginalMember(owner = "client!ace", name = "g", descriptor = "()I")
	int method30352();

	@OriginalMember(owner = "client!ace", name = "l", descriptor = "()I")
	int method30353();
}
