package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hp")
public class Class319 implements Interface75 {

	@OriginalMember(owner = "client!hp", name = "x", descriptor = "Lclient!es;")
	static Interface24 anInterface24_8;

	@OriginalMember(owner = "client!hp", name = "e", descriptor = "Lclient!hp;")
	public static final Class319 aClass319_3 = new Class319(1, 0);

	@OriginalMember(owner = "client!hp", name = "n", descriptor = "Lclient!hp;")
	public static final Class319 aClass319_1 = new Class319(2, 1);

	@OriginalMember(owner = "client!hp", name = "m", descriptor = "Lclient!hp;")
	static final Class319 aClass319_2 = new Class319(0, 2);

	@OriginalMember(owner = "client!hp", name = "k", descriptor = "I")
	public final int anInt4097;

	@OriginalMember(owner = "client!hp", name = "f", descriptor = "I")
	final int anInt4096;

	@OriginalMember(owner = "client!hp", name = "m", descriptor = "()[Lclient!hp;", line = 14)
	static Class319[] method27216() {
		return new Class319[] { aClass319_2, aClass319_3, aClass319_1 };
	}

	@OriginalMember(owner = "client!hp", name = "f", descriptor = "()[Lclient!hp;", line = 14)
	static Class319[] method27217() {
		return new Class319[] { aClass319_2, aClass319_3, aClass319_1 };
	}

	@OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(II)V", line = 17)
	Class319(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4097 = arg0 * -1103976909;
		this.anInt4096 = arg1 * 805312867;
	}

	@OriginalMember(owner = "client!hp", name = "n", descriptor = "()I", line = 23)
	@Override
	public int getId() {
		return this.anInt4096 * 147992651;
	}

	@OriginalMember(owner = "client!hp", name = "k", descriptor = "()I", line = 23)
	@Override
	public int method36919() {
		return this.anInt4096 * 147992651;
	}

	@OriginalMember(owner = "client!hp", name = "k", descriptor = "(B)Lclient!alq;", line = 80)
	static Class54_Sub1 method27218(@OriginalArg(0) byte arg0) {
		@Pc(3) Class54_Sub1 local3 = new Class54_Sub1();
		@Pc(5) boolean local5 = false;
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		if (Class339.aString179.startsWith("win")) {
			local7 = true;
			local5 = true;
			local9 = true;
		} else {
			local5 = true;
			local9 = true;
		}
		if (Class169.aBoolean389) {
			local3.method14875(16, -544774170);
			local5 = false;
		}
		if (Class169.aBoolean390) {
			local3.method14875(32, 1318451351);
			local7 = false;
		}
		if (Class169.aBoolean388) {
			local3.method14875(16384, 1110090325);
			local9 = false;
		}
		if (!local5 && !local7) {
			Class155_Sub2.method15310(local3, 1102306637);
			return local3;
		}
		@Pc(59) int local59 = -1;
		@Pc(61) int local61 = -1;
		@Pc(63) int local63 = -1;
		if (local7) {
			try {
				Class51.options.method14363(Class51.options.aClass166_Sub45_1, 3, (byte) 8);
				Class106_Sub1.method5135(-1375852755);
				local61 = Class78.method1316(3, 1000, 1323350560);
				if (Class51.options.aClass166_Sub4_2.method15426((byte) 95) == 3) {
					local3.method14875(4, -186815924);
					@Pc(91) Class219 local91 = Class694.aClass104_14.method20644();
					@Pc(98) long local98 = local91.aLong247 * -2731861378298283411L & 0xFFFFFFFFFFFFL;
					@Pc(111) boolean local111;
					switch(local91.anInt3623 * -348611355) {
						case 4098:
							local111 = local98 >= 60129613779L;
							local5 &= local111;
							if (!local111) {
								local3.method14875(512, -1306228526);
							}
							break;
						case 4318:
							local111 = local98 >= 64425238954L;
							local5 &= local111;
							if (!local111) {
								local3.method14875(256, -977598877);
							}
					}
				}
			} catch (@Pc(142) Exception local142) {
				local3.method14875(4096, 1428158698);
			}
		}
		if (local9) {
			try {
				Class51.options.method14363(Class51.options.aClass166_Sub45_1, 5, (byte) 53);
				Class106_Sub1.method5135(-137038787);
				local63 = Class78.method1316(5, 1000, 1323350560);
				if (Class51.options.aClass166_Sub4_2.method15426((byte) 31) == 5) {
					local3.method14875(8192, -537301305);
				}
			} catch (@Pc(173) Exception local173) {
				local3.method14875(32768, -769963449);
			}
		}
		if (local5) {
			try {
				Class51.options.method14363(Class51.options.aClass166_Sub45_1, 4, (byte) 62);
				Class106_Sub1.method5135(1965936072);
				local59 = Class78.method1316(1, 1000, 1323350560);
				if (Class51.options.aClass166_Sub4_2.method15426((byte) 75) == 1) {
					local3.method14875(2, 399925894);
				}
			} catch (@Pc(204) Exception local204) {
				local3.method14875(2048, -22813249);
			}
		}
		Class51.options.method14363(Class51.options.aClass166_Sub45_1, 0, (byte) 35);
		if (local59 == -1 && local61 == -1) {
			Class155_Sub2.method15310(local3, -602061204);
			return local3;
		}
		local3.method14883(3, local61, (short) 832);
		local3.method14883(1, local59, (short) 832);
		local3.method14883(5, local63, (short) 832);
		local61 = (int) ((float) local61 * 1.3F);
		if ((local61 <= 100000 || local59 <= 100000) && local61 <= local59) {
			Class251.method25970(local3, 1, local61 == -1 ? local59 : local61, (byte) 106);
		} else {
			Class251.method25970(local3, 3, local59 == -1 ? local61 : local59, (byte) 111);
		}
		return local3;
	}

