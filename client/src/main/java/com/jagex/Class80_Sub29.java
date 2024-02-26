package com.jagex;

import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aks")
public final class Class80_Sub29 extends Class80 {

	@OriginalMember(owner = "client!aks", name = "o", descriptor = "Lclient!bm;")
	Class189 aClass189_13;

	@OriginalMember(owner = "client!aks", name = "s", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	NativeHeapBuffer aNativeHeapBuffer4;

	@OriginalMember(owner = "client!aks", name = "k", descriptor = "Lclient!jaclib/memory/Stream;")
	Stream aStream1;

	@OriginalMember(owner = "client!aks", name = "l", descriptor = "Lclient!aez;")
	final Class100_Sub3 aClass100_Sub3_2;

	@OriginalMember(owner = "client!aks", name = "u", descriptor = "Lclient!afm;")
	final Class102_Sub3 aClass102_Sub3_30;

	@OriginalMember(owner = "client!aks", name = "g", descriptor = "I")
	final int anInt1637;

	@OriginalMember(owner = "client!aks", name = "i", descriptor = "F")
	final float aFloat144;

	@OriginalMember(owner = "client!aks", name = "m", descriptor = "Lclient!dp;")
	final Class229 aClass229_4;

	@OriginalMember(owner = "client!aks", name = "a", descriptor = "[I")
	int[] anIntArray191;

	@OriginalMember(owner = "client!aks", name = "j", descriptor = "Lclient!aeh;")
	Class94_Sub2 aClass94_Sub2_1;

	@OriginalMember(owner = "client!aks", name = "<init>", descriptor = "(Lclient!aez;IILclient!dp;)V")
	Class80_Sub29(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class229 arg3) {
		this.aClass100_Sub3_2 = arg0;
		this.aClass102_Sub3_30 = this.aClass100_Sub3_2.aClass102_Sub3_25;
		this.anInt1637 = arg1;
		this.aFloat144 = arg2;
		this.aClass229_4 = arg3;
		this.anIntArray191 = new int[this.aClass100_Sub3_2.anInt448 * -1548585779 * this.aClass100_Sub3_2.anInt446 * -1356799781];
		this.aClass94_Sub2_1 = new Class94_Sub2(this.aClass102_Sub3_30, 5123, null, 1);
	}

	@OriginalMember(owner = "client!aks", name = "m", descriptor = "(I)V")
	void method14365(@OriginalArg(0) int arg0) {
		this.aStream1.e(arg0 * 4 + 3);
		this.aStream1.u(-1);
	}

	@OriginalMember(owner = "client!aks", name = "t", descriptor = "(I)V")
	void method14366(@OriginalArg(0) int arg0) {
		this.aNativeHeapBuffer4 = this.aClass102_Sub3_30.aNativeHeap2.f(arg0 * 4, true);
		this.aStream1 = new Stream(this.aNativeHeapBuffer4);
	}

	@OriginalMember(owner = "client!aks", name = "j", descriptor = "(IIIF)V")
	void method14367(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3) {
		@Pc(16) int local16;
		@Pc(26) int local26;
		if (this.anInt1637 != -1) {
			@Pc(11) Class227 local11 = this.aClass102_Sub3_30.aClass235_6.method26120(this.anInt1637, 73831368);
			local16 = local11.aByte120 & 0xFF;
			@Pc(49) int local49;
			if (local16 != 0 && local11.aByte110 != 4) {
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
			local26 = local11.aByte111 & 0xFF;
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
		this.aStream1.e(arg0 * 4);
		this.aStream1.u((byte) (arg1 >> 16));
		this.aStream1.u((byte) (arg1 >> 8));
		this.aStream1.u((byte) arg1);
	}

	@OriginalMember(owner = "client!aks", name = "e", descriptor = "(III)V")
	void method14368(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray191[arg1 * this.aClass100_Sub3_2.anInt448 * -1548585779 + arg0] |= 0x1 << arg2;
	}

	@OriginalMember(owner = "client!aks", name = "u", descriptor = "(IIIF)V")
	void method14369(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3) {
		@Pc(16) int local16;
		@Pc(26) int local26;
		if (this.anInt1637 != -1) {
			@Pc(11) Class227 local11 = this.aClass102_Sub3_30.aClass235_6.method26120(this.anInt1637, 73831368);
			local16 = local11.aByte120 & 0xFF;
			@Pc(49) int local49;
			if (local16 != 0 && local11.aByte110 != 4) {
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
			local26 = local11.aByte111 & 0xFF;
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
		this.aStream1.e(arg0 * 4);
		this.aStream1.u((byte) (arg1 >> 16));
		this.aStream1.u((byte) (arg1 >> 8));
		this.aStream1.u((byte) arg1);
	}

	@OriginalMember(owner = "client!aks", name = "l", descriptor = "(I)V")
	void method14370(@OriginalArg(0) int arg0) {
		this.aStream1.i();
		@Pc(13) Interface14 local13 = this.aClass102_Sub3_30.method6426(4, this.aNativeHeapBuffer4, arg0 * 4, false);
		if (local13 instanceof Class95_Sub2) {
			this.aNativeHeapBuffer4.k();
		}
		this.aClass189_13 = new Class189(local13, 5121, 4, 0);
		this.aNativeHeapBuffer4 = null;
		this.aStream1 = null;
	}

	@OriginalMember(owner = "client!aks", name = "f", descriptor = "(I)V")
	void method14371(@OriginalArg(0) int arg0) {
		this.aStream1.e(arg0 * 4 + 3);
		this.aStream1.u(-1);
	}

	@OriginalMember(owner = "client!aks", name = "i", descriptor = "(I)V")
	void method14372(@OriginalArg(0) int arg0) {
		this.aStream1.e(arg0 * 4 + 3);
		this.aStream1.u(-1);
	}

	@OriginalMember(owner = "client!aks", name = "s", descriptor = "(I)V")
	void method14373(@OriginalArg(0) int arg0) {
		this.aStream1.i();
		@Pc(13) Interface14 local13 = this.aClass102_Sub3_30.method6426(4, this.aNativeHeapBuffer4, arg0 * 4, false);
		if (local13 instanceof Class95_Sub2) {
			this.aNativeHeapBuffer4.k();
		}
		this.aClass189_13 = new Class189(local13, 5121, 4, 0);
		this.aNativeHeapBuffer4 = null;
		this.aStream1 = null;
	}

	@OriginalMember(owner = "client!aks", name = "o", descriptor = "(IIIF)V")
	void method14374(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3) {
		@Pc(16) int local16;
		@Pc(26) int local26;
		if (this.anInt1637 != -1) {
			@Pc(11) Class227 local11 = this.aClass102_Sub3_30.aClass235_6.method26120(this.anInt1637, 73831368);
			local16 = local11.aByte120 & 0xFF;
			@Pc(49) int local49;
			if (local16 != 0 && local11.aByte110 != 4) {
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
			local26 = local11.aByte111 & 0xFF;
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
		this.aStream1.e(arg0 * 4);
		this.aStream1.u((byte) (arg1 >> 16));
		this.aStream1.u((byte) (arg1 >> 8));
		this.aStream1.u((byte) arg1);
	}

	@OriginalMember(owner = "client!aks", name = "a", descriptor = "(IIIF)V")
	void method14375(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3) {
		@Pc(16) int local16;
		@Pc(26) int local26;
		if (this.anInt1637 != -1) {
			@Pc(11) Class227 local11 = this.aClass102_Sub3_30.aClass235_6.method26120(this.anInt1637, 73831368);
			local16 = local11.aByte120 & 0xFF;
			@Pc(49) int local49;
			if (local16 != 0 && local11.aByte110 != 4) {
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
			local26 = local11.aByte111 & 0xFF;
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
		this.aStream1.e(arg0 * 4);
		this.aStream1.u((byte) (arg1 >> 16));
		this.aStream1.u((byte) (arg1 >> 8));
		this.aStream1.u((byte) arg1);
	}

	@OriginalMember(owner = "client!aks", name = "g", descriptor = "([II)V")
	void method14376(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(5) Class80_Sub36_Sub2 local5 = this.aClass102_Sub3_30.aClass80_Sub36_Sub2_1;
		local5.anInt3152 = 0;
		@Pc(27) short[] local27;
		@Pc(21) int local21;
		@Pc(32) int local32;
		@Pc(14) int local14;
		@Pc(38) int local38;
		@Pc(40) int local40;
		if (this.aClass102_Sub3_30.aBoolean129) {
			for (local14 = 0; local14 < arg1; local14++) {
				local21 = arg0[local14];
				local27 = this.aClass100_Sub3_2.aShortArrayArray3[local21];
				local32 = this.anIntArray191[local21];
				if (local32 != 0 && local27 != null) {
					local38 = 0;
					local40 = 0;
					while (local40 < local27.length) {
						if ((local32 & 0x1 << local38++) == 0) {
							local40 += 3;
						} else {
							local5.method23155(local27[local40++] & 0xFFFF, (byte) -99);
							local1++;
							local5.method23155(local27[local40++] & 0xFFFF, (byte) -108);
							local1++;
							local5.method23155(local27[local40++] & 0xFFFF, (byte) -52);
							local1++;
						}
					}
				}
			}
		} else {
			for (local14 = 0; local14 < arg1; local14++) {
				local21 = arg0[local14];
				local27 = this.aClass100_Sub3_2.aShortArrayArray3[local21];
				local32 = this.anIntArray191[local21];
				if (local32 != 0 && local27 != null) {
					local38 = 0;
					local40 = 0;
					while (local40 < local27.length) {
						if ((local32 & 0x1 << local38++) == 0) {
							local40 += 3;
						} else {
							local5.method23385(local27[local40++] & 0xFFFF, 1060557734);
							local1++;
							local5.method23385(local27[local40++] & 0xFFFF, 1060557734);
							local1++;
							local5.method23385(local27[local40++] & 0xFFFF, 1060557734);
							local1++;
						}
					}
				}
			}
		}
		if (local1 <= 0) {
			return;
		}
		this.aClass94_Sub2_1.method2089(5123, local5.aByteArray61, local5.anInt3152 * -1380987821);
		this.aClass102_Sub3_30.method6550(this.aClass100_Sub3_2.aClass189_2, this.aClass100_Sub3_2.aClass189_1, this.aClass189_13, this.aClass100_Sub3_2.aClass189_4);
		this.aClass102_Sub3_30.method6351(this.anInt1637, (this.aClass100_Sub3_2.anInt459 & 0x7) != 0, (this.aClass100_Sub3_2.anInt459 & 0x8) != 0);
		if (this.aClass102_Sub3_30.aBoolean151) {
			this.aClass102_Sub3_30.method20868(Integer.MAX_VALUE, this.aClass229_4);
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(1.0F / this.aFloat144, 1.0F / this.aFloat144, 1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass102_Sub3_30.method6550(this.aClass100_Sub3_2.aClass189_2, this.aClass100_Sub3_2.aClass189_1, this.aClass189_13, this.aClass100_Sub3_2.aClass189_4);
		this.aClass102_Sub3_30.method6379(this.aClass94_Sub2_1, 4, 0, local1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!aks", name = "x", descriptor = "(I)V")
	void method14377(@OriginalArg(0) int arg0) {
		this.aStream1.i();
		@Pc(13) Interface14 local13 = this.aClass102_Sub3_30.method6426(4, this.aNativeHeapBuffer4, arg0 * 4, false);
		if (local13 instanceof Class95_Sub2) {
			this.aNativeHeapBuffer4.k();
		}
		this.aClass189_13 = new Class189(local13, 5121, 4, 0);
		this.aNativeHeapBuffer4 = null;
		this.aStream1 = null;
	}

	@OriginalMember(owner = "client!aks", name = "z", descriptor = "([II)V")
	void method14378(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(5) Class80_Sub36_Sub2 local5 = this.aClass102_Sub3_30.aClass80_Sub36_Sub2_1;
		local5.anInt3152 = 0;
		@Pc(27) short[] local27;
		@Pc(21) int local21;
		@Pc(32) int local32;
		@Pc(14) int local14;
		@Pc(38) int local38;
		@Pc(40) int local40;
		if (this.aClass102_Sub3_30.aBoolean129) {
			for (local14 = 0; local14 < arg1; local14++) {
				local21 = arg0[local14];
				local27 = this.aClass100_Sub3_2.aShortArrayArray3[local21];
				local32 = this.anIntArray191[local21];
				if (local32 != 0 && local27 != null) {
					local38 = 0;
					local40 = 0;
					while (local40 < local27.length) {
						if ((local32 & 0x1 << local38++) == 0) {
							local40 += 3;
						} else {
							local5.method23155(local27[local40++] & 0xFFFF, (byte) -75);
							local1++;
							local5.method23155(local27[local40++] & 0xFFFF, (byte) -24);
							local1++;
							local5.method23155(local27[local40++] & 0xFFFF, (byte) -22);
							local1++;
						}
					}
				}
			}
		} else {
			for (local14 = 0; local14 < arg1; local14++) {
				local21 = arg0[local14];
				local27 = this.aClass100_Sub3_2.aShortArrayArray3[local21];
				local32 = this.anIntArray191[local21];
				if (local32 != 0 && local27 != null) {
					local38 = 0;
					local40 = 0;
					while (local40 < local27.length) {
						if ((local32 & 0x1 << local38++) == 0) {
							local40 += 3;
						} else {
							local5.method23385(local27[local40++] & 0xFFFF, 1060557734);
							local1++;
							local5.method23385(local27[local40++] & 0xFFFF, 1060557734);
							local1++;
							local5.method23385(local27[local40++] & 0xFFFF, 1060557734);
							local1++;
						}
					}
				}
			}
		}
		if (local1 <= 0) {
			return;
		}
		this.aClass94_Sub2_1.method2089(5123, local5.aByteArray61, local5.anInt3152 * -1380987821);
		this.aClass102_Sub3_30.method6550(this.aClass100_Sub3_2.aClass189_2, this.aClass100_Sub3_2.aClass189_1, this.aClass189_13, this.aClass100_Sub3_2.aClass189_4);
		this.aClass102_Sub3_30.method6351(this.anInt1637, (this.aClass100_Sub3_2.anInt459 & 0x7) != 0, (this.aClass100_Sub3_2.anInt459 & 0x8) != 0);
		if (this.aClass102_Sub3_30.aBoolean151) {
			this.aClass102_Sub3_30.method20868(Integer.MAX_VALUE, this.aClass229_4);
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(1.0F / this.aFloat144, 1.0F / this.aFloat144, 1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass102_Sub3_30.method6550(this.aClass100_Sub3_2.aClass189_2, this.aClass100_Sub3_2.aClass189_1, this.aClass189_13, this.aClass100_Sub3_2.aClass189_4);
		this.aClass102_Sub3_30.method6379(this.aClass94_Sub2_1, 4, 0, local1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!aks", name = "p", descriptor = "([II)V")
	void method14379(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(5) Class80_Sub36_Sub2 local5 = this.aClass102_Sub3_30.aClass80_Sub36_Sub2_1;
		local5.anInt3152 = 0;
		@Pc(27) short[] local27;
		@Pc(21) int local21;
		@Pc(32) int local32;
		@Pc(14) int local14;
		@Pc(38) int local38;
		@Pc(40) int local40;
		if (this.aClass102_Sub3_30.aBoolean129) {
			for (local14 = 0; local14 < arg1; local14++) {
				local21 = arg0[local14];
				local27 = this.aClass100_Sub3_2.aShortArrayArray3[local21];
				local32 = this.anIntArray191[local21];
				if (local32 != 0 && local27 != null) {
					local38 = 0;
					local40 = 0;
					while (local40 < local27.length) {
						if ((local32 & 0x1 << local38++) == 0) {
							local40 += 3;
						} else {
							local5.method23155(local27[local40++] & 0xFFFF, (byte) -71);
							local1++;
							local5.method23155(local27[local40++] & 0xFFFF, (byte) -88);
							local1++;
							local5.method23155(local27[local40++] & 0xFFFF, (byte) -73);
							local1++;
						}
					}
				}
			}
		} else {
			for (local14 = 0; local14 < arg1; local14++) {
				local21 = arg0[local14];
				local27 = this.aClass100_Sub3_2.aShortArrayArray3[local21];
				local32 = this.anIntArray191[local21];
				if (local32 != 0 && local27 != null) {
					local38 = 0;
					local40 = 0;
					while (local40 < local27.length) {
						if ((local32 & 0x1 << local38++) == 0) {
							local40 += 3;
						} else {
							local5.method23385(local27[local40++] & 0xFFFF, 1060557734);
							local1++;
							local5.method23385(local27[local40++] & 0xFFFF, 1060557734);
							local1++;
							local5.method23385(local27[local40++] & 0xFFFF, 1060557734);
							local1++;
						}
					}
				}
			}
		}
		if (local1 <= 0) {
			return;
		}
		this.aClass94_Sub2_1.method2089(5123, local5.aByteArray61, local5.anInt3152 * -1380987821);
		this.aClass102_Sub3_30.method6550(this.aClass100_Sub3_2.aClass189_2, this.aClass100_Sub3_2.aClass189_1, this.aClass189_13, this.aClass100_Sub3_2.aClass189_4);
		this.aClass102_Sub3_30.method6351(this.anInt1637, (this.aClass100_Sub3_2.anInt459 & 0x7) != 0, (this.aClass100_Sub3_2.anInt459 & 0x8) != 0);
		if (this.aClass102_Sub3_30.aBoolean151) {
			this.aClass102_Sub3_30.method20868(Integer.MAX_VALUE, this.aClass229_4);
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(1.0F / this.aFloat144, 1.0F / this.aFloat144, 1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass102_Sub3_30.method6550(this.aClass100_Sub3_2.aClass189_2, this.aClass100_Sub3_2.aClass189_1, this.aClass189_13, this.aClass100_Sub3_2.aClass189_4);
		this.aClass102_Sub3_30.method6379(this.aClass94_Sub2_1, 4, 0, local1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}
}
