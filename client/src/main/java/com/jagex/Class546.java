package com.jagex;

import com.jagex.twitchtv.TwitchWebcamDevice;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sc")
public class Class546 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!sc", name = "this$0", descriptor = "Lclient!sz;")
	final Class565 this$0;

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "[S")
	short[] aShortArray131;

	@OriginalMember(owner = "client!sc", name = "n", descriptor = "[Lclient!jg;")
	Class360[] aClass360Array2;

	@OriginalMember(owner = "client!sc", name = "m", descriptor = "[Lclient!jg;")
	Class360[] aClass360Array1;

	@OriginalMember(owner = "client!sc", name = "k", descriptor = "Lclient!jg;")
	Class360 aClass360_1;

	@OriginalMember(owner = "client!sc", name = "f", descriptor = "I")
	int anInt5290;

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "(Lclient!py;Lclient!xq;B)I", line = 12)
	static int method30962(@OriginalArg(0) Class497 arg0, @OriginalArg(1) Class667 arg1, @OriginalArg(2) byte arg2) {
		if (arg0 == null) {
			return 0;
		} else if (arg1.method32908(-24379334) > 1) {
			@Pc(13) int local13 = arg0.method30090((byte) -51) - 1;
			return local13 * arg1.method32908(-183996470) + arg0.method30084(local13, 1566891594);
		} else {
			return arg0.method30084(arg1.anInt5849 * -1772702343, 1061627796);
		}
	}

	@OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(Lclient!sz;)V", line = 174)
	Class546(@OriginalArg(0) Class565 arg0) {
		this.this$0 = arg0;
		this.aShortArray131 = new short[2];
		this.aClass360Array2 = new Class360[16];
		this.aClass360Array1 = new Class360[16];
		this.aClass360_1 = new Class360(8);
		this.anInt5290 = 0;
	}

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "(II)V", line = 177)
	void method30963(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		while (this.anInt5290 * -309545431 < arg0) {
			this.aClass360Array2[this.anInt5290 * -309545431] = new Class360(3);
			this.aClass360Array1[this.anInt5290 * -309545431] = new Class360(3);
			this.anInt5290 += -1740945895;
		}
	}

	@OriginalMember(owner = "client!sc", name = "w", descriptor = "()V", line = 184)
	void method30964() {
		Class294.method26597(this.aShortArray131, -1710573301);
		for (@Pc(5) int local5 = 0; local5 < this.anInt5290 * -309545431; local5++) {
			this.aClass360Array2[local5].method27793((byte) 48);
			this.aClass360Array1[local5].method27793((byte) 37);
		}
		this.aClass360_1.method27793((byte) 122);
	}

	@OriginalMember(owner = "client!sc", name = "n", descriptor = "(B)V", line = 184)
	void method30965(@OriginalArg(0) byte arg0) {
		Class294.method26597(this.aShortArray131, 1731722242);
		for (@Pc(5) int local5 = 0; local5 < this.anInt5290 * -309545431; local5++) {
			this.aClass360Array2[local5].method27793((byte) 10);
			this.aClass360Array1[local5].method27793((byte) 20);
		}
		this.aClass360_1.method27793((byte) 6);
	}

	@OriginalMember(owner = "client!sc", name = "k", descriptor = "()V", line = 184)
	void method30966() {
		Class294.method26597(this.aShortArray131, -605926504);
		for (@Pc(5) int local5 = 0; local5 < this.anInt5290 * -309545431; local5++) {
			this.aClass360Array2[local5].method27793((byte) 51);
			this.aClass360Array1[local5].method27793((byte) 114);
		}
		this.aClass360_1.method27793((byte) 103);
	}

	@OriginalMember(owner = "client!sc", name = "f", descriptor = "()V", line = 184)
	void method30967() {
		Class294.method26597(this.aShortArray131, -380559692);
		for (@Pc(5) int local5 = 0; local5 < this.anInt5290 * -309545431; local5++) {
			this.aClass360Array2[local5].method27793((byte) 41);
			this.aClass360Array1[local5].method27793((byte) 37);
		}
		this.aClass360_1.method27793((byte) 50);
	}

	@OriginalMember(owner = "client!sc", name = "l", descriptor = "()V", line = 184)
	void method30968() {
		Class294.method26597(this.aShortArray131, -564759683);
		for (@Pc(5) int local5 = 0; local5 < this.anInt5290 * -309545431; local5++) {
			this.aClass360Array2[local5].method27793((byte) 118);
			this.aClass360Array1[local5].method27793((byte) 48);
		}
		this.aClass360_1.method27793((byte) 88);
	}

	@OriginalMember(owner = "client!sc", name = "m", descriptor = "(Lclient!jp;IB)I", line = 193)
	int method30969(@OriginalArg(0) Class365 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) throws IOException {
		if (arg0.method27912(this.aShortArray131, 0, 291964485) == 0) {
			return this.aClass360Array2[arg1].method27794(arg0, (byte) -4);
		}
		@Pc(16) byte local16 = 8;
		@Pc(33) int local33;
		if (arg0.method27912(this.aShortArray131, 1, 291964485) == 0) {
			local33 = local16 + this.aClass360Array1[arg1].method27794(arg0, (byte) -71);
		} else {
			local33 = local16 + 8 + this.aClass360_1.method27794(arg0, (byte) -76);
		}
		return local33;
	}

	@OriginalMember(owner = "client!sc", name = "ar", descriptor = "(Ljava/lang/String;B)Lclient!com/jagex/twitchtv/TwitchWebcamDevice;", line = 504)
	public static TwitchWebcamDevice method30970(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) {
		if (Class625.aTwitchWebcamDeviceArray1 == null) {
			return null;
		}
		for (@Pc(6) int local6 = 0; local6 < Class625.aTwitchWebcamDeviceArray1.length; local6++) {
			if (Class625.aTwitchWebcamDeviceArray1[local6].e.equals(arg0)) {
				return Class625.aTwitchWebcamDeviceArray1[local6];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!sc", name = "o", descriptor = "(S)V", line = 515)
	public static void method30971(@OriginalArg(0) short arg0) {
		@Pc(2) Class240 local2 = Class658.aClass240_91;
		synchronized (Class658.aClass240_91) {
			Class658.aClass240_91.method25860(1161602830);
		}
		local2 = Class658.aClass240_92;
		synchronized (Class658.aClass240_92) {
			Class658.aClass240_92.method25860(1161602830);
		}
	}

	@OriginalMember(owner = "client!sc", name = "ip", descriptor = "(Lclient!yf;I)V", line = 6563)
	static final void method30972(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32808(local12, 1296492219);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class293.method26589(local16, local22, arg0, -376853165);
	}

	@OriginalMember(owner = "client!sc", name = "zc", descriptor = "(Lclient!yf;I)V", line = 9565)
	static final void method30973(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt5888 -= 957530791) * 587908375];
		@Pc(27) String local27 = (String) arg0.anObjectArray45[(arg0.anInt5888 -= 957530791) * 587908375];
		@Pc(33) Class93_Sub22 local33 = Class102.method2588(Class446.aClass446_36, client.aClass175_1.aClass24_2, (byte) 65);
		local33.aClass93_Sub41_Sub2_1.method22395(Class46.method895(local13, -1746842495) + Class46.method895(local27, -1698473232), 2145656670);
		local33.aClass93_Sub41_Sub2_1.method22431(local13, 588125156);
		local33.aClass93_Sub41_Sub2_1.method22431(local27, 1144919468);
		client.aClass175_1.method24356(local33, -1898577141);
	}

	@OriginalMember(owner = "client!sc", name = "ayp", descriptor = "(Lclient!yf;B)V", line = 13984)
	static final void method30974(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(1) String local1 = null;
		if (Class120.aClass499_1 != null) {
			local1 = Class120.aClass499_1.method30140(-549432700);
		}
		if (local1 == null) {
			local1 = "";
		}
		arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = local1;
	}

	@OriginalMember(owner = "client!sc", name = "ayl", descriptor = "(Lclient!yf;I)V", line = 14078)
	static final void method30975(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub40_1, 0, (byte) 114);
		Class106_Sub1.method5135(-700641211);
		client.aBoolean601 = false;
	}
}
