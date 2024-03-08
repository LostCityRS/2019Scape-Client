package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ObfuscatedName("adh")
public class class792 {

	@ObfuscatedName("adh.m")
	public class470 field9181;

	@ObfuscatedName("adh.k")
	public Map field9180;

	public class792(class442 arg0, int arg1, int arg2) {
		byte[] var4 = arg0.method6879(arg1, arg2 + 1);
		this.method15188(new class997(var4));
	}

	public class792(class442 arg0, int arg1) {
		byte[] var3 = arg0.method6879(arg1, 0);
		this.method15188(new class997(var3));
	}

	@ObfuscatedName("adh.e(Lalw;B)V")
	public void method15188(class997 arg0) {
		this.field9181 = (class470) class686.method1897(Statics.method7338(), arg0.method17904());
		int var2 = arg0.method18087();
		this.field9180 = new HashMap(var2);
		while (var2-- > 0) {
			Object var3 = this.field9181.method7335(arg0);
			int var4 = arg0.method18087();
			ArrayList var5 = new ArrayList();
			while (var4-- > 0) {
				int var6 = arg0.method18087();
				var5.add(var6);
			}
			this.field9180.put(var3, var5);
		}
	}

	@ObfuscatedName("adh.n(Ljava/lang/Object;I)Ljava/util/List;")
	public List method15187(Object arg0) {
		return (List) this.field9180.get(arg0);
	}
}
