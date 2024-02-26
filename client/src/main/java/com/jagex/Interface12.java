package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public interface Interface12 extends Iterable {

	@OriginalMember(owner = "client!an", name = "f", descriptor = "(I)I")
	int method18051(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!an", name = "l", descriptor = "()I")
	int method18052();

	@OriginalMember(owner = "client!an", name = "e", descriptor = "(I)Lclient!ae;")
	Interface11 method18053(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!an", name = "t", descriptor = "(II)Lclient!ae;")
	Interface11 method18054(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!an", name = "u", descriptor = "(I)Lclient!ae;")
	Interface11 method18055(@OriginalArg(0) int arg0);
}
