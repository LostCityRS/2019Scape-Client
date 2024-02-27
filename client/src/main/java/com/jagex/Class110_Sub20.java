package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!agv")
public final class Class110_Sub20 extends Class110 {

	@OriginalMember(owner = "client!agv", name = "n", descriptor = "I")
	final int anInt990;

	@OriginalMember(owner = "client!agv", name = "m", descriptor = "I")
	final int anInt989;

	@OriginalMember(owner = "client!agv", name = "<init>", descriptor = "(Lclient!alw;)V")
	Class110_Sub20(@OriginalArg(0) Class93_Sub41 arg0) {
		super(arg0);
		this.anInt990 = arg0.method22427(-1434290800) * -14103959;
		this.anInt989 = arg0.method22448(-1926065863) * 1700037205;
	}

	@OriginalMember(owner = "client!agv", name = "l", descriptor = "()Z")
	@Override
	boolean method20154() {
		@Pc(8) Class263 local8 = (Class263) Class32.aClass32_Sub17_23.method18273(this.anInt989 * -1821086979, -1690363448);
		return local8.method26287((byte) -123);
	}

	@OriginalMember(owner = "client!agv", name = "n", descriptor = "(I)V")
	@Override
	public void method20150(@OriginalArg(0) int arg0) {
		@Pc(6) Class243 local6 = Class152.aClass243Array2[this.anInt990 * -1645648423];
		Class573.method31524(local6.anInt3878 * 1569957707, local6.anInt3875 * -1679422971, local6.anInt3877 * 1376446607, local6.aClass615_1.anInt5790 * 2081439295, local6.aClass615_1.anInt5789 * 948246811, local6.anInt3876 * -1340857141, null, this.anInt989 * -1821086979, 0, (byte) 2);
	}

	@OriginalMember(owner = "client!agv", name = "k", descriptor = "(I)Z")
	@Override
	boolean method20151(@OriginalArg(0) int arg0) {
		@Pc(8) Class263 local8 = (Class263) Class32.aClass32_Sub17_23.method18273(this.anInt989 * -1821086979, 326850205);
		return local8.method26287((byte) -58);
	}

	@OriginalMember(owner = "client!agv", name = "f", descriptor = "()V")
	@Override
	public void method20152() {
		@Pc(6) Class243 local6 = Class152.aClass243Array2[this.anInt990 * -1645648423];
		Class573.method31524(local6.anInt3878 * 1569957707, local6.anInt3875 * -1679422971, local6.anInt3877 * 1376446607, local6.aClass615_1.anInt5790 * 2081439295, local6.aClass615_1.anInt5789 * 948246811, local6.anInt3876 * -1340857141, null, this.anInt989 * -1821086979, 0, (byte) 2);
	}

	@OriginalMember(owner = "client!agv", name = "w", descriptor = "()Z")
	@Override
	boolean method20153() {
		@Pc(8) Class263 local8 = (Class263) Class32.aClass32_Sub17_23.method18273(this.anInt989 * -1821086979, 1342436383);
		return local8.method26287((byte) -32);
	}
}
