package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public interface Interface15 {

	@OriginalMember(owner = "client!ca", name = "i", descriptor = "(I[BI)V")
	void method2087(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ca", name = "t", descriptor = "()I")
	int method2088();

	@OriginalMember(owner = "client!ca", name = "e", descriptor = "(I[BI)V")
	void method2089(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ca", name = "u", descriptor = "()I")
	int method2090();

	@OriginalMember(owner = "client!ca", name = "l", descriptor = "()I")
	int method2091();

	@OriginalMember(owner = "client!ca", name = "g", descriptor = "()J")
	long method2092();

	@OriginalMember(owner = "client!ca", name = "f", descriptor = "()J")
	long method2093();

	@OriginalMember(owner = "client!ca", name = "m", descriptor = "(I[BI)V")
	void method2094(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2);
}
