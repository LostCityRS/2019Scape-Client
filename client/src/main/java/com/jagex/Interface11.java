package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public interface Interface11 extends Iterable {

	@OriginalMember(owner = "client!ao", name = "e", descriptor = "(II)Lclient!ay;")
	Interface13 get(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ao", name = "n", descriptor = "(I)I")
	int method18262(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ao", name = "f", descriptor = "()I")
	int method18263();

	@OriginalMember(owner = "client!ao", name = "m", descriptor = "(I)Lclient!ay;")
	Interface13 method18264(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ao", name = "k", descriptor = "(I)Lclient!ay;")
	Interface13 method18265(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ao", name = "w", descriptor = "()I")
	int method18266();

	@OriginalMember(owner = "client!ao", name = "l", descriptor = "()I")
	int method18267();
}
