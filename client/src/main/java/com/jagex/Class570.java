package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!th")
public class Class570 {

	@OriginalMember(owner = "client!th", name = "ri", descriptor = "I")
	static int anInt5397;

	// $FF: synthetic field
	@OriginalMember(owner = "client!th", name = "this$0", descriptor = "Lclient!aiz;")
	final Class146_Sub2 this$0;

	@OriginalMember(owner = "client!th", name = "e", descriptor = "Lclient!ts;")
	Class580 aClass580_1;

	@OriginalMember(owner = "client!th", name = "n", descriptor = "[B")
	byte[] aByteArray100;

	@OriginalMember(owner = "client!th", name = "m", descriptor = "[B")
	byte[] aByteArray101;

	@OriginalMember(owner = "client!th", name = "w", descriptor = "I")
	int anInt5393;

	@OriginalMember(owner = "client!th", name = "u", descriptor = "F")
	final float aFloat334;

	@OriginalMember(owner = "client!th", name = "z", descriptor = "I")
	final int anInt5392;

	@OriginalMember(owner = "client!th", name = "p", descriptor = "I")
	final int anInt5395;

	@OriginalMember(owner = "client!th", name = "f", descriptor = "I")
	int anInt5391;

	@OriginalMember(owner = "client!th", name = "k", descriptor = "I")
	int anInt5396;

	@OriginalMember(owner = "client!th", name = "l", descriptor = "I")
	int anInt5394;

	@OriginalMember(owner = "client!th", name = "r", descriptor = "(I)I", line = 198)
	public static int method31313(@OriginalArg(0) int arg0) {
		if (Class625.aBoolean848) {
			Class572.method31333(Class694.aClass104_14, -2122677173);
			return Class166_Sub13.aTwitchTV1.Logout();
		} else {
			return 12;
		}
	}

	@OriginalMember(owner = "client!th", name = "ae", descriptor = "(I)Z", line = 400)
	public static boolean method31314(@OriginalArg(0) int arg0) {
		return Class625.aBoolean849;
	}

	@OriginalMember(owner = "client!th", name = "<init>", descriptor = "(Lclient!aiz;Lclient!ts;IFIIZZ)V", line = 524)
	Class570(@OriginalArg(0) Class146_Sub2 arg0, @OriginalArg(1) Class580 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7) {
		this.this$0 = arg0;
		this.aClass580_1 = arg1;
		this.aByteArray100 = new byte[arg2];
		this.aByteArray101 = new byte[arg4 / 8];
		this.anInt5393 = this.aByteArray100.length * -1185466457;
		this.aFloat334 = arg3;
		this.anInt5392 = arg4 * 1767793001;
		this.anInt5395 = arg5 * 501824729;
		this.anInt5391 = 0;
		this.anInt5396 = 0;
		this.anInt5394 = 0;
	}

	@OriginalMember(owner = "client!th", name = "e", descriptor = "([BIIB)V", line = 538)
	void method31315(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		@Pc(1) int local1 = arg1;
		while (local1 < arg1 + arg2) {
			this.aByteArray100[this.anInt5391 * 874858063] = arg0[local1];
			this.aByteArray100[this.anInt5391 * 874858063 + 1] = arg0[local1 + 1];
			local1 += 2;
			this.anInt5391 += 1606426974;
			this.anInt5391 = this.anInt5391 * 874858063 % this.aByteArray100.length * 803213487;
			this.anInt5393 -= 1924034382;
		}
	}

	@OriginalMember(owner = "client!th", name = "k", descriptor = "()I", line = 550)
	int method31316() {
		return this.anInt5393 * 46530583;
	}

	@OriginalMember(owner = "client!th", name = "w", descriptor = "()I", line = 550)
	int method31317() {
		return this.anInt5393 * 46530583;
	}

	@OriginalMember(owner = "client!th", name = "n", descriptor = "(I)I", line = 550)
	int method31318(@OriginalArg(0) int arg0) {
		return this.anInt5393 * 46530583;
	}

	@OriginalMember(owner = "client!th", name = "f", descriptor = "()I", line = 550)
	int method31319() {
		return this.anInt5393 * 46530583;
	}

	@OriginalMember(owner = "client!th", name = "m", descriptor = "()I", line = 550)
	int method31320() {
		return this.anInt5393 * 46530583;
	}

	@OriginalMember(owner = "client!th", name = "l", descriptor = "()I", line = 550)
	int method31321() {
		return this.anInt5393 * 46530583;
	}

	@OriginalMember(owner = "client!th", name = "st", descriptor = "(Lclient!yf;I)V", line = 8245)
	static final void method31322(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local11.anInt4001 * 1553054515 == 1 ? local11.anInt4037 * 371778301 : -1;
	}
}
