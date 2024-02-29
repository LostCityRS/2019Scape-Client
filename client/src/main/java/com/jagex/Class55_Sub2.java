package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!apw")
public class Class55_Sub2 extends Class55 {

	@OriginalMember(owner = "client!apw", name = "<init>", descriptor = "(Lclient!zd;Lclient!zt;Lclient!py;Z)V", line = 11)
	public Class55_Sub2(@OriginalArg(0) Class702 arg0, @OriginalArg(1) Class717 arg1, @OriginalArg(2) Class497 arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, Class667.aClass667_67, arg2, new Class343(), arg3);
	}

	@OriginalMember(owner = "client!apw", name = "l", descriptor = "()I", line = 15)
	@Override
	public int method18267() {
		return this.anInt2586 * 1007858977;
	}

	@OriginalMember(owner = "client!apw", name = "f", descriptor = "()I", line = 15)
	@Override
	public int method18263() {
		return this.anInt2586 * 1007858977;
	}

	@OriginalMember(owner = "client!apw", name = "w", descriptor = "()I", line = 15)
	@Override
	public int method18266() {
		return this.anInt2586 * 1007858977;
	}

	@OriginalMember(owner = "client!apw", name = "n", descriptor = "(I)I", line = 15)
	@Override
	public int method18262(@OriginalArg(0) int arg0) {
		return this.anInt2586 * 1007858977;
	}
}
