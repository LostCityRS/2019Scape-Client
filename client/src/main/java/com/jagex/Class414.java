package com.jagex;

import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sun.misc.Unsafe;

@OriginalClass("client!md")
public final class Class414 {

	@OriginalMember(owner = "client!md", name = "m", descriptor = "Lclient!lm;")
	Class401 aClass401_4;

	@OriginalMember(owner = "client!md", name = "n", descriptor = "Lclient!lm;")
	Class401 aClass401_5 = Class401.aClass401_2;

	@OriginalMember(owner = "client!md", name = "k", descriptor = "I")
	int anInt4921 = 128;

	@OriginalMember(owner = "client!md", name = "f", descriptor = "I")
	int anInt4920 = 0;

	@OriginalMember(owner = "client!md", name = "w", descriptor = "[F")
	float[] aFloatArray106 = new float[this.anInt4921 * 16];

	@OriginalMember(owner = "client!md", name = "l", descriptor = "[Lclient!lz;")
	Interface38[] anInterface38Array3 = new Interface38[this.anInt4921];

	@OriginalMember(owner = "client!md", name = "u", descriptor = "[I")
	int[] anIntArray445 = new int[this.anInt4921];

	@OriginalMember(owner = "client!md", name = "r", descriptor = "[I")
	int[] anIntArray446 = new int[4];

	@OriginalMember(owner = "client!md", name = "e", descriptor = "Lclient!afc;")
	final Class104_Sub2 aClass104_Sub2_40;

	@OriginalMember(owner = "client!md", name = "p", descriptor = "Lclient!lr;")
	Interface37 anInterface37_21;

	@OriginalMember(owner = "client!md", name = "d", descriptor = "Lclient!lo;")
	Class145 aClass145_25;

	@OriginalMember(owner = "client!md", name = "c", descriptor = "Lclient!ml;")
	Interface40 anInterface40_9;

	@OriginalMember(owner = "client!md", name = "z", descriptor = "I")
	int anInt4919;

	@OriginalMember(owner = "client!md", name = "<init>", descriptor = "(Lclient!afc;I)V")
	Class414(@OriginalArg(0) Class104_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.aClass104_Sub2_40 = arg0;
		this.anInterface37_21 = this.aClass104_Sub2_40.method21025(true);
		this.anInterface37_21.method29496(arg1 * 96, 24);
		this.aClass145_25 = this.aClass104_Sub2_40.method21005(new Class400[] { new Class400(new Class399[] { Class399.aClass399_9, Class399.aClass399_1, Class399.aClass399_10 }) });
		this.anInterface40_9 = this.aClass104_Sub2_40.method21007(false);
		@Pc(85) int local85 = arg1 * 6;
		this.anInterface40_9.method29532(local85);
		@Pc(98) int local98 = local85 * this.anInterface40_9.method29533().anInt3687 * -1066472467;
		@Pc(102) ByteBuffer local102 = this.aClass104_Sub2_40.aByteBuffer7;
		this.aClass104_Sub2_40.method20901(local98);
		local102.clear();
		for (@Pc(111) int local111 = 0; local111 < arg1; local111++) {
			local102.putShort((short) (local111 * 4));
			local102.putShort((short) (local111 * 4 + 2));
			local102.putShort((short) (local111 * 4 + 1));
			local102.putShort((short) (local111 * 4 + 2));
			local102.putShort((short) (local111 * 4 + 3));
			local102.putShort((short) (local111 * 4 + 1));
		}
		this.anInterface40_9.method29514(0, local85 * this.anInterface40_9.method29533().anInt3687 * -1066472467, this.aClass104_Sub2_40.aLong132);
		this.anInt4919 = arg1;
		this.anInt4920 = 0;
	}

