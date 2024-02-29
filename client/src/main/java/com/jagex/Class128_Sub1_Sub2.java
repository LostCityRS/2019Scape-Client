package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aqw")
public class Class128_Sub1_Sub2 extends Class128_Sub1 {

	@OriginalMember(owner = "client!aqw", name = "ad", descriptor = "Lclient!hi;")
	Class116 aClass116_12;

	@OriginalMember(owner = "client!aqw", name = "aw", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_84;

	@OriginalMember(owner = "client!aqw", name = "as", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_85;

	@OriginalMember(owner = "client!aqw", name = "at", descriptor = "Lclient!hi;")
	Class116 aClass116_13;

	@OriginalMember(owner = "client!aqw", name = "am", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_86;

	@OriginalMember(owner = "client!aqw", name = "aj", descriptor = "F")
	float aFloat218;

	@OriginalMember(owner = "client!aqw", name = "ab", descriptor = "I")
	public int anInt2975;

	@OriginalMember(owner = "client!aqw", name = "aq", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_87;

	@OriginalMember(owner = "client!aqw", name = "av", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_88;

	@OriginalMember(owner = "client!aqw", name = "az", descriptor = "I")
	public int anInt2976;

	@OriginalMember(owner = "client!aqw", name = "ay", descriptor = "I")
	public int anInt2977;

	@OriginalMember(owner = "client!aqw", name = "aa", descriptor = "I")
	public int anInt2978;

	@OriginalMember(owner = "client!aqw", name = "ar", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_89;

	@OriginalMember(owner = "client!aqw", name = "au", descriptor = "Lclient!pq;")
	public final Class489 aClass489_91 = new Class489();

	@OriginalMember(owner = "client!aqw", name = "ap", descriptor = "Lclient!pq;")
	public final Class489 aClass489_90 = new Class489();

	@OriginalMember(owner = "client!aqw", name = "ax", descriptor = "[F")
	final float[] aFloatArray68 = new float[4];

	@OriginalMember(owner = "client!aqw", name = "ao", descriptor = "[F")
	final float[] aFloatArray69 = new float[4];

	@OriginalMember(owner = "client!aqw", name = "ai", descriptor = "Lclient!lp;")
	final Class402 aClass402_5;

	@OriginalMember(owner = "client!aqw", name = "<init>", descriptor = "(Lclient!afc;Lclient!lp;)V", line = 28)
	public Class128_Sub1_Sub2(@OriginalArg(0) Class104_Sub2 arg0, @OriginalArg(1) Class402 arg1) throws Exception_Sub2 {
		super(arg0);
		this.aClass402_5 = arg1;
		if (this.aClass402_5.method28509() && arg0.method21120()) {
			this.method21362("Waterfall");
		}
	}

	@OriginalMember(owner = "client!aqw", name = "a", descriptor = "()Z", line = 37)
	@Override
	boolean method21391() throws Exception_Sub2 {
		this.aClass93_Sub33_Sub1_89 = this.aClass115_10.method8276("WorldMatrix", (byte) 0);
		this.aClass93_Sub33_Sub1_86 = this.aClass115_10.method8276("WVPMatrix", (byte) 0);
		this.aClass93_Sub33_Sub1_87 = this.aClass115_10.method8276("UGenerationPlane", (byte) 0);
		this.aClass93_Sub33_Sub1_88 = this.aClass115_10.method8276("VGenerationPlane", (byte) 0);
		this.aClass93_Sub33_Sub1_84 = this.aClass115_10.method8276("Time", (byte) 0);
		this.aClass93_Sub33_Sub1_85 = this.aClass115_10.method8276("billowSampler3D", (byte) 0);
		if (this.aClass402_5.aBoolean746) {
			this.aClass116_13 = this.aClass115_10.method8199("Waterfall3D", 1249273355);
			this.aClass115_10.method8301(this.aClass116_13);
		} else {
			this.aClass116_12 = this.aClass115_10.method8199("Waterfall2D", 1249273355);
			this.aClass115_10.method8301(this.aClass116_12);
		}
		return true;
	}

	@OriginalMember(owner = "client!aqw", name = "ai", descriptor = "()Z", line = 37)
	@Override
	boolean method21393() throws Exception_Sub2 {
		this.aClass93_Sub33_Sub1_89 = this.aClass115_10.method8276("WorldMatrix", (byte) 0);
		this.aClass93_Sub33_Sub1_86 = this.aClass115_10.method8276("WVPMatrix", (byte) 0);
		this.aClass93_Sub33_Sub1_87 = this.aClass115_10.method8276("UGenerationPlane", (byte) 0);
		this.aClass93_Sub33_Sub1_88 = this.aClass115_10.method8276("VGenerationPlane", (byte) 0);
		this.aClass93_Sub33_Sub1_84 = this.aClass115_10.method8276("Time", (byte) 0);
		this.aClass93_Sub33_Sub1_85 = this.aClass115_10.method8276("billowSampler3D", (byte) 0);
		if (this.aClass402_5.aBoolean746) {
			this.aClass116_13 = this.aClass115_10.method8199("Waterfall3D", 1249273355);
			this.aClass115_10.method8301(this.aClass116_13);
		} else {
			this.aClass116_12 = this.aClass115_10.method8199("Waterfall2D", 1249273355);
			this.aClass115_10.method8301(this.aClass116_12);
		}
		return true;
	}

	@OriginalMember(owner = "client!aqw", name = "aw", descriptor = "()Z", line = 37)
	@Override
	boolean method21392() throws Exception_Sub2 {
		this.aClass93_Sub33_Sub1_89 = this.aClass115_10.method8276("WorldMatrix", (byte) 0);
		this.aClass93_Sub33_Sub1_86 = this.aClass115_10.method8276("WVPMatrix", (byte) 0);
		this.aClass93_Sub33_Sub1_87 = this.aClass115_10.method8276("UGenerationPlane", (byte) 0);
		this.aClass93_Sub33_Sub1_88 = this.aClass115_10.method8276("VGenerationPlane", (byte) 0);
		this.aClass93_Sub33_Sub1_84 = this.aClass115_10.method8276("Time", (byte) 0);
		this.aClass93_Sub33_Sub1_85 = this.aClass115_10.method8276("billowSampler3D", (byte) 0);
		if (this.aClass402_5.aBoolean746) {
			this.aClass116_13 = this.aClass115_10.method8199("Waterfall3D", 1249273355);
			this.aClass115_10.method8301(this.aClass116_13);
		} else {
			this.aClass116_12 = this.aClass115_10.method8199("Waterfall2D", 1249273355);
			this.aClass115_10.method8301(this.aClass116_12);
		}
		return true;
	}

	@OriginalMember(owner = "client!aqw", name = "bx", descriptor = "(II)V", line = 55)
	public void method21394(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) float local8 = -5.0E-4F * (float) ((arg0 & 0x3) + 1);
		@Pc(19) float local19 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(28) float local28 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(36) boolean local36 = (arg0 & 0x80) != 0;
		if (local36) {
			this.aFloatArray68[0] = local28;
			this.aFloatArray68[1] = 0.0F;
			this.aFloatArray68[2] = 0.0F;
			this.aFloatArray68[3] = 0.0F;
		} else {
			this.aFloatArray68[0] = 0.0F;
			this.aFloatArray68[1] = 0.0F;
			this.aFloatArray68[2] = local28;
			this.aFloatArray68[3] = 0.0F;
		}
		this.aFloatArray69[0] = 0.0F;
		this.aFloatArray69[1] = local28;
		this.aFloatArray69[2] = 0.0F;
		this.aFloatArray69[3] = local8 * (float) this.aClass104_Sub2_31.anInt2952 % 1.0F;
		if (this.aClass402_5.aBoolean746) {
			this.aFloat218 = (float) ((double) this.aClass104_Sub2_31.anInt2952 * (double) local19 % 1.0D);
		} else {
			@Pc(120) int local120 = (int) (local19 * 16.0F * (float) this.aClass104_Sub2_31.anInt2952);
			this.aClass104_Sub2_31.method21061(this.aClass402_5.anInterface38Array1[local120 % 16]);
		}
	}

	@OriginalMember(owner = "client!aqw", name = "bf", descriptor = "(III)V", line = 55)
	public void method21395(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) float local8 = -5.0E-4F * (float) ((arg0 & 0x3) + 1);
		@Pc(19) float local19 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(28) float local28 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(36) boolean local36 = (arg0 & 0x80) != 0;
		if (local36) {
			this.aFloatArray68[0] = local28;
			this.aFloatArray68[1] = 0.0F;
			this.aFloatArray68[2] = 0.0F;
			this.aFloatArray68[3] = 0.0F;
		} else {
			this.aFloatArray68[0] = 0.0F;
			this.aFloatArray68[1] = 0.0F;
			this.aFloatArray68[2] = local28;
			this.aFloatArray68[3] = 0.0F;
		}
		this.aFloatArray69[0] = 0.0F;
		this.aFloatArray69[1] = local28;
		this.aFloatArray69[2] = 0.0F;
		this.aFloatArray69[3] = local8 * (float) this.aClass104_Sub2_31.anInt2952 % 1.0F;
		if (this.aClass402_5.aBoolean746) {
			this.aFloat218 = (float) ((double) this.aClass104_Sub2_31.anInt2952 * (double) local19 % 1.0D);
		} else {
			@Pc(120) int local120 = (int) (local19 * 16.0F * (float) this.aClass104_Sub2_31.anInt2952);
			this.aClass104_Sub2_31.method21061(this.aClass402_5.anInterface38Array1[local120 % 16]);
		}
	}

	@OriginalMember(owner = "client!aqw", name = "bh", descriptor = "(II)V", line = 55)
	public void method21396(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) float local8 = -5.0E-4F * (float) ((arg0 & 0x3) + 1);
		@Pc(19) float local19 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(28) float local28 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(36) boolean local36 = (arg0 & 0x80) != 0;
		if (local36) {
			this.aFloatArray68[0] = local28;
			this.aFloatArray68[1] = 0.0F;
			this.aFloatArray68[2] = 0.0F;
			this.aFloatArray68[3] = 0.0F;
		} else {
			this.aFloatArray68[0] = 0.0F;
			this.aFloatArray68[1] = 0.0F;
			this.aFloatArray68[2] = local28;
			this.aFloatArray68[3] = 0.0F;
		}
		this.aFloatArray69[0] = 0.0F;
		this.aFloatArray69[1] = local28;
		this.aFloatArray69[2] = 0.0F;
		this.aFloatArray69[3] = local8 * (float) this.aClass104_Sub2_31.anInt2952 % 1.0F;
		if (this.aClass402_5.aBoolean746) {
			this.aFloat218 = (float) ((double) this.aClass104_Sub2_31.anInt2952 * (double) local19 % 1.0D);
		} else {
			@Pc(120) int local120 = (int) (local19 * 16.0F * (float) this.aClass104_Sub2_31.anInt2952);
			this.aClass104_Sub2_31.method21061(this.aClass402_5.anInterface38Array1[local120 % 16]);
		}
	}

	@OriginalMember(owner = "client!aqw", name = "bk", descriptor = "(II)V", line = 55)
	public void method21397(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) float local8 = -5.0E-4F * (float) ((arg0 & 0x3) + 1);
		@Pc(19) float local19 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(28) float local28 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(36) boolean local36 = (arg0 & 0x80) != 0;
		if (local36) {
			this.aFloatArray68[0] = local28;
			this.aFloatArray68[1] = 0.0F;
			this.aFloatArray68[2] = 0.0F;
			this.aFloatArray68[3] = 0.0F;
		} else {
			this.aFloatArray68[0] = 0.0F;
			this.aFloatArray68[1] = 0.0F;
			this.aFloatArray68[2] = local28;
			this.aFloatArray68[3] = 0.0F;
		}
		this.aFloatArray69[0] = 0.0F;
		this.aFloatArray69[1] = local28;
		this.aFloatArray69[2] = 0.0F;
		this.aFloatArray69[3] = local8 * (float) this.aClass104_Sub2_31.anInt2952 % 1.0F;
		if (this.aClass402_5.aBoolean746) {
			this.aFloat218 = (float) ((double) this.aClass104_Sub2_31.anInt2952 * (double) local19 % 1.0D);
		} else {
			@Pc(120) int local120 = (int) (local19 * 16.0F * (float) this.aClass104_Sub2_31.anInt2952);
			this.aClass104_Sub2_31.method21061(this.aClass402_5.anInterface38Array1[local120 % 16]);
		}
	}

	@OriginalMember(owner = "client!aqw", name = "bl", descriptor = "(I)V", line = 85)
	public void method21398(@OriginalArg(0) int arg0) {
		if (this.aClass402_5.aBoolean746) {
			this.aClass115_10.method8301(this.aClass116_13);
		} else {
			this.aClass115_10.method8301(this.aClass116_12);
		}
		this.aClass115_10.method8315();
		if (this.aClass402_5.aBoolean746) {
			this.aClass115_10.method8248(this.aClass93_Sub33_Sub1_85, 0, this.aClass402_5.anInterface35_3, 2121434515);
		}
		this.aClass115_10.method8243(this.aClass93_Sub33_Sub1_89, this.aClass489_90, -1895101935);
		this.aClass115_10.method8243(this.aClass93_Sub33_Sub1_86, this.aClass489_91, -2013201623);
		this.aClass115_10.method8230(this.aClass93_Sub33_Sub1_87, new Class460(this.aFloatArray68[0], this.aFloatArray68[1], this.aFloatArray68[2], this.aFloatArray68[3]), 2099123314);
		this.aClass115_10.method8230(this.aClass93_Sub33_Sub1_88, new Class460(this.aFloatArray69[0], this.aFloatArray69[1], this.aFloatArray69[2], this.aFloatArray69[3]), 1992687097);
		this.aClass115_10.method8230(this.aClass93_Sub33_Sub1_84, new Class460(this.aFloat218, 0.0F, 0.0F, 0.0F), 2031423406);
		this.aClass104_Sub2_31.method21171(Class424.aClass424_3, this.anInt2977 * 1409431769, this.anInt2975 * 783427107, this.anInt2976 * -931865991, this.anInt2978 * 1163727545);
	}

	@OriginalMember(owner = "client!aqw", name = "bd", descriptor = "()V", line = 85)
	public void method21399() {
		if (this.aClass402_5.aBoolean746) {
			this.aClass115_10.method8301(this.aClass116_13);
		} else {
			this.aClass115_10.method8301(this.aClass116_12);
		}
		this.aClass115_10.method8315();
		if (this.aClass402_5.aBoolean746) {
			this.aClass115_10.method8248(this.aClass93_Sub33_Sub1_85, 0, this.aClass402_5.anInterface35_3, 2142488880);
		}
		this.aClass115_10.method8243(this.aClass93_Sub33_Sub1_89, this.aClass489_90, -823934231);
		this.aClass115_10.method8243(this.aClass93_Sub33_Sub1_86, this.aClass489_91, -2063692519);
		this.aClass115_10.method8230(this.aClass93_Sub33_Sub1_87, new Class460(this.aFloatArray68[0], this.aFloatArray68[1], this.aFloatArray68[2], this.aFloatArray68[3]), 1990777667);
		this.aClass115_10.method8230(this.aClass93_Sub33_Sub1_88, new Class460(this.aFloatArray69[0], this.aFloatArray69[1], this.aFloatArray69[2], this.aFloatArray69[3]), 2139919519);
		this.aClass115_10.method8230(this.aClass93_Sub33_Sub1_84, new Class460(this.aFloat218, 0.0F, 0.0F, 0.0F), 2126996358);
		this.aClass104_Sub2_31.method21171(Class424.aClass424_3, this.anInt2977 * 1409431769, this.anInt2975 * 783427107, this.anInt2976 * -931865991, this.anInt2978 * 1163727545);
	}
}
