package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public class Class194 {

	@OriginalMember(owner = "client!br", name = "k", descriptor = "I")
	int anInt3353;

	@OriginalMember(owner = "client!br", name = "f", descriptor = "I")
	int anInt3356;

	@OriginalMember(owner = "client!br", name = "w", descriptor = "I")
	int anInt3357;

	@OriginalMember(owner = "client!br", name = "n", descriptor = "I")
	int anInt3354 = 128;

	@OriginalMember(owner = "client!br", name = "m", descriptor = "I")
	int anInt3355 = 128;

	@OriginalMember(owner = "client!br", name = "e", descriptor = "I")
	int anInt3358;

	@OriginalMember(owner = "client!br", name = "<init>", descriptor = "(I)V", line = 12)
	Class194(@OriginalArg(0) int arg0) {
		this.anInt3358 = arg0;
	}

	@OriginalMember(owner = "client!br", name = "<init>", descriptor = "(IIIIII)V", line = 16)
	Class194(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt3358 = arg0;
		this.anInt3354 = arg1;
		this.anInt3355 = arg2;
		this.anInt3353 = arg3;
		this.anInt3356 = arg4;
		this.anInt3357 = arg5;
	}

	@OriginalMember(owner = "client!br", name = "m", descriptor = "()Lclient!br;", line = 26)
	Class194 method24591() {
		return new Class194(this.anInt3358, this.anInt3354, this.anInt3355, this.anInt3353, this.anInt3356, this.anInt3357);
	}

	@OriginalMember(owner = "client!br", name = "e", descriptor = "()Lclient!br;", line = 26)
	Class194 method24592() {
		return new Class194(this.anInt3358, this.anInt3354, this.anInt3355, this.anInt3353, this.anInt3356, this.anInt3357);
	}

	@OriginalMember(owner = "client!br", name = "k", descriptor = "()Lclient!br;", line = 26)
	Class194 method24593() {
		return new Class194(this.anInt3358, this.anInt3354, this.anInt3355, this.anInt3353, this.anInt3356, this.anInt3357);
	}

	@OriginalMember(owner = "client!br", name = "w", descriptor = "(Lclient!br;)V", line = 30)
	void method24594(@OriginalArg(0) Class194 arg0) {
		this.anInt3354 = arg0.anInt3354;
		this.anInt3355 = arg0.anInt3355;
		this.anInt3353 = arg0.anInt3353;
		this.anInt3356 = arg0.anInt3356;
		this.anInt3358 = arg0.anInt3358;
		this.anInt3357 = arg0.anInt3357;
	}

	@OriginalMember(owner = "client!br", name = "n", descriptor = "(Lclient!br;)V", line = 30)
	void method24595(@OriginalArg(0) Class194 arg0) {
		this.anInt3354 = arg0.anInt3354;
		this.anInt3355 = arg0.anInt3355;
		this.anInt3353 = arg0.anInt3353;
		this.anInt3356 = arg0.anInt3356;
		this.anInt3358 = arg0.anInt3358;
		this.anInt3357 = arg0.anInt3357;
	}

	@OriginalMember(owner = "client!br", name = "f", descriptor = "(Lclient!br;)V", line = 30)
	void method24596(@OriginalArg(0) Class194 arg0) {
		this.anInt3354 = arg0.anInt3354;
		this.anInt3355 = arg0.anInt3355;
		this.anInt3353 = arg0.anInt3353;
		this.anInt3356 = arg0.anInt3356;
		this.anInt3358 = arg0.anInt3358;
		this.anInt3357 = arg0.anInt3357;
	}

	@OriginalMember(owner = "client!br", name = "l", descriptor = "(Lclient!br;)V", line = 30)
	void method24597(@OriginalArg(0) Class194 arg0) {
		this.anInt3354 = arg0.anInt3354;
		this.anInt3355 = arg0.anInt3355;
		this.anInt3353 = arg0.anInt3353;
		this.anInt3356 = arg0.anInt3356;
		this.anInt3358 = arg0.anInt3358;
		this.anInt3357 = arg0.anInt3357;
	}
}
