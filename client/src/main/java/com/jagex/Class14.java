package com.jagex;

import java.util.Map;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aal")
public class Class14 {

	@OriginalMember(owner = "client!aal", name = "gg", descriptor = "Ljava/util/Map;")
	public static Map aMap1;

	@OriginalMember(owner = "client!aal", name = "k", descriptor = "I")
	int anInt48;

	@OriginalMember(owner = "client!aal", name = "e", descriptor = "I")
	public int anInt49;

	@OriginalMember(owner = "client!aal", name = "n", descriptor = "I")
	public int anInt50;

	@OriginalMember(owner = "client!aal", name = "m", descriptor = "I")
	public int anInt51;

	@OriginalMember(owner = "client!aal", name = "<init>", descriptor = "()V", line = 10)
	Class14() {
	}

	@OriginalMember(owner = "client!aal", name = "e", descriptor = "(JII)Ljava/lang/String;", line = 30)
	public static String method192(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Class337.method27454(arg0);
		@Pc(5) int local5 = Class69.aCalendar1.get(5);
		@Pc(9) int local9 = Class69.aCalendar1.get(2);
		@Pc(13) int local13 = Class69.aCalendar1.get(1);
		return arg1 == 3 ? Class474.method29664(arg0, arg1, (byte) -115) : Integer.toString(local5 / 10) + local5 % 10 + "-" + Class69.aStringArrayArray1[arg1][local9] + "-" + local13;
	}

	@OriginalMember(owner = "client!aal", name = "n", descriptor = "(IIZI)I", line = 37)
	public static int method193(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class93_Sub6 local4 = Class557.method31064(arg0, arg2, (short) 255);
		if (local4 == null) {
			return 0;
		} else if (arg1 >= 0 && arg1 < local4.anIntArray174.length) {
			return local4.anIntArray174[arg1];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!aal", name = "ahr", descriptor = "(Lclient!yf;I)V", line = 10839)
	static final void method194(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = ((Class47) Class277.aClass32_Sub12_1.get(local12, -1790603482)).anInt139 * 415441565;
	}

	@OriginalMember(owner = "client!aal", name = "aow", descriptor = "(Lclient!yf;I)V", line = 12427)
	static final void method195(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		if (!Class65.aClass123_Sub1_2.method9020((byte) -80).method27465((byte) 1)) {
			throw new RuntimeException();
		}
		@Pc(14) Class25_Sub4 local14 = (Class25_Sub4) Class65.aClass123_Sub1_2.method9017(-1633922274);
		local14.method23138(Class382.aClass479_2, -1, 0.0F, -678450998);
		client.aBoolean619 = true;
	}
}
