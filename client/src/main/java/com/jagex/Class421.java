package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sun.misc.Unsafe;

import java.nio.ByteBuffer;

@OriginalClass("client!mn")
public final class Class421 {

	@OriginalMember(owner = "client!mn", name = "e", descriptor = "Lclient!ls;")
	Class404 aClass404_4;

	@OriginalMember(owner = "client!mn", name = "f", descriptor = "Lclient!ls;")
	Class404 aClass404_5 = Class404.aClass404_1;

	@OriginalMember(owner = "client!mn", name = "u", descriptor = "I")
	int anInt4628 = 128;

	@OriginalMember(owner = "client!mn", name = "l", descriptor = "I")
	int anInt4626 = 0;

	@OriginalMember(owner = "client!mn", name = "g", descriptor = "[F")
	float[] aFloatArray106 = new float[this.anInt4628 * 16];

	@OriginalMember(owner = "client!mn", name = "i", descriptor = "[Lclient!lb;")
	Interface34[] anInterface34Array3 = new Interface34[this.anInt4628];

	@OriginalMember(owner = "client!mn", name = "m", descriptor = "[I")
	int[] anIntArray445 = new int[this.anInt4628];

	@OriginalMember(owner = "client!mn", name = "k", descriptor = "[I")
	int[] anIntArray446 = new int[4];

	@OriginalMember(owner = "client!mn", name = "t", descriptor = "Lclient!afa;")
	final Class102_Sub1 aClass102_Sub1_40;