	@OriginalMember(owner = "client!hp", name = "k", descriptor = "(B)Z", line = 100)
	static boolean method27219(@OriginalArg(0) byte arg0) {
		try {
			@Pc(3) Class91 local3 = new Class91();
			@Pc(8) byte[] local8 = local3.method1703(Class366.aByteArray86, -227101470);
			Class288.method26547(local8, -699304736);
			return true;
		} catch (@Pc(15) Exception local15) {
			return false;
		}
	}

	@OriginalMember(owner = "client!hp", name = "ay", descriptor = "(Lclient!dh;IIIIIII)V", line = 1145)
	static void method27220(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		arg0.method20469(arg1, arg2, arg3, arg4, arg5, (byte) 69);
		arg0.method20469(arg1 + 1, arg2 + 1, arg3 - 2, 16, arg6, (byte) 80);
		arg0.method20465(arg1 + 1, arg2 + 18, arg3 - 2, arg4 - 19, arg6, 1373199322);
	}

	@OriginalMember(owner = "client!hp", name = "cg", descriptor = "(Lclient!yf;I)V", line = 5304)
	static final void method27221(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class286.method26529(local11, local14, arg0, -1706148552);
	}

	@OriginalMember(owner = "client!hp", name = "vq", descriptor = "(Lclient!yf;I)V", line = 8723)
	static final void method27222(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(14) Class312 local14 = Class659.method32808(arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091], 161735741);
		if (local14.aClass312Array2 == null) {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
			return;
		}
		@Pc(38) int local38 = local14.aClass312Array2.length;
		for (@Pc(40) int local40 = 0; local40 < local14.aClass312Array2.length; local40++) {
			if (local14.aClass312Array2[local40] == null) {
				local38 = local40;
				break;
			}
		}
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local38;
	}

	@OriginalMember(owner = "client!hp", name = "alm", descriptor = "(Lclient!yf;I)V", line = 11814)
	static final void method27223(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(28) boolean local28 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1] == 1;
		if (!Class642.method32519(local13, local28, 1726186060)) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hp", name = "bbh", descriptor = "(Lclient!yf;I)V", line = 14418)
	static final void method27224(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!hp", name = "bfz", descriptor = "(Lclient!yf;I)V", line = 15149)
	static final void method27225(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 1;
	}
}
