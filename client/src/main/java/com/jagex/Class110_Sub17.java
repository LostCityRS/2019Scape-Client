package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!agp")
public class Class110_Sub17 extends Class110 {

	@OriginalMember(owner = "client!agp", name = "n", descriptor = "I")
	final int anInt975;

	@OriginalMember(owner = "client!agp", name = "m", descriptor = "I")
	final int anInt976;

	@OriginalMember(owner = "client!agp", name = "k", descriptor = "I")
	final int anInt977;

	@OriginalMember(owner = "client!agp", name = "<init>", descriptor = "(Lclient!alw;)V", line = 11)
	Class110_Sub17(@OriginalArg(0) Class93_Sub41 arg0) {
		super(arg0);
		this.anInt975 = arg0.method22472(-1434290800) * -391596629;
		this.anInt976 = arg0.method22472(-1434290800) * 705207339;
		this.anInt977 = arg0.method22465((short) 16384) * 1160201955;
	}

	@OriginalMember(owner = "client!agp", name = "n", descriptor = "(I)V", line = 18)
	@Override
	public void method20149(@OriginalArg(0) int arg0) {
		@Pc(6) Class239 local6 = Class249.aClass239Array1[this.anInt975 * 399809795];
		@Pc(13) Class250 local13 = Class716.aClass250Array1[this.anInt976 * 1686061699];
		local13.method25951(local6, this.anInt977 * -456511797, -148764675);
	}

	@OriginalMember(owner = "client!agp", name = "f", descriptor = "()V", line = 18)
	@Override
	public void method20150() {
		@Pc(6) Class239 local6 = Class249.aClass239Array1[this.anInt975 * 399809795];
		@Pc(13) Class250 local13 = Class716.aClass250Array1[this.anInt976 * 1686061699];
		local13.method25951(local6, this.anInt977 * -456511797, -1524451970);
	}
}
