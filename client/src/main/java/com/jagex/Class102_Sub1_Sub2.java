package com.jagex;

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
import jagdx.t;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aqw")
public final class Class102_Sub1_Sub2 extends Class102_Sub1 {

	@OriginalMember(owner = "client!aqw", name = "ie", descriptor = "I")
	static final int anInt3006 = 3;

	@OriginalMember(owner = "client!aqw", name = "iz", descriptor = "[I")
	static final int[] anIntArray265 = new int[] { 77, 80 };

	@OriginalMember(owner = "client!aqw", name = "jd", descriptor = "[I")
	static final int[] anIntArray266 = new int[] { 22, 23 };

	@OriginalMember(owner = "client!aqw", name = "il", descriptor = "Lclient!agu;")
	Class114_Sub2 aClass114_Sub2_2;

	@OriginalMember(owner = "client!aqw", name = "it", descriptor = "Z")
	boolean aBoolean546;

	@OriginalMember(owner = "client!aqw", name = "in", descriptor = "J")
	long aLong175;

	@OriginalMember(owner = "client!aqw", name = "hx", descriptor = "J")
	long aLong170 = 0L;

	@OriginalMember(owner = "client!aqw", name = "hc", descriptor = "J")
	long aLong173 = 0L;

	@OriginalMember(owner = "client!aqw", name = "hh", descriptor = "Lclient!aag;")
	Class8 aClass8_41 = new Class8();

	@OriginalMember(owner = "client!aqw", name = "hd", descriptor = "Z")
	boolean aBoolean537 = false;

	@OriginalMember(owner = "client!aqw", name = "hy", descriptor = "J")
	long aLong169 = 0L;

	@OriginalMember(owner = "client!aqw", name = "hj", descriptor = "J")
	long aLong171 = 0L;

	@OriginalMember(owner = "client!aqw", name = "ht", descriptor = "J")
	long aLong172 = 0L;

	@OriginalMember(owner = "client!aqw", name = "hm", descriptor = "Z")
	boolean aBoolean544 = false;

	@OriginalMember(owner = "client!aqw", name = "ib", descriptor = "[F")
	final float[] aFloatArray70 = new float[16];

	@OriginalMember(owner = "client!aqw", name = "iy", descriptor = "I")
	int anInt3005 = 128;

	@OriginalMember(owner = "client!aqw", name = "iw", descriptor = "I")
	int anInt3003 = 0;

	@OriginalMember(owner = "client!aqw", name = "iv", descriptor = "[J")
	long[] aLongArray16 = new long[this.anInt3005];

	@OriginalMember(owner = "client!aqw", name = "ik", descriptor = "J")
	long aLong174 = 0L;

	@OriginalMember(owner = "client!aqw", name = "ii", descriptor = "[J")
	long[] aLongArray14 = new long[3];

	@OriginalMember(owner = "client!aqw", name = "is", descriptor = "[J")
	long[] aLongArray15 = new long[3];

	@OriginalMember(owner = "client!aqw", name = "ic", descriptor = "[I")
	int[] anIntArray263 = new int[3];

	@OriginalMember(owner = "client!aqw", name = "im", descriptor = "I")
	int anInt3008 = 0;

	@OriginalMember(owner = "client!aqw", name = "ij", descriptor = "I")
	int anInt3009 = 0;

	@OriginalMember(owner = "client!aqw", name = "hr", descriptor = "I")
	final int anInt3007;

	@OriginalMember(owner = "client!aqw", name = "he", descriptor = "I")
	final int anInt3004;

	@OriginalMember(owner = "client!aqw", name = "hu", descriptor = "Lclient!jagdx/D3DDISPLAYMODE;")
	final D3DDISPLAYMODE aD3DDISPLAYMODE1;

	@OriginalMember(owner = "client!aqw", name = "ho", descriptor = "Lclient!jagdx/D3DPRESENT_PARAMETERS;")
	final D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS2;

	@OriginalMember(owner = "client!aqw", name = "if", descriptor = "Lclient!jagdx/D3DCAPS;")
	final D3DCAPS aD3DCAPS1;

	@OriginalMember(owner = "client!aqw", name = "ih", descriptor = "Z")
	final boolean aBoolean540;

	@OriginalMember(owner = "client!aqw", name = "id", descriptor = "Z")
	final boolean aBoolean542;

	@OriginalMember(owner = "client!aqw", name = "ig", descriptor = "Z")
	final boolean aBoolean547;

	@OriginalMember(owner = "client!aqw", name = "io", descriptor = "Z")
	final boolean aBoolean541;

	@OriginalMember(owner = "client!aqw", name = "ix", descriptor = "Z")
	final boolean aBoolean543;

	@OriginalMember(owner = "client!aqw", name = "ip", descriptor = "Z")
	final boolean aBoolean545;

	@OriginalMember(owner = "client!aqw", name = "ir", descriptor = "Z")
	final boolean aBoolean536;

	@OriginalMember(owner = "client!aqw", name = "iu", descriptor = "Z")
	final boolean aBoolean538;

	@OriginalMember(owner = "client!aqw", name = "iq", descriptor = "Z")
	final boolean aBoolean539;

	@OriginalMember(owner = "client!aqw", name = "hl", descriptor = "[Z")
	boolean[] aBooleanArray15;

	@OriginalMember(owner = "client!aqw", name = "hg", descriptor = "[Z")
	boolean[] aBooleanArray17;

	@OriginalMember(owner = "client!aqw", name = "hb", descriptor = "[Z")
	boolean[] aBooleanArray16;

	@OriginalMember(owner = "client!aqw", name = "hi", descriptor = "[Lclient!le;")
	Class396[] aClass396Array1;

	@OriginalMember(owner = "client!aqw", name = "hs", descriptor = "[Z")
	boolean[] aBooleanArray14;

	@OriginalMember(owner = "client!aqw", name = "hz", descriptor = "[I")
	int[] anIntArray264;

	@OriginalMember(owner = "client!aqw", name = "ia", descriptor = "Lclient!pm;")
	Class487 aClass487_91;

