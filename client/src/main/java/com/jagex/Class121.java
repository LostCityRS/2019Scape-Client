package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jk")
public class Class121 implements Interface33 {

	@OriginalMember(owner = "client!jk", name = "tg", descriptor = "Lclient!akr;")
	public static Class93_Sub28 aClass93_Sub28_2;

	@OriginalMember(owner = "client!jk", name = "ml", descriptor = "I")
	public static int anInt1003;

	@OriginalMember(owner = "client!jk", name = "m", descriptor = "Lclient!cm;")
	Class100 aClass100_8;

	@OriginalMember(owner = "client!jk", name = "n", descriptor = "Lclient!py;")
	final Class497 aClass497_29;

	@OriginalMember(owner = "client!jk", name = "e", descriptor = "Lclient!la;")
	final Class133 aClass133_2;

	@OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(Lclient!py;Lclient!la;)V", line = 14)
	Class121(@OriginalArg(0) Class497 arg0, @OriginalArg(1) Class133 arg1) {
		this.aClass497_29 = arg0;
		this.aClass133_2 = arg1;
	}

	@OriginalMember(owner = "client!jk", name = "e", descriptor = "(I)V", line = 20)
	@Override
	public void method28280(@OriginalArg(0) int arg0) {
		this.aClass100_8 = Class219.method25510(this.aClass497_29, this.aClass133_2.anInt1133 * 716586081, (byte) 123);
	}

	@OriginalMember(owner = "client!jk", name = "w", descriptor = "()V", line = 20)
	@Override
	public void method28283() {
		this.aClass100_8 = Class219.method25510(this.aClass497_29, this.aClass133_2.anInt1133 * 716586081, (byte) 39);
	}

	@OriginalMember(owner = "client!jk", name = "l", descriptor = "()V", line = 20)
	@Override
	public void method28284() {
		this.aClass100_8 = Class219.method25510(this.aClass497_29, this.aClass133_2.anInt1133 * 716586081, (byte) 21);
	}

	@OriginalMember(owner = "client!jk", name = "f", descriptor = "(Z)V", line = 24)
	@Override
	public void method28282(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			@Pc(19) int local19 = this.aClass133_2.aClass390_6.method28274(this.aClass100_8.method18160(), client.anInt3511 * 2040043391, 1164798639) + this.aClass133_2.anInt1131 * -1599175185;
			@Pc(37) int local37 = this.aClass133_2.aClass392_6.method28291(this.aClass100_8.method18193(), client.anInt3512 * -817449061, (short) 255) + this.aClass133_2.anInt1132 * -1271918157;
			this.aClass100_8.method18161(local19, local37);
		}
	}

	@OriginalMember(owner = "client!jk", name = "n", descriptor = "(ZI)V", line = 24)
	@Override
	public void method28285(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		if (arg0) {
			@Pc(19) int local19 = this.aClass133_2.aClass390_6.method28274(this.aClass100_8.method18160(), client.anInt3511 * 2040043391, 1457087606) + this.aClass133_2.anInt1131 * -1599175185;
			@Pc(37) int local37 = this.aClass133_2.aClass392_6.method28291(this.aClass100_8.method18193(), client.anInt3512 * -817449061, (short) 255) + this.aClass133_2.anInt1132 * -1271918157;
			this.aClass100_8.method18161(local19, local37);
		}
	}

	@OriginalMember(owner = "client!jk", name = "k", descriptor = "(Z)V", line = 24)
	@Override
	public void method28281(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			@Pc(19) int local19 = this.aClass133_2.aClass390_6.method28274(this.aClass100_8.method18160(), client.anInt3511 * 2040043391, -940416657) + this.aClass133_2.anInt1131 * -1599175185;
			@Pc(37) int local37 = this.aClass133_2.aClass392_6.method28291(this.aClass100_8.method18193(), client.anInt3512 * -817449061, (short) 255) + this.aClass133_2.anInt1132 * -1271918157;
			this.aClass100_8.method18161(local19, local37);
		}
	}

	@OriginalMember(owner = "client!jk", name = "m", descriptor = "(I)Z", line = 32)
	@Override
	public boolean method28279(@OriginalArg(0) int arg0) {
		return this.aClass497_29.method30071(this.aClass133_2.anInt1133 * 716586081, -512225963);
	}

	@OriginalMember(owner = "client!jk", name = "u", descriptor = "()Z", line = 32)
	@Override
	public boolean method28278() {
		return this.aClass497_29.method30071(this.aClass133_2.anInt1133 * 716586081, -512225963);
	}

	@OriginalMember(owner = "client!jk", name = "k", descriptor = "(I)I", line = 69)
	public static int method8704(@OriginalArg(0) int arg0) {
		if (Class31.anInt106 * 617648335 == -1) {
			@Pc(7) Class31[] local7 = Class286.method26524((byte) 16);
			for (@Pc(9) int local9 = 0; local9 < local7.length; local9++) {
				@Pc(17) Class31 local17 = local7[local9];
				if (local17.anInt107 * 291237409 > Class31.anInt106 * 617648335) {
					Class31.anInt106 = local17.anInt107 * -670175729;
				}
			}
			Class31.anInt106 += 1462400559;
		}
		return Class31.anInt106 * 617648335;
	}

	@OriginalMember(owner = "client!jk", name = "k", descriptor = "([J[IB)V", line = 74)
	public static void method8705(@OriginalArg(0) long[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) byte arg2) {
		Class550.method31029(arg0, arg1, 0, arg0.length - 1, -1505408746);
	}

	@OriginalMember(owner = "client!jk", name = "cf", descriptor = "(Lclient!yf;I)V", line = 5387)
	static final void method8706(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32808(local12, 1099080475);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class166_Sub46.method16538(local16, local22, arg0, 306638118);
	}

	@OriginalMember(owner = "client!jk", name = "yc", descriptor = "(Lclient!yf;B)V", line = 9355)
	static final void method8707(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class454.anInt5042 * -1838307953;
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class454.anInt5039 * -2074084977;
	}

	@OriginalMember(owner = "client!jk", name = "acp", descriptor = "(Lclient!yf;I)V", line = 10020)
	static final void method8708(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = arg0.aClass386_3.aBooleanArray30[local12] ? 1 : 0;
	}

	@OriginalMember(owner = "client!jk", name = "aqa", descriptor = "(Lclient!yf;B)V", line = 12880)
	static final void method8709(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5891 -= 1189701933;
		arg0.anInt5891 -= 1189701933;
		arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = "";
		arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = "";
		arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = "";
		arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = "";
		arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = "";
		arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = "";
		arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = "";
		arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = "";
		arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = "";
	}
}
