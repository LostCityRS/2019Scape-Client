package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public interface Interface37 {

	@OriginalMember(owner = "client!ln", name = "x", descriptor = "()I")
	int method29382();

	@OriginalMember(owner = "client!ln", name = "i", descriptor = "(IIJ)Z")
	boolean method29383(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2);

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(II)J")
	long method29384(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ln", name = "s", descriptor = "()V")
	void method29385();

	@OriginalMember(owner = "client!ln", name = "k", descriptor = "()I")
	int method29386();

	@OriginalMember(owner = "client!ln", name = "z", descriptor = "(II)J")
	long method29387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ln", name = "w", descriptor = "(IIJ)Z")
	boolean method29388(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2);

	@OriginalMember(owner = "client!ln", name = "h", descriptor = "()V")
	void method29389();

	@OriginalMember(owner = "client!ln", name = "q", descriptor = "()V")
	void method29390();

	@OriginalMember(owner = "client!ln", name = "g", descriptor = "()I")
	int method29391();

	@OriginalMember(owner = "client!ln", name = "d", descriptor = "()V")
	void method29392();

	@OriginalMember(owner = "client!ln", name = "r", descriptor = "(IIJ)Z")
	boolean method29393(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2);
}