	@OriginalMember(owner = "client!md", name = "x", descriptor = "(FFFFFFFFFFFFFFFFLclient!lz;I)V")
	void method28852(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10, @OriginalArg(11) float arg11, @OriginalArg(12) float arg12, @OriginalArg(13) float arg13, @OriginalArg(14) float arg14, @OriginalArg(15) float arg15, @OriginalArg(16) Interface38 arg16, @OriginalArg(17) int arg17) {
		if ((arg17 & 0xFF000000) == 0) {
			return;
		}
		this.aClass104_Sub2_40.method20482(this.anIntArray446);
		@Pc(14) int local14 = this.anIntArray446[0];
		@Pc(19) int local19 = this.anIntArray446[1];
		@Pc(24) int local24 = this.anIntArray446[2];
		@Pc(29) int local29 = this.anIntArray446[3];
		@Pc(31) byte local31 = 0;
		@Pc(67) int local67 = (arg0 < (float) local14 ? 1 : 0) + (arg2 < (float) local14 ? 1 : 0) + (arg4 < (float) local14 ? 1 : 0) + (arg6 < (float) local14 ? 1 : 0);
		if (local67 == 4) {
			return;
		}
		@Pc(75) int local75 = local31 | local67;
		local67 = (arg0 > (float) local24 ? 1 : 0) + (arg2 > (float) local24 ? 1 : 0) + (arg4 > (float) local24 ? 1 : 0) + (arg6 > (float) local24 ? 1 : 0);
		if (local67 == 4) {
			return;
		}
		local75 |= local67;
		local67 = (arg1 < (float) local19 ? 1 : 0) + (arg3 < (float) local19 ? 1 : 0) + (arg5 < (float) local19 ? 1 : 0) + (arg7 < (float) local19 ? 1 : 0);
		if (local67 == 4) {
			return;
		}
		local75 |= local67;
		local67 = (arg1 > (float) local29 ? 1 : 0) + (arg3 > (float) local29 ? 1 : 0) + (arg5 > (float) local29 ? 1 : 0) + (arg7 > (float) local29 ? 1 : 0);
		if (local67 == 4) {
			return;
		}
		local75 |= local67;
		if (local75 != 0) {
			this.method28854();
			this.aClass104_Sub2_40.method20481(true);
			this.aClass104_Sub2_40.method20479(local14, local19, local24, local29);
		}
		this.method28856();
		@Pc(228) float local228 = this.method28857(arg0);
		@Pc(232) float local232 = this.method28858(arg1);
		@Pc(236) float local236 = this.method28857(arg2);
		@Pc(240) float local240 = this.method28858(arg3);
		@Pc(244) float local244 = this.method28857(arg4);
		@Pc(248) float local248 = this.method28858(arg5);
		@Pc(252) float local252 = this.method28857(arg6);
		@Pc(256) float local256 = this.method28858(arg7);
		this.aFloatArray106[this.anInt4920 * 16] = local228;
		this.aFloatArray106[this.anInt4920 * 16 + 1] = local232;
		this.aFloatArray106[this.anInt4920 * 16 + 2] = arg8;
		this.aFloatArray106[this.anInt4920 * 16 + 3] = arg9;
		this.aFloatArray106[this.anInt4920 * 16 + 4] = local236;
		this.aFloatArray106[this.anInt4920 * 16 + 5] = local240;
		this.aFloatArray106[this.anInt4920 * 16 + 6] = arg10;
		this.aFloatArray106[this.anInt4920 * 16 + 7] = arg11;
		this.aFloatArray106[this.anInt4920 * 16 + 8] = local244;
		this.aFloatArray106[this.anInt4920 * 16 + 9] = local248;
		this.aFloatArray106[this.anInt4920 * 16 + 10] = arg12;
		this.aFloatArray106[this.anInt4920 * 16 + 11] = arg13;
		this.aFloatArray106[this.anInt4920 * 16 + 12] = local252;
		this.aFloatArray106[this.anInt4920 * 16 + 13] = local256;
		this.aFloatArray106[this.anInt4920 * 16 + 14] = arg14;
		this.aFloatArray106[this.anInt4920 * 16 + 15] = arg15;
		this.anInterface38Array3[this.anInt4920] = arg16;
		if (this.aClass104_Sub2_40.anInt2953 == 1) {
			this.anIntArray445[this.anInt4920] = arg17 & 0xFF00FF00 | (arg17 & 0xFF) << 16 | arg17 >> 16 & 0xFF;
		} else {
			this.anIntArray445[this.anInt4920] = arg17;
		}
		this.anInt4920++;
		if (this.aClass401_5 == Class401.aClass401_1 || local75 > 0) {
			this.method28854();
		}
		if (local75 != 0) {
			this.aClass104_Sub2_40.method20481(false);
			this.aClass104_Sub2_40.method20478();
			this.aClass104_Sub2_40.method20479(local14, local19, local24, local29);
		}
	}

	@OriginalMember(owner = "client!md", name = "e", descriptor = "()V")
	void method28853() {
		this.anInterface37_21.method31065();
		this.anInterface40_9.method31065();
		this.anInterface37_21 = null;
		this.anInterface40_9 = null;
		this.aClass145_25 = null;
		this.anInt4920 = 0;
	}

	@OriginalMember(owner = "client!md", name = "n", descriptor = "()V")
	void method28854() {
		if (this.anInt4920 == 0) {
			return;
		}
		this.aClass104_Sub2_40.method21020();
		this.aClass104_Sub2_40.method20994(1);
		this.aClass104_Sub2_40.method21042(this.anInterface40_9);
		this.aClass104_Sub2_40.method21060(0, this.anInterface37_21);
		this.aClass104_Sub2_40.method21118(this.aClass145_25);
		@Pc(30) Class130 local30 = this.aClass104_Sub2_40.aClass130_3;
		@Pc(34) Unsafe local34 = this.aClass104_Sub2_40.anUnsafe4;
		@Pc(38) ByteBuffer local38 = this.aClass104_Sub2_40.aByteBuffer7;
		local38.clear();
		this.aClass104_Sub2_40.method20986().method30018(Class489.aClass489_99);
		this.aClass104_Sub2_40.method21115(Class425.aClass425_1);
		@Pc(61) int local61 = (this.anInt4920 + this.anInt4919 - 1) / this.anInt4919;
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		for (@Pc(67) int local67 = 0; local67 < local61; local67++) {
			@Pc(78) int local78 = Math.min(this.anInt4919, this.anInt4920 - local63);
			@Pc(86) long local86 = this.anInterface37_21.method29513(0, local78 * 96);
			@Pc(93) int local93 = local67 * this.anInt4919 + local78;
			@Pc(100) int local100;
			for (@Pc(95) int local95 = local63; local95 < local93; local95++) {
				for (local100 = 0; local100 < 4; local100++) {
					local34.putFloat(local86, this.aFloatArray106[local65++]);
					local86 += 4L;
					local34.putFloat(local86, this.aFloatArray106[local65++]);
					local86 += 4L;
					local34.putFloat(local86, 0.0F);
					local86 += 4L;
					local34.putFloat(local86, this.aFloatArray106[local65++]);
					local86 += 4L;
					local34.putFloat(local86, this.aFloatArray106[local65++]);
					local86 += 4L;
					local34.putInt(local86, this.anIntArray445[local95]);
					local86 += 4L;
				}
			}
			this.anInterface37_21.method29525();
			@Pc(182) Interface38 local182 = this.anInterface38Array3[local63];
			local100 = 1;
			@Pc(186) int local186 = 0;
			for (@Pc(190) int local190 = local63 + 1; local190 < local93; local190++) {
				if (local182 == this.anInterface38Array3[local190]) {
					local100++;
				} else {
					local30.anInterface38_12 = local182;
					local30.method10025();
					this.aClass104_Sub2_40.method21018(this.anInterface40_9, Class424.aClass424_3, local186 * 4, local100 * 4, local186 * 6, local100 * 2);
					local182 = this.anInterface38Array3[local190];
					local100 = 1;
					local186 = local190 - local63;
				}
			}
			local30.anInterface38_12 = local182;
			local30.method10025();
			this.aClass104_Sub2_40.method21018(this.anInterface40_9, Class424.aClass424_3, local186 * 4, local100 * 4, local186 * 6, local100 * 2);
			local63 += this.anInt4919;
		}
		this.anInt4920 = 0;
	}

