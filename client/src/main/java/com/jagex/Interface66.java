package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ux")
public interface Interface66 {

	@OriginalMember(owner = "client!ux", name = "f", descriptor = "()V")
	void method32126();

	@OriginalMember(owner = "client!ux", name = "t", descriptor = "(I)V")
	void method32127(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ux", name = "e", descriptor = "()V")
	void method32128();
}
