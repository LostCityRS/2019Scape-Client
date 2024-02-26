package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!asa")
public final class PacketBit extends Packet {

	@OriginalMember(owner = "client!asa", name = "k", descriptor = "[I")
	static final int[] anIntArray275 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!asa", name = "s", descriptor = "Lclient!aav;")
	Class22 aClass22_3;

	@OriginalMember(owner = "client!asa", name = "x", descriptor = "I")
	int anInt3088;

	@OriginalMember(owner = "client!asa", name = "<init>", descriptor = "(I)V")
	public PacketBit(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!asa", name = "kw", descriptor = "()I")
	public int method22552() {
		@Pc(21) int local21 = this.data[(this.pos += 1034180571) * -1380987821 - 1] - this.aClass22_3.method535(-1369291680) & 0xFF;
		return local21 < 128 ? local21 : (local21 - 128 << 8) + (this.data[(this.pos += 1034180571) * -1380987821 - 1] - this.aClass22_3.method535(-1369291680) & 0xFF);
	}

	@OriginalMember(owner = "client!asa", name = "js", descriptor = "(II)V")
	public void method22553(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) (arg0 + this.aClass22_3.method535(-1369291680));
	}

	@OriginalMember(owner = "client!asa", name = "ki", descriptor = "(Lclient!aav;)V")
	public void method22554(@OriginalArg(0) Class22 arg0) {
		this.aClass22_3 = arg0;
	}

	@OriginalMember(owner = "client!asa", name = "jg", descriptor = "(I)Z")
	public boolean method22555(@OriginalArg(0) int arg0) {
		@Pc(14) int local14 = this.data[this.pos * -1380987821] - this.aClass22_3.method536((byte) -68) & 0xFF;
		return local14 >= 128;
	}

	@OriginalMember(owner = "client!asa", name = "jf", descriptor = "(I)I")
	public int method22556(@OriginalArg(0) int arg0) {
		@Pc(21) int local21 = this.data[(this.pos += 1034180571) * -1380987821 - 1] - this.aClass22_3.method535(-1369291680) & 0xFF;
		return local21 < 128 ? local21 : (local21 - 128 << 8) + (this.data[(this.pos += 1034180571) * -1380987821 - 1] - this.aClass22_3.method535(-1369291680) & 0xFF);
	}

