package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public interface Interface32 {

	@OriginalMember(owner = "client!kk", name = "u", descriptor = "(Z)V")
	void method28656(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!kk", name = "e", descriptor = "(I)Z")
	boolean method28657(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!kk", name = "t", descriptor = "(I)V")
	void method28658(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!kk", name = "g", descriptor = "(Z)V")
	void method28659(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!kk", name = "l", descriptor = "(Z)V")
	void method28660(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!kk", name = "i", descriptor = "()V")
	void method28661();

	@OriginalMember(owner = "client!kk", name = "f", descriptor = "(ZB)V")
	void method28662(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte arg1);

	@OriginalMember(owner = "client!kk", name = "m", descriptor = "()V")
	void method28663();

	@OriginalMember(owner = "client!kk", name = "o", descriptor = "()Z")
	boolean method28664();

	@OriginalMember(owner = "client!kk", name = "j", descriptor = "()Z")
	boolean method28665();
}
