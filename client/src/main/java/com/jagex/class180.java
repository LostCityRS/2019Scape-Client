package com.jagex;

import deob.ObfuscatedName;

import java.util.ArrayList;
import java.util.List;

@ObfuscatedName("fq")
public class class180 {

	// $FF: synthetic field
	public final AudioApi this$0;

	@ObfuscatedName("fq.e")
	public List field1845;

	public class180(AudioApi arg0) {
		this.this$0 = arg0;
		this.field1845 = new ArrayList();
	}

	@ObfuscatedName("fq.e(Lrw;I)V")
	public void method3110(Sound arg0) {
		this.field1845.add(arg0);
	}

	@ObfuscatedName("fq.n(Lrw;I)V")
	public void method3114(Sound arg0) {
		this.field1845.remove(arg0);
	}

	@ObfuscatedName("fq.m(B)Ljava/util/List;")
	public List method3120() {
		return this.field1845;
	}

	@ObfuscatedName("fq.k(Lrw;I)Z")
	public boolean method3113(Sound arg0) {
		return this.field1845.contains(arg0);
	}
}
