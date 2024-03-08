package com.jagex;

import deob.ObfuscatedName;

import java.util.ArrayList;
import java.util.List;

@ObfuscatedName("fo")
public class class184 {

	@ObfuscatedName("fo.n")
	public final List field1879 = new ArrayList();

	@ObfuscatedName("fo.e(I)I")
	public int method3261() {
		return this.field1879.size();
	}

	@ObfuscatedName("fo.n(II)I")
	public int method3262(int arg0) {
		for (int var2 = 0; var2 < this.field1879.size(); var2++) {
			if (((class185) this.field1879.get(var2)).field1888 == arg0) {
				return var2;
			}
		}
		return -1;
	}

	@ObfuscatedName("fo.m(II)Lfy;")
	public class185 method3263(int arg0) {
		return (class185) this.field1879.get(arg0);
	}

	@ObfuscatedName("fo.k(Lfy;I)I")
	public int method3270(class185 arg0) {
		return this.method3265(arg0, -1);
	}

	@ObfuscatedName("fo.f(Lfy;II)I")
	public int method3265(class185 arg0, int arg1) {
		if (this.field1879.size() == 5) {
			throw new RuntimeException("");
		} else if (this.method3262(arg0.field1888) == -1) {
			if (arg1 == -1) {
				arg1 = this.field1879.size();
			}
			this.field1879.add(arg1, arg0);
			return arg1;
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("fo.w(II)V")
	public void method3266(int arg0) {
		this.field1879.remove(arg0);
	}

	@ObfuscatedName("fo.l(I)V")
	public void method3273() {
		this.field1879.clear();
	}
}
