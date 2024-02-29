package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!xp")
public interface Interface71 {

	@OriginalMember(owner = "client!xp", name = "s", descriptor = "(I)I")
	int method8652(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!xp", name = "y", descriptor = "(I)I")
	int method8653(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!xp", name = "m", descriptor = "(II)I")
	int method8654(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
