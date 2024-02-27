package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!amk")
public final class Class166_Sub11 extends Class166 {

	@OriginalMember(owner = "client!amk", name = "w", descriptor = "I")
	static final int anInt2136 = 5;

	@OriginalMember(owner = "client!amk", name = "l", descriptor = "I")
	static final int anInt2137 = 300;

	@OriginalMember(owner = "client!amk", name = "u", descriptor = "I")
	static final int anInt2138 = 30;

	@OriginalMember(owner = "client!amk", name = "il", descriptor = "(IIIIIZZI)V")
	static void method15606(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7) {
		if (!arg5 && (arg1 < 512 || arg2 < 512 || arg1 > (client.aClass532_1.method30625(648603660) - 2) * 512 || arg2 > (client.aClass532_1.method30655((short) 128) - 2) * 512)) {
			@Pc(27) float[] local27 = client.aFloatArray93;
			client.aFloatArray93[1] = -1.0F;
			local27[0] = -1.0F;
			return;
		}
		@Pc(44) int local44 = Class305.method26894(arg1, arg2, arg0, (byte) -3) - arg4;
		client.aClass470_51.method29545(Class694.aClass104_14.method20529());
		client.aClass470_51.method29568((float) arg3, 0.0F, 0.0F);
		Class694.aClass104_14.method20528(client.aClass470_51);
		if (arg5) {
			Class694.aClass104_14.method20836((float) arg1, (float) local44, (float) arg2, client.aFloatArray93);
		} else {
			Class694.aClass104_14.method20818((float) arg1, (float) local44, (float) arg2, client.aFloatArray93);
		}
		client.aClass470_51.method29568((float) -arg3, 0.0F, 0.0F);
		Class694.aClass104_14.method20528(client.aClass470_51);
		if (!arg6) {
			client.aFloatArray93[0] -= client.anInt3432 * 706492895;
			client.aFloatArray93[1] -= client.anInt3568 * 1300190535;
		}
	}

	@OriginalMember(owner = "client!amk", name = "<init>", descriptor = "(ILclient!ali;)V")
	public Class166_Sub11(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub36 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!amk", name = "<init>", descriptor = "(Lclient!ali;)V")
	public Class166_Sub11(@OriginalArg(0) Class93_Sub36 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!amk", name = "y", descriptor = "()V")
	public void method15599() {
		this.anInt2379 = Math.min(Math.max(this.anInt2379 * 960141055, 5), 300) * -88839937;
	}

	@OriginalMember(owner = "client!amk", name = "o", descriptor = "(I)V")
	public void method15600(@OriginalArg(0) int arg0) {
		this.anInt2379 = Math.min(Math.max(this.anInt2379 * 960141055, 5), 300) * -88839937;
	}

	@OriginalMember(owner = "client!amk", name = "e", descriptor = "(B)I")
	@Override
	int method16554(@OriginalArg(0) byte arg0) {
		return 30;
	}

	@OriginalMember(owner = "client!amk", name = "n", descriptor = "(II)I")
	@Override
	int method16555(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return 3;
	}

	@OriginalMember(owner = "client!amk", name = "k", descriptor = "(II)V")
	@Override
	void method16557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amk", name = "p", descriptor = "(I)I")
	@Override
	int method16552(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!amk", name = "f", descriptor = "()I")
	@Override
	int method16553() {
		return 30;
	}

	@OriginalMember(owner = "client!amk", name = "w", descriptor = "()I")
	@Override
	int method16562() {
		return 30;
	}

	@OriginalMember(owner = "client!amk", name = "l", descriptor = "()I")
	@Override
	int method16559() {
		return 30;
	}

	@OriginalMember(owner = "client!amk", name = "u", descriptor = "()I")
	@Override
	int method16560() {
		return 30;
	}

	@OriginalMember(owner = "client!amk", name = "q", descriptor = "()V")
	public void method15601() {
		this.anInt2379 = Math.min(Math.max(this.anInt2379 * 960141055, 5), 300) * -88839937;
	}

	@OriginalMember(owner = "client!amk", name = "d", descriptor = "(I)V")
	@Override
	void method16558(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amk", name = "s", descriptor = "(I)I")
	public int method15602(@OriginalArg(0) int arg0) {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amk", name = "z", descriptor = "(I)I")
	@Override
	int method16561(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!amk", name = "c", descriptor = "(I)V")
	@Override
	void method16563(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amk", name = "x", descriptor = "()I")
	public int method15603() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amk", name = "b", descriptor = "()I")
	public int method15604() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amk", name = "h", descriptor = "()I")
	public int method15605() {
		return this.anInt2379 * 960141055;
	}
}
