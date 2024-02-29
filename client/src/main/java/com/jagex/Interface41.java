package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public interface Interface41 {

	@OriginalMember(owner = "client!mm", name = "m", descriptor = "()V")
	void method30620();

	@OriginalMember(owner = "client!mm", name = "n", descriptor = "()V")
	void method30621();

	@OriginalMember(owner = "client!mm", name = "e", descriptor = "(I)V")
	void method30622(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!mm", name = "k", descriptor = "()V")
	void method30623();
}
