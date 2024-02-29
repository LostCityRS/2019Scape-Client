package com.jagex;

import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!am")
public class Class165 {

	@OriginalMember(owner = "client!am", name = "aa", descriptor = "I")
	public static int anInt2067;

	@OriginalMember(owner = "client!am", name = "ul", descriptor = "I")
	static int anInt2068;

	@OriginalMember(owner = "client!am", name = "m", descriptor = "[B")
	volatile byte[] aByteArray44;

	@OriginalMember(owner = "client!am", name = "n", descriptor = "Z")
	volatile boolean aBoolean364;

	@OriginalMember(owner = "client!am", name = "e", descriptor = "Ljava/net/URL;")
	final URL anURL1;

	@OriginalMember(owner = "client!am", name = "<init>", descriptor = "(Ljava/net/URL;)V", line = 82)
	Class165(@OriginalArg(0) URL arg0) {
		this.anURL1 = arg0;
	}

	@OriginalMember(owner = "client!am", name = "f", descriptor = "()Z", line = 87)
	boolean method15311() {
		return this.aBoolean364;
	}

	@OriginalMember(owner = "client!am", name = "m", descriptor = "()Z", line = 87)
	boolean method15312() {
		return this.aBoolean364;
	}

	@OriginalMember(owner = "client!am", name = "k", descriptor = "()Z", line = 87)
	boolean method15313() {
		return this.aBoolean364;
	}

	@OriginalMember(owner = "client!am", name = "e", descriptor = "(I)Z", line = 87)
	boolean method15314(@OriginalArg(0) int arg0) {
		return this.aBoolean364;
	}

	@OriginalMember(owner = "client!am", name = "f", descriptor = "(I)V", line = 89)
	public static void method15315(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = client.aClass532_1.method30459(182359137);
		@Pc(7) int local7 = client.aClass532_1.method30466((short) 128);
		Class690.aBooleanArrayArray15 = new boolean[local3 >> 3][local7 >> 3];
	}

	@OriginalMember(owner = "client!am", name = "n", descriptor = "(I)[B", line = 91)
	byte[] method15316(@OriginalArg(0) int arg0) {
		return this.aByteArray44;
	}

	@OriginalMember(owner = "client!am", name = "w", descriptor = "()[B", line = 91)
	byte[] method15317() {
		return this.aByteArray44;
	}

	@OriginalMember(owner = "client!am", name = "l", descriptor = "()[B", line = 91)
	byte[] method15318() {
		return this.aByteArray44;
	}

	@OriginalMember(owner = "client!am", name = "u", descriptor = "()[B", line = 91)
	byte[] method15319() {
		return this.aByteArray44;
	}

	@OriginalMember(owner = "client!am", name = "p", descriptor = "(Lclient!uh;III)V", line = 307)
	public static void method15320(@OriginalArg(0) Class155 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Class681 local2 = Class96.method2324(362248239);
		Class346.method27566(arg0, arg1, arg2, local2, 1677070776);
	}

	@OriginalMember(owner = "client!am", name = "bfw", descriptor = "(Lclient!yf;I)V", line = 15172)
	static final void method15321(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= 1189701933;
	}
}
