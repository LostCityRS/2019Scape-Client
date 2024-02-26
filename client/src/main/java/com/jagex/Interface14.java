package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bw")
public interface Interface14 {

	@OriginalMember(owner = "client!bw", name = "m", descriptor = "()I")
	int method2751();

	@OriginalMember(owner = "client!bw", name = "f", descriptor = "()I")
	int method2752();

	@OriginalMember(owner = "client!bw", name = "e", descriptor = "()J")
	long method2753();

	@OriginalMember(owner = "client!bw", name = "u", descriptor = "(I[BI)V")
	void method2754(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!bw", name = "l", descriptor = "()I")
	int method2755();

	@OriginalMember(owner = "client!bw", name = "g", descriptor = "()I")
	int method2756();

	@OriginalMember(owner = "client!bw", name = "k", descriptor = "(I[BI)V")
	void method2757(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!bw", name = "t", descriptor = "()I")
	int method2758();

	@OriginalMember(owner = "client!bw", name = "i", descriptor = "()I")
	int method2759();

	@OriginalMember(owner = "client!bw", name = "j", descriptor = "()J")
	long method2760();

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "()J")
	long method2761();

	@OriginalMember(owner = "client!bw", name = "s", descriptor = "()J")
	long method2762();

	@OriginalMember(owner = "client!bw", name = "o", descriptor = "()I")
	int method2763();
}
