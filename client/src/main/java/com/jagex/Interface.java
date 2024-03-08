package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("hq")
public class Interface {

	@ObfuscatedName("hq.e")
	public Component[] field2151;

	@ObfuscatedName("hq.n")
	public Component[] field2152;

	@ObfuscatedName("hq.m")
	public boolean field2150;

	public Interface(boolean arg0, Component[] arg1) {
		this.field2151 = arg1;
		this.field2150 = arg0;
	}

	@ObfuscatedName("hq.e(I)[Lhf;")
	public Component[] method3923() {
		return this.field2152 == null ? this.field2151 : this.field2152;
	}

	@ObfuscatedName("hq.n(I)[Lhf;")
	public Component[] method3932() {
		if (this.field2152 == null) {
			int var1 = this.field2151.length;
			this.field2152 = new Component[var1];
			System.arraycopy(this.field2151, 0, this.field2152, 0, this.field2151.length);
		}
		return this.field2152;
	}

	@ObfuscatedName("hq.m(II)Lhf;")
	public Component method3924(int arg0) {
		if (this.field2151[0].field2158 >>> 16 != arg0 >>> 16) {
			throw new IllegalArgumentException();
		}
		return this.field2151[arg0 & 0xFFFF];
	}
}
