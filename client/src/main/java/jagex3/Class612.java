package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vf")
public final class Class612 implements SerializableEnum {

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
	final int anInt5787;

	@OriginalMember(owner = "client!vf", name = "l", descriptor = "()[Lclient!vf;")
	public static Class612[] method32232() {
		return new Class612[] { aClass612_1, aClass612_5, aClass612_6, aClass612_2, aClass612_3, aClass612_4 };
	}

	@OriginalMember(owner = "client!vf", name = "m", descriptor = "()[Lclient!vf;")
	public static Class612[] method32233() {
		return new Class612[] { aClass612_1, aClass612_5, aClass612_6, aClass612_2, aClass612_3, aClass612_4 };
	}

	@OriginalMember(owner = "client!vf", name = "f", descriptor = "()[Lclient!vf;")
	public static Class612[] method32234() {
		return new Class612[] { aClass612_1, aClass612_5, aClass612_6, aClass612_2, aClass612_3, aClass612_4 };
	}

	@OriginalMember(owner = "client!vf", name = "w", descriptor = "()[Lclient!vf;")
	public static Class612[] method32235() {
		return new Class612[] { aClass612_1, aClass612_5, aClass612_6, aClass612_2, aClass612_3, aClass612_4 };
	}

	@OriginalMember(owner = "client!vf", name = "og", descriptor = "(Lclient!yf;I)V")
	static void method32236(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class166_Sub17.method15730(local11, local14, arg0, 1319817073);
	}

	@OriginalMember(owner = "client!vf", name = "aj", descriptor = "(Lclient!dh;I)V")
	static void method32237(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
		if (Class454.anInt5203 * -1838307953 < 2 && !client.aBoolean627 || client.aClass312_5 != null) {
			return;
		}
		@Pc(34) String local34;
		if (client.aBoolean627 && Class454.anInt5203 * -1838307953 < 2) {
			local34 = client.aString145 + Class74.aClass74_140.method1259(Class106.aClass717_8, (byte) -1) + client.aString142 + " " + Class430.aString215;
		} else if (Class527.method30567((byte) 2) && Class454.anInt5203 * -1838307953 > 2) {
			local34 = Class110_Sub21.method8544(Class112_Sub1_Sub1.aClass93_Sub1_Sub7_4, -1497248091);
		} else {
			@Pc(50) Class93_Sub1_Sub7 local50 = Class112_Sub1_Sub1.aClass93_Sub1_Sub7_4;
			if (local50 == null) {
				return;
			}
			local34 = Class110_Sub21.method8544(local50, -1497248091);
			@Pc(61) int[] local61 = Class477.method29887(local50, 1408003611);
			if (local61 != null) {
				local34 = local34 + Class7.method122(local61, 1959719843);
			}
		}
		if (Class454.anInt5203 * -1838307953 > 2) {
			local34 = local34 + Class306.method26916(16777215, -412140771) + " / " + (Class454.anInt5203 * -1838307953 - 2) + Class74.aClass74_132.method1259(Class106.aClass717_8, (byte) -70);
		}
		if (Class454.aClass312_11 == null) {
			return;
		}
		@Pc(111) Class106 local111 = Class454.aClass312_11.method26943(Class157.aClass462_2, client.anInterface50_1, (short) 22768);
		if (local111 == null) {
			local111 = Class118_Sub1.aClass106_3;
		}
		local111.method7543(local34, Class454.anInt5208 * 1467602627, Class454.anInt5209 * 1788229895, Class454.aClass312_11.anInt4022 * 1215292027, Class454.aClass312_11.anInt4023 * -1490598249, Class454.aClass312_11.anInt4034 * 969124391, Class454.aClass312_11.anInt4039 * 1581456827, Class454.aClass312_11.anInt4041 * 589611627, Class454.aClass312_11.anInt4065 * 515253515, client.aRandom2, Class106.anInt891, client.anIntArray324, Class110_Sub14.aClass100Array4, null, -975084524);
		Class269.method26366(client.anIntArray324[0], client.anIntArray324[1], client.anIntArray324[2], client.anIntArray324[3], (byte) -77);
	}

	@OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(I)V")
	Class612(@OriginalArg(0) int arg0) {
		this.anInt5787 = arg0 * 1706841623;
	}

	@OriginalMember(owner = "client!vf", name = "n", descriptor = "()I")
	@Override
	public int getId() {
		return this.anInt5787 * 653803943;
	}

}
