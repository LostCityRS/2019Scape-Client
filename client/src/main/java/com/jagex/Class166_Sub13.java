package com.jagex;

import com.jagex.twitchtv.TwitchTV;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!amm")
public class Class166_Sub13 extends Class166 {

	@OriginalMember(owner = "client!amm", name = "w", descriptor = "I")
	static final int anInt2148 = 0;

	@OriginalMember(owner = "client!amm", name = "l", descriptor = "I")
	static final int anInt2149 = 3;

	@OriginalMember(owner = "client!amm", name = "x", descriptor = "Lclient!com/jagex/twitchtv/TwitchTV;")
	static TwitchTV aTwitchTV1;

	@OriginalMember(owner = "client!amm", name = "<init>", descriptor = "(Lclient!ali;)V", line = 11)
	public Class166_Sub13(@OriginalArg(0) Class93_Sub36 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!amm", name = "<init>", descriptor = "(ILclient!ali;)V", line = 15)
	public Class166_Sub13(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub36 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!amm", name = "o", descriptor = "(I)V", line = 19)
	public void method15633(@OriginalArg(0) int arg0) {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 3) {
			this.anInt2379 = this.method16545((byte) 13) * -88839937;
		}
	}

	@OriginalMember(owner = "client!amm", name = "u", descriptor = "()I", line = 23)
	@Override
	int method16550() {
		return 0;
	}

	@OriginalMember(owner = "client!amm", name = "e", descriptor = "(B)I", line = 23)
	@Override
	int method16545(@OriginalArg(0) byte arg0) {
		return 0;
	}

	@OriginalMember(owner = "client!amm", name = "l", descriptor = "()I", line = 23)
	@Override
	int method16549() {
		return 0;
	}

	@OriginalMember(owner = "client!amm", name = "f", descriptor = "()I", line = 23)
	@Override
	int method16544() {
		return 0;
	}

	@OriginalMember(owner = "client!amm", name = "w", descriptor = "()I", line = 23)
	@Override
	int method16552() {
		return 0;
	}

	@OriginalMember(owner = "client!amm", name = "n", descriptor = "(II)I", line = 27)
	@Override
	int method16546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return 3;
	}

	@OriginalMember(owner = "client!amm", name = "z", descriptor = "(I)I", line = 27)
	@Override
	int method16551(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!amm", name = "p", descriptor = "(I)I", line = 27)
	@Override
	int method16543(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!amm", name = "k", descriptor = "(II)V", line = 31)
	@Override
	void method16547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amm", name = "d", descriptor = "(I)V", line = 31)
	@Override
	void method16548(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amm", name = "c", descriptor = "(I)V", line = 31)
	@Override
	void method16553(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amm", name = "s", descriptor = "(I)I", line = 35)
	public int method15634(@OriginalArg(0) int arg0) {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amm", name = "y", descriptor = "()I", line = 35)
	public int method15635() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amm", name = "q", descriptor = "()I", line = 35)
	public int method15636() {
		return this.anInt2379 * 960141055;
	}
}
