package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!auq")
public class Class93_Sub1_Sub16_Sub3 extends Class93_Sub1_Sub16 {

	@OriginalMember(owner = "client!auq", name = "p", descriptor = "Lclient!alw;")
    Packet aPacket_13;

	@OriginalMember(owner = "client!auq", name = "d", descriptor = "B")
	byte aByte93;

	@OriginalMember(owner = "client!auq", name = "<init>", descriptor = "()V", line = 9)
	Class93_Sub1_Sub16_Sub3() {
	}

	@OriginalMember(owner = "client!auq", name = "k", descriptor = "()[B", line = 12)
	@Override
	byte[] method23982() {
		if (this.aBoolean546 || this.aPacket_13.pos * 212851357 < this.aPacket_13.data.length - this.aByte93) {
			throw new RuntimeException();
		}
		return this.aPacket_13.data;
	}

	@OriginalMember(owner = "client!auq", name = "e", descriptor = "(I)[B", line = 12)
	@Override
	byte[] method23981(@OriginalArg(0) int arg0) {
		if (this.aBoolean546 || this.aPacket_13.pos * 212851357 < this.aPacket_13.data.length - this.aByte93) {
			throw new RuntimeException();
		}
		return this.aPacket_13.data;
	}

	@OriginalMember(owner = "client!auq", name = "m", descriptor = "()[B", line = 12)
	@Override
	byte[] method23980() {
		if (this.aBoolean546 || this.aPacket_13.pos * 212851357 < this.aPacket_13.data.length - this.aByte93) {
			throw new RuntimeException();
		}
		return this.aPacket_13.data;
	}

	@OriginalMember(owner = "client!auq", name = "n", descriptor = "(I)I", line = 19)
	@Override
	int method23983(@OriginalArg(0) int arg0) {
		return this.aPacket_13 == null ? 0 : this.aPacket_13.pos * -189700780 / (this.aPacket_13.data.length - this.aByte93);
	}

	@OriginalMember(owner = "client!auq", name = "f", descriptor = "()I", line = 19)
	@Override
	int method23979() {
		return this.aPacket_13 == null ? 0 : this.aPacket_13.pos * -189700780 / (this.aPacket_13.data.length - this.aByte93);
	}

	@OriginalMember(owner = "client!auq", name = "w", descriptor = "()I", line = 19)
	@Override
	int method23984() {
		return this.aPacket_13 == null ? 0 : this.aPacket_13.pos * -189700780 / (this.aPacket_13.data.length - this.aByte93);
	}
}
