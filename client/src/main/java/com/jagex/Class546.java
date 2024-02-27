package com.jagex;

import com.jagex.twitchtv.TwitchWebcamDevice;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sc")
public final class Class546 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!sc", name = "this$0", descriptor = "Lclient!sz;")
	final Class565 aClass565_1;

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "[S")
	short[] aShortArray131;

	@OriginalMember(owner = "client!sc", name = "n", descriptor = "[Lclient!jg;")
	Class360[] aClass360Array2;

	@OriginalMember(owner = "client!sc", name = "m", descriptor = "[Lclient!jg;")
	Class360[] aClass360Array1;

	@OriginalMember(owner = "client!sc", name = "k", descriptor = "Lclient!jg;")
	Class360 aClass360_1;

	@OriginalMember(owner = "client!sc", name = "f", descriptor = "I")
	int anInt5451;

	@OriginalMember(owner = "client!sc", name = "o", descriptor = "(S)V")
	public static void method31150(@OriginalArg(0) short arg0) {
		@Pc(2) Class240 local2 = Class658.aClass240_91;
		synchronized (Class658.aClass240_91) {
			Class658.aClass240_91.method25930(1161602830);
		}
		local2 = Class658.aClass240_92;
		synchronized (Class658.aClass240_92) {
			Class658.aClass240_92.method25930(1161602830);
		}
	}

	@OriginalMember(owner = "client!sc", name = "ar", descriptor = "(Ljava/lang/String;B)Lclient!com/jagex/twitchtv/TwitchWebcamDevice;")
	public static TwitchWebcamDevice method31151(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) {
		if (Class625.aTwitchWebcamDeviceArray1 == null) {
			return null;
		}
		for (@Pc(6) int local6 = 0; local6 < Class625.aTwitchWebcamDeviceArray1.length; local6++) {
			if (Class625.aTwitchWebcamDeviceArray1[local6].aString153.equals(arg0)) {
				return Class625.aTwitchWebcamDeviceArray1[local6];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!sc", name = "zc", descriptor = "(Lclient!yf;I)V")
	static void method31152(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt6049 -= 957530791) * 587908375];
		@Pc(27) String local27 = (String) arg0.anObjectArray45[(arg0.anInt6049 -= 957530791) * 587908375];
		@Pc(33) Class93_Sub22 local33 = Class102.method2592(Class446.aClass446_36, client.aClass175_1.aClass24_2, (byte) 65);
		local33.aClass93_Sub41_Sub2_1.method22466(Class46.method894(local13, -1746842495) + Class46.method894(local27, -1698473232), 2145656670);
		local33.aClass93_Sub41_Sub2_1.method22414(local13, 588125156);
		local33.aClass93_Sub41_Sub2_1.method22414(local27, 1144919468);
		client.aClass175_1.method24363(local33, -1898577141);
	}

	@OriginalMember(owner = "client!sc", name = "ayp", descriptor = "(Lclient!yf;B)V")
	static void method31153(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(1) String local1 = null;
		if (Class120.aClass499_1 != null) {
			local1 = Class120.aClass499_1.method30321(-549432700);
		}
		if (local1 == null) {
			local1 = "";
		}
		arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = local1;
	}

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "(Lclient!py;Lclient!xq;B)I")
	static int method31154(@OriginalArg(0) Class497 arg0, @OriginalArg(1) Class667 arg1, @OriginalArg(2) byte arg2) {
		if (arg0 == null) {
			return 0;
		} else if (arg1.method33087(-24379334) > 1) {
			@Pc(13) int local13 = arg0.method30244((byte) -51) - 1;
			return local13 * arg1.method33087(-183996470) + arg0.method30243(local13, 1566891594);
		} else {
			return arg0.method30243(arg1.anInt6010 * -1772702343, 1061627796);
		}
	}

	@OriginalMember(owner = "client!sc", name = "ayl", descriptor = "(Lclient!yf;I)V")
	static void method31155(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub40_1, 0, (byte) 114);
		Class106_Sub1.method5148(-700641211);
		client.aBoolean603 = false;
	}

	@OriginalMember(owner = "client!sc", name = "ip", descriptor = "(Lclient!yf;I)V")
	static void method31156(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32986(local12, 1296492219);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class293.method26685(local16, local22, arg0, -376853165);
	}

	@OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(Lclient!sz;)V")
	Class546(@OriginalArg(0) Class565 arg0) {
		this.aClass565_1 = arg0;
		this.aShortArray131 = new short[2];
		this.aClass360Array2 = new Class360[16];
		this.aClass360Array1 = new Class360[16];
		this.aClass360_1 = new Class360(8);
		this.anInt5451 = 0;
	}

	@OriginalMember(owner = "client!sc", name = "w", descriptor = "()V")
	void method31143() {
		Class294.method26689(this.aShortArray131, -1710573301);
		for (@Pc(5) int local5 = 0; local5 < this.anInt5451 * -309545431; local5++) {
			this.aClass360Array2[local5].method27974((byte) 48);
			this.aClass360Array1[local5].method27974((byte) 37);
		}
		this.aClass360_1.method27974((byte) 122);
	}

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "(II)V")
	void method31144(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		while (this.anInt5451 * -309545431 < arg0) {
			this.aClass360Array2[this.anInt5451 * -309545431] = new Class360(3);
			this.aClass360Array1[this.anInt5451 * -309545431] = new Class360(3);
			this.anInt5451 += -1740945895;
		}
	}

	@OriginalMember(owner = "client!sc", name = "n", descriptor = "(B)V")
	void method31145(@OriginalArg(0) byte arg0) {
		Class294.method26689(this.aShortArray131, 1731722242);
		for (@Pc(5) int local5 = 0; local5 < this.anInt5451 * -309545431; local5++) {
			this.aClass360Array2[local5].method27974((byte) 10);
			this.aClass360Array1[local5].method27974((byte) 20);
		}
		this.aClass360_1.method27974((byte) 6);
	}

	@OriginalMember(owner = "client!sc", name = "m", descriptor = "(Lclient!jp;IB)I")
	int method31146(@OriginalArg(0) Class365 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) throws IOException {
		if (arg0.method28086(this.aShortArray131, 0, 291964485) == 0) {
			return this.aClass360Array2[arg1].method27975(arg0, (byte) -4);
		}
		@Pc(16) byte local16 = 8;
		@Pc(33) int local33;
		if (arg0.method28086(this.aShortArray131, 1, 291964485) == 0) {
			local33 = local16 + this.aClass360Array1[arg1].method27975(arg0, (byte) -71);
		} else {
			local33 = local16 + 8 + this.aClass360_1.method27975(arg0, (byte) -76);
		}
		return local33;
	}

	@OriginalMember(owner = "client!sc", name = "k", descriptor = "()V")
	void method31147() {
		Class294.method26689(this.aShortArray131, -605926504);
		for (@Pc(5) int local5 = 0; local5 < this.anInt5451 * -309545431; local5++) {
			this.aClass360Array2[local5].method27974((byte) 51);
			this.aClass360Array1[local5].method27974((byte) 114);
		}
		this.aClass360_1.method27974((byte) 103);
	}

	@OriginalMember(owner = "client!sc", name = "f", descriptor = "()V")
	void method31148() {
		Class294.method26689(this.aShortArray131, -380559692);
		for (@Pc(5) int local5 = 0; local5 < this.anInt5451 * -309545431; local5++) {
			this.aClass360Array2[local5].method27974((byte) 41);
			this.aClass360Array1[local5].method27974((byte) 37);
		}
		this.aClass360_1.method27974((byte) 50);
	}

	@OriginalMember(owner = "client!sc", name = "l", descriptor = "()V")
	void method31149() {
		Class294.method26689(this.aShortArray131, -564759683);
		for (@Pc(5) int local5 = 0; local5 < this.anInt5451 * -309545431; local5++) {
			this.aClass360Array2[local5].method27974((byte) 118);
			this.aClass360Array1[local5].method27974((byte) 48);
		}
		this.aClass360_1.method27974((byte) 88);
	}
}
