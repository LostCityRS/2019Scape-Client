package com.jagex;

import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pg")
public class Class481 {

	@OriginalMember(owner = "client!pg", name = "w", descriptor = "I")
	static final int anInt5135 = 6;

	@OriginalMember(owner = "client!pg", name = "n", descriptor = "I")
	static final int anInt5136 = 1;

	@OriginalMember(owner = "client!pg", name = "m", descriptor = "I")
	static final int anInt5137 = 2;

	@OriginalMember(owner = "client!pg", name = "e", descriptor = "I")
	static final int anInt5138 = 0;

	@OriginalMember(owner = "client!pg", name = "f", descriptor = "I")
	static final int anInt5139 = 4;

	@OriginalMember(owner = "client!pg", name = "k", descriptor = "I")
	static final int anInt5140 = 3;

	@OriginalMember(owner = "client!pg", name = "l", descriptor = "I")
	static final int anInt5141 = 7;

	@OriginalMember(owner = "client!pg", name = "pq", descriptor = "I")
	public static int anInt5142;

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "()V", line = 12)
	Class481() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!pg", name = "e", descriptor = "(ZB)V", line = 15)
	public static void method29753(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte arg1) {
		Class274.aClass258_1.method26040((short) 29858);
		if (!Class106.method7570(client.anInt3435 * -849002901, -1132685789)) {
			return;
		}
		@Pc(11) Class175[] local11 = client.aClass175Array1;
		for (@Pc(13) int local13 = 0; local13 < local11.length; local13++) {
			@Pc(21) Class175 local21 = local11[local13];
			local21.anInt3300 += -1073519993;
			if (local21.anInt3300 * -1270889673 < 50 && !arg0) {
				return;
			}
			local21.anInt3300 = 0;
			if (!local21.aBoolean564 && local21.method24372((byte) 7) != null) {
				@Pc(52) Class93_Sub22 local52 = Class102.method2588(Class446.aClass446_105, local21.aClass24_2, (byte) 34);
				local21.method24356(local52, -1743193292);
				try {
					local21.method24352((byte) 60);
				} catch (@Pc(61) IOException local61) {
					local21.aBoolean564 = true;
				}
			}
		}
		Class274.aClass258_1.method26040((short) 4277);
	}

	@OriginalMember(owner = "client!pg", name = "m", descriptor = "(Lclient!acx;I)V", line = 28)
	public static void method29754(@OriginalArg(0) Class73 arg0, @OriginalArg(1) int arg1) {
		Class370.method27996(new Class599(arg0), -2102009315);
	}

	@OriginalMember(owner = "client!pg", name = "z", descriptor = "(II)I", line = 63)
	public static int method29755(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) Class339 local5 = (Class339) Class329.aMap21.get(arg0);
		return local5 == null ? 0 : local5.method27483((byte) 7);
	}

	@OriginalMember(owner = "client!pg", name = "ec", descriptor = "(II)V", line = 1784)
	public static void method29756(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (client.anInt3435 * -849002901 == arg0) {
			return;
		}
		client.anInt3494 = 0;
		if (client.anInt3435 * -849002901 == 18 && arg0 != 3) {
			Class570.method31313(-668282493);
		}
		if (arg0 == 14 || arg0 == 19) {
			Class378.method28070(1093128507);
		}
		if (arg0 != 14 && Class166_Sub20.aClass160_2 != null) {
			Class166_Sub20.aClass160_2.method14722(1212470322);
			Class166_Sub20.aClass160_2 = null;
		}
		if (arg0 == 4) {
			Class138.method11535(client.anInt3435 * -849002901 == 0 || client.anInt3435 * -849002901 == 12 || client.anInt3526 * -703563959 != Class93_Sub26.aClass645_15.anInt5766 * -221025663, -729963422);
			Class606.method31909(-1637013277);
		}
		@Pc(88) boolean local88;
		if (arg0 == 13) {
			if (Class93_Sub26.aClass645_15.anInt5768 * 1106038941 == -1) {
				local88 = client.anInt3435 * -849002901 == 17 || client.anInt3435 * -849002901 == 9;
			} else {
				local88 = client.anInt3526 * -703563959 != Class93_Sub26.aClass645_15.anInt5768 * 1106038941;
			}
			Class152.method14005(local88, -598022508);
		}
		if (arg0 == 17 || arg0 == 9) {
			if (!Class349.method27625((short) 25902)) {
				return;
			}
		} else if (arg0 == 7 || arg0 == 15 && client.anInt3435 * -849002901 != 16) {
			if (!Class378.method28070(1142325507)) {
				return;
			}
		} else if (arg0 == 12) {
			Class166_Sub6.method15481((byte) 37);
		}
		if (Class608.method31960(arg0, (byte) 101)) {
			client.aClass532_1.method30520(1213218812);
			client.aClass532_1.aLong287 = -1529257764138147785L;
		}
		if (arg0 == 3 || arg0 == 4) {
			Class277.method26360(815773506);
		}
		local88 = arg0 == 1 || Class1.method12(arg0, 1453479910) || Class56.method18036(arg0, -1497248091);
		@Pc(188) boolean local188 = client.anInt3435 * -849002901 == 1 || Class1.method12(client.anInt3435 * -849002901, -895984920) || Class56.method18036(client.anInt3435 * -849002901, -1497248091);
		if (local88 != local188) {
			Class520.aClass144_3.method11161(!local88, -1734631247);
		}
		if (Class608.method31960(arg0, (byte) 117) || arg0 == 14 || arg0 == 19) {
			Class694.aClass104_14.method20553();
		}
		client.anInt3435 = arg0 * 525893187;
	}
}
