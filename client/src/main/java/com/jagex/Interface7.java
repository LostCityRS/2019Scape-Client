package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ach")
public interface Interface7 {

	@OriginalMember(owner = "client!ach", name = "l", descriptor = "(Lclient!ald;)V")
	void method14458(@OriginalArg(0) Packet arg0);

	@OriginalMember(owner = "client!ach", name = "f", descriptor = "(Lclient!ald;B)V")
	void method14459(@OriginalArg(0) Packet arg0, @OriginalArg(1) byte arg1);

	@OriginalMember(owner = "client!ach", name = "g", descriptor = "(Lclient!ald;)V")
	void method14460(@OriginalArg(0) Packet arg0);

	@OriginalMember(owner = "client!ach", name = "u", descriptor = "()I")
	int method14461();

	@OriginalMember(owner = "client!ach", name = "e", descriptor = "(Lclient!ald;B)V")
	void method14462(@OriginalArg(0) Packet arg0, @OriginalArg(1) byte arg1);

	@OriginalMember(owner = "client!ach", name = "t", descriptor = "(I)I")
	int method14463(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ach", name = "i", descriptor = "(Lclient!ald;)V")
	void method14464(@OriginalArg(0) Packet arg0);

	@OriginalMember(owner = "client!ach", name = "m", descriptor = "(Lclient!ald;)V")
	void method14465(@OriginalArg(0) Packet arg0);
}
