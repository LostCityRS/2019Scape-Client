package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!acu")
public interface Interface7 {

	@OriginalMember(owner = "client!acu", name = "e", descriptor = "(I)I")
	int method30020(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!acu", name = "n", descriptor = "(B)Lclient!acv;")
	Class71 method30021(@OriginalArg(0) byte arg0);

	@OriginalMember(owner = "client!acu", name = "l", descriptor = "()Lclient!acv;")
	Class71 method30022();

	@OriginalMember(owner = "client!acu", name = "k", descriptor = "()I")
	int method30023();

	@OriginalMember(owner = "client!acu", name = "f", descriptor = "()Lclient!acv;")
	Class71 method30024();

	@OriginalMember(owner = "client!acu", name = "w", descriptor = "()Lclient!acv;")
	Class71 method30025();

	@OriginalMember(owner = "client!acu", name = "m", descriptor = "()I")
	int method30026();
}