	@OriginalMember(owner = "client!asa", name = "ja", descriptor = "([BIII)V")
	public void method22557(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(1) int local1 = 0; local1 < arg2; local1++) {
			arg0[local1 + arg1] = (byte) (this.data[(this.pos += 1034180571) * -1380987821 - 1] - this.aClass22_3.method535(-1369291680));
		}
	}

	@OriginalMember(owner = "client!asa", name = "kv", descriptor = "(Lclient!aav;)V")
	public void method22558(@OriginalArg(0) Class22 arg0) {
		this.aClass22_3 = arg0;
	}

	@OriginalMember(owner = "client!asa", name = "jc", descriptor = "(II)I")
	public int method22559(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) int local6 = this.anInt3088 * -1289374837 >> 3;
		@Pc(15) int local15 = 8 - (this.anInt3088 * -1289374837 & 0x7);
		@Pc(17) int local17 = 0;
		this.anInt3088 += arg0 * -263726045;
		while (arg0 > local15) {
			local17 += (this.data[local6++] & anIntArray275[local15]) << arg0 - local15;
			arg0 -= local15;
			local15 = 8;
		}
		if (arg0 == local15) {
			local17 += this.data[local6] & anIntArray275[local15];
		} else {
			local17 += this.data[local6] >> local15 - arg0 & anIntArray275[arg0];
		}
		return local17;
	}

	@OriginalMember(owner = "client!asa", name = "ji", descriptor = "(I)V")
	public void method22560(@OriginalArg(0) int arg0) {
		this.anInt3088 = this.pos * 1831475912;
	}

	@OriginalMember(owner = "client!asa", name = "ku", descriptor = "(IB)I")
	public int method22561(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return arg0 * 8 - this.anInt3088 * -1289374837;
	}

	@OriginalMember(owner = "client!asa", name = "kb", descriptor = "([BII)V")
	public void method22562(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < arg2; local1++) {
			arg0[local1 + arg1] = (byte) (this.data[(this.pos += 1034180571) * -1380987821 - 1] - this.aClass22_3.method535(-1369291680));
		}
	}

	@OriginalMember(owner = "client!asa", name = "kr", descriptor = "(Lclient!aav;)V")
	public void method22563(@OriginalArg(0) Class22 arg0) {
		this.aClass22_3 = arg0;
	}

	@OriginalMember(owner = "client!asa", name = "je", descriptor = "(Lclient!aav;I)V")
	public void method22564(@OriginalArg(0) Class22 arg0, @OriginalArg(1) int arg1) {
		this.aClass22_3 = arg0;
	}

	@OriginalMember(owner = "client!asa", name = "ke", descriptor = "(I)V")
	public void method22565(@OriginalArg(0) int arg0) {
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) (arg0 + this.aClass22_3.method535(-1369291680));
	}

	@OriginalMember(owner = "client!asa", name = "kx", descriptor = "()I")
	public int method22566() {
		return this.data[(this.pos += 1034180571) * -1380987821 - 1] - this.aClass22_3.method535(-1369291680) & 0xFF;
	}

	@OriginalMember(owner = "client!asa", name = "kh", descriptor = "()I")
	public int method22567() {
		return this.data[(this.pos += 1034180571) * -1380987821 - 1] - this.aClass22_3.method535(-1369291680) & 0xFF;
	}

	@OriginalMember(owner = "client!asa", name = "jp", descriptor = "(I)V")
	public void method22568(@OriginalArg(0) int arg0) {
		this.pos = (this.anInt3088 * -1289374837 + 7) / 8 * 1034180571;
	}

	@OriginalMember(owner = "client!asa", name = "kp", descriptor = "()Z")
	public boolean method22569() {
		@Pc(14) int local14 = this.data[this.pos * -1380987821] - this.aClass22_3.method536((byte) -2) & 0xFF;
		return local14 >= 128;
	}

	@OriginalMember(owner = "client!asa", name = "jb", descriptor = "(S)I")
	public int method22570(@OriginalArg(0) short arg0) {
		return this.data[(this.pos += 1034180571) * -1380987821 - 1] - this.aClass22_3.method535(-1369291680) & 0xFF;
	}

	@OriginalMember(owner = "client!asa", name = "kg", descriptor = "()I")
	public int method22571() {
		@Pc(21) int local21 = this.data[(this.pos += 1034180571) * -1380987821 - 1] - this.aClass22_3.method535(-1369291680) & 0xFF;
		return local21 < 128 ? local21 : (local21 - 128 << 8) + (this.data[(this.pos += 1034180571) * -1380987821 - 1] - this.aClass22_3.method535(-1369291680) & 0xFF);
	}

	@OriginalMember(owner = "client!asa", name = "kk", descriptor = "()Z")
	public boolean method22572() {
		@Pc(14) int local14 = this.data[this.pos * -1380987821] - this.aClass22_3.method536((byte) -83) & 0xFF;
		return local14 >= 128;
	}

	@OriginalMember(owner = "client!asa", name = "ks", descriptor = "()V")
	public void method22573() {
		this.anInt3088 = this.pos * 1831475912;
	}

	@OriginalMember(owner = "client!asa", name = "kl", descriptor = "(I)I")
	public int method22574(@OriginalArg(0) int arg0) {
		@Pc(6) int local6 = this.anInt3088 * -1289374837 >> 3;
		@Pc(15) int local15 = 8 - (this.anInt3088 * -1289374837 & 0x7);
		@Pc(17) int local17 = 0;
		this.anInt3088 += arg0 * -263726045;
		while (arg0 > local15) {
			local17 += (this.data[local6++] & anIntArray275[local15]) << arg0 - local15;
			arg0 -= local15;
			local15 = 8;
		}
		if (arg0 == local15) {
			local17 += this.data[local6] & anIntArray275[local15];
		} else {
			local17 += this.data[local6] >> local15 - arg0 & anIntArray275[arg0];
		}
		return local17;
	}

	@OriginalMember(owner = "client!asa", name = "kj", descriptor = "()V")
	public void method22575() {
		this.pos = (this.anInt3088 * -1289374837 + 7) / 8 * 1034180571;
	}

	@OriginalMember(owner = "client!asa", name = "kf", descriptor = "()V")
	public void method22576() {
		this.pos = (this.anInt3088 * -1289374837 + 7) / 8 * 1034180571;
	}

	@OriginalMember(owner = "client!asa", name = "kt", descriptor = "(I)I")
	public int method22577(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt3088 * -1289374837;
	}

	@OriginalMember(owner = "client!asa", name = "kq", descriptor = "(I)I")
	public int method22578(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt3088 * -1289374837;
	}

	@OriginalMember(owner = "client!asa", name = "ka", descriptor = "(I)I")
	public int method22579(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt3088 * -1289374837;
	}
}
