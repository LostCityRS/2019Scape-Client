package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aid")
public final class Class136_Sub2 extends Class136 {

	@OriginalMember(owner = "client!aid", name = "e", descriptor = "I")
	static final int anInt1230 = 256;

	@OriginalMember(owner = "client!aid", name = "u", descriptor = "F")
	public static float aFloat126 = 0.25F;

	@OriginalMember(owner = "client!aid", name = "l", descriptor = "F")
	public static float aFloat129 = 1.0F;

	@OriginalMember(owner = "client!aid", name = "g", descriptor = "F")
	public static float aFloat127 = 1.0F;

	@OriginalMember(owner = "client!aid", name = "i", descriptor = "F")
	public static float aFloat128 = 1.0F;

	@OriginalMember(owner = "client!aid", name = "x", descriptor = "Lclient!aqv;")
	Class80_Sub13_Sub1 aClass80_Sub13_Sub1_30;

	@OriginalMember(owner = "client!aid", name = "j", descriptor = "Lclient!ht;")
	Class114 aClass114_6;

	@OriginalMember(owner = "client!aid", name = "m", descriptor = "Lclient!hb;")
	Class113 aClass113_7;

	@OriginalMember(owner = "client!aid", name = "o", descriptor = "Lclient!ht;")
	Class114 aClass114_7;

	@OriginalMember(owner = "client!aid", name = "a", descriptor = "Lclient!ht;")
	Class114 aClass114_8;

	@OriginalMember(owner = "client!aid", name = "s", descriptor = "Lclient!ht;")
	Class114 aClass114_9;

	@OriginalMember(owner = "client!aid", name = "k", descriptor = "Lclient!ht;")
	Class114 aClass114_10;

	@OriginalMember(owner = "client!aid", name = "d", descriptor = "Lclient!aqv;")
	Class80_Sub13_Sub1 aClass80_Sub13_Sub1_31;

	@OriginalMember(owner = "client!aid", name = "r", descriptor = "Lclient!aqv;")
	Class80_Sub13_Sub1 aClass80_Sub13_Sub1_32;

	@OriginalMember(owner = "client!aid", name = "h", descriptor = "Lclient!aqv;")
	Class80_Sub13_Sub1 aClass80_Sub13_Sub1_33;

	@OriginalMember(owner = "client!aid", name = "w", descriptor = "Lclient!aqv;")
	Class80_Sub13_Sub1 aClass80_Sub13_Sub1_34;

	@OriginalMember(owner = "client!aid", name = "z", descriptor = "Z")
	boolean aBoolean224;

	@OriginalMember(owner = "client!aid", name = "q", descriptor = "Lclient!aqv;")
	Class80_Sub13_Sub1 aClass80_Sub13_Sub1_35;

