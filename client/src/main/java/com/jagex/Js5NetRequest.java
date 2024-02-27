package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aun")
public final class Js5NetRequest extends Class80_Sub1_Sub15 {

	@OriginalMember(owner = "client!aun", name = "as", descriptor = "I")
	public static int anInt3293;

	@OriginalMember(owner = "client!aun", name = "a", descriptor = "B")
	byte trailerLen;

	@OriginalMember(owner = "client!aun", name = "j", descriptor = "Lclient!ald;")
	Packet packet;

	@OriginalMember(owner = "client!aun", name = "<init>", descriptor = "()V")
	Js5NetRequest() {
	}

	@OriginalMember(owner = "client!aun", name = "t", descriptor = "(I)[B")
	@Override
	byte[] getData(@OriginalArg(0) int arg0) {
		if (this.incomplete || this.packet.pos * -1380987821 < this.packet.data.length - this.trailerLen) {
			throw new RuntimeException();
		}
		return this.packet.data;
	}

	@OriginalMember(owner = "client!aun", name = "u", descriptor = "()[B")
	@Override
	byte[] method24392() {
		if (this.incomplete || this.packet.pos * -1380987821 < this.packet.data.length - this.trailerLen) {
			throw new RuntimeException();
		}
		return this.packet.data;
	}

	@OriginalMember(owner = "client!aun", name = "f", descriptor = "(I)I")
	@Override
	int method24391(@OriginalArg(0) int arg0) {
		return this.packet == null ? 0 : this.packet.pos * -659828628 / (this.packet.data.length - this.trailerLen);
	}

	@OriginalMember(owner = "client!aun", name = "e", descriptor = "()[B")
	@Override
	byte[] method24389() {
		if (this.incomplete || this.packet.pos * -1380987821 < this.packet.data.length - this.trailerLen) {
			throw new RuntimeException();
		}
		return this.packet.data;
	}

	@OriginalMember(owner = "client!aun", name = "l", descriptor = "()I")
	@Override
	int method24393() {
		return this.packet == null ? 0 : this.packet.pos * -659828628 / (this.packet.data.length - this.trailerLen);
	}
}
