package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aiv")
public class Class137_Sub2 extends Class137 {

	@OriginalMember(owner = "client!aiv", name = "r", descriptor = "I")
	int anInt2891;

	@OriginalMember(owner = "client!aiv", name = "x", descriptor = "I")
	int anInt2893;

	@OriginalMember(owner = "client!aiv", name = "w", descriptor = "I")
	int anInt2894;

	@OriginalMember(owner = "client!aiv", name = "s", descriptor = "[B")
	byte[] aByteArray54;

	@OriginalMember(owner = "client!aiv", name = "q", descriptor = "I")
	int anInt2895;

	@OriginalMember(owner = "client!aiv", name = "h", descriptor = "I")
	final int anInt2897;

	@OriginalMember(owner = "client!aiv", name = "d", descriptor = "I")
	final int anInt2896;

	@OriginalMember(owner = "client!aiv", name = "z", descriptor = "I")
	final int anInt2898;

	@OriginalMember(owner = "client!aiv", name = "k", descriptor = "I")
	int anInt2892;

	@OriginalMember(owner = "client!aiv", name = "<init>", descriptor = "(IIIIIFFF)V")
	Class137_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt2897 = (int) (arg7 * 4096.0F);
		this.anInt2896 = (int) (arg6 * 4096.0F);
		this.anInt2892 = this.anInt2898 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!aiv", name = "f", descriptor = "()V")
	@Override
	final void method20595() {
		this.anInt2891 = 0;
		this.anInt2895 = 0;
	}

	@OriginalMember(owner = "client!aiv", name = "s", descriptor = "()V")
	@Override
	final void method20605() {
		this.anInt2892 = this.anInt2898;
		this.anInt2895 >>= 0x4;
		if (this.anInt2895 < 0) {
			this.anInt2895 = 0;
		} else if (this.anInt2895 > 255) {
			this.anInt2895 = 255;
		}
		this.method20580(this.anInt2891++, (byte) this.anInt2895);
		this.anInt2895 = 0;
	}

