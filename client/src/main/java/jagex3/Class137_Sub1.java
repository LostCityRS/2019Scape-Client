package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aia")
public final class Class137_Sub1 extends Class137 {

	@OriginalMember(owner = "client!aia", name = "p", descriptor = "F")
	public static float aFloat126 = 1.0F;

	@OriginalMember(owner = "client!aia", name = "d", descriptor = "F")
	public static float aFloat124 = 0.0F;

	@OriginalMember(owner = "client!aia", name = "c", descriptor = "F")
	public static float aFloat125 = 1.0F;

	@OriginalMember(owner = "client!aia", name = "r", descriptor = "F")
	public static float aFloat127 = 0.0F;

	@OriginalMember(owner = "client!aia", name = "v", descriptor = "F")
	public static float aFloat128 = 1.0F;

	@OriginalMember(owner = "client!aia", name = "o", descriptor = "Z")
	boolean aBoolean213;

	@OriginalMember(owner = "client!aia", name = "k", descriptor = "Lclient!hi;")
	Class116 aClass116_5;

	@OriginalMember(owner = "client!aia", name = "l", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_25;

	@OriginalMember(owner = "client!aia", name = "m", descriptor = "Lclient!ho;")
	Class115 aClass115_6;

	@OriginalMember(owner = "client!aia", name = "u", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_26;

	@OriginalMember(owner = "client!aia", name = "z", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_27;

	@OriginalMember(owner = "client!aia", name = "f", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_28;

	@OriginalMember(owner = "client!aia", name = "w", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_29;

	@OriginalMember(owner = "client!aia", name = "<init>", descriptor = "(Lclient!afc;)V")
	public Class137_Sub1(@OriginalArg(0) Class104_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!aia", name = "ac", descriptor = "()I")
	@Override
	int method11476() {
		return 0;
	}

	@OriginalMember(owner = "client!aia", name = "e", descriptor = "()Z")
	@Override
	boolean method11447() {
		return this.aClass104_Sub2_25.aBoolean476 && this.aClass104_Sub2_25.method20898();
	}

	@OriginalMember(owner = "client!aia", name = "i", descriptor = "(I)V")
	@Override
	void method11470(@OriginalArg(0) int arg0) {
		this.aClass115_6.method8255();
	}

	@OriginalMember(owner = "client!aia", name = "m", descriptor = "()Z")
	@Override
	boolean method11461() {
		if (!this.method11447()) {
			return false;
		}
		this.aClass115_6 = this.aClass104_Sub2_25.method20904("FilterLevels");
		if (this.aClass115_6 == null) {
			return false;
		}
		try {
			this.aClass93_Sub33_Sub1_28 = this.aClass115_6.method8198("sceneTex", (byte) 0);
			this.aClass93_Sub33_Sub1_29 = this.aClass115_6.method8198("paramsGamma", (byte) 0);
			this.aClass93_Sub33_Sub1_25 = this.aClass115_6.method8198("paramsRanges", (byte) 0);
			this.aClass93_Sub33_Sub1_26 = this.aClass115_6.method8198("pixelOffset", (byte) 0);
			this.aClass93_Sub33_Sub1_27 = this.aClass115_6.method8198("PosAndTexCoords", (byte) 0);
			this.aClass116_5 = this.aClass115_6.method8268("techAdjust", 1249273355);
		} catch (@Pc(57) Exception_Sub2_Sub1 local57) {
			return false;
		} catch (@Pc(60) Exception_Sub2_Sub2 local60) {
			return false;
		}
		if (this.aClass116_5.method8438()) {
			this.aBoolean213 = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!aia", name = "u", descriptor = "(I)V")
	@Override
	void method11454(@OriginalArg(0) int arg0) {
		this.aClass115_6.method8255();
	}

	@OriginalMember(owner = "client!aia", name = "au", descriptor = "(ILclient!afq;Lclient!lz;Lclient!dw;Lclient!lz;Z)V")
	@Override
	void method11458(@OriginalArg(0) int arg0, @OriginalArg(1) Class112_Sub1 arg1, @OriginalArg(2) Interface38 arg2, @OriginalArg(3) Interface19 arg3, @OriginalArg(4) Interface38 arg4, @OriginalArg(5) boolean arg5) {
		@Pc(3) float local3 = this.aClass104_Sub2_25.method20894();
		@Pc(7) float local7 = (float) arg1.method23748();
		@Pc(11) float local11 = (float) arg1.method23749();
		@Pc(17) float local17 = local3 * 2.0F / local7;
		@Pc(24) float local24 = -local3 * 2.0F / local11;
		@Pc(87) float[] local87 = new float[] { -1.0F + local17, local24 + 1.0F, 0.0F, 0.0F, -1.0F + local17, -3.0F + local24, 0.0F, 2.0F, local17 + 3.0F, local24 + 1.0F, 2.0F, 0.0F };
		@Pc(90) int local90 = (int) local7;
		@Pc(93) int local93 = (int) local11;
		@Pc(103) int local103 = arg5 ? this.aClass104_Sub2_25.method20447(1367957376).method23748() : local90;
		@Pc(113) int local113 = arg5 ? this.aClass104_Sub2_25.method20447(1576303739).method23749() : local93;
		this.aClass115_6.method8203(this.aClass116_5);
		this.aClass115_6.method8285();
		@Pc(127) float local127 = (float) local90 / local7;
		@Pc(132) float local132 = (float) local93 / local11;
		@Pc(137) float local137 = (float) local103 / local7;
		@Pc(142) float local142 = (float) local113 / local11;
		local87[8] = (local87[8] + 1.0F) * local127 - 1.0F;
		local87[5] = (local87[5] - 1.0F) * local132 + 1.0F;
		local87[10] *= local137;
		local87[7] *= local142;
		this.aClass115_6.method8213(this.aClass93_Sub33_Sub1_27, local87, -1778785883);
		this.aClass115_6.method8293(this.aClass93_Sub33_Sub1_28, 0, arg2, 2138592939);
		this.aClass115_6.method8309(this.aClass93_Sub33_Sub1_29, aFloat126, (byte) -111);
		this.aClass115_6.method8210(this.aClass93_Sub33_Sub1_25, aFloat124, aFloat125, aFloat127, aFloat128, -1000345428);
		this.aClass115_6.method8210(this.aClass93_Sub33_Sub1_26, 0.0F, 0.0F, 0.0F, 0.0F, -849618736);
		this.aClass104_Sub2_25.method20475(0, 0, local90, local93);
	}

	@OriginalMember(owner = "client!aia", name = "z", descriptor = "()I")
	@Override
	int method11455() {
		return 1;
	}

	@OriginalMember(owner = "client!aia", name = "ae", descriptor = "()I")
	@Override
	int method11472() {
		return 1;
	}

	@OriginalMember(owner = "client!aia", name = "l", descriptor = "(ILclient!afq;Lclient!lz;Lclient!dw;Lclient!lz;Z)V")
	@Override
	void method11453(@OriginalArg(0) int arg0, @OriginalArg(1) Class112_Sub1 arg1, @OriginalArg(2) Interface38 arg2, @OriginalArg(3) Interface19 arg3, @OriginalArg(4) Interface38 arg4, @OriginalArg(5) boolean arg5) {
		@Pc(3) float local3 = this.aClass104_Sub2_25.method20894();
		@Pc(7) float local7 = (float) arg1.method23748();
		@Pc(11) float local11 = (float) arg1.method23749();
		@Pc(17) float local17 = local3 * 2.0F / local7;
		@Pc(24) float local24 = -local3 * 2.0F / local11;
		@Pc(87) float[] local87 = new float[] { -1.0F + local17, local24 + 1.0F, 0.0F, 0.0F, -1.0F + local17, -3.0F + local24, 0.0F, 2.0F, local17 + 3.0F, local24 + 1.0F, 2.0F, 0.0F };
		@Pc(90) int local90 = (int) local7;
		@Pc(93) int local93 = (int) local11;
		@Pc(103) int local103 = arg5 ? this.aClass104_Sub2_25.method20447(1271870928).method23748() : local90;
		@Pc(113) int local113 = arg5 ? this.aClass104_Sub2_25.method20447(1847086466).method23749() : local93;
		this.aClass115_6.method8203(this.aClass116_5);
		this.aClass115_6.method8285();
		@Pc(127) float local127 = (float) local90 / local7;
		@Pc(132) float local132 = (float) local93 / local11;
		@Pc(137) float local137 = (float) local103 / local7;
		@Pc(142) float local142 = (float) local113 / local11;
		local87[8] = (local87[8] + 1.0F) * local127 - 1.0F;
		local87[5] = (local87[5] - 1.0F) * local132 + 1.0F;
		local87[10] *= local137;
		local87[7] *= local142;
		this.aClass115_6.method8213(this.aClass93_Sub33_Sub1_27, local87, -1778785883);
		this.aClass115_6.method8293(this.aClass93_Sub33_Sub1_28, 0, arg2, 2115766944);
		this.aClass115_6.method8309(this.aClass93_Sub33_Sub1_29, aFloat126, (byte) -59);
		this.aClass115_6.method8210(this.aClass93_Sub33_Sub1_25, aFloat124, aFloat125, aFloat127, aFloat128, 1809188679);
		this.aClass115_6.method8210(this.aClass93_Sub33_Sub1_26, 0.0F, 0.0F, 0.0F, 0.0F, -788125253);
		this.aClass104_Sub2_25.method20475(0, 0, local90, local93);
	}

	@OriginalMember(owner = "client!aia", name = "d", descriptor = "()I")
	@Override
	int method11457() {
		return 0;
	}

	@OriginalMember(owner = "client!aia", name = "p", descriptor = "()I")
	@Override
	int method11456() {
		return 1;
	}

	@OriginalMember(owner = "client!aia", name = "v", descriptor = "()Z")
	@Override
	boolean method11460() {
		return aFloat126 == 1.0F && aFloat124 == 0.0F && aFloat125 == 1.0F && aFloat127 == 0.0F && aFloat128 == 1.0F;
	}

	@OriginalMember(owner = "client!aia", name = "o", descriptor = "()Z")
	@Override
	boolean method11446() {
		return this.aClass104_Sub2_25.aBoolean476 && this.aClass104_Sub2_25.method20898();
	}

	@OriginalMember(owner = "client!aia", name = "s", descriptor = "()Z")
	@Override
	boolean method11469() {
		return this.aBoolean213;
	}

	@OriginalMember(owner = "client!aia", name = "am", descriptor = "(ILclient!afq;Lclient!lz;Lclient!dw;Lclient!lz;Z)V")
	@Override
	void method11483(@OriginalArg(0) int arg0, @OriginalArg(1) Class112_Sub1 arg1, @OriginalArg(2) Interface38 arg2, @OriginalArg(3) Interface19 arg3, @OriginalArg(4) Interface38 arg4, @OriginalArg(5) boolean arg5) {
		@Pc(3) float local3 = this.aClass104_Sub2_25.method20894();
		@Pc(7) float local7 = (float) arg1.method23748();
		@Pc(11) float local11 = (float) arg1.method23749();
		@Pc(17) float local17 = local3 * 2.0F / local7;
		@Pc(24) float local24 = -local3 * 2.0F / local11;
		@Pc(87) float[] local87 = new float[] { -1.0F + local17, local24 + 1.0F, 0.0F, 0.0F, -1.0F + local17, -3.0F + local24, 0.0F, 2.0F, local17 + 3.0F, local24 + 1.0F, 2.0F, 0.0F };
		@Pc(90) int local90 = (int) local7;
		@Pc(93) int local93 = (int) local11;
		@Pc(103) int local103 = arg5 ? this.aClass104_Sub2_25.method20447(1218995161).method23748() : local90;
		@Pc(113) int local113 = arg5 ? this.aClass104_Sub2_25.method20447(1375951130).method23749() : local93;
		this.aClass115_6.method8203(this.aClass116_5);
		this.aClass115_6.method8285();
		@Pc(127) float local127 = (float) local90 / local7;
		@Pc(132) float local132 = (float) local93 / local11;
		@Pc(137) float local137 = (float) local103 / local7;
		@Pc(142) float local142 = (float) local113 / local11;
		local87[8] = (local87[8] + 1.0F) * local127 - 1.0F;
		local87[5] = (local87[5] - 1.0F) * local132 + 1.0F;
		local87[10] *= local137;
		local87[7] *= local142;
		this.aClass115_6.method8213(this.aClass93_Sub33_Sub1_27, local87, -1778785883);
		this.aClass115_6.method8293(this.aClass93_Sub33_Sub1_28, 0, arg2, 2121204725);
		this.aClass115_6.method8309(this.aClass93_Sub33_Sub1_29, aFloat126, (byte) -115);
		this.aClass115_6.method8210(this.aClass93_Sub33_Sub1_25, aFloat124, aFloat125, aFloat127, aFloat128, -1203637076);
		this.aClass115_6.method8210(this.aClass93_Sub33_Sub1_26, 0.0F, 0.0F, 0.0F, 0.0F, -1511197034);
		this.aClass104_Sub2_25.method20475(0, 0, local90, local93);
	}

	@OriginalMember(owner = "client!aia", name = "q", descriptor = "()Z")
	@Override
	boolean method11464() {
		if (!this.method11447()) {
			return false;
		}
		this.aClass115_6 = this.aClass104_Sub2_25.method20904("FilterLevels");
		if (this.aClass115_6 == null) {
			return false;
		}
		try {
			this.aClass93_Sub33_Sub1_28 = this.aClass115_6.method8198("sceneTex", (byte) 0);
			this.aClass93_Sub33_Sub1_29 = this.aClass115_6.method8198("paramsGamma", (byte) 0);
			this.aClass93_Sub33_Sub1_25 = this.aClass115_6.method8198("paramsRanges", (byte) 0);
			this.aClass93_Sub33_Sub1_26 = this.aClass115_6.method8198("pixelOffset", (byte) 0);
			this.aClass93_Sub33_Sub1_27 = this.aClass115_6.method8198("PosAndTexCoords", (byte) 0);
			this.aClass116_5 = this.aClass115_6.method8268("techAdjust", 1249273355);
		} catch (@Pc(57) Exception_Sub2_Sub1 local57) {
			return false;
		} catch (@Pc(60) Exception_Sub2_Sub2 local60) {
			return false;
		}
		if (this.aClass116_5.method8438()) {
			this.aBoolean213 = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!aia", name = "b", descriptor = "()V")
	@Override
	void method11466() {
	}

	@OriginalMember(owner = "client!aia", name = "h", descriptor = "()V")
	@Override
	void method11467() {
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(II)V")
	@Override
	void method11452(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!aia", name = "g", descriptor = "(II)V")
	@Override
	void method11473(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!aia", name = "at", descriptor = "()Z")
	@Override
	boolean method11480() {
		return aFloat126 == 1.0F && aFloat124 == 0.0F && aFloat125 == 1.0F && aFloat127 == 0.0F && aFloat128 == 1.0F;
	}

	@OriginalMember(owner = "client!aia", name = "j", descriptor = "(I)V")
	@Override
	void method11471(@OriginalArg(0) int arg0) {
		this.aClass115_6.method8255();
	}

	@OriginalMember(owner = "client!aia", name = "t", descriptor = "(I)V")
	@Override
	void method11468(@OriginalArg(0) int arg0) {
		this.aClass115_6.method8255();
	}

	@OriginalMember(owner = "client!aia", name = "f", descriptor = "()V")
	@Override
	void method11451() {
	}

	@OriginalMember(owner = "client!aia", name = "ag", descriptor = "()I")
	@Override
	int method11449() {
		return 1;
	}

	@OriginalMember(owner = "client!aia", name = "al", descriptor = "()I")
	@Override
	int method11475() {
		return 1;
	}

	@OriginalMember(owner = "client!aia", name = "ah", descriptor = "()I")
	@Override
	int method11474() {
		return 1;
	}

	@OriginalMember(owner = "client!aia", name = "w", descriptor = "(II)V")
	@Override
	void method11463(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!aia", name = "ad", descriptor = "(ILclient!afq;Lclient!lz;Lclient!dw;Lclient!lz;Z)V")
	@Override
	void method11481(@OriginalArg(0) int arg0, @OriginalArg(1) Class112_Sub1 arg1, @OriginalArg(2) Interface38 arg2, @OriginalArg(3) Interface19 arg3, @OriginalArg(4) Interface38 arg4, @OriginalArg(5) boolean arg5) {
		@Pc(3) float local3 = this.aClass104_Sub2_25.method20894();
		@Pc(7) float local7 = (float) arg1.method23748();
		@Pc(11) float local11 = (float) arg1.method23749();
		@Pc(17) float local17 = local3 * 2.0F / local7;
		@Pc(24) float local24 = -local3 * 2.0F / local11;
		@Pc(87) float[] local87 = new float[] { -1.0F + local17, local24 + 1.0F, 0.0F, 0.0F, -1.0F + local17, -3.0F + local24, 0.0F, 2.0F, local17 + 3.0F, local24 + 1.0F, 2.0F, 0.0F };
		@Pc(90) int local90 = (int) local7;
		@Pc(93) int local93 = (int) local11;
		@Pc(103) int local103 = arg5 ? this.aClass104_Sub2_25.method20447(1289150927).method23748() : local90;
		@Pc(113) int local113 = arg5 ? this.aClass104_Sub2_25.method20447(1315985760).method23749() : local93;
		this.aClass115_6.method8203(this.aClass116_5);
		this.aClass115_6.method8285();
		@Pc(127) float local127 = (float) local90 / local7;
		@Pc(132) float local132 = (float) local93 / local11;
		@Pc(137) float local137 = (float) local103 / local7;
		@Pc(142) float local142 = (float) local113 / local11;
		local87[8] = (local87[8] + 1.0F) * local127 - 1.0F;
		local87[5] = (local87[5] - 1.0F) * local132 + 1.0F;
		local87[10] *= local137;
		local87[7] *= local142;
		this.aClass115_6.method8213(this.aClass93_Sub33_Sub1_27, local87, -1778785883);
		this.aClass115_6.method8293(this.aClass93_Sub33_Sub1_28, 0, arg2, 2111816401);
		this.aClass115_6.method8309(this.aClass93_Sub33_Sub1_29, aFloat126, (byte) -100);
		this.aClass115_6.method8210(this.aClass93_Sub33_Sub1_25, aFloat124, aFloat125, aFloat127, aFloat128, -571573627);
		this.aClass115_6.method8210(this.aClass93_Sub33_Sub1_26, 0.0F, 0.0F, 0.0F, 0.0F, -1660116997);
		this.aClass104_Sub2_25.method20475(0, 0, local90, local93);
	}

	@OriginalMember(owner = "client!aia", name = "n", descriptor = "()Z")
	@Override
	boolean method11448() {
		return this.aBoolean213;
	}

	@OriginalMember(owner = "client!aia", name = "y", descriptor = "()Z")
	@Override
	boolean method11462() {
		return this.aBoolean213;
	}
}
