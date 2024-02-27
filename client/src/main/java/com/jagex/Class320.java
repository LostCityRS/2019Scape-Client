package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hq")
public final class Class320 {

	@OriginalMember(owner = "client!hq", name = "bb", descriptor = "Ljava/lang/String;")
	public static String aString179;

	@OriginalMember(owner = "client!hq", name = "tf", descriptor = "B")
	public static byte aByte129;

	@OriginalMember(owner = "client!hq", name = "n", descriptor = "[Lclient!hf;")
	Class312[] aClass312Array4;

	@OriginalMember(owner = "client!hq", name = "e", descriptor = "[Lclient!hf;")
	public Class312[] aClass312Array3;

	@OriginalMember(owner = "client!hq", name = "m", descriptor = "Z")
	public boolean aBoolean712;

	@OriginalMember(owner = "client!hq", name = "f", descriptor = "(ZI)V")
	public static void method27331(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!hq", name = "ts", descriptor = "(Lclient!yf;I)V")
	static void method27332(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		Class229.method25713(local11, arg0, (byte) 27);
	}

	@OriginalMember(owner = "client!hq", name = "anc", descriptor = "(Lclient!yf;Lclient!ahm;I)V")
	static void method27333(@OriginalArg(0) Class681 arg0, @OriginalArg(1) Class132_Sub1_Sub1_Sub1 arg1, @OriginalArg(2) int arg2) {
		arg0.anInt6052 -= 463840436;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		@Pc(33) int local33 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 2];
		@Pc(48) boolean local48 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 3] == 1;
		if (Class65.aClass123_Sub1_2.method8986((byte) -38) != Class338.aClass338_4) {
			throw new RuntimeException();
		}
		@Pc(62) Class25_Sub5 local62 = (Class25_Sub5) Class65.aClass123_Sub1_2.method9040(485843479);
		if (arg1 != null) {
			local62.method16485(arg1, new Class472((float) local13, (float) local23, (float) local33), local48, 2095475210);
		}
		client.aBoolean621 = true;
	}

	@OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(Z[Lclient!hf;)V")
	Class320(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class312[] arg1) {
		this.aClass312Array3 = arg1;
		this.aBoolean712 = arg0;
	}

	@OriginalMember(owner = "client!hq", name = "f", descriptor = "()[Lclient!hf;")
	public Class312[] method27319() {
		return this.aClass312Array4 == null ? this.aClass312Array3 : this.aClass312Array4;
	}

	@OriginalMember(owner = "client!hq", name = "e", descriptor = "(I)[Lclient!hf;")
	public Class312[] method27320(@OriginalArg(0) int arg0) {
		return this.aClass312Array4 == null ? this.aClass312Array3 : this.aClass312Array4;
	}

	@OriginalMember(owner = "client!hq", name = "m", descriptor = "(II)Lclient!hf;")
	public Class312 method27321(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 >>> 16 != this.aClass312Array3[0].anInt3994 * -1549590237 >>> 16) {
			throw new IllegalArgumentException();
		}
		return this.aClass312Array3[arg0 & 0xFFFF];
	}

	@OriginalMember(owner = "client!hq", name = "k", descriptor = "()[Lclient!hf;")
	public Class312[] method27322() {
		return this.aClass312Array4 == null ? this.aClass312Array3 : this.aClass312Array4;
	}

	@OriginalMember(owner = "client!hq", name = "p", descriptor = "(I)Lclient!hf;")
	public Class312 method27323(@OriginalArg(0) int arg0) {
		if (arg0 >>> 16 != this.aClass312Array3[0].anInt3994 * -1549590237 >>> 16) {
			throw new IllegalArgumentException();
		}
		return this.aClass312Array3[arg0 & 0xFFFF];
	}

	@OriginalMember(owner = "client!hq", name = "w", descriptor = "()[Lclient!hf;")
	public Class312[] method27324() {
		return this.aClass312Array4 == null ? this.aClass312Array3 : this.aClass312Array4;
	}

	@OriginalMember(owner = "client!hq", name = "l", descriptor = "()[Lclient!hf;")
	public Class312[] method27325() {
		if (this.aClass312Array4 == null) {
			@Pc(7) int local7 = this.aClass312Array3.length;
			this.aClass312Array4 = new Class312[local7];
			System.arraycopy(this.aClass312Array3, 0, this.aClass312Array4, 0, this.aClass312Array3.length);
		}
		return this.aClass312Array4;
	}

	@OriginalMember(owner = "client!hq", name = "u", descriptor = "()[Lclient!hf;")
	public Class312[] method27326() {
		if (this.aClass312Array4 == null) {
			@Pc(7) int local7 = this.aClass312Array3.length;
			this.aClass312Array4 = new Class312[local7];
			System.arraycopy(this.aClass312Array3, 0, this.aClass312Array4, 0, this.aClass312Array3.length);
		}
		return this.aClass312Array4;
	}

	@OriginalMember(owner = "client!hq", name = "z", descriptor = "()[Lclient!hf;")
	public Class312[] method27327() {
		if (this.aClass312Array4 == null) {
			@Pc(7) int local7 = this.aClass312Array3.length;
			this.aClass312Array4 = new Class312[local7];
			System.arraycopy(this.aClass312Array3, 0, this.aClass312Array4, 0, this.aClass312Array3.length);
		}
		return this.aClass312Array4;
	}

	@OriginalMember(owner = "client!hq", name = "c", descriptor = "(I)Lclient!hf;")
	public Class312 method27328(@OriginalArg(0) int arg0) {
		if (arg0 >>> 16 != this.aClass312Array3[0].anInt3994 * -1549590237 >>> 16) {
			throw new IllegalArgumentException();
		}
		return this.aClass312Array3[arg0 & 0xFFFF];
	}

	@OriginalMember(owner = "client!hq", name = "n", descriptor = "(I)[Lclient!hf;")
	public Class312[] method27329(@OriginalArg(0) int arg0) {
		if (this.aClass312Array4 == null) {
			@Pc(7) int local7 = this.aClass312Array3.length;
			this.aClass312Array4 = new Class312[local7];
			System.arraycopy(this.aClass312Array3, 0, this.aClass312Array4, 0, this.aClass312Array3.length);
		}
		return this.aClass312Array4;
	}

	@OriginalMember(owner = "client!hq", name = "d", descriptor = "(I)Lclient!hf;")
	public Class312 method27330(@OriginalArg(0) int arg0) {
		if (arg0 >>> 16 != this.aClass312Array3[0].anInt3994 * -1549590237 >>> 16) {
			throw new IllegalArgumentException();
		}
		return this.aClass312Array3[arg0 & 0xFFFF];
	}
}
