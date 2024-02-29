package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ku")
public final class Class389 implements Interface33 {

	@OriginalMember(owner = "client!ku", name = "m", descriptor = "Lclient!cm;")
	Class100 aClass100_43;

	@OriginalMember(owner = "client!ku", name = "n", descriptor = "Lclient!py;")
	final Class497 aClass497_113;

	@OriginalMember(owner = "client!ku", name = "e", descriptor = "Lclient!li;")
	final Class398 aClass398_1;

	@OriginalMember(owner = "client!ku", name = "k", descriptor = "(IIII)V")
	public static void method28444(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Class370.method28176(new Class53_Sub1(arg0, arg1, arg2, client.anInt3451 * 555943359, Class520.aClass144_3.anInt1338 * 1582435851, Class520.aClass144_3.anInt1337 * 446642039, Class520.aClass144_3.method11146(-1999613021), Class520.aClass144_3.method11162(-771229500), Class477.aClass480_2.method29915(-385607886)), -2031366575);
	}

	@OriginalMember(owner = "client!ku", name = "ly", descriptor = "(Lclient!yf;B)V")
	static void method28445(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32986(local12, 55046256);
		Class314.method27030(local16, arg0, -412761498);
	}

	@OriginalMember(owner = "client!ku", name = "amz", descriptor = "(Lclient!yf;I)V")
	static void method28446(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		Class119.method8603(-1311816136);
	}

	@OriginalMember(owner = "client!ku", name = "ac", descriptor = "(B)V")
	public static void method28447(@OriginalArg(0) byte arg0) {
		Class531.method30616(273005801);
	}

	@OriginalMember(owner = "client!ku", name = "k", descriptor = "(Lclient!alw;I)Lclient!kp;")
	public static Class125 method28448(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class125 local3 = Class32_Sub4.method16739(arg0, -423624971);
		@Pc(7) int local7 = arg0.method22431(-118643075);
		@Pc(11) int local11 = arg0.method22431(-118643075);
		@Pc(15) int local15 = arg0.method22448(-1258003561);
		return new Class125_Sub1(local3.aClass390_7, local3.aClass392_7, local3.anInt2981 * 483768335, local3.anInt2982 * 2099407685, local3.anInt2983 * 1135283731, local3.anInt2980 * -1017655207, local3.anInt2985 * -1946839755, local3.anInt2986 * -1726029297, local3.anInt2984 * 291173831, local7, local11, local15);
	}

