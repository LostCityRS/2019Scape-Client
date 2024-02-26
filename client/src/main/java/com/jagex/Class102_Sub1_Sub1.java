package com.jagex;

import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aqi")
public final class Class102_Sub1_Sub1 extends Class102_Sub1 {

	@OriginalMember(owner = "client!aqi", name = "iw", descriptor = "I")
	static final int anInt2835 = 3;

	@OriginalMember(owner = "client!aqi", name = "hs", descriptor = "Lclient!aii;")
	Class142_Sub1 aClass142_Sub1_1;

	@OriginalMember(owner = "client!aqi", name = "hy", descriptor = "J")
	long aLong160;

	@OriginalMember(owner = "client!aqi", name = "hm", descriptor = "Z")
	boolean aBoolean489;

	@OriginalMember(owner = "client!aqi", name = "hl", descriptor = "Z")
	boolean aBoolean490;

	@OriginalMember(owner = "client!aqi", name = "hg", descriptor = "I")
	int anInt2833;

	@OriginalMember(owner = "client!aqi", name = "ht", descriptor = "Z")
	boolean aBoolean491;

	@OriginalMember(owner = "client!aqi", name = "hz", descriptor = "Lclient!agq;")
	Class114_Sub1 aClass114_Sub1_2;

	@OriginalMember(owner = "client!aqi", name = "it", descriptor = "Z")
	boolean aBoolean499;

	@OriginalMember(owner = "client!aqi", name = "he", descriptor = "Lclient!aag;")
	Class8 aClass8_36 = new Class8();

	@OriginalMember(owner = "client!aqi", name = "hx", descriptor = "Lclient!aag;")
	Class8 aClass8_38 = new Class8();

	@OriginalMember(owner = "client!aqi", name = "hc", descriptor = "Lclient!aag;")
	Class8 aClass8_33 = new Class8();

	@OriginalMember(owner = "client!aqi", name = "ho", descriptor = "Lclient!aag;")
	Class8 aClass8_34 = new Class8();

	@OriginalMember(owner = "client!aqi", name = "hu", descriptor = "Lclient!aag;")
	Class8 aClass8_35 = new Class8();

	@OriginalMember(owner = "client!aqi", name = "hh", descriptor = "Lclient!aag;")
	Class8 aClass8_37 = new Class8();

	@OriginalMember(owner = "client!aqi", name = "hd", descriptor = "Lclient!aag;")
	Class8 aClass8_39 = new Class8();

	@OriginalMember(owner = "client!aqi", name = "hj", descriptor = "[I")
	final int[] anIntArray250 = new int[1000];

	@OriginalMember(owner = "client!aqi", name = "hb", descriptor = "[Lclient!aio;")
	Class142_Sub2[] aClass142_Sub2Array1 = new Class142_Sub2[16];

	@OriginalMember(owner = "client!aqi", name = "ib", descriptor = "[F")
	final float[] aFloatArray54;

	@OriginalMember(owner = "client!aqi", name = "iy", descriptor = "[F")
	final float[] aFloatArray55;

	@OriginalMember(owner = "client!aqi", name = "iv", descriptor = "Lclient!cm;")
	Class99 aClass99_19;

	@OriginalMember(owner = "client!aqi", name = "ie", descriptor = "Lclient!cm;")
	Class99 aClass99_20;

	@OriginalMember(owner = "client!aqi", name = "ik", descriptor = "Lclient!afo;")
	Class108_Sub1 aClass108_Sub1_3;

	@OriginalMember(owner = "client!aqi", name = "ii", descriptor = "[I")
	int[] anIntArray252;

	@OriginalMember(owner = "client!aqi", name = "is", descriptor = "[J")
	long[] aLongArray13;

	@OriginalMember(owner = "client!aqi", name = "ic", descriptor = "[I")
	int[] anIntArray249;

	@OriginalMember(owner = "client!aqi", name = "im", descriptor = "I")
	int anInt2836;

	@OriginalMember(owner = "client!aqi", name = "ij", descriptor = "I")
	int anInt2838;

	@OriginalMember(owner = "client!aqi", name = "hr", descriptor = "Lclient!jaggl/OpenGL;")
	OpenGL anOpenGL3;

	@OriginalMember(owner = "client!aqi", name = "il", descriptor = "Ljava/lang/String;")
	final String aString78;

	@OriginalMember(owner = "client!aqi", name = "in", descriptor = "Ljava/lang/String;")
	final String aString77;

	@OriginalMember(owner = "client!aqi", name = "if", descriptor = "I")
	final int anInt2834;

	@OriginalMember(owner = "client!aqi", name = "ih", descriptor = "Z")
	boolean aBoolean492;

	@OriginalMember(owner = "client!aqi", name = "io", descriptor = "Z")
	boolean aBoolean493;

	@OriginalMember(owner = "client!aqi", name = "ig", descriptor = "Z")
	boolean aBoolean500;

	@OriginalMember(owner = "client!aqi", name = "id", descriptor = "Z")
	final boolean aBoolean494;

	@OriginalMember(owner = "client!aqi", name = "ix", descriptor = "Z")
	final boolean aBoolean495;

	@OriginalMember(owner = "client!aqi", name = "ip", descriptor = "Z")
	final boolean aBoolean496;

	@OriginalMember(owner = "client!aqi", name = "ir", descriptor = "Z")
	final boolean aBoolean497;

	@OriginalMember(owner = "client!aqi", name = "iq", descriptor = "Z")
	boolean aBoolean498;

	@OriginalMember(owner = "client!aqi", name = "hi", descriptor = "[I")
	int[] anIntArray251;

	@OriginalMember(owner = "client!aqi", name = "iu", descriptor = "I")
	final int anInt2837;

	@OriginalMember(owner = "client!aqi", name = "ia", descriptor = "Z")
	boolean aBoolean488;

	@OriginalMember(owner = "client!aqi", name = "aif", descriptor = "(Lclient!dy;)I")
	static int method20091(@OriginalArg(0) Class236 arg0) {
		switch(arg0.anInt3805 * 708282217) {
			case 0:
				return 5123;
			case 1:
				return 5120;
			case 2:
				return 5126;
			case 3:
				return 5121;
			case 4:
				return 5125;
			case 5:
				return 5124;
			case 6:
			default:
				return 5121;
			case 7:
				return 5122;
			case 8:
				return 5131;
		}
	}

	@OriginalMember(owner = "client!aqi", name = "aho", descriptor = "(Lclient!dy;)I")
	static int method20102(@OriginalArg(0) Class236 arg0) {
		switch(arg0.anInt3805 * 708282217) {
			case 0:
				return 5123;
			case 1:
				return 5120;
			case 2:
				return 5126;
			case 3:
				return 5121;
			case 4:
				return 5125;
			case 5:
				return 5124;
			case 6:
			default:
				return 5121;
			case 7:
				return 5122;
			case 8:
				return 5131;
		}
	}

