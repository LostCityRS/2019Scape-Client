package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!xp")
public interface Interface72 {

	@OriginalMember(owner = "client!xp", name = "z", descriptor = "(I)I")
	int method10432(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!xp", name = "e", descriptor = "(II)I")
	int method10433(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!xp", name = "q", descriptor = "(I)I")
	int method10434(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!xp", name = "d", descriptor = "(I)I")
	int method10435(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!xp", name = "h", descriptor = "(I)I")
	int method10436(@OriginalArg(0) int arg0);
}
