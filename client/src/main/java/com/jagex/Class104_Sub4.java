package com.jagex;

import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!afk")
public final class Class104_Sub4 extends Class104 {

	@OriginalMember(owner = "client!afk", name = "w", descriptor = "Lclient!afa;")
	final Class102_Sub1 aClass102_Sub1_4;

	@OriginalMember(owner = "client!afk", name = "r", descriptor = "Lclient!lb;")
	final Interface34 anInterface34_5;

	@OriginalMember(owner = "client!afk", name = "q", descriptor = "Lclient!lx;")
	final Interface38 anInterface38_6;

	@OriginalMember(owner = "client!afk", name = "h", descriptor = "[[F")
	float[][] aFloatArrayArray11;

	@OriginalMember(owner = "client!afk", name = "<init>", descriptor = "(Lclient!afa;Lclient!aan;Lclient!da;Z)V")
	Class104_Sub4(@OriginalArg(0) Class102_Sub1 arg0, @OriginalArg(1) Class15 arg1, @OriginalArg(2) Class109 arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass102_Sub1_4 = arg0;
		@Pc(19) int[] local19 = new int[this.aClass15_8.anInt49 * 592072939 * this.aClass15_8.anInt43 * 963433333];
		@Pc(23) Class109_Sub2 local23;
		@Pc(77) int local77;
		@Pc(85) int local85;
		@Pc(43) int local43;
		if (arg3) {
			local23 = null;
			@Pc(38) byte[] local38;
			if (arg2.method7116()) {
				@Pc(29) Class109_Sub2 local29 = (Class109_Sub2) arg2;
				local38 = local29.method7118() ? local29.aByteArray26 : local29.aByteArray25;
				if (!local29.method7118()) {
					for (local43 = 0; local43 < local38.length; local43++) {
						local38[local43] = (byte) (local38[local43] == 0 ? 0 : -1);
					}
				}
			} else {
				@Pc(64) Class109_Sub1 local64 = (Class109_Sub1) arg2;
				@Pc(68) int[] local68 = local64.method7117(false);
				local38 = new byte[local68.length];
				if (local64.method7118()) {
					for (local77 = 0; local77 < local38.length; local77++) {
						local38[local77] = (byte) (local19[local77] >> 24 & 0xFF);
					}
				} else {
					for (local77 = 0; local77 < local38.length; local77++) {
						local85 = local68[local77];
						@Pc(108) byte local108 = (byte) ((local85 >> 16 & 0xFF) * 3 + (local85 >> 8 & 0xFF) * 4 + (local85 & 0xFF) >> 3);
						local38[local77] = local108;
					}
				}
			}
			for (@Pc(136) int local136 = 0; local136 < local38.length; local136++) {
				local19[local136] = local38[local136] << 24 | 0xFFFFFF;
			}
		} else {
			@Pc(162) int[] local162;
			if (arg2.method7116()) {
				local23 = (Class109_Sub2) arg2;
				local162 = local23.anIntArray79;
				@Pc(165) byte[] local165 = local23.aByteArray26;
				@Pc(168) byte[] local168 = local23.aByteArray25;
				if (local165 == null) {
					for (local85 = 0; local85 < local168.length; local85++) {
						@Pc(206) byte local206;
						if ((local206 = local168[local85]) != 0) {
							local19[local85] = local162[local206 & 0xFF] | 0xFF000000;
						}
					}
				} else {
					for (local85 = 0; local85 < local165.length; local85++) {
						local19[local85] = local165[local85] << 24 | local162[local168[local85] & 0xFF];
					}
				}
			} else {
				@Pc(223) Class109_Sub1 local223 = (Class109_Sub1) arg2;
				local162 = local223.method7117(false);
				if (local223.method7118()) {
					for (local43 = 0; local43 < local19.length; local43++) {
						local19[local43] = local162[local43];
					}
				} else {
					for (local43 = 0; local43 < local19.length; local43++) {
						local77 = local162[local43] & 0xFFFFFF;
						local19[local43] = (local77 == 0 ? 0 : 255) << 24 | local77;
					}
				}
			}
		}
		this.anInterface34_5 = arg0.method21206(this.aClass15_8.anInt49 * 592072939, this.aClass15_8.anInt43 * 963433333, false, local19);
		this.anInterface34_5.method11807(this.aClass15_8.anInt50 * -2031443477 == 1 ? Class396.aClass396_6 : Class396.aClass396_5);
		this.anInterface38_6 = arg0.method21239(false);
		this.anInterface38_6.method29327(20480, 20);
		@Pc(315) ByteBuffer local315 = this.aClass102_Sub1_4.aByteBuffer7;
		local315.clear();
		this.aFloatArrayArray11 = new float[256][4];
		@Pc(332) float local332 = 1.0F / (float) (this.aClass15_8.anInt49 * 592072939);
		@Pc(341) float local341 = 1.0F / (float) (this.aClass15_8.anInt43 * 963433333);
		for (local77 = 0; local77 < 256; local77++) {
			@Pc(352) short[] local352 = this.aClass15_8.method384(local77, -1203506940);
			this.aFloatArrayArray11[local77][0] = (float) local352[0] * local332;
			this.aFloatArrayArray11[local77][1] = (float) local352[1] * local341;
			this.aFloatArrayArray11[local77][2] = (float) (local352[0] + local352[2]) * local332;
			this.aFloatArrayArray11[local77][3] = (float) (local352[1] + local352[3]) * local341;
			@Pc(414) int local414 = this.aClass15_8.method369(local77, (short) -17533);
			@Pc(420) int local420 = this.aClass15_8.method371(local77, 1207905864);
			local315.putFloat(0.0F);
			local315.putFloat(0.0F);
			local315.putFloat(0.0F);
			local315.putFloat(this.aFloatArrayArray11[local77][0]);
			local315.putFloat(this.aFloatArrayArray11[local77][1]);
			local315.putFloat(0.0F);
			local315.putFloat((float) local420);
			local315.putFloat(0.0F);
			local315.putFloat(this.aFloatArrayArray11[local77][0]);
			local315.putFloat(this.aFloatArrayArray11[local77][3]);
			local315.putFloat((float) local414);
			local315.putFloat((float) local420);
			local315.putFloat(0.0F);
			local315.putFloat(this.aFloatArrayArray11[local77][2]);
			local315.putFloat(this.aFloatArrayArray11[local77][3]);
			local315.putFloat((float) local414);
			local315.putFloat(0.0F);
			local315.putFloat(0.0F);
			local315.putFloat(this.aFloatArrayArray11[local77][2]);
			local315.putFloat(this.aFloatArrayArray11[local77][1]);
		}
		this.anInterface38_6.method29383(0, local315.position(), this.aClass102_Sub1_4.aLong168);
	}

