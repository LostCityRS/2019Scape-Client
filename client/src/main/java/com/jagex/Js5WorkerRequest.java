package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!atr")
public final class Js5WorkerRequest extends Class80_Sub1_Sub15 {

	@OriginalMember(owner = "client!atr", name = "j", descriptor = "I")
	static final int anInt3254 = 1;

	@OriginalMember(owner = "client!atr", name = "s", descriptor = "I")
	static final int anInt3255 = 3;

	@OriginalMember(owner = "client!atr", name = "a", descriptor = "I")
	static final int anInt3257 = 2;

	@OriginalMember(owner = "client!atr", name = "w", descriptor = "[B")
	byte[] aByteArray63;

	@OriginalMember(owner = "client!atr", name = "k", descriptor = "I")
	int anInt3256;

	@OriginalMember(owner = "client!atr", name = "x", descriptor = "Lclient!uf;")
	Class592 aClass592_3;

	@OriginalMember(owner = "client!atr", name = "<init>", descriptor = "()V")
	Js5WorkerRequest() {
	}

	@OriginalMember(owner = "client!atr", name = "f", descriptor = "(I)I")
	@Override
	int method24391(@OriginalArg(0) int arg0) {
		return this.incomplete ? 0 : 100;
	}

	@OriginalMember(owner = "client!atr", name = "l", descriptor = "()I")
	@Override
	int method24393() {
		return this.incomplete ? 0 : 100;
	}

	@OriginalMember(owner = "client!atr", name = "e", descriptor = "()[B")
	@Override
	byte[] method24389() {
		if (this.incomplete) {
			throw new RuntimeException();
		}
		return this.aByteArray63;
	}

	@OriginalMember(owner = "client!atr", name = "t", descriptor = "(I)[B")
	@Override
	byte[] getData(@OriginalArg(0) int arg0) {
		if (this.incomplete) {
			throw new RuntimeException();
		}
		return this.aByteArray63;
	}

	@OriginalMember(owner = "client!atr", name = "u", descriptor = "()[B")
	@Override
	byte[] method24392() {
		if (this.incomplete) {
			throw new RuntimeException();
		}
		return this.aByteArray63;
	}
}