	@OriginalMember(owner = "client!aqi", name = "ahw", descriptor = "(Lclient!co;Lclient!dy;)I")
	static int method20103(@OriginalArg(0) Class210 arg0, @OriginalArg(1) Class236 arg1) {
		if (arg1 == Class236.aClass236_21) {
			switch(arg0.anInt3601 * 1710327153) {
				case 1:
					return 33777;
				case 2:
					return 6406;
				case 3:
				default:
					throw new IllegalArgumentException();
				case 4:
					return 33779;
				case 5:
					return 6409;
				case 6:
					return 6410;
				case 7:
					return 6408;
				case 8:
					return 6407;
			}
		} else if (arg1 == Class236.aClass236_19) {
			switch(arg0.anInt3601 * 1710327153) {
				case 2:
					return 32830;
				case 3:
					return 33189;
				case 4:
				default:
					throw new IllegalArgumentException();
				case 5:
					return 32834;
				case 6:
					return 36219;
				case 7:
					return 32859;
				case 8:
					return 32852;
			}
		} else if (arg1 == Class236.aClass236_22) {
			switch(arg0.anInt3601 * 1710327153) {
				case 3:
					return 33190;
				default:
					throw new IllegalArgumentException();
			}
		} else if (arg1 == Class236.aClass236_24) {
			switch(arg0.anInt3601 * 1710327153) {
				case 3:
					return 33191;
				default:
					throw new IllegalArgumentException();
			}
		} else if (arg1 == Class236.aClass236_25) {
			switch(arg0.anInt3601 * 1710327153) {
				case 2:
					return 34844;
				case 3:
				case 4:
				default:
					throw new IllegalArgumentException();
				case 5:
					return 34846;
				case 6:
					return 34847;
				case 7:
					return 34842;
				case 8:
					return 34843;
			}
		} else if (arg1 == Class236.aClass236_26) {
			switch(arg0.anInt3601 * 1710327153) {
				case 2:
					return 34838;
				case 3:
				case 4:
				default:
					throw new IllegalArgumentException();
				case 5:
					return 34840;
				case 6:
					return 34841;
				case 7:
					return 34836;
				case 8:
					return 34837;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!aqi", name = "aha", descriptor = "(Lclient!mh;)I")
	static int method20105(@OriginalArg(0) Class417 arg0) {
		if (arg0 == Class417.aClass417_2) {
			return 5890;
		} else if (arg0 == Class417.aClass417_3) {
			return 34167;
		} else if (arg0 == Class417.aClass417_1) {
			return 34168;
		} else if (arg0 == Class417.aClass417_4) {
			return 34166;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!aqi", name = "ahq", descriptor = "(Lclient!co;)I")
	static int method20106(@OriginalArg(0) Class210 arg0) {
		switch(arg0.anInt3601 * 1710327153) {
			case 2:
				return 6406;
			case 3:
				return 6402;
			case 4:
			default:
				throw new IllegalStateException();
			case 5:
				return 6409;
			case 6:
				return 6410;
			case 7:
				return 6408;
			case 8:
				return 6407;
		}
	}

	@OriginalMember(owner = "client!aqi", name = "air", descriptor = "(Lclient!co;Lclient!dy;)I")
	static int method20112(@OriginalArg(0) Class210 arg0, @OriginalArg(1) Class236 arg1) {
		if (arg1 == Class236.aClass236_21) {
			switch(arg0.anInt3601 * 1710327153) {
				case 1:
					return 33777;
				case 2:
					return 6406;
				case 3:
				default:
					throw new IllegalArgumentException();
				case 4:
					return 33779;
				case 5:
					return 6409;
				case 6:
					return 6410;
				case 7:
					return 6408;
				case 8:
					return 6407;
			}
		} else if (arg1 == Class236.aClass236_19) {
			switch(arg0.anInt3601 * 1710327153) {
				case 2:
					return 32830;
				case 3:
					return 33189;
				case 4:
				default:
					throw new IllegalArgumentException();
				case 5:
					return 32834;
				case 6:
					return 36219;
				case 7:
					return 32859;
				case 8:
					return 32852;
			}
		} else if (arg1 == Class236.aClass236_22) {
			switch(arg0.anInt3601 * 1710327153) {
				case 3:
					return 33190;
				default:
					throw new IllegalArgumentException();
			}
		} else if (arg1 == Class236.aClass236_24) {
			switch(arg0.anInt3601 * 1710327153) {
				case 3:
					return 33191;
				default:
					throw new IllegalArgumentException();
			}
		} else if (arg1 == Class236.aClass236_25) {
			switch(arg0.anInt3601 * 1710327153) {
				case 2:
					return 34844;
				case 3:
				case 4:
				default:
					throw new IllegalArgumentException();
				case 5:
					return 34846;
				case 6:
					return 34847;
				case 7:
					return 34842;
				case 8:
					return 34843;
			}
		} else if (arg1 == Class236.aClass236_26) {
			switch(arg0.anInt3601 * 1710327153) {
				case 2:
					return 34838;
				case 3:
				case 4:
				default:
					throw new IllegalArgumentException();
				case 5:
					return 34840;
				case 6:
					return 34841;
				case 7:
					return 34836;
				case 8:
					return 34837;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!aqi", name = "aih", descriptor = "(Lclient!dy;)I")
	static int method20117(@OriginalArg(0) Class236 arg0) {
		switch(arg0.anInt3805 * 708282217) {
			case 0:
				return 5123;
			case 1:
				return 5120;
			case 2:
				return 5126;
			case 3:
				return 5121;
			case 4:
				return 5125;
			case 5:
				return 5124;
			case 6:
			default:
				return 5121;
			case 7:
				return 5122;
			case 8:
				return 5131;
		}
	}

	@OriginalMember(owner = "client!aqi", name = "ahc", descriptor = "(Lclient!ma;)I")
	static int method20118(@OriginalArg(0) Class412 arg0) {
		if (arg0 == Class412.aClass412_5) {
			return 7681;
		} else if (arg0 == Class412.aClass412_1) {
			return 8448;
		} else if (arg0 == Class412.aClass412_4) {
			return 34165;
		} else if (arg0 == Class412.aClass412_2) {
			return 260;
		} else if (arg0 == Class412.aClass412_3) {
			return 34023;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!aqi", name = "ahn", descriptor = "(Lclient!ma;)I")
	static int method20124(@OriginalArg(0) Class412 arg0) {
		if (arg0 == Class412.aClass412_5) {
			return 7681;
		} else if (arg0 == Class412.aClass412_1) {
			return 8448;
		} else if (arg0 == Class412.aClass412_4) {
			return 34165;
		} else if (arg0 == Class412.aClass412_2) {
			return 260;
		} else if (arg0 == Class412.aClass412_3) {
			return 34023;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!aqi", name = "aio", descriptor = "(Lclient!mh;)I")
	static int method20125(@OriginalArg(0) Class417 arg0) {
		if (arg0 == Class417.aClass417_2) {
			return 5890;
		} else if (arg0 == Class417.aClass417_3) {
			return 34167;
		} else if (arg0 == Class417.aClass417_1) {
			return 34168;
		} else if (arg0 == Class417.aClass417_4) {
			return 34166;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!aqi", name = "aig", descriptor = "(Lclient!mh;)I")
	static int method20136(@OriginalArg(0) Class417 arg0) {
		if (arg0 == Class417.aClass417_2) {
			return 5890;
		} else if (arg0 == Class417.aClass417_3) {
			return 34167;
		} else if (arg0 == Class417.aClass417_1) {
			return 34168;
		} else if (arg0 == Class417.aClass417_4) {
			return 34166;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!aqi", name = "aiz", descriptor = "(Lclient!co;)I")
	static int method20137(@OriginalArg(0) Class210 arg0) {
		switch(arg0.anInt3601 * 1710327153) {
			case 2:
				return 6406;
			case 3:
				return 6402;
			case 4:
			default:
				throw new IllegalStateException();
			case 5:
				return 6409;
			case 6:
				return 6410;
			case 7:
				return 6408;
			case 8:
				return 6407;
		}
	}

	@OriginalMember(owner = "client!aqi", name = "aiu", descriptor = "(Lclient!co;Lclient!dy;)I")
	static int method20138(@OriginalArg(0) Class210 arg0, @OriginalArg(1) Class236 arg1) {
		if (arg1 == Class236.aClass236_21) {
			switch(arg0.anInt3601 * 1710327153) {
				case 1:
					return 33777;
				case 2:
					return 6406;
				case 3:
				default:
					throw new IllegalArgumentException();
				case 4:
					return 33779;
				case 5:
					return 6409;
				case 6:
					return 6410;
				case 7:
					return 6408;
				case 8:
					return 6407;
			}
		} else if (arg1 == Class236.aClass236_19) {
			switch(arg0.anInt3601 * 1710327153) {
				case 2:
					return 32830;
				case 3:
					return 33189;
				case 4:
				default:
					throw new IllegalArgumentException();
				case 5:
					return 32834;
				case 6:
					return 36219;
				case 7:
					return 32859;
				case 8:
					return 32852;
			}
		} else if (arg1 == Class236.aClass236_22) {
			switch(arg0.anInt3601 * 1710327153) {
				case 3:
					return 33190;
				default:
					throw new IllegalArgumentException();
			}
		} else if (arg1 == Class236.aClass236_24) {
			switch(arg0.anInt3601 * 1710327153) {
				case 3:
					return 33191;
				default:
					throw new IllegalArgumentException();
			}
		} else if (arg1 == Class236.aClass236_25) {
			switch(arg0.anInt3601 * 1710327153) {
				case 2:
					return 34844;
				case 3:
				case 4:
				default:
					throw new IllegalArgumentException();
				case 5:
					return 34846;
				case 6:
					return 34847;
				case 7:
					return 34842;
				case 8:
					return 34843;
			}
		} else if (arg1 == Class236.aClass236_26) {
			switch(arg0.anInt3601 * 1710327153) {
				case 2:
					return 34838;
				case 3:
				case 4:
				default:
					throw new IllegalArgumentException();
				case 5:
					return 34840;
				case 6:
					return 34841;
				case 7:
					return 34836;
				case 8:
					return 34837;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!aqi", name = "ain", descriptor = "(Lclient!co;Lclient!dy;)I")
	static int method20139(@OriginalArg(0) Class210 arg0, @OriginalArg(1) Class236 arg1) {
		if (arg1 == Class236.aClass236_21) {
			switch(arg0.anInt3601 * 1710327153) {
				case 1:
					return 33777;
				case 2:
					return 6406;
				case 3:
				default:
					throw new IllegalArgumentException();
				case 4:
					return 33779;
				case 5:
					return 6409;
				case 6:
					return 6410;
				case 7:
					return 6408;
				case 8:
					return 6407;
			}
		} else if (arg1 == Class236.aClass236_19) {
			switch(arg0.anInt3601 * 1710327153) {
				case 2:
					return 32830;
				case 3:
					return 33189;
				case 4:
				default:
					throw new IllegalArgumentException();
				case 5:
					return 32834;
				case 6:
					return 36219;
				case 7:
					return 32859;
				case 8:
					return 32852;
			}
		} else if (arg1 == Class236.aClass236_22) {
			switch(arg0.anInt3601 * 1710327153) {
				case 3:
					return 33190;
				default:
					throw new IllegalArgumentException();
			}
		} else if (arg1 == Class236.aClass236_24) {
			switch(arg0.anInt3601 * 1710327153) {
				case 3:
					return 33191;
				default:
					throw new IllegalArgumentException();
			}
		} else if (arg1 == Class236.aClass236_25) {
			switch(arg0.anInt3601 * 1710327153) {
				case 2:
					return 34844;
				case 3:
				case 4:
				default:
					throw new IllegalArgumentException();
				case 5:
					return 34846;
				case 6:
					return 34847;
				case 7:
					return 34842;
				case 8:
					return 34843;
			}
		} else if (arg1 == Class236.aClass236_26) {
			switch(arg0.anInt3601 * 1710327153) {
				case 2:
					return 34838;
				case 3:
				case 4:
				default:
					throw new IllegalArgumentException();
				case 5:
					return 34840;
				case 6:
					return 34841;
				case 7:
					return 34836;
				case 8:
					return 34837;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!aqi", name = "aij", descriptor = "(Lclient!co;Lclient!dy;)I")
	static int method20140(@OriginalArg(0) Class210 arg0, @OriginalArg(1) Class236 arg1) {
		if (arg1 == Class236.aClass236_21) {
			switch(arg0.anInt3601 * 1710327153) {
				case 1:
					return 33777;
				case 2:
					return 6406;
				case 3:
				default:
					throw new IllegalArgumentException();
				case 4:
					return 33779;
				case 5:
					return 6409;
				case 6:
					return 6410;
				case 7:
					return 6408;
				case 8:
					return 6407;
			}
		} else if (arg1 == Class236.aClass236_19) {
			switch(arg0.anInt3601 * 1710327153) {
				case 2:
					return 32830;
				case 3:
					return 33189;
				case 4:
				default:
					throw new IllegalArgumentException();
				case 5:
					return 32834;
				case 6:
					return 36219;
				case 7:
					return 32859;
				case 8:
					return 32852;
			}
		} else if (arg1 == Class236.aClass236_22) {
			switch(arg0.anInt3601 * 1710327153) {
				case 3:
					return 33190;
				default:
					throw new IllegalArgumentException();
			}
		} else if (arg1 == Class236.aClass236_24) {
			switch(arg0.anInt3601 * 1710327153) {
				case 3:
					return 33191;
				default:
					throw new IllegalArgumentException();
			}
		} else if (arg1 == Class236.aClass236_25) {
			switch(arg0.anInt3601 * 1710327153) {
				case 2:
					return 34844;
				case 3:
				case 4:
				default:
					throw new IllegalArgumentException();
				case 5:
					return 34846;
				case 6:
					return 34847;
				case 7:
					return 34842;
				case 8:
					return 34843;
			}
		} else if (arg1 == Class236.aClass236_26) {
			switch(arg0.anInt3601 * 1710327153) {
				case 2:
					return 34838;
				case 3:
				case 4:
				default:
					throw new IllegalArgumentException();
				case 5:
					return 34840;
				case 6:
					return 34841;
				case 7:
					return 34836;
				case 8:
					return 34837;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!aqi", name = "<init>", descriptor = "(Lclient!jaggl/OpenGL;Ljava/awt/Canvas;JLclient!dx;Lclient!ew;Lclient!nh;Lclient!np;Lclient!nt;Lclient!pf;I)V")
	Class102_Sub1_Sub1(@OriginalArg(0) OpenGL arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) long arg2, @OriginalArg(3) Class235 arg3, @OriginalArg(4) Interface23 arg4, @OriginalArg(5) Interface46 arg5, @OriginalArg(6) Interface47 arg6, @OriginalArg(7) Interface48 arg7, @OriginalArg(8) Class480 arg8, @OriginalArg(9) int arg9) {
		super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, 1);
		new MapBuffer();
		new MapBuffer();
		this.aFloatArray54 = new float[4];
		this.aFloatArray55 = new float[16];
		this.aClass99_19 = null;
		this.aClass99_20 = null;
		this.aClass108_Sub1_3 = null;
		this.anIntArray252 = new int[3];
		this.aLongArray13 = new long[3];
		this.anIntArray249 = new int[3];
		this.anInt2836 = 0;
		this.anInt2838 = 0;
		@Pc(98) int[] local98 = new int[1];
		try {
			this.anOpenGL3 = arg0;
			this.anOpenGL3.f();
			this.aString78 = OpenGL.glGetString(7936).toLowerCase();
			this.aString77 = OpenGL.glGetString(7937).toLowerCase();
			if (this.aString78.indexOf("microsoft") != -1 || this.aString78.indexOf("brian paul") != -1 || this.aString78.indexOf("mesa") != -1) {
				throw new RuntimeException("");
			}
			@Pc(141) String local141 = OpenGL.glGetString(7938);
			@Pc(149) String[] local149 = Class313.method27482(local141.replace('.', ' '), ' ', 2036747717);
			if (local149.length < 2) {
				throw new RuntimeException("");
			}
			@Pc(159) int local159;
			try {
				local159 = Class679.method33621(local149[0], -1950780468);
				@Pc(165) int local165 = Class679.method33621(local149[1], -1045819116);
				this.anInt2834 = local159 * 10 + local165;
			} catch (@Pc(174) NumberFormatException local174) {
				throw new RuntimeException("");
			}
			if (this.anInt2834 < 12) {
				throw new RuntimeException("");
			}
			OpenGL.glGetIntegerv(34018, local98, 0);
			this.anInt2998 = local98[0];
			if (this.anInt2998 < 2) {
				throw new RuntimeException("");
			}
			this.anInt2999 = 8;
			this.aBoolean492 = this.anOpenGL3.t("GL_ARB_vertex_buffer_object");
			this.aBoolean531 = this.anOpenGL3.t("GL_ARB_multisample");
			this.aBoolean534 = this.anOpenGL3.t("GL_EXT_blend_func_separate");
			this.aBoolean493 = this.anOpenGL3.t("GL_ARB_texture_rectangle");
			this.aBoolean509 = this.anOpenGL3.t("GL_ARB_texture_cube_map");
			this.aBoolean500 = this.anOpenGL3.t("GL_ARB_texture_non_power_of_two");
			this.aBoolean532 = true;
			this.aBoolean494 = this.anOpenGL3.t("GL_ARB_vertex_shader");
			this.aBoolean495 = this.anOpenGL3.t("GL_ARB_vertex_program");
			this.aBoolean496 = this.anOpenGL3.t("GL_ARB_fragment_shader");
			this.aBoolean497 = this.anOpenGL3.t("GL_ARB_fragment_program");
			this.aBoolean529 = this.anOpenGL3.t("GL_EXT_framebuffer_object");
			this.aBoolean533 = this.aBoolean529;
			this.aBoolean523 = this.anOpenGL3.t("GL_EXT_framebuffer_blit");
			this.aBoolean530 = this.anOpenGL3.t("GL_EXT_framebuffer_multisample");
			this.aBoolean498 = this.anUnsafe4 != null && (this.anInt2834 >= 32 || this.anOpenGL3.t("GL_ARB_sync"));
			this.anIntArray251 = new int[this.anInt2998];
			if (!this.method21287() || !this.method21207()) {
				if (!this.anOpenGL3.t("GL_ARB_multitexture")) {
					throw new RuntimeException("");
				}
				if (!this.anOpenGL3.t("GL_ARB_texture_env_combine")) {
					throw new RuntimeException("");
				}
			}
			Class531.aString220.startsWith("mac");
			this.anInt2837 = Stream.m() ? 33639 : 5121;
			if (this.aString77.indexOf("radeon") != -1 || this.aString78.indexOf("intel") != -1) {
				local159 = 0;
				@Pc(382) boolean local382 = this.aString78.indexOf("intel") != -1;
				@Pc(384) boolean local384 = false;
				@Pc(386) boolean local386 = false;
				@Pc(395) String[] local395 = Class313.method27482(this.aString77.replace('/', ' '), ' ', 2036747717);
				for (@Pc(397) int local397 = 0; local397 < local395.length; local397++) {
					@Pc(405) String local405 = local395[local397];
					try {
						if (local405.length() > 0) {
							if (local405.charAt(0) == 'x' && local405.length() >= 3 && Class698.method37062(local405.substring(1, 3), (short) 13104)) {
								local405 = local405.substring(1);
								local386 = true;
							}
							if (local405.equals("hd")) {
								local384 = true;
							} else {
								if (local405.startsWith("hd")) {
									local405 = local405.substring(2);
									local384 = true;
								}
								if (local405.length() >= 4 && Class698.method37062(local405.substring(0, 4), (short) 4780)) {
									local159 = Class679.method33621(local405.substring(0, 4), -1054762293);
									break;
								}
							}
						}
					} catch (@Pc(469) Exception local469) {
					}
				}
				if (!local382) {
					if (!local386 && !local384) {
						if (local159 >= 7000 && local159 <= 7999) {
							this.aBoolean492 = false;
						}
						if (local159 >= 7000 && local159 <= 9250) {
							this.aBoolean532 = false;
						}
					}
					this.aBoolean493 &= this.anOpenGL3.t("GL_ARB_half_float_pixel");
					this.aBoolean488 = true;
				} else if (!local384) {
					this.aBoolean529 = false;
				}
			}
			if (!this.aBoolean492) {
				throw new RuntimeException("");
			}
			try {
				@Pc(519) int[] local519 = new int[1];
				OpenGL.glGenBuffersARB(1, local519, 0);
			} catch (@Pc(525) Throwable local525) {
				throw new RuntimeException("");
			}
			this.method20680(arg1, new Class108_Sub2_Sub1_Sub2(this, arg1, arg2), -1231358728);
			this.method20682(arg1, -1937963861);
			this.method21166(32768, false);
			this.method21166(32768, false);
		} catch (@Pc(561) Throwable local561) {
			local561.printStackTrace();
			this.method20660(-1935103360);
			if (local561 instanceof OutOfMemoryError) {
				throw (OutOfMemoryError) local561;
			}
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!aqi", name = "na", descriptor = "(IILclient!co;Lclient!dy;I)Lclient!do;")
	@Override
	public Interface18 method21126(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class210 arg2, @OriginalArg(3) Class236 arg3, @OriginalArg(4) int arg4) {
		return new Class534(this, arg2, arg3, arg0, arg1, arg4);
	}

	@OriginalMember(owner = "client!aqi", name = "adw", descriptor = "(ILclient!mh;Z)V")
	@Override
	void method21451(@OriginalArg(0) int arg0, @OriginalArg(1) Class417 arg1, @OriginalArg(2) boolean arg2) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, method20105(arg1));
		OpenGL.glTexEnvi(8960, arg0 + 34200, arg2 ? 771 : 770);
	}

	@OriginalMember(owner = "client!aqi", name = "xb", descriptor = "()Z")
	@Override
	public boolean method21317() {
		return this.aBoolean496;
	}

	@OriginalMember(owner = "client!aqi", name = "rr", descriptor = "()Z")
	@Override
	public boolean method21207() {
		return this.aBoolean496;
	}

	@OriginalMember(owner = "client!aqi", name = "rv", descriptor = "(Z)Z")
	@Override
	public boolean method21322(@OriginalArg(0) boolean arg0) {
		return true;
	}

	@OriginalMember(owner = "client!aqi", name = "aao", descriptor = "(Lclient!pm;)V")
	@Override
	public void method21233(@OriginalArg(0) Class487 arg0) {
		@Pc(2) float[] local2 = arg0.aFloatArray114;
		local2[1] = -local2[1];
		local2[5] = -local2[5];
		local2[9] = -local2[9];
		local2[13] = -local2[13];
	}

	@OriginalMember(owner = "client!aqi", name = "sh", descriptor = "()V")
	@Override
	void method21148() {
		OpenGL.glDepthFunc(515);
		this.method20097();
		OpenGL.glClearDepth(1.0F);
		OpenGL.glAlphaFunc(516, 0.0F);
		OpenGL.glPolygonMode(1028, 6914);
		if (this.aBoolean531) {
			this.method21323(this.anInt2994 > 1);
			OpenGL.glDisable(32926);
		}
		for (@Pc(30) int local30 = this.anInt2998 - 1; local30 >= 0; local30--) {
			OpenGL.glActiveTexture(local30 + 33984);
			OpenGL.glTexEnvi(8960, 8704, 34160);
			OpenGL.glTexEnvi(8960, 34161, 8448);
			OpenGL.glTexEnvi(8960, 34178, 34166);
			OpenGL.glTexEnvi(8960, 34162, 8448);
			OpenGL.glTexEnvi(8960, 34186, 34166);
		}
		OpenGL.glTexEnvi(8960, 34186, 34168);
		OpenGL.glShadeModel(7425);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glColorMaterial(1028, 5634);
		OpenGL.glEnable(2903);
		@Pc(91) float[] local91 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(93) int local93 = 0; local93 < 8; local93++) {
			@Pc(100) int local100 = local93 + 16384;
			OpenGL.glLightfv(local100, 4608, local91, 0);
			OpenGL.glLightf(local100, 4615, 0.0F);
			OpenGL.glLightf(local100, 4616, 0.0F);
		}
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anOpenGL3.setSwapInterval(0);
		super.method21148();
	}

	@OriginalMember(owner = "client!aqi", name = "bl", descriptor = "()V")
	@Override
	public void method20683() {
		if (this.aBoolean498) {
			this.aClass99_19 = null;
			if (this.aClass108_Sub1_3 != null) {
				this.aClass108_Sub1_3.method24046();
				this.aClass108_Sub1_3 = null;
			}
			OpenGL.glDeleteBuffersARB(3, this.anIntArray252, 0);
			for (@Pc(21) int local21 = 0; local21 < 3; local21++) {
				this.anIntArray252[local21] = 0;
				if (this.aLongArray13[local21] != 0L) {
					OpenGL.glDeleteSync(this.aLongArray13[local21]);
					this.aLongArray13[local21] = 0L;
				}
			}
		} else {
			this.aClass108_Sub1_3 = null;
			this.aClass99_20 = null;
			this.aClass99_19 = null;
		}
		this.anInt2838 = 0;
		this.anInt2836 = 0;
	}

	@OriginalMember(owner = "client!aqi", name = "i", descriptor = "(II)V")
	@Override
	void method20947(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub2 {
		this.aClass108_Sub2_6.method24053();
		if (this.anInterface23_7 != null) {
			this.anInterface23_7.method7758(1736447784);
		}
	}

	@OriginalMember(owner = "client!aqi", name = "m", descriptor = "()V")
	@Override
	public void method20659() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!aqi", name = "am", descriptor = "(II)Lclient!de;")
	@Override
	public Interface17 method20689(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class534(this, Class210.aClass210_21, Class236.aClass236_22, arg0, arg1);
	}

	@OriginalMember(owner = "client!aqi", name = "al", descriptor = "(Ljava/awt/Canvas;II)Lclient!afr;")
	@Override
	Class108_Sub2 method20686(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return new Class108_Sub2_Sub1_Sub2(this, arg0);
	}

	@OriginalMember(owner = "client!aqi", name = "et", descriptor = "()Lclient!cf;")
	@Override
	public Class203 method20797() {
		@Pc(1) int local1 = -1;
		if (this.aString78.indexOf("nvidia") != -1) {
			local1 = 4318;
		} else if (this.aString78.indexOf("intel") != -1) {
			local1 = 32902;
		} else if (this.aString78.indexOf("ati") != -1) {
			local1 = 4098;
		}
		return new Class203(local1, this.method21245() ? "OpenGL FF" : "OpenGL", this.anInt2834, this.aString77, 0L, this.method21245());
	}

	@OriginalMember(owner = "client!aqi", name = "abe", descriptor = "()V")
	@Override
	void method21405() {
	}

	@OriginalMember(owner = "client!aqi", name = "un", descriptor = "(Lclient!co;Lclient!dy;)Z")
	@Override
	boolean method21205(@OriginalArg(0) Class210 arg0, @OriginalArg(1) Class236 arg1) {
		return this.aBoolean532;
	}

	@OriginalMember(owner = "client!aqi", name = "ak", descriptor = "(III)Lclient!de;")
	@Override
	public Interface17 method21115(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return new Class534(this, Class210.aClass210_21, Class236.aClass236_22, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!aqi", name = "afl", descriptor = "()V")
	@Override
	void method21493() {
		if (this.aBoolean526 && this.aBoolean522 && this.anInt2985 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!aqi", name = "ad", descriptor = "()V")
	@Override
	public void method20894() {
		if (this.aClass108_6 == null) {
			return;
		}
		@Pc(7) int local7 = this.aClass108_6.method24036();
		@Pc(11) int local11 = this.aClass108_6.method24037();
		if (local7 <= 0 && local11 <= 0) {
			return;
		}
		@Pc(19) int local19 = this.anInt2971;
		@Pc(22) int local22 = this.anInt2963;
		@Pc(25) int local25 = this.anInt2972;
		@Pc(28) int local28 = this.anInt2984;
		this.method20705();
		@Pc(33) int local33 = this.anInt2979;
		@Pc(36) int local36 = this.anInt2957;
		@Pc(39) int local39 = this.anInt2995;
		@Pc(42) int local42 = this.anInt2964;
		this.method20877();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method21218();
		this.method21241(false);
		this.method21194(false);
		this.method21190(false);
		this.method21191(false);
		this.method21429(null);
		this.method21297(1);
		this.method21235(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glDisable(3553);
		OpenGL.glCopyPixels(0, 0, local7, local11, 6144);
		OpenGL.glEnable(3553);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.method20986(local33, local39, local36, local42);
		this.method20706(local19, local22, local25, local28);
	}

	@OriginalMember(owner = "client!aqi", name = "av", descriptor = "()Z")
	@Override
	public boolean method20693() {
		return this.aBoolean498;
	}

	@OriginalMember(owner = "client!aqi", name = "act", descriptor = "(IIZ[III)Lclient!lb;")
	@Override
	Interface34 method21263(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return new Class140_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!aqi", name = "adr", descriptor = "()V")
	@Override
	void method21465() {
		this.aFloatArray54[0] = (float) (this.anInt2949 & 0xFF0000) / 1.671168E7F;
		this.aFloatArray54[1] = (float) (this.anInt2949 & 0xFF00) / 65280.0F;
		this.aFloatArray54[2] = (float) (this.anInt2949 & 0xFF) / 255.0F;
		this.aFloatArray54[3] = (float) (this.anInt2949 >>> 24) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, this.aFloatArray54, 0);
	}

	@OriginalMember(owner = "client!aqi", name = "ae", descriptor = "()Z")
	@Override
	public boolean method20696() {
		return false;
	}

	@OriginalMember(owner = "client!aqi", name = "rw", descriptor = "()Z")
	@Override
	public boolean method21287() {
		return this.aBoolean494;
	}

	@OriginalMember(owner = "client!aqi", name = "aiq", descriptor = "(I)V")
	synchronized void method20092(@OriginalArg(0) int arg0) {
		@Pc(4) Class80_Sub20 local4 = new Class80_Sub20(arg0);
		this.aClass8_34.method232(local4, 4100567);
	}

	@OriginalMember(owner = "client!aqi", name = "ar", descriptor = "()V")
	@Override
	public void method20698() {
		for (@Pc(1) int local1 = 0; local1 < 3; local1++) {
			if (this.aLongArray13[local1] != 0L) {
				OpenGL.glDeleteSync(this.aLongArray13[local1]);
				this.aLongArray13[local1] = 0L;
			}
		}
		this.anInt2838 = 0;
		this.anInt2836 = 0;
	}

	@OriginalMember(owner = "client!aqi", name = "az", descriptor = "(II)J")
	@Override
	public long method20700(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method20093(arg0, arg1, null, null);
	}

	@OriginalMember(owner = "client!aqi", name = "aci", descriptor = "(IIZ[III)Lclient!lb;")
	@Override
	Interface34 method21519(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return new Class140_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!aqi", name = "ahi", descriptor = "(II[I[I)J")
	long method20093(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		if (!this.aBoolean498) {
			if (this.aClass99_20 == null) {
				this.method20094(arg0, arg1);
			}
			if (this.aClass99_19 == null) {
				this.aClass99_19 = this.method20743(0, 0, this.aClass108_6.method24036(), this.aClass108_6.method24037(), false);
			} else {
				this.aClass99_19.method18223(0, 0, this.aClass108_6.method24036(), this.aClass108_6.method24037(), 0, 0);
			}
			this.method20684(this.aClass108_Sub1_3, -763710760);
			this.method20714(1, -16777216);
			this.aClass99_19.method18228(this.anInt2947 * 1069673649, this.anInt2932 * 262780429, this.anInt2948 * -244276243, this.anInt2936 * -69329917);
			this.aClass99_20.method18222(0, 0, arg0, arg1, arg2, arg3, 0, arg0);
			this.method20887(this.aClass108_Sub1_3, (byte) 1);
			return 0L;
		}
		if (this.aLongArray13[this.anInt2836] != 0L) {
			OpenGL.glDeleteSync(this.aLongArray13[this.anInt2836]);
			this.aLongArray13[this.anInt2836] = 0L;
		}
		OpenGL.glBindBufferARB(35051, this.anIntArray252[this.anInt2836]);
		@Pc(33) long local33 = OpenGL.glMapBufferARB(35051, 35000);
		if (arg2 != null) {
			for (@Pc(37) int local37 = 0; local37 < arg0 * arg1; local37++) {
				arg2[local37] = this.anUnsafe4.getInt(local33 + (long) (local37 * 4));
			}
			if (!OpenGL.glUnmapBufferARB(35051)) {
			}
			OpenGL.glBindBufferARB(35051, 0);
			local33 = 0L;
		}
		if (++this.anInt2836 >= 3) {
			this.anInt2836 = 0;
		}
		return local33;
	}

	@OriginalMember(owner = "client!aqi", name = "go", descriptor = "()Z")
	@Override
	public boolean method20995() {
		return !this.aBoolean498 || this.aLongArray13[this.anInt2838] == 0L;
	}

	@OriginalMember(owner = "client!aqi", name = "at", descriptor = "(IIII)[I")
	@Override
	public int[] method20691(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(8) int local8 = this.aClass108_6.method24037();
		for (@Pc(10) int local10 = 0; local10 < arg3; local10++) {
			OpenGL.glReadPixelsi(arg0, local8 - arg1 - local10 - 1, arg2, 1, 32993, this.anInt2837, local4, local10 * arg2);
		}
		return local4;
	}

	@OriginalMember(owner = "client!aqi", name = "aht", descriptor = "(II)V")
	void method20094(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method20683();
		this.method20703(arg0, arg1, (byte) 59);
		if (!this.aBoolean498) {
			this.aClass99_20 = this.method20739(arg0, arg1, false, true);
			this.aClass108_Sub1_3 = this.method20687();
			this.aClass108_Sub1_3.method23903(0, this.aClass99_20.method18231());
			return;
		}
		this.aClass99_20 = this.method20739(arg0, arg1, false, true);
		this.aClass108_Sub1_3 = this.method20687();
		this.aClass108_Sub1_3.method23903(0, this.aClass99_20.method18231());
		OpenGL.glGenBuffersARB(3, this.anIntArray252, 0);
		for (@Pc(35) int local35 = 0; local35 < 3; local35++) {
			OpenGL.glBindBufferARB(35051, this.anIntArray252[local35]);
			OpenGL.glBufferDataARBa(35051, arg0 * arg1 * 4, 0L, 35041);
			OpenGL.glBindBufferARB(35051, 0);
		}
	}

	@OriginalMember(owner = "client!aqi", name = "sw", descriptor = "(Lclient!pm;Lclient!pm;Lclient!pm;)V")
	@Override
	public void method21145(@OriginalArg(0) Class487 arg0, @OriginalArg(1) Class487 arg1, @OriginalArg(2) Class487 arg2) {
		OpenGL.glMatrixMode(5888);
		this.aClass487_80.method30068(arg0, arg1);
		OpenGL.glLoadMatrixf(this.aClass487_80.aFloatArray114, 0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(arg2.aFloatArray114, 0);
	}

	@OriginalMember(owner = "client!aqi", name = "be", descriptor = "(II)V")
	@Override
	public void method20714(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		if ((arg0 & 0x1) != 0) {
			OpenGL.glClearColor((float) (arg1 & 0xFF0000) / 1.671168E7F, (float) (arg1 & 0xFF00) / 65280.0F, (float) (arg1 & 0xFF) / 255.0F, (float) (arg1 >>> 24) / 255.0F);
			local1 = 16384;
		}
		if ((arg0 & 0x2) != 0) {
			this.method21191(true);
			local1 |= 0x100;
		}
		if ((arg0 & 0x4) != 0) {
			local1 |= 0x400;
		}
		OpenGL.glClear(local1);
	}

	@OriginalMember(owner = "client!aqi", name = "ta", descriptor = "()V")
	@Override
	void method21369() {
		if (this.aClass108_6 != null) {
			OpenGL.glViewport(this.anInt2989 + this.anInt2971, this.anInt2974 + this.aClass108_6.method24037() - this.anInt2963 - this.anInt2984, this.anInt2972, this.anInt2984);
		}
		OpenGL.glDepthRange(this.aFloat205, this.aFloat206);
	}

	@OriginalMember(owner = "client!aqi", name = "tk", descriptor = "()V")
	@Override
	void method21174() {
		if (this.aClass108_6 == null) {
			return;
		}
		@Pc(8) int local8 = this.anInt2989 + this.anInt2979;
		@Pc(18) int local18 = this.anInt2974 + this.aClass108_6.method24037() - this.anInt2964;
		@Pc(24) int local24 = this.anInt2957 - this.anInt2979;
		@Pc(30) int local30 = this.anInt2964 - this.anInt2995;
		if (local24 < 0) {
			local24 = 0;
		}
		if (local30 < 0) {
			local30 = 0;
		}
		OpenGL.glScissor(local8, local18, local24, local30);
	}

	@OriginalMember(owner = "client!aqi", name = "ahf", descriptor = "(Ljava/lang/String;)[B")
	byte[] method20095(@OriginalArg(0) String arg0) {
		return this.method21143("gl", arg0);
	}

	@OriginalMember(owner = "client!aqi", name = "aan", descriptor = "()V")
	@Override
	void method21521() {
		OpenGL.glDepthMask(this.aBoolean515 && this.aBoolean535);
	}

	@OriginalMember(owner = "client!aqi", name = "tp", descriptor = "(Lclient!pm;)V")
	@Override
	public void method21243(@OriginalArg(0) Class487 arg0) {
		@Pc(2) float[] local2 = arg0.aFloatArray114;
		local2[1] = -local2[1];
		local2[5] = -local2[5];
		local2[9] = -local2[9];
		local2[13] = -local2[13];
	}

	@OriginalMember(owner = "client!aqi", name = "tb", descriptor = "()V")
	@Override
	void method21169() {
		if (this.aBoolean516 && this.aBoolean517) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
	}

	@OriginalMember(owner = "client!aqi", name = "tj", descriptor = "()V")
	@Override
	void method21192() {
		OpenGL.glDepthMask(this.aBoolean515 && this.aBoolean535);
	}

	@OriginalMember(owner = "client!aqi", name = "gv", descriptor = "()Z")
	@Override
	public boolean method20849() {
		return !this.aBoolean498 || this.aLongArray13[this.anInt2838] == 0L;
	}

	@OriginalMember(owner = "client!aqi", name = "us", descriptor = "()V")
	@Override
	void method21197() {
		this.aFloatArray54[0] = this.aFloat212 * this.aFloat208;
		this.aFloatArray54[1] = this.aFloat212 * this.aFloat209;
		this.aFloatArray54[2] = this.aFloat212 * this.aFloat210;
		this.aFloatArray54[3] = 1.0F;
		OpenGL.glLightModelfv(2899, this.aFloatArray54, 0);
	}

	@OriginalMember(owner = "client!aqi", name = "uc", descriptor = "()V")
	@Override
	void method21247() {
		this.aFloatArray54[0] = this.aFloat214 * this.aFloat208;
		this.aFloatArray54[1] = this.aFloat214 * this.aFloat209;
		this.aFloatArray54[2] = this.aFloat214 * this.aFloat210;
		this.aFloatArray54[3] = 1.0F;
		OpenGL.glLightfv(16384, 4609, this.aFloatArray54, 0);
		this.aFloatArray54[0] = -this.aFloat216 * this.aFloat208;
		this.aFloatArray54[1] = -this.aFloat216 * this.aFloat209;
		this.aFloatArray54[2] = -this.aFloat216 * this.aFloat210;
		this.aFloatArray54[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, this.aFloatArray54, 0);
	}

	@OriginalMember(owner = "client!aqi", name = "uj", descriptor = "()V")
	@Override
	void method21199() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(this.aClass487_75.aFloatArray114, 0);
		OpenGL.glLightfv(16384, 4611, this.aFloatArray68, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray67, 0);
	}

	@OriginalMember(owner = "client!aqi", name = "up", descriptor = "()V")
	@Override
	void method21201() {
		if (this.aBoolean519) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	@OriginalMember(owner = "client!aqi", name = "uh", descriptor = "()V")
	@Override
	void method21285() {
	}

	@OriginalMember(owner = "client!aqi", name = "ug", descriptor = "()V")
	@Override
	void method21157() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(this.aClass487_75.aFloatArray114, 0);
		@Pc(8) int local8;
		for (local8 = 0; local8 < this.anInt2978; local8++) {
			@Pc(17) Class80_Sub12 local17 = this.aClass80_Sub12Array19[local8];
			@Pc(21) int local21 = local17.method13953((byte) 78);
			@Pc(25) int local25 = local8 + 16386;
			@Pc(31) float local31 = local17.method13954(1856658900) / 255.0F;
			this.aFloatArray54[0] = local17.method13949((byte) 0);
			this.aFloatArray54[1] = local17.method13950(-1930206767);
			this.aFloatArray54[2] = local17.method13970(-779187814);
			this.aFloatArray54[3] = 1.0F;
			OpenGL.glLightfv(local25, 4611, this.aFloatArray54, 0);
			this.aFloatArray54[0] = (float) (local21 >> 16 & 0xFF) * local31;
			this.aFloatArray54[1] = (float) (local21 >> 8 & 0xFF) * local31;
			this.aFloatArray54[2] = (float) (local21 & 0xFF) * local31;
			this.aFloatArray54[3] = 1.0F;
			OpenGL.glLightfv(local25, 4609, this.aFloatArray54, 0);
			OpenGL.glLightf(local25, 4617, 1.0F / (float) (local17.method13952(-432544427) * local17.method13952(-432544427)));
			OpenGL.glEnable(local25);
		}
		while (local8 < this.anInt2977) {
			OpenGL.glDisable(local8 + 16386);
			local8++;
		}
	}

	@OriginalMember(owner = "client!aqi", name = "ul", descriptor = "(Lclient!co;Lclient!dy;)Z")
	@Override
	boolean method21204(@OriginalArg(0) Class210 arg0, @OriginalArg(1) Class236 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!aqi", name = "abd", descriptor = "()V")
	@Override
	void method21400() {
		if (this.aBoolean511 && !this.aBoolean520) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!aqi", name = "uo", descriptor = "(Lclient!co;Lclient!dy;II)Lclient!lb;")
	@Override
	Interface34 method21209(@OriginalArg(0) Class210 arg0, @OriginalArg(1) Class236 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return this.method21215(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!aqi", name = "uu", descriptor = "(IIZ[III)Lclient!lb;")
	@Override
	Interface34 method21304(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return new Class140_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!aqi", name = "acp", descriptor = "(Lclient!co;Lclient!dy;II)Lclient!mg;")
	@Override
	Interface40 method21436(@OriginalArg(0) Class210 arg0, @OriginalArg(1) Class236 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return new Class140_Sub2(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!aqi", name = "ap", descriptor = "()I")
	@Override
	public int method20697() {
		if (!this.aBoolean498) {
			return -1;
		} else if (this.aLongArray13[this.anInt2836] == 0L) {
			return -1;
		} else {
			@Pc(21) int local21 = OpenGL.glClientWaitSync(this.aLongArray13[this.anInt2836], 0, 0);
			if (local21 == 37149) {
				this.method20698();
				return -1;
			} else if (local21 == 37147) {
				return -1;
			} else {
				return this.anIntArray249[this.anInt2836];
			}
		}
	}

	@OriginalMember(owner = "client!aqi", name = "ui", descriptor = "(Lclient!co;Lclient!dy;II)Lclient!mg;")
	@Override
	Interface40 method21215(@OriginalArg(0) Class210 arg0, @OriginalArg(1) Class236 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return new Class140_Sub2(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!aqi", name = "afg", descriptor = "()V")
	@Override
	void method21288() {
		if (this.aBoolean514) {
			OpenGL.glEnable(3042);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!aqi", name = "ub", descriptor = "(Lclient!co;IIIZ[B)Lclient!ll;")
	@Override
	Interface36 method21510(@OriginalArg(0) Class210 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5) {
		return new Class140_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!aqi", name = "uw", descriptor = "()V")
	@Override
	public void method21162() {
		@Pc(5) int local5 = this.anIntArray251[this.anInt2983];
		if (local5 != 0) {
			this.anIntArray251[this.anInt2983] = 0;
			OpenGL.glBindTexture(local5, 0);
			OpenGL.glDisable(local5);
		}
	}

	@OriginalMember(owner = "client!aqi", name = "ahr", descriptor = "(II[I[I)J")
	long method20096(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		if (!this.aBoolean498) {
			if (this.aClass99_20 == null) {
				this.method20094(arg0, arg1);
			}
			if (this.aClass99_19 == null) {
				this.aClass99_19 = this.method20743(0, 0, this.aClass108_6.method24036(), this.aClass108_6.method24037(), false);
			} else {
				this.aClass99_19.method18223(0, 0, this.aClass108_6.method24036(), this.aClass108_6.method24037(), 0, 0);
			}
			this.method20684(this.aClass108_Sub1_3, 1319042899);
			this.method20714(1, -16777216);
			this.aClass99_19.method18228(this.anInt2947 * 1069673649, this.anInt2932 * 262780429, this.anInt2948 * -244276243, this.anInt2936 * -69329917);
			this.aClass99_20.method18222(0, 0, arg0, arg1, arg2, arg3, 0, arg0);
			this.method20887(this.aClass108_Sub1_3, (byte) 1);
			return 0L;
		}
		if (this.aLongArray13[this.anInt2836] != 0L) {
			OpenGL.glDeleteSync(this.aLongArray13[this.anInt2836]);
			this.aLongArray13[this.anInt2836] = 0L;
		}
		OpenGL.glBindBufferARB(35051, this.anIntArray252[this.anInt2836]);
		@Pc(33) long local33 = OpenGL.glMapBufferARB(35051, 35000);
		if (arg2 != null) {
			for (@Pc(37) int local37 = 0; local37 < arg0 * arg1; local37++) {
				arg2[local37] = this.anUnsafe4.getInt(local33 + (long) (local37 * 4));
			}
			if (!OpenGL.glUnmapBufferARB(35051)) {
			}
			OpenGL.glBindBufferARB(35051, 0);
			local33 = 0L;
		}
		if (++this.anInt2836 >= 3) {
			this.anInt2836 = 0;
		}
		return local33;
	}

	@OriginalMember(owner = "client!aqi", name = "aav", descriptor = "()V")
	@Override
	void method21399() {
		OpenGL.glDepthMask(this.aBoolean515 && this.aBoolean535);
	}

	@OriginalMember(owner = "client!aqi", name = "vk", descriptor = "()V")
	@Override
	void method21232() {
		OpenGL.glTexEnvi(8960, 34161, method20118(this.aClass412Array5[this.anInt2983]));
	}

	@OriginalMember(owner = "client!aqi", name = "afw", descriptor = "()V")
	@Override
	void method21492() {
		if (this.aBoolean514) {
			OpenGL.glEnable(3042);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!aqi", name = "vu", descriptor = "(ILclient!mh;ZZ)V")
	@Override
	void method21152(@OriginalArg(0) int arg0, @OriginalArg(1) Class417 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		OpenGL.glTexEnvi(8960, arg0 + 34176, method20105(arg1));
		if (arg2) {
			OpenGL.glTexEnvi(8960, arg0 + 34192, arg3 ? 771 : 770);
		} else {
			OpenGL.glTexEnvi(8960, arg0 + 34192, arg3 ? 769 : 768);
		}
	}

	@OriginalMember(owner = "client!aqi", name = "vf", descriptor = "(ILclient!mh;Z)V")
	@Override
	void method21223(@OriginalArg(0) int arg0, @OriginalArg(1) Class417 arg1, @OriginalArg(2) boolean arg2) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, method20105(arg1));
		OpenGL.glTexEnvi(8960, arg0 + 34200, arg2 ? 771 : 770);
	}

	@OriginalMember(owner = "client!aqi", name = "vq", descriptor = "()V")
	@Override
	void method21229() {
		this.aFloatArray54[0] = (float) (this.anInt2949 & 0xFF0000) / 1.671168E7F;
		this.aFloatArray54[1] = (float) (this.anInt2949 & 0xFF00) / 65280.0F;
		this.aFloatArray54[2] = (float) (this.anInt2949 & 0xFF) / 255.0F;
		this.aFloatArray54[3] = (float) (this.anInt2949 >>> 24) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, this.aFloatArray54, 0);
	}

	@OriginalMember(owner = "client!aqi", name = "in", descriptor = "(II)V")
	@Override
	public void method20885(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		if ((arg0 & 0x1) != 0) {
			OpenGL.glClearColor((float) (arg1 & 0xFF0000) / 1.671168E7F, (float) (arg1 & 0xFF00) / 65280.0F, (float) (arg1 & 0xFF) / 255.0F, (float) (arg1 >>> 24) / 255.0F);
			local1 = 16384;
		}
		if ((arg0 & 0x2) != 0) {
			this.method21191(true);
			local1 |= 0x100;
		}
		if ((arg0 & 0x4) != 0) {
			local1 |= 0x400;
		}
		OpenGL.glClear(local1);
	}

	@OriginalMember(owner = "client!aqi", name = "vh", descriptor = "()V")
	@Override
	void method21230() {
		OpenGL.glMatrixMode(5890);
		if (this.aClass422Array3[this.anInt2983] == Class422.aClass422_2) {
			OpenGL.glLoadIdentity();
		} else {
			OpenGL.glLoadMatrixf(this.aClass487Array6[this.anInt2983].method30102(this.aFloatArray55), 0);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!aqi", name = "hf", descriptor = "(J)V")
	@Override
	public void method20761(@OriginalArg(0) long arg0) {
		if (arg0 != 0L) {
			if (!OpenGL.glUnmapBufferARB(35051)) {
			}
			OpenGL.glBindBufferARB(35051, 0);
		}
	}

	@OriginalMember(owner = "client!aqi", name = "vp", descriptor = "()V")
	@Override
	void method21238() {
		if (this.aBoolean528) {
			OpenGL.glEnable(3008);
		} else {
			OpenGL.glDisable(3008);
		}
		OpenGL.glAlphaFunc(516, (float) (this.aByte76 & 0xFF) / 255.0F);
		if (this.anInt2994 <= 1) {
			return;
		}
		if (this.aByte76 == 0) {
			OpenGL.glDisable(32926);
		} else {
			OpenGL.glEnable(32926);
		}
	}

	@OriginalMember(owner = "client!aqi", name = "va", descriptor = "()V")
	@Override
	void method21464() {
		if (this.aBoolean534) {
			@Pc(4) byte local4 = 0;
			@Pc(6) byte local6 = 0;
			if (this.anInt2992 == 0) {
				local4 = 0;
				local6 = 0;
			} else if (this.anInt2992 == 1) {
				local4 = 1;
				local6 = 0;
			} else if (this.anInt2992 == 2) {
				local4 = 1;
				local6 = 1;
			} else if (this.anInt2992 == 3) {
				local4 = 0;
				local6 = 1;
			}
			if (this.aClass428_3 == Class428.aClass428_6) {
				OpenGL.glBlendFuncSeparate(770, 771, local4, local6);
			} else if (this.aClass428_3 == Class428.aClass428_4) {
				OpenGL.glBlendFuncSeparate(1, 1, local4, local6);
			} else if (this.aClass428_3 == Class428.aClass428_7) {
				OpenGL.glBlendFuncSeparate(774, 1, local4, local6);
			} else if (this.aClass428_3 == Class428.aClass428_5) {
				OpenGL.glBlendFuncSeparate(1, 0, local4, local6);
			}
		} else if (this.aClass428_3 == Class428.aClass428_6) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(770, 771);
		} else if (this.aClass428_3 == Class428.aClass428_4) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(1, 1);
		} else if (this.aClass428_3 == Class428.aClass428_7) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(774, 1);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!aqi", name = "vm", descriptor = "()V")
	@Override
	void method21240() {
		if (this.aBoolean514) {
			OpenGL.glEnable(3042);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!aqi", name = "ahp", descriptor = "()V")
	void method20097() {
		if (this.anInt2993 == 1) {
			OpenGL.glDisable(2884);
			return;
		}
		OpenGL.glEnable(2884);
		if (this.anInt2993 == 2) {
			OpenGL.glCullFace(1029);
		} else if (this.anInt2993 == 3) {
			OpenGL.glCullFace(1028);
		}
	}

	@OriginalMember(owner = "client!aqi", name = "ou", descriptor = "(I)V")
	@Override
	public synchronized void method21054(@OriginalArg(0) int arg0) {
		try {
			this.method20104();
		} catch (@Pc(3) Exception local3) {
			return;
		}
		@Pc(6) int local6 = 0;
		@Pc(10) int local10 = arg0 & Integer.MAX_VALUE;
		@Pc(21) Class80_Sub20 local21;
		while (!this.aClass8_38.method240(774960953)) {
			local21 = (Class80_Sub20) this.aClass8_38.method233(626494371);
			this.anIntArray250[local6++] = (int) (local21.aLong338 * 3209506792906532031L);
			this.anInt2959 -= local21.anInt1588 * 701000167;
			if (local6 == 1000) {
				OpenGL.glDeleteBuffersARB(local6, this.anIntArray250, 0);
				local6 = 0;
			}
		}
		if (local6 > 0) {
			OpenGL.glDeleteBuffersARB(local6, this.anIntArray250, 0);
			local6 = 0;
		}
		while (!this.aClass8_33.method240(-616654344)) {
			local21 = (Class80_Sub20) this.aClass8_33.method233(293938277);
			this.anIntArray250[local6++] = (int) (local21.aLong338 * 3209506792906532031L);
			this.anInt3001 -= local21.anInt1588 * 701000167;
			if (local6 == 1000) {
				OpenGL.glDeleteTextures(local6, this.anIntArray250, 0);
				local6 = 0;
			}
		}
		if (local6 > 0) {
			OpenGL.glDeleteTextures(local6, this.anIntArray250, 0);
			local6 = 0;
		}
		while (!this.aClass8_34.method240(-1877979944)) {
			local21 = (Class80_Sub20) this.aClass8_34.method233(-418406496);
			this.anIntArray250[local6++] = local21.anInt1588 * 701000167;
			if (local6 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local6, this.anIntArray250, 0);
				local6 = 0;
			}
		}
		if (local6 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local6, this.anIntArray250, 0);
			local6 = 0;
		}
		while (!this.aClass8_35.method240(-628951831)) {
			local21 = (Class80_Sub20) this.aClass8_35.method233(-568436388);
			this.anIntArray250[local6++] = (int) (local21.aLong338 * 3209506792906532031L);
			this.anInt2960 -= local21.anInt1588 * 701000167;
			if (local6 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local6, this.anIntArray250, 0);
				local6 = 0;
			}
		}
		if (local6 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local6, this.anIntArray250, 0);
			@Pc(200) boolean local200 = false;
		}
		while (!this.aClass8_36.method240(-1022256328)) {
			local21 = (Class80_Sub20) this.aClass8_36.method233(974047057);
			OpenGL.glDeleteLists((int) (local21.aLong338 * 3209506792906532031L), local21.anInt1588 * 701000167);
		}
		@Pc(232) Class80 local232;
		while (!this.aClass8_37.method240(583218848)) {
			local232 = this.aClass8_37.method233(378341778);
			OpenGL.glDeleteProgram((int) (local232.aLong338 * 3209506792906532031L));
		}
		while (!this.aClass8_39.method240(-314695206)) {
			local232 = this.aClass8_39.method233(-315281869);
			OpenGL.glDeleteShader((int) (local232.aLong338 * 3209506792906532031L));
		}
		while (!this.aClass8_36.method240(85276018)) {
			local21 = (Class80_Sub20) this.aClass8_36.method233(1395958328);
			OpenGL.glDeleteLists((int) (local21.aLong338 * 3209506792906532031L), local21.anInt1588 * 701000167);
		}
		if (this.method20911() > 100663296 && Class303.method27111((byte) 95) > this.aLong160 + 60000L) {
			System.gc();
			this.aLong160 = Class303.method27111((byte) 58);
		}
		super.method20662(local10);
	}

	@OriginalMember(owner = "client!aqi", name = "vl", descriptor = "()V")
	@Override
	void method21295() {
		this.aFloat218 = this.aFloat202 - (float) this.anInt2990;
		this.aFloat217 = this.aFloat218 - (float) this.anInt2985;
		if (this.aFloat217 < this.aFloat215) {
			this.aFloat217 = this.aFloat215;
		}
		if (!this.aBoolean518) {
			return;
		}
		OpenGL.glFogf(2915, this.aFloat217);
		OpenGL.glFogf(2916, this.aFloat218);
		this.aFloatArray54[0] = (float) (this.anInt2965 & 0xFF0000) / 1.671168E7F;
		this.aFloatArray54[1] = (float) (this.anInt2965 & 0xFF00) / 65280.0F;
		this.aFloatArray54[2] = (float) (this.anInt2965 & 0xFF) / 255.0F;
		OpenGL.glFogfv(2918, this.aFloatArray54, 0);
	}

	@OriginalMember(owner = "client!aqi", name = "as", descriptor = "(J)V")
	@Override
	public void method20701(@OriginalArg(0) long arg0) {
		if (arg0 != 0L) {
			if (!OpenGL.glUnmapBufferARB(35051)) {
			}
			OpenGL.glBindBufferARB(35051, 0);
		}
	}

	@OriginalMember(owner = "client!aqi", name = "wg", descriptor = "(Z)Lclient!lx;")
	@Override
	Interface38 method21239(@OriginalArg(0) boolean arg0) {
		return new Class142_Sub2(this, arg0);
	}

	@OriginalMember(owner = "client!aqi", name = "wu", descriptor = "(Lclient!ld;)V")
	@Override
	public void method21158(@OriginalArg(0) Class135 arg0) {
		@Pc(2) Class397[] local2 = arg0.aClass397Array3;
		@Pc(4) int local4 = 0;
		@Pc(6) boolean local6 = false;
		@Pc(8) boolean local8 = false;
		@Pc(10) boolean local10 = false;
		@Pc(12) int local12;
		for (local12 = 0; local12 < local2.length; local12++) {
			@Pc(20) Class397 local20 = local2[local12];
			@Pc(25) Class142_Sub2 local25 = this.aClass142_Sub2Array1[local12];
			@Pc(27) int local27 = 0;
			@Pc(30) int local30 = local25.method11305();
			@Pc(33) long local33 = local25.method11280();
			local25.method11273();
			for (@Pc(37) int local37 = 0; local37 < local20.method28707(); local37++) {
				@Pc(45) Class400 local45 = local20.method28708(local37);
				switch(local45.anInt4567) {
					case 0:
						OpenGL.glColorPointer(4, 5121, local30, local33 + (long) local27);
						local6 = true;
						break;
					case 1:
						OpenGL.glClientActiveTexture(local4++ + 33984);
						OpenGL.glTexCoordPointer(4, 5126, local30, local33 + (long) local27);
					case 2:
					case 5:
					case 8:
					default:
						break;
					case 3:
						OpenGL.glNormalPointer(5126, local30, local33 + (long) local27);
						local8 = true;
						break;
					case 4:
						OpenGL.glClientActiveTexture(local4++ + 33984);
						OpenGL.glTexCoordPointer(3, 5126, local30, local33 + (long) local27);
						break;
					case 6:
						OpenGL.glClientActiveTexture(local4++ + 33984);
						OpenGL.glTexCoordPointer(1, 5126, local30, local33 + (long) local27);
						break;
					case 7:
						OpenGL.glVertexPointer(3, 5126, local30, local33 + (long) local27);
						local10 = true;
						break;
					case 9:
						OpenGL.glClientActiveTexture(local4++ + 33984);
						OpenGL.glTexCoordPointer(2, 5126, local30, local33 + (long) local27);
				}
				local27 += local45.anInt4572;
			}
		}
		if (this.aBoolean490 != local10) {
			if (local10) {
				OpenGL.glEnableClientState(32884);
			} else {
				OpenGL.glDisableClientState(32884);
			}
			this.aBoolean490 = local10;
		}
		if (this.aBoolean491 != local8) {
			if (local8) {
				OpenGL.glEnableClientState(32885);
			} else {
				OpenGL.glDisableClientState(32885);
			}
			this.aBoolean491 = local8;
		}
		if (this.aBoolean489 != local6) {
			if (local6) {
				OpenGL.glEnableClientState(32886);
			} else {
				OpenGL.glDisableClientState(32886);
			}
			this.aBoolean489 = local6;
		}
		if (this.anInt2833 < local4) {
			for (local12 = this.anInt2833; local12 < local4; local12++) {
				OpenGL.glClientActiveTexture(local12 + 33984);
				OpenGL.glEnableClientState(32888);
			}
			this.anInt2833 = local4;
		} else if (this.anInt2833 > local4) {
			for (local12 = local4; local12 < this.anInt2833; local12++) {
				OpenGL.glClientActiveTexture(local12 + 33984);
				OpenGL.glDisableClientState(32888);
			}
			this.anInt2833 = local4;
		}
	}

	@OriginalMember(owner = "client!aqi", name = "wk", descriptor = "([Lclient!lf;)Lclient!ld;")
	@Override
	Class135 method21248(@OriginalArg(0) Class397[] arg0) {
		return new Class135_Sub1(arg0);
	}

	@OriginalMember(owner = "client!aqi", name = "wp", descriptor = "(ILclient!lx;)V")
	@Override
	public void method21250(@OriginalArg(0) int arg0, @OriginalArg(1) Interface38 arg1) {
		this.aClass142_Sub2Array1[arg0] = (Class142_Sub2) arg1;
	}

	@OriginalMember(owner = "client!aqi", name = "ah", descriptor = "()Lclient!afo;")
	@Override
	public Class108_Sub1 method20687() {
		return new Class108_Sub1_Sub1_Sub1(this);
	}

	@OriginalMember(owner = "client!aqi", name = "vw", descriptor = "()V")
	@Override
	void method21360() {
		OpenGL.glTexEnvi(8960, 34162, method20118(this.aClass412Array6[this.anInt2983]));
	}

	@OriginalMember(owner = "client!aqi", name = "wq", descriptor = "(Lclient!md;II)V")
	@Override
	public void method21257(@OriginalArg(0) Class415 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) byte local4;
		@Pc(8) int local8;
		if (arg0 == Class415.aClass415_3) {
			local4 = 1;
			local8 = arg2 * 2;
		} else if (arg0 == Class415.aClass415_2) {
			local4 = 3;
			local8 = arg2 + 1;
		} else if (arg0 == Class415.aClass415_6) {
			local4 = 4;
			local8 = arg2 * 3;
		} else if (arg0 == Class415.aClass415_4) {
			local4 = 6;
			local8 = arg2 + 2;
		} else if (arg0 == Class415.aClass415_5) {
			local4 = 5;
			local8 = arg2 + 2;
		} else {
			local4 = 0;
			local8 = arg2;
		}
		OpenGL.glDrawArrays(local4, arg1, local8);
	}

	@OriginalMember(owner = "client!aqi", name = "aes", descriptor = "()V")
	@Override
	void method21486() {
		if (this.aBoolean534) {
			@Pc(4) byte local4 = 0;
			@Pc(6) byte local6 = 0;
			if (this.anInt2992 == 0) {
				local4 = 0;
				local6 = 0;
			} else if (this.anInt2992 == 1) {
				local4 = 1;
				local6 = 0;
			} else if (this.anInt2992 == 2) {
				local4 = 1;
				local6 = 1;
			} else if (this.anInt2992 == 3) {
				local4 = 0;
				local6 = 1;
			}
			if (this.aClass428_3 == Class428.aClass428_6) {
				OpenGL.glBlendFuncSeparate(770, 771, local4, local6);
			} else if (this.aClass428_3 == Class428.aClass428_4) {
				OpenGL.glBlendFuncSeparate(1, 1, local4, local6);
			} else if (this.aClass428_3 == Class428.aClass428_7) {
				OpenGL.glBlendFuncSeparate(774, 1, local4, local6);
			} else if (this.aClass428_3 == Class428.aClass428_5) {
				OpenGL.glBlendFuncSeparate(1, 0, local4, local6);
			}
		} else if (this.aClass428_3 == Class428.aClass428_6) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(770, 771);
		} else if (this.aClass428_3 == Class428.aClass428_4) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(1, 1);
		} else if (this.aClass428_3 == Class428.aClass428_7) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(774, 1);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!aqi", name = "gz", descriptor = "(IIII)[I")
	@Override
	public int[] method20835(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(8) int local8 = this.aClass108_6.method24037();
		for (@Pc(10) int local10 = 0; local10 < arg3; local10++) {
			OpenGL.glReadPixelsi(arg0, local8 - arg1 - local10 - 1, arg2, 1, 32993, this.anInt2837, local4, local10 * arg2);
		}
		return local4;
	}

	@OriginalMember(owner = "client!aqi", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method20662(@OriginalArg(0) int arg0) {
		try {
			this.method20104();
		} catch (@Pc(3) Exception local3) {
			return;
		}
		@Pc(6) int local6 = 0;
		@Pc(10) int local10 = arg0 & Integer.MAX_VALUE;
		@Pc(21) Class80_Sub20 local21;
		while (!this.aClass8_38.method240(-973485068)) {
			local21 = (Class80_Sub20) this.aClass8_38.method233(1515750657);
			this.anIntArray250[local6++] = (int) (local21.aLong338 * 3209506792906532031L);
			this.anInt2959 -= local21.anInt1588 * 701000167;
			if (local6 == 1000) {
				OpenGL.glDeleteBuffersARB(local6, this.anIntArray250, 0);
				local6 = 0;
			}
		}
		if (local6 > 0) {
			OpenGL.glDeleteBuffersARB(local6, this.anIntArray250, 0);
			local6 = 0;
		}
		while (!this.aClass8_33.method240(-689843576)) {
			local21 = (Class80_Sub20) this.aClass8_33.method233(-71585903);
			this.anIntArray250[local6++] = (int) (local21.aLong338 * 3209506792906532031L);
			this.anInt3001 -= local21.anInt1588 * 701000167;
			if (local6 == 1000) {
				OpenGL.glDeleteTextures(local6, this.anIntArray250, 0);
				local6 = 0;
			}
		}
		if (local6 > 0) {
			OpenGL.glDeleteTextures(local6, this.anIntArray250, 0);
			local6 = 0;
		}
		while (!this.aClass8_34.method240(830789618)) {
			local21 = (Class80_Sub20) this.aClass8_34.method233(-29782901);
			this.anIntArray250[local6++] = local21.anInt1588 * 701000167;
			if (local6 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local6, this.anIntArray250, 0);
				local6 = 0;
			}
		}
		if (local6 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local6, this.anIntArray250, 0);
			local6 = 0;
		}
		while (!this.aClass8_35.method240(-122028199)) {
			local21 = (Class80_Sub20) this.aClass8_35.method233(1531243460);
			this.anIntArray250[local6++] = (int) (local21.aLong338 * 3209506792906532031L);
			this.anInt2960 -= local21.anInt1588 * 701000167;
			if (local6 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local6, this.anIntArray250, 0);
				local6 = 0;
			}
		}
		if (local6 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local6, this.anIntArray250, 0);
			@Pc(200) boolean local200 = false;
		}
		while (!this.aClass8_36.method240(191065364)) {
			local21 = (Class80_Sub20) this.aClass8_36.method233(1118331214);
			OpenGL.glDeleteLists((int) (local21.aLong338 * 3209506792906532031L), local21.anInt1588 * 701000167);
		}
		@Pc(232) Class80 local232;
		while (!this.aClass8_37.method240(-308420123)) {
			local232 = this.aClass8_37.method233(71067145);
			OpenGL.glDeleteProgram((int) (local232.aLong338 * 3209506792906532031L));
		}
		while (!this.aClass8_39.method240(-183423119)) {
			local232 = this.aClass8_39.method233(-385046721);
			OpenGL.glDeleteShader((int) (local232.aLong338 * 3209506792906532031L));
		}
		while (!this.aClass8_36.method240(878235046)) {
			local21 = (Class80_Sub20) this.aClass8_36.method233(-211602693);
			OpenGL.glDeleteLists((int) (local21.aLong338 * 3209506792906532031L), local21.anInt1588 * 701000167);
		}
		if (this.method20911() > 100663296 && Class303.method27111((byte) 66) > this.aLong160 + 60000L) {
			System.gc();
			this.aLong160 = Class303.method27111((byte) 58);
		}
		super.method20662(local10);
	}

	@OriginalMember(owner = "client!aqi", name = "ahj", descriptor = "(II)V")
	synchronized void method20098(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class80_Sub20 local4 = new Class80_Sub20(arg1);
		local4.aLong338 = (long) arg0 * 6850079459805481791L;
		this.aClass8_38.method232(local4, 1986193576);
	}

	@OriginalMember(owner = "client!aqi", name = "uk", descriptor = "()V")
	@Override
	void method21196() {
		if (this.aBoolean511 && !this.aBoolean520) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!aqi", name = "ahg", descriptor = "(I)V")
	synchronized void method20099(@OriginalArg(0) int arg0) {
		@Pc(4) Class80_Sub20 local4 = new Class80_Sub20(arg0);
		this.aClass8_34.method232(local4, 1107518861);
	}

	@OriginalMember(owner = "client!aqi", name = "ahe", descriptor = "(II)V")
	synchronized void method20100(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class80_Sub20 local4 = new Class80_Sub20(arg1);
		local4.aLong338 = (long) arg0 * 6850079459805481791L;
		this.aClass8_35.method232(local4, 1955135310);
	}

	@OriginalMember(owner = "client!aqi", name = "aft", descriptor = "(ILclient!lx;)V")
	@Override
	public void method21284(@OriginalArg(0) int arg0, @OriginalArg(1) Interface38 arg1) {
		this.aClass142_Sub2Array1[arg0] = (Class142_Sub2) arg1;
	}

	@OriginalMember(owner = "client!aqi", name = "ahz", descriptor = "(I)V")
	synchronized void method20101(@OriginalArg(0) int arg0) {
		@Pc(3) Class80 local3 = new Class80();
		local3.aLong338 = (long) arg0 * 6850079459805481791L;
		this.aClass8_37.method232(local3, 1254834469);
	}

	@OriginalMember(owner = "client!aqi", name = "fg", descriptor = "()Ljava/lang/String;")
	@Override
	public String method20827() {
		@Pc(1) String local1 = "Caps: 4:";
		@Pc(3) String local3 = ":";
		@Pc(15) String local15 = local1 + this.anInt2994 + local3;
		@Pc(27) String local27 = local15 + this.anInt2837 + local3;
		@Pc(39) String local39 = local27 + this.anInt2998 + local3;
		@Pc(51) String local51 = local39 + this.anInt2999 + local3;
		@Pc(67) String local67 = local51 + (this.aBoolean492 ? 1 : 0) + local3;
		@Pc(83) String local83 = local67 + (this.aBoolean531 ? 1 : 0) + local3;
		@Pc(99) String local99 = local83 + (this.aBoolean495 ? 1 : 0) + local3;
		@Pc(115) String local115 = local99 + (this.aBoolean497 ? 1 : 0) + local3;
		@Pc(131) String local131 = local115 + (this.aBoolean494 ? 1 : 0) + local3;
		@Pc(147) String local147 = local131 + (this.aBoolean496 ? 1 : 0) + local3;
		@Pc(163) String local163 = local147 + (this.aBoolean532 ? 1 : 0) + local3;
		@Pc(179) String local179 = local163 + (this.aBoolean493 ? 1 : 0) + local3;
		@Pc(195) String local195 = local179 + (this.aBoolean509 ? 1 : 0) + local3;
		@Pc(211) String local211 = local195 + (this.aBoolean500 ? 1 : 0) + local3;
		@Pc(227) String local227 = local211 + (this.aBoolean529 ? 1 : 0) + local3;
		@Pc(243) String local243 = local227 + (this.aBoolean523 ? 1 : 0) + local3;
		@Pc(259) String local259 = local243 + (this.aBoolean530 ? 1 : 0) + local3;
		@Pc(275) String local275 = local259 + (this.aBoolean534 ? 1 : 0) + local3;
		return local275 + OpenGL.glGetString(35724).toLowerCase();
	}

	@OriginalMember(owner = "client!aqi", name = "em", descriptor = "(Z)V")
	@Override
	public void method20795(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!aqi", name = "ahx", descriptor = "()V")
	void method20104() {
		@Pc(1) int local1 = 0;
		while (!this.anOpenGL3.f()) {
			if (local1++ > 5) {
				throw new RuntimeException("");
			}
			Class217.method25866(1000L);
		}
	}

	@OriginalMember(owner = "client!aqi", name = "eq", descriptor = "()V")
	@Override
	void method20807() {
		super.method20661();
		if (this.anOpenGL3 != null) {
			this.anOpenGL3.e();
			this.anOpenGL3.release();
			this.anOpenGL3 = null;
		}
	}

	@OriginalMember(owner = "client!aqi", name = "y", descriptor = "()Ljava/lang/String;")
	@Override
	public String method21048() {
		@Pc(1) String local1 = "Caps: 4:";
		@Pc(3) String local3 = ":";
		@Pc(15) String local15 = local1 + this.anInt2994 + local3;
		@Pc(27) String local27 = local15 + this.anInt2837 + local3;
		@Pc(39) String local39 = local27 + this.anInt2998 + local3;
		@Pc(51) String local51 = local39 + this.anInt2999 + local3;
		@Pc(67) String local67 = local51 + (this.aBoolean492 ? 1 : 0) + local3;
		@Pc(83) String local83 = local67 + (this.aBoolean531 ? 1 : 0) + local3;
		@Pc(99) String local99 = local83 + (this.aBoolean495 ? 1 : 0) + local3;
		@Pc(115) String local115 = local99 + (this.aBoolean497 ? 1 : 0) + local3;
		@Pc(131) String local131 = local115 + (this.aBoolean494 ? 1 : 0) + local3;
		@Pc(147) String local147 = local131 + (this.aBoolean496 ? 1 : 0) + local3;
		@Pc(163) String local163 = local147 + (this.aBoolean532 ? 1 : 0) + local3;
		@Pc(179) String local179 = local163 + (this.aBoolean493 ? 1 : 0) + local3;
		@Pc(195) String local195 = local179 + (this.aBoolean509 ? 1 : 0) + local3;
		@Pc(211) String local211 = local195 + (this.aBoolean500 ? 1 : 0) + local3;
		@Pc(227) String local227 = local211 + (this.aBoolean529 ? 1 : 0) + local3;
		@Pc(243) String local243 = local227 + (this.aBoolean523 ? 1 : 0) + local3;
		@Pc(259) String local259 = local243 + (this.aBoolean530 ? 1 : 0) + local3;
		@Pc(275) String local275 = local259 + (this.aBoolean534 ? 1 : 0) + local3;
		return local275 + OpenGL.glGetString(35724).toLowerCase();
	}

	@OriginalMember(owner = "client!aqi", name = "wn", descriptor = "(Lclient!mv;)V")
	@Override
	void method21251(@OriginalArg(0) Interface44 arg0) {
		this.aClass142_Sub1_1 = (Class142_Sub1) arg0;
		this.aClass142_Sub1_1.method11273();
	}

	@OriginalMember(owner = "client!aqi", name = "zr", descriptor = "()V")
	@Override
	void method21365() {
		if (this.aBoolean527) {
			OpenGL.glEnable(3089);
		} else {
			OpenGL.glDisable(3089);
		}
	}

	@OriginalMember(owner = "client!aqi", name = "gl", descriptor = "()I")
	@Override
	public int method20676() {
		if (!this.aBoolean498) {
			return -1;
		} else if (this.aLongArray13[this.anInt2836] == 0L) {
			return -1;
		} else {
			@Pc(21) int local21 = OpenGL.glClientWaitSync(this.aLongArray13[this.anInt2836], 0, 0);
			if (local21 == 37149) {
				this.method20698();
				return -1;
			} else if (local21 == 37147) {
				return -1;
			} else {
				return this.anIntArray249[this.anInt2836];
			}
		}
	}

	@OriginalMember(owner = "client!aqi", name = "er", descriptor = "(II)V")
	@Override
	void method20800(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub2 {
		this.aClass108_Sub2_6.method24053();
		if (this.anInterface23_7 != null) {
			this.anInterface23_7.method7758(-1004808321);
		}
	}

	@OriginalMember(owner = "client!aqi", name = "sq", descriptor = "()F")
	@Override
	public float method21132() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!aqi", name = "ex", descriptor = "(II)V")
	@Override
	void method20802(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub2 {
		this.aClass108_Sub2_6.method24053();
		if (this.anInterface23_7 != null) {
			this.anInterface23_7.method7758(1129364594);
		}
	}

	@OriginalMember(owner = "client!aqi", name = "age", descriptor = "(I)V")
	@Override
	void method21343(@OriginalArg(0) int arg0) {
		if (!this.aBoolean499) {
			OpenGL.glPolygonMode(1028, (arg0 & 0x2) == 0 ? 6914 : 6913);
		}
	}

	@OriginalMember(owner = "client!aqi", name = "eb", descriptor = "()V")
	@Override
	public void method20804() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!aqi", name = "ei", descriptor = "()V")
	@Override
	public void method20805() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!aqi", name = "ej", descriptor = "()V")
	@Override
	public void method20806() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!aqi", name = "fe", descriptor = "()V")
	@Override
	void method20808() {
		super.method20661();
		if (this.anOpenGL3 != null) {
			this.anOpenGL3.e();
			this.anOpenGL3.release();
			this.anOpenGL3 = null;
		}
	}

	@OriginalMember(owner = "client!aqi", name = "agu", descriptor = "([Lclient!lf;)Lclient!ld;")
	@Override
	Class135 method21286(@OriginalArg(0) Class397[] arg0) {
		return new Class135_Sub1(arg0);
	}

	@OriginalMember(owner = "client!aqi", name = "fu", descriptor = "(Z)V")
	@Override
	public void method20830(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!aqi", name = "ff", descriptor = "(Z)V")
	@Override
	public void method20831(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!aqi", name = "fr", descriptor = "(Z)V")
	@Override
	public void method20832(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!aqi", name = "fi", descriptor = "(Ljava/awt/Canvas;II)Lclient!afr;")
	@Override
	Class108_Sub2 method20980(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return new Class108_Sub2_Sub1_Sub2(this, arg0);
	}

	@OriginalMember(owner = "client!aqi", name = "gh", descriptor = "(IIII)[I")
	@Override
	public int[] method20834(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(8) int local8 = this.aClass108_6.method24037();
		for (@Pc(10) int local10 = 0; local10 < arg3; local10++) {
			OpenGL.glReadPixelsi(arg0, local8 - arg1 - local10 - 1, arg2, 1, 32993, this.anInt2837, local4, local10 * arg2);
		}
		return local4;
	}

	@OriginalMember(owner = "client!aqi", name = "agx", descriptor = "()V")
	@Override
	void method21494() {
		this.aFloatArray54[0] = this.aFloat214 * this.aFloat208;
		this.aFloatArray54[1] = this.aFloat214 * this.aFloat209;
		this.aFloatArray54[2] = this.aFloat214 * this.aFloat210;
		this.aFloatArray54[3] = 1.0F;
		OpenGL.glLightfv(16384, 4609, this.aFloatArray54, 0);
		this.aFloatArray54[0] = -this.aFloat216 * this.aFloat208;
		this.aFloatArray54[1] = -this.aFloat216 * this.aFloat209;
		this.aFloatArray54[2] = -this.aFloat216 * this.aFloat210;
		this.aFloatArray54[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, this.aFloatArray54, 0);
	}

	@OriginalMember(owner = "client!aqi", name = "gg", descriptor = "(IIII)[I")
	@Override
	public int[] method20837(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(8) int local8 = this.aClass108_6.method24037();
		for (@Pc(10) int local10 = 0; local10 < arg3; local10++) {
			OpenGL.glReadPixelsi(arg0, local8 - arg1 - local10 - 1, arg2, 1, 32993, this.anInt2837, local4, local10 * arg2);
		}
		return local4;
	}

	@OriginalMember(owner = "client!aqi", name = "ge", descriptor = "(IIII)[I")
	@Override
	public int[] method20766(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(8) int local8 = this.aClass108_6.method24037();
		for (@Pc(10) int local10 = 0; local10 < arg3; local10++) {
			OpenGL.glReadPixelsi(arg0, local8 - arg1 - local10 - 1, arg2, 1, 32993, this.anInt2837, local4, local10 * arg2);
		}
		return local4;
	}

	@OriginalMember(owner = "client!aqi", name = "aed", descriptor = "()V")
	@Override
	void method21466() {
		OpenGL.glMatrixMode(5890);
		if (this.aClass422Array3[this.anInt2983] == Class422.aClass422_2) {
			OpenGL.glLoadIdentity();
		} else {
			OpenGL.glLoadMatrixf(this.aClass487Array6[this.anInt2983].method30102(this.aFloatArray55), 0);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!aqi", name = "gc", descriptor = "()Z")
	@Override
	public boolean method21026() {
		return this.aBoolean498;
	}

	@OriginalMember(owner = "client!aqi", name = "gj", descriptor = "()Z")
	@Override
	public boolean method20846() {
		return this.aBoolean498;
	}

	@OriginalMember(owner = "client!aqi", name = "gf", descriptor = "()Z")
	@Override
	public boolean method20847() {
		return this.aBoolean498;
	}

	@OriginalMember(owner = "client!aqi", name = "ail", descriptor = "(I)V")
	synchronized void method20107(@OriginalArg(0) int arg0) {
		@Pc(3) Class80 local3 = new Class80();
		local3.aLong338 = (long) arg0 * 6850079459805481791L;
		this.aClass8_37.method232(local3, 1159951510);
	}

	@OriginalMember(owner = "client!aqi", name = "abc", descriptor = "()V")
	@Override
	void method21413() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(this.aClass487_75.aFloatArray114, 0);
		OpenGL.glLightfv(16384, 4611, this.aFloatArray68, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray67, 0);
	}

	@OriginalMember(owner = "client!aqi", name = "gr", descriptor = "()Z")
	@Override
	public boolean method20850() {
		return true;
	}

	@OriginalMember(owner = "client!aqi", name = "gu", descriptor = "()Z")
	@Override
	public boolean method20710() {
		return true;
	}

	@OriginalMember(owner = "client!aqi", name = "gt", descriptor = "()Z")
	@Override
	public boolean method20852() {
		return false;
	}

	@OriginalMember(owner = "client!aqi", name = "gy", descriptor = "()Z")
	@Override
	public boolean method20853() {
		return false;
	}

	@OriginalMember(owner = "client!aqi", name = "afe", descriptor = "(Z)Lclient!lx;")
	@Override
	Interface38 method21502(@OriginalArg(0) boolean arg0) {
		return new Class142_Sub2(this, arg0);
	}

	@OriginalMember(owner = "client!aqi", name = "gm", descriptor = "()I")
	@Override
	public int method20745() {
		if (!this.aBoolean498) {
			return -1;
		} else if (this.aLongArray13[this.anInt2836] == 0L) {
			return -1;
		} else {
			@Pc(21) int local21 = OpenGL.glClientWaitSync(this.aLongArray13[this.anInt2836], 0, 0);
			if (local21 == 37149) {
				this.method20698();
				return -1;
			} else if (local21 == 37147) {
				return -1;
			} else {
				return this.anIntArray249[this.anInt2836];
			}
		}
	}

	@OriginalMember(owner = "client!aqi", name = "gq", descriptor = "()I")
	@Override
	public int method20869() {
		if (!this.aBoolean498) {
			return -1;
		} else if (this.aLongArray13[this.anInt2836] == 0L) {
			return -1;
		} else {
			@Pc(21) int local21 = OpenGL.glClientWaitSync(this.aLongArray13[this.anInt2836], 0, 0);
			if (local21 == 37149) {
				this.method20698();
				return -1;
			} else if (local21 == 37147) {
				return -1;
			} else {
				return this.anIntArray249[this.anInt2836];
			}
		}
	}

	@OriginalMember(owner = "client!aqi", name = "gx", descriptor = "(III)V")
	@Override
	public void method20857(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.method20782();
		if (this.aClass108_Sub1_3 == null) {
			this.method20094(arg1, arg2);
		}
		if (this.aClass99_19 == null) {
			this.aClass99_19 = this.method20743(0, 0, this.aClass108_6.method24036(), this.aClass108_6.method24037(), false);
		} else {
			this.aClass99_19.method18223(0, 0, this.aClass108_6.method24036(), this.aClass108_6.method24037(), 0, 0);
		}
		this.method20684(this.aClass108_Sub1_3, -1270129859);
		this.method20714(1, -16777216);
		this.aClass99_19.method18228(this.anInt2947 * 1069673649, this.anInt2932 * 262780429, this.anInt2948 * -244276243, this.anInt2936 * -69329917);
		OpenGL.glBindBufferARB(35051, this.anIntArray252[this.anInt2838]);
		OpenGL.glReadPixelsub(0, 0, this.anInt2945 * -971613875, this.anInt2935 * 143307461, 32993, 5121, null, 0);
		OpenGL.glBindBufferARB(35051, 0);
		this.method20887(this.aClass108_Sub1_3, (byte) 1);
		this.aLongArray13[this.anInt2838] = OpenGL.glFenceSync(37143, 0);
		this.anIntArray249[this.anInt2838] = arg0;
		if (++this.anInt2838 >= 3) {
			this.anInt2838 = 0;
		}
		this.method20746();
	}

	@OriginalMember(owner = "client!aqi", name = "gn", descriptor = "()V")
	@Override
	public void method21087() {
		for (@Pc(1) int local1 = 0; local1 < 3; local1++) {
			if (this.aLongArray13[local1] != 0L) {
				OpenGL.glDeleteSync(this.aLongArray13[local1]);
				this.aLongArray13[local1] = 0L;
			}
		}
		this.anInt2838 = 0;
		this.anInt2836 = 0;
	}

	@OriginalMember(owner = "client!aqi", name = "gs", descriptor = "(II)J")
	@Override
	public long method20859(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method20093(arg0, arg1, null, null);
	}

	@OriginalMember(owner = "client!aqi", name = "afo", descriptor = "()V")
	@Override
	void method21489() {
		if (this.aBoolean514) {
			OpenGL.glEnable(3042);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!aqi", name = "en", descriptor = "(II)V")
	@Override
	void method21074(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub2 {
		this.aClass108_Sub2_6.method24053();
		if (this.anInterface23_7 != null) {
			this.anInterface23_7.method7758(-1840709166);
		}
	}

	@OriginalMember(owner = "client!aqi", name = "ace", descriptor = "(Lclient!co;IIIZ[B)Lclient!ll;")
	@Override
	Interface36 method21432(@OriginalArg(0) Class210 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5) {
		return new Class140_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!aqi", name = "hn", descriptor = "(II[I[I)V")
	@Override
	public void method21098(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.method20093(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!aqi", name = "hw", descriptor = "(II[I[I)V")
	@Override
	public void method20864(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.method20093(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!aqi", name = "hk", descriptor = "()V")
	@Override
	public void method20865() {
		if (this.aBoolean498) {
			this.aClass99_19 = null;
			if (this.aClass108_Sub1_3 != null) {
				this.aClass108_Sub1_3.method24046();
				this.aClass108_Sub1_3 = null;
			}
			OpenGL.glDeleteBuffersARB(3, this.anIntArray252, 0);
			for (@Pc(21) int local21 = 0; local21 < 3; local21++) {
				this.anIntArray252[local21] = 0;
				if (this.aLongArray13[local21] != 0L) {
					OpenGL.glDeleteSync(this.aLongArray13[local21]);
					this.aLongArray13[local21] = 0L;
				}
			}
		} else {
			this.aClass108_Sub1_3 = null;
			this.aClass99_20 = null;
			this.aClass99_19 = null;
		}
		this.anInt2838 = 0;
		this.anInt2836 = 0;
	}

	@OriginalMember(owner = "client!aqi", name = "ahl", descriptor = "(Ljava/lang/String;)[B")
	byte[] method20108(@OriginalArg(0) String arg0) {
		return this.method21143("gl", arg0);
	}

	@OriginalMember(owner = "client!aqi", name = "il", descriptor = "(II)V")
	@Override
	public void method20884(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		if ((arg0 & 0x1) != 0) {
			OpenGL.glClearColor((float) (arg1 & 0xFF0000) / 1.671168E7F, (float) (arg1 & 0xFF00) / 65280.0F, (float) (arg1 & 0xFF) / 255.0F, (float) (arg1 >>> 24) / 255.0F);
			local1 = 16384;
		}
		if ((arg0 & 0x2) != 0) {
			this.method21191(true);
			local1 |= 0x100;
		}
		if ((arg0 & 0x4) != 0) {
			local1 |= 0x400;
		}
		OpenGL.glClear(local1);
	}

	@OriginalMember(owner = "client!aqi", name = "agq", descriptor = "([Lclient!lf;)Lclient!ld;")
	@Override
	Class135 method21528(@OriginalArg(0) Class397[] arg0) {
		return new Class135_Sub1(arg0);
	}

	@OriginalMember(owner = "client!aqi", name = "adx", descriptor = "(ILclient!mh;ZZ)V")
	@Override
	void method21234(@OriginalArg(0) int arg0, @OriginalArg(1) Class417 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		OpenGL.glTexEnvi(8960, arg0 + 34176, method20105(arg1));
		if (arg2) {
			OpenGL.glTexEnvi(8960, arg0 + 34192, arg3 ? 771 : 770);
		} else {
			OpenGL.glTexEnvi(8960, arg0 + 34192, arg3 ? 769 : 768);
		}
	}

	@OriginalMember(owner = "client!aqi", name = "j", descriptor = "()V")
	@Override
	void method20661() {
		super.method20661();
		if (this.anOpenGL3 != null) {
			this.anOpenGL3.e();
			this.anOpenGL3.release();
			this.anOpenGL3 = null;
		}
	}

	@OriginalMember(owner = "client!aqi", name = "lu", descriptor = "(Lclient!df;Lclient!df;FLclient!df;)Lclient!df;")
	@Override
	public Class106 method20978(@OriginalArg(0) Class106 arg0, @OriginalArg(1) Class106 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class106 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!aqi", name = "ng", descriptor = "()Lclient!afo;")
	@Override
	public Class108_Sub1 method20918() {
		return new Class108_Sub1_Sub1_Sub1(this);
	}

	@OriginalMember(owner = "client!aqi", name = "dq", descriptor = "(Lclient!df;Lclient!df;FLclient!df;)Lclient!df;")
	@Override
	public Class106 method20854(@OriginalArg(0) Class106 arg0, @OriginalArg(1) Class106 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class106 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!aqi", name = "aga", descriptor = "()F")
	@Override
	public float method21518() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!aqi", name = "ny", descriptor = "(IILclient!co;Lclient!dy;I)Lclient!do;")
	@Override
	public Interface18 method21028(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class210 arg2, @OriginalArg(3) Class236 arg3, @OriginalArg(4) int arg4) {
		return new Class534(this, arg2, arg3, arg0, arg1, arg4);
	}

	@OriginalMember(owner = "client!aqi", name = "oi", descriptor = "(II)Lclient!de;")
	@Override
	public Interface17 method21050(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class534(this, Class210.aClass210_21, Class236.aClass236_22, arg0, arg1);
	}

	@OriginalMember(owner = "client!aqi", name = "afk", descriptor = "(ILclient!lx;)V")
	@Override
	public void method21331(@OriginalArg(0) int arg0, @OriginalArg(1) Interface38 arg1) {
		this.aClass142_Sub2Array1[arg0] = (Class142_Sub2) arg1;
	}

	@OriginalMember(owner = "client!aqi", name = "oj", descriptor = "(III)Lclient!de;")
	@Override
	public Interface17 method21052(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return new Class534(this, Class210.aClass210_21, Class236.aClass236_22, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!aqi", name = "oa", descriptor = "(III)Lclient!de;")
	@Override
	public Interface17 method21053(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return new Class534(this, Class210.aClass210_21, Class236.aClass236_22, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!aqi", name = "xh", descriptor = "(Z)Z")
	@Override
	public boolean method21321(@OriginalArg(0) boolean arg0) {
		return true;
	}

	@OriginalMember(owner = "client!aqi", name = "xa", descriptor = "()Z")
	@Override
	public boolean method21313() {
		return this.aBoolean494;
	}

	@OriginalMember(owner = "client!aqi", name = "xe", descriptor = "()Z")
	@Override
	public boolean method21314() {
		return this.aBoolean494;
	}

	@OriginalMember(owner = "client!aqi", name = "acb", descriptor = "(Lclient!co;Lclient!dy;II)Lclient!mg;")
	@Override
	Interface40 method21435(@OriginalArg(0) Class210 arg0, @OriginalArg(1) Class236 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return new Class140_Sub2(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!aqi", name = "xm", descriptor = "()Z")
	@Override
	public boolean method21316() {
		return this.aBoolean496;
	}

	@OriginalMember(owner = "client!aqi", name = "af", descriptor = "(IILclient!co;Lclient!dy;I)Lclient!do;")
	@Override
	public Interface18 method20688(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class210 arg2, @OriginalArg(3) Class236 arg3, @OriginalArg(4) int arg4) {
		return new Class534(this, arg2, arg3, arg0, arg1, arg4);
	}

	@OriginalMember(owner = "client!aqi", name = "xd", descriptor = "()Z")
	@Override
	public boolean method21318() {
		return this.aBoolean496;
	}

	@OriginalMember(owner = "client!aqi", name = "aip", descriptor = "(II)V")
	synchronized void method20109(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class80_Sub20 local4 = new Class80_Sub20(arg1);
		local4.aLong338 = (long) arg0 * 6850079459805481791L;
		this.aClass8_33.method232(local4, -166667168);
	}

	@OriginalMember(owner = "client!aqi", name = "xz", descriptor = "(Z)Z")
	@Override
	public boolean method21312(@OriginalArg(0) boolean arg0) {
		return true;
	}

	@OriginalMember(owner = "client!aqi", name = "aek", descriptor = "()V")
	@Override
	void method21483() {
		if (this.aBoolean528) {
			OpenGL.glEnable(3008);
		} else {
			OpenGL.glDisable(3008);
		}
		OpenGL.glAlphaFunc(516, (float) (this.aByte76 & 0xFF) / 255.0F);
		if (this.anInt2994 <= 1) {
			return;
		}
		if (this.aByte76 == 0) {
			OpenGL.glDisable(32926);
		} else {
			OpenGL.glEnable(32926);
		}
	}

	@OriginalMember(owner = "client!aqi", name = "xi", descriptor = "(Z)Z")
	@Override
	public boolean method21430(@OriginalArg(0) boolean arg0) {
		return true;
	}

	@OriginalMember(owner = "client!aqi", name = "ahv", descriptor = "(J)V")
	synchronized void method20110(@OriginalArg(0) long arg0) {
		@Pc(3) Class80 local3 = new Class80();
		local3.aLong338 = arg0 * 6850079459805481791L;
		this.aClass8_39.method232(local3, 796591820);
	}

	@OriginalMember(owner = "client!aqi", name = "xl", descriptor = "(Lclient!pm;Lclient!pm;Lclient!pm;)V")
	@Override
	public void method21301(@OriginalArg(0) Class487 arg0, @OriginalArg(1) Class487 arg1, @OriginalArg(2) Class487 arg2) {
		OpenGL.glMatrixMode(5888);
		this.aClass487_80.method30068(arg0, arg1);
		OpenGL.glLoadMatrixf(this.aClass487_80.aFloatArray114, 0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(arg2.aFloatArray114, 0);
	}

	@OriginalMember(owner = "client!aqi", name = "xv", descriptor = "(Lclient!pm;Lclient!pm;Lclient!pm;)V")
	@Override
	public void method21268(@OriginalArg(0) Class487 arg0, @OriginalArg(1) Class487 arg1, @OriginalArg(2) Class487 arg2) {
		OpenGL.glMatrixMode(5888);
		this.aClass487_80.method30068(arg0, arg1);
		OpenGL.glLoadMatrixf(this.aClass487_80.aFloatArray114, 0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(arg2.aFloatArray114, 0);
	}

	@OriginalMember(owner = "client!aqi", name = "yc", descriptor = "()V")
	@Override
	void method21339() {
		OpenGL.glDepthFunc(515);
		this.method20097();
		OpenGL.glClearDepth(1.0F);
		OpenGL.glAlphaFunc(516, 0.0F);
		OpenGL.glPolygonMode(1028, 6914);
		if (this.aBoolean531) {
			this.method21323(this.anInt2994 > 1);
			OpenGL.glDisable(32926);
		}
		for (@Pc(30) int local30 = this.anInt2998 - 1; local30 >= 0; local30--) {
			OpenGL.glActiveTexture(local30 + 33984);
			OpenGL.glTexEnvi(8960, 8704, 34160);
			OpenGL.glTexEnvi(8960, 34161, 8448);
			OpenGL.glTexEnvi(8960, 34178, 34166);
			OpenGL.glTexEnvi(8960, 34162, 8448);
			OpenGL.glTexEnvi(8960, 34186, 34166);
		}
		OpenGL.glTexEnvi(8960, 34186, 34168);
		OpenGL.glShadeModel(7425);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glColorMaterial(1028, 5634);
		OpenGL.glEnable(2903);
		@Pc(91) float[] local91 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(93) int local93 = 0; local93 < 8; local93++) {
			@Pc(100) int local100 = local93 + 16384;
			OpenGL.glLightfv(local100, 4608, local91, 0);
			OpenGL.glLightf(local100, 4615, 0.0F);
			OpenGL.glLightf(local100, 4616, 0.0F);
		}
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anOpenGL3.setSwapInterval(0);
		super.method21148();
	}

	@OriginalMember(owner = "client!aqi", name = "yl", descriptor = "()V")
	@Override
	void method21203() {
		OpenGL.glDepthFunc(515);
		this.method20097();
		OpenGL.glClearDepth(1.0F);
		OpenGL.glAlphaFunc(516, 0.0F);
		OpenGL.glPolygonMode(1028, 6914);
		if (this.aBoolean531) {
			this.method21323(this.anInt2994 > 1);
			OpenGL.glDisable(32926);
		}
		for (@Pc(30) int local30 = this.anInt2998 - 1; local30 >= 0; local30--) {
			OpenGL.glActiveTexture(local30 + 33984);
			OpenGL.glTexEnvi(8960, 8704, 34160);
			OpenGL.glTexEnvi(8960, 34161, 8448);
			OpenGL.glTexEnvi(8960, 34178, 34166);
			OpenGL.glTexEnvi(8960, 34162, 8448);
			OpenGL.glTexEnvi(8960, 34186, 34166);
		}
		OpenGL.glTexEnvi(8960, 34186, 34168);
		OpenGL.glShadeModel(7425);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glColorMaterial(1028, 5634);
		OpenGL.glEnable(2903);
		@Pc(91) float[] local91 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(93) int local93 = 0; local93 < 8; local93++) {
			@Pc(100) int local100 = local93 + 16384;
			OpenGL.glLightfv(local100, 4608, local91, 0);
			OpenGL.glLightf(local100, 4615, 0.0F);
			OpenGL.glLightf(local100, 4616, 0.0F);
		}
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anOpenGL3.setSwapInterval(0);
		super.method21148();
	}

	@OriginalMember(owner = "client!aqi", name = "hp", descriptor = "(II)J")
	@Override
	public long method20860(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method20093(arg0, arg1, null, null);
	}

	@OriginalMember(owner = "client!aqi", name = "zp", descriptor = "()V")
	@Override
	void method21380() {
		if (this.aClass108_6 == null) {
			return;
		}
		@Pc(8) int local8 = this.anInt2989 + this.anInt2979;
		@Pc(18) int local18 = this.anInt2974 + this.aClass108_6.method24037() - this.anInt2964;
		@Pc(24) int local24 = this.anInt2957 - this.anInt2979;
		@Pc(30) int local30 = this.anInt2964 - this.anInt2995;
		if (local24 < 0) {
			local24 = 0;
		}
		if (local30 < 0) {
			local30 = 0;
		}
		OpenGL.glScissor(local8, local18, local24, local30);
	}

	@OriginalMember(owner = "client!aqi", name = "vn", descriptor = "(I)V")
	@Override
	void method21237(@OriginalArg(0) int arg0) {
		OpenGL.glColorMask((arg0 & 0x1) != 0, (arg0 & 0x2) != 0, (arg0 & 0x4) != 0, (arg0 & 0x8) != 0);
	}

	@OriginalMember(owner = "client!aqi", name = "zx", descriptor = "()V")
	@Override
	void method21366() {
		if (this.aBoolean527) {
			OpenGL.glEnable(3089);
		} else {
			OpenGL.glDisable(3089);
		}
	}

	@OriginalMember(owner = "client!aqi", name = "aw", descriptor = "(II[I[I)V")
	@Override
	public void method20702(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.method20093(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!aqi", name = "aaf", descriptor = "()V")
	@Override
	void method21396() {
		OpenGL.glDepthMask(this.aBoolean515 && this.aBoolean535);
	}

	@OriginalMember(owner = "client!aqi", name = "aat", descriptor = "()V")
	@Override
	void method21397() {
		OpenGL.glDepthMask(this.aBoolean515 && this.aBoolean535);
	}

	@OriginalMember(owner = "client!aqi", name = "an", descriptor = "()Z")
	@Override
	public boolean method20694() {
		return !this.aBoolean498 || this.aLongArray13[this.anInt2838] == 0L;
	}

	@OriginalMember(owner = "client!aqi", name = "aa", descriptor = "()Z")
	@Override
	public boolean method20695() {
		return true;
	}

	@OriginalMember(owner = "client!aqi", name = "abs", descriptor = "()V")
	@Override
	void method21402() {
		this.aFloatArray54[0] = this.aFloat212 * this.aFloat208;
		this.aFloatArray54[1] = this.aFloat212 * this.aFloat209;
		this.aFloatArray54[2] = this.aFloat212 * this.aFloat210;
		this.aFloatArray54[3] = 1.0F;
		OpenGL.glLightModelfv(2899, this.aFloatArray54, 0);
	}

	@OriginalMember(owner = "client!aqi", name = "abk", descriptor = "()V")
	@Override
	void method21401() {
		this.aFloatArray54[0] = this.aFloat212 * this.aFloat208;
		this.aFloatArray54[1] = this.aFloat212 * this.aFloat209;
		this.aFloatArray54[2] = this.aFloat212 * this.aFloat210;
		this.aFloatArray54[3] = 1.0F;
		OpenGL.glLightModelfv(2899, this.aFloatArray54, 0);
	}

	@OriginalMember(owner = "client!aqi", name = "ahh", descriptor = "(Ljava/lang/String;)[B")
	byte[] method20111(@OriginalArg(0) String arg0) {
		return this.method21143("gl", arg0);
	}

	@OriginalMember(owner = "client!aqi", name = "abh", descriptor = "()V")
	@Override
	void method21403() {
		this.aFloatArray54[0] = this.aFloat212 * this.aFloat208;
		this.aFloatArray54[1] = this.aFloat212 * this.aFloat209;
		this.aFloatArray54[2] = this.aFloat212 * this.aFloat210;
		this.aFloatArray54[3] = 1.0F;
		OpenGL.glLightModelfv(2899, this.aFloatArray54, 0);
	}

	@OriginalMember(owner = "client!aqi", name = "aby", descriptor = "()V")
	@Override
	void method21277() {
		this.aFloatArray54[0] = this.aFloat212 * this.aFloat208;
		this.aFloatArray54[1] = this.aFloat212 * this.aFloat209;
		this.aFloatArray54[2] = this.aFloat212 * this.aFloat210;
		this.aFloatArray54[3] = 1.0F;
		OpenGL.glLightModelfv(2899, this.aFloatArray54, 0);
	}

	@OriginalMember(owner = "client!aqi", name = "tm", descriptor = "()V")
	@Override
	void method21175() {
		if (this.aBoolean527) {
			OpenGL.glEnable(3089);
		} else {
			OpenGL.glDisable(3089);
		}
	}

	@OriginalMember(owner = "client!aqi", name = "abr", descriptor = "()V")
	@Override
	void method21299() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(this.aClass487_75.aFloatArray114, 0);
		OpenGL.glLightfv(16384, 4611, this.aFloatArray68, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray67, 0);
	}

	@OriginalMember(owner = "client!aqi", name = "ud", descriptor = "(Lclient!co;IIZ[FII)Lclient!lb;")
	@Override
	Interface34 method21211(@OriginalArg(0) Class210 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		return new Class140_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!aqi", name = "abm", descriptor = "()V")
	@Override
	void method21253() {
	}

	@OriginalMember(owner = "client!aqi", name = "agy", descriptor = "(Lclient!mv;Lclient!md;IIII)V")
	@Override
	void method21300(@OriginalArg(0) Interface44 arg0, @OriginalArg(1) Class415 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) byte local4;
		@Pc(8) int local8;
		if (arg1 == Class415.aClass415_3) {
			local4 = 1;
			local8 = arg5 * 2;
		} else if (arg1 == Class415.aClass415_2) {
			local4 = 3;
			local8 = arg5 + 1;
		} else if (arg1 == Class415.aClass415_6) {
			local4 = 4;
			local8 = arg5 * 3;
		} else if (arg1 == Class415.aClass415_4) {
			local4 = 6;
			local8 = arg5 + 2;
		} else if (arg1 == Class415.aClass415_5) {
			local4 = 5;
			local8 = arg5 + 2;
		} else {
			local4 = 0;
			local8 = arg5;
		}
		@Pc(56) Class236 local56 = arg0.method29400();
		@Pc(59) Class142_Sub1 local59 = (Class142_Sub1) arg0;
		local59.method11273();
		OpenGL.glDrawElements(local4, local8, method20102(local56), local59.method11280() + (long) (arg4 * local56.anInt3804 * -369125885));
	}

	@OriginalMember(owner = "client!aqi", name = "abt", descriptor = "()V")
	@Override
	void method21407() {
		if (this.aBoolean519) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	@OriginalMember(owner = "client!aqi", name = "abg", descriptor = "()V")
	@Override
	void method21274() {
		if (this.aBoolean519) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	@OriginalMember(owner = "client!aqi", name = "abn", descriptor = "()V")
	@Override
	void method21408() {
		if (this.aBoolean519) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	@OriginalMember(owner = "client!aqi", name = "abx", descriptor = "()V")
	@Override
	void method21411() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(this.aClass487_75.aFloatArray114, 0);
		@Pc(8) int local8;
		for (local8 = 0; local8 < this.anInt2978; local8++) {
			@Pc(17) Class80_Sub12 local17 = this.aClass80_Sub12Array19[local8];
			@Pc(21) int local21 = local17.method13953((byte) 125);
			@Pc(25) int local25 = local8 + 16386;
			@Pc(31) float local31 = local17.method13954(1287818641) / 255.0F;
			this.aFloatArray54[0] = local17.method13949((byte) 0);
			this.aFloatArray54[1] = local17.method13950(-1866833593);
			this.aFloatArray54[2] = local17.method13970(1771628222);
			this.aFloatArray54[3] = 1.0F;
			OpenGL.glLightfv(local25, 4611, this.aFloatArray54, 0);
			this.aFloatArray54[0] = (float) (local21 >> 16 & 0xFF) * local31;
			this.aFloatArray54[1] = (float) (local21 >> 8 & 0xFF) * local31;
			this.aFloatArray54[2] = (float) (local21 & 0xFF) * local31;
			this.aFloatArray54[3] = 1.0F;
			OpenGL.glLightfv(local25, 4609, this.aFloatArray54, 0);
			OpenGL.glLightf(local25, 4617, 1.0F / (float) (local17.method13952(-432544427) * local17.method13952(-432544427)));
			OpenGL.glEnable(local25);
		}
		while (local8 < this.anInt2977) {
			OpenGL.glDisable(local8 + 16386);
			local8++;
		}
	}

	@OriginalMember(owner = "client!aqi", name = "xx", descriptor = "()Z")
	@Override
	public boolean method21315() {
		return this.aBoolean494;
	}

	@OriginalMember(owner = "client!aqi", name = "abj", descriptor = "(Lclient!co;Lclient!dy;)Z")
	@Override
	boolean method21214(@OriginalArg(0) Class210 arg0, @OriginalArg(1) Class236 arg1) {
		return this.aBoolean532;
	}

	@OriginalMember(owner = "client!aqi", name = "abz", descriptor = "(Lclient!co;Lclient!dy;)Z")
	@Override
	boolean method21140(@OriginalArg(0) Class210 arg0, @OriginalArg(1) Class236 arg1) {
		return this.aBoolean532;
	}

	@OriginalMember(owner = "client!aqi", name = "abu", descriptor = "(Lclient!co;Lclient!dy;)Z")
	@Override
	boolean method21414(@OriginalArg(0) Class210 arg0, @OriginalArg(1) Class236 arg1) {
		return this.aBoolean532;
	}

	@OriginalMember(owner = "client!aqi", name = "aep", descriptor = "()V")
	@Override
	void method21485() {
		if (this.aBoolean534) {
			@Pc(4) byte local4 = 0;
			@Pc(6) byte local6 = 0;
			if (this.anInt2992 == 0) {
				local4 = 0;
				local6 = 0;
			} else if (this.anInt2992 == 1) {
				local4 = 1;
				local6 = 0;
			} else if (this.anInt2992 == 2) {
				local4 = 1;
				local6 = 1;
			} else if (this.anInt2992 == 3) {
				local4 = 0;
				local6 = 1;
			}
			if (this.aClass428_3 == Class428.aClass428_6) {
				OpenGL.glBlendFuncSeparate(770, 771, local4, local6);
			} else if (this.aClass428_3 == Class428.aClass428_4) {
				OpenGL.glBlendFuncSeparate(1, 1, local4, local6);
			} else if (this.aClass428_3 == Class428.aClass428_7) {
				OpenGL.glBlendFuncSeparate(774, 1, local4, local6);
			} else if (this.aClass428_3 == Class428.aClass428_5) {
				OpenGL.glBlendFuncSeparate(1, 0, local4, local6);
			}
		} else if (this.aClass428_3 == Class428.aClass428_6) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(770, 771);
		} else if (this.aClass428_3 == Class428.aClass428_4) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(1, 1);
		} else if (this.aClass428_3 == Class428.aClass428_7) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(774, 1);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!aqi", name = "acy", descriptor = "(Lclient!co;Lclient!dy;II)Lclient!lb;")
	@Override
	Interface34 method21422(@OriginalArg(0) Class210 arg0, @OriginalArg(1) Class236 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return this.method21215(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!aqi", name = "acq", descriptor = "(Lclient!co;Lclient!dy;II)Lclient!lb;")
	@Override
	Interface34 method21423(@OriginalArg(0) Class210 arg0, @OriginalArg(1) Class236 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return this.method21215(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!aqi", name = "wf", descriptor = "(Lclient!md;IIII)V")
	@Override
	public void method21373(@OriginalArg(0) Class415 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(4) byte local4;
		@Pc(8) int local8;
		if (arg0 == Class415.aClass415_3) {
			local4 = 1;
			local8 = arg4 * 2;
		} else if (arg0 == Class415.aClass415_2) {
			local4 = 3;
			local8 = arg4 + 1;
		} else if (arg0 == Class415.aClass415_6) {
			local4 = 4;
			local8 = arg4 * 3;
		} else if (arg0 == Class415.aClass415_4) {
			local4 = 6;
			local8 = arg4 + 2;
		} else if (arg0 == Class415.aClass415_5) {
			local4 = 5;
			local8 = arg4 + 2;
		} else {
			local4 = 0;
			local8 = arg4;
		}
		@Pc(57) Class236 local57 = this.aClass142_Sub1_1.method29400();
		OpenGL.glDrawElements(local4, local8, method20102(local57), this.aClass142_Sub1_1.method11280() + (long) (arg3 * local57.anInt3804 * -369125885));
	}

	@OriginalMember(owner = "client!aqi", name = "aco", descriptor = "(Lclient!co;IIZ[BII)Lclient!lb;")
	@Override
	Interface34 method21273(@OriginalArg(0) Class210 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		return new Class140_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!aqi", name = "acj", descriptor = "(Lclient!co;IIZ[FII)Lclient!lb;")
	@Override
	Interface34 method21426(@OriginalArg(0) Class210 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		return new Class140_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!aqi", name = "aca", descriptor = "(Lclient!co;IIZ[FII)Lclient!lb;")
	@Override
	Interface34 method21427(@OriginalArg(0) Class210 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		return new Class140_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!aqi", name = "ia", descriptor = "(II)V")
	@Override
	public void method20764(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		if ((arg0 & 0x1) != 0) {
			OpenGL.glClearColor((float) (arg1 & 0xFF0000) / 1.671168E7F, (float) (arg1 & 0xFF00) / 65280.0F, (float) (arg1 & 0xFF) / 255.0F, (float) (arg1 >>> 24) / 255.0F);
			local1 = 16384;
		}
		if ((arg0 & 0x2) != 0) {
			this.method21191(true);
			local1 |= 0x100;
		}
		if ((arg0 & 0x4) != 0) {
			local1 |= 0x400;
		}
		OpenGL.glClear(local1);
	}

	@OriginalMember(owner = "client!aqi", name = "wr", descriptor = "(Z)V")
	@Override
	void method21323(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			OpenGL.glEnable(32925);
		} else {
			OpenGL.glDisable(32925);
		}
	}

	@OriginalMember(owner = "client!aqi", name = "acx", descriptor = "(IZ[[I)Lclient!ml;")
	@Override
	Interface42 method21177(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[][] arg2) {
		return new Class140_Sub3(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!aqi", name = "acv", descriptor = "(IZ[[I)Lclient!ml;")
	@Override
	Interface42 method21431(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[][] arg2) {
		return new Class140_Sub3(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!aqi", name = "acr", descriptor = "(Lclient!co;IIIZ[B)Lclient!ll;")
	@Override
	Interface36 method21156(@OriginalArg(0) Class210 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5) {
		return new Class140_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!aqi", name = "acz", descriptor = "(Lclient!co;IIIZ[B)Lclient!ll;")
	@Override
	Interface36 method21433(@OriginalArg(0) Class210 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5) {
		return new Class140_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!aqi", name = "ack", descriptor = "(Lclient!co;Lclient!dy;II)Lclient!mg;")
	@Override
	Interface40 method21434(@OriginalArg(0) Class210 arg0, @OriginalArg(1) Class236 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return new Class140_Sub2(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!aqi", name = "ha", descriptor = "(II[I[I)V")
	@Override
	public void method20848(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.method20093(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!aqi", name = "lr", descriptor = "(Lclient!df;Lclient!df;FLclient!df;)Lclient!df;")
	@Override
	public Class106 method20977(@OriginalArg(0) Class106 arg0, @OriginalArg(1) Class106 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class106 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!aqi", name = "acw", descriptor = "()V")
	@Override
	public void method21440() {
		@Pc(5) int local5 = this.anIntArray251[this.anInt2983];
		if (local5 != 0) {
			this.anIntArray251[this.anInt2983] = 0;
			OpenGL.glBindTexture(local5, 0);
			OpenGL.glDisable(local5);
		}
	}

	@OriginalMember(owner = "client!aqi", name = "aik", descriptor = "()V")
	void method20113() {
		if (this.anInt2993 == 1) {
			OpenGL.glDisable(2884);
			return;
		}
		OpenGL.glEnable(2884);
		if (this.anInt2993 == 2) {
			OpenGL.glCullFace(1029);
		} else if (this.anInt2993 == 3) {
			OpenGL.glCullFace(1028);
		}
	}

	@OriginalMember(owner = "client!aqi", name = "eu", descriptor = "()Lclient!cf;")
	@Override
	public Class203 method20798() {
		@Pc(1) int local1 = -1;
		if (this.aString78.indexOf("nvidia") != -1) {
			local1 = 4318;
		} else if (this.aString78.indexOf("intel") != -1) {
			local1 = 32902;
		} else if (this.aString78.indexOf("ati") != -1) {
			local1 = 4098;
		}
		return new Class203(local1, this.method21245() ? "OpenGL FF" : "OpenGL", this.anInt2834, this.aString77, 0L, this.method21245());
	}

	@OriginalMember(owner = "client!aqi", name = "ach", descriptor = "()V")
	@Override
	public void method21441() {
		@Pc(5) int local5 = this.anIntArray251[this.anInt2983];
		if (local5 != 0) {
			this.anIntArray251[this.anInt2983] = 0;
			OpenGL.glBindTexture(local5, 0);
			OpenGL.glDisable(local5);
		}
	}

	@OriginalMember(owner = "client!aqi", name = "aie", descriptor = "(J)V")
	synchronized void method20114(@OriginalArg(0) long arg0) {
		@Pc(3) Class80 local3 = new Class80();
		local3.aLong338 = arg0 * 6850079459805481791L;
		this.aClass8_39.method232(local3, 1971254193);
	}

	@OriginalMember(owner = "client!aqi", name = "adp", descriptor = "(ILclient!mh;Z)V")
	@Override
	void method21450(@OriginalArg(0) int arg0, @OriginalArg(1) Class417 arg1, @OriginalArg(2) boolean arg2) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, method20105(arg1));
		OpenGL.glTexEnvi(8960, arg0 + 34200, arg2 ? 771 : 770);
	}

	@OriginalMember(owner = "client!aqi", name = "wz", descriptor = "(Lclient!mv;Lclient!md;IIII)V")
	@Override
	void method21258(@OriginalArg(0) Interface44 arg0, @OriginalArg(1) Class415 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) byte local4;
		@Pc(8) int local8;
		if (arg1 == Class415.aClass415_3) {
			local4 = 1;
			local8 = arg5 * 2;
		} else if (arg1 == Class415.aClass415_2) {
			local4 = 3;
			local8 = arg5 + 1;
		} else if (arg1 == Class415.aClass415_6) {
			local4 = 4;
			local8 = arg5 * 3;
		} else if (arg1 == Class415.aClass415_4) {
			local4 = 6;
			local8 = arg5 + 2;
		} else if (arg1 == Class415.aClass415_5) {
			local4 = 5;
			local8 = arg5 + 2;
		} else {
			local4 = 0;
			local8 = arg5;
		}
		@Pc(56) Class236 local56 = arg0.method29400();
		@Pc(59) Class142_Sub1 local59 = (Class142_Sub1) arg0;
		local59.method11273();
		OpenGL.glDrawElements(local4, local8, method20102(local56), local59.method11280() + (long) (arg4 * local56.anInt3804 * -369125885));
	}

	@OriginalMember(owner = "client!aqi", name = "aem", descriptor = "(I)V")
	@Override
	void method21481(@OriginalArg(0) int arg0) {
		OpenGL.glColorMask((arg0 & 0x1) != 0, (arg0 & 0x2) != 0, (arg0 & 0x4) != 0, (arg0 & 0x8) != 0);
	}

	@OriginalMember(owner = "client!aqi", name = "om", descriptor = "(II)Lclient!de;")
	@Override
	public Interface17 method20760(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class534(this, Class210.aClass210_21, Class236.aClass236_22, arg0, arg1);
	}

	@OriginalMember(owner = "client!aqi", name = "ahd", descriptor = "(Ljava/lang/String;)[B")
	byte[] method20115(@OriginalArg(0) String arg0) {
		return this.method21143("gl", arg0);
	}

	@OriginalMember(owner = "client!aqi", name = "aey", descriptor = "()V")
	@Override
	void method21467() {
		OpenGL.glMatrixMode(5890);
		if (this.aClass422Array3[this.anInt2983] == Class422.aClass422_2) {
			OpenGL.glLoadIdentity();
		} else {
			OpenGL.glLoadMatrixf(this.aClass487Array6[this.anInt2983].method30102(this.aFloatArray55), 0);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!aqi", name = "aec", descriptor = "()V")
	@Override
	void method21468() {
		OpenGL.glMatrixMode(5890);
		if (this.aClass422Array3[this.anInt2983] == Class422.aClass422_2) {
			OpenGL.glLoadIdentity();
		} else {
			OpenGL.glLoadMatrixf(this.aClass487Array6[this.anInt2983].method30102(this.aFloatArray55), 0);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!aqi", name = "aef", descriptor = "()V")
	@Override
	void method21469() {
		OpenGL.glActiveTexture(this.anInt2983 + 33984);
	}

	@OriginalMember(owner = "client!aqi", name = "aei", descriptor = "()V")
	@Override
	void method21470() {
		OpenGL.glTexEnvi(8960, 34161, method20118(this.aClass412Array5[this.anInt2983]));
	}

	@OriginalMember(owner = "client!aqi", name = "acs", descriptor = "()V")
	@Override
	public void method21425() {
		@Pc(5) int local5 = this.anIntArray251[this.anInt2983];
		if (local5 != 0) {
			this.anIntArray251[this.anInt2983] = 0;
			OpenGL.glBindTexture(local5, 0);
			OpenGL.glDisable(local5);
		}
	}

	@OriginalMember(owner = "client!aqi", name = "aer", descriptor = "()V")
	@Override
	void method21353() {
		OpenGL.glTexEnvi(8960, 34162, method20118(this.aClass412Array6[this.anInt2983]));
	}

	@OriginalMember(owner = "client!aqi", name = "acd", descriptor = "()V")
	@Override
	public void method21278() {
		@Pc(5) int local5 = this.anIntArray251[this.anInt2983];
		if (local5 != 0) {
			this.anIntArray251[this.anInt2983] = 0;
			OpenGL.glBindTexture(local5, 0);
			OpenGL.glDisable(local5);
		}
	}

	@OriginalMember(owner = "client!aqi", name = "aeo", descriptor = "()V")
	@Override
	void method21473() {
		OpenGL.glTexEnvi(8960, 34162, method20118(this.aClass412Array6[this.anInt2983]));
	}

	@OriginalMember(owner = "client!aqi", name = "wm", descriptor = "(I)V")
	@Override
	void method21261(@OriginalArg(0) int arg0) {
		if (!this.aBoolean499) {
			OpenGL.glPolygonMode(1028, (arg0 & 0x2) == 0 ? 6914 : 6913);
		}
	}

	@OriginalMember(owner = "client!aqi", name = "abi", descriptor = "()V")
	@Override
	void method21406() {
	}

	@OriginalMember(owner = "client!aqi", name = "gb", descriptor = "()V")
	@Override
	public void method20839() {
		if (this.aClass108_6 == null) {
			return;
		}
		@Pc(7) int local7 = this.aClass108_6.method24036();
		@Pc(11) int local11 = this.aClass108_6.method24037();
		if (local7 <= 0 && local11 <= 0) {
			return;
		}
		@Pc(19) int local19 = this.anInt2971;
		@Pc(22) int local22 = this.anInt2963;
		@Pc(25) int local25 = this.anInt2972;
		@Pc(28) int local28 = this.anInt2984;
		this.method20705();
		@Pc(33) int local33 = this.anInt2979;
		@Pc(36) int local36 = this.anInt2957;
		@Pc(39) int local39 = this.anInt2995;
		@Pc(42) int local42 = this.anInt2964;
		this.method20877();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method21218();
		this.method21241(false);
		this.method21194(false);
		this.method21190(false);
		this.method21191(false);
		this.method21429(null);
		this.method21297(1);
		this.method21235(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glDisable(3553);
		OpenGL.glCopyPixels(0, 0, local7, local11, 6144);
		OpenGL.glEnable(3553);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.method20986(local33, local39, local36, local42);
		this.method20706(local19, local22, local25, local28);
	}

	@OriginalMember(owner = "client!aqi", name = "aet", descriptor = "()V")
	@Override
	void method21484() {
		if (this.aBoolean534) {
			@Pc(4) byte local4 = 0;
			@Pc(6) byte local6 = 0;
			if (this.anInt2992 == 0) {
				local4 = 0;
				local6 = 0;
			} else if (this.anInt2992 == 1) {
				local4 = 1;
				local6 = 0;
			} else if (this.anInt2992 == 2) {
				local4 = 1;
				local6 = 1;
			} else if (this.anInt2992 == 3) {
				local4 = 0;
				local6 = 1;
			}
			if (this.aClass428_3 == Class428.aClass428_6) {
				OpenGL.glBlendFuncSeparate(770, 771, local4, local6);
			} else if (this.aClass428_3 == Class428.aClass428_4) {
				OpenGL.glBlendFuncSeparate(1, 1, local4, local6);
			} else if (this.aClass428_3 == Class428.aClass428_7) {
				OpenGL.glBlendFuncSeparate(774, 1, local4, local6);
			} else if (this.aClass428_3 == Class428.aClass428_5) {
				OpenGL.glBlendFuncSeparate(1, 0, local4, local6);
			}
		} else if (this.aClass428_3 == Class428.aClass428_6) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(770, 771);
		} else if (this.aClass428_3 == Class428.aClass428_4) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(1, 1);
		} else if (this.aClass428_3 == Class428.aClass428_7) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(774, 1);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!aqi", name = "lc", descriptor = "(Lclient!df;Lclient!df;FLclient!df;)Lclient!df;")
	@Override
	public Class106 method20976(@OriginalArg(0) Class106 arg0, @OriginalArg(1) Class106 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class106 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!aqi", name = "aez", descriptor = "()V")
	@Override
	void method21445() {
		if (this.aBoolean534) {
			@Pc(4) byte local4 = 0;
			@Pc(6) byte local6 = 0;
			if (this.anInt2992 == 0) {
				local4 = 0;
				local6 = 0;
			} else if (this.anInt2992 == 1) {
				local4 = 1;
				local6 = 0;
			} else if (this.anInt2992 == 2) {
				local4 = 1;
				local6 = 1;
			} else if (this.anInt2992 == 3) {
				local4 = 0;
				local6 = 1;
			}
			if (this.aClass428_3 == Class428.aClass428_6) {
				OpenGL.glBlendFuncSeparate(770, 771, local4, local6);
			} else if (this.aClass428_3 == Class428.aClass428_4) {
				OpenGL.glBlendFuncSeparate(1, 1, local4, local6);
			} else if (this.aClass428_3 == Class428.aClass428_7) {
				OpenGL.glBlendFuncSeparate(774, 1, local4, local6);
			} else if (this.aClass428_3 == Class428.aClass428_5) {
				OpenGL.glBlendFuncSeparate(1, 0, local4, local6);
			}
		} else if (this.aClass428_3 == Class428.aClass428_6) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(770, 771);
		} else if (this.aClass428_3 == Class428.aClass428_4) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(1, 1);
		} else if (this.aClass428_3 == Class428.aClass428_7) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(774, 1);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!aqi", name = "acc", descriptor = "(Lclient!co;IIZ[BII)Lclient!lb;")
	@Override
	Interface34 method21424(@OriginalArg(0) Class210 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		return new Class140_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!aqi", name = "aej", descriptor = "()V")
	@Override
	void method21487() {
		if (this.aBoolean534) {
			@Pc(4) byte local4 = 0;
			@Pc(6) byte local6 = 0;
			if (this.anInt2992 == 0) {
				local4 = 0;
				local6 = 0;
			} else if (this.anInt2992 == 1) {
				local4 = 1;
				local6 = 0;
			} else if (this.anInt2992 == 2) {
				local4 = 1;
				local6 = 1;
			} else if (this.anInt2992 == 3) {
				local4 = 0;
				local6 = 1;
			}
			if (this.aClass428_3 == Class428.aClass428_6) {
				OpenGL.glBlendFuncSeparate(770, 771, local4, local6);
			} else if (this.aClass428_3 == Class428.aClass428_4) {
				OpenGL.glBlendFuncSeparate(1, 1, local4, local6);
			} else if (this.aClass428_3 == Class428.aClass428_7) {
				OpenGL.glBlendFuncSeparate(774, 1, local4, local6);
			} else if (this.aClass428_3 == Class428.aClass428_5) {
				OpenGL.glBlendFuncSeparate(1, 0, local4, local6);
			}
		} else if (this.aClass428_3 == Class428.aClass428_6) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(770, 771);
		} else if (this.aClass428_3 == Class428.aClass428_4) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(1, 1);
		} else if (this.aClass428_3 == Class428.aClass428_7) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(774, 1);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!aqi", name = "aee", descriptor = "()V")
	@Override
	void method21488() {
		if (this.aBoolean514) {
			OpenGL.glEnable(3042);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!aqi", name = "nr", descriptor = "()Lclient!afo;")
	@Override
	public Class108_Sub1 method21018() {
		return new Class108_Sub1_Sub1_Sub1(this);
	}

	@OriginalMember(owner = "client!aqi", name = "afr", descriptor = "()V")
	@Override
	void method21490() {
		if (this.aBoolean514) {
			OpenGL.glEnable(3042);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!aqi", name = "aic", descriptor = "(J)V")
	synchronized void method20116(@OriginalArg(0) long arg0) {
		@Pc(3) Class80 local3 = new Class80();
		local3.aLong338 = arg0 * 6850079459805481791L;
		this.aClass8_39.method232(local3, 1618197107);
	}

	@OriginalMember(owner = "client!aqi", name = "afp", descriptor = "()V")
	@Override
	void method21491() {
		if (this.aBoolean514) {
			OpenGL.glEnable(3042);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!aqi", name = "xy", descriptor = "(Ljava/lang/String;)Lclient!hb;")
	@Override
	public Class113 method21329(@OriginalArg(0) String arg0) {
		@Pc(3) byte[] local3 = this.method20115(arg0);
		if (local3 == null) {
			return null;
		} else {
			@Pc(11) Class324 local11 = this.method21144(local3);
			return new Class113_Sub2(this, local11);
		}
	}

	@OriginalMember(owner = "client!aqi", name = "ut", descriptor = "(IZ[[I)Lclient!ml;")
	@Override
	Interface42 method21213(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[][] arg2) {
		return new Class140_Sub3(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!aqi", name = "aff", descriptor = "()V")
	@Override
	void method21495() {
		if (this.aBoolean526 && this.aBoolean522 && this.anInt2985 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!aqi", name = "afm", descriptor = "(Z)V")
	@Override
	void method21496(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			OpenGL.glEnable(32925);
		} else {
			OpenGL.glDisable(32925);
		}
	}

	@OriginalMember(owner = "client!aqi", name = "afa", descriptor = "(Z)V")
	@Override
	void method21497(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			OpenGL.glEnable(32925);
		} else {
			OpenGL.glDisable(32925);
		}
	}

	@OriginalMember(owner = "client!aqi", name = "afq", descriptor = "(Z)V")
	@Override
	void method21498(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			OpenGL.glEnable(32925);
		} else {
			OpenGL.glDisable(32925);
		}
	}

	@OriginalMember(owner = "client!aqi", name = "afs", descriptor = "(Z)Lclient!mv;")
	@Override
	Interface44 method21499(@OriginalArg(0) boolean arg0) {
		return new Class142_Sub1(this, Class236.aClass236_19, arg0);
	}

	@OriginalMember(owner = "client!aqi", name = "afj", descriptor = "(Z)Lclient!mv;")
	@Override
	Interface44 method21500(@OriginalArg(0) boolean arg0) {
		return new Class142_Sub1(this, Class236.aClass236_19, arg0);
	}

	@OriginalMember(owner = "client!aqi", name = "afy", descriptor = "(Z)Lclient!mv;")
	@Override
	Interface44 method21501(@OriginalArg(0) boolean arg0) {
		return new Class142_Sub1(this, Class236.aClass236_19, arg0);
	}

	@OriginalMember(owner = "client!aqi", name = "acn", descriptor = "(Lclient!co;Lclient!dy;II)Lclient!lb;")
	@Override
	Interface34 method21387(@OriginalArg(0) Class210 arg0, @OriginalArg(1) Class236 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return this.method21215(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!aqi", name = "afn", descriptor = "(Z)Lclient!lx;")
	@Override
	Interface38 method21503(@OriginalArg(0) boolean arg0) {
		return new Class142_Sub2(this, arg0);
	}

	@OriginalMember(owner = "client!aqi", name = "afd", descriptor = "(Lclient!ld;)V")
	@Override
	public void method21349(@OriginalArg(0) Class135 arg0) {
		@Pc(2) Class397[] local2 = arg0.aClass397Array3;
		@Pc(4) int local4 = 0;
		@Pc(6) boolean local6 = false;
		@Pc(8) boolean local8 = false;
		@Pc(10) boolean local10 = false;
		@Pc(12) int local12;
		for (local12 = 0; local12 < local2.length; local12++) {
			@Pc(20) Class397 local20 = local2[local12];
			@Pc(25) Class142_Sub2 local25 = this.aClass142_Sub2Array1[local12];
			@Pc(27) int local27 = 0;
			@Pc(30) int local30 = local25.method11305();
			@Pc(33) long local33 = local25.method11280();
			local25.method11273();
			for (@Pc(37) int local37 = 0; local37 < local20.method28707(); local37++) {
				@Pc(45) Class400 local45 = local20.method28708(local37);
				switch(local45.anInt4567) {
					case 0:
						OpenGL.glColorPointer(4, 5121, local30, local33 + (long) local27);
						local6 = true;
						break;
					case 1:
						OpenGL.glClientActiveTexture(local4++ + 33984);
						OpenGL.glTexCoordPointer(4, 5126, local30, local33 + (long) local27);
					case 2:
					case 5:
					case 8:
					default:
						break;
					case 3:
						OpenGL.glNormalPointer(5126, local30, local33 + (long) local27);
						local8 = true;
						break;
					case 4:
						OpenGL.glClientActiveTexture(local4++ + 33984);
						OpenGL.glTexCoordPointer(3, 5126, local30, local33 + (long) local27);
						break;
					case 6:
						OpenGL.glClientActiveTexture(local4++ + 33984);
						OpenGL.glTexCoordPointer(1, 5126, local30, local33 + (long) local27);
						break;
					case 7:
						OpenGL.glVertexPointer(3, 5126, local30, local33 + (long) local27);
						local10 = true;
						break;
					case 9:
						OpenGL.glClientActiveTexture(local4++ + 33984);
						OpenGL.glTexCoordPointer(2, 5126, local30, local33 + (long) local27);
				}
				local27 += local45.anInt4572;
			}
		}
		if (this.aBoolean490 != local10) {
			if (local10) {
				OpenGL.glEnableClientState(32884);
			} else {
				OpenGL.glDisableClientState(32884);
			}
			this.aBoolean490 = local10;
		}
		if (this.aBoolean491 != local8) {
			if (local8) {
				OpenGL.glEnableClientState(32885);
			} else {
				OpenGL.glDisableClientState(32885);
			}
			this.aBoolean491 = local8;
		}
		if (this.aBoolean489 != local6) {
			if (local6) {
				OpenGL.glEnableClientState(32886);
			} else {
				OpenGL.glDisableClientState(32886);
			}
			this.aBoolean489 = local6;
		}
		if (this.anInt2833 < local4) {
			for (local12 = this.anInt2833; local12 < local4; local12++) {
				OpenGL.glClientActiveTexture(local12 + 33984);
				OpenGL.glEnableClientState(32888);
			}
			this.anInt2833 = local4;
		} else if (this.anInt2833 > local4) {
			for (local12 = local4; local12 < this.anInt2833; local12++) {
				OpenGL.glClientActiveTexture(local12 + 33984);
				OpenGL.glDisableClientState(32888);
			}
			this.anInt2833 = local4;
		}
	}

	@OriginalMember(owner = "client!aqi", name = "afz", descriptor = "()V")
	@Override
	void method21356() {
		if (this.aBoolean526 && this.aBoolean522 && this.anInt2985 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!aqi", name = "abp", descriptor = "(Lclient!co;Lclient!dy;)Z")
	@Override
	boolean method21412(@OriginalArg(0) Class210 arg0, @OriginalArg(1) Class236 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!aqi", name = "afi", descriptor = "(ILclient!lx;)V")
	@Override
	public void method21198(@OriginalArg(0) int arg0, @OriginalArg(1) Interface38 arg1) {
		this.aClass142_Sub2Array1[arg0] = (Class142_Sub2) arg1;
	}

	@OriginalMember(owner = "client!aqi", name = "afv", descriptor = "(Lclient!mv;)V")
	@Override
	void method21506(@OriginalArg(0) Interface44 arg0) {
		this.aClass142_Sub1_1 = (Class142_Sub1) arg0;
		this.aClass142_Sub1_1.method11273();
	}

	@OriginalMember(owner = "client!aqi", name = "agd", descriptor = "(Lclient!md;II)V")
	@Override
	public void method21512(@OriginalArg(0) Class415 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) byte local4;
		@Pc(8) int local8;
		if (arg0 == Class415.aClass415_3) {
			local4 = 1;
			local8 = arg2 * 2;
		} else if (arg0 == Class415.aClass415_2) {
			local4 = 3;
			local8 = arg2 + 1;
		} else if (arg0 == Class415.aClass415_6) {
			local4 = 4;
			local8 = arg2 * 3;
		} else if (arg0 == Class415.aClass415_4) {
			local4 = 6;
			local8 = arg2 + 2;
		} else if (arg0 == Class415.aClass415_5) {
			local4 = 5;
			local8 = arg2 + 2;
		} else {
			local4 = 0;
			local8 = arg2;
		}
		OpenGL.glDrawArrays(local4, arg1, local8);
	}

	@OriginalMember(owner = "client!aqi", name = "agg", descriptor = "(Lclient!md;IIII)V")
	@Override
	public void method21513(@OriginalArg(0) Class415 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(4) byte local4;
		@Pc(8) int local8;
		if (arg0 == Class415.aClass415_3) {
			local4 = 1;
			local8 = arg4 * 2;
		} else if (arg0 == Class415.aClass415_2) {
			local4 = 3;
			local8 = arg4 + 1;
		} else if (arg0 == Class415.aClass415_6) {
			local4 = 4;
			local8 = arg4 * 3;
		} else if (arg0 == Class415.aClass415_4) {
			local4 = 6;
			local8 = arg4 + 2;
		} else if (arg0 == Class415.aClass415_5) {
			local4 = 5;
			local8 = arg4 + 2;
		} else {
			local4 = 0;
			local8 = arg4;
		}
		@Pc(57) Class236 local57 = this.aClass142_Sub1_1.method29400();
		OpenGL.glDrawElements(local4, local8, method20102(local57), this.aClass142_Sub1_1.method11280() + (long) (arg3 * local57.anInt3804 * -369125885));
	}

	@OriginalMember(owner = "client!aqi", name = "agt", descriptor = "(I)V")
	@Override
	void method21514(@OriginalArg(0) int arg0) {
		if (!this.aBoolean499) {
			OpenGL.glPolygonMode(1028, (arg0 & 0x2) == 0 ? 6914 : 6913);
		}
	}

	@OriginalMember(owner = "client!aqi", name = "agr", descriptor = "(I)V")
	@Override
	void method21515(@OriginalArg(0) int arg0) {
		if (!this.aBoolean499) {
			OpenGL.glPolygonMode(1028, (arg0 & 0x2) == 0 ? 6914 : 6913);
		}
	}

	@OriginalMember(owner = "client!aqi", name = "aeu", descriptor = "()V")
	@Override
	void method21472() {
		OpenGL.glTexEnvi(8960, 34162, method20118(this.aClass412Array6[this.anInt2983]));
	}

	@OriginalMember(owner = "client!aqi", name = "agw", descriptor = "()V")
	@Override
	void method21167() {
		if (this.aClass108_6 != null) {
			OpenGL.glViewport(this.anInt2989 + this.anInt2971, this.anInt2974 + this.aClass108_6.method24037() - this.anInt2963 - this.anInt2984, this.anInt2972, this.anInt2984);
		}
		OpenGL.glDepthRange(this.aFloat205, this.aFloat206);
	}

	@OriginalMember(owner = "client!aqi", name = "agf", descriptor = "()V")
	@Override
	void method21520() {
		if (this.aClass108_6 != null) {
			OpenGL.glViewport(this.anInt2989 + this.anInt2971, this.anInt2974 + this.aClass108_6.method24037() - this.anInt2963 - this.anInt2984, this.anInt2972, this.anInt2984);
		}
		OpenGL.glDepthRange(this.aFloat205, this.aFloat206);
	}

	@OriginalMember(owner = "client!aqi", name = "agk", descriptor = "()V")
	@Override
	void method21139() {
		if (this.aBoolean516 && this.aBoolean517) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
	}

	@OriginalMember(owner = "client!aqi", name = "wh", descriptor = "(Z)Lclient!mv;")
	@Override
	Interface44 method21246(@OriginalArg(0) boolean arg0) {
		return new Class142_Sub1(this, Class236.aClass236_19, arg0);
	}

	@OriginalMember(owner = "client!aqi", name = "agc", descriptor = "()V")
	@Override
	void method21168() {
		this.aFloatArray54[0] = this.aFloat214 * this.aFloat208;
		this.aFloatArray54[1] = this.aFloat214 * this.aFloat209;
		this.aFloatArray54[2] = this.aFloat214 * this.aFloat210;
		this.aFloatArray54[3] = 1.0F;
		OpenGL.glLightfv(16384, 4609, this.aFloatArray54, 0);
		this.aFloatArray54[0] = -this.aFloat216 * this.aFloat208;
		this.aFloatArray54[1] = -this.aFloat216 * this.aFloat209;
		this.aFloatArray54[2] = -this.aFloat216 * this.aFloat210;
		this.aFloatArray54[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, this.aFloatArray54, 0);
	}

	@OriginalMember(owner = "client!aqi", name = "agi", descriptor = "()V")
	@Override
	void method21522() {
		this.aFloatArray54[0] = this.aFloat214 * this.aFloat208;
		this.aFloatArray54[1] = this.aFloat214 * this.aFloat209;
		this.aFloatArray54[2] = this.aFloat214 * this.aFloat210;
		this.aFloatArray54[3] = 1.0F;
		OpenGL.glLightfv(16384, 4609, this.aFloatArray54, 0);
		this.aFloatArray54[0] = -this.aFloat216 * this.aFloat208;
		this.aFloatArray54[1] = -this.aFloat216 * this.aFloat209;
		this.aFloatArray54[2] = -this.aFloat216 * this.aFloat210;
		this.aFloatArray54[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, this.aFloatArray54, 0);
	}

	@OriginalMember(owner = "client!aqi", name = "ur", descriptor = "(Lclient!co;IIZ[BII)Lclient!lb;")
	@Override
	Interface34 method21221(@OriginalArg(0) Class210 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		return new Class140_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!aqi", name = "agl", descriptor = "()V")
	@Override
	void method21523() {
		this.aFloat218 = this.aFloat202 - (float) this.anInt2990;
		this.aFloat217 = this.aFloat218 - (float) this.anInt2985;
		if (this.aFloat217 < this.aFloat215) {
			this.aFloat217 = this.aFloat215;
		}
		if (!this.aBoolean518) {
			return;
		}
		OpenGL.glFogf(2915, this.aFloat217);
		OpenGL.glFogf(2916, this.aFloat218);
		this.aFloatArray54[0] = (float) (this.anInt2965 & 0xFF0000) / 1.671168E7F;
		this.aFloatArray54[1] = (float) (this.anInt2965 & 0xFF00) / 65280.0F;
		this.aFloatArray54[2] = (float) (this.anInt2965 & 0xFF) / 255.0F;
		OpenGL.glFogfv(2918, this.aFloatArray54, 0);
	}

	@OriginalMember(owner = "client!aqi", name = "agm", descriptor = "()V")
	@Override
	void method21154() {
		this.aFloat218 = this.aFloat202 - (float) this.anInt2990;
		this.aFloat217 = this.aFloat218 - (float) this.anInt2985;
		if (this.aFloat217 < this.aFloat215) {
			this.aFloat217 = this.aFloat215;
		}
		if (!this.aBoolean518) {
			return;
		}
		OpenGL.glFogf(2915, this.aFloat217);
		OpenGL.glFogf(2916, this.aFloat218);
		this.aFloatArray54[0] = (float) (this.anInt2965 & 0xFF0000) / 1.671168E7F;
		this.aFloatArray54[1] = (float) (this.anInt2965 & 0xFF00) / 65280.0F;
		this.aFloatArray54[2] = (float) (this.anInt2965 & 0xFF) / 255.0F;
		OpenGL.glFogfv(2918, this.aFloatArray54, 0);
	}

	@OriginalMember(owner = "client!aqi", name = "agz", descriptor = "()V")
	@Override
	void method21525() {
		this.aFloat218 = this.aFloat202 - (float) this.anInt2990;
		this.aFloat217 = this.aFloat218 - (float) this.anInt2985;
		if (this.aFloat217 < this.aFloat215) {
			this.aFloat217 = this.aFloat215;
		}
		if (!this.aBoolean518) {
			return;
		}
		OpenGL.glFogf(2915, this.aFloat217);
		OpenGL.glFogf(2916, this.aFloat218);
		this.aFloatArray54[0] = (float) (this.anInt2965 & 0xFF0000) / 1.671168E7F;
		this.aFloatArray54[1] = (float) (this.anInt2965 & 0xFF00) / 65280.0F;
		this.aFloatArray54[2] = (float) (this.anInt2965 & 0xFF) / 255.0F;
		OpenGL.glFogfv(2918, this.aFloatArray54, 0);
	}

	@OriginalMember(owner = "client!aqi", name = "agv", descriptor = "([Lclient!lf;)Lclient!ld;")
	@Override
	Class135 method21526(@OriginalArg(0) Class397[] arg0) {
		return new Class135_Sub1(arg0);
	}

	@OriginalMember(owner = "client!aqi", name = "aew", descriptor = "()V")
	@Override
	void method21471() {
		OpenGL.glTexEnvi(8960, 34161, method20118(this.aClass412Array5[this.anInt2983]));
	}

	@OriginalMember(owner = "client!aqi", name = "ags", descriptor = "()V")
	@Override
	void method21389() {
		if (this.aBoolean516 && this.aBoolean517) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
	}

	@OriginalMember(owner = "client!aqi", name = "agj", descriptor = "([Lclient!lf;)Lclient!ld;")
	@Override
	Class135 method21383(@OriginalArg(0) Class397[] arg0) {
		return new Class135_Sub1(arg0);
	}

	@OriginalMember(owner = "client!aqi", name = "ago", descriptor = "([Lclient!lf;)Lclient!ld;")
	@Override
	Class135 method21530(@OriginalArg(0) Class397[] arg0) {
		return new Class135_Sub1(arg0);
	}

	@OriginalMember(owner = "client!aqi", name = "l", descriptor = "()Lclient!cf;")
	@Override
	public Class203 method20656() {
		@Pc(1) int local1 = -1;
		if (this.aString78.indexOf("nvidia") != -1) {
			local1 = 4318;
		} else if (this.aString78.indexOf("intel") != -1) {
			local1 = 32902;
		} else if (this.aString78.indexOf("ati") != -1) {
			local1 = 4098;
		}
		return new Class203(local1, this.method21245() ? "OpenGL FF" : "OpenGL", this.anInt2834, this.aString77, 0L, this.method21245());
	}

	@OriginalMember(owner = "client!aqi", name = "ahb", descriptor = "(Lclient!mv;Lclient!md;IIII)V")
	@Override
	void method21532(@OriginalArg(0) Interface44 arg0, @OriginalArg(1) Class415 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) byte local4;
		@Pc(8) int local8;
		if (arg1 == Class415.aClass415_3) {
			local4 = 1;
			local8 = arg5 * 2;
		} else if (arg1 == Class415.aClass415_2) {
			local4 = 3;
			local8 = arg5 + 1;
		} else if (arg1 == Class415.aClass415_6) {
			local4 = 4;
			local8 = arg5 * 3;
		} else if (arg1 == Class415.aClass415_4) {
			local4 = 6;
			local8 = arg5 + 2;
		} else if (arg1 == Class415.aClass415_5) {
			local4 = 5;
			local8 = arg5 + 2;
		} else {
			local4 = 0;
			local8 = arg5;
		}
		@Pc(56) Class236 local56 = arg0.method29400();
		@Pc(59) Class142_Sub1 local59 = (Class142_Sub1) arg0;
		local59.method11273();
		OpenGL.glDrawElements(local4, local8, method20102(local56), local59.method11280() + (long) (arg4 * local56.anInt3804 * -369125885));
	}

	@OriginalMember(owner = "client!aqi", name = "gk", descriptor = "(IIII)[I")
	@Override
	public int[] method20836(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(8) int local8 = this.aClass108_6.method24037();
		for (@Pc(10) int local10 = 0; local10 < arg3; local10++) {
			OpenGL.glReadPixelsi(arg0, local8 - arg1 - local10 - 1, arg2, 1, 32993, this.anInt2837, local4, local10 * arg2);
		}
		return local4;
	}

	@OriginalMember(owner = "client!aqi", name = "ahm", descriptor = "(Ljava/lang/String;)[B")
	byte[] method20119(@OriginalArg(0) String arg0) {
		return this.method21143("gl", arg0);
	}

	@OriginalMember(owner = "client!aqi", name = "ahk", descriptor = "(Ljava/lang/String;)[B")
	byte[] method20120(@OriginalArg(0) String arg0) {
		return this.method21143("gl", arg0);
	}

	@OriginalMember(owner = "client!aqi", name = "xw", descriptor = "()Z")
	@Override
	public boolean method21319() {
		return this.aBoolean496;
	}

	@OriginalMember(owner = "client!aqi", name = "ahs", descriptor = "(II[I[I)J")
	long method20121(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		if (!this.aBoolean498) {
			if (this.aClass99_20 == null) {
				this.method20094(arg0, arg1);
			}
			if (this.aClass99_19 == null) {
				this.aClass99_19 = this.method20743(0, 0, this.aClass108_6.method24036(), this.aClass108_6.method24037(), false);
			} else {
				this.aClass99_19.method18223(0, 0, this.aClass108_6.method24036(), this.aClass108_6.method24037(), 0, 0);
			}
			this.method20684(this.aClass108_Sub1_3, -421008235);
			this.method20714(1, -16777216);
			this.aClass99_19.method18228(this.anInt2947 * 1069673649, this.anInt2932 * 262780429, this.anInt2948 * -244276243, this.anInt2936 * -69329917);
			this.aClass99_20.method18222(0, 0, arg0, arg1, arg2, arg3, 0, arg0);
			this.method20887(this.aClass108_Sub1_3, (byte) 1);
			return 0L;
		}
		if (this.aLongArray13[this.anInt2836] != 0L) {
			OpenGL.glDeleteSync(this.aLongArray13[this.anInt2836]);
			this.aLongArray13[this.anInt2836] = 0L;
		}
		OpenGL.glBindBufferARB(35051, this.anIntArray252[this.anInt2836]);
		@Pc(33) long local33 = OpenGL.glMapBufferARB(35051, 35000);
		if (arg2 != null) {
			for (@Pc(37) int local37 = 0; local37 < arg0 * arg1; local37++) {
				arg2[local37] = this.anUnsafe4.getInt(local33 + (long) (local37 * 4));
			}
			if (!OpenGL.glUnmapBufferARB(35051)) {
			}
			OpenGL.glBindBufferARB(35051, 0);
			local33 = 0L;
		}
		if (++this.anInt2836 >= 3) {
			this.anInt2836 = 0;
		}
		return local33;
	}

	@OriginalMember(owner = "client!aqi", name = "ahy", descriptor = "(II)V")
	synchronized void method20122(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class80_Sub20 local4 = new Class80_Sub20(arg1);
		local4.aLong338 = (long) arg0 * 6850079459805481791L;
		this.aClass8_33.method232(local4, 457840232);
	}

	@OriginalMember(owner = "client!aqi", name = "ahu", descriptor = "(II)V")
	void method20123(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method20683();
		this.method20703(arg0, arg1, (byte) 65);
		if (!this.aBoolean498) {
			this.aClass99_20 = this.method20739(arg0, arg1, false, true);
			this.aClass108_Sub1_3 = this.method20687();
			this.aClass108_Sub1_3.method23903(0, this.aClass99_20.method18231());
			return;
		}
		this.aClass99_20 = this.method20739(arg0, arg1, false, true);
		this.aClass108_Sub1_3 = this.method20687();
		this.aClass108_Sub1_3.method23903(0, this.aClass99_20.method18231());
		OpenGL.glGenBuffersARB(3, this.anIntArray252, 0);
		for (@Pc(35) int local35 = 0; local35 < 3; local35++) {
			OpenGL.glBindBufferARB(35051, this.anIntArray252[local35]);
			OpenGL.glBufferDataARBa(35051, arg0 * arg1 * 4, 0L, 35041);
			OpenGL.glBindBufferARB(35051, 0);
		}
	}

	@OriginalMember(owner = "client!aqi", name = "yb", descriptor = "()V")
	@Override
	void method21341() {
		OpenGL.glDepthFunc(515);
		this.method20097();
		OpenGL.glClearDepth(1.0F);
		OpenGL.glAlphaFunc(516, 0.0F);
		OpenGL.glPolygonMode(1028, 6914);
		if (this.aBoolean531) {
			this.method21323(this.anInt2994 > 1);
			OpenGL.glDisable(32926);
		}
		for (@Pc(30) int local30 = this.anInt2998 - 1; local30 >= 0; local30--) {
			OpenGL.glActiveTexture(local30 + 33984);
			OpenGL.glTexEnvi(8960, 8704, 34160);
			OpenGL.glTexEnvi(8960, 34161, 8448);
			OpenGL.glTexEnvi(8960, 34178, 34166);
			OpenGL.glTexEnvi(8960, 34162, 8448);
			OpenGL.glTexEnvi(8960, 34186, 34166);
		}
		OpenGL.glTexEnvi(8960, 34186, 34168);
		OpenGL.glShadeModel(7425);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glColorMaterial(1028, 5634);
		OpenGL.glEnable(2903);
		@Pc(91) float[] local91 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(93) int local93 = 0; local93 < 8; local93++) {
			@Pc(100) int local100 = local93 + 16384;
			OpenGL.glLightfv(local100, 4608, local91, 0);
			OpenGL.glLightf(local100, 4615, 0.0F);
			OpenGL.glLightf(local100, 4616, 0.0F);
		}
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anOpenGL3.setSwapInterval(0);
		super.method21148();
	}

	@OriginalMember(owner = "client!aqi", name = "vc", descriptor = "()V")
	@Override
	void method21231() {
		OpenGL.glActiveTexture(this.anInt2983 + 33984);
	}

	@OriginalMember(owner = "client!aqi", name = "aia", descriptor = "()V")
	void method20126() {
		if (this.anInt2993 == 1) {
			OpenGL.glDisable(2884);
			return;
		}
		OpenGL.glEnable(2884);
		if (this.anInt2993 == 2) {
			OpenGL.glCullFace(1029);
		} else if (this.anInt2993 == 3) {
			OpenGL.glCullFace(1028);
		}
	}

	@OriginalMember(owner = "client!aqi", name = "aid", descriptor = "()V")
	void method20127() {
		if (this.anInt2993 == 1) {
			OpenGL.glDisable(2884);
			return;
		}
		OpenGL.glEnable(2884);
		if (this.anInt2993 == 2) {
			OpenGL.glCullFace(1029);
		} else if (this.anInt2993 == 3) {
			OpenGL.glCullFace(1028);
		}
	}

	@OriginalMember(owner = "client!aqi", name = "aib", descriptor = "()V")
	void method20128() {
		if (this.anInt2993 == 1) {
			OpenGL.glDisable(2884);
			return;
		}
		OpenGL.glEnable(2884);
		if (this.anInt2993 == 2) {
			OpenGL.glCullFace(1029);
		} else if (this.anInt2993 == 3) {
			OpenGL.glCullFace(1028);
		}
	}

	@OriginalMember(owner = "client!aqi", name = "aim", descriptor = "(II)V")
	synchronized void method20129(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class80_Sub20 local4 = new Class80_Sub20(arg1);
		local4.aLong338 = (long) arg0 * 6850079459805481791L;
		this.aClass8_38.method232(local4, 765860092);
	}

	@OriginalMember(owner = "client!aqi", name = "aiy", descriptor = "(II)V")
	synchronized void method20130(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class80_Sub20 local4 = new Class80_Sub20(arg1);
		local4.aLong338 = (long) arg0 * 6850079459805481791L;
		this.aClass8_38.method232(local4, 1939839069);
	}

	@OriginalMember(owner = "client!aqi", name = "ais", descriptor = "(II)V")
	synchronized void method20131(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class80_Sub20 local4 = new Class80_Sub20(arg1);
		local4.aLong338 = (long) arg0 * 6850079459805481791L;
		this.aClass8_33.method232(local4, 1331932446);
	}

	@OriginalMember(owner = "client!aqi", name = "wl", descriptor = "()V")
	@Override
	void method21244() {
		if (this.aBoolean526 && this.aBoolean522 && this.anInt2985 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!aqi", name = "aii", descriptor = "(II)V")
	synchronized void method20132(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class80_Sub20 local4 = new Class80_Sub20(arg1);
		local4.aLong338 = (long) arg0 * 6850079459805481791L;
		this.aClass8_33.method232(local4, 47388596);
	}

	@OriginalMember(owner = "client!aqi", name = "aiw", descriptor = "(I)V")
	synchronized void method20133(@OriginalArg(0) int arg0) {
		@Pc(4) Class80_Sub20 local4 = new Class80_Sub20(arg0);
		this.aClass8_34.method232(local4, 2101345760);
	}

	@OriginalMember(owner = "client!aqi", name = "ait", descriptor = "(I)V")
	synchronized void method20134(@OriginalArg(0) int arg0) {
		@Pc(4) Class80_Sub20 local4 = new Class80_Sub20(arg0);
		this.aClass8_34.method232(local4, 1090720465);
	}

	@OriginalMember(owner = "client!aqi", name = "es", descriptor = "()Lclient!cf;")
	@Override
	public Class203 method20799() {
		@Pc(1) int local1 = -1;
		if (this.aString78.indexOf("nvidia") != -1) {
			local1 = 4318;
		} else if (this.aString78.indexOf("intel") != -1) {
			local1 = 32902;
		} else if (this.aString78.indexOf("ati") != -1) {
			local1 = 4098;
		}
		return new Class203(local1, this.method21245() ? "OpenGL FF" : "OpenGL", this.anInt2834, this.aString77, 0L, this.method21245());
	}

	@OriginalMember(owner = "client!aqi", name = "eg", descriptor = "()V")
	@Override
	public void method20803() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!aqi", name = "ael", descriptor = "(I)V")
	@Override
	void method21482(@OriginalArg(0) int arg0) {
		OpenGL.glColorMask((arg0 & 0x1) != 0, (arg0 & 0x2) != 0, (arg0 & 0x4) != 0, (arg0 & 0x8) != 0);
	}

	@OriginalMember(owner = "client!aqi", name = "aiv", descriptor = "(I)V")
	synchronized void method20135(@OriginalArg(0) int arg0) {
		@Pc(3) Class80 local3 = new Class80();
		local3.aLong338 = (long) arg0 * 6850079459805481791L;
		this.aClass8_37.method232(local3, 990901519);
	}

	@OriginalMember(owner = "client!aqi", name = "adm", descriptor = "()V")
	@Override
	void method21454() {
		this.aFloatArray54[0] = (float) (this.anInt2949 & 0xFF0000) / 1.671168E7F;
		this.aFloatArray54[1] = (float) (this.anInt2949 & 0xFF00) / 65280.0F;
		this.aFloatArray54[2] = (float) (this.anInt2949 & 0xFF) / 255.0F;
		this.aFloatArray54[3] = (float) (this.anInt2949 >>> 24) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, this.aFloatArray54, 0);
	}

	@OriginalMember(owner = "client!aqi", name = "au", descriptor = "(III)V")
	@Override
	public void method20867(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.method20782();
		if (this.aClass108_Sub1_3 == null) {
			this.method20094(arg1, arg2);
		}
		if (this.aClass99_19 == null) {
			this.aClass99_19 = this.method20743(0, 0, this.aClass108_6.method24036(), this.aClass108_6.method24037(), false);
		} else {
			this.aClass99_19.method18223(0, 0, this.aClass108_6.method24036(), this.aClass108_6.method24037(), 0, 0);
		}
		this.method20684(this.aClass108_Sub1_3, 338197999);
		this.method20714(1, -16777216);
		this.aClass99_19.method18228(this.anInt2947 * 1069673649, this.anInt2932 * 262780429, this.anInt2948 * -244276243, this.anInt2936 * -69329917);
		OpenGL.glBindBufferARB(35051, this.anIntArray252[this.anInt2838]);
		OpenGL.glReadPixelsub(0, 0, this.anInt2945 * -971613875, this.anInt2935 * 143307461, 32993, 5121, null, 0);
		OpenGL.glBindBufferARB(35051, 0);
		this.method20887(this.aClass108_Sub1_3, (byte) 1);
		this.aLongArray13[this.anInt2838] = OpenGL.glFenceSync(37143, 0);
		this.anIntArray249[this.anInt2838] = arg0;
		if (++this.anInt2838 >= 3) {
			this.anInt2838 = 0;
		}
		this.method20746();
	}

	@OriginalMember(owner = "client!aqi", name = "sg", descriptor = "(Ljava/lang/String;)Lclient!hb;")
	@Override
	public Class113 method21142(@OriginalArg(0) String arg0) {
		@Pc(3) byte[] local3 = this.method20115(arg0);
		if (local3 == null) {
			return null;
		} else {
			@Pc(11) Class324 local11 = this.method21144(local3);
			return new Class113_Sub2(this, local11);
		}
	}

	@OriginalMember(owner = "client!aqi", name = "aix", descriptor = "()V")
	void method20141() {
		@Pc(1) int local1 = 0;
		while (!this.anOpenGL3.f()) {
			if (local1++ > 5) {
				throw new RuntimeException("");
			}
			Class217.method25866(1000L);
		}
	}

	@OriginalMember(owner = "client!aqi", name = "ajh", descriptor = "()V")
	void method20142() {
		@Pc(1) int local1 = 0;
		while (!this.anOpenGL3.f()) {
			if (local1++ > 5) {
				throw new RuntimeException("");
			}
			Class217.method25866(1000L);
		}
	}

	@OriginalMember(owner = "client!aqi", name = "ajz", descriptor = "()V")
	void method20143() {
		@Pc(1) int local1 = 0;
		while (!this.anOpenGL3.f()) {
			if (local1++ > 5) {
				throw new RuntimeException("");
			}
			Class217.method25866(1000L);
		}
	}
}
