package jagex3;

import jagdx.D3DADAPTER_IDENTIFIER;
import jagdx.D3DCAPS;
import jagdx.D3DDISPLAYMODE;
import jagdx.D3DLIGHT;
import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.IDirect3D;
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DEventQuery;
import jagdx.IDirect3DSurface;
import jagdx.IUnknown;
import jagdx.e;
import jagdx.m;
import jagdx.u;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aqd")
public final class Class104_Sub2_Sub1 extends Class104_Sub2 {

	@OriginalMember(owner = "client!aqd", name = "if", descriptor = "I")
	static final int anInt2732 = 3;

	@OriginalMember(owner = "client!aqd", name = "ic", descriptor = "[I")
	static final int[] anIntArray228 = new int[] { 77, 80 };

	@OriginalMember(owner = "client!aqd", name = "jd", descriptor = "[I")
	static final int[] anIntArray229 = new int[] { 22, 23 };

	@OriginalMember(owner = "client!aqd", name = "io", descriptor = "Lclient!agt;")
	Class116_Sub2 aClass116_Sub2_2;

	@OriginalMember(owner = "client!aqd", name = "iq", descriptor = "J")
	long aLong120;

	@OriginalMember(owner = "client!aqd", name = "il", descriptor = "Z")
	boolean aBoolean441;

	@OriginalMember(owner = "client!aqd", name = "hf", descriptor = "J")
	long aLong117 = 0L;

	@OriginalMember(owner = "client!aqd", name = "hr", descriptor = "J")
	long aLong121 = 0L;

	@OriginalMember(owner = "client!aqd", name = "hp", descriptor = "Lclient!aat;")
	Class22 aClass22_33 = new Class22();

	@OriginalMember(owner = "client!aqd", name = "hy", descriptor = "Z")
	boolean aBoolean432 = false;

	@OriginalMember(owner = "client!aqd", name = "he", descriptor = "J")
	long aLong118 = 0L;

	@OriginalMember(owner = "client!aqd", name = "hn", descriptor = "J")
	long aLong122 = 0L;

	@OriginalMember(owner = "client!aqd", name = "hi", descriptor = "J")
	long aLong119 = 0L;

	@OriginalMember(owner = "client!aqd", name = "hw", descriptor = "Z")
	boolean aBoolean442 = false;

	@OriginalMember(owner = "client!aqd", name = "iw", descriptor = "[F")
	final float[] aFloatArray50 = new float[16];

	@OriginalMember(owner = "client!aqd", name = "ip", descriptor = "I")
	int anInt2734 = 128;

	@OriginalMember(owner = "client!aqd", name = "id", descriptor = "I")
	int anInt2733 = 0;

	@OriginalMember(owner = "client!aqd", name = "ia", descriptor = "[J")
	long[] aLongArray14 = new long[this.anInt2734];

	@OriginalMember(owner = "client!aqd", name = "ih", descriptor = "J")
	long aLong123 = 0L;

	@OriginalMember(owner = "client!aqd", name = "iy", descriptor = "[J")
	long[] aLongArray13 = new long[3];

	@OriginalMember(owner = "client!aqd", name = "ii", descriptor = "[J")
	long[] aLongArray15 = new long[3];

	@OriginalMember(owner = "client!aqd", name = "iz", descriptor = "[I")
	int[] anIntArray227 = new int[3];

	@OriginalMember(owner = "client!aqd", name = "ik", descriptor = "I")
	int anInt2735 = 0;

	@OriginalMember(owner = "client!aqd", name = "im", descriptor = "I")
	int anInt2736 = 0;

	@OriginalMember(owner = "client!aqd", name = "hx", descriptor = "I")
	final int anInt2731;

	@OriginalMember(owner = "client!aqd", name = "hq", descriptor = "I")
	final int anInt2730;

	@OriginalMember(owner = "client!aqd", name = "hh", descriptor = "Lclient!jagdx/D3DDISPLAYMODE;")
	final D3DDISPLAYMODE aD3DDISPLAYMODE1;

	@OriginalMember(owner = "client!aqd", name = "hs", descriptor = "Lclient!jagdx/D3DPRESENT_PARAMETERS;")
	final D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS2;

	@OriginalMember(owner = "client!aqd", name = "ig", descriptor = "Lclient!jagdx/D3DCAPS;")
	final D3DCAPS aD3DCAPS1;

	@OriginalMember(owner = "client!aqd", name = "iv", descriptor = "Z")
	final boolean aBoolean436;

	@OriginalMember(owner = "client!aqd", name = "in", descriptor = "Z")
	final boolean aBoolean433;

	@OriginalMember(owner = "client!aqd", name = "iu", descriptor = "Z")
	final boolean aBoolean434;

	@OriginalMember(owner = "client!aqd", name = "ie", descriptor = "Z")
	final boolean aBoolean437;

	@OriginalMember(owner = "client!aqd", name = "ir", descriptor = "Z")
	final boolean aBoolean438;

	@OriginalMember(owner = "client!aqd", name = "it", descriptor = "Z")
	final boolean aBoolean439;

	@OriginalMember(owner = "client!aqd", name = "ix", descriptor = "Z")
	final boolean aBoolean435;

	@OriginalMember(owner = "client!aqd", name = "is", descriptor = "Z")
	final boolean aBoolean431;

	@OriginalMember(owner = "client!aqd", name = "ib", descriptor = "Z")
	final boolean aBoolean440;

	@OriginalMember(owner = "client!aqd", name = "ht", descriptor = "[Z")
	boolean[] aBooleanArray14;

	@OriginalMember(owner = "client!aqd", name = "hc", descriptor = "[Z")
	boolean[] aBooleanArray15;

	@OriginalMember(owner = "client!aqd", name = "ho", descriptor = "[Z")
	boolean[] aBooleanArray17;

	@OriginalMember(owner = "client!aqd", name = "hv", descriptor = "[Lclient!lt;")
	Class405[] aClass405Array1;

	@OriginalMember(owner = "client!aqd", name = "hj", descriptor = "[Z")
	boolean[] aBooleanArray16;

	@OriginalMember(owner = "client!aqd", name = "hz", descriptor = "[I")
	int[] anIntArray226;

	@OriginalMember(owner = "client!aqd", name = "ij", descriptor = "Lclient!pq;")
	Class489 aClass489_68;

	@OriginalMember(owner = "client!aqd", name = "ajm", descriptor = "(Lclient!ck;Lclient!dg;)I")
	static int method19529(@OriginalArg(0) Class206 arg0, @OriginalArg(1) Class226 arg1) {
		switch(arg1.anInt3686 * 2069827685) {
			case 0:
				if (arg0 == Class206.aClass206_22) {
					return 116;
				}
				break;
			case 3:
				if (arg0 == Class206.aClass206_22) {
					return 113;
				}
				break;
			case 7:
				switch(arg0.anInt3388 * 811184495) {
					case 0:
						return 77;
					case 1:
						return m.anInt4511 * -633586647;
					case 2:
						return 22;
					case 3:
						return 51;
					case 4:
						return 21;
					case 5:
					default:
						break;
					case 6:
						return 28;
					case 7:
						return 50;
					case 8:
						return m.anInt4512 * -97527085;
				}
		}
		throw new IllegalArgumentException("");
	}

