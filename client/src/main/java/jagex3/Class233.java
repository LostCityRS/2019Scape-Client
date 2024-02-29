package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dt")
public final class Class233 implements SerializableEnum {

	@OriginalMember(owner = "client!dt", name = "e", descriptor = "Lclient!dt;")
	static final Class233 aClass233_4 = new Class233(0, 0, null, 0);

	@OriginalMember(owner = "client!dt", name = "n", descriptor = "Lclient!dt;")
	static final Class233 aClass233_2 = new Class233(1, 1, null, 3);

	@OriginalMember(owner = "client!dt", name = "m", descriptor = "Lclient!dt;")
	static final Class233 aClass233_5 = new Class233(2, 2, null, 3);

	@OriginalMember(owner = "client!dt", name = "k", descriptor = "Lclient!dt;")
	static final Class233 aClass233_1 = new Class233(3, 3, null, 6);

	@OriginalMember(owner = "client!dt", name = "f", descriptor = "Lclient!dt;")
	static final Class233 aClass233_3 = new Class233(4, 4, null, 1);

	@OriginalMember(owner = "client!dt", name = "w", descriptor = "I")
	final int anInt3795;

	@OriginalMember(owner = "client!dt", name = "l", descriptor = "I")
	final int anInt3794;

	@OriginalMember(owner = "client!dt", name = "u", descriptor = "I")
	final int anInt3793;

	@OriginalMember(owner = "client!dt", name = "w", descriptor = "()[Lclient!dt;")
	static Class233[] method25821() {
		return new Class233[] { aClass233_4, aClass233_2, aClass233_5, aClass233_1, aClass233_3 };
	}

	@OriginalMember(owner = "client!dt", name = "l", descriptor = "(I)Lclient!dt;")
	static Class233 method25822(@OriginalArg(0) int arg0) {
		@Pc(6) Class233 local6 = (Class233) Class107.method18131(Class484.method29973(-71261155), arg0, -1915563430);
		if (local6 == null) {
			local6 = aClass233_4;
		}
		return local6;
	}

	@OriginalMember(owner = "client!dt", name = "u", descriptor = "(I)Lclient!dt;")
	static Class233 method25823(@OriginalArg(0) int arg0) {
		@Pc(6) Class233 local6 = (Class233) Class107.method18131(Class484.method29973(1675780644), arg0, -1915563430);
		if (local6 == null) {
			local6 = aClass233_4;
		}
		return local6;
	}

