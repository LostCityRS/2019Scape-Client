package jagex3;

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

	@OriginalMember(owner = "client!jk", name = "yc", descriptor = "(Lclient!yf;B)V")
	static void method8704(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class454.anInt5203 * -1838307953;
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class454.anInt5200 * -2074084977;
	}

	@OriginalMember(owner = "client!jk", name = "acp", descriptor = "(Lclient!yf;I)V")
	static void method8705(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = arg0.aClass386_3.aBooleanArray30[local12] ? 1 : 0;
	}

	@OriginalMember(owner = "client!jk", name = "aqa", descriptor = "(Lclient!yf;B)V")
	static void method8706(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt6052 -= 1189701933;
		arg0.anInt6052 -= 1189701933;
		arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = "";
		arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = "";
		arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = "";
		arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = "";
		arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = "";
		arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = "";
		arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = "";
		arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = "";
		arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = "";
	}

	@OriginalMember(owner = "client!jk", name = "k", descriptor = "([J[IB)V")
	public static void method8707(@OriginalArg(0) long[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) byte arg2) {
		Class550.method31209(arg0, arg1, 0, arg0.length - 1, -1505408746);
	}

	@OriginalMember(owner = "client!jk", name = "k", descriptor = "(I)I")
	public static int method8708(@OriginalArg(0) int arg0) {
		if (Class31.anInt106 * 617648335 == -1) {
			@Pc(7) Class31[] local7 = Class286.method26623((byte) 16);
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

	@OriginalMember(owner = "client!jk", name = "cf", descriptor = "(Lclient!yf;I)V")
	static void method8709(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32986(local12, 1099080475);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class166_Sub46.method16550(local16, local22, arg0, 306638118);
	}

	@OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(Lclient!py;Lclient!la;)V")
	Class121(@OriginalArg(0) Class497 arg0, @OriginalArg(1) Class133 arg1) {
		this.aClass497_29 = arg0;
		this.aClass133_2 = arg1;
	}

	@OriginalMember(owner = "client!jk", name = "f", descriptor = "(Z)V")
	@Override
	public void method28463(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			@Pc(19) int local19 = this.aClass133_2.aClass390_6.method28454(this.aClass100_8.method18172(), client.anInt3511 * 2040043391, 1164798639) + this.aClass133_2.anInt1131 * -1599175185;
			@Pc(37) int local37 = this.aClass133_2.aClass392_6.method28471(this.aClass100_8.method18178(), client.anInt3512 * -817449061, (short) 255) + this.aClass133_2.anInt1132 * -1271918157;
			this.aClass100_8.method18181(local19, local37);
		}
	}

	@OriginalMember(owner = "client!jk", name = "e", descriptor = "(I)V")
	@Override
	public final void method28461(@OriginalArg(0) int arg0) {
		this.aClass100_8 = Class219.method25602(this.aClass497_29, this.aClass133_2.anInt1133 * 716586081, (byte) 123);
	}

	@OriginalMember(owner = "client!jk", name = "n", descriptor = "(ZI)V")
	@Override
	public void method28466(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		if (arg0) {
			@Pc(19) int local19 = this.aClass133_2.aClass390_6.method28454(this.aClass100_8.method18172(), client.anInt3511 * 2040043391, 1457087606) + this.aClass133_2.anInt1131 * -1599175185;
			@Pc(37) int local37 = this.aClass133_2.aClass392_6.method28471(this.aClass100_8.method18178(), client.anInt3512 * -817449061, (short) 255) + this.aClass133_2.anInt1132 * -1271918157;
			this.aClass100_8.method18181(local19, local37);
		}
	}

	@OriginalMember(owner = "client!jk", name = "m", descriptor = "(I)Z")
	@Override
	public final boolean method28460(@OriginalArg(0) int arg0) {
		return this.aClass497_29.method30235(this.aClass133_2.anInt1133 * 716586081, -512225963);
	}

	@OriginalMember(owner = "client!jk", name = "k", descriptor = "(Z)V")
	@Override
	public void method28462(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			@Pc(19) int local19 = this.aClass133_2.aClass390_6.method28454(this.aClass100_8.method18172(), client.anInt3511 * 2040043391, -940416657) + this.aClass133_2.anInt1131 * -1599175185;
			@Pc(37) int local37 = this.aClass133_2.aClass392_6.method28471(this.aClass100_8.method18178(), client.anInt3512 * -817449061, (short) 255) + this.aClass133_2.anInt1132 * -1271918157;
			this.aClass100_8.method18181(local19, local37);
		}
	}

	@OriginalMember(owner = "client!jk", name = "w", descriptor = "()V")
	@Override
	public final void method28464() {
		this.aClass100_8 = Class219.method25602(this.aClass497_29, this.aClass133_2.anInt1133 * 716586081, (byte) 39);
	}

	@OriginalMember(owner = "client!jk", name = "l", descriptor = "()V")
	@Override
	public final void method28465() {
		this.aClass100_8 = Class219.method25602(this.aClass497_29, this.aClass133_2.anInt1133 * 716586081, (byte) 21);
	}

	@OriginalMember(owner = "client!jk", name = "u", descriptor = "()Z")
	@Override
	public final boolean method28459() {
		return this.aClass497_29.method30235(this.aClass133_2.anInt1133 * 716586081, -512225963);
	}
}
