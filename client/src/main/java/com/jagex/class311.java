package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("kc")
public class class311 {

	@ObfuscatedName("kc.e")
	public long field3140;

	@ObfuscatedName("kc.n")
	public long field3146 = -1L;

	@ObfuscatedName("kc.m")
	public IterableQueue field3141 = new IterableQueue();

	public class311(Packet arg0) {
		this.method5343(arg0);
	}

	@ObfuscatedName("kc.e(Lalw;I)V")
	public void method5343(Packet arg0) {
		this.field3140 = arg0.g8();
		this.field3146 = arg0.g8();
		for (int var2 = arg0.g1(); var2 != 0; var2 = arg0.g1()) {
			class980 var3;
			if (var2 == 1) {
				var3 = new class1168(this);
			} else if (var2 == 4) {
				var3 = new class1167(this);
			} else if (var2 == 3) {
				var3 = new class1166(this);
			} else if (var2 == 2) {
				var3 = new class1165(this);
			} else if (var2 == 5) {
				var3 = new class1169(this);
			} else {
				throw new RuntimeException("");
			}
			var3.method17757(arg0);
			this.field3141.method14153(var3);
		}
	}

	@ObfuscatedName("kc.n(Lakr;B)V")
	public void method5342(class979 arg0) {
		if (this.field3140 != arg0.field6760 || this.field3146 != arg0.field11395) {
			throw new RuntimeException("");
		}
		for (class980 var2 = (class980) this.field3141.method14191(); var2 != null; var2 = (class980) this.field3141.method14161()) {
			var2.method17753(arg0);
		}
		arg0.field11395++;
	}
}