	@OriginalMember(owner = "client!afk", name = "p", descriptor = "(CIIIZ)V")
	@Override
	void method7648(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(26) float local26;
		if (this.aClass102_Sub1_4.method21173() != Class404.aClass404_3) {
			@Pc(12) int local12 = arg2 + this.aClass15_8.method401(arg0, -950409227);
			@Pc(19) float local19 = (float) this.aClass15_8.method369(arg0, (short) 810);
			local26 = this.aClass15_8.method371(arg0, 314376772);
			this.aClass102_Sub1_4.aClass421_3.method29017((float) arg1, (float) local12, (float) arg1 + local19, (float) local12 + local26, this.aFloatArrayArray11[arg0][0], this.aFloatArrayArray11[arg0][1], this.aFloatArrayArray11[arg0][2], this.aFloatArrayArray11[arg0][3], this.anInterface34_5, arg3);
			return;
		}
		this.aClass102_Sub1_4.method21195();
		this.aClass102_Sub1_4.method21235(1);
		@Pc(81) Class122 local81 = this.aClass102_Sub1_4.aClass122_3;
		local81.anInterface34_18 = this.anInterface34_5;
		local81.method10308(0, arg3);
		local26 = this.aClass102_Sub1_4.method20677(1564640553).method24036();
		@Pc(103) float local103 = (float) this.aClass102_Sub1_4.method20677(1996783266).method24037();
		local81.aClass487_50.method30070(2.0F / local26, 2.0F / local103, 1.0F, 1.0F);
		local81.aClass487_50.aFloatArray114[12] = ((float) arg1 + this.aClass102_Sub1_4.method21132()) * 2.0F / local26 - 1.0F;
		local81.aClass487_50.aFloatArray114[13] = ((float) arg2 + this.aClass102_Sub1_4.method21132()) * 2.0F / local103 - 1.0F;
		local81.aClass487_50.aFloatArray114[14] = -1.0F;
		local81.aClass487_48.method30139();
		local81.anInterface38_9 = this.anInterface38_6;
		local81.anInt1197 = arg0 * 4;
		local81.aClass135_10 = this.aClass102_Sub1_4.aClass135_18;
		local81.method10309();
	}

