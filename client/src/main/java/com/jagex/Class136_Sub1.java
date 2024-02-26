package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aib")
public final class Class136_Sub1 extends Class136 {

	@OriginalMember(owner = "client!aib", name = "j", descriptor = "F")
	public static float aFloat121 = 1.0F;

	@OriginalMember(owner = "client!aib", name = "a", descriptor = "F")
	public static float aFloat122 = 0.0F;

	@OriginalMember(owner = "client!aib", name = "s", descriptor = "F")
	public static float aFloat123 = 1.0F;

	@OriginalMember(owner = "client!aib", name = "k", descriptor = "F")
	public static float aFloat124 = 0.0F;

	@OriginalMember(owner = "client!aib", name = "x", descriptor = "F")
	public static float aFloat125 = 1.0F;

	@OriginalMember(owner = "client!aib", name = "i", descriptor = "Lclient!aqv;")
	Class80_Sub13_Sub1 aClass80_Sub13_Sub1_25;

	@OriginalMember(owner = "client!aib", name = "l", descriptor = "Lclient!aqv;")
	Class80_Sub13_Sub1 aClass80_Sub13_Sub1_26;

	@OriginalMember(owner = "client!aib", name = "e", descriptor = "Lclient!hb;")
	Class113 aClass113_6;

	@OriginalMember(owner = "client!aib", name = "u", descriptor = "Lclient!ht;")
	Class114 aClass114_5;

	@OriginalMember(owner = "client!aib", name = "m", descriptor = "Lclient!aqv;")
	Class80_Sub13_Sub1 aClass80_Sub13_Sub1_27;

	@OriginalMember(owner = "client!aib", name = "o", descriptor = "Lclient!aqv;")
	Class80_Sub13_Sub1 aClass80_Sub13_Sub1_28;

	@OriginalMember(owner = "client!aib", name = "g", descriptor = "Lclient!aqv;")
	Class80_Sub13_Sub1 aClass80_Sub13_Sub1_29;

	@OriginalMember(owner = "client!aib", name = "w", descriptor = "Z")
	boolean aBoolean222;

