package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!amq")
public final class Class166_Sub17 extends Class166 {

	@OriginalMember(owner = "client!amq", name = "l", descriptor = "I")
	static final int anInt2176 = 1;

	@OriginalMember(owner = "client!amq", name = "u", descriptor = "I")
	static final int anInt2177 = 4;

	@OriginalMember(owner = "client!amq", name = "w", descriptor = "I")
	static final int anInt2178 = 0;

	@OriginalMember(owner = "client!amq", name = "t", descriptor = "I")
	static int anInt2179;

	@OriginalMember(owner = "client!amq", name = "on", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;I)V")
	static void method15730(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) int arg3) {
		@Pc(13) String local13 = (String) arg2.anObjectArray45[(arg2.anInt6049 -= 957530791) * 587908375];
		if (Class532.method30778(local13, arg2, 1518522314) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray27 = Class499.method30329(local13, arg2, 1315896719);
		arg0.aBoolean684 = true;
	}

	@OriginalMember(owner = "client!amq", name = "dm", descriptor = "(Lclient!yf;I)V")
	static void method15731(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32986(local12, 1369505673);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class644.method32781(local16, local22, arg0, -276727328);
	}

	@OriginalMember(owner = "client!amq", name = "<init>", descriptor = "(ILclient!ali;)V")
	public Class166_Sub17(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub36 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!amq", name = "<init>", descriptor = "(Lclient!ali;)V")
	public Class166_Sub17(@OriginalArg(0) Class93_Sub36 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!amq", name = "q", descriptor = "()Z")
	public boolean method15721() {
		return true;
	}

	@OriginalMember(owner = "client!amq", name = "o", descriptor = "(B)V")
	public void method15722(@OriginalArg(0) byte arg0) {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 4) {
			this.anInt2379 = this.method16554((byte) 44) * -88839937;
		}
	}

	@OriginalMember(owner = "client!amq", name = "e", descriptor = "(B)I")
	@Override
	int method16554(@OriginalArg(0) byte arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!amq", name = "s", descriptor = "(I)Z")
	public boolean method15723(@OriginalArg(0) int arg0) {
		return true;
	}

	@OriginalMember(owner = "client!amq", name = "n", descriptor = "(II)I")
	@Override
	public int method16555(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return 1;
	}

	@OriginalMember(owner = "client!amq", name = "f", descriptor = "()I")
	@Override
	int method16553() {
		return 1;
	}

	@OriginalMember(owner = "client!amq", name = "a", descriptor = "()I")
	public int method15724() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amq", name = "y", descriptor = "(I)I")
	public int method15725(@OriginalArg(0) int arg0) {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amq", name = "w", descriptor = "()I")
	@Override
	int method16562() {
		return 1;
	}

	@OriginalMember(owner = "client!amq", name = "l", descriptor = "()I")
	@Override
	int method16559() {
		return 1;
	}

	@OriginalMember(owner = "client!amq", name = "c", descriptor = "(I)V")
	@Override
	void method16563(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amq", name = "z", descriptor = "(I)I")
	@Override
	public int method16561(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!amq", name = "p", descriptor = "(I)I")
	@Override
	public int method16552(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!amq", name = "d", descriptor = "(I)V")
	@Override
	void method16558(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amq", name = "g", descriptor = "()I")
	public int method15726() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amq", name = "k", descriptor = "(II)V")
	@Override
	void method16557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amq", name = "x", descriptor = "()I")
	public int method15727() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amq", name = "h", descriptor = "()I")
	public int method15728() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amq", name = "u", descriptor = "()I")
	@Override
	int method16560() {
		return 1;
	}

	@OriginalMember(owner = "client!amq", name = "b", descriptor = "()I")
	public int method15729() {
		return this.anInt2379 * 960141055;
	}
}