	@OriginalMember(owner = "client!afk", name = "r", descriptor = "(CIIIZ)V")
	@Override
	void method7643(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(26) float local26;
		if (this.aClass102_Sub1_4.method21173() != Class404.aClass404_3) {
			@Pc(12) int local12 = arg2 + this.aClass15_8.method401(arg0, -102698998);
			@Pc(19) float local19 = (float) this.aClass15_8.method369(arg0, (short) -1362);
			local26 = this.aClass15_8.method371(arg0, 1708519726);
			this.aClass102_Sub1_4.aClass421_3.method29017((float) arg1, (float) local12, (float) arg1 + local19, (float) local12 + local26, this.aFloatArrayArray11[arg0][0], this.aFloatArrayArray11[arg0][1], this.aFloatArrayArray11[arg0][2], this.aFloatArrayArray11[arg0][3], this.anInterface34_5, arg3);
			return;
		}
		this.aClass102_Sub1_4.method21195();
		this.aClass102_Sub1_4.method21235(1);
		@Pc(81) Class122 local81 = this.aClass102_Sub1_4.aClass122_3;
		local81.anInterface34_18 = this.anInterface34_5;
		local81.method10308(0, arg3);
		local26 = this.aClass102_Sub1_4.method20677(1630086112).method24036();
		@Pc(103) float local103 = (float) this.aClass102_Sub1_4.method20677(1166324660).method24037();
		local81.aClass487_50.method30070(2.0F / local26, 2.0F / local103, 1.0F, 1.0F);
		local81.aClass487_50.aFloatArray114[12] = ((float) arg1 + this.aClass102_Sub1_4.method21132()) * 2.0F / local26 - 1.0F;
		local81.aClass487_50.aFloatArray114[13] = ((float) arg2 + this.aClass102_Sub1_4.method21132()) * 2.0F / local103 - 1.0F;
		local81.aClass487_50.aFloatArray114[14] = -1.0F;
		local81.aClass487_48.method30139();
		local81.anInterface38_9 = this.anInterface38_6;
		local81.anInt1197 = arg0 * 4;
		local81.aClass135_10 = this.aClass102_Sub1_4.aClass135_18;
		local81.method10309();
	}

	@OriginalMember(owner = "client!afk", name = "h", descriptor = "(CIIIZ)V")
	@Override
	void method7645(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(26) float local26;
		if (this.aClass102_Sub1_4.method21173() != Class404.aClass404_3) {
			@Pc(12) int local12 = arg2 + this.aClass15_8.method401(arg0, -1585093137);
			@Pc(19) float local19 = (float) this.aClass15_8.method369(arg0, (short) -26135);
			local26 = this.aClass15_8.method371(arg0, -267622201);
			this.aClass102_Sub1_4.aClass421_3.method29017((float) arg1, (float) local12, (float) arg1 + local19, (float) local12 + local26, this.aFloatArrayArray11[arg0][0], this.aFloatArrayArray11[arg0][1], this.aFloatArrayArray11[arg0][2], this.aFloatArrayArray11[arg0][3], this.anInterface34_5, arg3);
			return;
		}
		this.aClass102_Sub1_4.method21195();
		this.aClass102_Sub1_4.method21235(1);
		@Pc(81) Class122 local81 = this.aClass102_Sub1_4.aClass122_3;
		local81.anInterface34_18 = this.anInterface34_5;
		local81.method10308(0, arg3);
		local26 = this.aClass102_Sub1_4.method20677(1359602842).method24036();
		@Pc(103) float local103 = (float) this.aClass102_Sub1_4.method20677(987982951).method24037();
		local81.aClass487_50.method30070(2.0F / local26, 2.0F / local103, 1.0F, 1.0F);
		local81.aClass487_50.aFloatArray114[12] = ((float) arg1 + this.aClass102_Sub1_4.method21132()) * 2.0F / local26 - 1.0F;
		local81.aClass487_50.aFloatArray114[13] = ((float) arg2 + this.aClass102_Sub1_4.method21132()) * 2.0F / local103 - 1.0F;
		local81.aClass487_50.aFloatArray114[14] = -1.0F;
		local81.aClass487_48.method30139();
		local81.anInterface38_9 = this.anInterface38_6;
		local81.anInt1197 = arg0 * 4;
		local81.aClass135_10 = this.aClass102_Sub1_4.aClass135_18;
		local81.method10309();
	}

