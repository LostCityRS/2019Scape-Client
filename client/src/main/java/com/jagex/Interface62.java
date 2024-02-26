package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public interface Interface62 {

	@OriginalMember(owner = "client!tc", name = "e", descriptor = "(Lclient!ase;)Z")
	boolean method31787(@OriginalArg(0) Class120_Sub1_Sub1 arg0);

	@OriginalMember(owner = "client!tc", name = "f", descriptor = "(Lclient!ase;)Z")
	boolean method31788(@OriginalArg(0) Class120_Sub1_Sub1 arg0);

	@OriginalMember(owner = "client!tc", name = "u", descriptor = "(Lclient!ase;)Z")
	boolean method31789(@OriginalArg(0) Class120_Sub1_Sub1 arg0);

	@OriginalMember(owner = "client!tc", name = "t", descriptor = "(Lclient!ase;I)Z")
	boolean method31790(@OriginalArg(0) Class120_Sub1_Sub1 arg0, @OriginalArg(1) int arg1);
}