	@OriginalMember(owner = "client!dt", name = "gj", descriptor = "(Lclient!ahm;ZB)V")
	static void method25825(@OriginalArg(0) Class132_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte arg2) {
		@Pc(2) int local2 = Class707.aClass707_5.aByte176;
		@Pc(4) int local4 = 0;
		if (arg0.anInt2780 * -2095106181 > client.anInt3485) {
			Class20.method374(arg0, (short) 11954);
		} else if (arg0.anInt2762 * -1538623211 >= client.anInt3485) {
			Class391.method28470(arg0, 1709961333);
		} else {
			Class65.method1188(arg0, arg1, 869420465);
			local2 = Class279.anInt3933 * -1488124023;
			local4 = Class274.anInt3928 * -799220063;
		}
		@Pc(40) Class472 local40 = arg0.method24241().aClass472_61;
		@Pc(79) int local79;
		if ((int) local40.aFloat325 < 512 || (int) local40.aFloat327 < 512 || (int) local40.aFloat325 >= (client.aClass532_1.method30625(-1759365087) - 1) * 512 || (int) local40.aFloat327 >= (client.aClass532_1.method30655((short) 128) - 1) * 512) {
			arg0.aClass19_3.method23580(-1, 1232633249);
			for (local79 = 0; local79 < arg0.aClass554Array3.length; local79++) {
				arg0.aClass554Array3[local79].anInt5480 = 1020147287;
				arg0.aClass554Array3[local79].aClass19_7.method23580(-1, 264288096);
			}
			arg0.anIntArray236 = null;
			arg0.anInt2780 = 0;
			arg0.anInt2762 = 0;
			local2 = Class707.aClass707_5.aByte176;
			local4 = 0;
			arg0.method24243((float) (arg0.anIntArray240[0] * 512 + arg0.method20009(-446245406) * 256), local40.aFloat326, (float) (arg0.anIntArray239[0] * 512 + arg0.method20009(1874595208) * 256));
			arg0.method19986((byte) -87);
		}
		if (arg0 == Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3 && ((int) local40.aFloat325 < 6144 || (int) local40.aFloat327 < 6144 || (int) local40.aFloat325 >= (client.aClass532_1.method30625(540916552) - 12) * 512 || (int) local40.aFloat327 >= (client.aClass532_1.method30655((short) 128) - 12) * 512)) {
			arg0.aClass19_3.method23580(-1, 709870896);
			for (local79 = 0; local79 < arg0.aClass554Array3.length; local79++) {
				arg0.aClass554Array3[local79].anInt5480 = 1020147287;
				arg0.aClass554Array3[local79].aClass19_7.method23580(-1, 1624789129);
			}
			arg0.anIntArray236 = null;
			arg0.anInt2780 = 0;
			arg0.anInt2762 = 0;
			local2 = Class707.aClass707_5.aByte176;
			local4 = 0;
			arg0.method24243((float) (arg0.anIntArray240[0] * 512 + arg0.method20009(-932437891) * 256), local40.aFloat326, (float) (arg0.anIntArray239[0] * 512 + arg0.method20009(-1495544396) * 256));
			arg0.method19986((byte) -7);
		}
		local79 = Class721.method37102(arg0, (byte) -57);
		Class669.method33126(arg0, -648220126);
		BaseVarTypeString.method30382(arg0, local2, local4, local79, -1077736889);
		Class552.method31227(arg0, local2, (byte) 54);
		Class58.method1103(arg0, 749925756);
		@Pc(279) Class471 local279 = Class471.method29702();
		local279.method29648(Class464.method29463(arg0.aClass523_7.method30544(-1178491922)), Class464.method29463(arg0.aClass523_8.method30544(-351037450)), Class464.method29463(arg0.aClass523_9.method30544(1915370671)));
		arg0.method24261(local279);
		local279.method29640();
	}

	@OriginalMember(owner = "client!dt", name = "fh", descriptor = "(I)V")
	static void method25826(@OriginalArg(0) int arg0) {
		Class142_Sub1.method10991(Class694.aClass104_14, (byte) 0);
		if (BaseVarTypeComponentHook.anInt5370 * 1177442423 != client.anInt3559 * -1248097113) {
			Class262.method26266(2147444241);
		}
	}

	@OriginalMember(owner = "client!dt", name = "c", descriptor = "(Ljava/lang/String;ZI)V")
	public static void method25827(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (13 == client.anInt3435 * -849002901 && (!Class251.method26066(1137219895) && !Class631.method32463(-901725234))) {
			Class411.aString208 = arg0;
			Class411.aBoolean760 = arg1;
			Class481.method29937(15, 1823202236);
		}
	}

	@OriginalMember(owner = "client!dt", name = "<init>", descriptor = "(IILjava/lang/String;I)V")
	Class233(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) {
		this.anInt3795 = arg0 * 787426119;
		this.anInt3794 = arg1 * 877493057;
		this.anInt3793 = arg3 * 893274971;
	}

	@OriginalMember(owner = "client!dt", name = "p", descriptor = "()I")
	int method25819() {
		return this.anInt3793 * 2005986515;
	}

	@OriginalMember(owner = "client!dt", name = "f", descriptor = "(I)I")
	int method25820(@OriginalArg(0) int arg0) {
		return this.anInt3793 * 2005986515;
	}

	@OriginalMember(owner = "client!dt", name = "n", descriptor = "()I")
	@Override
	public int getId() {
		return this.anInt3794 * -1615522623;
	}

	@OriginalMember(owner = "client!dt", name = "z", descriptor = "()I")
	int method25824() {
		return this.anInt3793 * 2005986515;
	}
}
