package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aim")
public final class Class136_Sub3 extends Class136 {

	@OriginalMember(owner = "client!aim", name = "e", descriptor = "[F")
	public static float[] aFloatArray41 = new float[] { 0.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!aim", name = "u", descriptor = "F")
	public static float aFloat131 = 1.0F;

	@OriginalMember(owner = "client!aim", name = "l", descriptor = "I")
	public static int anInt1300 = 1;

	@OriginalMember(owner = "client!aim", name = "g", descriptor = "[Lclient!aee;")
	public static Class97_Sub1[] aClass97_Sub1Array1 = new Class97_Sub1[] { null, null, null };

	@OriginalMember(owner = "client!aim", name = "a", descriptor = "Lclient!aqv;")
	Class80_Sub13_Sub1 aClass80_Sub13_Sub1_36;

	@OriginalMember(owner = "client!aim", name = "m", descriptor = "Lclient!aqv;")
	Class80_Sub13_Sub1 aClass80_Sub13_Sub1_37;

	@OriginalMember(owner = "client!aim", name = "i", descriptor = "Lclient!hb;")
	Class113 aClass113_8;

	@OriginalMember(owner = "client!aim", name = "x", descriptor = "Z")
	boolean aBoolean237;

	@OriginalMember(owner = "client!aim", name = "s", descriptor = "Lclient!aqv;")
	Class80_Sub13_Sub1 aClass80_Sub13_Sub1_38;

	@OriginalMember(owner = "client!aim", name = "k", descriptor = "Lclient!aqv;")
	Class80_Sub13_Sub1 aClass80_Sub13_Sub1_39;

	@OriginalMember(owner = "client!aim", name = "o", descriptor = "[Lclient!ht;")
	Class114[] aClass114Array6 = null;

	@OriginalMember(owner = "client!aim", name = "j", descriptor = "[Lclient!aqv;")
	Class80_Sub13_Sub1[] aClass80_Sub13_Sub1Array1 = null;

	@OriginalMember(owner = "client!aim", name = "<init>", descriptor = "(Lclient!afa;)V")
	public Class136_Sub3(@OriginalArg(0) Class102_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!aim", name = "b", descriptor = "(II)V")
	@Override
	void method11207(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!aim", name = "e", descriptor = "()Z")
	@Override
	boolean method11199() {
		if (!this.method11182()) {
			return false;
		}
		this.aClass113_8 = this.aClass102_Sub1_25.method21142("FilterColourRemapping");
		if (this.aClass113_8 == null) {
			return false;
		}
		try {
			this.aClass80_Sub13_Sub1_37 = this.aClass113_8.method8302("sceneTex", 1968002633);
			this.aClass114Array6 = new Class114[3];
			this.aClass80_Sub13_Sub1Array1 = new Class80_Sub13_Sub1[3];
			if (this.aClass102_Sub1_25.aBoolean532) {
				this.aClass114Array6[0] = this.aClass113_8.method8377("techRemap3D_1", (byte) -61);
				this.aClass114Array6[1] = this.aClass113_8.method8377("techRemap3D_2", (byte) -96);
				this.aClass114Array6[2] = this.aClass113_8.method8377("techRemap3D_3", (byte) -70);
				this.aClass80_Sub13_Sub1Array1[0] = this.aClass113_8.method8302("remapTex3D_1", 1988637858);
				this.aClass80_Sub13_Sub1Array1[1] = this.aClass113_8.method8302("remapTex3D_2", 2054585725);
				this.aClass80_Sub13_Sub1Array1[2] = this.aClass113_8.method8302("remapTex3D_3", 1979502590);
			} else {
				this.aClass114Array6[0] = this.aClass113_8.method8377("techRemap2D_1", (byte) -5);
				this.aClass114Array6[1] = this.aClass113_8.method8377("techRemap2D_2", (byte) 55);
				this.aClass114Array6[2] = this.aClass113_8.method8377("techRemap2D_3", (byte) 93);
				this.aClass80_Sub13_Sub1Array1[0] = this.aClass113_8.method8302("remapTex2D_1", 2108846033);
				this.aClass80_Sub13_Sub1Array1[1] = this.aClass113_8.method8302("remapTex2D_2", 2126534493);
				this.aClass80_Sub13_Sub1Array1[2] = this.aClass113_8.method8302("remapTex2D_3", 1942335397);
			}
			this.aClass80_Sub13_Sub1_36 = this.aClass113_8.method8302("paramsWeightings", 1960774661);
			this.aClass80_Sub13_Sub1_38 = this.aClass113_8.method8302("pixelOffset", 1989718310);
			this.aClass80_Sub13_Sub1_39 = this.aClass113_8.method8302("PosAndTexCoords", 2131417650);
		} catch (@Pc(164) Exception_Sub5_Sub2 local164) {
			return false;
		} catch (@Pc(167) Exception_Sub5_Sub1 local167) {
			return false;
		}
		if (this.aClass114Array6[0].method8577() && this.aClass114Array6[1].method8577() && this.aClass114Array6[2].method8577()) {
			this.aBoolean237 = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!aim", name = "f", descriptor = "()Z")
	@Override
	boolean method11183() {
		return this.aBoolean237;
	}

	@OriginalMember(owner = "client!aim", name = "y", descriptor = "(II)V")
	@Override
	void method11204(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!aim", name = "g", descriptor = "(II)V")
	@Override
	void method11184(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!aim", name = "t", descriptor = "()Z")
	@Override
	boolean method11182() {
		return this.aClass102_Sub1_25.aBoolean529 && this.aClass102_Sub1_25.method21207();
	}

	@OriginalMember(owner = "client!aim", name = "a", descriptor = "()I")
	@Override
	int method11192() {
		return 0;
	}

	@OriginalMember(owner = "client!aim", name = "o", descriptor = "()I")
	@Override
	int method11190() {
		return 1;
	}

	@OriginalMember(owner = "client!aim", name = "m", descriptor = "(I)V")
	@Override
	void method11205(@OriginalArg(0) int arg0) {
		this.aClass113_8.method8257();
	}

	@OriginalMember(owner = "client!aim", name = "j", descriptor = "()I")
	@Override
	int method11221() {
		return 2;
	}

	@OriginalMember(owner = "client!aim", name = "w", descriptor = "()Z")
	@Override
	boolean method11196() {
		return this.aClass102_Sub1_25.aBoolean529 && this.aClass102_Sub1_25.method21207();
	}

	@OriginalMember(owner = "client!aim", name = "ac", descriptor = "()I")
	@Override
	int method11212() {
		return 1;
	}

	@OriginalMember(owner = "client!aim", name = "ah", descriptor = "()I")
	@Override
	int method11217() {
		return 0;
	}

	@OriginalMember(owner = "client!aim", name = "r", descriptor = "()Z")
	@Override
	boolean method11197() {
		return this.aClass102_Sub1_25.aBoolean529 && this.aClass102_Sub1_25.method21207();
	}

	@OriginalMember(owner = "client!aim", name = "z", descriptor = "()Z")
	@Override
	boolean method11201() {
		if (!this.method11182()) {
			return false;
		}
		this.aClass113_8 = this.aClass102_Sub1_25.method21142("FilterColourRemapping");
		if (this.aClass113_8 == null) {
			return false;
		}
		try {
			this.aClass80_Sub13_Sub1_37 = this.aClass113_8.method8302("sceneTex", 2021202045);
			this.aClass114Array6 = new Class114[3];
			this.aClass80_Sub13_Sub1Array1 = new Class80_Sub13_Sub1[3];
			if (this.aClass102_Sub1_25.aBoolean532) {
				this.aClass114Array6[0] = this.aClass113_8.method8377("techRemap3D_1", (byte) -23);
				this.aClass114Array6[1] = this.aClass113_8.method8377("techRemap3D_2", (byte) 21);
				this.aClass114Array6[2] = this.aClass113_8.method8377("techRemap3D_3", (byte) 75);
				this.aClass80_Sub13_Sub1Array1[0] = this.aClass113_8.method8302("remapTex3D_1", 2129002314);
				this.aClass80_Sub13_Sub1Array1[1] = this.aClass113_8.method8302("remapTex3D_2", 1957371743);
				this.aClass80_Sub13_Sub1Array1[2] = this.aClass113_8.method8302("remapTex3D_3", 1971395565);
			} else {
				this.aClass114Array6[0] = this.aClass113_8.method8377("techRemap2D_1", (byte) 5);
				this.aClass114Array6[1] = this.aClass113_8.method8377("techRemap2D_2", (byte) -38);
				this.aClass114Array6[2] = this.aClass113_8.method8377("techRemap2D_3", (byte) -72);
				this.aClass80_Sub13_Sub1Array1[0] = this.aClass113_8.method8302("remapTex2D_1", 1955432732);
				this.aClass80_Sub13_Sub1Array1[1] = this.aClass113_8.method8302("remapTex2D_2", 1976693829);
				this.aClass80_Sub13_Sub1Array1[2] = this.aClass113_8.method8302("remapTex2D_3", 2046606680);
			}
			this.aClass80_Sub13_Sub1_36 = this.aClass113_8.method8302("paramsWeightings", 2071452497);
			this.aClass80_Sub13_Sub1_38 = this.aClass113_8.method8302("pixelOffset", 1991805235);
			this.aClass80_Sub13_Sub1_39 = this.aClass113_8.method8302("PosAndTexCoords", 2112467964);
		} catch (@Pc(164) Exception_Sub5_Sub2 local164) {
			return false;
		} catch (@Pc(167) Exception_Sub5_Sub1 local167) {
			return false;
		}
		if (this.aClass114Array6[0].method8577() && this.aClass114Array6[1].method8577() && this.aClass114Array6[2].method8577()) {
			this.aBoolean237 = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!aim", name = "h", descriptor = "()Z")
	@Override
	boolean method11191() {
		if (!this.method11182()) {
			return false;
		}
		this.aClass113_8 = this.aClass102_Sub1_25.method21142("FilterColourRemapping");
		if (this.aClass113_8 == null) {
			return false;
		}
		try {
			this.aClass80_Sub13_Sub1_37 = this.aClass113_8.method8302("sceneTex", 1977250842);
			this.aClass114Array6 = new Class114[3];
			this.aClass80_Sub13_Sub1Array1 = new Class80_Sub13_Sub1[3];
			if (this.aClass102_Sub1_25.aBoolean532) {
				this.aClass114Array6[0] = this.aClass113_8.method8377("techRemap3D_1", (byte) -23);
				this.aClass114Array6[1] = this.aClass113_8.method8377("techRemap3D_2", (byte) 30);
				this.aClass114Array6[2] = this.aClass113_8.method8377("techRemap3D_3", (byte) 85);
				this.aClass80_Sub13_Sub1Array1[0] = this.aClass113_8.method8302("remapTex3D_1", 2130658924);
				this.aClass80_Sub13_Sub1Array1[1] = this.aClass113_8.method8302("remapTex3D_2", 2078625103);
				this.aClass80_Sub13_Sub1Array1[2] = this.aClass113_8.method8302("remapTex3D_3", 2115304114);
			} else {
				this.aClass114Array6[0] = this.aClass113_8.method8377("techRemap2D_1", (byte) 33);
				this.aClass114Array6[1] = this.aClass113_8.method8377("techRemap2D_2", (byte) 11);
				this.aClass114Array6[2] = this.aClass113_8.method8377("techRemap2D_3", (byte) 6);
				this.aClass80_Sub13_Sub1Array1[0] = this.aClass113_8.method8302("remapTex2D_1", 2092090447);
				this.aClass80_Sub13_Sub1Array1[1] = this.aClass113_8.method8302("remapTex2D_2", 1963503064);
				this.aClass80_Sub13_Sub1Array1[2] = this.aClass113_8.method8302("remapTex2D_3", 1950546541);
			}
			this.aClass80_Sub13_Sub1_36 = this.aClass113_8.method8302("paramsWeightings", 2030175816);
			this.aClass80_Sub13_Sub1_38 = this.aClass113_8.method8302("pixelOffset", 2014982002);
			this.aClass80_Sub13_Sub1_39 = this.aClass113_8.method8302("PosAndTexCoords", 1960204686);
		} catch (@Pc(164) Exception_Sub5_Sub2 local164) {
			return false;
		} catch (@Pc(167) Exception_Sub5_Sub1 local167) {
			return false;
		}
		if (this.aClass114Array6[0].method8577() && this.aClass114Array6[1].method8577() && this.aClass114Array6[2].method8577()) {
			this.aBoolean237 = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!aim", name = "q", descriptor = "()Z")
	@Override
	boolean method11198() {
		return this.aBoolean237;
	}

	@OriginalMember(owner = "client!aim", name = "i", descriptor = "(ILclient!afo;Lclient!lb;Lclient!de;Lclient!lb;Z)V")
	@Override
	void method11188(@OriginalArg(0) int arg0, @OriginalArg(1) Class108_Sub1 arg1, @OriginalArg(2) Interface34 arg2, @OriginalArg(3) Interface17 arg3, @OriginalArg(4) Interface34 arg4, @OriginalArg(5) boolean arg5) {
		@Pc(3) float local3 = this.aClass102_Sub1_25.method21132();
		@Pc(7) float local7 = (float) arg1.method24036();
		@Pc(11) float local11 = (float) arg1.method24037();
		@Pc(19) float local19 = local3 * 2.0F / local7;
		@Pc(26) float local26 = -local3 * 2.0F / local11;
		@Pc(89) float[] local89 = new float[] { -1.0F + local19, local26 + 1.0F, 0.0F, 0.0F, -1.0F + local19, -3.0F + local26, 0.0F, 2.0F, local19 + 3.0F, local26 + 1.0F, 2.0F, 0.0F };
		@Pc(92) int local92 = (int) local7;
		@Pc(95) int local95 = (int) local11;
		@Pc(105) int local105 = arg5 ? this.aClass102_Sub1_25.method20709(-1721685103).method24036() : local92;
		@Pc(115) int local115 = arg5 ? this.aClass102_Sub1_25.method20709(-274169797).method24037() : local95;
		@Pc(122) Class114 local122 = this.aClass114Array6[anInt1300 - 1];
		this.aClass113_8.method8295(local122);
		this.aClass113_8.method8256();
		this.aClass113_8.method8273(this.aClass80_Sub13_Sub1_36, aFloat131, aFloatArray41[0], aFloatArray41[1], aFloatArray41[2], 1514480972);
		@Pc(148) Interface39 local148 = null;
		@Pc(150) Class80_Sub13_Sub1 local150 = null;
		for (@Pc(152) int local152 = 0; local152 < anInt1300; local152++) {
			if (aClass97_Sub1Array1[local152] != null) {
				local150 = this.aClass80_Sub13_Sub1Array1[local152];
				local148 = aClass97_Sub1Array1[local152].method2039();
				this.aClass113_8.method8280(local150, local152 + 1, local148, (short) 25459);
			}
		}
		@Pc(185) float local185 = (float) local92 / local7;
		@Pc(190) float local190 = (float) local95 / local11;
		@Pc(195) float local195 = (float) local105 / local7;
		@Pc(200) float local200 = (float) local115 / local11;
		local89[8] = (local89[8] + 1.0F) * local185 - 1.0F;
		local89[5] = (local89[5] - 1.0F) * local190 + 1.0F;
		local89[10] *= local195;
		local89[7] *= local200;
		this.aClass113_8.method8353(this.aClass80_Sub13_Sub1_39, local89, -484208038);
		this.aClass113_8.method8280(this.aClass80_Sub13_Sub1_37, 0, arg2, (short) 14336);
		this.aClass113_8.method8273(this.aClass80_Sub13_Sub1_38, 0.0F, 0.0F, 0.0F, 0.0F, -43656111);
		this.aClass102_Sub1_25.method20706(0, 0, local92, local95);
	}

	@OriginalMember(owner = "client!aim", name = "p", descriptor = "()V")
	@Override
	void method11202() {
	}

	@OriginalMember(owner = "client!aim", name = "v", descriptor = "()V")
	@Override
	void method11203() {
	}

	@OriginalMember(owner = "client!aim", name = "l", descriptor = "()V")
	@Override
	void method11216() {
	}

	@OriginalMember(owner = "client!aim", name = "n", descriptor = "(II)V")
	@Override
	void method11200(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!aim", name = "c", descriptor = "(II)V")
	@Override
	void method11206(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!aim", name = "ax", descriptor = "(ILclient!afo;Lclient!lb;Lclient!de;Lclient!lb;Z)V")
	@Override
	void method11181(@OriginalArg(0) int arg0, @OriginalArg(1) Class108_Sub1 arg1, @OriginalArg(2) Interface34 arg2, @OriginalArg(3) Interface17 arg3, @OriginalArg(4) Interface34 arg4, @OriginalArg(5) boolean arg5) {
		@Pc(3) float local3 = this.aClass102_Sub1_25.method21132();
		@Pc(7) float local7 = (float) arg1.method24036();
		@Pc(11) float local11 = (float) arg1.method24037();
		@Pc(19) float local19 = local3 * 2.0F / local7;
		@Pc(26) float local26 = -local3 * 2.0F / local11;
		@Pc(89) float[] local89 = new float[] { -1.0F + local19, local26 + 1.0F, 0.0F, 0.0F, -1.0F + local19, -3.0F + local26, 0.0F, 2.0F, local19 + 3.0F, local26 + 1.0F, 2.0F, 0.0F };
		@Pc(92) int local92 = (int) local7;
		@Pc(95) int local95 = (int) local11;
		@Pc(105) int local105 = arg5 ? this.aClass102_Sub1_25.method20709(640722871).method24036() : local92;
		@Pc(115) int local115 = arg5 ? this.aClass102_Sub1_25.method20709(978165768).method24037() : local95;
		@Pc(122) Class114 local122 = this.aClass114Array6[anInt1300 - 1];
		this.aClass113_8.method8295(local122);
		this.aClass113_8.method8256();
		this.aClass113_8.method8273(this.aClass80_Sub13_Sub1_36, aFloat131, aFloatArray41[0], aFloatArray41[1], aFloatArray41[2], 1640967208);
		@Pc(148) Interface39 local148 = null;
		@Pc(150) Class80_Sub13_Sub1 local150 = null;
		for (@Pc(152) int local152 = 0; local152 < anInt1300; local152++) {
			if (aClass97_Sub1Array1[local152] != null) {
				local150 = this.aClass80_Sub13_Sub1Array1[local152];
				local148 = aClass97_Sub1Array1[local152].method2039();
				this.aClass113_8.method8280(local150, local152 + 1, local148, (short) 8418);
			}
		}
		@Pc(185) float local185 = (float) local92 / local7;
		@Pc(190) float local190 = (float) local95 / local11;
		@Pc(195) float local195 = (float) local105 / local7;
		@Pc(200) float local200 = (float) local115 / local11;
		local89[8] = (local89[8] + 1.0F) * local185 - 1.0F;
		local89[5] = (local89[5] - 1.0F) * local190 + 1.0F;
		local89[10] *= local195;
		local89[7] *= local200;
		this.aClass113_8.method8353(this.aClass80_Sub13_Sub1_39, local89, 495003223);
		this.aClass113_8.method8280(this.aClass80_Sub13_Sub1_37, 0, arg2, (short) 26134);
		this.aClass113_8.method8273(this.aClass80_Sub13_Sub1_38, 0.0F, 0.0F, 0.0F, 0.0F, 1583942909);
		this.aClass102_Sub1_25.method20706(0, 0, local92, local95);
	}

	@OriginalMember(owner = "client!aim", name = "ay", descriptor = "(ILclient!afo;Lclient!lb;Lclient!de;Lclient!lb;Z)V")
	@Override
	void method11209(@OriginalArg(0) int arg0, @OriginalArg(1) Class108_Sub1 arg1, @OriginalArg(2) Interface34 arg2, @OriginalArg(3) Interface17 arg3, @OriginalArg(4) Interface34 arg4, @OriginalArg(5) boolean arg5) {
		@Pc(3) float local3 = this.aClass102_Sub1_25.method21132();
		@Pc(7) float local7 = (float) arg1.method24036();
		@Pc(11) float local11 = (float) arg1.method24037();
		@Pc(19) float local19 = local3 * 2.0F / local7;
		@Pc(26) float local26 = -local3 * 2.0F / local11;
		@Pc(89) float[] local89 = new float[] { -1.0F + local19, local26 + 1.0F, 0.0F, 0.0F, -1.0F + local19, -3.0F + local26, 0.0F, 2.0F, local19 + 3.0F, local26 + 1.0F, 2.0F, 0.0F };
		@Pc(92) int local92 = (int) local7;
		@Pc(95) int local95 = (int) local11;
		@Pc(105) int local105 = arg5 ? this.aClass102_Sub1_25.method20709(-819436224).method24036() : local92;
		@Pc(115) int local115 = arg5 ? this.aClass102_Sub1_25.method20709(-911684133).method24037() : local95;
		@Pc(122) Class114 local122 = this.aClass114Array6[anInt1300 - 1];
		this.aClass113_8.method8295(local122);
		this.aClass113_8.method8256();
		this.aClass113_8.method8273(this.aClass80_Sub13_Sub1_36, aFloat131, aFloatArray41[0], aFloatArray41[1], aFloatArray41[2], 85230647);
		@Pc(148) Interface39 local148 = null;
		@Pc(150) Class80_Sub13_Sub1 local150 = null;
		for (@Pc(152) int local152 = 0; local152 < anInt1300; local152++) {
			if (aClass97_Sub1Array1[local152] != null) {
				local150 = this.aClass80_Sub13_Sub1Array1[local152];
				local148 = aClass97_Sub1Array1[local152].method2039();
				this.aClass113_8.method8280(local150, local152 + 1, local148, (short) 29784);
			}
		}
		@Pc(185) float local185 = (float) local92 / local7;
		@Pc(190) float local190 = (float) local95 / local11;
		@Pc(195) float local195 = (float) local105 / local7;
		@Pc(200) float local200 = (float) local115 / local11;
		local89[8] = (local89[8] + 1.0F) * local185 - 1.0F;
		local89[5] = (local89[5] - 1.0F) * local190 + 1.0F;
		local89[10] *= local195;
		local89[7] *= local200;
		this.aClass113_8.method8353(this.aClass80_Sub13_Sub1_39, local89, -315412106);
		this.aClass113_8.method8280(this.aClass80_Sub13_Sub1_37, 0, arg2, (short) 29533);
		this.aClass113_8.method8273(this.aClass80_Sub13_Sub1_38, 0.0F, 0.0F, 0.0F, 0.0F, -296795546);
		this.aClass102_Sub1_25.method20706(0, 0, local92, local95);
	}

	@OriginalMember(owner = "client!aim", name = "ai", descriptor = "(I)V")
	@Override
	void method11210(@OriginalArg(0) int arg0) {
		this.aClass113_8.method8257();
	}

	@OriginalMember(owner = "client!aim", name = "aq", descriptor = "(I)V")
	@Override
	void method11211(@OriginalArg(0) int arg0) {
		this.aClass113_8.method8257();
	}

	@OriginalMember(owner = "client!aim", name = "ao", descriptor = "(I)V")
	@Override
	void method11189(@OriginalArg(0) int arg0) {
		this.aClass113_8.method8257();
	}

	@OriginalMember(owner = "client!aim", name = "aj", descriptor = "()I")
	@Override
	int method11213() {
		return 1;
	}

	@OriginalMember(owner = "client!aim", name = "af", descriptor = "()I")
	@Override
	int method11186() {
		return 0;
	}

	@OriginalMember(owner = "client!aim", name = "ag", descriptor = "()I")
	@Override
	int method11187() {
		return 2;
	}

	@OriginalMember(owner = "client!aim", name = "ab", descriptor = "()I")
	@Override
	int method11215() {
		return 2;
	}

	@OriginalMember(owner = "client!aim", name = "al", descriptor = "()I")
	@Override
	int method11218() {
		return 2;
	}

	@OriginalMember(owner = "client!aim", name = "d", descriptor = "()Z")
	@Override
	boolean method11208() {
		if (!this.method11182()) {
			return false;
		}
		this.aClass113_8 = this.aClass102_Sub1_25.method21142("FilterColourRemapping");
		if (this.aClass113_8 == null) {
			return false;
		}
		try {
			this.aClass80_Sub13_Sub1_37 = this.aClass113_8.method8302("sceneTex", 2066847203);
			this.aClass114Array6 = new Class114[3];
			this.aClass80_Sub13_Sub1Array1 = new Class80_Sub13_Sub1[3];
			if (this.aClass102_Sub1_25.aBoolean532) {
				this.aClass114Array6[0] = this.aClass113_8.method8377("techRemap3D_1", (byte) -27);
				this.aClass114Array6[1] = this.aClass113_8.method8377("techRemap3D_2", (byte) 12);
				this.aClass114Array6[2] = this.aClass113_8.method8377("techRemap3D_3", (byte) 102);
				this.aClass80_Sub13_Sub1Array1[0] = this.aClass113_8.method8302("remapTex3D_1", 1937293170);
				this.aClass80_Sub13_Sub1Array1[1] = this.aClass113_8.method8302("remapTex3D_2", 2022958607);
				this.aClass80_Sub13_Sub1Array1[2] = this.aClass113_8.method8302("remapTex3D_3", 2109500047);
			} else {
				this.aClass114Array6[0] = this.aClass113_8.method8377("techRemap2D_1", (byte) 5);
				this.aClass114Array6[1] = this.aClass113_8.method8377("techRemap2D_2", (byte) -6);
				this.aClass114Array6[2] = this.aClass113_8.method8377("techRemap2D_3", (byte) -9);
				this.aClass80_Sub13_Sub1Array1[0] = this.aClass113_8.method8302("remapTex2D_1", 2108482915);
				this.aClass80_Sub13_Sub1Array1[1] = this.aClass113_8.method8302("remapTex2D_2", 2078740269);
				this.aClass80_Sub13_Sub1Array1[2] = this.aClass113_8.method8302("remapTex2D_3", 1982927437);
			}
			this.aClass80_Sub13_Sub1_36 = this.aClass113_8.method8302("paramsWeightings", 2121126475);
			this.aClass80_Sub13_Sub1_38 = this.aClass113_8.method8302("pixelOffset", 1960261860);
			this.aClass80_Sub13_Sub1_39 = this.aClass113_8.method8302("PosAndTexCoords", 2127775296);
		} catch (@Pc(164) Exception_Sub5_Sub2 local164) {
			return false;
		} catch (@Pc(167) Exception_Sub5_Sub1 local167) {
			return false;
		}
		if (this.aClass114Array6[0].method8577() && this.aClass114Array6[1].method8577() && this.aClass114Array6[2].method8577()) {
			this.aBoolean237 = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!aim", name = "x", descriptor = "()Z")
	@Override
	boolean method11195() {
		return anInt1300 == 0 || aFloat131 == 1.0F || aFloatArray41[0] + aFloatArray41[1] + aFloatArray41[2] == 0.0F || aClass97_Sub1Array1[0] == null && aClass97_Sub1Array1[1] == null && aClass97_Sub1Array1[2] == null;
	}

	@OriginalMember(owner = "client!aim", name = "av", descriptor = "()Z")
	@Override
	boolean method11223() {
		return anInt1300 == 0 || aFloat131 == 1.0F || aFloatArray41[0] + aFloatArray41[1] + aFloatArray41[2] == 0.0F || aClass97_Sub1Array1[0] == null && aClass97_Sub1Array1[1] == null && aClass97_Sub1Array1[2] == null;
	}
}
