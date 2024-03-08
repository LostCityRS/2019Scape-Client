package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("ase")
public class PacketBit extends Packet {

	@ObfuscatedName("ase.c")
	public IsaacRandom field12426;

	@ObfuscatedName("ase.r")
	public static final int[] field12425 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@ObfuscatedName("ase.v")
	public int field12427;

	public PacketBit(int arg0) {
		super(arg0);
	}

	@ObfuscatedName("ase.jg(Laav;B)V")
	public void method19566(IsaacRandom arg0) {
		this.field12426 = arg0;
	}

	@ObfuscatedName("ase.jx(II)V")
	public void method19555(int arg0) {
		this.data[(++this.pos) - 1] = (byte) (arg0 + this.field12426.method14578());
	}

	@ObfuscatedName("ase.jh(I)I")
	public int method19558() {
		return this.data[(++this.pos) - 1] - this.field12426.method14578() & 0xFF;
	}

	@ObfuscatedName("ase.jp(I)Z")
	public boolean method19573() {
		int var1 = this.data[this.pos] - this.field12426.method14579() & 0xFF;
		return var1 >= 128;
	}

	@ObfuscatedName("ase.jk(I)I")
	public int method19560() {
		int var1 = this.data[(++this.pos) - 1] - this.field12426.method14578() & 0xFF;
		return var1 < 128 ? var1 : (var1 - 128 << 8) + (this.data[(++this.pos) - 1] - this.field12426.method14578() & 0xFF);
	}

	@ObfuscatedName("ase.kw([BIII)V")
	public void method19561(byte[] arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < arg2; var4++) {
			arg0[arg1 + var4] = (byte) (this.data[(++this.pos) - 1] - this.field12426.method14578());
		}
	}

	@ObfuscatedName("ase.kz(B)V")
	public void method19562() {
		this.field12427 = this.pos * 8;
	}

	@ObfuscatedName("ase.ke(II)I")
	public int method19583(int arg0) {
		int var2 = this.field12427 >> 3;
		int var3 = 8 - (this.field12427 & 0x7);
		int var4 = 0;
		this.field12427 += arg0;
		while (arg0 > var3) {
			var4 += (this.data[var2++] & field12425[var3]) << arg0 - var3;
			arg0 -= var3;
			var3 = 8;
		}
		int var5;
		if (arg0 == var3) {
			var5 = (this.data[var2] & field12425[var3]) + var4;
		} else {
			var5 = (this.data[var2] >> var3 - arg0 & field12425[arg0]) + var4;
		}
		return var5;
	}

	@ObfuscatedName("ase.kq(I)V")
	public void method19564() {
		this.pos = (this.field12427 + 7) / 8;
	}

	@ObfuscatedName("ase.kg(II)I")
	public int method19565(int arg0) {
		return arg0 * 8 - this.field12427;
	}
}
