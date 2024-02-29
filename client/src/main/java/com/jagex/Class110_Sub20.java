package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!agv")
public class Class110_Sub20 extends Class110 {

	@OriginalMember(owner = "client!agv", name = "n", descriptor = "I")
	final int anInt990;

	@OriginalMember(owner = "client!agv", name = "m", descriptor = "I")
	final int anInt989;

	@OriginalMember(owner = "client!agv", name = "<init>", descriptor = "(Lclient!alw;)V", line = 12)
	Class110_Sub20(@OriginalArg(0) Class93_Sub41 arg0) {
		super(arg0);
		this.anInt990 = arg0.method22472(-1434290800) * -14103959;
		this.anInt989 = arg0.method22542(-1926065863) * 1700037205;
	}

	@OriginalMember(owner = "client!agv", name = "n", descriptor = "(I)V", line = 18)
	@Override
	public void method20149(@OriginalArg(0) int arg0) {
		@Pc(6) Class243 local6 = Class152.aClass243Array2[this.anInt990 * -1645648423];
		Class573.method31343(local6.anInt3837 * 1569957707, local6.anInt3834 * -1679422971, local6.anInt3836 * 1376446607, local6.aClass615_1.anInt5629 * 2081439295, local6.aClass615_1.anInt5628 * 948246811, local6.anInt3835 * -1340857141, null, this.anInt989 * -1821086979, 0, (byte) 2);
	}

	@OriginalMember(owner = "client!agv", name = "f", descriptor = "()V", line = 18)
	@Override
	public void method20150() {
		@Pc(6) Class243 local6 = Class152.aClass243Array2[this.anInt990 * -1645648423];
		Class573.method31343(local6.anInt3837 * 1569957707, local6.anInt3834 * -1679422971, local6.anInt3836 * 1376446607, local6.aClass615_1.anInt5629 * 2081439295, local6.aClass615_1.anInt5628 * 948246811, local6.anInt3835 * -1340857141, null, this.anInt989 * -1821086979, 0, (byte) 2);
	}

	@OriginalMember(owner = "client!agv", name = "l", descriptor = "()Z", line = 23)
	@Override
	boolean method20143() {
		@Pc(8) Class263 local8 = (Class263) Class32.aClass32_Sub17_23.method18261(this.anInt989 * -1821086979, -1690363448);
		return local8.method26188((byte) -123);
	}

	@OriginalMember(owner = "client!agv", name = "k", descriptor = "(I)Z", line = 23)
	@Override
	boolean method20141(@OriginalArg(0) int arg0) {
		@Pc(8) Class263 local8 = (Class263) Class32.aClass32_Sub17_23.method18261(this.anInt989 * -1821086979, 326850205);
		return local8.method26188((byte) -58);
	}

	@OriginalMember(owner = "client!agv", name = "w", descriptor = "()Z", line = 23)
	@Override
	boolean method20142() {
		@Pc(8) Class263 local8 = (Class263) Class32.aClass32_Sub17_23.method18261(this.anInt989 * -1821086979, 1342436383);
		return local8.method26188((byte) -32);
	}
}
