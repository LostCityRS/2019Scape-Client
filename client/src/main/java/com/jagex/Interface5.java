package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!abo")
public interface Interface5 {

	@OriginalMember(owner = "client!abo", name = "o", descriptor = "(I)V")
	void method37010(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!abo", name = "s", descriptor = "(I)V")
	void method37011(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!abo", name = "j", descriptor = "(I)V")
	void method37012(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!abo", name = "a", descriptor = "(I)V")
	void method37013(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!abo", name = "g", descriptor = "(IS)V")
	void method37014(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1);
}
