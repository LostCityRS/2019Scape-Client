package com.jagex;

import com.jagex.twitchtv.TwitchEvent;
import com.jagex.twitchtv.TwitchEventLiveStreams;
import com.jagex.twitchtv.TwitchEventResult;
import com.jagex.twitchtv.TwitchTV;
import com.jagex.twitchtv.TwitchWebcamDevice;
import com.jagex.twitchtv.TwitchWebcamFrameData;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vs")
public final class Class622 {

	@OriginalMember(owner = "client!vs", name = "f", descriptor = "I")
	static final int anInt5473 = 0;

	@OriginalMember(owner = "client!vs", name = "u", descriptor = "I")
	static final int anInt5475 = 2;

	@OriginalMember(owner = "client!vs", name = "l", descriptor = "I")
	static final int anInt5476 = 3;

	@OriginalMember(owner = "client!vs", name = "e", descriptor = "I")
	static final int anInt5478 = 1;

	@OriginalMember(owner = "client!vs", name = "i", descriptor = "I")
	static final int anInt5484 = 1;

	@OriginalMember(owner = "client!vs", name = "m", descriptor = "I")
	static final int anInt5485 = 2;

	@OriginalMember(owner = "client!vs", name = "at", descriptor = "I")
	static final int anInt5486 = 2000;

	@OriginalMember(owner = "client!vs", name = "g", descriptor = "I")
	static final int anInt5487 = 0;

	@OriginalMember(owner = "client!vs", name = "lm", descriptor = "I")
	public static int anInt5488;

	@OriginalMember(owner = "client!vs", name = "t", descriptor = "Z")
	static boolean aBoolean935 = false;

	@OriginalMember(owner = "client!vs", name = "o", descriptor = "F")
	static float aFloat337 = 0.2F;

