package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aky")
public class Class93_Sub1 extends Class93 {

	@OriginalMember(owner = "client!aky", name = "w", descriptor = "Lclient!aky;")
	public Class93_Sub1 aClass93_Sub1_67;

	@OriginalMember(owner = "client!aky", name = "f", descriptor = "Lclient!aky;")
	public Class93_Sub1 aClass93_Sub1_68;

	@OriginalMember(owner = "client!aky", name = "k", descriptor = "J")
	public long aLong233;

	@OriginalMember(owner = "client!aky", name = "bf", descriptor = "(Lclient!dh;I)V")
	static void method23989(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = Class166_Sub17.anInt2179 * 1703853389;
		@Pc(7) int local7 = Class369.anInt4750 * -310709577;
		@Pc(11) int local11 = Class221.anInt3670 * 1555894759;
		@Pc(17) int local17 = Class115.anInt972 * 1280805653 - 3;
		@Pc(19) byte local19 = 20;
		if (Class276.aClass106_10 == null || Class49.aClass5_12 == null) {
			Class276.aClass106_10 = (Class106) Class157.aClass462_2.method29445(client.anInterface50_1, Class13.anInt47 * -122481607, true, true, -1803661433);
			Class49.aClass5_12 = Class157.aClass462_2.method29422(client.anInterface50_1, Class13.anInt47 * -122481607, 1504398486);
			if (Class276.aClass106_10 != null && Class49.aClass5_12 != null) {
				Class436.method28992(-916881791);
				@Pc(57) int local57 = local11 / 2 + local3;
				if (local11 + local57 > Class553.anInt3408 * -1378711501) {
					local57 = Class553.anInt3408 * -1378711501 - local11;
				}
				if (local57 < 0) {
					local57 = 0;
				}
				Class31.method638(local57, Class369.anInt4750 * -310709577, (short) -12155);
				return;
			}
		}
		@Pc(88) Class106 local88;
		if (Class276.aClass106_10 == null || Class49.aClass5_12 == null) {
			local88 = Class118_Sub1.aClass106_3;
		} else {
			local88 = Class276.aClass106_10;
		}
		@Pc(94) Class5 local94 = Class142_Sub1.method10990((byte) 98);
		Class292.method26672(arg0, Class166_Sub17.anInt2179 * 1703853389, Class369.anInt4750 * -310709577, Class221.anInt3670 * 1555894759, Class115.anInt972 * 1280805653, local19, local88, local94, Class74.aClass74_90.method1259(Class106.aClass717_8, (byte) -22), 1189701933);
		@Pc(126) int local126 = 255 - Class166_Sub34.anInt2296 * 1405170691 - Class454.anInt5216 * 1506557571;
		if (local126 < 0) {
			local126 = 0;
		}
		@Pc(134) int local134 = Class82.aClass153_1.method14058(431466541);
		@Pc(138) int local138 = Class82.aClass153_1.method14064(1007076912);
		@Pc(142) int local142;
		@Pc(147) Class93_Sub1_Sub7 local147;
		@Pc(172) int local172;
		@Pc(247) Class93_Sub1_Sub8 local247;
		if (Class454.aBoolean781) {
			local142 = 0;
			for (local247 = (Class93_Sub1_Sub8) Class454.aClass18_16.method246(94045928); local247 != null; local247 = (Class93_Sub1_Sub8) Class454.aClass18_16.method253(-1872305229)) {
				local172 = local94.anInt6 * -8978697 + local7 + local19 + 1 + Class454.anInt5197 * -875883057 * local142;
				if (local134 > Class166_Sub17.anInt2179 * 1703853389 && local134 < Class166_Sub17.anInt2179 * 1703853389 + Class221.anInt3670 * 1555894759 && local138 > local172 - local94.anInt6 * -8978697 - 1 && local138 < local94.anInt10 * -1093354073 + local172 && (local247.anInt3013 * -2109043087 > 1 || ((Class93_Sub1_Sub7) local247.aClass18_10.aClass93_Sub1_4.aClass93_Sub1_68).aBoolean506)) {
					arg0.method20665(Class166_Sub17.anInt2179 * 1703853389, local172 - local94.anInt6 * -8978697, Class221.anInt3670 * 1555894759, Class454.anInt5197 * -875883057, local126 << 24 | Class148.anInt1395 * 128705665, 1);
				}
				local142++;
			}
			if (Class454.aClass93_Sub1_Sub8_1 != null) {
				Class292.method26672(arg0, Class301.anInt3972 * 1939408525, Class318.anInt4136 * -988861719, Class454.anInt5207 * -816478179, Class360.anInt4731 * 2144271703, local19, local88, local94, Class454.aClass93_Sub1_Sub8_1.aString101, 1189701933);
				local142 = 0;
				for (local147 = (Class93_Sub1_Sub7) Class454.aClass93_Sub1_Sub8_1.aClass18_10.method246(1609761196); local147 != null; local147 = (Class93_Sub1_Sub7) Class454.aClass93_Sub1_Sub8_1.aClass18_10.method253(-353622442)) {
					local172 = Class318.anInt4136 * -988861719 + local19 + local94.anInt6 * -8978697 + 1 + local142 * Class454.anInt5197 * -875883057;
					if (local134 > Class301.anInt3972 * 1939408525 && local134 < Class454.anInt5207 * -816478179 + Class301.anInt3972 * 1939408525 && local138 > local172 - local94.anInt6 * -8978697 - 1 && local138 < local94.anInt10 * -1093354073 + local172 && local147.aBoolean506) {
						arg0.method20665(Class301.anInt3972 * 1939408525, local172 - local94.anInt6 * -8978697, Class454.anInt5207 * -816478179, Class454.anInt5197 * -875883057, local126 << 24 | Class148.anInt1395 * 128705665, 1);
					}
					local142++;
				}
				Class574.method31529(arg0, Class301.anInt3972 * 1939408525, Class318.anInt4136 * -988861719, Class454.anInt5207 * -816478179, Class360.anInt4731 * 2144271703, local19, -627481871);
			}
		} else {
			local142 = 0;
			for (local147 = (Class93_Sub1_Sub7) Class454.aClass22_55.method445((byte) 14); local147 != null; local147 = (Class93_Sub1_Sub7) Class454.aClass22_55.method415(2047885413)) {
				local172 = Class454.anInt5197 * -875883057 * (Class454.anInt5203 * -1838307953 - 1 - local142) + 1 + local7 + local19 + local94.anInt6 * -8978697;
				if (local134 > Class166_Sub17.anInt2179 * 1703853389 && local134 < Class166_Sub17.anInt2179 * 1703853389 + Class221.anInt3670 * 1555894759 && local138 > local172 - local94.anInt6 * -8978697 - 1 && local138 < local94.anInt10 * -1093354073 + local172 && local147.aBoolean506) {
					arg0.method20665(Class166_Sub17.anInt2179 * 1703853389, local172 - local94.anInt6 * -8978697, Class221.anInt3670 * 1555894759, Class454.anInt5197 * -875883057, local126 << 24 | Class148.anInt1395 * 128705665, 1);
				}
				local142++;
			}
		}
		Class574.method31529(arg0, Class166_Sub17.anInt2179 * 1703853389, Class369.anInt4750 * -310709577, Class221.anInt3670 * 1555894759, Class115.anInt972 * 1280805653, local19, -1283599837);
		if (!Class454.aBoolean781) {
			local142 = 0;
			for (local147 = (Class93_Sub1_Sub7) Class454.aClass22_55.method445((byte) 36); local147 != null; local147 = (Class93_Sub1_Sub7) Class454.aClass22_55.method415(-7759274)) {
				local172 = Class454.anInt5197 * -875883057 * (Class454.anInt5203 * -1838307953 - 1 - local142) + local7 + local19 + local94.anInt6 * -8978697 + 1;
				Class152.method14003(local134, local138, local3, local7, local11, local17, local172, local147, local88, local94, Class219.anInt3668 * 333089103 | 0xFF000000, Class364.anInt4736 * -347096685 | 0xFF000000, (short) -1102);
				local142++;
			}
			return;
		}
		local142 = 0;
		for (local247 = (Class93_Sub1_Sub8) Class454.aClass18_16.method246(1418525676); local247 != null; local247 = (Class93_Sub1_Sub8) Class454.aClass18_16.method253(1733682182)) {
			local172 = local142 * -875883057 * Class454.anInt5197 + local94.anInt6 * -8978697 + local19 + Class369.anInt4750 * -310709577 + 1;
			if (local247.anInt3013 * -2109043087 == 1) {
				Class152.method14003(local134, local138, Class166_Sub17.anInt2179 * 1703853389, Class369.anInt4750 * -310709577, Class221.anInt3670 * 1555894759, Class115.anInt972 * 1280805653, local172, (Class93_Sub1_Sub7) local247.aClass18_10.aClass93_Sub1_4.aClass93_Sub1_68, local88, local94, Class219.anInt3668 * 333089103 | 0xFF000000, Class364.anInt4736 * -347096685 | 0xFF000000, (short) 513);
			} else {
				Class125_Sub1.method9213(local134, local138, Class166_Sub17.anInt2179 * 1703853389, Class369.anInt4750 * -310709577, Class221.anInt3670 * 1555894759, Class115.anInt972 * 1280805653, local172, local247, local88, local94, Class219.anInt3668 * 333089103 | 0xFF000000, Class364.anInt4736 * -347096685 | 0xFF000000, 579581221);
			}
			local142++;
		}
		if (Class454.aClass93_Sub1_Sub8_1 == null) {
			return;
		}
		local142 = 0;
		for (local147 = (Class93_Sub1_Sub7) Class454.aClass93_Sub1_Sub8_1.aClass18_10.method246(-1314894156); local147 != null; local147 = (Class93_Sub1_Sub7) Class454.aClass93_Sub1_Sub8_1.aClass18_10.method253(1167002279)) {
			local172 = Class454.anInt5197 * -875883057 * local142 + local94.anInt6 * -8978697 + Class318.anInt4136 * -988861719 + local19 + 1;
			Class152.method14003(local134, local138, Class301.anInt3972 * 1939408525, Class318.anInt4136 * -988861719, Class454.anInt5207 * -816478179, Class360.anInt4731 * 2144271703, local172, local147, local88, local94, Class219.anInt3668 * 333089103 | 0xFF000000, Class364.anInt4736 * -347096685 | 0xFF000000, (short) -28106);
			local142++;
		}
	}

	@OriginalMember(owner = "client!aky", name = "js", descriptor = "(Lclient!yf;I)V")
	static void method23990(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6052 -= -1915563430;
	}

	@OriginalMember(owner = "client!aky", name = "t", descriptor = "(S)V")
	public final void method23988(@OriginalArg(0) short arg0) {
		if (this.aClass93_Sub1_67 != null) {
			this.aClass93_Sub1_67.aClass93_Sub1_68 = this.aClass93_Sub1_68;
			this.aClass93_Sub1_68.aClass93_Sub1_67 = this.aClass93_Sub1_67;
			this.aClass93_Sub1_68 = null;
			this.aClass93_Sub1_67 = null;
		}
	}
}
