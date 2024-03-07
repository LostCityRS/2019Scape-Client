package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qe")
public class Class138 implements Interface75 {

	@OriginalMember(owner = "client!qe", name = "cu", descriptor = "I")
	public static int anInt1383;

	@OriginalMember(owner = "client!qe", name = "e", descriptor = "Lclient!qe;")
	public static final Class138 aClass138_65 = new Class138_Sub1(Class667.aClass667_78, 0, true, true);

	@OriginalMember(owner = "client!qe", name = "n", descriptor = "Lclient!qe;")
	public static final Class138 aClass138_67 = new Class138_Sub5(Class667.aClass667_87, 1, false, true);

	@OriginalMember(owner = "client!qe", name = "m", descriptor = "Lclient!qe;")
	public static final Class138 aClass138_63 = new Class138_Sub4(Class667.aClass667_88, 2, true, true);

	@OriginalMember(owner = "client!qe", name = "k", descriptor = "Lclient!qe;")
	static final Class138 aClass138_64 = new Class138_Sub3(Class667.aClass667_89, 3, false, false);

	@OriginalMember(owner = "client!qe", name = "f", descriptor = "Lclient!qe;")
	static final Class138 aClass138_66 = new Class138(Class667.aClass667_90, 4, false, false);

	@OriginalMember(owner = "client!qe", name = "w", descriptor = "Lclient!qe;")
	public static final Class138 aClass138_72 = new Class138(Class667.aClass667_105, 5, true, true);

	@OriginalMember(owner = "client!qe", name = "l", descriptor = "Lclient!qe;")
	public static final Class138 aClass138_71 = new Class138(Class667.aClass667_94, 6, true, true);

	@OriginalMember(owner = "client!qe", name = "u", descriptor = "Lclient!qe;")
	public static final Class138 aClass138_68 = new Class138(Class667.aClass667_91, 7, true, false);

	@OriginalMember(owner = "client!qe", name = "z", descriptor = "Lclient!qe;")
	static final Class138 aClass138_69 = new Class138_Sub2(Class667.aClass667_93, 8, false, false);

