package com.jagex;

import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!afx")
public class Class106_Sub6 extends Class106 {

	@OriginalMember(owner = "client!afx", name = "o", descriptor = "Lclient!afc;")
	final Class104_Sub2 aClass104_Sub2_5;

	@OriginalMember(owner = "client!afx", name = "s", descriptor = "Lclient!lz;")
	final Interface38 anInterface38_5;

	@OriginalMember(owner = "client!afx", name = "y", descriptor = "Lclient!lr;")
	final Interface37 anInterface37_6;

	@OriginalMember(owner = "client!afx", name = "q", descriptor = "[[F")
	float[][] aFloatArrayArray12;

	@OriginalMember(owner = "client!afx", name = "<init>", descriptor = "(Lclient!afc;Lclient!aac;Lclient!de;Z)V", line = 19)
	Class106_Sub6(@OriginalArg(0) Class104_Sub2 arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(2) Class105 arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass104_Sub2_5 = arg0;
		@Pc(19) int[] local19 = new int[this.aClass5_10.anInt12 * -2141347013 * this.aClass5_10.anInt13 * -345881099];
		@Pc(23) Class105_Sub2 local23;
		@Pc(77) int local77;
		@Pc(85) int local85;
		@Pc(43) int local43;
		if (arg3) {
			local23 = null;
			@Pc(38) byte[] local38;
			if (arg2.method7154()) {
				@Pc(29) Class105_Sub2 local29 = (Class105_Sub2) arg2;
				local38 = local29.method7211() ? local29.aByteArray26 : local29.aByteArray25;
				if (!local29.method7211()) {
					for (local43 = 0; local43 < local38.length; local43++) {
						local38[local43] = (byte) (local38[local43] == 0 ? 0 : -1);
					}
				}
			} else {
				@Pc(64) Class105_Sub1 local64 = (Class105_Sub1) arg2;
				@Pc(68) int[] local68 = local64.method7171(false);
				local38 = new byte[local68.length];
				if (local64.method7211()) {
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
			if (arg2.method7154()) {
				local23 = (Class105_Sub2) arg2;
				local162 = local23.anIntArray82;
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
				@Pc(223) Class105_Sub1 local223 = (Class105_Sub1) arg2;
				local162 = local223.method7171(false);
				if (local223.method7211()) {
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
		this.anInterface38_5 = arg0.method21038(this.aClass5_10.anInt12 * -2141347013, this.aClass5_10.anInt13 * -345881099, false, local19);
		this.anInterface38_5.method11414(this.aClass5_10.anInt11 * 286794121 == 1 ? Class405.aClass405_5 : Class405.aClass405_6);
		this.anInterface37_6 = arg0.method21174(false);
		this.anInterface37_6.method29315(20480, 20);
		@Pc(315) ByteBuffer local315 = this.aClass104_Sub2_5.aByteBuffer7;
		local315.clear();
		this.aFloatArrayArray12 = new float[256][4];
		@Pc(332) float local332 = 1.0F / (float) (this.aClass5_10.anInt12 * -2141347013);
		@Pc(341) float local341 = 1.0F / (float) (this.aClass5_10.anInt13 * -345881099);
		for (local77 = 0; local77 < 256; local77++) {
			@Pc(352) short[] local352 = this.aClass5_10.method52(local77, 1153081770);
			this.aFloatArrayArray12[local77][0] = (float) local352[0] * local332;
			this.aFloatArrayArray12[local77][1] = (float) local352[1] * local341;
			this.aFloatArrayArray12[local77][2] = (float) (local352[0] + local352[2]) * local332;
			this.aFloatArrayArray12[local77][3] = (float) (local352[1] + local352[3]) * local341;
			@Pc(414) int local414 = this.aClass5_10.method45(local77, (byte) 78);
			@Pc(420) int local420 = this.aClass5_10.method46(local77, 1415476369);
			local315.putFloat(0.0F);
			local315.putFloat(0.0F);
			local315.putFloat(0.0F);
			local315.putFloat(this.aFloatArrayArray12[local77][0]);
			local315.putFloat(this.aFloatArrayArray12[local77][1]);
			local315.putFloat(0.0F);
			local315.putFloat((float) local420);
			local315.putFloat(0.0F);
			local315.putFloat(this.aFloatArrayArray12[local77][0]);
			local315.putFloat(this.aFloatArrayArray12[local77][3]);
			local315.putFloat((float) local414);
			local315.putFloat((float) local420);
			local315.putFloat(0.0F);
			local315.putFloat(this.aFloatArrayArray12[local77][2]);
			local315.putFloat(this.aFloatArrayArray12[local77][3]);
			local315.putFloat((float) local414);
			local315.putFloat(0.0F);
			local315.putFloat(0.0F);
			local315.putFloat(this.aFloatArrayArray12[local77][2]);
			local315.putFloat(this.aFloatArrayArray12[local77][1]);
		}
		this.anInterface37_6.method29333(0, local315.position(), this.aClass104_Sub2_5.aLong132);
	}

	@OriginalMember(owner = "client!afx", name = "h", descriptor = "(CIIIZ)V", line = 128)
	@Override
	void method7579(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(26) float local26;
		if (this.aClass104_Sub2_5.method20942() != Class401.aClass401_3) {
			@Pc(12) int local12 = arg2 + this.aClass5_10.method49(arg0, (byte) -10);
			@Pc(19) float local19 = (float) this.aClass5_10.method45(arg0, (byte) -7);
			local26 = this.aClass5_10.method46(arg0, 1415476369);
			this.aClass104_Sub2_5.aClass414_3.method28679((float) arg1, (float) local12, (float) arg1 + local19, (float) local12 + local26, this.aFloatArrayArray12[arg0][0], this.aFloatArrayArray12[arg0][1], this.aFloatArrayArray12[arg0][2], this.aFloatArrayArray12[arg0][3], this.anInterface38_5, arg3);
			return;
		}
		this.aClass104_Sub2_5.method21000();
		this.aClass104_Sub2_5.method21087(1);
		@Pc(81) Class134 local81 = this.aClass104_Sub2_5.aClass134_3;
		local81.anInterface38_20 = this.anInterface38_5;
		local81.method10197(0, arg3);
		local26 = this.aClass104_Sub2_5.method20435((byte) -87).method23737();
		@Pc(103) float local103 = (float) this.aClass104_Sub2_5.method20435((byte) -2).method23738();
		local81.aClass489_48.method29875(2.0F / local26, 2.0F / local103, 1.0F, 1.0F);
		local81.aClass489_48.aFloatArray116[12] = ((float) arg1 + this.aClass104_Sub2_5.method21118()) * 2.0F / local26 - 1.0F;
		local81.aClass489_48.aFloatArray116[13] = ((float) arg2 + this.aClass104_Sub2_5.method21118()) * 2.0F / local103 - 1.0F;
		local81.aClass489_48.aFloatArray116[14] = -1.0F;
		local81.aClass489_49.method29850();
		local81.anInterface37_9 = this.anInterface37_6;
		local81.anInt1174 = arg0 * 4;
		local81.aClass145_10 = this.aClass104_Sub2_5.aClass145_21;
		local81.method10198();
	}

	@OriginalMember(owner = "client!afx", name = "s", descriptor = "(CIIIZ)V", line = 128)
	@Override
	void method7576(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(26) float local26;
		if (this.aClass104_Sub2_5.method20942() != Class401.aClass401_3) {
			@Pc(12) int local12 = arg2 + this.aClass5_10.method49(arg0, (byte) -40);
			@Pc(19) float local19 = (float) this.aClass5_10.method45(arg0, (byte) 25);
			local26 = this.aClass5_10.method46(arg0, 1415476369);
			this.aClass104_Sub2_5.aClass414_3.method28679((float) arg1, (float) local12, (float) arg1 + local19, (float) local12 + local26, this.aFloatArrayArray12[arg0][0], this.aFloatArrayArray12[arg0][1], this.aFloatArrayArray12[arg0][2], this.aFloatArrayArray12[arg0][3], this.anInterface38_5, arg3);
			return;
		}
		this.aClass104_Sub2_5.method21000();
		this.aClass104_Sub2_5.method21087(1);
		@Pc(81) Class134 local81 = this.aClass104_Sub2_5.aClass134_3;
		local81.anInterface38_20 = this.anInterface38_5;
		local81.method10197(0, arg3);
		local26 = this.aClass104_Sub2_5.method20435((byte) -126).method23737();
		@Pc(103) float local103 = (float) this.aClass104_Sub2_5.method20435((byte) -43).method23738();
		local81.aClass489_48.method29875(2.0F / local26, 2.0F / local103, 1.0F, 1.0F);
		local81.aClass489_48.aFloatArray116[12] = ((float) arg1 + this.aClass104_Sub2_5.method21118()) * 2.0F / local26 - 1.0F;
		local81.aClass489_48.aFloatArray116[13] = ((float) arg2 + this.aClass104_Sub2_5.method21118()) * 2.0F / local103 - 1.0F;
		local81.aClass489_48.aFloatArray116[14] = -1.0F;
		local81.aClass489_49.method29850();
		local81.anInterface37_9 = this.anInterface37_6;
		local81.anInt1174 = arg0 * 4;
		local81.aClass145_10 = this.aClass104_Sub2_5.aClass145_21;
		local81.method10198();
	}

	@OriginalMember(owner = "client!afx", name = "q", descriptor = "(CIIIZ)V", line = 128)
	@Override
	void method7578(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(26) float local26;
		if (this.aClass104_Sub2_5.method20942() != Class401.aClass401_3) {
			@Pc(12) int local12 = arg2 + this.aClass5_10.method49(arg0, (byte) -14);
			@Pc(19) float local19 = (float) this.aClass5_10.method45(arg0, (byte) -123);
			local26 = this.aClass5_10.method46(arg0, 1415476369);
			this.aClass104_Sub2_5.aClass414_3.method28679((float) arg1, (float) local12, (float) arg1 + local19, (float) local12 + local26, this.aFloatArrayArray12[arg0][0], this.aFloatArrayArray12[arg0][1], this.aFloatArrayArray12[arg0][2], this.aFloatArrayArray12[arg0][3], this.anInterface38_5, arg3);
			return;
		}
		this.aClass104_Sub2_5.method21000();
		this.aClass104_Sub2_5.method21087(1);
		@Pc(81) Class134 local81 = this.aClass104_Sub2_5.aClass134_3;
		local81.anInterface38_20 = this.anInterface38_5;
		local81.method10197(0, arg3);
		local26 = this.aClass104_Sub2_5.method20435((byte) -112).method23737();
		@Pc(103) float local103 = (float) this.aClass104_Sub2_5.method20435((byte) -22).method23738();
		local81.aClass489_48.method29875(2.0F / local26, 2.0F / local103, 1.0F, 1.0F);
		local81.aClass489_48.aFloatArray116[12] = ((float) arg1 + this.aClass104_Sub2_5.method21118()) * 2.0F / local26 - 1.0F;
		local81.aClass489_48.aFloatArray116[13] = ((float) arg2 + this.aClass104_Sub2_5.method21118()) * 2.0F / local103 - 1.0F;
		local81.aClass489_48.aFloatArray116[14] = -1.0F;
		local81.aClass489_49.method29850();
		local81.anInterface37_9 = this.anInterface37_6;
		local81.anInt1174 = arg0 * 4;
		local81.aClass145_10 = this.aClass104_Sub2_5.aClass145_21;
		local81.method10198();
	}

	@OriginalMember(owner = "client!afx", name = "b", descriptor = "(CIIIZ)V", line = 128)
	@Override
	void method7582(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(26) float local26;
		if (this.aClass104_Sub2_5.method20942() != Class401.aClass401_3) {
			@Pc(12) int local12 = arg2 + this.aClass5_10.method49(arg0, (byte) -18);
			@Pc(19) float local19 = (float) this.aClass5_10.method45(arg0, (byte) 34);
			local26 = this.aClass5_10.method46(arg0, 1415476369);
			this.aClass104_Sub2_5.aClass414_3.method28679((float) arg1, (float) local12, (float) arg1 + local19, (float) local12 + local26, this.aFloatArrayArray12[arg0][0], this.aFloatArrayArray12[arg0][1], this.aFloatArrayArray12[arg0][2], this.aFloatArrayArray12[arg0][3], this.anInterface38_5, arg3);
			return;
		}
		this.aClass104_Sub2_5.method21000();
		this.aClass104_Sub2_5.method21087(1);
		@Pc(81) Class134 local81 = this.aClass104_Sub2_5.aClass134_3;
		local81.anInterface38_20 = this.anInterface38_5;
		local81.method10197(0, arg3);
		local26 = this.aClass104_Sub2_5.method20435((byte) -11).method23737();
		@Pc(103) float local103 = (float) this.aClass104_Sub2_5.method20435((byte) -79).method23738();
		local81.aClass489_48.method29875(2.0F / local26, 2.0F / local103, 1.0F, 1.0F);
		local81.aClass489_48.aFloatArray116[12] = ((float) arg1 + this.aClass104_Sub2_5.method21118()) * 2.0F / local26 - 1.0F;
		local81.aClass489_48.aFloatArray116[13] = ((float) arg2 + this.aClass104_Sub2_5.method21118()) * 2.0F / local103 - 1.0F;
		local81.aClass489_48.aFloatArray116[14] = -1.0F;
		local81.aClass489_49.method29850();
		local81.anInterface37_9 = this.anInterface37_6;
		local81.anInt1174 = arg0 * 4;
		local81.aClass145_10 = this.aClass104_Sub2_5.aClass145_21;
		local81.method10198();
	}

	@OriginalMember(owner = "client!afx", name = "x", descriptor = "(CIIIZ)V", line = 128)
	@Override
	void method7575(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(26) float local26;
		if (this.aClass104_Sub2_5.method20942() != Class401.aClass401_3) {
			@Pc(12) int local12 = arg2 + this.aClass5_10.method49(arg0, (byte) -109);
			@Pc(19) float local19 = (float) this.aClass5_10.method45(arg0, (byte) -31);
			local26 = this.aClass5_10.method46(arg0, 1415476369);
			this.aClass104_Sub2_5.aClass414_3.method28679((float) arg1, (float) local12, (float) arg1 + local19, (float) local12 + local26, this.aFloatArrayArray12[arg0][0], this.aFloatArrayArray12[arg0][1], this.aFloatArrayArray12[arg0][2], this.aFloatArrayArray12[arg0][3], this.anInterface38_5, arg3);
			return;
		}
		this.aClass104_Sub2_5.method21000();
		this.aClass104_Sub2_5.method21087(1);
		@Pc(81) Class134 local81 = this.aClass104_Sub2_5.aClass134_3;
		local81.anInterface38_20 = this.anInterface38_5;
		local81.method10197(0, arg3);
		local26 = this.aClass104_Sub2_5.method20435((byte) -26).method23737();
		@Pc(103) float local103 = (float) this.aClass104_Sub2_5.method20435((byte) -26).method23738();
		local81.aClass489_48.method29875(2.0F / local26, 2.0F / local103, 1.0F, 1.0F);
		local81.aClass489_48.aFloatArray116[12] = ((float) arg1 + this.aClass104_Sub2_5.method21118()) * 2.0F / local26 - 1.0F;
		local81.aClass489_48.aFloatArray116[13] = ((float) arg2 + this.aClass104_Sub2_5.method21118()) * 2.0F / local103 - 1.0F;
		local81.aClass489_48.aFloatArray116[14] = -1.0F;
		local81.aClass489_49.method29850();
		local81.anInterface37_9 = this.anInterface37_6;
		local81.anInt1174 = arg0 * 4;
		local81.aClass145_10 = this.aClass104_Sub2_5.aClass145_21;
		local81.method10198();
	}

	@OriginalMember(owner = "client!afx", name = "y", descriptor = "(CIIIZLclient!ch;II)V", line = 154)
	@Override
	void method7577(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class96 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
	}

	@OriginalMember(owner = "client!afx", name = "i", descriptor = "(CIIIZLclient!ch;II)V", line = 154)
	@Override
	void method7583(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class96 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
	}

	@OriginalMember(owner = "client!afx", name = "a", descriptor = "(CIIIZLclient!ch;II)V", line = 154)
	@Override
	void method7580(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class96 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
	}

	@OriginalMember(owner = "client!afx", name = "g", descriptor = "(CIIIZLclient!ch;II)V", line = 154)
	@Override
	void method7581(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class96 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
	}
}
