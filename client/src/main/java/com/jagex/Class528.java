package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!re")
public class Class528 {

	@OriginalMember(owner = "client!re", name = "e", descriptor = "I")
	public final int anInt5229;

	@OriginalMember(owner = "client!re", name = "n", descriptor = "I")
	public final int anInt5227;

	@OriginalMember(owner = "client!re", name = "m", descriptor = "I")
	public final int anInt5228;

	@OriginalMember(owner = "client!re", name = "k", descriptor = "I")
	public final int anInt5226;

	@OriginalMember(owner = "client!re", name = "<init>", descriptor = "()V", line = 12)
	Class528() {
		this.anInt5229 = ((int) (Math.random() * 4.0D) + 32) * -1583350643;
		this.anInt5227 = ((int) (Math.random() * 2.0D) + 3) * -490271159;
		this.anInt5228 = ((int) (Math.random() * 3.0D) + 16) * 1327867683;
		if (Class51.aClass93_Sub36_1.aClass166_Sub14_1.method15656(-1287736392) == 1) {
			this.anInt5226 = (int) (Math.random() * 6.0D) * -1838044391;
		} else {
			this.anInt5226 = (int) (Math.random() * 12.0D) * -1838044391;
		}
	}

	@OriginalMember(owner = "client!re", name = "<init>", descriptor = "(IIII)V", line = 20)
	Class528(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5229 = arg0 * -1583350643;
		this.anInt5227 = arg1 * -490271159;
		this.anInt5228 = arg2 * 1327867683;
		this.anInt5226 = arg3 * -1838044391;
	}

	@OriginalMember(owner = "client!re", name = "l", descriptor = "(B)I", line = 94)
	public static int method30392(@OriginalArg(0) byte arg0) {
		if (Class625.anInt5696 * 908241389 == 3) {
			return -1;
		} else if (Class625.anInt5696 * 908241389 == 0) {
			if (Class625.aStringArray33 == null) {
				if (Class527.aString222.startsWith("mac ")) {
					if (Class527.aString224.startsWith("ppc")) {
						Class625.anInt5696 = -2024909905;
						return -1;
					}
					Class625.aStringArray33 = new String[3];
					Class625.aStringArray33[0] = "sdk-mac-dynamic";
					Class625.aStringArray33[1] = "twitchsdk";
					Class625.aStringArray33[2] = "twitchtv";
					Class625.aBooleanArray33 = new boolean[3];
					Class625.aBooleanArray33[0] = false;
					Class625.aBooleanArray33[1] = false;
					Class625.aBooleanArray33[2] = true;
				} else if (Class527.aString222.startsWith("win")) {
					Class625.aStringArray33 = new String[6];
					Class625.aStringArray33[0] = "avutil-ttv-51";
					Class625.aStringArray33[1] = "libmp3lame-ttv";
					Class625.aStringArray33[2] = "swresample-ttv-0";
					Class625.aStringArray33[5] = "twitchtv";
					if (Class527.aString224.startsWith("amd64") || Class527.aString224.startsWith("x86_64")) {
						Class625.aStringArray33[3] = "libmfxsw64";
						Class625.aStringArray33[4] = "twitchsdk_64_release";
					} else if (Class527.aString224.startsWith("i386") || Class527.aString224.startsWith("i486") || Class527.aString224.startsWith("i586") || Class527.aString224.startsWith("x86")) {
						Class625.aStringArray33[3] = "libmfxsw32";
						Class625.aStringArray33[4] = "twitchsdk_32_release";
					} else {
						Class625.anInt5696 = -2024909905;
						return -1;
					}
					Class625.aBooleanArray33 = new boolean[6];
					Class625.aBooleanArray33[0] = true;
					Class625.aBooleanArray33[1] = true;
					Class625.aBooleanArray33[2] = true;
					Class625.aBooleanArray33[3] = false;
					Class625.aBooleanArray33[4] = true;
					Class625.aBooleanArray33[5] = true;
				} else {
					Class625.anInt5696 = -2024909905;
					return -1;
				}
			}
			Class625.anInt5696 = 756685797;
			return 0;
		} else {
			return Class625.anInt5693 * 662624607;
		}
	}

	@OriginalMember(owner = "client!re", name = "bz", descriptor = "(II)Z", line = 1921)
	static boolean method30393(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 59 || arg0 == 2 || arg0 == 8 || arg0 == 17 || arg0 == 15 || arg0 == 16 || arg0 == 58;
	}

	@OriginalMember(owner = "client!re", name = "ob", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;B)V", line = 7572)
	static final void method30394(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) byte arg3) {
		@Pc(13) String local13 = (String) arg2.anObjectArray45[(arg2.anInt5888 -= 957530791) * 587908375];
		@Pc(18) int[] local18 = Class532.method30597(local13, arg2, 1518522314);
		if (local18 != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray21 = Class499.method30149(local13, arg2, -1078700915);
		arg0.anIntArray379 = local18;
		arg0.aBoolean680 = true;
	}

	@OriginalMember(owner = "client!re", name = "abw", descriptor = "(Lclient!yf;I)V", line = 9819)
	static final void method30395(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		if (client.aString146 == null || local12 >= Class623.anInt5682 * 1581594575) {
			arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = "";
		} else {
			arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = Class93_Sub1_Sub2.aClass170Array1[local12].aString91;
		}
	}

	@OriginalMember(owner = "client!re", name = "ajq", descriptor = "(Lclient!yf;I)V", line = 11443)
	static final void method30396(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		throw new RuntimeException("");
	}
}
