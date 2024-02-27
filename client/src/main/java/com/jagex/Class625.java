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
import java.util.LinkedList;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vv")
public final class Class625 {

	@OriginalMember(owner = "client!vv", name = "n", descriptor = "I")
	static final int anInt5846 = 0;

	@OriginalMember(owner = "client!vv", name = "m", descriptor = "I")
	static final int anInt5847 = 1;

	@OriginalMember(owner = "client!vv", name = "k", descriptor = "I")
	static final int anInt5848 = 2;

	@OriginalMember(owner = "client!vv", name = "w", descriptor = "I")
	static final int anInt5849 = 0;

	@OriginalMember(owner = "client!vv", name = "aq", descriptor = "I")
	static final int anInt5850 = 2000;

	@OriginalMember(owner = "client!vv", name = "u", descriptor = "I")
	static final int anInt5851 = 2;

	@OriginalMember(owner = "client!vv", name = "f", descriptor = "I")
	static final int anInt5859 = 3;

	@OriginalMember(owner = "client!vv", name = "l", descriptor = "I")
	static final int anInt5861 = 1;

	@OriginalMember(owner = "client!vv", name = "e", descriptor = "Z")
	static boolean aBoolean855 = false;

	@OriginalMember(owner = "client!vv", name = "z", descriptor = "F")
	static float aFloat345 = 0.2F;

	@OriginalMember(owner = "client!vv", name = "p", descriptor = "I")
	static int anInt5860 = -605032173;

	@OriginalMember(owner = "client!vv", name = "d", descriptor = "I")
	static int anInt5856 = -1241089888;

	@OriginalMember(owner = "client!vv", name = "c", descriptor = "I")
	static int anInt5852 = 0;

	@OriginalMember(owner = "client!vv", name = "r", descriptor = "I")
	static int anInt5853 = 1673159120;

	@OriginalMember(owner = "client!vv", name = "v", descriptor = "I")
	static int anInt5857 = 0;

	@OriginalMember(owner = "client!vv", name = "o", descriptor = "I")
	static int anInt5854 = 0;

	@OriginalMember(owner = "client!vv", name = "s", descriptor = "[Z")
	static boolean[] aBooleanArray33 = null;

	@OriginalMember(owner = "client!vv", name = "y", descriptor = "[Ljava/lang/String;")
	static String[] aStringArray37 = null;

	@OriginalMember(owner = "client!vv", name = "q", descriptor = "Z")
	static boolean aBoolean857 = false;

