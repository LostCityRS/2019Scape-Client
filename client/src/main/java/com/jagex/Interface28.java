package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!it")
public interface Interface28 {

	@OriginalMember(owner = "client!it", name = "w", descriptor = "(Ljava/lang/String;)J")
	long method26838(@OriginalArg(0) String arg0);

	@OriginalMember(owner = "client!it", name = "n", descriptor = "(Ljava/lang/String;)J")
	long method26839(@OriginalArg(0) String arg0);

	@OriginalMember(owner = "client!it", name = "e", descriptor = "(Ljava/lang/String;I)J")
	long method26840(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!it", name = "k", descriptor = "(Ljava/lang/String;)J")
	long method26841(@OriginalArg(0) String arg0);

	@OriginalMember(owner = "client!it", name = "f", descriptor = "(Ljava/lang/String;)J")
	long method26842(@OriginalArg(0) String arg0);

	@OriginalMember(owner = "client!it", name = "m", descriptor = "(Ljava/lang/String;)J")
	long method26843(@OriginalArg(0) String arg0);
}
