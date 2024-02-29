package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gw")
public final class Class302 implements SerializableEnum {

	@OriginalMember(owner = "client!gw", name = "e", descriptor = "Lclient!gw;")
	static final Class302 aClass302_8 = new Class302(2, 100);

	@OriginalMember(owner = "client!gw", name = "n", descriptor = "Lclient!gw;")
	static final Class302 aClass302_2 = new Class302(16, 101);

	@OriginalMember(owner = "client!gw", name = "m", descriptor = "Lclient!gw;")
	static final Class302 aClass302_3 = new Class302(8, 102);

	@OriginalMember(owner = "client!gw", name = "k", descriptor = "Lclient!gw;")
	static final Class302 aClass302_4 = new Class302(5, 103);

	@OriginalMember(owner = "client!gw", name = "f", descriptor = "Lclient!gw;")
	static final Class302 aClass302_5 = new Class302(3, 104);

	@OriginalMember(owner = "client!gw", name = "w", descriptor = "Lclient!gw;")
	static final Class302 aClass302_17 = new Class302(1, 105);

	@OriginalMember(owner = "client!gw", name = "l", descriptor = "Lclient!gw;")
	static final Class302 aClass302_15 = new Class302(11, 106);

	@OriginalMember(owner = "client!gw", name = "u", descriptor = "Lclient!gw;")
	static final Class302 aClass302_6 = new Class302(7, 107);

	@OriginalMember(owner = "client!gw", name = "z", descriptor = "Lclient!gw;")
	static final Class302 aClass302_9 = new Class302(6, 108);

	@OriginalMember(owner = "client!gw", name = "p", descriptor = "Lclient!gw;")
	static final Class302 aClass302_11 = new Class302(14, 109);

	@OriginalMember(owner = "client!gw", name = "d", descriptor = "Lclient!gw;")
	static final Class302 aClass302_18 = new Class302(0, 110);

	@OriginalMember(owner = "client!gw", name = "c", descriptor = "Lclient!gw;")
	static final Class302 aClass302_12 = new Class302(4, 111);

	@OriginalMember(owner = "client!gw", name = "r", descriptor = "Lclient!gw;")
	static final Class302 aClass302_13 = new Class302(12, 112);

	@OriginalMember(owner = "client!gw", name = "v", descriptor = "Lclient!gw;")
	static final Class302 aClass302_14 = new Class302(13, 113);

	@OriginalMember(owner = "client!gw", name = "o", descriptor = "Lclient!gw;")
	static final Class302 aClass302_7 = new Class302(17, 114);

	@OriginalMember(owner = "client!gw", name = "s", descriptor = "Lclient!gw;")
	static final Class302 aClass302_16 = new Class302(15, 115);

	@OriginalMember(owner = "client!gw", name = "y", descriptor = "Lclient!gw;")
	static final Class302 aClass302_1 = new Class302(10, 116);

	@OriginalMember(owner = "client!gw", name = "q", descriptor = "Lclient!gw;")
	static final Class302 aClass302_10 = new Class302(9, 117);

	@OriginalMember(owner = "client!gw", name = "x", descriptor = "I")
	final int anInt3974;

	@OriginalMember(owner = "client!gw", name = "b", descriptor = "I")
	final int anInt3973;

	@OriginalMember(owner = "client!gw", name = "m", descriptor = "()[Lclient!gw;")
	static Class302[] method26829() {
		return new Class302[] { aClass302_16, aClass302_5, aClass302_1, aClass302_14, aClass302_10, aClass302_2, aClass302_18, aClass302_17, aClass302_4, aClass302_7, aClass302_9, aClass302_6, aClass302_3, aClass302_13, aClass302_15, aClass302_12, aClass302_8, aClass302_11 };
	}

	@OriginalMember(owner = "client!gw", name = "ma", descriptor = "(Lclient!yf;I)V")
	static void method26830(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32986(local12, 1356389664);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class123_Sub1.method9094(local16, local22, arg0, (byte) 0);
	}

	@OriginalMember(owner = "client!gw", name = "mk", descriptor = "(IIIIIIIIIIIIIIZIII)V")
	static void method26831(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17) {
		if (arg1 != 0 && arg3 != -1) {
			@Pc(7) Class132_Sub1_Sub1_Sub1 local7 = null;
			@Pc(14) int local14;
			if (arg1 < 0) {
				local14 = -arg1 - 1;
				if (local14 == client.anInt3513 * -859840571) {
					local7 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3;
				} else {
					local7 = client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[local14];
				}
			} else {
				local14 = arg1 - 1;
				@Pc(37) Class93_Sub15 local37 = (Class93_Sub15) client.aClass16_18.method215((long) local14);
				if (local37 != null) {
					local7 = (Class132_Sub1_Sub1_Sub1) local37.anObject5;
				}
			}
			if (local7 != null) {
				@Pc(50) Class622 local50 = local7.method19978(470642541);
				if (local50.anIntArrayArray65 != null && local50.anIntArrayArray65[arg3] != null) {
					arg4 -= local50.anIntArrayArray65[arg3][1];
				}
				if (local50.anIntArrayArray64 != null && local50.anIntArrayArray64[arg3] != null) {
					arg4 -= local50.anIntArrayArray64[arg3][1];
				}
			}
		}
		@Pc(111) Class132_Sub1_Sub1_Sub4 local111 = new Class132_Sub1_Sub1_Sub4(client.aClass532_1.method30640(-1676828513), arg0, arg16, arg16, arg6, arg7, arg4, client.anInt3485 + arg10, client.anInt3485 + arg11, arg12, arg13, arg1, arg2, arg5, arg14, arg3, arg15);
		local111.method23925(arg8, arg9, Class305.method26894(arg8, arg9, arg16, (byte) -20) - arg5, client.anInt3485 + arg10, -1488185361);
		client.aClass22_46.method407(new Class93_Sub1_Sub6(local111), -1734998803);
	}

	@OriginalMember(owner = "client!gw", name = "avz", descriptor = "(Lclient!yf;I)V")
	static void method26832(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6052 -= 463840436;
		client.aShort155 = (short) arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		if (client.aShort155 <= 0) {
			client.aShort155 = 1;
		}
		client.aShort156 = (short) arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		if (client.aShort156 <= 0) {
			client.aShort156 = 32767;
		} else if (client.aShort156 < client.aShort155) {
			client.aShort156 = client.aShort155;
		}
		client.aShort150 = (short) arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 2];
		if (client.aShort150 <= 0) {
			client.aShort150 = 1;
		}
		client.aShort151 = (short) arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 3];
		if (client.aShort151 <= 0) {
			client.aShort151 = 32767;
		} else if (client.aShort151 < client.aShort150) {
			client.aShort151 = client.aShort150;
		}
	}

	@OriginalMember(owner = "client!gw", name = "<init>", descriptor = "(II)V")
	Class302(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3974 = arg0 * -1373136625;
		this.anInt3973 = arg1 * -1267620133;
	}

	@OriginalMember(owner = "client!gw", name = "n", descriptor = "()I")
	@Override
	public int getId() {
		return this.anInt3973 * -549460653;
	}
}
