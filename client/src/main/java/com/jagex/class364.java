package com.jagex;

import deob.ObfuscatedName;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("mb")
public class class364 {

	@ObfuscatedName("mb.e")
	public Map field3417 = new HashMap();

	@ObfuscatedName("mb.n")
	public class366 field3418;

	public class364(class366 arg0) {
		this.field3418 = arg0;
	}

	@ObfuscatedName("mb.e(I)V")
	public void method5849() {
		Iterator var1 = this.field3417.values().iterator();
		while (var1.hasNext()) {
			class369 var2 = (class369) var1.next();
			var2.method5900();
		}
	}

	@ObfuscatedName("mb.n(IIFLma;I)Lmj;")
	public class369 method5848(int arg0, int arg1, float arg2, class368 arg3) {
		if (this.method5851(arg0) != null) {
			return null;
		}
		class369 var5 = null;
		if (arg1 != -1) {
			var5 = this.method5851(arg1);
		}
		Object var6 = this.field3418.method5866(var5);
		class369 var7 = new class369(arg0, arg2, var6, this, arg3, var5);
		this.field3417.put(arg0, var7);
		return var7;
	}

	@ObfuscatedName("mb.m(IB)Lmj;")
	public class369 method5851(int arg0) {
		return (class369) this.field3417.get(arg0);
	}
}
