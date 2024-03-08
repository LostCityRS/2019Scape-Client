package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("kd")
public class class310 {

	@ObfuscatedName("kd.e")
	public long field3133;

	@ObfuscatedName("kd.n")
	public int field3123 = -1;

	@ObfuscatedName("kd.m")
	public class715 field3136 = new class715();

	public class310(class997 arg0) {
		this.method5331(arg0);
	}

	@ObfuscatedName("kd.e(Lalw;B)V")
	public void method5331(class997 arg0) {
		this.field3133 = arg0.method17914();
		this.field3123 = arg0.method17910();
		for (int var2 = arg0.method17904(); var2 != 0; var2 = arg0.method17904()) {
			class978 var3;
			if (var2 == 3) {
				var3 = new class1152(this);
			} else if (var2 == 1) {
				var3 = new class1151(this);
			} else if (var2 == 13) {
				var3 = new class1161(this);
			} else if (var2 == 4) {
				var3 = new class1160(this);
			} else if (var2 == 6) {
				var3 = new class1163(this);
			} else if (var2 == 5) {
				var3 = new class1156(this);
			} else if (var2 == 2) {
				var3 = new class1155(this);
			} else if (var2 == 7) {
				var3 = new class1157(this);
			} else if (var2 == 14) {
				var3 = new class1153(this);
			} else if (var2 == 8) {
				var3 = new class1162(this);
			} else if (var2 == 9) {
				var3 = new class1154(this);
			} else if (var2 == 10) {
				var3 = new class1158(this);
			} else if (var2 == 11) {
				var3 = new class1164(this);
			} else if (var2 == 12) {
				var3 = new class1159(this);
			} else {
				throw new RuntimeException("");
			}
			var3.method17726(arg0);
			this.field3136.method14153(var3);
		}
	}

	@ObfuscatedName("kd.n(Lkr;I)V")
	public void method5333(class309 arg0) {
		if (this.field3133 != arg0.field3113 || this.field3123 != arg0.field3094) {
			throw new RuntimeException("");
		}
		for (class978 var2 = (class978) this.field3136.method14191(); var2 != null; var2 = (class978) this.field3136.method14161()) {
			var2.method17727(arg0);
		}
		arg0.field3094++;
	}
}
