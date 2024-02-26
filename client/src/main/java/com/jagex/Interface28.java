package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public interface Interface28 {

	@OriginalMember(owner = "client!ip", name = "t", descriptor = "(Ljava/lang/String;I)J")
	long method27718(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ip", name = "f", descriptor = "(Ljava/lang/String;)J")
	long method27719(@OriginalArg(0) String arg0);

	@OriginalMember(owner = "client!ip", name = "e", descriptor = "(Ljava/lang/String;)J")
	long method27720(@OriginalArg(0) String arg0);
}
