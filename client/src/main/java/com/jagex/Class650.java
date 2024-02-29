package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wx")
public class Class650 {

	@OriginalMember(owner = "client!wx", name = "k", descriptor = "Lclient!uc;")
	static Class590 aClass590_3;

	@OriginalMember(owner = "client!wx", name = "aj", descriptor = "I")
	public static int anInt5796;

	@OriginalMember(owner = "client!wx", name = "pv", descriptor = "I")
	static int anInt5797;

	@OriginalMember(owner = "client!wx", name = "e", descriptor = "Lclient!vt;")
	public Interface67 anInterface67_5;

	@OriginalMember(owner = "client!wx", name = "<init>", descriptor = "(Lclient!py;)V", line = 11)
	public Class650(@OriginalArg(0) Class497 arg0) {
		@Pc(9) byte[] local9 = arg0.method30079(Class649.aClass649_6.anInt5795 * -51136173, (byte) 19);
		if (local9 != null) {
			this.method32663(new Class93_Sub41(local9), -827422185);
		}
	}

	@OriginalMember(owner = "client!wx", name = "k", descriptor = "(Lclient!alw;)V", line = 18)
	void method32662(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22465((short) 16384);
			if (local3 == 0) {
				return;
			}
			if (local3 == 1) {
				this.anInterface67_5 = Class118.method8408(arg0, 1750994723);
			}
		}
	}

	@OriginalMember(owner = "client!wx", name = "e", descriptor = "(Lclient!alw;I)V", line = 18)
	void method32663(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(3) int local3 = arg0.method22465((short) 16384);
			if (local3 == 0) {
				return;
			}
			if (local3 == 1) {
				this.anInterface67_5 = Class118.method8408(arg0, 1750994723);
			}
		}
	}

	@OriginalMember(owner = "client!wx", name = "n", descriptor = "(Lclient!alw;)V", line = 18)
	void method32664(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22465((short) 16384);
			if (local3 == 0) {
				return;
			}
			if (local3 == 1) {
				this.anInterface67_5 = Class118.method8408(arg0, 1750994723);
			}
		}
	}

	@OriginalMember(owner = "client!wx", name = "m", descriptor = "(Lclient!alw;)V", line = 18)
	void method32665(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22465((short) 16384);
			if (local3 == 0) {
				return;
			}
			if (local3 == 1) {
				this.anInterface67_5 = Class118.method8408(arg0, 1750994723);
			}
		}
	}

	@OriginalMember(owner = "client!wx", name = "f", descriptor = "(Lclient!alw;)V", line = 18)
	void method32666(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22465((short) 16384);
			if (local3 == 0) {
				return;
			}
			if (local3 == 1) {
				this.anInterface67_5 = Class118.method8408(arg0, 1750994723);
			}
		}
	}

	@OriginalMember(owner = "client!wx", name = "n", descriptor = "(Lclient!py;Lclient!xq;II)[B", line = 23)
	static byte[] method32667(@OriginalArg(0) Class497 arg0, @OriginalArg(1) Class667 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return arg1.method32908(-557665170) > 1 ? arg0.method30064(arg1.method32912(arg2, 126261900), arg1.method32913(arg2, -2013658697), (byte) 0) : arg0.method30064(arg1.anInt5849 * -1772702343, arg2, (byte) 0);
	}

	@OriginalMember(owner = "client!wx", name = "k", descriptor = "([[B[[B[B[B[BIIB)I", line = 119)
	static int method32668(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte arg7) {
		@Pc(3) byte local3 = arg2[arg5];
		@Pc(9) int local9 = local3 + arg4[arg5];
		@Pc(13) byte local13 = arg2[arg6];
		@Pc(19) int local19 = arg4[arg6] + local13;
		@Pc(21) byte local21 = local3;
		if (local13 > local3) {
			local21 = local13;
		}
		@Pc(28) int local28 = local9;
		if (local19 < local9) {
			local28 = local19;
		}
		@Pc(39) int local39 = arg3[arg5] & 0xFF;
		if ((arg3[arg6] & 0xFF) < local39) {
			local39 = arg3[arg6] & 0xFF;
		}
		@Pc(56) byte[] local56 = arg1[arg5];
		@Pc(60) byte[] local60 = arg0[arg6];
		@Pc(64) int local64 = local21 - local3;
		@Pc(68) int local68 = local21 - local13;
		for (@Pc(70) int local70 = local21; local70 < local28; local70++) {
			@Pc(83) int local83 = local56[local64++] + local60[local68++];
			if (local83 < local39) {
				local39 = local83;
			}
		}
		return -local39;
	}

	@OriginalMember(owner = "client!wx", name = "bco", descriptor = "(Lclient!yf;B)V", line = 14687)
	static final void method32669(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5891 -= 1189701933;
	}
}
