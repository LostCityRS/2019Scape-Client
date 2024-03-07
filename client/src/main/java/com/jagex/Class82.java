package com.jagex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!adh")
public class Class82 {

	@OriginalMember(owner = "client!adh", name = "e", descriptor = "I")
	static final int anInt249 = 0;

	@OriginalMember(owner = "client!adh", name = "n", descriptor = "I")
	public static final int anInt250 = 0;

	@OriginalMember(owner = "client!adh", name = "ep", descriptor = "Lclient!uj;")
	public static Class153 aClass153_1;

	@OriginalMember(owner = "client!adh", name = "oe", descriptor = "I")
	public static int anInt251;

	@OriginalMember(owner = "client!adh", name = "q", descriptor = "Lclient!eu;")
	public static Class106 aClass106_1;

	@OriginalMember(owner = "client!adh", name = "k", descriptor = "Ljava/util/Map;")
	Map aMap5;

	@OriginalMember(owner = "client!adh", name = "m", descriptor = "Lclient!qa;")
	Class500 aClass500_1;

	@OriginalMember(owner = "client!adh", name = "<init>", descriptor = "(Lclient!py;II)V", line = 18)
	public Class82(@OriginalArg(0) Class497 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) byte[] local9 = arg0.method30064(arg1, arg2 + 1, (byte) 0);
		this.method1380(new Packet(local9), (byte) -1);
	}

	@OriginalMember(owner = "client!adh", name = "<init>", descriptor = "(Lclient!py;I)V", line = 23)
	public Class82(@OriginalArg(0) Class497 arg0, @OriginalArg(1) int arg1) {
		@Pc(7) byte[] local7 = arg0.method30064(arg1, 0, (byte) 0);
		this.method1380(new Packet(local7), (byte) -1);
	}

	@OriginalMember(owner = "client!adh", name = "e", descriptor = "(Lclient!alw;B)V", line = 29)
	void method1380(@OriginalArg(0) Packet arg0, @OriginalArg(1) byte arg1) {
		this.aClass500_1 = (Class500) Class107.method18116(Class500.method30156(-2085726699), arg0.g1((short) 16384), -1915563430);
		@Pc(13) int local13 = arg0.gVarInt2((short) -3184);
		this.aMap5 = new HashMap(local13);
		while (local13-- > 0) {
			@Pc(28) Object local28 = this.aClass500_1.method30163(arg0, (byte) 0);
			@Pc(32) int local32 = arg0.gVarInt2((short) -11628);
			@Pc(36) ArrayList local36 = new ArrayList();
			while (local32-- > 0) {
				@Pc(43) int local43 = arg0.gVarInt2((short) -1723);
				local36.add(local43);
			}
			this.aMap5.put(local28, local36);
		}
	}

	@OriginalMember(owner = "client!adh", name = "m", descriptor = "(Ljava/lang/Object;)Ljava/util/List;", line = 45)
	public List method1381(@OriginalArg(0) Object arg0) {
		return (List) this.aMap5.get(arg0);
	}

	@OriginalMember(owner = "client!adh", name = "n", descriptor = "(Ljava/lang/Object;I)Ljava/util/List;", line = 45)
	public List method1382(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		return (List) this.aMap5.get(arg0);
	}

	@OriginalMember(owner = "client!adh", name = "k", descriptor = "(Ljava/lang/Object;)Ljava/util/List;", line = 45)
	public List method1383(@OriginalArg(0) Object arg0) {
		return (List) this.aMap5.get(arg0);
	}

	@OriginalMember(owner = "client!adh", name = "k", descriptor = "(Ljava/lang/CharSequence;Lclient!adi;B)Ljava/lang/String;", line = 52)
	public static String method1384(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) Class83 arg1, @OriginalArg(2) byte arg2) {
		if (arg0 == null) {
			return null;
		}
		@Pc(6) int local6 = 0;
		@Pc(9) int local9 = arg0.length();
		while (local6 < local9 && Class573.method31342(arg0.charAt(local6), 1698427030)) {
			local6++;
		}
		while (local9 > local6 && Class573.method31342(arg0.charAt(local9 - 1), 1698427030)) {
			local9--;
		}
		@Pc(37) int local37 = local9 - local6;
		if (local37 < 1 || local37 > Class153.method14064(arg1, (byte) -109)) {
			return null;
		}
		@Pc(52) StringBuilder local52 = new StringBuilder(local37);
		for (@Pc(54) int local54 = local6; local54 < local9; local54++) {
			@Pc(61) char local61 = arg0.charAt(local54);
			if (Class687.method33488(local61, (byte) 0)) {
				@Pc(70) char local70 = Class549.method31024(local61, 2072969717);
				if (local70 != '\u0000') {
					local52.append(local70);
				}
			}
		}
		if (local52.length() == 0) {
			return null;
		} else {
			return local52.toString();
		}
	}

	@OriginalMember(owner = "client!adh", name = "jl", descriptor = "(ILjava/lang/String;I)V", line = 10074)
	public static void method1385(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = Class174.anInt3293 * -1081967415;
		@Pc(5) int[] local5 = Class174.anIntArray278;
		@Pc(7) boolean local7 = false;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			@Pc(18) Class132_Sub1_Sub1_Sub1_Sub2 local18 = client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[local5[local9]];
			if (local18 != null && local18 != Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3 && local18.aString82 != null && local18.aString82.equalsIgnoreCase(arg1)) {
				@Pc(35) Class446 local35 = null;
				if (arg0 == 1) {
					local35 = Class446.aClass446_119;
				} else if (arg0 == 2) {
					local35 = Class446.aClass446_25;
				} else if (arg0 == 3) {
					local35 = Class446.aClass446_78;
				} else if (arg0 == 4) {
					local35 = Class446.aClass446_104;
				} else if (arg0 == 5) {
					local35 = Class446.aClass446_6;
				} else if (arg0 == 6) {
					local35 = Class446.aClass446_64;
				} else if (arg0 == 7) {
					local35 = Class446.aClass446_40;
				} else if (arg0 == 8) {
					local35 = Class446.aClass446_50;
				} else if (arg0 == 9) {
					local35 = Class446.aClass446_91;
				} else if (arg0 == 10) {
					local35 = Class446.aClass446_24;
				}
				if (local35 != null) {
					@Pc(102) Class93_Sub22 local102 = Class102.method2588(local35, client.aClass175_2.aClass24_2, (byte) 28);
					local102.aPacketBit_1.p2(local5[local9], 2129512639);
					local102.aPacketBit_1.p1_alt1(0, -1591808004);
					client.aClass175_2.method24356(local102, -2107828542);
				}
				local7 = true;
				break;
			}
		}
		if (!local7) {
			Class103.method2809(4, Class74.aClass74_127.method1259(Class106.aClass717_8, (byte) 16) + arg1, -1963408433);
		}
	}
}
