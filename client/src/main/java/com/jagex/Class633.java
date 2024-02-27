package com.jagex;

import java.util.Queue;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wc")
public final class Class633 {

	@OriginalMember(owner = "client!wc", name = "ff", descriptor = "Lclient!py;")
	public static Class497 aClass497_137;

	@OriginalMember(owner = "client!wc", name = "e", descriptor = "I")
	public int anInt5886 = -6838107;

	@OriginalMember(owner = "client!wc", name = "n", descriptor = "I")
	public int anInt5885 = -1053266949;

	@OriginalMember(owner = "client!wc", name = "w", descriptor = "(B)V")
	public static void method32484(@OriginalArg(0) byte arg0) {
		@Pc(2) Queue local2 = Class655.aQueue3;
		synchronized (Class655.aQueue3) {
			while (true) {
				@Pc(7) Class93_Sub23_Sub2 local7 = (Class93_Sub23_Sub2) Class655.aQueue3.poll();
				if (local7 == null) {
					return;
				}
				local7.method22889((byte) -79);
			}
		}
	}

	@OriginalMember(owner = "client!wc", name = "m", descriptor = "(Ljava/lang/CharSequence;I)Z")
	public static boolean method32485(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) int arg1) {
		return Class93_Sub9.method13154(arg0, 10, true, -1563806134);
	}

	@OriginalMember(owner = "client!wc", name = "by", descriptor = "(Lclient!yf;I)V")
	static void method32486(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32986(local12, 1127057995);
		Class577.method31538(local16, arg0, -1508905117);
	}

	@OriginalMember(owner = "client!wc", name = "bbv", descriptor = "(Lclient!yf;B)V")
	static void method32487(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt6052 -= 1189701933;
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 0;
	}

	@OriginalMember(owner = "client!wc", name = "bw", descriptor = "(IIII)Lclient!akl;")
	static Class93_Sub22 method32488(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) Class93_Sub22 local1 = null;
		if (arg2 == 0) {
			local1 = Class102.method2592(Class446.aClass446_107, client.aClass175_2.aClass24_2, (byte) 101);
		}
		if (arg2 == 1) {
			local1 = Class102.method2592(Class446.aClass446_70, client.aClass175_2.aClass24_2, (byte) 43);
		}
		@Pc(22) Class611 local22 = client.aClass532_1.method30624(1811251602);
		local1.aClass93_Sub41_Sub2_1.method22466(arg1 + local22.anInt5785 * -1994307635, 2136457997);
		local1.aClass93_Sub41_Sub2_1.method22522(Class28.method601(1440469475) ? 1 : 0, (byte) -82);
		local1.aClass93_Sub41_Sub2_1.method22468(local22.anInt5784 * 270611681 + arg0, (short) 255);
		Class172.anInt3179 = arg0 * 2004084007;
		Class172.anInt3174 = arg1 * -246739717;
		Class172.aBoolean522 = false;
		Class723.method37124(603445051);
		return local1;
	}

	@OriginalMember(owner = "client!wc", name = "e", descriptor = "(B)[Lclient!zg;")
	public static Class704[] method32489(@OriginalArg(0) byte arg0) {
		return new Class704[] { Class704.aClass704_2, Class704.aClass704_6, Class704.aClass704_5, Class704.aClass704_4, Class704.aClass704_3 };
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(Lclient!yf;S)V")
	static void method32490(@OriginalArg(0) Class681 arg0, @OriginalArg(1) short arg1) {
		arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = ((Class347) Class288.aClass55_Sub2_1.method18273(arg0.anIntArray521[arg0.anInt6052 * -1497248091 - 2], 590791293)).aStringArray30[arg0.anIntArray521[arg0.anInt6052 * -1497248091 - 1]];
		arg0.anInt6052 -= -1915563430;
	}

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(Lclient!py;)V")
	public Class633(@OriginalArg(0) Class497 arg0) {
		@Pc(15) byte[] local15 = arg0.method30240(Class649.aClass649_10.anInt5956 * -51136173, (byte) 38);
		this.method32480(new Class93_Sub41(local15), 1868036314);
	}

	@OriginalMember(owner = "client!wc", name = "e", descriptor = "(Lclient!alw;I)V")
	void method32480(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(3) int local3 = arg0.method22425((short) 16384);
			switch(local3) {
				case 0:
					return;
				case 1:
					this.anInt5886 = arg0.method22448(-43527878) * 6838107;
					this.anInt5885 = arg0.method22448(-11331444) * 1053266949;
					break;
				default:
					return;
			}
		}
	}

	@OriginalMember(owner = "client!wc", name = "k", descriptor = "(Lclient!alw;)V")
	void method32481(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22425((short) 16384);
			switch(local3) {
				case 0:
					return;
				case 1:
					this.anInt5886 = arg0.method22448(-771342481) * 6838107;
					this.anInt5885 = arg0.method22448(-835178155) * 1053266949;
					break;
				default:
					return;
			}
		}
	}

	@OriginalMember(owner = "client!wc", name = "m", descriptor = "(Lclient!alw;)V")
	void method32482(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22425((short) 16384);
			switch(local3) {
				case 0:
					return;
				case 1:
					this.anInt5886 = arg0.method22448(-1933547126) * 6838107;
					this.anInt5885 = arg0.method22448(-1324206958) * 1053266949;
					break;
				default:
					return;
			}
		}
	}

	@OriginalMember(owner = "client!wc", name = "n", descriptor = "(Lclient!alw;)V")
	void method32483(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22425((short) 16384);
			switch(local3) {
				case 0:
					return;
				case 1:
					this.anInt5886 = arg0.method22448(-1813371893) * 6838107;
					this.anInt5885 = arg0.method22448(-2136963461) * 1053266949;
					break;
				default:
					return;
			}
		}
	}
}
