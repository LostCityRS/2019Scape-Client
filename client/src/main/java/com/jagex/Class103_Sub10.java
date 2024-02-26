package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!agf")
public final class Class103_Sub10 extends Class103 {

	@OriginalMember(owner = "client!agf", name = "ru", descriptor = "I")
	static int anInt946;

	@OriginalMember(owner = "client!agf", name = "f", descriptor = "I")
	final int anInt945;

	@OriginalMember(owner = "client!agf", name = "e", descriptor = "I")
	final int anInt944;

	@OriginalMember(owner = "client!agf", name = "<init>", descriptor = "(Lclient!ald;)V")
	Class103_Sub10(@OriginalArg(0) Class80_Sub36 arg0) {
		super(arg0);
		this.anInt945 = arg0.method23178((byte) -111) * -1254504383;
		this.anInt944 = arg0.method23362(-292444373) * 1684166699;
	}

	@OriginalMember(owner = "client!agf", name = "u", descriptor = "(I)Z")
	@Override
	boolean method19201(@OriginalArg(0) int arg0) {
		Class490.aClass263_13.method26516(this.anInt945 * -815380543, this.anInt944 * 2080614019, (short) 255);
		return true;
	}

	@OriginalMember(owner = "client!agf", name = "f", descriptor = "(I)V")
	@Override
	public void method19206(@OriginalArg(0) int arg0) {
		Class490.aClass263_13.method26512(this.anInt945 * -815380543, -1428584878);
	}

	@OriginalMember(owner = "client!agf", name = "g", descriptor = "()V")
	@Override
	public void method19202() {
		Class490.aClass263_13.method26512(this.anInt945 * -815380543, -316646535);
	}

	@OriginalMember(owner = "client!agf", name = "l", descriptor = "()V")
	@Override
	public void method19198() {
		Class490.aClass263_13.method26512(this.anInt945 * -815380543, -712175900);
	}

	@OriginalMember(owner = "client!agf", name = "i", descriptor = "()Z")
	@Override
	boolean method19199() {
		Class490.aClass263_13.method26516(this.anInt945 * -815380543, this.anInt944 * 2080614019, (short) 255);
		return true;
	}

	@OriginalMember(owner = "client!agf", name = "m", descriptor = "()Z")
	@Override
	boolean method19204() {
		Class490.aClass263_13.method26516(this.anInt945 * -815380543, this.anInt944 * 2080614019, (short) 255);
		return true;
	}
}