	@OriginalMember(owner = "client!aib", name = "<init>", descriptor = "(Lclient!afa;)V")
	public Class136_Sub1(@OriginalArg(0) Class102_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!aib", name = "w", descriptor = "()Z")
	@Override
	boolean method11196() {
		return this.aClass102_Sub1_25.aBoolean529 && this.aClass102_Sub1_25.method21207();
	}

	@OriginalMember(owner = "client!aib", name = "p", descriptor = "()V")
	@Override
	void method11202() {
	}

	@OriginalMember(owner = "client!aib", name = "f", descriptor = "()Z")
	@Override
	boolean method11183() {
		return this.aBoolean222;
	}

	@OriginalMember(owner = "client!aib", name = "c", descriptor = "(II)V")
	@Override
	void method11206(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!aib", name = "g", descriptor = "(II)V")
	@Override
	void method11184(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!aib", name = "l", descriptor = "()V")
	@Override
	void method11216() {
	}

	@OriginalMember(owner = "client!aib", name = "ac", descriptor = "()I")
	@Override
	int method11212() {
		return 1;
	}

	@OriginalMember(owner = "client!aib", name = "i", descriptor = "(ILclient!afo;Lclient!lb;Lclient!de;Lclient!lb;Z)V")
	@Override
	void method11188(@OriginalArg(0) int arg0, @OriginalArg(1) Class108_Sub1 arg1, @OriginalArg(2) Interface34 arg2, @OriginalArg(3) Interface17 arg3, @OriginalArg(4) Interface34 arg4, @OriginalArg(5) boolean arg5) {
		@Pc(3) float local3 = this.aClass102_Sub1_25.method21132();
		@Pc(7) float local7 = (float) arg1.method24036();
		@Pc(11) float local11 = (float) arg1.method24037();
		@Pc(17) float local17 = local3 * 2.0F / local7;
		@Pc(24) float local24 = -local3 * 2.0F / local11;
		@Pc(87) float[] local87 = new float[] { -1.0F + local17, local24 + 1.0F, 0.0F, 0.0F, -1.0F + local17, -3.0F + local24, 0.0F, 2.0F, local17 + 3.0F, local24 + 1.0F, 2.0F, 0.0F };
		@Pc(90) int local90 = (int) local7;
		@Pc(93) int local93 = (int) local11;
		@Pc(103) int local103 = arg5 ? this.aClass102_Sub1_25.method20709(458665320).method24036() : local90;
		@Pc(113) int local113 = arg5 ? this.aClass102_Sub1_25.method20709(-12825097).method24037() : local93;
		this.aClass113_6.method8295(this.aClass114_5);
		this.aClass113_6.method8256();
		@Pc(127) float local127 = (float) local90 / local7;
		@Pc(132) float local132 = (float) local93 / local11;
		@Pc(137) float local137 = (float) local103 / local7;
		@Pc(142) float local142 = (float) local113 / local11;
		local87[8] = (local87[8] + 1.0F) * local127 - 1.0F;
		local87[5] = (local87[5] - 1.0F) * local132 + 1.0F;
		local87[10] *= local137;
		local87[7] *= local142;
		this.aClass113_6.method8353(this.aClass80_Sub13_Sub1_28, local87, 1924444804);
		this.aClass113_6.method8280(this.aClass80_Sub13_Sub1_26, 0, arg2, (short) 17646);
		this.aClass113_6.method8270(this.aClass80_Sub13_Sub1_29, aFloat121, -1482599576);
		this.aClass113_6.method8273(this.aClass80_Sub13_Sub1_25, aFloat122, aFloat123, aFloat124, aFloat125, -94575296);
		this.aClass113_6.method8273(this.aClass80_Sub13_Sub1_27, 0.0F, 0.0F, 0.0F, 0.0F, 466320227);
		this.aClass102_Sub1_25.method20706(0, 0, local90, local93);
	}

	@OriginalMember(owner = "client!aib", name = "m", descriptor = "(I)V")
	@Override
	void method11205(@OriginalArg(0) int arg0) {
		this.aClass113_6.method8257();
	}

	@OriginalMember(owner = "client!aib", name = "a", descriptor = "()I")
	@Override
	int method11192() {
		return 0;
	}

	@OriginalMember(owner = "client!aib", name = "ag", descriptor = "()I")
	@Override
	int method11187() {
		return 1;
	}

	@OriginalMember(owner = "client!aib", name = "x", descriptor = "()Z")
	@Override
	boolean method11195() {
		return aFloat121 == 1.0F && aFloat122 == 0.0F && aFloat123 == 1.0F && aFloat124 == 0.0F && aFloat125 == 1.0F;
	}

	@OriginalMember(owner = "client!aib", name = "av", descriptor = "()Z")
	@Override
	boolean method11223() {
		return aFloat121 == 1.0F && aFloat122 == 0.0F && aFloat123 == 1.0F && aFloat124 == 0.0F && aFloat125 == 1.0F;
	}

	@OriginalMember(owner = "client!aib", name = "r", descriptor = "()Z")
	@Override
	boolean method11197() {
		return this.aClass102_Sub1_25.aBoolean529 && this.aClass102_Sub1_25.method21207();
	}

	@OriginalMember(owner = "client!aib", name = "q", descriptor = "()Z")
	@Override
	boolean method11198() {
		return this.aBoolean222;
	}

	@OriginalMember(owner = "client!aib", name = "h", descriptor = "()Z")
	@Override
	boolean method11191() {
		if (!this.method11182()) {
			return false;
		}
		this.aClass113_6 = this.aClass102_Sub1_25.method21142("FilterLevels");
		if (this.aClass113_6 == null) {
			return false;
		}
		try {
			this.aClass80_Sub13_Sub1_26 = this.aClass113_6.method8302("sceneTex", 2092472259);
			this.aClass80_Sub13_Sub1_29 = this.aClass113_6.method8302("paramsGamma", 2104127093);
			this.aClass80_Sub13_Sub1_25 = this.aClass113_6.method8302("paramsRanges", 1996839447);
			this.aClass80_Sub13_Sub1_27 = this.aClass113_6.method8302("pixelOffset", 2053755943);
			this.aClass80_Sub13_Sub1_28 = this.aClass113_6.method8302("PosAndTexCoords", 2101861054);
			this.aClass114_5 = this.aClass113_6.method8377("techAdjust", (byte) 7);
		} catch (@Pc(57) Exception_Sub5_Sub2 local57) {
			return false;
		} catch (@Pc(60) Exception_Sub5_Sub1 local60) {
			return false;
		}
		if (this.aClass114_5.method8577()) {
			this.aBoolean222 = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!aib", name = "o", descriptor = "()I")
	@Override
	int method11190() {
		return 1;
	}

	@OriginalMember(owner = "client!aib", name = "ab", descriptor = "()I")
	@Override
	int method11215() {
		return 1;
	}

	@OriginalMember(owner = "client!aib", name = "af", descriptor = "()I")
	@Override
	int method11186() {
		return 0;
	}

	@OriginalMember(owner = "client!aib", name = "v", descriptor = "()V")
	@Override
	void method11203() {
	}

	@OriginalMember(owner = "client!aib", name = "y", descriptor = "(II)V")
	@Override
	void method11204(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!aib", name = "t", descriptor = "()Z")
	@Override
	boolean method11182() {
		return this.aClass102_Sub1_25.aBoolean529 && this.aClass102_Sub1_25.method21207();
	}

	@OriginalMember(owner = "client!aib", name = "z", descriptor = "()Z")
	@Override
	boolean method11201() {
		if (!this.method11182()) {
			return false;
		}
		this.aClass113_6 = this.aClass102_Sub1_25.method21142("FilterLevels");
		if (this.aClass113_6 == null) {
			return false;
		}
		try {
			this.aClass80_Sub13_Sub1_26 = this.aClass113_6.method8302("sceneTex", 2084446402);
			this.aClass80_Sub13_Sub1_29 = this.aClass113_6.method8302("paramsGamma", 1948964396);
			this.aClass80_Sub13_Sub1_25 = this.aClass113_6.method8302("paramsRanges", 2142082114);
			this.aClass80_Sub13_Sub1_27 = this.aClass113_6.method8302("pixelOffset", 2042186100);
			this.aClass80_Sub13_Sub1_28 = this.aClass113_6.method8302("PosAndTexCoords", 2053388845);
			this.aClass114_5 = this.aClass113_6.method8377("techAdjust", (byte) -83);
		} catch (@Pc(57) Exception_Sub5_Sub2 local57) {
			return false;
		} catch (@Pc(60) Exception_Sub5_Sub1 local60) {
			return false;
		}
		if (this.aClass114_5.method8577()) {
			this.aBoolean222 = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!aib", name = "b", descriptor = "(II)V")
	@Override
	void method11207(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!aib", name = "ax", descriptor = "(ILclient!afo;Lclient!lb;Lclient!de;Lclient!lb;Z)V")
	@Override
	void method11181(@OriginalArg(0) int arg0, @OriginalArg(1) Class108_Sub1 arg1, @OriginalArg(2) Interface34 arg2, @OriginalArg(3) Interface17 arg3, @OriginalArg(4) Interface34 arg4, @OriginalArg(5) boolean arg5) {
		@Pc(3) float local3 = this.aClass102_Sub1_25.method21132();
		@Pc(7) float local7 = (float) arg1.method24036();
		@Pc(11) float local11 = (float) arg1.method24037();
		@Pc(17) float local17 = local3 * 2.0F / local7;
		@Pc(24) float local24 = -local3 * 2.0F / local11;
		@Pc(87) float[] local87 = new float[] { -1.0F + local17, local24 + 1.0F, 0.0F, 0.0F, -1.0F + local17, -3.0F + local24, 0.0F, 2.0F, local17 + 3.0F, local24 + 1.0F, 2.0F, 0.0F };
		@Pc(90) int local90 = (int) local7;
		@Pc(93) int local93 = (int) local11;
		@Pc(103) int local103 = arg5 ? this.aClass102_Sub1_25.method20709(905491415).method24036() : local90;
		@Pc(113) int local113 = arg5 ? this.aClass102_Sub1_25.method20709(1605819894).method24037() : local93;
		this.aClass113_6.method8295(this.aClass114_5);
		this.aClass113_6.method8256();
		@Pc(127) float local127 = (float) local90 / local7;
		@Pc(132) float local132 = (float) local93 / local11;
		@Pc(137) float local137 = (float) local103 / local7;
		@Pc(142) float local142 = (float) local113 / local11;
		local87[8] = (local87[8] + 1.0F) * local127 - 1.0F;
		local87[5] = (local87[5] - 1.0F) * local132 + 1.0F;
		local87[10] *= local137;
		local87[7] *= local142;
		this.aClass113_6.method8353(this.aClass80_Sub13_Sub1_28, local87, 972280403);
		this.aClass113_6.method8280(this.aClass80_Sub13_Sub1_26, 0, arg2, (short) 25145);
		this.aClass113_6.method8270(this.aClass80_Sub13_Sub1_29, aFloat121, -1996607412);
		this.aClass113_6.method8273(this.aClass80_Sub13_Sub1_25, aFloat122, aFloat123, aFloat124, aFloat125, -476499592);
		this.aClass113_6.method8273(this.aClass80_Sub13_Sub1_27, 0.0F, 0.0F, 0.0F, 0.0F, 564931286);
		this.aClass102_Sub1_25.method20706(0, 0, local90, local93);
	}

	@OriginalMember(owner = "client!aib", name = "ay", descriptor = "(ILclient!afo;Lclient!lb;Lclient!de;Lclient!lb;Z)V")
	@Override
	void method11209(@OriginalArg(0) int arg0, @OriginalArg(1) Class108_Sub1 arg1, @OriginalArg(2) Interface34 arg2, @OriginalArg(3) Interface17 arg3, @OriginalArg(4) Interface34 arg4, @OriginalArg(5) boolean arg5) {
		@Pc(3) float local3 = this.aClass102_Sub1_25.method21132();
		@Pc(7) float local7 = (float) arg1.method24036();
		@Pc(11) float local11 = (float) arg1.method24037();
		@Pc(17) float local17 = local3 * 2.0F / local7;
		@Pc(24) float local24 = -local3 * 2.0F / local11;
		@Pc(87) float[] local87 = new float[] { -1.0F + local17, local24 + 1.0F, 0.0F, 0.0F, -1.0F + local17, -3.0F + local24, 0.0F, 2.0F, local17 + 3.0F, local24 + 1.0F, 2.0F, 0.0F };
		@Pc(90) int local90 = (int) local7;
		@Pc(93) int local93 = (int) local11;
		@Pc(103) int local103 = arg5 ? this.aClass102_Sub1_25.method20709(-1849408702).method24036() : local90;
		@Pc(113) int local113 = arg5 ? this.aClass102_Sub1_25.method20709(815254675).method24037() : local93;
		this.aClass113_6.method8295(this.aClass114_5);
		this.aClass113_6.method8256();
		@Pc(127) float local127 = (float) local90 / local7;
		@Pc(132) float local132 = (float) local93 / local11;
		@Pc(137) float local137 = (float) local103 / local7;
		@Pc(142) float local142 = (float) local113 / local11;
		local87[8] = (local87[8] + 1.0F) * local127 - 1.0F;
		local87[5] = (local87[5] - 1.0F) * local132 + 1.0F;
		local87[10] *= local137;
		local87[7] *= local142;
		this.aClass113_6.method8353(this.aClass80_Sub13_Sub1_28, local87, 808789645);
		this.aClass113_6.method8280(this.aClass80_Sub13_Sub1_26, 0, arg2, (short) 32225);
		this.aClass113_6.method8270(this.aClass80_Sub13_Sub1_29, aFloat121, 1080309079);
		this.aClass113_6.method8273(this.aClass80_Sub13_Sub1_25, aFloat122, aFloat123, aFloat124, aFloat125, 1610425732);
		this.aClass113_6.method8273(this.aClass80_Sub13_Sub1_27, 0.0F, 0.0F, 0.0F, 0.0F, -470037561);
		this.aClass102_Sub1_25.method20706(0, 0, local90, local93);
	}

	@OriginalMember(owner = "client!aib", name = "ai", descriptor = "(I)V")
	@Override
	void method11210(@OriginalArg(0) int arg0) {
		this.aClass113_6.method8257();
	}

	@OriginalMember(owner = "client!aib", name = "aq", descriptor = "(I)V")
	@Override
	void method11211(@OriginalArg(0) int arg0) {
		this.aClass113_6.method8257();
	}

	@OriginalMember(owner = "client!aib", name = "ao", descriptor = "(I)V")
	@Override
	void method11189(@OriginalArg(0) int arg0) {
		this.aClass113_6.method8257();
	}

	@OriginalMember(owner = "client!aib", name = "aj", descriptor = "()I")
	@Override
	int method11213() {
		return 1;
	}

	@OriginalMember(owner = "client!aib", name = "e", descriptor = "()Z")
	@Override
	boolean method11199() {
		if (!this.method11182()) {
			return false;
		}
		this.aClass113_6 = this.aClass102_Sub1_25.method21142("FilterLevels");
		if (this.aClass113_6 == null) {
			return false;
		}
		try {
			this.aClass80_Sub13_Sub1_26 = this.aClass113_6.method8302("sceneTex", 2000522856);
			this.aClass80_Sub13_Sub1_29 = this.aClass113_6.method8302("paramsGamma", 2062825461);
			this.aClass80_Sub13_Sub1_25 = this.aClass113_6.method8302("paramsRanges", 2048964714);
			this.aClass80_Sub13_Sub1_27 = this.aClass113_6.method8302("pixelOffset", 2086500548);
			this.aClass80_Sub13_Sub1_28 = this.aClass113_6.method8302("PosAndTexCoords", 2040626584);
			this.aClass114_5 = this.aClass113_6.method8377("techAdjust", (byte) -76);
		} catch (@Pc(57) Exception_Sub5_Sub2 local57) {
			return false;
		} catch (@Pc(60) Exception_Sub5_Sub1 local60) {
			return false;
		}
		if (this.aClass114_5.method8577()) {
			this.aBoolean222 = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!aib", name = "n", descriptor = "(II)V")
	@Override
	void method11200(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!aib", name = "al", descriptor = "()I")
	@Override
	int method11218() {
		return 1;
	}

	@OriginalMember(owner = "client!aib", name = "d", descriptor = "()Z")
	@Override
	boolean method11208() {
		if (!this.method11182()) {
			return false;
		}
		this.aClass113_6 = this.aClass102_Sub1_25.method21142("FilterLevels");
		if (this.aClass113_6 == null) {
			return false;
		}
		try {
			this.aClass80_Sub13_Sub1_26 = this.aClass113_6.method8302("sceneTex", 1978402352);
			this.aClass80_Sub13_Sub1_29 = this.aClass113_6.method8302("paramsGamma", 2053737265);
			this.aClass80_Sub13_Sub1_25 = this.aClass113_6.method8302("paramsRanges", 2108075737);
			this.aClass80_Sub13_Sub1_27 = this.aClass113_6.method8302("pixelOffset", 1940660952);
			this.aClass80_Sub13_Sub1_28 = this.aClass113_6.method8302("PosAndTexCoords", 2010843746);
			this.aClass114_5 = this.aClass113_6.method8377("techAdjust", (byte) 116);
		} catch (@Pc(57) Exception_Sub5_Sub2 local57) {
			return false;
		} catch (@Pc(60) Exception_Sub5_Sub1 local60) {
			return false;
		}
		if (this.aClass114_5.method8577()) {
			this.aBoolean222 = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!aib", name = "ah", descriptor = "()I")
	@Override
	int method11217() {
		return 0;
	}

	@OriginalMember(owner = "client!aib", name = "j", descriptor = "()I")
	@Override
	int method11221() {
		return 1;
	}
}
