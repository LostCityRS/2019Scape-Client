package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!atf")
public class Class93_Sub1_Sub16_Sub2 extends Class93_Sub1_Sub16 {

	@OriginalMember(owner = "client!atf", name = "c", descriptor = "I")
	static final int anInt3192 = 3;

	@OriginalMember(owner = "client!atf", name = "p", descriptor = "I")
	static final int anInt3194 = 1;

	@OriginalMember(owner = "client!atf", name = "d", descriptor = "I")
	static final int anInt3195 = 2;

	@OriginalMember(owner = "client!atf", name = "v", descriptor = "Lclient!uf;")
	Class593 aClass593_3;

	@OriginalMember(owner = "client!atf", name = "o", descriptor = "[B")
	byte[] aByteArray60;

	@OriginalMember(owner = "client!atf", name = "r", descriptor = "I")
	int anInt3193;

	@OriginalMember(owner = "client!atf", name = "<init>", descriptor = "()V", line = 13)
	Class93_Sub1_Sub16_Sub2() {
	}

	@OriginalMember(owner = "client!atf", name = "e", descriptor = "(I)[B", line = 16)
	@Override
	byte[] method23981(@OriginalArg(0) int arg0) {
		if (this.aBoolean546) {
			throw new RuntimeException();
		}
		return this.aByteArray60;
	}

	@OriginalMember(owner = "client!atf", name = "m", descriptor = "()[B", line = 16)
	@Override
	byte[] method23980() {
		if (this.aBoolean546) {
			throw new RuntimeException();
		}
		return this.aByteArray60;
	}

	@OriginalMember(owner = "client!atf", name = "k", descriptor = "()[B", line = 16)
	@Override
	byte[] method23982() {
		if (this.aBoolean546) {
			throw new RuntimeException();
		}
		return this.aByteArray60;
	}

	@OriginalMember(owner = "client!atf", name = "n", descriptor = "(I)I", line = 23)
	@Override
	int method23983(@OriginalArg(0) int arg0) {
		return this.aBoolean546 ? 0 : 100;
	}

	@OriginalMember(owner = "client!atf", name = "f", descriptor = "()I", line = 23)
	@Override
	int method23979() {
		return this.aBoolean546 ? 0 : 100;
	}

	@OriginalMember(owner = "client!atf", name = "w", descriptor = "()I", line = 23)
	@Override
	int method23984() {
		return this.aBoolean546 ? 0 : 100;
	}

	@OriginalMember(owner = "client!atf", name = "aie", descriptor = "(Lclient!yf;I)V", line = 11323)
	static final void method23377(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class449.aClass514_1.method30267(local13, (byte) 53).aCharArray3[local23];
	}
}
