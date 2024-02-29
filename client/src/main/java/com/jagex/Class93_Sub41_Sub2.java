package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ase")
public class Class93_Sub41_Sub2 extends Class93_Sub41 {

	@OriginalMember(owner = "client!ase", name = "r", descriptor = "[I")
	static final int[] anIntArray263 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!ase", name = "c", descriptor = "Lclient!aav;")
	Class24 aClass24_1;

	@OriginalMember(owner = "client!ase", name = "v", descriptor = "I")
	int anInt3073;

	@OriginalMember(owner = "client!ase", name = "<init>", descriptor = "(I)V", line = 11)
	public Class93_Sub41_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ase", name = "ku", descriptor = "(Lclient!aav;)V", line = 15)
	public void method22661(@OriginalArg(0) Class24 arg0) {
		this.aClass24_1 = arg0;
	}

	@OriginalMember(owner = "client!ase", name = "jg", descriptor = "(Lclient!aav;B)V", line = 15)
	public void method22662(@OriginalArg(0) Class24 arg0, @OriginalArg(1) byte arg1) {
		this.aClass24_1 = arg0;
	}

	@OriginalMember(owner = "client!ase", name = "jx", descriptor = "(II)V", line = 19)
	public void method22663(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 + this.aClass24_1.method504(565430542));
	}

	@OriginalMember(owner = "client!ase", name = "kf", descriptor = "(I)V", line = 19)
	public void method22664(@OriginalArg(0) int arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 + this.aClass24_1.method504(565430542));
	}

	@OriginalMember(owner = "client!ase", name = "ko", descriptor = "(I)V", line = 19)
	public void method22665(@OriginalArg(0) int arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 + this.aClass24_1.method504(565430542));
	}

	@OriginalMember(owner = "client!ase", name = "kl", descriptor = "()I", line = 23)
	public int method22666() {
		return this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] - this.aClass24_1.method504(565430542) & 0xFF;
	}

	@OriginalMember(owner = "client!ase", name = "jh", descriptor = "(I)I", line = 23)
	public int method22667(@OriginalArg(0) int arg0) {
		return this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] - this.aClass24_1.method504(565430542) & 0xFF;
	}

	@OriginalMember(owner = "client!ase", name = "ki", descriptor = "()I", line = 23)
	public int method22668() {
		return this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] - this.aClass24_1.method504(565430542) & 0xFF;
	}

	@OriginalMember(owner = "client!ase", name = "ks", descriptor = "()I", line = 23)
	public int method22669() {
		return this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] - this.aClass24_1.method504(565430542) & 0xFF;
	}

	@OriginalMember(owner = "client!ase", name = "kh", descriptor = "()I", line = 23)
	public int method22670() {
		return this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] - this.aClass24_1.method504(565430542) & 0xFF;
	}

	@OriginalMember(owner = "client!ase", name = "kx", descriptor = "()I", line = 23)
	public int method22671() {
		return this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] - this.aClass24_1.method504(565430542) & 0xFF;
	}

	@OriginalMember(owner = "client!ase", name = "ka", descriptor = "()I", line = 23)
	public int method22672() {
		return this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] - this.aClass24_1.method504(565430542) & 0xFF;
	}

	@OriginalMember(owner = "client!ase", name = "jp", descriptor = "(I)Z", line = 27)
	public boolean method22673(@OriginalArg(0) int arg0) {
		@Pc(14) int local14 = this.aByteArray58[this.anInt3070 * 212851357] - this.aClass24_1.method507(1070614472) & 0xFF;
		return local14 >= 128;
	}

	@OriginalMember(owner = "client!ase", name = "kb", descriptor = "()Z", line = 27)
	public boolean method22674() {
		@Pc(14) int local14 = this.aByteArray58[this.anInt3070 * 212851357] - this.aClass24_1.method507(1070614472) & 0xFF;
		return local14 >= 128;
	}

	@OriginalMember(owner = "client!ase", name = "kr", descriptor = "()Z", line = 27)
	public boolean method22675() {
		@Pc(14) int local14 = this.aByteArray58[this.anInt3070 * 212851357] - this.aClass24_1.method507(1070614472) & 0xFF;
		return local14 >= 128;
	}

	@OriginalMember(owner = "client!ase", name = "kc", descriptor = "()I", line = 33)
	public int method22676() {
		@Pc(21) int local21 = this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] - this.aClass24_1.method504(565430542) & 0xFF;
		return local21 < 128 ? local21 : (local21 - 128 << 8) + (this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] - this.aClass24_1.method504(565430542) & 0xFF);
	}

	@OriginalMember(owner = "client!ase", name = "jk", descriptor = "(I)I", line = 33)
	public int method22677(@OriginalArg(0) int arg0) {
		@Pc(21) int local21 = this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] - this.aClass24_1.method504(565430542) & 0xFF;
		return local21 < 128 ? local21 : (local21 - 128 << 8) + (this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] - this.aClass24_1.method504(565430542) & 0xFF);
	}

	@OriginalMember(owner = "client!ase", name = "kd", descriptor = "()I", line = 33)
	public int method22678() {
		@Pc(21) int local21 = this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] - this.aClass24_1.method504(565430542) & 0xFF;
		return local21 < 128 ? local21 : (local21 - 128 << 8) + (this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] - this.aClass24_1.method504(565430542) & 0xFF);
	}

	@OriginalMember(owner = "client!ase", name = "kw", descriptor = "([BIII)V", line = 39)
	public void method22679(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(1) int local1 = 0; local1 < arg2; local1++) {
			arg0[arg1 + local1] = (byte) (this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] - this.aClass24_1.method504(565430542));
		}
	}

	@OriginalMember(owner = "client!ase", name = "kj", descriptor = "([BII)V", line = 39)
	public void method22680(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < arg2; local1++) {
			arg0[arg1 + local1] = (byte) (this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] - this.aClass24_1.method504(565430542));
		}
	}

	@OriginalMember(owner = "client!ase", name = "kn", descriptor = "([BII)V", line = 39)
	public void method22681(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < arg2; local1++) {
			arg0[arg1 + local1] = (byte) (this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] - this.aClass24_1.method504(565430542));
		}
	}

	@OriginalMember(owner = "client!ase", name = "kz", descriptor = "(B)V", line = 43)
	public void method22682(@OriginalArg(0) byte arg0) {
		this.anInt3073 = this.anInt3070 * -664548008;
	}

	@OriginalMember(owner = "client!ase", name = "kp", descriptor = "()V", line = 43)
	public void method22683() {
		this.anInt3073 = this.anInt3070 * -664548008;
	}

	@OriginalMember(owner = "client!ase", name = "km", descriptor = "(I)I", line = 47)
	public int method22684(@OriginalArg(0) int arg0) {
		@Pc(6) int local6 = this.anInt3073 * 1626146007 >> 3;
		@Pc(15) int local15 = 8 - (this.anInt3073 * 1626146007 & 0x7);
		@Pc(17) int local17 = 0;
		this.anInt3073 += arg0 * 1552821991;
		while (arg0 > local15) {
			local17 += (this.aByteArray58[local6++] & anIntArray263[local15]) << arg0 - local15;
			arg0 -= local15;
			local15 = 8;
		}
		if (local15 == arg0) {
			local17 += this.aByteArray58[local6] & anIntArray263[local15];
		} else {
			local17 += this.aByteArray58[local6] >> local15 - arg0 & anIntArray263[arg0];
		}
		return local17;
	}

	@OriginalMember(owner = "client!ase", name = "ky", descriptor = "(I)I", line = 47)
	public int method22685(@OriginalArg(0) int arg0) {
		@Pc(6) int local6 = this.anInt3073 * 1626146007 >> 3;
		@Pc(15) int local15 = 8 - (this.anInt3073 * 1626146007 & 0x7);
		@Pc(17) int local17 = 0;
		this.anInt3073 += arg0 * 1552821991;
		while (arg0 > local15) {
			local17 += (this.aByteArray58[local6++] & anIntArray263[local15]) << arg0 - local15;
			arg0 -= local15;
			local15 = 8;
		}
		if (local15 == arg0) {
			local17 += this.aByteArray58[local6] & anIntArray263[local15];
		} else {
			local17 += this.aByteArray58[local6] >> local15 - arg0 & anIntArray263[arg0];
		}
		return local17;
	}

	@OriginalMember(owner = "client!ase", name = "ke", descriptor = "(II)I", line = 47)
	public int method22686(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) int local6 = this.anInt3073 * 1626146007 >> 3;
		@Pc(15) int local15 = 8 - (this.anInt3073 * 1626146007 & 0x7);
		@Pc(17) int local17 = 0;
		this.anInt3073 += arg0 * 1552821991;
		while (arg0 > local15) {
			local17 += (this.aByteArray58[local6++] & anIntArray263[local15]) << arg0 - local15;
			arg0 -= local15;
			local15 = 8;
		}
		if (local15 == arg0) {
			local17 += this.aByteArray58[local6] & anIntArray263[local15];
		} else {
			local17 += this.aByteArray58[local6] >> local15 - arg0 & anIntArray263[arg0];
		}
		return local17;
	}

	@OriginalMember(owner = "client!ase", name = "kv", descriptor = "()V", line = 62)
	public void method22687() {
		this.anInt3070 = (this.anInt3073 * 1626146007 + 7) / 8 * -1445626955;
	}

	@OriginalMember(owner = "client!ase", name = "kq", descriptor = "(I)V", line = 62)
	public void method22688(@OriginalArg(0) int arg0) {
		this.anInt3070 = (this.anInt3073 * 1626146007 + 7) / 8 * -1445626955;
	}

	@OriginalMember(owner = "client!ase", name = "kk", descriptor = "()V", line = 62)
	public void method22689() {
		this.anInt3070 = (this.anInt3073 * 1626146007 + 7) / 8 * -1445626955;
	}

	@OriginalMember(owner = "client!ase", name = "kt", descriptor = "()V", line = 62)
	public void method22690() {
		this.anInt3070 = (this.anInt3073 * 1626146007 + 7) / 8 * -1445626955;
	}

	@OriginalMember(owner = "client!ase", name = "kg", descriptor = "(II)I", line = 66)
	public int method22691(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 * 8 - this.anInt3073 * 1626146007;
	}

	@OriginalMember(owner = "client!ase", name = "li", descriptor = "(I)I", line = 66)
	public int method22692(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt3073 * 1626146007;
	}
}
