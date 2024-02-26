package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rc")
public final class Class526 {

	@OriginalMember(owner = "client!rc", name = "t", descriptor = "Lclient!rq;")
	static Interface58 anInterface58_1;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "()Z")
	public static boolean method30680() {
		return anInterface58_1 != null;
	}

	@OriginalMember(owner = "client!rc", name = "u", descriptor = "(Lclient!rq;)V")
	public static void method30681(@OriginalArg(0) Interface58 arg0) {
		if (anInterface58_1 != null) {
			throw new IllegalStateException("");
		}
		anInterface58_1 = arg0;
	}

	@OriginalMember(owner = "client!rc", name = "l", descriptor = "(Lclient!rq;)V")
	public static void method30682(@OriginalArg(0) Interface58 arg0) {
		if (anInterface58_1 != null) {
			throw new IllegalStateException("");
		}
		anInterface58_1 = arg0;
	}

	@OriginalMember(owner = "client!rc", name = "g", descriptor = "()Lclient!rq;")
	public static Interface58 method30683() {
		if (anInterface58_1 == null) {
			throw new IllegalStateException("");
		}
		return anInterface58_1;
	}

	@OriginalMember(owner = "client!rc", name = "i", descriptor = "()Lclient!rq;")
	public static Interface58 method30684() {
		if (anInterface58_1 == null) {
			throw new IllegalStateException("");
		}
		return anInterface58_1;
	}

	@OriginalMember(owner = "client!rc", name = "o", descriptor = "()Z")
	public static boolean method30685() {
		return anInterface58_1 != null;
	}

	@OriginalMember(owner = "client!rc", name = "j", descriptor = "()Z")
	public static boolean method30686() {
		return anInterface58_1 != null;
	}

	@OriginalMember(owner = "client!rc", name = "m", descriptor = "()Lclient!rq;")
	public static Interface58 method30687() {
		if (anInterface58_1 == null) {
			throw new IllegalStateException("");
		}
		return anInterface58_1;
	}

	@OriginalMember(owner = "client!rc", name = "j", descriptor = "(I)V")
	public static void method30688(@OriginalArg(0) int arg0) {
		if (!Class622.aBoolean936) {
			return;
		}
		@Pc(4) int local4 = Class669.aTwitchTV1.ShutdownTTV();
		if (local4 == 0) {
			Class669.aTwitchTV1 = null;
			Class622.aBoolean936 = false;
		}
	}

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "()V")
	Class526() throws Throwable {
		throw new Error();
	}
}
