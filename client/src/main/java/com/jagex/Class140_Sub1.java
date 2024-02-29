package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aie")
public class Class140_Sub1 extends Class140 {

	@OriginalMember(owner = "client!aie", name = "y", descriptor = "I")
	int anInt2862;

	@OriginalMember(owner = "client!aie", name = "s", descriptor = "I")
	int anInt2863;

	@OriginalMember(owner = "client!aie", name = "v", descriptor = "I")
	int anInt2864;

	@OriginalMember(owner = "client!aie", name = "o", descriptor = "I")
	int anInt2865;

	@OriginalMember(owner = "client!aie", name = "c", descriptor = "[B")
	byte[] aByteArray52;

	@OriginalMember(owner = "client!aie", name = "q", descriptor = "I")
	final int anInt2867;

	@OriginalMember(owner = "client!aie", name = "x", descriptor = "I")
	final int anInt2868;

	@OriginalMember(owner = "client!aie", name = "b", descriptor = "I")
	final int anInt2869;

	@OriginalMember(owner = "client!aie", name = "r", descriptor = "I")
	int anInt2866;

	@OriginalMember(owner = "client!aie", name = "<init>", descriptor = "(IIIIIFFF)V", line = 15)
	Class140_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt2867 = (int) (arg7 * 4096.0F);
		this.anInt2868 = (int) (arg6 * 4096.0F);
		this.anInt2866 = this.anInt2869 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!aie", name = "n", descriptor = "()V", line = 22)
	@Override
	void method20404() {
		this.anInt2863 = 0;
		this.anInt2862 = 0;
	}

	@OriginalMember(owner = "client!aie", name = "p", descriptor = "()V", line = 22)
	@Override
	void method20400() {
		this.anInt2863 = 0;
		this.anInt2862 = 0;
	}

	@OriginalMember(owner = "client!aie", name = "d", descriptor = "()V", line = 22)
	@Override
	void method20399() {
		this.anInt2863 = 0;
		this.anInt2862 = 0;
	}

