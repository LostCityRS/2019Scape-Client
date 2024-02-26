package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ade")
public interface Interface9 {

	@OriginalMember(owner = "client!ade", name = "f", descriptor = "(Lclient!ald;)Ljava/lang/Object;")
	Object method30635(@OriginalArg(0) Packet arg0);

	@OriginalMember(owner = "client!ade", name = "u", descriptor = "(Lclient!ald;)Ljava/lang/Object;")
	Object method30636(@OriginalArg(0) Packet arg0);

	@OriginalMember(owner = "client!ade", name = "e", descriptor = "(Lclient!ald;)Ljava/lang/Object;")
	Object method30637(@OriginalArg(0) Packet arg0);

	@OriginalMember(owner = "client!ade", name = "t", descriptor = "(Lclient!ald;S)Ljava/lang/Object;")
	Object method30638(@OriginalArg(0) Packet arg0, @OriginalArg(1) short arg1);
}