	@OriginalMember(owner = "client!aid", name = "<init>", descriptor = "(Lclient!afa;)V")
	public Class136_Sub2(@OriginalArg(0) Class102_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!aid", name = "av", descriptor = "()Z")
	@Override
	boolean method11223() {
		return false;
	}

	@OriginalMember(owner = "client!aid", name = "t", descriptor = "()Z")
	@Override
	boolean method11182() {
		return this.aClass102_Sub1_25.aBoolean529 && this.aClass102_Sub1_25.method21207() && this.aClass102_Sub1_25.method21322(true);
	}

	@OriginalMember(owner = "client!aid", name = "f", descriptor = "()Z")
	@Override
	boolean method11183() {
		return this.aBoolean224;
	}

	@OriginalMember(owner = "client!aid", name = "e", descriptor = "()Z")
	@Override
	boolean method11199() {
		if (!this.method11182()) {
			return false;
		}
		this.aClass113_7 = this.aClass102_Sub1_25.method21142("FilterBloom");
		if (this.aClass113_7 == null) {
			return false;
		}
		try {
			this.aClass80_Sub13_Sub1_30 = this.aClass113_7.method8302("sceneTex", 2137932609);
			this.aClass80_Sub13_Sub1_34 = this.aClass113_7.method8302("bloomTex1", 2023474655);
			this.aClass80_Sub13_Sub1_32 = this.aClass113_7.method8302("params", 2120998761);
			this.aClass80_Sub13_Sub1_35 = this.aClass113_7.method8302("sampleSize", 2039498164);
			this.aClass80_Sub13_Sub1_33 = this.aClass113_7.method8302("pixelOffsetAndBloomScale", 2140473103);
			this.aClass80_Sub13_Sub1_31 = this.aClass113_7.method8302("PosAndTexCoords", 2131052151);
			this.aClass113_7.method8377("test", (byte) -22);
			this.aClass114_7 = this.aClass113_7.method8377("techFullscreenTri", (byte) 34);
			this.aClass114_6 = this.aClass113_7.method8377("brightpass", (byte) -68);
			this.aClass114_8 = this.aClass113_7.method8377("blur", (byte) 17);
			this.aClass114_9 = this.aClass113_7.method8377("composite", (byte) -10);
			this.aClass114_10 = this.aClass113_7.method8377("techDefault", (byte) -37);
		} catch (@Pc(98) Exception_Sub5_Sub2 local98) {
			return false;
		} catch (@Pc(101) Exception_Sub5_Sub1 local101) {
			return false;
		}
		if (!this.aClass114_7.method8577()) {
			return false;
		} else if (!this.aClass114_6.method8577()) {
			return false;
		} else if (!this.aClass114_8.method8577()) {
			return false;
		} else if (!this.aClass114_9.method8577()) {
			return false;
		} else if (this.aClass114_10.method8577()) {
			this.aBoolean224 = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!aid", name = "j", descriptor = "()I")
	@Override
	int method11221() {
		return 0;
	}

	@OriginalMember(owner = "client!aid", name = "aj", descriptor = "()I")
	@Override
	int method11213() {
		return 4;
	}

	@OriginalMember(owner = "client!aid", name = "o", descriptor = "()I")
	@Override
	int method11190() {
		return 4;
	}

	@OriginalMember(owner = "client!aid", name = "i", descriptor = "(ILclient!afo;Lclient!lb;Lclient!de;Lclient!lb;Z)V")
	@Override
	void method11188(@OriginalArg(0) int arg0, @OriginalArg(1) Class108_Sub1 arg1, @OriginalArg(2) Interface34 arg2, @OriginalArg(3) Interface17 arg3, @OriginalArg(4) Interface34 arg4, @OriginalArg(5) boolean arg5) {
		@Pc(3) float local3 = this.aClass102_Sub1_25.method21132();
		@Pc(7) float local7 = (float) arg1.method24036();
		@Pc(11) float local11 = (float) arg1.method24037();
		@Pc(13) Interface34 local13 = arg2;
		@Pc(19) float local19 = local3 * 2.0F / local7;
		@Pc(26) float local26 = -local3 * 2.0F / local11;
		@Pc(89) float[] local89 = new float[] { -1.0F + local19, local26 + 1.0F, 0.0F, 0.0F, -1.0F + local19, -3.0F + local26, 0.0F, 2.0F, local19 + 3.0F, local26 + 1.0F, 2.0F, 0.0F };
		@Pc(92) int local92 = (int) local7;
		@Pc(95) int local95 = (int) local11;
		@Pc(105) int local105 = arg5 ? this.aClass102_Sub1_25.method20709(-859860074).method24036() : local92;
		@Pc(115) int local115 = arg5 ? this.aClass102_Sub1_25.method20709(-817366911).method24037() : local95;
		if (arg0 == 0) {
			local92 = 256;
			local95 = 256;
			this.aClass113_7.method8295(this.aClass114_6);
			this.aClass113_7.method8256();
		} else if (arg0 == 1) {
			local92 = 256;
			local95 = 256;
			local105 = local92;
			local115 = local95;
			this.aClass113_7.method8295(this.aClass114_8);
			this.aClass113_7.method8256();
			this.aClass113_7.method8271(this.aClass80_Sub13_Sub1_35, aFloat128 / local7, 0.0F, -1483703311);
		} else if (arg0 == 2) {
			local92 = 256;
			local95 = 256;
			local105 = local92;
			local115 = local95;
			this.aClass113_7.method8295(this.aClass114_8);
			this.aClass113_7.method8256();
			this.aClass113_7.method8271(this.aClass80_Sub13_Sub1_35, 0.0F, aFloat128 / local11, -582129058);
		} else if (arg0 == 3) {
			this.aClass113_7.method8295(this.aClass114_9);
			local13 = arg4;
			this.aClass113_7.method8280(this.aClass80_Sub13_Sub1_34, 1, arg2, (short) 17110);
			this.aClass113_7.method8256();
		}
		@Pc(220) float local220 = (float) local92 / local7;
		@Pc(225) float local225 = (float) local95 / local11;
		@Pc(230) float local230 = (float) local105 / local7;
		@Pc(235) float local235 = (float) local115 / local11;
		local89[8] = (local89[8] + 1.0F) * local220 - 1.0F;
		local89[5] = (local89[5] - 1.0F) * local225 + 1.0F;
		local89[10] *= local230;
		local89[7] *= local235;
		this.aClass113_7.method8353(this.aClass80_Sub13_Sub1_31, local89, -418026605);
		this.aClass113_7.method8280(this.aClass80_Sub13_Sub1_30, 0, local13, (short) 25465);
		this.aClass113_7.method8273(this.aClass80_Sub13_Sub1_32, aFloat127, aFloat126, aFloat129, 0.0F, 727599453);
		this.aClass113_7.method8273(this.aClass80_Sub13_Sub1_33, 0.0F, 0.0F, 256.0F / local7, 256.0F / local11, -396873216);
		this.aClass102_Sub1_25.method20706(0, 0, local92, local95);
	}

	@OriginalMember(owner = "client!aid", name = "m", descriptor = "(I)V")
	@Override
	void method11205(@OriginalArg(0) int arg0) {
		this.aClass113_7.method8257();
	}

	@OriginalMember(owner = "client!aid", name = "a", descriptor = "()I")
	@Override
	int method11192() {
		return 1;
	}

	@OriginalMember(owner = "client!aid", name = "ah", descriptor = "()I")
	@Override
	int method11217() {
		return 1;
	}

	@OriginalMember(owner = "client!aid", name = "x", descriptor = "()Z")
	@Override
	boolean method11195() {
		return false;
	}

	@OriginalMember(owner = "client!aid", name = "w", descriptor = "()Z")
	@Override
	boolean method11196() {
		return this.aClass102_Sub1_25.aBoolean529 && this.aClass102_Sub1_25.method21207() && this.aClass102_Sub1_25.method21322(true);
	}

	@OriginalMember(owner = "client!aid", name = "r", descriptor = "()Z")
	@Override
	boolean method11197() {
		return this.aClass102_Sub1_25.aBoolean529 && this.aClass102_Sub1_25.method21207() && this.aClass102_Sub1_25.method21322(true);
	}

	@OriginalMember(owner = "client!aid", name = "q", descriptor = "()Z")
	@Override
	boolean method11198() {
		return this.aBoolean224;
	}

	@OriginalMember(owner = "client!aid", name = "ay", descriptor = "(ILclient!afo;Lclient!lb;Lclient!de;Lclient!lb;Z)V")
	@Override
	void method11209(@OriginalArg(0) int arg0, @OriginalArg(1) Class108_Sub1 arg1, @OriginalArg(2) Interface34 arg2, @OriginalArg(3) Interface17 arg3, @OriginalArg(4) Interface34 arg4, @OriginalArg(5) boolean arg5) {
		@Pc(3) float local3 = this.aClass102_Sub1_25.method21132();
		@Pc(7) float local7 = (float) arg1.method24036();
		@Pc(11) float local11 = (float) arg1.method24037();
		@Pc(13) Interface34 local13 = arg2;
		@Pc(19) float local19 = local3 * 2.0F / local7;
		@Pc(26) float local26 = -local3 * 2.0F / local11;
		@Pc(89) float[] local89 = new float[] { -1.0F + local19, local26 + 1.0F, 0.0F, 0.0F, -1.0F + local19, -3.0F + local26, 0.0F, 2.0F, local19 + 3.0F, local26 + 1.0F, 2.0F, 0.0F };
		@Pc(92) int local92 = (int) local7;
		@Pc(95) int local95 = (int) local11;
		@Pc(105) int local105 = arg5 ? this.aClass102_Sub1_25.method20709(-316203900).method24036() : local92;
		@Pc(115) int local115 = arg5 ? this.aClass102_Sub1_25.method20709(-1176977974).method24037() : local95;
		if (arg0 == 0) {
			local92 = 256;
			local95 = 256;
			this.aClass113_7.method8295(this.aClass114_6);
			this.aClass113_7.method8256();
		} else if (arg0 == 1) {
			local92 = 256;
			local95 = 256;
			local105 = local92;
			local115 = local95;
			this.aClass113_7.method8295(this.aClass114_8);
			this.aClass113_7.method8256();
			this.aClass113_7.method8271(this.aClass80_Sub13_Sub1_35, aFloat128 / local7, 0.0F, 1906138034);
		} else if (arg0 == 2) {
			local92 = 256;
			local95 = 256;
			local105 = local92;
			local115 = local95;
			this.aClass113_7.method8295(this.aClass114_8);
			this.aClass113_7.method8256();
			this.aClass113_7.method8271(this.aClass80_Sub13_Sub1_35, 0.0F, aFloat128 / local11, -1518208103);
		} else if (arg0 == 3) {
			this.aClass113_7.method8295(this.aClass114_9);
			local13 = arg4;
			this.aClass113_7.method8280(this.aClass80_Sub13_Sub1_34, 1, arg2, (short) 30375);
			this.aClass113_7.method8256();
		}
		@Pc(220) float local220 = (float) local92 / local7;
		@Pc(225) float local225 = (float) local95 / local11;
		@Pc(230) float local230 = (float) local105 / local7;
		@Pc(235) float local235 = (float) local115 / local11;
		local89[8] = (local89[8] + 1.0F) * local220 - 1.0F;
		local89[5] = (local89[5] - 1.0F) * local225 + 1.0F;
		local89[10] *= local230;
		local89[7] *= local235;
		this.aClass113_7.method8353(this.aClass80_Sub13_Sub1_31, local89, -46177148);
		this.aClass113_7.method8280(this.aClass80_Sub13_Sub1_30, 0, local13, (short) 30273);
		this.aClass113_7.method8273(this.aClass80_Sub13_Sub1_32, aFloat127, aFloat126, aFloat129, 0.0F, 103442463);
		this.aClass113_7.method8273(this.aClass80_Sub13_Sub1_33, 0.0F, 0.0F, 256.0F / local7, 256.0F / local11, 1962944682);
		this.aClass102_Sub1_25.method20706(0, 0, local92, local95);
	}

	@OriginalMember(owner = "client!aid", name = "l", descriptor = "()V")
	@Override
	void method11216() {
	}

	@OriginalMember(owner = "client!aid", name = "d", descriptor = "()Z")
	@Override
	boolean method11208() {
		if (!this.method11182()) {
			return false;
		}
		this.aClass113_7 = this.aClass102_Sub1_25.method21142("FilterBloom");
		if (this.aClass113_7 == null) {
			return false;
		}
		try {
			this.aClass80_Sub13_Sub1_30 = this.aClass113_7.method8302("sceneTex", 2075186059);
			this.aClass80_Sub13_Sub1_34 = this.aClass113_7.method8302("bloomTex1", 1996848463);
			this.aClass80_Sub13_Sub1_32 = this.aClass113_7.method8302("params", 2043317443);
			this.aClass80_Sub13_Sub1_35 = this.aClass113_7.method8302("sampleSize", 2110801664);
			this.aClass80_Sub13_Sub1_33 = this.aClass113_7.method8302("pixelOffsetAndBloomScale", 1962087191);
			this.aClass80_Sub13_Sub1_31 = this.aClass113_7.method8302("PosAndTexCoords", 2049140882);
			this.aClass113_7.method8377("test", (byte) 52);
			this.aClass114_7 = this.aClass113_7.method8377("techFullscreenTri", (byte) 13);
			this.aClass114_6 = this.aClass113_7.method8377("brightpass", (byte) -18);
			this.aClass114_8 = this.aClass113_7.method8377("blur", (byte) -27);
			this.aClass114_9 = this.aClass113_7.method8377("composite", (byte) 20);
			this.aClass114_10 = this.aClass113_7.method8377("techDefault", (byte) -12);
		} catch (@Pc(98) Exception_Sub5_Sub2 local98) {
			return false;
		} catch (@Pc(101) Exception_Sub5_Sub1 local101) {
			return false;
		}
		if (!this.aClass114_7.method8577()) {
			return false;
		} else if (!this.aClass114_6.method8577()) {
			return false;
		} else if (!this.aClass114_8.method8577()) {
			return false;
		} else if (!this.aClass114_9.method8577()) {
			return false;
		} else if (this.aClass114_10.method8577()) {
			this.aBoolean224 = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!aid", name = "b", descriptor = "(II)V")
	@Override
	void method11207(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!aid", name = "v", descriptor = "()V")
	@Override
	void method11203() {
	}

	@OriginalMember(owner = "client!aid", name = "y", descriptor = "(II)V")
	@Override
	void method11204(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!aid", name = "n", descriptor = "(II)V")
	@Override
	void method11200(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!aid", name = "g", descriptor = "(II)V")
	@Override
	void method11184(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!aid", name = "ax", descriptor = "(ILclient!afo;Lclient!lb;Lclient!de;Lclient!lb;Z)V")
	@Override
	void method11181(@OriginalArg(0) int arg0, @OriginalArg(1) Class108_Sub1 arg1, @OriginalArg(2) Interface34 arg2, @OriginalArg(3) Interface17 arg3, @OriginalArg(4) Interface34 arg4, @OriginalArg(5) boolean arg5) {
		@Pc(3) float local3 = this.aClass102_Sub1_25.method21132();
		@Pc(7) float local7 = (float) arg1.method24036();
		@Pc(11) float local11 = (float) arg1.method24037();
		@Pc(13) Interface34 local13 = arg2;
		@Pc(19) float local19 = local3 * 2.0F / local7;
		@Pc(26) float local26 = -local3 * 2.0F / local11;
		@Pc(89) float[] local89 = new float[] { -1.0F + local19, local26 + 1.0F, 0.0F, 0.0F, -1.0F + local19, -3.0F + local26, 0.0F, 2.0F, local19 + 3.0F, local26 + 1.0F, 2.0F, 0.0F };
		@Pc(92) int local92 = (int) local7;
		@Pc(95) int local95 = (int) local11;
		@Pc(105) int local105 = arg5 ? this.aClass102_Sub1_25.method20709(946455714).method24036() : local92;
		@Pc(115) int local115 = arg5 ? this.aClass102_Sub1_25.method20709(1577061942).method24037() : local95;
		if (arg0 == 0) {
			local92 = 256;
			local95 = 256;
			this.aClass113_7.method8295(this.aClass114_6);
			this.aClass113_7.method8256();
		} else if (arg0 == 1) {
			local92 = 256;
			local95 = 256;
			local105 = local92;
			local115 = local95;
			this.aClass113_7.method8295(this.aClass114_8);
			this.aClass113_7.method8256();
			this.aClass113_7.method8271(this.aClass80_Sub13_Sub1_35, aFloat128 / local7, 0.0F, 1630115419);
		} else if (arg0 == 2) {
			local92 = 256;
			local95 = 256;
			local105 = local92;
			local115 = local95;
			this.aClass113_7.method8295(this.aClass114_8);
			this.aClass113_7.method8256();
			this.aClass113_7.method8271(this.aClass80_Sub13_Sub1_35, 0.0F, aFloat128 / local11, -1694067183);
		} else if (arg0 == 3) {
			this.aClass113_7.method8295(this.aClass114_9);
			local13 = arg4;
			this.aClass113_7.method8280(this.aClass80_Sub13_Sub1_34, 1, arg2, (short) 20715);
			this.aClass113_7.method8256();
		}
		@Pc(220) float local220 = (float) local92 / local7;
		@Pc(225) float local225 = (float) local95 / local11;
		@Pc(230) float local230 = (float) local105 / local7;
		@Pc(235) float local235 = (float) local115 / local11;
		local89[8] = (local89[8] + 1.0F) * local220 - 1.0F;
		local89[5] = (local89[5] - 1.0F) * local225 + 1.0F;
		local89[10] *= local230;
		local89[7] *= local235;
		this.aClass113_7.method8353(this.aClass80_Sub13_Sub1_31, local89, 595923317);
		this.aClass113_7.method8280(this.aClass80_Sub13_Sub1_30, 0, local13, (short) 23361);
		this.aClass113_7.method8273(this.aClass80_Sub13_Sub1_32, aFloat127, aFloat126, aFloat129, 0.0F, -357929670);
		this.aClass113_7.method8273(this.aClass80_Sub13_Sub1_33, 0.0F, 0.0F, 256.0F / local7, 256.0F / local11, 410062527);
		this.aClass102_Sub1_25.method20706(0, 0, local92, local95);
	}

	@OriginalMember(owner = "client!aid", name = "z", descriptor = "()Z")
	@Override
	boolean method11201() {
		if (!this.method11182()) {
			return false;
		}
		this.aClass113_7 = this.aClass102_Sub1_25.method21142("FilterBloom");
		if (this.aClass113_7 == null) {
			return false;
		}
		try {
			this.aClass80_Sub13_Sub1_30 = this.aClass113_7.method8302("sceneTex", 2095064469);
			this.aClass80_Sub13_Sub1_34 = this.aClass113_7.method8302("bloomTex1", 1940183498);
			this.aClass80_Sub13_Sub1_32 = this.aClass113_7.method8302("params", 2082224407);
			this.aClass80_Sub13_Sub1_35 = this.aClass113_7.method8302("sampleSize", 2000134846);
			this.aClass80_Sub13_Sub1_33 = this.aClass113_7.method8302("pixelOffsetAndBloomScale", 2116465597);
			this.aClass80_Sub13_Sub1_31 = this.aClass113_7.method8302("PosAndTexCoords", 1949644663);
			this.aClass113_7.method8377("test", (byte) -61);
			this.aClass114_7 = this.aClass113_7.method8377("techFullscreenTri", (byte) -19);
			this.aClass114_6 = this.aClass113_7.method8377("brightpass", (byte) 64);
			this.aClass114_8 = this.aClass113_7.method8377("blur", (byte) 83);
			this.aClass114_9 = this.aClass113_7.method8377("composite", (byte) 72);
			this.aClass114_10 = this.aClass113_7.method8377("techDefault", (byte) -31);
		} catch (@Pc(98) Exception_Sub5_Sub2 local98) {
			return false;
		} catch (@Pc(101) Exception_Sub5_Sub1 local101) {
			return false;
		}
		if (!this.aClass114_7.method8577()) {
			return false;
		} else if (!this.aClass114_6.method8577()) {
			return false;
		} else if (!this.aClass114_8.method8577()) {
			return false;
		} else if (!this.aClass114_9.method8577()) {
			return false;
		} else if (this.aClass114_10.method8577()) {
			this.aBoolean224 = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!aid", name = "h", descriptor = "()Z")
	@Override
	boolean method11191() {
		if (!this.method11182()) {
			return false;
		}
		this.aClass113_7 = this.aClass102_Sub1_25.method21142("FilterBloom");
		if (this.aClass113_7 == null) {
			return false;
		}
		try {
			this.aClass80_Sub13_Sub1_30 = this.aClass113_7.method8302("sceneTex", 2124154713);
			this.aClass80_Sub13_Sub1_34 = this.aClass113_7.method8302("bloomTex1", 2101886485);
			this.aClass80_Sub13_Sub1_32 = this.aClass113_7.method8302("params", 2008822332);
			this.aClass80_Sub13_Sub1_35 = this.aClass113_7.method8302("sampleSize", 1997812945);
			this.aClass80_Sub13_Sub1_33 = this.aClass113_7.method8302("pixelOffsetAndBloomScale", 1989197122);
			this.aClass80_Sub13_Sub1_31 = this.aClass113_7.method8302("PosAndTexCoords", 2011708872);
			this.aClass113_7.method8377("test", (byte) 30);
			this.aClass114_7 = this.aClass113_7.method8377("techFullscreenTri", (byte) 86);
			this.aClass114_6 = this.aClass113_7.method8377("brightpass", (byte) 14);
			this.aClass114_8 = this.aClass113_7.method8377("blur", (byte) -29);
			this.aClass114_9 = this.aClass113_7.method8377("composite", (byte) -76);
			this.aClass114_10 = this.aClass113_7.method8377("techDefault", (byte) -58);
		} catch (@Pc(98) Exception_Sub5_Sub2 local98) {
			return false;
		} catch (@Pc(101) Exception_Sub5_Sub1 local101) {
			return false;
		}
		if (!this.aClass114_7.method8577()) {
			return false;
		} else if (!this.aClass114_6.method8577()) {
			return false;
		} else if (!this.aClass114_8.method8577()) {
			return false;
		} else if (!this.aClass114_9.method8577()) {
			return false;
		} else if (this.aClass114_10.method8577()) {
			this.aBoolean224 = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!aid", name = "aq", descriptor = "(I)V")
	@Override
	void method11211(@OriginalArg(0) int arg0) {
		this.aClass113_7.method8257();
	}

	@OriginalMember(owner = "client!aid", name = "ao", descriptor = "(I)V")
	@Override
	void method11189(@OriginalArg(0) int arg0) {
		this.aClass113_7.method8257();
	}

	@OriginalMember(owner = "client!aid", name = "ai", descriptor = "(I)V")
	@Override
	void method11210(@OriginalArg(0) int arg0) {
		this.aClass113_7.method8257();
	}

	@OriginalMember(owner = "client!aid", name = "ac", descriptor = "()I")
	@Override
	int method11212() {
		return 4;
	}

	@OriginalMember(owner = "client!aid", name = "ag", descriptor = "()I")
	@Override
	int method11187() {
		return 0;
	}

	@OriginalMember(owner = "client!aid", name = "ab", descriptor = "()I")
	@Override
	int method11215() {
		return 0;
	}

	@OriginalMember(owner = "client!aid", name = "al", descriptor = "()I")
	@Override
	int method11218() {
		return 0;
	}

	@OriginalMember(owner = "client!aid", name = "p", descriptor = "()V")
	@Override
	void method11202() {
	}

	@OriginalMember(owner = "client!aid", name = "af", descriptor = "()I")
	@Override
	int method11186() {
		return 1;
	}

	@OriginalMember(owner = "client!aid", name = "c", descriptor = "(II)V")
	@Override
	void method11206(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}
