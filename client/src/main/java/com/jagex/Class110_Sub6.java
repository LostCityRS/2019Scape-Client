package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!agb")
public class Class110_Sub6 extends Class110 {

	@OriginalMember(owner = "client!agb", name = "n", descriptor = "I")
	final int anInt895;

	@OriginalMember(owner = "client!agb", name = "m", descriptor = "I")
	final int anInt896;

	@OriginalMember(owner = "client!agb", name = "<init>", descriptor = "(Lclient!alw;)V", line = 11)
	Class110_Sub6(@OriginalArg(0) Packet arg0) {
		super(arg0);
		this.anInt895 = arg0.g2(-1434290800) * 204541157;
		this.anInt896 = arg0.g1((short) 16384) * 1465367167;
	}

	@OriginalMember(owner = "client!agb", name = "n", descriptor = "(I)V", line = 17)
	@Override
	public void method20149(@OriginalArg(0) int arg0) {
		Class274.aClass258_1.method26118(this.anInt895 * 1457115373, 1665204116);
	}

	@OriginalMember(owner = "client!agb", name = "f", descriptor = "()V", line = 17)
	@Override
	public void method20150() {
		Class274.aClass258_1.method26118(this.anInt895 * 1457115373, -207516943);
	}

	@OriginalMember(owner = "client!agb", name = "w", descriptor = "()Z", line = 21)
	@Override
	boolean method20142() {
		Class274.aClass258_1.method26103(this.anInt895 * 1457115373, this.anInt896 * -1540749953, -1541526814);
		return true;
	}

	@OriginalMember(owner = "client!agb", name = "k", descriptor = "(I)Z", line = 21)
	@Override
	boolean method20141(@OriginalArg(0) int arg0) {
		Class274.aClass258_1.method26103(this.anInt895 * 1457115373, this.anInt896 * -1540749953, -1997025870);
		return true;
	}

	@OriginalMember(owner = "client!agb", name = "l", descriptor = "()Z", line = 21)
	@Override
	boolean method20143() {
		Class274.aClass258_1.method26103(this.anInt895 * 1457115373, this.anInt896 * -1540749953, -1423012219);
		return true;
	}

	@OriginalMember(owner = "client!agb", name = "bn", descriptor = "(IB)Z", line = 1410)
	static boolean method7672(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		if (arg0 == 9 || arg0 == 10 || arg0 == 11 || arg0 == 12 || arg0 == 13 || arg0 == 1003) {
			return true;
		} else {
			return arg0 == 8;
		}
	}
}