	@OriginalMember(owner = "client!qe", name = "p", descriptor = "Lclient!qe;")
	public static final Class138 aClass138_70 = new Class138(Class667.aClass667_80, 9, false, true);

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "Lclient!qe;")
	static final Class138 aClass138_62 = new Class138(Class667.aClass667_107, 10, false, false);

	@OriginalMember(owner = "client!qe", name = "r", descriptor = "I")
	final int anInt1382;

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "Lclient!xq;")
	final Class667 aClass667_8;

	// $FF: synthetic method
	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Lclient!xq;IZZLclient!aib;)V", line = 22)
	Class138(@OriginalArg(0) Class667 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class138_Sub1 arg4) {
		this(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "()[Lclient!qe;", line = 63)
	public static Class138[] method11520() {
		return new Class138[] { aClass138_70, aClass138_68, aClass138_69, aClass138_62, aClass138_65, aClass138_63, aClass138_66, aClass138_72, aClass138_64, aClass138_67, aClass138_71 };
	}

	@OriginalMember(owner = "client!qe", name = "z", descriptor = "()[Lclient!qe;", line = 63)
	public static Class138[] method11521() {
		return new Class138[] { aClass138_70, aClass138_68, aClass138_69, aClass138_62, aClass138_65, aClass138_63, aClass138_66, aClass138_72, aClass138_64, aClass138_67, aClass138_71 };
	}

	@OriginalMember(owner = "client!qe", name = "e", descriptor = "(I)[Lclient!qe;", line = 63)
	public static Class138[] method11522(@OriginalArg(0) int arg0) {
		return new Class138[] { aClass138_70, aClass138_68, aClass138_69, aClass138_62, aClass138_65, aClass138_63, aClass138_66, aClass138_72, aClass138_64, aClass138_67, aClass138_71 };
	}

	@OriginalMember(owner = "client!qe", name = "p", descriptor = "()[Lclient!qe;", line = 63)
	public static Class138[] method11523() {
		return new Class138[] { aClass138_70, aClass138_68, aClass138_69, aClass138_62, aClass138_65, aClass138_63, aClass138_66, aClass138_72, aClass138_64, aClass138_67, aClass138_71 };
	}

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Lclient!xq;IZZ)V", line = 66)
	Class138(@OriginalArg(0) Class667 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		this.aClass667_8 = arg0;
		this.anInt1382 = arg1 * -1097325223;
	}

	@OriginalMember(owner = "client!qe", name = "m", descriptor = "(B)Lclient!xq;", line = 72)
	public final Class667 method11524(@OriginalArg(0) byte arg0) {
		return this.aClass667_8;
	}

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "()Lclient!xq;", line = 72)
	public final Class667 method11525() {
		return this.aClass667_8;
	}

	@OriginalMember(owner = "client!qe", name = "r", descriptor = "()Lclient!xq;", line = 72)
	public final Class667 method11526() {
		return this.aClass667_8;
	}

	@OriginalMember(owner = "client!qe", name = "v", descriptor = "()Lclient!xq;", line = 72)
	public final Class667 method11527() {
		return this.aClass667_8;
	}

	@OriginalMember(owner = "client!qe", name = "n", descriptor = "()I", line = 76)
	@Override
	public int getId() {
		return this.anInt1382 * 2090586857;
	}

	@OriginalMember(owner = "client!qe", name = "k", descriptor = "()I", line = 76)
	@Override
	public int method36919() {
		return this.anInt1382 * 2090586857;
	}

	@OriginalMember(owner = "client!qe", name = "f", descriptor = "(Lclient!ec;B)Ljava/lang/Object;", line = 80)
	public Object method11528(@OriginalArg(0) Class108 arg0, @OriginalArg(1) byte arg1) {
		return arg0.aBoolean173 ? this.method11531(arg0, 27720345) : arg0.aClass519_6.method30319(657683700);
	}

	@OriginalMember(owner = "client!qe", name = "o", descriptor = "(Lclient!ec;)Ljava/lang/Object;", line = 80)
	public Object method11529(@OriginalArg(0) Class108 arg0) {
		return arg0.aBoolean173 ? this.method11531(arg0, 27720345) : arg0.aClass519_6.method30319(657683700);
	}

	@OriginalMember(owner = "client!qe", name = "s", descriptor = "(Lclient!ec;)Ljava/lang/Object;", line = 80)
	public Object method11530(@OriginalArg(0) Class108 arg0) {
		return arg0.aBoolean173 ? this.method11531(arg0, 27720345) : arg0.aClass519_6.method30319(657683700);
	}

	@OriginalMember(owner = "client!qe", name = "w", descriptor = "(Lclient!ec;I)Ljava/lang/Object;", line = 85)
	Object method11531(@OriginalArg(0) Class108 arg0, @OriginalArg(1) int arg1) {
		return arg0.aClass519_6.method30319(657683700);
	}

	@OriginalMember(owner = "client!qe", name = "u", descriptor = "(Lclient!ec;)Ljava/lang/Object;", line = 85)
	Object method11532(@OriginalArg(0) Class108 arg0) {
		return arg0.aClass519_6.method30319(657683700);
	}

	@OriginalMember(owner = "client!qe", name = "l", descriptor = "(Lclient!ec;)Ljava/lang/Object;", line = 85)
	Object method11533(@OriginalArg(0) Class108 arg0) {
		return arg0.aClass519_6.method30319(657683700);
	}

	@OriginalMember(owner = "client!qe", name = "p", descriptor = "(IZB)V", line = 145)
	static void method11534(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte arg2) {
		@Pc(4) Class93_Sub6 local4 = Class557.method31064(arg0, arg1, (short) 255);
		if (local4 == null) {
			return;
		}
		for (@Pc(10) int local10 = 0; local10 < local4.anIntArray173.length; local10++) {
			local4.anIntArray173[local10] = -1;
			local4.anIntArray174[local10] = 0;
		}
		local4.aClass40Array1 = null;
	}

	@OriginalMember(owner = "client!qe", name = "eq", descriptor = "(ZI)V", line = 1931)
	public static void method11535(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		if (arg0) {
			if (client.anInt3526 * -703563959 != -1) {
				Class535.method30697(client.anInt3526 * -703563959, 2123689163);
			}
			for (@Pc(16) Class93_Sub40 local16 = (Class93_Sub40) client.aClass16_22.method227((byte) 31); local16 != null; local16 = (Class93_Sub40) client.aClass16_22.method229(2127698728)) {
				if (!local16.method23970(-2007414972)) {
					local16 = (Class93_Sub40) client.aClass16_22.method227((byte) -82);
					if (local16 == null) {
						break;
					}
				}
				Class372.method28019(local16, true, false, 1923291343);
			}
			client.anInt3526 = -823798521;
			client.aClass16_22 = new Class16(8);
			Class361.method27805((byte) -46);
			client.anInt3526 = Class93_Sub26.aClass645_15.anInt5766 * 1630912889;
			if (client.anInt3526 * -703563959 != -1) {
				Class618.method32103(false, -1814616275);
				Class635.method32440((short) 255);
				Class56.method18034(client.anInt3526 * -703563959, null, -311790733);
			}
		}
		Class692.method36595((byte) -40);
		Class65.aClass123_Sub1_2.method8922(true, (byte) -25);
		Class411.aBoolean752 = false;
		Class548.method31011((byte) 1);
		client.anInt3520 = 410366683;
		Class696.method36644(client.anInt3555 * 225035861, 785682939);
		Class520.selfPlayer = new Class132_Sub1_Sub1_Sub1_Sub2(null);
		client.aMap18.clear();
		Class520.selfPlayer.method24244((float) (client.world.method30459(750691944) * 512 / 2), 0.0F, (float) (client.world.method30466((short) 128) * 512 / 2));
		Class520.selfPlayer.anIntArray240[0] = client.world.method30459(668145533) / 2;
		Class520.selfPlayer.anIntArray239[0] = client.world.method30466((short) 128) / 2;
		Class270.anInt3884 = 0;
		Class163.anInt2002 = 0;
		if (Class429.anInt4781 * -1453926679 == 5) {
			Class163.anInt2002 = (Class26.anInt90 * -877893825 << 9) * 1636217271;
			Class270.anInt3884 = (Class20.anInt70 * 390649993 << 9) * -967471741;
		} else {
			Class631.method32281(1251129319);
		}
		client.world.method30494((byte) 16).method33015(1086101290);
	}

	@OriginalMember(owner = "client!qe", name = "bb", descriptor = "(ZLclient!yf;B)V", line = 5159)
	static final void method11536(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class681 arg1, @OriginalArg(2) byte arg2) {
		@Pc(12) int local12 = arg1.anIntArray519[(arg1.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32808(local12, 829506846);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		if (arg0) {
			Class240.method25871(local22, local16, (short) -15699);
		} else {
			Class337.method27459(local22, local16, 2136484877);
		}
	}

	@OriginalMember(owner = "client!qe", name = "vm", descriptor = "(Lclient!yf;I)V", line = 8835)
	static final void method11537(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		@Pc(32) Class677 local32 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		Class125_Sub1.method9215(local32.aClass312_13, local13, local23, 1359108582);
	}

	@OriginalMember(owner = "client!qe", name = "ali", descriptor = "(Lclient!yf;B)V", line = 11788)
	static final void method11538(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		Class373.method28020(1643192011);
	}

	@OriginalMember(owner = "client!qe", name = "aoa", descriptor = "(Lclient!yf;I)V", line = 12587)
	static final void method11539(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) throws Exception_Sub3 {
		arg0.anInt5891 -= -1915563430;
		@Pc(18) boolean local18 = arg0.anIntArray519[arg0.anInt5891 * -1497248091] == 1;
		@Pc(33) boolean local33 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1] == 1;
		Class65.aClass123_Sub1_2.method8988(local18, local33, 1906509690);
	}
}
