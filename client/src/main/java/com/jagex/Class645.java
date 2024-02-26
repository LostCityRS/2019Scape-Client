package com.jagex;

import com.jagex.twitchtv.TwitchWebcamDevice;
import com.jagex.twitchtv.TwitchWebcamDeviceCapability;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wr")
public final class Class645 implements Interface75 {

	@OriginalMember(owner = "client!wr", name = "t", descriptor = "Lclient!wr;")
	static final Class645 aClass645_3 = new Class645(0);

	@OriginalMember(owner = "client!wr", name = "f", descriptor = "Lclient!wr;")
	static final Class645 aClass645_1 = new Class645(1);

	@OriginalMember(owner = "client!wr", name = "e", descriptor = "Lclient!wr;")
	static final Class645 aClass645_2 = new Class645(2);

	@OriginalMember(owner = "client!wr", name = "u", descriptor = "I")
	final int anInt5646;

	@OriginalMember(owner = "client!wr", name = "e", descriptor = "()[Lclient!wr;")
	public static Class645[] method33038() {
		return new Class645[] { aClass645_3, aClass645_2, aClass645_1 };
	}

	@OriginalMember(owner = "client!wr", name = "u", descriptor = "()[Lclient!wr;")
	public static Class645[] method33039() {
		return new Class645[] { aClass645_3, aClass645_2, aClass645_1 };
	}

	@OriginalMember(owner = "client!wr", name = "l", descriptor = "()[Lclient!wr;")
	public static Class645[] method33040() {
		return new Class645[] { aClass645_3, aClass645_2, aClass645_1 };
	}

	@OriginalMember(owner = "client!wr", name = "v", descriptor = "(Lclient!yp;B)V")
	static void method33041(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		@Pc(27) TwitchWebcamDevice local27 = Class578.method31796(local13, -1539136947);
		@Pc(29) TwitchWebcamDeviceCapability local29 = null;
		if (local27 != null) {
			local29 = local27.f(local23);
		}
		if (local29 != null) {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local29.t * 301056343;
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local29.f * -671698919;
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local29.e * -1812482537;
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local29.u * -1633145387;
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local29.l * 1701081943;
			return;
		}
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = -1;
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = -1;
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = -1;
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = -1;
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = -1;
	}

	@OriginalMember(owner = "client!wr", name = "cq", descriptor = "(Lclient!yp;I)V")
	static void method33042(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class626.method32536(local11, local14, arg0, 911960017);
	}

	@OriginalMember(owner = "client!wr", name = "ta", descriptor = "(Lclient!yp;B)V")
	static void method33043(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		Class116_Sub1.method8761(local11, arg0, 1464770885);
	}

	@OriginalMember(owner = "client!wr", name = "u", descriptor = "(I)V")
	static void method33044(@OriginalArg(0) int arg0) {
		Class149.aBoolean355 = false;
		Class138_Sub1.method10718((byte) 42);
	}

	@OriginalMember(owner = "client!wr", name = "gn", descriptor = "(Lclient!yp;I)V")
	static void method33045(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class364.method28215(local11, local14, arg0, (byte) -97);
	}

	@OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(I)V")
	Class645(@OriginalArg(0) int arg0) {
		this.anInt5646 = arg0 * 1547557903;
	}

	@OriginalMember(owner = "client!wr", name = "f", descriptor = "()I")
	@Override
	public int method37268() {
		return this.anInt5646 * 1716622063;
	}

	@OriginalMember(owner = "client!wr", name = "g", descriptor = "()I")
	@Override
	public int method37267() {
		return this.anInt5646 * 1716622063;
	}

	@OriginalMember(owner = "client!wr", name = "i", descriptor = "()I")
	@Override
	public int method37269() {
		return this.anInt5646 * 1716622063;
	}
}
