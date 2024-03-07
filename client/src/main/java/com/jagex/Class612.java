package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vf")
public class Class612 implements Interface75 {

	@OriginalMember(owner = "client!vf", name = "e", descriptor = "Lclient!vf;")
	static final Class612 aClass612_4 = new Class612(0);

	@OriginalMember(owner = "client!vf", name = "n", descriptor = "Lclient!vf;")
	static final Class612 aClass612_5 = new Class612(1);

	@OriginalMember(owner = "client!vf", name = "m", descriptor = "Lclient!vf;")
	static final Class612 aClass612_3 = new Class612(2);

	@OriginalMember(owner = "client!vf", name = "k", descriptor = "Lclient!vf;")
	static final Class612 aClass612_2 = new Class612(3);

	@OriginalMember(owner = "client!vf", name = "f", descriptor = "Lclient!vf;")
	static final Class612 aClass612_6 = new Class612(4);

	@OriginalMember(owner = "client!vf", name = "w", descriptor = "Lclient!vf;")
	static final Class612 aClass612_1 = new Class612(5);

	@OriginalMember(owner = "client!vf", name = "l", descriptor = "I")
	final int anInt5626;

	@OriginalMember(owner = "client!vf", name = "l", descriptor = "()[Lclient!vf;", line = 17)
	public static Class612[] method32051() {
		return new Class612[] { aClass612_1, aClass612_5, aClass612_6, aClass612_2, aClass612_3, aClass612_4 };
	}

	@OriginalMember(owner = "client!vf", name = "m", descriptor = "()[Lclient!vf;", line = 17)
	public static Class612[] method32052() {
		return new Class612[] { aClass612_1, aClass612_5, aClass612_6, aClass612_2, aClass612_3, aClass612_4 };
	}

	@OriginalMember(owner = "client!vf", name = "f", descriptor = "()[Lclient!vf;", line = 17)
	public static Class612[] method32053() {
		return new Class612[] { aClass612_1, aClass612_5, aClass612_6, aClass612_2, aClass612_3, aClass612_4 };
	}

	@OriginalMember(owner = "client!vf", name = "w", descriptor = "()[Lclient!vf;", line = 17)
	public static Class612[] method32054() {
		return new Class612[] { aClass612_1, aClass612_5, aClass612_6, aClass612_2, aClass612_3, aClass612_4 };
	}

	@OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(I)V", line = 20)
	Class612(@OriginalArg(0) int arg0) {
		this.anInt5626 = arg0 * 1706841623;
	}

	@OriginalMember(owner = "client!vf", name = "n", descriptor = "()I", line = 25)
	@Override
	public int getId() {
		return this.anInt5626 * 653803943;
	}

	@OriginalMember(owner = "client!vf", name = "k", descriptor = "()I", line = 25)
	@Override
	public int method36919() {
		return this.anInt5626 * 653803943;
	}

	@OriginalMember(owner = "client!vf", name = "aj", descriptor = "(Lclient!dh;I)V", line = 1124)
	static void method32055(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
		if (Class454.anInt5042 * -1838307953 < 2 && !client.aBoolean625 || client.aClass312_5 != null) {
			return;
		}
		@Pc(34) String local34;
		if (client.aBoolean625 && Class454.anInt5042 * -1838307953 < 2) {
			local34 = client.aString145 + Class74.aClass74_140.method1259(Class106.lang, (byte) -1) + client.aString142 + " " + Class430.aString206;
		} else if (Class527.method30387((byte) 2) && Class454.anInt5042 * -1838307953 > 2) {
			local34 = Class110_Sub21.method8544(Class112_Sub1_Sub1.aClass93_Sub1_Sub7_4, -1497248091);
		} else {
			@Pc(50) Class93_Sub1_Sub7 local50 = Class112_Sub1_Sub1.aClass93_Sub1_Sub7_4;
			if (local50 == null) {
				return;
			}
			local34 = Class110_Sub21.method8544(local50, -1497248091);
			@Pc(61) int[] local61 = Class477.method29703(local50, 1408003611);
			if (local61 != null) {
				local34 = local34 + Class7.method122(local61, 1959719843);
			}
		}
		if (Class454.anInt5042 * -1838307953 > 2) {
			local34 = local34 + Class306.method26804(16777215, -412140771) + " / " + (Class454.anInt5042 * -1838307953 - 2) + Class74.aClass74_132.method1259(Class106.lang, (byte) -70);
		}
		if (Class454.aClass312_11 == null) {
			return;
		}
		@Pc(111) Class106 local111 = Class454.aClass312_11.method26867(Class157.aClass462_2, client.anInterface50_1, (short) 22768);
		if (local111 == null) {
			local111 = Class118_Sub1.aClass106_3;
		}
		local111.method7551(local34, Class454.anInt5047 * 1467602627, Class454.anInt5048 * 1788229895, Class454.aClass312_11.anInt3981 * 1215292027, Class454.aClass312_11.anInt3982 * -1490598249, Class454.aClass312_11.anInt3993 * 969124391, Class454.aClass312_11.anInt3998 * 1581456827, Class454.aClass312_11.anInt4000 * 589611627, Class454.aClass312_11.anInt4024 * 515253515, client.aRandom2, Class106.anInt891, client.anIntArray324, Class110_Sub14.aClass100Array4, null, -975084524);
		Class269.method26274(client.anIntArray324[0], client.anIntArray324[1], client.anIntArray324[2], client.anIntArray324[3], (byte) -77);
	}

	@OriginalMember(owner = "client!vf", name = "og", descriptor = "(Lclient!yf;I)V", line = 7630)
	static final void method32056(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class166_Sub17.method15719(local11, local14, arg0, 1319817073);
	}
}
