package com.jagex.js5.worker;

import com.jagex.game.client.DiskStore;
import com.jagex.js5.Js5Request;
import deob.ObfuscatedName;

@ObfuscatedName("atf")
public class Js5WorkerRequest extends Js5Request {

	@ObfuscatedName("atf.r")
	public int field12559;

	@ObfuscatedName("atf.v")
	public DiskStore field12556;

	@ObfuscatedName("atf.o")
	public byte[] field12557;

	@ObfuscatedName("atf.e(I)[B")
	public byte[] method19444() {
		if (this.field12344) {
			throw new RuntimeException();
		}
		return this.field12557;
	}

	@ObfuscatedName("atf.n(I)I")
	public int method19446() {
		return this.field12344 ? 0 : 100;
	}
}