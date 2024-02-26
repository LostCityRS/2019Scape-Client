package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sb")
public final class Class545 {

	@OriginalMember(owner = "client!sb", name = "t", descriptor = "I")
	int anInt5126;

	@OriginalMember(owner = "client!sb", name = "f", descriptor = "I")
	int anInt5127;

	@OriginalMember(owner = "client!sb", name = "e", descriptor = "I")
	int anInt5128;

	@OriginalMember(owner = "client!sb", name = "u", descriptor = "I")
	int anInt5129;

	@OriginalMember(owner = "client!sb", name = "l", descriptor = "Ljava/lang/String;")
	String aString222;

	@OriginalMember(owner = "client!sb", name = "aky", descriptor = "(Lclient!yp;B)V")
	static void method31204(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class159.aClass80_Sub1_Sub12_3 == null ? -1 : Class159.aClass80_Sub1_Sub12_3.anInt3091 * 1774210559;
	}

	@OriginalMember(owner = "client!sb", name = "apg", descriptor = "(Lclient!yp;B)V")
	static void method31205(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(17) boolean local17 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581] == 1;
		if (local17) {
			Class151.method14543(3, (byte) -5);
		} else {
			Class151.method14543(2, (byte) -109);
		}
	}

	@OriginalMember(owner = "client!sb", name = "g", descriptor = "(Lclient!dr;[F[FI)V")
	static void method31206(@OriginalArg(0) Class231 arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) int arg3) {
		if (arg0 == null) {
			return;
		}
		arg0.aFloat276 = arg1[0];
		@Pc(15) float local15 = arg1[3] - arg1[0];
		@Pc(23) float local23 = arg2[3] - arg2[0];
		@Pc(31) float local31 = arg1[1] - arg1[0];
		@Pc(33) float local33 = 0.0F;
		@Pc(35) float local35 = 0.0F;
		if ((double) local31 != 0.0D) {
			local33 = (arg2[1] - arg2[0]) / local31;
		}
		local31 = arg1[3] - arg1[2];
		if ((double) local31 != 0.0D) {
			local35 = (arg2[3] - arg2[2]) / local31;
		}
		@Pc(79) float local79 = 1.0F / (local15 * local15);
		@Pc(83) float local83 = local33 * local15;
		@Pc(87) float local87 = local15 * local35;
		arg0.aFloatArray97[0] = (local87 + local83 - local23 - local23) * local79 / local15;
		arg0.aFloatArray97[1] = local79 * (local23 + local23 + local23 - local83 - local83 - local87);
		arg0.aFloatArray97[2] = local33;
		arg0.aFloatArray97[3] = arg2[0];
	}

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(IIIILjava/lang/String;)V")
	public Class545(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4) {
		this.anInt5126 = arg0 * 1394271387;
		this.anInt5127 = arg1 * 279234183;
		this.anInt5128 = arg2 * 1851370977;
		this.anInt5129 = arg3 * 1713812415;
		this.aString222 = arg4;
	}

	@OriginalMember(owner = "client!sb", name = "m", descriptor = "()I")
	int method31185() {
		return this.anInt5127 * 934879031;
	}

	@OriginalMember(owner = "client!sb", name = "t", descriptor = "(I)I")
	int method31186(@OriginalArg(0) int arg0) {
		return this.anInt5126 * 466641299;
	}

	@OriginalMember(owner = "client!sb", name = "f", descriptor = "(B)I")
	int method31187(@OriginalArg(0) byte arg0) {
		return this.anInt5127 * 934879031;
	}

	@OriginalMember(owner = "client!sb", name = "e", descriptor = "(I)I")
	int method31188(@OriginalArg(0) int arg0) {
		return this.anInt5128 * -1058580959;
	}

	@OriginalMember(owner = "client!sb", name = "u", descriptor = "(S)I")
	int method31189(@OriginalArg(0) short arg0) {
		return this.anInt5129 * -1478017985;
	}

	@OriginalMember(owner = "client!sb", name = "g", descriptor = "()I")
	int method31190() {
		return this.anInt5126 * 466641299;
	}

	@OriginalMember(owner = "client!sb", name = "i", descriptor = "()I")
	int method31191() {
		return this.anInt5126 * 466641299;
	}

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "()Ljava/lang/String;")
	String method31192() {
		return this.aString222;
	}

	@OriginalMember(owner = "client!sb", name = "o", descriptor = "()I")
	int method31193() {
		return this.anInt5127 * 934879031;
	}

	@OriginalMember(owner = "client!sb", name = "j", descriptor = "()I")
	int method31194() {
		return this.anInt5127 * 934879031;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "()I")
	int method31195() {
		return this.anInt5127 * 934879031;
	}

	@OriginalMember(owner = "client!sb", name = "s", descriptor = "()I")
	int method31196() {
		return this.anInt5127 * 934879031;
	}

	@OriginalMember(owner = "client!sb", name = "k", descriptor = "()I")
	int method31197() {
		return this.anInt5127 * 934879031;
	}

	@OriginalMember(owner = "client!sb", name = "x", descriptor = "()I")
	int method31198() {
		return this.anInt5128 * -1058580959;
	}

	@OriginalMember(owner = "client!sb", name = "w", descriptor = "()I")
	int method31199() {
		return this.anInt5128 * -1058580959;
	}

	@OriginalMember(owner = "client!sb", name = "l", descriptor = "(B)Ljava/lang/String;")
	String method31200(@OriginalArg(0) byte arg0) {
		return this.aString222;
	}

	@OriginalMember(owner = "client!sb", name = "h", descriptor = "()I")
	int method31201() {
		return this.anInt5129 * -1478017985;
	}

	@OriginalMember(owner = "client!sb", name = "r", descriptor = "()I")
	int method31202() {
		return this.anInt5128 * -1058580959;
	}

	@OriginalMember(owner = "client!sb", name = "q", descriptor = "()I")
	int method31203() {
		return this.anInt5129 * -1478017985;
	}
}
