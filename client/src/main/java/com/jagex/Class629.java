package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

import java.util.LinkedList;

@OriginalClass("client!vz")
public final class Class629 {

	@OriginalMember(owner = "client!vz", name = "t", descriptor = "I")
	final int anInt5543;

	@OriginalMember(owner = "client!vz", name = "l", descriptor = "Ljava/util/LinkedList;")
	final LinkedList aLinkedList8;

	@OriginalMember(owner = "client!vz", name = "f", descriptor = "I")
	final int anInt5542;

	@OriginalMember(owner = "client!vz", name = "e", descriptor = "I")
	final int anInt5544;

	@OriginalMember(owner = "client!vz", name = "u", descriptor = "F")
	final float aFloat338;

	@OriginalMember(owner = "client!vz", name = "jf", descriptor = "(Lclient!yp;B)V")
	static void method32557(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5778 -= -221471862;
	}

	@OriginalMember(owner = "client!vz", name = "anu", descriptor = "(Lclient!yp;I)V")
	static void method32558(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		Class276.method26821(1344895894);
	}

	@OriginalMember(owner = "client!vz", name = "yg", descriptor = "(Lclient!yp;I)V")
	static void method32559(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = client.anInt3426 * -622206633;
	}

	@OriginalMember(owner = "client!vz", name = "<init>", descriptor = "(ILjava/util/LinkedList;IIF)V")
	Class629(@OriginalArg(0) int arg0, @OriginalArg(1) LinkedList arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4) {
		this.anInt5543 = arg0 * -1448309383;
		this.aLinkedList8 = arg1;
		this.anInt5542 = arg2 * -1147670377;
		this.anInt5544 = arg3 * -435858541;
		this.aFloat338 = arg4;
	}
}
