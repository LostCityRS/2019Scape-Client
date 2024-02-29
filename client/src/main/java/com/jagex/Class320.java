package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hq")
public class Class320 {

	@OriginalMember(owner = "client!hq", name = "bb", descriptor = "Ljava/lang/String;")
	public static String aString173;

	@OriginalMember(owner = "client!hq", name = "tf", descriptor = "B")
	public static byte aByte129;

	@OriginalMember(owner = "client!hq", name = "n", descriptor = "[Lclient!hf;")
	Class312[] aClass312Array4;

	@OriginalMember(owner = "client!hq", name = "e", descriptor = "[Lclient!hf;")
	public Class312[] aClass312Array3;

	@OriginalMember(owner = "client!hq", name = "m", descriptor = "Z")
	public boolean aBoolean708;

	@OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(Z[Lclient!hf;)V", line = 8)
	Class320(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class312[] arg1) {
		this.aClass312Array3 = arg1;
		this.aBoolean708 = arg0;
	}

	@OriginalMember(owner = "client!hq", name = "f", descriptor = "()[Lclient!hf;", line = 14)
	public Class312[] method27226() {
		return this.aClass312Array4 == null ? this.aClass312Array3 : this.aClass312Array4;
	}

	@OriginalMember(owner = "client!hq", name = "e", descriptor = "(I)[Lclient!hf;", line = 14)
	public Class312[] method27227(@OriginalArg(0) int arg0) {
		return this.aClass312Array4 == null ? this.aClass312Array3 : this.aClass312Array4;
	}

	@OriginalMember(owner = "client!hq", name = "k", descriptor = "()[Lclient!hf;", line = 14)
	public Class312[] method27228() {
		return this.aClass312Array4 == null ? this.aClass312Array3 : this.aClass312Array4;
	}

	@OriginalMember(owner = "client!hq", name = "w", descriptor = "()[Lclient!hf;", line = 14)
	public Class312[] method27229() {
		return this.aClass312Array4 == null ? this.aClass312Array3 : this.aClass312Array4;
	}

	@OriginalMember(owner = "client!hq", name = "l", descriptor = "()[Lclient!hf;", line = 18)
	public Class312[] method27230() {
		if (this.aClass312Array4 == null) {
			@Pc(7) int local7 = this.aClass312Array3.length;
			this.aClass312Array4 = new Class312[local7];
			System.arraycopy(this.aClass312Array3, 0, this.aClass312Array4, 0, this.aClass312Array3.length);
		}
		return this.aClass312Array4;
	}

	@OriginalMember(owner = "client!hq", name = "u", descriptor = "()[Lclient!hf;", line = 18)
	public Class312[] method27231() {
		if (this.aClass312Array4 == null) {
			@Pc(7) int local7 = this.aClass312Array3.length;
			this.aClass312Array4 = new Class312[local7];
			System.arraycopy(this.aClass312Array3, 0, this.aClass312Array4, 0, this.aClass312Array3.length);
		}
		return this.aClass312Array4;
	}

	@OriginalMember(owner = "client!hq", name = "z", descriptor = "()[Lclient!hf;", line = 18)
	public Class312[] method27232() {
		if (this.aClass312Array4 == null) {
			@Pc(7) int local7 = this.aClass312Array3.length;
			this.aClass312Array4 = new Class312[local7];
			System.arraycopy(this.aClass312Array3, 0, this.aClass312Array4, 0, this.aClass312Array3.length);
		}
		return this.aClass312Array4;
	}

	@OriginalMember(owner = "client!hq", name = "n", descriptor = "(I)[Lclient!hf;", line = 18)
	public Class312[] method27233(@OriginalArg(0) int arg0) {
		if (this.aClass312Array4 == null) {
			@Pc(7) int local7 = this.aClass312Array3.length;
			this.aClass312Array4 = new Class312[local7];
			System.arraycopy(this.aClass312Array3, 0, this.aClass312Array4, 0, this.aClass312Array3.length);
		}
		return this.aClass312Array4;
	}

	@OriginalMember(owner = "client!hq", name = "m", descriptor = "(II)Lclient!hf;", line = 27)
	public Class312 method27234(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 >>> 16 != this.aClass312Array3[0].anInt3953 * -1549590237 >>> 16) {
			throw new IllegalArgumentException();
		}
		return this.aClass312Array3[arg0 & 0xFFFF];
	}

	@OriginalMember(owner = "client!hq", name = "p", descriptor = "(I)Lclient!hf;", line = 27)
	public Class312 method27235(@OriginalArg(0) int arg0) {
		if (arg0 >>> 16 != this.aClass312Array3[0].anInt3953 * -1549590237 >>> 16) {
			throw new IllegalArgumentException();
		}
		return this.aClass312Array3[arg0 & 0xFFFF];
	}

	@OriginalMember(owner = "client!hq", name = "c", descriptor = "(I)Lclient!hf;", line = 27)
	public Class312 method27236(@OriginalArg(0) int arg0) {
		if (arg0 >>> 16 != this.aClass312Array3[0].anInt3953 * -1549590237 >>> 16) {
			throw new IllegalArgumentException();
		}
		return this.aClass312Array3[arg0 & 0xFFFF];
	}

	@OriginalMember(owner = "client!hq", name = "d", descriptor = "(I)Lclient!hf;", line = 27)
	public Class312 method27237(@OriginalArg(0) int arg0) {
		if (arg0 >>> 16 != this.aClass312Array3[0].anInt3953 * -1549590237 >>> 16) {
			throw new IllegalArgumentException();
		}
		return this.aClass312Array3[arg0 & 0xFFFF];
	}

	@OriginalMember(owner = "client!hq", name = "f", descriptor = "(ZI)V", line = 90)
	public static void method27238(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!hq", name = "ts", descriptor = "(Lclient!yf;I)V", line = 8471)
	static final void method27239(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		Class229.method25621(local11, arg0, (byte) 27);
	}

	@OriginalMember(owner = "client!hq", name = "anc", descriptor = "(Lclient!yf;Lclient!ahm;I)V", line = 12350)
	static final void method27240(@OriginalArg(0) Class681 arg0, @OriginalArg(1) Class132_Sub1_Sub1_Sub1 arg1, @OriginalArg(2) int arg2) {
		arg0.anInt5891 -= 463840436;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		@Pc(33) int local33 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 2];
		@Pc(48) boolean local48 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 3] == 1;
		if (Class65.aClass123_Sub1_2.method9020((byte) -38) != Class338.aClass338_4) {
			throw new RuntimeException();
		}
		@Pc(62) Class25_Sub5 local62 = (Class25_Sub5) Class65.aClass123_Sub1_2.method9017(485843479);
		if (arg1 != null) {
			local62.method16472(arg1, new Class472((float) local13, (float) local23, (float) local33), local48, 2095475210);
		}
		client.aBoolean619 = true;
	}
}
