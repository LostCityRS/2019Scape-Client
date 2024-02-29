package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public interface Interface58 {

	@OriginalMember(owner = "client!ro", name = "e", descriptor = "(Ljava/lang/Object;[F[Ljava/lang/Object;B)V")
	void method26350(@OriginalArg(0) Object arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) Object[] arg2, @OriginalArg(3) byte arg3);

	@OriginalMember(owner = "client!ro", name = "n", descriptor = "(Ljava/lang/Object;[F[Ljava/lang/Object;)V")
	void method26351(@OriginalArg(0) Object arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) Object[] arg2);

	@OriginalMember(owner = "client!ro", name = "m", descriptor = "(Ljava/lang/Object;[F[Ljava/lang/Object;)V")
	void method26352(@OriginalArg(0) Object arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) Object[] arg2);
}
