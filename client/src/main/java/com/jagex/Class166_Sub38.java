package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!anp")
public class Class166_Sub38 extends Class166 {

	@OriginalMember(owner = "client!anp", name = "<init>", descriptor = "(Lclient!ali;)V", line = 8)
	public Class166_Sub38(@OriginalArg(0) Class93_Sub36 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!anp", name = "<init>", descriptor = "(ILclient!ali;)V", line = 12)
	public Class166_Sub38(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub36 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!anp", name = "o", descriptor = "(I)V", line = 15)
	public void method16320(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!anp", name = "y", descriptor = "()V", line = 15)
	public void method16321() {
	}

	@OriginalMember(owner = "client!anp", name = "q", descriptor = "()V", line = 15)
	public void method16322() {
	}

	@OriginalMember(owner = "client!anp", name = "e", descriptor = "(B)I", line = 18)
	@Override
	int method16545(@OriginalArg(0) byte arg0) {
		return 0;
	}

	@OriginalMember(owner = "client!anp", name = "f", descriptor = "()I", line = 18)
	@Override
	int method16544() {
		return 0;
	}

	@OriginalMember(owner = "client!anp", name = "l", descriptor = "()I", line = 18)
	@Override
	int method16549() {
		return 0;
	}

	@OriginalMember(owner = "client!anp", name = "u", descriptor = "()I", line = 18)
	@Override
	int method16550() {
		return 0;
	}

	@OriginalMember(owner = "client!anp", name = "w", descriptor = "()I", line = 18)
	@Override
	int method16552() {
		return 0;
	}

	@OriginalMember(owner = "client!anp", name = "m", descriptor = "(Lclient!alw;[Lclient!qw;I)[Ljava/lang/Object;", line = 20)
	public static Object[] method16323(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) Class519[] arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0.method22528((byte) -70);
		@Pc(9) Object[] local9 = new Object[local3 * arg1.length];
		for (@Pc(11) int local11 = 0; local11 < local3; local11++) {
			for (@Pc(16) int local16 = 0; local16 < arg1.length; local16++) {
				@Pc(27) int local27 = local11 * arg1.length + local16;
				local9[local27] = arg1[local16].aClass500_7.method30163(arg0, (byte) 0);
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!anp", name = "n", descriptor = "(II)I", line = 22)
	@Override
	int method16546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return 1;
	}

	@OriginalMember(owner = "client!anp", name = "p", descriptor = "(I)I", line = 22)
	@Override
	int method16543(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!anp", name = "z", descriptor = "(I)I", line = 22)
	@Override
	int method16551(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!anp", name = "c", descriptor = "(I)V", line = 26)
	@Override
	void method16553(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!anp", name = "k", descriptor = "(II)V", line = 26)
	@Override
	void method16547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!anp", name = "d", descriptor = "(I)V", line = 26)
	@Override
	void method16548(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!anp", name = "s", descriptor = "(I)I", line = 30)
	public int method16324(@OriginalArg(0) int arg0) {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!anp", name = "x", descriptor = "()I", line = 30)
	public int method16325() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!anp", name = "b", descriptor = "()I", line = 30)
	public int method16326() {
		return this.anInt2379 * 960141055;
	}
}
