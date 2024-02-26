package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public interface Interface49 {

	@OriginalMember(owner = "client!od", name = "f", descriptor = "([BLclient!aan;Z)Ljava/lang/Object;")
	Object method31895(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class15 arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!od", name = "e", descriptor = "([BLclient!aan;Z)Ljava/lang/Object;")
	Object method31896(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class15 arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!od", name = "t", descriptor = "([BLclient!aan;ZI)Ljava/lang/Object;")
	Object method31897(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class15 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!od", name = "u", descriptor = "([BLclient!aan;Z)Ljava/lang/Object;")
	Object method31898(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class15 arg1, @OriginalArg(2) boolean arg2);
}
