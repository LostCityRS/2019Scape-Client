package com.jagex;

import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!adv")
public class Class91 {

	@OriginalMember(owner = "client!adv", name = "e", descriptor = "Ljava/util/zip/Inflater;")
	Inflater anInflater1;

	@OriginalMember(owner = "client!adv", name = "<init>", descriptor = "()V", line = 10)
	public Class91() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!adv", name = "<init>", descriptor = "(III)V", line = 13)
	Class91(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!adv", name = "e", descriptor = "([BI)[B", line = 16)
	public byte[] method1703(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class93_Sub41 local4 = new Class93_Sub41(arg0);
		local4.anInt3070 = (arg0.length - 4) * -1445626955;
		@Pc(16) int local16 = local4.method22485((byte) -94);
		@Pc(19) byte[] local19 = new byte[local16];
		local4.anInt3070 = 0;
		this.method1705(local4, local19, (short) 1043);
		return local19;
	}

	@OriginalMember(owner = "client!adv", name = "m", descriptor = "([B)[B", line = 16)
	public byte[] method1704(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class93_Sub41 local4 = new Class93_Sub41(arg0);
		local4.anInt3070 = (arg0.length - 4) * -1445626955;
		@Pc(16) int local16 = local4.method22485((byte) -125);
		@Pc(19) byte[] local19 = new byte[local16];
		local4.anInt3070 = 0;
		this.method1705(local4, local19, (short) 1043);
		return local19;
	}

	@OriginalMember(owner = "client!adv", name = "n", descriptor = "(Lclient!alw;[BS)V", line = 26)
	public void method1705(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) short arg2) {
		if (arg0.aByteArray58[arg0.anInt3070 * 212851357] != 31 || arg0.aByteArray58[arg0.anInt3070 * 212851357 + 1] != -117) {
			throw new RuntimeException("");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg0.aByteArray58, arg0.anInt3070 * 212851357 + 10, arg0.aByteArray58.length - (arg0.anInt3070 * 212851357 + 10 + 8));
			this.anInflater1.inflate(arg1);
		} catch (@Pc(64) Exception local64) {
			this.anInflater1.reset();
			throw new RuntimeException("");
		}
		this.anInflater1.reset();
	}

	@OriginalMember(owner = "client!adv", name = "o", descriptor = "(IIIZI)I", line = 210)
	public static int method1706(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		if (arg0 != 0 && (arg0 < 50 || arg0 > 100)) {
			arg0 = 0;
		}
		if (arg1 != 0 && (arg1 < 50 || arg1 > 100)) {
			arg1 = 0;
		}
		@Pc(24) boolean local24 = Class527.aString222.startsWith("mac");
		@Pc(38) int[] local38 = Class166_Sub13.aTwitchTV1.GetRecommendedSettings(Class553.anInt3408 * -1378711501, Class553.anInt3416 * 2091353777, arg0, 2000, arg2, Class625.aFloat337, local24);
		if (local38[0] != 0) {
			return local38[0];
		}
		@Pc(50) int local50 = local38[1];
		@Pc(54) int local54 = local38[2];
		@Pc(58) int local58 = local38[3];
		@Pc(60) int local60 = local58;
		Class625.aLong292 = 0L;
		Class314.aLong258 = (long) (1000.0F / (float) arg2) * -8879586755579799459L;
		Class314.anInt4063 = local50 * -674500143;
		Class17.anInt60 = local54 * -1530383635;
		if (arg1 != 0) {
			local58 = arg1 * local58 / 100;
		}
		Class314.method26939("Stream - Input: " + Class553.anInt3408 * -1378711501 + "x" + Class553.anInt3416 * 2091353777 + " (" + local60 + "kbps)" + " => " + "Output: " + local50 + "x" + local54 + " [" + (arg0 == 0 ? "auto" : arg0 + "%") + "] (" + local58 + "kbps [" + (arg1 == 0 ? "auto" : arg1 + "%") + "])", -2098003940);
		return Class166_Sub13.aTwitchTV1.StartStreaming(local50, local54, arg2, local58, arg1 != 0, Class625.aFloat337, Class625.anInt5699 * -473071333, arg3);
	}

	@OriginalMember(owner = "client!adv", name = "v", descriptor = "(Lclient!asc;ILclient!yf;I)V", line = 356)
	static void method1707(@OriginalArg(0) Class93_Sub1_Sub13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) int arg3) {
		arg2.anInt5891 = 0;
		arg2.anInt5888 = 0;
		arg2.anInt5889 = -2047914607;
		arg2.aClass93_Sub1_Sub13_1 = arg0;
		arg2.aClass560Array2 = arg2.aClass93_Sub1_Sub13_1.aClass560Array1;
		arg2.anIntArray520 = arg2.aClass93_Sub1_Sub13_1.anIntArray259;
		@Pc(23) Class560 local23 = null;
		arg2.anInt5890 = 0;
		arg2.aMap26.clear();
		arg2.aMap26.put(Class138.aClass138_65, Class624.aClass120_1.aClass647_1);
		arg2.aMap26.put(Class138.aClass138_63, Class596.aClass113_Sub1_1);
		arg2.aMap26.put(Class138.aClass138_71, Class637.aClass113_1);
		if (arg2.aClass386_3 != null) {
			arg2.aMap26.put(Class138.aClass138_68, Class27.method591(arg2.aClass386_3, -1398644273));
		}
		if (arg2.aClass132_Sub1_Sub1_Sub1_4 instanceof Class132_Sub1_Sub1_Sub1_Sub1) {
			arg2.aMap26.put(Class138.aClass138_67, arg2.aClass132_Sub1_Sub1_Sub1_4.anInterface20_3);
		}
		if (arg2.aClass132_Sub1_Sub1_Sub1_4 instanceof Class132_Sub1_Sub1_Sub1_Sub2) {
			arg2.aMap25.put(Class138.aClass138_65, arg2.aClass132_Sub1_Sub1_Sub1_4.anInterface20_3);
		}
		if (Class557.aClass297_1 != null) {
			arg2.aMap26.put(Class138.aClass138_70, Class557.aClass297_1.method26653(-1808813098));
		}
		boolean var9 = false;
		label130: {
			try {
				var9 = true;
				Class687.anInt5909 = 0;
				while (true) {
					Class687.anInt5909 += -1713809907;
					if (Class687.anInt5909 * 412739781 > arg1) {
						throw new RuntimeException("");
					}
					local23 = arg2.aClass560Array2[(arg2.anInt5889 += 2047914607) * -709694321];
					if (Class687.aBoolean877 && (Class687.aString240 == null || arg2.aClass93_Sub1_Sub13_1.aString106 != null && arg2.aClass93_Sub1_Sub13_1.aString106.indexOf(Class687.aString240) != -1)) {
						System.out.println(arg2.aClass93_Sub1_Sub13_1.aString106 + ": " + local23);
					}
					if (arg2.anIntArray520[arg2.anInt5889 * -709694321] == 1) {
						arg2.aBoolean875 = true;
					} else {
						arg2.aBoolean875 = false;
					}
					if (Class560.aClass560_788 == local23 && arg2.anInt5890 * -272305733 == 0) {
						var9 = false;
						break label130;
					}
					Class696.method36643(local23, arg2, 359964894);
				}
			} catch (@Pc(190) Exception local190) {
				Class361.method27803(arg2, local23, local190, "S", 433817837);
				var9 = false;
			} finally {
				if (var9) {
					Class624.method32157((byte) -49);
				}
			}
			Class624.method32157((byte) -40);
			return;
		}
		Class624.method32157((byte) -87);
	}

	@OriginalMember(owner = "client!adv", name = "t", descriptor = "(I)Z", line = 880)
	static boolean method1708(@OriginalArg(0) int arg0) {
		return Class454.anInt5042 * -1838307953 > 0;
	}

	@OriginalMember(owner = "client!adv", name = "arc", descriptor = "(Lclient!yf;B)V", line = 12936)
	static final void method1709(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class411.anInt4744 * 992431719;
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class411.anInt4720 * 794342433;
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class411.anInt4752 * 655884651;
		Class411.anInt4744 = -741595822;
		Class411.anInt4720 = 318517279;
		Class411.anInt4752 = 384687293;
	}

	@OriginalMember(owner = "client!adv", name = "ayo", descriptor = "(Lclient!yf;I)V", line = 14027)
	static final void method1710(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) int local2 = Class314.method26938(1054716290);
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = (Class166_Sub12.anInt2143 = Class51.aClass93_Sub36_1.aClass166_Sub4_2.method15426((byte) 87) * 1038066943) * -2067309825;
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local2;
		Class275.method26341(1118364760);
		client.aClass532_1.method30533((byte) 0);
		Class106_Sub1.method5135(1368867977);
		client.aBoolean601 = false;
	}
}
