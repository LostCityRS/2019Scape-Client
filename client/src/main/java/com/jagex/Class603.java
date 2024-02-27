package com.jagex;

import com.jagex.twitchtv.TwitchWebcamDevice;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.io.DataInputStream;
import java.net.URL;

@OriginalClass("client!uw")
public final class Class603 implements Interface66 {

	@OriginalMember(owner = "client!uw", name = "t", descriptor = "Lclient!act;")
	final Class68 aClass68_15;

	@OriginalMember(owner = "client!uw", name = "am", descriptor = "(Ljava/lang/String;B)Lclient!com/jagex/twitchtv/TwitchWebcamDevice;")
	public static TwitchWebcamDevice method32129(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) {
		if (Class622.aTwitchWebcamDeviceArray1 == null) {
			return null;
		}
		for (@Pc(6) int local6 = 0; local6 < Class622.aTwitchWebcamDeviceArray1.length; local6++) {
			if (Class622.aTwitchWebcamDeviceArray1[local6].t.equals(arg0)) {
				return Class622.aTwitchWebcamDeviceArray1[local6];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!uw", name = "t", descriptor = "(II)I")
	public static int method32130(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!uw", name = "to", descriptor = "(Lclient!hx;Lclient!yp;B)V")
	static void method32131(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class690 arg1, @OriginalArg(2) byte arg2) {
		@Pc(12) int local12 = arg1.anIntArray525[(arg1.anInt5778 -= 2036747717) * 1896589581];
		@Pc(27) int local27 = arg1.anIntArray525[(arg1.anInt5778 -= 2036747717) * 1896589581] - 1;
		@Pc(29) int local29 = local27;
		if (arg0.anInt4136 * -1322281851 != 6 && arg0.anInt4136 * -1322281851 != 2) {
			throw new RuntimeException("");
		}
		@Pc(55) Class335 local55 = (Class335) Class460.aClass41_Sub2_1.method18054(arg0.anInt4122 * -589001179, -1569231114);
		if (arg0.aClass350_2 == null) {
			arg0.aClass350_2 = new Class350(local55, arg0.anInt4136 * -1322281851 == 6);
		}
		arg0.aClass350_2.aLong370 = Class475.method29884((byte) -29) * 1429031336920090503L;
		if (local55.aByteArray84 != null) {
			if (local27 < 0 || local27 >= local55.aByteArray84.length) {
				throw new RuntimeException("");
			}
			local29 = local55.aByteArray84[local27];
		}
		if (local55.aShortArray117 == null || local29 < 0 || local29 >= local55.aShortArray117.length) {
			throw new RuntimeException("");
		}
		arg0.aClass350_2.aShortArray120[local29] = (short) local12;
		Class296.method26998(arg0, 388812255);
	}

	@OriginalMember(owner = "client!uw", name = "xk", descriptor = "(Lclient!yp;I)V")
	static void method32132(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= 2036747717;
	}

	@OriginalMember(owner = "client!uw", name = "t", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;I)V")
	public static void method32133(@OriginalArg(0) String arg0, @OriginalArg(1) Throwable arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(1) String local1 = "";
			if (arg1 != null) {
				local1 = Class501.method30425(arg1, 2115050122);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local1 = local1 + " | ";
				}
				local1 = local1 + arg0;
			}
			Class107_Sub2.method7197(local1, (byte) 61);
			local1 = Class475.method29886(local1, -754889645);
			@Pc(40) URL local40 = null;
			if (Class476.anApplet2 != null) {
				local40 = Class476.anApplet2.getCodeBase();
			} else if (RuntimeException_Sub4.anInterface59_1 != null) {
				local40 = RuntimeException_Sub4.anInterface59_1.method30887(-1371542211);
			}
			if (local40 == null) {
				return;
			}
			@Pc(59) String local59 = "Unknown";
			@Pc(61) String local61 = "1.1";
			try {
				local59 = System.getProperty("java.vendor");
				local61 = System.getProperty("java.version");
			} catch (@Pc(69) Exception local69) {
			}
			@Pc(126) URL local126 = new URL(local40, "clienterror.ws?c=" + RuntimeException_Sub4.anInt3268 * 59209617 + "&cs=" + Class349.anInt4254 * -882092103 + "&u=" + (RuntimeException_Sub4.aString124 == null ? "" + RuntimeException_Sub4.aLong331 * 2065049077246304819L : Class475.method29886(RuntimeException_Sub4.aString124, -432965)) + "&v1=" + Class475.method29886(local59, -145137659) + "&v2=" + Class475.method29886(local61, -676059134) + "&e=" + local1);
			@Pc(132) DataInputStream local132 = new DataInputStream(local126.openStream());
			local132.read();
			local132.close();
		} catch (@Pc(139) Exception local139) {
			local139.printStackTrace();
		}
	}

	@OriginalMember(owner = "client!uw", name = "<init>", descriptor = "(Lclient!act;)V")
	Class603(@OriginalArg(0) Class68 arg0) {
		this.aClass68_15 = arg0;
	}

	@OriginalMember(owner = "client!uw", name = "t", descriptor = "(I)V")
	@Override
	public void method32127(@OriginalArg(0) int arg0) {
		@Pc(5) Class80_Sub31 local5 = Class623.method32440(Class443.aClass443_55, client.aClass75_1.aClass22_1, -191270971);
		local5.aPacketBit_2.p1_alt3(this.aClass68_15.getId());
		client.aClass75_1.method1325(local5, (byte) -112);
	}

	@OriginalMember(owner = "client!uw", name = "f", descriptor = "()V")
	@Override
	public void method32126() {
		@Pc(5) Class80_Sub31 local5 = Class623.method32440(Class443.aClass443_55, client.aClass75_1.aClass22_1, -191270971);
		local5.aPacketBit_2.p1_alt3(this.aClass68_15.getId());
		client.aClass75_1.method1325(local5, (byte) -75);
	}

	@OriginalMember(owner = "client!uw", name = "e", descriptor = "()V")
	@Override
	public void method32128() {
		@Pc(5) Class80_Sub31 local5 = Class623.method32440(Class443.aClass443_55, client.aClass75_1.aClass22_1, -191270971);
		local5.aPacketBit_2.p1_alt3(this.aClass68_15.getId());
		client.aClass75_1.method1325(local5, (byte) -104);
	}
}
