package com.jagex;

import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!akn")
public class Class93_Sub24 extends Class93 {

	@OriginalMember(owner = "client!akn", name = "r", descriptor = "Lclient!jaclib/memory/Stream;")
	Stream aStream1;

	@OriginalMember(owner = "client!akn", name = "z", descriptor = "Lclient!bp;")
	Class193 aClass193_13;

	@OriginalMember(owner = "client!akn", name = "c", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	NativeHeapBuffer aNativeHeapBuffer4;

	@OriginalMember(owner = "client!akn", name = "f", descriptor = "Lclient!aek;")
	final Class99_Sub2 aClass99_Sub2_2;

	@OriginalMember(owner = "client!akn", name = "k", descriptor = "Lclient!afa;")
	final Class104_Sub1 aClass104_Sub1_30;

	@OriginalMember(owner = "client!akn", name = "w", descriptor = "I")
	final int anInt1580;

	@OriginalMember(owner = "client!akn", name = "l", descriptor = "F")
	final float aFloat149;

	@OriginalMember(owner = "client!akn", name = "u", descriptor = "Lclient!dy;")
	final Class237 aClass237_4;

	@OriginalMember(owner = "client!akn", name = "d", descriptor = "[I")
	int[] anIntArray178;

	@OriginalMember(owner = "client!akn", name = "p", descriptor = "Lclient!aeo;")
	Class101_Sub1 aClass101_Sub1_1;

	@OriginalMember(owner = "client!akn", name = "<init>", descriptor = "(Lclient!aek;IILclient!dy;)V", line = 25)
	Class93_Sub24(@OriginalArg(0) Class99_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class237 arg3) {
		this.aClass99_Sub2_2 = arg0;
		this.aClass104_Sub1_30 = this.aClass99_Sub2_2.aClass104_Sub1_12;
		this.anInt1580 = arg1;
		this.aFloat149 = arg2;
		this.aClass237_4 = arg3;
		this.anIntArray178 = new int[this.aClass99_Sub2_2.anInt414 * -1667858293 * this.aClass99_Sub2_2.anInt413 * -143202029];
		this.aClass101_Sub1_1 = new Class101_Sub1(this.aClass104_Sub1_30, 5123, null, 1);
	}

	@OriginalMember(owner = "client!akn", name = "e", descriptor = "(I)V", line = 36)
	void method13758(@OriginalArg(0) int arg0) {
		this.aNativeHeapBuffer4 = this.aClass104_Sub1_30.aNativeHeap1.n(arg0 * 4, true);
		this.aStream1 = new Stream(this.aNativeHeapBuffer4);
	}

	@OriginalMember(owner = "client!akn", name = "n", descriptor = "(I)V", line = 41)
	void method13759(@OriginalArg(0) int arg0) {
		this.aStream1.m(arg0 * 4 + 3);
		this.aStream1.k(-1);
	}

	@OriginalMember(owner = "client!akn", name = "l", descriptor = "(I)V", line = 41)
	void method13760(@OriginalArg(0) int arg0) {
		this.aStream1.m(arg0 * 4 + 3);
		this.aStream1.k(-1);
	}

	@OriginalMember(owner = "client!akn", name = "m", descriptor = "(III)V", line = 46)
	void method13761(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray178[arg1 * this.aClass99_Sub2_2.anInt414 * -1667858293 + arg0] |= 0x1 << arg2;
	}

	@OriginalMember(owner = "client!akn", name = "u", descriptor = "(III)V", line = 46)
	void method13762(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray178[arg1 * this.aClass99_Sub2_2.anInt414 * -1667858293 + arg0] |= 0x1 << arg2;
	}

	@OriginalMember(owner = "client!akn", name = "z", descriptor = "(III)V", line = 46)
	void method13763(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray178[arg1 * this.aClass99_Sub2_2.anInt414 * -1667858293 + arg0] |= 0x1 << arg2;
	}

	@OriginalMember(owner = "client!akn", name = "p", descriptor = "(III)V", line = 46)
	void method13764(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray178[arg1 * this.aClass99_Sub2_2.anInt414 * -1667858293 + arg0] |= 0x1 << arg2;
	}

	@OriginalMember(owner = "client!akn", name = "d", descriptor = "(III)V", line = 46)
	void method13765(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray178[arg1 * this.aClass99_Sub2_2.anInt414 * -1667858293 + arg0] |= 0x1 << arg2;
	}

	@OriginalMember(owner = "client!akn", name = "k", descriptor = "(IIIF)V", line = 50)
	void method13766(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3) {
		@Pc(16) int local16;
		@Pc(26) int local26;
		if (this.anInt1580 != -1) {
			@Pc(11) Class235 local11 = this.aClass104_Sub1_30.aClass225_6.method25597(this.anInt1580, -1888014578);
			local16 = local11.aByte123 & 0xFF;
			@Pc(49) int local49;
			if (local16 != 0 && local11.aByte114 != 4) {
				if (arg2 < 0) {
					local26 = 0;
				} else if (arg2 > 127) {
					local26 = 16777215;
				} else {
					local26 = arg2 * 131586;
				}
				if (local16 == 256) {
					arg1 = local26;
				} else {
					local49 = 256 - local16;
					arg1 = ((local26 & 0xFF00FF) * local16 + (arg1 & 0xFF00FF) * local49 & 0xFF00FF00) + ((local26 & 0xFF00) * local16 + (arg1 & 0xFF00) * local49 & 0xFF0000) >> 8;
				}
			}
			local26 = local11.aByte122 & 0xFF;
			if (local26 != 0) {
				local26 += 256;
				@Pc(95) int local95 = (arg1 >> 16 & 0xFF) * local26;
				if (local95 > 65535) {
					local95 = 65535;
				}
				local49 = (arg1 >> 8 & 0xFF) * local26;
				if (local49 > 65535) {
					local49 = 65535;
				}
				@Pc(119) int local119 = (arg1 & 0xFF) * local26;
				if (local119 > 65535) {
					local119 = 65535;
				}
				arg1 = ((local95 & 0xFF00) << 8) + (local49 & 0xFF00) + (local119 >> 8);
			}
		}
		if (arg3 != 1.0F) {
			@Pc(148) int local148 = arg1 >> 16 & 0xFF;
			local16 = arg1 >> 8 & 0xFF;
			local26 = arg1 & 0xFF;
			local148 = (int) ((float) local148 * arg3);
			if (local148 < 0) {
				local148 = 0;
			} else if (local148 > 255) {
				local148 = 255;
			}
			local16 = (int) ((float) local16 * arg3);
			if (local16 < 0) {
				local16 = 0;
			} else if (local16 > 255) {
				local16 = 255;
			}
			local26 = (int) ((float) local26 * arg3);
			if (local26 < 0) {
				local26 = 0;
			} else if (local26 > 255) {
				local26 = 255;
			}
			arg1 = local148 << 16 | local16 << 8 | local26;
		}
		this.aStream1.m(arg0 * 4);
		this.aStream1.k((byte) (arg1 >> 16));
		this.aStream1.k((byte) (arg1 >> 8));
		this.aStream1.k((byte) arg1);
	}

	@OriginalMember(owner = "client!akn", name = "c", descriptor = "(IIIF)V", line = 50)
	void method13767(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3) {
		@Pc(16) int local16;
		@Pc(26) int local26;
		if (this.anInt1580 != -1) {
			@Pc(11) Class235 local11 = this.aClass104_Sub1_30.aClass225_6.method25597(this.anInt1580, 1570890700);
			local16 = local11.aByte123 & 0xFF;
			@Pc(49) int local49;
			if (local16 != 0 && local11.aByte114 != 4) {
				if (arg2 < 0) {
					local26 = 0;
				} else if (arg2 > 127) {
					local26 = 16777215;
				} else {
					local26 = arg2 * 131586;
				}
				if (local16 == 256) {
					arg1 = local26;
				} else {
					local49 = 256 - local16;
					arg1 = ((local26 & 0xFF00FF) * local16 + (arg1 & 0xFF00FF) * local49 & 0xFF00FF00) + ((local26 & 0xFF00) * local16 + (arg1 & 0xFF00) * local49 & 0xFF0000) >> 8;
				}
			}
			local26 = local11.aByte122 & 0xFF;
			if (local26 != 0) {
				local26 += 256;
				@Pc(95) int local95 = (arg1 >> 16 & 0xFF) * local26;
				if (local95 > 65535) {
					local95 = 65535;
				}
				local49 = (arg1 >> 8 & 0xFF) * local26;
				if (local49 > 65535) {
					local49 = 65535;
				}
				@Pc(119) int local119 = (arg1 & 0xFF) * local26;
				if (local119 > 65535) {
					local119 = 65535;
				}
				arg1 = ((local95 & 0xFF00) << 8) + (local49 & 0xFF00) + (local119 >> 8);
			}
		}
		if (arg3 != 1.0F) {
			@Pc(148) int local148 = arg1 >> 16 & 0xFF;
			local16 = arg1 >> 8 & 0xFF;
			local26 = arg1 & 0xFF;
			local148 = (int) ((float) local148 * arg3);
			if (local148 < 0) {
				local148 = 0;
			} else if (local148 > 255) {
				local148 = 255;
			}
			local16 = (int) ((float) local16 * arg3);
			if (local16 < 0) {
				local16 = 0;
			} else if (local16 > 255) {
				local16 = 255;
			}
			local26 = (int) ((float) local26 * arg3);
			if (local26 < 0) {
				local26 = 0;
			} else if (local26 > 255) {
				local26 = 255;
			}
			arg1 = local148 << 16 | local16 << 8 | local26;
		}
		this.aStream1.m(arg0 * 4);
		this.aStream1.k((byte) (arg1 >> 16));
		this.aStream1.k((byte) (arg1 >> 8));
		this.aStream1.k((byte) arg1);
	}

	@OriginalMember(owner = "client!akn", name = "r", descriptor = "(IIIF)V", line = 50)
	void method13768(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3) {
		@Pc(16) int local16;
		@Pc(26) int local26;
		if (this.anInt1580 != -1) {
			@Pc(11) Class235 local11 = this.aClass104_Sub1_30.aClass225_6.method25597(this.anInt1580, 1561685544);
			local16 = local11.aByte123 & 0xFF;
			@Pc(49) int local49;
			if (local16 != 0 && local11.aByte114 != 4) {
				if (arg2 < 0) {
					local26 = 0;
				} else if (arg2 > 127) {
					local26 = 16777215;
				} else {
					local26 = arg2 * 131586;
				}
				if (local16 == 256) {
					arg1 = local26;
				} else {
					local49 = 256 - local16;
					arg1 = ((local26 & 0xFF00FF) * local16 + (arg1 & 0xFF00FF) * local49 & 0xFF00FF00) + ((local26 & 0xFF00) * local16 + (arg1 & 0xFF00) * local49 & 0xFF0000) >> 8;
				}
			}
			local26 = local11.aByte122 & 0xFF;
			if (local26 != 0) {
				local26 += 256;
				@Pc(95) int local95 = (arg1 >> 16 & 0xFF) * local26;
				if (local95 > 65535) {
					local95 = 65535;
				}
				local49 = (arg1 >> 8 & 0xFF) * local26;
				if (local49 > 65535) {
					local49 = 65535;
				}
				@Pc(119) int local119 = (arg1 & 0xFF) * local26;
				if (local119 > 65535) {
					local119 = 65535;
				}
				arg1 = ((local95 & 0xFF00) << 8) + (local49 & 0xFF00) + (local119 >> 8);
			}
		}
		if (arg3 != 1.0F) {
			@Pc(148) int local148 = arg1 >> 16 & 0xFF;
			local16 = arg1 >> 8 & 0xFF;
			local26 = arg1 & 0xFF;
			local148 = (int) ((float) local148 * arg3);
			if (local148 < 0) {
				local148 = 0;
			} else if (local148 > 255) {
				local148 = 255;
			}
			local16 = (int) ((float) local16 * arg3);
			if (local16 < 0) {
				local16 = 0;
			} else if (local16 > 255) {
				local16 = 255;
			}
			local26 = (int) ((float) local26 * arg3);
			if (local26 < 0) {
				local26 = 0;
			} else if (local26 > 255) {
				local26 = 255;
			}
			arg1 = local148 << 16 | local16 << 8 | local26;
		}
		this.aStream1.m(arg0 * 4);
		this.aStream1.k((byte) (arg1 >> 16));
		this.aStream1.k((byte) (arg1 >> 8));
		this.aStream1.k((byte) arg1);
	}

	@OriginalMember(owner = "client!akn", name = "h", descriptor = "(I)V", line = 99)
	void method13769(@OriginalArg(0) int arg0) {
		this.aStream1.l();
		@Pc(13) Interface14 local13 = this.aClass104_Sub1_30.method3848(4, this.aNativeHeapBuffer4, arg0 * 4, false);
		if (local13 instanceof Class98_Sub2) {
			this.aNativeHeapBuffer4.d();
		}
		this.aClass193_13 = new Class193(local13, 5121, 4, 0);
		this.aNativeHeapBuffer4 = null;
		this.aStream1 = null;
	}

	@OriginalMember(owner = "client!akn", name = "v", descriptor = "(I)V", line = 99)
	void method13770(@OriginalArg(0) int arg0) {
		this.aStream1.l();
		@Pc(13) Interface14 local13 = this.aClass104_Sub1_30.method3848(4, this.aNativeHeapBuffer4, arg0 * 4, false);
		if (local13 instanceof Class98_Sub2) {
			this.aNativeHeapBuffer4.d();
		}
		this.aClass193_13 = new Class193(local13, 5121, 4, 0);
		this.aNativeHeapBuffer4 = null;
		this.aStream1 = null;
	}

	@OriginalMember(owner = "client!akn", name = "x", descriptor = "(I)V", line = 99)
	void method13771(@OriginalArg(0) int arg0) {
		this.aStream1.l();
		@Pc(13) Interface14 local13 = this.aClass104_Sub1_30.method3848(4, this.aNativeHeapBuffer4, arg0 * 4, false);
		if (local13 instanceof Class98_Sub2) {
			this.aNativeHeapBuffer4.d();
		}
		this.aClass193_13 = new Class193(local13, 5121, 4, 0);
		this.aNativeHeapBuffer4 = null;
		this.aStream1 = null;
	}

	@OriginalMember(owner = "client!akn", name = "a", descriptor = "(I)V", line = 99)
	void method13772(@OriginalArg(0) int arg0) {
		this.aStream1.l();
		@Pc(13) Interface14 local13 = this.aClass104_Sub1_30.method3848(4, this.aNativeHeapBuffer4, arg0 * 4, false);
		if (local13 instanceof Class98_Sub2) {
			this.aNativeHeapBuffer4.d();
		}
		this.aClass193_13 = new Class193(local13, 5121, 4, 0);
		this.aNativeHeapBuffer4 = null;
		this.aStream1 = null;
	}

	@OriginalMember(owner = "client!akn", name = "y", descriptor = "(I)V", line = 99)
	void method13773(@OriginalArg(0) int arg0) {
		this.aStream1.l();
		@Pc(13) Interface14 local13 = this.aClass104_Sub1_30.method3848(4, this.aNativeHeapBuffer4, arg0 * 4, false);
		if (local13 instanceof Class98_Sub2) {
			this.aNativeHeapBuffer4.d();
		}
		this.aClass193_13 = new Class193(local13, 5121, 4, 0);
		this.aNativeHeapBuffer4 = null;
		this.aStream1 = null;
	}

	@OriginalMember(owner = "client!akn", name = "f", descriptor = "(I)V", line = 99)
	void method13774(@OriginalArg(0) int arg0) {
		this.aStream1.l();
		@Pc(13) Interface14 local13 = this.aClass104_Sub1_30.method3848(4, this.aNativeHeapBuffer4, arg0 * 4, false);
		if (local13 instanceof Class98_Sub2) {
			this.aNativeHeapBuffer4.d();
		}
		this.aClass193_13 = new Class193(local13, 5121, 4, 0);
		this.aNativeHeapBuffer4 = null;
		this.aStream1 = null;
	}

	@OriginalMember(owner = "client!akn", name = "i", descriptor = "([II)V", line = 110)
	void method13775(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(5) Class93_Sub41_Sub1 local5 = this.aClass104_Sub1_30.aClass93_Sub41_Sub1_1;
		local5.anInt3070 = 0;
		@Pc(27) short[] local27;
		@Pc(21) int local21;
		@Pc(32) int local32;
		@Pc(14) int local14;
		@Pc(38) int local38;
		@Pc(40) int local40;
		if (this.aClass104_Sub1_30.aBoolean106) {
			for (local14 = 0; local14 < arg1; local14++) {
				local21 = arg0[local14];
				local27 = this.aClass99_Sub2_2.aShortArrayArray2[local21];
				local32 = this.anIntArray178[local21];
				if (local32 != 0 && local27 != null) {
					local38 = 0;
					local40 = 0;
					while (local40 < local27.length) {
						if ((local32 & 0x1 << local38++) == 0) {
							local40 += 3;
						} else {
							local5.method22395(local27[local40++] & 0xFFFF, 2142644047);
							local1++;
							local5.method22395(local27[local40++] & 0xFFFF, 2146100159);
							local1++;
							local5.method22395(local27[local40++] & 0xFFFF, 2138598858);
							local1++;
						}
					}
				}
			}
		} else {
			for (local14 = 0; local14 < arg1; local14++) {
				local21 = arg0[local14];
				local27 = this.aClass99_Sub2_2.aShortArrayArray2[local21];
				local32 = this.anIntArray178[local21];
				if (local32 != 0 && local27 != null) {
					local38 = 0;
					local40 = 0;
					while (local40 < local27.length) {
						if ((local32 & 0x1 << local38++) == 0) {
							local40 += 3;
						} else {
							local5.method22398(local27[local40++] & 0xFFFF, -1436042249);
							local1++;
							local5.method22398(local27[local40++] & 0xFFFF, -1572075607);
							local1++;
							local5.method22398(local27[local40++] & 0xFFFF, -1950477983);
							local1++;
						}
					}
				}
			}
		}
		if (local1 <= 0) {
			return;
		}
		this.aClass101_Sub1_1.method2561(5123, local5.aByteArray58, local5.anInt3070 * 212851357);
		this.aClass104_Sub1_30.method3855(this.aClass99_Sub2_2.aClass193_1, this.aClass99_Sub2_2.aClass193_4, this.aClass193_13, this.aClass99_Sub2_2.aClass193_3);
		this.aClass104_Sub1_30.method3880(this.anInt1580, (this.aClass99_Sub2_2.anInt371 & 0x7) != 0, (this.aClass99_Sub2_2.anInt371 & 0x8) != 0);
		if (this.aClass104_Sub1_30.aBoolean72) {
			this.aClass104_Sub1_30.method20625(Integer.MAX_VALUE, this.aClass237_4);
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(1.0F / this.aFloat149, 1.0F / this.aFloat149, 1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass104_Sub1_30.method3855(this.aClass99_Sub2_2.aClass193_1, this.aClass99_Sub2_2.aClass193_4, this.aClass193_13, this.aClass99_Sub2_2.aClass193_3);
		this.aClass104_Sub1_30.method3862(this.aClass101_Sub1_1, 4, 0, local1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!akn", name = "w", descriptor = "([II)V", line = 110)
	void method13776(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(5) Class93_Sub41_Sub1 local5 = this.aClass104_Sub1_30.aClass93_Sub41_Sub1_1;
		local5.anInt3070 = 0;
		@Pc(27) short[] local27;
		@Pc(21) int local21;
		@Pc(32) int local32;
		@Pc(14) int local14;
		@Pc(38) int local38;
		@Pc(40) int local40;
		if (this.aClass104_Sub1_30.aBoolean106) {
			for (local14 = 0; local14 < arg1; local14++) {
				local21 = arg0[local14];
				local27 = this.aClass99_Sub2_2.aShortArrayArray2[local21];
				local32 = this.anIntArray178[local21];
				if (local32 != 0 && local27 != null) {
					local38 = 0;
					local40 = 0;
					while (local40 < local27.length) {
						if ((local32 & 0x1 << local38++) == 0) {
							local40 += 3;
						} else {
							local5.method22395(local27[local40++] & 0xFFFF, 2141581615);
							local1++;
							local5.method22395(local27[local40++] & 0xFFFF, 2142360938);
							local1++;
							local5.method22395(local27[local40++] & 0xFFFF, 2134228941);
							local1++;
						}
					}
				}
			}
		} else {
			for (local14 = 0; local14 < arg1; local14++) {
				local21 = arg0[local14];
				local27 = this.aClass99_Sub2_2.aShortArrayArray2[local21];
				local32 = this.anIntArray178[local21];
				if (local32 != 0 && local27 != null) {
					local38 = 0;
					local40 = 0;
					while (local40 < local27.length) {
						if ((local32 & 0x1 << local38++) == 0) {
							local40 += 3;
						} else {
							local5.method22398(local27[local40++] & 0xFFFF, -1709502073);
							local1++;
							local5.method22398(local27[local40++] & 0xFFFF, -1911567);
							local1++;
							local5.method22398(local27[local40++] & 0xFFFF, -1021260162);
							local1++;
						}
					}
				}
			}
		}
		if (local1 <= 0) {
			return;
		}
		this.aClass101_Sub1_1.method2561(5123, local5.aByteArray58, local5.anInt3070 * 212851357);
		this.aClass104_Sub1_30.method3855(this.aClass99_Sub2_2.aClass193_1, this.aClass99_Sub2_2.aClass193_4, this.aClass193_13, this.aClass99_Sub2_2.aClass193_3);
		this.aClass104_Sub1_30.method3880(this.anInt1580, (this.aClass99_Sub2_2.anInt371 & 0x7) != 0, (this.aClass99_Sub2_2.anInt371 & 0x8) != 0);
		if (this.aClass104_Sub1_30.aBoolean72) {
			this.aClass104_Sub1_30.method20625(Integer.MAX_VALUE, this.aClass237_4);
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(1.0F / this.aFloat149, 1.0F / this.aFloat149, 1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass104_Sub1_30.method3855(this.aClass99_Sub2_2.aClass193_1, this.aClass99_Sub2_2.aClass193_4, this.aClass193_13, this.aClass99_Sub2_2.aClass193_3);
		this.aClass104_Sub1_30.method3862(this.aClass101_Sub1_1, 4, 0, local1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!akn", name = "j", descriptor = "([II)V", line = 110)
	void method13777(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(5) Class93_Sub41_Sub1 local5 = this.aClass104_Sub1_30.aClass93_Sub41_Sub1_1;
		local5.anInt3070 = 0;
		@Pc(27) short[] local27;
		@Pc(21) int local21;
		@Pc(32) int local32;
		@Pc(14) int local14;
		@Pc(38) int local38;
		@Pc(40) int local40;
		if (this.aClass104_Sub1_30.aBoolean106) {
			for (local14 = 0; local14 < arg1; local14++) {
				local21 = arg0[local14];
				local27 = this.aClass99_Sub2_2.aShortArrayArray2[local21];
				local32 = this.anIntArray178[local21];
				if (local32 != 0 && local27 != null) {
					local38 = 0;
					local40 = 0;
					while (local40 < local27.length) {
						if ((local32 & 0x1 << local38++) == 0) {
							local40 += 3;
						} else {
							local5.method22395(local27[local40++] & 0xFFFF, 2129126149);
							local1++;
							local5.method22395(local27[local40++] & 0xFFFF, 2143558021);
							local1++;
							local5.method22395(local27[local40++] & 0xFFFF, 2145323368);
							local1++;
						}
					}
				}
			}
		} else {
			for (local14 = 0; local14 < arg1; local14++) {
				local21 = arg0[local14];
				local27 = this.aClass99_Sub2_2.aShortArrayArray2[local21];
				local32 = this.anIntArray178[local21];
				if (local32 != 0 && local27 != null) {
					local38 = 0;
					local40 = 0;
					while (local40 < local27.length) {
						if ((local32 & 0x1 << local38++) == 0) {
							local40 += 3;
						} else {
							local5.method22398(local27[local40++] & 0xFFFF, -1179302735);
							local1++;
							local5.method22398(local27[local40++] & 0xFFFF, -755621991);
							local1++;
							local5.method22398(local27[local40++] & 0xFFFF, -913568354);
							local1++;
						}
					}
				}
			}
		}
		if (local1 <= 0) {
			return;
		}
		this.aClass101_Sub1_1.method2561(5123, local5.aByteArray58, local5.anInt3070 * 212851357);
		this.aClass104_Sub1_30.method3855(this.aClass99_Sub2_2.aClass193_1, this.aClass99_Sub2_2.aClass193_4, this.aClass193_13, this.aClass99_Sub2_2.aClass193_3);
		this.aClass104_Sub1_30.method3880(this.anInt1580, (this.aClass99_Sub2_2.anInt371 & 0x7) != 0, (this.aClass99_Sub2_2.anInt371 & 0x8) != 0);
		if (this.aClass104_Sub1_30.aBoolean72) {
			this.aClass104_Sub1_30.method20625(Integer.MAX_VALUE, this.aClass237_4);
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(1.0F / this.aFloat149, 1.0F / this.aFloat149, 1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass104_Sub1_30.method3855(this.aClass99_Sub2_2.aClass193_1, this.aClass99_Sub2_2.aClass193_4, this.aClass193_13, this.aClass99_Sub2_2.aClass193_3);
		this.aClass104_Sub1_30.method3862(this.aClass101_Sub1_1, 4, 0, local1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!akn", name = "g", descriptor = "([II)V", line = 110)
	void method13778(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(5) Class93_Sub41_Sub1 local5 = this.aClass104_Sub1_30.aClass93_Sub41_Sub1_1;
		local5.anInt3070 = 0;
		@Pc(27) short[] local27;
		@Pc(21) int local21;
		@Pc(32) int local32;
		@Pc(14) int local14;
		@Pc(38) int local38;
		@Pc(40) int local40;
		if (this.aClass104_Sub1_30.aBoolean106) {
			for (local14 = 0; local14 < arg1; local14++) {
				local21 = arg0[local14];
				local27 = this.aClass99_Sub2_2.aShortArrayArray2[local21];
				local32 = this.anIntArray178[local21];
				if (local32 != 0 && local27 != null) {
					local38 = 0;
					local40 = 0;
					while (local40 < local27.length) {
						if ((local32 & 0x1 << local38++) == 0) {
							local40 += 3;
						} else {
							local5.method22395(local27[local40++] & 0xFFFF, 2128652295);
							local1++;
							local5.method22395(local27[local40++] & 0xFFFF, 2144062975);
							local1++;
							local5.method22395(local27[local40++] & 0xFFFF, 2144122771);
							local1++;
						}
					}
				}
			}
		} else {
			for (local14 = 0; local14 < arg1; local14++) {
				local21 = arg0[local14];
				local27 = this.aClass99_Sub2_2.aShortArrayArray2[local21];
				local32 = this.anIntArray178[local21];
				if (local32 != 0 && local27 != null) {
					local38 = 0;
					local40 = 0;
					while (local40 < local27.length) {
						if ((local32 & 0x1 << local38++) == 0) {
							local40 += 3;
						} else {
							local5.method22398(local27[local40++] & 0xFFFF, -784761081);
							local1++;
							local5.method22398(local27[local40++] & 0xFFFF, -1977702818);
							local1++;
							local5.method22398(local27[local40++] & 0xFFFF, -2122330677);
							local1++;
						}
					}
				}
			}
		}
		if (local1 <= 0) {
			return;
		}
		this.aClass101_Sub1_1.method2561(5123, local5.aByteArray58, local5.anInt3070 * 212851357);
		this.aClass104_Sub1_30.method3855(this.aClass99_Sub2_2.aClass193_1, this.aClass99_Sub2_2.aClass193_4, this.aClass193_13, this.aClass99_Sub2_2.aClass193_3);
		this.aClass104_Sub1_30.method3880(this.anInt1580, (this.aClass99_Sub2_2.anInt371 & 0x7) != 0, (this.aClass99_Sub2_2.anInt371 & 0x8) != 0);
		if (this.aClass104_Sub1_30.aBoolean72) {
			this.aClass104_Sub1_30.method20625(Integer.MAX_VALUE, this.aClass237_4);
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(1.0F / this.aFloat149, 1.0F / this.aFloat149, 1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass104_Sub1_30.method3855(this.aClass99_Sub2_2.aClass193_1, this.aClass99_Sub2_2.aClass193_4, this.aClass193_13, this.aClass99_Sub2_2.aClass193_3);
		this.aClass104_Sub1_30.method3862(this.aClass101_Sub1_1, 4, 0, local1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}
}
