package com.jagex;

import jaclib.ping.Ping;
import java.net.InetAddress;
import java.net.UnknownHostException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!e")
public class Class238 implements Runnable {

	@OriginalMember(owner = "client!e", name = "e", descriptor = "Ljava/lang/String;")
	String aString152;

	@OriginalMember(owner = "client!e", name = "n", descriptor = "Ljava/net/InetAddress;")
	InetAddress anInetAddress1;

	@OriginalMember(owner = "client!e", name = "m", descriptor = "J")
	volatile long aLong248 = -1128455824284484513L;

	@OriginalMember(owner = "client!e", name = "k", descriptor = "Z")
	volatile boolean aBoolean661 = true;

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "()V", line = 14)
	Class238() {
	}

	@OriginalMember(owner = "client!e", name = "e", descriptor = "(Ljava/lang/String;I)V", line = 17)
	void method25779(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString152 = arg0;
		this.anInetAddress1 = null;
		this.aLong248 = -1128455824284484513L;
		if (this.aString152 != null) {
			try {
				this.anInetAddress1 = InetAddress.getByName(this.aString152);
			} catch (@Pc(18) UnknownHostException local18) {
			}
		}
	}

	@OriginalMember(owner = "client!e", name = "f", descriptor = "(Ljava/lang/String;)V", line = 17)
	void method25780(@OriginalArg(0) String arg0) {
		this.aString152 = arg0;
		this.anInetAddress1 = null;
		this.aLong248 = -1128455824284484513L;
		if (this.aString152 != null) {
			try {
				this.anInetAddress1 = InetAddress.getByName(this.aString152);
			} catch (@Pc(18) UnknownHostException local18) {
			}
		}
	}

	@OriginalMember(owner = "client!e", name = "u", descriptor = "()J", line = 29)
	long method25781() {
		return this.aLong248 * 6879739500665774177L;
	}

	@OriginalMember(owner = "client!e", name = "n", descriptor = "(B)J", line = 29)
	long method25782(@OriginalArg(0) byte arg0) {
		return this.aLong248 * 6879739500665774177L;
	}

	@OriginalMember(owner = "client!e", name = "w", descriptor = "()J", line = 29)
	long method25783() {
		return this.aLong248 * 6879739500665774177L;
	}

	@OriginalMember(owner = "client!e", name = "l", descriptor = "()J", line = 29)
	long method25784() {
		return this.aLong248 * 6879739500665774177L;
	}

	@OriginalMember(owner = "client!e", name = "z", descriptor = "()J", line = 29)
	long method25785() {
		return this.aLong248 * 6879739500665774177L;
	}

	@OriginalMember(owner = "client!e", name = "p", descriptor = "()J", line = 29)
	long method25786() {
		return this.aLong248 * 6879739500665774177L;
	}

	@OriginalMember(owner = "client!e", name = "d", descriptor = "()V", line = 33)
	void method25787() {
		this.aBoolean661 = false;
	}

	@OriginalMember(owner = "client!e", name = "m", descriptor = "(I)V", line = 33)
	void method25788(@OriginalArg(0) int arg0) {
		this.aBoolean661 = false;
	}

	@OriginalMember(owner = "client!e", name = "run", descriptor = "()V", line = 37)
	@Override
	public void run() {
		while (this.aBoolean661) {
			this.method25793(16711935);
		}
	}

	@OriginalMember(owner = "client!e", name = "r", descriptor = "()V", line = 37)
	public void method25789() {
		while (this.aBoolean661) {
			this.method25793(16711935);
		}
	}

	@OriginalMember(owner = "client!e", name = "c", descriptor = "()V", line = 37)
	public void method25790() {
		while (this.aBoolean661) {
			this.method25793(16711935);
		}
	}

	@OriginalMember(owner = "client!e", name = "v", descriptor = "()V", line = 37)
	public void method25791() {
		while (this.aBoolean661) {
			this.method25793(16711935);
		}
	}

	@OriginalMember(owner = "client!e", name = "o", descriptor = "()V", line = 37)
	public void method25792() {
		while (this.aBoolean661) {
			this.method25793(16711935);
		}
	}

	@OriginalMember(owner = "client!e", name = "k", descriptor = "(I)V", line = 41)
	void method25793(@OriginalArg(0) int arg0) {
		if (this.anInetAddress1 != null) {
			try {
				@Pc(6) byte[] local6 = this.anInetAddress1.getAddress();
				this.aLong248 = (long) Ping.e(local6[0], local6[1], local6[2], local6[3], 10000L) * 1128455824284484513L;
			} catch (@Pc(27) Throwable local27) {
			}
		}
		Class212.method25431(1000L);
	}

	@OriginalMember(owner = "client!e", name = "y", descriptor = "()V", line = 41)
	void method25794() {
		if (this.anInetAddress1 != null) {
			try {
				@Pc(6) byte[] local6 = this.anInetAddress1.getAddress();
				this.aLong248 = (long) Ping.e(local6[0], local6[1], local6[2], local6[3], 10000L) * 1128455824284484513L;
			} catch (@Pc(27) Throwable local27) {
			}
		}
		Class212.method25431(1000L);
	}

	@OriginalMember(owner = "client!e", name = "s", descriptor = "()V", line = 41)
	void method25795() {
		if (this.anInetAddress1 != null) {
			try {
				@Pc(6) byte[] local6 = this.anInetAddress1.getAddress();
				this.aLong248 = (long) Ping.e(local6[0], local6[1], local6[2], local6[3], 10000L) * 1128455824284484513L;
			} catch (@Pc(27) Throwable local27) {
			}
		}
		Class212.method25431(1000L);
	}

	@OriginalMember(owner = "client!e", name = "o", descriptor = "(Lclient!yf;I)V", line = 75)
	static void method25796(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[arg0.anInt5891 * -1497248091 - 2] = ((Class347) Class288.aClass55_Sub2_1.method18261(arg0.anIntArray519[arg0.anInt5891 * -1497248091 - 2], 1506735470)).method27601(Class624.aClass120_1, arg0.anIntArray519[arg0.anInt5891 * -1497248091 - 1], (byte) -16) ? 1 : 0;
		arg0.anInt5891 -= 1189701933;
	}

	@OriginalMember(owner = "client!e", name = "p", descriptor = "(ZI)V", line = 341)
	public static void method25797(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		Class51.options.method14363(Class51.options.aClass166_Sub15_1, 1, (byte) 54);
		Class51.options.method14363(Class51.options.aClass166_Sub15_2, 1, (byte) 72);
		Class51.options.method14363(Class51.options.aClass166_Sub3_1, 0, (byte) 45);
		Class51.options.method14363(Class51.options.aClass166_Sub2_1, 0, (byte) 110);
		Class51.options.method14363(Class51.options.aClass166_Sub46_1, 0, (byte) 110);
		Class51.options.method14363(Class51.options.aClass166_Sub36_1, 0, (byte) 114);
		Class51.options.method14363(Class51.options.aClass166_Sub25_1, 0, (byte) 46);
		Class51.options.method14363(Class51.options.aClass166_Sub21_1, 0, (byte) 33);
		Class51.options.method14363(Class51.options.aClass166_Sub8_1, 0, (byte) 54);
		Class51.options.method14363(Class51.options.aClass166_Sub14_1, 0, (byte) 125);
		Class51.options.method14363(Class51.options.aClass166_Sub19_1, 0, (byte) 81);
		Class51.options.method14363(Class51.options.aClass166_Sub20_1, 0, (byte) 16);
		Class51.options.method14363(Class51.options.aClass166_Sub39_2, 0, (byte) 14);
		Class51.options.method14363(Class51.options.antialiasing, 0, (byte) 91);
		Class51.options.method14363(Class51.options.aClass166_Sub6_1, 0, (byte) 121);
		Class51.options.method14363(Class51.options.aClass166_Sub12_1, Class332.aClass332_6.anInt4147 * 595334117, (byte) 59);
		Class51.options.method14363(Class51.options.aClass166_Sub28_1, 0, (byte) 68);
		if (Class694.aClass104_14 != null && Class694.aClass104_14.method20639() && Class694.aClass104_14.method20622()) {
			Class694.aClass104_14.method20645();
		}
		Class51.options.method14363(Class51.options.aClass166_Sub29_1, 0, (byte) 79);
		Class51.options.method14363(Class51.options.aClass166_Sub31_1, 0, (byte) 111);
		Class386.method28235((byte) -20);
		Class51.options.method14363(Class51.options.aClass166_Sub24_1, 2, (byte) 7);
		Class51.options.method14363(Class51.options.aClass166_Sub40_1, 1, (byte) 109);
		Class610.method32020(93204721);
		client.world.method30494((byte) 23).method33015(-2040495528);
		client.aBoolean609 = true;
	}

	@OriginalMember(owner = "client!e", name = "ag", descriptor = "(B)V", line = 649)
	public static final void method25798(@OriginalArg(0) byte arg0) {
		Class553.aClass147_2.method12691((byte) 39);
		@Pc(4) int local4;
		for (local4 = 0; local4 < 32; local4++) {
			Class553.aLongArray21[local4] = 0L;
		}
		for (local4 = 0; local4 < 32; local4++) {
			Class553.aLongArray22[local4] = 0L;
		}
		Class553.anInt3423 = 0;
	}

	@OriginalMember(owner = "client!e", name = "ku", descriptor = "(Lclient!yf;I)V", line = 6768)
	static final void method25799(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32808(local12, -599896618);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class273.method26327(local16, local22, arg0, 2027400183);
	}

	@OriginalMember(owner = "client!e", name = "wa", descriptor = "(Lclient!yf;I)V", line = 8925)
	static final void method25800(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= 463840436;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		@Pc(33) int local33 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 2];
		@Pc(43) int local43 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 3];
		@Pc(45) short local45 = 256;
		Class274.aClass258_1.method26098(Class275.aClass275_9, local13, local23, local43, Class280.aClass280_7.method26450(-998236720), Class278.aClass278_2, 0.0F, 0.0F, null, 0, local45, local33, 1283013387);
	}

	@OriginalMember(owner = "client!e", name = "apx", descriptor = "(Lclient!yf;I)V", line = 12701)
	static final void method25801(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		if (Class65.aClass123_Sub1_2.method9020((byte) -48) != Class338.aClass338_7) {
			throw new RuntimeException();
		}
		((Class25_Sub1) Class65.aClass123_Sub1_2.method9017(-1358253356)).method15972(arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091], (byte) -12);
	}

	@OriginalMember(owner = "client!e", name = "asc", descriptor = "(Lclient!yf;I)V", line = 13100)
	static final void method25802(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		Class51.options.method14363(Class51.options.aClass166_Sub35_1, arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091], (byte) 44);
		Class106_Sub1.method5135(-1545154236);
		client.aBoolean601 = false;
	}
}
