package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!acf")
public interface Interface6 {

	@OriginalMember(owner = "client!acf", name = "f", descriptor = "()I")
	int method13860();

	@OriginalMember(owner = "client!acf", name = "n", descriptor = "(Lclient!alw;S)V")
	void method13861(@OriginalArg(0) Packet arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!acf", name = "m", descriptor = "(Lclient!alw;I)V")
	void method13862(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!acf", name = "k", descriptor = "()I")
	int method13863();

	@OriginalMember(owner = "client!acf", name = "l", descriptor = "(Lclient!alw;)V")
	void method13864(@OriginalArg(0) Packet arg0);

	@OriginalMember(owner = "client!acf", name = "e", descriptor = "(B)I")
	int method13865(@OriginalArg(0) byte arg0);

	@OriginalMember(owner = "client!acf", name = "w", descriptor = "(Lclient!alw;)V")
	void method13866(@OriginalArg(0) Packet arg0);
}
