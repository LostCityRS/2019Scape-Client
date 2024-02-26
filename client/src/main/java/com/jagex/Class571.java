package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tf")
public final class Class571 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!tf", name = "this$0", descriptor = "Lclient!aie;")
	final Class138_Sub1 aClass138_Sub1_2;

	@OriginalMember(owner = "client!tf", name = "t", descriptor = "Lclient!tl;")
	Class575 aClass575_1;

	@OriginalMember(owner = "client!tf", name = "f", descriptor = "[B")
	byte[] aByteArray100;

	@OriginalMember(owner = "client!tf", name = "e", descriptor = "[B")
	byte[] aByteArray101;

	@OriginalMember(owner = "client!tf", name = "g", descriptor = "I")
	int anInt5272;

	@OriginalMember(owner = "client!tf", name = "m", descriptor = "F")
	final float aFloat334;

	@OriginalMember(owner = "client!tf", name = "o", descriptor = "I")
	final int anInt5270;

	@OriginalMember(owner = "client!tf", name = "j", descriptor = "I")
	final int anInt5271;

	@OriginalMember(owner = "client!tf", name = "l", descriptor = "I")
	int anInt5267;

	@OriginalMember(owner = "client!tf", name = "u", descriptor = "I")
	int anInt5269;

	@OriginalMember(owner = "client!tf", name = "i", descriptor = "I")
	int anInt5268;

	@OriginalMember(owner = "client!tf", name = "aza", descriptor = "(Lclient!yp;I)V")
	static void method31732(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class703.aClass80_Sub37_49.aClass165_Sub2_1.method15859(1355703223) ? 1 : 0;
	}

	@OriginalMember(owner = "client!tf", name = "p", descriptor = "(II)V")
	static void method31733(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!tf", name = "k", descriptor = "(I)V")
	public static void method31734(@OriginalArg(0) int arg0) {
		if (Class365.aClass369_1 != null) {
			Class365.aClass369_1.method28308(-1977424501);
		}
		if (Class365.aThread7 == null) {
			return;
		}
		while (true) {
			try {
				Class365.aThread7.join();
				break;
			} catch (@Pc(10) InterruptedException local10) {
			}
		}
	}

	@OriginalMember(owner = "client!tf", name = "ah", descriptor = "(Lclient!yp;B)V")
	static void method31735(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray527[arg0.anIntArray526[arg0.anInt5780 * -1336568839]] = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
	}

	@OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(Lclient!aie;Lclient!tl;IFIIZZ)V")
	Class571(@OriginalArg(0) Class138_Sub1 arg0, @OriginalArg(1) Class575 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7) {
		this.aClass138_Sub1_2 = arg0;
		this.aClass575_1 = arg1;
		this.aByteArray100 = new byte[arg2];
		this.aByteArray101 = new byte[arg4 / 8];
		this.anInt5272 = this.aByteArray100.length * 1484414169;
		this.aFloat334 = arg3;
		this.anInt5270 = arg4 * -123166733;
		this.anInt5271 = arg5 * 1398492551;
		this.anInt5267 = 0;
		this.anInt5269 = 0;
		this.anInt5268 = 0;
	}

	@OriginalMember(owner = "client!tf", name = "g", descriptor = "()I")
	int method31725() {
		return this.anInt5272 * -1305975959;
	}

	@OriginalMember(owner = "client!tf", name = "u", descriptor = "()I")
	int method31726() {
		return this.anInt5272 * -1305975959;
	}

	@OriginalMember(owner = "client!tf", name = "f", descriptor = "(I)I")
	int method31727(@OriginalArg(0) int arg0) {
		return this.anInt5272 * -1305975959;
	}

	@OriginalMember(owner = "client!tf", name = "e", descriptor = "([BII)V")
	void method31728(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(1) int local1 = arg1;
		while (local1 < arg2 + arg1) {
			this.aByteArray100[this.anInt5267 * 798403217] = arg0[local1];
			this.aByteArray100[this.anInt5267 * 798403217 + 1] = arg0[local1 + 1];
			local1 += 2;
			this.anInt5267 += 1713679586;
			this.anInt5267 = this.anInt5267 * 798403217 % this.aByteArray100.length * -1290643855;
			this.anInt5272 -= -1326138958;
		}
	}

	@OriginalMember(owner = "client!tf", name = "t", descriptor = "([BIIB)V")
	void method31729(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		@Pc(1) int local1 = arg1;
		while (local1 < arg2 + arg1) {
			this.aByteArray100[this.anInt5267 * 798403217] = arg0[local1];
			this.aByteArray100[this.anInt5267 * 798403217 + 1] = arg0[local1 + 1];
			local1 += 2;
			this.anInt5267 += 1713679586;
			this.anInt5267 = this.anInt5267 * 798403217 % this.aByteArray100.length * -1290643855;
			this.anInt5272 -= -1326138958;
		}
	}

	@OriginalMember(owner = "client!tf", name = "l", descriptor = "()I")
	int method31730() {
		return this.anInt5272 * -1305975959;
	}

	@OriginalMember(owner = "client!tf", name = "i", descriptor = "()I")
	int method31731() {
		return this.anInt5272 * -1305975959;
	}
}