	@OriginalMember(owner = "client!md", name = "m", descriptor = "(FFFFFFFFLclient!lz;I)V")
	void method28855(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) Interface38 arg8, @OriginalArg(9) int arg9) {
		if ((arg9 & 0xFF000000) == 0) {
			return;
		}
		this.aClass104_Sub2_40.method20482(this.anIntArray446);
		@Pc(14) int local14 = this.anIntArray446[0];
		@Pc(19) int local19 = this.anIntArray446[1];
		@Pc(24) int local24 = this.anIntArray446[2];
		@Pc(29) int local29 = this.anIntArray446[3];
		if (arg0 > (float) local24 || (arg1 > (float) local29 || (arg2 < (float) local14 || arg3 < (float) local19))) {
			return;
		}
		@Pc(57) float local57 = arg2 - arg0;
		@Pc(61) float local61 = arg3 - arg1;
		@Pc(65) float local65 = arg6 - arg4;
		@Pc(69) float local69 = arg7 - arg5;
		if (arg0 < (float) local14) {
			arg4 += ((float) local14 - arg0) / local57 * local65;
			arg0 = local14;
		}
		if (arg1 < (float) local19) {
			arg5 += ((float) local19 - arg1) / local61 * local69;
			arg1 = local19;
		}
		if (arg2 > (float) local24) {
			arg6 -= (arg2 - (float) local24) / local57 * local65;
			arg2 = local24;
		}
		if (arg3 > (float) local29) {
			arg7 -= (arg3 - (float) local29) / local61 * local69;
			arg3 = local29;
		}
		this.method28856();
		arg0 = this.method28857(arg0);
		arg1 = this.method28858(arg1);
		arg2 = this.method28857(arg2);
		arg3 = this.method28858(arg3);
		this.aFloatArray106[this.anInt4920 * 16] = arg0;
		this.aFloatArray106[this.anInt4920 * 16 + 1] = arg1;
		this.aFloatArray106[this.anInt4920 * 16 + 2] = arg4;
		this.aFloatArray106[this.anInt4920 * 16 + 3] = arg5;
		this.aFloatArray106[this.anInt4920 * 16 + 4] = arg2;
		this.aFloatArray106[this.anInt4920 * 16 + 5] = arg1;
		this.aFloatArray106[this.anInt4920 * 16 + 6] = arg6;
		this.aFloatArray106[this.anInt4920 * 16 + 7] = arg5;
		this.aFloatArray106[this.anInt4920 * 16 + 8] = arg0;
		this.aFloatArray106[this.anInt4920 * 16 + 9] = arg3;
		this.aFloatArray106[this.anInt4920 * 16 + 10] = arg4;
		this.aFloatArray106[this.anInt4920 * 16 + 11] = arg7;
		this.aFloatArray106[this.anInt4920 * 16 + 12] = arg2;
		this.aFloatArray106[this.anInt4920 * 16 + 13] = arg3;
		this.aFloatArray106[this.anInt4920 * 16 + 14] = arg6;
		this.aFloatArray106[this.anInt4920 * 16 + 15] = arg7;
		this.anInterface38Array3[this.anInt4920] = arg8;
		if (this.aClass104_Sub2_40.anInt2953 == 1) {
			this.anIntArray445[this.anInt4920] = arg9 & 0xFF00FF00 | (arg9 & 0xFF) << 16 | arg9 >> 16 & 0xFF;
		} else {
			this.anIntArray445[this.anInt4920] = arg9;
		}
		this.anInt4920++;
		if (this.aClass401_5 == Class401.aClass401_1) {
			this.method28854();
		}
	}

	@OriginalMember(owner = "client!md", name = "f", descriptor = "()V")
	void method28856() {
		if (this.anInt4920 != this.anInt4921) {
			return;
		}
		this.anInt4921 *= 2;
		@Pc(16) float[] local16 = new float[this.anInt4921 * 16];
		for (@Pc(18) int local18 = 0; local18 < this.anInt4920 * 16; local18++) {
			local16[local18] = this.aFloatArray106[local18];
		}
		this.aFloatArray106 = local16;
		@Pc(40) Interface38[] local40 = new Interface38[this.anInt4921];
		@Pc(44) int[] local44 = new int[this.anInt4921];
		for (@Pc(46) int local46 = 0; local46 < this.anInt4920; local46++) {
			local40[local46] = this.anInterface38Array3[local46];
			local44[local46] = this.anIntArray445[local46];
		}
		this.anInterface38Array3 = local40;
		this.anIntArray445 = local44;
	}

	@OriginalMember(owner = "client!md", name = "w", descriptor = "(F)F")
	float method28857(@OriginalArg(0) float arg0) {
		@Pc(5) int local5 = this.aClass104_Sub2_40.method20446((byte) -118).method23748();
		return (arg0 + this.aClass104_Sub2_40.method20894()) / (float) local5 * 2.0F - 1.0F;
	}

	@OriginalMember(owner = "client!md", name = "l", descriptor = "(F)F")
	float method28858(@OriginalArg(0) float arg0) {
		@Pc(5) int local5 = this.aClass104_Sub2_40.method20446((byte) -85).method23749();
		return (1.0F - (arg0 + this.aClass104_Sub2_40.method20894()) / (float) local5) * 2.0F - 1.0F;
	}

	@OriginalMember(owner = "client!md", name = "o", descriptor = "()V")
	void method28859() {
		if (this.anInt4920 == 0) {
			return;
		}
		this.aClass104_Sub2_40.method21020();
		this.aClass104_Sub2_40.method20994(1);
		this.aClass104_Sub2_40.method21042(this.anInterface40_9);
		this.aClass104_Sub2_40.method21060(0, this.anInterface37_21);
		this.aClass104_Sub2_40.method21118(this.aClass145_25);
		@Pc(30) Class130 local30 = this.aClass104_Sub2_40.aClass130_3;
		@Pc(34) Unsafe local34 = this.aClass104_Sub2_40.anUnsafe4;
		@Pc(38) ByteBuffer local38 = this.aClass104_Sub2_40.aByteBuffer7;
		local38.clear();
		this.aClass104_Sub2_40.method20986().method30018(Class489.aClass489_99);
		this.aClass104_Sub2_40.method21115(Class425.aClass425_1);
		@Pc(61) int local61 = (this.anInt4920 + this.anInt4919 - 1) / this.anInt4919;
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		for (@Pc(67) int local67 = 0; local67 < local61; local67++) {
			@Pc(78) int local78 = Math.min(this.anInt4919, this.anInt4920 - local63);
			@Pc(86) long local86 = this.anInterface37_21.method29513(0, local78 * 96);
			@Pc(93) int local93 = local67 * this.anInt4919 + local78;
			@Pc(100) int local100;
			for (@Pc(95) int local95 = local63; local95 < local93; local95++) {
				for (local100 = 0; local100 < 4; local100++) {
					local34.putFloat(local86, this.aFloatArray106[local65++]);
					local86 += 4L;
					local34.putFloat(local86, this.aFloatArray106[local65++]);
					local86 += 4L;
					local34.putFloat(local86, 0.0F);
					local86 += 4L;
					local34.putFloat(local86, this.aFloatArray106[local65++]);
					local86 += 4L;
					local34.putFloat(local86, this.aFloatArray106[local65++]);
					local86 += 4L;
					local34.putInt(local86, this.anIntArray445[local95]);
					local86 += 4L;
				}
			}
			this.anInterface37_21.method29525();
			@Pc(182) Interface38 local182 = this.anInterface38Array3[local63];
			local100 = 1;
			@Pc(186) int local186 = 0;
			for (@Pc(190) int local190 = local63 + 1; local190 < local93; local190++) {
				if (local182 == this.anInterface38Array3[local190]) {
					local100++;
				} else {
					local30.anInterface38_12 = local182;
					local30.method10025();
					this.aClass104_Sub2_40.method21018(this.anInterface40_9, Class424.aClass424_3, local186 * 4, local100 * 4, local186 * 6, local100 * 2);
					local182 = this.anInterface38Array3[local190];
					local100 = 1;
					local186 = local190 - local63;
				}
			}
			local30.anInterface38_12 = local182;
			local30.method10025();
			this.aClass104_Sub2_40.method21018(this.anInterface40_9, Class424.aClass424_3, local186 * 4, local100 * 4, local186 * 6, local100 * 2);
			local63 += this.anInt4919;
		}
		this.anInt4920 = 0;
	}

	@OriginalMember(owner = "client!md", name = "z", descriptor = "()V")
	void method28860() {
		if (this.aClass401_4 != null) {
			this.aClass401_5 = this.aClass401_4;
			this.aClass401_4 = null;
		}
	}

	@OriginalMember(owner = "client!md", name = "p", descriptor = "()Lclient!lm;")
	Class401 method28861() {
		return this.aClass401_5;
	}

	@OriginalMember(owner = "client!md", name = "d", descriptor = "()V")
	void method28862() {
		this.anInterface37_21.method31065();
		this.anInterface40_9.method31065();
		this.anInterface37_21 = null;
		this.anInterface40_9 = null;
		this.aClass145_25 = null;
		this.anInt4920 = 0;
	}

	@OriginalMember(owner = "client!md", name = "u", descriptor = "()V")
	void method28863() {
		this.aClass401_4 = this.aClass401_5;
		this.aClass401_5 = Class401.aClass401_3;
	}

	@OriginalMember(owner = "client!md", name = "k", descriptor = "(FFFFFFFFFFFFFFFFLclient!lz;I)V")
	void method28864(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10, @OriginalArg(11) float arg11, @OriginalArg(12) float arg12, @OriginalArg(13) float arg13, @OriginalArg(14) float arg14, @OriginalArg(15) float arg15, @OriginalArg(16) Interface38 arg16, @OriginalArg(17) int arg17) {
		if ((arg17 & 0xFF000000) == 0) {
			return;
		}
		this.aClass104_Sub2_40.method20482(this.anIntArray446);
		@Pc(14) int local14 = this.anIntArray446[0];
		@Pc(19) int local19 = this.anIntArray446[1];
		@Pc(24) int local24 = this.anIntArray446[2];
		@Pc(29) int local29 = this.anIntArray446[3];
		@Pc(31) byte local31 = 0;
		@Pc(67) int local67 = (arg0 < (float) local14 ? 1 : 0) + (arg2 < (float) local14 ? 1 : 0) + (arg4 < (float) local14 ? 1 : 0) + (arg6 < (float) local14 ? 1 : 0);
		if (local67 == 4) {
			return;
		}
		@Pc(75) int local75 = local31 | local67;
		local67 = (arg0 > (float) local24 ? 1 : 0) + (arg2 > (float) local24 ? 1 : 0) + (arg4 > (float) local24 ? 1 : 0) + (arg6 > (float) local24 ? 1 : 0);
		if (local67 == 4) {
			return;
		}
		local75 |= local67;
		local67 = (arg1 < (float) local19 ? 1 : 0) + (arg3 < (float) local19 ? 1 : 0) + (arg5 < (float) local19 ? 1 : 0) + (arg7 < (float) local19 ? 1 : 0);
		if (local67 == 4) {
			return;
		}
		local75 |= local67;
		local67 = (arg1 > (float) local29 ? 1 : 0) + (arg3 > (float) local29 ? 1 : 0) + (arg5 > (float) local29 ? 1 : 0) + (arg7 > (float) local29 ? 1 : 0);
		if (local67 == 4) {
			return;
		}
		local75 |= local67;
		if (local75 != 0) {
			this.method28854();
			this.aClass104_Sub2_40.method20481(true);
			this.aClass104_Sub2_40.method20479(local14, local19, local24, local29);
		}
		this.method28856();
		@Pc(228) float local228 = this.method28857(arg0);
		@Pc(232) float local232 = this.method28858(arg1);
		@Pc(236) float local236 = this.method28857(arg2);
		@Pc(240) float local240 = this.method28858(arg3);
		@Pc(244) float local244 = this.method28857(arg4);
		@Pc(248) float local248 = this.method28858(arg5);
		@Pc(252) float local252 = this.method28857(arg6);
		@Pc(256) float local256 = this.method28858(arg7);
		this.aFloatArray106[this.anInt4920 * 16] = local228;
		this.aFloatArray106[this.anInt4920 * 16 + 1] = local232;
		this.aFloatArray106[this.anInt4920 * 16 + 2] = arg8;
		this.aFloatArray106[this.anInt4920 * 16 + 3] = arg9;
		this.aFloatArray106[this.anInt4920 * 16 + 4] = local236;
		this.aFloatArray106[this.anInt4920 * 16 + 5] = local240;
		this.aFloatArray106[this.anInt4920 * 16 + 6] = arg10;
		this.aFloatArray106[this.anInt4920 * 16 + 7] = arg11;
		this.aFloatArray106[this.anInt4920 * 16 + 8] = local244;
		this.aFloatArray106[this.anInt4920 * 16 + 9] = local248;
		this.aFloatArray106[this.anInt4920 * 16 + 10] = arg12;
		this.aFloatArray106[this.anInt4920 * 16 + 11] = arg13;
		this.aFloatArray106[this.anInt4920 * 16 + 12] = local252;
		this.aFloatArray106[this.anInt4920 * 16 + 13] = local256;
		this.aFloatArray106[this.anInt4920 * 16 + 14] = arg14;
		this.aFloatArray106[this.anInt4920 * 16 + 15] = arg15;
		this.anInterface38Array3[this.anInt4920] = arg16;
		if (this.aClass104_Sub2_40.anInt2953 == 1) {
			this.anIntArray445[this.anInt4920] = arg17 & 0xFF00FF00 | (arg17 & 0xFF) << 16 | arg17 >> 16 & 0xFF;
		} else {
			this.anIntArray445[this.anInt4920] = arg17;
		}
		this.anInt4920++;
		if (this.aClass401_5 == Class401.aClass401_1 || local75 > 0) {
			this.method28854();
		}
		if (local75 != 0) {
			this.aClass104_Sub2_40.method20481(false);
			this.aClass104_Sub2_40.method20478();
			this.aClass104_Sub2_40.method20479(local14, local19, local24, local29);
		}
	}

	@OriginalMember(owner = "client!md", name = "r", descriptor = "()V")
	void method28865() {
		this.anInterface37_21.method31065();
		this.anInterface40_9.method31065();
		this.anInterface37_21 = null;
		this.anInterface40_9 = null;
		this.aClass145_25 = null;
		this.anInt4920 = 0;
	}

	@OriginalMember(owner = "client!md", name = "q", descriptor = "(FFFFFFFFFFFFFFFFLclient!lz;I)V")
	void method28866(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10, @OriginalArg(11) float arg11, @OriginalArg(12) float arg12, @OriginalArg(13) float arg13, @OriginalArg(14) float arg14, @OriginalArg(15) float arg15, @OriginalArg(16) Interface38 arg16, @OriginalArg(17) int arg17) {
		if ((arg17 & 0xFF000000) == 0) {
			return;
		}
		this.aClass104_Sub2_40.method20482(this.anIntArray446);
		@Pc(14) int local14 = this.anIntArray446[0];
		@Pc(19) int local19 = this.anIntArray446[1];
		@Pc(24) int local24 = this.anIntArray446[2];
		@Pc(29) int local29 = this.anIntArray446[3];
		@Pc(31) byte local31 = 0;
		@Pc(67) int local67 = (arg0 < (float) local14 ? 1 : 0) + (arg2 < (float) local14 ? 1 : 0) + (arg4 < (float) local14 ? 1 : 0) + (arg6 < (float) local14 ? 1 : 0);
		if (local67 == 4) {
			return;
		}
		@Pc(75) int local75 = local31 | local67;
		local67 = (arg0 > (float) local24 ? 1 : 0) + (arg2 > (float) local24 ? 1 : 0) + (arg4 > (float) local24 ? 1 : 0) + (arg6 > (float) local24 ? 1 : 0);
		if (local67 == 4) {
			return;
		}
		local75 |= local67;
		local67 = (arg1 < (float) local19 ? 1 : 0) + (arg3 < (float) local19 ? 1 : 0) + (arg5 < (float) local19 ? 1 : 0) + (arg7 < (float) local19 ? 1 : 0);
		if (local67 == 4) {
			return;
		}
		local75 |= local67;
		local67 = (arg1 > (float) local29 ? 1 : 0) + (arg3 > (float) local29 ? 1 : 0) + (arg5 > (float) local29 ? 1 : 0) + (arg7 > (float) local29 ? 1 : 0);
		if (local67 == 4) {
			return;
		}
		local75 |= local67;
		if (local75 != 0) {
			this.method28854();
			this.aClass104_Sub2_40.method20481(true);
			this.aClass104_Sub2_40.method20479(local14, local19, local24, local29);
		}
		this.method28856();
		@Pc(228) float local228 = this.method28857(arg0);
		@Pc(232) float local232 = this.method28858(arg1);
		@Pc(236) float local236 = this.method28857(arg2);
		@Pc(240) float local240 = this.method28858(arg3);
		@Pc(244) float local244 = this.method28857(arg4);
		@Pc(248) float local248 = this.method28858(arg5);
		@Pc(252) float local252 = this.method28857(arg6);
		@Pc(256) float local256 = this.method28858(arg7);
		this.aFloatArray106[this.anInt4920 * 16] = local228;
		this.aFloatArray106[this.anInt4920 * 16 + 1] = local232;
		this.aFloatArray106[this.anInt4920 * 16 + 2] = arg8;
		this.aFloatArray106[this.anInt4920 * 16 + 3] = arg9;
		this.aFloatArray106[this.anInt4920 * 16 + 4] = local236;
		this.aFloatArray106[this.anInt4920 * 16 + 5] = local240;
		this.aFloatArray106[this.anInt4920 * 16 + 6] = arg10;
		this.aFloatArray106[this.anInt4920 * 16 + 7] = arg11;
		this.aFloatArray106[this.anInt4920 * 16 + 8] = local244;
		this.aFloatArray106[this.anInt4920 * 16 + 9] = local248;
		this.aFloatArray106[this.anInt4920 * 16 + 10] = arg12;
		this.aFloatArray106[this.anInt4920 * 16 + 11] = arg13;
		this.aFloatArray106[this.anInt4920 * 16 + 12] = local252;
		this.aFloatArray106[this.anInt4920 * 16 + 13] = local256;
		this.aFloatArray106[this.anInt4920 * 16 + 14] = arg14;
		this.aFloatArray106[this.anInt4920 * 16 + 15] = arg15;
		this.anInterface38Array3[this.anInt4920] = arg16;
		if (this.aClass104_Sub2_40.anInt2953 == 1) {
			this.anIntArray445[this.anInt4920] = arg17 & 0xFF00FF00 | (arg17 & 0xFF) << 16 | arg17 >> 16 & 0xFF;
		} else {
			this.anIntArray445[this.anInt4920] = arg17;
		}
		this.anInt4920++;
		if (this.aClass401_5 == Class401.aClass401_1 || local75 > 0) {
			this.method28854();
		}
		if (local75 != 0) {
			this.aClass104_Sub2_40.method20481(false);
			this.aClass104_Sub2_40.method20478();
			this.aClass104_Sub2_40.method20479(local14, local19, local24, local29);
		}
	}

	@OriginalMember(owner = "client!md", name = "s", descriptor = "()V")
	void method28867() {
		if (this.anInt4920 == 0) {
			return;
		}
		this.aClass104_Sub2_40.method21020();
		this.aClass104_Sub2_40.method20994(1);
		this.aClass104_Sub2_40.method21042(this.anInterface40_9);
		this.aClass104_Sub2_40.method21060(0, this.anInterface37_21);
		this.aClass104_Sub2_40.method21118(this.aClass145_25);
		@Pc(30) Class130 local30 = this.aClass104_Sub2_40.aClass130_3;
		@Pc(34) Unsafe local34 = this.aClass104_Sub2_40.anUnsafe4;
		@Pc(38) ByteBuffer local38 = this.aClass104_Sub2_40.aByteBuffer7;
		local38.clear();
		this.aClass104_Sub2_40.method20986().method30018(Class489.aClass489_99);
		this.aClass104_Sub2_40.method21115(Class425.aClass425_1);
		@Pc(61) int local61 = (this.anInt4920 + this.anInt4919 - 1) / this.anInt4919;
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		for (@Pc(67) int local67 = 0; local67 < local61; local67++) {
			@Pc(78) int local78 = Math.min(this.anInt4919, this.anInt4920 - local63);
			@Pc(86) long local86 = this.anInterface37_21.method29513(0, local78 * 96);
			@Pc(93) int local93 = local67 * this.anInt4919 + local78;
			@Pc(100) int local100;
			for (@Pc(95) int local95 = local63; local95 < local93; local95++) {
				for (local100 = 0; local100 < 4; local100++) {
					local34.putFloat(local86, this.aFloatArray106[local65++]);
					local86 += 4L;
					local34.putFloat(local86, this.aFloatArray106[local65++]);
					local86 += 4L;
					local34.putFloat(local86, 0.0F);
					local86 += 4L;
					local34.putFloat(local86, this.aFloatArray106[local65++]);
					local86 += 4L;
					local34.putFloat(local86, this.aFloatArray106[local65++]);
					local86 += 4L;
					local34.putInt(local86, this.anIntArray445[local95]);
					local86 += 4L;
				}
			}
			this.anInterface37_21.method29525();
			@Pc(182) Interface38 local182 = this.anInterface38Array3[local63];
			local100 = 1;
			@Pc(186) int local186 = 0;
			for (@Pc(190) int local190 = local63 + 1; local190 < local93; local190++) {
				if (local182 == this.anInterface38Array3[local190]) {
					local100++;
				} else {
					local30.anInterface38_12 = local182;
					local30.method10025();
					this.aClass104_Sub2_40.method21018(this.anInterface40_9, Class424.aClass424_3, local186 * 4, local100 * 4, local186 * 6, local100 * 2);
					local182 = this.anInterface38Array3[local190];
					local100 = 1;
					local186 = local190 - local63;
				}
			}
			local30.anInterface38_12 = local182;
			local30.method10025();
			this.aClass104_Sub2_40.method21018(this.anInterface40_9, Class424.aClass424_3, local186 * 4, local100 * 4, local186 * 6, local100 * 2);
			local63 += this.anInt4919;
		}
		this.anInt4920 = 0;
	}

	@OriginalMember(owner = "client!md", name = "y", descriptor = "(FFFFFFFFLclient!lz;I)V")
	void method28868(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) Interface38 arg8, @OriginalArg(9) int arg9) {
		if ((arg9 & 0xFF000000) == 0) {
			return;
		}
		this.aClass104_Sub2_40.method20482(this.anIntArray446);
		@Pc(14) int local14 = this.anIntArray446[0];
		@Pc(19) int local19 = this.anIntArray446[1];
		@Pc(24) int local24 = this.anIntArray446[2];
		@Pc(29) int local29 = this.anIntArray446[3];
		if (arg0 > (float) local24 || (arg1 > (float) local29 || (arg2 < (float) local14 || arg3 < (float) local19))) {
			return;
		}
		@Pc(57) float local57 = arg2 - arg0;
		@Pc(61) float local61 = arg3 - arg1;
		@Pc(65) float local65 = arg6 - arg4;
		@Pc(69) float local69 = arg7 - arg5;
		if (arg0 < (float) local14) {
			arg4 += ((float) local14 - arg0) / local57 * local65;
			arg0 = local14;
		}
		if (arg1 < (float) local19) {
			arg5 += ((float) local19 - arg1) / local61 * local69;
			arg1 = local19;
		}
		if (arg2 > (float) local24) {
			arg6 -= (arg2 - (float) local24) / local57 * local65;
			arg2 = local24;
		}
		if (arg3 > (float) local29) {
			arg7 -= (arg3 - (float) local29) / local61 * local69;
			arg3 = local29;
		}
		this.method28856();
		arg0 = this.method28857(arg0);
		arg1 = this.method28858(arg1);
		arg2 = this.method28857(arg2);
		arg3 = this.method28858(arg3);
		this.aFloatArray106[this.anInt4920 * 16] = arg0;
		this.aFloatArray106[this.anInt4920 * 16 + 1] = arg1;
		this.aFloatArray106[this.anInt4920 * 16 + 2] = arg4;
		this.aFloatArray106[this.anInt4920 * 16 + 3] = arg5;
		this.aFloatArray106[this.anInt4920 * 16 + 4] = arg2;
		this.aFloatArray106[this.anInt4920 * 16 + 5] = arg1;
		this.aFloatArray106[this.anInt4920 * 16 + 6] = arg6;
		this.aFloatArray106[this.anInt4920 * 16 + 7] = arg5;
		this.aFloatArray106[this.anInt4920 * 16 + 8] = arg0;
		this.aFloatArray106[this.anInt4920 * 16 + 9] = arg3;
		this.aFloatArray106[this.anInt4920 * 16 + 10] = arg4;
		this.aFloatArray106[this.anInt4920 * 16 + 11] = arg7;
		this.aFloatArray106[this.anInt4920 * 16 + 12] = arg2;
		this.aFloatArray106[this.anInt4920 * 16 + 13] = arg3;
		this.aFloatArray106[this.anInt4920 * 16 + 14] = arg6;
		this.aFloatArray106[this.anInt4920 * 16 + 15] = arg7;
		this.anInterface38Array3[this.anInt4920] = arg8;
		if (this.aClass104_Sub2_40.anInt2953 == 1) {
			this.anIntArray445[this.anInt4920] = arg9 & 0xFF00FF00 | (arg9 & 0xFF) << 16 | arg9 >> 16 & 0xFF;
		} else {
			this.anIntArray445[this.anInt4920] = arg9;
		}
		this.anInt4920++;
		if (this.aClass401_5 == Class401.aClass401_1) {
			this.method28854();
		}
	}

	@OriginalMember(owner = "client!md", name = "g", descriptor = "(F)F")
	float method28869(@OriginalArg(0) float arg0) {
		@Pc(5) int local5 = this.aClass104_Sub2_40.method20446((byte) 0).method23749();
		return (1.0F - (arg0 + this.aClass104_Sub2_40.method20894()) / (float) local5) * 2.0F - 1.0F;
	}

	@OriginalMember(owner = "client!md", name = "c", descriptor = "()V")
	void method28870() {
		this.anInterface37_21.method31065();
		this.anInterface40_9.method31065();
		this.anInterface37_21 = null;
		this.anInterface40_9 = null;
		this.aClass145_25 = null;
		this.anInt4920 = 0;
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(F)F")
	float method28871(@OriginalArg(0) float arg0) {
		@Pc(5) int local5 = this.aClass104_Sub2_40.method20446((byte) -47).method23748();
		return (arg0 + this.aClass104_Sub2_40.method20894()) / (float) local5 * 2.0F - 1.0F;
	}

	@OriginalMember(owner = "client!md", name = "h", descriptor = "(F)F")
	float method28872(@OriginalArg(0) float arg0) {
		@Pc(5) int local5 = this.aClass104_Sub2_40.method20446((byte) -53).method23748();
		return (arg0 + this.aClass104_Sub2_40.method20894()) / (float) local5 * 2.0F - 1.0F;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(F)F")
	float method28873(@OriginalArg(0) float arg0) {
		@Pc(5) int local5 = this.aClass104_Sub2_40.method20446((byte) -17).method23749();
		return (1.0F - (arg0 + this.aClass104_Sub2_40.method20894()) / (float) local5) * 2.0F - 1.0F;
	}

	@OriginalMember(owner = "client!md", name = "v", descriptor = "()V")
	void method28874() {
		if (this.anInt4920 == 0) {
			return;
		}
		this.aClass104_Sub2_40.method21020();
		this.aClass104_Sub2_40.method20994(1);
		this.aClass104_Sub2_40.method21042(this.anInterface40_9);
		this.aClass104_Sub2_40.method21060(0, this.anInterface37_21);
		this.aClass104_Sub2_40.method21118(this.aClass145_25);
		@Pc(30) Class130 local30 = this.aClass104_Sub2_40.aClass130_3;
		@Pc(34) Unsafe local34 = this.aClass104_Sub2_40.anUnsafe4;
		@Pc(38) ByteBuffer local38 = this.aClass104_Sub2_40.aByteBuffer7;
		local38.clear();
		this.aClass104_Sub2_40.method20986().method30018(Class489.aClass489_99);
		this.aClass104_Sub2_40.method21115(Class425.aClass425_1);
		@Pc(61) int local61 = (this.anInt4920 + this.anInt4919 - 1) / this.anInt4919;
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		for (@Pc(67) int local67 = 0; local67 < local61; local67++) {
			@Pc(78) int local78 = Math.min(this.anInt4919, this.anInt4920 - local63);
			@Pc(86) long local86 = this.anInterface37_21.method29513(0, local78 * 96);
			@Pc(93) int local93 = local67 * this.anInt4919 + local78;
			@Pc(100) int local100;
			for (@Pc(95) int local95 = local63; local95 < local93; local95++) {
				for (local100 = 0; local100 < 4; local100++) {
					local34.putFloat(local86, this.aFloatArray106[local65++]);
					local86 += 4L;
					local34.putFloat(local86, this.aFloatArray106[local65++]);
					local86 += 4L;
					local34.putFloat(local86, 0.0F);
					local86 += 4L;
					local34.putFloat(local86, this.aFloatArray106[local65++]);
					local86 += 4L;
					local34.putFloat(local86, this.aFloatArray106[local65++]);
					local86 += 4L;
					local34.putInt(local86, this.anIntArray445[local95]);
					local86 += 4L;
				}
			}
			this.anInterface37_21.method29525();
			@Pc(182) Interface38 local182 = this.anInterface38Array3[local63];
			local100 = 1;
			@Pc(186) int local186 = 0;
			for (@Pc(190) int local190 = local63 + 1; local190 < local93; local190++) {
				if (local182 == this.anInterface38Array3[local190]) {
					local100++;
				} else {
					local30.anInterface38_12 = local182;
					local30.method10025();
					this.aClass104_Sub2_40.method21018(this.anInterface40_9, Class424.aClass424_3, local186 * 4, local100 * 4, local186 * 6, local100 * 2);
					local182 = this.anInterface38Array3[local190];
					local100 = 1;
					local186 = local190 - local63;
				}
			}
			local30.anInterface38_12 = local182;
			local30.method10025();
			this.aClass104_Sub2_40.method21018(this.anInterface40_9, Class424.aClass424_3, local186 * 4, local100 * 4, local186 * 6, local100 * 2);
			local63 += this.anInt4919;
		}
		this.anInt4920 = 0;
	}

	@OriginalMember(owner = "client!md", name = "i", descriptor = "()V")
	void method28875() {
		if (this.aClass401_4 != null) {
			this.aClass401_5 = this.aClass401_4;
			this.aClass401_4 = null;
		}
	}

	@OriginalMember(owner = "client!md", name = "j", descriptor = "()V")
	void method28876() {
		if (this.aClass401_4 != null) {
			this.aClass401_5 = this.aClass401_4;
			this.aClass401_4 = null;
		}
	}

	@OriginalMember(owner = "client!md", name = "t", descriptor = "()Lclient!lm;")
	Class401 method28877() {
		return this.aClass401_5;
	}

	@OriginalMember(owner = "client!md", name = "ae", descriptor = "()Lclient!lm;")
	Class401 method28878() {
		return this.aClass401_5;
	}

	@OriginalMember(owner = "client!md", name = "ag", descriptor = "()Lclient!lm;")
	Class401 method28879() {
		return this.aClass401_5;
	}
}
