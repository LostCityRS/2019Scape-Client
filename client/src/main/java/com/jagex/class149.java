package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("ec")
public abstract class class149 implements class50 {

	@ObfuscatedName("ec.e")
	public final class455 field1702;

	@ObfuscatedName("ec.n")
	public int field1706;

	@ObfuscatedName("ec.m")
	public class463 field1704;

	@ObfuscatedName("ec.k")
	public class457 field1705 = class457.field4610;

	@ObfuscatedName("ec.f")
	public boolean field1703 = true;

	public class149(class455 arg0, int arg1) {
		this.field1702 = arg0;
		this.field1706 = arg1;
	}

	@ObfuscatedName("ec.e(Lalw;B)V")
	public void method976(class997 arg0) {
		while (true) {
			int var2 = arg0.method17904();
			if (var2 == 0) {
				return;
			}
			class148 var3 = (class148) class686.method1897(class148.method15457(), var2);
			if (var3 == null) {
				this.method2780(arg0, var2);
			} else {
				switch(var3.field1694) {
					case 0:
						this.field1703 = false;
						break;
					case 1:
						int var4 = arg0.method17904();
						this.field1704 = (class463) class686.method1897(class463.method7293(), var4);
						if (this.field1704 != null) {
							break;
						}
						throw new IllegalStateException("");
					case 2:
						arg0.method17919();
						break;
					case 3:
						class686.method1897(class456.method5925(), arg0.method17904());
						break;
					case 4:
					default:
						throw new IllegalStateException("");
					case 5:
						break;
					case 6:
						this.field1705 = (class457) class686.method1897(class457.method748(), arg0.method17904());
				}
			}
		}
	}

	@ObfuscatedName("ec.z(B)Z")
	public boolean method2781() {
		return this.field1702 != null && this.field1704 != null;
	}

	@ObfuscatedName("ec.p(B)Ljava/lang/Object;")
	public Object method2782() {
		return this.field1702.method7211(this);
	}

	@ObfuscatedName("ec.u(Lalw;IS)V")
	public abstract void method2780(class997 arg0, int arg1);
}