	@OriginalMember(owner = "client!aqd", name = "aht", descriptor = "(Lclient!mn;)I")
	static int method19534(@OriginalArg(0) Class422 arg0) {
		switch(arg0.anInt4933) {
			case 0:
				return 1;
			case 1:
				return 2;
			case 2:
				return 3;
			case 3:
				return 0;
			default:
				throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!aqd", name = "ahi", descriptor = "(Lclient!mv;)I")
	static int method19541(@OriginalArg(0) Class425 arg0) {
		switch(arg0.anInt4935) {
			case 0:
				return 2;
			case 1:
				return 3;
			case 2:
				return 4;
			case 3:
				return 1;
			case 4:
				return 256;
			default:
				return 0;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "aix", descriptor = "(Lclient!ck;Lclient!dg;)I")
	static int method19546(@OriginalArg(0) Class206 arg0, @OriginalArg(1) Class226 arg1) {
		switch(arg1.anInt3686 * 2069827685) {
			case 0:
				if (arg0 == Class206.aClass206_22) {
					return 116;
				}
				break;
			case 3:
				if (arg0 == Class206.aClass206_22) {
					return 113;
				}
				break;
			case 7:
				switch(arg0.anInt3388 * 811184495) {
					case 0:
						return 77;
					case 1:
						return m.anInt4511 * -633586647;
					case 2:
						return 22;
					case 3:
						return 51;
					case 4:
						return 21;
					case 5:
					default:
						break;
					case 6:
						return 28;
					case 7:
						return 50;
					case 8:
						return m.anInt4512 * -97527085;
				}
		}
		throw new IllegalArgumentException("");
	}

	@OriginalMember(owner = "client!aqd", name = "aje", descriptor = "(Lclient!ck;Lclient!dg;)I")
	static int method19547(@OriginalArg(0) Class206 arg0, @OriginalArg(1) Class226 arg1) {
		switch(arg1.anInt3686 * 2069827685) {
			case 0:
				if (arg0 == Class206.aClass206_22) {
					return 116;
				}
				break;
			case 3:
				if (arg0 == Class206.aClass206_22) {
					return 113;
				}
				break;
			case 7:
				switch(arg0.anInt3388 * 811184495) {
					case 0:
						return 77;
					case 1:
						return m.anInt4511 * -633586647;
					case 2:
						return 22;
					case 3:
						return 51;
					case 4:
						return 21;
					case 5:
					default:
						break;
					case 6:
						return 28;
					case 7:
						return 50;
					case 8:
						return m.anInt4512 * -97527085;
				}
		}
		throw new IllegalArgumentException("");
	}

	@OriginalMember(owner = "client!aqd", name = "ajb", descriptor = "(Lclient!mn;)I")
	static int method19549(@OriginalArg(0) Class422 arg0) {
		switch(arg0.anInt4933) {
			case 0:
				return 1;
			case 1:
				return 2;
			case 2:
				return 3;
			case 3:
				return 0;
			default:
				throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!aqd", name = "akf", descriptor = "(IIJILclient!jagdx/D3DDISPLAYMODE;Lclient!jagdx/D3DPRESENT_PARAMETERS;)Z")
	static boolean method19550(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3, @OriginalArg(4) D3DDISPLAYMODE arg4, @OriginalArg(5) D3DPRESENT_PARAMETERS arg5) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		try {
			if (e.method27887(IDirect3D.GetAdapterDisplayMode(arg2, arg0, arg4))) {
				return false;
			}
			label76: while (arg3 >= 0) {
				if (arg3 != 1) {
					local5 = arg3;
					for (@Pc(24) int local24 = 0; local24 < anIntArray229.length; local24++) {
						if (IDirect3D.CheckDeviceType(arg2, arg0, arg1, arg4.anInt4350, anIntArray229[local24], true) == 0 && IDirect3D.CheckDeviceFormat(arg2, arg0, arg1, arg4.anInt4350, 1, 1, anIntArray229[local24]) == 0 && (arg3 == 0 || IDirect3D.CheckDeviceMultiSampleType(arg2, arg0, arg1, anIntArray229[local24], true, local5) == 0)) {
							for (@Pc(65) int local65 = 0; local65 < anIntArray228.length; local65++) {
								if (IDirect3D.CheckDeviceFormat(arg2, arg0, arg1, arg4.anInt4350, 2, 1, anIntArray228[local65]) == 0 && IDirect3D.CheckDepthStencilMatch(arg2, arg0, arg1, arg4.anInt4350, anIntArray229[local24], anIntArray228[local65]) == 0 && (arg3 == 0 || IDirect3D.CheckDeviceMultiSampleType(arg2, arg0, arg1, anIntArray228[local24], true, local5) == 0)) {
									local3 = anIntArray229[local24];
									local1 = anIntArray228[local65];
									break label76;
								}
							}
						}
					}
				}
				arg3--;
			}
			if (arg3 < 0 || local3 == 0 || local1 == 0) {
				return false;
			}
			arg5.anInt4354 = local3;
			arg5.anInt4359 = local1;
			arg5.anInt4356 = local5;
			arg5.anInt4357 = 0;
			return true;
		} catch (@Pc(144) Throwable local144) {
			return false;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "aii", descriptor = "(IIJILclient!jagdx/D3DDISPLAYMODE;Lclient!jagdx/D3DPRESENT_PARAMETERS;)Z")
	static boolean method19551(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3, @OriginalArg(4) D3DDISPLAYMODE arg4, @OriginalArg(5) D3DPRESENT_PARAMETERS arg5) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		try {
			if (e.method27887(IDirect3D.GetAdapterDisplayMode(arg2, arg0, arg4))) {
				return false;
			}
			label76: while (arg3 >= 0) {
				if (arg3 != 1) {
					local5 = arg3;
					for (@Pc(24) int local24 = 0; local24 < anIntArray229.length; local24++) {
						if (IDirect3D.CheckDeviceType(arg2, arg0, arg1, arg4.anInt4350, anIntArray229[local24], true) == 0 && IDirect3D.CheckDeviceFormat(arg2, arg0, arg1, arg4.anInt4350, 1, 1, anIntArray229[local24]) == 0 && (arg3 == 0 || IDirect3D.CheckDeviceMultiSampleType(arg2, arg0, arg1, anIntArray229[local24], true, local5) == 0)) {
							for (@Pc(65) int local65 = 0; local65 < anIntArray228.length; local65++) {
								if (IDirect3D.CheckDeviceFormat(arg2, arg0, arg1, arg4.anInt4350, 2, 1, anIntArray228[local65]) == 0 && IDirect3D.CheckDepthStencilMatch(arg2, arg0, arg1, arg4.anInt4350, anIntArray229[local24], anIntArray228[local65]) == 0 && (arg3 == 0 || IDirect3D.CheckDeviceMultiSampleType(arg2, arg0, arg1, anIntArray228[local24], true, local5) == 0)) {
									local3 = anIntArray229[local24];
									local1 = anIntArray228[local65];
									break label76;
								}
							}
						}
					}
				}
				arg3--;
			}
			if (arg3 < 0 || local3 == 0 || local1 == 0) {
				return false;
			}
			arg5.anInt4354 = local3;
			arg5.anInt4359 = local1;
			arg5.anInt4356 = local5;
			arg5.anInt4357 = 0;
			return true;
		} catch (@Pc(144) Throwable local144) {
			return false;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "ajn", descriptor = "(Lclient!mv;)I")
	static int method19553(@OriginalArg(0) Class425 arg0) {
		switch(arg0.anInt4935) {
			case 0:
				return 2;
			case 1:
				return 3;
			case 2:
				return 4;
			case 3:
				return 1;
			case 4:
				return 256;
			default:
				return 0;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "ais", descriptor = "(Ljava/awt/Canvas;Lclient!df;Lclient!es;Lclient!nx;Lclient!nb;Lclient!np;Lclient!py;Ljava/lang/Integer;)Lclient!dh;")
	static Class104 method19556(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Class225 arg1, @OriginalArg(2) Interface24 arg2, @OriginalArg(3) Interface48 arg3, @OriginalArg(4) Interface46 arg4, @OriginalArg(5) Interface47 arg5, @OriginalArg(6) Class497 arg6, @OriginalArg(7) Integer arg7) {
		@Pc(1) Class104_Sub2_Sub1 local1 = null;
		try {
			@Pc(3) byte local3 = 0;
			@Pc(5) byte local5 = 1;
			@Pc(7) long local7 = IDirect3D.Direct3DCreate();
			@Pc(11) D3DCAPS local11 = new D3DCAPS();
			IDirect3D.GetDeviceCaps(local7, local3, local5, local11);
			if ((local11.anInt4299 & 0x1000000) == 0) {
				throw new RuntimeException("");
			} else if (local11.anInt4322 < 2) {
				throw new RuntimeException("");
			} else if ((local11.anInt4320 & 0x2) == 0) {
				throw new RuntimeException("");
			} else if ((local11.anInt4320 & 0x8) == 0) {
				throw new RuntimeException("");
			} else if ((local11.anInt4320 & 0x40) == 0) {
				throw new RuntimeException("");
			} else if ((local11.anInt4320 & 0x200) == 0) {
				throw new RuntimeException("");
			} else if ((local11.anInt4320 & 0x2000000) == 0) {
				throw new RuntimeException("");
			} else if ((local11.anInt4301 & local11.anInt4302 & 0x10) == 0) {
				throw new RuntimeException("");
			} else if ((local11.anInt4301 & local11.anInt4302 & 0x20) == 0) {
				throw new RuntimeException("");
			} else if ((local11.anInt4301 & local11.anInt4302 & 0x2) == 0) {
				throw new RuntimeException("");
			} else if (local11.anInt4324 > 0 && local11.anInt4324 < 2) {
				throw new RuntimeException("");
			} else if (local11.anInt4330 < 5) {
				throw new RuntimeException("");
			} else {
				@Pc(151) D3DPRESENT_PARAMETERS local151 = new D3DPRESENT_PARAMETERS(arg0);
				local151.aBoolean734 = true;
				local151.aBoolean735 = true;
				local151.anInt4352 = arg0.getWidth();
				local151.anInt4353 = arg0.getHeight();
				local151.anInt4355 = 1;
				local151.anInt4362 = Integer.MIN_VALUE;
				@Pc(175) D3DDISPLAYMODE local175 = new D3DDISPLAYMODE();
				if (!method19551(local3, local5, local7, arg7, local175, local151)) {
					throw new RuntimeException("");
				}
				@Pc(191) int local191 = 0;
				if ((local11.anInt4297 & 0x100000) != 0) {
					local191 |= 0x10;
				}
				@Pc(202) long local202 = 0L;
				try {
					local202 = IDirect3D.CreateDeviceContext(local7, local3, local5, arg0, local191 | 0x40, local151);
				} catch (@Pc(214) u local214) {
					local202 = IDirect3D.CreateDeviceContext(local7, local3, local5, arg0, local191 & 0xFFEFFFFF | 0x20, local151);
				}
				local1 = new Class104_Sub2_Sub1(local3, local5, local7, local202, local175, local151, local11, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
				if (!local1.aHashtable6.containsKey(arg0)) {
					Class451.method29133(arg0, 2109573993);
					local1.method20449(arg0, new Class112_Sub2_Sub1_Sub1(local1, arg0, arg0.getWidth(), arg0.getHeight(), true), (byte) 0);
				}
				local1.method20451(arg0, (byte) 14);
				local1.method20909();
				return local1;
			}
		} catch (@Pc(276) RuntimeException local276) {
			if (local1 != null) {
				local1.method20680();
			}
			throw local276;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "ajq", descriptor = "(Lclient!mn;)I")
	static int method19557(@OriginalArg(0) Class422 arg0) {
		switch(arg0.anInt4933) {
			case 0:
				return 1;
			case 1:
				return 2;
			case 2:
				return 3;
			case 3:
				return 0;
			default:
				throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!aqd", name = "ahs", descriptor = "(Lclient!mk;)I")
	static int method19562(@OriginalArg(0) Class421 arg0) {
		switch(arg0.anInt4932) {
			case 0:
				return 10;
			case 1:
				return 7;
			case 2:
				return 26;
			case 3:
				return 2;
			case 4:
				return 4;
			default:
				throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!aqd", name = "aiq", descriptor = "(Lclient!ms;)I")
	static int method19564(@OriginalArg(0) Class424 arg0) {
		switch(arg0.anInt4934) {
			case 0:
				return 5;
			case 1:
				return 4;
			case 2:
				return 3;
			case 3:
				return 6;
			case 4:
				return 1;
			case 5:
				return 2;
			default:
				throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!aqd", name = "ajg", descriptor = "(Lclient!mk;)I")
	static int method19565(@OriginalArg(0) Class421 arg0) {
		switch(arg0.anInt4932) {
			case 0:
				return 10;
			case 1:
				return 7;
			case 2:
				return 26;
			case 3:
				return 2;
			case 4:
				return 4;
			default:
				throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!aqd", name = "aiy", descriptor = "(Ljava/awt/Canvas;Lclient!df;Lclient!es;Lclient!nx;Lclient!nb;Lclient!np;Lclient!py;Ljava/lang/Integer;)Lclient!dh;")
	static Class104 method19566(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Class225 arg1, @OriginalArg(2) Interface24 arg2, @OriginalArg(3) Interface48 arg3, @OriginalArg(4) Interface46 arg4, @OriginalArg(5) Interface47 arg5, @OriginalArg(6) Class497 arg6, @OriginalArg(7) Integer arg7) {
		@Pc(1) Class104_Sub2_Sub1 local1 = null;
		try {
			@Pc(3) byte local3 = 0;
			@Pc(5) byte local5 = 1;
			@Pc(7) long local7 = IDirect3D.Direct3DCreate();
			@Pc(11) D3DCAPS local11 = new D3DCAPS();
			IDirect3D.GetDeviceCaps(local7, local3, local5, local11);
			if ((local11.anInt4299 & 0x1000000) == 0) {
				throw new RuntimeException("");
			} else if (local11.anInt4322 < 2) {
				throw new RuntimeException("");
			} else if ((local11.anInt4320 & 0x2) == 0) {
				throw new RuntimeException("");
			} else if ((local11.anInt4320 & 0x8) == 0) {
				throw new RuntimeException("");
			} else if ((local11.anInt4320 & 0x40) == 0) {
				throw new RuntimeException("");
			} else if ((local11.anInt4320 & 0x200) == 0) {
				throw new RuntimeException("");
			} else if ((local11.anInt4320 & 0x2000000) == 0) {
				throw new RuntimeException("");
			} else if ((local11.anInt4301 & local11.anInt4302 & 0x10) == 0) {
				throw new RuntimeException("");
			} else if ((local11.anInt4301 & local11.anInt4302 & 0x20) == 0) {
				throw new RuntimeException("");
			} else if ((local11.anInt4301 & local11.anInt4302 & 0x2) == 0) {
				throw new RuntimeException("");
			} else if (local11.anInt4324 > 0 && local11.anInt4324 < 2) {
				throw new RuntimeException("");
			} else if (local11.anInt4330 < 5) {
				throw new RuntimeException("");
			} else {
				@Pc(151) D3DPRESENT_PARAMETERS local151 = new D3DPRESENT_PARAMETERS(arg0);
				local151.aBoolean734 = true;
				local151.aBoolean735 = true;
				local151.anInt4352 = arg0.getWidth();
				local151.anInt4353 = arg0.getHeight();
				local151.anInt4355 = 1;
				local151.anInt4362 = Integer.MIN_VALUE;
				@Pc(175) D3DDISPLAYMODE local175 = new D3DDISPLAYMODE();
				if (!method19551(local3, local5, local7, arg7, local175, local151)) {
					throw new RuntimeException("");
				}
				@Pc(191) int local191 = 0;
				if ((local11.anInt4297 & 0x100000) != 0) {
					local191 |= 0x10;
				}
				@Pc(202) long local202 = 0L;
				try {
					local202 = IDirect3D.CreateDeviceContext(local7, local3, local5, arg0, local191 | 0x40, local151);
				} catch (@Pc(214) u local214) {
					local202 = IDirect3D.CreateDeviceContext(local7, local3, local5, arg0, local191 & 0xFFEFFFFF | 0x20, local151);
				}
				local1 = new Class104_Sub2_Sub1(local3, local5, local7, local202, local175, local151, local11, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
				if (!local1.aHashtable6.containsKey(arg0)) {
					Class451.method29133(arg0, 2006992275);
					local1.method20449(arg0, new Class112_Sub2_Sub1_Sub1(local1, arg0, arg0.getWidth(), arg0.getHeight(), true), (byte) 0);
				}
				local1.method20451(arg0, (byte) 14);
				local1.method20909();
				return local1;
			}
		} catch (@Pc(276) RuntimeException local276) {
			if (local1 != null) {
				local1.method20680();
			}
			throw local276;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "ait", descriptor = "(Lclient!dg;)I")
	static int method19570(@OriginalArg(0) Class226 arg0) {
		if (arg0 == Class226.aClass226_23) {
			return 80;
		} else if (arg0 == Class226.aClass226_26) {
			return 77;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!aqd", name = "ahu", descriptor = "(Ljava/awt/Canvas;Lclient!df;Lclient!es;Lclient!nx;Lclient!nb;Lclient!np;Lclient!py;Ljava/lang/Integer;)Lclient!dh;")
	static Class104 method19578(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Class225 arg1, @OriginalArg(2) Interface24 arg2, @OriginalArg(3) Interface48 arg3, @OriginalArg(4) Interface46 arg4, @OriginalArg(5) Interface47 arg5, @OriginalArg(6) Class497 arg6, @OriginalArg(7) Integer arg7) {
		@Pc(1) Class104_Sub2_Sub1 local1 = null;
		try {
			@Pc(3) byte local3 = 0;
			@Pc(5) byte local5 = 1;
			@Pc(7) long local7 = IDirect3D.Direct3DCreate();
			@Pc(11) D3DCAPS local11 = new D3DCAPS();
			IDirect3D.GetDeviceCaps(local7, local3, local5, local11);
			if ((local11.anInt4299 & 0x1000000) == 0) {
				throw new RuntimeException("");
			} else if (local11.anInt4322 < 2) {
				throw new RuntimeException("");
			} else if ((local11.anInt4320 & 0x2) == 0) {
				throw new RuntimeException("");
			} else if ((local11.anInt4320 & 0x8) == 0) {
				throw new RuntimeException("");
			} else if ((local11.anInt4320 & 0x40) == 0) {
				throw new RuntimeException("");
			} else if ((local11.anInt4320 & 0x200) == 0) {
				throw new RuntimeException("");
			} else if ((local11.anInt4320 & 0x2000000) == 0) {
				throw new RuntimeException("");
			} else if ((local11.anInt4301 & local11.anInt4302 & 0x10) == 0) {
				throw new RuntimeException("");
			} else if ((local11.anInt4301 & local11.anInt4302 & 0x20) == 0) {
				throw new RuntimeException("");
			} else if ((local11.anInt4301 & local11.anInt4302 & 0x2) == 0) {
				throw new RuntimeException("");
			} else if (local11.anInt4324 > 0 && local11.anInt4324 < 2) {
				throw new RuntimeException("");
			} else if (local11.anInt4330 < 5) {
				throw new RuntimeException("");
			} else {
				@Pc(151) D3DPRESENT_PARAMETERS local151 = new D3DPRESENT_PARAMETERS(arg0);
				local151.aBoolean734 = true;
				local151.aBoolean735 = true;
				local151.anInt4352 = arg0.getWidth();
				local151.anInt4353 = arg0.getHeight();
				local151.anInt4355 = 1;
				local151.anInt4362 = Integer.MIN_VALUE;
				@Pc(175) D3DDISPLAYMODE local175 = new D3DDISPLAYMODE();
				if (!method19551(local3, local5, local7, arg7, local175, local151)) {
					throw new RuntimeException("");
				}
				@Pc(191) int local191 = 0;
				if ((local11.anInt4297 & 0x100000) != 0) {
					local191 |= 0x10;
				}
				@Pc(202) long local202 = 0L;
				try {
					local202 = IDirect3D.CreateDeviceContext(local7, local3, local5, arg0, local191 | 0x40, local151);
				} catch (@Pc(214) u local214) {
					local202 = IDirect3D.CreateDeviceContext(local7, local3, local5, arg0, local191 & 0xFFEFFFFF | 0x20, local151);
				}
				local1 = new Class104_Sub2_Sub1(local3, local5, local7, local202, local175, local151, local11, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
				if (!local1.aHashtable6.containsKey(arg0)) {
					Class451.method29133(arg0, 1867991104);
					local1.method20449(arg0, new Class112_Sub2_Sub1_Sub1(local1, arg0, arg0.getWidth(), arg0.getHeight(), true), (byte) 0);
				}
				local1.method20451(arg0, (byte) 14);
				local1.method20909();
				return local1;
			}
		} catch (@Pc(276) RuntimeException local276) {
			if (local1 != null) {
				local1.method20680();
			}
			throw local276;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "ajh", descriptor = "(Lclient!mk;)I")
	static int method19583(@OriginalArg(0) Class421 arg0) {
		switch(arg0.anInt4932) {
			case 0:
				return 10;
			case 1:
				return 7;
			case 2:
				return 26;
			case 3:
				return 2;
			case 4:
				return 4;
			default:
				throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!aqd", name = "ajj", descriptor = "(Lclient!mk;)I")
	static int method19584(@OriginalArg(0) Class421 arg0) {
		switch(arg0.anInt4932) {
			case 0:
				return 10;
			case 1:
				return 7;
			case 2:
				return 26;
			case 3:
				return 2;
			case 4:
				return 4;
			default:
				throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!aqd", name = "ajz", descriptor = "(Lclient!mn;)I")
	static int method19585(@OriginalArg(0) Class422 arg0) {
		switch(arg0.anInt4933) {
			case 0:
				return 1;
			case 1:
				return 2;
			case 2:
				return 3;
			case 3:
				return 0;
			default:
				throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!aqd", name = "aju", descriptor = "(Lclient!mv;)I")
	static int method19588(@OriginalArg(0) Class425 arg0) {
		switch(arg0.anInt4935) {
			case 0:
				return 2;
			case 1:
				return 3;
			case 2:
				return 4;
			case 3:
				return 1;
			case 4:
				return 256;
			default:
				return 0;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "ajd", descriptor = "(Lclient!mv;)I")
	static int method19589(@OriginalArg(0) Class425 arg0) {
		switch(arg0.anInt4935) {
			case 0:
				return 2;
			case 1:
				return 3;
			case 2:
				return 4;
			case 3:
				return 1;
			case 4:
				return 256;
			default:
				return 0;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "ajx", descriptor = "(Lclient!ck;Lclient!dg;)I")
	static int method19593(@OriginalArg(0) Class206 arg0, @OriginalArg(1) Class226 arg1) {
		switch(arg1.anInt3686 * 2069827685) {
			case 0:
				if (arg0 == Class206.aClass206_22) {
					return 116;
				}
				break;
			case 3:
				if (arg0 == Class206.aClass206_22) {
					return 113;
				}
				break;
			case 7:
				switch(arg0.anInt3388 * 811184495) {
					case 0:
						return 77;
					case 1:
						return m.anInt4511 * -633586647;
					case 2:
						return 22;
					case 3:
						return 51;
					case 4:
						return 21;
					case 5:
					default:
						break;
					case 6:
						return 28;
					case 7:
						return 50;
					case 8:
						return m.anInt4512 * -97527085;
				}
		}
		throw new IllegalArgumentException("");
	}

	@OriginalMember(owner = "client!aqd", name = "ajf", descriptor = "(Lclient!ck;Lclient!dg;)I")
	static int method19594(@OriginalArg(0) Class206 arg0, @OriginalArg(1) Class226 arg1) {
		switch(arg1.anInt3686 * 2069827685) {
			case 0:
				if (arg0 == Class206.aClass206_22) {
					return 116;
				}
				break;
			case 3:
				if (arg0 == Class206.aClass206_22) {
					return 113;
				}
				break;
			case 7:
				switch(arg0.anInt3388 * 811184495) {
					case 0:
						return 77;
					case 1:
						return m.anInt4511 * -633586647;
					case 2:
						return 22;
					case 3:
						return 51;
					case 4:
						return 21;
					case 5:
					default:
						break;
					case 6:
						return 28;
					case 7:
						return 50;
					case 8:
						return m.anInt4512 * -97527085;
				}
		}
		throw new IllegalArgumentException("");
	}

	@OriginalMember(owner = "client!aqd", name = "ajl", descriptor = "(Lclient!dg;)I")
	static int method19595(@OriginalArg(0) Class226 arg0) {
		if (arg0 == Class226.aClass226_23) {
			return 80;
		} else if (arg0 == Class226.aClass226_26) {
			return 77;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!aqd", name = "ajr", descriptor = "(Lclient!dg;)I")
	static int method19596(@OriginalArg(0) Class226 arg0) {
		if (arg0 == Class226.aClass226_23) {
			return 80;
		} else if (arg0 == Class226.aClass226_26) {
			return 77;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!aqd", name = "akn", descriptor = "(Lclient!dg;)I")
	static int method19597(@OriginalArg(0) Class226 arg0) {
		if (arg0 == Class226.aClass226_23) {
			return 80;
		} else if (arg0 == Class226.aClass226_26) {
			return 77;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!aqd", name = "ako", descriptor = "(Lclient!dg;)I")
	static int method19598(@OriginalArg(0) Class226 arg0) {
		if (arg0 == Class226.aClass226_23) {
			return 80;
		} else if (arg0 == Class226.aClass226_26) {
			return 77;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!aqd", name = "akz", descriptor = "(Lclient!ms;)I")
	static int method19599(@OriginalArg(0) Class424 arg0) {
		switch(arg0.anInt4934) {
			case 0:
				return 5;
			case 1:
				return 4;
			case 2:
				return 3;
			case 3:
				return 6;
			case 4:
				return 1;
			case 5:
				return 2;
			default:
				throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!aqd", name = "<init>", descriptor = "(IIJJLclient!jagdx/D3DDISPLAYMODE;Lclient!jagdx/D3DPRESENT_PARAMETERS;Lclient!jagdx/D3DCAPS;Lclient!df;Lclient!es;Lclient!nx;Lclient!nb;Lclient!np;Lclient!py;I)V")
	Class104_Sub2_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2, @OriginalArg(3) long arg3, @OriginalArg(4) D3DDISPLAYMODE arg4, @OriginalArg(5) D3DPRESENT_PARAMETERS arg5, @OriginalArg(6) D3DCAPS arg6, @OriginalArg(7) Class225 arg7, @OriginalArg(8) Interface24 arg8, @OriginalArg(9) Interface48 arg9, @OriginalArg(10) Interface46 arg10, @OriginalArg(11) Interface47 arg11, @OriginalArg(12) Class497 arg12, @OriginalArg(13) int arg13) {
		super(arg7, arg8, arg9, arg10, arg11, arg12, arg13, 0);
		try {
			this.anInt2731 = arg0;
			this.anInt2730 = arg1;
			this.aLong117 = arg2;
			this.aLong121 = arg3;
			this.aD3DDISPLAYMODE1 = arg4;
			this.aD3DPRESENT_PARAMETERS2 = arg5;
			this.aD3DCAPS1 = arg6;
			this.aLong118 = D3DLIGHT.Create();
			this.aLong122 = D3DLIGHT.Create();
			this.aLong119 = D3DLIGHT.Create();
			this.anInt2954 = this.aD3DCAPS1.anInt4322;
			this.anInt2920 = this.aD3DCAPS1.anInt4324 > 0 ? this.aD3DCAPS1.anInt4324 : 8;
			this.aBoolean436 = (this.aD3DCAPS1.anInt4305 & 0x2) == 0;
			this.aBoolean484 = (this.aD3DCAPS1.anInt4305 & 0x800) != 0;
			this.aBoolean472 = (this.aD3DCAPS1.anInt4305 & 0x2000) != 0;
			this.aBoolean433 = (this.aD3DCAPS1.anInt4305 & 0x8000) != 0;
			this.aBoolean434 = (this.aD3DCAPS1.anInt4305 & 0x10000) != 0;
			this.aBoolean437 = (this.aD3DCAPS1.anInt4305 & 0x4000) != 0;
			this.aBoolean476 = this.aD3DCAPS1.anInt4340 > 0;
			this.aBoolean470 = this.aBoolean476;
			this.aBoolean474 = this.aD3DCAPS1.anInt4340 > 0;
			this.aBoolean480 = this.anInt2951 > 0 || IDirect3D.CheckDeviceMultiSampleType(this.aLong117, this.anInt2731, this.anInt2730, this.aD3DPRESENT_PARAMETERS2.anInt4354, true, 2) == 0;
			this.aBoolean486 = this.aD3DCAPS1.anInt4340 > 0 && this.anInt2951 > 0 || IDirect3D.CheckDeviceMultiSampleType(this.aLong117, this.anInt2731, this.anInt2730, 113, true, 2) == 0;
			this.aBoolean438 = IDirect3D.CheckDeviceFormat(this.aLong117, this.anInt2731, this.anInt2730, this.aD3DPRESENT_PARAMETERS2.anInt4354, 0, 1, method21022('A', 'T', 'O', 'C')) == 0;
			this.aBoolean439 = IDirect3D.CheckDeviceFormat(this.aLong117, this.anInt2731, this.anInt2730, this.aD3DPRESENT_PARAMETERS2.anInt4354, 0, 1, method21022('A', '2', 'M', '1')) == 0;
			this.aBoolean435 = IDirect3D.CheckDeviceFormat(this.aLong117, this.anInt2731, this.anInt2730, this.aD3DPRESENT_PARAMETERS2.anInt4354, 0, 1, method21022('S', 'S', 'A', 'A')) == 0;
			this.aBoolean461 = (this.aD3DCAPS1.anInt4298 & 0x20000) != 0;
			this.aBoolean431 = IDirect3D.CheckDeviceFormat(this.aLong117, this.anInt2731, this.anInt2730, this.aD3DDISPLAYMODE1.anInt4350, 524288, 3, 113) == 0;
			this.aBoolean440 = IDirect3D.CheckDeviceFormat(this.aLong117, this.anInt2731, this.anInt2730, this.aD3DDISPLAYMODE1.anInt4350, 524288, 3, 116) == 0;
			this.aBooleanArray14 = new boolean[this.anInt2954];
			this.aBooleanArray15 = new boolean[this.anInt2954];
			this.aBooleanArray17 = new boolean[this.anInt2954];
			this.aClass405Array1 = new Class405[this.anInt2954];
			this.aBooleanArray16 = new boolean[this.anInt2954];
			this.anIntArray226 = new int[this.anInt2954];
			@Pc(401) Class470 local401 = new Class470();
			local401.method29601(1.0F, -1.0F, 0.5F);
			local401.method29568(0.0F, 0.0F, 0.5F);
			this.aClass489_68 = new Class489();
			this.aClass489_68.method30023(local401);
			IDirect3DDevice.BeginScene(this.aLong121);
		} catch (@Pc(426) Throwable local426) {
			local426.printStackTrace();
			this.method20889(-1706209453);
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!aqd", name = "aja", descriptor = "(Lclient!aiy;)V")
	void method19528(@OriginalArg(0) Class135_Sub3 arg0) {
		this.method19536(arg0);
		if (this.aBooleanArray14[this.anInt2949] != arg0.aBoolean254) {
			IDirect3DDevice.SetSamplerState(this.aLong121, this.anInt2949, 1, arg0.aBoolean254 ? 1 : 3);
			this.aBooleanArray14[this.anInt2949] = arg0.aBoolean254;
		}
		if (this.aBooleanArray15[this.anInt2949] != arg0.aBoolean255) {
			IDirect3DDevice.SetSamplerState(this.aLong121, this.anInt2949, 2, arg0.aBoolean255 ? 1 : 3);
			this.aBooleanArray15[this.anInt2949] = arg0.aBoolean255;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "ry", descriptor = "()Z")
	@Override
	public boolean method20898() {
		return (this.aD3DCAPS1.anInt4334 & 0xFFFF) >= 257;
	}

	@OriginalMember(owner = "client!aqd", name = "rg", descriptor = "(Z)Z")
	@Override
	public boolean method20899(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			return this.aBoolean431;
		} else {
			return this.aBoolean431 && this.aBoolean440;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "tk", descriptor = "()V")
	@Override
	void method21248() {
		if (this.aBoolean463) {
			D3DLIGHT.SetDirection(this.aLong118, -this.aFloatArray63[0], -this.aFloatArray63[1], -this.aFloatArray63[2]);
			D3DLIGHT.SetDirection(this.aLong122, -this.aFloatArray61[0], -this.aFloatArray61[1], -this.aFloatArray61[2]);
			this.aBoolean442 = false;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "sm", descriptor = "()V")
	@Override
	void method21045() {
		for (@Pc(5) Class93_Sub15 local5 = (Class93_Sub15) this.aClass22_33.method445((byte) 38); local5 != null; local5 = (Class93_Sub15) this.aClass22_33.method415(765421908)) {
			@Pc(11) Interface53 local11 = (Interface53) local5.anObject5;
			local11.method10400();
			if (local11 == this.aClass112_6) {
				local11.method23751();
			}
		}
		super.method21045();
	}

	@OriginalMember(owner = "client!aqd", name = "aeq", descriptor = "()V")
	@Override
	void method21247() {
		if (this.aBoolean463) {
			@Pc(17) int local17 = this.aBooleanArray17[this.anInt2949] ? method19562(this.aClass421Array6[this.anInt2949]) : 1;
			IDirect3DDevice.SetTextureStageState(this.aLong121, this.anInt2949, 4, local17);
		}
	}

	@OriginalMember(owner = "client!aqd", name = "fk", descriptor = "(Z)V")
	@Override
	public void method20599(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!aqd", name = "f", descriptor = "()Lclient!cz;")
	@Override
	public Class219 method20583() {
		@Pc(3) D3DADAPTER_IDENTIFIER local3 = new D3DADAPTER_IDENTIFIER();
		IDirect3D.GetAdapterIdentifier(this.aLong117, this.anInt2731, 0, local3);
		return new Class219(local3.anInt4268, this.method21220() ? "Direct3D FF" : "Direct3D", 9, local3.aString192, local3.aLong262, this.method21220());
	}

	@OriginalMember(owner = "client!aqd", name = "l", descriptor = "(II)V")
	@Override
	void method20427(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub4 {
		if (this.aBoolean432) {
			if (!this.method19554(this.aClass112_Sub2_6.method23748(), this.aClass112_Sub2_6.method23749())) {
				return;
			}
			((Class112_Sub2_Sub1_Sub1) this.aClass112_Sub2_6).method10400();
		} else {
			IDirect3DDevice.EndScene(this.aLong121);
		}
		@Pc(25) int local25 = this.aClass112_Sub2_6.method23767();
		if (e.method27887(local25)) {
			this.aBoolean432 = true;
			this.aClass112_Sub2_6.method23750();
		} else {
			IDirect3DDevice.BeginScene(this.aLong121);
			if (this.anInterface24_6 != null) {
				this.anInterface24_6.method6778((byte) -124);
			}
		}
	}

	@OriginalMember(owner = "client!aqd", name = "u", descriptor = "()V")
	@Override
	public void method20428() {
		@Pc(3) long local3 = IDirect3DDevice.CreateEventQuery(this.aLong121);
		if (e.method27888(IDirect3DEventQuery.Issue(local3))) {
			while (true) {
				@Pc(10) int local10 = IDirect3DEventQuery.IsSignaled(local3);
				if (local10 != 1) {
					break;
				}
				Thread.yield();
			}
		}
		IUnknown.Release(local3);
	}

	@OriginalMember(owner = "client!aqd", name = "p", descriptor = "()V")
	@Override
	void method20680() {
		super.method20680();
		if (this.aLong118 != 0L) {
			D3DLIGHT.Destroy(this.aLong118);
			this.aLong118 = 0L;
		}
		if (this.aLong122 != 0L) {
			D3DLIGHT.Destroy(this.aLong122);
			this.aLong122 = 0L;
		}
		if (this.aLong119 != 0L) {
			D3DLIGHT.Destroy(this.aLong119);
			this.aLong119 = 0L;
		}
		if (this.aLong121 != 0L) {
			IDirect3DDevice.Destroy(this.aLong121);
			this.aLong121 = 0L;
		}
		if (this.aLong117 != 0L) {
			IUnknown.Release(this.aLong117);
			this.aLong117 = 0L;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "ax", descriptor = "()V")
	@Override
	public void method20461() {
	}

	@OriginalMember(owner = "client!aqd", name = "sr", descriptor = "()F")
	@Override
	public float method20894() {
		return -0.5F;
	}

	@OriginalMember(owner = "client!aqd", name = "am", descriptor = "()Lclient!afq;")
	@Override
	public Class112_Sub1 method20456() {
		return new Class112_Sub1_Sub3_Sub2(this);
	}

	@OriginalMember(owner = "client!aqd", name = "aea", descriptor = "()V")
	@Override
	void method21251() {
	}

	@OriginalMember(owner = "client!aqd", name = "au", descriptor = "(IILclient!ck;Lclient!dg;I)Lclient!dp;")
	@Override
	public Interface18 method20457(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class206 arg2, @OriginalArg(3) Class226 arg3, @OriginalArg(4) int arg4) {
		return new Class459(this, arg2, arg3, arg0, arg1, arg4);
	}

	@OriginalMember(owner = "client!aqd", name = "ar", descriptor = "(II)Lclient!dw;")
	@Override
	public Interface19 method20432(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class473(this, Class226.aClass226_26, arg0, arg1, 0);
	}

	@OriginalMember(owner = "client!aqd", name = "ap", descriptor = "(III)Lclient!dw;")
	@Override
	public Interface19 method20667(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return new Class473(this, Class226.aClass226_26, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!aqd", name = "finalize", descriptor = "()V")
	@Override
	protected void finalize() {
		super.finalize();
	}

	@OriginalMember(owner = "client!aqd", name = "ahx", descriptor = "(Lclient!oz;)V")
	void method19530(@OriginalArg(0) Interface53 arg0) {
		if (this.method19540(arg0) == null) {
			this.aClass22_33.method407(new Class93_Sub15(arg0), -2142055074);
		}
	}

	@OriginalMember(owner = "client!aqd", name = "wn", descriptor = "(ILclient!lr;)V")
	@Override
	public void method21060(@OriginalArg(0) int arg0, @OriginalArg(1) Interface37 arg1) {
		@Pc(2) Class465 local2 = (Class465) arg1;
		IDirect3DDevice.SetStreamSource(this.aLong121, arg0, local2.aLong282, 0, local2.method29497());
	}

	@OriginalMember(owner = "client!aqd", name = "aq", descriptor = "(IIII)[I")
	@Override
	public int[] method20460(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method20513();
		@Pc(3) int[] local3 = null;
		@Pc(8) long local8 = IDirect3DDevice.GetRenderTarget(this.aLong121, 0);
		@Pc(18) long local18 = IDirect3DDevice.CreateRenderTarget(this.aLong121, arg2, arg3, 21, 0, 0, true);
		@Pc(33) int local33 = IDirect3DDevice.StretchRect(this.aLong121, local8, arg0, arg1, arg2, arg3, local18, 0, 0, arg2, arg3, 1);
		this.method20901(arg2 * arg3 * 4);
		if (e.method27888(local33)) {
			local3 = new int[arg2 * arg3];
			IDirect3DSurface.Download(local18, 0, 0, arg2, arg3, arg2 * 4, 16, this.aLong132);
			this.aByteBuffer7.clear();
			this.aByteBuffer7.asIntBuffer().get(local3);
		}
		IUnknown.Release(local8);
		IUnknown.Release(local18);
		return local3;
	}

	@OriginalMember(owner = "client!aqd", name = "gb", descriptor = "()V")
	@Override
	public void method20626() {
		for (@Pc(1) int local1 = 0; local1 < 3; local1++) {
			if (this.aLongArray13[local1] != 0L) {
				IUnknown.Release(this.aLongArray13[local1]);
				this.aLongArray13[local1] = 0L;
			}
		}
		this.anInt2736 = 0;
		this.anInt2735 = 0;
	}

	@OriginalMember(owner = "client!aqd", name = "er", descriptor = "()V")
	@Override
	void method20770() {
		super.method20680();
		if (this.aLong118 != 0L) {
			D3DLIGHT.Destroy(this.aLong118);
			this.aLong118 = 0L;
		}
		if (this.aLong122 != 0L) {
			D3DLIGHT.Destroy(this.aLong122);
			this.aLong122 = 0L;
		}
		if (this.aLong119 != 0L) {
			D3DLIGHT.Destroy(this.aLong119);
			this.aLong119 = 0L;
		}
		if (this.aLong121 != 0L) {
			IDirect3DDevice.Destroy(this.aLong121);
			this.aLong121 = 0L;
		}
		if (this.aLong117 != 0L) {
			IUnknown.Release(this.aLong117);
			this.aLong117 = 0L;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "lw", descriptor = "(Lclient!dz;Lclient!dz;FLclient!dz;)Lclient!dz;")
	@Override
	public Class107 method20448(@OriginalArg(0) Class107 arg0, @OriginalArg(1) Class107 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class107 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!aqd", name = "ao", descriptor = "()Z")
	@Override
	public boolean method20507() {
		if (this.aBoolean432) {
			return false;
		} else {
			return this.aLongArray13[this.anInt2736] == 0L;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "aj", descriptor = "()Z")
	@Override
	public boolean method20464() {
		return true;
	}

	@OriginalMember(owner = "client!aqd", name = "adz", descriptor = "(IIZ[III)Lclient!lz;")
	@Override
	Interface38 method21221(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return new Class135_Sub3(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!aqd", name = "aa", descriptor = "(III)V")
	@Override
	public void method20474(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aLong123 == 0L) {
			this.method19559(arg1, arg2);
		}
		@Pc(13) long local13 = IDirect3DDevice.GetRenderTarget(this.aLong121, 0);
		if (e.method27887(IDirect3DDevice.StretchRect(this.aLong121, local13, 0, 0, this.aClass112_6.method23748(), this.aClass112_6.method23749(), this.aLong123, this.anInt2899 * 1081362515, this.anInt2903 * -779214253, this.anInt2904 * 406942099, this.anInt2898 * -88050601, 2))) {
		}
		IUnknown.Release(local13);
		IDirect3DDevice.GetRenderTargetData(this.aLong121, this.aLong123, this.aLongArray15[this.anInt2736]);
		@Pc(63) long local63 = IDirect3DDevice.CreateEventQuery(this.aLong121);
		if (e.method27888(IDirect3DEventQuery.Issue(local63))) {
			this.aLongArray13[this.anInt2736] = local63;
		}
		this.anIntArray227[this.anInt2736] = arg0;
		if (++this.anInt2736 >= 3) {
			this.anInt2736 = 0;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "ay", descriptor = "()Z")
	@Override
	public boolean method20615() {
		return false;
	}

	@OriginalMember(owner = "client!aqd", name = "az", descriptor = "()V")
	@Override
	public void method20467() {
		for (@Pc(1) int local1 = 0; local1 < 3; local1++) {
			if (this.aLongArray13[local1] != 0L) {
				IUnknown.Release(this.aLongArray13[local1]);
				this.aLongArray13[local1] = 0L;
			}
		}
		this.anInt2736 = 0;
		this.anInt2735 = 0;
	}

	@OriginalMember(owner = "client!aqd", name = "af", descriptor = "(II)J")
	@Override
	public long method20469(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method19531(arg0, arg1, null, null);
	}

	@OriginalMember(owner = "client!aqd", name = "an", descriptor = "(II[I[I)V")
	@Override
	public void method20471(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.method19531(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!aqd", name = "ahg", descriptor = "(II[I[I)J")
	long method19531(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		if (this.aLongArray13[this.anInt2735] != 0L) {
			IUnknown.Release(this.aLongArray13[this.anInt2735]);
			this.aLongArray13[this.anInt2735] = 0L;
		}
		this.aByteBuffer7.clear();
		IDirect3DSurface.Download(this.aLongArray15[this.anInt2735], 0, 0, arg0, arg1, arg0 * 4, 0, this.aLong132);
		if (++this.anInt2735 >= 3) {
			this.anInt2735 = 0;
		}
		if (arg2 == null) {
			return this.aLong132;
		} else {
			this.aByteBuffer7.asIntBuffer().get(arg2);
			return 0L;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "aee", descriptor = "()V")
	@Override
	void method21253() {
	}

	@OriginalMember(owner = "client!aqd", name = "bl", descriptor = "()V")
	@Override
	public void method20437() {
		if (this.aLong123 != 0L) {
			IUnknown.Release(this.aLong123);
			this.aLong123 = 0L;
		}
		for (@Pc(13) int local13 = 0; local13 < 3; local13++) {
			if (this.aLongArray13[local13] != 0L) {
				IUnknown.Release(this.aLongArray13[local13]);
				this.aLongArray13[local13] = 0L;
			}
			if (this.aLongArray15[local13] != 0L) {
				IUnknown.Release(this.aLongArray15[local13]);
				this.aLongArray15[local13] = 0L;
			}
		}
		this.anInt2736 = 0;
		this.anInt2735 = 0;
	}

	@OriginalMember(owner = "client!aqd", name = "aft", descriptor = "()V")
	@Override
	void method21277() {
		if (this.aBoolean463) {
			IDirect3DDevice.method27882(this.aLong121, 28, this.aBoolean479 && this.aBoolean478 && this.anInt2947 >= 0);
		}
	}

	@OriginalMember(owner = "client!aqd", name = "aij", descriptor = "(Lclient!oz;)V")
	void method19532(@OriginalArg(0) Interface53 arg0) {
		@Pc(3) Class93_Sub15 local3 = this.method19540(arg0);
		if (local3 != null) {
			local3.method23981(-1430524711);
		}
	}

	@OriginalMember(owner = "client!aqd", name = "sa", descriptor = "()V")
	@Override
	void method20937() {
		if (this.aClass112_6 != null) {
			IDirect3DDevice.SetViewport(this.aLong121, this.anInt2929 + this.anInt2925, this.anInt2939 + this.anInt2926, this.anInt2927, this.anInt2928, this.aFloat204, this.aFloat205);
		}
	}

	@OriginalMember(owner = "client!aqd", name = "agz", descriptor = "(Lclient!ms;II)V")
	@Override
	public void method21294(@OriginalArg(0) Class424 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass116_Sub2_2 != null) {
			this.aClass116_Sub2_2.method8497();
		}
		IDirect3DDevice.DrawPrimitive(this.aLong121, method19564(arg0), arg1, arg2);
	}

	@OriginalMember(owner = "client!aqd", name = "sj", descriptor = "()V")
	@Override
	void method20939() {
		IDirect3DDevice.method27882(this.aLong121, 174, this.aBoolean482);
	}

	@OriginalMember(owner = "client!aqd", name = "vv", descriptor = "()V")
	@Override
	void method20991() {
	}

	@OriginalMember(owner = "client!aqd", name = "ahd", descriptor = "(J)V")
	void method19533(@OriginalArg(0) long arg0) {
		IDirect3DDevice.SetPixelShader(this.aLong121, arg0);
	}

	@OriginalMember(owner = "client!aqd", name = "ti", descriptor = "(Lclient!pq;)V")
	@Override
	public void method20946(@OriginalArg(0) Class489 arg0) {
		arg0.method30134(this.aClass489_68);
	}

	@OriginalMember(owner = "client!aqd", name = "xz", descriptor = "(Ljava/lang/String;)Lclient!ho;")
	@Override
	public Class115 method21084(@OriginalArg(0) String arg0) {
		@Pc(3) byte[] local3 = this.method19544(arg0);
		if (local3 == null) {
			return null;
		} else {
			@Pc(11) Class314 local11 = this.method20911(local3);
			return new Class115_Sub1(this, local11);
		}
	}

	@OriginalMember(owner = "client!aqd", name = "ab", descriptor = "()I")
	@Override
	public int method20813() {
		if (this.aLongArray13[this.anInt2735] == 0L) {
			return -1;
		} else if (e.method27888(IDirect3DEventQuery.IsSignaled(this.aLongArray13[this.anInt2735]))) {
			return this.anIntArray227[this.anInt2735];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "tg", descriptor = "()V")
	@Override
	void method21174() {
		if (this.aBoolean463) {
			IDirect3DDevice.method27882(this.aLong121, 137, this.aBoolean467 && !this.aBoolean469);
		}
	}

	@OriginalMember(owner = "client!aqd", name = "tq", descriptor = "()V")
	@Override
	void method20930() {
		if (this.aBoolean463) {
			D3DLIGHT.SetAmbient(this.aLong118, this.aFloat214 * this.aFloat211, this.aFloat210 * this.aFloat211, this.aFloat217 * this.aFloat211, 0.0F);
			this.aBoolean442 = false;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "tx", descriptor = "()V")
	@Override
	void method20961() {
		if (!this.aBoolean463) {
			return;
		}
		@Pc(10) float local10 = this.aBoolean468 ? this.aFloat212 : 0.0F;
		@Pc(19) float local19 = this.aBoolean468 ? -this.aFloat213 : 0.0F;
		D3DLIGHT.SetDiffuse(this.aLong118, local10 * this.aFloat214, local10 * this.aFloat210, local10 * this.aFloat217, 0.0F);
		D3DLIGHT.SetDiffuse(this.aLong122, local19 * this.aFloat214, local19 * this.aFloat210, local19 * this.aFloat217, 0.0F);
		this.aBoolean442 = false;
	}

	@OriginalMember(owner = "client!aqd", name = "age", descriptor = "(ILclient!lr;)V")
	@Override
	public void method21286(@OriginalArg(0) int arg0, @OriginalArg(1) Interface37 arg1) {
		@Pc(2) Class465 local2 = (Class465) arg1;
		IDirect3DDevice.SetStreamSource(this.aLong121, arg0, local2.aLong282, 0, local2.method29497());
	}

	@OriginalMember(owner = "client!aqd", name = "wz", descriptor = "(Lclient!ms;II)V")
	@Override
	public void method21017(@OriginalArg(0) Class424 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass116_Sub2_2 != null) {
			this.aClass116_Sub2_2.method8497();
		}
		IDirect3DDevice.DrawPrimitive(this.aLong121, method19564(arg0), arg1, arg2);
	}

	@OriginalMember(owner = "client!aqd", name = "tl", descriptor = "()V")
	@Override
	void method20963() {
		if (!this.aBoolean463 || this.aBoolean442) {
			return;
		}
		IDirect3DDevice.LightEnable(this.aLong121, 0, false);
		IDirect3DDevice.LightEnable(this.aLong121, 1, false);
		IDirect3DDevice.SetLight(this.aLong121, 0, this.aLong118);
		IDirect3DDevice.SetLight(this.aLong121, 1, this.aLong122);
		IDirect3DDevice.LightEnable(this.aLong121, 0, true);
		IDirect3DDevice.LightEnable(this.aLong121, 1, true);
		this.aBoolean442 = true;
	}

	@OriginalMember(owner = "client!aqd", name = "um", descriptor = "()V")
	@Override
	void method20965() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt2934; local1++) {
			@Pc(10) Class93_Sub16 local10 = this.aClass93_Sub16Array19[local1];
			@Pc(14) int local14 = local1 + 2;
			@Pc(18) int local18 = local10.method13539((byte) -93);
			@Pc(24) float local24 = local10.method13525(755980849) / 255.0F;
			D3DLIGHT.SetPosition(this.aLong119, (float) local10.method13520(140369838), (float) local10.method13521(1655674161), (float) local10.method13522(906587672));
			D3DLIGHT.SetDiffuse(this.aLong119, (float) (local18 >> 16 & 0xFF) * local24, (float) (local18 >> 8 & 0xFF) * local24, (float) (local18 & 0xFF) * local24, 0.0F);
			D3DLIGHT.SetAttenuation(this.aLong119, 0.0F, 0.0F, 1.0F / (float) (local10.method13523((byte) -30) * local10.method13523((byte) -58)));
			D3DLIGHT.SetRange(this.aLong119, (float) local10.method13523((byte) -28));
			IDirect3DDevice.SetLight(this.aLong121, local14, this.aLong119);
			IDirect3DDevice.LightEnable(this.aLong121, local14, true);
		}
		while (local1 < this.anInt2933) {
			IDirect3DDevice.LightEnable(this.aLong121, local1 + 2, false);
			local1++;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "uq", descriptor = "(Lclient!ck;Lclient!dg;)Z")
	@Override
	boolean method20966(@OriginalArg(0) Class206 arg0, @OriginalArg(1) Class226 arg1) {
		@Pc(3) D3DDISPLAYMODE local3 = new D3DDISPLAYMODE();
		return e.method27888(IDirect3D.GetAdapterDisplayMode(this.aLong117, this.anInt2731, local3)) && e.method27888(IDirect3D.CheckDeviceFormat(this.aLong117, this.anInt2731, this.anInt2730, local3.anInt4350, 0, 3, method19546(arg0, arg1)));
	}

	@OriginalMember(owner = "client!aqd", name = "we", descriptor = "(Lclient!ms;IIII)V")
	@Override
	public void method21019(@OriginalArg(0) Class424 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.aClass116_Sub2_2 != null) {
			this.aClass116_Sub2_2.method8497();
		}
		IDirect3DDevice.DrawIndexedPrimitive(this.aLong121, method19564(arg0), 0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!aqd", name = "ww", descriptor = "()Z")
	@Override
	public boolean method21076() {
		return (this.aD3DCAPS1.anInt4334 & 0xFFFF) >= 257;
	}

	@OriginalMember(owner = "client!aqd", name = "zz", descriptor = "()V")
	@Override
	void method20935() {
		IDirect3DDevice.SetScissorRect(this.aLong121, this.anInt2929 + this.anInt2921, this.anInt2939 + this.anInt2940, this.anInt2958, this.anInt2930);
	}

	@OriginalMember(owner = "client!aqd", name = "td", descriptor = "()V")
	@Override
	void method20964() {
		this.method20961();
		this.method20963();
	}

	@OriginalMember(owner = "client!aqd", name = "ub", descriptor = "(Lclient!ck;IIZ[FII)Lclient!lz;")
	@Override
	Interface38 method20972(@OriginalArg(0) Class206 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		return new Class135_Sub3(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!aqd", name = "uy", descriptor = "(Lclient!ck;Lclient!dg;II)Lclient!mo;")
	@Override
	Interface42 method21029(@OriginalArg(0) Class206 arg0, @OriginalArg(1) Class226 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return new Class135_Sub3_Sub1(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!aqd", name = "ut", descriptor = "(IZ[[I)Lclient!mr;")
	@Override
	Interface44 method20974(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[][] arg2) {
		return new Class135_Sub2(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!aqd", name = "ahb", descriptor = "(Lclient!oz;)V")
	void method19535(@OriginalArg(0) Interface53 arg0) {
		@Pc(3) Class93_Sub15 local3 = this.method19540(arg0);
		if (local3 != null) {
			local3.method23981(774300748);
		}
	}

	@OriginalMember(owner = "client!aqd", name = "ahn", descriptor = "(Lclient!op;)V")
	void method19536(@OriginalArg(0) Class135 arg0) {
		IDirect3DDevice.SetTexture(this.aLong121, this.anInt2949, arg0.method11329());
		if (this.aBoolean463 && !this.aBooleanArray17[this.anInt2949]) {
			this.aBooleanArray17[this.anInt2949] = true;
			this.method20992();
			this.method21197();
		}
	}

	@OriginalMember(owner = "client!aqd", name = "ahp", descriptor = "(Lclient!aiy;)V")
	void method19537(@OriginalArg(0) Class135_Sub3 arg0) {
		this.method19536(arg0);
		if (this.aBooleanArray14[this.anInt2949] != arg0.aBoolean254) {
			IDirect3DDevice.SetSamplerState(this.aLong121, this.anInt2949, 1, arg0.aBoolean254 ? 1 : 3);
			this.aBooleanArray14[this.anInt2949] = arg0.aBoolean254;
		}
		if (this.aBooleanArray15[this.anInt2949] != arg0.aBoolean255) {
			IDirect3DDevice.SetSamplerState(this.aLong121, this.anInt2949, 2, arg0.aBoolean255 ? 1 : 3);
			this.aBooleanArray15[this.anInt2949] = arg0.aBoolean255;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "ahe", descriptor = "(Lclient!ahy;)V")
	void method19538(@OriginalArg(0) Class135_Sub1 arg0) {
		this.method19536(arg0);
		if (!this.aBooleanArray14[this.anInt2949]) {
			IDirect3DDevice.SetSamplerState(this.aLong121, this.anInt2949, 1, 1);
			this.aBooleanArray14[this.anInt2949] = true;
		}
		if (!this.aBooleanArray15[this.anInt2949]) {
			IDirect3DDevice.SetSamplerState(this.aLong121, this.anInt2949, 2, 1);
			this.aBooleanArray15[this.anInt2949] = true;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "ud", descriptor = "()V")
	@Override
	public void method21031() {
		if (this.aBooleanArray17[this.anInt2949]) {
			this.aBooleanArray17[this.anInt2949] = false;
			IDirect3DDevice.SetTexture(this.aLong121, this.anInt2949, 0L);
			this.method20992();
			this.method21197();
		}
	}

	@OriginalMember(owner = "client!aqd", name = "sx", descriptor = "()V")
	@Override
	void method20913() {
		this.method20437();
		for (@Pc(7) Class93_Sub15 local7 = (Class93_Sub15) this.aClass22_33.method445((byte) 6); local7 != null; local7 = (Class93_Sub15) this.aClass22_33.method415(54907800)) {
			@Pc(13) Interface53 local13 = (Interface53) local7.anObject5;
			local13.method23750();
		}
		super.method20913();
	}

	@OriginalMember(owner = "client!aqd", name = "aep", descriptor = "()V")
	@Override
	void method20987() {
		if (this.aBoolean463) {
			@Pc(17) int local17 = this.aBooleanArray17[this.anInt2949] ? method19562(this.aClass421Array5[this.anInt2949]) : 1;
			IDirect3DDevice.SetTextureStageState(this.aLong121, this.anInt2949, 1, local17);
		}
	}

	@OriginalMember(owner = "client!aqd", name = "vw", descriptor = "()V")
	@Override
	void method21197() {
		if (this.aBoolean463) {
			@Pc(17) int local17 = this.aBooleanArray17[this.anInt2949] ? method19562(this.aClass421Array5[this.anInt2949]) : 1;
			IDirect3DDevice.SetTextureStageState(this.aLong121, this.anInt2949, 1, local17);
		}
	}

	@OriginalMember(owner = "client!aqd", name = "vt", descriptor = "()V")
	@Override
	void method20992() {
		if (this.aBoolean463) {
			@Pc(17) int local17 = this.aBooleanArray17[this.anInt2949] ? method19562(this.aClass421Array6[this.anInt2949]) : 1;
			IDirect3DDevice.SetTextureStageState(this.aLong121, this.anInt2949, 4, local17);
		}
	}

	@OriginalMember(owner = "client!aqd", name = "ur", descriptor = "(ILclient!mn;ZZ)V")
	@Override
	void method20971(@OriginalArg(0) int arg0, @OriginalArg(1) Class422 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		if (!this.aBoolean463) {
			return;
		}
		@Pc(4) int local4 = 0;
		@Pc(8) byte local8;
		switch(arg0) {
			case 1:
				local8 = 3;
				break;
			case 2:
				local8 = 26;
				break;
			default:
				local8 = 2;
		}
		if (arg2) {
			local4 |= 0x20;
		}
		if (arg3) {
			local4 |= 0x10;
		}
		IDirect3DDevice.SetTextureStageState(this.aLong121, this.anInt2949, local8, method19534(arg1) | local4);
	}

	@OriginalMember(owner = "client!aqd", name = "uo", descriptor = "(ILclient!mn;Z)V")
	@Override
	void method20983(@OriginalArg(0) int arg0, @OriginalArg(1) Class422 arg1, @OriginalArg(2) boolean arg2) {
		if (!this.aBoolean463) {
			return;
		}
		@Pc(4) int local4 = 0;
		@Pc(8) byte local8;
		switch(arg0) {
			case 1:
				local8 = 6;
				break;
			case 2:
				local8 = 27;
				break;
			default:
				local8 = 5;
		}
		if (arg2) {
			local4 |= 0x10;
		}
		IDirect3DDevice.SetTextureStageState(this.aLong121, this.anInt2949, local8, method19534(arg1) | local4);
	}

	@OriginalMember(owner = "client!aqd", name = "ajp", descriptor = "(Lclient!ahy;)V")
	void method19539(@OriginalArg(0) Class135_Sub1 arg0) {
		this.method19536(arg0);
		if (!this.aBooleanArray14[this.anInt2949]) {
			IDirect3DDevice.SetSamplerState(this.aLong121, this.anInt2949, 1, 1);
			this.aBooleanArray14[this.anInt2949] = true;
		}
		if (!this.aBooleanArray15[this.anInt2949]) {
			IDirect3DDevice.SetSamplerState(this.aLong121, this.anInt2949, 2, 1);
			this.aBooleanArray15[this.anInt2949] = true;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "aha", descriptor = "(Lclient!oz;)Lclient!ake;")
	Class93_Sub15 method19540(@OriginalArg(0) Interface53 arg0) {
		for (@Pc(5) Class93_Sub15 local5 = (Class93_Sub15) this.aClass22_33.method445((byte) 70); local5 != null; local5 = (Class93_Sub15) this.aClass22_33.method415(671949601)) {
			if (local5.anObject5 == arg0) {
				return local5;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!aqd", name = "hd", descriptor = "(J)V")
	@Override
	public void method20634(@OriginalArg(0) long arg0) {
	}

	@OriginalMember(owner = "client!aqd", name = "sb", descriptor = "()V")
	@Override
	void method20895() {
		IDirect3DDevice.SetScissorRect(this.aLong121, this.anInt2929 + this.anInt2921, this.anInt2939 + this.anInt2940, this.anInt2958, this.anInt2930);
	}

	@OriginalMember(owner = "client!aqd", name = "ve", descriptor = "()V")
	@Override
	void method20998() {
		IDirect3DDevice.method27882(this.aLong121, 15, this.aBoolean462);
		IDirect3DDevice.SetRenderState(this.aLong121, 24, this.aByte76 & 0xFF);
		if (this.aD3DPRESENT_PARAMETERS2.anInt4356 <= 0) {
			return;
		}
		if (this.aBoolean462 && this.aByte76 != 0) {
			if (this.aBoolean435) {
				IDirect3DDevice.SetRenderState(this.aLong121, 181, method21022('S', 'S', 'A', 'A'));
			} else if (this.aBoolean438) {
				IDirect3DDevice.SetRenderState(this.aLong121, 181, method21022('A', 'T', 'O', 'C'));
			} else if (this.aBoolean439) {
				IDirect3DDevice.SetRenderState(this.aLong121, 154, method21022('A', '2', 'M', '1'));
			}
		} else if (this.aBoolean435 || this.aBoolean438) {
			IDirect3DDevice.SetRenderState(this.aLong121, 181, 0);
		} else if (this.aBoolean439) {
			IDirect3DDevice.method27881(this.aLong121, 154, 1.0F);
		}
	}

	@OriginalMember(owner = "client!aqd", name = "vm", descriptor = "()V")
	@Override
	void method20999() {
		switch(this.aClass415_3.anInt4922) {
			case 0:
				IDirect3DDevice.SetRenderState(this.aLong121, 19, 2);
				IDirect3DDevice.SetRenderState(this.aLong121, 20, 1);
				break;
			case 1:
				IDirect3DDevice.SetRenderState(this.aLong121, 19, 9);
				IDirect3DDevice.SetRenderState(this.aLong121, 20, 2);
				break;
			case 2:
				IDirect3DDevice.SetRenderState(this.aLong121, 19, 5);
				IDirect3DDevice.SetRenderState(this.aLong121, 20, 6);
				break;
			case 3:
				IDirect3DDevice.SetRenderState(this.aLong121, 19, 2);
				IDirect3DDevice.SetRenderState(this.aLong121, 20, 2);
		}
		switch(this.anInt2948) {
			case 0:
				IDirect3DDevice.SetRenderState(this.aLong121, 207, 1);
				IDirect3DDevice.SetRenderState(this.aLong121, 208, 1);
				break;
			case 1:
				IDirect3DDevice.SetRenderState(this.aLong121, 207, 2);
				IDirect3DDevice.SetRenderState(this.aLong121, 208, 1);
				break;
			case 2:
				IDirect3DDevice.SetRenderState(this.aLong121, 207, 2);
				IDirect3DDevice.SetRenderState(this.aLong121, 208, 2);
				break;
			case 3:
				IDirect3DDevice.SetRenderState(this.aLong121, 207, 1);
				IDirect3DDevice.SetRenderState(this.aLong121, 208, 2);
		}
	}

	@OriginalMember(owner = "client!aqd", name = "vg", descriptor = "()V")
	@Override
	void method21116() {
		IDirect3DDevice.method27882(this.aLong121, 27, this.aBoolean481);
	}

	@OriginalMember(owner = "client!aqd", name = "ahy", descriptor = "()V")
	void method19542() {
		IDirect3DDevice.SetRenderState(this.aLong121, 22, this.anInt2950);
	}

	@OriginalMember(owner = "client!aqd", name = "vz", descriptor = "()V")
	@Override
	void method20918() {
		if (this.aBoolean463) {
			IDirect3DDevice.method27882(this.aLong121, 28, this.aBoolean479 && this.aBoolean478 && this.anInt2947 >= 0);
		}
	}

	@OriginalMember(owner = "client!aqd", name = "vh", descriptor = "()V")
	@Override
	void method21063() {
		this.aFloat209 = this.aFloat208 - (float) this.anInt2956;
		this.aFloat216 = this.aFloat209 - (float) this.anInt2947;
		if (this.aFloat216 < this.aFloat215) {
			this.aFloat216 = this.aFloat215;
		}
		if (this.aBoolean463) {
			IDirect3DDevice.method27881(this.aLong121, 36, this.aFloat216);
			IDirect3DDevice.method27881(this.aLong121, 37, this.aFloat209);
			IDirect3DDevice.SetRenderState(this.aLong121, 34, this.anInt2957);
		}
	}

	@OriginalMember(owner = "client!aqd", name = "vj", descriptor = "(Z)V")
	@Override
	void method21235(@OriginalArg(0) boolean arg0) {
		IDirect3DDevice.method27882(this.aLong121, 161, arg0);
	}

	@OriginalMember(owner = "client!aqd", name = "ach", descriptor = "()V")
	@Override
	void method21196() {
		this.method20961();
		this.method20963();
	}

	@OriginalMember(owner = "client!aqd", name = "vn", descriptor = "(Z)Lclient!lr;")
	@Override
	Interface37 method21025(@OriginalArg(0) boolean arg0) {
		return new Class465(this, arg0);
	}

	@OriginalMember(owner = "client!aqd", name = "aiv", descriptor = "(Lclient!aiy;)V")
	void method19543(@OriginalArg(0) Class135_Sub3 arg0) {
		this.method19536(arg0);
		if (this.aBooleanArray14[this.anInt2949] != arg0.aBoolean254) {
			IDirect3DDevice.SetSamplerState(this.aLong121, this.anInt2949, 1, arg0.aBoolean254 ? 1 : 3);
			this.aBooleanArray14[this.anInt2949] = arg0.aBoolean254;
		}
		if (this.aBooleanArray15[this.anInt2949] != arg0.aBoolean255) {
			IDirect3DDevice.SetSamplerState(this.aLong121, this.anInt2949, 2, arg0.aBoolean255 ? 1 : 3);
			this.aBooleanArray15[this.anInt2949] = arg0.aBoolean255;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "vk", descriptor = "(Lclient!lo;)V")
	@Override
	public void method21118(@OriginalArg(0) Class145 arg0) {
		@Pc(2) Class145_Sub2 local2 = (Class145_Sub2) arg0;
		IDirect3DDevice.SetVertexDeclaration(this.aLong121, local2.aLong48);
	}

	@OriginalMember(owner = "client!aqd", name = "xs", descriptor = "(Lclient!pq;Lclient!pq;Lclient!pq;)V")
	@Override
	public void method21062(@OriginalArg(0) Class489 arg0, @OriginalArg(1) Class489 arg1, @OriginalArg(2) Class489 arg2) {
		IDirect3DDevice.SetTransform(this.aLong121, 256, arg0.aFloatArray116);
		IDirect3DDevice.SetTransform(this.aLong121, 2, arg1.aFloatArray116);
		IDirect3DDevice.SetTransform(this.aLong121, 3, arg2.aFloatArray116);
	}

	@OriginalMember(owner = "client!aqd", name = "wa", descriptor = "(Lclient!ml;)V")
	@Override
	void method21042(@OriginalArg(0) Interface40 arg0) {
		IDirect3DDevice.SetIndices(this.aLong121, ((Class469) arg0).aLong283);
	}

	@OriginalMember(owner = "client!aqd", name = "aen", descriptor = "(ILclient!mn;ZZ)V")
	@Override
	void method21239(@OriginalArg(0) int arg0, @OriginalArg(1) Class422 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		if (!this.aBoolean463) {
			return;
		}
		@Pc(4) int local4 = 0;
		@Pc(8) byte local8;
		switch(arg0) {
			case 1:
				local8 = 3;
				break;
			case 2:
				local8 = 26;
				break;
			default:
				local8 = 2;
		}
		if (arg2) {
			local4 |= 0x20;
		}
		if (arg3) {
			local4 |= 0x10;
		}
		IDirect3DDevice.SetTextureStageState(this.aLong121, this.anInt2949, local8, method19534(arg1) | local4);
	}

	@OriginalMember(owner = "client!aqd", name = "gv", descriptor = "()Z")
	@Override
	public boolean method20444() {
		return false;
	}

	@OriginalMember(owner = "client!aqd", name = "bm", descriptor = "(II)V")
	@Override
	public void method20786(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		IDirect3DDevice.Clear(this.aLong121, arg0, arg1, 1.0F, 0);
	}

	@OriginalMember(owner = "client!aqd", name = "air", descriptor = "(Ljava/lang/String;)[B")
	byte[] method19544(@OriginalArg(0) String arg0) {
		return this.method20905("dx", arg0);
	}

	@OriginalMember(owner = "client!aqd", name = "ajo", descriptor = "(Ljava/lang/String;)[B")
	byte[] method19545(@OriginalArg(0) String arg0) {
		return this.method20905("dx", arg0);
	}

	@OriginalMember(owner = "client!aqd", name = "ew", descriptor = "()V")
	@Override
	void method20571() {
		super.method20680();
		if (this.aLong118 != 0L) {
			D3DLIGHT.Destroy(this.aLong118);
			this.aLong118 = 0L;
		}
		if (this.aLong122 != 0L) {
			D3DLIGHT.Destroy(this.aLong122);
			this.aLong122 = 0L;
		}
		if (this.aLong119 != 0L) {
			D3DLIGHT.Destroy(this.aLong119);
			this.aLong119 = 0L;
		}
		if (this.aLong121 != 0L) {
			IDirect3DDevice.Destroy(this.aLong121);
			this.aLong121 = 0L;
		}
		if (this.aLong117 != 0L) {
			IUnknown.Release(this.aLong117);
			this.aLong117 = 0L;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "g", descriptor = "()Ljava/lang/String;")
	@Override
	public String method20443() {
		@Pc(1) String local1 = "Caps: 4:";
		@Pc(3) String local3 = ":";
		@Pc(15) String local15 = local1 + this.anInt2951 + local3;
		@Pc(27) String local27 = local15 + this.anInt2954 + local3;
		@Pc(39) String local39 = local27 + this.anInt2920 + local3;
		@Pc(55) String local55 = local39 + (this.aBoolean480 ? 1 : 0) + local3;
		@Pc(71) String local71 = local55 + (this.method20897() ? 1 : 0) + local3;
		@Pc(87) String local87 = local71 + (this.method20898() ? 1 : 0) + local3;
		@Pc(103) String local103 = local87 + (this.aBoolean472 ? 1 : 0) + local3;
		@Pc(119) String local119 = local103 + (this.aBoolean484 ? 1 : 0) + local3;
		@Pc(135) String local135 = local119 + (this.aBoolean436 ? 1 : 0) + local3;
		@Pc(151) String local151 = local135 + (this.aBoolean433 ? 1 : 0) + local3;
		@Pc(167) String local167 = local151 + (this.aBoolean434 ? 1 : 0) + local3;
		@Pc(183) String local183 = local167 + (this.aBoolean437 ? 1 : 0) + local3;
		@Pc(199) String local199 = local183 + (this.aBoolean476 ? 1 : 0) + local3;
		@Pc(215) String local215 = local199 + (this.aBoolean474 ? 1 : 0) + local3;
		@Pc(231) String local231 = local215 + (this.aBoolean486 ? 1 : 0) + local3;
		@Pc(247) String local247 = local231 + (this.aBoolean438 ? 1 : 0) + local3;
		@Pc(263) String local263 = local247 + (this.aBoolean439 ? 1 : 0) + local3;
		@Pc(279) String local279 = local263 + (this.aBoolean435 ? 1 : 0) + local3;
		@Pc(295) String local295 = local279 + (this.aBoolean461 ? 1 : 0) + local3;
		@Pc(311) String local311 = local295 + (this.aBoolean431 ? 1 : 0) + local3;
		return local311 + (this.aBoolean440 ? 1 : 0);
	}

	@OriginalMember(owner = "client!aqd", name = "hr", descriptor = "()V")
	@Override
	public void method20638() {
		if (this.aLong123 != 0L) {
			IUnknown.Release(this.aLong123);
			this.aLong123 = 0L;
		}
		for (@Pc(13) int local13 = 0; local13 < 3; local13++) {
			if (this.aLongArray13[local13] != 0L) {
				IUnknown.Release(this.aLongArray13[local13]);
				this.aLongArray13[local13] = 0L;
			}
			if (this.aLongArray15[local13] != 0L) {
				IUnknown.Release(this.aLongArray15[local13]);
				this.aLongArray15[local13] = 0L;
			}
		}
		this.anInt2736 = 0;
		this.anInt2735 = 0;
	}

	@OriginalMember(owner = "client!aqd", name = "eh", descriptor = "(Z)V")
	@Override
	public void method20564(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!aqd", name = "aig", descriptor = "(II)Z")
	boolean method19548(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = IDirect3DDevice.TestCooperativeLevel(this.aLong121);
		if (local3 == 0 || local3 == -2005530519) {
			IDirect3DDevice.SetDepthStencilSurface(this.aLong121, 0L);
			@Pc(15) int local15;
			for (local15 = 1; local15 < 4; local15++) {
				IDirect3DDevice.SetRenderTarget(this.aLong121, local15, 0L);
			}
			for (local15 = 0; local15 < 4; local15++) {
				IDirect3DDevice.SetStreamSource(this.aLong121, local15, 0L, 0, 0);
			}
			for (local15 = 0; local15 < 4; local15++) {
				IDirect3DDevice.SetTexture(this.aLong121, local15, 0L);
			}
			IDirect3DDevice.SetIndices(this.aLong121, 0L);
			this.method20913();
			this.aD3DPRESENT_PARAMETERS2.anInt4352 = arg0;
			this.aD3DPRESENT_PARAMETERS2.anInt4353 = arg1;
			this.aD3DPRESENT_PARAMETERS2.anInt4355 = 1;
			if (method19551(this.anInt2731, this.anInt2730, this.aLong117, this.anInt2951, this.aD3DDISPLAYMODE1, this.aD3DPRESENT_PARAMETERS2)) {
				local15 = IDirect3DDevice.Reset(this.aLong121, this.aD3DPRESENT_PARAMETERS2);
				if (e.method27888(local15)) {
					this.aBoolean432 = false;
					this.method21045();
					this.method21173();
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!aqd", name = "wp", descriptor = "(I)V")
	@Override
	void method21021(@OriginalArg(0) int arg0) {
		if (!this.aBoolean441) {
			@Pc(10) int local10 = (arg0 & 0x2) == 0 ? 3 : 2;
			IDirect3DDevice.SetRenderState(this.aLong121, 8, local10);
		}
	}

	@OriginalMember(owner = "client!aqd", name = "gk", descriptor = "()V")
	@Override
	public void method20702() {
	}

	@OriginalMember(owner = "client!aqd", name = "eg", descriptor = "(II)V")
	@Override
	void method20794(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub4 {
		if (this.aBoolean432) {
			if (!this.method19554(this.aClass112_Sub2_6.method23748(), this.aClass112_Sub2_6.method23749())) {
				return;
			}
			((Class112_Sub2_Sub1_Sub1) this.aClass112_Sub2_6).method10400();
		} else {
			IDirect3DDevice.EndScene(this.aLong121);
		}
		@Pc(25) int local25 = this.aClass112_Sub2_6.method23767();
		if (e.method27887(local25)) {
			this.aBoolean432 = true;
			this.aClass112_Sub2_6.method23750();
		} else {
			IDirect3DDevice.BeginScene(this.aLong121);
			if (this.anInterface24_6 != null) {
				this.anInterface24_6.method6778((byte) -44);
			}
		}
	}

	@OriginalMember(owner = "client!aqd", name = "ez", descriptor = "(II)V")
	@Override
	void method20597(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub4 {
		if (this.aBoolean432) {
			if (!this.method19554(this.aClass112_Sub2_6.method23748(), this.aClass112_Sub2_6.method23749())) {
				return;
			}
			((Class112_Sub2_Sub1_Sub1) this.aClass112_Sub2_6).method10400();
		} else {
			IDirect3DDevice.EndScene(this.aLong121);
		}
		@Pc(25) int local25 = this.aClass112_Sub2_6.method23767();
		if (e.method27887(local25)) {
			this.aBoolean432 = true;
			this.aClass112_Sub2_6.method23750();
		} else {
			IDirect3DDevice.BeginScene(this.aLong121);
			if (this.anInterface24_6 != null) {
				this.anInterface24_6.method6778((byte) -40);
			}
		}
	}

	@OriginalMember(owner = "client!aqd", name = "ef", descriptor = "()V")
	@Override
	public void method20568() {
		@Pc(3) long local3 = IDirect3DDevice.CreateEventQuery(this.aLong121);
		if (e.method27888(IDirect3DEventQuery.Issue(local3))) {
			while (true) {
				@Pc(10) int local10 = IDirect3DEventQuery.IsSignaled(local3);
				if (local10 != 1) {
					break;
				}
				Thread.yield();
			}
		}
		IUnknown.Release(local3);
	}

	@OriginalMember(owner = "client!aqd", name = "vy", descriptor = "(I)V")
	@Override
	void method20997(@OriginalArg(0) int arg0) {
		IDirect3DDevice.SetRenderState(this.aLong121, 168, arg0);
	}

	@OriginalMember(owner = "client!aqd", name = "afu", descriptor = "()V")
	@Override
	void method21276() {
		this.aFloat209 = this.aFloat208 - (float) this.anInt2956;
		this.aFloat216 = this.aFloat209 - (float) this.anInt2947;
		if (this.aFloat216 < this.aFloat215) {
			this.aFloat216 = this.aFloat215;
		}
		if (this.aBoolean463) {
			IDirect3DDevice.method27881(this.aLong121, 36, this.aFloat216);
			IDirect3DDevice.method27881(this.aLong121, 37, this.aFloat209);
			IDirect3DDevice.SetRenderState(this.aLong121, 34, this.anInt2957);
		}
	}

	@OriginalMember(owner = "client!aqd", name = "ade", descriptor = "(Lclient!ck;Lclient!dg;II)Lclient!mo;")
	@Override
	Interface42 method21226(@OriginalArg(0) Class206 arg0, @OriginalArg(1) Class226 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return new Class135_Sub3_Sub1(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!aqd", name = "afr", descriptor = "()V")
	@Override
	void method21267() {
		switch(this.aClass415_3.anInt4922) {
			case 0:
				IDirect3DDevice.SetRenderState(this.aLong121, 19, 2);
				IDirect3DDevice.SetRenderState(this.aLong121, 20, 1);
				break;
			case 1:
				IDirect3DDevice.SetRenderState(this.aLong121, 19, 9);
				IDirect3DDevice.SetRenderState(this.aLong121, 20, 2);
				break;
			case 2:
				IDirect3DDevice.SetRenderState(this.aLong121, 19, 5);
				IDirect3DDevice.SetRenderState(this.aLong121, 20, 6);
				break;
			case 3:
				IDirect3DDevice.SetRenderState(this.aLong121, 19, 2);
				IDirect3DDevice.SetRenderState(this.aLong121, 20, 2);
		}
		switch(this.anInt2948) {
			case 0:
				IDirect3DDevice.SetRenderState(this.aLong121, 207, 1);
				IDirect3DDevice.SetRenderState(this.aLong121, 208, 1);
				break;
			case 1:
				IDirect3DDevice.SetRenderState(this.aLong121, 207, 2);
				IDirect3DDevice.SetRenderState(this.aLong121, 208, 1);
				break;
			case 2:
				IDirect3DDevice.SetRenderState(this.aLong121, 207, 2);
				IDirect3DDevice.SetRenderState(this.aLong121, 208, 2);
				break;
			case 3:
				IDirect3DDevice.SetRenderState(this.aLong121, 207, 1);
				IDirect3DDevice.SetRenderState(this.aLong121, 208, 2);
		}
	}

	@OriginalMember(owner = "client!aqd", name = "en", descriptor = "(I)V")
	@Override
	public synchronized void method20573(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2733; local1++) {
			IUnknown.Release(this.aLongArray14[local1]);
		}
		this.anInt2733 = 0;
		super.method20431(arg0);
	}

	@OriginalMember(owner = "client!aqd", name = "fl", descriptor = "()Ljava/lang/String;")
	@Override
	public String method20594() {
		@Pc(1) String local1 = "Caps: 4:";
		@Pc(3) String local3 = ":";
		@Pc(15) String local15 = local1 + this.anInt2951 + local3;
		@Pc(27) String local27 = local15 + this.anInt2954 + local3;
		@Pc(39) String local39 = local27 + this.anInt2920 + local3;
		@Pc(55) String local55 = local39 + (this.aBoolean480 ? 1 : 0) + local3;
		@Pc(71) String local71 = local55 + (this.method20897() ? 1 : 0) + local3;
		@Pc(87) String local87 = local71 + (this.method20898() ? 1 : 0) + local3;
		@Pc(103) String local103 = local87 + (this.aBoolean472 ? 1 : 0) + local3;
		@Pc(119) String local119 = local103 + (this.aBoolean484 ? 1 : 0) + local3;
		@Pc(135) String local135 = local119 + (this.aBoolean436 ? 1 : 0) + local3;
		@Pc(151) String local151 = local135 + (this.aBoolean433 ? 1 : 0) + local3;
		@Pc(167) String local167 = local151 + (this.aBoolean434 ? 1 : 0) + local3;
		@Pc(183) String local183 = local167 + (this.aBoolean437 ? 1 : 0) + local3;
		@Pc(199) String local199 = local183 + (this.aBoolean476 ? 1 : 0) + local3;
		@Pc(215) String local215 = local199 + (this.aBoolean474 ? 1 : 0) + local3;
		@Pc(231) String local231 = local215 + (this.aBoolean486 ? 1 : 0) + local3;
		@Pc(247) String local247 = local231 + (this.aBoolean438 ? 1 : 0) + local3;
		@Pc(263) String local263 = local247 + (this.aBoolean439 ? 1 : 0) + local3;
		@Pc(279) String local279 = local263 + (this.aBoolean435 ? 1 : 0) + local3;
		@Pc(295) String local295 = local279 + (this.aBoolean461 ? 1 : 0) + local3;
		@Pc(311) String local311 = local295 + (this.aBoolean431 ? 1 : 0) + local3;
		return local311 + (this.aBoolean440 ? 1 : 0);
	}

	@OriginalMember(owner = "client!aqd", name = "fb", descriptor = "()Ljava/lang/String;")
	@Override
	public String method20877() {
		@Pc(1) String local1 = "Caps: 4:";
		@Pc(3) String local3 = ":";
		@Pc(15) String local15 = local1 + this.anInt2951 + local3;
		@Pc(27) String local27 = local15 + this.anInt2954 + local3;
		@Pc(39) String local39 = local27 + this.anInt2920 + local3;
		@Pc(55) String local55 = local39 + (this.aBoolean480 ? 1 : 0) + local3;
		@Pc(71) String local71 = local55 + (this.method20897() ? 1 : 0) + local3;
		@Pc(87) String local87 = local71 + (this.method20898() ? 1 : 0) + local3;
		@Pc(103) String local103 = local87 + (this.aBoolean472 ? 1 : 0) + local3;
		@Pc(119) String local119 = local103 + (this.aBoolean484 ? 1 : 0) + local3;
		@Pc(135) String local135 = local119 + (this.aBoolean436 ? 1 : 0) + local3;
		@Pc(151) String local151 = local135 + (this.aBoolean433 ? 1 : 0) + local3;
		@Pc(167) String local167 = local151 + (this.aBoolean434 ? 1 : 0) + local3;
		@Pc(183) String local183 = local167 + (this.aBoolean437 ? 1 : 0) + local3;
		@Pc(199) String local199 = local183 + (this.aBoolean476 ? 1 : 0) + local3;
		@Pc(215) String local215 = local199 + (this.aBoolean474 ? 1 : 0) + local3;
		@Pc(231) String local231 = local215 + (this.aBoolean486 ? 1 : 0) + local3;
		@Pc(247) String local247 = local231 + (this.aBoolean438 ? 1 : 0) + local3;
		@Pc(263) String local263 = local247 + (this.aBoolean439 ? 1 : 0) + local3;
		@Pc(279) String local279 = local263 + (this.aBoolean435 ? 1 : 0) + local3;
		@Pc(295) String local295 = local279 + (this.aBoolean461 ? 1 : 0) + local3;
		@Pc(311) String local311 = local295 + (this.aBoolean431 ? 1 : 0) + local3;
		return local311 + (this.aBoolean440 ? 1 : 0);
	}

	@OriginalMember(owner = "client!aqd", name = "fo", descriptor = "()Ljava/lang/String;")
	@Override
	public String method20596() {
		@Pc(1) String local1 = "Caps: 4:";
		@Pc(3) String local3 = ":";
		@Pc(15) String local15 = local1 + this.anInt2951 + local3;
		@Pc(27) String local27 = local15 + this.anInt2954 + local3;
		@Pc(39) String local39 = local27 + this.anInt2920 + local3;
		@Pc(55) String local55 = local39 + (this.aBoolean480 ? 1 : 0) + local3;
		@Pc(71) String local71 = local55 + (this.method20897() ? 1 : 0) + local3;
		@Pc(87) String local87 = local71 + (this.method20898() ? 1 : 0) + local3;
		@Pc(103) String local103 = local87 + (this.aBoolean472 ? 1 : 0) + local3;
		@Pc(119) String local119 = local103 + (this.aBoolean484 ? 1 : 0) + local3;
		@Pc(135) String local135 = local119 + (this.aBoolean436 ? 1 : 0) + local3;
		@Pc(151) String local151 = local135 + (this.aBoolean433 ? 1 : 0) + local3;
		@Pc(167) String local167 = local151 + (this.aBoolean434 ? 1 : 0) + local3;
		@Pc(183) String local183 = local167 + (this.aBoolean437 ? 1 : 0) + local3;
		@Pc(199) String local199 = local183 + (this.aBoolean476 ? 1 : 0) + local3;
		@Pc(215) String local215 = local199 + (this.aBoolean474 ? 1 : 0) + local3;
		@Pc(231) String local231 = local215 + (this.aBoolean486 ? 1 : 0) + local3;
		@Pc(247) String local247 = local231 + (this.aBoolean438 ? 1 : 0) + local3;
		@Pc(263) String local263 = local247 + (this.aBoolean439 ? 1 : 0) + local3;
		@Pc(279) String local279 = local263 + (this.aBoolean435 ? 1 : 0) + local3;
		@Pc(295) String local295 = local279 + (this.aBoolean461 ? 1 : 0) + local3;
		@Pc(311) String local311 = local295 + (this.aBoolean431 ? 1 : 0) + local3;
		return local311 + (this.aBoolean440 ? 1 : 0);
	}

	@OriginalMember(owner = "client!aqd", name = "fy", descriptor = "()Ljava/lang/String;")
	@Override
	public String method20781() {
		@Pc(1) String local1 = "Caps: 4:";
		@Pc(3) String local3 = ":";
		@Pc(15) String local15 = local1 + this.anInt2951 + local3;
		@Pc(27) String local27 = local15 + this.anInt2954 + local3;
		@Pc(39) String local39 = local27 + this.anInt2920 + local3;
		@Pc(55) String local55 = local39 + (this.aBoolean480 ? 1 : 0) + local3;
		@Pc(71) String local71 = local55 + (this.method20897() ? 1 : 0) + local3;
		@Pc(87) String local87 = local71 + (this.method20898() ? 1 : 0) + local3;
		@Pc(103) String local103 = local87 + (this.aBoolean472 ? 1 : 0) + local3;
		@Pc(119) String local119 = local103 + (this.aBoolean484 ? 1 : 0) + local3;
		@Pc(135) String local135 = local119 + (this.aBoolean436 ? 1 : 0) + local3;
		@Pc(151) String local151 = local135 + (this.aBoolean433 ? 1 : 0) + local3;
		@Pc(167) String local167 = local151 + (this.aBoolean434 ? 1 : 0) + local3;
		@Pc(183) String local183 = local167 + (this.aBoolean437 ? 1 : 0) + local3;
		@Pc(199) String local199 = local183 + (this.aBoolean476 ? 1 : 0) + local3;
		@Pc(215) String local215 = local199 + (this.aBoolean474 ? 1 : 0) + local3;
		@Pc(231) String local231 = local215 + (this.aBoolean486 ? 1 : 0) + local3;
		@Pc(247) String local247 = local231 + (this.aBoolean438 ? 1 : 0) + local3;
		@Pc(263) String local263 = local247 + (this.aBoolean439 ? 1 : 0) + local3;
		@Pc(279) String local279 = local263 + (this.aBoolean435 ? 1 : 0) + local3;
		@Pc(295) String local295 = local279 + (this.aBoolean461 ? 1 : 0) + local3;
		@Pc(311) String local311 = local295 + (this.aBoolean431 ? 1 : 0) + local3;
		return local311 + (this.aBoolean440 ? 1 : 0);
	}

	@OriginalMember(owner = "client!aqd", name = "afh", descriptor = "()V")
	@Override
	void method21048() {
		IDirect3DDevice.method27882(this.aLong121, 27, this.aBoolean481);
	}

	@OriginalMember(owner = "client!aqd", name = "fh", descriptor = "(Z)V")
	@Override
	public void method20600(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!aqd", name = "fr", descriptor = "(Z)V")
	@Override
	public void method20601(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!aqd", name = "gu", descriptor = "(Z)V")
	@Override
	public void method20602(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!aqd", name = "gq", descriptor = "(Ljava/awt/Canvas;II)Lclient!afy;")
	@Override
	Class112_Sub2 method20603(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return new Class112_Sub2_Sub1_Sub1(this, arg0, arg1, arg2, false);
	}

	@OriginalMember(owner = "client!aqd", name = "gl", descriptor = "(IIII)[I")
	@Override
	public int[] method20604(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method20513();
		@Pc(3) int[] local3 = null;
		@Pc(8) long local8 = IDirect3DDevice.GetRenderTarget(this.aLong121, 0);
		@Pc(18) long local18 = IDirect3DDevice.CreateRenderTarget(this.aLong121, arg2, arg3, 21, 0, 0, true);
		@Pc(33) int local33 = IDirect3DDevice.StretchRect(this.aLong121, local8, arg0, arg1, arg2, arg3, local18, 0, 0, arg2, arg3, 1);
		this.method20901(arg2 * arg3 * 4);
		if (e.method27888(local33)) {
			local3 = new int[arg2 * arg3];
			IDirect3DSurface.Download(local18, 0, 0, arg2, arg3, arg2 * 4, 16, this.aLong132);
			this.aByteBuffer7.clear();
			this.aByteBuffer7.asIntBuffer().get(local3);
		}
		IUnknown.Release(local8);
		IUnknown.Release(local18);
		return local3;
	}

	@OriginalMember(owner = "client!aqd", name = "gp", descriptor = "()V")
	@Override
	public void method20593() {
	}

	@OriginalMember(owner = "client!aqd", name = "gy", descriptor = "()V")
	@Override
	public void method20608() {
	}

	@OriginalMember(owner = "client!aqd", name = "gc", descriptor = "()Z")
	@Override
	public boolean method20799() {
		return true;
	}

	@OriginalMember(owner = "client!aqd", name = "gf", descriptor = "()Z")
	@Override
	public boolean method20761() {
		return true;
	}

	@OriginalMember(owner = "client!aqd", name = "ng", descriptor = "()Lclient!afq;")
	@Override
	public Class112_Sub1 method20796() {
		return new Class112_Sub1_Sub3_Sub2(this);
	}

	@OriginalMember(owner = "client!aqd", name = "abg", descriptor = "()V")
	@Override
	void method21177() {
		IDirect3DDevice.method27882(this.aLong121, 7, this.aBoolean466 && this.aBoolean459);
	}

	@OriginalMember(owner = "client!aqd", name = "gg", descriptor = "()Z")
	@Override
	public boolean method20546() {
		if (this.aBoolean432) {
			return false;
		} else {
			return this.aLongArray13[this.anInt2736] == 0L;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "gr", descriptor = "()Z")
	@Override
	public boolean method20616() {
		if (this.aBoolean432) {
			return false;
		} else {
			return this.aLongArray13[this.anInt2736] == 0L;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "gs", descriptor = "()Z")
	@Override
	public boolean method20887() {
		return true;
	}

	@OriginalMember(owner = "client!aqd", name = "gt", descriptor = "()Z")
	@Override
	public boolean method20618() {
		return true;
	}

	@OriginalMember(owner = "client!aqd", name = "gh", descriptor = "()Z")
	@Override
	public boolean method20619() {
		return true;
	}

	@OriginalMember(owner = "client!aqd", name = "gm", descriptor = "()Z")
	@Override
	public boolean method20620() {
		return false;
	}

	@OriginalMember(owner = "client!aqd", name = "hk", descriptor = "(II)J")
	@Override
	public long method20495(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method19531(arg0, arg1, null, null);
	}

	@OriginalMember(owner = "client!aqd", name = "rc", descriptor = "(Ljava/lang/String;)Lclient!ho;")
	@Override
	public Class115 method20904(@OriginalArg(0) String arg0) {
		@Pc(3) byte[] local3 = this.method19544(arg0);
		if (local3 == null) {
			return null;
		} else {
			@Pc(11) Class314 local11 = this.method20911(local3);
			return new Class115_Sub1(this, local11);
		}
	}

	@OriginalMember(owner = "client!aqd", name = "ha", descriptor = "(II)J")
	@Override
	public long method20812(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method19531(arg0, arg1, null, null);
	}

	@OriginalMember(owner = "client!aqd", name = "gd", descriptor = "(III)V")
	@Override
	public void method20624(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aLong123 == 0L) {
			this.method19559(arg1, arg2);
		}
		@Pc(13) long local13 = IDirect3DDevice.GetRenderTarget(this.aLong121, 0);
		if (e.method27887(IDirect3DDevice.StretchRect(this.aLong121, local13, 0, 0, this.aClass112_6.method23748(), this.aClass112_6.method23749(), this.aLong123, this.anInt2899 * 1081362515, this.anInt2903 * -779214253, this.anInt2904 * 406942099, this.anInt2898 * -88050601, 2))) {
		}
		IUnknown.Release(local13);
		IDirect3DDevice.GetRenderTargetData(this.aLong121, this.aLong123, this.aLongArray15[this.anInt2736]);
		@Pc(63) long local63 = IDirect3DDevice.CreateEventQuery(this.aLong121);
		if (e.method27888(IDirect3DEventQuery.Issue(local63))) {
			this.aLongArray13[this.anInt2736] = local63;
		}
		this.anIntArray227[this.anInt2736] = arg0;
		if (++this.anInt2736 >= 3) {
			this.anInt2736 = 0;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "nk", descriptor = "(II)Lclient!dw;")
	@Override
	public Interface19 method20690(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class473(this, Class226.aClass226_26, arg0, arg1, 0);
	}

	@OriginalMember(owner = "client!aqd", name = "vr", descriptor = "()V")
	@Override
	void method20989() {
		if (this.aBoolean463) {
			IDirect3DDevice.SetRenderState(this.aLong121, 60, this.anInt2945);
		}
	}

	@OriginalMember(owner = "client!aqd", name = "agx", descriptor = "(Lclient!lo;)V")
	@Override
	public void method21284(@OriginalArg(0) Class145 arg0) {
		@Pc(2) Class145_Sub2 local2 = (Class145_Sub2) arg0;
		IDirect3DDevice.SetVertexDeclaration(this.aLong121, local2.aLong48);
	}

	@OriginalMember(owner = "client!aqd", name = "hm", descriptor = "()V")
	@Override
	public void method20628() {
		for (@Pc(1) int local1 = 0; local1 < 3; local1++) {
			if (this.aLongArray13[local1] != 0L) {
				IUnknown.Release(this.aLongArray13[local1]);
				this.aLongArray13[local1] = 0L;
			}
		}
		this.anInt2736 = 0;
		this.anInt2735 = 0;
	}

	@OriginalMember(owner = "client!aqd", name = "vf", descriptor = "([Lclient!lk;)Lclient!lo;")
	@Override
	Class145 method21005(@OriginalArg(0) Class400[] arg0) {
		return new Class145_Sub2(this, arg0);
	}

	@OriginalMember(owner = "client!aqd", name = "aie", descriptor = "(Lclient!oz;)V")
	void method19552(@OriginalArg(0) Interface53 arg0) {
		@Pc(3) Class93_Sub15 local3 = this.method19540(arg0);
		if (local3 != null) {
			local3.method23981(-755406123);
		}
	}

	@OriginalMember(owner = "client!aqd", name = "hu", descriptor = "(II)J")
	@Override
	public long method20631(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method19531(arg0, arg1, null, null);
	}

	@OriginalMember(owner = "client!aqd", name = "hb", descriptor = "(J)V")
	@Override
	public void method20632(@OriginalArg(0) long arg0) {
	}

	@OriginalMember(owner = "client!aqd", name = "adb", descriptor = "(Lclient!ck;IIZ[BII)Lclient!lz;")
	@Override
	Interface38 method21037(@OriginalArg(0) Class206 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		return new Class135_Sub3(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!aqd", name = "xy", descriptor = "(Z)Z")
	@Override
	public boolean method21079(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			return this.aBoolean431;
		} else {
			return this.aBoolean431 && this.aBoolean440;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "hx", descriptor = "(II[I[I)V")
	@Override
	public void method20635(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.method19531(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!aqd", name = "hq", descriptor = "(II[I[I)V")
	@Override
	public void method20636(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.method19531(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!aqd", name = "hf", descriptor = "()V")
	@Override
	public void method20806() {
		if (this.aLong123 != 0L) {
			IUnknown.Release(this.aLong123);
			this.aLong123 = 0L;
		}
		for (@Pc(13) int local13 = 0; local13 < 3; local13++) {
			if (this.aLongArray13[local13] != 0L) {
				IUnknown.Release(this.aLongArray13[local13]);
				this.aLongArray13[local13] = 0L;
			}
			if (this.aLongArray15[local13] != 0L) {
				IUnknown.Release(this.aLongArray15[local13]);
				this.aLongArray15[local13] = 0L;
			}
		}
		this.anInt2736 = 0;
		this.anInt2735 = 0;
	}

	@OriginalMember(owner = "client!aqd", name = "ys", descriptor = "()V")
	@Override
	void method21101() {
		this.method20437();
		for (@Pc(7) Class93_Sub15 local7 = (Class93_Sub15) this.aClass22_33.method445((byte) 98); local7 != null; local7 = (Class93_Sub15) this.aClass22_33.method415(710111119)) {
			@Pc(13) Interface53 local13 = (Interface53) local7.anObject5;
			local13.method23750();
		}
		super.method20913();
	}

	@OriginalMember(owner = "client!aqd", name = "rx", descriptor = "()Z")
	@Override
	public boolean method20897() {
		return (this.aD3DCAPS1.anInt4332 & 0xFFFF) >= 257;
	}

	@OriginalMember(owner = "client!aqd", name = "aes", descriptor = "(ILclient!mn;Z)V")
	@Override
	void method21241(@OriginalArg(0) int arg0, @OriginalArg(1) Class422 arg1, @OriginalArg(2) boolean arg2) {
		if (!this.aBoolean463) {
			return;
		}
		@Pc(4) int local4 = 0;
		@Pc(8) byte local8;
		switch(arg0) {
			case 1:
				local8 = 6;
				break;
			case 2:
				local8 = 27;
				break;
			default:
				local8 = 5;
		}
		if (arg2) {
			local4 |= 0x10;
		}
		IDirect3DDevice.SetTextureStageState(this.aLong121, this.anInt2949, local8, method19534(arg1) | local4);
	}

	@OriginalMember(owner = "client!aqd", name = "ir", descriptor = "(II)V")
	@Override
	public void method20661(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		IDirect3DDevice.Clear(this.aLong121, arg0, arg1, 1.0F, 0);
	}

	@OriginalMember(owner = "client!aqd", name = "lj", descriptor = "(Lclient!dz;Lclient!dz;FLclient!dz;)Lclient!dz;")
	@Override
	public Class107 method20750(@OriginalArg(0) Class107 arg0, @OriginalArg(1) Class107 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class107 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!aqd", name = "afg", descriptor = "()V")
	@Override
	void method21263() {
		IDirect3DDevice.method27882(this.aLong121, 15, this.aBoolean462);
		IDirect3DDevice.SetRenderState(this.aLong121, 24, this.aByte76 & 0xFF);
		if (this.aD3DPRESENT_PARAMETERS2.anInt4356 <= 0) {
			return;
		}
		if (this.aBoolean462 && this.aByte76 != 0) {
			if (this.aBoolean435) {
				IDirect3DDevice.SetRenderState(this.aLong121, 181, method21022('S', 'S', 'A', 'A'));
			} else if (this.aBoolean438) {
				IDirect3DDevice.SetRenderState(this.aLong121, 181, method21022('A', 'T', 'O', 'C'));
			} else if (this.aBoolean439) {
				IDirect3DDevice.SetRenderState(this.aLong121, 154, method21022('A', '2', 'M', '1'));
			}
		} else if (this.aBoolean435 || this.aBoolean438) {
			IDirect3DDevice.SetRenderState(this.aLong121, 181, 0);
		} else if (this.aBoolean439) {
			IDirect3DDevice.method27881(this.aLong121, 154, 1.0F);
		}
	}

	@OriginalMember(owner = "client!aqd", name = "lz", descriptor = "(Lclient!dz;Lclient!dz;FLclient!dz;)Lclient!dz;")
	@Override
	public Class107 method20752(@OriginalArg(0) Class107 arg0, @OriginalArg(1) Class107 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class107 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!aqd", name = "et", descriptor = "()V")
	@Override
	public void method20569() {
		@Pc(3) long local3 = IDirect3DDevice.CreateEventQuery(this.aLong121);
		if (e.method27888(IDirect3DEventQuery.Issue(local3))) {
			while (true) {
				@Pc(10) int local10 = IDirect3DEventQuery.IsSignaled(local3);
				if (local10 != 1) {
					break;
				}
				Thread.yield();
			}
		}
		IUnknown.Release(local3);
	}

	@OriginalMember(owner = "client!aqd", name = "nt", descriptor = "()Lclient!afq;")
	@Override
	public Class112_Sub1 method20797() {
		return new Class112_Sub1_Sub3_Sub2(this);
	}

	@OriginalMember(owner = "client!aqd", name = "nn", descriptor = "(IILclient!ck;Lclient!dg;I)Lclient!dp;")
	@Override
	public Interface18 method20885(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class206 arg2, @OriginalArg(3) Class226 arg3, @OriginalArg(4) int arg4) {
		return new Class459(this, arg2, arg3, arg0, arg1, arg4);
	}

	@OriginalMember(owner = "client!aqd", name = "aed", descriptor = "()V")
	@Override
	void method21252() {
	}

	@OriginalMember(owner = "client!aqd", name = "nq", descriptor = "(III)Lclient!dw;")
	@Override
	public Interface19 method20800(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return new Class473(this, Class226.aClass226_26, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!aqd", name = "hl", descriptor = "()V")
	@Override
	void method20801() {
		super.finalize();
	}

	@OriginalMember(owner = "client!aqd", name = "wt", descriptor = "()Z")
	@Override
	public boolean method21059() {
		return (this.aD3DCAPS1.anInt4332 & 0xFFFF) >= 257;
	}

	@OriginalMember(owner = "client!aqd", name = "hh", descriptor = "()V")
	@Override
	public void method20473() {
		if (this.aLong123 != 0L) {
			IUnknown.Release(this.aLong123);
			this.aLong123 = 0L;
		}
		for (@Pc(13) int local13 = 0; local13 < 3; local13++) {
			if (this.aLongArray13[local13] != 0L) {
				IUnknown.Release(this.aLongArray13[local13]);
				this.aLongArray13[local13] = 0L;
			}
			if (this.aLongArray15[local13] != 0L) {
				IUnknown.Release(this.aLongArray15[local13]);
				this.aLongArray15[local13] = 0L;
			}
		}
		this.anInt2736 = 0;
		this.anInt2735 = 0;
	}

	@OriginalMember(owner = "client!aqd", name = "wh", descriptor = "()Z")
	@Override
	public boolean method21074() {
		return (this.aD3DCAPS1.anInt4334 & 0xFFFF) >= 257;
	}

	@OriginalMember(owner = "client!aqd", name = "wd", descriptor = "()Z")
	@Override
	public boolean method21075() {
		return (this.aD3DCAPS1.anInt4334 & 0xFFFF) >= 257;
	}

	@OriginalMember(owner = "client!aqd", name = "hg", descriptor = "(J)V")
	@Override
	public void method20633(@OriginalArg(0) long arg0) {
	}

	@OriginalMember(owner = "client!aqd", name = "wi", descriptor = "(Z)Z")
	@Override
	public boolean method21077(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			return this.aBoolean431;
		} else {
			return this.aBoolean431 && this.aBoolean440;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "wy", descriptor = "(Z)Z")
	@Override
	public boolean method20952(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			return this.aBoolean431;
		} else {
			return this.aBoolean431 && this.aBoolean440;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "xm", descriptor = "(Z)Z")
	@Override
	public boolean method21023(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			return this.aBoolean431;
		} else {
			return this.aBoolean431 && this.aBoolean440;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "ahz", descriptor = "(II)Z")
	boolean method19554(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = IDirect3DDevice.TestCooperativeLevel(this.aLong121);
		if (local3 == 0 || local3 == -2005530519) {
			IDirect3DDevice.SetDepthStencilSurface(this.aLong121, 0L);
			@Pc(15) int local15;
			for (local15 = 1; local15 < 4; local15++) {
				IDirect3DDevice.SetRenderTarget(this.aLong121, local15, 0L);
			}
			for (local15 = 0; local15 < 4; local15++) {
				IDirect3DDevice.SetStreamSource(this.aLong121, local15, 0L, 0, 0);
			}
			for (local15 = 0; local15 < 4; local15++) {
				IDirect3DDevice.SetTexture(this.aLong121, local15, 0L);
			}
			IDirect3DDevice.SetIndices(this.aLong121, 0L);
			this.method20913();
			this.aD3DPRESENT_PARAMETERS2.anInt4352 = arg0;
			this.aD3DPRESENT_PARAMETERS2.anInt4353 = arg1;
			this.aD3DPRESENT_PARAMETERS2.anInt4355 = 1;
			if (method19551(this.anInt2731, this.anInt2730, this.aLong117, this.anInt2951, this.aD3DDISPLAYMODE1, this.aD3DPRESENT_PARAMETERS2)) {
				local15 = IDirect3DDevice.Reset(this.aLong121, this.aD3DPRESENT_PARAMETERS2);
				if (e.method27888(local15)) {
					this.aBoolean432 = false;
					this.method21045();
					this.method21173();
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!aqd", name = "zu", descriptor = "()V")
	@Override
	void method21133() {
		if (this.aClass112_6 != null) {
			IDirect3DDevice.SetViewport(this.aLong121, this.anInt2929 + this.anInt2925, this.anInt2939 + this.anInt2926, this.anInt2927, this.anInt2928, this.aFloat204, this.aFloat205);
		}
	}

	@OriginalMember(owner = "client!aqd", name = "xi", descriptor = "(Ljava/lang/String;)Lclient!ho;")
	@Override
	public Class115 method21051(@OriginalArg(0) String arg0) {
		@Pc(3) byte[] local3 = this.method19544(arg0);
		if (local3 == null) {
			return null;
		} else {
			@Pc(11) Class314 local11 = this.method20911(local3);
			return new Class115_Sub1(this, local11);
		}
	}

	@OriginalMember(owner = "client!aqd", name = "rn", descriptor = "(Lclient!pq;Lclient!pq;Lclient!pq;)V")
	@Override
	public void method20907(@OriginalArg(0) Class489 arg0, @OriginalArg(1) Class489 arg1, @OriginalArg(2) Class489 arg2) {
		IDirect3DDevice.SetTransform(this.aLong121, 256, arg0.aFloatArray116);
		IDirect3DDevice.SetTransform(this.aLong121, 2, arg1.aFloatArray116);
		IDirect3DDevice.SetTransform(this.aLong121, 3, arg2.aFloatArray116);
	}

	@OriginalMember(owner = "client!aqd", name = "uj", descriptor = "(IIZ[III)Lclient!lz;")
	@Override
	Interface38 method20973(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return new Class135_Sub3(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!aqd", name = "xr", descriptor = "(Lclient!pq;Lclient!pq;Lclient!pq;)V")
	@Override
	public void method21088(@OriginalArg(0) Class489 arg0, @OriginalArg(1) Class489 arg1, @OriginalArg(2) Class489 arg2) {
		IDirect3DDevice.SetTransform(this.aLong121, 256, arg0.aFloatArray116);
		IDirect3DDevice.SetTransform(this.aLong121, 2, arg1.aFloatArray116);
		IDirect3DDevice.SetTransform(this.aLong121, 3, arg2.aFloatArray116);
	}

	@OriginalMember(owner = "client!aqd", name = "hs", descriptor = "()V")
	@Override
	public void method20639() {
		if (this.aLong123 != 0L) {
			IUnknown.Release(this.aLong123);
			this.aLong123 = 0L;
		}
		for (@Pc(13) int local13 = 0; local13 < 3; local13++) {
			if (this.aLongArray13[local13] != 0L) {
				IUnknown.Release(this.aLongArray13[local13]);
				this.aLongArray13[local13] = 0L;
			}
			if (this.aLongArray15[local13] != 0L) {
				IUnknown.Release(this.aLongArray15[local13]);
				this.aLongArray15[local13] = 0L;
			}
		}
		this.anInt2736 = 0;
		this.anInt2735 = 0;
	}

	@OriginalMember(owner = "client!aqd", name = "xb", descriptor = "(Lclient!pq;Lclient!pq;Lclient!pq;)V")
	@Override
	public void method21206(@OriginalArg(0) Class489 arg0, @OriginalArg(1) Class489 arg1, @OriginalArg(2) Class489 arg2) {
		IDirect3DDevice.SetTransform(this.aLong121, 256, arg0.aFloatArray116);
		IDirect3DDevice.SetTransform(this.aLong121, 2, arg1.aFloatArray116);
		IDirect3DDevice.SetTransform(this.aLong121, 3, arg2.aFloatArray116);
	}

	@OriginalMember(owner = "client!aqd", name = "xe", descriptor = "(Lclient!pq;Lclient!pq;Lclient!pq;)V")
	@Override
	public void method21091(@OriginalArg(0) Class489 arg0, @OriginalArg(1) Class489 arg1, @OriginalArg(2) Class489 arg2) {
		IDirect3DDevice.SetTransform(this.aLong121, 256, arg0.aFloatArray116);
		IDirect3DDevice.SetTransform(this.aLong121, 2, arg1.aFloatArray116);
		IDirect3DDevice.SetTransform(this.aLong121, 3, arg2.aFloatArray116);
	}

	@OriginalMember(owner = "client!aqd", name = "aef", descriptor = "()V")
	@Override
	void method21066() {
		if (this.aLong120 != 0L || this.aClass425Array3[this.anInt2949] == Class425.aClass425_3) {
			IDirect3DDevice.SetTextureStageState(this.aLong121, this.anInt2949, 24, 0);
			this.anIntArray226[this.anInt2949] = 0;
			return;
		}
		if (this.aClass425Array3[this.anInt2949] == Class425.aClass425_1) {
			IDirect3DDevice.SetTransform(this.aLong121, this.anInt2949 + 16, this.aClass489Array5[this.anInt2949].method30052(this.aFloatArray50));
		} else {
			IDirect3DDevice.SetTransform(this.aLong121, this.anInt2949 + 16, this.aClass489Array5[this.anInt2949].method30008(this.aFloatArray50));
		}
		@Pc(58) int local58 = method19541(this.aClass425Array3[this.anInt2949]);
		if (local58 != this.anIntArray226[this.anInt2949]) {
			IDirect3DDevice.SetTextureStageState(this.aLong121, this.anInt2949, 24, local58);
			this.anIntArray226[this.anInt2949] = local58;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "yj", descriptor = "()V")
	@Override
	void method21100() {
		this.method20437();
		for (@Pc(7) Class93_Sub15 local7 = (Class93_Sub15) this.aClass22_33.method445((byte) 75); local7 != null; local7 = (Class93_Sub15) this.aClass22_33.method415(1127647610)) {
			@Pc(13) Interface53 local13 = (Interface53) local7.anObject5;
			local13.method23750();
		}
		super.method20913();
	}

	@OriginalMember(owner = "client!aqd", name = "abn", descriptor = "()V")
	@Override
	void method21178() {
		IDirect3DDevice.method27882(this.aLong121, 7, this.aBoolean466 && this.aBoolean459);
	}

	@OriginalMember(owner = "client!aqd", name = "yk", descriptor = "()V")
	@Override
	void method21102() {
		this.method20437();
		for (@Pc(7) Class93_Sub15 local7 = (Class93_Sub15) this.aClass22_33.method445((byte) 92); local7 != null; local7 = (Class93_Sub15) this.aClass22_33.method415(1433451770)) {
			@Pc(13) Interface53 local13 = (Interface53) local7.anObject5;
			local13.method23750();
		}
		super.method20913();
	}

	@OriginalMember(owner = "client!aqd", name = "yn", descriptor = "()V")
	@Override
	void method21103() {
		for (@Pc(5) Class93_Sub15 local5 = (Class93_Sub15) this.aClass22_33.method445((byte) 65); local5 != null; local5 = (Class93_Sub15) this.aClass22_33.method415(1523711103)) {
			@Pc(11) Interface53 local11 = (Interface53) local5.anObject5;
			local11.method10400();
			if (local11 == this.aClass112_6) {
				local11.method23751();
			}
		}
		super.method21045();
	}

	@OriginalMember(owner = "client!aqd", name = "aiu", descriptor = "(J)V")
	void method19555(@OriginalArg(0) long arg0) {
		IDirect3DDevice.SetPixelShader(this.aLong121, arg0);
	}

	@OriginalMember(owner = "client!aqd", name = "yx", descriptor = "()F")
	@Override
	public float method21109() {
		return -0.5F;
	}

	@OriginalMember(owner = "client!aqd", name = "xc", descriptor = "(Lclient!pq;Lclient!pq;Lclient!pq;)V")
	@Override
	public void method21089(@OriginalArg(0) Class489 arg0, @OriginalArg(1) Class489 arg1, @OriginalArg(2) Class489 arg2) {
		IDirect3DDevice.SetTransform(this.aLong121, 256, arg0.aFloatArray116);
		IDirect3DDevice.SetTransform(this.aLong121, 2, arg1.aFloatArray116);
		IDirect3DDevice.SetTransform(this.aLong121, 3, arg2.aFloatArray116);
	}

	@OriginalMember(owner = "client!aqd", name = "ze", descriptor = "()V")
	@Override
	void method21134() {
		if (this.aClass112_6 != null) {
			IDirect3DDevice.SetViewport(this.aLong121, this.anInt2929 + this.anInt2925, this.anInt2939 + this.anInt2926, this.anInt2927, this.anInt2928, this.aFloat204, this.aFloat205);
		}
	}

	@OriginalMember(owner = "client!aqd", name = "zv", descriptor = "()V")
	@Override
	void method21135() {
		if (this.aClass112_6 != null) {
			IDirect3DDevice.SetViewport(this.aLong121, this.anInt2929 + this.anInt2925, this.anInt2939 + this.anInt2926, this.anInt2927, this.anInt2928, this.aFloat204, this.aFloat205);
		}
	}

	@OriginalMember(owner = "client!aqd", name = "zc", descriptor = "()V")
	@Override
	void method20902() {
		if (this.aClass112_6 != null) {
			IDirect3DDevice.SetViewport(this.aLong121, this.anInt2929 + this.anInt2925, this.anInt2939 + this.anInt2926, this.anInt2927, this.anInt2928, this.aFloat204, this.aFloat205);
		}
	}

	@OriginalMember(owner = "client!aqd", name = "zp", descriptor = "()V")
	@Override
	void method20906() {
		IDirect3DDevice.SetScissorRect(this.aLong121, this.anInt2929 + this.anInt2921, this.anInt2939 + this.anInt2940, this.anInt2958, this.anInt2930);
	}

	@OriginalMember(owner = "client!aqd", name = "ad", descriptor = "(Ljava/awt/Canvas;II)Lclient!afy;")
	@Override
	Class112_Sub2 method20455(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return new Class112_Sub2_Sub1_Sub1(this, arg0, arg1, arg2, false);
	}

	@OriginalMember(owner = "client!aqd", name = "ug", descriptor = "(Lclient!ck;IIZ[BII)Lclient!lz;")
	@Override
	Interface38 method20915(@OriginalArg(0) Class206 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		return new Class135_Sub3(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!aqd", name = "zl", descriptor = "()V")
	@Override
	void method21068() {
		IDirect3DDevice.method27882(this.aLong121, 174, this.aBoolean482);
	}

	@OriginalMember(owner = "client!aqd", name = "zb", descriptor = "()V")
	@Override
	void method21268() {
		IDirect3DDevice.method27882(this.aLong121, 174, this.aBoolean482);
	}

	@OriginalMember(owner = "client!aqd", name = "aai", descriptor = "(Lclient!pq;)V")
	@Override
	public void method21155(@OriginalArg(0) Class489 arg0) {
		arg0.method30134(this.aClass489_68);
	}

	@OriginalMember(owner = "client!aqd", name = "aap", descriptor = "(Lclient!pq;)V")
	@Override
	public void method21156(@OriginalArg(0) Class489 arg0) {
		arg0.method30134(this.aClass489_68);
	}

	@OriginalMember(owner = "client!aqd", name = "gx", descriptor = "()Z")
	@Override
	public boolean method20613() {
		if (this.aBoolean432) {
			return false;
		} else {
			return this.aLongArray13[this.anInt2736] == 0L;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "acm", descriptor = "()V")
	@Override
	void method21193() {
		this.method20961();
		this.method20963();
	}

	@OriginalMember(owner = "client!aqd", name = "abj", descriptor = "()V")
	@Override
	void method21179() {
		IDirect3DDevice.method27882(this.aLong121, 7, this.aBoolean466 && this.aBoolean459);
	}

	@OriginalMember(owner = "client!aqd", name = "aba", descriptor = "()V")
	@Override
	void method21121() {
		IDirect3DDevice.method27882(this.aLong121, 7, this.aBoolean466 && this.aBoolean459);
	}

	@OriginalMember(owner = "client!aqd", name = "zs", descriptor = "()V")
	@Override
	void method21172() {
		IDirect3DDevice.SetScissorRect(this.aLong121, this.anInt2929 + this.anInt2921, this.anInt2939 + this.anInt2940, this.anInt2958, this.anInt2930);
	}

	@OriginalMember(owner = "client!aqd", name = "abm", descriptor = "()V")
	@Override
	void method21184() {
		if (this.aBoolean463) {
			IDirect3DDevice.method27882(this.aLong121, 137, this.aBoolean467 && !this.aBoolean469);
		}
	}

	@OriginalMember(owner = "client!aqd", name = "abx", descriptor = "()V")
	@Override
	void method20976() {
		if (this.aBoolean463) {
			D3DLIGHT.SetAmbient(this.aLong118, this.aFloat214 * this.aFloat211, this.aFloat210 * this.aFloat211, this.aFloat217 * this.aFloat211, 0.0F);
			this.aBoolean442 = false;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "abk", descriptor = "()V")
	@Override
	void method21186() {
		if (!this.aBoolean463) {
			return;
		}
		@Pc(10) float local10 = this.aBoolean468 ? this.aFloat212 : 0.0F;
		@Pc(19) float local19 = this.aBoolean468 ? -this.aFloat213 : 0.0F;
		D3DLIGHT.SetDiffuse(this.aLong118, local10 * this.aFloat214, local10 * this.aFloat210, local10 * this.aFloat217, 0.0F);
		D3DLIGHT.SetDiffuse(this.aLong122, local19 * this.aFloat214, local19 * this.aFloat210, local19 * this.aFloat217, 0.0F);
		this.aBoolean442 = false;
	}

	@OriginalMember(owner = "client!aqd", name = "aby", descriptor = "()V")
	@Override
	void method21187() {
		if (!this.aBoolean463) {
			return;
		}
		@Pc(10) float local10 = this.aBoolean468 ? this.aFloat212 : 0.0F;
		@Pc(19) float local19 = this.aBoolean468 ? -this.aFloat213 : 0.0F;
		D3DLIGHT.SetDiffuse(this.aLong118, local10 * this.aFloat214, local10 * this.aFloat210, local10 * this.aFloat217, 0.0F);
		D3DLIGHT.SetDiffuse(this.aLong122, local19 * this.aFloat214, local19 * this.aFloat210, local19 * this.aFloat217, 0.0F);
		this.aBoolean442 = false;
	}

	@OriginalMember(owner = "client!aqd", name = "abe", descriptor = "()V")
	@Override
	void method21219() {
		if (this.aBoolean463) {
			D3DLIGHT.SetDirection(this.aLong118, -this.aFloatArray63[0], -this.aFloatArray63[1], -this.aFloatArray63[2]);
			D3DLIGHT.SetDirection(this.aLong122, -this.aFloatArray61[0], -this.aFloatArray61[1], -this.aFloatArray61[2]);
			this.aBoolean442 = false;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "afd", descriptor = "()V")
	@Override
	void method21270() {
		IDirect3DDevice.method27882(this.aLong121, 27, this.aBoolean481);
	}

	@OriginalMember(owner = "client!aqd", name = "wj", descriptor = "(Lclient!ml;Lclient!ms;IIII)V")
	@Override
	void method21018(@OriginalArg(0) Interface40 arg0, @OriginalArg(1) Class424 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (this.aClass116_Sub2_2 != null) {
			this.aClass116_Sub2_2.method8497();
		}
		IDirect3DDevice.DrawIndexedPrimitiveIB(this.aLong121, ((Class469) arg0).aLong283, 4, 0, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!aqd", name = "abs", descriptor = "()V")
	@Override
	void method21190() {
		if (this.aBoolean463) {
			D3DLIGHT.SetDirection(this.aLong118, -this.aFloatArray63[0], -this.aFloatArray63[1], -this.aFloatArray63[2]);
			D3DLIGHT.SetDirection(this.aLong122, -this.aFloatArray61[0], -this.aFloatArray61[1], -this.aFloatArray61[2]);
			this.aBoolean442 = false;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "aca", descriptor = "()V")
	@Override
	void method21137() {
		if (!this.aBoolean463 || this.aBoolean442) {
			return;
		}
		IDirect3DDevice.LightEnable(this.aLong121, 0, false);
		IDirect3DDevice.LightEnable(this.aLong121, 1, false);
		IDirect3DDevice.SetLight(this.aLong121, 0, this.aLong118);
		IDirect3DDevice.SetLight(this.aLong121, 1, this.aLong122);
		IDirect3DDevice.LightEnable(this.aLong121, 0, true);
		IDirect3DDevice.LightEnable(this.aLong121, 1, true);
		this.aBoolean442 = true;
	}

	@OriginalMember(owner = "client!aqd", name = "acd", descriptor = "()V")
	@Override
	void method21191() {
		if (!this.aBoolean463 || this.aBoolean442) {
			return;
		}
		IDirect3DDevice.LightEnable(this.aLong121, 0, false);
		IDirect3DDevice.LightEnable(this.aLong121, 1, false);
		IDirect3DDevice.SetLight(this.aLong121, 0, this.aLong118);
		IDirect3DDevice.SetLight(this.aLong121, 1, this.aLong122);
		IDirect3DDevice.LightEnable(this.aLong121, 0, true);
		IDirect3DDevice.LightEnable(this.aLong121, 1, true);
		this.aBoolean442 = true;
	}

	@OriginalMember(owner = "client!aqd", name = "ack", descriptor = "()V")
	@Override
	void method21192() {
		this.method20961();
		this.method20963();
	}

	@OriginalMember(owner = "client!aqd", name = "sw", descriptor = "()V")
	@Override
	void method21173() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2954; local1++) {
			IDirect3DDevice.SetSamplerState(this.aLong121, local1, 7, 2);
			IDirect3DDevice.SetSamplerState(this.aLong121, local1, 6, 2);
			IDirect3DDevice.SetSamplerState(this.aLong121, local1, 5, 2);
			IDirect3DDevice.SetSamplerState(this.aLong121, local1, 1, 1);
			IDirect3DDevice.SetSamplerState(this.aLong121, local1, 2, 1);
			this.aClass405Array1[local1] = Class405.aClass405_6;
			@Pc(48) boolean[] local48 = this.aBooleanArray14;
			this.aBooleanArray15[local1] = true;
			local48[local1] = true;
			this.aBooleanArray16[local1] = false;
			this.anIntArray226[local1] = 0;
		}
		IDirect3DDevice.SetTextureStageState(this.aLong121, 0, 6, 1);
		IDirect3DDevice.SetRenderState(this.aLong121, 9, 2);
		IDirect3DDevice.SetRenderState(this.aLong121, 23, 4);
		IDirect3DDevice.SetRenderState(this.aLong121, 25, 5);
		IDirect3DDevice.SetRenderState(this.aLong121, 24, 0);
		IDirect3DDevice.method27882(this.aLong121, 206, this.aBoolean461);
		IDirect3DDevice.SetRenderState(this.aLong121, 181, 0);
		this.method19542();
		IDirect3DDevice.SetRenderState(this.aLong121, 147, 1);
		IDirect3DDevice.SetRenderState(this.aLong121, 145, 1);
		IDirect3DDevice.method27881(this.aLong121, 38, 0.95F);
		IDirect3DDevice.SetRenderState(this.aLong121, 35, 3);
		IDirect3DDevice.method27881(this.aLong121, 154, 1.0F);
		D3DLIGHT.SetType(this.aLong118, 3);
		D3DLIGHT.SetType(this.aLong122, 3);
		D3DLIGHT.SetType(this.aLong119, 1);
		this.aBoolean442 = false;
		super.method21173();
	}

	@OriginalMember(owner = "client!aqd", name = "act", descriptor = "()V")
	@Override
	void method21194() {
		this.method20961();
		this.method20963();
	}

	@OriginalMember(owner = "client!aqd", name = "aci", descriptor = "()V")
	@Override
	void method21195() {
		this.method20961();
		this.method20963();
	}

	@OriginalMember(owner = "client!aqd", name = "gz", descriptor = "(III)V")
	@Override
	public void method20698(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aLong123 == 0L) {
			this.method19559(arg1, arg2);
		}
		@Pc(13) long local13 = IDirect3DDevice.GetRenderTarget(this.aLong121, 0);
		if (e.method27887(IDirect3DDevice.StretchRect(this.aLong121, local13, 0, 0, this.aClass112_6.method23748(), this.aClass112_6.method23749(), this.aLong123, this.anInt2899 * 1081362515, this.anInt2903 * -779214253, this.anInt2904 * 406942099, this.anInt2898 * -88050601, 2))) {
		}
		IUnknown.Release(local13);
		IDirect3DDevice.GetRenderTargetData(this.aLong121, this.aLong123, this.aLongArray15[this.anInt2736]);
		@Pc(63) long local63 = IDirect3DDevice.CreateEventQuery(this.aLong121);
		if (e.method27888(IDirect3DEventQuery.Issue(local63))) {
			this.aLongArray13[this.anInt2736] = local63;
		}
		this.anIntArray227[this.anInt2736] = arg0;
		if (++this.anInt2736 >= 3) {
			this.anInt2736 = 0;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "acb", descriptor = "()V")
	@Override
	void method21087() {
		this.method20961();
		this.method20963();
	}

	@OriginalMember(owner = "client!aqd", name = "acu", descriptor = "()V")
	@Override
	void method21202() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt2934; local1++) {
			@Pc(10) Class93_Sub16 local10 = this.aClass93_Sub16Array19[local1];
			@Pc(14) int local14 = local1 + 2;
			@Pc(18) int local18 = local10.method13539((byte) -34);
			@Pc(24) float local24 = local10.method13525(264028265) / 255.0F;
			D3DLIGHT.SetPosition(this.aLong119, (float) local10.method13520(-306140133), (float) local10.method13521(1655674161), (float) local10.method13522(1356255493));
			D3DLIGHT.SetDiffuse(this.aLong119, (float) (local18 >> 16 & 0xFF) * local24, (float) (local18 >> 8 & 0xFF) * local24, (float) (local18 & 0xFF) * local24, 0.0F);
			D3DLIGHT.SetAttenuation(this.aLong119, 0.0F, 0.0F, 1.0F / (float) (local10.method13523((byte) -5) * local10.method13523((byte) -55)));
			D3DLIGHT.SetRange(this.aLong119, (float) local10.method13523((byte) -8));
			IDirect3DDevice.SetLight(this.aLong121, local14, this.aLong119);
			IDirect3DDevice.LightEnable(this.aLong121, local14, true);
		}
		while (local1 < this.anInt2933) {
			IDirect3DDevice.LightEnable(this.aLong121, local1 + 2, false);
			local1++;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "acg", descriptor = "()V")
	@Override
	void method20980() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt2934; local1++) {
			@Pc(10) Class93_Sub16 local10 = this.aClass93_Sub16Array19[local1];
			@Pc(14) int local14 = local1 + 2;
			@Pc(18) int local18 = local10.method13539((byte) -112);
			@Pc(24) float local24 = local10.method13525(-1639432074) / 255.0F;
			D3DLIGHT.SetPosition(this.aLong119, (float) local10.method13520(-954205478), (float) local10.method13521(1655674161), (float) local10.method13522(1495638520));
			D3DLIGHT.SetDiffuse(this.aLong119, (float) (local18 >> 16 & 0xFF) * local24, (float) (local18 >> 8 & 0xFF) * local24, (float) (local18 & 0xFF) * local24, 0.0F);
			D3DLIGHT.SetAttenuation(this.aLong119, 0.0F, 0.0F, 1.0F / (float) (local10.method13523((byte) -74) * local10.method13523((byte) -22)));
			D3DLIGHT.SetRange(this.aLong119, (float) local10.method13523((byte) -75));
			IDirect3DDevice.SetLight(this.aLong121, local14, this.aLong119);
			IDirect3DDevice.LightEnable(this.aLong121, local14, true);
		}
		while (local1 < this.anInt2933) {
			IDirect3DDevice.LightEnable(this.aLong121, local1 + 2, false);
			local1++;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "acz", descriptor = "(Lclient!ck;Lclient!dg;)Z")
	@Override
	boolean method21203(@OriginalArg(0) Class206 arg0, @OriginalArg(1) Class226 arg1) {
		@Pc(3) D3DDISPLAYMODE local3 = new D3DDISPLAYMODE();
		return e.method27888(IDirect3D.GetAdapterDisplayMode(this.aLong117, this.anInt2731, local3)) && e.method27888(IDirect3D.CheckDeviceFormat(this.aLong117, this.anInt2731, this.anInt2730, local3.anInt4350, 0, 3, method19546(arg0, arg1)));
	}

	@OriginalMember(owner = "client!aqd", name = "acp", descriptor = "(Lclient!ck;Lclient!dg;)Z")
	@Override
	boolean method21204(@OriginalArg(0) Class206 arg0, @OriginalArg(1) Class226 arg1) {
		@Pc(3) D3DDISPLAYMODE local3 = new D3DDISPLAYMODE();
		return e.method27888(IDirect3D.GetAdapterDisplayMode(this.aLong117, this.anInt2731, local3)) && e.method27888(IDirect3D.CheckDeviceFormat(this.aLong117, this.anInt2731, this.anInt2730, local3.anInt4350, 0, 4, method19546(arg0, arg1)));
	}

	@OriginalMember(owner = "client!aqd", name = "acq", descriptor = "(Lclient!ck;Lclient!dg;)Z")
	@Override
	boolean method21205(@OriginalArg(0) Class206 arg0, @OriginalArg(1) Class226 arg1) {
		@Pc(3) D3DDISPLAYMODE local3 = new D3DDISPLAYMODE();
		return e.method27888(IDirect3D.GetAdapterDisplayMode(this.aLong117, this.anInt2731, local3)) && e.method27888(IDirect3D.CheckDeviceFormat(this.aLong117, this.anInt2731, this.anInt2730, local3.anInt4350, 0, 4, method19546(arg0, arg1)));
	}

	@OriginalMember(owner = "client!aqd", name = "acr", descriptor = "(Lclient!ck;Lclient!dg;)Z")
	@Override
	boolean method21271(@OriginalArg(0) Class206 arg0, @OriginalArg(1) Class226 arg1) {
		@Pc(3) D3DDISPLAYMODE local3 = new D3DDISPLAYMODE();
		return e.method27888(IDirect3D.GetAdapterDisplayMode(this.aLong117, this.anInt2731, local3)) && e.method27888(IDirect3D.CheckDeviceFormat(this.aLong117, this.anInt2731, this.anInt2730, local3.anInt4350, 0, 4, method19546(arg0, arg1)));
	}

	@OriginalMember(owner = "client!aqd", name = "ada", descriptor = "(Lclient!ck;Lclient!dg;II)Lclient!lz;")
	@Override
	Interface38 method21217(@OriginalArg(0) Class206 arg0, @OriginalArg(1) Class226 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return new Class135_Sub3(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!aqd", name = "adh", descriptor = "(Lclient!ck;Lclient!dg;II)Lclient!lz;")
	@Override
	Interface38 method21218(@OriginalArg(0) Class206 arg0, @OriginalArg(1) Class226 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return new Class135_Sub3(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!aqd", name = "abd", descriptor = "()V")
	@Override
	void method21188() {
		if (this.aBoolean463) {
			D3DLIGHT.SetDirection(this.aLong118, -this.aFloatArray63[0], -this.aFloatArray63[1], -this.aFloatArray63[2]);
			D3DLIGHT.SetDirection(this.aLong122, -this.aFloatArray61[0], -this.aFloatArray61[1], -this.aFloatArray61[2]);
			this.aBoolean442 = false;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "vc", descriptor = "(Z)Lclient!ml;")
	@Override
	Interface40 method21007(@OriginalArg(0) boolean arg0) {
		return new Class469(this, Class226.aClass226_23, arg0);
	}

	@OriginalMember(owner = "client!aqd", name = "ads", descriptor = "(IIZ[III)Lclient!lz;")
	@Override
	Interface38 method21078(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return new Class135_Sub3(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!aqd", name = "adg", descriptor = "(IIZ[III)Lclient!lz;")
	@Override
	Interface38 method21258(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return new Class135_Sub3(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!aqd", name = "adn", descriptor = "(IZ[[I)Lclient!mr;")
	@Override
	Interface44 method21223(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[][] arg2) {
		return new Class135_Sub2(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!aqd", name = "adk", descriptor = "(IZ[[I)Lclient!mr;")
	@Override
	Interface44 method21067(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[][] arg2) {
		return new Class135_Sub2(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!aqd", name = "ado", descriptor = "(IZ[[I)Lclient!mr;")
	@Override
	Interface44 method21225(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[][] arg2) {
		return new Class135_Sub2(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!aqd", name = "adr", descriptor = "(Lclient!ck;IIIZ[B)Lclient!ll;")
	@Override
	Interface35 method21090(@OriginalArg(0) Class206 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5) {
		return new Class135_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!aqd", name = "agq", descriptor = "(Lclient!ms;IIII)V")
	@Override
	public void method20954(@OriginalArg(0) Class424 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.aClass116_Sub2_2 != null) {
			this.aClass116_Sub2_2.method8497();
		}
		IDirect3DDevice.DrawIndexedPrimitive(this.aLong121, method19564(arg0), 0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!aqd", name = "adf", descriptor = "(Lclient!ck;Lclient!dg;II)Lclient!mo;")
	@Override
	Interface42 method21035(@OriginalArg(0) Class206 arg0, @OriginalArg(1) Class226 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return new Class135_Sub3_Sub1(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!aqd", name = "adq", descriptor = "()V")
	@Override
	public void method21000() {
		if (this.aBooleanArray17[this.anInt2949]) {
			this.aBooleanArray17[this.anInt2949] = false;
			IDirect3DDevice.SetTexture(this.aLong121, this.anInt2949, 0L);
			this.method20992();
			this.method21197();
		}
	}

	@OriginalMember(owner = "client!aqd", name = "aer", descriptor = "(ILclient!mn;Z)V")
	@Override
	void method21181(@OriginalArg(0) int arg0, @OriginalArg(1) Class422 arg1, @OriginalArg(2) boolean arg2) {
		if (!this.aBoolean463) {
			return;
		}
		@Pc(4) int local4 = 0;
		@Pc(8) byte local8;
		switch(arg0) {
			case 1:
				local8 = 6;
				break;
			case 2:
				local8 = 27;
				break;
			default:
				local8 = 5;
		}
		if (arg2) {
			local4 |= 0x10;
		}
		IDirect3DDevice.SetTextureStageState(this.aLong121, this.anInt2949, local8, method19534(arg1) | local4);
	}

	@OriginalMember(owner = "client!aqd", name = "aeg", descriptor = "()V")
	@Override
	void method21164() {
		if (this.aBoolean463) {
			IDirect3DDevice.SetRenderState(this.aLong121, 60, this.anInt2945);
		}
	}

	@OriginalMember(owner = "client!aqd", name = "abp", descriptor = "()V")
	@Override
	void method21183() {
		if (this.aBoolean463) {
			IDirect3DDevice.method27882(this.aLong121, 137, this.aBoolean467 && !this.aBoolean469);
		}
	}

	@OriginalMember(owner = "client!aqd", name = "ael", descriptor = "()V")
	@Override
	void method21002() {
		if (this.aBoolean463) {
			IDirect3DDevice.SetRenderState(this.aLong121, 60, this.anInt2945);
		}
	}

	@OriginalMember(owner = "client!aqd", name = "aei", descriptor = "()V")
	@Override
	void method21249() {
		if (this.aBoolean463) {
			IDirect3DDevice.SetRenderState(this.aLong121, 60, this.anInt2945);
		}
	}

	@OriginalMember(owner = "client!aqd", name = "yg", descriptor = "()V")
	@Override
	void method21168() {
		for (@Pc(5) Class93_Sub15 local5 = (Class93_Sub15) this.aClass22_33.method445((byte) 17); local5 != null; local5 = (Class93_Sub15) this.aClass22_33.method415(1448118185)) {
			@Pc(11) Interface53 local11 = (Interface53) local5.anObject5;
			local11.method10400();
			if (local11 == this.aClass112_6) {
				local11.method23751();
			}
		}
		super.method21045();
	}

	@OriginalMember(owner = "client!aqd", name = "aej", descriptor = "()V")
	@Override
	void method21250() {
		if (this.aLong120 != 0L || this.aClass425Array3[this.anInt2949] == Class425.aClass425_3) {
			IDirect3DDevice.SetTextureStageState(this.aLong121, this.anInt2949, 24, 0);
			this.anIntArray226[this.anInt2949] = 0;
			return;
		}
		if (this.aClass425Array3[this.anInt2949] == Class425.aClass425_1) {
			IDirect3DDevice.SetTransform(this.aLong121, this.anInt2949 + 16, this.aClass489Array5[this.anInt2949].method30052(this.aFloatArray50));
		} else {
			IDirect3DDevice.SetTransform(this.aLong121, this.anInt2949 + 16, this.aClass489Array5[this.anInt2949].method30008(this.aFloatArray50));
		}
		@Pc(58) int local58 = method19541(this.aClass425Array3[this.anInt2949]);
		if (local58 != this.anIntArray226[this.anInt2949]) {
			IDirect3DDevice.SetTextureStageState(this.aLong121, this.anInt2949, 24, local58);
			this.anIntArray226[this.anInt2949] = local58;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "uz", descriptor = "(Lclient!ck;Lclient!dg;II)Lclient!lz;")
	@Override
	Interface38 method20970(@OriginalArg(0) Class206 arg0, @OriginalArg(1) Class226 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return new Class135_Sub3(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!aqd", name = "afq", descriptor = "()V")
	@Override
	void method20958() {
		if (this.aBoolean463) {
			@Pc(17) int local17 = this.aBooleanArray17[this.anInt2949] ? method19562(this.aClass421Array6[this.anInt2949]) : 1;
			IDirect3DDevice.SetTextureStageState(this.aLong121, this.anInt2949, 4, local17);
		}
	}

	@OriginalMember(owner = "client!aqd", name = "xt", descriptor = "()V")
	@Override
	void method21097() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2954; local1++) {
			IDirect3DDevice.SetSamplerState(this.aLong121, local1, 7, 2);
			IDirect3DDevice.SetSamplerState(this.aLong121, local1, 6, 2);
			IDirect3DDevice.SetSamplerState(this.aLong121, local1, 5, 2);
			IDirect3DDevice.SetSamplerState(this.aLong121, local1, 1, 1);
			IDirect3DDevice.SetSamplerState(this.aLong121, local1, 2, 1);
			this.aClass405Array1[local1] = Class405.aClass405_6;
			@Pc(48) boolean[] local48 = this.aBooleanArray14;
			this.aBooleanArray15[local1] = true;
			local48[local1] = true;
			this.aBooleanArray16[local1] = false;
			this.anIntArray226[local1] = 0;
		}
		IDirect3DDevice.SetTextureStageState(this.aLong121, 0, 6, 1);
		IDirect3DDevice.SetRenderState(this.aLong121, 9, 2);
		IDirect3DDevice.SetRenderState(this.aLong121, 23, 4);
		IDirect3DDevice.SetRenderState(this.aLong121, 25, 5);
		IDirect3DDevice.SetRenderState(this.aLong121, 24, 0);
		IDirect3DDevice.method27882(this.aLong121, 206, this.aBoolean461);
		IDirect3DDevice.SetRenderState(this.aLong121, 181, 0);
		this.method19542();
		IDirect3DDevice.SetRenderState(this.aLong121, 147, 1);
		IDirect3DDevice.SetRenderState(this.aLong121, 145, 1);
		IDirect3DDevice.method27881(this.aLong121, 38, 0.95F);
		IDirect3DDevice.SetRenderState(this.aLong121, 35, 3);
		IDirect3DDevice.method27881(this.aLong121, 154, 1.0F);
		D3DLIGHT.SetType(this.aLong118, 3);
		D3DLIGHT.SetType(this.aLong122, 3);
		D3DLIGHT.SetType(this.aLong119, 1);
		this.aBoolean442 = false;
		super.method21173();
	}

	@OriginalMember(owner = "client!aqd", name = "aek", descriptor = "()V")
	@Override
	void method21254() {
		if (this.aBoolean463) {
			@Pc(17) int local17 = this.aBooleanArray17[this.anInt2949] ? method19562(this.aClass421Array5[this.anInt2949]) : 1;
			IDirect3DDevice.SetTextureStageState(this.aLong121, this.anInt2949, 1, local17);
		}
	}

	@OriginalMember(owner = "client!aqd", name = "aem", descriptor = "()V")
	@Override
	void method21255() {
		if (this.aBoolean463) {
			@Pc(17) int local17 = this.aBooleanArray17[this.anInt2949] ? method19562(this.aClass421Array5[this.anInt2949]) : 1;
			IDirect3DDevice.SetTextureStageState(this.aLong121, this.anInt2949, 1, local17);
		}
	}

	@OriginalMember(owner = "client!aqd", name = "aia", descriptor = "(J)V")
	synchronized void method19558(@OriginalArg(0) long arg0) {
		if (this.anInt2733 == this.anInt2734) {
			this.anInt2734 *= 2;
			@Pc(14) long[] local14 = new long[this.anInt2734];
			System.arraycopy(this.aLongArray14, 0, local14, 0, this.anInt2733);
			this.aLongArray14 = local14;
		}
		this.aLongArray14[this.anInt2733] = arg0;
		this.anInt2733++;
	}

	@OriginalMember(owner = "client!aqd", name = "aho", descriptor = "(II)V")
	void method19559(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method20437();
		this.method20730(arg0, arg1, (byte) 0);
		this.aLong123 = IDirect3DDevice.CreateRenderTarget(this.aLong121, arg0, arg1, method19546(Class206.aClass206_22, Class226.aClass226_22), 0, 0, false);
		for (@Pc(21) int local21 = 0; local21 < 3; local21++) {
			this.aLongArray15[local21] = IDirect3DDevice.CreateOffscreenPlainSurface(this.aLong121, arg0, arg1, method19546(Class206.aClass206_22, Class226.aClass226_22), 2);
		}
		this.method20901(arg0 * arg1 * 4);
	}

	@OriginalMember(owner = "client!aqd", name = "aio", descriptor = "(II)Z")
	boolean method19560(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = IDirect3DDevice.TestCooperativeLevel(this.aLong121);
		if (local3 == 0 || local3 == -2005530519) {
			IDirect3DDevice.SetDepthStencilSurface(this.aLong121, 0L);
			@Pc(15) int local15;
			for (local15 = 1; local15 < 4; local15++) {
				IDirect3DDevice.SetRenderTarget(this.aLong121, local15, 0L);
			}
			for (local15 = 0; local15 < 4; local15++) {
				IDirect3DDevice.SetStreamSource(this.aLong121, local15, 0L, 0, 0);
			}
			for (local15 = 0; local15 < 4; local15++) {
				IDirect3DDevice.SetTexture(this.aLong121, local15, 0L);
			}
			IDirect3DDevice.SetIndices(this.aLong121, 0L);
			this.method20913();
			this.aD3DPRESENT_PARAMETERS2.anInt4352 = arg0;
			this.aD3DPRESENT_PARAMETERS2.anInt4353 = arg1;
			this.aD3DPRESENT_PARAMETERS2.anInt4355 = 1;
			if (method19551(this.anInt2731, this.anInt2730, this.aLong117, this.anInt2951, this.aD3DDISPLAYMODE1, this.aD3DPRESENT_PARAMETERS2)) {
				local15 = IDirect3DDevice.Reset(this.aLong121, this.aD3DPRESENT_PARAMETERS2);
				if (e.method27888(local15)) {
					this.aBoolean432 = false;
					this.method21045();
					this.method21173();
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!aqd", name = "afe", descriptor = "()V")
	@Override
	void method21261() {
		IDirect3DDevice.method27882(this.aLong121, 15, this.aBoolean462);
		IDirect3DDevice.SetRenderState(this.aLong121, 24, this.aByte76 & 0xFF);
		if (this.aD3DPRESENT_PARAMETERS2.anInt4356 <= 0) {
			return;
		}
		if (this.aBoolean462 && this.aByte76 != 0) {
			if (this.aBoolean435) {
				IDirect3DDevice.SetRenderState(this.aLong121, 181, method21022('S', 'S', 'A', 'A'));
			} else if (this.aBoolean438) {
				IDirect3DDevice.SetRenderState(this.aLong121, 181, method21022('A', 'T', 'O', 'C'));
			} else if (this.aBoolean439) {
				IDirect3DDevice.SetRenderState(this.aLong121, 154, method21022('A', '2', 'M', '1'));
			}
		} else if (this.aBoolean435 || this.aBoolean438) {
			IDirect3DDevice.SetRenderState(this.aLong121, 181, 0);
		} else if (this.aBoolean439) {
			IDirect3DDevice.method27881(this.aLong121, 154, 1.0F);
		}
	}

	@OriginalMember(owner = "client!aqd", name = "afm", descriptor = "()V")
	@Override
	void method21262() {
		IDirect3DDevice.method27882(this.aLong121, 15, this.aBoolean462);
		IDirect3DDevice.SetRenderState(this.aLong121, 24, this.aByte76 & 0xFF);
		if (this.aD3DPRESENT_PARAMETERS2.anInt4356 <= 0) {
			return;
		}
		if (this.aBoolean462 && this.aByte76 != 0) {
			if (this.aBoolean435) {
				IDirect3DDevice.SetRenderState(this.aLong121, 181, method21022('S', 'S', 'A', 'A'));
			} else if (this.aBoolean438) {
				IDirect3DDevice.SetRenderState(this.aLong121, 181, method21022('A', 'T', 'O', 'C'));
			} else if (this.aBoolean439) {
				IDirect3DDevice.SetRenderState(this.aLong121, 154, method21022('A', '2', 'M', '1'));
			}
		} else if (this.aBoolean435 || this.aBoolean438) {
			IDirect3DDevice.SetRenderState(this.aLong121, 181, 0);
		} else if (this.aBoolean439) {
			IDirect3DDevice.method27881(this.aLong121, 154, 1.0F);
		}
	}

	@OriginalMember(owner = "client!aqd", name = "aic", descriptor = "(Lclient!oz;)V")
	void method19561(@OriginalArg(0) Interface53 arg0) {
		@Pc(3) Class93_Sub15 local3 = this.method19540(arg0);
		if (local3 != null) {
			local3.method23981(-507577050);
		}
	}

	@OriginalMember(owner = "client!aqd", name = "afa", descriptor = "()V")
	@Override
	void method21013() {
		IDirect3DDevice.method27882(this.aLong121, 15, this.aBoolean462);
		IDirect3DDevice.SetRenderState(this.aLong121, 24, this.aByte76 & 0xFF);
		if (this.aD3DPRESENT_PARAMETERS2.anInt4356 <= 0) {
			return;
		}
		if (this.aBoolean462 && this.aByte76 != 0) {
			if (this.aBoolean435) {
				IDirect3DDevice.SetRenderState(this.aLong121, 181, method21022('S', 'S', 'A', 'A'));
			} else if (this.aBoolean438) {
				IDirect3DDevice.SetRenderState(this.aLong121, 181, method21022('A', 'T', 'O', 'C'));
			} else if (this.aBoolean439) {
				IDirect3DDevice.SetRenderState(this.aLong121, 154, method21022('A', '2', 'M', '1'));
			}
		} else if (this.aBoolean435 || this.aBoolean438) {
			IDirect3DDevice.SetRenderState(this.aLong121, 181, 0);
		} else if (this.aBoolean439) {
			IDirect3DDevice.method27881(this.aLong121, 154, 1.0F);
		}
	}

	@OriginalMember(owner = "client!aqd", name = "afc", descriptor = "()V")
	@Override
	void method21265() {
		switch(this.aClass415_3.anInt4922) {
			case 0:
				IDirect3DDevice.SetRenderState(this.aLong121, 19, 2);
				IDirect3DDevice.SetRenderState(this.aLong121, 20, 1);
				break;
			case 1:
				IDirect3DDevice.SetRenderState(this.aLong121, 19, 9);
				IDirect3DDevice.SetRenderState(this.aLong121, 20, 2);
				break;
			case 2:
				IDirect3DDevice.SetRenderState(this.aLong121, 19, 5);
				IDirect3DDevice.SetRenderState(this.aLong121, 20, 6);
				break;
			case 3:
				IDirect3DDevice.SetRenderState(this.aLong121, 19, 2);
				IDirect3DDevice.SetRenderState(this.aLong121, 20, 2);
		}
		switch(this.anInt2948) {
			case 0:
				IDirect3DDevice.SetRenderState(this.aLong121, 207, 1);
				IDirect3DDevice.SetRenderState(this.aLong121, 208, 1);
				break;
			case 1:
				IDirect3DDevice.SetRenderState(this.aLong121, 207, 2);
				IDirect3DDevice.SetRenderState(this.aLong121, 208, 1);
				break;
			case 2:
				IDirect3DDevice.SetRenderState(this.aLong121, 207, 2);
				IDirect3DDevice.SetRenderState(this.aLong121, 208, 2);
				break;
			case 3:
				IDirect3DDevice.SetRenderState(this.aLong121, 207, 1);
				IDirect3DDevice.SetRenderState(this.aLong121, 208, 2);
		}
	}

	@OriginalMember(owner = "client!aqd", name = "afb", descriptor = "()V")
	@Override
	void method21266() {
		switch(this.aClass415_3.anInt4922) {
			case 0:
				IDirect3DDevice.SetRenderState(this.aLong121, 19, 2);
				IDirect3DDevice.SetRenderState(this.aLong121, 20, 1);
				break;
			case 1:
				IDirect3DDevice.SetRenderState(this.aLong121, 19, 9);
				IDirect3DDevice.SetRenderState(this.aLong121, 20, 2);
				break;
			case 2:
				IDirect3DDevice.SetRenderState(this.aLong121, 19, 5);
				IDirect3DDevice.SetRenderState(this.aLong121, 20, 6);
				break;
			case 3:
				IDirect3DDevice.SetRenderState(this.aLong121, 19, 2);
				IDirect3DDevice.SetRenderState(this.aLong121, 20, 2);
		}
		switch(this.anInt2948) {
			case 0:
				IDirect3DDevice.SetRenderState(this.aLong121, 207, 1);
				IDirect3DDevice.SetRenderState(this.aLong121, 208, 1);
				break;
			case 1:
				IDirect3DDevice.SetRenderState(this.aLong121, 207, 2);
				IDirect3DDevice.SetRenderState(this.aLong121, 208, 1);
				break;
			case 2:
				IDirect3DDevice.SetRenderState(this.aLong121, 207, 2);
				IDirect3DDevice.SetRenderState(this.aLong121, 208, 2);
				break;
			case 3:
				IDirect3DDevice.SetRenderState(this.aLong121, 207, 1);
				IDirect3DDevice.SetRenderState(this.aLong121, 208, 2);
		}
	}

	@OriginalMember(owner = "client!aqd", name = "aib", descriptor = "(Lclient!op;)V")
	void method19563(@OriginalArg(0) Class135 arg0) {
		IDirect3DDevice.SetTexture(this.aLong121, this.anInt2949, arg0.method11329());
		if (this.aBoolean463 && !this.aBooleanArray17[this.anInt2949]) {
			this.aBooleanArray17[this.anInt2949] = true;
			this.method20992();
			this.method21197();
		}
	}

	@OriginalMember(owner = "client!aqd", name = "afw", descriptor = "()V")
	@Override
	void method21043() {
		IDirect3DDevice.method27882(this.aLong121, 27, this.aBoolean481);
	}

	@OriginalMember(owner = "client!aqd", name = "afl", descriptor = "()V")
	@Override
	void method21004() {
		IDirect3DDevice.method27882(this.aLong121, 27, this.aBoolean481);
	}

	@OriginalMember(owner = "client!aqd", name = "xl", descriptor = "(Z)Z")
	@Override
	public boolean method21050(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			return this.aBoolean431;
		} else {
			return this.aBoolean431 && this.aBoolean440;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "ws", descriptor = "()Z")
	@Override
	public boolean method21180() {
		return (this.aD3DCAPS1.anInt4334 & 0xFFFF) >= 257;
	}

	@OriginalMember(owner = "client!aqd", name = "afn", descriptor = "(Z)V")
	@Override
	void method21008(@OriginalArg(0) boolean arg0) {
		IDirect3DDevice.method27882(this.aLong121, 161, arg0);
	}

	@OriginalMember(owner = "client!aqd", name = "afj", descriptor = "(Z)V")
	@Override
	void method21122(@OriginalArg(0) boolean arg0) {
		IDirect3DDevice.method27882(this.aLong121, 161, arg0);
	}

	@OriginalMember(owner = "client!aqd", name = "afp", descriptor = "(Z)Lclient!ml;")
	@Override
	Interface40 method21279(@OriginalArg(0) boolean arg0) {
		return new Class469(this, Class226.aClass226_23, arg0);
	}

	@OriginalMember(owner = "client!aqd", name = "agv", descriptor = "(Z)Lclient!lr;")
	@Override
	Interface37 method21041(@OriginalArg(0) boolean arg0) {
		return new Class465(this, arg0);
	}

	@OriginalMember(owner = "client!aqd", name = "aga", descriptor = "(Z)Lclient!lr;")
	@Override
	Interface37 method21281(@OriginalArg(0) boolean arg0) {
		return new Class465(this, arg0);
	}

	@OriginalMember(owner = "client!aqd", name = "agi", descriptor = "([Lclient!lk;)Lclient!lo;")
	@Override
	Class145 method21282(@OriginalArg(0) Class400[] arg0) {
		return new Class145_Sub2(this, arg0);
	}

	@OriginalMember(owner = "client!aqd", name = "agg", descriptor = "([Lclient!lk;)Lclient!lo;")
	@Override
	Class145 method21283(@OriginalArg(0) Class400[] arg0) {
		return new Class145_Sub2(this, arg0);
	}

	@OriginalMember(owner = "client!aqd", name = "go", descriptor = "()V")
	@Override
	public void method20605() {
	}

	@OriginalMember(owner = "client!aqd", name = "agj", descriptor = "(Lclient!lo;)V")
	@Override
	public void method21285(@OriginalArg(0) Class145 arg0) {
		@Pc(2) Class145_Sub2 local2 = (Class145_Sub2) arg0;
		IDirect3DDevice.SetVertexDeclaration(this.aLong121, local2.aLong48);
	}

	@OriginalMember(owner = "client!aqd", name = "tp", descriptor = "()V")
	@Override
	void method20956() {
		IDirect3DDevice.method27882(this.aLong121, 7, this.aBoolean466 && this.aBoolean459);
	}

	@OriginalMember(owner = "client!aqd", name = "agk", descriptor = "(ILclient!lr;)V")
	@Override
	public void method21287(@OriginalArg(0) int arg0, @OriginalArg(1) Interface37 arg1) {
		@Pc(2) Class465 local2 = (Class465) arg1;
		IDirect3DDevice.SetStreamSource(this.aLong121, arg0, local2.aLong282, 0, local2.method29497());
	}

	@OriginalMember(owner = "client!aqd", name = "eq", descriptor = "()Lclient!cz;")
	@Override
	public Class219 method20565() {
		@Pc(3) D3DADAPTER_IDENTIFIER local3 = new D3DADAPTER_IDENTIFIER();
		IDirect3D.GetAdapterIdentifier(this.aLong117, this.anInt2731, 0, local3);
		return new Class219(local3.anInt4268, this.method21220() ? "Direct3D FF" : "Direct3D", 9, local3.aString192, local3.aLong262, this.method21220());
	}

	@OriginalMember(owner = "client!aqd", name = "agp", descriptor = "(Lclient!ms;II)V")
	@Override
	public void method21010(@OriginalArg(0) Class424 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass116_Sub2_2 != null) {
			this.aClass116_Sub2_2.method8497();
		}
		IDirect3DDevice.DrawPrimitive(this.aLong121, method19564(arg0), arg1, arg2);
	}

	@OriginalMember(owner = "client!aqd", name = "gw", descriptor = "()I")
	@Override
	public int method20663() {
		if (this.aLongArray13[this.anInt2735] == 0L) {
			return -1;
		} else if (e.method27888(IDirect3DEventQuery.IsSignaled(this.aLongArray13[this.anInt2735]))) {
			return this.anIntArray227[this.anInt2735];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "agh", descriptor = "(Lclient!ml;Lclient!ms;IIII)V")
	@Override
	void method21295(@OriginalArg(0) Interface40 arg0, @OriginalArg(1) Class424 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (this.aClass116_Sub2_2 != null) {
			this.aClass116_Sub2_2.method8497();
		}
		IDirect3DDevice.DrawIndexedPrimitiveIB(this.aLong121, ((Class469) arg0).aLong283, 4, 0, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!aqd", name = "agr", descriptor = "(Lclient!ms;IIII)V")
	@Override
	public void method21297(@OriginalArg(0) Class424 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.aClass116_Sub2_2 != null) {
			this.aClass116_Sub2_2.method8497();
		}
		IDirect3DDevice.DrawIndexedPrimitive(this.aLong121, method19564(arg0), 0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!aqd", name = "agt", descriptor = "(Lclient!ms;IIII)V")
	@Override
	public void method21298(@OriginalArg(0) Class424 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.aClass116_Sub2_2 != null) {
			this.aClass116_Sub2_2.method8497();
		}
		IDirect3DDevice.DrawIndexedPrimitive(this.aLong121, method19564(arg0), 0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!aqd", name = "agy", descriptor = "(I)V")
	@Override
	void method21301(@OriginalArg(0) int arg0) {
		if (!this.aBoolean441) {
			@Pc(10) int local10 = (arg0 & 0x2) == 0 ? 3 : 2;
			IDirect3DDevice.SetRenderState(this.aLong121, 8, local10);
		}
	}

	@OriginalMember(owner = "client!aqd", name = "ahm", descriptor = "(I)V")
	@Override
	void method21296(@OriginalArg(0) int arg0) {
		if (!this.aBoolean441) {
			@Pc(10) int local10 = (arg0 & 0x2) == 0 ? 3 : 2;
			IDirect3DDevice.SetRenderState(this.aLong121, 8, local10);
		}
	}

	@OriginalMember(owner = "client!aqd", name = "ahc", descriptor = "(I)V")
	@Override
	void method21303(@OriginalArg(0) int arg0) {
		if (!this.aBoolean441) {
			@Pc(10) int local10 = (arg0 & 0x2) == 0 ? 3 : 2;
			IDirect3DDevice.SetRenderState(this.aLong121, 8, local10);
		}
	}

	@OriginalMember(owner = "client!aqd", name = "wx", descriptor = "()Z")
	@Override
	public boolean method21073() {
		return (this.aD3DCAPS1.anInt4334 & 0xFFFF) >= 257;
	}

	@OriginalMember(owner = "client!aqd", name = "vo", descriptor = "()V")
	@Override
	void method20990() {
		if (this.aLong120 != 0L || this.aClass425Array3[this.anInt2949] == Class425.aClass425_3) {
			IDirect3DDevice.SetTextureStageState(this.aLong121, this.anInt2949, 24, 0);
			this.anIntArray226[this.anInt2949] = 0;
			return;
		}
		if (this.aClass425Array3[this.anInt2949] == Class425.aClass425_1) {
			IDirect3DDevice.SetTransform(this.aLong121, this.anInt2949 + 16, this.aClass489Array5[this.anInt2949].method30052(this.aFloatArray50));
		} else {
			IDirect3DDevice.SetTransform(this.aLong121, this.anInt2949 + 16, this.aClass489Array5[this.anInt2949].method30008(this.aFloatArray50));
		}
		@Pc(58) int local58 = method19541(this.aClass425Array3[this.anInt2949]);
		if (local58 != this.anIntArray226[this.anInt2949]) {
			IDirect3DDevice.SetTextureStageState(this.aLong121, this.anInt2949, 24, local58);
			this.anIntArray226[this.anInt2949] = local58;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "ahh", descriptor = "(J)V")
	void method19567(@OriginalArg(0) long arg0) {
		this.aLong120 = arg0;
		IDirect3DDevice.SetVertexShader(this.aLong121, arg0);
	}

	@OriginalMember(owner = "client!aqd", name = "aid", descriptor = "(II)Z")
	boolean method19568(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = IDirect3DDevice.TestCooperativeLevel(this.aLong121);
		if (local3 == 0 || local3 == -2005530519) {
			IDirect3DDevice.SetDepthStencilSurface(this.aLong121, 0L);
			@Pc(15) int local15;
			for (local15 = 1; local15 < 4; local15++) {
				IDirect3DDevice.SetRenderTarget(this.aLong121, local15, 0L);
			}
			for (local15 = 0; local15 < 4; local15++) {
				IDirect3DDevice.SetStreamSource(this.aLong121, local15, 0L, 0, 0);
			}
			for (local15 = 0; local15 < 4; local15++) {
				IDirect3DDevice.SetTexture(this.aLong121, local15, 0L);
			}
			IDirect3DDevice.SetIndices(this.aLong121, 0L);
			this.method20913();
			this.aD3DPRESENT_PARAMETERS2.anInt4352 = arg0;
			this.aD3DPRESENT_PARAMETERS2.anInt4353 = arg1;
			this.aD3DPRESENT_PARAMETERS2.anInt4355 = 1;
			if (method19551(this.anInt2731, this.anInt2730, this.aLong117, this.anInt2951, this.aD3DDISPLAYMODE1, this.aD3DPRESENT_PARAMETERS2)) {
				local15 = IDirect3DDevice.Reset(this.aLong121, this.aD3DPRESENT_PARAMETERS2);
				if (e.method27888(local15)) {
					this.aBoolean432 = false;
					this.method21045();
					this.method21173();
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!aqd", name = "aif", descriptor = "(Lclient!oz;)Lclient!ake;")
	Class93_Sub15 method19569(@OriginalArg(0) Interface53 arg0) {
		for (@Pc(5) Class93_Sub15 local5 = (Class93_Sub15) this.aClass22_33.method445((byte) 45); local5 != null; local5 = (Class93_Sub15) this.aClass22_33.method415(1715115879)) {
			if (local5.anObject5 == arg0) {
				return local5;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!aqd", name = "aiw", descriptor = "(Lclient!oz;)Lclient!ake;")
	Class93_Sub15 method19571(@OriginalArg(0) Interface53 arg0) {
		for (@Pc(5) Class93_Sub15 local5 = (Class93_Sub15) this.aClass22_33.method445((byte) 123); local5 != null; local5 = (Class93_Sub15) this.aClass22_33.method415(1816505271)) {
			if (local5.anObject5 == arg0) {
				return local5;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!aqd", name = "aiz", descriptor = "(Lclient!oz;)V")
	void method19572(@OriginalArg(0) Interface53 arg0) {
		if (this.method19540(arg0) == null) {
			this.aClass22_33.method407(new Class93_Sub15(arg0), -1494347376);
		}
	}

	@OriginalMember(owner = "client!aqd", name = "aim", descriptor = "(Lclient!oz;)V")
	void method19573(@OriginalArg(0) Interface53 arg0) {
		@Pc(3) Class93_Sub15 local3 = this.method19540(arg0);
		if (local3 != null) {
			local3.method23981(-181562905);
		}
	}

	@OriginalMember(owner = "client!aqd", name = "abt", descriptor = "()V")
	@Override
	void method21189() {
		if (this.aBoolean463) {
			D3DLIGHT.SetDirection(this.aLong118, -this.aFloatArray63[0], -this.aFloatArray63[1], -this.aFloatArray63[2]);
			D3DLIGHT.SetDirection(this.aLong122, -this.aFloatArray61[0], -this.aFloatArray61[1], -this.aFloatArray61[2]);
			this.aBoolean442 = false;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "uk", descriptor = "(Lclient!ck;IIIZ[B)Lclient!ll;")
	@Override
	Interface35 method21138(@OriginalArg(0) Class206 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5) {
		return new Class135_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!aqd", name = "dl", descriptor = "(Lclient!dz;Lclient!dz;FLclient!dz;)Lclient!dz;")
	@Override
	public Class107 method20746(@OriginalArg(0) Class107 arg0, @OriginalArg(1) Class107 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class107 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!aqd", name = "aik", descriptor = "(II)V")
	void method19574(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method20437();
		this.method20730(arg0, arg1, (byte) 0);
		this.aLong123 = IDirect3DDevice.CreateRenderTarget(this.aLong121, arg0, arg1, method19546(Class206.aClass206_22, Class226.aClass226_22), 0, 0, false);
		for (@Pc(21) int local21 = 0; local21 < 3; local21++) {
			this.aLongArray15[local21] = IDirect3DDevice.CreateOffscreenPlainSurface(this.aLong121, arg0, arg1, method19546(Class206.aClass206_22, Class226.aClass226_22), 2);
		}
		this.method20901(arg0 * arg1 * 4);
	}

	@OriginalMember(owner = "client!aqd", name = "aih", descriptor = "(II[I[I)J")
	long method19575(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		if (this.aLongArray13[this.anInt2735] != 0L) {
			IUnknown.Release(this.aLongArray13[this.anInt2735]);
			this.aLongArray13[this.anInt2735] = 0L;
		}
		this.aByteBuffer7.clear();
		IDirect3DSurface.Download(this.aLongArray15[this.anInt2735], 0, 0, arg0, arg1, arg0 * 4, 0, this.aLong132);
		if (++this.anInt2735 >= 3) {
			this.anInt2735 = 0;
		}
		if (arg2 == null) {
			return this.aLong132;
		} else {
			this.aByteBuffer7.asIntBuffer().get(arg2);
			return 0L;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "aip", descriptor = "(J)V")
	void method19576(@OriginalArg(0) long arg0) {
		this.aLong120 = arg0;
		IDirect3DDevice.SetVertexShader(this.aLong121, arg0);
	}

	@OriginalMember(owner = "client!aqd", name = "gi", descriptor = "()V")
	@Override
	public void method20627() {
		for (@Pc(1) int local1 = 0; local1 < 3; local1++) {
			if (this.aLongArray13[local1] != 0L) {
				IUnknown.Release(this.aLongArray13[local1]);
				this.aLongArray13[local1] = 0L;
			}
		}
		this.anInt2736 = 0;
		this.anInt2735 = 0;
	}

	@OriginalMember(owner = "client!aqd", name = "ahl", descriptor = "()V")
	@Override
	void method21305() {
		IDirect3DDevice.method27882(this.aLong121, 14, this.aBoolean464 && this.aBoolean465);
	}

	@OriginalMember(owner = "client!aqd", name = "ahv", descriptor = "(Lclient!ck;IIZ[FII)Lclient!lz;")
	@Override
	Interface38 method21199(@OriginalArg(0) Class206 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		return new Class135_Sub3(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!aqd", name = "ahf", descriptor = "(Lclient!ck;IIZ[FII)Lclient!lz;")
	@Override
	Interface38 method21306(@OriginalArg(0) Class206 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		return new Class135_Sub3(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!aqd", name = "ge", descriptor = "()Z")
	@Override
	public boolean method20614() {
		if (this.aBoolean432) {
			return false;
		} else {
			return this.aLongArray13[this.anInt2736] == 0L;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "av", descriptor = "()Z")
	@Override
	public boolean method20671() {
		return true;
	}

	@OriginalMember(owner = "client!aqd", name = "gj", descriptor = "()I")
	@Override
	public int method20787() {
		if (this.aLongArray13[this.anInt2735] == 0L) {
			return -1;
		} else if (e.method27888(IDirect3DEventQuery.IsSignaled(this.aLongArray13[this.anInt2735]))) {
			return this.anIntArray227[this.anInt2735];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "ajw", descriptor = "(Ljava/lang/String;)[B")
	byte[] method19577(@OriginalArg(0) String arg0) {
		return this.method20905("dx", arg0);
	}

	@OriginalMember(owner = "client!aqd", name = "ajy", descriptor = "(Lclient!ahy;)V")
	void method19579(@OriginalArg(0) Class135_Sub1 arg0) {
		this.method19536(arg0);
		if (!this.aBooleanArray14[this.anInt2949]) {
			IDirect3DDevice.SetSamplerState(this.aLong121, this.anInt2949, 1, 1);
			this.aBooleanArray14[this.anInt2949] = true;
		}
		if (!this.aBooleanArray15[this.anInt2949]) {
			IDirect3DDevice.SetSamplerState(this.aLong121, this.anInt2949, 2, 1);
			this.aBooleanArray15[this.anInt2949] = true;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "ajs", descriptor = "(Lclient!ahy;)V")
	void method19580(@OriginalArg(0) Class135_Sub1 arg0) {
		this.method19536(arg0);
		if (!this.aBooleanArray14[this.anInt2949]) {
			IDirect3DDevice.SetSamplerState(this.aLong121, this.anInt2949, 1, 1);
			this.aBooleanArray14[this.anInt2949] = true;
		}
		if (!this.aBooleanArray15[this.anInt2949]) {
			IDirect3DDevice.SetSamplerState(this.aLong121, this.anInt2949, 2, 1);
			this.aBooleanArray15[this.anInt2949] = true;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "ajv", descriptor = "(Lclient!ahy;)V")
	void method19581(@OriginalArg(0) Class135_Sub1 arg0) {
		this.method19536(arg0);
		if (!this.aBooleanArray14[this.anInt2949]) {
			IDirect3DDevice.SetSamplerState(this.aLong121, this.anInt2949, 1, 1);
			this.aBooleanArray14[this.anInt2949] = true;
		}
		if (!this.aBooleanArray15[this.anInt2949]) {
			IDirect3DDevice.SetSamplerState(this.aLong121, this.anInt2949, 2, 1);
			this.aBooleanArray15[this.anInt2949] = true;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "ajk", descriptor = "(Lclient!ahy;)V")
	void method19582(@OriginalArg(0) Class135_Sub1 arg0) {
		this.method19536(arg0);
		if (!this.aBooleanArray14[this.anInt2949]) {
			IDirect3DDevice.SetSamplerState(this.aLong121, this.anInt2949, 1, 1);
			this.aBooleanArray14[this.anInt2949] = true;
		}
		if (!this.aBooleanArray15[this.anInt2949]) {
			IDirect3DDevice.SetSamplerState(this.aLong121, this.anInt2949, 2, 1);
			this.aBooleanArray15[this.anInt2949] = true;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "tv", descriptor = "()V")
	@Override
	void method20957() {
		IDirect3DDevice.method27882(this.aLong121, 14, this.aBoolean464 && this.aBoolean465);
	}

	@OriginalMember(owner = "client!aqd", name = "ain", descriptor = "(Lclient!op;)V")
	void method19586(@OriginalArg(0) Class135 arg0) {
		IDirect3DDevice.SetTexture(this.aLong121, this.anInt2949, arg0.method11329());
		if (this.aBoolean463 && !this.aBooleanArray17[this.anInt2949]) {
			this.aBooleanArray17[this.anInt2949] = true;
			this.method20992();
			this.method21197();
		}
	}

	@OriginalMember(owner = "client!aqd", name = "ail", descriptor = "(Lclient!oz;)Lclient!ake;")
	Class93_Sub15 method19587(@OriginalArg(0) Interface53 arg0) {
		for (@Pc(5) Class93_Sub15 local5 = (Class93_Sub15) this.aClass22_33.method445((byte) 76); local5 != null; local5 = (Class93_Sub15) this.aClass22_33.method415(1070478291)) {
			if (local5.anObject5 == arg0) {
				return local5;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!aqd", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method20431(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2733; local1++) {
			IUnknown.Release(this.aLongArray14[local1]);
		}
		this.anInt2733 = 0;
		super.method20431(arg0);
	}

	@OriginalMember(owner = "client!aqd", name = "ahr", descriptor = "(I)V")
	@Override
	void method20959(@OriginalArg(0) int arg0) {
		IDirect3DDevice.SetRenderState(this.aLong121, 168, arg0);
	}

	@OriginalMember(owner = "client!aqd", name = "ahk", descriptor = "(I)V")
	@Override
	void method21057(@OriginalArg(0) int arg0) {
		IDirect3DDevice.SetRenderState(this.aLong121, 168, arg0);
	}

	@OriginalMember(owner = "client!aqd", name = "ahq", descriptor = "(I)V")
	@Override
	void method21309(@OriginalArg(0) int arg0) {
		IDirect3DDevice.SetRenderState(this.aLong121, 168, arg0);
	}

	@OriginalMember(owner = "client!aqd", name = "aji", descriptor = "()V")
	void method19590() {
		IDirect3DDevice.SetRenderState(this.aLong121, 22, this.anInt2950);
	}

	@OriginalMember(owner = "client!aqd", name = "ajc", descriptor = "()V")
	void method19591() {
		IDirect3DDevice.SetRenderState(this.aLong121, 22, this.anInt2950);
	}

	@OriginalMember(owner = "client!aqd", name = "uc", descriptor = "(Lclient!ck;Lclient!dg;)Z")
	@Override
	boolean method21230(@OriginalArg(0) Class206 arg0, @OriginalArg(1) Class226 arg1) {
		@Pc(3) D3DDISPLAYMODE local3 = new D3DDISPLAYMODE();
		return e.method27888(IDirect3D.GetAdapterDisplayMode(this.aLong117, this.anInt2731, local3)) && e.method27888(IDirect3D.CheckDeviceFormat(this.aLong117, this.anInt2731, this.anInt2730, local3.anInt4350, 0, 4, method19546(arg0, arg1)));
	}

	@OriginalMember(owner = "client!aqd", name = "ajt", descriptor = "(Ljava/lang/String;)[B")
	byte[] method19592(@OriginalArg(0) String arg0) {
		return this.method20905("dx", arg0);
	}

	@OriginalMember(owner = "client!aqd", name = "ak", descriptor = "(J)V")
	@Override
	public void method20470(@OriginalArg(0) long arg0) {
	}

	@OriginalMember(owner = "client!aqd", name = "ea", descriptor = "()V")
	@Override
	void method20570() {
		super.method20680();
		if (this.aLong118 != 0L) {
			D3DLIGHT.Destroy(this.aLong118);
			this.aLong118 = 0L;
		}
		if (this.aLong122 != 0L) {
			D3DLIGHT.Destroy(this.aLong122);
			this.aLong122 = 0L;
		}
		if (this.aLong119 != 0L) {
			D3DLIGHT.Destroy(this.aLong119);
			this.aLong119 = 0L;
		}
		if (this.aLong121 != 0L) {
			IDirect3DDevice.Destroy(this.aLong121);
			this.aLong121 = 0L;
		}
		if (this.aLong117 != 0L) {
			IUnknown.Release(this.aLong117);
			this.aLong117 = 0L;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "agm", descriptor = "(Lclient!ml;)V")
	@Override
	void method21215(@OriginalArg(0) Interface40 arg0) {
		IDirect3DDevice.SetIndices(this.aLong121, ((Class469) arg0).aLong283);
	}

	@OriginalMember(owner = "client!aqd", name = "adi", descriptor = "(Lclient!ck;IIZ[BII)Lclient!lz;")
	@Override
	Interface38 method21256(@OriginalArg(0) Class206 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		return new Class135_Sub3(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!aqd", name = "akq", descriptor = "(J)V")
	synchronized void method19600(@OriginalArg(0) long arg0) {
		if (this.anInt2733 == this.anInt2734) {
			this.anInt2734 *= 2;
			@Pc(14) long[] local14 = new long[this.anInt2734];
			System.arraycopy(this.aLongArray14, 0, local14, 0, this.anInt2733);
			this.aLongArray14 = local14;
		}
		this.aLongArray14[this.anInt2733] = arg0;
		this.anInt2733++;
	}
}
