package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!amq")
public class Class166_Sub17 extends Class166 {

	@OriginalMember(owner = "client!amq", name = "l", descriptor = "I")
	static final int anInt2176 = 1;

	@OriginalMember(owner = "client!amq", name = "u", descriptor = "I")
	static final int anInt2177 = 4;

	@OriginalMember(owner = "client!amq", name = "w", descriptor = "I")
	static final int anInt2178 = 0;

	@OriginalMember(owner = "client!amq", name = "t", descriptor = "I")
	static int anInt2179;

	@OriginalMember(owner = "client!amq", name = "<init>", descriptor = "(Lclient!ali;)V", line = 12)
	public Class166_Sub17(@OriginalArg(0) Class93_Sub36 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!amq", name = "<init>", descriptor = "(ILclient!ali;)V", line = 16)
	public Class166_Sub17(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub36 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!amq", name = "o", descriptor = "(B)V", line = 20)
	public void method15709(@OriginalArg(0) byte arg0) {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 4) {
			this.anInt2379 = this.method16545((byte) 44) * -88839937;
		}
	}

	@OriginalMember(owner = "client!amq", name = "e", descriptor = "(B)I", line = 24)
	@Override
	int method16545(@OriginalArg(0) byte arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!amq", name = "f", descriptor = "()I", line = 24)
	@Override
	int method16544() {
		return 1;
	}

	@OriginalMember(owner = "client!amq", name = "w", descriptor = "()I", line = 24)
	@Override
	int method16552() {
		return 1;
	}

	@OriginalMember(owner = "client!amq", name = "l", descriptor = "()I", line = 24)
	@Override
	int method16549() {
		return 1;
	}

	@OriginalMember(owner = "client!amq", name = "u", descriptor = "()I", line = 24)
	@Override
	int method16550() {
		return 1;
	}

	@OriginalMember(owner = "client!amq", name = "q", descriptor = "()Z", line = 28)
	public boolean method15710() {
		return true;
	}

	@OriginalMember(owner = "client!amq", name = "s", descriptor = "(I)Z", line = 28)
	public boolean method15711(@OriginalArg(0) int arg0) {
		return true;
	}

	@OriginalMember(owner = "client!amq", name = "n", descriptor = "(II)I", line = 32)
	@Override
	public int method16546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return 1;
	}

	@OriginalMember(owner = "client!amq", name = "z", descriptor = "(I)I", line = 32)
	@Override
	public int method16551(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!amq", name = "p", descriptor = "(I)I", line = 32)
	@Override
	public int method16543(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!amq", name = "c", descriptor = "(I)V", line = 36)
	@Override
	void method16553(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amq", name = "d", descriptor = "(I)V", line = 36)
	@Override
	void method16548(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amq", name = "k", descriptor = "(II)V", line = 36)
	@Override
	void method16547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amq", name = "a", descriptor = "()I", line = 40)
	public int method15712() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amq", name = "y", descriptor = "(I)I", line = 40)
	public int method15713(@OriginalArg(0) int arg0) {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amq", name = "g", descriptor = "()I", line = 40)
	public int method15714() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amq", name = "x", descriptor = "()I", line = 40)
	public int method15715() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amq", name = "h", descriptor = "()I", line = 40)
	public int method15716() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amq", name = "b", descriptor = "()I", line = 40)
	public int method15717() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amq", name = "dm", descriptor = "(Lclient!yf;I)V", line = 5526)
	static final void method15718(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32808(local12, 1369505673);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class644.method32601(local16, local22, arg0, -276727328);
	}

	@OriginalMember(owner = "client!amq", name = "on", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;I)V", line = 7616)
	static final void method15719(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) int arg3) {
		@Pc(13) String local13 = (String) arg2.anObjectArray45[(arg2.anInt5888 -= 957530791) * 587908375];
		if (Class532.method30597(local13, arg2, 1518522314) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray27 = Class499.method30149(local13, arg2, 1315896719);
		arg0.aBoolean680 = true;
	}
}
