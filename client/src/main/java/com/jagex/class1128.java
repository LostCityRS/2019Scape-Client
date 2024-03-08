package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("aqn")
public class class1128 extends class874 {

	@ObfuscatedName("aqn.f")
	public final int field12043;

	@ObfuscatedName("aqn.w")
	public final int field12042;

	@ObfuscatedName("aqn.l")
	public final int field12044;

	public class1128(Packet arg0) {
		super(arg0);
		int var2 = arg0.g4s();
		this.field12043 = var2 >>> 16;
		this.field12042 = var2 & 0xFFFF;
		this.field12044 = arg0.g1();
	}

	@ObfuscatedName("aqn.n(I)V")
	public void method2890() {
		int var1 = this.field12043 * 512 + 256;
		int var2 = this.field12042 * 512 + 256;
		int var3 = this.field12044;
		if (var3 < 3 && client.world.method7793().method7105(this.field12043, this.field12042)) {
			var3++;
		}
		class1235 var4 = new class1235(client.world.method7743(), this.field10303, 0, this.field12044, var3, var1, client.method3660(var1, var2, this.field12044) - this.field10305, var2, this.field12043, this.field12043, this.field12042, this.field12042, this.field10304, false, 0);
		client.field10966.method14501(new class1170(var4), (long) (this.field12043 << 16 | this.field12042));
	}
}