	@OriginalMember(owner = "client!mn", name = "j", descriptor = "Lclient!lx;")
	Interface38 anInterface38_23;

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "Lclient!ld;")
	Class135 aClass135_25;

	@OriginalMember(owner = "client!mn", name = "s", descriptor = "Lclient!mv;")
	Interface44 anInterface44_9;

	@OriginalMember(owner = "client!mn", name = "o", descriptor = "I")
	int anInt4627;

	@OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(Lclient!afa;I)V")
	Class421(@OriginalArg(0) Class102_Sub1 arg0, @OriginalArg(1) int arg1) {
		this.aClass102_Sub1_40 = arg0;
		this.anInterface38_23 = this.aClass102_Sub1_40.method21239(true);
		this.anInterface38_23.method29327(arg1 * 96, 24);
		this.aClass135_25 = this.aClass102_Sub1_40.method21248(new Class397[] { new Class397(new Class400[] { Class400.aClass400_11, Class400.aClass400_1, Class400.aClass400_3 }) });
		this.anInterface44_9 = this.aClass102_Sub1_40.method21246(false);
		@Pc(85) int local85 = arg1 * 6;
		this.anInterface44_9.method29401(local85);
		@Pc(98) int local98 = local85 * this.anInterface44_9.method29400().anInt3804 * -369125885;
		@Pc(102) ByteBuffer local102 = this.aClass102_Sub1_40.aByteBuffer7;
		this.aClass102_Sub1_40.method21292(local98);
		local102.clear();
		for (@Pc(111) int local111 = 0; local111 < arg1; local111++) {
			local102.putShort((short) (local111 * 4));
			local102.putShort((short) (local111 * 4 + 2));
			local102.putShort((short) (local111 * 4 + 1));
			local102.putShort((short) (local111 * 4 + 2));
			local102.putShort((short) (local111 * 4 + 3));
			local102.putShort((short) (local111 * 4 + 1));
		}
		this.anInterface44_9.method29383(0, local85 * this.anInterface44_9.method29400().anInt3804 * -369125885, this.aClass102_Sub1_40.aLong168);
		this.anInt4627 = arg1;
		this.anInt4626 = 0;
	}

	@OriginalMember(owner = "client!mn", name = "k", descriptor = "()V")
	void method29014() {
		this.anInterface38_23.method30837();
		this.anInterface44_9.method30837();
		this.anInterface38_23 = null;
		this.anInterface44_9 = null;
		this.aClass135_25 = null;
		this.anInt4626 = 0;
	}

	@OriginalMember(owner = "client!mn", name = "ay", descriptor = "()V")
	void method29015() {
		this.aClass404_4 = this.aClass404_5;
		this.aClass404_5 = Class404.aClass404_3;
	}

	@OriginalMember(owner = "client!mn", name = "f", descriptor = "()V")
	void method29016() {
		if (this.anInt4626 == 0) {
			return;
		}
		this.aClass102_Sub1_40.method21259();
		this.aClass102_Sub1_40.method21235(1);
		this.aClass102_Sub1_40.method21251(this.anInterface44_9);
		this.aClass102_Sub1_40.method21250(0, this.anInterface38_23);
		this.aClass102_Sub1_40.method21158(this.aClass135_25);
		@Pc(30) Class124 local30 = this.aClass102_Sub1_40.aClass124_3;
		@Pc(34) Unsafe local34 = this.aClass102_Sub1_40.anUnsafe4;
		@Pc(38) ByteBuffer local38 = this.aClass102_Sub1_40.aByteBuffer7;
		local38.clear();
		this.aClass102_Sub1_40.method21226().method30075(Class487.aClass487_97);
		this.aClass102_Sub1_40.method21296(Class422.aClass422_4);
		@Pc(61) int local61 = (this.anInt4626 + this.anInt4627 - 1) / this.anInt4627;
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		for (@Pc(67) int local67 = 0; local67 < local61; local67++) {
			@Pc(78) int local78 = Math.min(this.anInt4627, this.anInt4626 - local63);
			@Pc(86) long local86 = this.anInterface38_23.method29384(0, local78 * 96);
			@Pc(93) int local93 = local67 * this.anInt4627 + local78;
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
			this.anInterface38_23.method29385();
			@Pc(182) Interface34 local182 = this.anInterface34Array3[local63];
			local100 = 1;
			@Pc(186) int local186 = 0;
			for (@Pc(190) int local190 = local63 + 1; local190 < local93; local190++) {
				if (local182 == this.anInterface34Array3[local190]) {
					local100++;
				} else {
					local30.anInterface34_20 = local182;
					local30.method10376();
					this.aClass102_Sub1_40.method21258(this.anInterface44_9, Class415.aClass415_6, local186 * 4, local100 * 4, local186 * 6, local100 * 2);
					local182 = this.anInterface34Array3[local190];
					local100 = 1;
					local186 = local190 - local63;
				}
			}
			local30.anInterface34_20 = local182;
			local30.method10376();
			this.aClass102_Sub1_40.method21258(this.anInterface44_9, Class415.aClass415_6, local186 * 4, local100 * 4, local186 * 6, local100 * 2);
			local63 += this.anInt4627;
		}
		this.anInt4626 = 0;
	}

	@OriginalMember(owner = "client!mn", name = "e", descriptor = "(FFFFFFFFLclient!lb;I)V")
	void method29017(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) Interface34 arg8, @OriginalArg(9) int arg9) {
		if ((arg9 & 0xFF000000) == 0) {
			return;
		}
		this.aClass102_Sub1_40.method20713(this.anIntArray446);
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
		this.method29023();
		arg0 = this.method29027(arg0);
		arg1 = this.method29021(arg1);
		arg2 = this.method29027(arg2);
		arg3 = this.method29021(arg3);
		this.aFloatArray106[this.anInt4626 * 16] = arg0;
		this.aFloatArray106[this.anInt4626 * 16 + 1] = arg1;
		this.aFloatArray106[this.anInt4626 * 16 + 2] = arg4;
		this.aFloatArray106[this.anInt4626 * 16 + 3] = arg5;
		this.aFloatArray106[this.anInt4626 * 16 + 4] = arg2;
		this.aFloatArray106[this.anInt4626 * 16 + 5] = arg1;
		this.aFloatArray106[this.anInt4626 * 16 + 6] = arg6;
		this.aFloatArray106[this.anInt4626 * 16 + 7] = arg5;
		this.aFloatArray106[this.anInt4626 * 16 + 8] = arg0;
		this.aFloatArray106[this.anInt4626 * 16 + 9] = arg3;
		this.aFloatArray106[this.anInt4626 * 16 + 10] = arg4;
		this.aFloatArray106[this.anInt4626 * 16 + 11] = arg7;
		this.aFloatArray106[this.anInt4626 * 16 + 12] = arg2;
		this.aFloatArray106[this.anInt4626 * 16 + 13] = arg3;
		this.aFloatArray106[this.anInt4626 * 16 + 14] = arg6;
		this.aFloatArray106[this.anInt4626 * 16 + 15] = arg7;
		this.anInterface34Array3[this.anInt4626] = arg8;
		if (this.aClass102_Sub1_40.anInt2973 == 1) {
			this.anIntArray445[this.anInt4626] = arg9 & 0xFF00FF00 | (arg9 & 0xFF) << 16 | arg9 >> 16 & 0xFF;
		} else {
			this.anIntArray445[this.anInt4626] = arg9;
		}
		this.anInt4626++;
		if (this.aClass404_5 == Class404.aClass404_2) {
			this.method29016();
		}
	}

	@OriginalMember(owner = "client!mn", name = "y", descriptor = "(F)F")
	float method29018(@OriginalArg(0) float arg0) {
		@Pc(5) int local5 = this.aClass102_Sub1_40.method20677(1578893882).method24036();
		return (arg0 + this.aClass102_Sub1_40.method21132()) / (float) local5 * 2.0F - 1.0F;
	}

	@OriginalMember(owner = "client!mn", name = "o", descriptor = "()V")
	void method29019() {
		if (this.aClass404_4 != null) {
			this.aClass404_5 = this.aClass404_4;
			this.aClass404_4 = null;
		}
	}

	@OriginalMember(owner = "client!mn", name = "p", descriptor = "()V")
	void method29020() {
		if (this.anInt4626 != this.anInt4628) {
			return;
		}
		this.anInt4628 *= 2;
		@Pc(16) float[] local16 = new float[this.anInt4628 * 16];
		for (@Pc(18) int local18 = 0; local18 < this.anInt4626 * 16; local18++) {
			local16[local18] = this.aFloatArray106[local18];
		}
		this.aFloatArray106 = local16;
		@Pc(40) Interface34[] local40 = new Interface34[this.anInt4628];
		@Pc(44) int[] local44 = new int[this.anInt4628];
		for (@Pc(46) int local46 = 0; local46 < this.anInt4626; local46++) {
			local40[local46] = this.anInterface34Array3[local46];
			local44[local46] = this.anIntArray445[local46];
		}
		this.anInterface34Array3 = local40;
		this.anIntArray445 = local44;
	}

	@OriginalMember(owner = "client!mn", name = "i", descriptor = "(F)F")
	float method29021(@OriginalArg(0) float arg0) {
		@Pc(5) int local5 = this.aClass102_Sub1_40.method20677(1105940940).method24037();
		return (1.0F - (arg0 + this.aClass102_Sub1_40.method21132()) / (float) local5) * 2.0F - 1.0F;
	}

	@OriginalMember(owner = "client!mn", name = "m", descriptor = "()V")
	void method29022() {
		this.aClass404_4 = this.aClass404_5;
		this.aClass404_5 = Class404.aClass404_3;
	}

	@OriginalMember(owner = "client!mn", name = "l", descriptor = "()V")
	void method29023() {
		if (this.anInt4626 != this.anInt4628) {
			return;
		}
		this.anInt4628 *= 2;
		@Pc(16) float[] local16 = new float[this.anInt4628 * 16];
		for (@Pc(18) int local18 = 0; local18 < this.anInt4626 * 16; local18++) {
			local16[local18] = this.aFloatArray106[local18];
		}
		this.aFloatArray106 = local16;
		@Pc(40) Interface34[] local40 = new Interface34[this.anInt4628];
		@Pc(44) int[] local44 = new int[this.anInt4628];
		for (@Pc(46) int local46 = 0; local46 < this.anInt4626; local46++) {
			local40[local46] = this.anInterface34Array3[local46];
			local44[local46] = this.anIntArray445[local46];
		}
		this.anInterface34Array3 = local40;
		this.anIntArray445 = local44;
	}

	@OriginalMember(owner = "client!mn", name = "j", descriptor = "()Lclient!ls;")
	Class404 method29024() {
		return this.aClass404_5;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "()V")
	void method29025() {
		this.anInterface38_23.method30837();
		this.anInterface44_9.method30837();
		this.anInterface38_23 = null;
		this.anInterface44_9 = null;
		this.aClass135_25 = null;
		this.anInt4626 = 0;
	}

	@OriginalMember(owner = "client!mn", name = "s", descriptor = "()V")
	void method29026() {
		this.anInterface38_23.method30837();
		this.anInterface44_9.method30837();
		this.anInterface38_23 = null;
		this.anInterface44_9 = null;
		this.aClass135_25 = null;
		this.anInt4626 = 0;
	}

	@OriginalMember(owner = "client!mn", name = "g", descriptor = "(F)F")
	float method29027(@OriginalArg(0) float arg0) {
		@Pc(5) int local5 = this.aClass102_Sub1_40.method20677(963924896).method24036();
		return (arg0 + this.aClass102_Sub1_40.method21132()) / (float) local5 * 2.0F - 1.0F;
	}

	@OriginalMember(owner = "client!mn", name = "x", descriptor = "()V")
	void method29028() {
		if (this.anInt4626 == 0) {
			return;
		}
		this.aClass102_Sub1_40.method21259();
		this.aClass102_Sub1_40.method21235(1);
		this.aClass102_Sub1_40.method21251(this.anInterface44_9);
		this.aClass102_Sub1_40.method21250(0, this.anInterface38_23);
		this.aClass102_Sub1_40.method21158(this.aClass135_25);
		@Pc(30) Class124 local30 = this.aClass102_Sub1_40.aClass124_3;
		@Pc(34) Unsafe local34 = this.aClass102_Sub1_40.anUnsafe4;
		@Pc(38) ByteBuffer local38 = this.aClass102_Sub1_40.aByteBuffer7;
		local38.clear();
		this.aClass102_Sub1_40.method21226().method30075(Class487.aClass487_97);
		this.aClass102_Sub1_40.method21296(Class422.aClass422_4);
		@Pc(61) int local61 = (this.anInt4626 + this.anInt4627 - 1) / this.anInt4627;
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		for (@Pc(67) int local67 = 0; local67 < local61; local67++) {
			@Pc(78) int local78 = Math.min(this.anInt4627, this.anInt4626 - local63);
			@Pc(86) long local86 = this.anInterface38_23.method29384(0, local78 * 96);
			@Pc(93) int local93 = local67 * this.anInt4627 + local78;
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
			this.anInterface38_23.method29385();
			@Pc(182) Interface34 local182 = this.anInterface34Array3[local63];
			local100 = 1;
			@Pc(186) int local186 = 0;
			for (@Pc(190) int local190 = local63 + 1; local190 < local93; local190++) {
				if (local182 == this.anInterface34Array3[local190]) {
					local100++;
				} else {
					local30.anInterface34_20 = local182;
					local30.method10376();
					this.aClass102_Sub1_40.method21258(this.anInterface44_9, Class415.aClass415_6, local186 * 4, local100 * 4, local186 * 6, local100 * 2);
					local182 = this.anInterface34Array3[local190];
					local100 = 1;
					local186 = local190 - local63;
				}
			}
			local30.anInterface34_20 = local182;
			local30.method10376();
			this.aClass102_Sub1_40.method21258(this.anInterface44_9, Class415.aClass415_6, local186 * 4, local100 * 4, local186 * 6, local100 * 2);
			local63 += this.anInt4627;
		}
		this.anInt4626 = 0;
	}

	@OriginalMember(owner = "client!mn", name = "w", descriptor = "()V")
	void method29029() {
		if (this.anInt4626 == 0) {
			return;
		}
		this.aClass102_Sub1_40.method21259();
		this.aClass102_Sub1_40.method21235(1);
		this.aClass102_Sub1_40.method21251(this.anInterface44_9);
		this.aClass102_Sub1_40.method21250(0, this.anInterface38_23);
		this.aClass102_Sub1_40.method21158(this.aClass135_25);
		@Pc(30) Class124 local30 = this.aClass102_Sub1_40.aClass124_3;
		@Pc(34) Unsafe local34 = this.aClass102_Sub1_40.anUnsafe4;
		@Pc(38) ByteBuffer local38 = this.aClass102_Sub1_40.aByteBuffer7;
		local38.clear();
		this.aClass102_Sub1_40.method21226().method30075(Class487.aClass487_97);
		this.aClass102_Sub1_40.method21296(Class422.aClass422_4);
		@Pc(61) int local61 = (this.anInt4626 + this.anInt4627 - 1) / this.anInt4627;
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		for (@Pc(67) int local67 = 0; local67 < local61; local67++) {
			@Pc(78) int local78 = Math.min(this.anInt4627, this.anInt4626 - local63);
			@Pc(86) long local86 = this.anInterface38_23.method29384(0, local78 * 96);
			@Pc(93) int local93 = local67 * this.anInt4627 + local78;
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
			this.anInterface38_23.method29385();
			@Pc(182) Interface34 local182 = this.anInterface34Array3[local63];
			local100 = 1;
			@Pc(186) int local186 = 0;
			for (@Pc(190) int local190 = local63 + 1; local190 < local93; local190++) {
				if (local182 == this.anInterface34Array3[local190]) {
					local100++;
				} else {
					local30.anInterface34_20 = local182;
					local30.method10376();
					this.aClass102_Sub1_40.method21258(this.anInterface44_9, Class415.aClass415_6, local186 * 4, local100 * 4, local186 * 6, local100 * 2);
					local182 = this.anInterface34Array3[local190];
					local100 = 1;
					local186 = local190 - local63;
				}
			}
			local30.anInterface34_20 = local182;
			local30.method10376();
			this.aClass102_Sub1_40.method21258(this.anInterface44_9, Class415.aClass415_6, local186 * 4, local100 * 4, local186 * 6, local100 * 2);
			local63 += this.anInt4627;
		}
		this.anInt4626 = 0;
	}

	@OriginalMember(owner = "client!mn", name = "r", descriptor = "()V")
	void method29030() {
		if (this.anInt4626 == 0) {
			return;
		}
		this.aClass102_Sub1_40.method21259();
		this.aClass102_Sub1_40.method21235(1);
		this.aClass102_Sub1_40.method21251(this.anInterface44_9);
		this.aClass102_Sub1_40.method21250(0, this.anInterface38_23);
		this.aClass102_Sub1_40.method21158(this.aClass135_25);
		@Pc(30) Class124 local30 = this.aClass102_Sub1_40.aClass124_3;
		@Pc(34) Unsafe local34 = this.aClass102_Sub1_40.anUnsafe4;
		@Pc(38) ByteBuffer local38 = this.aClass102_Sub1_40.aByteBuffer7;
		local38.clear();
		this.aClass102_Sub1_40.method21226().method30075(Class487.aClass487_97);
		this.aClass102_Sub1_40.method21296(Class422.aClass422_4);
		@Pc(61) int local61 = (this.anInt4626 + this.anInt4627 - 1) / this.anInt4627;
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		for (@Pc(67) int local67 = 0; local67 < local61; local67++) {
			@Pc(78) int local78 = Math.min(this.anInt4627, this.anInt4626 - local63);
			@Pc(86) long local86 = this.anInterface38_23.method29384(0, local78 * 96);
			@Pc(93) int local93 = local67 * this.anInt4627 + local78;
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
			this.anInterface38_23.method29385();
			@Pc(182) Interface34 local182 = this.anInterface34Array3[local63];
			local100 = 1;
			@Pc(186) int local186 = 0;
			for (@Pc(190) int local190 = local63 + 1; local190 < local93; local190++) {
				if (local182 == this.anInterface34Array3[local190]) {
					local100++;
				} else {
					local30.anInterface34_20 = local182;
					local30.method10376();
					this.aClass102_Sub1_40.method21258(this.anInterface44_9, Class415.aClass415_6, local186 * 4, local100 * 4, local186 * 6, local100 * 2);
					local182 = this.anInterface34Array3[local190];
					local100 = 1;
					local186 = local190 - local63;
				}
			}
			local30.anInterface34_20 = local182;
			local30.method10376();
			this.aClass102_Sub1_40.method21258(this.anInterface44_9, Class415.aClass415_6, local186 * 4, local100 * 4, local186 * 6, local100 * 2);
			local63 += this.anInt4627;
		}
		this.anInt4626 = 0;
	}

	@OriginalMember(owner = "client!mn", name = "q", descriptor = "(FFFFFFFFLclient!lb;I)V")
	void method29031(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) Interface34 arg8, @OriginalArg(9) int arg9) {
		if ((arg9 & 0xFF000000) == 0) {
			return;
		}
		this.aClass102_Sub1_40.method20713(this.anIntArray446);
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
		this.method29023();
		arg0 = this.method29027(arg0);
		arg1 = this.method29021(arg1);
		arg2 = this.method29027(arg2);
		arg3 = this.method29021(arg3);
		this.aFloatArray106[this.anInt4626 * 16] = arg0;
		this.aFloatArray106[this.anInt4626 * 16 + 1] = arg1;
		this.aFloatArray106[this.anInt4626 * 16 + 2] = arg4;
		this.aFloatArray106[this.anInt4626 * 16 + 3] = arg5;
		this.aFloatArray106[this.anInt4626 * 16 + 4] = arg2;
		this.aFloatArray106[this.anInt4626 * 16 + 5] = arg1;
		this.aFloatArray106[this.anInt4626 * 16 + 6] = arg6;
		this.aFloatArray106[this.anInt4626 * 16 + 7] = arg5;
		this.aFloatArray106[this.anInt4626 * 16 + 8] = arg0;
		this.aFloatArray106[this.anInt4626 * 16 + 9] = arg3;
		this.aFloatArray106[this.anInt4626 * 16 + 10] = arg4;
		this.aFloatArray106[this.anInt4626 * 16 + 11] = arg7;
		this.aFloatArray106[this.anInt4626 * 16 + 12] = arg2;
		this.aFloatArray106[this.anInt4626 * 16 + 13] = arg3;
		this.aFloatArray106[this.anInt4626 * 16 + 14] = arg6;
		this.aFloatArray106[this.anInt4626 * 16 + 15] = arg7;
		this.anInterface34Array3[this.anInt4626] = arg8;
		if (this.aClass102_Sub1_40.anInt2973 == 1) {
			this.anIntArray445[this.anInt4626] = arg9 & 0xFF00FF00 | (arg9 & 0xFF) << 16 | arg9 >> 16 & 0xFF;
		} else {
			this.anIntArray445[this.anInt4626] = arg9;
		}
		this.anInt4626++;
		if (this.aClass404_5 == Class404.aClass404_2) {
			this.method29016();
		}
	}

	@OriginalMember(owner = "client!mn", name = "h", descriptor = "(FFFFFFFFFFFFFFFFLclient!lb;I)V")
	void method29032(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10, @OriginalArg(11) float arg11, @OriginalArg(12) float arg12, @OriginalArg(13) float arg13, @OriginalArg(14) float arg14, @OriginalArg(15) float arg15, @OriginalArg(16) Interface34 arg16, @OriginalArg(17) int arg17) {
		if ((arg17 & 0xFF000000) == 0) {
			return;
		}
		this.aClass102_Sub1_40.method20713(this.anIntArray446);
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
			this.method29016();
			this.aClass102_Sub1_40.method20712(true);
			this.aClass102_Sub1_40.method20986(local14, local19, local24, local29);
		}
		this.method29023();
		@Pc(228) float local228 = this.method29027(arg0);
		@Pc(232) float local232 = this.method29021(arg1);
		@Pc(236) float local236 = this.method29027(arg2);
		@Pc(240) float local240 = this.method29021(arg3);
		@Pc(244) float local244 = this.method29027(arg4);
		@Pc(248) float local248 = this.method29021(arg5);
		@Pc(252) float local252 = this.method29027(arg6);
		@Pc(256) float local256 = this.method29021(arg7);
		this.aFloatArray106[this.anInt4626 * 16] = local228;
		this.aFloatArray106[this.anInt4626 * 16 + 1] = local232;
		this.aFloatArray106[this.anInt4626 * 16 + 2] = arg8;
		this.aFloatArray106[this.anInt4626 * 16 + 3] = arg9;
		this.aFloatArray106[this.anInt4626 * 16 + 4] = local236;
		this.aFloatArray106[this.anInt4626 * 16 + 5] = local240;
		this.aFloatArray106[this.anInt4626 * 16 + 6] = arg10;
		this.aFloatArray106[this.anInt4626 * 16 + 7] = arg11;
		this.aFloatArray106[this.anInt4626 * 16 + 8] = local244;
		this.aFloatArray106[this.anInt4626 * 16 + 9] = local248;
		this.aFloatArray106[this.anInt4626 * 16 + 10] = arg12;
		this.aFloatArray106[this.anInt4626 * 16 + 11] = arg13;
		this.aFloatArray106[this.anInt4626 * 16 + 12] = local252;
		this.aFloatArray106[this.anInt4626 * 16 + 13] = local256;
		this.aFloatArray106[this.anInt4626 * 16 + 14] = arg14;
		this.aFloatArray106[this.anInt4626 * 16 + 15] = arg15;
		this.anInterface34Array3[this.anInt4626] = arg16;
		if (this.aClass102_Sub1_40.anInt2973 == 1) {
			this.anIntArray445[this.anInt4626] = arg17 & 0xFF00FF00 | (arg17 & 0xFF) << 16 | arg17 >> 16 & 0xFF;
		} else {
			this.anIntArray445[this.anInt4626] = arg17;
		}
		this.anInt4626++;
		if (this.aClass404_5 == Class404.aClass404_2 || local75 > 0) {
			this.method29016();
		}
		if (local75 != 0) {
			this.aClass102_Sub1_40.method20712(false);
			this.aClass102_Sub1_40.method20877();
			this.aClass102_Sub1_40.method20986(local14, local19, local24, local29);
		}
	}

	@OriginalMember(owner = "client!mn", name = "z", descriptor = "()V")
	void method29033() {
		if (this.anInt4626 != this.anInt4628) {
			return;
		}
		this.anInt4628 *= 2;
		@Pc(16) float[] local16 = new float[this.anInt4628 * 16];
		for (@Pc(18) int local18 = 0; local18 < this.anInt4626 * 16; local18++) {
			local16[local18] = this.aFloatArray106[local18];
		}
		this.aFloatArray106 = local16;
		@Pc(40) Interface34[] local40 = new Interface34[this.anInt4628];
		@Pc(44) int[] local44 = new int[this.anInt4628];
		for (@Pc(46) int local46 = 0; local46 < this.anInt4626; local46++) {
			local40[local46] = this.anInterface34Array3[local46];
			local44[local46] = this.anIntArray445[local46];
		}
		this.anInterface34Array3 = local40;
		this.anIntArray445 = local44;
	}

	@OriginalMember(owner = "client!mn", name = "u", descriptor = "(FFFFFFFFFFFFFFFFLclient!lb;I)V")
	void method29034(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10, @OriginalArg(11) float arg11, @OriginalArg(12) float arg12, @OriginalArg(13) float arg13, @OriginalArg(14) float arg14, @OriginalArg(15) float arg15, @OriginalArg(16) Interface34 arg16, @OriginalArg(17) int arg17) {
		if ((arg17 & 0xFF000000) == 0) {
			return;
		}
		this.aClass102_Sub1_40.method20713(this.anIntArray446);
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
			this.method29016();
			this.aClass102_Sub1_40.method20712(true);
			this.aClass102_Sub1_40.method20986(local14, local19, local24, local29);
		}
		this.method29023();
		@Pc(228) float local228 = this.method29027(arg0);
		@Pc(232) float local232 = this.method29021(arg1);
		@Pc(236) float local236 = this.method29027(arg2);
		@Pc(240) float local240 = this.method29021(arg3);
		@Pc(244) float local244 = this.method29027(arg4);
		@Pc(248) float local248 = this.method29021(arg5);
		@Pc(252) float local252 = this.method29027(arg6);
		@Pc(256) float local256 = this.method29021(arg7);
		this.aFloatArray106[this.anInt4626 * 16] = local228;
		this.aFloatArray106[this.anInt4626 * 16 + 1] = local232;
		this.aFloatArray106[this.anInt4626 * 16 + 2] = arg8;
		this.aFloatArray106[this.anInt4626 * 16 + 3] = arg9;
		this.aFloatArray106[this.anInt4626 * 16 + 4] = local236;
		this.aFloatArray106[this.anInt4626 * 16 + 5] = local240;
		this.aFloatArray106[this.anInt4626 * 16 + 6] = arg10;
		this.aFloatArray106[this.anInt4626 * 16 + 7] = arg11;
		this.aFloatArray106[this.anInt4626 * 16 + 8] = local244;
		this.aFloatArray106[this.anInt4626 * 16 + 9] = local248;
		this.aFloatArray106[this.anInt4626 * 16 + 10] = arg12;
		this.aFloatArray106[this.anInt4626 * 16 + 11] = arg13;
		this.aFloatArray106[this.anInt4626 * 16 + 12] = local252;
		this.aFloatArray106[this.anInt4626 * 16 + 13] = local256;
		this.aFloatArray106[this.anInt4626 * 16 + 14] = arg14;
		this.aFloatArray106[this.anInt4626 * 16 + 15] = arg15;
		this.anInterface34Array3[this.anInt4626] = arg16;
		if (this.aClass102_Sub1_40.anInt2973 == 1) {
			this.anIntArray445[this.anInt4626] = arg17 & 0xFF00FF00 | (arg17 & 0xFF) << 16 | arg17 >> 16 & 0xFF;
		} else {
			this.anIntArray445[this.anInt4626] = arg17;
		}
		this.anInt4626++;
		if (this.aClass404_5 == Class404.aClass404_2 || local75 > 0) {
			this.method29016();
		}
		if (local75 != 0) {
			this.aClass102_Sub1_40.method20712(false);
			this.aClass102_Sub1_40.method20877();
			this.aClass102_Sub1_40.method20986(local14, local19, local24, local29);
		}
	}

	@OriginalMember(owner = "client!mn", name = "v", descriptor = "(F)F")
	float method29035(@OriginalArg(0) float arg0) {
		@Pc(5) int local5 = this.aClass102_Sub1_40.method20677(2014725475).method24036();
		return (arg0 + this.aClass102_Sub1_40.method21132()) / (float) local5 * 2.0F - 1.0F;
	}

	@OriginalMember(owner = "client!mn", name = "d", descriptor = "()V")
	void method29036() {
		if (this.anInt4626 != this.anInt4628) {
			return;
		}
		this.anInt4628 *= 2;
		@Pc(16) float[] local16 = new float[this.anInt4628 * 16];
		for (@Pc(18) int local18 = 0; local18 < this.anInt4626 * 16; local18++) {
			local16[local18] = this.aFloatArray106[local18];
		}
		this.aFloatArray106 = local16;
		@Pc(40) Interface34[] local40 = new Interface34[this.anInt4628];
		@Pc(44) int[] local44 = new int[this.anInt4628];
		for (@Pc(46) int local46 = 0; local46 < this.anInt4626; local46++) {
			local40[local46] = this.anInterface34Array3[local46];
			local44[local46] = this.anIntArray445[local46];
		}
		this.anInterface34Array3 = local40;
		this.anIntArray445 = local44;
	}

	@OriginalMember(owner = "client!mn", name = "n", descriptor = "(F)F")
	float method29037(@OriginalArg(0) float arg0) {
		@Pc(5) int local5 = this.aClass102_Sub1_40.method20677(1189562601).method24037();
		return (1.0F - (arg0 + this.aClass102_Sub1_40.method21132()) / (float) local5) * 2.0F - 1.0F;
	}

	@OriginalMember(owner = "client!mn", name = "t", descriptor = "()V")
	void method29038() {
		this.anInterface38_23.method30837();
		this.anInterface44_9.method30837();
		this.anInterface38_23 = null;
		this.anInterface44_9 = null;
		this.aClass135_25 = null;
		this.anInt4626 = 0;
	}

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "(F)F")
	float method29039(@OriginalArg(0) float arg0) {
		@Pc(5) int local5 = this.aClass102_Sub1_40.method20677(1788477566).method24037();
		return (1.0F - (arg0 + this.aClass102_Sub1_40.method21132()) / (float) local5) * 2.0F - 1.0F;
	}

	@OriginalMember(owner = "client!mn", name = "ax", descriptor = "(F)F")
	float method29040(@OriginalArg(0) float arg0) {
		@Pc(5) int local5 = this.aClass102_Sub1_40.method20677(1826029419).method24037();
		return (1.0F - (arg0 + this.aClass102_Sub1_40.method21132()) / (float) local5) * 2.0F - 1.0F;
	}

	@OriginalMember(owner = "client!mn", name = "aq", descriptor = "()Lclient!ls;")
	Class404 method29041() {
		return this.aClass404_5;
	}

	@OriginalMember(owner = "client!mn", name = "ai", descriptor = "()V")
	void method29042() {
		if (this.aClass404_4 != null) {
			this.aClass404_5 = this.aClass404_4;
			this.aClass404_4 = null;
		}
	}

	@OriginalMember(owner = "client!mn", name = "c", descriptor = "(F)F")
	float method29043(@OriginalArg(0) float arg0) {
		@Pc(5) int local5 = this.aClass102_Sub1_40.method20677(1016316582).method24037();
		return (1.0F - (arg0 + this.aClass102_Sub1_40.method21132()) / (float) local5) * 2.0F - 1.0F;
	}
}
