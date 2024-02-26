package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public interface Interface67 {

	@OriginalMember(owner = "client!ve", name = "t", descriptor = "(Lclient!akg;[Lclient!ua;ILclient!un;S)Z")
	boolean method32275(@OriginalArg(0) Class80_Sub17 arg0, @OriginalArg(1) Interface63[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class155 arg3, @OriginalArg(4) short arg4);

	@OriginalMember(owner = "client!ve", name = "f", descriptor = "(Lclient!akg;[Lclient!ua;ILclient!un;)Z")
	boolean method32276(@OriginalArg(0) Class80_Sub17 arg0, @OriginalArg(1) Interface63[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class155 arg3);

	@OriginalMember(owner = "client!ve", name = "e", descriptor = "(Lclient!akg;[Lclient!ua;ILclient!un;)Z")
	boolean method32277(@OriginalArg(0) Class80_Sub17 arg0, @OriginalArg(1) Interface63[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class155 arg3);

	@OriginalMember(owner = "client!ve", name = "u", descriptor = "(Lclient!akg;[Lclient!ua;ILclient!un;)Z")
	boolean method32278(@OriginalArg(0) Class80_Sub17 arg0, @OriginalArg(1) Interface63[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class155 arg3);
}
