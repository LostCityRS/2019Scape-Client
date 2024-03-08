package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("hq")
public class class225 {

	@ObfuscatedName("hq.e")
	public class226[] field2151;

	@ObfuscatedName("hq.n")
	public class226[] field2152;

	@ObfuscatedName("hq.m")
	public boolean field2150;

	public class225(boolean arg0, class226[] arg1) {
		this.field2151 = arg1;
		this.field2150 = arg0;
	}

	@ObfuscatedName("hq.e(I)[Lhf;")
	public class226[] method3923() {
		return this.field2152 == null ? this.field2151 : this.field2152;
	}

	@ObfuscatedName("hq.n(I)[Lhf;")
	public class226[] method3932() {
		if (this.field2152 == null) {
			int var1 = this.field2151.length;
			this.field2152 = new class226[var1];
			System.arraycopy(this.field2151, 0, this.field2152, 0, this.field2151.length);
		}
		return this.field2152;
	}

	@ObfuscatedName("hq.m(II)Lhf;")
	public class226 method3924(int arg0) {
		if (this.field2151[0].field2158 >>> 16 != arg0 >>> 16) {
			throw new IllegalArgumentException();
		}
		return this.field2151[arg0 & 0xFFFF];
	}
}
