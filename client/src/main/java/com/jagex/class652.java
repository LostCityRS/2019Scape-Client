package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("xj")
public class class652 implements class53 {

	@ObfuscatedName("xj.e")
	public final class651 field7962;

	@ObfuscatedName("xj.n")
	public int field7963;

	@ObfuscatedName("xj.m")
	public int field7964;

	@ObfuscatedName("xj.k")
	public int field7965;

	public class652(int arg0, class651 arg1) {
		this.field7962 = arg1;
	}

	@ObfuscatedName("xj.e(Lalw;B)V")
	public void method976(class997 arg0) {
		while (true) {
			int var2 = arg0.method17904();
			if (var2 == 0) {
				return;
			}
			this.method10303(arg0, var2);
		}
	}

	@ObfuscatedName("xj.u(Lalw;II)V")
	public void method10303(class997 arg0, int arg1) {
		if (arg1 == 1) {
			this.field7963 = arg0.method17927();
		} else if (arg1 == 2) {
			this.field7964 = arg0.method17904();
			this.field7965 = arg0.method17904();
		}
	}

	@ObfuscatedName("xj.z(I)Lde;")
	public synchronized class136 method10302() {
		class136 var1 = (class136) this.field7962.field7959.method2930((long) this.field7963);
		if (var1 != null) {
			return var1;
		}
		class136 var2 = class111.method1609(this.field7962.field7960, this.field7963, 0);
		if (var2 != null) {
			this.field7962.field7959.method2921(var2, (long) this.field7963);
		}
		return var2;
	}

	@ObfuscatedName("xj.n(I)V")
	public void method975() {
	}
}
