package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qv")
class Class518 implements Interface55 {

	@OriginalMember(owner = "client!qv", name = "k", descriptor = "[Ljava/lang/String;")
	static String[] aStringArray31;

	// $FF: synthetic field
	@OriginalMember(owner = "client!qv", name = "this$0", descriptor = "Lclient!rw;")
	final Class539 this$0;

	@OriginalMember(owner = "client!qv", name = "w", descriptor = "(Lclient!yf;I)V", line = 40)
	static void method30304(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class523.method30368(1533752489);
	}

	@OriginalMember(owner = "client!qv", name = "<init>", descriptor = "(Lclient!rw;)V", line = 177)
	Class518(@OriginalArg(0) Class539 arg0) {
		this.this$0 = arg0;
	}

	@OriginalMember(owner = "client!qv", name = "f", descriptor = "(I)[B", line = 179)
	@Override
	public byte[] method30303(@OriginalArg(0) int arg0) {
		return this.this$0.anInterface70_1.method32529(arg0, 2143137984);
	}

	@OriginalMember(owner = "client!qv", name = "e", descriptor = "(II)[B", line = 179)
	@Override
	public byte[] method30299(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.this$0.anInterface70_1.method32529(arg0, 1956415903);
	}

	@OriginalMember(owner = "client!qv", name = "n", descriptor = "(I)[B", line = 179)
	@Override
	public byte[] method30301(@OriginalArg(0) int arg0) {
		return this.this$0.anInterface70_1.method32529(arg0, 624182526);
	}

	@OriginalMember(owner = "client!qv", name = "m", descriptor = "(I)[B", line = 179)
	@Override
	public byte[] method30300(@OriginalArg(0) int arg0) {
		return this.this$0.anInterface70_1.method32529(arg0, 1768591814);
	}

	@OriginalMember(owner = "client!qv", name = "k", descriptor = "(I)[B", line = 179)
	@Override
	public byte[] method30302(@OriginalArg(0) int arg0) {
		return this.this$0.anInterface70_1.method32529(arg0, 959715862);
	}

