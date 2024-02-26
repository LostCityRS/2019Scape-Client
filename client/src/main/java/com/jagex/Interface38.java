package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lx")
public interface Interface38 extends Interface37, Interface35 {

	@OriginalMember(owner = "client!lx", name = "l", descriptor = "(II)Z")
	boolean method29324(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!lx", name = "u", descriptor = "(II)Z")
	boolean method29325(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!lx", name = "m", descriptor = "()V")
	void method30835();

	@OriginalMember(owner = "client!lx", name = "o", descriptor = "()V")
	void method30836();

	@OriginalMember(owner = "client!lx", name = "j", descriptor = "()V")
	void method30834();

	@OriginalMember(owner = "client!lx", name = "f", descriptor = "(II)Z")
	boolean method29326(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!lx", name = "e", descriptor = "()V")
	void method30837();

	@OriginalMember(owner = "client!lx", name = "t", descriptor = "(II)Z")
	boolean method29327(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
