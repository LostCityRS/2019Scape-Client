package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ase")
public class PacketBit extends Packet {

	@OriginalMember(owner = "client!ase", name = "r", descriptor = "[I")
	static final int[] BITMASK = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!ase", name = "c", descriptor = "Lclient!aav;")
	Class24 random;

	@OriginalMember(owner = "client!ase", name = "v", descriptor = "I")
	int bitPos;

	@OriginalMember(owner = "client!ase", name = "<init>", descriptor = "(I)V", line = 11)
	public PacketBit(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ase", name = "jg", descriptor = "(Lclient!aav;B)V", line = 15)
	public void setRandom(@OriginalArg(0) Class24 arg0, @OriginalArg(1) byte arg1) {
		this.random = arg0;
	}

	@OriginalMember(owner = "client!ase", name = "jx", descriptor = "(II)V", line = 19)
	public void p1opcode(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.data[(this.pos += -1445626955) * 212851357 - 1] = (byte) (arg0 + this.random.nextInt(565430542));
	}

	@OriginalMember(owner = "client!ase", name = "jh", descriptor = "(I)I", line = 23)
	public int g1opcode(@OriginalArg(0) int arg0) {
		return this.data[(this.pos += -1445626955) * 212851357 - 1] - this.random.nextInt(565430542) & 0xFF;
	}

	@OriginalMember(owner = "client!ase", name = "jp", descriptor = "(I)Z", line = 27)
	public boolean method22673(@OriginalArg(0) int arg0) {
		@Pc(14) int local14 = this.data[this.pos * 212851357] - this.random.peekInt(1070614472) & 0xFF;
		return local14 >= 128;
	}

	@OriginalMember(owner = "client!ase", name = "jk", descriptor = "(I)I", line = 33)
	public int method22677(@OriginalArg(0) int arg0) {
		@Pc(21) int local21 = this.data[(this.pos += -1445626955) * 212851357 - 1] - this.random.nextInt(565430542) & 0xFF;
		return local21 < 128 ? local21 : (local21 - 128 << 8) + (this.data[(this.pos += -1445626955) * 212851357 - 1] - this.random.nextInt(565430542) & 0xFF);
	}

	@OriginalMember(owner = "client!ase", name = "kw", descriptor = "([BIII)V", line = 39)
	public void method22679(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(1) int local1 = 0; local1 < arg2; local1++) {
			arg0[arg1 + local1] = (byte) (this.data[(this.pos += -1445626955) * 212851357 - 1] - this.random.nextInt(565430542));
		}
	}

	@OriginalMember(owner = "client!ase", name = "kz", descriptor = "(B)V", line = 43)
	public void accessBits(@OriginalArg(0) byte arg0) {
		this.bitPos = this.pos * -664548008;
	}

	@OriginalMember(owner = "client!ase", name = "ke", descriptor = "(II)I", line = 47)
	public int gBit(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) int local6 = this.bitPos * 1626146007 >> 3;
		@Pc(15) int local15 = 8 - (this.bitPos * 1626146007 & 0x7);
		@Pc(17) int local17 = 0;
		this.bitPos += arg0 * 1552821991;
		while (arg0 > local15) {
			local17 += (this.data[local6++] & BITMASK[local15]) << arg0 - local15;
			arg0 -= local15;
			local15 = 8;
		}
		if (local15 == arg0) {
			local17 += this.data[local6] & BITMASK[local15];
		} else {
			local17 += this.data[local6] >> local15 - arg0 & BITMASK[arg0];
		}
		return local17;
	}

	@OriginalMember(owner = "client!ase", name = "kq", descriptor = "(I)V", line = 62)
	public void accessBytes(@OriginalArg(0) int arg0) {
		this.pos = (this.bitPos * 1626146007 + 7) / 8 * -1445626955;
	}

	@OriginalMember(owner = "client!ase", name = "kg", descriptor = "(II)I", line = 66)
	public int bitsAvailable(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 * 8 - this.bitPos * 1626146007;
	}
}