	@OriginalMember(owner = "client!vv", name = "b", descriptor = "J")
	static long aLong295 = 0L;

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "J")
	static long aLong296 = 0L;

	@OriginalMember(owner = "client!vv", name = "g", descriptor = "J")
	static long aLong297 = 0L;

	@OriginalMember(owner = "client!vv", name = "i", descriptor = "I")
	static int anInt5855 = 0;

	@OriginalMember(owner = "client!vv", name = "j", descriptor = "Z")
	static boolean aBoolean858 = false;

	@OriginalMember(owner = "client!vv", name = "t", descriptor = "Z")
	static boolean aBoolean859 = false;

	@OriginalMember(owner = "client!vv", name = "ac", descriptor = "Lclient!com/jagex/twitchtv/TwitchWebcamFrameData;")
	static TwitchWebcamFrameData aTwitchWebcamFrameData1 = null;

	@OriginalMember(owner = "client!vv", name = "ai", descriptor = "Ljava/util/LinkedList;")
	static LinkedList aLinkedList8 = new LinkedList();

	@OriginalMember(owner = "client!vv", name = "aw", descriptor = "Ljava/util/LinkedList;")
	static LinkedList aLinkedList7 = new LinkedList();

	@OriginalMember(owner = "client!vv", name = "at", descriptor = "I")
	static int anInt5858 = 2118100395;

	@OriginalMember(owner = "client!vv", name = "ad", descriptor = "[Lclient!com/jagex/twitchtv/TwitchWebcamDevice;")
	static TwitchWebcamDevice[] aTwitchWebcamDeviceArray1 = null;

	@OriginalMember(owner = "client!vv", name = "am", descriptor = "J")
	static long aLong294 = 0L;

	@OriginalMember(owner = "client!vv", name = "au", descriptor = "Lclient!cm;")
	static Class100 aClass100_51 = null;

	@OriginalMember(owner = "client!vv", name = "ar", descriptor = "Z")
	static boolean aBoolean854 = false;

	@OriginalMember(owner = "client!vv", name = "ap", descriptor = "Z")
	static boolean aBoolean856 = false;

	@OriginalMember(owner = "client!vv", name = "do", descriptor = "()V")
	static void method32342() {
		if (aClass100_51 != null && aClass100_51.method18201() == aTwitchWebcamFrameData1.anInt3631 && aClass100_51.method18177() == aTwitchWebcamFrameData1.anInt3632) {
			aClass100_51.method18211(0, 0, aTwitchWebcamFrameData1.anInt3631, aTwitchWebcamFrameData1.anInt3632, aTwitchWebcamFrameData1.anIntArray334, 0, aTwitchWebcamFrameData1.anInt3631);
		} else {
			aClass100_51 = Class694.aClass104_14.method20499(aTwitchWebcamFrameData1.anIntArray334, 0, aTwitchWebcamFrameData1.anInt3631, aTwitchWebcamFrameData1.anInt3631, aTwitchWebcamFrameData1.anInt3632, false);
		}
	}

	@OriginalMember(owner = "client!vv", name = "ay", descriptor = "()V")
	public static void method32343() {
		anInt5858 = 2118100395;
	}

	@OriginalMember(owner = "client!vv", name = "bl", descriptor = "(Z)V")
	public static void method32344(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!vv", name = "ab", descriptor = "()V")
	public static void method32345() {
		anInt5858 = 2118100395;
	}

	@OriginalMember(owner = "client!vv", name = "az", descriptor = "()V")
	public static void method32346() {
		anInt5858 = 2118100395;
	}

	@OriginalMember(owner = "client!vv", name = "aa", descriptor = "()V")
	public static void method32347() {
		anInt5858 = 2118100395;
	}

	@OriginalMember(owner = "client!vv", name = "af", descriptor = "()I")
	public static int method32348() {
		return Class522.aTwitchEventLiveStreams1 == null || anInt5858 * 110744317 >= Class522.aTwitchEventLiveStreams1.anInt3603 - 1 ? -1 : (anInt5858 += -2118100395) * 110744317;
	}

	@OriginalMember(owner = "client!vv", name = "cn", descriptor = "(Z)V")
	public static void method32349(@OriginalArg(0) boolean arg0) {
		if (arg0 != aBoolean859) {
			Class312.method27015(-55312856);
			aBoolean859 = arg0;
		}
	}

	@OriginalMember(owner = "client!vv", name = "an", descriptor = "(Z)V")
	public static void method32350(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!vv", name = "bf", descriptor = "(Z)V")
	public static void method32351(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!vv", name = "bg", descriptor = "(IIIZ)I")
	public static int method32352(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		if (arg0 != 0 && (arg0 < 50 || arg0 > 100)) {
			arg0 = 0;
		}
		if (arg1 != 0 && (arg1 < 50 || arg1 > 100)) {
			arg1 = 0;
		}
		@Pc(24) boolean local24 = Class527.aString231.startsWith("mac");
		@Pc(38) int[] local38 = Class166_Sub13.aTwitchTV1.GetRecommendedSettings(Class553.anInt3408 * -1378711501, Class553.anInt3416 * 2091353777, arg0, 2000, arg2, aFloat345, local24);
		if (local38[0] != 0) {
			return local38[0];
		}
		@Pc(50) int local50 = local38[1];
		@Pc(54) int local54 = local38[2];
		@Pc(58) int local58 = local38[3];
		@Pc(60) int local60 = local58;
		aLong295 = 0L;
		Class314.aLong258 = (long) (1000.0F / (float) arg2) * -8879586755579799459L;
		Class314.anInt4104 = local50 * -674500143;
		Class17.anInt60 = local54 * -1530383635;
		if (arg1 != 0) {
			local58 = arg1 * local58 / 100;
		}
		Class314.method27032("Stream - Input: " + Class553.anInt3408 * -1378711501 + "x" + Class553.anInt3416 * 2091353777 + " (" + local60 + "kbps)" + " => " + "Output: " + local50 + "x" + local54 + " [" + (arg0 == 0 ? "auto" : arg0 + "%") + "] (" + local58 + "kbps [" + (arg1 == 0 ? "auto" : arg1 + "%") + "])", -2009366128);
		return Class166_Sub13.aTwitchTV1.StartStreaming(local50, local54, arg2, local58, arg1 != 0, aFloat345, anInt5860 * -473071333, arg3);
	}

	@OriginalMember(owner = "client!vv", name = "bk", descriptor = "(Z)V")
	public static void method32353(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!vv", name = "bs", descriptor = "()V")
	static void method32354() {
		aBoolean858 = false;
		Class364.anIntArray429 = null;
		Class183.anIntArray293 = null;
		aLinkedList8.clear();
		aLinkedList7.clear();
		Class694.aClass104_14.method20437();
	}

	@OriginalMember(owner = "client!vv", name = "bx", descriptor = "()I")
	public static int method32355() {
		return anInt5857 * 908241389;
	}

	@OriginalMember(owner = "client!vv", name = "bv", descriptor = "(IIIZ)I")
	public static int method32356(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		if (arg0 != 0 && (arg0 < 50 || arg0 > 100)) {
			arg0 = 0;
		}
		if (arg1 != 0 && (arg1 < 50 || arg1 > 100)) {
			arg1 = 0;
		}
		@Pc(24) boolean local24 = Class527.aString231.startsWith("mac");
		@Pc(38) int[] local38 = Class166_Sub13.aTwitchTV1.GetRecommendedSettings(Class553.anInt3408 * -1378711501, Class553.anInt3416 * 2091353777, arg0, 2000, arg2, aFloat345, local24);
		if (local38[0] != 0) {
			return local38[0];
		}
		@Pc(50) int local50 = local38[1];
		@Pc(54) int local54 = local38[2];
		@Pc(58) int local58 = local38[3];
		@Pc(60) int local60 = local58;
		aLong295 = 0L;
		Class314.aLong258 = (long) (1000.0F / (float) arg2) * -8879586755579799459L;
		Class314.anInt4104 = local50 * -674500143;
		Class17.anInt60 = local54 * -1530383635;
		if (arg1 != 0) {
			local58 = arg1 * local58 / 100;
		}
		Class314.method27032("Stream - Input: " + Class553.anInt3408 * -1378711501 + "x" + Class553.anInt3416 * 2091353777 + " (" + local60 + "kbps)" + " => " + "Output: " + local50 + "x" + local54 + " [" + (arg0 == 0 ? "auto" : arg0 + "%") + "] (" + local58 + "kbps [" + (arg1 == 0 ? "auto" : arg1 + "%") + "])", -1907314446);
		return Class166_Sub13.aTwitchTV1.StartStreaming(local50, local54, arg2, local58, arg1 != 0, aFloat345, anInt5860 * -473071333, arg3);
	}

	@OriginalMember(owner = "client!vv", name = "bc", descriptor = "()I")
	static int method32357() {
		@Pc(1) int local1;
		try {
			for (local1 = 0; local1 < aStringArray37.length; local1++) {
				if (aStringArray37[local1] != null && aBooleanArray33[local1]) {
					Class376.method28227(672839876).method31798(aStringArray37[local1], (byte) -14);
				}
			}
		} catch (@Pc(25) Exception_Sub1 local25) {
			return 3;
		}
		Class166_Sub13.aTwitchTV1 = new TwitchTV();
		local1 = Class166_Sub13.aTwitchTV1.InitialiseTTV(Class646.method32790(2050472731));
		if (local1 == 0) {
			aBoolean857 = true;
		} else {
			Class646.method32791(10 + Class430.aString213 + local1, new RuntimeException(), 1781592432);
		}
		return 2;
	}

	@OriginalMember(owner = "client!vv", name = "bi", descriptor = "()I")
	static int method32358() {
		@Pc(1) int local1;
		try {
			for (local1 = 0; local1 < aStringArray37.length; local1++) {
				if (aStringArray37[local1] != null && aBooleanArray33[local1]) {
					Class376.method28227(672839876).method31798(aStringArray37[local1], (byte) -39);
				}
			}
		} catch (@Pc(25) Exception_Sub1 local25) {
			return 3;
		}
		Class166_Sub13.aTwitchTV1 = new TwitchTV();
		local1 = Class166_Sub13.aTwitchTV1.InitialiseTTV(Class646.method32790(2050472731));
		if (local1 == 0) {
			aBoolean857 = true;
		} else {
			Class646.method32791(10 + Class430.aString213 + local1, new RuntimeException(), 772298247);
		}
		return 2;
	}

	@OriginalMember(owner = "client!vv", name = "bb", descriptor = "()I")
	public static int method32359() {
		if (aBoolean857) {
			Class572.method31514(Class694.aClass104_14, -2084299179);
			return Class166_Sub13.aTwitchTV1.Logout();
		} else {
			return 12;
		}
	}

	@OriginalMember(owner = "client!vv", name = "bt", descriptor = "(Ljava/lang/String;Ljava/lang/String;)I")
	public static int method32360(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (aBoolean857) {
			return Class330.method27465(-1844262649) == client.aClass175_2 ? Class166_Sub13.aTwitchTV1.Login(arg0, arg1) : 42;
		} else {
			return 12;
		}
	}

	@OriginalMember(owner = "client!vv", name = "bq", descriptor = "()I")
	public static int method32361() {
		return Class166_Sub13.aTwitchTV1.GetLoginState();
	}

	@OriginalMember(owner = "client!vv", name = "cf", descriptor = "()I")
	public static int method32362() {
		return Class166_Sub13.aTwitchTV1.GetWebcamState();
	}

	@OriginalMember(owner = "client!vv", name = "ci", descriptor = "()I")
	public static int method32363() {
		return Class361.method27984(862937808) ? anInt5855 * 749355381 : 0;
	}

	@OriginalMember(owner = "client!vv", name = "bj", descriptor = "(Lclient!dh;)I")
	public static int method32364(@OriginalArg(0) Class104 arg0) {
		Class312.method27015(279615937);
		return Class166_Sub13.aTwitchTV1.StopStreaming();
	}

	@OriginalMember(owner = "client!vv", name = "by", descriptor = "()I")
	public static int method32365() {
		return Class166_Sub13.aTwitchTV1.GetStreamState();
	}

	@OriginalMember(owner = "client!vv", name = "bu", descriptor = "()I")
	public static int method32366() {
		return Class166_Sub13.aTwitchTV1.GetStreamState();
	}

	@OriginalMember(owner = "client!vv", name = "bw", descriptor = "()I")
	public static int method32367() {
		return Class166_Sub13.aTwitchTV1.GetStreamState();
	}

	@OriginalMember(owner = "client!vv", name = "bo", descriptor = "(IIIZ)I")
	public static int method32368(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		if (arg0 != 0 && (arg0 < 50 || arg0 > 100)) {
			arg0 = 0;
		}
		if (arg1 != 0 && (arg1 < 50 || arg1 > 100)) {
			arg1 = 0;
		}
		@Pc(24) boolean local24 = Class527.aString231.startsWith("mac");
		@Pc(38) int[] local38 = Class166_Sub13.aTwitchTV1.GetRecommendedSettings(Class553.anInt3408 * -1378711501, Class553.anInt3416 * 2091353777, arg0, 2000, arg2, aFloat345, local24);
		if (local38[0] != 0) {
			return local38[0];
		}
		@Pc(50) int local50 = local38[1];
		@Pc(54) int local54 = local38[2];
		@Pc(58) int local58 = local38[3];
		@Pc(60) int local60 = local58;
		aLong295 = 0L;
		Class314.aLong258 = (long) (1000.0F / (float) arg2) * -8879586755579799459L;
		Class314.anInt4104 = local50 * -674500143;
		Class17.anInt60 = local54 * -1530383635;
		if (arg1 != 0) {
			local58 = arg1 * local58 / 100;
		}
		Class314.method27032("Stream - Input: " + Class553.anInt3408 * -1378711501 + "x" + Class553.anInt3416 * 2091353777 + " (" + local60 + "kbps)" + " => " + "Output: " + local50 + "x" + local54 + " [" + (arg0 == 0 ? "auto" : arg0 + "%") + "] (" + local58 + "kbps [" + (arg1 == 0 ? "auto" : arg1 + "%") + "])", -1953780599);
		return Class166_Sub13.aTwitchTV1.StartStreaming(local50, local54, arg2, local58, arg1 != 0, aFloat345, anInt5860 * -473071333, arg3);
	}

	@OriginalMember(owner = "client!vv", name = "bz", descriptor = "(IIIZ)I")
	public static int method32369(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		if (arg0 != 0 && (arg0 < 50 || arg0 > 100)) {
			arg0 = 0;
		}
		if (arg1 != 0 && (arg1 < 50 || arg1 > 100)) {
			arg1 = 0;
		}
		@Pc(24) boolean local24 = Class527.aString231.startsWith("mac");
		@Pc(38) int[] local38 = Class166_Sub13.aTwitchTV1.GetRecommendedSettings(Class553.anInt3408 * -1378711501, Class553.anInt3416 * 2091353777, arg0, 2000, arg2, aFloat345, local24);
		if (local38[0] != 0) {
			return local38[0];
		}
		@Pc(50) int local50 = local38[1];
		@Pc(54) int local54 = local38[2];
		@Pc(58) int local58 = local38[3];
		@Pc(60) int local60 = local58;
		aLong295 = 0L;
		Class314.aLong258 = (long) (1000.0F / (float) arg2) * -8879586755579799459L;
		Class314.anInt4104 = local50 * -674500143;
		Class17.anInt60 = local54 * -1530383635;
		if (arg1 != 0) {
			local58 = arg1 * local58 / 100;
		}
		Class314.method27032("Stream - Input: " + Class553.anInt3408 * -1378711501 + "x" + Class553.anInt3416 * 2091353777 + " (" + local60 + "kbps)" + " => " + "Output: " + local50 + "x" + local54 + " [" + (arg0 == 0 ? "auto" : arg0 + "%") + "] (" + local58 + "kbps [" + (arg1 == 0 ? "auto" : arg1 + "%") + "])", -1847983142);
		return Class166_Sub13.aTwitchTV1.StartStreaming(local50, local54, arg2, local58, arg1 != 0, aFloat345, anInt5860 * -473071333, arg3);
	}

	@OriginalMember(owner = "client!vv", name = "bn", descriptor = "()I")
	static int method32370() {
		@Pc(1) int local1;
		try {
			for (local1 = 0; local1 < aStringArray37.length; local1++) {
				if (aStringArray37[local1] != null && aBooleanArray33[local1]) {
					Class376.method28227(672839876).method31798(aStringArray37[local1], (byte) 10);
				}
			}
		} catch (@Pc(25) Exception_Sub1 local25) {
			return 3;
		}
		Class166_Sub13.aTwitchTV1 = new TwitchTV();
		local1 = Class166_Sub13.aTwitchTV1.InitialiseTTV(Class646.method32790(2050472731));
		if (local1 == 0) {
			aBoolean857 = true;
		} else {
			Class646.method32791(10 + Class430.aString213 + local1, new RuntimeException(), 992044427);
		}
		return 2;
	}

	@OriginalMember(owner = "client!vv", name = "br", descriptor = "(IIIZ)I")
	public static int method32371(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		if (arg0 != 0 && (arg0 < 50 || arg0 > 100)) {
			arg0 = 0;
		}
		if (arg1 != 0 && (arg1 < 50 || arg1 > 100)) {
			arg1 = 0;
		}
		@Pc(24) boolean local24 = Class527.aString231.startsWith("mac");
		@Pc(38) int[] local38 = Class166_Sub13.aTwitchTV1.GetRecommendedSettings(Class553.anInt3408 * -1378711501, Class553.anInt3416 * 2091353777, arg0, 2000, arg2, aFloat345, local24);
		if (local38[0] != 0) {
			return local38[0];
		}
		@Pc(50) int local50 = local38[1];
		@Pc(54) int local54 = local38[2];
		@Pc(58) int local58 = local38[3];
		@Pc(60) int local60 = local58;
		aLong295 = 0L;
		Class314.aLong258 = (long) (1000.0F / (float) arg2) * -8879586755579799459L;
		Class314.anInt4104 = local50 * -674500143;
		Class17.anInt60 = local54 * -1530383635;
		if (arg1 != 0) {
			local58 = arg1 * local58 / 100;
		}
		Class314.method27032("Stream - Input: " + Class553.anInt3408 * -1378711501 + "x" + Class553.anInt3416 * 2091353777 + " (" + local60 + "kbps)" + " => " + "Output: " + local50 + "x" + local54 + " [" + (arg0 == 0 ? "auto" : arg0 + "%") + "] (" + local58 + "kbps [" + (arg1 == 0 ? "auto" : arg1 + "%") + "])", -2083493911);
		return Class166_Sub13.aTwitchTV1.StartStreaming(local50, local54, arg2, local58, arg1 != 0, aFloat345, anInt5860 * -473071333, arg3);
	}

	@OriginalMember(owner = "client!vv", name = "cz", descriptor = "()Z")
	public static boolean method32372() {
		return Class166_Sub13.aTwitchTV1 != null && Class166_Sub13.aTwitchTV1.IsStreaming();
	}

	@OriginalMember(owner = "client!vv", name = "ba", descriptor = "(Lclient!dh;)I")
	public static int method32373(@OriginalArg(0) Class104 arg0) {
		Class312.method27015(-977516771);
		return Class166_Sub13.aTwitchTV1.StopStreaming();
	}

	@OriginalMember(owner = "client!vv", name = "bp", descriptor = "(Lclient!dh;)I")
	public static int method32374(@OriginalArg(0) Class104 arg0) {
		Class312.method27015(-170639724);
		return Class166_Sub13.aTwitchTV1.StopStreaming();
	}

	@OriginalMember(owner = "client!vv", name = "bm", descriptor = "()I")
	public static int method32375() {
		return Class166_Sub13.aTwitchTV1.GetLoginState();
	}

	@OriginalMember(owner = "client!vv", name = "cy", descriptor = "(Lclient!dh;JII)V")
	public static void method32376(@OriginalArg(0) Class104 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(9) int local9;
		if (arg0.method20671() && arg0.method20813() > -1) {
			local9 = arg0.method20813();
			@Pc(11) Class626 local11 = null;
			if (!aLinkedList7.isEmpty()) {
				local11 = (Class626) aLinkedList7.getFirst();
			}
			if (local11 != null && local11.anInt5862 * -471012383 == local9) {
				aLinkedList7.removeFirst();
				arg0.method20514();
				@Pc(39) boolean local39 = false;
				@Pc(64) int local64;
				if (local11.aLinkedList9.isEmpty() && arg0.method20464()) {
					@Pc(55) long local55 = arg0.method20469(Class314.anInt4104 * 1161430833, Class17.anInt60 * -1559495963);
					local64 = Class166_Sub13.aTwitchTV1.SubmitFrame(local55, arg0.method20615(), aBoolean859, arg2, arg3);
					arg0.method20470(local55);
				} else {
					arg0.method20471(Class314.anInt4104 * 1161430833, Class17.anInt60 * -1559495963, Class364.anIntArray429, Class183.anIntArray293);
					Class347.method27703(Class364.anIntArray429, local11.aLinkedList9, local11.anInt5864 * 2135765083, local11.anInt5863 * 430444085, local11.aFloat346, 1174492281);
					local64 = Class166_Sub13.aTwitchTV1.SubmitFrameRaw(Class364.anIntArray429, aBoolean859, arg2, arg3);
				}
				arg0.method20515();
				if (local64 == 2072) {
					aLong296 = arg1 * -4106413465911637191L;
				} else if (local64 == 23) {
					aLong297 = arg1 * 8308705867590167991L;
				} else if (local64 != -995 && local64 != 0) {
				}
			} else {
				arg0.method20467();
				aLinkedList7.clear();
			}
		}
		if (!aBoolean858) {
			return;
		}
		if (Class364.anIntArray429 == null) {
			Class364.anIntArray429 = new int[aBoolean859 ? arg3 * arg2 : Class314.anInt4104 * 1161430833 * -1559495963 * Class17.anInt60];
			Class183.anIntArray293 = new int[aBoolean859 ? arg3 * arg2 : Class314.anInt4104 * 1161430833 * Class17.anInt60 * -1559495963];
		}
		if (arg0.method20671()) {
			arg0.method20474(client.anInt3485, Class314.anInt4104 * 1161430833, Class17.anInt60 * -1559495963);
			aLinkedList7.add(new Class626(client.anInt3485, aLinkedList8, arg0.anInt2899 * 1081362515, arg0.anInt2903 * -779214253, arg0.aFloat199));
			aLinkedList8 = new LinkedList();
		} else {
			arg0.method20514();
			arg0.method20471(Class314.anInt4104 * 1161430833, Class17.anInt60 * -1559495963, Class364.anIntArray429, Class183.anIntArray293);
			Class347.method27703(Class364.anIntArray429, aLinkedList8, arg0.anInt2899 * 1081362515, arg0.anInt2903 * -779214253, arg0.aFloat199, 808916729);
			local9 = Class166_Sub13.aTwitchTV1.SubmitFrameRaw(Class364.anIntArray429, aBoolean859, arg2, arg3);
			arg0.method20515();
			aLinkedList8.clear();
			if (local9 == 2072) {
				aLong296 = arg1 * -4106413465911637191L;
			} else if (local9 == 23) {
				aLong297 = arg1 * 8308705867590167991L;
			} else if (local9 != -995 && local9 != 0) {
			}
		}
		aBoolean858 = false;
	}

	@OriginalMember(owner = "client!vv", name = "cl", descriptor = "(Ljava/lang/String;)I")
	public static int method32377(@OriginalArg(0) String arg0) {
		return Class166_Sub13.aTwitchTV1.SetStreamTitle(arg0, client.aClass702_4.aString251);
	}

	@OriginalMember(owner = "client!vv", name = "cg", descriptor = "(Ljava/lang/String;)I")
	public static int method32378(@OriginalArg(0) String arg0) {
		return Class166_Sub13.aTwitchTV1.SetStreamTitle(arg0, client.aClass702_4.aString251);
	}

	@OriginalMember(owner = "client!vv", name = "cv", descriptor = "(Z)V")
	public static void method32379(@OriginalArg(0) boolean arg0) {
		if (arg0 != aBoolean859) {
			Class312.method27015(-732782839);
			aBoolean859 = arg0;
		}
	}

	@OriginalMember(owner = "client!vv", name = "bd", descriptor = "()I")
	public static int method32380() {
		return anInt5857 * 908241389;
	}

	@OriginalMember(owner = "client!vv", name = "cm", descriptor = "(Lclient!dh;J)V")
	public static void method32381(@OriginalArg(0) Class104 arg0, @OriginalArg(1) long arg1) {
		if (anInt5857 * 908241389 == 3 || anInt5857 * 908241389 == 0) {
			return;
		}
		@Pc(29) int local29;
		if (anInt5857 * 908241389 == 1) {
			if (aStringArray37 == null || aStringArray37.length == 0) {
				throw new RuntimeException("");
			}
			@Pc(27) int local27 = 0;
			for (local29 = 0; local29 < aStringArray37.length; local29++) {
				if (aStringArray37[local29] == null) {
					local27 += 100;
				} else {
					try {
						local27 += Class125_Sub1.aClass586_1.method31807(aStringArray37[local29], false, -570057832);
					} catch (@Pc(49) Exception_Sub5 local49) {
						Class166_Sub6.method15493(Class72.aClass72_1, local49.aString65, local49.anInt2491 * 1562390493, local49.getCause(), 1009876518);
						anInt5857 = -2024909905;
						return;
					}
				}
			}
			anInt5854 = local27 / aStringArray37.length * 279167647;
			if (anInt5854 * 662624607 != 100) {
				return;
			}
			anInt5857 = Class535.method30935(-709694321) * 756685797;
			if (anInt5857 * 908241389 != 2) {
				return;
			}
		}
		@Pc(93) TwitchEvent[] local93 = Class166_Sub13.aTwitchTV1.Service();
		if (local93 != null) {
			for (local29 = 0; local29 < local93.length; local29++) {
				@Pc(106) TwitchEvent local106 = local93[local29];
				if (local106 != null && Class490.method30159(local106, arg1)) {
					@Pc(116) Class591 local116 = local106.method25474();
					if (local116 != null) {
						Class707.method36932(local116.method37101(), local106, (byte) -86);
					}
				}
			}
		}
		if (Class166_Sub13.aTwitchTV1.IsStreaming() && arg1 - aLong295 * 8183709841810229893L > Class314.aLong258 * 4248725778911820789L) {
			aLong295 = arg1 * -341548231186129331L;
			if (arg0.method20507()) {
				aBoolean858 = true;
			}
		}
		if (!Class166_Sub13.aTwitchTV1.IsStreaming()) {
			anInt5855 = 0;
		} else if (arg1 - aLong296 * 3747471808327889673L < (long) (anInt5856 * -545714855)) {
			anInt5855 = -563900998;
		} else if (arg1 - aLong297 * 3642944995064872967L < (long) (anInt5856 * -545714855)) {
			anInt5855 = -281950499;
		} else {
			anInt5855 = 0;
		}
		if (arg1 - aLong294 * -3414142973785400119L > (long) (anInt5853 * 163263969) && Class166_Sub13.aTwitchTV1.GetWebcamState() == 5) {
			Class166_Sub13.aTwitchTV1.RestartWebcamDevice();
			aLong294 = arg1 * 273097735325007225L;
		}
	}

	@OriginalMember(owner = "client!vv", name = "cu", descriptor = "(Ljava/lang/String;)I")
	public static int method32382(@OriginalArg(0) String arg0) {
		return Class166_Sub13.aTwitchTV1.SetStreamTitle(arg0, client.aClass702_4.aString251);
	}

	@OriginalMember(owner = "client!vv", name = "cr", descriptor = "(Lclient!dh;J)V")
	public static void method32383(@OriginalArg(0) Class104 arg0, @OriginalArg(1) long arg1) {
		if (anInt5857 * 908241389 == 3 || anInt5857 * 908241389 == 0) {
			return;
		}
		@Pc(29) int local29;
		if (anInt5857 * 908241389 == 1) {
			if (aStringArray37 == null || aStringArray37.length == 0) {
				throw new RuntimeException("");
			}
			@Pc(27) int local27 = 0;
			for (local29 = 0; local29 < aStringArray37.length; local29++) {
				if (aStringArray37[local29] == null) {
					local27 += 100;
				} else {
					try {
						local27 += Class125_Sub1.aClass586_1.method31807(aStringArray37[local29], false, -2078688690);
					} catch (@Pc(49) Exception_Sub5 local49) {
						Class166_Sub6.method15493(Class72.aClass72_1, local49.aString65, local49.anInt2491 * 1562390493, local49.getCause(), 1267932758);
						anInt5857 = -2024909905;
						return;
					}
				}
			}
			anInt5854 = local27 / aStringArray37.length * 279167647;
			if (anInt5854 * 662624607 != 100) {
				return;
			}
			anInt5857 = Class535.method30935(-709694321) * 756685797;
			if (anInt5857 * 908241389 != 2) {
				return;
			}
		}
		@Pc(93) TwitchEvent[] local93 = Class166_Sub13.aTwitchTV1.Service();
		if (local93 != null) {
			for (local29 = 0; local29 < local93.length; local29++) {
				@Pc(106) TwitchEvent local106 = local93[local29];
				if (local106 != null && Class490.method30159(local106, arg1)) {
					@Pc(116) Class591 local116 = local106.method25474();
					if (local116 != null) {
						Class707.method36932(local116.method37101(), local106, (byte) -118);
					}
				}
			}
		}
		if (Class166_Sub13.aTwitchTV1.IsStreaming() && arg1 - aLong295 * 8183709841810229893L > Class314.aLong258 * 4248725778911820789L) {
			aLong295 = arg1 * -341548231186129331L;
			if (arg0.method20507()) {
				aBoolean858 = true;
			}
		}
		if (!Class166_Sub13.aTwitchTV1.IsStreaming()) {
			anInt5855 = 0;
		} else if (arg1 - aLong296 * 3747471808327889673L < (long) (anInt5856 * -545714855)) {
			anInt5855 = -563900998;
		} else if (arg1 - aLong297 * 3642944995064872967L < (long) (anInt5856 * -545714855)) {
			anInt5855 = -281950499;
		} else {
			anInt5855 = 0;
		}
		if (arg1 - aLong294 * -3414142973785400119L > (long) (anInt5853 * 163263969) && Class166_Sub13.aTwitchTV1.GetWebcamState() == 5) {
			Class166_Sub13.aTwitchTV1.RestartWebcamDevice();
			aLong294 = arg1 * 273097735325007225L;
		}
	}

	@OriginalMember(owner = "client!vv", name = "cp", descriptor = "()I")
	public static int method32384() {
		return Class166_Sub13.aTwitchTV1.GetChatState();
	}

	@OriginalMember(owner = "client!vv", name = "ca", descriptor = "(Ljava/lang/String;)I")
	public static int method32385(@OriginalArg(0) String arg0) {
		return Class166_Sub13.aTwitchTV1.ChatSendMessage(arg0);
	}

	@OriginalMember(owner = "client!vv", name = "cx", descriptor = "(Ljava/lang/String;)I")
	public static int method32386(@OriginalArg(0) String arg0) {
		return Class166_Sub13.aTwitchTV1.ChatSendMessage(arg0);
	}

	@OriginalMember(owner = "client!vv", name = "ct", descriptor = "()I")
	public static int method32387() {
		return Class166_Sub13.aTwitchTV1.GetWebcamState();
	}

	@OriginalMember(owner = "client!vv", name = "dt", descriptor = "(Lclient!com/jagex/twitchtv/TwitchEvent;J)Z")
	static boolean method32388(@OriginalArg(0) TwitchEvent arg0, @OriginalArg(1) long arg1) {
		if (!aBoolean855) {
			switch(arg0.anInt3605) {
				case 7:
				case 8:
				case 9:
					return false;
			}
		}
		@Pc(18) int local18;
		if (arg0.anInt3605 != 33) {
			if (arg0.anInt3605 == 30) {
				local18 = ((TwitchEventResult) arg0).anInt3606;
				if (local18 == 0 || local18 == 1) {
					Class387.method28423((short) -6171);
				} else if (local18 == 2) {
					aLong294 = arg1 * 273097735325007225L;
				}
			}
			if (arg0.anInt3605 == 34) {
				Class522.aTwitchEventLiveStreams1 = (TwitchEventLiveStreams) arg0;
				Class670.method33140(34, 0, (byte) 29);
			}
			return true;
		} else if (aTwitchWebcamFrameData1 == null) {
			return false;
		} else {
			local18 = ((TwitchEventResult) arg0).anInt3606;
			@Pc(23) int local23 = Class166_Sub13.aTwitchTV1.GetWebcamFrameData(local18, aTwitchWebcamFrameData1);
			if (local23 == 0) {
				if (aBoolean854) {
					aTwitchWebcamFrameData1.method25494();
				}
				if (aBoolean856) {
					aTwitchWebcamFrameData1.method25495();
				}
				Class491.method30160((byte) 119);
				aLong294 = arg1 * 273097735325007225L;
				Class670.method33140(33, 0, (byte) 82);
			} else {
				aClass100_51 = null;
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!vv", name = "cw", descriptor = "()Z")
	public static boolean method32389() {
		return Class527.aString231.startsWith("win");
	}

	@OriginalMember(owner = "client!vv", name = "dz", descriptor = "()V")
	public static void method32390() {
		aClass100_51 = null;
	}

	@OriginalMember(owner = "client!vv", name = "be", descriptor = "()I")
	public static int method32391() {
		if (aBoolean857) {
			Class572.method31514(Class694.aClass104_14, -2084498853);
			return Class166_Sub13.aTwitchTV1.Logout();
		} else {
			return 12;
		}
	}

	@OriginalMember(owner = "client!vv", name = "cq", descriptor = "(Lclient!dh;J)V")
	public static void method32392(@OriginalArg(0) Class104 arg0, @OriginalArg(1) long arg1) {
		if (anInt5857 * 908241389 == 3 || anInt5857 * 908241389 == 0) {
			return;
		}
		@Pc(29) int local29;
		if (anInt5857 * 908241389 == 1) {
			if (aStringArray37 == null || aStringArray37.length == 0) {
				throw new RuntimeException("");
			}
			@Pc(27) int local27 = 0;
			for (local29 = 0; local29 < aStringArray37.length; local29++) {
				if (aStringArray37[local29] == null) {
					local27 += 100;
				} else {
					try {
						local27 += Class125_Sub1.aClass586_1.method31807(aStringArray37[local29], false, 432382625);
					} catch (@Pc(49) Exception_Sub5 local49) {
						Class166_Sub6.method15493(Class72.aClass72_1, local49.aString65, local49.anInt2491 * 1562390493, local49.getCause(), 1487786762);
						anInt5857 = -2024909905;
						return;
					}
				}
			}
			anInt5854 = local27 / aStringArray37.length * 279167647;
			if (anInt5854 * 662624607 != 100) {
				return;
			}
			anInt5857 = Class535.method30935(-709694321) * 756685797;
			if (anInt5857 * 908241389 != 2) {
				return;
			}
		}
		@Pc(93) TwitchEvent[] local93 = Class166_Sub13.aTwitchTV1.Service();
		if (local93 != null) {
			for (local29 = 0; local29 < local93.length; local29++) {
				@Pc(106) TwitchEvent local106 = local93[local29];
				if (local106 != null && Class490.method30159(local106, arg1)) {
					@Pc(116) Class591 local116 = local106.method25474();
					if (local116 != null) {
						Class707.method36932(local116.method37101(), local106, (byte) -104);
					}
				}
			}
		}
		if (Class166_Sub13.aTwitchTV1.IsStreaming() && arg1 - aLong295 * 8183709841810229893L > Class314.aLong258 * 4248725778911820789L) {
			aLong295 = arg1 * -341548231186129331L;
			if (arg0.method20507()) {
				aBoolean858 = true;
			}
		}
		if (!Class166_Sub13.aTwitchTV1.IsStreaming()) {
			anInt5855 = 0;
		} else if (arg1 - aLong296 * 3747471808327889673L < (long) (anInt5856 * -545714855)) {
			anInt5855 = -563900998;
		} else if (arg1 - aLong297 * 3642944995064872967L < (long) (anInt5856 * -545714855)) {
			anInt5855 = -281950499;
		} else {
			anInt5855 = 0;
		}
		if (arg1 - aLong294 * -3414142973785400119L > (long) (anInt5853 * 163263969) && Class166_Sub13.aTwitchTV1.GetWebcamState() == 5) {
			Class166_Sub13.aTwitchTV1.RestartWebcamDevice();
			aLong294 = arg1 * 273097735325007225L;
		}
	}

	@OriginalMember(owner = "client!vv", name = "ch", descriptor = "(Lclient!dh;J)V")
	public static void method32393(@OriginalArg(0) Class104 arg0, @OriginalArg(1) long arg1) {
		if (anInt5857 * 908241389 == 3 || anInt5857 * 908241389 == 0) {
			return;
		}
		@Pc(29) int local29;
		if (anInt5857 * 908241389 == 1) {
			if (aStringArray37 == null || aStringArray37.length == 0) {
				throw new RuntimeException("");
			}
			@Pc(27) int local27 = 0;
			for (local29 = 0; local29 < aStringArray37.length; local29++) {
				if (aStringArray37[local29] == null) {
					local27 += 100;
				} else {
					try {
						local27 += Class125_Sub1.aClass586_1.method31807(aStringArray37[local29], false, -1325315785);
					} catch (@Pc(49) Exception_Sub5 local49) {
						Class166_Sub6.method15493(Class72.aClass72_1, local49.aString65, local49.anInt2491 * 1562390493, local49.getCause(), -507667428);
						anInt5857 = -2024909905;
						return;
					}
				}
			}
			anInt5854 = local27 / aStringArray37.length * 279167647;
			if (anInt5854 * 662624607 != 100) {
				return;
			}
			anInt5857 = Class535.method30935(-709694321) * 756685797;
			if (anInt5857 * 908241389 != 2) {
				return;
			}
		}
		@Pc(93) TwitchEvent[] local93 = Class166_Sub13.aTwitchTV1.Service();
		if (local93 != null) {
			for (local29 = 0; local29 < local93.length; local29++) {
				@Pc(106) TwitchEvent local106 = local93[local29];
				if (local106 != null && Class490.method30159(local106, arg1)) {
					@Pc(116) Class591 local116 = local106.method25474();
					if (local116 != null) {
						Class707.method36932(local116.method37101(), local106, (byte) -1);
					}
				}
			}
		}
		if (Class166_Sub13.aTwitchTV1.IsStreaming() && arg1 - aLong295 * 8183709841810229893L > Class314.aLong258 * 4248725778911820789L) {
			aLong295 = arg1 * -341548231186129331L;
			if (arg0.method20507()) {
				aBoolean858 = true;
			}
		}
		if (!Class166_Sub13.aTwitchTV1.IsStreaming()) {
			anInt5855 = 0;
		} else if (arg1 - aLong296 * 3747471808327889673L < (long) (anInt5856 * -545714855)) {
			anInt5855 = -563900998;
		} else if (arg1 - aLong297 * 3642944995064872967L < (long) (anInt5856 * -545714855)) {
			anInt5855 = -281950499;
		} else {
			anInt5855 = 0;
		}
		if (arg1 - aLong294 * -3414142973785400119L > (long) (anInt5853 * 163263969) && Class166_Sub13.aTwitchTV1.GetWebcamState() == 5) {
			Class166_Sub13.aTwitchTV1.RestartWebcamDevice();
			aLong294 = arg1 * 273097735325007225L;
		}
	}

	@OriginalMember(owner = "client!vv", name = "cb", descriptor = "(Lclient!dh;JII)V")
	public static void method32394(@OriginalArg(0) Class104 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(9) int local9;
		if (arg0.method20671() && arg0.method20813() > -1) {
			local9 = arg0.method20813();
			@Pc(11) Class626 local11 = null;
			if (!aLinkedList7.isEmpty()) {
				local11 = (Class626) aLinkedList7.getFirst();
			}
			if (local11 != null && local11.anInt5862 * -471012383 == local9) {
				aLinkedList7.removeFirst();
				arg0.method20514();
				@Pc(39) boolean local39 = false;
				@Pc(64) int local64;
				if (local11.aLinkedList9.isEmpty() && arg0.method20464()) {
					@Pc(55) long local55 = arg0.method20469(Class314.anInt4104 * 1161430833, Class17.anInt60 * -1559495963);
					local64 = Class166_Sub13.aTwitchTV1.SubmitFrame(local55, arg0.method20615(), aBoolean859, arg2, arg3);
					arg0.method20470(local55);
				} else {
					arg0.method20471(Class314.anInt4104 * 1161430833, Class17.anInt60 * -1559495963, Class364.anIntArray429, Class183.anIntArray293);
					Class347.method27703(Class364.anIntArray429, local11.aLinkedList9, local11.anInt5864 * 2135765083, local11.anInt5863 * 430444085, local11.aFloat346, -231076932);
					local64 = Class166_Sub13.aTwitchTV1.SubmitFrameRaw(Class364.anIntArray429, aBoolean859, arg2, arg3);
				}
				arg0.method20515();
				if (local64 == 2072) {
					aLong296 = arg1 * -4106413465911637191L;
				} else if (local64 == 23) {
					aLong297 = arg1 * 8308705867590167991L;
				} else if (local64 != -995 && local64 != 0) {
				}
			} else {
				arg0.method20467();
				aLinkedList7.clear();
			}
		}
		if (!aBoolean858) {
			return;
		}
		if (Class364.anIntArray429 == null) {
			Class364.anIntArray429 = new int[aBoolean859 ? arg3 * arg2 : Class314.anInt4104 * 1161430833 * -1559495963 * Class17.anInt60];
			Class183.anIntArray293 = new int[aBoolean859 ? arg3 * arg2 : Class314.anInt4104 * 1161430833 * Class17.anInt60 * -1559495963];
		}
		if (arg0.method20671()) {
			arg0.method20474(client.anInt3485, Class314.anInt4104 * 1161430833, Class17.anInt60 * -1559495963);
			aLinkedList7.add(new Class626(client.anInt3485, aLinkedList8, arg0.anInt2899 * 1081362515, arg0.anInt2903 * -779214253, arg0.aFloat199));
			aLinkedList8 = new LinkedList();
		} else {
			arg0.method20514();
			arg0.method20471(Class314.anInt4104 * 1161430833, Class17.anInt60 * -1559495963, Class364.anIntArray429, Class183.anIntArray293);
			Class347.method27703(Class364.anIntArray429, aLinkedList8, arg0.anInt2899 * 1081362515, arg0.anInt2903 * -779214253, arg0.aFloat199, 2128073043);
			local9 = Class166_Sub13.aTwitchTV1.SubmitFrameRaw(Class364.anIntArray429, aBoolean859, arg2, arg3);
			arg0.method20515();
			aLinkedList8.clear();
			if (local9 == 2072) {
				aLong296 = arg1 * -4106413465911637191L;
			} else if (local9 == 23) {
				aLong297 = arg1 * 8308705867590167991L;
			} else if (local9 != -995 && local9 != 0) {
			}
		}
		aBoolean858 = false;
	}

	@OriginalMember(owner = "client!vv", name = "co", descriptor = "(Lclient!dh;J)V")
	public static void method32395(@OriginalArg(0) Class104 arg0, @OriginalArg(1) long arg1) {
		if (anInt5857 * 908241389 == 3 || anInt5857 * 908241389 == 0) {
			return;
		}
		@Pc(29) int local29;
		if (anInt5857 * 908241389 == 1) {
			if (aStringArray37 == null || aStringArray37.length == 0) {
				throw new RuntimeException("");
			}
			@Pc(27) int local27 = 0;
			for (local29 = 0; local29 < aStringArray37.length; local29++) {
				if (aStringArray37[local29] == null) {
					local27 += 100;
				} else {
					try {
						local27 += Class125_Sub1.aClass586_1.method31807(aStringArray37[local29], false, -1214811439);
					} catch (@Pc(49) Exception_Sub5 local49) {
						Class166_Sub6.method15493(Class72.aClass72_1, local49.aString65, local49.anInt2491 * 1562390493, local49.getCause(), 121675884);
						anInt5857 = -2024909905;
						return;
					}
				}
			}
			anInt5854 = local27 / aStringArray37.length * 279167647;
			if (anInt5854 * 662624607 != 100) {
				return;
			}
			anInt5857 = Class535.method30935(-709694321) * 756685797;
			if (anInt5857 * 908241389 != 2) {
				return;
			}
		}
		@Pc(93) TwitchEvent[] local93 = Class166_Sub13.aTwitchTV1.Service();
		if (local93 != null) {
			for (local29 = 0; local29 < local93.length; local29++) {
				@Pc(106) TwitchEvent local106 = local93[local29];
				if (local106 != null && Class490.method30159(local106, arg1)) {
					@Pc(116) Class591 local116 = local106.method25474();
					if (local116 != null) {
						Class707.method36932(local116.method37101(), local106, (byte) -45);
					}
				}
			}
		}
		if (Class166_Sub13.aTwitchTV1.IsStreaming() && arg1 - aLong295 * 8183709841810229893L > Class314.aLong258 * 4248725778911820789L) {
			aLong295 = arg1 * -341548231186129331L;
			if (arg0.method20507()) {
				aBoolean858 = true;
			}
		}
		if (!Class166_Sub13.aTwitchTV1.IsStreaming()) {
			anInt5855 = 0;
		} else if (arg1 - aLong296 * 3747471808327889673L < (long) (anInt5856 * -545714855)) {
			anInt5855 = -563900998;
		} else if (arg1 - aLong297 * 3642944995064872967L < (long) (anInt5856 * -545714855)) {
			anInt5855 = -281950499;
		} else {
			anInt5855 = 0;
		}
		if (arg1 - aLong294 * -3414142973785400119L > (long) (anInt5853 * 163263969) && Class166_Sub13.aTwitchTV1.GetWebcamState() == 5) {
			Class166_Sub13.aTwitchTV1.RestartWebcamDevice();
			aLong294 = arg1 * 273097735325007225L;
		}
	}

	@OriginalMember(owner = "client!vv", name = "dd", descriptor = "(Lclient!dh;J)V")
	public static void method32396(@OriginalArg(0) Class104 arg0, @OriginalArg(1) long arg1) {
		arg0.method20437();
		aLinkedList8.clear();
		aLinkedList7.clear();
		aLong295 = (arg1 + (long) (anInt5852 * -712869369)) * -341548231186129331L;
	}

	@OriginalMember(owner = "client!vv", name = "cc", descriptor = "()Z")
	public static boolean method32397() {
		return aBoolean858;
	}

	@OriginalMember(owner = "client!vv", name = "du", descriptor = "()Z")
	public static boolean method32398() {
		if (Class527.aString231.startsWith("win")) {
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
		} else if (Class527.aString231.startsWith("mac")) {
			try {
				@Pc(68) Process local68 = Runtime.getRuntime().exec("ps -few");
				@Pc(77) BufferedReader local77 = new BufferedReader(new InputStreamReader(local68.getInputStream()));
				try {
					@Pc(80) int local80 = local68.waitFor();
					if (local80 != 0) {
						return false;
					}
				} catch (@Pc(87) InterruptedException local87) {
					return false;
				}
				@Pc(91) boolean local91 = false;
				@Pc(95) String local95;
				while ((local95 = local77.readLine()) != null) {
					if (local95.toLowerCase().indexOf("soundflowerbed") != -1) {
						local91 = true;
						break;
					}
				}
				local77.close();
				return local91;
			} catch (@Pc(110) Exception local110) {
				return false;
			}
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!vv", name = "ce", descriptor = "(Ljava/lang/String;)I")
	public static int method32399(@OriginalArg(0) String arg0) {
		return Class166_Sub13.aTwitchTV1.SetStreamTitle(arg0, client.aClass702_4.aString251);
	}

	@OriginalMember(owner = "client!vv", name = "cj", descriptor = "()Z")
	public static boolean method32400() {
		return Class166_Sub13.aTwitchTV1 != null && Class166_Sub13.aTwitchTV1.IsStreaming();
	}

	@OriginalMember(owner = "client!vv", name = "cd", descriptor = "(Lclient!dh;J)V")
	public static void method32401(@OriginalArg(0) Class104 arg0, @OriginalArg(1) long arg1) {
		arg0.method20437();
		aLinkedList8.clear();
		aLinkedList7.clear();
		aLong295 = (arg1 + (long) (anInt5852 * -712869369)) * -341548231186129331L;
	}

	@OriginalMember(owner = "client!vv", name = "ck", descriptor = "()Z")
	public static boolean method32402() {
		return Class166_Sub13.aTwitchTV1 != null && Class166_Sub13.aTwitchTV1.IsStreaming();
	}

	@OriginalMember(owner = "client!vv", name = "dr", descriptor = "(Lclient!com/jagex/twitchtv/TwitchEvent;J)Z")
	static boolean method32403(@OriginalArg(0) TwitchEvent arg0, @OriginalArg(1) long arg1) {
		if (!aBoolean855) {
			switch(arg0.anInt3605) {
				case 7:
				case 8:
				case 9:
					return false;
			}
		}
		@Pc(18) int local18;
		if (arg0.anInt3605 != 33) {
			if (arg0.anInt3605 == 30) {
				local18 = ((TwitchEventResult) arg0).anInt3606;
				if (local18 == 0 || local18 == 1) {
					Class387.method28423((short) -21770);
				} else if (local18 == 2) {
					aLong294 = arg1 * 273097735325007225L;
				}
			}
			if (arg0.anInt3605 == 34) {
				Class522.aTwitchEventLiveStreams1 = (TwitchEventLiveStreams) arg0;
				Class670.method33140(34, 0, (byte) 114);
			}
			return true;
		} else if (aTwitchWebcamFrameData1 == null) {
			return false;
		} else {
			local18 = ((TwitchEventResult) arg0).anInt3606;
			@Pc(23) int local23 = Class166_Sub13.aTwitchTV1.GetWebcamFrameData(local18, aTwitchWebcamFrameData1);
			if (local23 == 0) {
				if (aBoolean854) {
					aTwitchWebcamFrameData1.method25494();
				}
				if (aBoolean856) {
					aTwitchWebcamFrameData1.method25495();
				}
				Class491.method30160((byte) 113);
				aLong294 = arg1 * 273097735325007225L;
				Class670.method33140(33, 0, (byte) 25);
			} else {
				aClass100_51 = null;
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!vv", name = "da", descriptor = "(Lclient!com/jagex/twitchtv/TwitchEvent;J)Z")
	static boolean method32404(@OriginalArg(0) TwitchEvent arg0, @OriginalArg(1) long arg1) {
		if (!aBoolean855) {
			switch(arg0.anInt3605) {
				case 7:
				case 8:
				case 9:
					return false;
			}
		}
		@Pc(18) int local18;
		if (arg0.anInt3605 != 33) {
			if (arg0.anInt3605 == 30) {
				local18 = ((TwitchEventResult) arg0).anInt3606;
				if (local18 == 0 || local18 == 1) {
					Class387.method28423((short) -5946);
				} else if (local18 == 2) {
					aLong294 = arg1 * 273097735325007225L;
				}
			}
			if (arg0.anInt3605 == 34) {
				Class522.aTwitchEventLiveStreams1 = (TwitchEventLiveStreams) arg0;
				Class670.method33140(34, 0, (byte) 111);
			}
			return true;
		} else if (aTwitchWebcamFrameData1 == null) {
			return false;
		} else {
			local18 = ((TwitchEventResult) arg0).anInt3606;
			@Pc(23) int local23 = Class166_Sub13.aTwitchTV1.GetWebcamFrameData(local18, aTwitchWebcamFrameData1);
			if (local23 == 0) {
				if (aBoolean854) {
					aTwitchWebcamFrameData1.method25494();
				}
				if (aBoolean856) {
					aTwitchWebcamFrameData1.method25495();
				}
				Class491.method30160((byte) 100);
				aLong294 = arg1 * 273097735325007225L;
				Class670.method33140(33, 0, (byte) 15);
			} else {
				aClass100_51 = null;
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!vv", name = "ak", descriptor = "()Lclient!cm;")
	public static Class100 method32405() {
		return aClass100_51;
	}

	@OriginalMember(owner = "client!vv", name = "bh", descriptor = "()I")
	public static int method32406() {
		if (anInt5857 * 908241389 == 3) {
			return -1;
		} else if (anInt5857 * 908241389 == 0) {
			if (aStringArray37 == null) {
				if (Class527.aString231.startsWith("mac ")) {
					if (Class527.aString233.startsWith("ppc")) {
						anInt5857 = -2024909905;
						return -1;
					}
					aStringArray37 = new String[3];
					aStringArray37[0] = "sdk-mac-dynamic";
					aStringArray37[1] = "twitchsdk";
					aStringArray37[2] = "twitchtv";
					aBooleanArray33 = new boolean[3];
					aBooleanArray33[0] = false;
					aBooleanArray33[1] = false;
					aBooleanArray33[2] = true;
				} else if (Class527.aString231.startsWith("win")) {
					aStringArray37 = new String[6];
					aStringArray37[0] = "avutil-ttv-51";
					aStringArray37[1] = "libmp3lame-ttv";
					aStringArray37[2] = "swresample-ttv-0";
					aStringArray37[5] = "twitchtv";
					if (Class527.aString233.startsWith("amd64") || Class527.aString233.startsWith("x86_64")) {
						aStringArray37[3] = "libmfxsw64";
						aStringArray37[4] = "twitchsdk_64_release";
					} else if (Class527.aString233.startsWith("i386") || Class527.aString233.startsWith("i486") || Class527.aString233.startsWith("i586") || Class527.aString233.startsWith("x86")) {
						aStringArray37[3] = "libmfxsw32";
						aStringArray37[4] = "twitchsdk_32_release";
					} else {
						anInt5857 = -2024909905;
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
					anInt5857 = -2024909905;
					return -1;
				}
			}
			anInt5857 = 756685797;
			return 0;
		} else {
			return anInt5854 * 662624607;
		}
	}

	@OriginalMember(owner = "client!vv", name = "dv", descriptor = "(I)I")
	public static int method32407(@OriginalArg(0) int arg0) {
		aTwitchWebcamFrameData1 = null;
		aClass100_51 = null;
		return arg0 >= 0 && arg0 < aTwitchWebcamDeviceArray1.length ? Class166_Sub13.aTwitchTV1.StopWebcamDevice(aTwitchWebcamDeviceArray1[arg0].anInt3625 * -1975853991) : -1;
	}

	@OriginalMember(owner = "client!vv", name = "cs", descriptor = "(Lclient!dh;JII)V")
	public static void method32408(@OriginalArg(0) Class104 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(9) int local9;
		if (arg0.method20671() && arg0.method20813() > -1) {
			local9 = arg0.method20813();
			@Pc(11) Class626 local11 = null;
			if (!aLinkedList7.isEmpty()) {
				local11 = (Class626) aLinkedList7.getFirst();
			}
			if (local11 != null && local11.anInt5862 * -471012383 == local9) {
				aLinkedList7.removeFirst();
				arg0.method20514();
				@Pc(39) boolean local39 = false;
				@Pc(64) int local64;
				if (local11.aLinkedList9.isEmpty() && arg0.method20464()) {
					@Pc(55) long local55 = arg0.method20469(Class314.anInt4104 * 1161430833, Class17.anInt60 * -1559495963);
					local64 = Class166_Sub13.aTwitchTV1.SubmitFrame(local55, arg0.method20615(), aBoolean859, arg2, arg3);
					arg0.method20470(local55);
				} else {
					arg0.method20471(Class314.anInt4104 * 1161430833, Class17.anInt60 * -1559495963, Class364.anIntArray429, Class183.anIntArray293);
					Class347.method27703(Class364.anIntArray429, local11.aLinkedList9, local11.anInt5864 * 2135765083, local11.anInt5863 * 430444085, local11.aFloat346, 20290992);
					local64 = Class166_Sub13.aTwitchTV1.SubmitFrameRaw(Class364.anIntArray429, aBoolean859, arg2, arg3);
				}
				arg0.method20515();
				if (local64 == 2072) {
					aLong296 = arg1 * -4106413465911637191L;
				} else if (local64 == 23) {
					aLong297 = arg1 * 8308705867590167991L;
				} else if (local64 != -995 && local64 != 0) {
				}
			} else {
				arg0.method20467();
				aLinkedList7.clear();
			}
		}
		if (!aBoolean858) {
			return;
		}
		if (Class364.anIntArray429 == null) {
			Class364.anIntArray429 = new int[aBoolean859 ? arg3 * arg2 : Class314.anInt4104 * 1161430833 * -1559495963 * Class17.anInt60];
			Class183.anIntArray293 = new int[aBoolean859 ? arg3 * arg2 : Class314.anInt4104 * 1161430833 * Class17.anInt60 * -1559495963];
		}
		if (arg0.method20671()) {
			arg0.method20474(client.anInt3485, Class314.anInt4104 * 1161430833, Class17.anInt60 * -1559495963);
			aLinkedList7.add(new Class626(client.anInt3485, aLinkedList8, arg0.anInt2899 * 1081362515, arg0.anInt2903 * -779214253, arg0.aFloat199));
			aLinkedList8 = new LinkedList();
		} else {
			arg0.method20514();
			arg0.method20471(Class314.anInt4104 * 1161430833, Class17.anInt60 * -1559495963, Class364.anIntArray429, Class183.anIntArray293);
			Class347.method27703(Class364.anIntArray429, aLinkedList8, arg0.anInt2899 * 1081362515, arg0.anInt2903 * -779214253, arg0.aFloat199, 397757142);
			local9 = Class166_Sub13.aTwitchTV1.SubmitFrameRaw(Class364.anIntArray429, aBoolean859, arg2, arg3);
			arg0.method20515();
			aLinkedList8.clear();
			if (local9 == 2072) {
				aLong296 = arg1 * -4106413465911637191L;
			} else if (local9 == 23) {
				aLong297 = arg1 * 8308705867590167991L;
			} else if (local9 != -995 && local9 != 0) {
			}
		}
		aBoolean858 = false;
	}

	@OriginalMember(owner = "client!vv", name = "dm", descriptor = "(I)Lclient!com/jagex/twitchtv/TwitchWebcamDevice;")
	public static TwitchWebcamDevice method32409(@OriginalArg(0) int arg0) {
		if (aTwitchWebcamDeviceArray1 == null) {
			return null;
		}
		for (@Pc(5) int local5 = 0; local5 < aTwitchWebcamDeviceArray1.length; local5++) {
			if (arg0 == aTwitchWebcamDeviceArray1[local5].anInt3624 * -1015277237) {
				return aTwitchWebcamDeviceArray1[local5];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!vv", name = "dq", descriptor = "(Ljava/lang/String;)Lclient!com/jagex/twitchtv/TwitchWebcamDevice;")
	public static TwitchWebcamDevice method32410(@OriginalArg(0) String arg0) {
		if (aTwitchWebcamDeviceArray1 == null) {
			return null;
		}
		for (@Pc(6) int local6 = 0; local6 < aTwitchWebcamDeviceArray1.length; local6++) {
			if (aTwitchWebcamDeviceArray1[local6].aString153.equals(arg0)) {
				return aTwitchWebcamDeviceArray1[local6];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!vv", name = "dc", descriptor = "()I")
	public static int method32411() {
		Class522.aTwitchEventLiveStreams1 = null;
		return Class166_Sub13.aTwitchTV1.RequestLiveStreams(client.aClass702_4.aString251);
	}

	@OriginalMember(owner = "client!vv", name = "di", descriptor = "()I")
	public static int method32412() {
		return Class166_Sub13.aTwitchTV1.GetViewerCount();
	}

	@OriginalMember(owner = "client!vv", name = "dk", descriptor = "()I")
	public static int method32413() {
		return Class166_Sub13.aTwitchTV1.GetViewerCount();
	}

	@OriginalMember(owner = "client!vv", name = "dn", descriptor = "(IIII)V")
	public static void method32414(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		aLinkedList8.addLast(new Class619(arg0, arg1, arg2 - arg0, arg3 - arg1));
	}

	@OriginalMember(owner = "client!vv", name = "df", descriptor = "(IIII)V")
	public static void method32415(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		aLinkedList8.addLast(new Class619(arg0, arg1, arg2 - arg0, arg3 - arg1));
	}

	@OriginalMember(owner = "client!vv", name = "dw", descriptor = "(IIII)V")
	public static void method32416(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		aLinkedList8.addLast(new Class619(arg0, arg1, arg2 - arg0, arg3 - arg1));
	}

	@OriginalMember(owner = "client!vv", name = "ds", descriptor = "([ILjava/util/LinkedList;IIF)V")
	static void method32417(@OriginalArg(0) int[] arg0, @OriginalArg(1) LinkedList arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4) {
		if (arg1.isEmpty()) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < arg1.size(); local5++) {
			@Pc(14) Class619 local14 = (Class619) arg1.get(local5);
			@Pc(25) int local25 = (int) (arg4 * (float) (local14.anInt5803 * 1589474487)) + arg2;
			@Pc(36) int local36 = arg3 + (int) (arg4 * (float) (local14.anInt5802 * -1870406831));
			@Pc(45) int local45 = (int) ((float) (local14.anInt5804 * 112047587) * arg4);
			@Pc(54) int local54 = (int) (arg4 * (float) (local14.anInt5801 * 574149811));
			if (local25 < Class314.anInt4104 * 1161430833 && local36 < Class17.anInt60 * -1559495963) {
				if (local45 + local25 > Class314.anInt4104 * 1161430833) {
					local45 = Class314.anInt4104 * 1161430833 - local25;
				}
				if (local54 + local36 > Class17.anInt60 * -1559495963) {
					local54 = Class17.anInt60 * -1559495963 - local36;
				}
				for (@Pc(94) int local94 = local36; local94 < local36 + local54; local94++) {
					@Pc(107) int local107 = local25 + local94 * 1161430833 * Class314.anInt4104;
					Arrays.fill(arg0, local107, local45 + local107, -16777216);
				}
			}
		}
	}

	@OriginalMember(owner = "client!vv", name = "ib", descriptor = "(Lclient!yf;I)V")
	static void method32418(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32986(local12, 1358812496);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class281.method26555(local16, local22, arg0, 1982931620);
	}

	@OriginalMember(owner = "client!vv", name = "ka", descriptor = "(Lclient!yf;B)V")
	static void method32419(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class28.method602(local11, local14, arg0, (byte) -60);
	}

	@OriginalMember(owner = "client!vv", name = "zl", descriptor = "(Lclient!yf;I)V")
	static void method32420(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		if (client.anInt3572 * 825168203 == 2 && local12 < client.anInt3444 * 862418793) {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = client.aClass281Array1[local12].anInt3935 * 1928339871;
		} else {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 0;
		}
	}

	@OriginalMember(owner = "client!vv", name = "n", descriptor = "(IB)I")
	static int method32421(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		if (arg0 < 4) {
			return 0;
		} else if (arg0 < 10) {
			return arg0 - 3;
		} else {
			return arg0 - 6;
		}
	}

	@OriginalMember(owner = "client!vv", name = "ls", descriptor = "(Ljava/lang/String;B)V")
	public static void method32422(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) {
		if (arg0 == null) {
			return;
		}
		@Pc(7) String local7 = Class82.method1385(arg0, client.aClass83_10, (byte) 1);
		if (local7 == null) {
			return;
		}
		for (@Pc(12) int local12 = 0; local12 < client.anInt3444 * 862418793; local12++) {
			@Pc(21) Class281 local21 = client.aClass281Array1[local12];
			@Pc(24) String local24 = local21.aString159;
			@Pc(29) String local29 = Class82.method1385(local24, client.aClass83_10, (byte) 1);
			if (Class32_Sub10.method17017(arg0, local7, local24, local29, 1889339199)) {
				client.anInt3444 -= -948139815;
				for (@Pc(42) int local42 = local12; local42 < client.anInt3444 * 862418793; local42++) {
					client.aClass281Array1[local42] = client.aClass281Array1[local42 + 1];
				}
				client.anInt3547 = client.anInt3565 * -541355657;
				@Pc(64) Class175 local64 = Class330.method27465(-1534093073);
				@Pc(70) Class93_Sub22 local70 = Class102.method2592(Class446.aClass446_37, local64.aClass24_2, (byte) 5);
				local70.aClass93_Sub41_Sub2_1.method22522(Class46.method894(arg0, -1997823666), (byte) -105);
				local70.aClass93_Sub41_Sub2_1.method22414(arg0, -1783139557);
				local64.method24363(local70, -1947881956);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!vv", name = "jv", descriptor = "(Lclient!yf;I)V")
	static void method32423(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6052 -= -1915563430;
	}

	@OriginalMember(owner = "client!vv", name = "<init>", descriptor = "()V")
	Class625() throws Throwable {
		throw new Error();
	}
}