	@OriginalMember(owner = "client!vs", name = "j", descriptor = "I")
	static int anInt5479 = 745909291;

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "I")
	static int anInt5474 = 929850592;

	@OriginalMember(owner = "client!vs", name = "s", descriptor = "I")
	static int anInt5480 = 0;

	@OriginalMember(owner = "client!vs", name = "k", descriptor = "I")
	static int anInt5481 = 1991084720;

	@OriginalMember(owner = "client!vs", name = "x", descriptor = "I")
	static int anInt5483 = 0;

	@OriginalMember(owner = "client!vs", name = "w", descriptor = "I")
	static int anInt5482 = 0;

	@OriginalMember(owner = "client!vs", name = "r", descriptor = "[Z")
	static boolean[] aBooleanArray33 = null;

	@OriginalMember(owner = "client!vs", name = "q", descriptor = "[Ljava/lang/String;")
	static String[] aStringArray32 = null;

	@OriginalMember(owner = "client!vs", name = "h", descriptor = "Z")
	static boolean aBoolean936 = false;

	@OriginalMember(owner = "client!vs", name = "z", descriptor = "J")
	static long aLong399 = 0L;

	@OriginalMember(owner = "client!vs", name = "v", descriptor = "J")
	static long aLong400 = 0L;

	@OriginalMember(owner = "client!vs", name = "y", descriptor = "J")
	static long aLong398 = 0L;

	@OriginalMember(owner = "client!vs", name = "n", descriptor = "I")
	static int anInt5472 = 0;

	@OriginalMember(owner = "client!vs", name = "c", descriptor = "Z")
	static boolean aBoolean934 = false;

	@OriginalMember(owner = "client!vs", name = "b", descriptor = "Z")
	static boolean aBoolean937 = false;

	@OriginalMember(owner = "client!vs", name = "ao", descriptor = "Lclient!com/jagex/twitchtv/TwitchWebcamFrameData;")
	static TwitchWebcamFrameData aTwitchWebcamFrameData1 = null;

	@OriginalMember(owner = "client!vs", name = "aj", descriptor = "Ljava/util/LinkedList;")
	static LinkedList aLinkedList7 = new LinkedList();

	@OriginalMember(owner = "client!vs", name = "ac", descriptor = "Ljava/util/LinkedList;")
	static LinkedList aLinkedList6 = new LinkedList();

	@OriginalMember(owner = "client!vs", name = "ab", descriptor = "I")
	static int anInt5477 = 1734596115;

	@OriginalMember(owner = "client!vs", name = "al", descriptor = "[Lclient!com/jagex/twitchtv/TwitchWebcamDevice;")
	static TwitchWebcamDevice[] aTwitchWebcamDeviceArray1 = null;

	@OriginalMember(owner = "client!vs", name = "ah", descriptor = "J")
	static long aLong401 = 0L;

	@OriginalMember(owner = "client!vs", name = "af", descriptor = "Lclient!cm;")
	static Class99 aClass99_38 = null;

	@OriginalMember(owner = "client!vs", name = "am", descriptor = "Z")
	static boolean aBoolean938 = false;

	@OriginalMember(owner = "client!vs", name = "ak", descriptor = "Z")
	static boolean aBoolean939 = false;

	@OriginalMember(owner = "client!vs", name = "bf", descriptor = "()I")
	public static int method32344() {
		return Class669.aTwitchTV1.GetStreamState();
	}

	@OriginalMember(owner = "client!vs", name = "cx", descriptor = "(Lclient!di;J)V")
	public static void method32345(@OriginalArg(0) Class102 arg0, @OriginalArg(1) long arg1) {
		arg0.method20683();
		aLinkedList7.clear();
		aLinkedList6.clear();
		aLong399 = ((long) (anInt5480 * -1814437725) + arg1) * -5746832404463840717L;
	}

	@OriginalMember(owner = "client!vs", name = "ap", descriptor = "()I")
	public static int method32346() {
		return Class506.aTwitchEventLiveStreams1 == null || anInt5477 * -1659069467 >= Class506.aTwitchEventLiveStreams1.streamCount - 1 ? -1 : (anInt5477 += -1734596115) * -1659069467;
	}

	@OriginalMember(owner = "client!vs", name = "ar", descriptor = "()Lclient!cm;")
	public static Class99 method32347() {
		return aClass99_38;
	}

	@OriginalMember(owner = "client!vs", name = "dy", descriptor = "()I")
	public static int method32348() {
		return Class669.aTwitchTV1.GetViewerCount();
	}

	@OriginalMember(owner = "client!vs", name = "cu", descriptor = "()I")
	public static int method32349() {
		return Class669.aTwitchTV1.GetChatState();
	}

	@OriginalMember(owner = "client!vs", name = "as", descriptor = "(Z)V")
	public static void method32350(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!vs", name = "aw", descriptor = "(Z)V")
	public static void method32351(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!vs", name = "bg", descriptor = "(Z)V")
	public static void method32352(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!vs", name = "bm", descriptor = "(Ljava/lang/String;)I")
	public static int method32353(@OriginalArg(0) String arg0) {
		return Class669.aTwitchTV1.SetStreamTitle(arg0, client.aClass722_4.aString248);
	}

	@OriginalMember(owner = "client!vs", name = "ch", descriptor = "(Z)V")
	public static void method32354(@OriginalArg(0) boolean arg0) {
		if (arg0 != aBoolean937) {
			Class100.method2954(436590542);
			aBoolean937 = arg0;
		}
	}

	@OriginalMember(owner = "client!vs", name = "bn", descriptor = "()I")
	public static int method32355() {
		if (anInt5483 * -1525318091 == 3) {
			return -1;
		} else if (anInt5483 * -1525318091 == 0) {
			if (aStringArray32 == null) {
				if (Class531.aString220.startsWith("mac ")) {
					if (Class531.aString218.startsWith("ppc")) {
						anInt5483 = 1209871447;
						return -1;
					}
					aStringArray32 = new String[3];
					aStringArray32[0] = "sdk-mac-dynamic";
					aStringArray32[1] = "twitchsdk";
					aStringArray32[2] = "twitchtv";
					aBooleanArray33 = new boolean[3];
					aBooleanArray33[0] = false;
					aBooleanArray33[1] = false;
					aBooleanArray33[2] = true;
				} else if (Class531.aString220.startsWith("win")) {
					aStringArray32 = new String[6];
					aStringArray32[0] = "avutil-ttv-51";
					aStringArray32[1] = "libmp3lame-ttv";
					aStringArray32[2] = "swresample-ttv-0";
					aStringArray32[5] = "twitchtv";
					if (Class531.aString218.startsWith("amd64") || Class531.aString218.startsWith("x86_64")) {
						aStringArray32[3] = "libmfxsw64";
						aStringArray32[4] = "twitchsdk_64_release";
					} else if (Class531.aString218.startsWith("i386") || Class531.aString218.startsWith("i486") || Class531.aString218.startsWith("i586") || Class531.aString218.startsWith("x86")) {
						aStringArray32[3] = "libmfxsw32";
						aStringArray32[4] = "twitchsdk_32_release";
					} else {
						anInt5483 = 1209871447;
						return -1;
					}
					aBooleanArray33 = new boolean[6];
					aBooleanArray33[0] = true;
					aBooleanArray33[1] = true;
					aBooleanArray33[2] = true;
					aBooleanArray33[3] = false;
					aBooleanArray33[4] = true;
					aBooleanArray33[5] = true;
				} else {
					anInt5483 = 1209871447;
					return -1;
				}
			}
			anInt5483 = -1028365283;
			return 0;
		} else {
			return anInt5482 * -168012841;
		}
	}

	@OriginalMember(owner = "client!vs", name = "ba", descriptor = "()I")
	public static int method32356() {
		return anInt5483 * -1525318091;
	}

	@OriginalMember(owner = "client!vs", name = "bt", descriptor = "()I")
	public static int method32357() {
		return anInt5483 * -1525318091;
	}

	@OriginalMember(owner = "client!vs", name = "de", descriptor = "(Ljava/lang/String;)Lclient!com/jagex/twitchtv/TwitchWebcamDevice;")
	public static TwitchWebcamDevice method32358(@OriginalArg(0) String arg0) {
		if (aTwitchWebcamDeviceArray1 == null) {
			return null;
		}
		for (@Pc(6) int local6 = 0; local6 < aTwitchWebcamDeviceArray1.length; local6++) {
			if (aTwitchWebcamDeviceArray1[local6].t.equals(arg0)) {
				return aTwitchWebcamDeviceArray1[local6];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!vs", name = "bj", descriptor = "()I")
	static int method32359() {
		@Pc(1) int local1;
		try {
			for (local1 = 0; local1 < aStringArray32.length; local1++) {
				if (aStringArray32[local1] != null && aBooleanArray33[local1]) {
					Class588.method31902(350319923).method31859(aStringArray32[local1], -1199305162);
				}
			}
		} catch (@Pc(25) Exception_Sub7 local25) {
			return 3;
		}
		Class669.aTwitchTV1 = new TwitchTV();
		local1 = Class669.aTwitchTV1.InitialiseTTV(Class501.method30419(1309316276));
		if (local1 == 0) {
			aBoolean936 = true;
		} else {
			Class603.method32133(10 + Class256.aString157 + local1, new RuntimeException(), 839300151);
		}
		return 2;
	}

	@OriginalMember(owner = "client!vs", name = "by", descriptor = "()V")
	public static void method32360() {
		if (!aBoolean936) {
			return;
		}
		@Pc(4) int local4 = Class669.aTwitchTV1.ShutdownTTV();
		if (local4 == 0) {
			Class669.aTwitchTV1 = null;
			aBoolean936 = false;
		}
	}

	@OriginalMember(owner = "client!vs", name = "bk", descriptor = "(Ljava/lang/String;Ljava/lang/String;)I")
	public static int method32361(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (aBoolean936) {
			return Class52.method1074(16777215) == client.aClass75_1 ? Class669.aTwitchTV1.Login(arg0, arg1) : 42;
		} else {
			return 12;
		}
	}

	@OriginalMember(owner = "client!vs", name = "dm", descriptor = "(ZZ)V")
	public static void method32362(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		aBoolean938 = arg0;
		aBoolean939 = arg1;
	}

	@OriginalMember(owner = "client!vs", name = "be", descriptor = "()I")
	public static int method32363() {
		return Class669.aTwitchTV1.GetLoginState();
	}

	@OriginalMember(owner = "client!vs", name = "bh", descriptor = "()I")
	public static int method32364() {
		return Class669.aTwitchTV1.GetLoginState();
	}

	@OriginalMember(owner = "client!vs", name = "az", descriptor = "(Z)V")
	public static void method32365(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!vs", name = "bp", descriptor = "()I")
	public static int method32366() {
		if (aBoolean936) {
			Class697.method37056(Class279.aClass102_9, 1087492339);
			return Class669.aTwitchTV1.Logout();
		} else {
			return 12;
		}
	}

	@OriginalMember(owner = "client!vs", name = "au", descriptor = "(Z)V")
	public static void method32367(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!vs", name = "bo", descriptor = "()I")
	public static int method32368() {
		if (aBoolean936) {
			Class697.method37056(Class279.aClass102_9, 1087492339);
			return Class669.aTwitchTV1.Logout();
		} else {
			return 12;
		}
	}

	@OriginalMember(owner = "client!vs", name = "ae", descriptor = "()I")
	public static int method32369() {
		return Class506.aTwitchEventLiveStreams1 == null || anInt5477 * -1659069467 >= Class506.aTwitchEventLiveStreams1.streamCount - 1 ? -1 : (anInt5477 += -1734596115) * -1659069467;
	}

	@OriginalMember(owner = "client!vs", name = "bl", descriptor = "(Z)V")
	public static void method32370(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!vs", name = "bu", descriptor = "()V")
	static void method32371() {
		aBoolean934 = false;
		Class503.anIntArray465 = null;
		Class347.anIntArray420 = null;
		aLinkedList7.clear();
		aLinkedList6.clear();
		Class279.aClass102_9.method20683();
	}

	@OriginalMember(owner = "client!vs", name = "bx", descriptor = "(Lclient!di;)I")
	public static int method32372(@OriginalArg(0) Class102 arg0) {
		Class100.method2954(611399657);
		return Class669.aTwitchTV1.StopStreaming();
	}

	@OriginalMember(owner = "client!vs", name = "bc", descriptor = "()I")
	public static int method32373() {
		return Class669.aTwitchTV1.GetStreamState();
	}

	@OriginalMember(owner = "client!vs", name = "bz", descriptor = "(Ljava/lang/String;Ljava/lang/String;)I")
	public static int method32374(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (aBoolean936) {
			return Class52.method1074(16777215) == client.aClass75_1 ? Class669.aTwitchTV1.Login(arg0, arg1) : 42;
		} else {
			return 12;
		}
	}

	@OriginalMember(owner = "client!vs", name = "bi", descriptor = "(Lclient!di;)I")
	public static int method32375(@OriginalArg(0) Class102 arg0) {
		Class100.method2954(1368731250);
		return Class669.aTwitchTV1.StopStreaming();
	}

	@OriginalMember(owner = "client!vs", name = "co", descriptor = "(Lclient!com/jagex/twitchtv/TwitchEvent;J)Z")
	static boolean method32376(@OriginalArg(0) TwitchEvent arg0, @OriginalArg(1) long arg1) {
		if (!aBoolean935) {
			switch(arg0.eventType) {
				case 7:
				case 8:
				case 9:
					return false;
			}
		}
		@Pc(19) int local19;
		if (arg0.eventType != 33) {
			if (arg0.eventType == 30) {
				local19 = ((TwitchEventResult) arg0).result;
				if (local19 == 0 || local19 == 1) {
					Class27.method646((byte) 16);
				} else if (local19 == 2) {
					aLong401 = arg1 * 6599029287603157643L;
				}
			}
			if (arg0.eventType == 34) {
				Class506.aTwitchEventLiveStreams1 = (TwitchEventLiveStreams) arg0;
				Class436.method29129(34, 0, 1579559935);
			}
			return true;
		} else if (aTwitchWebcamFrameData1 == null) {
			return false;
		} else {
			local19 = ((TwitchEventResult) arg0).result;
			@Pc(24) int local24 = Class669.aTwitchTV1.GetWebcamFrameData(local19, aTwitchWebcamFrameData1);
			if (local24 == 0) {
				if (aBoolean938) {
					aTwitchWebcamFrameData1.t();
				}
				if (aBoolean939) {
					aTwitchWebcamFrameData1.f();
				}
				Class329.method27754(-75371870);
				aLong401 = arg1 * 6599029287603157643L;
				Class436.method29129(33, 0, 1694932549);
			} else {
				aClass99_38 = null;
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!vs", name = "bd", descriptor = "()I")
	public static int method32377() {
		return Class380.method28557((byte) 122) ? anInt5472 * -862856427 : 0;
	}

	@OriginalMember(owner = "client!vs", name = "cd", descriptor = "(Z)V")
	public static void method32378(@OriginalArg(0) boolean arg0) {
		if (arg0 != aBoolean937) {
			Class100.method2954(3251868);
			aBoolean937 = arg0;
		}
	}

	@OriginalMember(owner = "client!vs", name = "cv", descriptor = "(Z)V")
	public static void method32379(@OriginalArg(0) boolean arg0) {
		if (arg0 != aBoolean937) {
			Class100.method2954(752274937);
			aBoolean937 = arg0;
		}
	}

	@OriginalMember(owner = "client!vs", name = "ct", descriptor = "(Z)V")
	public static void method32380(@OriginalArg(0) boolean arg0) {
		if (arg0 != aBoolean937) {
			Class100.method2954(531893297);
			aBoolean937 = arg0;
		}
	}

	@OriginalMember(owner = "client!vs", name = "cn", descriptor = "(Z)V")
	public static void method32381(@OriginalArg(0) boolean arg0) {
		if (arg0 != aBoolean937) {
			Class100.method2954(214476177);
			aBoolean937 = arg0;
		}
	}

	@OriginalMember(owner = "client!vs", name = "cl", descriptor = "(Lclient!di;J)V")
	public static void method32382(@OriginalArg(0) Class102 arg0, @OriginalArg(1) long arg1) {
		arg0.method20683();
		aLinkedList7.clear();
		aLinkedList6.clear();
		aLong399 = ((long) (anInt5480 * -1814437725) + arg1) * -5746832404463840717L;
	}

	@OriginalMember(owner = "client!vs", name = "bw", descriptor = "(IIIZ)I")
	public static int method32383(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		if (arg0 != 0 && (arg0 < 50 || arg0 > 100)) {
			arg0 = 0;
		}
		if (arg1 != 0 && (arg1 < 50 || arg1 > 100)) {
			arg1 = 0;
		}
		@Pc(25) boolean local25 = Class531.aString220.startsWith("mac");
		@Pc(39) int[] local39 = Class669.aTwitchTV1.GetRecommendedSettings(Class80_Sub1_Sub1.anInt254 * -255202897, Class80_Sub25.anInt1627 * 167687103, arg0, 2000, arg2, aFloat337, local25);
		if (local39[0] != 0) {
			return local39[0];
		}
		@Pc(51) int local51 = local39[1];
		@Pc(55) int local55 = local39[2];
		@Pc(59) int local59 = local39[3];
		@Pc(61) int local61 = local59;
		aLong399 = 0L;
		Class116_Sub1.aLong33 = (long) (1000.0F / (float) arg2) * 3891691916431978541L;
		Class292.anInt3951 = local51 * -267527003;
		Class351.anInt4255 = local55 * 253791423;
		if (arg1 != 0) {
			local59 = local59 * arg1 / 100;
		}
		Class294.method26961("Stream - Input: " + Class80_Sub1_Sub1.anInt254 * -255202897 + "x" + Class80_Sub25.anInt1627 * 167687103 + " (" + local61 + "kbps)" + " => " + "Output: " + local51 + "x" + local55 + " [" + (arg0 == 0 ? "auto" : arg0 + "%") + "] (" + local59 + "kbps [" + (arg1 == 0 ? "auto" : arg1 + "%") + "])", 1455295997);
		return Class669.aTwitchTV1.StartStreaming(local51, local55, arg2, local59, arg1 != 0, aFloat337, anInt5479 * -1984318845, arg3);
	}

	@OriginalMember(owner = "client!vs", name = "cc", descriptor = "()I")
	public static int method32384() {
		return Class669.aTwitchTV1.GetChatState();
	}

	@OriginalMember(owner = "client!vs", name = "bb", descriptor = "()I")
	public static int method32385() {
		if (aBoolean936) {
			Class697.method37056(Class279.aClass102_9, 1087492339);
			return Class669.aTwitchTV1.Logout();
		} else {
			return 12;
		}
	}

	@OriginalMember(owner = "client!vs", name = "ec", descriptor = "([ILjava/util/LinkedList;IIF)V")
	static void method32386(@OriginalArg(0) int[] arg0, @OriginalArg(1) LinkedList arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4) {
		if (arg1.isEmpty()) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < arg1.size(); local5++) {
			@Pc(14) Class618 local14 = (Class618) arg1.get(local5);
			@Pc(25) int local25 = (int) ((float) (local14.anInt5432 * -967543719) * arg4) + arg2;
			@Pc(36) int local36 = arg3 + (int) (arg4 * (float) (local14.anInt5430 * -227036461));
			@Pc(45) int local45 = (int) ((float) (local14.anInt5431 * 1829220281) * arg4);
			@Pc(54) int local54 = (int) ((float) (local14.anInt5433 * 1270901473) * arg4);
			if (local25 < Class292.anInt3951 * 823569197 && local36 < Class351.anInt4255 * -1311710401) {
				if (local45 + local25 > Class292.anInt3951 * 823569197) {
					local45 = Class292.anInt3951 * 823569197 - local25;
				}
				if (local36 + local54 > Class351.anInt4255 * -1311710401) {
					local54 = Class351.anInt4255 * -1311710401 - local36;
				}
				for (@Pc(94) int local94 = local36; local94 < local54 + local36; local94++) {
					@Pc(107) int local107 = local25 + local94 * 823569197 * Class292.anInt3951;
					Arrays.fill(arg0, local107, local107 + local45, -16777216);
				}
			}
		}
	}

	@OriginalMember(owner = "client!vs", name = "cs", descriptor = "(Ljava/lang/String;)I")
	public static int method32387(@OriginalArg(0) String arg0) {
		return Class669.aTwitchTV1.ChatSendMessage(arg0);
	}

	@OriginalMember(owner = "client!vs", name = "cj", descriptor = "(Ljava/lang/String;)I")
	public static int method32388(@OriginalArg(0) String arg0) {
		return Class669.aTwitchTV1.ChatSendMessage(arg0);
	}

	@OriginalMember(owner = "client!vs", name = "ck", descriptor = "()I")
	public static int method32389() {
		return Class669.aTwitchTV1.GetWebcamState();
	}

	@OriginalMember(owner = "client!vs", name = "ca", descriptor = "(Lclient!di;J)V")
	public static void method32390(@OriginalArg(0) Class102 arg0, @OriginalArg(1) long arg1) {
		if (anInt5483 * -1525318091 == 3 || anInt5483 * -1525318091 == 0) {
			return;
		}
		@Pc(29) int local29;
		if (anInt5483 * -1525318091 == 1) {
			if (aStringArray32 == null || aStringArray32.length == 0) {
				throw new RuntimeException("");
			}
			@Pc(27) int local27 = 0;
			for (local29 = 0; local29 < aStringArray32.length; local29++) {
				if (aStringArray32[local29] == null) {
					local27 += 100;
				} else {
					try {
						local27 += Class373.aClass586_1.method31865(aStringArray32[local29], false, (byte) 96);
					} catch (@Pc(49) Exception_Sub1 local49) {
						Class115_Sub1.method8671(Class70.aClass70_2, local49.aString70, local49.anInt2514 * -1965296183, local49.getCause(), -199906023);
						anInt5483 = 1209871447;
						return;
					}
				}
			}
			anInt5482 = local27 / aStringArray32.length * 301420519;
			if (anInt5482 * -168012841 != 100) {
				return;
			}
			anInt5483 = Class393.method28690((short) 617) * -1028365283;
			if (anInt5483 * -1525318091 != 2) {
				return;
			}
		}
		@Pc(93) TwitchEvent[] local93 = Class669.aTwitchTV1.Service();
		if (local93 != null) {
			for (local29 = 0; local29 < local93.length; local29++) {
				@Pc(106) TwitchEvent local106 = local93[local29];
				if (local106 != null && Class229.method25998(local106, arg1)) {
					@Pc(115) Class601 local115 = local106.f();
					if (local115 != null) {
						Class312.method27463(local115.method37268(), local106, (byte) 73);
					}
				}
			}
		}
		if (Class669.aTwitchTV1.IsStreaming() && arg1 - aLong399 * -2257738343657064197L > Class116_Sub1.aLong33 * -4022348017745010779L) {
			aLong399 = arg1 * -5746832404463840717L;
			if (arg0.method20694()) {
				aBoolean934 = true;
			}
		}
		if (!Class669.aTwitchTV1.IsStreaming()) {
			anInt5472 = 0;
		} else if (arg1 - aLong400 * -1315910636336695373L < (long) (anInt5474 * 324842939)) {
			anInt5472 = 814561402;
		} else if (arg1 - aLong398 * -71842521790187563L < (long) (anInt5474 * 324842939)) {
			anInt5472 = -1740202947;
		} else {
			anInt5472 = 0;
		}
		if (arg1 - aLong401 * 2093873323454684451L > (long) (anInt5481 * 2012339063) && Class669.aTwitchTV1.GetWebcamState() == 5) {
			Class669.aTwitchTV1.RestartWebcamDevice();
			aLong401 = arg1 * 6599029287603157643L;
		}
	}

	@OriginalMember(owner = "client!vs", name = "cr", descriptor = "(Lclient!di;JII)V")
	public static void method32391(@OriginalArg(0) Class102 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(9) int local9;
		if (arg0.method20693() && arg0.method20697() > -1) {
			local9 = arg0.method20697();
			@Pc(11) Class629 local11 = null;
			if (!aLinkedList6.isEmpty()) {
				local11 = (Class629) aLinkedList6.getFirst();
			}
			if (local11 != null && local9 == local11.anInt5543 * -1720890167) {
				aLinkedList6.removeFirst();
				arg0.method20782();
				@Pc(39) boolean local39 = false;
				@Pc(64) int local64;
				if (local11.aLinkedList8.isEmpty() && arg0.method20695()) {
					@Pc(55) long local55 = arg0.method20700(Class292.anInt3951 * 823569197, Class351.anInt4255 * -1311710401);
					local64 = Class669.aTwitchTV1.SubmitFrame(local55, arg0.method20696(), aBoolean937, arg2, arg3);
					arg0.method20701(local55);
				} else {
					arg0.method20702(Class292.anInt3951 * 823569197, Class351.anInt4255 * -1311710401, Class503.anIntArray465, Class347.anIntArray420);
					Class229.method25997(Class503.anIntArray465, local11.aLinkedList8, local11.anInt5542 * 1341820711, local11.anInt5544 * 292274843, local11.aFloat338, 2055100897);
					local64 = Class669.aTwitchTV1.SubmitFrameRaw(Class503.anIntArray465, aBoolean937, arg2, arg3);
				}
				arg0.method20746();
				if (local64 == 2072) {
					aLong400 = arg1 * -31384695838519429L;
				} else if (local64 == 23) {
					aLong398 = arg1 * -2812865742381381251L;
				} else if (local64 != -995 && local64 != 0) {
				}
			} else {
				arg0.method20698();
				aLinkedList6.clear();
			}
		}
		if (!aBoolean934) {
			return;
		}
		if (Class503.anIntArray465 == null) {
			Class503.anIntArray465 = new int[aBoolean937 ? arg3 * arg2 : Class351.anInt4255 * -1311710401 * 823569197 * Class292.anInt3951];
			Class347.anIntArray420 = new int[aBoolean937 ? arg3 * arg2 : Class351.anInt4255 * -1311710401 * Class292.anInt3951 * 823569197];
		}
		if (arg0.method20693()) {
			arg0.method20867(client.anInt3436, Class292.anInt3951 * 823569197, Class351.anInt4255 * -1311710401);
			aLinkedList6.add(new Class629(client.anInt3436, aLinkedList7, arg0.anInt2947 * 1069673649, arg0.anInt2932 * 262780429, arg0.aFloat200));
			aLinkedList7 = new LinkedList();
		} else {
			arg0.method20782();
			arg0.method20702(Class292.anInt3951 * 823569197, Class351.anInt4255 * -1311710401, Class503.anIntArray465, Class347.anIntArray420);
			Class229.method25997(Class503.anIntArray465, aLinkedList7, arg0.anInt2947 * 1069673649, arg0.anInt2932 * 262780429, arg0.aFloat200, 2036255550);
			local9 = Class669.aTwitchTV1.SubmitFrameRaw(Class503.anIntArray465, aBoolean937, arg2, arg3);
			arg0.method20746();
			aLinkedList7.clear();
			if (local9 == 2072) {
				aLong400 = arg1 * -31384695838519429L;
			} else if (local9 == 23) {
				aLong398 = arg1 * -2812865742381381251L;
			} else if (local9 != -995 && local9 != 0) {
			}
		}
		aBoolean934 = false;
	}

	@OriginalMember(owner = "client!vs", name = "ci", descriptor = "(Lclient!di;JII)V")
	public static void method32392(@OriginalArg(0) Class102 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(9) int local9;
		if (arg0.method20693() && arg0.method20697() > -1) {
			local9 = arg0.method20697();
			@Pc(11) Class629 local11 = null;
			if (!aLinkedList6.isEmpty()) {
				local11 = (Class629) aLinkedList6.getFirst();
			}
			if (local11 != null && local9 == local11.anInt5543 * -1720890167) {
				aLinkedList6.removeFirst();
				arg0.method20782();
				@Pc(39) boolean local39 = false;
				@Pc(64) int local64;
				if (local11.aLinkedList8.isEmpty() && arg0.method20695()) {
					@Pc(55) long local55 = arg0.method20700(Class292.anInt3951 * 823569197, Class351.anInt4255 * -1311710401);
					local64 = Class669.aTwitchTV1.SubmitFrame(local55, arg0.method20696(), aBoolean937, arg2, arg3);
					arg0.method20701(local55);
				} else {
					arg0.method20702(Class292.anInt3951 * 823569197, Class351.anInt4255 * -1311710401, Class503.anIntArray465, Class347.anIntArray420);
					Class229.method25997(Class503.anIntArray465, local11.aLinkedList8, local11.anInt5542 * 1341820711, local11.anInt5544 * 292274843, local11.aFloat338, 1582336699);
					local64 = Class669.aTwitchTV1.SubmitFrameRaw(Class503.anIntArray465, aBoolean937, arg2, arg3);
				}
				arg0.method20746();
				if (local64 == 2072) {
					aLong400 = arg1 * -31384695838519429L;
				} else if (local64 == 23) {
					aLong398 = arg1 * -2812865742381381251L;
				} else if (local64 != -995 && local64 != 0) {
				}
			} else {
				arg0.method20698();
				aLinkedList6.clear();
			}
		}
		if (!aBoolean934) {
			return;
		}
		if (Class503.anIntArray465 == null) {
			Class503.anIntArray465 = new int[aBoolean937 ? arg3 * arg2 : Class351.anInt4255 * -1311710401 * 823569197 * Class292.anInt3951];
			Class347.anIntArray420 = new int[aBoolean937 ? arg3 * arg2 : Class351.anInt4255 * -1311710401 * Class292.anInt3951 * 823569197];
		}
		if (arg0.method20693()) {
			arg0.method20867(client.anInt3436, Class292.anInt3951 * 823569197, Class351.anInt4255 * -1311710401);
			aLinkedList6.add(new Class629(client.anInt3436, aLinkedList7, arg0.anInt2947 * 1069673649, arg0.anInt2932 * 262780429, arg0.aFloat200));
			aLinkedList7 = new LinkedList();
		} else {
			arg0.method20782();
			arg0.method20702(Class292.anInt3951 * 823569197, Class351.anInt4255 * -1311710401, Class503.anIntArray465, Class347.anIntArray420);
			Class229.method25997(Class503.anIntArray465, aLinkedList7, arg0.anInt2947 * 1069673649, arg0.anInt2932 * 262780429, arg0.aFloat200, 2011277345);
			local9 = Class669.aTwitchTV1.SubmitFrameRaw(Class503.anIntArray465, aBoolean937, arg2, arg3);
			arg0.method20746();
			aLinkedList7.clear();
			if (local9 == 2072) {
				aLong400 = arg1 * -31384695838519429L;
			} else if (local9 == 23) {
				aLong398 = arg1 * -2812865742381381251L;
			} else if (local9 != -995 && local9 != 0) {
			}
		}
		aBoolean934 = false;
	}

	@OriginalMember(owner = "client!vs", name = "br", descriptor = "(Z)V")
	public static void method32393(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!vs", name = "do", descriptor = "()I")
	public static int method32394() {
		Class506.aTwitchEventLiveStreams1 = null;
		return Class669.aTwitchTV1.RequestLiveStreams(client.aClass722_4.aString248);
	}

	@OriginalMember(owner = "client!vs", name = "cg", descriptor = "()Z")
	public static boolean method32395() {
		return Class669.aTwitchTV1 != null && Class669.aTwitchTV1.IsStreaming();
	}

	@OriginalMember(owner = "client!vs", name = "cb", descriptor = "(Lclient!di;J)V")
	public static void method32396(@OriginalArg(0) Class102 arg0, @OriginalArg(1) long arg1) {
		arg0.method20683();
		aLinkedList7.clear();
		aLinkedList6.clear();
		aLong399 = ((long) (anInt5480 * -1814437725) + arg1) * -5746832404463840717L;
	}

	@OriginalMember(owner = "client!vs", name = "cw", descriptor = "(Lclient!di;J)V")
	public static void method32397(@OriginalArg(0) Class102 arg0, @OriginalArg(1) long arg1) {
		arg0.method20683();
		aLinkedList7.clear();
		aLinkedList6.clear();
		aLong399 = ((long) (anInt5480 * -1814437725) + arg1) * -5746832404463840717L;
	}

	@OriginalMember(owner = "client!vs", name = "bq", descriptor = "()I")
	public static int method32398() {
		return Class380.method28557((byte) 102) ? anInt5472 * -862856427 : 0;
	}

	@OriginalMember(owner = "client!vs", name = "dl", descriptor = "(I)I")
	public static int method32399(@OriginalArg(0) int arg0) {
		aTwitchWebcamFrameData1 = null;
		aClass99_38 = null;
		return arg0 >= 0 && arg0 < aTwitchWebcamDeviceArray1.length ? Class669.aTwitchTV1.StopWebcamDevice(aTwitchWebcamDeviceArray1[arg0].u * 1469731503) : -1;
	}

	@OriginalMember(owner = "client!vs", name = "cf", descriptor = "(Lclient!di;J)V")
	public static void method32400(@OriginalArg(0) Class102 arg0, @OriginalArg(1) long arg1) {
		arg0.method20683();
		aLinkedList7.clear();
		aLinkedList6.clear();
		aLong399 = ((long) (anInt5480 * -1814437725) + arg1) * -5746832404463840717L;
	}

	@OriginalMember(owner = "client!vs", name = "dj", descriptor = "()I")
	public static int method32401() {
		return Class669.aTwitchTV1.GetViewerCount();
	}

	@OriginalMember(owner = "client!vs", name = "cz", descriptor = "(Lclient!com/jagex/twitchtv/TwitchEvent;J)Z")
	static boolean method32402(@OriginalArg(0) TwitchEvent arg0, @OriginalArg(1) long arg1) {
		if (!aBoolean935) {
			switch(arg0.eventType) {
				case 7:
				case 8:
				case 9:
					return false;
			}
		}
		@Pc(19) int local19;
		if (arg0.eventType != 33) {
			if (arg0.eventType == 30) {
				local19 = ((TwitchEventResult) arg0).result;
				if (local19 == 0 || local19 == 1) {
					Class27.method646((byte) 16);
				} else if (local19 == 2) {
					aLong401 = arg1 * 6599029287603157643L;
				}
			}
			if (arg0.eventType == 34) {
				Class506.aTwitchEventLiveStreams1 = (TwitchEventLiveStreams) arg0;
				Class436.method29129(34, 0, 1816397044);
			}
			return true;
		} else if (aTwitchWebcamFrameData1 == null) {
			return false;
		} else {
			local19 = ((TwitchEventResult) arg0).result;
			@Pc(24) int local24 = Class669.aTwitchTV1.GetWebcamFrameData(local19, aTwitchWebcamFrameData1);
			if (local24 == 0) {
				if (aBoolean938) {
					aTwitchWebcamFrameData1.t();
				}
				if (aBoolean939) {
					aTwitchWebcamFrameData1.f();
				}
				Class329.method27754(67002945);
				aLong401 = arg1 * 6599029287603157643L;
				Class436.method29129(33, 0, 965246107);
			} else {
				aClass99_38 = null;
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!vs", name = "cq", descriptor = "(II)V")
	static void method32403(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) TwitchEventResult local5 = new TwitchEventResult(arg0, arg1);
		@Pc(8) Class601 local8 = local5.f();
		if (local8 != null) {
			Class312.method27463(local8.method37268(), local5, (byte) -14);
		}
	}

	@OriginalMember(owner = "client!vs", name = "dg", descriptor = "()V")
	static void method32404() {
		if (aClass99_38 != null && aClass99_38.method18218() == aTwitchWebcamFrameData1.width && aClass99_38.method18219() == aTwitchWebcamFrameData1.height) {
			aClass99_38.method18221(0, 0, aTwitchWebcamFrameData1.width, aTwitchWebcamFrameData1.height, aTwitchWebcamFrameData1.buffer, 0, aTwitchWebcamFrameData1.width);
		} else {
			aClass99_38 = Class279.aClass102_9.method20740(aTwitchWebcamFrameData1.buffer, 0, aTwitchWebcamFrameData1.width, aTwitchWebcamFrameData1.width, aTwitchWebcamFrameData1.height, false);
		}
	}

	@OriginalMember(owner = "client!vs", name = "dh", descriptor = "()V")
	static void method32405() {
		if (aClass99_38 != null && aClass99_38.method18218() == aTwitchWebcamFrameData1.width && aClass99_38.method18219() == aTwitchWebcamFrameData1.height) {
			aClass99_38.method18221(0, 0, aTwitchWebcamFrameData1.width, aTwitchWebcamFrameData1.height, aTwitchWebcamFrameData1.buffer, 0, aTwitchWebcamFrameData1.width);
		} else {
			aClass99_38 = Class279.aClass102_9.method20740(aTwitchWebcamFrameData1.buffer, 0, aTwitchWebcamFrameData1.width, aTwitchWebcamFrameData1.width, aTwitchWebcamFrameData1.height, false);
		}
	}

	@OriginalMember(owner = "client!vs", name = "dd", descriptor = "()V")
	public static void method32406() {
		aClass99_38 = null;
	}

	@OriginalMember(owner = "client!vs", name = "dc", descriptor = "()V")
	public static void method32407() {
		aClass99_38 = null;
	}

	@OriginalMember(owner = "client!vs", name = "dn", descriptor = "()V")
	public static void method32408() {
		aClass99_38 = null;
	}

	@OriginalMember(owner = "client!vs", name = "df", descriptor = "(II)I")
	public static int method32409(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		aTwitchWebcamFrameData1 = new TwitchWebcamFrameData();
		return arg0 >= 0 && arg0 < aTwitchWebcamDeviceArray1.length ? Class669.aTwitchTV1.StartWebcamDevice(aTwitchWebcamDeviceArray1[arg0].u * 1469731503, arg1) : -1;
	}

	@OriginalMember(owner = "client!vs", name = "db", descriptor = "(I)I")
	public static int method32410(@OriginalArg(0) int arg0) {
		aTwitchWebcamFrameData1 = null;
		aClass99_38 = null;
		return arg0 >= 0 && arg0 < aTwitchWebcamDeviceArray1.length ? Class669.aTwitchTV1.StopWebcamDevice(aTwitchWebcamDeviceArray1[arg0].u * 1469731503) : -1;
	}

	@OriginalMember(owner = "client!vs", name = "dt", descriptor = "(I)I")
	public static int method32411(@OriginalArg(0) int arg0) {
		aTwitchWebcamFrameData1 = null;
		aClass99_38 = null;
		return arg0 >= 0 && arg0 < aTwitchWebcamDeviceArray1.length ? Class669.aTwitchTV1.StopWebcamDevice(aTwitchWebcamDeviceArray1[arg0].u * 1469731503) : -1;
	}

	@OriginalMember(owner = "client!vs", name = "du", descriptor = "()V")
	static void method32412() {
		aTwitchWebcamDeviceArray1 = Class669.aTwitchTV1.GetWebcamDevices();
	}

	@OriginalMember(owner = "client!vs", name = "ds", descriptor = "()V")
	static void method32413() {
		aTwitchWebcamDeviceArray1 = Class669.aTwitchTV1.GetWebcamDevices();
	}

	@OriginalMember(owner = "client!vs", name = "dw", descriptor = "()V")
	static void method32414() {
		aTwitchWebcamDeviceArray1 = Class669.aTwitchTV1.GetWebcamDevices();
	}

	@OriginalMember(owner = "client!vs", name = "dr", descriptor = "()I")
	public static int method32415() {
		return aTwitchWebcamDeviceArray1 == null ? 0 : aTwitchWebcamDeviceArray1.length;
	}

	@OriginalMember(owner = "client!vs", name = "cm", descriptor = "()Z")
	public static boolean method32416() {
		return aBoolean934;
	}

	@OriginalMember(owner = "client!vs", name = "cy", descriptor = "(Z)V")
	public static void method32417(@OriginalArg(0) boolean arg0) {
		if (arg0 != aBoolean937) {
			Class100.method2954(1072422008);
			aBoolean937 = arg0;
		}
	}

	@OriginalMember(owner = "client!vs", name = "dv", descriptor = "(Ljava/lang/String;)Lclient!com/jagex/twitchtv/TwitchWebcamDevice;")
	public static TwitchWebcamDevice method32418(@OriginalArg(0) String arg0) {
		if (aTwitchWebcamDeviceArray1 == null) {
			return null;
		}
		for (@Pc(6) int local6 = 0; local6 < aTwitchWebcamDeviceArray1.length; local6++) {
			if (aTwitchWebcamDeviceArray1[local6].t.equals(arg0)) {
				return aTwitchWebcamDeviceArray1[local6];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!vs", name = "cp", descriptor = "()Z")
	public static boolean method32419() {
		return aBoolean934;
	}

	@OriginalMember(owner = "client!vs", name = "dq", descriptor = "(ZZ)V")
	public static void method32420(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		aBoolean938 = arg0;
		aBoolean939 = arg1;
	}

	@OriginalMember(owner = "client!vs", name = "bs", descriptor = "()I")
	static int method32421() {
		@Pc(1) int local1;
		try {
			for (local1 = 0; local1 < aStringArray32.length; local1++) {
				if (aStringArray32[local1] != null && aBooleanArray33[local1]) {
					Class588.method31902(350319923).method31859(aStringArray32[local1], -1151945848);
				}
			}
		} catch (@Pc(25) Exception_Sub7 local25) {
			return 3;
		}
		Class669.aTwitchTV1 = new TwitchTV();
		local1 = Class669.aTwitchTV1.InitialiseTTV(Class501.method30419(1804487589));
		if (local1 == 0) {
			aBoolean936 = true;
		} else {
			Class603.method32133(10 + Class256.aString157 + local1, new RuntimeException(), 839300151);
		}
		return 2;
	}

	@OriginalMember(owner = "client!vs", name = "dp", descriptor = "()I")
	public static int method32422() {
		return Class669.aTwitchTV1.GetViewerCount();
	}

	@OriginalMember(owner = "client!vs", name = "dx", descriptor = "(Ljava/lang/String;)Lclient!com/jagex/twitchtv/TwitchWebcamDevice;")
	public static TwitchWebcamDevice method32423(@OriginalArg(0) String arg0) {
		if (aTwitchWebcamDeviceArray1 == null) {
			return null;
		}
		for (@Pc(6) int local6 = 0; local6 < aTwitchWebcamDeviceArray1.length; local6++) {
			if (aTwitchWebcamDeviceArray1[local6].t.equals(arg0)) {
				return aTwitchWebcamDeviceArray1[local6];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!vs", name = "di", descriptor = "()I")
	public static int method32424() {
		return Class669.aTwitchTV1.GetViewerCount();
	}

	@OriginalMember(owner = "client!vs", name = "dz", descriptor = "()I")
	public static int method32425() {
		return Class669.aTwitchTV1.GetViewerCount();
	}

	@OriginalMember(owner = "client!vs", name = "ce", descriptor = "(Ljava/lang/String;)I")
	public static int method32426(@OriginalArg(0) String arg0) {
		return Class669.aTwitchTV1.ChatSendMessage(arg0);
	}

	@OriginalMember(owner = "client!vs", name = "da", descriptor = "(IIII)V")
	public static void method32427(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		aLinkedList7.addLast(new Class618(arg0, arg1, arg2 - arg0, arg3 - arg1));
	}

	@OriginalMember(owner = "client!vs", name = "dk", descriptor = "(IIII)V")
	public static void method32428(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		aLinkedList7.addLast(new Class618(arg0, arg1, arg2 - arg0, arg3 - arg1));
	}

	@OriginalMember(owner = "client!vs", name = "bv", descriptor = "()I")
	public static int method32429() {
		return Class669.aTwitchTV1.GetLoginState();
	}

	@OriginalMember(owner = "client!vs", name = "ev", descriptor = "()Z")
	public static boolean method32430() {
		if (Class531.aString220.startsWith("win")) {
			@Pc(5) String local5 = "msvcr110.dll";
			@Pc(7) String local7 = "msvcp110.dll";
			@Pc(18) String[] local18 = new String[] { local5, local7 };
			@Pc(21) String local21 = System.getenv("WINDIR");
			if (local21 == "") {
				return false;
			}
			for (@Pc(28) int local28 = 0; local28 < local18.length; local28++) {
				@Pc(48) File local48 = new File(local21 + "\\system32\\" + local18[local28]);
				if (!local48.exists() || local48.isDirectory()) {
					return false;
				}
			}
			return true;
		} else if (Class531.aString220.startsWith("mac")) {
			try {
				@Pc(68) Process local68 = Runtime.getRuntime().exec("ps -few");
				@Pc(77) BufferedReader local77 = new BufferedReader(new InputStreamReader(local68.getInputStream()));
				try {
					@Pc(80) int local80 = local68.waitFor();
					if (local80 != 0) {
						return false;
					}
				} catch (@Pc(86) InterruptedException local86) {
					return false;
				}
				@Pc(90) boolean local90 = false;
				@Pc(94) String local94;
				while ((local94 = local77.readLine()) != null) {
					if (local94.toLowerCase().indexOf("soundflowerbed") != -1) {
						local90 = true;
						break;
					}
				}
				local77.close();
				return local90;
			} catch (@Pc(109) Exception local109) {
				return false;
			}
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!vs", name = "ed", descriptor = "()Z")
	public static boolean method32431() {
		if (Class531.aString220.startsWith("win")) {
			@Pc(5) String local5 = "msvcr110.dll";
			@Pc(7) String local7 = "msvcp110.dll";
			@Pc(18) String[] local18 = new String[] { local5, local7 };
			@Pc(21) String local21 = System.getenv("WINDIR");
			if (local21 == "") {
				return false;
			}
			for (@Pc(28) int local28 = 0; local28 < local18.length; local28++) {
				@Pc(48) File local48 = new File(local21 + "\\system32\\" + local18[local28]);
				if (!local48.exists() || local48.isDirectory()) {
					return false;
				}
			}
			return true;
		} else if (Class531.aString220.startsWith("mac")) {
			try {
				@Pc(68) Process local68 = Runtime.getRuntime().exec("ps -few");
				@Pc(77) BufferedReader local77 = new BufferedReader(new InputStreamReader(local68.getInputStream()));
				try {
					@Pc(80) int local80 = local68.waitFor();
					if (local80 != 0) {
						return false;
					}
				} catch (@Pc(86) InterruptedException local86) {
					return false;
				}
				@Pc(90) boolean local90 = false;
				@Pc(94) String local94;
				while ((local94 = local77.readLine()) != null) {
					if (local94.toLowerCase().indexOf("soundflowerbed") != -1) {
						local90 = true;
						break;
					}
				}
				local77.close();
				return local90;
			} catch (@Pc(109) Exception local109) {
				return false;
			}
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!vs", name = "eo", descriptor = "()Z")
	public static boolean method32432() {
		if (Class531.aString220.startsWith("win")) {
			@Pc(5) String local5 = "msvcr110.dll";
			@Pc(7) String local7 = "msvcp110.dll";
			@Pc(18) String[] local18 = new String[] { local5, local7 };
			@Pc(21) String local21 = System.getenv("WINDIR");
			if (local21 == "") {
				return false;
			}
			for (@Pc(28) int local28 = 0; local28 < local18.length; local28++) {
				@Pc(48) File local48 = new File(local21 + "\\system32\\" + local18[local28]);
				if (!local48.exists() || local48.isDirectory()) {
					return false;
				}
			}
			return true;
		} else if (Class531.aString220.startsWith("mac")) {
			try {
				@Pc(68) Process local68 = Runtime.getRuntime().exec("ps -few");
				@Pc(77) BufferedReader local77 = new BufferedReader(new InputStreamReader(local68.getInputStream()));
				try {
					@Pc(80) int local80 = local68.waitFor();
					if (local80 != 0) {
						return false;
					}
				} catch (@Pc(86) InterruptedException local86) {
					return false;
				}
				@Pc(90) boolean local90 = false;
				@Pc(94) String local94;
				while ((local94 = local77.readLine()) != null) {
					if (local94.toLowerCase().indexOf("soundflowerbed") != -1) {
						local90 = true;
						break;
					}
				}
				local77.close();
				return local90;
			} catch (@Pc(109) Exception local109) {
				return false;
			}
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!vs", name = "ep", descriptor = "()Z")
	public static boolean method32433() {
		if (Class531.aString220.startsWith("win")) {
			@Pc(5) String local5 = "msvcr110.dll";
			@Pc(7) String local7 = "msvcp110.dll";
			@Pc(18) String[] local18 = new String[] { local5, local7 };
			@Pc(21) String local21 = System.getenv("WINDIR");
			if (local21 == "") {
				return false;
			}
			for (@Pc(28) int local28 = 0; local28 < local18.length; local28++) {
				@Pc(48) File local48 = new File(local21 + "\\system32\\" + local18[local28]);
				if (!local48.exists() || local48.isDirectory()) {
					return false;
				}
			}
			return true;
		} else if (Class531.aString220.startsWith("mac")) {
			try {
				@Pc(68) Process local68 = Runtime.getRuntime().exec("ps -few");
				@Pc(77) BufferedReader local77 = new BufferedReader(new InputStreamReader(local68.getInputStream()));
				try {
					@Pc(80) int local80 = local68.waitFor();
					if (local80 != 0) {
						return false;
					}
				} catch (@Pc(86) InterruptedException local86) {
					return false;
				}
				@Pc(90) boolean local90 = false;
				@Pc(94) String local94;
				while ((local94 = local77.readLine()) != null) {
					if (local94.toLowerCase().indexOf("soundflowerbed") != -1) {
						local90 = true;
						break;
					}
				}
				local77.close();
				return local90;
			} catch (@Pc(109) Exception local109) {
				return false;
			}
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!vs", name = "up", descriptor = "(Lclient!yp;I)V")
	static void method32434(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2098530656);
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local16.anInt4111 * 458112843;
	}

	@OriginalMember(owner = "client!vs", name = "bbi", descriptor = "(Lclient!yp;B)V")
	static void method32435(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5778 -= -221471862;
	}

	@OriginalMember(owner = "client!vs", name = "t", descriptor = "(Ljava/lang/Class;II)Lclient!zg;")
	public static Interface75 method32436(@OriginalArg(0) Class arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Map local2 = Class702.aMap25;
		synchronized (Class702.aMap25) {
			@Pc(8) Map local8 = (Map) Class702.aMap25.get(arg0);
			if (local8 == null) {
				local8 = new HashMap();
				@Pc(19) Interface75[] local19 = (Interface75[]) arg0.getEnumConstants();
				for (@Pc(21) int local21 = 0; local21 < local19.length; local21++) {
					@Pc(29) Interface75 local29 = local19[local21];
					local8.put(local29.method37268(), local29);
				}
				Class702.aMap25.put(arg0, local8);
			}
			return (Interface75) local8.get(arg1);
		}
	}

	@OriginalMember(owner = "client!vs", name = "io", descriptor = "(J)V")
	static void method32437(@OriginalArg(0) long arg0) {
		if (client.aClass539_1.method30932(-1638462787) != null) {
			if (Class368.anInt4502 * -1583611537 == 2 || Class368.anInt4502 * -1583611537 == 1) {
				Class664.method33362(arg0);
			} else if (Class368.anInt4502 * -1583611537 == 4) {
				Class236.method26133(arg0);
			}
		}
		Class411.method28964(Class279.aClass102_9, (long) client.anInt3436);
		if (client.anInt3460 * 1849344509 != -1) {
			Class489.method30219(client.anInt3460 * 1849344509, 108158930);
		}
		@Pc(39) int local39;
		for (local39 = 0; local39 < client.anInt3530 * 14557067; local39++) {
			client.aBooleanArray20[local39] = client.aBooleanArray19[local39];
			client.aBooleanArray19[local39] = false;
		}
		client.anInt3560 = client.anInt3436 * -1141210301;
		Class646.method33048(-1, -1, (byte) -53);
		if (client.anInt3460 * 1849344509 != -1) {
			client.anInt3530 = 0;
			Class294.method26966((byte) -100);
		}
		Class279.aClass102_9.method20877();
		Class350.method28014(Class279.aClass102_9, 1119158746);
		local39 = Class570.method31724((byte) 22);
		if (local39 == -1) {
			local39 = client.anInt3502 * -1621806571;
		}
		if (local39 == -1) {
			local39 = client.anInt3521 * -1968123903;
		}
		Class289.method26925(local39, (byte) 0);
		@Pc(104) int local104 = Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.method18966((byte) -95) << 8;
		@Pc(108) Class463 local108 = Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.method24552().aClass463_61;
		Class641.method32899(Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aByte99, (int) local108.aFloat297 + local104, (int) local108.aFloat296 + local104, client.anInt3516 * -2136892027, 2072806603);
		client.anInt3516 = 0;
	}

	@OriginalMember(owner = "client!vs", name = "<init>", descriptor = "()V")
	Class622() throws Throwable {
		throw new Error();
	}
}
