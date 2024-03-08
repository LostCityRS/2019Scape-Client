package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("auq")
public class class1230 extends class1181 {

	@ObfuscatedName("auq.p")
	public Packet field12564;

	@ObfuscatedName("auq.d")
	public byte field12565;

	@ObfuscatedName("auq.e(I)[B")
	public byte[] method19444() {
		if (this.field12344 || this.field12564.pos < this.field12564.data.length - this.field12565) {
			throw new RuntimeException();
		}
		return this.field12564.data;
	}

	@ObfuscatedName("auq.n(I)I")
	public int method19446() {
		return this.field12564 == null ? 0 : this.field12564.pos / (this.field12564.data.length - this.field12565);
	}
}