	@OriginalMember(owner = "client!aiv", name = "u", descriptor = "(II)V")
	@Override
	final void method20597(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 0) {
			this.anInt2894 = this.anInt2896 - (arg1 < 0 ? -arg1 : arg1);
			this.anInt2894 = this.anInt2894 * this.anInt2894 >> 12;
			this.anInt2893 = 4096;
			this.anInt2895 = this.anInt2894;
			return;
		}
		this.anInt2893 = this.anInt2894 * this.anInt2897 >> 12;
		if (this.anInt2893 < 0) {
			this.anInt2893 = 0;
		} else if (this.anInt2893 > 4096) {
			this.anInt2893 = 4096;
		}
		this.anInt2894 = this.anInt2896 - (arg1 < 0 ? -arg1 : arg1);
		this.anInt2894 = this.anInt2894 * this.anInt2894 >> 12;
		this.anInt2894 = this.anInt2894 * this.anInt2893 >> 12;
		this.anInt2895 += this.anInt2894 * this.anInt2892 >> 12;
		this.anInt2892 = this.anInt2892 * this.anInt2898 >> 12;
	}

	@OriginalMember(owner = "client!aiv", name = "h", descriptor = "(II)V")
	@Override
	final void method20602(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 0) {
			this.anInt2894 = this.anInt2896 - (arg1 < 0 ? -arg1 : arg1);
			this.anInt2894 = this.anInt2894 * this.anInt2894 >> 12;
			this.anInt2893 = 4096;
			this.anInt2895 = this.anInt2894;
			return;
		}
		this.anInt2893 = this.anInt2894 * this.anInt2897 >> 12;
		if (this.anInt2893 < 0) {
			this.anInt2893 = 0;
		} else if (this.anInt2893 > 4096) {
			this.anInt2893 = 4096;
		}
		this.anInt2894 = this.anInt2896 - (arg1 < 0 ? -arg1 : arg1);
		this.anInt2894 = this.anInt2894 * this.anInt2894 >> 12;
		this.anInt2894 = this.anInt2894 * this.anInt2893 >> 12;
		this.anInt2895 += this.anInt2894 * this.anInt2892 >> 12;
		this.anInt2892 = this.anInt2892 * this.anInt2898 >> 12;
	}

	@OriginalMember(owner = "client!aiv", name = "j", descriptor = "()V")
	@Override
	final void method20603() {
		this.anInt2891 = 0;
		this.anInt2895 = 0;
	}

	@OriginalMember(owner = "client!aiv", name = "aq", descriptor = "(IB)V")
	void method20579(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray54[arg0] = arg1;
	}

	@OriginalMember(owner = "client!aiv", name = "e", descriptor = "()V")
	@Override
	final void method20596() {
		this.anInt2892 = this.anInt2898;
		this.anInt2895 >>= 0x4;
		if (this.anInt2895 < 0) {
			this.anInt2895 = 0;
		} else if (this.anInt2895 > 255) {
			this.anInt2895 = 255;
		}
		this.method20580(this.anInt2891++, (byte) this.anInt2895);
		this.anInt2895 = 0;
	}

	@OriginalMember(owner = "client!aiv", name = "a", descriptor = "()V")
	@Override
	final void method20604() {
		this.anInt2891 = 0;
		this.anInt2895 = 0;
	}

	@OriginalMember(owner = "client!aiv", name = "ai", descriptor = "(IB)V")
	void method20580(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray54[arg0] = arg1;
	}

	@OriginalMember(owner = "client!aiv", name = "k", descriptor = "()V")
	@Override
	final void method20606() {
		this.anInt2892 = this.anInt2898;
		this.anInt2895 >>= 0x4;
		if (this.anInt2895 < 0) {
			this.anInt2895 = 0;
		} else if (this.anInt2895 > 255) {
			this.anInt2895 = 255;
		}
		this.method20580(this.anInt2891++, (byte) this.anInt2895);
		this.anInt2895 = 0;
	}

	@OriginalMember(owner = "client!aiv", name = "x", descriptor = "(II)V")
	@Override
	final void method20607(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 0) {
			this.anInt2894 = this.anInt2896 - (arg1 < 0 ? -arg1 : arg1);
			this.anInt2894 = this.anInt2894 * this.anInt2894 >> 12;
			this.anInt2893 = 4096;
			this.anInt2895 = this.anInt2894;
			return;
		}
		this.anInt2893 = this.anInt2894 * this.anInt2897 >> 12;
		if (this.anInt2893 < 0) {
			this.anInt2893 = 0;
		} else if (this.anInt2893 > 4096) {
			this.anInt2893 = 4096;
		}
		this.anInt2894 = this.anInt2896 - (arg1 < 0 ? -arg1 : arg1);
		this.anInt2894 = this.anInt2894 * this.anInt2894 >> 12;
		this.anInt2894 = this.anInt2894 * this.anInt2893 >> 12;
		this.anInt2895 += this.anInt2894 * this.anInt2892 >> 12;
		this.anInt2892 = this.anInt2892 * this.anInt2898 >> 12;
	}

	@OriginalMember(owner = "client!aiv", name = "w", descriptor = "(II)V")
	@Override
	final void method20617(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 0) {
			this.anInt2894 = this.anInt2896 - (arg1 < 0 ? -arg1 : arg1);
			this.anInt2894 = this.anInt2894 * this.anInt2894 >> 12;
			this.anInt2893 = 4096;
			this.anInt2895 = this.anInt2894;
			return;
		}
		this.anInt2893 = this.anInt2894 * this.anInt2897 >> 12;
		if (this.anInt2893 < 0) {
			this.anInt2893 = 0;
		} else if (this.anInt2893 > 4096) {
			this.anInt2893 = 4096;
		}
		this.anInt2894 = this.anInt2896 - (arg1 < 0 ? -arg1 : arg1);
		this.anInt2894 = this.anInt2894 * this.anInt2894 >> 12;
		this.anInt2894 = this.anInt2894 * this.anInt2893 >> 12;
		this.anInt2895 += this.anInt2894 * this.anInt2892 >> 12;
		this.anInt2892 = this.anInt2892 * this.anInt2898 >> 12;
	}

	@OriginalMember(owner = "client!aiv", name = "r", descriptor = "(II)V")
	@Override
	final void method20611(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 0) {
			this.anInt2894 = this.anInt2896 - (arg1 < 0 ? -arg1 : arg1);
			this.anInt2894 = this.anInt2894 * this.anInt2894 >> 12;
			this.anInt2893 = 4096;
			this.anInt2895 = this.anInt2894;
			return;
		}
		this.anInt2893 = this.anInt2894 * this.anInt2897 >> 12;
		if (this.anInt2893 < 0) {
			this.anInt2893 = 0;
		} else if (this.anInt2893 > 4096) {
			this.anInt2893 = 4096;
		}
		this.anInt2894 = this.anInt2896 - (arg1 < 0 ? -arg1 : arg1);
		this.anInt2894 = this.anInt2894 * this.anInt2894 >> 12;
		this.anInt2894 = this.anInt2894 * this.anInt2893 >> 12;
		this.anInt2895 += this.anInt2894 * this.anInt2892 >> 12;
		this.anInt2892 = this.anInt2892 * this.anInt2898 >> 12;
	}

	@OriginalMember(owner = "client!aiv", name = "q", descriptor = "(II)V")
	@Override
	final void method20609(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 0) {
			this.anInt2894 = this.anInt2896 - (arg1 < 0 ? -arg1 : arg1);
			this.anInt2894 = this.anInt2894 * this.anInt2894 >> 12;
			this.anInt2893 = 4096;
			this.anInt2895 = this.anInt2894;
			return;
		}
		this.anInt2893 = this.anInt2894 * this.anInt2897 >> 12;
		if (this.anInt2893 < 0) {
			this.anInt2893 = 0;
		} else if (this.anInt2893 > 4096) {
			this.anInt2893 = 4096;
		}
		this.anInt2894 = this.anInt2896 - (arg1 < 0 ? -arg1 : arg1);
		this.anInt2894 = this.anInt2894 * this.anInt2894 >> 12;
		this.anInt2894 = this.anInt2894 * this.anInt2893 >> 12;
		this.anInt2895 += this.anInt2894 * this.anInt2892 >> 12;
		this.anInt2892 = this.anInt2892 * this.anInt2898 >> 12;
	}
}
