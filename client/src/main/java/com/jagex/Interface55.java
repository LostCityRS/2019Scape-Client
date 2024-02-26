package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public interface Interface55 {

	@OriginalMember(owner = "client!rf", name = "t", descriptor = "(Ljava/lang/Object;[F[Ljava/lang/Object;I)V")
	void method26706(@OriginalArg(0) Object arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) Object[] arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!rf", name = "f", descriptor = "(Ljava/lang/Object;[F[Ljava/lang/Object;)V")
	void method26707(@OriginalArg(0) Object arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) Object[] arg2);

	@OriginalMember(owner = "client!rf", name = "e", descriptor = "(Ljava/lang/Object;[F[Ljava/lang/Object;)V")
	void method26708(@OriginalArg(0) Object arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) Object[] arg2);
}
