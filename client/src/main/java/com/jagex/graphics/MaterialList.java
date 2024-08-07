package com.jagex.graphics;

import com.jagex.core.io.Packet;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;

@ObfuscatedName("df")
public class MaterialList {

	@ObfuscatedName("df.e")
	public MaterialRaw[] field1453;

	@ObfuscatedName("df.n")
	public int field1451;

	@ObfuscatedName("df.m")
	public Js5 field1452;

	@ObfuscatedName("df.k")
	public static boolean field1454 = true;

	public MaterialList(Js5 arg0) {
		this.field1452 = arg0;
		this.field1451 = arg0.getGroupCapacity(0);
		this.method2045();
	}

	@ObfuscatedName("df.e(II)Ldv;")
	public MaterialRaw get(int arg0) {
		this.method2045();
		return this.field1453[arg0];
	}

	@ObfuscatedName("df.n(I)V")
	public void method2045() {
		if (!field1454) {
			return;
		}
		field1454 = false;
		this.field1453 = new MaterialRaw[this.field1451];
		for (int var1 = 0; var1 < this.field1451; var1++) {
			Packet var2 = new Packet(this.field1452.getfile(0, var1));
			if (var2.data == null) {
				this.field1453[var1] = null;
			} else {
				try {
					MaterialRaw var3 = new MaterialRaw();
					var3.decode(var1, var2);
					this.field1453[var1] = var3;
				} catch (Exception var5) {
					this.field1453[var1] = null;
				}
			}
		}
	}
}
