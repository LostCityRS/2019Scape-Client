package com.jagex;

import deob.ObfuscatedName;

import java.util.Stack;

@ObfuscatedName("tl")
public class class552 {

	@ObfuscatedName("tl.e")
	public static Stack field6979 = new Stack();

	@ObfuscatedName("tl.n")
	public class1019 field6978;

	@ObfuscatedName("tl.m")
	public boolean field6977;

	@ObfuscatedName("tl.k")
	public class548 field6980;

	@ObfuscatedName("ahe.e(ZI)Ltl;")
	public static class552 method16749(boolean arg0) {
		Stack var1 = field6979;
		synchronized (field6979) {
			class552 var2;
			if (field6979.isEmpty()) {
				var2 = new class552();
			} else {
				var2 = (class552) field6979.pop();
			}
			var2.field6977 = arg0;
			return var2;
		}
	}

	@ObfuscatedName("tl.k(Ldh;III)Z")
	public boolean method8889(class133 arg0, int arg1, int arg2) {
		int var4 = this.field6978.method18371();
		if (this.field6978.field11713 != null) {
			for (int var5 = 0; var5 < this.field6978.field11713.length; var5++) {
				this.field6978.field11713[var5].field1687 <<= var4;
				if (this.field6978.field11713[var5].method2742(this.field6980.field6886 + arg1, this.field6980.field6887 + arg2) && this.field6978.method17375(arg0, arg1, arg2)) {
					this.field6978.field11713[var5].field1687 >>= var4;
					return true;
				}
				this.field6978.field11713[var5].field1687 >>= var4;
			}
		}
		return false;
	}
}
