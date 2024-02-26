package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aaf")
public interface Interface1 {

	@OriginalMember(owner = "client!aaf", name = "s", descriptor = "(Lclient!di;IB)[Lclient!cm;")
	Class99[] method29582(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2);

	@OriginalMember(owner = "client!aaf", name = "ac", descriptor = "(Lclient!di;I)[Lclient!cm;")
	Class99[] method29583(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!aaf", name = "k", descriptor = "(II)I")
	int method29584(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!aaf", name = "ag", descriptor = "(I)I")
	int method29585(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!aaf", name = "ab", descriptor = "(I)I")
	int method29586(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!aaf", name = "al", descriptor = "(I)I")
	int method29587(@OriginalArg(0) int arg0);
}