	@OriginalMember(owner = "client!qv", name = "iz", descriptor = "(IIII)V", line = 9417)
	public static void method30305(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class611 local3 = client.world.method30455(1708149186);
		@Pc(10) int local10 = arg1 + local3.anInt5623 * 270611681;
		@Pc(17) int local17 = local3.anInt5624 * -1994307635 + arg2;
		if (client.world.method30481(-1692526925) == null || client.world.method30443(-1000241849) == Class526.aClass526_2 || arg1 < 0 || arg2 < 0 || arg1 >= client.world.method30459(978808638) || arg2 >= client.world.method30466((short) 128)) {
			return;
		}
		@Pc(52) long local52 = (long) (arg0 << 28 | local17 << 14 | local10);
		@Pc(57) Class93_Sub5 local57 = (Class93_Sub5) client.aClass16_20.method214(local52);
		if (local57 == null) {
			client.world.method30481(-1541129926).method31522(arg0, arg1, arg2, (byte) 0);
			return;
		}
		@Pc(75) Class93_Sub3 local75 = (Class93_Sub3) local57.aClass22_17.method428((byte) 102);
		if (local75 == null) {
			client.world.method30481(-1343606828).method31522(arg0, arg1, arg2, (byte) 0);
			return;
		}
		@Pc(89) int local89 = -1;
		@Pc(91) int local91 = -1;
		@Pc(93) int local93 = -1;
		@Pc(95) Class470 local95 = null;
		@Pc(97) Class470 local97 = null;
		@Pc(99) Class470 local99 = null;
		@Pc(109) Class132_Sub1_Sub5_Sub1 local109 = (Class132_Sub1_Sub5_Sub1) client.world.method30481(-1363026273).method31522(arg0, arg1, arg2, (byte) 0);
		if (local109 == null) {
			local109 = new Class132_Sub1_Sub5_Sub1(client.world.method30481(-1098561897), arg1 << 9, client.world.method30481(-1889998591).aClass99Array1[arg0].method2480(arg1, arg2, -1141511953), arg2 << 9, arg0, arg0);
		} else {
			local89 = local109.anInt3286 * 1294558559;
			local91 = local109.anInt3278 * -272885985;
			local93 = local109.anInt3281 * 836911837;
			local95 = local109.aClass470_45;
			local97 = local109.aClass470_44;
			local99 = local109.aClass470_46;
			local109.anInt3281 = -185312629;
			local109.anInt3278 = 2136431393;
			local109.aClass585_23 = client.world.method30481(-1964126979);
		}
		local109.anInt3286 = local75.anInt1405 * 1268505773;
		local109.anInt3279 = local75.anInt1404 * -549461587;
		label98: while (true) {
			@Pc(193) Class93_Sub3 local193 = (Class93_Sub3) local57.aClass22_17.method442(1362255592);
			if (local193 == null) {
				break;
			}
			if (local109.anInt3286 * 1294558559 != local193.anInt1405 * -308533965) {
				local109.anInt3278 = local193.anInt1405 * -330230931;
				local109.anInt3280 = local193.anInt1404 * 896366505;
				while (true) {
					@Pc(225) Class93_Sub3 local225 = (Class93_Sub3) local57.aClass22_17.method442(1599807272);
					if (local225 == null) {
						break label98;
					}
					if (local225.anInt1405 * -308533965 != local109.anInt3286 * 1294558559 && local225.anInt1405 * -308533965 != local109.anInt3278 * -272885985) {
						local109.anInt3281 = local225.anInt1405 * 109567823;
						local109.anInt3289 = local225.anInt1404 * -766503931;
					}
				}
			}
		}
		@Pc(274) int local274 = Class305.method26802((arg1 << 9) + 256, (arg2 << 9) + 256, arg0, (byte) -114);
		local109.method24244((float) (arg1 << 9), (float) local274, (float) (arg2 << 9));
		if (local109.anInt3286 * 1294558559 != local89) {
			if (local109.anInt3286 * 1294558559 == local91) {
				local109.aClass470_45 = local97;
			} else if (local93 == local109.anInt3286 * 1294558559) {
				local109.aClass470_45 = local99;
			} else if (((Class47) Class277.aClass32_Sub12_1.get(local109.anInt3286 * 1294558559, -1696530306)).aBoolean24) {
				local109.aClass470_45 = Class75.method1267((byte) 23);
			} else {
				local109.aClass470_45 = null;
			}
		}
		if (local109.anInt3278 * -272885985 == -1) {
			local109.aClass470_44 = null;
		} else if (local91 != local109.anInt3278 * -272885985) {
			if (local89 == local109.anInt3278 * -272885985) {
				local109.aClass470_44 = local95;
			} else if (local93 == local109.anInt3278 * -272885985) {
				local109.aClass470_44 = local99;
			} else if (((Class47) Class277.aClass32_Sub12_1.get(local109.anInt3278 * -272885985, 210096574)).aBoolean24) {
				local109.aClass470_44 = Class75.method1267((byte) 33);
			} else {
				local109.aClass470_44 = null;
			}
		}
		if (local109.anInt3281 * 836911837 == -1) {
			local109.aClass470_46 = null;
		} else if (local109.anInt3281 * 836911837 != local93) {
			if (local109.anInt3281 * 836911837 == local89) {
				local109.aClass470_46 = local95;
			} else if (local91 == local109.anInt3281 * 836911837) {
				local109.aClass470_46 = local97;
			} else if (((Class47) Class277.aClass32_Sub12_1.get(local109.anInt3281 * 836911837, 540921999)).aBoolean24) {
				local109.aClass470_46 = Class75.method1267((byte) 38);
			} else {
				local109.aClass470_46 = null;
			}
		}
		local109.anInt3284 = 0;
		local109.aByte100 = (byte) arg0;
		local109.aByte99 = (byte) arg0;
		if (client.world.method30487(-1897195293).method30330(arg1, arg2, -662808309)) {
			local109.aByte99++;
		}
		client.world.method30481(-1861143396).method31484(arg0, arg1, arg2, local274, local109, (short) 4365);
	}

	@OriginalMember(owner = "client!qv", name = "aef", descriptor = "(Lclient!yf;I)V", line = 10387)
	static final void method30306(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= -725861497;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		@Pc(33) int local33 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 2];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class258.method26027(local13, local23, local33, 2046032822);
	}
}