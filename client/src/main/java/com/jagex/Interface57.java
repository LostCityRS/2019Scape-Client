package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public interface Interface57 {

	@OriginalMember(owner = "client!ro", name = "t", descriptor = "(IB)[B")
	byte[] method30566(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1);

	@OriginalMember(owner = "client!ro", name = "f", descriptor = "(I)[B")
	byte[] method30567(@OriginalArg(0) int arg0);
}