	@OriginalMember(owner = "client!aqw", name = "ahd", descriptor = "(Ljava/awt/Canvas;Lclient!dx;Lclient!ew;Lclient!nh;Lclient!np;Lclient!nt;Lclient!pf;Ljava/lang/Integer;)Lclient!di;")
	static Class102 method21533(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Class235 arg1, @OriginalArg(2) Interface23 arg2, @OriginalArg(3) Interface46 arg3, @OriginalArg(4) Interface47 arg4, @OriginalArg(5) Interface48 arg5, @OriginalArg(6) Class480 arg6, @OriginalArg(7) Integer arg7) {
		@Pc(1) Class102_Sub1_Sub2 local1 = null;
		try {
			@Pc(3) byte local3 = 0;
			@Pc(5) byte local5 = 1;
			@Pc(7) long local7 = IDirect3D.Direct3DCreate();
			@Pc(11) D3DCAPS local11 = new D3DCAPS();
			IDirect3D.GetDeviceCaps(local7, local3, local5, local11);
			if ((local11.RasterCaps & 0x1000000) == 0) {
				throw new RuntimeException("");
			} else if (local11.MaxSimultaneousTextures < 2) {
				throw new RuntimeException("");
			} else if ((local11.TextureOpCaps & 0x2) == 0) {
				throw new RuntimeException("");
			} else if ((local11.TextureOpCaps & 0x8) == 0) {
				throw new RuntimeException("");
			} else if ((local11.TextureOpCaps & 0x40) == 0) {
				throw new RuntimeException("");
			} else if ((local11.TextureOpCaps & 0x200) == 0) {
				throw new RuntimeException("");
			} else if ((local11.TextureOpCaps & 0x2000000) == 0) {
				throw new RuntimeException("");
			} else if ((local11.SrcBlendCaps & local11.DestBlendCaps & 0x10) == 0) {
				throw new RuntimeException("");
			} else if ((local11.SrcBlendCaps & local11.DestBlendCaps & 0x20) == 0) {
				throw new RuntimeException("");
			} else if ((local11.SrcBlendCaps & local11.DestBlendCaps & 0x2) == 0) {
				throw new RuntimeException("");
			} else if (local11.MaxActiveLights > 0 && local11.MaxActiveLights < 2) {
				throw new RuntimeException("");
			} else if (local11.MaxStreams < 5) {
				throw new RuntimeException("");
			} else {
				@Pc(151) D3DPRESENT_PARAMETERS local151 = new D3DPRESENT_PARAMETERS(arg0);
				local151.Windowed = true;
				local151.EnableAutoDepthStencil = true;
				local151.BackBufferWidth = arg0.getWidth();
				local151.BackBufferHeight = arg0.getHeight();
				local151.BackBufferCount = 1;
				local151.PresentationInterval = Integer.MIN_VALUE;
				@Pc(175) D3DDISPLAYMODE local175 = new D3DDISPLAYMODE();
				if (!method21555(local3, local5, local7, arg7, local175, local151)) {
					throw new RuntimeException("");
				}
				@Pc(191) int local191 = 0;
				if ((local11.DevCaps & 0x100000) != 0) {
					local191 |= 0x10;
				}
				@Pc(202) long local202 = 0L;
				try {
					local202 = IDirect3D.CreateDeviceContext(local7, local3, local5, arg0, local191 | 0x40, local151);
				} catch (@Pc(214) m local214) {
					local202 = IDirect3D.CreateDeviceContext(local7, local3, local5, arg0, local191 & 0xFFEFFFFF | 0x20, local151);
				}
				local1 = new Class102_Sub1_Sub2(local3, local5, local7, local202, local175, local151, local11, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
				if (!local1.aHashtable6.containsKey(arg0)) {
					Class6.method23668(arg0, (byte) 110);
					local1.method20680(arg0, new Class108_Sub2_Sub1_Sub1(local1, arg0, arg0.getWidth(), arg0.getHeight(), true), -332844873);
				}
				local1.method20682(arg0, 2129699586);
				local1.method21212();
				return local1;
			}
		} catch (@Pc(276) RuntimeException local276) {
			if (local1 != null) {
				local1.method20661();
			}
			throw local276;
		}
	}

	@OriginalMember(owner = "client!aqw", name = "ahr", descriptor = "(Ljava/awt/Canvas;Lclient!dx;Lclient!ew;Lclient!nh;Lclient!np;Lclient!nt;Lclient!pf;Ljava/lang/Integer;)Lclient!di;")
	static Class102 method21535(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Class235 arg1, @OriginalArg(2) Interface23 arg2, @OriginalArg(3) Interface46 arg3, @OriginalArg(4) Interface47 arg4, @OriginalArg(5) Interface48 arg5, @OriginalArg(6) Class480 arg6, @OriginalArg(7) Integer arg7) {
		@Pc(1) Class102_Sub1_Sub2 local1 = null;
		try {
			@Pc(3) byte local3 = 0;
			@Pc(5) byte local5 = 1;
			@Pc(7) long local7 = IDirect3D.Direct3DCreate();
			@Pc(11) D3DCAPS local11 = new D3DCAPS();
			IDirect3D.GetDeviceCaps(local7, local3, local5, local11);
			if ((local11.RasterCaps & 0x1000000) == 0) {
				throw new RuntimeException("");
			} else if (local11.MaxSimultaneousTextures < 2) {
				throw new RuntimeException("");
			} else if ((local11.TextureOpCaps & 0x2) == 0) {
				throw new RuntimeException("");
			} else if ((local11.TextureOpCaps & 0x8) == 0) {
				throw new RuntimeException("");
			} else if ((local11.TextureOpCaps & 0x40) == 0) {
				throw new RuntimeException("");
			} else if ((local11.TextureOpCaps & 0x200) == 0) {
				throw new RuntimeException("");
			} else if ((local11.TextureOpCaps & 0x2000000) == 0) {
				throw new RuntimeException("");
			} else if ((local11.SrcBlendCaps & local11.DestBlendCaps & 0x10) == 0) {
				throw new RuntimeException("");
			} else if ((local11.SrcBlendCaps & local11.DestBlendCaps & 0x20) == 0) {
				throw new RuntimeException("");
			} else if ((local11.SrcBlendCaps & local11.DestBlendCaps & 0x2) == 0) {
				throw new RuntimeException("");
			} else if (local11.MaxActiveLights > 0 && local11.MaxActiveLights < 2) {
				throw new RuntimeException("");
			} else if (local11.MaxStreams < 5) {
				throw new RuntimeException("");
			} else {
				@Pc(151) D3DPRESENT_PARAMETERS local151 = new D3DPRESENT_PARAMETERS(arg0);
				local151.Windowed = true;
				local151.EnableAutoDepthStencil = true;
				local151.BackBufferWidth = arg0.getWidth();
				local151.BackBufferHeight = arg0.getHeight();
				local151.BackBufferCount = 1;
				local151.PresentationInterval = Integer.MIN_VALUE;
				@Pc(175) D3DDISPLAYMODE local175 = new D3DDISPLAYMODE();
				if (!method21555(local3, local5, local7, arg7, local175, local151)) {
					throw new RuntimeException("");
				}
				@Pc(191) int local191 = 0;
				if ((local11.DevCaps & 0x100000) != 0) {
					local191 |= 0x10;
				}
				@Pc(202) long local202 = 0L;
				try {
					local202 = IDirect3D.CreateDeviceContext(local7, local3, local5, arg0, local191 | 0x40, local151);
				} catch (@Pc(214) m local214) {
					local202 = IDirect3D.CreateDeviceContext(local7, local3, local5, arg0, local191 & 0xFFEFFFFF | 0x20, local151);
				}
				local1 = new Class102_Sub1_Sub2(local3, local5, local7, local202, local175, local151, local11, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
				if (!local1.aHashtable6.containsKey(arg0)) {
					Class6.method23668(arg0, (byte) 126);
					local1.method20680(arg0, new Class108_Sub2_Sub1_Sub1(local1, arg0, arg0.getWidth(), arg0.getHeight(), true), 746840187);
				}
				local1.method20682(arg0, 860493544);
				local1.method21212();
				return local1;
			}
		} catch (@Pc(276) RuntimeException local276) {
			if (local1 != null) {
				local1.method20661();
			}
			throw local276;
		}
	}

	@OriginalMember(owner = "client!aqw", name = "ain", descriptor = "(Lclient!ma;)I")
	static int method21539(@OriginalArg(0) Class412 arg0) {
		switch(arg0.anInt4615) {
			case 0:
				return 4;
			case 1:
				return 10;
			case 2:
				return 7;
			case 3:
				return 26;
			case 4:
				return 2;
			default:
				throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!aqw", name = "ahq", descriptor = "(Lclient!mh;)I")
	static int method21542(@OriginalArg(0) Class417 arg0) {
		switch(arg0.anInt4625) {
			case 0:
				return 0;
			case 1:
				return 3;
			case 2:
				return 1;
			case 3:
				return 2;
			default:
				throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!aqw", name = "air", descriptor = "(Lclient!mh;)I")
	static int method21545(@OriginalArg(0) Class417 arg0) {
		switch(arg0.anInt4625) {
			case 0:
				return 0;
			case 1:
				return 3;
			case 2:
				return 1;
			case 3:
				return 2;
			default:
				throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!aqw", name = "ajt", descriptor = "(IIJILclient!jagdx/D3DDISPLAYMODE;Lclient!jagdx/D3DPRESENT_PARAMETERS;)Z")
	static boolean method21546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3, @OriginalArg(4) D3DDISPLAYMODE arg4, @OriginalArg(5) D3DPRESENT_PARAMETERS arg5) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		try {
			if (t.t(IDirect3D.GetAdapterDisplayMode(arg2, arg0, arg4))) {
				return false;
			}
			label76: while (arg3 >= 0) {
				if (arg3 != 1) {
					local5 = arg3;
					for (@Pc(24) int local24 = 0; local24 < anIntArray266.length; local24++) {
						if (IDirect3D.CheckDeviceType(arg2, arg0, arg1, arg4.Format, anIntArray266[local24], true) == 0 && IDirect3D.CheckDeviceFormat(arg2, arg0, arg1, arg4.Format, 1, 1, anIntArray266[local24]) == 0 && (arg3 == 0 || IDirect3D.CheckDeviceMultiSampleType(arg2, arg0, arg1, anIntArray266[local24], true, local5) == 0)) {
							for (@Pc(65) int local65 = 0; local65 < anIntArray265.length; local65++) {
								if (IDirect3D.CheckDeviceFormat(arg2, arg0, arg1, arg4.Format, 2, 1, anIntArray265[local65]) == 0 && IDirect3D.CheckDepthStencilMatch(arg2, arg0, arg1, arg4.Format, anIntArray266[local24], anIntArray265[local65]) == 0 && (arg3 == 0 || IDirect3D.CheckDeviceMultiSampleType(arg2, arg0, arg1, anIntArray265[local24], true, local5) == 0)) {
									local3 = anIntArray266[local24];
									local1 = anIntArray265[local65];
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
			arg5.BackBufferFormat = local3;
			arg5.AutoDepthStencilFormat = local1;
			arg5.MultiSampleType = local5;
			arg5.MultiSampleQuality = 0;
			return true;
		} catch (@Pc(144) Throwable local144) {
			return false;
		}
	}

	@OriginalMember(owner = "client!aqw", name = "aho", descriptor = "(Lclient!ma;)I")
	static int method21548(@OriginalArg(0) Class412 arg0) {
		switch(arg0.anInt4615) {
			case 0:
				return 4;
			case 1:
				return 10;
			case 2:
				return 7;
			case 3:
				return 26;
			case 4:
				return 2;
			default:
				throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!aqw", name = "ahw", descriptor = "(Lclient!mo;)I")
	static int method21550(@OriginalArg(0) Class422 arg0) {
		switch(arg0.anInt4629) {
			case 1:
				return 1;
			case 2:
				return 4;
			case 3:
				return 256;
			case 4:
				return 2;
			case 5:
				return 3;
			default:
				return 0;
		}
	}

	@OriginalMember(owner = "client!aqw", name = "ahm", descriptor = "(Lclient!co;Lclient!dy;)I")
	static int method21553(@OriginalArg(0) Class210 arg0, @OriginalArg(1) Class236 arg1) {
		switch(arg1.anInt3805 * 708282217) {
			case 2:
				if (arg0 == Class210.aClass210_24) {
					return 116;
				}
				break;
			case 3:
				switch(arg0.anInt3601 * 1710327153) {
					case 1:
						return e.x * -490311897;
					case 2:
						return 28;
					case 3:
						return 77;
					case 4:
						return e.w * 303785617;
					case 5:
						return 50;
					case 6:
						return 51;
					case 7:
						return 21;
					case 8:
						return 22;
					default:
						throw new IllegalArgumentException("");
				}
			case 8:
				if (arg0 == Class210.aClass210_24) {
					return 113;
				}
		}
		throw new IllegalArgumentException("");
	}

	@OriginalMember(owner = "client!aqw", name = "ahk", descriptor = "(Lclient!dy;)I")
	static int method21554(@OriginalArg(0) Class236 arg0) {
		if (arg0 == Class236.aClass236_19) {
			return 80;
		} else if (arg0 == Class236.aClass236_22) {
			return 77;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!aqw", name = "ahh", descriptor = "(IIJILclient!jagdx/D3DDISPLAYMODE;Lclient!jagdx/D3DPRESENT_PARAMETERS;)Z")
	static boolean method21555(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3, @OriginalArg(4) D3DDISPLAYMODE arg4, @OriginalArg(5) D3DPRESENT_PARAMETERS arg5) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		try {
			if (t.t(IDirect3D.GetAdapterDisplayMode(arg2, arg0, arg4))) {
				return false;
			}
			label76: while (arg3 >= 0) {
				if (arg3 != 1) {
					local5 = arg3;
					for (@Pc(24) int local24 = 0; local24 < anIntArray266.length; local24++) {
						if (IDirect3D.CheckDeviceType(arg2, arg0, arg1, arg4.Format, anIntArray266[local24], true) == 0 && IDirect3D.CheckDeviceFormat(arg2, arg0, arg1, arg4.Format, 1, 1, anIntArray266[local24]) == 0 && (arg3 == 0 || IDirect3D.CheckDeviceMultiSampleType(arg2, arg0, arg1, anIntArray266[local24], true, local5) == 0)) {
							for (@Pc(65) int local65 = 0; local65 < anIntArray265.length; local65++) {
								if (IDirect3D.CheckDeviceFormat(arg2, arg0, arg1, arg4.Format, 2, 1, anIntArray265[local65]) == 0 && IDirect3D.CheckDepthStencilMatch(arg2, arg0, arg1, arg4.Format, anIntArray266[local24], anIntArray265[local65]) == 0 && (arg3 == 0 || IDirect3D.CheckDeviceMultiSampleType(arg2, arg0, arg1, anIntArray265[local24], true, local5) == 0)) {
									local3 = anIntArray266[local24];
									local1 = anIntArray265[local65];
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
			arg5.BackBufferFormat = local3;
			arg5.AutoDepthStencilFormat = local1;
			arg5.MultiSampleType = local5;
			arg5.MultiSampleQuality = 0;
			return true;
		} catch (@Pc(144) Throwable local144) {
			return false;
		}
	}

	@OriginalMember(owner = "client!aqw", name = "ajc", descriptor = "(Lclient!dy;)I")
	static int method21558(@OriginalArg(0) Class236 arg0) {
		if (arg0 == Class236.aClass236_19) {
			return 80;
		} else if (arg0 == Class236.aClass236_22) {
			return 77;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!aqw", name = "ajl", descriptor = "(Lclient!co;Lclient!dy;)I")
	static int method21561(@OriginalArg(0) Class210 arg0, @OriginalArg(1) Class236 arg1) {
		switch(arg1.anInt3805 * 708282217) {
			case 2:
				if (arg0 == Class210.aClass210_24) {
					return 116;
				}
				break;
			case 3:
				switch(arg0.anInt3601 * 1710327153) {
					case 1:
						return e.x * -490311897;
					case 2:
						return 28;
					case 3:
						return 77;
					case 4:
						return e.w * 303785617;
					case 5:
						return 50;
					case 6:
						return 51;
					case 7:
						return 21;
					case 8:
						return 22;
					default:
						throw new IllegalArgumentException("");
				}
			case 8:
				if (arg0 == Class210.aClass210_24) {
					return 113;
				}
		}
		throw new IllegalArgumentException("");
	}

	@OriginalMember(owner = "client!aqw", name = "ajs", descriptor = "(IIJILclient!jagdx/D3DDISPLAYMODE;Lclient!jagdx/D3DPRESENT_PARAMETERS;)Z")
	static boolean method21568(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3, @OriginalArg(4) D3DDISPLAYMODE arg4, @OriginalArg(5) D3DPRESENT_PARAMETERS arg5) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		try {
			if (t.t(IDirect3D.GetAdapterDisplayMode(arg2, arg0, arg4))) {
				return false;
			}
			label76: while (arg3 >= 0) {
				if (arg3 != 1) {
					local5 = arg3;
					for (@Pc(24) int local24 = 0; local24 < anIntArray266.length; local24++) {
						if (IDirect3D.CheckDeviceType(arg2, arg0, arg1, arg4.Format, anIntArray266[local24], true) == 0 && IDirect3D.CheckDeviceFormat(arg2, arg0, arg1, arg4.Format, 1, 1, anIntArray266[local24]) == 0 && (arg3 == 0 || IDirect3D.CheckDeviceMultiSampleType(arg2, arg0, arg1, anIntArray266[local24], true, local5) == 0)) {
							for (@Pc(65) int local65 = 0; local65 < anIntArray265.length; local65++) {
								if (IDirect3D.CheckDeviceFormat(arg2, arg0, arg1, arg4.Format, 2, 1, anIntArray265[local65]) == 0 && IDirect3D.CheckDepthStencilMatch(arg2, arg0, arg1, arg4.Format, anIntArray266[local24], anIntArray265[local65]) == 0 && (arg3 == 0 || IDirect3D.CheckDeviceMultiSampleType(arg2, arg0, arg1, anIntArray265[local24], true, local5) == 0)) {
									local3 = anIntArray266[local24];
									local1 = anIntArray265[local65];
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
			arg5.BackBufferFormat = local3;
			arg5.AutoDepthStencilFormat = local1;
			arg5.MultiSampleType = local5;
			arg5.MultiSampleQuality = 0;
			return true;
		} catch (@Pc(144) Throwable local144) {
			return false;
		}
	}

	@OriginalMember(owner = "client!aqw", name = "ahl", descriptor = "(Lclient!md;)I")
	static int method21570(@OriginalArg(0) Class415 arg0) {
		switch(arg0.anInt4621) {
			case 0:
				return 4;
			case 1:
				return 5;
			case 2:
				return 3;
			case 3:
				return 2;
			case 4:
				return 1;
			case 5:
				return 6;
			default:
				throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!aqw", name = "ahu", descriptor = "(Ljava/awt/Canvas;Lclient!dx;Lclient!ew;Lclient!nh;Lclient!np;Lclient!nt;Lclient!pf;Ljava/lang/Integer;)Lclient!di;")
	static Class102 method21571(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Class235 arg1, @OriginalArg(2) Interface23 arg2, @OriginalArg(3) Interface46 arg3, @OriginalArg(4) Interface47 arg4, @OriginalArg(5) Interface48 arg5, @OriginalArg(6) Class480 arg6, @OriginalArg(7) Integer arg7) {
		@Pc(1) Class102_Sub1_Sub2 local1 = null;
		try {
			@Pc(3) byte local3 = 0;
			@Pc(5) byte local5 = 1;
			@Pc(7) long local7 = IDirect3D.Direct3DCreate();
			@Pc(11) D3DCAPS local11 = new D3DCAPS();
			IDirect3D.GetDeviceCaps(local7, local3, local5, local11);
			if ((local11.RasterCaps & 0x1000000) == 0) {
				throw new RuntimeException("");
			} else if (local11.MaxSimultaneousTextures < 2) {
				throw new RuntimeException("");
			} else if ((local11.TextureOpCaps & 0x2) == 0) {
				throw new RuntimeException("");
			} else if ((local11.TextureOpCaps & 0x8) == 0) {
				throw new RuntimeException("");
			} else if ((local11.TextureOpCaps & 0x40) == 0) {
				throw new RuntimeException("");
			} else if ((local11.TextureOpCaps & 0x200) == 0) {
				throw new RuntimeException("");
			} else if ((local11.TextureOpCaps & 0x2000000) == 0) {
				throw new RuntimeException("");
			} else if ((local11.SrcBlendCaps & local11.DestBlendCaps & 0x10) == 0) {
				throw new RuntimeException("");
			} else if ((local11.SrcBlendCaps & local11.DestBlendCaps & 0x20) == 0) {
				throw new RuntimeException("");
			} else if ((local11.SrcBlendCaps & local11.DestBlendCaps & 0x2) == 0) {
				throw new RuntimeException("");
			} else if (local11.MaxActiveLights > 0 && local11.MaxActiveLights < 2) {
				throw new RuntimeException("");
			} else if (local11.MaxStreams < 5) {
				throw new RuntimeException("");
			} else {
				@Pc(151) D3DPRESENT_PARAMETERS local151 = new D3DPRESENT_PARAMETERS(arg0);
				local151.Windowed = true;
				local151.EnableAutoDepthStencil = true;
				local151.BackBufferWidth = arg0.getWidth();
				local151.BackBufferHeight = arg0.getHeight();
				local151.BackBufferCount = 1;
				local151.PresentationInterval = Integer.MIN_VALUE;
				@Pc(175) D3DDISPLAYMODE local175 = new D3DDISPLAYMODE();
				if (!method21555(local3, local5, local7, arg7, local175, local151)) {
					throw new RuntimeException("");
				}
				@Pc(191) int local191 = 0;
				if ((local11.DevCaps & 0x100000) != 0) {
					local191 |= 0x10;
				}
				@Pc(202) long local202 = 0L;
				try {
					local202 = IDirect3D.CreateDeviceContext(local7, local3, local5, arg0, local191 | 0x40, local151);
				} catch (@Pc(214) m local214) {
					local202 = IDirect3D.CreateDeviceContext(local7, local3, local5, arg0, local191 & 0xFFEFFFFF | 0x20, local151);
				}
				local1 = new Class102_Sub1_Sub2(local3, local5, local7, local202, local175, local151, local11, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
				if (!local1.aHashtable6.containsKey(arg0)) {
					Class6.method23668(arg0, (byte) 111);
					local1.method20680(arg0, new Class108_Sub2_Sub1_Sub1(local1, arg0, arg0.getWidth(), arg0.getHeight(), true), 297269865);
				}
				local1.method20682(arg0, 16418591);
				local1.method21212();
				return local1;
			}
		} catch (@Pc(276) RuntimeException local276) {
			if (local1 != null) {
				local1.method20661();
			}
			throw local276;
		}
	}

	@OriginalMember(owner = "client!aqw", name = "ahn", descriptor = "(Ljava/awt/Canvas;Lclient!dx;Lclient!ew;Lclient!nh;Lclient!np;Lclient!nt;Lclient!pf;Ljava/lang/Integer;)Lclient!di;")
	static Class102 method21572(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Class235 arg1, @OriginalArg(2) Interface23 arg2, @OriginalArg(3) Interface46 arg3, @OriginalArg(4) Interface47 arg4, @OriginalArg(5) Interface48 arg5, @OriginalArg(6) Class480 arg6, @OriginalArg(7) Integer arg7) {
		@Pc(1) Class102_Sub1_Sub2 local1 = null;
		try {
			@Pc(3) byte local3 = 0;
			@Pc(5) byte local5 = 1;
			@Pc(7) long local7 = IDirect3D.Direct3DCreate();
			@Pc(11) D3DCAPS local11 = new D3DCAPS();
			IDirect3D.GetDeviceCaps(local7, local3, local5, local11);
			if ((local11.RasterCaps & 0x1000000) == 0) {
				throw new RuntimeException("");
			} else if (local11.MaxSimultaneousTextures < 2) {
				throw new RuntimeException("");
			} else if ((local11.TextureOpCaps & 0x2) == 0) {
				throw new RuntimeException("");
			} else if ((local11.TextureOpCaps & 0x8) == 0) {
				throw new RuntimeException("");
			} else if ((local11.TextureOpCaps & 0x40) == 0) {
				throw new RuntimeException("");
			} else if ((local11.TextureOpCaps & 0x200) == 0) {
				throw new RuntimeException("");
			} else if ((local11.TextureOpCaps & 0x2000000) == 0) {
				throw new RuntimeException("");
			} else if ((local11.SrcBlendCaps & local11.DestBlendCaps & 0x10) == 0) {
				throw new RuntimeException("");
			} else if ((local11.SrcBlendCaps & local11.DestBlendCaps & 0x20) == 0) {
				throw new RuntimeException("");
			} else if ((local11.SrcBlendCaps & local11.DestBlendCaps & 0x2) == 0) {
				throw new RuntimeException("");
			} else if (local11.MaxActiveLights > 0 && local11.MaxActiveLights < 2) {
				throw new RuntimeException("");
			} else if (local11.MaxStreams < 5) {
				throw new RuntimeException("");
			} else {
				@Pc(151) D3DPRESENT_PARAMETERS local151 = new D3DPRESENT_PARAMETERS(arg0);
				local151.Windowed = true;
				local151.EnableAutoDepthStencil = true;
				local151.BackBufferWidth = arg0.getWidth();
				local151.BackBufferHeight = arg0.getHeight();
				local151.BackBufferCount = 1;
				local151.PresentationInterval = Integer.MIN_VALUE;
				@Pc(175) D3DDISPLAYMODE local175 = new D3DDISPLAYMODE();
				if (!method21555(local3, local5, local7, arg7, local175, local151)) {
					throw new RuntimeException("");
				}
				@Pc(191) int local191 = 0;
				if ((local11.DevCaps & 0x100000) != 0) {
					local191 |= 0x10;
				}
				@Pc(202) long local202 = 0L;
				try {
					local202 = IDirect3D.CreateDeviceContext(local7, local3, local5, arg0, local191 | 0x40, local151);
				} catch (@Pc(214) m local214) {
					local202 = IDirect3D.CreateDeviceContext(local7, local3, local5, arg0, local191 & 0xFFEFFFFF | 0x20, local151);
				}
				local1 = new Class102_Sub1_Sub2(local3, local5, local7, local202, local175, local151, local11, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
				if (!local1.aHashtable6.containsKey(arg0)) {
					Class6.method23668(arg0, (byte) 51);
					local1.method20680(arg0, new Class108_Sub2_Sub1_Sub1(local1, arg0, arg0.getWidth(), arg0.getHeight(), true), -1094433726);
				}
				local1.method20682(arg0, 324498611);
				local1.method21212();
				return local1;
			}
		} catch (@Pc(276) RuntimeException local276) {
			if (local1 != null) {
				local1.method20661();
			}
			throw local276;
		}
	}

	@OriginalMember(owner = "client!aqw", name = "aiu", descriptor = "(Lclient!ma;)I")
	static int method21585(@OriginalArg(0) Class412 arg0) {
		switch(arg0.anInt4615) {
			case 0:
				return 4;
			case 1:
				return 10;
			case 2:
				return 7;
			case 3:
				return 26;
			case 4:
				return 2;
			default:
				throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!aqw", name = "aij", descriptor = "(Lclient!mh;)I")
	static int method21586(@OriginalArg(0) Class417 arg0) {
		switch(arg0.anInt4625) {
			case 0:
				return 0;
			case 1:
				return 3;
			case 2:
				return 1;
			case 3:
				return 2;
			default:
				throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!aqw", name = "aix", descriptor = "(Lclient!mo;)I")
	static int method21587(@OriginalArg(0) Class422 arg0) {
		switch(arg0.anInt4629) {
			case 1:
				return 1;
			case 2:
				return 4;
			case 3:
				return 256;
			case 4:
				return 2;
			case 5:
				return 3;
			default:
				return 0;
		}
	}

	@OriginalMember(owner = "client!aqw", name = "ajy", descriptor = "(Lclient!co;Lclient!dy;)I")
	static int method21591(@OriginalArg(0) Class210 arg0, @OriginalArg(1) Class236 arg1) {
		switch(arg1.anInt3805 * 708282217) {
			case 2:
				if (arg0 == Class210.aClass210_24) {
					return 116;
				}
				break;
			case 3:
				switch(arg0.anInt3601 * 1710327153) {
					case 1:
						return e.x * -490311897;
					case 2:
						return 28;
					case 3:
						return 77;
					case 4:
						return e.w * 303785617;
					case 5:
						return 50;
					case 6:
						return 51;
					case 7:
						return 21;
					case 8:
						return 22;
					default:
						throw new IllegalArgumentException("");
				}
			case 8:
				if (arg0 == Class210.aClass210_24) {
					return 113;
				}
		}
		throw new IllegalArgumentException("");
	}

	@OriginalMember(owner = "client!aqw", name = "ajd", descriptor = "(Lclient!dy;)I")
	static int method21592(@OriginalArg(0) Class236 arg0) {
		if (arg0 == Class236.aClass236_19) {
			return 80;
		} else if (arg0 == Class236.aClass236_22) {
			return 77;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!aqw", name = "ajw", descriptor = "(Lclient!dy;)I")
	static int method21593(@OriginalArg(0) Class236 arg0) {
		if (arg0 == Class236.aClass236_19) {
			return 80;
		} else if (arg0 == Class236.aClass236_22) {
			return 77;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!aqw", name = "ajm", descriptor = "(Lclient!dy;)I")
	static int method21594(@OriginalArg(0) Class236 arg0) {
		if (arg0 == Class236.aClass236_19) {
			return 80;
		} else if (arg0 == Class236.aClass236_22) {
			return 77;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!aqw", name = "ajo", descriptor = "(Lclient!md;)I")
	static int method21595(@OriginalArg(0) Class415 arg0) {
		switch(arg0.anInt4621) {
			case 0:
				return 4;
			case 1:
				return 5;
			case 2:
				return 3;
			case 3:
				return 2;
			case 4:
				return 1;
			case 5:
				return 6;
			default:
				throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!aqw", name = "ajv", descriptor = "(IIJILclient!jagdx/D3DDISPLAYMODE;Lclient!jagdx/D3DPRESENT_PARAMETERS;)Z")
	static boolean method21597(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3, @OriginalArg(4) D3DDISPLAYMODE arg4, @OriginalArg(5) D3DPRESENT_PARAMETERS arg5) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		try {
			if (t.t(IDirect3D.GetAdapterDisplayMode(arg2, arg0, arg4))) {
				return false;
			}
			label76: while (arg3 >= 0) {
				if (arg3 != 1) {
					local5 = arg3;
					for (@Pc(24) int local24 = 0; local24 < anIntArray266.length; local24++) {
						if (IDirect3D.CheckDeviceType(arg2, arg0, arg1, arg4.Format, anIntArray266[local24], true) == 0 && IDirect3D.CheckDeviceFormat(arg2, arg0, arg1, arg4.Format, 1, 1, anIntArray266[local24]) == 0 && (arg3 == 0 || IDirect3D.CheckDeviceMultiSampleType(arg2, arg0, arg1, anIntArray266[local24], true, local5) == 0)) {
							for (@Pc(65) int local65 = 0; local65 < anIntArray265.length; local65++) {
								if (IDirect3D.CheckDeviceFormat(arg2, arg0, arg1, arg4.Format, 2, 1, anIntArray265[local65]) == 0 && IDirect3D.CheckDepthStencilMatch(arg2, arg0, arg1, arg4.Format, anIntArray266[local24], anIntArray265[local65]) == 0 && (arg3 == 0 || IDirect3D.CheckDeviceMultiSampleType(arg2, arg0, arg1, anIntArray265[local24], true, local5) == 0)) {
									local3 = anIntArray266[local24];
									local1 = anIntArray265[local65];
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
			arg5.BackBufferFormat = local3;
			arg5.AutoDepthStencilFormat = local1;
			arg5.MultiSampleType = local5;
			arg5.MultiSampleQuality = 0;
			return true;
		} catch (@Pc(144) Throwable local144) {
			return false;
		}
	}

	@OriginalMember(owner = "client!aqw", name = "<init>", descriptor = "(IIJJLclient!jagdx/D3DDISPLAYMODE;Lclient!jagdx/D3DPRESENT_PARAMETERS;Lclient!jagdx/D3DCAPS;Lclient!dx;Lclient!ew;Lclient!nh;Lclient!np;Lclient!nt;Lclient!pf;I)V")
	Class102_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2, @OriginalArg(3) long arg3, @OriginalArg(4) D3DDISPLAYMODE arg4, @OriginalArg(5) D3DPRESENT_PARAMETERS arg5, @OriginalArg(6) D3DCAPS arg6, @OriginalArg(7) Class235 arg7, @OriginalArg(8) Interface23 arg8, @OriginalArg(9) Interface46 arg9, @OriginalArg(10) Interface47 arg10, @OriginalArg(11) Interface48 arg11, @OriginalArg(12) Class480 arg12, @OriginalArg(13) int arg13) {
		super(arg7, arg8, arg9, arg10, arg11, arg12, arg13, 0);
		try {
			this.anInt3007 = arg0;
			this.anInt3004 = arg1;
			this.aLong170 = arg2;
			this.aLong173 = arg3;
			this.aD3DDISPLAYMODE1 = arg4;
			this.aD3DPRESENT_PARAMETERS2 = arg5;
			this.aD3DCAPS1 = arg6;
			this.aLong169 = D3DLIGHT.Create();
			this.aLong171 = D3DLIGHT.Create();
			this.aLong172 = D3DLIGHT.Create();
			this.anInt2998 = this.aD3DCAPS1.MaxSimultaneousTextures;
			this.anInt2999 = this.aD3DCAPS1.MaxActiveLights > 0 ? this.aD3DCAPS1.MaxActiveLights : 8;
			this.aBoolean540 = (this.aD3DCAPS1.TextureCaps & 0x2) == 0;
			this.aBoolean509 = (this.aD3DCAPS1.TextureCaps & 0x800) != 0;
			this.aBoolean532 = (this.aD3DCAPS1.TextureCaps & 0x2000) != 0;
			this.aBoolean542 = (this.aD3DCAPS1.TextureCaps & 0x8000) != 0;
			this.aBoolean547 = (this.aD3DCAPS1.TextureCaps & 0x10000) != 0;
			this.aBoolean541 = (this.aD3DCAPS1.TextureCaps & 0x4000) != 0;
			this.aBoolean529 = this.aD3DCAPS1.NumSimultaneousRTs > 0;
			this.aBoolean533 = this.aBoolean529;
			this.aBoolean523 = this.aD3DCAPS1.NumSimultaneousRTs > 0;
			this.aBoolean531 = this.anInt2994 > 0 || IDirect3D.CheckDeviceMultiSampleType(this.aLong170, this.anInt3007, this.anInt3004, this.aD3DPRESENT_PARAMETERS2.BackBufferFormat, true, 2) == 0;
			this.aBoolean530 = this.aD3DCAPS1.NumSimultaneousRTs > 0 && this.anInt2994 > 0 || IDirect3D.CheckDeviceMultiSampleType(this.aLong170, this.anInt3007, this.anInt3004, 113, true, 2) == 0;
			this.aBoolean543 = IDirect3D.CheckDeviceFormat(this.aLong170, this.anInt3007, this.anInt3004, this.aD3DPRESENT_PARAMETERS2.BackBufferFormat, 0, 1, method21262('A', 'T', 'O', 'C')) == 0;
			this.aBoolean545 = IDirect3D.CheckDeviceFormat(this.aLong170, this.anInt3007, this.anInt3004, this.aD3DPRESENT_PARAMETERS2.BackBufferFormat, 0, 1, method21262('A', '2', 'M', '1')) == 0;
			this.aBoolean536 = IDirect3D.CheckDeviceFormat(this.aLong170, this.anInt3007, this.anInt3004, this.aD3DPRESENT_PARAMETERS2.BackBufferFormat, 0, 1, method21262('S', 'S', 'A', 'A')) == 0;
			this.aBoolean534 = (this.aD3DCAPS1.PrimitiveMiscCaps & 0x20000) != 0;
			this.aBoolean538 = IDirect3D.CheckDeviceFormat(this.aLong170, this.anInt3007, this.anInt3004, this.aD3DDISPLAYMODE1.Format, 524288, 3, 113) == 0;
			this.aBoolean539 = IDirect3D.CheckDeviceFormat(this.aLong170, this.anInt3007, this.anInt3004, this.aD3DDISPLAYMODE1.Format, 524288, 3, 116) == 0;
			this.aBooleanArray15 = new boolean[this.anInt2998];
			this.aBooleanArray17 = new boolean[this.anInt2998];
			this.aBooleanArray16 = new boolean[this.anInt2998];
			this.aClass396Array1 = new Class396[this.anInt2998];
			this.aBooleanArray14 = new boolean[this.anInt2998];
			this.anIntArray264 = new int[this.anInt2998];
			@Pc(401) Class471 local401 = new Class471();
			local401.method29778(1.0F, -1.0F, 0.5F);
			local401.method29783(0.0F, 0.0F, 0.5F);
			this.aClass487_91 = new Class487();
			this.aClass487_91.method30080(local401);
			IDirect3DDevice.BeginScene(this.aLong173);
		} catch (@Pc(426) Throwable local426) {
			local426.printStackTrace();
			this.method20660(-623303536);
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!aqw", name = "rw", descriptor = "()Z")
	@Override
	public boolean method21287() {
		return (this.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257;
	}

	@OriginalMember(owner = "client!aqw", name = "rr", descriptor = "()Z")
	@Override
	public boolean method21207() {
		return (this.aD3DCAPS1.PixelShaderVersion & 0xFFFF) >= 257;
	}

	@OriginalMember(owner = "client!aqw", name = "rv", descriptor = "(Z)Z")
	@Override
	public boolean method21322(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			return this.aBoolean538;
		} else {
			return this.aBoolean538 && this.aBoolean539;
		}
	}

	@OriginalMember(owner = "client!aqw", name = "uh", descriptor = "()V")
	@Override
	void method21285() {
		if (!this.aBoolean518 || this.aBoolean544) {
			return;
		}
		IDirect3DDevice.LightEnable(this.aLong173, 0, false);
		IDirect3DDevice.LightEnable(this.aLong173, 1, false);
		IDirect3DDevice.SetLight(this.aLong173, 0, this.aLong169);
		IDirect3DDevice.SetLight(this.aLong173, 1, this.aLong171);
		IDirect3DDevice.LightEnable(this.aLong173, 0, true);
		IDirect3DDevice.LightEnable(this.aLong173, 1, true);
		this.aBoolean544 = true;
	}

	@OriginalMember(owner = "client!aqw", name = "afq", descriptor = "(Z)V")
	@Override
	void method21498(@OriginalArg(0) boolean arg0) {
		IDirect3DDevice.f(this.aLong173, 161, arg0);
	}

	@OriginalMember(owner = "client!aqw", name = "abu", descriptor = "(Lclient!co;Lclient!dy;)Z")
	@Override
	boolean method21414(@OriginalArg(0) Class210 arg0, @OriginalArg(1) Class236 arg1) {
		@Pc(3) D3DDISPLAYMODE local3 = new D3DDISPLAYMODE();
		return t.f(IDirect3D.GetAdapterDisplayMode(this.aLong170, this.anInt3007, local3)) && t.f(IDirect3D.CheckDeviceFormat(this.aLong170, this.anInt3007, this.anInt3004, local3.Format, 0, 4, method21553(arg0, arg1)));
	}

	@OriginalMember(owner = "client!aqw", name = "ur", descriptor = "(Lclient!co;IIZ[BII)Lclient!lb;")
	@Override
	Interface34 method21221(@OriginalArg(0) Class210 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		return new Class128_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!aqw", name = "l", descriptor = "()Lclient!cf;")
	@Override
	public Class203 method20656() {
		@Pc(3) D3DADAPTER_IDENTIFIER local3 = new D3DADAPTER_IDENTIFIER();
		IDirect3D.GetAdapterIdentifier(this.aLong170, this.anInt3007, 0, local3);
		return new Class203(local3.VendorID, this.method21245() ? "Direct3D FF" : "Direct3D", 9, local3.Description, local3.DriverVersion, this.method21245());
	}

	@OriginalMember(owner = "client!aqw", name = "aht", descriptor = "(Lclient!oi;)Lclient!aki;")
	Class80_Sub19 method21534(@OriginalArg(0) Interface51 arg0) {
		for (@Pc(5) Class80_Sub19 local5 = (Class80_Sub19) this.aClass8_41.method247(129206984); local5 != null; local5 = (Class80_Sub19) this.aClass8_41.method237(-295583732)) {
			if (local5.anObject5 == arg0) {
				return local5;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!aqw", name = "m", descriptor = "()V")
	@Override
	public void method20659() {
		@Pc(3) long local3 = IDirect3DDevice.CreateEventQuery(this.aLong173);
		if (t.f(IDirect3DEventQuery.Issue(local3))) {
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

	@OriginalMember(owner = "client!aqw", name = "j", descriptor = "()V")
	@Override
	void method20661() {
		super.method20661();
		if (this.aLong169 != 0L) {
			D3DLIGHT.Destroy(this.aLong169);
			this.aLong169 = 0L;
		}
		if (this.aLong171 != 0L) {
			D3DLIGHT.Destroy(this.aLong171);
			this.aLong171 = 0L;
		}
		if (this.aLong172 != 0L) {
			D3DLIGHT.Destroy(this.aLong172);
			this.aLong172 = 0L;
		}
		if (this.aLong173 != 0L) {
			IDirect3DDevice.Destroy(this.aLong173);
			this.aLong173 = 0L;
		}
		if (this.aLong170 != 0L) {
			IUnknown.Release(this.aLong170);
			this.aLong170 = 0L;
		}
	}

	@OriginalMember(owner = "client!aqw", name = "finalize", descriptor = "()V")
	@Override
	protected void finalize() {
		super.finalize();
	}

	@OriginalMember(owner = "client!aqw", name = "xd", descriptor = "()Z")
	@Override
	public boolean method21318() {
		return (this.aD3DCAPS1.PixelShaderVersion & 0xFFFF) >= 257;
	}

	@OriginalMember(owner = "client!aqw", name = "agc", descriptor = "()V")
	@Override
	void method21168() {
		if (!this.aBoolean518) {
			return;
		}
		@Pc(10) float local10 = this.aBoolean519 ? this.aFloat214 : 0.0F;
		@Pc(19) float local19 = this.aBoolean519 ? -this.aFloat216 : 0.0F;
		D3DLIGHT.SetDiffuse(this.aLong169, local10 * this.aFloat208, local10 * this.aFloat209, local10 * this.aFloat210, 0.0F);
		D3DLIGHT.SetDiffuse(this.aLong171, local19 * this.aFloat208, local19 * this.aFloat209, local19 * this.aFloat210, 0.0F);
		this.aBoolean544 = false;
	}

	@OriginalMember(owner = "client!aqw", name = "al", descriptor = "(Ljava/awt/Canvas;II)Lclient!afr;")
	@Override
	Class108_Sub2 method20686(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return new Class108_Sub2_Sub1_Sub1(this, arg0, arg1, arg2, false);
	}

	@OriginalMember(owner = "client!aqw", name = "vc", descriptor = "()V")
	@Override
	void method21231() {
	}

	@OriginalMember(owner = "client!aqw", name = "am", descriptor = "(II)Lclient!de;")
	@Override
	public Interface17 method20689(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class465(this, Class236.aClass236_22, arg0, arg1, 0);
	}

	@OriginalMember(owner = "client!aqw", name = "hy", descriptor = "()V")
	@Override
	void method21019() {
		super.finalize();
	}

	@OriginalMember(owner = "client!aqw", name = "afg", descriptor = "()V")
	@Override
	void method21288() {
		IDirect3DDevice.f(this.aLong173, 27, this.aBoolean514);
	}

	@OriginalMember(owner = "client!aqw", name = "ad", descriptor = "()V")
	@Override
	public void method20894() {
	}

	@OriginalMember(owner = "client!aqw", name = "as", descriptor = "(J)V")
	@Override
	public void method20701(@OriginalArg(0) long arg0) {
	}

	@OriginalMember(owner = "client!aqw", name = "vq", descriptor = "()V")
	@Override
	void method21229() {
		if (this.aBoolean518) {
			IDirect3DDevice.SetRenderState(this.aLong173, 60, this.anInt2949);
		}
	}

	@OriginalMember(owner = "client!aqw", name = "av", descriptor = "()Z")
	@Override
	public boolean method20693() {
		return true;
	}

	@OriginalMember(owner = "client!aqw", name = "ahc", descriptor = "(Lclient!oi;)V")
	void method21536(@OriginalArg(0) Interface51 arg0) {
		if (this.method21534(arg0) == null) {
			this.aClass8_41.method232(new Class80_Sub19(arg0), 1458928848);
		}
	}

	@OriginalMember(owner = "client!aqw", name = "an", descriptor = "()Z")
	@Override
	public boolean method20694() {
		if (this.aBoolean537) {
			return false;
		} else {
			return this.aLongArray14[this.anInt3009] == 0L;
		}
	}

	@OriginalMember(owner = "client!aqw", name = "aie", descriptor = "(Lclient!oj;)V")
	void method21537(@OriginalArg(0) Class128 arg0) {
		IDirect3DDevice.SetTexture(this.aLong173, this.anInt2983, arg0.method11806());
		if (this.aBoolean518 && !this.aBooleanArray16[this.anInt2983]) {
			this.aBooleanArray16[this.anInt2983] = true;
			this.method21360();
			this.method21232();
		}
	}

	@OriginalMember(owner = "client!aqw", name = "ae", descriptor = "()Z")
	@Override
	public boolean method20696() {
		return false;
	}

	@OriginalMember(owner = "client!aqw", name = "agi", descriptor = "()V")
	@Override
	void method21522() {
		if (!this.aBoolean518) {
			return;
		}
		@Pc(10) float local10 = this.aBoolean519 ? this.aFloat214 : 0.0F;
		@Pc(19) float local19 = this.aBoolean519 ? -this.aFloat216 : 0.0F;
		D3DLIGHT.SetDiffuse(this.aLong169, local10 * this.aFloat208, local10 * this.aFloat209, local10 * this.aFloat210, 0.0F);
		D3DLIGHT.SetDiffuse(this.aLong171, local19 * this.aFloat208, local19 * this.aFloat209, local19 * this.aFloat210, 0.0F);
		this.aBoolean544 = false;
	}

	@OriginalMember(owner = "client!aqw", name = "ap", descriptor = "()I")
	@Override
	public int method20697() {
		if (this.aLongArray14[this.anInt3008] == 0L) {
			return -1;
		} else if (t.f(IDirect3DEventQuery.IsSignaled(this.aLongArray14[this.anInt3008]))) {
			return this.anIntArray263[this.anInt3008];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!aqw", name = "ar", descriptor = "()V")
	@Override
	public void method20698() {
		for (@Pc(1) int local1 = 0; local1 < 3; local1++) {
			if (this.aLongArray14[local1] != 0L) {
				IUnknown.Release(this.aLongArray14[local1]);
				this.aLongArray14[local1] = 0L;
			}
		}
		this.anInt3009 = 0;
		this.anInt3008 = 0;
	}

	@OriginalMember(owner = "client!aqw", name = "be", descriptor = "(II)V")
	@Override
	public void method20714(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		IDirect3DDevice.Clear(this.aLong173, arg0, arg1, 1.0F, 0);
	}

	@OriginalMember(owner = "client!aqw", name = "aw", descriptor = "(II[I[I)V")
	@Override
	public void method20702(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.method21538(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!aqw", name = "ahj", descriptor = "(II[I[I)J")
	long method21538(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		if (this.aLongArray14[this.anInt3008] != 0L) {
			IUnknown.Release(this.aLongArray14[this.anInt3008]);
			this.aLongArray14[this.anInt3008] = 0L;
		}
		this.aByteBuffer7.clear();
		IDirect3DSurface.Download(this.aLongArray15[this.anInt3008], 0, 0, arg0, arg1, arg0 * 4, 0, this.aLong168);
		if (++this.anInt3008 >= 3) {
			this.anInt3008 = 0;
		}
		if (arg2 == null) {
			return this.aLong168;
		} else {
			this.aByteBuffer7.asIntBuffer().get(arg2);
			return 0L;
		}
	}

	@OriginalMember(owner = "client!aqw", name = "abn", descriptor = "()V")
	@Override
	void method21408() {
		this.method21247();
		this.method21285();
	}

	@OriginalMember(owner = "client!aqw", name = "bl", descriptor = "()V")
	@Override
	public void method20683() {
		if (this.aLong174 != 0L) {
			IUnknown.Release(this.aLong174);
			this.aLong174 = 0L;
		}
		for (@Pc(13) int local13 = 0; local13 < 3; local13++) {
			if (this.aLongArray14[local13] != 0L) {
				IUnknown.Release(this.aLongArray14[local13]);
				this.aLongArray14[local13] = 0L;
			}
			if (this.aLongArray15[local13] != 0L) {
				IUnknown.Release(this.aLongArray15[local13]);
				this.aLongArray15[local13] = 0L;
			}
		}
		this.anInt3009 = 0;
		this.anInt3008 = 0;
	}

	@OriginalMember(owner = "client!aqw", name = "ak", descriptor = "(III)Lclient!de;")
	@Override
	public Interface17 method21115(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return new Class465(this, Class236.aClass236_22, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!aqw", name = "ack", descriptor = "(Lclient!co;Lclient!dy;II)Lclient!mg;")
	@Override
	Interface40 method21434(@OriginalArg(0) Class210 arg0, @OriginalArg(1) Class236 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return new Class128_Sub2_Sub1(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!aqw", name = "ta", descriptor = "()V")
	@Override
	void method21369() {
		if (this.aClass108_6 != null) {
			IDirect3DDevice.SetViewport(this.aLong173, this.anInt2989 + this.anInt2971, this.anInt2974 + this.anInt2963, this.anInt2972, this.anInt2984, this.aFloat205, this.aFloat206);
		}
	}

	@OriginalMember(owner = "client!aqw", name = "tk", descriptor = "()V")
	@Override
	void method21174() {
		IDirect3DDevice.SetScissorRect(this.aLong173, this.anInt2989 + this.anInt2979, this.anInt2974 + this.anInt2995, this.anInt2957, this.anInt2964);
	}

	@OriginalMember(owner = "client!aqw", name = "aim", descriptor = "(Lclient!oi;)V")
	void method21540(@OriginalArg(0) Interface51 arg0) {
		@Pc(3) Class80_Sub19 local3 = this.method21534(arg0);
		if (local3 != null) {
			local3.method24395((byte) 3);
		}
	}

	@OriginalMember(owner = "client!aqw", name = "ajf", descriptor = "(Ljava/lang/String;)[B")
	byte[] method21541(@OriginalArg(0) String arg0) {
		return this.method21143("dx", arg0);
	}

	@OriginalMember(owner = "client!aqw", name = "sw", descriptor = "(Lclient!pm;Lclient!pm;Lclient!pm;)V")
	@Override
	public void method21145(@OriginalArg(0) Class487 arg0, @OriginalArg(1) Class487 arg1, @OriginalArg(2) Class487 arg2) {
		IDirect3DDevice.SetTransform(this.aLong173, 256, arg0.aFloatArray114);
		IDirect3DDevice.SetTransform(this.aLong173, 2, arg1.aFloatArray114);
		IDirect3DDevice.SetTransform(this.aLong173, 3, arg2.aFloatArray114);
	}

	@OriginalMember(owner = "client!aqw", name = "tp", descriptor = "(Lclient!pm;)V")
	@Override
	public void method21243(@OriginalArg(0) Class487 arg0) {
		arg0.method30078(this.aClass487_91);
	}

	@OriginalMember(owner = "client!aqw", name = "xv", descriptor = "(Lclient!pm;Lclient!pm;Lclient!pm;)V")
	@Override
	public void method21268(@OriginalArg(0) Class487 arg0, @OriginalArg(1) Class487 arg1, @OriginalArg(2) Class487 arg2) {
		IDirect3DDevice.SetTransform(this.aLong173, 256, arg0.aFloatArray114);
		IDirect3DDevice.SetTransform(this.aLong173, 2, arg1.aFloatArray114);
		IDirect3DDevice.SetTransform(this.aLong173, 3, arg2.aFloatArray114);
	}

	@OriginalMember(owner = "client!aqw", name = "abg", descriptor = "()V")
	@Override
	void method21274() {
		this.method21247();
		this.method21285();
	}

	@OriginalMember(owner = "client!aqw", name = "yb", descriptor = "()V")
	@Override
	void method21341() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2998; local1++) {
			IDirect3DDevice.SetSamplerState(this.aLong173, local1, 7, 2);
			IDirect3DDevice.SetSamplerState(this.aLong173, local1, 6, 2);
			IDirect3DDevice.SetSamplerState(this.aLong173, local1, 5, 2);
			IDirect3DDevice.SetSamplerState(this.aLong173, local1, 1, 1);
			IDirect3DDevice.SetSamplerState(this.aLong173, local1, 2, 1);
			this.aClass396Array1[local1] = Class396.aClass396_5;
			@Pc(48) boolean[] local48 = this.aBooleanArray15;
			this.aBooleanArray17[local1] = true;
			local48[local1] = true;
			this.aBooleanArray14[local1] = false;
			this.anIntArray264[local1] = 0;
		}
		IDirect3DDevice.SetTextureStageState(this.aLong173, 0, 6, 1);
		IDirect3DDevice.SetRenderState(this.aLong173, 9, 2);
		IDirect3DDevice.SetRenderState(this.aLong173, 23, 4);
		IDirect3DDevice.SetRenderState(this.aLong173, 25, 5);
		IDirect3DDevice.SetRenderState(this.aLong173, 24, 0);
		IDirect3DDevice.f(this.aLong173, 206, this.aBoolean534);
		IDirect3DDevice.SetRenderState(this.aLong173, 181, 0);
		this.method21549();
		IDirect3DDevice.SetRenderState(this.aLong173, 147, 1);
		IDirect3DDevice.SetRenderState(this.aLong173, 145, 1);
		IDirect3DDevice.t(this.aLong173, 38, 0.95F);
		IDirect3DDevice.SetRenderState(this.aLong173, 35, 3);
		IDirect3DDevice.t(this.aLong173, 154, 1.0F);
		D3DLIGHT.SetType(this.aLong169, 3);
		D3DLIGHT.SetType(this.aLong171, 3);
		D3DLIGHT.SetType(this.aLong172, 1);
		this.aBoolean544 = false;
		super.method21148();
	}

	@OriginalMember(owner = "client!aqw", name = "afn", descriptor = "(Z)Lclient!lx;")
	@Override
	Interface38 method21503(@OriginalArg(0) boolean arg0) {
		return new Class455(this, arg0);
	}

	@OriginalMember(owner = "client!aqw", name = "wz", descriptor = "(Lclient!mv;Lclient!md;IIII)V")
	@Override
	void method21258(@OriginalArg(0) Interface44 arg0, @OriginalArg(1) Class415 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (this.aClass114_Sub2_2 != null) {
			this.aClass114_Sub2_2.method8639();
		}
		IDirect3DDevice.DrawIndexedPrimitiveIB(this.aLong173, ((Class459) arg0).aLong383, 4, 0, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!aqw", name = "uj", descriptor = "()V")
	@Override
	void method21199() {
		if (this.aBoolean518) {
			D3DLIGHT.SetDirection(this.aLong169, -this.aFloatArray68[0], -this.aFloatArray68[1], -this.aFloatArray68[2]);
			D3DLIGHT.SetDirection(this.aLong171, -this.aFloatArray67[0], -this.aFloatArray67[1], -this.aFloatArray67[2]);
			this.aBoolean544 = false;
		}
	}

	@OriginalMember(owner = "client!aqw", name = "up", descriptor = "()V")
	@Override
	void method21201() {
		this.method21247();
		this.method21285();
	}

	@OriginalMember(owner = "client!aqw", name = "ug", descriptor = "()V")
	@Override
	void method21157() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt2978; local1++) {
			@Pc(10) Class80_Sub12 local10 = this.aClass80_Sub12Array19[local1];
			@Pc(14) int local14 = local1 + 2;
			@Pc(18) int local18 = local10.method13953((byte) 79);
			@Pc(24) float local24 = local10.method13954(1494015611) / 255.0F;
			D3DLIGHT.SetPosition(this.aLong172, (float) local10.method13949((byte) 0), (float) local10.method13950(-1791816396), (float) local10.method13970(1590496498));
			D3DLIGHT.SetDiffuse(this.aLong172, (float) (local18 >> 16 & 0xFF) * local24, (float) (local18 >> 8 & 0xFF) * local24, (float) (local18 & 0xFF) * local24, 0.0F);
			D3DLIGHT.SetAttenuation(this.aLong172, 0.0F, 0.0F, 1.0F / (float) (local10.method13952(-432544427) * local10.method13952(-432544427)));
			D3DLIGHT.SetRange(this.aLong172, (float) local10.method13952(-432544427));
			IDirect3DDevice.SetLight(this.aLong173, local14, this.aLong172);
			IDirect3DDevice.LightEnable(this.aLong173, local14, true);
		}
		while (local1 < this.anInt2977) {
			IDirect3DDevice.LightEnable(this.aLong173, local1 + 2, false);
			local1++;
		}
	}

	@OriginalMember(owner = "client!aqw", name = "ul", descriptor = "(Lclient!co;Lclient!dy;)Z")
	@Override
	boolean method21204(@OriginalArg(0) Class210 arg0, @OriginalArg(1) Class236 arg1) {
		@Pc(3) D3DDISPLAYMODE local3 = new D3DDISPLAYMODE();
		return t.f(IDirect3D.GetAdapterDisplayMode(this.aLong170, this.anInt3007, local3)) && t.f(IDirect3D.CheckDeviceFormat(this.aLong170, this.anInt3007, this.anInt3004, local3.Format, 0, 3, method21553(arg0, arg1)));
	}

	@OriginalMember(owner = "client!aqw", name = "un", descriptor = "(Lclient!co;Lclient!dy;)Z")
	@Override
	boolean method21205(@OriginalArg(0) Class210 arg0, @OriginalArg(1) Class236 arg1) {
		@Pc(3) D3DDISPLAYMODE local3 = new D3DDISPLAYMODE();
		return t.f(IDirect3D.GetAdapterDisplayMode(this.aLong170, this.anInt3007, local3)) && t.f(IDirect3D.CheckDeviceFormat(this.aLong170, this.anInt3007, this.anInt3004, local3.Format, 0, 4, method21553(arg0, arg1)));
	}

	@OriginalMember(owner = "client!aqw", name = "uo", descriptor = "(Lclient!co;Lclient!dy;II)Lclient!lb;")
	@Override
	Interface34 method21209(@OriginalArg(0) Class210 arg0, @OriginalArg(1) Class236 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return new Class128_Sub2(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!aqw", name = "uu", descriptor = "(IIZ[III)Lclient!lb;")
	@Override
	Interface34 method21304(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return new Class128_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!aqw", name = "dq", descriptor = "(Lclient!df;Lclient!df;FLclient!df;)Lclient!df;")
	@Override
	public Class106 method20854(@OriginalArg(0) Class106 arg0, @OriginalArg(1) Class106 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class106 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!aqw", name = "sr", descriptor = "()V")
	@Override
	void method21294() {
		this.method20683();
		for (@Pc(7) Class80_Sub19 local7 = (Class80_Sub19) this.aClass8_41.method247(129206984); local7 != null; local7 = (Class80_Sub19) this.aClass8_41.method237(-1944702918)) {
			@Pc(13) Interface51 local13 = (Interface51) local7.anObject5;
			local13.method24046();
		}
		super.method21294();
	}

	@OriginalMember(owner = "client!aqw", name = "ui", descriptor = "(Lclient!co;Lclient!dy;II)Lclient!mg;")
	@Override
	Interface40 method21215(@OriginalArg(0) Class210 arg0, @OriginalArg(1) Class236 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return new Class128_Sub2_Sub1(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!aqw", name = "aci", descriptor = "(IIZ[III)Lclient!lb;")
	@Override
	Interface34 method21519(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return new Class128_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!aqw", name = "ahe", descriptor = "(Lclient!oj;)V")
	void method21543(@OriginalArg(0) Class128 arg0) {
		IDirect3DDevice.SetTexture(this.aLong173, this.anInt2983, arg0.method11806());
		if (this.aBoolean518 && !this.aBooleanArray16[this.anInt2983]) {
			this.aBooleanArray16[this.anInt2983] = true;
			this.method21360();
			this.method21232();
		}
	}

	@OriginalMember(owner = "client!aqw", name = "ahv", descriptor = "(Lclient!aiy;)V")
	void method21544(@OriginalArg(0) Class128_Sub2 arg0) {
		this.method21543(arg0);
		if (this.aBooleanArray15[this.anInt2983] != arg0.aBoolean245) {
			IDirect3DDevice.SetSamplerState(this.aLong173, this.anInt2983, 1, arg0.aBoolean245 ? 1 : 3);
			this.aBooleanArray15[this.anInt2983] = arg0.aBoolean245;
		}
		if (this.aBooleanArray17[this.anInt2983] != arg0.aBoolean246) {
			IDirect3DDevice.SetSamplerState(this.aLong173, this.anInt2983, 2, arg0.aBoolean246 ? 1 : 3);
			this.aBooleanArray17[this.anInt2983] = arg0.aBoolean246;
		}
	}

	@OriginalMember(owner = "client!aqw", name = "uw", descriptor = "()V")
	@Override
	public void method21162() {
		if (this.aBooleanArray16[this.anInt2983]) {
			this.aBooleanArray16[this.anInt2983] = false;
			IDirect3DDevice.SetTexture(this.aLong173, this.anInt2983, 0L);
			this.method21360();
			this.method21232();
		}
	}

	@OriginalMember(owner = "client!aqw", name = "vh", descriptor = "()V")
	@Override
	void method21230() {
		if (this.aLong175 != 0L || this.aClass422Array3[this.anInt2983] == Class422.aClass422_2) {
			IDirect3DDevice.SetTextureStageState(this.aLong173, this.anInt2983, 24, 0);
			this.anIntArray264[this.anInt2983] = 0;
			return;
		}
		if (this.aClass422Array3[this.anInt2983] == Class422.aClass422_4) {
			IDirect3DDevice.SetTransform(this.aLong173, this.anInt2983 + 16, this.aClass487Array6[this.anInt2983].method30108(this.aFloatArray70));
		} else {
			IDirect3DDevice.SetTransform(this.aLong173, this.anInt2983 + 16, this.aClass487Array6[this.anInt2983].method30102(this.aFloatArray70));
		}
		@Pc(58) int local58 = method21550(this.aClass422Array3[this.anInt2983]);
		if (local58 != this.anIntArray264[this.anInt2983]) {
			IDirect3DDevice.SetTextureStageState(this.aLong173, this.anInt2983, 24, local58);
			this.anIntArray264[this.anInt2983] = local58;
		}
	}

	@OriginalMember(owner = "client!aqw", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method20662(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3003; local1++) {
			IUnknown.Release(this.aLongArray16[local1]);
		}
		this.anInt3003 = 0;
		super.method20662(arg0);
	}

	@OriginalMember(owner = "client!aqw", name = "vk", descriptor = "()V")
	@Override
	void method21232() {
		if (this.aBoolean518) {
			@Pc(17) int local17 = this.aBooleanArray16[this.anInt2983] ? method21548(this.aClass412Array5[this.anInt2983]) : 1;
			IDirect3DDevice.SetTextureStageState(this.aLong173, this.anInt2983, 1, local17);
		}
	}

	@OriginalMember(owner = "client!aqw", name = "vw", descriptor = "()V")
	@Override
	void method21360() {
		if (this.aBoolean518) {
			@Pc(17) int local17 = this.aBooleanArray16[this.anInt2983] ? method21548(this.aClass412Array6[this.anInt2983]) : 1;
			IDirect3DDevice.SetTextureStageState(this.aLong173, this.anInt2983, 4, local17);
		}
	}

	@OriginalMember(owner = "client!aqw", name = "acn", descriptor = "(Lclient!co;Lclient!dy;II)Lclient!lb;")
	@Override
	Interface34 method21387(@OriginalArg(0) Class210 arg0, @OriginalArg(1) Class236 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return new Class128_Sub2(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!aqw", name = "aiw", descriptor = "(J)V")
	void method21547(@OriginalArg(0) long arg0) {
		IDirect3DDevice.SetPixelShader(this.aLong173, arg0);
	}

	@OriginalMember(owner = "client!aqw", name = "ago", descriptor = "([Lclient!lf;)Lclient!ld;")
	@Override
	Class135 method21530(@OriginalArg(0) Class397[] arg0) {
		return new Class135_Sub2(this, arg0);
	}

	@OriginalMember(owner = "client!aqw", name = "aew", descriptor = "()V")
	@Override
	void method21471() {
		if (this.aBoolean518) {
			@Pc(17) int local17 = this.aBooleanArray16[this.anInt2983] ? method21548(this.aClass412Array5[this.anInt2983]) : 1;
			IDirect3DDevice.SetTextureStageState(this.aLong173, this.anInt2983, 1, local17);
		}
	}

	@OriginalMember(owner = "client!aqw", name = "et", descriptor = "()Lclient!cf;")
	@Override
	public Class203 method20797() {
		@Pc(3) D3DADAPTER_IDENTIFIER local3 = new D3DADAPTER_IDENTIFIER();
		IDirect3D.GetAdapterIdentifier(this.aLong170, this.anInt3007, 0, local3);
		return new Class203(local3.VendorID, this.method21245() ? "Direct3D FF" : "Direct3D", 9, local3.Description, local3.DriverVersion, this.method21245());
	}

	@OriginalMember(owner = "client!aqw", name = "vp", descriptor = "()V")
	@Override
	void method21238() {
		IDirect3DDevice.f(this.aLong173, 15, this.aBoolean528);
		IDirect3DDevice.SetRenderState(this.aLong173, 24, this.aByte76 & 0xFF);
		if (this.aD3DPRESENT_PARAMETERS2.MultiSampleType <= 0) {
			return;
		}
		if (this.aBoolean528 && this.aByte76 != 0) {
			if (this.aBoolean536) {
				IDirect3DDevice.SetRenderState(this.aLong173, 181, method21262('S', 'S', 'A', 'A'));
			} else if (this.aBoolean543) {
				IDirect3DDevice.SetRenderState(this.aLong173, 181, method21262('A', 'T', 'O', 'C'));
			} else if (this.aBoolean545) {
				IDirect3DDevice.SetRenderState(this.aLong173, 154, method21262('A', '2', 'M', '1'));
			}
		} else if (this.aBoolean536 || this.aBoolean543) {
			IDirect3DDevice.SetRenderState(this.aLong173, 181, 0);
		} else if (this.aBoolean545) {
			IDirect3DDevice.t(this.aLong173, 154, 1.0F);
		}
	}

	@OriginalMember(owner = "client!aqw", name = "va", descriptor = "()V")
	@Override
	void method21464() {
		switch(this.aClass428_3.anInt4637) {
			case 0:
				IDirect3DDevice.SetRenderState(this.aLong173, 19, 2);
				IDirect3DDevice.SetRenderState(this.aLong173, 20, 2);
				break;
			case 1:
				IDirect3DDevice.SetRenderState(this.aLong173, 19, 5);
				IDirect3DDevice.SetRenderState(this.aLong173, 20, 6);
				break;
			case 2:
				IDirect3DDevice.SetRenderState(this.aLong173, 19, 9);
				IDirect3DDevice.SetRenderState(this.aLong173, 20, 2);
				break;
			case 3:
				IDirect3DDevice.SetRenderState(this.aLong173, 19, 2);
				IDirect3DDevice.SetRenderState(this.aLong173, 20, 1);
		}
		switch(this.anInt2992) {
			case 0:
				IDirect3DDevice.SetRenderState(this.aLong173, 207, 1);
				IDirect3DDevice.SetRenderState(this.aLong173, 208, 1);
				break;
			case 1:
				IDirect3DDevice.SetRenderState(this.aLong173, 207, 2);
				IDirect3DDevice.SetRenderState(this.aLong173, 208, 1);
				break;
			case 2:
				IDirect3DDevice.SetRenderState(this.aLong173, 207, 2);
				IDirect3DDevice.SetRenderState(this.aLong173, 208, 2);
				break;
			case 3:
				IDirect3DDevice.SetRenderState(this.aLong173, 207, 1);
				IDirect3DDevice.SetRenderState(this.aLong173, 208, 2);
		}
	}

	@OriginalMember(owner = "client!aqw", name = "ud", descriptor = "(Lclient!co;IIZ[FII)Lclient!lb;")
	@Override
	Interface34 method21211(@OriginalArg(0) Class210 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		return new Class128_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!aqw", name = "ahx", descriptor = "()V")
	void method21549() {
		IDirect3DDevice.SetRenderState(this.aLong173, 22, this.anInt2993);
	}

	@OriginalMember(owner = "client!aqw", name = "wl", descriptor = "()V")
	@Override
	void method21244() {
		if (this.aBoolean518) {
			IDirect3DDevice.f(this.aLong173, 28, this.aBoolean526 && this.aBoolean522 && this.anInt2985 >= 0);
		}
	}

	@OriginalMember(owner = "client!aqw", name = "vl", descriptor = "()V")
	@Override
	void method21295() {
		this.aFloat218 = this.aFloat202 - (float) this.anInt2990;
		this.aFloat217 = this.aFloat218 - (float) this.anInt2985;
		if (this.aFloat217 < this.aFloat215) {
			this.aFloat217 = this.aFloat215;
		}
		if (this.aBoolean518) {
			IDirect3DDevice.t(this.aLong173, 36, this.aFloat217);
			IDirect3DDevice.t(this.aLong173, 37, this.aFloat218);
			IDirect3DDevice.SetRenderState(this.aLong173, 34, this.anInt2965);
		}
	}

	@OriginalMember(owner = "client!aqw", name = "wr", descriptor = "(Z)V")
	@Override
	void method21323(@OriginalArg(0) boolean arg0) {
		IDirect3DDevice.f(this.aLong173, 161, arg0);
	}

	@OriginalMember(owner = "client!aqw", name = "wh", descriptor = "(Z)Lclient!mv;")
	@Override
	Interface44 method21246(@OriginalArg(0) boolean arg0) {
		return new Class459(this, Class236.aClass236_19, arg0);
	}

	@OriginalMember(owner = "client!aqw", name = "wk", descriptor = "([Lclient!lf;)Lclient!ld;")
	@Override
	Class135 method21248(@OriginalArg(0) Class397[] arg0) {
		return new Class135_Sub2(this, arg0);
	}

	@OriginalMember(owner = "client!aqw", name = "wu", descriptor = "(Lclient!ld;)V")
	@Override
	public void method21158(@OriginalArg(0) Class135 arg0) {
		@Pc(2) Class135_Sub2 local2 = (Class135_Sub2) arg0;
		IDirect3DDevice.SetVertexDeclaration(this.aLong173, local2.aLong44);
	}

	@OriginalMember(owner = "client!aqw", name = "wp", descriptor = "(ILclient!lx;)V")
	@Override
	public void method21250(@OriginalArg(0) int arg0, @OriginalArg(1) Interface38 arg1) {
		@Pc(2) Class455 local2 = (Class455) arg1;
		IDirect3DDevice.SetStreamSource(this.aLong173, arg0, local2.aLong382, 0, local2.method29332());
	}

	@OriginalMember(owner = "client!aqw", name = "aco", descriptor = "(Lclient!co;IIZ[BII)Lclient!lb;")
	@Override
	Interface34 method21273(@OriginalArg(0) Class210 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		return new Class128_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!aqw", name = "wq", descriptor = "(Lclient!md;II)V")
	@Override
	public void method21257(@OriginalArg(0) Class415 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass114_Sub2_2 != null) {
			this.aClass114_Sub2_2.method8639();
		}
		IDirect3DDevice.DrawPrimitive(this.aLong173, method21570(arg0), arg1, arg2);
	}

	@OriginalMember(owner = "client!aqw", name = "aha", descriptor = "(Lclient!oi;)V")
	void method21551(@OriginalArg(0) Interface51 arg0) {
		@Pc(3) Class80_Sub19 local3 = this.method21534(arg0);
		if (local3 != null) {
			local3.method24395((byte) 15);
		}
	}

	@OriginalMember(owner = "client!aqw", name = "wf", descriptor = "(Lclient!md;IIII)V")
	@Override
	public void method21373(@OriginalArg(0) Class415 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.aClass114_Sub2_2 != null) {
			this.aClass114_Sub2_2.method8639();
		}
		IDirect3DDevice.DrawIndexedPrimitive(this.aLong173, method21570(arg0), 0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!aqw", name = "ahf", descriptor = "(Ljava/lang/String;)[B")
	byte[] method21552(@OriginalArg(0) String arg0) {
		return this.method21143("dx", arg0);
	}

	@OriginalMember(owner = "client!aqw", name = "sg", descriptor = "(Ljava/lang/String;)Lclient!hb;")
	@Override
	public Class113 method21142(@OriginalArg(0) String arg0) {
		@Pc(3) byte[] local3 = this.method21552(arg0);
		if (local3 == null) {
			return null;
		} else {
			@Pc(11) Class324 local11 = this.method21144(local3);
			return new Class113_Sub1(this, local11);
		}
	}

	@OriginalMember(owner = "client!aqw", name = "na", descriptor = "(IILclient!co;Lclient!dy;I)Lclient!do;")
	@Override
	public Interface18 method21126(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class210 arg2, @OriginalArg(3) Class236 arg3, @OriginalArg(4) int arg4) {
		return new Class470(this, arg2, arg3, arg0, arg1, arg4);
	}

	@OriginalMember(owner = "client!aqw", name = "eu", descriptor = "()Lclient!cf;")
	@Override
	public Class203 method20798() {
		@Pc(3) D3DADAPTER_IDENTIFIER local3 = new D3DADAPTER_IDENTIFIER();
		IDirect3D.GetAdapterIdentifier(this.aLong170, this.anInt3007, 0, local3);
		return new Class203(local3.VendorID, this.method21245() ? "Direct3D FF" : "Direct3D", 9, local3.Description, local3.DriverVersion, this.method21245());
	}

	@OriginalMember(owner = "client!aqw", name = "em", descriptor = "(Z)V")
	@Override
	public void method20795(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!aqw", name = "ahs", descriptor = "(J)V")
	synchronized void method21556(@OriginalArg(0) long arg0) {
		if (this.anInt3003 == this.anInt3005) {
			this.anInt3005 *= 2;
			@Pc(14) long[] local14 = new long[this.anInt3005];
			System.arraycopy(this.aLongArray16, 0, local14, 0, this.anInt3003);
			this.aLongArray16 = local14;
		}
		this.aLongArray16[this.anInt3003] = arg0;
		this.anInt3003++;
	}

	@OriginalMember(owner = "client!aqw", name = "wm", descriptor = "(I)V")
	@Override
	void method21261(@OriginalArg(0) int arg0) {
		if (!this.aBoolean546) {
			@Pc(10) int local10 = (arg0 & 0x2) == 0 ? 3 : 2;
			IDirect3DDevice.SetRenderState(this.aLong173, 8, local10);
		}
	}

	@OriginalMember(owner = "client!aqw", name = "y", descriptor = "()Ljava/lang/String;")
	@Override
	public String method21048() {
		@Pc(1) String local1 = "Caps: 4:";
		@Pc(3) String local3 = ":";
		@Pc(15) String local15 = local1 + this.anInt2994 + local3;
		@Pc(27) String local27 = local15 + this.anInt2998 + local3;
		@Pc(39) String local39 = local27 + this.anInt2999 + local3;
		@Pc(55) String local55 = local39 + (this.aBoolean531 ? 1 : 0) + local3;
		@Pc(71) String local71 = local55 + (this.method21287() ? 1 : 0) + local3;
		@Pc(87) String local87 = local71 + (this.method21207() ? 1 : 0) + local3;
		@Pc(103) String local103 = local87 + (this.aBoolean532 ? 1 : 0) + local3;
		@Pc(119) String local119 = local103 + (this.aBoolean509 ? 1 : 0) + local3;
		@Pc(135) String local135 = local119 + (this.aBoolean540 ? 1 : 0) + local3;
		@Pc(151) String local151 = local135 + (this.aBoolean542 ? 1 : 0) + local3;
		@Pc(167) String local167 = local151 + (this.aBoolean547 ? 1 : 0) + local3;
		@Pc(183) String local183 = local167 + (this.aBoolean541 ? 1 : 0) + local3;
		@Pc(199) String local199 = local183 + (this.aBoolean529 ? 1 : 0) + local3;
		@Pc(215) String local215 = local199 + (this.aBoolean523 ? 1 : 0) + local3;
		@Pc(231) String local231 = local215 + (this.aBoolean530 ? 1 : 0) + local3;
		@Pc(247) String local247 = local231 + (this.aBoolean543 ? 1 : 0) + local3;
		@Pc(263) String local263 = local247 + (this.aBoolean545 ? 1 : 0) + local3;
		@Pc(279) String local279 = local263 + (this.aBoolean536 ? 1 : 0) + local3;
		@Pc(295) String local295 = local279 + (this.aBoolean534 ? 1 : 0) + local3;
		@Pc(311) String local311 = local295 + (this.aBoolean538 ? 1 : 0) + local3;
		return local311 + (this.aBoolean539 ? 1 : 0);
	}

	@OriginalMember(owner = "client!aqw", name = "xl", descriptor = "(Lclient!pm;Lclient!pm;Lclient!pm;)V")
	@Override
	public void method21301(@OriginalArg(0) Class487 arg0, @OriginalArg(1) Class487 arg1, @OriginalArg(2) Class487 arg2) {
		IDirect3DDevice.SetTransform(this.aLong173, 256, arg0.aFloatArray114);
		IDirect3DDevice.SetTransform(this.aLong173, 2, arg1.aFloatArray114);
		IDirect3DDevice.SetTransform(this.aLong173, 3, arg2.aFloatArray114);
	}

	@OriginalMember(owner = "client!aqw", name = "aem", descriptor = "(I)V")
	@Override
	void method21481(@OriginalArg(0) int arg0) {
		IDirect3DDevice.SetRenderState(this.aLong173, 168, arg0);
	}

	@OriginalMember(owner = "client!aqw", name = "aip", descriptor = "(J)V")
	void method21557(@OriginalArg(0) long arg0) {
		this.aLong175 = arg0;
		IDirect3DDevice.SetVertexShader(this.aLong173, arg0);
	}

	@OriginalMember(owner = "client!aqw", name = "es", descriptor = "()Lclient!cf;")
	@Override
	public Class203 method20799() {
		@Pc(3) D3DADAPTER_IDENTIFIER local3 = new D3DADAPTER_IDENTIFIER();
		IDirect3D.GetAdapterIdentifier(this.aLong170, this.anInt3007, 0, local3);
		return new Class203(local3.VendorID, this.method21245() ? "Direct3D FF" : "Direct3D", 9, local3.Description, local3.DriverVersion, this.method21245());
	}

	@OriginalMember(owner = "client!aqw", name = "er", descriptor = "(II)V")
	@Override
	void method20800(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub2 {
		if (this.aBoolean537) {
			if (!this.method21596(this.aClass108_Sub2_6.method24036(), this.aClass108_Sub2_6.method24037())) {
				return;
			}
			((Class108_Sub2_Sub1_Sub1) this.aClass108_Sub2_6).method11173();
		} else {
			IDirect3DDevice.EndScene(this.aLong173);
		}
		@Pc(25) int local25 = this.aClass108_Sub2_6.method24053();
		if (t.t(local25)) {
			this.aBoolean537 = true;
			this.aClass108_Sub2_6.method24046();
		} else {
			IDirect3DDevice.BeginScene(this.aLong173);
			if (this.anInterface23_7 != null) {
				this.anInterface23_7.method7758(-1154884668);
			}
		}
	}

	@OriginalMember(owner = "client!aqw", name = "en", descriptor = "(II)V")
	@Override
	void method21074(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub2 {
		if (this.aBoolean537) {
			if (!this.method21596(this.aClass108_Sub2_6.method24036(), this.aClass108_Sub2_6.method24037())) {
				return;
			}
			((Class108_Sub2_Sub1_Sub1) this.aClass108_Sub2_6).method11173();
		} else {
			IDirect3DDevice.EndScene(this.aLong173);
		}
		@Pc(25) int local25 = this.aClass108_Sub2_6.method24053();
		if (t.t(local25)) {
			this.aBoolean537 = true;
			this.aClass108_Sub2_6.method24046();
		} else {
			IDirect3DDevice.BeginScene(this.aLong173);
			if (this.anInterface23_7 != null) {
				this.anInterface23_7.method7758(1020244625);
			}
		}
	}

	@OriginalMember(owner = "client!aqw", name = "ex", descriptor = "(II)V")
	@Override
	void method20802(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub2 {
		if (this.aBoolean537) {
			if (!this.method21596(this.aClass108_Sub2_6.method24036(), this.aClass108_Sub2_6.method24037())) {
				return;
			}
			((Class108_Sub2_Sub1_Sub1) this.aClass108_Sub2_6).method11173();
		} else {
			IDirect3DDevice.EndScene(this.aLong173);
		}
		@Pc(25) int local25 = this.aClass108_Sub2_6.method24053();
		if (t.t(local25)) {
			this.aBoolean537 = true;
			this.aClass108_Sub2_6.method24046();
		} else {
			IDirect3DDevice.BeginScene(this.aLong173);
			if (this.anInterface23_7 != null) {
				this.anInterface23_7.method7758(-1019833909);
			}
		}
	}

	@OriginalMember(owner = "client!aqw", name = "eg", descriptor = "()V")
	@Override
	public void method20803() {
		@Pc(3) long local3 = IDirect3DDevice.CreateEventQuery(this.aLong173);
		if (t.f(IDirect3DEventQuery.Issue(local3))) {
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

	@OriginalMember(owner = "client!aqw", name = "vn", descriptor = "(I)V")
	@Override
	void method21237(@OriginalArg(0) int arg0) {
		IDirect3DDevice.SetRenderState(this.aLong173, 168, arg0);
	}

	@OriginalMember(owner = "client!aqw", name = "ei", descriptor = "()V")
	@Override
	public void method20805() {
		@Pc(3) long local3 = IDirect3DDevice.CreateEventQuery(this.aLong173);
		if (t.f(IDirect3DEventQuery.Issue(local3))) {
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

	@OriginalMember(owner = "client!aqw", name = "ej", descriptor = "()V")
	@Override
	public void method20806() {
		@Pc(3) long local3 = IDirect3DDevice.CreateEventQuery(this.aLong173);
		if (t.f(IDirect3DEventQuery.Issue(local3))) {
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

	@OriginalMember(owner = "client!aqw", name = "eq", descriptor = "()V")
	@Override
	void method20807() {
		super.method20661();
		if (this.aLong169 != 0L) {
			D3DLIGHT.Destroy(this.aLong169);
			this.aLong169 = 0L;
		}
		if (this.aLong171 != 0L) {
			D3DLIGHT.Destroy(this.aLong171);
			this.aLong171 = 0L;
		}
		if (this.aLong172 != 0L) {
			D3DLIGHT.Destroy(this.aLong172);
			this.aLong172 = 0L;
		}
		if (this.aLong173 != 0L) {
			IDirect3DDevice.Destroy(this.aLong173);
			this.aLong173 = 0L;
		}
		if (this.aLong170 != 0L) {
			IUnknown.Release(this.aLong170);
			this.aLong170 = 0L;
		}
	}

	@OriginalMember(owner = "client!aqw", name = "fe", descriptor = "()V")
	@Override
	void method20808() {
		super.method20661();
		if (this.aLong169 != 0L) {
			D3DLIGHT.Destroy(this.aLong169);
			this.aLong169 = 0L;
		}
		if (this.aLong171 != 0L) {
			D3DLIGHT.Destroy(this.aLong171);
			this.aLong171 = 0L;
		}
		if (this.aLong172 != 0L) {
			D3DLIGHT.Destroy(this.aLong172);
			this.aLong172 = 0L;
		}
		if (this.aLong173 != 0L) {
			IDirect3DDevice.Destroy(this.aLong173);
			this.aLong173 = 0L;
		}
		if (this.aLong170 != 0L) {
			IUnknown.Release(this.aLong170);
			this.aLong170 = 0L;
		}
	}

	@OriginalMember(owner = "client!aqw", name = "fg", descriptor = "()Ljava/lang/String;")
	@Override
	public String method20827() {
		@Pc(1) String local1 = "Caps: 4:";
		@Pc(3) String local3 = ":";
		@Pc(15) String local15 = local1 + this.anInt2994 + local3;
		@Pc(27) String local27 = local15 + this.anInt2998 + local3;
		@Pc(39) String local39 = local27 + this.anInt2999 + local3;
		@Pc(55) String local55 = local39 + (this.aBoolean531 ? 1 : 0) + local3;
		@Pc(71) String local71 = local55 + (this.method21287() ? 1 : 0) + local3;
		@Pc(87) String local87 = local71 + (this.method21207() ? 1 : 0) + local3;
		@Pc(103) String local103 = local87 + (this.aBoolean532 ? 1 : 0) + local3;
		@Pc(119) String local119 = local103 + (this.aBoolean509 ? 1 : 0) + local3;
		@Pc(135) String local135 = local119 + (this.aBoolean540 ? 1 : 0) + local3;
		@Pc(151) String local151 = local135 + (this.aBoolean542 ? 1 : 0) + local3;
		@Pc(167) String local167 = local151 + (this.aBoolean547 ? 1 : 0) + local3;
		@Pc(183) String local183 = local167 + (this.aBoolean541 ? 1 : 0) + local3;
		@Pc(199) String local199 = local183 + (this.aBoolean529 ? 1 : 0) + local3;
		@Pc(215) String local215 = local199 + (this.aBoolean523 ? 1 : 0) + local3;
		@Pc(231) String local231 = local215 + (this.aBoolean530 ? 1 : 0) + local3;
		@Pc(247) String local247 = local231 + (this.aBoolean543 ? 1 : 0) + local3;
		@Pc(263) String local263 = local247 + (this.aBoolean545 ? 1 : 0) + local3;
		@Pc(279) String local279 = local263 + (this.aBoolean536 ? 1 : 0) + local3;
		@Pc(295) String local295 = local279 + (this.aBoolean534 ? 1 : 0) + local3;
		@Pc(311) String local311 = local295 + (this.aBoolean538 ? 1 : 0) + local3;
		return local311 + (this.aBoolean539 ? 1 : 0);
	}

	@OriginalMember(owner = "client!aqw", name = "fu", descriptor = "(Z)V")
	@Override
	public void method20830(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!aqw", name = "ff", descriptor = "(Z)V")
	@Override
	public void method20831(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!aqw", name = "fr", descriptor = "(Z)V")
	@Override
	public void method20832(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!aqw", name = "fi", descriptor = "(Ljava/awt/Canvas;II)Lclient!afr;")
	@Override
	Class108_Sub2 method20980(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return new Class108_Sub2_Sub1_Sub1(this, arg0, arg1, arg2, false);
	}

	@OriginalMember(owner = "client!aqw", name = "gh", descriptor = "(IIII)[I")
	@Override
	public int[] method20834(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method20744();
		@Pc(3) int[] local3 = null;
		@Pc(8) long local8 = IDirect3DDevice.GetRenderTarget(this.aLong173, 0);
		@Pc(18) long local18 = IDirect3DDevice.CreateRenderTarget(this.aLong173, arg2, arg3, 21, 0, 0, true);
		@Pc(33) int local33 = IDirect3DDevice.StretchRect(this.aLong173, local8, arg0, arg1, arg2, arg3, local18, 0, 0, arg2, arg3, 1);
		this.method21292(arg2 * arg3 * 4);
		if (t.f(local33)) {
			local3 = new int[arg2 * arg3];
			IDirect3DSurface.Download(local18, 0, 0, arg2, arg3, arg2 * 4, 16, this.aLong168);
			this.aByteBuffer7.clear();
			this.aByteBuffer7.asIntBuffer().get(local3);
		}
		IUnknown.Release(local8);
		IUnknown.Release(local18);
		return local3;
	}

	@OriginalMember(owner = "client!aqw", name = "gz", descriptor = "(IIII)[I")
	@Override
	public int[] method20835(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method20744();
		@Pc(3) int[] local3 = null;
		@Pc(8) long local8 = IDirect3DDevice.GetRenderTarget(this.aLong173, 0);
		@Pc(18) long local18 = IDirect3DDevice.CreateRenderTarget(this.aLong173, arg2, arg3, 21, 0, 0, true);
		@Pc(33) int local33 = IDirect3DDevice.StretchRect(this.aLong173, local8, arg0, arg1, arg2, arg3, local18, 0, 0, arg2, arg3, 1);
		this.method21292(arg2 * arg3 * 4);
		if (t.f(local33)) {
			local3 = new int[arg2 * arg3];
			IDirect3DSurface.Download(local18, 0, 0, arg2, arg3, arg2 * 4, 16, this.aLong168);
			this.aByteBuffer7.clear();
			this.aByteBuffer7.asIntBuffer().get(local3);
		}
		IUnknown.Release(local8);
		IUnknown.Release(local18);
		return local3;
	}

	@OriginalMember(owner = "client!aqw", name = "agq", descriptor = "([Lclient!lf;)Lclient!ld;")
	@Override
	Class135 method21528(@OriginalArg(0) Class397[] arg0) {
		return new Class135_Sub2(this, arg0);
	}

	@OriginalMember(owner = "client!aqw", name = "gg", descriptor = "(IIII)[I")
	@Override
	public int[] method20837(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method20744();
		@Pc(3) int[] local3 = null;
		@Pc(8) long local8 = IDirect3DDevice.GetRenderTarget(this.aLong173, 0);
		@Pc(18) long local18 = IDirect3DDevice.CreateRenderTarget(this.aLong173, arg2, arg3, 21, 0, 0, true);
		@Pc(33) int local33 = IDirect3DDevice.StretchRect(this.aLong173, local8, arg0, arg1, arg2, arg3, local18, 0, 0, arg2, arg3, 1);
		this.method21292(arg2 * arg3 * 4);
		if (t.f(local33)) {
			local3 = new int[arg2 * arg3];
			IDirect3DSurface.Download(local18, 0, 0, arg2, arg3, arg2 * 4, 16, this.aLong168);
			this.aByteBuffer7.clear();
			this.aByteBuffer7.asIntBuffer().get(local3);
		}
		IUnknown.Release(local8);
		IUnknown.Release(local18);
		return local3;
	}

	@OriginalMember(owner = "client!aqw", name = "ge", descriptor = "(IIII)[I")
	@Override
	public int[] method20766(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method20744();
		@Pc(3) int[] local3 = null;
		@Pc(8) long local8 = IDirect3DDevice.GetRenderTarget(this.aLong173, 0);
		@Pc(18) long local18 = IDirect3DDevice.CreateRenderTarget(this.aLong173, arg2, arg3, 21, 0, 0, true);
		@Pc(33) int local33 = IDirect3DDevice.StretchRect(this.aLong173, local8, arg0, arg1, arg2, arg3, local18, 0, 0, arg2, arg3, 1);
		this.method21292(arg2 * arg3 * 4);
		if (t.f(local33)) {
			local3 = new int[arg2 * arg3];
			IDirect3DSurface.Download(local18, 0, 0, arg2, arg3, arg2 * 4, 16, this.aLong168);
			this.aByteBuffer7.clear();
			this.aByteBuffer7.asIntBuffer().get(local3);
		}
		IUnknown.Release(local8);
		IUnknown.Release(local18);
		return local3;
	}

	@OriginalMember(owner = "client!aqw", name = "gb", descriptor = "()V")
	@Override
	public void method20839() {
	}

	@OriginalMember(owner = "client!aqw", name = "gc", descriptor = "()Z")
	@Override
	public boolean method21026() {
		return true;
	}

	@OriginalMember(owner = "client!aqw", name = "gj", descriptor = "()Z")
	@Override
	public boolean method20846() {
		return true;
	}

	@OriginalMember(owner = "client!aqw", name = "gf", descriptor = "()Z")
	@Override
	public boolean method20847() {
		return true;
	}

	@OriginalMember(owner = "client!aqw", name = "az", descriptor = "(II)J")
	@Override
	public long method20700(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method21538(arg0, arg1, null, null);
	}

	@OriginalMember(owner = "client!aqw", name = "ub", descriptor = "(Lclient!co;IIIZ[B)Lclient!ll;")
	@Override
	Interface36 method21510(@OriginalArg(0) Class210 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5) {
		return new Class128_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!aqw", name = "gr", descriptor = "()Z")
	@Override
	public boolean method20850() {
		return true;
	}

	@OriginalMember(owner = "client!aqw", name = "gu", descriptor = "()Z")
	@Override
	public boolean method20710() {
		return true;
	}

	@OriginalMember(owner = "client!aqw", name = "gt", descriptor = "()Z")
	@Override
	public boolean method20852() {
		return false;
	}

	@OriginalMember(owner = "client!aqw", name = "gy", descriptor = "()Z")
	@Override
	public boolean method20853() {
		return false;
	}

	@OriginalMember(owner = "client!aqw", name = "gl", descriptor = "()I")
	@Override
	public int method20676() {
		if (this.aLongArray14[this.anInt3008] == 0L) {
			return -1;
		} else if (t.f(IDirect3DEventQuery.IsSignaled(this.aLongArray14[this.anInt3008]))) {
			return this.anIntArray263[this.anInt3008];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!aqw", name = "gm", descriptor = "()I")
	@Override
	public int method20745() {
		if (this.aLongArray14[this.anInt3008] == 0L) {
			return -1;
		} else if (t.f(IDirect3DEventQuery.IsSignaled(this.aLongArray14[this.anInt3008]))) {
			return this.anIntArray263[this.anInt3008];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!aqw", name = "gx", descriptor = "(III)V")
	@Override
	public void method20857(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aLong174 == 0L) {
			this.method21566(arg1, arg2);
		}
		@Pc(13) long local13 = IDirect3DDevice.GetRenderTarget(this.aLong173, 0);
		if (t.t(IDirect3DDevice.StretchRect(this.aLong173, local13, 0, 0, this.aClass108_6.method24036(), this.aClass108_6.method24037(), this.aLong174, this.anInt2947 * 1069673649, this.anInt2932 * 262780429, this.anInt2948 * -244276243, this.anInt2936 * -69329917, 2))) {
		}
		IUnknown.Release(local13);
		IDirect3DDevice.GetRenderTargetData(this.aLong173, this.aLong174, this.aLongArray15[this.anInt3009]);
		@Pc(63) long local63 = IDirect3DDevice.CreateEventQuery(this.aLong173);
		if (t.f(IDirect3DEventQuery.Issue(local63))) {
			this.aLongArray14[this.anInt3009] = local63;
		}
		this.anIntArray263[this.anInt3009] = arg0;
		if (++this.anInt3009 >= 3) {
			this.anInt3009 = 0;
		}
	}

	@OriginalMember(owner = "client!aqw", name = "gn", descriptor = "()V")
	@Override
	public void method21087() {
		for (@Pc(1) int local1 = 0; local1 < 3; local1++) {
			if (this.aLongArray14[local1] != 0L) {
				IUnknown.Release(this.aLongArray14[local1]);
				this.aLongArray14[local1] = 0L;
			}
		}
		this.anInt3009 = 0;
		this.anInt3008 = 0;
	}

	@OriginalMember(owner = "client!aqw", name = "ahb", descriptor = "(Lclient!mv;Lclient!md;IIII)V")
	@Override
	void method21532(@OriginalArg(0) Interface44 arg0, @OriginalArg(1) Class415 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (this.aClass114_Sub2_2 != null) {
			this.aClass114_Sub2_2.method8639();
		}
		IDirect3DDevice.DrawIndexedPrimitiveIB(this.aLong173, ((Class459) arg0).aLong383, 4, 0, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!aqw", name = "af", descriptor = "(IILclient!co;Lclient!dy;I)Lclient!do;")
	@Override
	public Interface18 method20688(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class210 arg2, @OriginalArg(3) Class236 arg3, @OriginalArg(4) int arg4) {
		return new Class470(this, arg2, arg3, arg0, arg1, arg4);
	}

	@OriginalMember(owner = "client!aqw", name = "abe", descriptor = "()V")
	@Override
	void method21405() {
		if (!this.aBoolean518 || this.aBoolean544) {
			return;
		}
		IDirect3DDevice.LightEnable(this.aLong173, 0, false);
		IDirect3DDevice.LightEnable(this.aLong173, 1, false);
		IDirect3DDevice.SetLight(this.aLong173, 0, this.aLong169);
		IDirect3DDevice.SetLight(this.aLong173, 1, this.aLong171);
		IDirect3DDevice.LightEnable(this.aLong173, 0, true);
		IDirect3DDevice.LightEnable(this.aLong173, 1, true);
		this.aBoolean544 = true;
	}

	@OriginalMember(owner = "client!aqw", name = "ha", descriptor = "(II[I[I)V")
	@Override
	public void method20848(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.method21538(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!aqw", name = "hn", descriptor = "(II[I[I)V")
	@Override
	public void method21098(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.method21538(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!aqw", name = "hw", descriptor = "(II[I[I)V")
	@Override
	public void method20864(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.method21538(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!aqw", name = "ut", descriptor = "(IZ[[I)Lclient!ml;")
	@Override
	Interface42 method21213(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[][] arg2) {
		return new Class128_Sub3(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!aqw", name = "ia", descriptor = "(II)V")
	@Override
	public void method20764(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		IDirect3DDevice.Clear(this.aLong173, arg0, arg1, 1.0F, 0);
	}

	@OriginalMember(owner = "client!aqw", name = "aet", descriptor = "()V")
	@Override
	void method21484() {
		switch(this.aClass428_3.anInt4637) {
			case 0:
				IDirect3DDevice.SetRenderState(this.aLong173, 19, 2);
				IDirect3DDevice.SetRenderState(this.aLong173, 20, 2);
				break;
			case 1:
				IDirect3DDevice.SetRenderState(this.aLong173, 19, 5);
				IDirect3DDevice.SetRenderState(this.aLong173, 20, 6);
				break;
			case 2:
				IDirect3DDevice.SetRenderState(this.aLong173, 19, 9);
				IDirect3DDevice.SetRenderState(this.aLong173, 20, 2);
				break;
			case 3:
				IDirect3DDevice.SetRenderState(this.aLong173, 19, 2);
				IDirect3DDevice.SetRenderState(this.aLong173, 20, 1);
		}
		switch(this.anInt2992) {
			case 0:
				IDirect3DDevice.SetRenderState(this.aLong173, 207, 1);
				IDirect3DDevice.SetRenderState(this.aLong173, 208, 1);
				break;
			case 1:
				IDirect3DDevice.SetRenderState(this.aLong173, 207, 2);
				IDirect3DDevice.SetRenderState(this.aLong173, 208, 1);
				break;
			case 2:
				IDirect3DDevice.SetRenderState(this.aLong173, 207, 2);
				IDirect3DDevice.SetRenderState(this.aLong173, 208, 2);
				break;
			case 3:
				IDirect3DDevice.SetRenderState(this.aLong173, 207, 1);
				IDirect3DDevice.SetRenderState(this.aLong173, 208, 2);
		}
	}

	@OriginalMember(owner = "client!aqw", name = "hp", descriptor = "(II)J")
	@Override
	public long method20860(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method21538(arg0, arg1, null, null);
	}

	@OriginalMember(owner = "client!aqw", name = "lc", descriptor = "(Lclient!df;Lclient!df;FLclient!df;)Lclient!df;")
	@Override
	public Class106 method20976(@OriginalArg(0) Class106 arg0, @OriginalArg(1) Class106 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class106 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!aqw", name = "uc", descriptor = "()V")
	@Override
	void method21247() {
		if (!this.aBoolean518) {
			return;
		}
		@Pc(10) float local10 = this.aBoolean519 ? this.aFloat214 : 0.0F;
		@Pc(19) float local19 = this.aBoolean519 ? -this.aFloat216 : 0.0F;
		D3DLIGHT.SetDiffuse(this.aLong169, local10 * this.aFloat208, local10 * this.aFloat209, local10 * this.aFloat210, 0.0F);
		D3DLIGHT.SetDiffuse(this.aLong171, local19 * this.aFloat208, local19 * this.aFloat209, local19 * this.aFloat210, 0.0F);
		this.aBoolean544 = false;
	}

	@OriginalMember(owner = "client!aqw", name = "lu", descriptor = "(Lclient!df;Lclient!df;FLclient!df;)Lclient!df;")
	@Override
	public Class106 method20978(@OriginalArg(0) Class106 arg0, @OriginalArg(1) Class106 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class106 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!aqw", name = "ahy", descriptor = "(J)V")
	void method21559(@OriginalArg(0) long arg0) {
		this.aLong175 = arg0;
		IDirect3DDevice.SetVertexShader(this.aLong173, arg0);
	}

	@OriginalMember(owner = "client!aqw", name = "nr", descriptor = "()Lclient!afo;")
	@Override
	public Class108_Sub1 method21018() {
		return new Class108_Sub1_Sub1_Sub2(this);
	}

	@OriginalMember(owner = "client!aqw", name = "om", descriptor = "(II)Lclient!de;")
	@Override
	public Interface17 method20760(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class465(this, Class236.aClass236_22, arg0, arg1, 0);
	}

	@OriginalMember(owner = "client!aqw", name = "ny", descriptor = "(IILclient!co;Lclient!dy;I)Lclient!do;")
	@Override
	public Interface18 method21028(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class210 arg2, @OriginalArg(3) Class236 arg3, @OriginalArg(4) int arg4) {
		return new Class470(this, arg2, arg3, arg0, arg1, arg4);
	}

	@OriginalMember(owner = "client!aqw", name = "ajh", descriptor = "()V")
	void method21560() {
		IDirect3DDevice.SetRenderState(this.aLong173, 22, this.anInt2993);
	}

	@OriginalMember(owner = "client!aqw", name = "hj", descriptor = "()V")
	@Override
	void method21030() {
		super.finalize();
	}

	@OriginalMember(owner = "client!aqw", name = "oi", descriptor = "(II)Lclient!de;")
	@Override
	public Interface17 method21050(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class465(this, Class236.aClass236_22, arg0, arg1, 0);
	}

	@OriginalMember(owner = "client!aqw", name = "afp", descriptor = "()V")
	@Override
	void method21491() {
		IDirect3DDevice.f(this.aLong173, 27, this.aBoolean514);
	}

	@OriginalMember(owner = "client!aqw", name = "go", descriptor = "()Z")
	@Override
	public boolean method20995() {
		if (this.aBoolean537) {
			return false;
		} else {
			return this.aLongArray14[this.anInt3009] == 0L;
		}
	}

	@OriginalMember(owner = "client!aqw", name = "oa", descriptor = "(III)Lclient!de;")
	@Override
	public Interface17 method21053(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return new Class465(this, Class236.aClass236_22, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!aqw", name = "at", descriptor = "(IIII)[I")
	@Override
	public int[] method20691(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method20744();
		@Pc(3) int[] local3 = null;
		@Pc(8) long local8 = IDirect3DDevice.GetRenderTarget(this.aLong173, 0);
		@Pc(18) long local18 = IDirect3DDevice.CreateRenderTarget(this.aLong173, arg2, arg3, 21, 0, 0, true);
		@Pc(33) int local33 = IDirect3DDevice.StretchRect(this.aLong173, local8, arg0, arg1, arg2, arg3, local18, 0, 0, arg2, arg3, 1);
		this.method21292(arg2 * arg3 * 4);
		if (t.f(local33)) {
			local3 = new int[arg2 * arg3];
			IDirect3DSurface.Download(local18, 0, 0, arg2, arg3, arg2 * 4, 16, this.aLong168);
			this.aByteBuffer7.clear();
			this.aByteBuffer7.asIntBuffer().get(local3);
		}
		IUnknown.Release(local8);
		IUnknown.Release(local18);
		return local3;
	}

	@OriginalMember(owner = "client!aqw", name = "xa", descriptor = "()Z")
	@Override
	public boolean method21313() {
		return (this.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257;
	}

	@OriginalMember(owner = "client!aqw", name = "xe", descriptor = "()Z")
	@Override
	public boolean method21314() {
		return (this.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257;
	}

	@OriginalMember(owner = "client!aqw", name = "xx", descriptor = "()Z")
	@Override
	public boolean method21315() {
		return (this.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257;
	}

	@OriginalMember(owner = "client!aqw", name = "aik", descriptor = "(Lclient!oi;)Lclient!aki;")
	Class80_Sub19 method21562(@OriginalArg(0) Interface51 arg0) {
		for (@Pc(5) Class80_Sub19 local5 = (Class80_Sub19) this.aClass8_41.method247(129206984); local5 != null; local5 = (Class80_Sub19) this.aClass8_41.method237(588639947)) {
			if (local5.anObject5 == arg0) {
				return local5;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!aqw", name = "xb", descriptor = "()Z")
	@Override
	public boolean method21317() {
		return (this.aD3DCAPS1.PixelShaderVersion & 0xFFFF) >= 257;
	}

	@OriginalMember(owner = "client!aqw", name = "afl", descriptor = "()V")
	@Override
	void method21493() {
		if (this.aBoolean518) {
			IDirect3DDevice.f(this.aLong173, 28, this.aBoolean526 && this.aBoolean522 && this.anInt2985 >= 0);
		}
	}

	@OriginalMember(owner = "client!aqw", name = "xw", descriptor = "()Z")
	@Override
	public boolean method21319() {
		return (this.aD3DCAPS1.PixelShaderVersion & 0xFFFF) >= 257;
	}

	@OriginalMember(owner = "client!aqw", name = "xz", descriptor = "(Z)Z")
	@Override
	public boolean method21312(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			return this.aBoolean538;
		} else {
			return this.aBoolean538 && this.aBoolean539;
		}
	}

	@OriginalMember(owner = "client!aqw", name = "xh", descriptor = "(Z)Z")
	@Override
	public boolean method21321(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			return this.aBoolean538;
		} else {
			return this.aBoolean538 && this.aBoolean539;
		}
	}

	@OriginalMember(owner = "client!aqw", name = "xi", descriptor = "(Z)Z")
	@Override
	public boolean method21430(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			return this.aBoolean538;
		} else {
			return this.aBoolean538 && this.aBoolean539;
		}
	}

	@OriginalMember(owner = "client!aqw", name = "xy", descriptor = "(Ljava/lang/String;)Lclient!hb;")
	@Override
	public Class113 method21329(@OriginalArg(0) String arg0) {
		@Pc(3) byte[] local3 = this.method21552(arg0);
		if (local3 == null) {
			return null;
		} else {
			@Pc(11) Class324 local11 = this.method21144(local3);
			return new Class113_Sub1(this, local11);
		}
	}

	@OriginalMember(owner = "client!aqw", name = "aih", descriptor = "(Lclient!ahn;)V")
	void method21563(@OriginalArg(0) Class128_Sub1 arg0) {
		this.method21543(arg0);
		if (!this.aBooleanArray15[this.anInt2983]) {
			IDirect3DDevice.SetSamplerState(this.aLong173, this.anInt2983, 1, 1);
			this.aBooleanArray15[this.anInt2983] = true;
		}
		if (!this.aBooleanArray17[this.anInt2983]) {
			IDirect3DDevice.SetSamplerState(this.aLong173, this.anInt2983, 2, 1);
			this.aBooleanArray17[this.anInt2983] = true;
		}
	}

	@OriginalMember(owner = "client!aqw", name = "i", descriptor = "(II)V")
	@Override
	void method20947(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub2 {
		if (this.aBoolean537) {
			if (!this.method21596(this.aClass108_Sub2_6.method24036(), this.aClass108_Sub2_6.method24037())) {
				return;
			}
			((Class108_Sub2_Sub1_Sub1) this.aClass108_Sub2_6).method11173();
		} else {
			IDirect3DDevice.EndScene(this.aLong173);
		}
		@Pc(25) int local25 = this.aClass108_Sub2_6.method24053();
		if (t.t(local25)) {
			this.aBoolean537 = true;
			this.aClass108_Sub2_6.method24046();
		} else {
			IDirect3DDevice.BeginScene(this.aLong173);
			if (this.anInterface23_7 != null) {
				this.anInterface23_7.method7758(409100978);
			}
		}
	}

	@OriginalMember(owner = "client!aqw", name = "yc", descriptor = "()V")
	@Override
	void method21339() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2998; local1++) {
			IDirect3DDevice.SetSamplerState(this.aLong173, local1, 7, 2);
			IDirect3DDevice.SetSamplerState(this.aLong173, local1, 6, 2);
			IDirect3DDevice.SetSamplerState(this.aLong173, local1, 5, 2);
			IDirect3DDevice.SetSamplerState(this.aLong173, local1, 1, 1);
			IDirect3DDevice.SetSamplerState(this.aLong173, local1, 2, 1);
			this.aClass396Array1[local1] = Class396.aClass396_5;
			@Pc(48) boolean[] local48 = this.aBooleanArray15;
			this.aBooleanArray17[local1] = true;
			local48[local1] = true;
			this.aBooleanArray14[local1] = false;
			this.anIntArray264[local1] = 0;
		}
		IDirect3DDevice.SetTextureStageState(this.aLong173, 0, 6, 1);
		IDirect3DDevice.SetRenderState(this.aLong173, 9, 2);
		IDirect3DDevice.SetRenderState(this.aLong173, 23, 4);
		IDirect3DDevice.SetRenderState(this.aLong173, 25, 5);
		IDirect3DDevice.SetRenderState(this.aLong173, 24, 0);
		IDirect3DDevice.f(this.aLong173, 206, this.aBoolean534);
		IDirect3DDevice.SetRenderState(this.aLong173, 181, 0);
		this.method21549();
		IDirect3DDevice.SetRenderState(this.aLong173, 147, 1);
		IDirect3DDevice.SetRenderState(this.aLong173, 145, 1);
		IDirect3DDevice.t(this.aLong173, 38, 0.95F);
		IDirect3DDevice.SetRenderState(this.aLong173, 35, 3);
		IDirect3DDevice.t(this.aLong173, 154, 1.0F);
		D3DLIGHT.SetType(this.aLong169, 3);
		D3DLIGHT.SetType(this.aLong171, 3);
		D3DLIGHT.SetType(this.aLong172, 1);
		this.aBoolean544 = false;
		super.method21148();
	}

	@OriginalMember(owner = "client!aqw", name = "yl", descriptor = "()V")
	@Override
	void method21203() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2998; local1++) {
			IDirect3DDevice.SetSamplerState(this.aLong173, local1, 7, 2);
			IDirect3DDevice.SetSamplerState(this.aLong173, local1, 6, 2);
			IDirect3DDevice.SetSamplerState(this.aLong173, local1, 5, 2);
			IDirect3DDevice.SetSamplerState(this.aLong173, local1, 1, 1);
			IDirect3DDevice.SetSamplerState(this.aLong173, local1, 2, 1);
			this.aClass396Array1[local1] = Class396.aClass396_5;
			@Pc(48) boolean[] local48 = this.aBooleanArray15;
			this.aBooleanArray17[local1] = true;
			local48[local1] = true;
			this.aBooleanArray14[local1] = false;
			this.anIntArray264[local1] = 0;
		}
		IDirect3DDevice.SetTextureStageState(this.aLong173, 0, 6, 1);
		IDirect3DDevice.SetRenderState(this.aLong173, 9, 2);
		IDirect3DDevice.SetRenderState(this.aLong173, 23, 4);
		IDirect3DDevice.SetRenderState(this.aLong173, 25, 5);
		IDirect3DDevice.SetRenderState(this.aLong173, 24, 0);
		IDirect3DDevice.f(this.aLong173, 206, this.aBoolean534);
		IDirect3DDevice.SetRenderState(this.aLong173, 181, 0);
		this.method21549();
		IDirect3DDevice.SetRenderState(this.aLong173, 147, 1);
		IDirect3DDevice.SetRenderState(this.aLong173, 145, 1);
		IDirect3DDevice.t(this.aLong173, 38, 0.95F);
		IDirect3DDevice.SetRenderState(this.aLong173, 35, 3);
		IDirect3DDevice.t(this.aLong173, 154, 1.0F);
		D3DLIGHT.SetType(this.aLong169, 3);
		D3DLIGHT.SetType(this.aLong171, 3);
		D3DLIGHT.SetType(this.aLong172, 1);
		this.aBoolean544 = false;
		super.method21148();
	}

	@OriginalMember(owner = "client!aqw", name = "afk", descriptor = "(ILclient!lx;)V")
	@Override
	public void method21331(@OriginalArg(0) int arg0, @OriginalArg(1) Interface38 arg1) {
		@Pc(2) Class455 local2 = (Class455) arg1;
		IDirect3DDevice.SetStreamSource(this.aLong173, arg0, local2.aLong382, 0, local2.method29332());
	}

	@OriginalMember(owner = "client!aqw", name = "ya", descriptor = "()V")
	@Override
	void method21165() {
		this.method20683();
		for (@Pc(7) Class80_Sub19 local7 = (Class80_Sub19) this.aClass8_41.method247(129206984); local7 != null; local7 = (Class80_Sub19) this.aClass8_41.method237(-1107575534)) {
			@Pc(13) Interface51 local13 = (Interface51) local7.anObject5;
			local13.method24046();
		}
		super.method21294();
	}

	@OriginalMember(owner = "client!aqw", name = "afm", descriptor = "(Z)V")
	@Override
	void method21496(@OriginalArg(0) boolean arg0) {
		IDirect3DDevice.f(this.aLong173, 161, arg0);
	}

	@OriginalMember(owner = "client!aqw", name = "zp", descriptor = "()V")
	@Override
	void method21380() {
		IDirect3DDevice.SetScissorRect(this.aLong173, this.anInt2989 + this.anInt2979, this.anInt2974 + this.anInt2995, this.anInt2957, this.anInt2964);
	}

	@OriginalMember(owner = "client!aqw", name = "zr", descriptor = "()V")
	@Override
	void method21365() {
		IDirect3DDevice.f(this.aLong173, 174, this.aBoolean527);
	}

	@OriginalMember(owner = "client!aqw", name = "zx", descriptor = "()V")
	@Override
	void method21366() {
		IDirect3DDevice.f(this.aLong173, 174, this.aBoolean527);
	}

	@OriginalMember(owner = "client!aqw", name = "aao", descriptor = "(Lclient!pm;)V")
	@Override
	public void method21233(@OriginalArg(0) Class487 arg0) {
		arg0.method30078(this.aClass487_91);
	}

	@OriginalMember(owner = "client!aqw", name = "aaf", descriptor = "()V")
	@Override
	void method21396() {
		IDirect3DDevice.f(this.aLong173, 14, this.aBoolean515 && this.aBoolean535);
	}

	@OriginalMember(owner = "client!aqw", name = "aat", descriptor = "()V")
	@Override
	void method21397() {
		IDirect3DDevice.f(this.aLong173, 14, this.aBoolean515 && this.aBoolean535);
	}

	@OriginalMember(owner = "client!aqw", name = "aan", descriptor = "()V")
	@Override
	void method21521() {
		IDirect3DDevice.f(this.aLong173, 14, this.aBoolean515 && this.aBoolean535);
	}

	@OriginalMember(owner = "client!aqw", name = "ah", descriptor = "()Lclient!afo;")
	@Override
	public Class108_Sub1 method20687() {
		return new Class108_Sub1_Sub1_Sub2(this);
	}

	@OriginalMember(owner = "client!aqw", name = "ait", descriptor = "(J)V")
	void method21564(@OriginalArg(0) long arg0) {
		IDirect3DDevice.SetPixelShader(this.aLong173, arg0);
	}

	@OriginalMember(owner = "client!aqw", name = "abk", descriptor = "()V")
	@Override
	void method21401() {
		if (this.aBoolean518) {
			D3DLIGHT.SetAmbient(this.aLong169, this.aFloat208 * this.aFloat212, this.aFloat209 * this.aFloat212, this.aFloat210 * this.aFloat212, 0.0F);
			this.aBoolean544 = false;
		}
	}

	@OriginalMember(owner = "client!aqw", name = "abs", descriptor = "()V")
	@Override
	void method21402() {
		if (this.aBoolean518) {
			D3DLIGHT.SetAmbient(this.aLong169, this.aFloat208 * this.aFloat212, this.aFloat209 * this.aFloat212, this.aFloat210 * this.aFloat212, 0.0F);
			this.aBoolean544 = false;
		}
	}

	@OriginalMember(owner = "client!aqw", name = "abh", descriptor = "()V")
	@Override
	void method21403() {
		if (this.aBoolean518) {
			D3DLIGHT.SetAmbient(this.aLong169, this.aFloat208 * this.aFloat212, this.aFloat209 * this.aFloat212, this.aFloat210 * this.aFloat212, 0.0F);
			this.aBoolean544 = false;
		}
	}

	@OriginalMember(owner = "client!aqw", name = "aby", descriptor = "()V")
	@Override
	void method21277() {
		if (this.aBoolean518) {
			D3DLIGHT.SetAmbient(this.aLong169, this.aFloat208 * this.aFloat212, this.aFloat209 * this.aFloat212, this.aFloat210 * this.aFloat212, 0.0F);
			this.aBoolean544 = false;
		}
	}

	@OriginalMember(owner = "client!aqw", name = "abc", descriptor = "()V")
	@Override
	void method21413() {
		if (this.aBoolean518) {
			D3DLIGHT.SetDirection(this.aLong169, -this.aFloatArray68[0], -this.aFloatArray68[1], -this.aFloatArray68[2]);
			D3DLIGHT.SetDirection(this.aLong171, -this.aFloatArray67[0], -this.aFloatArray67[1], -this.aFloatArray67[2]);
			this.aBoolean544 = false;
		}
	}

	@OriginalMember(owner = "client!aqw", name = "abr", descriptor = "()V")
	@Override
	void method21299() {
		if (this.aBoolean518) {
			D3DLIGHT.SetDirection(this.aLong169, -this.aFloatArray68[0], -this.aFloatArray68[1], -this.aFloatArray68[2]);
			D3DLIGHT.SetDirection(this.aLong171, -this.aFloatArray67[0], -this.aFloatArray67[1], -this.aFloatArray67[2]);
			this.aBoolean544 = false;
		}
	}

	@OriginalMember(owner = "client!aqw", name = "ach", descriptor = "()V")
	@Override
	public void method21441() {
		if (this.aBooleanArray16[this.anInt2983]) {
			this.aBooleanArray16[this.anInt2983] = false;
			IDirect3DDevice.SetTexture(this.aLong173, this.anInt2983, 0L);
			this.method21360();
			this.method21232();
		}
	}

	@OriginalMember(owner = "client!aqw", name = "abm", descriptor = "()V")
	@Override
	void method21253() {
		if (!this.aBoolean518 || this.aBoolean544) {
			return;
		}
		IDirect3DDevice.LightEnable(this.aLong173, 0, false);
		IDirect3DDevice.LightEnable(this.aLong173, 1, false);
		IDirect3DDevice.SetLight(this.aLong173, 0, this.aLong169);
		IDirect3DDevice.SetLight(this.aLong173, 1, this.aLong171);
		IDirect3DDevice.LightEnable(this.aLong173, 0, true);
		IDirect3DDevice.LightEnable(this.aLong173, 1, true);
		this.aBoolean544 = true;
	}

	@OriginalMember(owner = "client!aqw", name = "abi", descriptor = "()V")
	@Override
	void method21406() {
		if (!this.aBoolean518 || this.aBoolean544) {
			return;
		}
		IDirect3DDevice.LightEnable(this.aLong173, 0, false);
		IDirect3DDevice.LightEnable(this.aLong173, 1, false);
		IDirect3DDevice.SetLight(this.aLong173, 0, this.aLong169);
		IDirect3DDevice.SetLight(this.aLong173, 1, this.aLong171);
		IDirect3DDevice.LightEnable(this.aLong173, 0, true);
		IDirect3DDevice.LightEnable(this.aLong173, 1, true);
		this.aBoolean544 = true;
	}

	@OriginalMember(owner = "client!aqw", name = "abt", descriptor = "()V")
	@Override
	void method21407() {
		this.method21247();
		this.method21285();
	}

	@OriginalMember(owner = "client!aqw", name = "aej", descriptor = "()V")
	@Override
	void method21487() {
		switch(this.aClass428_3.anInt4637) {
			case 0:
				IDirect3DDevice.SetRenderState(this.aLong173, 19, 2);
				IDirect3DDevice.SetRenderState(this.aLong173, 20, 2);
				break;
			case 1:
				IDirect3DDevice.SetRenderState(this.aLong173, 19, 5);
				IDirect3DDevice.SetRenderState(this.aLong173, 20, 6);
				break;
			case 2:
				IDirect3DDevice.SetRenderState(this.aLong173, 19, 9);
				IDirect3DDevice.SetRenderState(this.aLong173, 20, 2);
				break;
			case 3:
				IDirect3DDevice.SetRenderState(this.aLong173, 19, 2);
				IDirect3DDevice.SetRenderState(this.aLong173, 20, 1);
		}
		switch(this.anInt2992) {
			case 0:
				IDirect3DDevice.SetRenderState(this.aLong173, 207, 1);
				IDirect3DDevice.SetRenderState(this.aLong173, 208, 1);
				break;
			case 1:
				IDirect3DDevice.SetRenderState(this.aLong173, 207, 2);
				IDirect3DDevice.SetRenderState(this.aLong173, 208, 1);
				break;
			case 2:
				IDirect3DDevice.SetRenderState(this.aLong173, 207, 2);
				IDirect3DDevice.SetRenderState(this.aLong173, 208, 2);
				break;
			case 3:
				IDirect3DDevice.SetRenderState(this.aLong173, 207, 1);
				IDirect3DDevice.SetRenderState(this.aLong173, 208, 2);
		}
	}

	@OriginalMember(owner = "client!aqw", name = "ais", descriptor = "(J)V")
	void method21565(@OriginalArg(0) long arg0) {
		this.aLong175 = arg0;
		IDirect3DDevice.SetVertexShader(this.aLong173, arg0);
	}

	@OriginalMember(owner = "client!aqw", name = "abx", descriptor = "()V")
	@Override
	void method21411() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt2978; local1++) {
			@Pc(10) Class80_Sub12 local10 = this.aClass80_Sub12Array19[local1];
			@Pc(14) int local14 = local1 + 2;
			@Pc(18) int local18 = local10.method13953((byte) 33);
			@Pc(24) float local24 = local10.method13954(1649019762) / 255.0F;
			D3DLIGHT.SetPosition(this.aLong172, (float) local10.method13949((byte) 0), (float) local10.method13950(-1808756649), (float) local10.method13970(-2082692282));
			D3DLIGHT.SetDiffuse(this.aLong172, (float) (local18 >> 16 & 0xFF) * local24, (float) (local18 >> 8 & 0xFF) * local24, (float) (local18 & 0xFF) * local24, 0.0F);
			D3DLIGHT.SetAttenuation(this.aLong172, 0.0F, 0.0F, 1.0F / (float) (local10.method13952(-432544427) * local10.method13952(-432544427)));
			D3DLIGHT.SetRange(this.aLong172, (float) local10.method13952(-432544427));
			IDirect3DDevice.SetLight(this.aLong173, local14, this.aLong172);
			IDirect3DDevice.LightEnable(this.aLong173, local14, true);
		}
		while (local1 < this.anInt2977) {
			IDirect3DDevice.LightEnable(this.aLong173, local1 + 2, false);
			local1++;
		}
	}

	@OriginalMember(owner = "client!aqw", name = "abp", descriptor = "(Lclient!co;Lclient!dy;)Z")
	@Override
	boolean method21412(@OriginalArg(0) Class210 arg0, @OriginalArg(1) Class236 arg1) {
		@Pc(3) D3DDISPLAYMODE local3 = new D3DDISPLAYMODE();
		return t.f(IDirect3D.GetAdapterDisplayMode(this.aLong170, this.anInt3007, local3)) && t.f(IDirect3D.CheckDeviceFormat(this.aLong170, this.anInt3007, this.anInt3004, local3.Format, 0, 3, method21553(arg0, arg1)));
	}

	@OriginalMember(owner = "client!aqw", name = "abj", descriptor = "(Lclient!co;Lclient!dy;)Z")
	@Override
	boolean method21214(@OriginalArg(0) Class210 arg0, @OriginalArg(1) Class236 arg1) {
		@Pc(3) D3DDISPLAYMODE local3 = new D3DDISPLAYMODE();
		return t.f(IDirect3D.GetAdapterDisplayMode(this.aLong170, this.anInt3007, local3)) && t.f(IDirect3D.CheckDeviceFormat(this.aLong170, this.anInt3007, this.anInt3004, local3.Format, 0, 4, method21553(arg0, arg1)));
	}

	@OriginalMember(owner = "client!aqw", name = "abz", descriptor = "(Lclient!co;Lclient!dy;)Z")
	@Override
	boolean method21140(@OriginalArg(0) Class210 arg0, @OriginalArg(1) Class236 arg1) {
		@Pc(3) D3DDISPLAYMODE local3 = new D3DDISPLAYMODE();
		return t.f(IDirect3D.GetAdapterDisplayMode(this.aLong170, this.anInt3007, local3)) && t.f(IDirect3D.CheckDeviceFormat(this.aLong170, this.anInt3007, this.anInt3004, local3.Format, 0, 4, method21553(arg0, arg1)));
	}

	@OriginalMember(owner = "client!aqw", name = "au", descriptor = "(III)V")
	@Override
	public void method20867(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aLong174 == 0L) {
			this.method21566(arg1, arg2);
		}
		@Pc(13) long local13 = IDirect3DDevice.GetRenderTarget(this.aLong173, 0);
		if (t.t(IDirect3DDevice.StretchRect(this.aLong173, local13, 0, 0, this.aClass108_6.method24036(), this.aClass108_6.method24037(), this.aLong174, this.anInt2947 * 1069673649, this.anInt2932 * 262780429, this.anInt2948 * -244276243, this.anInt2936 * -69329917, 2))) {
		}
		IUnknown.Release(local13);
		IDirect3DDevice.GetRenderTargetData(this.aLong173, this.aLong174, this.aLongArray15[this.anInt3009]);
		@Pc(63) long local63 = IDirect3DDevice.CreateEventQuery(this.aLong173);
		if (t.f(IDirect3DEventQuery.Issue(local63))) {
			this.aLongArray14[this.anInt3009] = local63;
		}
		this.anIntArray263[this.anInt3009] = arg0;
		if (++this.anInt3009 >= 3) {
			this.anInt3009 = 0;
		}
	}

	@OriginalMember(owner = "client!aqw", name = "agm", descriptor = "()V")
	@Override
	void method21154() {
		this.aFloat218 = this.aFloat202 - (float) this.anInt2990;
		this.aFloat217 = this.aFloat218 - (float) this.anInt2985;
		if (this.aFloat217 < this.aFloat215) {
			this.aFloat217 = this.aFloat215;
		}
		if (this.aBoolean518) {
			IDirect3DDevice.t(this.aLong173, 36, this.aFloat217);
			IDirect3DDevice.t(this.aLong173, 37, this.aFloat218);
			IDirect3DDevice.SetRenderState(this.aLong173, 34, this.anInt2965);
		}
	}

	@OriginalMember(owner = "client!aqw", name = "acy", descriptor = "(Lclient!co;Lclient!dy;II)Lclient!lb;")
	@Override
	Interface34 method21422(@OriginalArg(0) Class210 arg0, @OriginalArg(1) Class236 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return new Class128_Sub2(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!aqw", name = "acq", descriptor = "(Lclient!co;Lclient!dy;II)Lclient!lb;")
	@Override
	Interface34 method21423(@OriginalArg(0) Class210 arg0, @OriginalArg(1) Class236 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return new Class128_Sub2(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!aqw", name = "acc", descriptor = "(Lclient!co;IIZ[BII)Lclient!lb;")
	@Override
	Interface34 method21424(@OriginalArg(0) Class210 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		return new Class128_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!aqw", name = "sh", descriptor = "()V")
	@Override
	void method21148() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2998; local1++) {
			IDirect3DDevice.SetSamplerState(this.aLong173, local1, 7, 2);
			IDirect3DDevice.SetSamplerState(this.aLong173, local1, 6, 2);
			IDirect3DDevice.SetSamplerState(this.aLong173, local1, 5, 2);
			IDirect3DDevice.SetSamplerState(this.aLong173, local1, 1, 1);
			IDirect3DDevice.SetSamplerState(this.aLong173, local1, 2, 1);
			this.aClass396Array1[local1] = Class396.aClass396_5;
			@Pc(48) boolean[] local48 = this.aBooleanArray15;
			this.aBooleanArray17[local1] = true;
			local48[local1] = true;
			this.aBooleanArray14[local1] = false;
			this.anIntArray264[local1] = 0;
		}
		IDirect3DDevice.SetTextureStageState(this.aLong173, 0, 6, 1);
		IDirect3DDevice.SetRenderState(this.aLong173, 9, 2);
		IDirect3DDevice.SetRenderState(this.aLong173, 23, 4);
		IDirect3DDevice.SetRenderState(this.aLong173, 25, 5);
		IDirect3DDevice.SetRenderState(this.aLong173, 24, 0);
		IDirect3DDevice.f(this.aLong173, 206, this.aBoolean534);
		IDirect3DDevice.SetRenderState(this.aLong173, 181, 0);
		this.method21549();
		IDirect3DDevice.SetRenderState(this.aLong173, 147, 1);
		IDirect3DDevice.SetRenderState(this.aLong173, 145, 1);
		IDirect3DDevice.t(this.aLong173, 38, 0.95F);
		IDirect3DDevice.SetRenderState(this.aLong173, 35, 3);
		IDirect3DDevice.t(this.aLong173, 154, 1.0F);
		D3DLIGHT.SetType(this.aLong169, 3);
		D3DLIGHT.SetType(this.aLong171, 3);
		D3DLIGHT.SetType(this.aLong172, 1);
		this.aBoolean544 = false;
		super.method21148();
	}

	@OriginalMember(owner = "client!aqw", name = "vf", descriptor = "(ILclient!mh;Z)V")
	@Override
	void method21223(@OriginalArg(0) int arg0, @OriginalArg(1) Class417 arg1, @OriginalArg(2) boolean arg2) {
		if (!this.aBoolean518) {
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
		IDirect3DDevice.SetTextureStageState(this.aLong173, this.anInt2983, local8, method21542(arg1) | local4);
	}

	@OriginalMember(owner = "client!aqw", name = "aca", descriptor = "(Lclient!co;IIZ[FII)Lclient!lb;")
	@Override
	Interface34 method21427(@OriginalArg(0) Class210 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		return new Class128_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!aqw", name = "acw", descriptor = "()V")
	@Override
	public void method21440() {
		if (this.aBooleanArray16[this.anInt2983]) {
			this.aBooleanArray16[this.anInt2983] = false;
			IDirect3DDevice.SetTexture(this.aLong173, this.anInt2983, 0L);
			this.method21360();
			this.method21232();
		}
	}

	@OriginalMember(owner = "client!aqw", name = "act", descriptor = "(IIZ[III)Lclient!lb;")
	@Override
	Interface34 method21263(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return new Class128_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!aqw", name = "acx", descriptor = "(IZ[[I)Lclient!ml;")
	@Override
	Interface42 method21177(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[][] arg2) {
		return new Class128_Sub3(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!aqw", name = "acv", descriptor = "(IZ[[I)Lclient!ml;")
	@Override
	Interface42 method21431(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[][] arg2) {
		return new Class128_Sub3(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!aqw", name = "acr", descriptor = "(Lclient!co;IIIZ[B)Lclient!ll;")
	@Override
	Interface36 method21156(@OriginalArg(0) Class210 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5) {
		return new Class128_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!aqw", name = "uk", descriptor = "()V")
	@Override
	void method21196() {
		if (this.aBoolean518) {
			IDirect3DDevice.f(this.aLong173, 137, this.aBoolean511 && !this.aBoolean520);
		}
	}

	@OriginalMember(owner = "client!aqw", name = "acz", descriptor = "(Lclient!co;IIIZ[B)Lclient!ll;")
	@Override
	Interface36 method21433(@OriginalArg(0) Class210 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5) {
		return new Class128_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!aqw", name = "afy", descriptor = "(Z)Lclient!mv;")
	@Override
	Interface44 method21501(@OriginalArg(0) boolean arg0) {
		return new Class459(this, Class236.aClass236_19, arg0);
	}

	@OriginalMember(owner = "client!aqw", name = "acb", descriptor = "(Lclient!co;Lclient!dy;II)Lclient!mg;")
	@Override
	Interface40 method21435(@OriginalArg(0) Class210 arg0, @OriginalArg(1) Class236 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return new Class128_Sub2_Sub1(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!aqw", name = "acp", descriptor = "(Lclient!co;Lclient!dy;II)Lclient!mg;")
	@Override
	Interface40 method21436(@OriginalArg(0) Class210 arg0, @OriginalArg(1) Class236 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return new Class128_Sub2_Sub1(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!aqw", name = "lr", descriptor = "(Lclient!df;Lclient!df;FLclient!df;)Lclient!df;")
	@Override
	public Class106 method20977(@OriginalArg(0) Class106 arg0, @OriginalArg(1) Class106 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class106 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!aqw", name = "xm", descriptor = "()Z")
	@Override
	public boolean method21316() {
		return (this.aD3DCAPS1.PixelShaderVersion & 0xFFFF) >= 257;
	}

	@OriginalMember(owner = "client!aqw", name = "tj", descriptor = "()V")
	@Override
	void method21192() {
		IDirect3DDevice.f(this.aLong173, 14, this.aBoolean515 && this.aBoolean535);
	}

	@OriginalMember(owner = "client!aqw", name = "tm", descriptor = "()V")
	@Override
	void method21175() {
		IDirect3DDevice.f(this.aLong173, 174, this.aBoolean527);
	}

	@OriginalMember(owner = "client!aqw", name = "adx", descriptor = "(ILclient!mh;ZZ)V")
	@Override
	void method21234(@OriginalArg(0) int arg0, @OriginalArg(1) Class417 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		if (!this.aBoolean518) {
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
		IDirect3DDevice.SetTextureStageState(this.aLong173, this.anInt2983, local8, method21542(arg1) | local4);
	}

	@OriginalMember(owner = "client!aqw", name = "adp", descriptor = "(ILclient!mh;Z)V")
	@Override
	void method21450(@OriginalArg(0) int arg0, @OriginalArg(1) Class417 arg1, @OriginalArg(2) boolean arg2) {
		if (!this.aBoolean518) {
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
		IDirect3DDevice.SetTextureStageState(this.aLong173, this.anInt2983, local8, method21542(arg1) | local4);
	}

	@OriginalMember(owner = "client!aqw", name = "adw", descriptor = "(ILclient!mh;Z)V")
	@Override
	void method21451(@OriginalArg(0) int arg0, @OriginalArg(1) Class417 arg1, @OriginalArg(2) boolean arg2) {
		if (!this.aBoolean518) {
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
		IDirect3DDevice.SetTextureStageState(this.aLong173, this.anInt2983, local8, method21542(arg1) | local4);
	}

	@OriginalMember(owner = "client!aqw", name = "adm", descriptor = "()V")
	@Override
	void method21454() {
		if (this.aBoolean518) {
			IDirect3DDevice.SetRenderState(this.aLong173, 60, this.anInt2949);
		}
	}

	@OriginalMember(owner = "client!aqw", name = "adr", descriptor = "()V")
	@Override
	void method21465() {
		if (this.aBoolean518) {
			IDirect3DDevice.SetRenderState(this.aLong173, 60, this.anInt2949);
		}
	}

	@OriginalMember(owner = "client!aqw", name = "ahp", descriptor = "(II)V")
	void method21566(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method20683();
		this.method20703(arg0, arg1, (byte) 52);
		this.aLong174 = IDirect3DDevice.CreateRenderTarget(this.aLong173, arg0, arg1, method21553(Class210.aClass210_24, Class236.aClass236_21), 0, 0, false);
		for (@Pc(21) int local21 = 0; local21 < 3; local21++) {
			this.aLongArray15[local21] = IDirect3DDevice.CreateOffscreenPlainSurface(this.aLong173, arg0, arg1, method21553(Class210.aClass210_24, Class236.aClass236_21), 2);
		}
		this.method21292(arg0 * arg1 * 4);
	}

	@OriginalMember(owner = "client!aqw", name = "aey", descriptor = "()V")
	@Override
	void method21467() {
		if (this.aLong175 != 0L || this.aClass422Array3[this.anInt2983] == Class422.aClass422_2) {
			IDirect3DDevice.SetTextureStageState(this.aLong173, this.anInt2983, 24, 0);
			this.anIntArray264[this.anInt2983] = 0;
			return;
		}
		if (this.aClass422Array3[this.anInt2983] == Class422.aClass422_4) {
			IDirect3DDevice.SetTransform(this.aLong173, this.anInt2983 + 16, this.aClass487Array6[this.anInt2983].method30108(this.aFloatArray70));
		} else {
			IDirect3DDevice.SetTransform(this.aLong173, this.anInt2983 + 16, this.aClass487Array6[this.anInt2983].method30102(this.aFloatArray70));
		}
		@Pc(58) int local58 = method21550(this.aClass422Array3[this.anInt2983]);
		if (local58 != this.anIntArray264[this.anInt2983]) {
			IDirect3DDevice.SetTextureStageState(this.aLong173, this.anInt2983, 24, local58);
			this.anIntArray264[this.anInt2983] = local58;
		}
	}

	@OriginalMember(owner = "client!aqw", name = "aec", descriptor = "()V")
	@Override
	void method21468() {
		if (this.aLong175 != 0L || this.aClass422Array3[this.anInt2983] == Class422.aClass422_2) {
			IDirect3DDevice.SetTextureStageState(this.aLong173, this.anInt2983, 24, 0);
			this.anIntArray264[this.anInt2983] = 0;
			return;
		}
		if (this.aClass422Array3[this.anInt2983] == Class422.aClass422_4) {
			IDirect3DDevice.SetTransform(this.aLong173, this.anInt2983 + 16, this.aClass487Array6[this.anInt2983].method30108(this.aFloatArray70));
		} else {
			IDirect3DDevice.SetTransform(this.aLong173, this.anInt2983 + 16, this.aClass487Array6[this.anInt2983].method30102(this.aFloatArray70));
		}
		@Pc(58) int local58 = method21550(this.aClass422Array3[this.anInt2983]);
		if (local58 != this.anIntArray264[this.anInt2983]) {
			IDirect3DDevice.SetTextureStageState(this.aLong173, this.anInt2983, 24, local58);
			this.anIntArray264[this.anInt2983] = local58;
		}
	}

	@OriginalMember(owner = "client!aqw", name = "aef", descriptor = "()V")
	@Override
	void method21469() {
	}

	@OriginalMember(owner = "client!aqw", name = "aei", descriptor = "()V")
	@Override
	void method21470() {
		if (this.aBoolean518) {
			@Pc(17) int local17 = this.aBooleanArray16[this.anInt2983] ? method21548(this.aClass412Array5[this.anInt2983]) : 1;
			IDirect3DDevice.SetTextureStageState(this.aLong173, this.anInt2983, 1, local17);
		}
	}

	@OriginalMember(owner = "client!aqw", name = "in", descriptor = "(II)V")
	@Override
	public void method20885(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		IDirect3DDevice.Clear(this.aLong173, arg0, arg1, 1.0F, 0);
	}

	@OriginalMember(owner = "client!aqw", name = "aer", descriptor = "()V")
	@Override
	void method21353() {
		if (this.aBoolean518) {
			@Pc(17) int local17 = this.aBooleanArray16[this.anInt2983] ? method21548(this.aClass412Array6[this.anInt2983]) : 1;
			IDirect3DDevice.SetTextureStageState(this.aLong173, this.anInt2983, 4, local17);
		}
	}

	@OriginalMember(owner = "client!aqw", name = "aeu", descriptor = "()V")
	@Override
	void method21472() {
		if (this.aBoolean518) {
			@Pc(17) int local17 = this.aBooleanArray16[this.anInt2983] ? method21548(this.aClass412Array6[this.anInt2983]) : 1;
			IDirect3DDevice.SetTextureStageState(this.aLong173, this.anInt2983, 4, local17);
		}
	}

	@OriginalMember(owner = "client!aqw", name = "aeo", descriptor = "()V")
	@Override
	void method21473() {
		if (this.aBoolean518) {
			@Pc(17) int local17 = this.aBooleanArray16[this.anInt2983] ? method21548(this.aClass412Array6[this.anInt2983]) : 1;
			IDirect3DDevice.SetTextureStageState(this.aLong173, this.anInt2983, 4, local17);
		}
	}

	@OriginalMember(owner = "client!aqw", name = "wn", descriptor = "(Lclient!mv;)V")
	@Override
	void method21251(@OriginalArg(0) Interface44 arg0) {
		IDirect3DDevice.SetIndices(this.aLong173, ((Class459) arg0).aLong383);
	}

	@OriginalMember(owner = "client!aqw", name = "ael", descriptor = "(I)V")
	@Override
	void method21482(@OriginalArg(0) int arg0) {
		IDirect3DDevice.SetRenderState(this.aLong173, 168, arg0);
	}

	@OriginalMember(owner = "client!aqw", name = "aek", descriptor = "()V")
	@Override
	void method21483() {
		IDirect3DDevice.f(this.aLong173, 15, this.aBoolean528);
		IDirect3DDevice.SetRenderState(this.aLong173, 24, this.aByte76 & 0xFF);
		if (this.aD3DPRESENT_PARAMETERS2.MultiSampleType <= 0) {
			return;
		}
		if (this.aBoolean528 && this.aByte76 != 0) {
			if (this.aBoolean536) {
				IDirect3DDevice.SetRenderState(this.aLong173, 181, method21262('S', 'S', 'A', 'A'));
			} else if (this.aBoolean543) {
				IDirect3DDevice.SetRenderState(this.aLong173, 181, method21262('A', 'T', 'O', 'C'));
			} else if (this.aBoolean545) {
				IDirect3DDevice.SetRenderState(this.aLong173, 154, method21262('A', '2', 'M', '1'));
			}
		} else if (this.aBoolean536 || this.aBoolean543) {
			IDirect3DDevice.SetRenderState(this.aLong173, 181, 0);
		} else if (this.aBoolean545) {
			IDirect3DDevice.t(this.aLong173, 154, 1.0F);
		}
	}

	@OriginalMember(owner = "client!aqw", name = "aif", descriptor = "(Lclient!ahn;)V")
	void method21567(@OriginalArg(0) Class128_Sub1 arg0) {
		this.method21543(arg0);
		if (!this.aBooleanArray15[this.anInt2983]) {
			IDirect3DDevice.SetSamplerState(this.aLong173, this.anInt2983, 1, 1);
			this.aBooleanArray15[this.anInt2983] = true;
		}
		if (!this.aBooleanArray17[this.anInt2983]) {
			IDirect3DDevice.SetSamplerState(this.aLong173, this.anInt2983, 2, 1);
			this.aBooleanArray17[this.anInt2983] = true;
		}
	}

	@OriginalMember(owner = "client!aqw", name = "aep", descriptor = "()V")
	@Override
	void method21485() {
		switch(this.aClass428_3.anInt4637) {
			case 0:
				IDirect3DDevice.SetRenderState(this.aLong173, 19, 2);
				IDirect3DDevice.SetRenderState(this.aLong173, 20, 2);
				break;
			case 1:
				IDirect3DDevice.SetRenderState(this.aLong173, 19, 5);
				IDirect3DDevice.SetRenderState(this.aLong173, 20, 6);
				break;
			case 2:
				IDirect3DDevice.SetRenderState(this.aLong173, 19, 9);
				IDirect3DDevice.SetRenderState(this.aLong173, 20, 2);
				break;
			case 3:
				IDirect3DDevice.SetRenderState(this.aLong173, 19, 2);
				IDirect3DDevice.SetRenderState(this.aLong173, 20, 1);
		}
		switch(this.anInt2992) {
			case 0:
				IDirect3DDevice.SetRenderState(this.aLong173, 207, 1);
				IDirect3DDevice.SetRenderState(this.aLong173, 208, 1);
				break;
			case 1:
				IDirect3DDevice.SetRenderState(this.aLong173, 207, 2);
				IDirect3DDevice.SetRenderState(this.aLong173, 208, 1);
				break;
			case 2:
				IDirect3DDevice.SetRenderState(this.aLong173, 207, 2);
				IDirect3DDevice.SetRenderState(this.aLong173, 208, 2);
				break;
			case 3:
				IDirect3DDevice.SetRenderState(this.aLong173, 207, 1);
				IDirect3DDevice.SetRenderState(this.aLong173, 208, 2);
		}
	}

	@OriginalMember(owner = "client!aqw", name = "aez", descriptor = "()V")
	@Override
	void method21445() {
		switch(this.aClass428_3.anInt4637) {
			case 0:
				IDirect3DDevice.SetRenderState(this.aLong173, 19, 2);
				IDirect3DDevice.SetRenderState(this.aLong173, 20, 2);
				break;
			case 1:
				IDirect3DDevice.SetRenderState(this.aLong173, 19, 5);
				IDirect3DDevice.SetRenderState(this.aLong173, 20, 6);
				break;
			case 2:
				IDirect3DDevice.SetRenderState(this.aLong173, 19, 9);
				IDirect3DDevice.SetRenderState(this.aLong173, 20, 2);
				break;
			case 3:
				IDirect3DDevice.SetRenderState(this.aLong173, 19, 2);
				IDirect3DDevice.SetRenderState(this.aLong173, 20, 1);
		}
		switch(this.anInt2992) {
			case 0:
				IDirect3DDevice.SetRenderState(this.aLong173, 207, 1);
				IDirect3DDevice.SetRenderState(this.aLong173, 208, 1);
				break;
			case 1:
				IDirect3DDevice.SetRenderState(this.aLong173, 207, 2);
				IDirect3DDevice.SetRenderState(this.aLong173, 208, 1);
				break;
			case 2:
				IDirect3DDevice.SetRenderState(this.aLong173, 207, 2);
				IDirect3DDevice.SetRenderState(this.aLong173, 208, 2);
				break;
			case 3:
				IDirect3DDevice.SetRenderState(this.aLong173, 207, 1);
				IDirect3DDevice.SetRenderState(this.aLong173, 208, 2);
		}
	}

	@OriginalMember(owner = "client!aqw", name = "aes", descriptor = "()V")
	@Override
	void method21486() {
		switch(this.aClass428_3.anInt4637) {
			case 0:
				IDirect3DDevice.SetRenderState(this.aLong173, 19, 2);
				IDirect3DDevice.SetRenderState(this.aLong173, 20, 2);
				break;
			case 1:
				IDirect3DDevice.SetRenderState(this.aLong173, 19, 5);
				IDirect3DDevice.SetRenderState(this.aLong173, 20, 6);
				break;
			case 2:
				IDirect3DDevice.SetRenderState(this.aLong173, 19, 9);
				IDirect3DDevice.SetRenderState(this.aLong173, 20, 2);
				break;
			case 3:
				IDirect3DDevice.SetRenderState(this.aLong173, 19, 2);
				IDirect3DDevice.SetRenderState(this.aLong173, 20, 1);
		}
		switch(this.anInt2992) {
			case 0:
				IDirect3DDevice.SetRenderState(this.aLong173, 207, 1);
				IDirect3DDevice.SetRenderState(this.aLong173, 208, 1);
				break;
			case 1:
				IDirect3DDevice.SetRenderState(this.aLong173, 207, 2);
				IDirect3DDevice.SetRenderState(this.aLong173, 208, 1);
				break;
			case 2:
				IDirect3DDevice.SetRenderState(this.aLong173, 207, 2);
				IDirect3DDevice.SetRenderState(this.aLong173, 208, 2);
				break;
			case 3:
				IDirect3DDevice.SetRenderState(this.aLong173, 207, 1);
				IDirect3DDevice.SetRenderState(this.aLong173, 208, 2);
		}
	}

	@OriginalMember(owner = "client!aqw", name = "afe", descriptor = "(Z)Lclient!lx;")
	@Override
	Interface38 method21502(@OriginalArg(0) boolean arg0) {
		return new Class455(this, arg0);
	}

	@OriginalMember(owner = "client!aqw", name = "aee", descriptor = "()V")
	@Override
	void method21488() {
		IDirect3DDevice.f(this.aLong173, 27, this.aBoolean514);
	}

	@OriginalMember(owner = "client!aqw", name = "afo", descriptor = "()V")
	@Override
	void method21489() {
		IDirect3DDevice.f(this.aLong173, 27, this.aBoolean514);
	}

	@OriginalMember(owner = "client!aqw", name = "afr", descriptor = "()V")
	@Override
	void method21490() {
		IDirect3DDevice.f(this.aLong173, 27, this.aBoolean514);
	}

	@OriginalMember(owner = "client!aqw", name = "hf", descriptor = "(J)V")
	@Override
	public void method20761(@OriginalArg(0) long arg0) {
	}

	@OriginalMember(owner = "client!aqw", name = "ng", descriptor = "()Lclient!afo;")
	@Override
	public Class108_Sub1 method20918() {
		return new Class108_Sub1_Sub1_Sub2(this);
	}

	@OriginalMember(owner = "client!aqw", name = "afw", descriptor = "()V")
	@Override
	void method21492() {
		IDirect3DDevice.f(this.aLong173, 27, this.aBoolean514);
	}

	@OriginalMember(owner = "client!aqw", name = "afz", descriptor = "()V")
	@Override
	void method21356() {
		if (this.aBoolean518) {
			IDirect3DDevice.f(this.aLong173, 28, this.aBoolean526 && this.aBoolean522 && this.anInt2985 >= 0);
		}
	}

	@OriginalMember(owner = "client!aqw", name = "eb", descriptor = "()V")
	@Override
	public void method20804() {
		@Pc(3) long local3 = IDirect3DDevice.CreateEventQuery(this.aLong173);
		if (t.f(IDirect3DEventQuery.Issue(local3))) {
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

	@OriginalMember(owner = "client!aqw", name = "il", descriptor = "(II)V")
	@Override
	public void method20884(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		IDirect3DDevice.Clear(this.aLong173, arg0, arg1, 1.0F, 0);
	}

	@OriginalMember(owner = "client!aqw", name = "afa", descriptor = "(Z)V")
	@Override
	void method21497(@OriginalArg(0) boolean arg0) {
		IDirect3DDevice.f(this.aLong173, 161, arg0);
	}

	@OriginalMember(owner = "client!aqw", name = "ht", descriptor = "()V")
	@Override
	void method21031() {
		super.finalize();
	}

	@OriginalMember(owner = "client!aqw", name = "aav", descriptor = "()V")
	@Override
	void method21399() {
		IDirect3DDevice.f(this.aLong173, 14, this.aBoolean515 && this.aBoolean535);
	}

	@OriginalMember(owner = "client!aqw", name = "afj", descriptor = "(Z)Lclient!mv;")
	@Override
	Interface44 method21500(@OriginalArg(0) boolean arg0) {
		return new Class459(this, Class236.aClass236_19, arg0);
	}

	@OriginalMember(owner = "client!aqw", name = "aio", descriptor = "(II)Z")
	boolean method21569(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = IDirect3DDevice.TestCooperativeLevel(this.aLong173);
		if (local3 == 0 || local3 == -2005530519) {
			IDirect3DDevice.SetDepthStencilSurface(this.aLong173, 0L);
			@Pc(15) int local15;
			for (local15 = 1; local15 < 4; local15++) {
				IDirect3DDevice.SetRenderTarget(this.aLong173, local15, 0L);
			}
			for (local15 = 0; local15 < 4; local15++) {
				IDirect3DDevice.SetStreamSource(this.aLong173, local15, 0L, 0, 0);
			}
			for (local15 = 0; local15 < 4; local15++) {
				IDirect3DDevice.SetTexture(this.aLong173, local15, 0L);
			}
			IDirect3DDevice.SetIndices(this.aLong173, 0L);
			this.method21294();
			this.aD3DPRESENT_PARAMETERS2.BackBufferWidth = arg0;
			this.aD3DPRESENT_PARAMETERS2.BackBufferHeight = arg1;
			this.aD3DPRESENT_PARAMETERS2.BackBufferCount = 1;
			if (method21555(this.anInt3007, this.anInt3004, this.aLong170, this.anInt2994, this.aD3DDISPLAYMODE1, this.aD3DPRESENT_PARAMETERS2)) {
				local15 = IDirect3DDevice.Reset(this.aLong173, this.aD3DPRESENT_PARAMETERS2);
				if (t.f(local15)) {
					this.aBoolean537 = false;
					this.method21150();
					this.method21148();
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!aqw", name = "acs", descriptor = "()V")
	@Override
	public void method21425() {
		if (this.aBooleanArray16[this.anInt2983]) {
			this.aBooleanArray16[this.anInt2983] = false;
			IDirect3DDevice.SetTexture(this.aLong173, this.anInt2983, 0L);
			this.method21360();
			this.method21232();
		}
	}

	@OriginalMember(owner = "client!aqw", name = "afd", descriptor = "(Lclient!ld;)V")
	@Override
	public void method21349(@OriginalArg(0) Class135 arg0) {
		@Pc(2) Class135_Sub2 local2 = (Class135_Sub2) arg0;
		IDirect3DDevice.SetVertexDeclaration(this.aLong173, local2.aLong44);
	}

	@OriginalMember(owner = "client!aqw", name = "gs", descriptor = "(II)J")
	@Override
	public long method20859(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method21538(arg0, arg1, null, null);
	}

	@OriginalMember(owner = "client!aqw", name = "aft", descriptor = "(ILclient!lx;)V")
	@Override
	public void method21284(@OriginalArg(0) int arg0, @OriginalArg(1) Interface38 arg1) {
		@Pc(2) Class455 local2 = (Class455) arg1;
		IDirect3DDevice.SetStreamSource(this.aLong173, arg0, local2.aLong382, 0, local2.method29332());
	}

	@OriginalMember(owner = "client!aqw", name = "afi", descriptor = "(ILclient!lx;)V")
	@Override
	public void method21198(@OriginalArg(0) int arg0, @OriginalArg(1) Interface38 arg1) {
		@Pc(2) Class455 local2 = (Class455) arg1;
		IDirect3DDevice.SetStreamSource(this.aLong173, arg0, local2.aLong382, 0, local2.method29332());
	}

	@OriginalMember(owner = "client!aqw", name = "afv", descriptor = "(Lclient!mv;)V")
	@Override
	void method21506(@OriginalArg(0) Interface44 arg0) {
		IDirect3DDevice.SetIndices(this.aLong173, ((Class459) arg0).aLong383);
	}

	@OriginalMember(owner = "client!aqw", name = "agd", descriptor = "(Lclient!md;II)V")
	@Override
	public void method21512(@OriginalArg(0) Class415 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass114_Sub2_2 != null) {
			this.aClass114_Sub2_2.method8639();
		}
		IDirect3DDevice.DrawPrimitive(this.aLong173, method21570(arg0), arg1, arg2);
	}

	@OriginalMember(owner = "client!aqw", name = "agg", descriptor = "(Lclient!md;IIII)V")
	@Override
	public void method21513(@OriginalArg(0) Class415 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.aClass114_Sub2_2 != null) {
			this.aClass114_Sub2_2.method8639();
		}
		IDirect3DDevice.DrawIndexedPrimitive(this.aLong173, method21570(arg0), 0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!aqw", name = "agt", descriptor = "(I)V")
	@Override
	void method21514(@OriginalArg(0) int arg0) {
		if (!this.aBoolean546) {
			@Pc(10) int local10 = (arg0 & 0x2) == 0 ? 3 : 2;
			IDirect3DDevice.SetRenderState(this.aLong173, 8, local10);
		}
	}

	@OriginalMember(owner = "client!aqw", name = "agr", descriptor = "(I)V")
	@Override
	void method21515(@OriginalArg(0) int arg0) {
		if (!this.aBoolean546) {
			@Pc(10) int local10 = (arg0 & 0x2) == 0 ? 3 : 2;
			IDirect3DDevice.SetRenderState(this.aLong173, 8, local10);
		}
	}

	@OriginalMember(owner = "client!aqw", name = "age", descriptor = "(I)V")
	@Override
	void method21343(@OriginalArg(0) int arg0) {
		if (!this.aBoolean546) {
			@Pc(10) int local10 = (arg0 & 0x2) == 0 ? 3 : 2;
			IDirect3DDevice.SetRenderState(this.aLong173, 8, local10);
		}
	}

	@OriginalMember(owner = "client!aqw", name = "agj", descriptor = "([Lclient!lf;)Lclient!ld;")
	@Override
	Class135 method21383(@OriginalArg(0) Class397[] arg0) {
		return new Class135_Sub2(this, arg0);
	}

	@OriginalMember(owner = "client!aqw", name = "aed", descriptor = "()V")
	@Override
	void method21466() {
		if (this.aLong175 != 0L || this.aClass422Array3[this.anInt2983] == Class422.aClass422_2) {
			IDirect3DDevice.SetTextureStageState(this.aLong173, this.anInt2983, 24, 0);
			this.anIntArray264[this.anInt2983] = 0;
			return;
		}
		if (this.aClass422Array3[this.anInt2983] == Class422.aClass422_4) {
			IDirect3DDevice.SetTransform(this.aLong173, this.anInt2983 + 16, this.aClass487Array6[this.anInt2983].method30108(this.aFloatArray70));
		} else {
			IDirect3DDevice.SetTransform(this.aLong173, this.anInt2983 + 16, this.aClass487Array6[this.anInt2983].method30102(this.aFloatArray70));
		}
		@Pc(58) int local58 = method21550(this.aClass422Array3[this.anInt2983]);
		if (local58 != this.anIntArray264[this.anInt2983]) {
			IDirect3DDevice.SetTextureStageState(this.aLong173, this.anInt2983, 24, local58);
			this.anIntArray264[this.anInt2983] = local58;
		}
	}

	@OriginalMember(owner = "client!aqw", name = "acd", descriptor = "()V")
	@Override
	public void method21278() {
		if (this.aBooleanArray16[this.anInt2983]) {
			this.aBooleanArray16[this.anInt2983] = false;
			IDirect3DDevice.SetTexture(this.aLong173, this.anInt2983, 0L);
			this.method21360();
			this.method21232();
		}
	}

	@OriginalMember(owner = "client!aqw", name = "aga", descriptor = "()F")
	@Override
	public float method21518() {
		return -0.5F;
	}

	@OriginalMember(owner = "client!aqw", name = "vm", descriptor = "()V")
	@Override
	void method21240() {
		IDirect3DDevice.f(this.aLong173, 27, this.aBoolean514);
	}

	@OriginalMember(owner = "client!aqw", name = "aia", descriptor = "(Lclient!oi;)Lclient!aki;")
	Class80_Sub19 method21573(@OriginalArg(0) Interface51 arg0) {
		for (@Pc(5) Class80_Sub19 local5 = (Class80_Sub19) this.aClass8_41.method247(129206984); local5 != null; local5 = (Class80_Sub19) this.aClass8_41.method237(-1031078244)) {
			if (local5.anObject5 == arg0) {
				return local5;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!aqw", name = "aid", descriptor = "(Lclient!oi;)V")
	void method21574(@OriginalArg(0) Interface51 arg0) {
		if (this.method21534(arg0) == null) {
			this.aClass8_41.method232(new Class80_Sub19(arg0), -95538544);
		}
	}

	@OriginalMember(owner = "client!aqw", name = "aib", descriptor = "(Lclient!oi;)V")
	void method21575(@OriginalArg(0) Interface51 arg0) {
		@Pc(3) Class80_Sub19 local3 = this.method21534(arg0);
		if (local3 != null) {
			local3.method24395((byte) 6);
		}
	}

	@OriginalMember(owner = "client!aqw", name = "us", descriptor = "()V")
	@Override
	void method21197() {
		if (this.aBoolean518) {
			D3DLIGHT.SetAmbient(this.aLong169, this.aFloat208 * this.aFloat212, this.aFloat209 * this.aFloat212, this.aFloat210 * this.aFloat212, 0.0F);
			this.aBoolean544 = false;
		}
	}

	@OriginalMember(owner = "client!aqw", name = "aiy", descriptor = "(II)V")
	void method21576(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method20683();
		this.method20703(arg0, arg1, (byte) 118);
		this.aLong174 = IDirect3DDevice.CreateRenderTarget(this.aLong173, arg0, arg1, method21553(Class210.aClass210_24, Class236.aClass236_21), 0, 0, false);
		for (@Pc(21) int local21 = 0; local21 < 3; local21++) {
			this.aLongArray15[local21] = IDirect3DDevice.CreateOffscreenPlainSurface(this.aLong173, arg0, arg1, method21553(Class210.aClass210_24, Class236.aClass236_21), 2);
		}
		this.method21292(arg0 * arg1 * 4);
	}

	@OriginalMember(owner = "client!aqw", name = "agw", descriptor = "()V")
	@Override
	void method21167() {
		if (this.aClass108_6 != null) {
			IDirect3DDevice.SetViewport(this.aLong173, this.anInt2989 + this.anInt2971, this.anInt2974 + this.anInt2963, this.anInt2972, this.anInt2984, this.aFloat205, this.aFloat206);
		}
	}

	@OriginalMember(owner = "client!aqw", name = "agf", descriptor = "()V")
	@Override
	void method21520() {
		if (this.aClass108_6 != null) {
			IDirect3DDevice.SetViewport(this.aLong173, this.anInt2989 + this.anInt2971, this.anInt2974 + this.anInt2963, this.anInt2972, this.anInt2984, this.aFloat205, this.aFloat206);
		}
	}

	@OriginalMember(owner = "client!aqw", name = "ahg", descriptor = "(J)V")
	void method21577(@OriginalArg(0) long arg0) {
		IDirect3DDevice.SetPixelShader(this.aLong173, arg0);
	}

	@OriginalMember(owner = "client!aqw", name = "hk", descriptor = "()V")
	@Override
	public void method20865() {
		if (this.aLong174 != 0L) {
			IUnknown.Release(this.aLong174);
			this.aLong174 = 0L;
		}
		for (@Pc(13) int local13 = 0; local13 < 3; local13++) {
			if (this.aLongArray14[local13] != 0L) {
				IUnknown.Release(this.aLongArray14[local13]);
				this.aLongArray14[local13] = 0L;
			}
			if (this.aLongArray15[local13] != 0L) {
				IUnknown.Release(this.aLongArray15[local13]);
				this.aLongArray15[local13] = 0L;
			}
		}
		this.anInt3009 = 0;
		this.anInt3008 = 0;
	}

	@OriginalMember(owner = "client!aqw", name = "aii", descriptor = "(J)V")
	void method21578(@OriginalArg(0) long arg0) {
		this.aLong175 = arg0;
		IDirect3DDevice.SetVertexShader(this.aLong173, arg0);
	}

	@OriginalMember(owner = "client!aqw", name = "ahz", descriptor = "(Lclient!ahn;)V")
	void method21579(@OriginalArg(0) Class128_Sub1 arg0) {
		this.method21543(arg0);
		if (!this.aBooleanArray15[this.anInt2983]) {
			IDirect3DDevice.SetSamplerState(this.aLong173, this.anInt2983, 1, 1);
			this.aBooleanArray15[this.anInt2983] = true;
		}
		if (!this.aBooleanArray17[this.anInt2983]) {
			IDirect3DDevice.SetSamplerState(this.aLong173, this.anInt2983, 2, 1);
			this.aBooleanArray17[this.anInt2983] = true;
		}
	}

	@OriginalMember(owner = "client!aqw", name = "gv", descriptor = "()Z")
	@Override
	public boolean method20849() {
		if (this.aBoolean537) {
			return false;
		} else {
			return this.aLongArray14[this.anInt3009] == 0L;
		}
	}

	@OriginalMember(owner = "client!aqw", name = "aiq", descriptor = "(J)V")
	void method21580(@OriginalArg(0) long arg0) {
		IDirect3DDevice.SetPixelShader(this.aLong173, arg0);
	}

	@OriginalMember(owner = "client!aqw", name = "agk", descriptor = "()V")
	@Override
	void method21139() {
		IDirect3DDevice.f(this.aLong173, 7, this.aBoolean516 && this.aBoolean517);
	}

	@OriginalMember(owner = "client!aqw", name = "ags", descriptor = "()V")
	@Override
	void method21389() {
		IDirect3DDevice.f(this.aLong173, 7, this.aBoolean516 && this.aBoolean517);
	}

	@OriginalMember(owner = "client!aqw", name = "wg", descriptor = "(Z)Lclient!lx;")
	@Override
	Interface38 method21239(@OriginalArg(0) boolean arg0) {
		return new Class455(this, arg0);
	}

	@OriginalMember(owner = "client!aqw", name = "aa", descriptor = "()Z")
	@Override
	public boolean method20695() {
		return true;
	}

	@OriginalMember(owner = "client!aqw", name = "agx", descriptor = "()V")
	@Override
	void method21494() {
		if (!this.aBoolean518) {
			return;
		}
		@Pc(10) float local10 = this.aBoolean519 ? this.aFloat214 : 0.0F;
		@Pc(19) float local19 = this.aBoolean519 ? -this.aFloat216 : 0.0F;
		D3DLIGHT.SetDiffuse(this.aLong169, local10 * this.aFloat208, local10 * this.aFloat209, local10 * this.aFloat210, 0.0F);
		D3DLIGHT.SetDiffuse(this.aLong171, local19 * this.aFloat208, local19 * this.aFloat209, local19 * this.aFloat210, 0.0F);
		this.aBoolean544 = false;
	}

	@OriginalMember(owner = "client!aqw", name = "afs", descriptor = "(Z)Lclient!mv;")
	@Override
	Interface44 method21499(@OriginalArg(0) boolean arg0) {
		return new Class459(this, Class236.aClass236_19, arg0);
	}

	@OriginalMember(owner = "client!aqw", name = "aic", descriptor = "(Lclient!oj;)V")
	void method21581(@OriginalArg(0) Class128 arg0) {
		IDirect3DDevice.SetTexture(this.aLong173, this.anInt2983, arg0.method11806());
		if (this.aBoolean518 && !this.aBooleanArray16[this.anInt2983]) {
			this.aBooleanArray16[this.anInt2983] = true;
			this.method21360();
			this.method21232();
		}
	}

	@OriginalMember(owner = "client!aqw", name = "aiv", descriptor = "(Lclient!oj;)V")
	void method21582(@OriginalArg(0) Class128 arg0) {
		IDirect3DDevice.SetTexture(this.aLong173, this.anInt2983, arg0.method11806());
		if (this.aBoolean518 && !this.aBooleanArray16[this.anInt2983]) {
			this.aBooleanArray16[this.anInt2983] = true;
			this.method21360();
			this.method21232();
		}
	}

	@OriginalMember(owner = "client!aqw", name = "ail", descriptor = "(Lclient!aiy;)V")
	void method21583(@OriginalArg(0) Class128_Sub2 arg0) {
		this.method21543(arg0);
		if (this.aBooleanArray15[this.anInt2983] != arg0.aBoolean245) {
			IDirect3DDevice.SetSamplerState(this.aLong173, this.anInt2983, 1, arg0.aBoolean245 ? 1 : 3);
			this.aBooleanArray15[this.anInt2983] = arg0.aBoolean245;
		}
		if (this.aBooleanArray17[this.anInt2983] != arg0.aBoolean246) {
			IDirect3DDevice.SetSamplerState(this.aLong173, this.anInt2983, 2, arg0.aBoolean246 ? 1 : 3);
			this.aBooleanArray17[this.anInt2983] = arg0.aBoolean246;
		}
	}

	@OriginalMember(owner = "client!aqw", name = "aff", descriptor = "()V")
	@Override
	void method21495() {
		if (this.aBoolean518) {
			IDirect3DDevice.f(this.aLong173, 28, this.aBoolean526 && this.aBoolean522 && this.anInt2985 >= 0);
		}
	}

	@OriginalMember(owner = "client!aqw", name = "sb", descriptor = "()V")
	@Override
	void method21150() {
		for (@Pc(5) Class80_Sub19 local5 = (Class80_Sub19) this.aClass8_41.method247(129206984); local5 != null; local5 = (Class80_Sub19) this.aClass8_41.method237(-775447669)) {
			@Pc(11) Interface51 local11 = (Interface51) local5.anObject5;
			local11.method11173();
			if (local11 == this.aClass108_6) {
				local11.method24039();
			}
		}
		super.method21150();
	}

	@OriginalMember(owner = "client!aqw", name = "aiz", descriptor = "(Lclient!ahn;)V")
	void method21584(@OriginalArg(0) Class128_Sub1 arg0) {
		this.method21543(arg0);
		if (!this.aBooleanArray15[this.anInt2983]) {
			IDirect3DDevice.SetSamplerState(this.aLong173, this.anInt2983, 1, 1);
			this.aBooleanArray15[this.anInt2983] = true;
		}
		if (!this.aBooleanArray17[this.anInt2983]) {
			IDirect3DDevice.SetSamplerState(this.aLong173, this.anInt2983, 2, 1);
			this.aBooleanArray17[this.anInt2983] = true;
		}
	}

	@OriginalMember(owner = "client!aqw", name = "ou", descriptor = "(I)V")
	@Override
	public synchronized void method21054(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3003; local1++) {
			IUnknown.Release(this.aLongArray16[local1]);
		}
		this.anInt3003 = 0;
		super.method20662(arg0);
	}

	@OriginalMember(owner = "client!aqw", name = "vu", descriptor = "(ILclient!mh;ZZ)V")
	@Override
	void method21152(@OriginalArg(0) int arg0, @OriginalArg(1) Class417 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		if (!this.aBoolean518) {
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
		IDirect3DDevice.SetTextureStageState(this.aLong173, this.anInt2983, local8, method21542(arg1) | local4);
	}

	@OriginalMember(owner = "client!aqw", name = "ye", descriptor = "()V")
	@Override
	void method21344() {
		for (@Pc(5) Class80_Sub19 local5 = (Class80_Sub19) this.aClass8_41.method247(129206984); local5 != null; local5 = (Class80_Sub19) this.aClass8_41.method237(-1998040569)) {
			@Pc(11) Interface51 local11 = (Interface51) local5.anObject5;
			local11.method11173();
			if (local11 == this.aClass108_6) {
				local11.method24039();
			}
		}
		super.method21150();
	}

	@OriginalMember(owner = "client!aqw", name = "agl", descriptor = "()V")
	@Override
	void method21523() {
		this.aFloat218 = this.aFloat202 - (float) this.anInt2990;
		this.aFloat217 = this.aFloat218 - (float) this.anInt2985;
		if (this.aFloat217 < this.aFloat215) {
			this.aFloat217 = this.aFloat215;
		}
		if (this.aBoolean518) {
			IDirect3DDevice.t(this.aLong173, 36, this.aFloat217);
			IDirect3DDevice.t(this.aLong173, 37, this.aFloat218);
			IDirect3DDevice.SetRenderState(this.aLong173, 34, this.anInt2965);
		}
	}

	@OriginalMember(owner = "client!aqw", name = "gk", descriptor = "(IIII)[I")
	@Override
	public int[] method20836(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method20744();
		@Pc(3) int[] local3 = null;
		@Pc(8) long local8 = IDirect3DDevice.GetRenderTarget(this.aLong173, 0);
		@Pc(18) long local18 = IDirect3DDevice.CreateRenderTarget(this.aLong173, arg2, arg3, 21, 0, 0, true);
		@Pc(33) int local33 = IDirect3DDevice.StretchRect(this.aLong173, local8, arg0, arg1, arg2, arg3, local18, 0, 0, arg2, arg3, 1);
		this.method21292(arg2 * arg3 * 4);
		if (t.f(local33)) {
			local3 = new int[arg2 * arg3];
			IDirect3DSurface.Download(local18, 0, 0, arg2, arg3, arg2 * 4, 16, this.aLong168);
			this.aByteBuffer7.clear();
			this.aByteBuffer7.asIntBuffer().get(local3);
		}
		IUnknown.Release(local8);
		IUnknown.Release(local18);
		return local3;
	}

	@OriginalMember(owner = "client!aqw", name = "agz", descriptor = "()V")
	@Override
	void method21525() {
		this.aFloat218 = this.aFloat202 - (float) this.anInt2990;
		this.aFloat217 = this.aFloat218 - (float) this.anInt2985;
		if (this.aFloat217 < this.aFloat215) {
			this.aFloat217 = this.aFloat215;
		}
		if (this.aBoolean518) {
			IDirect3DDevice.t(this.aLong173, 36, this.aFloat217);
			IDirect3DDevice.t(this.aLong173, 37, this.aFloat218);
			IDirect3DDevice.SetRenderState(this.aLong173, 34, this.anInt2965);
		}
	}

	@OriginalMember(owner = "client!aqw", name = "agv", descriptor = "([Lclient!lf;)Lclient!ld;")
	@Override
	Class135 method21526(@OriginalArg(0) Class397[] arg0) {
		return new Class135_Sub2(this, arg0);
	}

	@OriginalMember(owner = "client!aqw", name = "agu", descriptor = "([Lclient!lf;)Lclient!ld;")
	@Override
	Class135 method21286(@OriginalArg(0) Class397[] arg0) {
		return new Class135_Sub2(this, arg0);
	}

	@OriginalMember(owner = "client!aqw", name = "aig", descriptor = "(II)Z")
	boolean method21588(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = IDirect3DDevice.TestCooperativeLevel(this.aLong173);
		if (local3 == 0 || local3 == -2005530519) {
			IDirect3DDevice.SetDepthStencilSurface(this.aLong173, 0L);
			@Pc(15) int local15;
			for (local15 = 1; local15 < 4; local15++) {
				IDirect3DDevice.SetRenderTarget(this.aLong173, local15, 0L);
			}
			for (local15 = 0; local15 < 4; local15++) {
				IDirect3DDevice.SetStreamSource(this.aLong173, local15, 0L, 0, 0);
			}
			for (local15 = 0; local15 < 4; local15++) {
				IDirect3DDevice.SetTexture(this.aLong173, local15, 0L);
			}
			IDirect3DDevice.SetIndices(this.aLong173, 0L);
			this.method21294();
			this.aD3DPRESENT_PARAMETERS2.BackBufferWidth = arg0;
			this.aD3DPRESENT_PARAMETERS2.BackBufferHeight = arg1;
			this.aD3DPRESENT_PARAMETERS2.BackBufferCount = 1;
			if (method21555(this.anInt3007, this.anInt3004, this.aLong170, this.anInt2994, this.aD3DDISPLAYMODE1, this.aD3DPRESENT_PARAMETERS2)) {
				local15 = IDirect3DDevice.Reset(this.aLong173, this.aD3DPRESENT_PARAMETERS2);
				if (t.f(local15)) {
					this.aBoolean537 = false;
					this.method21150();
					this.method21148();
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!aqw", name = "acj", descriptor = "(Lclient!co;IIZ[FII)Lclient!lb;")
	@Override
	Interface34 method21426(@OriginalArg(0) Class210 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		return new Class128_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!aqw", name = "oj", descriptor = "(III)Lclient!de;")
	@Override
	public Interface17 method21052(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return new Class465(this, Class236.aClass236_22, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!aqw", name = "agy", descriptor = "(Lclient!mv;Lclient!md;IIII)V")
	@Override
	void method21300(@OriginalArg(0) Interface44 arg0, @OriginalArg(1) Class415 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (this.aClass114_Sub2_2 != null) {
			this.aClass114_Sub2_2.method8639();
		}
		IDirect3DDevice.DrawIndexedPrimitiveIB(this.aLong173, ((Class459) arg0).aLong383, 4, 0, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!aqw", name = "sq", descriptor = "()F")
	@Override
	public float method21132() {
		return -0.5F;
	}

	@OriginalMember(owner = "client!aqw", name = "ajz", descriptor = "(Ljava/lang/String;)[B")
	byte[] method21589(@OriginalArg(0) String arg0) {
		return this.method21143("dx", arg0);
	}

	@OriginalMember(owner = "client!aqw", name = "aja", descriptor = "(Ljava/lang/String;)[B")
	byte[] method21590(@OriginalArg(0) String arg0) {
		return this.method21143("dx", arg0);
	}

	@OriginalMember(owner = "client!aqw", name = "ace", descriptor = "(Lclient!co;IIIZ[B)Lclient!ll;")
	@Override
	Interface36 method21432(@OriginalArg(0) Class210 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5) {
		return new Class128_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!aqw", name = "tb", descriptor = "()V")
	@Override
	void method21169() {
		IDirect3DDevice.f(this.aLong173, 7, this.aBoolean516 && this.aBoolean517);
	}

	@OriginalMember(owner = "client!aqw", name = "abd", descriptor = "()V")
	@Override
	void method21400() {
		if (this.aBoolean518) {
			IDirect3DDevice.f(this.aLong173, 137, this.aBoolean511 && !this.aBoolean520);
		}
	}

	@OriginalMember(owner = "client!aqw", name = "ahi", descriptor = "(II)Z")
	boolean method21596(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = IDirect3DDevice.TestCooperativeLevel(this.aLong173);
		if (local3 == 0 || local3 == -2005530519) {
			IDirect3DDevice.SetDepthStencilSurface(this.aLong173, 0L);
			@Pc(15) int local15;
			for (local15 = 1; local15 < 4; local15++) {
				IDirect3DDevice.SetRenderTarget(this.aLong173, local15, 0L);
			}
			for (local15 = 0; local15 < 4; local15++) {
				IDirect3DDevice.SetStreamSource(this.aLong173, local15, 0L, 0, 0);
			}
			for (local15 = 0; local15 < 4; local15++) {
				IDirect3DDevice.SetTexture(this.aLong173, local15, 0L);
			}
			IDirect3DDevice.SetIndices(this.aLong173, 0L);
			this.method21294();
			this.aD3DPRESENT_PARAMETERS2.BackBufferWidth = arg0;
			this.aD3DPRESENT_PARAMETERS2.BackBufferHeight = arg1;
			this.aD3DPRESENT_PARAMETERS2.BackBufferCount = 1;
			if (method21555(this.anInt3007, this.anInt3004, this.aLong170, this.anInt2994, this.aD3DDISPLAYMODE1, this.aD3DPRESENT_PARAMETERS2)) {
				local15 = IDirect3DDevice.Reset(this.aLong173, this.aD3DPRESENT_PARAMETERS2);
				if (t.f(local15)) {
					this.aBoolean537 = false;
					this.method21150();
					this.method21148();
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!aqw", name = "gq", descriptor = "()I")
	@Override
	public int method20869() {
		if (this.aLongArray14[this.anInt3008] == 0L) {
			return -1;
		} else if (t.f(IDirect3DEventQuery.IsSignaled(this.aLongArray14[this.anInt3008]))) {
			return this.anIntArray263[this.anInt3008];
		} else {
			return -1;
		}
	}
}
