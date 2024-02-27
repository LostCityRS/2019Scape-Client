package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aii")
public final class Class137_Sub2 extends Class137 {

	@OriginalMember(owner = "client!aii", name = "m", descriptor = "I")
	static final int anInt1308 = 256;

	@OriginalMember(owner = "client!aii", name = "k", descriptor = "F")
	public static float aFloat131 = 0.25F;

	@OriginalMember(owner = "client!aii", name = "f", descriptor = "F")
	public static float aFloat132 = 1.0F;

	@OriginalMember(owner = "client!aii", name = "w", descriptor = "F")
	public static float aFloat133 = 1.0F;

	@OriginalMember(owner = "client!aii", name = "l", descriptor = "F")
	public static float aFloat134 = 1.0F;

	@OriginalMember(owner = "client!aii", name = "d", descriptor = "Lclient!hi;")
	Class116 aClass116_6;

	@OriginalMember(owner = "client!aii", name = "u", descriptor = "Lclient!ho;")
	Class115 aClass115_7;

	@OriginalMember(owner = "client!aii", name = "z", descriptor = "Lclient!hi;")
	Class116 aClass116_7;

	@OriginalMember(owner = "client!aii", name = "q", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_30;

	@OriginalMember(owner = "client!aii", name = "s", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_31;

	@OriginalMember(owner = "client!aii", name = "c", descriptor = "Lclient!hi;")
	Class116 aClass116_8;

	@OriginalMember(owner = "client!aii", name = "p", descriptor = "Lclient!hi;")
	Class116 aClass116_9;

	@OriginalMember(owner = "client!aii", name = "v", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_32;

	@OriginalMember(owner = "client!aii", name = "o", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_33;

	@OriginalMember(owner = "client!aii", name = "x", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_34;

	@OriginalMember(owner = "client!aii", name = "y", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_35;

	@OriginalMember(owner = "client!aii", name = "r", descriptor = "Lclient!hi;")
	Class116 aClass116_10;

	@OriginalMember(owner = "client!aii", name = "b", descriptor = "Z")
	boolean aBoolean244;

	@OriginalMember(owner = "client!aii", name = "<init>", descriptor = "(Lclient!afc;)V")
	public Class137_Sub2(@OriginalArg(0) Class104_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!aii", name = "ad", descriptor = "(ILclient!afq;Lclient!lz;Lclient!dw;Lclient!lz;Z)V")
	@Override
	void method11481(@OriginalArg(0) int arg0, @OriginalArg(1) Class112_Sub1 arg1, @OriginalArg(2) Interface38 arg2, @OriginalArg(3) Interface19 arg3, @OriginalArg(4) Interface38 arg4, @OriginalArg(5) boolean arg5) {
		@Pc(3) float local3 = this.aClass104_Sub2_25.method20894();
		@Pc(7) float local7 = (float) arg1.method23748();
		@Pc(11) float local11 = (float) arg1.method23749();
		@Pc(13) Interface38 local13 = arg2;
		@Pc(19) float local19 = local3 * 2.0F / local7;
		@Pc(26) float local26 = -local3 * 2.0F / local11;
		@Pc(89) float[] local89 = new float[] { -1.0F + local19, local26 + 1.0F, 0.0F, 0.0F, -1.0F + local19, -3.0F + local26, 0.0F, 2.0F, local19 + 3.0F, local26 + 1.0F, 2.0F, 0.0F };
		@Pc(92) int local92 = (int) local7;
		@Pc(95) int local95 = (int) local11;
		@Pc(105) int local105 = arg5 ? this.aClass104_Sub2_25.method20447(1479925471).method23748() : local92;
		@Pc(115) int local115 = arg5 ? this.aClass104_Sub2_25.method20447(1611864851).method23749() : local95;
		if (arg0 == 0) {
			local92 = 256;
			local95 = 256;
			this.aClass115_7.method8203(this.aClass116_9);
			this.aClass115_7.method8285();
		} else if (arg0 == 1) {
			local92 = 256;
			local95 = 256;
			local105 = local92;
			local115 = local95;
			this.aClass115_7.method8203(this.aClass116_6);
			this.aClass115_7.method8285();
			this.aClass115_7.method8208(this.aClass93_Sub33_Sub1_35, aFloat134 / local7, 0.0F, (byte) 100);
		} else if (arg0 == 2) {
			local92 = 256;
			local95 = 256;
			local105 = local92;
			local115 = local95;
			this.aClass115_7.method8203(this.aClass116_6);
			this.aClass115_7.method8285();
			this.aClass115_7.method8208(this.aClass93_Sub33_Sub1_35, 0.0F, aFloat134 / local11, (byte) 94);
		} else if (arg0 == 3) {
			this.aClass115_7.method8203(this.aClass116_8);
			local13 = arg4;
			this.aClass115_7.method8293(this.aClass93_Sub33_Sub1_33, 1, arg2, 2115033053);
			this.aClass115_7.method8285();
		}
		@Pc(220) float local220 = (float) local92 / local7;
		@Pc(225) float local225 = (float) local95 / local11;
		@Pc(230) float local230 = (float) local105 / local7;
		@Pc(235) float local235 = (float) local115 / local11;
		local89[8] = (local89[8] + 1.0F) * local220 - 1.0F;
		local89[5] = (local89[5] - 1.0F) * local225 + 1.0F;
		local89[10] *= local230;
		local89[7] *= local235;
		this.aClass115_7.method8213(this.aClass93_Sub33_Sub1_34, local89, -1778785883);
		this.aClass115_7.method8293(this.aClass93_Sub33_Sub1_32, 0, local13, 2132226170);
		this.aClass115_7.method8210(this.aClass93_Sub33_Sub1_31, aFloat133, aFloat131, aFloat132, 0.0F, -2067527022);
		this.aClass115_7.method8210(this.aClass93_Sub33_Sub1_30, 0.0F, 0.0F, 256.0F / local7, 256.0F / local11, -1592310124);
		this.aClass104_Sub2_25.method20475(0, 0, local92, local95);
	}

	@OriginalMember(owner = "client!aii", name = "n", descriptor = "()Z")
	@Override
	boolean method11448() {
		return this.aBoolean244;
	}

	@OriginalMember(owner = "client!aii", name = "y", descriptor = "()Z")
	@Override
	boolean method11462() {
		return this.aBoolean244;
	}

	@OriginalMember(owner = "client!aii", name = "e", descriptor = "()Z")
	@Override
	boolean method11447() {
		return this.aClass104_Sub2_25.aBoolean476 && this.aClass104_Sub2_25.method20898() && this.aClass104_Sub2_25.method20899(true);
	}

	@OriginalMember(owner = "client!aii", name = "w", descriptor = "(II)V")
	@Override
	void method11463(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!aii", name = "f", descriptor = "()V")
	@Override
	void method11451() {
	}

	@OriginalMember(owner = "client!aii", name = "z", descriptor = "()I")
	@Override
	int method11455() {
		return 4;
	}

	@OriginalMember(owner = "client!aii", name = "q", descriptor = "()Z")
	@Override
	boolean method11464() {
		if (!this.method11447()) {
			return false;
		}
		this.aClass115_7 = this.aClass104_Sub2_25.method20904("FilterBloom");
		if (this.aClass115_7 == null) {
			return false;
		}
		try {
			this.aClass93_Sub33_Sub1_32 = this.aClass115_7.method8198("sceneTex", (byte) 0);
			this.aClass93_Sub33_Sub1_33 = this.aClass115_7.method8198("bloomTex1", (byte) 0);
			this.aClass93_Sub33_Sub1_31 = this.aClass115_7.method8198("params", (byte) 0);
			this.aClass93_Sub33_Sub1_35 = this.aClass115_7.method8198("sampleSize", (byte) 0);
			this.aClass93_Sub33_Sub1_30 = this.aClass115_7.method8198("pixelOffsetAndBloomScale", (byte) 0);
			this.aClass93_Sub33_Sub1_34 = this.aClass115_7.method8198("PosAndTexCoords", (byte) 0);
			this.aClass115_7.method8268("test", 1249273355);
			this.aClass116_7 = this.aClass115_7.method8268("techFullscreenTri", 1249273355);
			this.aClass116_9 = this.aClass115_7.method8268("brightpass", 1249273355);
			this.aClass116_6 = this.aClass115_7.method8268("blur", 1249273355);
			this.aClass116_8 = this.aClass115_7.method8268("composite", 1249273355);
			this.aClass116_10 = this.aClass115_7.method8268("techDefault", 1249273355);
		} catch (@Pc(98) Exception_Sub2_Sub1 local98) {
			return false;
		} catch (@Pc(101) Exception_Sub2_Sub2 local101) {
			return false;
		}
		if (!this.aClass116_7.method8438()) {
			return false;
		} else if (!this.aClass116_9.method8438()) {
			return false;
		} else if (!this.aClass116_6.method8438()) {
			return false;
		} else if (!this.aClass116_8.method8438()) {
			return false;
		} else if (this.aClass116_10.method8438()) {
			this.aBoolean244 = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!aii", name = "ae", descriptor = "()I")
	@Override
	int method11472() {
		return 4;
	}

	@OriginalMember(owner = "client!aii", name = "d", descriptor = "()I")
	@Override
	int method11457() {
		return 1;
	}

	@OriginalMember(owner = "client!aii", name = "p", descriptor = "()I")
	@Override
	int method11456() {
		return 0;
	}

	@OriginalMember(owner = "client!aii", name = "v", descriptor = "()Z")
	@Override
	boolean method11460() {
		return false;
	}

	@OriginalMember(owner = "client!aii", name = "o", descriptor = "()Z")
	@Override
	boolean method11446() {
		return this.aClass104_Sub2_25.aBoolean476 && this.aClass104_Sub2_25.method20898() && this.aClass104_Sub2_25.method20899(true);
	}

	@OriginalMember(owner = "client!aii", name = "u", descriptor = "(I)V")
	@Override
	void method11454(@OriginalArg(0) int arg0) {
		this.aClass115_7.method8255();
	}

	@OriginalMember(owner = "client!aii", name = "j", descriptor = "(I)V")
	@Override
	void method11471(@OriginalArg(0) int arg0) {
		this.aClass115_7.method8255();
	}

	@OriginalMember(owner = "client!aii", name = "m", descriptor = "()Z")
	@Override
	boolean method11461() {
		if (!this.method11447()) {
			return false;
		}
		this.aClass115_7 = this.aClass104_Sub2_25.method20904("FilterBloom");
		if (this.aClass115_7 == null) {
			return false;
		}
		try {
			this.aClass93_Sub33_Sub1_32 = this.aClass115_7.method8198("sceneTex", (byte) 0);
			this.aClass93_Sub33_Sub1_33 = this.aClass115_7.method8198("bloomTex1", (byte) 0);
			this.aClass93_Sub33_Sub1_31 = this.aClass115_7.method8198("params", (byte) 0);
			this.aClass93_Sub33_Sub1_35 = this.aClass115_7.method8198("sampleSize", (byte) 0);
			this.aClass93_Sub33_Sub1_30 = this.aClass115_7.method8198("pixelOffsetAndBloomScale", (byte) 0);
			this.aClass93_Sub33_Sub1_34 = this.aClass115_7.method8198("PosAndTexCoords", (byte) 0);
			this.aClass115_7.method8268("test", 1249273355);
			this.aClass116_7 = this.aClass115_7.method8268("techFullscreenTri", 1249273355);
			this.aClass116_9 = this.aClass115_7.method8268("brightpass", 1249273355);
			this.aClass116_6 = this.aClass115_7.method8268("blur", 1249273355);
			this.aClass116_8 = this.aClass115_7.method8268("composite", 1249273355);
			this.aClass116_10 = this.aClass115_7.method8268("techDefault", 1249273355);
		} catch (@Pc(98) Exception_Sub2_Sub1 local98) {
			return false;
		} catch (@Pc(101) Exception_Sub2_Sub2 local101) {
			return false;
		}
		if (!this.aClass116_7.method8438()) {
			return false;
		} else if (!this.aClass116_9.method8438()) {
			return false;
		} else if (!this.aClass116_6.method8438()) {
			return false;
		} else if (!this.aClass116_8.method8438()) {
			return false;
		} else if (this.aClass116_10.method8438()) {
			this.aBoolean244 = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!aii", name = "a", descriptor = "(II)V")
	@Override
	void method11452(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!aii", name = "h", descriptor = "()V")
	@Override
	void method11467() {
	}

	@OriginalMember(owner = "client!aii", name = "b", descriptor = "()V")
	@Override
	void method11466() {
	}

	@OriginalMember(owner = "client!aii", name = "g", descriptor = "(II)V")
	@Override
	void method11473(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!aii", name = "i", descriptor = "(I)V")
	@Override
	void method11470(@OriginalArg(0) int arg0) {
		this.aClass115_7.method8255();
	}

	@OriginalMember(owner = "client!aii", name = "t", descriptor = "(I)V")
	@Override
	void method11468(@OriginalArg(0) int arg0) {
		this.aClass115_7.method8255();
	}

	@OriginalMember(owner = "client!aii", name = "s", descriptor = "()Z")
	@Override
	boolean method11469() {
		return this.aBoolean244;
	}

	@OriginalMember(owner = "client!aii", name = "ag", descriptor = "()I")
	@Override
	int method11449() {
		return 4;
	}

	@OriginalMember(owner = "client!aii", name = "ah", descriptor = "()I")
	@Override
	int method11474() {
		return 4;
	}

	@OriginalMember(owner = "client!aii", name = "al", descriptor = "()I")
	@Override
	int method11475() {
		return 0;
	}

	@OriginalMember(owner = "client!aii", name = "ac", descriptor = "()I")
	@Override
	int method11476() {
		return 1;
	}

	@OriginalMember(owner = "client!aii", name = "at", descriptor = "()Z")
	@Override
	boolean method11480() {
		return false;
	}

	@OriginalMember(owner = "client!aii", name = "l", descriptor = "(ILclient!afq;Lclient!lz;Lclient!dw;Lclient!lz;Z)V")
	@Override
	void method11453(@OriginalArg(0) int arg0, @OriginalArg(1) Class112_Sub1 arg1, @OriginalArg(2) Interface38 arg2, @OriginalArg(3) Interface19 arg3, @OriginalArg(4) Interface38 arg4, @OriginalArg(5) boolean arg5) {
		@Pc(3) float local3 = this.aClass104_Sub2_25.method20894();
		@Pc(7) float local7 = (float) arg1.method23748();
		@Pc(11) float local11 = (float) arg1.method23749();
		@Pc(13) Interface38 local13 = arg2;
		@Pc(19) float local19 = local3 * 2.0F / local7;
		@Pc(26) float local26 = -local3 * 2.0F / local11;
		@Pc(89) float[] local89 = new float[] { -1.0F + local19, local26 + 1.0F, 0.0F, 0.0F, -1.0F + local19, -3.0F + local26, 0.0F, 2.0F, local19 + 3.0F, local26 + 1.0F, 2.0F, 0.0F };
		@Pc(92) int local92 = (int) local7;
		@Pc(95) int local95 = (int) local11;
		@Pc(105) int local105 = arg5 ? this.aClass104_Sub2_25.method20447(1820161649).method23748() : local92;
		@Pc(115) int local115 = arg5 ? this.aClass104_Sub2_25.method20447(1964727685).method23749() : local95;
		if (arg0 == 0) {
			local92 = 256;
			local95 = 256;
			this.aClass115_7.method8203(this.aClass116_9);
			this.aClass115_7.method8285();
		} else if (arg0 == 1) {
			local92 = 256;
			local95 = 256;
			local105 = local92;
			local115 = local95;
			this.aClass115_7.method8203(this.aClass116_6);
			this.aClass115_7.method8285();
			this.aClass115_7.method8208(this.aClass93_Sub33_Sub1_35, aFloat134 / local7, 0.0F, (byte) 67);
		} else if (arg0 == 2) {
			local92 = 256;
			local95 = 256;
			local105 = local92;
			local115 = local95;
			this.aClass115_7.method8203(this.aClass116_6);
			this.aClass115_7.method8285();
			this.aClass115_7.method8208(this.aClass93_Sub33_Sub1_35, 0.0F, aFloat134 / local11, (byte) 71);
		} else if (arg0 == 3) {
			this.aClass115_7.method8203(this.aClass116_8);
			local13 = arg4;
			this.aClass115_7.method8293(this.aClass93_Sub33_Sub1_33, 1, arg2, 2129881463);
			this.aClass115_7.method8285();
		}
		@Pc(220) float local220 = (float) local92 / local7;
		@Pc(225) float local225 = (float) local95 / local11;
		@Pc(230) float local230 = (float) local105 / local7;
		@Pc(235) float local235 = (float) local115 / local11;
		local89[8] = (local89[8] + 1.0F) * local220 - 1.0F;
		local89[5] = (local89[5] - 1.0F) * local225 + 1.0F;
		local89[10] *= local230;
		local89[7] *= local235;
		this.aClass115_7.method8213(this.aClass93_Sub33_Sub1_34, local89, -1778785883);
		this.aClass115_7.method8293(this.aClass93_Sub33_Sub1_32, 0, local13, 2123592220);
		this.aClass115_7.method8210(this.aClass93_Sub33_Sub1_31, aFloat133, aFloat131, aFloat132, 0.0F, -693421293);
		this.aClass115_7.method8210(this.aClass93_Sub33_Sub1_30, 0.0F, 0.0F, 256.0F / local7, 256.0F / local11, -272635731);
		this.aClass104_Sub2_25.method20475(0, 0, local92, local95);
	}

	@OriginalMember(owner = "client!aii", name = "am", descriptor = "(ILclient!afq;Lclient!lz;Lclient!dw;Lclient!lz;Z)V")
	@Override
	void method11483(@OriginalArg(0) int arg0, @OriginalArg(1) Class112_Sub1 arg1, @OriginalArg(2) Interface38 arg2, @OriginalArg(3) Interface19 arg3, @OriginalArg(4) Interface38 arg4, @OriginalArg(5) boolean arg5) {
		@Pc(3) float local3 = this.aClass104_Sub2_25.method20894();
		@Pc(7) float local7 = (float) arg1.method23748();
		@Pc(11) float local11 = (float) arg1.method23749();
		@Pc(13) Interface38 local13 = arg2;
		@Pc(19) float local19 = local3 * 2.0F / local7;
		@Pc(26) float local26 = -local3 * 2.0F / local11;
		@Pc(89) float[] local89 = new float[] { -1.0F + local19, local26 + 1.0F, 0.0F, 0.0F, -1.0F + local19, -3.0F + local26, 0.0F, 2.0F, local19 + 3.0F, local26 + 1.0F, 2.0F, 0.0F };
		@Pc(92) int local92 = (int) local7;
		@Pc(95) int local95 = (int) local11;
		@Pc(105) int local105 = arg5 ? this.aClass104_Sub2_25.method20447(1609175961).method23748() : local92;
		@Pc(115) int local115 = arg5 ? this.aClass104_Sub2_25.method20447(1922384124).method23749() : local95;
		if (arg0 == 0) {
			local92 = 256;
			local95 = 256;
			this.aClass115_7.method8203(this.aClass116_9);
			this.aClass115_7.method8285();
		} else if (arg0 == 1) {
			local92 = 256;
			local95 = 256;
			local105 = local92;
			local115 = local95;
			this.aClass115_7.method8203(this.aClass116_6);
			this.aClass115_7.method8285();
			this.aClass115_7.method8208(this.aClass93_Sub33_Sub1_35, aFloat134 / local7, 0.0F, (byte) 20);
		} else if (arg0 == 2) {
			local92 = 256;
			local95 = 256;
			local105 = local92;
			local115 = local95;
			this.aClass115_7.method8203(this.aClass116_6);
			this.aClass115_7.method8285();
			this.aClass115_7.method8208(this.aClass93_Sub33_Sub1_35, 0.0F, aFloat134 / local11, (byte) 51);
		} else if (arg0 == 3) {
			this.aClass115_7.method8203(this.aClass116_8);
			local13 = arg4;
			this.aClass115_7.method8293(this.aClass93_Sub33_Sub1_33, 1, arg2, 2113464349);
			this.aClass115_7.method8285();
		}
		@Pc(220) float local220 = (float) local92 / local7;
		@Pc(225) float local225 = (float) local95 / local11;
		@Pc(230) float local230 = (float) local105 / local7;
		@Pc(235) float local235 = (float) local115 / local11;
		local89[8] = (local89[8] + 1.0F) * local220 - 1.0F;
		local89[5] = (local89[5] - 1.0F) * local225 + 1.0F;
		local89[10] *= local230;
		local89[7] *= local235;
		this.aClass115_7.method8213(this.aClass93_Sub33_Sub1_34, local89, -1778785883);
		this.aClass115_7.method8293(this.aClass93_Sub33_Sub1_32, 0, local13, 2131017868);
		this.aClass115_7.method8210(this.aClass93_Sub33_Sub1_31, aFloat133, aFloat131, aFloat132, 0.0F, -1013476374);
		this.aClass115_7.method8210(this.aClass93_Sub33_Sub1_30, 0.0F, 0.0F, 256.0F / local7, 256.0F / local11, 556678213);
		this.aClass104_Sub2_25.method20475(0, 0, local92, local95);
	}

	@OriginalMember(owner = "client!aii", name = "au", descriptor = "(ILclient!afq;Lclient!lz;Lclient!dw;Lclient!lz;Z)V")
	@Override
	void method11458(@OriginalArg(0) int arg0, @OriginalArg(1) Class112_Sub1 arg1, @OriginalArg(2) Interface38 arg2, @OriginalArg(3) Interface19 arg3, @OriginalArg(4) Interface38 arg4, @OriginalArg(5) boolean arg5) {
		@Pc(3) float local3 = this.aClass104_Sub2_25.method20894();
		@Pc(7) float local7 = (float) arg1.method23748();
		@Pc(11) float local11 = (float) arg1.method23749();
		@Pc(13) Interface38 local13 = arg2;
		@Pc(19) float local19 = local3 * 2.0F / local7;
		@Pc(26) float local26 = -local3 * 2.0F / local11;
		@Pc(89) float[] local89 = new float[] { -1.0F + local19, local26 + 1.0F, 0.0F, 0.0F, -1.0F + local19, -3.0F + local26, 0.0F, 2.0F, local19 + 3.0F, local26 + 1.0F, 2.0F, 0.0F };
		@Pc(92) int local92 = (int) local7;
		@Pc(95) int local95 = (int) local11;
		@Pc(105) int local105 = arg5 ? this.aClass104_Sub2_25.method20447(1672860681).method23748() : local92;
		@Pc(115) int local115 = arg5 ? this.aClass104_Sub2_25.method20447(1318738824).method23749() : local95;
		if (arg0 == 0) {
			local92 = 256;
			local95 = 256;
			this.aClass115_7.method8203(this.aClass116_9);
			this.aClass115_7.method8285();
		} else if (arg0 == 1) {
			local92 = 256;
			local95 = 256;
			local105 = local92;
			local115 = local95;
			this.aClass115_7.method8203(this.aClass116_6);
			this.aClass115_7.method8285();
			this.aClass115_7.method8208(this.aClass93_Sub33_Sub1_35, aFloat134 / local7, 0.0F, (byte) 27);
		} else if (arg0 == 2) {
			local92 = 256;
			local95 = 256;
			local105 = local92;
			local115 = local95;
			this.aClass115_7.method8203(this.aClass116_6);
			this.aClass115_7.method8285();
			this.aClass115_7.method8208(this.aClass93_Sub33_Sub1_35, 0.0F, aFloat134 / local11, (byte) 73);
		} else if (arg0 == 3) {
			this.aClass115_7.method8203(this.aClass116_8);
			local13 = arg4;
			this.aClass115_7.method8293(this.aClass93_Sub33_Sub1_33, 1, arg2, 2121987304);
			this.aClass115_7.method8285();
		}
		@Pc(220) float local220 = (float) local92 / local7;
		@Pc(225) float local225 = (float) local95 / local11;
		@Pc(230) float local230 = (float) local105 / local7;
		@Pc(235) float local235 = (float) local115 / local11;
		local89[8] = (local89[8] + 1.0F) * local220 - 1.0F;
		local89[5] = (local89[5] - 1.0F) * local225 + 1.0F;
		local89[10] *= local230;
		local89[7] *= local235;
		this.aClass115_7.method8213(this.aClass93_Sub33_Sub1_34, local89, -1778785883);
		this.aClass115_7.method8293(this.aClass93_Sub33_Sub1_32, 0, local13, 2122014366);
		this.aClass115_7.method8210(this.aClass93_Sub33_Sub1_31, aFloat133, aFloat131, aFloat132, 0.0F, 1147148852);
		this.aClass115_7.method8210(this.aClass93_Sub33_Sub1_30, 0.0F, 0.0F, 256.0F / local7, 256.0F / local11, 51857163);
		this.aClass104_Sub2_25.method20475(0, 0, local92, local95);
	}
}