	@OriginalMember(owner = "client!afk", name = "d", descriptor = "(CIIIZ)V")
	@Override
	void method7646(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(26) float local26;
		if (this.aClass102_Sub1_4.method21173() != Class404.aClass404_3) {
			@Pc(12) int local12 = arg2 + this.aClass15_8.method401(arg0, -1101271985);
			@Pc(19) float local19 = (float) this.aClass15_8.method369(arg0, (short) -2230);
			local26 = this.aClass15_8.method371(arg0, -308853144);
			this.aClass102_Sub1_4.aClass421_3.method29017((float) arg1, (float) local12, (float) arg1 + local19, (float) local12 + local26, this.aFloatArrayArray11[arg0][0], this.aFloatArrayArray11[arg0][1], this.aFloatArrayArray11[arg0][2], this.aFloatArrayArray11[arg0][3], this.anInterface34_5, arg3);
			return;
		}
		this.aClass102_Sub1_4.method21195();
		this.aClass102_Sub1_4.method21235(1);
		@Pc(81) Class122 local81 = this.aClass102_Sub1_4.aClass122_3;
		local81.anInterface34_18 = this.anInterface34_5;
		local81.method10308(0, arg3);
		local26 = this.aClass102_Sub1_4.method20677(1326492794).method24036();
		@Pc(103) float local103 = (float) this.aClass102_Sub1_4.method20677(983896412).method24037();
		local81.aClass487_50.method30070(2.0F / local26, 2.0F / local103, 1.0F, 1.0F);
		local81.aClass487_50.aFloatArray114[12] = ((float) arg1 + this.aClass102_Sub1_4.method21132()) * 2.0F / local26 - 1.0F;
		local81.aClass487_50.aFloatArray114[13] = ((float) arg2 + this.aClass102_Sub1_4.method21132()) * 2.0F / local103 - 1.0F;
		local81.aClass487_50.aFloatArray114[14] = -1.0F;
		local81.aClass487_48.method30139();
		local81.anInterface38_9 = this.anInterface38_6;
		local81.anInt1197 = arg0 * 4;
		local81.aClass135_10 = this.aClass102_Sub1_4.aClass135_18;
		local81.method10309();
	}

	@OriginalMember(owner = "client!afk", name = "n", descriptor = "(CIIIZLclient!cg;II)V")
	@Override
	void method7651(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class98 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
	}

	@OriginalMember(owner = "client!afk", name = "q", descriptor = "(CIIIZLclient!cg;II)V")
	@Override
	void method7644(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class98 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
	}

	@OriginalMember(owner = "client!afk", name = "v", descriptor = "(CIIIZLclient!cg;II)V")
	@Override
	void method7649(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class98 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
	}

	@OriginalMember(owner = "client!afk", name = "y", descriptor = "(CIIIZLclient!cg;II)V")
	@Override
	void method7650(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class98 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
	}

	@OriginalMember(owner = "client!afk", name = "z", descriptor = "(CIIIZ)V")
	@Override
	void method7647(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(26) float local26;
		if (this.aClass102_Sub1_4.method21173() != Class404.aClass404_3) {
			@Pc(12) int local12 = arg2 + this.aClass15_8.method401(arg0, -2065415649);
			@Pc(19) float local19 = (float) this.aClass15_8.method369(arg0, (short) -24076);
			local26 = this.aClass15_8.method371(arg0, 1875652971);
			this.aClass102_Sub1_4.aClass421_3.method29017((float) arg1, (float) local12, (float) arg1 + local19, (float) local12 + local26, this.aFloatArrayArray11[arg0][0], this.aFloatArrayArray11[arg0][1], this.aFloatArrayArray11[arg0][2], this.aFloatArrayArray11[arg0][3], this.anInterface34_5, arg3);
			return;
		}
		this.aClass102_Sub1_4.method21195();
		this.aClass102_Sub1_4.method21235(1);
		@Pc(81) Class122 local81 = this.aClass102_Sub1_4.aClass122_3;
		local81.anInterface34_18 = this.anInterface34_5;
		local81.method10308(0, arg3);
		local26 = this.aClass102_Sub1_4.method20677(1391526455).method24036();
		@Pc(103) float local103 = (float) this.aClass102_Sub1_4.method20677(1696520700).method24037();
		local81.aClass487_50.method30070(2.0F / local26, 2.0F / local103, 1.0F, 1.0F);
		local81.aClass487_50.aFloatArray114[12] = ((float) arg1 + this.aClass102_Sub1_4.method21132()) * 2.0F / local26 - 1.0F;
		local81.aClass487_50.aFloatArray114[13] = ((float) arg2 + this.aClass102_Sub1_4.method21132()) * 2.0F / local103 - 1.0F;
		local81.aClass487_50.aFloatArray114[14] = -1.0F;
		local81.aClass487_48.method30139();
		local81.anInterface38_9 = this.anInterface38_6;
		local81.anInt1197 = arg0 * 4;
		local81.aClass135_10 = this.aClass102_Sub1_4.aClass135_18;
		local81.method10309();
	}
}
