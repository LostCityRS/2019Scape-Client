package com.jagex;

import jaclib.ping.Ping;
import java.net.InetAddress;
import java.net.UnknownHostException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!t")
public final class Class566 implements Runnable {

	@OriginalMember(owner = "client!t", name = "bf", descriptor = "Lclient!yy;")
	public static Class697 aClass697_1;

	@OriginalMember(owner = "client!t", name = "t", descriptor = "Ljava/lang/String;")
	String aString225;

	@OriginalMember(owner = "client!t", name = "f", descriptor = "Ljava/net/InetAddress;")
	InetAddress anInetAddress2;

	@OriginalMember(owner = "client!t", name = "e", descriptor = "J")
	volatile long aLong396 = 3445504824656545065L;

	@OriginalMember(owner = "client!t", name = "u", descriptor = "Z")
	volatile boolean aBoolean915 = true;

	@OriginalMember(owner = "client!t", name = "m", descriptor = "(Lclient!ub;IILclient!sc;B)V")
	public static void method31503(@OriginalArg(0) Class158 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Interface60 arg3, @OriginalArg(4) byte arg4) {
		@Pc(2) Class690 local2 = Class677.method33596(-2011055140);
		local2.anInterface60_1 = arg3;
		Class388.method28635(arg0, arg1, arg2, local2, (short) 2903);
		local2.anInterface60_1 = null;
	}

	@OriginalMember(owner = "client!t", name = "ags", descriptor = "(Lclient!yp;I)V")
	static void method31504(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(18) Class43 local18 = (Class43) Class25.aClass41_Sub9_1.method18054(local12, -374005459);
		if (local18.anInt155 * 1882600249 >= 0 && local18.anInt156 * -330302317 >= 0) {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local18.anInt156 * -330302317;
		} else {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local12;
		}
	}

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "()V")
	Class566() {
	}

	@OriginalMember(owner = "client!t", name = "q", descriptor = "()V")
	public void method31484() {
		while (this.aBoolean915) {
			this.method31487(735960466);
		}
	}

	@OriginalMember(owner = "client!t", name = "t", descriptor = "(Ljava/lang/String;I)V")
	void method31485(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString225 = arg0;
		this.anInetAddress2 = null;
		this.aLong396 = 3445504824656545065L;
		if (this.aString225 != null) {
			try {
				this.anInetAddress2 = InetAddress.getByName(this.aString225);
			} catch (@Pc(18) UnknownHostException local18) {
			}
		}
	}

	@OriginalMember(owner = "client!t", name = "f", descriptor = "(B)J")
	long method31486(@OriginalArg(0) byte arg0) {
		return this.aLong396 * -468960492499773209L;
	}

	@OriginalMember(owner = "client!t", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean915) {
			this.method31487(-1211581752);
		}
	}

	@OriginalMember(owner = "client!t", name = "u", descriptor = "(I)V")
	void method31487(@OriginalArg(0) int arg0) {
		if (this.anInetAddress2 != null) {
			try {
				@Pc(7) byte[] local7 = this.anInetAddress2.getAddress();
				this.aLong396 = (long) Ping.t(local7[0], local7[1], local7[2], local7[3], 10000L) * -3445504824656545065L;
			} catch (@Pc(28) Throwable local28) {
			}
		}
		Class217.method25866(1000L);
	}

	@OriginalMember(owner = "client!t", name = "l", descriptor = "(Ljava/lang/String;)V")
	void method31488(@OriginalArg(0) String arg0) {
		this.aString225 = arg0;
		this.anInetAddress2 = null;
		this.aLong396 = 3445504824656545065L;
		if (this.aString225 != null) {
			try {
				this.anInetAddress2 = InetAddress.getByName(this.aString225);
			} catch (@Pc(18) UnknownHostException local18) {
			}
		}
	}

	@OriginalMember(owner = "client!t", name = "g", descriptor = "(Ljava/lang/String;)V")
	void method31489(@OriginalArg(0) String arg0) {
		this.aString225 = arg0;
		this.anInetAddress2 = null;
		this.aLong396 = 3445504824656545065L;
		if (this.aString225 != null) {
			try {
				this.anInetAddress2 = InetAddress.getByName(this.aString225);
			} catch (@Pc(18) UnknownHostException local18) {
			}
		}
	}

	@OriginalMember(owner = "client!t", name = "h", descriptor = "()V")
	public void method31490() {
		while (this.aBoolean915) {
			this.method31487(276798089);
		}
	}

	@OriginalMember(owner = "client!t", name = "i", descriptor = "(Ljava/lang/String;)V")
	void method31491(@OriginalArg(0) String arg0) {
		this.aString225 = arg0;
		this.anInetAddress2 = null;
		this.aLong396 = 3445504824656545065L;
		if (this.aString225 != null) {
			try {
				this.anInetAddress2 = InetAddress.getByName(this.aString225);
			} catch (@Pc(18) UnknownHostException local18) {
			}
		}
	}

	@OriginalMember(owner = "client!t", name = "o", descriptor = "(Ljava/lang/String;)V")
	void method31492(@OriginalArg(0) String arg0) {
		this.aString225 = arg0;
		this.anInetAddress2 = null;
		this.aLong396 = 3445504824656545065L;
		if (this.aString225 != null) {
			try {
				this.anInetAddress2 = InetAddress.getByName(this.aString225);
			} catch (@Pc(18) UnknownHostException local18) {
			}
		}
	}

	@OriginalMember(owner = "client!t", name = "j", descriptor = "()J")
	long method31493() {
		return this.aLong396 * -468960492499773209L;
	}

	@OriginalMember(owner = "client!t", name = "s", descriptor = "()J")
	long method31494() {
		return this.aLong396 * -468960492499773209L;
	}

	@OriginalMember(owner = "client!t", name = "r", descriptor = "()V")
	void method31495() {
		this.aBoolean915 = false;
	}

	@OriginalMember(owner = "client!t", name = "k", descriptor = "()V")
	void method31496() {
		this.aBoolean915 = false;
	}

	@OriginalMember(owner = "client!t", name = "x", descriptor = "()V")
	void method31497() {
		this.aBoolean915 = false;
	}

	@OriginalMember(owner = "client!t", name = "w", descriptor = "()V")
	void method31498() {
		this.aBoolean915 = false;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "()J")
	long method31499() {
		return this.aLong396 * -468960492499773209L;
	}

	@OriginalMember(owner = "client!t", name = "m", descriptor = "(Ljava/lang/String;)V")
	void method31500(@OriginalArg(0) String arg0) {
		this.aString225 = arg0;
		this.anInetAddress2 = null;
		this.aLong396 = 3445504824656545065L;
		if (this.aString225 != null) {
			try {
				this.anInetAddress2 = InetAddress.getByName(this.aString225);
			} catch (@Pc(18) UnknownHostException local18) {
			}
		}
	}

	@OriginalMember(owner = "client!t", name = "e", descriptor = "(S)V")
	void method31501(@OriginalArg(0) short arg0) {
		this.aBoolean915 = false;
	}

	@OriginalMember(owner = "client!t", name = "d", descriptor = "()V")
	void method31502() {
		if (this.anInetAddress2 != null) {
			try {
				@Pc(7) byte[] local7 = this.anInetAddress2.getAddress();
				this.aLong396 = (long) Ping.t(local7[0], local7[1], local7[2], local7[3], 10000L) * -3445504824656545065L;
			} catch (@Pc(28) Throwable local28) {
			}
		}
		Class217.method25866(1000L);
	}
}
