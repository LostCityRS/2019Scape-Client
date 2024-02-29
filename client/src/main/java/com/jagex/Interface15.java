package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public interface Interface15 extends Interface18, Interface19 {

	@OriginalMember(owner = "client!ce", name = "p", descriptor = "(I)V")
	void method25454(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "(I)V")
	void method25455(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ce", name = "z", descriptor = "(I)V")
	void method25456(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "(I)V")
	void method25457(@OriginalArg(0) int arg0);
}