	@OriginalMember(owner = "client!aie", name = "o", descriptor = "(II)V", line = 27)
	@Override
	void method20398(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 0) {
			this.anInt2865 = this.anInt2868 - (arg1 < 0 ? -arg1 : arg1);
			this.anInt2865 = this.anInt2865 * this.anInt2865 >> 12;
			this.anInt2864 = 4096;
			this.anInt2862 = this.anInt2865;
			return;
		}
		this.anInt2864 = this.anInt2865 * this.anInt2867 >> 12;
		if (this.anInt2864 < 0) {
			this.anInt2864 = 0;
		} else if (this.anInt2864 > 4096) {
			this.anInt2864 = 4096;
		}
		this.anInt2865 = this.anInt2868 - (arg1 < 0 ? -arg1 : arg1);
		this.anInt2865 = this.anInt2865 * this.anInt2865 >> 12;
		this.anInt2865 = this.anInt2865 * this.anInt2864 >> 12;
		this.anInt2862 += this.anInt2865 * this.anInt2866 >> 12;
		this.anInt2866 = this.anInt2866 * this.anInt2869 >> 12;
	}

	@OriginalMember(owner = "client!aie", name = "k", descriptor = "(II)V", line = 27)
	@Override
	void method20397(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 0) {
			this.anInt2865 = this.anInt2868 - (arg1 < 0 ? -arg1 : arg1);
			this.anInt2865 = this.anInt2865 * this.anInt2865 >> 12;
			this.anInt2864 = 4096;
			this.anInt2862 = this.anInt2865;
			return;
		}
		this.anInt2864 = this.anInt2865 * this.anInt2867 >> 12;
		if (this.anInt2864 < 0) {
			this.anInt2864 = 0;
		} else if (this.anInt2864 > 4096) {
			this.anInt2864 = 4096;
		}
		this.anInt2865 = this.anInt2868 - (arg1 < 0 ? -arg1 : arg1);
		this.anInt2865 = this.anInt2865 * this.anInt2865 >> 12;
		this.anInt2865 = this.anInt2865 * this.anInt2864 >> 12;
		this.anInt2862 += this.anInt2865 * this.anInt2866 >> 12;
		this.anInt2866 = this.anInt2866 * this.anInt2869 >> 12;
	}

	@OriginalMember(owner = "client!aie", name = "s", descriptor = "(II)V", line = 27)
	@Override
	void method20405(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 0) {
			this.anInt2865 = this.anInt2868 - (arg1 < 0 ? -arg1 : arg1);
			this.anInt2865 = this.anInt2865 * this.anInt2865 >> 12;
			this.anInt2864 = 4096;
			this.anInt2862 = this.anInt2865;
			return;
		}
		this.anInt2864 = this.anInt2865 * this.anInt2867 >> 12;
		if (this.anInt2864 < 0) {
			this.anInt2864 = 0;
		} else if (this.anInt2864 > 4096) {
			this.anInt2864 = 4096;
		}
		this.anInt2865 = this.anInt2868 - (arg1 < 0 ? -arg1 : arg1);
		this.anInt2865 = this.anInt2865 * this.anInt2865 >> 12;
		this.anInt2865 = this.anInt2865 * this.anInt2864 >> 12;
		this.anInt2862 += this.anInt2865 * this.anInt2866 >> 12;
		this.anInt2866 = this.anInt2866 * this.anInt2869 >> 12;
	}

	@OriginalMember(owner = "client!aie", name = "y", descriptor = "(II)V", line = 27)
	@Override
	void method20396(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 0) {
			this.anInt2865 = this.anInt2868 - (arg1 < 0 ? -arg1 : arg1);
			this.anInt2865 = this.anInt2865 * this.anInt2865 >> 12;
			this.anInt2864 = 4096;
			this.anInt2862 = this.anInt2865;
			return;
		}
		this.anInt2864 = this.anInt2865 * this.anInt2867 >> 12;
		if (this.anInt2864 < 0) {
			this.anInt2864 = 0;
		} else if (this.anInt2864 > 4096) {
			this.anInt2864 = 4096;
		}
		this.anInt2865 = this.anInt2868 - (arg1 < 0 ? -arg1 : arg1);
		this.anInt2865 = this.anInt2865 * this.anInt2865 >> 12;
		this.anInt2865 = this.anInt2865 * this.anInt2864 >> 12;
		this.anInt2862 += this.anInt2865 * this.anInt2866 >> 12;
		this.anInt2866 = this.anInt2866 * this.anInt2869 >> 12;
	}

	@OriginalMember(owner = "client!aie", name = "m", descriptor = "()V", line = 46)
	@Override
	void method20401() {
		this.anInt2866 = this.anInt2869;
		this.anInt2862 >>= 0x4;
		if (this.anInt2862 < 0) {
			this.anInt2862 = 0;
		} else if (this.anInt2862 > 255) {
			this.anInt2862 = 255;
		}
		this.method20319(this.anInt2863++, (byte) this.anInt2862);
		this.anInt2862 = 0;
	}

	@OriginalMember(owner = "client!aie", name = "c", descriptor = "()V", line = 46)
	@Override
	void method20402() {
		this.anInt2866 = this.anInt2869;
		this.anInt2862 >>= 0x4;
		if (this.anInt2862 < 0) {
			this.anInt2862 = 0;
		} else if (this.anInt2862 > 255) {
			this.anInt2862 = 255;
		}
		this.method20319(this.anInt2863++, (byte) this.anInt2862);
		this.anInt2862 = 0;
	}

	@OriginalMember(owner = "client!aie", name = "r", descriptor = "()V", line = 46)
	@Override
	void method20403() {
		this.anInt2866 = this.anInt2869;
		this.anInt2862 >>= 0x4;
		if (this.anInt2862 < 0) {
			this.anInt2862 = 0;
		} else if (this.anInt2862 > 255) {
			this.anInt2862 = 255;
		}
		this.method20319(this.anInt2863++, (byte) this.anInt2862);
		this.anInt2862 = 0;
	}

	@OriginalMember(owner = "client!aie", name = "v", descriptor = "()V", line = 46)
	@Override
	void method20406() {
		this.anInt2866 = this.anInt2869;
		this.anInt2862 >>= 0x4;
		if (this.anInt2862 < 0) {
			this.anInt2862 = 0;
		} else if (this.anInt2862 > 255) {
			this.anInt2862 = 255;
		}
		this.method20319(this.anInt2863++, (byte) this.anInt2862);
		this.anInt2862 = 0;
	}

	@OriginalMember(owner = "client!aie", name = "ah", descriptor = "(IB)V", line = 55)
	void method20317(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray52[arg0] = arg1;
	}

	@OriginalMember(owner = "client!aie", name = "t", descriptor = "(IB)V", line = 55)
	void method20318(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray52[arg0] = arg1;
	}

	@OriginalMember(owner = "client!aie", name = "j", descriptor = "(IB)V", line = 55)
	void method20319(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray52[arg0] = arg1;
	}

	@OriginalMember(owner = "client!aie", name = "ae", descriptor = "(IB)V", line = 55)
	void method20320(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray52[arg0] = arg1;
	}

	@OriginalMember(owner = "client!aie", name = "ag", descriptor = "(IB)V", line = 55)
	void method20321(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray52[arg0] = arg1;
	}

	@OriginalMember(owner = "client!aie", name = "al", descriptor = "(IB)V", line = 55)
	void method20322(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray52[arg0] = arg1;
	}
}
