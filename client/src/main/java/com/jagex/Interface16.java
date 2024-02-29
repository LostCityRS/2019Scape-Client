package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public interface Interface16 {

	@OriginalMember(owner = "client!cf", name = "f", descriptor = "()I")
	int method2558();

	@OriginalMember(owner = "client!cf", name = "n", descriptor = "()J")
	long method2559();

	@OriginalMember(owner = "client!cf", name = "z", descriptor = "(I[BI)V")
	void method2560(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!cf", name = "m", descriptor = "(I[BI)V")
	void method2561(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!cf", name = "k", descriptor = "()I")
	int method2562();

	@OriginalMember(owner = "client!cf", name = "w", descriptor = "()J")
	long method2563();

	@OriginalMember(owner = "client!cf", name = "l", descriptor = "()J")
	long method2564();

	@OriginalMember(owner = "client!cf", name = "u", descriptor = "(I[BI)V")
	void method2565(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!cf", name = "p", descriptor = "(I[BI)V")
	void method2566(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!cf", name = "e", descriptor = "()I")
	int method2567();
}
