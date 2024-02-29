package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ais")
public final class Class137_Sub3 extends Class137 {

	@OriginalMember(owner = "client!ais", name = "m", descriptor = "[F")
	public static float[] aFloatArray41 = new float[] { 0.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!ais", name = "k", descriptor = "F")
	public static float aFloat139 = 1.0F;

	@OriginalMember(owner = "client!ais", name = "f", descriptor = "I")
	public static int anInt1379 = 1;

	@OriginalMember(owner = "client!ais", name = "w", descriptor = "[Lclient!aeq;")
	public static Class102_Sub2[] aClass102_Sub2Array1 = new Class102_Sub2[] { null, null, null };

	@OriginalMember(owner = "client!ais", name = "l", descriptor = "Lclient!ho;")
	Class115 aClass115_8;

	@OriginalMember(owner = "client!ais", name = "r", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_36;

	@OriginalMember(owner = "client!ais", name = "u", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_37;

	@OriginalMember(owner = "client!ais", name = "d", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_38;

	@OriginalMember(owner = "client!ais", name = "c", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_39;

	@OriginalMember(owner = "client!ais", name = "v", descriptor = "Z")
	boolean aBoolean258;

	@OriginalMember(owner = "client!ais", name = "z", descriptor = "[Lclient!hi;")
	Class116[] aClass116Array6 = null;

	@OriginalMember(owner = "client!ais", name = "p", descriptor = "[Lclient!aql;")
	Class93_Sub33_Sub1[] aClass93_Sub33_Sub1Array1 = null;

	@OriginalMember(owner = "client!ais", name = "<init>", descriptor = "(Lclient!afc;)V")
	public Class137_Sub3(@OriginalArg(0) Class104_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ais", name = "o", descriptor = "()Z")
	@Override
	boolean method11446() {
		return this.aClass104_Sub2_25.aBoolean476 && this.aClass104_Sub2_25.method20898();
	}

	@OriginalMember(owner = "client!ais", name = "au", descriptor = "(ILclient!afq;Lclient!lz;Lclient!dw;Lclient!lz;Z)V")
	@Override
	void method11458(@OriginalArg(0) int arg0, @OriginalArg(1) Class112_Sub1 arg1, @OriginalArg(2) Interface38 arg2, @OriginalArg(3) Interface19 arg3, @OriginalArg(4) Interface38 arg4, @OriginalArg(5) boolean arg5) {
		@Pc(3) float local3 = this.aClass104_Sub2_25.method20894();
		@Pc(7) float local7 = (float) arg1.method23748();
		@Pc(11) float local11 = (float) arg1.method23749();
		@Pc(19) float local19 = local3 * 2.0F / local7;
		@Pc(26) float local26 = -local3 * 2.0F / local11;
		@Pc(89) float[] local89 = new float[] { -1.0F + local19, local26 + 1.0F, 0.0F, 0.0F, -1.0F + local19, -3.0F + local26, 0.0F, 2.0F, local19 + 3.0F, local26 + 1.0F, 2.0F, 0.0F };
		@Pc(92) int local92 = (int) local7;
		@Pc(95) int local95 = (int) local11;
		@Pc(105) int local105 = arg5 ? this.aClass104_Sub2_25.method20447(1325249178).method23748() : local92;
		@Pc(115) int local115 = arg5 ? this.aClass104_Sub2_25.method20447(1742549285).method23749() : local95;
		@Pc(122) Class116 local122 = this.aClass116Array6[anInt1379 - 1];
		this.aClass115_8.method8203(local122);
		this.aClass115_8.method8285();
		this.aClass115_8.method8210(this.aClass93_Sub33_Sub1_38, aFloat139, aFloatArray41[0], aFloatArray41[1], aFloatArray41[2], -1874562246);
		@Pc(148) Interface43 local148 = null;
		@Pc(150) Class93_Sub33_Sub1 local150 = null;
		for (@Pc(152) int local152 = 0; local152 < anInt1379; local152++) {
			if (aClass102_Sub2Array1[local152] != null) {
				local150 = this.aClass93_Sub33_Sub1Array1[local152];
				local148 = aClass102_Sub2Array1[local152].method2593();
				this.aClass115_8.method8293(local150, local152 + 1, local148, 2122386991);
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
		this.aClass115_8.method8213(this.aClass93_Sub33_Sub1_36, local89, -1778785883);
		this.aClass115_8.method8293(this.aClass93_Sub33_Sub1_37, 0, arg2, 2132178074);
		this.aClass115_8.method8210(this.aClass93_Sub33_Sub1_39, 0.0F, 0.0F, 0.0F, 0.0F, -296620422);
		this.aClass104_Sub2_25.method20475(0, 0, local92, local95);
	}

	@OriginalMember(owner = "client!ais", name = "n", descriptor = "()Z")
	@Override
	boolean method11448() {
		return this.aBoolean258;
	}

	@OriginalMember(owner = "client!ais", name = "m", descriptor = "()Z")
	@Override
	boolean method11461() {
		if (!this.method11447()) {
			return false;
		}
		this.aClass115_8 = this.aClass104_Sub2_25.method20904("FilterColourRemapping");
		if (this.aClass115_8 == null) {
			return false;
		}
		try {
			this.aClass93_Sub33_Sub1_37 = this.aClass115_8.method8198("sceneTex", (byte) 0);
			this.aClass116Array6 = new Class116[3];
			this.aClass93_Sub33_Sub1Array1 = new Class93_Sub33_Sub1[3];
			if (this.aClass104_Sub2_25.aBoolean472) {
				this.aClass116Array6[0] = this.aClass115_8.method8268("techRemap3D_1", 1249273355);
				this.aClass116Array6[1] = this.aClass115_8.method8268("techRemap3D_2", 1249273355);
				this.aClass116Array6[2] = this.aClass115_8.method8268("techRemap3D_3", 1249273355);
				this.aClass93_Sub33_Sub1Array1[0] = this.aClass115_8.method8198("remapTex3D_1", (byte) 0);
				this.aClass93_Sub33_Sub1Array1[1] = this.aClass115_8.method8198("remapTex3D_2", (byte) 0);
				this.aClass93_Sub33_Sub1Array1[2] = this.aClass115_8.method8198("remapTex3D_3", (byte) 0);
			} else {
				this.aClass116Array6[0] = this.aClass115_8.method8268("techRemap2D_1", 1249273355);
				this.aClass116Array6[1] = this.aClass115_8.method8268("techRemap2D_2", 1249273355);
				this.aClass116Array6[2] = this.aClass115_8.method8268("techRemap2D_3", 1249273355);
				this.aClass93_Sub33_Sub1Array1[0] = this.aClass115_8.method8198("remapTex2D_1", (byte) 0);
				this.aClass93_Sub33_Sub1Array1[1] = this.aClass115_8.method8198("remapTex2D_2", (byte) 0);
				this.aClass93_Sub33_Sub1Array1[2] = this.aClass115_8.method8198("remapTex2D_3", (byte) 0);
			}
			this.aClass93_Sub33_Sub1_38 = this.aClass115_8.method8198("paramsWeightings", (byte) 0);
			this.aClass93_Sub33_Sub1_39 = this.aClass115_8.method8198("pixelOffset", (byte) 0);
			this.aClass93_Sub33_Sub1_36 = this.aClass115_8.method8198("PosAndTexCoords", (byte) 0);
		} catch (@Pc(164) Exception_Sub2_Sub1 local164) {
			return false;
		} catch (@Pc(167) Exception_Sub2_Sub2 local167) {
			return false;
		}
		if (this.aClass116Array6[0].method8438() && this.aClass116Array6[1].method8438() && this.aClass116Array6[2].method8438()) {
			this.aBoolean258 = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ais", name = "w", descriptor = "(II)V")
	@Override
	void method11463(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ais", name = "i", descriptor = "(I)V")
	@Override
	void method11470(@OriginalArg(0) int arg0) {
		this.aClass115_8.method8255();
	}

	@OriginalMember(owner = "client!ais", name = "z", descriptor = "()I")
	@Override
	int method11455() {
		return 1;
	}

	@OriginalMember(owner = "client!ais", name = "l", descriptor = "(ILclient!afq;Lclient!lz;Lclient!dw;Lclient!lz;Z)V")
	@Override
	void method11453(@OriginalArg(0) int arg0, @OriginalArg(1) Class112_Sub1 arg1, @OriginalArg(2) Interface38 arg2, @OriginalArg(3) Interface19 arg3, @OriginalArg(4) Interface38 arg4, @OriginalArg(5) boolean arg5) {
		@Pc(3) float local3 = this.aClass104_Sub2_25.method20894();
		@Pc(7) float local7 = (float) arg1.method23748();
		@Pc(11) float local11 = (float) arg1.method23749();
		@Pc(19) float local19 = local3 * 2.0F / local7;
		@Pc(26) float local26 = -local3 * 2.0F / local11;
		@Pc(89) float[] local89 = new float[] { -1.0F + local19, local26 + 1.0F, 0.0F, 0.0F, -1.0F + local19, -3.0F + local26, 0.0F, 2.0F, local19 + 3.0F, local26 + 1.0F, 2.0F, 0.0F };
		@Pc(92) int local92 = (int) local7;
		@Pc(95) int local95 = (int) local11;
		@Pc(105) int local105 = arg5 ? this.aClass104_Sub2_25.method20447(2015313872).method23748() : local92;
		@Pc(115) int local115 = arg5 ? this.aClass104_Sub2_25.method20447(2103559693).method23749() : local95;
		@Pc(122) Class116 local122 = this.aClass116Array6[anInt1379 - 1];
		this.aClass115_8.method8203(local122);
		this.aClass115_8.method8285();
		this.aClass115_8.method8210(this.aClass93_Sub33_Sub1_38, aFloat139, aFloatArray41[0], aFloatArray41[1], aFloatArray41[2], -925812372);
		@Pc(148) Interface43 local148 = null;
		@Pc(150) Class93_Sub33_Sub1 local150 = null;
		for (@Pc(152) int local152 = 0; local152 < anInt1379; local152++) {
			if (aClass102_Sub2Array1[local152] != null) {
				local150 = this.aClass93_Sub33_Sub1Array1[local152];
				local148 = aClass102_Sub2Array1[local152].method2593();
				this.aClass115_8.method8293(local150, local152 + 1, local148, 2127849927);
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
		this.aClass115_8.method8213(this.aClass93_Sub33_Sub1_36, local89, -1778785883);
		this.aClass115_8.method8293(this.aClass93_Sub33_Sub1_37, 0, arg2, 2133704591);
		this.aClass115_8.method8210(this.aClass93_Sub33_Sub1_39, 0.0F, 0.0F, 0.0F, 0.0F, 1464836781);
		this.aClass104_Sub2_25.method20475(0, 0, local92, local95);
	}

	@OriginalMember(owner = "client!ais", name = "u", descriptor = "(I)V")
	@Override
	void method11454(@OriginalArg(0) int arg0) {
		this.aClass115_8.method8255();
	}

	@OriginalMember(owner = "client!ais", name = "d", descriptor = "()I")
	@Override
	int method11457() {
		return 0;
	}

	@OriginalMember(owner = "client!ais", name = "p", descriptor = "()I")
	@Override
	int method11456() {
		return 2;
	}

	@OriginalMember(owner = "client!ais", name = "f", descriptor = "()V")
	@Override
	void method11451() {
	}

	@OriginalMember(owner = "client!ais", name = "ag", descriptor = "()I")
	@Override
	int method11449() {
		return 1;
	}

	@OriginalMember(owner = "client!ais", name = "s", descriptor = "()Z")
	@Override
	boolean method11469() {
		return this.aBoolean258;
	}

	@OriginalMember(owner = "client!ais", name = "y", descriptor = "()Z")
	@Override
	boolean method11462() {
		return this.aBoolean258;
	}

	@OriginalMember(owner = "client!ais", name = "q", descriptor = "()Z")
	@Override
	boolean method11464() {
		if (!this.method11447()) {
			return false;
		}
		this.aClass115_8 = this.aClass104_Sub2_25.method20904("FilterColourRemapping");
		if (this.aClass115_8 == null) {
			return false;
		}
		try {
			this.aClass93_Sub33_Sub1_37 = this.aClass115_8.method8198("sceneTex", (byte) 0);
			this.aClass116Array6 = new Class116[3];
			this.aClass93_Sub33_Sub1Array1 = new Class93_Sub33_Sub1[3];
			if (this.aClass104_Sub2_25.aBoolean472) {
				this.aClass116Array6[0] = this.aClass115_8.method8268("techRemap3D_1", 1249273355);
				this.aClass116Array6[1] = this.aClass115_8.method8268("techRemap3D_2", 1249273355);
				this.aClass116Array6[2] = this.aClass115_8.method8268("techRemap3D_3", 1249273355);
				this.aClass93_Sub33_Sub1Array1[0] = this.aClass115_8.method8198("remapTex3D_1", (byte) 0);
				this.aClass93_Sub33_Sub1Array1[1] = this.aClass115_8.method8198("remapTex3D_2", (byte) 0);
				this.aClass93_Sub33_Sub1Array1[2] = this.aClass115_8.method8198("remapTex3D_3", (byte) 0);
			} else {
				this.aClass116Array6[0] = this.aClass115_8.method8268("techRemap2D_1", 1249273355);
				this.aClass116Array6[1] = this.aClass115_8.method8268("techRemap2D_2", 1249273355);
				this.aClass116Array6[2] = this.aClass115_8.method8268("techRemap2D_3", 1249273355);
				this.aClass93_Sub33_Sub1Array1[0] = this.aClass115_8.method8198("remapTex2D_1", (byte) 0);
				this.aClass93_Sub33_Sub1Array1[1] = this.aClass115_8.method8198("remapTex2D_2", (byte) 0);
				this.aClass93_Sub33_Sub1Array1[2] = this.aClass115_8.method8198("remapTex2D_3", (byte) 0);
			}
			this.aClass93_Sub33_Sub1_38 = this.aClass115_8.method8198("paramsWeightings", (byte) 0);
			this.aClass93_Sub33_Sub1_39 = this.aClass115_8.method8198("pixelOffset", (byte) 0);
			this.aClass93_Sub33_Sub1_36 = this.aClass115_8.method8198("PosAndTexCoords", (byte) 0);
		} catch (@Pc(164) Exception_Sub2_Sub1 local164) {
			return false;
		} catch (@Pc(167) Exception_Sub2_Sub2 local167) {
			return false;
		}
		if (this.aClass116Array6[0].method8438() && this.aClass116Array6[1].method8438() && this.aClass116Array6[2].method8438()) {
			this.aBoolean258 = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ais", name = "b", descriptor = "()V")
	@Override
	void method11466() {
	}

	@OriginalMember(owner = "client!ais", name = "h", descriptor = "()V")
	@Override
	void method11467() {
	}

	@OriginalMember(owner = "client!ais", name = "a", descriptor = "(II)V")
	@Override
	void method11452(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ais", name = "g", descriptor = "(II)V")
	@Override
	void method11473(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ais", name = "ae", descriptor = "()I")
	@Override
	int method11472() {
		return 1;
	}

	@OriginalMember(owner = "client!ais", name = "j", descriptor = "(I)V")
	@Override
	void method11471(@OriginalArg(0) int arg0) {
		this.aClass115_8.method8255();
	}

	@OriginalMember(owner = "client!ais", name = "at", descriptor = "()Z")
	@Override
	boolean method11480() {
		return anInt1379 == 0 || aFloat139 == 1.0F || aFloatArray41[0] + aFloatArray41[1] + aFloatArray41[2] == 0.0F || aClass102_Sub2Array1[0] == null && aClass102_Sub2Array1[1] == null && aClass102_Sub2Array1[2] == null;
	}

	@OriginalMember(owner = "client!ais", name = "v", descriptor = "()Z")
	@Override
	boolean method11460() {
		return anInt1379 == 0 || aFloat139 == 1.0F || aFloatArray41[0] + aFloatArray41[1] + aFloatArray41[2] == 0.0F || aClass102_Sub2Array1[0] == null && aClass102_Sub2Array1[1] == null && aClass102_Sub2Array1[2] == null;
	}

	@OriginalMember(owner = "client!ais", name = "ah", descriptor = "()I")
	@Override
	int method11474() {
		return 1;
	}

	@OriginalMember(owner = "client!ais", name = "al", descriptor = "()I")
	@Override
	int method11475() {
		return 2;
	}

	@OriginalMember(owner = "client!ais", name = "ac", descriptor = "()I")
	@Override
	int method11476() {
		return 0;
	}

	@OriginalMember(owner = "client!ais", name = "e", descriptor = "()Z")
	@Override
	boolean method11447() {
		return this.aClass104_Sub2_25.aBoolean476 && this.aClass104_Sub2_25.method20898();
	}

	@OriginalMember(owner = "client!ais", name = "ad", descriptor = "(ILclient!afq;Lclient!lz;Lclient!dw;Lclient!lz;Z)V")
	@Override
	void method11481(@OriginalArg(0) int arg0, @OriginalArg(1) Class112_Sub1 arg1, @OriginalArg(2) Interface38 arg2, @OriginalArg(3) Interface19 arg3, @OriginalArg(4) Interface38 arg4, @OriginalArg(5) boolean arg5) {
		@Pc(3) float local3 = this.aClass104_Sub2_25.method20894();
		@Pc(7) float local7 = (float) arg1.method23748();
		@Pc(11) float local11 = (float) arg1.method23749();
		@Pc(19) float local19 = local3 * 2.0F / local7;
		@Pc(26) float local26 = -local3 * 2.0F / local11;
		@Pc(89) float[] local89 = new float[] { -1.0F + local19, local26 + 1.0F, 0.0F, 0.0F, -1.0F + local19, -3.0F + local26, 0.0F, 2.0F, local19 + 3.0F, local26 + 1.0F, 2.0F, 0.0F };
		@Pc(92) int local92 = (int) local7;
		@Pc(95) int local95 = (int) local11;
		@Pc(105) int local105 = arg5 ? this.aClass104_Sub2_25.method20447(1787906454).method23748() : local92;
		@Pc(115) int local115 = arg5 ? this.aClass104_Sub2_25.method20447(1529277067).method23749() : local95;
		@Pc(122) Class116 local122 = this.aClass116Array6[anInt1379 - 1];
		this.aClass115_8.method8203(local122);
		this.aClass115_8.method8285();
		this.aClass115_8.method8210(this.aClass93_Sub33_Sub1_38, aFloat139, aFloatArray41[0], aFloatArray41[1], aFloatArray41[2], 936889508);
		@Pc(148) Interface43 local148 = null;
		@Pc(150) Class93_Sub33_Sub1 local150 = null;
		for (@Pc(152) int local152 = 0; local152 < anInt1379; local152++) {
			if (aClass102_Sub2Array1[local152] != null) {
				local150 = this.aClass93_Sub33_Sub1Array1[local152];
				local148 = aClass102_Sub2Array1[local152].method2593();
				this.aClass115_8.method8293(local150, local152 + 1, local148, 2140231089);
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
		this.aClass115_8.method8213(this.aClass93_Sub33_Sub1_36, local89, -1778785883);
		this.aClass115_8.method8293(this.aClass93_Sub33_Sub1_37, 0, arg2, 2139633248);
		this.aClass115_8.method8210(this.aClass93_Sub33_Sub1_39, 0.0F, 0.0F, 0.0F, 0.0F, 1670416459);
		this.aClass104_Sub2_25.method20475(0, 0, local92, local95);
	}

	@OriginalMember(owner = "client!ais", name = "am", descriptor = "(ILclient!afq;Lclient!lz;Lclient!dw;Lclient!lz;Z)V")
	@Override
	void method11483(@OriginalArg(0) int arg0, @OriginalArg(1) Class112_Sub1 arg1, @OriginalArg(2) Interface38 arg2, @OriginalArg(3) Interface19 arg3, @OriginalArg(4) Interface38 arg4, @OriginalArg(5) boolean arg5) {
		@Pc(3) float local3 = this.aClass104_Sub2_25.method20894();
		@Pc(7) float local7 = (float) arg1.method23748();
		@Pc(11) float local11 = (float) arg1.method23749();
		@Pc(19) float local19 = local3 * 2.0F / local7;
		@Pc(26) float local26 = -local3 * 2.0F / local11;
		@Pc(89) float[] local89 = new float[] { -1.0F + local19, local26 + 1.0F, 0.0F, 0.0F, -1.0F + local19, -3.0F + local26, 0.0F, 2.0F, local19 + 3.0F, local26 + 1.0F, 2.0F, 0.0F };
		@Pc(92) int local92 = (int) local7;
		@Pc(95) int local95 = (int) local11;
		@Pc(105) int local105 = arg5 ? this.aClass104_Sub2_25.method20447(1423409896).method23748() : local92;
		@Pc(115) int local115 = arg5 ? this.aClass104_Sub2_25.method20447(2030722906).method23749() : local95;
		@Pc(122) Class116 local122 = this.aClass116Array6[anInt1379 - 1];
		this.aClass115_8.method8203(local122);
		this.aClass115_8.method8285();
		this.aClass115_8.method8210(this.aClass93_Sub33_Sub1_38, aFloat139, aFloatArray41[0], aFloatArray41[1], aFloatArray41[2], -1424483671);
		@Pc(148) Interface43 local148 = null;
		@Pc(150) Class93_Sub33_Sub1 local150 = null;
		for (@Pc(152) int local152 = 0; local152 < anInt1379; local152++) {
			if (aClass102_Sub2Array1[local152] != null) {
				local150 = this.aClass93_Sub33_Sub1Array1[local152];
				local148 = aClass102_Sub2Array1[local152].method2593();
				this.aClass115_8.method8293(local150, local152 + 1, local148, 2116091337);
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
		this.aClass115_8.method8213(this.aClass93_Sub33_Sub1_36, local89, -1778785883);
		this.aClass115_8.method8293(this.aClass93_Sub33_Sub1_37, 0, arg2, 2125990131);
		this.aClass115_8.method8210(this.aClass93_Sub33_Sub1_39, 0.0F, 0.0F, 0.0F, 0.0F, 1889657384);
		this.aClass104_Sub2_25.method20475(0, 0, local92, local95);
	}

	@OriginalMember(owner = "client!ais", name = "t", descriptor = "(I)V")
	@Override
	void method11468(@OriginalArg(0) int arg0) {
		this.aClass115_8.method8255();
	}
}