	@OriginalMember(owner = "client!ku", name = "afw", descriptor = "(Lclient!yf;I)V")
	static void method28449(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6049 -= 1915061582;
		@Pc(14) String local14 = (String) arg0.anObjectArray45[arg0.anInt6049 * 587908375];
		@Pc(25) String local25 = (String) arg0.anObjectArray45[arg0.anInt6049 * 587908375 + 1];
		if (arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091] == 1) {
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = local14;
		} else {
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = local25;
		}
	}

	@OriginalMember(owner = "client!ku", name = "y", descriptor = "(IB)V")
	static void method28450(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		Class93_Sub6.anInt1444 = arg0 * -2047869623;
		Class93_Sub6.aClass240_19.method25926((byte) -82);
	}

	@OriginalMember(owner = "client!ku", name = "qm", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;I)V")
	static void method28451(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) int arg3) {
		@Pc(13) String local13 = (String) arg2.anObjectArray45[(arg2.anInt6049 -= 957530791) * 587908375];
		if (Class532.method30778(local13, arg2, 1518522314) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray8 = Class499.method30329(local13, arg2, 2023375430);
		arg0.aBoolean684 = true;
	}

	@OriginalMember(owner = "client!ku", name = "afc", descriptor = "(Lclient!yf;B)V")
	static void method28452(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt6049 -= 1915061582;
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class488.method30002((String) arg0.anObjectArray45[arg0.anInt6049 * 587908375], (String) arg0.anObjectArray45[arg0.anInt6049 * 587908375 + 1], Class106.aClass717_8, -1678452234);
	}

	@OriginalMember(owner = "client!ku", name = "b", descriptor = "(IB)Ljava/lang/String;")
	static String method28453(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return "<col=" + Integer.toHexString(arg0) + ">";
	}

	@OriginalMember(owner = "client!ku", name = "<init>", descriptor = "(Lclient!py;Lclient!li;)V")
	Class389(@OriginalArg(0) Class497 arg0, @OriginalArg(1) Class398 arg1) {
		this.aClass497_113 = arg0;
		this.aClass398_1 = arg1;
	}

	@OriginalMember(owner = "client!ku", name = "w", descriptor = "()V")
	@Override
	public void method28464() {
		this.aClass100_43 = Class219.method25602(this.aClass497_113, this.aClass398_1.anInt4833 * 1316736809, (byte) 91);
	}

	@OriginalMember(owner = "client!ku", name = "e", descriptor = "(I)V")
	@Override
	public void method28461(@OriginalArg(0) int arg0) {
		this.aClass100_43 = Class219.method25602(this.aClass497_113, this.aClass398_1.anInt4833 * 1316736809, (byte) 90);
	}

	@OriginalMember(owner = "client!ku", name = "k", descriptor = "(Z)V")
	@Override
	public void method28462(@OriginalArg(0) boolean arg0) {
		if (!arg0) {
			return;
		}
		@Pc(16) int local16 = Class553.anInt3408 * -1378711501 > client.anInt3511 * 2040043391 ? Class553.anInt3408 * -1378711501 : client.anInt3511 * 2040043391;
		@Pc(31) int local31 = Class553.anInt3416 * 2091353777 > client.anInt3512 * -817449061 ? Class553.anInt3416 * 2091353777 : client.anInt3512 * -817449061;
		@Pc(35) int local35 = this.aClass100_43.method18172();
		@Pc(39) int local39 = this.aClass100_43.method18178();
		@Pc(41) int local41 = 0;
		@Pc(43) int local43 = local16;
		@Pc(49) int local49 = local39 * local16 / local35;
		@Pc(55) int local55 = (local31 - local49) / 2;
		if (local49 > local31) {
			local55 = 0;
			local49 = local31;
			local43 = local35 * local31 / local39;
			local41 = (local16 - local43) / 2;
		}
		this.aClass100_43.method18215(local41, local55, local43, local49);
	}

	@OriginalMember(owner = "client!ku", name = "n", descriptor = "(ZI)V")
	@Override
	public void method28466(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		if (!arg0) {
			return;
		}
		@Pc(16) int local16 = Class553.anInt3408 * -1378711501 > client.anInt3511 * 2040043391 ? Class553.anInt3408 * -1378711501 : client.anInt3511 * 2040043391;
		@Pc(31) int local31 = Class553.anInt3416 * 2091353777 > client.anInt3512 * -817449061 ? Class553.anInt3416 * 2091353777 : client.anInt3512 * -817449061;
		@Pc(35) int local35 = this.aClass100_43.method18172();
		@Pc(39) int local39 = this.aClass100_43.method18178();
		@Pc(41) int local41 = 0;
		@Pc(43) int local43 = local16;
		@Pc(49) int local49 = local39 * local16 / local35;
		@Pc(55) int local55 = (local31 - local49) / 2;
		if (local49 > local31) {
			local55 = 0;
			local49 = local31;
			local43 = local35 * local31 / local39;
			local41 = (local16 - local43) / 2;
		}
		this.aClass100_43.method18215(local41, local55, local43, local49);
	}

	@OriginalMember(owner = "client!ku", name = "f", descriptor = "(Z)V")
	@Override
	public void method28463(@OriginalArg(0) boolean arg0) {
		if (!arg0) {
			return;
		}
		@Pc(16) int local16 = Class553.anInt3408 * -1378711501 > client.anInt3511 * 2040043391 ? Class553.anInt3408 * -1378711501 : client.anInt3511 * 2040043391;
		@Pc(31) int local31 = Class553.anInt3416 * 2091353777 > client.anInt3512 * -817449061 ? Class553.anInt3416 * 2091353777 : client.anInt3512 * -817449061;
		@Pc(35) int local35 = this.aClass100_43.method18172();
		@Pc(39) int local39 = this.aClass100_43.method18178();
		@Pc(41) int local41 = 0;
		@Pc(43) int local43 = local16;
		@Pc(49) int local49 = local39 * local16 / local35;
		@Pc(55) int local55 = (local31 - local49) / 2;
		if (local49 > local31) {
			local55 = 0;
			local49 = local31;
			local43 = local35 * local31 / local39;
			local41 = (local16 - local43) / 2;
		}
		this.aClass100_43.method18215(local41, local55, local43, local49);
	}

	@OriginalMember(owner = "client!ku", name = "m", descriptor = "(I)Z")
	@Override
	public boolean method28460(@OriginalArg(0) int arg0) {
		return this.aClass497_113.method30235(this.aClass398_1.anInt4833 * 1316736809, -512225963);
	}

	@OriginalMember(owner = "client!ku", name = "l", descriptor = "()V")
	@Override
	public void method28465() {
		this.aClass100_43 = Class219.method25602(this.aClass497_113, this.aClass398_1.anInt4833 * 1316736809, (byte) 121);
	}

	@OriginalMember(owner = "client!ku", name = "u", descriptor = "()Z")
	@Override
	public boolean method28459() {
		return this.aClass497_113.method30235(this.aClass398_1.anInt4833 * 1316736809, -512225963);
	}
}
