package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public interface Interface55 {

	@OriginalMember(owner = "client!rf", name = "e", descriptor = "(II)[B")
	byte[] method30299(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!rf", name = "m", descriptor = "(I)[B")
	byte[] method30300(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!rf", name = "n", descriptor = "(I)[B")
	byte[] method30301(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!rf", name = "k", descriptor = "(I)[B")
	byte[] method30302(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!rf", name = "f", descriptor = "(I)[B")
	byte[] method30303(@OriginalArg(0) int arg0);
}
