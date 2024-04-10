package com.jagex.js5.network;

import com.jagex.core.io.Packet;
import com.jagex.js5.Js5Request;
import deob.ObfuscatedName;

@ObfuscatedName("auq")
public class Js5NetRequest extends Js5Request {

	@ObfuscatedName("auq.p")
	public Packet buf;

	@ObfuscatedName("auq.d")
	public byte offset;

	@ObfuscatedName("auq.e(I)[B")
	public byte[] getBytes() {
		if (this.incomplete || this.buf.pos < this.buf.data.length - this.offset) {
			throw new RuntimeException("Not ready!");
		}

		return this.buf.data;
	}

	@ObfuscatedName("auq.n(I)I")
	public int getPercentageComplete() {
		return this.buf == null ? 0 : this.buf.pos / (this.buf.data.length - this.offset);
	}
}
