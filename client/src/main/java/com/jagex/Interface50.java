package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public interface Interface50 {

	@OriginalMember(owner = "client!oq", name = "n", descriptor = "([BLclient!aac;Z)Ljava/lang/Object;")
	Object method28195(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!oq", name = "e", descriptor = "([BLclient!aac;ZI)Ljava/lang/Object;")
	Object method28196(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3);
}
