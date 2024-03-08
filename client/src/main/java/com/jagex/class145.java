package com.jagex;

import deob.ObfuscatedName;

import java.util.Comparator;

@ObfuscatedName("el")
public class class145 implements Comparator {

	// $FF: synthetic field
	public final DummySoundBackend this$0;

	public class145(DummySoundBackend arg0) {
		this.this$0 = arg0;
	}

	@ObfuscatedName("el.e(Lrq;Lrq;I)I")
	public int method2754(class480 arg0, class480 arg1) {
		float var3 = arg0.method7531();
		float var4 = arg1.method7531();
		if (var4 > var3) {
			return 1;
		} else if (var4 < var3) {
			return -1;
		} else {
			return 0;
		}
	}

	public int compare(Object arg0, Object arg1) {
		return this.method2754((class480) arg0, (class480) arg1);
	}

	public boolean equals(Object arg0) {
		return super.equals(arg0);
	}
}
